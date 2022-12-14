package io.github.oneincase.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 团队信息地址枚举
 */
@Getter
@AllArgsConstructor
public enum TeamUrlEnum {

    /**
     * 获取团队信息
     */
    GET_TEAM_INFO("https://open.keloop.cn/open/team/getTeamInfo", ReqTypeEnum.GET);

    /**
     * 请求地址
     */
    private final String url;

    /**
     * 请求类型
     */
    private final ReqTypeEnum reqTypeEnum;
}
