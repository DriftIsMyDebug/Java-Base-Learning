package level14;

public class Solution1319 {




    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;

        public static Month[] getWinterMonth() {
            return new Month[] {DECEMBER, JANUARY, FEBRUARY};
        }
        public static Month[] getSpringMonth() {
            return new Month[] {MARCH, APRIL,MAY};
        }
        public static Month[] getSummerMonths() {
            return new Month[]{JUNE, JULY, AUGUST};
        }

        public static Month[] getAutumnMonths() {
            return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
        }
    }
}
