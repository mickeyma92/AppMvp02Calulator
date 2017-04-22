package com.example.admin.appmvp02calulator.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.appmvp02calulator.Interfaces.MainPresenter;
import com.example.admin.appmvp02calulator.Interfaces.MainView;
import com.example.admin.appmvp02calulator.Presenters.MainPresenterImpl;
import com.example.admin.appmvp02calulator.R;

public class MainActivity extends AppCompatActivity implements MainView {

    private EditText main_number_one,main_number_two;
    private TextView vistaResult;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_number_one=(EditText)findViewById(R.id.main_number_one);
        main_number_two=(EditText)findViewById(R.id.main_number_two);
        vistaResult=(TextView)findViewById(R.id.Resultado);
        presenter= new MainPresenterImpl(this);

    }

    @Override
    public void setResult(String result) {
        //Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
        this.vistaResult.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(MainActivity.this,error,Toast.LENGTH_LONG).show();
    }
    public  void suma(View v){
        //vamos a mandar llamar un metodo del presentador
        presenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString(),1);
    }
    public  void resta(View v){
        //vamos a mandar llamar un metodo del presentador
        presenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString(),2);
    }
    public void multiplicacion(View v){
        presenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString(),3);
    }
    public void division (View v ){
        presenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString(),4);
    }
}
