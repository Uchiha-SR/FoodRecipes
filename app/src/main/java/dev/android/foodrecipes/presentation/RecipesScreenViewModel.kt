package dev.android.foodrecipes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.android.foodrecipes.domain.model.Recipe
import dev.android.foodrecipes.domain.usecase.GetRecipesUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class RecipesScreenViewModel @Inject constructor(
    private val recipesUseCase: GetRecipesUseCase
) : ViewModel() {
    val recipes: Flow<PagingData<Recipe>> = Pager(PagingConfig(pageSize = 20)) {
        recipesUseCase
    }.flow.cachedIn(viewModelScope)
}