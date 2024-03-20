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

public final class FragmentClassroom1Binding implements ViewBinding {
    public final ImageView computer;
    public final ImageView eraser;
    public final Guideline guideline21;
    public final Guideline guideline22;
    public final ImageView map;
    public final ImageView pen;
    public final ImageView pencil;
    private final ConstraintLayout rootView;
    public final ImageView sharpener;
    public final TextView textView67;
    public final TextView textView68;
    public final TextView textView69;
    public final TextView textView70;
    public final TextView textView71;
    public final TextView textView72;

    private FragmentClassroom1Binding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Guideline guideline, Guideline guideline2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.computer = imageView;
        this.eraser = imageView2;
        this.guideline21 = guideline;
        this.guideline22 = guideline2;
        this.map = imageView3;
        this.pen = imageView4;
        this.pencil = imageView5;
        this.sharpener = imageView6;
        this.textView67 = textView;
        this.textView68 = textView2;
        this.textView69 = textView3;
        this.textView70 = textView4;
        this.textView71 = textView5;
        this.textView72 = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentClassroom1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentClassroom1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_classroom_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentClassroom1Binding bind(View view) {
        View view2 = view;
        int i = R.id.computer;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.computer);
        if (imageView != null) {
            i = R.id.eraser;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.eraser);
            if (imageView2 != null) {
                i = R.id.guideline21;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline21);
                if (guideline != null) {
                    i = R.id.guideline22;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline22);
                    if (guideline2 != null) {
                        i = R.id.map;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.map);
                        if (imageView3 != null) {
                            i = R.id.pen;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.pen);
                            if (imageView4 != null) {
                                i = R.id.pencil;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.pencil);
                                if (imageView5 != null) {
                                    i = R.id.sharpener;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.sharpener);
                                    if (imageView6 != null) {
                                        i = R.id.textView67;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView67);
                                        if (textView != null) {
                                            i = R.id.textView68;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView68);
                                            if (textView2 != null) {
                                                i = R.id.textView69;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView69);
                                                if (textView3 != null) {
                                                    i = R.id.textView70;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView70);
                                                    if (textView4 != null) {
                                                        i = R.id.textView71;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView71);
                                                        if (textView5 != null) {
                                                            i = R.id.textView72;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView72);
                                                            if (textView6 != null) {
                                                                return new FragmentClassroom1Binding((ConstraintLayout) view2, imageView, imageView2, guideline, guideline2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6);
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
