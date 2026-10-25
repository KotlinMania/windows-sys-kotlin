// Test-only namespace/API adapter; actual GUID conversion reuses the existing port.
package windows_sys.core
class GUID private constructor(val original:io.github.kotlinmania.windowssys.core.GUID) {
    companion object {
        fun from_u128(value:io.github.kotlinmania.bytes.U128):GUID =
            GUID(io.github.kotlinmania.windowssys.core.GUID.fromU128(value.high,value.low))
    }
}
