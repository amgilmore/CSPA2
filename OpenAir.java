/* class to hold the attributes for the venue type OpenAir*/
public class OpenAir extends Venue{
    private String venueName;
    private int venueCapacity;
    private int venueCost;
    private String fireworks;


    public OpenAir(String venueName, int venueCapacity, int venueCost, String fireworks) {
    super(venueName,venueCapacity,venueCost);
        this.fireworks = fireworks;
    }

    public String getFireworks() {
        return fireworks;
    }

    public void setFireworks(String fireworks) {
        this.fireworks = fireworks;
    }

}
