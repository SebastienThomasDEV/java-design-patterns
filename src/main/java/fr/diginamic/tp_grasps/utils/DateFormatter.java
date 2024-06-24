package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    /** Transforme une date au format String en {@link LocalDateTime}
     * @param dateStr date au format String
     * @return LocalDateTime
     */
    public static LocalDateTime toDate(String dateStr, String pattern) {
        return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
    }
}
