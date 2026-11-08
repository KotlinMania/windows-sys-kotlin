@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.VER_PLATFORM
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.PROCESSOR_ARCHITECTURE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HIMAGELIST

public data class BUSNUMBER_DES(
    public var BUSD_Count: UInt = 0u,
    public var BUSD_Type: UInt = 0u,
    public var BUSD_Flags: UInt = 0u,
    public var BUSD_Alloc_Base: UInt = 0u,
    public var BUSD_Alloc_End: UInt = 0u,
)

public data class BUSNUMBER_RANGE(
    public var BUSR_Min: UInt = 0u,
    public var BUSR_Max: UInt = 0u,
    public var BUSR_nBusNumbers: UInt = 0u,
    public var BUSR_Flags: UInt = 0u,
)

public data class BUSNUMBER_RESOURCE(public var BusNumber_Header: BUSNUMBER_DES = BUSNUMBER_DES(), public var BusNumber_Data: List<BUSNUMBER_RANGE> = List(1) { BUSNUMBER_RANGE() })

public data class CABINET_INFO_A(
    public var CabinetPath: PCSTR = 0L,
    public var CabinetFile: PCSTR = 0L,
    public var DiskName: PCSTR = 0L,
    public var SetId: UShort = 0u,
    public var CabinetNumber: UShort = 0u,
)

public data class CABINET_INFO_W(
    public var CabinetPath: PCWSTR = 0L,
    public var CabinetFile: PCWSTR = 0L,
    public var DiskName: PCWSTR = 0L,
    public var SetId: UShort = 0u,
    public var CabinetNumber: UShort = 0u,
)

public data class CM_NOTIFY_EVENT_DATA(
    public var FilterType: CM_NOTIFY_FILTER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var u: CM_NOTIFY_EVENT_DATA_0 = CM_NOTIFY_EVENT_DATA_0(),
)

public data class CM_NOTIFY_EVENT_DATA_0(
    public var DeviceInterface: CM_NOTIFY_EVENT_DATA_0_0 = CM_NOTIFY_EVENT_DATA_0_0(),
    public var DeviceHandle: CM_NOTIFY_EVENT_DATA_0_1 = CM_NOTIFY_EVENT_DATA_0_1(),
    public var DeviceInstance: CM_NOTIFY_EVENT_DATA_0_2 = CM_NOTIFY_EVENT_DATA_0_2(),
)

public data class CM_NOTIFY_EVENT_DATA_0_1(
    public var EventGuid: GUID = GUID(),
    public var NameOffset: Int = 0,
    public var DataSize: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_NOTIFY_EVENT_DATA_0_1) return false
        if (this.EventGuid != other.EventGuid) return false
        if (this.NameOffset != other.NameOffset) return false
        if (this.DataSize != other.DataSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EventGuid.hashCode()
        result = 31 * result + this.NameOffset.hashCode()
        result = 31 * result + this.DataSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class CM_NOTIFY_EVENT_DATA_0_2(public var InstanceId: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_NOTIFY_EVENT_DATA_0_2) return false
        if (!this.InstanceId.contentEquals(other.InstanceId)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.InstanceId.contentHashCode()
    }
}

public data class CM_NOTIFY_EVENT_DATA_0_0(public var ClassGuid: GUID = GUID(), public var SymbolicLink: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_NOTIFY_EVENT_DATA_0_0) return false
        if (this.ClassGuid != other.ClassGuid) return false
        if (!this.SymbolicLink.contentEquals(other.SymbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassGuid.hashCode()
        result = 31 * result + this.SymbolicLink.contentHashCode()
        return result
    }
}

public data class CM_NOTIFY_FILTER(
    public var cbSize: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FilterType: CM_NOTIFY_FILTER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var u: CM_NOTIFY_FILTER_0 = CM_NOTIFY_FILTER_0(),
)

public data class CM_NOTIFY_FILTER_0(
    public var DeviceInterface: CM_NOTIFY_FILTER_0_0 = CM_NOTIFY_FILTER_0_0(),
    public var DeviceHandle: CM_NOTIFY_FILTER_0_1 = CM_NOTIFY_FILTER_0_1(),
    public var DeviceInstance: CM_NOTIFY_FILTER_0_2 = CM_NOTIFY_FILTER_0_2(),
)

public data class CM_NOTIFY_FILTER_0_1(public var hTarget: HANDLE = 0L)

public data class CM_NOTIFY_FILTER_0_2(public var InstanceId: UShortArray = UShortArray(200)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_NOTIFY_FILTER_0_2) return false
        if (!this.InstanceId.contentEquals(other.InstanceId)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.InstanceId.contentHashCode()
    }
}

public data class CM_NOTIFY_FILTER_0_0(public var ClassGuid: GUID = GUID())

public data class COINSTALLER_CONTEXT_DATA(
    public var PostProcessing: BOOL = 0,
    public var InstallResult: UInt = 0u,
    public var PrivateData: Long = 0L,
)

public data class CONFLICT_DETAILS_A(
    public var CD_ulSize: UInt = 0u,
    public var CD_ulMask: CM_CDMASK = 0u,
    public var CD_dnDevInst: UInt = 0u,
    public var CD_rdResDes: ULong = 0uL,
    public var CD_ulFlags: CM_CDFLAGS = 0u,
    public var CD_szDescription: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONFLICT_DETAILS_A) return false
        if (this.CD_ulSize != other.CD_ulSize) return false
        if (this.CD_ulMask != other.CD_ulMask) return false
        if (this.CD_dnDevInst != other.CD_dnDevInst) return false
        if (this.CD_rdResDes != other.CD_rdResDes) return false
        if (this.CD_ulFlags != other.CD_ulFlags) return false
        if (!this.CD_szDescription.contentEquals(other.CD_szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CD_ulSize.hashCode()
        result = 31 * result + this.CD_ulMask.hashCode()
        result = 31 * result + this.CD_dnDevInst.hashCode()
        result = 31 * result + this.CD_rdResDes.hashCode()
        result = 31 * result + this.CD_ulFlags.hashCode()
        result = 31 * result + this.CD_szDescription.contentHashCode()
        return result
    }
}

