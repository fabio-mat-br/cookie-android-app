package com.recipe.cookie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtRecipe.setText("Ingredientes\n" +
                "\n" +
                "1 xícara de manteiga ou 130g\n" +
                "\n" +
                "1 col. (sopa) de açúcar refinado\n" +
                "\n" +
                "1 xícara de açúcar mascavo\n" +
                "\n" +
                "2 ovos\n" +
                "\n" +
                "¾ de xícara de farinha branca\n" +
                "\n" +
                "¼ de xícara de farinha integral\n" +
                "\n" +
                "¼ de xícara de aveia em flocos\n" +
                "\n" +
                "1 tablete de chocolate meio amargo\n" +
                "\n" +
                "1 colher (sobremesa) de fermento em pó\n" +
                "\n" +
                "½ colher de chá de sal\n" +
                "\n" +
                "\n" +
                "\n" +
                "Modo de preparo\n" +
                "\n" +
                "Aqueça o forno à temperatura de 220º C\n" +
                "\n" +
                "Misture a manteiga, açúcares, ovos até ficar homogêneo. Adicione a farinha e continue misturando. Em seguida adicione o chocolate picado. Após, misture o fermento e mexa, e por último o sal.\n" +
                "\n" +
                "Coloque em forma untada com a ajuda de uma colher faça pequenas porções e deixe um espaço entre elas. Asse até ficar dourado (cerca de 12 minutos).\n" +
                "\n"

        )

    }
}
