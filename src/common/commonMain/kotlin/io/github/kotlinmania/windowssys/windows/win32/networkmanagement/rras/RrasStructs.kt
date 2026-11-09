@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN6_ADDR
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN_ADDR
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_INTEGER_BLOB

public data class AUTH_VALIDATION_EX(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var hRasConnection: HANDLE = 0L,
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var AuthInfoSize: UInt = 0u,
    public var AuthInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUTH_VALIDATION_EX) return false
        if (this.Header != other.Header) return false
        if (this.hRasConnection != other.hRasConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszLogonDomain.contentEquals(other.wszLogonDomain)) return false
        if (this.AuthInfoSize != other.AuthInfoSize) return false
        if (!this.AuthInfo.contentEquals(other.AuthInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.hRasConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.wszLogonDomain.contentHashCode()
        result = 31 * result + this.AuthInfoSize.hashCode()
        result = 31 * result + this.AuthInfo.contentHashCode()
        return result
    }
}

public data class GRE_CONFIG_PARAMS0(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class IKEV2_CONFIG_PARAMS(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var TunnelConfigParams: IKEV2_TUNNEL_CONFIG_PARAMS4 = IKEV2_TUNNEL_CONFIG_PARAMS4(),
)

public data class IKEV2_PROJECTION_INFO(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var IPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var IPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEV2_PROJECTION_INFO) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.IPv4SubInterfaceIndex != other.IPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.IPv6SubInterfaceIndex != other.IPv6SubInterfaceIndex) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwCompressionAlgorithm != other.dwCompressionAlgorithm) return false
        if (this.dwEncryptionMethod != other.dwEncryptionMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIPv4NegotiationError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.IPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.IPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }
}

public data class IKEV2_PROJECTION_INFO2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var IPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var IPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwEmbeddedEAPTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEV2_PROJECTION_INFO2) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.IPv4SubInterfaceIndex != other.IPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.IPv6SubInterfaceIndex != other.IPv6SubInterfaceIndex) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwEmbeddedEAPTypeId != other.dwEmbeddedEAPTypeId) return false
        if (this.dwCompressionAlgorithm != other.dwCompressionAlgorithm) return false
        if (this.dwEncryptionMethod != other.dwEncryptionMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIPv4NegotiationError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.IPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.IPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwEmbeddedEAPTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }
}

public data class IKEV2_TUNNEL_CONFIG_PARAMS2(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: Long = 0L,
    public var machineCertificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: Long = 0L,
)

public data class IKEV2_TUNNEL_CONFIG_PARAMS3(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: Long = 0L,
    public var machineCertificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: Long = 0L,
    public var dwTotalEkus: UInt = 0u,
    public var certificateEKUs: Long = 0L,
    public var machineCertificateHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class IKEV2_TUNNEL_CONFIG_PARAMS4(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: Long = 0L,
    public var machineCertificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: Long = 0L,
    public var dwTotalEkus: UInt = 0u,
    public var certificateEKUs: Long = 0L,
    public var machineCertificateHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwMmSaLifeTime: UInt = 0u,
)

public data class L2TP_CONFIG_PARAMS0(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class L2TP_CONFIG_PARAMS1(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var TunnelConfigParams: L2TP_TUNNEL_CONFIG_PARAMS2 = L2TP_TUNNEL_CONFIG_PARAMS2(),
)

public data class L2TP_TUNNEL_CONFIG_PARAMS1(
    public var dwIdleTimeout: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var customPolicy: Long = 0L,
)

public data class L2TP_TUNNEL_CONFIG_PARAMS2(
    public var dwIdleTimeout: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var customPolicy: Long = 0L,
    public var dwMmSaLifeTime: UInt = 0u,
)

public data class MGM_IF_ENTRY(
    public var dwIfIndex: UInt = 0u,
    public var dwIfNextHopAddr: UInt = 0u,
    public var bIGMP: BOOL = 0,
    public var bIsEnabled: BOOL = 0,
)

public data class MPRAPI_ADMIN_DLL_CALLBACKS(
    public var revision: UByte = 0u,
    public var lpfnMprAdminGetIpAddressForUser: PMPRADMINGETIPADDRESSFORUSER = null,
    public var lpfnMprAdminReleaseIpAddress: PMPRADMINRELEASEIPADRESS = null,
    public var lpfnMprAdminGetIpv6AddressForUser: PMPRADMINGETIPV6ADDRESSFORUSER = null,
    public var lpfnMprAdminReleaseIpV6AddressForUser: PMPRADMINRELEASEIPV6ADDRESSFORUSER = null,
    public var lpfnRasAdminAcceptNewLink: PMPRADMINACCEPTNEWLINK = null,
    public var lpfnRasAdminLinkHangupNotification: PMPRADMINLINKHANGUPNOTIFICATION = null,
    public var lpfnRasAdminTerminateDll: PMPRADMINTERMINATEDLL = null,
    public var lpfnRasAdminAcceptNewConnectionEx: PMPRADMINACCEPTNEWCONNECTIONEX = null,
    public var lpfnRasAdminAcceptEndpointChangeEx: PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX = null,
    public var lpfnRasAdminAcceptReauthenticationEx: PMPRADMINACCEPTREAUTHENTICATIONEX = null,
    public var lpfnRasAdminConnectionHangupNotificationEx: PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX = null,
    public var lpfnRASValidatePreAuthenticatedConnectionEx: PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX = null,
)

public data class MPRAPI_OBJECT_HEADER(
    public var revision: UByte = 0u,
    public var type: UByte = 0u,
    public var size: UShort = 0u,
)

public data class MPRAPI_TUNNEL_CONFIG_PARAMS0(
    public var IkeConfigParams: IKEV2_CONFIG_PARAMS = IKEV2_CONFIG_PARAMS(),
    public var PptpConfigParams: PPTP_CONFIG_PARAMS = PPTP_CONFIG_PARAMS(),
    public var L2tpConfigParams: L2TP_CONFIG_PARAMS1 = L2TP_CONFIG_PARAMS1(),
    public var SstpConfigParams: SSTP_CONFIG_PARAMS = SSTP_CONFIG_PARAMS(),
)

public data class MPRAPI_TUNNEL_CONFIG_PARAMS1(
    public var IkeConfigParams: IKEV2_CONFIG_PARAMS = IKEV2_CONFIG_PARAMS(),
    public var PptpConfigParams: PPTP_CONFIG_PARAMS = PPTP_CONFIG_PARAMS(),
    public var L2tpConfigParams: L2TP_CONFIG_PARAMS1 = L2TP_CONFIG_PARAMS1(),
    public var SstpConfigParams: SSTP_CONFIG_PARAMS = SSTP_CONFIG_PARAMS(),
    public var GREConfigParams: GRE_CONFIG_PARAMS0 = GRE_CONFIG_PARAMS0(),
)

public data class MPR_CERT_EKU(
    public var dwSize: UInt = 0u,
    public var IsEKUOID: BOOL = 0,
    public var pwszEKU: PWSTR = 0L,
)

public data class MPR_CREDENTIALSEX_0(public var dwSize: UInt = 0u, public var lpbCredentialsInfo: Long = 0L)

public data class MPR_CREDENTIALSEX_1(public var dwSize: UInt = 0u, public var lpbCredentialsInfo: Long = 0L)

public data class MPR_DEVICE_0(public var szDeviceType: UShortArray = UShortArray(17), public var szDeviceName: UShortArray = UShortArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_DEVICE_0) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }
}

public data class MPR_DEVICE_1(
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_DEVICE_1) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.szAlternates != other.szAlternates) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.szAlternates.hashCode()
        return result
    }
}

public data class MPR_FILTER_0(public var fEnable: BOOL = 0)

