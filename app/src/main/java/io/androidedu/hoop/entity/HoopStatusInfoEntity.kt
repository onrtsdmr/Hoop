package io.androidedu.hoop.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "StatusList")
data class HoopStatusInfoEntity (

    @PrimaryKey(autoGenerate = true) val id : Int =0,

    @ColumnInfo(name = "profilePhoto") val profilePhoto : Int,

    @ColumnInfo(name = "userName") val userName : String,

    @ColumnInfo(name = "time") val time : String


)