package com.example.newsappmvvm

import com.example.newsappmvvm.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)