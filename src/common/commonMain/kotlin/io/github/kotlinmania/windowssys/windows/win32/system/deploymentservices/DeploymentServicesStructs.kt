@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public data class PxeAddress(
    public var uFlags: UInt = 0u,
    public var anonymous: PxeAddress0 = PxeAddress0(),
    public var uAddrLen: UInt = 0u,
    public var uPort: UShort = 0u,
)

public data class PxeAddress0(
    public var bAddress: UByteArray = UByteArray(16),
    public var uIpAddress: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeAddress0) return false
        if (!this.bAddress.contentEquals(other.bAddress)) return false
        if (this.uIpAddress != other.uIpAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bAddress.contentHashCode()
        result = 31 * result + this.uIpAddress.hashCode()
        return result
    }
}

public data class PxeDhcpv6Message(
    public var messageType: UByte = 0u,
    public var transactionIDByte1: UByte = 0u,
    public var transactionIDByte2: UByte = 0u,
    public var transactionIDByte3: UByte = 0u,
    public var options: List<PxeDhcpv6Option> = List(1) { PxeDhcpv6Option() },
)

public data class PxeDhcpv6MessageHeader(
    public var messageType: UByte = 0u,
    public var message: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6MessageHeader) return false
        if (this.messageType != other.messageType) return false
        if (!this.message.contentEquals(other.message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.message.contentHashCode()
        return result
    }
}

public data class PxeDhcpv6NestedRelayMessage(
    public var pRelayMessage: PxeDhcpv6RelayMessage? = null,
    public var cbRelayMessage: UInt = 0u,
    public var pInterfaceIdOption: COpaquePointer? = null,
    public var cbInterfaceIdOption: UShort = 0u,
)

public data class PxeDhcpv6Option(
    public var optionCode: UShort = 0u,
    public var dataLength: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6Option) return false
        if (this.optionCode != other.optionCode) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionCode.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class PxeDhcpv6RelayMessage(
    public var messageType: UByte = 0u,
    public var hopCount: UByte = 0u,
    public var linkAddress: UByteArray = UByteArray(16),
    public var peerAddress: UByteArray = UByteArray(16),
    public var options: List<PxeDhcpv6Option> = List(1) { PxeDhcpv6Option() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6RelayMessage) return false
        if (this.messageType != other.messageType) return false
        if (this.hopCount != other.hopCount) return false
        if (!this.linkAddress.contentEquals(other.linkAddress)) return false
        if (!this.peerAddress.contentEquals(other.peerAddress)) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.hopCount.hashCode()
        result = 31 * result + this.linkAddress.contentHashCode()
        result = 31 * result + this.peerAddress.contentHashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }
}

public data class PxeDhcpMessage(
    public var operation: UByte = 0u,
    public var hardwareAddressType: UByte = 0u,
    public var hardwareAddressLength: UByte = 0u,
    public var hopCount: UByte = 0u,
    public var transactionID: UInt = 0u,
    public var secondsSinceBoot: UShort = 0u,
    public var reserved: UShort = 0u,
    public var clientIpAddress: UInt = 0u,
    public var yourIpAddress: UInt = 0u,
    public var bootstrapServerAddress: UInt = 0u,
    public var relayAgentIpAddress: UInt = 0u,
    public var hardwareAddress: UByteArray = UByteArray(16),
    public var hostName: UByteArray = UByteArray(64),
    public var bootFileName: UByteArray = UByteArray(128),
    public var anonymous: PxeDhcpMessage0 = PxeDhcpMessage0(),
    public var option: PxeDhcpOption = PxeDhcpOption(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpMessage) return false
        if (this.operation != other.operation) return false
        if (this.hardwareAddressType != other.hardwareAddressType) return false
        if (this.hardwareAddressLength != other.hardwareAddressLength) return false
        if (this.hopCount != other.hopCount) return false
        if (this.transactionID != other.transactionID) return false
        if (this.secondsSinceBoot != other.secondsSinceBoot) return false
        if (this.reserved != other.reserved) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.yourIpAddress != other.yourIpAddress) return false
        if (this.bootstrapServerAddress != other.bootstrapServerAddress) return false
        if (this.relayAgentIpAddress != other.relayAgentIpAddress) return false
        if (!this.hardwareAddress.contentEquals(other.hardwareAddress)) return false
        if (!this.hostName.contentEquals(other.hostName)) return false
        if (!this.bootFileName.contentEquals(other.bootFileName)) return false
        if (this.anonymous != other.anonymous) return false
        if (this.option != other.option) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.hardwareAddressType.hashCode()
        result = 31 * result + this.hardwareAddressLength.hashCode()
        result = 31 * result + this.hopCount.hashCode()
        result = 31 * result + this.transactionID.hashCode()
        result = 31 * result + this.secondsSinceBoot.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.clientIpAddress.hashCode()
        result = 31 * result + this.yourIpAddress.hashCode()
        result = 31 * result + this.bootstrapServerAddress.hashCode()
        result = 31 * result + this.relayAgentIpAddress.hashCode()
        result = 31 * result + this.hardwareAddress.contentHashCode()
        result = 31 * result + this.hostName.contentHashCode()
        result = 31 * result + this.bootFileName.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.option.hashCode()
        return result
    }
}

