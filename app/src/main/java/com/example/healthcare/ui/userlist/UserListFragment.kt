package com.example.healthcare.ui.userlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentUserListBinding

class UserListFragment : BaseFragment() {

    private val viewModel: UserListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun getViewBinding(): ViewBinding {
        return FragmentUserListBinding.inflate(layoutInflater)
    }


}