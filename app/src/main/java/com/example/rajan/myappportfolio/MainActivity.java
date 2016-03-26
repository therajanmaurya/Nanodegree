package com.example.rajan.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button bt_spotify,bt_scores, bt_library,bt_builditbigger,bt_xyz,bt_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        bt_spotify = (Button)findViewById(R.id.spotify);
        bt_scores = (Button)findViewById(R.id.score);
        bt_builditbigger = (Button)findViewById(R.id.buildidbigger);
        bt_library=(Button)findViewById(R.id.library);
        bt_capstone = (Button)findViewById(R.id.capstone);
        bt_xyz = (Button)findViewById(R.id.xyzreader);

        bt_spotify.setOnClickListener(this);
        bt_scores.setOnClickListener(this);
        bt_builditbigger.setOnClickListener(this);
        bt_library.setOnClickListener(this);
        bt_capstone.setOnClickListener(this);
        bt_xyz.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.spotify:
                Toast.makeText(this,"This button will launch my " + "Spotify app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.score:
                Toast.makeText(this,"This button will launch my " + "Scores app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this,"This button will launch my " + "Library app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildidbigger:
                Toast.makeText(this,"This button will launch my " + "Build It Bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyzreader:
                Toast.makeText(this,"This button will launch my " + "XYZ Reader app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this,"This button will launch my " + "Capstone app!",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"This is default case ",Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
