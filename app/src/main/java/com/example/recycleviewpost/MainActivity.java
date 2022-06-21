package com.example.recycleviewpost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private MyAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        

        userList = new ArrayList<>();
        adapter = new MyAdapter(this, userList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareUserData();
    }

    private void prepareUserData() {
        User user = new User("John Doe", "john@gmail.com");
        userList.add(user);

        user = new User("Will Smith", "will@gmail.com");
        userList.add(user);

        user = new User("Brad Pitt", "brad@gmail.com");
        userList.add(user);

        user = new User("Tom Cruise", "tom@gmail.com");
        userList.add(user);

        user = new User("George Clooney", "george@gmail.com");
        userList.add(user);

        user = new User("Leonardo DiCaprio", "leonardo@gmail.com");
        userList.add(user);

        adapter.notifyDataSetChanged();
    }
}