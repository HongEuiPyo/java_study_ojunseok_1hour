package reviewDay11;

public class Study_loop {
    public static void main(String[] args) {

        // 1. for문
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }

        // 2. while문

        int i = 0;

        while (i<10) {
            System.out.println(i);
            i++;
        }

        // 3. do while문

        i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i<10);

        // break와 continue
        for (int j=0; j<10; j++) {
            if (j==6) {
//                break;    // 반복문 탈출
                continue;   // 다음 반복으로 건너뛰기
            }
            System.out.println(j);
        }

    }
}
