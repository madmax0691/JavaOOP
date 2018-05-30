package JavaOOPHWLesson1;

//Написать метод, находящий количество дней, прошедших с дня рождения человека.
// День рождения задается в формате “YYYY-MM-DD”,
// где YYYY - год (4 цифры), MM - номер месяца (2 цифры), DD - номер дня (2 цифры).
// Примеры формата: “1972-12-28”, “2005-05-01”.
//Использовать класс java.time.LocalDate

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DaysFromBirthDateCalculator {
    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(birthDateString);
        return ChronoUnit.DAYS.between(birthDate, today);
    }
}
//16589
//4777
//
//Process finished with exit code 0