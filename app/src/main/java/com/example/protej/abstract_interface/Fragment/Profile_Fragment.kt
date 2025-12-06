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


//class Profile_Fragment : Fragment() {
//   private var _binding: FragmentProfileBinding?=null
//    private val binding get() = _binding!!
//
//    private var _bottemsheet : BottemSheetsBinding?=null
//    private val bottemsheet get() = _bottemsheet!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding= FragmentProfileBinding.inflate(inflater,container,false)
//          _bottemsheet= BottemSheetsBinding.inflate(inflater)
//
//        // BottomSheet dialog create example
//        binding.Buttonhena.setOnClickListener {
//            val dialog = BottomSheetDialog(requireContext())
//            dialog.setContentView(bottemsheet.root)
//            dialog.show()
//        }
//
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding=null
//        _bottemsheet=null
//    }
//
//}
class Profile_Fragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)


            binding.Buttonhena.setOnClickListener {

                // हर बार नया BottomSheet View
                val bottomSheetBinding = BottemSheetsBinding.inflate(layoutInflater)

                val dialog = BottomSheetDialog(requireContext())
                dialog.setContentView(bottomSheetBinding.root)

                // 🔥 Save button click listener
                bottomSheetBinding.btnSaveGender.setOnClickListener {

                    val selectedId = bottomSheetBinding.rgGender.checkedRadioButtonId

                    if (selectedId != -1) {   // कोई option select हुआ है
                        val selectedText = when (selectedId) {
                            R.id.rbMale -> "Male"
                            R.id.rbFemale -> "Female"
                            R.id.rbOther -> "Other"
                            else -> ""
                        }

                        // 🔥 Fragment के TextView में दिखाना
                        binding.result.text = selectedText

                        dialog.dismiss()
                    }
                }

                // Cancel
                bottomSheetBinding.btnCancel.setOnClickListener {
                    dialog.dismiss()
                }

                dialog.show()
            }



        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
