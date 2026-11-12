package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

public data class Matrix3x3(
    public var anonymous: Matrix3x30 = Matrix3x30(),
)

public data class Matrix3x30(
    public var anonymous1: Matrix3x300 = Matrix3x300(),
    public var anonymous2: Matrix3x301 = Matrix3x301(),
    public var m: FloatArray = FloatArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Matrix3x30) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.m.contentEquals(other.m)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.m.contentHashCode()
        return result
    }
}

public data class Matrix3x300(
    public var a11: Float = 0.0f,
    public var a12: Float = 0.0f,
    public var a13: Float = 0.0f,
    public var a21: Float = 0.0f,
    public var a22: Float = 0.0f,
    public var a23: Float = 0.0f,
    public var a31: Float = 0.0f,
    public var a32: Float = 0.0f,
    public var a33: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Matrix3x300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Matrix3x300> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Matrix3x300 =
                    Matrix3x300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Matrix3x300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.a11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.a12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.a13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.a21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.a22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.a23)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 24L, value.a31)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.a32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.a33)
                }
            }
    }
}

public data class Matrix3x301(
    public var v1: Vec3d = Vec3d(),
    public var v2: Vec3d = Vec3d(),
    public var v3: Vec3d = Vec3d(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Matrix3x301> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Matrix3x301> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Matrix3x301 =
                    Matrix3x301(
                        (Vec3d.typeLayout()).readNative(addr),
                        (Vec3d.typeLayout()).readNative(addr + 12L),
                        (Vec3d.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Matrix3x301) {
                    (Vec3d.typeLayout()).writeNative(addr, value.v1)
                    (Vec3d.typeLayout()).writeNative(addr + 12L, value.v2)
                    (Vec3d.typeLayout()).writeNative(addr + 24L, value.v3)
                }
            }
    }
}

public data class Quaternion(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Quaternion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Quaternion> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Quaternion =
                    Quaternion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Quaternion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.w)
                }
            }
    }
}

public data class SensorCollectionList(
    public var allocatedSizeInBytes: UInt = 0u,
    public var count: UInt = 0u,
    public var list: List<SensorValuePair> = List(1) { SensorValuePair() },
)

public data class SensorPropertyList(
    public var allocatedSizeInBytes: UInt = 0u,
    public var count: UInt = 0u,
    public var list: List<Propertykey> = List(1) { Propertykey() },
)

public data class SensorValuePair(
    public var key: Propertykey = Propertykey(),
    public var value: Propvariant = Propvariant(),
)

public data class Vec3d(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vec3d> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vec3d> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Vec3d =
                    Vec3d(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Vec3d) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                }
            }
    }
}
