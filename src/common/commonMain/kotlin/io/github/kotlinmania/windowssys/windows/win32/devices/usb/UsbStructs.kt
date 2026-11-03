@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ALTERNATE_INTERFACE(public var InterfaceNumber: UShort = 0u, public var AlternateInterfaceNumber: UShort = 0u)

public data class BM_REQUEST_TYPE(public var s: BM_REQUEST_TYPE_0 = BM_REQUEST_TYPE_0(), public var B: UByte = 0u)

public data class BM_REQUEST_TYPE_0(public var _bitfield: UByte = 0u)

public data class CHANNEL_INFO(
    public var EventChannelSize: UInt = 0u,
    public var uReadDataAlignment: UInt = 0u,
    public var uWriteDataAlignment: UInt = 0u,
)

public data class DEVICE_DESCRIPTOR(
    public var usVendorId: UShort = 0u,
    public var usProductId: UShort = 0u,
    public var usBcdDevice: UShort = 0u,
    public var usLanguageId: UShort = 0u,
)

public data class DRV_VERSION(
    public var major: UInt = 0u,
    public var minor: UInt = 0u,
    public var internal: UInt = 0u,
)

public class HCD_ISO_STAT_COUNTERS(
    public var LateUrbs: UShort = 0u,
    public var DoubleBufferedPackets: UShort = 0u,
    public var TransfersCF_5ms: UShort = 0u,
    public var TransfersCF_2ms: UShort = 0u,
    public var TransfersCF_1ms: UShort = 0u,
    public var MaxInterruptLatency: UShort = 0u,
    public var BadStartFrame: UShort = 0u,
    public var StaleUrbs: UShort = 0u,
    public var IsoPacketNotAccesed: UShort = 0u,
    public var IsoPacketHWError: UShort = 0u,
    public var SmallestUrbPacketCount: UShort = 0u,
    public var LargestUrbPacketCount: UShort = 0u,
    public var IsoCRC_Error: UShort = 0u,
    public var IsoOVERRUN_Error: UShort = 0u,
    public var IsoINTERNAL_Error: UShort = 0u,
    public var IsoUNKNOWN_Error: UShort = 0u,
    public var IsoBytesTransferred: UInt = 0u,
    public var LateMissedCount: UShort = 0u,
    public var HWIsoMissedCount: UShort = 0u,
    public var Reserved7: UIntArray = UIntArray(8),
)

public data class HCD_STAT_COUNTERS(
    public var BytesTransferred: UInt = 0u,
    public var IsoMissedCount: UShort = 0u,
    public var DataOverrunErrorCount: UShort = 0u,
    public var CrcErrorCount: UShort = 0u,
    public var ScheduleOverrunCount: UShort = 0u,
    public var TimeoutErrorCount: UShort = 0u,
    public var InternalHcErrorCount: UShort = 0u,
    public var BufferOverrunErrorCount: UShort = 0u,
    public var SWErrorCount: UShort = 0u,
    public var StallPidCount: UShort = 0u,
    public var PortDisableCount: UShort = 0u,
)

public data class HCD_STAT_INFORMATION_1(
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var ResetCounters: UInt = 0u,
    public var TimeRead: Long = 0L,
    public var Counters: HCD_STAT_COUNTERS = HCD_STAT_COUNTERS(),
)

public data class HCD_STAT_INFORMATION_2(
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var ResetCounters: UInt = 0u,
    public var TimeRead: Long = 0L,
    public var LockedMemoryUsed: Int = 0,
    public var Counters: HCD_STAT_COUNTERS = HCD_STAT_COUNTERS(),
    public var IsoCounters: HCD_ISO_STAT_COUNTERS = HCD_ISO_STAT_COUNTERS(),
)

public data class HUB_DEVICE_CONFIG_INFO(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var HubFlags: USB_HUB_CAP_FLAGS = USB_HUB_CAP_FLAGS(),
    public var HardwareIds: USB_ID_STRING = USB_ID_STRING(),
    public var CompatibleIds: USB_ID_STRING = USB_ID_STRING(),
    public var DeviceDescription: USB_ID_STRING = USB_ID_STRING(),
    public var Reserved: UIntArray = UIntArray(19),
    public var UxdSettings: USB_HUB_DEVICE_UXD_SETTINGS = USB_HUB_DEVICE_UXD_SETTINGS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HUB_DEVICE_CONFIG_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.HubFlags != other.HubFlags) return false
        if (this.HardwareIds != other.HardwareIds) return false
        if (this.CompatibleIds != other.CompatibleIds) return false
        if (this.DeviceDescription != other.DeviceDescription) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.UxdSettings != other.UxdSettings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.HubFlags.hashCode()
        result = 31 * result + this.HardwareIds.hashCode()
        result = 31 * result + this.CompatibleIds.hashCode()
        result = 31 * result + this.DeviceDescription.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.UxdSettings.hashCode()
        return result
    }
}

public data class IO_BLOCK(
    public var uOffset: UInt = 0u,
    public var uLength: UInt = 0u,
    public var pbyData: Long = 0L,
    public var uIndex: UInt = 0u,
)

public data class IO_BLOCK_EX(
    public var uOffset: UInt = 0u,
    public var uLength: UInt = 0u,
    public var pbyData: Long = 0L,
    public var uIndex: UInt = 0u,
    public var bRequest: UByte = 0u,
    public var bmRequestType: UByte = 0u,
    public var fTransferDirectionIn: UByte = 0u,
)

public data class OS_STRING(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var MicrosoftString: UShortArray = UShortArray(7),
    public var bVendorCode: UByte = 0u,
    public var Anonymous: OS_STRING_0 = OS_STRING_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OS_STRING) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.MicrosoftString.contentEquals(other.MicrosoftString)) return false
        if (this.bVendorCode != other.bVendorCode) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.MicrosoftString.contentHashCode()
        result = 31 * result + this.bVendorCode.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class OS_STRING_0(public var bPad: UByte = 0u, public var bFlags: UByte = 0u)

public data class PACKET_PARAMETERS(
    public var DeviceAddress: UByte = 0u,
    public var EndpointAddress: UByte = 0u,
    public var MaximumPacketSize: UShort = 0u,
    public var Timeout: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var HubDeviceAddress: UShort = 0u,
    public var PortTTNumber: UShort = 0u,
    public var ErrorCount: UByte = 0u,
    public var Pad: UByteArray = UByteArray(3),
    public var UsbdStatusCode: Int = 0,
    public var Data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PACKET_PARAMETERS) return false
        if (this.DeviceAddress != other.DeviceAddress) return false
        if (this.EndpointAddress != other.EndpointAddress) return false
        if (this.MaximumPacketSize != other.MaximumPacketSize) return false
        if (this.Timeout != other.Timeout) return false
        if (this.Flags != other.Flags) return false
        if (this.DataLength != other.DataLength) return false
        if (this.HubDeviceAddress != other.HubDeviceAddress) return false
        if (this.PortTTNumber != other.PortTTNumber) return false
        if (this.ErrorCount != other.ErrorCount) return false
        if (!this.Pad.contentEquals(other.Pad)) return false
        if (this.UsbdStatusCode != other.UsbdStatusCode) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceAddress.hashCode()
        result = 31 * result + this.EndpointAddress.hashCode()
        result = 31 * result + this.MaximumPacketSize.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.HubDeviceAddress.hashCode()
        result = 31 * result + this.PortTTNumber.hashCode()
        result = 31 * result + this.ErrorCount.hashCode()
        result = 31 * result + this.Pad.contentHashCode()
        result = 31 * result + this.UsbdStatusCode.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class RAW_RESET_PORT_PARAMETERS(public var PortNumber: UShort = 0u, public var PortStatus: UShort = 0u)

public data class RAW_ROOTPORT_FEATURE(
    public var PortNumber: UShort = 0u,
    public var PortFeature: UShort = 0u,
    public var PortStatus: UShort = 0u,
)

public data class RAW_ROOTPORT_PARAMETERS(public var PortNumber: UShort = 0u, public var PortStatus: UShort = 0u)

public data class URB(public var Anonymous: URB_0 = URB_0())

public class URB_0(
    public var UrbHeader: _URB_HEADER = _URB_HEADER(),
    public var UrbSelectInterface: _URB_SELECT_INTERFACE = _URB_SELECT_INTERFACE(),
    public var UrbSelectConfiguration: _URB_SELECT_CONFIGURATION = _URB_SELECT_CONFIGURATION(),
    public var UrbPipeRequest: _URB_PIPE_REQUEST = _URB_PIPE_REQUEST(),
    public var UrbFrameLengthControl: _URB_FRAME_LENGTH_CONTROL = _URB_FRAME_LENGTH_CONTROL(),
    public var UrbGetFrameLength: _URB_GET_FRAME_LENGTH = _URB_GET_FRAME_LENGTH(),
    public var UrbSetFrameLength: _URB_SET_FRAME_LENGTH = _URB_SET_FRAME_LENGTH(),
    public var UrbGetCurrentFrameNumber: _URB_GET_CURRENT_FRAME_NUMBER = _URB_GET_CURRENT_FRAME_NUMBER(),
    public var UrbControlTransfer: _URB_CONTROL_TRANSFER = _URB_CONTROL_TRANSFER(),
    public var UrbControlTransferEx: _URB_CONTROL_TRANSFER_EX = _URB_CONTROL_TRANSFER_EX(),
    public var UrbBulkOrInterruptTransfer: _URB_BULK_OR_INTERRUPT_TRANSFER = _URB_BULK_OR_INTERRUPT_TRANSFER(),
    public var UrbIsochronousTransfer: _URB_ISOCH_TRANSFER = _URB_ISOCH_TRANSFER(),
    public var UrbControlDescriptorRequest: _URB_CONTROL_DESCRIPTOR_REQUEST = _URB_CONTROL_DESCRIPTOR_REQUEST(),
    public var UrbControlGetStatusRequest: _URB_CONTROL_GET_STATUS_REQUEST = _URB_CONTROL_GET_STATUS_REQUEST(),
    public var UrbControlFeatureRequest: _URB_CONTROL_FEATURE_REQUEST = _URB_CONTROL_FEATURE_REQUEST(),
    public var UrbControlVendorClassRequest: _URB_CONTROL_VENDOR_OR_CLASS_REQUEST = _URB_CONTROL_VENDOR_OR_CLASS_REQUEST(),
    public var UrbControlGetInterfaceRequest: _URB_CONTROL_GET_INTERFACE_REQUEST = _URB_CONTROL_GET_INTERFACE_REQUEST(),
    public var UrbControlGetConfigurationRequest: _URB_CONTROL_GET_CONFIGURATION_REQUEST = _URB_CONTROL_GET_CONFIGURATION_REQUEST(),
    public var UrbOSFeatureDescriptorRequest: _URB_OS_FEATURE_DESCRIPTOR_REQUEST = _URB_OS_FEATURE_DESCRIPTOR_REQUEST(),
    public var UrbOpenStaticStreams: _URB_OPEN_STATIC_STREAMS = _URB_OPEN_STATIC_STREAMS(),
    public var UrbGetIsochPipeTransferPathDelays: _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS = _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS(),
)

