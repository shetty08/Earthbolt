package com.example.earthbolt.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.cameraapp.database.AppDatabase
import com.example.cameraapp.database.Photo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class PhotoRepository(application: Application) {
    private val photoDao = AppDatabase.getDatabase(application).photoDao()
    val allPhotos: LiveData<List<Photo>> = photoDao.getAllPhotos()

    fun insert(photo: Photo) = runBlocking {
        this.launch(Dispatchers.IO) {
            photoDao.insert(photo)
        }
    }
}
