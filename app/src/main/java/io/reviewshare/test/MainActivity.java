package io.reviewshare.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> items = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(items);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        for(int i=0;i <100; i++) {
            Item item = new Item();
            items.add(item);
        }

        adapter.notifyDataSetChanged();
    }
}
