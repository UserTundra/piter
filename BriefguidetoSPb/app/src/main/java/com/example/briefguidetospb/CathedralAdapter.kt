package com.example.briefguidetospb

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CathedralAdapter(var context: Context, var cathedral: ArrayList<Cathedral>) : BaseAdapter()  {

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var txtAdd: TextView
        var ivImage: ImageView

        init {
            this.txtName = row?.findViewById(R.id.piter_name) as TextView
            this.txtAdd = row?.findViewById(R.id.piter_add) as TextView
            this.ivImage = row?.findViewById(R.id.piter_pict) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if(convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.piter_list, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var cathedral: Cathedral = getItem(position) as Cathedral
        viewHolder.txtName.text = cathedral.name
        viewHolder.txtAdd.text = cathedral.add
        viewHolder.ivImage.setImageResource(cathedral.image)

        return  view as View

    }

    override fun getItem(position: Int): Any {
        return cathedral.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

        override fun getCount(): Int {
        return  cathedral.count()
    }
}