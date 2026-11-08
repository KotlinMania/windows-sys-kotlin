@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.system.com.BLOB
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.COMPARTMENT_ID
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.PROCESSOR_NUMBER

public data class AAL5_PARAMETERS(
    public var ForwardMaxCPCSSDUSize: UInt = 0u,
    public var BackwardMaxCPCSSDUSize: UInt = 0u,
    public var Mode: UByte = 0u,
    public var SSCSType: UByte = 0u,
)

public data class AALUSER_PARAMETERS(public var UserDefined: UInt = 0u)

public data class AAL_PARAMETERS_IE(public var AALType: AAL_TYPE = 0, public var AALSpecificParameters: AAL_PARAMETERS_IE_0 = AAL_PARAMETERS_IE_0())

public data class AAL_PARAMETERS_IE_0(public var AAL5Parameters: AAL5_PARAMETERS = AAL5_PARAMETERS(), public var AALUserParameters: AALUSER_PARAMETERS = AALUSER_PARAMETERS())

public data class ADDRINFOA(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_next: Long = 0L,
)

public data class ADDRINFOEX2A(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PSTR = 0L,
)

public data class ADDRINFOEX2W(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PWSTR = 0L,
)

public data class ADDRINFOEX3(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PWSTR = 0L,
    public var ai_interfaceindex: Int = 0,
)

public data class ADDRINFOEX4(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PWSTR = 0L,
    public var ai_interfaceindex: Int = 0,
    public var ai_resolutionhandle: HANDLE = 0L,
)

public data class ADDRINFOEX5(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PWSTR = 0L,
    public var ai_interfaceindex: Int = 0,
    public var ai_resolutionhandle: HANDLE = 0L,
    public var ai_ttl: UInt = 0u,
)

public class ADDRINFOEX6(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
    public var ai_version: Int = 0,
    public var ai_fqdn: PWSTR = 0L,
    public var ai_interfaceindex: Int = 0,
    public var ai_resolutionhandle: HANDLE = 0L,
    public var ai_ttl: UInt = 0u,
    public var ai_numservers: UInt = 0u,
    public var ai_servers: Long = 0L,
    public var ai_responseflags: ULong = 0uL,
)

public data class ADDRINFOEXA(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
)

public data class ADDRINFOEXW(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_blob: Long = 0L,
    public var ai_bloblen: ULong = 0uL,
    public var ai_provider: Long = 0L,
    public var ai_next: Long = 0L,
)

public data class ADDRINFOW(
    public var ai_flags: Int = 0,
    public var ai_family: Int = 0,
    public var ai_socktype: Int = 0,
    public var ai_protocol: Int = 0,
    public var ai_addrlen: ULong = 0uL,
    public var ai_canonname: PWSTR = 0L,
    public var ai_addr: Long = 0L,
    public var ai_next: Long = 0L,
)

public data class ADDRINFO_DNS_SERVER(
    public var ai_servertype: UInt = 0u,
    public var ai_flags: ULong = 0uL,
    public var ai_addrlen: UInt = 0u,
    public var ai_addr: Long = 0L,
    public var Anonymous: ADDRINFO_DNS_SERVER_0 = ADDRINFO_DNS_SERVER_0(),
)

public data class ADDRINFO_DNS_SERVER_0(public var ai_template: PWSTR = 0L)

public data class AFPROTOCOLS(public var iAddressFamily: Int = 0, public var iProtocol: Int = 0)

public data class ARP_HEADER(
    public var HardwareAddressSpace: UShort = 0u,
    public var ProtocolAddressSpace: UShort = 0u,
    public var HardwareAddressLength: UByte = 0u,
    public var ProtocolAddressLength: UByte = 0u,
    public var Opcode: UShort = 0u,
    public var SenderHardwareAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARP_HEADER) return false
        if (this.HardwareAddressSpace != other.HardwareAddressSpace) return false
        if (this.ProtocolAddressSpace != other.ProtocolAddressSpace) return false
        if (this.HardwareAddressLength != other.HardwareAddressLength) return false
        if (this.ProtocolAddressLength != other.ProtocolAddressLength) return false
        if (this.Opcode != other.Opcode) return false
        if (!this.SenderHardwareAddress.contentEquals(other.SenderHardwareAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HardwareAddressSpace.hashCode()
        result = 31 * result + this.ProtocolAddressSpace.hashCode()
        result = 31 * result + this.HardwareAddressLength.hashCode()
        result = 31 * result + this.ProtocolAddressLength.hashCode()
        result = 31 * result + this.Opcode.hashCode()
        result = 31 * result + this.SenderHardwareAddress.contentHashCode()
        return result
    }
}

public data class ASSOCIATE_NAMERES_CONTEXT_INPUT(public var TransportSettingId: TRANSPORT_SETTING_ID = TRANSPORT_SETTING_ID(), public var Handle: ULong = 0uL)

public data class ATM_ADDRESS(
    public var AddressType: UInt = 0u,
    public var NumofDigits: UInt = 0u,
    public var Addr: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_ADDRESS) return false
        if (this.AddressType != other.AddressType) return false
        if (this.NumofDigits != other.NumofDigits) return false
        if (!this.Addr.contentEquals(other.Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressType.hashCode()
        result = 31 * result + this.NumofDigits.hashCode()
        result = 31 * result + this.Addr.contentHashCode()
        return result
    }
}

public data class ATM_BHLI(
    public var HighLayerInfoType: UInt = 0u,
    public var HighLayerInfoLength: UInt = 0u,
    public var HighLayerInfo: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_BHLI) return false
        if (this.HighLayerInfoType != other.HighLayerInfoType) return false
        if (this.HighLayerInfoLength != other.HighLayerInfoLength) return false
        if (!this.HighLayerInfo.contentEquals(other.HighLayerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HighLayerInfoType.hashCode()
        result = 31 * result + this.HighLayerInfoLength.hashCode()
        result = 31 * result + this.HighLayerInfo.contentHashCode()
        return result
    }
}

public data class ATM_BLLI(
    public var Layer2Protocol: UInt = 0u,
    public var Layer2UserSpecifiedProtocol: UInt = 0u,
    public var Layer3Protocol: UInt = 0u,
    public var Layer3UserSpecifiedProtocol: UInt = 0u,
    public var Layer3IPI: UInt = 0u,
    public var SnapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_BLLI) return false
        if (this.Layer2Protocol != other.Layer2Protocol) return false
        if (this.Layer2UserSpecifiedProtocol != other.Layer2UserSpecifiedProtocol) return false
        if (this.Layer3Protocol != other.Layer3Protocol) return false
        if (this.Layer3UserSpecifiedProtocol != other.Layer3UserSpecifiedProtocol) return false
        if (this.Layer3IPI != other.Layer3IPI) return false
        if (!this.SnapID.contentEquals(other.SnapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Layer2Protocol.hashCode()
        result = 31 * result + this.Layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.Layer3Protocol.hashCode()
        result = 31 * result + this.Layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.Layer3IPI.hashCode()
        result = 31 * result + this.SnapID.contentHashCode()
        return result
    }
}

public data class ATM_BLLI_IE(
    public var Layer2Protocol: UInt = 0u,
    public var Layer2Mode: UByte = 0u,
    public var Layer2WindowSize: UByte = 0u,
    public var Layer2UserSpecifiedProtocol: UInt = 0u,
    public var Layer3Protocol: UInt = 0u,
    public var Layer3Mode: UByte = 0u,
    public var Layer3DefaultPacketSize: UByte = 0u,
    public var Layer3PacketWindowSize: UByte = 0u,
    public var Layer3UserSpecifiedProtocol: UInt = 0u,
    public var Layer3IPI: UInt = 0u,
    public var SnapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_BLLI_IE) return false
        if (this.Layer2Protocol != other.Layer2Protocol) return false
        if (this.Layer2Mode != other.Layer2Mode) return false
        if (this.Layer2WindowSize != other.Layer2WindowSize) return false
        if (this.Layer2UserSpecifiedProtocol != other.Layer2UserSpecifiedProtocol) return false
        if (this.Layer3Protocol != other.Layer3Protocol) return false
        if (this.Layer3Mode != other.Layer3Mode) return false
        if (this.Layer3DefaultPacketSize != other.Layer3DefaultPacketSize) return false
        if (this.Layer3PacketWindowSize != other.Layer3PacketWindowSize) return false
        if (this.Layer3UserSpecifiedProtocol != other.Layer3UserSpecifiedProtocol) return false
        if (this.Layer3IPI != other.Layer3IPI) return false
        if (!this.SnapID.contentEquals(other.SnapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Layer2Protocol.hashCode()
        result = 31 * result + this.Layer2Mode.hashCode()
        result = 31 * result + this.Layer2WindowSize.hashCode()
        result = 31 * result + this.Layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.Layer3Protocol.hashCode()
        result = 31 * result + this.Layer3Mode.hashCode()
        result = 31 * result + this.Layer3DefaultPacketSize.hashCode()
        result = 31 * result + this.Layer3PacketWindowSize.hashCode()
        result = 31 * result + this.Layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.Layer3IPI.hashCode()
        result = 31 * result + this.SnapID.contentHashCode()
        return result
    }
}

