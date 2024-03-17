public class Threading implements Runnable{
    private int threadNumber;

    public Threading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i +" from thread number" + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }

        }

    }
}
