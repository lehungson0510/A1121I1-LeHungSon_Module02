package case_study.models;

public class Booking {
    private int idBooking;
    private String dateStar;
    private String dateEnd;
    private Customer idCustomer;
    private Facility nameService;
    private String typeService;

    public Booking(){}

    public Booking(int idBooking, String dateStar, String dateEnd, Customer idCustomer, Facility nameService, String typeService) {
        this.idBooking = idBooking;
        this.dateStar = dateStar;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateStar() {
        return dateStar;
    }

    public void setDateStar(String dateStar) {
        this.dateStar = dateStar;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Facility getNameService() {
        return nameService;
    }

    public void setNameService(Facility nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dateStar='" + dateStar + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", idCustomer=" + idCustomer +
                ", nameService=" + nameService +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
