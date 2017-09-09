package bombey77.motovilov.com.reminder.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bombey77.motovilov.com.reminder.R;

/**
 * Created by Ромашка on 09.09.2017.
 */

public class ExampleFragment extends Fragment {

    private View view;

    public static ExampleFragment getInstance() {
        Bundle bundle = new Bundle();
        ExampleFragment exampleFragment = new ExampleFragment();
        exampleFragment.setArguments(bundle);
        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmetn_layout, container, false);
        return view;
    }
}
