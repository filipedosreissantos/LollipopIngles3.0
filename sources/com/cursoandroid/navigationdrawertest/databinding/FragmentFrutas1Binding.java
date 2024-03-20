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

public final class FragmentFrutas1Binding implements ViewBinding {
    public final Guideline guideline;
    public final Guideline guideline2;
    public final ImageView imageApricot;
    public final ImageView imageBanana;
    public final ImageView imageBlackGrape;
    public final ImageView imageBlueberry;
    public final ImageView imageCherry;
    public final ImageView imageCoconut;
    public final ImageView imageCranberry;
    public final ImageView imageGreenGrape;
    private final ConstraintLayout rootView;
    public final TextView textView2;
    public final TextView textView3;
    public final TextView textView4;
    public final TextView textView5;
    public final TextView textView6;
    public final TextView textView7;
    public final TextView textView8;
    public final TextView textView9;

    private FragmentFrutas1Binding(ConstraintLayout constraintLayout, Guideline guideline3, Guideline guideline4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.rootView = constraintLayout;
        this.guideline = guideline3;
        this.guideline2 = guideline4;
        this.imageApricot = imageView;
        this.imageBanana = imageView2;
        this.imageBlackGrape = imageView3;
        this.imageBlueberry = imageView4;
        this.imageCherry = imageView5;
        this.imageCoconut = imageView6;
        this.imageCranberry = imageView7;
        this.imageGreenGrape = imageView8;
        this.textView2 = textView;
        this.textView3 = textView10;
        this.textView4 = textView11;
        this.textView5 = textView12;
        this.textView6 = textView13;
        this.textView7 = textView14;
        this.textView8 = textView15;
        this.textView9 = textView16;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFrutas1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentFrutas1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFrutas1Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline;
        Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline);
        if (guideline3 != null) {
            i = R.id.guideline2;
            Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline2);
            if (guideline4 != null) {
                i = R.id.imageApricot;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageApricot);
                if (imageView != null) {
                    i = R.id.imageBanana;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageBanana);
                    if (imageView2 != null) {
                        i = R.id.imageBlackGrape;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageBlackGrape);
                        if (imageView3 != null) {
                            i = R.id.imageBlueberry;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageBlueberry);
                            if (imageView4 != null) {
                                i = R.id.imageCherry;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageCherry);
                                if (imageView5 != null) {
                                    i = R.id.imageCoconut;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageCoconut);
                                    if (imageView6 != null) {
                                        i = R.id.imageCranberry;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageCranberry);
                                        if (imageView7 != null) {
                                            i = R.id.imageGreenGrape;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageGreenGrape);
                                            if (imageView8 != null) {
                                                i = R.id.textView2;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView2);
                                                if (textView != null) {
                                                    i = R.id.textView3;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView3);
                                                    if (textView10 != null) {
                                                        i = R.id.textView4;
                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView4);
                                                        if (textView11 != null) {
                                                            i = R.id.textView5;
                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView5);
                                                            if (textView12 != null) {
                                                                i = R.id.textView6;
                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView6);
                                                                if (textView13 != null) {
                                                                    i = R.id.textView7;
                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView7);
                                                                    if (textView14 != null) {
                                                                        i = R.id.textView8;
                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView8);
                                                                        if (textView15 != null) {
                                                                            i = R.id.textView9;
                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView9);
                                                                            if (textView16 != null) {
                                                                                return new FragmentFrutas1Binding((ConstraintLayout) view2, guideline3, guideline4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, textView, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
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
