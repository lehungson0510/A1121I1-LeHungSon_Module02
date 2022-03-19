package case_study.models;

public class Booking {
    private String idBooking;
    private int dateStar;
    private int dateEnd;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking(){}

    public Booking(String idBooking, int dateStar, int dateEnd, String idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.dateStar = dateStar;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDateStar() {
        return dateStar;
    }

    public void setDateStar(int dateStar) {
        this.dateStar = dateStar;
    }

    public int getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(int dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
