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

public final class FragmentFrutas2Binding implements ViewBinding {
    public final Guideline guideline3;
    public final Guideline guideline4;
    public final ImageView imageGuava;
    public final ImageView imageHoneydew;
    public final ImageView imageLemon;
    public final ImageView imageMango;
    public final ImageView imageNectarine;
    public final ImageView imageOrange;
    public final ImageView imagePapaya;
    public final ImageView imagePear;
    private final ConstraintLayout rootView;
    public final TextView textView10;
    public final TextView textView11;
    public final TextView textView12;
    public final TextView textView13;
    public final TextView textView14;
    public final TextView textView15;
    public final TextView textView16;
    public final TextView textView17;

    private FragmentFrutas2Binding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.guideline3 = guideline;
        this.guideline4 = guideline2;
        this.imageGuava = imageView;
        this.imageHoneydew = imageView2;
        this.imageLemon = imageView3;
        this.imageMango = imageView4;
        this.imageNectarine = imageView5;
        this.imageOrange = imageView6;
        this.imagePapaya = imageView7;
        this.imagePear = imageView8;
        this.textView10 = textView;
        this.textView11 = textView2;
        this.textView12 = textView3;
        this.textView13 = textView4;
        this.textView14 = textView5;
        this.textView15 = textView6;
        this.textView16 = textView7;
        this.textView17 = textView8;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFrutas2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentFrutas2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFrutas2Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline3;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline3);
        if (guideline != null) {
            i = R.id.guideline4;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline4);
            if (guideline2 != null) {
                i = R.id.imageGuava;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageGuava);
                if (imageView != null) {
                    i = R.id.imageHoneydew;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageHoneydew);
                    if (imageView2 != null) {
                        i = R.id.imageLemon;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageLemon);
                        if (imageView3 != null) {
                            i = R.id.imageMango;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageMango);
                            if (imageView4 != null) {
                                i = R.id.imageNectarine;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageNectarine);
                                if (imageView5 != null) {
                                    i = R.id.imageOrange;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageOrange);
                                    if (imageView6 != null) {
                                        i = R.id.imagePapaya;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePapaya);
                                        if (imageView7 != null) {
                                            i = R.id.imagePear;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imagePear);
                                            if (imageView8 != null) {
                                                i = R.id.textView10;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView10);
                                                if (textView != null) {
                                                    i = R.id.textView11;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView11);
                                                    if (textView2 != null) {
                                                        i = R.id.textView12;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView12);
                                                        if (textView3 != null) {
                                                            i = R.id.textView13;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView13);
                                                            if (textView4 != null) {
                                                                i = R.id.textView14;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView14);
                                                                if (textView5 != null) {
                                                                    i = R.id.textView15;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView15);
                                                                    if (textView6 != null) {
                                                                        i = R.id.textView16;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView16);
                                                                        if (textView7 != null) {
                                                                            i = R.id.textView17;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView17);
                                                                            if (textView8 != null) {
                                                                                return new FragmentFrutas2Binding((ConstraintLayout) view2, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
