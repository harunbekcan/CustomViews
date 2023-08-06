package com.harunbekcan.customviews.utils.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.harunbekcan.customviews.databinding.CustomBottomSheetBinding


class CustomBottomSheet : RoundedBottomSheetDialogFragment() {

    private lateinit var binding : CustomBottomSheetBinding
    //var bottomSheetOnClick: () -> Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CustomBottomSheetBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
    }

    private fun clickListeners(){
        binding.closeButton.setOnClickListener {
            dismiss()
        }
    }

    fun show(fragmentManager: FragmentManager) {
        super.show(fragmentManager, TAG)
    }

    companion object {

        val TAG: String = CustomBottomSheet::class.java.simpleName
        fun newInstance(): CustomBottomSheet {
            val fragment = CustomBottomSheet()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }

    }
}