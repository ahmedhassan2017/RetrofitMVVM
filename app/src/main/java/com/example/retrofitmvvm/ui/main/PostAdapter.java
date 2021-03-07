package com.example.retrofitmvvm.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitmvvm.R;
import com.example.retrofitmvvm.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<PostModel> PostModelArrayList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        // holder.titleTV.setText(PostModelArrayList.get(position).getName());
        holder.bodyTV.setText(PostModelArrayList.get(position).getBody());
        holder.userTV.setText(PostModelArrayList.get(position).getUserId()+"");  // +"" -> 34an y7awel el 7aga l string
        holder.titleTV.setText(PostModelArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return PostModelArrayList.size();
    }

    public void setList(List<PostModel> moviesList) {
        PostModelArrayList = moviesList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        // private titleTV
        private  TextView titleTV , userTV, bodyTV;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            // titleTV = itemView.findViewById(R.id.item_title_textView);
            titleTV =itemView.findViewById(R.id.titleTV);
            userTV =itemView.findViewById(R.id.userIDTV);
            bodyTV =itemView.findViewById(R.id.bodyTV);


        }
    }
}
