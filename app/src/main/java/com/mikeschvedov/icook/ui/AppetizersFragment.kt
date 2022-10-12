package com.mikeschvedov.icook.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mikeschvedov.icook.databinding.FragmentAppetizersBinding
import com.mikeschvedov.icook.databinding.FragmentHomeBinding

class AppetizersFragment : Fragment() {

    private var _binding: FragmentAppetizersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAppetizersBinding.inflate(inflater, container, false)

        binding.tartar.setOnClickListener {
            setRecipeData("tartar.pdf", "טרטר")
        }

        return binding.root

    }

    private fun setRecipeData(pdfName: String, recipeTitle: String) {
        val myintent = Intent(requireContext(), RecipePrototypeActivity::class.java)

        //SET EXTRAS
        val extras = Bundle()
        //SET PDF NAME
        extras.putString("fileName", pdfName)
        extras.putString("recipe", recipeTitle)

        //PUT EXTRAS BUNDLE INTO INTENT
        myintent.putExtras(extras)
        //START ACTIVITY
        startActivity(myintent)
        activity?.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}