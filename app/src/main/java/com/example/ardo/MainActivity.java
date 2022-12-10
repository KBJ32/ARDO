package com.example.ardo;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

//    Button types, causes, diagnosis;

//        BottomNavigationView navigationView;



    BottomNavigationView nav;
    HomeFragment homeFragment = new HomeFragment();
    TypesFragment typesFragment = new TypesFragment();
    CausesFragment causesFragment=new CausesFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nav = findViewById(R.id.nav);
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













//        types = findViewById(R.id.types);
//        types.setOnClickListener(this);


//        causes = findViewById(R.id.causes);
//        diagnosis = findViewById(R.id.diagnosis);

//        getSupportFragmentManager().beginTransaction().add(R.id.types, new TypesFragment()).commit();




//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);       // hides status bar
//
////        navigationView = findViewById(R.id.bottom_navigation);
//        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new HomeFragment()).commit();
//        navigationView.setSelectedItemId(R.id.nav_home);
//
//        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
////            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////
////                Fragment fragment = null;
////                switch (item.getItemId()){
////
////                    case R.id.nav_home:
////                        fragment = new HomeFragment();
////                        break;
////                    case R.id.nav_types:
////                        fragment = new TypesFragment();
////                        break;
////                    case R.id.nav_causes:
////                        fragment = new CausesFragment();
////                        break;
////                    case R.id.nav_diagnosis:
////                        fragment = new DiagnosisFragment();
////                        break;
////                }
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.body_container, fragment).commit();
//                return true;
//            }
//        });






//        types.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, TypesActivity.class));
//                Intent intent= new Intent(getApplicationContext(), TypesFragment.class);
//                startActivity(intent);
//            }
//        });
//
//        causes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, CausesFragment.class));
//            }
//        });
//
    }
//    public void onClick(View v){
//        if (v.getId()==R.id.types){
//            getSupportFragmentManager().beginTransaction().replace(R.id.container,)
//        }
//    }
}