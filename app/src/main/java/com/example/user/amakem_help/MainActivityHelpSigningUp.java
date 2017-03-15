package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityHelpSigningUp extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help_signing_up);
        listView= (ListView)findViewById(R.id.help_signing_up);
        String[] help = new String[] {
                "Download Amaken app for android",
                "Create Account",
                "Choosing Category",
                "Add place or event"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, help);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent overviewActivity = new Intent(MainActivityHelpSigningUp.this,MainActivityHelpSigningUp1.class);
                        startActivity(overviewActivity);

                        break;
                    case 1:
                        Intent signingUpActivity = new Intent(MainActivityHelpSigningUp.this,MainActivityHelpSigningUp2.class);
                        startActivity(signingUpActivity);
                        break;
                    case 2:
                        Intent legalPrivacyActivity = new Intent(MainActivityHelpSigningUp.this,MainActivityHelpSigningUp3.class);
                        startActivity(legalPrivacyActivity);

                        break;

                    case 3:
                        Intent usingAppActivity = new Intent(MainActivityHelpSigningUp.this,MainActivityHelpSigningUp4.class);
                        startActivity(usingAppActivity);

                        break;

                    default:
                        break;

                }
            }
        });

    }
    
}
