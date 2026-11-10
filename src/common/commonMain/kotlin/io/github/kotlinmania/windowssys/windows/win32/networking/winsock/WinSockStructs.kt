@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.CompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber

public data class Aal5Parameters(
    public var forwardMaxCPCSSDUSize: UInt = 0u,
    public var backwardMaxCPCSSDUSize: UInt = 0u,
    public var mode: UByte = 0u,
    public var sSCSType: UByte = 0u,
)

public data class AaluserParameters(
    public var userDefined: UInt = 0u,
)

public data class AalParametersIe(
    public var aALType: AalType = 0,
    public var aALSpecificParameters: AalParametersIe0 = AalParametersIe0(),
)

public data class AalParametersIe0(
    public var aAL5Parameters: Aal5Parameters = Aal5Parameters(),
    public var aALUserParameters: AaluserParameters = AaluserParameters(),
)

public data class Addrinfoa(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfoa? = null,
)

public data class Addrinfoex2a(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex2a? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pstr = null,
)

public data class Addrinfoex2w(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex2w? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pwstr = null,
)

public data class Addrinfoex3(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex3? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pwstr = null,
    public var aiInterfaceindex: Int = 0,
)

public data class Addrinfoex4(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex4? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pwstr = null,
    public var aiInterfaceindex: Int = 0,
    public var aiResolutionhandle: Handle = null,
)

public data class Addrinfoex5(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex5? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pwstr = null,
    public var aiInterfaceindex: Int = 0,
    public var aiResolutionhandle: Handle = null,
    public var aiTtl: UInt = 0u,
)

public class Addrinfoex6(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoex5? = null,
    public var aiVersion: Int = 0,
    public var aiFqdn: Pwstr = null,
    public var aiInterfaceindex: Int = 0,
    public var aiResolutionhandle: Handle = null,
    public var aiTtl: UInt = 0u,
    public var aiNumservers: UInt = 0u,
    public var aiServers: AddrinfoDnsServer? = null,
    public var aiResponseflags: ULong = 0uL,
)

public data class Addrinfoexa(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoexa? = null,
)

public data class Addrinfoexw(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiBlob: COpaquePointer? = null,
    public var aiBloblen: Int = 0,
    public var aiProvider: Guid? = null,
    public var aiNext: Addrinfoexw? = null,
)

public data class Addrinfow(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: Int = 0,
    public var aiCanonname: Pwstr = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfow? = null,
)

public data class AddrinfoDnsServer(
    public var aiServertype: UInt = 0u,
    public var aiFlags: ULong = 0uL,
    public var aiAddrlen: UInt = 0u,
    public var aiAddr: Sockaddr? = null,
    public var anonymous: AddrinfoDnsServer0 = AddrinfoDnsServer0(),
)

public data class AddrinfoDnsServer0(
    public var aiTemplate: Pwstr = null,
)

public data class Afprotocols(
    public var iAddressFamily: Int = 0,
    public var iProtocol: Int = 0,
)

public data class ArpHeader(
    public var hardwareAddressSpace: UShort = 0u,
    public var protocolAddressSpace: UShort = 0u,
    public var hardwareAddressLength: UByte = 0u,
    public var protocolAddressLength: UByte = 0u,
    public var opcode: UShort = 0u,
    public var senderHardwareAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArpHeader) return false
        if (this.hardwareAddressSpace != other.hardwareAddressSpace) return false
        if (this.protocolAddressSpace != other.protocolAddressSpace) return false
        if (this.hardwareAddressLength != other.hardwareAddressLength) return false
        if (this.protocolAddressLength != other.protocolAddressLength) return false
        if (this.opcode != other.opcode) return false
        if (!this.senderHardwareAddress.contentEquals(other.senderHardwareAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hardwareAddressSpace.hashCode()
        result = 31 * result + this.protocolAddressSpace.hashCode()
        result = 31 * result + this.hardwareAddressLength.hashCode()
        result = 31 * result + this.protocolAddressLength.hashCode()
        result = 31 * result + this.opcode.hashCode()
        result = 31 * result + this.senderHardwareAddress.contentHashCode()
        return result
    }
}

public data class AssociateNameresContextInput(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var handle: ULong = 0uL,
)

public data class AtmAddress(
    public var addressType: UInt = 0u,
    public var numofDigits: UInt = 0u,
    public var addr: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmAddress) return false
        if (this.addressType != other.addressType) return false
        if (this.numofDigits != other.numofDigits) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.numofDigits.hashCode()
        result = 31 * result + this.addr.contentHashCode()
        return result
    }
}

public data class AtmBhli(
    public var highLayerInfoType: UInt = 0u,
    public var highLayerInfoLength: UInt = 0u,
    public var highLayerInfo: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBhli) return false
        if (this.highLayerInfoType != other.highLayerInfoType) return false
        if (this.highLayerInfoLength != other.highLayerInfoLength) return false
        if (!this.highLayerInfo.contentEquals(other.highLayerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.highLayerInfoType.hashCode()
        result = 31 * result + this.highLayerInfoLength.hashCode()
        result = 31 * result + this.highLayerInfo.contentHashCode()
        return result
    }
}

public data class AtmBlli(
    public var layer2Protocol: UInt = 0u,
    public var layer2UserSpecifiedProtocol: UInt = 0u,
    public var layer3Protocol: UInt = 0u,
    public var layer3UserSpecifiedProtocol: UInt = 0u,
    public var layer3IPI: UInt = 0u,
    public var snapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBlli) return false
        if (this.layer2Protocol != other.layer2Protocol) return false
        if (this.layer2UserSpecifiedProtocol != other.layer2UserSpecifiedProtocol) return false
        if (this.layer3Protocol != other.layer3Protocol) return false
        if (this.layer3UserSpecifiedProtocol != other.layer3UserSpecifiedProtocol) return false
        if (this.layer3IPI != other.layer3IPI) return false
        if (!this.snapID.contentEquals(other.snapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layer2Protocol.hashCode()
        result = 31 * result + this.layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3Protocol.hashCode()
        result = 31 * result + this.layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3IPI.hashCode()
        result = 31 * result + this.snapID.contentHashCode()
        return result
    }
}

public data class AtmBlliIe(
    public var layer2Protocol: UInt = 0u,
    public var layer2Mode: UByte = 0u,
    public var layer2WindowSize: UByte = 0u,
    public var layer2UserSpecifiedProtocol: UInt = 0u,
    public var layer3Protocol: UInt = 0u,
    public var layer3Mode: UByte = 0u,
    public var layer3DefaultPacketSize: UByte = 0u,
    public var layer3PacketWindowSize: UByte = 0u,
    public var layer3UserSpecifiedProtocol: UInt = 0u,
    public var layer3IPI: UInt = 0u,
    public var snapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBlliIe) return false
        if (this.layer2Protocol != other.layer2Protocol) return false
        if (this.layer2Mode != other.layer2Mode) return false
        if (this.layer2WindowSize != other.layer2WindowSize) return false
        if (this.layer2UserSpecifiedProtocol != other.layer2UserSpecifiedProtocol) return false
        if (this.layer3Protocol != other.layer3Protocol) return false
        if (this.layer3Mode != other.layer3Mode) return false
        if (this.layer3DefaultPacketSize != other.layer3DefaultPacketSize) return false
        if (this.layer3PacketWindowSize != other.layer3PacketWindowSize) return false
        if (this.layer3UserSpecifiedProtocol != other.layer3UserSpecifiedProtocol) return false
        if (this.layer3IPI != other.layer3IPI) return false
        if (!this.snapID.contentEquals(other.snapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layer2Protocol.hashCode()
        result = 31 * result + this.layer2Mode.hashCode()
        result = 31 * result + this.layer2WindowSize.hashCode()
        result = 31 * result + this.layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3Protocol.hashCode()
        result = 31 * result + this.layer3Mode.hashCode()
        result = 31 * result + this.layer3DefaultPacketSize.hashCode()
        result = 31 * result + this.layer3PacketWindowSize.hashCode()
        result = 31 * result + this.layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3IPI.hashCode()
        result = 31 * result + this.snapID.contentHashCode()
        return result
    }
}

