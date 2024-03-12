import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }

    @Override
    public void hienthiCanBo() {
        super.hienthiCanBo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao :");
        nganhDaoTao = scanner.nextLine();
    }

}
