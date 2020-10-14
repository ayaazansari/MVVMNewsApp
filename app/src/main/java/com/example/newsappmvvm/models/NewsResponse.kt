package com.example.newsappmvvm.models

import com.example.newsappmvvm.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)