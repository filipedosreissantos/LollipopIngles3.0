package com.cursoandroid.navigationdrawertest.cd.Frutas_2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Frutas_2Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageGuava;
    private ImageView imageHoneydew;
    private ImageView imageLemon;
    private ImageView imageMango;
    private ImageView imageNectarine;
    private ImageView imageOrange;
    private ImageView imagePapaya;
    private ImageView imagePear;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_frutas_2, viewGroup, false);
        this.imageGuava = (ImageView) inflate.findViewById(R.id.imageGuava);
        this.imageHoneydew = (ImageView) inflate.findViewById(R.id.imageHoneydew);
        this.imageLemon = (ImageView) inflate.findViewById(R.id.imageLemon);
        this.imageMango = (ImageView) inflate.findViewById(R.id.imageMango);
        this.imageNectarine = (ImageView) inflate.findViewById(R.id.imageNectarine);
        this.imageOrange = (ImageView) inflate.findViewById(R.id.imageOrange);
        this.imagePapaya = (ImageView) inflate.findViewById(R.id.imagePapaya);
        this.imagePear = (ImageView) inflate.findViewById(R.id.imagePear);
        this.imageGuava.setOnClickListener(this);
        this.imageHoneydew.setOnClickListener(this);
        this.imageLemon.setOnClickListener(this);
        this.imageMango.setOnClickListener(this);
        this.imageNectarine.setOnClickListener(this);
        this.imageOrange.setOnClickListener(this);
        this.imagePapaya.setOnClickListener(this);
        this.imagePear.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageGuava:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.guava);
                tocarSom();
                return;
            case R.id.imageHoneydew:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.honeydew);
                tocarSom();
                return;
            case R.id.imageLemon:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lemon);
                tocarSom();
                return;
            case R.id.imageMango:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.mango);
                tocarSom();
                return;
            case R.id.imageNectarine:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.necterine);
                tocarSom();
                return;
            case R.id.imageOrange:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.orange);
                tocarSom();
                return;
            case R.id.imagePapaya:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.papaya);
                tocarSom();
                return;
            case R.id.imagePear:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pear);
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
