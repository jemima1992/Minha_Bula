package com.torontodjango.MinhaBula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class RelatorioActivity extends AppCompatActivity {
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        textview = (TextView) findViewById(R.id.text1);

        textview.setMovementMethod(new ScrollingMovementMethod());

        String data = "";

        StringBuffer abuffer = new StringBuffer();

        /*InputStream is = this.getResources().openRawResource(R.raw.glossonariomedico);


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        if(is != null){
            try{
                    while ((data=reader.readLine())!= null){
                        abuffer.append(data+"\n"+"\t");
                    }
                    textview.setText(abuffer);
                    is.close();
               }catch (Exception e){
                e.printStackTrace();
            }
        }*/

        try {
            FileInputStream fileInputStream = openFileInput("reminder.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer = new StringBuffer();
            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                stringBuffer.append(lines + "\n");
            }
            textview.setText(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}