public data class AtmBroadbandBearerCapabilityIe(
    public var bearerClass: UByte = 0u,
    public var trafficType: UByte = 0u,
    public var timingRequirements: UByte = 0u,
    public var clippingSusceptability: UByte = 0u,
    public var userPlaneConnectionConfig: UByte = 0u,
)

public data class AtmCallingPartyNumberIe(
    public var atmNumber: AtmAddress = AtmAddress(),
    public var presentationIndication: UByte = 0u,
    public var screeningIndicator: UByte = 0u,
)

public data class AtmCauseIe(
    public var location: UByte = 0u,
    public var cause: UByte = 0u,
    public var diagnosticsLength: UByte = 0u,
    public var diagnostics: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmCauseIe) return false
        if (this.location != other.location) return false
        if (this.cause != other.cause) return false
        if (this.diagnosticsLength != other.diagnosticsLength) return false
        if (!this.diagnostics.contentEquals(other.diagnostics)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.location.hashCode()
        result = 31 * result + this.cause.hashCode()
        result = 31 * result + this.diagnosticsLength.hashCode()
        result = 31 * result + this.diagnostics.contentHashCode()
        return result
    }
}

public data class AtmConnectionId(
    public var deviceNumber: UInt = 0u,
    public var vpi: UInt = 0u,
    public var vci: UInt = 0u,
)

public data class AtmPvcParams(
    public var pvcConnectionId: AtmConnectionId = AtmConnectionId(),
    public var pvcQos: Qos = Qos(),
)

public data class AtmQosClassIe(
    public var qOSClassForward: UByte = 0u,
    public var qOSClassBackward: UByte = 0u,
)

public data class AtmTd(
    public var peakCellRateClp0: UInt = 0u,
    public var peakCellRateClp01: UInt = 0u,
    public var sustainableCellRateClp0: UInt = 0u,
    public var sustainableCellRateClp01: UInt = 0u,
    public var maxBurstSizeClp0: UInt = 0u,
    public var maxBurstSizeClp01: UInt = 0u,
    public var tagging: Bool = 0,
)

public data class AtmTrafficDescriptorIe(
    public var forward: AtmTd = AtmTd(),
    public var backward: AtmTd = AtmTd(),
    public var bestEffort: Bool = 0,
)

public data class AtmTransitNetworkSelectionIe(
    public var typeOfNetworkId: UByte = 0u,
    public var networkIdPlan: UByte = 0u,
    public var networkIdLength: UByte = 0u,
    public var networkId: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmTransitNetworkSelectionIe) return false
        if (this.typeOfNetworkId != other.typeOfNetworkId) return false
        if (this.networkIdPlan != other.networkIdPlan) return false
        if (this.networkIdLength != other.networkIdLength) return false
        if (!this.networkId.contentEquals(other.networkId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.typeOfNetworkId.hashCode()
        result = 31 * result + this.networkIdPlan.hashCode()
        result = 31 * result + this.networkIdLength.hashCode()
        result = 31 * result + this.networkId.contentHashCode()
        return result
    }
}

public data class Cmsghdr(
    public var cmsgLen: Int = 0,
    public var cmsgLevel: Int = 0,
    public var cmsgType: Int = 0,
)

public data class CsaddrInfo(
    public var localAddr: SocketAddress = SocketAddress(),
    public var remoteAddr: SocketAddress = SocketAddress(),
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
)

public data class DlEi48(
    public var byte: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEi48) return false
        if (!this.byte.contentEquals(other.byte)) return false
        return true
    }

    override fun hashCode(): Int = this.byte.contentHashCode()
}

public data class DlEi64(
    public var byte: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEi64) return false
        if (!this.byte.contentEquals(other.byte)) return false
        return true
    }

    override fun hashCode(): Int = this.byte.contentHashCode()
}

