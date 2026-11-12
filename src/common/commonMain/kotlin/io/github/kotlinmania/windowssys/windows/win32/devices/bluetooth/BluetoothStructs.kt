@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public class BluetoothCodPairs internal constructor(
    public var ulCODMask: UInt,
    pcszDescriptionCtorArg: Pcwstr,
) {
    public var pcszDescription: Pcwstr = pcszDescriptionCtorArg
        internal set

    public constructor() : this(
        ulCODMask = 0u,
        pcszDescriptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.ulCODMask

    public operator fun component2(): Pcwstr = this.pcszDescription

    public fun copy(ulCODMask: UInt = this.ulCODMask, pcszDescription: Pcwstr = this.pcszDescription): BluetoothCodPairs = BluetoothCodPairs(ulCODMask = ulCODMask, pcszDescriptionCtorArg = pcszDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothCodPairs) return false
        if (this.ulCODMask != other.ulCODMask) return false
        if (this.pcszDescription != other.pcszDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulCODMask.hashCode()
        result = 31 * result + this.pcszDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulCODMask: UInt = 0u,
            pcszDescription: Pcwstr = ConstPtr(0L),
        ): BluetoothCodPairs =
            BluetoothCodPairs(
                ulCODMask = ulCODMask,
                pcszDescriptionCtorArg = pcszDescription,
            )
    }
}

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

public class BluetoothDeviceSearchParams internal constructor(
    public var dwSize: UInt,
    public var fReturnAuthenticated: Bool,
    public var fReturnRemembered: Bool,
    public var fReturnUnknown: Bool,
    public var fReturnConnected: Bool,
    public var fIssueInquiry: Bool,
    public var cTimeoutMultiplier: UByte,
    hRadioCtorArg: Handle,
) {
    public var hRadio: Handle = hRadioCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        fReturnAuthenticated = 0,
        fReturnRemembered = 0,
        fReturnUnknown = 0,
        fReturnConnected = 0,
        fIssueInquiry = 0,
        cTimeoutMultiplier = 0u,
        hRadioCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Bool = this.fReturnAuthenticated

    public operator fun component3(): Bool = this.fReturnRemembered

    public operator fun component4(): Bool = this.fReturnUnknown

    public operator fun component5(): Bool = this.fReturnConnected

    public operator fun component6(): Bool = this.fIssueInquiry

    public operator fun component7(): UByte = this.cTimeoutMultiplier

    public operator fun component8(): Handle = this.hRadio

    public fun copy(dwSize: UInt = this.dwSize, fReturnAuthenticated: Bool = this.fReturnAuthenticated, fReturnRemembered: Bool = this.fReturnRemembered, fReturnUnknown: Bool = this.fReturnUnknown, fReturnConnected: Bool = this.fReturnConnected, fIssueInquiry: Bool = this.fIssueInquiry, cTimeoutMultiplier: UByte = this.cTimeoutMultiplier, hRadio: Handle = this.hRadio): BluetoothDeviceSearchParams = BluetoothDeviceSearchParams(dwSize = dwSize, fReturnAuthenticated = fReturnAuthenticated, fReturnRemembered = fReturnRemembered, fReturnUnknown = fReturnUnknown, fReturnConnected = fReturnConnected, fIssueInquiry = fIssueInquiry, cTimeoutMultiplier = cTimeoutMultiplier, hRadioCtorArg = hRadio)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothDeviceSearchParams) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fReturnAuthenticated != other.fReturnAuthenticated) return false
        if (this.fReturnRemembered != other.fReturnRemembered) return false
        if (this.fReturnUnknown != other.fReturnUnknown) return false
        if (this.fReturnConnected != other.fReturnConnected) return false
        if (this.fIssueInquiry != other.fIssueInquiry) return false
        if (this.cTimeoutMultiplier != other.cTimeoutMultiplier) return false
        if (this.hRadio != other.hRadio) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fReturnAuthenticated.hashCode()
        result = 31 * result + this.fReturnRemembered.hashCode()
        result = 31 * result + this.fReturnUnknown.hashCode()
        result = 31 * result + this.fReturnConnected.hashCode()
        result = 31 * result + this.fIssueInquiry.hashCode()
        result = 31 * result + this.cTimeoutMultiplier.hashCode()
        result = 31 * result + this.hRadio.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            fReturnAuthenticated: Bool = 0,
            fReturnRemembered: Bool = 0,
            fReturnUnknown: Bool = 0,
            fReturnConnected: Bool = 0,
            fIssueInquiry: Bool = 0,
            cTimeoutMultiplier: UByte = 0u,
            hRadio: Handle = MutPtr(0L),
        ): BluetoothDeviceSearchParams =
            BluetoothDeviceSearchParams(
                dwSize = dwSize,
                fReturnAuthenticated = fReturnAuthenticated,
                fReturnRemembered = fReturnRemembered,
                fReturnUnknown = fReturnUnknown,
                fReturnConnected = fReturnConnected,
                fIssueInquiry = fIssueInquiry,
                cTimeoutMultiplier = cTimeoutMultiplier,
                hRadioCtorArg = hRadio,
            )
    }
}

