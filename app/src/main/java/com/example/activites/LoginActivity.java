package com.example.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView logintext;
    private TextView mdptext;
    public static Activity logActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        logintext = (TextView) findViewById(R.id.ident);
        mdptext = (TextView) findViewById(R.id.mdp);

        Button login = (Button) findViewById(R.id.login);

        final Intent intentlogin = new Intent(this, NewsActivity.class);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentlogin.putExtra("login", logintext.getText().toString());
                Application app = (Application) getApplicationContext();
                app.setLogin(logintext.getText().toString());
                app.setMdp(mdptext.getText().toString());

                startActivity(intentlogin);
            }
        });



        logActivity = this;

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Finir l'activité ici

    }



    private static final String TAG = "LOGIN";
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "terminaison de l'activité "+getLocalClassName());
    }


}
