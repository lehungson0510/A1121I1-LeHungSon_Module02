package exam_module2.models;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private double thoiHanVip;

    public BenhAnVip(){}

    public BenhAnVip(int stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, String loaiVip, double thoiHanVip) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public double getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(double thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return super.toString()+","
                + loaiVip +","
                + thoiHanVip ;

    }

    public String toString1() {
        return "BenhAnVip{" +super.toString1()+
                ", loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip=" + thoiHanVip +
                '}';
    }
}
