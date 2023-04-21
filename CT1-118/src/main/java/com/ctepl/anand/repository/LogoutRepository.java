·       Logging out of the application should be successful.

@Repository
public interface LogoutRepository {

    // Method to logout from the application
    public void logout();
    
    // Method to check if the logout was successful
    public boolean isLoggedOut();

    // Method to redirect the user to the login screen
    public void redirectToLoginScreen();
}