package case_study.models;

public class Contract {
    private int numberContract;
    private int idBooking;
    private double deposit;
    private double totalPayments;
    private Customer idCustomer;

    public Contract(){}

    public Contract(int numberContract, int idBooking, double deposit, double totalPayments, Customer idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPayments = totalPayments;
        this.idCustomer = idCustomer;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalPayments=" + totalPayments +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
