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

        }
    }
}
