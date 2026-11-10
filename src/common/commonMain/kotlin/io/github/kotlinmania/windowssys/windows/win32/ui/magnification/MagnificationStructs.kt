package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

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
}
