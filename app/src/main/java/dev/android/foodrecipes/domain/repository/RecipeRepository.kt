package dev.android.foodrecipes.domain.repository

import dev.android.foodrecipes.data.dto.RecipeDetailsDto
import dev.android.foodrecipes.domain.model.RecipesResponse

interface RecipeRepository {
    suspend fun fetchRecipes(offset: Int): RecipesResponse

    suspend fun fetchRecipesDetails(id: Int): RecipeDetailsDto

    suspend fun getRecipeDetails(id: Int): RecipeDetailsDto?

    suspend fun cacheRecipeDetails(recipeDetails: RecipeDetailsDto)
}