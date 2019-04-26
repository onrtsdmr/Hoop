package io.androidedu.hoop.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import io.androidedu.hoop.entity.HoopInfoEntity
import io.androidedu.hoop.model.ChatModel


@Dao
interface HoopInfoDao{

    @Query("SELECT * from ChatList")
    fun getChatAll(): List<ChatModel>

    @Insert(onConflict = REPLACE)
    fun insertChat(chatData: HoopInfoEntity)

    @Query("DELETE from ChatList")
    fun deleteChatAll()

}