public data class USBD_DEVICE_INFORMATION(
    public var OffsetNext: UInt = 0u,
    public var UsbdDeviceHandle: Long = 0L,
    public var DeviceDescriptor: USB_DEVICE_DESCRIPTOR = USB_DEVICE_DESCRIPTOR(),
)

public data class USBD_ENDPOINT_OFFLOAD_INFORMATION(
    public var Size: UInt = 0u,
    public var EndpointAddress: UShort = 0u,
    public var ResourceId: UInt = 0u,
    public var Mode: USBD_ENDPOINT_OFFLOAD_MODE = 0,
    public var _bitfield1: UInt = 0u,
    public var _bitfield2: UInt = 0u,
    public var TransferSegmentLA: Long = 0L,
    public var TransferSegmentVA: Long = 0L,
    public var TransferRingSize: ULong = 0uL,
    public var TransferRingInitialCycleBit: UInt = 0u,
    public var MessageNumber: UInt = 0u,
    public var EventRingSegmentLA: Long = 0L,
    public var EventRingSegmentVA: Long = 0L,
    public var EventRingSize: ULong = 0uL,
    public var EventRingInitialCycleBit: UInt = 0u,
)

public data class USBD_INTERFACE_INFORMATION(
    public var Length: UShort = 0u,
    public var InterfaceNumber: UByte = 0u,
    public var AlternateSetting: UByte = 0u,
    public var Class: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var Protocol: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var InterfaceHandle: Long = 0L,
    public var NumberOfPipes: UInt = 0u,
    public var Pipes: List<USBD_PIPE_INFORMATION> = List(1) { USBD_PIPE_INFORMATION() },
)

public data class USBD_ISO_PACKET_DESCRIPTOR(
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
    public var Status: Int = 0,
)

public data class USBD_PIPE_INFORMATION(
    public var MaximumPacketSize: UShort = 0u,
    public var EndpointAddress: UByte = 0u,
    public var Interval: UByte = 0u,
    public var PipeType: USBD_PIPE_TYPE = 0,
    public var PipeHandle: Long = 0L,
    public var MaximumTransferSize: UInt = 0u,
    public var PipeFlags: UInt = 0u,
)

public data class USBD_STREAM_INFORMATION(
    public var PipeHandle: Long = 0L,
    public var StreamID: UInt = 0u,
    public var MaximumTransferSize: UInt = 0u,
    public var PipeFlags: UInt = 0u,
)

public data class USBD_VERSION_INFORMATION(public var USBDI_Version: UInt = 0u, public var Supported_USB_Version: UInt = 0u)

public data class USBFN_BUS_CONFIGURATION_INFO(
    public var ConfigurationName: UShortArray = UShortArray(40),
    public var IsCurrent: Boolean = false,
    public var IsActive: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USBFN_BUS_CONFIGURATION_INFO) return false
        if (!this.ConfigurationName.contentEquals(other.ConfigurationName)) return false
        if (this.IsCurrent != other.IsCurrent) return false
        if (this.IsActive != other.IsActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConfigurationName.contentHashCode()
        result = 31 * result + this.IsCurrent.hashCode()
        result = 31 * result + this.IsActive.hashCode()
        return result
    }
}

public data class USBFN_CLASS_INFORMATION_PACKET(
    public var FullSpeedClassInterface: USBFN_CLASS_INTERFACE = USBFN_CLASS_INTERFACE(),
    public var HighSpeedClassInterface: USBFN_CLASS_INTERFACE = USBFN_CLASS_INTERFACE(),
    public var InterfaceName: UShortArray = UShortArray(40),
    public var InterfaceGuid: UShortArray = UShortArray(39),
    public var HasInterfaceGuid: Boolean = false,
    public var SuperSpeedClassInterface: USBFN_CLASS_INTERFACE = USBFN_CLASS_INTERFACE(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USBFN_CLASS_INFORMATION_PACKET) return false
        if (this.FullSpeedClassInterface != other.FullSpeedClassInterface) return false
        if (this.HighSpeedClassInterface != other.HighSpeedClassInterface) return false
        if (!this.InterfaceName.contentEquals(other.InterfaceName)) return false
        if (!this.InterfaceGuid.contentEquals(other.InterfaceGuid)) return false
        if (this.HasInterfaceGuid != other.HasInterfaceGuid) return false
        if (this.SuperSpeedClassInterface != other.SuperSpeedClassInterface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FullSpeedClassInterface.hashCode()
        result = 31 * result + this.HighSpeedClassInterface.hashCode()
        result = 31 * result + this.InterfaceName.contentHashCode()
        result = 31 * result + this.InterfaceGuid.contentHashCode()
        result = 31 * result + this.HasInterfaceGuid.hashCode()
        result = 31 * result + this.SuperSpeedClassInterface.hashCode()
        return result
    }
}

public data class USBFN_CLASS_INFORMATION_PACKET_EX(
    public var FullSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX = USBFN_CLASS_INTERFACE_EX(),
    public var HighSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX = USBFN_CLASS_INTERFACE_EX(),
    public var SuperSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX = USBFN_CLASS_INTERFACE_EX(),
    public var InterfaceName: UShortArray = UShortArray(40),
    public var InterfaceGuid: UShortArray = UShortArray(39),
    public var HasInterfaceGuid: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USBFN_CLASS_INFORMATION_PACKET_EX) return false
        if (this.FullSpeedClassInterfaceEx != other.FullSpeedClassInterfaceEx) return false
        if (this.HighSpeedClassInterfaceEx != other.HighSpeedClassInterfaceEx) return false
        if (this.SuperSpeedClassInterfaceEx != other.SuperSpeedClassInterfaceEx) return false
        if (!this.InterfaceName.contentEquals(other.InterfaceName)) return false
        if (!this.InterfaceGuid.contentEquals(other.InterfaceGuid)) return false
        if (this.HasInterfaceGuid != other.HasInterfaceGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FullSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.HighSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.SuperSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.InterfaceName.contentHashCode()
        result = 31 * result + this.InterfaceGuid.contentHashCode()
        result = 31 * result + this.HasInterfaceGuid.hashCode()
        return result
    }
}

public data class USBFN_CLASS_INTERFACE(
    public var InterfaceNumber: UByte = 0u,
    public var PipeCount: UByte = 0u,
    public var PipeArr: List<USBFN_PIPE_INFORMATION> = List(16) { USBFN_PIPE_INFORMATION() },
)

public data class USBFN_CLASS_INTERFACE_EX(
    public var BaseInterfaceNumber: UByte = 0u,
    public var InterfaceCount: UByte = 0u,
    public var PipeCount: UByte = 0u,
    public var PipeArr: List<USBFN_PIPE_INFORMATION> = List(16) { USBFN_PIPE_INFORMATION() },
)

public data class USBFN_INTERFACE_INFO(
    public var InterfaceNumber: UByte = 0u,
    public var Speed: USBFN_BUS_SPEED = 0,
    public var Size: UShort = 0u,
    public var InterfaceDescriptorSet: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USBFN_INTERFACE_INFO) return false
        if (this.InterfaceNumber != other.InterfaceNumber) return false
        if (this.Speed != other.Speed) return false
        if (this.Size != other.Size) return false
        if (!this.InterfaceDescriptorSet.contentEquals(other.InterfaceDescriptorSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InterfaceNumber.hashCode()
        result = 31 * result + this.Speed.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.InterfaceDescriptorSet.contentHashCode()
        return result
    }
}

public data class USBFN_NOTIFICATION(public var Event: USBFN_EVENT = 0, public var u: USBFN_NOTIFICATION_0 = USBFN_NOTIFICATION_0())

public data class USBFN_NOTIFICATION_0(
    public var BusSpeed: USBFN_BUS_SPEED = 0,
    public var SetupPacket: USB_DEFAULT_PIPE_SETUP_PACKET = USB_DEFAULT_PIPE_SETUP_PACKET(),
    public var ConfigurationValue: UShort = 0u,
    public var PortType: USBFN_PORT_TYPE = 0,
    public var AlternateInterface: ALTERNATE_INTERFACE = ALTERNATE_INTERFACE(),
)

public data class USBFN_PIPE_INFORMATION(public var EpDesc: USB_ENDPOINT_DESCRIPTOR = USB_ENDPOINT_DESCRIPTOR(), public var PipeId: UInt = 0u)

public data class USBFN_USB_STRING(public var StringIndex: UByte = 0u, public var UsbString: UShortArray = UShortArray(255)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USBFN_USB_STRING) return false
        if (this.StringIndex != other.StringIndex) return false
        if (!this.UsbString.contentEquals(other.UsbString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StringIndex.hashCode()
        result = 31 * result + this.UsbString.contentHashCode()
        return result
    }
}

public data class USBSCAN_GET_DESCRIPTOR(
    public var DescriptorType: UByte = 0u,
    public var Index: UByte = 0u,
    public var LanguageId: UShort = 0u,
)

