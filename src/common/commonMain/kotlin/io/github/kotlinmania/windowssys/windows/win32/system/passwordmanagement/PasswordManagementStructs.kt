@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

public data class CypherBlock(
    public var data: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CypherBlock) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}

public data class EncryptedLmOwfPassword(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
)

public data class LmOwfPassword(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
)

public data class SamprEncryptedUserPassword(
    public var buffer: UByteArray = UByteArray(516),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SamprEncryptedUserPassword) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int = this.buffer.contentHashCode()
}
