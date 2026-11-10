@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.communication

public data class Commconfig(
    public var dwSize: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dcb: Dcb = Dcb(),
    public var dwProviderSubType: UInt = 0u,
    public var dwProviderOffset: UInt = 0u,
    public var dwProviderSize: UInt = 0u,
    public var wcProviderData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Commconfig) return false
        if (this.dwSize != other.dwSize) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wReserved != other.wReserved) return false
        if (this.dcb != other.dcb) return false
        if (this.dwProviderSubType != other.dwProviderSubType) return false
        if (this.dwProviderOffset != other.dwProviderOffset) return false
        if (this.dwProviderSize != other.dwProviderSize) return false
        if (!this.wcProviderData.contentEquals(other.wcProviderData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.dcb.hashCode()
        result = 31 * result + this.dwProviderSubType.hashCode()
        result = 31 * result + this.dwProviderOffset.hashCode()
        result = 31 * result + this.dwProviderSize.hashCode()
        result = 31 * result + this.wcProviderData.contentHashCode()
        return result
    }
}

public class Commprop(
    public var wPacketLength: UShort = 0u,
    public var wPacketVersion: UShort = 0u,
    public var dwServiceMask: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwMaxTxQueue: UInt = 0u,
    public var dwMaxRxQueue: UInt = 0u,
    public var dwMaxBaud: UInt = 0u,
    public var dwProvSubType: UInt = 0u,
    public var dwProvCapabilities: UInt = 0u,
    public var dwSettableParams: UInt = 0u,
    public var dwSettableBaud: UInt = 0u,
    public var wSettableData: UShort = 0u,
    public var wSettableStopParity: CommpropStopParity = 0u,
    public var dwCurrentTxQueue: UInt = 0u,
    public var dwCurrentRxQueue: UInt = 0u,
    public var dwProvSpec1: UInt = 0u,
    public var dwProvSpec2: UInt = 0u,
    public var wcProvChar: UShortArray = UShortArray(1),
)

public data class Commtimeouts(
    public var readIntervalTimeout: UInt = 0u,
    public var readTotalTimeoutMultiplier: UInt = 0u,
    public var readTotalTimeoutConstant: UInt = 0u,
    public var writeTotalTimeoutMultiplier: UInt = 0u,
    public var writeTotalTimeoutConstant: UInt = 0u,
)

public data class Comstat(
    public var bitfield: UInt = 0u,
    public var cbInQue: UInt = 0u,
    public var cbOutQue: UInt = 0u,
)

public data class Dcb(
    public var dCBlength: UInt = 0u,
    public var baudRate: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var wReserved: UShort = 0u,
    public var xonLim: UShort = 0u,
    public var xoffLim: UShort = 0u,
    public var byteSize: UByte = 0u,
    public var parity: DcbParity = 0u,
    public var stopBits: DcbStopBits = 0u,
    public var xonChar: Byte = 0,
    public var xoffChar: Byte = 0,
    public var errorChar: Byte = 0,
    public var eofChar: Byte = 0,
    public var evtChar: Byte = 0,
    public var wReserved1: UShort = 0u,
)

public class Modemdevcaps(
    public var dwActualSize: UInt = 0u,
    public var dwRequiredSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwModemProviderVersion: UInt = 0u,
    public var dwModemManufacturerOffset: UInt = 0u,
    public var dwModemManufacturerSize: UInt = 0u,
    public var dwModemModelOffset: UInt = 0u,
    public var dwModemModelSize: UInt = 0u,
    public var dwModemVersionOffset: UInt = 0u,
    public var dwModemVersionSize: UInt = 0u,
    public var dwDialOptions: ModemdevcapsDialOptions = 0u,
    public var dwCallSetupFailTimer: UInt = 0u,
    public var dwInactivityTimeout: UInt = 0u,
    public var dwSpeakerVolume: ModemdevcapsSpeakerVolume = 0u,
    public var dwSpeakerMode: ModemdevcapsSpeakerMode = 0u,
    public var dwModemOptions: UInt = 0u,
    public var dwMaxDTERate: UInt = 0u,
    public var dwMaxDCERate: UInt = 0u,
    public var abVariablePortion: UByteArray = UByteArray(1),
)

public data class Modemsettings(
    public var dwActualSize: UInt = 0u,
    public var dwRequiredSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwCallSetupFailTimer: UInt = 0u,
    public var dwInactivityTimeout: UInt = 0u,
    public var dwSpeakerVolume: ModemSpeakerVolume = 0u,
    public var dwSpeakerMode: ModemsettingsSpeakerMode = 0u,
    public var dwPreferredModemOptions: UInt = 0u,
    public var dwNegotiatedModemOptions: UInt = 0u,
    public var dwNegotiatedDCERate: UInt = 0u,
    public var abVariablePortion: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Modemsettings) return false
        if (this.dwActualSize != other.dwActualSize) return false
        if (this.dwRequiredSize != other.dwRequiredSize) return false
        if (this.dwDevSpecificOffset != other.dwDevSpecificOffset) return false
        if (this.dwDevSpecificSize != other.dwDevSpecificSize) return false
        if (this.dwCallSetupFailTimer != other.dwCallSetupFailTimer) return false
        if (this.dwInactivityTimeout != other.dwInactivityTimeout) return false
        if (this.dwSpeakerVolume != other.dwSpeakerVolume) return false
        if (this.dwSpeakerMode != other.dwSpeakerMode) return false
        if (this.dwPreferredModemOptions != other.dwPreferredModemOptions) return false
        if (this.dwNegotiatedModemOptions != other.dwNegotiatedModemOptions) return false
        if (this.dwNegotiatedDCERate != other.dwNegotiatedDCERate) return false
        if (!this.abVariablePortion.contentEquals(other.abVariablePortion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwActualSize.hashCode()
        result = 31 * result + this.dwRequiredSize.hashCode()
        result = 31 * result + this.dwDevSpecificOffset.hashCode()
        result = 31 * result + this.dwDevSpecificSize.hashCode()
        result = 31 * result + this.dwCallSetupFailTimer.hashCode()
        result = 31 * result + this.dwInactivityTimeout.hashCode()
        result = 31 * result + this.dwSpeakerVolume.hashCode()
        result = 31 * result + this.dwSpeakerMode.hashCode()
        result = 31 * result + this.dwPreferredModemOptions.hashCode()
        result = 31 * result + this.dwNegotiatedModemOptions.hashCode()
        result = 31 * result + this.dwNegotiatedDCERate.hashCode()
        result = 31 * result + this.abVariablePortion.contentHashCode()
        return result
    }
}
