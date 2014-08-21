package com.ak.android.widget.colorpickerseekbar.colorpickersampleapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.SeekBar;

import com.ak.android.widget.colorpickerseekbar.ColorPickerSeekBar;


public class MainActivity extends ActionBarActivity {

    private ColorPickerSeekBar colorPickerSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View view = findViewById(R.id.view);

        colorPickerSeekBar = (ColorPickerSeekBar)findViewById(R.id.colorpicker);
        colorPickerSeekBar.setOnColorSeekbarChangeListener(new ColorPickerSeekBar.OnColorSeekBarChangeListener() {
            @Override
            public void onColorChanged(SeekBar seekBar, int color, boolean fromUser) {
                view.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
