package com.example.recyclerviewtutorial_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtutorial_1.Adapters.MyAdapter;
import com.example.recyclerviewtutorial_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int[] images = {
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag,
            R.drawable.ic_bangladeshflag
    };

    String [] title, description;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        title = getResources().getStringArray(R.array.country_name);
        description = getResources().getStringArray(R.array.country_description);

        myAdapter = new MyAdapter(MainActivity.this, title, description, images);

        binding.recyclerViewId.setAdapter(myAdapter);
        binding.recyclerViewId.setLayoutManager(new LinearLayoutManager(this));

    }
}