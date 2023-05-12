package Books;

public class test {
    public static void main(String[] args){
        AudioBook A1 = new AudioBook();
        A1.readData();
        A1.printData();
        HardBook A2 = new HardBook();
        A2.readData();
        A2.printData();
    }
}
