package org.baltimorecityschools.restaurantappdg;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    EditText TextCH;
    Button nameBTN;
    Button MenuBTN;
    TextView NameTl;
    String name;
    String greet;
    Intent GoToMenu;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextCH = (EditText) findViewById(R.id.textCH);

        nameBTN = (Button) findViewById(R.id.nameBTN);

        MenuBTN = (Button) findViewById(R.id.MenuBTN);

        NameTl = (TextView) findViewById(R.id.nameT);

        nameBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = TextCH.getText().toString();
                greet = " " +name;
                NameTl.setText(greet);
            }
        });

        MenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToMenu = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(GoToMenu);
            }
        });
        }
    }
