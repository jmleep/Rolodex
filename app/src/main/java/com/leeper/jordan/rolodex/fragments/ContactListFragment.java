package com.leeper.jordan.rolodex.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leeper.jordan.rolodex.R;

/**
 * Created by jordan on 10/29/15.
 * This fragment should show the users existing list of contacts.
 */
public class ContactListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view, container, false);
        ContactsRecyclerViewAdapter adapter = new ContactsRecyclerViewAdapter();

        //TODO - Get list of contacts from activity here
        Bundle bundle = getArguments();
        //mContacts = bundle.getParcelableArrayList("contacts");

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ViewHolder(View v) {
            super(v);
            name = (TextView) itemView.findViewById(R.id.contact_name);
        }
    }

    public static class ContactsRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View contactView = inflater.inflate(R.layout.item_contact, parent, false);
            return new ViewHolder(contactView);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            //TODO - Implement contacts here for each view
            //Contact contact = mContacts.get(position);

            TextView textView = holder.name;
            //textView.setText(contact.getFirstName() + " " + contact.getLastName());
        }

        @Override
        public int getItemCount() {
            //TODO - Return contact list size here
            return 0;
        }
    }


}