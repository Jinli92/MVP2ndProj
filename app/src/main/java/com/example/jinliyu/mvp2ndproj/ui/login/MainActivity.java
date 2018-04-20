package com.example.jinliyu.mvp2ndproj.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jinliyu.mvp2ndproj.R;

public class MainActivity extends AppCompatActivity implements IView {
    IPresenter iPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iPresenter = new Presenter(this);
    }

    public void clickHandler(View view) {
        iPresenter.onButtonClicked();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "this is a toast",Toast.LENGTH_LONG).show();
    }
}