public data class DlEui48(
    public var byte: UByteArray = UByteArray(6),
    public var anonymous: DlEui480 = DlEui480(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEui48) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlEui480(
    public var oui: DlOui = DlOui(),
    public var ei48: DlEi48 = DlEi48(),
)

public data class DlEui64(
    public var byte: UByteArray = UByteArray(8),
    public var value: ULong = 0uL,
    public var anonymous: DlEui640 = DlEui640(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEui64) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.value != other.value) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlEui640(
    public var oui: DlOui = DlOui(),
    public var anonymous: DlEui6400 = DlEui6400(),
)

public data class DlEui6400(
    public var ei64: DlEi64 = DlEi64(),
    public var anonymous: DlEui64000 = DlEui64000(),
)

public data class DlEui64000(
    public var type: UByte = 0u,
    public var tse: UByte = 0u,
    public var ei48: DlEi48 = DlEi48(),
)

public data class DlOui(
    public var byte: UByteArray = UByteArray(3),
    public var anonymous: DlOui0 = DlOui0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlOui) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlOui0(
    public var bitfield: UByte = 0u,
)

public data class DlTeredoAddress(
    public var reserved: UByteArray = UByteArray(6),
    public var anonymous: DlTeredoAddress0 = DlTeredoAddress0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTeredoAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlTeredoAddress0(
    public var eui64: DlEui64 = DlEui64(),
    public var anonymous: DlTeredoAddress00 = DlTeredoAddress00(),
)

public data class DlTeredoAddress00(
    public var flags: UShort = 0u,
    public var mappedPort: UShort = 0u,
    public var mappedAddress: InAddr = InAddr(),
)

public data class DlTeredoAddressPrv(
    public var reserved: UByteArray = UByteArray(6),
    public var anonymous: DlTeredoAddressPrv0 = DlTeredoAddressPrv0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTeredoAddressPrv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlTeredoAddressPrv0(
    public var eui64: DlEui64 = DlEui64(),
    public var anonymous: DlTeredoAddressPrv00 = DlTeredoAddressPrv00(),
)

public data class DlTeredoAddressPrv00(
    public var flags: UShort = 0u,
    public var mappedPort: UShort = 0u,
    public var mappedAddress: InAddr = InAddr(),
    public var localAddress: InAddr = InAddr(),
    public var interfaceIndex: UInt = 0u,
    public var localPort: UShort = 0u,
    public var dlDestination: DlEui48 = DlEui48(),
)

public data class DlTunnelAddress(
    public var compartmentId: CompartmentId = 0,
    public var scopeId: ScopeId = ScopeId(),
    public var ipAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTunnelAddress) return false
        if (this.compartmentId != other.compartmentId) return false
        if (this.scopeId != other.scopeId) return false
        if (!this.ipAddress.contentEquals(other.ipAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compartmentId.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.ipAddress.contentHashCode()
        return result
    }
}

public data class EthernetHeader(
    public var destination: DlEui48 = DlEui48(),
    public var source: DlEui48 = DlEui48(),
    public var anonymous: EthernetHeader0 = EthernetHeader0(),
)

public data class EthernetHeader0(
    public var type: UShort = 0u,
    public var length: UShort = 0u,
)

public data class FdSet(
    public var fdCount: UInt = 0u,
    public var fdArray: ULongArray = ULongArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (this.fdCount != other.fdCount) return false
        if (!this.fdArray.contentEquals(other.fdArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fdCount.hashCode()
        result = 31 * result + this.fdArray.contentHashCode()
        return result
    }
}

public data class Flowspec(
    public var tokenRate: UInt = 0u,
    public var tokenBucketSize: UInt = 0u,
    public var peakBandwidth: UInt = 0u,
    public var latency: UInt = 0u,
    public var delayVariation: UInt = 0u,
    public var serviceType: UInt = 0u,
    public var maxSduSize: UInt = 0u,
    public var minimumPolicedSize: UInt = 0u,
)

public data class GroupFilter(
    public var gfInterface: UInt = 0u,
    public var gfGroup: SockaddrStorage = SockaddrStorage(),
    public var gfFmode: MulticastModeType = 0,
    public var gfNumsrc: UInt = 0u,
    public var gfSlist: List<SockaddrStorage> = List(1) { SockaddrStorage() },
)

public data class GroupReq(
    public var grInterface: UInt = 0u,
    public var grGroup: SockaddrStorage = SockaddrStorage(),
)

public data class GroupSourceReq(
    public var gsrInterface: UInt = 0u,
    public var gsrGroup: SockaddrStorage = SockaddrStorage(),
    public var gsrSource: SockaddrStorage = SockaddrStorage(),
)

public data class Hostent(
    public var hName: Pstr = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: Short = 0,
    public var hLength: Short = 0,
    public var hAddrList: COpaquePointer? = null,
)

public data class Icmpv4AddressMaskMessage(
    public var header: IcmpMessage = IcmpMessage(),
    public var addressMask: UInt = 0u,
)

public data class Icmpv4RouterAdvertEntry(
    public var routerAdvertAddr: InAddr = InAddr(),
    public var preferenceLevel: Int = 0,
)

public data class Icmpv4RouterAdvertHeader(
    public var raHeader: IcmpMessage = IcmpMessage(),
)

public data class Icmpv4RouterSolicit(
    public var rsHeader: IcmpMessage = IcmpMessage(),
)

public data class Icmpv4TimestampMessage(
    public var header: IcmpMessage = IcmpMessage(),
    public var originateTimestamp: UInt = 0u,
    public var receiveTimestamp: UInt = 0u,
    public var transmitTimestamp: UInt = 0u,
)

public data class IcmpErrorInfo(
    public var srcaddress: SockaddrInet = SockaddrInet(),
    public var protocol: Ipproto = 0,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
)

public data class IcmpHeader(
    public var type: UByte = 0u,
    public var code: UByte = 0u,
    public var checksum: UShort = 0u,
)

public data class IcmpMessage(
    public var header: IcmpHeader = IcmpHeader(),
    public var data: IcmpMessage0 = IcmpMessage0(),
)

public data class IcmpMessage0(
    public var data32: UIntArray = UIntArray(1),
    public var data16: UShortArray = UShortArray(2),
    public var data8: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IcmpMessage0) return false
        if (!this.data32.contentEquals(other.data32)) return false
        if (!this.data16.contentEquals(other.data16)) return false
        if (!this.data8.contentEquals(other.data8)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data32.contentHashCode()
        result = 31 * result + this.data16.contentHashCode()
        result = 31 * result + this.data8.contentHashCode()
        return result
    }
}

public data class Igmpv3QueryHeader(
    public var type: UByte = 0u,
    public var anonymous1: Igmpv3QueryHeader0 = Igmpv3QueryHeader0(),
    public var checksum: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
    public var bitfield: UByte = 0u,
    public var anonymous2: Igmpv3QueryHeader1 = Igmpv3QueryHeader1(),
    public var sourceCount: UShort = 0u,
)

public data class Igmpv3QueryHeader0(
    public var maxRespCode: UByte = 0u,
    public var anonymous: Igmpv3QueryHeader00 = Igmpv3QueryHeader00(),
)

public data class Igmpv3QueryHeader00(
    public var bitfield: UByte = 0u,
)

public data class Igmpv3QueryHeader1(
    public var queriersQueryInterfaceCode: UByte = 0u,
    public var anonymous: Igmpv3QueryHeader10 = Igmpv3QueryHeader10(),
)

public data class Igmpv3QueryHeader10(
    public var bitfield: UByte = 0u,
)

public data class Igmpv3ReportHeader(
    public var type: UByte = 0u,
    public var reserved: UByte = 0u,
    public var checksum: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var recordCount: UShort = 0u,
)

public data class Igmpv3ReportRecordHeader(
    public var type: UByte = 0u,
    public var auxillaryDataLength: UByte = 0u,
    public var sourceCount: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
)

public data class IgmpHeader(
    public var anonymous1: IgmpHeader0 = IgmpHeader0(),
    public var anonymous2: IgmpHeader1 = IgmpHeader1(),
    public var checksum: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
)

public data class IgmpHeader0(
    public var anonymous: IgmpHeader00 = IgmpHeader00(),
    public var versionType: UByte = 0u,
)

public data class IgmpHeader00(
    public var bitfield: UByte = 0u,
)

public data class IgmpHeader1(
    public var reserved: UByte = 0u,
    public var maxRespTime: UByte = 0u,
    public var code: UByte = 0u,
)

public data class In6Addr(
    public var u: In6Addr0 = In6Addr0(),
)

public data class In6Addr0(
    public var byte: UByteArray = UByteArray(16),
    public var word: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr0) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (!this.word.contentEquals(other.word)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.word.contentHashCode()
        return result
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: UInt = 0u,
)

public data class In6PktinfoEx(
    public var pktInfo: In6Pktinfo = In6Pktinfo(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class InetPortRange(
    public var startPort: UShort = 0u,
    public var numberOfPorts: UShort = 0u,
)

public data class InetPortReservationInformation(
    public var owningPid: UInt = 0u,
)

public data class InetPortReservationInstance(
    public var reservation: InetPortRange = InetPortRange(),
    public var token: InetPortReservationToken = InetPortReservationToken(),
)

public data class InetPortReservationToken(
    public var token: ULong = 0uL,
)

public data class InterfaceInfo(
    public var iiFlags: UInt = 0u,
    public var iiAddress: SockaddrGen = SockaddrGen(),
    public var iiBroadcastAddress: SockaddrGen = SockaddrGen(),
    public var iiNetmask: SockaddrGen = SockaddrGen(),
)

public data class InterfaceInfoEx(
    public var iiFlags: UInt = 0u,
    public var iiAddress: SocketAddress = SocketAddress(),
    public var iiBroadcastAddress: SocketAddress = SocketAddress(),
    public var iiNetmask: SocketAddress = SocketAddress(),
)

public data class InAddr(
    public var sUn: InAddr0 = InAddr0(),
)

public data class InAddr0(
    public var sUnB: InAddr00 = InAddr00(),
    public var sUnW: InAddr01 = InAddr01(),
    public var sAddr: UInt = 0u,
)

public data class InAddr00(
    public var sB1: UByte = 0u,
    public var sB2: UByte = 0u,
    public var sB3: UByte = 0u,
    public var sB4: UByte = 0u,
)

public data class InAddr01(
    public var sW1: UShort = 0u,
    public var sW2: UShort = 0u,
)

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: UInt = 0u,
)

public data class InPktinfoEx(
    public var pktInfo: InPktinfo = InPktinfo(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class InRecverr(
    public var protocol: Ipproto = 0,
    public var info: UInt = 0u,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
)

public data class IptlsMetadata(
    public var sequenceNumber: ULong = 0uL,
)

public data class Ipv4Header(
    public var anonymous1: Ipv4Header0 = Ipv4Header0(),
    public var anonymous2: Ipv4Header1 = Ipv4Header1(),
    public var totalLength: UShort = 0u,
    public var identification: UShort = 0u,
    public var anonymous3: Ipv4Header2 = Ipv4Header2(),
    public var timeToLive: UByte = 0u,
    public var protocol: UByte = 0u,
    public var headerChecksum: UShort = 0u,
    public var sourceAddress: InAddr = InAddr(),
    public var destinationAddress: InAddr = InAddr(),
)

public data class Ipv4Header0(
    public var versionAndHeaderLength: UByte = 0u,
    public var anonymous: Ipv4Header00 = Ipv4Header00(),
)

public data class Ipv4Header00(
    public var bitfield: UByte = 0u,
)

public data class Ipv4Header1(
    public var typeOfServiceAndEcnField: UByte = 0u,
    public var anonymous: Ipv4Header10 = Ipv4Header10(),
)

public data class Ipv4Header10(
    public var bitfield: UByte = 0u,
)

public data class Ipv4Header2(
    public var flagsAndOffset: UShort = 0u,
    public var anonymous: Ipv4Header20 = Ipv4Header20(),
)

public data class Ipv4Header20(
    public var bitfield: UShort = 0u,
)

public data class Ipv4OptionHeader(
    public var anonymous: Ipv4OptionHeader0 = Ipv4OptionHeader0(),
    public var optionLength: UByte = 0u,
)

public data class Ipv4OptionHeader0(
    public var optionType: UByte = 0u,
    public var anonymous: Ipv4OptionHeader00 = Ipv4OptionHeader00(),
)

public data class Ipv4OptionHeader00(
    public var bitfield: UByte = 0u,
)

public data class Ipv4RoutingHeader(
    public var optionHeader: Ipv4OptionHeader = Ipv4OptionHeader(),
    public var pointer: UByte = 0u,
)

public data class Ipv4TimestampOption(
    public var optionHeader: Ipv4OptionHeader = Ipv4OptionHeader(),
    public var pointer: UByte = 0u,
    public var anonymous: Ipv4TimestampOption0 = Ipv4TimestampOption0(),
)

public data class Ipv4TimestampOption0(
    public var flagsOverflow: UByte = 0u,
    public var anonymous: Ipv4TimestampOption00 = Ipv4TimestampOption00(),
)

public data class Ipv4TimestampOption00(
    public var bitfield: UByte = 0u,
)

public data class Ipv6ExtensionHeader(
    public var nextHeader: UByte = 0u,
    public var length: UByte = 0u,
)

public data class Ipv6FragmentHeader(
    public var nextHeader: UByte = 0u,
    public var reserved: UByte = 0u,
    public var anonymous: Ipv6FragmentHeader0 = Ipv6FragmentHeader0(),
    public var id: UInt = 0u,
)

public data class Ipv6FragmentHeader0(
    public var anonymous: Ipv6FragmentHeader00 = Ipv6FragmentHeader00(),
    public var offsetAndFlags: UShort = 0u,
)

public data class Ipv6FragmentHeader00(
    public var bitfield: UShort = 0u,
)

public data class Ipv6Header(
    public var anonymous: Ipv6Header0 = Ipv6Header0(),
    public var payloadLength: UShort = 0u,
    public var nextHeader: UByte = 0u,
    public var hopLimit: UByte = 0u,
    public var sourceAddress: In6Addr = In6Addr(),
    public var destinationAddress: In6Addr = In6Addr(),
)

public data class Ipv6Header0(
    public var versionClassFlow: UInt = 0u,
    public var anonymous: Ipv6Header00 = Ipv6Header00(),
)

public data class Ipv6Header00(
    public var bitfield: UInt = 0u,
)

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: UInt = 0u,
)

public data class Ipv6NeighborAdvertisementFlags(
    public var anonymous: Ipv6NeighborAdvertisementFlags0 = Ipv6NeighborAdvertisementFlags0(),
    public var value: UInt = 0u,
)

public data class Ipv6NeighborAdvertisementFlags0(
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6NeighborAdvertisementFlags0) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class Ipv6OptionHeader(
    public var type: UByte = 0u,
    public var dataLength: UByte = 0u,
)

public data class Ipv6OptionJumbogram(
    public var header: Ipv6OptionHeader = Ipv6OptionHeader(),
    public var jumbogramLength: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6OptionJumbogram) return false
        if (this.header != other.header) return false
        if (!this.jumbogramLength.contentEquals(other.jumbogramLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.jumbogramLength.contentHashCode()
        return result
    }
}

public data class Ipv6OptionRouterAlert(
    public var header: Ipv6OptionHeader = Ipv6OptionHeader(),
    public var value: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6OptionRouterAlert) return false
        if (this.header != other.header) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class Ipv6RouterAdvertisementFlags(
    public var anonymous: Ipv6RouterAdvertisementFlags0 = Ipv6RouterAdvertisementFlags0(),
    public var value: UByte = 0u,
)

public data class Ipv6RouterAdvertisementFlags0(
    public var bitfield: UByte = 0u,
)

public data class Ipv6RoutingHeader(
    public var nextHeader: UByte = 0u,
    public var length: UByte = 0u,
    public var routingType: UByte = 0u,
    public var segmentsLeft: UByte = 0u,
    public var reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6RoutingHeader) return false
        if (this.nextHeader != other.nextHeader) return false
        if (this.length != other.length) return false
        if (this.routingType != other.routingType) return false
        if (this.segmentsLeft != other.segmentsLeft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextHeader.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.routingType.hashCode()
        result = 31 * result + this.segmentsLeft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class IpxAddressData(
    public var adapternum: Int = 0,
    public var netnum: UByteArray = UByteArray(4),
    public var nodenum: UByteArray = UByteArray(6),
    public var wan: Boolean = false,
    public var status: Boolean = false,
    public var maxpkt: Int = 0,
    public var linkspeed: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpxAddressData) return false
        if (this.adapternum != other.adapternum) return false
        if (!this.netnum.contentEquals(other.netnum)) return false
        if (!this.nodenum.contentEquals(other.nodenum)) return false
        if (this.wan != other.wan) return false
        if (this.status != other.status) return false
        if (this.maxpkt != other.maxpkt) return false
        if (this.linkspeed != other.linkspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapternum.hashCode()
        result = 31 * result + this.netnum.contentHashCode()
        result = 31 * result + this.nodenum.contentHashCode()
        result = 31 * result + this.wan.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.maxpkt.hashCode()
        result = 31 * result + this.linkspeed.hashCode()
        return result
    }
}

public data class IpxNetnumData(
    public var netnum: UByteArray = UByteArray(4),
    public var hopcount: UShort = 0u,
    public var netdelay: UShort = 0u,
    public var cardnum: Int = 0,
    public var router: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpxNetnumData) return false
        if (!this.netnum.contentEquals(other.netnum)) return false
        if (this.hopcount != other.hopcount) return false
        if (this.netdelay != other.netdelay) return false
        if (this.cardnum != other.cardnum) return false
        if (!this.router.contentEquals(other.router)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netnum.contentHashCode()
        result = 31 * result + this.hopcount.hashCode()
        result = 31 * result + this.netdelay.hashCode()
        result = 31 * result + this.cardnum.hashCode()
        result = 31 * result + this.router.contentHashCode()
        return result
    }
}

public class IpxSpxconnstatusData(
    public var connectionState: UByte = 0u,
    public var watchDogActive: UByte = 0u,
    public var localConnectionId: UShort = 0u,
    public var remoteConnectionId: UShort = 0u,
    public var localSequenceNumber: UShort = 0u,
    public var localAckNumber: UShort = 0u,
    public var localAllocNumber: UShort = 0u,
    public var remoteAckNumber: UShort = 0u,
    public var remoteAllocNumber: UShort = 0u,
    public var localSocket: UShort = 0u,
    public var immediateAddress: UByteArray = UByteArray(6),
    public var remoteNetwork: UByteArray = UByteArray(4),
    public var remoteNode: UByteArray = UByteArray(6),
    public var remoteSocket: UShort = 0u,
    public var retransmissionCount: UShort = 0u,
    public var estimatedRoundTripDelay: UShort = 0u,
    public var retransmittedPackets: UShort = 0u,
    public var suppressedPacket: UShort = 0u,
)

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpMsfilter(
    public var imsfMultiaddr: InAddr = InAddr(),
    public var imsfInterface: InAddr = InAddr(),
    public var imsfFmode: MulticastModeType = 0,
    public var imsfNumsrc: UInt = 0u,
    public var imsfSlist: List<InAddr> = List(1) { InAddr() },
)

public data class Linger(
    public var lOnoff: UShort = 0u,
    public var lLinger: UShort = 0u,
)

public data class LmIrparms(
    public var nTXDataBytes: UInt = 0u,
    public var nRXDataBytes: UInt = 0u,
    public var nBaudRate: UInt = 0u,
    public var thresholdTime: UInt = 0u,
    public var discTime: UInt = 0u,
    public var nMSLinkTurn: UShort = 0u,
    public var nTXPackets: UByte = 0u,
    public var nRXPackets: UByte = 0u,
)

public data class Mldv2QueryHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var anonymous1: Mldv2QueryHeader0 = Mldv2QueryHeader0(),
    public var reserved: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
    public var bitfield: UByte = 0u,
    public var anonymous2: Mldv2QueryHeader1 = Mldv2QueryHeader1(),
    public var sourceCount: UShort = 0u,
)

public data class Mldv2QueryHeader0(
    public var maxRespCode: UShort = 0u,
    public var anonymous: Mldv2QueryHeader00 = Mldv2QueryHeader00(),
)

public data class Mldv2QueryHeader00(
    public var bitfield: UShort = 0u,
)

public data class Mldv2QueryHeader1(
    public var queriersQueryInterfaceCode: UByte = 0u,
    public var anonymous: Mldv2QueryHeader10 = Mldv2QueryHeader10(),
)

public data class Mldv2QueryHeader10(
    public var bitfield: UByte = 0u,
)

public data class Mldv2ReportHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var reserved: UShort = 0u,
    public var recordCount: UShort = 0u,
)

public data class Mldv2ReportRecordHeader(
    public var type: UByte = 0u,
    public var auxillaryDataLength: UByte = 0u,
    public var sourceCount: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
)

public data class MldHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var maxRespTime: UShort = 0u,
    public var reserved: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
)

public data class NapiDomainDescriptionBlob(
    public var authLevel: UInt = 0u,
    public var cchDomainName: UInt = 0u,
    public var offsetNextDomainDescription: UInt = 0u,
    public var offsetThisDomainName: UInt = 0u,
)

public data class NapiProviderInstallationBlob(
    public var dwVersion: UInt = 0u,
    public var dwProviderType: UInt = 0u,
    public var fSupportsWildCard: UInt = 0u,
    public var cDomains: UInt = 0u,
    public var offsetFirstDomain: UInt = 0u,
)

public data class NdNeighborAdvertHeader(
    public var ndNaHdr: IcmpMessage = IcmpMessage(),
    public var ndNaTarget: In6Addr = In6Addr(),
)

public data class NdNeighborSolicitHeader(
    public var ndNsHdr: IcmpMessage = IcmpMessage(),
    public var ndNsTarget: In6Addr = In6Addr(),
)

public data class NdOptionDnssl(
    public var ndOptDnsslType: UByte = 0u,
    public var ndOptDnsslLen: UByte = 0u,
    public var ndOptDnsslReserved: UShort = 0u,
    public var ndOptDnsslLifetime: UInt = 0u,
)

public data class NdOptionHdr(
    public var ndOptType: UByte = 0u,
    public var ndOptLen: UByte = 0u,
)

public data class NdOptionMtu(
    public var ndOptMtuType: UByte = 0u,
    public var ndOptMtuLen: UByte = 0u,
    public var ndOptMtuReserved: UShort = 0u,
    public var ndOptMtuMtu: UInt = 0u,
)

public data class NdOptionPrefixInfo(
    public var ndOptPiType: UByte = 0u,
    public var ndOptPiLen: UByte = 0u,
    public var ndOptPiPrefixLen: UByte = 0u,
    public var anonymous1: NdOptionPrefixInfo0 = NdOptionPrefixInfo0(),
    public var ndOptPiValidTime: UInt = 0u,
    public var ndOptPiPreferredTime: UInt = 0u,
    public var anonymous2: NdOptionPrefixInfo1 = NdOptionPrefixInfo1(),
    public var ndOptPiPrefix: In6Addr = In6Addr(),
)

public data class NdOptionPrefixInfo0(
    public var ndOptPiFlagsReserved: UByte = 0u,
    public var flags: NdOptionPrefixInfo00 = NdOptionPrefixInfo00(),
)

public data class NdOptionPrefixInfo00(
    public var bitfield: UByte = 0u,
)

public data class NdOptionPrefixInfo1(
    public var ndOptPiReserved2: UInt = 0u,
    public var anonymous: NdOptionPrefixInfo10 = NdOptionPrefixInfo10(),
)

public data class NdOptionPrefixInfo10(
    public var ndOptPiReserved3: UByteArray = UByteArray(3),
    public var ndOptPiSitePrefixLen: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdOptionPrefixInfo10) return false
        if (!this.ndOptPiReserved3.contentEquals(other.ndOptPiReserved3)) return false
        if (this.ndOptPiSitePrefixLen != other.ndOptPiSitePrefixLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ndOptPiReserved3.contentHashCode()
        result = 31 * result + this.ndOptPiSitePrefixLen.hashCode()
        return result
    }
}