public data class CONFLICT_DETAILS_W(
    public var CD_ulSize: UInt = 0u,
    public var CD_ulMask: CM_CDMASK = 0u,
    public var CD_dnDevInst: UInt = 0u,
    public var CD_rdResDes: ULong = 0uL,
    public var CD_ulFlags: CM_CDFLAGS = 0u,
    public var CD_szDescription: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONFLICT_DETAILS_W) return false
        if (this.CD_ulSize != other.CD_ulSize) return false
        if (this.CD_ulMask != other.CD_ulMask) return false
        if (this.CD_dnDevInst != other.CD_dnDevInst) return false
        if (this.CD_rdResDes != other.CD_rdResDes) return false
        if (this.CD_ulFlags != other.CD_ulFlags) return false
        if (!this.CD_szDescription.contentEquals(other.CD_szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CD_ulSize.hashCode()
        result = 31 * result + this.CD_ulMask.hashCode()
        result = 31 * result + this.CD_dnDevInst.hashCode()
        result = 31 * result + this.CD_rdResDes.hashCode()
        result = 31 * result + this.CD_ulFlags.hashCode()
        result = 31 * result + this.CD_szDescription.contentHashCode()
        return result
    }
}

public data class CONNECTION_DES(
    public var COND_Type: UInt = 0u,
    public var COND_Flags: UInt = 0u,
    public var COND_Class: UByte = 0u,
    public var COND_ClassType: UByte = 0u,
    public var COND_Reserved1: UByte = 0u,
    public var COND_Reserved2: UByte = 0u,
    public var COND_Id: Long = 0L,
)

public data class CONNECTION_RESOURCE(public var Connection_Header: CONNECTION_DES = CONNECTION_DES())

public data class CS_DES(
    public var CSD_SignatureLength: UInt = 0u,
    public var CSD_LegacyDataOffset: UInt = 0u,
    public var CSD_LegacyDataSize: UInt = 0u,
    public var CSD_Flags: UInt = 0u,
    public var CSD_ClassGuid: GUID = GUID(),
    public var CSD_Signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CS_DES) return false
        if (this.CSD_SignatureLength != other.CSD_SignatureLength) return false
        if (this.CSD_LegacyDataOffset != other.CSD_LegacyDataOffset) return false
        if (this.CSD_LegacyDataSize != other.CSD_LegacyDataSize) return false
        if (this.CSD_Flags != other.CSD_Flags) return false
        if (this.CSD_ClassGuid != other.CSD_ClassGuid) return false
        if (!this.CSD_Signature.contentEquals(other.CSD_Signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CSD_SignatureLength.hashCode()
        result = 31 * result + this.CSD_LegacyDataOffset.hashCode()
        result = 31 * result + this.CSD_LegacyDataSize.hashCode()
        result = 31 * result + this.CSD_Flags.hashCode()
        result = 31 * result + this.CSD_ClassGuid.hashCode()
        result = 31 * result + this.CSD_Signature.contentHashCode()
        return result
    }
}

public data class CS_RESOURCE(public var CS_Header: CS_DES = CS_DES())

public data class DEVPRIVATE_DES(
    public var PD_Count: UInt = 0u,
    public var PD_Type: UInt = 0u,
    public var PD_Data1: UInt = 0u,
    public var PD_Data2: UInt = 0u,
    public var PD_Data3: UInt = 0u,
    public var PD_Flags: UInt = 0u,
)

public data class DEVPRIVATE_RANGE(
    public var PR_Data1: UInt = 0u,
    public var PR_Data2: UInt = 0u,
    public var PR_Data3: UInt = 0u,
)

public data class DEVPRIVATE_RESOURCE(public var PRV_Header: DEVPRIVATE_DES = DEVPRIVATE_DES(), public var PRV_Data: List<DEVPRIVATE_RANGE> = List(1) { DEVPRIVATE_RANGE() })

public data class DMA_DES(
    public var DD_Count: UInt = 0u,
    public var DD_Type: UInt = 0u,
    public var DD_Flags: DD_FLAGS = 0u,
    public var DD_Alloc_Chan: UInt = 0u,
)

public data class DMA_RANGE(
    public var DR_Min: UInt = 0u,
    public var DR_Max: UInt = 0u,
    public var DR_Flags: DD_FLAGS = 0u,
)

public data class DMA_RESOURCE(public var DMA_Header: DMA_DES = DMA_DES(), public var DMA_Data: List<DMA_RANGE> = List(1) { DMA_RANGE() })

public data class FILEPATHS_A(
    public var Target: PCSTR = 0L,
    public var Source: PCSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class FILEPATHS_SIGNERINFO_A(
    public var Target: PCSTR = 0L,
    public var Source: PCSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DigitalSigner: PCSTR = 0L,
    public var Version: PCSTR = 0L,
    public var CatalogFile: PCSTR = 0L,
)

public data class FILEPATHS_SIGNERINFO_W(
    public var Target: PCWSTR = 0L,
    public var Source: PCWSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DigitalSigner: PCWSTR = 0L,
    public var Version: PCWSTR = 0L,
    public var CatalogFile: PCWSTR = 0L,
)

public data class FILEPATHS_W(
    public var Target: PCWSTR = 0L,
    public var Source: PCWSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class FILE_IN_CABINET_INFO_A(
    public var NameInCabinet: PCSTR = 0L,
    public var FileSize: UInt = 0u,
    public var Win32Error: UInt = 0u,
    public var DosDate: UShort = 0u,
    public var DosTime: UShort = 0u,
    public var DosAttribs: UShort = 0u,
    public var FullTargetName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_IN_CABINET_INFO_A) return false
        if (this.NameInCabinet != other.NameInCabinet) return false
        if (this.FileSize != other.FileSize) return false
        if (this.Win32Error != other.Win32Error) return false
        if (this.DosDate != other.DosDate) return false
        if (this.DosTime != other.DosTime) return false
        if (this.DosAttribs != other.DosAttribs) return false
        if (!this.FullTargetName.contentEquals(other.FullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NameInCabinet.hashCode()
        result = 31 * result + this.FileSize.hashCode()
        result = 31 * result + this.Win32Error.hashCode()
        result = 31 * result + this.DosDate.hashCode()
        result = 31 * result + this.DosTime.hashCode()
        result = 31 * result + this.DosAttribs.hashCode()
        result = 31 * result + this.FullTargetName.contentHashCode()
        return result
    }
}

public data class FILE_IN_CABINET_INFO_W(
    public var NameInCabinet: PCWSTR = 0L,
    public var FileSize: UInt = 0u,
    public var Win32Error: UInt = 0u,
    public var DosDate: UShort = 0u,
    public var DosTime: UShort = 0u,
    public var DosAttribs: UShort = 0u,
    public var FullTargetName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_IN_CABINET_INFO_W) return false
        if (this.NameInCabinet != other.NameInCabinet) return false
        if (this.FileSize != other.FileSize) return false
        if (this.Win32Error != other.Win32Error) return false
        if (this.DosDate != other.DosDate) return false
        if (this.DosTime != other.DosTime) return false
        if (this.DosAttribs != other.DosAttribs) return false
        if (!this.FullTargetName.contentEquals(other.FullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NameInCabinet.hashCode()
        result = 31 * result + this.FileSize.hashCode()
        result = 31 * result + this.Win32Error.hashCode()
        result = 31 * result + this.DosDate.hashCode()
        result = 31 * result + this.DosTime.hashCode()
        result = 31 * result + this.DosAttribs.hashCode()
        result = 31 * result + this.FullTargetName.contentHashCode()
        return result
    }
}

public data class HWPROFILEINFO_A(
    public var HWPI_ulHWProfile: UInt = 0u,
    public var HWPI_szFriendlyName: ByteArray = ByteArray(80),
    public var HWPI_dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HWPROFILEINFO_A) return false
        if (this.HWPI_ulHWProfile != other.HWPI_ulHWProfile) return false
        if (!this.HWPI_szFriendlyName.contentEquals(other.HWPI_szFriendlyName)) return false
        if (this.HWPI_dwFlags != other.HWPI_dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HWPI_ulHWProfile.hashCode()
        result = 31 * result + this.HWPI_szFriendlyName.contentHashCode()
        result = 31 * result + this.HWPI_dwFlags.hashCode()
        return result
    }
}

public data class HWPROFILEINFO_W(
    public var HWPI_ulHWProfile: UInt = 0u,
    public var HWPI_szFriendlyName: UShortArray = UShortArray(80),
    public var HWPI_dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HWPROFILEINFO_W) return false
        if (this.HWPI_ulHWProfile != other.HWPI_ulHWProfile) return false
        if (!this.HWPI_szFriendlyName.contentEquals(other.HWPI_szFriendlyName)) return false
        if (this.HWPI_dwFlags != other.HWPI_dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HWPI_ulHWProfile.hashCode()
        result = 31 * result + this.HWPI_szFriendlyName.contentHashCode()
        result = 31 * result + this.HWPI_dwFlags.hashCode()
        return result
    }
}

