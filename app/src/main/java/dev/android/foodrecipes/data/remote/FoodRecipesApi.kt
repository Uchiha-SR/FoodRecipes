package dev.android.foodrecipes.data.remote

import dev.android.foodrecipes.data.dto.RecipeDetailsDto
import dev.android.foodrecipes.data.dto.RecipesResponseDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodRecipesApi {
    @GET("complexSearch")
    suspend fun getRandomRecipes(@Query("offset") pageNumber: Int): RecipesResponseDto

    @GET("/recipes/{id}/information")
    suspend fun getRecipeDetails(@Path("id") id: Int): RecipeDetailsDto


}