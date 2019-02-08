package com.takahashi.leandro.githubaac.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.takahashi.leandro.githubaac.di.key.ViewModelKey
import com.takahashi.leandro.githubaac.ui.userprofile.UserProfileViewModel
import com.takahashi.leandro.githubaac.utils.FactoryViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserProfileViewModel::class)
    abstract fun bindUserProfileViewModel(repoViewModel: UserProfileViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: FactoryViewModel): ViewModelProvider.Factory
}