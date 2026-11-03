@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.communication

public data class COMMCONFIG(
    public var dwSize: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dcb: DCB = DCB(),
    public var dwProviderSubType: UInt = 0u,
    public var dwProviderOffset: UInt = 0u,
    public var dwProviderSize: UInt = 0u,
    public var wcProviderData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COMMCONFIG) return false
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

public class COMMPROP(
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
    public var wSettableStopParity: COMMPROP_STOP_PARITY = 0u,
    public var dwCurrentTxQueue: UInt = 0u,
    public var dwCurrentRxQueue: UInt = 0u,
    public var dwProvSpec1: UInt = 0u,
    public var dwProvSpec2: UInt = 0u,
    public var wcProvChar: UShortArray = UShortArray(1),
)

public data class COMMTIMEOUTS(
    public var ReadIntervalTimeout: UInt = 0u,
    public var ReadTotalTimeoutMultiplier: UInt = 0u,
    public var ReadTotalTimeoutConstant: UInt = 0u,
    public var WriteTotalTimeoutMultiplier: UInt = 0u,
    public var WriteTotalTimeoutConstant: UInt = 0u,
)

public data class COMSTAT(
    public var _bitfield: UInt = 0u,
    public var cbInQue: UInt = 0u,
    public var cbOutQue: UInt = 0u,
)

public data class DCB(
    public var DCBlength: UInt = 0u,
    public var BaudRate: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var wReserved: UShort = 0u,
    public var XonLim: UShort = 0u,
    public var XoffLim: UShort = 0u,
    public var ByteSize: UByte = 0u,
    public var Parity: DCB_PARITY = 0u,
    public var StopBits: DCB_STOP_BITS = 0u,
    public var XonChar: Byte = 0,
    public var XoffChar: Byte = 0,
    public var ErrorChar: Byte = 0,
    public var EofChar: Byte = 0,
    public var EvtChar: Byte = 0,
    public var wReserved1: UShort = 0u,
)

public class MODEMDEVCAPS(
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
    public var dwDialOptions: MODEMDEVCAPS_DIAL_OPTIONS = 0u,
    public var dwCallSetupFailTimer: UInt = 0u,
    public var dwInactivityTimeout: UInt = 0u,
    public var dwSpeakerVolume: MODEMDEVCAPS_SPEAKER_VOLUME = 0u,
    public var dwSpeakerMode: MODEMDEVCAPS_SPEAKER_MODE = 0u,
    public var dwModemOptions: UInt = 0u,
    public var dwMaxDTERate: UInt = 0u,
    public var dwMaxDCERate: UInt = 0u,
    public var abVariablePortion: UByteArray = UByteArray(1),
)

public data class MODEMSETTINGS(
    public var dwActualSize: UInt = 0u,
    public var dwRequiredSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwCallSetupFailTimer: UInt = 0u,
    public var dwInactivityTimeout: UInt = 0u,
    public var dwSpeakerVolume: MODEM_SPEAKER_VOLUME = 0u,
    public var dwSpeakerMode: MODEMSETTINGS_SPEAKER_MODE = 0u,
    public var dwPreferredModemOptions: UInt = 0u,
    public var dwNegotiatedModemOptions: UInt = 0u,
    public var dwNegotiatedDCERate: UInt = 0u,
    public var abVariablePortion: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODEMSETTINGS) return false
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
