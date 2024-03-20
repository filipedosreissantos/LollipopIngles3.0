package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cursoandroid.navigationdrawertest.R;

public final class FragmentPrincipalBinding implements ViewBinding {
    public final Button buttonEnter;
    public final ImageView imageView2;
    private final ConstraintLayout rootView;
    public final TextView textView34;

    private FragmentPrincipalBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.buttonEnter = button;
        this.imageView2 = imageView;
        this.textView34 = textView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPrincipalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPrincipalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_principal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPrincipalBinding bind(View view) {
        int i = R.id.buttonEnter;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.buttonEnter);
        if (button != null) {
            i = R.id.imageView2;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
            if (imageView != null) {
                i = R.id.textView34;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView34);
                if (textView != null) {
                    return new FragmentPrincipalBinding((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
