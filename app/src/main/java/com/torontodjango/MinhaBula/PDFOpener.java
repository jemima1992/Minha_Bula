package com.torontodjango.MinhaBula;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        myPDFViewer = findViewById(R.id.pdfViewer);
        String getitem = getIntent().getStringExtra("pdfFileName");

        if(getitem.equals("Aberalgina")){
            myPDFViewer.fromAsset("Aberalgina.pdf").load();
        }
        if(getitem.equals("Ablok")){
            myPDFViewer.fromAsset("ABLOK.pdf").load();
        }
        if(getitem.equals("Bacina")){
            myPDFViewer.fromAsset("BACINA.pdf").load();
        }
        if(getitem.equals("Baclofen")){
            myPDFViewer.fromAsset("Baclofen.pdf").load();
        }
        if(getitem.equals("Ecos")){
            myPDFViewer.fromAsset("ECOS.pdf").load();
        }
        if(getitem.equals("Efedrin")){
            myPDFViewer.fromAsset("Efedrin.pdf").load();
        }

    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
