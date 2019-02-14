package com.takahashi.leandro.githubaac.di.modules

import android.app.Application
import android.arch.persistence.room.Room
import com.takahashi.leandro.githubaac.data.dao.UserDAO
import com.takahashi.leandro.githubaac.data.local.MeuBancoDeDados
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(application: Application): MeuBancoDeDados {
        return Room.databaseBuilder(
                application,
                MeuBancoDeDados::class.java, "MyDatabase.db"
        )
                .build()
    }

    @Provides
    @Singleton
    fun provideUserDao(database: MeuBancoDeDados): UserDAO {
        return database.userDao()
    }
}