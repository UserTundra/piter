package com.example.briefguidetospb

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class PetergophFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.petergoph, container, false)
        var listView = view.findViewById<ListView>(R.id.petergophListView) as ListView
        var arrPetergoph: ArrayList<Petergoph> = ArrayList()

        arrPetergoph.add(
            Petergoph(
                "Верхний сад",
                "— часть дворцово-паркового ансамбля «Петергоф». Располагается в Петергофе между Санкт-Петербургским проспектом и Большим Петергофским дворцом \n" +
                        "Адрес: Разводная ул., 2, Петергоф, Санкт-Петербург, 198516",
                R.drawable.verhnii_park
            )
        )
        arrPetergoph.add(
            Petergoph(
                "Большой дворец",
                "— первый и наиболее крупный архитектурный памятник дворцово-паркового ансамбля Ораниенбаум в городе Ломоносов \n" +
                        "Адрес: Дворцовый пр., 46, Ломоносов, Санкт-Петербург, 198412",
                R.drawable.oranienbaum
            )
        )
        arrPetergoph.add(
            Petergoph(
                "Монплезир",
                "— дворец в Петергофе, памятник архитектуры начала XVIII века. Дворец был построен по личному указанию Петра I в 1714—1723 годы  \n" +
                        "Адрес: Разводная ул., д. 2, Петергоф, Санкт-Петербург, 198510",
                R.drawable.monplezir
            )
        )
        arrPetergoph.add(
            Petergoph(
                "Марли",
                "— миниатюрный павильон-дворец в западной части Нижнего парка дворцово-паркового ансамбля Петергоф \n" +
                        "Адрес: Разводная улица, 2, Петергоф, Ленинградская обл., 198516",
                R.drawable.marli
            )
        )
        arrPetergoph.add(
            Petergoph(
                "Шахматная гора",
                "— один из каскадов Дворцово-паркового ансамбля Петергоф. Другие названия: «Малый грот», «Руинный каскад», «Драконов каскад» \n" +
                        "Адрес: Александрийское ш., 7, Петергоф, Санкт-Петербург, 198510",
                R.drawable.shakhmatnaya_gora
            )
        )

        listView.adapter = PetergophAdapter(this.context as Context, arrPetergoph)

        return view

    }
}