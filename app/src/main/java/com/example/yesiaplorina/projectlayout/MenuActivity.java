package com.example.yesiaplorina.projectlayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    // 1. kenalin (deklarasi variabel)
    Button linier, relatif, frame, scroll, konstrain;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        //2. sambungin (Initialization)
        
        linier      = findViewById(R.id.btn_linier);
        relatif     = findViewById(R.id.btn_relative);
        frame       = findViewById(R.id.btn_frame);
        scroll      = findViewById(R.id.btn_scrollview);
        konstrain   = findViewById(R.id.btn_constrain);
        
        //3 boleh diapain aja (even handling)
        
        linier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "Anda ngeklik linier", Toast.LENGTH_SHORT).show();
                Intent pindah=new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        relatif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // komponen namavariabel = new Komponen
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("Warning");
                pesan.setMessage("ini aplikasi saya yaa");
                pesan.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                        startActivity(pindah);
                    }
                });

                pesan.setNegativeButton("No", null);
                pesan.show();
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah activity
                Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(pindah);

            }
        });
        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, ScrollActivity.class);
                startActivity(pindah);
            }
        });
        konstrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MenuActivity.this, ConstrainActivity.class);
                startActivity(p);
            }
        });
    }
}
