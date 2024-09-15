package org.example
// Описание структур переменной

val name: String  ="Alice" // val - объявляем неизменяемое значение, name - название переменной, через : объявляем тип переменной (строка), = - присваивание значения, в кавычках указываем содержанием строки

var age: Int = 30 // val - объявляем изменяемое значение, age - название переменной, Int - тип переменной (целое число), значение численное, присваиваем без кавычек.

const val PI:  = 3.14 // const val - объявляем доступное для изменений позже значение, сейчас известное

lateinit var userInfo: String // lateinit - инициализация произойдёт позднее (в обязательном порядке, иначе ошибка)

val LazyValue: String by Lazy { // LazyValue - инициализация происходит только при прямом обращении

}

var speed: Double? = null // ? обозначает, что переменная может быть приравнена к null (отсутствию объекта)

val count: Int = 0
    get() = field // объявляем переменную count = 0, далее запрашиваем для неё ввод значения и устанавливаем его в качестве содержимого переменной при соответствии условиям
    set(value) {
        if (value >= 0) field = value
        else field - 100
    }

val chassis: String = "12345abc"

var colour: String = "Blue"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by Lazy{
    ""
}

var fuel: Double = 5.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }