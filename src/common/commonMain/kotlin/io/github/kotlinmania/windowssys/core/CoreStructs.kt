@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128

public fun interface IunknownVtblQueryInterfaceCallback {
    public operator fun invoke(thisRef: COpaquePointer?, iid: COpaquePointer?, iface: COpaquePointer?): Hresult
}

public fun interface IunknownVtblAddRefCallback {
    public operator fun invoke(thisRef: COpaquePointer?): UInt
}

public fun interface IinspectableVtblGetRuntimeClassNameCallback {
    public operator fun invoke(thisRef: COpaquePointer?, value: COpaquePointer?): Hresult
}

public data class Guid(
    public var data1: UInt = 0u,
    public var data2: UShort = 0u,
    public var data3: UShort = 0u,
    public var data4: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Guid) return false
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
        public fun fromU128(uuid: U128): Guid = Guid(data1 = (uuid shr 96).toUInt(), data2 = (uuid shr 80 and U128(0x0uL, 0xffffuL)).toUShort(), data3 = (uuid shr 64 and U128(0x0uL, 0xffffuL)).toUShort(), data4 = run { val _b = ((uuid.toULong())).toULong(); ubyteArrayOf((_b shr 56).toUByte(), (_b shr 48).toUByte(), (_b shr 40).toUByte(), (_b shr 32).toUByte(), (_b shr 24).toUByte(), (_b shr 16).toUByte(), (_b shr 8).toUByte(), _b.toUByte()) })
    }
}

public data class IunknownVtbl(
    public var queryInterface: IunknownVtblQueryInterfaceCallback = IunknownVtblQueryInterfaceCallback { _, _, _ -> 0 },
    public var addRef: IunknownVtblAddRefCallback = IunknownVtblAddRefCallback { _ -> 0u },
    public var release: IunknownVtblAddRefCallback = IunknownVtblAddRefCallback { _ -> 0u },
)

public data class IinspectableVtbl(
    public var base: IunknownVtbl = IunknownVtbl(),
    public var getIids: IunknownVtblQueryInterfaceCallback = IunknownVtblQueryInterfaceCallback { _, _, _ -> 0 },
    public var getRuntimeClassName: IinspectableVtblGetRuntimeClassNameCallback = IinspectableVtblGetRuntimeClassNameCallback { _, _ -> 0 },
    public var getTrustLevel: IinspectableVtblGetRuntimeClassNameCallback = IinspectableVtblGetRuntimeClassNameCallback { _, _ -> 0 },
)
