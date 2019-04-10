package com.fwhite.animalactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Animal duck = new Duck();
Animal fish = new Fish();

this.output.append("\nDuck say ");
this.output.append("\nFish goes ");

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        output = (TextView)findViewById(R.id.output);
        setContentView(R.layout.activity_main);
    }
}
