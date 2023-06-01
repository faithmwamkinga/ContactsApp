package com.displaynumbers.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.displaynumbers.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var c1=ContactsData("","Samia","0788266616","samia@gmail.com")
        var c2=ContactsData("","Faith","0788266616","faith@gmail.com")
        var c3=ContactsData("","Joyeuse","0788266616","joyeusekabanyana@gmail.com")
        var c4=ContactsData("","Rose","0788266616","rose@gmail.com")
        var c5=ContactsData("","Angel","0788266616","angel@gmail.com")
        var c6=ContactsData("","Grace","0788266616","grace@gmail.com")
        var c7=ContactsData("","Maddy","0788266616","maddy@gmail.com")
        var c8=ContactsData("","Joan","0788266616","joan@gmail.com")
        var c9=ContactsData("","Rita","0788266616","rita@gmail.com")
        var c10=ContactsData("","Beyonce","0788266616","@gmail.com")
        var c11=ContactsData("","Rihanna","0788266616","rihanna@gmail.com")
        var c12=ContactsData("","Vanessa","0788266616","vanessa@gmail.com")
        var c13=ContactsData("","Purity","0788266616","purity@gmail.com")
        var c14=ContactsData("","Alicia","0788266616","alicia@gmail.com")
        var c15=ContactsData("","Ayrra","0788266616","ayrra@gmail.com")

        var contactistss= listOf<ContactsData>(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactsAdapter=RecyclerViewAdapter(contactistss)
        binding.rvContacts.adapter=contactsAdapter
    }
}