public data class MPR_IFTRANSPORT_0(
    public var dwTransportId: UInt = 0u,
    public var hIfTransport: HANDLE = 0L,
    public var wszIfTransportName: UShortArray = UShortArray(41),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_IFTRANSPORT_0) return false
        if (this.dwTransportId != other.dwTransportId) return false
        if (this.hIfTransport != other.hIfTransport) return false
        if (!this.wszIfTransportName.contentEquals(other.wszIfTransportName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwTransportId.hashCode()
        result = 31 * result + this.hIfTransport.hashCode()
        result = 31 * result + this.wszIfTransportName.contentHashCode()
        return result
    }
}

public data class MPR_IF_CUSTOMINFOEX0(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG0 = ROUTER_IKEv2_IF_CUSTOM_CONFIG0(),
)

public data class MPR_IF_CUSTOMINFOEX1(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG1 = ROUTER_IKEv2_IF_CUSTOM_CONFIG1(),
)

public data class MPR_IF_CUSTOMINFOEX2(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG2 = ROUTER_IKEv2_IF_CUSTOM_CONFIG2(),
)

public data class MPR_INTERFACE_0(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: HANDLE = 0L,
    public var fEnabled: BOOL = 0,
    public var dwIfType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionState: ROUTER_CONNECTION_STATE = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_INTERFACE_0) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (this.hInterface != other.hInterface) return false
        if (this.fEnabled != other.fEnabled) return false
        if (this.dwIfType != other.dwIfType) return false
        if (this.dwConnectionState != other.dwConnectionState) return false
        if (this.fUnReachabilityReasons != other.fUnReachabilityReasons) return false
        if (this.dwLastError != other.dwLastError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.fEnabled.hashCode()
        result = 31 * result + this.dwIfType.hashCode()
        result = 31 * result + this.dwConnectionState.hashCode()
        result = 31 * result + this.fUnReachabilityReasons.hashCode()
        result = 31 * result + this.dwLastError.hashCode()
        return result
    }
}

public data class MPR_INTERFACE_1(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: HANDLE = 0L,
    public var fEnabled: BOOL = 0,
    public var dwIfType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionState: ROUTER_CONNECTION_STATE = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var lpwsDialoutHoursRestriction: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_INTERFACE_1) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (this.hInterface != other.hInterface) return false
        if (this.fEnabled != other.fEnabled) return false
        if (this.dwIfType != other.dwIfType) return false
        if (this.dwConnectionState != other.dwConnectionState) return false
        if (this.fUnReachabilityReasons != other.fUnReachabilityReasons) return false
        if (this.dwLastError != other.dwLastError) return false
        if (this.lpwsDialoutHoursRestriction != other.lpwsDialoutHoursRestriction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.fEnabled.hashCode()
        result = 31 * result + this.dwIfType.hashCode()
        result = 31 * result + this.dwConnectionState.hashCode()
        result = 31 * result + this.fUnReachabilityReasons.hashCode()
        result = 31 * result + this.dwLastError.hashCode()
        result = 31 * result + this.lpwsDialoutHoursRestriction.hashCode()
        return result
    }
}

public class MPR_INTERFACE_2(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: HANDLE = 0L,
    public var fEnabled: BOOL = 0,
    public var dwIfType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionState: ROUTER_CONNECTION_STATE = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: PWSTR = 0L,
    public var ipaddr: UInt = 0u,
    public var ipaddrDns: UInt = 0u,
    public var ipaddrDnsAlt: UInt = 0u,
    public var ipaddrWins: UInt = 0u,
    public var ipaddrWinsAlt: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szX25PadType: UShortArray = UShortArray(33),
    public var szX25Address: UShortArray = UShortArray(201),
    public var szX25Facilities: UShortArray = UShortArray(201),
    public var szX25UserData: UShortArray = UShortArray(201),
    public var dwChannels: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: MPR_INTERFACE_DIAL_MODE = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: MPR_ET = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var dwCustomAuthDataSize: UInt = 0u,
    public var lpbCustomAuthData: Long = 0L,
    public var guidId: GUID = GUID(),
    public var dwVpnStrategy: MPR_VS = 0u,
)

public class MPR_INTERFACE_3(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: HANDLE = 0L,
    public var fEnabled: BOOL = 0,
    public var dwIfType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionState: ROUTER_CONNECTION_STATE = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: PWSTR = 0L,
    public var ipaddr: UInt = 0u,
    public var ipaddrDns: UInt = 0u,
    public var ipaddrDnsAlt: UInt = 0u,
    public var ipaddrWins: UInt = 0u,
    public var ipaddrWinsAlt: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szX25PadType: UShortArray = UShortArray(33),
    public var szX25Address: UShortArray = UShortArray(201),
    public var szX25Facilities: UShortArray = UShortArray(201),
    public var szX25UserData: UShortArray = UShortArray(201),
    public var dwChannels: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: MPR_INTERFACE_DIAL_MODE = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: MPR_ET = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var dwCustomAuthDataSize: UInt = 0u,
    public var lpbCustomAuthData: Long = 0L,
    public var guidId: GUID = GUID(),
    public var dwVpnStrategy: MPR_VS = 0u,
    public var AddressCount: UInt = 0u,
    public var ipv6addrDns: IN6_ADDR = IN6_ADDR(),
    public var ipv6addrDnsAlt: IN6_ADDR = IN6_ADDR(),
    public var ipv6addr: Long = 0L,
)

public data class MPR_IPINIP_INTERFACE_0(public var wszFriendlyName: UShortArray = UShortArray(257), public var Guid: GUID = GUID()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_IPINIP_INTERFACE_0) return false
        if (!this.wszFriendlyName.contentEquals(other.wszFriendlyName)) return false
        if (this.Guid != other.Guid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszFriendlyName.contentHashCode()
        result = 31 * result + this.Guid.hashCode()
        return result
    }
}

public data class MPR_SERVER_0(
    public var fLanOnlyMode: BOOL = 0,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
)

public data class MPR_SERVER_1(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
)

public data class MPR_SERVER_2(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
    public var dwNumSstpPorts: UInt = 0u,
    public var dwSstpPortFlags: UInt = 0u,
)

public data class MPR_SERVER_EX0(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS0 = MPRAPI_TUNNEL_CONFIG_PARAMS0(),
)

public data class MPR_SERVER_EX1(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS1 = MPRAPI_TUNNEL_CONFIG_PARAMS1(),
)

public data class MPR_SERVER_SET_CONFIG_EX0(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var setConfigForProtocols: UInt = 0u,
    public var ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS0 = MPRAPI_TUNNEL_CONFIG_PARAMS0(),
)

public data class MPR_SERVER_SET_CONFIG_EX1(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var setConfigForProtocols: UInt = 0u,
    public var ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS1 = MPRAPI_TUNNEL_CONFIG_PARAMS1(),
)

public data class MPR_TRANSPORT_0(
    public var dwTransportId: UInt = 0u,
    public var hTransport: HANDLE = 0L,
    public var wszTransportName: UShortArray = UShortArray(41),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_TRANSPORT_0) return false
        if (this.dwTransportId != other.dwTransportId) return false
        if (this.hTransport != other.hTransport) return false
        if (!this.wszTransportName.contentEquals(other.wszTransportName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwTransportId.hashCode()
        result = 31 * result + this.hTransport.hashCode()
        result = 31 * result + this.wszTransportName.contentHashCode()
        return result
    }
}

public data class MPR_VPN_TRAFFIC_SELECTOR(
    public var type: MPR_VPN_TS_TYPE = 0,
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var tsPayloadId: UShort = 0u,
    public var addrStart: VPN_TS_IP_ADDRESS = VPN_TS_IP_ADDRESS(),
    public var addrEnd: VPN_TS_IP_ADDRESS = VPN_TS_IP_ADDRESS(),
)

