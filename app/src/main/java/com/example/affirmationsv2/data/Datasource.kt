package com.example.affirmationsv2.data

import com.example.affirmationsv2.R
import com.example.affirmationsv2.model.Affirmation

class Datasource {
    fun loadAffirmations() : List<Affirmation>{
        return listOf(Affirmation(R.string.Affirmation1, R.drawable.image1),
            Affirmation(R.string.Affirmation2, R.drawable.image1),
            Affirmation(R.string.Affirmation3, R.drawable.image1),
            Affirmation(R.string.Affirmation4, R.drawable.image1),
            Affirmation(R.string.Affirmation5, R.drawable.image1),
            Affirmation(R.string.Affirmation6, R.drawable.image1),
            Affirmation(R.string.Affirmation7, R.drawable.image1),
            Affirmation(R.string.Affirmation8, R.drawable.image1),
            Affirmation(R.string.Affirmation9, R.drawable.image1),
            Affirmation(R.string.Affirmation10, R.drawable.image1))
    }
}