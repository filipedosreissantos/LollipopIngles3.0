package com.cursoandroid.navigationdrawertest.cd.Frutas_1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Frutas_1Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageApricot;
    private ImageView imageBanana;
    private ImageView imageBlackGrape;
    private ImageView imageBlueberry;
    private ImageView imageCherry;
    private ImageView imageCoconut;
    private ImageView imageCranberry;
    private ImageView imageGreenGrape;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_1, viewGroup, false);
        this.imageApricot = (ImageView) inflate.findViewById(R.id.imageApricot);
        this.imageBanana = (ImageView) inflate.findViewById(R.id.imageBanana);
        this.imageBlackGrape = (ImageView) inflate.findViewById(R.id.imageBlackGrape);
        this.imageBlueberry = (ImageView) inflate.findViewById(R.id.imageBlueberry);
        this.imageCherry = (ImageView) inflate.findViewById(R.id.imageCherry);
        this.imageCoconut = (ImageView) inflate.findViewById(R.id.imageCoconut);
        this.imageCranberry = (ImageView) inflate.findViewById(R.id.imageCranberry);
        this.imageGreenGrape = (ImageView) inflate.findViewById(R.id.imageGreenGrape);
        this.imageApricot.setOnClickListener(this);
        this.imageBanana.setOnClickListener(this);
        this.imageBlackGrape.setOnClickListener(this);
        this.imageBlueberry.setOnClickListener(this);
        this.imageCherry.setOnClickListener(this);
        this.imageCoconut.setOnClickListener(this);
        this.imageCranberry.setOnClickListener(this);
        this.imageGreenGrape.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.imageGreenGrape) {
            switch (id) {
                case R.id.imageApricot:
                    this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.apricot);
                    tocarSom();
                    return;
                case R.id.imageBanana:
                    this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.banana);
                    tocarSom();
                    return;
                case R.id.imageBlackGrape:
                    this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.blackgrape);
                    tocarSom();
                    return;
                case R.id.imageBlueberry:
                    this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.blueberry);
                    tocarSom();
                    return;
                default:
                    switch (id) {
                        case R.id.imageCherry:
                            this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cherry);
                            tocarSom();
                            return;
                        case R.id.imageCoconut:
                            this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.coconut);
                            tocarSom();
                            return;
                        case R.id.imageCranberry:
                            this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cranberry);
                            tocarSom();
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.greengrape);
            tocarSom();
        }
    }

    public void tocarSom() {
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            this.mediaPlayer = null;
        }
    }
}
