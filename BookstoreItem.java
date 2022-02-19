package torresjustinproject3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdt63
 */
public abstract class BookstoreItem {

    protected String currentName = "Enter name here.";
    protected String author = "Enter name here.";
    protected double currentPrice = 0;
    protected int index = 0;
    protected int numInInventory = 0;

    public BookstoreItem(int theIndex, String name, String theAuthor, int inventory, double price) {

        currentName = name;
        author = theAuthor;
        currentPrice = price;
        index = theIndex;
        numInInventory = inventory;

    }

    /**
     * Gets the current Name.
     *
     * @return
     */
    public String getCurrentName() {
        return currentName;
    }

    /**
     * Sets the current Name.
     *
     * @return
     */
    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    /**
     * Gets the current Price.
     *
     * @return
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the current Price.
     *
     * @return
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Gets the current Stock Number.
     *
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the current Stock Number.
     *
     * @return
     */
    public void setIndex(int theIndex) {
        this.index = theIndex;
    }

    /**
     * Gets the current Number in Inventory.
     *
     * @return
     */
    public int getNumInInventory() {
        return numInInventory;
    }

    /**
     * Sets the current Number in Inventory.
     *
     * @return
     */
    public void setNumInInventory(int numInInventory) {
        this.numInInventory = numInInventory;
    }

    /**
     * Adds a single one of the product to the numInInventory.
     */
    public void addOne() {
        this.numInInventory++;
    }
}
