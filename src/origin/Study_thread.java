package origin;

public class Study_thread {
    public static void main(String[] args) {
        System.out.println("1");

        //여러일을 동시에 작업하는 코드를 작성을 할 때 스레드를 사용을 한다.
        //누가 더 빨리 작업을 하는지는 컴퓨터 마음이다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i=0; i<5; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i=0; i<5; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        //추상메서드를 하나만 가진 경우
        //람다식을 활용하여 간편하게 만들 수 있다.
        new Thread(()-> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i=0; i<5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }).start();

        System.out.println("2");
    }
}
