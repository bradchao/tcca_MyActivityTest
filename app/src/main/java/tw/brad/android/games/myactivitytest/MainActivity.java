package tw.brad.android.games.myactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("brad", "onCreate");
    }

    public void gotoPage2(View view){
        Intent it = new Intent(this, Page2Activity.class);
        startActivity(it);
    }

    @Override
    protected void onStart() {
        super.onStart();
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
