package com.example.sharedprefnav.fragments

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sharedprefnav.Adapters.DetailsAdapter
import com.example.sharedprefnav.databinding.FragmentSecondBinding
import com.example.sharedprefnav.model.Catalog
import com.example.sharedprefnav.model.Data
import com.example.sharedprefnav.model.ImagesDetails

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter: DetailsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val res2 = arguments?.getInt("key") as Catalog
        val res2 = requireArguments().getSerializable("key") as Catalog
        adapter = DetailsAdapter(res2.images)
        binding.DetailsRecycler.layoutManager = GridLayoutManager(requireContext(),2)
        binding.DetailsRecycler.adapter = DetailsAdapter(res2.images)
        binding.hotelTitle.setText(res2.placeName)
        binding.amenities.setText(res2.amenities)
        binding.description.setText(res2.description)
//        var filteredArray = Constance.catergories.filter { item -> item.id == Categories.Horror.ordinal }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}