public data class NdOptionRdnss(
    public var ndOptRdnssType: UByte = 0u,
    public var ndOptRdnssLen: UByte = 0u,
    public var ndOptRdnssReserved: UShort = 0u,
    public var ndOptRdnssLifetime: UInt = 0u,
)

public data class NdOptionRdHdr(
    public var ndOptRhType: UByte = 0u,
    public var ndOptRhLen: UByte = 0u,
    public var ndOptRhReserved1: UShort = 0u,
    public var ndOptRhReserved2: UInt = 0u,
)

public data class NdOptionRouteInfo(
    public var ndOptRiType: UByte = 0u,
    public var ndOptRiLen: UByte = 0u,
    public var ndOptRiPrefixLen: UByte = 0u,
    public var anonymous: NdOptionRouteInfo0 = NdOptionRouteInfo0(),
    public var ndOptRiRouteLifetime: UInt = 0u,
    public var ndOptRiPrefix: In6Addr = In6Addr(),
)

public data class NdOptionRouteInfo0(
    public var ndOptRiFlagsReserved: UByte = 0u,
    public var flags: NdOptionRouteInfo00 = NdOptionRouteInfo00(),
)

public data class NdOptionRouteInfo00(
    public var bitfield: UByte = 0u,
)

public data class NdRedirectHeader(
    public var ndRdHdr: IcmpMessage = IcmpMessage(),
    public var ndRdTarget: In6Addr = In6Addr(),
    public var ndRdDst: In6Addr = In6Addr(),
)

