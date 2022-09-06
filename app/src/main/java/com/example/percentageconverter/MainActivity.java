package com.example.percentageconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText etMarks, etOutOf;
    public Button btnConvert;
    public TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMarks = findViewById(R.id.etMarks);
        etOutOf = findViewById(R.id.etOutOf);
        btnConvert = findViewById(R.id.btnConvert);
        tvResult = findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double marks = Double.parseDouble(etMarks.getText().toString());
                double out_of = Double.parseDouble(etOutOf.getText().toString());

                double result = (marks/out_of)*100;
                tvResult.setText(String.valueOf(result));

            }
        });
    }
}