package com.mccauley.u14a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class startup extends AppCompatActivity
{
    //Globally declared variables
    RadioButton radio_Software, radio_Hardware;
    Button btn_Continue;
    TextView textView_About;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);

        //Defining variables
        textView_About = (TextView) findViewById(R.id.textView_About);
        radio_Hardware = (RadioButton) findViewById(R.id.radio_Hardware);
        radio_Software = (RadioButton) findViewById(R.id.radio_Software);
        btn_Continue = (Button) findViewById(R.id.btn_Continue);

        /*
        On click listener for continue button, checking which radio button is checked.
        The user will be transitioned to the appropriate page depending on which
        radio button they have checked...
        */
        btn_Continue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (radio_Hardware.isChecked())
                {
                    Intent intent = new Intent(startup.this, hardware.class);
                    startup.this.startActivity(intent);
                }
                else if (radio_Software.isChecked())
                {
                    Intent intent = new Intent(startup.this, software.class);
                    startup.this.startActivity(intent);
                }
            }
        });

        //An onclick listener for that will take the user to the about page...
        textView_About.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(startup.this, about.class);
                startup.this.startActivity(intent);
            }
        });
    }
}