public data class MPR_VPN_TRAFFIC_SELECTORS(
    public var numTsi: UInt = 0u,
    public var numTsr: UInt = 0u,
    public var tsI: Long = 0L,
    public var tsR: Long = 0L,
)

public data class PPP_ATCP_INFO(public var dwError: UInt = 0u, public var wszAddress: UShortArray = UShortArray(33)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_ATCP_INFO) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        return result
    }
}

public data class PPP_CCP_INFO(
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
)

public data class PPP_INFO(
    public var nbf: PPP_NBFCP_INFO = PPP_NBFCP_INFO(),
    public var ip: PPP_IPCP_INFO = PPP_IPCP_INFO(),
    public var ipx: PPP_IPXCP_INFO = PPP_IPXCP_INFO(),
    public var at: PPP_ATCP_INFO = PPP_ATCP_INFO(),
)

public data class PPP_INFO_2(
    public var nbf: PPP_NBFCP_INFO = PPP_NBFCP_INFO(),
    public var ip: PPP_IPCP_INFO2 = PPP_IPCP_INFO2(),
    public var ipx: PPP_IPXCP_INFO = PPP_IPXCP_INFO(),
    public var at: PPP_ATCP_INFO = PPP_ATCP_INFO(),
    public var ccp: PPP_CCP_INFO = PPP_CCP_INFO(),
    public var lcp: PPP_LCP_INFO = PPP_LCP_INFO(),
)

public data class PPP_INFO_3(
    public var nbf: PPP_NBFCP_INFO = PPP_NBFCP_INFO(),
    public var ip: PPP_IPCP_INFO2 = PPP_IPCP_INFO2(),
    public var ipv6: PPP_IPV6_CP_INFO = PPP_IPV6_CP_INFO(),
    public var ccp: PPP_CCP_INFO = PPP_CCP_INFO(),
    public var lcp: PPP_LCP_INFO = PPP_LCP_INFO(),
)

public data class PPP_IPCP_INFO(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_IPCP_INFO) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        return result
    }
}

public data class PPP_IPCP_INFO2(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_IPCP_INFO2) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwRemoteOptions != other.dwRemoteOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwRemoteOptions.hashCode()
        return result
    }
}

public data class PPP_IPV6_CP_INFO(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_IPV6_CP_INFO) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwRemoteOptions != other.dwRemoteOptions) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwRemoteOptions.hashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        return result
    }
}

public data class PPP_IPXCP_INFO(public var dwError: UInt = 0u, public var wszAddress: UShortArray = UShortArray(23)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_IPXCP_INFO) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        return result
    }
}

public data class PPP_LCP_INFO(
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: PPP_LCP = 0u,
    public var dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA = 0u,
    public var dwRemoteAuthenticationProtocol: UInt = 0u,
    public var dwRemoteAuthenticationData: UInt = 0u,
    public var dwTerminateReason: UInt = 0u,
    public var dwRemoteTerminateReason: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
)

public data class PPP_NBFCP_INFO(public var dwError: UInt = 0u, public var wszWksta: UShortArray = UShortArray(17)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_NBFCP_INFO) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszWksta.contentEquals(other.wszWksta)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszWksta.contentHashCode()
        return result
    }
}

public class PPP_PROJECTION_INFO(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var IPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var IPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PPP_LCP = 0u,
    public var dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA = 0u,
    public var dwRemoteAuthenticationProtocol: PPP_LCP = 0u,
    public var dwRemoteAuthenticationData: PPP_LCP_INFO_AUTH_DATA = 0u,
    public var dwLcpTerminateReason: UInt = 0u,
    public var dwLcpRemoteTerminateReason: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwCcpRemoteOptions: UInt = 0u,
)

public class PPP_PROJECTION_INFO2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var IPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var IPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PPP_LCP = 0u,
    public var dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA = 0u,
    public var dwRemoteAuthenticationProtocol: PPP_LCP = 0u,
    public var dwRemoteAuthenticationData: PPP_LCP_INFO_AUTH_DATA = 0u,
    public var dwLcpTerminateReason: UInt = 0u,
    public var dwLcpRemoteTerminateReason: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwEmbeddedEAPTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwCcpRemoteOptions: UInt = 0u,
)

public data class PPTP_CONFIG_PARAMS(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class PROJECTION_INFO(public var projectionInfoType: UByte = 0u, public var Anonymous: PROJECTION_INFO_0 = PROJECTION_INFO_0())

public data class PROJECTION_INFO_0(public var PppProjectionInfo: PPP_PROJECTION_INFO = PPP_PROJECTION_INFO(), public var Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO = IKEV2_PROJECTION_INFO())

public data class PROJECTION_INFO2(public var projectionInfoType: UByte = 0u, public var Anonymous: PROJECTION_INFO2_0 = PROJECTION_INFO2_0())

public data class PROJECTION_INFO2_0(public var PppProjectionInfo: PPP_PROJECTION_INFO2 = PPP_PROJECTION_INFO2(), public var Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO2 = IKEV2_PROJECTION_INFO2())

public data class RASADPARAMS(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
)

public data class RASAMBA(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASAMBA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }
}

public data class RASAMBW(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASAMBW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }
}

public data class RASAUTODIALENTRYA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: ByteArray = ByteArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASAUTODIALENTRYA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDialingLocation != other.dwDialingLocation) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDialingLocation.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        return result
    }
}

public data class RASAUTODIALENTRYW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: UShortArray = UShortArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASAUTODIALENTRYW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDialingLocation != other.dwDialingLocation) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDialingLocation.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        return result
    }
}

public data class RASCOMMSETTINGS(
    public var dwSize: UInt = 0u,
    public var bParity: UByte = 0u,
    public var bStop: UByte = 0u,
    public var bByteSize: UByte = 0u,
    public var bAlign: UByte = 0u,
)

public data class RASCONNA(
    public var dwSize: UInt = 0u,
    public var hrasconn: HRASCONN = 0L,
    public var szEntryName: ByteArray = ByteArray(257),
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szPhonebook: ByteArray = ByteArray(260),
    public var dwSubEntry: UInt = 0u,
    public var guidEntry: GUID = GUID(),
    public var dwFlags: UInt = 0u,
    public var luid: LUID = LUID(),
    public var guidCorrelationId: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCONNA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hrasconn != other.hrasconn) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhonebook.contentEquals(other.szPhonebook)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.guidEntry != other.guidEntry) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.luid != other.luid) return false
        if (this.guidCorrelationId != other.guidCorrelationId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hrasconn.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhonebook.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.guidEntry.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.luid.hashCode()
        result = 31 * result + this.guidCorrelationId.hashCode()
        return result
    }
}

public data class RASCONNSTATUSA(
    public var dwSize: UInt = 0u,
    public var rasconnstate: RASCONNSTATE = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szPhoneNumber: ByteArray = ByteArray(129),
    public var localEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
    public var remoteEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
    public var rasconnsubstate: RASCONNSUBSTATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCONNSTATUSA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.rasconnstate != other.rasconnstate) return false
        if (this.dwError != other.dwError) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (this.localEndPoint != other.localEndPoint) return false
        if (this.remoteEndPoint != other.remoteEndPoint) return false
        if (this.rasconnsubstate != other.rasconnsubstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.rasconnstate.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.localEndPoint.hashCode()
        result = 31 * result + this.remoteEndPoint.hashCode()
        result = 31 * result + this.rasconnsubstate.hashCode()
        return result
    }
}

