package reviewDay2;

public class Study_loop {
    public static void main(String[] args) {

        // for 반복문
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }

        int i = 0;

        // while 반복문
        while (i<10) {
            System.out.println(i);
            i++;
        }

        i = 0;

        // do while 반복문
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        // break와 continue
        for (int j=0; j<10; j++) {
            if (j == 6) {
//                break;    //  반복문 탈출
                continue;   //  다음 반복문으로 이동
            }
            System.out.println(j);
        }

    }
}
