@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob

public data class AuthValidationEx(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var hRasConnection: Handle = null,
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var authInfoSize: UInt = 0u,
    public var authInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthValidationEx) return false
        if (this.header != other.header) return false
        if (this.hRasConnection != other.hRasConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszLogonDomain.contentEquals(other.wszLogonDomain)) return false
        if (this.authInfoSize != other.authInfoSize) return false
        if (!this.authInfo.contentEquals(other.authInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.hRasConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.wszLogonDomain.contentHashCode()
        result = 31 * result + this.authInfoSize.hashCode()
        result = 31 * result + this.authInfo.contentHashCode()
        return result
    }
}

public data class GreConfigParams0(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class Ikev2ConfigParams(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var tunnelConfigParams: Ikev2TunnelConfigParams4 = Ikev2TunnelConfigParams4(),
)

public data class Ikev2ProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2ProjectionInfo) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.iPv4SubInterfaceIndex != other.iPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.iPv6SubInterfaceIndex != other.iPv6SubInterfaceIndex) return false
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
        result = 31 * result + this.iPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.iPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }
}

public data class Ikev2ProjectionInfo2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwEmbeddedEAPTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2ProjectionInfo2) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.iPv4SubInterfaceIndex != other.iPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.iPv6SubInterfaceIndex != other.iPv6SubInterfaceIndex) return false
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
        result = 31 * result + this.iPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.iPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwEmbeddedEAPTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }
}

public data class Ikev2TunnelConfigParams2(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: CryptIntegerBlob? = null,
    public var machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: RouterCustomIkev2Policy0? = null,
)

public data class Ikev2TunnelConfigParams3(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: CryptIntegerBlob? = null,
    public var machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: RouterCustomIkev2Policy0? = null,
    public var dwTotalEkus: UInt = 0u,
    public var certificateEKUs: MprCertEku? = null,
    public var machineCertificateHash: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class Ikev2TunnelConfigParams4(
    public var dwIdleTimeout: UInt = 0u,
    public var dwNetworkBlackoutTime: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var dwConfigOptions: UInt = 0u,
    public var dwTotalCertificates: UInt = 0u,
    public var certificateNames: CryptIntegerBlob? = null,
    public var machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwEncryptionType: UInt = 0u,
    public var customPolicy: RouterCustomIkev2Policy0? = null,
    public var dwTotalEkus: UInt = 0u,
    public var certificateEKUs: MprCertEku? = null,
    public var machineCertificateHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwMmSaLifeTime: UInt = 0u,
)

public data class L2tpConfigParams0(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class L2tpConfigParams1(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var tunnelConfigParams: L2tpTunnelConfigParams2 = L2tpTunnelConfigParams2(),
)

public data class L2tpTunnelConfigParams1(
    public var dwIdleTimeout: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var customPolicy: RouterCustomIkev2Policy0? = null,
)

public data class L2tpTunnelConfigParams2(
    public var dwIdleTimeout: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSizeForRenegotiation: UInt = 0u,
    public var customPolicy: RouterCustomIkev2Policy0? = null,
    public var dwMmSaLifeTime: UInt = 0u,
)

public data class MgmIfEntry(
    public var dwIfIndex: UInt = 0u,
    public var dwIfNextHopAddr: UInt = 0u,
    public var bIGMP: Bool = 0,
    public var bIsEnabled: Bool = 0,
)

public data class MprapiAdminDllCallbacks(
    public var revision: UByte = 0u,
    public var lpfnMprAdminGetIpAddressForUser: Pmpradmingetipaddressforuser = null,
    public var lpfnMprAdminReleaseIpAddress: Pmpradminreleaseipadress = null,
    public var lpfnMprAdminGetIpv6AddressForUser: Pmpradmingetipv6addressforuser = null,
    public var lpfnMprAdminReleaseIpV6AddressForUser: Pmpradminreleaseipv6addressforuser = null,
    public var lpfnRasAdminAcceptNewLink: Pmpradminacceptnewlink = null,
    public var lpfnRasAdminLinkHangupNotification: Pmpradminlinkhangupnotification = null,
    public var lpfnRasAdminTerminateDll: Pmpradminterminatedll = null,
    public var lpfnRasAdminAcceptNewConnectionEx: Pmpradminacceptnewconnectionex = null,
    public var lpfnRasAdminAcceptEndpointChangeEx: Pmpradminaccepttunnelendpointchangeex = null,
    public var lpfnRasAdminAcceptReauthenticationEx: Pmpradminacceptreauthenticationex = null,
    public var lpfnRasAdminConnectionHangupNotificationEx: Pmpradminconnectionhangupnotificationex = null,
    public var lpfnRASValidatePreAuthenticatedConnectionEx: Pmpradminrasvalidatepreauthenticatedconnectionex = null,
)

public data class MprapiObjectHeader(
    public var revision: UByte = 0u,
    public var type: UByte = 0u,
    public var size: UShort = 0u,
)

public data class MprapiTunnelConfigParams0(
    public var ikeConfigParams: Ikev2ConfigParams = Ikev2ConfigParams(),
    public var pptpConfigParams: PptpConfigParams = PptpConfigParams(),
    public var l2tpConfigParams: L2tpConfigParams1 = L2tpConfigParams1(),
    public var sstpConfigParams: SstpConfigParams = SstpConfigParams(),
)

public data class MprapiTunnelConfigParams1(
    public var ikeConfigParams: Ikev2ConfigParams = Ikev2ConfigParams(),
    public var pptpConfigParams: PptpConfigParams = PptpConfigParams(),
    public var l2tpConfigParams: L2tpConfigParams1 = L2tpConfigParams1(),
    public var sstpConfigParams: SstpConfigParams = SstpConfigParams(),
    public var gREConfigParams: GreConfigParams0 = GreConfigParams0(),
)

public data class MprCertEku(
    public var dwSize: UInt = 0u,
    public var isEKUOID: Bool = 0,
    public var pwszEKU: Pwstr = null,
)

public data class MprCredentialsex0(public var dwSize: UInt = 0u, public var lpbCredentialsInfo: COpaquePointer? = null)

public data class MprCredentialsex1(public var dwSize: UInt = 0u, public var lpbCredentialsInfo: COpaquePointer? = null)

public data class MprDevice0(public var szDeviceType: UShortArray = UShortArray(17), public var szDeviceName: UShortArray = UShortArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprDevice0) return false
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

public data class MprDevice1(
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprDevice1) return false
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

public data class MprFilter0(public var fEnable: Bool = 0)

public data class MprIftransport0(
    public var dwTransportId: UInt = 0u,
    public var hIfTransport: Handle = null,
    public var wszIfTransportName: UShortArray = UShortArray(41),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprIftransport0) return false
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

public data class MprIfCustominfoex0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig0 = RouterIkev2IfCustomConfig0(),
)

public data class MprIfCustominfoex1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig1 = RouterIkev2IfCustomConfig1(),
)

