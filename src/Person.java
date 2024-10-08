import java.util.ArrayList;

public class Person {
    public String ten;
    public int tuoi;
    public String gioiTinh;

    public Person(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten + "\nTuổi: " + tuoi + "\nGiới Tính: " + gioiTinh);
    }
}

class NhanVien extends Person {
    public String congViec;

    public NhanVien(String ten, int tuoi, String gioiTinh, String congViec) {
        super(ten, tuoi, gioiTinh);
        this.congViec = congViec;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công Việc: " + congViec);
    }
}

class CongNhan extends Person {
    public int capBac;

    public CongNhan(String ten, int tuoi, String gioiTinh, int capBac) {
        super(ten, tuoi, gioiTinh);
        this.capBac = capBac;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cấp Bậc: " + capBac);
    }
}

class KiSu extends Person {
    public String chuyenNganh;

    public KiSu(String ten, int tuoi, String gioiTinh, String chuyenNganh) {
        super(ten, tuoi, gioiTinh);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên Ngành: " + chuyenNganh);
    }
}