public data class ATM_BROADBAND_BEARER_CAPABILITY_IE(
    public var BearerClass: UByte = 0u,
    public var TrafficType: UByte = 0u,
    public var TimingRequirements: UByte = 0u,
    public var ClippingSusceptability: UByte = 0u,
    public var UserPlaneConnectionConfig: UByte = 0u,
)

public data class ATM_CALLING_PARTY_NUMBER_IE(
    public var ATM_Number: ATM_ADDRESS = ATM_ADDRESS(),
    public var Presentation_Indication: UByte = 0u,
    public var Screening_Indicator: UByte = 0u,
)

public data class ATM_CAUSE_IE(
    public var Location: UByte = 0u,
    public var Cause: UByte = 0u,
    public var DiagnosticsLength: UByte = 0u,
    public var Diagnostics: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_CAUSE_IE) return false
        if (this.Location != other.Location) return false
        if (this.Cause != other.Cause) return false
        if (this.DiagnosticsLength != other.DiagnosticsLength) return false
        if (!this.Diagnostics.contentEquals(other.Diagnostics)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Location.hashCode()
        result = 31 * result + this.Cause.hashCode()
        result = 31 * result + this.DiagnosticsLength.hashCode()
        result = 31 * result + this.Diagnostics.contentHashCode()
        return result
    }
}

public data class ATM_CONNECTION_ID(
    public var DeviceNumber: UInt = 0u,
    public var VPI: UInt = 0u,
    public var VCI: UInt = 0u,
)

public data class ATM_PVC_PARAMS(public var PvcConnectionId: ATM_CONNECTION_ID = ATM_CONNECTION_ID(), public var PvcQos: QOS = QOS())

public data class ATM_QOS_CLASS_IE(public var QOSClassForward: UByte = 0u, public var QOSClassBackward: UByte = 0u)

public data class ATM_TD(
    public var PeakCellRate_CLP0: UInt = 0u,
    public var PeakCellRate_CLP01: UInt = 0u,
    public var SustainableCellRate_CLP0: UInt = 0u,
    public var SustainableCellRate_CLP01: UInt = 0u,
    public var MaxBurstSize_CLP0: UInt = 0u,
    public var MaxBurstSize_CLP01: UInt = 0u,
    public var Tagging: BOOL = 0,
)

public data class ATM_TRAFFIC_DESCRIPTOR_IE(
    public var Forward: ATM_TD = ATM_TD(),
    public var Backward: ATM_TD = ATM_TD(),
    public var BestEffort: BOOL = 0,
)

public data class ATM_TRANSIT_NETWORK_SELECTION_IE(
    public var TypeOfNetworkId: UByte = 0u,
    public var NetworkIdPlan: UByte = 0u,
    public var NetworkIdLength: UByte = 0u,
    public var NetworkId: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATM_TRANSIT_NETWORK_SELECTION_IE) return false
        if (this.TypeOfNetworkId != other.TypeOfNetworkId) return false
        if (this.NetworkIdPlan != other.NetworkIdPlan) return false
        if (this.NetworkIdLength != other.NetworkIdLength) return false
        if (!this.NetworkId.contentEquals(other.NetworkId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TypeOfNetworkId.hashCode()
        result = 31 * result + this.NetworkIdPlan.hashCode()
        result = 31 * result + this.NetworkIdLength.hashCode()
        result = 31 * result + this.NetworkId.contentHashCode()
        return result
    }
}

public data class CMSGHDR(
    public var cmsg_len: ULong = 0uL,
    public var cmsg_level: Int = 0,
    public var cmsg_type: Int = 0,
)

public data class CSADDR_INFO(
    public var LocalAddr: SOCKET_ADDRESS = SOCKET_ADDRESS(),
    public var RemoteAddr: SOCKET_ADDRESS = SOCKET_ADDRESS(),
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
)

public data class DL_EI48(public var Byte: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_EI48) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Byte.contentHashCode()
    }
}

public data class DL_EI64(public var Byte: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_EI64) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Byte.contentHashCode()
    }
}

public data class DL_EUI48(public var Byte: UByteArray = UByteArray(6), public var Anonymous: DL_EUI48_0 = DL_EUI48_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_EUI48) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Byte.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DL_EUI48_0(public var Oui: DL_OUI = DL_OUI(), public var Ei48: DL_EI48 = DL_EI48())

public data class DL_EUI64(
    public var Byte: UByteArray = UByteArray(8),
    public var Value: ULong = 0uL,
    public var Anonymous: DL_EUI64_0 = DL_EUI64_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_EUI64) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        if (this.Value != other.Value) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Byte.contentHashCode()
        result = 31 * result + this.Value.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DL_EUI64_0(public var Oui: DL_OUI = DL_OUI(), public var Anonymous: DL_EUI64_0_0 = DL_EUI64_0_0())

public data class DL_EUI64_0_0(public var Ei64: DL_EI64 = DL_EI64(), public var Anonymous: DL_EUI64_0_0_0 = DL_EUI64_0_0_0())

public data class DL_EUI64_0_0_0(
    public var Type: UByte = 0u,
    public var Tse: UByte = 0u,
    public var Ei48: DL_EI48 = DL_EI48(),
)

public data class DL_OUI(public var Byte: UByteArray = UByteArray(3), public var Anonymous: DL_OUI_0 = DL_OUI_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_OUI) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Byte.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DL_OUI_0(public var _bitfield: UByte = 0u)

public data class DL_TEREDO_ADDRESS(public var Reserved: UByteArray = UByteArray(6), public var Anonymous: DL_TEREDO_ADDRESS_0 = DL_TEREDO_ADDRESS_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_TEREDO_ADDRESS) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DL_TEREDO_ADDRESS_0(public var Eui64: DL_EUI64 = DL_EUI64(), public var Anonymous: DL_TEREDO_ADDRESS_0_0 = DL_TEREDO_ADDRESS_0_0())

public data class DL_TEREDO_ADDRESS_0_0(
    public var Flags: UShort = 0u,
    public var MappedPort: UShort = 0u,
    public var MappedAddress: IN_ADDR = IN_ADDR(),
)

public data class DL_TEREDO_ADDRESS_PRV(public var Reserved: UByteArray = UByteArray(6), public var Anonymous: DL_TEREDO_ADDRESS_PRV_0 = DL_TEREDO_ADDRESS_PRV_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_TEREDO_ADDRESS_PRV) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class DL_TEREDO_ADDRESS_PRV_0(public var Eui64: DL_EUI64 = DL_EUI64(), public var Anonymous: DL_TEREDO_ADDRESS_PRV_0_0 = DL_TEREDO_ADDRESS_PRV_0_0())

public data class DL_TEREDO_ADDRESS_PRV_0_0(
    public var Flags: UShort = 0u,
    public var MappedPort: UShort = 0u,
    public var MappedAddress: IN_ADDR = IN_ADDR(),
    public var LocalAddress: IN_ADDR = IN_ADDR(),
    public var InterfaceIndex: UInt = 0u,
    public var LocalPort: UShort = 0u,
    public var DlDestination: DL_EUI48 = DL_EUI48(),
)

public data class DL_TUNNEL_ADDRESS(
    public var CompartmentId: COMPARTMENT_ID = 0,
    public var ScopeId: SCOPE_ID = SCOPE_ID(),
    public var IpAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DL_TUNNEL_ADDRESS) return false
        if (this.CompartmentId != other.CompartmentId) return false
        if (this.ScopeId != other.ScopeId) return false
        if (!this.IpAddress.contentEquals(other.IpAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompartmentId.hashCode()
        result = 31 * result + this.ScopeId.hashCode()
        result = 31 * result + this.IpAddress.contentHashCode()
        return result
    }
}

public data class ETHERNET_HEADER(
    public var Destination: DL_EUI48 = DL_EUI48(),
    public var Source: DL_EUI48 = DL_EUI48(),
    public var Anonymous: ETHERNET_HEADER_0 = ETHERNET_HEADER_0(),
)

public data class ETHERNET_HEADER_0(public var Type: UShort = 0u, public var Length: UShort = 0u)

public data class FD_SET(public var fd_count: UInt = 0u, public var fd_array: ULongArray = ULongArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FD_SET) return false
        if (this.fd_count != other.fd_count) return false
        if (!this.fd_array.contentEquals(other.fd_array)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fd_count.hashCode()
        result = 31 * result + this.fd_array.contentHashCode()
        return result
    }
}

public data class FLOWSPEC(
    public var TokenRate: UInt = 0u,
    public var TokenBucketSize: UInt = 0u,
    public var PeakBandwidth: UInt = 0u,
    public var Latency: UInt = 0u,
    public var DelayVariation: UInt = 0u,
    public var ServiceType: UInt = 0u,
    public var MaxSduSize: UInt = 0u,
    public var MinimumPolicedSize: UInt = 0u,
)

public data class GROUP_FILTER(
    public var gf_interface: UInt = 0u,
    public var gf_group: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var gf_fmode: MULTICAST_MODE_TYPE = 0,
    public var gf_numsrc: UInt = 0u,
    public var gf_slist: List<SOCKADDR_STORAGE> = List(1) { SOCKADDR_STORAGE() },
)

