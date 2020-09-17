package com.nonamer777.madlevel3task1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_rating.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class RatingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rating, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showRandomAssessableGame()

        btnNavSummary.setOnClickListener { navigateToSummary() }
    }

    /** Shows the title of a random game. */
    private fun showRandomAssessableGame() {
        val randomGame = listOf(
            "The Elder Scrolls V: Skryim",
            "Minecraft",
            "Assassin's Creed",
            "Assassin's Creed II",
            "Assassin's Creed Brotherhood",
            "Assassin's Creed Revelations",
            "Battlefield 4",
            "Age of Empires II",
            "Age of Mythology",
            "Worms Revolution"
        ).random()

        txtGameTitle.text = randomGame
    }

    /** Assembles the arguments and navigates to the Summary Fragment, passing the arguments along. */
    private fun navigateToSummary() {
        val args = Bundle()

        args.putFloat(ARG_GAME_RATING, rbGameRating.rating)
        args.putString(ARG_GAME_NAME, txtGameTitle.text.toString())

        findNavController().navigate(R.id.action_ratingFragment_to_summaryFragment, args)
    }
}
