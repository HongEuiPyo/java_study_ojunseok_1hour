package reviewDay7;

public class Study_type {
    public static void main(String[] args) {

        //정수형 타입
        //내려갈수록 자료를 담는 크기가 줄어든다.
        long l = 30L;
        int x = 30;
        short s = 30;
        byte b = 30;

        //실수형 타입
        double dd = 30.0;
        float ff = 30.0f;

        //강제형변환
        //더 큰 자료형은 더 작은 자료형을 형변환 없이 바로 받을 수 있다.
        //하지만, 더 작은 자료형이 더 큰 자료형을 받으려면 강제형변환을 해야한다.
        int i = (int) 30L;
        long ll = 30;
        dd = ff;
        ff = (float) dd;

        //논리형 타입
        boolean isMarried = true;
        isMarried = false;

        //문자형 타입
        char c = 'a';
        char cc = '한';

        //문자열 타입
        String str = "여러 글자";

        //System.out.println()과 System.out.printf()
        System.out.println(str);
        System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 20, 180.5f);
        System.out.println();

        //String.format()은 System.out.printf()와 형식이 동일하다.
        //String.format()은 자주 사용된다.
        String str2 = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 20, 180.5f);
        System.out.println(str2);

        System.out.println("Hello world!");
        System.out.println(35);
        System.out.println(35 + 30);
        System.out.println(x);

        s = 40;
        System.out.println(s);

        final int y = 30;   //상수
//        y = 20;

    }
}