public data class GROUP_REQ(public var gr_interface: UInt = 0u, public var gr_group: SOCKADDR_STORAGE = SOCKADDR_STORAGE())

public data class GROUP_SOURCE_REQ(
    public var gsr_interface: UInt = 0u,
    public var gsr_group: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var gsr_source: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
)

public data class HOSTENT(
    public var h_name: PSTR = 0L,
    public var h_aliases: Long = 0L,
    public var h_addrtype: Short = 0,
    public var h_length: Short = 0,
    public var h_addr_list: Long = 0L,
)

public data class ICMPV4_ADDRESS_MASK_MESSAGE(public var Header: ICMP_MESSAGE = ICMP_MESSAGE(), public var AddressMask: UInt = 0u)

public data class ICMPV4_ROUTER_ADVERT_ENTRY(public var RouterAdvertAddr: IN_ADDR = IN_ADDR(), public var PreferenceLevel: Int = 0)

public data class ICMPV4_ROUTER_ADVERT_HEADER(public var RaHeader: ICMP_MESSAGE = ICMP_MESSAGE())

public data class ICMPV4_ROUTER_SOLICIT(public var RsHeader: ICMP_MESSAGE = ICMP_MESSAGE())

public data class ICMPV4_TIMESTAMP_MESSAGE(
    public var Header: ICMP_MESSAGE = ICMP_MESSAGE(),
    public var OriginateTimestamp: UInt = 0u,
    public var ReceiveTimestamp: UInt = 0u,
    public var TransmitTimestamp: UInt = 0u,
)

public data class ICMP_ERROR_INFO(
    public var srcaddress: SOCKADDR_INET = SOCKADDR_INET(),
    public var protocol: IPPROTO = 0,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
)

public data class ICMP_HEADER(
    public var Type: UByte = 0u,
    public var Code: UByte = 0u,
    public var Checksum: UShort = 0u,
)

public data class ICMP_MESSAGE(public var Header: ICMP_HEADER = ICMP_HEADER(), public var Data: ICMP_MESSAGE_0 = ICMP_MESSAGE_0())

public data class ICMP_MESSAGE_0(
    public var Data32: UIntArray = UIntArray(1),
    public var Data16: UShortArray = UShortArray(2),
    public var Data8: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ICMP_MESSAGE_0) return false
        if (!this.Data32.contentEquals(other.Data32)) return false
        if (!this.Data16.contentEquals(other.Data16)) return false
        if (!this.Data8.contentEquals(other.Data8)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Data32.contentHashCode()
        result = 31 * result + this.Data16.contentHashCode()
        result = 31 * result + this.Data8.contentHashCode()
        return result
    }
}

public data class IGMPV3_QUERY_HEADER(
    public var Type: UByte = 0u,
    public var Anonymous1: IGMPV3_QUERY_HEADER_0 = IGMPV3_QUERY_HEADER_0(),
    public var Checksum: UShort = 0u,
    public var MulticastAddress: IN_ADDR = IN_ADDR(),
    public var _bitfield: UByte = 0u,
    public var Anonymous2: IGMPV3_QUERY_HEADER_1 = IGMPV3_QUERY_HEADER_1(),
    public var SourceCount: UShort = 0u,
)

public data class IGMPV3_QUERY_HEADER_0(public var MaxRespCode: UByte = 0u, public var Anonymous: IGMPV3_QUERY_HEADER_0_0 = IGMPV3_QUERY_HEADER_0_0())

public data class IGMPV3_QUERY_HEADER_0_0(public var _bitfield: UByte = 0u)

public data class IGMPV3_QUERY_HEADER_1(public var QueriersQueryInterfaceCode: UByte = 0u, public var Anonymous: IGMPV3_QUERY_HEADER_1_0 = IGMPV3_QUERY_HEADER_1_0())

public data class IGMPV3_QUERY_HEADER_1_0(public var _bitfield: UByte = 0u)

public data class IGMPV3_REPORT_HEADER(
    public var Type: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Checksum: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var RecordCount: UShort = 0u,
)

public data class IGMPV3_REPORT_RECORD_HEADER(
    public var Type: UByte = 0u,
    public var AuxillaryDataLength: UByte = 0u,
    public var SourceCount: UShort = 0u,
    public var MulticastAddress: IN_ADDR = IN_ADDR(),
)

public data class IGMP_HEADER(
    public var Anonymous1: IGMP_HEADER_0 = IGMP_HEADER_0(),
    public var Anonymous2: IGMP_HEADER_1 = IGMP_HEADER_1(),
    public var Checksum: UShort = 0u,
    public var MulticastAddress: IN_ADDR = IN_ADDR(),
)

public data class IGMP_HEADER_0(public var Anonymous: IGMP_HEADER_0_0 = IGMP_HEADER_0_0(), public var VersionType: UByte = 0u)

public data class IGMP_HEADER_0_0(public var _bitfield: UByte = 0u)

public data class IGMP_HEADER_1(
    public var Reserved: UByte = 0u,
    public var MaxRespTime: UByte = 0u,
    public var Code: UByte = 0u,
)

public data class IN6_ADDR(public var u: IN6_ADDR_0 = IN6_ADDR_0())

public data class IN6_ADDR_0(public var Byte: UByteArray = UByteArray(16), public var Word: UShortArray = UShortArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IN6_ADDR_0) return false
        if (!this.Byte.contentEquals(other.Byte)) return false
        if (!this.Word.contentEquals(other.Word)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Byte.contentHashCode()
        result = 31 * result + this.Word.contentHashCode()
        return result
    }
}

public data class IN6_PKTINFO(public var ipi6_addr: IN6_ADDR = IN6_ADDR(), public var ipi6_ifindex: UInt = 0u)

public data class IN6_PKTINFO_EX(public var pkt_info: IN6_PKTINFO = IN6_PKTINFO(), public var scope_id: SCOPE_ID = SCOPE_ID())

public data class INET_PORT_RANGE(public var StartPort: UShort = 0u, public var NumberOfPorts: UShort = 0u)

public data class INET_PORT_RESERVATION_INFORMATION(public var OwningPid: UInt = 0u)

public data class INET_PORT_RESERVATION_INSTANCE(public var Reservation: INET_PORT_RANGE = INET_PORT_RANGE(), public var Token: INET_PORT_RESERVATION_TOKEN = INET_PORT_RESERVATION_TOKEN())

public data class INET_PORT_RESERVATION_TOKEN(public var Token: ULong = 0uL)

public data class INTERFACE_INFO(
    public var iiFlags: UInt = 0u,
    public var iiAddress: sockaddr_gen = sockaddr_gen(),
    public var iiBroadcastAddress: sockaddr_gen = sockaddr_gen(),
    public var iiNetmask: sockaddr_gen = sockaddr_gen(),
)

public data class INTERFACE_INFO_EX(
    public var iiFlags: UInt = 0u,
    public var iiAddress: SOCKET_ADDRESS = SOCKET_ADDRESS(),
    public var iiBroadcastAddress: SOCKET_ADDRESS = SOCKET_ADDRESS(),
    public var iiNetmask: SOCKET_ADDRESS = SOCKET_ADDRESS(),
)

public data class IN_ADDR(public var S_un: IN_ADDR_0 = IN_ADDR_0())

public data class IN_ADDR_0(
    public var S_un_b: IN_ADDR_0_0 = IN_ADDR_0_0(),
    public var S_un_w: IN_ADDR_0_1 = IN_ADDR_0_1(),
    public var S_addr: UInt = 0u,
)

public data class IN_ADDR_0_0(
    public var s_b1: UByte = 0u,
    public var s_b2: UByte = 0u,
    public var s_b3: UByte = 0u,
    public var s_b4: UByte = 0u,
)

public data class IN_ADDR_0_1(public var s_w1: UShort = 0u, public var s_w2: UShort = 0u)

public data class IN_PKTINFO(public var ipi_addr: IN_ADDR = IN_ADDR(), public var ipi_ifindex: UInt = 0u)

public data class IN_PKTINFO_EX(public var pkt_info: IN_PKTINFO = IN_PKTINFO(), public var scope_id: SCOPE_ID = SCOPE_ID())

public data class IN_RECVERR(
    public var protocol: IPPROTO = 0,
    public var info: UInt = 0u,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
)

public data class IPTLS_METADATA(public var SequenceNumber: ULong = 0uL)

public data class IPV4_HEADER(
    public var Anonymous1: IPV4_HEADER_0 = IPV4_HEADER_0(),
    public var Anonymous2: IPV4_HEADER_1 = IPV4_HEADER_1(),
    public var TotalLength: UShort = 0u,
    public var Identification: UShort = 0u,
    public var Anonymous3: IPV4_HEADER_2 = IPV4_HEADER_2(),
    public var TimeToLive: UByte = 0u,
    public var Protocol: UByte = 0u,
    public var HeaderChecksum: UShort = 0u,
    public var SourceAddress: IN_ADDR = IN_ADDR(),
    public var DestinationAddress: IN_ADDR = IN_ADDR(),
)

