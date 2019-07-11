package com.example.cgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] year = {"Select One", "I Year", "II Year", "III Year", "IV Year"};

    String[] dept = {"Select One", "Computer Science And Engineering ", "Civil Engineering", "Electrical And Communication Eng.", "Electrical And Electronics Eng.", "Mechanical Eng."};

    String[] semester = {"Select One", "I Semester", "II Semester", "III Semester", "IV Semester", "V Semester", "VI Semester", "VII Semester", "VIII Semester"};

    public static String sem;
    public static String yearr;
    public static String deptt;
    Button button;
//mdknghgfngfjbgfnjrrkjgkng

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin1 = (Spinner) findViewById(R.id.dept);
        Spinner spin2 = (Spinner) findViewById(R.id.year);
        Spinner spin3 = (Spinner) findViewById(R.id.semester);
        spin1.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);
        button = findViewById(R.id.button);

        ArrayAdapter aa1 = new ArrayAdapter(this,R.layout.spinner_item_text,dept);
        ArrayAdapter aa2 = new ArrayAdapter(this,R.layout.spinner_item_text,year);
        ArrayAdapter aa3 = new ArrayAdapter(this,R.layout.spinner_item_text,semester);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa1);
        spin2.setAdapter(aa2);
        spin3.setAdapter(aa3);


      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(sem.matches("I")&&yearr.matches("I Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("II")&&yearr.matches("I Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("III")&&yearr.matches("II Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("IV")&&yearr.matches("II Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main5Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("V")&&yearr.matches("III Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("VI")&&yearr.matches("III Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main7Activity.class);
                  startActivity(intent);
              }
              else if(sem.matches("VII")&&yearr.matches("IV Year")&&deptt.matches("Computer Science and Engineering"))
              {
                  Intent intent = new Intent(MainActivity.this,Main8Activity.class);
                  startActivity(intent);
              }
          }
      });
    }



        @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id){
            switch (arg0.getId()) {
                case R.id.year: {
                    switch (position) {
                        case 1:
                            yearr = "I Year";
                            break;
                        case 2:
                            yearr = "II Year";
                            break;
                        case 3:
                            yearr = "III Year";
                            break;
                        case 4:
                            yearr = "IV Year";
                            break;

                    }
                }
                break;

                case R.id.dept: {
                    switch (position) {
                        case 1:
                            deptt = "Computer Science and Engineering";
                            break;
                        case 2:
                            deptt = "Civil Engineering";
                            break;
                        case 3:
                            deptt = "Electrical And Communication Eng.";
                            break;
                        case 4:
                            deptt = "Electrical And Electronics Eng.";
                            break;
                        case 5:
                            deptt = "Mechanical Eng.";
                            break;
                    }
                }
                break;

                case R.id.semester: {
                    switch (position) {
                        case 1:
                            sem = "I";
                            break;
                        case 2:
                            sem = "II";
                            break;
                        case 3:
                            sem = "III";
                            break;
                        case 4:
                            sem = "IV";
                            break;
                        case 5:
                            sem = "V";
                            break;
                        case 6:
                            sem = "VI";
                            break;
                        case 7:
                            sem = "VII";
                            break;
                        case 8:
                            sem = "VIII";
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