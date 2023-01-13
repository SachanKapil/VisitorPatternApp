package com.codewithkapil.home

import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codewithkapil.core.base.BaseActivity
import com.codewithkapil.home.databinding.ActivityHomeBinding
import com.codewithkapil.home.ui.HomeViewModel
import com.codewithkapil.home.ui.adapter.HomeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override fun getViewBinding() = ActivityHomeBinding.inflate(layoutInflater)

    private val viewModel: HomeViewModel by viewModels()

    @Inject
    lateinit var adapter: HomeAdapter


    override fun initialize() {
        initRecyclerView()
        initObservers()
    }

    private fun initRecyclerView() {
        binding.rvHome.layoutManager = LinearLayoutManager(this)
        binding.rvHome.adapter = adapter
    }

    private fun initObservers() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.homeItemListStateFlow.collectLatest { homeItemList ->
                    adapter.submitList(homeItemList)
                }
            }
        }
    }
}