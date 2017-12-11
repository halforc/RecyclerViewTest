package com.example.yang.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Yang on 2017/12/6.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Song> mSongList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView songImage;
        TextView songLyric;
        public ViewHolder(View view){
            super(view);
            songImage = (ImageView)view.findViewById(R.id.song_image);
            songLyric = (TextView)view.findViewById(R.id.song_Lyric);
        }
    }

    public MyAdapter(List<Song> songList){
        mSongList = songList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Song song = mSongList.get(position);
        holder.songImage.setImageResource(song.getIdImage());
        holder.songLyric.setText(song.getSongDetail());
    }

    @Override
    public int getItemCount() {
        return mSongList.size();
    }
}
