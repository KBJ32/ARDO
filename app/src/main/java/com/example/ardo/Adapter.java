//package com.example.ardo;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentManager;
//import androidx.viewpager2.adapter.FragmentStateAdapter;
//
//public abstract class Adapter extends FragmentStateAdapter {
//    int tabcount;
//
//    public Adapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//        tabcount = behavior;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//            case 0:
//                return new fragment1();
//
//            case 1:
//                return new fragment_about_us();
//
//            case 2:
//                return new fragment_gallery();
//
//
//            default:
//                return null;
//        }
//
//    }
//    @Override
//    public int getCount() {return tabcount; }
//}
