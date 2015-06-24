package com.example.pc02.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;




public class MainActivity extends Activity {
    EditText editext;
    TextView textView;
    RadioButton radioButton;
    EditText caja1t;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View view){

        editext =(EditText) findViewById(R.id.editText2);
        textView =(TextView) findViewById(R.id.textView2);
        String show=editext.getText().toString();
        textView.setText("hi   " + show);
        caja1t=(EditText) findViewById(R.id.editText);
        label=(TextView) findViewById(R.id.textView);
        String showII=caja1t.getText().toString();
        label.setText();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
