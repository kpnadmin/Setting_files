package seveno.miniSeconds.game.model;

import java.util.Date;

public class ModelPlay {
   private String Playnum   ;
   private Date PlayDate    ;
   private int g_score      ;
   private String gameId    ;
   private String userId    ;
   private int step         ;
   private String Playtime  ;
public String getPlaynum() {
    return Playnum;
}
public void setPlaynum(String playnum) {
    Playnum = playnum;
}
public Date getPlayDate() {
    return PlayDate;
}
public void setPlayDate(Date playDate) {
    PlayDate = playDate;
}
public int getG_score() {
    return g_score;
}
public void setG_score(int g_score) {
    this.g_score = g_score;
}
public String getGameId() {
    return gameId;
}
public void setGameId(String gameId) {
    this.gameId = gameId;
}
public String getUserId() {
    return userId;
}
public void setUserId(String userId) {
    this.userId = userId;
}
public int getStep() {
    return step;
}
public void setStep(int step) {
    this.step = step;
}
public String getPlaytime() {
    return Playtime;
}
public void setPlaytime(String playtime) {
    Playtime = playtime;
}
public ModelPlay(String playnum, Date playDate, int g_score, String gameId,
        String userId, int step, String playtime) {
    super();
    Playnum = playnum;
    PlayDate = playDate;
    this.g_score = g_score;
    this.gameId = gameId;
    this.userId = userId;
    this.step = step;
    Playtime = playtime;
}
public ModelPlay() {
    super();
}
@Override
public String toString() {
    return "ModelPlay [Playnum=" + Playnum + ", PlayDate=" + PlayDate
            + ", g_score=" + g_score + ", gameId=" + gameId + ", userId="
            + userId + ", step=" + step + ", Playtime=" + Playtime + "]";
}
    
    
}