public data class RASCONNSTATUSW(
    public var dwSize: UInt = 0u,
    public var rasconnstate: RASCONNSTATE = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szPhoneNumber: UShortArray = UShortArray(129),
    public var localEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
    public var remoteEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
    public var rasconnsubstate: RASCONNSUBSTATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCONNSTATUSW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.rasconnstate != other.rasconnstate) return false
        if (this.dwError != other.dwError) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (this.localEndPoint != other.localEndPoint) return false
        if (this.remoteEndPoint != other.remoteEndPoint) return false
        if (this.rasconnsubstate != other.rasconnsubstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.rasconnstate.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.localEndPoint.hashCode()
        result = 31 * result + this.remoteEndPoint.hashCode()
        result = 31 * result + this.rasconnsubstate.hashCode()
        return result
    }
}

public data class RASCONNW(
    public var dwSize: UInt = 0u,
    public var hrasconn: HRASCONN = 0L,
    public var szEntryName: UShortArray = UShortArray(257),
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szPhonebook: UShortArray = UShortArray(260),
    public var dwSubEntry: UInt = 0u,
    public var guidEntry: GUID = GUID(),
    public var dwFlags: UInt = 0u,
    public var luid: LUID = LUID(),
    public var guidCorrelationId: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCONNW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hrasconn != other.hrasconn) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhonebook.contentEquals(other.szPhonebook)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.guidEntry != other.guidEntry) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.luid != other.luid) return false
        if (this.guidCorrelationId != other.guidCorrelationId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hrasconn.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhonebook.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.guidEntry.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.luid.hashCode()
        result = 31 * result + this.guidCorrelationId.hashCode()
        return result
    }
}

public data class RASCREDENTIALSA(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCREDENTIALSA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }
}

public data class RASCREDENTIALSW(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCREDENTIALSW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }
}

public data class RASCTRYINFO(
    public var dwSize: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwNextCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwCountryNameOffset: UInt = 0u,
)

public data class RASCUSTOMSCRIPTEXTENSIONS(public var dwSize: UInt = 0u, public var pfnRasSetCommSettings: PFNRASSETCOMMSETTINGS = null)

public data class RASDEVINFOA(
    public var dwSize: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASDEVINFOA) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }
}

public data class RASDEVINFOW(
    public var dwSize: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASDEVINFOW) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }
}

public data class RASDEVSPECIFICINFO(public var dwSize: UInt = 0u, public var pbDevSpecificInfo: Long = 0L)

public data class RASDIALDLG(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwSubEntry: UInt = 0u,
    public var dwError: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class RASDIALEXTENSIONS(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var reserved: ULong = 0uL,
    public var reserved1: ULong = 0uL,
    public var RasEapInfo: RASEAPINFO = RASEAPINFO(),
    public var fSkipPppAuth: BOOL = 0,
    public var RasDevSpecificInfo: RASDEVSPECIFICINFO = RASDEVSPECIFICINFO(),
)

public data class RASDIALPARAMSA(
    public var dwSize: UInt = 0u,
    public var szEntryName: ByteArray = ByteArray(257),
    public var szPhoneNumber: ByteArray = ByteArray(129),
    public var szCallbackNumber: ByteArray = ByteArray(129),
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
    public var dwSubEntry: UInt = 0u,
    public var dwCallbackId: ULong = 0uL,
    public var dwIfIndex: UInt = 0u,
    public var szEncPassword: PSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASDIALPARAMSA) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (!this.szCallbackNumber.contentEquals(other.szCallbackNumber)) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (this.szEncPassword != other.szEncPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.szCallbackNumber.contentHashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.szEncPassword.hashCode()
        return result
    }
}

public data class RASDIALPARAMSW(
    public var dwSize: UInt = 0u,
    public var szEntryName: UShortArray = UShortArray(257),
    public var szPhoneNumber: UShortArray = UShortArray(129),
    public var szCallbackNumber: UShortArray = UShortArray(129),
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
    public var dwSubEntry: UInt = 0u,
    public var dwCallbackId: ULong = 0uL,
    public var dwIfIndex: UInt = 0u,
    public var szEncPassword: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASDIALPARAMSW) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (!this.szCallbackNumber.contentEquals(other.szCallbackNumber)) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (this.szEncPassword != other.szEncPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.szCallbackNumber.contentHashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.szEncPassword.hashCode()
        return result
    }
}

public data class RASEAPINFO(public var dwSizeofEapInfo: UInt = 0u, public var pbEapInfo: Long = 0L)

public data class RASEAPUSERIDENTITYA(
    public var szUserName: ByteArray = ByteArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASEAPUSERIDENTITYA) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (this.dwSizeofEapInfo != other.dwSizeofEapInfo) return false
        if (!this.pbEapInfo.contentEquals(other.pbEapInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szUserName.contentHashCode()
        result = 31 * result + this.dwSizeofEapInfo.hashCode()
        result = 31 * result + this.pbEapInfo.contentHashCode()
        return result
    }
}

public data class RASEAPUSERIDENTITYW(
    public var szUserName: UShortArray = UShortArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASEAPUSERIDENTITYW) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (this.dwSizeofEapInfo != other.dwSizeofEapInfo) return false
        if (!this.pbEapInfo.contentEquals(other.pbEapInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szUserName.contentHashCode()
        result = 31 * result + this.dwSizeofEapInfo.hashCode()
        result = 31 * result + this.pbEapInfo.contentHashCode()
        return result
    }
}

