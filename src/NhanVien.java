import java.util.Scanner;

public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "CongViec='" + CongViec + '\'' +
                '}';
    }

    @Override
    public void hienthiCanBo() {
        super.hienthiCanBo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cong viec : ");
        CongViec = scanner.nextLine();
    }
}
