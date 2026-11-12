@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage

public data class HttpVersionInfo(
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpVersionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HttpVersionInfo =
                    HttpVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HttpVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinorVersion)
                }
            }
    }
}

public class UrlComponents internal constructor(
    public var dwStructSize: UInt,
    lpszSchemeCtorArg: Pwstr,
    public var dwSchemeLength: UInt,
    public var nScheme: WinhttpInternetScheme,
    lpszHostNameCtorArg: Pwstr,
    public var dwHostNameLength: UInt,
    public var nPort: UShort,
    lpszUserNameCtorArg: Pwstr,
    public var dwUserNameLength: UInt,
    lpszPasswordCtorArg: Pwstr,
    public var dwPasswordLength: UInt,
    lpszUrlPathCtorArg: Pwstr,
    public var dwUrlPathLength: UInt,
    lpszExtraInfoCtorArg: Pwstr,
    public var dwExtraInfoLength: UInt,
) {
    public var lpszScheme: Pwstr = lpszSchemeCtorArg
        internal set

    public var lpszHostName: Pwstr = lpszHostNameCtorArg
        internal set

    public var lpszUserName: Pwstr = lpszUserNameCtorArg
        internal set

    public var lpszPassword: Pwstr = lpszPasswordCtorArg
        internal set

    public var lpszUrlPath: Pwstr = lpszUrlPathCtorArg
        internal set

    public var lpszExtraInfo: Pwstr = lpszExtraInfoCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpszSchemeCtorArg = MutPtr(0L),
        dwSchemeLength = 0u,
        nScheme = 0,
        lpszHostNameCtorArg = MutPtr(0L),
        dwHostNameLength = 0u,
        nPort = 0u,
        lpszUserNameCtorArg = MutPtr(0L),
        dwUserNameLength = 0u,
        lpszPasswordCtorArg = MutPtr(0L),
        dwPasswordLength = 0u,
        lpszUrlPathCtorArg = MutPtr(0L),
        dwUrlPathLength = 0u,
        lpszExtraInfoCtorArg = MutPtr(0L),
        dwExtraInfoLength = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pwstr = this.lpszScheme

    public operator fun component3(): UInt = this.dwSchemeLength

    public operator fun component4(): WinhttpInternetScheme = this.nScheme

    public operator fun component5(): Pwstr = this.lpszHostName

    public operator fun component6(): UInt = this.dwHostNameLength

    public operator fun component7(): UShort = this.nPort

    public operator fun component8(): Pwstr = this.lpszUserName

    public operator fun component9(): UInt = this.dwUserNameLength

    public operator fun component10(): Pwstr = this.lpszPassword

    public operator fun component11(): UInt = this.dwPasswordLength

    public operator fun component12(): Pwstr = this.lpszUrlPath

    public operator fun component13(): UInt = this.dwUrlPathLength

    public operator fun component14(): Pwstr = this.lpszExtraInfo

    public operator fun component15(): UInt = this.dwExtraInfoLength

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszScheme: Pwstr = this.lpszScheme, dwSchemeLength: UInt = this.dwSchemeLength, nScheme: WinhttpInternetScheme = this.nScheme, lpszHostName: Pwstr = this.lpszHostName, dwHostNameLength: UInt = this.dwHostNameLength, nPort: UShort = this.nPort, lpszUserName: Pwstr = this.lpszUserName, dwUserNameLength: UInt = this.dwUserNameLength, lpszPassword: Pwstr = this.lpszPassword, dwPasswordLength: UInt = this.dwPasswordLength, lpszUrlPath: Pwstr = this.lpszUrlPath, dwUrlPathLength: UInt = this.dwUrlPathLength, lpszExtraInfo: Pwstr = this.lpszExtraInfo, dwExtraInfoLength: UInt = this.dwExtraInfoLength): UrlComponents = UrlComponents(dwStructSize = dwStructSize, lpszSchemeCtorArg = lpszScheme, dwSchemeLength = dwSchemeLength, nScheme = nScheme, lpszHostNameCtorArg = lpszHostName, dwHostNameLength = dwHostNameLength, nPort = nPort, lpszUserNameCtorArg = lpszUserName, dwUserNameLength = dwUserNameLength, lpszPasswordCtorArg = lpszPassword, dwPasswordLength = dwPasswordLength, lpszUrlPathCtorArg = lpszUrlPath, dwUrlPathLength = dwUrlPathLength, lpszExtraInfoCtorArg = lpszExtraInfo, dwExtraInfoLength = dwExtraInfoLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrlComponents) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpszScheme != other.lpszScheme) return false
        if (this.dwSchemeLength != other.dwSchemeLength) return false
        if (this.nScheme != other.nScheme) return false
        if (this.lpszHostName != other.lpszHostName) return false
        if (this.dwHostNameLength != other.dwHostNameLength) return false
        if (this.nPort != other.nPort) return false
        if (this.lpszUserName != other.lpszUserName) return false
        if (this.dwUserNameLength != other.dwUserNameLength) return false
        if (this.lpszPassword != other.lpszPassword) return false
        if (this.dwPasswordLength != other.dwPasswordLength) return false
        if (this.lpszUrlPath != other.lpszUrlPath) return false
        if (this.dwUrlPathLength != other.dwUrlPathLength) return false
        if (this.lpszExtraInfo != other.lpszExtraInfo) return false
        if (this.dwExtraInfoLength != other.dwExtraInfoLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpszScheme.hashCode()
        result = 31 * result + this.dwSchemeLength.hashCode()
        result = 31 * result + this.nScheme.hashCode()
        result = 31 * result + this.lpszHostName.hashCode()
        result = 31 * result + this.dwHostNameLength.hashCode()
        result = 31 * result + this.nPort.hashCode()
        result = 31 * result + this.lpszUserName.hashCode()
        result = 31 * result + this.dwUserNameLength.hashCode()
        result = 31 * result + this.lpszPassword.hashCode()
        result = 31 * result + this.dwPasswordLength.hashCode()
        result = 31 * result + this.lpszUrlPath.hashCode()
        result = 31 * result + this.dwUrlPathLength.hashCode()
        result = 31 * result + this.lpszExtraInfo.hashCode()
        result = 31 * result + this.dwExtraInfoLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpszScheme: Pwstr = MutPtr(0L),
            dwSchemeLength: UInt = 0u,
            nScheme: WinhttpInternetScheme = 0,
            lpszHostName: Pwstr = MutPtr(0L),
            dwHostNameLength: UInt = 0u,
            nPort: UShort = 0u,
            lpszUserName: Pwstr = MutPtr(0L),
            dwUserNameLength: UInt = 0u,
            lpszPassword: Pwstr = MutPtr(0L),
            dwPasswordLength: UInt = 0u,
            lpszUrlPath: Pwstr = MutPtr(0L),
            dwUrlPathLength: UInt = 0u,
            lpszExtraInfo: Pwstr = MutPtr(0L),
            dwExtraInfoLength: UInt = 0u,
        ): UrlComponents =
            UrlComponents(
                dwStructSize = dwStructSize,
                lpszSchemeCtorArg = lpszScheme,
                dwSchemeLength = dwSchemeLength,
                nScheme = nScheme,
                lpszHostNameCtorArg = lpszHostName,
                dwHostNameLength = dwHostNameLength,
                nPort = nPort,
                lpszUserNameCtorArg = lpszUserName,
                dwUserNameLength = dwUserNameLength,
                lpszPasswordCtorArg = lpszPassword,
                dwPasswordLength = dwPasswordLength,
                lpszUrlPathCtorArg = lpszUrlPath,
                dwUrlPathLength = dwUrlPathLength,
                lpszExtraInfoCtorArg = lpszExtraInfo,
                dwExtraInfoLength = dwExtraInfoLength,
            )
    }
}

public data class WinhttpAsyncResult(
    public var dwResult: Int = 0,
    public var dwError: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpAsyncResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpAsyncResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WinhttpAsyncResult =
                    WinhttpAsyncResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinhttpAsyncResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                }
            }
    }
}