public data class BluetoothFindRadioParams(
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothFindRadioParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothFindRadioParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BluetoothFindRadioParams =
                    BluetoothFindRadioParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BluetoothFindRadioParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                }
            }
    }
}

public class BluetoothGattValueChangedEvent internal constructor(
    public var changedAttributeHandle: UShort,
    public var characteristicValueDataSize: Int,
    characteristicValueCtorArg: MutPtr<BthLeGattCharacteristicValue>,
) {
    public var characteristicValue: MutPtr<BthLeGattCharacteristicValue> = characteristicValueCtorArg
        internal set

    public constructor() : this(
        changedAttributeHandle = 0u,
        characteristicValueDataSize = 0,
        characteristicValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.changedAttributeHandle

    public operator fun component2(): Int = this.characteristicValueDataSize

    public operator fun component3(): MutPtr<BthLeGattCharacteristicValue> = this.characteristicValue

    public fun copy(changedAttributeHandle: UShort = this.changedAttributeHandle, characteristicValueDataSize: Int = this.characteristicValueDataSize, characteristicValue: MutPtr<BthLeGattCharacteristicValue> = this.characteristicValue): BluetoothGattValueChangedEvent = BluetoothGattValueChangedEvent(changedAttributeHandle = changedAttributeHandle, characteristicValueDataSize = characteristicValueDataSize, characteristicValueCtorArg = characteristicValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothGattValueChangedEvent) return false
        if (this.changedAttributeHandle != other.changedAttributeHandle) return false
        if (this.characteristicValueDataSize != other.characteristicValueDataSize) return false
        if (this.characteristicValue != other.characteristicValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.changedAttributeHandle.hashCode()
        result = 31 * result + this.characteristicValueDataSize.hashCode()
        result = 31 * result + this.characteristicValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothGattValueChangedEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothGattValueChangedEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BluetoothGattValueChangedEvent =
                    BluetoothGattValueChangedEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<BthLeGattCharacteristicValue>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BluetoothGattValueChangedEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.changedAttributeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.characteristicValueDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<BthLeGattCharacteristicValue>(64)
                    ).writeNative(addr + 16L, value.characteristicValue)
                }
            }

        public operator fun invoke(
            changedAttributeHandle: UShort = 0u,
            characteristicValueDataSize: Int = 0,
            characteristicValue: MutPtr<BthLeGattCharacteristicValue> = MutPtr(0L),
        ): BluetoothGattValueChangedEvent =
            BluetoothGattValueChangedEvent(
                changedAttributeHandle = changedAttributeHandle,
                characteristicValueDataSize = characteristicValueDataSize,
                characteristicValueCtorArg = characteristicValue,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothNumericComparisonInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothNumericComparisonInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BluetoothNumericComparisonInfo =
                    BluetoothNumericComparisonInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BluetoothNumericComparisonInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numericValue)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothOobDataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothOobDataInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): BluetoothOobDataInfo =
                    BluetoothOobDataInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BluetoothOobDataInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.c.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.r.toList())
                }
            }
    }
}

