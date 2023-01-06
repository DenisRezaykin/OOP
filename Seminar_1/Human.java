import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

abstract class Human implements HumanActions {
    Date birthDate;
    GenderEnum gender;
    String firstName;
    String middleName;
    String lastName;

    public Human(Date birthDate, GenderEnum gender, String firstName, String middleName, String lastName) {
        this.birthDate = birthDate;
        this.gender = gender;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public int getAge() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.birthDate);
        return calendar.get(Calendar.YEAR);
    }
}