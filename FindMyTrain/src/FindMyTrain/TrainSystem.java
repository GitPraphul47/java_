package FindMyTrain;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class TrainSystem {
    private Map<String, Station >  stations = new HashMap<>() ;
    private Map<String, Train >  trains = new HashMap<>() ;
    private List<Schedule> schedules= new ArrayList<>();

    // add station
    public void addStation(Station station)
    {
        stations.put(station.getStationId(), station );
    }
   // add Trains
    public void addTrains(Train train)
    {
        trains.put(train.getTrainId(),train);
    }
    // add schedule
    public void addSchedule(Schedule schedule)
    {
        schedules.add(schedule);
    }

    // now find the train
    public List<Schedule> FindMyTrain(String startStationName, String endStationName)
    {
        List<Schedule> availableTrains = new ArrayList<>();
        for(Schedule schedule : schedules)
        {
            if(schedule.getStation().getStationName().equals(startStationName) || schedule.getStation().getStationName().equals(endStationName))
            {
                availableTrains.add(schedule);
            }
        }
        return availableTrains;
    }
}
