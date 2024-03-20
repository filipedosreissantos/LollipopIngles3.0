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

public final class FragmentRestaurantBinding implements ViewBinding {
    public final ConstraintLayout frameLayout;
    public final Guideline guideline11;
    public final Guideline guideline12;
    public final ImageView imageChair;
    public final ImageView imageFork;
    public final ImageView imageKnife;
    public final ImageView imageSpoon;
    public final ImageView imageWaiter;
    public final ImageView imageWaitress;
    private final ConstraintLayout rootView;
    public final TextView textView27;
    public final TextView textView28;
    public final TextView textView29;
    public final TextView textView30;
    public final TextView textView31;
    public final TextView textView32;

    private FragmentRestaurantBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.frameLayout = constraintLayout2;
        this.guideline11 = guideline;
        this.guideline12 = guideline2;
        this.imageChair = imageView;
        this.imageFork = imageView2;
        this.imageKnife = imageView3;
        this.imageSpoon = imageView4;
        this.imageWaiter = imageView5;
        this.imageWaitress = imageView6;
        this.textView27 = textView;
        this.textView28 = textView2;
        this.textView29 = textView3;
        this.textView30 = textView4;
        this.textView31 = textView5;
        this.textView32 = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRestaurantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentRestaurantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_restaurant, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRestaurantBinding bind(View view) {
        View view2 = view;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
        int i = R.id.guideline11;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline11);
        if (guideline != null) {
            i = R.id.guideline12;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline12);
            if (guideline2 != null) {
                i = R.id.imageChair;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageChair);
                if (imageView != null) {
                    i = R.id.imageFork;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageFork);
                    if (imageView2 != null) {
                        i = R.id.imageKnife;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageKnife);
                        if (imageView3 != null) {
                            i = R.id.imageSpoon;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageSpoon);
                            if (imageView4 != null) {
                                i = R.id.imageWaiter;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageWaiter);
                                if (imageView5 != null) {
                                    i = R.id.imageWaitress;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageWaitress);
                                    if (imageView6 != null) {
                                        i = R.id.textView27;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView27);
                                        if (textView != null) {
                                            i = R.id.textView28;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView28);
                                            if (textView2 != null) {
                                                i = R.id.textView29;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView29);
                                                if (textView3 != null) {
                                                    i = R.id.textView30;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView30);
                                                    if (textView4 != null) {
                                                        i = R.id.textView31;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView31);
                                                        if (textView5 != null) {
                                                            i = R.id.textView32;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView32);
                                                            if (textView6 != null) {
                                                                return new FragmentRestaurantBinding(constraintLayout, constraintLayout, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6);
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
