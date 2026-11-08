@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

public data class PXE_ADDRESS(
    public var uFlags: UInt = 0u,
    public var Anonymous: PXE_ADDRESS_0 = PXE_ADDRESS_0(),
    public var uAddrLen: UInt = 0u,
    public var uPort: UShort = 0u,
)

public data class PXE_ADDRESS_0(public var bAddress: UByteArray = UByteArray(16), public var uIpAddress: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_ADDRESS_0) return false
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

public data class PXE_DHCPV6_MESSAGE(
    public var MessageType: UByte = 0u,
    public var TransactionIDByte1: UByte = 0u,
    public var TransactionIDByte2: UByte = 0u,
    public var TransactionIDByte3: UByte = 0u,
    public var Options: List<PXE_DHCPV6_OPTION> = List(1) { PXE_DHCPV6_OPTION() },
)

public data class PXE_DHCPV6_MESSAGE_HEADER(public var MessageType: UByte = 0u, public var Message: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCPV6_MESSAGE_HEADER) return false
        if (this.MessageType != other.MessageType) return false
        if (!this.Message.contentEquals(other.Message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.Message.contentHashCode()
        return result
    }
}

public data class PXE_DHCPV6_NESTED_RELAY_MESSAGE(
    public var pRelayMessage: Long = 0L,
    public var cbRelayMessage: UInt = 0u,
    public var pInterfaceIdOption: Long = 0L,
    public var cbInterfaceIdOption: UShort = 0u,
)

public data class PXE_DHCPV6_OPTION(
    public var OptionCode: UShort = 0u,
    public var DataLength: UShort = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCPV6_OPTION) return false
        if (this.OptionCode != other.OptionCode) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OptionCode.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class PXE_DHCPV6_RELAY_MESSAGE(
    public var MessageType: UByte = 0u,
    public var HopCount: UByte = 0u,
    public var LinkAddress: UByteArray = UByteArray(16),
    public var PeerAddress: UByteArray = UByteArray(16),
    public var Options: List<PXE_DHCPV6_OPTION> = List(1) { PXE_DHCPV6_OPTION() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCPV6_RELAY_MESSAGE) return false
        if (this.MessageType != other.MessageType) return false
        if (this.HopCount != other.HopCount) return false
        if (!this.LinkAddress.contentEquals(other.LinkAddress)) return false
        if (!this.PeerAddress.contentEquals(other.PeerAddress)) return false
        if (this.Options != other.Options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.HopCount.hashCode()
        result = 31 * result + this.LinkAddress.contentHashCode()
        result = 31 * result + this.PeerAddress.contentHashCode()
        result = 31 * result + this.Options.hashCode()
        return result
    }
}

public data class PXE_DHCP_MESSAGE(
    public var Operation: UByte = 0u,
    public var HardwareAddressType: UByte = 0u,
    public var HardwareAddressLength: UByte = 0u,
    public var HopCount: UByte = 0u,
    public var TransactionID: UInt = 0u,
    public var SecondsSinceBoot: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var ClientIpAddress: UInt = 0u,
    public var YourIpAddress: UInt = 0u,
    public var BootstrapServerAddress: UInt = 0u,
    public var RelayAgentIpAddress: UInt = 0u,
    public var HardwareAddress: UByteArray = UByteArray(16),
    public var HostName: UByteArray = UByteArray(64),
    public var BootFileName: UByteArray = UByteArray(128),
    public var Anonymous: PXE_DHCP_MESSAGE_0 = PXE_DHCP_MESSAGE_0(),
    public var Option: PXE_DHCP_OPTION = PXE_DHCP_OPTION(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCP_MESSAGE) return false
        if (this.Operation != other.Operation) return false
        if (this.HardwareAddressType != other.HardwareAddressType) return false
        if (this.HardwareAddressLength != other.HardwareAddressLength) return false
        if (this.HopCount != other.HopCount) return false
        if (this.TransactionID != other.TransactionID) return false
        if (this.SecondsSinceBoot != other.SecondsSinceBoot) return false
        if (this.Reserved != other.Reserved) return false
        if (this.ClientIpAddress != other.ClientIpAddress) return false
        if (this.YourIpAddress != other.YourIpAddress) return false
        if (this.BootstrapServerAddress != other.BootstrapServerAddress) return false
        if (this.RelayAgentIpAddress != other.RelayAgentIpAddress) return false
        if (!this.HardwareAddress.contentEquals(other.HardwareAddress)) return false
        if (!this.HostName.contentEquals(other.HostName)) return false
        if (!this.BootFileName.contentEquals(other.BootFileName)) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.Option != other.Option) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Operation.hashCode()
        result = 31 * result + this.HardwareAddressType.hashCode()
        result = 31 * result + this.HardwareAddressLength.hashCode()
        result = 31 * result + this.HopCount.hashCode()
        result = 31 * result + this.TransactionID.hashCode()
        result = 31 * result + this.SecondsSinceBoot.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.ClientIpAddress.hashCode()
        result = 31 * result + this.YourIpAddress.hashCode()
        result = 31 * result + this.BootstrapServerAddress.hashCode()
        result = 31 * result + this.RelayAgentIpAddress.hashCode()
        result = 31 * result + this.HardwareAddress.contentHashCode()
        result = 31 * result + this.HostName.contentHashCode()
        result = 31 * result + this.BootFileName.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Option.hashCode()
        return result
    }
}

