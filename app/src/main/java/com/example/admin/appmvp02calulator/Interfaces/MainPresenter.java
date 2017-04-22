package com.example.admin.appmvp02calulator.Interfaces;

/**
 * Created by Admin on 21/04/2017.
 */

public interface MainPresenter {
    void Operacion(String number_one,String number_two, int operation);
    void showErrorPresenter(String error);
    void setResultPresenter(String result);
}
