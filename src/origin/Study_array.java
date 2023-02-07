package origin;

public class Study_array {
    public static void main(String[] args) {

        //배열은 똑같은 타입의 변수를 여러개 사용해야 할 때 편리합니다.

        int[] scores = new int[5];
        int count = scores.length;
        System.out.println(count);

        scores[0] = 10;
        scores[1] = 10;
        scores[2] = 10;
        scores[3] = 10;
        System.out.println(scores[0]);
        System.out.println(scores[1]);

        scores = new int[] {10, 20, 30, 40, 50};
//        System.out.println(scores[5]);  //java.lang.ArrayIndexOutOfBoundsException 발생
        System.out.println(scores[scores.length-1]);

        String[] names = {"홍길동", "이순신"};
        System.out.println(names[0]);

        names = new String[2];
//        System.out.println(names[0].length());  //java.lang.NullPointerException


    }


}
