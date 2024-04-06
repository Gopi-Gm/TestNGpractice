package Booking;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class pmt {
    
    @Parameters({"URL", "Username", "Password"}) // Fix parameter names
    @Test
    public void tc1(@Optional String url, String Uname, String Pwd) {
        System.out.println("My URL is " + url);
        System.out.println("My database username is " + Uname);
        System.out.println("My password is " + Pwd);
    }
}
