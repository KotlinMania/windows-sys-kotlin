@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

public data class CYPHER_BLOCK(public var data: ByteArray = ByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CYPHER_BLOCK) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class ENCRYPTED_LM_OWF_PASSWORD(public var data: List<CYPHER_BLOCK> = List(2) { CYPHER_BLOCK() })

public data class LM_OWF_PASSWORD(public var data: List<CYPHER_BLOCK> = List(2) { CYPHER_BLOCK() })

public data class SAMPR_ENCRYPTED_USER_PASSWORD(public var Buffer: UByteArray = UByteArray(516)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAMPR_ENCRYPTED_USER_PASSWORD) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Buffer.contentHashCode()
    }
}
