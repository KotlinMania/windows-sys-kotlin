@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class BLUETOOTH_ADDRESS(public var Anonymous: BLUETOOTH_ADDRESS_0 = BLUETOOTH_ADDRESS_0())

public data class BLUETOOTH_ADDRESS_0(public var ullLong: ULong = 0uL, public var rgBytes: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_ADDRESS_0) return false
        if (this.ullLong != other.ullLong) return false
        if (!this.rgBytes.contentEquals(other.rgBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullLong.hashCode()
        result = 31 * result + this.rgBytes.contentHashCode()
        return result
    }
}

public data class BLUETOOTH_AUTHENTICATE_RESPONSE(
    public var bthAddressRemote: BLUETOOTH_ADDRESS = BLUETOOTH_ADDRESS(),
    public var authMethod: BLUETOOTH_AUTHENTICATION_METHOD = 0,
    public var Anonymous: BLUETOOTH_AUTHENTICATE_RESPONSE_0 = BLUETOOTH_AUTHENTICATE_RESPONSE_0(),
    public var negativeResponse: UByte = 0u,
)

public data class BLUETOOTH_AUTHENTICATE_RESPONSE_0(
    public var pinInfo: BLUETOOTH_PIN_INFO = BLUETOOTH_PIN_INFO(),
    public var oobInfo: BLUETOOTH_OOB_DATA_INFO = BLUETOOTH_OOB_DATA_INFO(),
    public var numericCompInfo: BLUETOOTH_NUMERIC_COMPARISON_INFO = BLUETOOTH_NUMERIC_COMPARISON_INFO(),
    public var passkeyInfo: BLUETOOTH_PASSKEY_INFO = BLUETOOTH_PASSKEY_INFO(),
)

public data class BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS(
    public var deviceInfo: BLUETOOTH_DEVICE_INFO = BLUETOOTH_DEVICE_INFO(),
    public var authenticationMethod: BLUETOOTH_AUTHENTICATION_METHOD = 0,
    public var ioCapability: BLUETOOTH_IO_CAPABILITY = 0,
    public var authenticationRequirements: BLUETOOTH_AUTHENTICATION_REQUIREMENTS = 0,
    public var Anonymous: BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0 = BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0(),
)

public data class BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0(public var Numeric_Value: UInt = 0u, public var Passkey: UInt = 0u)

public data class BLUETOOTH_COD_PAIRS(public var ulCODMask: UInt = 0u, public var pcszDescription: PCWSTR = 0L)

public data class BLUETOOTH_DEVICE_INFO(
    public var dwSize: UInt = 0u,
    public var Address: BLUETOOTH_ADDRESS = BLUETOOTH_ADDRESS(),
    public var ulClassofDevice: UInt = 0u,
    public var fConnected: BOOL = 0,
    public var fRemembered: BOOL = 0,
    public var fAuthenticated: BOOL = 0,
    public var stLastSeen: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var stLastUsed: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var szName: UShortArray = UShortArray(248),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_DEVICE_INFO) return false
        if (this.dwSize != other.dwSize) return false
        if (this.Address != other.Address) return false
        if (this.ulClassofDevice != other.ulClassofDevice) return false
        if (this.fConnected != other.fConnected) return false
        if (this.fRemembered != other.fRemembered) return false
        if (this.fAuthenticated != other.fAuthenticated) return false
        if (this.stLastSeen != other.stLastSeen) return false
        if (this.stLastUsed != other.stLastUsed) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.ulClassofDevice.hashCode()
        result = 31 * result + this.fConnected.hashCode()
        result = 31 * result + this.fRemembered.hashCode()
        result = 31 * result + this.fAuthenticated.hashCode()
        result = 31 * result + this.stLastSeen.hashCode()
        result = 31 * result + this.stLastUsed.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }
}

