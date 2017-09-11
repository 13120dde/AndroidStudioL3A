package a13solutions.androidstudiol3a;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {


    private Controller controller;
    private ListView list;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        instantiateComponents(view);
        return view;
    }

    private void instantiateComponents(View view) {
        list = (ListView) view.findViewById(R.id.lvColors);
        String[] array = {"a","b","c","d","e","f","g"};


    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
