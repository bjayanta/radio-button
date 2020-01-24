package com.maxsop.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // set view
    RadioGroup rg_color;
    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_color = findViewById(R.id.rg_color);
        myLayout = findViewById(R.id.myLayout);

        rg_color.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb_button = group.findViewById(checkedId);
                String color = rb_button.getText().toString();

                // show
                Toast.makeText(getApplicationContext(), color, Toast.LENGTH_LONG).show();

                // change background color
                myLayout.setBackgroundColor(Color.parseColor(color));
            }
        });
    }
}
