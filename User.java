public class User {
    private String userID;
    private String email;
    private String hashedPassword;

    /**
     * @param inputEmail    - this will hold the user's email
     * @param inputUsername - this will hold user's username
     * @param inputPassword - this will hold user's passcode
     * @author Akela Do-Ho
     * Constructor for user object which in hold user's email, username,
     * and their password of choice
     */
    public User(String inputEmail, String inputUsername, String inputPassword) {
        email = inputEmail;
        userID = inputUsername;
        //need to find some hashing algo that we can use to input the password and avoid it being used as a plaintext
        //hashedPassword = inputPassword.hashAlgo();
    }

    /**
     * Get's the user's ID
     *
     * @return userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Get's the user's email address
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get's the user's password
     *
     * @return hashedPassword
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * Set's user's Id to a new Id.
     *
     * @param newUserID
     */
    public String setUserID(String newUserID) {
        this.userID = newUserID;
    }

    /**
     * Set's user's email to a new email address.
     *
     * @param newEmail
     */
    public String setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * Set's user's password to a new password.
     *
     * @param newPassword
     */
    public String setHashedPassword(String newPassword) {
        this.hashedPassword = newPassword;
    }

}
