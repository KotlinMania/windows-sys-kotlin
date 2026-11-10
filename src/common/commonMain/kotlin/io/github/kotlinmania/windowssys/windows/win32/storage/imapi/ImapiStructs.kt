@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.core.Guid

public data class ImmpMpvStoreDriverHandle(public var guidSignature: Guid = Guid())

public data class SPropAttrArray(public var cValues: UInt = 0u, public var aPropAttr: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPropAttrArray) return false
        if (this.cValues != other.cValues) return false
        if (!this.aPropAttr.contentEquals(other.aPropAttr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.aPropAttr.contentHashCode()
        return result
    }
}

public data class TagImmpidGuidlistItem(
    public var pguid: Guid? = null,
    public var dwStart: UInt = 0u,
    public var dwLast: UInt = 0u,
)
