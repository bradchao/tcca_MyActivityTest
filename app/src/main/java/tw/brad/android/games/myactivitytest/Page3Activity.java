package tw.brad.android.games.myactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void gotoMain(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

}
