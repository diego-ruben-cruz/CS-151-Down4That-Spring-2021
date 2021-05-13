
public class User {
    private String userID;
    private String email;
    private int hashedPassword;

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
        // avoid it being used as a plaintext, hashCode() is a placeholder for now.
        hashedPassword = inputPassword.hashCode();
    }

    /**
     * Fetches the ID associated with a User.
     *
     * @return userID the user's ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Fetches the email associated with a User.
     *
     * @return email the user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Fetches the hashed password associated with a User.
     *
     * @return hashedPassword the user's password
     */
    public int getHashedPassword() {
        return hashedPassword;
    }

    // /**
    // * Sets user's ID to a new ID
    // *
    // * @param newUserID the new User ID
    // */
    // public void setUserID(String newUserID) {
    // this.userID = newUserID;
    // }

    /**
     * Sets user email to a new email address
     *
     * @param newEmail the new user email
     */
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * Sets user password to a new password
     *
     * @param newPassword the new password for user
     */
    public void setHashedPassword(String newPassword) {
        this.hashedPassword = newPassword.hashCode();
        // note: hashCode used as placeholder for hashing algorithm;
    }

}