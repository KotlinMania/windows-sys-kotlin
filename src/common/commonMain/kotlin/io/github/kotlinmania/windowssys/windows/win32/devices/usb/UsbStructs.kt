@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class AlternateInterface(
    public var interfaceNumber: UShort = 0u,
    public var alternateInterfaceNumber: UShort = 0u,
)

public data class BmRequestType(
    public var s: BmRequestType0 = BmRequestType0(),
    public var b: UByte = 0u,
)

public data class BmRequestType0(
    public var bitfield: UByte = 0u,
)

public data class ChannelInfo(
    public var eventChannelSize: UInt = 0u,
    public var uReadDataAlignment: UInt = 0u,
    public var uWriteDataAlignment: UInt = 0u,
)

public data class DeviceDescriptor(
    public var usVendorId: UShort = 0u,
    public var usProductId: UShort = 0u,
    public var usBcdDevice: UShort = 0u,
    public var usLanguageId: UShort = 0u,
)

public data class DrvVersion(
    public var major: UInt = 0u,
    public var minor: UInt = 0u,
    public var internal: UInt = 0u,
)

public class HcdIsoStatCounters(
    public var lateUrbs: UShort = 0u,
    public var doubleBufferedPackets: UShort = 0u,
    public var transfersCf5ms: UShort = 0u,
    public var transfersCf2ms: UShort = 0u,
    public var transfersCf1ms: UShort = 0u,
    public var maxInterruptLatency: UShort = 0u,
    public var badStartFrame: UShort = 0u,
    public var staleUrbs: UShort = 0u,
    public var isoPacketNotAccesed: UShort = 0u,
    public var isoPacketHWError: UShort = 0u,
    public var smallestUrbPacketCount: UShort = 0u,
    public var largestUrbPacketCount: UShort = 0u,
    public var isoCrcError: UShort = 0u,
    public var isoOverrunError: UShort = 0u,
    public var isoInternalError: UShort = 0u,
    public var isoUnknownError: UShort = 0u,
    public var isoBytesTransferred: UInt = 0u,
    public var lateMissedCount: UShort = 0u,
    public var hWIsoMissedCount: UShort = 0u,
    public var reserved7: UIntArray = UIntArray(8),
)

public data class HcdStatCounters(
    public var bytesTransferred: UInt = 0u,
    public var isoMissedCount: UShort = 0u,
    public var dataOverrunErrorCount: UShort = 0u,
    public var crcErrorCount: UShort = 0u,
    public var scheduleOverrunCount: UShort = 0u,
    public var timeoutErrorCount: UShort = 0u,
    public var internalHcErrorCount: UShort = 0u,
    public var bufferOverrunErrorCount: UShort = 0u,
    public var sWErrorCount: UShort = 0u,
    public var stallPidCount: UShort = 0u,
    public var portDisableCount: UShort = 0u,
)

public data class HcdStatInformation1(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var resetCounters: UInt = 0u,
    public var timeRead: Long = 0L,
    public var counters: HcdStatCounters = HcdStatCounters(),
)

public data class HcdStatInformation2(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var resetCounters: UInt = 0u,
    public var timeRead: Long = 0L,
    public var lockedMemoryUsed: Int = 0,
    public var counters: HcdStatCounters = HcdStatCounters(),
    public var isoCounters: HcdIsoStatCounters = HcdIsoStatCounters(),
)

public data class HubDeviceConfigInfo(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var hubFlags: UsbHubCapFlags = UsbHubCapFlags(),
    public var hardwareIds: UsbIdString = UsbIdString(),
    public var compatibleIds: UsbIdString = UsbIdString(),
    public var deviceDescription: UsbIdString = UsbIdString(),
    public var reserved: UIntArray = UIntArray(19),
    public var uxdSettings: UsbHubDeviceUxdSettings = UsbHubDeviceUxdSettings(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HubDeviceConfigInfo) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.hubFlags != other.hubFlags) return false
        if (this.hardwareIds != other.hardwareIds) return false
        if (this.compatibleIds != other.compatibleIds) return false
        if (this.deviceDescription != other.deviceDescription) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.uxdSettings != other.uxdSettings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.hubFlags.hashCode()
        result = 31 * result + this.hardwareIds.hashCode()
        result = 31 * result + this.compatibleIds.hashCode()
        result = 31 * result + this.deviceDescription.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.uxdSettings.hashCode()
        return result
    }
}

public data class IoBlock(
    public var uOffset: UInt = 0u,
    public var uLength: UInt = 0u,
    public var pbyData: COpaquePointer? = null,
    public var uIndex: UInt = 0u,
)

public data class IoBlockEx(
    public var uOffset: UInt = 0u,
    public var uLength: UInt = 0u,
    public var pbyData: COpaquePointer? = null,
    public var uIndex: UInt = 0u,
    public var bRequest: UByte = 0u,
    public var bmRequestType: UByte = 0u,
    public var fTransferDirectionIn: UByte = 0u,
)

public data class OsString(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var microsoftString: UShortArray = UShortArray(7),
    public var bVendorCode: UByte = 0u,
    public var anonymous: OsString0 = OsString0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OsString) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.microsoftString.contentEquals(other.microsoftString)) return false
        if (this.bVendorCode != other.bVendorCode) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.microsoftString.contentHashCode()
        result = 31 * result + this.bVendorCode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class OsString0(
    public var bPad: UByte = 0u,
    public var bFlags: UByte = 0u,
)

public data class PacketParameters(
    public var deviceAddress: UByte = 0u,
    public var endpointAddress: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var timeout: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var hubDeviceAddress: UShort = 0u,
    public var portTTNumber: UShort = 0u,
    public var errorCount: UByte = 0u,
    public var pad: UByteArray = UByteArray(3),
    public var usbdStatusCode: Int = 0,
    public var data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketParameters) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.endpointAddress != other.endpointAddress) return false
        if (this.maximumPacketSize != other.maximumPacketSize) return false
        if (this.timeout != other.timeout) return false
        if (this.flags != other.flags) return false
        if (this.dataLength != other.dataLength) return false
        if (this.hubDeviceAddress != other.hubDeviceAddress) return false
        if (this.portTTNumber != other.portTTNumber) return false
        if (this.errorCount != other.errorCount) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.usbdStatusCode != other.usbdStatusCode) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.hashCode()
        result = 31 * result + this.endpointAddress.hashCode()
        result = 31 * result + this.maximumPacketSize.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.hubDeviceAddress.hashCode()
        result = 31 * result + this.portTTNumber.hashCode()
        result = 31 * result + this.errorCount.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.usbdStatusCode.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RawResetPortParameters(
    public var portNumber: UShort = 0u,
    public var portStatus: UShort = 0u,
)

public data class RawRootportFeature(
    public var portNumber: UShort = 0u,
    public var portFeature: UShort = 0u,
    public var portStatus: UShort = 0u,
)

public data class RawRootportParameters(
    public var portNumber: UShort = 0u,
    public var portStatus: UShort = 0u,
)

public data class Urb(
    public var anonymous: Urb0 = Urb0(),
)

public class Urb0(
    public var urbHeader: UrbHeader = UrbHeader(),
    public var urbSelectInterface: UrbSelectInterface = UrbSelectInterface(),
    public var urbSelectConfiguration: UrbSelectConfiguration = UrbSelectConfiguration(),
    public var urbPipeRequest: UrbPipeRequest = UrbPipeRequest(),
    public var urbFrameLengthControl: UrbFrameLengthControl = UrbFrameLengthControl(),
    public var urbGetFrameLength: UrbGetFrameLength = UrbGetFrameLength(),
    public var urbSetFrameLength: UrbSetFrameLength = UrbSetFrameLength(),
    public var urbGetCurrentFrameNumber: UrbGetCurrentFrameNumber = UrbGetCurrentFrameNumber(),
    public var urbControlTransfer: UrbControlTransfer = UrbControlTransfer(),
    public var urbControlTransferEx: UrbControlTransferEx = UrbControlTransferEx(),
    public var urbBulkOrInterruptTransfer: UrbBulkOrInterruptTransfer = UrbBulkOrInterruptTransfer(),
    public var urbIsochronousTransfer: UrbIsochTransfer = UrbIsochTransfer(),
    public var urbControlDescriptorRequest: UrbControlDescriptorRequest = UrbControlDescriptorRequest(),
    public var urbControlGetStatusRequest: UrbControlGetStatusRequest = UrbControlGetStatusRequest(),
    public var urbControlFeatureRequest: UrbControlFeatureRequest = UrbControlFeatureRequest(),
    public var urbControlVendorClassRequest: UrbControlVendorOrClassRequest = UrbControlVendorOrClassRequest(),
    public var urbControlGetInterfaceRequest: UrbControlGetInterfaceRequest = UrbControlGetInterfaceRequest(),
    public var urbControlGetConfigurationRequest: UrbControlGetConfigurationRequest = UrbControlGetConfigurationRequest(),
    public var urbOSFeatureDescriptorRequest: UrbOsFeatureDescriptorRequest = UrbOsFeatureDescriptorRequest(),
    public var urbOpenStaticStreams: UrbOpenStaticStreams = UrbOpenStaticStreams(),
    public var urbGetIsochPipeTransferPathDelays: UrbGetIsochPipeTransferPathDelays = UrbGetIsochPipeTransferPathDelays(),
)

