package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

public data class Matrix3x3(public var anonymous: Matrix3x30 = Matrix3x30())

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
)

public data class Matrix3x301(
    public var v1: Vec3d = Vec3d(),
    public var v2: Vec3d = Vec3d(),
    public var v3: Vec3d = Vec3d(),
)

public data class Quaternion(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
)

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

public data class SensorValuePair(public var key: Propertykey = Propertykey(), public var value: Propvariant = Propvariant())

public data class Vec3d(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
)