public data class IPV4_HEADER_0(public var VersionAndHeaderLength: UByte = 0u, public var Anonymous: IPV4_HEADER_0_0 = IPV4_HEADER_0_0())

public data class IPV4_HEADER_0_0(public var _bitfield: UByte = 0u)

public data class IPV4_HEADER_1(public var TypeOfServiceAndEcnField: UByte = 0u, public var Anonymous: IPV4_HEADER_1_0 = IPV4_HEADER_1_0())

public data class IPV4_HEADER_1_0(public var _bitfield: UByte = 0u)

public data class IPV4_HEADER_2(public var FlagsAndOffset: UShort = 0u, public var Anonymous: IPV4_HEADER_2_0 = IPV4_HEADER_2_0())

public data class IPV4_HEADER_2_0(public var _bitfield: UShort = 0u)

public data class IPV4_OPTION_HEADER(public var Anonymous: IPV4_OPTION_HEADER_0 = IPV4_OPTION_HEADER_0(), public var OptionLength: UByte = 0u)

public data class IPV4_OPTION_HEADER_0(public var OptionType: UByte = 0u, public var Anonymous: IPV4_OPTION_HEADER_0_0 = IPV4_OPTION_HEADER_0_0())

public data class IPV4_OPTION_HEADER_0_0(public var _bitfield: UByte = 0u)

public data class IPV4_ROUTING_HEADER(public var OptionHeader: IPV4_OPTION_HEADER = IPV4_OPTION_HEADER(), public var Pointer: UByte = 0u)

public data class IPV4_TIMESTAMP_OPTION(
    public var OptionHeader: IPV4_OPTION_HEADER = IPV4_OPTION_HEADER(),
    public var Pointer: UByte = 0u,
    public var Anonymous: IPV4_TIMESTAMP_OPTION_0 = IPV4_TIMESTAMP_OPTION_0(),
)

public data class IPV4_TIMESTAMP_OPTION_0(public var FlagsOverflow: UByte = 0u, public var Anonymous: IPV4_TIMESTAMP_OPTION_0_0 = IPV4_TIMESTAMP_OPTION_0_0())

public data class IPV4_TIMESTAMP_OPTION_0_0(public var _bitfield: UByte = 0u)

public data class IPV6_EXTENSION_HEADER(public var NextHeader: UByte = 0u, public var Length: UByte = 0u)

public data class IPV6_FRAGMENT_HEADER(
    public var NextHeader: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Anonymous: IPV6_FRAGMENT_HEADER_0 = IPV6_FRAGMENT_HEADER_0(),
    public var Id: UInt = 0u,
)

public data class IPV6_FRAGMENT_HEADER_0(public var Anonymous: IPV6_FRAGMENT_HEADER_0_0 = IPV6_FRAGMENT_HEADER_0_0(), public var OffsetAndFlags: UShort = 0u)

public data class IPV6_FRAGMENT_HEADER_0_0(public var _bitfield: UShort = 0u)

public data class IPV6_HEADER(
    public var Anonymous: IPV6_HEADER_0 = IPV6_HEADER_0(),
    public var PayloadLength: UShort = 0u,
    public var NextHeader: UByte = 0u,
    public var HopLimit: UByte = 0u,
    public var SourceAddress: IN6_ADDR = IN6_ADDR(),
    public var DestinationAddress: IN6_ADDR = IN6_ADDR(),
)

public data class IPV6_HEADER_0(public var VersionClassFlow: UInt = 0u, public var Anonymous: IPV6_HEADER_0_0 = IPV6_HEADER_0_0())

public data class IPV6_HEADER_0_0(public var _bitfield: UInt = 0u)

public data class IPV6_MREQ(public var ipv6mr_multiaddr: IN6_ADDR = IN6_ADDR(), public var ipv6mr_interface: UInt = 0u)

public data class IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS(public var Anonymous: IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0 = IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0(), public var Value: UInt = 0u)

public data class IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0(public var _bitfield: UByte = 0u, public var Reserved2: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class IPV6_OPTION_HEADER(public var Type: UByte = 0u, public var DataLength: UByte = 0u)

public data class IPV6_OPTION_JUMBOGRAM(public var Header: IPV6_OPTION_HEADER = IPV6_OPTION_HEADER(), public var JumbogramLength: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPV6_OPTION_JUMBOGRAM) return false
        if (this.Header != other.Header) return false
        if (!this.JumbogramLength.contentEquals(other.JumbogramLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.JumbogramLength.contentHashCode()
        return result
    }
}

public data class IPV6_OPTION_ROUTER_ALERT(public var Header: IPV6_OPTION_HEADER = IPV6_OPTION_HEADER(), public var Value: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPV6_OPTION_ROUTER_ALERT) return false
        if (this.Header != other.Header) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.Value.contentHashCode()
        return result
    }
}

public data class IPV6_ROUTER_ADVERTISEMENT_FLAGS(public var Anonymous: IPV6_ROUTER_ADVERTISEMENT_FLAGS_0 = IPV6_ROUTER_ADVERTISEMENT_FLAGS_0(), public var Value: UByte = 0u)

public data class IPV6_ROUTER_ADVERTISEMENT_FLAGS_0(public var _bitfield: UByte = 0u)

