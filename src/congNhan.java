import java.util.Scanner;

public class congNhan extends CanBo{
    private int bac;

    public congNhan() {
    }

    public congNhan(int bac) {
        this.bac = bac;
    }

    public congNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "congNhan{" +
                "bac=" + bac +
                '}';
    }

    @Override
    public void hienthiCanBo() {
        super.hienthiCanBo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bac :");
        bac = scanner.nextInt();
    }
}
