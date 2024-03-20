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

public final class FragmentServicosBinding implements ViewBinding {
    public final ImageView imageView3;
    private final ConstraintLayout rootView;
    public final TextView textView26;
    public final TextView textView27;
    public final TextView textView28;
    public final TextView textView29;

    private FragmentServicosBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.imageView3 = imageView;
        this.textView26 = textView;
        this.textView27 = textView2;
        this.textView28 = textView3;
        this.textView29 = textView4;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentServicosBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentServicosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_servicos, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentServicosBinding bind(View view) {
        int i = R.id.imageView3;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
        if (imageView != null) {
            i = R.id.textView26;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView26);
            if (textView != null) {
                i = R.id.textView27;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView27);
                if (textView2 != null) {
                    i = R.id.textView28;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView28);
                    if (textView3 != null) {
                        i = R.id.textView29;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView29);
                        if (textView4 != null) {
                            return new FragmentServicosBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
