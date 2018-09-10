package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("One","Lutti"));
        numbers.add(new Word("Two","Otiiko"));
        numbers.add(new Word("Three", "Tolookosu"));
        numbers.add(new Word("Four","Oyyisa"));
        numbers.add(new Word("Five", "Massokka"));
        numbers.add(new Word("Six","Temmokka"));
        numbers.add(new Word("Seven", "Kenekaku"));
        numbers.add(new Word("Eight", "Kawinta"));
        numbers.add(new Word("Nine", "Wo'e"));
        numbers.add(new Word("Ten", "Na'aacha"));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

       /* ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbers);*/

/*        for(int index = 0; index < numbers.size(); index++) {
            TextView numbersView = new TextView(this);
            numbersView.setText(numbers.get(index));
            numbersLayout.addView(numbersView);
        }*/
    }
}