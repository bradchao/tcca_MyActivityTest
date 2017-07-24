package tw.brad.android.games.myactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        tv = (TextView)findViewById(R.id.page2_tv);

        Intent it = getIntent();
        int stage = it.getIntExtra("stage", -1);
        String name = it.getStringExtra("name");
        String user = it.getStringExtra("user");
        int rand = it.getIntExtra("rand", -1);

        String key1 = it.getBundleExtra("mydata").getString("key1");

        tv.append("\n" + "Stage: " + stage + "\n" +
                "Name:" + name + "\n" +
                "Rand: " + rand + "\n" +
                "Key1: " + key1 + "\n" +
                "temp: " + user );





    }

    public void exit(View view){
        finish();
    }

    public void gotoPage3(View v){
        Intent it = new Intent(this, Page3Activity.class);
        startActivity(it);
    }

    @Override
    public void finish() {
        //
        super.finish();
        //
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "Page2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "Page2: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "Page2: onDestroy");
    }


}
