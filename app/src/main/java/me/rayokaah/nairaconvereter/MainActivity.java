package me.rayokaah.nairaconvereter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert (View view) {
        EditText editText = (EditText) findViewById(R.id.edit);
        Double nairaAmountDouble = Double.parseDouble(editText.getText().toString());
        Double dollarAmount = (nairaAmountDouble/360.0);
        Toast.makeText(MainActivity.this,  "This is the dollar amount $" + String.format("%.2f", dollarAmount), Toast.LENGTH_LONG ).show();
        Log.i("amount", dollarAmount.toString());


    }
    
}
