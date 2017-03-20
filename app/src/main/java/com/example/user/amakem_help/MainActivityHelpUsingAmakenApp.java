package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityHelpUsingAmakenApp extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help_using_amaken_app);

        listView= (ListView)findViewById(R.id.help_using_amaken_app);
        String[] help = new String[] {
                "Home Page",
                "Add photo or review to place/event",
               // "Adjust Notification",
                "Invite Friend to use Amaken",
              //  "Places you liked",
              //  "Places you Bookmarked",
              //  "Places you reviewd",
               // "Change Interests",
               // "Change place/event information"
                "Profile"


        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, help);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent firstActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp1.class);
                        startActivity(firstActivity);

                        break;
                    case 1:
                        Intent secActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp2.class);
                        startActivity(secActivity);
                        break;
                    case 2:
                        Intent legalPrivacyActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp3.class);
                        startActivity(legalPrivacyActivity);

                        break;

                    case 3:
                        Intent thirdActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp4.class);
                        startActivity(thirdActivity);

                        break;
                    case 4:
                        Intent foActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp5.class);
                        startActivity(foActivity);

                        break;

                    case 5:
                        Intent seActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp6.class);
                        startActivity(seActivity);
                        break;
                    case 6:
                        Intent sevActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp7.class);
                        startActivity(sevActivity);

                        break;

                    case 7:
                        Intent eaActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp8.class);
                        startActivity(eaActivity);

                        break;

                    case 8:
                        Intent ninActivity = new Intent(MainActivityHelpUsingAmakenApp.this,MainActivityUsingAmakenApp9.class);
                        startActivity(ninActivity);
                        break;
                    default:
                        break;

                }
            }
        });

    }
}