public data class PxeDhcpMessage0(
    public var bMagicCookie: UByteArray = UByteArray(4),
    public var uMagicCookie: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpMessage0) return false
        if (!this.bMagicCookie.contentEquals(other.bMagicCookie)) return false
        if (this.uMagicCookie != other.uMagicCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bMagicCookie.contentHashCode()
        result = 31 * result + this.uMagicCookie.hashCode()
        return result
    }
}

public data class PxeDhcpOption(
    public var optionType: UByte = 0u,
    public var optionLength: UByte = 0u,
    public var optionValue: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpOption) return false
        if (this.optionType != other.optionType) return false
        if (this.optionLength != other.optionLength) return false
        if (!this.optionValue.contentEquals(other.optionValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionType.hashCode()
        result = 31 * result + this.optionLength.hashCode()
        result = 31 * result + this.optionValue.contentHashCode()
        return result
    }
}

public data class PxeProvider(
    public var uSizeOfStruct: UInt = 0u,
    public var pwszName: Pwstr = null,
    public var pwszFilePath: Pwstr = null,
    public var bIsCritical: Bool = 0,
    public var uIndex: UInt = 0u,
)

public data class TransportclientSessionInfo(
    public var ulStructureLength: UInt = 0u,
    public var ullFileSize: ULong = 0uL,
    public var ulBlockSize: UInt = 0u,
)

public data class WdsCliCred(
    public var pwszUserName: Pcwstr = null,
    public var pwszDomain: Pcwstr = null,
    public var pwszPassword: Pcwstr = null,
)

public data class WdsTransportclientCallbacks(
    public var sessionStart: PfnWdsTransportClientSessionStart = null,
    public var sessionStartEx: PfnWdsTransportClientSessionStartEx = null,
    public var receiveContents: PfnWdsTransportClientReceiveContents = null,
    public var receiveMetadata: PfnWdsTransportClientReceiveMetadata = null,
    public var sessionComplete: PfnWdsTransportClientSessionComplete = null,
    public var sessionNegotiate: PfnWdsTransportClientSessionNegotiate = null,
)

public data class WdsTransportclientRequest(
    public var ulLength: UInt = 0u,
    public var ulApiVersion: UInt = 0u,
    public var ulAuthLevel: WdsTransportclientRequestAuthLevel = 0u,
    public var pwszServer: Pcwstr = null,
    public var pwszNamespace: Pcwstr = null,
    public var pwszObjectName: Pcwstr = null,
    public var ulCacheSize: UInt = 0u,
    public var ulProtocol: UInt = 0u,
    public var pvProtocolData: COpaquePointer? = null,
    public var ulProtocolDataLength: UInt = 0u,
)

public data class WdsTransportproviderInitParams(
    public var ulLength: UInt = 0u,
    public var ulMcServerVersion: UInt = 0u,
    public var hRegistryKey: Hkey = null,
    public var hProvider: Handle = null,
)

public data class WdsTransportproviderSettings(
    public var ulLength: UInt = 0u,
    public var ulProviderVersion: UInt = 0u,
)
