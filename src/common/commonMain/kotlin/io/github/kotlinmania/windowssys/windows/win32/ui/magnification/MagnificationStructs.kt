package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid

public data class Magcoloreffect(
    public var transform: FloatArray = FloatArray(25),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Magcoloreffect) return false
        if (!this.transform.contentEquals(other.transform)) return false
        return true
    }

    override fun hashCode(): Int = this.transform.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Magcoloreffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Magcoloreffect> {
                override val sizeBytes: Long = 100L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Magcoloreffect =
                    Magcoloreffect(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (25).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Magcoloreffect) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (25).toInt())
                    ).writeNative(addr, value.transform)
                }
            }
    }
}

public data class Magimageheader(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: Guid = Guid(),
    public var stride: UInt = 0u,
    public var offset: UInt = 0u,
    public var cbSize: Int = 0,
)

public data class Magtransform(
    public var v: FloatArray = FloatArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Magtransform) return false
        if (!this.v.contentEquals(other.v)) return false
        return true
    }

    override fun hashCode(): Int = this.v.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Magtransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Magtransform> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Magtransform =
                    Magtransform(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Magtransform) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                    ).writeNative(addr, value.v)
                }
            }
    }
}