public data class UsbdDeviceInformation(
    public var offsetNext: UInt = 0u,
    public var usbdDeviceHandle: COpaquePointer? = null,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
)

public data class UsbdEndpointOffloadInformation(
    public var size: UInt = 0u,
    public var endpointAddress: UShort = 0u,
    public var resourceId: UInt = 0u,
    public var mode: UsbdEndpointOffloadMode = 0,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var transferSegmentLA: Long = 0L,
    public var transferSegmentVA: COpaquePointer? = null,
    public var transferRingSize: Int = 0,
    public var transferRingInitialCycleBit: UInt = 0u,
    public var messageNumber: UInt = 0u,
    public var eventRingSegmentLA: Long = 0L,
    public var eventRingSegmentVA: COpaquePointer? = null,
    public var eventRingSize: Int = 0,
    public var eventRingInitialCycleBit: UInt = 0u,
)

public data class UsbdInterfaceInformation(
    public var length: UShort = 0u,
    public var interfaceNumber: UByte = 0u,
    public var alternateSetting: UByte = 0u,
    public var cls: UByte = 0u,
    public var subClass: UByte = 0u,
    public var protocol: UByte = 0u,
    public var reserved: UByte = 0u,
    public var interfaceHandle: COpaquePointer? = null,
    public var numberOfPipes: UInt = 0u,
    public var pipes: List<UsbdPipeInformation> = List(1) { UsbdPipeInformation() },
)

public data class UsbdIsoPacketDescriptor(
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
    public var status: Int = 0,
)

public data class UsbdPipeInformation(
    public var maximumPacketSize: UShort = 0u,
    public var endpointAddress: UByte = 0u,
    public var interval: UByte = 0u,
    public var pipeType: UsbdPipeType = 0,
    public var pipeHandle: COpaquePointer? = null,
    public var maximumTransferSize: UInt = 0u,
    public var pipeFlags: UInt = 0u,
)

public data class UsbdStreamInformation(
    public var pipeHandle: COpaquePointer? = null,
    public var streamID: UInt = 0u,
    public var maximumTransferSize: UInt = 0u,
    public var pipeFlags: UInt = 0u,
)

public data class UsbdVersionInformation(
    public var usbdiVersion: UInt = 0u,
    public var supportedUsbVersion: UInt = 0u,
)

public data class UsbfnBusConfigurationInfo(
    public var configurationName: UShortArray = UShortArray(40),
    public var isCurrent: Boolean = false,
    public var isActive: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnBusConfigurationInfo) return false
        if (!this.configurationName.contentEquals(other.configurationName)) return false
        if (this.isCurrent != other.isCurrent) return false
        if (this.isActive != other.isActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.configurationName.contentHashCode()
        result = 31 * result + this.isCurrent.hashCode()
        result = 31 * result + this.isActive.hashCode()
        return result
    }
}

public data class UsbfnClassInformationPacket(
    public var fullSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
    public var highSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
    public var interfaceName: UShortArray = UShortArray(40),
    public var interfaceGuid: UShortArray = UShortArray(39),
    public var hasInterfaceGuid: Boolean = false,
    public var superSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnClassInformationPacket) return false
        if (this.fullSpeedClassInterface != other.fullSpeedClassInterface) return false
        if (this.highSpeedClassInterface != other.highSpeedClassInterface) return false
        if (!this.interfaceName.contentEquals(other.interfaceName)) return false
        if (!this.interfaceGuid.contentEquals(other.interfaceGuid)) return false
        if (this.hasInterfaceGuid != other.hasInterfaceGuid) return false
        if (this.superSpeedClassInterface != other.superSpeedClassInterface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullSpeedClassInterface.hashCode()
        result = 31 * result + this.highSpeedClassInterface.hashCode()
        result = 31 * result + this.interfaceName.contentHashCode()
        result = 31 * result + this.interfaceGuid.contentHashCode()
        result = 31 * result + this.hasInterfaceGuid.hashCode()
        result = 31 * result + this.superSpeedClassInterface.hashCode()
        return result
    }
}

public data class UsbfnClassInformationPacketEx(
    public var fullSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var highSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var superSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var interfaceName: UShortArray = UShortArray(40),
    public var interfaceGuid: UShortArray = UShortArray(39),
    public var hasInterfaceGuid: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnClassInformationPacketEx) return false
        if (this.fullSpeedClassInterfaceEx != other.fullSpeedClassInterfaceEx) return false
        if (this.highSpeedClassInterfaceEx != other.highSpeedClassInterfaceEx) return false
        if (this.superSpeedClassInterfaceEx != other.superSpeedClassInterfaceEx) return false
        if (!this.interfaceName.contentEquals(other.interfaceName)) return false
        if (!this.interfaceGuid.contentEquals(other.interfaceGuid)) return false
        if (this.hasInterfaceGuid != other.hasInterfaceGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.highSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.superSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.interfaceName.contentHashCode()
        result = 31 * result + this.interfaceGuid.contentHashCode()
        result = 31 * result + this.hasInterfaceGuid.hashCode()
        return result
    }
}

public data class UsbfnClassInterface(
    public var interfaceNumber: UByte = 0u,
    public var pipeCount: UByte = 0u,
    public var pipeArr: List<UsbfnPipeInformation> = List(16) { UsbfnPipeInformation() },
)

public data class UsbfnClassInterfaceEx(
    public var baseInterfaceNumber: UByte = 0u,
    public var interfaceCount: UByte = 0u,
    public var pipeCount: UByte = 0u,
    public var pipeArr: List<UsbfnPipeInformation> = List(16) { UsbfnPipeInformation() },
)

public data class UsbfnInterfaceInfo(
    public var interfaceNumber: UByte = 0u,
    public var speed: UsbfnBusSpeed = 0,
    public var size: UShort = 0u,
    public var interfaceDescriptorSet: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnInterfaceInfo) return false
        if (this.interfaceNumber != other.interfaceNumber) return false
        if (this.speed != other.speed) return false
        if (this.size != other.size) return false
        if (!this.interfaceDescriptorSet.contentEquals(other.interfaceDescriptorSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceNumber.hashCode()
        result = 31 * result + this.speed.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.interfaceDescriptorSet.contentHashCode()
        return result
    }
}

public data class UsbfnNotification(
    public var event: UsbfnEvent = 0,
    public var u: UsbfnNotification0 = UsbfnNotification0(),
)

public data class UsbfnNotification0(
    public var busSpeed: UsbfnBusSpeed = 0,
    public var setupPacket: UsbDefaultPipeSetupPacket = UsbDefaultPipeSetupPacket(),
    public var configurationValue: UShort = 0u,
    public var portType: UsbfnPortType = 0,
    public var alternateInterface: AlternateInterface = AlternateInterface(),
)

public data class UsbfnPipeInformation(
    public var epDesc: UsbEndpointDescriptor = UsbEndpointDescriptor(),
    public var pipeId: UInt = 0u,
)

public data class UsbfnUsbString(
    public var stringIndex: UByte = 0u,
    public var usbString: UShortArray = UShortArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnUsbString) return false
        if (this.stringIndex != other.stringIndex) return false
        if (!this.usbString.contentEquals(other.usbString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stringIndex.hashCode()
        result = 31 * result + this.usbString.contentHashCode()
        return result
    }
}

public data class UsbscanGetDescriptor(
    public var descriptorType: UByte = 0u,
    public var index: UByte = 0u,
    public var languageId: UShort = 0u,
)

public data class UsbscanPipeConfiguration(
    public var numberOfPipes: UInt = 0u,
    public var pipeInfo: List<UsbscanPipeInformation> = List(8) { UsbscanPipeInformation() },
)

