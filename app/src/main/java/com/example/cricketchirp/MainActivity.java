package com.example.cricketchirp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsubmit;
        final EditText editText;
        final TextView txtview;
        ImageView imgview;
        final DecimalFormat formatter ;
        btnsubmit= findViewById(R.id.btnsubmit);
        editText=findViewById(R.id.editText);
        txtview= findViewById(R.id.txtview);
        txtview.setVisibility(View.GONE);
formatter= new DecimalFormat("#0.0");
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (editText.getText().toString().isEmpty())
               {
                   Toast.makeText(MainActivity.this,"Text is empty", Toast.LENGTH_LONG).show();
               }
               else {
                   int val = Integer.parseInt(editText.getText().toString().trim());
                   double result = (val/3.0)+4;
                   String results = "The Approximate Temprature Outside is "+ formatter.format(result)+ "degrees celsius";
                   txtview.setText(results);
                   txtview.setVisibility(View.VISIBLE);
               }
            }
        });

    }
}
