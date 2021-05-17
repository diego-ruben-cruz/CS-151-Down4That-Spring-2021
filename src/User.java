/**
 * Main class for storing information about a user. The main information that
 * will be accessed, but never modified, is the userID variable.
 */
public class User {
    private String userID;
    private String email;
    private int hashedPassword;

    /**
     * Creates a User object with a given input email, username, and password.
     * 
     * @param inputEmail    The given email to be used.
     * @param inputUsername The given username to be used.
     * @param inputPassword The given password that will subsequently be hashed for
     *                      security reasons.
     */
    public User(String inputEmail, String inputUsername, String inputPassword) {
        email = inputEmail;
        userID = inputUsername;

        // need to find some hashing algo that we can use to input the password and
        // avoid it being used as a plaintext, hashCode() is a placeholder for this
        // prototype.
        hashedPassword = inputPassword.hashCode();
    }

    /**
     * Fetches the ID associated with a User.
     *
     * @return The UserID associated with this user.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Fetches the email associated with a User.
     *
     * @return The email address associated with this user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Fetches the hashed password associated with a user.
     *
     * @return The hashed password associate with this user.
     */
    public int getHashedPassword() {
        return hashedPassword;
    }

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
     * @param newPassword the new password for user that will subsequently be
     *                    hashed.
     */
    public void setHashedPassword(String newPassword) {
        this.hashedPassword = newPassword.hashCode();
        // Note: hashCode used as placeholder for hashing algorithm
    }
}