public data class UsbscanPipeInformation(
    public var maximumPacketSize: UShort = 0u,
    public var endpointAddress: UByte = 0u,
    public var interval: UByte = 0u,
    public var pipeType: RawPipeType = 0,
)

public data class UsbscanTimeout(
    public var timeoutRead: UInt = 0u,
    public var timeoutWrite: UInt = 0u,
    public var timeoutEvent: UInt = 0u,
)

public data class UsbuserBandwidthInfoRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var bandwidthInformation: UsbBandwidthInfo = UsbBandwidthInfo(),
)

public data class UsbuserBusStatistics0Request(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var busStatistics0: UsbBusStatistics0 = UsbBusStatistics0(),
)

public data class UsbuserCloseRawDevice(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbCloseRawDeviceParameters = UsbCloseRawDeviceParameters(),
)

public data class UsbuserControllerInfo0(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var info0: UsbControllerInfo0 = UsbControllerInfo0(),
)

public data class UsbuserControllerUnicodeName(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var unicodeName: UsbUnicodeName = UsbUnicodeName(),
)

public data class UsbuserGetDriverVersion(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbDriverVersionParameters = UsbDriverVersionParameters(),
)

public data class UsbuserGetUsb2hwVersion(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbUsb2hwVersionParameters = UsbUsb2hwVersionParameters(),
)

public data class UsbuserOpenRawDevice(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbOpenRawDeviceParameters = UsbOpenRawDeviceParameters(),
)

public data class UsbuserPassThruRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var passThru: UsbPassThruParameters = UsbPassThruParameters(),
)

public data class UsbuserPowerInfoRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var powerInformation: UsbPowerInfo = UsbPowerInfo(),
)

public data class UsbuserRawResetRootPort(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawResetPortParameters = RawResetPortParameters(),
)

public data class UsbuserRefreshHctReg(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var flags: UInt = 0u,
)

public data class UsbuserRequestHeader(
    public var usbUserRequest: UInt = 0u,
    public var usbUserStatusCode: UsbUserErrorCode = 0,
    public var requestBufferLength: UInt = 0u,
    public var actualBufferLength: UInt = 0u,
)

public data class UsbuserRootportFeatureRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawRootportFeature = RawRootportFeature(),
)

public data class UsbuserRootportParameters(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawRootportParameters = RawRootportParameters(),
)

public data class UsbuserSendOnePacket(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var packetParameters: PacketParameters = PacketParameters(),
)

public data class UsbuserSendRawCommand(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbSendRawCommandParameters = UsbSendRawCommandParameters(),
)

public data class Usb20PortChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb20PortChange0 = Usb20PortChange0(),
)

public data class Usb20PortChange0(
    public var bitfield: UShort = 0u,
)

public data class Usb20PortStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb20PortStatus0 = Usb20PortStatus0(),
)

public data class Usb20PortStatus0(
    public var bitfield: UShort = 0u,
)

public data class Usb30HubDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bNumberOfPorts: UByte = 0u,
    public var wHubCharacteristics: UShort = 0u,
    public var bPowerOnToPowerGood: UByte = 0u,
    public var bHubControlCurrent: UByte = 0u,
    public var bHubHdrDecLat: UByte = 0u,
    public var wHubDelay: UShort = 0u,
    public var deviceRemovable: UShort = 0u,
)

public data class Usb30PortChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb30PortChange0 = Usb30PortChange0(),
)

public data class Usb30PortChange0(
    public var bitfield: UShort = 0u,
)

public data class Usb30PortStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb30PortStatus0 = Usb30PortStatus0(),
)

public data class Usb30PortStatus0(
    public var bitfield: UShort = 0u,
)

public data class UsbAcquireInfo(
    public var notificationType: UsbNotificationType = 0,
    public var totalSize: UInt = 0u,
    public var buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbAcquireInfo) return false
        if (this.notificationType != other.notificationType) return false
        if (this.totalSize != other.totalSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notificationType.hashCode()
        result = 31 * result + this.totalSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class UsbBandwidthInfo(
    public var deviceCount: UInt = 0u,
    public var totalBusBandwidth: UInt = 0u,
    public var total32secBandwidth: UInt = 0u,
    public var allocedBulkAndControl: UInt = 0u,
    public var allocedIso: UInt = 0u,
    public var allocedInterrupt1ms: UInt = 0u,
    public var allocedInterrupt2ms: UInt = 0u,
    public var allocedInterrupt4ms: UInt = 0u,
    public var allocedInterrupt8ms: UInt = 0u,
    public var allocedInterrupt16ms: UInt = 0u,
    public var allocedInterrupt32ms: UInt = 0u,
)

public data class UsbBosDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumDeviceCaps: UByte = 0u,
)

public data class UsbBusNotification(
    public var notificationType: UsbNotificationType = 0,
    public var totalBandwidth: UInt = 0u,
    public var consumedBandwidth: UInt = 0u,
    public var controllerNameLength: UInt = 0u,
)

public data class UsbBusStatistics0(
    public var deviceCount: UInt = 0u,
    public var currentSystemTime: Long = 0L,
    public var currentUsbFrame: UInt = 0u,
    public var bulkBytes: UInt = 0u,
    public var isoBytes: UInt = 0u,
    public var interruptBytes: UInt = 0u,
    public var controlDataBytes: UInt = 0u,
    public var pciInterruptCount: UInt = 0u,
    public var hardResetCount: UInt = 0u,
    public var workerSignalCount: UInt = 0u,
    public var commonBufferBytes: UInt = 0u,
    public var workerIdleTimeMs: UInt = 0u,
    public var rootHubEnabled: Boolean = false,
    public var rootHubDevicePowerState: UByte = 0u,
    public var unused: UByte = 0u,
    public var nameIndex: UByte = 0u,
)

public data class UsbCloseRawDeviceParameters(
    public var xxx: UInt = 0u,
)

public data class UsbCommonDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
)

public data class UsbCompositeDeviceInfo(
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigDescriptor: UsbConfigurationDescriptor = UsbConfigurationDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var numberOfFunctions: UByte = 0u,
    public var functionInfo: List<UsbCompositeFunctionInfo> = List(1) { UsbCompositeFunctionInfo() },
)

public data class UsbCompositeFunctionInfo(
    public var functionNumber: UByte = 0u,
    public var baseInterfaceNumber: UByte = 0u,
    public var numberOfInterfaces: UByte = 0u,
    public var functionIsIdle: Boolean = false,
)

public data class UsbConfigurationDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumInterfaces: UByte = 0u,
    public var bConfigurationValue: UByte = 0u,
    public var iConfiguration: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var maxPower: UByte = 0u,
)

public data class UsbConfigurationPowerDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var selfPowerConsumedD0: UByteArray = UByteArray(3),
    public var bPowerSummaryId: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var transitionTimeFromD1: UShort = 0u,
    public var transitionTimeFromD2: UShort = 0u,
    public var transitionTimeFromD3: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbConfigurationPowerDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.selfPowerConsumedD0.contentEquals(other.selfPowerConsumedD0)) return false
        if (this.bPowerSummaryId != other.bPowerSummaryId) return false
        if (this.bBusPowerSavingD1 != other.bBusPowerSavingD1) return false
        if (this.bSelfPowerSavingD1 != other.bSelfPowerSavingD1) return false
        if (this.bBusPowerSavingD2 != other.bBusPowerSavingD2) return false
        if (this.bSelfPowerSavingD2 != other.bSelfPowerSavingD2) return false
        if (this.bBusPowerSavingD3 != other.bBusPowerSavingD3) return false
        if (this.bSelfPowerSavingD3 != other.bSelfPowerSavingD3) return false
        if (this.transitionTimeFromD1 != other.transitionTimeFromD1) return false
        if (this.transitionTimeFromD2 != other.transitionTimeFromD2) return false
        if (this.transitionTimeFromD3 != other.transitionTimeFromD3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.selfPowerConsumedD0.contentHashCode()
        result = 31 * result + this.bPowerSummaryId.hashCode()
        result = 31 * result + this.bBusPowerSavingD1.hashCode()
        result = 31 * result + this.bSelfPowerSavingD1.hashCode()
        result = 31 * result + this.bBusPowerSavingD2.hashCode()
        result = 31 * result + this.bSelfPowerSavingD2.hashCode()
        result = 31 * result + this.bBusPowerSavingD3.hashCode()
        result = 31 * result + this.bSelfPowerSavingD3.hashCode()
        result = 31 * result + this.transitionTimeFromD1.hashCode()
        result = 31 * result + this.transitionTimeFromD2.hashCode()
        result = 31 * result + this.transitionTimeFromD3.hashCode()
        return result
    }
}

