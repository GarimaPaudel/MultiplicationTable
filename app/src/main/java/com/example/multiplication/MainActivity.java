package com.example.multiplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView txtop, txt;
private EditText n;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtop = findViewById(R.id.textView);
        txt = findViewById(R.id.textView2);
        n = findViewById(R.id.editTextNumber);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tabVal = "";
                int num = Integer.parseInt(n.getText().toString());

                for (int i = 1; i <= 10; i++) {
                    int m = num * i;
                    tabVal = tabVal.concat("\n"+ num + "*" + i + "=" + m);
                }
                txt.setText("" + tabVal);
            }
        });
        }
    }
