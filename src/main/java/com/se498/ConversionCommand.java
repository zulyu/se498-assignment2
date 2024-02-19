package com.se498;

import java.text.SimpleDateFormat;

public class ConversionCommand implements Command {

    //TODO: Implement method(s) for the command execution
    private ConversionStrategy strategy;
    private String date;

    public ConversionCommand(ConversionStrategy strategy, String date) {
    }

    @Override
    public SimpleDateFormat execute() {
        return null;
    }
}
