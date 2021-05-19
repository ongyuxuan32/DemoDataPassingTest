package sg.edu.rp.c346.id20042755.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInt;
    Button btnpassChar;
    TextView textViewDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt = findViewById(R.id.buttonPassInteger);
        btnPassInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",170);
                startActivity(intent);
            }
        });

        btnpassChar = findViewById(R.id.ButtonPassChar);
        btnpassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value", 'b');
                startActivity(intent);


            }
        });

        textViewDouble = findViewById(R.id.TextViewDouble);
        textViewDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });


    }
}