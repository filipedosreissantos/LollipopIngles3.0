package com.cursoandroid.navigationdrawertest.cd;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class LivingRoom_1Fragment extends Fragment implements View.OnClickListener {
    private ImageView imageDoor;
    private ImageView imageLightSwitch;
    private ImageView imageLivingRoom;
    private ImageView imageRug;
    private ImageView imageSpeaker;
    private ImageView imageTelevision;
    private MediaPlayer mediaPlayer;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_living_room_1, viewGroup, false);
        this.imageDoor = (ImageView) inflate.findViewById(R.id.imageDoor);
        this.imageLivingRoom = (ImageView) inflate.findViewById(R.id.imageRoom);
        this.imageRug = (ImageView) inflate.findViewById(R.id.imageRug);
        this.imageTelevision = (ImageView) inflate.findViewById(R.id.imageTelevision);
        this.imageSpeaker = (ImageView) inflate.findViewById(R.id.imageSpeaker);
        this.imageLightSwitch = (ImageView) inflate.findViewById(R.id.imageLightSwitch);
        this.imageDoor.setOnClickListener(this);
        this.imageLivingRoom.setOnClickListener(this);
        this.imageRug.setOnClickListener(this);
        this.imageTelevision.setOnClickListener(this);
        this.imageSpeaker.setOnClickListener(this);
        this.imageLightSwitch.setOnClickListener(this);
        return inflate;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageDoor:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.door);
                tocarSom();
                return;
            case R.id.imageLightSwitch:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.light_switch);
                tocarSom();
                return;
            case R.id.imageRoom:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.living_room);
                tocarSom();
                return;
            case R.id.imageRug:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.rug);
                tocarSom();
                return;
            case R.id.imageSpeaker:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.speaker);
                tocarSom();
                return;
            case R.id.imageTelevision:
                this.mediaPlayer = MediaPlayer.create(getActivity(), R.raw.television);
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
