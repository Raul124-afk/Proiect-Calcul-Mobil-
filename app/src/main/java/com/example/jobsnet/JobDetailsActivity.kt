package com.example.jobsnet

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class JobDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_job_details)

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.detailsRoot)
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

        val titlu = intent.getStringExtra("job_title")
            ?: "Job fără titlu"

        val descriere = intent.getStringExtra("job_description")
            ?: "Descriere indisponibilă."

        findViewById<TextView>(R.id.jobTitle).text = titlu

        findViewById<TextView>(R.id.jobDescription).text = descriere

        findViewById<Button>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}