public data class MprIfCustominfoex2(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig2 = RouterIkev2IfCustomConfig2(),
)

public data class MprInterface0(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: Handle = null,
    public var fEnabled: Bool = 0,
    public var dwIfType: RouterInterfaceType = 0,
    public var dwConnectionState: RouterConnectionState = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprInterface0) return false
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

public data class MprInterface1(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: Handle = null,
    public var fEnabled: Bool = 0,
    public var dwIfType: RouterInterfaceType = 0,
    public var dwConnectionState: RouterConnectionState = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var lpwsDialoutHoursRestriction: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprInterface1) return false
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

public class MprInterface2(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: Handle = null,
    public var fEnabled: Bool = 0,
    public var dwIfType: RouterInterfaceType = 0,
    public var dwConnectionState: RouterConnectionState = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: Pwstr = null,
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
    public var dwDialMode: MprInterfaceDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: MprEt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var dwCustomAuthDataSize: UInt = 0u,
    public var lpbCustomAuthData: COpaquePointer? = null,
    public var guidId: Guid = Guid(),
    public var dwVpnStrategy: MprVs = 0u,
)

public class MprInterface3(
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var hInterface: Handle = null,
    public var fEnabled: Bool = 0,
    public var dwIfType: RouterInterfaceType = 0,
    public var dwConnectionState: RouterConnectionState = 0,
    public var fUnReachabilityReasons: UInt = 0u,
    public var dwLastError: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var szAlternates: Pwstr = null,
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
    public var dwDialMode: MprInterfaceDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: MprEt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var dwCustomAuthDataSize: UInt = 0u,
    public var lpbCustomAuthData: COpaquePointer? = null,
    public var guidId: Guid = Guid(),
    public var dwVpnStrategy: MprVs = 0u,
    public var addressCount: UInt = 0u,
    public var ipv6addrDns: In6Addr = In6Addr(),
    public var ipv6addrDnsAlt: In6Addr = In6Addr(),
    public var ipv6addr: In6Addr? = null,
)

public data class MprIpinipInterface0(public var wszFriendlyName: UShortArray = UShortArray(257), public var guid: Guid = Guid()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprIpinipInterface0) return false
        if (!this.wszFriendlyName.contentEquals(other.wszFriendlyName)) return false
        if (this.guid != other.guid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszFriendlyName.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        return result
    }
}

public data class MprServer0(
    public var fLanOnlyMode: Bool = 0,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
)

public data class MprServer1(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
)

public data class MprServer2(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
    public var dwNumSstpPorts: UInt = 0u,
    public var dwSstpPortFlags: UInt = 0u,
)

public data class MprServerEx0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var reserved: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams0 = MprapiTunnelConfigParams0(),
)

