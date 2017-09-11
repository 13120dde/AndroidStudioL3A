package a13solutions.androidstudiol3a;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Controller controller;
    private TopFragment topFragment;
    private BottomFragment bottomFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateController();
    }

    private void instantiateController() {
        FragmentManager fm = getFragmentManager();
        topFragment = (TopFragment) fm.findFragmentById(R.id.fragTop);
        bottomFragment = (BottomFragment) fm.findFragmentById(R.id.fragBottom);
        controller = new Controller(topFragment,bottomFragment);

    }
}
