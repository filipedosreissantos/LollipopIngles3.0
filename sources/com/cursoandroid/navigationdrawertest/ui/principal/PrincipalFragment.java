package com.cursoandroid.navigationdrawertest.ui.principal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;

public class PrincipalFragment extends Fragment {
    private Button buttonEnter;
    private ImageView logo;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_principal, viewGroup, false);
        this.buttonEnter = (Button) inflate.findViewById(R.id.buttonEnter);
        this.logo = (ImageView) inflate.findViewById(R.id.imageView2);
        this.logo.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.w));
        return inflate;
    }
}
