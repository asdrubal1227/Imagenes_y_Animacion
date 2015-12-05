package com.example.brayanasdrubal.exposicion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView logo_paraiso;
    TextView eslogan;
    Button boton_girar, boton_ampliar, boton_mover, boton_trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_paraiso=(ImageView) findViewById(R.id.img_logo);
        eslogan=(TextView) findViewById(R.id.text_somos);
        boton_girar=(Button) findViewById(R.id.button_girar);
        boton_mover=(Button) findViewById(R.id.button_mover);
        boton_ampliar=(Button) findViewById(R.id.button_ampliar);
        boton_trans=(Button) findViewById(R.id.button_trans);

        boton_girar.setOnClickListener(this);
        boton_mover.setOnClickListener(this);
        boton_ampliar.setOnClickListener(this);
        boton_trans.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_girar:
                Animation giro;
                giro= AnimationUtils.loadAnimation(this, R.animator.girar);
                giro.reset();
                logo_paraiso.startAnimation(giro);
                break;
            case R.id.button_mover:
                Animation movimiento;
                movimiento= AnimationUtils.loadAnimation(this, R.animator.mover);
                movimiento.reset();
                logo_paraiso.startAnimation(movimiento);
                break;
            case R.id.button_ampliar:
                Animation aumentar;
                aumentar= AnimationUtils.loadAnimation(this, R.animator.ampliar);
                aumentar.reset();
                logo_paraiso.startAnimation(aumentar);
                break;
            case R.id.button_trans:
                Animation transparencia;
                transparencia= AnimationUtils.loadAnimation(this, R.animator.transparentar);
                transparencia.reset();
                logo_paraiso.startAnimation(transparencia);
                break;
            default:
                break;
        }

    }
}
