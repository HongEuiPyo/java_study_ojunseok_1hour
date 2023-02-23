package reviewDay9;

public class Thread {
    public static void main(String[] args) {

        // 여러 일을 동시에 작업하는 코드를 작성할 때 스레드를 사용한다.
        // 누가 더 빨리 작업하는지 컴퓨터가 결정한다.

        System.out.println("1");

        new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    java.lang.Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i=0; i<5; i++) {
                    System.out.println(java.lang.Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        new java.lang.Thread(()->{
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i=0; i<5; i++) {
                System.out.println(java.lang.Thread.currentThread().getName() + ":" + i);
            }
        }).start();

        System.out.println("2");

    }




}
