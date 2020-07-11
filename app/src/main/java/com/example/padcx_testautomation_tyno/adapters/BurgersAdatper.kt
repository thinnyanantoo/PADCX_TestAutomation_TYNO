package com.example.padcx_testautomation_tyno.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.padcx_testautomation_tyno.R
import com.example.padcx_testautomation_tyno.delegates.BurgerViewHolderDelegate
import com.example.padcx_testautomation_tyno.viewholders.BurgerViewHodler

class BurgersAdatper(delegate : BurgerViewHolderDelegate): RecyclerView.Adapter<BurgerViewHodler>() {

   var mDelegate : BurgerViewHolderDelegate = delegate
    override fun onBindViewHolder(holder: BurgerViewHodler, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHodler {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_burger,parent,false)
        return BurgerViewHodler(view, mDelegate)
    }

    override fun getItemCount(): Int {
       return 10
    }

}