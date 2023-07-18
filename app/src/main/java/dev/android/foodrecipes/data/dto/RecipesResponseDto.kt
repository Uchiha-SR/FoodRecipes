package dev.android.foodrecipes.data.dto

import dev.android.foodrecipes.domain.model.RecipesResponse

data class RecipesResponseDto (
    val number: Int,
    val offset: Int,
    val results: List<RecipeDto>,
    val totalResults: Int
    )

fun RecipesResponseDto.toRecipesResponse(): RecipesResponse {
    return RecipesResponse(
        offset = offset,
        results = results.map { item -> item.toRecipe() },
    )
}

