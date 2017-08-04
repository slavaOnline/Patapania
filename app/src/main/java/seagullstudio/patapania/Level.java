package seagullstudio.patapania;

import android.graphics.Canvas;
import android.graphics.Color;

import java.util.ArrayList;


class Level {
    //метод который заполняет выбранный ArrayList данными об уровне

    public ArrayList getLevel_1(Canvas canvas, ArrayList lvl) {
        int Hgt = canvas.getHeight();
        int Wdh = canvas.getWidth();
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1000, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1300, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1600, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1900, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 2200, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.RED, 2700, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.RED, 3200, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.RED, 3700, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 4300, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 4600, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 4900, 7));
        return lvl;
    }


    public ArrayList getLevel_2(Canvas canvas, ArrayList lvl) {
        int Hgt = canvas.getHeight();
        int Wdh = canvas.getWidth();
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 1000, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 1300, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.GREEN, 1600, 7));
        return lvl;
    }


    public ArrayList getLevel_3(Canvas canvas, ArrayList lvl) {
        int Hgt = canvas.getHeight();
        int Wdh = canvas.getWidth();
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1000, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1300, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1600, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 1900, 7));
        lvl.add(new Circle(Wdh, Hgt / 2, Color.BLUE, 2200, 7));
        return lvl;
    }
}