package torresjustinproject3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author jdt63
 */
public class Bookstore {

    public Bookstore() {

    }

    protected ArrayList<BookstoreItem> bookstoreInventory = new ArrayList<>();

    Book book1 = new Book(1, "Horton Hears a Who", "Dr. Seuss", 5, 4.99);
    CD CD1 = new CD(2, "Axel F", "Harold Faltermayer", 6, 9.99);
    DVD DVD1 = new DVD(3, "Beauty and the Beast", "Gary Trousdale", 6, 6.99);

    /**
     * Adds a Book to the bookstore Inventory.
     *
     * @param newItemName
     * @return
     */
    public boolean addBook(Book newItemName) {

        boolean isItemThere = false;
        for (BookstoreItem s : bookstoreInventory) {
            if (s.equals(newItemName)) {

                isItemThere = true;
                return isItemThere;
            }

        }
        bookstoreInventory.add(newItemName);
        return isItemThere;

    }

    /**
     * Adds a CD to the bookstore Inventory.
     *
     * @param newItemName
     * @return
     */
    public boolean addCD(CD newItemName) {

        boolean isItemThere = false;
        for (BookstoreItem s : bookstoreInventory) {
            if (s.equals(newItemName)) {

                isItemThere = true;
                return isItemThere;
            }

        }
        bookstoreInventory.add(newItemName);
        return isItemThere;

    }

    /**
     * Adds a DVD to the bookstore Inventory.
     *
     * @param newItemName
     * @return
     */
    public boolean addDVD(DVD newItemName) {

        boolean isItemThere = false;
        for (BookstoreItem s : bookstoreInventory) {
            if (s.equals(newItemName)) {

                isItemThere = true;
                return isItemThere;
            }

        }
        bookstoreInventory.add(newItemName);
        return isItemThere;

    }

    /**
     * Removes an item from the bookstore Inventory.
     *
     * @param itemName
     * @return
     */
    public void removeItem(int itemIndex) {
        bookstoreInventory.remove(itemIndex);
    }

    /**
     * Finds the specified item.
     *
     * @param itemName
     * @return
     */
    public int findItem(String itemName) {
        boolean isItemThere = false;
        for (BookstoreItem s : bookstoreInventory) {
            if (s.equals(itemName)) {

                isItemThere = true;
                return s.getIndex();
            }

        }

        return -1;

    }

    /**
     * Returns the bookstoreInventory.
     *
     * @return
     */
    public ArrayList<BookstoreItem> getBookstoreInventory() {
        return bookstoreInventory;
    }

}
