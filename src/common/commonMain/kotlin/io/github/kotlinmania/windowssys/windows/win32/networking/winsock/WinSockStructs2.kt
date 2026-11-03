@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class SOCKET_SECURITY_SETTINGS_IPSEC(
    public var SecurityProtocol: SOCKET_SECURITY_PROTOCOL = 0,
    public var SecurityFlags: UInt = 0u,
    public var IpsecFlags: UInt = 0u,
    public var AuthipMMPolicyKey: GUID = GUID(),
    public var AuthipQMPolicyKey: GUID = GUID(),
    public var Reserved: GUID = GUID(),
    public var Reserved2: ULong = 0uL,
    public var UserNameStringLen: UInt = 0u,
    public var DomainNameStringLen: UInt = 0u,
    public var PasswordStringLen: UInt = 0u,
    public var AllStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOCKET_SECURITY_SETTINGS_IPSEC) return false
        if (this.SecurityProtocol != other.SecurityProtocol) return false
        if (this.SecurityFlags != other.SecurityFlags) return false
        if (this.IpsecFlags != other.IpsecFlags) return false
        if (this.AuthipMMPolicyKey != other.AuthipMMPolicyKey) return false
        if (this.AuthipQMPolicyKey != other.AuthipQMPolicyKey) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.UserNameStringLen != other.UserNameStringLen) return false
        if (this.DomainNameStringLen != other.DomainNameStringLen) return false
        if (this.PasswordStringLen != other.PasswordStringLen) return false
        if (!this.AllStrings.contentEquals(other.AllStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SecurityProtocol.hashCode()
        result = 31 * result + this.SecurityFlags.hashCode()
        result = 31 * result + this.IpsecFlags.hashCode()
        result = 31 * result + this.AuthipMMPolicyKey.hashCode()
        result = 31 * result + this.AuthipQMPolicyKey.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.UserNameStringLen.hashCode()
        result = 31 * result + this.DomainNameStringLen.hashCode()
        result = 31 * result + this.PasswordStringLen.hashCode()
        result = 31 * result + this.AllStrings.contentHashCode()
        return result
    }
}

public data class SOCK_NOTIFY_REGISTRATION(
    public var socket: SOCKET = 0uL,
    public var completionKey: Long = 0L,
    public var eventFilter: UShort = 0u,
    public var operation: UByte = 0u,
    public var triggerFlags: UByte = 0u,
    public var registrationResult: UInt = 0u,
)

public data class TCP_ACK_FREQUENCY_PARAMETERS(public var TcpDelayedAckFrequency: UByte = 0u)

public data class TCP_HDR(
    public var th_sport: UShort = 0u,
    public var th_dport: UShort = 0u,
    public var th_seq: UInt = 0u,
    public var th_ack: UInt = 0u,
    public var _bitfield: UByte = 0u,
    public var th_flags: UByte = 0u,
    public var th_win: UShort = 0u,
    public var th_sum: UShort = 0u,
    public var th_urp: UShort = 0u,
)

public data class TCP_ICW_PARAMETERS(public var Level: TCP_ICW_LEVEL = 0)

public class TCP_INFO_v0(
    public var State: TCPSTATE = 0,
    public var Mss: UInt = 0u,
    public var ConnectionTimeMs: ULong = 0uL,
    public var TimestampsEnabled: Boolean = false,
    public var RttUs: UInt = 0u,
    public var MinRttUs: UInt = 0u,
    public var BytesInFlight: UInt = 0u,
    public var Cwnd: UInt = 0u,
    public var SndWnd: UInt = 0u,
    public var RcvWnd: UInt = 0u,
    public var RcvBuf: UInt = 0u,
    public var BytesOut: ULong = 0uL,
    public var BytesIn: ULong = 0uL,
    public var BytesReordered: UInt = 0u,
    public var BytesRetrans: UInt = 0u,
    public var FastRetrans: UInt = 0u,
    public var DupAcksIn: UInt = 0u,
    public var TimeoutEpisodes: UInt = 0u,
    public var SynRetrans: UByte = 0u,
)

