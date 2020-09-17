package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class NexoEpidemiologico extends AppCompatActivity{

    Button continuar2;
    CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5;
    ConstraintLayout checkboxLayout;
    private int riesgoNe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo_epidemiologico);

        continuar2 = findViewById(R.id.continuar2);

        //Checkboxes
        checkBox = findViewById(R.id.checkbox);
        checkBox2 = findViewById(R.id.checkbox1);
        checkBox3 = findViewById(R.id.checkbox2);
        checkBox4 = findViewById(R.id.checkbox3);
        checkBox5 = findViewById(R.id.checkbox4);

        //Constra for switch
        checkboxLayout = findViewById(R.id.checkboxLayout);

        SharedPreferences preferences = getSharedPreferences("savePerson",MODE_PRIVATE);
        riesgoNe = preferences.getInt("riesgoNe",0);
        //riesgoNe = 0;

        //Profe, se que me dijiste que no haga esto, pero me desespere y no encontre otra solución para hacer esto... Lo siento.
        checkBox.setOnCheckedChangeListener(
                (a,b)-> {
                    if(checkBox.isChecked()){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (checkBox.isChecked() == false &&
                            checkBox2.isChecked() == false &&
                            checkBox3.isChecked() == false &&
                            checkBox4.isChecked() == false &&
                            checkBox5.isChecked() == false){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        checkBox2.setOnCheckedChangeListener(
                (a,b)-> {
                    if(checkBox2.isChecked()){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (checkBox.isChecked() == false &&
                            checkBox2.isChecked() == false &&
                            checkBox3.isChecked() == false &&
                            checkBox4.isChecked() == false &&
                            checkBox5.isChecked() == false){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        checkBox3.setOnCheckedChangeListener(
                (a,b)-> {
                    if(checkBox3.isChecked()){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (checkBox.isChecked() == false &&
                            checkBox2.isChecked() == false &&
                            checkBox3.isChecked() == false &&
                            checkBox4.isChecked() == false &&
                            checkBox5.isChecked() == false){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        checkBox4.setOnCheckedChangeListener(
                (a,b)-> {
                    if(checkBox4.isChecked()){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (checkBox.isChecked() == false &&
                            checkBox2.isChecked() == false &&
                            checkBox3.isChecked() == false &&
                            checkBox4.isChecked() == false &&
                            checkBox5.isChecked() == false){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        checkBox5.setOnCheckedChangeListener(
                (a,b)-> {
                    if(checkBox5.isChecked()){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (checkBox.isChecked() == false &&
                            checkBox2.isChecked() == false &&
                            checkBox3.isChecked() == false &&
                            checkBox4.isChecked() == false &&
                            checkBox5.isChecked() == false){
                        continuar2.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        continuar2.setOnClickListener(
                (v) -> {
                    Intent o = new Intent(this,SintomasClass.class);
                    if(checkBox.isChecked()){
                        riesgoNe = riesgoNe + 3;
                    }
                    if(checkBox2.isChecked()){
                        riesgoNe = riesgoNe + 3;
                    }
                    if(checkBox3.isChecked()){
                        riesgoNe = riesgoNe + 3;
                    }
                    if(checkBox4.isChecked()){
                        riesgoNe = riesgoNe + 3;
                    }
                    if(checkBox5.isChecked()){
                        riesgoNe = riesgoNe + 0;
                    }
                    if(checkBox.isChecked() == true || checkBox2.isChecked() == true|| checkBox3.isChecked() == true|| checkBox4.isChecked() == true|| checkBox5.isChecked() == true) {
                        startActivity(o);
                        preferences.edit().putInt("riesgoNe",riesgoNe).apply();
                        finish();
                    }
                }
        );


    }
}