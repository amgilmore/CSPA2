import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/*Ashley Gilmore
9/17/2021
CS 3331- AOOP
Mejia
programming assignmentOne
For this lab we were instructed to begin our project for the semester which is a service similar to ticket master.
We were required to create a class for sports, which needed to take information given to us in a CSV(excel file)
We then had to read and store the CSV in a data structure of our choice, I chose just a regular array, however I believe
an arraylist might be more efficient for the given task. We were also instructed to create a log file, and document any
edits made to the database.

Honesty statement:
The code submitted is my own work, done alone, and without assistance from others. I cannot find the honesty statement
that was provided for the class, and I apologize for this. However, I pinky promise that this code is all my own, and I
will find the honesty statement for next time. Thank you!
 */
public class RunTicketMiner {

    public RunTicketMiner() throws IOException {
    }

    public static void main(String[] args) throws java.io.IOException {
        new java.io.FileNotFoundException("File not found");
        File file = new File("log.txt"); //creates the log file
        if (file.exists()) { //deletes file, for fresh log everytime !! :)
            file.delete();
        }
        FileWriter fw = new FileWriter("log.txt"); // used to write in the log file

        List<Customer> customerList = CustomerList(); //runs the method to create list from csv file
        List<Event> eventList = eventList();
        runTM(customerList,eventList);
    }
    //method which creates an array list all of the info from the csv event file
        static List<Event> eventList() throws IOException{
        List<Event> events = new ArrayList<Event>(45);
        Scanner user = new Scanner(System.in);
        System.out.println("Please give file directory for events file");
        String eventList = user.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(eventList));
        br.readLine();
        String input = "";
        while ((input = br.readLine()) != null) {
            if (!input.isEmpty()) {
                String[] eventCsv = input.split(",");
                int ID = Integer.parseInt(eventCsv[0]);
                double vipPrice = Double.parseDouble(eventCsv[5]);
                double goldPrice = Double.parseDouble(eventCsv[6]);
                double silverPrice = Double.parseDouble(eventCsv[7]);
                double bronzePrice = Double.parseDouble(eventCsv[8]);
                double genPrice = Double.parseDouble(eventCsv[9]);
                double unavailableSeats = Double.parseDouble(eventCsv[11]);
                int capacity = Integer.parseInt(eventCsv[13]);
                double cost =Double.parseDouble(eventCsv[14]);
                double vipPct = Double.parseDouble(eventCsv[15]);
                double goldPct =Double.parseDouble(eventCsv[16]);
                double silverPct = Double.parseDouble(eventCsv[17]);
                double bronzePct = Double.parseDouble(eventCsv[18]);
                double GAPct = Double.parseDouble(eventCsv[19]);
                double reservedPct = Double.parseDouble(eventCsv[20]);
                double fireworksCost = Double.parseDouble(eventCsv[22]);

                Event list = new Event(ID, eventCsv[1], eventCsv[2], eventCsv[3], eventCsv[4], vipPrice, goldPrice, silverPrice,bronzePrice, genPrice,eventCsv[10],unavailableSeats,eventCsv[12],capacity, cost, vipPct, goldPct, silverPct,bronzePct,GAPct, reservedPct,eventCsv[21],fireworksCost) {
                };
                events.add(list);
            }
        }
            return events;
        }

///array list of customers is created here using csv file, return listOfCustomers
    static List<Customer> CustomerList() throws IOException {
        List<Customer> listOfCustomers = new ArrayList<Customer>(45); // initial size does not matter, they are dynamic
        Scanner db = new Scanner(System.in);
        //gets directory for csv file
        System.out.println("Please give directory for customer database");
        String customerDatabase = db.nextLine();
        //reads file, skips first line
        BufferedReader br = new BufferedReader(new FileReader(customerDatabase));
        br.readLine();
        /////
        String input = "";
        while ((input = br.readLine()) != null) {
            if (!input.isEmpty()) {
                String[] csv = input.split(",");
                int customerID = Integer.parseInt(csv[0]);
                double moneyAvailable = Double.parseDouble(csv[3]);
                int concertsPurchased = Integer.parseInt(csv[4]);
                Customer cust = new Customer(customerID, csv[1], csv[2], moneyAvailable, concertsPurchased, csv[5], csv[6], csv[7]) {
                };
                listOfCustomers.add(cust);
            }
        }
        return listOfCustomers;
    }
    static void runTM(List<Customer> customerList, List<Event> eventList) throws IOException{

    }


}

