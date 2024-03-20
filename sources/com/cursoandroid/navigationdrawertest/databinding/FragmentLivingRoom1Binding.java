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

public final class FragmentLivingRoom1Binding implements ViewBinding {
    public final Guideline guideline13;
    public final Guideline guideline14;
    public final ImageView imageDoor;
    public final ImageView imageLightSwitch;
    public final ImageView imageRoom;
    public final ImageView imageRug;
    public final ImageView imageSpeaker;
    public final ImageView imageTelevision;
    private final ConstraintLayout rootView;
    public final TextView textView26;
    public final TextView textView33;
    public final TextView textView34;
    public final TextView textView46;
    public final TextView textView48;
    public final TextView textView49;

    private FragmentLivingRoom1Binding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.guideline13 = guideline;
        this.guideline14 = guideline2;
        this.imageDoor = imageView;
        this.imageLightSwitch = imageView2;
        this.imageRoom = imageView3;
        this.imageRug = imageView4;
        this.imageSpeaker = imageView5;
        this.imageTelevision = imageView6;
        this.textView26 = textView;
        this.textView33 = textView2;
        this.textView34 = textView3;
        this.textView46 = textView4;
        this.textView48 = textView5;
        this.textView49 = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLivingRoom1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentLivingRoom1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_living_room_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLivingRoom1Binding bind(View view) {
        View view2 = view;
        int i = R.id.guideline13;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline13);
        if (guideline != null) {
            i = R.id.guideline14;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view2, R.id.guideline14);
            if (guideline2 != null) {
                i = R.id.imageDoor;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageDoor);
                if (imageView != null) {
                    i = R.id.imageLightSwitch;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageLightSwitch);
                    if (imageView2 != null) {
                        i = R.id.imageRoom;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageRoom);
                        if (imageView3 != null) {
                            i = R.id.imageRug;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageRug);
                            if (imageView4 != null) {
                                i = R.id.imageSpeaker;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageSpeaker);
                                if (imageView5 != null) {
                                    i = R.id.imageTelevision;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view2, R.id.imageTelevision);
                                    if (imageView6 != null) {
                                        i = R.id.textView26;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.textView26);
                                        if (textView != null) {
                                            i = R.id.textView33;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView33);
                                            if (textView2 != null) {
                                                i = R.id.textView34;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView34);
                                                if (textView3 != null) {
                                                    i = R.id.textView46;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView46);
                                                    if (textView4 != null) {
                                                        i = R.id.textView48;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView48);
                                                        if (textView5 != null) {
                                                            i = R.id.textView49;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.textView49);
                                                            if (textView6 != null) {
                                                                return new FragmentLivingRoom1Binding((ConstraintLayout) view2, guideline, guideline2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6);
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
