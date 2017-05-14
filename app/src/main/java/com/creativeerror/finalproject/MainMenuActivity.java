package com.creativeerror.finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainMenuActivity extends AppCompatActivity {
        private List<Model> ModelList = new ArrayList<>();
        private RecyclerView recyclerView;
        private Adapter Adapter;
        private Model bahasa;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_menu);
            recyclerView = (RecyclerView) findViewById(R.id.rv);

            Adapter = new Adapter(getApplicationContext(), ModelList);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(Adapter);

            prepareData();
            Adapter.notifyDataSetChanged();
        }


        private void prepareData(){
            addToList(R.drawable.css, "CSS", "You Choose CSS");
            addToList(R.drawable.html, "HTML", "You Choose HTML");
            addToList(R.drawable.java, "JAVA", "You Choose JAVA");
            addToList(R.drawable.php, "PHP", "You Choose PHP");
            addToList(R.drawable.sql, "SQL", "You Choose SQL");

        }

        private void addToList(int gambar, String namaInd, String namaEng){
            bahasa = new Model(gambar, namaInd, namaEng);
            ModelList.add(bahasa);

        }

    }






