package FindMyTrain;
import java.util.List;
import java.util.ArrayList;

public class Station {
    private String stationId;
    private String stationName;
    private List<Platform> platformList ;

    public Station(String stationId, String stationName)
    {
        this.stationId= stationId;
        this.stationName= stationName;
        this.platformList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
//        return "Station{" +
//                "stationId='" + stationId + '\'' +
//                ", stationName='" + stationName + '\'' +
//                ", platformList=" + platformList +
//                '}';
        return getStationName();
    }

}
