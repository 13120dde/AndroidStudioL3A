package a13solutions.androidstudiol3a;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    private Button btnChangeColor;
    private TextView tvCurrentColor;
    private Controller controller;

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        instantiateComponents(view);
        addListeners();
        return view;
    }

    private void addListeners() {
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.changeTVColor(btnChangeColor.getText().toString());
            }
        });
    }

    private void instantiateComponents(View view) {
        btnChangeColor= (Button) view.findViewById(R.id.btnChangeColor);
        tvCurrentColor = (TextView) view.findViewById(R.id.tvCurrentColor);

    }

    public void changeColor(int color) {
        tvCurrentColor.setBackgroundColor(color);
    }

    public void changeButtonText(String text){
        btnChangeColor.setText(text);
    }

    public void setController(Controller controller) {
        this.controller=controller;
    }
}
