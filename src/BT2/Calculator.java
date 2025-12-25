package BT2;

public class Calculator {

    public static int Tong2songuyen(int a, int b){
        return a+b;
    }

    public static float Tich2sothuc(float c, float d){
        return c*d;
    }


    public static void main(String[] args) {
        System.out.println(Tong2songuyen(5,34));
        System.out.println(Tich2sothuc(5.3f,8.5f));
    }
}
