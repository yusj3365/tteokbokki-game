package com.tteokbokki.global.util;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProfileUtil {

    private final static String PROD_PROFILE = "prod";
    private final static String DEV_PROFILE = "dev";
    private final static String BETA_PROFILE = "beta";
    private final static String LOCAL_PROFILE = "local";
    private final static String CBT_PROFILE = "cbt";
    private final Environment environment;

    public boolean isProd() {
        String[] defaultProfiles = environment.getDefaultProfiles();
        return Arrays.stream(defaultProfiles).toList().contains(PROD_PROFILE);
    }

    public boolean isDev() {
        String[] defaultProfiles = environment.getDefaultProfiles();
        return Arrays.stream(defaultProfiles).toList().contains(DEV_PROFILE);
    }

    public boolean isLocal() {
        String[] defaultProfiles = environment.getDefaultProfiles();
        return Arrays.stream(defaultProfiles).toList().contains(LOCAL_PROFILE);
    }

    public boolean isBeta() {
        String[] defaultProfiles = environment.getDefaultProfiles();
        return Arrays.stream(defaultProfiles).toList().contains(BETA_PROFILE);
    }

    public boolean isCBT() {
        String[] defaultProfiles = environment.getDefaultProfiles();
        return Arrays.stream(defaultProfiles).toList().contains(CBT_PROFILE);
    }
}
