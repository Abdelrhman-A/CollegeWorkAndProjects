package Books;

import java.util.Scanner;
public class book {
    private String title;
    private float price;

    public book(){
        this.title= null ;
        this.price= 0;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void printData(){
        System.out.println("the title is: " + getTitle() +" the price is: " + getPrice());
    }
    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the title: ");
        setTitle(sc.next());
        System.out.println("enter the price: ");
        setPrice(sc.nextFloat());
    }
}
class AudioBook extends book {
    private float playTime;

    public AudioBook(){
        this.playTime=0;
    }

    public void setPlayTime(float playTime) {
        this.playTime = playTime;
    }

    public float getPlayTime() {
        return playTime;
    }

    @Override
    public void readData() {
        Scanner sc = new Scanner(System.in);
        super.readData();
        System.out.println("enter the play time in minutes");
        setPlayTime(sc.nextFloat());
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("the playtime is: " + getPlayTime());
    }
}
class HardBook extends book{
    private int pageCount;


    public HardBook(){
    pageCount=0;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void readData() {
        Scanner sc = new Scanner(System.in);
        super.readData();
        System.out.println("enter the page count: ");
        setPageCount(sc.nextInt());
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("the page count is: "+ getPageCount());
    }
}