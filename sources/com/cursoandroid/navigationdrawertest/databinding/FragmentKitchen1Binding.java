package com.cursoandroid.navigationdrawertest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cursoandroid.navigationdrawertest.R;

public final class FragmentKitchen1Binding implements ViewBinding {
    public final ImageView fryingPan;
    public final Guideline guideline17;
    public final Guideline guideline18;
    public final ImageView plate;
    public final ImageView refrigerator;
    private final ConstraintLayout rootView;
    public final ImageView stove;
    public final ImageView table;
    public final TextView textView55;
    public final TextView textView56;
    public final TextView textView57;
    public final TextView textView58;
    public final TextView textView59;
    public final TextView textView60;
    public final ImageView toaster;

    private FragmentKitchen1Binding(ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, Guideline guideline2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView6) {
        this.rootView = constraintLayout;
        this.fryingPan = imageView;
        this.guideline17 = guideline;
        this.guideline18 = guideline2;
        this.plate = imageView2;
        this.refrigerator = imageView3;
        this.stove = imageView4;
        this.table = imageView5;
        this.textView55 = textView;
        this.textView56 = textView2;
        this.textView57 = textView3;
        this.textView58 = textView4;
        this.textView59 = textView5;
        this.textView60 = textView6;
        this.toaster = imageView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentKitchen1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentKitchen1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_kitchen_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentKitchen1Binding bind(View view) {
        View view2 = view;
        int i = R.id.fryingPan;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.fryingPan);
        if (imageView != null) {
            i = R.id.guideline17;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline17);
            if (guideline != null) {
                i = R.id.guideline18;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline18);
                if (guideline2 != null) {
                    i = R.id.plate;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.plate);
                    if (imageView2 != null) {
                        i = R.id.refrigerator;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.refrigerator);
                        if (imageView3 != null) {
                            i = R.id.stove;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.stove);
                            if (imageView4 != null) {
                                i = R.id.table;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.table);
                                if (imageView5 != null) {
                                    i = R.id.textView55;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView55);
                                    if (textView != null) {
                                        i = R.id.textView56;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView56);
                                        if (textView2 != null) {
                                            i = R.id.textView57;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView57);
                                            if (textView3 != null) {
                                                i = R.id.textView58;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView58);
                                                if (textView4 != null) {
                                                    i = R.id.textView59;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView59);
                                                    if (textView5 != null) {
                                                        i = R.id.textView60;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView60);
                                                        if (textView6 != null) {
                                                            i = R.id.toaster;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.toaster);
                                                            if (imageView6 != null) {
                                                                return new FragmentKitchen1Binding((ConstraintLayout) view2, imageView, guideline, guideline2, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, textView6, imageView6);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
