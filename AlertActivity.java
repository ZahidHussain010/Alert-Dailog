package com.example.gulraiztariq.androidtutorials.examples;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gulraiztariq.androidtutorials.R;

public class AlertActivity extends AppCompatActivity {

    Button btnShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnShowDialog= findViewById(R.id.btnShowD);

        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Simple Dialog");
                builder.setPositiveButton("ok",null);
                builder.setMessage("your dialog box");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
