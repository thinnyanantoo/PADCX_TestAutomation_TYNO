package com.example.padcx_testautomation_tyno.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.padcx_testautomation_tyno.delegates.BurgerViewHolderDelegate
import kotlinx.android.synthetic.main.view_item_burger.view.*

class BurgerViewHodler(itemView: View,delegate : BurgerViewHolderDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.cvBurgerImage.setOnClickListener {
            delegate.onTapBurger()
        }

        itemView.btnAddToCart.setOnClickListener{
            delegate.onTapAddtoCart()
        }
        }
    }
