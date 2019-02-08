package com.takahashi.leandro.githubaac.di.modules

import com.takahashi.leandro.githubaac.ui.userprofile.UserProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeUserProfileFragment(): UserProfileFragment

}

