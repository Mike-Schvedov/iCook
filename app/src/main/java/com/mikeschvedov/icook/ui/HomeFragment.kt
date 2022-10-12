package com.mikeschvedov.icook.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mikeschvedov.icook.R
import com.mikeschvedov.icook.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Appetizers
        binding.appetizersButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_appetizersFragment)
        }

        // Main Course
        binding.mainCourseButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MainCourseFragment)
        }

        // Salads
        binding.saladsButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_saladsFragment)
        }

        // Dressings
        binding.dressingsButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_dressingsFragment)
        }

        // Soups
        binding.soupsButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_soupsFragment)
        }

        // Baking
        binding.bakingButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_bakingFragment)
        }

        return binding.root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}