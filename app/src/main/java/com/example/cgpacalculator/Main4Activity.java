package com.example.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements

        AdapterView.OnItemSelectedListener {
    String[] sub1 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub2 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub3 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub4 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub5 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub6 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub7 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub8 = {"Select One", "O", "A+", "A", "B+", "B"};
    String[] sub9 = {"Select One", "O", "A+", "A", "B+", "B"};
public static double a;
    public static int sub1m = 0;
    public static int sub2m = 0;
    public static int sub3m = 0;
    public static int sub4m = 0;
    public static int sub5m = 0;
    public static int sub6m = 0;
    public static int sub7m = 0;
    public static int sub8m = 0;
    public static int sub9m = 0;
    public static int sum = 0;
    public static int sumT = 0;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin1 = (Spinner) findViewById(R.id.sub1);
        Spinner spin2 = (Spinner) findViewById(R.id.sub2);
        Spinner spin3 = (Spinner) findViewById(R.id.sub3);
        Spinner spin4 = (Spinner) findViewById(R.id.sub4);
        Spinner spin5 = (Spinner) findViewById(R.id.sub5);
        Spinner spin6 = (Spinner) findViewById(R.id.sub6);
        Spinner spin7 = (Spinner) findViewById(R.id.sub7);
        Spinner spin8 = (Spinner) findViewById(R.id.sub8);
        Spinner spin9 = (Spinner) findViewById(R.id.sub9);

        spin1.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);
        spin4.setOnItemSelectedListener(this);
        spin5.setOnItemSelectedListener(this);
        spin6.setOnItemSelectedListener(this);
        spin7.setOnItemSelectedListener(this);
        spin8.setOnItemSelectedListener(this);
        spin9.setOnItemSelectedListener(this);

        button = findViewById(R.id.button);




        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa1 = new ArrayAdapter(this, R.layout.spinner_item_text, sub1);
        ArrayAdapter aa2 = new ArrayAdapter(this, R.layout.spinner_item_text, sub2);
        ArrayAdapter aa3 = new ArrayAdapter(this, R.layout.spinner_item_text, sub3);
        ArrayAdapter aa4 = new ArrayAdapter(this, R.layout.spinner_item_text, sub4);
        ArrayAdapter aa5 = new ArrayAdapter(this, R.layout.spinner_item_text, sub5);
        ArrayAdapter aa6 = new ArrayAdapter(this, R.layout.spinner_item_text, sub6);
        ArrayAdapter aa7 = new ArrayAdapter(this, R.layout.spinner_item_text, sub7);
        ArrayAdapter aa8 = new ArrayAdapter(this, R.layout.spinner_item_text, sub8);
        ArrayAdapter aa9 = new ArrayAdapter(this, R.layout.spinner_item_text, sub9);

        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        spin1.setAdapter(aa1);
        spin2.setAdapter(aa2);
        spin3.setAdapter(aa3);
        spin4.setAdapter(aa4);
        spin5.setAdapter(aa5);
        spin6.setAdapter(aa6);
        spin7.setAdapter(aa7);
        spin8.setAdapter(aa8);
        spin9.setAdapter(aa9);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = sub1m+sub2m+sub3m+sub4m+sub5m+sub6m+sub7m+sub8m+sub9m;
                a = sum/23;
                Toast.makeText(getApplicationContext(),Float.toString(sum/22),Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        switch(arg0.getId()){
            case R.id.sub1 : {
                switch (position) {
                    case 1:
                        sub1m = 10*4;
                        break;
                    case 2:
                        sub1m = 9*4;
                        break;
                    case 3:
                        sub1m = 8*4;
                        break;
                    case 4:
                        sub1m = 7*4;
                        break;
                    case 5:
                        sub1m = 6*4;
                        break;
                }
            }
            break;

            case R.id.sub2 : {
                switch (position) {
                    case 1:
                        sub2m = 10*3;
                        break;
                    case 2:
                        sub2m = 9*3;
                        break;
                    case 3:
                        sub2m = 8*3;
                        break;
                    case 4:
                        sub2m = 7*3;
                        break;
                    case 5:
                        sub2m = 6*3;
                        break;
                }
            }
            break;

            case R.id.sub3 : {
                switch (position) {
                    case 1:
                        sub3m = 10*3;
                        break;
                    case 2:
                        sub3m = 9*3;
                        break;
                    case 3:
                        sub3m = 8*3;
                        break;
                    case 4:
                        sub3m = 7*3;
                        break;
                    case 5:
                        sub3m = 6*3;
                        break;
                }
            }
            break;

            case R.id.sub4 : {
                switch (position) {
                    case 1:
                        sub4m = 10*3;
                        break;
                    case 2:
                        sub4m = 9*3;
                        break;
                    case 3:
                        sub4m = 8*3;
                        break;
                    case 4:
                        sub4m = 7*3;
                        break;
                    case 5:
                        sub4m = 6*3;
                        break;
                }
            }
            break;

            case R.id.sub5 : {
                switch (position) {
                    case 1:
                        sub5m = 10*4;
                        break;
                    case 2:
                        sub5m = 9*4;
                        break;
                    case 3:
                        sub5m = 8*4;
                        break;
                    case 4:
                        sub5m = 7*4;
                        break;
                    case 5:
                        sub5m = 6*4;
                        break;
                }
            }
            break;

            case R.id.sub6 : {
                switch (position) {
                    case 1:
                        sub6m = 10*2;
                        break;
                    case 2:
                        sub6m = 9*2;
                        break;
                    case 3:
                        sub6m = 8*2;
                        break;
                    case 4:
                        sub6m = 7*2;
                        break;
                    case 5:
                        sub6m = 6*2;
                        break;
                }
            }
            break;

            case R.id.sub7 : {
                switch (position) {
                    case 1:
                        sub7m = 10*2;
                        break;
                    case 2:
                        sub7m = 9*2;
                        break;
                    case 3:
                        sub7m = 8*2;
                        break;
                    case 4:
                        sub7m = 7*2;
                        break;
                    case 5:
                        sub7m = 6*2;
                        break;
                }
            }
            break;

            case R.id.sub8 : {
                switch (position) {
                    case 1:
                        sub8m = 10*1;
                        break;
                    case 2:
                        sub8m = 9*1;
                        break;
                    case 3:
                        sub8m = 8*1;
                        break;
                    case 4:
                        sub8m = 7*1;
                        break;
                    case 5:
                        sub8m = 6*1;
                        break;
                }
            }
            break;

            case R.id.sub9 : {
                switch (position) {
                    case 1:
                        sub9m = 10*1;
                        break;
                    case 2:
                        sub9m = 9*1;
                        break;
                    case 3:
                        sub9m = 8*1;
                        break;
                    case 4:
                        sub9m = 7*1;
                        break;
                    case 5:
                        sub9m = 6*1;
                        break;
                }
            }
            break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