public class RASENTRYA(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: ByteArray = ByteArray(11),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: RASIPADDR = RASIPADDR(),
    public var ipaddrDns: RASIPADDR = RASIPADDR(),
    public var ipaddrDnsAlt: RASIPADDR = RASIPADDR(),
    public var ipaddrWins: RASIPADDR = RASIPADDR(),
    public var ipaddrWinsAlt: RASIPADDR = RASIPADDR(),
    public var dwFrameSize: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var dwFramingProtocol: UInt = 0u,
    public var szScript: ByteArray = ByteArray(260),
    public var szAutodialDll: ByteArray = ByteArray(260),
    public var szAutodialFunc: ByteArray = ByteArray(260),
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szX25PadType: ByteArray = ByteArray(33),
    public var szX25Address: ByteArray = ByteArray(201),
    public var szX25Facilities: ByteArray = ByteArray(201),
    public var szX25UserData: ByteArray = ByteArray(201),
    public var dwChannels: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: RASENTRY_DIAL_MODE = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: GUID = GUID(),
    public var szCustomDialDll: ByteArray = ByteArray(260),
    public var dwVpnStrategy: UInt = 0u,
    public var dwfOptions2: UInt = 0u,
    public var dwfOptions3: UInt = 0u,
    public var szDnsSuffix: ByteArray = ByteArray(256),
    public var dwTcpWindowSize: UInt = 0u,
    public var szPrerequisitePbk: ByteArray = ByteArray(260),
    public var szPrerequisiteEntry: ByteArray = ByteArray(257),
    public var dwRedialCount: UInt = 0u,
    public var dwRedialPause: UInt = 0u,
    public var ipv6addrDns: IN6_ADDR = IN6_ADDR(),
    public var ipv6addrDnsAlt: IN6_ADDR = IN6_ADDR(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: IN6_ADDR = IN6_ADDR(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: ByteArray = ByteArray(257),
    public var szIDr: ByteArray = ByteArray(257),
    public var fIsImsConfig: BOOL = 0,
    public var IdiType: IKEV2_ID_PAYLOAD_TYPE = 0,
    public var IdrType: IKEV2_ID_PAYLOAD_TYPE = 0,
    public var fDisableIKEv2Fragmentation: BOOL = 0,
)

public data class RASENTRYDLGA(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var szEntry: ByteArray = ByteArray(257),
    public var dwError: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var reserved2: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASENTRYDLGA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class RASENTRYDLGW(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var szEntry: UShortArray = UShortArray(257),
    public var dwError: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var reserved2: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASENTRYDLGW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class RASENTRYNAMEA(
    public var dwSize: UInt = 0u,
    public var szEntryName: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASENTRYNAMEA) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szPhonebookPath.contentEquals(other.szPhonebookPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szPhonebookPath.contentHashCode()
        return result
    }
}

public data class RASENTRYNAMEW(
    public var dwSize: UInt = 0u,
    public var szEntryName: UShortArray = UShortArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASENTRYNAMEW) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szPhonebookPath.contentEquals(other.szPhonebookPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szPhonebookPath.contentHashCode()
        return result
    }
}

public class RASENTRYW(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: UShortArray = UShortArray(11),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: RASIPADDR = RASIPADDR(),
    public var ipaddrDns: RASIPADDR = RASIPADDR(),
    public var ipaddrDnsAlt: RASIPADDR = RASIPADDR(),
    public var ipaddrWins: RASIPADDR = RASIPADDR(),
    public var ipaddrWinsAlt: RASIPADDR = RASIPADDR(),
    public var dwFrameSize: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var dwFramingProtocol: UInt = 0u,
    public var szScript: UShortArray = UShortArray(260),
    public var szAutodialDll: UShortArray = UShortArray(260),
    public var szAutodialFunc: UShortArray = UShortArray(260),
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szX25PadType: UShortArray = UShortArray(33),
    public var szX25Address: UShortArray = UShortArray(201),
    public var szX25Facilities: UShortArray = UShortArray(201),
    public var szX25UserData: UShortArray = UShortArray(201),
    public var dwChannels: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: RASENTRY_DIAL_MODE = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: GUID = GUID(),
    public var szCustomDialDll: UShortArray = UShortArray(260),
    public var dwVpnStrategy: UInt = 0u,
    public var dwfOptions2: UInt = 0u,
    public var dwfOptions3: UInt = 0u,
    public var szDnsSuffix: UShortArray = UShortArray(256),
    public var dwTcpWindowSize: UInt = 0u,
    public var szPrerequisitePbk: UShortArray = UShortArray(260),
    public var szPrerequisiteEntry: UShortArray = UShortArray(257),
    public var dwRedialCount: UInt = 0u,
    public var dwRedialPause: UInt = 0u,
    public var ipv6addrDns: IN6_ADDR = IN6_ADDR(),
    public var ipv6addrDnsAlt: IN6_ADDR = IN6_ADDR(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: IN6_ADDR = IN6_ADDR(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: UShortArray = UShortArray(257),
    public var szIDr: UShortArray = UShortArray(257),
    public var fIsImsConfig: BOOL = 0,
    public var IdiType: IKEV2_ID_PAYLOAD_TYPE = 0,
    public var IdrType: IKEV2_ID_PAYLOAD_TYPE = 0,
    public var fDisableIKEv2Fragmentation: BOOL = 0,
)

public data class RASIKEV2_PROJECTION_INFO(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var ipv4Address: IN_ADDR = IN_ADDR(),
    public var ipv4ServerAddress: IN_ADDR = IN_ADDR(),
    public var dwIPv6NegotiationError: UInt = 0u,
    public var ipv6Address: IN6_ADDR = IN6_ADDR(),
    public var ipv6ServerAddress: IN6_ADDR = IN6_ADDR(),
    public var dwPrefixLength: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwFlags: RASIKEV_PROJECTION_INFO_FLAGS = 0u,
    public var dwEncryptionMethod: UInt = 0u,
    public var numIPv4ServerAddresses: UInt = 0u,
    public var ipv4ServerAddresses: Long = 0L,
    public var numIPv6ServerAddresses: UInt = 0u,
    public var ipv6ServerAddresses: Long = 0L,
)

public data class RASIPADDR(
    public var a: UByte = 0u,
    public var b: UByte = 0u,
    public var c: UByte = 0u,
    public var d: UByte = 0u,
)

public data class RASIPXW(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: UShortArray = UShortArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASIPXW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpxAddress.contentEquals(other.szIpxAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpxAddress.contentHashCode()
        return result
    }
}

public data class RASNOUSERA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASNOUSERA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwTimeoutMs != other.dwTimeoutMs) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwTimeoutMs.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }
}

public data class RASNOUSERW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASNOUSERW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwTimeoutMs != other.dwTimeoutMs) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwTimeoutMs.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }
}

public data class RASPBDLGA(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwCallbackId: ULong = 0uL,
    public var pCallback: RASPBDLGFUNCA = null,
    public var dwError: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class RASPBDLGW(
    public var dwSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwCallbackId: ULong = 0uL,
    public var pCallback: RASPBDLGFUNCW = null,
    public var dwError: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class RASPPPCCP(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwServerCompressionAlgorithm: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
)

public data class RASPPPIPA(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: ByteArray = ByteArray(16),
    public var szServerIpAddress: ByteArray = ByteArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPIPA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpAddress.contentEquals(other.szIpAddress)) return false
        if (!this.szServerIpAddress.contentEquals(other.szServerIpAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpAddress.contentHashCode()
        result = 31 * result + this.szServerIpAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }
}

public data class RASPPPIPV6(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var bLocalInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPeerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bLocalCompressionProtocol: UByteArray = UByteArray(2),
    public var bPeerCompressionProtocol: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPIPV6) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.bLocalInterfaceIdentifier.contentEquals(other.bLocalInterfaceIdentifier)) return false
        if (!this.bPeerInterfaceIdentifier.contentEquals(other.bPeerInterfaceIdentifier)) return false
        if (!this.bLocalCompressionProtocol.contentEquals(other.bLocalCompressionProtocol)) return false
        if (!this.bPeerCompressionProtocol.contentEquals(other.bPeerCompressionProtocol)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.bLocalInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPeerInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bLocalCompressionProtocol.contentHashCode()
        result = 31 * result + this.bPeerCompressionProtocol.contentHashCode()
        return result
    }
}

public data class RASPPPIPW(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: UShortArray = UShortArray(16),
    public var szServerIpAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPIPW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpAddress.contentEquals(other.szIpAddress)) return false
        if (!this.szServerIpAddress.contentEquals(other.szServerIpAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpAddress.contentHashCode()
        result = 31 * result + this.szServerIpAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }
}

public data class RASPPPIPXA(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: ByteArray = ByteArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPIPXA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpxAddress.contentEquals(other.szIpxAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpxAddress.contentHashCode()
        return result
    }
}

public data class RASPPPLCPA(
    public var dwSize: UInt = 0u,
    public var fBundled: BOOL = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: BOOL = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: ByteArray = ByteArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPLCPA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fBundled != other.fBundled) return false
        if (this.dwError != other.dwError) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwAuthenticationData != other.dwAuthenticationData) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwServerAuthenticationProtocol != other.dwServerAuthenticationProtocol) return false
        if (this.dwServerAuthenticationData != other.dwServerAuthenticationData) return false
        if (this.dwServerEapTypeId != other.dwServerEapTypeId) return false
        if (this.fMultilink != other.fMultilink) return false
        if (this.dwTerminateReason != other.dwTerminateReason) return false
        if (this.dwServerTerminateReason != other.dwServerTerminateReason) return false
        if (!this.szReplyMessage.contentEquals(other.szReplyMessage)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fBundled.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwAuthenticationData.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwServerAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwServerAuthenticationData.hashCode()
        result = 31 * result + this.dwServerEapTypeId.hashCode()
        result = 31 * result + this.fMultilink.hashCode()
        result = 31 * result + this.dwTerminateReason.hashCode()
        result = 31 * result + this.dwServerTerminateReason.hashCode()
        result = 31 * result + this.szReplyMessage.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }
}