public data class MprServerEx1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var reserved: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams1 = MprapiTunnelConfigParams1(),
)

public data class MprServerSetConfigEx0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var setConfigForProtocols: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams0 = MprapiTunnelConfigParams0(),
)

public data class MprServerSetConfigEx1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var setConfigForProtocols: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams1 = MprapiTunnelConfigParams1(),
)

public data class MprTransport0(
    public var dwTransportId: UInt = 0u,
    public var hTransport: Handle = null,
    public var wszTransportName: UShortArray = UShortArray(41),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprTransport0) return false
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

public data class MprVpnTrafficSelector(
    public var type: MprVpnTsType = 0,
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var tsPayloadId: UShort = 0u,
    public var addrStart: VpnTsIpAddress = VpnTsIpAddress(),
    public var addrEnd: VpnTsIpAddress = VpnTsIpAddress(),
)

public data class MprVpnTrafficSelectors(
    public var numTsi: UInt = 0u,
    public var numTsr: UInt = 0u,
    public var tsI: MprVpnTrafficSelector? = null,
    public var tsR: MprVpnTrafficSelector? = null,
)

public data class PppAtcpInfo(public var dwError: UInt = 0u, public var wszAddress: UShortArray = UShortArray(33)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppAtcpInfo) return false
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

public data class PppCcpInfo(
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
)

public data class PppInfo(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo = PppIpcpInfo(),
    public var ipx: PppIpxcpInfo = PppIpxcpInfo(),
    public var at: PppAtcpInfo = PppAtcpInfo(),
)

public data class PppInfo2(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo2 = PppIpcpInfo2(),
    public var ipx: PppIpxcpInfo = PppIpxcpInfo(),
    public var at: PppAtcpInfo = PppAtcpInfo(),
    public var ccp: PppCcpInfo = PppCcpInfo(),
    public var lcp: PppLcpInfo = PppLcpInfo(),
)

public data class PppInfo3(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo2 = PppIpcpInfo2(),
    public var ipv6: PppIpv6CpInfo = PppIpv6CpInfo(),
    public var ccp: PppCcpInfo = PppCcpInfo(),
    public var lcp: PppLcpInfo = PppLcpInfo(),
)

public data class PppIpcpInfo(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpcpInfo) return false
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

public data class PppIpcpInfo2(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpcpInfo2) return false
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

public data class PppIpv6CpInfo(
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
        if (other !is PppIpv6CpInfo) return false
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

public data class PppIpxcpInfo(public var dwError: UInt = 0u, public var wszAddress: UShortArray = UShortArray(23)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpxcpInfo) return false
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

public data class PppLcpInfo(
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: UInt = 0u,
    public var dwRemoteAuthenticationData: UInt = 0u,
    public var dwTerminateReason: UInt = 0u,
    public var dwRemoteTerminateReason: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
)

public data class PppNbfcpInfo(public var dwError: UInt = 0u, public var wszWksta: UShortArray = UShortArray(17)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppNbfcpInfo) return false
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

public class PppProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: PppLcp = 0u,
    public var dwRemoteAuthenticationData: PppLcpInfoAuthData = 0u,
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

public class PppProjectionInfo2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: PppLcp = 0u,
    public var dwRemoteAuthenticationData: PppLcpInfoAuthData = 0u,
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

public data class PptpConfigParams(public var dwNumPorts: UInt = 0u, public var dwPortFlags: UInt = 0u)

public data class ProjectionInfo(public var projectionInfoType: UByte = 0u, public var anonymous: ProjectionInfo0 = ProjectionInfo0())

public data class ProjectionInfo0(public var pppProjectionInfo: PppProjectionInfo = PppProjectionInfo(), public var ikev2ProjectionInfo: Ikev2ProjectionInfo = Ikev2ProjectionInfo())

public data class ProjectionInfo2(public var projectionInfoType: UByte = 0u, public var anonymous: ProjectionInfo20 = ProjectionInfo20())

public data class ProjectionInfo20(public var pppProjectionInfo: PppProjectionInfo2 = PppProjectionInfo2(), public var ikev2ProjectionInfo: Ikev2ProjectionInfo2 = Ikev2ProjectionInfo2())

public data class Rasadparams(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
)

public data class Rasamba(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasamba) return false
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

public data class Rasambw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasambw) return false
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

public data class Rasautodialentrya(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: ByteArray = ByteArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasautodialentrya) return false
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

public data class Rasautodialentryw(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: UShortArray = UShortArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasautodialentryw) return false
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

public data class Rascommsettings(
    public var dwSize: UInt = 0u,
    public var bParity: UByte = 0u,
    public var bStop: UByte = 0u,
    public var bByteSize: UByte = 0u,
    public var bAlign: UByte = 0u,
)

