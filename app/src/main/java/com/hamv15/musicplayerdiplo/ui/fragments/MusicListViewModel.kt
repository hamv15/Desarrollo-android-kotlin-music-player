package com.hamv15.musicplayerdiplo.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hamv15.musicplayerdiplo.data.local.model.MusicFile

class MusicListViewModel: ViewModel() {

    //Cola para los strings de los permisos a solicitar
    private val permissonsToRequestQueue = mutableListOf<String>()

    //Livedatas para los permisos y se puedan observar
    private val _permissonToRequest = MutableLiveData<List<String>>()
    val permissionsToRequest: LiveData<List<String>> = _permissonToRequest

    private val _musicFiles = MutableLiveData<List<MusicFile>>()
    val musicFiles: LiveData<List<MusicFile >> = _musicFiles

    //Función para quitar un permiso de la cola
    fun dismissDialog(){
        if (permissonsToRequestQueue.isNotEmpty()){
            permissonsToRequestQueue.removeFirst()
        }
    }
    //Para manejar el resultado del permiso
    fun onPermissionResult(
        permission: String,
        isGanted: Boolean
    ){
        if (!isGanted && permissonsToRequestQueue.contains(permission)){
            permissonsToRequestQueue.add(permission)
            _permissonToRequest.postValue(permissonsToRequestQueue)
        }

    }
}