package com.example.add;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView num1;
    private TextView num2;
    private TextView renum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        renum = (TextView) findViewById(R.id.renum);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
    }

    public void button1(View view) {
        int a =Integer.parseInt(num1.getText().toString());
        int b =Integer.parseInt(num2.getText().toString());
        int c = a+b;
        renum.setText(c+"");
    }
    public void button2(View view) {
        int a =Integer.parseInt(num1.getText().toString());
        int b =Integer.parseInt(num2.getText().toString());
        int c = a-b;
        renum.setText(c+"");
    }
    public void button3(View view) {
        int a =Integer.parseInt(num1.getText().toString());
        int b =Integer.parseInt(num2.getText().toString());
        int c = a*b;
        renum.setText(c+"");
    }
    public void button4(View view) {
        int a =Integer.parseInt(num1.getText().toString());
        int b =Integer.parseInt(num2.getText().toString());
        float c = a/b;
        renum.setText(c+"");
    }
}