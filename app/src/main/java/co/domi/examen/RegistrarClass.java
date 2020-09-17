package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrarClass extends AppCompatActivity {

    Button continuar;
    EditText editPersonName;
    EditText editId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_class);

        continuar = findViewById(R.id.continuar);
        editPersonName = findViewById(R.id.editPersonName);
        editId = findViewById(R.id.editId);

        SharedPreferences preferences = getSharedPreferences("savePerson",MODE_PRIVATE);

        continuar.setOnClickListener(
                (v) -> {
                    Intent a = new Intent(this,NexoEpidemiologico.class);

                    String registroNew = preferences.getString("registros","Yoshiki Tsutsui Michida");
                    String registroId = preferences.getString("registrosId","1107517772");

                    String pn = editPersonName.getText().toString();
                    String pi = editId.getText().toString();

                    String registro = registroNew + ":" + pn;
                    String registroIdString = registroId + ":" + pi;

                    if(registroId.contains(pi)){
                        Toast.makeText(this, "Ya lo tienes registrado", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    preferences.edit().putString("registros",registro).apply();
                    preferences.edit().putString("registrosId",registroIdString).apply();
                    startActivity(a);
                    finish();
                }
        );




    }
}