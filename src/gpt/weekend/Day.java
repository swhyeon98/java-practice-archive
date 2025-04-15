package gpt;

public enum Day {

    MON("monday"),
    TUE("tuesday"),
    WED("wednesday"),
    THU("thursday"),
    FRI("friday"),
    SAT("saturday"),
    SUN("sunday");
    private final String day;

    Day(String day) {
        this.day = day;
    }

    public static boolean isWeekend(String day) {
        return SAT.day.equals(day) || SUN.day.equals(day);
    }
}
