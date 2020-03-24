package com.example.painpatrondemthode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;




    public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Création de l'instance
            AbstractClass lClasse = new PainDeSeigle(); //l'objet est de type ConcreteClasse par abstractClasse

            // Appel de la méthode définie dans AbstractClasse
            lClasse.operationTemplate(50);

            AbstractClass lClasse2 = new PainDeCampagne();

            lClasse2.operationTemplate(2);//il y aura pas le meme affichage car ca va utiliser la redéfinition des opeAbs1 et 2 de la classe concreteB

            //Création de 4 objets TextView correspond au 4 id text_view
            TextView textView = (TextView) findViewById(R.id.text_view);
            TextView textView2 = (TextView) findViewById(R.id.text_view2);
            TextView textView3 = (TextView) findViewById(R.id.text_view3);
            TextView textView4 = (TextView) findViewById(R.id.text_view4);

            textView.setText(new StringBuilder()
                    .append("Informations sur le pain de seigle:")
                    .toString());


            textView2.setText(new StringBuilder()
                    .append(lClasse.operationTemplate(2))
                    .toString());


            textView3.setText(new StringBuilder()
                    .append("Informations sur le pain de campagne:")
                    .toString());

            textView4.setText(new StringBuilder()
                    .append(lClasse2.operationTemplate(50))
                    .toString());

        }

    }



