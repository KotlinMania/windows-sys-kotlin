@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.core

public fun interface IUnknown_VtblQueryInterfaceCallback {
    public operator fun invoke(thisRef: Long, iid: Long, iface: Long): HRESULT
}

public fun interface IUnknown_VtblAddRefCallback {
    public operator fun invoke(thisRef: Long): UInt
}

public fun interface IInspectable_VtblGetRuntimeClassNameCallback {
    public operator fun invoke(thisRef: Long, value: Long): HRESULT
}

public data class GUID(
    public var data1: UInt = 0u,
    public var data2: UShort = 0u,
    public var data3: UShort = 0u,
    public var data4: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GUID) return false
        if (this.data1 != other.data1) return false
        if (this.data2 != other.data2) return false
        if (this.data3 != other.data3) return false
        if (!this.data4.contentEquals(other.data4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data1.hashCode()
        result = 31 * result + this.data2.hashCode()
        result = 31 * result + this.data3.hashCode()
        result = 31 * result + this.data4.contentHashCode()
        return result
    }

    public companion object {
        public fun from_u128(uuidHi: ULong, uuidLo: ULong): GUID = GUID(
            data1 = (uuidHi shr 32).toUInt(),
            data2 = ((uuidHi shr 16) and 0xffffuL).toUShort(),
            data3 = (uuidHi and 0xffffuL).toUShort(),
            data4 = ubyteArrayOf(
                (uuidLo shr 56).toUByte(),
                (uuidLo shr 48).toUByte(),
                (uuidLo shr 40).toUByte(),
                (uuidLo shr 32).toUByte(),
                (uuidLo shr 24).toUByte(),
                (uuidLo shr 16).toUByte(),
                (uuidLo shr 8).toUByte(),
                uuidLo.toUByte(),
            ),
        )

        public fun fromU128(uuidHi: ULong, uuidLo: ULong): GUID = from_u128(uuidHi, uuidLo)
    }
}

public data class IUnknown_Vtbl(
    public var QueryInterface: IUnknown_VtblQueryInterfaceCallback = IUnknown_VtblQueryInterfaceCallback { _, _, _ -> 0 },
    public var AddRef: IUnknown_VtblAddRefCallback = IUnknown_VtblAddRefCallback { _ -> 0u },
    public var Release: IUnknown_VtblAddRefCallback = IUnknown_VtblAddRefCallback { _ -> 0u },
)

public data class IInspectable_Vtbl(
    public var base: IUnknown_Vtbl = IUnknown_Vtbl(),
    public var GetIids: IUnknown_VtblQueryInterfaceCallback = IUnknown_VtblQueryInterfaceCallback { _, _, _ -> 0 },
    public var GetRuntimeClassName: IInspectable_VtblGetRuntimeClassNameCallback = IInspectable_VtblGetRuntimeClassNameCallback { _, _ -> 0 },
    public var GetTrustLevel: IInspectable_VtblGetRuntimeClassNameCallback = IInspectable_VtblGetRuntimeClassNameCallback { _, _ -> 0 },
)
