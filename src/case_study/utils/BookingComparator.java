package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
//        DateTimeFormatter: Định dạng để in và phân tích cú pháp các đối tượng ngày-giờ
//        DateTimeFormatter.ofPattern: Để định dạng

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getDateStar(), formatter);
        LocalDate startDate2 = LocalDate.parse(o2.getDateStar(), formatter);
        LocalDate endDate1 = LocalDate.parse(o1.getDateEnd(), formatter);
        LocalDate endDate2 = LocalDate.parse(o2.getDateEnd(), formatter);

        if (startDate1.compareTo(startDate2) > 0) {
            return 1;
        } else if (startDate1.compareTo(startDate2) < 0) {
            return -1;
        } else {
            if (endDate1.compareTo(endDate2) > 0) {
                return 1;
            } else if (endDate1.compareTo(endDate2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
