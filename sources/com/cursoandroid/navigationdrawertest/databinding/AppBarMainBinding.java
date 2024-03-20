package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cursoandroid.navigationdrawertest.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class AppBarMainBinding implements ViewBinding {
    public final FloatingActionButton fab;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private AppBarMainBinding(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Toolbar toolbar2) {
        this.rootView = coordinatorLayout;
        this.fab = floatingActionButton;
        this.toolbar = toolbar2;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static AppBarMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AppBarMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.app_bar_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AppBarMainBinding bind(View view) {
        int i = R.id.fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.fab);
        if (floatingActionButton != null) {
            i = R.id.toolbar;
            Toolbar toolbar2 = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
            if (toolbar2 != null) {
                return new AppBarMainBinding((CoordinatorLayout) view, floatingActionButton, toolbar2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
