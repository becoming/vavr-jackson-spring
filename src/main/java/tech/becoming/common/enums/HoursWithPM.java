package tech.becoming.common.enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public enum HoursWithPM {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11),
    TWELVE(12), ONE_PM(13), TWO_PM(14), THREE_PM(15), FOUR_PM(16), FIVE_PM(17),
    SIX_PM(18), SEVEN_PM(19), EIGHT_PM(20), NINE_PM(21), TEN_PM(22), ELEVEN_PM(23);

    private final int hour;

    HoursWithPM(int hour) {this.hour = hour;}

    public int getHourOfDay() {
        return hour;
    }

    public LocalDateTime getNow() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.of(hour, 0));
    }
}
