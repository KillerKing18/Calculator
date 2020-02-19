package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

import android.os.Bundle;

public class CalculatorResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);

        Intent intent = getIntent();
        int result = intent.getIntExtra(MainActivity.EXTRA_ADD_RESULT, 0);
        TextView result_text = findViewById(R.id.result_text);
        result_text.setText("Result is " + result);
    }
}