public data class USBSCAN_PIPE_CONFIGURATION(public var NumberOfPipes: UInt = 0u, public var PipeInfo: List<USBSCAN_PIPE_INFORMATION> = List(8) { USBSCAN_PIPE_INFORMATION() })

public data class USBSCAN_PIPE_INFORMATION(
    public var MaximumPacketSize: UShort = 0u,
    public var EndpointAddress: UByte = 0u,
    public var Interval: UByte = 0u,
    public var PipeType: RAW_PIPE_TYPE = 0,
)

public data class USBSCAN_TIMEOUT(
    public var TimeoutRead: UInt = 0u,
    public var TimeoutWrite: UInt = 0u,
    public var TimeoutEvent: UInt = 0u,
)

public data class USBUSER_BANDWIDTH_INFO_REQUEST(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var BandwidthInformation: USB_BANDWIDTH_INFO = USB_BANDWIDTH_INFO())

public data class USBUSER_BUS_STATISTICS_0_REQUEST(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var BusStatistics0: USB_BUS_STATISTICS_0 = USB_BUS_STATISTICS_0())

public data class USBUSER_CLOSE_RAW_DEVICE(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: USB_CLOSE_RAW_DEVICE_PARAMETERS = USB_CLOSE_RAW_DEVICE_PARAMETERS())

public data class USBUSER_CONTROLLER_INFO_0(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Info0: USB_CONTROLLER_INFO_0 = USB_CONTROLLER_INFO_0())

public data class USBUSER_CONTROLLER_UNICODE_NAME(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var UnicodeName: USB_UNICODE_NAME = USB_UNICODE_NAME())

public data class USBUSER_GET_DRIVER_VERSION(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: USB_DRIVER_VERSION_PARAMETERS = USB_DRIVER_VERSION_PARAMETERS())

public data class USBUSER_GET_USB2HW_VERSION(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: USB_USB2HW_VERSION_PARAMETERS = USB_USB2HW_VERSION_PARAMETERS())

public data class USBUSER_OPEN_RAW_DEVICE(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: USB_OPEN_RAW_DEVICE_PARAMETERS = USB_OPEN_RAW_DEVICE_PARAMETERS())

public data class USBUSER_PASS_THRU_REQUEST(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var PassThru: USB_PASS_THRU_PARAMETERS = USB_PASS_THRU_PARAMETERS())

public data class USBUSER_POWER_INFO_REQUEST(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var PowerInformation: USB_POWER_INFO = USB_POWER_INFO())

public data class USBUSER_RAW_RESET_ROOT_PORT(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: RAW_RESET_PORT_PARAMETERS = RAW_RESET_PORT_PARAMETERS())

public data class USBUSER_REFRESH_HCT_REG(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Flags: UInt = 0u)

public data class USBUSER_REQUEST_HEADER(
    public var UsbUserRequest: UInt = 0u,
    public var UsbUserStatusCode: USB_USER_ERROR_CODE = 0,
    public var RequestBufferLength: UInt = 0u,
    public var ActualBufferLength: UInt = 0u,
)

public data class USBUSER_ROOTPORT_FEATURE_REQUEST(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: RAW_ROOTPORT_FEATURE = RAW_ROOTPORT_FEATURE())

public data class USBUSER_ROOTPORT_PARAMETERS(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: RAW_ROOTPORT_PARAMETERS = RAW_ROOTPORT_PARAMETERS())

public data class USBUSER_SEND_ONE_PACKET(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var PacketParameters: PACKET_PARAMETERS = PACKET_PARAMETERS())

public data class USBUSER_SEND_RAW_COMMAND(public var Header: USBUSER_REQUEST_HEADER = USBUSER_REQUEST_HEADER(), public var Parameters: USB_SEND_RAW_COMMAND_PARAMETERS = USB_SEND_RAW_COMMAND_PARAMETERS())

public data class USB_20_PORT_CHANGE(public var AsUshort16: UShort = 0u, public var Anonymous: USB_20_PORT_CHANGE_0 = USB_20_PORT_CHANGE_0())

public data class USB_20_PORT_CHANGE_0(public var _bitfield: UShort = 0u)

public data class USB_20_PORT_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_20_PORT_STATUS_0 = USB_20_PORT_STATUS_0())

public data class USB_20_PORT_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_30_HUB_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bNumberOfPorts: UByte = 0u,
    public var wHubCharacteristics: UShort = 0u,
    public var bPowerOnToPowerGood: UByte = 0u,
    public var bHubControlCurrent: UByte = 0u,
    public var bHubHdrDecLat: UByte = 0u,
    public var wHubDelay: UShort = 0u,
    public var DeviceRemovable: UShort = 0u,
)

public data class USB_30_PORT_CHANGE(public var AsUshort16: UShort = 0u, public var Anonymous: USB_30_PORT_CHANGE_0 = USB_30_PORT_CHANGE_0())

public data class USB_30_PORT_CHANGE_0(public var _bitfield: UShort = 0u)

public data class USB_30_PORT_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_30_PORT_STATUS_0 = USB_30_PORT_STATUS_0())

public data class USB_30_PORT_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_ACQUIRE_INFO(
    public var NotificationType: USB_NOTIFICATION_TYPE = 0,
    public var TotalSize: UInt = 0u,
    public var Buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_ACQUIRE_INFO) return false
        if (this.NotificationType != other.NotificationType) return false
        if (this.TotalSize != other.TotalSize) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NotificationType.hashCode()
        result = 31 * result + this.TotalSize.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class USB_BANDWIDTH_INFO(
    public var DeviceCount: UInt = 0u,
    public var TotalBusBandwidth: UInt = 0u,
    public var Total32secBandwidth: UInt = 0u,
    public var AllocedBulkAndControl: UInt = 0u,
    public var AllocedIso: UInt = 0u,
    public var AllocedInterrupt_1ms: UInt = 0u,
    public var AllocedInterrupt_2ms: UInt = 0u,
    public var AllocedInterrupt_4ms: UInt = 0u,
    public var AllocedInterrupt_8ms: UInt = 0u,
    public var AllocedInterrupt_16ms: UInt = 0u,
    public var AllocedInterrupt_32ms: UInt = 0u,
)

public data class USB_BOS_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumDeviceCaps: UByte = 0u,
)

public data class USB_BUS_NOTIFICATION(
    public var NotificationType: USB_NOTIFICATION_TYPE = 0,
    public var TotalBandwidth: UInt = 0u,
    public var ConsumedBandwidth: UInt = 0u,
    public var ControllerNameLength: UInt = 0u,
)

public data class USB_BUS_STATISTICS_0(
    public var DeviceCount: UInt = 0u,
    public var CurrentSystemTime: Long = 0L,
    public var CurrentUsbFrame: UInt = 0u,
    public var BulkBytes: UInt = 0u,
    public var IsoBytes: UInt = 0u,
    public var InterruptBytes: UInt = 0u,
    public var ControlDataBytes: UInt = 0u,
    public var PciInterruptCount: UInt = 0u,
    public var HardResetCount: UInt = 0u,
    public var WorkerSignalCount: UInt = 0u,
    public var CommonBufferBytes: UInt = 0u,
    public var WorkerIdleTimeMs: UInt = 0u,
    public var RootHubEnabled: Boolean = false,
    public var RootHubDevicePowerState: UByte = 0u,
    public var Unused: UByte = 0u,
    public var NameIndex: UByte = 0u,
)

public data class USB_CLOSE_RAW_DEVICE_PARAMETERS(public var xxx: UInt = 0u)

public data class USB_COMMON_DESCRIPTOR(public var bLength: UByte = 0u, public var bDescriptorType: UByte = 0u)

public data class USB_COMPOSITE_DEVICE_INFO(
    public var DeviceDescriptor: USB_DEVICE_DESCRIPTOR = USB_DEVICE_DESCRIPTOR(),
    public var CurrentConfigDescriptor: USB_CONFIGURATION_DESCRIPTOR = USB_CONFIGURATION_DESCRIPTOR(),
    public var CurrentConfigurationValue: UByte = 0u,
    public var NumberOfFunctions: UByte = 0u,
    public var FunctionInfo: List<USB_COMPOSITE_FUNCTION_INFO> = List(1) { USB_COMPOSITE_FUNCTION_INFO() },
)

public data class USB_COMPOSITE_FUNCTION_INFO(
    public var FunctionNumber: UByte = 0u,
    public var BaseInterfaceNumber: UByte = 0u,
    public var NumberOfInterfaces: UByte = 0u,
    public var FunctionIsIdle: Boolean = false,
)

public data class USB_CONFIGURATION_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumInterfaces: UByte = 0u,
    public var bConfigurationValue: UByte = 0u,
    public var iConfiguration: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var MaxPower: UByte = 0u,
)

public data class USB_CONFIGURATION_POWER_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var SelfPowerConsumedD0: UByteArray = UByteArray(3),
    public var bPowerSummaryId: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var TransitionTimeFromD1: UShort = 0u,
    public var TransitionTimeFromD2: UShort = 0u,
    public var TransitionTimeFromD3: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_CONFIGURATION_POWER_DESCRIPTOR) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.SelfPowerConsumedD0.contentEquals(other.SelfPowerConsumedD0)) return false
        if (this.bPowerSummaryId != other.bPowerSummaryId) return false
        if (this.bBusPowerSavingD1 != other.bBusPowerSavingD1) return false
        if (this.bSelfPowerSavingD1 != other.bSelfPowerSavingD1) return false
        if (this.bBusPowerSavingD2 != other.bBusPowerSavingD2) return false
        if (this.bSelfPowerSavingD2 != other.bSelfPowerSavingD2) return false
        if (this.bBusPowerSavingD3 != other.bBusPowerSavingD3) return false
        if (this.bSelfPowerSavingD3 != other.bSelfPowerSavingD3) return false
        if (this.TransitionTimeFromD1 != other.TransitionTimeFromD1) return false
        if (this.TransitionTimeFromD2 != other.TransitionTimeFromD2) return false
        if (this.TransitionTimeFromD3 != other.TransitionTimeFromD3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.SelfPowerConsumedD0.contentHashCode()
        result = 31 * result + this.bPowerSummaryId.hashCode()
        result = 31 * result + this.bBusPowerSavingD1.hashCode()
        result = 31 * result + this.bSelfPowerSavingD1.hashCode()
        result = 31 * result + this.bBusPowerSavingD2.hashCode()
        result = 31 * result + this.bSelfPowerSavingD2.hashCode()
        result = 31 * result + this.bBusPowerSavingD3.hashCode()
        result = 31 * result + this.bSelfPowerSavingD3.hashCode()
        result = 31 * result + this.TransitionTimeFromD1.hashCode()
        result = 31 * result + this.TransitionTimeFromD2.hashCode()
        result = 31 * result + this.TransitionTimeFromD3.hashCode()
        return result
    }
}

