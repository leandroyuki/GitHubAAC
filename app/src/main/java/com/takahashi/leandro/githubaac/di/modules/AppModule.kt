package com.takahashi.leandro.githubaac.di.modules

import android.app.Application
import android.arch.persistence.room.Room
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.takahashi.leandro.githubaac.data.UserRepository
import com.takahashi.leandro.githubaac.data.dao.UserDAO
import com.takahashi.leandro.githubaac.data.local.MeuBancoDeDados
import com.takahashi.leandro.githubaac.data.remote.UserWebService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideExecutor(): Executor {
        return Executors.newSingleThreadExecutor()
    }
}

