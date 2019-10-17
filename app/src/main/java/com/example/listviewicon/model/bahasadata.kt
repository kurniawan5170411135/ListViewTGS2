package com.example.listviewicon.model

import com.example.listviewicon.R

object bahasadata {

    private val bahasaName = arrayOf(
        "Ruby",
        "Rails",
        "Phyton",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby adalah bahasa pemrograman",
        "Rails adalah bahasa pemrograman",
        "Phyton adalah bahasa pemrograman",
        "Java Script adalah bahasa pemrograman",
        "PHP adalah bahasa pemrograman"
    )

    private val bahasaPoster = intArrayOf(
        R.drawable.rubi,
        R.drawable.rai,
        R.drawable.piton,
        R.drawable.js,
        R.drawable.php
    )

    val listbahasa: ArrayList<bahasa>
        get() {
            val list = arrayListOf<bahasa>()
            for (position in bahasaName.indices) {
                val bahasa = bahasa()
                bahasa.name =  bahasaName[position]
                bahasa.detail = detail[position]
                bahasa.poster = bahasaPoster[position]
                list.add(bahasa)
            }
            return list
        }
}