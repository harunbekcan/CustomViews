package com.harunbekcan.customviews.utils.toolbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.harunbekcan.customviews.R
import com.harunbekcan.customviews.databinding.CustomToolbarViewBinding

class CustomToolbarView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defStyle: Int = 0
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding = CustomToolbarViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        setAttrs(attributeSet)
    }

    private fun setAttrs(attributeSet: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomToolbarView)
        val title: String? = typedArray.getString(R.styleable.CustomToolbarView_toolbar_title)
        val showFilterButton = typedArray.getBoolean(R.styleable.CustomToolbarView_toolbar_filter_button, false)
        typedArray.recycle()
        setToolbarTitle(title)
        showFilterButton(showFilterButton)
    }

    fun setToolbarTitle(title: String?) {
        binding.toolbarTitleTextView.text = title
    }

    fun showFilterButton(isVisible: Boolean) {
        binding.filterImageView.isVisible = isVisible
    }
}