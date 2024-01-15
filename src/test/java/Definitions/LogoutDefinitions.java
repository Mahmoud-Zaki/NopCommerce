package Definitions;

import Pages.Header;

public class LogoutDefinitions {
    private final Header header = new Header();

    public void logout(){
        header.logout();
    }
    public Boolean registrationAppears(){
        return header.getRegisterText();
    }
}