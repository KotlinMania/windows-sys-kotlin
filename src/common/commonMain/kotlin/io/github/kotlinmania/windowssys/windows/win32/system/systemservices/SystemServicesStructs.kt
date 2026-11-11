@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUser
import io.github.kotlinmania.windowssys.windows.win32.system.com.ByteBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.DwordBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.FlaggedByteBlob

public data class AnonObjectHeader(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
)

public data class AnonObjectHeaderBigobj(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
    public var flags: UInt = 0u,
    public var metaDataSize: UInt = 0u,
    public var metaDataOffset: UInt = 0u,
    public var numberOfSections: UInt = 0u,
    public var pointerToSymbolTable: UInt = 0u,
    public var numberOfSymbols: UInt = 0u,
)

public data class AnonObjectHeaderV2(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
    public var flags: UInt = 0u,
    public var metaDataSize: UInt = 0u,
    public var metaDataOffset: UInt = 0u,
)

public data class ApplicationlaunchSettingValue(
    public var activationTime: Long = 0L,
    public var flags: UInt = 0u,
    public var buttonInstanceID: UInt = 0u,
)

public data class ComponentFilter(
    public var componentFlags: UInt = 0u,
)

public data class DispatcherContextNonvolregArm64(
    public var buffer: UByteArray = UByteArray(152),
    public var anonymous: DispatcherContextNonvolregArm640 = DispatcherContextNonvolregArm640(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DispatcherContextNonvolregArm64) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DispatcherContextNonvolregArm640(
    public var gpNvRegs: ULongArray = ULongArray(11),
    public var fpNvRegs: DoubleArray = DoubleArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DispatcherContextNonvolregArm640) return false
        if (!this.gpNvRegs.contentEquals(other.gpNvRegs)) return false
        if (!this.fpNvRegs.contentEquals(other.fpNvRegs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpNvRegs.contentHashCode()
        result = 31 * result + this.fpNvRegs.contentHashCode()
        return result
    }
}

public data class EnlistmentBasicInformation(
    public var enlistmentId: Guid = Guid(),
    public var transactionId: Guid = Guid(),
    public var resourceManagerId: Guid = Guid(),
)

public data class EnlistmentCrmInformation(
    public var crmTransactionManagerId: Guid = Guid(),
    public var crmResourceManagerId: Guid = Guid(),
    public var crmEnlistmentId: Guid = Guid(),
)

public data class FileNotifyFullInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastModificationTime: Long = 0L,
    public var lastChangeTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var allocatedLength: Long = 0L,
    public var fileSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var anonymous: FileNotifyFullInformation0 = FileNotifyFullInformation0(),
    public var fileId: Long = 0L,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UShort = 0u,
    public var fileNameFlags: UByte = 0u,
    public var reserved: UByte = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyFullInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.action != other.action) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (this.lastChangeTime != other.lastChangeTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.allocatedLength != other.allocatedLength) return false
        if (this.fileSize != other.fileSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.anonymous != other.anonymous) return false
        if (this.fileId != other.fileId) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameFlags != other.fileNameFlags) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.lastChangeTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.allocatedLength.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameFlags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNotifyFullInformation0(
    public var reparsePointTag: UInt = 0u,
    public var eaSize: UInt = 0u,
)

public data class GdiNonremote(
    public var fContext: Int = 0,
    public var u: GdiNonremote0 = GdiNonremote0(),
)

public data class GdiNonremote0(
    public var hInproc: Int = 0,
    public var hRemote: DwordBlob? = null,
)

public data class HeapOptimizeResourcesInformation(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class HiberfileBucket(
    public var maxPhysicalMemory: ULong = 0uL,
    public var physicalMemoryPercent: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HiberfileBucket) return false
        if (this.maxPhysicalMemory != other.maxPhysicalMemory) return false
        if (!this.physicalMemoryPercent.contentEquals(other.physicalMemoryPercent)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxPhysicalMemory.hashCode()
        result = 31 * result + this.physicalMemoryPercent.contentHashCode()
        return result
    }
}

public data class ImageAlpha64RuntimeFunctionEntry(
    public var beginAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
    public var exceptionHandler: ULong = 0uL,
    public var handlerData: ULong = 0uL,
    public var prologEndAddress: ULong = 0uL,
)

public data class ImageAlphaRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var exceptionHandler: UInt = 0u,
    public var handlerData: UInt = 0u,
    public var prologEndAddress: UInt = 0u,
)

public data class ImageArchitectureEntry(
    public var fixupInstRVA: UInt = 0u,
    public var newInst: UInt = 0u,
)

public data class ImageArchitectureHeader(
    public var bitfield: UInt = 0u,
    public var firstEntryRVA: UInt = 0u,
)

public data class ImageArchiveMemberHeader(
    public var name: UByteArray = UByteArray(16),
    public var date: UByteArray = UByteArray(12),
    public var userID: UByteArray = UByteArray(6),
    public var groupID: UByteArray = UByteArray(6),
    public var mode: UByteArray = UByteArray(8),
    public var size: UByteArray = UByteArray(10),
    public var endHeader: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageArchiveMemberHeader) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.date.contentEquals(other.date)) return false
        if (!this.userID.contentEquals(other.userID)) return false
        if (!this.groupID.contentEquals(other.groupID)) return false
        if (!this.mode.contentEquals(other.mode)) return false
        if (!this.size.contentEquals(other.size)) return false
        if (!this.endHeader.contentEquals(other.endHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.date.contentHashCode()
        result = 31 * result + this.userID.contentHashCode()
        result = 31 * result + this.groupID.contentHashCode()
        result = 31 * result + this.mode.contentHashCode()
        result = 31 * result + this.size.contentHashCode()
        result = 31 * result + this.endHeader.contentHashCode()
        return result
    }
}

public data class ImageArm64RuntimeFunctionEntryXdata(
    public var headerData: UInt = 0u,
    public var anonymous: ImageArm64RuntimeFunctionEntryXdata0 = ImageArm64RuntimeFunctionEntryXdata0(),
)

public data class ImageArm64RuntimeFunctionEntryXdata0(
    public var bitfield: UInt = 0u,
)

public data class ImageArmRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var anonymous: ImageArmRuntimeFunctionEntry0 = ImageArmRuntimeFunctionEntry0(),
)

public data class ImageArmRuntimeFunctionEntry0(
    public var unwindData: UInt = 0u,
    public var anonymous: ImageArmRuntimeFunctionEntry00 = ImageArmRuntimeFunctionEntry00(),
)

public data class ImageArmRuntimeFunctionEntry00(
    public var bitfield: UInt = 0u,
)

