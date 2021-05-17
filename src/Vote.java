/**
 * Class designed to capture user opinions about event proposals. Users are able
 * to vote on other users event proposals with an upvote or downvote. Users may
 * only vote once, and may change their vote if they desire.
 * 
 * @author DCruz
 */
public class Vote {
    private String authorID;
    private boolean isUpvote;

    /**
     * Creates a vote object with a given userID and boolean.
     * 
     * @param inputID   The ID of the user who voted
     * @param inputType The vote of the user
     */
    public Vote(String inputID, boolean inputType) {
        authorID = inputID;
        isUpvote = inputType;
    }

    /**
     * Fetches the User ID associated with this vote.
     * 
     * @return The User ID
     */
    public String getAuthorID() {
        return authorID;
    }

    /**
     * Switches the value of the vote to be the opposite.
     */
    public void switchValue() {
        isUpvote = !isUpvote;
    }

    /**
     * Retreives the value of the Vote object. Mainly used for testing purposes in
     * the current implemenation.
     * 
     * @return Whether the Vote is an upvote or not (a downvote)
     */
    protected boolean getValue() {
        return this.isUpvote;
    }
}