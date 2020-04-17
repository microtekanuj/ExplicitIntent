package com.example.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3;
        b3=findViewById(R.id.b3);
        b2=findViewById(R.id.b2);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, "Going from first activity to second", Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Intent.ACTION_VIEW);
                Toast.makeText(MainActivity.this, "Going to web", Toast.LENGTH_SHORT).show();
                i2.setData(Uri.parse("https://www.google.in"));
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Intent.ACTION_CAMERA_BUTTON);

            }
        });

    }
}
