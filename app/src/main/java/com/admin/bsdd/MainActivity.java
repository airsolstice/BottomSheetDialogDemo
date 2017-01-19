package com.admin.bsdd;

import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<String> mData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mData.add("Item 1");
        mData.add("Item 2");
        mData.add("Item 3");
        mData.add("Item 4");
        mData.add("Item 5");
        mData.add("Item 6");
        mData.add("Item 7");
        mData.add("Item 8");
        mData.add("Item 9");
        mData.add("Item 10");
        mData.add("Item 11");
        mData.add("Item 12");
        mData.add("Item 13");
        mData.add("Item 14");
        mData.add("Item 15");
        mData.add("Item 16");
        mData.add("Item 17");
        mData.add("Item 18");
        mData.add("Item 19");
        mData.add("Item 20");
        mData.add("Item 21");
        mData.add("Item 22");
        mData.add("Item 23");
        mData.add("Item 24");
        mData.add("Item 25");

    }


    public void clickButton(View v) {

        final BottomSheetDialog bsd = new BottomSheetDialog(this);
        ListView lv = (ListView) LayoutInflater.from(this).inflate(R.layout.content, null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout
                .simple_list_item_1, mData);
        lv.setAdapter(adapter);
        bsd.setContentView(lv);
        bsd.show();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                bsd.hide();
            }
        });

    }

}
