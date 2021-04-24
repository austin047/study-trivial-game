package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_game_intro.*


class GameIntroFragment : Fragment() {

    companion object {
        fun newInstance() = GameIntroFragment()
    }

    private lateinit var viewModel: GameIntroViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_game_intro, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GameIntroViewModel::class.java)
        // TODO: Use the ViewModel

        continueButton.setOnClickListener { v: View ->
            v.findNavController().navigate(GameIntroFragmentDirections.actionNavigationGameIntroToGameFragment())
        }
    }

}