public data class INFCONTEXT(
    public var Inf: Long = 0L,
    public var CurrentInf: Long = 0L,
    public var Section: UInt = 0u,
    public var Line: UInt = 0u,
)

public data class IO_DES(
    public var IOD_Count: UInt = 0u,
    public var IOD_Type: UInt = 0u,
    public var IOD_Alloc_Base: ULong = 0uL,
    public var IOD_Alloc_End: ULong = 0uL,
    public var IOD_DesFlags: IOD_DESFLAGS = 0u,
)

public data class IO_RANGE(
    public var IOR_Align: ULong = 0uL,
    public var IOR_nPorts: UInt = 0u,
    public var IOR_Min: ULong = 0uL,
    public var IOR_Max: ULong = 0uL,
    public var IOR_RangeFlags: IOD_DESFLAGS = 0u,
    public var IOR_Alias: ULong = 0uL,
)

public data class IO_RESOURCE(public var IO_Header: IO_DES = IO_DES(), public var IO_Data: List<IO_RANGE> = List(1) { IO_RANGE() })

public data class IRQ_DES_32(
    public var IRQD_Count: UInt = 0u,
    public var IRQD_Type: UInt = 0u,
    public var IRQD_Flags: IRQD_FLAGS = 0u,
    public var IRQD_Alloc_Num: UInt = 0u,
    public var IRQD_Affinity: UInt = 0u,
)

public data class IRQ_DES_64(
    public var IRQD_Count: UInt = 0u,
    public var IRQD_Type: UInt = 0u,
    public var IRQD_Flags: IRQD_FLAGS = 0u,
    public var IRQD_Alloc_Num: UInt = 0u,
    public var IRQD_Affinity: ULong = 0uL,
)

public data class IRQ_RANGE(
    public var IRQR_Min: UInt = 0u,
    public var IRQR_Max: UInt = 0u,
    public var IRQR_Flags: IRQD_FLAGS = 0u,
)

public data class IRQ_RESOURCE_32(public var IRQ_Header: IRQ_DES_32 = IRQ_DES_32(), public var IRQ_Data: List<IRQ_RANGE> = List(1) { IRQ_RANGE() })

public data class IRQ_RESOURCE_64(public var IRQ_Header: IRQ_DES_64 = IRQ_DES_64(), public var IRQ_Data: List<IRQ_RANGE> = List(1) { IRQ_RANGE() })

public data class MEM_DES(
    public var MD_Count: UInt = 0u,
    public var MD_Type: UInt = 0u,
    public var MD_Alloc_Base: ULong = 0uL,
    public var MD_Alloc_End: ULong = 0uL,
    public var MD_Flags: MD_FLAGS = 0u,
    public var MD_Reserved: UInt = 0u,
)

public data class MEM_LARGE_DES(
    public var MLD_Count: UInt = 0u,
    public var MLD_Type: UInt = 0u,
    public var MLD_Alloc_Base: ULong = 0uL,
    public var MLD_Alloc_End: ULong = 0uL,
    public var MLD_Flags: UInt = 0u,
    public var MLD_Reserved: UInt = 0u,
)

public data class MEM_LARGE_RANGE(
    public var MLR_Align: ULong = 0uL,
    public var MLR_nBytes: ULong = 0uL,
    public var MLR_Min: ULong = 0uL,
    public var MLR_Max: ULong = 0uL,
    public var MLR_Flags: UInt = 0u,
    public var MLR_Reserved: UInt = 0u,
)

public data class MEM_LARGE_RESOURCE(public var MEM_LARGE_Header: MEM_LARGE_DES = MEM_LARGE_DES(), public var MEM_LARGE_Data: List<MEM_LARGE_RANGE> = List(1) { MEM_LARGE_RANGE() })

public data class MEM_RANGE(
    public var MR_Align: ULong = 0uL,
    public var MR_nBytes: UInt = 0u,
    public var MR_Min: ULong = 0uL,
    public var MR_Max: ULong = 0uL,
    public var MR_Flags: MD_FLAGS = 0u,
    public var MR_Reserved: UInt = 0u,
)

public data class MEM_RESOURCE(public var MEM_Header: MEM_DES = MEM_DES(), public var MEM_Data: List<MEM_RANGE> = List(1) { MEM_RANGE() })