public data class Rasconna(
    public var dwSize: UInt = 0u,
    public var hrasconn: Hrasconn = null,
    public var szEntryName: ByteArray = ByteArray(257),
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szPhonebook: ByteArray = ByteArray(260),
    public var dwSubEntry: UInt = 0u,
    public var guidEntry: Guid = Guid(),
    public var dwFlags: UInt = 0u,
    public var luid: Luid = Luid(),
    public var guidCorrelationId: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconna) return false
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

public data class Rasconnstatusa(
    public var dwSize: UInt = 0u,
    public var rasconnstate: Rasconnstate = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szPhoneNumber: ByteArray = ByteArray(129),
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var rasconnsubstate: Rasconnsubstate = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnstatusa) return false
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

public data class Rasconnstatusw(
    public var dwSize: UInt = 0u,
    public var rasconnstate: Rasconnstate = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szPhoneNumber: UShortArray = UShortArray(129),
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var rasconnsubstate: Rasconnsubstate = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnstatusw) return false
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

public data class Rasconnw(
    public var dwSize: UInt = 0u,
    public var hrasconn: Hrasconn = null,
    public var szEntryName: UShortArray = UShortArray(257),
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szPhonebook: UShortArray = UShortArray(260),
    public var dwSubEntry: UInt = 0u,
    public var guidEntry: Guid = Guid(),
    public var dwFlags: UInt = 0u,
    public var luid: Luid = Luid(),
    public var guidCorrelationId: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnw) return false
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

public data class Rascredentialsa(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rascredentialsa) return false
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

public data class Rascredentialsw(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rascredentialsw) return false
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

public data class Rasctryinfo(
    public var dwSize: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwNextCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwCountryNameOffset: UInt = 0u,
)

public data class Rascustomscriptextensions(public var dwSize: UInt = 0u, public var pfnRasSetCommSettings: Pfnrassetcommsettings = null)

public data class Rasdevinfoa(
    public var dwSize: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdevinfoa) return false
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

public data class Rasdevinfow(
    public var dwSize: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdevinfow) return false
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

public data class Rasdevspecificinfo(public var dwSize: UInt = 0u, public var pbDevSpecificInfo: COpaquePointer? = null)

public data class Rasdialdlg(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwSubEntry: UInt = 0u,
    public var dwError: UInt = 0u,
    public var reserved: Int = 0,
    public var reserved2: Int = 0,
)

public data class Rasdialextensions(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var reserved: Int = 0,
    public var reserved1: Int = 0,
    public var rasEapInfo: Raseapinfo = Raseapinfo(),
    public var fSkipPppAuth: Bool = 0,
    public var rasDevSpecificInfo: Rasdevspecificinfo = Rasdevspecificinfo(),
)

public data class Rasdialparamsa(
    public var dwSize: UInt = 0u,
    public var szEntryName: ByteArray = ByteArray(257),
    public var szPhoneNumber: ByteArray = ByteArray(129),
    public var szCallbackNumber: ByteArray = ByteArray(129),
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
    public var dwSubEntry: UInt = 0u,
    public var dwCallbackId: Int = 0,
    public var dwIfIndex: UInt = 0u,
    public var szEncPassword: Pstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialparamsa) return false
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

public data class Rasdialparamsw(
    public var dwSize: UInt = 0u,
    public var szEntryName: UShortArray = UShortArray(257),
    public var szPhoneNumber: UShortArray = UShortArray(129),
    public var szCallbackNumber: UShortArray = UShortArray(129),
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
    public var dwSubEntry: UInt = 0u,
    public var dwCallbackId: Int = 0,
    public var dwIfIndex: UInt = 0u,
    public var szEncPassword: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialparamsw) return false
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

public data class Raseapinfo(public var dwSizeofEapInfo: UInt = 0u, public var pbEapInfo: COpaquePointer? = null)

public data class Raseapuseridentitya(
    public var szUserName: ByteArray = ByteArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raseapuseridentitya) return false
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

public data class Raseapuseridentityw(
    public var szUserName: UShortArray = UShortArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raseapuseridentityw) return false
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

