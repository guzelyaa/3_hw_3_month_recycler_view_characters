package com.example.a3hw3monthrecyclerviewcharacters2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {
    private ArrayList<String> character;

    public CharacterAdapter(ArrayList<String> names) {
        this.character = names;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharacterViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_character, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.bind(character.get(position));
    }

    @Override
    public int getItemCount() {
        return character.size();
    }
}
