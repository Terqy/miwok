package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.itemlist_layout, parent, false);
        }


        Word currentWord = getItem(position);

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.defaultTranslation);

        ImageView image = (ImageView) listItemView.findViewById(R.id.listItemImage);

        miwokTranslation.setText(currentWord.getmMiwokTranslation());
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceID());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
