package com.cursoandroid.navigationdrawertest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.cursoandroid.navigationdrawertest.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private AppBarConfiguration mAppBarConfiguration;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView((View) inflate.getRoot());
        setSupportActionBar(this.binding.appBarMain.toolbar);
        this.binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.enviarEmail();
            }
        });
        DrawerLayout drawerLayout = this.binding.drawerLayout;
        NavigationView navigationView = this.binding.navView;
        this.mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_principal, R.id.nav_servicos, R.id.nav_clientes, R.id.nav_contato, R.id.nav_sobre, R.id.nav_frutas_1, R.id.nav_frutas_2, R.id.nav_frutas_3, R.id.nav_sala_aula_1, R.id.nav_cozinha_1, R.id.nav_restaurante, R.id.nav_sala_estar, R.id.nav_numbers_1, R.id.nav_numbers_2).setDrawerLayout(drawerLayout).build();
        NavController findNavController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) this, findNavController, this.mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, findNavController);
    }

    public void enviarEmail() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"filipedosreissantos@hotmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "Orçamento");
        intent.putExtra("android.intent.extra.TEXT", "Olá, tudo bem? Desejo um orçamento.");
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Escolha um app de email"));
    }

    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.nav_host_fragment_content_main), this.mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}
