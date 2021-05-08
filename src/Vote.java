package src;

/**
 * Users are able to vote on other user's event proposals with an upvote or
 * downvote. Users may only vote once. Users may change their vote if they
 * desire.
 */
public class Vote {
    private String authorID;
    private boolean isUpvote;

    /**
     * Users are able to vote on other user's event proposals with an upvote or
     * downvote. Users are only able to vote once
     * 
     * @param inputID   The ID of the user who voted
     * @param inputType The vote of the user
     */
    public Vote(String inputID, boolean inputType) {
        authorID = inputID;
        isUpvote = inputType;
    }

    /**
     * Returns the author ID
     * 
     * @return the author ID
     */
    public String getAuthorID() {
        return authorID;
    }

    /**
     * Switches the vote of the user.
     */
    public void switchValue() {
        isUpvote = !isUpvote;
    }
}

