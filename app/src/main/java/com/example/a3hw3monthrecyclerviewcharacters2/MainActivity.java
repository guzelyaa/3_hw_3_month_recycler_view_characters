package com.example.a3hw3monthrecyclerviewcharacters2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String> character = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        character.add("Капитан Джек Воробей");
        character.add("Дэдпул");
        character.add("Санта Клаус");
        character.add("Ичиго");
        character.add("ДжоДжо");
        character.add("Рукия");
        character.add("Кэнпачи Зараки");
        character.add("Шрек");
        character.add("Хитклиф");
        character.add("Г-жа Журден");
        CharacterAdapter characterAdapter = new CharacterAdapter(character);
        recyclerView.setAdapter(characterAdapter);
    }
}