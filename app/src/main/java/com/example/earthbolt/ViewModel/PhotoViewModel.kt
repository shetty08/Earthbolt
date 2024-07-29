package com.example.earthbolt.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.cameraapp.repository.PhotoRepository
import com.example.cameraapp.database.Photo

class PhotoViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: PhotoRepository = PhotoRepository(application)
    val allPhotos: LiveData<List<Photo>> = repository.allPhotos

    fun insert(photo: Photo) {
        repository.insert(photo)
    }
}
