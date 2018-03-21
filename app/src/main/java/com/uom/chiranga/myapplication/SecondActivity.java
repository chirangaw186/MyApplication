package com.uom.chiranga.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageButton imgButton;
    Intent orderingIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tx4 = findViewById(R.id.textView4);
        tx4.setText("Welcome "+ stringExtra +"!");

        orderingIntent = new Intent(this, order.class);


        buttonListener();



    }

    public void buttonListener(){
        imgButton =(ImageButton)findViewById(R.id.imageButton2);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"You clicked the button",Toast.LENGTH_LONG).show();
                startActivity(orderingIntent);
            }
        });
    }
}

