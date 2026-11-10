package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

public data class CorrelationVector(public var version: Byte = 0, public var vector: ByteArray = ByteArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorrelationVector) return false
        if (this.version != other.version) return false
        if (!this.vector.contentEquals(other.vector)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.vector.contentHashCode()
        return result
    }
}
