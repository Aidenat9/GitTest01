package me.tmgg.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_k1.*

class K1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1)
        tv_1.text = "你好吗？"
//        testFor()
//        testWhile()
//        testReturn()
//        testLabel()
        val person = Runoob("你好")
        person.age = 21
        println("${person.age}-------${person.name}----")
        person.foo()
//        val emptyc = EmptyConstructor()

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
        ints.forEach lit@ {
            //不加@lit，会直接从最外层方法直接return
            if (it == 3)return@lit
            println(it)
        }
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
}
