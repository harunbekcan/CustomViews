package com.harunbekcan.customviews.ui

import android.os.Bundle
import com.harunbekcan.customviews.R
import com.harunbekcan.customviews.base.BaseActivity
import com.harunbekcan.customviews.databinding.ActivityMainBinding
import com.harunbekcan.customviews.utils.bottomsheet.CustomBottomSheet

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun prepareView(savedInstanceState: Bundle?) {
        setToolbarTitle()
        showBottomSheet()
    }

    private fun setToolbarTitle(){
        binding.mainToolbarView.apply {
            setToolbarTitle(getString(R.string.harun_bekcan))
            showFilterButton(true)
        }
    }

    private fun showBottomSheet(){
        binding.showBottomSheetButton.setOnClickListener {
            val customBottomSheetDialog = CustomBottomSheet.newInstance()
            customBottomSheetDialog.show(this.supportFragmentManager)
        }
    }
}