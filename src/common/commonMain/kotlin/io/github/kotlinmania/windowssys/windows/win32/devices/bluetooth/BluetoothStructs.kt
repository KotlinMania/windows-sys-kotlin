@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public data class BluetoothAddress(
    public var anonymous: BluetoothAddress0 = BluetoothAddress0(),
)

public data class BluetoothAddress0(
    public var ullLong: ULong = 0uL,
    public var rgBytes: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothAddress0) return false
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

public data class BluetoothAuthenticateResponse(
    public var bthAddressRemote: BluetoothAddress = BluetoothAddress(),
    public var authMethod: BluetoothAuthenticationMethod = 0,
    public var anonymous: BluetoothAuthenticateResponse0 = BluetoothAuthenticateResponse0(),
    public var negativeResponse: UByte = 0u,
)

public data class BluetoothAuthenticateResponse0(
    public var pinInfo: BluetoothPinInfo = BluetoothPinInfo(),
    public var oobInfo: BluetoothOobDataInfo = BluetoothOobDataInfo(),
    public var numericCompInfo: BluetoothNumericComparisonInfo = BluetoothNumericComparisonInfo(),
    public var passkeyInfo: BluetoothPasskeyInfo = BluetoothPasskeyInfo(),
)

public data class BluetoothAuthenticationCallbackParams(
    public var deviceInfo: BluetoothDeviceInfo = BluetoothDeviceInfo(),
    public var authenticationMethod: BluetoothAuthenticationMethod = 0,
    public var ioCapability: BluetoothIoCapability = 0,
    public var authenticationRequirements: BluetoothAuthenticationRequirements = 0,
    public var anonymous: BluetoothAuthenticationCallbackParams0 = BluetoothAuthenticationCallbackParams0(),
)

public data class BluetoothAuthenticationCallbackParams0(
    public var numericValue: UInt = 0u,
    public var passkey: UInt = 0u,
)

public data class BluetoothCodPairs(
    public var ulCODMask: UInt = 0u,
    public var pcszDescription: Pcwstr = null,
)

public data class BluetoothDeviceInfo(
    public var dwSize: UInt = 0u,
    public var address: BluetoothAddress = BluetoothAddress(),
    public var ulClassofDevice: UInt = 0u,
    public var fConnected: Bool = 0,
    public var fRemembered: Bool = 0,
    public var fAuthenticated: Bool = 0,
    public var stLastSeen: Systemtime = Systemtime(),
    public var stLastUsed: Systemtime = Systemtime(),
    public var szName: UShortArray = UShortArray(248),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothDeviceInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.address != other.address) return false
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
        result = 31 * result + this.address.hashCode()
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

public data class BluetoothDeviceSearchParams(
    public var dwSize: UInt = 0u,
    public var fReturnAuthenticated: Bool = 0,
    public var fReturnRemembered: Bool = 0,
    public var fReturnUnknown: Bool = 0,
    public var fReturnConnected: Bool = 0,
    public var fIssueInquiry: Bool = 0,
    public var cTimeoutMultiplier: UByte = 0u,
    public var hRadio: Handle = null,
)

public data class BluetoothFindRadioParams(
    public var dwSize: UInt = 0u,
)

public data class BluetoothGattValueChangedEvent(
    public var changedAttributeHandle: UShort = 0u,
    public var characteristicValueDataSize: Int = 0,
    public var characteristicValue: BthLeGattCharacteristicValue? = null,
)

public data class BluetoothGattValueChangedEventRegistration(
    public var numCharacteristics: UShort = 0u,
    public var characteristics: List<BthLeGattCharacteristic> = List(1) { BthLeGattCharacteristic() },
)

