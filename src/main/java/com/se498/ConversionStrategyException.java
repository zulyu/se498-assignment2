package com.se498;

public class ConversionStrategyException extends Exception {

    //TODO: Implement method(s) for unknown conversion strategy exception
    private final String locale;
    private final String reason;

    public ConversionStrategyException (String locale, String reason) {
        this.locale = locale;
        this.reason = reason;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getReason() {
        return this.reason;
    }

}
