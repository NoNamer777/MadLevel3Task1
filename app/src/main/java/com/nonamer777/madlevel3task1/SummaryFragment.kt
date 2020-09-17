package com.nonamer777.madlevel3task1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

const val ARG_GAME_NAME = "arg_game_name"
const val ARG_GAME_RATING = "arg_game_rating"

/**
 * A simple [Fragment] subclass.
 */
class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_summary, container, false)
    }
}
