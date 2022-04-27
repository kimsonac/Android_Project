package kr.hnu.androidproject;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String pw;

    public User(String i, String p)
    {
        id = i;
        pw = p;
    }

    public String getId()
    {
        return id;
    }

    public String getPw()
    {
        return pw;
    }
}
