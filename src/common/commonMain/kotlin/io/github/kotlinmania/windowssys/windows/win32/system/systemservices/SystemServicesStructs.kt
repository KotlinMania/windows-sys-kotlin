@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SID
import io.github.kotlinmania.windowssys.windows.win32.security.SID_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_USER

public data class ANON_OBJECT_HEADER(
    public var Sig1: UShort = 0u,
    public var Sig2: UShort = 0u,
    public var Version: UShort = 0u,
    public var Machine: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var ClassID: GUID = GUID(),
    public var SizeOfData: UInt = 0u,
)

public data class ANON_OBJECT_HEADER_BIGOBJ(
    public var Sig1: UShort = 0u,
    public var Sig2: UShort = 0u,
    public var Version: UShort = 0u,
    public var Machine: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var ClassID: GUID = GUID(),
    public var SizeOfData: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MetaDataSize: UInt = 0u,
    public var MetaDataOffset: UInt = 0u,
    public var NumberOfSections: UInt = 0u,
    public var PointerToSymbolTable: UInt = 0u,
    public var NumberOfSymbols: UInt = 0u,
)

public data class ANON_OBJECT_HEADER_V2(
    public var Sig1: UShort = 0u,
    public var Sig2: UShort = 0u,
    public var Version: UShort = 0u,
    public var Machine: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var ClassID: GUID = GUID(),
    public var SizeOfData: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MetaDataSize: UInt = 0u,
    public var MetaDataOffset: UInt = 0u,
)

public data class APPLICATIONLAUNCH_SETTING_VALUE(
    public var ActivationTime: Long = 0L,
    public var Flags: UInt = 0u,
    public var ButtonInstanceID: UInt = 0u,
)

public data class COMPONENT_FILTER(public var ComponentFlags: UInt = 0u)

public data class DISPATCHER_CONTEXT_NONVOLREG_ARM64(public var Buffer: UByteArray = UByteArray(152), public var Anonymous: DISPATCHER_CONTEXT_NONVOLREG_ARM64_0 = DISPATCHER_CONTEXT_NONVOLREG_ARM64_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPATCHER_CONTEXT_NONVOLREG_ARM64) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Buffer.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DISPATCHER_CONTEXT_NONVOLREG_ARM64_0(public var GpNvRegs: ULongArray = ULongArray(11), public var FpNvRegs: DoubleArray = DoubleArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPATCHER_CONTEXT_NONVOLREG_ARM64_0) return false
        if (!this.GpNvRegs.contentEquals(other.GpNvRegs)) return false
        if (!this.FpNvRegs.contentEquals(other.FpNvRegs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GpNvRegs.contentHashCode()
        result = 31 * result + this.FpNvRegs.contentHashCode()
        return result
    }
}

public data class ENLISTMENT_BASIC_INFORMATION(
    public var EnlistmentId: GUID = GUID(),
    public var TransactionId: GUID = GUID(),
    public var ResourceManagerId: GUID = GUID(),
)

public data class ENLISTMENT_CRM_INFORMATION(
    public var CrmTransactionManagerId: GUID = GUID(),
    public var CrmResourceManagerId: GUID = GUID(),
    public var CrmEnlistmentId: GUID = GUID(),
)

public data class FILE_NOTIFY_FULL_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var Action: UInt = 0u,
    public var CreationTime: Long = 0L,
    public var LastModificationTime: Long = 0L,
    public var LastChangeTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var AllocatedLength: Long = 0L,
    public var FileSize: Long = 0L,
    public var FileAttributes: UInt = 0u,
    public var Anonymous: FILE_NOTIFY_FULL_INFORMATION_0 = FILE_NOTIFY_FULL_INFORMATION_0(),
    public var FileId: Long = 0L,
    public var ParentFileId: Long = 0L,
    public var FileNameLength: UShort = 0u,
    public var FileNameFlags: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_NOTIFY_FULL_INFORMATION) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Action != other.Action) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.LastModificationTime != other.LastModificationTime) return false
        if (this.LastChangeTime != other.LastChangeTime) return false
        if (this.LastAccessTime != other.LastAccessTime) return false
        if (this.AllocatedLength != other.AllocatedLength) return false
        if (this.FileSize != other.FileSize) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.FileId != other.FileId) return false
        if (this.ParentFileId != other.ParentFileId) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.FileNameFlags != other.FileNameFlags) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Action.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.LastModificationTime.hashCode()
        result = 31 * result + this.LastChangeTime.hashCode()
        result = 31 * result + this.LastAccessTime.hashCode()
        result = 31 * result + this.AllocatedLength.hashCode()
        result = 31 * result + this.FileSize.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.ParentFileId.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileNameFlags.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class FILE_NOTIFY_FULL_INFORMATION_0(public var ReparsePointTag: UInt = 0u, public var EaSize: UInt = 0u)

public data class GDI_NONREMOTE(public var fContext: Int = 0, public var u: GDI_NONREMOTE_0 = GDI_NONREMOTE_0())

public data class GDI_NONREMOTE_0(public var hInproc: Int = 0, public var hRemote: Long = 0L)

public data class HEAP_OPTIMIZE_RESOURCES_INFORMATION(public var Version: UInt = 0u, public var Flags: UInt = 0u)

public data class HIBERFILE_BUCKET(public var MaxPhysicalMemory: ULong = 0uL, public var PhysicalMemoryPercent: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HIBERFILE_BUCKET) return false
        if (this.MaxPhysicalMemory != other.MaxPhysicalMemory) return false
        if (!this.PhysicalMemoryPercent.contentEquals(other.PhysicalMemoryPercent)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxPhysicalMemory.hashCode()
        result = 31 * result + this.PhysicalMemoryPercent.contentHashCode()
        return result
    }
}

public data class IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY(
    public var BeginAddress: ULong = 0uL,
    public var EndAddress: ULong = 0uL,
    public var ExceptionHandler: ULong = 0uL,
    public var HandlerData: ULong = 0uL,
    public var PrologEndAddress: ULong = 0uL,
)

public data class IMAGE_ALPHA_RUNTIME_FUNCTION_ENTRY(
    public var BeginAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var ExceptionHandler: UInt = 0u,
    public var HandlerData: UInt = 0u,
    public var PrologEndAddress: UInt = 0u,
)

public data class IMAGE_ARCHITECTURE_ENTRY(public var FixupInstRVA: UInt = 0u, public var NewInst: UInt = 0u)

public data class IMAGE_ARCHITECTURE_HEADER(public var _bitfield: UInt = 0u, public var FirstEntryRVA: UInt = 0u)

public data class IMAGE_ARCHIVE_MEMBER_HEADER(
    public var Name: UByteArray = UByteArray(16),
    public var Date: UByteArray = UByteArray(12),
    public var UserID: UByteArray = UByteArray(6),
    public var GroupID: UByteArray = UByteArray(6),
    public var Mode: UByteArray = UByteArray(8),
    public var Size: UByteArray = UByteArray(10),
    public var EndHeader: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_ARCHIVE_MEMBER_HEADER) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (!this.Date.contentEquals(other.Date)) return false
        if (!this.UserID.contentEquals(other.UserID)) return false
        if (!this.GroupID.contentEquals(other.GroupID)) return false
        if (!this.Mode.contentEquals(other.Mode)) return false
        if (!this.Size.contentEquals(other.Size)) return false
        if (!this.EndHeader.contentEquals(other.EndHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Name.contentHashCode()
        result = 31 * result + this.Date.contentHashCode()
        result = 31 * result + this.UserID.contentHashCode()
        result = 31 * result + this.GroupID.contentHashCode()
        result = 31 * result + this.Mode.contentHashCode()
        result = 31 * result + this.Size.contentHashCode()
        result = 31 * result + this.EndHeader.contentHashCode()
        return result
    }
}

public data class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA(public var HeaderData: UInt = 0u, public var Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA_0 = IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA_0())

public data class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA_0(public var _bitfield: UInt = 0u)

