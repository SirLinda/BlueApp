package com.example.blueapp;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChartListAdapter extends RecyclerView.Adapter<ChatsListHolder> {
    private List<String> itemList;
    private OnItemClickListener clickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public ChartListAdapter(List<String> itemList, OnItemClickListener listener) {
        this.itemList = itemList;
        this.clickListener = listener;
    }

    @NonNull
    @Override
    public ChatsListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_chats_layout, parent, false);
        return new ChatsListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsListHolder holder, @SuppressLint("RecyclerView") final int position) {
        String item = itemList.get(position);
        holder.itemText.setText(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null) {
                    clickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

