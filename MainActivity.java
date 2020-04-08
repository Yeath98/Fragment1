package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Btn1,Btn2,Btn3;
    EditText edt1;
    EditText edt2;
    Toast mtoast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        Btn1 = findViewById(R.id.btn_login);
        edt1=(EditText)findViewById(R.id.edit1);
        edt2=(EditText)findViewById(R.id.edit2);

        Btn1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

//                Intent intent = new Intent(MainActivity.this, nextActivity.class);
//                startActivity(intent);
                if (edt1.getText().toString().equals("")||edt2.getText().toString().equals("")) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("提示！")
                            .setMessage("输入不能为空！")
                            .setPositiveButton("返回", null)
//                            .setNegativeButton("否", null)
                            .show();
                }
                else if(edt1.getText().toString().equals("yyzh")&&edt2.getText().toString().equals("123456"))
                {
                    new AlertDialog.Builder(MainActivity.this)
                    .setTitle("提示！")
                        .setMessage("密码输入正确。")
                        .setPositiveButton("返回", null)
//                            .setNegativeButton("否", null)
                        .show();

                }
                else
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("提示！")
                            .setMessage("用户名或密码输入错误。")
                            .setPositiveButton("重新输入", null)
//                            .setNegativeButton("否", null)
                            .show();
                }



            }
        });

        Btn1 = findViewById(R.id.btn_login);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);


            }

        });


        Btn2 = findViewById(R.id.btn_zc);

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nextActivity.class);
                startActivity(intent);


            }

        });


        }



}