public class Rasentrya(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: ByteArray = ByteArray(11),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: Rasipaddr = Rasipaddr(),
    public var ipaddrDns: Rasipaddr = Rasipaddr(),
    public var ipaddrDnsAlt: Rasipaddr = Rasipaddr(),
    public var ipaddrWins: Rasipaddr = Rasipaddr(),
    public var ipaddrWinsAlt: Rasipaddr = Rasipaddr(),
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
    public var dwDialMode: RasentryDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: Guid = Guid(),
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
    public var ipv6addrDns: In6Addr = In6Addr(),
    public var ipv6addrDnsAlt: In6Addr = In6Addr(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: In6Addr = In6Addr(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: ByteArray = ByteArray(257),
    public var szIDr: ByteArray = ByteArray(257),
    public var fIsImsConfig: Bool = 0,
    public var idiType: Ikev2IdPayloadType = 0,
    public var idrType: Ikev2IdPayloadType = 0,
    public var fDisableIKEv2Fragmentation: Bool = 0,
)

public data class Rasentrydlga(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var szEntry: ByteArray = ByteArray(257),
    public var dwError: UInt = 0u,
    public var reserved: Int = 0,
    public var reserved2: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrydlga) return false
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

public data class Rasentrydlgw(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var szEntry: UShortArray = UShortArray(257),
    public var dwError: UInt = 0u,
    public var reserved: Int = 0,
    public var reserved2: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrydlgw) return false
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

public data class Rasentrynamea(
    public var dwSize: UInt = 0u,
    public var szEntryName: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrynamea) return false
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

public data class Rasentrynamew(
    public var dwSize: UInt = 0u,
    public var szEntryName: UShortArray = UShortArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrynamew) return false
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

public class Rasentryw(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: UShortArray = UShortArray(11),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: Rasipaddr = Rasipaddr(),
    public var ipaddrDns: Rasipaddr = Rasipaddr(),
    public var ipaddrDnsAlt: Rasipaddr = Rasipaddr(),
    public var ipaddrWins: Rasipaddr = Rasipaddr(),
    public var ipaddrWinsAlt: Rasipaddr = Rasipaddr(),
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
    public var dwDialMode: RasentryDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: Guid = Guid(),
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
    public var ipv6addrDns: In6Addr = In6Addr(),
    public var ipv6addrDnsAlt: In6Addr = In6Addr(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: In6Addr = In6Addr(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: UShortArray = UShortArray(257),
    public var szIDr: UShortArray = UShortArray(257),
    public var fIsImsConfig: Bool = 0,
    public var idiType: Ikev2IdPayloadType = 0,
    public var idrType: Ikev2IdPayloadType = 0,
    public var fDisableIKEv2Fragmentation: Bool = 0,
)

public data class Rasikev2ProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var ipv4Address: InAddr = InAddr(),
    public var ipv4ServerAddress: InAddr = InAddr(),
    public var dwIPv6NegotiationError: UInt = 0u,
    public var ipv6Address: In6Addr = In6Addr(),
    public var ipv6ServerAddress: In6Addr = In6Addr(),
    public var dwPrefixLength: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwFlags: RasikevProjectionInfoFlags = 0u,
    public var dwEncryptionMethod: UInt = 0u,
    public var numIPv4ServerAddresses: UInt = 0u,
    public var ipv4ServerAddresses: InAddr? = null,
    public var numIPv6ServerAddresses: UInt = 0u,
    public var ipv6ServerAddresses: In6Addr? = null,
)

public data class Rasipaddr(
    public var a: UByte = 0u,
    public var b: UByte = 0u,
    public var c: UByte = 0u,
    public var d: UByte = 0u,
)

public data class Rasipxw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: UShortArray = UShortArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasipxw) return false
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

public data class Rasnousera(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasnousera) return false
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

public data class Rasnouserw(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasnouserw) return false
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

public data class Raspbdlga(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwCallbackId: Int = 0,
    public var pCallback: Raspbdlgfunca = null,
    public var dwError: UInt = 0u,
    public var reserved: Int = 0,
    public var reserved2: Int = 0,
)

public data class Raspbdlgw(
    public var dwSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var xDlg: Int = 0,
    public var yDlg: Int = 0,
    public var dwCallbackId: Int = 0,
    public var pCallback: Raspbdlgfuncw = null,
    public var dwError: UInt = 0u,
    public var reserved: Int = 0,
    public var reserved2: Int = 0,
)

public data class Raspppccp(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwServerCompressionAlgorithm: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
)

public data class Raspppipa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: ByteArray = ByteArray(16),
    public var szServerIpAddress: ByteArray = ByteArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipa) return false
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

public data class Raspppipv6(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var bLocalInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPeerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bLocalCompressionProtocol: UByteArray = UByteArray(2),
    public var bPeerCompressionProtocol: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipv6) return false
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

public data class Raspppipw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: UShortArray = UShortArray(16),
    public var szServerIpAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipw) return false
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

public data class Raspppipxa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: ByteArray = ByteArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipxa) return false
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

public data class Rasppplcpa(
    public var dwSize: UInt = 0u,
    public var fBundled: Bool = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: Bool = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: ByteArray = ByteArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasppplcpa) return false
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

public data class Rasppplcpw(
    public var dwSize: UInt = 0u,
    public var fBundled: Bool = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: Bool = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: UShortArray = UShortArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasppplcpw) return false
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

public data class Raspppnbfa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var szWorkstationName: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppnbfa) return false
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

public data class Raspppnbfw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var szWorkstationName: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppnbfw) return false
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

