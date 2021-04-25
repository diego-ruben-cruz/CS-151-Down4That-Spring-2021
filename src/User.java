package src;

public class User {
    private String userID;
    private String email;
    private String hashedPassword;

    // * @author Akela Do-Ho//
    /**
     * @param inputEmail    this will hold the user's email
     * @param inputUsername this will hold user's username
     * @param inputPassword this will hold user's passcode Constructor for user
     *                      object which in hold user's email, username, and their
     *                      password of choice.
     */
    public User(String inputEmail, String inputUsername, String inputPassword) {
        email = inputEmail;
        userID = inputUsername;
        // need to find some hashing algo that we can use to input the password and
        // avoid it being used as a plaintext
        // hashedPassword = inputPassword.hashAlgo();
    }

    /**
     * Get's the user's ID.
     *
     * @return userID the user's ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Get's the user's email address
     *
     * @return email the user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get's the user's password
     *
     * @return hashedPassword the user's password
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * Set's user's Id to a new Id
     *
     * @param newUserID the new user id
     */
    public String setUserID(String newUserID) {
        this.userID = newUserID;
    }

    /**
     * Set's user's email to a new email address
     *
     * @param newEmail the new user email
     */
    public String setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * Set's user's password to a new password
     *
     * @param newPassword the new password for user
     */
    public String setHashedPassword(String newPassword) {
        this.hashedPassword = newPassword;
    }

}
