import java.util.Random;
import java.util.Scanner;

public class Study_Class {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 30));
        System.out.println(Math.min(10, 30));
        System.out.println(Math.abs(-10));

        String str = "100";
        int i = Integer.parseInt(str);
        System.out.println(i);

        String str2 = String.valueOf(i);
        System.out.println(str2);

        long l = Long.parseLong(str);
        System.out.println(l);

        Random random = new Random();
        int rand = random.nextInt(10);  //0~9
        System.out.println(rand);

        int rand2 = random.nextInt(4) + 5;  //5~9

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        int ii = scanner.nextInt();
        long ll = scanner.nextLong();
    }
}
