package com.example.admin.appmvp02calulator.Interactors;

import com.example.admin.appmvp02calulator.Interfaces.MainInteractor;
import com.example.admin.appmvp02calulator.Interfaces.MainPresenter;
import com.example.admin.appmvp02calulator.Presenters.MainPresenterImpl;

/**
 * Created by Admin on 21/04/2017.
 */

public class MainInteractorImpl implements MainInteractor {
    private MainPresenter presenter;
    public MainInteractorImpl(MainPresenter presenter){
      this.presenter=presenter;
    }

    @Override
    public double procesoOperacion(String numberOne, String numberTwo, int operaction) {
     switch (operaction){
         case 1: return Double.valueOf(numberOne) + Double.valueOf(numberTwo);
         case 2: return Double.valueOf(numberOne) - Double.valueOf(numberTwo);
         case 3: return Double.valueOf(numberOne) * Double.valueOf(numberTwo) ;
         case 4: return Double.valueOf(numberOne) / Double.valueOf(numberTwo) ;
         default: return 0;
     }
    }
}
