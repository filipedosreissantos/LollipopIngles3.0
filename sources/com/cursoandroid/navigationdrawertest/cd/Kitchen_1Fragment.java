package com.cursoandroid.navigationdrawertest.cd;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class Kitchen_1Fragment extends Fragment implements View.OnClickListener {
    private ImageView fryingPan;
    private MediaPlayer mediaPlayer;
    private ImageView plate;
    private ImageView refrigerator;
    private ImageView stove;
    private ImageView table;
    private ImageView toaster;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_kitchen_1, viewGroup, false);
        this.table = (ImageView) inflate.findViewById(R.id.table);
        this.refrigerator = (ImageView) inflate.findViewById(R.id.refrigerator);
        this.stove = (ImageView) inflate.findViewById(R.id.stove);
        this.plate = (ImageView) inflate.findViewById(R.id.plate);
        this.toaster = (ImageView) inflate.findViewById(R.id.toaster);
        this.fryingPan = (ImageView) inflate.findViewById(R.id.fryingPan);
        this.table.setOnClickListener(this);
        this.refrigerator.setOnClickListener(this);
        this.stove.setOnClickListener(this);
        this.plate.setOnClickListener(this);
        this.toaster.setOnClickListener(this);
        this.fryingPan.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fryingPan:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.frying_pan);
                tocarSom();
                return;
            case R.id.plate:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.plate);
                tocarSom();
                return;
            case R.id.refrigerator:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.refrigerator);
                tocarSom();
                return;
            case R.id.stove:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.stove);
                tocarSom();
                return;
            case R.id.table:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.table);
                tocarSom();
                return;
            case R.id.toaster:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.toaster);
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
