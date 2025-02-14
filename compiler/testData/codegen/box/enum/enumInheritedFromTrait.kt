// KT-55828
// IGNORE_BACKEND_K2: NATIVE
package test

fun box() = MyEnum.E1.f() + MyEnum.E2.f()

enum class MyEnum : T {
    E1 {
        override fun f() = "O"
    },
    E2 {
        override fun f() = "K"
    }
}

interface T {
    fun f(): String
}