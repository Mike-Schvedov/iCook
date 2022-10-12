package com.mikeschvedov.icook.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.mikeschvedov.icook.R
import com.mikeschvedov.icook.databinding.ActivityMainBinding
import com.mikeschvedov.icook.databinding.ActivityRecipePrototypeBinding

class RecipePrototypeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecipePrototypeBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityRecipePrototypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide();

        val extras = intent.extras
        val pdfFileName = extras!!.getString("fileName")
        val recipeTitle = extras.getString("recipe")
        setData(pdfFileName, recipeTitle)
    }

    private fun setData(fileName: String?, dreamTitle: String?) {
        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset(fileName).load()
        binding.txtDreamname.text = dreamTitle
    }
}