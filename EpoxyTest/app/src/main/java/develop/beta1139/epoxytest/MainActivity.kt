package develop.beta1139.epoxytest

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import develop.beta1139.epoxytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val controller: TestController by lazy { TestController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val datas = mutableListOf<Data>().apply {
            add(Data("A", listOf("aa", "ab", "ac")))
            add(Data("B", listOf("ba", "bb", "bc")))
            add(Data("D", listOf("da", "db", "dc")))
            add(Data("F", listOf("fa", "fb", "fc")))
            add(Data("J", listOf("ja", "jb", "jc")))
            add(Data("M", listOf("ma", "mb", "mc")))
            add(Data("R", listOf("ra", "rb", "rc")))
            add(Data("T", listOf("ta", "tb", "tc")))
            add(Data("V", listOf("va", "vb", "vc")))
            add(Data("Z", listOf("za", "zb", "zc")))
        }
        controller.setData(datas)

        binding.recyclerView.adapter = controller.adapter
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
