//Abstract class hosting the attricbutes for the venues, inhertied by the venues
public abstract class Venue {
    private String venueName;
    private int venueCapacity;
    private int venueCost;

    public Venue(String venueName, int venueCapacity, int venueCost) {
        this.venueName = venueName;
        this.venueCapacity = venueCapacity;
        this.venueCost = venueCost;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public int getVenueCost() {
        return venueCost;
    }

    public void setVenueCost(int venueCost) {
        this.venueCost = venueCost;
    }
}