public data class IMAGE_ARM_RUNTIME_FUNCTION_ENTRY(public var BeginAddress: UInt = 0u, public var Anonymous: IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0 = IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0())

public data class IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0(public var UnwindData: UInt = 0u, public var Anonymous: IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0_0 = IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0_0())

public data class IMAGE_ARM_RUNTIME_FUNCTION_ENTRY_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_AUX_SYMBOL(
    public var Sym: IMAGE_AUX_SYMBOL_0 = IMAGE_AUX_SYMBOL_0(),
    public var File: IMAGE_AUX_SYMBOL_1 = IMAGE_AUX_SYMBOL_1(),
    public var Section: IMAGE_AUX_SYMBOL_2 = IMAGE_AUX_SYMBOL_2(),
    public var TokenDef: IMAGE_AUX_SYMBOL_TOKEN_DEF = IMAGE_AUX_SYMBOL_TOKEN_DEF(),
    public var CRC: IMAGE_AUX_SYMBOL_3 = IMAGE_AUX_SYMBOL_3(),
)

public data class IMAGE_AUX_SYMBOL_3(public var crc: UInt = 0u, public var rgbReserved: UByteArray = UByteArray(14)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_3) return false
        if (this.crc != other.crc) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crc.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_AUX_SYMBOL_1(public var Name: UByteArray = UByteArray(18)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_1) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Name.contentHashCode()
    }
}

public data class IMAGE_AUX_SYMBOL_2(
    public var Length: UInt = 0u,
    public var NumberOfRelocations: UShort = 0u,
    public var NumberOfLinenumbers: UShort = 0u,
    public var CheckSum: UInt = 0u,
    public var Number: Short = 0,
    public var Selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var HighNumber: Short = 0,
)

public data class IMAGE_AUX_SYMBOL_0(
    public var TagIndex: UInt = 0u,
    public var Misc: IMAGE_AUX_SYMBOL_0_0 = IMAGE_AUX_SYMBOL_0_0(),
    public var FcnAry: IMAGE_AUX_SYMBOL_0_1 = IMAGE_AUX_SYMBOL_0_1(),
    public var TvIndex: UShort = 0u,
)

public data class IMAGE_AUX_SYMBOL_0_1(public var Function: IMAGE_AUX_SYMBOL_0_1_0 = IMAGE_AUX_SYMBOL_0_1_0(), public var Array: IMAGE_AUX_SYMBOL_0_1_1 = IMAGE_AUX_SYMBOL_0_1_1())

public data class IMAGE_AUX_SYMBOL_0_1_1(public var Dimension: UShortArray = UShortArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_0_1_1) return false
        if (!this.Dimension.contentEquals(other.Dimension)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Dimension.contentHashCode()
    }
}

public data class IMAGE_AUX_SYMBOL_0_1_0(public var PointerToLinenumber: UInt = 0u, public var PointerToNextFunction: UInt = 0u)

public data class IMAGE_AUX_SYMBOL_0_0(public var LnSz: IMAGE_AUX_SYMBOL_0_0_0 = IMAGE_AUX_SYMBOL_0_0_0(), public var TotalSize: UInt = 0u)

public data class IMAGE_AUX_SYMBOL_0_0_0(public var Linenumber: UShort = 0u, public var Size: UShort = 0u)

public data class IMAGE_AUX_SYMBOL_EX(
    public var Sym: IMAGE_AUX_SYMBOL_EX_0 = IMAGE_AUX_SYMBOL_EX_0(),
    public var File: IMAGE_AUX_SYMBOL_EX_1 = IMAGE_AUX_SYMBOL_EX_1(),
    public var Section: IMAGE_AUX_SYMBOL_EX_2 = IMAGE_AUX_SYMBOL_EX_2(),
    public var Anonymous: IMAGE_AUX_SYMBOL_EX_3 = IMAGE_AUX_SYMBOL_EX_3(),
    public var CRC: IMAGE_AUX_SYMBOL_EX_4 = IMAGE_AUX_SYMBOL_EX_4(),
)

public data class IMAGE_AUX_SYMBOL_EX_3(public var TokenDef: IMAGE_AUX_SYMBOL_TOKEN_DEF = IMAGE_AUX_SYMBOL_TOKEN_DEF(), public var rgbReserved: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_EX_3) return false
        if (this.TokenDef != other.TokenDef) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TokenDef.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_AUX_SYMBOL_EX_4(public var crc: UInt = 0u, public var rgbReserved: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_EX_4) return false
        if (this.crc != other.crc) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crc.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_AUX_SYMBOL_EX_1(public var Name: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_EX_1) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Name.contentHashCode()
    }
}

public data class IMAGE_AUX_SYMBOL_EX_2(
    public var Length: UInt = 0u,
    public var NumberOfRelocations: UShort = 0u,
    public var NumberOfLinenumbers: UShort = 0u,
    public var CheckSum: UInt = 0u,
    public var Number: Short = 0,
    public var Selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var HighNumber: Short = 0,
    public var rgbReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_EX_2) return false
        if (this.Length != other.Length) return false
        if (this.NumberOfRelocations != other.NumberOfRelocations) return false
        if (this.NumberOfLinenumbers != other.NumberOfLinenumbers) return false
        if (this.CheckSum != other.CheckSum) return false
        if (this.Number != other.Number) return false
        if (this.Selection != other.Selection) return false
        if (this.bReserved != other.bReserved) return false
        if (this.HighNumber != other.HighNumber) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.NumberOfRelocations.hashCode()
        result = 31 * result + this.NumberOfLinenumbers.hashCode()
        result = 31 * result + this.CheckSum.hashCode()
        result = 31 * result + this.Number.hashCode()
        result = 31 * result + this.Selection.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.HighNumber.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_AUX_SYMBOL_EX_0(
    public var WeakDefaultSymIndex: UInt = 0u,
    public var WeakSearchType: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_EX_0) return false
        if (this.WeakDefaultSymIndex != other.WeakDefaultSymIndex) return false
        if (this.WeakSearchType != other.WeakSearchType) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WeakDefaultSymIndex.hashCode()
        result = 31 * result + this.WeakSearchType.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_AUX_SYMBOL_TOKEN_DEF(
    public var bAuxType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var SymbolTableIndex: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_AUX_SYMBOL_TOKEN_DEF) return false
        if (this.bAuxType != other.bAuxType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.SymbolTableIndex != other.SymbolTableIndex) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bAuxType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.SymbolTableIndex.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class IMAGE_BASE_RELOCATION(public var VirtualAddress: UInt = 0u, public var SizeOfBlock: UInt = 0u)

public data class IMAGE_BDD_DYNAMIC_RELOCATION(
    public var Left: UShort = 0u,
    public var Right: UShort = 0u,
    public var Value: UInt = 0u,
)

public data class IMAGE_BDD_INFO(public var Version: UInt = 0u, public var BDDSize: UInt = 0u)