public class WinhttpAutoproxyOptions internal constructor(
    public var dwFlags: UInt,
    public var dwAutoDetectFlags: UInt,
    lpszAutoConfigUrlCtorArg: Pcwstr,
    lpvReservedCtorArg: MutPtr<CVoid>,
    public var dwReserved: UInt,
    public var fAutoLogonIfChallenged: Bool,
) {
    public var lpszAutoConfigUrl: Pcwstr = lpszAutoConfigUrlCtorArg
        internal set

    public var lpvReserved: MutPtr<CVoid> = lpvReservedCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        dwAutoDetectFlags = 0u,
        lpszAutoConfigUrlCtorArg = ConstPtr(0L),
        lpvReservedCtorArg = MutPtr(0L),
        dwReserved = 0u,
        fAutoLogonIfChallenged = 0,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): UInt = this.dwAutoDetectFlags

    public operator fun component3(): Pcwstr = this.lpszAutoConfigUrl

    public operator fun component4(): MutPtr<CVoid> = this.lpvReserved

    public operator fun component5(): UInt = this.dwReserved

    public operator fun component6(): Bool = this.fAutoLogonIfChallenged

    public fun copy(dwFlags: UInt = this.dwFlags, dwAutoDetectFlags: UInt = this.dwAutoDetectFlags, lpszAutoConfigUrl: Pcwstr = this.lpszAutoConfigUrl, lpvReserved: MutPtr<CVoid> = this.lpvReserved, dwReserved: UInt = this.dwReserved, fAutoLogonIfChallenged: Bool = this.fAutoLogonIfChallenged): WinhttpAutoproxyOptions = WinhttpAutoproxyOptions(dwFlags = dwFlags, dwAutoDetectFlags = dwAutoDetectFlags, lpszAutoConfigUrlCtorArg = lpszAutoConfigUrl, lpvReservedCtorArg = lpvReserved, dwReserved = dwReserved, fAutoLogonIfChallenged = fAutoLogonIfChallenged)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpAutoproxyOptions) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwAutoDetectFlags != other.dwAutoDetectFlags) return false
        if (this.lpszAutoConfigUrl != other.lpszAutoConfigUrl) return false
        if (this.lpvReserved != other.lpvReserved) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.fAutoLogonIfChallenged != other.fAutoLogonIfChallenged) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.dwAutoDetectFlags.hashCode()
        result = 31 * result + this.lpszAutoConfigUrl.hashCode()
        result = 31 * result + this.lpvReserved.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.fAutoLogonIfChallenged.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            dwAutoDetectFlags: UInt = 0u,
            lpszAutoConfigUrl: Pcwstr = ConstPtr(0L),
            lpvReserved: MutPtr<CVoid> = MutPtr(0L),
            dwReserved: UInt = 0u,
            fAutoLogonIfChallenged: Bool = 0,
        ): WinhttpAutoproxyOptions =
            WinhttpAutoproxyOptions(
                dwFlags = dwFlags,
                dwAutoDetectFlags = dwAutoDetectFlags,
                lpszAutoConfigUrlCtorArg = lpszAutoConfigUrl,
                lpvReservedCtorArg = lpvReserved,
                dwReserved = dwReserved,
                fAutoLogonIfChallenged = fAutoLogonIfChallenged,
            )
    }
}

public class WinhttpCertificateInfo internal constructor(
    public var ftExpiry: Filetime,
    public var ftStart: Filetime,
    lpszSubjectInfoCtorArg: Pwstr,
    lpszIssuerInfoCtorArg: Pwstr,
    lpszProtocolNameCtorArg: Pwstr,
    lpszSignatureAlgNameCtorArg: Pwstr,
    lpszEncryptionAlgNameCtorArg: Pwstr,
    public var dwKeySize: UInt,
) {
    public var lpszSubjectInfo: Pwstr = lpszSubjectInfoCtorArg
        internal set

    public var lpszIssuerInfo: Pwstr = lpszIssuerInfoCtorArg
        internal set

    public var lpszProtocolName: Pwstr = lpszProtocolNameCtorArg
        internal set

    public var lpszSignatureAlgName: Pwstr = lpszSignatureAlgNameCtorArg
        internal set

    public var lpszEncryptionAlgName: Pwstr = lpszEncryptionAlgNameCtorArg
        internal set

    public constructor() : this(
        ftExpiry = Filetime(),
        ftStart = Filetime(),
        lpszSubjectInfoCtorArg = MutPtr(0L),
        lpszIssuerInfoCtorArg = MutPtr(0L),
        lpszProtocolNameCtorArg = MutPtr(0L),
        lpszSignatureAlgNameCtorArg = MutPtr(0L),
        lpszEncryptionAlgNameCtorArg = MutPtr(0L),
        dwKeySize = 0u,
    )

    public operator fun component1(): Filetime = this.ftExpiry

    public operator fun component2(): Filetime = this.ftStart

    public operator fun component3(): Pwstr = this.lpszSubjectInfo

    public operator fun component4(): Pwstr = this.lpszIssuerInfo

    public operator fun component5(): Pwstr = this.lpszProtocolName

    public operator fun component6(): Pwstr = this.lpszSignatureAlgName

    public operator fun component7(): Pwstr = this.lpszEncryptionAlgName

    public operator fun component8(): UInt = this.dwKeySize

    public fun copy(ftExpiry: Filetime = this.ftExpiry, ftStart: Filetime = this.ftStart, lpszSubjectInfo: Pwstr = this.lpszSubjectInfo, lpszIssuerInfo: Pwstr = this.lpszIssuerInfo, lpszProtocolName: Pwstr = this.lpszProtocolName, lpszSignatureAlgName: Pwstr = this.lpszSignatureAlgName, lpszEncryptionAlgName: Pwstr = this.lpszEncryptionAlgName, dwKeySize: UInt = this.dwKeySize): WinhttpCertificateInfo = WinhttpCertificateInfo(ftExpiry = ftExpiry, ftStart = ftStart, lpszSubjectInfoCtorArg = lpszSubjectInfo, lpszIssuerInfoCtorArg = lpszIssuerInfo, lpszProtocolNameCtorArg = lpszProtocolName, lpszSignatureAlgNameCtorArg = lpszSignatureAlgName, lpszEncryptionAlgNameCtorArg = lpszEncryptionAlgName, dwKeySize = dwKeySize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpCertificateInfo) return false
        if (this.ftExpiry != other.ftExpiry) return false
        if (this.ftStart != other.ftStart) return false
        if (this.lpszSubjectInfo != other.lpszSubjectInfo) return false
        if (this.lpszIssuerInfo != other.lpszIssuerInfo) return false
        if (this.lpszProtocolName != other.lpszProtocolName) return false
        if (this.lpszSignatureAlgName != other.lpszSignatureAlgName) return false
        if (this.lpszEncryptionAlgName != other.lpszEncryptionAlgName) return false
        if (this.dwKeySize != other.dwKeySize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ftExpiry.hashCode()
        result = 31 * result + this.ftStart.hashCode()
        result = 31 * result + this.lpszSubjectInfo.hashCode()
        result = 31 * result + this.lpszIssuerInfo.hashCode()
        result = 31 * result + this.lpszProtocolName.hashCode()
        result = 31 * result + this.lpszSignatureAlgName.hashCode()
        result = 31 * result + this.lpszEncryptionAlgName.hashCode()
        result = 31 * result + this.dwKeySize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ftExpiry: Filetime = Filetime(),
            ftStart: Filetime = Filetime(),
            lpszSubjectInfo: Pwstr = MutPtr(0L),
            lpszIssuerInfo: Pwstr = MutPtr(0L),
            lpszProtocolName: Pwstr = MutPtr(0L),
            lpszSignatureAlgName: Pwstr = MutPtr(0L),
            lpszEncryptionAlgName: Pwstr = MutPtr(0L),
            dwKeySize: UInt = 0u,
        ): WinhttpCertificateInfo =
            WinhttpCertificateInfo(
                ftExpiry = ftExpiry,
                ftStart = ftStart,
                lpszSubjectInfoCtorArg = lpszSubjectInfo,
                lpszIssuerInfoCtorArg = lpszIssuerInfo,
                lpszProtocolNameCtorArg = lpszProtocolName,
                lpszSignatureAlgNameCtorArg = lpszSignatureAlgName,
                lpszEncryptionAlgNameCtorArg = lpszEncryptionAlgName,
                dwKeySize = dwKeySize,
            )
    }
}