public data class ImageAuxSymbol(
    public var sym: ImageAuxSymbol0 = ImageAuxSymbol0(),
    public var file: ImageAuxSymbol1 = ImageAuxSymbol1(),
    public var section: ImageAuxSymbol2 = ImageAuxSymbol2(),
    public var tokenDef: ImageAuxSymbolTokenDef = ImageAuxSymbolTokenDef(),
    public var crc: ImageAuxSymbol3 = ImageAuxSymbol3(),
)

public data class ImageAuxSymbol3(
    public var crc: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol3) return false
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

public data class ImageAuxSymbol1(
    public var name: UByteArray = UByteArray(18),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol1) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int = this.name.contentHashCode()
}

public data class ImageAuxSymbol2(
    public var length: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var checkSum: UInt = 0u,
    public var number: Short = 0,
    public var selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var highNumber: Short = 0,
)

public data class ImageAuxSymbol0(
    public var tagIndex: UInt = 0u,
    public var misc: ImageAuxSymbol00 = ImageAuxSymbol00(),
    public var fcnAry: ImageAuxSymbol01 = ImageAuxSymbol01(),
    public var tvIndex: UShort = 0u,
)

public data class ImageAuxSymbol01(
    public var function: ImageAuxSymbol010 = ImageAuxSymbol010(),
    public var array: ImageAuxSymbol011 = ImageAuxSymbol011(),
)

public data class ImageAuxSymbol011(
    public var dimension: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol011) return false
        if (!this.dimension.contentEquals(other.dimension)) return false
        return true
    }

    override fun hashCode(): Int = this.dimension.contentHashCode()
}

public data class ImageAuxSymbol010(
    public var pointerToLinenumber: UInt = 0u,
    public var pointerToNextFunction: UInt = 0u,
)

public data class ImageAuxSymbol00(
    public var lnSz: ImageAuxSymbol000 = ImageAuxSymbol000(),
    public var totalSize: UInt = 0u,
)

public data class ImageAuxSymbol000(
    public var linenumber: UShort = 0u,
    public var size: UShort = 0u,
)

public data class ImageAuxSymbolEx(
    public var sym: ImageAuxSymbolEx0 = ImageAuxSymbolEx0(),
    public var file: ImageAuxSymbolEx1 = ImageAuxSymbolEx1(),
    public var section: ImageAuxSymbolEx2 = ImageAuxSymbolEx2(),
    public var anonymous: ImageAuxSymbolEx3 = ImageAuxSymbolEx3(),
    public var crc: ImageAuxSymbolEx4 = ImageAuxSymbolEx4(),
)

public data class ImageAuxSymbolEx3(
    public var tokenDef: ImageAuxSymbolTokenDef = ImageAuxSymbolTokenDef(),
    public var rgbReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx3) return false
        if (this.tokenDef != other.tokenDef) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tokenDef.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class ImageAuxSymbolEx4(
    public var crc: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx4) return false
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

public data class ImageAuxSymbolEx1(
    public var name: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx1) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int = this.name.contentHashCode()
}

public data class ImageAuxSymbolEx2(
    public var length: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var checkSum: UInt = 0u,
    public var number: Short = 0,
    public var selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var highNumber: Short = 0,
    public var rgbReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx2) return false
        if (this.length != other.length) return false
        if (this.numberOfRelocations != other.numberOfRelocations) return false
        if (this.numberOfLinenumbers != other.numberOfLinenumbers) return false
        if (this.checkSum != other.checkSum) return false
        if (this.number != other.number) return false
        if (this.selection != other.selection) return false
        if (this.bReserved != other.bReserved) return false
        if (this.highNumber != other.highNumber) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.numberOfRelocations.hashCode()
        result = 31 * result + this.numberOfLinenumbers.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.number.hashCode()
        result = 31 * result + this.selection.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.highNumber.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class ImageAuxSymbolEx0(
    public var weakDefaultSymIndex: UInt = 0u,
    public var weakSearchType: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx0) return false
        if (this.weakDefaultSymIndex != other.weakDefaultSymIndex) return false
        if (this.weakSearchType != other.weakSearchType) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.weakDefaultSymIndex.hashCode()
        result = 31 * result + this.weakSearchType.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class ImageAuxSymbolTokenDef(
    public var bAuxType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var symbolTableIndex: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolTokenDef) return false
        if (this.bAuxType != other.bAuxType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.symbolTableIndex != other.symbolTableIndex) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bAuxType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.symbolTableIndex.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }
}

public data class ImageBaseRelocation(
    public var virtualAddress: UInt = 0u,
    public var sizeOfBlock: UInt = 0u,
)

public data class ImageBddDynamicRelocation(
    public var left: UShort = 0u,
    public var right: UShort = 0u,
    public var value: UInt = 0u,
)

public data class ImageBddInfo(
    public var version: UInt = 0u,
    public var bDDSize: UInt = 0u,
)

