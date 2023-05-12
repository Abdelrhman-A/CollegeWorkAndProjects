package project;

public class time {
    private int hours;
    private int minutes;
    private int seconds;

    public time() {
        hours=0;
        minutes=0;
        seconds=0;
    }
    public time(int x) {
        hours=6;
        minutes=30;
        seconds=15;
    }
    public time(int x,int y,int z) {
        hours=x;
        minutes=y;
        seconds=z;
    }
    public void setTime(int hh,int mm,int ss){
        hours=hh;
        minutes=mm;
        seconds=ss;
    }
    public void setHours(int hh){
        hours=hh;
    }

    public void setMinutes(int mm) {
        minutes = mm;
    }
    public void setSeconds(int ss){
        seconds=ss;
    }
    public void getTime(time t){
        System.out.println("the time is " + t.hours + ":"+ t.minutes + ":" + t.seconds);
    }
    public time add(time t1){
        time temp = new time();
        temp.seconds = seconds + t1.seconds;
        temp.minutes = minutes + t1.minutes;
        temp.hours = hours + t1.hours;

        //implement mechanism to convert time in proper format
        if(temp.seconds >= 60){
            temp.minutes += temp.seconds / 60;
            temp.seconds = temp.seconds % 60;
        }
        if(temp.minutes >= 60){
            temp.hours += temp.minutes / 60;
            temp.minutes = temp.minutes % 60;
        }
        return temp;
    }
}