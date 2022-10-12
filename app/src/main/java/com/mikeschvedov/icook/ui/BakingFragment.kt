package com.mikeschvedov.icook.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mikeschvedov.icook.R
import com.mikeschvedov.icook.databinding.FragmentAppetizersBinding
import com.mikeschvedov.icook.databinding.FragmentBakingBinding


class BakingFragment : Fragment() {

    private var _binding: FragmentBakingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBakingBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}