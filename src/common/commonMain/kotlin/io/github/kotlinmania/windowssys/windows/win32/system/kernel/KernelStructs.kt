@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr

public data class Cstring(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pcstr = null,
)

public data class ExceptionRegistrationRecord(
    public var next: ExceptionRegistrationRecord? = null,
    public var handler: ExceptionRoutine = null,
)

public data class FloatingSaveArea(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var tagWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var registerArea: UByteArray = UByteArray(80),
    public var cr0NpxState: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FloatingSaveArea) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (!this.registerArea.contentEquals(other.registerArea)) return false
        if (this.cr0NpxState != other.cr0NpxState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.registerArea.contentHashCode()
        result = 31 * result + this.cr0NpxState.hashCode()
        return result
    }
}

public data class ListEntry(
    public var flink: ListEntry? = null,
    public var blink: ListEntry? = null,
)

public data class ListEntry32(
    public var flink: UInt = 0u,
    public var blink: UInt = 0u,
)

public data class ListEntry64(
    public var flink: ULong = 0uL,
    public var blink: ULong = 0uL,
)

public data class NtTib(
    public var exceptionList: ExceptionRegistrationRecord? = null,
    public var stackBase: COpaquePointer? = null,
    public var stackLimit: COpaquePointer? = null,
    public var subSystemTib: COpaquePointer? = null,
    public var anonymous: NtTib0 = NtTib0(),
    public var arbitraryUserPointer: COpaquePointer? = null,
    public var self: NtTib? = null,
)

public data class NtTib0(
    public var fiberData: COpaquePointer? = null,
    public var version: UInt = 0u,
)

public data class Objectid(
    public var lineage: Guid = Guid(),
    public var uniquifier: UInt = 0u,
)

public data class ProcessorNumber(
    public var group: UShort = 0u,
    public var number: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class Quad(
    public var anonymous: Quad0 = Quad0(),
)

public data class Quad0(
    public var useThisFieldToCopy: Long = 0L,
    public var doNotUseThisField: Double = 0.0,
)

public data class RtlBalancedNode(
    public var anonymous1: RtlBalancedNode0 = RtlBalancedNode0(),
    public var anonymous2: RtlBalancedNode1 = RtlBalancedNode1(),
)

public data class RtlBalancedNode0(
    public var children: List<RtlBalancedNode> = List(2) { RtlBalancedNode() },
    public var anonymous: RtlBalancedNode00 = RtlBalancedNode00(),
)

public data class RtlBalancedNode00(
    public var left: RtlBalancedNode? = null,
    public var right: RtlBalancedNode? = null,
)

public data class RtlBalancedNode1(
    public var bitfield: UByte = 0u,
    public var parentValue: Int = 0,
)

public data class SingleListEntry(
    public var next: SingleListEntry? = null,
)

public data class SingleListEntry32(
    public var next: UInt = 0u,
)

public data class SlistEntry(
    public var next: SlistEntry? = null,
)

public data class SlistHeader(
    public var anonymous: SlistHeader0 = SlistHeader0(),
    public var headerX64: SlistHeader1 = SlistHeader1(),
)

public data class SlistHeader0(
    public var alignment: ULong = 0uL,
    public var region: ULong = 0uL,
)

public data class SlistHeader1(
    public var bitfield1: ULong = 0uL,
    public var bitfield2: ULong = 0uL,
)

public data class String(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pstr = null,
)

public data class String32(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: UInt = 0u,
)

public data class String64(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: ULong = 0uL,
)

public data class WnfStateName(
    public var data: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnfStateName) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}
