package com.example.jordan.lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.jordan.lab3.MainActivity;
import com.example.jordan.lab3.R;

/**
 * Created by Jordan on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }
}
