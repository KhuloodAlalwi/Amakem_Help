package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityHelpLegalAndPrivacy extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help_legal_and_privacy);
        listView= (ListView)findViewById(R.id.help_legal_and_privacy);
        String[] help = new String[] {
                "Amaken Guidlines",
                "Privacy",
                "Permission",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, help);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent overviewActivity = new Intent(MainActivityHelpLegalAndPrivacy.this,MainActivityHelpSigningUp1.class);
                        startActivity(overviewActivity);

                        break;
                    case 1:
                        Intent signingUpActivity = new Intent(MainActivityHelpLegalAndPrivacy.this,MainActivityHelpSigningUp2.class);
                        startActivity(signingUpActivity);
                        break;
                    case 2:
                        Intent legalPrivacyActivity = new Intent(MainActivityHelpLegalAndPrivacy.this,MainActivityHelpSigningUp3.class);
                        startActivity(legalPrivacyActivity);

                        break;



                    default:
                        break;

                }
            }
        });

    }
}