public data class USB_CONNECTION_NOTIFICATION(
    public var NotificationType: USB_NOTIFICATION_TYPE = 0,
    public var ConnectionNumber: UInt = 0u,
    public var RequestedBandwidth: UInt = 0u,
    public var EnumerationFailReason: UInt = 0u,
    public var PowerRequested: UInt = 0u,
    public var HubNameLength: UInt = 0u,
)

public data class USB_CONTROLLER_DEVICE_INFO(
    public var PciVendorId: UInt = 0u,
    public var PciDeviceId: UInt = 0u,
    public var PciRevision: UInt = 0u,
    public var NumberOfRootPorts: UInt = 0u,
    public var HcFeatureFlags: UInt = 0u,
)

public data class USB_CONTROLLER_INFO_0(
    public var PciVendorId: UInt = 0u,
    public var PciDeviceId: UInt = 0u,
    public var PciRevision: UInt = 0u,
    public var NumberOfRootPorts: UInt = 0u,
    public var ControllerFlavor: USB_CONTROLLER_FLAVOR = 0,
    public var HcFeatureFlags: UInt = 0u,
)

public data class USB_CYCLE_PORT_PARAMS(public var ConnectionIndex: UInt = 0u, public var StatusReturned: UInt = 0u)

public data class USB_DEFAULT_PIPE_SETUP_PACKET(
    public var bmRequestType: BM_REQUEST_TYPE = BM_REQUEST_TYPE(),
    public var bRequest: UByte = 0u,
    public var wValue: USB_DEFAULT_PIPE_SETUP_PACKET_0 = USB_DEFAULT_PIPE_SETUP_PACKET_0(),
    public var wIndex: USB_DEFAULT_PIPE_SETUP_PACKET_1 = USB_DEFAULT_PIPE_SETUP_PACKET_1(),
    public var wLength: UShort = 0u,
)

public data class USB_DEFAULT_PIPE_SETUP_PACKET_1(public var Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_1_0 = USB_DEFAULT_PIPE_SETUP_PACKET_1_0(), public var W: UShort = 0u)

public data class USB_DEFAULT_PIPE_SETUP_PACKET_1_0(public var LowByte: UByte = 0u, public var HiByte: UByte = 0u)

public data class USB_DEFAULT_PIPE_SETUP_PACKET_0(public var Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_0_0 = USB_DEFAULT_PIPE_SETUP_PACKET_0_0(), public var W: UShort = 0u)

public data class USB_DEFAULT_PIPE_SETUP_PACKET_0_0(public var LowByte: UByte = 0u, public var HiByte: UByte = 0u)

public data class USB_DESCRIPTOR_REQUEST(
    public var ConnectionIndex: UInt = 0u,
    public var SetupPacket: USB_DESCRIPTOR_REQUEST_0 = USB_DESCRIPTOR_REQUEST_0(),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DESCRIPTOR_REQUEST) return false
        if (this.ConnectionIndex != other.ConnectionIndex) return false
        if (this.SetupPacket != other.SetupPacket) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionIndex.hashCode()
        result = 31 * result + this.SetupPacket.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class USB_DESCRIPTOR_REQUEST_0(
    public var bmRequest: UByte = 0u,
    public var bRequest: UByte = 0u,
    public var wValue: UShort = 0u,
    public var wIndex: UShort = 0u,
    public var wLength: UShort = 0u,
)

public data class USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var iAddtionalInfoURL: UByte = 0u,
    public var bNumberOfAlternateModes: UByte = 0u,
    public var bPreferredAlternateMode: UByte = 0u,
    public var VconnPower: USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0(),
    public var bmConfigured: UByteArray = UByteArray(32),
    public var bReserved: UInt = 0u,
    public var AlternateMode: List<USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1> = List(1) { USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.iAddtionalInfoURL != other.iAddtionalInfoURL) return false
        if (this.bNumberOfAlternateModes != other.bNumberOfAlternateModes) return false
        if (this.bPreferredAlternateMode != other.bPreferredAlternateMode) return false
        if (this.VconnPower != other.VconnPower) return false
        if (!this.bmConfigured.contentEquals(other.bmConfigured)) return false
        if (this.bReserved != other.bReserved) return false
        if (this.AlternateMode != other.AlternateMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.iAddtionalInfoURL.hashCode()
        result = 31 * result + this.bNumberOfAlternateModes.hashCode()
        result = 31 * result + this.bPreferredAlternateMode.hashCode()
        result = 31 * result + this.VconnPower.hashCode()
        result = 31 * result + this.bmConfigured.contentHashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.AlternateMode.hashCode()
        return result
    }
}

public data class USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1(
    public var wSVID: UShort = 0u,
    public var bAlternateMode: UByte = 0u,
    public var iAlternateModeSetting: UByte = 0u,
)

public data class USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0(public var AsUshort: UShort = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0(public var _bitfield: UShort = 0u)

public data class USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var ContainerID: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (!this.ContainerID.contentEquals(other.ContainerID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.ContainerID.contentHashCode()
        return result
    }
}

public data class USB_DEVICE_CAPABILITY_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
)

public data class USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bcdDescriptorVersion: UByte = 0u,
    public var bmAttributes: USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0(),
)

public data class USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0(public var AsUlong: UInt = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmCapabilities: USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0(),
    public var wMinVoltage: UShort = 0u,
    public var wMaxVoltage: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwMaxOperatingPower: UInt = 0u,
    public var dwMaxPeakPower: UInt = 0u,
    public var dwMaxPeakPowerTime: UInt = 0u,
)

public data class USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0(public var AsUshort: UShort = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0(public var _bitfield: UShort = 0u)

public data class USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var PlatformCapabilityUuid: GUID = GUID(),
    public var CapabililityData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.PlatformCapabilityUuid != other.PlatformCapabilityUuid) return false
        if (!this.CapabililityData.contentEquals(other.CapabililityData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.PlatformCapabilityUuid.hashCode()
        result = 31 * result + this.CapabililityData.contentHashCode()
        return result
    }
}

public data class USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0(),
    public var bmProviderPorts: UShort = 0u,
    public var bmConsumerPorts: UShort = 0u,
    public var bcdBCVersion: UShort = 0u,
    public var bcdPDVersion: UShort = 0u,
    public var bcdUSBTypeCVersion: UShort = 0u,
)

public data class USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0(public var AsUlong: UInt = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED(public var AsUlong32: UInt = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0 = USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0())

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0(),
    public var wFunctionalitySupport: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1 = USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1(),
    public var wReserved: UShort = 0u,
    public var bmSublinkSpeedAttr: List<USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED> = List(1) { USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED() },
)

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0(public var AsUlong: UInt = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1(public var AsUshort: UShort = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0 = USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0())

public data class USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0(public var _bitfield: UShort = 0u)

public data class USB_DEVICE_CAPABILITY_SUPERSPEED_USB_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wSpeedsSupported: UShort = 0u,
    public var bFunctionalitySupport: UByte = 0u,
    public var bU1DevExitLat: UByte = 0u,
    public var wU2DevExitLat: UShort = 0u,
)

public data class USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0 = USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0(),
)

public data class USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0(public var AsUlong: UInt = 0u, public var Anonymous: USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0 = USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0())

public data class USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_CHARACTERISTICS(
    public var Version: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(2),
    public var UsbDeviceCharacteristicsFlags: UInt = 0u,
    public var MaximumSendPathDelayInMilliSeconds: UInt = 0u,
    public var MaximumCompletionPathDelayInMilliSeconds: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_CHARACTERISTICS) return false
        if (this.Version != other.Version) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.UsbDeviceCharacteristicsFlags != other.UsbDeviceCharacteristicsFlags) return false
        if (this.MaximumSendPathDelayInMilliSeconds != other.MaximumSendPathDelayInMilliSeconds) return false
        if (this.MaximumCompletionPathDelayInMilliSeconds != other.MaximumCompletionPathDelayInMilliSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.UsbDeviceCharacteristicsFlags.hashCode()
        result = 31 * result + this.MaximumSendPathDelayInMilliSeconds.hashCode()
        result = 31 * result + this.MaximumCompletionPathDelayInMilliSeconds.hashCode()
        return result
    }
}