public data class UsbConnectionNotification(
    public var notificationType: UsbNotificationType = 0,
    public var connectionNumber: UInt = 0u,
    public var requestedBandwidth: UInt = 0u,
    public var enumerationFailReason: UInt = 0u,
    public var powerRequested: UInt = 0u,
    public var hubNameLength: UInt = 0u,
)

public data class UsbControllerDeviceInfo(
    public var pciVendorId: UInt = 0u,
    public var pciDeviceId: UInt = 0u,
    public var pciRevision: UInt = 0u,
    public var numberOfRootPorts: UInt = 0u,
    public var hcFeatureFlags: UInt = 0u,
)

public data class UsbControllerInfo0(
    public var pciVendorId: UInt = 0u,
    public var pciDeviceId: UInt = 0u,
    public var pciRevision: UInt = 0u,
    public var numberOfRootPorts: UInt = 0u,
    public var controllerFlavor: UsbControllerFlavor = 0,
    public var hcFeatureFlags: UInt = 0u,
)

public data class UsbCyclePortParams(
    public var connectionIndex: UInt = 0u,
    public var statusReturned: UInt = 0u,
)

public data class UsbDefaultPipeSetupPacket(
    public var bmRequestType: BmRequestType = BmRequestType(),
    public var bRequest: UByte = 0u,
    public var wValue: UsbDefaultPipeSetupPacket0 = UsbDefaultPipeSetupPacket0(),
    public var wIndex: UsbDefaultPipeSetupPacket1 = UsbDefaultPipeSetupPacket1(),
    public var wLength: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket1(
    public var anonymous: UsbDefaultPipeSetupPacket10 = UsbDefaultPipeSetupPacket10(),
    public var w: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket10(
    public var lowByte: UByte = 0u,
    public var hiByte: UByte = 0u,
)

public data class UsbDefaultPipeSetupPacket0(
    public var anonymous: UsbDefaultPipeSetupPacket00 = UsbDefaultPipeSetupPacket00(),
    public var w: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket00(
    public var lowByte: UByte = 0u,
    public var hiByte: UByte = 0u,
)

public data class UsbDescriptorRequest(
    public var connectionIndex: UInt = 0u,
    public var setupPacket: UsbDescriptorRequest0 = UsbDescriptorRequest0(),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDescriptorRequest) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.setupPacket != other.setupPacket) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.setupPacket.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class UsbDescriptorRequest0(
    public var bmRequest: UByte = 0u,
    public var bRequest: UByte = 0u,
    public var wValue: UShort = 0u,
    public var wIndex: UShort = 0u,
    public var wLength: UShort = 0u,
)

public data class UsbDeviceCapabilityBillboardDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var iAddtionalInfoURL: UByte = 0u,
    public var bNumberOfAlternateModes: UByte = 0u,
    public var bPreferredAlternateMode: UByte = 0u,
    public var vconnPower: UsbDeviceCapabilityBillboardDescriptor0 = UsbDeviceCapabilityBillboardDescriptor0(),
    public var bmConfigured: UByteArray = UByteArray(32),
    public var bReserved: UInt = 0u,
    public var alternateMode: List<UsbDeviceCapabilityBillboardDescriptor1> = List(1) { UsbDeviceCapabilityBillboardDescriptor1() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityBillboardDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.iAddtionalInfoURL != other.iAddtionalInfoURL) return false
        if (this.bNumberOfAlternateModes != other.bNumberOfAlternateModes) return false
        if (this.bPreferredAlternateMode != other.bPreferredAlternateMode) return false
        if (this.vconnPower != other.vconnPower) return false
        if (!this.bmConfigured.contentEquals(other.bmConfigured)) return false
        if (this.bReserved != other.bReserved) return false
        if (this.alternateMode != other.alternateMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.iAddtionalInfoURL.hashCode()
        result = 31 * result + this.bNumberOfAlternateModes.hashCode()
        result = 31 * result + this.bPreferredAlternateMode.hashCode()
        result = 31 * result + this.vconnPower.hashCode()
        result = 31 * result + this.bmConfigured.contentHashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.alternateMode.hashCode()
        return result
    }
}

public data class UsbDeviceCapabilityBillboardDescriptor1(
    public var wSVID: UShort = 0u,
    public var bAlternateMode: UByte = 0u,
    public var iAlternateModeSetting: UByte = 0u,
)

public data class UsbDeviceCapabilityBillboardDescriptor0(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilityBillboardDescriptor00 = UsbDeviceCapabilityBillboardDescriptor00(),
)

public data class UsbDeviceCapabilityBillboardDescriptor00(
    public var bitfield: UShort = 0u,
)

public data class UsbDeviceCapabilityContainerIdDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var containerID: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityContainerIdDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (!this.containerID.contentEquals(other.containerID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.containerID.contentHashCode()
        return result
    }
}

public data class UsbDeviceCapabilityDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
)

public data class UsbDeviceCapabilityFirmwareStatusDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bcdDescriptorVersion: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityFirmwareStatusDescriptor0 = UsbDeviceCapabilityFirmwareStatusDescriptor0(),
)

public data class UsbDeviceCapabilityFirmwareStatusDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityFirmwareStatusDescriptor00 = UsbDeviceCapabilityFirmwareStatusDescriptor00(),
)

public data class UsbDeviceCapabilityFirmwareStatusDescriptor00(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceCapabilityPdConsumerPortDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmCapabilities: UsbDeviceCapabilityPdConsumerPortDescriptor0 = UsbDeviceCapabilityPdConsumerPortDescriptor0(),
    public var wMinVoltage: UShort = 0u,
    public var wMaxVoltage: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwMaxOperatingPower: UInt = 0u,
    public var dwMaxPeakPower: UInt = 0u,
    public var dwMaxPeakPowerTime: UInt = 0u,
)

public data class UsbDeviceCapabilityPdConsumerPortDescriptor0(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilityPdConsumerPortDescriptor00 = UsbDeviceCapabilityPdConsumerPortDescriptor00(),
)

public data class UsbDeviceCapabilityPdConsumerPortDescriptor00(
    public var bitfield: UShort = 0u,
)

public data class UsbDeviceCapabilityPlatformDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var platformCapabilityUuid: Guid = Guid(),
    public var capabililityData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityPlatformDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.platformCapabilityUuid != other.platformCapabilityUuid) return false
        if (!this.capabililityData.contentEquals(other.capabililityData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.platformCapabilityUuid.hashCode()
        result = 31 * result + this.capabililityData.contentHashCode()
        return result
    }
}

public data class UsbDeviceCapabilityPowerDeliveryDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityPowerDeliveryDescriptor0 = UsbDeviceCapabilityPowerDeliveryDescriptor0(),
    public var bmProviderPorts: UShort = 0u,
    public var bmConsumerPorts: UShort = 0u,
    public var bcdBCVersion: UShort = 0u,
    public var bcdPDVersion: UShort = 0u,
    public var bcdUSBTypeCVersion: UShort = 0u,
)

public data class UsbDeviceCapabilityPowerDeliveryDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityPowerDeliveryDescriptor00 = UsbDeviceCapabilityPowerDeliveryDescriptor00(),
)

