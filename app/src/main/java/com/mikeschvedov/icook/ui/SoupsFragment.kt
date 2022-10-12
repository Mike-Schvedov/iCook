package com.mikeschvedov.icook.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mikeschvedov.icook.R
import com.mikeschvedov.icook.databinding.FragmentAppetizersBinding
import com.mikeschvedov.icook.databinding.FragmentSoupsBinding


class SoupsFragment : Fragment() {

    private var _binding: FragmentSoupsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSoupsBinding.inflate(inflater, container, false)

        binding.orangeSoup.setOnClickListener {
            setRecipeData("orange_soup.pdf", "מרק כתום")
        }

        binding.peaSoup.setOnClickListener {
            setRecipeData("pea_soup.pdf", "מרק אפונה")
        }

        binding.tomkagaiSoup.setOnClickListener {
            setRecipeData("tomkagai_soup.pdf", "טום קה גאי")
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