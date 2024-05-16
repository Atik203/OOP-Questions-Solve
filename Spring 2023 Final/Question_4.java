 class MyRunnable implements Runnable {
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

class Question_4 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed");


    }
}