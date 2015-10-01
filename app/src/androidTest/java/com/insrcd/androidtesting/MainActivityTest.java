package com.insrcd.androidtesting;

import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ashaw on 10/1/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    private MainActivity mActivity;


    public MainActivityTest(){
        super(MainActivity.class); ;

        mActivity = (MainActivity) getActivity();

    }

    public void testPlusButton(){
        TextView txtView = (TextView) mActivity.findViewById(R.id.txt_calc);

        Button btn = (Button) mActivity.findViewById(R.id.btn_plus);

        assertTrue(btn.hasOnClickListeners());

        btn.callOnClick();

        assertEquals(txtView.getText().toString(), "+");


    }
}
