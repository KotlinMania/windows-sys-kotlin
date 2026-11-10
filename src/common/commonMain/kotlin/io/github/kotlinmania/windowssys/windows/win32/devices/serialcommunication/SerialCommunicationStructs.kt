@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer

public data class SerenumPortDesc(
    public var size: UInt = 0u,
    public var portHandle: COpaquePointer? = null,
    public var portAddress: Long = 0L,
    public var reserved: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SerenumPortDesc) return false
        if (this.size != other.size) return false
        if (this.portHandle != other.portHandle) return false
        if (this.portAddress != other.portAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.portHandle.hashCode()
        result = 31 * result + this.portAddress.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SerenumPortParameters(
    public var size: UInt = 0u,
    public var readAccessor: PserenumReadport = null,
    public var writeAccessor: PserenumWriteport = null,
    public var serPortAddress: COpaquePointer? = null,
    public var hardwareHandle: COpaquePointer? = null,
    public var portion: SerenumPortion = 0,
    public var numberAxis: UShort = 0u,
    public var reserved: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SerenumPortParameters) return false
        if (this.size != other.size) return false
        if (this.readAccessor != other.readAccessor) return false
        if (this.writeAccessor != other.writeAccessor) return false
        if (this.serPortAddress != other.serPortAddress) return false
        if (this.hardwareHandle != other.hardwareHandle) return false
        if (this.portion != other.portion) return false
        if (this.numberAxis != other.numberAxis) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.readAccessor.hashCode()
        result = 31 * result + this.writeAccessor.hashCode()
        result = 31 * result + this.serPortAddress.hashCode()
        result = 31 * result + this.hardwareHandle.hashCode()
        result = 31 * result + this.portion.hashCode()
        result = 31 * result + this.numberAxis.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Serialconfig(
    public var size: UInt = 0u,
    public var version: UShort = 0u,
    public var subType: UInt = 0u,
    public var provOffset: UInt = 0u,
    public var providerSize: UInt = 0u,
    public var providerData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serialconfig) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.subType != other.subType) return false
        if (this.provOffset != other.provOffset) return false
        if (this.providerSize != other.providerSize) return false
        if (!this.providerData.contentEquals(other.providerData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.subType.hashCode()
        result = 31 * result + this.provOffset.hashCode()
        result = 31 * result + this.providerSize.hashCode()
        result = 31 * result + this.providerData.contentHashCode()
        return result
    }
}

public data class SerialperfStats(
    public var receivedCount: UInt = 0u,
    public var transmittedCount: UInt = 0u,
    public var frameErrorCount: UInt = 0u,
    public var serialOverrunErrorCount: UInt = 0u,
    public var bufferOverrunErrorCount: UInt = 0u,
    public var parityErrorCount: UInt = 0u,
)

public data class SerialBasicSettings(
    public var timeouts: SerialTimeouts = SerialTimeouts(),
    public var handFlow: SerialHandflow = SerialHandflow(),
    public var rxFifo: UInt = 0u,
    public var txFifo: UInt = 0u,
)

public data class SerialBaudRate(public var baudRate: UInt = 0u)

public data class SerialChars(
    public var eofChar: UByte = 0u,
    public var errorChar: UByte = 0u,
    public var breakChar: UByte = 0u,
    public var eventChar: UByte = 0u,
    public var xonChar: UByte = 0u,
    public var xoffChar: UByte = 0u,
)

public class SerialCommprop(
    public var packetLength: UShort = 0u,
    public var packetVersion: UShort = 0u,
    public var serviceMask: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var maxTxQueue: UInt = 0u,
    public var maxRxQueue: UInt = 0u,
    public var maxBaud: UInt = 0u,
    public var provSubType: UInt = 0u,
    public var provCapabilities: UInt = 0u,
    public var settableParams: UInt = 0u,
    public var settableBaud: UInt = 0u,
    public var settableData: UShort = 0u,
    public var settableStopParity: UShort = 0u,
    public var currentTxQueue: UInt = 0u,
    public var currentRxQueue: UInt = 0u,
    public var provSpec1: UInt = 0u,
    public var provSpec2: UInt = 0u,
    public var provChar: UShortArray = UShortArray(1),
)

public data class SerialHandflow(
    public var controlHandShake: UInt = 0u,
    public var flowReplace: UInt = 0u,
    public var xonLimit: Int = 0,
    public var xoffLimit: Int = 0,
)

public data class SerialLineControl(
    public var stopBits: UByte = 0u,
    public var parity: UByte = 0u,
    public var wordLength: UByte = 0u,
)

public data class SerialQueueSize(public var inSize: UInt = 0u, public var outSize: UInt = 0u)

public data class SerialStatus(
    public var errors: UInt = 0u,
    public var holdReasons: UInt = 0u,
    public var amountInInQueue: UInt = 0u,
    public var amountInOutQueue: UInt = 0u,
    public var eofReceived: Boolean = false,
    public var waitForImmediate: Boolean = false,
)

public data class SerialTimeouts(
    public var readIntervalTimeout: UInt = 0u,
    public var readTotalTimeoutMultiplier: UInt = 0u,
    public var readTotalTimeoutConstant: UInt = 0u,
    public var writeTotalTimeoutMultiplier: UInt = 0u,
    public var writeTotalTimeoutConstant: UInt = 0u,
)

public data class SerialXoffCounter(
    public var timeout: UInt = 0u,
    public var counter: Int = 0,
    public var xoffChar: UByte = 0u,
)