public data class MFCARD_DES(
    public var PMF_Count: UInt = 0u,
    public var PMF_Type: UInt = 0u,
    public var PMF_Flags: PMF_FLAGS = 0u,
    public var PMF_ConfigOptions: UByte = 0u,
    public var PMF_IoResourceIndex: UByte = 0u,
    public var PMF_Reserved: UByteArray = UByteArray(2),
    public var PMF_ConfigRegisterBase: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MFCARD_DES) return false
        if (this.PMF_Count != other.PMF_Count) return false
        if (this.PMF_Type != other.PMF_Type) return false
        if (this.PMF_Flags != other.PMF_Flags) return false
        if (this.PMF_ConfigOptions != other.PMF_ConfigOptions) return false
        if (this.PMF_IoResourceIndex != other.PMF_IoResourceIndex) return false
        if (!this.PMF_Reserved.contentEquals(other.PMF_Reserved)) return false
        if (this.PMF_ConfigRegisterBase != other.PMF_ConfigRegisterBase) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PMF_Count.hashCode()
        result = 31 * result + this.PMF_Type.hashCode()
        result = 31 * result + this.PMF_Flags.hashCode()
        result = 31 * result + this.PMF_ConfigOptions.hashCode()
        result = 31 * result + this.PMF_IoResourceIndex.hashCode()
        result = 31 * result + this.PMF_Reserved.contentHashCode()
        result = 31 * result + this.PMF_ConfigRegisterBase.hashCode()
        return result
    }
}

public data class MFCARD_RESOURCE(public var MfCard_Header: MFCARD_DES = MFCARD_DES())

public data class PCCARD_DES(
    public var PCD_Count: UInt = 0u,
    public var PCD_Type: UInt = 0u,
    public var PCD_Flags: PCD_FLAGS = 0u,
    public var PCD_ConfigIndex: UByte = 0u,
    public var PCD_Reserved: UByteArray = UByteArray(3),
    public var PCD_MemoryCardBase1: UInt = 0u,
    public var PCD_MemoryCardBase2: UInt = 0u,
    public var PCD_MemoryCardBase: UIntArray = UIntArray(2),
    public var PCD_MemoryFlags: UShortArray = UShortArray(2),
    public var PCD_IoFlags: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCCARD_DES) return false
        if (this.PCD_Count != other.PCD_Count) return false
        if (this.PCD_Type != other.PCD_Type) return false
        if (this.PCD_Flags != other.PCD_Flags) return false
        if (this.PCD_ConfigIndex != other.PCD_ConfigIndex) return false
        if (!this.PCD_Reserved.contentEquals(other.PCD_Reserved)) return false
        if (this.PCD_MemoryCardBase1 != other.PCD_MemoryCardBase1) return false
        if (this.PCD_MemoryCardBase2 != other.PCD_MemoryCardBase2) return false
        if (!this.PCD_MemoryCardBase.contentEquals(other.PCD_MemoryCardBase)) return false
        if (!this.PCD_MemoryFlags.contentEquals(other.PCD_MemoryFlags)) return false
        if (!this.PCD_IoFlags.contentEquals(other.PCD_IoFlags)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PCD_Count.hashCode()
        result = 31 * result + this.PCD_Type.hashCode()
        result = 31 * result + this.PCD_Flags.hashCode()
        result = 31 * result + this.PCD_ConfigIndex.hashCode()
        result = 31 * result + this.PCD_Reserved.contentHashCode()
        result = 31 * result + this.PCD_MemoryCardBase1.hashCode()
        result = 31 * result + this.PCD_MemoryCardBase2.hashCode()
        result = 31 * result + this.PCD_MemoryCardBase.contentHashCode()
        result = 31 * result + this.PCD_MemoryFlags.contentHashCode()
        result = 31 * result + this.PCD_IoFlags.contentHashCode()
        return result
    }
}

public data class PCCARD_RESOURCE(public var PcCard_Header: PCCARD_DES = PCCARD_DES())

public data class SOURCE_MEDIA_A(
    public var Reserved: PCSTR = 0L,
    public var Tagfile: PCSTR = 0L,
    public var Description: PCSTR = 0L,
    public var SourcePath: PCSTR = 0L,
    public var SourceFile: PCSTR = 0L,
    public var Flags: UInt = 0u,
)

public data class SOURCE_MEDIA_W(
    public var Reserved: PCWSTR = 0L,
    public var Tagfile: PCWSTR = 0L,
    public var Description: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
    public var SourceFile: PCWSTR = 0L,
    public var Flags: UInt = 0u,
)

public data class SP_ALTPLATFORM_INFO_V1(
    public var cbSize: UInt = 0u,
    public var Platform: VER_PLATFORM = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var ProcessorArchitecture: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class SP_ALTPLATFORM_INFO_V2(
    public var cbSize: UInt = 0u,
    public var Platform: VER_PLATFORM = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var ProcessorArchitecture: PROCESSOR_ARCHITECTURE = 0u,
    public var Anonymous: SP_ALTPLATFORM_INFO_V2_0 = SP_ALTPLATFORM_INFO_V2_0(),
    public var FirstValidatedMajorVersion: UInt = 0u,
    public var FirstValidatedMinorVersion: UInt = 0u,
)

public data class SP_ALTPLATFORM_INFO_V2_0(public var Reserved: UShort = 0u, public var Flags: UShort = 0u)

public data class SP_ALTPLATFORM_INFO_V3(
    public var cbSize: UInt = 0u,
    public var Platform: UInt = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var ProcessorArchitecture: UShort = 0u,
    public var Anonymous: SP_ALTPLATFORM_INFO_V3_0 = SP_ALTPLATFORM_INFO_V3_0(),
    public var FirstValidatedMajorVersion: UInt = 0u,
    public var FirstValidatedMinorVersion: UInt = 0u,
    public var ProductType: UByte = 0u,
    public var SuiteMask: UShort = 0u,
    public var BuildNumber: UInt = 0u,
)

public data class SP_ALTPLATFORM_INFO_V3_0(public var Reserved: UShort = 0u, public var Flags: UShort = 0u)

public data class SP_BACKUP_QUEUE_PARAMS_V1_A(
    public var cbSize: UInt = 0u,
    public var FullInfPath: ByteArray = ByteArray(260),
    public var FilenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_BACKUP_QUEUE_PARAMS_V1_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.FullInfPath.contentEquals(other.FullInfPath)) return false
        if (this.FilenameOffset != other.FilenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.FullInfPath.contentHashCode()
        result = 31 * result + this.FilenameOffset.hashCode()
        return result
    }
}

