package com.example.allassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class menus : AppCompatActivity() {
    private var itemlist = arrayOf("John", "Rachel", "Amy")
    private var listview: ListView? = null
    private var arrayAdapter: ArrayAdapter<String>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)
        val showMenuBtn = findViewById<Button>(R.id.showMenuBtn)
        val selectedTv = findViewById<TextView>(R.id.selectedTv)

        listview = findViewById(R.id.context_list_view)
        arrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_expandable_list_item_1, itemlist)
        listview?.adapter = arrayAdapter
        registerForContextMenu(listview)

        /* code for popup menu */
        val popupMenu = PopupMenu(
            this,
            showMenuBtn
        )

        popupMenu.menu.add(Menu.NONE, 0, 0, "Copy")
        popupMenu.menu.add(Menu.NONE, 1, 1, "Cut")
        popupMenu.menu.add(Menu.NONE, 2, 2, "Paste")
        popupMenu.menu.add(Menu.NONE, 3, 3, "Delete")

        popupMenu.setOnMenuItemClickListener { menuItem ->
            val id = menuItem.itemId

            if(id===0){
                selectedTv.text = "Copy clicked"
            }
            else if(id==1){
                selectedTv.text = "Cut clicked"
            }
            else if(id==2){
                selectedTv.text = "Paste clicked"
            }
            else if(id==3){
                selectedTv.text = "Delete clicked"
            }

            false
        }

        showMenuBtn.setOnClickListener {
            popupMenu.show()
        }



    }
    // Code for contextmenu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ){
        menuInflater.inflate(R.menu.main_menu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_call->{
                Toast.makeText(applicationContext, "Call Menu", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_phone->{
                Toast.makeText(applicationContext, "Phone Menu", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_message->{
                Toast.makeText(applicationContext, "Message Menu", Toast.LENGTH_SHORT).show()
                true
            }
            else-> return super.onContextItemSelected(item)
        }


    }

}