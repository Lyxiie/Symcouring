package com.apps.ridhamad.symcouring;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public  int[] imageArray = {
            R.drawable.img_slider_1, R.drawable.img_slider_2, R.drawable.img_slider_3, R.drawable.img_slider_4,
            R.drawable.img_slider_1, R.drawable.img_slider_2, R.drawable.img_slider_3, R.drawable.img_slider_4,
            R.drawable.img_slider_1, R.drawable.img_slider_2, R.drawable.img_slider_3, R.drawable.img_slider_4,
            R.drawable.img_slider_1, R.drawable.img_slider_2, R.drawable.img_slider_3, R.drawable.img_slider_4

    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340, 350));

        return imageView;
    }
}
