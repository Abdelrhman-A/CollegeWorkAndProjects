package project;

public class Main {

    public static void main(String[] args){
        time t1 = new time(7,50,60);
        time t2 = new time(3, 60, 50);
        time t3 = new time();
        t3 = t1.add(t2);
        t3.getTime(t3);

    }
}
