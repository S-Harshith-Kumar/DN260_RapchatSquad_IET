package com.example.harshith_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SellerActivity extends AppCompatActivity {

    private FloatingActionButton okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);

        okBtn = findViewById(R.id.ok_btn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.shopeco.camera");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(SellerActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

