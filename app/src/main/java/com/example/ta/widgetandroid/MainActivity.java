package com.example.ta.widgetandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText etTitle, etContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paper.init(this);

        btnSave = findViewById(R.id.btn_save);
        etTitle = findViewById(R.id.et_title);
        etContent = findViewById(R.id.et_content);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().write("title",etTitle.getText().toString());
                Paper.book().write("content",etContent.getText().toString());
            }
        });
    }
}