public data class RASPPPLCPW(
    public var dwSize: UInt = 0u,
    public var fBundled: BOOL = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: BOOL = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: UShortArray = UShortArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPLCPW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fBundled != other.fBundled) return false
        if (this.dwError != other.dwError) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwAuthenticationData != other.dwAuthenticationData) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwServerAuthenticationProtocol != other.dwServerAuthenticationProtocol) return false
        if (this.dwServerAuthenticationData != other.dwServerAuthenticationData) return false
        if (this.dwServerEapTypeId != other.dwServerEapTypeId) return false
        if (this.fMultilink != other.fMultilink) return false
        if (this.dwTerminateReason != other.dwTerminateReason) return false
        if (this.dwServerTerminateReason != other.dwServerTerminateReason) return false
        if (!this.szReplyMessage.contentEquals(other.szReplyMessage)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fBundled.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwAuthenticationData.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwServerAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwServerAuthenticationData.hashCode()
        result = 31 * result + this.dwServerEapTypeId.hashCode()
        result = 31 * result + this.fMultilink.hashCode()
        result = 31 * result + this.dwTerminateReason.hashCode()
        result = 31 * result + this.dwServerTerminateReason.hashCode()
        result = 31 * result + this.szReplyMessage.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }
}

public data class RASPPPNBFA(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var szWorkstationName: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPNBFA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (this.dwNetBiosError != other.dwNetBiosError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (!this.szWorkstationName.contentEquals(other.szWorkstationName)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwNetBiosError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.szWorkstationName.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }
}

public data class RASPPPNBFW(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var szWorkstationName: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASPPPNBFW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (this.dwNetBiosError != other.dwNetBiosError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (!this.szWorkstationName.contentEquals(other.szWorkstationName)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwNetBiosError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.szWorkstationName.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }
}

public class RASPPP_PROJECTION_INFO(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var ipv4Address: IN_ADDR = IN_ADDR(),
    public var ipv4ServerAddress: IN_ADDR = IN_ADDR(),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4ServerOptions: UInt = 0u,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bServerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var fBundled: BOOL = 0,
    public var fMultilink: BOOL = 0,
    public var dwAuthenticationProtocol: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 0u,
    public var dwAuthenticationData: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = 0u,
    public var dwServerAuthenticationProtocol: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 0u,
    public var dwServerAuthenticationData: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpServerOptions: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCcpCompressionAlgorithm: UInt = 0u,
    public var dwCcpServerCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwCcpServerOptions: UInt = 0u,
)

public data class RASSUBENTRYA(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASSUBENTRYA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwfFlags != other.dwfFlags) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.dwAlternateOffset != other.dwAlternateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwfFlags.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.dwAlternateOffset.hashCode()
        return result
    }
}

public data class RASSUBENTRYW(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASSUBENTRYW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwfFlags != other.dwfFlags) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.dwAlternateOffset != other.dwAlternateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwfFlags.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.dwAlternateOffset.hashCode()
        return result
    }
}

public data class RASTUNNELENDPOINT(public var dwType: UInt = 0u, public var Anonymous: RASTUNNELENDPOINT_0 = RASTUNNELENDPOINT_0())

public data class RASTUNNELENDPOINT_0(public var ipv4: IN_ADDR = IN_ADDR(), public var ipv6: IN6_ADDR = IN6_ADDR())

public data class RASUPDATECONN(
    public var version: RASAPIVERSION = 0,
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
    public var localEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
    public var remoteEndPoint: RASTUNNELENDPOINT = RASTUNNELENDPOINT(),
)

public data class RAS_CONNECTION_0(
    public var hConnection: HANDLE = 0L,
    public var hInterface: HANDLE = 0L,
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionFlags: RAS_FLAGS = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_CONNECTION_0) return false
        if (this.hConnection != other.hConnection) return false
        if (this.hInterface != other.hInterface) return false
        if (this.dwConnectDuration != other.dwConnectDuration) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.dwConnectionFlags != other.dwConnectionFlags) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszLogonDomain.contentEquals(other.wszLogonDomain)) return false
        if (!this.wszRemoteComputer.contentEquals(other.wszRemoteComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.dwConnectDuration.hashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.dwConnectionFlags.hashCode()
        result = 31 * result + this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.wszLogonDomain.contentHashCode()
        result = 31 * result + this.wszRemoteComputer.contentHashCode()
        return result
    }
}

public data class RAS_CONNECTION_1(
    public var hConnection: HANDLE = 0L,
    public var hInterface: HANDLE = 0L,
    public var PppInfo: PPP_INFO = PPP_INFO(),
    public var dwBytesXmited: UInt = 0u,
    public var dwBytesRcved: UInt = 0u,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
)

public data class RAS_CONNECTION_2(
    public var hConnection: HANDLE = 0L,
    public var wszUserName: UShortArray = UShortArray(257),
    public var dwInterfaceType: ROUTER_INTERFACE_TYPE = 0,
    public var guid: GUID = GUID(),
    public var PppInfo2: PPP_INFO_2 = PPP_INFO_2(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_CONNECTION_2) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.PppInfo2 != other.PppInfo2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.PppInfo2.hashCode()
        return result
    }
}

public data class RAS_CONNECTION_3(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var hConnection: HANDLE = 0L,
    public var wszUserName: UShortArray = UShortArray(257),
    public var dwInterfaceType: ROUTER_INTERFACE_TYPE = 0,
    public var guid: GUID = GUID(),
    public var PppInfo3: PPP_INFO_3 = PPP_INFO_3(),
    public var rasQuarState: RAS_QUARANTINE_STATE = 0,
    public var timer: FILETIME = FILETIME(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_CONNECTION_3) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.PppInfo3 != other.PppInfo3) return false
        if (this.rasQuarState != other.rasQuarState) return false
        if (this.timer != other.timer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.PppInfo3.hashCode()
        result = 31 * result + this.rasQuarState.hashCode()
        result = 31 * result + this.timer.hashCode()
        return result
    }
}

public class RAS_CONNECTION_4(
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionFlags: RAS_FLAGS = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
    public var guid: GUID = GUID(),
    public var rasQuarState: RAS_QUARANTINE_STATE = 0,
    public var probationTime: FILETIME = FILETIME(),
    public var connectionStartTime: FILETIME = FILETIME(),
    public var ullBytesXmited: ULong = 0uL,
    public var ullBytesRcved: ULong = 0uL,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
    public var dwNumSwitchOvers: UInt = 0u,
    public var wszRemoteEndpointAddress: UShortArray = UShortArray(65),
    public var wszLocalEndpointAddress: UShortArray = UShortArray(65),
    public var ProjectionInfo: PROJECTION_INFO2 = PROJECTION_INFO2(),
    public var hConnection: HANDLE = 0L,
    public var hInterface: HANDLE = 0L,
    public var dwDeviceType: UInt = 0u,
)

public class RAS_CONNECTION_EX(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: ROUTER_INTERFACE_TYPE = 0,
    public var dwConnectionFlags: RAS_FLAGS = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
    public var guid: GUID = GUID(),
    public var rasQuarState: RAS_QUARANTINE_STATE = 0,
    public var probationTime: FILETIME = FILETIME(),
    public var dwBytesXmited: UInt = 0u,
    public var dwBytesRcved: UInt = 0u,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
    public var dwNumSwitchOvers: UInt = 0u,
    public var wszRemoteEndpointAddress: UShortArray = UShortArray(65),
    public var wszLocalEndpointAddress: UShortArray = UShortArray(65),
    public var ProjectionInfo: PROJECTION_INFO = PROJECTION_INFO(),
    public var hConnection: HANDLE = 0L,
    public var hInterface: HANDLE = 0L,
)

