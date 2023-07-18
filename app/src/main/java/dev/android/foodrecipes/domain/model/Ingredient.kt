package dev.android.foodrecipes.domain.model

data class Ingredient(
    val image: String?,
    val name: String,
    val amount: Double,
    val unit: String,
)
