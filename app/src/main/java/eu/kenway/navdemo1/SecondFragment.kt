package eu.kenway.navdemo1

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import eu.kenway.navdemo1.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
private lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        val input:String?=requireArguments().getString("user_input")
        binding.textView2.text=input.toString()
       return binding.root
    }

}