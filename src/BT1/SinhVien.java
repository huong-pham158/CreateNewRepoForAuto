package BT1;

public class SinhVien {
    String Bientoancuc = "Bien toan cuc";
    static String Bientinh = "Bien tinh";

    public static void Kiemtraham(){
        System.out.println("ham");
    }

    public static void main(String[] args) {
        String Cucbo = "Bien cuc bo";

        SinhVien sinhvien = new SinhVien();
        System.out.println(sinhvien.Bientoancuc);

        System.out.println(Bientinh);
        System.out.println(Cucbo);

        System.out.println(ThongTin.name);
        System.out.println(ThongTin.address);

        Kiemtraham();
    }
}
