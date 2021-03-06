package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mTextViewDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        mTextViewDetail = (TextView) findViewById(R.id.tv_detail_data);
        Intent intentThatStartedActivity = getIntent();
        if(intentThatStartedActivity != null && intentThatStartedActivity.getExtras() != null){
            String mainActivityWeatherData = intentThatStartedActivity.getStringExtra(Intent.EXTRA_TEXT);
            mTextViewDetail.setText(mainActivityWeatherData);
        }
    }
}