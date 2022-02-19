/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresjustinproject3;

/**
 *
 * @author jdt63
 */
public class BookstoreMembers {

    protected String name;
    protected boolean isPremium;
    protected boolean isMonthlyFeeDue;
    protected double moneySpent = 0;
    protected String paymentMethod;

    public BookstoreMembers(String customerName, boolean customerPremium, String method) {
        if (customerPremium == false) {
            isMonthlyFeeDue = false;
            name = customerName;
            isPremium = customerPremium;
            paymentMethod = method;

        }
    }

    /**
     * Returns the name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns whether the member is premium.
     *
     * @return
     */
    public boolean getIsPremium() {
        return isPremium;
    }

    /**
     * Returns whether the monthly fee is due.
     *
     * @return
     */
    public boolean getIsMonthlyFeeDue() {
        return isMonthlyFeeDue;
    }

    /**
     * Returns the money spent.
     *
     * @return
     */
    public double getMoneySpent() {
        return moneySpent;
    }

    /**
     * Returns the payment method.
     *
     * @return
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Determine whether the user is premium.
     *
     * @param isPremium
     */
    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
        if (isPremium == false) {
            isMonthlyFeeDue = false;
        }
    }

    /**
     * Set whether the monthly fee is due.
     *
     * @param isMonthlyFeeDue
     */
    public void setIsMonthlyFeeDue(boolean isMonthlyFeeDue) {
        this.isMonthlyFeeDue = isMonthlyFeeDue;
    }

    /**
     * Set the payment method.
     *
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Adds the input to moneySpent.
     *
     * @param charge
     */
    public void chargePrice(double charge) {
        moneySpent = moneySpent + charge;
    }

}