public data class IPV6_ROUTING_HEADER(
    public var NextHeader: UByte = 0u,
    public var Length: UByte = 0u,
    public var RoutingType: UByte = 0u,
    public var SegmentsLeft: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPV6_ROUTING_HEADER) return false
        if (this.NextHeader != other.NextHeader) return false
        if (this.Length != other.Length) return false
        if (this.RoutingType != other.RoutingType) return false
        if (this.SegmentsLeft != other.SegmentsLeft) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextHeader.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.RoutingType.hashCode()
        result = 31 * result + this.SegmentsLeft.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class IPX_ADDRESS_DATA(
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
        if (other !is IPX_ADDRESS_DATA) return false
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

public data class IPX_NETNUM_DATA(
    public var netnum: UByteArray = UByteArray(4),
    public var hopcount: UShort = 0u,
    public var netdelay: UShort = 0u,
    public var cardnum: Int = 0,
    public var router: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPX_NETNUM_DATA) return false
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

public class IPX_SPXCONNSTATUS_DATA(
    public var ConnectionState: UByte = 0u,
    public var WatchDogActive: UByte = 0u,
    public var LocalConnectionId: UShort = 0u,
    public var RemoteConnectionId: UShort = 0u,
    public var LocalSequenceNumber: UShort = 0u,
    public var LocalAckNumber: UShort = 0u,
    public var LocalAllocNumber: UShort = 0u,
    public var RemoteAckNumber: UShort = 0u,
    public var RemoteAllocNumber: UShort = 0u,
    public var LocalSocket: UShort = 0u,
    public var ImmediateAddress: UByteArray = UByteArray(6),
    public var RemoteNetwork: UByteArray = UByteArray(4),
    public var RemoteNode: UByteArray = UByteArray(6),
    public var RemoteSocket: UShort = 0u,
    public var RetransmissionCount: UShort = 0u,
    public var EstimatedRoundTripDelay: UShort = 0u,
    public var RetransmittedPackets: UShort = 0u,
    public var SuppressedPacket: UShort = 0u,
)

public data class IP_MREQ(public var imr_multiaddr: IN_ADDR = IN_ADDR(), public var imr_interface: IN_ADDR = IN_ADDR())

public data class IP_MREQ_SOURCE(
    public var imr_multiaddr: IN_ADDR = IN_ADDR(),
    public var imr_sourceaddr: IN_ADDR = IN_ADDR(),
    public var imr_interface: IN_ADDR = IN_ADDR(),
)

public data class IP_MSFILTER(
    public var imsf_multiaddr: IN_ADDR = IN_ADDR(),
    public var imsf_interface: IN_ADDR = IN_ADDR(),
    public var imsf_fmode: MULTICAST_MODE_TYPE = 0,
    public var imsf_numsrc: UInt = 0u,
    public var imsf_slist: List<IN_ADDR> = List(1) { IN_ADDR() },
)

public data class LINGER(public var l_onoff: UShort = 0u, public var l_linger: UShort = 0u)

public data class LM_IRPARMS(
    public var nTXDataBytes: UInt = 0u,
    public var nRXDataBytes: UInt = 0u,
    public var nBaudRate: UInt = 0u,
    public var thresholdTime: UInt = 0u,
    public var discTime: UInt = 0u,
    public var nMSLinkTurn: UShort = 0u,
    public var nTXPackets: UByte = 0u,
    public var nRXPackets: UByte = 0u,
)

public data class MLDV2_QUERY_HEADER(
    public var IcmpHeader: ICMP_HEADER = ICMP_HEADER(),
    public var Anonymous1: MLDV2_QUERY_HEADER_0 = MLDV2_QUERY_HEADER_0(),
    public var Reserved: UShort = 0u,
    public var MulticastAddress: IN6_ADDR = IN6_ADDR(),
    public var _bitfield: UByte = 0u,
    public var Anonymous2: MLDV2_QUERY_HEADER_1 = MLDV2_QUERY_HEADER_1(),
    public var SourceCount: UShort = 0u,
)

public data class MLDV2_QUERY_HEADER_0(public var MaxRespCode: UShort = 0u, public var Anonymous: MLDV2_QUERY_HEADER_0_0 = MLDV2_QUERY_HEADER_0_0())

public data class MLDV2_QUERY_HEADER_0_0(public var _bitfield: UShort = 0u)

public data class MLDV2_QUERY_HEADER_1(public var QueriersQueryInterfaceCode: UByte = 0u, public var Anonymous: MLDV2_QUERY_HEADER_1_0 = MLDV2_QUERY_HEADER_1_0())

public data class MLDV2_QUERY_HEADER_1_0(public var _bitfield: UByte = 0u)

public data class MLDV2_REPORT_HEADER(
    public var IcmpHeader: ICMP_HEADER = ICMP_HEADER(),
    public var Reserved: UShort = 0u,
    public var RecordCount: UShort = 0u,
)

public data class MLDV2_REPORT_RECORD_HEADER(
    public var Type: UByte = 0u,
    public var AuxillaryDataLength: UByte = 0u,
    public var SourceCount: UShort = 0u,
    public var MulticastAddress: IN6_ADDR = IN6_ADDR(),
)

public data class MLD_HEADER(
    public var IcmpHeader: ICMP_HEADER = ICMP_HEADER(),
    public var MaxRespTime: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var MulticastAddress: IN6_ADDR = IN6_ADDR(),
)

public data class NAPI_DOMAIN_DESCRIPTION_BLOB(
    public var AuthLevel: UInt = 0u,
    public var cchDomainName: UInt = 0u,
    public var OffsetNextDomainDescription: UInt = 0u,
    public var OffsetThisDomainName: UInt = 0u,
)

public data class NAPI_PROVIDER_INSTALLATION_BLOB(
    public var dwVersion: UInt = 0u,
    public var dwProviderType: UInt = 0u,
    public var fSupportsWildCard: UInt = 0u,
    public var cDomains: UInt = 0u,
    public var OffsetFirstDomain: UInt = 0u,
)

public data class ND_NEIGHBOR_ADVERT_HEADER(public var nd_na_hdr: ICMP_MESSAGE = ICMP_MESSAGE(), public var nd_na_target: IN6_ADDR = IN6_ADDR())

public data class ND_NEIGHBOR_SOLICIT_HEADER(public var nd_ns_hdr: ICMP_MESSAGE = ICMP_MESSAGE(), public var nd_ns_target: IN6_ADDR = IN6_ADDR())

public data class ND_OPTION_DNSSL(
    public var nd_opt_dnssl_type: UByte = 0u,
    public var nd_opt_dnssl_len: UByte = 0u,
    public var nd_opt_dnssl_reserved: UShort = 0u,
    public var nd_opt_dnssl_lifetime: UInt = 0u,
)

public data class ND_OPTION_HDR(public var nd_opt_type: UByte = 0u, public var nd_opt_len: UByte = 0u)

public data class ND_OPTION_MTU(
    public var nd_opt_mtu_type: UByte = 0u,
    public var nd_opt_mtu_len: UByte = 0u,
    public var nd_opt_mtu_reserved: UShort = 0u,
    public var nd_opt_mtu_mtu: UInt = 0u,
)

public data class ND_OPTION_PREFIX_INFO(
    public var nd_opt_pi_type: UByte = 0u,
    public var nd_opt_pi_len: UByte = 0u,
    public var nd_opt_pi_prefix_len: UByte = 0u,
    public var Anonymous1: ND_OPTION_PREFIX_INFO_0 = ND_OPTION_PREFIX_INFO_0(),
    public var nd_opt_pi_valid_time: UInt = 0u,
    public var nd_opt_pi_preferred_time: UInt = 0u,
    public var Anonymous2: ND_OPTION_PREFIX_INFO_1 = ND_OPTION_PREFIX_INFO_1(),
    public var nd_opt_pi_prefix: IN6_ADDR = IN6_ADDR(),
)

public data class ND_OPTION_PREFIX_INFO_0(public var nd_opt_pi_flags_reserved: UByte = 0u, public var Flags: ND_OPTION_PREFIX_INFO_0_0 = ND_OPTION_PREFIX_INFO_0_0())

public data class ND_OPTION_PREFIX_INFO_0_0(public var _bitfield: UByte = 0u)

public data class ND_OPTION_PREFIX_INFO_1(public var nd_opt_pi_reserved2: UInt = 0u, public var Anonymous: ND_OPTION_PREFIX_INFO_1_0 = ND_OPTION_PREFIX_INFO_1_0())

public data class ND_OPTION_PREFIX_INFO_1_0(public var nd_opt_pi_reserved3: UByteArray = UByteArray(3), public var nd_opt_pi_site_prefix_len: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ND_OPTION_PREFIX_INFO_1_0) return false
        if (!this.nd_opt_pi_reserved3.contentEquals(other.nd_opt_pi_reserved3)) return false
        if (this.nd_opt_pi_site_prefix_len != other.nd_opt_pi_site_prefix_len) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nd_opt_pi_reserved3.contentHashCode()
        result = 31 * result + this.nd_opt_pi_site_prefix_len.hashCode()
        return result
    }
}

public data class ND_OPTION_RDNSS(
    public var nd_opt_rdnss_type: UByte = 0u,
    public var nd_opt_rdnss_len: UByte = 0u,
    public var nd_opt_rdnss_reserved: UShort = 0u,
    public var nd_opt_rdnss_lifetime: UInt = 0u,
)

public data class ND_OPTION_RD_HDR(
    public var nd_opt_rh_type: UByte = 0u,
    public var nd_opt_rh_len: UByte = 0u,
    public var nd_opt_rh_reserved1: UShort = 0u,
    public var nd_opt_rh_reserved2: UInt = 0u,
)

public data class ND_OPTION_ROUTE_INFO(
    public var nd_opt_ri_type: UByte = 0u,
    public var nd_opt_ri_len: UByte = 0u,
    public var nd_opt_ri_prefix_len: UByte = 0u,
    public var Anonymous: ND_OPTION_ROUTE_INFO_0 = ND_OPTION_ROUTE_INFO_0(),
    public var nd_opt_ri_route_lifetime: UInt = 0u,
    public var nd_opt_ri_prefix: IN6_ADDR = IN6_ADDR(),
)

public data class ND_OPTION_ROUTE_INFO_0(public var nd_opt_ri_flags_reserved: UByte = 0u, public var Flags: ND_OPTION_ROUTE_INFO_0_0 = ND_OPTION_ROUTE_INFO_0_0())

public data class ND_OPTION_ROUTE_INFO_0_0(public var _bitfield: UByte = 0u)

public data class ND_REDIRECT_HEADER(
    public var nd_rd_hdr: ICMP_MESSAGE = ICMP_MESSAGE(),
    public var nd_rd_target: IN6_ADDR = IN6_ADDR(),
    public var nd_rd_dst: IN6_ADDR = IN6_ADDR(),
)

public data class ND_ROUTER_ADVERT_HEADER(
    public var nd_ra_hdr: ICMP_MESSAGE = ICMP_MESSAGE(),
    public var nd_ra_reachable: UInt = 0u,
    public var nd_ra_retransmit: UInt = 0u,
)

public data class ND_ROUTER_SOLICIT_HEADER(public var nd_rs_hdr: ICMP_MESSAGE = ICMP_MESSAGE())

public data class NETRESOURCE2A(
    public var dwScope: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var dwDisplayType: UInt = 0u,
    public var lpLocalName: PSTR = 0L,
    public var lpRemoteName: PSTR = 0L,
    public var lpComment: PSTR = 0L,
    public var ns_info: NS_INFOA = NS_INFOA(),
    public var ServiceType: GUID = GUID(),
    public var dwProtocols: UInt = 0u,
    public var lpiProtocols: Long = 0L,
)

public data class NETRESOURCE2W(
    public var dwScope: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var dwDisplayType: UInt = 0u,
    public var lpLocalName: PWSTR = 0L,
    public var lpRemoteName: PWSTR = 0L,
    public var lpComment: PWSTR = 0L,
    public var ns_info: NS_INFOA = NS_INFOA(),
    public var ServiceType: GUID = GUID(),
    public var dwProtocols: UInt = 0u,
    public var lpiProtocols: Long = 0L,
)

public data class NLA_BLOB(public var header: NLA_BLOB_0 = NLA_BLOB_0(), public var data: NLA_BLOB_1 = NLA_BLOB_1())

public data class NLA_BLOB_1(
    public var rawData: ByteArray = ByteArray(1),
    public var interfaceData: NLA_BLOB_1_0 = NLA_BLOB_1_0(),
    public var locationData: NLA_BLOB_1_1 = NLA_BLOB_1_1(),
    public var connectivity: NLA_BLOB_1_2 = NLA_BLOB_1_2(),
    public var ICS: NLA_BLOB_1_3 = NLA_BLOB_1_3(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NLA_BLOB_1) return false
        if (!this.rawData.contentEquals(other.rawData)) return false
        if (this.interfaceData != other.interfaceData) return false
        if (this.locationData != other.locationData) return false
        if (this.connectivity != other.connectivity) return false
        if (this.ICS != other.ICS) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawData.contentHashCode()
        result = 31 * result + this.interfaceData.hashCode()
        result = 31 * result + this.locationData.hashCode()
        result = 31 * result + this.connectivity.hashCode()
        result = 31 * result + this.ICS.hashCode()
        return result
    }
}

