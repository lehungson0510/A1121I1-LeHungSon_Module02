package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator <Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
//        DateTimeFormatter: Định dạng để in và phân tích cú pháp các đối tượng ngày-giờ
//        DateTimeFormatter.ofPattern: Để định dạng

        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getDateStar(), formatter);
        return 0;
    }
}
