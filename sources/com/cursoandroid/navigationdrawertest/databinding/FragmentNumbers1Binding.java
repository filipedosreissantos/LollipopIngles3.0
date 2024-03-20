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

public final class FragmentNumbers1Binding implements ViewBinding {
    public final Guideline guideline7;
    public final Guideline guideline8;
    public final ImageView imageFive;
    public final ImageView imageFour;
    public final ImageView imageOne;
    public final ImageView imageThree;
    public final ImageView imageTwo;
    public final ImageView imageZero;
    private final ConstraintLayout rootView;
    public final TextView textView35;
    public final TextView textView36;
    public final TextView textView37;
    public final TextView textView38;
    public final TextView textView39;
    public final TextView textView40;

    private FragmentNumbers1Binding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.guideline7 = guideline;
        this.guideline8 = guideline2;
        this.imageFive = imageView;
        this.imageFour = imageView2;
        this.imageOne = imageView3;
        this.imageThree = imageView4;
        this.imageTwo = imageView5;
        this.imageZero = imageView6;
        this.textView35 = textView;
        this.textView36 = textView2;
        this.textView37 = textView3;
        this.textView38 = textView4;
        this.textView39 = textView5;
        this.textView40 = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNumbers1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentNumbers1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_numbers_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentNumbers1Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline7;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline7);
        if (guideline != null) {
            i = R.id.guideline8;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline8);
            if (guideline2 != null) {
                i = R.id.imageFive;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageFive);
                if (imageView != null) {
                    i = R.id.imageFour;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageFour);
                    if (imageView2 != null) {
                        i = R.id.imageOne;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageOne);
                        if (imageView3 != null) {
                            i = R.id.imageThree;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageThree);
                            if (imageView4 != null) {
                                i = R.id.imageTwo;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageTwo);
                                if (imageView5 != null) {
                                    i = R.id.imageZero;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageZero);
                                    if (imageView6 != null) {
                                        i = R.id.textView35;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView35);
                                        if (textView != null) {
                                            i = R.id.textView36;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView36);
                                            if (textView2 != null) {
                                                i = R.id.textView37;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView37);
                                                if (textView3 != null) {
                                                    i = R.id.textView38;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView38);
                                                    if (textView4 != null) {
                                                        i = R.id.textView39;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView39);
                                                        if (textView5 != null) {
                                                            i = R.id.textView40;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView40);
                                                            if (textView6 != null) {
                                                                return new FragmentNumbers1Binding((ConstraintLayout) view2, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6);
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