public data class NdRouterAdvertHeader(
    public var ndRaHdr: IcmpMessage = IcmpMessage(),
    public var ndRaReachable: UInt = 0u,
    public var ndRaRetransmit: UInt = 0u,
)

public data class NdRouterSolicitHeader(
    public var ndRsHdr: IcmpMessage = IcmpMessage(),
)

public data class Netresource2a(
    public var dwScope: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var dwDisplayType: UInt = 0u,
    public var lpLocalName: Pstr = null,
    public var lpRemoteName: Pstr = null,
    public var lpComment: Pstr = null,
    public var nsInfo: NsInfoa = NsInfoa(),
    public var serviceType: Guid = Guid(),
    public var dwProtocols: UInt = 0u,
    public var lpiProtocols: Int? = null,
)

public data class Netresource2w(
    public var dwScope: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var dwDisplayType: UInt = 0u,
    public var lpLocalName: Pwstr = null,
    public var lpRemoteName: Pwstr = null,
    public var lpComment: Pwstr = null,
    public var nsInfo: NsInfoa = NsInfoa(),
    public var serviceType: Guid = Guid(),
    public var dwProtocols: UInt = 0u,
    public var lpiProtocols: Int? = null,
)

public data class NlaBlob(
    public var header: NlaBlob0 = NlaBlob0(),
    public var data: NlaBlob1 = NlaBlob1(),
)

