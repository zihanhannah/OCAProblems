package Chap6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class NiceDates {
     public static void main(String[] args) {
//         todo MM using numbers to show month, MMM using letter to show month
         DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM DD, YYYY");
//         todo E for day of week
         DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM DD, YYYY G");
//         todo k:for military hours(clock-hour-of-am-pm(1-24) K:hour-of-am-pm(0-11), a : am-pm of day,
         DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("k:m:s A a");

         LocalDate d = LocalDate.now();
         String s = d.format(f1);

         System.out.println(s);
         System.out.println(d.format(f2));

         LocalTime t = LocalTime.now();
         System.out.println(t.format(tf1));


     }
}
