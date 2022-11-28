package metier;

public class Talkative implements Runnable{

    private int number;

    public Talkative(int number) {
        this.number=number;
    }


    @Override
    public void run() {
        for(int i=0;i<3;i++){

    System.out.println(number);
            Thread.currentThread().setPriority(10);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
