package com.shubhamtripz.brushit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_tshirt_order.*

class TshirtOrderActivity : AppCompatActivity() {

    lateinit var mAlertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tshirt_order)

      bookbtn.setOnClickListener {

          val builder = AlertDialog.Builder(this)

          // Set the message show for the Alert time
          builder.setMessage("You will shortly recive a call & mail to confirm order")

          // Set Alert Title
          builder.setTitle("Booked Successfully !")

          // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
          builder.setCancelable(false)

          // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
          builder.setPositiveButton("OK") {
              // When the user click yes button then app will close
                  dialog, which -> finish()
          }


          // Create the Alert dialog
          val alertDialog = builder.create()
          // Show the Alert Dialog box
          alertDialog.show()

      }


    }
}