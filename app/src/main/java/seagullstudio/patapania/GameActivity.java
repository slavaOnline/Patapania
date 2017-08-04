package seagullstudio.patapania;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class GameActivity  extends AppCompatActivity {
    public ArrayList<Circle> listOfRun = new ArrayList<>();
    int count;
    DrawView drawView;
    private SoundPool soundPool;
    private int mMelody=1;
    private int mPlay;
    private int bass;
    private int tone;
    private int slap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        drawView = (DrawView) findViewById(R.id.view);
        count = getIntent().getExtras().getInt("count");
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        bass = soundPool.load(this, R.raw.bass, 1);
        tone = soundPool.load(this, R.raw.tone, 1);
        slap = soundPool.load(this, R.raw.slap, 1);

    }



    //удаление кружков по нажатию Прим. надо сделать функцию отдельно в будующем

    public void removeClickRed(View view){
        mPlay = soundPool.play(tone,1,1,1,0,1);
        for (Circle i: listOfRun) {
            if (i.x< drawView.wdt / 3 - drawView.wdt / 6 + drawView.hgt/2 && i.x > drawView.wdt / 3 - drawView.wdt / 6 - drawView.hgt/2 && i.color == Color.RED) {
                listOfRun.remove(i);
                break;
            }
        }
    }

    public void removeClickBLUE(View view){
        mPlay = soundPool.play(slap,1,1,1,0,1);
        for (Circle i: listOfRun) {
            if (i.x < drawView.wdt / 3 - drawView.wdt / 6 + drawView.hgt / 2 && i.x > drawView.wdt / 3 - drawView.wdt / 6 - drawView.hgt / 2 && i.color == Color.BLUE) {
                listOfRun.remove(i);
                break;
            }
        }
    }

    public void removeClickGreen(View view){
        mPlay = soundPool.play(bass,1,1,1,0,1);
        for (Circle i: listOfRun) {
            if (i.x< drawView.wdt / 3 - drawView.wdt / 6 + drawView.hgt/2 && i.x > drawView.wdt / 3 - drawView.wdt / 6 - drawView.hgt/2 && i.color == Color.GREEN) {
                listOfRun.remove(i);
                break;
            }
        }
    }
}




