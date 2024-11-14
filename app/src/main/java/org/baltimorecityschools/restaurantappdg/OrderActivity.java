package org.baltimorecityschools.restaurantappdg;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
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
    private LinearLayout optionslayout,qinearLayout,pinearlayout;

    Button sideBTNN;
    Button plusbutton;
    int plus1;
    int plus2;
    Button plusbutton2;
    Button Negbutton;
    Button Negbutton2;
    CheckBox checkisct;
    CheckBox rrCb;
    CheckBox wCb;
    CheckBox yKCB;
    Button totBTN;
    boolean cookcheck;
    double subtotal;

    TextView subtv;

    String sidetext;

    TextView numbV1;

    TextView numbV2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        optionslayout = (LinearLayout) findViewById(R.id.optionslayout);

        pinearlayout = (LinearLayout) findViewById(R.id.pinearlayout);

        qinearLayout = (LinearLayout) findViewById(R.id.qinearLayout);

        plusbutton = (Button) findViewById(R.id.plusbutton);

        totBTN = (Button) findViewById(R.id.totalBTN);

        plus1=0;

        plus2=0;

        sidetext="";

        sideBTNN = (Button) findViewById(R.id.sideBTN);

        checkisct = (CheckBox) findViewById(R.id.checkisc);

        rrCb = (CheckBox) findViewById(R.id.riceCB);

        yKCB = (CheckBox) findViewById(R.id.ykCb);

        wCb = (CheckBox) findViewById(R.id.waCB);

        plusbutton2 = (Button) findViewById(R.id.plusbutton2);

        Negbutton = (Button) findViewById(R.id.Negbutton);

        Negbutton2 = (Button) findViewById(R.id.Negbutton2);

        numbV1 = (TextView) findViewById(R.id.numbVi);

        subtotal= 0.00;

        subtv = (TextView) findViewById(R.id.pricetext);

        cookcheck = false;

        numbV2 = (TextView) findViewById(R.id.numbVi2);

        PriceText = findViewById(R.id.pricetext);



        totBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkisct.isChecked()) cookcheck = true;
                if (wCb.isChecked()) sidetext += "Wasabi/";
                if (rrCb.isChecked()) sidetext += "Rice/";
                if (yKCB.isChecked()) sidetext += "Yakitori";

                Log.d("AAA","cookcheck"+cookcheck+"sidetext"+sidetext+"plus1"+plus1);

                sushiOrder = new SushiOrder(cookcheck,sidetext,plus1);
                subtotal = sushiOrder.getPrice();
                subtv.setText(subtotal+"$");
            }
        });


        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                sushiOrder.setQuantity(sushiOrder.getQuantity() + 1);
                plus1+=1;
                numbV1.setText(String.valueOf(plus1));
            }
        });

        plusbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                sushiOrder.setQuantity(sushiOrder.getQuantity() + 1);
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
//                if (sushiOrder.getQuantity() > 0) {
//                    sushiOrder.setQuantity(sushiOrder.getQuantity() - 1);
//                }
                numbV1.setText(String.valueOf(plus1));
            }
        });

        Negbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (plus2 > 0) {
                    plus2 -= 1;
                }
//                if (sushiOrder.getQuantity() > 0) {
//                    sushiOrder.setQuantity(sushiOrder.getQuantity() - 1);
//                }
                numbV2.setText(String.valueOf(plus2));
            }
        });

        sideBTNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (optionslayout.getVisibility() == View.GONE) {
                    optionslayout.setVisibility(View.VISIBLE);
                    pinearlayout.setVisibility(VISIBLE);
                    qinearLayout.setVisibility(VISIBLE);
                } else {
                    optionslayout.setVisibility(GONE);
                    pinearlayout.setVisibility(GONE);
                    qinearLayout.setVisibility(GONE);
                }
            }
        });



        };
    }