public data class SP_BACKUP_QUEUE_PARAMS_V1_W(
    public var cbSize: UInt = 0u,
    public var FullInfPath: UShortArray = UShortArray(260),
    public var FilenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_BACKUP_QUEUE_PARAMS_V1_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.FullInfPath.contentEquals(other.FullInfPath)) return false
        if (this.FilenameOffset != other.FilenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.FullInfPath.contentHashCode()
        result = 31 * result + this.FilenameOffset.hashCode()
        return result
    }
}

public data class SP_BACKUP_QUEUE_PARAMS_V2_A(
    public var cbSize: UInt = 0u,
    public var FullInfPath: ByteArray = ByteArray(260),
    public var FilenameOffset: Int = 0,
    public var ReinstallInstance: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_BACKUP_QUEUE_PARAMS_V2_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.FullInfPath.contentEquals(other.FullInfPath)) return false
        if (this.FilenameOffset != other.FilenameOffset) return false
        if (!this.ReinstallInstance.contentEquals(other.ReinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.FullInfPath.contentHashCode()
        result = 31 * result + this.FilenameOffset.hashCode()
        result = 31 * result + this.ReinstallInstance.contentHashCode()
        return result
    }
}

public data class SP_BACKUP_QUEUE_PARAMS_V2_W(
    public var cbSize: UInt = 0u,
    public var FullInfPath: UShortArray = UShortArray(260),
    public var FilenameOffset: Int = 0,
    public var ReinstallInstance: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_BACKUP_QUEUE_PARAMS_V2_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.FullInfPath.contentEquals(other.FullInfPath)) return false
        if (this.FilenameOffset != other.FilenameOffset) return false
        if (!this.ReinstallInstance.contentEquals(other.ReinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.FullInfPath.contentHashCode()
        result = 31 * result + this.FilenameOffset.hashCode()
        result = 31 * result + this.ReinstallInstance.contentHashCode()
        return result
    }
}

public data class SP_CLASSIMAGELIST_DATA(
    public var cbSize: UInt = 0u,
    public var ImageList: HIMAGELIST = 0L,
    public var Reserved: ULong = 0uL,
)

public data class SP_CLASSINSTALL_HEADER(public var cbSize: UInt = 0u, public var InstallFunction: DI_FUNCTION = 0u)

public data class SP_DETECTDEVICE_PARAMS(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var DetectProgressNotify: PDETECT_PROGRESS_NOTIFY = null,
    public var ProgressNotifyParam: Long = 0L,
)

public data class SP_DEVICE_INTERFACE_DATA(
    public var cbSize: UInt = 0u,
    public var InterfaceClassGuid: GUID = GUID(),
    public var Flags: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class SP_DEVICE_INTERFACE_DETAIL_DATA_A(public var cbSize: UInt = 0u, public var DevicePath: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVICE_INTERFACE_DETAIL_DATA_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.DevicePath.contentEquals(other.DevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DevicePath.contentHashCode()
        return result
    }
}

public data class SP_DEVICE_INTERFACE_DETAIL_DATA_W(public var cbSize: UInt = 0u, public var DevicePath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVICE_INTERFACE_DETAIL_DATA_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.DevicePath.contentEquals(other.DevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DevicePath.contentHashCode()
        return result
    }
}

public data class SP_DEVINFO_DATA(
    public var cbSize: UInt = 0u,
    public var ClassGuid: GUID = GUID(),
    public var DevInst: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class SP_DEVINFO_LIST_DETAIL_DATA_A(
    public var cbSize: UInt = 0u,
    public var ClassGuid: GUID = GUID(),
    public var RemoteMachineHandle: HANDLE = 0L,
    public var RemoteMachineName: ByteArray = ByteArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVINFO_LIST_DETAIL_DATA_A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ClassGuid != other.ClassGuid) return false
        if (this.RemoteMachineHandle != other.RemoteMachineHandle) return false
        if (!this.RemoteMachineName.contentEquals(other.RemoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ClassGuid.hashCode()
        result = 31 * result + this.RemoteMachineHandle.hashCode()
        result = 31 * result + this.RemoteMachineName.contentHashCode()
        return result
    }
}

public data class SP_DEVINFO_LIST_DETAIL_DATA_W(
    public var cbSize: UInt = 0u,
    public var ClassGuid: GUID = GUID(),
    public var RemoteMachineHandle: HANDLE = 0L,
    public var RemoteMachineName: UShortArray = UShortArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVINFO_LIST_DETAIL_DATA_W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ClassGuid != other.ClassGuid) return false
        if (this.RemoteMachineHandle != other.RemoteMachineHandle) return false
        if (!this.RemoteMachineName.contentEquals(other.RemoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ClassGuid.hashCode()
        result = 31 * result + this.RemoteMachineHandle.hashCode()
        result = 31 * result + this.RemoteMachineName.contentHashCode()
        return result
    }
}

public data class SP_DEVINSTALL_PARAMS_A(
    public var cbSize: UInt = 0u,
    public var Flags: SETUP_DI_DEVICE_INSTALL_FLAGS = 0u,
    public var FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX = 0u,
    public var hwndParent: HWND = 0L,
    public var InstallMsgHandler: PSP_FILE_CALLBACK_A = null,
    public var InstallMsgHandlerContext: Long = 0L,
    public var FileQueue: Long = 0L,
    public var ClassInstallReserved: ULong = 0uL,
    public var Reserved: UInt = 0u,
    public var DriverPath: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVINSTALL_PARAMS_A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.FlagsEx != other.FlagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.InstallMsgHandler != other.InstallMsgHandler) return false
        if (this.InstallMsgHandlerContext != other.InstallMsgHandlerContext) return false
        if (this.FileQueue != other.FileQueue) return false
        if (this.ClassInstallReserved != other.ClassInstallReserved) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.DriverPath.contentEquals(other.DriverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FlagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.InstallMsgHandler.hashCode()
        result = 31 * result + this.InstallMsgHandlerContext.hashCode()
        result = 31 * result + this.FileQueue.hashCode()
        result = 31 * result + this.ClassInstallReserved.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.DriverPath.contentHashCode()
        return result
    }
}

public data class SP_DEVINSTALL_PARAMS_W(
    public var cbSize: UInt = 0u,
    public var Flags: SETUP_DI_DEVICE_INSTALL_FLAGS = 0u,
    public var FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX = 0u,
    public var hwndParent: HWND = 0L,
    public var InstallMsgHandler: PSP_FILE_CALLBACK_W = null,
    public var InstallMsgHandlerContext: Long = 0L,
    public var FileQueue: Long = 0L,
    public var ClassInstallReserved: ULong = 0uL,
    public var Reserved: UInt = 0u,
    public var DriverPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DEVINSTALL_PARAMS_W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.Flags != other.Flags) return false
        if (this.FlagsEx != other.FlagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.InstallMsgHandler != other.InstallMsgHandler) return false
        if (this.InstallMsgHandlerContext != other.InstallMsgHandlerContext) return false
        if (this.FileQueue != other.FileQueue) return false
        if (this.ClassInstallReserved != other.ClassInstallReserved) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.DriverPath.contentEquals(other.DriverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.FlagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.InstallMsgHandler.hashCode()
        result = 31 * result + this.InstallMsgHandlerContext.hashCode()
        result = 31 * result + this.FileQueue.hashCode()
        result = 31 * result + this.ClassInstallReserved.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.DriverPath.contentHashCode()
        return result
    }
}

