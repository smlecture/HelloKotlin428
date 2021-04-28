package com.androidapp.hellokotlin428;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightField, weightField;
    TextView txtResult;
    Button btnBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightField = findViewById(R.id.heightField);
        weightField = findViewById(R.id.weightField);
        txtResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sHeight = heightField.getText().toString();
                String sWeight = weightField.getText().toString();
/*                try {
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
                    txtResult.setText("Your BMI = " + bmi);
                } catch (Exception e) {
                    txtResult.setText("Input(s) missing");
                }*/
                // if(!sHeight.isEmpty() && !sWeight.isEmpty()) {
                if(!sHeight.equals("") && !sWeight.equals("")) {
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight) / 100.0, 2.0);
                    txtResult.setText("Your BMI = " + bmi);
                } else{
                    txtResult.setText("Input(s) missing");
                }
            }
        });
    }
}