public data class BluetoothPasskeyInfo(
    public var passkey: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothPasskeyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothPasskeyInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BluetoothPasskeyInfo =
                    BluetoothPasskeyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BluetoothPasskeyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.passkey)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothPinInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BluetoothPinInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 17L
                override fun readNative(addr: Long): BluetoothPinInfo =
                    BluetoothPinInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BluetoothPinInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.pin.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.pinLength)
                }
            }
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

public class BluetoothSelectDeviceParams internal constructor(
    public var dwSize: UInt,
    public var cNumOfClasses: UInt,
    prgClassOfDevicesCtorArg: MutPtr<BluetoothCodPairs>,
    pszInfoCtorArg: Pwstr,
    hwndParentCtorArg: Hwnd,
    public var fForceAuthentication: Bool,
    public var fShowAuthenticated: Bool,
    public var fShowRemembered: Bool,
    public var fShowUnknown: Bool,
    public var fAddNewDeviceWizard: Bool,
    public var fSkipServicesPage: Bool,
    public var pfnDeviceCallback: PfnDeviceCallback,
    pvParamCtorArg: MutPtr<CVoid>,
    public var cNumDevices: UInt,
    pDevicesCtorArg: MutPtr<BluetoothDeviceInfo>,
) {
    public var prgClassOfDevices: MutPtr<BluetoothCodPairs> = prgClassOfDevicesCtorArg
        internal set

    public var pszInfo: Pwstr = pszInfoCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pvParam: MutPtr<CVoid> = pvParamCtorArg
        internal set

    public var pDevices: MutPtr<BluetoothDeviceInfo> = pDevicesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        cNumOfClasses = 0u,
        prgClassOfDevicesCtorArg = MutPtr(0L),
        pszInfoCtorArg = MutPtr(0L),
        hwndParentCtorArg = MutPtr(0L),
        fForceAuthentication = 0,
        fShowAuthenticated = 0,
        fShowRemembered = 0,
        fShowUnknown = 0,
        fAddNewDeviceWizard = 0,
        fSkipServicesPage = 0,
        pfnDeviceCallback = null,
        pvParamCtorArg = MutPtr(0L),
        cNumDevices = 0u,
        pDevicesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.cNumOfClasses

    public operator fun component3(): MutPtr<BluetoothCodPairs> = this.prgClassOfDevices

    public operator fun component4(): Pwstr = this.pszInfo

    public operator fun component5(): Hwnd = this.hwndParent

    public operator fun component6(): Bool = this.fForceAuthentication

    public operator fun component7(): Bool = this.fShowAuthenticated

    public operator fun component8(): Bool = this.fShowRemembered

    public operator fun component9(): Bool = this.fShowUnknown

    public operator fun component10(): Bool = this.fAddNewDeviceWizard

    public operator fun component11(): Bool = this.fSkipServicesPage

    public operator fun component12(): PfnDeviceCallback = this.pfnDeviceCallback

    public operator fun component13(): MutPtr<CVoid> = this.pvParam

    public operator fun component14(): UInt = this.cNumDevices

    public operator fun component15(): MutPtr<BluetoothDeviceInfo> = this.pDevices

    public fun copy(dwSize: UInt = this.dwSize, cNumOfClasses: UInt = this.cNumOfClasses, prgClassOfDevices: MutPtr<BluetoothCodPairs> = this.prgClassOfDevices, pszInfo: Pwstr = this.pszInfo, hwndParent: Hwnd = this.hwndParent, fForceAuthentication: Bool = this.fForceAuthentication, fShowAuthenticated: Bool = this.fShowAuthenticated, fShowRemembered: Bool = this.fShowRemembered, fShowUnknown: Bool = this.fShowUnknown, fAddNewDeviceWizard: Bool = this.fAddNewDeviceWizard, fSkipServicesPage: Bool = this.fSkipServicesPage, pfnDeviceCallback: PfnDeviceCallback = this.pfnDeviceCallback, pvParam: MutPtr<CVoid> = this.pvParam, cNumDevices: UInt = this.cNumDevices, pDevices: MutPtr<BluetoothDeviceInfo> = this.pDevices): BluetoothSelectDeviceParams = BluetoothSelectDeviceParams(dwSize = dwSize, cNumOfClasses = cNumOfClasses, prgClassOfDevicesCtorArg = prgClassOfDevices, pszInfoCtorArg = pszInfo, hwndParentCtorArg = hwndParent, fForceAuthentication = fForceAuthentication, fShowAuthenticated = fShowAuthenticated, fShowRemembered = fShowRemembered, fShowUnknown = fShowUnknown, fAddNewDeviceWizard = fAddNewDeviceWizard, fSkipServicesPage = fSkipServicesPage, pfnDeviceCallback = pfnDeviceCallback, pvParamCtorArg = pvParam, cNumDevices = cNumDevices, pDevicesCtorArg = pDevices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BluetoothSelectDeviceParams) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cNumOfClasses != other.cNumOfClasses) return false
        if (this.prgClassOfDevices != other.prgClassOfDevices) return false
        if (this.pszInfo != other.pszInfo) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.fForceAuthentication != other.fForceAuthentication) return false
        if (this.fShowAuthenticated != other.fShowAuthenticated) return false
        if (this.fShowRemembered != other.fShowRemembered) return false
        if (this.fShowUnknown != other.fShowUnknown) return false
        if (this.fAddNewDeviceWizard != other.fAddNewDeviceWizard) return false
        if (this.fSkipServicesPage != other.fSkipServicesPage) return false
        if (this.pfnDeviceCallback != other.pfnDeviceCallback) return false
        if (this.pvParam != other.pvParam) return false
        if (this.cNumDevices != other.cNumDevices) return false
        if (this.pDevices != other.pDevices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cNumOfClasses.hashCode()
        result = 31 * result + this.prgClassOfDevices.hashCode()
        result = 31 * result + this.pszInfo.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.fForceAuthentication.hashCode()
        result = 31 * result + this.fShowAuthenticated.hashCode()
        result = 31 * result + this.fShowRemembered.hashCode()
        result = 31 * result + this.fShowUnknown.hashCode()
        result = 31 * result + this.fAddNewDeviceWizard.hashCode()
        result = 31 * result + this.fSkipServicesPage.hashCode()
        result = 31 * result + this.pfnDeviceCallback.hashCode()
        result = 31 * result + this.pvParam.hashCode()
        result = 31 * result + this.cNumDevices.hashCode()
        result = 31 * result + this.pDevices.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            cNumOfClasses: UInt = 0u,
            prgClassOfDevices: MutPtr<BluetoothCodPairs> = MutPtr(0L),
            pszInfo: Pwstr = MutPtr(0L),
            hwndParent: Hwnd = MutPtr(0L),
            fForceAuthentication: Bool = 0,
            fShowAuthenticated: Bool = 0,
            fShowRemembered: Bool = 0,
            fShowUnknown: Bool = 0,
            fAddNewDeviceWizard: Bool = 0,
            fSkipServicesPage: Bool = 0,
            pfnDeviceCallback: PfnDeviceCallback = null,
            pvParam: MutPtr<CVoid> = MutPtr(0L),
            cNumDevices: UInt = 0u,
            pDevices: MutPtr<BluetoothDeviceInfo> = MutPtr(0L),
        ): BluetoothSelectDeviceParams =
            BluetoothSelectDeviceParams(
                dwSize = dwSize,
                cNumOfClasses = cNumOfClasses,
                prgClassOfDevicesCtorArg = prgClassOfDevices,
                pszInfoCtorArg = pszInfo,
                hwndParentCtorArg = hwndParent,
                fForceAuthentication = fForceAuthentication,
                fShowAuthenticated = fShowAuthenticated,
                fShowRemembered = fShowRemembered,
                fShowUnknown = fShowUnknown,
                fAddNewDeviceWizard = fAddNewDeviceWizard,
                fSkipServicesPage = fSkipServicesPage,
                pfnDeviceCallback = pfnDeviceCallback,
                pvParamCtorArg = pvParam,
                cNumDevices = cNumDevices,
                pDevicesCtorArg = pDevices,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthDeviceInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): BthDeviceInfo =
                    BthDeviceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (248).toInt())
                        ).readNative(addr + 20L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: BthDeviceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.classOfDevice)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (248).toInt())
                    ).writeNative(addr + 20L, value.name.toList())
                }
            }
    }
}

