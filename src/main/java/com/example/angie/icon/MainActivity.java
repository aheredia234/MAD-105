package com.example.angie.icon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    double amount = 0.0;
    double converted;
    double conversionRate = .8903;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton dte = findViewById(R.id.raddte);
        final RadioButton etd = findViewById(R.id.radetd);
        final TextView cost = findViewById(R.id.txtMeasure);
        final TextView result = findViewById(R.id.conversion);
        Button convert = (Button)findViewById(R.id.btn_convert);

        convert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                amount = Double.parseDouble(cost.getText().toString());
                DecimalFormat df = new DecimalFormat("$##,###.##");
                DecimalFormat dfe = new DecimalFormat("£#,###.##");
                if(dte.isChecked())
                {
                    if(amount <= 10000)
                    {
                        converted = amount * conversionRate;
                        result.setText(dfe.format(converted));
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Must be less than $10,000",
                                Toast.LENGTH_LONG).show();
                    }
                }
                if(etd.isChecked())
                {
                    if(amount<=8903)
                    {
                        converted = amount / conversionRate;
                        result.setText(df.format(converted));
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Must be less than £8903",
                                Toast.LENGTH_LONG).show();
                    }
                }

            }
        });



    }
}