public data class BLUETOOTH_DEVICE_SEARCH_PARAMS(
    public var dwSize: UInt = 0u,
    public var fReturnAuthenticated: BOOL = 0,
    public var fReturnRemembered: BOOL = 0,
    public var fReturnUnknown: BOOL = 0,
    public var fReturnConnected: BOOL = 0,
    public var fIssueInquiry: BOOL = 0,
    public var cTimeoutMultiplier: UByte = 0u,
    public var hRadio: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class BLUETOOTH_FIND_RADIO_PARAMS(public var dwSize: UInt = 0u)

public data class BLUETOOTH_GATT_VALUE_CHANGED_EVENT(
    public var ChangedAttributeHandle: UShort = 0u,
    public var CharacteristicValueDataSize: ULong = 0uL,
    public var CharacteristicValue: Long = 0L,
)

public data class BLUETOOTH_GATT_VALUE_CHANGED_EVENT_REGISTRATION(public var NumCharacteristics: UShort = 0u, public var Characteristics: List<BTH_LE_GATT_CHARACTERISTIC> = List(1) { BTH_LE_GATT_CHARACTERISTIC() })

public data class BLUETOOTH_LOCAL_SERVICE_INFO(
    public var Enabled: BOOL = 0,
    public var btAddr: BLUETOOTH_ADDRESS = BLUETOOTH_ADDRESS(),
    public var szName: UShortArray = UShortArray(256),
    public var szDeviceString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_LOCAL_SERVICE_INFO) return false
        if (this.Enabled != other.Enabled) return false
        if (this.btAddr != other.btAddr) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDeviceString.contentEquals(other.szDeviceString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Enabled.hashCode()
        result = 31 * result + this.btAddr.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDeviceString.contentHashCode()
        return result
    }
}

public data class BLUETOOTH_NUMERIC_COMPARISON_INFO(public var NumericValue: UInt = 0u)

public data class BLUETOOTH_OOB_DATA_INFO(public var C: UByteArray = UByteArray(16), public var R: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_OOB_DATA_INFO) return false
        if (!this.C.contentEquals(other.C)) return false
        if (!this.R.contentEquals(other.R)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.C.contentHashCode()
        result = 31 * result + this.R.contentHashCode()
        return result
    }
}

public data class BLUETOOTH_PASSKEY_INFO(public var passkey: UInt = 0u)

public data class BLUETOOTH_PIN_INFO(public var pin: UByteArray = UByteArray(16), public var pinLength: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_PIN_INFO) return false
        if (!this.pin.contentEquals(other.pin)) return false
        if (this.pinLength != other.pinLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pin.contentHashCode()
        result = 31 * result + this.pinLength.hashCode()
        return result
    }
}

public data class BLUETOOTH_RADIO_INFO(
    public var dwSize: UInt = 0u,
    public var address: BLUETOOTH_ADDRESS = BLUETOOTH_ADDRESS(),
    public var szName: UShortArray = UShortArray(248),
    public var ulClassofDevice: UInt = 0u,
    public var lmpSubversion: UShort = 0u,
    public var manufacturer: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BLUETOOTH_RADIO_INFO) return false
        if (this.dwSize != other.dwSize) return false
        if (this.address != other.address) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.ulClassofDevice != other.ulClassofDevice) return false
        if (this.lmpSubversion != other.lmpSubversion) return false
        if (this.manufacturer != other.manufacturer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.ulClassofDevice.hashCode()
        result = 31 * result + this.lmpSubversion.hashCode()
        result = 31 * result + this.manufacturer.hashCode()
        return result
    }
}

public data class BLUETOOTH_SELECT_DEVICE_PARAMS(
    public var dwSize: UInt = 0u,
    public var cNumOfClasses: UInt = 0u,
    public var prgClassOfDevices: Long = 0L,
    public var pszInfo: PWSTR = 0L,
    public var hwndParent: Foundation.HWND = Foundation.HWND(),
    public var fForceAuthentication: BOOL = 0,
    public var fShowAuthenticated: BOOL = 0,
    public var fShowRemembered: BOOL = 0,
    public var fShowUnknown: BOOL = 0,
    public var fAddNewDeviceWizard: BOOL = 0,
    public var fSkipServicesPage: BOOL = 0,
    public var pfnDeviceCallback: PFN_DEVICE_CALLBACK = null,
    public var pvParam: Long = 0L,
    public var cNumDevices: UInt = 0u,
    public var pDevices: Long = 0L,
)

