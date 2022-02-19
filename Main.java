/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresjustinproject3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jdt63
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // see what the user wants to do
        int num = -1;
        String userName;
        String productName;
        String method = "Credit";
        double cost;
        boolean isFeePaid = false;

        MemberRoster storeMembers = new MemberRoster();
        storeMembers.addMember("John Doe", true, method);
        Bookstore b = new Bookstore();

        Book book1 = new Book(1,"fahrenheit 451","ray bradbury",8,9.99);
        Book book2 = new Book(2, "1984","george orwell",5,15.99);
        Book book3 = new Book(3, "to kill a mockingbird","harper lee",12,12.99);
        Book book4 = new Book(4, "beloved","toni morrison",4,13.5);
        Book book5 = new Book(5, "the little prince","antoine de saint exupéry",10,7);
        Book book6 = new Book(6, "brave new world","aldous huxley",15,19);
        Book book7 = new Book(7, "charlotte's web","e.b. white",10,8.999);
        CD CD1 = new CD(8, "a night at the opera","queen",14,6.99);
        CD CD2 = new CD(9, "cuz I love you","lizzo",8,7.99);
        CD CD3 = new CD(10, "a hard day's night","the beatles",3,3.99);
        DVD DVD1 = new DVD(11, "the dark knight","n/a",5,12.99);
        DVD DVD2 = new DVD(12, "jurassic park","n/a" ,7,7.99);
        
        b.addBook(book1);
        b.addBook(book2);
        b.addBook(book3);
        b.addBook(book4);
        b.addBook(book5);
        b.addBook(book6);
        b.addBook(book7);
        b.addCD(CD1);
        b.addCD(CD2);
        b.addCD(CD3);
        b.addDVD(DVD1);
        b.addDVD(DVD2);
        
        
        // START OF PROJECT 3 CODE
        
        Project3GUI project3GUI = new Project3GUI();
        project3GUI.setVisible(true);
        
        // END OF PROJECT 3 CODE
        
        //BookstoreMembers name = new BookstoreMembers("TBA", false, "TBA");;
        /**
        do {
            System.out.println("Are you a new user?");
            System.out.println("/t 1. Yes");
            System.out.println("/t 2. No");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter your name. (Use _ for spaces.)");
                    userName = sc.nextLine();
                    sc.next();
                    name.setName(userName);
                    storeMembers.addMember(userName, false, "TBA");
                    break;
                case 2:
                    System.out.println("Enter your name. (Use _ for spaces.)");
                    userName = sc.nextLine();
                    sc.next();
                    break;
            }

            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Purchase an item.");
            System.out.println("\t 2. Edit membership status/payment.");
            System.out.println("\t 3. Donate item to inventory.");
            System.out.println("\t 4. Exit.");

            num = sc.nextInt();
            switch (num) {
                case 1:

                    makePayment(b, new ArrayList<BookstoreItem>());

                    break;
                case 2:

                    System.out.println("Please select from the following menu of options, by typing a number:");
                    System.out.println("\t 1. Regular Membership.");
                    System.out.println("\t 2. Premium Membership.");
                    System.out.println("\t 3. Set monthly payment status.");
                    num = sc.nextInt();
                    switch (num) {
                        case 1:
                            name.setIsPremium(false);
                            break;
                        case 2:
                            name.setIsPremium(true);
                            break;
                        case 3:
                            System.out.println("Please select from the following menu of options, by typing a number:");
                            System.out.println("\t 1. The fee has been paid.");
                            System.out.println("\t 2. The fee has not been paid.");
                            num = sc.nextInt();
                            switch (num) {
                                case 1:
                                    isFeePaid = true;

                                    break;

                                case 2:
                                    isFeePaid = false;
                                    break;
                            }
                            name.setIsMonthlyFeeDue(isFeePaid);
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Please enter the name of the item:");
                    donateItem(b, new ArrayList<BookstoreItem>());

                    break;

                case 4:
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
            }
        } while (num != 4);
        **/
    }

    public static void makePayment(Bookstore bookstore, ArrayList<BookstoreItem> purchases) {
        bookstore.getBookstoreInventory();
        ArrayList<BookstoreItem> inventory = bookstore.getBookstoreInventory();

        int x = 1;
        int z = 0;
        double p = 0;
        BookstoreItem item;
        for (BookstoreItem s : inventory) {

            System.out.println("Item Number: " + x + " Item Name: " + s.getCurrentName() + " Price: " + s.getCurrentPrice());
            x++;
        }
        do {
            Scanner scan = new Scanner(System.in);
            int y = scan.nextInt();
            if (y < inventory.size()) {
                purchases.add(inventory.get(y - 1));

                System.out.println("Press 2 to quit or any other number to choose another item to purchase.");
                z = scan.nextInt();
            }
        } while (z != 2);
        for (BookstoreItem s : purchases) {
            p = p + s.getCurrentPrice();
        }
        System.out.println("Total Cost: " + p);

    }

    public static void donateItem(Bookstore bookstore, ArrayList<BookstoreItem> donations) {
        bookstore.getBookstoreInventory();
        ArrayList<BookstoreItem> inventory = bookstore.getBookstoreInventory();

        int x = 1;

        BookstoreItem item;
        System.out.println("Please select the item you wish to donate.");
        for (BookstoreItem s : inventory) {

            System.out.println("Item Number: " + x + " Item Name: " + s.getCurrentName());
            x++;
        }

        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if (y < inventory.size()) {
            donations.add(inventory.get(y - 1));

        }

        for (BookstoreItem s : donations) {
            s.addOne();
            System.out.println("Thank you for donating " + s.getCurrentName() + ".");
        }

    }

}
