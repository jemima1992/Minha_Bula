package com.torontodjango.MinhaBula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirTelaBusca(View view)
    {
        startActivity(new Intent(this, BuscaActivity.class));
    }

    public void abrirTelaHorarios(View view)
    {
        startActivity(new Intent(this, DashBoardActivity.class));
    }

    public void abrirTelaGlossario(View view)
    {
        startActivity(new Intent(this, GlossarioActivity.class));
    }

    public void abrirTelaRelatorio(View view)
    {
        startActivity(new Intent(this, RelatorioActivity.class));
    }
}