public data class ImageBoundForwarderRef(
    public var timeDateStamp: UInt = 0u,
    public var offsetModuleName: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class ImageBoundImportDescriptor(
    public var timeDateStamp: UInt = 0u,
    public var offsetModuleName: UShort = 0u,
    public var numberOfModuleForwarderRefs: UShort = 0u,
)

public data class ImageCeRuntimeFunctionEntry(
    public var funcStart: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class ImageDebugMisc(
    public var dataType: UInt = 0u,
    public var length: UInt = 0u,
    public var unicode: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageDebugMisc) return false
        if (this.dataType != other.dataType) return false
        if (this.length != other.length) return false
        if (this.unicode != other.unicode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataType.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.unicode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public class ImageDosHeader(
    public var eMagic: UShort = 0u,
    public var eCblp: UShort = 0u,
    public var eCp: UShort = 0u,
    public var eCrlc: UShort = 0u,
    public var eCparhdr: UShort = 0u,
    public var eMinalloc: UShort = 0u,
    public var eMaxalloc: UShort = 0u,
    public var eSs: UShort = 0u,
    public var eSp: UShort = 0u,
    public var eCsum: UShort = 0u,
    public var eIp: UShort = 0u,
    public var eCs: UShort = 0u,
    public var eLfarlc: UShort = 0u,
    public var eOvno: UShort = 0u,
    public var eRes: UShortArray = UShortArray(4),
    public var eOemid: UShort = 0u,
    public var eOeminfo: UShort = 0u,
    public var eRes2: UShortArray = UShortArray(10),
    public var eLfanew: Int = 0,
)

public data class ImageDynamicRelocation32(
    public var symbol: UInt = 0u,
    public var baseRelocSize: UInt = 0u,
)

public data class ImageDynamicRelocation32V2(
    public var headerSize: UInt = 0u,
    public var fixupInfoSize: UInt = 0u,
    public var symbol: UInt = 0u,
    public var symbolGroup: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class ImageDynamicRelocation64(
    public var symbol: ULong = 0uL,
    public var baseRelocSize: UInt = 0u,
)

public data class ImageDynamicRelocation64V2(
    public var headerSize: UInt = 0u,
    public var fixupInfoSize: UInt = 0u,
    public var symbol: ULong = 0uL,
    public var symbolGroup: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class ImageDynamicRelocationTable(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
)

public data class ImageEpilogueDynamicRelocationHeader(
    public var epilogueCount: UInt = 0u,
    public var epilogueByteCount: UByte = 0u,
    public var branchDescriptorElementSize: UByte = 0u,
    public var branchDescriptorCount: UShort = 0u,
)

public data class ImageExportDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var name: UInt = 0u,
    public var base: UInt = 0u,
    public var numberOfFunctions: UInt = 0u,
    public var numberOfNames: UInt = 0u,
    public var addressOfFunctions: UInt = 0u,
    public var addressOfNames: UInt = 0u,
    public var addressOfNameOrdinals: UInt = 0u,
)

public data class ImageFunctionOverrideDynamicRelocation(
    public var originalRva: UInt = 0u,
    public var bDDOffset: UInt = 0u,
    public var rvaSize: UInt = 0u,
    public var baseRelocSize: UInt = 0u,
)

public data class ImageFunctionOverrideHeader(
    public var funcOverrideSize: UInt = 0u,
)

public data class ImageHotPatchBase(
    public var sequenceNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var originalTimeDateStamp: UInt = 0u,
    public var originalCheckSum: UInt = 0u,
    public var codeIntegrityInfo: UInt = 0u,
    public var codeIntegritySize: UInt = 0u,
    public var patchTable: UInt = 0u,
    public var bufferOffset: UInt = 0u,
)

public data class ImageHotPatchHashes(
    public var sha256: UByteArray = UByteArray(32),
    public var sha1: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageHotPatchHashes) return false
        if (!this.sha256.contentEquals(other.sha256)) return false
        if (!this.sha1.contentEquals(other.sha1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sha256.contentHashCode()
        result = 31 * result + this.sha1.contentHashCode()
        return result
    }
}

public data class ImageHotPatchInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sequenceNumber: UInt = 0u,
    public var baseImageList: UInt = 0u,
    public var baseImageCount: UInt = 0u,
    public var bufferOffset: UInt = 0u,
    public var extraPatchSize: UInt = 0u,
)

public data class ImageImportByName(
    public var hint: UShort = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageImportByName) return false
        if (this.hint != other.hint) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hint.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ImageImportControlTransferDynamicRelocation(
    public var bitfield: UInt = 0u,
)

public data class ImageImportDescriptor(
    public var anonymous: ImageImportDescriptor0 = ImageImportDescriptor0(),
    public var timeDateStamp: UInt = 0u,
    public var forwarderChain: UInt = 0u,
    public var name: UInt = 0u,
    public var firstThunk: UInt = 0u,
)

public data class ImageImportDescriptor0(
    public var characteristics: UInt = 0u,
    public var originalFirstThunk: UInt = 0u,
)

public data class ImageIndirControlTransferDynamicRelocation(
    public var bitfield: UShort = 0u,
)

public data class ImageLinenumber(
    public var type: ImageLinenumber0 = ImageLinenumber0(),
    public var linenumber: UShort = 0u,
)

public data class ImageLinenumber0(
    public var symbolTableIndex: UInt = 0u,
    public var virtualAddress: UInt = 0u,
)

public class ImageOs2Header(
    public var neMagic: UShort = 0u,
    public var neVer: Byte = 0,
    public var neRev: Byte = 0,
    public var neEnttab: UShort = 0u,
    public var neCbenttab: UShort = 0u,
    public var neCrc: Int = 0,
    public var neFlags: UShort = 0u,
    public var neAutodata: UShort = 0u,
    public var neHeap: UShort = 0u,
    public var neStack: UShort = 0u,
    public var neCsip: Int = 0,
    public var neSssp: Int = 0,
    public var neCseg: UShort = 0u,
    public var neCmod: UShort = 0u,
    public var neCbnrestab: UShort = 0u,
    public var neSegtab: UShort = 0u,
    public var neRsrctab: UShort = 0u,
    public var neRestab: UShort = 0u,
    public var neModtab: UShort = 0u,
    public var neImptab: UShort = 0u,
    public var neNrestab: Int = 0,
    public var neCmovent: UShort = 0u,
    public var neAlign: UShort = 0u,
    public var neCres: UShort = 0u,
    public var neExetyp: UByte = 0u,
    public var neFlagsothers: UByte = 0u,
    public var nePretthunks: UShort = 0u,
    public var nePsegrefbytes: UShort = 0u,
    public var neSwaparea: UShort = 0u,
    public var neExpver: UShort = 0u,
)

public data class ImagePolicyEntry(
    public var type: ImagePolicyEntryType = 0,
    public var policyId: ImagePolicyId = 0,
    public var u: ImagePolicyEntry0 = ImagePolicyEntry0(),
)

public data class ImagePolicyEntry0(
    public var none: COpaquePointer? = null,
    public var boolValue: Boolean = false,
    public var int8Value: Byte = 0,
    public var uInt8Value: UByte = 0u,
    public var int16Value: Short = 0,
    public var uInt16Value: UShort = 0u,
    public var int32Value: Int = 0,
    public var uInt32Value: UInt = 0u,
    public var int64Value: Long = 0L,
    public var uInt64Value: ULong = 0uL,
    public var ansiStringValue: Pcstr = null,
    public var unicodeStringValue: Pcwstr = null,
)

public data class ImagePolicyMetadata(
    public var version: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(7),
    public var applicationId: ULong = 0uL,
    public var policies: List<ImagePolicyEntry> = List(1) { ImagePolicyEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagePolicyMetadata) return false
        if (this.version != other.version) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.applicationId != other.applicationId) return false
        if (this.policies != other.policies) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.applicationId.hashCode()
        result = 31 * result + this.policies.hashCode()
        return result
    }
}

public data class ImagePrologueDynamicRelocationHeader(
    public var prologueByteCount: UByte = 0u,
)

public data class ImageRelocation(
    public var anonymous: ImageRelocation0 = ImageRelocation0(),
    public var symbolTableIndex: UInt = 0u,
    public var type: UShort = 0u,
)

public data class ImageRelocation0(
    public var virtualAddress: UInt = 0u,
    public var relocCount: UInt = 0u,
)

public data class ImageResourceDataEntry(
    public var offsetToData: UInt = 0u,
    public var size: UInt = 0u,
    public var codePage: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ImageResourceDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var numberOfNamedEntries: UShort = 0u,
    public var numberOfIdEntries: UShort = 0u,
)

public data class ImageResourceDirectoryEntry(
    public var anonymous1: ImageResourceDirectoryEntry0 = ImageResourceDirectoryEntry0(),
    public var anonymous2: ImageResourceDirectoryEntry1 = ImageResourceDirectoryEntry1(),
)

public data class ImageResourceDirectoryEntry0(
    public var anonymous: ImageResourceDirectoryEntry00 = ImageResourceDirectoryEntry00(),
    public var name: UInt = 0u,
    public var id: UShort = 0u,
)

public data class ImageResourceDirectoryEntry00(
    public var bitfield: UInt = 0u,
)

public data class ImageResourceDirectoryEntry1(
    public var offsetToData: UInt = 0u,
    public var anonymous: ImageResourceDirectoryEntry10 = ImageResourceDirectoryEntry10(),
)

public data class ImageResourceDirectoryEntry10(
    public var bitfield: UInt = 0u,
)

public data class ImageResourceDirectoryString(
    public var length: UShort = 0u,
    public var nameString: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageResourceDirectoryString) return false
        if (this.length != other.length) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }
}

