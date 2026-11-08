@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KDEVICE_QUEUE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PCALLBACK_OBJECT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.security.LUID_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ARM64_NT_NEON128
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_CAPABILITIES
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.power.SYSTEM_POWER_STATE

public data class ACPI_DEBUGGING_DEVICE_IN_USE(public var NameSpacePathLength: UInt = 0u, public var NameSpacePath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACPI_DEBUGGING_DEVICE_IN_USE) return false
        if (this.NameSpacePathLength != other.NameSpacePathLength) return false
        if (!this.NameSpacePath.contentEquals(other.NameSpacePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NameSpacePathLength.hashCode()
        result = 31 * result + this.NameSpacePath.contentHashCode()
        return result
    }
}

public data class ACPI_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var GpeConnectVector: PGPE_CONNECT_VECTOR = null,
    public var GpeDisconnectVector: PGPE_DISCONNECT_VECTOR = null,
    public var GpeEnableEvent: PGPE_ENABLE_EVENT = null,
    public var GpeDisableEvent: PGPE_DISABLE_EVENT = null,
    public var GpeClearStatus: PGPE_CLEAR_STATUS = null,
    public var RegisterForDeviceNotifications: PREGISTER_FOR_DEVICE_NOTIFICATIONS = null,
    public var UnregisterForDeviceNotifications: PUNREGISTER_FOR_DEVICE_NOTIFICATIONS = null,
)

public data class ACPI_INTERFACE_STANDARD2(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var GpeConnectVector: PGPE_CONNECT_VECTOR2 = null,
    public var GpeDisconnectVector: PGPE_DISCONNECT_VECTOR2 = null,
    public var GpeEnableEvent: PGPE_ENABLE_EVENT2 = null,
    public var GpeDisableEvent: PGPE_DISABLE_EVENT2 = null,
    public var GpeClearStatus: PGPE_CLEAR_STATUS2 = null,
    public var RegisterForDeviceNotifications: PREGISTER_FOR_DEVICE_NOTIFICATIONS2 = null,
    public var UnregisterForDeviceNotifications: PUNREGISTER_FOR_DEVICE_NOTIFICATIONS2 = null,
)

public data class AGP_TARGET_BUS_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetBusData: PGET_SET_DEVICE_DATA = null,
    public var GetBusData: PGET_SET_DEVICE_DATA = null,
    public var CapabilityID: UByte = 0u,
)

public data class AMD_L1_CACHE_INFO(public var Ulong: UInt = 0u, public var Anonymous: AMD_L1_CACHE_INFO_0 = AMD_L1_CACHE_INFO_0())

public data class AMD_L1_CACHE_INFO_0(
    public var LineSize: UByte = 0u,
    public var LinesPerTag: UByte = 0u,
    public var Associativity: UByte = 0u,
    public var Size: UByte = 0u,
)

public data class AMD_L2_CACHE_INFO(public var Ulong: UInt = 0u, public var Anonymous: AMD_L2_CACHE_INFO_0 = AMD_L2_CACHE_INFO_0())

public data class AMD_L2_CACHE_INFO_0(
    public var LineSize: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var Size: UShort = 0u,
)

public data class AMD_L3_CACHE_INFO(public var Ulong: UInt = 0u, public var Anonymous: AMD_L3_CACHE_INFO_0 = AMD_L3_CACHE_INFO_0())

public data class AMD_L3_CACHE_INFO_0(
    public var LineSize: UByte = 0u,
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UShort = 0u,
)

public data class ARBITER_ADD_RESERVED_PARAMETERS(public var ReserveDevice: Long = 0L)

public data class ARBITER_BOOT_ALLOCATION_PARAMETERS(public var ArbitrationList: Long = 0L)

public data class ARBITER_CONFLICT_INFO(
    public var OwningObject: Long = 0L,
    public var Start: ULong = 0uL,
    public var End: ULong = 0uL,
)

public data class ARBITER_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var ArbiterHandler: PARBITER_HANDLER = null,
    public var Flags: UInt = 0u,
)

public data class ARBITER_LIST_ENTRY(
    public var ListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var AlternativeCount: UInt = 0u,
    public var Alternatives: Long = 0L,
    public var PhysicalDeviceObject: Long = 0L,
    public var RequestSource: ARBITER_REQUEST_SOURCE = 0,
    public var Flags: UInt = 0u,
    public var WorkSpace: Long = 0L,
    public var InterfaceType: INTERFACE_TYPE = 0,
    public var SlotNumber: UInt = 0u,
    public var BusNumber: UInt = 0u,
    public var Assignment: Long = 0L,
    public var SelectedAlternative: Long = 0L,
    public var Result: ARBITER_RESULT = 0,
)

public data class ARBITER_PARAMETERS(public var Parameters: ARBITER_PARAMETERS_0 = ARBITER_PARAMETERS_0())

public data class ARBITER_PARAMETERS_0(
    public var TestAllocation: ARBITER_TEST_ALLOCATION_PARAMETERS = ARBITER_TEST_ALLOCATION_PARAMETERS(),
    public var RetestAllocation: ARBITER_RETEST_ALLOCATION_PARAMETERS = ARBITER_RETEST_ALLOCATION_PARAMETERS(),
    public var BootAllocation: ARBITER_BOOT_ALLOCATION_PARAMETERS = ARBITER_BOOT_ALLOCATION_PARAMETERS(),
    public var QueryAllocatedResources: ARBITER_QUERY_ALLOCATED_RESOURCES_PARAMETERS = ARBITER_QUERY_ALLOCATED_RESOURCES_PARAMETERS(),
    public var QueryConflict: ARBITER_QUERY_CONFLICT_PARAMETERS = ARBITER_QUERY_CONFLICT_PARAMETERS(),
    public var QueryArbitrate: ARBITER_QUERY_ARBITRATE_PARAMETERS = ARBITER_QUERY_ARBITRATE_PARAMETERS(),
    public var AddReserved: ARBITER_ADD_RESERVED_PARAMETERS = ARBITER_ADD_RESERVED_PARAMETERS(),
)

public data class ARBITER_QUERY_ALLOCATED_RESOURCES_PARAMETERS(public var AllocatedResources: Long = 0L)

public data class ARBITER_QUERY_ARBITRATE_PARAMETERS(public var ArbitrationList: Long = 0L)

public data class ARBITER_QUERY_CONFLICT_PARAMETERS(
    public var PhysicalDeviceObject: Long = 0L,
    public var ConflictingResource: Long = 0L,
    public var ConflictCount: Long = 0L,
    public var Conflicts: Long = 0L,
)

public data class ARBITER_RETEST_ALLOCATION_PARAMETERS(
    public var ArbitrationList: Long = 0L,
    public var AllocateFromCount: UInt = 0u,
    public var AllocateFrom: Long = 0L,
)

public data class ARBITER_TEST_ALLOCATION_PARAMETERS(
    public var ArbitrationList: Long = 0L,
    public var AllocateFromCount: UInt = 0u,
    public var AllocateFrom: Long = 0L,
)

public data class ARM64_NT_CONTEXT(
    public var ContextFlags: UInt = 0u,
    public var Cpsr: UInt = 0u,
    public var Anonymous: ARM64_NT_CONTEXT_0 = ARM64_NT_CONTEXT_0(),
    public var Sp: ULong = 0uL,
    public var Pc: ULong = 0uL,
    public var V: List<ARM64_NT_NEON128> = List(32) { ARM64_NT_NEON128() },
    public var Fpcr: UInt = 0u,
    public var Fpsr: UInt = 0u,
    public var Bcr: UIntArray = UIntArray(8),
    public var Bvr: ULongArray = ULongArray(8),
    public var Wcr: UIntArray = UIntArray(2),
    public var Wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARM64_NT_CONTEXT) return false
        if (this.ContextFlags != other.ContextFlags) return false
        if (this.Cpsr != other.Cpsr) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.Sp != other.Sp) return false
        if (this.Pc != other.Pc) return false
        if (this.V != other.V) return false
        if (this.Fpcr != other.Fpcr) return false
        if (this.Fpsr != other.Fpsr) return false
        if (!this.Bcr.contentEquals(other.Bcr)) return false
        if (!this.Bvr.contentEquals(other.Bvr)) return false
        if (!this.Wcr.contentEquals(other.Wcr)) return false
        if (!this.Wvr.contentEquals(other.Wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ContextFlags.hashCode()
        result = 31 * result + this.Cpsr.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Sp.hashCode()
        result = 31 * result + this.Pc.hashCode()
        result = 31 * result + this.V.hashCode()
        result = 31 * result + this.Fpcr.hashCode()
        result = 31 * result + this.Fpsr.hashCode()
        result = 31 * result + this.Bcr.contentHashCode()
        result = 31 * result + this.Bvr.contentHashCode()
        result = 31 * result + this.Wcr.contentHashCode()
        result = 31 * result + this.Wvr.contentHashCode()
        return result
    }
}

public data class ARM64_NT_CONTEXT_0(public var Anonymous: ARM64_NT_CONTEXT_0_0 = ARM64_NT_CONTEXT_0_0(), public var X: ULongArray = ULongArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARM64_NT_CONTEXT_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.X.contentEquals(other.X)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.X.contentHashCode()
        return result
    }
}

public class ARM64_NT_CONTEXT_0_0(
    public var X0: ULong = 0uL,
    public var X1: ULong = 0uL,
    public var X2: ULong = 0uL,
    public var X3: ULong = 0uL,
    public var X4: ULong = 0uL,
    public var X5: ULong = 0uL,
    public var X6: ULong = 0uL,
    public var X7: ULong = 0uL,
    public var X8: ULong = 0uL,
    public var X9: ULong = 0uL,
    public var X10: ULong = 0uL,
    public var X11: ULong = 0uL,
    public var X12: ULong = 0uL,
    public var X13: ULong = 0uL,
    public var X14: ULong = 0uL,
    public var X15: ULong = 0uL,
    public var X16: ULong = 0uL,
    public var X17: ULong = 0uL,
    public var X18: ULong = 0uL,
    public var X19: ULong = 0uL,
    public var X20: ULong = 0uL,
    public var X21: ULong = 0uL,
    public var X22: ULong = 0uL,
    public var X23: ULong = 0uL,
    public var X24: ULong = 0uL,
    public var X25: ULong = 0uL,
    public var X26: ULong = 0uL,
    public var X27: ULong = 0uL,
    public var X28: ULong = 0uL,
    public var Fp: ULong = 0uL,
    public var Lr: ULong = 0uL,
)

public data class BDCB_IMAGE_INFORMATION(
    public var Classification: BDCB_CLASSIFICATION = 0,
    public var ImageFlags: UInt = 0u,
    public var ImageName: UNICODE_STRING = UNICODE_STRING(),
    public var RegistryPath: UNICODE_STRING = UNICODE_STRING(),
    public var CertificatePublisher: UNICODE_STRING = UNICODE_STRING(),
    public var CertificateIssuer: UNICODE_STRING = UNICODE_STRING(),
    public var ImageHash: Long = 0L,
    public var CertificateThumbprint: Long = 0L,
    public var ImageHashAlgorithm: UInt = 0u,
    public var ThumbprintHashAlgorithm: UInt = 0u,
    public var ImageHashLength: UInt = 0u,
    public var CertificateThumbprintLength: UInt = 0u,
)

