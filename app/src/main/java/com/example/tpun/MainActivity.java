package com.example.tpun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView salutation_text;
    private Button salute_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salute_button = (Button) findViewById(R.id.salute_button);
        salutation_text = (TextView) findViewById(R.id.salutation_text);
    }

    public void montrerSalutation(View view) {
        String message = "Bienvenue a ma premiere application";
        salutation_text.setText(message);
    }
}