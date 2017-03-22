package com.supportmultiplescreensutil.demo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private Context mContext;
    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View rootView=findViewById(android.R.id.content);
        SupportMultipleScreensUtil.init(getApplication());
        SupportMultipleScreensUtil.scale(rootView);
        addViewToLayout();
    }

    private void addViewToLayout(){
        mContext =this;
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mView = LayoutInflater.from(mContext).inflate(R.layout.view_test,null);
        SupportMultipleScreensUtil.scale(mView);
        mRelativeLayout.addView(mView);
    }
}