public data class UsbDeviceCapabilityPowerDeliveryDescriptor00(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceCapabilitySuperspeedplusSpeed(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusSpeed0 = UsbDeviceCapabilitySuperspeedplusSpeed0(),
)

public data class UsbDeviceCapabilitySuperspeedplusSpeed0(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilitySuperspeedplusUsbDescriptor0 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor0(),
    public var wFunctionalitySupport: UsbDeviceCapabilitySuperspeedplusUsbDescriptor1 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor1(),
    public var wReserved: UShort = 0u,
    public var bmSublinkSpeedAttr: List<UsbDeviceCapabilitySuperspeedplusSpeed> = List(1) { UsbDeviceCapabilitySuperspeedplusSpeed() },
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusUsbDescriptor00 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor00(),
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor00(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor1(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusUsbDescriptor10 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor10(),
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor10(
    public var bitfield: UShort = 0u,
)

public data class UsbDeviceCapabilitySuperspeedUsbDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wSpeedsSupported: UShort = 0u,
    public var bFunctionalitySupport: UByte = 0u,
    public var bU1DevExitLat: UByte = 0u,
    public var wU2DevExitLat: UShort = 0u,
)

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityUsb20ExtensionDescriptor0 = UsbDeviceCapabilityUsb20ExtensionDescriptor0(),
)

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityUsb20ExtensionDescriptor00 = UsbDeviceCapabilityUsb20ExtensionDescriptor00(),
)

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor00(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceCharacteristics(
    public var version: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var usbDeviceCharacteristicsFlags: UInt = 0u,
    public var maximumSendPathDelayInMilliSeconds: UInt = 0u,
    public var maximumCompletionPathDelayInMilliSeconds: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCharacteristics) return false
        if (this.version != other.version) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.usbDeviceCharacteristicsFlags != other.usbDeviceCharacteristicsFlags) return false
        if (this.maximumSendPathDelayInMilliSeconds != other.maximumSendPathDelayInMilliSeconds) return false
        if (this.maximumCompletionPathDelayInMilliSeconds != other.maximumCompletionPathDelayInMilliSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.usbDeviceCharacteristicsFlags.hashCode()
        result = 31 * result + this.maximumSendPathDelayInMilliSeconds.hashCode()
        result = 31 * result + this.maximumCompletionPathDelayInMilliSeconds.hashCode()
        return result
    }
}

public data class UsbDeviceDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bcdUSB: UShort = 0u,
    public var bDeviceClass: UByte = 0u,
    public var bDeviceSubClass: UByte = 0u,
    public var bDeviceProtocol: UByte = 0u,
    public var bMaxPacketSize0: UByte = 0u,
    public var idVendor: UShort = 0u,
    public var idProduct: UShort = 0u,
    public var bcdDevice: UShort = 0u,
    public var iManufacturer: UByte = 0u,
    public var iProduct: UByte = 0u,
    public var iSerialNumber: UByte = 0u,
    public var bNumConfigurations: UByte = 0u,
)

public data class UsbDeviceInfo(
    public var deviceState: UsbDeviceState = UsbDeviceState(),
    public var portNumber: UShort = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var speed: UsbDeviceSpeed = 0,
    public var deviceAddress: UShort = 0u,
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pnpHardwareId: UShortArray = UShortArray(128),
    public var pnpCompatibleId: UShortArray = UShortArray(128),
    public var serialNumberId: UShortArray = UShortArray(128),
    public var pnpDeviceDescription: UShortArray = UShortArray(128),
    public var numberOfOpenPipes: UInt = 0u,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceInfo) return false
        if (this.deviceState != other.deviceState) return false
        if (this.portNumber != other.portNumber) return false
        if (this.deviceDescriptor != other.deviceDescriptor) return false
        if (this.currentConfigurationValue != other.currentConfigurationValue) return false
        if (this.speed != other.speed) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.connectionStatus != other.connectionStatus) return false
        if (!this.pnpHardwareId.contentEquals(other.pnpHardwareId)) return false
        if (!this.pnpCompatibleId.contentEquals(other.pnpCompatibleId)) return false
        if (!this.serialNumberId.contentEquals(other.serialNumberId)) return false
        if (!this.pnpDeviceDescription.contentEquals(other.pnpDeviceDescription)) return false
        if (this.numberOfOpenPipes != other.numberOfOpenPipes) return false
        if (this.pipeList != other.pipeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceState.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.deviceDescriptor.hashCode()
        result = 31 * result + this.currentConfigurationValue.hashCode()
        result = 31 * result + this.speed.hashCode()
        result = 31 * result + this.deviceAddress.hashCode()
        result = 31 * result + this.connectionIndex.hashCode()
        result = 31 * result + this.connectionStatus.hashCode()
        result = 31 * result + this.pnpHardwareId.contentHashCode()
        result = 31 * result + this.pnpCompatibleId.contentHashCode()
        result = 31 * result + this.serialNumberId.contentHashCode()
        result = 31 * result + this.pnpDeviceDescription.contentHashCode()
        result = 31 * result + this.numberOfOpenPipes.hashCode()
        result = 31 * result + this.pipeList.hashCode()
        return result
    }
}

public data class UsbDeviceNodeInfo(
    public var sig: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var deviceDescription: UShortArray = UShortArray(40),
    public var nodeType: UsbWmiDeviceNodeType = 0,
    public var busAddress: UsbTopologyAddress = UsbTopologyAddress(),
    public var anonymous: UsbDeviceNodeInfo0 = UsbDeviceNodeInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceNodeInfo) return false
        if (this.sig != other.sig) return false
        if (this.lengthInBytes != other.lengthInBytes) return false
        if (!this.deviceDescription.contentEquals(other.deviceDescription)) return false
        if (this.nodeType != other.nodeType) return false
        if (this.busAddress != other.busAddress) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.lengthInBytes.hashCode()
        result = 31 * result + this.deviceDescription.contentHashCode()
        result = 31 * result + this.nodeType.hashCode()
        result = 31 * result + this.busAddress.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class UsbDeviceNodeInfo0(
    public var usbDeviceInfo: UsbDeviceInfo = UsbDeviceInfo(),
    public var hubDeviceInfo: UsbHubDeviceInfo = UsbHubDeviceInfo(),
    public var compositeDeviceInfo: UsbCompositeDeviceInfo = UsbCompositeDeviceInfo(),
    public var controllerDeviceInfo: UsbControllerDeviceInfo = UsbControllerDeviceInfo(),
    public var deviceInformation: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceNodeInfo0) return false
        if (this.usbDeviceInfo != other.usbDeviceInfo) return false
        if (this.hubDeviceInfo != other.hubDeviceInfo) return false
        if (this.compositeDeviceInfo != other.compositeDeviceInfo) return false
        if (this.controllerDeviceInfo != other.controllerDeviceInfo) return false
        if (!this.deviceInformation.contentEquals(other.deviceInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usbDeviceInfo.hashCode()
        result = 31 * result + this.hubDeviceInfo.hashCode()
        result = 31 * result + this.compositeDeviceInfo.hashCode()
        result = 31 * result + this.controllerDeviceInfo.hashCode()
        result = 31 * result + this.deviceInformation.contentHashCode()
        return result
    }
}

public class UsbDevicePerformanceInfo(
    public var bulkBytes: UInt = 0u,
    public var controlDataBytes: UInt = 0u,
    public var isoBytes: UInt = 0u,
    public var interruptBytes: UInt = 0u,
    public var bulkUrbCount: UInt = 0u,
    public var controlUrbCount: UInt = 0u,
    public var isoUrbCount: UInt = 0u,
    public var interruptUrbCount: UInt = 0u,
    public var allocedInterrupt: UIntArray = UIntArray(6),
    public var allocedIso: UInt = 0u,
    public var total32secBandwidth: UInt = 0u,
    public var totalTtBandwidth: UInt = 0u,
    public var deviceDescription: UShortArray = UShortArray(60),
    public var deviceSpeed: UsbDeviceSpeed = 0,
    public var totalIsoLatency: UInt = 0u,
    public var droppedIsoPackets: UInt = 0u,
    public var transferErrors: UInt = 0u,
    public var pciInterruptCount: UInt = 0u,
    public var hcIdleState: UInt = 0u,
    public var hcAsyncIdleState: UInt = 0u,
    public var hcAsyncCacheFlushCount: UInt = 0u,
    public var hcPeriodicIdleState: UInt = 0u,
    public var hcPeriodicCacheFlushCount: UInt = 0u,
)

public data class UsbDeviceQualifierDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bcdUSB: UShort = 0u,
    public var bDeviceClass: UByte = 0u,
    public var bDeviceSubClass: UByte = 0u,
    public var bDeviceProtocol: UByte = 0u,
    public var bMaxPacketSize0: UByte = 0u,
    public var bNumConfigurations: UByte = 0u,
    public var bReserved: UByte = 0u,
)

public data class UsbDeviceState(
    public var bitfield: UInt = 0u,
)

public data class UsbDeviceStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbDeviceStatus0 = UsbDeviceStatus0(),
)

public data class UsbDeviceStatus0(
    public var bitfield: UShort = 0u,
)

public data class UsbDriverVersionParameters(
    public var driverTrackingCode: UInt = 0u,
    public var usbdiVersion: UInt = 0u,
    public var usbuserVersion: UInt = 0u,
    public var checkedPortDriver: Boolean = false,
    public var checkedMiniportDriver: Boolean = false,
    public var usbVersion: UShort = 0u,
)

public data class UsbEndpointDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bEndpointAddress: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wMaxPacketSize: UShort = 0u,
    public var bInterval: UByte = 0u,
)

