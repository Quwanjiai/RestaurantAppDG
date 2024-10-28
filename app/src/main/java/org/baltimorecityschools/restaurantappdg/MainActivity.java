package org.baltimorecityschools.restaurantappdg;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton t1,t2,t3,t4,t5,t6;
    String toastMsg;
    Toast myToast;
    int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (RadioButton) findViewById(R.id.t1);
        t2 = (RadioButton) findViewById(R.id.t2);
        t3 = (RadioButton) findViewById(R.id.t3);
        toastMsg="you have order this";


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(t1.isChecked()){
                    t1.setChecked(false);
                    toastMsg="you have order triger Rolls";
                } else t1.setChecked(true);

                duration = Toast.LENGTH_SHORT;
                myToast = Toast.makeText(MainActivity.this, toastMsg,duration);
                myToast.show();

            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(t2.isChecked()){
                    t2.setChecked(false);
                    toastMsg="you have order Rainbow Rolls";
                } else t2.setChecked(true);

                duration = Toast.LENGTH_SHORT;
                myToast = Toast.makeText(MainActivity.this, toastMsg,duration);
                myToast.show();

            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(t3.isChecked()){
                    t3.setChecked(false);
                    toastMsg="you have order Dragon boy Rolls";
                } else t3.setChecked(true);

                duration = Toast.LENGTH_SHORT;
                myToast = Toast.makeText(MainActivity.this, toastMsg,duration);
                myToast.show();

            }
        });


    }
}