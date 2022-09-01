package com.user.transportuser.dash.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.user.transportuser.R
import com.user.transportuser.databinding.FragmentGalleryBinding

class AccountFragment : Fragment() {

    private lateinit var gallerybinding: FragmentGalleryBinding
    private  lateinit var accountViewModel:AccountViewModel


    private val binding get() = gallerybinding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
       accountViewModel = ViewModelProvider(this).get(AccountViewModel::class.java)

        gallerybinding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false)
        val root: View = binding.root
         gallerybinding.accountViewModel = accountViewModel


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        gallerybinding
    }
}