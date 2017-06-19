package israel.firebasedatabase.models;

/**
 * Created by hackeru on 19/06/2017.
 */

public class ChatItem {
    private String message;
    private String userID;
    private String profileImage = "http://donatered-asset.s3.amazonaws.com/assets/default/default_user-884fcb1a70325256218e78500533affb.jpg";
    private String data;

    public ChatItem() {
    }

    public ChatItem(String message, String userID, String profileImage, String data) {
        this.message = message;
        this.userID = userID;
        if (profileImage != null)
        this.profileImage = profileImage;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        if (profileImage != null)
        this.profileImage = profileImage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ChatItem{" +
                "message='" + message + '\'' +
                ", userID='" + userID + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
