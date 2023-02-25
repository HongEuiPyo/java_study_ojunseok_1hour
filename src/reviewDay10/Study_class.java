package reviewDay10;

import java.util.Random;
import java.util.Scanner;

public class Study_class {
    public static void main(String[] args) {

        System.out.println(Math.max(10, 30));   // 두 수 중 더 큰 값
        System.out.println(Math.min(10, 30));   // 두 수 중 더 작은 값
        System.out.println(Math.abs(-10));      // 절대값

        String str = "100";
        int i = Integer.parseInt(str);          // Integer 형변환
        System.out.println(i);

        String str2 = String.valueOf(i);        // String 형변환
        System.out.println(str2);

        long l = Long.parseLong(str);           // Long 형변환
        System.out.println(l);

        // java.util.Random
        Random random = new Random();
        int rand = random.nextInt(10);      // 0~9
        System.out.println(rand);

        int rand2 = random.nextInt(4) + 5;  // 5~9

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());     // 다음 입력값을 받음
        int ii = scanner.nextInt();                 // 다음 int형 값을 받음
        long ll = scanner.nextLong();               // 다음 long형 값을 받음

    }
}
