package edu.ucucite.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chicken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
    }
public void recipe (View view)
{
    Intent intent = new Intent(this, adobongputirecipe.class);
    startActivity(intent);
}
    public void caldereta (View view)
    {
        Intent intent = new Intent(this, caldereta.class);
        startActivity(intent);
    }
    public void lollipop (View view)
    {
        Intent intent = new Intent(this, lollipop.class);
        startActivity(intent);
    }
    public void soup (View view)
    {
        Intent intent = new Intent(this, soup.class);
        startActivity(intent);
    }
    public void fried (View view)
    {
        Intent intent = new Intent(this, fried.class);
        startActivity(intent);
    }
    public void ginataan (View view)
    {
        Intent intent = new Intent(this, ginataangmanok.class);
        startActivity(intent);
    }
    public void bicol (View view)
    {
        Intent intent = new Intent(this, bicol.class);
        startActivity(intent);
    }
    public void adobo(View view)
    {
        Intent intent = new Intent(this, adobomanok.class);
        startActivity(intent);
    }
    public void pastel(View view)
    {
        Intent intent = new Intent(this, pastel.class);
        startActivity(intent);
    }
}
