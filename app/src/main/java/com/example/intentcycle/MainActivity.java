package com.example.intentcycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  toscroll(View view){
        Intent intent = new Intent(this,scrollview.class);
        startActivity(intent);
    }

    public  void  toweb(View view){
        Intent intent = new Intent(this,webview.class);
        startActivity(intent);
    }

    public  void  tobar(View view){
        Intent intent = new Intent(this,ratingbar.class);
        startActivity(intent);
    }

    public  void  toseekbar(View view){
        Intent intent = new Intent(this,seekbar.class);
        startActivity(intent);
    }

    public  void  tocompoundbutton(View view){
        Intent intent = new Intent(this,compoundbutton.class);
        startActivity(intent);
    }

    public  void  tomenus(View view){
        Intent intent = new Intent(this,menus.class);
        startActivity(intent);
    }

    public  void  tospinner(View view){
        Intent intent = new Intent(this,spinner.class);
        startActivity(intent);
    }

public void exit(View view){
        finish();
}

}
