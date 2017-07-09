package com.whitecitycode.cgeorge.notetoself;

/**
 * Created by cgeorge on 7/9/17.
 */

public class Note {

    private String mTitle;
    private String mDescription;
    private Boolean mIdeea;
    private Boolean mTodo;
    private Boolean mImportant;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public Boolean isIdeea() {
        return mIdeea;
    }

    public void setIdeea(Boolean mIdeea) {
        this.mIdeea = mIdeea;
    }

    public Boolean isTodo() {
        return mTodo;
    }

    public void setTodo(Boolean mTodo) {
        this.mTodo = mTodo;
    }

    public Boolean isImportant() {
        return mImportant;
    }

    public void setImportant(Boolean mImportant) {
        this.mImportant = mImportant;
    }
}
