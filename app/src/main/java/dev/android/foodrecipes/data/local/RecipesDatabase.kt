package dev.android.foodrecipes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.android.foodrecipes.data.dto.RecipeDetailsDto


@Database(
    entities = [RecipeDetailsDto::class],
    version = 1,
    exportSchema = true
)
abstract class RecipesDatabase: RoomDatabase(){
    abstract fun recipeDetailsDao(): RecipeDetailsDao
}