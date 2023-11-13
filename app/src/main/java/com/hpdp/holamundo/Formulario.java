package com.hpdp.holamundo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText edNombres, edApellidos, edcedula, edCorreo, edDireccion;
        Button btValidar;
        btValidar = findViewById(R.id.btnValidar);
        edNombres = findViewById(R.id.txtNombres);
        edApellidos = findViewById(R.id.txtApellidos);
        edcedula = findViewById(R.id.txtCedula);
        edDireccion = findViewById(R.id.txtDireccion);
        edCorreo = findViewById(R.id.txtCorreo);
        btValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombre = edNombres.getText().toString();
                String Apellido = edApellidos.getText().toString();
                String Cedula = edcedula.getText().toString();
                String Direccion = edDireccion.getText().toString();
                String Correo = edCorreo.getText().toString();
                if (!Nombre.isEmpty() && !Apellido.isEmpty() && !Cedula.isEmpty() && !Direccion.isEmpty() && !Correo.isEmpty()){
                    Toast.makeText(Formulario.this, "Datos Ingresados Correctamente", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Formulario.this, "Ingrese todos los campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}