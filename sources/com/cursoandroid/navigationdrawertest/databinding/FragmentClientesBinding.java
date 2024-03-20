package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cursoandroid.navigationdrawertest.R;

public final class FragmentClientesBinding implements ViewBinding {
    public final ImageView imageView4;
    private final ConstraintLayout rootView;
    public final TextView textView31;
    public final TextView textView32;

    private FragmentClientesBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.imageView4 = imageView;
        this.textView31 = textView;
        this.textView32 = textView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentClientesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentClientesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_clientes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentClientesBinding bind(View view) {
        int i = R.id.imageView4;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView4);
        if (imageView != null) {
            i = R.id.textView31;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView31);
            if (textView != null) {
                i = R.id.textView32;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView32);
                if (textView2 != null) {
                    return new FragmentClientesBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
