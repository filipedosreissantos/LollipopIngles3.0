package com.cursoandroid.navigationdrawertest.ui.sobre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.cursoandroid.navigationdrawertest.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Element element = new Element();
        element.setTitle("Versão 3.0");
        return new AboutPage(getActivity()).setImage(R.drawable.java).setDescription("A FR Treinamentos tem como missão apoiar o desevolvimento da educação local e fomentar o sucesso através da excelência na busca pela qualidade.").addGroup("Entre em contato").addEmail("filipedosreissantos@hotmail.com").addWebsite("https://filipefdrs.github.io/", "Acesse nosso site").addGroup("Redes sociais").addFacebook("100073100606853", "Facebook").addInstagram("filipefdrs", "Instagram").addGitHub("filipefdrs", "GitHub").addItem(element).create();
    }
}