public data class IMAGE_BOUND_FORWARDER_REF(
    public var TimeDateStamp: UInt = 0u,
    public var OffsetModuleName: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class IMAGE_BOUND_IMPORT_DESCRIPTOR(
    public var TimeDateStamp: UInt = 0u,
    public var OffsetModuleName: UShort = 0u,
    public var NumberOfModuleForwarderRefs: UShort = 0u,
)

public data class IMAGE_CE_RUNTIME_FUNCTION_ENTRY(public var FuncStart: UInt = 0u, public var _bitfield: UInt = 0u)

public data class IMAGE_DEBUG_MISC(
    public var DataType: UInt = 0u,
    public var Length: UInt = 0u,
    public var Unicode: Boolean = false,
    public var Reserved: UByteArray = UByteArray(3),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_DEBUG_MISC) return false
        if (this.DataType != other.DataType) return false
        if (this.Length != other.Length) return false
        if (this.Unicode != other.Unicode) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DataType.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Unicode.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public class IMAGE_DOS_HEADER(
    public var e_magic: UShort = 0u,
    public var e_cblp: UShort = 0u,
    public var e_cp: UShort = 0u,
    public var e_crlc: UShort = 0u,
    public var e_cparhdr: UShort = 0u,
    public var e_minalloc: UShort = 0u,
    public var e_maxalloc: UShort = 0u,
    public var e_ss: UShort = 0u,
    public var e_sp: UShort = 0u,
    public var e_csum: UShort = 0u,
    public var e_ip: UShort = 0u,
    public var e_cs: UShort = 0u,
    public var e_lfarlc: UShort = 0u,
    public var e_ovno: UShort = 0u,
    public var e_res: UShortArray = UShortArray(4),
    public var e_oemid: UShort = 0u,
    public var e_oeminfo: UShort = 0u,
    public var e_res2: UShortArray = UShortArray(10),
    public var e_lfanew: Int = 0,
)

public data class IMAGE_DYNAMIC_RELOCATION32(public var Symbol: UInt = 0u, public var BaseRelocSize: UInt = 0u)

public data class IMAGE_DYNAMIC_RELOCATION32_V2(
    public var HeaderSize: UInt = 0u,
    public var FixupInfoSize: UInt = 0u,
    public var Symbol: UInt = 0u,
    public var SymbolGroup: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class IMAGE_DYNAMIC_RELOCATION64(public var Symbol: ULong = 0uL, public var BaseRelocSize: UInt = 0u)

public data class IMAGE_DYNAMIC_RELOCATION64_V2(
    public var HeaderSize: UInt = 0u,
    public var FixupInfoSize: UInt = 0u,
    public var Symbol: ULong = 0uL,
    public var SymbolGroup: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class IMAGE_DYNAMIC_RELOCATION_TABLE(public var Version: UInt = 0u, public var Size: UInt = 0u)

public data class IMAGE_EPILOGUE_DYNAMIC_RELOCATION_HEADER(
    public var EpilogueCount: UInt = 0u,
    public var EpilogueByteCount: UByte = 0u,
    public var BranchDescriptorElementSize: UByte = 0u,
    public var BranchDescriptorCount: UShort = 0u,
)

public data class IMAGE_EXPORT_DIRECTORY(
    public var Characteristics: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var Name: UInt = 0u,
    public var Base: UInt = 0u,
    public var NumberOfFunctions: UInt = 0u,
    public var NumberOfNames: UInt = 0u,
    public var AddressOfFunctions: UInt = 0u,
    public var AddressOfNames: UInt = 0u,
    public var AddressOfNameOrdinals: UInt = 0u,
)

public data class IMAGE_FUNCTION_OVERRIDE_DYNAMIC_RELOCATION(
    public var OriginalRva: UInt = 0u,
    public var BDDOffset: UInt = 0u,
    public var RvaSize: UInt = 0u,
    public var BaseRelocSize: UInt = 0u,
)

public data class IMAGE_FUNCTION_OVERRIDE_HEADER(public var FuncOverrideSize: UInt = 0u)

public data class IMAGE_HOT_PATCH_BASE(
    public var SequenceNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var OriginalTimeDateStamp: UInt = 0u,
    public var OriginalCheckSum: UInt = 0u,
    public var CodeIntegrityInfo: UInt = 0u,
    public var CodeIntegritySize: UInt = 0u,
    public var PatchTable: UInt = 0u,
    public var BufferOffset: UInt = 0u,
)

public data class IMAGE_HOT_PATCH_HASHES(public var SHA256: UByteArray = UByteArray(32), public var SHA1: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_HOT_PATCH_HASHES) return false
        if (!this.SHA256.contentEquals(other.SHA256)) return false
        if (!this.SHA1.contentEquals(other.SHA1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SHA256.contentHashCode()
        result = 31 * result + this.SHA1.contentHashCode()
        return result
    }
}

public data class IMAGE_HOT_PATCH_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SequenceNumber: UInt = 0u,
    public var BaseImageList: UInt = 0u,
    public var BaseImageCount: UInt = 0u,
    public var BufferOffset: UInt = 0u,
    public var ExtraPatchSize: UInt = 0u,
)

public data class IMAGE_IMPORT_BY_NAME(public var Hint: UShort = 0u, public var Name: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_IMPORT_BY_NAME) return false
        if (this.Hint != other.Hint) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hint.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class IMAGE_IMPORT_CONTROL_TRANSFER_DYNAMIC_RELOCATION(public var _bitfield: UInt = 0u)

public data class IMAGE_IMPORT_DESCRIPTOR(
    public var Anonymous: IMAGE_IMPORT_DESCRIPTOR_0 = IMAGE_IMPORT_DESCRIPTOR_0(),
    public var TimeDateStamp: UInt = 0u,
    public var ForwarderChain: UInt = 0u,
    public var Name: UInt = 0u,
    public var FirstThunk: UInt = 0u,
)

public data class IMAGE_IMPORT_DESCRIPTOR_0(public var Characteristics: UInt = 0u, public var OriginalFirstThunk: UInt = 0u)

public data class IMAGE_INDIR_CONTROL_TRANSFER_DYNAMIC_RELOCATION(public var _bitfield: UShort = 0u)

public data class IMAGE_LINENUMBER(public var Type: IMAGE_LINENUMBER_0 = IMAGE_LINENUMBER_0(), public var Linenumber: UShort = 0u)

public data class IMAGE_LINENUMBER_0(public var SymbolTableIndex: UInt = 0u, public var VirtualAddress: UInt = 0u)

public class IMAGE_OS2_HEADER(
    public var ne_magic: UShort = 0u,
    public var ne_ver: Byte = 0,
    public var ne_rev: Byte = 0,
    public var ne_enttab: UShort = 0u,
    public var ne_cbenttab: UShort = 0u,
    public var ne_crc: Int = 0,
    public var ne_flags: UShort = 0u,
    public var ne_autodata: UShort = 0u,
    public var ne_heap: UShort = 0u,
    public var ne_stack: UShort = 0u,
    public var ne_csip: Int = 0,
    public var ne_sssp: Int = 0,
    public var ne_cseg: UShort = 0u,
    public var ne_cmod: UShort = 0u,
    public var ne_cbnrestab: UShort = 0u,
    public var ne_segtab: UShort = 0u,
    public var ne_rsrctab: UShort = 0u,
    public var ne_restab: UShort = 0u,
    public var ne_modtab: UShort = 0u,
    public var ne_imptab: UShort = 0u,
    public var ne_nrestab: Int = 0,
    public var ne_cmovent: UShort = 0u,
    public var ne_align: UShort = 0u,
    public var ne_cres: UShort = 0u,
    public var ne_exetyp: UByte = 0u,
    public var ne_flagsothers: UByte = 0u,
    public var ne_pretthunks: UShort = 0u,
    public var ne_psegrefbytes: UShort = 0u,
    public var ne_swaparea: UShort = 0u,
    public var ne_expver: UShort = 0u,
)

public data class IMAGE_POLICY_ENTRY(
    public var Type: IMAGE_POLICY_ENTRY_TYPE = 0,
    public var PolicyId: IMAGE_POLICY_ID = 0,
    public var u: IMAGE_POLICY_ENTRY_0 = IMAGE_POLICY_ENTRY_0(),
)

public data class IMAGE_POLICY_ENTRY_0(
    public var None: Long = 0L,
    public var BoolValue: Boolean = false,
    public var Int8Value: Byte = 0,
    public var UInt8Value: UByte = 0u,
    public var Int16Value: Short = 0,
    public var UInt16Value: UShort = 0u,
    public var Int32Value: Int = 0,
    public var UInt32Value: UInt = 0u,
    public var Int64Value: Long = 0L,
    public var UInt64Value: ULong = 0uL,
    public var AnsiStringValue: PCSTR = 0L,
    public var UnicodeStringValue: PCWSTR = 0L,
)

public data class IMAGE_POLICY_METADATA(
    public var Version: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(7),
    public var ApplicationId: ULong = 0uL,
    public var Policies: List<IMAGE_POLICY_ENTRY> = List(1) { IMAGE_POLICY_ENTRY() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_POLICY_METADATA) return false
        if (this.Version != other.Version) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.ApplicationId != other.ApplicationId) return false
        if (this.Policies != other.Policies) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.ApplicationId.hashCode()
        result = 31 * result + this.Policies.hashCode()
        return result
    }
}

