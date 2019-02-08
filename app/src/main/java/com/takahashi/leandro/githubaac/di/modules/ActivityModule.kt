package com.takahashi.leandro.githubaac.di.modules

import com.takahashi.leandro.githubaac.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = arrayOf(FragmentModule::class))
    internal abstract fun contributeMainActivity(): MainActivity
}