public class RaspppProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var ipv4Address: InAddr = InAddr(),
    public var ipv4ServerAddress: InAddr = InAddr(),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4ServerOptions: UInt = 0u,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bServerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var fBundled: Bool = 0,
    public var fMultilink: Bool = 0,
    public var dwAuthenticationProtocol: RaspppProjectionInfoServerAuthProtocol = 0u,
    public var dwAuthenticationData: RaspppProjectionInfoServerAuthData = 0u,
    public var dwServerAuthenticationProtocol: RaspppProjectionInfoServerAuthProtocol = 0u,
    public var dwServerAuthenticationData: RaspppProjectionInfoServerAuthData = 0u,
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

public data class Rassubentrya(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rassubentrya) return false
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

public data class Rassubentryw(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rassubentryw) return false
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

public data class Rastunnelendpoint(public var dwType: UInt = 0u, public var anonymous: Rastunnelendpoint0 = Rastunnelendpoint0())

public data class Rastunnelendpoint0(public var ipv4: InAddr = InAddr(), public var ipv6: In6Addr = In6Addr())

public data class Rasupdateconn(
    public var version: Rasapiversion = 0,
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
)

public data class RasConnection0(
    public var hConnection: Handle = null,
    public var hInterface: Handle = null,
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: RouterInterfaceType = 0,
    public var dwConnectionFlags: RasFlags = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection0) return false
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

public data class RasConnection1(
    public var hConnection: Handle = null,
    public var hInterface: Handle = null,
    public var pppInfo: PppInfo = PppInfo(),
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

public data class RasConnection2(
    public var hConnection: Handle = null,
    public var wszUserName: UShortArray = UShortArray(257),
    public var dwInterfaceType: RouterInterfaceType = 0,
    public var guid: Guid = Guid(),
    public var pppInfo2: PppInfo2 = PppInfo2(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection2) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.pppInfo2 != other.pppInfo2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.pppInfo2.hashCode()
        return result
    }
}

public data class RasConnection3(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var hConnection: Handle = null,
    public var wszUserName: UShortArray = UShortArray(257),
    public var dwInterfaceType: RouterInterfaceType = 0,
    public var guid: Guid = Guid(),
    public var pppInfo3: PppInfo3 = PppInfo3(),
    public var rasQuarState: RasQuarantineState = 0,
    public var timer: Filetime = Filetime(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection3) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.pppInfo3 != other.pppInfo3) return false
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
        result = 31 * result + this.pppInfo3.hashCode()
        result = 31 * result + this.rasQuarState.hashCode()
        result = 31 * result + this.timer.hashCode()
        return result
    }
}

public class RasConnection4(
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: RouterInterfaceType = 0,
    public var dwConnectionFlags: RasFlags = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
    public var guid: Guid = Guid(),
    public var rasQuarState: RasQuarantineState = 0,
    public var probationTime: Filetime = Filetime(),
    public var connectionStartTime: Filetime = Filetime(),
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
    public var projectionInfo: ProjectionInfo2 = ProjectionInfo2(),
    public var hConnection: Handle = null,
    public var hInterface: Handle = null,
    public var dwDeviceType: UInt = 0u,
)

public class RasConnectionEx(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwConnectDuration: UInt = 0u,
    public var dwInterfaceType: RouterInterfaceType = 0,
    public var dwConnectionFlags: RasFlags = 0u,
    public var wszInterfaceName: UShortArray = UShortArray(257),
    public var wszUserName: UShortArray = UShortArray(257),
    public var wszLogonDomain: UShortArray = UShortArray(16),
    public var wszRemoteComputer: UShortArray = UShortArray(17),
    public var guid: Guid = Guid(),
    public var rasQuarState: RasQuarantineState = 0,
    public var probationTime: Filetime = Filetime(),
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
    public var projectionInfo: ProjectionInfo = ProjectionInfo(),
    public var hConnection: Handle = null,
    public var hInterface: Handle = null,
)

public data class RasPort0(
    public var hPort: Handle = null,
    public var hConnection: Handle = null,
    public var dwPortCondition: RasPortCondition = 0,
    public var dwTotalNumberOfCalls: UInt = 0u,
    public var dwConnectDuration: UInt = 0u,
    public var wszPortName: UShortArray = UShortArray(17),
    public var wszMediaName: UShortArray = UShortArray(17),
    public var wszDeviceName: UShortArray = UShortArray(129),
    public var wszDeviceType: UShortArray = UShortArray(17),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasPort0) return false
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