public data class ImageResourceDirStringU(
    public var length: UShort = 0u,
    public var nameString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageResourceDirStringU) return false
        if (this.length != other.length) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }
}

public data class ImageSeparateDebugHeader(
    public var signature: UShort = 0u,
    public var flags: UShort = 0u,
    public var machine: UShort = 0u,
    public var characteristics: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var imageBase: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var numberOfSections: UInt = 0u,
    public var exportedNamesSize: UInt = 0u,
    public var debugDirectorySize: UInt = 0u,
    public var sectionAlignment: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSeparateDebugHeader) return false
        if (this.signature != other.signature) return false
        if (this.flags != other.flags) return false
        if (this.machine != other.machine) return false
        if (this.characteristics != other.characteristics) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.checkSum != other.checkSum) return false
        if (this.imageBase != other.imageBase) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        if (this.numberOfSections != other.numberOfSections) return false
        if (this.exportedNamesSize != other.exportedNamesSize) return false
        if (this.debugDirectorySize != other.debugDirectorySize) return false
        if (this.sectionAlignment != other.sectionAlignment) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.machine.hashCode()
        result = 31 * result + this.characteristics.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.imageBase.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        result = 31 * result + this.numberOfSections.hashCode()
        result = 31 * result + this.exportedNamesSize.hashCode()
        result = 31 * result + this.debugDirectorySize.hashCode()
        result = 31 * result + this.sectionAlignment.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class ImageSwitchtableBranchDynamicRelocation(
    public var bitfield: UShort = 0u,
)

public data class ImageSymbol(
    public var n: ImageSymbol0 = ImageSymbol0(),
    public var value: UInt = 0u,
    public var sectionNumber: Short = 0,
    public var type: UShort = 0u,
    public var storageClass: UByte = 0u,
    public var numberOfAuxSymbols: UByte = 0u,
)

public data class ImageSymbol0(
    public var shortName: UByteArray = UByteArray(8),
    public var name: ImageSymbol00 = ImageSymbol00(),
    public var longName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSymbol0) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.name != other.name) return false
        if (!this.longName.contentEquals(other.longName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shortName.contentHashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.longName.contentHashCode()
        return result
    }
}

public data class ImageSymbol00(
    public var short: UInt = 0u,
    public var long: UInt = 0u,
)

public data class ImageSymbolEx(
    public var n: ImageSymbolEx0 = ImageSymbolEx0(),
    public var value: UInt = 0u,
    public var sectionNumber: Int = 0,
    public var type: UShort = 0u,
    public var storageClass: UByte = 0u,
    public var numberOfAuxSymbols: UByte = 0u,
)

public data class ImageSymbolEx0(
    public var shortName: UByteArray = UByteArray(8),
    public var name: ImageSymbolEx00 = ImageSymbolEx00(),
    public var longName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSymbolEx0) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.name != other.name) return false
        if (!this.longName.contentEquals(other.longName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shortName.contentHashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.longName.contentHashCode()
        return result
    }
}

public data class ImageSymbolEx00(
    public var short: UInt = 0u,
    public var long: UInt = 0u,
)

public data class ImageTlsDirectory32(
    public var startAddressOfRawData: UInt = 0u,
    public var endAddressOfRawData: UInt = 0u,
    public var addressOfIndex: UInt = 0u,
    public var addressOfCallBacks: UInt = 0u,
    public var sizeOfZeroFill: UInt = 0u,
    public var anonymous: ImageTlsDirectory320 = ImageTlsDirectory320(),
)

public data class ImageTlsDirectory320(
    public var characteristics: UInt = 0u,
    public var anonymous: ImageTlsDirectory3200 = ImageTlsDirectory3200(),
)

public data class ImageTlsDirectory3200(
    public var bitfield: UInt = 0u,
)

public data class ImageTlsDirectory64(
    public var startAddressOfRawData: ULong = 0uL,
    public var endAddressOfRawData: ULong = 0uL,
    public var addressOfIndex: ULong = 0uL,
    public var addressOfCallBacks: ULong = 0uL,
    public var sizeOfZeroFill: UInt = 0u,
    public var anonymous: ImageTlsDirectory640 = ImageTlsDirectory640(),
)

public data class ImageTlsDirectory640(
    public var characteristics: UInt = 0u,
    public var anonymous: ImageTlsDirectory6400 = ImageTlsDirectory6400(),
)

public data class ImageTlsDirectory6400(
    public var bitfield: UInt = 0u,
)

public class ImageVxdHeader(
    public var e32Magic: UShort = 0u,
    public var e32Border: UByte = 0u,
    public var e32Worder: UByte = 0u,
    public var e32Level: UInt = 0u,
    public var e32Cpu: UShort = 0u,
    public var e32Os: UShort = 0u,
    public var e32Ver: UInt = 0u,
    public var e32Mflags: UInt = 0u,
    public var e32Mpages: UInt = 0u,
    public var e32Startobj: UInt = 0u,
    public var e32Eip: UInt = 0u,
    public var e32Stackobj: UInt = 0u,
    public var e32Esp: UInt = 0u,
    public var e32Pagesize: UInt = 0u,
    public var e32Lastpagesize: UInt = 0u,
    public var e32Fixupsize: UInt = 0u,
    public var e32Fixupsum: UInt = 0u,
    public var e32Ldrsize: UInt = 0u,
    public var e32Ldrsum: UInt = 0u,
    public var e32Objtab: UInt = 0u,
    public var e32Objcnt: UInt = 0u,
    public var e32Objmap: UInt = 0u,
    public var e32Itermap: UInt = 0u,
    public var e32Rsrctab: UInt = 0u,
    public var e32Rsrccnt: UInt = 0u,
    public var e32Restab: UInt = 0u,
    public var e32Enttab: UInt = 0u,
    public var e32Dirtab: UInt = 0u,
    public var e32Dircnt: UInt = 0u,
    public var e32Fpagetab: UInt = 0u,
    public var e32Frectab: UInt = 0u,
    public var e32Impmod: UInt = 0u,
    public var e32Impmodcnt: UInt = 0u,
    public var e32Impproc: UInt = 0u,
    public var e32Pagesum: UInt = 0u,
    public var e32Datapage: UInt = 0u,
    public var e32Preload: UInt = 0u,
    public var e32Nrestab: UInt = 0u,
    public var e32Cbnrestab: UInt = 0u,
    public var e32Nressum: UInt = 0u,
    public var e32Autodata: UInt = 0u,
    public var e32Debuginfo: UInt = 0u,
    public var e32Debuglen: UInt = 0u,
    public var e32Instpreload: UInt = 0u,
    public var e32Instdemand: UInt = 0u,
    public var e32Heapsize: UInt = 0u,
    public var e32Res3: UByteArray = UByteArray(12),
    public var e32Winresoff: UInt = 0u,
    public var e32Winreslen: UInt = 0u,
    public var e32Devid: UShort = 0u,
    public var e32Ddkver: UShort = 0u,
)

