package bombey77.motovilov.com.reminder.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bombey77.motovilov.com.reminder.R;

/**
 * Created by Ромашка on 09.09.2017.
 */

public class TasksFragment extends AbstractTabsFragment {

    public static TasksFragment getInstance(Context context) {
        Bundle bundle = new Bundle();
        TasksFragment tasksFragment = new TasksFragment();
        tasksFragment.setArguments(bundle);
        tasksFragment.setContext(context);
        tasksFragment.setTitle(context.getString(R.string.tab_layout_tasks));
        return tasksFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.inbox_layout, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