public data class USB_DEVICE_DESCRIPTOR(
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

public data class USB_DEVICE_INFO(
    public var DeviceState: USB_DEVICE_STATE = USB_DEVICE_STATE(),
    public var PortNumber: UShort = 0u,
    public var DeviceDescriptor: USB_DEVICE_DESCRIPTOR = USB_DEVICE_DESCRIPTOR(),
    public var CurrentConfigurationValue: UByte = 0u,
    public var Speed: USB_DEVICE_SPEED = 0,
    public var DeviceAddress: UShort = 0u,
    public var ConnectionIndex: UInt = 0u,
    public var ConnectionStatus: USB_CONNECTION_STATUS = 0,
    public var PnpHardwareId: UShortArray = UShortArray(128),
    public var PnpCompatibleId: UShortArray = UShortArray(128),
    public var SerialNumberId: UShortArray = UShortArray(128),
    public var PnpDeviceDescription: UShortArray = UShortArray(128),
    public var NumberOfOpenPipes: UInt = 0u,
    public var PipeList: List<USB_PIPE_INFO> = List(1) { USB_PIPE_INFO() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_INFO) return false
        if (this.DeviceState != other.DeviceState) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.DeviceDescriptor != other.DeviceDescriptor) return false
        if (this.CurrentConfigurationValue != other.CurrentConfigurationValue) return false
        if (this.Speed != other.Speed) return false
        if (this.DeviceAddress != other.DeviceAddress) return false
        if (this.ConnectionIndex != other.ConnectionIndex) return false
        if (this.ConnectionStatus != other.ConnectionStatus) return false
        if (!this.PnpHardwareId.contentEquals(other.PnpHardwareId)) return false
        if (!this.PnpCompatibleId.contentEquals(other.PnpCompatibleId)) return false
        if (!this.SerialNumberId.contentEquals(other.SerialNumberId)) return false
        if (!this.PnpDeviceDescription.contentEquals(other.PnpDeviceDescription)) return false
        if (this.NumberOfOpenPipes != other.NumberOfOpenPipes) return false
        if (this.PipeList != other.PipeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceState.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.DeviceDescriptor.hashCode()
        result = 31 * result + this.CurrentConfigurationValue.hashCode()
        result = 31 * result + this.Speed.hashCode()
        result = 31 * result + this.DeviceAddress.hashCode()
        result = 31 * result + this.ConnectionIndex.hashCode()
        result = 31 * result + this.ConnectionStatus.hashCode()
        result = 31 * result + this.PnpHardwareId.contentHashCode()
        result = 31 * result + this.PnpCompatibleId.contentHashCode()
        result = 31 * result + this.SerialNumberId.contentHashCode()
        result = 31 * result + this.PnpDeviceDescription.contentHashCode()
        result = 31 * result + this.NumberOfOpenPipes.hashCode()
        result = 31 * result + this.PipeList.hashCode()
        return result
    }
}

public data class USB_DEVICE_NODE_INFO(
    public var Sig: UInt = 0u,
    public var LengthInBytes: UInt = 0u,
    public var DeviceDescription: UShortArray = UShortArray(40),
    public var NodeType: USB_WMI_DEVICE_NODE_TYPE = 0,
    public var BusAddress: USB_TOPOLOGY_ADDRESS = USB_TOPOLOGY_ADDRESS(),
    public var Anonymous: USB_DEVICE_NODE_INFO_0 = USB_DEVICE_NODE_INFO_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_NODE_INFO) return false
        if (this.Sig != other.Sig) return false
        if (this.LengthInBytes != other.LengthInBytes) return false
        if (!this.DeviceDescription.contentEquals(other.DeviceDescription)) return false
        if (this.NodeType != other.NodeType) return false
        if (this.BusAddress != other.BusAddress) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Sig.hashCode()
        result = 31 * result + this.LengthInBytes.hashCode()
        result = 31 * result + this.DeviceDescription.contentHashCode()
        result = 31 * result + this.NodeType.hashCode()
        result = 31 * result + this.BusAddress.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class USB_DEVICE_NODE_INFO_0(
    public var UsbDeviceInfo: USB_DEVICE_INFO = USB_DEVICE_INFO(),
    public var HubDeviceInfo: USB_HUB_DEVICE_INFO = USB_HUB_DEVICE_INFO(),
    public var CompositeDeviceInfo: USB_COMPOSITE_DEVICE_INFO = USB_COMPOSITE_DEVICE_INFO(),
    public var ControllerDeviceInfo: USB_CONTROLLER_DEVICE_INFO = USB_CONTROLLER_DEVICE_INFO(),
    public var DeviceInformation: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_DEVICE_NODE_INFO_0) return false
        if (this.UsbDeviceInfo != other.UsbDeviceInfo) return false
        if (this.HubDeviceInfo != other.HubDeviceInfo) return false
        if (this.CompositeDeviceInfo != other.CompositeDeviceInfo) return false
        if (this.ControllerDeviceInfo != other.ControllerDeviceInfo) return false
        if (!this.DeviceInformation.contentEquals(other.DeviceInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UsbDeviceInfo.hashCode()
        result = 31 * result + this.HubDeviceInfo.hashCode()
        result = 31 * result + this.CompositeDeviceInfo.hashCode()
        result = 31 * result + this.ControllerDeviceInfo.hashCode()
        result = 31 * result + this.DeviceInformation.contentHashCode()
        return result
    }
}

public class USB_DEVICE_PERFORMANCE_INFO(
    public var BulkBytes: UInt = 0u,
    public var ControlDataBytes: UInt = 0u,
    public var IsoBytes: UInt = 0u,
    public var InterruptBytes: UInt = 0u,
    public var BulkUrbCount: UInt = 0u,
    public var ControlUrbCount: UInt = 0u,
    public var IsoUrbCount: UInt = 0u,
    public var InterruptUrbCount: UInt = 0u,
    public var AllocedInterrupt: UIntArray = UIntArray(6),
    public var AllocedIso: UInt = 0u,
    public var Total32secBandwidth: UInt = 0u,
    public var TotalTtBandwidth: UInt = 0u,
    public var DeviceDescription: UShortArray = UShortArray(60),
    public var DeviceSpeed: USB_DEVICE_SPEED = 0,
    public var TotalIsoLatency: UInt = 0u,
    public var DroppedIsoPackets: UInt = 0u,
    public var TransferErrors: UInt = 0u,
    public var PciInterruptCount: UInt = 0u,
    public var HcIdleState: UInt = 0u,
    public var HcAsyncIdleState: UInt = 0u,
    public var HcAsyncCacheFlushCount: UInt = 0u,
    public var HcPeriodicIdleState: UInt = 0u,
    public var HcPeriodicCacheFlushCount: UInt = 0u,
)

public data class USB_DEVICE_QUALIFIER_DESCRIPTOR(
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

public data class USB_DEVICE_STATE(public var _bitfield: UInt = 0u)

public data class USB_DEVICE_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_DEVICE_STATUS_0 = USB_DEVICE_STATUS_0())

public data class USB_DEVICE_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_DRIVER_VERSION_PARAMETERS(
    public var DriverTrackingCode: UInt = 0u,
    public var USBDI_Version: UInt = 0u,
    public var USBUSER_Version: UInt = 0u,
    public var CheckedPortDriver: Boolean = false,
    public var CheckedMiniportDriver: Boolean = false,
    public var USB_Version: UShort = 0u,
)

public data class USB_ENDPOINT_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bEndpointAddress: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wMaxPacketSize: UShort = 0u,
    public var bInterval: UByte = 0u,
)

public data class USB_ENDPOINT_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_ENDPOINT_STATUS_0 = USB_ENDPOINT_STATUS_0())

public data class USB_ENDPOINT_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION(
    public var TimeTrackingHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var InputFrameNumber: UInt = 0u,
    public var InputMicroFrameNumber: UInt = 0u,
    public var QueryPerformanceCounterAtInputFrameOrMicroFrame: Long = 0L,
    public var QueryPerformanceCounterFrequency: Long = 0L,
    public var PredictedAccuracyInMicroSeconds: UInt = 0u,
    public var CurrentGenerationID: UInt = 0u,
    public var CurrentQueryPerformanceCounter: Long = 0L,
    public var CurrentHardwareFrameNumber: UInt = 0u,
    public var CurrentHardwareMicroFrameNumber: UInt = 0u,
    public var CurrentUSBFrameNumber: UInt = 0u,
)

public data class USB_FUNCTION_SUSPEND_OPTIONS(public var AsUchar: UByte = 0u, public var Anonymous: USB_FUNCTION_SUSPEND_OPTIONS_0 = USB_FUNCTION_SUSPEND_OPTIONS_0())

public data class USB_FUNCTION_SUSPEND_OPTIONS_0(public var _bitfield: UByte = 0u)

public data class USB_HCD_DRIVERKEY_NAME(public var ActualLength: UInt = 0u, public var DriverKeyName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_HCD_DRIVERKEY_NAME) return false
        if (this.ActualLength != other.ActualLength) return false
        if (!this.DriverKeyName.contentEquals(other.DriverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ActualLength.hashCode()
        result = 31 * result + this.DriverKeyName.contentHashCode()
        return result
    }
}

public data class USB_HIGH_SPEED_MAXPACKET(public var us: UShort = 0u)

public data class USB_HIGH_SPEED_MAXPACKET_0(public var _bitfield: UShort = 0u)

public data class USB_HUB_30_PORT_REMOTE_WAKE_MASK(public var AsUchar8: UByte = 0u, public var Anonymous: USB_HUB_30_PORT_REMOTE_WAKE_MASK_0 = USB_HUB_30_PORT_REMOTE_WAKE_MASK_0())

public data class USB_HUB_30_PORT_REMOTE_WAKE_MASK_0(public var _bitfield: UByte = 0u)

public data class USB_HUB_CAPABILITIES(public var _bitfield: UInt = 0u)

public data class USB_HUB_CAPABILITIES_EX(public var CapabilityFlags: USB_HUB_CAP_FLAGS = USB_HUB_CAP_FLAGS())

public data class USB_HUB_CAP_FLAGS(public var ul: UInt = 0u, public var Anonymous: USB_HUB_CAP_FLAGS_0 = USB_HUB_CAP_FLAGS_0())

public data class USB_HUB_CAP_FLAGS_0(public var _bitfield: UInt = 0u)

public data class USB_HUB_CHANGE(public var AsUshort16: UShort = 0u, public var Anonymous: USB_HUB_CHANGE_0 = USB_HUB_CHANGE_0())

public data class USB_HUB_CHANGE_0(public var _bitfield: UShort = 0u)

