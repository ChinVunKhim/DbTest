package com.example.dbtest.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ProgrammeDAO {

    @Query("SELECT * FROM programme")
    fun getAll(): List<Programme>


    @Insert
    fun insert(vararg p: Programme)

}

