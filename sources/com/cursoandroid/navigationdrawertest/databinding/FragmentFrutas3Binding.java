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

public final class FragmentFrutas3Binding implements ViewBinding {
    public final Guideline guideline5;
    public final Guideline guideline6;
    public final ImageView imageCantaloupe;
    public final ImageView imagePeach;
    public final ImageView imagePineapple;
    public final ImageView imagePlum;
    public final ImageView imagePomegranate;
    public final ImageView imageRedApple;
    public final ImageView imageStrawberry;
    public final ImageView imageTangerine;
    private final ConstraintLayout rootView;
    public final TextView textView18;
    public final TextView textView19;
    public final TextView textView20;
    public final TextView textView21;
    public final TextView textView22;
    public final TextView textView23;
    public final TextView textView24;
    public final TextView textView25;

    private FragmentFrutas3Binding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.guideline5 = guideline;
        this.guideline6 = guideline2;
        this.imageCantaloupe = imageView;
        this.imagePeach = imageView2;
        this.imagePineapple = imageView3;
        this.imagePlum = imageView4;
        this.imagePomegranate = imageView5;
        this.imageRedApple = imageView6;
        this.imageStrawberry = imageView7;
        this.imageTangerine = imageView8;
        this.textView18 = textView;
        this.textView19 = textView2;
        this.textView20 = textView3;
        this.textView21 = textView4;
        this.textView22 = textView5;
        this.textView23 = textView6;
        this.textView24 = textView7;
        this.textView25 = textView8;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFrutas3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentFrutas3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFrutas3Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline5;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline5);
        if (guideline != null) {
            i = R.id.guideline6;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline6);
            if (guideline2 != null) {
                i = R.id.imageCantaloupe;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageCantaloupe);
                if (imageView != null) {
                    i = R.id.imagePeach;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePeach);
                    if (imageView2 != null) {
                        i = R.id.imagePineapple;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePineapple);
                        if (imageView3 != null) {
                            i = R.id.imagePlum;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePlum);
                            if (imageView4 != null) {
                                i = R.id.imagePomegranate;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePomegranate);
                                if (imageView5 != null) {
                                    i = R.id.imageRedApple;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageRedApple);
                                    if (imageView6 != null) {
                                        i = R.id.imageStrawberry;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageStrawberry);
                                        if (imageView7 != null) {
                                            i = R.id.imageTangerine;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageTangerine);
                                            if (imageView8 != null) {
                                                i = R.id.textView18;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView18);
                                                if (textView != null) {
                                                    i = R.id.textView19;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView19);
                                                    if (textView2 != null) {
                                                        i = R.id.textView20;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView20);
                                                        if (textView3 != null) {
                                                            i = R.id.textView21;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView21);
                                                            if (textView4 != null) {
                                                                i = R.id.textView22;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView22);
                                                                if (textView5 != null) {
                                                                    i = R.id.textView23;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView23);
                                                                    if (textView6 != null) {
                                                                        i = R.id.textView24;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView24);
                                                                        if (textView7 != null) {
                                                                            i = R.id.textView25;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView25);
                                                                            if (textView8 != null) {
                                                                                return new FragmentFrutas3Binding((ConstraintLayout) view2, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