public data class BthHciEventInfo(
    public var bthAddress: ULong = 0uL,
    public var connectionType: UByte = 0u,
    public var connected: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthHciEventInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthHciEventInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BthHciEventInfo =
                    BthHciEventInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: BthHciEventInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bthAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.connectionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.connected)
                }
            }
    }
}

public data class BthInfoReq(
    public var btAddr: ULong = 0uL,
    public var infoType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthInfoReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthInfoReq> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): BthInfoReq =
                    BthInfoReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BthInfoReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.btAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.infoType)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthL2capEventInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthL2capEventInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BthL2capEventInfo =
                    BthL2capEventInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                    )
                override fun writeNative(addr: Long, value: BthL2capEventInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bthAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.psm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.connected)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.initiated)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattCharacteristicValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattCharacteristicValue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BthLeGattCharacteristicValue =
                    BthLeGattCharacteristicValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BthLeGattCharacteristicValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): BthLeGattDescriptorValue00 =
                    BthLeGattDescriptorValue00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: BthLeGattDescriptorValue00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isReliableWriteEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.isAuxiliariesWritable)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): BthLeGattDescriptorValue01 =
                    BthLeGattDescriptorValue01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: BthLeGattDescriptorValue01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isSubscribeToNotification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.isSubscribeToIndication)
                }
            }
    }
}

