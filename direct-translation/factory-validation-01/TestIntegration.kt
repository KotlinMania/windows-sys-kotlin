// TEST ONLY: explicit binding of the source provider, not a Windows runtime.
object provider {
    var calls:UInt=0u
    fun next():Product { val value=42u+calls; calls+=1u; return Product(value) }
}
fun main() {
    println("first|"+Product.construct().value)
    println("second|"+Product.alternate().value)
    println("calls|"+provider.calls)
}
