package com.example.chatify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button btnsignup, btnlogin, btnexit;
    TextInputEditText f_name, l_name, email, pass, r_pass;
    RadioGroup radioSex;
    RadioButton radioSexButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, second_screen.class);
                startActivity(intent);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }



        );


    }

    private void init() {
        btnlogin=findViewById(R.id.btnlogin);
        btnsignup=findViewById(R.id.btnsignup);
        f_name=findViewById(R.id.f_name);
        l_name=findViewById(R.id.l_name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        r_pass=findViewById(R.id.r_pass);
        radioSex=findViewById(R.id.radioSex);
        btnexit=findViewById(R.id.btnexit);

    }
}