public data class NlaBlob1(
    public var rawData: ByteArray = ByteArray(1),
    public var interfaceData: NlaBlob10 = NlaBlob10(),
    public var locationData: NlaBlob11 = NlaBlob11(),
    public var connectivity: NlaBlob12 = NlaBlob12(),
    public var ics: NlaBlob13 = NlaBlob13(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob1) return false
        if (!this.rawData.contentEquals(other.rawData)) return false
        if (this.interfaceData != other.interfaceData) return false
        if (this.locationData != other.locationData) return false
        if (this.connectivity != other.connectivity) return false
        if (this.ics != other.ics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawData.contentHashCode()
        result = 31 * result + this.interfaceData.hashCode()
        result = 31 * result + this.locationData.hashCode()
        result = 31 * result + this.connectivity.hashCode()
        result = 31 * result + this.ics.hashCode()
        return result
    }
}

public data class NlaBlob13(
    public var remote: NlaBlob130 = NlaBlob130(),
)

public data class NlaBlob130(
    public var speed: UInt = 0u,
    public var type: UInt = 0u,
    public var state: UInt = 0u,
    public var machineName: UShortArray = UShortArray(256),
    public var sharedAdapterName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob130) return false
        if (this.speed != other.speed) return false
        if (this.type != other.type) return false
        if (this.state != other.state) return false
        if (!this.machineName.contentEquals(other.machineName)) return false
        if (!this.sharedAdapterName.contentEquals(other.sharedAdapterName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.speed.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.machineName.contentHashCode()
        result = 31 * result + this.sharedAdapterName.contentHashCode()
        return result
    }
}

public data class NlaBlob12(
    public var type: NlaConnectivityType = 0,
    public var internet: NlaInternet = 0,
)

public data class NlaBlob10(
    public var dwType: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var adapterName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob10) return false
        if (this.dwType != other.dwType) return false
        if (this.dwSpeed != other.dwSpeed) return false
        if (!this.adapterName.contentEquals(other.adapterName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwSpeed.hashCode()
        result = 31 * result + this.adapterName.contentHashCode()
        return result
    }
}

public data class NlaBlob11(
    public var information: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob11) return false
        if (!this.information.contentEquals(other.information)) return false
        return true
    }

    override fun hashCode(): Int = this.information.contentHashCode()
}

public data class NlaBlob0(
    public var type: NlaBlobDataType = 0,
    public var dwSize: UInt = 0u,
    public var nextOffset: UInt = 0u,
)

public data class NlBandwidthInformation(
    public var bandwidth: ULong = 0uL,
    public var instability: ULong = 0uL,
    public var bandwidthPeaked: Boolean = false,
)

public data class NlInterfaceOffloadRod(
    public var bitfield: UByte = 0u,
)

public data class NlNetworkConnectivityHint(
    public var connectivityLevel: NlNetworkConnectivityLevelHint = 0,
    public var connectivityCost: NlNetworkConnectivityCostHint = 0,
    public var approachingDataLimit: Boolean = false,
    public var overDataLimit: Boolean = false,
    public var roaming: Boolean = false,
)

public data class NlPathBandwidthRod(
    public var bandwidth: ULong = 0uL,
    public var instability: ULong = 0uL,
    public var bandwidthPeaked: Boolean = false,
)

public data class NpiModuleid(
    public var length: UShort = 0u,
    public var type: NpiModuleidType = 0,
    public var anonymous: NpiModuleid0 = NpiModuleid0(),
)

public data class NpiModuleid0(
    public var guid: Guid = Guid(),
    public var ifLuid: Luid = Luid(),
)

public data class Nspv2Routine(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var nSPv2Startup: Lpnspv2startup = null,
    public var nSPv2Cleanup: Lpnspv2cleanup = null,
    public var nSPv2LookupServiceBegin: Lpnspv2lookupservicebegin = null,
    public var nSPv2LookupServiceNextEx: Lpnspv2lookupservicenextex = null,
    public var nSPv2LookupServiceEnd: Lpnspv2lookupserviceend = null,
    public var nSPv2SetServiceEx: Lpnspv2setserviceex = null,
    public var nSPv2ClientSessionRundown: Lpnspv2clientsessionrundown = null,
)

public data class NspRoutine(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var nSPCleanup: Lpnspcleanup = null,
    public var nSPLookupServiceBegin: Lpnsplookupservicebegin = null,
    public var nSPLookupServiceNext: Lpnsplookupservicenext = null,
    public var nSPLookupServiceEnd: Lpnsplookupserviceend = null,
    public var nSPSetService: Lpnspsetservice = null,
    public var nSPInstallServiceClass: Lpnspinstallserviceclass = null,
    public var nSPRemoveServiceClass: Lpnspremoveserviceclass = null,
    public var nSPGetServiceClassInfo: Lpnspgetserviceclassinfo = null,
    public var nSPIoctl: Lpnspioctl = null,
)

public data class NsInfoa(
    public var dwNameSpace: UInt = 0u,
    public var dwNameSpaceFlags: UInt = 0u,
    public var lpNameSpace: Pstr = null,
)

public data class NsInfow(
    public var dwNameSpace: UInt = 0u,
    public var dwNameSpaceFlags: UInt = 0u,
    public var lpNameSpace: Pwstr = null,
)

public data class NsServiceInfoa(
    public var dwNameSpace: UInt = 0u,
    public var serviceInfo: ServiceInfoa = ServiceInfoa(),
)

public data class NsServiceInfow(
    public var dwNameSpace: UInt = 0u,
    public var serviceInfo: ServiceInfow = ServiceInfow(),
)

public data class PriorityStatus(
    public var sender: SocketPriorityHint = 0,
    public var receiver: SocketPriorityHint = 0,
)

public data class ProtocolInfoa(
    public var dwServiceFlags: UInt = 0u,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var lpProtocol: Pstr = null,
)

public data class ProtocolInfow(
    public var dwServiceFlags: UInt = 0u,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var lpProtocol: Pwstr = null,
)

public data class Protoent(
    public var pName: Pstr = null,
    public var pAliases: COpaquePointer? = null,
    public var pProto: Short = 0,
)

public data class Q2931Ie(
    public var iEType: Q2931IeType = 0,
    public var iELength: UInt = 0u,
    public var ie: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Q2931Ie) return false
        if (this.iEType != other.iEType) return false
        if (this.iELength != other.iELength) return false
        if (!this.ie.contentEquals(other.ie)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iEType.hashCode()
        result = 31 * result + this.iELength.hashCode()
        result = 31 * result + this.ie.contentHashCode()
        return result
    }
}

public data class Qos(
    public var sendingFlowspec: Flowspec = Flowspec(),
    public var receivingFlowspec: Flowspec = Flowspec(),
    public var providerSpecific: Wsabuf = Wsabuf(),
)

public data class RcvallIf(
    public var mode: RcvallValue = 0,
    public var iface: UInt = 0u,
)

public data class RealTimeNotificationSettingInput(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var brokerEventGuid: Guid = Guid(),
)

public data class RealTimeNotificationSettingInputEx(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var brokerEventGuid: Guid = Guid(),
    public var unmark: Boolean = false,
)

