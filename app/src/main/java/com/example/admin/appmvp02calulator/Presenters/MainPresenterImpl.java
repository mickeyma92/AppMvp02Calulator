package com.example.admin.appmvp02calulator.Presenters;

import com.example.admin.appmvp02calulator.Interactors.MainInteractorImpl;
import com.example.admin.appmvp02calulator.Interfaces.MainInteractor;
import com.example.admin.appmvp02calulator.Interfaces.MainPresenter;
import com.example.admin.appmvp02calulator.Interfaces.MainView;

/**
 * Created by Admin on 21/04/2017.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView view;
    private MainInteractor interactor;

    public MainPresenterImpl(MainView view){
        this.view=view;
        interactor= new MainInteractorImpl(this);
    }
    @Override
    public void Operacion(String number_one, String number_two, int operation) {
        if (view !=null){
            try {
                if (!number_one.equals("") && !number_two.equals("")){
                    double tempResult= interactor.procesoOperacion(number_one,number_two,operation);
                    view.setResult(String.valueOf(tempResult));
                }else {
                    view.showError("Los campos son obligatorios");
                }
            }
            catch(Exception e){
                 view.showError(e.getMessage());
            }
        }
    }

    @Override
    public void showErrorPresenter(String error) {
        if (view !=null){
            view.showError(error);
        }
    }

    @Override
    public void setResultPresenter(String result) {
        if (view != null){
            view.setResult(result);
        }
    }
}
