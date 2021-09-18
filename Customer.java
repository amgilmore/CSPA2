/*Class Customer is the database for customer information
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private double moneyAvailable;
    private int concertsPurchased;
    private String ticketMinerMembership;
    private String username;
    private String password;

    public Customer(){};

    public Customer(int customerID, String firstName, String lastName, double moneyAvailable, int concertsPurchased, String ticketMinerMembership, String username, String password) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyAvailable = moneyAvailable;
        this.concertsPurchased = concertsPurchased;
        this.ticketMinerMembership = ticketMinerMembership;
        this.username = username;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public int getConcertsPurchased() {
        return concertsPurchased;
    }

    public void setConcertsPurchased(int concertsPurchased) {
        this.concertsPurchased = concertsPurchased;
    }

    public String isTicketMinerMembership() {
        return ticketMinerMembership;
    }

    public void setTicketMinerMembership(String ticketMinerMembership) {
        this.ticketMinerMembership = ticketMinerMembership;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
