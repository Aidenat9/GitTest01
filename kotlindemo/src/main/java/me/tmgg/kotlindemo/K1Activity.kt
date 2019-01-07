package me.tmgg.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.LinearLayout.VERTICAL
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_k1.*
import me.tmgg.kotlindemo.adapter.ForecastListAdapter

class K1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1)
        tv_1.text = "你好吗？"
//        testFor()
//        testWhile()
//        testReturn()
//        testLabel()
//        val person = Runoob("你好")
//        person.age = 21
//        println("${person.age}-------${person.name}----")
//        person.foo()
//        val emptyc = EmptyConstructor()

        initRecyclerView()
//        async(){
//            Request("https://www.baidu.com").run()
//            uiThread { longToast("Request performed") }
//        }
    }

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )
    private fun initRecyclerView() {

        forecast_list.layoutManager = LinearLayoutManager(this,VERTICAL,false)
        forecast_list.adapter = ForecastListAdapter(
                items,
                object :ForecastListAdapter.OnItemClickListener{
                    override fun invoke(item: String) {
                        toast(item)
                    }
                }
        )
    }

    private fun testLabel() {

//        loop@for (i in 1..10) {
//            for (j in 1..10){
//                //不加@loop ，break执行的是接包围它的函数或者匿名函数，加了@loop才是结束指定的循环
//                if(j==3)break@loop
//                println("$i----$j")
//            }
//        }
        val ints = listOf(1,2,3,4,5,6)
//        ints.forEach lit@ {
//            //不加@lit，会直接从最外层方法直接return
//            if (it == 3)return@lit
//            println(it)
//        }
        ints.forEach { println(it) }
    }

    private fun testReturn() {

        for (i in 1..10){
            if(i==3)continue
            if(i>5)break
            println(i)
        }
    }

    private fun testWhile() {

        var y =5
        do {
            y--
            Log.e("K1Activity","$y")
        }while (y>0)
    }

    private fun testFor() {

        val list = listOf("x1", "x2", "y1", "y2", "333")
        for (item in list){
            Log.e("K1Activity", item)
        }
        Log.e("K1Activity","----------------")
        for ((index,value) in list.withIndex()){
            Log.e("K1Activity", "$index:$value")
        }
    }

    fun toast(text:String,length:Int = text.length){
        Toast.makeText(this,text,length).show()
    }

}