public data class WinhttpConnectionGroup(
    public var cConnections: UInt = 0u,
    public var guidGroup: Guid = Guid(),
)

public data class WinhttpConnectionInfo(
    public var cbSize: UInt = 0u,
    public var localAddress: SockaddrStorage = SockaddrStorage(),
    public var remoteAddress: SockaddrStorage = SockaddrStorage(),
)

public class WinhttpCreds internal constructor(
    lpszUserNameCtorArg: Pstr,
    lpszPasswordCtorArg: Pstr,
    lpszRealmCtorArg: Pstr,
    public var dwAuthScheme: WinhttpCredsAuthscheme,
    lpszHostNameCtorArg: Pstr,
    public var dwPort: UInt,
) {
    public var lpszUserName: Pstr = lpszUserNameCtorArg
        internal set

    public var lpszPassword: Pstr = lpszPasswordCtorArg
        internal set

    public var lpszRealm: Pstr = lpszRealmCtorArg
        internal set

    public var lpszHostName: Pstr = lpszHostNameCtorArg
        internal set

    public constructor() : this(
        lpszUserNameCtorArg = MutPtr(0L),
        lpszPasswordCtorArg = MutPtr(0L),
        lpszRealmCtorArg = MutPtr(0L),
        dwAuthScheme = 0u,
        lpszHostNameCtorArg = MutPtr(0L),
        dwPort = 0u,
    )

    public operator fun component1(): Pstr = this.lpszUserName

    public operator fun component2(): Pstr = this.lpszPassword

    public operator fun component3(): Pstr = this.lpszRealm

    public operator fun component4(): WinhttpCredsAuthscheme = this.dwAuthScheme

    public operator fun component5(): Pstr = this.lpszHostName

    public operator fun component6(): UInt = this.dwPort

    public fun copy(lpszUserName: Pstr = this.lpszUserName, lpszPassword: Pstr = this.lpszPassword, lpszRealm: Pstr = this.lpszRealm, dwAuthScheme: WinhttpCredsAuthscheme = this.dwAuthScheme, lpszHostName: Pstr = this.lpszHostName, dwPort: UInt = this.dwPort): WinhttpCreds = WinhttpCreds(lpszUserNameCtorArg = lpszUserName, lpszPasswordCtorArg = lpszPassword, lpszRealmCtorArg = lpszRealm, dwAuthScheme = dwAuthScheme, lpszHostNameCtorArg = lpszHostName, dwPort = dwPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpCreds) return false
        if (this.lpszUserName != other.lpszUserName) return false
        if (this.lpszPassword != other.lpszPassword) return false
        if (this.lpszRealm != other.lpszRealm) return false
        if (this.dwAuthScheme != other.dwAuthScheme) return false
        if (this.lpszHostName != other.lpszHostName) return false
        if (this.dwPort != other.dwPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszUserName.hashCode()
        result = 31 * result + this.lpszPassword.hashCode()
        result = 31 * result + this.lpszRealm.hashCode()
        result = 31 * result + this.dwAuthScheme.hashCode()
        result = 31 * result + this.lpszHostName.hashCode()
        result = 31 * result + this.dwPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszUserName: Pstr = MutPtr(0L),
            lpszPassword: Pstr = MutPtr(0L),
            lpszRealm: Pstr = MutPtr(0L),
            dwAuthScheme: WinhttpCredsAuthscheme = 0u,
            lpszHostName: Pstr = MutPtr(0L),
            dwPort: UInt = 0u,
        ): WinhttpCreds =
            WinhttpCreds(
                lpszUserNameCtorArg = lpszUserName,
                lpszPasswordCtorArg = lpszPassword,
                lpszRealmCtorArg = lpszRealm,
                dwAuthScheme = dwAuthScheme,
                lpszHostNameCtorArg = lpszHostName,
                dwPort = dwPort,
            )
    }
}

public class WinhttpCredsEx internal constructor(
    lpszUserNameCtorArg: Pstr,
    lpszPasswordCtorArg: Pstr,
    lpszRealmCtorArg: Pstr,
    public var dwAuthScheme: WinhttpCredsAuthscheme,
    lpszHostNameCtorArg: Pstr,
    public var dwPort: UInt,
    lpszUrlCtorArg: Pstr,
) {
    public var lpszUserName: Pstr = lpszUserNameCtorArg
        internal set

    public var lpszPassword: Pstr = lpszPasswordCtorArg
        internal set

    public var lpszRealm: Pstr = lpszRealmCtorArg
        internal set

    public var lpszHostName: Pstr = lpszHostNameCtorArg
        internal set

    public var lpszUrl: Pstr = lpszUrlCtorArg
        internal set

    public constructor() : this(
        lpszUserNameCtorArg = MutPtr(0L),
        lpszPasswordCtorArg = MutPtr(0L),
        lpszRealmCtorArg = MutPtr(0L),
        dwAuthScheme = 0u,
        lpszHostNameCtorArg = MutPtr(0L),
        dwPort = 0u,
        lpszUrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpszUserName

    public operator fun component2(): Pstr = this.lpszPassword

    public operator fun component3(): Pstr = this.lpszRealm

    public operator fun component4(): WinhttpCredsAuthscheme = this.dwAuthScheme

    public operator fun component5(): Pstr = this.lpszHostName

    public operator fun component6(): UInt = this.dwPort

    public operator fun component7(): Pstr = this.lpszUrl

    public fun copy(lpszUserName: Pstr = this.lpszUserName, lpszPassword: Pstr = this.lpszPassword, lpszRealm: Pstr = this.lpszRealm, dwAuthScheme: WinhttpCredsAuthscheme = this.dwAuthScheme, lpszHostName: Pstr = this.lpszHostName, dwPort: UInt = this.dwPort, lpszUrl: Pstr = this.lpszUrl): WinhttpCredsEx = WinhttpCredsEx(lpszUserNameCtorArg = lpszUserName, lpszPasswordCtorArg = lpszPassword, lpszRealmCtorArg = lpszRealm, dwAuthScheme = dwAuthScheme, lpszHostNameCtorArg = lpszHostName, dwPort = dwPort, lpszUrlCtorArg = lpszUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpCredsEx) return false
        if (this.lpszUserName != other.lpszUserName) return false
        if (this.lpszPassword != other.lpszPassword) return false
        if (this.lpszRealm != other.lpszRealm) return false
        if (this.dwAuthScheme != other.dwAuthScheme) return false
        if (this.lpszHostName != other.lpszHostName) return false
        if (this.dwPort != other.dwPort) return false
        if (this.lpszUrl != other.lpszUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszUserName.hashCode()
        result = 31 * result + this.lpszPassword.hashCode()
        result = 31 * result + this.lpszRealm.hashCode()
        result = 31 * result + this.dwAuthScheme.hashCode()
        result = 31 * result + this.lpszHostName.hashCode()
        result = 31 * result + this.dwPort.hashCode()
        result = 31 * result + this.lpszUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszUserName: Pstr = MutPtr(0L),
            lpszPassword: Pstr = MutPtr(0L),
            lpszRealm: Pstr = MutPtr(0L),
            dwAuthScheme: WinhttpCredsAuthscheme = 0u,
            lpszHostName: Pstr = MutPtr(0L),
            dwPort: UInt = 0u,
            lpszUrl: Pstr = MutPtr(0L),
        ): WinhttpCredsEx =
            WinhttpCredsEx(
                lpszUserNameCtorArg = lpszUserName,
                lpszPasswordCtorArg = lpszPassword,
                lpszRealmCtorArg = lpszRealm,
                dwAuthScheme = dwAuthScheme,
                lpszHostNameCtorArg = lpszHostName,
                dwPort = dwPort,
                lpszUrlCtorArg = lpszUrl,
            )
    }
}

