package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;

/**
 * 快跑者团队相关接口
 */
public interface KeloopTeamService {

    /**
     * 获取 team_token 参数对应团队的基本信息
     */
    KeloopRes getTeamInfo();

}
