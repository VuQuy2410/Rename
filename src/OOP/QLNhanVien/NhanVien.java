package OOP.QLNhanVien;

public class NhanVien {
    protected String ID;
    protected String hoTen;
    protected String queQuan;
    protected int luongCung;
    protected int luongThuong;

    public NhanVien() {
    }

    public NhanVien(String ID, String hoTen, String queQuan, int luongCung, int luongThuong) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }
}
