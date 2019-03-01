package pages;

import java.util.Calendar;
import java.util.Date;

public class Variables {

// create manager variables
    private static String emailData = "qwerty@i.ua";
    private static String passwordData = "qwerty1596";
    private static String managerUserName = "AutoManager";
    private static String firstNameManager = "MANAGER_NameAuto";
    private static String lastNameManager = "MANAGER_LastNameAuto" ;
    private static final String emailManager = "autoEmail" + Math.round(Math.random() * 100) + Math.round(Math.random() * 100) + "@i.ua";

    public static String getEmailData(){
        return emailData;
    }
    public static String getPasswordData(){
        return passwordData;
    }
    public static String getManagerUserName(){return managerUserName;}
    public static String getFirstNameManager(){return firstNameManager;}
    public static String getLastNameManager(){return lastNameManager;}
    public static String getEmailManager(){return emailManager;}

// create offer variables
    private static String advertiser = "adv_280119\n";
    private static String previewURL = "https://play.google.com/store/apps/details?id=com.rovio.dream";
    private static String offerName = "AUTO_OFFER_ZIP_" + Math.round(Math.random() * 1000);
    private static String trackingURL = previewURL + "&click_id={transaction_id}";
    private static String country = "all countries\n";
    private static String payout = "10";
    private static String thumbnail = "http://static1.squarespace.com/static/58b71e6f6a4963b4cc2c78b8/58d02ebbdb29d67782682bff/58d2b49f9de4bbab7ff0fba5/1494356335787";


    public static String getThumbnail(){ return thumbnail; }

    public static String getAdvertiser(){
        return advertiser;
    }

    public static String getPreviewURL(){
        return previewURL;
    }

    public static String getOfferName(){
        return offerName;
    }

    public static String getTrackingURL(){
        return trackingURL;
    }

    public static String getCountry(){
        return country;
    }

    public static String getPayout(){
        return payout;
    }
}