public data class NLA_BLOB_1_3(public var remote: NLA_BLOB_1_3_0 = NLA_BLOB_1_3_0())

public data class NLA_BLOB_1_3_0(
    public var speed: UInt = 0u,
    public var type: UInt = 0u,
    public var state: UInt = 0u,
    public var machineName: UShortArray = UShortArray(256),
    public var sharedAdapterName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NLA_BLOB_1_3_0) return false
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

public data class NLA_BLOB_1_2(public var type: NLA_CONNECTIVITY_TYPE = 0, public var internet: NLA_INTERNET = 0)

public data class NLA_BLOB_1_0(
    public var dwType: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var adapterName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NLA_BLOB_1_0) return false
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

public data class NLA_BLOB_1_1(public var information: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NLA_BLOB_1_1) return false
        if (!this.information.contentEquals(other.information)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.information.contentHashCode()
    }
}

public data class NLA_BLOB_0(
    public var type: NLA_BLOB_DATA_TYPE = 0,
    public var dwSize: UInt = 0u,
    public var nextOffset: UInt = 0u,
)

public data class NL_BANDWIDTH_INFORMATION(
    public var Bandwidth: ULong = 0uL,
    public var Instability: ULong = 0uL,
    public var BandwidthPeaked: Boolean = false,
)

public data class NL_INTERFACE_OFFLOAD_ROD(public var _bitfield: UByte = 0u)

public data class NL_NETWORK_CONNECTIVITY_HINT(
    public var ConnectivityLevel: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 0,
    public var ConnectivityCost: NL_NETWORK_CONNECTIVITY_COST_HINT = 0,
    public var ApproachingDataLimit: Boolean = false,
    public var OverDataLimit: Boolean = false,
    public var Roaming: Boolean = false,
)

public data class NL_PATH_BANDWIDTH_ROD(
    public var Bandwidth: ULong = 0uL,
    public var Instability: ULong = 0uL,
    public var BandwidthPeaked: Boolean = false,
)

public data class NPI_MODULEID(
    public var Length: UShort = 0u,
    public var Type: NPI_MODULEID_TYPE = 0,
    public var Anonymous: NPI_MODULEID_0 = NPI_MODULEID_0(),
)

public data class NPI_MODULEID_0(public var Guid: GUID = GUID(), public var IfLuid: LUID = LUID())

public data class NSPV2_ROUTINE(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var NSPv2Startup: LPNSPV2STARTUP = null,
    public var NSPv2Cleanup: LPNSPV2CLEANUP = null,
    public var NSPv2LookupServiceBegin: LPNSPV2LOOKUPSERVICEBEGIN = null,
    public var NSPv2LookupServiceNextEx: LPNSPV2LOOKUPSERVICENEXTEX = null,
    public var NSPv2LookupServiceEnd: LPNSPV2LOOKUPSERVICEEND = null,
    public var NSPv2SetServiceEx: LPNSPV2SETSERVICEEX = null,
    public var NSPv2ClientSessionRundown: LPNSPV2CLIENTSESSIONRUNDOWN = null,
)

public data class NSP_ROUTINE(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var NSPCleanup: LPNSPCLEANUP = null,
    public var NSPLookupServiceBegin: LPNSPLOOKUPSERVICEBEGIN = null,
    public var NSPLookupServiceNext: LPNSPLOOKUPSERVICENEXT = null,
    public var NSPLookupServiceEnd: LPNSPLOOKUPSERVICEEND = null,
    public var NSPSetService: LPNSPSETSERVICE = null,
    public var NSPInstallServiceClass: LPNSPINSTALLSERVICECLASS = null,
    public var NSPRemoveServiceClass: LPNSPREMOVESERVICECLASS = null,
    public var NSPGetServiceClassInfo: LPNSPGETSERVICECLASSINFO = null,
    public var NSPIoctl: LPNSPIOCTL = null,
)

public data class NS_INFOA(
    public var dwNameSpace: UInt = 0u,
    public var dwNameSpaceFlags: UInt = 0u,
    public var lpNameSpace: PSTR = 0L,
)

public data class NS_INFOW(
    public var dwNameSpace: UInt = 0u,
    public var dwNameSpaceFlags: UInt = 0u,
    public var lpNameSpace: PWSTR = 0L,
)

public data class NS_SERVICE_INFOA(public var dwNameSpace: UInt = 0u, public var ServiceInfo: SERVICE_INFOA = SERVICE_INFOA())

public data class NS_SERVICE_INFOW(public var dwNameSpace: UInt = 0u, public var ServiceInfo: SERVICE_INFOW = SERVICE_INFOW())

public data class PRIORITY_STATUS(public var Sender: SOCKET_PRIORITY_HINT = 0, public var Receiver: SOCKET_PRIORITY_HINT = 0)

public data class PROTOCOL_INFOA(
    public var dwServiceFlags: UInt = 0u,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var lpProtocol: PSTR = 0L,
)

public data class PROTOCOL_INFOW(
    public var dwServiceFlags: UInt = 0u,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var lpProtocol: PWSTR = 0L,
)

public data class PROTOENT(
    public var p_name: PSTR = 0L,
    public var p_aliases: Long = 0L,
    public var p_proto: Short = 0,
)

public data class Q2931_IE(
    public var IEType: Q2931_IE_TYPE = 0,
    public var IELength: UInt = 0u,
    public var IE: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Q2931_IE) return false
        if (this.IEType != other.IEType) return false
        if (this.IELength != other.IELength) return false
        if (!this.IE.contentEquals(other.IE)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IEType.hashCode()
        result = 31 * result + this.IELength.hashCode()
        result = 31 * result + this.IE.contentHashCode()
        return result
    }
}

public data class QOS(
    public var SendingFlowspec: FLOWSPEC = FLOWSPEC(),
    public var ReceivingFlowspec: FLOWSPEC = FLOWSPEC(),
    public var ProviderSpecific: WSABUF = WSABUF(),
)

public data class RCVALL_IF(public var Mode: RCVALL_VALUE = 0, public var Interface: UInt = 0u)

public data class REAL_TIME_NOTIFICATION_SETTING_INPUT(public var TransportSettingId: TRANSPORT_SETTING_ID = TRANSPORT_SETTING_ID(), public var BrokerEventGuid: GUID = GUID())

public data class REAL_TIME_NOTIFICATION_SETTING_INPUT_EX(
    public var TransportSettingId: TRANSPORT_SETTING_ID = TRANSPORT_SETTING_ID(),
    public var BrokerEventGuid: GUID = GUID(),
    public var Unmark: Boolean = false,
)

public data class REAL_TIME_NOTIFICATION_SETTING_OUTPUT(public var ChannelStatus: CONTROL_CHANNEL_TRIGGER_STATUS = 0)

public data class RIORESULT(
    public var Status: Int = 0,
    public var BytesTransferred: UInt = 0u,
    public var SocketContext: ULong = 0uL,
    public var RequestContext: ULong = 0uL,
)

public data class RIO_BUF(
    public var BufferId: RIO_BUFFERID = 0L,
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
)

public data class RIO_CMSG_BUFFER(public var TotalLength: UInt = 0u)

public data class RIO_EXTENSION_FUNCTION_TABLE(
    public var cbSize: UInt = 0u,
    public var RIOReceive: LPFN_RIORECEIVE = null,
    public var RIOReceiveEx: LPFN_RIORECEIVEEX = null,
    public var RIOSend: LPFN_RIOSEND = null,
    public var RIOSendEx: LPFN_RIOSENDEX = null,
    public var RIOCloseCompletionQueue: LPFN_RIOCLOSECOMPLETIONQUEUE = null,
    public var RIOCreateCompletionQueue: LPFN_RIOCREATECOMPLETIONQUEUE = null,
    public var RIOCreateRequestQueue: LPFN_RIOCREATEREQUESTQUEUE = null,
    public var RIODequeueCompletion: LPFN_RIODEQUEUECOMPLETION = null,
    public var RIODeregisterBuffer: LPFN_RIODEREGISTERBUFFER = null,
    public var RIONotify: LPFN_RIONOTIFY = null,
    public var RIORegisterBuffer: LPFN_RIOREGISTERBUFFER = null,
    public var RIOResizeCompletionQueue: LPFN_RIORESIZECOMPLETIONQUEUE = null,
    public var RIOResizeRequestQueue: LPFN_RIORESIZEREQUESTQUEUE = null,
)

public data class RIO_NOTIFICATION_COMPLETION(public var Type: RIO_NOTIFICATION_COMPLETION_TYPE = 0, public var Anonymous: RIO_NOTIFICATION_COMPLETION_0 = RIO_NOTIFICATION_COMPLETION_0())

