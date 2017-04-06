package com.in.stackoverflowcheck;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private AutoCompleteTextView actv;
    String[] languages={"Android ","java","java","IOS","SQL","JDBC","Web services"};
    ArrayList<String> xyz=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        myToolbar.setTitle("xyz");
        TextView tv=(TextView) myToolbar.getChildAt(0);
        tv.setTypeface(Typeface.SANS_SERIF);
        setSupportActionBar(myToolbar);



        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        EditText name = (EditText) findViewById(R.id.input_name);

        for(int i=0;i<languages.length;i++){

            xyz.add(new String(languages[i]));
        }
        String[] arrayConcelhos = xyz.toArray(new String[xyz.size()]);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,arrayConcelhos);
        actv.setAdapter(adapter);
        name.setImeActionLabel("Next", KeyEvent.KEYCODE_ENTER);
        name.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                  Log.e("fd","dfime");
                    startActivity(new Intent(MainActivity.this,SecondActivity.class).setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
                    overridePendingTransition(android.support.v7.appcompat.R.anim.abc_slide_in_bottom, android.support.v7.appcompat.R.anim.abc_slide_in_top);
                    handled = true;
                }
                return handled;
            }
        });


    }
}