public data class RealTimeNotificationSettingOutput(
    public var channelStatus: ControlChannelTriggerStatus = 0,
)

public data class Rioresult(
    public var status: Int = 0,
    public var bytesTransferred: UInt = 0u,
    public var socketContext: ULong = 0uL,
    public var requestContext: ULong = 0uL,
)

public data class RioBuf(
    public var bufferId: RioBufferid = 0,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
)

public data class RioCmsgBuffer(
    public var totalLength: UInt = 0u,
)

public data class RioExtensionFunctionTable(
    public var cbSize: UInt = 0u,
    public var rIOReceive: LpfnRioreceive = null,
    public var rIOReceiveEx: LpfnRioreceiveex = null,
    public var rIOSend: LpfnRiosend = null,
    public var rIOSendEx: LpfnRiosendex = null,
    public var rIOCloseCompletionQueue: LpfnRioclosecompletionqueue = null,
    public var rIOCreateCompletionQueue: LpfnRiocreatecompletionqueue = null,
    public var rIOCreateRequestQueue: LpfnRiocreaterequestqueue = null,
    public var rIODequeueCompletion: LpfnRiodequeuecompletion = null,
    public var rIODeregisterBuffer: LpfnRioderegisterbuffer = null,
    public var rIONotify: LpfnRionotify = null,
    public var rIORegisterBuffer: LpfnRioregisterbuffer = null,
    public var rIOResizeCompletionQueue: LpfnRioresizecompletionqueue = null,
    public var rIOResizeRequestQueue: LpfnRioresizerequestqueue = null,
)

public data class RioNotificationCompletion(
    public var type: RioNotificationCompletionType = 0,
    public var anonymous: RioNotificationCompletion0 = RioNotificationCompletion0(),
)

public data class RioNotificationCompletion0(
    public var event: RioNotificationCompletion00 = RioNotificationCompletion00(),
    public var iocp: RioNotificationCompletion01 = RioNotificationCompletion01(),
)

public data class RioNotificationCompletion00(
    public var eventHandle: Handle = null,
    public var notifyReset: Bool = 0,
)

public data class RioNotificationCompletion01(
    public var iocpHandle: Handle = null,
    public var completionKey: COpaquePointer? = null,
    public var overlapped: COpaquePointer? = null,
)

public data class RmFecInfo(
    public var fECBlockSize: UShort = 0u,
    public var fECProActivePackets: UShort = 0u,
    public var fECGroupSize: UByte = 0u,
    public var fFECOnDemandParityEnabled: Boolean = false,
)

public class RmReceiverStats(
    public var numODataPacketsReceived: ULong = 0uL,
    public var numRDataPacketsReceived: ULong = 0uL,
    public var numDuplicateDataPackets: ULong = 0uL,
    public var dataBytesReceived: ULong = 0uL,
    public var totalBytesReceived: ULong = 0uL,
    public var rateKBitsPerSecOverall: ULong = 0uL,
    public var rateKBitsPerSecLast: ULong = 0uL,
    public var trailingEdgeSeqId: ULong = 0uL,
    public var leadingEdgeSeqId: ULong = 0uL,
    public var averageSequencesInWindow: ULong = 0uL,
    public var minSequencesInWindow: ULong = 0uL,
    public var maxSequencesInWindow: ULong = 0uL,
    public var firstNakSequenceNumber: ULong = 0uL,
    public var numPendingNaks: ULong = 0uL,
    public var numOutstandingNaks: ULong = 0uL,
    public var numDataPacketsBuffered: ULong = 0uL,
    public var totalSelectiveNaksSent: ULong = 0uL,
    public var totalParityNaksSent: ULong = 0uL,
)

public data class RmSenderStats(
    public var dataBytesSent: ULong = 0uL,
    public var totalBytesSent: ULong = 0uL,
    public var naksReceived: ULong = 0uL,
    public var naksReceivedTooLate: ULong = 0uL,
    public var numOutstandingNaks: ULong = 0uL,
    public var numNaksAfterRData: ULong = 0uL,
    public var repairPacketsSent: ULong = 0uL,
    public var bufferSpaceAvailable: ULong = 0uL,
    public var trailingEdgeSeqId: ULong = 0uL,
    public var leadingEdgeSeqId: ULong = 0uL,
    public var rateKBitsPerSecOverall: ULong = 0uL,
    public var rateKBitsPerSecLast: ULong = 0uL,
    public var totalODataPacketsSent: ULong = 0uL,
)

public data class RmSendWindow(
    public var rateKbitsPerSec: UInt = 0u,
    public var windowSizeInMSecs: UInt = 0u,
    public var windowSizeInBytes: UInt = 0u,
)

public data class RssScalabilityInfo(
    public var rssEnabled: Boolean = false,
)

public data class ScopeId(
    public var anonymous: ScopeId0 = ScopeId0(),
)

public data class ScopeId0(
    public var anonymous: ScopeId00 = ScopeId00(),
    public var value: UInt = 0u,
)

public data class ScopeId00(
    public var bitfield: UInt = 0u,
)

public data class Servent(
    public var sName: Pstr = null,
    public var sAliases: COpaquePointer? = null,
    public var sProto: Pstr = null,
    public var sPort: Short = 0,
)

public data class ServiceAddress(
    public var dwAddressType: UInt = 0u,
    public var dwAddressFlags: UInt = 0u,
    public var dwAddressLength: UInt = 0u,
    public var dwPrincipalLength: UInt = 0u,
    public var lpAddress: COpaquePointer? = null,
    public var lpPrincipal: COpaquePointer? = null,
)

public data class ServiceAddresses(
    public var dwAddressCount: UInt = 0u,
    public var addresses: List<ServiceAddress> = List(1) { ServiceAddress() },
)

public data class ServiceAsyncInfo(
    public var lpServiceCallbackProc: LpserviceCallbackProc = null,
    public var lParam: Lparam = 0L,
    public var hAsyncTaskHandle: Handle = null,
)

public data class ServiceInfoa(
    public var lpServiceType: Guid? = null,
    public var lpServiceName: Pstr = null,
    public var lpComment: Pstr = null,
    public var lpLocale: Pstr = null,
    public var dwDisplayHint: ResourceDisplayType = 0u,
    public var dwVersion: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var lpMachineName: Pstr = null,
    public var lpServiceAddress: ServiceAddresses? = null,
    public var serviceSpecificInfo: Blob = Blob(),
)

public data class ServiceInfow(
    public var lpServiceType: Guid? = null,
    public var lpServiceName: Pwstr = null,
    public var lpComment: Pwstr = null,
    public var lpLocale: Pwstr = null,
    public var dwDisplayHint: ResourceDisplayType = 0u,
    public var dwVersion: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var lpMachineName: Pwstr = null,
    public var lpServiceAddress: ServiceAddresses? = null,
    public var serviceSpecificInfo: Blob = Blob(),
)

public data class ServiceTypeInfo(
    public var dwTypeNameOffset: UInt = 0u,
    public var dwValueCount: UInt = 0u,
    public var values: List<ServiceTypeValue> = List(1) { ServiceTypeValue() },
)

public data class ServiceTypeInfoAbsa(
    public var lpTypeName: Pstr = null,
    public var dwValueCount: UInt = 0u,
    public var values: List<ServiceTypeValueAbsa> = List(1) { ServiceTypeValueAbsa() },
)

public data class ServiceTypeInfoAbsw(
    public var lpTypeName: Pwstr = null,
    public var dwValueCount: UInt = 0u,
    public var values: List<ServiceTypeValueAbsw> = List(1) { ServiceTypeValueAbsw() },
)

public data class ServiceTypeValue(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var dwValueNameOffset: UInt = 0u,
    public var dwValueOffset: UInt = 0u,
)

public data class ServiceTypeValueAbsa(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValueName: Pstr = null,
    public var lpValue: COpaquePointer? = null,
)

