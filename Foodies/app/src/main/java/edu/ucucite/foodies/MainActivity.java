package edu.ucucite.foodies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void chicken(View view)
    {
        Intent intent = new Intent(this,chicken.class);
        startActivity(intent);
    }
    public void pork(View view)
    {
        Intent intent = new Intent(this,pork.class);
        startActivity(intent);
    }
    public void fish (View view)
    {
        Intent intent = new Intent(this,fish.class);
        startActivity(intent);
    }
}
