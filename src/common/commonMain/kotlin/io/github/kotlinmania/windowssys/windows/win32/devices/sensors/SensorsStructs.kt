package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

public data class MATRIX3X3(public var Anonymous: MATRIX3X3_0 = MATRIX3X3_0())

public data class MATRIX3X3_0(
    public var Anonymous1: MATRIX3X3_0_0 = MATRIX3X3_0_0(),
    public var Anonymous2: MATRIX3X3_0_1 = MATRIX3X3_0_1(),
    public var M: FloatArray = FloatArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MATRIX3X3_0) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (!this.M.contentEquals(other.M)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.M.contentHashCode()
        return result
    }
}

public data class MATRIX3X3_0_0(
    public var A11: Float = 0.0f,
    public var A12: Float = 0.0f,
    public var A13: Float = 0.0f,
    public var A21: Float = 0.0f,
    public var A22: Float = 0.0f,
    public var A23: Float = 0.0f,
    public var A31: Float = 0.0f,
    public var A32: Float = 0.0f,
    public var A33: Float = 0.0f,
)

public data class MATRIX3X3_0_1(
    public var V1: VEC3D = VEC3D(),
    public var V2: VEC3D = VEC3D(),
    public var V3: VEC3D = VEC3D(),
)

public data class QUATERNION(
    public var X: Float = 0.0f,
    public var Y: Float = 0.0f,
    public var Z: Float = 0.0f,
    public var W: Float = 0.0f,
)

public data class SENSOR_COLLECTION_LIST(
    public var AllocatedSizeInBytes: UInt = 0u,
    public var Count: UInt = 0u,
    public var List: List<SENSOR_VALUE_PAIR> = List(1) { SENSOR_VALUE_PAIR() },
)

public data class SENSOR_PROPERTY_LIST(
    public var AllocatedSizeInBytes: UInt = 0u,
    public var Count: UInt = 0u,
    public var List: List<Foundation.PROPERTYKEY> = List(1) { Foundation.PROPERTYKEY() },
)

public data class SENSOR_VALUE_PAIR(public var Key: Foundation.PROPERTYKEY = Foundation.PROPERTYKEY(), public var Value: System.Com.StructuredStorage.PROPVARIANT = System.Com.StructuredStorage.PROPVARIANT())

public data class VEC3D(
    public var X: Float = 0.0f,
    public var Y: Float = 0.0f,
    public var Z: Float = 0.0f,
)
