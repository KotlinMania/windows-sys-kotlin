@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwBuffer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessBasicInformation
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

public data class PciExpressErrorSourceId0(public var bitfield1: UShort = 0u, public var bitfield2: UShort = 0u)

public data class PciExpressEventCollectorEndpointAssociationCapability(public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(), public var associationBitmap: UInt = 0u)

public data class PciExpressL1PmSsCapabilitiesRegister(public var anonymous: PciExpressL1PmSsCapabilitiesRegister0 = PciExpressL1PmSsCapabilitiesRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressL1PmSsCapabilitiesRegister0(public var bitfield: UInt = 0u)

public data class PciExpressL1PmSsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var l1PmSsCapabilities: PciExpressL1PmSsCapabilitiesRegister = PciExpressL1PmSsCapabilitiesRegister(),
    public var l1PmSsControl1: PciExpressL1PmSsControl1Register = PciExpressL1PmSsControl1Register(),
    public var l1PmSsControl2: PciExpressL1PmSsControl2Register = PciExpressL1PmSsControl2Register(),
)

public data class PciExpressL1PmSsControl1Register(public var anonymous: PciExpressL1PmSsControl1Register0 = PciExpressL1PmSsControl1Register0(), public var asULONG: UInt = 0u)

public data class PciExpressL1PmSsControl1Register0(public var bitfield: UInt = 0u)

public data class PciExpressL1PmSsControl2Register(public var anonymous: PciExpressL1PmSsControl2Register0 = PciExpressL1PmSsControl2Register0(), public var asULONG: UInt = 0u)

public data class PciExpressL1PmSsControl2Register0(public var bitfield: UInt = 0u)

public data class PciExpressLaneErrorStatus(public var laneBitmap: UInt = 0u)

public data class PciExpressLinkCapabilities2Register(public var anonymous: PciExpressLinkCapabilities2Register0 = PciExpressLinkCapabilities2Register0(), public var asULONG: UInt = 0u)

public data class PciExpressLinkCapabilities2Register0(public var bitfield: UInt = 0u)

