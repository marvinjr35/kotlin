// !WITH_NEW_INFERENCE
//EA-35646
package a

class MyClass1 {
    public operator fun unaryPlus() {}
}

fun main(arg: MyClass1) {
    arg<!INAPPLICABLE_CANDIDATE!>+<!><!SYNTAX!><!>
}
