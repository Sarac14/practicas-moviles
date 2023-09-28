/*package com.example.practica1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1.R;
import com.example.practica1.entities.Word;

import org.jetbrains.annotations.NotNull;

public class WordAdapter extends ListAdapter<Word, WordAdapter.WordViewHolder> {

    public WordAdapter(@NonNull DiffUtil.ItemCallback<Word> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @NotNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return WordViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WordViewHolder holder, int position) {
        Word current = getItem(position);
        holder.bind(current.getWord());
    }


   public static class WordDiff extends DiffUtil.ItemCallback<Word> {

        @Override
        public boolean areItemsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem.getWord().equals(newItem.getWord());
        }
    }

    static class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;

        private WordViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.textView);
        }

        public void bind(String text) {
            wordItemView.setText(text);
        }

        static WordViewHolder create(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_room_view, parent, false);
            return new WordViewHolder(view);
        }

    }
}
*/