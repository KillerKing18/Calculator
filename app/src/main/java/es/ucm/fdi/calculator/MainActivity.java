package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Calculator calculator = new Calculator();
        EditText editTextX = findViewById(R.id.editTextX);
        EditText editTextY = findViewById(R.id.editTextY);

        Log.d(TAG, "Creating the URI…");
    }

    static final String EXTRA_ADD_RESULT =
            "es.ucm.fdi.calculator.EXTRA_ADD_RESULT";
    public void addXandY(View View) {
        Calculator calculator = new Calculator();
        EditText editTextX = findViewById(R.id.editTextX);
        EditText editTextY = findViewById(R.id.editTextY);

        int x = Integer.parseInt(editTextX.getText().toString());
        int y = Integer.parseInt(editTextY.getText().toString());
        Log.d(TAG, "Sumando…");
        int result = calculator.add(x, y);
        Log.d(TAG, "La suma da " + result);
        Intent showResultIntent =
                new Intent(this, CalculatorResultActivity.class);
        showResultIntent.putExtra(EXTRA_ADD_RESULT, result);
        startActivity(showResultIntent);
    }

}