public data class BDCB_STATUS_UPDATE_CONTEXT(public var StatusType: BDCB_STATUS_UPDATE_TYPE = 0)

public data class BOOTDISK_INFORMATION(
    public var BootPartitionOffset: Long = 0L,
    public var SystemPartitionOffset: Long = 0L,
    public var BootDeviceSignature: UInt = 0u,
    public var SystemDeviceSignature: UInt = 0u,
)

public data class BOOTDISK_INFORMATION_EX(
    public var BootPartitionOffset: Long = 0L,
    public var SystemPartitionOffset: Long = 0L,
    public var BootDeviceSignature: UInt = 0u,
    public var SystemDeviceSignature: UInt = 0u,
    public var BootDeviceGuid: GUID = GUID(),
    public var SystemDeviceGuid: GUID = GUID(),
    public var BootDeviceIsGpt: Boolean = false,
    public var SystemDeviceIsGpt: Boolean = false,
)

public data class BOOTDISK_INFORMATION_LITE(public var NumberEntries: UInt = 0u, public var Entries: List<LOADER_PARTITION_INFORMATION_EX> = List(1) { LOADER_PARTITION_INFORMATION_EX() })

public data class BUS_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var TranslateBusAddress: PTRANSLATE_BUS_ADDRESS = null,
    public var GetDmaAdapter: PGET_DMA_ADAPTER = null,
    public var SetBusData: PGET_SET_DEVICE_DATA = null,
    public var GetBusData: PGET_SET_DEVICE_DATA = null,
)

public data class BUS_RESOURCE_UPDATE_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var GetUpdatedBusResource: PGET_UPDATED_BUS_RESOURCE = null,
)

public data class BUS_SPECIFIC_RESET_FLAGS(public var u: BUS_SPECIFIC_RESET_FLAGS_0 = BUS_SPECIFIC_RESET_FLAGS_0(), public var AsUlonglong: ULong = 0uL)

public data class BUS_SPECIFIC_RESET_FLAGS_0(public var _bitfield: ULong = 0uL)

public data class CLFS_MGMT_CLIENT_REGISTRATION(
    public var Version: UInt = 0u,
    public var AdvanceTailCallback: PCLFS_CLIENT_ADVANCE_TAIL_CALLBACK = null,
    public var AdvanceTailCallbackData: Long = 0L,
    public var LogGrowthCompleteCallback: PCLFS_CLIENT_LFF_HANDLER_COMPLETE_CALLBACK = null,
    public var LogGrowthCompleteCallbackData: Long = 0L,
    public var LogUnpinnedCallback: PCLFS_CLIENT_LOG_UNPINNED_CALLBACK = null,
    public var LogUnpinnedCallbackData: Long = 0L,
)

public data class CMC_DRIVER_INFO(
    public var ExceptionCallback: PDRIVER_CMC_EXCEPTION_CALLBACK = null,
    public var DpcCallback: PKDEFERRED_ROUTINE = null,
    public var DeviceContext: Long = 0L,
)

public data class CM_COMPONENT_INFORMATION(
    public var Flags: DEVICE_FLAGS = DEVICE_FLAGS(),
    public var Version: UInt = 0u,
    public var Key: UInt = 0u,
    public var AffinityMask: ULong = 0uL,
)

public data class CM_DISK_GEOMETRY_DEVICE_DATA(
    public var BytesPerSector: UInt = 0u,
    public var NumberOfCylinders: UInt = 0u,
    public var SectorsPerTrack: UInt = 0u,
    public var NumberOfHeads: UInt = 0u,
)

public data class CM_EISA_FUNCTION_INFORMATION(
    public var CompressedId: UInt = 0u,
    public var IdSlotFlags1: UByte = 0u,
    public var IdSlotFlags2: UByte = 0u,
    public var MinorRevision: UByte = 0u,
    public var MajorRevision: UByte = 0u,
    public var Selections: UByteArray = UByteArray(26),
    public var FunctionFlags: UByte = 0u,
    public var TypeString: UByteArray = UByteArray(80),
    public var EisaMemory: List<EISA_MEMORY_CONFIGURATION> = List(9) { EISA_MEMORY_CONFIGURATION() },
    public var EisaIrq: List<EISA_IRQ_CONFIGURATION> = List(7) { EISA_IRQ_CONFIGURATION() },
    public var EisaDma: List<EISA_DMA_CONFIGURATION> = List(4) { EISA_DMA_CONFIGURATION() },
    public var EisaPort: List<EISA_PORT_CONFIGURATION> = List(20) { EISA_PORT_CONFIGURATION() },
    public var InitializationData: UByteArray = UByteArray(60),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_EISA_FUNCTION_INFORMATION) return false
        if (this.CompressedId != other.CompressedId) return false
        if (this.IdSlotFlags1 != other.IdSlotFlags1) return false
        if (this.IdSlotFlags2 != other.IdSlotFlags2) return false
        if (this.MinorRevision != other.MinorRevision) return false
        if (this.MajorRevision != other.MajorRevision) return false
        if (!this.Selections.contentEquals(other.Selections)) return false
        if (this.FunctionFlags != other.FunctionFlags) return false
        if (!this.TypeString.contentEquals(other.TypeString)) return false
        if (this.EisaMemory != other.EisaMemory) return false
        if (this.EisaIrq != other.EisaIrq) return false
        if (this.EisaDma != other.EisaDma) return false
        if (this.EisaPort != other.EisaPort) return false
        if (!this.InitializationData.contentEquals(other.InitializationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompressedId.hashCode()
        result = 31 * result + this.IdSlotFlags1.hashCode()
        result = 31 * result + this.IdSlotFlags2.hashCode()
        result = 31 * result + this.MinorRevision.hashCode()
        result = 31 * result + this.MajorRevision.hashCode()
        result = 31 * result + this.Selections.contentHashCode()
        result = 31 * result + this.FunctionFlags.hashCode()
        result = 31 * result + this.TypeString.contentHashCode()
        result = 31 * result + this.EisaMemory.hashCode()
        result = 31 * result + this.EisaIrq.hashCode()
        result = 31 * result + this.EisaDma.hashCode()
        result = 31 * result + this.EisaPort.hashCode()
        result = 31 * result + this.InitializationData.contentHashCode()
        return result
    }
}

public data class CM_EISA_SLOT_INFORMATION(
    public var ReturnCode: UByte = 0u,
    public var ReturnFlags: UByte = 0u,
    public var MajorRevision: UByte = 0u,
    public var MinorRevision: UByte = 0u,
    public var Checksum: UShort = 0u,
    public var NumberFunctions: UByte = 0u,
    public var FunctionInformation: UByte = 0u,
    public var CompressedId: UInt = 0u,
)

public class CM_FLOPPY_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Size: ByteArray = ByteArray(8),
    public var MaxDensity: UInt = 0u,
    public var MountDensity: UInt = 0u,
    public var StepRateHeadUnloadTime: UByte = 0u,
    public var HeadLoadTime: UByte = 0u,
    public var MotorOffTime: UByte = 0u,
    public var SectorLengthCode: UByte = 0u,
    public var SectorPerTrack: UByte = 0u,
    public var ReadWriteGapLength: UByte = 0u,
    public var DataTransferLength: UByte = 0u,
    public var FormatGapLength: UByte = 0u,
    public var FormatFillCharacter: UByte = 0u,
    public var HeadSettleTime: UByte = 0u,
    public var MotorSettleTime: UByte = 0u,
    public var MaximumTrackValue: UByte = 0u,
    public var DataTransferRate: UByte = 0u,
)

public data class CM_FULL_RESOURCE_DESCRIPTOR(
    public var InterfaceType: INTERFACE_TYPE = 0,
    public var BusNumber: UInt = 0u,
    public var PartialResourceList: CM_PARTIAL_RESOURCE_LIST = CM_PARTIAL_RESOURCE_LIST(),
)

public data class CM_INT13_DRIVE_PARAMETER(
    public var DriveSelect: UShort = 0u,
    public var MaxCylinders: UInt = 0u,
    public var SectorsPerTrack: UShort = 0u,
    public var MaxHeads: UShort = 0u,
    public var NumberDrives: UShort = 0u,
)

public data class CM_KEYBOARD_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Type: UByte = 0u,
    public var Subtype: UByte = 0u,
    public var KeyboardFlags: UShort = 0u,
)

public data class CM_MCA_POS_DATA(
    public var AdapterId: UShort = 0u,
    public var PosData1: UByte = 0u,
    public var PosData2: UByte = 0u,
    public var PosData3: UByte = 0u,
    public var PosData4: UByte = 0u,
)

