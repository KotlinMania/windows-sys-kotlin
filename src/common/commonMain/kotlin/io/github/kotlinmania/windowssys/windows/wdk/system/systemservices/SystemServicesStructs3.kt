@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_BUFFER
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.power.SYSTEM_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.PROCESS_BASIC_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.CLIENT_ID

public data class PCI_EXPRESS_ERROR_SOURCE_ID_0(public var _bitfield1: UShort = 0u, public var _bitfield2: UShort = 0u)

public data class PCI_EXPRESS_EVENT_COLLECTOR_ENDPOINT_ASSOCIATION_CAPABILITY(public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(), public var AssociationBitmap: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var L1PmSsCapabilities: PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER = PCI_EXPRESS_L1_PM_SS_CAPABILITIES_REGISTER(),
    public var L1PmSsControl1: PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER = PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER(),
    public var L1PmSsControl2: PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER = PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER(),
)

public data class PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER(public var Anonymous: PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER_0 = PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CONTROL_1_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER(public var Anonymous: PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER_0 = PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_L1_PM_SS_CONTROL_2_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_LANE_ERROR_STATUS(public var LaneBitmap: UInt = 0u)

public data class PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER_0 = PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_LINK_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_LINK_CAPABILITIES_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_LINK_CAPABILITIES_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_LINK_CONTROL3(public var Anonymous: PCI_EXPRESS_LINK_CONTROL3_0 = PCI_EXPRESS_LINK_CONTROL3_0())

public data class PCI_EXPRESS_LINK_CONTROL3_0(public var Anonymous: PCI_EXPRESS_LINK_CONTROL3_0_0 = PCI_EXPRESS_LINK_CONTROL3_0_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_LINK_CONTROL3_0_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_LINK_CONTROL_2_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_CONTROL_2_REGISTER_0 = PCI_EXPRESS_LINK_CONTROL_2_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_LINK_CONTROL_2_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_LINK_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_CONTROL_REGISTER_0 = PCI_EXPRESS_LINK_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_LINK_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_LINK_QUIESCENT_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var PciExpressEnterLinkQuiescentMode: PPCI_EXPRESS_ENTER_LINK_QUIESCENT_MODE = null,
    public var PciExpressExitLinkQuiescentMode: PPCI_EXPRESS_EXIT_LINK_QUIESCENT_MODE = null,
)

public data class PCI_EXPRESS_LINK_STATUS_2_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_STATUS_2_REGISTER_0 = PCI_EXPRESS_LINK_STATUS_2_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_LINK_STATUS_2_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_LINK_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_LINK_STATUS_REGISTER_0 = PCI_EXPRESS_LINK_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_LINK_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_LTR_CAPABILITY(public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(), public var Latency: PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER = PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER())

public data class PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER(public var Anonymous: PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER_0 = PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_LTR_MAX_LATENCY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_NPEM_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capability: PCI_EXPRESS_NPEM_CAPABILITY_REGISTER = PCI_EXPRESS_NPEM_CAPABILITY_REGISTER(),
    public var Control: PCI_EXPRESS_NPEM_CONTROL_REGISTER = PCI_EXPRESS_NPEM_CONTROL_REGISTER(),
    public var Status: PCI_EXPRESS_NPEM_STATUS_REGISTER = PCI_EXPRESS_NPEM_STATUS_REGISTER(),
)

public data class PCI_EXPRESS_NPEM_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_NPEM_CAPABILITY_REGISTER_0 = PCI_EXPRESS_NPEM_CAPABILITY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_NPEM_CAPABILITY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_NPEM_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_NPEM_CONTROL_REGISTER_0 = PCI_EXPRESS_NPEM_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_NPEM_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_NPEM_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_NPEM_STATUS_REGISTER_0 = PCI_EXPRESS_NPEM_STATUS_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_NPEM_STATUS_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_PASID_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capability: PCI_EXPRESS_PASID_CAPABILITY_REGISTER = PCI_EXPRESS_PASID_CAPABILITY_REGISTER(),
    public var Control: PCI_EXPRESS_PASID_CONTROL_REGISTER = PCI_EXPRESS_PASID_CONTROL_REGISTER(),
)

public data class PCI_EXPRESS_PASID_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_PASID_CAPABILITY_REGISTER_0 = PCI_EXPRESS_PASID_CAPABILITY_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_PASID_CAPABILITY_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_PASID_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_PASID_CONTROL_REGISTER_0 = PCI_EXPRESS_PASID_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_PASID_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_PME_REQUESTOR_ID(public var Anonymous: PCI_EXPRESS_PME_REQUESTOR_ID_0 = PCI_EXPRESS_PME_REQUESTOR_ID_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_PME_REQUESTOR_ID_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_PRI_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Control: PCI_EXPRESS_PRI_CONTROL_REGISTER = PCI_EXPRESS_PRI_CONTROL_REGISTER(),
    public var Status: PCI_EXPRESS_PRI_STATUS_REGISTER = PCI_EXPRESS_PRI_STATUS_REGISTER(),
    public var PRCapacity: UInt = 0u,
    public var PRAllocation: UInt = 0u,
)

public data class PCI_EXPRESS_PRI_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_PRI_CONTROL_REGISTER_0 = PCI_EXPRESS_PRI_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_PRI_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_PRI_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_PRI_STATUS_REGISTER_0 = PCI_EXPRESS_PRI_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_PRI_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_PTM_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var PtmCapability: PCI_EXPRESS_PTM_CAPABILITY_REGISTER = PCI_EXPRESS_PTM_CAPABILITY_REGISTER(),
    public var PtmControl: PCI_EXPRESS_PTM_CONTROL_REGISTER = PCI_EXPRESS_PTM_CONTROL_REGISTER(),
)

public data class PCI_EXPRESS_PTM_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_PTM_CAPABILITY_REGISTER_0 = PCI_EXPRESS_PTM_CAPABILITY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_PTM_CAPABILITY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_PTM_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_PTM_CONTROL_REGISTER_0 = PCI_EXPRESS_PTM_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_PTM_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY(public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(), public var Entry: List<PCI_EXPRESS_RESIZABLE_BAR_ENTRY> = List(6) { PCI_EXPRESS_RESIZABLE_BAR_ENTRY() })

