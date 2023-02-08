package reviewDay2;

public class Study_array {
    public static void main(String[] args) {

        // 배열은 똑같은 타입의 변수를 여러개 사용해야 할 때 편리

        int[] scores = new int[5];  //  int타입 배열 5길이 생성, int배열은 모두 0으로 초기화
        int count = scores.length;  //  int 배열의 길이
        System.out.println(count);

        scores[0] = 10;
        scores[1] = 10;
        scores[2] = 10;
        scores[3] = 10;

        System.out.println(scores[0]);
        System.out.println(scores[1]);

        scores = new int[] {10, 20, 30, 40, 50};    //  int 배열 선언
//        System.out.println(scores[5]);  //  java.lang.ArrayIndexOutofBoundsException 발생
        System.out.println(scores[scores.length-1]);

        String[] names = {"홍길동", "이순신"};    // String 배열 선언
        System.out.println(names[0]);

        names = new String[2];  //  String타입 배열 2길이 생성, String배열은 모두 null로 초기화
//        System.out.println(names[0].length());    //  java.lang.NullpointerException 발생

        // null은
        // 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있다.
        // null 값도 초기값으로 사용할 수 있기 때문에
        // null로 초기화된 참조 변수는 '스택 영역'에서 생성된다.
        // 참조 타입 변수가 null 값을 가지는지 확인 방법
        // ==, != 연산을 수행하자
        // refVar == null   //결과: false
        // refVar != null   //결과: true

    }
}
