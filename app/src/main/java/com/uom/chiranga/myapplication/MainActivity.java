package com.uom.chiranga.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button.*;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import static android.widget.Button.*;


public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button sb;
    Intent intent2;
    String uname, p;
    public static final String EXTRA_MESSAGE = "com.uom.chiranga.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent2 = new Intent(this, SignUp.class);
        //sign up button listener
        TextView tx = (TextView)findViewById(R.id.textView2);
        tx.setTextColor(Color.BLUE);

        sb =(Button)findViewById(R.id.button2);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });


    }


    public void sendMessage(View view) {
        final Intent intent = new Intent(this, SecondActivity.class);

        user = (EditText) findViewById(R.id.editText4);
        pass = (EditText) findViewById(R.id.editText3);

        uname = user.getText().toString();
        p = pass.getText().toString();


        intent.putExtra(EXTRA_MESSAGE, uname);

        if(uname.equals("chiranga") & p.equals("123456")){
            Context context = getApplicationContext();
            CharSequence text = "Hello " + uname + " welcome! \n Login Successful!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            startActivity(intent);

        }else{
            Context context = getApplicationContext();
            CharSequence text = "Login Failed!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }



    }

}