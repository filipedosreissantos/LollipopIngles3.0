package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cursoandroid.navigationdrawertest.R;
import com.google.android.material.navigation.NavigationView;

public final class ActivityMainBinding implements ViewBinding {
    public final AppBarMainBinding appBarMain;
    public final DrawerLayout drawerLayout;
    public final NavigationView navView;
    private final DrawerLayout rootView;

    private ActivityMainBinding(DrawerLayout drawerLayout2, AppBarMainBinding appBarMainBinding, DrawerLayout drawerLayout3, NavigationView navigationView) {
        this.rootView = drawerLayout2;
        this.appBarMain = appBarMainBinding;
        this.drawerLayout = drawerLayout3;
        this.navView = navigationView;
    }

    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.app_bar_main;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.app_bar_main);
        if (findChildViewById != null) {
            AppBarMainBinding bind = AppBarMainBinding.bind(findChildViewById);
            DrawerLayout drawerLayout2 = (DrawerLayout) view;
            NavigationView navigationView = (NavigationView) ViewBindings.findChildViewById(view, R.id.nav_view);
            if (navigationView != null) {
                return new ActivityMainBinding(drawerLayout2, bind, drawerLayout2, navigationView);
            }
            i = R.id.nav_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