public data class UsbEndpointStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbEndpointStatus0 = UsbEndpointStatus0(),
)

public data class UsbEndpointStatus0(
    public var bitfield: UShort = 0u,
)

public data class UsbFrameNumberAndQpcForTimeSyncInformation(
    public var timeTrackingHandle: Handle = null,
    public var inputFrameNumber: UInt = 0u,
    public var inputMicroFrameNumber: UInt = 0u,
    public var queryPerformanceCounterAtInputFrameOrMicroFrame: Long = 0L,
    public var queryPerformanceCounterFrequency: Long = 0L,
    public var predictedAccuracyInMicroSeconds: UInt = 0u,
    public var currentGenerationID: UInt = 0u,
    public var currentQueryPerformanceCounter: Long = 0L,
    public var currentHardwareFrameNumber: UInt = 0u,
    public var currentHardwareMicroFrameNumber: UInt = 0u,
    public var currentUSBFrameNumber: UInt = 0u,
)

public data class UsbFunctionSuspendOptions(
    public var asUchar: UByte = 0u,
    public var anonymous: UsbFunctionSuspendOptions0 = UsbFunctionSuspendOptions0(),
)

public data class UsbFunctionSuspendOptions0(
    public var bitfield: UByte = 0u,
)

public data class UsbHcdDriverkeyName(
    public var actualLength: UInt = 0u,
    public var driverKeyName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHcdDriverkeyName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.driverKeyName.contentEquals(other.driverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.driverKeyName.contentHashCode()
        return result
    }
}

public data class UsbHighSpeedMaxpacket(
    public var us: UShort = 0u,
)

public data class UsbHighSpeedMaxpacket0(
    public var bitfield: UShort = 0u,
)

public data class UsbHub30PortRemoteWakeMask(
    public var asUchar8: UByte = 0u,
    public var anonymous: UsbHub30PortRemoteWakeMask0 = UsbHub30PortRemoteWakeMask0(),
)

public data class UsbHub30PortRemoteWakeMask0(
    public var bitfield: UByte = 0u,
)

public data class UsbHubCapabilities(
    public var bitfield: UInt = 0u,
)

public data class UsbHubCapabilitiesEx(
    public var capabilityFlags: UsbHubCapFlags = UsbHubCapFlags(),
)

public data class UsbHubCapFlags(
    public var ul: UInt = 0u,
    public var anonymous: UsbHubCapFlags0 = UsbHubCapFlags0(),
)

public data class UsbHubCapFlags0(
    public var bitfield: UInt = 0u,
)

public data class UsbHubChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbHubChange0 = UsbHubChange0(),
)

public data class UsbHubChange0(
    public var bitfield: UShort = 0u,
)

public data class UsbHubDescriptor(
    public var bDescriptorLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bNumberOfPorts: UByte = 0u,
    public var wHubCharacteristics: UShort = 0u,
    public var bPowerOnToPowerGood: UByte = 0u,
    public var bHubControlCurrent: UByte = 0u,
    public var bRemoveAndPowerMask: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubDescriptor) return false
        if (this.bDescriptorLength != other.bDescriptorLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bNumberOfPorts != other.bNumberOfPorts) return false
        if (this.wHubCharacteristics != other.wHubCharacteristics) return false
        if (this.bPowerOnToPowerGood != other.bPowerOnToPowerGood) return false
        if (this.bHubControlCurrent != other.bHubControlCurrent) return false
        if (!this.bRemoveAndPowerMask.contentEquals(other.bRemoveAndPowerMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bDescriptorLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bNumberOfPorts.hashCode()
        result = 31 * result + this.wHubCharacteristics.hashCode()
        result = 31 * result + this.bPowerOnToPowerGood.hashCode()
        result = 31 * result + this.bHubControlCurrent.hashCode()
        result = 31 * result + this.bRemoveAndPowerMask.contentHashCode()
        return result
    }
}

public data class UsbHubDeviceInfo(
    public var hubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var hubNumber: UInt = 0u,
    public var deviceAddress: UShort = 0u,
    public var hubIsSelfPowered: Boolean = false,
    public var hubIsRootHub: Boolean = false,
    public var hubCapabilities: UsbHubCapabilities = UsbHubCapabilities(),
    public var numberOfHubPorts: UInt = 0u,
    public var portInfo: List<UsbHubPortInformation> = List(1) { UsbHubPortInformation() },
)

public data class UsbHubDeviceUxdSettings(
    public var version: UInt = 0u,
    public var pnpGuid: Guid = Guid(),
    public var ownerGuid: Guid = Guid(),
    public var deleteOnShutdown: UInt = 0u,
    public var deleteOnReload: UInt = 0u,
    public var deleteOnDisconnect: UInt = 0u,
    public var reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubDeviceUxdSettings) return false
        if (this.version != other.version) return false
        if (this.pnpGuid != other.pnpGuid) return false
        if (this.ownerGuid != other.ownerGuid) return false
        if (this.deleteOnShutdown != other.deleteOnShutdown) return false
        if (this.deleteOnReload != other.deleteOnReload) return false
        if (this.deleteOnDisconnect != other.deleteOnDisconnect) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.pnpGuid.hashCode()
        result = 31 * result + this.ownerGuid.hashCode()
        result = 31 * result + this.deleteOnShutdown.hashCode()
        result = 31 * result + this.deleteOnReload.hashCode()
        result = 31 * result + this.deleteOnDisconnect.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class UsbHubInformation(
    public var hubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var hubIsBusPowered: Boolean = false,
)

public data class UsbHubInformationEx(
    public var hubType: UsbHubType = 0,
    public var highestPortNumber: UShort = 0u,
    public var u: UsbHubInformationEx0 = UsbHubInformationEx0(),
)

public data class UsbHubInformationEx0(
    public var usbHubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var usb30HubDescriptor: Usb30HubDescriptor = Usb30HubDescriptor(),
)

public data class UsbHubName(
    public var actualLength: UInt = 0u,
    public var hubName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.hubName.contentEquals(other.hubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.hubName.contentHashCode()
        return result
    }
}

public data class UsbHubPortInformation(
    public var deviceState: UsbDeviceState = UsbDeviceState(),
    public var portNumber: UShort = 0u,
    public var deviceAddress: UShort = 0u,
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
)

public data class UsbHubStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbHubStatus0 = UsbHubStatus0(),
)

public data class UsbHubStatus0(
    public var bitfield: UShort = 0u,
)

public data class UsbHubStatusAndChange(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbHubStatusAndChange0 = UsbHubStatusAndChange0(),
)

public data class UsbHubStatusAndChange0(
    public var hubStatus: UsbHubStatus = UsbHubStatus(),
    public var hubChange: UsbHubChange = UsbHubChange(),
)

public data class UsbIdleCallbackInfo(
    public var idleCallback: UsbIdleCallback = null,
    public var idleContext: COpaquePointer? = null,
)

public data class UsbIdString(
    public var languageId: UShort = 0u,
    public var pad: UShort = 0u,
    public var lengthInBytes: UInt = 0u,
    public var buffer: Pwstr = null,
)

public data class UsbInterfaceAssociationDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bFirstInterface: UByte = 0u,
    public var bInterfaceCount: UByte = 0u,
    public var bFunctionClass: UByte = 0u,
    public var bFunctionSubClass: UByte = 0u,
    public var bFunctionProtocol: UByte = 0u,
    public var iFunction: UByte = 0u,
)

public data class UsbInterfaceDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bInterfaceNumber: UByte = 0u,
    public var bAlternateSetting: UByte = 0u,
    public var bNumEndpoints: UByte = 0u,
    public var bInterfaceClass: UByte = 0u,
    public var bInterfaceSubClass: UByte = 0u,
    public var bInterfaceProtocol: UByte = 0u,
    public var iInterface: UByte = 0u,
)

public data class UsbInterfacePowerDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bmCapabilitiesFlags: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var transitionTimeFromD1: UShort = 0u,
    public var transitionTimeFromD2: UShort = 0u,
    public var transitionTimeFromD3: UShort = 0u,
)

public data class UsbInterfaceStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbInterfaceStatus0 = UsbInterfaceStatus0(),
)

public data class UsbInterfaceStatus0(
    public var bitfield: UShort = 0u,
)

public data class UsbMiParentInformation(
    public var numberOfInterfaces: UInt = 0u,
)

public data class UsbNodeConnectionAttributes(
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var portAttributes: UInt = 0u,
)

