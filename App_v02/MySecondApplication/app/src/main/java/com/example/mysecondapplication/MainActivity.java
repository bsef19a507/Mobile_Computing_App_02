package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeText(View view){
        TextView myView = (TextView) findViewById(R.id.textView);
        CharSequence text = "بسم الله الرحمن الرحيم";
        CharSequence txt = myView.getText();
        Button btn = (Button) findViewById(R.id.button);
        if(txt.equals(text)){
            myView.setText("لا إله إلا الله محمد رسول الله\n");
            btn.setText("Back to Bismillah");
        }else{
            myView.setText("بسم الله الرحمن الرحيم");
            btn.setText("Read More");
        }




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}