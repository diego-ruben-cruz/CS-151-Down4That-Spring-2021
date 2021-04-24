package src;

public class Vote {
    private String authorID;
    private boolean isUpvote;

    public Vote(String inputID, boolean inputType){
        authorID = inputID;
        isUpvote = inputType;
    }

    public String getAuthorID(){
        return authorID;
    }

    public void switchValue(){
        isUpvote = !isUpvote; 
    }
}