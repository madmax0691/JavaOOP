package JavaOOPHWLesson7.Filter;

import java.time.LocalDate;
import java.util.function.Predicate;

public class DateAfterPredicate implements Predicate<LocalDate> {
    private final LocalDate minDate;

    public DateAfterPredicate(LocalDate minDate) {
        this.minDate = minDate;
    }

    @Override
    public boolean test(LocalDate date) {
        return minDate.compareTo(date) < 0;
    }
}
