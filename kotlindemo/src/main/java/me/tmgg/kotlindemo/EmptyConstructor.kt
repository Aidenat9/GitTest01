package me.tmgg.kotlindemo

/**
 * @author sunwei
 *邮箱：tianmu19@gmail.com
 *时间：2018/12/24 16:48
 *包名：me.tmgg.kotlindemo
 *<p>description:  如果一个非抽象类没有声明构造函数(主构造函数或次构造函数)，它会产生一个没有参数的构造函数。
 * 构造函数是 public 。如果你不想你的类有公共的构造函数，你就得声明一个空的主构造函数：          </p>
 */
class EmptyConstructor private constructor(){
}