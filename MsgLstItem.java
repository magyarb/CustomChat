package hu.bme.aut.hf.customchat;

/**
 * Created by Balázs on 2015.05.17..
 */
public class MsgLstItem {
    public int getNewCnt() {
        return newCnt;
    }

    public void setNewCnt(int newCnt) {
        this.newCnt = newCnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int newCnt;
    private String name;

    public MsgLstItem(int newCnt, String name) {
        this.newCnt = newCnt;
        this.name = name;
    }
}
