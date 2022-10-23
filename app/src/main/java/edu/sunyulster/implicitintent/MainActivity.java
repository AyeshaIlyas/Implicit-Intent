package edu.sunyulster.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showWebPage(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.sunyulster.edu/"));
        startActivity(i);
    }

    public void enableLink(View v) {
        Intent i = new Intent(Settings.ACTION_APP_OPEN_BY_DEFAULT_SETTINGS,
                Uri.parse("package:edu.sunyulster.mywebview"));
        startActivity(i);
    }

}