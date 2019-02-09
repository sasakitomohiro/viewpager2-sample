package sasakisan.com.viewpager2_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import sasakisan.com.viewpager2_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val groupAdapter = GroupAdapter<ViewHolder>()
        val list = arrayListOf(
            ViewPager2Item("Pager1"),
            ViewPager2Item("pager2"),
            ViewPager2Item("Pager3")
        )
        groupAdapter.update(list)
        binding.viewPager2.apply {
            adapter = groupAdapter
        }
    }
}
