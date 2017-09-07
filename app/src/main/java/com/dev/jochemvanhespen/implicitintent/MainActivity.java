package com.dev.jochemvanhespen.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view){
        EditText latitude = (EditText) findViewById(R.id.latitude);
        EditText longitude = (EditText) findViewById(R.id.longitude);
        String lat = latitude.getText().toString();
        String lng = longitude.getText().toString();
        double latDouble = Double.parseDouble(lat);
        double lngDouble = Double.parseDouble(lng);

        //show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+latDouble+","+lngDouble));
        startActivity(intent);
    }
}
