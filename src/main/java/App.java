public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Threading obj=new Threading(i);
           Thread myThread=new Thread(obj);
           myThread.start();
           myThread.isAlive();


        }




    }

}
