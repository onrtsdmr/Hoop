package io.androidedu.hoop.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "CallsList")
data class HoopCallsInfoEntity (

    @PrimaryKey(autoGenerate = true) val id : Int =0,

    @ColumnInfo(name = "profilePhoto") val profilePhoto : Int,

    @ColumnInfo(name = "userName") val userName : String,

    @ColumnInfo(name = "callTypeIcon") val callTypeIcon : Int,

    @ColumnInfo(name = "date") val date : String,

    @ColumnInfo(name = "time") val time : String,

    @ColumnInfo(name = "voiceCall") val voiceCall : Int
)