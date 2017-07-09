package com.whitecitycode.cgeorge.notetoself;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cgeorge on 7/9/17.
 */

public class Note {

    private String mTitle;
    private String mDescription;
    private Boolean mIdeea;
    private Boolean mTodo;
    private Boolean mImportant;

    private static final String JSON_TITLE = "title";
    private static final String JSON_DESCRIPTION = "description";
    private static final String JSON_IDEA = "idea";
    private static final String JSON_TODO = "todo";
    private static final String JSON_IMPORTANT = "important";

    public Note(JSONObject jo) throws JSONException {
        mTitle = jo.getString(JSON_TITLE);
        mDescription = jo.getString(JSON_DESCRIPTION);
        mIdeea = jo.getBoolean(JSON_IDEA);
        mTodo = jo.getBoolean(JSON_TODO);
        mImportant = jo.getBoolean(JSON_IMPORTANT);
    }

    public Note(){

    }

    public JSONObject convertToJSON() throws JSONException{
        JSONObject jo = new JSONObject();

        jo.put(JSON_TITLE, mTitle);
        jo.put(JSON_DESCRIPTION, mDescription);
        jo.put(JSON_IDEA, mIdeea);
        jo.put(JSON_TODO, mTodo);
        jo.put(JSON_IMPORTANT, mImportant);

        return jo;
    }

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

    public Boolean isIdea() {
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
