/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresjustinproject3;

import java.util.ArrayList;

/**
 *
 * @author jdt63
 */
public class MemberRoster {

    protected ArrayList<BookstoreMembers> membersList = new ArrayList<BookstoreMembers>();
    int numMembers = 3;
    private String memberName;

    BookstoreMembers member1 = new BookstoreMembers("Alvin", false, "Credit");
    BookstoreMembers member2 = new BookstoreMembers("Simon", true, "Debit");
    BookstoreMembers member3 = new BookstoreMembers("Theodore", true, "Debit");

    /**
     * Adds the specified member.
     *
     * @param newMemberName
     * @param isPremium
     * @param method
     * @return
     */
    public boolean addMember(String newMemberName, boolean isPremium, String method) {

        boolean isMemberThere = false;
        for (BookstoreMembers s : membersList) {
            if (s.equals(newMemberName)) {

                isMemberThere = true;
                BookstoreMembers newMember = new BookstoreMembers(newMemberName, isPremium, method);
                return isMemberThere;
            }

        }

        numMembers++;
        BookstoreMembers memberNumMembers = new BookstoreMembers(memberName, false, "Credit");
        membersList.add(memberNumMembers);
        return isMemberThere;

    }

    /**
     * Removes the specified member.
     *
     * @param memberName
     * @return
     */
    public boolean removeMember(BookstoreMembers memberName) {
        boolean isMemberThere = false;
        for (BookstoreMembers s : membersList) {
            if (s.equals(memberName)) {
                membersList.remove(memberName);
                isMemberThere = true;
                numMembers--;
            }
        }
        return isMemberThere;
    }

}
