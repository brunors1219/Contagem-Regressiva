package com.minhaempresa.contagemregresiva;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends Activity {
    //Declaração do time no layout
    private MyCountDownTimer timer;


    @Override
    //Passando o codigo para layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    //Função para contegem regressiva
    public void onResume(){
        super.onResume();

        TextView tv = (TextView) findViewById(R.id.tvCountDownTimer);//declação variavel tv
        timer = new MyCountDownTimer(this, tv, 1*60*1000, 1000);
        //Dando condenada a contagem reqressiva como minitos, segundos e milesegundos
        timer.start();//Start contagem

    }


    @Override
    public void onDestroy(){
        super.onDestroy();

        if(timer != null){//Condição 1
            timer.cancel();
        }//Quando o tempo acaba cancelar a contagem
    }
}
