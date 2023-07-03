package com.example.blueapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ChatsListHolder extends RecyclerView.ViewHolder {
    public TextView itemText;

    public ChatsListHolder(View itemView) {
        super(itemView);
        itemText = itemView.findViewById(R.id.item_text);
    }
}