public data class SP_DRVINFO_DATA_V1_A(
    public var cbSize: UInt = 0u,
    public var DriverType: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Description: ByteArray = ByteArray(256),
    public var MfgName: ByteArray = ByteArray(256),
    public var ProviderName: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DATA_V1_A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.DriverType != other.DriverType) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.MfgName.contentEquals(other.MfgName)) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DriverType.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.MfgName.contentHashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        return result
    }
}

public data class SP_DRVINFO_DATA_V1_W(
    public var cbSize: UInt = 0u,
    public var DriverType: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Description: UShortArray = UShortArray(256),
    public var MfgName: UShortArray = UShortArray(256),
    public var ProviderName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DATA_V1_W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.DriverType != other.DriverType) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.MfgName.contentEquals(other.MfgName)) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DriverType.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.MfgName.contentHashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        return result
    }
}

public data class SP_DRVINFO_DATA_V2_A(
    public var cbSize: UInt = 0u,
    public var DriverType: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Description: ByteArray = ByteArray(256),
    public var MfgName: ByteArray = ByteArray(256),
    public var ProviderName: ByteArray = ByteArray(256),
    public var DriverDate: FILETIME = FILETIME(),
    public var DriverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DATA_V2_A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.DriverType != other.DriverType) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.MfgName.contentEquals(other.MfgName)) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        if (this.DriverDate != other.DriverDate) return false
        if (this.DriverVersion != other.DriverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DriverType.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.MfgName.contentHashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        result = 31 * result + this.DriverDate.hashCode()
        result = 31 * result + this.DriverVersion.hashCode()
        return result
    }
}

public data class SP_DRVINFO_DATA_V2_W(
    public var cbSize: UInt = 0u,
    public var DriverType: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Description: UShortArray = UShortArray(256),
    public var MfgName: UShortArray = UShortArray(256),
    public var ProviderName: UShortArray = UShortArray(256),
    public var DriverDate: FILETIME = FILETIME(),
    public var DriverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DATA_V2_W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.DriverType != other.DriverType) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.MfgName.contentEquals(other.MfgName)) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        if (this.DriverDate != other.DriverDate) return false
        if (this.DriverVersion != other.DriverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.DriverType.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.MfgName.contentHashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        result = 31 * result + this.DriverDate.hashCode()
        result = 31 * result + this.DriverVersion.hashCode()
        return result
    }
}

public data class SP_DRVINFO_DETAIL_DATA_A(
    public var cbSize: UInt = 0u,
    public var InfDate: FILETIME = FILETIME(),
    public var CompatIDsOffset: UInt = 0u,
    public var CompatIDsLength: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var SectionName: ByteArray = ByteArray(256),
    public var InfFileName: ByteArray = ByteArray(260),
    public var DrvDescription: ByteArray = ByteArray(256),
    public var HardwareID: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DETAIL_DATA_A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.InfDate != other.InfDate) return false
        if (this.CompatIDsOffset != other.CompatIDsOffset) return false
        if (this.CompatIDsLength != other.CompatIDsLength) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.SectionName.contentEquals(other.SectionName)) return false
        if (!this.InfFileName.contentEquals(other.InfFileName)) return false
        if (!this.DrvDescription.contentEquals(other.DrvDescription)) return false
        if (!this.HardwareID.contentEquals(other.HardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.InfDate.hashCode()
        result = 31 * result + this.CompatIDsOffset.hashCode()
        result = 31 * result + this.CompatIDsLength.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.SectionName.contentHashCode()
        result = 31 * result + this.InfFileName.contentHashCode()
        result = 31 * result + this.DrvDescription.contentHashCode()
        result = 31 * result + this.HardwareID.contentHashCode()
        return result
    }
}

public data class SP_DRVINFO_DETAIL_DATA_W(
    public var cbSize: UInt = 0u,
    public var InfDate: FILETIME = FILETIME(),
    public var CompatIDsOffset: UInt = 0u,
    public var CompatIDsLength: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var SectionName: UShortArray = UShortArray(256),
    public var InfFileName: UShortArray = UShortArray(260),
    public var DrvDescription: UShortArray = UShortArray(256),
    public var HardwareID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_DRVINFO_DETAIL_DATA_W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.InfDate != other.InfDate) return false
        if (this.CompatIDsOffset != other.CompatIDsOffset) return false
        if (this.CompatIDsLength != other.CompatIDsLength) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.SectionName.contentEquals(other.SectionName)) return false
        if (!this.InfFileName.contentEquals(other.InfFileName)) return false
        if (!this.DrvDescription.contentEquals(other.DrvDescription)) return false
        if (!this.HardwareID.contentEquals(other.HardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.InfDate.hashCode()
        result = 31 * result + this.CompatIDsOffset.hashCode()
        result = 31 * result + this.CompatIDsLength.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.SectionName.contentHashCode()
        result = 31 * result + this.InfFileName.contentHashCode()
        result = 31 * result + this.DrvDescription.contentHashCode()
        result = 31 * result + this.HardwareID.contentHashCode()
        return result
    }
}

public data class SP_DRVINSTALL_PARAMS(
    public var cbSize: UInt = 0u,
    public var Rank: UInt = 0u,
    public var Flags: SETUP_DI_DRIVER_INSTALL_FLAGS = 0u,
    public var PrivateData: ULong = 0uL,
    public var Reserved: UInt = 0u,
)

public data class SP_ENABLECLASS_PARAMS(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var ClassGuid: GUID = GUID(),
    public var EnableMessage: UInt = 0u,
)

