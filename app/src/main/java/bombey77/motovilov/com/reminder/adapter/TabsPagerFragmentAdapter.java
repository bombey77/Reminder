package bombey77.motovilov.com.reminder.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import bombey77.motovilov.com.reminder.R;
import bombey77.motovilov.com.reminder.fragment.ExampleFragment;

/**
 * Created by Ромашка on 09.09.2017.
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;
    Context context;

    public TabsPagerFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        /*tabs = new String[] {
                "Tab 1",
                "Tab 2",
                "Tab 3"
        };*/

        tabs = new String[3];
        tabs[0] = context.getString(R.string.tab_layout_one);
        tabs[1] = context.getString(R.string.tab_layout_two);
        tabs[2] = context.getString(R.string.tab_layout_three);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
