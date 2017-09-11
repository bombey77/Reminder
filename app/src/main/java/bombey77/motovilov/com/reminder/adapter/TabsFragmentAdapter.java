package bombey77.motovilov.com.reminder.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import bombey77.motovilov.com.reminder.fragment.AbstractTabsFragment;
import bombey77.motovilov.com.reminder.fragment.BirthdayFragment;
import bombey77.motovilov.com.reminder.fragment.InboxFragment;
import bombey77.motovilov.com.reminder.fragment.TasksFragment;

/**
 * Created by Ромашка on 09.09.2017.
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabsFragment> tabs;
    Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, TasksFragment.getInstance(context));
        tabs.put(1, InboxFragment.getInstance(context));
        tabs.put(2, BirthdayFragment.getInstance(context));
    }
}
