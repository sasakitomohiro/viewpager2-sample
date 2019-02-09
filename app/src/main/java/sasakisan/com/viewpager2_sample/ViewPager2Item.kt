package sasakisan.com.viewpager2_sample

import com.xwray.groupie.databinding.BindableItem
import sasakisan.com.viewpager2_sample.databinding.ItemViewPager2Binding

class ViewPager2Item(val text: String) : BindableItem<ItemViewPager2Binding>() {
    override fun getLayout(): Int = R.layout.item_view_pager2

    override fun bind(viewBinding: ItemViewPager2Binding, position: Int) {
        viewBinding.text.text = text
    }
}