public data class IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER(public var PrologueByteCount: UByte = 0u)

public data class IMAGE_RELOCATION(
    public var Anonymous: IMAGE_RELOCATION_0 = IMAGE_RELOCATION_0(),
    public var SymbolTableIndex: UInt = 0u,
    public var Type: UShort = 0u,
)

public data class IMAGE_RELOCATION_0(public var VirtualAddress: UInt = 0u, public var RelocCount: UInt = 0u)

public data class IMAGE_RESOURCE_DATA_ENTRY(
    public var OffsetToData: UInt = 0u,
    public var Size: UInt = 0u,
    public var CodePage: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class IMAGE_RESOURCE_DIRECTORY(
    public var Characteristics: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var NumberOfNamedEntries: UShort = 0u,
    public var NumberOfIdEntries: UShort = 0u,
)

public data class IMAGE_RESOURCE_DIRECTORY_ENTRY(public var Anonymous1: IMAGE_RESOURCE_DIRECTORY_ENTRY_0 = IMAGE_RESOURCE_DIRECTORY_ENTRY_0(), public var Anonymous2: IMAGE_RESOURCE_DIRECTORY_ENTRY_1 = IMAGE_RESOURCE_DIRECTORY_ENTRY_1())

public data class IMAGE_RESOURCE_DIRECTORY_ENTRY_0(
    public var Anonymous: IMAGE_RESOURCE_DIRECTORY_ENTRY_0_0 = IMAGE_RESOURCE_DIRECTORY_ENTRY_0_0(),
    public var Name: UInt = 0u,
    public var Id: UShort = 0u,
)

public data class IMAGE_RESOURCE_DIRECTORY_ENTRY_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_RESOURCE_DIRECTORY_ENTRY_1(public var OffsetToData: UInt = 0u, public var Anonymous: IMAGE_RESOURCE_DIRECTORY_ENTRY_1_0 = IMAGE_RESOURCE_DIRECTORY_ENTRY_1_0())

public data class IMAGE_RESOURCE_DIRECTORY_ENTRY_1_0(public var _bitfield: UInt = 0u)

public data class IMAGE_RESOURCE_DIRECTORY_STRING(public var Length: UShort = 0u, public var NameString: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_RESOURCE_DIRECTORY_STRING) return false
        if (this.Length != other.Length) return false
        if (!this.NameString.contentEquals(other.NameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.NameString.contentHashCode()
        return result
    }
}

public data class IMAGE_RESOURCE_DIR_STRING_U(public var Length: UShort = 0u, public var NameString: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_RESOURCE_DIR_STRING_U) return false
        if (this.Length != other.Length) return false
        if (!this.NameString.contentEquals(other.NameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.NameString.contentHashCode()
        return result
    }
}

public data class IMAGE_SEPARATE_DEBUG_HEADER(
    public var Signature: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Machine: UShort = 0u,
    public var Characteristics: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var ImageBase: UInt = 0u,
    public var SizeOfImage: UInt = 0u,
    public var NumberOfSections: UInt = 0u,
    public var ExportedNamesSize: UInt = 0u,
    public var DebugDirectorySize: UInt = 0u,
    public var SectionAlignment: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_SEPARATE_DEBUG_HEADER) return false
        if (this.Signature != other.Signature) return false
        if (this.Flags != other.Flags) return false
        if (this.Machine != other.Machine) return false
        if (this.Characteristics != other.Characteristics) return false
        if (this.TimeDateStamp != other.TimeDateStamp) return false
        if (this.CheckSum != other.CheckSum) return false
        if (this.ImageBase != other.ImageBase) return false
        if (this.SizeOfImage != other.SizeOfImage) return false
        if (this.NumberOfSections != other.NumberOfSections) return false
        if (this.ExportedNamesSize != other.ExportedNamesSize) return false
        if (this.DebugDirectorySize != other.DebugDirectorySize) return false
        if (this.SectionAlignment != other.SectionAlignment) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Machine.hashCode()
        result = 31 * result + this.Characteristics.hashCode()
        result = 31 * result + this.TimeDateStamp.hashCode()
        result = 31 * result + this.CheckSum.hashCode()
        result = 31 * result + this.ImageBase.hashCode()
        result = 31 * result + this.SizeOfImage.hashCode()
        result = 31 * result + this.NumberOfSections.hashCode()
        result = 31 * result + this.ExportedNamesSize.hashCode()
        result = 31 * result + this.DebugDirectorySize.hashCode()
        result = 31 * result + this.SectionAlignment.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class IMAGE_SWITCHTABLE_BRANCH_DYNAMIC_RELOCATION(public var _bitfield: UShort = 0u)

public data class IMAGE_SYMBOL(
    public var N: IMAGE_SYMBOL_0 = IMAGE_SYMBOL_0(),
    public var Value: UInt = 0u,
    public var SectionNumber: Short = 0,
    public var Type: UShort = 0u,
    public var StorageClass: UByte = 0u,
    public var NumberOfAuxSymbols: UByte = 0u,
)

public data class IMAGE_SYMBOL_0(
    public var ShortName: UByteArray = UByteArray(8),
    public var Name: IMAGE_SYMBOL_0_0 = IMAGE_SYMBOL_0_0(),
    public var LongName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_SYMBOL_0) return false
        if (!this.ShortName.contentEquals(other.ShortName)) return false
        if (this.Name != other.Name) return false
        if (!this.LongName.contentEquals(other.LongName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ShortName.contentHashCode()
        result = 31 * result + this.Name.hashCode()
        result = 31 * result + this.LongName.contentHashCode()
        return result
    }
}

public data class IMAGE_SYMBOL_0_0(public var Short: UInt = 0u, public var Long: UInt = 0u)

public data class IMAGE_SYMBOL_EX(
    public var N: IMAGE_SYMBOL_EX_0 = IMAGE_SYMBOL_EX_0(),
    public var Value: UInt = 0u,
    public var SectionNumber: Int = 0,
    public var Type: UShort = 0u,
    public var StorageClass: UByte = 0u,
    public var NumberOfAuxSymbols: UByte = 0u,
)

public data class IMAGE_SYMBOL_EX_0(
    public var ShortName: UByteArray = UByteArray(8),
    public var Name: IMAGE_SYMBOL_EX_0_0 = IMAGE_SYMBOL_EX_0_0(),
    public var LongName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_SYMBOL_EX_0) return false
        if (!this.ShortName.contentEquals(other.ShortName)) return false
        if (this.Name != other.Name) return false
        if (!this.LongName.contentEquals(other.LongName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ShortName.contentHashCode()
        result = 31 * result + this.Name.hashCode()
        result = 31 * result + this.LongName.contentHashCode()
        return result
    }
}

public data class IMAGE_SYMBOL_EX_0_0(public var Short: UInt = 0u, public var Long: UInt = 0u)

public data class IMAGE_TLS_DIRECTORY32(
    public var StartAddressOfRawData: UInt = 0u,
    public var EndAddressOfRawData: UInt = 0u,
    public var AddressOfIndex: UInt = 0u,
    public var AddressOfCallBacks: UInt = 0u,
    public var SizeOfZeroFill: UInt = 0u,
    public var Anonymous: IMAGE_TLS_DIRECTORY32_0 = IMAGE_TLS_DIRECTORY32_0(),
)

public data class IMAGE_TLS_DIRECTORY32_0(public var Characteristics: UInt = 0u, public var Anonymous: IMAGE_TLS_DIRECTORY32_0_0 = IMAGE_TLS_DIRECTORY32_0_0())

public data class IMAGE_TLS_DIRECTORY32_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_TLS_DIRECTORY64(
    public var StartAddressOfRawData: ULong = 0uL,
    public var EndAddressOfRawData: ULong = 0uL,
    public var AddressOfIndex: ULong = 0uL,
    public var AddressOfCallBacks: ULong = 0uL,
    public var SizeOfZeroFill: UInt = 0u,
    public var Anonymous: IMAGE_TLS_DIRECTORY64_0 = IMAGE_TLS_DIRECTORY64_0(),
)

public data class IMAGE_TLS_DIRECTORY64_0(public var Characteristics: UInt = 0u, public var Anonymous: IMAGE_TLS_DIRECTORY64_0_0 = IMAGE_TLS_DIRECTORY64_0_0())

public data class IMAGE_TLS_DIRECTORY64_0_0(public var _bitfield: UInt = 0u)

public class IMAGE_VXD_HEADER(
    public var e32_magic: UShort = 0u,
    public var e32_border: UByte = 0u,
    public var e32_worder: UByte = 0u,
    public var e32_level: UInt = 0u,
    public var e32_cpu: UShort = 0u,
    public var e32_os: UShort = 0u,
    public var e32_ver: UInt = 0u,
    public var e32_mflags: UInt = 0u,
    public var e32_mpages: UInt = 0u,
    public var e32_startobj: UInt = 0u,
    public var e32_eip: UInt = 0u,
    public var e32_stackobj: UInt = 0u,
    public var e32_esp: UInt = 0u,
    public var e32_pagesize: UInt = 0u,
    public var e32_lastpagesize: UInt = 0u,
    public var e32_fixupsize: UInt = 0u,
    public var e32_fixupsum: UInt = 0u,
    public var e32_ldrsize: UInt = 0u,
    public var e32_ldrsum: UInt = 0u,
    public var e32_objtab: UInt = 0u,
    public var e32_objcnt: UInt = 0u,
    public var e32_objmap: UInt = 0u,
    public var e32_itermap: UInt = 0u,
    public var e32_rsrctab: UInt = 0u,
    public var e32_rsrccnt: UInt = 0u,
    public var e32_restab: UInt = 0u,
    public var e32_enttab: UInt = 0u,
    public var e32_dirtab: UInt = 0u,
    public var e32_dircnt: UInt = 0u,
    public var e32_fpagetab: UInt = 0u,
    public var e32_frectab: UInt = 0u,
    public var e32_impmod: UInt = 0u,
    public var e32_impmodcnt: UInt = 0u,
    public var e32_impproc: UInt = 0u,
    public var e32_pagesum: UInt = 0u,
    public var e32_datapage: UInt = 0u,
    public var e32_preload: UInt = 0u,
    public var e32_nrestab: UInt = 0u,
    public var e32_cbnrestab: UInt = 0u,
    public var e32_nressum: UInt = 0u,
    public var e32_autodata: UInt = 0u,
    public var e32_debuginfo: UInt = 0u,
    public var e32_debuglen: UInt = 0u,
    public var e32_instpreload: UInt = 0u,
    public var e32_instdemand: UInt = 0u,
    public var e32_heapsize: UInt = 0u,
    public var e32_res3: UByteArray = UByteArray(12),
    public var e32_winresoff: UInt = 0u,
    public var e32_winreslen: UInt = 0u,
    public var e32_devid: UShort = 0u,
    public var e32_ddkver: UShort = 0u,
)

public data class IMPORT_OBJECT_HEADER(
    public var Sig1: UShort = 0u,
    public var Sig2: UShort = 0u,
    public var Version: UShort = 0u,
    public var Machine: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var SizeOfData: UInt = 0u,
    public var Anonymous: IMPORT_OBJECT_HEADER_0 = IMPORT_OBJECT_HEADER_0(),
    public var _bitfield: UShort = 0u,
)

public data class IMPORT_OBJECT_HEADER_0(public var Ordinal: UShort = 0u, public var Hint: UShort = 0u)

public data class KERNEL_CET_CONTEXT(
    public var Ssp: ULong = 0uL,
    public var Rip: ULong = 0uL,
    public var SegCs: UShort = 0u,
    public var Anonymous: KERNEL_CET_CONTEXT_0 = KERNEL_CET_CONTEXT_0(),
    public var Fill: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KERNEL_CET_CONTEXT) return false
        if (this.Ssp != other.Ssp) return false
        if (this.Rip != other.Rip) return false
        if (this.SegCs != other.SegCs) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Fill.contentEquals(other.Fill)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Ssp.hashCode()
        result = 31 * result + this.Rip.hashCode()
        result = 31 * result + this.SegCs.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Fill.contentHashCode()
        return result
    }
}

