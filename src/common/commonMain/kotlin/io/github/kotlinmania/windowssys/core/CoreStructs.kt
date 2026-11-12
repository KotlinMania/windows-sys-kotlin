@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.U128

public fun interface IunknownVtblQueryInterfaceCallback {
    public operator fun invoke(thisRef: MutPtr, iid: ConstPtr, iface: MutPtr): Hresult
}

public fun interface IunknownVtblAddRefCallback {
    public operator fun invoke(thisRef: MutPtr): UInt
}

public fun interface IinspectableVtblGetIidsCallback {
    public operator fun invoke(thisRef: MutPtr, count: MutPtr, values: MutPtr): Hresult
}

public fun interface IinspectableVtblGetRuntimeClassNameCallback {
    public operator fun invoke(thisRef: MutPtr, value: MutPtr): Hresult
}

public fun interface IinspectableVtblGetTrustLevelCallback {
    public operator fun invoke(thisRef: MutPtr, value: MutPtr): Hresult
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Guid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Guid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Guid =
                    Guid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Guid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.data1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.data2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.data3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.data4.toList())
                }
            }

        public fun fromU128(uuid: U128): Guid =
            Guid(
                data1 = (uuid shr 96).toUInt(),
                data2 = (uuid shr 80 and U128(0x0uL, 0xffffuL)).toUShort(),
                data3 = (uuid shr 64 and U128(0x0uL, 0xffffuL)).toUShort(),
                data4 =
                    run {
                        val rawBits = (uuid.toULong())
                        ubyteArrayOf((rawBits shr 56).toUByte(), (rawBits shr 48).toUByte(), (rawBits shr 40).toUByte(), (rawBits shr 32).toUByte(), (rawBits shr 24).toUByte(), (rawBits shr 16).toUByte(), (rawBits shr 8).toUByte(), rawBits.toUByte())
                    },
            )
    }
}

public data class IunknownVtbl(
    public var queryInterface: IunknownVtblQueryInterfaceCallback = IunknownVtblQueryInterfaceCallback { _, _, _ -> 0 },
    public var addRef: IunknownVtblAddRefCallback = IunknownVtblAddRefCallback { _ -> 0u },
    public var release: IunknownVtblAddRefCallback = IunknownVtblAddRefCallback { _ -> 0u },
)

public data class IinspectableVtbl(
    public var base: IunknownVtbl = IunknownVtbl(),
    public var getIids: IinspectableVtblGetIidsCallback = IinspectableVtblGetIidsCallback { _, _, _ -> 0 },
    public var getRuntimeClassName: IinspectableVtblGetRuntimeClassNameCallback = IinspectableVtblGetRuntimeClassNameCallback { _, _ -> 0 },
    public var getTrustLevel: IinspectableVtblGetTrustLevelCallback = IinspectableVtblGetTrustLevelCallback { _, _ -> 0 },
)
