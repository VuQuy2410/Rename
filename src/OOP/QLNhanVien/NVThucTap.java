package OOP.QLNhanVien;

public class NVThucTap extends NhanVien{

    private String chuyenNganh;
    private int hocKi;
    private String truong;

    public NVThucTap() {
        super();
    }
    public NVThucTap(String chuyenNganh, int hocKi, String truong) {
        this.chuyenNganh = chuyenNganh;
        this.hocKi = hocKi;
        this.truong = truong;
    }

    public NVThucTap(String ID, String hoTen, String queQuan, int luongCung, int luongThuong, String chuyenNganh, int hocKi, String truong) {
        super(ID, hoTen, queQuan, luongCung, luongThuong);
        this.chuyenNganh = chuyenNganh;
        this.hocKi = hocKi;
        this.truong = truong;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getHocKi() {
        return hocKi;
    }

    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        return "NVThucTap{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", hocKi=" + hocKi +
                ", truong='" + truong + '\'' +
                ", ID='" + ID + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                '}';
    }
}
