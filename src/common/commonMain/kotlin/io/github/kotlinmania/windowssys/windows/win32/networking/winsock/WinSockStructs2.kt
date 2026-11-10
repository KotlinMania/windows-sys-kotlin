@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public data class SocketSecuritySettingsIpsec(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var securityFlags: UInt = 0u,
    public var ipsecFlags: UInt = 0u,
    public var authipMMPolicyKey: Guid = Guid(),
    public var authipQMPolicyKey: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var reserved2: ULong = 0uL,
    public var userNameStringLen: UInt = 0u,
    public var domainNameStringLen: UInt = 0u,
    public var passwordStringLen: UInt = 0u,
    public var allStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocketSecuritySettingsIpsec) return false
        if (this.securityProtocol != other.securityProtocol) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.ipsecFlags != other.ipsecFlags) return false
        if (this.authipMMPolicyKey != other.authipMMPolicyKey) return false
        if (this.authipQMPolicyKey != other.authipQMPolicyKey) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.userNameStringLen != other.userNameStringLen) return false
        if (this.domainNameStringLen != other.domainNameStringLen) return false
        if (this.passwordStringLen != other.passwordStringLen) return false
        if (!this.allStrings.contentEquals(other.allStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityProtocol.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.ipsecFlags.hashCode()
        result = 31 * result + this.authipMMPolicyKey.hashCode()
        result = 31 * result + this.authipQMPolicyKey.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.userNameStringLen.hashCode()
        result = 31 * result + this.domainNameStringLen.hashCode()
        result = 31 * result + this.passwordStringLen.hashCode()
        result = 31 * result + this.allStrings.contentHashCode()
        return result
    }
}

public data class SockNotifyRegistration(
    public var socket: Socket = 0uL,
    public var completionKey: COpaquePointer? = null,
    public var eventFilter: UShort = 0u,
    public var operation: UByte = 0u,
    public var triggerFlags: UByte = 0u,
    public var registrationResult: UInt = 0u,
)

public data class TcpAckFrequencyParameters(
    public var tcpDelayedAckFrequency: UByte = 0u,
)

public data class TcpHdr(
    public var thSport: UShort = 0u,
    public var thDport: UShort = 0u,
    public var thSeq: UInt = 0u,
    public var thAck: UInt = 0u,
    public var bitfield: UByte = 0u,
    public var thFlags: UByte = 0u,
    public var thWin: UShort = 0u,
    public var thSum: UShort = 0u,
    public var thUrp: UShort = 0u,
)

public data class TcpIcwParameters(
    public var level: TcpIcwLevel = 0,
)

public class TcpInfoV0(
    public var state: Tcpstate = 0,
    public var mss: UInt = 0u,
    public var connectionTimeMs: ULong = 0uL,
    public var timestampsEnabled: Boolean = false,
    public var rttUs: UInt = 0u,
    public var minRttUs: UInt = 0u,
    public var bytesInFlight: UInt = 0u,
    public var cwnd: UInt = 0u,
    public var sndWnd: UInt = 0u,
    public var rcvWnd: UInt = 0u,
    public var rcvBuf: UInt = 0u,
    public var bytesOut: ULong = 0uL,
    public var bytesIn: ULong = 0uL,
    public var bytesReordered: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var fastRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var timeoutEpisodes: UInt = 0u,
    public var synRetrans: UByte = 0u,
)

public class TcpInfoV1(
    public var state: Tcpstate = 0,
    public var mss: UInt = 0u,
    public var connectionTimeMs: ULong = 0uL,
    public var timestampsEnabled: Boolean = false,
    public var rttUs: UInt = 0u,
    public var minRttUs: UInt = 0u,
    public var bytesInFlight: UInt = 0u,
    public var cwnd: UInt = 0u,
    public var sndWnd: UInt = 0u,
    public var rcvWnd: UInt = 0u,
    public var rcvBuf: UInt = 0u,
    public var bytesOut: ULong = 0uL,
    public var bytesIn: ULong = 0uL,
    public var bytesReordered: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var fastRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var timeoutEpisodes: UInt = 0u,
    public var synRetrans: UByte = 0u,
    public var sndLimTransRwin: UInt = 0u,
    public var sndLimTimeRwin: UInt = 0u,
    public var sndLimBytesRwin: ULong = 0uL,
    public var sndLimTransCwnd: UInt = 0u,
    public var sndLimTimeCwnd: UInt = 0u,
    public var sndLimBytesCwnd: ULong = 0uL,
    public var sndLimTransSnd: UInt = 0u,
    public var sndLimTimeSnd: UInt = 0u,
    public var sndLimBytesSnd: ULong = 0uL,
)

