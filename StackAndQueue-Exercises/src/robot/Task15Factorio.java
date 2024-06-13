package robot;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Task15Factorio {
    //15. Factorio
    //
    //You are creating a robotized assembly line.
    //Each robot has a processing time, the time it needs to process a product. When a robot
    //is free, it should take a product for processing and log its name, product, and
    //processing start time.
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //Each robot processes a product coming from the assembly line. A product comes
    //from the line each second (so the first product should appear at [start time + 1
    //second]). If a product passes the line and there is no free robot to take it, it should be
    //queued at the end of the line again.
    //The robots are standing in line in order of their appearance.
    // On the first line, you will get the names of the robots and their processing times in
    //the format:
    //&quot;robot-processTime|robot-processTime|robot-processTime&quot;.
    // On the second line, you will get the starting time in the format &quot;hh:mm:ss&quot;.
    // Next, until the &quot;End&quot; command, you will get a product on each line.
    //Input Output
    //R2-15|D2-10|WX78-3
    //8:00:00
    //detail
    //glass
    //wood
    //laptop
    //End
    //
    //R2 - detail [08:00:01]
    //D2 - glass [08:00:02]
    //WX78 - wood [08:00:03]

    public static void main(String[] args) {


        String input = "R2-15|D2-10|WX78-3\n" +
                "08:00:00\n" +
                "detail\n" +
                "glass\n" +
                "wood\n" +
                "laptop\n" +
                "End";
        Queue<String> partsQueue = new ArrayDeque<>();

        String[] arr = input.split("\n");
        String[] robots = arr[0].split("\\|");
        LocalTime startTime=LocalTime.parse(arr[1]);

        ArrayList<RobotClass>robotList=new ArrayList<>();


        for (int i = 0; i < robots.length; i++) {

            String[]robArr=robots[i].split("-");
            String name=robArr[0].trim();
            int prossTime=Integer.valueOf(robArr[1].trim());
            RobotClass robotInst=new RobotClass(name,prossTime);
            robotList.add(robotInst);
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i].equals("End")){
                break;
            }else {
                String part=arr[i];
                partsQueue.add(part);
            }
        }
//        System.out.println(robotList);
//        System.out.println(partsQueue);

        while (!partsQueue.isEmpty()){
            String part=partsQueue.poll();
            startTime=startTime.plusSeconds(1);
            boolean partAsigned=false;
            for (RobotClass robot:robotList){
                if(ChronoUnit.SECONDS.between(robot.startTime, startTime) >= robot.processTime){
                    robot.isAvailabl =true;
                }
                if(robot.isAvailabl){
                    System.out.printf("%s - %s [%s]%n", robot.name, part, startTime);
                    robot.startTime=startTime;
                    partAsigned=true;
                    robot.isAvailabl=false;
                    break;
                }
            }
            if(! partAsigned){
                partsQueue.add(part);
            }
        }
    }
}
