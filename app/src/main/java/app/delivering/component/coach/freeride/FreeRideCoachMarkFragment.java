package app.delivering.component.coach.freeride;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.R;
import app.delivering.component.BaseFragment;
import app.delivering.mvp.coach.freeride.binder.FreeRideCoachMarkBinder;

public class FreeRideCoachMarkFragment extends BaseFragment {

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_free_ride_coach_mark, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        FreeRideCoachMarkBinder initBinder = new FreeRideCoachMarkBinder(getBaseActivity());
        addItemForViewsInjection(initBinder, view);
    }
}