public data class UsbNodeConnectionDriverkeyName(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var driverKeyName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbNodeConnectionDriverkeyName) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.driverKeyName.contentEquals(other.driverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.driverKeyName.contentHashCode()
        return result
    }
}

public data class UsbNodeConnectionInformation(
    public var connectionIndex: UInt = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var lowSpeed: Boolean = false,
    public var deviceIsHub: Boolean = false,
    public var deviceAddress: UShort = 0u,
    public var numberOfOpenPipes: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
)

public data class UsbNodeConnectionInformationEx(
    public var connectionIndex: UInt = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var speed: UByte = 0u,
    public var deviceIsHub: Boolean = false,
    public var deviceAddress: UShort = 0u,
    public var numberOfOpenPipes: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
)

public data class UsbNodeConnectionInformationExV2(
    public var connectionIndex: UInt = 0u,
    public var length: UInt = 0u,
    public var supportedUsbProtocols: UsbProtocols = UsbProtocols(),
    public var flags: UsbNodeConnectionInformationExV2Flags = UsbNodeConnectionInformationExV2Flags(),
)

public data class UsbNodeConnectionInformationExV2Flags(
    public var ul: UInt = 0u,
    public var anonymous: UsbNodeConnectionInformationExV2Flags0 = UsbNodeConnectionInformationExV2Flags0(),
)

public data class UsbNodeConnectionInformationExV2Flags0(
    public var bitfield: UInt = 0u,
)

public data class UsbNodeConnectionName(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var nodeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbNodeConnectionName) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.nodeName.contentEquals(other.nodeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.nodeName.contentHashCode()
        return result
    }
}

public data class UsbNodeInformation(
    public var nodeType: UsbHubNode = 0,
    public var u: UsbNodeInformation0 = UsbNodeInformation0(),
)

public data class UsbNodeInformation0(
    public var hubInformation: UsbHubInformation = UsbHubInformation(),
    public var miParentInformation: UsbMiParentInformation = UsbMiParentInformation(),
)

public data class UsbNotification(
    public var notificationType: UsbNotificationType = 0,
)

public data class UsbOpenRawDeviceParameters(
    public var portStatus: UShort = 0u,
    public var maxPacketEp0: UShort = 0u,
)

public data class UsbPassThruParameters(
    public var functionGUID: Guid = Guid(),
    public var parameterLength: UInt = 0u,
    public var parameters: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbPassThruParameters) return false
        if (this.functionGUID != other.functionGUID) return false
        if (this.parameterLength != other.parameterLength) return false
        if (!this.parameters.contentEquals(other.parameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.functionGUID.hashCode()
        result = 31 * result + this.parameterLength.hashCode()
        result = 31 * result + this.parameters.contentHashCode()
        return result
    }
}

public data class UsbPipeInfo(
    public var endpointDescriptor: UsbEndpointDescriptor = UsbEndpointDescriptor(),
    public var scheduleOffset: UInt = 0u,
)

public data class UsbPortChange(
    public var asUshort16: UShort = 0u,
    public var usb20PortChange: Usb20PortChange = Usb20PortChange(),
    public var usb30PortChange: Usb30PortChange = Usb30PortChange(),
)

public data class UsbPortConnectorProperties(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var usbPortProperties: UsbPortProperties = UsbPortProperties(),
    public var companionIndex: UShort = 0u,
    public var companionPortNumber: UShort = 0u,
    public var companionHubSymbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbPortConnectorProperties) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (this.usbPortProperties != other.usbPortProperties) return false
        if (this.companionIndex != other.companionIndex) return false
        if (this.companionPortNumber != other.companionPortNumber) return false
        if (!this.companionHubSymbolicLinkName.contentEquals(other.companionHubSymbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.usbPortProperties.hashCode()
        result = 31 * result + this.companionIndex.hashCode()
        result = 31 * result + this.companionPortNumber.hashCode()
        result = 31 * result + this.companionHubSymbolicLinkName.contentHashCode()
        return result
    }
}

public data class UsbPortExtStatus(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbPortExtStatus0 = UsbPortExtStatus0(),
)

public data class UsbPortExtStatus0(
    public var bitfield: UInt = 0u,
)

public data class UsbPortExtStatusAndChange(
    public var asUlong64: ULong = 0uL,
    public var anonymous: UsbPortExtStatusAndChange0 = UsbPortExtStatusAndChange0(),
)

public data class UsbPortExtStatusAndChange0(
    public var portStatusChange: UsbPortStatusAndChange = UsbPortStatusAndChange(),
    public var portExtStatus: UsbPortExtStatus = UsbPortExtStatus(),
)

public data class UsbPortProperties(
    public var ul: UInt = 0u,
    public var anonymous: UsbPortProperties0 = UsbPortProperties0(),
)

public data class UsbPortProperties0(
    public var bitfield: UInt = 0u,
)

public data class UsbPortStatus(
    public var asUshort16: UShort = 0u,
    public var usb20PortStatus: Usb20PortStatus = Usb20PortStatus(),
    public var usb30PortStatus: Usb30PortStatus = Usb30PortStatus(),
)

public data class UsbPortStatusAndChange(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbPortStatusAndChange0 = UsbPortStatusAndChange0(),
)

public data class UsbPortStatusAndChange0(
    public var portStatus: UsbPortStatus = UsbPortStatus(),
    public var portChange: UsbPortChange = UsbPortChange(),
)

public data class UsbPowerInfo(
    public var systemState: WdmusbPowerState = 0,
    public var hcDevicePowerState: WdmusbPowerState = 0,
    public var hcDeviceWake: WdmusbPowerState = 0,
    public var hcSystemWake: WdmusbPowerState = 0,
    public var rhDevicePowerState: WdmusbPowerState = 0,
    public var rhDeviceWake: WdmusbPowerState = 0,
    public var rhSystemWake: WdmusbPowerState = 0,
    public var lastSystemSleepState: WdmusbPowerState = 0,
    public var canWakeup: Boolean = false,
    public var isPowered: Boolean = false,
)

public data class UsbProtocols(
    public var ul: UInt = 0u,
    public var anonymous: UsbProtocols0 = UsbProtocols0(),
)

public data class UsbProtocols0(
    public var bitfield: UInt = 0u,
)

public data class UsbRootHubName(
    public var actualLength: UInt = 0u,
    public var rootHubName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbRootHubName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.rootHubName.contentEquals(other.rootHubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.rootHubName.contentHashCode()
        return result
    }
}

public data class UsbSendRawCommandParameters(
    public var usbBmRequest: UByte = 0u,
    public var usbBRequest: UByte = 0u,
    public var usbWVlaue: UShort = 0u,
    public var usbWIndex: UShort = 0u,
    public var usbWLength: UShort = 0u,
    public var deviceAddress: UShort = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var timeout: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var usbdStatusCode: Int = 0,
    public var data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbSendRawCommandParameters) return false
        if (this.usbBmRequest != other.usbBmRequest) return false
        if (this.usbBRequest != other.usbBRequest) return false
        if (this.usbWVlaue != other.usbWVlaue) return false
        if (this.usbWIndex != other.usbWIndex) return false
        if (this.usbWLength != other.usbWLength) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.maximumPacketSize != other.maximumPacketSize) return false
        if (this.timeout != other.timeout) return false
        if (this.dataLength != other.dataLength) return false
        if (this.usbdStatusCode != other.usbdStatusCode) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usbBmRequest.hashCode()
        result = 31 * result + this.usbBRequest.hashCode()
        result = 31 * result + this.usbWVlaue.hashCode()
        result = 31 * result + this.usbWIndex.hashCode()
        result = 31 * result + this.usbWLength.hashCode()
        result = 31 * result + this.deviceAddress.hashCode()
        result = 31 * result + this.maximumPacketSize.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.usbdStatusCode.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class UsbStartTrackingForTimeSyncInformation(
    public var timeTrackingHandle: Handle = null,
    public var isStartupDelayTolerable: Boolean = false,
)

public data class UsbStopTrackingForTimeSyncInformation(
    public var timeTrackingHandle: Handle = null,
)

public data class UsbStringDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbStringDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.bString.contentEquals(other.bString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bString.contentHashCode()
        return result
    }
}

public data class UsbSuperspeedplusIsochEndpointCompanionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wReserved: UShort = 0u,
    public var dwBytesPerInterval: UInt = 0u,
)

public data class UsbSuperspeedEndpointCompanionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bMaxBurst: UByte = 0u,
    public var bmAttributes: UsbSuperspeedEndpointCompanionDescriptor0 = UsbSuperspeedEndpointCompanionDescriptor0(),
    public var wBytesPerInterval: UShort = 0u,
)

public data class UsbSuperspeedEndpointCompanionDescriptor0(
    public var asUchar: UByte = 0u,
    public var bulk: UsbSuperspeedEndpointCompanionDescriptor00 = UsbSuperspeedEndpointCompanionDescriptor00(),
    public var isochronous: UsbSuperspeedEndpointCompanionDescriptor01 = UsbSuperspeedEndpointCompanionDescriptor01(),
)

public data class UsbSuperspeedEndpointCompanionDescriptor00(
    public var bitfield: UByte = 0u,
)

public data class UsbSuperspeedEndpointCompanionDescriptor01(
    public var bitfield: UByte = 0u,
)

public data class UsbTopologyAddress(
    public var pciBusNumber: UInt = 0u,
    public var pciDeviceNumber: UInt = 0u,
    public var pciFunctionNumber: UInt = 0u,
    public var reserved: UInt = 0u,
    public var rootHubPortNumber: UShort = 0u,
    public var hubPortNumber: UShortArray = UShortArray(5),
    public var reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbTopologyAddress) return false
        if (this.pciBusNumber != other.pciBusNumber) return false
        if (this.pciDeviceNumber != other.pciDeviceNumber) return false
        if (this.pciFunctionNumber != other.pciFunctionNumber) return false
        if (this.reserved != other.reserved) return false
        if (this.rootHubPortNumber != other.rootHubPortNumber) return false
        if (!this.hubPortNumber.contentEquals(other.hubPortNumber)) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pciBusNumber.hashCode()
        result = 31 * result + this.pciDeviceNumber.hashCode()
        result = 31 * result + this.pciFunctionNumber.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.rootHubPortNumber.hashCode()
        result = 31 * result + this.hubPortNumber.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class UsbTransportCharacteristics(
    public var version: UInt = 0u,
    public var transportCharacteristicsFlags: UInt = 0u,
    public var currentRoundtripLatencyInMilliSeconds: ULong = 0uL,
    public var maxPotentialBandwidth: ULong = 0uL,
)

public data class UsbTransportCharacteristicsChangeNotification(
    public var handle: UsbChangeRegistrationHandle = null,
    public var usbTransportCharacteristics: UsbTransportCharacteristics = UsbTransportCharacteristics(),
)

public data class UsbTransportCharacteristicsChangeRegistration(
    public var changeNotificationInputFlags: UInt = 0u,
    public var handle: UsbChangeRegistrationHandle = null,
    public var usbTransportCharacteristics: UsbTransportCharacteristics = UsbTransportCharacteristics(),
)

public data class UsbTransportCharacteristicsChangeUnregistration(
    public var handle: UsbChangeRegistrationHandle = null,
)

public data class UsbUnicodeName(
    public var length: UInt = 0u,
    public var string: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbUnicodeName) return false
        if (this.length != other.length) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.string.contentHashCode()
        return result
    }
}

public data class UsbUsb2hwVersionParameters(
    public var usb2HwRevision: UByte = 0u,
)

public data class WinusbPipeInformation(
    public var pipeType: UsbdPipeType = 0,
    public var pipeId: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var interval: UByte = 0u,
)

public data class WinusbPipeInformationEx(
    public var pipeType: UsbdPipeType = 0,
    public var pipeId: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var interval: UByte = 0u,
    public var maximumBytesPerInterval: UInt = 0u,
)

public data class WinusbSetupPacket(
    public var requestType: UByte = 0u,
    public var request: UByte = 0u,
    public var value: UShort = 0u,
    public var index: UShort = 0u,
    public var length: UShort = 0u,
)

public data class UrbBulkOrInterruptTransfer(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var transferFlags: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
)

public data class UrbControlDescriptorRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved0: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var reserved1: UShort = 0u,
    public var index: UByte = 0u,
    public var descriptorType: UByte = 0u,
    public var languageId: UShort = 0u,
    public var reserved2: UShort = 0u,
)

public data class UrbControlFeatureRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved2: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var reserved4: COpaquePointer? = null,
    public var reserved5: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var reserved0: UShort = 0u,
    public var featureSelector: UShort = 0u,
    public var index: UShort = 0u,
    public var reserved1: UShort = 0u,
)

public data class UrbControlGetConfigurationRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved0: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var reserved1: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetConfigurationRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class UrbControlGetInterfaceRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved0: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var reserved1: UByteArray = UByteArray(4),
    public var iface: UShort = 0u,
    public var reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetInterfaceRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.iface != other.iface) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.iface.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class UrbControlGetStatusRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved0: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var reserved1: UByteArray = UByteArray(4),
    public var index: UShort = 0u,
    public var reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetStatusRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.index != other.index) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class UrbControlTransfer(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var transferFlags: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var setupPacket: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlTransfer) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.setupPacket.contentEquals(other.setupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.setupPacket.contentHashCode()
        return result
    }
}

public data class UrbControlTransferEx(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var transferFlags: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var timeout: UInt = 0u,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var setupPacket: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlTransferEx) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.timeout != other.timeout) return false
        if (this.hca != other.hca) return false
        if (!this.setupPacket.contentEquals(other.setupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.setupPacket.contentHashCode()
        return result
    }
}

public data class UrbControlVendorOrClassRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var transferFlags: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var requestTypeReservedBits: UByte = 0u,
    public var request: UByte = 0u,
    public var value: UShort = 0u,
    public var index: UShort = 0u,
    public var reserved1: UShort = 0u,
)

public data class UrbFrameLengthControl(
    public var hdr: UrbHeader = UrbHeader(),
)

public data class UrbGetCurrentFrameNumber(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameNumber: UInt = 0u,
)

public data class UrbGetFrameLength(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameLength: UInt = 0u,
    public var frameNumber: UInt = 0u,
)

public data class UrbGetIsochPipeTransferPathDelays(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var maximumSendPathDelayInMilliSeconds: UInt = 0u,
    public var maximumCompletionPathDelayInMilliSeconds: UInt = 0u,
)

public data class UrbHcdArea(
    public var reserved8: List<COpaquePointer> = List(8) { COpaquePointer(0L) },
)

public data class UrbHeader(
    public var length: UShort = 0u,
    public var function: UShort = 0u,
    public var status: Int = 0,
    public var usbdDeviceHandle: COpaquePointer? = null,
    public var usbdFlags: UInt = 0u,
)

public data class UrbIsochTransfer(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var transferFlags: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var startFrame: UInt = 0u,
    public var numberOfPackets: UInt = 0u,
    public var errorCount: UInt = 0u,
    public var isoPacket: List<UsbdIsoPacketDescriptor> = List(1) { UsbdIsoPacketDescriptor() },
)

public data class UrbOpenStaticStreams(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var numberOfStreams: UInt = 0u,
    public var streamInfoVersion: UShort = 0u,
    public var streamInfoSize: UShort = 0u,
    public var streams: UsbdStreamInformation? = null,
)

public data class UrbOsFeatureDescriptorRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var reserved: COpaquePointer? = null,
    public var reserved0: UInt = 0u,
    public var transferBufferLength: UInt = 0u,
    public var transferBuffer: COpaquePointer? = null,
    public var transferBufferMDL: COpaquePointer? = null,
    public var urbLink: Urb? = null,
    public var hca: UrbHcdArea = UrbHcdArea(),
    public var bitfield: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var interfaceNumber: UByte = 0u,
    public var msPageIndex: UByte = 0u,
    public var msFeatureDescriptorIndex: UShort = 0u,
    public var reserved3: UShort = 0u,
)

public data class UrbPipeRequest(
    public var hdr: UrbHeader = UrbHeader(),
    public var pipeHandle: COpaquePointer? = null,
    public var reserved: UInt = 0u,
)

public data class UrbSelectConfiguration(
    public var hdr: UrbHeader = UrbHeader(),
    public var configurationDescriptor: UsbConfigurationDescriptor? = null,
    public var configurationHandle: COpaquePointer? = null,
    public var iface: UsbdInterfaceInformation = UsbdInterfaceInformation(),
)

public data class UrbSelectInterface(
    public var hdr: UrbHeader = UrbHeader(),
    public var configurationHandle: COpaquePointer? = null,
    public var iface: UsbdInterfaceInformation = UsbdInterfaceInformation(),
)

public data class UrbSetFrameLength(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameLengthDelta: Int = 0,
)