public data class RIO_NOTIFICATION_COMPLETION_0(public var Event: RIO_NOTIFICATION_COMPLETION_0_0 = RIO_NOTIFICATION_COMPLETION_0_0(), public var Iocp: RIO_NOTIFICATION_COMPLETION_0_1 = RIO_NOTIFICATION_COMPLETION_0_1())

public data class RIO_NOTIFICATION_COMPLETION_0_0(public var EventHandle: HANDLE = 0L, public var NotifyReset: BOOL = 0)

public data class RIO_NOTIFICATION_COMPLETION_0_1(
    public var IocpHandle: HANDLE = 0L,
    public var CompletionKey: Long = 0L,
    public var Overlapped: Long = 0L,
)

public data class RM_FEC_INFO(
    public var FECBlockSize: UShort = 0u,
    public var FECProActivePackets: UShort = 0u,
    public var FECGroupSize: UByte = 0u,
    public var fFECOnDemandParityEnabled: Boolean = false,
)

public class RM_RECEIVER_STATS(
    public var NumODataPacketsReceived: ULong = 0uL,
    public var NumRDataPacketsReceived: ULong = 0uL,
    public var NumDuplicateDataPackets: ULong = 0uL,
    public var DataBytesReceived: ULong = 0uL,
    public var TotalBytesReceived: ULong = 0uL,
    public var RateKBitsPerSecOverall: ULong = 0uL,
    public var RateKBitsPerSecLast: ULong = 0uL,
    public var TrailingEdgeSeqId: ULong = 0uL,
    public var LeadingEdgeSeqId: ULong = 0uL,
    public var AverageSequencesInWindow: ULong = 0uL,
    public var MinSequencesInWindow: ULong = 0uL,
    public var MaxSequencesInWindow: ULong = 0uL,
    public var FirstNakSequenceNumber: ULong = 0uL,
    public var NumPendingNaks: ULong = 0uL,
    public var NumOutstandingNaks: ULong = 0uL,
    public var NumDataPacketsBuffered: ULong = 0uL,
    public var TotalSelectiveNaksSent: ULong = 0uL,
    public var TotalParityNaksSent: ULong = 0uL,
)

public data class RM_SENDER_STATS(
    public var DataBytesSent: ULong = 0uL,
    public var TotalBytesSent: ULong = 0uL,
    public var NaksReceived: ULong = 0uL,
    public var NaksReceivedTooLate: ULong = 0uL,
    public var NumOutstandingNaks: ULong = 0uL,
    public var NumNaksAfterRData: ULong = 0uL,
    public var RepairPacketsSent: ULong = 0uL,
    public var BufferSpaceAvailable: ULong = 0uL,
    public var TrailingEdgeSeqId: ULong = 0uL,
    public var LeadingEdgeSeqId: ULong = 0uL,
    public var RateKBitsPerSecOverall: ULong = 0uL,
    public var RateKBitsPerSecLast: ULong = 0uL,
    public var TotalODataPacketsSent: ULong = 0uL,
)

public data class RM_SEND_WINDOW(
    public var RateKbitsPerSec: UInt = 0u,
    public var WindowSizeInMSecs: UInt = 0u,
    public var WindowSizeInBytes: UInt = 0u,
)

public data class RSS_SCALABILITY_INFO(public var RssEnabled: Boolean = false)

public data class SCOPE_ID(public var Anonymous: SCOPE_ID_0 = SCOPE_ID_0())

public data class SCOPE_ID_0(public var Anonymous: SCOPE_ID_0_0 = SCOPE_ID_0_0(), public var Value: UInt = 0u)

public data class SCOPE_ID_0_0(public var _bitfield: UInt = 0u)

public data class SERVENT(
    public var s_name: PSTR = 0L,
    public var s_aliases: Long = 0L,
    public var s_proto: PSTR = 0L,
    public var s_port: Short = 0,
)

public data class SERVICE_ADDRESS(
    public var dwAddressType: UInt = 0u,
    public var dwAddressFlags: UInt = 0u,
    public var dwAddressLength: UInt = 0u,
    public var dwPrincipalLength: UInt = 0u,
    public var lpAddress: Long = 0L,
    public var lpPrincipal: Long = 0L,
)

public data class SERVICE_ADDRESSES(public var dwAddressCount: UInt = 0u, public var Addresses: List<SERVICE_ADDRESS> = List(1) { SERVICE_ADDRESS() })

public data class SERVICE_ASYNC_INFO(
    public var lpServiceCallbackProc: LPSERVICE_CALLBACK_PROC = null,
    public var lParam: LPARAM = 0L,
    public var hAsyncTaskHandle: HANDLE = 0L,
)

public data class SERVICE_INFOA(
    public var lpServiceType: Long = 0L,
    public var lpServiceName: PSTR = 0L,
    public var lpComment: PSTR = 0L,
    public var lpLocale: PSTR = 0L,
    public var dwDisplayHint: RESOURCE_DISPLAY_TYPE = 0u,
    public var dwVersion: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var lpMachineName: PSTR = 0L,
    public var lpServiceAddress: Long = 0L,
    public var ServiceSpecificInfo: BLOB = BLOB(),
)

public data class SERVICE_INFOW(
    public var lpServiceType: Long = 0L,
    public var lpServiceName: PWSTR = 0L,
    public var lpComment: PWSTR = 0L,
    public var lpLocale: PWSTR = 0L,
    public var dwDisplayHint: RESOURCE_DISPLAY_TYPE = 0u,
    public var dwVersion: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var lpMachineName: PWSTR = 0L,
    public var lpServiceAddress: Long = 0L,
    public var ServiceSpecificInfo: BLOB = BLOB(),
)

public data class SERVICE_TYPE_INFO(
    public var dwTypeNameOffset: UInt = 0u,
    public var dwValueCount: UInt = 0u,
    public var Values: List<SERVICE_TYPE_VALUE> = List(1) { SERVICE_TYPE_VALUE() },
)

public data class SERVICE_TYPE_INFO_ABSA(
    public var lpTypeName: PSTR = 0L,
    public var dwValueCount: UInt = 0u,
    public var Values: List<SERVICE_TYPE_VALUE_ABSA> = List(1) { SERVICE_TYPE_VALUE_ABSA() },
)

public data class SERVICE_TYPE_INFO_ABSW(
    public var lpTypeName: PWSTR = 0L,
    public var dwValueCount: UInt = 0u,
    public var Values: List<SERVICE_TYPE_VALUE_ABSW> = List(1) { SERVICE_TYPE_VALUE_ABSW() },
)

public data class SERVICE_TYPE_VALUE(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var dwValueNameOffset: UInt = 0u,
    public var dwValueOffset: UInt = 0u,
)

public data class SERVICE_TYPE_VALUE_ABSA(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValueName: PSTR = 0L,
    public var lpValue: Long = 0L,
)

public data class SERVICE_TYPE_VALUE_ABSW(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValueName: PWSTR = 0L,
    public var lpValue: Long = 0L,
)

public data class SNAP_HEADER(
    public var Dsap: UByte = 0u,
    public var Ssap: UByte = 0u,
    public var Control: UByte = 0u,
    public var Oui: UByteArray = UByteArray(3),
    public var Type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SNAP_HEADER) return false
        if (this.Dsap != other.Dsap) return false
        if (this.Ssap != other.Ssap) return false
        if (this.Control != other.Control) return false
        if (!this.Oui.contentEquals(other.Oui)) return false
        if (this.Type != other.Type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Dsap.hashCode()
        result = 31 * result + this.Ssap.hashCode()
        result = 31 * result + this.Control.hashCode()
        result = 31 * result + this.Oui.contentHashCode()
        result = 31 * result + this.Type.hashCode()
        return result
    }
}

public data class SOCKADDR(public var sa_family: ADDRESS_FAMILY = 0u, public var sa_data: ByteArray = ByteArray(14)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR) return false
        if (this.sa_family != other.sa_family) return false
        if (!this.sa_data.contentEquals(other.sa_data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sa_family.hashCode()
        result = 31 * result + this.sa_data.contentHashCode()
        return result
    }
}

public data class SOCKADDR_ATM(
    public var satm_family: UShort = 0u,
    public var satm_number: ATM_ADDRESS = ATM_ADDRESS(),
    public var satm_blli: ATM_BLLI = ATM_BLLI(),
    public var satm_bhli: ATM_BHLI = ATM_BHLI(),
)

public data class SOCKADDR_DL(
    public var sdl_family: ADDRESS_FAMILY = 0u,
    public var sdl_data: UByteArray = UByteArray(8),
    public var sdl_zero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_DL) return false
        if (this.sdl_family != other.sdl_family) return false
        if (!this.sdl_data.contentEquals(other.sdl_data)) return false
        if (!this.sdl_zero.contentEquals(other.sdl_zero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdl_family.hashCode()
        result = 31 * result + this.sdl_data.contentHashCode()
        result = 31 * result + this.sdl_zero.contentHashCode()
        return result
    }
}

