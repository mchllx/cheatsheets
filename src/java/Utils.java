package sg.edu.nus.iss.contact.services;

import java.util.LinkedList;
import java.util.List;

import jakarta.servlet.http.HttpSession;
import sg.edu.nus.iss.contact.model.Contact;

public class Utils {

    // //contactController
    // public static final String VIEWS_CONTACT_CREATE_OR_LOAD_FORM="createOrSaveContactForm";
    // public static final String VIEWS_CONTACT_LIST="contacts";

    // public static final String ATTR_CONTACT = "contact"; 
    // public static final String ATTR_CONTACT_LIST = "contactsList"; 
    // public static final String ATTR_USERNAME = "username"; 

    //appconfig
    public static final String BEAN_REDIS = "myredis";

    //contactRepo
    public static final Integer F_NAME = 0;
    public static final Integer F_EMAIL = 1;
    public static final Integer F_PHONENO = 2;
    public static final Integer F_DATEOFBIRTH = 3;
    public static final Integer F_CONTACTID = 4;

    //get session id:"contactsList
    public static List<Contact> getSession (HttpSession session) {
        List<Contact> contactsList = (List<Contact>)session.getAttribute("contactsList");
        if (contactsList == null) {
            contactsList = new LinkedList<>();
            session.setAttribute("contactsList", contactsList);
        } return contactsList; 
    }
}
