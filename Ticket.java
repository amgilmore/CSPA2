/*class ticket holds information regarding the tickets,
like price and percentage of each type to track sales. Ticket inherits attributes from
class events
 */

// class to hold the information regarding tickets pricing and avaiablity, extends event
public class Ticket extends Event{
//attributes
    private double vipPrice;
    private double goldPrice;
    private double silverPrice;
    private double bronzePrice;
    private double genPrice;
    private double vipPct;
    private double goldPct;
    private double silverPct;
    private double bronzePct;
    private double GAPct;
    private double reservedPct;


//constructors
    public Ticket(int ID, double vipPrice, double goldPrice, double silverPrice, double bronzePrice, double genPrice, double vipPct, double goldPct, double silverPct, double bronzePct, double GAPct, double reservedPct) {
        super(ID,vipPrice, goldPrice, silverPrice, bronzePrice, genPrice, vipPct, goldPct, silverPct, bronzePct, GAPct, reservedPct);
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

    public void toStrings() { // toStrings takes the variables, and prints
        String output = "";
        output += "Gen Price: $" + genPrice + "0"+ "\n";
        output += "Bronze Price: $" + bronzePrice +"0"+ "\n";
        output += "Silver Price: $" + silverPrice +"0"+ "\n";
        output += "Gold Price: $" + goldPrice +"0"+ "\n";
        output += "Vip Price: $" + vipPrice +"0"+ "\n";
        System.out.println(output);
    }
}
