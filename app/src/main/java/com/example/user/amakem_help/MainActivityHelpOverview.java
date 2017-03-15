package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityHelpOverview extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help_overview);
        listView= (ListView)findViewById(R.id.help_overview);
        String[] help = new String[] {
                "How dose Amaken app work",
                "Dose Amaken cover my city",
                "Is Amaken available international"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, help);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent overviewActivity = new Intent(MainActivityHelpOverview.this,MainActivityHelpOverview1.class);
                        startActivity(overviewActivity);

                        break;
                    case 1:
                        Intent signingUpActivity = new Intent(MainActivityHelpOverview.this,MainActivityHelpOverview2.class);
                        startActivity(signingUpActivity);
                        break;
                    case 2:
                        Intent legalPrivacyActivity = new Intent(MainActivityHelpOverview.this,MainActivityHelpOverview3.class);
                        startActivity(legalPrivacyActivity);

                        break;

                    default:
                        break;

                }
            }
        });

    }

}
