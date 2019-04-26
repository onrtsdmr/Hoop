package io.androidedu.hoop.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import io.androidedu.hoop.entity.HoopCallsInfoEntity
import io.androidedu.hoop.entity.HoopInfoEntity
import io.androidedu.hoop.entity.HoopStatusInfoEntity


@Dao
interface HoopInfoDao{

    @Query("SELECT * from ChatList")
    fun getChatAll(): List<HoopInfoEntity>


   @Query("SELECT * from StatusList")
   fun getStatusAll(): List<HoopStatusInfoEntity>


   @Query("SELECT * from CallsList")
    fun getCallsAll(): List<HoopCallsInfoEntity>

    @Insert(onConflict = REPLACE)
    fun insertChat(chatData: HoopInfoEntity)

    @Query("DELETE from ChatList")
    fun deleteChatAll()

}