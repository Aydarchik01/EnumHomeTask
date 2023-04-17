public enum  Week {
    MONDAY("Дүйшөмбү куну мен айтиге барам"),
    TUESDAY("Шейшемби куну мен волейбол ойнойм"),
    WEDNESDAY("Шаршемби куну мен баскетбол ойнойм"),
    THURSDAY("Бейшемби куну мен досума барам"),
    FRIDAY("Жума куну мен футбол ойнойм"),
    SATURDAY("Ишемби куну мен английскийге барам"),
    SUNDAY("Жекшемби куну мен дем алам");

    private final String weeks;
    Week(String weeks) {
        this.weeks = weeks;
    }
    Week(String s,String weeks) {
        this.weeks = weeks;
    }
    public String getWeeks() {
        return weeks;
    }

    @Override
    public String toString() {
        return weeks;
    }
}
