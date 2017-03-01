package studio.container.com.anotherlistview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private String [] palavras = {"Pato","Janela","Computador","Geladeira","Casa","Árvore"};
    private String [] desc = {"Animal","Parte de uma casa","Conjunto de Processamento","Caixa de gelo",
            "Lugar para morar","Natureza"};
    private String [] nota = {"7","5","3","1","8","4"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.list_view1);

        List<Palavra> p = new ArrayList<Palavra>();
        for (int i=0; i<=palavras.length-1; i++){
            p.add(new Palavra(palavras[i],desc[i],nota[i]));

        }


        PalavraAdapter pAdapter = new PalavraAdapter(getApplicationContext(),R.layout.raw_layout,p);

        lv.setAdapter(pAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(getApplicationContext(),"Clicou!!!" +i ,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
