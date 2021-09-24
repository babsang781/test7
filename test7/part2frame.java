package com.book.test7;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class part2frame extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2frame);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

    }
    public void imagechange_clicked(View view){
        changeImage();
    }
    public void changeImage(){
        if (imageIndex== 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        } else if (imageIndex == 1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }
    }


}