package BT3;

public class ifElse {

    public static String ifElsedk(int n){
        int number = 100;
        if( n == number){
            return "n bằng 100";
        } else if ( n < number){
            return "n nhỏ hơn 100";
        } else {
            return "n lớn hơn 100";
        }
    }

    public static void main(String[] args) {
//        bài tập 3.1
        int a = 469;
        int b = 265;
        int c = 125;
        System.out.println((a > b));
        System.out.println((b < c));
        System.out.println((a == b) && (b == c));

//        bài tập 3.2
        System.out.println("giá trị n1: " + ifElsedk(89));
        System.out.println("giá trị n2: " + ifElsedk(100));
        System.out.println("giá trị n3: " + ifElsedk(798));

    }
}
