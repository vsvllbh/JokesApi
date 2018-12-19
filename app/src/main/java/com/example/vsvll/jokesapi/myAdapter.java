package com.example.vsvll.jokesapi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myHolder> {

    Data p;

    public myAdapter(Data data) {

        p = data;

    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_single, viewGroup, false);
        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder myHolder, int i) {

        String type = p.getType();


        // for(int i=0; i<p.getValue().size();i++){

        String Id = p.getValue().get(i).getId().toString();
        myHolder.Id.setText(Id);

        String Joke = p.getValue().get(i).getJoke();
        myHolder.Joke.setText(Joke);


//            for(int k=0;k<p.getValue().get(i).getCategories().size();k++){
        String category = p.getValue().get(i).getCategories().toString();
//
//
        myHolder.Category.setText(category);
//            }
        // }
        // Toast.makeText(myHolder.Category.getContext(),"ID"+Id,Toast.LENGTH_LONG).show();

    }

    @Override
    public int getItemCount() {


        return p.getValue().size();
    }

    public class myHolder extends RecyclerView.ViewHolder {

        TextView Id, Joke, Category;

        public myHolder(@NonNull View itemView) {
            super(itemView);
            Id = itemView.findViewById(R.id.Id);
            Joke = itemView.findViewById(R.id.Jokes);
            Category = itemView.findViewById(R.id.Category);

        }
    }
}
