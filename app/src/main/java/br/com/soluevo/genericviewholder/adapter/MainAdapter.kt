package br.com.soluevo.genericviewholder.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.soluevo.genericviewholder.R
import br.com.soluevo.genericviewholder.databinding.ItemBinding
import br.com.soluevo.genericviewholder.domain.Item
import br.com.soluevo.genericviewholderlibrary.GenericViewHolder

class MainAdapter(private val items: List<Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GenericViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item, parent, false)
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as GenericViewHolder).binding as ItemBinding
        binding.item = items[position]
    }
}