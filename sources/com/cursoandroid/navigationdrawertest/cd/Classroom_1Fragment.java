package com.cursoandroid.navigationdrawertest.cd;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Classroom_1Fragment extends Fragment implements View.OnClickListener {
    private ImageView computer;
    private ImageView eraser;
    private ImageView map;
    private MediaPlayer mediaPlayer;
    private ImageView pen;
    private ImageView pencil;
    private ImageView sharpener;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_classroom_1, viewGroup, false);
        this.sharpener = (ImageView) inflate.findViewById(R.id.sharpener);
        this.pencil = (ImageView) inflate.findViewById(R.id.pencil);
        this.computer = (ImageView) inflate.findViewById(R.id.computer);
        this.eraser = (ImageView) inflate.findViewById(R.id.eraser);
        this.pen = (ImageView) inflate.findViewById(R.id.pen);
        this.map = (ImageView) inflate.findViewById(R.id.map);
        this.sharpener.setOnClickListener(this);
        this.pencil.setOnClickListener(this);
        this.computer.setOnClickListener(this);
        this.eraser.setOnClickListener(this);
        this.pen.setOnClickListener(this);
        this.map.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.computer:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.computer);
                tocarSom();
                return;
            case R.id.eraser:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.eraser);
                tocarSom();
                return;
            case R.id.map:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.map);
                tocarSom();
                return;
            case R.id.pen:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pen);
                tocarSom();
                return;
            case R.id.pencil:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pencil);
                tocarSom();
                return;
            case R.id.sharpener:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sharpener);
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
