package com.cursoandroid.navigationdrawertest.cd.Frutas_3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Frutas_3Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageCantaloupe;
    private ImageView imagePeach;
    private ImageView imagePineapple;
    private ImageView imagePlum;
    private ImageView imagePomegranate;
    private ImageView imageRedApple;
    private ImageView imageStrawberry;
    private ImageView imageTangerine;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_3, viewGroup, false);
        this.imageCantaloupe = (ImageView) inflate.findViewById(R.id.imageCantaloupe);
        this.imagePeach = (ImageView) inflate.findViewById(R.id.imagePeach);
        this.imagePineapple = (ImageView) inflate.findViewById(R.id.imagePineapple);
        this.imagePlum = (ImageView) inflate.findViewById(R.id.imagePlum);
        this.imagePomegranate = (ImageView) inflate.findViewById(R.id.imagePomegranate);
        this.imageRedApple = (ImageView) inflate.findViewById(R.id.imageRedApple);
        this.imageStrawberry = (ImageView) inflate.findViewById(R.id.imageStrawberry);
        this.imageTangerine = (ImageView) inflate.findViewById(R.id.imageTangerine);
        this.imageCantaloupe.setOnClickListener(this);
        this.imagePeach.setOnClickListener(this);
        this.imagePineapple.setOnClickListener(this);
        this.imagePlum.setOnClickListener(this);
        this.imagePomegranate.setOnClickListener(this);
        this.imageRedApple.setOnClickListener(this);
        this.imageStrawberry.setOnClickListener(this);
        this.imageTangerine.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageCantaloupe:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cantaloupe);
                tocarSom();
                return;
            case R.id.imagePeach:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.peach);
                tocarSom();
                return;
            case R.id.imagePineapple:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pineapple);
                tocarSom();
                return;
            case R.id.imagePlum:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.plum);
                tocarSom();
                return;
            case R.id.imagePomegranate:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pomegranate);
                tocarSom();
                return;
            case R.id.imageRedApple:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.redapple);
                tocarSom();
                return;
            case R.id.imageStrawberry:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.strawberry);
                tocarSom();
                return;
            case R.id.imageTangerine:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.tangerine);
                tocarSom();
                return;
            default:
                return;
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