public class WinhttpCurrentUserIeProxyConfig internal constructor(
    public var fAutoDetect: Bool,
    lpszAutoConfigUrlCtorArg: Pwstr,
    lpszProxyCtorArg: Pwstr,
    lpszProxyBypassCtorArg: Pwstr,
) {
    public var lpszAutoConfigUrl: Pwstr = lpszAutoConfigUrlCtorArg
        internal set

    public var lpszProxy: Pwstr = lpszProxyCtorArg
        internal set

    public var lpszProxyBypass: Pwstr = lpszProxyBypassCtorArg
        internal set

    public constructor() : this(
        fAutoDetect = 0,
        lpszAutoConfigUrlCtorArg = MutPtr(0L),
        lpszProxyCtorArg = MutPtr(0L),
        lpszProxyBypassCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fAutoDetect

    public operator fun component2(): Pwstr = this.lpszAutoConfigUrl

    public operator fun component3(): Pwstr = this.lpszProxy

    public operator fun component4(): Pwstr = this.lpszProxyBypass

    public fun copy(fAutoDetect: Bool = this.fAutoDetect, lpszAutoConfigUrl: Pwstr = this.lpszAutoConfigUrl, lpszProxy: Pwstr = this.lpszProxy, lpszProxyBypass: Pwstr = this.lpszProxyBypass): WinhttpCurrentUserIeProxyConfig = WinhttpCurrentUserIeProxyConfig(fAutoDetect = fAutoDetect, lpszAutoConfigUrlCtorArg = lpszAutoConfigUrl, lpszProxyCtorArg = lpszProxy, lpszProxyBypassCtorArg = lpszProxyBypass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpCurrentUserIeProxyConfig) return false
        if (this.fAutoDetect != other.fAutoDetect) return false
        if (this.lpszAutoConfigUrl != other.lpszAutoConfigUrl) return false
        if (this.lpszProxy != other.lpszProxy) return false
        if (this.lpszProxyBypass != other.lpszProxyBypass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fAutoDetect.hashCode()
        result = 31 * result + this.lpszAutoConfigUrl.hashCode()
        result = 31 * result + this.lpszProxy.hashCode()
        result = 31 * result + this.lpszProxyBypass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fAutoDetect: Bool = 0,
            lpszAutoConfigUrl: Pwstr = MutPtr(0L),
            lpszProxy: Pwstr = MutPtr(0L),
            lpszProxyBypass: Pwstr = MutPtr(0L),
        ): WinhttpCurrentUserIeProxyConfig =
            WinhttpCurrentUserIeProxyConfig(
                fAutoDetect = fAutoDetect,
                lpszAutoConfigUrlCtorArg = lpszAutoConfigUrl,
                lpszProxyCtorArg = lpszProxy,
                lpszProxyBypassCtorArg = lpszProxyBypass,
            )
    }
}

public data class WinhttpExtendedHeader(
    public var anonymous1: WinhttpExtendedHeader0 = WinhttpExtendedHeader0(),
    public var anonymous2: WinhttpExtendedHeader1 = WinhttpExtendedHeader1(),
)

public class WinhttpExtendedHeader0 internal constructor(
    pwszNameCtorArg: Pcwstr,
    pszNameCtorArg: Pcstr,
) {
    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public var pszName: Pcstr = pszNameCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = ConstPtr(0L),
        pszNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszName

    public operator fun component2(): Pcstr = this.pszName

    public fun copy(pwszName: Pcwstr = this.pwszName, pszName: Pcstr = this.pszName): WinhttpExtendedHeader0 = WinhttpExtendedHeader0(pwszNameCtorArg = pwszName, pszNameCtorArg = pszName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpExtendedHeader0) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pszName != other.pszName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.pszName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pcwstr = ConstPtr(0L),
            pszName: Pcstr = ConstPtr(0L),
        ): WinhttpExtendedHeader0 =
            WinhttpExtendedHeader0(
                pwszNameCtorArg = pwszName,
                pszNameCtorArg = pszName,
            )
    }
}

public class WinhttpExtendedHeader1 internal constructor(
    pwszValueCtorArg: Pcwstr,
    pszValueCtorArg: Pcstr,
) {
    public var pwszValue: Pcwstr = pwszValueCtorArg
        internal set

    public var pszValue: Pcstr = pszValueCtorArg
        internal set

    public constructor() : this(
        pwszValueCtorArg = ConstPtr(0L),
        pszValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszValue

    public operator fun component2(): Pcstr = this.pszValue

    public fun copy(pwszValue: Pcwstr = this.pwszValue, pszValue: Pcstr = this.pszValue): WinhttpExtendedHeader1 = WinhttpExtendedHeader1(pwszValueCtorArg = pwszValue, pszValueCtorArg = pszValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpExtendedHeader1) return false
        if (this.pwszValue != other.pwszValue) return false
        if (this.pszValue != other.pszValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszValue.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszValue: Pcwstr = ConstPtr(0L),
            pszValue: Pcstr = ConstPtr(0L),
        ): WinhttpExtendedHeader1 =
            WinhttpExtendedHeader1(
                pwszValueCtorArg = pwszValue,
                pszValueCtorArg = pszValue,
            )
    }
}

public data class WinhttpFailedConnectionRetries(
    public var dwMaxRetries: UInt = 0u,
    public var dwAllowedRetryConditions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpFailedConnectionRetries> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpFailedConnectionRetries> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WinhttpFailedConnectionRetries =
                    WinhttpFailedConnectionRetries(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinhttpFailedConnectionRetries) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMaxRetries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAllowedRetryConditions)
                }
            }
    }
}

public class WinhttpHeaderName internal constructor(
    pwszNameCtorArg: Pcwstr,
    pszNameCtorArg: Pcstr,
) {
    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public var pszName: Pcstr = pszNameCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = ConstPtr(0L),
        pszNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszName

    public operator fun component2(): Pcstr = this.pszName

    public fun copy(pwszName: Pcwstr = this.pwszName, pszName: Pcstr = this.pszName): WinhttpHeaderName = WinhttpHeaderName(pwszNameCtorArg = pwszName, pszNameCtorArg = pszName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpHeaderName) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pszName != other.pszName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.pszName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pcwstr = ConstPtr(0L),
            pszName: Pcstr = ConstPtr(0L),
        ): WinhttpHeaderName =
            WinhttpHeaderName(
                pwszNameCtorArg = pwszName,
                pszNameCtorArg = pszName,
            )
    }
}

public class WinhttpHostConnectionGroup internal constructor(
    pwszHostCtorArg: Pcwstr,
    public var cConnectionGroups: UInt,
    pConnectionGroupsCtorArg: MutPtr<WinhttpConnectionGroup>,
) {
    public var pwszHost: Pcwstr = pwszHostCtorArg
        internal set

    public var pConnectionGroups: MutPtr<WinhttpConnectionGroup> = pConnectionGroupsCtorArg
        internal set

    public constructor() : this(
        pwszHostCtorArg = ConstPtr(0L),
        cConnectionGroups = 0u,
        pConnectionGroupsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszHost

    public operator fun component2(): UInt = this.cConnectionGroups

    public operator fun component3(): MutPtr<WinhttpConnectionGroup> = this.pConnectionGroups

    public fun copy(pwszHost: Pcwstr = this.pwszHost, cConnectionGroups: UInt = this.cConnectionGroups, pConnectionGroups: MutPtr<WinhttpConnectionGroup> = this.pConnectionGroups): WinhttpHostConnectionGroup = WinhttpHostConnectionGroup(pwszHostCtorArg = pwszHost, cConnectionGroups = cConnectionGroups, pConnectionGroupsCtorArg = pConnectionGroups)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpHostConnectionGroup) return false
        if (this.pwszHost != other.pwszHost) return false
        if (this.cConnectionGroups != other.cConnectionGroups) return false
        if (this.pConnectionGroups != other.pConnectionGroups) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszHost.hashCode()
        result = 31 * result + this.cConnectionGroups.hashCode()
        result = 31 * result + this.pConnectionGroups.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszHost: Pcwstr = ConstPtr(0L),
            cConnectionGroups: UInt = 0u,
            pConnectionGroups: MutPtr<WinhttpConnectionGroup> = MutPtr(0L),
        ): WinhttpHostConnectionGroup =
            WinhttpHostConnectionGroup(
                pwszHostCtorArg = pwszHost,
                cConnectionGroups = cConnectionGroups,
                pConnectionGroupsCtorArg = pConnectionGroups,
            )
    }
}

