package com.ninto.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button btn;
    private Button clch;
    private Button szch;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.n1);
        num2 = (EditText)findViewById(R.id.n2);
        btn = (Button)findViewById(R.id.b1);
        text = (TextView)findViewById(R.id.t);
        clch = (Button)findViewById(R.id.clr);
        szch = (Button)findViewById(R.id.sze);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(num1.getText().toString());
                int y = Integer.parseInt(num2.getText().toString());
                int sum = x+y;
                text.setText(String.valueOf(sum));
            }
        });

        clch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //switch(v.getId()) {
                    //case R.id.clr:
                        text.setTextColor(Color.parseColor("#FF0000"));
                        /*break;
                    case R.id.sze:
                        text.setTextSize(60);
                        break;
                    default: break;
                }*/
            }
        });
        szch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text.setTextSize(60);
            }
        });
    }
}