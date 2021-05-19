package sg.edu.rp.c346.id20042755.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intent = getIntent();
        int value = intent.getIntExtra("value", 0);
        char cvalue = intent.getCharExtra("value", 'z');
        double dvalue = intent.getDoubleExtra("value", 10.00);
        tvAnswer.setText("Integer value received is " + value + "\nChar value is " + cvalue + "\nDouble Value is " + dvalue);

    }
}