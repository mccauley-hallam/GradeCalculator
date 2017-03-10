package com.mccauley.u14a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class total extends AppCompatActivity
{
    //Globally declared variables
    TextView score, grade, boundaries, nextGrade;
    String str_score;
    Button btn_Startover;
    Integer num, MPP, MMP, MMM, DMM, DDM, DDD, DsDD, DsDsD, DsDsDs;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);

        //Defining variables
        nextGrade = (TextView) findViewById(R.id.textView_nextGrade);
        boundaries = (TextView) findViewById(R.id.textView_Boundaries);
        btn_Startover = (Button) findViewById(R.id.btn_Startover);
        score = (TextView) findViewById(R.id.textView_Score);
        grade = (TextView) findViewById(R.id.textView_Grade);

        /*
        Getting the extras of the passed intent,
        setting that to a string and setting the text
        of a text view to that string
        */
        Intent intent = getIntent();
        str_score = intent.getStringExtra("total");
        score.setText(str_score);

        num = Integer.parseInt(score.getText().toString()); //Converting the score total from a string back into an integer

        //Scores to be referenced when calculated points needed for next bracket
        MPP = 1300;
        MMP = 1340;
        MMM = 1380;
        DMM = 1420;
        DDM = 1460;
        DDD = 1500;
        DsDD = 1530;
        DsDsD = 1560;
        DsDsDs = 1590;

        //Logic behind calculating points needed for next grade
        if (num < 1300)
        {
            MPP -= num;
            nextGrade.setText("Points needed for next grade: " + MPP);
        }
        else if (num < 1340)
        {
            MMP -= num;
            nextGrade.setText("Points needed for next grade: " + MMP);
        }
        else if (num < 1380)
        {
            MMM -= num;
            nextGrade.setText("Points needed for next grade: " + MMM);
        }
        else if (num < 1420)
        {
            DMM -= num;
            nextGrade.setText("Points needed for next grade: " + DMM);
        }
        else if (num < 1460)
        {
            DDM -= num;
            nextGrade.setText("Points needed for next grade: " + DDM);
        }
        else if (num < 1500)
        {
            DDD -= num;
            nextGrade.setText("Points needed for next grade: " + DDD);
        }
        else if (num < 1530)
        {
            DsDD -= num;
            nextGrade.setText("Points needed for next grade: " + DsDD);
        }
        else if (num < 1560)
        {
            DsDsD -= num;
            nextGrade.setText("Points needed for next grade: " + DsDsD);
        }
        else if (num < 1590)
        {
            DsDsDs -= num;
            nextGrade.setText("Points needed for next grade: " + DsDsDs);
        }
        else if (num > 1590)
        {
            nextGrade.setText("Points needed for next grade: Maximum grade achieved");
        }

        //Logic behind calculating the users grade from their score total
        if (num <= 1299)
        {
            grade.setText("PPP");
        }
        else if (num >= 1300 && num <= 1339)
        {
            grade.setText("MPP");
        }
        else if (num >= 1340 && num <= 1379)
        {
            grade.setText("MMP");
        }
        else if (num >= 1380 && num <= 1419)
        {
            grade.setText("MMM");
        }
        else if (num >= 1420 && num <= 1459)
        {
            grade.setText("DMM");
        }
        else if (num >= 1460 && num <= 1499)
        {
            grade.setText("DDM");
        }
        else if (num >= 1500 && num <= 1529)
        {
            grade.setText("DDD");
        }
        else if (num >= 1530 && num <= 1559)
        {
            grade.setText("D*DD");
        }
        else if (num <= 1560 && num <= 1580)
        {
            grade.setText("D*D*D");
        }
        else if (num >= 1590)
        {
            grade.setText("D*D*D*");
        }
        else
        {
            grade.setText("Error");
        }

        //An on click listener that will take the user to a page showing the grade boundaries
        boundaries.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(total.this, boundaries.class);
                total.this.startActivity(intent);
            }
        });

        //An on click listener that will restart the application so the user is able to start again
        btn_Startover.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(total.this, startup.class);
                total.this.startActivity(intent);
            }
        });
    }
}
