package com.stigler.cs441_proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloText);
        colorButton = (Button) findViewById(R.id.colorButton);
    }

    public void onColorClick(View view)
    {
        //helloText.setTextColor(0xFF0000FF);
        int textColor = helloText.getCurrentTextColor();
        switch (textColor)
        {
            case 0xFFFF0000: helloText.setTextColor(0xFFFF8000);
            break;
            case 0xFFFF8000: helloText.setTextColor(0xFFFFFF00);
            break;
            case 0xFFFFFF00: helloText.setTextColor(0xFF80FF00);
            break;
            case 0xFF80FF00: helloText.setTextColor(0xFF00FF00);
            break;
            case 0xFF00FF00: helloText.setTextColor(0xFF00FF80);
            break;
            case 0xFF00FF80: helloText.setTextColor(0xFF00FFFF);
            break;
            case 0xFF00FFFF: helloText.setTextColor(0xFF0080FF);
            break;
            case 0xFF0080FF: helloText.setTextColor(0xFF0000FF);
            break;
            case 0xFF0000FF: helloText.setTextColor(0xFF8000FF);
            break;
            case 0xFF8000FF: helloText.setTextColor(0xFFFF00FF);
            break;
            case 0xFFFF00FF: helloText.setTextColor(0xFFFF0080);
            break;
            case 0xFFFF0080: helloText.setTextColor(0xFFFF0000);
            break;
        }
    }
}

//test comment, and push