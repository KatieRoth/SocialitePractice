package com.example.katie.swipeagain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Katie on 9/18/2015.
 */

public class MyFragment extends Fragment {


    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }


    public MyFragment() {
    }


    Button ClickMe;
    TextView tv;


   /* @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        if (container == null) {
            return null;
        }
        LinearLayout theLayout = (LinearLayout)inflater.inflate(R.layout.my_fragment, container, false);
        Button edit = (Button) theLayout.findViewById(R.id.button);
        edit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final LinearLayout theLayout = (LinearLayout)inflater.inflate(R.layout.my_fragment2, container, false);

            }
        });
        return theLayout;

    }

*/





  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.my_fragment, container, false);

        ClickMe = (Button) rootView.findViewById(R.id.button);
        tv = (TextView) rootView.findViewById(R.id.textView2);
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(tv.getText().toString().contains("Hello")){
               //    tv.setText("Hi");
               //  }else tv.setText("Hello");
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                startActivity(intent);
            }
        });

      return rootView;
    }

} // This is the end of our MyFragments Class
