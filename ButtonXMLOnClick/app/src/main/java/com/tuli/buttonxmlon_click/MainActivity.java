package com.tuli.buttonxmlon_click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sampleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleText=findViewById(R.id.text_sample);
    }

    public void changeSampleText(View view) {
        sampleText.setText("Batch-11");
        Toast.makeText(this, ""+sampleText.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
