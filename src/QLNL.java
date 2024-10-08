import java.util.ArrayList;

class QLNL {
    ArrayList<Person> danhSachNhanLuc = new ArrayList<>();

    public void themNguoi(Person person) {
        danhSachNhanLuc.add(person);
    }

    public void hienThiDanhSach() {
        if (danhSachNhanLuc.isEmpty()) {
            System.out.println("Danh sách nhân lực trống.");
        } else {
            for (Person person : danhSachNhanLuc) {
                person.hienThiThongTin();
                System.out.println("-----------------");
            }
        }
    }
}
