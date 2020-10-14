package com.example.newsappmvvm.db

import Article
import androidx.lifecycle.LiveData
import androidx.room.*
import retrofit2.http.Query


@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @androidx.room.Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}