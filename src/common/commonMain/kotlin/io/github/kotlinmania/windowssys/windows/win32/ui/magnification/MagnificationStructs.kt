package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.GUID

public data class MAGCOLOREFFECT(public var transform: FloatArray = FloatArray(25)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MAGCOLOREFFECT) return false
        if (!this.transform.contentEquals(other.transform)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.transform.contentHashCode()
    }
}

public data class MAGIMAGEHEADER(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: GUID = GUID(),
    public var stride: UInt = 0u,
    public var offset: UInt = 0u,
    public var cbSize: ULong = 0uL,
)

public data class MAGTRANSFORM(public var v: FloatArray = FloatArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MAGTRANSFORM) return false
        if (!this.v.contentEquals(other.v)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.v.contentHashCode()
    }
}
