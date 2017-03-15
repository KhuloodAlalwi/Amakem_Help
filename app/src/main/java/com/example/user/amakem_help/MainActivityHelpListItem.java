package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityHelpListItem extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help_list_item);
        listView= (ListView)findViewById(R.id.list_item);
        String[] help = new String[] {
                "Overview",
                "Signing up",
                "legal and Privacy",
                "Using Amaken App"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, help);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent overviewActivity = new Intent(MainActivityHelpListItem.this,MainActivityHelpOverview.class);
                        startActivity(overviewActivity);

                        break;
                    case 1:
                        Intent signingUpActivity = new Intent(MainActivityHelpListItem.this,MainActivityHelpSigningUp.class);
                        startActivity(signingUpActivity);
                        break;
                    case 2:
                        Intent legalPrivacyActivity = new Intent(MainActivityHelpListItem.this,MainActivityHelpLegalAndPrivacy.class);
                        startActivity(legalPrivacyActivity);

                        break;

                    case 3:
                        Intent usingAppActivity = new Intent(MainActivityHelpListItem.this,MainActivityHelpUsingAmakenApp.class);
                        startActivity(usingAppActivity);

                        break;

                    default:
                        break;

                }
            }
        });

    }
}
