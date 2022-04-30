package com.sachet.viewmodal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModal: ViewModel() {
    val count = MutableLiveData(0);

    fun incrementCount(){
        count.value = count.value?.plus(1)
    }

}