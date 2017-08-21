package seveno.miniSeconds.game.model;

public class ModelUser {
    private String  userId  = "";
    private String  gmail   = "";
    private String  my_img  = "";
    private String  uName   = "";
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getMy_img() {
        return my_img;
    }
    public void setMy_img(String my_img) {
        this.my_img = my_img;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public ModelUser(String userId, String gmail, String my_img, String uName) {
        super();
        this.userId = userId;
        this.gmail = gmail;
        this.my_img = my_img;
        this.uName = uName;
    }
    @Override
    public String toString() {
        return "ModelUser [userId=" + userId + ", gmail=" + gmail + ", my_img="
                + my_img + ", uName=" + uName + "]";
    }

    
        
    
}
