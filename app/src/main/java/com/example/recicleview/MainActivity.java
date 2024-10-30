package com.example.recicleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<State> states = new ArrayList<>();
    private RecyclerView recyclerView; // RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setInitialData();

        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Бубубу>", "Бубубу - че сказать", R.drawable.kit));
        states.add(new State("Бебебе", "Бебебе - че сказать", R.drawable.tortaletka));
        states.add(new State("ГООООЛ", "ГОООООЛ, смартфон Vivo", R.drawable.kit));

    }

}