public data class BTH_DEVICE_INFO(
    public var flags: UInt = 0u,
    public var address: ULong = 0uL,
    public var classOfDevice: UInt = 0u,
    public var name: ByteArray = ByteArray(248),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_DEVICE_INFO) return false
        if (this.flags != other.flags) return false
        if (this.address != other.address) return false
        if (this.classOfDevice != other.classOfDevice) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.classOfDevice.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class BTH_HCI_EVENT_INFO(
    public var bthAddress: ULong = 0uL,
    public var connectionType: UByte = 0u,
    public var connected: UByte = 0u,
)

public data class BTH_INFO_REQ(public var btAddr: ULong = 0uL, public var infoType: UShort = 0u)

public data class BTH_INFO_RSP(
    public var result: UShort = 0u,
    public var dataLen: UByte = 0u,
    public var Anonymous: BTH_INFO_RSP_0 = BTH_INFO_RSP_0(),
)

public data class BTH_INFO_RSP_0(public var connectionlessMTU: UShort = 0u, public var data: UByteArray = UByteArray(44)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_INFO_RSP_0) return false
        if (this.connectionlessMTU != other.connectionlessMTU) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionlessMTU.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class BTH_L2CAP_EVENT_INFO(
    public var bthAddress: ULong = 0uL,
    public var psm: UShort = 0u,
    public var connected: UByte = 0u,
    public var initiated: UByte = 0u,
)

public data class BTH_LE_GATT_CHARACTERISTIC(
    public var ServiceHandle: UShort = 0u,
    public var CharacteristicUuid: BTH_LE_UUID = BTH_LE_UUID(),
    public var AttributeHandle: UShort = 0u,
    public var CharacteristicValueHandle: UShort = 0u,
    public var IsBroadcastable: Boolean = false,
    public var IsReadable: Boolean = false,
    public var IsWritable: Boolean = false,
    public var IsWritableWithoutResponse: Boolean = false,
    public var IsSignedWritable: Boolean = false,
    public var IsNotifiable: Boolean = false,
    public var IsIndicatable: Boolean = false,
    public var HasExtendedProperties: Boolean = false,
)

public data class BTH_LE_GATT_CHARACTERISTIC_VALUE(public var DataSize: UInt = 0u, public var Data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_LE_GATT_CHARACTERISTIC_VALUE) return false
        if (this.DataSize != other.DataSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DataSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class BTH_LE_GATT_DESCRIPTOR(
    public var ServiceHandle: UShort = 0u,
    public var CharacteristicHandle: UShort = 0u,
    public var DescriptorType: BTH_LE_GATT_DESCRIPTOR_TYPE = 0,
    public var DescriptorUuid: BTH_LE_UUID = BTH_LE_UUID(),
    public var AttributeHandle: UShort = 0u,
)

public data class BTH_LE_GATT_DESCRIPTOR_VALUE(
    public var DescriptorType: BTH_LE_GATT_DESCRIPTOR_TYPE = 0,
    public var DescriptorUuid: BTH_LE_UUID = BTH_LE_UUID(),
    public var Anonymous: BTH_LE_GATT_DESCRIPTOR_VALUE_0 = BTH_LE_GATT_DESCRIPTOR_VALUE_0(),
    public var DataSize: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_LE_GATT_DESCRIPTOR_VALUE) return false
        if (this.DescriptorType != other.DescriptorType) return false
        if (this.DescriptorUuid != other.DescriptorUuid) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.DataSize != other.DataSize) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DescriptorType.hashCode()
        result = 31 * result + this.DescriptorUuid.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.DataSize.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class BTH_LE_GATT_DESCRIPTOR_VALUE_0(
    public var CharacteristicExtendedProperties: BTH_LE_GATT_DESCRIPTOR_VALUE_0_0 = BTH_LE_GATT_DESCRIPTOR_VALUE_0_0(),
    public var ClientCharacteristicConfiguration: BTH_LE_GATT_DESCRIPTOR_VALUE_0_1 = BTH_LE_GATT_DESCRIPTOR_VALUE_0_1(),
    public var ServerCharacteristicConfiguration: BTH_LE_GATT_DESCRIPTOR_VALUE_0_2 = BTH_LE_GATT_DESCRIPTOR_VALUE_0_2(),
    public var CharacteristicFormat: BTH_LE_GATT_DESCRIPTOR_VALUE_0_3 = BTH_LE_GATT_DESCRIPTOR_VALUE_0_3(),
)

