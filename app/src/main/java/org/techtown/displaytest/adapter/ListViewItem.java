package org.techtown.displaytest.adapter;

public class ListViewItem {
    private int type ;
    private String titleStr ;
    private String descStr ;

    public void setType(int type) {
        this.type = type;
    }
    public void setTitle(String title) { titleStr = title; }

    public void setDesc(String desc) {
        descStr = desc;
    }

    public int getType() { return this.type; }
    public String getTitle() {
        return this.titleStr;
    }
    public String getDesc() {
        return this.descStr;
    }

}