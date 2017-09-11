package a13solutions.androidstudiol3a;

import android.graphics.Color;

/**
 * Created by 13120dde on 2017-09-11.
 */

class Controller {

    private TopFragment topFragment;
    private BottomFragment bottomFragment;

    public Controller(TopFragment topFragment, BottomFragment bottomFragment){
        this.topFragment=topFragment;
        this.bottomFragment=bottomFragment;
        this.topFragment.setController(this);
        this.bottomFragment.setController(this);
    }

    public void changeTVColor(String color) {

        int c;
        switch (color){
            case ("RÖD"):
                c = Color.RED;
                break;
            case ("GUL"):
                c = Color.YELLOW;
                break;
            case ("BLÅ"):
                c = Color.BLUE;
                break;
            case ("GRÖN"):
                c = Color.GREEN;
                break;
            default:
                c = Color.GRAY;
                break;
        }

        topFragment.changeColor(c);
    }

    public void changeButtomText(String text){
        topFragment.changeButtonText(text);
    }
}