public data class ImportObjectHeader(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var sizeOfData: UInt = 0u,
    public var anonymous: ImportObjectHeader0 = ImportObjectHeader0(),
    public var bitfield: UShort = 0u,
)

public data class ImportObjectHeader0(
    public var ordinal: UShort = 0u,
    public var hint: UShort = 0u,
)

public data class KernelCetContext(
    public var ssp: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var segCs: UShort = 0u,
    public var anonymous: KernelCetContext0 = KernelCetContext0(),
    public var fill: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KernelCetContext) return false
        if (this.ssp != other.ssp) return false
        if (this.rip != other.rip) return false
        if (this.segCs != other.segCs) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.fill.contentEquals(other.fill)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssp.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.segCs.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.fill.contentHashCode()
        return result
    }
}

public data class KernelCetContext0(
    public var allFlags: UShort = 0u,
    public var anonymous: KernelCetContext00 = KernelCetContext00(),
)

public data class KernelCetContext00(
    public var bitfield: UShort = 0u,
)

public data class KtmobjectCursor(
    public var lastQuery: Guid = Guid(),
    public var objectIdCount: UInt = 0u,
    public var objectIds: List<Guid> = List(1) { Guid() },
)

public data class MaxversiontestedInfo(
    public var maxVersionTested: ULong = 0uL,
)

public data class NetworkAppInstanceEa(
    public var appInstanceID: Guid = Guid(),
    public var csvFlags: UInt = 0u,
)

public data class NonPagedDebugInfo(
    public var signature: UShort = 0u,
    public var flags: UShort = 0u,
    public var size: UInt = 0u,
    public var machine: UShort = 0u,
    public var characteristics: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var imageBase: ULong = 0uL,
)

public data class NotifyUserPowerSetting(
    public var guid: Guid = Guid(),
)

public data class NtTib32(
    public var exceptionList: UInt = 0u,
    public var stackBase: UInt = 0u,
    public var stackLimit: UInt = 0u,
    public var subSystemTib: UInt = 0u,
    public var anonymous: NtTib320 = NtTib320(),
    public var arbitraryUserPointer: UInt = 0u,
    public var selfRef: UInt = 0u,
)

public data class NtTib320(
    public var fiberData: UInt = 0u,
    public var version: UInt = 0u,
)

public data class NtTib64(
    public var exceptionList: ULong = 0uL,
    public var stackBase: ULong = 0uL,
    public var stackLimit: ULong = 0uL,
    public var subSystemTib: ULong = 0uL,
    public var anonymous: NtTib640 = NtTib640(),
    public var arbitraryUserPointer: ULong = 0uL,
    public var selfRef: ULong = 0uL,
)

public data class NtTib640(
    public var fiberData: ULong = 0uL,
    public var version: UInt = 0u,
)

public data class Packedeventinfo(
    public var ulSize: UInt = 0u,
    public var ulNumEventsForLogFile: UInt = 0u,
    public var ulOffsets: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Packedeventinfo) return false
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

public data class ProcessorIdlestateInfo(
    public var timeCheck: UInt = 0u,
    public var demotePercent: UByte = 0u,
    public var promotePercent: UByte = 0u,
    public var spare: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorIdlestateInfo) return false
        if (this.timeCheck != other.timeCheck) return false
        if (this.demotePercent != other.demotePercent) return false
        if (this.promotePercent != other.promotePercent) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeCheck.hashCode()
        result = 31 * result + this.demotePercent.hashCode()
        result = 31 * result + this.promotePercent.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }
}

public data class ProcessorIdlestatePolicy(
    public var revision: UShort = 0u,
    public var flags: ProcessorIdlestatePolicy0 = ProcessorIdlestatePolicy0(),
    public var policyCount: UInt = 0u,
    public var policy: List<ProcessorIdlestateInfo> = List(3) { ProcessorIdlestateInfo() },
)

public data class ProcessorIdlestatePolicy0(
    public var asWORD: UShort = 0u,
    public var anonymous: ProcessorIdlestatePolicy00 = ProcessorIdlestatePolicy00(),
)

public data class ProcessorIdlestatePolicy00(
    public var bitfield: UShort = 0u,
)

public data class ProcessorPerfstatePolicy(
    public var revision: UInt = 0u,
    public var maxThrottle: UByte = 0u,
    public var minThrottle: UByte = 0u,
    public var busyAdjThreshold: UByte = 0u,
    public var anonymous: ProcessorPerfstatePolicy0 = ProcessorPerfstatePolicy0(),
    public var timeCheck: UInt = 0u,
    public var increaseTime: UInt = 0u,
    public var decreaseTime: UInt = 0u,
    public var increasePercent: UInt = 0u,
    public var decreasePercent: UInt = 0u,
)

public data class ProcessorPerfstatePolicy0(
    public var spare: UByte = 0u,
    public var flags: ProcessorPerfstatePolicy00 = ProcessorPerfstatePolicy00(),
)

public data class ProcessorPerfstatePolicy00(
    public var asBYTE: UByte = 0u,
    public var anonymous: ProcessorPerfstatePolicy000 = ProcessorPerfstatePolicy000(),
)

public data class ProcessorPerfstatePolicy000(
    public var bitfield: UByte = 0u,
)

public data class ProcessMitigationActivationContextTrustPolicy(
    public var anonymous: ProcessMitigationActivationContextTrustPolicy0 = ProcessMitigationActivationContextTrustPolicy0(),
)

public data class ProcessMitigationActivationContextTrustPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationActivationContextTrustPolicy00 = ProcessMitigationActivationContextTrustPolicy00(),
)

public data class ProcessMitigationActivationContextTrustPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationAslrPolicy(
    public var anonymous: ProcessMitigationAslrPolicy0 = ProcessMitigationAslrPolicy0(),
)

public data class ProcessMitigationAslrPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationAslrPolicy00 = ProcessMitigationAslrPolicy00(),
)

public data class ProcessMitigationAslrPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationBinarySignaturePolicy(
    public var anonymous: ProcessMitigationBinarySignaturePolicy0 = ProcessMitigationBinarySignaturePolicy0(),
)

public data class ProcessMitigationBinarySignaturePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationBinarySignaturePolicy00 = ProcessMitigationBinarySignaturePolicy00(),
)

public data class ProcessMitigationBinarySignaturePolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationChildProcessPolicy(
    public var anonymous: ProcessMitigationChildProcessPolicy0 = ProcessMitigationChildProcessPolicy0(),
)

public data class ProcessMitigationChildProcessPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationChildProcessPolicy00 = ProcessMitigationChildProcessPolicy00(),
)

public data class ProcessMitigationChildProcessPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationControlFlowGuardPolicy(
    public var anonymous: ProcessMitigationControlFlowGuardPolicy0 = ProcessMitigationControlFlowGuardPolicy0(),
)

public data class ProcessMitigationControlFlowGuardPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationControlFlowGuardPolicy00 = ProcessMitigationControlFlowGuardPolicy00(),
)

public data class ProcessMitigationControlFlowGuardPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationDepPolicy(
    public var anonymous: ProcessMitigationDepPolicy0 = ProcessMitigationDepPolicy0(),
    public var permanent: Boolean = false,
)

public data class ProcessMitigationDepPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationDepPolicy00 = ProcessMitigationDepPolicy00(),
)

public data class ProcessMitigationDepPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationDynamicCodePolicy(
    public var anonymous: ProcessMitigationDynamicCodePolicy0 = ProcessMitigationDynamicCodePolicy0(),
)

public data class ProcessMitigationDynamicCodePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationDynamicCodePolicy00 = ProcessMitigationDynamicCodePolicy00(),
)

public data class ProcessMitigationDynamicCodePolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationExtensionPointDisablePolicy(
    public var anonymous: ProcessMitigationExtensionPointDisablePolicy0 = ProcessMitigationExtensionPointDisablePolicy0(),
)

public data class ProcessMitigationExtensionPointDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationExtensionPointDisablePolicy00 = ProcessMitigationExtensionPointDisablePolicy00(),
)

public data class ProcessMitigationExtensionPointDisablePolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationFontDisablePolicy(
    public var anonymous: ProcessMitigationFontDisablePolicy0 = ProcessMitigationFontDisablePolicy0(),
)

public data class ProcessMitigationFontDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationFontDisablePolicy00 = ProcessMitigationFontDisablePolicy00(),
)

public data class ProcessMitigationFontDisablePolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationImageLoadPolicy(
    public var anonymous: ProcessMitigationImageLoadPolicy0 = ProcessMitigationImageLoadPolicy0(),
)

public data class ProcessMitigationImageLoadPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationImageLoadPolicy00 = ProcessMitigationImageLoadPolicy00(),
)

public data class ProcessMitigationImageLoadPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationPayloadRestrictionPolicy(
    public var anonymous: ProcessMitigationPayloadRestrictionPolicy0 = ProcessMitigationPayloadRestrictionPolicy0(),
)

public data class ProcessMitigationPayloadRestrictionPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationPayloadRestrictionPolicy00 = ProcessMitigationPayloadRestrictionPolicy00(),
)

public data class ProcessMitigationPayloadRestrictionPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationRedirectionTrustPolicy(
    public var anonymous: ProcessMitigationRedirectionTrustPolicy0 = ProcessMitigationRedirectionTrustPolicy0(),
)

public data class ProcessMitigationRedirectionTrustPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationRedirectionTrustPolicy00 = ProcessMitigationRedirectionTrustPolicy00(),
)

public data class ProcessMitigationRedirectionTrustPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationSehopPolicy(
    public var anonymous: ProcessMitigationSehopPolicy0 = ProcessMitigationSehopPolicy0(),
)

public data class ProcessMitigationSehopPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSehopPolicy00 = ProcessMitigationSehopPolicy00(),
)

public data class ProcessMitigationSehopPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationSideChannelIsolationPolicy(
    public var anonymous: ProcessMitigationSideChannelIsolationPolicy0 = ProcessMitigationSideChannelIsolationPolicy0(),
)

public data class ProcessMitigationSideChannelIsolationPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSideChannelIsolationPolicy00 = ProcessMitigationSideChannelIsolationPolicy00(),
)

public data class ProcessMitigationSideChannelIsolationPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationStrictHandleCheckPolicy(
    public var anonymous: ProcessMitigationStrictHandleCheckPolicy0 = ProcessMitigationStrictHandleCheckPolicy0(),
)

public data class ProcessMitigationStrictHandleCheckPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationStrictHandleCheckPolicy00 = ProcessMitigationStrictHandleCheckPolicy00(),
)

public data class ProcessMitigationStrictHandleCheckPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationSystemCallDisablePolicy(
    public var anonymous: ProcessMitigationSystemCallDisablePolicy0 = ProcessMitigationSystemCallDisablePolicy0(),
)

public data class ProcessMitigationSystemCallDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSystemCallDisablePolicy00 = ProcessMitigationSystemCallDisablePolicy00(),
)

public data class ProcessMitigationSystemCallDisablePolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationSystemCallFilterPolicy(
    public var anonymous: ProcessMitigationSystemCallFilterPolicy0 = ProcessMitigationSystemCallFilterPolicy0(),
)

public data class ProcessMitigationSystemCallFilterPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSystemCallFilterPolicy00 = ProcessMitigationSystemCallFilterPolicy00(),
)

public data class ProcessMitigationSystemCallFilterPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationUserPointerAuthPolicy(
    public var anonymous: ProcessMitigationUserPointerAuthPolicy0 = ProcessMitigationUserPointerAuthPolicy0(),
)

public data class ProcessMitigationUserPointerAuthPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationUserPointerAuthPolicy00 = ProcessMitigationUserPointerAuthPolicy00(),
)

public data class ProcessMitigationUserPointerAuthPolicy00(
    public var bitfield: UInt = 0u,
)

public data class ProcessMitigationUserShadowStackPolicy(
    public var anonymous: ProcessMitigationUserShadowStackPolicy0 = ProcessMitigationUserShadowStackPolicy0(),
)

public data class ProcessMitigationUserShadowStackPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationUserShadowStackPolicy00 = ProcessMitigationUserShadowStackPolicy00(),
)

