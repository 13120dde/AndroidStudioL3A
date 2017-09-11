package a13solutions.androidstudiol3a;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {


    private Controller controller;
    private ListView list;
    String[] content = {"GUL","BLÅ","GRÖN","RÖD"};
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
        list.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1 , content));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView tv = (TextView) view;
                controller.changeButtomText(tv.getText().toString());

            }
        });

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
