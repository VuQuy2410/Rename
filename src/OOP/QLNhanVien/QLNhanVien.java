package OOP.QLNhanVien;

import OOP.QLTaiLieu2.TaiLieu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QLNhanVien {
    private ArrayList<NhanVien> nhanViens;

    public QLNhanVien() {

        nhanViens = new ArrayList<>();
        run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        int chosse = -1;
        while (chosse != 9) {
            System.out.println("Danh sach chuc nang he thong: ");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Xuat thong tin nhan vien");
            System.out.println("3. Sua thong tin nhan vien");
            System.out.println("4. Xoa thong tin nhan vien");
            System.out.println("5. Tinh luong nhan vien");
            System.out.println("6. Tim kiem nhan vien theo ID");
            System.out.println("7. Tim kiem nhan vien theo ten ( gan dung ) ");
            System.out.println("8. Tim kiem nhan vien theo que quan ( gan dung ) ");
            System.out.println("9. Thoat khoi he thong");

            boolean flag = true;
            do {
                flag = true;
                System.out.println("Nhap chuc nang he thong: ");
                chosse = scanner.nextInt();

                switch (chosse) {

                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        sua();
                        break;
                    case 4:
                        xoa();
                        break;
                    case 5:
                        tinhLuong();
                        break;
                    case 6:
                        NhanVien nhanVien = timKiem();
                        if (nhanVien != null) {
                            System.out.println("Nhan vien can tim la: " + nhanVien.toString());
                        } else {
                            System.out.println("Khong tim thay nhan vien!");
                        }
                        break;
                    case 7:
                        timKiemTheoTen();
                        break;
                    case 8:
                        timKiemTheoQueQuan();
                        break;
                    case 9:
                        break;
                    default:
                        flag = false;
                        System.out.println("Chuc nang khong hop le! Vui long nhap lai. ");
                        break;
                }

            } while (!flag);
        }

    }

    private void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Danh sach can nhap: ");
        System.out.println("1. Nhan vien lau nam");
        System.out.println("2. Nhan vien moi ra truong");
        System.out.println("3. Nhan vien thuc tap");

        int chosse = 0;
        boolean flag = true;

        do {
            flag = true;

            System.out.println("Lua chon nhan vien can nhap: ");
            chosse = scanner.nextInt();
            NhanVien nhanVien = new NhanVien();
            switch (chosse) {
                case 1:
                    nhanVien = createNhanVien();

                    System.out.println("Nhap so nam kinh nghiem: ");
                    int soNamKinhNghiem = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Nhap ki nang chuyen mon: ");
                    String kiNangChuyenMon = scanner.nextLine();

                    nhanVien = new NVLauNam(nhanVien.getID(), nhanVien.getHoTen(), nhanVien.getQueQuan(),
                            nhanVien.getLuongCung(), nhanVien.getLuongThuong(), soNamKinhNghiem, kiNangChuyenMon);

                    nhanViens.add(nhanVien);
                    break;
                case 2:

                    nhanVien = createNhanVien();

                    System.out.println("Nhap nam tot nghiep: ");
                    int namTN = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Nhap xep loai tot nghiep: ");
                    String xepLoaiTN = scanner.nextLine();

                    System.out.println("Nhap truong tot nghiep: ");
                    String truongTN = scanner.nextLine();

                    nhanVien = new NVMoiRaTruong(nhanVien.getID(), nhanVien.getHoTen(), nhanVien.getQueQuan(),
                            nhanVien.getLuongCung(), nhanVien.getLuongThuong(), namTN, xepLoaiTN, truongTN);

                    nhanViens.add(nhanVien);
                    break;
                case 3:

                    nhanVien = createNhanVien();

                    scanner.nextLine();
                    System.out.println("Nhap chuyen nganh dang hoc: ");
                    String chuyenNganh = scanner.nextLine();

                    System.out.println("Nhap hoc ki dang hoc: ");
                    int hocKi = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Nhap truong dang hoc: ");
                    String truong = scanner.nextLine();

                    nhanVien = new NVThucTap(nhanVien.getID(), nhanVien.getHoTen(), nhanVien.getQueQuan(),
                            nhanVien.getLuongCung(), nhanVien.getLuongThuong(), chuyenNganh, hocKi, truong);

                    nhanViens.add(nhanVien);

                    break;
                default:
                    flag = false;
                    System.out.println("Nhan vien vua nhap khong hop le! Vui long nhap lai.");
                    break;
            }
        } while (!flag);
    }

    private void xuat() {
        for (NhanVien nhanVien : nhanViens) {
            System.out.println(nhanVien.toString());
        }
    }

    private void sua() {
        Scanner scanner = new Scanner(System.in);

        NhanVien nhanVien = timKiem();
        boolean flag = true;
        int chosse = 0;

        if (nhanVien != null) {
            System.out.println("Danh sach cac thuoc tinh : ");
            System.out.println("1. Ho ten");
            System.out.println("2. Que quan");
            System.out.println("3. Luong cung");
            System.out.println("4. Luong thuong");

            if (nhanVien instanceof NVLauNam) {
                System.out.println("5. So nam kinh nghiem");
                System.out.println("6. Ki nang chuyen mon");

                do {
                    flag = true;
                    System.out.println("Nhap thuoc tinh can chinh sua: ");
                    chosse = scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ho ten: ");
                            nhanVien.setHoTen(scanner.nextLine());
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Nhap que quan: ");
                            nhanVien.setQueQuan(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Nhap luong cung: ");
                            nhanVien.setLuongCung(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap luong thuong: ");
                            nhanVien.setLuongThuong(scanner.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap so nam kinh nghiem: ");
                            ((NVLauNam) nhanVien).setSoNamKinhNghiem(scanner.nextInt());
                            break;
                        case 6:
                            scanner.nextLine();
                            System.out.println("Nhap ky nang chuyen mon: ");
                            ((NVLauNam) nhanVien).setKiNangChuyenMon(scanner.nextLine());
                            break;
                        default:
                            flag = false;
                            System.out.println("Thuoc tinh vua nhap khong hop le, Vui long nhap lai!");
                            break;

                    }

                    if (flag) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            } else if (nhanVien instanceof NVMoiRaTruong) {
                System.out.println("5. Nam tot nghiep");
                System.out.println("6. Xep loai tot nghiep");
                System.out.println("7. Truong tot nghiep");

                do {
                    flag = true;
                    System.out.println("Nhap thuoc tinh can chinh sua: ");
                    chosse = scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ho ten: ");
                            nhanVien.setHoTen(scanner.nextLine());
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Nhap que quan: ");
                            nhanVien.setQueQuan(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Nhap luong cung: ");
                            nhanVien.setLuongCung(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap luong thuong: ");
                            nhanVien.setLuongThuong(scanner.nextInt());
                            break;
                        case 5:
                            System.out.println("Nhap nam tot nghiep: ");
                            ((NVMoiRaTruong) nhanVien).setNamTN(scanner.nextInt());
                            break;
                        case 6:
                            scanner.nextLine();
                            System.out.println("Nhap xep loai tot nghiep: ");
                            ((NVMoiRaTruong) nhanVien).setXepLoaiTN(scanner.nextLine());
                            break;
                        case 7:
                            scanner.nextLine();
                            System.out.println("Nhap truong tot nghiep: ");
                            ((NVMoiRaTruong) nhanVien).setTruongTN(scanner.nextLine());
                            break;
                        default:
                            flag = false;
                            System.out.println("Thuoc tinh vua nhap khong hop le, Vui long nhap lai!");
                            break;

                    }

                    if (flag) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            } else if (nhanVien instanceof NVThucTap) {
                System.out.println("5. Chuyen nganh dang hoc");
                System.out.println("6. Hoc ki dang hoc");
                System.out.println("7. Truong dang hoc");

                do {
                    flag = true;
                    System.out.println("Nhap thuoc tinh can chinh sua: ");
                    chosse = scanner.nextInt();

                    switch (chosse) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Nhap ho ten: ");
                            nhanVien.setHoTen(scanner.nextLine());
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("Nhap que quan: ");
                            nhanVien.setQueQuan(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Nhap luong cung: ");
                            nhanVien.setLuongCung(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("Nhap luong thuong: ");
                            nhanVien.setLuongThuong(scanner.nextInt());
                            break;
                        case 5:
                            scanner.nextLine();
                            System.out.println("Nhap chuyen nganh dang hoc: ");
                            ((NVThucTap) nhanVien).setChuyenNganh(scanner.nextLine());
                            break;
                        case 6:

                            System.out.println("Nhap hoc ki dang hoc: ");
                            ((NVThucTap) nhanVien).setHocKi(scanner.nextInt());
                            break;
                        case 7:
                            scanner.nextLine();
                            System.out.println("Nhap truong dang hoc: ");
                            ((NVThucTap) nhanVien).setTruong(scanner.nextLine());
                            break;
                        default:
                            flag = false;
                            System.out.println("Thuoc tinh vua nhap khong hop le, Vui long nhap lai!");
                            break;

                    }

                    if (flag) {
                        System.out.println("Cap nhat thanh cong!");
                    }
                } while (!flag);

            }

        } else {
            System.out.println("ID nhan vien khong hop le!");
        }
    }

    private void xoa() {
        NhanVien nhanVien = timKiem();

        if (nhanVien != null) {
            nhanViens.remove(nhanVien);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Nha vien khong ton tai!");
        }
    }

    private void tinhLuong() {
        for (NhanVien nhanVien : nhanViens) {
            System.out.println("Luong thuc linh cua nhan vien " + nhanVien.getHoTen() + "la : "
                    + (nhanVien.getLuongCung() + nhanVien.getLuongThuong()));
        }
    }

    private NhanVien timKiem() {
        Scanner scanner = new Scanner(System.in);
        NhanVien info = new NhanVien();
        String ID = "";

        System.out.println("Nhap ID: ");
        ID = scanner.nextLine();

        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getID().trim().equals(ID.trim())) {
                info = nhanVien;
                break;
            }
        }

        return info;
    }

    private void timKiemTheoTen() {
        Scanner scanner = new Scanner(System.in);
        String hoTen = "";

        System.out.println("Nhap ten nhan vien can tim: ");
        hoTen = scanner.nextLine();

        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getHoTen().trim().contains(hoTen.trim())) {
                System.out.println(nhanVien.toString());
            }
        }
    }

    private void timKiemTheoQueQuan() {
        Scanner scanner = new Scanner(System.in);
        String queQuan = "";

        System.out.println("Nhap ten nhan vien can tim: ");
        queQuan = scanner.nextLine();

        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getQueQuan().trim().contains(queQuan.trim())) {
                System.out.println(nhanVien.toString());
            }
        }
    }


    private NhanVien createNhanVien() {
        Scanner scanner = new Scanner(System.in);

        NhanVien nhanVien = new NhanVien();

//        System.out.println("Nhap ID: ");
        nhanVien.setID(newID());

        System.out.println("Nhap ho ten: ");
        nhanVien.setHoTen(scanner.nextLine());

        System.out.println("Nhap que quan: ");
        nhanVien.setQueQuan(scanner.nextLine());

        System.out.println("Nhap luong cung: ");
        nhanVien.setLuongCung(scanner.nextInt());

        System.out.println("Nhap luong thuong: ");
        nhanVien.setLuongThuong(scanner.nextInt());

        return nhanVien;
    }

    private String newID() {
        String maxID = "NV0";

        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getID().trim().compareTo(maxID.trim()) > 0) {
                maxID = nhanVien.getID();
            }
        }

        int newID = Integer.parseInt(maxID.substring(2));
        newID += 1;

        int lenght = 8 - Integer.toString(newID).length();
        maxID = "NV";

        while (lenght > 0) {
            maxID += "0";
            lenght--;
        }

        maxID += Integer.toString(newID);

        return maxID;
    }
}
