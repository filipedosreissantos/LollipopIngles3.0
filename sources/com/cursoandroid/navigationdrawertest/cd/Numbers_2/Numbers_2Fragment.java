package com.cursoandroid.navigationdrawertest.cd.Numbers_2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Numbers_2Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageEight;
    private ImageView imageNine;
    private ImageView imageSeven;
    private ImageView imageSix;
    private ImageView imageTen_1;
    private ImageView imageTen_2;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_numbers_2, viewGroup, false);
        this.imageSix = (ImageView) inflate.findViewById(R.id.imageSix);
        this.imageSeven = (ImageView) inflate.findViewById(R.id.imageSeven);
        this.imageEight = (ImageView) inflate.findViewById(R.id.imageEight);
        this.imageNine = (ImageView) inflate.findViewById(R.id.imageNine);
        this.imageTen_1 = (ImageView) inflate.findViewById(R.id.imageTen_1);
        this.imageTen_2 = (ImageView) inflate.findViewById(R.id.imageTen_2);
        this.imageSix.setOnClickListener(this);
        this.imageSeven.setOnClickListener(this);
        this.imageEight.setOnClickListener(this);
        this.imageNine.setOnClickListener(this);
        this.imageTen_1.setOnClickListener(this);
        this.imageTen_2.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageEight:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.eight);
                tocarSom();
                return;
            case R.id.imageNine:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.nine);
                tocarSom();
                return;
            case R.id.imageSeven:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.seven);
                tocarSom();
                return;
            case R.id.imageSix:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                tocarSom();
                return;
            case R.id.imageTen_1:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ten);
                tocarSom();
                return;
            case R.id.imageTen_2:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ten);
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
