import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NgayPhanCong {
    public static List<String> create7Days(LocalDate a) {
        // Set the start date
        LocalDate startDate = a;

        // Create a list to store the next 7 days
        List<String> next7Days = new ArrayList<>();

        // Format the date as "dd-MM-yyyy" and add it to the list
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        next7Days.add(startDate.format(formatter));

        // Add the next 6 days to the list
//        for (int i = 1; i < 7; i++) {
//            startDate = startDate.plusDays(1);
//            next7Days.add(startDate.format(formatter));
//        }
//        
        // Print the next 7 days
        System.out.println("Next 7 days:");
        for (String day : next7Days) {
            System.out.println(day);
        }
        return next7Days;
    }

    
    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2003, 2, 2);
        List<String> days = create7Days(b);
        for (String dayOfWeek : days) {
            System.out.println(dayOfWeek);
        }
    }
}

