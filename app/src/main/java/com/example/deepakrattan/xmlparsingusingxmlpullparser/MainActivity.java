package com.example.deepakrattan.xmlparsingusingxmlpullparser;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView1);

        List<Employee> employees = null;
        try {
            XmlPullParserHandler parser = new XmlPullParserHandler();
            InputStream is = getAssets().open("employees.xml");
            employees = parser.parse(is);

            ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, employees);
            listView.setAdapter(adapter);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
