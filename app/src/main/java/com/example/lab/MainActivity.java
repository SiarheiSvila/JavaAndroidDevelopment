package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button switchToGreen;
    private Button switchToRed;
    private Button switchToBlue;
    private Button switchToImage;
    private Button switchToYellow;
    private LinearLayout screenLayout;
    private Toast informationToast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init buttons
        switchToBlue = findViewById(R.id.switchBlue);
        switchToGreen = findViewById(R.id.switchGreen);
        switchToRed = findViewById(R.id.switchRed);
        switchToImage = findViewById(R.id.switchImage);
        switchToYellow = findViewById(R.id.switchYellow);

        screenLayout = findViewById(R.id.screenLayout);
    }

    public void onClick(View view) {
        if (switchToBlue.equals(view)) {
            screenLayout.setBackgroundColor(Color.BLUE);
            showToast("Hello blue");
        } else if (switchToRed.equals(view)) {
            screenLayout.setBackgroundColor(Color.RED);
            showToast("Hello red");
        } else if (switchToGreen.equals(view)) {
            screenLayout.setBackgroundColor(Color.GREEN);
            showToast("Hello green");
        } else if (switchToImage.equals(view)) {
            screenLayout.setBackgroundResource(R.drawable.ic_launcher_background);
            showToast("Hello image");
        } else if(switchToYellow.equals(view)) {
            screenLayout.setBackgroundColor(Color.YELLOW);
            showToast("Hello yellow");
        }

    }

    private void showToast(String text) {
        if (informationToast != null) {
            informationToast.cancel();
        }
        informationToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        informationToast.show();
    }

    public void showDevelopers(View view) {
        showToast("Siarhei_Svila(Java developer) and Aliaksei_Pialetski(JS developer)");
    }
}
