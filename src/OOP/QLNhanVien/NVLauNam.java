package OOP.QLNhanVien;

public class NVLauNam extends NhanVien{
    private int soNamKinhNghiem;
    private String kiNangChuyenMon;

    public NVLauNam() {
        super();
    }
    public NVLauNam(int soNamKinhNghiem, String kiNangChuyenMon) {
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    public NVLauNam(String ID, String hoTen, String queQuan, int luongCung, int luongThuong, int soNamKinhNghiem, String kiNangChuyenMon) {
        super(ID, hoTen, queQuan, luongCung, luongThuong);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public String getKiNangChuyenMon() {
        return kiNangChuyenMon;
    }

    public void setKiNangChuyenMon(String kiNangChuyenMon) {
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    @Override
    public String toString() {
        return "NVLauNam{" +
                "soNamKinhNghiem=" + soNamKinhNghiem +
                ", kiNangChuyenMon='" + kiNangChuyenMon + '\'' +
                ", ID='" + ID + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                '}';
    }
}
