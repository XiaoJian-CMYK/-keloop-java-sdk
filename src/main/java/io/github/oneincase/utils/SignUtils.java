package io.github.oneincase.utils;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import cn.hutool.json.JSONUtil;
import io.github.oneincase.config.BaseConfig;
import io.github.oneincase.core.ReqBaseParams;
import io.github.oneincase.exception.ConfigException;

import java.util.List;
import java.util.Map;

/**
 * 签名工具类
 */
public class SignUtils {

    /**
     * 签名参数排除项
     */
    private static final List<String> EXCEPTION = ListUtil.of("sign", "sign_type", "key");

    /**
     * 签名
     */
    public static ReqBaseParams setSign(ReqBaseParams reqBaseParams, BaseConfig baseConfig) {
        if (StrUtil.isBlank(baseConfig.getDevSecret())) throw new ConfigException("签名密钥不能为空");
        // 1.参数过滤（剔除参数名为 sign、sign_type、key 的参数及参数值为 '' 或 null 的参数）
        Map<String, Object> filterMap = MapUtil.filter(JSONUtil.parseObj(reqBaseParams),
                r -> StrUtil.isNotBlank(r.getKey()) && !EXCEPTION.contains(r.getKey()) && !StrUtil.isBlankIfStr(r.getValue()));
        // 判断是否存在body 不存在则设置成“[]”
        if (!filterMap.containsKey("body") || filterMap.get("body") == null) filterMap.put("body", "[]");
        // 2.按照参数名第一个字符的键值 ASCII 码递增排序（字母升序排序），如果遇到相同字符则按照第二个字符的键值 ASCII 码递增排序，以此类推
        Map<String, Object> map = MapUtil.sort(filterMap);
        String signStr = MapUtil.join(map, "&", "=", false, baseConfig.getDevSecret());
        System.out.println(StrUtil.format("【==快跑者== 待签名字符串: {}】", signStr));
        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String digestHex = md5.digestHex(signStr, CharsetUtil.CHARSET_UTF_8);
        reqBaseParams.setSign(digestHex);
        System.out.println(StrUtil.format("【==快跑者== 签名成功: {}】", digestHex));
        return reqBaseParams;
    }

    /**
     * 获取签名
     */
    public static String getSign(ReqBaseParams reqBaseParams, BaseConfig baseConfig) {
        return setSign(reqBaseParams, baseConfig).getSign();
    }

}