public data class USB_HUB_DESCRIPTOR(
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
        if (other !is USB_HUB_DESCRIPTOR) return false
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

public data class USB_HUB_DEVICE_INFO(
    public var HubDescriptor: USB_HUB_DESCRIPTOR = USB_HUB_DESCRIPTOR(),
    public var HubNumber: UInt = 0u,
    public var DeviceAddress: UShort = 0u,
    public var HubIsSelfPowered: Boolean = false,
    public var HubIsRootHub: Boolean = false,
    public var HubCapabilities: USB_HUB_CAPABILITIES = USB_HUB_CAPABILITIES(),
    public var NumberOfHubPorts: UInt = 0u,
    public var PortInfo: List<USB_HUB_PORT_INFORMATION> = List(1) { USB_HUB_PORT_INFORMATION() },
)

public data class USB_HUB_DEVICE_UXD_SETTINGS(
    public var Version: UInt = 0u,
    public var PnpGuid: GUID = GUID(),
    public var OwnerGuid: GUID = GUID(),
    public var DeleteOnShutdown: UInt = 0u,
    public var DeleteOnReload: UInt = 0u,
    public var DeleteOnDisconnect: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_HUB_DEVICE_UXD_SETTINGS) return false
        if (this.Version != other.Version) return false
        if (this.PnpGuid != other.PnpGuid) return false
        if (this.OwnerGuid != other.OwnerGuid) return false
        if (this.DeleteOnShutdown != other.DeleteOnShutdown) return false
        if (this.DeleteOnReload != other.DeleteOnReload) return false
        if (this.DeleteOnDisconnect != other.DeleteOnDisconnect) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.PnpGuid.hashCode()
        result = 31 * result + this.OwnerGuid.hashCode()
        result = 31 * result + this.DeleteOnShutdown.hashCode()
        result = 31 * result + this.DeleteOnReload.hashCode()
        result = 31 * result + this.DeleteOnDisconnect.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class USB_HUB_INFORMATION(public var HubDescriptor: USB_HUB_DESCRIPTOR = USB_HUB_DESCRIPTOR(), public var HubIsBusPowered: Boolean = false)

public data class USB_HUB_INFORMATION_EX(
    public var HubType: USB_HUB_TYPE = 0,
    public var HighestPortNumber: UShort = 0u,
    public var u: USB_HUB_INFORMATION_EX_0 = USB_HUB_INFORMATION_EX_0(),
)

public data class USB_HUB_INFORMATION_EX_0(public var UsbHubDescriptor: USB_HUB_DESCRIPTOR = USB_HUB_DESCRIPTOR(), public var Usb30HubDescriptor: USB_30_HUB_DESCRIPTOR = USB_30_HUB_DESCRIPTOR())

public data class USB_HUB_NAME(public var ActualLength: UInt = 0u, public var HubName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_HUB_NAME) return false
        if (this.ActualLength != other.ActualLength) return false
        if (!this.HubName.contentEquals(other.HubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ActualLength.hashCode()
        result = 31 * result + this.HubName.contentHashCode()
        return result
    }
}

public data class USB_HUB_PORT_INFORMATION(
    public var DeviceState: USB_DEVICE_STATE = USB_DEVICE_STATE(),
    public var PortNumber: UShort = 0u,
    public var DeviceAddress: UShort = 0u,
    public var ConnectionIndex: UInt = 0u,
    public var ConnectionStatus: USB_CONNECTION_STATUS = 0,
)

public data class USB_HUB_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_HUB_STATUS_0 = USB_HUB_STATUS_0())

public data class USB_HUB_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_HUB_STATUS_AND_CHANGE(public var AsUlong32: UInt = 0u, public var Anonymous: USB_HUB_STATUS_AND_CHANGE_0 = USB_HUB_STATUS_AND_CHANGE_0())

public data class USB_HUB_STATUS_AND_CHANGE_0(public var HubStatus: USB_HUB_STATUS = USB_HUB_STATUS(), public var HubChange: USB_HUB_CHANGE = USB_HUB_CHANGE())

public data class USB_IDLE_CALLBACK_INFO(public var IdleCallback: USB_IDLE_CALLBACK = null, public var IdleContext: Long = 0L)

public data class USB_ID_STRING(
    public var LanguageId: UShort = 0u,
    public var Pad: UShort = 0u,
    public var LengthInBytes: UInt = 0u,
    public var Buffer: PWSTR = 0L,
)

public data class USB_INTERFACE_ASSOCIATION_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bFirstInterface: UByte = 0u,
    public var bInterfaceCount: UByte = 0u,
    public var bFunctionClass: UByte = 0u,
    public var bFunctionSubClass: UByte = 0u,
    public var bFunctionProtocol: UByte = 0u,
    public var iFunction: UByte = 0u,
)

public data class USB_INTERFACE_DESCRIPTOR(
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

public data class USB_INTERFACE_POWER_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bmCapabilitiesFlags: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var TransitionTimeFromD1: UShort = 0u,
    public var TransitionTimeFromD2: UShort = 0u,
    public var TransitionTimeFromD3: UShort = 0u,
)

public data class USB_INTERFACE_STATUS(public var AsUshort16: UShort = 0u, public var Anonymous: USB_INTERFACE_STATUS_0 = USB_INTERFACE_STATUS_0())

public data class USB_INTERFACE_STATUS_0(public var _bitfield: UShort = 0u)

public data class USB_MI_PARENT_INFORMATION(public var NumberOfInterfaces: UInt = 0u)

public data class USB_NODE_CONNECTION_ATTRIBUTES(
    public var ConnectionIndex: UInt = 0u,
    public var ConnectionStatus: USB_CONNECTION_STATUS = 0,
    public var PortAttributes: UInt = 0u,
)

public data class USB_NODE_CONNECTION_DRIVERKEY_NAME(
    public var ConnectionIndex: UInt = 0u,
    public var ActualLength: UInt = 0u,
    public var DriverKeyName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_NODE_CONNECTION_DRIVERKEY_NAME) return false
        if (this.ConnectionIndex != other.ConnectionIndex) return false
        if (this.ActualLength != other.ActualLength) return false
        if (!this.DriverKeyName.contentEquals(other.DriverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionIndex.hashCode()
        result = 31 * result + this.ActualLength.hashCode()
        result = 31 * result + this.DriverKeyName.contentHashCode()
        return result
    }
}

public data class USB_NODE_CONNECTION_INFORMATION(
    public var ConnectionIndex: UInt = 0u,
    public var DeviceDescriptor: USB_DEVICE_DESCRIPTOR = USB_DEVICE_DESCRIPTOR(),
    public var CurrentConfigurationValue: UByte = 0u,
    public var LowSpeed: Boolean = false,
    public var DeviceIsHub: Boolean = false,
    public var DeviceAddress: UShort = 0u,
    public var NumberOfOpenPipes: UInt = 0u,
    public var ConnectionStatus: USB_CONNECTION_STATUS = 0,
    public var PipeList: List<USB_PIPE_INFO> = List(1) { USB_PIPE_INFO() },
)

public data class USB_NODE_CONNECTION_INFORMATION_EX(
    public var ConnectionIndex: UInt = 0u,
    public var DeviceDescriptor: USB_DEVICE_DESCRIPTOR = USB_DEVICE_DESCRIPTOR(),
    public var CurrentConfigurationValue: UByte = 0u,
    public var Speed: UByte = 0u,
    public var DeviceIsHub: Boolean = false,
    public var DeviceAddress: UShort = 0u,
    public var NumberOfOpenPipes: UInt = 0u,
    public var ConnectionStatus: USB_CONNECTION_STATUS = 0,
    public var PipeList: List<USB_PIPE_INFO> = List(1) { USB_PIPE_INFO() },
)

public data class USB_NODE_CONNECTION_INFORMATION_EX_V2(
    public var ConnectionIndex: UInt = 0u,
    public var Length: UInt = 0u,
    public var SupportedUsbProtocols: USB_PROTOCOLS = USB_PROTOCOLS(),
    public var Flags: USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS = USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS(),
)

public data class USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS(public var ul: UInt = 0u, public var Anonymous: USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0 = USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0())

public data class USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0(public var _bitfield: UInt = 0u)

public data class USB_NODE_CONNECTION_NAME(
    public var ConnectionIndex: UInt = 0u,
    public var ActualLength: UInt = 0u,
    public var NodeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_NODE_CONNECTION_NAME) return false
        if (this.ConnectionIndex != other.ConnectionIndex) return false
        if (this.ActualLength != other.ActualLength) return false
        if (!this.NodeName.contentEquals(other.NodeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionIndex.hashCode()
        result = 31 * result + this.ActualLength.hashCode()
        result = 31 * result + this.NodeName.contentHashCode()
        return result
    }
}

public data class USB_NODE_INFORMATION(public var NodeType: USB_HUB_NODE = 0, public var u: USB_NODE_INFORMATION_0 = USB_NODE_INFORMATION_0())

public data class USB_NODE_INFORMATION_0(public var HubInformation: USB_HUB_INFORMATION = USB_HUB_INFORMATION(), public var MiParentInformation: USB_MI_PARENT_INFORMATION = USB_MI_PARENT_INFORMATION())

public data class USB_NOTIFICATION(public var NotificationType: USB_NOTIFICATION_TYPE = 0)

public data class USB_OPEN_RAW_DEVICE_PARAMETERS(public var PortStatus: UShort = 0u, public var MaxPacketEp0: UShort = 0u)

public data class USB_PASS_THRU_PARAMETERS(
    public var FunctionGUID: GUID = GUID(),
    public var ParameterLength: UInt = 0u,
    public var Parameters: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_PASS_THRU_PARAMETERS) return false
        if (this.FunctionGUID != other.FunctionGUID) return false
        if (this.ParameterLength != other.ParameterLength) return false
        if (!this.Parameters.contentEquals(other.Parameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FunctionGUID.hashCode()
        result = 31 * result + this.ParameterLength.hashCode()
        result = 31 * result + this.Parameters.contentHashCode()
        return result
    }
}

public data class USB_PIPE_INFO(public var EndpointDescriptor: USB_ENDPOINT_DESCRIPTOR = USB_ENDPOINT_DESCRIPTOR(), public var ScheduleOffset: UInt = 0u)

