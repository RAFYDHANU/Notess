package com.example.notess.repository

import androidx.lifecycle.LiveData
import com.example.notess.data.ToDoDao
import com.example.notess.model.ToDoData

class ToDoRepository(private val todoDao: ToDoDao) {
    val getALlData: LiveData<List<ToDoData>> = todoDao.getAllData()
    val sortByHighPriority: LiveData<List<ToDoData>> = todoDao.sortByHighPriority()
    val sortByLowPriority: LiveData<List<ToDoData>> = todoDao.sortByLowPriority()

    suspend fun insertData(toDoData: ToDoData){
        todoDao.insertData(toDoData)
    }

    suspend fun updateData(todoData: ToDoData){
        todoDao.updateData(todoData)
    }

    suspend fun deleteData(todoData: ToDoData){
        todoDao.deleteData(todoData)
    }

    suspend fun deleteAll(){
        todoDao.deleteAll()
    }

    fun searchDatabase(searchQuery: String): LiveData<List<ToDoData>>{
        return todoDao.searchDatabase(searchQuery)
    }
}
