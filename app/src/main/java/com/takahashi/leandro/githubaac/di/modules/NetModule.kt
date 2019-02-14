package com.takahashi.leandro.githubaac.di.modules

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.takahashi.leandro.githubaac.BuildConfig
import com.takahashi.leandro.githubaac.data.remote.UserWebService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetModule{

    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    fun provideRetrofit(gson: Gson, @Named("githubURL") githubURL: String, @Named("okhttp") okhttp: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(githubURL)
                .client(okhttp)
                .build()
    }

    @Provides
    @Singleton
    @Named("okhttp")
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .build()
    }
    @Provides
    @Singleton
    @Named ("githubURL")
    fun provideGithubURL() : String {
        return BuildConfig.GITHUB_URL
    }

    @Provides
    @Singleton
    fun provideApiWebservice(restAdapter: Retrofit): UserWebService {
        return restAdapter.create(UserWebService::class.java)
    }

}