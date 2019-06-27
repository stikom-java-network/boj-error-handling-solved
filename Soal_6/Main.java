class Robot{
    int xlocation;
    int ylocation;
    String name;
    static int count = 0;

    public Robot(int xlocation, int ylocation, String name){
        this.xlocation = xlocation;
        this.ylocation = ylocation;
        this.name = name;
        count++;
    }
}

public class Main{
    public static void main(String[] args){
        Robot firstRobot = new Robot(20,300,"Optimus");
        System.out.println("number robot : "+firstRobot.count);}
}