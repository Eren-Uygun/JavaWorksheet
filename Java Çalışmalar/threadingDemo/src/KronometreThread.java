public class KronometreThread implements Runnable {
    private Thread t;
    private String threadName;
    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Thread Oluşturuluyor : "+threadName);

    }



    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : "+threadName);

        try{
            for (int i=0;i<=10;i++)
            {
                System.out.println(threadName + " : "+i);

                    t.sleep(1000);

            }

        }catch (InterruptedException e) {
            System.out.println("Kesildi : "+threadName);
        }

        System.out.println("Thread bitti : "+threadName);



    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor.");
        if (t==null)
        {
            t = new Thread(this,threadName);
            t.start();
        }

    }
}
