# 笔记

## 数据类型

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

## 静态变量

1. 静态变量初始化 -> 静态代码块 -> 成员变量的初始化 -> 执行代码块 -> 执行构造方法（一般情况使用构造方法进行对象初始化）
2. 静态变量属于类不属于对象

## 权限控制

1. 访问权限控制

|           | 当前类 | 同一个包下的类 | 不同包下的子类 | 不同包下的类 |
|-----------|-----|---------|---------|--------|
| public    | Y   | Y       | Y       | Y      |
| protected | Y   | Y       | Y       | N      |
| default   | Y   | Y       | N       | N      |
| private   | Y   | N       | N       | N      |

## 重写

1. 方法重写时，使用哪个类里面的方法要看具体是哪个对象（右侧new的类）
2. 方法重写时，子类权限要比父类更开放或相同，不能更小
3. 如果不希望子类重写该方法，在父类添加final关键字；如果某个类不希望有子类，也可以添加final关键字

## 抽象类

1. 抽象方法不能是private