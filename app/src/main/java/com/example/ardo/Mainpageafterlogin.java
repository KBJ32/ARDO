package com.example.ardo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Mainpageafterlogin extends AppCompatActivity {

    BottomNavigationView nav;
    HomeFragment homeFragment = new HomeFragment();
    TypesFragment typesFragment = new TypesFragment();
    CausesFragment causesFragment=new CausesFragment();
//    FrameLayout frameLayout;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpageafterlogin);

        nav = findViewById(R.id.nav);
//        frameLayout = findViewById(R.id.Logout);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.types:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, typesFragment).commit();
                        return true;
                    case R.id.causes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, causesFragment).commit();
                        return true;

                }
                return false;
            }
        });


    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.options_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId()==R.id.Logout){
//            Fragment fragmentlogout = new LogoutFragment();
//            FragmentTransaction transactionlogout = getSupportFragmentManager().beginTransaction();
//            transactionlogout.replace(R.id.container, fragmentlogout);
//            transactionlogout.commit();
//        }
//        return true;
//    }
}