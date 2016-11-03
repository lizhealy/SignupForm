package com.netgalaxystudios.intern.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    Button mSubmitButton;
    EditText mUsernameInput;
    EditText mPasswordInput;
    EditText mConfirmInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSubmitButton = (Button)findViewById(R.id.submit_button);
        mUsernameInput = (EditText)findViewById(R.id.username_input);
        mPasswordInput = (EditText)findViewById(R.id.password_input);
        mConfirmInput = (EditText)findViewById(R.id.confirmatin_input);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameInput.getText().toString();
                String password = mPasswordInput.getText().toString();
                String confirmation = mConfirmInput.getText().toString();

                if(password.equals(confirmation)) {
                    User newUser = new User(username, password);
                    Log.d(TAG, "Password Successful");

                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtra(HomeActivity.EXTRA, newUser);
                    startActivity(i);
                }

            }
        });
    }
}
