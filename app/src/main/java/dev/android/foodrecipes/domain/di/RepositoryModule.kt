package dev.android.foodrecipes.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.android.foodrecipes.data.local.RecipeDetailsDao
import dev.android.foodrecipes.data.remote.FoodRecipesApi
import dev.android.foodrecipes.data.repository.RecipeRepositoryImpl
import dev.android.foodrecipes.domain.repository.RecipeRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideRecipeRepository(
        api: FoodRecipesApi, recipeDetailsDao: RecipeDetailsDao
    ): RecipeRepository {
        return RecipeRepositoryImpl(api, recipeDetailsDao)
    }
}