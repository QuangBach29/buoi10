import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    public static void main(String[] args) {
        ArrayList<CanBo> CanBolist = new ArrayList<>();
        while (true) {
            System.out.println("--------Menu---------" +
                    "\n1, Danh sach can bo :" +
                    "\n2, Them can bo " +
                    "\n3, Tim kiem " +
                    "\n4, Thoat");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1 ) {
                System.out.println("Danh sach can bo : ");
                for (int i = 0; i < CanBolist.size(); i++) {
                    System.out.println(CanBolist.get(i));
                }
            }
            if (choice == 2){
                System.out.println("Nhap vao thong tin can bo :");
                System.out.println("Nhap tuoi :");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap ten :");
                String hoTen = scanner.nextLine();
                System.out.println("Nhap gioi tinh :");
                String gioiTinh = scanner.nextLine();
                System.out.println("Nhap diaChi :");
                String diaChi = scanner.nextLine();
                CanBolist.add(new CanBo(hoTen, tuoi, diaChi, gioiTinh));

            }
            if (choice == 3){
                System.out.println("Nhap can bo can tim : ");
                scanner.nextLine();
                String hoTen = scanner.nextLine();
                for (int i = 0; i < CanBolist.size(); i++) {
                    if (CanBolist.get(i).getHoTen().equals(hoTen)){
                        System.out.println(CanBolist.get(i));
                    }
                }
            }
            if (choice == 4){
                break;
            }
        }
    }
}