public data class RAS_PORT_0(
    public var hPort: HANDLE = 0L,
    public var hConnection: HANDLE = 0L,
    public var dwPortCondition: RAS_PORT_CONDITION = 0,
    public var dwTotalNumberOfCalls: UInt = 0u,
    public var dwConnectDuration: UInt = 0u,
    public var wszPortName: UShortArray = UShortArray(17),
    public var wszMediaName: UShortArray = UShortArray(17),
    public var wszDeviceName: UShortArray = UShortArray(129),
    public var wszDeviceType: UShortArray = UShortArray(17),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_PORT_0) return false
        if (this.hPort != other.hPort) return false
        if (this.hConnection != other.hConnection) return false
        if (this.dwPortCondition != other.dwPortCondition) return false
        if (this.dwTotalNumberOfCalls != other.dwTotalNumberOfCalls) return false
        if (this.dwConnectDuration != other.dwConnectDuration) return false
        if (!this.wszPortName.contentEquals(other.wszPortName)) return false
        if (!this.wszMediaName.contentEquals(other.wszMediaName)) return false
        if (!this.wszDeviceName.contentEquals(other.wszDeviceName)) return false
        if (!this.wszDeviceType.contentEquals(other.wszDeviceType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPort.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        result = 31 * result + this.dwPortCondition.hashCode()
        result = 31 * result + this.dwTotalNumberOfCalls.hashCode()
        result = 31 * result + this.dwConnectDuration.hashCode()
        result = 31 * result + this.wszPortName.contentHashCode()
        result = 31 * result + this.wszMediaName.contentHashCode()
        result = 31 * result + this.wszDeviceName.contentHashCode()
        result = 31 * result + this.wszDeviceType.contentHashCode()
        return result
    }
}

public data class RAS_PORT_1(
    public var hPort: HANDLE = 0L,
    public var hConnection: HANDLE = 0L,
    public var dwHardwareCondition: RAS_HARDWARE_CONDITION = 0,
    public var dwLineSpeed: UInt = 0u,
    public var dwBytesXmited: UInt = 0u,
    public var dwBytesRcved: UInt = 0u,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
)

public class RAS_PORT_2(
    public var hPort: HANDLE = 0L,
    public var hConnection: HANDLE = 0L,
    public var dwConn_State: UInt = 0u,
    public var wszPortName: UShortArray = UShortArray(17),
    public var wszMediaName: UShortArray = UShortArray(17),
    public var wszDeviceName: UShortArray = UShortArray(129),
    public var wszDeviceType: UShortArray = UShortArray(17),
    public var dwHardwareCondition: RAS_HARDWARE_CONDITION = 0,
    public var dwLineSpeed: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwSerialOverRunErrs: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
    public var dwTotalErrors: UInt = 0u,
    public var ullBytesXmited: ULong = 0uL,
    public var ullBytesRcved: ULong = 0uL,
    public var ullFramesXmited: ULong = 0uL,
    public var ullFramesRcved: ULong = 0uL,
    public var ullBytesTxUncompressed: ULong = 0uL,
    public var ullBytesTxCompressed: ULong = 0uL,
    public var ullBytesRcvUncompressed: ULong = 0uL,
    public var ullBytesRcvCompressed: ULong = 0uL,
)

public data class RAS_PROJECTION_INFO(
    public var version: RASAPIVERSION = 0,
    public var type: RASPROJECTION_INFO_TYPE = 0,
    public var Anonymous: RAS_PROJECTION_INFO_0 = RAS_PROJECTION_INFO_0(),
)

public data class RAS_PROJECTION_INFO_0(public var ppp: RASPPP_PROJECTION_INFO = RASPPP_PROJECTION_INFO(), public var ikev2: RASIKEV2_PROJECTION_INFO = RASIKEV2_PROJECTION_INFO())

public data class RAS_SECURITY_INFO(
    public var LastError: UInt = 0u,
    public var BytesReceived: UInt = 0u,
    public var DeviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_SECURITY_INFO) return false
        if (this.LastError != other.LastError) return false
        if (this.BytesReceived != other.BytesReceived) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LastError.hashCode()
        result = 31 * result + this.BytesReceived.hashCode()
        result = 31 * result + this.DeviceName.contentHashCode()
        return result
    }
}

public data class RAS_STATS(
    public var dwSize: UInt = 0u,
    public var dwBytesXmited: UInt = 0u,
    public var dwBytesRcved: UInt = 0u,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
    public var dwBps: UInt = 0u,
    public var dwConnectDuration: UInt = 0u,
)

public data class RAS_UPDATE_CONNECTION(
    public var Header: MPRAPI_OBJECT_HEADER = MPRAPI_OBJECT_HEADER(),
    public var dwIfIndex: UInt = 0u,
    public var wszLocalEndpointAddress: UShortArray = UShortArray(65),
    public var wszRemoteEndpointAddress: UShortArray = UShortArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_UPDATE_CONNECTION) return false
        if (this.Header != other.Header) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (!this.wszLocalEndpointAddress.contentEquals(other.wszLocalEndpointAddress)) return false
        if (!this.wszRemoteEndpointAddress.contentEquals(other.wszRemoteEndpointAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.wszLocalEndpointAddress.contentHashCode()
        result = 31 * result + this.wszRemoteEndpointAddress.contentHashCode()
        return result
    }
}

public data class RAS_USER_0(public var bfPrivilege: UByte = 0u, public var wszPhoneNumber: UShortArray = UShortArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_USER_0) return false
        if (this.bfPrivilege != other.bfPrivilege) return false
        if (!this.wszPhoneNumber.contentEquals(other.wszPhoneNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bfPrivilege.hashCode()
        result = 31 * result + this.wszPhoneNumber.contentHashCode()
        return result
    }
}

public data class RAS_USER_1(
    public var bfPrivilege: UByte = 0u,
    public var wszPhoneNumber: UShortArray = UShortArray(129),
    public var bfPrivilege2: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAS_USER_1) return false
        if (this.bfPrivilege != other.bfPrivilege) return false
        if (!this.wszPhoneNumber.contentEquals(other.wszPhoneNumber)) return false
        if (this.bfPrivilege2 != other.bfPrivilege2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bfPrivilege.hashCode()
        result = 31 * result + this.wszPhoneNumber.contentHashCode()
        result = 31 * result + this.bfPrivilege2.hashCode()
        return result
    }
}

public data class ROUTER_CUSTOM_IKEv2_POLICY0(
    public var dwIntegrityMethod: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
    public var dwCipherTransformConstant: UInt = 0u,
    public var dwAuthTransformConstant: UInt = 0u,
    public var dwPfsGroup: UInt = 0u,
    public var dwDhGroup: UInt = 0u,
)

public data class ROUTER_IKEv2_IF_CUSTOM_CONFIG0(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var customPolicy: Long = 0L,
)