public data class KERNEL_CET_CONTEXT_0(public var AllFlags: UShort = 0u, public var Anonymous: KERNEL_CET_CONTEXT_0_0 = KERNEL_CET_CONTEXT_0_0())

public data class KERNEL_CET_CONTEXT_0_0(public var _bitfield: UShort = 0u)

public data class KTMOBJECT_CURSOR(
    public var LastQuery: GUID = GUID(),
    public var ObjectIdCount: UInt = 0u,
    public var ObjectIds: List<GUID> = List(1) { GUID() },
)

public data class MAXVERSIONTESTED_INFO(public var MaxVersionTested: ULong = 0uL)

public data class NETWORK_APP_INSTANCE_EA(public var AppInstanceID: GUID = GUID(), public var CsvFlags: UInt = 0u)

public data class NON_PAGED_DEBUG_INFO(
    public var Signature: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Size: UInt = 0u,
    public var Machine: UShort = 0u,
    public var Characteristics: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var SizeOfImage: UInt = 0u,
    public var ImageBase: ULong = 0uL,
)

public data class NOTIFY_USER_POWER_SETTING(public var Guid: GUID = GUID())

public data class NT_TIB32(
    public var ExceptionList: UInt = 0u,
    public var StackBase: UInt = 0u,
    public var StackLimit: UInt = 0u,
    public var SubSystemTib: UInt = 0u,
    public var Anonymous: NT_TIB32_0 = NT_TIB32_0(),
    public var ArbitraryUserPointer: UInt = 0u,
    public var Self_: UInt = 0u,
)

public data class NT_TIB32_0(public var FiberData: UInt = 0u, public var Version: UInt = 0u)

public data class NT_TIB64(
    public var ExceptionList: ULong = 0uL,
    public var StackBase: ULong = 0uL,
    public var StackLimit: ULong = 0uL,
    public var SubSystemTib: ULong = 0uL,
    public var Anonymous: NT_TIB64_0 = NT_TIB64_0(),
    public var ArbitraryUserPointer: ULong = 0uL,
    public var Self_: ULong = 0uL,
)

public data class NT_TIB64_0(public var FiberData: ULong = 0uL, public var Version: UInt = 0u)

public data class PACKEDEVENTINFO(
    public var ulSize: UInt = 0u,
    public var ulNumEventsForLogFile: UInt = 0u,
    public var ulOffsets: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PACKEDEVENTINFO) return false
        if (this.ulSize != other.ulSize) return false
        if (this.ulNumEventsForLogFile != other.ulNumEventsForLogFile) return false
        if (!this.ulOffsets.contentEquals(other.ulOffsets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulSize.hashCode()
        result = 31 * result + this.ulNumEventsForLogFile.hashCode()
        result = 31 * result + this.ulOffsets.contentHashCode()
        return result
    }
}

public data class PROCESSOR_IDLESTATE_INFO(
    public var TimeCheck: UInt = 0u,
    public var DemotePercent: UByte = 0u,
    public var PromotePercent: UByte = 0u,
    public var Spare: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSOR_IDLESTATE_INFO) return false
        if (this.TimeCheck != other.TimeCheck) return false
        if (this.DemotePercent != other.DemotePercent) return false
        if (this.PromotePercent != other.PromotePercent) return false
        if (!this.Spare.contentEquals(other.Spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TimeCheck.hashCode()
        result = 31 * result + this.DemotePercent.hashCode()
        result = 31 * result + this.PromotePercent.hashCode()
        result = 31 * result + this.Spare.contentHashCode()
        return result
    }
}

