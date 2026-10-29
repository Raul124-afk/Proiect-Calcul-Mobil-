package com.example.jobsnet

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { view, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )

            view.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        val joburi = listOf(
            "Programator Android Junior — Cluj-Napoca",
            "Dezvoltator Web — București",
            "Tester Software — Remote",
            "Inginer IT — Baia Mare",
            "Administrator Rețea — Timișoara"
        )

        val listaJoburi = findViewById<ListView>(R.id.jobListView)

        val adaptor = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            joburi
        ) {
            override fun getView(
                position: Int,
                convertView: View?,
                parent: ViewGroup
            ): View {
                val rand = super.getView(
                    position,
                    convertView,
                    parent
                ) as TextView

                rand.setTextColor(Color.parseColor("#17202A"))
                rand.textSize = 17f

                return rand
            }
        }

        listaJoburi.adapter = adaptor

        listaJoburi.setOnItemClickListener { _, _, position, _ ->

            val descriere = when (position) {
                0 -> """
                    Companie: Demo Mobile
                    Locație: Cluj-Napoca
                    Program: Full-time
                    Nivel: Junior

                    Descriere:
                    Vei participa la dezvoltarea unor aplicații Android.

                    Cerințe:
                    • Cunoștințe de bază Kotlin.
                    • Familiarizare cu Android Studio.
                    • Dorință de învățare și lucru în echipă.

                    Responsabilități:
                    • Construirea ecranelor aplicației.
                    • Testarea funcționalităților.
                    • Corectarea erorilor.
                """.trimIndent()

                1 -> """
                    Companie: Demo Web
                    Locație: București
                    Program: Full-time
                    Nivel: Junior

                    Descriere:
                    Vei realiza și întreține pagini web.

                    Cerințe:
                    • HTML, CSS și JavaScript.
                    • Cunoștințe de bază Git.

                    Responsabilități:
                    • Implementarea interfețelor web.
                    • Adaptarea paginilor pentru telefon.
                    • Corectarea problemelor de afișare.
                """.trimIndent()

                2 -> """
                    Companie: Demo Quality
                    Locație: Remote
                    Program: Full-time
                    Nivel: Junior

                    Descriere:
                    Vei testa aplicații și vei raporta problemele găsite.

                    Cerințe:
                    • Atenție la detalii.
                    • Gândire logică.
                    • Comunicare clară.

                    Responsabilități:
                    • Pregătirea scenariilor de testare.
                    • Verificarea funcționalităților.
                    • Documentarea erorilor.
                """.trimIndent()

                3 -> """
                    Companie: Demo Systems
                    Locație: Baia Mare
                    Program: Full-time
                    Nivel: Junior

                    Descriere:
                    Vei oferi suport pentru echipamentele IT ale companiei.

                    Cerințe:
                    • Cunoștințe despre calculatoare.
                    • Noțiuni de sisteme de operare.
                    • Capacitate de rezolvare a problemelor.

                    Responsabilități:
                    • Instalarea programelor.
                    • Diagnosticarea problemelor tehnice.
                    • Asistență pentru utilizatori.
                """.trimIndent()

                else -> """
                    Companie: Demo Networks
                    Locație: Timișoara
                    Program: Full-time
                    Nivel: Junior

                    Descriere:
                    Vei participa la administrarea rețelei companiei.

                    Cerințe:
                    • Noțiuni despre TCP/IP.
                    • Cunoștințe despre routere și switch-uri.
                    • Atenție la securitate.

                    Responsabilități:
                    • Configurarea echipamentelor de rețea.
                    • Monitorizarea conexiunilor.
                    • Identificarea problemelor de conectivitate.
                """.trimIndent()
            }

            val intentDetalii = Intent(
                this,
                JobDetailsActivity::class.java
            )

            intentDetalii.putExtra("job_title", joburi[position])
            intentDetalii.putExtra("job_description", descriere)

            startActivity(intentDetalii)
        }
    }
}