public data class PXE_DHCP_MESSAGE_0(public var bMagicCookie: UByteArray = UByteArray(4), public var uMagicCookie: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCP_MESSAGE_0) return false
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

public data class PXE_DHCP_OPTION(
    public var OptionType: UByte = 0u,
    public var OptionLength: UByte = 0u,
    public var OptionValue: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PXE_DHCP_OPTION) return false
        if (this.OptionType != other.OptionType) return false
        if (this.OptionLength != other.OptionLength) return false
        if (!this.OptionValue.contentEquals(other.OptionValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OptionType.hashCode()
        result = 31 * result + this.OptionLength.hashCode()
        result = 31 * result + this.OptionValue.contentHashCode()
        return result
    }
}

public data class PXE_PROVIDER(
    public var uSizeOfStruct: UInt = 0u,
    public var pwszName: PWSTR = 0L,
    public var pwszFilePath: PWSTR = 0L,
    public var bIsCritical: BOOL = 0,
    public var uIndex: UInt = 0u,
)

public data class TRANSPORTCLIENT_SESSION_INFO(
    public var ulStructureLength: UInt = 0u,
    public var ullFileSize: ULong = 0uL,
    public var ulBlockSize: UInt = 0u,
)

public data class WDS_CLI_CRED(
    public var pwszUserName: PCWSTR = 0L,
    public var pwszDomain: PCWSTR = 0L,
    public var pwszPassword: PCWSTR = 0L,
)

public data class WDS_TRANSPORTCLIENT_CALLBACKS(
    public var SessionStart: PFN_WdsTransportClientSessionStart = null,
    public var SessionStartEx: PFN_WdsTransportClientSessionStartEx = null,
    public var ReceiveContents: PFN_WdsTransportClientReceiveContents = null,
    public var ReceiveMetadata: PFN_WdsTransportClientReceiveMetadata = null,
    public var SessionComplete: PFN_WdsTransportClientSessionComplete = null,
    public var SessionNegotiate: PFN_WdsTransportClientSessionNegotiate = null,
)

public data class WDS_TRANSPORTCLIENT_REQUEST(
    public var ulLength: UInt = 0u,
    public var ulApiVersion: UInt = 0u,
    public var ulAuthLevel: WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL = 0u,
    public var pwszServer: PCWSTR = 0L,
    public var pwszNamespace: PCWSTR = 0L,
    public var pwszObjectName: PCWSTR = 0L,
    public var ulCacheSize: UInt = 0u,
    public var ulProtocol: UInt = 0u,
    public var pvProtocolData: Long = 0L,
    public var ulProtocolDataLength: UInt = 0u,
)

public data class WDS_TRANSPORTPROVIDER_INIT_PARAMS(
    public var ulLength: UInt = 0u,
    public var ulMcServerVersion: UInt = 0u,
    public var hRegistryKey: HKEY = 0L,
    public var hProvider: HANDLE = 0L,
)

public data class WDS_TRANSPORTPROVIDER_SETTINGS(public var ulLength: UInt = 0u, public var ulProviderVersion: UInt = 0u)