public data class BthLeGattDescriptorValue02(
    public var isBroadcast: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthLeGattDescriptorValue02> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): BthLeGattDescriptorValue02 =
                    BthLeGattDescriptorValue02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BthLeGattDescriptorValue02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isBroadcast)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthPingReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthPingReq> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 53L
                override fun readNative(addr: Long): BthPingReq =
                    BthPingReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (44).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BthPingReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.btAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dataLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (44).toInt())
                    ).writeNative(addr + 9L, value.data.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthPingRsp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthPingRsp> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 45L
                override fun readNative(addr: Long): BthPingRsp =
                    BthPingRsp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (44).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BthPingRsp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.dataLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (44).toInt())
                    ).writeNative(addr + 1L, value.data.toList())
                }
            }
    }
}

public data class BthQueryDevice(
    public var lap: UInt = 0u,
    public var length: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthQueryDevice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthQueryDevice> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): BthQueryDevice =
                    BthQueryDevice(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BthQueryDevice) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.length)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthRadioInRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthRadioInRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): BthRadioInRange =
                    BthRadioInRange(
                        (BthDeviceInfo.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                    )
                override fun writeNative(addr: Long, value: BthRadioInRange) {
                    (BthDeviceInfo.typeLayout()).writeNative(addr, value.deviceInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.previousDeviceFlags)
                }
            }
    }
}

