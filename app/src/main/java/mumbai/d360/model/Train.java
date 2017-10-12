package mumbai.d360.model;

public class Train {
    private String id;
    private String trainKey;
    private String stationKey;
    private String time;
    private String source2destination;
    private String source = "";
    private String destination = "";

    private String cars;
    private String feature;
    private String speed = "";

    private int lineIndicator;
    private int direction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrainKey() {
        return trainKey;
    }

    public void setTrainKey(String trainKey) {
        this.trainKey = trainKey;
    }

    public String getStationKey() {
        return stationKey;
    }

    public void setStationKey(String stationKey) {
        this.stationKey = stationKey;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSource2destination() {
        return source2destination;
    }

    public void setSource2destination(String source2destination) {
        this.source2destination = source2destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getLineIndicator() {
        return lineIndicator;
    }

    public void setLineIndicator(int lineIndicator) {
        this.lineIndicator = lineIndicator;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
