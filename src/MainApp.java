import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        QLNL quanLy = new QLNL();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin nhân lực");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Hiển thị danh sách nhân lực");
            System.out.println("0. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1: {
                    System.out.println("Chọn loại nhân lực: 1 - Nhân Viên, 2 - Công Nhân, 3 - Kĩ Sư");
                    int loai = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhập tên: ");
                    String ten = scanner.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();

                    if (loai == 1) {
                        System.out.print("Nhập công việc của nhân viên: ");
                        String congViec = scanner.nextLine();
                        NhanVien nv = new NhanVien(ten, tuoi, gioiTinh, congViec);
                        quanLy.themNguoi(nv);
                    } else if (loai == 2) {
                        System.out.print("Nhập cấp bậc của công nhân: ");
                        int capBac = scanner.nextInt();
                        scanner.nextLine();
                        CongNhan cn = new CongNhan(ten, tuoi, gioiTinh, capBac);
                        quanLy.themNguoi(cn);
                    } else if (loai == 3) {
                        System.out.print("Nhập chuyên ngành của kỹ sư: ");
                        String chuyenNganh = scanner.nextLine();
                        KiSu ks = new KiSu(ten, tuoi, gioiTinh, chuyenNganh);
                        quanLy.themNguoi(ks);
                    } else {
                        System.out.println("Loại nhân lực không hợp lệ.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Chức năng chưa hoàn thành, xin vui lòng dùng chức năng khác");
                    break;
                }
                case 3: {
                    System.out.println("Danh sách nhân lực:");
                    quanLy.hienThiDanhSach();
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                    break;
                }
            }
        }
    }
}