public data class BluetoothLocalServiceInfo(
    public var enabled: Bool = 0,
    public var btAddr: BluetoothAddress = BluetoothAddress(),
    public var szName: UShortArray = UShortArray(256),
    public var szDeviceString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothLocalServiceInfo) return false
        if (this.enabled != other.enabled) return false
        if (this.btAddr != other.btAddr) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDeviceString.contentEquals(other.szDeviceString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enabled.hashCode()
        result = 31 * result + this.btAddr.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDeviceString.contentHashCode()
        return result
    }
}

public data class BluetoothNumericComparisonInfo(
    public var numericValue: UInt = 0u,
)

public data class BluetoothOobDataInfo(
    public var c: UByteArray = UByteArray(16),
    public var r: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothOobDataInfo) return false
        if (!this.c.contentEquals(other.c)) return false
        if (!this.r.contentEquals(other.r)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.c.contentHashCode()
        result = 31 * result + this.r.contentHashCode()
        return result
    }
}

public data class BluetoothPasskeyInfo(
    public var passkey: UInt = 0u,
)

public data class BluetoothPinInfo(
    public var pin: UByteArray = UByteArray(16),
    public var pinLength: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothPinInfo) return false
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

public data class BluetoothRadioInfo(
    public var dwSize: UInt = 0u,
    public var address: BluetoothAddress = BluetoothAddress(),
    public var szName: UShortArray = UShortArray(248),
    public var ulClassofDevice: UInt = 0u,
    public var lmpSubversion: UShort = 0u,
    public var manufacturer: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothRadioInfo) return false
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

public data class BluetoothSelectDeviceParams(
    public var dwSize: UInt = 0u,
    public var cNumOfClasses: UInt = 0u,
    public var prgClassOfDevices: BluetoothCodPairs? = null,
    public var pszInfo: Pwstr = null,
    public var hwndParent: Hwnd = null,
    public var fForceAuthentication: Bool = 0,
    public var fShowAuthenticated: Bool = 0,
    public var fShowRemembered: Bool = 0,
    public var fShowUnknown: Bool = 0,
    public var fAddNewDeviceWizard: Bool = 0,
    public var fSkipServicesPage: Bool = 0,
    public var pfnDeviceCallback: PfnDeviceCallback = null,
    public var pvParam: COpaquePointer? = null,
    public var cNumDevices: UInt = 0u,
    public var pDevices: BluetoothDeviceInfo? = null,
)

public data class BthDeviceInfo(
    public var flags: UInt = 0u,
    public var address: ULong = 0uL,
    public var classOfDevice: UInt = 0u,
    public var name: ByteArray = ByteArray(248),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthDeviceInfo) return false
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

public data class BthHciEventInfo(
    public var bthAddress: ULong = 0uL,
    public var connectionType: UByte = 0u,
    public var connected: UByte = 0u,
)

public data class BthInfoReq(
    public var btAddr: ULong = 0uL,
    public var infoType: UShort = 0u,
)

public data class BthInfoRsp(
    public var result: UShort = 0u,
    public var dataLen: UByte = 0u,
    public var anonymous: BthInfoRsp0 = BthInfoRsp0(),
)

public data class BthInfoRsp0(
    public var connectionlessMTU: UShort = 0u,
    public var data: UByteArray = UByteArray(44),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthInfoRsp0) return false
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

public data class BthL2capEventInfo(
    public var bthAddress: ULong = 0uL,
    public var psm: UShort = 0u,
    public var connected: UByte = 0u,
    public var initiated: UByte = 0u,
)

public data class BthLeGattCharacteristic(
    public var serviceHandle: UShort = 0u,
    public var characteristicUuid: BthLeUuid = BthLeUuid(),
    public var attributeHandle: UShort = 0u,
    public var characteristicValueHandle: UShort = 0u,
    public var isBroadcastable: Boolean = false,
    public var isReadable: Boolean = false,
    public var isWritable: Boolean = false,
    public var isWritableWithoutResponse: Boolean = false,
    public var isSignedWritable: Boolean = false,
    public var isNotifiable: Boolean = false,
    public var isIndicatable: Boolean = false,
    public var hasExtendedProperties: Boolean = false,
)

