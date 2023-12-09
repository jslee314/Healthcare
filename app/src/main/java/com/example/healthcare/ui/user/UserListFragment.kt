package com.example.healthcare.ui.user

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentUserListBinding

class UserListFragment : BaseFragment() {

    private val viewModel: UserListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (binding as FragmentUserListBinding).apply {
            val userListAdapter = UserListAdapter()
            recyclerviewUser.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = userListAdapter
            }
        }


    }

    override fun getViewBinding(): ViewBinding {
        return FragmentUserListBinding.inflate(layoutInflater)
    }


}