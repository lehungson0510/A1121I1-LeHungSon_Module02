package exam_module2.models;

public class BenhAnThuong extends BenhAn{
    private double phiNamVien;

    public BenhAnThuong(){}

    public BenhAnThuong(int stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, double phiNamVien) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString()+ ","
                + phiNamVien ;
    }


    public String toString1() {
        return "BenhAnThuong{" + super.toString1()+
                ", phiNamVien=" + phiNamVien +
                '}';
    }
}
