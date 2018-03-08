package com.csp.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    TextView textview1,textview2,textview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go = (Button)findViewById(R.id.sav);


        textview1 = (TextView)findViewById(R.id.textView2);
        textview2 = (TextView)findViewById(R.id.textView3);
        textview3 = (TextView)findViewById(R.id.textView4);


        ArrayList<Integer> integersList = new ArrayList<Integer>();
        ArrayList<String> StringList = new ArrayList<String>();

        StringList.add("google");
        StringList.add("Apple");
        StringList.add("Sony");
        StringList.add("Zandor");
        StringList.add("Xbox");


        integersList.add(3);
        integersList.add(4);
        integersList.add(2);
        integersList.add(5);
        integersList.add(1);
        integersList.add(9);
        integersList.add(8);
        integersList.add(6);

        for (int i=0 ; i<integersList.size();i++){
            textview1.setText(textview1.getText()+"  "+ integersList.get(i)+" ");

        }

        for (int k=0 ; k<StringList.size();k++) {
            textview1.setText(textview1.getText() + "  " + StringList.get(k) + " ");
        }


        Collections.sort(integersList);
        Collections.sort(StringList);


        for (int i=0 ; i<integersList.size();i++){
            textview2.setText(textview2.getText()+"  "+ integersList.get(i)+" ");


        }

        for (int k=0 ; k<StringList.size();k++) {
            textview2.setText(textview2.getText() + "  " + StringList.get(k) + " ");
        }

        Collections.reverse(integersList);
        Collections.reverse(StringList);


        for (int i=0 ; i<integersList.size();i++){
            textview3.setText(textview3.getText()+"  "+ integersList.get(i)+" ");


        }

        for (int k=0 ; k<StringList.size();k++) {
            textview3.setText(textview3.getText() + "  " + StringList.get(k) + " ");
        }

        go.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent i = new Intent(MainActivity.this,secoend.class);
                startActivity(i);

            }
        });


getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);



    }
}
