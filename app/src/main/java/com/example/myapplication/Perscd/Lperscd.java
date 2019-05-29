package com.example.myapplication.Perscd;

import com.example.myapplication.Ckerss.Ickerss;
import com.example.myapplication.Model.Lmodel;
import com.example.myapplication.Shuju;

/**
 * Created by 方小茗 on 2019/5/29.
 */

public class Lperscd implements Ickerss.Iperscd{
    private  Lmodel lmodel;
    Ickerss.IView iView;

    public Lperscd(Ickerss.IView iView) {
        lmodel = new Lmodel();
        this.iView = iView;
    }

    @Override
    public void getshu() {
    lmodel.getshu(new Ickerss.ICallback() {
        @Override
        public void getdata(Shuju shuju) {
            iView.getdata(shuju);
        }
    });
    }
}