public data class PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER_0 = PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER_0 = PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_RESIZABLE_BAR_ENTRY(public var Capability: PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER = PCI_EXPRESS_RESIZABLE_BAR_CAPABILITY_REGISTER(), public var Control: PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER = PCI_EXPRESS_RESIZABLE_BAR_CONTROL_REGISTER())

public data class PCI_EXPRESS_ROOTPORT_AER_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var UncorrectableErrorStatus: PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS = PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS(),
    public var UncorrectableErrorMask: PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK = PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK(),
    public var UncorrectableErrorSeverity: PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY = PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY(),
    public var CorrectableErrorStatus: PCI_EXPRESS_CORRECTABLE_ERROR_STATUS = PCI_EXPRESS_CORRECTABLE_ERROR_STATUS(),
    public var CorrectableErrorMask: PCI_EXPRESS_CORRECTABLE_ERROR_MASK = PCI_EXPRESS_CORRECTABLE_ERROR_MASK(),
    public var CapabilitiesAndControl: PCI_EXPRESS_AER_CAPABILITIES = PCI_EXPRESS_AER_CAPABILITIES(),
    public var HeaderLog: UIntArray = UIntArray(4),
    public var RootErrorCommand: PCI_EXPRESS_ROOT_ERROR_COMMAND = PCI_EXPRESS_ROOT_ERROR_COMMAND(),
    public var RootErrorStatus: PCI_EXPRESS_ROOT_ERROR_STATUS = PCI_EXPRESS_ROOT_ERROR_STATUS(),
    public var ErrorSourceId: PCI_EXPRESS_ERROR_SOURCE_ID = PCI_EXPRESS_ERROR_SOURCE_ID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_ROOTPORT_AER_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.UncorrectableErrorStatus != other.UncorrectableErrorStatus) return false
        if (this.UncorrectableErrorMask != other.UncorrectableErrorMask) return false
        if (this.UncorrectableErrorSeverity != other.UncorrectableErrorSeverity) return false
        if (this.CorrectableErrorStatus != other.CorrectableErrorStatus) return false
        if (this.CorrectableErrorMask != other.CorrectableErrorMask) return false
        if (this.CapabilitiesAndControl != other.CapabilitiesAndControl) return false
        if (!this.HeaderLog.contentEquals(other.HeaderLog)) return false
        if (this.RootErrorCommand != other.RootErrorCommand) return false
        if (this.RootErrorStatus != other.RootErrorStatus) return false
        if (this.ErrorSourceId != other.ErrorSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.UncorrectableErrorStatus.hashCode()
        result = 31 * result + this.UncorrectableErrorMask.hashCode()
        result = 31 * result + this.UncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.CorrectableErrorStatus.hashCode()
        result = 31 * result + this.CorrectableErrorMask.hashCode()
        result = 31 * result + this.CapabilitiesAndControl.hashCode()
        result = 31 * result + this.HeaderLog.contentHashCode()
        result = 31 * result + this.RootErrorCommand.hashCode()
        result = 31 * result + this.RootErrorStatus.hashCode()
        result = 31 * result + this.ErrorSourceId.hashCode()
        return result
    }
}

public data class PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ROOT_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_ROOT_CONTROL_REGISTER_0 = PCI_EXPRESS_ROOT_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_ROOT_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ROOT_ERROR_COMMAND(public var Anonymous: PCI_EXPRESS_ROOT_ERROR_COMMAND_0 = PCI_EXPRESS_ROOT_ERROR_COMMAND_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_ROOT_ERROR_COMMAND_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_ROOT_ERROR_STATUS(public var Anonymous: PCI_EXPRESS_ROOT_ERROR_STATUS_0 = PCI_EXPRESS_ROOT_ERROR_STATUS_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_ROOT_ERROR_STATUS_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_ROOT_PORT_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var ReadConfigSpace: PPCI_EXPRESS_ROOT_PORT_READ_CONFIG_SPACE = null,
    public var WriteConfigSpace: PPCI_EXPRESS_ROOT_PORT_WRITE_CONFIG_SPACE = null,
)

public data class PCI_EXPRESS_ROOT_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_ROOT_STATUS_REGISTER_0 = PCI_EXPRESS_ROOT_STATUS_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_ROOT_STATUS_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SECONDARY_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var LinkControl3: PCI_EXPRESS_LINK_CONTROL3 = PCI_EXPRESS_LINK_CONTROL3(),
    public var LaneErrorStatus: PCI_EXPRESS_LANE_ERROR_STATUS = PCI_EXPRESS_LANE_ERROR_STATUS(),
)