public data class USB_PORT_CHANGE(
    public var AsUshort16: UShort = 0u,
    public var Usb20PortChange: USB_20_PORT_CHANGE = USB_20_PORT_CHANGE(),
    public var Usb30PortChange: USB_30_PORT_CHANGE = USB_30_PORT_CHANGE(),
)

public data class USB_PORT_CONNECTOR_PROPERTIES(
    public var ConnectionIndex: UInt = 0u,
    public var ActualLength: UInt = 0u,
    public var UsbPortProperties: USB_PORT_PROPERTIES = USB_PORT_PROPERTIES(),
    public var CompanionIndex: UShort = 0u,
    public var CompanionPortNumber: UShort = 0u,
    public var CompanionHubSymbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_PORT_CONNECTOR_PROPERTIES) return false
        if (this.ConnectionIndex != other.ConnectionIndex) return false
        if (this.ActualLength != other.ActualLength) return false
        if (this.UsbPortProperties != other.UsbPortProperties) return false
        if (this.CompanionIndex != other.CompanionIndex) return false
        if (this.CompanionPortNumber != other.CompanionPortNumber) return false
        if (!this.CompanionHubSymbolicLinkName.contentEquals(other.CompanionHubSymbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionIndex.hashCode()
        result = 31 * result + this.ActualLength.hashCode()
        result = 31 * result + this.UsbPortProperties.hashCode()
        result = 31 * result + this.CompanionIndex.hashCode()
        result = 31 * result + this.CompanionPortNumber.hashCode()
        result = 31 * result + this.CompanionHubSymbolicLinkName.contentHashCode()
        return result
    }
}

public data class USB_PORT_EXT_STATUS(public var AsUlong32: UInt = 0u, public var Anonymous: USB_PORT_EXT_STATUS_0 = USB_PORT_EXT_STATUS_0())

public data class USB_PORT_EXT_STATUS_0(public var _bitfield: UInt = 0u)

public data class USB_PORT_EXT_STATUS_AND_CHANGE(public var AsUlong64: ULong = 0uL, public var Anonymous: USB_PORT_EXT_STATUS_AND_CHANGE_0 = USB_PORT_EXT_STATUS_AND_CHANGE_0())

public data class USB_PORT_EXT_STATUS_AND_CHANGE_0(public var PortStatusChange: USB_PORT_STATUS_AND_CHANGE = USB_PORT_STATUS_AND_CHANGE(), public var PortExtStatus: USB_PORT_EXT_STATUS = USB_PORT_EXT_STATUS())

public data class USB_PORT_PROPERTIES(public var ul: UInt = 0u, public var Anonymous: USB_PORT_PROPERTIES_0 = USB_PORT_PROPERTIES_0())

public data class USB_PORT_PROPERTIES_0(public var _bitfield: UInt = 0u)

public data class USB_PORT_STATUS(
    public var AsUshort16: UShort = 0u,
    public var Usb20PortStatus: USB_20_PORT_STATUS = USB_20_PORT_STATUS(),
    public var Usb30PortStatus: USB_30_PORT_STATUS = USB_30_PORT_STATUS(),
)

public data class USB_PORT_STATUS_AND_CHANGE(public var AsUlong32: UInt = 0u, public var Anonymous: USB_PORT_STATUS_AND_CHANGE_0 = USB_PORT_STATUS_AND_CHANGE_0())

public data class USB_PORT_STATUS_AND_CHANGE_0(public var PortStatus: USB_PORT_STATUS = USB_PORT_STATUS(), public var PortChange: USB_PORT_CHANGE = USB_PORT_CHANGE())

public data class USB_POWER_INFO(
    public var SystemState: WDMUSB_POWER_STATE = 0,
    public var HcDevicePowerState: WDMUSB_POWER_STATE = 0,
    public var HcDeviceWake: WDMUSB_POWER_STATE = 0,
    public var HcSystemWake: WDMUSB_POWER_STATE = 0,
    public var RhDevicePowerState: WDMUSB_POWER_STATE = 0,
    public var RhDeviceWake: WDMUSB_POWER_STATE = 0,
    public var RhSystemWake: WDMUSB_POWER_STATE = 0,
    public var LastSystemSleepState: WDMUSB_POWER_STATE = 0,
    public var CanWakeup: Boolean = false,
    public var IsPowered: Boolean = false,
)

public data class USB_PROTOCOLS(public var ul: UInt = 0u, public var Anonymous: USB_PROTOCOLS_0 = USB_PROTOCOLS_0())

public data class USB_PROTOCOLS_0(public var _bitfield: UInt = 0u)

public data class USB_ROOT_HUB_NAME(public var ActualLength: UInt = 0u, public var RootHubName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_ROOT_HUB_NAME) return false
        if (this.ActualLength != other.ActualLength) return false
        if (!this.RootHubName.contentEquals(other.RootHubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ActualLength.hashCode()
        result = 31 * result + this.RootHubName.contentHashCode()
        return result
    }
}

public data class USB_SEND_RAW_COMMAND_PARAMETERS(
    public var Usb_bmRequest: UByte = 0u,
    public var Usb_bRequest: UByte = 0u,
    public var Usb_wVlaue: UShort = 0u,
    public var Usb_wIndex: UShort = 0u,
    public var Usb_wLength: UShort = 0u,
    public var DeviceAddress: UShort = 0u,
    public var MaximumPacketSize: UShort = 0u,
    public var Timeout: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var UsbdStatusCode: Int = 0,
    public var Data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_SEND_RAW_COMMAND_PARAMETERS) return false
        if (this.Usb_bmRequest != other.Usb_bmRequest) return false
        if (this.Usb_bRequest != other.Usb_bRequest) return false
        if (this.Usb_wVlaue != other.Usb_wVlaue) return false
        if (this.Usb_wIndex != other.Usb_wIndex) return false
        if (this.Usb_wLength != other.Usb_wLength) return false
        if (this.DeviceAddress != other.DeviceAddress) return false
        if (this.MaximumPacketSize != other.MaximumPacketSize) return false
        if (this.Timeout != other.Timeout) return false
        if (this.DataLength != other.DataLength) return false
        if (this.UsbdStatusCode != other.UsbdStatusCode) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Usb_bmRequest.hashCode()
        result = 31 * result + this.Usb_bRequest.hashCode()
        result = 31 * result + this.Usb_wVlaue.hashCode()
        result = 31 * result + this.Usb_wIndex.hashCode()
        result = 31 * result + this.Usb_wLength.hashCode()
        result = 31 * result + this.DeviceAddress.hashCode()
        result = 31 * result + this.MaximumPacketSize.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.UsbdStatusCode.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION(public var TimeTrackingHandle: Foundation.HANDLE = Foundation.HANDLE(), public var IsStartupDelayTolerable: Boolean = false)

public data class USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION(public var TimeTrackingHandle: Foundation.HANDLE = Foundation.HANDLE())

public data class USB_STRING_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_STRING_DESCRIPTOR) return false
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

public data class USB_SUPERSPEEDPLUS_ISOCH_ENDPOINT_COMPANION_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wReserved: UShort = 0u,
    public var dwBytesPerInterval: UInt = 0u,
)

public data class USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bMaxBurst: UByte = 0u,
    public var bmAttributes: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0 = USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0(),
    public var wBytesPerInterval: UShort = 0u,
)

public data class USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0(
    public var AsUchar: UByte = 0u,
    public var Bulk: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0 = USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0(),
    public var Isochronous: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1 = USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1(),
)

public data class USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0(public var _bitfield: UByte = 0u)

public data class USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1(public var _bitfield: UByte = 0u)

public data class USB_TOPOLOGY_ADDRESS(
    public var PciBusNumber: UInt = 0u,
    public var PciDeviceNumber: UInt = 0u,
    public var PciFunctionNumber: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var RootHubPortNumber: UShort = 0u,
    public var HubPortNumber: UShortArray = UShortArray(5),
    public var Reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_TOPOLOGY_ADDRESS) return false
        if (this.PciBusNumber != other.PciBusNumber) return false
        if (this.PciDeviceNumber != other.PciDeviceNumber) return false
        if (this.PciFunctionNumber != other.PciFunctionNumber) return false
        if (this.Reserved != other.Reserved) return false
        if (this.RootHubPortNumber != other.RootHubPortNumber) return false
        if (!this.HubPortNumber.contentEquals(other.HubPortNumber)) return false
        if (this.Reserved2 != other.Reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PciBusNumber.hashCode()
        result = 31 * result + this.PciDeviceNumber.hashCode()
        result = 31 * result + this.PciFunctionNumber.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.RootHubPortNumber.hashCode()
        result = 31 * result + this.HubPortNumber.contentHashCode()
        result = 31 * result + this.Reserved2.hashCode()
        return result
    }
}

public data class USB_TRANSPORT_CHARACTERISTICS(
    public var Version: UInt = 0u,
    public var TransportCharacteristicsFlags: UInt = 0u,
    public var CurrentRoundtripLatencyInMilliSeconds: ULong = 0uL,
    public var MaxPotentialBandwidth: ULong = 0uL,
)

public data class USB_TRANSPORT_CHARACTERISTICS_CHANGE_NOTIFICATION(public var Handle: USB_CHANGE_REGISTRATION_HANDLE = 0L, public var UsbTransportCharacteristics: USB_TRANSPORT_CHARACTERISTICS = USB_TRANSPORT_CHARACTERISTICS())

public data class USB_TRANSPORT_CHARACTERISTICS_CHANGE_REGISTRATION(
    public var ChangeNotificationInputFlags: UInt = 0u,
    public var Handle: USB_CHANGE_REGISTRATION_HANDLE = 0L,
    public var UsbTransportCharacteristics: USB_TRANSPORT_CHARACTERISTICS = USB_TRANSPORT_CHARACTERISTICS(),
)

public data class USB_TRANSPORT_CHARACTERISTICS_CHANGE_UNREGISTRATION(public var Handle: USB_CHANGE_REGISTRATION_HANDLE = 0L)

public data class USB_UNICODE_NAME(public var Length: UInt = 0u, public var String: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USB_UNICODE_NAME) return false
        if (this.Length != other.Length) return false
        if (!this.String.contentEquals(other.String)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.String.contentHashCode()
        return result
    }
}

