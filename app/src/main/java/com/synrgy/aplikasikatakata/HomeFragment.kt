package com.synrgy.aplikasikatakata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.synrgy.aplikasikatakata.data.alphabets
import com.synrgy.aplikasikatakata.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _fragmentBinding: FragmentHomeBinding? = null
    private val fragmentBinding get() =_fragmentBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        setHasOptionsMenu(true)
        _fragmentBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBinding.rvHuruf.setHasFixedSize(true)
        fragmentBinding.rvHuruf.layoutManager = LinearLayoutManager(requireContext())

        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            setTitle(R.string.app_name)
            setDisplayHomeAsUpEnabled(false)
        }

        val adapter = ListAdapter {
            val bundle = Bundle()
            bundle.putString(KEY, it)
            findNavController().navigate(R.id.listsOfWordsFragment,bundle)
//            Navigation.createNavigateOnClickListener(R.id.listsOfWordsFragment,bundle)
        }
        adapter.submitList(alphabets)
        fragmentBinding.rvHuruf.adapter = adapter

    }

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                fragmentBinding.rvHuruf.layoutManager = LinearLayoutManager(requireContext())
            }

            R.id.action_grid -> {
                fragmentBinding.rvHuruf.layoutManager = GridLayoutManager(requireContext(), 2)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentBinding = null
    }

    companion object {
        const val KEY = "KEY"
    }

}