public data class ROUTER_IKEv2_IF_CUSTOM_CONFIG1(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var customPolicy: Long = 0L,
    public var certificateHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class ROUTER_IKEv2_IF_CUSTOM_CONFIG2(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var customPolicy: Long = 0L,
    public var certificateHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwMmSaLifeTime: UInt = 0u,
    public var vpnTrafficSelectors: MPR_VPN_TRAFFIC_SELECTORS = MPR_VPN_TRAFFIC_SELECTORS(),
)

public data class ROUTING_PROTOCOL_CONFIG(
    public var dwCallbackFlags: UInt = 0u,
    public var pfnRpfCallback: PMGM_RPF_CALLBACK = null,
    public var pfnCreationAlertCallback: PMGM_CREATION_ALERT_CALLBACK = null,
    public var pfnPruneAlertCallback: PMGM_PRUNE_ALERT_CALLBACK = null,
    public var pfnJoinAlertCallback: PMGM_JOIN_ALERT_CALLBACK = null,
    public var pfnWrongIfCallback: PMGM_WRONG_IF_CALLBACK = null,
    public var pfnLocalJoinCallback: PMGM_LOCAL_JOIN_CALLBACK = null,
    public var pfnLocalLeaveCallback: PMGM_LOCAL_LEAVE_CALLBACK = null,
    public var pfnDisableIgmpCallback: PMGM_DISABLE_IGMP_CALLBACK = null,
    public var pfnEnableIgmpCallback: PMGM_ENABLE_IGMP_CALLBACK = null,
)

public data class RTM_DEST_INFO(
    public var DestHandle: Long = 0L,
    public var DestAddress: RTM_NET_ADDRESS = RTM_NET_ADDRESS(),
    public var LastChanged: FILETIME = FILETIME(),
    public var BelongsToViews: UInt = 0u,
    public var NumberOfViews: UInt = 0u,
    public var ViewInfo: List<RTM_DEST_INFO_0> = List(1) { RTM_DEST_INFO_0() },
)

public data class RTM_DEST_INFO_0(
    public var ViewId: Int = 0,
    public var NumRoutes: UInt = 0u,
    public var Route: Long = 0L,
    public var Owner: Long = 0L,
    public var DestFlags: UInt = 0u,
    public var HoldRoute: Long = 0L,
)

public data class RTM_ENTITY_EXPORT_METHODS(public var NumMethods: UInt = 0u, public var Methods: List<RTM_ENTITY_EXPORT_METHOD> = List(1) { null })

public data class RTM_ENTITY_ID(public var Anonymous: RTM_ENTITY_ID_0 = RTM_ENTITY_ID_0())

public data class RTM_ENTITY_ID_0(public var Anonymous: RTM_ENTITY_ID_0_0 = RTM_ENTITY_ID_0_0(), public var EntityId: ULong = 0uL)

public data class RTM_ENTITY_ID_0_0(public var EntityProtocolId: UInt = 0u, public var EntityInstanceId: UInt = 0u)

public data class RTM_ENTITY_INFO(
    public var RtmInstanceId: UShort = 0u,
    public var AddressFamily: UShort = 0u,
    public var EntityId: RTM_ENTITY_ID = RTM_ENTITY_ID(),
)

public data class RTM_ENTITY_METHOD_INPUT(
    public var MethodType: UInt = 0u,
    public var InputSize: UInt = 0u,
    public var InputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTM_ENTITY_METHOD_INPUT) return false
        if (this.MethodType != other.MethodType) return false
        if (this.InputSize != other.InputSize) return false
        if (!this.InputData.contentEquals(other.InputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MethodType.hashCode()
        result = 31 * result + this.InputSize.hashCode()
        result = 31 * result + this.InputData.contentHashCode()
        return result
    }
}

public data class RTM_ENTITY_METHOD_OUTPUT(
    public var MethodType: UInt = 0u,
    public var MethodStatus: UInt = 0u,
    public var OutputSize: UInt = 0u,
    public var OutputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTM_ENTITY_METHOD_OUTPUT) return false
        if (this.MethodType != other.MethodType) return false
        if (this.MethodStatus != other.MethodStatus) return false
        if (this.OutputSize != other.OutputSize) return false
        if (!this.OutputData.contentEquals(other.OutputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MethodType.hashCode()
        result = 31 * result + this.MethodStatus.hashCode()
        result = 31 * result + this.OutputSize.hashCode()
        result = 31 * result + this.OutputData.contentHashCode()
        return result
    }
}

public data class RTM_NET_ADDRESS(
    public var AddressFamily: UShort = 0u,
    public var NumBits: UShort = 0u,
    public var AddrBits: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTM_NET_ADDRESS) return false
        if (this.AddressFamily != other.AddressFamily) return false
        if (this.NumBits != other.NumBits) return false
        if (!this.AddrBits.contentEquals(other.AddrBits)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressFamily.hashCode()
        result = 31 * result + this.NumBits.hashCode()
        result = 31 * result + this.AddrBits.contentHashCode()
        return result
    }
}

public data class RTM_NEXTHOP_INFO(
    public var NextHopAddress: RTM_NET_ADDRESS = RTM_NET_ADDRESS(),
    public var NextHopOwner: Long = 0L,
    public var InterfaceIndex: UInt = 0u,
    public var State: UShort = 0u,
    public var Flags: UShort = 0u,
    public var EntitySpecificInfo: Long = 0L,
    public var RemoteNextHop: Long = 0L,
)

public data class RTM_NEXTHOP_LIST(public var NumNextHops: UShort = 0u, public var NextHops: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTM_NEXTHOP_LIST) return false
        if (this.NumNextHops != other.NumNextHops) return false
        if (!this.NextHops.contentEquals(other.NextHops)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumNextHops.hashCode()
        result = 31 * result + this.NextHops.contentHashCode()
        return result
    }
}

public data class RTM_PREF_INFO(public var Metric: UInt = 0u, public var Preference: UInt = 0u)

public data class RTM_REGN_PROFILE(
    public var MaxNextHopsInRoute: UInt = 0u,
    public var MaxHandlesInEnum: UInt = 0u,
    public var ViewsSupported: UInt = 0u,
    public var NumberOfViews: UInt = 0u,
)

public data class RTM_ROUTE_INFO(
    public var DestHandle: Long = 0L,
    public var RouteOwner: Long = 0L,
    public var Neighbour: Long = 0L,
    public var State: UByte = 0u,
    public var Flags1: UByte = 0u,
    public var Flags: UShort = 0u,
    public var PrefInfo: RTM_PREF_INFO = RTM_PREF_INFO(),
    public var BelongsToViews: UInt = 0u,
    public var EntitySpecificInfo: Long = 0L,
    public var NextHopsList: RTM_NEXTHOP_LIST = RTM_NEXTHOP_LIST(),
)

public data class SECURITY_MESSAGE(
    public var dwMsgId: SECURITY_MESSAGE_MSG_ID = 0u,
    public var hPort: Long = 0L,
    public var dwError: UInt = 0u,
    public var UserName: ByteArray = ByteArray(257),
    public var Domain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECURITY_MESSAGE) return false
        if (this.dwMsgId != other.dwMsgId) return false
        if (this.hPort != other.hPort) return false
        if (this.dwError != other.dwError) return false
        if (!this.UserName.contentEquals(other.UserName)) return false
        if (!this.Domain.contentEquals(other.Domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgId.hashCode()
        result = 31 * result + this.hPort.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.UserName.contentHashCode()
        result = 31 * result + this.Domain.contentHashCode()
        return result
    }
}

public data class SOURCE_GROUP_ENTRY(
    public var dwSourceAddr: UInt = 0u,
    public var dwSourceMask: UInt = 0u,
    public var dwGroupAddr: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
)

public data class SSTP_CERT_INFO(public var isDefault: BOOL = 0, public var certBlob: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class SSTP_CONFIG_PARAMS(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var isUseHttps: BOOL = 0,
    public var certAlgorithm: UInt = 0u,
    public var sstpCertDetails: SSTP_CERT_INFO = SSTP_CERT_INFO(),
)

public data class VPN_TS_IP_ADDRESS(public var Type: UShort = 0u, public var Anonymous: VPN_TS_IP_ADDRESS_0 = VPN_TS_IP_ADDRESS_0())

public data class VPN_TS_IP_ADDRESS_0(public var v4: IN_ADDR = IN_ADDR(), public var v6: IN6_ADDR = IN6_ADDR())
