package com.guzzardo.omfapplication

import android.content.Context

interface Presenter<V> {
    val context: Context //get() = context
    var employeeList: List<Repository.Amiibo>?
    val model: Repository
    fun attachView(view: V)
    fun detachView()
    fun setEmployeeList()
}