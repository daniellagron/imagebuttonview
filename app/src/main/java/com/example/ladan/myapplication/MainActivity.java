package com.example.ladan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    int blue,green,red;
    int one,two,three;
    int num;
    ImageView IV1;
    ImageButton IB1;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blue = R.drawable.blue;
        green = R.drawable.green;
        red = R.drawable.red;
        one = R.drawable.one;
        two = R.drawable.two;
        three = R.drawable.three;
        IV1 =(ImageView) findViewById(R.id.IV1);
        IB1 =(ImageButton) findViewById(R.id.IB1);


    }

    public void random(View view) {
        num = rnd.nextInt((3)+1);
        if (num==1){
            IV1.setImageResource(blue);
            IB1.setImageResource(one);
        }if (num==2){
            IV1.setImageResource(green);
            IB1.setImageResource(two);
        }if (num==3){
            IV1.setImageResource(red);
            IB1.setImageResource(three);
        }

    }
}