public data class ServiceTypeValueAbsw(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValueName: Pwstr = null,
    public var lpValue: COpaquePointer? = null,
)

public data class SnapHeader(
    public var dsap: UByte = 0u,
    public var ssap: UByte = 0u,
    public var control: UByte = 0u,
    public var oui: UByteArray = UByteArray(3),
    public var type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SnapHeader) return false
        if (this.dsap != other.dsap) return false
        if (this.ssap != other.ssap) return false
        if (this.control != other.control) return false
        if (!this.oui.contentEquals(other.oui)) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dsap.hashCode()
        result = 31 * result + this.ssap.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.oui.contentHashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }
}

public data class Sockaddr(
    public var saFamily: AddressFamily = 0u,
    public var saData: ByteArray = ByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrAtm(
    public var satmFamily: UShort = 0u,
    public var satmNumber: AtmAddress = AtmAddress(),
    public var satmBlli: AtmBlli = AtmBlli(),
    public var satmBhli: AtmBhli = AtmBhli(),
)

public data class SockaddrDl(
    public var sdlFamily: AddressFamily = 0u,
    public var sdlData: UByteArray = UByteArray(8),
    public var sdlZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        if (!this.sdlZero.contentEquals(other.sdlZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlFamily.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        result = 31 * result + this.sdlZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn(
    public var sinFamily: AddressFamily = 0u,
    public var sinPort: UShort = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: AddressFamily = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var anonymous: SockaddrIn60 = SockaddrIn60(),
)

public data class SockaddrIn60(
    public var sin6ScopeId: UInt = 0u,
    public var sin6ScopeStruct: ScopeId = ScopeId(),
)

public data class SockaddrIn6Pair(
    public var sourceAddress: SockaddrIn6? = null,
    public var destinationAddress: SockaddrIn6? = null,
)

public data class SockaddrIn6W2ksp1(
    public var sin6Family: Short = 0,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class SockaddrInet(
    public var ipv4: SockaddrIn = SockaddrIn(),
    public var ipv6: SockaddrIn6 = SockaddrIn6(),
    public var siFamily: AddressFamily = 0u,
)

public data class SockaddrIpx(
    public var saFamily: Short = 0,
    public var saNetnum: ByteArray = ByteArray(4),
    public var saNodenum: ByteArray = ByteArray(6),
    public var saSocket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIpx) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saNetnum.contentEquals(other.saNetnum)) return false
        if (!this.saNodenum.contentEquals(other.saNodenum)) return false
        if (this.saSocket != other.saSocket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saNetnum.contentHashCode()
        result = 31 * result + this.saNodenum.contentHashCode()
        result = 31 * result + this.saSocket.hashCode()
        return result
    }
}

public data class SockaddrIrda(
    public var irdaAddressFamily: UShort = 0u,
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaServiceName: ByteArray = ByteArray(25),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIrda) return false
        if (this.irdaAddressFamily != other.irdaAddressFamily) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaServiceName.contentEquals(other.irdaServiceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaAddressFamily.hashCode()
        result = 31 * result + this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaServiceName.contentHashCode()
        return result
    }
}

public data class SockaddrNb(
    public var snbFamily: Short = 0,
    public var snbType: UShort = 0u,
    public var snbName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrNb) return false
        if (this.snbFamily != other.snbFamily) return false
        if (this.snbType != other.snbType) return false
        if (!this.snbName.contentEquals(other.snbName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.snbFamily.hashCode()
        result = 31 * result + this.snbType.hashCode()
        result = 31 * result + this.snbName.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssFamily: AddressFamily = 0u,
    public var ssPad1: ByteArray = ByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class SockaddrStorageXp(
    public var ssFamily: Short = 0,
    public var ssPad1: ByteArray = ByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorageXp) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class SockaddrTp(
    public var tpFamily: UShort = 0u,
    public var tpAddrType: UShort = 0u,
    public var tpTaddrLen: UShort = 0u,
    public var tpTselLen: UShort = 0u,
    public var tpAddr: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrTp) return false
        if (this.tpFamily != other.tpFamily) return false
        if (this.tpAddrType != other.tpAddrType) return false
        if (this.tpTaddrLen != other.tpTaddrLen) return false
        if (this.tpTselLen != other.tpTselLen) return false
        if (!this.tpAddr.contentEquals(other.tpAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tpFamily.hashCode()
        result = 31 * result + this.tpAddrType.hashCode()
        result = 31 * result + this.tpTaddrLen.hashCode()
        result = 31 * result + this.tpTselLen.hashCode()
        result = 31 * result + this.tpAddr.contentHashCode()
        return result
    }
}

public data class SockaddrUn(
    public var sunFamily: AddressFamily = 0u,
    public var sunPath: ByteArray = ByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrVns(
    public var sinFamily: UShort = 0u,
    public var netAddress: UByteArray = UByteArray(4),
    public var subnetAddr: UByteArray = UByteArray(2),
    public var port: UByteArray = UByteArray(2),
    public var hops: UByte = 0u,
    public var filler: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVns) return false
        if (this.sinFamily != other.sinFamily) return false
        if (!this.netAddress.contentEquals(other.netAddress)) return false
        if (!this.subnetAddr.contentEquals(other.subnetAddr)) return false
        if (!this.port.contentEquals(other.port)) return false
        if (this.hops != other.hops) return false
        if (!this.filler.contentEquals(other.filler)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.netAddress.contentHashCode()
        result = 31 * result + this.subnetAddr.contentHashCode()
        result = 31 * result + this.port.contentHashCode()
        result = 31 * result + this.hops.hashCode()
        result = 31 * result + this.filler.contentHashCode()
        return result
    }
}

public data class SocketAddress(
    public var lpSockaddr: Sockaddr? = null,
    public var iSockaddrLength: Int = 0,
)

public data class SocketAddressList(
    public var iAddressCount: Int = 0,
    public var address: List<SocketAddress> = List(1) { SocketAddress() },
)

public data class SocketPeerTargetName(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTargetNameStringLen: UInt = 0u,
    public var allStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocketPeerTargetName) return false
        if (this.securityProtocol != other.securityProtocol) return false
        if (this.peerAddress != other.peerAddress) return false
        if (this.peerTargetNameStringLen != other.peerTargetNameStringLen) return false
        if (!this.allStrings.contentEquals(other.allStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityProtocol.hashCode()
        result = 31 * result + this.peerAddress.hashCode()
        result = 31 * result + this.peerTargetNameStringLen.hashCode()
        result = 31 * result + this.allStrings.contentHashCode()
        return result
    }
}

public data class SocketProcessorAffinity(
    public var processor: ProcessorNumber = ProcessorNumber(),
    public var numaNodeId: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class SocketSecurityQueryInfo(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var flags: UInt = 0u,
    public var peerApplicationAccessTokenHandle: ULong = 0uL,
    public var peerMachineAccessTokenHandle: ULong = 0uL,
)

public data class SocketSecurityQueryInfoIpsec2(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var flags: UInt = 0u,
    public var peerApplicationAccessTokenHandle: ULong = 0uL,
    public var peerMachineAccessTokenHandle: ULong = 0uL,
    public var mmSaId: ULong = 0uL,
    public var qmSaId: ULong = 0uL,
    public var negotiationWinerr: UInt = 0u,
    public var saLookupContext: Guid = Guid(),
)

public data class SocketSecurityQueryTemplate(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTokenAccessMask: UInt = 0u,
)

public data class SocketSecurityQueryTemplateIpsec2(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTokenAccessMask: UInt = 0u,
    public var flags: UInt = 0u,
    public var fieldMask: UInt = 0u,
)

public data class SocketSecuritySettings(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var securityFlags: UInt = 0u,
)
