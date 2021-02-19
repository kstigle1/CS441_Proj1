package com.stigler.cs441_proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button colorButton;
    SeekBar fontBar;
    TextView fontSize;
    ImageView JA17;
    Button fadeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloText);
        colorButton = (Button) findViewById(R.id.colorButton);
        fontBar = (SeekBar) findViewById(R.id.fontBar);
        fontSize = (TextView) findViewById(R.id.fontSize);
        JA17 = (ImageView) findViewById(R.id.JA17);
        fadeButton = (Button) findViewById(R.id.fadeButton);

        fontBar.setOnSeekBarChangeListener(seekBarChangeListener);
    }

    public void onFadeCLick(View view)
    {
        JA17.setAlpha((float) 1.0);
        fadeOutAni(JA17);
    }

    public void fadeOutAni (View view)
    {
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(2000);

        fadeOut.setAnimationListener((new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation)
            {

            }

            @Override
            public void onAnimationEnd(Animation animation)
            {
                JA17.setAlpha((float) 0.0);
            }

            @Override
            public void onAnimationRepeat(Animation animation)
            {

            }
        }));
        view.startAnimation(fadeOut);
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener()
    {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
        {
            fontSize.setText("Font: " + seekBar.getProgress());
            helloText.setTextSize(seekBar.getProgress());
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar)
        {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar)
        {

        }
    };

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