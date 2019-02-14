package com.takahashi.leandro.githubaac.di.modules

import android.arch.persistence.room.Database
import com.takahashi.leandro.githubaac.data.UserRepository
import com.takahashi.leandro.githubaac.data.dao.UserDAO
import com.takahashi.leandro.githubaac.data.remote.UserWebService
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module(includes = [
    NetModule::class,
    DatabaseModule::class,
    AppModule::class])
class RepositoryModule{
    @Provides
    @Singleton
    fun provideUserRepository(
            webservice: UserWebService,
            userDao: UserDAO,
            executor: Executor
    ): UserRepository {
        return UserRepository(webservice, userDao, executor)
    }
}