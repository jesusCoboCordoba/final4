package com.codegym.redis;

import java.math.BigDecimal;

public class Language {

        private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    private Boolean isOfficial;
        private BigDecimal percentage;

        //Getters and Setters omitted

}
