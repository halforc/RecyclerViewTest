package com.example.yang.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Song> songList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initeSong();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(songList);
        recyclerView.setAdapter(adapter);
    }

    private void initeSong() {
        for (int i = 0;i<2;i++){
            Song item1 = new Song(R.drawable.fantasy,"item1");
            songList.add(item1);
            Song item2 = new Song(R.drawable.img1,"item2");
            songList.add(item2);
            Song item3 = new Song(R.drawable.img2,"item3");
            songList.add(item3);
            Song item4 = new Song(R.drawable.img6,"item4");
            songList.add(item4);
            Song item5 = new Song(R.drawable.img7,"item5");
            songList.add(item5);
            Song item6 = new Song(R.drawable.img12,"item6");
            songList.add(item6);
            Song item7 = new Song(R.drawable.img_8,"item7");
            songList.add(item7);
            Song item8 = new Song(R.drawable.jay,"item8");
            songList.add(item8);
        }
    }
}
