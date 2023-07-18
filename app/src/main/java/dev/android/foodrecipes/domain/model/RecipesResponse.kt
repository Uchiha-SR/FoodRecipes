package dev.android.foodrecipes.domain.model

data class RecipesResponse(
    val offset: Int,
    val results: List<Recipe>,
)
