package com.example.createrollnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list = new ArrayList<String>();

        /** Declaring an ArrayAdapter to set items to ListView */
        ArrayAdapter<String> adapter;

        for(int i=0 ;i<103 ; ++i){
            String text = String.valueOf(i);
            if(text.length() == 1){
                text = "00" + text;
            } else if(text.length()== 2){
                text = "0" + text;
            } else {
                text = text;
            }
            list.add(text);
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        Spinner r = (Spinner) findViewById(R.id.rollno);
        r.setAdapter(adapter);

        /** Adding radio buttons for the spinner items */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }
    public void onClickDetails(View view){

        Spinner r = (Spinner) findViewById(R.id.rollno);
        Spinner branch = (Spinner) findViewById(R.id.branch);
        String b = String.valueOf(branch.getSelectedItem());
        Spinner yearofadmission = (Spinner) findViewById(R.id.yearofadmission);
        String y = String.valueOf(yearofadmission.getSelectedItem());
        String enrollmentNo = "";


        String grossRollNo = String.valueOf(r.getSelectedItem());
        TextView t1;
        enrollmentNo = "BT"+y.substring(2,y.length())+b+grossRollNo;
        t1 = findViewById(R.id.enrollmentno);

        t1.setText("You Enrollment Number is: "+enrollmentNo);
    }
}
