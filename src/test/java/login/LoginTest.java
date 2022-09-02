package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void succesfullLoginTest() {
        LoginPage loginpage = homepage.clickloginButton();
        assertEquals(loginpage.getText(),"Login to your account","TextError!");
        loginpage.setEmail("azmarslnts@hotmail.com");
        loginpage.setPassword("123");
        loginpage.clicksignInButton();
        assertEquals(loginpage.getWarningText(),"Your email or password is incorrect!","Warning message is incorrect");

    }

}


