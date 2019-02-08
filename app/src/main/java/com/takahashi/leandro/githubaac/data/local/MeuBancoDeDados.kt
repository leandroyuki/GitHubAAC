package com.takahashi.leandro.githubaac.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverter
import android.arch.persistence.room.TypeConverters
import com.takahashi.leandro.githubaac.data.dao.UserDAO
import com.takahashi.leandro.githubaac.data.local.converter.DateConverter
import com.takahashi.leandro.githubaac.data.local.entity.User

@Database(entities=[User::class],version = 1)
@TypeConverters(DateConverter::class)
abstract class MeuBancoDeDados: RoomDatabase() {
    abstract fun userDao(): UserDAO

    companion object {
        val INSANCE: MeuBancoDeDados? = null
    }
}