public data class WinhttpHttp2ReceiveWindow(
    public var ulStreamWindow: UInt = 0u,
    public var ulStreamWindowUpdateDelta: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpHttp2ReceiveWindow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpHttp2ReceiveWindow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WinhttpHttp2ReceiveWindow =
                    WinhttpHttp2ReceiveWindow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinhttpHttp2ReceiveWindow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulStreamWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulStreamWindowUpdateDelta)
                }
            }
    }
}

public data class WinhttpMatchConnectionGuid(
    public var connectionGuid: Guid = Guid(),
    public var ullFlags: ULong = 0uL,
)

public class WinhttpProxyInfo internal constructor(
    public var dwAccessType: WinhttpAccessType,
    lpszProxyCtorArg: Pwstr,
    lpszProxyBypassCtorArg: Pwstr,
) {
    public var lpszProxy: Pwstr = lpszProxyCtorArg
        internal set

    public var lpszProxyBypass: Pwstr = lpszProxyBypassCtorArg
        internal set

    public constructor() : this(
        dwAccessType = 0u,
        lpszProxyCtorArg = MutPtr(0L),
        lpszProxyBypassCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WinhttpAccessType = this.dwAccessType

    public operator fun component2(): Pwstr = this.lpszProxy

    public operator fun component3(): Pwstr = this.lpszProxyBypass

    public fun copy(dwAccessType: WinhttpAccessType = this.dwAccessType, lpszProxy: Pwstr = this.lpszProxy, lpszProxyBypass: Pwstr = this.lpszProxyBypass): WinhttpProxyInfo = WinhttpProxyInfo(dwAccessType = dwAccessType, lpszProxyCtorArg = lpszProxy, lpszProxyBypassCtorArg = lpszProxyBypass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyInfo) return false
        if (this.dwAccessType != other.dwAccessType) return false
        if (this.lpszProxy != other.lpszProxy) return false
        if (this.lpszProxyBypass != other.lpszProxyBypass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAccessType.hashCode()
        result = 31 * result + this.lpszProxy.hashCode()
        result = 31 * result + this.lpszProxyBypass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAccessType: WinhttpAccessType = 0u,
            lpszProxy: Pwstr = MutPtr(0L),
            lpszProxyBypass: Pwstr = MutPtr(0L),
        ): WinhttpProxyInfo =
            WinhttpProxyInfo(
                dwAccessType = dwAccessType,
                lpszProxyCtorArg = lpszProxy,
                lpszProxyBypassCtorArg = lpszProxyBypass,
            )
    }
}

public data class WinhttpProxyNetworkingKey(
    public var pbBuffer: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyNetworkingKey) return false
        if (!this.pbBuffer.contentEquals(other.pbBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.pbBuffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpProxyNetworkingKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpProxyNetworkingKey> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): WinhttpProxyNetworkingKey =
                    WinhttpProxyNetworkingKey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WinhttpProxyNetworkingKey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.pbBuffer.toList())
                }
            }
    }
}

public class WinhttpProxyResult internal constructor(
    public var cEntries: UInt,
    pEntriesCtorArg: MutPtr<WinhttpProxyResultEntry>,
) {
    public var pEntries: MutPtr<WinhttpProxyResultEntry> = pEntriesCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pEntriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<WinhttpProxyResultEntry> = this.pEntries

    public fun copy(cEntries: UInt = this.cEntries, pEntries: MutPtr<WinhttpProxyResultEntry> = this.pEntries): WinhttpProxyResult = WinhttpProxyResult(cEntries = cEntries, pEntriesCtorArg = pEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyResult) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pEntries != other.pEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpProxyResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpProxyResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WinhttpProxyResult =
                    WinhttpProxyResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinhttpProxyResultEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinhttpProxyResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinhttpProxyResultEntry>(64)
                    ).writeNative(addr + 8L, value.pEntries)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pEntries: MutPtr<WinhttpProxyResultEntry> = MutPtr(0L),
        ): WinhttpProxyResult =
            WinhttpProxyResult(
                cEntries = cEntries,
                pEntriesCtorArg = pEntries,
            )
    }
}

public class WinhttpProxyResultEntry internal constructor(
    public var fProxy: Bool,
    public var fBypass: Bool,
    public var proxyScheme: WinhttpInternetScheme,
    pwszProxyCtorArg: Pwstr,
    public var proxyPort: UShort,
) {
    public var pwszProxy: Pwstr = pwszProxyCtorArg
        internal set

    public constructor() : this(
        fProxy = 0,
        fBypass = 0,
        proxyScheme = 0,
        pwszProxyCtorArg = MutPtr(0L),
        proxyPort = 0u,
    )

    public operator fun component1(): Bool = this.fProxy

    public operator fun component2(): Bool = this.fBypass

    public operator fun component3(): WinhttpInternetScheme = this.proxyScheme

    public operator fun component4(): Pwstr = this.pwszProxy

    public operator fun component5(): UShort = this.proxyPort

    public fun copy(fProxy: Bool = this.fProxy, fBypass: Bool = this.fBypass, proxyScheme: WinhttpInternetScheme = this.proxyScheme, pwszProxy: Pwstr = this.pwszProxy, proxyPort: UShort = this.proxyPort): WinhttpProxyResultEntry = WinhttpProxyResultEntry(fProxy = fProxy, fBypass = fBypass, proxyScheme = proxyScheme, pwszProxyCtorArg = pwszProxy, proxyPort = proxyPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyResultEntry) return false
        if (this.fProxy != other.fProxy) return false
        if (this.fBypass != other.fBypass) return false
        if (this.proxyScheme != other.proxyScheme) return false
        if (this.pwszProxy != other.pwszProxy) return false
        if (this.proxyPort != other.proxyPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fProxy.hashCode()
        result = 31 * result + this.fBypass.hashCode()
        result = 31 * result + this.proxyScheme.hashCode()
        result = 31 * result + this.pwszProxy.hashCode()
        result = 31 * result + this.proxyPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fProxy: Bool = 0,
            fBypass: Bool = 0,
            proxyScheme: WinhttpInternetScheme = 0,
            pwszProxy: Pwstr = MutPtr(0L),
            proxyPort: UShort = 0u,
        ): WinhttpProxyResultEntry =
            WinhttpProxyResultEntry(
                fProxy = fProxy,
                fBypass = fBypass,
                proxyScheme = proxyScheme,
                pwszProxyCtorArg = pwszProxy,
                proxyPort = proxyPort,
            )
    }
}

public class WinhttpProxyResultEx internal constructor(
    public var cEntries: UInt,
    pEntriesCtorArg: MutPtr<WinhttpProxyResultEntry>,
    hProxyDetectionHandleCtorArg: Handle,
    public var dwProxyInterfaceAffinity: UInt,
) {
    public var pEntries: MutPtr<WinhttpProxyResultEntry> = pEntriesCtorArg
        internal set

    public var hProxyDetectionHandle: Handle = hProxyDetectionHandleCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pEntriesCtorArg = MutPtr(0L),
        hProxyDetectionHandleCtorArg = MutPtr(0L),
        dwProxyInterfaceAffinity = 0u,
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<WinhttpProxyResultEntry> = this.pEntries

    public operator fun component3(): Handle = this.hProxyDetectionHandle

    public operator fun component4(): UInt = this.dwProxyInterfaceAffinity

    public fun copy(cEntries: UInt = this.cEntries, pEntries: MutPtr<WinhttpProxyResultEntry> = this.pEntries, hProxyDetectionHandle: Handle = this.hProxyDetectionHandle, dwProxyInterfaceAffinity: UInt = this.dwProxyInterfaceAffinity): WinhttpProxyResultEx = WinhttpProxyResultEx(cEntries = cEntries, pEntriesCtorArg = pEntries, hProxyDetectionHandleCtorArg = hProxyDetectionHandle, dwProxyInterfaceAffinity = dwProxyInterfaceAffinity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyResultEx) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pEntries != other.pEntries) return false
        if (this.hProxyDetectionHandle != other.hProxyDetectionHandle) return false
        if (this.dwProxyInterfaceAffinity != other.dwProxyInterfaceAffinity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pEntries.hashCode()
        result = 31 * result + this.hProxyDetectionHandle.hashCode()
        result = 31 * result + this.dwProxyInterfaceAffinity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cEntries: UInt = 0u,
            pEntries: MutPtr<WinhttpProxyResultEntry> = MutPtr(0L),
            hProxyDetectionHandle: Handle = MutPtr(0L),
            dwProxyInterfaceAffinity: UInt = 0u,
        ): WinhttpProxyResultEx =
            WinhttpProxyResultEx(
                cEntries = cEntries,
                pEntriesCtorArg = pEntries,
                hProxyDetectionHandleCtorArg = hProxyDetectionHandle,
                dwProxyInterfaceAffinity = dwProxyInterfaceAffinity,
            )
    }
}

