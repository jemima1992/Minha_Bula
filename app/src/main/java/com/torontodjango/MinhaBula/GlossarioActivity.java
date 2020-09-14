package com.torontodjango.MinhaBula;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class GlossarioActivity extends AppCompatActivity {

    EditText textBox;
    TextView text;
    ListView wordListView;
    ArrayAdapter adapter;

    String[] wordFiles ={"A","ABSCESSO","ABULIA","ACALASIA","ACROCIANOSE","ACROMEGALIA","ADENITE","ADENOMEGALIA","AEROFAGIA","AFASIA","AFERESE",
            "AGALACTIA","AGEUSIA","AGLOSSIA","AGNOSIA","AGORAFOBIA","AGRAFIA","ALOPÉCIA","AMAUROSE","AMENORRÉIA","ANAFRODISIA","ANASARCA",
            "ANISOCORIA","ANOREXIA","ANOSMIA","ANQUILOSE","ANÚRIA","APNÉIA DE SONO","APRAXIA","ARTRALGIA","ARTRITE","ARTROSE","ASCITE","ASTENIA",
            "ATAXIA","ATETOSE","","B","BAQUETEAMENTO","BOLHA","BRADICARDIA","BRADIPNEIA","BULIMIA","BÓCIO","","C","CACIFO","CALVÍCIE","CALÁZIO",
            "CANÍCIE","CAQUEXIA","CATATONIA","CEFALÉIA","CERATITE","CERATOCONE","CERVICALGIA","CERVICITE","CIANOSE","CLAUDICAÇÃO","COLESTASE",
            "COLITE","CONSTIPAÇÃO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossario);

        wordListView=(ListView)findViewById(R.id.myWordList);
        textBox=(EditText)findViewById(R.id.textBox);
        text=(TextView)findViewById(R.id.text);

        wordListView.setAdapter(adapter);

        final ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wordFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view =super.getView(position,convertView,parent);
                TextView mytext = (TextView)view.findViewById(android.R.id.text1);
                return view;
            }
        };

        wordListView.setAdapter(adapter);
        wordListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = wordListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),wordOpener.class);
                start.putExtra("wordFileName",item);
                startActivity(start);

            }
        });

        textBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                adapter.getFilter().filter(s);

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}