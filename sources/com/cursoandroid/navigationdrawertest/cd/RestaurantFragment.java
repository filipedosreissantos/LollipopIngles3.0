package com.cursoandroid.navigationdrawertest.cd;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class RestaurantFragment extends Fragment implements View.OnClickListener {
    private ImageView imageChair;
    private ImageView imageFork;
    private ImageView imageKnife;
    private ImageView imageSpoon;
    private ImageView imageWaiter;
    private ImageView imageWaitress;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_restaurant, viewGroup, false);
        this.imageChair = (ImageView) inflate.findViewById(R.id.imageChair);
        this.imageFork = (ImageView) inflate.findViewById(R.id.imageFork);
        this.imageKnife = (ImageView) inflate.findViewById(R.id.imageKnife);
        this.imageSpoon = (ImageView) inflate.findViewById(R.id.imageSpoon);
        this.imageWaiter = (ImageView) inflate.findViewById(R.id.imageWaiter);
        this.imageWaitress = (ImageView) inflate.findViewById(R.id.imageWaitress);
        this.imageChair.setOnClickListener(this);
        this.imageFork.setOnClickListener(this);
        this.imageKnife.setOnClickListener(this);
        this.imageSpoon.setOnClickListener(this);
        this.imageWaiter.setOnClickListener(this);
        this.imageWaitress.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageChair:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.chair);
                tocarSom();
                return;
            case R.id.imageFork:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.fork);
                tocarSom();
                return;
            case R.id.imageKnife:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.knife);
                tocarSom();
                return;
            case R.id.imageSpoon:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.spoon);
                tocarSom();
                return;
            case R.id.imageWaiter:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.waiter);
                tocarSom();
                return;
            case R.id.imageWaitress:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.waitress);
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