public data class BthLeGattCharacteristicValue(
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthLeGattCharacteristicValue) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class BthLeGattDescriptor(
    public var serviceHandle: UShort = 0u,
    public var characteristicHandle: UShort = 0u,
    public var descriptorType: BthLeGattDescriptorType = 0,
    public var descriptorUuid: BthLeUuid = BthLeUuid(),
    public var attributeHandle: UShort = 0u,
)

public data class BthLeGattDescriptorValue(
    public var descriptorType: BthLeGattDescriptorType = 0,
    public var descriptorUuid: BthLeUuid = BthLeUuid(),
    public var anonymous: BthLeGattDescriptorValue0 = BthLeGattDescriptorValue0(),
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthLeGattDescriptorValue) return false
        if (this.descriptorType != other.descriptorType) return false
        if (this.descriptorUuid != other.descriptorUuid) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptorType.hashCode()
        result = 31 * result + this.descriptorUuid.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class BthLeGattDescriptorValue0(
    public var characteristicExtendedProperties: BthLeGattDescriptorValue00 = BthLeGattDescriptorValue00(),
    public var clientCharacteristicConfiguration: BthLeGattDescriptorValue01 = BthLeGattDescriptorValue01(),
    public var serverCharacteristicConfiguration: BthLeGattDescriptorValue02 = BthLeGattDescriptorValue02(),
    public var characteristicFormat: BthLeGattDescriptorValue03 = BthLeGattDescriptorValue03(),
)

public data class BthLeGattDescriptorValue00(
    public var isReliableWriteEnabled: Boolean = false,
    public var isAuxiliariesWritable: Boolean = false,
)

public data class BthLeGattDescriptorValue03(
    public var format: UByte = 0u,
    public var exponent: UByte = 0u,
    public var unit: BthLeUuid = BthLeUuid(),
    public var nameSpace: UByte = 0u,
    public var description: BthLeUuid = BthLeUuid(),
)

public data class BthLeGattDescriptorValue01(
    public var isSubscribeToNotification: Boolean = false,
    public var isSubscribeToIndication: Boolean = false,
)

public data class BthLeGattDescriptorValue02(
    public var isBroadcast: Boolean = false,
)

public data class BthLeGattService(
    public var serviceUuid: BthLeUuid = BthLeUuid(),
    public var attributeHandle: UShort = 0u,
)

public data class BthLeUuid(
    public var isShortUuid: Boolean = false,
    public var value: BthLeUuid0 = BthLeUuid0(),
)

public data class BthLeUuid0(
    public var shortUuid: UShort = 0u,
    public var longUuid: Guid = Guid(),
)

public data class BthPingReq(
    public var btAddr: ULong = 0uL,
    public var dataLen: UByte = 0u,
    public var data: UByteArray = UByteArray(44),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthPingReq) return false
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

public data class BthPingRsp(
    public var dataLen: UByte = 0u,
    public var data: UByteArray = UByteArray(44),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthPingRsp) return false
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

public data class BthQueryDevice(
    public var lap: UInt = 0u,
    public var length: UByte = 0u,
)

public data class BthQueryService(
    public var type: UInt = 0u,
    public var serviceHandle: UInt = 0u,
    public var uuids: List<SdpQueryUuid> = List(12) { SdpQueryUuid() },
    public var numRange: UInt = 0u,
    public var pRange: List<SdpAttributeRange> = List(1) { SdpAttributeRange() },
)

public data class BthRadioInRange(
    public var deviceInfo: BthDeviceInfo = BthDeviceInfo(),
    public var previousDeviceFlags: UInt = 0u,
)

