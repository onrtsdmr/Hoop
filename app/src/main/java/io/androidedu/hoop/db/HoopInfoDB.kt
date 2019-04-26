package io.androidedu.hoop.db
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.androidedu.hoop.dao.HoopInfoDao
import io.androidedu.hoop.entity.HoopInfoEntity

@Database(entities = [HoopInfoEntity::class], version = 1)
abstract class HoopInfoDB : RoomDatabase() {

    abstract fun getHoopInfoDao(): HoopInfoDao

    companion object {
        private var INSTANCE: HoopInfoDB? = null

        fun getInstance(context: Context): HoopInfoDB? {
            if (INSTANCE == null) {
                synchronized(HoopInfoDB::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        HoopInfoDB::class.java, "hoop_ınfo_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}