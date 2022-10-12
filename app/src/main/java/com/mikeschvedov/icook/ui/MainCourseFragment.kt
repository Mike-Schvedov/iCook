package com.mikeschvedov.icook.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mikeschvedov.icook.databinding.FragmentMainCourseBinding

class MainCourseFragment : Fragment() {

    private var _binding: FragmentMainCourseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainCourseBinding.inflate(inflater, container, false)

        binding.gulash.setOnClickListener {
            setRecipeData("gulash.pdf", "גולש")
        }

        binding.spicyFish.setOnClickListener {
            setRecipeData("spicey_fish.pdf", "דגים חריפים")
        }

        binding.memulaim.setOnClickListener {
            setRecipeData("memulaim.pdf", "ממולאים")
        }

        binding.niokiArmonim.setOnClickListener {
            setRecipeData("nioki_armonim.pdf", "ניוקי ערמונים")
        }

        binding.pastaSheryBazil.setOnClickListener {
            setRecipeData("pasta_shery_bazil.pdf", "פסטה שרי ובזיליקום")
        }

        binding.kube.setOnClickListener {
            setRecipeData("kube.pdf", "קובה סלק")
        }

        binding.kuskus.setOnClickListener {
            setRecipeData("kuskus.pdf", "קוסקוס ומרק ירקות")
        }

        binding.rizotoTomato.setOnClickListener {
            setRecipeData("rizototomato.pdf", "ריזוטו עגבניות")
        }

        binding.sweetsourchicken.setOnClickListener {
            setRecipeData("sweetsourchicken.pdf", "עוף חמוץ מתוק")
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