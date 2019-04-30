package com.example.angie.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costOfMeal;
    double tip;
    int percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText cost = (EditText)findViewById(R.id.txtCost);
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        Button btnCalc = (Button)findViewById(R.id.btnTip);
            btnCalc.setOnClickListener(new View.OnClickListener() {
                final TextView result = ((TextView)findViewById(R.id.txtTip));
                @Override
                public void onClick(View v) {
                    try{
                        costOfMeal = Double.parseDouble(cost.getText().toString());
                    } catch (NumberFormatException d){
                        costOfMeal = 0;
                    }
                    percent = Integer.parseInt(group.getSelectedItem().toString());
                    DecimalFormat df = new DecimalFormat("$###,###.00");
                    tip = costOfMeal*((double)percent/100);
                    result.setText("The tip should be "+ df.format(tip));
                }
            });
    }
}