public data class TcpInitialRtoParameters(
    public var rtt: UShort = 0u,
    public var maxSynRetransmissions: UByte = 0u,
)

public data class TcpOptFastopen(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var cookie: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpOptFastopen) return false
        if (this.kind != other.kind) return false
        if (this.length != other.length) return false
        if (!this.cookie.contentEquals(other.cookie)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kind.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cookie.contentHashCode()
        return result
    }
}

public data class TcpOptMss(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var mss: UShort = 0u,
)

public data class TcpOptSack(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var block: List<TcpOptSack0> = List(1) { TcpOptSack0() },
)

public data class TcpOptSack0(
    public var left: UInt = 0u,
    public var right: UInt = 0u,
)

public data class TcpOptSackPermitted(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
)

public data class TcpOptTs(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var value: UInt = 0u,
    public var ecR: UInt = 0u,
)

public data class TcpOptUnknown(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
)

public data class TcpOptWs(
    public var kind: UByte = 0u,
    public var length: UByte = 0u,
    public var shiftCnt: UByte = 0u,
)

public data class TimestampingConfig(
    public var flags: UInt = 0u,
    public var txTimestampsBuffered: UShort = 0u,
)

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
)

public data class TransmitFileBuffers(
    public var head: COpaquePointer? = null,
    public var headLength: UInt = 0u,
    public var tail: COpaquePointer? = null,
    public var tailLength: UInt = 0u,
)

public data class TransmitPacketsElement(
    public var dwElFlags: UInt = 0u,
    public var cLength: UInt = 0u,
    public var anonymous: TransmitPacketsElement0 = TransmitPacketsElement0(),
)

public data class TransmitPacketsElement0(
    public var anonymous: TransmitPacketsElement00 = TransmitPacketsElement00(),
    public var pBuffer: COpaquePointer? = null,
)

public data class TransmitPacketsElement00(
    public var nFileOffset: Long = 0L,
    public var hFile: Handle = null,
)

public data class TransportSettingId(
    public var guid: Guid = Guid(),
)

public data class VlanTag(
    public var anonymous: VlanTag0 = VlanTag0(),
    public var type: UShort = 0u,
)

public data class VlanTag0(
    public var tag: UShort = 0u,
    public var anonymous: VlanTag00 = VlanTag00(),
)

public data class VlanTag00(
    public var bitfield: UShort = 0u,
)

public data class WceDevicelist(
    public var numDevice: UInt = 0u,
    public var device: List<WceIrdaDeviceInfo> = List(1) { WceIrdaDeviceInfo() },
)

public data class WceIrdaDeviceInfo(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WceIrdaDeviceInfo) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaDeviceName.contentEquals(other.irdaDeviceName)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaDeviceName.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WindowsDevicelist(
    public var numDevice: UInt = 0u,
    public var device: List<WindowsIrdaDeviceInfo> = List(1) { WindowsIrdaDeviceInfo() },
)

public data class WindowsIasQuery(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WindowsIasQuery0 = WindowsIasQuery0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery) return false
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

public data class WindowsIasQuery0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WindowsIasQuery00 = WindowsIasQuery00(),
    public var irdaAttribUsrStr: WindowsIasQuery01 = WindowsIasQuery01(),
)

public data class WindowsIasQuery00(
    public var len: UInt = 0u,
    public var octetSeq: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery00) return false
        if (this.len != other.len) return false
        if (!this.octetSeq.contentEquals(other.octetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.octetSeq.contentHashCode()
        return result
    }
}

public data class WindowsIasQuery01(
    public var len: UInt = 0u,
    public var charSet: UInt = 0u,
    public var usrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasQuery01) return false
        if (this.len != other.len) return false
        if (this.charSet != other.charSet) return false
        if (!this.usrStr.contentEquals(other.usrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.charSet.hashCode()
        result = 31 * result + this.usrStr.contentHashCode()
        return result
    }
}

public data class WindowsIasSet(
    public var irdaClassName: ByteArray = ByteArray(64),
    public var irdaAttribName: ByteArray = ByteArray(256),
    public var irdaAttribType: UInt = 0u,
    public var irdaAttribute: WindowsIasSet0 = WindowsIasSet0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet) return false
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

