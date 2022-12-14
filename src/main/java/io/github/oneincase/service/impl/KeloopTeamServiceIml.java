package io.github.oneincase.service.impl;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.enums.TeamUrlEnum;
import io.github.oneincase.service.KeloopBaseService;
import io.github.oneincase.service.KeloopTeamService;

public class KeloopTeamServiceIml implements KeloopTeamService {

    private final KeloopBaseService keloopBaseService;

    public KeloopTeamServiceIml(KeloopBaseService keloopBaseService) {
        this.keloopBaseService = keloopBaseService;
    }

    @Override
    public KeloopRes getTeamInfo() {
        return keloopBaseService.http(TeamUrlEnum.GET_TEAM_INFO.getUrl(), TeamUrlEnum.GET_TEAM_INFO.getReqTypeEnum(), null);
    }

}