public data class USB_USB2HW_VERSION_PARAMETERS(public var Usb2HwRevision: UByte = 0u)

public data class WINUSB_PIPE_INFORMATION(
    public var PipeType: USBD_PIPE_TYPE = 0,
    public var PipeId: UByte = 0u,
    public var MaximumPacketSize: UShort = 0u,
    public var Interval: UByte = 0u,
)

public data class WINUSB_PIPE_INFORMATION_EX(
    public var PipeType: USBD_PIPE_TYPE = 0,
    public var PipeId: UByte = 0u,
    public var MaximumPacketSize: UShort = 0u,
    public var Interval: UByte = 0u,
    public var MaximumBytesPerInterval: UInt = 0u,
)

public data class WINUSB_SETUP_PACKET(
    public var RequestType: UByte = 0u,
    public var Request: UByte = 0u,
    public var Value: UShort = 0u,
    public var Index: UShort = 0u,
    public var Length: UShort = 0u,
)

public data class _URB_BULK_OR_INTERRUPT_TRANSFER(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var TransferFlags: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
)

public data class _URB_CONTROL_DESCRIPTOR_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved0: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var Reserved1: UShort = 0u,
    public var Index: UByte = 0u,
    public var DescriptorType: UByte = 0u,
    public var LanguageId: UShort = 0u,
    public var Reserved2: UShort = 0u,
)

public data class _URB_CONTROL_FEATURE_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved2: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var Reserved4: Long = 0L,
    public var Reserved5: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var Reserved0: UShort = 0u,
    public var FeatureSelector: UShort = 0u,
    public var Index: UShort = 0u,
    public var Reserved1: UShort = 0u,
)

public data class _URB_CONTROL_GET_CONFIGURATION_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved0: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var Reserved1: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_CONTROL_GET_CONFIGURATION_REQUEST) return false
        if (this.Hdr != other.Hdr) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.TransferBufferLength != other.TransferBufferLength) return false
        if (this.TransferBuffer != other.TransferBuffer) return false
        if (this.TransferBufferMDL != other.TransferBufferMDL) return false
        if (this.UrbLink != other.UrbLink) return false
        if (this.hca != other.hca) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hdr.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.TransferBufferLength.hashCode()
        result = 31 * result + this.TransferBuffer.hashCode()
        result = 31 * result + this.TransferBufferMDL.hashCode()
        result = 31 * result + this.UrbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class _URB_CONTROL_GET_INTERFACE_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved0: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var Reserved1: UByteArray = UByteArray(4),
    public var Interface: UShort = 0u,
    public var Reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_CONTROL_GET_INTERFACE_REQUEST) return false
        if (this.Hdr != other.Hdr) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.TransferBufferLength != other.TransferBufferLength) return false
        if (this.TransferBuffer != other.TransferBuffer) return false
        if (this.TransferBufferMDL != other.TransferBufferMDL) return false
        if (this.UrbLink != other.UrbLink) return false
        if (this.hca != other.hca) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Interface != other.Interface) return false
        if (this.Reserved2 != other.Reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hdr.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.TransferBufferLength.hashCode()
        result = 31 * result + this.TransferBuffer.hashCode()
        result = 31 * result + this.TransferBufferMDL.hashCode()
        result = 31 * result + this.UrbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Interface.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        return result
    }
}

public data class _URB_CONTROL_GET_STATUS_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved0: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var Reserved1: UByteArray = UByteArray(4),
    public var Index: UShort = 0u,
    public var Reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_CONTROL_GET_STATUS_REQUEST) return false
        if (this.Hdr != other.Hdr) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.TransferBufferLength != other.TransferBufferLength) return false
        if (this.TransferBuffer != other.TransferBuffer) return false
        if (this.TransferBufferMDL != other.TransferBufferMDL) return false
        if (this.UrbLink != other.UrbLink) return false
        if (this.hca != other.hca) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Index != other.Index) return false
        if (this.Reserved2 != other.Reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hdr.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.TransferBufferLength.hashCode()
        result = 31 * result + this.TransferBuffer.hashCode()
        result = 31 * result + this.TransferBufferMDL.hashCode()
        result = 31 * result + this.UrbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Index.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        return result
    }
}

public data class _URB_CONTROL_TRANSFER(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var TransferFlags: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var SetupPacket: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_CONTROL_TRANSFER) return false
        if (this.Hdr != other.Hdr) return false
        if (this.PipeHandle != other.PipeHandle) return false
        if (this.TransferFlags != other.TransferFlags) return false
        if (this.TransferBufferLength != other.TransferBufferLength) return false
        if (this.TransferBuffer != other.TransferBuffer) return false
        if (this.TransferBufferMDL != other.TransferBufferMDL) return false
        if (this.UrbLink != other.UrbLink) return false
        if (this.hca != other.hca) return false
        if (!this.SetupPacket.contentEquals(other.SetupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hdr.hashCode()
        result = 31 * result + this.PipeHandle.hashCode()
        result = 31 * result + this.TransferFlags.hashCode()
        result = 31 * result + this.TransferBufferLength.hashCode()
        result = 31 * result + this.TransferBuffer.hashCode()
        result = 31 * result + this.TransferBufferMDL.hashCode()
        result = 31 * result + this.UrbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.SetupPacket.contentHashCode()
        return result
    }
}

public data class _URB_CONTROL_TRANSFER_EX(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var TransferFlags: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var Timeout: UInt = 0u,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var SetupPacket: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_CONTROL_TRANSFER_EX) return false
        if (this.Hdr != other.Hdr) return false
        if (this.PipeHandle != other.PipeHandle) return false
        if (this.TransferFlags != other.TransferFlags) return false
        if (this.TransferBufferLength != other.TransferBufferLength) return false
        if (this.TransferBuffer != other.TransferBuffer) return false
        if (this.TransferBufferMDL != other.TransferBufferMDL) return false
        if (this.Timeout != other.Timeout) return false
        if (this.hca != other.hca) return false
        if (!this.SetupPacket.contentEquals(other.SetupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hdr.hashCode()
        result = 31 * result + this.PipeHandle.hashCode()
        result = 31 * result + this.TransferFlags.hashCode()
        result = 31 * result + this.TransferBufferLength.hashCode()
        result = 31 * result + this.TransferBuffer.hashCode()
        result = 31 * result + this.TransferBufferMDL.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.SetupPacket.contentHashCode()
        return result
    }
}

public data class _URB_CONTROL_VENDOR_OR_CLASS_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var TransferFlags: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var RequestTypeReservedBits: UByte = 0u,
    public var Request: UByte = 0u,
    public var Value: UShort = 0u,
    public var Index: UShort = 0u,
    public var Reserved1: UShort = 0u,
)

public data class _URB_FRAME_LENGTH_CONTROL(public var Hdr: _URB_HEADER = _URB_HEADER())

public data class _URB_GET_CURRENT_FRAME_NUMBER(public var Hdr: _URB_HEADER = _URB_HEADER(), public var FrameNumber: UInt = 0u)

public data class _URB_GET_FRAME_LENGTH(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var FrameLength: UInt = 0u,
    public var FrameNumber: UInt = 0u,
)

public data class _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var MaximumSendPathDelayInMilliSeconds: UInt = 0u,
    public var MaximumCompletionPathDelayInMilliSeconds: UInt = 0u,
)

public data class _URB_HCD_AREA(public var Reserved8: LongArray = LongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _URB_HCD_AREA) return false
        if (!this.Reserved8.contentEquals(other.Reserved8)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved8.contentHashCode()
    }
}

public data class _URB_HEADER(
    public var Length: UShort = 0u,
    public var Function: UShort = 0u,
    public var Status: Int = 0,
    public var UsbdDeviceHandle: Long = 0L,
    public var UsbdFlags: UInt = 0u,
)

public data class _URB_ISOCH_TRANSFER(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var TransferFlags: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var StartFrame: UInt = 0u,
    public var NumberOfPackets: UInt = 0u,
    public var ErrorCount: UInt = 0u,
    public var IsoPacket: List<USBD_ISO_PACKET_DESCRIPTOR> = List(1) { USBD_ISO_PACKET_DESCRIPTOR() },
)

public data class _URB_OPEN_STATIC_STREAMS(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var NumberOfStreams: UInt = 0u,
    public var StreamInfoVersion: UShort = 0u,
    public var StreamInfoSize: UShort = 0u,
    public var Streams: Long = 0L,
)

public data class _URB_OS_FEATURE_DESCRIPTOR_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var Reserved: Long = 0L,
    public var Reserved0: UInt = 0u,
    public var TransferBufferLength: UInt = 0u,
    public var TransferBuffer: Long = 0L,
    public var TransferBufferMDL: Long = 0L,
    public var UrbLink: Long = 0L,
    public var hca: _URB_HCD_AREA = _URB_HCD_AREA(),
    public var _bitfield: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var InterfaceNumber: UByte = 0u,
    public var MS_PageIndex: UByte = 0u,
    public var MS_FeatureDescriptorIndex: UShort = 0u,
    public var Reserved3: UShort = 0u,
)

public data class _URB_PIPE_REQUEST(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var PipeHandle: Long = 0L,
    public var Reserved: UInt = 0u,
)

public data class _URB_SELECT_CONFIGURATION(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var ConfigurationDescriptor: Long = 0L,
    public var ConfigurationHandle: Long = 0L,
    public var Interface: USBD_INTERFACE_INFORMATION = USBD_INTERFACE_INFORMATION(),
)

public data class _URB_SELECT_INTERFACE(
    public var Hdr: _URB_HEADER = _URB_HEADER(),
    public var ConfigurationHandle: Long = 0L,
    public var Interface: USBD_INTERFACE_INFORMATION = USBD_INTERFACE_INFORMATION(),
)

public data class _URB_SET_FRAME_LENGTH(public var Hdr: _URB_HEADER = _URB_HEADER(), public var FrameLengthDelta: Int = 0)