public data class BTH_LE_GATT_DESCRIPTOR_VALUE_0_0(public var IsReliableWriteEnabled: Boolean = false, public var IsAuxiliariesWritable: Boolean = false)

public data class BTH_LE_GATT_DESCRIPTOR_VALUE_0_3(
    public var Format: UByte = 0u,
    public var Exponent: UByte = 0u,
    public var Unit: BTH_LE_UUID = BTH_LE_UUID(),
    public var NameSpace: UByte = 0u,
    public var Description: BTH_LE_UUID = BTH_LE_UUID(),
)

public data class BTH_LE_GATT_DESCRIPTOR_VALUE_0_1(public var IsSubscribeToNotification: Boolean = false, public var IsSubscribeToIndication: Boolean = false)

public data class BTH_LE_GATT_DESCRIPTOR_VALUE_0_2(public var IsBroadcast: Boolean = false)

public data class BTH_LE_GATT_SERVICE(public var ServiceUuid: BTH_LE_UUID = BTH_LE_UUID(), public var AttributeHandle: UShort = 0u)

public data class BTH_LE_UUID(public var IsShortUuid: Boolean = false, public var Value: BTH_LE_UUID_0 = BTH_LE_UUID_0())

public data class BTH_LE_UUID_0(public var ShortUuid: UShort = 0u, public var LongUuid: GUID = GUID())

public data class BTH_PING_REQ(
    public var btAddr: ULong = 0uL,
    public var dataLen: UByte = 0u,
    public var data: UByteArray = UByteArray(44),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_PING_REQ) return false
        if (this.btAddr != other.btAddr) return false
        if (this.dataLen != other.dataLen) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.btAddr.hashCode()
        result = 31 * result + this.dataLen.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class BTH_PING_RSP(public var dataLen: UByte = 0u, public var data: UByteArray = UByteArray(44)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_PING_RSP) return false
        if (this.dataLen != other.dataLen) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLen.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class BTH_QUERY_DEVICE(public var LAP: UInt = 0u, public var length: UByte = 0u)

public data class BTH_QUERY_SERVICE(
    public var type: UInt = 0u,
    public var serviceHandle: UInt = 0u,
    public var uuids: List<SdpQueryUuid> = List(12) { SdpQueryUuid() },
    public var numRange: UInt = 0u,
    public var pRange: List<SdpAttributeRange> = List(1) { SdpAttributeRange() },
)

public data class BTH_RADIO_IN_RANGE(public var deviceInfo: BTH_DEVICE_INFO = BTH_DEVICE_INFO(), public var previousDeviceFlags: UInt = 0u)

public data class BTH_SET_SERVICE(
    public var pSdpVersion: Long = 0L,
    public var pRecordHandle: Long = 0L,
    public var fCodService: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(5),
    public var ulRecordLength: UInt = 0u,
    public var pRecord: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BTH_SET_SERVICE) return false
        if (this.pSdpVersion != other.pSdpVersion) return false
        if (this.pRecordHandle != other.pRecordHandle) return false
        if (this.fCodService != other.fCodService) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ulRecordLength != other.ulRecordLength) return false
        if (!this.pRecord.contentEquals(other.pRecord)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSdpVersion.hashCode()
        result = 31 * result + this.pRecordHandle.hashCode()
        result = 31 * result + this.fCodService.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ulRecordLength.hashCode()
        result = 31 * result + this.pRecord.contentHashCode()
        return result
    }
}

public data class RFCOMM_COMMAND(public var CmdType: UInt = 0u, public var Data: RFCOMM_COMMAND_0 = RFCOMM_COMMAND_0())

