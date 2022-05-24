package day5;

import java.util.Scanner;

public class ticket_price_calculation {
    private int ticketid;
    private int price;
    private static int availabletickets;

    public int getTicketid(){
        return ticketid;
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price=price;
    }
    public static int getAvailabletickets(){
        return availabletickets;
    }
    public static void setAvailabletickets( int availabletickets){
        if(availabletickets>=0){
            ticket_price_calculation.availabletickets=availabletickets;
        }
    }
    public int calculateTicketcost(int noOfticket){
        if(getAvailabletickets()>=noOfticket){
            ticket_price_calculation.setAvailabletickets((ticket_price_calculation.getAvailabletickets()-noOfticket));
            return  noOfticket * getprice();

        }else return -1;
    }




    public static void main(String[] args) {

        ticket_price_calculation t1=new ticket_price_calculation();
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the ticket id");
        t1.setTicketid(scan.nextInt());

        System.out.println("Enter the price");
        t1.setprice(scan.nextInt());

        System.out.println("enter no of ticket");
        int tickets=scan.nextInt();
        System.out.println("Enter available ticket");
        ticket_price_calculation.setAvailabletickets(scan.nextInt());

        System.out.println("Total price "+t1.calculateTicketcost(tickets));

        System.out.println("Available ticket after booking: "+ticket_price_calculation.getAvailabletickets());
    }
}
