package com.example.a3hw3monthrecyclerviewcharacters2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCharacter;
    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCharacter = itemView.findViewById(R.id.character);
    }

    public void bind(String character){
        tvCharacter.setText(character);
    }
}
