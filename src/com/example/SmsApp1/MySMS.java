package com.example.SmsApp1;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MySMS extends Activity {

    Button btnSendSMS;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnSendSMS = (Button)findViewById(R.id.btnSendSMS);
        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS("0857603133","Hi You got a message!");
                Toast.makeText(getApplicationContext(), "Your Message is sent", Toast.LENGTH_LONG).show();
            }

            private void sendSMS(String phoneNumber, String message) {
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(phoneNumber, null, message, null, null);
            }
        });
    }
}
