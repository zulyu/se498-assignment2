package com.se498;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversionCommand implements Command {

    //TODO: Implement method(s) for the command execution
    private final ConversionStrategy strategy = null;
    private final String date = null;

    public ConversionCommand(ConversionStrategy strategy, String date) {
    }

    @Override
    public Date execute() throws ParseException {
        return null;
    }
}
