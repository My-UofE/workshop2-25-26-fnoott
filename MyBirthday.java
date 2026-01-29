//MyBirthday
public class MyBirthday{
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int myBirthdayDate = Integer.parseInt(args[2]);

        final int DAYS_A_WEEK = 7;

        //number of days from current to birthday
        int daysUntilBirthday = myBirthdayDate - currentDate;

        //what day birthday falls on
        int birthdayWeekday = (currentDay + daysUntilBirthday) % 7 ;

        //display result
        System.out.println("Birthday falls on: " + birthdayWeekday);
    }
}