public data class SP_FILE_COPY_PARAMS_A(
    public var cbSize: UInt = 0u,
    public var QueueHandle: Long = 0L,
    public var SourceRootPath: PCSTR = 0L,
    public var SourcePath: PCSTR = 0L,
    public var SourceFilename: PCSTR = 0L,
    public var SourceDescription: PCSTR = 0L,
    public var SourceTagfile: PCSTR = 0L,
    public var TargetDirectory: PCSTR = 0L,
    public var TargetFilename: PCSTR = 0L,
    public var CopyStyle: UInt = 0u,
    public var LayoutInf: Long = 0L,
    public var SecurityDescriptor: PCSTR = 0L,
)

public data class SP_FILE_COPY_PARAMS_W(
    public var cbSize: UInt = 0u,
    public var QueueHandle: Long = 0L,
    public var SourceRootPath: PCWSTR = 0L,
    public var SourcePath: PCWSTR = 0L,
    public var SourceFilename: PCWSTR = 0L,
    public var SourceDescription: PCWSTR = 0L,
    public var SourceTagfile: PCWSTR = 0L,
    public var TargetDirectory: PCWSTR = 0L,
    public var TargetFilename: PCWSTR = 0L,
    public var CopyStyle: UInt = 0u,
    public var LayoutInf: Long = 0L,
    public var SecurityDescriptor: PCWSTR = 0L,
)

public data class SP_INF_INFORMATION(
    public var InfStyle: INF_STYLE = 0u,
    public var InfCount: UInt = 0u,
    public var VersionData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INF_INFORMATION) return false
        if (this.InfStyle != other.InfStyle) return false
        if (this.InfCount != other.InfCount) return false
        if (!this.VersionData.contentEquals(other.VersionData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InfStyle.hashCode()
        result = 31 * result + this.InfCount.hashCode()
        result = 31 * result + this.VersionData.contentHashCode()
        return result
    }
}

public data class SP_INF_SIGNER_INFO_V1_A(
    public var cbSize: UInt = 0u,
    public var CatalogFile: ByteArray = ByteArray(260),
    public var DigitalSigner: ByteArray = ByteArray(260),
    public var DigitalSignerVersion: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INF_SIGNER_INFO_V1_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.CatalogFile.contentEquals(other.CatalogFile)) return false
        if (!this.DigitalSigner.contentEquals(other.DigitalSigner)) return false
        if (!this.DigitalSignerVersion.contentEquals(other.DigitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.CatalogFile.contentHashCode()
        result = 31 * result + this.DigitalSigner.contentHashCode()
        result = 31 * result + this.DigitalSignerVersion.contentHashCode()
        return result
    }
}

public data class SP_INF_SIGNER_INFO_V1_W(
    public var cbSize: UInt = 0u,
    public var CatalogFile: UShortArray = UShortArray(260),
    public var DigitalSigner: UShortArray = UShortArray(260),
    public var DigitalSignerVersion: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INF_SIGNER_INFO_V1_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.CatalogFile.contentEquals(other.CatalogFile)) return false
        if (!this.DigitalSigner.contentEquals(other.DigitalSigner)) return false
        if (!this.DigitalSignerVersion.contentEquals(other.DigitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.CatalogFile.contentHashCode()
        result = 31 * result + this.DigitalSigner.contentHashCode()
        result = 31 * result + this.DigitalSignerVersion.contentHashCode()
        return result
    }
}

public data class SP_INF_SIGNER_INFO_V2_A(
    public var cbSize: UInt = 0u,
    public var CatalogFile: ByteArray = ByteArray(260),
    public var DigitalSigner: ByteArray = ByteArray(260),
    public var DigitalSignerVersion: ByteArray = ByteArray(260),
    public var SignerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INF_SIGNER_INFO_V2_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.CatalogFile.contentEquals(other.CatalogFile)) return false
        if (!this.DigitalSigner.contentEquals(other.DigitalSigner)) return false
        if (!this.DigitalSignerVersion.contentEquals(other.DigitalSignerVersion)) return false
        if (this.SignerScore != other.SignerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.CatalogFile.contentHashCode()
        result = 31 * result + this.DigitalSigner.contentHashCode()
        result = 31 * result + this.DigitalSignerVersion.contentHashCode()
        result = 31 * result + this.SignerScore.hashCode()
        return result
    }
}

public data class SP_INF_SIGNER_INFO_V2_W(
    public var cbSize: UInt = 0u,
    public var CatalogFile: UShortArray = UShortArray(260),
    public var DigitalSigner: UShortArray = UShortArray(260),
    public var DigitalSignerVersion: UShortArray = UShortArray(260),
    public var SignerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INF_SIGNER_INFO_V2_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.CatalogFile.contentEquals(other.CatalogFile)) return false
        if (!this.DigitalSigner.contentEquals(other.DigitalSigner)) return false
        if (!this.DigitalSignerVersion.contentEquals(other.DigitalSignerVersion)) return false
        if (this.SignerScore != other.SignerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.CatalogFile.contentHashCode()
        result = 31 * result + this.DigitalSigner.contentHashCode()
        result = 31 * result + this.DigitalSignerVersion.contentHashCode()
        result = 31 * result + this.SignerScore.hashCode()
        return result
    }
}

public data class SP_INSTALLWIZARD_DATA(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Flags: UInt = 0u,
    public var DynamicPages: LongArray = LongArray(20),
    public var NumDynamicPages: UInt = 0u,
    public var DynamicPageFlags: UInt = 0u,
    public var PrivateFlags: UInt = 0u,
    public var PrivateData: LPARAM = 0L,
    public var hwndWizardDlg: HWND = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_INSTALLWIZARD_DATA) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (this.Flags != other.Flags) return false
        if (!this.DynamicPages.contentEquals(other.DynamicPages)) return false
        if (this.NumDynamicPages != other.NumDynamicPages) return false
        if (this.DynamicPageFlags != other.DynamicPageFlags) return false
        if (this.PrivateFlags != other.PrivateFlags) return false
        if (this.PrivateData != other.PrivateData) return false
        if (this.hwndWizardDlg != other.hwndWizardDlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.DynamicPages.contentHashCode()
        result = 31 * result + this.NumDynamicPages.hashCode()
        result = 31 * result + this.DynamicPageFlags.hashCode()
        result = 31 * result + this.PrivateFlags.hashCode()
        result = 31 * result + this.PrivateData.hashCode()
        result = 31 * result + this.hwndWizardDlg.hashCode()
        return result
    }
}

