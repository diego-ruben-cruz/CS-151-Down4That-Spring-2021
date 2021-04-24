public class User {
    private String userID;
    private String email;
    private String hashedPassword;

    public User(String inputEmail, String inputUsername, String inputPassword){
        email = inputEmail;
        userID = inputUsername;
        //need to find some hashing algo that we can use to input the password and avoid it being used as a plaintext
        //hashedPassword = inputPassword.hashAlgo(); 
    }
    
    
}
