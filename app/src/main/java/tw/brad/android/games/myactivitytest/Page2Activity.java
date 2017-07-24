package tw.brad.android.games.myactivitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void exit(View view){
        finish();
    }

}
