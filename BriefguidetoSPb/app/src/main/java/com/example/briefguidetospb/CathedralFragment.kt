package com.example.briefguidetospb

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class CathedralFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.cathedrals, container, false)
        var listView = view.findViewById<ListView>(R.id.cathedralsListView) as ListView
        var arrCathedral: ArrayList<Cathedral> = ArrayList()

        arrCathedral.add(
            Cathedral(
                "Исаакиевский собор",
                "— крупнейший православный храм Санкт-Петербурга. Расположен на Исаакиевской площади. Кафедральный собор Санкт-Петербургской епархии с 1858 по 1929 год \n" +
                        "С 1928 года имеет статус музея",
                R.drawable.isakievskii_sobor
            )
        )
        arrCathedral.add(
            Cathedral(
                "Владимирский собор",
                "— действующий православный храм на Владимирской площади в Санкт-Петербурге \n" +
                        "Посвящён Владимирской иконе Божией Матери, одной из самых почитаемых на Руси икон",
                R.drawable.vladimirskii_sobor
            )
        )
        arrCathedral.add(
            Cathedral(
                "Петропавловский собор",
                "— православный собор в Санкт-Петербурге в Петропавловской крепости \n" +
                        "С 1733 до 2012 года собор высотой 122,5 м был самым высоким зданием Санкт-Петербурга, а до 1952 года — самым высоким в России",
                R.drawable.petropavlovskiy_sobor
            )
        )
        arrCathedral.add(
            Cathedral(
                "Спас на Крови",
                "— православный мемориальный однопрестольный храм во имя Воскресения Христова; сооружён в память того, что на этом месте 1 марта 1881 года в результате покушения был смертельно ранен император Александр II",
                R.drawable.spas_na_krovi
            )
        )
        arrCathedral.add(
            Cathedral(
                "Казанский собор",
                "— один из крупнейших храмов Санкт-Петербурга. Построен на Невском проспекте в 1801—1811 годах архитектором Андреем Воронихиным \n" +
                        "После Отечественной войны 1812 года приобрёл значение памятника русской воинской славы",
                R.drawable.kazanskiy_sobor
            )
        )


        listView.adapter = CathedralAdapter(this.context as Context, arrCathedral)

        return view

    }
}