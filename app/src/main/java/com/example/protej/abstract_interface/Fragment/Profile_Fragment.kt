package com.example.protej.abstract_interface.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protej.abstract_interface.R
import com.example.protej.abstract_interface.databinding.BottemSheetsBinding
import com.example.protej.abstract_interface.databinding.FragmentProfileBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class Profile_Fragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)





        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
