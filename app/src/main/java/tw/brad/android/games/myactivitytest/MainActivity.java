package tw.brad.android.games.myactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private int rand;   // 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.i("brad", "onCreate");
    }

    public void gotoPage2(View view){
        Intent it = new Intent(this, Page2Activity.class);
        it.putExtra("rand", rand);
        it.putExtra("name", "Brad");
        it.putExtra("sound", false);
        it.putExtra("stage", 12);

        Bundle data = new Bundle();
        data.putString("key1", "Value1");
        data.putInt("key2", 123);
        it.putExtra("mydata", data);

        startActivity(it);
    }

    @Override
    protected void onStart() {
        super.onStart();

        tv = (TextView)findViewById(R.id.main_tv);
        rand = (int)(Math.random()*101);
        tv.append(" -> " + rand );

        Log.i("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("brad", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "onDestroy");
    }
}
