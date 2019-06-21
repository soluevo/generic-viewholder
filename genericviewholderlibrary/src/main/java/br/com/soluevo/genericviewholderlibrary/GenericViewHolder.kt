package br.com.soluevo.genericviewholderlibrary

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

class GenericViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding: ViewDataBinding? = DataBindingUtil.bind(view)

}