public class TCP_INFO_v1(
    public var State: TCPSTATE = 0,
    public var Mss: UInt = 0u,
    public var ConnectionTimeMs: ULong = 0uL,
    public var TimestampsEnabled: Boolean = false,
    public var RttUs: UInt = 0u,
    public var MinRttUs: UInt = 0u,
    public var BytesInFlight: UInt = 0u,
    public var Cwnd: UInt = 0u,
    public var SndWnd: UInt = 0u,
    public var RcvWnd: UInt = 0u,
    public var RcvBuf: UInt = 0u,
    public var BytesOut: ULong = 0uL,
    public var BytesIn: ULong = 0uL,
    public var BytesReordered: UInt = 0u,
    public var BytesRetrans: UInt = 0u,
    public var FastRetrans: UInt = 0u,
    public var DupAcksIn: UInt = 0u,
    public var TimeoutEpisodes: UInt = 0u,
    public var SynRetrans: UByte = 0u,
    public var SndLimTransRwin: UInt = 0u,
    public var SndLimTimeRwin: UInt = 0u,
    public var SndLimBytesRwin: ULong = 0uL,
    public var SndLimTransCwnd: UInt = 0u,
    public var SndLimTimeCwnd: UInt = 0u,
    public var SndLimBytesCwnd: ULong = 0uL,
    public var SndLimTransSnd: UInt = 0u,
    public var SndLimTimeSnd: UInt = 0u,
    public var SndLimBytesSnd: ULong = 0uL,
)

public data class TCP_INITIAL_RTO_PARAMETERS(public var Rtt: UShort = 0u, public var MaxSynRetransmissions: UByte = 0u)

public data class TCP_OPT_FASTOPEN(
    public var Kind: UByte = 0u,
    public var Length: UByte = 0u,
    public var Cookie: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCP_OPT_FASTOPEN) return false
        if (this.Kind != other.Kind) return false
        if (this.Length != other.Length) return false
        if (!this.Cookie.contentEquals(other.Cookie)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Kind.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Cookie.contentHashCode()
        return result
    }
}

public data class TCP_OPT_MSS(
    public var Kind: UByte = 0u,
    public var Length: UByte = 0u,
    public var Mss: UShort = 0u,
)

public data class TCP_OPT_SACK(
    public var Kind: UByte = 0u,
    public var Length: UByte = 0u,
    public var Block: List<TCP_OPT_SACK_0> = List(1) { TCP_OPT_SACK_0() },
)

public data class TCP_OPT_SACK_0(public var Left: UInt = 0u, public var Right: UInt = 0u)

public data class TCP_OPT_SACK_PERMITTED(public var Kind: UByte = 0u, public var Length: UByte = 0u)

public data class TCP_OPT_TS(
    public var Kind: UByte = 0u,
    public var Length: UByte = 0u,
    public var Val: UInt = 0u,
    public var EcR: UInt = 0u,
)

public data class TCP_OPT_UNKNOWN(public var Kind: UByte = 0u, public var Length: UByte = 0u)

public data class TCP_OPT_WS(
    public var Kind: UByte = 0u,
    public var Length: UByte = 0u,
    public var ShiftCnt: UByte = 0u,
)

public data class TIMESTAMPING_CONFIG(public var Flags: UInt = 0u, public var TxTimestampsBuffered: UShort = 0u)

public data class TIMEVAL(public var tv_sec: Int = 0, public var tv_usec: Int = 0)

public data class TRANSMIT_FILE_BUFFERS(
    public var Head: Long = 0L,
    public var HeadLength: UInt = 0u,
    public var Tail: Long = 0L,
    public var TailLength: UInt = 0u,
)

public data class TRANSMIT_PACKETS_ELEMENT(
    public var dwElFlags: UInt = 0u,
    public var cLength: UInt = 0u,
    public var Anonymous: TRANSMIT_PACKETS_ELEMENT_0 = TRANSMIT_PACKETS_ELEMENT_0(),
)

