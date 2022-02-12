package com.example.sharedprefnav.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sharedprefnav.R
import com.example.sharedprefnav.databinding.FragmentLoginBinding
import com.example.sharedprefnav.services.SharedPreferences

const val PREF_FILE = "PrefFile"
const val APP_PREF_LOGIN = "Login"
const val APP_PREF_PASSWORD = "Password"

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    lateinit var preferences: android.content.SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val sharedPref = context?.let { SharedPreferences(it) }

        preferences = requireActivity().getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE)

        val currentLoginValue = preferences.getString(APP_PREF_LOGIN, "")
        val currentPasswordValue = preferences.getString(APP_PREF_PASSWORD, "")

        binding.etLogin.setText(currentLoginValue)
        binding.etPassword.setText(currentPasswordValue)

        binding.enterBtn.setOnClickListener {
            val loginValue = binding.etLogin.text.toString()
            val passwordValue = binding.etPassword.text.toString()
            preferences.edit().putString(APP_PREF_LOGIN, loginValue).apply()
            preferences.edit().putString(APP_PREF_PASSWORD, passwordValue).apply()

            openBox()
        }
        return binding.root
    }

    private fun openBox() {
        if (binding.etLogin.text.isBlank() && binding.etPassword.text.isBlank()) {
            Toast.makeText(requireContext(), "Введите логин и пароль", Toast.LENGTH_SHORT).show()
        } else if (binding.etLogin.text.isBlank()) {
            binding.etLogin.error = "Введите логин"
        } else if (binding.etPassword.text.isBlank()) {
            binding.etPassword.error = "Введите пароль"
        } else {
            findNavController().navigate(
                R.id.action_loginFragment_to_FirstFragment
            )
        }

    }
}