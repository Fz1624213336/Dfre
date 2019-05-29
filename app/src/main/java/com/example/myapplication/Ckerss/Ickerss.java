package com.example.myapplication.Ckerss;

import com.example.myapplication.Shuju;

/**
 * Created by 方小茗 on 2019/5/29.
 */

public interface Ickerss {
    interface IView{
        void getdata(Shuju shuju);
    }
    interface ICallback{
        void getdata(Shuju shuju);
    }
    interface Imodel{
        void getshu(ICallback callback);
    }
    interface Iperscd{
        void getshu();
    }
}
