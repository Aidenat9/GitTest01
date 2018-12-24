package me.tmgg.kotlindemo

/**
 * @author sunwei
 *邮箱：tianmu19@gmail.com
 *时间：2018/12/24 16:19
 *包名：me.tmgg.kotlindemo
 *<p>description:            </p>
 */
class Runoob(firstname: String) {
    var name: String = "123"
    var age: Int = 0
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }

    fun foo() {
        println("you are handsome.")
    }

}