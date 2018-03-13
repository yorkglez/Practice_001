package com.tecmm.tala.practice_001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText text;
    TextView textv;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText);
        textv = (TextView) findViewById(R.id.textView_set);
        button = (Button) findViewById(R.id.button);
    }

    public void Upper(View view) {
        String buffer = new StringBuffer(text.getText()).reverse().toString();
        textv.setText(buffer);
    }
}
