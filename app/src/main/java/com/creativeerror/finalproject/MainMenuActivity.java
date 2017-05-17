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
            addToList(R.drawable.note, "CSS stands for Cascading Style Sheets\n" +
                            "it's describes how HTML elements are to be displayed on screen, paper, or in other media\n" +
                            "It can control the layout of multiple web pages all at once\n","Cascading Style Sheets");
            addToList(R.drawable.html, "HTML", "You Choose HTML");
            addToList(R.drawable.note, "HTML stands for Hypertext Markup Language, a standardized system for tagging text files to achieve font, color, graphic, and hyperlink effects on World Wide Web pages","Hypertext Markup Language");
            addToList(R.drawable.java, "JAVA", "You Choose JAVA");
            addToList(R.drawable.note, "JAVA is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible","JAVA");
            addToList(R.drawable.php, "PHP", "You Choose PHP");
            addToList(R.drawable.note,"PHP is an acronym for PHP: Hypertext Preprocessor\n" +
                    "it's widely-used, open source scripting language\n" +
                    "PHP scripts are executed on the server","PHP: Hypertext Preprocessor");
            addToList(R.drawable.sql, "SQL", "You Choose SQL");
            addToList(R.drawable.note, "SQL stands for Structured Query Language. SQL is used to communicate with a database. SQL statements are used to perform tasks such as update data on a database, or retrieve data from a database.","Structured Query Language");

        }

        private void addToList(int gambar, String namaInd, String namaEng){
            bahasa = new Model(gambar, namaInd, namaEng);
            ModelList.add(bahasa);

        }

    }






