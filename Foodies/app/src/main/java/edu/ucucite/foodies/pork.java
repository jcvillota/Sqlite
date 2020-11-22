package edu.ucucite.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork);
    }
    public void nilaga (View view)
    {
        Intent intent = new Intent(this, nilaga.class);
        startActivity(intent);
    }
}
