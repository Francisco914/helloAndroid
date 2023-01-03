package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes();
    }

    private fun variablesYConstantes() {
        // Variables
        // no se puede asignar un valor de tipo Int a una variable previamente inicializada del tipo string
        //myFirstVariable = 1;
        var myFirstVariable = "Hello paco!!!";
        println(myFirstVariable);

        //Constantes
        //Una constante no se puede modificar una vez inicializada
        val myFirstConstant = myFirstVariable;
    }
}