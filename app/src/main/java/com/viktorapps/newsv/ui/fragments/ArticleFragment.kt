package com.viktorapps.newsv.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.viktorapps.newsv.R
import com.viktorapps.newsv.ui.NewsActivity
import com.viktorapps.newsv.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}