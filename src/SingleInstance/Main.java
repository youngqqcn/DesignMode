package SingleInstance;

public class Main extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(1000);

            for (int k = 0; k < 100000; k++) {
                //SingleInstance.Single.getSingle();
                //SingleInstance.Single2.getSingle2();
                Single3.getSingle3();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello World!");

        long startTime = System.currentTimeMillis();

        Main[] m1 = new Main[1000];

        for (int i = 0; i < m1.length; i++) {
            m1[i] = new Main();
            m1[i].start();
        }

        for (int i = 0; i < m1.length; i++) {
            m1[i].join();
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
