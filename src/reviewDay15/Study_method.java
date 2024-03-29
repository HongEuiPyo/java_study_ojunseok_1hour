package reviewDay15;

public class Study_method {

    // static은 처음 프로그램이 실행될 때 메모리에 항상 로드되는 부분
    // 별도의 영역의 메모리를 차지하게 된다.

    public static void main(String[] args) {

    }

    // 메서드를 따로 정의하면 반복되는 코드를 줄일 수 있고, 다양하게 활용이 가능하다.
    public static void add(int x, int y) { System.out.println(x+y); }

    // 메서드 오버로드
    // 같은 이름의 메서드를 인자값을 다르게 받아서 만들 수 있다.
    public static int add2(int x, int y) { return x+y; }
    public static int add2(int x, int y, int z) { return x+y+z; }

    // 여러 개를 지정할 수 있게 하는 방법
    // 들어오는 값을 배열로 들어오게 한다.
    public static int add(int... numbers) {
        int sum = 0;

        for (int i=0; i<numbers.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
