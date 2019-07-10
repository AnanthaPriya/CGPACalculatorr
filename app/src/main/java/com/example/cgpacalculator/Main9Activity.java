package com.example.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity implements

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
        setContentView(R.layout.activity_main9);
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
                        sub1m = 10*3;
                        break;
                    case 2:
                        sub1m = 9*3;
                        break;
                    case 3:
                        sub1m = 8*3;
                        break;
                    case 4:
                        sub1m = 7*3;
                        break;
                    case 5:
                        sub1m = 6*3;
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
