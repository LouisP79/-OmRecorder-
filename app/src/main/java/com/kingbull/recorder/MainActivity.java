package com.kingbull.recorder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
  private final static String DEMO_PCM = "Pcm Recorder";
  private final static String DEMO_WAV = "Wav Recorder";
  ListView listView;
  String[] demoArray = new String[] { "Pcm Recorder", "Wav Recorder" };

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    listView = findViewById(android.R.id.list);
    listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, demoArray));
    listView.setOnItemClickListener((adapterView, view, i, l) -> {
      switch (demoArray[i]) {
        case DEMO_PCM:
          startActivity(new Intent(MainActivity.this, PcmRecorderActivity.class));
          break;
        case DEMO_WAV:
          startActivity(new Intent(MainActivity.this, WavRecorderActivity.class));
          break;
      }
    });
  }
}
