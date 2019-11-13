package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private  Button btnAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Enlazamos Activity + Layout
        btnProducts = (Button)findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProducts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                //Log.i(Setting.INFO, "Products");
                Intent i = new Intent( MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Log.i(Setting.INFO, "About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume(); //este codigo se ejecuta antes de todos.
        //En este punto la aplicacion ya cargo.
        // This en un activity: es el contexto o la escencia de una pantalla
        // This es de tipo contexto
        Toast.makeText(this, "Aplicacion inciada", Toast.LENGTH_LONG).show();

    }
    @Override
    protected  void  onStop(){
        super.onStop();
        Toast.makeText(this, "Aplicacion Stopeada", Toast.LENGTH_LONG).show();

    }
}
