// Test-only binding of the source probe constructor.
package probe
class Code(val value:io.github.kotlinmania.bytes.U128) {
    companion object { fun from_bits(value:io.github.kotlinmania.bytes.U128):Code = Code(value) }
}
