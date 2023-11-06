package basics.separateFileClass;

public class practice {
    public UserDetails loginUser(String userName, String password){
        Boolean isValid = validateUserDetails(userName, password);
        if(!isValid) return null;
        return getUserDetails(userName, password);
    }

    private UserDetails getUserDetails(String userName, String password) {
        return new UserDetails();
    }

    private Boolean validateUserDetails(String userName, String password) {
        return userName.isEmpty() && password.isEmpty();
    }

}