public data class WindowsIasSet0(
    public var irdaAttribInt: Int = 0,
    public var irdaAttribOctetSeq: WindowsIasSet00 = WindowsIasSet00(),
    public var irdaAttribUsrStr: WindowsIasSet01 = WindowsIasSet01(),
)

public data class WindowsIasSet00(
    public var len: UShort = 0u,
    public var octetSeq: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet00) return false
        if (this.len != other.len) return false
        if (!this.octetSeq.contentEquals(other.octetSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.octetSeq.contentHashCode()
        return result
    }
}

public data class WindowsIasSet01(
    public var len: UByte = 0u,
    public var charSet: UByte = 0u,
    public var usrStr: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIasSet01) return false
        if (this.len != other.len) return false
        if (this.charSet != other.charSet) return false
        if (!this.usrStr.contentEquals(other.usrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.charSet.hashCode()
        result = 31 * result + this.usrStr.contentHashCode()
        return result
    }
}

public data class WindowsIrdaDeviceInfo(
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaDeviceName: ByteArray = ByteArray(22),
    public var irdaDeviceHints1: UByte = 0u,
    public var irdaDeviceHints2: UByte = 0u,
    public var irdaCharSet: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WindowsIrdaDeviceInfo) return false
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

public data class Wsabuf(
    public var len: UInt = 0u,
    public var buf: Pstr = null,
)

public data class Wsacompletion(
    public var type: Wsacompletiontype = 0,
    public var parameters: Wsacompletion0 = Wsacompletion0(),
)

public data class Wsacompletion0(
    public var windowMessage: Wsacompletion00 = Wsacompletion00(),
    public var event: Wsacompletion01 = Wsacompletion01(),
    public var apc: Wsacompletion02 = Wsacompletion02(),
    public var port: Wsacompletion03 = Wsacompletion03(),
)

public data class Wsacompletion02(
    public var lpOverlapped: Overlapped? = null,
    public var lpfnCompletionProc: LpwsaoverlappedCompletionRoutine = null,
)

public data class Wsacompletion01(
    public var lpOverlapped: Overlapped? = null,
)

public data class Wsacompletion03(
    public var lpOverlapped: Overlapped? = null,
    public var hPort: Handle = null,
    public var key: Int = 0,
)

public data class Wsacompletion00(
    public var hWnd: Hwnd = null,
    public var uMsg: UInt = 0u,
    public var context: Wparam = 0uL,
)

public data class Wsadata(
    public var wVersion: UShort = 0u,
    public var wHighVersion: UShort = 0u,
    public var iMaxSockets: UShort = 0u,
    public var iMaxUdpDg: UShort = 0u,
    public var lpVendorInfo: Pstr = null,
    public var szDescription: ByteArray = ByteArray(257),
    public var szSystemStatus: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsadata) return false
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

public data class Wsamsg(
    public var name: Sockaddr? = null,
    public var namelen: Int = 0,
    public var lpBuffers: Wsabuf? = null,
    public var dwBufferCount: UInt = 0u,
    public var control: Wsabuf = Wsabuf(),
    public var dwFlags: UInt = 0u,
)

