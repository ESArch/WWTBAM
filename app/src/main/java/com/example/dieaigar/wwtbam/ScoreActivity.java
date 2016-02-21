package com.example.dieaigar.wwtbam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();
        TabHost.TabSpec spec = host.newTabSpec("TAB1");
        spec.setIndicator("Label1");
        spec.setContent(R.layout.tab_layout);
        host.addTab(spec);

        spec = host.newTabSpec("TAB2");
        spec.setIndicator("Label2");
        spec.setContent(R.layout.tab_layout);
        host.addTab(spec);

    }

    private void addRow(){
        TableLayout tl = (TableLayout) findViewById(R.id.score_table);

        TableRow row = new TableRow(this);

        TextView tv = new TextView(this);
        tv.setText("asd");

        row.addView(tv);

        tl.addView(row, 0);
    }
}
