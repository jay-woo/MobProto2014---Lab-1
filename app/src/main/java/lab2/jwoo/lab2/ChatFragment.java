package lab2.jwoo.lab2;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by wooj on 9/14/14.
 */
public class ChatFragment extends Fragment {
    public ChatFragment () {}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView myListView = (ListView) rootView.findViewById(R.id.chatbox);

        ChatItem item1 = new ChatItem("me", "hi", "9/14");
        ChatItem item2 = new ChatItem("you", "bye", "9/15");


        ChatItem[] listChats = {item1, item2};
        myListView.setAdapter(new ChatAdapter(getActivity(), new ArrayList<ChatItem>(Arrays.asList(listChats))));

        return rootView;
    }
}