public class WinhttpProxySettings internal constructor(
    public var dwStructSize: UInt,
    public var dwFlags: UInt,
    public var dwCurrentSettingsVersion: UInt,
    pwszConnectionNameCtorArg: Pwstr,
    pwszProxyCtorArg: Pwstr,
    pwszProxyBypassCtorArg: Pwstr,
    pwszAutoconfigUrlCtorArg: Pwstr,
    pwszAutoconfigSecondaryUrlCtorArg: Pwstr,
    public var dwAutoDiscoveryFlags: UInt,
    pwszLastKnownGoodAutoConfigUrlCtorArg: Pwstr,
    public var dwAutoconfigReloadDelayMins: UInt,
    public var ftLastKnownDetectTime: Filetime,
    public var dwDetectedInterfaceIpCount: UInt,
    pdwDetectedInterfaceIpCtorArg: MutPtr<UInt>,
    public var cNetworkKeys: UInt,
    pNetworkKeysCtorArg: MutPtr<WinhttpProxyNetworkingKey>,
) {
    public var pwszConnectionName: Pwstr = pwszConnectionNameCtorArg
        internal set

    public var pwszProxy: Pwstr = pwszProxyCtorArg
        internal set

    public var pwszProxyBypass: Pwstr = pwszProxyBypassCtorArg
        internal set

    public var pwszAutoconfigUrl: Pwstr = pwszAutoconfigUrlCtorArg
        internal set

    public var pwszAutoconfigSecondaryUrl: Pwstr = pwszAutoconfigSecondaryUrlCtorArg
        internal set

    public var pwszLastKnownGoodAutoConfigUrl: Pwstr = pwszLastKnownGoodAutoConfigUrlCtorArg
        internal set

    public var pdwDetectedInterfaceIp: MutPtr<UInt> = pdwDetectedInterfaceIpCtorArg
        internal set

    public var pNetworkKeys: MutPtr<WinhttpProxyNetworkingKey> = pNetworkKeysCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        dwFlags = 0u,
        dwCurrentSettingsVersion = 0u,
        pwszConnectionNameCtorArg = MutPtr(0L),
        pwszProxyCtorArg = MutPtr(0L),
        pwszProxyBypassCtorArg = MutPtr(0L),
        pwszAutoconfigUrlCtorArg = MutPtr(0L),
        pwszAutoconfigSecondaryUrlCtorArg = MutPtr(0L),
        dwAutoDiscoveryFlags = 0u,
        pwszLastKnownGoodAutoConfigUrlCtorArg = MutPtr(0L),
        dwAutoconfigReloadDelayMins = 0u,
        ftLastKnownDetectTime = Filetime(),
        dwDetectedInterfaceIpCount = 0u,
        pdwDetectedInterfaceIpCtorArg = MutPtr(0L),
        cNetworkKeys = 0u,
        pNetworkKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwCurrentSettingsVersion

    public operator fun component4(): Pwstr = this.pwszConnectionName

    public operator fun component5(): Pwstr = this.pwszProxy

    public operator fun component6(): Pwstr = this.pwszProxyBypass

    public operator fun component7(): Pwstr = this.pwszAutoconfigUrl

    public operator fun component8(): Pwstr = this.pwszAutoconfigSecondaryUrl

    public operator fun component9(): UInt = this.dwAutoDiscoveryFlags

    public operator fun component10(): Pwstr = this.pwszLastKnownGoodAutoConfigUrl

    public operator fun component11(): UInt = this.dwAutoconfigReloadDelayMins

    public operator fun component12(): Filetime = this.ftLastKnownDetectTime

    public operator fun component13(): UInt = this.dwDetectedInterfaceIpCount

    public operator fun component14(): MutPtr<UInt> = this.pdwDetectedInterfaceIp

    public operator fun component15(): UInt = this.cNetworkKeys

    public operator fun component16(): MutPtr<WinhttpProxyNetworkingKey> = this.pNetworkKeys

    public fun copy(dwStructSize: UInt = this.dwStructSize, dwFlags: UInt = this.dwFlags, dwCurrentSettingsVersion: UInt = this.dwCurrentSettingsVersion, pwszConnectionName: Pwstr = this.pwszConnectionName, pwszProxy: Pwstr = this.pwszProxy, pwszProxyBypass: Pwstr = this.pwszProxyBypass, pwszAutoconfigUrl: Pwstr = this.pwszAutoconfigUrl, pwszAutoconfigSecondaryUrl: Pwstr = this.pwszAutoconfigSecondaryUrl, dwAutoDiscoveryFlags: UInt = this.dwAutoDiscoveryFlags, pwszLastKnownGoodAutoConfigUrl: Pwstr = this.pwszLastKnownGoodAutoConfigUrl, dwAutoconfigReloadDelayMins: UInt = this.dwAutoconfigReloadDelayMins, ftLastKnownDetectTime: Filetime = this.ftLastKnownDetectTime, dwDetectedInterfaceIpCount: UInt = this.dwDetectedInterfaceIpCount, pdwDetectedInterfaceIp: MutPtr<UInt> = this.pdwDetectedInterfaceIp, cNetworkKeys: UInt = this.cNetworkKeys, pNetworkKeys: MutPtr<WinhttpProxyNetworkingKey> = this.pNetworkKeys): WinhttpProxySettings = WinhttpProxySettings(dwStructSize = dwStructSize, dwFlags = dwFlags, dwCurrentSettingsVersion = dwCurrentSettingsVersion, pwszConnectionNameCtorArg = pwszConnectionName, pwszProxyCtorArg = pwszProxy, pwszProxyBypassCtorArg = pwszProxyBypass, pwszAutoconfigUrlCtorArg = pwszAutoconfigUrl, pwszAutoconfigSecondaryUrlCtorArg = pwszAutoconfigSecondaryUrl, dwAutoDiscoveryFlags = dwAutoDiscoveryFlags, pwszLastKnownGoodAutoConfigUrlCtorArg = pwszLastKnownGoodAutoConfigUrl, dwAutoconfigReloadDelayMins = dwAutoconfigReloadDelayMins, ftLastKnownDetectTime = ftLastKnownDetectTime, dwDetectedInterfaceIpCount = dwDetectedInterfaceIpCount, pdwDetectedInterfaceIpCtorArg = pdwDetectedInterfaceIp, cNetworkKeys = cNetworkKeys, pNetworkKeysCtorArg = pNetworkKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxySettings) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCurrentSettingsVersion != other.dwCurrentSettingsVersion) return false
        if (this.pwszConnectionName != other.pwszConnectionName) return false
        if (this.pwszProxy != other.pwszProxy) return false
        if (this.pwszProxyBypass != other.pwszProxyBypass) return false
        if (this.pwszAutoconfigUrl != other.pwszAutoconfigUrl) return false
        if (this.pwszAutoconfigSecondaryUrl != other.pwszAutoconfigSecondaryUrl) return false
        if (this.dwAutoDiscoveryFlags != other.dwAutoDiscoveryFlags) return false
        if (this.pwszLastKnownGoodAutoConfigUrl != other.pwszLastKnownGoodAutoConfigUrl) return false
        if (this.dwAutoconfigReloadDelayMins != other.dwAutoconfigReloadDelayMins) return false
        if (this.ftLastKnownDetectTime != other.ftLastKnownDetectTime) return false
        if (this.dwDetectedInterfaceIpCount != other.dwDetectedInterfaceIpCount) return false
        if (this.pdwDetectedInterfaceIp != other.pdwDetectedInterfaceIp) return false
        if (this.cNetworkKeys != other.cNetworkKeys) return false
        if (this.pNetworkKeys != other.pNetworkKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCurrentSettingsVersion.hashCode()
        result = 31 * result + this.pwszConnectionName.hashCode()
        result = 31 * result + this.pwszProxy.hashCode()
        result = 31 * result + this.pwszProxyBypass.hashCode()
        result = 31 * result + this.pwszAutoconfigUrl.hashCode()
        result = 31 * result + this.pwszAutoconfigSecondaryUrl.hashCode()
        result = 31 * result + this.dwAutoDiscoveryFlags.hashCode()
        result = 31 * result + this.pwszLastKnownGoodAutoConfigUrl.hashCode()
        result = 31 * result + this.dwAutoconfigReloadDelayMins.hashCode()
        result = 31 * result + this.ftLastKnownDetectTime.hashCode()
        result = 31 * result + this.dwDetectedInterfaceIpCount.hashCode()
        result = 31 * result + this.pdwDetectedInterfaceIp.hashCode()
        result = 31 * result + this.cNetworkKeys.hashCode()
        result = 31 * result + this.pNetworkKeys.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwCurrentSettingsVersion: UInt = 0u,
            pwszConnectionName: Pwstr = MutPtr(0L),
            pwszProxy: Pwstr = MutPtr(0L),
            pwszProxyBypass: Pwstr = MutPtr(0L),
            pwszAutoconfigUrl: Pwstr = MutPtr(0L),
            pwszAutoconfigSecondaryUrl: Pwstr = MutPtr(0L),
            dwAutoDiscoveryFlags: UInt = 0u,
            pwszLastKnownGoodAutoConfigUrl: Pwstr = MutPtr(0L),
            dwAutoconfigReloadDelayMins: UInt = 0u,
            ftLastKnownDetectTime: Filetime = Filetime(),
            dwDetectedInterfaceIpCount: UInt = 0u,
            pdwDetectedInterfaceIp: MutPtr<UInt> = MutPtr(0L),
            cNetworkKeys: UInt = 0u,
            pNetworkKeys: MutPtr<WinhttpProxyNetworkingKey> = MutPtr(0L),
        ): WinhttpProxySettings =
            WinhttpProxySettings(
                dwStructSize = dwStructSize,
                dwFlags = dwFlags,
                dwCurrentSettingsVersion = dwCurrentSettingsVersion,
                pwszConnectionNameCtorArg = pwszConnectionName,
                pwszProxyCtorArg = pwszProxy,
                pwszProxyBypassCtorArg = pwszProxyBypass,
                pwszAutoconfigUrlCtorArg = pwszAutoconfigUrl,
                pwszAutoconfigSecondaryUrlCtorArg = pwszAutoconfigSecondaryUrl,
                dwAutoDiscoveryFlags = dwAutoDiscoveryFlags,
                pwszLastKnownGoodAutoConfigUrlCtorArg = pwszLastKnownGoodAutoConfigUrl,
                dwAutoconfigReloadDelayMins = dwAutoconfigReloadDelayMins,
                ftLastKnownDetectTime = ftLastKnownDetectTime,
                dwDetectedInterfaceIpCount = dwDetectedInterfaceIpCount,
                pdwDetectedInterfaceIpCtorArg = pdwDetectedInterfaceIp,
                cNetworkKeys = cNetworkKeys,
                pNetworkKeysCtorArg = pNetworkKeys,
            )
    }
}

