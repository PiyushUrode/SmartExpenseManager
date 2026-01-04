package com.familybudget.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String getCurrentDate() {
        return LocalDate.now().format(FORMATTER);
    }
}
