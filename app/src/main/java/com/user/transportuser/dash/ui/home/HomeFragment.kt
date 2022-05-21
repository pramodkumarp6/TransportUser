package com.user.transportuser.dash.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.user.transportuser.databinding.FragmentHomeBinding
import com.user.transportuser.model.User
import com.user.transportuser.preference.SharedPrefManager

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val user: User = SharedPrefManager.getInstance(this.requireContext()).user
       // binding.id.setText(String.valueOf(user.id)

        Log.e("Home",user.email.toString())

        binding.textHome.text =user.school.toString()
        /*activityProfileBinding.email.setText(user.getEmail())
        activityProfileBinding.school.setText(user.getSchool())*/



   /*     val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}