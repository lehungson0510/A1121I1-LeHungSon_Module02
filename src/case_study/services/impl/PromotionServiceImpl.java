package case_study.services.impl;

import case_study.models.Booking;
import case_study.services.PromotionService;
import case_study.utils.BookingComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    static Scanner input = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static Booking bookingService = new Booking();

    static BookingServiceImpl booking = new BookingServiceImpl();

    public void displayUseService(){
        bookingSet = booking.sendBooking();
        System.out.println("Input year: ");
        String year = input.nextLine();
        for(Booking set : bookingSet){
            if(set.getDateStar().contains(year)){
                System.out.println(set.getIdCustomer());
            }
        }
    }

    public void inputVoucher(){
        int voucher10 =0;
        int voucher20 =0;
        int voucher50 =0;
//        do {
//            System.out.println("Input quantity voucher 10%");
//            voucher10 = Integer.parseInt(input.nextLine());
//            System.out.println("Input quantity voucher 20%");
//            voucher20 = Integer.parseInt(input.nextLine());
//            System.out.println("Input quantity voucher 50%");
//            voucher50 = Integer.parseInt(input.nextLine());
//        } while ()

    }
    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }
}
