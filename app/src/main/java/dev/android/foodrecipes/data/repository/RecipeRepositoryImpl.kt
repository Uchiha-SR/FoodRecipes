package dev.android.foodrecipes.data.repository

import dev.android.foodrecipes.data.dto.RecipeDetailsDto
import dev.android.foodrecipes.data.dto.toRecipesResponse
import dev.android.foodrecipes.data.local.RecipeDetailsDao
import dev.android.foodrecipes.data.remote.FoodRecipesApi
import dev.android.foodrecipes.domain.model.RecipesResponse
import dev.android.foodrecipes.domain.repository.RecipeRepository
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
    private val api: FoodRecipesApi,
    private val recipeDetailsDao: RecipeDetailsDao
): RecipeRepository{
    override suspend fun fetchRecipes(offset: Int): RecipesResponse {
        return api.getRandomRecipes(offset).toRecipesResponse()
    }

    override suspend fun fetchRecipesDetails(id: Int): RecipeDetailsDto {
        return api.getRecipeDetails(id)
    }

    override suspend fun getRecipeDetails(id: Int): RecipeDetailsDto? {
        return recipeDetailsDao.getRecipeDetails(id)
    }

    override suspend fun cacheRecipeDetails(recipeDetails: RecipeDetailsDto) {
        recipeDetailsDao.cacheRecipeDetails(recipeDetails)
    }
}