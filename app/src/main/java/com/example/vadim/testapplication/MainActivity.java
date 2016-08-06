package com.example.vadim.testapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView raceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raceTextView = (TextView) findViewById(R.id.textView);
    }

    public void buttonStartPressed(View view) {

        showToast(view);

        raceTextView.setText(" vylezai...  priehali");

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                " гонка началась! ",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }

    public void showMap(View view) {
        String geoUriString = "geo:59.433681,24.7213664?z=18";
        Uri geoUri = Uri.parse(geoUriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);
        startActivity(mapIntent);
    }

    public void buttonShowMapPressed(View view) {

        showMap(view);
    }

}
