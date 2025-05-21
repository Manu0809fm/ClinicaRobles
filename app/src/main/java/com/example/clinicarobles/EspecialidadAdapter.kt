package com.example.clinicarobles
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class EspecialidadAdapter(private val lista: List<Especialidad>) :
    RecyclerView.Adapter<EspecialidadAdapter.EspecialidadViewHolder>() {

    inner class EspecialidadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtNombre: TextView = itemView.findViewById(R.id.txtNombre)
        val txtMedico: TextView = itemView.findViewById(R.id.txtMedico)
        val txtHorario: TextView = itemView.findViewById(R.id.txtHorario)
        val imagen: ImageView = itemView.findViewById(R.id.imagenEspecialidad)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EspecialidadViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_especialidad, parent, false)
        return EspecialidadViewHolder(view)
    }

    override fun onBindViewHolder(holder: EspecialidadViewHolder, position: Int) {
        val especialidad = lista[position]
        holder.txtNombre.text = especialidad.nombre
        holder.txtMedico.text = especialidad.medico
        holder.txtHorario.text = especialidad.horario
        holder.imagen.setImageResource(especialidad.imagenResId)
    }

    override fun getItemCount(): Int = lista.size
}

