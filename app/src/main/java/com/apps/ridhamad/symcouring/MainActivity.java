package com.apps.ridhamad.symcouring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import java.util.Objects;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        //Meow Bottom Navigation

        bottomNavigation = findViewById(R.id.bottom_navigation);

        //Add Item
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_profile));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_gallery));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_music));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_friend));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;

                switch (item.getId()){
                    case 1:
                        fragment = new ProfileFragment();
                        break;
                    case 2:
                        fragment = new GalleryFragment();
                        break;
                    case 3:
                        fragment = new HomeFragment();
                        break;
                    case 4:
                        fragment = new MusicFragment();
                        break;
                    case 5:
                        fragment = new DailyActivityFragment();
                        break;
                }

                loadFragment(fragment);
            }
        });

//        bottomNavigation.setCount(1, "10");

        bottomNavigation.show(3, true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                String title = "";
                if (item.getId() == 1) {
                    title = "Profile";
                } else if (item.getId() == 2) {
                    title = "Gallery";
                } else if (item.getId() == 3) {
                    title = "Home";
                } else if (item.getId() == 4) {
                    title = "Music & Video";
                } else if (item.getId() == 5) {
                    title = "Daily Activity";
                }
                else {
                    title = "Undifine";
                }
                Toast.makeText(getApplicationContext()
                        , title
                        , Toast.LENGTH_SHORT).show();
            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                String title = "";
                if (item.getId() == 1) {
                    title = "Profile";
                } else if (item.getId() == 2) {
                    title = "Gallery";
                } else if (item.getId() == 3) {
                    title = "Home";
                } else if (item.getId() == 4) {
                    title = "Music & Video";
                } else if (item.getId() == 5) {
                    title = "Daily Activity";
                }
                else {
                    title = "Undifine";
                }
                Toast.makeText(getApplicationContext()
                        , "You Reselected " + title
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }
}