public abstract class Event {
    /* Attributes */
    private int ID;
    private String type;
    private String name;
    private String date;// YYYYMMDD
    private String time;//0930
    private double vipPrice;
    private double goldPrice;
    private double silverPrice;
    private double bronzePrice;
    private double genPrice;
    private String venueName;
    private Double unavailableSeats;
    private String venueType;
    private int capacity;
    private double cost;
    private double vipPct;
    private double goldPct;
    private double silverPct;
    private double bronzePct;
    private double GAPct;
    private double reservedPct;
    private String fireworks;
    private double fireworksCost;

    public Event(int ID, String type, String name, String date, String time, double vipPrice, double goldPrice, double silverPrice, double bronzePrice, double genPrice, String venueName, Double unavailableSeats, String venueType, int capacity, double cost, double vipPct, double goldPct, double silverPct, double bronzePct, double GAPct, double reservedPct, String fireworks, double fireworksCost) {
        this.ID = ID;
        this.type = type;
        this.name = name;
        this.date = date;
        this.time = time;
        this.vipPrice = vipPrice;
        this.goldPrice = goldPrice;
        this.silverPrice = silverPrice;
        this.bronzePrice = bronzePrice;
        this.genPrice = genPrice;
        this.venueName = venueName;
        this.unavailableSeats = unavailableSeats;
        this.venueType = venueType;
        this.capacity = capacity;
        this.cost = cost;
        this.vipPct = vipPct;
        this.goldPct = goldPct;
        this.silverPct = silverPct;
        this.bronzePct = bronzePct;
        this.GAPct = GAPct;
        this.reservedPct = reservedPct;
        this.fireworks = fireworks;
        this.fireworksCost = fireworksCost;
    }


    public Event(int ID, double vipPrice, double goldPrice, double silverPrice, double bronzePrice, double genPrice, double vipPct, double goldPct, double silverPct, double bronzePct, double GAPct, double reservedPct) {
        this.ID = ID;
        this.vipPrice = vipPrice;
        this.goldPrice = goldPrice;
        this.silverPrice = silverPrice;
        this.bronzePrice = bronzePrice;
        this.genPrice = genPrice;
        this.vipPct = vipPct;
        this.goldPct = goldPct;
        this.silverPct = silverPct;
        this.bronzePct = bronzePct;
        this.GAPct = GAPct;
        this.reservedPct = reservedPct;
    }

    public Event(int ID, String type, String name, String date, String time) {
        this.ID = ID;
        this.type = type;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    //used in the class Ticket
    public Event(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public double getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(double goldPrice) {
        this.goldPrice = goldPrice;
    }

    public double getSilverPrice() {
        return silverPrice;
    }

    public void setSilverPrice(double silverPrice) {
        this.silverPrice = silverPrice;
    }

    public double getBronzePrice() {
        return bronzePrice;
    }

    public void setBronzePrice(double bronzePrice) {
        this.bronzePrice = bronzePrice;
    }

    public double getGenPrice() {
        return genPrice;
    }

    public void setGenPrice(double genPrice) {
        this.genPrice = genPrice;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public Double getUnavailableSeats() {
        return unavailableSeats;
    }

    public void setUnavailableSeats(Double unavailableSeats) {
        this.unavailableSeats = unavailableSeats;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getVipPct() {
        return vipPct;
    }

    public void setVipPct(double vipPct) {
        this.vipPct = vipPct;
    }

    public double getGoldPct() {
        return goldPct;
    }

    public void setGoldPct(double goldPct) {
        this.goldPct = goldPct;
    }

    public double getSilverPct() {
        return silverPct;
    }

    public void setSilverPct(double silverPct) {
        this.silverPct = silverPct;
    }

    public double getBronzePct() {
        return bronzePct;
    }

    public void setBronzePct(double bronzePct) {
        this.bronzePct = bronzePct;
    }

    public double getGAPct() {
        return GAPct;
    }

    public void setGAPct(double GAPct) {
        this.GAPct = GAPct;
    }

    public double getReservedPct() {
        return reservedPct;
    }

    public void setReservedPct(double reservedPct) {
        this.reservedPct = reservedPct;
    }

    public String getFireworks() {
        return fireworks;
    }

    public void setFireworks(String fireworks) {
        this.fireworks = fireworks;
    }

    public double getFireworksCost() {
        return fireworksCost;
    }

    public void setFireworksCost(double fireworksCost) {
        this.fireworksCost = fireworksCost;
    }
}

