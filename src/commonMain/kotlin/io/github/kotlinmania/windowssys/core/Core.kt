// port-lint: source src/core/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.core

public typealias BOOL = Int
public typealias HRESULT = Int
public typealias PSTR = Long
public typealias PWSTR = Long
public typealias PCSTR = Long
public typealias PCWSTR = Long
public typealias BSTR = Long
public typealias HSTRING = Long

public data class GUID(
    public var data1: UInt = 0u,
    public var data2: UShort = 0u,
    public var data3: UShort = 0u,
    public var data4: UByteArray = UByteArray(8),
) {
    public companion object {
        public fun fromU128(uuidHi: ULong, uuidLo: ULong): GUID {
            val data1 = (uuidHi shr 32).toUInt()
            val data2 = ((uuidHi shr 16) and 0xFFFFu).toUShort()
            val data3 = (uuidHi and 0xFFFFu).toUShort()
            val data4 = uuidLo.toBeUByteArray()
            return GUID(data1 = data1, data2 = data2, data3 = data3, data4 = data4)
        }
    }
}

private fun ULong.toBeUByteArray(): UByteArray {
    val bytes = UByteArray(8)
    for (i in 0 until 8) {
        bytes[i] = ((this shr ((7 - i) * 8)) and 0xFFu).toUByte()
    }
    return bytes
}

public val IID_IUnknown: GUID = GUID.fromU128(0x0000000000000000uL, 0xC000000000000046uL)

public class IUnknown_Vtbl(
    public val QueryInterface: (this_: Long, iid: Long, interface_: Long) -> HRESULT,
    public val AddRef: (this_: Long) -> UInt,
    public val Release: (this_: Long) -> UInt,
)

public val IID_IInspectable: GUID = GUID.fromU128(0xAF86E2E0B12D4C6AuL, 0x9C5AD7AA65101E90uL)

public class IInspectable_Vtbl(
    public val base: IUnknown_Vtbl,
    public val GetIids: (this_: Long, count: Long, values: Long) -> HRESULT,
    public val GetRuntimeClassName: (this_: Long, value: Long) -> HRESULT,
    public val GetTrustLevel: (this_: Long, value: Long) -> HRESULT,
)
