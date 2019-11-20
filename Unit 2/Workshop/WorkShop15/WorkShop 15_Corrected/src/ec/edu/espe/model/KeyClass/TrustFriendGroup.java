/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.KeyClass;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TrustFriendGroup {
    private String label;
    private ArrayList<Account> accounts;

    /**
     * @return the accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    
}
