@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.COpaquePointer

public data class Wow64LdtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
)

public data class XpfMceFlags(
    public var anonymous: XpfMceFlags0 = XpfMceFlags0(),
    public var asULONG: UInt = 0u,
)

public data class XpfMceFlags0(
    public var bitfield: UInt = 0u,
)

public data class XpfMcBankFlags(
    public var anonymous: XpfMcBankFlags0 = XpfMcBankFlags0(),
    public var asUCHAR: UByte = 0u,
)

public data class XpfMcBankFlags0(
    public var bitfield: UByte = 0u,
)

public data class XsaveArea(
    public var legacyState: XsaveFormat = XsaveFormat(),
    public var header: XsaveAreaHeader = XsaveAreaHeader(),
)

public data class XsaveAreaHeader(
    public var mask: ULong = 0uL,
    public var compactionMask: ULong = 0uL,
    public var reserved2: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XsaveAreaHeader) return false
        if (this.mask != other.mask) return false
        if (this.compactionMask != other.compactionMask) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.compactionMask.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class XsaveFormat(
    public var controlWord: UShort = 0u,
    public var statusWord: UShort = 0u,
    public var tagWord: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var errorOpcode: UShort = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var mxCsr: UInt = 0u,
    public var mxCsrMask: UInt = 0u,
    public var floatRegisters: List<M128a> = List(8) { M128a() },
    public var xmmRegisters: List<M128a> = List(16) { M128a() },
    public var reserved4: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XsaveFormat) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.errorOpcode != other.errorOpcode) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.mxCsr != other.mxCsr) return false
        if (this.mxCsrMask != other.mxCsrMask) return false
        if (this.floatRegisters != other.floatRegisters) return false
        if (this.xmmRegisters != other.xmmRegisters) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.errorOpcode.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.mxCsr.hashCode()
        result = 31 * result + this.mxCsrMask.hashCode()
        result = 31 * result + this.floatRegisters.hashCode()
        result = 31 * result + this.xmmRegisters.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        return result
    }
}

public data class XstateConfiguration(
    public var enabledFeatures: ULong = 0uL,
    public var enabledVolatileFeatures: ULong = 0uL,
    public var size: UInt = 0u,
    public var anonymous: XstateConfiguration0 = XstateConfiguration0(),
    public var features: List<XstateFeature> = List(64) { XstateFeature() },
    public var enabledSupervisorFeatures: ULong = 0uL,
    public var alignedFeatures: ULong = 0uL,
    public var allFeatureSize: UInt = 0u,
    public var allFeatures: UIntArray = UIntArray(64),
    public var enabledUserVisibleSupervisorFeatures: ULong = 0uL,
    public var extendedFeatureDisableFeatures: ULong = 0uL,
    public var allNonLargeFeatureSize: UInt = 0u,
    public var spare: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateConfiguration) return false
        if (this.enabledFeatures != other.enabledFeatures) return false
        if (this.enabledVolatileFeatures != other.enabledVolatileFeatures) return false
        if (this.size != other.size) return false
        if (this.anonymous != other.anonymous) return false
        if (this.features != other.features) return false
        if (this.enabledSupervisorFeatures != other.enabledSupervisorFeatures) return false
        if (this.alignedFeatures != other.alignedFeatures) return false
        if (this.allFeatureSize != other.allFeatureSize) return false
        if (!this.allFeatures.contentEquals(other.allFeatures)) return false
        if (this.enabledUserVisibleSupervisorFeatures != other.enabledUserVisibleSupervisorFeatures) return false
        if (this.extendedFeatureDisableFeatures != other.extendedFeatureDisableFeatures) return false
        if (this.allNonLargeFeatureSize != other.allNonLargeFeatureSize) return false
        if (this.spare != other.spare) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enabledFeatures.hashCode()
        result = 31 * result + this.enabledVolatileFeatures.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.features.hashCode()
        result = 31 * result + this.enabledSupervisorFeatures.hashCode()
        result = 31 * result + this.alignedFeatures.hashCode()
        result = 31 * result + this.allFeatureSize.hashCode()
        result = 31 * result + this.allFeatures.contentHashCode()
        result = 31 * result + this.enabledUserVisibleSupervisorFeatures.hashCode()
        result = 31 * result + this.extendedFeatureDisableFeatures.hashCode()
        result = 31 * result + this.allNonLargeFeatureSize.hashCode()
        result = 31 * result + this.spare.hashCode()
        return result
    }
}

public data class XstateConfiguration0(
    public var controlFlags: UInt = 0u,
    public var anonymous: XstateConfiguration00 = XstateConfiguration00(),
)

public data class XstateConfiguration00(
    public var bitfield: UInt = 0u,
)

public data class XstateConfigFeatureMscInfo(
    public var sizeOfInfo: UInt = 0u,
    public var contextSize: UInt = 0u,
    public var enabledFeatures: ULong = 0uL,
    public var features: List<XstateFeature> = List(64) { XstateFeature() },
)

public data class XstateContext(
    public var mask: ULong = 0uL,
    public var length: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var area: XsaveArea? = null,
    public var buffer: COpaquePointer? = null,
)

public data class XstateFeature(
    public var offset: UInt = 0u,
    public var size: UInt = 0u,
)