public data class PCI_EXPRESS_SEC_AER_CAPABILITIES(public var Anonymous: PCI_EXPRESS_SEC_AER_CAPABILITIES_0 = PCI_EXPRESS_SEC_AER_CAPABILITIES_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SEC_AER_CAPABILITIES_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK(public var Anonymous: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK_0 = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY(public var Anonymous: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY_0 = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS(public var Anonymous: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS_0 = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SERIAL_NUMBER_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var LowSerialNumber: UInt = 0u,
    public var HighSerialNumber: UInt = 0u,
)

public data class PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SLOT_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_SLOT_CONTROL_REGISTER_0 = PCI_EXPRESS_SLOT_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_SLOT_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_SLOT_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_SLOT_STATUS_REGISTER_0 = PCI_EXPRESS_SLOT_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_SLOT_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public class PCI_EXPRESS_SRIOV_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var SRIOVCapabilities: PCI_EXPRESS_SRIOV_CAPS = PCI_EXPRESS_SRIOV_CAPS(),
    public var SRIOVControl: PCI_EXPRESS_SRIOV_CONTROL = PCI_EXPRESS_SRIOV_CONTROL(),
    public var SRIOVStatus: PCI_EXPRESS_SRIOV_STATUS = PCI_EXPRESS_SRIOV_STATUS(),
    public var InitialVFs: UShort = 0u,
    public var TotalVFs: UShort = 0u,
    public var NumVFs: UShort = 0u,
    public var FunctionDependencyLink: UByte = 0u,
    public var RsvdP1: UByte = 0u,
    public var FirstVFOffset: UShort = 0u,
    public var VFStride: UShort = 0u,
    public var RsvdP2: UShort = 0u,
    public var VFDeviceId: UShort = 0u,
    public var SupportedPageSizes: UInt = 0u,
    public var SystemPageSize: UInt = 0u,
    public var BaseAddresses: UIntArray = UIntArray(6),
    public var VFMigrationStateArrayOffset: PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY = PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY(),
)

public data class PCI_EXPRESS_SRIOV_CAPS(public var Anonymous: PCI_EXPRESS_SRIOV_CAPS_0 = PCI_EXPRESS_SRIOV_CAPS_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SRIOV_CAPS_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SRIOV_CONTROL(public var Anonymous: PCI_EXPRESS_SRIOV_CONTROL_0 = PCI_EXPRESS_SRIOV_CONTROL_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_SRIOV_CONTROL_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY(public var Anonymous: PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY_0 = PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_SRIOV_MIGRATION_STATE_ARRAY_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_SRIOV_STATUS(public var Anonymous: PCI_EXPRESS_SRIOV_STATUS_0 = PCI_EXPRESS_SRIOV_STATUS_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_SRIOV_STATUS_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_TPH_REQUESTER_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var RequesterCapability: PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER = PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER(),
    public var RequesterControl: PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER = PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER(),
)

public data class PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER_0 = PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_TPH_REQUESTER_CAPABILITY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER_0 = PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_TPH_REQUESTER_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_TPH_ST_TABLE_ENTRY(public var Anonymous: PCI_EXPRESS_TPH_ST_TABLE_ENTRY_0 = PCI_EXPRESS_TPH_ST_TABLE_ENTRY_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_TPH_ST_TABLE_ENTRY_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK(public var Anonymous: PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK_0 = PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY(public var Anonymous: PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY_0 = PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS(public var Anonymous: PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS_0 = PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_VENDOR_SPECIFIC_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var VsecId: UShort = 0u,
    public var _bitfield: UShort = 0u,
)

public data class PCI_EXPRESS_VIRTUAL_CHANNEL_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capabilities1: VIRTUAL_CHANNEL_CAPABILITIES1 = VIRTUAL_CHANNEL_CAPABILITIES1(),
    public var Capabilities2: VIRTUAL_CHANNEL_CAPABILITIES2 = VIRTUAL_CHANNEL_CAPABILITIES2(),
    public var Control: VIRTUAL_CHANNEL_CONTROL = VIRTUAL_CHANNEL_CONTROL(),
    public var Status: VIRTUAL_CHANNEL_STATUS = VIRTUAL_CHANNEL_STATUS(),
    public var Resource: List<VIRTUAL_RESOURCE> = List(8) { VIRTUAL_RESOURCE() },
)

public data class PCI_FIRMWARE_BUS_CAPS(
    public var Type: UShort = 0u,
    public var Length: UShort = 0u,
    public var Anonymous: PCI_FIRMWARE_BUS_CAPS_0 = PCI_FIRMWARE_BUS_CAPS_0(),
    public var CurrentSpeedAndMode: UByte = 0u,
    public var SupportedSpeedsAndModesLowByte: UByte = 0u,
    public var SupportedSpeedsAndModesHighByte: UByte = 0u,
    public var Voltage: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_FIRMWARE_BUS_CAPS) return false
        if (this.Type != other.Type) return false
        if (this.Length != other.Length) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.CurrentSpeedAndMode != other.CurrentSpeedAndMode) return false
        if (this.SupportedSpeedsAndModesLowByte != other.SupportedSpeedsAndModesLowByte) return false
        if (this.SupportedSpeedsAndModesHighByte != other.SupportedSpeedsAndModesHighByte) return false
        if (this.Voltage != other.Voltage) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.CurrentSpeedAndMode.hashCode()
        result = 31 * result + this.SupportedSpeedsAndModesLowByte.hashCode()
        result = 31 * result + this.SupportedSpeedsAndModesHighByte.hashCode()
        result = 31 * result + this.Voltage.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class PCI_FIRMWARE_BUS_CAPS_0(public var _bitfield: UByte = 0u)

public data class PCI_FIRMWARE_BUS_CAPS_RETURN_BUFFER(
    public var Version: UShort = 0u,
    public var Status: UShort = 0u,
    public var Length: UInt = 0u,
    public var Caps: PCI_FIRMWARE_BUS_CAPS = PCI_FIRMWARE_BUS_CAPS(),
)

public data class PCI_FPB_CAPABILITIES_REGISTER(public var Anonymous: PCI_FPB_CAPABILITIES_REGISTER_0 = PCI_FPB_CAPABILITIES_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_CAPABILITIES_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_CAPABILITY(
    public var Header: PCI_FPB_CAPABILITY_HEADER = PCI_FPB_CAPABILITY_HEADER(),
    public var CapabilitiesRegister: PCI_FPB_CAPABILITIES_REGISTER = PCI_FPB_CAPABILITIES_REGISTER(),
    public var RidVectorControl1Register: PCI_FPB_RID_VECTOR_CONTROL1_REGISTER = PCI_FPB_RID_VECTOR_CONTROL1_REGISTER(),
    public var RidVectorControl2Register: PCI_FPB_RID_VECTOR_CONTROL2_REGISTER = PCI_FPB_RID_VECTOR_CONTROL2_REGISTER(),
    public var MemLowVectorControlRegister: PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER = PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER(),
    public var MemHighVectorControl1Register: PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER = PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER(),
    public var MemHighVectorControl2Register: PCI_FPB_MEM_HIGH_VECTOR_CONTROL2_REGISTER = PCI_FPB_MEM_HIGH_VECTOR_CONTROL2_REGISTER(),
    public var VectorAccessControlRegister: PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER = PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER(),
    public var VectorAccessDataRegister: PCI_FPB_VECTOR_ACCESS_DATA_REGISTER = PCI_FPB_VECTOR_ACCESS_DATA_REGISTER(),
)

public data class PCI_FPB_CAPABILITY_HEADER(public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(), public var Reserved: UShort = 0u)

public data class PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER(public var Anonymous: PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER_0 = PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_MEM_HIGH_VECTOR_CONTROL1_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_MEM_HIGH_VECTOR_CONTROL2_REGISTER(public var MemHighVectorStartUpper: UInt = 0u)

public data class PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER(public var Anonymous: PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER_0 = PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_MEM_LOW_VECTOR_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_RID_VECTOR_CONTROL1_REGISTER(public var Anonymous: PCI_FPB_RID_VECTOR_CONTROL1_REGISTER_0 = PCI_FPB_RID_VECTOR_CONTROL1_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_RID_VECTOR_CONTROL1_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_RID_VECTOR_CONTROL2_REGISTER(public var Anonymous: PCI_FPB_RID_VECTOR_CONTROL2_REGISTER_0 = PCI_FPB_RID_VECTOR_CONTROL2_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_RID_VECTOR_CONTROL2_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER(public var Anonymous: PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER_0 = PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_FPB_VECTOR_ACCESS_CONTROL_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_FPB_VECTOR_ACCESS_DATA_REGISTER(public var VectorAccessData: UInt = 0u)

public data class PCI_MSIX_TABLE_CONFIG_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetTableEntry: PPCI_MSIX_SET_ENTRY = null,
    public var MaskTableEntry: PPCI_MSIX_MASKUNMASK_ENTRY = null,
    public var UnmaskTableEntry: PPCI_MSIX_MASKUNMASK_ENTRY = null,
    public var GetTableEntry: PPCI_MSIX_GET_ENTRY = null,
    public var GetTableSize: PPCI_MSIX_GET_TABLE_SIZE = null,
)

public data class PCI_PMC(public var _bitfield: UByte = 0u, public var Support: PCI_PMC_0 = PCI_PMC_0())

public data class PCI_PMC_0(public var _bitfield: UByte = 0u)

public data class PCI_PMCSR(public var _bitfield: UShort = 0u)

public data class PCI_PMCSR_BSE(public var _bitfield: UByte = 0u)

public data class PCI_PM_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var PMC: PCI_PM_CAPABILITY_0 = PCI_PM_CAPABILITY_0(),
    public var PMCSR: PCI_PM_CAPABILITY_1 = PCI_PM_CAPABILITY_1(),
    public var PMCSR_BSE: PCI_PM_CAPABILITY_2 = PCI_PM_CAPABILITY_2(),
    public var Data: UByte = 0u,
)

public data class PCI_PM_CAPABILITY_2(public var BridgeSupport: PCI_PMCSR_BSE = PCI_PMCSR_BSE(), public var AsUCHAR: UByte = 0u)

public data class PCI_PM_CAPABILITY_1(public var ControlStatus: PCI_PMCSR = PCI_PMCSR(), public var AsUSHORT: UShort = 0u)

public data class PCI_PM_CAPABILITY_0(public var Capabilities: PCI_PMC = PCI_PMC(), public var AsUSHORT: UShort = 0u)

public data class PCI_ROOT_BUS_HARDWARE_CAPABILITY(
    public var SecondaryInterface: PCI_HARDWARE_INTERFACE = 0,
    public var Anonymous: PCI_ROOT_BUS_HARDWARE_CAPABILITY_0 = PCI_ROOT_BUS_HARDWARE_CAPABILITY_0(),
    public var OscFeatureSupport: PCI_ROOT_BUS_OSC_SUPPORT_FIELD = PCI_ROOT_BUS_OSC_SUPPORT_FIELD(),
    public var OscControlRequest: PCI_ROOT_BUS_OSC_CONTROL_FIELD = PCI_ROOT_BUS_OSC_CONTROL_FIELD(),
    public var OscControlGranted: PCI_ROOT_BUS_OSC_CONTROL_FIELD = PCI_ROOT_BUS_OSC_CONTROL_FIELD(),
)

public data class PCI_ROOT_BUS_HARDWARE_CAPABILITY_0(
    public var BusCapabilitiesFound: Boolean = false,
    public var CurrentSpeedAndMode: UInt = 0u,
    public var SupportedSpeedsAndModes: UInt = 0u,
    public var DeviceIDMessagingCapable: Boolean = false,
    public var SecondaryBusWidth: PCI_BUS_WIDTH = 0,
)

public data class PCI_ROOT_BUS_OSC_CONTROL_FIELD(public var u: PCI_ROOT_BUS_OSC_CONTROL_FIELD_0 = PCI_ROOT_BUS_OSC_CONTROL_FIELD_0())

public data class PCI_ROOT_BUS_OSC_CONTROL_FIELD_0(public var Anonymous: PCI_ROOT_BUS_OSC_CONTROL_FIELD_0_0 = PCI_ROOT_BUS_OSC_CONTROL_FIELD_0_0(), public var AsULONG: UInt = 0u)

public data class PCI_ROOT_BUS_OSC_CONTROL_FIELD_0_0(public var _bitfield: UInt = 0u)

public data class PCI_ROOT_BUS_OSC_SUPPORT_FIELD(public var u: PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0 = PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0())

public data class PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0(public var Anonymous: PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0_0 = PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0_0(), public var AsULONG: UInt = 0u)

public data class PCI_ROOT_BUS_OSC_SUPPORT_FIELD_0_0(public var _bitfield: UInt = 0u)

public data class PCI_SECURITY_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetAccessControlServices: PPCI_SET_ACS = null,
)

public data class PCI_SECURITY_INTERFACE2(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var Flags: UInt = 0u,
    public var SupportedScenarios: UInt = 0u,
    public var SetAccessControlServices: PPCI_SET_ACS2 = null,
)

public data class PCI_SEGMENT_BUS_NUMBER(public var u: PCI_SEGMENT_BUS_NUMBER_0 = PCI_SEGMENT_BUS_NUMBER_0())

public data class PCI_SEGMENT_BUS_NUMBER_0(public var bits: PCI_SEGMENT_BUS_NUMBER_0_0 = PCI_SEGMENT_BUS_NUMBER_0_0(), public var AsULONG: UInt = 0u)

public data class PCI_SEGMENT_BUS_NUMBER_0_0(public var _bitfield: UInt = 0u)

public data class PCI_SLOT_NUMBER(public var u: PCI_SLOT_NUMBER_0 = PCI_SLOT_NUMBER_0())

public data class PCI_SLOT_NUMBER_0(public var bits: PCI_SLOT_NUMBER_0_0 = PCI_SLOT_NUMBER_0_0(), public var AsULONG: UInt = 0u)

public data class PCI_SLOT_NUMBER_0_0(public var _bitfield: UInt = 0u)

public data class PCI_SUBSYSTEM_IDS_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var Reserved: UShort = 0u,
    public var SubVendorID: UShort = 0u,
    public var SubSystemID: UShort = 0u,
)

public data class PCI_VENDOR_SPECIFIC_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var VscLength: UByte = 0u,
    public var VendorSpecific: UByte = 0u,
)

public data class PCI_VIRTUALIZATION_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetVirtualFunctionData: PSET_VIRTUAL_DEVICE_DATA = null,
    public var GetVirtualFunctionData: PGET_VIRTUAL_DEVICE_DATA = null,
    public var GetLocation: PGET_VIRTUAL_DEVICE_LOCATION = null,
    public var GetResources: PGET_VIRTUAL_DEVICE_RESOURCES = null,
    public var EnableVirtualization: PENABLE_VIRTUALIZATION = null,
    public var GetVirtualFunctionProbedBars: PGET_VIRTUAL_FUNCTION_PROBED_BARS = null,
)

public data class PCI_X_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var Command: PCI_X_CAPABILITY_0 = PCI_X_CAPABILITY_0(),
    public var Status: PCI_X_CAPABILITY_1 = PCI_X_CAPABILITY_1(),
)

public data class PCI_X_CAPABILITY_0(public var bits: PCI_X_CAPABILITY_0_0 = PCI_X_CAPABILITY_0_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_X_CAPABILITY_0_0(public var _bitfield: UShort = 0u)

public data class PCI_X_CAPABILITY_1(public var bits: PCI_X_CAPABILITY_1_0 = PCI_X_CAPABILITY_1_0(), public var AsULONG: UInt = 0u)

public data class PCI_X_CAPABILITY_1_0(public var _bitfield: UInt = 0u)

public data class PCW_CALLBACK_INFORMATION(
    public var AddCounter: PCW_COUNTER_INFORMATION = PCW_COUNTER_INFORMATION(),
    public var RemoveCounter: PCW_COUNTER_INFORMATION = PCW_COUNTER_INFORMATION(),
    public var EnumerateInstances: PCW_MASK_INFORMATION = PCW_MASK_INFORMATION(),
    public var CollectData: PCW_MASK_INFORMATION = PCW_MASK_INFORMATION(),
)

public data class PCW_COUNTER_DESCRIPTOR(
    public var Id: UShort = 0u,
    public var StructIndex: UShort = 0u,
    public var Offset: UShort = 0u,
    public var Size: UShort = 0u,
)

public data class PCW_COUNTER_INFORMATION(public var CounterMask: ULong = 0uL, public var InstanceMask: Long = 0L)

public data class PCW_DATA(public var Data: Long = 0L, public var Size: UInt = 0u)

public data class PCW_MASK_INFORMATION(
    public var CounterMask: ULong = 0uL,
    public var InstanceMask: Long = 0L,
    public var InstanceId: UInt = 0u,
    public var CollectMultiple: Boolean = false,
    public var Buffer: PPCW_BUFFER = 0L,
    public var CancelEvent: Long = 0L,
)

public data class PCW_REGISTRATION_INFORMATION(
    public var Version: UInt = 0u,
    public var Name: Long = 0L,
    public var CounterCount: UInt = 0u,
    public var Counters: Long = 0L,
    public var Callback: PPCW_CALLBACK = null,
    public var CallbackContext: Long = 0L,
    public var Flags: PCW_REGISTRATION_FLAGS = 0,
)

public data class PHYSICAL_COUNTER_EVENT_BUFFER_CONFIGURATION(
    public var OverflowHandler: PPHYSICAL_COUNTER_EVENT_BUFFER_OVERFLOW_HANDLER = null,
    public var CustomEventBufferEntrySize: UInt = 0u,
    public var EventThreshold: UInt = 0u,
)

public data class PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR(
    public var Type: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = 0,
    public var Flags: UInt = 0u,
    public var u: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0 = PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0(),
)

public data class PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0(
    public var CounterIndex: UInt = 0u,
    public var Range: PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0_0 = PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0_0(),
    public var OverflowHandler: PPHYSICAL_COUNTER_OVERFLOW_HANDLER = null,
    public var EventBufferConfiguration: PHYSICAL_COUNTER_EVENT_BUFFER_CONFIGURATION = PHYSICAL_COUNTER_EVENT_BUFFER_CONFIGURATION(),
    public var IdentificationTag: UInt = 0u,
)

public data class PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_0_0(public var Begin: UInt = 0u, public var End: UInt = 0u)

public data class PHYSICAL_COUNTER_RESOURCE_LIST(public var Count: UInt = 0u, public var Descriptors: List<PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR> = List(1) { PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR() })

public data class PHYSICAL_MEMORY_RANGE(public var BaseAddress: Long = 0L, public var NumberOfBytes: Long = 0L)

public data class PLUGPLAY_NOTIFICATION_HEADER(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
)

public data class PM_DISPATCH_TABLE(
    public var Signature: UInt = 0u,
    public var Version: UInt = 0u,
    public var Function: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PM_DISPATCH_TABLE) return false
        if (this.Signature != other.Signature) return false
        if (this.Version != other.Version) return false
        if (!this.Function.contentEquals(other.Function)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Function.contentHashCode()
        return result
    }
}

public data class PNP_BUS_INFORMATION(
    public var BusTypeGuid: GUID = GUID(),
    public var LegacyBusType: INTERFACE_TYPE = 0,
    public var BusNumber: UInt = 0u,
)

public data class PNP_EXTENDED_ADDRESS_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var QueryExtendedAddress: PQUERYEXTENDEDADDRESS = null,
)

public data class PNP_LOCATION_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var GetLocationString: PGET_LOCATION_STRING = null,
)

public data class PNP_REPLACE_DRIVER_INTERFACE(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Unload: PREPLACE_UNLOAD = null,
    public var BeginReplace: PREPLACE_BEGIN = null,
    public var EndReplace: PREPLACE_END = null,
    public var MirrorPhysicalMemory: PREPLACE_MIRROR_PHYSICAL_MEMORY = null,
    public var SetProcessorId: PREPLACE_SET_PROCESSOR_ID = null,
    public var Swap: PREPLACE_SWAP = null,
    public var InitiateHardwareMirror: PREPLACE_INITIATE_HARDWARE_MIRROR = null,
    public var MirrorPlatformMemory: PREPLACE_MIRROR_PLATFORM_MEMORY = null,
    public var GetMemoryDestination: PREPLACE_GET_MEMORY_DESTINATION = null,
    public var EnableDisableHardwareQuiesce: PREPLACE_ENABLE_DISABLE_HARDWARE_QUIESCE = null,
)

public data class PNP_REPLACE_MEMORY_LIST(
    public var AllocatedCount: UInt = 0u,
    public var Count: UInt = 0u,
    public var TotalLength: ULong = 0uL,
    public var Ranges: List<PNP_REPLACE_MEMORY_LIST_0> = List(1) { PNP_REPLACE_MEMORY_LIST_0() },
)

public data class PNP_REPLACE_MEMORY_LIST_0(public var Address: Long = 0L, public var Length: ULong = 0uL)

public data class PNP_REPLACE_PARAMETERS(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var Target: ULong = 0uL,
    public var Spare: ULong = 0uL,
    public var TargetProcessors: Long = 0L,
    public var SpareProcessors: Long = 0L,
    public var TargetMemory: Long = 0L,
    public var SpareMemory: Long = 0L,
    public var MapMemory: PREPLACE_MAP_MEMORY = null,
)

public data class PNP_REPLACE_PROCESSOR_LIST(
    public var Affinity: Long = 0L,
    public var GroupCount: UInt = 0u,
    public var AllocatedCount: UInt = 0u,
    public var Count: UInt = 0u,
    public var ApicIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PNP_REPLACE_PROCESSOR_LIST) return false
        if (this.Affinity != other.Affinity) return false
        if (this.GroupCount != other.GroupCount) return false
        if (this.AllocatedCount != other.AllocatedCount) return false
        if (this.Count != other.Count) return false
        if (!this.ApicIds.contentEquals(other.ApicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Affinity.hashCode()
        result = 31 * result + this.GroupCount.hashCode()
        result = 31 * result + this.AllocatedCount.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.ApicIds.contentHashCode()
        return result
    }
}

public data class PNP_REPLACE_PROCESSOR_LIST_V1(
    public var AffinityMask: ULong = 0uL,
    public var AllocatedCount: UInt = 0u,
    public var Count: UInt = 0u,
    public var ApicIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PNP_REPLACE_PROCESSOR_LIST_V1) return false
        if (this.AffinityMask != other.AffinityMask) return false
        if (this.AllocatedCount != other.AllocatedCount) return false
        if (this.Count != other.Count) return false
        if (!this.ApicIds.contentEquals(other.ApicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AffinityMask.hashCode()
        result = 31 * result + this.AllocatedCount.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.ApicIds.contentHashCode()
        return result
    }
}

public data class POOLED_USAGE_AND_LIMITS(
    public var PeakPagedPoolUsage: ULong = 0uL,
    public var PagedPoolUsage: ULong = 0uL,
    public var PagedPoolLimit: ULong = 0uL,
    public var PeakNonPagedPoolUsage: ULong = 0uL,
    public var NonPagedPoolUsage: ULong = 0uL,
    public var NonPagedPoolLimit: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PagefileLimit: ULong = 0uL,
)

public data class POOL_CREATE_EXTENDED_PARAMS(public var Version: UInt = 0u)

public data class POOL_EXTENDED_PARAMETER(public var Anonymous1: POOL_EXTENDED_PARAMETER_0 = POOL_EXTENDED_PARAMETER_0(), public var Anonymous2: POOL_EXTENDED_PARAMETER_1 = POOL_EXTENDED_PARAMETER_1())

public data class POOL_EXTENDED_PARAMETER_0(public var _bitfield: ULong = 0uL)

public data class POOL_EXTENDED_PARAMETER_1(
    public var Reserved2: ULong = 0uL,
    public var Reserved3: Long = 0L,
    public var Priority: EX_POOL_PRIORITY = 0,
    public var SecurePoolParams: Long = 0L,
    public var PreferredNode: UInt = 0u,
)

public data class POOL_EXTENDED_PARAMS_SECURE_POOL(
    public var SecurePoolHandle: HANDLE = 0L,
    public var Buffer: Long = 0L,
    public var Cookie: ULong = 0uL,
    public var SecurePoolFlags: UInt = 0u,
)

public data class POWER_MONITOR_INVOCATION(public var Console: Boolean = false, public var RequestReason: POWER_MONITOR_REQUEST_REASON = 0)

public data class POWER_PLATFORM_INFORMATION(public var AoAc: Boolean = false)

public data class POWER_SEQUENCE(
    public var SequenceD1: UInt = 0u,
    public var SequenceD2: UInt = 0u,
    public var SequenceD3: UInt = 0u,
)

public data class POWER_SESSION_CONNECT(public var Connected: Boolean = false, public var Console: Boolean = false)

public data class POWER_SESSION_RIT_STATE(public var Active: Boolean = false, public var LastInputTime: ULong = 0uL)

public data class POWER_SESSION_TIMEOUTS(public var InputTimeout: UInt = 0u, public var DisplayTimeout: UInt = 0u)

public data class POWER_SESSION_WINLOGON(
    public var SessionId: UInt = 0u,
    public var Console: Boolean = false,
    public var Locked: Boolean = false,
)

public data class POWER_STATE(public var SystemState: SYSTEM_POWER_STATE = 0, public var DeviceState: DEVICE_POWER_STATE = 0)

public data class POWER_THROTTLING_PROCESS_STATE(
    public var Version: UInt = 0u,
    public var ControlMask: UInt = 0u,
    public var StateMask: UInt = 0u,
)

public data class POWER_THROTTLING_THREAD_STATE(
    public var Version: UInt = 0u,
    public var ControlMask: UInt = 0u,
    public var StateMask: UInt = 0u,
)

public data class PO_FX_COMPONENT_IDLE_STATE(
    public var TransitionLatency: ULong = 0uL,
    public var ResidencyRequirement: ULong = 0uL,
    public var NominalPower: UInt = 0u,
)

public data class PO_FX_COMPONENT_PERF_INFO(public var PerfStateSetsCount: UInt = 0u, public var PerfStateSets: List<PO_FX_COMPONENT_PERF_SET> = List(1) { PO_FX_COMPONENT_PERF_SET() })

public data class PO_FX_COMPONENT_PERF_SET(
    public var Name: UNICODE_STRING = UNICODE_STRING(),
    public var Flags: ULong = 0uL,
    public var Unit: PO_FX_PERF_STATE_UNIT = 0,
    public var Type: PO_FX_PERF_STATE_TYPE = 0,
    public var Anonymous: PO_FX_COMPONENT_PERF_SET_0 = PO_FX_COMPONENT_PERF_SET_0(),
)

public data class PO_FX_COMPONENT_PERF_SET_0(public var Discrete: PO_FX_COMPONENT_PERF_SET_0_0 = PO_FX_COMPONENT_PERF_SET_0_0(), public var Range: PO_FX_COMPONENT_PERF_SET_0_1 = PO_FX_COMPONENT_PERF_SET_0_1())

public data class PO_FX_COMPONENT_PERF_SET_0_0(public var Count: UInt = 0u, public var States: Long = 0L)

public data class PO_FX_COMPONENT_PERF_SET_0_1(public var Minimum: ULong = 0uL, public var Maximum: ULong = 0uL)

public data class PO_FX_COMPONENT_V1(
    public var Id: GUID = GUID(),
    public var IdleStateCount: UInt = 0u,
    public var DeepestWakeableIdleState: UInt = 0u,
    public var IdleStates: Long = 0L,
)

public data class PO_FX_COMPONENT_V2(
    public var Id: GUID = GUID(),
    public var Flags: ULong = 0uL,
    public var DeepestWakeableIdleState: UInt = 0u,
    public var IdleStateCount: UInt = 0u,
    public var IdleStates: Long = 0L,
    public var ProviderCount: UInt = 0u,
    public var Providers: Long = 0L,
)

public data class PO_FX_DEVICE_V1(
    public var Version: UInt = 0u,
    public var ComponentCount: UInt = 0u,
    public var ComponentActiveConditionCallback: PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACK = null,
    public var ComponentIdleConditionCallback: PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACK = null,
    public var ComponentIdleStateCallback: PPO_FX_COMPONENT_IDLE_STATE_CALLBACK = null,
    public var DevicePowerRequiredCallback: PPO_FX_DEVICE_POWER_REQUIRED_CALLBACK = null,
    public var DevicePowerNotRequiredCallback: PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACK = null,
    public var PowerControlCallback: PPO_FX_POWER_CONTROL_CALLBACK = null,
    public var DeviceContext: Long = 0L,
    public var Components: List<PO_FX_COMPONENT_V1> = List(1) { PO_FX_COMPONENT_V1() },
)

public data class PO_FX_DEVICE_V2(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var ComponentActiveConditionCallback: PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACK = null,
    public var ComponentIdleConditionCallback: PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACK = null,
    public var ComponentIdleStateCallback: PPO_FX_COMPONENT_IDLE_STATE_CALLBACK = null,
    public var DevicePowerRequiredCallback: PPO_FX_DEVICE_POWER_REQUIRED_CALLBACK = null,
    public var DevicePowerNotRequiredCallback: PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACK = null,
    public var PowerControlCallback: PPO_FX_POWER_CONTROL_CALLBACK = null,
    public var DeviceContext: Long = 0L,
    public var ComponentCount: UInt = 0u,
    public var Components: List<PO_FX_COMPONENT_V2> = List(1) { PO_FX_COMPONENT_V2() },
)

public data class PO_FX_DEVICE_V3(
    public var Version: UInt = 0u,
    public var Flags: ULong = 0uL,
    public var ComponentActiveConditionCallback: PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACK = null,
    public var ComponentIdleConditionCallback: PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACK = null,
    public var ComponentIdleStateCallback: PPO_FX_COMPONENT_IDLE_STATE_CALLBACK = null,
    public var DevicePowerRequiredCallback: PPO_FX_DEVICE_POWER_REQUIRED_CALLBACK = null,
    public var DevicePowerNotRequiredCallback: PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACK = null,
    public var PowerControlCallback: PPO_FX_POWER_CONTROL_CALLBACK = null,
    public var DirectedPowerUpCallback: PPO_FX_DIRECTED_POWER_UP_CALLBACK = null,
    public var DirectedPowerDownCallback: PPO_FX_DIRECTED_POWER_DOWN_CALLBACK = null,
    public var DirectedFxTimeoutInSeconds: UInt = 0u,
    public var DeviceContext: Long = 0L,
    public var ComponentCount: UInt = 0u,
    public var Components: List<PO_FX_COMPONENT_V2> = List(1) { PO_FX_COMPONENT_V2() },
)

public data class PO_FX_PERF_STATE(public var Value: ULong = 0uL, public var Context: Long = 0L)

public data class PO_FX_PERF_STATE_CHANGE(public var Set: UInt = 0u, public var Anonymous: PO_FX_PERF_STATE_CHANGE_0 = PO_FX_PERF_STATE_CHANGE_0())

public data class PO_FX_PERF_STATE_CHANGE_0(public var StateIndex: UInt = 0u, public var StateValue: ULong = 0uL)

public data class PROCESS_ACCESS_TOKEN(public var Token: HANDLE = 0L, public var Thread: HANDLE = 0L)

public data class PROCESS_DEVICEMAP_INFORMATION(public var Anonymous: PROCESS_DEVICEMAP_INFORMATION_0 = PROCESS_DEVICEMAP_INFORMATION_0())

public data class PROCESS_DEVICEMAP_INFORMATION_0(public var Set: PROCESS_DEVICEMAP_INFORMATION_0_0 = PROCESS_DEVICEMAP_INFORMATION_0_0(), public var Query: PROCESS_DEVICEMAP_INFORMATION_0_1 = PROCESS_DEVICEMAP_INFORMATION_0_1())

public data class PROCESS_DEVICEMAP_INFORMATION_0_1(public var DriveMap: UInt = 0u, public var DriveType: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESS_DEVICEMAP_INFORMATION_0_1) return false
        if (this.DriveMap != other.DriveMap) return false
        if (!this.DriveType.contentEquals(other.DriveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DriveMap.hashCode()
        result = 31 * result + this.DriveType.contentHashCode()
        return result
    }
}

public data class PROCESS_DEVICEMAP_INFORMATION_0_0(public var DirectoryHandle: HANDLE = 0L)

public data class PROCESS_DEVICEMAP_INFORMATION_EX(public var Anonymous: PROCESS_DEVICEMAP_INFORMATION_EX_0 = PROCESS_DEVICEMAP_INFORMATION_EX_0(), public var Flags: UInt = 0u)

public data class PROCESS_DEVICEMAP_INFORMATION_EX_0(public var Set: PROCESS_DEVICEMAP_INFORMATION_EX_0_0 = PROCESS_DEVICEMAP_INFORMATION_EX_0_0(), public var Query: PROCESS_DEVICEMAP_INFORMATION_EX_0_1 = PROCESS_DEVICEMAP_INFORMATION_EX_0_1())

public data class PROCESS_DEVICEMAP_INFORMATION_EX_0_1(public var DriveMap: UInt = 0u, public var DriveType: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESS_DEVICEMAP_INFORMATION_EX_0_1) return false
        if (this.DriveMap != other.DriveMap) return false
        if (!this.DriveType.contentEquals(other.DriveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DriveMap.hashCode()
        result = 31 * result + this.DriveType.contentHashCode()
        return result
    }
}

public data class PROCESS_DEVICEMAP_INFORMATION_EX_0_0(public var DirectoryHandle: HANDLE = 0L)

public data class PROCESS_EXCEPTION_PORT(public var ExceptionPortHandle: HANDLE = 0L, public var StateFlags: UInt = 0u)

public data class PROCESS_EXTENDED_BASIC_INFORMATION(
    public var Size: ULong = 0uL,
    public var BasicInfo: PROCESS_BASIC_INFORMATION = PROCESS_BASIC_INFORMATION(),
    public var Anonymous: PROCESS_EXTENDED_BASIC_INFORMATION_0 = PROCESS_EXTENDED_BASIC_INFORMATION_0(),
)

public data class PROCESS_EXTENDED_BASIC_INFORMATION_0(public var Flags: UInt = 0u, public var Anonymous: PROCESS_EXTENDED_BASIC_INFORMATION_0_0 = PROCESS_EXTENDED_BASIC_INFORMATION_0_0())

public data class PROCESS_EXTENDED_BASIC_INFORMATION_0_0(public var _bitfield: UInt = 0u)

public data class PROCESS_HANDLE_TRACING_ENABLE(public var Flags: UInt = 0u)

public data class PROCESS_HANDLE_TRACING_ENABLE_EX(public var Flags: UInt = 0u, public var TotalSlots: UInt = 0u)

public data class PROCESS_HANDLE_TRACING_ENTRY(
    public var Handle: HANDLE = 0L,
    public var ClientId: CLIENT_ID = CLIENT_ID(),
    public var Type: UInt = 0u,
    public var Stacks: LongArray = LongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESS_HANDLE_TRACING_ENTRY) return false
        if (this.Handle != other.Handle) return false
        if (this.ClientId != other.ClientId) return false
        if (this.Type != other.Type) return false
        if (!this.Stacks.contentEquals(other.Stacks)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Handle.hashCode()
        result = 31 * result + this.ClientId.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Stacks.contentHashCode()
        return result
    }
}

public data class PROCESS_HANDLE_TRACING_QUERY(
    public var Handle: HANDLE = 0L,
    public var TotalTraces: UInt = 0u,
    public var HandleTrace: List<PROCESS_HANDLE_TRACING_ENTRY> = List(1) { PROCESS_HANDLE_TRACING_ENTRY() },
)

public data class PROCESS_KEEPALIVE_COUNT_INFORMATION(public var WakeCount: UInt = 0u, public var NoWakeCount: UInt = 0u)

public data class PROCESS_MEMBERSHIP_INFORMATION(public var ServerSiloId: UInt = 0u)

public data class PROCESS_REVOKE_FILE_HANDLES_INFORMATION(public var TargetDevicePath: UNICODE_STRING = UNICODE_STRING())

public data class PROCESS_SESSION_INFORMATION(public var SessionId: UInt = 0u)

public data class PROCESS_SYSCALL_PROVIDER_INFORMATION(public var ProviderId: GUID = GUID(), public var Level: UByte = 0u)

public data class PROCESS_WS_WATCH_INFORMATION(public var FaultingPc: Long = 0L, public var FaultingVa: Long = 0L)

public data class PS_CREATE_NOTIFY_INFO(
    public var Size: ULong = 0uL,
    public var Anonymous: PS_CREATE_NOTIFY_INFO_0 = PS_CREATE_NOTIFY_INFO_0(),
    public var ParentProcessId: HANDLE = 0L,
    public var CreatingThreadId: CLIENT_ID = CLIENT_ID(),
    public var FileObject: Long = 0L,
    public var ImageFileName: Long = 0L,
    public var CommandLine: Long = 0L,
    public var CreationStatus: NTSTATUS = 0,
)

public data class PS_CREATE_NOTIFY_INFO_0(public var Flags: UInt = 0u, public var Anonymous: PS_CREATE_NOTIFY_INFO_0_0 = PS_CREATE_NOTIFY_INFO_0_0())

public data class PS_CREATE_NOTIFY_INFO_0_0(public var _bitfield: UInt = 0u)

public data class PTM_CONTROL_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var QueryGranularity: PPTM_DEVICE_QUERY_GRANULARITY = null,
    public var QueryTimeSource: PPTM_DEVICE_QUERY_TIME_SOURCE = null,
    public var Enable: PPTM_DEVICE_ENABLE = null,
    public var Disable: PPTM_DEVICE_DISABLE = null,
)

public data class REENUMERATE_SELF_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SurpriseRemoveAndReenumerateSelf: PREENUMERATE_SELF = null,
)