public data class TRANSMIT_PACKETS_ELEMENT_0(public var Anonymous: TRANSMIT_PACKETS_ELEMENT_0_0 = TRANSMIT_PACKETS_ELEMENT_0_0(), public var pBuffer: Long = 0L)

public data class TRANSMIT_PACKETS_ELEMENT_0_0(public var nFileOffset: Long = 0L, public var hFile: Foundation.HANDLE = Foundation.HANDLE())

public data class TRANSPORT_SETTING_ID(public var Guid: GUID = GUID())

public data class VLAN_TAG(public var Anonymous: VLAN_TAG_0 = VLAN_TAG_0(), public var Type: UShort = 0u)

public data class VLAN_TAG_0(public var Tag: UShort = 0u, public var Anonymous: VLAN_TAG_0_0 = VLAN_TAG_0_0())

public data class VLAN_TAG_0_0(public var _bitfield: UShort = 0u)

public data class WCE_DEVICELIST(public var numDevice: UInt = 0u, public var Device: List<WCE_IRDA_DEVICE_INFO> = List(1) { WCE_IRDA_DEVICE_INFO() })

public data class WCE_IRDA_DEVICE_INFO(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var Reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WCE_IRDA_DEVICE_INFO) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaDeviceName.contentEquals(other.irdaDeviceName)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaDeviceName.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WINDOWS_DEVICELIST(public var numDevice: UInt = 0u, public var Device: List<WINDOWS_IRDA_DEVICE_INFO> = List(1) { WINDOWS_IRDA_DEVICE_INFO() })

public data class WINDOWS_IAS_QUERY(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WINDOWS_IAS_QUERY_0 = WINDOWS_IAS_QUERY_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_QUERY) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaClassName.contentEquals(other.irdaClassName)) return false
        if (!this.irdaAttribName.contentEquals(other.irdaAttribName)) return false
        if (this.irdaAttribType != other.irdaAttribType) return false
        if (this.irdaAttribute != other.irdaAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaClassName.contentHashCode()
        result = 31 * result + this.irdaAttribName.contentHashCode()
        result = 31 * result + this.irdaAttribType.hashCode()
        result = 31 * result + this.irdaAttribute.hashCode()
        return result
    }
}

public data class WINDOWS_IAS_QUERY_0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WINDOWS_IAS_QUERY_0_0 = WINDOWS_IAS_QUERY_0_0(),
    public var irdaAttribUsrStr: WINDOWS_IAS_QUERY_0_1 = WINDOWS_IAS_QUERY_0_1(),
)

public data class WINDOWS_IAS_QUERY_0_0(public var Len: UInt = 0u, public var OctetSeq: UByteArray = UByteArray(1024)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_QUERY_0_0) return false
        if (this.Len != other.Len) return false
        if (!this.OctetSeq.contentEquals(other.OctetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Len.hashCode()
        result = 31 * result + this.OctetSeq.contentHashCode()
        return result
    }
}

public data class WINDOWS_IAS_QUERY_0_1(
    public var Len: UInt = 0u,
    public var CharSet: UInt = 0u,
    public var UsrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_QUERY_0_1) return false
        if (this.Len != other.Len) return false
        if (this.CharSet != other.CharSet) return false
        if (!this.UsrStr.contentEquals(other.UsrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Len.hashCode()
        result = 31 * result + this.CharSet.hashCode()
        result = 31 * result + this.UsrStr.contentHashCode()
        return result
    }
}

public data class WINDOWS_IAS_SET(
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WINDOWS_IAS_SET_0 = WINDOWS_IAS_SET_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_SET) return false
        if (!this.irdaClassName.contentEquals(other.irdaClassName)) return false
        if (!this.irdaAttribName.contentEquals(other.irdaAttribName)) return false
        if (this.irdaAttribType != other.irdaAttribType) return false
        if (this.irdaAttribute != other.irdaAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaClassName.contentHashCode()
        result = 31 * result + this.irdaAttribName.contentHashCode()
        result = 31 * result + this.irdaAttribType.hashCode()
        result = 31 * result + this.irdaAttribute.hashCode()
        return result
    }
}

