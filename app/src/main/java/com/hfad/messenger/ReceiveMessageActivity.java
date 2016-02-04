package com.hfad.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        *
        * getIntent() returns the intent that started the activity
        * (CreateMessageActivity),and any information along with it.
        *
        */
        Intent intent = getIntent();

        // Get the intent and get the message from it (createMessageActivity) using getStringExtra()
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        TextView messageView = (TextView) findViewById(R.id.message);

        messageView.setText(messageText); // Add the text to the message text view.
    }

}
