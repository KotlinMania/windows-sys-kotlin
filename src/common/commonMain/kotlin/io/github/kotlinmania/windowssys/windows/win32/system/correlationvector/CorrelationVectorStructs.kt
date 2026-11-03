package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

public data class CORRELATION_VECTOR(public var Version: Byte = 0, public var Vector: ByteArray = ByteArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CORRELATION_VECTOR) return false
        if (this.Version != other.Version) return false
        if (!this.Vector.contentEquals(other.Vector)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Vector.contentHashCode()
        return result
    }
}
