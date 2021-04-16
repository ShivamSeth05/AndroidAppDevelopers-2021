package com.android.internshipprogram.j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.internshipprogram.R;

import java.util.ArrayList;

public class DL1MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList state = new ArrayList();
    TextView tv_name,tv_dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_j_activity_main);
        spinner = findViewById(R.id.spinner);
        tv_name = findViewById(R.id.tv_name);
        tv_dob = findViewById(R.id.tv_dob);
        //Bindng spinner data
        state.add("Select your state");
        state.add("Uttar pradesh");
        state.add("Maharashtra");
        state.add("Bihar");
        ArrayAdapter<String> stateAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
        spinner.setAdapter(stateAdapter);
        //Bind textview data
        tv_name.setText("Abhisek Kumar");
        tv_dob.setText("12 Apr, 1973");
    }
}