public data class PROCESSOR_IDLESTATE_POLICY(
    public var Revision: UShort = 0u,
    public var Flags: PROCESSOR_IDLESTATE_POLICY_0 = PROCESSOR_IDLESTATE_POLICY_0(),
    public var PolicyCount: UInt = 0u,
    public var Policy: List<PROCESSOR_IDLESTATE_INFO> = List(3) { PROCESSOR_IDLESTATE_INFO() },
)

public data class PROCESSOR_IDLESTATE_POLICY_0(public var AsWORD: UShort = 0u, public var Anonymous: PROCESSOR_IDLESTATE_POLICY_0_0 = PROCESSOR_IDLESTATE_POLICY_0_0())

public data class PROCESSOR_IDLESTATE_POLICY_0_0(public var _bitfield: UShort = 0u)

public data class PROCESSOR_PERFSTATE_POLICY(
    public var Revision: UInt = 0u,
    public var MaxThrottle: UByte = 0u,
    public var MinThrottle: UByte = 0u,
    public var BusyAdjThreshold: UByte = 0u,
    public var Anonymous: PROCESSOR_PERFSTATE_POLICY_0 = PROCESSOR_PERFSTATE_POLICY_0(),
    public var TimeCheck: UInt = 0u,
    public var IncreaseTime: UInt = 0u,
    public var DecreaseTime: UInt = 0u,
    public var IncreasePercent: UInt = 0u,
    public var DecreasePercent: UInt = 0u,
)

public data class PROCESSOR_PERFSTATE_POLICY_0(public var Spare: UByte = 0u, public var Flags: PROCESSOR_PERFSTATE_POLICY_0_0 = PROCESSOR_PERFSTATE_POLICY_0_0())

public data class PROCESSOR_PERFSTATE_POLICY_0_0(public var AsBYTE: UByte = 0u, public var Anonymous: PROCESSOR_PERFSTATE_POLICY_0_0_0 = PROCESSOR_PERFSTATE_POLICY_0_0_0())

public data class PROCESSOR_PERFSTATE_POLICY_0_0_0(public var _bitfield: UByte = 0u)

public data class PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY(public var Anonymous: PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0 = PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0())

public data class PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0_0 = PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0_0())

public data class PROCESS_MITIGATION_ACTIVATION_CONTEXT_TRUST_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_ASLR_POLICY(public var Anonymous: PROCESS_MITIGATION_ASLR_POLICY_0 = PROCESS_MITIGATION_ASLR_POLICY_0())

public data class PROCESS_MITIGATION_ASLR_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_ASLR_POLICY_0_0 = PROCESS_MITIGATION_ASLR_POLICY_0_0())

public data class PROCESS_MITIGATION_ASLR_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY(public var Anonymous: PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0 = PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0())

public data class PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0_0 = PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0_0())

public data class PROCESS_MITIGATION_BINARY_SIGNATURE_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_CHILD_PROCESS_POLICY(public var Anonymous: PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0 = PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0())

public data class PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0_0 = PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0_0())

public data class PROCESS_MITIGATION_CHILD_PROCESS_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY(public var Anonymous: PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0 = PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0())

public data class PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0_0 = PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0_0())

public data class PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_DEP_POLICY(public var Anonymous: PROCESS_MITIGATION_DEP_POLICY_0 = PROCESS_MITIGATION_DEP_POLICY_0(), public var Permanent: Boolean = false)

public data class PROCESS_MITIGATION_DEP_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_DEP_POLICY_0_0 = PROCESS_MITIGATION_DEP_POLICY_0_0())

public data class PROCESS_MITIGATION_DEP_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_DYNAMIC_CODE_POLICY(public var Anonymous: PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0 = PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0())

public data class PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0_0 = PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0_0())

public data class PROCESS_MITIGATION_DYNAMIC_CODE_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY(public var Anonymous: PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0 = PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0())

public data class PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0_0 = PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0_0())

public data class PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_FONT_DISABLE_POLICY(public var Anonymous: PROCESS_MITIGATION_FONT_DISABLE_POLICY_0 = PROCESS_MITIGATION_FONT_DISABLE_POLICY_0())

public data class PROCESS_MITIGATION_FONT_DISABLE_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_FONT_DISABLE_POLICY_0_0 = PROCESS_MITIGATION_FONT_DISABLE_POLICY_0_0())

public data class PROCESS_MITIGATION_FONT_DISABLE_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_IMAGE_LOAD_POLICY(public var Anonymous: PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0 = PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0())

public data class PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0_0 = PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0_0())

public data class PROCESS_MITIGATION_IMAGE_LOAD_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY(public var Anonymous: PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0 = PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0())

public data class PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0_0 = PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0_0())

public data class PROCESS_MITIGATION_PAYLOAD_RESTRICTION_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY(public var Anonymous: PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0 = PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0())

public data class PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0_0 = PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0_0())

public data class PROCESS_MITIGATION_REDIRECTION_TRUST_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_SEHOP_POLICY(public var Anonymous: PROCESS_MITIGATION_SEHOP_POLICY_0 = PROCESS_MITIGATION_SEHOP_POLICY_0())

public data class PROCESS_MITIGATION_SEHOP_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_SEHOP_POLICY_0_0 = PROCESS_MITIGATION_SEHOP_POLICY_0_0())

public data class PROCESS_MITIGATION_SEHOP_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY(public var Anonymous: PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0 = PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0())

public data class PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0_0 = PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0_0())

public data class PROCESS_MITIGATION_SIDE_CHANNEL_ISOLATION_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY(public var Anonymous: PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0 = PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0())

public data class PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0_0 = PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0_0())

public data class PROCESS_MITIGATION_STRICT_HANDLE_CHECK_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY(public var Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0 = PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0())

public data class PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0_0 = PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0_0())

public data class PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY(public var Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0 = PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0())

public data class PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0_0 = PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0_0())

public data class PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY(public var Anonymous: PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0 = PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0())

public data class PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0_0 = PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0_0())

public data class PROCESS_MITIGATION_USER_POINTER_AUTH_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY(public var Anonymous: PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0 = PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0())

public data class PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0_0 = PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0_0())

public data class PROCESS_MITIGATION_USER_SHADOW_STACK_POLICY_0_0(public var _bitfield: UInt = 0u)

public data class QUOTA_LIMITS_EX(
    public var PagedPoolLimit: ULong = 0uL,
    public var NonPagedPoolLimit: ULong = 0uL,
    public var MinimumWorkingSetSize: ULong = 0uL,
    public var MaximumWorkingSetSize: ULong = 0uL,
    public var PagefileLimit: ULong = 0uL,
    public var TimeLimit: Long = 0L,
    public var WorkingSetLimit: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
    public var Reserved3: ULong = 0uL,
    public var Reserved4: ULong = 0uL,
    public var Flags: UInt = 0u,
    public var CpuRateLimit: RATE_QUOTA_LIMIT = RATE_QUOTA_LIMIT(),
)

public data class RATE_QUOTA_LIMIT(public var RateData: UInt = 0u, public var Anonymous: RATE_QUOTA_LIMIT_0 = RATE_QUOTA_LIMIT_0())

public data class RATE_QUOTA_LIMIT_0(public var _bitfield: UInt = 0u)