public data class REG_CALLBACK_CONTEXT_CLEANUP_INFORMATION(
    public var Object: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_CREATE_KEY_INFORMATION(
    public var CompleteName: Long = 0L,
    public var RootObject: Long = 0L,
    public var ObjectType: Long = 0L,
    public var CreateOptions: UInt = 0u,
    public var Class: Long = 0L,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var Disposition: Long = 0L,
    public var ResultObject: Long = 0L,
    public var CallContext: Long = 0L,
    public var RootObjectContext: Long = 0L,
    public var Transaction: Long = 0L,
    public var Reserved: Long = 0L,
)

public class REG_CREATE_KEY_INFORMATION_V1(
    public var CompleteName: Long = 0L,
    public var RootObject: Long = 0L,
    public var ObjectType: Long = 0L,
    public var Options: UInt = 0u,
    public var Class: Long = 0L,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var Disposition: Long = 0L,
    public var ResultObject: Long = 0L,
    public var CallContext: Long = 0L,
    public var RootObjectContext: Long = 0L,
    public var Transaction: Long = 0L,
    public var Version: ULong = 0uL,
    public var RemainingName: Long = 0L,
    public var Wow64Flags: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var CheckAccessMode: Byte = 0,
)

public data class REG_DELETE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_DELETE_VALUE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var ValueName: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_KEY_HANDLE_CLOSE_INFORMATION(
    public var Object: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)