public data class SOCKADDR_IN(
    public var sin_family: ADDRESS_FAMILY = 0u,
    public var sin_port: UShort = 0u,
    public var sin_addr: IN_ADDR = IN_ADDR(),
    public var sin_zero: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_IN) return false
        if (this.sin_family != other.sin_family) return false
        if (this.sin_port != other.sin_port) return false
        if (this.sin_addr != other.sin_addr) return false
        if (!this.sin_zero.contentEquals(other.sin_zero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin_family.hashCode()
        result = 31 * result + this.sin_port.hashCode()
        result = 31 * result + this.sin_addr.hashCode()
        result = 31 * result + this.sin_zero.contentHashCode()
        return result
    }
}

public data class SOCKADDR_IN6(
    public var sin6_family: ADDRESS_FAMILY = 0u,
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: IN6_ADDR = IN6_ADDR(),
    public var Anonymous: SOCKADDR_IN6_0 = SOCKADDR_IN6_0(),
)

public data class SOCKADDR_IN6_0(public var sin6_scope_id: UInt = 0u, public var sin6_scope_struct: SCOPE_ID = SCOPE_ID())

public data class SOCKADDR_IN6_PAIR(public var SourceAddress: Long = 0L, public var DestinationAddress: Long = 0L)

public data class SOCKADDR_IN6_W2KSP1(
    public var sin6_family: Short = 0,
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: IN6_ADDR = IN6_ADDR(),
    public var sin6_scope_id: UInt = 0u,
)

public data class SOCKADDR_INET(
    public var Ipv4: SOCKADDR_IN = SOCKADDR_IN(),
    public var Ipv6: SOCKADDR_IN6 = SOCKADDR_IN6(),
    public var si_family: ADDRESS_FAMILY = 0u,
)

public data class SOCKADDR_IPX(
    public var sa_family: Short = 0,
    public var sa_netnum: ByteArray = ByteArray(4),
    public var sa_nodenum: ByteArray = ByteArray(6),
    public var sa_socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_IPX) return false
        if (this.sa_family != other.sa_family) return false
        if (!this.sa_netnum.contentEquals(other.sa_netnum)) return false
        if (!this.sa_nodenum.contentEquals(other.sa_nodenum)) return false
        if (this.sa_socket != other.sa_socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sa_family.hashCode()
        result = 31 * result + this.sa_netnum.contentHashCode()
        result = 31 * result + this.sa_nodenum.contentHashCode()
        result = 31 * result + this.sa_socket.hashCode()
        return result
    }
}

public data class SOCKADDR_IRDA(
    public var irdaAddressFamily: UShort = 0u,
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaServiceName: ByteArray = ByteArray(25),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_IRDA) return false
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

public data class SOCKADDR_NB(
    public var snb_family: Short = 0,
    public var snb_type: UShort = 0u,
    public var snb_name: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_NB) return false
        if (this.snb_family != other.snb_family) return false
        if (this.snb_type != other.snb_type) return false
        if (!this.snb_name.contentEquals(other.snb_name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.snb_family.hashCode()
        result = 31 * result + this.snb_type.hashCode()
        result = 31 * result + this.snb_name.contentHashCode()
        return result
    }
}

public data class SOCKADDR_STORAGE(
    public var ss_family: ADDRESS_FAMILY = 0u,
    public var __ss_pad1: ByteArray = ByteArray(6),
    public var __ss_align: Long = 0L,
    public var __ss_pad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_STORAGE) return false
        if (this.ss_family != other.ss_family) return false
        if (!this.__ss_pad1.contentEquals(other.__ss_pad1)) return false
        if (this.__ss_align != other.__ss_align) return false
        if (!this.__ss_pad2.contentEquals(other.__ss_pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ss_family.hashCode()
        result = 31 * result + this.__ss_pad1.contentHashCode()
        result = 31 * result + this.__ss_align.hashCode()
        result = 31 * result + this.__ss_pad2.contentHashCode()
        return result
    }
}

public data class SOCKADDR_STORAGE_XP(
    public var ss_family: Short = 0,
    public var __ss_pad1: ByteArray = ByteArray(6),
    public var __ss_align: Long = 0L,
    public var __ss_pad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_STORAGE_XP) return false
        if (this.ss_family != other.ss_family) return false
        if (!this.__ss_pad1.contentEquals(other.__ss_pad1)) return false
        if (this.__ss_align != other.__ss_align) return false
        if (!this.__ss_pad2.contentEquals(other.__ss_pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ss_family.hashCode()
        result = 31 * result + this.__ss_pad1.contentHashCode()
        result = 31 * result + this.__ss_align.hashCode()
        result = 31 * result + this.__ss_pad2.contentHashCode()
        return result
    }
}

public data class SOCKADDR_TP(
    public var tp_family: UShort = 0u,
    public var tp_addr_type: UShort = 0u,
    public var tp_taddr_len: UShort = 0u,
    public var tp_tsel_len: UShort = 0u,
    public var tp_addr: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_TP) return false
        if (this.tp_family != other.tp_family) return false
        if (this.tp_addr_type != other.tp_addr_type) return false
        if (this.tp_taddr_len != other.tp_taddr_len) return false
        if (this.tp_tsel_len != other.tp_tsel_len) return false
        if (!this.tp_addr.contentEquals(other.tp_addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tp_family.hashCode()
        result = 31 * result + this.tp_addr_type.hashCode()
        result = 31 * result + this.tp_taddr_len.hashCode()
        result = 31 * result + this.tp_tsel_len.hashCode()
        result = 31 * result + this.tp_addr.contentHashCode()
        return result
    }
}

public data class SOCKADDR_UN(public var sun_family: ADDRESS_FAMILY = 0u, public var sun_path: ByteArray = ByteArray(108)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_UN) return false
        if (this.sun_family != other.sun_family) return false
        if (!this.sun_path.contentEquals(other.sun_path)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sun_family.hashCode()
        result = 31 * result + this.sun_path.contentHashCode()
        return result
    }
}

public data class SOCKADDR_VNS(
    public var sin_family: UShort = 0u,
    public var net_address: UByteArray = UByteArray(4),
    public var subnet_addr: UByteArray = UByteArray(2),
    public var port: UByteArray = UByteArray(2),
    public var hops: UByte = 0u,
    public var filler: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKADDR_VNS) return false
        if (this.sin_family != other.sin_family) return false
        if (!this.net_address.contentEquals(other.net_address)) return false
        if (!this.subnet_addr.contentEquals(other.subnet_addr)) return false
        if (!this.port.contentEquals(other.port)) return false
        if (this.hops != other.hops) return false
        if (!this.filler.contentEquals(other.filler)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin_family.hashCode()
        result = 31 * result + this.net_address.contentHashCode()
        result = 31 * result + this.subnet_addr.contentHashCode()
        result = 31 * result + this.port.contentHashCode()
        result = 31 * result + this.hops.hashCode()
        result = 31 * result + this.filler.contentHashCode()
        return result
    }
}

public data class SOCKET_ADDRESS(public var lpSockaddr: Long = 0L, public var iSockaddrLength: Int = 0)

public data class SOCKET_ADDRESS_LIST(public var iAddressCount: Int = 0, public var Address: List<SOCKET_ADDRESS> = List(1) { SOCKET_ADDRESS() })

public data class SOCKET_PEER_TARGET_NAME(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var PeerAddress: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var PeerTargetNameStringLen: UInt = 0u,
    public var AllStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKET_PEER_TARGET_NAME) return false
        if (this.SecurityProtocol != other.SecurityProtocol) return false
        if (this.PeerAddress != other.PeerAddress) return false
        if (this.PeerTargetNameStringLen != other.PeerTargetNameStringLen) return false
        if (!this.AllStrings.contentEquals(other.AllStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SecurityProtocol.hashCode()
        result = 31 * result + this.PeerAddress.hashCode()
        result = 31 * result + this.PeerTargetNameStringLen.hashCode()
        result = 31 * result + this.AllStrings.contentHashCode()
        return result
    }
}

public data class SOCKET_PROCESSOR_AFFINITY(
    public var Processor: PROCESSOR_NUMBER = PROCESSOR_NUMBER(),
    public var NumaNodeId: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class SOCKET_SECURITY_QUERY_INFO(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var Flags: UInt = 0u,
    public var PeerApplicationAccessTokenHandle: ULong = 0uL,
    public var PeerMachineAccessTokenHandle: ULong = 0uL,
)

public data class SOCKET_SECURITY_QUERY_INFO_IPSEC2(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var Flags: UInt = 0u,
    public var PeerApplicationAccessTokenHandle: ULong = 0uL,
    public var PeerMachineAccessTokenHandle: ULong = 0uL,
    public var MmSaId: ULong = 0uL,
    public var QmSaId: ULong = 0uL,
    public var NegotiationWinerr: UInt = 0u,
    public var SaLookupContext: GUID = GUID(),
)

public data class SOCKET_SECURITY_QUERY_TEMPLATE(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var PeerAddress: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var PeerTokenAccessMask: UInt = 0u,
)

public data class SOCKET_SECURITY_QUERY_TEMPLATE_IPSEC2(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var PeerAddress: SOCKADDR_STORAGE = SOCKADDR_STORAGE(),
    public var PeerTokenAccessMask: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FieldMask: UInt = 0u,
)

public data class SOCKET_SECURITY_SETTINGS(public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0, public var SecurityFlags: UInt = 0u)
