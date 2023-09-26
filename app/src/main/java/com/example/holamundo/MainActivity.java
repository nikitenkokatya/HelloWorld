package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
/**
 * @author kniki
 * @version 1.0
 * <br>Aplicacion que muetra el tipico ejemplo de Hola Mundo</br>
 *<ol>
 *     <li>Se ha visto como se creen los recursos en xml</li>
 *     <li>Se ha instansiado en Java un objeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicacion</li>
 *</ol>
**/
//todo tengo que mirar el temario explicado en clase sobre las Activity
public class MainActivity extends AppCompatActivity {

    private TextView tvMessageStart;
    private TextView tvMessageEnd;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.white));             //solo en java set, get
        tvMessageEnd=findViewById(R.id.tvMessageEnd);
        tvMessageEnd.setText(R.string.txtMessageOptimist);
    }
}

