package reviewDay1;

public class Study_condition {
    public static void main(String[] args) {

        // if 조건문
        int i = 10;

        if (i<5) {  // 조건
            System.out.println("참");
        } else if (i < 3) { // 조건
            System.out.println("거짓");
        } else {    // 그외
            System.out.println("나머지");
        }

        // 삼항 연산자 조건문
        boolean isMarried = true;
        boolean isMan = true;

        String str;
        str = isMarried ? "결혼 했다" : "결혼 안 했다";
        System.out.println(str);

        // 논리 연산
        if (isMarried && isMan) {
            str = "결혼 했다";
        } else {
            str = "결혼 안 했다";
        }
        System.out.println(str);

        // switch 조건문
        switch (str) {
            case "결혼 했다":
                System.out.println("O");
                break;
            case "결혼 안 했다":
                System.out.println("X");
                break;
            default:
                System.out.println("?");
        }

    }
}
