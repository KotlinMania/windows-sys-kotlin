@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.nfp

public data class SubscribedMessage(
    public var cbPayloadHint: UInt = 0u,
    public var payload: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubscribedMessage) return false
        if (this.cbPayloadHint != other.cbPayloadHint) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbPayloadHint.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }
}
