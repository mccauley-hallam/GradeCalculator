package com.mccauley.u14a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class software extends AppCompatActivity
{
    //Globally declared variables
    Spinner spinner_1, spinner_2, spinner_3, spinner_4, spinner_5, spinner_6, spinner_7,
            spinner_8, spinner_9, spinner_10, spinner_11, spinner_12, spinner_13, spinner_14,
            spinner_15, spinner_16, spinner_17, spinner_18;
    Button btn_Continue;
    Integer total;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.software);

        //Defining variables
        btn_Continue = (Button) findViewById(R.id.btn_Continue);
        spinner_1 = (Spinner) findViewById(R.id.spinner_0);
        spinner_2 = (Spinner) findViewById(R.id.spinner_1);
        spinner_3 = (Spinner) findViewById(R.id.spinner_2);
        spinner_4 = (Spinner) findViewById(R.id.spinner_3);
        spinner_5 = (Spinner) findViewById(R.id.spinner_4);
        spinner_6 = (Spinner) findViewById(R.id.spinner_5);
        spinner_7 = (Spinner) findViewById(R.id.spinner_6);
        spinner_8 = (Spinner) findViewById(R.id.spinner_7);
        spinner_9 = (Spinner) findViewById(R.id.spinner_8);
        spinner_10 = (Spinner) findViewById(R.id.spinner_9);
        spinner_11 = (Spinner) findViewById(R.id.spinner_10);
        spinner_12 = (Spinner) findViewById(R.id.spinner_11);
        spinner_13 = (Spinner) findViewById(R.id.spinner_12);
        spinner_14 = (Spinner) findViewById(R.id.spinner_13);
        spinner_15 = (Spinner) findViewById(R.id.spinner_14);
        spinner_16 = (Spinner) findViewById(R.id.spinner_15);
        spinner_17 = (Spinner) findViewById(R.id.spinner_16);
        spinner_18 = (Spinner) findViewById(R.id.spinner_17);

        //Array containing grades, used by spinners
        String grade[] = new String[]{"-", "P", "M", "D"};

        //Creating array adapter and setting the spinners to use this adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, grade);
        spinner_1.setAdapter(adapter);
        spinner_2.setAdapter(adapter);
        spinner_3.setAdapter(adapter);
        spinner_4.setAdapter(adapter);
        spinner_5.setAdapter(adapter);
        spinner_6.setAdapter(adapter);
        spinner_7.setAdapter(adapter);
        spinner_8.setAdapter(adapter);
        spinner_9.setAdapter(adapter);
        spinner_10.setAdapter(adapter);
        spinner_11.setAdapter(adapter);
        spinner_12.setAdapter(adapter);
        spinner_13.setAdapter(adapter);
        spinner_14.setAdapter(adapter);
        spinner_15.setAdapter(adapter);
        spinner_16.setAdapter(adapter);
        spinner_17.setAdapter(adapter);
        spinner_18.setAdapter(adapter);

        /*
        On Click listener for the continue button
        It's here that the logic is done to determine
        the total score of the users input.
        This is done by seeing what they have selected
        and adding a value to a running total depending
        on what that selection was...
        */
        btn_Continue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                total = 0;
                Integer x = 0;

                while (x != 1) {
                    if (spinner_1.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_1.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_1.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_2.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_2.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_2.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_3.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_3.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_3.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_4.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_4.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_4.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_5.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_5.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_5.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_6.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_6.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_6.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_7.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_7.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_7.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_8.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_8.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_8.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_9.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_9.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_9.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_10.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_10.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_10.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_11.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_11.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_11.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_12.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_12.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_12.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_13.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_13.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_13.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_14.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_14.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_14.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_15.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_15.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_15.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_16.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_16.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_16.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_17.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_17.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_17.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    if (spinner_18.getSelectedItem() == "P") {
                        total += 70;
                    } else if (spinner_18.getSelectedItem() == "M") {
                        total += 80;
                    } else if (spinner_18.getSelectedItem() == "D") {
                        total += 90;
                    } else {
                        total += 0;
                    }

                    Intent intent = new Intent(software.this, total.class);
                    intent.putExtra("total", total.toString());
                    software.this.startActivity(intent);

                    x = 1;
                }
            }
        });
    }
}