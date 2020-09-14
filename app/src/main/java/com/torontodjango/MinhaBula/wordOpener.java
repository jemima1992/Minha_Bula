package com.torontodjango.MinhaBula;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class wordOpener extends AppCompatActivity {
    PDFView myWordViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_opener);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        myWordViewer = findViewById(R.id.WordViewer);
        String getitem = getIntent().getStringExtra("wordFileName");

        if(getitem.equals("ABSCESSO")){
            myWordViewer.fromAsset("Abscesso-dic.pdf").load();
        }
        if(getitem.equals("ABULIA")){
            myWordViewer.fromAsset("Abulia-dic.pdf").load();
        }
        if(getitem.equals("ACALASIA")){
            myWordViewer.fromAsset("Acalasia-dic.pdf").load();
        }
        if(getitem.equals("ACROCIANOSE")){
            myWordViewer.fromAsset("Acrocianose-dic.pdf").load();
        }
        if(getitem.equals("ACROMEGALIA")){
            myWordViewer.fromAsset("Acrocianose-dic.pdf").load();
        }
        if(getitem.equals("ADENITE")){
            myWordViewer.fromAsset("Adenite-dic.pdf").load();
        }
        if(getitem.equals("ADENOMEGALIA")){
            myWordViewer.fromAsset("Adenomegalia-dic.pdf").load();
        }
        if(getitem.equals("AEROFAGIA")){
            myWordViewer.fromAsset("Aerofagia-dic.pdf").load();
        }
        if(getitem.equals("AFASIA")){
            myWordViewer.fromAsset("Afasia-dic.pdf").load();
        }
        if(getitem.equals("AFERESE")){
            myWordViewer.fromAsset("Aferese-dic.pdf").load();
        }
        if(getitem.equals("AGALACTIA")){
            myWordViewer.fromAsset("Agalactia-dic.pdf").load();
        }
        if(getitem.equals("AGEUSIA")){
            myWordViewer.fromAsset("Ageusia-dic.pdf").load();
        }
        if(getitem.equals("AGLOSSIA")){
            myWordViewer.fromAsset("Aglossia-dic.pdf").load();
        }
        if(getitem.equals("AGNOSIA")){
            myWordViewer.fromAsset("Agnosia-dic.pdf").load();
        }
        if(getitem.equals("AGORAFOBIA")){
            myWordViewer.fromAsset("Agorafobia-dic.pdf").load();
        }
        if(getitem.equals("AGRAFIA")){
            myWordViewer.fromAsset("Agrafia-dic.pdf").load();
        }
        if(getitem.equals("ALOPÉCIA")){
            myWordViewer.fromAsset("Alopécia-dic.pdf").load();
        }
        if(getitem.equals("AMAUROSE")){
            myWordViewer.fromAsset("Amaurose-dic.pdf").load();
        }
        if(getitem.equals("AMENORRÉIA")){
            myWordViewer.fromAsset("Amenorréia-dic.pdf").load();
        }
        if(getitem.equals("ANAFRODISIA")){
            myWordViewer.fromAsset("Anafrodisia-dic.pdf").load();
        }
        if(getitem.equals("ANASARCA")){
            myWordViewer.fromAsset("Anasarca-dic.pdf").load();
        }
        if(getitem.equals("ANISOCORIA")){
            myWordViewer.fromAsset("Anisocoria-dic.pdf").load();
        }
        if(getitem.equals("ANOREXIA")){
            myWordViewer.fromAsset("Anorexia-dic.pdf").load();
        }
        if(getitem.equals("ANOSMIA")){
            myWordViewer.fromAsset("Anosmia-dic.pdf").load();
        }
        if(getitem.equals("ANQUILOSE")){
            myWordViewer.fromAsset("Anquilose-dic.pdf").load();
        }
        if(getitem.equals("ANÚRIA")){
            myWordViewer.fromAsset("Anúria-dic.pdf").load();
        }
        if(getitem.equals("APNÉIA DE SONO")){
            myWordViewer.fromAsset("Apnéia de sono-dic.pdf").load();
        }
        if(getitem.equals("APRAXIA")){
            myWordViewer.fromAsset("Apraxia-dic.pdf").load();
        }
        if(getitem.equals("ARTRALGIA")){
            myWordViewer.fromAsset("Aatralgia-dic.pdf").load();
        }
        if(getitem.equals("ARTRITE")){
            myWordViewer.fromAsset("Atrite-dic.pdf").load();
        }
        if(getitem.equals("ARTROSE")){
            myWordViewer.fromAsset("Atrose-dic.pdf").load();
        }
        if(getitem.equals("ASCITE")){
            myWordViewer.fromAsset("Ascite-dic.pdf").load();
        }
        if(getitem.equals("ASTENIA")){
            myWordViewer.fromAsset("Astenta-dic.pdf").load();
        }
        if(getitem.equals("ATAXIA")){
            myWordViewer.fromAsset("Ataxia-dic.pdf").load();
        }
        if(getitem.equals("ATETOSE")){
            myWordViewer.fromAsset("Atetose-dic.pdf").load();
        }
        if(getitem.equals("BAQUETEAMENTO")){
            myWordViewer.fromAsset("Baqueteamento-dic.pdf").load();
        }
        if(getitem.equals("BOLHA")){
            myWordViewer.fromAsset("Bolha-dic.pdf").load();
        }
        if(getitem.equals("BRADICARDIA")){
            myWordViewer.fromAsset("Bradicardia-dic.pdf").load();
        }
        if(getitem.equals("BRADIPNEIA")){
            myWordViewer.fromAsset("Bradipneia-dic.pdf").load();
        }
        if(getitem.equals("BULIMIA")){
            myWordViewer.fromAsset("Bulimia-dic.pdf").load();
        }
        if(getitem.equals("BÓCIO")){
            myWordViewer.fromAsset("Bócio-dic.pdf").load();
        }
        if(getitem.equals("CACIFO")){
            myWordViewer.fromAsset("Cacifo-dic.pdf").load();
        }
        if(getitem.equals("CALVÍCIE")){
            myWordViewer.fromAsset("Calvíce-dic.pdf").load();
        }
        if(getitem.equals("CALÁZIO")){
            myWordViewer.fromAsset("Calázio-dic.pdf").load();
        }
        if(getitem.equals("CANÍCIE")){
            myWordViewer.fromAsset("Canície-dic.pdf").load();
        }
        if(getitem.equals("CAQUEXIA")){
            myWordViewer.fromAsset("Caquexia-dic.pdf").load();
        }
        if(getitem.equals("CATATONIA")){
            myWordViewer.fromAsset("Catatonia-dic.pdf").load();
        }
        if(getitem.equals("CEFALÉIA")){
            myWordViewer.fromAsset("Cefaléia-dic.pdf").load();
        }
        if(getitem.equals("CERATITE")){
            myWordViewer.fromAsset("Ceratite-dic.pdf").load();
        }
        if(getitem.equals("CERATOCONE")){
            myWordViewer.fromAsset("Ceratocone-dic.pdf").load();
        }
        if(getitem.equals("CERVICALGIA")){
            myWordViewer.fromAsset("Cervicalgia-dic.pdf").load();
        }
        if(getitem.equals("CERVICITE")){
            myWordViewer.fromAsset("Cervicite-dic.pdf").load();
        }
        if(getitem.equals("CIANOSE")){
            myWordViewer.fromAsset("Cianose-dic.pdf").load();
        }
        if(getitem.equals("CLAUDICAÇÃO")){
            myWordViewer.fromAsset("Claudicação-dic.pdf").load();
        }
        if(getitem.equals("COLESTASE")){
            myWordViewer.fromAsset("Colestase-dic.pdf").load();
        }
        if(getitem.equals("COLITE")){
            myWordViewer.fromAsset("Colite-dic.pdf").load();
        }
        if(getitem.equals("CONSTIPAÇÃO")){
            myWordViewer.fromAsset("Constipação-dic.pdf").load();
        }
        if(getitem.equals("")){
            myWordViewer.fromAsset("Acrocianose-dic.pdf").load();
        }
        if(getitem.equals("")){
            myWordViewer.fromAsset("Acrocianose-dic.pdf").load();
        }

    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}