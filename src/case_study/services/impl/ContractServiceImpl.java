package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.ContractService;
import case_study.utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();

    static List<Contract> contractList = new ArrayList<>();

    static Scanner input = new Scanner(System.in);


    @Override
    public void display() {
        System.out.println("-----------List contract---------------");
        contractList.forEach(System.out::println);
    }

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().getBookingSet();
        bookingQueue.addAll(bookingSet);
        bookingSet.clear();

        try {
            while (!bookingQueue.isEmpty()) {

                Booking booking = bookingQueue.poll();
                Customer customer = booking.getIdCustomer();
                System.out.println("Creating a contract for Booking: " + booking.toString());

//        Số tiền trả trước
                System.out.println("Input deposit: ");
                double deposit = Double.parseDouble(input.nextLine());
//        Chi phí
                System.out.println("Input expense: ");
                double totalPayments = Double.parseDouble(input.nextLine());

                int numberContract = 1;
                if (!contractList.isEmpty()) {
                    numberContract = contractList.size() + 1;
                }

                Contract contract = new Contract(numberContract, booking.getIdBooking(), deposit, totalPayments, customer);

                contractList.add(contract);
                readAndWriteFile.writeListContract("D:\\Codegym-bt\\Module02\\src\\case_study\\data\\contract.csv",contractList);
                System.out.println("-----Create contract success-----");
            }
            BookingServiceImpl.getBookingSet.clear();
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
    }

    @Override
    public void edit() {
        System.out.println("----------------Lists of Contract-----------------");
        contractList.forEach(System.out::println);
        System.out.print("Input number contract want to EDIT: ");
        try {
            int numberContract = Integer.parseInt(input.nextLine());
            boolean flag = true;
            while (flag) {
                for (Contract contract : contractList) {
                    if (numberContract == contract.getNumberContract()) {
                        flag = false;
                        System.out.println("-----Contract want to edit------ ");
                        System.out.println(contract);
                        System.out.println("Input deposit: ");
                        double deposit = input.nextDouble();
                        contract.setDeposit(deposit);
                        System.out.println("Input expense: ");
                        double totalPayments = input.nextDouble();
                        contract.setTotalPayments(totalPayments);
                        System.out.println("-------Edit success---------");
                    }
                }
                if (flag) {
                    System.out.println("------Number contract not Found-----");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("INPUT WRONG FORMAT");
        }
    }
}
