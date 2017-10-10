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
import com.jonmid.quizdos.Models.UserModelDiazIvan;
import com.jonmid.quizdos.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IVANCHO on 10/10/2017.
 */

public class UserAdapterDiazIvan extends RecyclerView.Adapter<UserAdapterDiazIvan.ViewHolder> {



    List<UserModelDiazIvan> modelUserList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public UserAdapterDiazIvan(List<UserModelDiazIvan> UserList, Context context) {
        this.modelUserList = UserList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(context).load(modelUserList.get(position).getUserArrayDiazIvan()).into((holder.foto));

        // Encargado de trabajar con el item.xml y sus componentes
        //Picasso.with(context).load(modelPhotoList.get(position).getFoto()).into((holder.foto));
        holder.textViewName.setText( modelUserList.get(position).getName());
        holder.textViewUsername.setText( modelUserList.get(position).getUsername());
        holder.textViewEmail.setText( modelUserList.get(position).getEmail());
        holder.textViewPhone.setText( modelUserList.get(position).getPhone());
        holder.textViewCompany.setText( modelUserList.get(position).getCompany());
        holder.textViewAddress.setText( modelUserList.get(position).getAddress());
   }

    @Override
    public int getItemCount() {
        return modelUserList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView foto;
        TextView textViewName;
        TextView textViewUsername;
        TextView textViewEmail;
        TextView textViewPhone;
        TextView textViewCompany;
        TextView textViewAddress;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);
            foto=(ImageView)item.findViewById(R.id.Id_foto);
            //textViewName = (TextView) item.findViewById(R.id.id_tv_item_region);
            //textViewUsername = (TextView) item.findViewById(R.id.id_tv_item_region);
            //textViewEmail = (TextView) item.findViewById(R.id.id_tv_item_region);
            //textViewPhone = (TextView) item.findViewById(R.id.id_tv_item_region);
            //textViewCompany = (TextView) item.findViewById(R.id.id_tv_item_region);
            //textViewAddress = (TextView) item.findViewById(R.id.id_tv_item_region);

        }

        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, IndexActivity.class);
            contextItem.startActivity(intent);
        }
    }



}