public data class BthSetService(
    public var pSdpVersion: UInt? = null,
    public var pRecordHandle: Handle? = null,
    public var fCodService: UInt = 0u,
    public var reserved: UIntArray = UIntArray(5),
    public var ulRecordLength: UInt = 0u,
    public var pRecord: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BthSetService) return false
        if (this.pSdpVersion != other.pSdpVersion) return false
        if (this.pRecordHandle != other.pRecordHandle) return false
        if (this.fCodService != other.fCodService) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ulRecordLength != other.ulRecordLength) return false
        if (!this.pRecord.contentEquals(other.pRecord)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSdpVersion.hashCode()
        result = 31 * result + this.pRecordHandle.hashCode()
        result = 31 * result + this.fCodService.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ulRecordLength.hashCode()
        result = 31 * result + this.pRecord.contentHashCode()
        return result
    }
}

public data class RfcommCommand(
    public var cmdType: UInt = 0u,
    public var data: RfcommCommand0 = RfcommCommand0(),
)

public data class RfcommCommand0(
    public var msc: RfcommMscData = RfcommMscData(),
    public var rls: RfcommRlsData = RfcommRlsData(),
    public var rpn: RfcommRpnData = RfcommRpnData(),
)

public data class RfcommMscData(
    public var signals: UByte = 0u,
    public var breakTarget: UByte = 0u,
)

public data class RfcommRlsData(
    public var lineStatus: UByte = 0u,
)

public data class RfcommRpnData(
    public var baud: UByte = 0u,
    public var data: UByte = 0u,
    public var flowControl: UByte = 0u,
    public var xonChar: UByte = 0u,
    public var xoffChar: UByte = 0u,
    public var parameterMask1: UByte = 0u,
    public var parameterMask2: UByte = 0u,
)

public data class SdpElementData(
    public var type: SdpType = 0,
    public var specificType: SdpSpecifictype = 0,
    public var data: SdpElementData0 = SdpElementData0(),
)

public class SdpElementData0(
    public var int128: SdpLargeInteger16 = SdpLargeInteger16(),
    public var int64: Long = 0L,
    public var int32: Int = 0,
    public var int16: Short = 0,
    public var int8: Byte = 0,
    public var uint128: SdpUlargeInteger16 = SdpUlargeInteger16(),
    public var uint64: ULong = 0uL,
    public var uint32: UInt = 0u,
    public var uint16: UShort = 0u,
    public var uint8: UByte = 0u,
    public var booleanVal: UByte = 0u,
    public var uuid128: Guid = Guid(),
    public var uuid32: UInt = 0u,
    public var uuid16: UShort = 0u,
    public var string: SdpElementData00 = SdpElementData00(),
    public var url: SdpElementData01 = SdpElementData01(),
    public var sequence: SdpElementData02 = SdpElementData02(),
    public var alternative: SdpElementData03 = SdpElementData03(),
)

public data class SdpElementData03(
    public var value: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class SdpElementData02(
    public var value: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class SdpElementData00(
    public var value: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class SdpElementData01(
    public var value: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class SdpLargeInteger16(
    public var lowPart: ULong = 0uL,
    public var highPart: Long = 0L,
)

public data class SdpStringTypeData(
    public var encoding: UShort = 0u,
    public var mibeNum: UShort = 0u,
    public var attributeId: UShort = 0u,
)

public data class SdpUlargeInteger16(
    public var lowPart: ULong = 0uL,
    public var highPart: ULong = 0uL,
)

public data class SockaddrBth(
    public var addressFamily: UShort = 0u,
    public var btAddr: ULong = 0uL,
    public var serviceClassId: Guid = Guid(),
    public var port: UInt = 0u,
)

public data class SdpAttributeRange(
    public var minAttribute: UShort = 0u,
    public var maxAttribute: UShort = 0u,
)

public data class SdpQueryUuid(
    public var u: SdpQueryUuidUnion = SdpQueryUuidUnion(),
    public var uuidType: UShort = 0u,
)

public data class SdpQueryUuidUnion(
    public var uuid128: Guid = Guid(),
    public var uuid32: UInt = 0u,
    public var uuid16: UShort = 0u,
)
