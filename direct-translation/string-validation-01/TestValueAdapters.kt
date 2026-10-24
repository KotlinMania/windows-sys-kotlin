// TEST ONLY: byte/code-unit values, not production pointer adapters.
package windows_sys.core
typealias PCSTR = ByteArray
typealias PCWSTR = CharArray
fun s(value: String): PCSTR = value.encodeToByteArray() + byteArrayOf(0)
fun w(value: String): PCWSTR = value.toCharArray() + charArrayOf('\u0000')
