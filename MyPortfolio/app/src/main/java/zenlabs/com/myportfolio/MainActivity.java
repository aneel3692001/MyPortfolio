package zenlabs.com.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button movies = (Button) findViewById(R.id.movies);
        Button stock = (Button) findViewById(R.id.stock);
        Button bigger = (Button) findViewById(R.id.bigger);
        Button material = (Button) findViewById(R.id.material);
        Button go = (Button) findViewById(R.id.go);
        Button capstone = (Button) findViewById( R.id.capstone);

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my popular movies app", Toast.LENGTH_SHORT).show();
            }
        });

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my stock app", Toast.LENGTH_SHORT).show();
            }
        });

        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my build it bigger app", Toast.LENGTH_SHORT).show();
            }
        });

        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my material design app", Toast.LENGTH_SHORT).show();
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my Go Ubiquitous app", Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button launches my Capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }