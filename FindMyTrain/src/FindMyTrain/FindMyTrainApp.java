package FindMyTrain;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem tsystem = new TrainSystem();
        Scanner sc = new Scanner(System.in);
        // assigning Stations
        Station station1 = new Station("ST001", "Dehradun");
        Station station2 = new Station("ST002", "Delhi");

        // adding Trains
        Train train1 = new Train("001", "Vande Bharat", "passenger");
        Train train2 = new Train("002", "Dehradun Express", "Express");

        // assigning platforms
        Platform p1 = new Platform(1);
        Platform p2 =new Platform(2);

        // assigning train to platform
        p1.setTrain(train1);
        p2.setTrain(train2);

        //assign platform to the station
        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        // assign platform to station 1
        station1.setPlatformList(platformList);
        station2.setPlatformList(platformList);

        // now making schedule of the trains
        Schedule schedule1 = new Schedule(train1,station1,p1, "9:00 AM", "9:30AM");
        Schedule schedule2 = new Schedule(train2,station2,p1, "10:00 AM", "10:30AM");
        //add station
        tsystem.addStation(station1);
        tsystem.addStation(station2);

        // add trains
        tsystem.addTrains(train1);
        tsystem.addTrains(train2);

        // add Schedule
        tsystem.addSchedule(schedule1);
        tsystem.addSchedule(schedule2);
        System.out.println("enter the source : ");
        String Source = sc.nextLine();
        System.out.println("enter the destination : ");
        String dest = sc.nextLine();
        List<Schedule> mytrains = tsystem.FindMyTrain(Source , dest);
//        System.out.println(mytrains);
        for(Schedule atrain : mytrains){
            System.out.println(atrain);
        }
    }
}
