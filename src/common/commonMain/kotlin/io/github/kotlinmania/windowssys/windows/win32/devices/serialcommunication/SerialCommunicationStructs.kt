@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

public data class SERENUM_PORT_DESC(
    public var Size: UInt = 0u,
    public var PortHandle: Long = 0L,
    public var PortAddress: Long = 0L,
    public var Reserved: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERENUM_PORT_DESC) return false
        if (this.Size != other.Size) return false
        if (this.PortHandle != other.PortHandle) return false
        if (this.PortAddress != other.PortAddress) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.PortHandle.hashCode()
        result = 31 * result + this.PortAddress.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SERENUM_PORT_PARAMETERS(
    public var Size: UInt = 0u,
    public var ReadAccessor: PSERENUM_READPORT = null,
    public var WriteAccessor: PSERENUM_WRITEPORT = null,
    public var SerPortAddress: Long = 0L,
    public var HardwareHandle: Long = 0L,
    public var Portion: SERENUM_PORTION = 0,
    public var NumberAxis: UShort = 0u,
    public var Reserved: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERENUM_PORT_PARAMETERS) return false
        if (this.Size != other.Size) return false
        if (this.ReadAccessor != other.ReadAccessor) return false
        if (this.WriteAccessor != other.WriteAccessor) return false
        if (this.SerPortAddress != other.SerPortAddress) return false
        if (this.HardwareHandle != other.HardwareHandle) return false
        if (this.Portion != other.Portion) return false
        if (this.NumberAxis != other.NumberAxis) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.ReadAccessor.hashCode()
        result = 31 * result + this.WriteAccessor.hashCode()
        result = 31 * result + this.SerPortAddress.hashCode()
        result = 31 * result + this.HardwareHandle.hashCode()
        result = 31 * result + this.Portion.hashCode()
        result = 31 * result + this.NumberAxis.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SERIALCONFIG(
    public var Size: UInt = 0u,
    public var Version: UShort = 0u,
    public var SubType: UInt = 0u,
    public var ProvOffset: UInt = 0u,
    public var ProviderSize: UInt = 0u,
    public var ProviderData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERIALCONFIG) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this.SubType != other.SubType) return false
        if (this.ProvOffset != other.ProvOffset) return false
        if (this.ProviderSize != other.ProviderSize) return false
        if (!this.ProviderData.contentEquals(other.ProviderData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.SubType.hashCode()
        result = 31 * result + this.ProvOffset.hashCode()
        result = 31 * result + this.ProviderSize.hashCode()
        result = 31 * result + this.ProviderData.contentHashCode()
        return result
    }
}

public data class SERIALPERF_STATS(
    public var ReceivedCount: UInt = 0u,
    public var TransmittedCount: UInt = 0u,
    public var FrameErrorCount: UInt = 0u,
    public var SerialOverrunErrorCount: UInt = 0u,
    public var BufferOverrunErrorCount: UInt = 0u,
    public var ParityErrorCount: UInt = 0u,
)

public data class SERIAL_BASIC_SETTINGS(
    public var Timeouts: SERIAL_TIMEOUTS = SERIAL_TIMEOUTS(),
    public var HandFlow: SERIAL_HANDFLOW = SERIAL_HANDFLOW(),
    public var RxFifo: UInt = 0u,
    public var TxFifo: UInt = 0u,
)

public data class SERIAL_BAUD_RATE(public var BaudRate: UInt = 0u)

public data class SERIAL_CHARS(
    public var EofChar: UByte = 0u,
    public var ErrorChar: UByte = 0u,
    public var BreakChar: UByte = 0u,
    public var EventChar: UByte = 0u,
    public var XonChar: UByte = 0u,
    public var XoffChar: UByte = 0u,
)

public class SERIAL_COMMPROP(
    public var PacketLength: UShort = 0u,
    public var PacketVersion: UShort = 0u,
    public var ServiceMask: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var MaxTxQueue: UInt = 0u,
    public var MaxRxQueue: UInt = 0u,
    public var MaxBaud: UInt = 0u,
    public var ProvSubType: UInt = 0u,
    public var ProvCapabilities: UInt = 0u,
    public var SettableParams: UInt = 0u,
    public var SettableBaud: UInt = 0u,
    public var SettableData: UShort = 0u,
    public var SettableStopParity: UShort = 0u,
    public var CurrentTxQueue: UInt = 0u,
    public var CurrentRxQueue: UInt = 0u,
    public var ProvSpec1: UInt = 0u,
    public var ProvSpec2: UInt = 0u,
    public var ProvChar: UShortArray = UShortArray(1),
)

public data class SERIAL_HANDFLOW(
    public var ControlHandShake: UInt = 0u,
    public var FlowReplace: UInt = 0u,
    public var XonLimit: Int = 0,
    public var XoffLimit: Int = 0,
)

public data class SERIAL_LINE_CONTROL(
    public var StopBits: UByte = 0u,
    public var Parity: UByte = 0u,
    public var WordLength: UByte = 0u,
)

public data class SERIAL_QUEUE_SIZE(public var InSize: UInt = 0u, public var OutSize: UInt = 0u)

public data class SERIAL_STATUS(
    public var Errors: UInt = 0u,
    public var HoldReasons: UInt = 0u,
    public var AmountInInQueue: UInt = 0u,
    public var AmountInOutQueue: UInt = 0u,
    public var EofReceived: Boolean = false,
    public var WaitForImmediate: Boolean = false,
)

public data class SERIAL_TIMEOUTS(
    public var ReadIntervalTimeout: UInt = 0u,
    public var ReadTotalTimeoutMultiplier: UInt = 0u,
    public var ReadTotalTimeoutConstant: UInt = 0u,
    public var WriteTotalTimeoutMultiplier: UInt = 0u,
    public var WriteTotalTimeoutConstant: UInt = 0u,
)

public data class SERIAL_XOFF_COUNTER(
    public var Timeout: UInt = 0u,
    public var Counter: Int = 0,
    public var XoffChar: UByte = 0u,
)
