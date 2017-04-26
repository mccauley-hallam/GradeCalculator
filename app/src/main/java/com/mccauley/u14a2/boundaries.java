package com.mccauley.u14a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class boundaries extends AppCompatActivity
{
    //Globally declared variables
    TextView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boundaries);

        //Defining variables
        goBack = (TextView) findViewById(R.id.textView_goBack);

        goBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Creates intent, this class and the target class, transfers user to that activity
                Intent intent = new Intent(boundaries.this, startup.class);
                boundaries.this.startActivity(intent);
            }
        });
    }
}
