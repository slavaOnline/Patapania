package seagullstudio.patapania;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.SurfaceHolder;

import java.util.ArrayList;
import java.util.Iterator;



public class DrawThread extends Thread {

    GameActivity gameActivity = new GameActivity();
    private SurfaceHolder surfaceHolder;
    private static final String TAG = "myLogs";
    private volatile boolean running = true;
    private Paint backgroundPaint = new Paint();

    Level level = new Level();
    public ArrayList<Circle> listOfBit = new ArrayList<>();
    int seconds = 0;
    int i = 0;


    {
        backgroundPaint.setColor(Color.WHITE);
        backgroundPaint.setStyle(Paint.Style.FILL);
    }

    public DrawThread(Context context, SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
         gameActivity = (GameActivity) context;

    }

    public void requestStop() {
        running = false;
    }


    @Override
    public void run() {
        while (running) {
            Canvas canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                try {

                    canvas.drawPaint(backgroundPaint); //закрашивания canvas в белый
                    onDraw(canvas);
                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }

            }
        }
    }


    protected void onDraw(Canvas canvas) {

        int Hgt = canvas.getHeight();
        int Wdh = canvas.getWidth();
        int Line = Wdh / 3 - Wdh / 6;
        int r = Hgt / 2;

        //добавление массива кругов в ArrayList

        if (gameActivity.count == 1)
            listOfBit = level.getLevel_1(canvas, listOfBit);

        if (gameActivity.count == 2)
            listOfBit = level.getLevel_2(canvas, listOfBit);

        if (gameActivity.count == 3)
            listOfBit = level.getLevel_3(canvas, listOfBit);

        //проверка на совпадение времени и добавление кругов в массив отрисовки
        Circle[] arr = listOfBit.toArray(new Circle[listOfBit.size()]);
        if (seconds == arr[i].time) {
            gameActivity.listOfRun.add(arr[i]);
            i++;
        }



        //рисование кружков
        Paint circlePaint = new Paint();
        Paint edgePaint = new Paint();
        edgePaint.setColor(Color.BLACK);
        circlePaint.setStrokeWidth(3);
        Circle item;

        for (Circle circle : gameActivity.listOfRun) {

            circlePaint.setColor(circle.color);
            canvas.drawCircle(circle.x, circle.y, r, edgePaint);
            canvas.drawCircle(circle.x, circle.y, r - 7, circlePaint);
            circle.x -= circle.speed;
        }

        //рисование линий игрового поля
        Paint linePaint = new Paint();
        linePaint.setStrokeWidth(4);
        linePaint.setColor(Color.BLACK);
        canvas.drawLine(Line, 0, Line, Hgt, linePaint);

        //увеличиваю счетчик секунд!
        seconds += 20;

    }


}