public class BthSetService internal constructor(
    pSdpVersionCtorArg: MutPtr<UInt>,
    pRecordHandleCtorArg: MutPtr<Handle>,
    public var fCodService: UInt,
    public var reserved: UIntArray,
    public var ulRecordLength: UInt,
    public var pRecord: UByteArray,
) {
    public var pSdpVersion: MutPtr<UInt> = pSdpVersionCtorArg
        internal set

    public var pRecordHandle: MutPtr<Handle> = pRecordHandleCtorArg
        internal set

    public constructor() : this(
        pSdpVersionCtorArg = MutPtr(0L),
        pRecordHandleCtorArg = MutPtr(0L),
        fCodService = 0u,
        reserved = UIntArray(5),
        ulRecordLength = 0u,
        pRecord = UByteArray(1),
    )

    public operator fun component1(): MutPtr<UInt> = this.pSdpVersion

    public operator fun component2(): MutPtr<Handle> = this.pRecordHandle

    public operator fun component3(): UInt = this.fCodService

    public operator fun component4(): UIntArray = this.reserved

    public operator fun component5(): UInt = this.ulRecordLength

    public operator fun component6(): UByteArray = this.pRecord

    public fun copy(pSdpVersion: MutPtr<UInt> = this.pSdpVersion, pRecordHandle: MutPtr<Handle> = this.pRecordHandle, fCodService: UInt = this.fCodService, reserved: UIntArray = this.reserved, ulRecordLength: UInt = this.ulRecordLength, pRecord: UByteArray = this.pRecord): BthSetService = BthSetService(pSdpVersionCtorArg = pSdpVersion, pRecordHandleCtorArg = pRecordHandle, fCodService = fCodService, reserved = reserved, ulRecordLength = ulRecordLength, pRecord = pRecord)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthSetService> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BthSetService> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 45L
                override fun readNative(addr: Long): BthSetService =
                    BthSetService(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Handle>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 44L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BthSetService) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr, value.pSdpVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Handle>(64)
                    ).writeNative(addr + 8L, value.pRecordHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fCodService)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr + 20L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulRecordLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 44L, value.pRecord.toList())
                }
            }

        public operator fun invoke(
            pSdpVersion: MutPtr<UInt> = MutPtr(0L),
            pRecordHandle: MutPtr<Handle> = MutPtr(0L),
            fCodService: UInt = 0u,
            reserved: UIntArray = UIntArray(5),
            ulRecordLength: UInt = 0u,
            pRecord: UByteArray = UByteArray(1),
        ): BthSetService =
            BthSetService(
                pSdpVersionCtorArg = pSdpVersion,
                pRecordHandleCtorArg = pRecordHandle,
                fCodService = fCodService,
                reserved = reserved,
                ulRecordLength = ulRecordLength,
                pRecord = pRecord,
            )
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommMscData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommMscData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): RfcommMscData =
                    RfcommMscData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: RfcommMscData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.signals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.breakTarget)
                }
            }
    }
}

public data class RfcommRlsData(
    public var lineStatus: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommRlsData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommRlsData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): RfcommRlsData =
                    RfcommRlsData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RfcommRlsData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lineStatus)
                }
            }
    }
}

public data class RfcommRpnData(
    public var baud: UByte = 0u,
    public var data: UByte = 0u,
    public var flowControl: UByte = 0u,
    public var xonChar: UByte = 0u,
    public var xoffChar: UByte = 0u,
    public var parameterMask1: UByte = 0u,
    public var parameterMask2: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommRpnData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfcommRpnData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 7L
                override fun readNative(addr: Long): RfcommRpnData =
                    RfcommRpnData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: RfcommRpnData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.baud)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flowControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.xonChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.xoffChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.parameterMask1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.parameterMask2)
                }
            }
    }
}

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