public data class WINDOWS_IAS_SET_0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WINDOWS_IAS_SET_0_0 = WINDOWS_IAS_SET_0_0(),
    public var irdaAttribUsrStr: WINDOWS_IAS_SET_0_1 = WINDOWS_IAS_SET_0_1(),
)

public data class WINDOWS_IAS_SET_0_0(public var Len: UShort = 0u, public var OctetSeq: UByteArray = UByteArray(1024)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_SET_0_0) return false
        if (this.Len != other.Len) return false
        if (!this.OctetSeq.contentEquals(other.OctetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Len.hashCode()
        result = 31 * result + this.OctetSeq.contentHashCode()
        return result
    }
}

public data class WINDOWS_IAS_SET_0_1(
    public var Len: UByte = 0u,
    public var CharSet: UByte = 0u,
    public var UsrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IAS_SET_0_1) return false
        if (this.Len != other.Len) return false
        if (this.CharSet != other.CharSet) return false
        if (!this.UsrStr.contentEquals(other.UsrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Len.hashCode()
        result = 31 * result + this.CharSet.hashCode()
        result = 31 * result + this.UsrStr.contentHashCode()
        return result
    }
}

public data class WINDOWS_IRDA_DEVICE_INFO(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var irdaDeviceHints1: UByte = 0u,
    public var irdaDeviceHints2: UByte = 0u,
    public var irdaCharSet: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINDOWS_IRDA_DEVICE_INFO) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaDeviceName.contentEquals(other.irdaDeviceName)) return false
        if (this.irdaDeviceHints1 != other.irdaDeviceHints1) return false
        if (this.irdaDeviceHints2 != other.irdaDeviceHints2) return false
        if (this.irdaCharSet != other.irdaCharSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaDeviceName.contentHashCode()
        result = 31 * result + this.irdaDeviceHints1.hashCode()
        result = 31 * result + this.irdaDeviceHints2.hashCode()
        result = 31 * result + this.irdaCharSet.hashCode()
        return result
    }
}

public data class WSABUF(public var len: UInt = 0u, public var buf: PSTR = 0L)

public data class WSACOMPLETION(public var Type: WSACOMPLETIONTYPE = 0, public var Parameters: WSACOMPLETION_0 = WSACOMPLETION_0())

public data class WSACOMPLETION_0(
    public var WindowMessage: WSACOMPLETION_0_0 = WSACOMPLETION_0_0(),
    public var Event: WSACOMPLETION_0_1 = WSACOMPLETION_0_1(),
    public var Apc: WSACOMPLETION_0_2 = WSACOMPLETION_0_2(),
    public var Port: WSACOMPLETION_0_3 = WSACOMPLETION_0_3(),
)

public data class WSACOMPLETION_0_2(public var lpOverlapped: Long = 0L, public var lpfnCompletionProc: LPWSAOVERLAPPED_COMPLETION_ROUTINE = null)

public data class WSACOMPLETION_0_1(public var lpOverlapped: Long = 0L)

public data class WSACOMPLETION_0_3(
    public var lpOverlapped: Long = 0L,
    public var hPort: Foundation.HANDLE = Foundation.HANDLE(),
    public var Key: ULong = 0uL,
)

public data class WSACOMPLETION_0_0(
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var uMsg: UInt = 0u,
    public var context: Foundation.WPARAM = Foundation.WPARAM(),
)

public data class WSADATA(
    public var wVersion: UShort = 0u,
    public var wHighVersion: UShort = 0u,
    public var iMaxSockets: UShort = 0u,
    public var iMaxUdpDg: UShort = 0u,
    public var lpVendorInfo: PSTR = 0L,
    public var szDescription: ByteArray = ByteArray(257),
    public var szSystemStatus: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WSADATA) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wHighVersion != other.wHighVersion) return false
        if (this.iMaxSockets != other.iMaxSockets) return false
        if (this.iMaxUdpDg != other.iMaxUdpDg) return false
        if (this.lpVendorInfo != other.lpVendorInfo) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szSystemStatus.contentEquals(other.szSystemStatus)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wVersion.hashCode()
        result = 31 * result + this.wHighVersion.hashCode()
        result = 31 * result + this.iMaxSockets.hashCode()
        result = 31 * result + this.iMaxUdpDg.hashCode()
        result = 31 * result + this.lpVendorInfo.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szSystemStatus.contentHashCode()
        return result
    }
}

