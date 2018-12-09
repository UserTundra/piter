package com.example.briefguidetospb

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class BridgeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.bridges, container, false)
        var listView = view.findViewById<ListView>(R.id.bridgesListView) as ListView
        var arrBridge: ArrayList<Bridge> = ArrayList()

        arrBridge.add(
                Bridge(
                    "Дворцовый мост",
                    "— разводной мост через реку Неву в Санкт-Петербурге. Соединяет центральную часть города и Васильевский остров \n " +
                            "260 м",
                    R.drawable.dvorzovii_most
                )
        )
        arrBridge.add(
            Bridge(
                "Троицкий мост",
                "— разводной мост через Неву в Санкт-Петербурге. Соединяет между собой Петроградский и 1-й Адмиралтейский острова. Третий постоянный мост через Неву, один из красивейших петербургских мостов \n" +
                        "582 м",
                R.drawable.troitskii_most
            )
        )
        arrBridge.add(
            Bridge(
                "Благовещенский мост",
                "— разводной мост через Неву в Санкт-Петербурге. Соединяет между собой Васильевский и 2-й Адмиралтейский острова. Первый постоянный мост через Неву \n" +
                        "331 м",
                R.drawable.blagoveshenskii_most
            )
        )
        arrBridge.add(
            Bridge(
                "Мост Александра Невского",
                "— разводной мост через Неву в Санкт-Петербурге. Соединяет центральную часть города и правый берег Невы, самый крупный мост из предварительно напряженного железобетона в городе \n" +
                        "906 м",
                R.drawable.nevskogo_most
            )
        )
        arrBridge.add(
            Bridge(
                "Аничков мост",
                "—  мост через реку Фонтанку в Центральном районе Санкт-Петербурга, соединяющий Спасский и Безымянный острова. Один из самых известных мостов Санкт-Петербурга \n" +
                        "55 м",
                R.drawable.anichkov_most
            )
        )

        listView.adapter = BridgeAdapter(this.context as Context, arrBridge)

        return view

    }
}