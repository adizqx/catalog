package com.example.sharedprefnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sharedprefnav.Adapters.CatalogAdapter
import com.example.sharedprefnav.R
import com.example.sharedprefnav.databinding.FragmentFirstBinding
import com.example.sharedprefnav.model.Data

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter: CatalogAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        adapter = CatalogAdapter(Data.catalog,requireActivity())
        binding.CatalogRecycler.adapter = CatalogAdapter(Data.catalog,requireActivity())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val text = requireArguments().getString(ARG_TEXT)
//        binding.tvLogin.setText("Ваш логин: $text")

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object {
        const val ARG_TEXT = "TEXT"
    }
}