public data class REARRANGE_FILE_DATA(
    public var SourceStartingOffset: ULong = 0uL,
    public var TargetOffset: ULong = 0uL,
    public var SourceFileHandle: HANDLE = 0L,
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class REARRANGE_FILE_DATA32(
    public var SourceStartingOffset: ULong = 0uL,
    public var TargetOffset: ULong = 0uL,
    public var SourceFileHandle: UInt = 0u,
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class REDBOOK_DIGITAL_AUDIO_EXTRACTION_INFO(
    public var Version: UInt = 0u,
    public var Accurate: UInt = 0u,
    public var Supported: UInt = 0u,
    public var AccurateMask0: UInt = 0u,
)

public data class RESOURCEMANAGER_BASIC_INFORMATION(
    public var ResourceManagerId: GUID = GUID(),
    public var DescriptionLength: UInt = 0u,
    public var Description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RESOURCEMANAGER_BASIC_INFORMATION) return false
        if (this.ResourceManagerId != other.ResourceManagerId) return false
        if (this.DescriptionLength != other.DescriptionLength) return false
        if (!this.Description.contentEquals(other.Description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ResourceManagerId.hashCode()
        result = 31 * result + this.DescriptionLength.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        return result
    }
}

public data class RESOURCEMANAGER_COMPLETION_INFORMATION(public var IoCompletionPortHandle: HANDLE = 0L, public var CompletionKey: ULong = 0uL)

public data class RemHBITMAP(public var cbData: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHBITMAP) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemHBRUSH(public var cbData: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHBRUSH) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemHENHMETAFILE(public var cbData: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHENHMETAFILE) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemHGLOBAL(
    public var fNullHGlobal: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHGLOBAL) return false
        if (this.fNullHGlobal != other.fNullHGlobal) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fNullHGlobal.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemHMETAFILEPICT(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHMETAFILEPICT) return false
        if (this.mm != other.mm) return false
        if (this.xExt != other.xExt) return false
        if (this.yExt != other.yExt) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mm.hashCode()
        result = 31 * result + this.xExt.hashCode()
        result = 31 * result + this.yExt.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemHPALETTE(public var cbData: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHPALETTE) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RemotableHandle(public var fContext: Int = 0, public var u: RemotableHandle_0 = RemotableHandle_0())

public data class RemotableHandle_0(public var hInproc: Int = 0, public var hRemote: Int = 0)

public data class SCOPE_TABLE_AMD64(public var Count: UInt = 0u, public var ScopeRecord: List<SCOPE_TABLE_AMD64_0> = List(1) { SCOPE_TABLE_AMD64_0() })

public data class SCOPE_TABLE_AMD64_0(
    public var BeginAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var HandlerAddress: UInt = 0u,
    public var JumpTarget: UInt = 0u,
)

public data class SCOPE_TABLE_ARM(public var Count: UInt = 0u, public var ScopeRecord: List<SCOPE_TABLE_ARM_0> = List(1) { SCOPE_TABLE_ARM_0() })

public data class SCOPE_TABLE_ARM_0(
    public var BeginAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var HandlerAddress: UInt = 0u,
    public var JumpTarget: UInt = 0u,
)

public data class SCOPE_TABLE_ARM64(public var Count: UInt = 0u, public var ScopeRecord: List<SCOPE_TABLE_ARM64_0> = List(1) { SCOPE_TABLE_ARM64_0() })

public data class SCOPE_TABLE_ARM64_0(
    public var BeginAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var HandlerAddress: UInt = 0u,
    public var JumpTarget: UInt = 0u,
)

public data class SCRUB_DATA_INPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MaximumIos: UInt = 0u,
    public var ObjectId: UIntArray = UIntArray(4),
    public var Reserved: UIntArray = UIntArray(41),
    public var ResumeContext: UByteArray = UByteArray(1040),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCRUB_DATA_INPUT) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.MaximumIos != other.MaximumIos) return false
        if (!this.ObjectId.contentEquals(other.ObjectId)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.ResumeContext.contentEquals(other.ResumeContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MaximumIos.hashCode()
        result = 31 * result + this.ObjectId.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ResumeContext.contentHashCode()
        return result
    }
}

public class SCRUB_DATA_OUTPUT(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Status: UInt = 0u,
    public var ErrorFileOffset: ULong = 0uL,
    public var ErrorLength: ULong = 0uL,
    public var NumberOfBytesRepaired: ULong = 0uL,
    public var NumberOfBytesFailed: ULong = 0uL,
    public var InternalFileReference: ULong = 0uL,
    public var ResumeContextLength: UShort = 0u,
    public var ParityExtentDataOffset: UShort = 0u,
    public var Reserved: UIntArray = UIntArray(9),
    public var NumberOfMetadataBytesProcessed: ULong = 0uL,
    public var NumberOfDataBytesProcessed: ULong = 0uL,
    public var TotalNumberOfMetadataBytesInUse: ULong = 0uL,
    public var TotalNumberOfDataBytesInUse: ULong = 0uL,
    public var DataBytesSkippedDueToNoAllocation: ULong = 0uL,
    public var DataBytesSkippedDueToInvalidRun: ULong = 0uL,
    public var DataBytesSkippedDueToIntegrityStream: ULong = 0uL,
    public var DataBytesSkippedDueToRegionBeingClean: ULong = 0uL,
    public var DataBytesSkippedDueToLockConflict: ULong = 0uL,
    public var DataBytesSkippedDueToNoScrubDataFlag: ULong = 0uL,
    public var DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag: ULong = 0uL,
    public var DataBytesScrubbed: ULong = 0uL,
    public var ResumeContext: UByteArray = UByteArray(1040),
)

public data class SCRUB_PARITY_EXTENT(public var Offset: Long = 0L, public var Length: ULong = 0uL)

public data class SCRUB_PARITY_EXTENT_DATA(
    public var Size: UShort = 0u,
    public var Flags: UShort = 0u,
    public var NumberOfParityExtents: UShort = 0u,
    public var MaximumNumberOfParityExtents: UShort = 0u,
    public var ParityExtents: List<SCRUB_PARITY_EXTENT> = List(1) { SCRUB_PARITY_EXTENT() },
)

public data class SECURITY_OBJECT_AI_PARAMS(public var Size: UInt = 0u, public var ConstraintMask: UInt = 0u)

public data class SERVERSILO_BASIC_INFORMATION(
    public var ServiceSessionId: UInt = 0u,
    public var State: SERVERSILO_STATE = 0,
    public var ExitStatus: UInt = 0u,
    public var IsDownlevelContainer: Boolean = false,
    public var ApiSetSchema: Long = 0L,
    public var HostApiSetSchema: Long = 0L,
)

public data class SE_TOKEN_USER(public var Anonymous1: SE_TOKEN_USER_0 = SE_TOKEN_USER_0(), public var Anonymous2: SE_TOKEN_USER_1 = SE_TOKEN_USER_1())

public data class SE_TOKEN_USER_0(public var TokenUser: TOKEN_USER = TOKEN_USER(), public var User: SID_AND_ATTRIBUTES = SID_AND_ATTRIBUTES())

public data class SE_TOKEN_USER_1(public var Sid: SID = SID(), public var Buffer: UByteArray = UByteArray(68)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SE_TOKEN_USER_1) return false
        if (this.Sid != other.Sid) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Sid.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class SHARED_VIRTUAL_DISK_SUPPORT(public var SharedVirtualDiskSupport: SharedVirtualDiskSupportType = 0, public var HandleState: SharedVirtualDiskHandleState = 0)

