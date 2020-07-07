package com.viktorapps.newsv.repository

import com.viktorapps.newsv.api.RetrofitInstance
import com.viktorapps.newsv.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}