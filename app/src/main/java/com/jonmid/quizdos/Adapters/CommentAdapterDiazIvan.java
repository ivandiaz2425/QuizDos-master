package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.quizdos.IndexActivity;
import com.jonmid.quizdos.Models.CommentModelDiazIvan;
import com.jonmid.quizdos.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class CommentAdapterDiazIvan extends RecyclerView.Adapter<CommentAdapterDiazIvan.ViewHolder>{

    List<CommentModelDiazIvan> modelCommentList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public CommentAdapterDiazIvan(List<CommentModelDiazIvan> CommentList, Context context) {
        this.modelCommentList = CommentList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_cardview, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(context).load(modelCommentList.get(position).CommentArrayDiazIvan()).into((holder.foto));

        // Encargado de trabajar con el item.xml y sus componentes
        //Picasso.with(context).load(modelPhotoList.get(position).getFoto()).into((holder.foto));

        holder.textViewName.setText(modelCommentList.get(position).getName());
        holder.textViewBody.setText( modelCommentList.get(position).getBody());
        holder.textViewEmail.setText( modelCommentList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return modelCommentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title, thumbnailUrl,id;

        ImageView foto;
        TextView textViewName;
        TextView textViewBody;
        TextView textViewEmail;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);
            foto=(ImageView)item.findViewById(R.id.id_img_comment_picasso);
            textViewName=(TextView) item.findViewById(R.id.id_tv_comment_name);
            textViewBody=(TextView) item.findViewById(R.id.id_tv_comment_body);
            textViewEmail=(TextView) item.findViewById(R.id.id_tv_comment_email);

        }

        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, IndexActivity.class);
            contextItem.startActivity(intent);
        }
    }




}