public data class WSAMSG(
    public var name: Long = 0L,
    public var namelen: Int = 0,
    public var lpBuffers: Long = 0L,
    public var dwBufferCount: UInt = 0u,
    public var Control: WSABUF = WSABUF(),
    public var dwFlags: UInt = 0u,
)

public data class WSANAMESPACE_INFOA(
    public var NSProviderId: GUID = GUID(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: BOOL = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: PSTR = 0L,
)

public data class WSANAMESPACE_INFOEXA(
    public var NSProviderId: GUID = GUID(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: BOOL = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: PSTR = 0L,
    public var ProviderSpecific: System.Com.BLOB = System.Com.BLOB(),
)

public data class WSANAMESPACE_INFOEXW(
    public var NSProviderId: GUID = GUID(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: BOOL = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: PWSTR = 0L,
    public var ProviderSpecific: System.Com.BLOB = System.Com.BLOB(),
)

public data class WSANAMESPACE_INFOW(
    public var NSProviderId: GUID = GUID(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: BOOL = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: PWSTR = 0L,
)

public data class WSANETWORKEVENTS(public var lNetworkEvents: Int = 0, public var iErrorCode: IntArray = IntArray(10)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WSANETWORKEVENTS) return false
        if (this.lNetworkEvents != other.lNetworkEvents) return false
        if (!this.iErrorCode.contentEquals(other.iErrorCode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lNetworkEvents.hashCode()
        result = 31 * result + this.iErrorCode.contentHashCode()
        return result
    }
}

public data class WSANSCLASSINFOA(
    public var lpszName: PSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValue: Long = 0L,
)

public data class WSANSCLASSINFOW(
    public var lpszName: PWSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValue: Long = 0L,
)

public data class WSAPOLLDATA(
    public var result: Int = 0,
    public var fds: UInt = 0u,
    public var timeout: Int = 0,
    public var fdArray: List<WSAPOLLFD> = List(1) { WSAPOLLFD() },
)

public data class WSAPOLLFD(
    public var fd: SOCKET = 0uL,
    public var events: WSAPOLL_EVENT_FLAGS = 0,
    public var revents: WSAPOLL_EVENT_FLAGS = 0,
)

public data class WSAPROTOCOLCHAIN(public var ChainLen: Int = 0, public var ChainEntries: UIntArray = UIntArray(7)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WSAPROTOCOLCHAIN) return false
        if (this.ChainLen != other.ChainLen) return false
        if (!this.ChainEntries.contentEquals(other.ChainEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ChainLen.hashCode()
        result = 31 * result + this.ChainEntries.contentHashCode()
        return result
    }
}

public class WSAPROTOCOL_INFOA(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var ProviderId: GUID = GUID(),
    public var dwCatalogEntryId: UInt = 0u,
    public var ProtocolChain: WSAPROTOCOLCHAIN = WSAPROTOCOLCHAIN(),
    public var iVersion: Int = 0,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var iProtocolMaxOffset: Int = 0,
    public var iNetworkByteOrder: Int = 0,
    public var iSecurityScheme: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var dwProviderReserved: UInt = 0u,
    public var szProtocol: ByteArray = ByteArray(256),
)

public class WSAPROTOCOL_INFOW(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var ProviderId: GUID = GUID(),
    public var dwCatalogEntryId: UInt = 0u,
    public var ProtocolChain: WSAPROTOCOLCHAIN = WSAPROTOCOLCHAIN(),
    public var iVersion: Int = 0,
    public var iAddressFamily: Int = 0,
    public var iMaxSockAddr: Int = 0,
    public var iMinSockAddr: Int = 0,
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
    public var iProtocolMaxOffset: Int = 0,
    public var iNetworkByteOrder: Int = 0,
    public var iSecurityScheme: Int = 0,
    public var dwMessageSize: UInt = 0u,
    public var dwProviderReserved: UInt = 0u,
    public var szProtocol: UShortArray = UShortArray(256),
)

public data class WSAQUERYSET2A(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: PSTR = 0L,
    public var lpVersion: Long = 0L,
    public var lpszComment: PSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Long = 0L,
    public var lpszContext: PSTR = 0L,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Long = 0L,
    public var lpszQueryString: PSTR = 0L,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: Long = 0L,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Long = 0L,
)

public data class WSAQUERYSET2W(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: PWSTR = 0L,
    public var lpVersion: Long = 0L,
    public var lpszComment: PWSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Long = 0L,
    public var lpszContext: PWSTR = 0L,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Long = 0L,
    public var lpszQueryString: PWSTR = 0L,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: Long = 0L,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Long = 0L,
)

public data class WSAQUERYSETA(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: PSTR = 0L,
    public var lpServiceClassId: Long = 0L,
    public var lpVersion: Long = 0L,
    public var lpszComment: PSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Long = 0L,
    public var lpszContext: PSTR = 0L,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Long = 0L,
    public var lpszQueryString: PSTR = 0L,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: Long = 0L,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Long = 0L,
)

public data class WSAQUERYSETW(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: PWSTR = 0L,
    public var lpServiceClassId: Long = 0L,
    public var lpVersion: Long = 0L,
    public var lpszComment: PWSTR = 0L,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Long = 0L,
    public var lpszContext: PWSTR = 0L,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Long = 0L,
    public var lpszQueryString: PWSTR = 0L,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: Long = 0L,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Long = 0L,
)

public data class WSASENDMSG(
    public var lpMsg: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var lpNumberOfBytesSent: Long = 0L,
    public var lpOverlapped: Long = 0L,
    public var lpCompletionRoutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE = null,
)

public data class WSASERVICECLASSINFOA(
    public var lpServiceClassId: Long = 0L,
    public var lpszServiceClassName: PSTR = 0L,
    public var dwCount: UInt = 0u,
    public var lpClassInfos: Long = 0L,
)

public data class WSASERVICECLASSINFOW(
    public var lpServiceClassId: Long = 0L,
    public var lpszServiceClassName: PWSTR = 0L,
    public var dwCount: UInt = 0u,
    public var lpClassInfos: Long = 0L,
)

public data class WSATHREADID(public var ThreadHandle: Foundation.HANDLE = Foundation.HANDLE(), public var Reserved: ULong = 0uL)

public data class WSAVERSION(public var dwVersion: UInt = 0u, public var ecHow: WSAECOMPARATOR = 0)

public data class WSA_COMPATIBILITY_MODE(public var BehaviorId: WSA_COMPATIBILITY_BEHAVIOR_ID = 0, public var TargetOsVersion: UInt = 0u)

public data class WSC_PROVIDER_AUDIT_INFO(public var RecordSize: UInt = 0u, public var Reserved: Long = 0L)

public data class WSPDATA(
    public var wVersion: UShort = 0u,
    public var wHighVersion: UShort = 0u,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WSPDATA) return false
        if (this.wVersion != other.wVersion) return false
        if (this.wHighVersion != other.wHighVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wVersion.hashCode()
        result = 31 * result + this.wHighVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public class WSPPROC_TABLE(
    public var lpWSPAccept: LPWSPACCEPT = null,
    public var lpWSPAddressToString: LPWSPADDRESSTOSTRING = null,
    public var lpWSPAsyncSelect: LPWSPASYNCSELECT = null,
    public var lpWSPBind: LPWSPBIND = null,
    public var lpWSPCancelBlockingCall: LPWSPCANCELBLOCKINGCALL = null,
    public var lpWSPCleanup: LPWSPCLEANUP = null,
    public var lpWSPCloseSocket: LPWSPCLOSESOCKET = null,
    public var lpWSPConnect: LPWSPCONNECT = null,
    public var lpWSPDuplicateSocket: LPWSPDUPLICATESOCKET = null,
    public var lpWSPEnumNetworkEvents: LPWSPENUMNETWORKEVENTS = null,
    public var lpWSPEventSelect: LPWSPEVENTSELECT = null,
    public var lpWSPGetOverlappedResult: LPWSPGETOVERLAPPEDRESULT = null,
    public var lpWSPGetPeerName: LPWSPGETPEERNAME = null,
    public var lpWSPGetSockName: LPWSPGETSOCKNAME = null,
    public var lpWSPGetSockOpt: LPWSPGETSOCKOPT = null,
    public var lpWSPGetQOSByName: LPWSPGETQOSBYNAME = null,
    public var lpWSPIoctl: LPWSPIOCTL = null,
    public var lpWSPJoinLeaf: LPWSPJOINLEAF = null,
    public var lpWSPListen: LPWSPLISTEN = null,
    public var lpWSPRecv: LPWSPRECV = null,
    public var lpWSPRecvDisconnect: LPWSPRECVDISCONNECT = null,
    public var lpWSPRecvFrom: LPWSPRECVFROM = null,
    public var lpWSPSelect: LPWSPSELECT = null,
    public var lpWSPSend: LPWSPSEND = null,
    public var lpWSPSendDisconnect: LPWSPSENDDISCONNECT = null,
    public var lpWSPSendTo: LPWSPSENDTO = null,
    public var lpWSPSetSockOpt: LPWSPSETSOCKOPT = null,
    public var lpWSPShutdown: LPWSPSHUTDOWN = null,
    public var lpWSPSocket: LPWSPSOCKET = null,
    public var lpWSPStringToAddress: LPWSPSTRINGTOADDRESS = null,
)

public data class WSPUPCALLTABLE(
    public var lpWPUCloseEvent: LPWPUCLOSEEVENT = null,
    public var lpWPUCloseSocketHandle: LPWPUCLOSESOCKETHANDLE = null,
    public var lpWPUCreateEvent: LPWPUCREATEEVENT = null,
    public var lpWPUCreateSocketHandle: LPWPUCREATESOCKETHANDLE = null,
    public var lpWPUFDIsSet: LPWPUFDISSET = null,
    public var lpWPUGetProviderPath: LPWPUGETPROVIDERPATH = null,
    public var lpWPUModifyIFSHandle: LPWPUMODIFYIFSHANDLE = null,
    public var lpWPUPostMessage: LPWPUPOSTMESSAGE = null,
    public var lpWPUQueryBlockingCallback: LPWPUQUERYBLOCKINGCALLBACK = null,
    public var lpWPUQuerySocketHandleContext: LPWPUQUERYSOCKETHANDLECONTEXT = null,
    public var lpWPUQueueApc: LPWPUQUEUEAPC = null,
    public var lpWPUResetEvent: LPWPURESETEVENT = null,
    public var lpWPUSetEvent: LPWPUSETEVENT = null,
    public var lpWPUOpenCurrentThread: LPWPUOPENCURRENTTHREAD = null,
    public var lpWPUCloseThread: LPWPUCLOSETHREAD = null,
)

public data class netent(
    public var n_name: PSTR = 0L,
    public var n_aliases: Long = 0L,
    public var n_addrtype: Short = 0,
    public var n_net: UInt = 0u,
)

public data class sockaddr_gen(
    public var Address: SOCKADDR = SOCKADDR(),
    public var AddressIn: SOCKADDR_IN = SOCKADDR_IN(),
    public var AddressIn6: sockaddr_in6_old = sockaddr_in6_old(),
)

public data class sockaddr_in6_old(
    public var sin6_family: Short = 0,
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: IN6_ADDR = IN6_ADDR(),
)

public data class sockproto(public var sp_family: UShort = 0u, public var sp_protocol: UShort = 0u)

public data class tcp_keepalive(
    public var onoff: UInt = 0u,
    public var keepalivetime: UInt = 0u,
    public var keepaliveinterval: UInt = 0u,
)
