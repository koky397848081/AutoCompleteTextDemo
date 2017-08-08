package com.example.jingjing.autocompletetextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;
    private  String[] res = {"beijing1","beijing2","beijing2","beijing4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * 初始化控件
        *需要适配器,初始化数据源，去匹配文本框输入内容;  将adpter与当前autoCompleteTextView绑定
        * */

        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);
    }

}
