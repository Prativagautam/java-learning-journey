
package Day2OfJava;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class CalendarTool {
    int day;
    int month;
    int year;
  public CalendarTool( int day ,int month, int year){
      this.day= day;
      this.month= month;
      this.year= year;
  }
  public boolean isLeapYear(){
      return (year%4 == 0 && year % 100!=0 ) || (year% 400 ==0);
      
  }
  //get umber of days since jan1 of that year to given day
  public int daySinceJan1 (){
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear()){
            daysInMonth[1] = 29;
        }
        int totalDays = 0;
        for (int i=0 ; i<month-1 ; i++){
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        return totalDays;
}
    // Print calendar for given month and year
    public static void printMonthCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int lengthOfMonth = firstDayOfMonth.lengthOfMonth();
        DayOfWeek startDay = firstDayOfMonth.getDayOfWeek();

        System.out.printf("\n Calendar for %s %d\n", firstDayOfMonth.getMonth(), year);
        //System.out.println(" Calendar for " + firstDayOfMonth.getMonth() + " " + year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startIndex = startDay.getValue() % 7; // Convert Sunday = 0, Monday = 1, ..., Saturday = 6

        // Print leading spaces
        for (int i = 0; i < startIndex; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= lengthOfMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startIndex) % 7 == 0) {
                System.out.println(); // Line break after Saturday
            }
        }
        System.out.println();
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println(" Welcome to Java Calendar Tool!");

        while (running) {
            System.out.println("\n MENU:");
            System.out.println("1. Check Leap Year");
            System.out.println("2. Get Day of Year (days since Jan 1)");
            System.out.println("3. Print Monthly Calendar");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter day: ");
                int d = sc.nextInt();
                System.out.print("Enter month: ");
                int m = sc.nextInt();
                System.out.print("Enter year: ");
                int y = sc.nextInt();

                CalendarTool date = new CalendarTool(d, m, y);

                switch (choice) {
                    case 1:
                        System.out.println(" Leap Year: " + date.isLeapYear());
                        break;
                    case 2:
                        System.out.println(" Day of Year: " + date.daySinceJan1());
                        break;
                    case 3:
                        printMonthCalendar(y, m);
                        break;
                }
            } else if (choice == 4) {
                System.out.println(" Exiting. See you again!");
                running = false;
            } else {
                System.out.println(" Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}