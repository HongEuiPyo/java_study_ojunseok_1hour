public class Study_loop {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);


        for (int j=0; j<10; j++) {
            if (j == 6) {
                break;
            }
        }

        for (int j=0; j<10; j++) {
            if (j == 6) {
                continue;
            }
        }
    }
}
