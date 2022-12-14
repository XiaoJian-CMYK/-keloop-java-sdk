package io.github.oneincase;

import io.github.oneincase.service.KeloopTeamService;
import io.github.oneincase.service.impl.KeloopTeamServiceIml;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class KeloopTeamTest {

    public static KeloopTeamService keloopTeamService;

    @BeforeAll
    public static void initService() {
        keloopTeamService = new KeloopTeamServiceIml(Init.getBaseService());
    }

    @Test
    public void getTeamInfoTest() {
        keloopTeamService.getTeamInfo();
    }

}
