package com.example.user.amakem_help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityHelp extends AppCompatActivity {

    public Button helpButton;
    public void init(){
        helpButton = (Button)findViewById(R.id.help_button);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whenHelpClick = new Intent(MainActivityHelp.this,MainActivityHelpListItem.class);
                startActivity(whenHelpClick);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_help);
        init();
    }
}
