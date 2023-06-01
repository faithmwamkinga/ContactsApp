package com.displaynumbers.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.displaynumbers.contactsapp.databinding.ActivityMainBinding
import com.displaynumbers.contactsapp.databinding.ContactListBinding


class RecyclerViewAdapter (var contactList:List<ContactsData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactss=contactList[position]
        holder.binding.apply {
            tvName.text=contactss.name
            tvPhoneNumber.text=contactss.phoneNumber
            tvEmail.text=contactss.email
        }

    }

    override fun getItemCount(): Int {
    return contactList.size
    }
}
class ContactViewHolder(var binding:ContactListBinding):RecyclerView.ViewHolder(binding.root){

}