public data class RasPort1(
    public var hPort: Handle = null,
    public var hConnection: Handle = null,
    public var dwHardwareCondition: RasHardwareCondition = 0,
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

public class RasPort2(
    public var hPort: Handle = null,
    public var hConnection: Handle = null,
    public var dwConnState: UInt = 0u,
    public var wszPortName: UShortArray = UShortArray(17),
    public var wszMediaName: UShortArray = UShortArray(17),
    public var wszDeviceName: UShortArray = UShortArray(129),
    public var wszDeviceType: UShortArray = UShortArray(17),
    public var dwHardwareCondition: RasHardwareCondition = 0,
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

public data class RasProjectionInfo(
    public var version: Rasapiversion = 0,
    public var type: RasprojectionInfoType = 0,
    public var anonymous: RasProjectionInfo0 = RasProjectionInfo0(),
)

public data class RasProjectionInfo0(public var ppp: RaspppProjectionInfo = RaspppProjectionInfo(), public var ikev2: Rasikev2ProjectionInfo = Rasikev2ProjectionInfo())

public data class RasSecurityInfo(
    public var lastError: UInt = 0u,
    public var bytesReceived: UInt = 0u,
    public var deviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasSecurityInfo) return false
        if (this.lastError != other.lastError) return false
        if (this.bytesReceived != other.bytesReceived) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastError.hashCode()
        result = 31 * result + this.bytesReceived.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }
}