public class WinhttpProxySettingsEx internal constructor(
    public var ullGenerationId: ULong,
    public var ullFlags: ULong,
    pcwszAutoconfigUrlCtorArg: Pcwstr,
    pcwszProxyCtorArg: Pcwstr,
    pcwszSecureProxyCtorArg: Pcwstr,
    public var cProxyBypasses: UInt,
    rgpcwszProxyBypassesCtorArg: ConstPtr<Pcwstr>,
    public var dwInterfaceIndex: UInt,
    pcwszConnectionNameCtorArg: Pcwstr,
) {
    public var pcwszAutoconfigUrl: Pcwstr = pcwszAutoconfigUrlCtorArg
        internal set

    public var pcwszProxy: Pcwstr = pcwszProxyCtorArg
        internal set

    public var pcwszSecureProxy: Pcwstr = pcwszSecureProxyCtorArg
        internal set

    public var rgpcwszProxyBypasses: ConstPtr<Pcwstr> = rgpcwszProxyBypassesCtorArg
        internal set

    public var pcwszConnectionName: Pcwstr = pcwszConnectionNameCtorArg
        internal set

    public constructor() : this(
        ullGenerationId = 0uL,
        ullFlags = 0uL,
        pcwszAutoconfigUrlCtorArg = ConstPtr(0L),
        pcwszProxyCtorArg = ConstPtr(0L),
        pcwszSecureProxyCtorArg = ConstPtr(0L),
        cProxyBypasses = 0u,
        rgpcwszProxyBypassesCtorArg = ConstPtr(0L),
        dwInterfaceIndex = 0u,
        pcwszConnectionNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.ullGenerationId

    public operator fun component2(): ULong = this.ullFlags

    public operator fun component3(): Pcwstr = this.pcwszAutoconfigUrl

    public operator fun component4(): Pcwstr = this.pcwszProxy

    public operator fun component5(): Pcwstr = this.pcwszSecureProxy

    public operator fun component6(): UInt = this.cProxyBypasses

    public operator fun component7(): ConstPtr<Pcwstr> = this.rgpcwszProxyBypasses

    public operator fun component8(): UInt = this.dwInterfaceIndex

    public operator fun component9(): Pcwstr = this.pcwszConnectionName

    public fun copy(ullGenerationId: ULong = this.ullGenerationId, ullFlags: ULong = this.ullFlags, pcwszAutoconfigUrl: Pcwstr = this.pcwszAutoconfigUrl, pcwszProxy: Pcwstr = this.pcwszProxy, pcwszSecureProxy: Pcwstr = this.pcwszSecureProxy, cProxyBypasses: UInt = this.cProxyBypasses, rgpcwszProxyBypasses: ConstPtr<Pcwstr> = this.rgpcwszProxyBypasses, dwInterfaceIndex: UInt = this.dwInterfaceIndex, pcwszConnectionName: Pcwstr = this.pcwszConnectionName): WinhttpProxySettingsEx = WinhttpProxySettingsEx(ullGenerationId = ullGenerationId, ullFlags = ullFlags, pcwszAutoconfigUrlCtorArg = pcwszAutoconfigUrl, pcwszProxyCtorArg = pcwszProxy, pcwszSecureProxyCtorArg = pcwszSecureProxy, cProxyBypasses = cProxyBypasses, rgpcwszProxyBypassesCtorArg = rgpcwszProxyBypasses, dwInterfaceIndex = dwInterfaceIndex, pcwszConnectionNameCtorArg = pcwszConnectionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxySettingsEx) return false
        if (this.ullGenerationId != other.ullGenerationId) return false
        if (this.ullFlags != other.ullFlags) return false
        if (this.pcwszAutoconfigUrl != other.pcwszAutoconfigUrl) return false
        if (this.pcwszProxy != other.pcwszProxy) return false
        if (this.pcwszSecureProxy != other.pcwszSecureProxy) return false
        if (this.cProxyBypasses != other.cProxyBypasses) return false
        if (this.rgpcwszProxyBypasses != other.rgpcwszProxyBypasses) return false
        if (this.dwInterfaceIndex != other.dwInterfaceIndex) return false
        if (this.pcwszConnectionName != other.pcwszConnectionName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullGenerationId.hashCode()
        result = 31 * result + this.ullFlags.hashCode()
        result = 31 * result + this.pcwszAutoconfigUrl.hashCode()
        result = 31 * result + this.pcwszProxy.hashCode()
        result = 31 * result + this.pcwszSecureProxy.hashCode()
        result = 31 * result + this.cProxyBypasses.hashCode()
        result = 31 * result + this.rgpcwszProxyBypasses.hashCode()
        result = 31 * result + this.dwInterfaceIndex.hashCode()
        result = 31 * result + this.pcwszConnectionName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ullGenerationId: ULong = 0uL,
            ullFlags: ULong = 0uL,
            pcwszAutoconfigUrl: Pcwstr = ConstPtr(0L),
            pcwszProxy: Pcwstr = ConstPtr(0L),
            pcwszSecureProxy: Pcwstr = ConstPtr(0L),
            cProxyBypasses: UInt = 0u,
            rgpcwszProxyBypasses: ConstPtr<Pcwstr> = ConstPtr(0L),
            dwInterfaceIndex: UInt = 0u,
            pcwszConnectionName: Pcwstr = ConstPtr(0L),
        ): WinhttpProxySettingsEx =
            WinhttpProxySettingsEx(
                ullGenerationId = ullGenerationId,
                ullFlags = ullFlags,
                pcwszAutoconfigUrlCtorArg = pcwszAutoconfigUrl,
                pcwszProxyCtorArg = pcwszProxy,
                pcwszSecureProxyCtorArg = pcwszSecureProxy,
                cProxyBypasses = cProxyBypasses,
                rgpcwszProxyBypassesCtorArg = rgpcwszProxyBypasses,
                dwInterfaceIndex = dwInterfaceIndex,
                pcwszConnectionNameCtorArg = pcwszConnectionName,
            )
    }
}

