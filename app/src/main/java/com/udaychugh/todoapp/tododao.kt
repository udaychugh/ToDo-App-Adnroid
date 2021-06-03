package com.udaychugh.todoapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface tododao {
    @Insert()
    suspend fun insertTask(todoModel: todomodel): Long

    @Query("Select * from todomodel where isFinish == 0")
    fun getTask(): LiveData<List<todomodel>>


    @Query("Update todomodel set isFinish = 1 where id=:uid")
    fun finishTask(uid: Long)


    @Query("Delete from todomodel where id=:uid")
    fun deleteTask(uid: Long)

}