package case_study.models;

public class Contract {
    private String numberContract;
    private String idBooking;
    private double deposit;
    private double totalPayments;
    private String idCustomer;

    public Contract(){}

    public Contract(String numberContract, String idBooking, double deposit, double totalPayments, String idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPayments = totalPayments;
        this.idCustomer = idCustomer;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
}
