package com.byhi.runnel.runnelapplication.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class ConfigProperties {

    private boolean makeHistory;
    private String resourcDiv;

    public String getResourcDiv() {
        return resourcDiv;
    }

    public void setResourcDiv(String resourcDiv) {
        this.resourcDiv = resourcDiv;
    }

    public boolean isMakeHistory() {
        return makeHistory;
    }

    public void setMakeHistory(boolean makeHistory) {
        this.makeHistory = makeHistory;
    }
}
