package org.baltimorecityschools.restaurantappdg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OrderActivity extends AppCompatActivity {

    private SushiOrder sushiOrder;
    private TextView PriceText;
    private double basePrice = 9.00;
    private LinearLayout linearLayout;

    Button sideBTNN;
    Button plusbutton;
    int plus1;
    int plus2;
    Button plusbutton2;
    Button Negbutton;
    Button Negbutton2;
    CheckBox checkisct;

    TextView numbV1;

    TextView numbV2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        plusbutton = (Button) findViewById(R.id.plusbutton);

        plus1=0;

        plus2=0;

        sideBTNN = (Button) findViewById(R.id.sideBTN);

        checkisct = (CheckBox) findViewById(R.id.checkisc);

        plusbutton2 = (Button) findViewById(R.id.plusbutton2);

        Negbutton = (Button) findViewById(R.id.Negbutton);

        Negbutton2 = (Button) findViewById(R.id.Negbutton2);

        numbV1 = (TextView) findViewById(R.id.numbVi);

        numbV2 = (TextView) findViewById(R.id.numbVi2);

        sushiOrder = new SushiOrder();
        PriceText = findViewById(R.id.pricetext);

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sushiOrder.setQuantity(sushiOrder.getQuantity() + 1);
                plus1+=1;
                numbV1.setText(String.valueOf(plus1));
            }
        });

        plusbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sushiOrder.setQuantity(sushiOrder.getQuantity() + 1);
                plus2+=1;
                numbV2.setText(String.valueOf(plus2));
            }
        });

        Negbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (plus1 > 0) {
                    plus1 -= 1;
                }
                if (sushiOrder.getQuantity() > 0) {
                    sushiOrder.setQuantity(sushiOrder.getQuantity() - 1);
                }
                numbV1.setText(String.valueOf(plus1));
            }
        });

        Negbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (plus2 > 0) {
                    plus2 -= 1;
                }
                if (sushiOrder.getQuantity() > 0) {
                    sushiOrder.setQuantity(sushiOrder.getQuantity() - 1);
                }
                numbV2.setText(String.valueOf(plus2));
            }
        });

        checkisct.setChecked(true);

        };
    }