package com.udaychugh.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class todomodel(

        var title:String,
        var description:String,
        var category:String,
        var date:Long,
        var time:Long,
        var isFinish : Int = -1,
        @PrimaryKey(autoGenerate = true)
        var id:Long = 0

)
