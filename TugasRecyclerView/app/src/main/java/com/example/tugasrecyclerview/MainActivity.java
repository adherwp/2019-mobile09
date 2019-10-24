package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasrecyclerview.adapters.DataTextGambarAdapter;
import com.example.tugasrecyclerview.models.DataTextGambar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvDataTextGambar;
    //instansiasi list datatextgambar
    List<DataTextGambar> listDataTextGambar = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvDataTextGambar ke layout
        rvDataTextGambar = findViewById(R.id.rvDataTextGambar);
        //Membuat object hero
        DataTextGambar mobil = new DataTextGambar(R.drawable.ferrari,"Ferrari");
        //menambahkan hero ke listSuperHero
        listDataTextGambar.add(mobil);
        //membuat object hero baru
        mobil = new DataTextGambar(R.drawable.lamborghini, "Lamborgini");
        //menambahkan hero baru ke listSuperhero
        listDataTextGambar.add(mobil);
        mobil = new DataTextGambar(R.drawable.lexus, "Lexus");
        //menambahkan hero baru ke listSuperhero
        listDataTextGambar.add(mobil);
        //Instansiasi Adapter
        DataTextGambarAdapter mobilAdapter = new DataTextGambarAdapter(listDataTextGambar);
        //set adapter dan layoutmanager
        rvDataTextGambar.setAdapter(mobilAdapter);
        rvDataTextGambar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}
