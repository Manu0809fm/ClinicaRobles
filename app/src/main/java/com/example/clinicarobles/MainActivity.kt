package com.example.clinicarobles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptador: EspecialidadAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewEspecialidades)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listaEspecialidades = listOf(
            Especialidad("Traumatologia", "Dr. Alberto Garcia Cerna", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Cirugia Cardiovascular", "Dr. Romel Zamudio Silva", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Cirugia General", "Dr. Beto Miranda Sevillano", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Dermatologia", "Dr. Jaime Vega Chavez", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Endocrinologia", "Dr. Juan Pinto Sanchez", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),

            Especialidad("Pediatría", "Dr. Marcos Vasquez Tantas", "Lunes a Viernes 8am-2pm", R.drawable.pediatria),
            Especialidad("Cardiología", "Dr. Roberto Chavezta Bernal", "Lunes a Viernes 10am-4pm", R.drawable.cardiologia),
            Especialidad("Ginecología", "Dra. Yulissa Paredes Padilla", "Martes y Jueves 9am-1pm", R.drawable.ginecologia),
            Especialidad("Medicina General", "Dr. Elwis Laveriano Hoyos", "Todos los días 8am-6pm", R.drawable.general)
        )

        adaptador = EspecialidadAdapter(listaEspecialidades)
        recyclerView.adapter = adaptador
    }
}

