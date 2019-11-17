package com.example.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView logintext;
    private TextView mdptext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        logintext = (TextView) findViewById(R.id.infosidentmdp);
        mdptext = (TextView) findViewById(R.id.infosmdp);

        Application app = (Application) getApplicationContext();
        String login = app.getLogin();
        String mdp = app.getMdp();

        logintext.setText(login);
        mdptext.setText(mdp);
        Button ok = (Button) findViewById(R.id.ok);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