public class WinhttpProxySettingsParam internal constructor(
    public var ullFlags: ULong,
    pcwszConnectionNameCtorArg: Pcwstr,
    pcwszProbeHostCtorArg: Pcwstr,
) {
    public var pcwszConnectionName: Pcwstr = pcwszConnectionNameCtorArg
        internal set

    public var pcwszProbeHost: Pcwstr = pcwszProbeHostCtorArg
        internal set

    public constructor() : this(
        ullFlags = 0uL,
        pcwszConnectionNameCtorArg = ConstPtr(0L),
        pcwszProbeHostCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.ullFlags

    public operator fun component2(): Pcwstr = this.pcwszConnectionName

    public operator fun component3(): Pcwstr = this.pcwszProbeHost

    public fun copy(ullFlags: ULong = this.ullFlags, pcwszConnectionName: Pcwstr = this.pcwszConnectionName, pcwszProbeHost: Pcwstr = this.pcwszProbeHost): WinhttpProxySettingsParam = WinhttpProxySettingsParam(ullFlags = ullFlags, pcwszConnectionNameCtorArg = pcwszConnectionName, pcwszProbeHostCtorArg = pcwszProbeHost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxySettingsParam) return false
        if (this.ullFlags != other.ullFlags) return false
        if (this.pcwszConnectionName != other.pcwszConnectionName) return false
        if (this.pcwszProbeHost != other.pcwszProbeHost) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullFlags.hashCode()
        result = 31 * result + this.pcwszConnectionName.hashCode()
        result = 31 * result + this.pcwszProbeHost.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ullFlags: ULong = 0uL,
            pcwszConnectionName: Pcwstr = ConstPtr(0L),
            pcwszProbeHost: Pcwstr = ConstPtr(0L),
        ): WinhttpProxySettingsParam =
            WinhttpProxySettingsParam(
                ullFlags = ullFlags,
                pcwszConnectionNameCtorArg = pcwszConnectionName,
                pcwszProbeHostCtorArg = pcwszProbeHost,
            )
    }
}

public class WinhttpQueryConnectionGroupResult internal constructor(
    public var cHosts: UInt,
    pHostConnectionGroupsCtorArg: MutPtr<WinhttpHostConnectionGroup>,
) {
    public var pHostConnectionGroups: MutPtr<WinhttpHostConnectionGroup> = pHostConnectionGroupsCtorArg
        internal set

    public constructor() : this(
        cHosts = 0u,
        pHostConnectionGroupsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cHosts

    public operator fun component2(): MutPtr<WinhttpHostConnectionGroup> = this.pHostConnectionGroups

    public fun copy(cHosts: UInt = this.cHosts, pHostConnectionGroups: MutPtr<WinhttpHostConnectionGroup> = this.pHostConnectionGroups): WinhttpQueryConnectionGroupResult = WinhttpQueryConnectionGroupResult(cHosts = cHosts, pHostConnectionGroupsCtorArg = pHostConnectionGroups)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpQueryConnectionGroupResult) return false
        if (this.cHosts != other.cHosts) return false
        if (this.pHostConnectionGroups != other.pHostConnectionGroups) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cHosts.hashCode()
        result = 31 * result + this.pHostConnectionGroups.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpQueryConnectionGroupResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpQueryConnectionGroupResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WinhttpQueryConnectionGroupResult =
                    WinhttpQueryConnectionGroupResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinhttpHostConnectionGroup>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinhttpQueryConnectionGroupResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cHosts)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinhttpHostConnectionGroup>(64)
                    ).writeNative(addr + 8L, value.pHostConnectionGroups)
                }
            }

        public operator fun invoke(
            cHosts: UInt = 0u,
            pHostConnectionGroups: MutPtr<WinhttpHostConnectionGroup> = MutPtr(0L),
        ): WinhttpQueryConnectionGroupResult =
            WinhttpQueryConnectionGroupResult(
                cHosts = cHosts,
                pHostConnectionGroupsCtorArg = pHostConnectionGroups,
            )
    }
}

public data class WinhttpRequestStats(
    public var ullFlags: ULong = 0uL,
    public var ulIndex: UInt = 0u,
    public var cStats: UInt = 0u,
    public var rgullStats: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpRequestStats) return false
        if (this.ullFlags != other.ullFlags) return false
        if (this.ulIndex != other.ulIndex) return false
        if (this.cStats != other.cStats) return false
        if (!this.rgullStats.contentEquals(other.rgullStats)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullFlags.hashCode()
        result = 31 * result + this.ulIndex.hashCode()
        result = 31 * result + this.cStats.hashCode()
        result = 31 * result + this.rgullStats.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpRequestStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpRequestStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): WinhttpRequestStats =
                    WinhttpRequestStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: WinhttpRequestStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cStats)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 16L, value.rgullStats.toList())
                }
            }
    }
}

public data class WinhttpRequestTimes(
    public var cTimes: UInt = 0u,
    public var rgullTimes: ULongArray = ULongArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpRequestTimes) return false
        if (this.cTimes != other.cTimes) return false
        if (!this.rgullTimes.contentEquals(other.rgullTimes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTimes.hashCode()
        result = 31 * result + this.rgullTimes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpRequestTimes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpRequestTimes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): WinhttpRequestTimes =
                    WinhttpRequestTimes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (64).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: WinhttpRequestTimes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTimes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (64).toInt())
                    ).writeNative(addr + 8L, value.rgullTimes.toList())
                }
            }
    }
}

public data class WinhttpResolverCacheConfig(
    public var ulMaxResolverCacheEntries: UInt = 0u,
    public var ulMaxCacheEntryAge: UInt = 0u,
    public var ulMinCacheEntryTtl: UInt = 0u,
    public var secureDnsSetting: WinhttpSecureDnsSetting = 0,
    public var ullConnResolutionWaitTime: ULong = 0uL,
    public var ullFlags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpResolverCacheConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpResolverCacheConfig> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WinhttpResolverCacheConfig =
                    WinhttpResolverCacheConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WinhttpResolverCacheConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulMaxResolverCacheEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulMaxCacheEntryAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulMinCacheEntryTtl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.secureDnsSetting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullConnResolutionWaitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullFlags)
                }
            }
    }
}

public data class WinhttpWebSocketAsyncResult(
    public var asyncResult: WinhttpAsyncResult = WinhttpAsyncResult(),
    public var operation: WinhttpWebSocketOperation = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpWebSocketAsyncResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpWebSocketAsyncResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WinhttpWebSocketAsyncResult =
                    WinhttpWebSocketAsyncResult(
                        (WinhttpAsyncResult.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinhttpWebSocketAsyncResult) {
                    (WinhttpAsyncResult.typeLayout()).writeNative(addr, value.asyncResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.operation)
                }
            }
    }
}

public data class WinhttpWebSocketStatus(
    public var dwBytesTransferred: UInt = 0u,
    public var eBufferType: WinhttpWebSocketBufferType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpWebSocketStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinhttpWebSocketStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WinhttpWebSocketStatus =
                    WinhttpWebSocketStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinhttpWebSocketStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBytesTransferred)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eBufferType)
                }
            }
    }
}
