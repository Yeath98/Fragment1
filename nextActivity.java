package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.crypto.NullCipher;

public class nextActivity extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;
    EditText edt1;
    EditText edt2,edt3;
    Toast mtoast;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_register);
        Btn1 = findViewById(R.id.btn_register);
        edt1=(EditText)findViewById(R.id.et_4);
        edt2=(EditText)findViewById(R.id.et_5);
        edt3=(EditText)findViewById(R.id.et_6);
        Btn1.setOnClickListener(new View.OnClickListener() {
            Toast toast=new Toast(getApplicationContext());
            LayoutInflater inflater = LayoutInflater.from(nextActivity.this);
            View view =inflater.inflate(R.layout.activity_login,null);
            TextView textView1=view.findViewById(R.id.tv_toast);
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, nextActivity.class);
//                startActivity(intent);

                if (edt1.getText().toString().equals("")||edt2.getText().toString().equals("")||edt3.getText().toString().equals("")) {
                    new AlertDialog.Builder(nextActivity.this)
                            .setTitle("提示")
                            .setMessage("输入不能为空！")
                            .setPositiveButton("返回", null)
//                            .setNegativeButton("否", null)
                            .show();

                }

                else{
                    String s = edt2.getText().toString().trim();
                    String t = edt3.getText().toString().trim();
                    if(s==t)
                    {
                        new AlertDialog.Builder(nextActivity.this)
                        .setTitle("提示！")
                            .setMessage("注册成功。")
                            .setPositiveButton("返回", null)
//                            .setNegativeButton("否", null)
                            .show();
                    }
                    else if(s!=t)
                    {
                        new AlertDialog.Builder(nextActivity.this)
                                .setTitle("提示")
                                .setMessage("您的密码输入不同，请重新输入。")
                                .setPositiveButton("点击返回", null)
//                            .setNegativeButton("否", null)
                                .show();
                    }

                }
//                delay(10000);
//                Intent intent = new Intent(nextActivity.this, MainActivity.class);
//                startActivity(intent);

            }
        });
    }


    private void delay(int ms){

        try {

            Thread.currentThread();

            Thread.sleep(ms);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }


}