public data class RasStats(
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

public data class RasUpdateConnection(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwIfIndex: UInt = 0u,
    public var wszLocalEndpointAddress: UShortArray = UShortArray(65),
    public var wszRemoteEndpointAddress: UShortArray = UShortArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUpdateConnection) return false
        if (this.header != other.header) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (!this.wszLocalEndpointAddress.contentEquals(other.wszLocalEndpointAddress)) return false
        if (!this.wszRemoteEndpointAddress.contentEquals(other.wszRemoteEndpointAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.wszLocalEndpointAddress.contentHashCode()
        result = 31 * result + this.wszRemoteEndpointAddress.contentHashCode()
        return result
    }
}

public data class RasUser0(public var bfPrivilege: UByte = 0u, public var wszPhoneNumber: UShortArray = UShortArray(129)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUser0) return false
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

public data class RasUser1(
    public var bfPrivilege: UByte = 0u,
    public var wszPhoneNumber: UShortArray = UShortArray(129),
    public var bfPrivilege2: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUser1) return false
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

public data class RouterCustomIkev2Policy0(
    public var dwIntegrityMethod: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
    public var dwCipherTransformConstant: UInt = 0u,
    public var dwAuthTransformConstant: UInt = 0u,
    public var dwPfsGroup: UInt = 0u,
    public var dwDhGroup: UInt = 0u,
)

public data class RouterIkev2IfCustomConfig0(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var customPolicy: RouterCustomIkev2Policy0? = null,
)

public data class RouterIkev2IfCustomConfig1(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var customPolicy: RouterCustomIkev2Policy0? = null,
    public var certificateHash: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class RouterIkev2IfCustomConfig2(
    public var dwSaLifeTime: UInt = 0u,
    public var dwSaDataSize: UInt = 0u,
    public var certificateName: CryptIntegerBlob = CryptIntegerBlob(),
    public var customPolicy: RouterCustomIkev2Policy0? = null,
    public var certificateHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwMmSaLifeTime: UInt = 0u,
    public var vpnTrafficSelectors: MprVpnTrafficSelectors = MprVpnTrafficSelectors(),
)

public data class RoutingProtocolConfig(
    public var dwCallbackFlags: UInt = 0u,
    public var pfnRpfCallback: PmgmRpfCallback = null,
    public var pfnCreationAlertCallback: PmgmCreationAlertCallback = null,
    public var pfnPruneAlertCallback: PmgmPruneAlertCallback = null,
    public var pfnJoinAlertCallback: PmgmJoinAlertCallback = null,
    public var pfnWrongIfCallback: PmgmWrongIfCallback = null,
    public var pfnLocalJoinCallback: PmgmLocalJoinCallback = null,
    public var pfnLocalLeaveCallback: PmgmLocalLeaveCallback = null,
    public var pfnDisableIgmpCallback: PmgmDisableIgmpCallback = null,
    public var pfnEnableIgmpCallback: PmgmEnableIgmpCallback = null,
)

public data class RtmDestInfo(
    public var destHandle: Int = 0,
    public var destAddress: RtmNetAddress = RtmNetAddress(),
    public var lastChanged: Filetime = Filetime(),
    public var belongsToViews: UInt = 0u,
    public var numberOfViews: UInt = 0u,
    public var viewInfo: List<RtmDestInfo0> = List(1) { RtmDestInfo0() },
)

public data class RtmDestInfo0(
    public var viewId: Int = 0,
    public var numRoutes: UInt = 0u,
    public var route: Int = 0,
    public var owner: Int = 0,
    public var destFlags: UInt = 0u,
    public var holdRoute: Int = 0,
)

public data class RtmEntityExportMethods(public var numMethods: UInt = 0u, public var methods: List<RtmEntityExportMethod> = List(1) { null })

public data class RtmEntityId(public var anonymous: RtmEntityId0 = RtmEntityId0())

public data class RtmEntityId0(public var anonymous: RtmEntityId00 = RtmEntityId00(), public var entityId: ULong = 0uL)

public data class RtmEntityId00(public var entityProtocolId: UInt = 0u, public var entityInstanceId: UInt = 0u)

public data class RtmEntityInfo(
    public var rtmInstanceId: UShort = 0u,
    public var addressFamily: UShort = 0u,
    public var entityId: RtmEntityId = RtmEntityId(),
)

public data class RtmEntityMethodInput(
    public var methodType: UInt = 0u,
    public var inputSize: UInt = 0u,
    public var inputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmEntityMethodInput) return false
        if (this.methodType != other.methodType) return false
        if (this.inputSize != other.inputSize) return false
        if (!this.inputData.contentEquals(other.inputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.methodType.hashCode()
        result = 31 * result + this.inputSize.hashCode()
        result = 31 * result + this.inputData.contentHashCode()
        return result
    }
}

public data class RtmEntityMethodOutput(
    public var methodType: UInt = 0u,
    public var methodStatus: UInt = 0u,
    public var outputSize: UInt = 0u,
    public var outputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmEntityMethodOutput) return false
        if (this.methodType != other.methodType) return false
        if (this.methodStatus != other.methodStatus) return false
        if (this.outputSize != other.outputSize) return false
        if (!this.outputData.contentEquals(other.outputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.methodType.hashCode()
        result = 31 * result + this.methodStatus.hashCode()
        result = 31 * result + this.outputSize.hashCode()
        result = 31 * result + this.outputData.contentHashCode()
        return result
    }
}

public data class RtmNetAddress(
    public var addressFamily: UShort = 0u,
    public var numBits: UShort = 0u,
    public var addrBits: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmNetAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (this.numBits != other.numBits) return false
        if (!this.addrBits.contentEquals(other.addrBits)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.numBits.hashCode()
        result = 31 * result + this.addrBits.contentHashCode()
        return result
    }
}

public data class RtmNexthopInfo(
    public var nextHopAddress: RtmNetAddress = RtmNetAddress(),
    public var nextHopOwner: Int = 0,
    public var interfaceIndex: UInt = 0u,
    public var state: UShort = 0u,
    public var flags: UShort = 0u,
    public var entitySpecificInfo: COpaquePointer? = null,
    public var remoteNextHop: Int = 0,
)

public data class RtmNexthopList(public var numNextHops: UShort = 0u, public var nextHops: IntArray = IntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmNexthopList) return false
        if (this.numNextHops != other.numNextHops) return false
        if (!this.nextHops.contentEquals(other.nextHops)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numNextHops.hashCode()
        result = 31 * result + this.nextHops.contentHashCode()
        return result
    }
}

public data class RtmPrefInfo(public var metric: UInt = 0u, public var preference: UInt = 0u)

public data class RtmRegnProfile(
    public var maxNextHopsInRoute: UInt = 0u,
    public var maxHandlesInEnum: UInt = 0u,
    public var viewsSupported: UInt = 0u,
    public var numberOfViews: UInt = 0u,
)

public data class RtmRouteInfo(
    public var destHandle: Int = 0,
    public var routeOwner: Int = 0,
    public var neighbour: Int = 0,
    public var state: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags: UShort = 0u,
    public var prefInfo: RtmPrefInfo = RtmPrefInfo(),
    public var belongsToViews: UInt = 0u,
    public var entitySpecificInfo: COpaquePointer? = null,
    public var nextHopsList: RtmNexthopList = RtmNexthopList(),
)

public data class SecurityMessage(
    public var dwMsgId: SecurityMessageMsgId = 0u,
    public var hPort: Int = 0,
    public var dwError: UInt = 0u,
    public var userName: ByteArray = ByteArray(257),
    public var domain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityMessage) return false
        if (this.dwMsgId != other.dwMsgId) return false
        if (this.hPort != other.hPort) return false
        if (this.dwError != other.dwError) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgId.hashCode()
        result = 31 * result + this.hPort.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        return result
    }
}

public data class SourceGroupEntry(
    public var dwSourceAddr: UInt = 0u,
    public var dwSourceMask: UInt = 0u,
    public var dwGroupAddr: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
)

public data class SstpCertInfo(public var isDefault: Bool = 0, public var certBlob: CryptIntegerBlob = CryptIntegerBlob())

public data class SstpConfigParams(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var isUseHttps: Bool = 0,
    public var certAlgorithm: UInt = 0u,
    public var sstpCertDetails: SstpCertInfo = SstpCertInfo(),
)

public data class VpnTsIpAddress(public var type: UShort = 0u, public var anonymous: VpnTsIpAddress0 = VpnTsIpAddress0())

public data class VpnTsIpAddress0(public var v4: InAddr = InAddr(), public var v6: In6Addr = In6Addr())
