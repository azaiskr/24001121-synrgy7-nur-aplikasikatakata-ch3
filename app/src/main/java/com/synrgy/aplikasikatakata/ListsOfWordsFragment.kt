package com.synrgy.aplikasikatakata

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.synrgy.aplikasikatakata.HomeFragment.Companion.KEY
import com.synrgy.aplikasikatakata.data.Words
import com.synrgy.aplikasikatakata.databinding.FragmentListsOfWordsBinding

class ListsOfWordsFragment : Fragment() {

    private var _fragmentBinding: FragmentListsOfWordsBinding? = null
    private val fragmentBinding get() = _fragmentBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _fragmentBinding = FragmentListsOfWordsBinding.inflate(inflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBinding.rvListsOfWords.setHasFixedSize(true)


        val arguments = arguments?.getString(KEY)
        var wordsLists = arrayListOf<String>()

        val title = "Words start with $arguments"
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            setTitle(title)
        }

        when (arguments) {
            Words.A.char -> {
                wordsLists = Words.A.wordsList
            }

            Words.B.char -> {
                wordsLists = Words.B.wordsList
            }

            Words.C.char -> {
                wordsLists = Words.C.wordsList
            }

            Words.D.char -> {
                wordsLists = Words.D.wordsList
            }

            Words.E.char -> {
                wordsLists = Words.E.wordsList
            }

            Words.F.char -> {
                wordsLists = Words.F.wordsList
            }

            Words.G.char -> {
                wordsLists = Words.G.wordsList
            }

            Words.H.char -> {
                wordsLists = Words.H.wordsList
            }

            Words.I.char -> {
                wordsLists = Words.I.wordsList
            }

            Words.J.char -> {
                wordsLists = Words.J.wordsList
            }

            Words.K.char -> {
                wordsLists = Words.K.wordsList
            }

            Words.L.char -> {
                wordsLists = Words.L.wordsList
            }

            Words.M.char -> {
                wordsLists = Words.M.wordsList
            }

            Words.N.char -> {
                wordsLists = Words.N.wordsList
            }

            Words.O.char -> {
                wordsLists = Words.O.wordsList
            }

            Words.P.char -> {
                wordsLists = Words.P.wordsList
            }

            Words.Q.char -> {
                wordsLists = Words.Q.wordsList
            }

            Words.R.char -> {
                wordsLists = Words.R.wordsList
            }

            Words.S.char -> {
                wordsLists = Words.S.wordsList
            }

            Words.T.char -> {
                wordsLists = Words.T.wordsList
            }

            Words.U.char -> {
                wordsLists = Words.U.wordsList
            }

            Words.V.char -> {
                wordsLists = Words.V.wordsList
            }

            Words.W.char -> {
                wordsLists = Words.W.wordsList
            }

            Words.X.char -> {
                wordsLists = Words.X.wordsList
            }

            Words.Y.char -> {
                wordsLists = Words.Y.wordsList
            }

            Words.Z.char -> {
                wordsLists = Words.Z.wordsList
            }
        }

        val adapter = ListAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/search?q=$it"))
            activity?.startActivity(intent)
        }
        adapter.submitList(wordsLists)
        fragmentBinding.rvListsOfWords.also {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentBinding = null
    }
}