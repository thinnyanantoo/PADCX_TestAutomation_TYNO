package com.zg.burgerjoint.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.padcx_testautomation_tyno.R
import com.zg.burgerjoint.data.vos.BurgerVO
import com.zg.burgerjoint.delegates.CartViewHolderActionDelegate
import com.zg.burgerjoint.viewholders.CartViewHolder

class CartAdapter(private val mDelegate: CartViewHolderActionDelegate) :
    BaseRecyclerAdapter<CartViewHolder, BurgerVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_card, parent, false)
        return CartViewHolder(view, mDelegate)
    }
}

