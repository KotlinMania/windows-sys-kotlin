@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public data class CSTRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PCSTR = 0L,
)

public data class EXCEPTION_REGISTRATION_RECORD(public var Next: Long = 0L, public var Handler: EXCEPTION_ROUTINE = null)

public data class FLOATING_SAVE_AREA(
    public var ControlWord: UInt = 0u,
    public var StatusWord: UInt = 0u,
    public var TagWord: UInt = 0u,
    public var ErrorOffset: UInt = 0u,
    public var ErrorSelector: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var DataSelector: UInt = 0u,
    public var RegisterArea: UByteArray = UByteArray(80),
    public var Cr0NpxState: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLOATING_SAVE_AREA) return false
        if (this.ControlWord != other.ControlWord) return false
        if (this.StatusWord != other.StatusWord) return false
        if (this.TagWord != other.TagWord) return false
        if (this.ErrorOffset != other.ErrorOffset) return false
        if (this.ErrorSelector != other.ErrorSelector) return false
        if (this.DataOffset != other.DataOffset) return false
        if (this.DataSelector != other.DataSelector) return false
        if (!this.RegisterArea.contentEquals(other.RegisterArea)) return false
        if (this.Cr0NpxState != other.Cr0NpxState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ControlWord.hashCode()
        result = 31 * result + this.StatusWord.hashCode()
        result = 31 * result + this.TagWord.hashCode()
        result = 31 * result + this.ErrorOffset.hashCode()
        result = 31 * result + this.ErrorSelector.hashCode()
        result = 31 * result + this.DataOffset.hashCode()
        result = 31 * result + this.DataSelector.hashCode()
        result = 31 * result + this.RegisterArea.contentHashCode()
        result = 31 * result + this.Cr0NpxState.hashCode()
        return result
    }
}

public data class LIST_ENTRY(public var Flink: Long = 0L, public var Blink: Long = 0L)

public data class LIST_ENTRY32(public var Flink: UInt = 0u, public var Blink: UInt = 0u)

public data class LIST_ENTRY64(public var Flink: ULong = 0uL, public var Blink: ULong = 0uL)

public data class NT_TIB(
    public var ExceptionList: Long = 0L,
    public var StackBase: Long = 0L,
    public var StackLimit: Long = 0L,
    public var SubSystemTib: Long = 0L,
    public var Anonymous: NT_TIB_0 = NT_TIB_0(),
    public var ArbitraryUserPointer: Long = 0L,
    public var Self_: Long = 0L,
)

public data class NT_TIB_0(public var FiberData: Long = 0L, public var Version: UInt = 0u)

public data class OBJECTID(public var Lineage: GUID = GUID(), public var Uniquifier: UInt = 0u)

public data class PROCESSOR_NUMBER(
    public var Group: UShort = 0u,
    public var Number: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class QUAD(public var Anonymous: QUAD_0 = QUAD_0())

public data class QUAD_0(public var UseThisFieldToCopy: Long = 0L, public var DoNotUseThisField: Double = 0.0)

public data class RTL_BALANCED_NODE(public var Anonymous1: RTL_BALANCED_NODE_0 = RTL_BALANCED_NODE_0(), public var Anonymous2: RTL_BALANCED_NODE_1 = RTL_BALANCED_NODE_1())

public data class RTL_BALANCED_NODE_0(public var Children: LongArray = LongArray(2), public var Anonymous: RTL_BALANCED_NODE_0_0 = RTL_BALANCED_NODE_0_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_BALANCED_NODE_0) return false
        if (!this.Children.contentEquals(other.Children)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Children.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class RTL_BALANCED_NODE_0_0(public var Left: Long = 0L, public var Right: Long = 0L)

public data class RTL_BALANCED_NODE_1(public var _bitfield: UByte = 0u, public var ParentValue: ULong = 0uL)

public data class SINGLE_LIST_ENTRY(public var Next: Long = 0L)

public data class SINGLE_LIST_ENTRY32(public var Next: UInt = 0u)

public data class SLIST_ENTRY(public var Next: Long = 0L)

public data class SLIST_HEADER(public var Anonymous: SLIST_HEADER_0 = SLIST_HEADER_0(), public var HeaderX64: SLIST_HEADER_1 = SLIST_HEADER_1())

public data class SLIST_HEADER_0(public var Alignment: ULong = 0uL, public var Region: ULong = 0uL)

public data class SLIST_HEADER_1(public var _bitfield1: ULong = 0uL, public var _bitfield2: ULong = 0uL)

public data class STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PSTR = 0L,
)

public data class STRING32(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: UInt = 0u,
)

public data class STRING64(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: ULong = 0uL,
)

public data class WNF_STATE_NAME(public var Data: UIntArray = UIntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNF_STATE_NAME) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}
