package com.example.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    private TextView infosident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        infosident = (TextView) findViewById(R.id.infosident);
        Button about = (Button) findViewById(R.id.about);
        Button logout = (Button) findViewById(R.id.logout);
        Button details = (Button) findViewById(R.id.details);


        Intent recupinfosintent = getIntent();
        String login = recupinfosintent.getStringExtra("login");


        Log.d("newsms",login+"" );


        infosident.setText(login);
        String url = "http://android.busin.fr/";

        final Intent intentlogin = new Intent(this, LoginActivity.class);
        final Intent intentdetails = new Intent(this, DetailsActivity.class);
        final Intent internetintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(internetintent);
            }
        });


        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intentdetails);


            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Finir l'activité ici

        LoginActivity.logActivity.finish();

    }
}
