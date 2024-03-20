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

public final class FragmentNumbers2Binding implements ViewBinding {
    public final Guideline guideline10;
    public final Guideline guideline9;
    public final ImageView imageEight;
    public final ImageView imageNine;
    public final ImageView imageSeven;
    public final ImageView imageSix;
    public final ImageView imageTen1;
    public final ImageView imageTen2;
    private final ConstraintLayout rootView;
    public final TextView textView41;
    public final TextView textView42;
    public final TextView textView43;
    public final TextView textView44;
    public final TextView textView45;

    private FragmentNumbers2Binding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.guideline10 = guideline;
        this.guideline9 = guideline2;
        this.imageEight = imageView;
        this.imageNine = imageView2;
        this.imageSeven = imageView3;
        this.imageSix = imageView4;
        this.imageTen1 = imageView5;
        this.imageTen2 = imageView6;
        this.textView41 = textView;
        this.textView42 = textView2;
        this.textView43 = textView3;
        this.textView44 = textView4;
        this.textView45 = textView5;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNumbers2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentNumbers2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_numbers_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentNumbers2Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline10;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline10);
        if (guideline != null) {
            i = R.id.guideline9;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline9);
            if (guideline2 != null) {
                i = R.id.imageEight;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageEight);
                if (imageView != null) {
                    i = R.id.imageNine;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageNine);
                    if (imageView2 != null) {
                        i = R.id.imageSeven;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageSeven);
                        if (imageView3 != null) {
                            i = R.id.imageSix;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageSix);
                            if (imageView4 != null) {
                                i = R.id.imageTen_1;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageTen_1);
                                if (imageView5 != null) {
                                    i = R.id.imageTen_2;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageTen_2);
                                    if (imageView6 != null) {
                                        i = R.id.textView41;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView41);
                                        if (textView != null) {
                                            i = R.id.textView42;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView42);
                                            if (textView2 != null) {
                                                i = R.id.textView43;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView43);
                                                if (textView3 != null) {
                                                    i = R.id.textView44;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView44);
                                                    if (textView4 != null) {
                                                        i = R.id.textView45;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView45);
                                                        if (textView5 != null) {
                                                            return new FragmentNumbers2Binding((ConstraintLayout) view2, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5);
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