public class SdpElementData03 internal constructor(
    valueCtorArg: MutPtr<UByte>,
    public var length: UInt,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.value

    public operator fun component2(): UInt = this.length

    public fun copy(value: MutPtr<UByte> = this.value, length: UInt = this.length): SdpElementData03 = SdpElementData03(valueCtorArg = value, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdpElementData03) return false
        if (this.value != other.value) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData03> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpElementData03 =
                    SdpElementData03(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpElementData03) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            value: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
        ): SdpElementData03 =
            SdpElementData03(
                valueCtorArg = value,
                length = length,
            )
    }
}

public class SdpElementData02 internal constructor(
    valueCtorArg: MutPtr<UByte>,
    public var length: UInt,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.value

    public operator fun component2(): UInt = this.length

    public fun copy(value: MutPtr<UByte> = this.value, length: UInt = this.length): SdpElementData02 = SdpElementData02(valueCtorArg = value, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdpElementData02) return false
        if (this.value != other.value) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpElementData02 =
                    SdpElementData02(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpElementData02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            value: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
        ): SdpElementData02 =
            SdpElementData02(
                valueCtorArg = value,
                length = length,
            )
    }
}

public class SdpElementData00 internal constructor(
    valueCtorArg: MutPtr<UByte>,
    public var length: UInt,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.value

    public operator fun component2(): UInt = this.length

    public fun copy(value: MutPtr<UByte> = this.value, length: UInt = this.length): SdpElementData00 = SdpElementData00(valueCtorArg = value, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdpElementData00) return false
        if (this.value != other.value) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpElementData00 =
                    SdpElementData00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpElementData00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            value: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
        ): SdpElementData00 =
            SdpElementData00(
                valueCtorArg = value,
                length = length,
            )
    }
}

public class SdpElementData01 internal constructor(
    valueCtorArg: MutPtr<UByte>,
    public var length: UInt,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.value

    public operator fun component2(): UInt = this.length

    public fun copy(value: MutPtr<UByte> = this.value, length: UInt = this.length): SdpElementData01 = SdpElementData01(valueCtorArg = value, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SdpElementData01) return false
        if (this.value != other.value) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpElementData01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpElementData01 =
                    SdpElementData01(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpElementData01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            value: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
        ): SdpElementData01 =
            SdpElementData01(
                valueCtorArg = value,
                length = length,
            )
    }
}

public data class SdpLargeInteger16(
    public var lowPart: ULong = 0uL,
    public var highPart: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpLargeInteger16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpLargeInteger16> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpLargeInteger16 =
                    SdpLargeInteger16(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpLargeInteger16) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.highPart)
                }
            }
    }
}

public data class SdpStringTypeData(
    public var encoding: UShort = 0u,
    public var mibeNum: UShort = 0u,
    public var attributeId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpStringTypeData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpStringTypeData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SdpStringTypeData =
                    SdpStringTypeData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SdpStringTypeData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.encoding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.mibeNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.attributeId)
                }
            }
    }
}

public data class SdpUlargeInteger16(
    public var lowPart: ULong = 0uL,
    public var highPart: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpUlargeInteger16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpUlargeInteger16> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SdpUlargeInteger16 =
                    SdpUlargeInteger16(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SdpUlargeInteger16) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.highPart)
                }
            }
    }
}

public data class SockaddrBth(
    public var addressFamily: UShort = 0u,
    public var btAddr: ULong = 0uL,
    public var serviceClassId: Guid = Guid(),
    public var port: UInt = 0u,
)

public data class SdpAttributeRange(
    public var minAttribute: UShort = 0u,
    public var maxAttribute: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpAttributeRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SdpAttributeRange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SdpAttributeRange =
                    SdpAttributeRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SdpAttributeRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minAttribute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maxAttribute)
                }
            }
    }
}

public data class SdpQueryUuid(
    public var u: SdpQueryUuidUnion = SdpQueryUuidUnion(),
    public var uuidType: UShort = 0u,
)

public data class SdpQueryUuidUnion(
    public var uuid128: Guid = Guid(),
    public var uuid32: UInt = 0u,
    public var uuid16: UShort = 0u,
)
