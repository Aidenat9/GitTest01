

1、field 关键字
这个问题对 Java 开发者来说十分难以理解，网上有很多人讨论这个问题，但大多数都是互相抄，说不出个所以然来，要说还是老外对这个问题的理解比较透彻，可以参考这个帖子：https://stackoverflow.com/questions/43220140/whats-kotlin-backing-field-for/43220314
其中最关键的一句：Remember in kotlin whenever you write foo.bar = value it will be translated into a setter call instead of a PUTFIELD.
也就是说，在 Kotlin 中，任何时候当你写出“一个变量后边加等于号”这种形式的时候，比如我们定义 var no: Int 变量，当你写出 no = ... 这种形式的时候，这个等于号都会被编译器翻译成调用 setter 方法；而同样，在任何位置引用变量时，只要出现 no 变量的地方都会被编译器翻译成 getter 方法。那么问题就来了，当你在 setter 方法内部写出 no = ... 时，相当于在 setter 方法中调用 setter 方法，形成递归，进而形成死循环，例如文中的例子：


2.也就是说，要想构造内部类的对象，必须先构造外部类的对象，而嵌套类则不需要；



3.



