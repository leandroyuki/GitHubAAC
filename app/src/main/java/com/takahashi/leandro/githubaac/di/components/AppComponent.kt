package com.takahashi.leandro.githubaac.di.components

import android.app.Application
import com.takahashi.leandro.githubaac.MyApp
import com.takahashi.leandro.githubaac.di.modules.ActivityModule
import com.takahashi.leandro.githubaac.di.modules.AppModule
import com.takahashi.leandro.githubaac.di.modules.FragmentModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [AndroidSupportInjectionModule::class, ActivityModule::class, FragmentModule::class, AppModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApp)
}
