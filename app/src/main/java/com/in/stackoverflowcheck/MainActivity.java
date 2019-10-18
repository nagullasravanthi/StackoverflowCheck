package com.in.stackoverflowcheck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends Activity {


    private AutoCompleteTextView actv;
    String[] languages={"Android ","java","java","IOS","SQL","JDBC","Web services"};
    ArrayList<String> xyz=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
