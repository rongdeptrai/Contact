package com.hoanglong_322.contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<Contact> contactList;

    public ContactFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.contact_list,container,false);
        recyclerView= view.findViewById(R.id.recyclerview);
       ContactRecyclerAdapter adapter= new ContactRecyclerAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactList=new ArrayList<>();
        contactList.add(new Contact(R.drawable.av,"Lê Hoàng Long","0358764840"));
        contactList.add(new Contact(R.drawable.avata2,"Lê Hoàng A","0358764840"));
        contactList.add(new Contact(R.drawable.avata2,"Lê Hoàng B","0358764840"));
        contactList.add(new Contact(R.drawable.avata2,"Lê Hoàng C","0358764840"));
        contactList.add(new Contact(R.drawable.av,"Nguyễn Hoàng Long","0358764840"));

    }
}
