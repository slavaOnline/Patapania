package seagullstudio.patapania;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;



public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    //работа с кнопками уровней
    public void onClickGame1(View view) {
        Intent intent = new Intent(LevelActivity.this, GameActivity.class);
        intent.putExtra("count", 1);
        startActivity(intent);
    }
    public void onClickGame2(View view) {
        Intent intent = new Intent(LevelActivity.this, GameActivity.class);
        intent.putExtra("count", 2);
        startActivity(intent);
    }
    public void onClickGame3(View view) {
        Intent intent = new Intent(LevelActivity.this, GameActivity.class);
        intent.putExtra("count", 3);
        startActivity(intent);
    }

}
