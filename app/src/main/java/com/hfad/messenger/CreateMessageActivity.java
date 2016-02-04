package com.hfad.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message); //

        // Get the text from the editable text field (messageView)
        String messageText = messageView.getText().toString();

        //Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // putExtra() puts extra information in an intent
        // "message is a String name for the value being passed in. value is the value"
        // putExtra() overloaded to value has many possible types
        /*
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        intent.putExtra("message", messageText);
        */

        // Instead of creating an Intent that's explicitly for receivingMessageActivity, creating
        // an intent that uses a send action.
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
