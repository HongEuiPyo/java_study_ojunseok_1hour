package reviewDay5;

public class Study_array {
    public static void main(String[] args) {

        //  배열은 똑같은 타입의 변수를 여러 개 사용해야 할 때 편리하다.
        int[] scores = new int[5];
        int count = scores.length;
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

        String[] names = {"홍길동", "이순신"};    //  String 배열 선언
        System.out.println(names[0]);

        names = new String[2];
//        System.out.println(names[0].length());  //  java.lang.NullpointerException 발생

        //  null은
        //  참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있다.
        //  null값도 초기값으로 사용할 수 있기 때문에
        //  null로 초기화된 참조 변수는 '스택 영역'에서 생성된다.
        //  참조 타입 변수가 null값을 가지는지 확인 방법
        //  ==, != 연산을 수행

    }
}
