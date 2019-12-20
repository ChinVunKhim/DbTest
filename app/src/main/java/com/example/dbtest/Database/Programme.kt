package com.example.dbtest.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="programme")
class Programme(val _code:String, val _description:String) {

    @PrimaryKey
    var pCode:String = _code

    @ColumnInfo(name = "description")
    var pDescription:String = _description
}