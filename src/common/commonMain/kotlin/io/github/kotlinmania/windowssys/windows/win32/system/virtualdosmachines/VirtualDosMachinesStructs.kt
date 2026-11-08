@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.virtualdosmachines

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.FLOATING_SAVE_AREA

public data class GLOBALENTRY(
    public var dwSize: UInt = 0u,
    public var dwAddress: UInt = 0u,
    public var dwBlockSize: UInt = 0u,
    public var hBlock: HANDLE = 0L,
    public var wcLock: UShort = 0u,
    public var wcPageLock: UShort = 0u,
    public var wFlags: UShort = 0u,
    public var wHeapPresent: BOOL = 0,
    public var hOwner: HANDLE = 0L,
    public var wType: UShort = 0u,
    public var wData: UShort = 0u,
    public var dwNext: UInt = 0u,
    public var dwNextAlt: UInt = 0u,
)

public data class IMAGE_NOTE(
    public var Module: ByteArray = ByteArray(10),
    public var FileName: ByteArray = ByteArray(256),
    public var hModule: UShort = 0u,
    public var hTask: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_NOTE) return false
        if (!this.Module.contentEquals(other.Module)) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.hModule != other.hModule) return false
        if (this.hTask != other.hTask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Module.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hTask.hashCode()
        return result
    }
}

public data class MODULEENTRY(
    public var dwSize: UInt = 0u,
    public var szModule: ByteArray = ByteArray(10),
    public var hModule: HANDLE = 0L,
    public var wcUsage: UShort = 0u,
    public var szExePath: ByteArray = ByteArray(256),
    public var wNext: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODULEENTRY) return false
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

public data class SEGMENT_NOTE(
    public var Selector1: UShort = 0u,
    public var Selector2: UShort = 0u,
    public var Segment: UShort = 0u,
    public var Module: ByteArray = ByteArray(10),
    public var FileName: ByteArray = ByteArray(256),
    public var Type: UShort = 0u,
    public var Length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEGMENT_NOTE) return false
        if (this.Selector1 != other.Selector1) return false
        if (this.Selector2 != other.Selector2) return false
        if (this.Segment != other.Segment) return false
        if (!this.Module.contentEquals(other.Module)) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.Type != other.Type) return false
        if (this.Length != other.Length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Selector1.hashCode()
        result = 31 * result + this.Selector2.hashCode()
        result = 31 * result + this.Segment.hashCode()
        result = 31 * result + this.Module.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Length.hashCode()
        return result
    }
}

public data class TEMP_BP_NOTE(
    public var Seg: UShort = 0u,
    public var Offset: UInt = 0u,
    public var bPM: BOOL = 0,
)

public class VDMCONTEXT(
    public var ContextFlags: UInt = 0u,
    public var Dr0: UInt = 0u,
    public var Dr1: UInt = 0u,
    public var Dr2: UInt = 0u,
    public var Dr3: UInt = 0u,
    public var Dr6: UInt = 0u,
    public var Dr7: UInt = 0u,
    public var FloatSave: FLOATING_SAVE_AREA = FLOATING_SAVE_AREA(),
    public var SegGs: UInt = 0u,
    public var SegFs: UInt = 0u,
    public var SegEs: UInt = 0u,
    public var SegDs: UInt = 0u,
    public var Edi: UInt = 0u,
    public var Esi: UInt = 0u,
    public var Ebx: UInt = 0u,
    public var Edx: UInt = 0u,
    public var Ecx: UInt = 0u,
    public var Eax: UInt = 0u,
    public var Ebp: UInt = 0u,
    public var Eip: UInt = 0u,
    public var SegCs: UInt = 0u,
    public var EFlags: UInt = 0u,
    public var Esp: UInt = 0u,
    public var SegSs: UInt = 0u,
    public var ExtendedRegisters: UByteArray = UByteArray(512),
)

public class VDMCONTEXT_WITHOUT_XSAVE(
    public var ContextFlags: UInt = 0u,
    public var Dr0: UInt = 0u,
    public var Dr1: UInt = 0u,
    public var Dr2: UInt = 0u,
    public var Dr3: UInt = 0u,
    public var Dr6: UInt = 0u,
    public var Dr7: UInt = 0u,
    public var FloatSave: FLOATING_SAVE_AREA = FLOATING_SAVE_AREA(),
    public var SegGs: UInt = 0u,
    public var SegFs: UInt = 0u,
    public var SegEs: UInt = 0u,
    public var SegDs: UInt = 0u,
    public var Edi: UInt = 0u,
    public var Esi: UInt = 0u,
    public var Ebx: UInt = 0u,
    public var Edx: UInt = 0u,
    public var Ecx: UInt = 0u,
    public var Eax: UInt = 0u,
    public var Ebp: UInt = 0u,
    public var Eip: UInt = 0u,
    public var SegCs: UInt = 0u,
    public var EFlags: UInt = 0u,
    public var Esp: UInt = 0u,
    public var SegSs: UInt = 0u,
)

public data class VDMLDT_ENTRY(
    public var LimitLow: UShort = 0u,
    public var BaseLow: UShort = 0u,
    public var HighWord: VDMLDT_ENTRY_0 = VDMLDT_ENTRY_0(),
)

public data class VDMLDT_ENTRY_0(public var Bytes: VDMLDT_ENTRY_0_0 = VDMLDT_ENTRY_0_0(), public var Bits: VDMLDT_ENTRY_0_1 = VDMLDT_ENTRY_0_1())

public data class VDMLDT_ENTRY_0_1(public var _bitfield: UInt = 0u)

public data class VDMLDT_ENTRY_0_0(
    public var BaseMid: UByte = 0u,
    public var Flags1: UByte = 0u,
    public var Flags2: UByte = 0u,
    public var BaseHi: UByte = 0u,
)

public data class VDM_SEGINFO(
    public var Selector: UShort = 0u,
    public var SegNumber: UShort = 0u,
    public var Length: UInt = 0u,
    public var Type: UShort = 0u,
    public var ModuleName: ByteArray = ByteArray(9),
    public var FileName: ByteArray = ByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VDM_SEGINFO) return false
        if (this.Selector != other.Selector) return false
        if (this.SegNumber != other.SegNumber) return false
        if (this.Length != other.Length) return false
        if (this.Type != other.Type) return false
        if (!this.ModuleName.contentEquals(other.ModuleName)) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Selector.hashCode()
        result = 31 * result + this.SegNumber.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.ModuleName.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}
