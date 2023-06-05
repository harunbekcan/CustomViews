package com.harunbekcan.customviews.ui

import android.os.Bundle
import com.harunbekcan.customviews.base.BaseActivity
import com.harunbekcan.customviews.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun prepareView(savedInstanceState: Bundle?) {
        setToolbarTitle()
    }

    private fun setToolbarTitle(){
        binding.mainToolbarView.apply {
            setToolbarTitle("HARUN BEKCAN")
            showFilterButton(true)
        }
    }
}