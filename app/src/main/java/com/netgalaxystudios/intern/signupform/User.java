package com.netgalaxystudios.intern.signupform;

import java.io.Serializable;

/**
 * Created by Intern on 11/3/16.
 */

public class User implements Serializable {
    private String mUsername;
    private String mPassword;

    User(String username, String password) {
        mUsername = username;
        mPassword = password;
    }

    public String getUsername() {
        return mUsername;
    }
}