public data class SP_NEWDEVICEWIZARD_DATA(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Flags: UInt = 0u,
    public var DynamicPages: LongArray = LongArray(20),
    public var NumDynamicPages: UInt = 0u,
    public var hwndWizardDlg: HWND = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_NEWDEVICEWIZARD_DATA) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (this.Flags != other.Flags) return false
        if (!this.DynamicPages.contentEquals(other.DynamicPages)) return false
        if (this.NumDynamicPages != other.NumDynamicPages) return false
        if (this.hwndWizardDlg != other.hwndWizardDlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.DynamicPages.contentHashCode()
        result = 31 * result + this.NumDynamicPages.hashCode()
        result = 31 * result + this.hwndWizardDlg.hashCode()
        return result
    }
}

public data class SP_ORIGINAL_FILE_INFO_A(
    public var cbSize: UInt = 0u,
    public var OriginalInfName: ByteArray = ByteArray(260),
    public var OriginalCatalogName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_ORIGINAL_FILE_INFO_A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.OriginalInfName.contentEquals(other.OriginalInfName)) return false
        if (!this.OriginalCatalogName.contentEquals(other.OriginalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.OriginalInfName.contentHashCode()
        result = 31 * result + this.OriginalCatalogName.contentHashCode()
        return result
    }
}

public data class SP_ORIGINAL_FILE_INFO_W(
    public var cbSize: UInt = 0u,
    public var OriginalInfName: UShortArray = UShortArray(260),
    public var OriginalCatalogName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_ORIGINAL_FILE_INFO_W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.OriginalInfName.contentEquals(other.OriginalInfName)) return false
        if (!this.OriginalCatalogName.contentEquals(other.OriginalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.OriginalInfName.contentHashCode()
        result = 31 * result + this.OriginalCatalogName.contentHashCode()
        return result
    }
}

public data class SP_POWERMESSAGEWAKE_PARAMS_A(public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(), public var PowerMessageWake: ByteArray = ByteArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_POWERMESSAGEWAKE_PARAMS_A) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.PowerMessageWake.contentEquals(other.PowerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.PowerMessageWake.contentHashCode()
        return result
    }
}

public data class SP_POWERMESSAGEWAKE_PARAMS_W(public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(), public var PowerMessageWake: UShortArray = UShortArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_POWERMESSAGEWAKE_PARAMS_W) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.PowerMessageWake.contentEquals(other.PowerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.PowerMessageWake.contentHashCode()
        return result
    }
}

public data class SP_PROPCHANGE_PARAMS(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var StateChange: SETUP_DI_STATE_CHANGE = 0u,
    public var Scope: SETUP_DI_PROPERTY_CHANGE_SCOPE = 0u,
    public var HwProfile: UInt = 0u,
)

public data class SP_PROPSHEETPAGE_REQUEST(
    public var cbSize: UInt = 0u,
    public var PageRequested: UInt = 0u,
    public var DeviceInfoSet: HDEVINFO = 0L,
    public var DeviceInfoData: Long = 0L,
)

public data class SP_REGISTER_CONTROL_STATUSA(
    public var cbSize: UInt = 0u,
    public var FileName: PCSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var FailureCode: UInt = 0u,
)

public data class SP_REGISTER_CONTROL_STATUSW(
    public var cbSize: UInt = 0u,
    public var FileName: PCWSTR = 0L,
    public var Win32Error: UInt = 0u,
    public var FailureCode: UInt = 0u,
)

public data class SP_REMOVEDEVICE_PARAMS(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Scope: SETUP_DI_REMOVE_DEVICE_SCOPE = 0u,
    public var HwProfile: UInt = 0u,
)

public data class SP_SELECTDEVICE_PARAMS_A(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Title: ByteArray = ByteArray(60),
    public var Instructions: ByteArray = ByteArray(256),
    public var ListLabel: ByteArray = ByteArray(30),
    public var SubTitle: ByteArray = ByteArray(256),
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_SELECTDEVICE_PARAMS_A) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.Title.contentEquals(other.Title)) return false
        if (!this.Instructions.contentEquals(other.Instructions)) return false
        if (!this.ListLabel.contentEquals(other.ListLabel)) return false
        if (!this.SubTitle.contentEquals(other.SubTitle)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.Title.contentHashCode()
        result = 31 * result + this.Instructions.contentHashCode()
        result = 31 * result + this.ListLabel.contentHashCode()
        result = 31 * result + this.SubTitle.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SP_SELECTDEVICE_PARAMS_W(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Title: UShortArray = UShortArray(60),
    public var Instructions: UShortArray = UShortArray(256),
    public var ListLabel: UShortArray = UShortArray(30),
    public var SubTitle: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_SELECTDEVICE_PARAMS_W) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.Title.contentEquals(other.Title)) return false
        if (!this.Instructions.contentEquals(other.Instructions)) return false
        if (!this.ListLabel.contentEquals(other.ListLabel)) return false
        if (!this.SubTitle.contentEquals(other.SubTitle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.Title.contentHashCode()
        result = 31 * result + this.Instructions.contentHashCode()
        result = 31 * result + this.ListLabel.contentHashCode()
        result = 31 * result + this.SubTitle.contentHashCode()
        return result
    }
}

public data class SP_TROUBLESHOOTER_PARAMS_A(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var ChmFile: ByteArray = ByteArray(260),
    public var HtmlTroubleShooter: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_TROUBLESHOOTER_PARAMS_A) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.ChmFile.contentEquals(other.ChmFile)) return false
        if (!this.HtmlTroubleShooter.contentEquals(other.HtmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.ChmFile.contentHashCode()
        result = 31 * result + this.HtmlTroubleShooter.contentHashCode()
        return result
    }
}

public data class SP_TROUBLESHOOTER_PARAMS_W(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var ChmFile: UShortArray = UShortArray(260),
    public var HtmlTroubleShooter: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SP_TROUBLESHOOTER_PARAMS_W) return false
        if (this.ClassInstallHeader != other.ClassInstallHeader) return false
        if (!this.ChmFile.contentEquals(other.ChmFile)) return false
        if (!this.HtmlTroubleShooter.contentEquals(other.HtmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassInstallHeader.hashCode()
        result = 31 * result + this.ChmFile.contentHashCode()
        result = 31 * result + this.HtmlTroubleShooter.contentHashCode()
        return result
    }
}

public data class SP_UNREMOVEDEVICE_PARAMS(
    public var ClassInstallHeader: SP_CLASSINSTALL_HEADER = SP_CLASSINSTALL_HEADER(),
    public var Scope: UInt = 0u,
    public var HwProfile: UInt = 0u,
)
