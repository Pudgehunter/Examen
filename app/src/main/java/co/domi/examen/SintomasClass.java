package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class SintomasClass extends AppCompatActivity {

    Button finalizar;
    TextView textView8;
    CheckBox sintomas,sintomas2,sintomas3,sintomas4,sintomas5,sintomas6,sintomas7;
    int sintomasRiesgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas_class);

        textView8 = findViewById(R.id.textView8);
        sintomas = findViewById(R.id.sintomas);
        sintomas2 = findViewById(R.id.sintomas2);
        sintomas3 = findViewById(R.id.sintomas3);
        sintomas4 = findViewById(R.id.sintomas4);
        sintomas5 = findViewById(R.id.sintomas5);
        sintomas6 = findViewById(R.id.sintomas6);
        sintomas7 = findViewById(R.id.sintomas7);

        SharedPreferences preferences = getSharedPreferences("savePerson",MODE_PRIVATE);
        int sumaNe = preferences.getInt("riesgoNe", 0);
        sintomasRiesgo = sumaNe;

        textView8.append(""+sumaNe);

        finalizar = findViewById(R.id.finalizar);


        //Profe, se que me dijiste que no haga esto, pero me desespere y no encontre otra solución para hacer esto... Lo siento.
        sintomas.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas2.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas2.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if(sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas3.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas3.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if(sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas4.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas4.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas5.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas5.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if(sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas6.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas6.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if(sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );
        sintomas7.setOnCheckedChangeListener(
                (a,b)-> {
                    if(sintomas7.isChecked()){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttonredcolor));
                    } else if (sintomas.isChecked() == false &&
                            sintomas2.isChecked() == false &&
                            sintomas3.isChecked() == false &&
                            sintomas4.isChecked() == false &&
                            sintomas5.isChecked() == false &&
                            sintomas6.isChecked() == false &&
                            sintomas7.isChecked() == false){
                        finalizar.setBackground(this.getResources().getDrawable(R.drawable.buttongray));
                    }
                }
        );

        finalizar.setOnClickListener(
                (v) -> {
                    Intent a = new Intent(this,MainActivity.class);
                    if (sintomas.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas2.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas3.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas4.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas5.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas6.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 4;
                    }
                    if (sintomas7.isChecked()){
                        sintomasRiesgo = sintomasRiesgo + 0;
                    }

                    if(sintomas.isChecked() == true ||
                            sintomas2.isChecked() == true ||
                            sintomas3.isChecked() == true ||
                            sintomas4.isChecked() == true ||
                            sintomas5.isChecked() == true ||
                            sintomas6.isChecked() == true ||
                            sintomas7.isChecked() == true) {
                        //String numerosPasadosString = numerosPasados + ":" + sintomasRiesgo;
                       // int RiesgoTotal = preferences.getInt("riesgoTotal",0);
                       // String registroIdString = RiesgoTotal + ":" + sintomasRiesgo;
                       // preferences.edit().putString("riesgoStringTotal",registroIdString).apply();
                        preferences.edit().putInt("riesgoTotal",sintomasRiesgo).apply();
                        startActivity(a);
                        finish();
                    }
                }
        );

    }
}