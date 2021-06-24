package OOP.QLNhanVien;

public class NVMoiRaTruong extends NhanVien{
    private int namTN;
    private String xepLoaiTN;
    private String truongTN;

    public NVMoiRaTruong() {
        super();
    }

    public NVMoiRaTruong(int namTN, String xepLoaiTN, String truongTN) {
        this.namTN = namTN;
        this.xepLoaiTN = xepLoaiTN;
        this.truongTN = truongTN;
    }

    public NVMoiRaTruong(String ID, String hoTen, String queQuan, int luongCung, int luongThuong, int namTN, String xepLoaiTN, String truongTN) {
        super(ID, hoTen, queQuan, luongCung, luongThuong);
        this.namTN = namTN;
        this.xepLoaiTN = xepLoaiTN;
        this.truongTN = truongTN;
    }

    public int getNamTN() {
        return namTN;
    }

    public void setNamTN(int namTN) {
        this.namTN = namTN;
    }

    public String getXepLoaiTN() {
        return xepLoaiTN;
    }

    public void setXepLoaiTN(String xepLoaiTN) {
        this.xepLoaiTN = xepLoaiTN;
    }

    public String getTruongTN() {
        return truongTN;
    }

    public void setTruongTN(String truongTN) {
        this.truongTN = truongTN;
    }

    @Override
    public String toString() {
        return "NVMoiRaTruong{" +
                "namTN=" + namTN +
                ", xepLoaiTN='" + xepLoaiTN + '\'' +
                ", truongTN='" + truongTN + '\'' +
                ", ID='" + ID + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                '}';
    }
}
