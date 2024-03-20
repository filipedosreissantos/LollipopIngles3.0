package com.cursoandroid.navigationdrawertest.cd.Numbers_1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Numbers_1Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageFive;
    private ImageView imageFour;
    private ImageView imageOne;
    private ImageView imageThree;
    private ImageView imageTwo;
    private ImageView imageZero;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_numbers_1, viewGroup, false);
        this.imageZero = (ImageView) inflate.findViewById(R.id.imageZero);
        this.imageOne = (ImageView) inflate.findViewById(R.id.imageOne);
        this.imageTwo = (ImageView) inflate.findViewById(R.id.imageTwo);
        this.imageThree = (ImageView) inflate.findViewById(R.id.imageThree);
        this.imageFour = (ImageView) inflate.findViewById(R.id.imageFour);
        this.imageFive = (ImageView) inflate.findViewById(R.id.imageFive);
        this.imageZero.setOnClickListener(this);
        this.imageOne.setOnClickListener(this);
        this.imageTwo.setOnClickListener(this);
        this.imageThree.setOnClickListener(this);
        this.imageFour.setOnClickListener(this);
        this.imageFive.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageFive:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocarSom();
                return;
            case R.id.imageFour:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocarSom();
                return;
            case R.id.imageOne:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocarSom();
                return;
            case R.id.imageThree:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocarSom();
                return;
            case R.id.imageTwo:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocarSom();
                return;
            case R.id.imageZero:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.zero);
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