public data class WsanamespaceInfoa(
    public var nSProviderId: Guid = Guid(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: Bool = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: Pstr = null,
)

public data class WsanamespaceInfoexa(
    public var nSProviderId: Guid = Guid(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: Bool = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: Pstr = null,
    public var providerSpecific: Blob = Blob(),
)

public data class WsanamespaceInfoexw(
    public var nSProviderId: Guid = Guid(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: Bool = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: Pwstr = null,
    public var providerSpecific: Blob = Blob(),
)

public data class WsanamespaceInfow(
    public var nSProviderId: Guid = Guid(),
    public var dwNameSpace: UInt = 0u,
    public var fActive: Bool = 0,
    public var dwVersion: UInt = 0u,
    public var lpszIdentifier: Pwstr = null,
)

public data class Wsanetworkevents(
    public var lNetworkEvents: Int = 0,
    public var iErrorCode: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsanetworkevents) return false
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

public data class Wsansclassinfoa(
    public var lpszName: Pstr = null,
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class Wsansclassinfow(
    public var lpszName: Pwstr = null,
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class Wsapolldata(
    public var result: Int = 0,
    public var fds: UInt = 0u,
    public var timeout: Int = 0,
    public var fdArray: List<Wsapollfd> = List(1) { Wsapollfd() },
)

public data class Wsapollfd(
    public var fd: Socket = 0uL,
    public var events: WsapollEventFlags = 0,
    public var revents: WsapollEventFlags = 0,
)

public data class Wsaprotocolchain(
    public var chainLen: Int = 0,
    public var chainEntries: UIntArray = UIntArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wsaprotocolchain) return false
        if (this.chainLen != other.chainLen) return false
        if (!this.chainEntries.contentEquals(other.chainEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chainLen.hashCode()
        result = 31 * result + this.chainEntries.contentHashCode()
        return result
    }
}

public class WsaprotocolInfoa(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var dwCatalogEntryId: UInt = 0u,
    public var protocolChain: Wsaprotocolchain = Wsaprotocolchain(),
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

public class WsaprotocolInfow(
    public var dwServiceFlags1: UInt = 0u,
    public var dwServiceFlags2: UInt = 0u,
    public var dwServiceFlags3: UInt = 0u,
    public var dwServiceFlags4: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var providerId: Guid = Guid(),
    public var dwCatalogEntryId: UInt = 0u,
    public var protocolChain: Wsaprotocolchain = Wsaprotocolchain(),
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

public data class Wsaqueryset2a(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: Pstr = null,
    public var lpVersion: Wsaversion? = null,
    public var lpszComment: Pstr = null,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Guid? = null,
    public var lpszContext: Pstr = null,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Afprotocols? = null,
    public var lpszQueryString: Pstr = null,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: CsaddrInfo? = null,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Blob? = null,
)

public data class Wsaqueryset2w(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: Pwstr = null,
    public var lpVersion: Wsaversion? = null,
    public var lpszComment: Pwstr = null,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Guid? = null,
    public var lpszContext: Pwstr = null,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Afprotocols? = null,
    public var lpszQueryString: Pwstr = null,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: CsaddrInfo? = null,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Blob? = null,
)

public data class Wsaqueryseta(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: Pstr = null,
    public var lpServiceClassId: Guid? = null,
    public var lpVersion: Wsaversion? = null,
    public var lpszComment: Pstr = null,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Guid? = null,
    public var lpszContext: Pstr = null,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Afprotocols? = null,
    public var lpszQueryString: Pstr = null,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: CsaddrInfo? = null,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Blob? = null,
)

public data class Wsaquerysetw(
    public var dwSize: UInt = 0u,
    public var lpszServiceInstanceName: Pwstr = null,
    public var lpServiceClassId: Guid? = null,
    public var lpVersion: Wsaversion? = null,
    public var lpszComment: Pwstr = null,
    public var dwNameSpace: UInt = 0u,
    public var lpNSProviderId: Guid? = null,
    public var lpszContext: Pwstr = null,
    public var dwNumberOfProtocols: UInt = 0u,
    public var lpafpProtocols: Afprotocols? = null,
    public var lpszQueryString: Pwstr = null,
    public var dwNumberOfCsAddrs: UInt = 0u,
    public var lpcsaBuffer: CsaddrInfo? = null,
    public var dwOutputFlags: UInt = 0u,
    public var lpBlob: Blob? = null,
)

public data class Wsasendmsg(
    public var lpMsg: Wsamsg? = null,
    public var dwFlags: UInt = 0u,
    public var lpNumberOfBytesSent: UInt? = null,
    public var lpOverlapped: Overlapped? = null,
    public var lpCompletionRoutine: LpwsaoverlappedCompletionRoutine = null,
)

public data class Wsaserviceclassinfoa(
    public var lpServiceClassId: Guid? = null,
    public var lpszServiceClassName: Pstr = null,
    public var dwCount: UInt = 0u,
    public var lpClassInfos: Wsansclassinfoa? = null,
)

public data class Wsaserviceclassinfow(
    public var lpServiceClassId: Guid? = null,
    public var lpszServiceClassName: Pwstr = null,
    public var dwCount: UInt = 0u,
    public var lpClassInfos: Wsansclassinfow? = null,
)

public data class Wsathreadid(
    public var threadHandle: Handle = null,
    public var reserved: Int = 0,
)

public data class Wsaversion(
    public var dwVersion: UInt = 0u,
    public var ecHow: Wsaecomparator = 0,
)

public data class WsaCompatibilityMode(
    public var behaviorId: WsaCompatibilityBehaviorId = 0,
    public var targetOsVersion: UInt = 0u,
)

public data class WscProviderAuditInfo(
    public var recordSize: UInt = 0u,
    public var reserved: COpaquePointer? = null,
)

public data class Wspdata(
    public var wVersion: UShort = 0u,
    public var wHighVersion: UShort = 0u,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wspdata) return false
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

public class WspprocTable(
    public var lpWSPAccept: Lpwspaccept = null,
    public var lpWSPAddressToString: Lpwspaddresstostring = null,
    public var lpWSPAsyncSelect: Lpwspasyncselect = null,
    public var lpWSPBind: Lpwspbind = null,
    public var lpWSPCancelBlockingCall: Lpwspcancelblockingcall = null,
    public var lpWSPCleanup: Lpwspcleanup = null,
    public var lpWSPCloseSocket: Lpwspclosesocket = null,
    public var lpWSPConnect: Lpwspconnect = null,
    public var lpWSPDuplicateSocket: Lpwspduplicatesocket = null,
    public var lpWSPEnumNetworkEvents: Lpwspenumnetworkevents = null,
    public var lpWSPEventSelect: Lpwspeventselect = null,
    public var lpWSPGetOverlappedResult: Lpwspgetoverlappedresult = null,
    public var lpWSPGetPeerName: Lpwspgetpeername = null,
    public var lpWSPGetSockName: Lpwspgetsockname = null,
    public var lpWSPGetSockOpt: Lpwspgetsockopt = null,
    public var lpWSPGetQOSByName: Lpwspgetqosbyname = null,
    public var lpWSPIoctl: Lpwspioctl = null,
    public var lpWSPJoinLeaf: Lpwspjoinleaf = null,
    public var lpWSPListen: Lpwsplisten = null,
    public var lpWSPRecv: Lpwsprecv = null,
    public var lpWSPRecvDisconnect: Lpwsprecvdisconnect = null,
    public var lpWSPRecvFrom: Lpwsprecvfrom = null,
    public var lpWSPSelect: Lpwspselect = null,
    public var lpWSPSend: Lpwspsend = null,
    public var lpWSPSendDisconnect: Lpwspsenddisconnect = null,
    public var lpWSPSendTo: Lpwspsendto = null,
    public var lpWSPSetSockOpt: Lpwspsetsockopt = null,
    public var lpWSPShutdown: Lpwspshutdown = null,
    public var lpWSPSocket: Lpwspsocket = null,
    public var lpWSPStringToAddress: Lpwspstringtoaddress = null,
)

public data class Wspupcalltable(
    public var lpWPUCloseEvent: Lpwpucloseevent = null,
    public var lpWPUCloseSocketHandle: Lpwpuclosesockethandle = null,
    public var lpWPUCreateEvent: Lpwpucreateevent = null,
    public var lpWPUCreateSocketHandle: Lpwpucreatesockethandle = null,
    public var lpWPUFDIsSet: Lpwpufdisset = null,
    public var lpWPUGetProviderPath: Lpwpugetproviderpath = null,
    public var lpWPUModifyIFSHandle: Lpwpumodifyifshandle = null,
    public var lpWPUPostMessage: Lpwpupostmessage = null,
    public var lpWPUQueryBlockingCallback: Lpwpuqueryblockingcallback = null,
    public var lpWPUQuerySocketHandleContext: Lpwpuquerysockethandlecontext = null,
    public var lpWPUQueueApc: Lpwpuqueueapc = null,
    public var lpWPUResetEvent: Lpwpuresetevent = null,
    public var lpWPUSetEvent: Lpwpusetevent = null,
    public var lpWPUOpenCurrentThread: Lpwpuopencurrentthread = null,
    public var lpWPUCloseThread: Lpwpuclosethread = null,
)

public data class Netent(
    public var nName: Pstr = null,
    public var nAliases: COpaquePointer? = null,
    public var nAddrtype: Short = 0,
    public var nNet: UInt = 0u,
)

public data class SockaddrGen(
    public var address: Sockaddr = Sockaddr(),
    public var addressIn: SockaddrIn = SockaddrIn(),
    public var addressIn6: SockaddrIn6Old = SockaddrIn6Old(),
)

public data class SockaddrIn6Old(
    public var sin6Family: Short = 0,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
)

public data class Sockproto(
    public var spFamily: UShort = 0u,
    public var spProtocol: UShort = 0u,
)

public data class TcpKeepalive(
    public var onoff: UInt = 0u,
    public var keepalivetime: UInt = 0u,
    public var keepaliveinterval: UInt = 0u,
)
