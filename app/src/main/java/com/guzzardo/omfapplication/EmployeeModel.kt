package com.guzzardo.omfapplication

import android.content.Context

interface EmployeeModel {
    val dataLoaded : Boolean //get() = dataLoaded
    val employeeList: List<Repository.Amiibo>? //get() = employeeList
    fun setEmployeeList()
    fun getEmployee(employeeId: String?): Repository.Amiibo?
    fun setContext(context: Context)
}