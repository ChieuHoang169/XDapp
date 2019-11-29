package com.example.xdapp.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.ArrayList
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.widget.Toolbar
import kotlinx.android.synthetic.main.fragment_notes.*


class NotesFragment : Fragment() {

    private lateinit var notesViewModel: NotesViewModel



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

            notesViewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)
        val root = inflater.inflate(com.example.xdapp.R.layout.fragment_add, container, false)

        val fragmentAdapter = MyViewPagerAdapter(activity!!.supportFragmentManager)
        viewpager.adapter = fragmentAdapter
        tab.setupWithViewPager(viewpager)

        return root

    }

    class MyViewPagerAdapter(manager:FragmentManager): FragmentPagerAdapter(manager){
        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val titleList:MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return  when(position){
                0->{
                    IdeaFragment()
                }
                1->{
                    ScrapFragment()
                }
                2 ->{
                    StudyFragment()
                }
                3->{
                    ThoughtsFragment()
                }
                4->{
                    To_dilistFragment()
                }
                else->{
                    return To_dilistFragment()
                }
            }


        }

        override fun getCount(): Int {
            return 5
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when(position){
                    0->"Idea"
                1->"Scrap"
                2 ->"Study"
                3->"Thoughts"
                else ->{
                    return "To_do list"
                }
            }
        }

    }
}
