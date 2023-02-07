package reviewDay1;

public class Study_array {
    public static void main(String[] args) {

        // 배열은 똑같은 타입의 변수를 여러개 사용해야 할 때 편리합니다.

        int[] scores = new int[5];  // int 배열 5길이 생성, 모두 0으로 초기화
        int count = scores.length;  // int 배열의 길이
        System.out.println(count);

        scores[0] = 10;
        scores[1] = 10;
        scores[2] = 10;
        scores[3] = 10;

        System.out.println(scores[0]);
        System.out.println(scores[1]);

        scores = new int[] {10, 20, 30, 40, 50};    // int 배열 선언
//        System.out.println(scores[5]);  // java.lang.ArrayIndexOutofBoundsException 발생
        System.out.println(scores[scores.length-1]);

        String[] names = {"홍길동", "이순신"};    // String 배열 선언
        System.out.println(names[0]);

        names = new String[2];  // Stiring 배열 2길이 생성, 모두 null로 초기화
//        System.out.println(names[0].length());  // java.lang.NullpointerException 발생

    }
}