public data class PciExpressLinkCapabilitiesRegister(public var anonymous: PciExpressLinkCapabilitiesRegister0 = PciExpressLinkCapabilitiesRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressLinkCapabilitiesRegister0(public var bitfield: UInt = 0u)

public data class PciExpressLinkControl3(public var anonymous: PciExpressLinkControl30 = PciExpressLinkControl30())

public data class PciExpressLinkControl30(public var anonymous: PciExpressLinkControl300 = PciExpressLinkControl300(), public var asULONG: UInt = 0u)

public data class PciExpressLinkControl300(public var bitfield: UInt = 0u)

public data class PciExpressLinkControl2Register(public var anonymous: PciExpressLinkControl2Register0 = PciExpressLinkControl2Register0(), public var asUSHORT: UShort = 0u)

public data class PciExpressLinkControl2Register0(public var bitfield: UShort = 0u)

public data class PciExpressLinkControlRegister(public var anonymous: PciExpressLinkControlRegister0 = PciExpressLinkControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressLinkControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressLinkQuiescentInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var pciExpressEnterLinkQuiescentMode: PpciExpressEnterLinkQuiescentMode = null,
    public var pciExpressExitLinkQuiescentMode: PpciExpressExitLinkQuiescentMode = null,
)

public data class PciExpressLinkStatus2Register(public var anonymous: PciExpressLinkStatus2Register0 = PciExpressLinkStatus2Register0(), public var asUSHORT: UShort = 0u)

public data class PciExpressLinkStatus2Register0(public var bitfield: UShort = 0u)

public data class PciExpressLinkStatusRegister(public var anonymous: PciExpressLinkStatusRegister0 = PciExpressLinkStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressLinkStatusRegister0(public var bitfield: UShort = 0u)

public data class PciExpressLtrCapability(public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(), public var latency: PciExpressLtrMaxLatencyRegister = PciExpressLtrMaxLatencyRegister())

public data class PciExpressLtrMaxLatencyRegister(public var anonymous: PciExpressLtrMaxLatencyRegister0 = PciExpressLtrMaxLatencyRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressLtrMaxLatencyRegister0(public var bitfield: UInt = 0u)

public data class PciExpressNpemCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressNpemCapabilityRegister = PciExpressNpemCapabilityRegister(),
    public var control: PciExpressNpemControlRegister = PciExpressNpemControlRegister(),
    public var status: PciExpressNpemStatusRegister = PciExpressNpemStatusRegister(),
)

public data class PciExpressNpemCapabilityRegister(public var anonymous: PciExpressNpemCapabilityRegister0 = PciExpressNpemCapabilityRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressNpemCapabilityRegister0(public var bitfield: UInt = 0u)

public data class PciExpressNpemControlRegister(public var anonymous: PciExpressNpemControlRegister0 = PciExpressNpemControlRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressNpemControlRegister0(public var bitfield: UInt = 0u)

public data class PciExpressNpemStatusRegister(public var anonymous: PciExpressNpemStatusRegister0 = PciExpressNpemStatusRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressNpemStatusRegister0(public var bitfield: UInt = 0u)

public data class PciExpressPasidCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressPasidCapabilityRegister = PciExpressPasidCapabilityRegister(),
    public var control: PciExpressPasidControlRegister = PciExpressPasidControlRegister(),
)

public data class PciExpressPasidCapabilityRegister(public var anonymous: PciExpressPasidCapabilityRegister0 = PciExpressPasidCapabilityRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressPasidCapabilityRegister0(public var bitfield: UShort = 0u)

public data class PciExpressPasidControlRegister(public var anonymous: PciExpressPasidControlRegister0 = PciExpressPasidControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressPasidControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressPmeRequestorId(public var anonymous: PciExpressPmeRequestorId0 = PciExpressPmeRequestorId0(), public var asUSHORT: UShort = 0u)

public data class PciExpressPmeRequestorId0(public var bitfield: UShort = 0u)

public data class PciExpressPriCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var control: PciExpressPriControlRegister = PciExpressPriControlRegister(),
    public var status: PciExpressPriStatusRegister = PciExpressPriStatusRegister(),
    public var pRCapacity: UInt = 0u,
    public var pRAllocation: UInt = 0u,
)

public data class PciExpressPriControlRegister(public var anonymous: PciExpressPriControlRegister0 = PciExpressPriControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressPriControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressPriStatusRegister(public var anonymous: PciExpressPriStatusRegister0 = PciExpressPriStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressPriStatusRegister0(public var bitfield: UShort = 0u)

public data class PciExpressPtmCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var ptmCapability: PciExpressPtmCapabilityRegister = PciExpressPtmCapabilityRegister(),
    public var ptmControl: PciExpressPtmControlRegister = PciExpressPtmControlRegister(),
)

public data class PciExpressPtmCapabilityRegister(public var anonymous: PciExpressPtmCapabilityRegister0 = PciExpressPtmCapabilityRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressPtmCapabilityRegister0(public var bitfield: UInt = 0u)

public data class PciExpressPtmControlRegister(public var anonymous: PciExpressPtmControlRegister0 = PciExpressPtmControlRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressPtmControlRegister0(public var bitfield: UInt = 0u)

public data class PciExpressResizableBarCapability(public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(), public var entry: List<PciExpressResizableBarEntry> = List(6) { PciExpressResizableBarEntry() })

public data class PciExpressResizableBarCapabilityRegister(public var anonymous: PciExpressResizableBarCapabilityRegister0 = PciExpressResizableBarCapabilityRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressResizableBarCapabilityRegister0(public var bitfield: UInt = 0u)

public data class PciExpressResizableBarControlRegister(public var anonymous: PciExpressResizableBarControlRegister0 = PciExpressResizableBarControlRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressResizableBarControlRegister0(public var bitfield: UInt = 0u)

public data class PciExpressResizableBarEntry(public var capability: PciExpressResizableBarCapabilityRegister = PciExpressResizableBarCapabilityRegister(), public var control: PciExpressResizableBarControlRegister = PciExpressResizableBarControlRegister())

public data class PciExpressRootportAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var rootErrorCommand: PciExpressRootErrorCommand = PciExpressRootErrorCommand(),
    public var rootErrorStatus: PciExpressRootErrorStatus = PciExpressRootErrorStatus(),
    public var errorSourceId: PciExpressErrorSourceId = PciExpressErrorSourceId(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressRootportAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.rootErrorCommand != other.rootErrorCommand) return false
        if (this.rootErrorStatus != other.rootErrorStatus) return false
        if (this.errorSourceId != other.errorSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.rootErrorCommand.hashCode()
        result = 31 * result + this.rootErrorStatus.hashCode()
        result = 31 * result + this.errorSourceId.hashCode()
        return result
    }
}

public data class PciExpressRootCapabilitiesRegister(public var anonymous: PciExpressRootCapabilitiesRegister0 = PciExpressRootCapabilitiesRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressRootCapabilitiesRegister0(public var bitfield: UShort = 0u)

public data class PciExpressRootControlRegister(public var anonymous: PciExpressRootControlRegister0 = PciExpressRootControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressRootControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressRootErrorCommand(public var anonymous: PciExpressRootErrorCommand0 = PciExpressRootErrorCommand0(), public var asULONG: UInt = 0u)

public data class PciExpressRootErrorCommand0(public var bitfield: UInt = 0u)

public data class PciExpressRootErrorStatus(public var anonymous: PciExpressRootErrorStatus0 = PciExpressRootErrorStatus0(), public var asULONG: UInt = 0u)

public data class PciExpressRootErrorStatus0(public var bitfield: UInt = 0u)

public data class PciExpressRootPortInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var readConfigSpace: PpciExpressRootPortReadConfigSpace = null,
    public var writeConfigSpace: PpciExpressRootPortWriteConfigSpace = null,
)

public data class PciExpressRootStatusRegister(public var anonymous: PciExpressRootStatusRegister0 = PciExpressRootStatusRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressRootStatusRegister0(public var bitfield: UInt = 0u)

public data class PciExpressSecondaryCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var linkControl3: PciExpressLinkControl3 = PciExpressLinkControl3(),
    public var laneErrorStatus: PciExpressLaneErrorStatus = PciExpressLaneErrorStatus(),
)

public data class PciExpressSecAerCapabilities(public var anonymous: PciExpressSecAerCapabilities0 = PciExpressSecAerCapabilities0(), public var asULONG: UInt = 0u)

public data class PciExpressSecAerCapabilities0(public var bitfield: UInt = 0u)

public data class PciExpressSecUncorrectableErrorMask(public var anonymous: PciExpressSecUncorrectableErrorMask0 = PciExpressSecUncorrectableErrorMask0(), public var asULONG: UInt = 0u)

public data class PciExpressSecUncorrectableErrorMask0(public var bitfield: UInt = 0u)

public data class PciExpressSecUncorrectableErrorSeverity(public var anonymous: PciExpressSecUncorrectableErrorSeverity0 = PciExpressSecUncorrectableErrorSeverity0(), public var asULONG: UInt = 0u)

public data class PciExpressSecUncorrectableErrorSeverity0(public var bitfield: UInt = 0u)

public data class PciExpressSecUncorrectableErrorStatus(public var anonymous: PciExpressSecUncorrectableErrorStatus0 = PciExpressSecUncorrectableErrorStatus0(), public var asULONG: UInt = 0u)

public data class PciExpressSecUncorrectableErrorStatus0(public var bitfield: UInt = 0u)

public data class PciExpressSerialNumberCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var lowSerialNumber: UInt = 0u,
    public var highSerialNumber: UInt = 0u,
)

public data class PciExpressSlotCapabilitiesRegister(public var anonymous: PciExpressSlotCapabilitiesRegister0 = PciExpressSlotCapabilitiesRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressSlotCapabilitiesRegister0(public var bitfield: UInt = 0u)

public data class PciExpressSlotControlRegister(public var anonymous: PciExpressSlotControlRegister0 = PciExpressSlotControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressSlotControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressSlotStatusRegister(public var anonymous: PciExpressSlotStatusRegister0 = PciExpressSlotStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressSlotStatusRegister0(public var bitfield: UShort = 0u)

public class PciExpressSriovCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var sRIOVCapabilities: PciExpressSriovCaps = PciExpressSriovCaps(),
    public var sRIOVControl: PciExpressSriovControl = PciExpressSriovControl(),
    public var sRIOVStatus: PciExpressSriovStatus = PciExpressSriovStatus(),
    public var initialVFs: UShort = 0u,
    public var totalVFs: UShort = 0u,
    public var numVFs: UShort = 0u,
    public var functionDependencyLink: UByte = 0u,
    public var rsvdP1: UByte = 0u,
    public var firstVFOffset: UShort = 0u,
    public var vFStride: UShort = 0u,
    public var rsvdP2: UShort = 0u,
    public var vFDeviceId: UShort = 0u,
    public var supportedPageSizes: UInt = 0u,
    public var systemPageSize: UInt = 0u,
    public var baseAddresses: UIntArray = UIntArray(6),
    public var vFMigrationStateArrayOffset: PciExpressSriovMigrationStateArray = PciExpressSriovMigrationStateArray(),
)

public data class PciExpressSriovCaps(public var anonymous: PciExpressSriovCaps0 = PciExpressSriovCaps0(), public var asULONG: UInt = 0u)

public data class PciExpressSriovCaps0(public var bitfield: UInt = 0u)

public data class PciExpressSriovControl(public var anonymous: PciExpressSriovControl0 = PciExpressSriovControl0(), public var asUSHORT: UShort = 0u)

public data class PciExpressSriovControl0(public var bitfield: UShort = 0u)

public data class PciExpressSriovMigrationStateArray(public var anonymous: PciExpressSriovMigrationStateArray0 = PciExpressSriovMigrationStateArray0(), public var asULONG: UInt = 0u)

public data class PciExpressSriovMigrationStateArray0(public var bitfield: UInt = 0u)

public data class PciExpressSriovStatus(public var anonymous: PciExpressSriovStatus0 = PciExpressSriovStatus0(), public var asUSHORT: UShort = 0u)

public data class PciExpressSriovStatus0(public var bitfield: UShort = 0u)

public data class PciExpressTphRequesterCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var requesterCapability: PciExpressTphRequesterCapabilityRegister = PciExpressTphRequesterCapabilityRegister(),
    public var requesterControl: PciExpressTphRequesterControlRegister = PciExpressTphRequesterControlRegister(),
)

public data class PciExpressTphRequesterCapabilityRegister(public var anonymous: PciExpressTphRequesterCapabilityRegister0 = PciExpressTphRequesterCapabilityRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressTphRequesterCapabilityRegister0(public var bitfield: UInt = 0u)

public data class PciExpressTphRequesterControlRegister(public var anonymous: PciExpressTphRequesterControlRegister0 = PciExpressTphRequesterControlRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressTphRequesterControlRegister0(public var bitfield: UInt = 0u)

public data class PciExpressTphStTableEntry(public var anonymous: PciExpressTphStTableEntry0 = PciExpressTphStTableEntry0(), public var asUSHORT: UShort = 0u)

public data class PciExpressTphStTableEntry0(public var bitfield: UShort = 0u)

public data class PciExpressUncorrectableErrorMask(public var anonymous: PciExpressUncorrectableErrorMask0 = PciExpressUncorrectableErrorMask0(), public var asULONG: UInt = 0u)

public data class PciExpressUncorrectableErrorMask0(public var bitfield: UInt = 0u)

public data class PciExpressUncorrectableErrorSeverity(public var anonymous: PciExpressUncorrectableErrorSeverity0 = PciExpressUncorrectableErrorSeverity0(), public var asULONG: UInt = 0u)

public data class PciExpressUncorrectableErrorSeverity0(public var bitfield: UInt = 0u)

public data class PciExpressUncorrectableErrorStatus(public var anonymous: PciExpressUncorrectableErrorStatus0 = PciExpressUncorrectableErrorStatus0(), public var asULONG: UInt = 0u)

public data class PciExpressUncorrectableErrorStatus0(public var bitfield: UInt = 0u)

public data class PciExpressVendorSpecificCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var vsecId: UShort = 0u,
    public var bitfield: UShort = 0u,
)

public data class PciExpressVirtualChannelCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capabilities1: VirtualChannelCapabilities1 = VirtualChannelCapabilities1(),
    public var capabilities2: VirtualChannelCapabilities2 = VirtualChannelCapabilities2(),
    public var control: VirtualChannelControl = VirtualChannelControl(),
    public var status: VirtualChannelStatus = VirtualChannelStatus(),
    public var resource: List<VirtualResource> = List(8) { VirtualResource() },
)

public data class PciFirmwareBusCaps(
    public var type: UShort = 0u,
    public var length: UShort = 0u,
    public var anonymous: PciFirmwareBusCaps0 = PciFirmwareBusCaps0(),
    public var currentSpeedAndMode: UByte = 0u,
    public var supportedSpeedsAndModesLowByte: UByte = 0u,
    public var supportedSpeedsAndModesHighByte: UByte = 0u,
    public var voltage: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciFirmwareBusCaps) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (this.anonymous != other.anonymous) return false
        if (this.currentSpeedAndMode != other.currentSpeedAndMode) return false
        if (this.supportedSpeedsAndModesLowByte != other.supportedSpeedsAndModesLowByte) return false
        if (this.supportedSpeedsAndModesHighByte != other.supportedSpeedsAndModesHighByte) return false
        if (this.voltage != other.voltage) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.currentSpeedAndMode.hashCode()
        result = 31 * result + this.supportedSpeedsAndModesLowByte.hashCode()
        result = 31 * result + this.supportedSpeedsAndModesHighByte.hashCode()
        result = 31 * result + this.voltage.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class PciFirmwareBusCaps0(public var bitfield: UByte = 0u)

public data class PciFirmwareBusCapsReturnBuffer(
    public var version: UShort = 0u,
    public var status: UShort = 0u,
    public var length: UInt = 0u,
    public var caps: PciFirmwareBusCaps = PciFirmwareBusCaps(),
)

public data class PciFpbCapabilitiesRegister(public var anonymous: PciFpbCapabilitiesRegister0 = PciFpbCapabilitiesRegister0(), public var asULONG: UInt = 0u)

public data class PciFpbCapabilitiesRegister0(public var bitfield: UInt = 0u)

public data class PciFpbCapability(
    public var header: PciFpbCapabilityHeader = PciFpbCapabilityHeader(),
    public var capabilitiesRegister: PciFpbCapabilitiesRegister = PciFpbCapabilitiesRegister(),
    public var ridVectorControl1Register: PciFpbRidVectorControl1Register = PciFpbRidVectorControl1Register(),
    public var ridVectorControl2Register: PciFpbRidVectorControl2Register = PciFpbRidVectorControl2Register(),
    public var memLowVectorControlRegister: PciFpbMemLowVectorControlRegister = PciFpbMemLowVectorControlRegister(),
    public var memHighVectorControl1Register: PciFpbMemHighVectorControl1Register = PciFpbMemHighVectorControl1Register(),
    public var memHighVectorControl2Register: PciFpbMemHighVectorControl2Register = PciFpbMemHighVectorControl2Register(),
    public var vectorAccessControlRegister: PciFpbVectorAccessControlRegister = PciFpbVectorAccessControlRegister(),
    public var vectorAccessDataRegister: PciFpbVectorAccessDataRegister = PciFpbVectorAccessDataRegister(),
)

public data class PciFpbCapabilityHeader(public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(), public var reserved: UShort = 0u)

public data class PciFpbMemHighVectorControl1Register(public var anonymous: PciFpbMemHighVectorControl1Register0 = PciFpbMemHighVectorControl1Register0(), public var asULONG: UInt = 0u)

public data class PciFpbMemHighVectorControl1Register0(public var bitfield: UInt = 0u)

public data class PciFpbMemHighVectorControl2Register(public var memHighVectorStartUpper: UInt = 0u)

public data class PciFpbMemLowVectorControlRegister(public var anonymous: PciFpbMemLowVectorControlRegister0 = PciFpbMemLowVectorControlRegister0(), public var asULONG: UInt = 0u)

public data class PciFpbMemLowVectorControlRegister0(public var bitfield: UInt = 0u)

public data class PciFpbRidVectorControl1Register(public var anonymous: PciFpbRidVectorControl1Register0 = PciFpbRidVectorControl1Register0(), public var asULONG: UInt = 0u)

public data class PciFpbRidVectorControl1Register0(public var bitfield: UInt = 0u)

public data class PciFpbRidVectorControl2Register(public var anonymous: PciFpbRidVectorControl2Register0 = PciFpbRidVectorControl2Register0(), public var asULONG: UInt = 0u)

public data class PciFpbRidVectorControl2Register0(public var bitfield: UInt = 0u)

public data class PciFpbVectorAccessControlRegister(public var anonymous: PciFpbVectorAccessControlRegister0 = PciFpbVectorAccessControlRegister0(), public var asULONG: UInt = 0u)

public data class PciFpbVectorAccessControlRegister0(public var bitfield: UInt = 0u)

public data class PciFpbVectorAccessDataRegister(public var vectorAccessData: UInt = 0u)

public data class PciMsixTableConfigInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setTableEntry: PpciMsixSetEntry = null,
    public var maskTableEntry: PpciMsixMaskunmaskEntry = null,
    public var unmaskTableEntry: PpciMsixMaskunmaskEntry = null,
    public var getTableEntry: PpciMsixGetEntry = null,
    public var getTableSize: PpciMsixGetTableSize = null,
)

public data class PciPmc(public var bitfield: UByte = 0u, public var support: PciPmc0 = PciPmc0())

public data class PciPmc0(public var bitfield: UByte = 0u)

public data class PciPmcsr(public var bitfield: UShort = 0u)

public data class PciPmcsrBse(public var bitfield: UByte = 0u)

public data class PciPmCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var pmc: PciPmCapability0 = PciPmCapability0(),
    public var pmcsr: PciPmCapability1 = PciPmCapability1(),
    public var pmcsrBse: PciPmCapability2 = PciPmCapability2(),
    public var data: UByte = 0u,
)

public data class PciPmCapability2(public var bridgeSupport: PciPmcsrBse = PciPmcsrBse(), public var asUCHAR: UByte = 0u)

public data class PciPmCapability1(public var controlStatus: PciPmcsr = PciPmcsr(), public var asUSHORT: UShort = 0u)

public data class PciPmCapability0(public var capabilities: PciPmc = PciPmc(), public var asUSHORT: UShort = 0u)

public data class PciRootBusHardwareCapability(
    public var secondaryInterface: PciHardwareInterface = 0,
    public var anonymous: PciRootBusHardwareCapability0 = PciRootBusHardwareCapability0(),
    public var oscFeatureSupport: PciRootBusOscSupportField = PciRootBusOscSupportField(),
    public var oscControlRequest: PciRootBusOscControlField = PciRootBusOscControlField(),
    public var oscControlGranted: PciRootBusOscControlField = PciRootBusOscControlField(),
)

public data class PciRootBusHardwareCapability0(
    public var busCapabilitiesFound: Boolean = false,
    public var currentSpeedAndMode: UInt = 0u,
    public var supportedSpeedsAndModes: UInt = 0u,
    public var deviceIDMessagingCapable: Boolean = false,
    public var secondaryBusWidth: PciBusWidth = 0,
)

public data class PciRootBusOscControlField(public var u: PciRootBusOscControlField0 = PciRootBusOscControlField0())

public data class PciRootBusOscControlField0(public var anonymous: PciRootBusOscControlField00 = PciRootBusOscControlField00(), public var asULONG: UInt = 0u)

public data class PciRootBusOscControlField00(public var bitfield: UInt = 0u)

public data class PciRootBusOscSupportField(public var u: PciRootBusOscSupportField0 = PciRootBusOscSupportField0())

public data class PciRootBusOscSupportField0(public var anonymous: PciRootBusOscSupportField00 = PciRootBusOscSupportField00(), public var asULONG: UInt = 0u)

public data class PciRootBusOscSupportField00(public var bitfield: UInt = 0u)

public data class PciSecurityInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setAccessControlServices: PpciSetAcs = null,
)

public data class PciSecurityInterface2(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var flags: UInt = 0u,
    public var supportedScenarios: UInt = 0u,
    public var setAccessControlServices: PpciSetAcs2 = null,
)

public data class PciSegmentBusNumber(public var u: PciSegmentBusNumber0 = PciSegmentBusNumber0())

public data class PciSegmentBusNumber0(public var bits: PciSegmentBusNumber00 = PciSegmentBusNumber00(), public var asULONG: UInt = 0u)

public data class PciSegmentBusNumber00(public var bitfield: UInt = 0u)

public data class PciSlotNumber(public var u: PciSlotNumber0 = PciSlotNumber0())

public data class PciSlotNumber0(public var bits: PciSlotNumber00 = PciSlotNumber00(), public var asULONG: UInt = 0u)

public data class PciSlotNumber00(public var bitfield: UInt = 0u)

public data class PciSubsystemIdsCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var reserved: UShort = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
)

public data class PciVendorSpecificCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var vscLength: UByte = 0u,
    public var vendorSpecific: UByte = 0u,
)

public data class PciVirtualizationInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setVirtualFunctionData: PsetVirtualDeviceData = null,
    public var getVirtualFunctionData: PgetVirtualDeviceData = null,
    public var getLocation: PgetVirtualDeviceLocation = null,
    public var getResources: PgetVirtualDeviceResources = null,
    public var enableVirtualization: PenableVirtualization = null,
    public var getVirtualFunctionProbedBars: PgetVirtualFunctionProbedBars = null,
)

public data class PciXCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var command: PciXCapability0 = PciXCapability0(),
    public var status: PciXCapability1 = PciXCapability1(),
)

public data class PciXCapability0(public var bits: PciXCapability00 = PciXCapability00(), public var asUSHORT: UShort = 0u)

public data class PciXCapability00(public var bitfield: UShort = 0u)

public data class PciXCapability1(public var bits: PciXCapability10 = PciXCapability10(), public var asULONG: UInt = 0u)

public data class PciXCapability10(public var bitfield: UInt = 0u)

public data class PcwCallbackInformation(
    public var addCounter: PcwCounterInformation = PcwCounterInformation(),
    public var removeCounter: PcwCounterInformation = PcwCounterInformation(),
    public var enumerateInstances: PcwMaskInformation = PcwMaskInformation(),
    public var collectData: PcwMaskInformation = PcwMaskInformation(),
)

public data class PcwCounterDescriptor(
    public var id: UShort = 0u,
    public var structIndex: UShort = 0u,
    public var offset: UShort = 0u,
    public var size: UShort = 0u,
)

public data class PcwCounterInformation(public var counterMask: ULong = 0uL, public var instanceMask: UnicodeString? = null)

public data class PcwData(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class PcwMaskInformation(
    public var counterMask: ULong = 0uL,
    public var instanceMask: UnicodeString? = null,
    public var instanceId: UInt = 0u,
    public var collectMultiple: Boolean = false,
    public var buffer: PpcwBuffer = 0L,
    public var cancelEvent: Kevent? = null,
)

public data class PcwRegistrationInformation(
    public var version: UInt = 0u,
    public var name: UnicodeString? = null,
    public var counterCount: UInt = 0u,
    public var counters: PcwCounterDescriptor? = null,
    public var callback: PpcwCallback = null,
    public var callbackContext: COpaquePointer? = null,
    public var flags: PcwRegistrationFlags = 0,
)

public data class PhysicalCounterEventBufferConfiguration(
    public var overflowHandler: PphysicalCounterEventBufferOverflowHandler = null,
    public var customEventBufferEntrySize: UInt = 0u,
    public var eventThreshold: UInt = 0u,
)

public data class PhysicalCounterResourceDescriptor(
    public var type: PhysicalCounterResourceDescriptorType = 0,
    public var flags: UInt = 0u,
    public var u: PhysicalCounterResourceDescriptor0 = PhysicalCounterResourceDescriptor0(),
)

public data class PhysicalCounterResourceDescriptor0(
    public var counterIndex: UInt = 0u,
    public var range: PhysicalCounterResourceDescriptor00 = PhysicalCounterResourceDescriptor00(),
    public var overflowHandler: PphysicalCounterOverflowHandler = null,
    public var eventBufferConfiguration: PhysicalCounterEventBufferConfiguration = PhysicalCounterEventBufferConfiguration(),
    public var identificationTag: UInt = 0u,
)

public data class PhysicalCounterResourceDescriptor00(public var begin: UInt = 0u, public var end: UInt = 0u)

public data class PhysicalCounterResourceList(public var count: UInt = 0u, public var descriptors: List<PhysicalCounterResourceDescriptor> = List(1) { PhysicalCounterResourceDescriptor() })

public data class PhysicalMemoryRange(public var baseAddress: Long = 0L, public var numberOfBytes: Long = 0L)

public data class PlugplayNotificationHeader(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public data class PmDispatchTable(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var function: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class PnpBusInformation(
    public var busTypeGuid: Guid = Guid(),
    public var legacyBusType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
)

public data class PnpExtendedAddressInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var queryExtendedAddress: Pqueryextendedaddress = null,
)

public data class PnpLocationInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var getLocationString: PgetLocationString = null,
)

public data class PnpReplaceDriverInterface(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var unload: PreplaceUnload = null,
    public var beginReplace: PreplaceBegin = null,
    public var endReplace: PreplaceEnd = null,
    public var mirrorPhysicalMemory: PreplaceMirrorPhysicalMemory = null,
    public var setProcessorId: PreplaceSetProcessorId = null,
    public var swap: PreplaceSwap = null,
    public var initiateHardwareMirror: PreplaceInitiateHardwareMirror = null,
    public var mirrorPlatformMemory: PreplaceMirrorPlatformMemory = null,
    public var getMemoryDestination: PreplaceGetMemoryDestination = null,
    public var enableDisableHardwareQuiesce: PreplaceEnableDisableHardwareQuiesce = null,
)

public data class PnpReplaceMemoryList(
    public var allocatedCount: UInt = 0u,
    public var count: UInt = 0u,
    public var totalLength: ULong = 0uL,
    public var ranges: List<PnpReplaceMemoryList0> = List(1) { PnpReplaceMemoryList0() },
)

public data class PnpReplaceMemoryList0(public var address: Long = 0L, public var length: ULong = 0uL)

public data class PnpReplaceParameters(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var target: ULong = 0uL,
    public var spare: ULong = 0uL,
    public var targetProcessors: PnpReplaceProcessorList? = null,
    public var spareProcessors: PnpReplaceProcessorList? = null,
    public var targetMemory: PnpReplaceMemoryList? = null,
    public var spareMemory: PnpReplaceMemoryList? = null,
    public var mapMemory: PreplaceMapMemory = null,
)

public data class PnpReplaceProcessorList(
    public var affinity: Int? = null,
    public var groupCount: UInt = 0u,
    public var allocatedCount: UInt = 0u,
    public var count: UInt = 0u,
    public var apicIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpReplaceProcessorList) return false
        if (this.affinity != other.affinity) return false
        if (this.groupCount != other.groupCount) return false
        if (this.allocatedCount != other.allocatedCount) return false
        if (this.count != other.count) return false
        if (!this.apicIds.contentEquals(other.apicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.affinity.hashCode()
        result = 31 * result + this.groupCount.hashCode()
        result = 31 * result + this.allocatedCount.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.apicIds.contentHashCode()
        return result
    }
}

public data class PnpReplaceProcessorListV1(
    public var affinityMask: Int = 0,
    public var allocatedCount: UInt = 0u,
    public var count: UInt = 0u,
    public var apicIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpReplaceProcessorListV1) return false
        if (this.affinityMask != other.affinityMask) return false
        if (this.allocatedCount != other.allocatedCount) return false
        if (this.count != other.count) return false
        if (!this.apicIds.contentEquals(other.apicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.affinityMask.hashCode()
        result = 31 * result + this.allocatedCount.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.apicIds.contentHashCode()
        return result
    }
}

public data class PooledUsageAndLimits(
    public var peakPagedPoolUsage: Int = 0,
    public var pagedPoolUsage: Int = 0,
    public var pagedPoolLimit: Int = 0,
    public var peakNonPagedPoolUsage: Int = 0,
    public var nonPagedPoolUsage: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var pagefileLimit: Int = 0,
)

public data class PoolCreateExtendedParams(public var version: UInt = 0u)

public data class PoolExtendedParameter(public var anonymous1: PoolExtendedParameter0 = PoolExtendedParameter0(), public var anonymous2: PoolExtendedParameter1 = PoolExtendedParameter1())

public data class PoolExtendedParameter0(public var bitfield: ULong = 0uL)

public data class PoolExtendedParameter1(
    public var reserved2: ULong = 0uL,
    public var reserved3: COpaquePointer? = null,
    public var priority: ExPoolPriority = 0,
    public var securePoolParams: PoolExtendedParamsSecurePool? = null,
    public var preferredNode: UInt = 0u,
)

public data class PoolExtendedParamsSecurePool(
    public var securePoolHandle: Handle = null,
    public var buffer: COpaquePointer? = null,
    public var cookie: Int = 0,
    public var securePoolFlags: UInt = 0u,
)

public data class PowerMonitorInvocation(public var console: Boolean = false, public var requestReason: PowerMonitorRequestReason = 0)

public data class PowerPlatformInformation(public var aoAc: Boolean = false)

public data class PowerSequence(
    public var sequenceD1: UInt = 0u,
    public var sequenceD2: UInt = 0u,
    public var sequenceD3: UInt = 0u,
)

public data class PowerSessionConnect(public var connected: Boolean = false, public var console: Boolean = false)

public data class PowerSessionRitState(public var active: Boolean = false, public var lastInputTime: ULong = 0uL)

public data class PowerSessionTimeouts(public var inputTimeout: UInt = 0u, public var displayTimeout: UInt = 0u)

public data class PowerSessionWinlogon(
    public var sessionId: UInt = 0u,
    public var console: Boolean = false,
    public var locked: Boolean = false,
)

public data class PowerState(public var systemState: SystemPowerState = 0, public var deviceState: DevicePowerState = 0)

public data class PowerThrottlingProcessState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public data class PowerThrottlingThreadState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public data class PoFxComponentIdleState(
    public var transitionLatency: ULong = 0uL,
    public var residencyRequirement: ULong = 0uL,
    public var nominalPower: UInt = 0u,
)

public data class PoFxComponentPerfInfo(public var perfStateSetsCount: UInt = 0u, public var perfStateSets: List<PoFxComponentPerfSet> = List(1) { PoFxComponentPerfSet() })

public data class PoFxComponentPerfSet(
    public var name: UnicodeString = UnicodeString(),
    public var flags: ULong = 0uL,
    public var unit: PoFxPerfStateUnit = 0,
    public var type: PoFxPerfStateType = 0,
    public var anonymous: PoFxComponentPerfSet0 = PoFxComponentPerfSet0(),
)

public data class PoFxComponentPerfSet0(public var discrete: PoFxComponentPerfSet00 = PoFxComponentPerfSet00(), public var range: PoFxComponentPerfSet01 = PoFxComponentPerfSet01())

public data class PoFxComponentPerfSet00(public var count: UInt = 0u, public var states: PoFxPerfState? = null)

public data class PoFxComponentPerfSet01(public var minimum: ULong = 0uL, public var maximum: ULong = 0uL)

public data class PoFxComponentV1(
    public var id: Guid = Guid(),
    public var idleStateCount: UInt = 0u,
    public var deepestWakeableIdleState: UInt = 0u,
    public var idleStates: PoFxComponentIdleState? = null,
)

public data class PoFxComponentV2(
    public var id: Guid = Guid(),
    public var flags: ULong = 0uL,
    public var deepestWakeableIdleState: UInt = 0u,
    public var idleStateCount: UInt = 0u,
    public var idleStates: PoFxComponentIdleState? = null,
    public var providerCount: UInt = 0u,
    public var providers: UInt? = null,
)

public data class PoFxDeviceV1(
    public var version: UInt = 0u,
    public var componentCount: UInt = 0u,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
    public var powerControlCallback: PpoFxPowerControlCallback = null,
    public var deviceContext: COpaquePointer? = null,
    public var components: List<PoFxComponentV1> = List(1) { PoFxComponentV1() },
)

public data class PoFxDeviceV2(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
    public var powerControlCallback: PpoFxPowerControlCallback = null,
    public var deviceContext: COpaquePointer? = null,
    public var componentCount: UInt = 0u,
    public var components: List<PoFxComponentV2> = List(1) { PoFxComponentV2() },
)

public data class PoFxDeviceV3(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
    public var powerControlCallback: PpoFxPowerControlCallback = null,
    public var directedPowerUpCallback: PpoFxDirectedPowerUpCallback = null,
    public var directedPowerDownCallback: PpoFxDirectedPowerDownCallback = null,
    public var directedFxTimeoutInSeconds: UInt = 0u,
    public var deviceContext: COpaquePointer? = null,
    public var componentCount: UInt = 0u,
    public var components: List<PoFxComponentV2> = List(1) { PoFxComponentV2() },
)

public data class PoFxPerfState(public var value: ULong = 0uL, public var context: COpaquePointer? = null)

public data class PoFxPerfStateChange(public var set: UInt = 0u, public var anonymous: PoFxPerfStateChange0 = PoFxPerfStateChange0())

public data class PoFxPerfStateChange0(public var stateIndex: UInt = 0u, public var stateValue: ULong = 0uL)

public data class ProcessAccessToken(public var token: Handle = null, public var thread: Handle = null)

public data class ProcessDevicemapInformation(public var anonymous: ProcessDevicemapInformation0 = ProcessDevicemapInformation0())

public data class ProcessDevicemapInformation0(public var set: ProcessDevicemapInformation00 = ProcessDevicemapInformation00(), public var query: ProcessDevicemapInformation01 = ProcessDevicemapInformation01())

public data class ProcessDevicemapInformation01(public var driveMap: UInt = 0u, public var driveType: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformation01) return false
        if (this.driveMap != other.driveMap) return false
        if (!this.driveType.contentEquals(other.driveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driveMap.hashCode()
        result = 31 * result + this.driveType.contentHashCode()
        return result
    }
}

public data class ProcessDevicemapInformation00(public var directoryHandle: Handle = null)

public data class ProcessDevicemapInformationEx(public var anonymous: ProcessDevicemapInformationEx0 = ProcessDevicemapInformationEx0(), public var flags: UInt = 0u)

public data class ProcessDevicemapInformationEx0(public var set: ProcessDevicemapInformationEx00 = ProcessDevicemapInformationEx00(), public var query: ProcessDevicemapInformationEx01 = ProcessDevicemapInformationEx01())

public data class ProcessDevicemapInformationEx01(public var driveMap: UInt = 0u, public var driveType: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformationEx01) return false
        if (this.driveMap != other.driveMap) return false
        if (!this.driveType.contentEquals(other.driveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driveMap.hashCode()
        result = 31 * result + this.driveType.contentHashCode()
        return result
    }
}

public data class ProcessDevicemapInformationEx00(public var directoryHandle: Handle = null)

public data class ProcessExceptionPort(public var exceptionPortHandle: Handle = null, public var stateFlags: UInt = 0u)

public data class ProcessExtendedBasicInformation(
    public var size: Int = 0,
    public var basicInfo: ProcessBasicInformation = ProcessBasicInformation(),
    public var anonymous: ProcessExtendedBasicInformation0 = ProcessExtendedBasicInformation0(),
)

public data class ProcessExtendedBasicInformation0(public var flags: UInt = 0u, public var anonymous: ProcessExtendedBasicInformation00 = ProcessExtendedBasicInformation00())

public data class ProcessExtendedBasicInformation00(public var bitfield: UInt = 0u)

public data class ProcessHandleTracingEnable(public var flags: UInt = 0u)

public data class ProcessHandleTracingEnableEx(public var flags: UInt = 0u, public var totalSlots: UInt = 0u)

public data class ProcessHandleTracingEntry(
    public var handle: Handle = null,
    public var clientId: ClientId = ClientId(),
    public var type: UInt = 0u,
    public var stacks: List<COpaquePointer> = List(16) { COpaquePointer(0L) },
)

public data class ProcessHandleTracingQuery(
    public var handle: Handle = null,
    public var totalTraces: UInt = 0u,
    public var handleTrace: List<ProcessHandleTracingEntry> = List(1) { ProcessHandleTracingEntry() },
)

public data class ProcessKeepaliveCountInformation(public var wakeCount: UInt = 0u, public var noWakeCount: UInt = 0u)

public data class ProcessMembershipInformation(public var serverSiloId: UInt = 0u)

public data class ProcessRevokeFileHandlesInformation(public var targetDevicePath: UnicodeString = UnicodeString())

public data class ProcessSessionInformation(public var sessionId: UInt = 0u)

public data class ProcessSyscallProviderInformation(public var providerId: Guid = Guid(), public var level: UByte = 0u)

public data class ProcessWsWatchInformation(public var faultingPc: COpaquePointer? = null, public var faultingVa: COpaquePointer? = null)

public data class PsCreateNotifyInfo(
    public var size: Int = 0,
    public var anonymous: PsCreateNotifyInfo0 = PsCreateNotifyInfo0(),
    public var parentProcessId: Handle = null,
    public var creatingThreadId: ClientId = ClientId(),
    public var fileObject: FileObject? = null,
    public var imageFileName: UnicodeString? = null,
    public var commandLine: UnicodeString? = null,
    public var creationStatus: Ntstatus = 0,
)

public data class PsCreateNotifyInfo0(public var flags: UInt = 0u, public var anonymous: PsCreateNotifyInfo00 = PsCreateNotifyInfo00())

public data class PsCreateNotifyInfo00(public var bitfield: UInt = 0u)

public data class PtmControlInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var queryGranularity: PptmDeviceQueryGranularity = null,
    public var queryTimeSource: PptmDeviceQueryTimeSource = null,
    public var enable: PptmDeviceEnable = null,
    public var disable: PptmDeviceDisable = null,
)

public data class ReenumerateSelfInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var surpriseRemoveAndReenumerateSelf: PreenumerateSelf = null,
)

public data class RegCallbackContextCleanupInformation(
    public var obj: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegCreateKeyInformation(
    public var completeName: UnicodeString? = null,
    public var rootObject: COpaquePointer? = null,
    public var objectType: COpaquePointer? = null,
    public var createOptions: UInt = 0u,
    public var cls: UnicodeString? = null,
    public var securityDescriptor: COpaquePointer? = null,
    public var securityQualityOfService: COpaquePointer? = null,
    public var desiredAccess: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var disposition: UInt? = null,
    public var resultObject: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var rootObjectContext: COpaquePointer? = null,
    public var transaction: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public class RegCreateKeyInformationV1(
    public var completeName: UnicodeString? = null,
    public var rootObject: COpaquePointer? = null,
    public var objectType: COpaquePointer? = null,
    public var options: UInt = 0u,
    public var cls: UnicodeString? = null,
    public var securityDescriptor: COpaquePointer? = null,
    public var securityQualityOfService: COpaquePointer? = null,
    public var desiredAccess: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var disposition: UInt? = null,
    public var resultObject: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var rootObjectContext: COpaquePointer? = null,
    public var transaction: COpaquePointer? = null,
    public var version: Int = 0,
    public var remainingName: UnicodeString? = null,
    public var wow64Flags: UInt = 0u,
    public var attributes: UInt = 0u,
    public var checkAccessMode: Byte = 0,
)

public data class RegDeleteKeyInformation(
    public var obj: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegDeleteValueKeyInformation(
    public var obj: COpaquePointer? = null,
    public var valueName: UnicodeString? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegKeyHandleCloseInformation(
    public var obj: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)