public data class SHUFFLE_FILE_DATA(
    public var StartingOffset: Long = 0L,
    public var Length: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class SILOOBJECT_BASIC_INFORMATION(
    public var SiloId: UInt = 0u,
    public var SiloParentId: UInt = 0u,
    public var NumberOfProcesses: UInt = 0u,
    public var IsInServerSilo: Boolean = false,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SILOOBJECT_BASIC_INFORMATION) return false
        if (this.SiloId != other.SiloId) return false
        if (this.SiloParentId != other.SiloParentId) return false
        if (this.NumberOfProcesses != other.NumberOfProcesses) return false
        if (this.IsInServerSilo != other.IsInServerSilo) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SiloId.hashCode()
        result = 31 * result + this.SiloParentId.hashCode()
        result = 31 * result + this.NumberOfProcesses.hashCode()
        result = 31 * result + this.IsInServerSilo.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SUPPORTED_OS_INFO(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class TAPE_CREATE_PARTITION(
    public var Method: UInt = 0u,
    public var Count: UInt = 0u,
    public var Size: UInt = 0u,
)

public data class TAPE_GET_DRIVE_PARAMETERS(
    public var ECC: Boolean = false,
    public var Compression: Boolean = false,
    public var DataPadding: Boolean = false,
    public var ReportSetmarks: Boolean = false,
    public var DefaultBlockSize: UInt = 0u,
    public var MaximumBlockSize: UInt = 0u,
    public var MinimumBlockSize: UInt = 0u,
    public var MaximumPartitionCount: UInt = 0u,
    public var FeaturesLow: UInt = 0u,
    public var FeaturesHigh: TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH = 0u,
    public var EOTWarningZoneSize: UInt = 0u,
)

public data class TAPE_GET_MEDIA_PARAMETERS(
    public var Capacity: Long = 0L,
    public var Remaining: Long = 0L,
    public var BlockSize: UInt = 0u,
    public var PartitionCount: UInt = 0u,
    public var WriteProtected: Boolean = false,
)

public data class TAPE_SET_DRIVE_PARAMETERS(
    public var ECC: Boolean = false,
    public var Compression: Boolean = false,
    public var DataPadding: Boolean = false,
    public var ReportSetmarks: Boolean = false,
    public var EOTWarningZoneSize: UInt = 0u,
)

public data class TAPE_SET_MEDIA_PARAMETERS(public var BlockSize: UInt = 0u)

public data class TAPE_WMI_OPERATIONS(
    public var Method: UInt = 0u,
    public var DataBufferSize: UInt = 0u,
    public var DataBuffer: Long = 0L,
)

public data class TOKEN_BNO_ISOLATION_INFORMATION(public var IsolationPrefix: PWSTR = 0L, public var IsolationEnabled: Boolean = false)

public data class TOKEN_SID_INFORMATION(public var Sid: PSID = 0L)

public data class TRANSACTIONMANAGER_BASIC_INFORMATION(public var TmIdentity: GUID = GUID(), public var VirtualClock: Long = 0L)

public data class TRANSACTIONMANAGER_LOGPATH_INFORMATION(public var LogPathLength: UInt = 0u, public var LogPath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TRANSACTIONMANAGER_LOGPATH_INFORMATION) return false
        if (this.LogPathLength != other.LogPathLength) return false
        if (!this.LogPath.contentEquals(other.LogPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogPathLength.hashCode()
        result = 31 * result + this.LogPath.contentHashCode()
        return result
    }
}

public data class TRANSACTIONMANAGER_LOG_INFORMATION(public var LogIdentity: GUID = GUID())

public data class TRANSACTIONMANAGER_OLDEST_INFORMATION(public var OldestTransactionGuid: GUID = GUID())

public data class TRANSACTIONMANAGER_RECOVERY_INFORMATION(public var LastRecoveredLsn: ULong = 0uL)

public data class TRANSACTION_BASIC_INFORMATION(
    public var TransactionId: GUID = GUID(),
    public var State: UInt = 0u,
    public var Outcome: UInt = 0u,
)

public data class TRANSACTION_BIND_INFORMATION(public var TmHandle: HANDLE = 0L)

public data class TRANSACTION_ENLISTMENTS_INFORMATION(public var NumberOfEnlistments: UInt = 0u, public var EnlistmentPair: List<TRANSACTION_ENLISTMENT_PAIR> = List(1) { TRANSACTION_ENLISTMENT_PAIR() })

public data class TRANSACTION_ENLISTMENT_PAIR(public var EnlistmentId: GUID = GUID(), public var ResourceManagerId: GUID = GUID())

public data class TRANSACTION_LIST_ENTRY(public var UOW: GUID = GUID())

public data class TRANSACTION_LIST_INFORMATION(public var NumberOfTransactions: UInt = 0u, public var TransactionInformation: List<TRANSACTION_LIST_ENTRY> = List(1) { TRANSACTION_LIST_ENTRY() })

public data class TRANSACTION_PROPERTIES_INFORMATION(
    public var IsolationLevel: UInt = 0u,
    public var IsolationFlags: UInt = 0u,
    public var Timeout: Long = 0L,
    public var Outcome: UInt = 0u,
    public var DescriptionLength: UInt = 0u,
    public var Description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TRANSACTION_PROPERTIES_INFORMATION) return false
        if (this.IsolationLevel != other.IsolationLevel) return false
        if (this.IsolationFlags != other.IsolationFlags) return false
        if (this.Timeout != other.Timeout) return false
        if (this.Outcome != other.Outcome) return false
        if (this.DescriptionLength != other.DescriptionLength) return false
        if (!this.Description.contentEquals(other.Description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IsolationLevel.hashCode()
        result = 31 * result + this.IsolationFlags.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Outcome.hashCode()
        result = 31 * result + this.DescriptionLength.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        return result
    }
}

public data class TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION(public var SuperiorEnlistmentPair: TRANSACTION_ENLISTMENT_PAIR = TRANSACTION_ENLISTMENT_PAIR())

public data class UMS_CREATE_THREAD_ATTRIBUTES(
    public var UmsVersion: UInt = 0u,
    public var UmsContext: Long = 0L,
    public var UmsCompletionList: Long = 0L,
)

public data class XSAVE_CET_U_FORMAT(public var Ia32CetUMsr: ULong = 0uL, public var Ia32Pl3SspMsr: ULong = 0uL)

public data class remoteMETAFILEPICT(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var hMF: Long = 0L,
)

public data class userBITMAP(
    public var bmType: Int = 0,
    public var bmWidth: Int = 0,
    public var bmHeight: Int = 0,
    public var bmWidthBytes: Int = 0,
    public var bmPlanes: UShort = 0u,
    public var bmBitsPixel: UShort = 0u,
    public var cbSize: UInt = 0u,
    public var pBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is userBITMAP) return false
        if (this.bmType != other.bmType) return false
        if (this.bmWidth != other.bmWidth) return false
        if (this.bmHeight != other.bmHeight) return false
        if (this.bmWidthBytes != other.bmWidthBytes) return false
        if (this.bmPlanes != other.bmPlanes) return false
        if (this.bmBitsPixel != other.bmBitsPixel) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.pBuffer.contentEquals(other.pBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmType.hashCode()
        result = 31 * result + this.bmWidth.hashCode()
        result = 31 * result + this.bmHeight.hashCode()
        result = 31 * result + this.bmWidthBytes.hashCode()
        result = 31 * result + this.bmPlanes.hashCode()
        result = 31 * result + this.bmBitsPixel.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.pBuffer.contentHashCode()
        return result
    }
}

public data class userCLIPFORMAT(public var fContext: Int = 0, public var u: userCLIPFORMAT_0 = userCLIPFORMAT_0())

public data class userCLIPFORMAT_0(public var dwValue: UInt = 0u, public var pwszName: PWSTR = 0L)

public data class userHBITMAP(public var fContext: Int = 0, public var u: userHBITMAP_0 = userHBITMAP_0())

public data class userHBITMAP_0(
    public var hInproc: Int = 0,
    public var hRemote: Long = 0L,
    public var hInproc64: Long = 0L,
)

public data class userHENHMETAFILE(public var fContext: Int = 0, public var u: userHENHMETAFILE_0 = userHENHMETAFILE_0())

public data class userHENHMETAFILE_0(
    public var hInproc: Int = 0,
    public var hRemote: Long = 0L,
    public var hInproc64: Long = 0L,
)

public data class userHGLOBAL(public var fContext: Int = 0, public var u: userHGLOBAL_0 = userHGLOBAL_0())

public data class userHGLOBAL_0(
    public var hInproc: Int = 0,
    public var hRemote: Long = 0L,
    public var hInproc64: Long = 0L,
)

public data class userHMETAFILE(public var fContext: Int = 0, public var u: userHMETAFILE_0 = userHMETAFILE_0())

public data class userHMETAFILE_0(
    public var hInproc: Int = 0,
    public var hRemote: Long = 0L,
    public var hInproc64: Long = 0L,
)
