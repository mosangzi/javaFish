# javaBaseLearn

Learn Java base with [YouTube Amigoscode](https://www.bilibili.com/video/BV1aK411o7YP/).

# process

- [x] packages
- [x] comment
- [x] variable
- [x] reference types
- [x] String class

## Data Types in Java

| Type    | Contains                                 | Default | Size    | Range                                                                                        |
|---------|------------------------------------------|---------|---------|----------------------------------------------------------------------------------------------|
| byte    | Signed integer                           | 0       | 1 byte  | -2<sup>7</sup> to 2<sup>7</sup>-1 or -128 to 127                                             |
| short   | Signed integer                           | 0       | 2 bytes | -2<sup>15</sup> to 2<sup>15</sup>-1 or -32,768 to 32767                                      |
| int     | Signed integer                           | 0       | 4 bytes | -2<sup>31</sup> to 2<sup>31</sup>-1 or -2147,483,648 to 2147,483,647                         |
| long    | Signed integer                           | 0       | 8 bytes | -2<sup>63</sup> to 2<sup>63</sup>-1 or -9223,372,036,854,755,808 to 9223,372,036,854,755,807 |
| float   | IEEE 754 floating point single-precision | 0.0f    | 4 bytes | ±1.4E-45 to ±3.40282347E+38F                                                                 |
| double  | IEEE 754 floating point double-precision | 0.0     | 8 bytes | ±439E-324 to ±1.7976931348623157E+308                                                        |
| char    | Unicode character unsigned               | \u0000  | 2 bytes | 0 to 2<sup>16</sup>-1 or \u0000 to \uFFFF                                                    |
| boolean | true or false                            | false   | 1 bit   | true or false                                                                                |

# Java学习

## 课程链接

### 1. [Java SE](https://www.bilibili.com/video/BV1YP4y1o75f)

| 标题                                                                                                             | 时长    |
|----------------------------------------------------------------------------------------------------------------|-------|
| <input type="checkbox" checked /> [P1 入门：课程介绍](https://www.bilibili.com/video/BV1YP4y1o75f?p=1)                | 04:24 |
| <input type="checkbox" checked /> [P2 入门：计算机的世界](https://www.bilibili.com/video/BV1YP4y1o75f?p=2)              | 09:34 |
| <input type="checkbox" checked /> [P3 入门：操作系统介绍](https://www.bilibili.com/video/BV1YP4y1o75f?p=3)              | 07:13 |
| <input type="checkbox" checked /> [P4 入门：计算机编程语言](https://www.bilibili.com/video/BV1YP4y1o75f?p=4)             | 09:01 |
| <input type="checkbox" checked /> [P5 入门：走进Java语言](https://www.bilibili.com/video/BV1YP4y1o75f?p=5)            | 10:06 |
| <input type="checkbox" checked /> [P6 入门：环境安装与测试](https://www.bilibili.com/video/BV1YP4y1o75f?p=6)             | 11:45 |
| <input type="checkbox" checked /> [P7 入门：IDE安装与使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=7)            | 15:46 |
| <input type="checkbox" checked /> [P8 入门：IDEA新UI介绍](https://www.bilibili.com/video/BV1YP4y1o75f?p=8)           | 06:44 |
| <input type="checkbox" checked /> [P9 初级：Java程序基本格式](https://www.bilibili.com/video/BV1YP4y1o75f?p=9)          | 11:53 |
| <input type="checkbox" checked /> [P10 初级：注释的使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=10)             | 04:43 |
| <input type="checkbox" checked /> [P11 初级：变量与常量](https://www.bilibili.com/video/BV1YP4y1o75f?p=11)             | 13:04 |
| <input type="checkbox" checked /> [P12 初级：计算机中的二进制表示](https://www.bilibili.com/video/BV1YP4y1o75f?p=12)        | 15:42 |
| <input type="checkbox" checked /> [P13 初级：整数类型](https://www.bilibili.com/video/BV1YP4y1o75f?p=13)              | 15:11 |
| <input type="checkbox" checked /> [P14 初级：浮点类型](https://www.bilibili.com/video/BV1YP4y1o75f?p=14)              | 13:27 |
| <input type="checkbox" checked /> [P15 初级：字符类型](https://www.bilibili.com/video/BV1YP4y1o75f?p=15)              | 13:26 |
| <input type="checkbox" checked /> [P16 初级：布尔类型](https://www.bilibili.com/video/BV1YP4y1o75f?p=16)              | 02:43 |
| <input type="checkbox" checked /> [P17 初级：赋值运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=17)             | 07:49 |
| <input type="checkbox" checked /> [P18 初级：算术运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=18)             | 24:52 |
| <input type="checkbox" checked /> [P19 初级：括号运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=19)             | 11:15 |
| <input type="checkbox" checked /> [P20 初级：自增自减运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=20)           | 11:15 |
| <input type="checkbox" checked /> [P21 初级：位运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=21)              | 16:47 |
| <input type="checkbox" checked /> [P22 初级：关系和逻辑运算符](https://www.bilibili.com/video/BV1YP4y1o75f?p=22)          | 16:36 |
| <input type="checkbox" checked /> [P23 初级：代码块与作用域](https://www.bilibili.com/video/BV1YP4y1o75f?p=23)           | 05:01 |
| <input type="checkbox" checked /> [P24 初级：选择结构（一）](https://www.bilibili.com/video/BV1YP4y1o75f?p=24)           | 10:05 |
| <input type="checkbox" checked /> [P25 初级：选择结构（二）](https://www.bilibili.com/video/BV1YP4y1o75f?p=25)           | 08:53 |
| <input type="checkbox" checked /> [P26 初级：循环结构（一）](https://www.bilibili.com/video/BV1YP4y1o75f?p=26)           | 20:47 |
| <input type="checkbox" checked /> [P27 初级：循环结构（二）](https://www.bilibili.com/video/BV1YP4y1o75f?p=27)           | 09:41 |
| <input type="checkbox" checked /> [P28 面向过程实战：寻找水仙花数](https://www.bilibili.com/video/BV1YP4y1o75f?p=28)        | 06:49 |
| <input type="checkbox" checked /> [P29 面向过程实战：九九乘法表](https://www.bilibili.com/video/BV1YP4y1o75f?p=29)         | 07:55 |
| <input type="checkbox" checked /> [P30 面向过程实战：斐波那契数列](https://www.bilibili.com/video/BV1YP4y1o75f?p=30)        | 05:07 |
| <input type="checkbox" checked /> [P31 初级：类与对象](https://www.bilibili.com/video/BV1YP4y1o75f?p=31)              | 03:18 |
| <input type="checkbox" checked /> [P32 初级：类的定义与对象创建](https://www.bilibili.com/video/BV1YP4y1o75f?p=32)         | 05:21 |
| <input type="checkbox" checked /> [P33 初级：对象的使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=33)             | 13:24 |
| <input type="checkbox" checked /> [P34 初级：方法的创建与使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=34)          | 25:16 |
| <input type="checkbox" checked /> [P35 初级：方法进阶使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=35)            | 15:15 |
| <input type="checkbox" checked /> [P36 初级：构造方法](https://www.bilibili.com/video/BV1YP4y1o75f?p=36)              | 10:38 |
| <input type="checkbox" checked /> [P37 初级：静态变量和静态方法](https://www.bilibili.com/video/BV1YP4y1o75f?p=37)         | 13:55 |
| <input type="checkbox" checked /> [P38 初级：包声明和导入](https://www.bilibili.com/video/BV1YP4y1o75f?p=38)            | 10:48 |
| <input type="checkbox" checked /> [P39 初级：访问权限控制](https://www.bilibili.com/video/BV1YP4y1o75f?p=39)            | 07:48 |
| <input type="checkbox" checked /> [P40 初级：类的封装](https://www.bilibili.com/video/BV1YP4y1o75f?p=40)              | 09:50 |
| <input type="checkbox" disabled /> [P41 初级：类的继承](https://www.bilibili.com/video/BV1YP4y1o75f?p=41)             | 23:31 |
| <input type="checkbox" disabled /> [P42 初级：Object类](https://www.bilibili.com/video/BV1YP4y1o75f?p=42)          | 10:22 |
| <input type="checkbox" disabled /> [P43 初级：方法的重写](https://www.bilibili.com/video/BV1YP4y1o75f?p=43)            | 20:32 |
| <input type="checkbox" disabled /> [P44 初级：抽象类](https://www.bilibili.com/video/BV1YP4y1o75f?p=44)              | 08:11 |
| <input type="checkbox" disabled /> [P45 初级：接口（一）](https://www.bilibili.com/video/BV1YP4y1o75f?p=45)            | 20:20 |
| <input type="checkbox" disabled /> [P46 初级：接口（二）](https://www.bilibili.com/video/BV1YP4y1o75f?p=46)            | 08:41 |
| <input type="checkbox" disabled /> [P47 初级：枚举类](https://www.bilibili.com/video/BV1YP4y1o75f?p=47)              | 12:11 |
| <input type="checkbox" disabled /> [P48 初级：基本类型包装类](https://www.bilibili.com/video/BV1YP4y1o75f?p=48)          | 17:07 |
| <input type="checkbox" disabled /> [P49 初级：特殊包装类](https://www.bilibili.com/video/BV1YP4y1o75f?p=49)            | 09:31 |
| <input type="checkbox" disabled /> [P50 初级：一维数组](https://www.bilibili.com/video/BV1YP4y1o75f?p=50)             | 27:21 |
| <input type="checkbox" disabled /> [P51 初级：多维数组](https://www.bilibili.com/video/BV1YP4y1o75f?p=51)             | 13:50 |
| <input type="checkbox" disabled /> [P52 初级：可变长参数](https://www.bilibili.com/video/BV1YP4y1o75f?p=52)            | 09:13 |
| <input type="checkbox" disabled /> [P53 初级：字符串](https://www.bilibili.com/video/BV1YP4y1o75f?p=53)              | 19:57 |
| <input type="checkbox" disabled /> [P54 初级：StringBuilder类](https://www.bilibili.com/video/BV1YP4y1o75f?p=54)   | 12:00 |
| <input type="checkbox" disabled /> [P55 初级：正则表达式](https://www.bilibili.com/video/BV1YP4y1o75f?p=55)            | 08:51 |
| <input type="checkbox" disabled /> [P56 初级：成员内部类](https://www.bilibili.com/video/BV1YP4y1o75f?p=56)            | 11:53 |
| <input type="checkbox" disabled /> [P57 初级：静态内部类和局部内部类](https://www.bilibili.com/video/BV1YP4y1o75f?p=57)      | 04:36 |
| <input type="checkbox" disabled /> [P58 初级：匿名内部类](https://www.bilibili.com/video/BV1YP4y1o75f?p=58)            | 11:46 |
| <input type="checkbox" disabled /> [P59 初级：Lambda表达式](https://www.bilibili.com/video/BV1YP4y1o75f?p=59)        | 13:21 |
| <input type="checkbox" disabled /> [P60 初级：方法引用](https://www.bilibili.com/video/BV1YP4y1o75f?p=60)             | 07:56 |
| <input type="checkbox" disabled /> [P61 初级：异常机制](https://www.bilibili.com/video/BV1YP4y1o75f?p=61)             | 13:54 |
| <input type="checkbox" disabled /> [P62 初级：抛出异常](https://www.bilibili.com/video/BV1YP4y1o75f?p=62)             | 10:24 |
| <input type="checkbox" disabled /> [P63 初级：异常的处理](https://www.bilibili.com/video/BV1YP4y1o75f?p=63)            | 16:57 |
| <input type="checkbox" disabled /> [P64 初级：断言表达式](https://www.bilibili.com/video/BV1YP4y1o75f?p=64)            | 02:48 |
| <input type="checkbox" disabled /> [P65 初级：数学工具类](https://www.bilibili.com/video/BV1YP4y1o75f?p=65)            | 11:44 |
| <input type="checkbox" disabled /> [P66 初级：数组工具类](https://www.bilibili.com/video/BV1YP4y1o75f?p=66)            | 16:11 |
| <input type="checkbox" disabled /> [P67 面向对象实战：冒泡排序算法](https://www.bilibili.com/video/BV1YP4y1o75f?p=67)       | 14:34 |
| <input type="checkbox" disabled /> [P68 面向对象实战：二分搜索算法](https://www.bilibili.com/video/BV1YP4y1o75f?p=68)       | 10:50 |
| <input type="checkbox" disabled /> [P69 面向对象实战：青蛙跳台阶问题](https://www.bilibili.com/video/BV1YP4y1o75f?p=69)      | 10:56 |
| <input type="checkbox" disabled /> [P70 面向对象实战：递归程序设计](https://www.bilibili.com/video/BV1YP4y1o75f?p=70)       | 10:56 |
| <input type="checkbox" disabled /> [P71 面向对象实战：回文串判断](https://www.bilibili.com/video/BV1YP4y1o75f?p=71)        | 09:12 |
| <input type="checkbox" disabled /> [P72 面向对象实战：汉诺塔](https://www.bilibili.com/video/BV1YP4y1o75f?p=72)          | 12:53 |
| <input type="checkbox" disabled /> [P73 中级：走进泛型](https://www.bilibili.com/video/BV1YP4y1o75f?p=73)             | 07:24 |
| <input type="checkbox" disabled /> [P74 中级：泛型类](https://www.bilibili.com/video/BV1YP4y1o75f?p=74)              | 16:34 |
| <input type="checkbox" disabled /> [P75 中级：泛型与多态](https://www.bilibili.com/video/BV1YP4y1o75f?p=75)            | 03:59 |
| <input type="checkbox" disabled /> [P76 中级：泛型方法](https://www.bilibili.com/video/BV1YP4y1o75f?p=76)             | 08:30 |
| <input type="checkbox" disabled /> [P77 中级：泛型界限](https://www.bilibili.com/video/BV1YP4y1o75f?p=77)             | 16:15 |
| <input type="checkbox" disabled /> [P78 中级：类型擦除机制](https://www.bilibili.com/video/BV1YP4y1o75f?p=78)           | 15:06 |
| <input type="checkbox" disabled /> [P79 中级：四大函数式接口](https://www.bilibili.com/video/BV1YP4y1o75f?p=79)          | 20:43 |
| <input type="checkbox" disabled /> [P80 中级：判空包装类](https://www.bilibili.com/video/BV1YP4y1o75f?p=80)            | 14:39 |
| <input type="checkbox" disabled /> [P81 数据结构基础：走进数据结构](https://www.bilibili.com/video/BV1YP4y1o75f?p=81)       | 07:01 |
| <input type="checkbox" disabled /> [P82 数据结构基础：顺序表](https://www.bilibili.com/video/BV1YP4y1o75f?p=82)          | 22:26 |
| <input type="checkbox" disabled /> [P83 数据结构基础：链表](https://www.bilibili.com/video/BV1YP4y1o75f?p=83)           | 21:52 |
| <input type="checkbox" disabled /> [P84 数据结构基础：栈](https://www.bilibili.com/video/BV1YP4y1o75f?p=84)            | 11:00 |
| <input type="checkbox" disabled /> [P85 数据结构基础：队列](https://www.bilibili.com/video/BV1YP4y1o75f?p=85)           | 07:40 |
| <input type="checkbox" disabled /> [P86 数据结构基础：二叉树](https://www.bilibili.com/video/BV1YP4y1o75f?p=86)          | 11:07 |
| <input type="checkbox" disabled /> [P87 （选学）数据结构基础：二叉树的遍历](https://www.bilibili.com/video/BV1YP4y1o75f?p=87)   | 17:13 |
| <input type="checkbox" disabled /> [P88 数据结构基础：二叉树和平衡二叉树](https://www.bilibili.com/video/BV1YP4y1o75f?p=88)    | 14:17 |
| <input type="checkbox" disabled /> [P89 数据结构基础：红黑树](https://www.bilibili.com/video/BV1YP4y1o75f?p=89)          | 11:25 |
| <input type="checkbox" disabled /> [P90 数据结构基础：哈希表](https://www.bilibili.com/video/BV1YP4y1o75f?p=90)          | 22:25 |
| <input type="checkbox" disabled /> [P91 数据结构实战：反转链表](https://www.bilibili.com/video/BV1YP4y1o75f?p=91)         | 08:39 |
| <input type="checkbox" disabled /> [P92 数据结构实战：括号匹配问题](https://www.bilibili.com/video/BV1YP4y1o75f?p=92)       | 12:39 |
| <input type="checkbox" disabled /> [P93 中级：走进集合类](https://www.bilibili.com/video/BV1YP4y1o75f?p=93)            | 04:29 |
| <input type="checkbox" disabled /> [P94 中级：集合根接口](https://www.bilibili.com/video/BV1YP4y1o75f?p=94)            | 10:00 |
| <input type="checkbox" disabled /> [P95 中级：List列表（一）](https://www.bilibili.com/video/BV1YP4y1o75f?p=95)        | 13:46 |
| <input type="checkbox" disabled /> [P96 中级：List列表（二）](https://www.bilibili.com/video/BV1YP4y1o75f?p=96)        | 13:28 |
| <input type="checkbox" disabled /> [P97 中级：List列表（三）](https://www.bilibili.com/video/BV1YP4y1o75f?p=97)        | 06:26 |
| <input type="checkbox" disabled /> [P98 中级：迭代器](https://www.bilibili.com/video/BV1YP4y1o75f?p=98)              | 21:07 |
| <input type="checkbox" disabled /> [P99 中级：Queue和Deque](https://www.bilibili.com/video/BV1YP4y1o75f?p=99)      | 13:29 |
| <input type="checkbox" disabled /> [P100 中级：Set集合](https://www.bilibili.com/video/BV1YP4y1o75f?p=100)          | 10:20 |
| <input type="checkbox" disabled /> [P101 中级：Map映射（一）](https://www.bilibili.com/video/BV1YP4y1o75f?p=101)       | 13:51 |
| <input type="checkbox" disabled /> [P102 中级：Map映射（二）](https://www.bilibili.com/video/BV1YP4y1o75f?p=102)       | 20:06 |
| <input type="checkbox" disabled /> [P103 中级：Map映射（三）](https://www.bilibili.com/video/BV1YP4y1o75f?p=103)       | 14:37 |
| <input type="checkbox" disabled /> [P104 中级：Stream流](https://www.bilibili.com/video/BV1YP4y1o75f?p=104)        | 14:57 |
| <input type="checkbox" disabled /> [P105 中级：Collections工具类](https://www.bilibili.com/video/BV1YP4y1o75f?p=105) | 09:19 |
| <input type="checkbox" disabled /> [P106 中级：集合类对象相等判定](https://www.bilibili.com/video/BV1YP4y1o75f?p=106)      | 13:24 |
| <input type="checkbox" disabled /> [P107 高级：Java I/O介绍](https://www.bilibili.com/video/BV1YP4y1o75f?p=107)     | 10:05 |
| <input type="checkbox" disabled /> [P108 高级：相对路径和绝对路径](https://www.bilibili.com/video/BV1YP4y1o75f?p=108)      | 09:29 |
| <input type="checkbox" disabled /> [P109 高级：文件字节输入流](https://www.bilibili.com/video/BV1YP4y1o75f?p=109)        | 21:12 |
| <input type="checkbox" disabled /> [P110 高级：文件字节输出流](https://www.bilibili.com/video/BV1YP4y1o75f?p=110)        | 09:52 |
| <input type="checkbox" disabled /> [P111 高级：文件字符流](https://www.bilibili.com/video/BV1YP4y1o75f?p=111)          | 12:49 |
| <input type="checkbox" disabled /> [P112 高级：文件对象](https://www.bilibili.com/video/BV1YP4y1o75f?p=112)           | 14:35 |
| <input type="checkbox" disabled /> [P113 高级：缓冲流](https://www.bilibili.com/video/BV1YP4y1o75f?p=113)            | 23:56 |
| <input type="checkbox" disabled /> [P114 高级：转换流](https://www.bilibili.com/video/BV1YP4y1o75f?p=114)            | 03:56 |
| <input type="checkbox" disabled /> [P115 高级：打印流](https://www.bilibili.com/video/BV1YP4y1o75f?p=115)            | 13:38 |
| <input type="checkbox" disabled /> [P116 高级：数据流和对象流](https://www.bilibili.com/video/BV1YP4y1o75f?p=116)        | 15:05 |
| <input type="checkbox" disabled /> [P117 集合类与IO实战：图书管理系统](https://www.bilibili.com/video/BV1YP4y1o75f?p=117)   | 39:45 |
| <input type="checkbox" disabled /> [P118 高级：认识多线程](https://www.bilibili.com/video/BV1YP4y1o75f?p=118)          | 09:47 |
| <input type="checkbox" disabled /> [P119 高级：线程的创建和启动](https://www.bilibili.com/video/BV1YP4y1o75f?p=119)       | 20:11 |
| <input type="checkbox" disabled /> [P120 高级：线程的休眠和中断](https://www.bilibili.com/video/BV1YP4y1o75f?p=120)       | 16:24 |
| <input type="checkbox" disabled /> [P121 高级：线程的优先级](https://www.bilibili.com/video/BV1YP4y1o75f?p=121)         | 08:08 |
| <input type="checkbox" disabled /> [P122 高级：线程锁和线程同步](https://www.bilibili.com/video/BV1YP4y1o75f?p=122)       | 25:36 |
| <input type="checkbox" disabled /> [P123 高级：死锁](https://www.bilibili.com/video/BV1YP4y1o75f?p=123)             | 11:19 |
| <input type="checkbox" disabled /> [P124 高级：wait和notify方法](https://www.bilibili.com/video/BV1YP4y1o75f?p=124)  | 10:54 |
| <input type="checkbox" disabled /> [P125 高级：ThreadLocal的使用](https://www.bilibili.com/video/BV1YP4y1o75f?p=125) | 05:30 |
| <input type="checkbox" disabled /> [P126 高级：定时器](https://www.bilibili.com/video/BV1YP4y1o75f?p=126)            | 09:24 |
| <input type="checkbox" disabled /> [P127 高级：守护线程](https://www.bilibili.com/video/BV1YP4y1o75f?p=127)           | 05:01 |
| <input type="checkbox" disabled /> [P128 高级：再谈集合类](https://www.bilibili.com/video/BV1YP4y1o75f?p=128)          | 10:41 |
| <input type="checkbox" disabled /> [P129 多线程实战：生产者和消费者](https://www.bilibili.com/video/BV1YP4y1o75f?p=129)     | 14:41 |
| <input type="checkbox" disabled /> [P130 高级：认识反射](https://www.bilibili.com/video/BV1YP4y1o75f?p=130)           | 06:43 |
| <input type="checkbox" disabled /> [P131 高级：Class类详解](https://www.bilibili.com/video/BV1YP4y1o75f?p=131)       | 10:08 |
| <input type="checkbox" disabled /> [P132 高级：Class类与多态](https://www.bilibili.com/video/BV1YP4y1o75f?p=132)      | 14:42 |
| <input type="checkbox" disabled /> [P133 高级：反射创建类对象](https://www.bilibili.com/video/BV1YP4y1o75f?p=133)        | 13:51 |
| <input type="checkbox" disabled /> [P134 高级：反射调用类方法](https://www.bilibili.com/video/BV1YP4y1o75f?p=134)        | 10:06 |
| <input type="checkbox" disabled /> [P135 高级：反射修改类属性](https://www.bilibili.com/video/BV1YP4y1o75f?p=135)        | 10:11 |
| <input type="checkbox" disabled /> [P136 高级：类加载器](https://www.bilibili.com/video/BV1YP4y1o75f?p=136)           | 13:44 |
| <input type="checkbox" disabled /> [P137 高级：认识注解](https://www.bilibili.com/video/BV1YP4y1o75f?p=137)           | 08:33 |
| <input type="checkbox" disabled /> [P138 高级：使用注解](https://www.bilibili.com/video/BV1YP4y1o75f?p=138)           | 07:28 |
| <input type="checkbox" disabled /> [P139 结束语：你干嘛哎哟](https://www.bilibili.com/video/BV1YP4y1o75f?p=139)         | 02:29 |

### 笔记

1. 静态变量初始化 -> 静态代码块 -> 成员变量的初始化 -> 执行代码块 -> 执行构造方法（一般情况使用构造方法进行对象初始化）
2. 静态变量属于类不属于对象
3. 访问权限控制

|           | 当前类 | 同一个包下的类 | 不同包下的子类 | 不同包下的类 |
|-----------|-----|---------|---------|--------|
| public    | Y   | Y       | Y       | Y      |
| protected | Y   | Y       | Y       | N      |
| default   | Y   | Y       | N       | N      |
| private   | Y   | N       | N       | N      |

4.