package com.example.notess.adapter

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.navigation.findNavController
import com.example.notess.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BindingAdapter {
    companion object{
        @BindingAdapter("android:navigateToAddFragment")
        @JvmStatic
        fun navigateToAddFragment(view: FloatingActionButton, navigate: Boolean){
            view.setOnClickListener{
                if (navigate) view.findNavController().navigate(R.id.action_listFragment_to_addFragment)
            }
        }

        @BindingAdapter("android:emptyDatabase")
        @JvmStatic
        fun emptyDatabase(view: View, emptyDatabase: MutableLiveData<Boolean>){
            when(emptyDatabase.value){
                true -> view.visibility = View.VISIBLE
                else -> view.visibility = View.INVISIBLE
            }
        }
    }
}