public data class ProcessMitigationUserShadowStackPolicy00(
    public var bitfield: UInt = 0u,
)

public data class QuotaLimitsEx(
    public var pagedPoolLimit: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var minimumWorkingSetSize: Int = 0,
    public var maximumWorkingSetSize: Int = 0,
    public var pagefileLimit: Int = 0,
    public var timeLimit: Long = 0L,
    public var workingSetLimit: Int = 0,
    public var reserved2: Int = 0,
    public var reserved3: Int = 0,
    public var reserved4: Int = 0,
    public var flags: UInt = 0u,
    public var cpuRateLimit: RateQuotaLimit = RateQuotaLimit(),
)

public data class RateQuotaLimit(
    public var rateData: UInt = 0u,
    public var anonymous: RateQuotaLimit0 = RateQuotaLimit0(),
)

public data class RateQuotaLimit0(
    public var bitfield: UInt = 0u,
)

public data class RearrangeFileData(
    public var sourceStartingOffset: ULong = 0uL,
    public var targetOffset: ULong = 0uL,
    public var sourceFileHandle: Handle = null,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class RearrangeFileData32(
    public var sourceStartingOffset: ULong = 0uL,
    public var targetOffset: ULong = 0uL,
    public var sourceFileHandle: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class RedbookDigitalAudioExtractionInfo(
    public var version: UInt = 0u,
    public var accurate: UInt = 0u,
    public var supported: UInt = 0u,
    public var accurateMask0: UInt = 0u,
)

public data class ResourcemanagerBasicInformation(
    public var resourceManagerId: Guid = Guid(),
    public var descriptionLength: UInt = 0u,
    public var description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourcemanagerBasicInformation) return false
        if (this.resourceManagerId != other.resourceManagerId) return false
        if (this.descriptionLength != other.descriptionLength) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceManagerId.hashCode()
        result = 31 * result + this.descriptionLength.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public data class ResourcemanagerCompletionInformation(
    public var ioCompletionPortHandle: Handle = null,
    public var completionKey: Int = 0,
)

public data class RemHBITMAP(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
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

public data class RemHBRUSH(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
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

public data class RemHENHMETAFILE(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
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

public data class RemHPALETTE(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
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

public data class RemotableHandle(
    public var fContext: Int = 0,
    public var u: RemotableHandle0 = RemotableHandle0(),
)

public data class RemotableHandle0(
    public var hInproc: Int = 0,
    public var hRemote: Int = 0,
)

public data class ScopeTableAmd64(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableAmd640> = List(1) { ScopeTableAmd640() },
)

public data class ScopeTableAmd640(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
)

public data class ScopeTableArm(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableArm0> = List(1) { ScopeTableArm0() },
)

public data class ScopeTableArm0(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
)

public data class ScopeTableArm64(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableArm640> = List(1) { ScopeTableArm640() },
)

public data class ScopeTableArm640(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
)

public data class ScrubDataInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maximumIos: UInt = 0u,
    public var objectId: UIntArray = UIntArray(4),
    public var reserved: UIntArray = UIntArray(41),
    public var resumeContext: UByteArray = UByteArray(1040),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScrubDataInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maximumIos != other.maximumIos) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.resumeContext.contentEquals(other.resumeContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maximumIos.hashCode()
        result = 31 * result + this.objectId.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.resumeContext.contentHashCode()
        return result
    }
}

public class ScrubDataOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var status: UInt = 0u,
    public var errorFileOffset: ULong = 0uL,
    public var errorLength: ULong = 0uL,
    public var numberOfBytesRepaired: ULong = 0uL,
    public var numberOfBytesFailed: ULong = 0uL,
    public var internalFileReference: ULong = 0uL,
    public var resumeContextLength: UShort = 0u,
    public var parityExtentDataOffset: UShort = 0u,
    public var reserved: UIntArray = UIntArray(9),
    public var numberOfMetadataBytesProcessed: ULong = 0uL,
    public var numberOfDataBytesProcessed: ULong = 0uL,
    public var totalNumberOfMetadataBytesInUse: ULong = 0uL,
    public var totalNumberOfDataBytesInUse: ULong = 0uL,
    public var dataBytesSkippedDueToNoAllocation: ULong = 0uL,
    public var dataBytesSkippedDueToInvalidRun: ULong = 0uL,
    public var dataBytesSkippedDueToIntegrityStream: ULong = 0uL,
    public var dataBytesSkippedDueToRegionBeingClean: ULong = 0uL,
    public var dataBytesSkippedDueToLockConflict: ULong = 0uL,
    public var dataBytesSkippedDueToNoScrubDataFlag: ULong = 0uL,
    public var dataBytesSkippedDueToNoScrubNonIntegrityStreamFlag: ULong = 0uL,
    public var dataBytesScrubbed: ULong = 0uL,
    public var resumeContext: UByteArray = UByteArray(1040),
)

public data class ScrubParityExtent(
    public var offset: Long = 0L,
    public var length: ULong = 0uL,
)

public data class ScrubParityExtentData(
    public var size: UShort = 0u,
    public var flags: UShort = 0u,
    public var numberOfParityExtents: UShort = 0u,
    public var maximumNumberOfParityExtents: UShort = 0u,
    public var parityExtents: List<ScrubParityExtent> = List(1) { ScrubParityExtent() },
)

public data class SecurityObjectAiParams(
    public var size: UInt = 0u,
    public var constraintMask: UInt = 0u,
)

public data class ServersiloBasicInformation(
    public var serviceSessionId: UInt = 0u,
    public var state: ServersiloState = 0,
    public var exitStatus: UInt = 0u,
    public var isDownlevelContainer: Boolean = false,
    public var apiSetSchema: COpaquePointer? = null,
    public var hostApiSetSchema: COpaquePointer? = null,
)

public data class SeTokenUser(
    public var anonymous1: SeTokenUser0 = SeTokenUser0(),
    public var anonymous2: SeTokenUser1 = SeTokenUser1(),
)

public data class SeTokenUser0(
    public var tokenUser: TokenUser = TokenUser(),
    public var user: SidAndAttributes = SidAndAttributes(),
)

public data class SeTokenUser1(
    public var sid: Sid = Sid(),
    public var buffer: UByteArray = UByteArray(68),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeTokenUser1) return false
        if (this.sid != other.sid) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class SharedVirtualDiskSupport(
    public var sharedVirtualDiskSupport: SharedVirtualDiskSupportType = 0,
    public var handleState: SharedVirtualDiskHandleState = 0,
)

public data class ShuffleFileData(
    public var startingOffset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
)

public data class SiloobjectBasicInformation(
    public var siloId: UInt = 0u,
    public var siloParentId: UInt = 0u,
    public var numberOfProcesses: UInt = 0u,
    public var isInServerSilo: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiloobjectBasicInformation) return false
        if (this.siloId != other.siloId) return false
        if (this.siloParentId != other.siloParentId) return false
        if (this.numberOfProcesses != other.numberOfProcesses) return false
        if (this.isInServerSilo != other.isInServerSilo) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siloId.hashCode()
        result = 31 * result + this.siloParentId.hashCode()
        result = 31 * result + this.numberOfProcesses.hashCode()
        result = 31 * result + this.isInServerSilo.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SupportedOsInfo(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
)

public data class TapeCreatePartition(
    public var method: UInt = 0u,
    public var count: UInt = 0u,
    public var size: UInt = 0u,
)

public data class TapeGetDriveParameters(
    public var ecc: Boolean = false,
    public var compression: Boolean = false,
    public var dataPadding: Boolean = false,
    public var reportSetmarks: Boolean = false,
    public var defaultBlockSize: UInt = 0u,
    public var maximumBlockSize: UInt = 0u,
    public var minimumBlockSize: UInt = 0u,
    public var maximumPartitionCount: UInt = 0u,
    public var featuresLow: UInt = 0u,
    public var featuresHigh: TapeGetDriveParametersFeaturesHigh = 0u,
    public var eOTWarningZoneSize: UInt = 0u,
)

public data class TapeGetMediaParameters(
    public var capacity: Long = 0L,
    public var remaining: Long = 0L,
    public var blockSize: UInt = 0u,
    public var partitionCount: UInt = 0u,
    public var writeProtected: Boolean = false,
)

public data class TapeSetDriveParameters(
    public var ecc: Boolean = false,
    public var compression: Boolean = false,
    public var dataPadding: Boolean = false,
    public var reportSetmarks: Boolean = false,
    public var eOTWarningZoneSize: UInt = 0u,
)

public data class TapeSetMediaParameters(
    public var blockSize: UInt = 0u,
)

public data class TapeWmiOperations(
    public var method: UInt = 0u,
    public var dataBufferSize: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
)

public data class TokenBnoIsolationInformation(
    public var isolationPrefix: Pwstr = null,
    public var isolationEnabled: Boolean = false,
)

public data class TokenSidInformation(
    public var sid: Psid = null,
)

public data class TransactionmanagerBasicInformation(
    public var tmIdentity: Guid = Guid(),
    public var virtualClock: Long = 0L,
)

public data class TransactionmanagerLogpathInformation(
    public var logPathLength: UInt = 0u,
    public var logPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionmanagerLogpathInformation) return false
        if (this.logPathLength != other.logPathLength) return false
        if (!this.logPath.contentEquals(other.logPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logPathLength.hashCode()
        result = 31 * result + this.logPath.contentHashCode()
        return result
    }
}

public data class TransactionmanagerLogInformation(
    public var logIdentity: Guid = Guid(),
)

public data class TransactionmanagerOldestInformation(
    public var oldestTransactionGuid: Guid = Guid(),
)

public data class TransactionmanagerRecoveryInformation(
    public var lastRecoveredLsn: ULong = 0uL,
)

public data class TransactionBasicInformation(
    public var transactionId: Guid = Guid(),
    public var state: UInt = 0u,
    public var outcome: UInt = 0u,
)

public data class TransactionBindInformation(
    public var tmHandle: Handle = null,
)

public data class TransactionEnlistmentsInformation(
    public var numberOfEnlistments: UInt = 0u,
    public var enlistmentPair: List<TransactionEnlistmentPair> = List(1) { TransactionEnlistmentPair() },
)

public data class TransactionEnlistmentPair(
    public var enlistmentId: Guid = Guid(),
    public var resourceManagerId: Guid = Guid(),
)

public data class TransactionListEntry(
    public var uow: Guid = Guid(),
)

public data class TransactionListInformation(
    public var numberOfTransactions: UInt = 0u,
    public var transactionInformation: List<TransactionListEntry> = List(1) { TransactionListEntry() },
)

public data class TransactionPropertiesInformation(
    public var isolationLevel: UInt = 0u,
    public var isolationFlags: UInt = 0u,
    public var timeout: Long = 0L,
    public var outcome: UInt = 0u,
    public var descriptionLength: UInt = 0u,
    public var description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionPropertiesInformation) return false
        if (this.isolationLevel != other.isolationLevel) return false
        if (this.isolationFlags != other.isolationFlags) return false
        if (this.timeout != other.timeout) return false
        if (this.outcome != other.outcome) return false
        if (this.descriptionLength != other.descriptionLength) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.isolationLevel.hashCode()
        result = 31 * result + this.isolationFlags.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.outcome.hashCode()
        result = 31 * result + this.descriptionLength.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public data class TransactionSuperiorEnlistmentInformation(
    public var superiorEnlistmentPair: TransactionEnlistmentPair = TransactionEnlistmentPair(),
)

public data class UmsCreateThreadAttributes(
    public var umsVersion: UInt = 0u,
    public var umsContext: COpaquePointer? = null,
    public var umsCompletionList: COpaquePointer? = null,
)

public data class XsaveCetUFormat(
    public var ia32CetUMsr: ULong = 0uL,
    public var ia32Pl3SspMsr: ULong = 0uL,
)

public data class RemoteMetafilepict(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var hMF: UserHmetafile? = null,
)

public data class UserBitmap(
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
        if (other !is UserBitmap) return false
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

public data class UserClipformat(
    public var fContext: Int = 0,
    public var u: UserClipformat0 = UserClipformat0(),
)

public data class UserClipformat0(
    public var dwValue: UInt = 0u,
    public var pwszName: Pwstr = null,
)

public data class UserHbitmap(
    public var fContext: Int = 0,
    public var u: UserHbitmap0 = UserHbitmap0(),
)

public data class UserHbitmap0(
    public var hInproc: Int = 0,
    public var hRemote: UserBitmap? = null,
    public var hInproc64: Long = 0L,
)

public data class UserHenhmetafile(
    public var fContext: Int = 0,
    public var u: UserHenhmetafile0 = UserHenhmetafile0(),
)

public data class UserHenhmetafile0(
    public var hInproc: Int = 0,
    public var hRemote: ByteBlob? = null,
    public var hInproc64: Long = 0L,
)

public data class UserHglobal(
    public var fContext: Int = 0,
    public var u: UserHglobal0 = UserHglobal0(),
)

public data class UserHglobal0(
    public var hInproc: Int = 0,
    public var hRemote: FlaggedByteBlob? = null,
    public var hInproc64: Long = 0L,
)

public data class UserHmetafile(
    public var fContext: Int = 0,
    public var u: UserHmetafile0 = UserHmetafile0(),
)

public data class UserHmetafile0(
    public var hInproc: Int = 0,
    public var hRemote: ByteBlob? = null,
    public var hInproc64: Long = 0L,
)
