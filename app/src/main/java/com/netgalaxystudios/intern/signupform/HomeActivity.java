package com.netgalaxystudios.intern.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    public static final String EXTRA = "EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        User user = (User)getIntent().getSerializableExtra(EXTRA);
        String welcome = String.format(getResources().getString(R.string.welcome_format), user.getUsername());
        String info = getIntent().getStringExtra(EXTRA);

        Log.d(TAG,"Username is " + user.getUsername());
        TextView welcomeText = (TextView)findViewById(R.id.welcome_text);
        welcomeText.setText(welcome);
        
    }
}
