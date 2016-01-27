package com.thahaseen.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSpotifyApp = (Button) findViewById(R.id.btnSpotifyApp);
        Button btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        Button btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        Button btnBuildBiggerApp = (Button) findViewById(R.id.btnBuildBiggerApp);
        Button btnXYZReaderApp = (Button) findViewById(R.id.btnXYZReaderApp);
        Button btnCapstoneApp = (Button) findViewById(R.id.btnCapstoneApp);
        btnSpotifyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Spotify Streamer");
            }
        });
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Football Scores");
            }
        });
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Library");
            }
        });
        btnBuildBiggerApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Build it bigger");
            }
        });
        btnXYZReaderApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("XYZ Reader");
            }
        });
        btnCapstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Capstone");
            }
        });
    }

    // This method will show toast message for the selected button.
    public void showToast(String appName){
        Toast.makeText(MainActivity.this,"This button will launch "+ appName + " app!",Toast.LENGTH_SHORT).show();
    }
}
