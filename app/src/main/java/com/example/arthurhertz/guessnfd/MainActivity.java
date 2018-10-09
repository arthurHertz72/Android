package com.example.arthurhertz.guessnfd;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


import java.util.Objects;

public class MainActivity extends Activity {

    private int cpt = 0;
    private String result;
    private String test = "50";
    private String valeur;
    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void leJeux(){
        result = valeur;
        int n = rand.nextInt(100) + 1;
        String nString = Integer.toString(n);
        TextView text = (TextView) findViewById(R.id.screen) ;
        ImageView imgFp = (ImageView) findViewById(R.id.imageView);
        ImageView imgPlusMois = (ImageView) findViewById(R.id.imageView2);

        text.setText(valeur);
        if(cpt == 2){
            cpt = 0;
            if(Objects.equals(test,result)){
                imgFp.setImageResource(R.drawable.dskds);
                text.setText("GAGNÉ");
                result = nString;
                
            }
            if(Integer.parseInt(test) < Integer.parseInt(result)) {
                imgPlusMois.setImageResource(R.drawable.arrowdown);
            }
            if(Integer.parseInt(test) > Integer.parseInt(result)){
                imgPlusMois.setImageResource(R.drawable.arrowup);
            }
        }else {
            imgFp.setImageResource(R.drawable.kjfjhjh);
            return;
        }
    }

    public void click0(View view){
        cpt++;
        if(cpt==1){
            valeur = "0";
        }
        if (cpt==2){
            valeur = valeur.concat("0");
        }
        leJeux();
    }
    public void click1(View view){
        cpt++;
        if(cpt==1){
            valeur = "1";
        }
        if (cpt==2){
            valeur = valeur.concat("1");

        }
        leJeux();
    }
    public void click2(View view){
        cpt++;
        if(cpt==1){
            valeur = "2";
        }
        if (cpt==2){
            valeur = valeur.concat("2");
        }
        leJeux();
    }
    public void click3(View view){
        cpt++;
        if(cpt==1){
            valeur = "3";
        }
        if (cpt==2){
            valeur = valeur.concat("3");
        }
        leJeux();
    }
    public void click4(View view){
        cpt++;
        if(cpt==1){
            valeur = "4";
        }
        if (cpt==2){
            valeur = valeur.concat("4");
        }
        leJeux();
    }
    public void click5(View view){
        cpt++;
        if(cpt==1){
            valeur = "5";
        }
        if (cpt==2){
            valeur = valeur.concat("5");
        }
        leJeux();
    }
    public void click6(View view){
        cpt++;
        if(cpt==1){
            valeur = "6";
        }
        if (cpt==2){
            valeur = valeur.concat("6");
        }
        leJeux();
    }
    public void click7(View view){
        cpt++;
        if(cpt==1){
            valeur = "7";
        }
        if (cpt==2){
            valeur = valeur.concat("7");
        }
        leJeux();
    }
    public void click8(View view){
        cpt++;
        if(cpt==1){
            valeur = "8";
        }
        if (cpt==2){
            valeur = valeur.concat("8");
        }
        leJeux();
    }
    public void click9(View view){
        cpt++;
        if(cpt==1){
            valeur = "9";
        }
        if (cpt==2){
            valeur = valeur.concat("9");
        }
        leJeux();
    }
}