public class CM_MONITOR_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var HorizontalScreenSize: UShort = 0u,
    public var VerticalScreenSize: UShort = 0u,
    public var HorizontalResolution: UShort = 0u,
    public var VerticalResolution: UShort = 0u,
    public var HorizontalDisplayTimeLow: UShort = 0u,
    public var HorizontalDisplayTime: UShort = 0u,
    public var HorizontalDisplayTimeHigh: UShort = 0u,
    public var HorizontalBackPorchLow: UShort = 0u,
    public var HorizontalBackPorch: UShort = 0u,
    public var HorizontalBackPorchHigh: UShort = 0u,
    public var HorizontalFrontPorchLow: UShort = 0u,
    public var HorizontalFrontPorch: UShort = 0u,
    public var HorizontalFrontPorchHigh: UShort = 0u,
    public var HorizontalSyncLow: UShort = 0u,
    public var HorizontalSync: UShort = 0u,
    public var HorizontalSyncHigh: UShort = 0u,
    public var VerticalBackPorchLow: UShort = 0u,
    public var VerticalBackPorch: UShort = 0u,
    public var VerticalBackPorchHigh: UShort = 0u,
    public var VerticalFrontPorchLow: UShort = 0u,
    public var VerticalFrontPorch: UShort = 0u,
    public var VerticalFrontPorchHigh: UShort = 0u,
    public var VerticalSyncLow: UShort = 0u,
    public var VerticalSync: UShort = 0u,
    public var VerticalSyncHigh: UShort = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR(
    public var Type: UByte = 0u,
    public var ShareDisposition: UByte = 0u,
    public var Flags: UShort = 0u,
    public var u: CM_PARTIAL_RESOURCE_DESCRIPTOR_0 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0(),
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0(
    public var Generic: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_0 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_0(),
    public var Port: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_1 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_1(),
    public var Interrupt: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_2 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_2(),
    public var MessageInterrupt: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3(),
    public var Memory: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_4 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_4(),
    public var Dma: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_5 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_5(),
    public var DmaV3: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_6 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_6(),
    public var DevicePrivate: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_7 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_7(),
    public var BusNumber: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_8 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_8(),
    public var DeviceSpecificData: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_9 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_9(),
    public var Memory40: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_10 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_10(),
    public var Memory48: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_11 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_11(),
    public var Memory64: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_12 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_12(),
    public var Connection: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_13 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_13(),
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_8(
    public var Start: UInt = 0u,
    public var Length: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_13(
    public var Class: UByte = 0u,
    public var Type: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var IdLowPart: UInt = 0u,
    public var IdHighPart: UInt = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_7(public var Data: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_PARTIAL_RESOURCE_DESCRIPTOR_0_7) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_9(
    public var DataSize: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_6(
    public var Channel: UInt = 0u,
    public var RequestLine: UInt = 0u,
    public var TransferWidth: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var Reserved3: UByte = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_5(
    public var Channel: UInt = 0u,
    public var Port: UInt = 0u,
    public var Reserved1: UInt = 0u,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_0(public var Start: Long = 0L, public var Length: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_2(
    public var Level: UInt = 0u,
    public var Vector: UInt = 0u,
    public var Affinity: ULong = 0uL,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_10(public var Start: Long = 0L, public var Length40: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_11(public var Start: Long = 0L, public var Length48: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_12(public var Start: Long = 0L, public var Length64: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_4(public var Start: Long = 0L, public var Length: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3(public var Anonymous: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0())

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0(public var Raw: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_0 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_0(), public var Translated: CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_1 = CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_1())

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_0(
    public var Reserved: UShort = 0u,
    public var MessageCount: UShort = 0u,
    public var Vector: UInt = 0u,
    public var Affinity: ULong = 0uL,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_3_0_1(
    public var Level: UInt = 0u,
    public var Vector: UInt = 0u,
    public var Affinity: ULong = 0uL,
)

public data class CM_PARTIAL_RESOURCE_DESCRIPTOR_0_1(public var Start: Long = 0L, public var Length: UInt = 0u)

public data class CM_PARTIAL_RESOURCE_LIST(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Count: UInt = 0u,
    public var PartialDescriptors: List<CM_PARTIAL_RESOURCE_DESCRIPTOR> = List(1) { CM_PARTIAL_RESOURCE_DESCRIPTOR() },
)

public data class CM_PCCARD_DEVICE_DATA(
    public var Flags: UByte = 0u,
    public var ErrorCode: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var BusData: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var LegacyBaseAddress: UInt = 0u,
    public var IRQMap: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_PCCARD_DEVICE_DATA) return false
        if (this.Flags != other.Flags) return false
        if (this.ErrorCode != other.ErrorCode) return false
        if (this.Reserved != other.Reserved) return false
        if (this.BusData != other.BusData) return false
        if (this.DeviceId != other.DeviceId) return false
        if (this.LegacyBaseAddress != other.LegacyBaseAddress) return false
        if (!this.IRQMap.contentEquals(other.IRQMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.ErrorCode.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.BusData.hashCode()
        result = 31 * result + this.DeviceId.hashCode()
        result = 31 * result + this.LegacyBaseAddress.hashCode()
        result = 31 * result + this.IRQMap.contentHashCode()
        return result
    }
}

public data class CM_PNP_BIOS_DEVICE_NODE(
    public var Size: UShort = 0u,
    public var Node: UByte = 0u,
    public var ProductId: UInt = 0u,
    public var DeviceType: UByteArray = UByteArray(3),
    public var DeviceAttributes: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_PNP_BIOS_DEVICE_NODE) return false
        if (this.Size != other.Size) return false
        if (this.Node != other.Node) return false
        if (this.ProductId != other.ProductId) return false
        if (!this.DeviceType.contentEquals(other.DeviceType)) return false
        if (this.DeviceAttributes != other.DeviceAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Node.hashCode()
        result = 31 * result + this.ProductId.hashCode()
        result = 31 * result + this.DeviceType.contentHashCode()
        result = 31 * result + this.DeviceAttributes.hashCode()
        return result
    }
}

public data class CM_PNP_BIOS_INSTALLATION_CHECK(
    public var Signature: UByteArray = UByteArray(4),
    public var Revision: UByte = 0u,
    public var Length: UByte = 0u,
    public var ControlField: UShort = 0u,
    public var Checksum: UByte = 0u,
    public var EventFlagAddress: UInt = 0u,
    public var RealModeEntryOffset: UShort = 0u,
    public var RealModeEntrySegment: UShort = 0u,
    public var ProtectedModeEntryOffset: UShort = 0u,
    public var ProtectedModeCodeBaseAddress: UInt = 0u,
    public var OemDeviceId: UInt = 0u,
    public var RealModeDataBaseAddress: UShort = 0u,
    public var ProtectedModeDataBaseAddress: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_PNP_BIOS_INSTALLATION_CHECK) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        if (this.Revision != other.Revision) return false
        if (this.Length != other.Length) return false
        if (this.ControlField != other.ControlField) return false
        if (this.Checksum != other.Checksum) return false
        if (this.EventFlagAddress != other.EventFlagAddress) return false
        if (this.RealModeEntryOffset != other.RealModeEntryOffset) return false
        if (this.RealModeEntrySegment != other.RealModeEntrySegment) return false
        if (this.ProtectedModeEntryOffset != other.ProtectedModeEntryOffset) return false
        if (this.ProtectedModeCodeBaseAddress != other.ProtectedModeCodeBaseAddress) return false
        if (this.OemDeviceId != other.OemDeviceId) return false
        if (this.RealModeDataBaseAddress != other.RealModeDataBaseAddress) return false
        if (this.ProtectedModeDataBaseAddress != other.ProtectedModeDataBaseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.contentHashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.ControlField.hashCode()
        result = 31 * result + this.Checksum.hashCode()
        result = 31 * result + this.EventFlagAddress.hashCode()
        result = 31 * result + this.RealModeEntryOffset.hashCode()
        result = 31 * result + this.RealModeEntrySegment.hashCode()
        result = 31 * result + this.ProtectedModeEntryOffset.hashCode()
        result = 31 * result + this.ProtectedModeCodeBaseAddress.hashCode()
        result = 31 * result + this.OemDeviceId.hashCode()
        result = 31 * result + this.RealModeDataBaseAddress.hashCode()
        result = 31 * result + this.ProtectedModeDataBaseAddress.hashCode()
        return result
    }
}

public data class CM_POWER_DATA(
    public var PD_Size: UInt = 0u,
    public var PD_MostRecentPowerState: DEVICE_POWER_STATE = 0,
    public var PD_Capabilities: DEVICE_POWER_CAPABILITIES = 0u,
    public var PD_D1Latency: UInt = 0u,
    public var PD_D2Latency: UInt = 0u,
    public var PD_D3Latency: UInt = 0u,
    public var PD_PowerStateMapping: IntArray = IntArray(7),
    public var PD_DeepestSystemWake: SYSTEM_POWER_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_POWER_DATA) return false
        if (this.PD_Size != other.PD_Size) return false
        if (this.PD_MostRecentPowerState != other.PD_MostRecentPowerState) return false
        if (this.PD_Capabilities != other.PD_Capabilities) return false
        if (this.PD_D1Latency != other.PD_D1Latency) return false
        if (this.PD_D2Latency != other.PD_D2Latency) return false
        if (this.PD_D3Latency != other.PD_D3Latency) return false
        if (!this.PD_PowerStateMapping.contentEquals(other.PD_PowerStateMapping)) return false
        if (this.PD_DeepestSystemWake != other.PD_DeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PD_Size.hashCode()
        result = 31 * result + this.PD_MostRecentPowerState.hashCode()
        result = 31 * result + this.PD_Capabilities.hashCode()
        result = 31 * result + this.PD_D1Latency.hashCode()
        result = 31 * result + this.PD_D2Latency.hashCode()
        result = 31 * result + this.PD_D3Latency.hashCode()
        result = 31 * result + this.PD_PowerStateMapping.contentHashCode()
        result = 31 * result + this.PD_DeepestSystemWake.hashCode()
        return result
    }
}

public data class CM_RESOURCE_LIST(public var Count: UInt = 0u, public var List: List<CM_FULL_RESOURCE_DESCRIPTOR> = List(1) { CM_FULL_RESOURCE_DESCRIPTOR() })

public data class CM_ROM_BLOCK(public var Address: UInt = 0u, public var Size: UInt = 0u)

public data class CM_SCSI_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var HostIdentifier: UByte = 0u,
)

public data class CM_SERIAL_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var BaudClock: UInt = 0u,
)

public data class CM_SONIC_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var DataConfigurationRegister: UShort = 0u,
    public var EthernetAddress: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_SONIC_DEVICE_DATA) return false
        if (this.Version != other.Version) return false
        if (this.Revision != other.Revision) return false
        if (this.DataConfigurationRegister != other.DataConfigurationRegister) return false
        if (!this.EthernetAddress.contentEquals(other.EthernetAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.DataConfigurationRegister.hashCode()
        result = 31 * result + this.EthernetAddress.contentHashCode()
        return result
    }
}

public data class CM_VIDEO_DEVICE_DATA(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var VideoClock: UInt = 0u,
)

public data class CONFIGURATION_INFORMATION(
    public var DiskCount: UInt = 0u,
    public var FloppyCount: UInt = 0u,
    public var CdRomCount: UInt = 0u,
    public var TapeCount: UInt = 0u,
    public var ScsiPortCount: UInt = 0u,
    public var SerialCount: UInt = 0u,
    public var ParallelCount: UInt = 0u,
    public var AtDiskPrimaryAddressClaimed: Boolean = false,
    public var AtDiskSecondaryAddressClaimed: Boolean = false,
    public var Version: UInt = 0u,
    public var MediumChangerCount: UInt = 0u,
)

public data class CONTROLLER_OBJECT(
    public var Type: Short = 0,
    public var Size: Short = 0,
    public var ControllerExtension: Long = 0L,
    public var DeviceWaitQueue: KDEVICE_QUEUE = KDEVICE_QUEUE(),
    public var Spare1: UInt = 0u,
    public var Spare2: Long = 0L,
)

public data class COUNTED_REASON_CONTEXT(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Anonymous: COUNTED_REASON_CONTEXT_0 = COUNTED_REASON_CONTEXT_0(),
)

public data class COUNTED_REASON_CONTEXT_0(public var Anonymous: COUNTED_REASON_CONTEXT_0_0 = COUNTED_REASON_CONTEXT_0_0(), public var SimpleString: UNICODE_STRING = UNICODE_STRING())

public data class COUNTED_REASON_CONTEXT_0_0(
    public var ResourceFileName: UNICODE_STRING = UNICODE_STRING(),
    public var ResourceReasonId: UShort = 0u,
    public var StringCount: UInt = 0u,
    public var ReasonStrings: Long = 0L,
)

public data class CPE_DRIVER_INFO(
    public var ExceptionCallback: PDRIVER_CPE_EXCEPTION_CALLBACK = null,
    public var DpcCallback: PKDEFERRED_ROUTINE = null,
    public var DeviceContext: Long = 0L,
)

public data class CRASHDUMP_FUNCTIONS_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var PowerOn: PCRASHDUMP_POWER_ON = null,
)

public data class CREATE_USER_PROCESS_ECP_CONTEXT(
    public var Size: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var AccessToken: Long = 0L,
)

public data class D3COLD_AUX_POWER_AND_TIMING_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var RequestCorePowerRail: PD3COLD_REQUEST_CORE_POWER_RAIL = null,
    public var RequestAuxPower: PD3COLD_REQUEST_AUX_POWER = null,
    public var RequestPerstDelay: PD3COLD_REQUEST_PERST_DELAY = null,
)

public data class D3COLD_SUPPORT_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetD3ColdSupport: PSET_D3COLD_SUPPORT = null,
    public var GetIdleWakeInfo: PGET_IDLE_WAKE_INFO = null,
    public var GetD3ColdCapability: PGET_D3COLD_CAPABILITY = null,
    public var GetBusDriverD3ColdSupport: PGET_D3COLD_CAPABILITY = null,
    public var GetLastTransitionStatus: PGET_D3COLD_LAST_TRANSITION_STATUS = null,
)

public data class DEBUGGING_DEVICE_IN_USE(
    public var NameSpace: KD_NAMESPACE_ENUM = 0,
    public var StructureLength: UInt = 0u,
    public var Anonymous: DEBUGGING_DEVICE_IN_USE_0 = DEBUGGING_DEVICE_IN_USE_0(),
)

public data class DEBUGGING_DEVICE_IN_USE_0(public var AcpiDevice: ACPI_DEBUGGING_DEVICE_IN_USE = ACPI_DEBUGGING_DEVICE_IN_USE(), public var PciDevice: PCI_DEBUGGING_DEVICE_IN_USE = PCI_DEBUGGING_DEVICE_IN_USE())

public data class DEBUGGING_DEVICE_IN_USE_INFORMATION(public var DeviceCount: UInt = 0u, public var Device: List<DEBUGGING_DEVICE_IN_USE> = List(1) { DEBUGGING_DEVICE_IN_USE() })

public data class DEBUG_DEVICE_ADDRESS(
    public var Type: UByte = 0u,
    public var Valid: Boolean = false,
    public var Anonymous: DEBUG_DEVICE_ADDRESS_0 = DEBUG_DEVICE_ADDRESS_0(),
    public var TranslatedAddress: Long = 0L,
    public var Length: UInt = 0u,
)

public data class DEBUG_DEVICE_ADDRESS_0(public var Reserved: UByteArray = UByteArray(2), public var Anonymous: DEBUG_DEVICE_ADDRESS_0_0 = DEBUG_DEVICE_ADDRESS_0_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_DEVICE_ADDRESS_0) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DEBUG_DEVICE_ADDRESS_0_0(public var BitWidth: UByte = 0u, public var AccessSize: UByte = 0u)

public class DEBUG_DEVICE_DESCRIPTOR(
    public var Bus: UInt = 0u,
    public var Slot: UInt = 0u,
    public var Segment: UShort = 0u,
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var BaseClass: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var ProgIf: UByte = 0u,
    public var Anonymous: DEBUG_DEVICE_DESCRIPTOR_0 = DEBUG_DEVICE_DESCRIPTOR_0(),
    public var Initialized: Boolean = false,
    public var Configured: Boolean = false,
    public var BaseAddress: List<DEBUG_DEVICE_ADDRESS> = List(6) { DEBUG_DEVICE_ADDRESS() },
    public var Memory: DEBUG_MEMORY_REQUIREMENTS = DEBUG_MEMORY_REQUIREMENTS(),
    public var Dbg2TableIndex: UInt = 0u,
    public var PortType: UShort = 0u,
    public var PortSubtype: UShort = 0u,
    public var OemData: Long = 0L,
    public var OemDataLength: UInt = 0u,
    public var NameSpace: KD_NAMESPACE_ENUM = 0,
    public var NameSpacePath: PWSTR = 0L,
    public var NameSpacePathLength: UInt = 0u,
    public var TransportType: UInt = 0u,
    public var TransportData: DEBUG_TRANSPORT_DATA = DEBUG_TRANSPORT_DATA(),
    public var EfiIoMmuData: DEBUG_EFI_IOMMU_DATA = DEBUG_EFI_IOMMU_DATA(),
)

public data class DEBUG_DEVICE_DESCRIPTOR_0(public var Flags: UByte = 0u, public var Anonymous: DEBUG_DEVICE_DESCRIPTOR_0_0 = DEBUG_DEVICE_DESCRIPTOR_0_0())

public data class DEBUG_DEVICE_DESCRIPTOR_0_0(public var _bitfield: UByte = 0u)

public data class DEBUG_EFI_IOMMU_DATA(public var PciIoProtocolHandle: Long = 0L, public var Mapping: Long = 0L)

public data class DEBUG_MEMORY_REQUIREMENTS(
    public var Start: Long = 0L,
    public var MaxEnd: Long = 0L,
    public var VirtualAddress: Long = 0L,
    public var Length: UInt = 0u,
    public var Cached: Boolean = false,
    public var Aligned: Boolean = false,
)

public data class DEBUG_TRANSPORT_DATA(
    public var HwContextSize: UInt = 0u,
    public var SharedVisibleDataSize: UInt = 0u,
    public var UseSerialFraming: Boolean = false,
    public var ValidUSBCoreId: Boolean = false,
    public var USBCoreId: UByte = 0u,
)

public data class DEVICE_BUS_SPECIFIC_RESET_INFO(public var BusTypeGuid: GUID = GUID(), public var ResetTypeSupported: DEVICE_BUS_SPECIFIC_RESET_TYPE = DEVICE_BUS_SPECIFIC_RESET_TYPE())

public data class DEVICE_BUS_SPECIFIC_RESET_TYPE(
    public var Pci: DEVICE_BUS_SPECIFIC_RESET_TYPE_0 = DEVICE_BUS_SPECIFIC_RESET_TYPE_0(),
    public var Acpi: DEVICE_BUS_SPECIFIC_RESET_TYPE_1 = DEVICE_BUS_SPECIFIC_RESET_TYPE_1(),
    public var AsULONGLONG: ULong = 0uL,
)

public data class DEVICE_BUS_SPECIFIC_RESET_TYPE_1(public var _bitfield: ULong = 0uL)

public data class DEVICE_BUS_SPECIFIC_RESET_TYPE_0(public var _bitfield: ULong = 0uL)

public data class DEVICE_CAPABILITIES(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var _bitfield: UInt = 0u,
    public var Address: UInt = 0u,
    public var UINumber: UInt = 0u,
    public var DeviceState: IntArray = IntArray(7),
    public var SystemWake: SYSTEM_POWER_STATE = 0,
    public var DeviceWake: DEVICE_POWER_STATE = 0,
    public var D1Latency: UInt = 0u,
    public var D2Latency: UInt = 0u,
    public var D3Latency: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_CAPABILITIES) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this._bitfield != other._bitfield) return false
        if (this.Address != other.Address) return false
        if (this.UINumber != other.UINumber) return false
        if (!this.DeviceState.contentEquals(other.DeviceState)) return false
        if (this.SystemWake != other.SystemWake) return false
        if (this.DeviceWake != other.DeviceWake) return false
        if (this.D1Latency != other.D1Latency) return false
        if (this.D2Latency != other.D2Latency) return false
        if (this.D3Latency != other.D3Latency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.UINumber.hashCode()
        result = 31 * result + this.DeviceState.contentHashCode()
        result = 31 * result + this.SystemWake.hashCode()
        result = 31 * result + this.DeviceWake.hashCode()
        result = 31 * result + this.D1Latency.hashCode()
        result = 31 * result + this.D2Latency.hashCode()
        result = 31 * result + this.D3Latency.hashCode()
        return result
    }
}

public class DEVICE_DESCRIPTION(
    public var Version: UInt = 0u,
    public var Master: Boolean = false,
    public var ScatterGather: Boolean = false,
    public var DemandMode: Boolean = false,
    public var AutoInitialize: Boolean = false,
    public var Dma32BitAddresses: Boolean = false,
    public var IgnoreCount: Boolean = false,
    public var Reserved1: Boolean = false,
    public var Dma64BitAddresses: Boolean = false,
    public var BusNumber: UInt = 0u,
    public var DmaChannel: UInt = 0u,
    public var InterfaceType: INTERFACE_TYPE = 0,
    public var DmaWidth: DMA_WIDTH = 0,
    public var DmaSpeed: DMA_SPEED = 0,
    public var MaximumLength: UInt = 0u,
    public var DmaPort: UInt = 0u,
    public var DmaAddressWidth: UInt = 0u,
    public var DmaControllerInstance: UInt = 0u,
    public var DmaRequestLine: UInt = 0u,
    public var DeviceAddress: Long = 0L,
)

public data class DEVICE_FAULT_CONFIGURATION(public var FaultHandler: PIOMMU_DEVICE_FAULT_HANDLER = null, public var FaultContext: Long = 0L)

public data class DEVICE_FLAGS(public var _bitfield: UInt = 0u)

public data class DEVICE_INTERFACE_CHANGE_NOTIFICATION(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
    public var InterfaceClassGuid: GUID = GUID(),
    public var SymbolicLinkName: Long = 0L,
)

public data class DEVICE_RELATIONS(public var Count: UInt = 0u, public var Objects: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEVICE_RELATIONS) return false
        if (this.Count != other.Count) return false
        if (!this.Objects.contentEquals(other.Objects)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Objects.contentHashCode()
        return result
    }
}

public data class DEVICE_RESET_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var DeviceReset: PDEVICE_RESET_HANDLER = null,
    public var SupportedResetTypes: UInt = 0u,
    public var Reserved: Long = 0L,
    public var QueryBusSpecificResetInfo: PDEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLER = null,
    public var DeviceBusSpecificReset: PDEVICE_BUS_SPECIFIC_RESET_HANDLER = null,
    public var GetDeviceResetStatus: PGET_DEVICE_RESET_STATUS = null,
)

public data class DEVICE_RESET_STATUS_FLAGS(public var u: DEVICE_RESET_STATUS_FLAGS_0 = DEVICE_RESET_STATUS_FLAGS_0(), public var AsUlonglong: ULong = 0uL)

public data class DEVICE_RESET_STATUS_FLAGS_0(public var _bitfield: ULong = 0uL)

public data class DISK_SIGNATURE(public var PartitionStyle: UInt = 0u, public var Anonymous: DISK_SIGNATURE_0 = DISK_SIGNATURE_0())

public data class DISK_SIGNATURE_0(public var Mbr: DISK_SIGNATURE_0_0 = DISK_SIGNATURE_0_0(), public var Gpt: DISK_SIGNATURE_0_1 = DISK_SIGNATURE_0_1())

public data class DISK_SIGNATURE_0_1(public var DiskId: GUID = GUID())

public data class DISK_SIGNATURE_0_0(public var Signature: UInt = 0u, public var CheckSum: UInt = 0u)

public data class DMA_ADAPTER(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var DmaOperations: Long = 0L,
)

public data class DMA_ADAPTER_INFO(public var Version: UInt = 0u, public var Anonymous: DMA_ADAPTER_INFO_0 = DMA_ADAPTER_INFO_0())

public data class DMA_ADAPTER_INFO_0(public var V1: DMA_ADAPTER_INFO_V1 = DMA_ADAPTER_INFO_V1(), public var Crashdump: DMA_ADAPTER_INFO_CRASHDUMP = DMA_ADAPTER_INFO_CRASHDUMP())

public data class DMA_ADAPTER_INFO_CRASHDUMP(
    public var DeviceDescription: DEVICE_DESCRIPTION = DEVICE_DESCRIPTION(),
    public var DeviceIdSize: ULong = 0uL,
    public var DeviceId: Long = 0L,
)

public data class DMA_ADAPTER_INFO_V1(
    public var ReadDmaCounterAvailable: UInt = 0u,
    public var ScatterGatherLimit: UInt = 0u,
    public var DmaAddressWidth: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MinimumTransferUnit: UInt = 0u,
)

public data class DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION(public var ConfigType: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = 0, public var Anonymous: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0 = DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0())

public data class DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0(
    public var LogicalAddressLimits: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_0 = DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_0(),
    public var SubSection: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_1 = DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_1(),
    public var HardwareAccessType: DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = 0,
    public var Reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0) return false
        if (this.LogicalAddressLimits != other.LogicalAddressLimits) return false
        if (this.SubSection != other.SubSection) return false
        if (this.HardwareAccessType != other.HardwareAccessType) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogicalAddressLimits.hashCode()
        result = 31 * result + this.SubSection.hashCode()
        result = 31 * result + this.HardwareAccessType.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_0(public var MinimumAddress: Long = 0L, public var MaximumAddress: Long = 0L)

public data class DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_0_1(public var Offset: ULong = 0uL, public var Length: UInt = 0u)

public data class DMA_CONFIGURATION_BYTE0(public var _bitfield: UByte = 0u)

public data class DMA_CONFIGURATION_BYTE1(public var _bitfield: UByte = 0u)

public data class DMA_IOMMU_INTERFACE(
    public var Version: UInt = 0u,
    public var CreateDomain: PIOMMU_DOMAIN_CREATE = null,
    public var DeleteDomain: PIOMMU_DOMAIN_DELETE = null,
    public var AttachDevice: PIOMMU_DOMAIN_ATTACH_DEVICE = null,
    public var DetachDevice: PIOMMU_DOMAIN_DETACH_DEVICE = null,
    public var FlushDomain: PIOMMU_FLUSH_DOMAIN = null,
    public var FlushDomainByVaList: PIOMMU_FLUSH_DOMAIN_VA_LIST = null,
    public var QueryInputMappings: PIOMMU_QUERY_INPUT_MAPPINGS = null,
    public var MapLogicalRange: PIOMMU_MAP_LOGICAL_RANGE = null,
    public var UnmapLogicalRange: PIOMMU_UNMAP_LOGICAL_RANGE = null,
    public var MapIdentityRange: PIOMMU_MAP_IDENTITY_RANGE = null,
    public var UnmapIdentityRange: PIOMMU_UNMAP_IDENTITY_RANGE = null,
    public var SetDeviceFaultReporting: PIOMMU_SET_DEVICE_FAULT_REPORTING = null,
    public var ConfigureDomain: PIOMMU_DOMAIN_CONFIGURE = null,
)

public data class DMA_IOMMU_INTERFACE_EX(
    public var Size: ULong = 0uL,
    public var Version: UInt = 0u,
    public var Anonymous: DMA_IOMMU_INTERFACE_EX_0 = DMA_IOMMU_INTERFACE_EX_0(),
)

public data class DMA_IOMMU_INTERFACE_EX_0(public var V1: DMA_IOMMU_INTERFACE_V1 = DMA_IOMMU_INTERFACE_V1(), public var V2: DMA_IOMMU_INTERFACE_V2 = DMA_IOMMU_INTERFACE_V2())

public data class DMA_IOMMU_INTERFACE_V1(
    public var CreateDomain: PIOMMU_DOMAIN_CREATE = null,
    public var DeleteDomain: PIOMMU_DOMAIN_DELETE = null,
    public var AttachDevice: PIOMMU_DOMAIN_ATTACH_DEVICE = null,
    public var DetachDevice: PIOMMU_DOMAIN_DETACH_DEVICE = null,
    public var FlushDomain: PIOMMU_FLUSH_DOMAIN = null,
    public var FlushDomainByVaList: PIOMMU_FLUSH_DOMAIN_VA_LIST = null,
    public var QueryInputMappings: PIOMMU_QUERY_INPUT_MAPPINGS = null,
    public var MapLogicalRange: PIOMMU_MAP_LOGICAL_RANGE = null,
    public var UnmapLogicalRange: PIOMMU_UNMAP_LOGICAL_RANGE = null,
    public var MapIdentityRange: PIOMMU_MAP_IDENTITY_RANGE = null,
    public var UnmapIdentityRange: PIOMMU_UNMAP_IDENTITY_RANGE = null,
    public var SetDeviceFaultReporting: PIOMMU_SET_DEVICE_FAULT_REPORTING = null,
    public var ConfigureDomain: PIOMMU_DOMAIN_CONFIGURE = null,
)

public class DMA_IOMMU_INTERFACE_V2(
    public var CreateDomainEx: PIOMMU_DOMAIN_CREATE_EX = null,
    public var DeleteDomain: PIOMMU_DOMAIN_DELETE = null,
    public var AttachDeviceEx: PIOMMU_DOMAIN_ATTACH_DEVICE_EX = null,
    public var DetachDeviceEx: PIOMMU_DOMAIN_DETACH_DEVICE_EX = null,
    public var FlushDomain: PIOMMU_FLUSH_DOMAIN = null,
    public var FlushDomainByVaList: PIOMMU_FLUSH_DOMAIN_VA_LIST = null,
    public var QueryInputMappings: PIOMMU_QUERY_INPUT_MAPPINGS = null,
    public var MapLogicalRangeEx: PIOMMU_MAP_LOGICAL_RANGE_EX = null,
    public var UnmapLogicalRange: PIOMMU_UNMAP_LOGICAL_RANGE = null,
    public var MapIdentityRangeEx: PIOMMU_MAP_IDENTITY_RANGE_EX = null,
    public var UnmapIdentityRangeEx: PIOMMU_UNMAP_IDENTITY_RANGE_EX = null,
    public var SetDeviceFaultReportingEx: PIOMMU_SET_DEVICE_FAULT_REPORTING_EX = null,
    public var ConfigureDomain: PIOMMU_DOMAIN_CONFIGURE = null,
    public var QueryAvailableDomainTypes: PIOMMU_DEVICE_QUERY_DOMAIN_TYPES = null,
    public var RegisterInterfaceStateChangeCallback: PIOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACK = null,
    public var UnregisterInterfaceStateChangeCallback: PIOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACK = null,
    public var ReserveLogicalAddressRange: PIOMMU_RESERVE_LOGICAL_ADDRESS_RANGE = null,
    public var FreeReservedLogicalAddressRange: PIOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGE = null,
    public var MapReservedLogicalRange: PIOMMU_MAP_RESERVED_LOGICAL_RANGE = null,
    public var UnmapReservedLogicalRange: PIOMMU_UNMAP_RESERVED_LOGICAL_RANGE = null,
    public var CreateDevice: PIOMMU_DEVICE_CREATE = null,
    public var DeleteDevice: PIOMMU_DEVICE_DELETE = null,
)

public class DMA_OPERATIONS(
    public var Size: UInt = 0u,
    public var PutDmaAdapter: PPUT_DMA_ADAPTER = null,
    public var AllocateCommonBuffer: PALLOCATE_COMMON_BUFFER = null,
    public var FreeCommonBuffer: PFREE_COMMON_BUFFER = null,
    public var AllocateAdapterChannel: PALLOCATE_ADAPTER_CHANNEL = null,
    public var FlushAdapterBuffers: PFLUSH_ADAPTER_BUFFERS = null,
    public var FreeAdapterChannel: PFREE_ADAPTER_CHANNEL = null,
    public var FreeMapRegisters: PFREE_MAP_REGISTERS = null,
    public var MapTransfer: PMAP_TRANSFER = null,
    public var GetDmaAlignment: PGET_DMA_ALIGNMENT = null,
    public var ReadDmaCounter: PREAD_DMA_COUNTER = null,
    public var GetScatterGatherList: PGET_SCATTER_GATHER_LIST = null,
    public var PutScatterGatherList: PPUT_SCATTER_GATHER_LIST = null,
    public var CalculateScatterGatherList: PCALCULATE_SCATTER_GATHER_LIST_SIZE = null,
    public var BuildScatterGatherList: PBUILD_SCATTER_GATHER_LIST = null,
    public var BuildMdlFromScatterGatherList: PBUILD_MDL_FROM_SCATTER_GATHER_LIST = null,
    public var GetDmaAdapterInfo: PGET_DMA_ADAPTER_INFO = null,
    public var GetDmaTransferInfo: PGET_DMA_TRANSFER_INFO = null,
    public var InitializeDmaTransferContext: PINITIALIZE_DMA_TRANSFER_CONTEXT = null,
    public var AllocateCommonBufferEx: PALLOCATE_COMMON_BUFFER_EX = null,
    public var AllocateAdapterChannelEx: PALLOCATE_ADAPTER_CHANNEL_EX = null,
    public var ConfigureAdapterChannel: PCONFIGURE_ADAPTER_CHANNEL = null,
    public var CancelAdapterChannel: PCANCEL_ADAPTER_CHANNEL = null,
    public var MapTransferEx: PMAP_TRANSFER_EX = null,
    public var GetScatterGatherListEx: PGET_SCATTER_GATHER_LIST_EX = null,
    public var BuildScatterGatherListEx: PBUILD_SCATTER_GATHER_LIST_EX = null,
    public var FlushAdapterBuffersEx: PFLUSH_ADAPTER_BUFFERS_EX = null,
    public var FreeAdapterObject: PFREE_ADAPTER_OBJECT = null,
    public var CancelMappedTransfer: PCANCEL_MAPPED_TRANSFER = null,
    public var AllocateDomainCommonBuffer: PALLOCATE_DOMAIN_COMMON_BUFFER = null,
    public var FlushDmaBuffer: PFLUSH_DMA_BUFFER = null,
    public var JoinDmaDomain: PJOIN_DMA_DOMAIN = null,
    public var LeaveDmaDomain: PLEAVE_DMA_DOMAIN = null,
    public var GetDmaDomain: PGET_DMA_DOMAIN = null,
    public var AllocateCommonBufferWithBounds: PALLOCATE_COMMON_BUFFER_WITH_BOUNDS = null,
    public var AllocateCommonBufferVector: PALLOCATE_COMMON_BUFFER_VECTOR = null,
    public var GetCommonBufferFromVectorByIndex: PGET_COMMON_BUFFER_FROM_VECTOR_BY_INDEX = null,
    public var FreeCommonBufferFromVector: PFREE_COMMON_BUFFER_FROM_VECTOR = null,
    public var FreeCommonBufferVector: PFREE_COMMON_BUFFER_VECTOR = null,
    public var CreateCommonBufferFromMdl: PCREATE_COMMON_BUFFER_FROM_MDL = null,
)

public data class DMA_TRANSFER_INFO(public var Version: UInt = 0u, public var Anonymous: DMA_TRANSFER_INFO_0 = DMA_TRANSFER_INFO_0())

public data class DMA_TRANSFER_INFO_0(public var V1: DMA_TRANSFER_INFO_V1 = DMA_TRANSFER_INFO_V1(), public var V2: DMA_TRANSFER_INFO_V2 = DMA_TRANSFER_INFO_V2())

public data class DMA_TRANSFER_INFO_V1(
    public var MapRegisterCount: UInt = 0u,
    public var ScatterGatherElementCount: UInt = 0u,
    public var ScatterGatherListSize: UInt = 0u,
)

public data class DMA_TRANSFER_INFO_V2(
    public var MapRegisterCount: UInt = 0u,
    public var ScatterGatherElementCount: UInt = 0u,
    public var ScatterGatherListSize: UInt = 0u,
    public var LogicalPageCount: UInt = 0u,
)

public data class DOMAIN_CONFIGURATION(public var Type: DOMAIN_CONFIGURATION_ARCH = 0, public var Anonymous: DOMAIN_CONFIGURATION_0 = DOMAIN_CONFIGURATION_0())

public data class DOMAIN_CONFIGURATION_0(public var Arm64: DOMAIN_CONFIGURATION_ARM64 = DOMAIN_CONFIGURATION_ARM64(), public var X64: DOMAIN_CONFIGURATION_X64 = DOMAIN_CONFIGURATION_X64())

public data class DOMAIN_CONFIGURATION_ARM64(
    public var Ttbr0: Long = 0L,
    public var Ttbr1: Long = 0L,
    public var Mair0: UInt = 0u,
    public var Mair1: UInt = 0u,
    public var InputSize0: UByte = 0u,
    public var InputSize1: UByte = 0u,
    public var CoherentTableWalks: Boolean = false,
    public var TranslationEnabled: Boolean = false,
)

public data class DOMAIN_CONFIGURATION_X64(public var FirstLevelPageTableRoot: Long = 0L, public var TranslationEnabled: Boolean = false)

public data class DPC_WATCHDOG_GLOBAL_TRIAGE_BLOCK(
    public var Signature: UInt = 0u,
    public var Revision: UShort = 0u,
    public var Size: UShort = 0u,
    public var DpcWatchdogProfileOffset: UShort = 0u,
    public var DpcWatchdogProfileLength: UInt = 0u,
)

public data class DRIVER_VERIFIER_THUNK_PAIRS(public var PristineRoutine: PDRIVER_VERIFIER_THUNK_ROUTINE = null, public var NewRoutine: PDRIVER_VERIFIER_THUNK_ROUTINE = null)

public data class EFI_ACPI_RAS_SIGNAL_TABLE(
    public var Header: WHEA_ACPI_HEADER = WHEA_ACPI_HEADER(),
    public var NumberRecord: UInt = 0u,
    public var Entries: List<SIGNAL_REG_VALUE> = List(1) { SIGNAL_REG_VALUE() },
)

public data class EISA_DMA_CONFIGURATION(public var ConfigurationByte0: DMA_CONFIGURATION_BYTE0 = DMA_CONFIGURATION_BYTE0(), public var ConfigurationByte1: DMA_CONFIGURATION_BYTE1 = DMA_CONFIGURATION_BYTE1())

public data class EISA_IRQ_CONFIGURATION(public var ConfigurationByte: EISA_IRQ_DESCRIPTOR = EISA_IRQ_DESCRIPTOR(), public var Reserved: UByte = 0u)

public data class EISA_IRQ_DESCRIPTOR(public var _bitfield: UByte = 0u)

public data class EISA_MEMORY_CONFIGURATION(
    public var ConfigurationByte: EISA_MEMORY_TYPE = EISA_MEMORY_TYPE(),
    public var DataSize: UByte = 0u,
    public var AddressLowWord: UShort = 0u,
    public var AddressHighByte: UByte = 0u,
    public var MemorySize: UShort = 0u,
)

public data class EISA_MEMORY_TYPE(public var _bitfield: UByte = 0u)

public data class EISA_PORT_CONFIGURATION(public var Configuration: EISA_PORT_DESCRIPTOR = EISA_PORT_DESCRIPTOR(), public var PortAddress: UShort = 0u)

public data class EISA_PORT_DESCRIPTOR(public var _bitfield: UByte = 0u)

public data class ETW_TRACE_SESSION_SETTINGS(
    public var Version: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var MinimumBuffers: UInt = 0u,
    public var MaximumBuffers: UInt = 0u,
    public var LoggerMode: UInt = 0u,
    public var FlushTimer: UInt = 0u,
    public var FlushThreshold: UInt = 0u,
    public var ClockType: UInt = 0u,
)

public data class EXTENDED_CREATE_INFORMATION(
    public var ExtendedCreateFlags: Long = 0L,
    public var EaBuffer: Long = 0L,
    public var EaLength: UInt = 0u,
)

public data class EXTENDED_CREATE_INFORMATION_32(
    public var ExtendedCreateFlags: Long = 0L,
    public var EaBuffer: Long = 0L,
    public var EaLength: UInt = 0u,
)

public data class EXT_DELETE_PARAMETERS(
    public var Version: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var DeleteCallback: PEXT_DELETE_CALLBACK = null,
    public var DeleteContext: Long = 0L,
)

public data class EX_RUNDOWN_REF(public var Anonymous: EX_RUNDOWN_REF_0 = EX_RUNDOWN_REF_0())

public data class EX_RUNDOWN_REF_0(public var Count: ULong = 0uL, public var Ptr: Long = 0L)

public data class FAULT_INFORMATION(
    public var Type: FAULT_INFORMATION_ARCH = 0,
    public var IsStage1: Boolean = false,
    public var Anonymous: FAULT_INFORMATION_0 = FAULT_INFORMATION_0(),
)

public data class FAULT_INFORMATION_0(public var Arm64: FAULT_INFORMATION_ARM64 = FAULT_INFORMATION_ARM64(), public var X64: FAULT_INFORMATION_X64 = FAULT_INFORMATION_X64())

public data class FAULT_INFORMATION_ARM64(
    public var DomainHandle: Long = 0L,
    public var FaultAddress: Long = 0L,
    public var PhysicalDeviceObject: Long = 0L,
    public var InputMappingId: UInt = 0u,
    public var Flags: FAULT_INFORMATION_ARM64_FLAGS = FAULT_INFORMATION_ARM64_FLAGS(),
    public var Type: FAULT_INFORMATION_ARM64_TYPE = 0,
    public var IommuBaseAddress: ULong = 0uL,
)

public data class FAULT_INFORMATION_ARM64_FLAGS(public var _bitfield: UInt = 0u)

public data class FAULT_INFORMATION_X64(
    public var DomainHandle: Long = 0L,
    public var FaultAddress: Long = 0L,
    public var Flags: FAULT_INFORMATION_X64_FLAGS = FAULT_INFORMATION_X64_FLAGS(),
    public var Type: FAULT_INFORMATION_ARM64_TYPE = 0,
    public var IommuBaseAddress: ULong = 0uL,
    public var PciSegment: UInt = 0u,
)

public data class FAULT_INFORMATION_X64_FLAGS(public var _bitfield: UInt = 0u)

public data class FILE_ATTRIBUTE_TAG_INFORMATION(public var FileAttributes: UInt = 0u, public var ReparseTag: UInt = 0u)

public data class FILE_END_OF_FILE_INFORMATION(public var EndOfFile: Long = 0L)

public data class FILE_FS_DEVICE_INFORMATION(public var DeviceType: UInt = 0u, public var Characteristics: UInt = 0u)

public data class FILE_FS_FULL_SIZE_INFORMATION(
    public var TotalAllocationUnits: Long = 0L,
    public var CallerAvailableAllocationUnits: Long = 0L,
    public var ActualAvailableAllocationUnits: Long = 0L,
    public var SectorsPerAllocationUnit: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class FILE_FS_FULL_SIZE_INFORMATION_EX(
    public var ActualTotalAllocationUnits: ULong = 0uL,
    public var ActualAvailableAllocationUnits: ULong = 0uL,
    public var ActualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var CallerTotalAllocationUnits: ULong = 0uL,
    public var CallerAvailableAllocationUnits: ULong = 0uL,
    public var CallerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var UsedAllocationUnits: ULong = 0uL,
    public var TotalReservedAllocationUnits: ULong = 0uL,
    public var VolumeStorageReserveAllocationUnits: ULong = 0uL,
    public var AvailableCommittedAllocationUnits: ULong = 0uL,
    public var PoolAvailableAllocationUnits: ULong = 0uL,
    public var SectorsPerAllocationUnit: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class FILE_FS_LABEL_INFORMATION(public var VolumeLabelLength: UInt = 0u, public var VolumeLabel: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FS_LABEL_INFORMATION) return false
        if (this.VolumeLabelLength != other.VolumeLabelLength) return false
        if (!this.VolumeLabel.contentEquals(other.VolumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeLabelLength.hashCode()
        result = 31 * result + this.VolumeLabel.contentHashCode()
        return result
    }
}

public data class FILE_FS_METADATA_SIZE_INFORMATION(
    public var TotalMetadataAllocationUnits: Long = 0L,
    public var SectorsPerAllocationUnit: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class FILE_FS_OBJECTID_INFORMATION(public var ObjectId: UByteArray = UByteArray(16), public var ExtendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FS_OBJECTID_INFORMATION) return false
        if (!this.ObjectId.contentEquals(other.ObjectId)) return false
        if (!this.ExtendedInfo.contentEquals(other.ExtendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ObjectId.contentHashCode()
        result = 31 * result + this.ExtendedInfo.contentHashCode()
        return result
    }
}

public data class FILE_FS_SIZE_INFORMATION(
    public var TotalAllocationUnits: Long = 0L,
    public var AvailableAllocationUnits: Long = 0L,
    public var SectorsPerAllocationUnit: UInt = 0u,
    public var BytesPerSector: UInt = 0u,
)

public data class FILE_FS_VOLUME_INFORMATION(
    public var VolumeCreationTime: Long = 0L,
    public var VolumeSerialNumber: UInt = 0u,
    public var VolumeLabelLength: UInt = 0u,
    public var SupportsObjects: Boolean = false,
    public var VolumeLabel: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_FS_VOLUME_INFORMATION) return false
        if (this.VolumeCreationTime != other.VolumeCreationTime) return false
        if (this.VolumeSerialNumber != other.VolumeSerialNumber) return false
        if (this.VolumeLabelLength != other.VolumeLabelLength) return false
        if (this.SupportsObjects != other.SupportsObjects) return false
        if (!this.VolumeLabel.contentEquals(other.VolumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeCreationTime.hashCode()
        result = 31 * result + this.VolumeSerialNumber.hashCode()
        result = 31 * result + this.VolumeLabelLength.hashCode()
        result = 31 * result + this.SupportsObjects.hashCode()
        result = 31 * result + this.VolumeLabel.contentHashCode()
        return result
    }
}

public data class FILE_IOSTATUSBLOCK_RANGE_INFORMATION(public var IoStatusBlockRange: Long = 0L, public var Length: UInt = 0u)

public data class FILE_IO_COMPLETION_NOTIFICATION_INFORMATION(public var Flags: UInt = 0u)

public data class FILE_IO_PRIORITY_HINT_INFORMATION(public var PriorityHint: IO_PRIORITY_HINT = 0)

public data class FILE_IO_PRIORITY_HINT_INFORMATION_EX(public var PriorityHint: IO_PRIORITY_HINT = 0, public var BoostOutstanding: Boolean = false)

public data class FILE_IS_REMOTE_DEVICE_INFORMATION(public var IsRemote: Boolean = false)

public data class FILE_MEMORY_PARTITION_INFORMATION(public var OwnerPartitionHandle: ULong = 0uL, public var Flags: FILE_MEMORY_PARTITION_INFORMATION_0 = FILE_MEMORY_PARTITION_INFORMATION_0())

public data class FILE_MEMORY_PARTITION_INFORMATION_0(public var Anonymous: FILE_MEMORY_PARTITION_INFORMATION_0_0 = FILE_MEMORY_PARTITION_INFORMATION_0_0(), public var AllFlags: UInt = 0u)

public data class FILE_MEMORY_PARTITION_INFORMATION_0_0(public var NoCrossPartitionAccess: UByte = 0u, public var Spare: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_MEMORY_PARTITION_INFORMATION_0_0) return false
        if (this.NoCrossPartitionAccess != other.NoCrossPartitionAccess) return false
        if (!this.Spare.contentEquals(other.Spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NoCrossPartitionAccess.hashCode()
        result = 31 * result + this.Spare.contentHashCode()
        return result
    }
}

public data class FILE_NUMA_NODE_INFORMATION(public var NodeNumber: UShort = 0u)

public data class FILE_PROCESS_IDS_USING_FILE_INFORMATION(public var NumberOfProcessIdsInList: UInt = 0u, public var ProcessIdList: ULongArray = ULongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_PROCESS_IDS_USING_FILE_INFORMATION) return false
        if (this.NumberOfProcessIdsInList != other.NumberOfProcessIdsInList) return false
        if (!this.ProcessIdList.contentEquals(other.ProcessIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfProcessIdsInList.hashCode()
        result = 31 * result + this.ProcessIdList.contentHashCode()
        return result
    }
}

public data class FILE_SFIO_RESERVE_INFORMATION(
    public var RequestsPerPeriod: UInt = 0u,
    public var Period: UInt = 0u,
    public var RetryFailures: Boolean = false,
    public var Discardable: Boolean = false,
    public var RequestSize: UInt = 0u,
    public var NumOutstandingRequests: UInt = 0u,
)

public data class FILE_SFIO_VOLUME_INFORMATION(
    public var MaximumRequestsPerPeriod: UInt = 0u,
    public var MinimumPeriod: UInt = 0u,
    public var MinimumTransferSize: UInt = 0u,
)

public data class FILE_STANDARD_INFORMATION_EX(
    public var AllocationSize: Long = 0L,
    public var EndOfFile: Long = 0L,
    public var NumberOfLinks: UInt = 0u,
    public var DeletePending: Boolean = false,
    public var Directory: Boolean = false,
    public var AlternateStream: Boolean = false,
    public var MetadataAttribute: Boolean = false,
)

public data class FILE_VALID_DATA_LENGTH_INFORMATION(public var ValidDataLength: Long = 0L)

public data class FLOATING_SAVE_AREA(
    public var ControlWord: UInt = 0u,
    public var StatusWord: UInt = 0u,
    public var TagWord: UInt = 0u,
    public var ErrorOffset: UInt = 0u,
    public var ErrorSelector: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var DataSelector: UInt = 0u,
    public var RegisterArea: UByteArray = UByteArray(80),
    public var Spare0: UInt = 0u,
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
        if (this.Spare0 != other.Spare0) return false
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
        result = 31 * result + this.Spare0.hashCode()
        return result
    }
}

public data class FPGA_CONTROL_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var BusScan: PFPGA_BUS_SCAN = null,
    public var ControlLink: PFPGA_CONTROL_LINK = null,
    public var ControlConfigSpace: PFPGA_CONTROL_CONFIG_SPACE = null,
    public var ControlErrorReporting: PFPGA_CONTROL_ERROR_REPORTING = null,
)

public data class FUNCTION_LEVEL_DEVICE_RESET_PARAMETERS(
    public var Size: UInt = 0u,
    public var DeviceResetCompletion: PDEVICE_RESET_COMPLETION = null,
    public var CompletionContext: Long = 0L,
)

public data class HAL_AMLI_BAD_IO_ADDRESS_LIST(
    public var BadAddrBegin: UInt = 0u,
    public var BadAddrSize: UInt = 0u,
    public var OSVersionTrigger: UInt = 0u,
    public var IOHandler: PHALIOREADWRITEHANDLER = null,
)

public data class HAL_BUS_INFORMATION(
    public var BusType: INTERFACE_TYPE = 0,
    public var ConfigurationType: BUS_DATA_TYPE = 0,
    public var BusNumber: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class HAL_CALLBACKS(public var SetSystemInformation: PCALLBACK_OBJECT = 0L, public var BusCheck: PCALLBACK_OBJECT = 0L)

public class HAL_DISPATCH(
    public var Version: UInt = 0u,
    public var HalQuerySystemInformation: pHalQuerySystemInformation = null,
    public var HalSetSystemInformation: pHalSetSystemInformation = null,
    public var HalQueryBusSlots: pHalQueryBusSlots = null,
    public var Spare1: UInt = 0u,
    public var HalExamineMBR: pHalExamineMBR = null,
    public var HalIoReadPartitionTable: pHalIoReadPartitionTable = null,
    public var HalIoSetPartitionInformation: pHalIoSetPartitionInformation = null,
    public var HalIoWritePartitionTable: pHalIoWritePartitionTable = null,
    public var HalReferenceHandlerForBus: pHalHandlerForBus = null,
    public var HalReferenceBusHandler: pHalReferenceBusHandler = null,
    public var HalDereferenceBusHandler: pHalReferenceBusHandler = null,
    public var HalInitPnpDriver: pHalInitPnpDriver = null,
    public var HalInitPowerManagement: pHalInitPowerManagement = null,
    public var HalGetDmaAdapter: pHalGetDmaAdapter = null,
    public var HalGetInterruptTranslator: pHalGetInterruptTranslator = null,
    public var HalStartMirroring: pHalStartMirroring = null,
    public var HalEndMirroring: pHalEndMirroring = null,
    public var HalMirrorPhysicalMemory: pHalMirrorPhysicalMemory = null,
    public var HalEndOfBoot: pHalEndOfBoot = null,
    public var HalMirrorVerify: pHalMirrorVerify = null,
    public var HalGetCachedAcpiTable: pHalGetAcpiTable = null,
    public var HalSetPciErrorHandlerCallback: pHalSetPciErrorHandlerCallback = null,
    public var HalGetPrmCache: pHalGetPrmCache = null,
)

public class HAL_ERROR_INFO(
    public var Version: UInt = 0u,
    public var InitMaxSize: UInt = 0u,
    public var McaMaxSize: UInt = 0u,
    public var McaPreviousEventsCount: UInt = 0u,
    public var McaCorrectedEventsCount: UInt = 0u,
    public var McaKernelDeliveryFails: UInt = 0u,
    public var McaDriverDpcQueueFails: UInt = 0u,
    public var McaReserved: UInt = 0u,
    public var CmcMaxSize: UInt = 0u,
    public var CmcPollingInterval: UInt = 0u,
    public var CmcInterruptsCount: UInt = 0u,
    public var CmcKernelDeliveryFails: UInt = 0u,
    public var CmcDriverDpcQueueFails: UInt = 0u,
    public var CmcGetStateFails: UInt = 0u,
    public var CmcClearStateFails: UInt = 0u,
    public var CmcReserved: UInt = 0u,
    public var CmcLogId: ULong = 0uL,
    public var CpeMaxSize: UInt = 0u,
    public var CpePollingInterval: UInt = 0u,
    public var CpeInterruptsCount: UInt = 0u,
    public var CpeKernelDeliveryFails: UInt = 0u,
    public var CpeDriverDpcQueueFails: UInt = 0u,
    public var CpeGetStateFails: UInt = 0u,
    public var CpeClearStateFails: UInt = 0u,
    public var CpeInterruptSources: UInt = 0u,
    public var CpeLogId: ULong = 0uL,
    public var KernelReserved: ULongArray = ULongArray(4),
)

public data class HAL_MCA_INTERFACE(
    public var Lock: PHALMCAINTERFACELOCK = null,
    public var Unlock: PHALMCAINTERFACEUNLOCK = null,
    public var ReadRegister: PHALMCAINTERFACEREADREGISTER = null,
)

public data class HAL_PLATFORM_INFORMATION(public var PlatformFlags: UInt = 0u)

public data class HAL_POWER_INFORMATION(public var TBD: UInt = 0u)

public data class HAL_PROCESSOR_FEATURE(public var UsableFeatureBits: UInt = 0u)

public data class HAL_PROCESSOR_SPEED_INFORMATION(public var ProcessorSpeed: UInt = 0u)

public data class HARDWARE_COUNTER(
    public var Type: HARDWARE_COUNTER_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Index: ULong = 0uL,
)

public data class HWPROFILE_CHANGE_NOTIFICATION(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
)

public data class IMAGE_INFO(
    public var Anonymous: IMAGE_INFO_0 = IMAGE_INFO_0(),
    public var ImageBase: Long = 0L,
    public var ImageSelector: UInt = 0u,
    public var ImageSize: ULong = 0uL,
    public var ImageSectionNumber: UInt = 0u,
)

public data class IMAGE_INFO_0(public var Properties: UInt = 0u, public var Anonymous: IMAGE_INFO_0_0 = IMAGE_INFO_0_0())

public data class IMAGE_INFO_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_INFO_EX(
    public var Size: ULong = 0uL,
    public var ImageInfo: IMAGE_INFO = IMAGE_INFO(),
    public var FileObject: Long = 0L,
)

public data class INITIAL_PRIVILEGE_SET(
    public var PrivilegeCount: UInt = 0u,
    public var Control: UInt = 0u,
    public var Privilege: List<LUID_AND_ATTRIBUTES> = List(3) { LUID_AND_ATTRIBUTES() },
)

public data class INPUT_MAPPING_ELEMENT(public var InputMappingId: UInt = 0u)

public data class INTEL_CACHE_INFO_EAX(public var Ulong: UInt = 0u, public var Anonymous: INTEL_CACHE_INFO_EAX_0 = INTEL_CACHE_INFO_EAX_0())

public data class INTEL_CACHE_INFO_EAX_0(public var _bitfield: Int = 0)

public data class INTEL_CACHE_INFO_EBX(public var Ulong: UInt = 0u, public var Anonymous: INTEL_CACHE_INFO_EBX_0 = INTEL_CACHE_INFO_EBX_0())

public data class INTEL_CACHE_INFO_EBX_0(public var _bitfield: UInt = 0u)

public data class INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
)

public data class IOMMU_DEVICE_CREATION_CONFIGURATION(
    public var NextConfiguration: LIST_ENTRY = LIST_ENTRY(),
    public var ConfigType: IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = 0,
    public var Anonymous: IOMMU_DEVICE_CREATION_CONFIGURATION_0 = IOMMU_DEVICE_CREATION_CONFIGURATION_0(),
)

public data class IOMMU_DEVICE_CREATION_CONFIGURATION_0(public var Acpi: IOMMU_DEVICE_CREATION_CONFIGURATION_ACPI = IOMMU_DEVICE_CREATION_CONFIGURATION_ACPI(), public var DeviceId: Long = 0L)

public data class IOMMU_DEVICE_CREATION_CONFIGURATION_ACPI(public var InputMappingBase: UInt = 0u, public var MappingsCount: UInt = 0u)

public data class IOMMU_DMA_DOMAIN_CREATION_FLAGS(public var Anonymous: IOMMU_DMA_DOMAIN_CREATION_FLAGS_0 = IOMMU_DMA_DOMAIN_CREATION_FLAGS_0(), public var AsUlonglong: ULong = 0uL)

public data class IOMMU_DMA_DOMAIN_CREATION_FLAGS_0(public var _bitfield: ULong = 0uL)

public data class IOMMU_DMA_LOGICAL_ADDRESS_TOKEN(public var LogicalAddressBase: ULong = 0uL, public var Size: ULong = 0uL)

public data class IOMMU_DMA_LOGICAL_ADDRESS_TOKEN_MAPPED_SEGMENT(
    public var OwningToken: Long = 0L,
    public var Offset: ULong = 0uL,
    public var Size: ULong = 0uL,
)

public data class IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG(public var LogicalAllocatorType: IOMMU_DMA_LOGICAL_ALLOCATOR_TYPE = 0, public var Anonymous: IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0 = IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0())

public data class IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0(public var BuddyAllocatorConfig: IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0_0 = IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0_0())

public data class IOMMU_DMA_LOGICAL_ALLOCATOR_CONFIG_0_0(public var AddressWidth: UInt = 0u)

public data class IOMMU_DMA_RESERVED_REGION(
    public var RegionNext: Long = 0L,
    public var Base: ULong = 0uL,
    public var NumberOfPages: ULong = 0uL,
    public var ShouldMap: Boolean = false,
)

public data class IOMMU_INTERFACE_STATE_CHANGE(public var PresentFields: IOMMU_INTERFACE_STATE_CHANGE_FIELDS = IOMMU_INTERFACE_STATE_CHANGE_FIELDS(), public var AvailableDomainTypes: UInt = 0u)

public data class IOMMU_INTERFACE_STATE_CHANGE_FIELDS(public var Anonymous: IOMMU_INTERFACE_STATE_CHANGE_FIELDS_0 = IOMMU_INTERFACE_STATE_CHANGE_FIELDS_0(), public var AsULONG: UInt = 0u)

public data class IOMMU_INTERFACE_STATE_CHANGE_FIELDS_0(public var _bitfield: UInt = 0u)

public data class IOMMU_MAP_PHYSICAL_ADDRESS(public var MapType: IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = 0, public var Anonymous: IOMMU_MAP_PHYSICAL_ADDRESS_0 = IOMMU_MAP_PHYSICAL_ADDRESS_0())

public data class IOMMU_MAP_PHYSICAL_ADDRESS_0(
    public var Mdl: IOMMU_MAP_PHYSICAL_ADDRESS_0_0 = IOMMU_MAP_PHYSICAL_ADDRESS_0_0(),
    public var ContiguousRange: IOMMU_MAP_PHYSICAL_ADDRESS_0_1 = IOMMU_MAP_PHYSICAL_ADDRESS_0_1(),
    public var PfnArray: IOMMU_MAP_PHYSICAL_ADDRESS_0_2 = IOMMU_MAP_PHYSICAL_ADDRESS_0_2(),
)

public data class IOMMU_MAP_PHYSICAL_ADDRESS_0_1(public var Base: Long = 0L, public var Size: ULong = 0uL)

public data class IOMMU_MAP_PHYSICAL_ADDRESS_0_0(public var Mdl: Long = 0L)

public data class IOMMU_MAP_PHYSICAL_ADDRESS_0_2(public var PageFrame: Long = 0L, public var NumberOfPages: ULong = 0uL)

public data class IO_ATTRIBUTION_INFORMATION(
    public var Version: UInt = 0u,
    public var Flags: IO_ATTRIBUTION_INFORMATION_0 = IO_ATTRIBUTION_INFORMATION_0(),
    public var Length: UInt = 0u,
    public var ServiceStartTime: ULong = 0uL,
    public var CurrentTime: ULong = 0uL,
)

public data class IO_ATTRIBUTION_INFORMATION_0(public var Anonymous: IO_ATTRIBUTION_INFORMATION_0_0 = IO_ATTRIBUTION_INFORMATION_0_0(), public var AllFlags: UInt = 0u)

public data class IO_ATTRIBUTION_INFORMATION_0_0(public var _bitfield: UInt = 0u)

public data class IO_CONNECT_INTERRUPT_FULLY_SPECIFIED_PARAMETERS(
    public var PhysicalDeviceObject: Long = 0L,
    public var InterruptObject: Long = 0L,
    public var ServiceRoutine: PKSERVICE_ROUTINE = null,
    public var ServiceContext: Long = 0L,
    public var SpinLock: Long = 0L,
    public var SynchronizeIrql: UByte = 0u,
    public var FloatingSave: Boolean = false,
    public var ShareVector: Boolean = false,
    public var Vector: UInt = 0u,
    public var Irql: UByte = 0u,
    public var InterruptMode: KINTERRUPT_MODE = 0,
    public var ProcessorEnableMask: ULong = 0uL,
    public var Group: UShort = 0u,
)

public data class IO_CONNECT_INTERRUPT_LINE_BASED_PARAMETERS(
    public var PhysicalDeviceObject: Long = 0L,
    public var InterruptObject: Long = 0L,
    public var ServiceRoutine: PKSERVICE_ROUTINE = null,
    public var ServiceContext: Long = 0L,
    public var SpinLock: Long = 0L,
    public var SynchronizeIrql: UByte = 0u,
    public var FloatingSave: Boolean = false,
)

public data class IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS(
    public var PhysicalDeviceObject: Long = 0L,
    public var ConnectionContext: IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS_0 = IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS_0(),
    public var MessageServiceRoutine: PKMESSAGE_SERVICE_ROUTINE = null,
    public var ServiceContext: Long = 0L,
    public var SpinLock: Long = 0L,
    public var SynchronizeIrql: UByte = 0u,
    public var FloatingSave: Boolean = false,
    public var FallBackServiceRoutine: PKSERVICE_ROUTINE = null,
)

public data class IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS_0(
    public var Generic: Long = 0L,
    public var InterruptMessageTable: Long = 0L,
    public var InterruptObject: Long = 0L,
)

public data class IO_CONNECT_INTERRUPT_PARAMETERS(public var Version: UInt = 0u, public var Anonymous: IO_CONNECT_INTERRUPT_PARAMETERS_0 = IO_CONNECT_INTERRUPT_PARAMETERS_0())

public data class IO_CONNECT_INTERRUPT_PARAMETERS_0(
    public var FullySpecified: IO_CONNECT_INTERRUPT_FULLY_SPECIFIED_PARAMETERS = IO_CONNECT_INTERRUPT_FULLY_SPECIFIED_PARAMETERS(),
    public var LineBased: IO_CONNECT_INTERRUPT_LINE_BASED_PARAMETERS = IO_CONNECT_INTERRUPT_LINE_BASED_PARAMETERS(),
    public var MessageBased: IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS = IO_CONNECT_INTERRUPT_MESSAGE_BASED_PARAMETERS(),
)

public data class IO_CSQ(
    public var Type: UInt = 0u,
    public var CsqInsertIrp: PIO_CSQ_INSERT_IRP = null,
    public var CsqRemoveIrp: PIO_CSQ_REMOVE_IRP = null,
    public var CsqPeekNextIrp: PIO_CSQ_PEEK_NEXT_IRP = null,
    public var CsqAcquireLock: PIO_CSQ_ACQUIRE_LOCK = null,
    public var CsqReleaseLock: PIO_CSQ_RELEASE_LOCK = null,
    public var CsqCompleteCanceledIrp: PIO_CSQ_COMPLETE_CANCELED_IRP = null,
    public var ReservePointer: Long = 0L,
)

public data class IO_CSQ_IRP_CONTEXT(
    public var Type: UInt = 0u,
    public var Irp: Long = 0L,
    public var Csq: Long = 0L,
)

public data class IO_DISCONNECT_INTERRUPT_PARAMETERS(public var Version: UInt = 0u, public var ConnectionContext: IO_DISCONNECT_INTERRUPT_PARAMETERS_0 = IO_DISCONNECT_INTERRUPT_PARAMETERS_0())

public data class IO_DISCONNECT_INTERRUPT_PARAMETERS_0(
    public var Generic: Long = 0L,
    public var InterruptObject: PKINTERRUPT = 0L,
    public var InterruptMessageTable: Long = 0L,
)

public data class IO_DRIVER_CREATE_CONTEXT(
    public var Size: Short = 0,
    public var ExtraCreateParameter: Long = 0L,
    public var DeviceObjectHint: Long = 0L,
    public var TxnParameters: Long = 0L,
    public var SiloContext: PESILO = 0L,
)

public data class IO_ERROR_LOG_MESSAGE(
    public var Type: UShort = 0u,
    public var Size: UShort = 0u,
    public var DriverNameLength: UShort = 0u,
    public var TimeStamp: Long = 0L,
    public var DriverNameOffset: UInt = 0u,
    public var EntryData: IO_ERROR_LOG_PACKET = IO_ERROR_LOG_PACKET(),
)

public data class IO_ERROR_LOG_PACKET(
    public var MajorFunctionCode: UByte = 0u,
    public var RetryCount: UByte = 0u,
    public var DumpDataSize: UShort = 0u,
    public var NumberOfStrings: UShort = 0u,
    public var StringOffset: UShort = 0u,
    public var EventCategory: UShort = 0u,
    public var ErrorCode: NTSTATUS = 0,
    public var UniqueErrorValue: UInt = 0u,
    public var FinalStatus: NTSTATUS = 0,
    public var SequenceNumber: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var DeviceOffset: Long = 0L,
    public var DumpData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_ERROR_LOG_PACKET) return false
        if (this.MajorFunctionCode != other.MajorFunctionCode) return false
        if (this.RetryCount != other.RetryCount) return false
        if (this.DumpDataSize != other.DumpDataSize) return false
        if (this.NumberOfStrings != other.NumberOfStrings) return false
        if (this.StringOffset != other.StringOffset) return false
        if (this.EventCategory != other.EventCategory) return false
        if (this.ErrorCode != other.ErrorCode) return false
        if (this.UniqueErrorValue != other.UniqueErrorValue) return false
        if (this.FinalStatus != other.FinalStatus) return false
        if (this.SequenceNumber != other.SequenceNumber) return false
        if (this.IoControlCode != other.IoControlCode) return false
        if (this.DeviceOffset != other.DeviceOffset) return false
        if (!this.DumpData.contentEquals(other.DumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MajorFunctionCode.hashCode()
        result = 31 * result + this.RetryCount.hashCode()
        result = 31 * result + this.DumpDataSize.hashCode()
        result = 31 * result + this.NumberOfStrings.hashCode()
        result = 31 * result + this.StringOffset.hashCode()
        result = 31 * result + this.EventCategory.hashCode()
        result = 31 * result + this.ErrorCode.hashCode()
        result = 31 * result + this.UniqueErrorValue.hashCode()
        result = 31 * result + this.FinalStatus.hashCode()
        result = 31 * result + this.SequenceNumber.hashCode()
        result = 31 * result + this.IoControlCode.hashCode()
        result = 31 * result + this.DeviceOffset.hashCode()
        result = 31 * result + this.DumpData.contentHashCode()
        return result
    }
}

public data class IO_FOEXT_SHADOW_FILE(public var BackingFileObject: Long = 0L, public var BackingFltInstance: Long = 0L)

public data class IO_FOEXT_SILO_PARAMETERS(
    public var Length: UInt = 0u,
    public var Anonymous: IO_FOEXT_SILO_PARAMETERS_0 = IO_FOEXT_SILO_PARAMETERS_0(),
    public var SiloContext: PESILO = 0L,
)

public data class IO_FOEXT_SILO_PARAMETERS_0(public var Anonymous: IO_FOEXT_SILO_PARAMETERS_0_0 = IO_FOEXT_SILO_PARAMETERS_0_0(), public var Flags: UInt = 0u)
