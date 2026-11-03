@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

public data class WOW64_LDT_ENTRY_0_0(
    public var BaseMid: UByte = 0u,
    public var Flags1: UByte = 0u,
    public var Flags2: UByte = 0u,
    public var BaseHi: UByte = 0u,
)

public data class XPF_MCE_FLAGS(public var Anonymous: XPF_MCE_FLAGS_0 = XPF_MCE_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class XPF_MCE_FLAGS_0(public var _bitfield: UInt = 0u)

public data class XPF_MC_BANK_FLAGS(public var Anonymous: XPF_MC_BANK_FLAGS_0 = XPF_MC_BANK_FLAGS_0(), public var AsUCHAR: UByte = 0u)

public data class XPF_MC_BANK_FLAGS_0(public var _bitfield: UByte = 0u)

public data class XSAVE_AREA(public var LegacyState: XSAVE_FORMAT = XSAVE_FORMAT(), public var Header: XSAVE_AREA_HEADER = XSAVE_AREA_HEADER())

public data class XSAVE_AREA_HEADER(
    public var Mask: ULong = 0uL,
    public var CompactionMask: ULong = 0uL,
    public var Reserved2: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XSAVE_AREA_HEADER) return false
        if (this.Mask != other.Mask) return false
        if (this.CompactionMask != other.CompactionMask) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Mask.hashCode()
        result = 31 * result + this.CompactionMask.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class XSAVE_FORMAT(
    public var ControlWord: UShort = 0u,
    public var StatusWord: UShort = 0u,
    public var TagWord: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var ErrorOpcode: UShort = 0u,
    public var ErrorOffset: UInt = 0u,
    public var ErrorSelector: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var DataOffset: UInt = 0u,
    public var DataSelector: UShort = 0u,
    public var Reserved3: UShort = 0u,
    public var MxCsr: UInt = 0u,
    public var MxCsr_Mask: UInt = 0u,
    public var FloatRegisters: List<M128A> = List(8) { M128A() },
    public var XmmRegisters: List<M128A> = List(16) { M128A() },
    public var Reserved4: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XSAVE_FORMAT) return false
        if (this.ControlWord != other.ControlWord) return false
        if (this.StatusWord != other.StatusWord) return false
        if (this.TagWord != other.TagWord) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.ErrorOpcode != other.ErrorOpcode) return false
        if (this.ErrorOffset != other.ErrorOffset) return false
        if (this.ErrorSelector != other.ErrorSelector) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.DataOffset != other.DataOffset) return false
        if (this.DataSelector != other.DataSelector) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (this.MxCsr != other.MxCsr) return false
        if (this.MxCsr_Mask != other.MxCsr_Mask) return false
        if (this.FloatRegisters != other.FloatRegisters) return false
        if (this.XmmRegisters != other.XmmRegisters) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ControlWord.hashCode()
        result = 31 * result + this.StatusWord.hashCode()
        result = 31 * result + this.TagWord.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.ErrorOpcode.hashCode()
        result = 31 * result + this.ErrorOffset.hashCode()
        result = 31 * result + this.ErrorSelector.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.DataOffset.hashCode()
        result = 31 * result + this.DataSelector.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.MxCsr.hashCode()
        result = 31 * result + this.MxCsr_Mask.hashCode()
        result = 31 * result + this.FloatRegisters.hashCode()
        result = 31 * result + this.XmmRegisters.hashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        return result
    }
}

public data class XSTATE_CONFIGURATION(
    public var EnabledFeatures: ULong = 0uL,
    public var EnabledVolatileFeatures: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Anonymous: XSTATE_CONFIGURATION_0 = XSTATE_CONFIGURATION_0(),
    public var Features: List<XSTATE_FEATURE> = List(64) { XSTATE_FEATURE() },
    public var EnabledSupervisorFeatures: ULong = 0uL,
    public var AlignedFeatures: ULong = 0uL,
    public var AllFeatureSize: UInt = 0u,
    public var AllFeatures: UIntArray = UIntArray(64),
    public var EnabledUserVisibleSupervisorFeatures: ULong = 0uL,
    public var ExtendedFeatureDisableFeatures: ULong = 0uL,
    public var AllNonLargeFeatureSize: UInt = 0u,
    public var Spare: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XSTATE_CONFIGURATION) return false
        if (this.EnabledFeatures != other.EnabledFeatures) return false
        if (this.EnabledVolatileFeatures != other.EnabledVolatileFeatures) return false
        if (this.Size != other.Size) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.Features != other.Features) return false
        if (this.EnabledSupervisorFeatures != other.EnabledSupervisorFeatures) return false
        if (this.AlignedFeatures != other.AlignedFeatures) return false
        if (this.AllFeatureSize != other.AllFeatureSize) return false
        if (!this.AllFeatures.contentEquals(other.AllFeatures)) return false
        if (this.EnabledUserVisibleSupervisorFeatures != other.EnabledUserVisibleSupervisorFeatures) return false
        if (this.ExtendedFeatureDisableFeatures != other.ExtendedFeatureDisableFeatures) return false
        if (this.AllNonLargeFeatureSize != other.AllNonLargeFeatureSize) return false
        if (this.Spare != other.Spare) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EnabledFeatures.hashCode()
        result = 31 * result + this.EnabledVolatileFeatures.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Features.hashCode()
        result = 31 * result + this.EnabledSupervisorFeatures.hashCode()
        result = 31 * result + this.AlignedFeatures.hashCode()
        result = 31 * result + this.AllFeatureSize.hashCode()
        result = 31 * result + this.AllFeatures.contentHashCode()
        result = 31 * result + this.EnabledUserVisibleSupervisorFeatures.hashCode()
        result = 31 * result + this.ExtendedFeatureDisableFeatures.hashCode()
        result = 31 * result + this.AllNonLargeFeatureSize.hashCode()
        result = 31 * result + this.Spare.hashCode()
        return result
    }
}

public data class XSTATE_CONFIGURATION_0(public var ControlFlags: UInt = 0u, public var Anonymous: XSTATE_CONFIGURATION_0_0 = XSTATE_CONFIGURATION_0_0())

public data class XSTATE_CONFIGURATION_0_0(public var _bitfield: UInt = 0u)

public data class XSTATE_CONFIG_FEATURE_MSC_INFO(
    public var SizeOfInfo: UInt = 0u,
    public var ContextSize: UInt = 0u,
    public var EnabledFeatures: ULong = 0uL,
    public var Features: List<XSTATE_FEATURE> = List(64) { XSTATE_FEATURE() },
)

public data class XSTATE_CONTEXT(
    public var Mask: ULong = 0uL,
    public var Length: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Area: Long = 0L,
    public var Buffer: Long = 0L,
)

public data class XSTATE_FEATURE(public var Offset: UInt = 0u, public var Size: UInt = 0u)
