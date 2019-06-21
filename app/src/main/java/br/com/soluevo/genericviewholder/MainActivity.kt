package br.com.soluevo.genericviewholder

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import br.com.soluevo.genericviewholder.adapter.MainAdapter
import br.com.soluevo.genericviewholder.databinding.ActivityMainBinding
import br.com.soluevo.genericviewholder.domain.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private val items =
        mutableListOf(
            Item("Title 1"),
            Item("Title 2"),
            Item("Title 3"),
            Item("Title 4"),
            Item("Title 5"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        recyclerView = binding.recyclerView
        layoutManager = LinearLayoutManager(this)
        val divider = DividerItemDecoration(
            recyclerView.context,
            layoutManager.orientation
        )

        recyclerView.layoutManager = layoutManager
        recyclerView.addItemDecoration(divider)
        recyclerView.adapter = MainAdapter(items)
    }


}
