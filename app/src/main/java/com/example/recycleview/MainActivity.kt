package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mangalist = listOf<Manga>(
            Manga(
                R.drawable.aot,
                "Shingeki no Kyojin",
                "Centuries ago, mankind was slaughtered to near extinction by monstrous " +
                        "humanoid creatures called Titans, forcing humans to hide in fear behind " +
                        "enormous concentric walls. What makes these giants truly terrifying is " +
                        "that their taste for human flesh is not born out of hunger but what appears " +
                        "to be out of pleasure. To ensure their survival, the remnants of humanity "
            ),
            Manga(
                R.drawable.darlingin,
                "DARLING in the FRANXX",
                "In the distant future, humanity has been driven to near-extinction by " +
                        "giant beasts known as Klaxosaurs, forcing the surviving humans to take refuge " +
                        "in massive fortress cities called Plantations."
            ),
            Manga(
                R.drawable.sao,
                "Sword Art Online",
                "Ever since the release of the innovative NerveGear, gamers from all around the globe have been given the opportunity to experience a completely immersive virtual reality. "
            ),
            Manga(
                R.drawable.hikyuu,
                "Haikyuu!!",
                "Ever since having witnessed the \"Little Giant\" and his astonishing skills on the volleyball court, Shouyou Hinata has been bewitched by the dynamic nature of the sport."
            ),
            Manga(
                R.drawable.fategobabylon,
                "Fate/Grand Order - Absolute Demonic Front: Babylonia",
                "A.D. 2016, the foundations of humanity have been incinerated by the Mage King Solomon. Chaldea, a secret mages organization with the mission to preserve humanity's future, foresaw mankind's extinction in 2015. "
            ),
            Manga(
                R.drawable.yurucamp,
                "Yuru Camp△",
                "While the perfect getaway for most girls her age might be a fancy vacation with their loved ones, Rin Shima's ideal way of spending her days off is camping alone at the base of Mount Fuji."
            ),
            Manga(
                R.drawable.jujutsu,
                "Jujutsu Kaisen",
                "Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. "
            ),
            Manga(
                R.drawable.noragami,
                "Noragami",
                "In times of need, if you look in the right place, you just may see a strange telephone number scrawled in red. If you call this number, you will hear a young man introduce himself as the Yato God."
            ),
            Manga(
                R.drawable.konosuba,
                "Kono Subarashii Sekai ni Shukufuku wo!",
                "After dying a laughable and pathetic death on his way back from buying a game, high school student and recluse Kazuma Satou finds himself sitting before a beautiful but obnoxious goddess named Aqua. "
            ),
            Manga(
                R.drawable.naruto,
                "Naruto: Shippuuden",
                "It has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for intense training following events which fueled his desire to be stronger. "
            ),
            Manga(
                R.drawable.onepunch,
                "One Punch Man",
                "The seemingly unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, Saitama relentlessly trained for three years, losing all of his hair in the process."
            ),
            Manga(
                R.drawable.tokyoghoul,
                "Tokyo Ghoul:re",
                "Two years have passed since the CCG's raid on Anteiku. Although the atmosphere in Tokyo has changed drastically due to the increased influence of the CCG, ghouls continue to pose a problem as they have begun taking caution, especially the terrorist organization Aogiri Tree, who acknowledge the CCG's growing threat to their existence."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_manga)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MangaAdapter(this, mangalist){
            val intent = Intent(this, DetailMangaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}