package com.example.jeon.test2;

import android.os.Bundle;
import android.os.TokenWatcher;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public DrawerLayout dl;
    public ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        dl = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(MainActivity.this,dl,R.string.open,R.string.close);


        dl.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // 툴바 활성화



    }


    //  이걸 넣어줘야지 네이게이션 메뉴가 드로워가 활성화 된다.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
            return true;
        }


        // ...  에있는 항목들.
        switch (item.getItemId()) {
            case R.id.home:
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.logout:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu, menu);

        return true;
    }
}