public data class RFCOMM_COMMAND_0(
    public var MSC: RFCOMM_MSC_DATA = RFCOMM_MSC_DATA(),
    public var RLS: RFCOMM_RLS_DATA = RFCOMM_RLS_DATA(),
    public var RPN: RFCOMM_RPN_DATA = RFCOMM_RPN_DATA(),
)

public data class RFCOMM_MSC_DATA(public var Signals: UByte = 0u, public var Break: UByte = 0u)

public data class RFCOMM_RLS_DATA(public var LineStatus: UByte = 0u)

public data class RFCOMM_RPN_DATA(
    public var Baud: UByte = 0u,
    public var Data: UByte = 0u,
    public var FlowControl: UByte = 0u,
    public var XonChar: UByte = 0u,
    public var XoffChar: UByte = 0u,
    public var ParameterMask1: UByte = 0u,
    public var ParameterMask2: UByte = 0u,
)

public data class SDP_ELEMENT_DATA(
    public var type: SDP_TYPE = 0,
    public var specificType: SDP_SPECIFICTYPE = 0,
    public var data: SDP_ELEMENT_DATA_0 = SDP_ELEMENT_DATA_0(),
)

public class SDP_ELEMENT_DATA_0(
    public var int128: SDP_LARGE_INTEGER_16 = SDP_LARGE_INTEGER_16(),
    public var int64: Long = 0L,
    public var int32: Int = 0,
    public var int16: Short = 0,
    public var int8: Byte = 0,
    public var uint128: SDP_ULARGE_INTEGER_16 = SDP_ULARGE_INTEGER_16(),
    public var uint64: ULong = 0uL,
    public var uint32: UInt = 0u,
    public var uint16: UShort = 0u,
    public var uint8: UByte = 0u,
    public var booleanVal: UByte = 0u,
    public var uuid128: GUID = GUID(),
    public var uuid32: UInt = 0u,
    public var uuid16: UShort = 0u,
    public var string: SDP_ELEMENT_DATA_0_0 = SDP_ELEMENT_DATA_0_0(),
    public var url: SDP_ELEMENT_DATA_0_1 = SDP_ELEMENT_DATA_0_1(),
    public var sequence: SDP_ELEMENT_DATA_0_2 = SDP_ELEMENT_DATA_0_2(),
    public var alternative: SDP_ELEMENT_DATA_0_3 = SDP_ELEMENT_DATA_0_3(),
)

public data class SDP_ELEMENT_DATA_0_3(public var value: Long = 0L, public var length: UInt = 0u)

public data class SDP_ELEMENT_DATA_0_2(public var value: Long = 0L, public var length: UInt = 0u)

public data class SDP_ELEMENT_DATA_0_0(public var value: Long = 0L, public var length: UInt = 0u)

public data class SDP_ELEMENT_DATA_0_1(public var value: Long = 0L, public var length: UInt = 0u)

public data class SDP_LARGE_INTEGER_16(public var LowPart: ULong = 0uL, public var HighPart: Long = 0L)

public data class SDP_STRING_TYPE_DATA(
    public var encoding: UShort = 0u,
    public var mibeNum: UShort = 0u,
    public var attributeId: UShort = 0u,
)

public data class SDP_ULARGE_INTEGER_16(public var LowPart: ULong = 0uL, public var HighPart: ULong = 0uL)

public data class SOCKADDR_BTH(
    public var addressFamily: UShort = 0u,
    public var btAddr: ULong = 0uL,
    public var serviceClassId: GUID = GUID(),
    public var port: UInt = 0u,
)

public data class SdpAttributeRange(public var minAttribute: UShort = 0u, public var maxAttribute: UShort = 0u)

public data class SdpQueryUuid(public var u: SdpQueryUuidUnion = SdpQueryUuidUnion(), public var uuidType: UShort = 0u)

public data class SdpQueryUuidUnion(
    public var uuid128: GUID = GUID(),
    public var uuid32: UInt = 0u,
    public var uuid16: UShort = 0u,
)
