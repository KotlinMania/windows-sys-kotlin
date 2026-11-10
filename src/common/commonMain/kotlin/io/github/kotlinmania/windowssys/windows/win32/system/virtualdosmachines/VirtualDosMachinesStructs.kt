@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.virtualdosmachines

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.FloatingSaveArea

public data class Globalentry(
    public var dwSize: UInt = 0u,
    public var dwAddress: UInt = 0u,
    public var dwBlockSize: UInt = 0u,
    public var hBlock: Handle = null,
    public var wcLock: UShort = 0u,
    public var wcPageLock: UShort = 0u,
    public var wFlags: UShort = 0u,
    public var wHeapPresent: Bool = 0,
    public var hOwner: Handle = null,
    public var wType: UShort = 0u,
    public var wData: UShort = 0u,
    public var dwNext: UInt = 0u,
    public var dwNextAlt: UInt = 0u,
)

public data class ImageNote(
    public var module: ByteArray = ByteArray(10),
    public var fileName: ByteArray = ByteArray(256),
    public var hModule: UShort = 0u,
    public var hTask: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageNote) return false
        if (!this.module.contentEquals(other.module)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.hModule != other.hModule) return false
        if (this.hTask != other.hTask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.module.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hTask.hashCode()
        return result
    }
}

public data class Moduleentry(
    public var dwSize: UInt = 0u,
    public var szModule: ByteArray = ByteArray(10),
    public var hModule: Handle = null,
    public var wcUsage: UShort = 0u,
    public var szExePath: ByteArray = ByteArray(256),
    public var wNext: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moduleentry) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szModule.contentEquals(other.szModule)) return false
        if (this.hModule != other.hModule) return false
        if (this.wcUsage != other.wcUsage) return false
        if (!this.szExePath.contentEquals(other.szExePath)) return false
        if (this.wNext != other.wNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.wcUsage.hashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        result = 31 * result + this.wNext.hashCode()
        return result
    }
}

public data class SegmentNote(
    public var selector1: UShort = 0u,
    public var selector2: UShort = 0u,
    public var segment: UShort = 0u,
    public var module: ByteArray = ByteArray(10),
    public var fileName: ByteArray = ByteArray(256),
    public var type: UShort = 0u,
    public var length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentNote) return false
        if (this.selector1 != other.selector1) return false
        if (this.selector2 != other.selector2) return false
        if (this.segment != other.segment) return false
        if (!this.module.contentEquals(other.module)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selector1.hashCode()
        result = 31 * result + this.selector2.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.module.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }
}

public data class TempBpNote(
    public var seg: UShort = 0u,
    public var offset: UInt = 0u,
    public var bPM: Bool = 0,
)

public class Vdmcontext(
    public var contextFlags: UInt = 0u,
    public var dr0: UInt = 0u,
    public var dr1: UInt = 0u,
    public var dr2: UInt = 0u,
    public var dr3: UInt = 0u,
    public var dr6: UInt = 0u,
    public var dr7: UInt = 0u,
    public var floatSave: FloatingSaveArea = FloatingSaveArea(),
    public var segGs: UInt = 0u,
    public var segFs: UInt = 0u,
    public var segEs: UInt = 0u,
    public var segDs: UInt = 0u,
    public var edi: UInt = 0u,
    public var esi: UInt = 0u,
    public var ebx: UInt = 0u,
    public var edx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var eax: UInt = 0u,
    public var ebp: UInt = 0u,
    public var eip: UInt = 0u,
    public var segCs: UInt = 0u,
    public var eFlags: UInt = 0u,
    public var esp: UInt = 0u,
    public var segSs: UInt = 0u,
    public var extendedRegisters: UByteArray = UByteArray(512),
)

public class VdmcontextWithoutXsave(
    public var contextFlags: UInt = 0u,
    public var dr0: UInt = 0u,
    public var dr1: UInt = 0u,
    public var dr2: UInt = 0u,
    public var dr3: UInt = 0u,
    public var dr6: UInt = 0u,
    public var dr7: UInt = 0u,
    public var floatSave: FloatingSaveArea = FloatingSaveArea(),
    public var segGs: UInt = 0u,
    public var segFs: UInt = 0u,
    public var segEs: UInt = 0u,
    public var segDs: UInt = 0u,
    public var edi: UInt = 0u,
    public var esi: UInt = 0u,
    public var ebx: UInt = 0u,
    public var edx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var eax: UInt = 0u,
    public var ebp: UInt = 0u,
    public var eip: UInt = 0u,
    public var segCs: UInt = 0u,
    public var eFlags: UInt = 0u,
    public var esp: UInt = 0u,
    public var segSs: UInt = 0u,
)

public data class VdmldtEntry(
    public var limitLow: UShort = 0u,
    public var baseLow: UShort = 0u,
    public var highWord: VdmldtEntry0 = VdmldtEntry0(),
)

public data class VdmldtEntry0(
    public var bytes: VdmldtEntry00 = VdmldtEntry00(),
    public var bits: VdmldtEntry01 = VdmldtEntry01(),
)

public data class VdmldtEntry01(
    public var bitfield: UInt = 0u,
)

public data class VdmldtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
)

public data class VdmSeginfo(
    public var selector: UShort = 0u,
    public var segNumber: UShort = 0u,
    public var length: UInt = 0u,
    public var type: UShort = 0u,
    public var moduleName: ByteArray = ByteArray(9),
    public var fileName: ByteArray = ByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VdmSeginfo) return false
        if (this.selector != other.selector) return false
        if (this.segNumber != other.segNumber) return false
        if (this.length != other.length) return false
        if (this.type != other.type) return false
        if (!this.moduleName.contentEquals(other.moduleName)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selector.hashCode()
        result = 31 * result + this.segNumber.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.moduleName.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}
