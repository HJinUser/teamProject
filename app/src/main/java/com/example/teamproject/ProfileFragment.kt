package com.example.teamproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment () {

    companion object {
        const val TAG : String ="로그"

        fun newInstance() : ProfileFragment{
            return ProfileFragment()

        }
    }

    //메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "ProfileFragment - onCreate() called")
    }

    //프래그먼트를 안고 있는 엑티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "ProfileFragment - onAttach() called")
    }

    //뷰가 생성되었을때
    //프래그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "ProfileFragment - onAttach() called")
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }



}