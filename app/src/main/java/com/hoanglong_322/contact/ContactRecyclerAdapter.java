package com.hoanglong_322.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder> {
    Context context;
    List<Contact> contactList;

    public ContactRecyclerAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
            v= LayoutInflater.from(context).inflate(R.layout.contact_item,parent,false);
            ContactViewHolder contactViewHolder= new ContactViewHolder(v);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.image_avt.setImageResource(contactList.get(position).getImg_avata());
        holder.txtTen.setText(contactList.get(position).getTen());
        holder.txtSdt.setText(contactList.get(position).getSdt());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static  class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView image_avt;
        TextView txtTen,txtSdt;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            image_avt=itemView.findViewById(R.id.img_avata);
            txtSdt=itemView.findViewById(R.id.txtSdt);
            txtTen=itemView.findViewById(R.id.txtTen);
        }
    }
}
