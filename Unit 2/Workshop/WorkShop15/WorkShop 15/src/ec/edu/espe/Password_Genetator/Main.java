/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Password_Genetator;

import ec.edu.espe.model.Accounts.Account;
import ec.edu.espe.model.Accounts.Comment;
import ec.edu.espe.model.Accounts.ComputerNetworkAccount;
import ec.edu.espe.model.Accounts.DesktopApplicationAccount;
import ec.edu.espe.model.Accounts.PhysicalAccessAccount;
import ec.edu.espe.model.Accounts.Property;
import ec.edu.espe.model.Accounts.Reminders;
import ec.edu.espe.model.Accounts.Username;
import ec.edu.espe.model.Accounts.WebBasedAccount;
import ec.edu.espe.model.Folders.InformationNode;
import ec.edu.espe.model.Folders.RootFolder;
import ec.edu.espe.model.KeyClass.AccountNote;
import ec.edu.espe.model.KeyClass.InformationOwner;
import ec.edu.espe.model.KeyClass.Note;
import ec.edu.espe.model.KeyClass.SystemAdminUser;
import ec.edu.espe.model.KeyClass.TrustFriendGroup;
import ec.edu.espe.model.KeyClass.TrustedFriend;
import ec.edu.espe.model.KeyClass.User;
import ec.edu.espe.model.Login_GUI.Form;
import ec.edu.espe.model.Login_GUI.LoginForm;
import ec.edu.espe.model.Password_Generator.EndDate;
import ec.edu.espe.model.Password_Generator.InformationUser;
import ec.edu.espe.model.Password_Generator.PasswordCriteria;
import ec.edu.espe.model.Password_Generator.PasswordFragment;
import ec.edu.espe.model.Password_Generator.PasswordGenerator;
import ec.edu.espe.model.Password_Generator.StartDate;
import ec.edu.espe.model.User_Authentication.Authenticator;
import ec.edu.espe.model.User_Authentication.SetActiveUser;
import ec.edu.espe.model.User_Authentication.UserSession;
import java.util.Scanner;
import sun.security.util.Password;


/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        Account accout = new Account();
        Comment comment = new Comment();
        ComputerNetworkAccount computerNetworkAccount = new ComputerNetworkAccount();
        DesktopApplicationAccount desktopApplicationAccount = new DesktopApplicationAccount();
        Password password = new Password();
        PhysicalAccessAccount physicalAccessAccount = new PhysicalAccessAccount();
        Property property = new Property();
        Reminders reminders = new Reminders();
        Username username = new Username();
        WebBasedAccount webBasedAccount = new WebBasedAccount();
        AccountNote accountNote = new AccountNote();
        InformationNode informationNode = new InformationNode();
        RootFolder rootFolder = new RootFolder(); 
        AccountNote AccountNote = new AccountNote();
        InformationOwner informationOwner = new InformationOwner();
        Note note = new Note();
        SystemAdminUser systemAdminUser = new SystemAdminUser();
        TrustFriendGroup trustFriendGroup = new TrustFriendGroup();
        TrustedFriend trustedFriend = new TrustedFriend();
        User user = new User();
        Form form = new Form();
        LoginForm loginForm = new LoginForm();
        EndDate endDate = new EndDate();
        InformationUser informationUser = new InformationUser();
        PasswordCriteria passwordCriteria = new PasswordCriteria();
        PasswordFragment passwordFragment = new PasswordFragment();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        StartDate startDate = new StartDate();
        Authenticator authenticator = new Authenticator();
        SetActiveUser setActiveUser = new SetActiveUser();
        UserSession userSession = new UserSession();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
