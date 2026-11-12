@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public data class CertContextEx(
    public var certContext: CertContext = CertContext(),
    public var cbAllocated: UInt = 0u,
    public var dwCertificateFlags: UInt = 0u,
)

public class ConfigurationEntry internal constructor(
    bstrKeyCtorArg: Bstr,
    bstrValueCtorArg: Bstr,
) {
    public var bstrKey: Bstr = bstrKeyCtorArg
        internal set

    public var bstrValue: Bstr = bstrValueCtorArg
        internal set

    public constructor() : this(
        bstrKeyCtorArg = ConstPtr(0L),
        bstrValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Bstr = this.bstrKey

    public operator fun component2(): Bstr = this.bstrValue

    public fun copy(bstrKey: Bstr = this.bstrKey, bstrValue: Bstr = this.bstrValue): ConfigurationEntry = ConfigurationEntry(bstrKeyCtorArg = bstrKey, bstrValueCtorArg = bstrValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigurationEntry) return false
        if (this.bstrKey != other.bstrKey) return false
        if (this.bstrValue != other.bstrValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bstrKey.hashCode()
        result = 31 * result + this.bstrValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bstrKey: Bstr = ConstPtr(0L),
            bstrValue: Bstr = ConstPtr(0L),
        ): ConfigurationEntry =
            ConfigurationEntry(
                bstrKeyCtorArg = bstrKey,
                bstrValueCtorArg = bstrValue,
            )
    }
}

public class ExtensionControlBlock internal constructor(
    public var cbSize: UInt,
    public var dwVersion: UInt,
    connIDCtorArg: Hconn,
    public var dwHttpStatusCode: UInt,
    public var lpszLogData: ByteArray,
    lpszMethodCtorArg: Pstr,
    lpszQueryStringCtorArg: Pstr,
    lpszPathInfoCtorArg: Pstr,
    lpszPathTranslatedCtorArg: Pstr,
    public var cbTotalBytes: UInt,
    public var cbAvailable: UInt,
    lpbDataCtorArg: MutPtr<UByte>,
    lpszContentTypeCtorArg: Pstr,
    public var getServerVariable: PfnIisGetservervariable,
    public var writeClient: PfnIisWriteclient,
    public var readClient: PfnIisReadclient,
    public var serverSupportFunction: PfnIisServersupportfunction,
) {
    public var connID: Hconn = connIDCtorArg
        internal set

    public var lpszMethod: Pstr = lpszMethodCtorArg
        internal set

    public var lpszQueryString: Pstr = lpszQueryStringCtorArg
        internal set

    public var lpszPathInfo: Pstr = lpszPathInfoCtorArg
        internal set

    public var lpszPathTranslated: Pstr = lpszPathTranslatedCtorArg
        internal set

    public var lpbData: MutPtr<UByte> = lpbDataCtorArg
        internal set

    public var lpszContentType: Pstr = lpszContentTypeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwVersion = 0u,
        connIDCtorArg = MutPtr(0L),
        dwHttpStatusCode = 0u,
        lpszLogData = ByteArray(80),
        lpszMethodCtorArg = MutPtr(0L),
        lpszQueryStringCtorArg = MutPtr(0L),
        lpszPathInfoCtorArg = MutPtr(0L),
        lpszPathTranslatedCtorArg = MutPtr(0L),
        cbTotalBytes = 0u,
        cbAvailable = 0u,
        lpbDataCtorArg = MutPtr(0L),
        lpszContentTypeCtorArg = MutPtr(0L),
        getServerVariable = null,
        writeClient = null,
        readClient = null,
        serverSupportFunction = null,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwVersion: UInt = 0u,
            connID: Hconn = MutPtr(0L),
            dwHttpStatusCode: UInt = 0u,
            lpszLogData: ByteArray = ByteArray(80),
            lpszMethod: Pstr = MutPtr(0L),
            lpszQueryString: Pstr = MutPtr(0L),
            lpszPathInfo: Pstr = MutPtr(0L),
            lpszPathTranslated: Pstr = MutPtr(0L),
            cbTotalBytes: UInt = 0u,
            cbAvailable: UInt = 0u,
            lpbData: MutPtr<UByte> = MutPtr(0L),
            lpszContentType: Pstr = MutPtr(0L),
            getServerVariable: PfnIisGetservervariable = null,
            writeClient: PfnIisWriteclient = null,
            readClient: PfnIisReadclient = null,
            serverSupportFunction: PfnIisServersupportfunction = null,
        ): ExtensionControlBlock =
            ExtensionControlBlock(
                cbSize = cbSize,
                dwVersion = dwVersion,
                connIDCtorArg = connID,
                dwHttpStatusCode = dwHttpStatusCode,
                lpszLogData = lpszLogData,
                lpszMethodCtorArg = lpszMethod,
                lpszQueryStringCtorArg = lpszQueryString,
                lpszPathInfoCtorArg = lpszPathInfo,
                lpszPathTranslatedCtorArg = lpszPathTranslated,
                cbTotalBytes = cbTotalBytes,
                cbAvailable = cbAvailable,
                lpbDataCtorArg = lpbData,
                lpszContentTypeCtorArg = lpszContentType,
                getServerVariable = getServerVariable,
                writeClient = writeClient,
                readClient = readClient,
                serverSupportFunction = serverSupportFunction,
            )
    }
}

public class HseCustomErrorInfo internal constructor(
    pszStatusCtorArg: Pstr,
    public var uHttpSubError: UShort,
    public var fAsync: Bool,
) {
    public var pszStatus: Pstr = pszStatusCtorArg
        internal set

    public constructor() : this(
        pszStatusCtorArg = MutPtr(0L),
        uHttpSubError = 0u,
        fAsync = 0,
    )

    public operator fun component1(): Pstr = this.pszStatus

    public operator fun component2(): UShort = this.uHttpSubError

    public operator fun component3(): Bool = this.fAsync

    public fun copy(pszStatus: Pstr = this.pszStatus, uHttpSubError: UShort = this.uHttpSubError, fAsync: Bool = this.fAsync): HseCustomErrorInfo = HseCustomErrorInfo(pszStatusCtorArg = pszStatus, uHttpSubError = uHttpSubError, fAsync = fAsync)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseCustomErrorInfo) return false
        if (this.pszStatus != other.pszStatus) return false
        if (this.uHttpSubError != other.uHttpSubError) return false
        if (this.fAsync != other.fAsync) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszStatus.hashCode()
        result = 31 * result + this.uHttpSubError.hashCode()
        result = 31 * result + this.fAsync.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszStatus: Pstr = MutPtr(0L),
            uHttpSubError: UShort = 0u,
            fAsync: Bool = 0,
        ): HseCustomErrorInfo =
            HseCustomErrorInfo(
                pszStatusCtorArg = pszStatus,
                uHttpSubError = uHttpSubError,
                fAsync = fAsync,
            )
    }
}

public class HseExecUnicodeUrlInfo internal constructor(
    pszUrlCtorArg: Pwstr,
    pszMethodCtorArg: Pstr,
    pszChildHeadersCtorArg: Pstr,
    pUserInfoCtorArg: MutPtr<HseExecUnicodeUrlUserInfo>,
    pEntityCtorArg: MutPtr<HseExecUrlEntityInfo>,
    public var dwExecUrlFlags: UInt,
) {
    public var pszUrl: Pwstr = pszUrlCtorArg
        internal set

    public var pszMethod: Pstr = pszMethodCtorArg
        internal set

    public var pszChildHeaders: Pstr = pszChildHeadersCtorArg
        internal set

    public var pUserInfo: MutPtr<HseExecUnicodeUrlUserInfo> = pUserInfoCtorArg
        internal set

    public var pEntity: MutPtr<HseExecUrlEntityInfo> = pEntityCtorArg
        internal set

    public constructor() : this(
        pszUrlCtorArg = MutPtr(0L),
        pszMethodCtorArg = MutPtr(0L),
        pszChildHeadersCtorArg = MutPtr(0L),
        pUserInfoCtorArg = MutPtr(0L),
        pEntityCtorArg = MutPtr(0L),
        dwExecUrlFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszUrl

    public operator fun component2(): Pstr = this.pszMethod

    public operator fun component3(): Pstr = this.pszChildHeaders

    public operator fun component4(): MutPtr<HseExecUnicodeUrlUserInfo> = this.pUserInfo

    public operator fun component5(): MutPtr<HseExecUrlEntityInfo> = this.pEntity

    public operator fun component6(): UInt = this.dwExecUrlFlags

    public fun copy(pszUrl: Pwstr = this.pszUrl, pszMethod: Pstr = this.pszMethod, pszChildHeaders: Pstr = this.pszChildHeaders, pUserInfo: MutPtr<HseExecUnicodeUrlUserInfo> = this.pUserInfo, pEntity: MutPtr<HseExecUrlEntityInfo> = this.pEntity, dwExecUrlFlags: UInt = this.dwExecUrlFlags): HseExecUnicodeUrlInfo = HseExecUnicodeUrlInfo(pszUrlCtorArg = pszUrl, pszMethodCtorArg = pszMethod, pszChildHeadersCtorArg = pszChildHeaders, pUserInfoCtorArg = pUserInfo, pEntityCtorArg = pEntity, dwExecUrlFlags = dwExecUrlFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseExecUnicodeUrlInfo) return false
        if (this.pszUrl != other.pszUrl) return false
        if (this.pszMethod != other.pszMethod) return false
        if (this.pszChildHeaders != other.pszChildHeaders) return false
        if (this.pUserInfo != other.pUserInfo) return false
        if (this.pEntity != other.pEntity) return false
        if (this.dwExecUrlFlags != other.dwExecUrlFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUrl.hashCode()
        result = 31 * result + this.pszMethod.hashCode()
        result = 31 * result + this.pszChildHeaders.hashCode()
        result = 31 * result + this.pUserInfo.hashCode()
        result = 31 * result + this.pEntity.hashCode()
        result = 31 * result + this.dwExecUrlFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUrl: Pwstr = MutPtr(0L),
            pszMethod: Pstr = MutPtr(0L),
            pszChildHeaders: Pstr = MutPtr(0L),
            pUserInfo: MutPtr<HseExecUnicodeUrlUserInfo> = MutPtr(0L),
            pEntity: MutPtr<HseExecUrlEntityInfo> = MutPtr(0L),
            dwExecUrlFlags: UInt = 0u,
        ): HseExecUnicodeUrlInfo =
            HseExecUnicodeUrlInfo(
                pszUrlCtorArg = pszUrl,
                pszMethodCtorArg = pszMethod,
                pszChildHeadersCtorArg = pszChildHeaders,
                pUserInfoCtorArg = pUserInfo,
                pEntityCtorArg = pEntity,
                dwExecUrlFlags = dwExecUrlFlags,
            )
    }
}

public class HseExecUnicodeUrlUserInfo internal constructor(
    hImpersonationTokenCtorArg: Handle,
    pszCustomUserNameCtorArg: Pwstr,
    pszCustomAuthTypeCtorArg: Pstr,
) {
    public var hImpersonationToken: Handle = hImpersonationTokenCtorArg
        internal set

    public var pszCustomUserName: Pwstr = pszCustomUserNameCtorArg
        internal set

    public var pszCustomAuthType: Pstr = pszCustomAuthTypeCtorArg
        internal set

    public constructor() : this(
        hImpersonationTokenCtorArg = MutPtr(0L),
        pszCustomUserNameCtorArg = MutPtr(0L),
        pszCustomAuthTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hImpersonationToken

    public operator fun component2(): Pwstr = this.pszCustomUserName

    public operator fun component3(): Pstr = this.pszCustomAuthType

    public fun copy(hImpersonationToken: Handle = this.hImpersonationToken, pszCustomUserName: Pwstr = this.pszCustomUserName, pszCustomAuthType: Pstr = this.pszCustomAuthType): HseExecUnicodeUrlUserInfo = HseExecUnicodeUrlUserInfo(hImpersonationTokenCtorArg = hImpersonationToken, pszCustomUserNameCtorArg = pszCustomUserName, pszCustomAuthTypeCtorArg = pszCustomAuthType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseExecUnicodeUrlUserInfo) return false
        if (this.hImpersonationToken != other.hImpersonationToken) return false
        if (this.pszCustomUserName != other.pszCustomUserName) return false
        if (this.pszCustomAuthType != other.pszCustomAuthType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hImpersonationToken.hashCode()
        result = 31 * result + this.pszCustomUserName.hashCode()
        result = 31 * result + this.pszCustomAuthType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hImpersonationToken: Handle = MutPtr(0L),
            pszCustomUserName: Pwstr = MutPtr(0L),
            pszCustomAuthType: Pstr = MutPtr(0L),
        ): HseExecUnicodeUrlUserInfo =
            HseExecUnicodeUrlUserInfo(
                hImpersonationTokenCtorArg = hImpersonationToken,
                pszCustomUserNameCtorArg = pszCustomUserName,
                pszCustomAuthTypeCtorArg = pszCustomAuthType,
            )
    }
}

public class HseExecUrlEntityInfo internal constructor(
    public var cbAvailable: UInt,
    lpbDataCtorArg: MutPtr<CVoid>,
) {
    public var lpbData: MutPtr<CVoid> = lpbDataCtorArg
        internal set

    public constructor() : this(
        cbAvailable = 0u,
        lpbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbAvailable

    public operator fun component2(): MutPtr<CVoid> = this.lpbData

    public fun copy(cbAvailable: UInt = this.cbAvailable, lpbData: MutPtr<CVoid> = this.lpbData): HseExecUrlEntityInfo = HseExecUrlEntityInfo(cbAvailable = cbAvailable, lpbDataCtorArg = lpbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseExecUrlEntityInfo) return false
        if (this.cbAvailable != other.cbAvailable) return false
        if (this.lpbData != other.lpbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbAvailable.hashCode()
        result = 31 * result + this.lpbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseExecUrlEntityInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseExecUrlEntityInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HseExecUrlEntityInfo =
                    HseExecUrlEntityInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HseExecUrlEntityInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbAvailable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpbData)
                }
            }

        public operator fun invoke(
            cbAvailable: UInt = 0u,
            lpbData: MutPtr<CVoid> = MutPtr(0L),
        ): HseExecUrlEntityInfo =
            HseExecUrlEntityInfo(
                cbAvailable = cbAvailable,
                lpbDataCtorArg = lpbData,
            )
    }
}

public class HseExecUrlInfo internal constructor(
    pszUrlCtorArg: Pstr,
    pszMethodCtorArg: Pstr,
    pszChildHeadersCtorArg: Pstr,
    pUserInfoCtorArg: MutPtr<HseExecUrlUserInfo>,
    pEntityCtorArg: MutPtr<HseExecUrlEntityInfo>,
    public var dwExecUrlFlags: UInt,
) {
    public var pszUrl: Pstr = pszUrlCtorArg
        internal set

    public var pszMethod: Pstr = pszMethodCtorArg
        internal set

    public var pszChildHeaders: Pstr = pszChildHeadersCtorArg
        internal set

    public var pUserInfo: MutPtr<HseExecUrlUserInfo> = pUserInfoCtorArg
        internal set

    public var pEntity: MutPtr<HseExecUrlEntityInfo> = pEntityCtorArg
        internal set

    public constructor() : this(
        pszUrlCtorArg = MutPtr(0L),
        pszMethodCtorArg = MutPtr(0L),
        pszChildHeadersCtorArg = MutPtr(0L),
        pUserInfoCtorArg = MutPtr(0L),
        pEntityCtorArg = MutPtr(0L),
        dwExecUrlFlags = 0u,
    )

    public operator fun component1(): Pstr = this.pszUrl

    public operator fun component2(): Pstr = this.pszMethod

    public operator fun component3(): Pstr = this.pszChildHeaders

    public operator fun component4(): MutPtr<HseExecUrlUserInfo> = this.pUserInfo

    public operator fun component5(): MutPtr<HseExecUrlEntityInfo> = this.pEntity

    public operator fun component6(): UInt = this.dwExecUrlFlags

    public fun copy(pszUrl: Pstr = this.pszUrl, pszMethod: Pstr = this.pszMethod, pszChildHeaders: Pstr = this.pszChildHeaders, pUserInfo: MutPtr<HseExecUrlUserInfo> = this.pUserInfo, pEntity: MutPtr<HseExecUrlEntityInfo> = this.pEntity, dwExecUrlFlags: UInt = this.dwExecUrlFlags): HseExecUrlInfo = HseExecUrlInfo(pszUrlCtorArg = pszUrl, pszMethodCtorArg = pszMethod, pszChildHeadersCtorArg = pszChildHeaders, pUserInfoCtorArg = pUserInfo, pEntityCtorArg = pEntity, dwExecUrlFlags = dwExecUrlFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseExecUrlInfo) return false
        if (this.pszUrl != other.pszUrl) return false
        if (this.pszMethod != other.pszMethod) return false
        if (this.pszChildHeaders != other.pszChildHeaders) return false
        if (this.pUserInfo != other.pUserInfo) return false
        if (this.pEntity != other.pEntity) return false
        if (this.dwExecUrlFlags != other.dwExecUrlFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUrl.hashCode()
        result = 31 * result + this.pszMethod.hashCode()
        result = 31 * result + this.pszChildHeaders.hashCode()
        result = 31 * result + this.pUserInfo.hashCode()
        result = 31 * result + this.pEntity.hashCode()
        result = 31 * result + this.dwExecUrlFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUrl: Pstr = MutPtr(0L),
            pszMethod: Pstr = MutPtr(0L),
            pszChildHeaders: Pstr = MutPtr(0L),
            pUserInfo: MutPtr<HseExecUrlUserInfo> = MutPtr(0L),
            pEntity: MutPtr<HseExecUrlEntityInfo> = MutPtr(0L),
            dwExecUrlFlags: UInt = 0u,
        ): HseExecUrlInfo =
            HseExecUrlInfo(
                pszUrlCtorArg = pszUrl,
                pszMethodCtorArg = pszMethod,
                pszChildHeadersCtorArg = pszChildHeaders,
                pUserInfoCtorArg = pUserInfo,
                pEntityCtorArg = pEntity,
                dwExecUrlFlags = dwExecUrlFlags,
            )
    }
}

public data class HseExecUrlStatus(
    public var uHttpStatusCode: UShort = 0u,
    public var uHttpSubStatus: UShort = 0u,
    public var dwWin32Error: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseExecUrlStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseExecUrlStatus> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HseExecUrlStatus =
                    HseExecUrlStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HseExecUrlStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uHttpStatusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.uHttpSubStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwWin32Error)
                }
            }
    }
}

public class HseExecUrlUserInfo internal constructor(
    hImpersonationTokenCtorArg: Handle,
    pszCustomUserNameCtorArg: Pstr,
    pszCustomAuthTypeCtorArg: Pstr,
) {
    public var hImpersonationToken: Handle = hImpersonationTokenCtorArg
        internal set

    public var pszCustomUserName: Pstr = pszCustomUserNameCtorArg
        internal set

    public var pszCustomAuthType: Pstr = pszCustomAuthTypeCtorArg
        internal set

    public constructor() : this(
        hImpersonationTokenCtorArg = MutPtr(0L),
        pszCustomUserNameCtorArg = MutPtr(0L),
        pszCustomAuthTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hImpersonationToken

    public operator fun component2(): Pstr = this.pszCustomUserName

    public operator fun component3(): Pstr = this.pszCustomAuthType

    public fun copy(hImpersonationToken: Handle = this.hImpersonationToken, pszCustomUserName: Pstr = this.pszCustomUserName, pszCustomAuthType: Pstr = this.pszCustomAuthType): HseExecUrlUserInfo = HseExecUrlUserInfo(hImpersonationTokenCtorArg = hImpersonationToken, pszCustomUserNameCtorArg = pszCustomUserName, pszCustomAuthTypeCtorArg = pszCustomAuthType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseExecUrlUserInfo) return false
        if (this.hImpersonationToken != other.hImpersonationToken) return false
        if (this.pszCustomUserName != other.pszCustomUserName) return false
        if (this.pszCustomAuthType != other.pszCustomAuthType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hImpersonationToken.hashCode()
        result = 31 * result + this.pszCustomUserName.hashCode()
        result = 31 * result + this.pszCustomAuthType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hImpersonationToken: Handle = MutPtr(0L),
            pszCustomUserName: Pstr = MutPtr(0L),
            pszCustomAuthType: Pstr = MutPtr(0L),
        ): HseExecUrlUserInfo =
            HseExecUrlUserInfo(
                hImpersonationTokenCtorArg = hImpersonationToken,
                pszCustomUserNameCtorArg = pszCustomUserName,
                pszCustomAuthTypeCtorArg = pszCustomAuthType,
            )
    }
}

public class HseResponseVector internal constructor(
    public var dwFlags: UInt,
    pszStatusCtorArg: Pstr,
    pszHeadersCtorArg: Pstr,
    public var nElementCount: UInt,
    lpElementArrayCtorArg: MutPtr<HseVectorElement>,
) {
    public var pszStatus: Pstr = pszStatusCtorArg
        internal set

    public var pszHeaders: Pstr = pszHeadersCtorArg
        internal set

    public var lpElementArray: MutPtr<HseVectorElement> = lpElementArrayCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        pszStatusCtorArg = MutPtr(0L),
        pszHeadersCtorArg = MutPtr(0L),
        nElementCount = 0u,
        lpElementArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Pstr = this.pszStatus

    public operator fun component3(): Pstr = this.pszHeaders

    public operator fun component4(): UInt = this.nElementCount

    public operator fun component5(): MutPtr<HseVectorElement> = this.lpElementArray

    public fun copy(dwFlags: UInt = this.dwFlags, pszStatus: Pstr = this.pszStatus, pszHeaders: Pstr = this.pszHeaders, nElementCount: UInt = this.nElementCount, lpElementArray: MutPtr<HseVectorElement> = this.lpElementArray): HseResponseVector = HseResponseVector(dwFlags = dwFlags, pszStatusCtorArg = pszStatus, pszHeadersCtorArg = pszHeaders, nElementCount = nElementCount, lpElementArrayCtorArg = lpElementArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseResponseVector) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszStatus != other.pszStatus) return false
        if (this.pszHeaders != other.pszHeaders) return false
        if (this.nElementCount != other.nElementCount) return false
        if (this.lpElementArray != other.lpElementArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.pszStatus.hashCode()
        result = 31 * result + this.pszHeaders.hashCode()
        result = 31 * result + this.nElementCount.hashCode()
        result = 31 * result + this.lpElementArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            pszStatus: Pstr = MutPtr(0L),
            pszHeaders: Pstr = MutPtr(0L),
            nElementCount: UInt = 0u,
            lpElementArray: MutPtr<HseVectorElement> = MutPtr(0L),
        ): HseResponseVector =
            HseResponseVector(
                dwFlags = dwFlags,
                pszStatusCtorArg = pszStatus,
                pszHeadersCtorArg = pszHeaders,
                nElementCount = nElementCount,
                lpElementArrayCtorArg = lpElementArray,
            )
    }
}

public class HseSendHeaderExInfo internal constructor(
    pszStatusCtorArg: Pcstr,
    pszHeaderCtorArg: Pcstr,
    public var cchStatus: UInt,
    public var cchHeader: UInt,
    public var fKeepConn: Bool,
) {
    public var pszStatus: Pcstr = pszStatusCtorArg
        internal set

    public var pszHeader: Pcstr = pszHeaderCtorArg
        internal set

    public constructor() : this(
        pszStatusCtorArg = ConstPtr(0L),
        pszHeaderCtorArg = ConstPtr(0L),
        cchStatus = 0u,
        cchHeader = 0u,
        fKeepConn = 0,
    )

    public operator fun component1(): Pcstr = this.pszStatus

    public operator fun component2(): Pcstr = this.pszHeader

    public operator fun component3(): UInt = this.cchStatus

    public operator fun component4(): UInt = this.cchHeader

    public operator fun component5(): Bool = this.fKeepConn

    public fun copy(pszStatus: Pcstr = this.pszStatus, pszHeader: Pcstr = this.pszHeader, cchStatus: UInt = this.cchStatus, cchHeader: UInt = this.cchHeader, fKeepConn: Bool = this.fKeepConn): HseSendHeaderExInfo = HseSendHeaderExInfo(pszStatusCtorArg = pszStatus, pszHeaderCtorArg = pszHeader, cchStatus = cchStatus, cchHeader = cchHeader, fKeepConn = fKeepConn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseSendHeaderExInfo) return false
        if (this.pszStatus != other.pszStatus) return false
        if (this.pszHeader != other.pszHeader) return false
        if (this.cchStatus != other.cchStatus) return false
        if (this.cchHeader != other.cchHeader) return false
        if (this.fKeepConn != other.fKeepConn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszStatus.hashCode()
        result = 31 * result + this.pszHeader.hashCode()
        result = 31 * result + this.cchStatus.hashCode()
        result = 31 * result + this.cchHeader.hashCode()
        result = 31 * result + this.fKeepConn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszStatus: Pcstr = ConstPtr(0L),
            pszHeader: Pcstr = ConstPtr(0L),
            cchStatus: UInt = 0u,
            cchHeader: UInt = 0u,
            fKeepConn: Bool = 0,
        ): HseSendHeaderExInfo =
            HseSendHeaderExInfo(
                pszStatusCtorArg = pszStatus,
                pszHeaderCtorArg = pszHeader,
                cchStatus = cchStatus,
                cchHeader = cchHeader,
                fKeepConn = fKeepConn,
            )
    }
}

public class HseTfInfo internal constructor(
    public var pfnHseIO: PfnHseIoCompletion,
    pContextCtorArg: MutPtr<CVoid>,
    hFileCtorArg: Handle,
    pszStatusCodeCtorArg: Pcstr,
    public var bytesToWrite: UInt,
    public var offset: UInt,
    pHeadCtorArg: MutPtr<CVoid>,
    public var headLength: UInt,
    pTailCtorArg: MutPtr<CVoid>,
    public var tailLength: UInt,
    public var dwFlags: UInt,
) {
    public var pContext: MutPtr<CVoid> = pContextCtorArg
        internal set

    public var hFile: Handle = hFileCtorArg
        internal set

    public var pszStatusCode: Pcstr = pszStatusCodeCtorArg
        internal set

    public var pHead: MutPtr<CVoid> = pHeadCtorArg
        internal set

    public var pTail: MutPtr<CVoid> = pTailCtorArg
        internal set

    public constructor() : this(
        pfnHseIO = null,
        pContextCtorArg = MutPtr(0L),
        hFileCtorArg = MutPtr(0L),
        pszStatusCodeCtorArg = ConstPtr(0L),
        bytesToWrite = 0u,
        offset = 0u,
        pHeadCtorArg = MutPtr(0L),
        headLength = 0u,
        pTailCtorArg = MutPtr(0L),
        tailLength = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): PfnHseIoCompletion = this.pfnHseIO

    public operator fun component2(): MutPtr<CVoid> = this.pContext

    public operator fun component3(): Handle = this.hFile

    public operator fun component4(): Pcstr = this.pszStatusCode

    public operator fun component5(): UInt = this.bytesToWrite

    public operator fun component6(): UInt = this.offset

    public operator fun component7(): MutPtr<CVoid> = this.pHead

    public operator fun component8(): UInt = this.headLength

    public operator fun component9(): MutPtr<CVoid> = this.pTail

    public operator fun component10(): UInt = this.tailLength

    public operator fun component11(): UInt = this.dwFlags

    public fun copy(pfnHseIO: PfnHseIoCompletion = this.pfnHseIO, pContext: MutPtr<CVoid> = this.pContext, hFile: Handle = this.hFile, pszStatusCode: Pcstr = this.pszStatusCode, bytesToWrite: UInt = this.bytesToWrite, offset: UInt = this.offset, pHead: MutPtr<CVoid> = this.pHead, headLength: UInt = this.headLength, pTail: MutPtr<CVoid> = this.pTail, tailLength: UInt = this.tailLength, dwFlags: UInt = this.dwFlags): HseTfInfo = HseTfInfo(pfnHseIO = pfnHseIO, pContextCtorArg = pContext, hFileCtorArg = hFile, pszStatusCodeCtorArg = pszStatusCode, bytesToWrite = bytesToWrite, offset = offset, pHeadCtorArg = pHead, headLength = headLength, pTailCtorArg = pTail, tailLength = tailLength, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseTfInfo) return false
        if (this.pfnHseIO != other.pfnHseIO) return false
        if (this.pContext != other.pContext) return false
        if (this.hFile != other.hFile) return false
        if (this.pszStatusCode != other.pszStatusCode) return false
        if (this.bytesToWrite != other.bytesToWrite) return false
        if (this.offset != other.offset) return false
        if (this.pHead != other.pHead) return false
        if (this.headLength != other.headLength) return false
        if (this.pTail != other.pTail) return false
        if (this.tailLength != other.tailLength) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnHseIO.hashCode()
        result = 31 * result + this.pContext.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.pszStatusCode.hashCode()
        result = 31 * result + this.bytesToWrite.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.pHead.hashCode()
        result = 31 * result + this.headLength.hashCode()
        result = 31 * result + this.pTail.hashCode()
        result = 31 * result + this.tailLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnHseIO: PfnHseIoCompletion = null,
            pContext: MutPtr<CVoid> = MutPtr(0L),
            hFile: Handle = MutPtr(0L),
            pszStatusCode: Pcstr = ConstPtr(0L),
            bytesToWrite: UInt = 0u,
            offset: UInt = 0u,
            pHead: MutPtr<CVoid> = MutPtr(0L),
            headLength: UInt = 0u,
            pTail: MutPtr<CVoid> = MutPtr(0L),
            tailLength: UInt = 0u,
            dwFlags: UInt = 0u,
        ): HseTfInfo =
            HseTfInfo(
                pfnHseIO = pfnHseIO,
                pContextCtorArg = pContext,
                hFileCtorArg = hFile,
                pszStatusCodeCtorArg = pszStatusCode,
                bytesToWrite = bytesToWrite,
                offset = offset,
                pHeadCtorArg = pHead,
                headLength = headLength,
                pTailCtorArg = pTail,
                tailLength = tailLength,
                dwFlags = dwFlags,
            )
    }
}

public data class HseTraceInfo(
    public var fTraceRequest: Bool = 0,
    public var traceContextId: UByteArray = UByteArray(16),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseTraceInfo) return false
        if (this.fTraceRequest != other.fTraceRequest) return false
        if (!this.traceContextId.contentEquals(other.traceContextId)) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fTraceRequest.hashCode()
        result = 31 * result + this.traceContextId.contentHashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class HseUnicodeUrlMapexInfo(
    public var lpszPath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseUnicodeUrlMapexInfo) return false
        if (!this.lpszPath.contentEquals(other.lpszPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cchMatchingPath != other.cchMatchingPath) return false
        if (this.cchMatchingURL != other.cchMatchingURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cchMatchingPath.hashCode()
        result = 31 * result + this.cchMatchingURL.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseUnicodeUrlMapexInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseUnicodeUrlMapexInfo> {
                override val sizeBytes: Long = 532L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HseUnicodeUrlMapexInfo =
                    HseUnicodeUrlMapexInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 524L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 528L),
                    )
                override fun writeNative(addr: Long, value: HseUnicodeUrlMapexInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.lpszPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 524L, value.cchMatchingPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 528L, value.cchMatchingURL)
                }
            }
    }
}

public data class HseUrlMapexInfo(
    public var lpszPath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseUrlMapexInfo) return false
        if (!this.lpszPath.contentEquals(other.lpszPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cchMatchingPath != other.cchMatchingPath) return false
        if (this.cchMatchingURL != other.cchMatchingURL) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cchMatchingPath.hashCode()
        result = 31 * result + this.cchMatchingURL.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseUrlMapexInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseUrlMapexInfo> {
                override val sizeBytes: Long = 280L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HseUrlMapexInfo =
                    HseUrlMapexInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                    )
                override fun writeNative(addr: Long, value: HseUrlMapexInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr, value.lpszPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.cchMatchingPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.cchMatchingURL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.dwReserved2)
                }
            }
    }
}

public class HseVectorElement internal constructor(
    public var elementType: UInt,
    pvContextCtorArg: MutPtr<CVoid>,
    public var cbOffset: ULong,
    public var cbSize: ULong,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        elementType = 0u,
        pvContextCtorArg = MutPtr(0L),
        cbOffset = 0uL,
        cbSize = 0uL,
    )

    public operator fun component1(): UInt = this.elementType

    public operator fun component2(): MutPtr<CVoid> = this.pvContext

    public operator fun component3(): ULong = this.cbOffset

    public operator fun component4(): ULong = this.cbSize

    public fun copy(elementType: UInt = this.elementType, pvContext: MutPtr<CVoid> = this.pvContext, cbOffset: ULong = this.cbOffset, cbSize: ULong = this.cbSize): HseVectorElement = HseVectorElement(elementType = elementType, pvContextCtorArg = pvContext, cbOffset = cbOffset, cbSize = cbSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseVectorElement) return false
        if (this.elementType != other.elementType) return false
        if (this.pvContext != other.pvContext) return false
        if (this.cbOffset != other.cbOffset) return false
        if (this.cbSize != other.cbSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementType.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.cbOffset.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseVectorElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseVectorElement> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HseVectorElement =
                    HseVectorElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: HseVectorElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.elementType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.cbOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.cbSize)
                }
            }

        public operator fun invoke(
            elementType: UInt = 0u,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            cbOffset: ULong = 0uL,
            cbSize: ULong = 0uL,
        ): HseVectorElement =
            HseVectorElement(
                elementType = elementType,
                pvContextCtorArg = pvContext,
                cbOffset = cbOffset,
                cbSize = cbSize,
            )
    }
}

public data class HseVersionInfo(
    public var dwExtensionVersion: UInt = 0u,
    public var lpszExtensionDesc: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseVersionInfo) return false
        if (this.dwExtensionVersion != other.dwExtensionVersion) return false
        if (!this.lpszExtensionDesc.contentEquals(other.lpszExtensionDesc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwExtensionVersion.hashCode()
        result = 31 * result + this.lpszExtensionDesc.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HseVersionInfo> {
                override val sizeBytes: Long = 260L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HseVersionInfo =
                    HseVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HseVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExtensionVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 4L, value.lpszExtensionDesc)
                }
            }
    }
}

public class HttpFilterAccessDenied internal constructor(
    pszURLCtorArg: Pcstr,
    pszPhysicalPathCtorArg: Pcstr,
    public var dwReason: UInt,
) {
    public var pszURL: Pcstr = pszURLCtorArg
        internal set

    public var pszPhysicalPath: Pcstr = pszPhysicalPathCtorArg
        internal set

    public constructor() : this(
        pszURLCtorArg = ConstPtr(0L),
        pszPhysicalPathCtorArg = ConstPtr(0L),
        dwReason = 0u,
    )

    public operator fun component1(): Pcstr = this.pszURL

    public operator fun component2(): Pcstr = this.pszPhysicalPath

    public operator fun component3(): UInt = this.dwReason

    public fun copy(pszURL: Pcstr = this.pszURL, pszPhysicalPath: Pcstr = this.pszPhysicalPath, dwReason: UInt = this.dwReason): HttpFilterAccessDenied = HttpFilterAccessDenied(pszURLCtorArg = pszURL, pszPhysicalPathCtorArg = pszPhysicalPath, dwReason = dwReason)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterAccessDenied) return false
        if (this.pszURL != other.pszURL) return false
        if (this.pszPhysicalPath != other.pszPhysicalPath) return false
        if (this.dwReason != other.dwReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszURL.hashCode()
        result = 31 * result + this.pszPhysicalPath.hashCode()
        result = 31 * result + this.dwReason.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszURL: Pcstr = ConstPtr(0L),
            pszPhysicalPath: Pcstr = ConstPtr(0L),
            dwReason: UInt = 0u,
        ): HttpFilterAccessDenied =
            HttpFilterAccessDenied(
                pszURLCtorArg = pszURL,
                pszPhysicalPathCtorArg = pszPhysicalPath,
                dwReason = dwReason,
            )
    }
}

public class HttpFilterAuthent internal constructor(
    pszUserCtorArg: Pstr,
    public var cbUserBuff: UInt,
    pszPasswordCtorArg: Pstr,
    public var cbPasswordBuff: UInt,
) {
    public var pszUser: Pstr = pszUserCtorArg
        internal set

    public var pszPassword: Pstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        pszUserCtorArg = MutPtr(0L),
        cbUserBuff = 0u,
        pszPasswordCtorArg = MutPtr(0L),
        cbPasswordBuff = 0u,
    )

    public operator fun component1(): Pstr = this.pszUser

    public operator fun component2(): UInt = this.cbUserBuff

    public operator fun component3(): Pstr = this.pszPassword

    public operator fun component4(): UInt = this.cbPasswordBuff

    public fun copy(pszUser: Pstr = this.pszUser, cbUserBuff: UInt = this.cbUserBuff, pszPassword: Pstr = this.pszPassword, cbPasswordBuff: UInt = this.cbPasswordBuff): HttpFilterAuthent = HttpFilterAuthent(pszUserCtorArg = pszUser, cbUserBuff = cbUserBuff, pszPasswordCtorArg = pszPassword, cbPasswordBuff = cbPasswordBuff)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterAuthent) return false
        if (this.pszUser != other.pszUser) return false
        if (this.cbUserBuff != other.cbUserBuff) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.cbPasswordBuff != other.cbPasswordBuff) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUser.hashCode()
        result = 31 * result + this.cbUserBuff.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.cbPasswordBuff.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUser: Pstr = MutPtr(0L),
            cbUserBuff: UInt = 0u,
            pszPassword: Pstr = MutPtr(0L),
            cbPasswordBuff: UInt = 0u,
        ): HttpFilterAuthent =
            HttpFilterAuthent(
                pszUserCtorArg = pszUser,
                cbUserBuff = cbUserBuff,
                pszPasswordCtorArg = pszPassword,
                cbPasswordBuff = cbPasswordBuff,
            )
    }
}

public data class HttpFilterAuthCompleteInfo(
    public var getHeader: Int = 0,
    public var setHeader: Int = 0,
    public var addHeader: Int = 0,
    public var getUserToken: Int = 0,
    public var httpStatus: UInt = 0u,
    public var fResetAuth: Bool = 0,
    public var dwReserved: UInt = 0u,
)

public class HttpFilterContext internal constructor(
    public var cbSize: UInt,
    public var revision: UInt,
    serverContextCtorArg: MutPtr<CVoid>,
    public var ulReserved: UInt,
    public var fIsSecurePort: Bool,
    pFilterContextCtorArg: MutPtr<CVoid>,
    public var getServerVariable: Int,
    public var addResponseHeaders: Int,
    public var writeClient: Int,
    public var allocMem: Int,
    public var serverSupportFunction: Int,
) {
    public var serverContext: MutPtr<CVoid> = serverContextCtorArg
        internal set

    public var pFilterContext: MutPtr<CVoid> = pFilterContextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        revision = 0u,
        serverContextCtorArg = MutPtr(0L),
        ulReserved = 0u,
        fIsSecurePort = 0,
        pFilterContextCtorArg = MutPtr(0L),
        getServerVariable = 0,
        addResponseHeaders = 0,
        writeClient = 0,
        allocMem = 0,
        serverSupportFunction = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.revision

    public operator fun component3(): MutPtr<CVoid> = this.serverContext

    public operator fun component4(): UInt = this.ulReserved

    public operator fun component5(): Bool = this.fIsSecurePort

    public operator fun component6(): MutPtr<CVoid> = this.pFilterContext

    public operator fun component7(): Int = this.getServerVariable

    public operator fun component8(): Int = this.addResponseHeaders

    public operator fun component9(): Int = this.writeClient

    public operator fun component10(): Int = this.allocMem

    public operator fun component11(): Int = this.serverSupportFunction

    public fun copy(cbSize: UInt = this.cbSize, revision: UInt = this.revision, serverContext: MutPtr<CVoid> = this.serverContext, ulReserved: UInt = this.ulReserved, fIsSecurePort: Bool = this.fIsSecurePort, pFilterContext: MutPtr<CVoid> = this.pFilterContext, getServerVariable: Int = this.getServerVariable, addResponseHeaders: Int = this.addResponseHeaders, writeClient: Int = this.writeClient, allocMem: Int = this.allocMem, serverSupportFunction: Int = this.serverSupportFunction): HttpFilterContext = HttpFilterContext(cbSize = cbSize, revision = revision, serverContextCtorArg = serverContext, ulReserved = ulReserved, fIsSecurePort = fIsSecurePort, pFilterContextCtorArg = pFilterContext, getServerVariable = getServerVariable, addResponseHeaders = addResponseHeaders, writeClient = writeClient, allocMem = allocMem, serverSupportFunction = serverSupportFunction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterContext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.revision != other.revision) return false
        if (this.serverContext != other.serverContext) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.fIsSecurePort != other.fIsSecurePort) return false
        if (this.pFilterContext != other.pFilterContext) return false
        if (this.getServerVariable != other.getServerVariable) return false
        if (this.addResponseHeaders != other.addResponseHeaders) return false
        if (this.writeClient != other.writeClient) return false
        if (this.allocMem != other.allocMem) return false
        if (this.serverSupportFunction != other.serverSupportFunction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.serverContext.hashCode()
        result = 31 * result + this.ulReserved.hashCode()
        result = 31 * result + this.fIsSecurePort.hashCode()
        result = 31 * result + this.pFilterContext.hashCode()
        result = 31 * result + this.getServerVariable.hashCode()
        result = 31 * result + this.addResponseHeaders.hashCode()
        result = 31 * result + this.writeClient.hashCode()
        result = 31 * result + this.allocMem.hashCode()
        result = 31 * result + this.serverSupportFunction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            revision: UInt = 0u,
            serverContext: MutPtr<CVoid> = MutPtr(0L),
            ulReserved: UInt = 0u,
            fIsSecurePort: Bool = 0,
            pFilterContext: MutPtr<CVoid> = MutPtr(0L),
            getServerVariable: Int = 0,
            addResponseHeaders: Int = 0,
            writeClient: Int = 0,
            allocMem: Int = 0,
            serverSupportFunction: Int = 0,
        ): HttpFilterContext =
            HttpFilterContext(
                cbSize = cbSize,
                revision = revision,
                serverContextCtorArg = serverContext,
                ulReserved = ulReserved,
                fIsSecurePort = fIsSecurePort,
                pFilterContextCtorArg = pFilterContext,
                getServerVariable = getServerVariable,
                addResponseHeaders = addResponseHeaders,
                writeClient = writeClient,
                allocMem = allocMem,
                serverSupportFunction = serverSupportFunction,
            )
    }
}

public class HttpFilterLog internal constructor(
    pszClientHostNameCtorArg: Pcstr,
    pszClientUserNameCtorArg: Pcstr,
    pszServerNameCtorArg: Pcstr,
    pszOperationCtorArg: Pcstr,
    pszTargetCtorArg: Pcstr,
    pszParametersCtorArg: Pcstr,
    public var dwHttpStatus: UInt,
    public var dwWin32Status: UInt,
    public var dwBytesSent: UInt,
    public var dwBytesRecvd: UInt,
    public var msTimeForProcessing: UInt,
) {
    public var pszClientHostName: Pcstr = pszClientHostNameCtorArg
        internal set

    public var pszClientUserName: Pcstr = pszClientUserNameCtorArg
        internal set

    public var pszServerName: Pcstr = pszServerNameCtorArg
        internal set

    public var pszOperation: Pcstr = pszOperationCtorArg
        internal set

    public var pszTarget: Pcstr = pszTargetCtorArg
        internal set

    public var pszParameters: Pcstr = pszParametersCtorArg
        internal set

    public constructor() : this(
        pszClientHostNameCtorArg = ConstPtr(0L),
        pszClientUserNameCtorArg = ConstPtr(0L),
        pszServerNameCtorArg = ConstPtr(0L),
        pszOperationCtorArg = ConstPtr(0L),
        pszTargetCtorArg = ConstPtr(0L),
        pszParametersCtorArg = ConstPtr(0L),
        dwHttpStatus = 0u,
        dwWin32Status = 0u,
        dwBytesSent = 0u,
        dwBytesRecvd = 0u,
        msTimeForProcessing = 0u,
    )

    public operator fun component1(): Pcstr = this.pszClientHostName

    public operator fun component2(): Pcstr = this.pszClientUserName

    public operator fun component3(): Pcstr = this.pszServerName

    public operator fun component4(): Pcstr = this.pszOperation

    public operator fun component5(): Pcstr = this.pszTarget

    public operator fun component6(): Pcstr = this.pszParameters

    public operator fun component7(): UInt = this.dwHttpStatus

    public operator fun component8(): UInt = this.dwWin32Status

    public operator fun component9(): UInt = this.dwBytesSent

    public operator fun component10(): UInt = this.dwBytesRecvd

    public operator fun component11(): UInt = this.msTimeForProcessing

    public fun copy(pszClientHostName: Pcstr = this.pszClientHostName, pszClientUserName: Pcstr = this.pszClientUserName, pszServerName: Pcstr = this.pszServerName, pszOperation: Pcstr = this.pszOperation, pszTarget: Pcstr = this.pszTarget, pszParameters: Pcstr = this.pszParameters, dwHttpStatus: UInt = this.dwHttpStatus, dwWin32Status: UInt = this.dwWin32Status, dwBytesSent: UInt = this.dwBytesSent, dwBytesRecvd: UInt = this.dwBytesRecvd, msTimeForProcessing: UInt = this.msTimeForProcessing): HttpFilterLog = HttpFilterLog(pszClientHostNameCtorArg = pszClientHostName, pszClientUserNameCtorArg = pszClientUserName, pszServerNameCtorArg = pszServerName, pszOperationCtorArg = pszOperation, pszTargetCtorArg = pszTarget, pszParametersCtorArg = pszParameters, dwHttpStatus = dwHttpStatus, dwWin32Status = dwWin32Status, dwBytesSent = dwBytesSent, dwBytesRecvd = dwBytesRecvd, msTimeForProcessing = msTimeForProcessing)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterLog) return false
        if (this.pszClientHostName != other.pszClientHostName) return false
        if (this.pszClientUserName != other.pszClientUserName) return false
        if (this.pszServerName != other.pszServerName) return false
        if (this.pszOperation != other.pszOperation) return false
        if (this.pszTarget != other.pszTarget) return false
        if (this.pszParameters != other.pszParameters) return false
        if (this.dwHttpStatus != other.dwHttpStatus) return false
        if (this.dwWin32Status != other.dwWin32Status) return false
        if (this.dwBytesSent != other.dwBytesSent) return false
        if (this.dwBytesRecvd != other.dwBytesRecvd) return false
        if (this.msTimeForProcessing != other.msTimeForProcessing) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszClientHostName.hashCode()
        result = 31 * result + this.pszClientUserName.hashCode()
        result = 31 * result + this.pszServerName.hashCode()
        result = 31 * result + this.pszOperation.hashCode()
        result = 31 * result + this.pszTarget.hashCode()
        result = 31 * result + this.pszParameters.hashCode()
        result = 31 * result + this.dwHttpStatus.hashCode()
        result = 31 * result + this.dwWin32Status.hashCode()
        result = 31 * result + this.dwBytesSent.hashCode()
        result = 31 * result + this.dwBytesRecvd.hashCode()
        result = 31 * result + this.msTimeForProcessing.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszClientHostName: Pcstr = ConstPtr(0L),
            pszClientUserName: Pcstr = ConstPtr(0L),
            pszServerName: Pcstr = ConstPtr(0L),
            pszOperation: Pcstr = ConstPtr(0L),
            pszTarget: Pcstr = ConstPtr(0L),
            pszParameters: Pcstr = ConstPtr(0L),
            dwHttpStatus: UInt = 0u,
            dwWin32Status: UInt = 0u,
            dwBytesSent: UInt = 0u,
            dwBytesRecvd: UInt = 0u,
            msTimeForProcessing: UInt = 0u,
        ): HttpFilterLog =
            HttpFilterLog(
                pszClientHostNameCtorArg = pszClientHostName,
                pszClientUserNameCtorArg = pszClientUserName,
                pszServerNameCtorArg = pszServerName,
                pszOperationCtorArg = pszOperation,
                pszTargetCtorArg = pszTarget,
                pszParametersCtorArg = pszParameters,
                dwHttpStatus = dwHttpStatus,
                dwWin32Status = dwWin32Status,
                dwBytesSent = dwBytesSent,
                dwBytesRecvd = dwBytesRecvd,
                msTimeForProcessing = msTimeForProcessing,
            )
    }
}

public data class HttpFilterPreprocHeaders(
    public var getHeader: Int = 0,
    public var setHeader: Int = 0,
    public var addHeader: Int = 0,
    public var httpStatus: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterPreprocHeaders> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterPreprocHeaders> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HttpFilterPreprocHeaders =
                    HttpFilterPreprocHeaders(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: HttpFilterPreprocHeaders) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.setHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.addHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.httpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwReserved)
                }
            }
    }
}

public class HttpFilterRawData internal constructor(
    pvInDataCtorArg: MutPtr<CVoid>,
    public var cbInData: UInt,
    public var cbInBuffer: UInt,
    public var dwReserved: UInt,
) {
    public var pvInData: MutPtr<CVoid> = pvInDataCtorArg
        internal set

    public constructor() : this(
        pvInDataCtorArg = MutPtr(0L),
        cbInData = 0u,
        cbInBuffer = 0u,
        dwReserved = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvInData

    public operator fun component2(): UInt = this.cbInData

    public operator fun component3(): UInt = this.cbInBuffer

    public operator fun component4(): UInt = this.dwReserved

    public fun copy(pvInData: MutPtr<CVoid> = this.pvInData, cbInData: UInt = this.cbInData, cbInBuffer: UInt = this.cbInBuffer, dwReserved: UInt = this.dwReserved): HttpFilterRawData = HttpFilterRawData(pvInDataCtorArg = pvInData, cbInData = cbInData, cbInBuffer = cbInBuffer, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterRawData) return false
        if (this.pvInData != other.pvInData) return false
        if (this.cbInData != other.cbInData) return false
        if (this.cbInBuffer != other.cbInBuffer) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvInData.hashCode()
        result = 31 * result + this.cbInData.hashCode()
        result = 31 * result + this.cbInBuffer.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterRawData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterRawData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HttpFilterRawData =
                    HttpFilterRawData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HttpFilterRawData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pvInData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbInData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbInBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReserved)
                }
            }

        public operator fun invoke(
            pvInData: MutPtr<CVoid> = MutPtr(0L),
            cbInData: UInt = 0u,
            cbInBuffer: UInt = 0u,
            dwReserved: UInt = 0u,
        ): HttpFilterRawData =
            HttpFilterRawData(
                pvInDataCtorArg = pvInData,
                cbInData = cbInData,
                cbInBuffer = cbInBuffer,
                dwReserved = dwReserved,
            )
    }
}

public class HttpFilterUrlMap internal constructor(
    pszURLCtorArg: Pcstr,
    pszPhysicalPathCtorArg: Pstr,
    public var cbPathBuff: UInt,
) {
    public var pszURL: Pcstr = pszURLCtorArg
        internal set

    public var pszPhysicalPath: Pstr = pszPhysicalPathCtorArg
        internal set

    public constructor() : this(
        pszURLCtorArg = ConstPtr(0L),
        pszPhysicalPathCtorArg = MutPtr(0L),
        cbPathBuff = 0u,
    )

    public operator fun component1(): Pcstr = this.pszURL

    public operator fun component2(): Pstr = this.pszPhysicalPath

    public operator fun component3(): UInt = this.cbPathBuff

    public fun copy(pszURL: Pcstr = this.pszURL, pszPhysicalPath: Pstr = this.pszPhysicalPath, cbPathBuff: UInt = this.cbPathBuff): HttpFilterUrlMap = HttpFilterUrlMap(pszURLCtorArg = pszURL, pszPhysicalPathCtorArg = pszPhysicalPath, cbPathBuff = cbPathBuff)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterUrlMap) return false
        if (this.pszURL != other.pszURL) return false
        if (this.pszPhysicalPath != other.pszPhysicalPath) return false
        if (this.cbPathBuff != other.cbPathBuff) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszURL.hashCode()
        result = 31 * result + this.pszPhysicalPath.hashCode()
        result = 31 * result + this.cbPathBuff.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszURL: Pcstr = ConstPtr(0L),
            pszPhysicalPath: Pstr = MutPtr(0L),
            cbPathBuff: UInt = 0u,
        ): HttpFilterUrlMap =
            HttpFilterUrlMap(
                pszURLCtorArg = pszURL,
                pszPhysicalPathCtorArg = pszPhysicalPath,
                cbPathBuff = cbPathBuff,
            )
    }
}

public class HttpFilterUrlMapEx internal constructor(
    pszURLCtorArg: Pcstr,
    pszPhysicalPathCtorArg: Pstr,
    public var cbPathBuff: UInt,
    public var dwFlags: UInt,
    public var cchMatchingPath: UInt,
    public var cchMatchingURL: UInt,
    pszScriptMapEntryCtorArg: Pcstr,
) {
    public var pszURL: Pcstr = pszURLCtorArg
        internal set

    public var pszPhysicalPath: Pstr = pszPhysicalPathCtorArg
        internal set

    public var pszScriptMapEntry: Pcstr = pszScriptMapEntryCtorArg
        internal set

    public constructor() : this(
        pszURLCtorArg = ConstPtr(0L),
        pszPhysicalPathCtorArg = MutPtr(0L),
        cbPathBuff = 0u,
        dwFlags = 0u,
        cchMatchingPath = 0u,
        cchMatchingURL = 0u,
        pszScriptMapEntryCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszURL

    public operator fun component2(): Pstr = this.pszPhysicalPath

    public operator fun component3(): UInt = this.cbPathBuff

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): UInt = this.cchMatchingPath

    public operator fun component6(): UInt = this.cchMatchingURL

    public operator fun component7(): Pcstr = this.pszScriptMapEntry

    public fun copy(pszURL: Pcstr = this.pszURL, pszPhysicalPath: Pstr = this.pszPhysicalPath, cbPathBuff: UInt = this.cbPathBuff, dwFlags: UInt = this.dwFlags, cchMatchingPath: UInt = this.cchMatchingPath, cchMatchingURL: UInt = this.cchMatchingURL, pszScriptMapEntry: Pcstr = this.pszScriptMapEntry): HttpFilterUrlMapEx = HttpFilterUrlMapEx(pszURLCtorArg = pszURL, pszPhysicalPathCtorArg = pszPhysicalPath, cbPathBuff = cbPathBuff, dwFlags = dwFlags, cchMatchingPath = cchMatchingPath, cchMatchingURL = cchMatchingURL, pszScriptMapEntryCtorArg = pszScriptMapEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterUrlMapEx) return false
        if (this.pszURL != other.pszURL) return false
        if (this.pszPhysicalPath != other.pszPhysicalPath) return false
        if (this.cbPathBuff != other.cbPathBuff) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cchMatchingPath != other.cchMatchingPath) return false
        if (this.cchMatchingURL != other.cchMatchingURL) return false
        if (this.pszScriptMapEntry != other.pszScriptMapEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszURL.hashCode()
        result = 31 * result + this.pszPhysicalPath.hashCode()
        result = 31 * result + this.cbPathBuff.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cchMatchingPath.hashCode()
        result = 31 * result + this.cchMatchingURL.hashCode()
        result = 31 * result + this.pszScriptMapEntry.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszURL: Pcstr = ConstPtr(0L),
            pszPhysicalPath: Pstr = MutPtr(0L),
            cbPathBuff: UInt = 0u,
            dwFlags: UInt = 0u,
            cchMatchingPath: UInt = 0u,
            cchMatchingURL: UInt = 0u,
            pszScriptMapEntry: Pcstr = ConstPtr(0L),
        ): HttpFilterUrlMapEx =
            HttpFilterUrlMapEx(
                pszURLCtorArg = pszURL,
                pszPhysicalPathCtorArg = pszPhysicalPath,
                cbPathBuff = cbPathBuff,
                dwFlags = dwFlags,
                cchMatchingPath = cchMatchingPath,
                cchMatchingURL = cchMatchingURL,
                pszScriptMapEntryCtorArg = pszScriptMapEntry,
            )
    }
}

public data class HttpFilterVersion(
    public var dwServerFilterVersion: UInt = 0u,
    public var dwFilterVersion: UInt = 0u,
    public var lpszFilterDesc: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterVersion) return false
        if (this.dwServerFilterVersion != other.dwServerFilterVersion) return false
        if (this.dwFilterVersion != other.dwFilterVersion) return false
        if (!this.lpszFilterDesc.contentEquals(other.lpszFilterDesc)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServerFilterVersion.hashCode()
        result = 31 * result + this.dwFilterVersion.hashCode()
        result = 31 * result + this.lpszFilterDesc.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpFilterVersion> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HttpFilterVersion =
                    HttpFilterVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                    )
                override fun writeNative(addr: Long, value: HttpFilterVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwServerFilterVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 8L, value.lpszFilterDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwFlags)
                }
            }
    }
}

public class HttpTraceConfiguration internal constructor(
    pProviderGuidCtorArg: ConstPtr<Guid>,
    public var dwAreas: UInt,
    public var dwVerbosity: UInt,
    public var fProviderEnabled: Bool,
) {
    public var pProviderGuid: ConstPtr<Guid> = pProviderGuidCtorArg
        internal set

    public constructor() : this(
        pProviderGuidCtorArg = ConstPtr(0L),
        dwAreas = 0u,
        dwVerbosity = 0u,
        fProviderEnabled = 0,
    )

    public operator fun component1(): ConstPtr<Guid> = this.pProviderGuid

    public operator fun component2(): UInt = this.dwAreas

    public operator fun component3(): UInt = this.dwVerbosity

    public operator fun component4(): Bool = this.fProviderEnabled

    public fun copy(pProviderGuid: ConstPtr<Guid> = this.pProviderGuid, dwAreas: UInt = this.dwAreas, dwVerbosity: UInt = this.dwVerbosity, fProviderEnabled: Bool = this.fProviderEnabled): HttpTraceConfiguration = HttpTraceConfiguration(pProviderGuidCtorArg = pProviderGuid, dwAreas = dwAreas, dwVerbosity = dwVerbosity, fProviderEnabled = fProviderEnabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTraceConfiguration) return false
        if (this.pProviderGuid != other.pProviderGuid) return false
        if (this.dwAreas != other.dwAreas) return false
        if (this.dwVerbosity != other.dwVerbosity) return false
        if (this.fProviderEnabled != other.fProviderEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pProviderGuid.hashCode()
        result = 31 * result + this.dwAreas.hashCode()
        result = 31 * result + this.dwVerbosity.hashCode()
        result = 31 * result + this.fProviderEnabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pProviderGuid: ConstPtr<Guid> = ConstPtr(0L),
            dwAreas: UInt = 0u,
            dwVerbosity: UInt = 0u,
            fProviderEnabled: Bool = 0,
        ): HttpTraceConfiguration =
            HttpTraceConfiguration(
                pProviderGuidCtorArg = pProviderGuid,
                dwAreas = dwAreas,
                dwVerbosity = dwVerbosity,
                fProviderEnabled = fProviderEnabled,
            )
    }
}

public class HttpTraceEvent internal constructor(
    pProviderGuidCtorArg: ConstPtr<Guid>,
    public var dwArea: UInt,
    pAreaGuidCtorArg: ConstPtr<Guid>,
    public var dwEvent: UInt,
    pszEventNameCtorArg: Pcwstr,
    public var dwEventVersion: UInt,
    public var dwVerbosity: UInt,
    pActivityGuidCtorArg: ConstPtr<Guid>,
    pRelatedActivityGuidCtorArg: ConstPtr<Guid>,
    public var dwTimeStamp: UInt,
    public var dwFlags: UInt,
    public var cEventItems: UInt,
    pEventItemsCtorArg: MutPtr<HttpTraceEventItem>,
) {
    public var pProviderGuid: ConstPtr<Guid> = pProviderGuidCtorArg
        internal set

    public var pAreaGuid: ConstPtr<Guid> = pAreaGuidCtorArg
        internal set

    public var pszEventName: Pcwstr = pszEventNameCtorArg
        internal set

    public var pActivityGuid: ConstPtr<Guid> = pActivityGuidCtorArg
        internal set

    public var pRelatedActivityGuid: ConstPtr<Guid> = pRelatedActivityGuidCtorArg
        internal set

    public var pEventItems: MutPtr<HttpTraceEventItem> = pEventItemsCtorArg
        internal set

    public constructor() : this(
        pProviderGuidCtorArg = ConstPtr(0L),
        dwArea = 0u,
        pAreaGuidCtorArg = ConstPtr(0L),
        dwEvent = 0u,
        pszEventNameCtorArg = ConstPtr(0L),
        dwEventVersion = 0u,
        dwVerbosity = 0u,
        pActivityGuidCtorArg = ConstPtr(0L),
        pRelatedActivityGuidCtorArg = ConstPtr(0L),
        dwTimeStamp = 0u,
        dwFlags = 0u,
        cEventItems = 0u,
        pEventItemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<Guid> = this.pProviderGuid

    public operator fun component2(): UInt = this.dwArea

    public operator fun component3(): ConstPtr<Guid> = this.pAreaGuid

    public operator fun component4(): UInt = this.dwEvent

    public operator fun component5(): Pcwstr = this.pszEventName

    public operator fun component6(): UInt = this.dwEventVersion

    public operator fun component7(): UInt = this.dwVerbosity

    public operator fun component8(): ConstPtr<Guid> = this.pActivityGuid

    public operator fun component9(): ConstPtr<Guid> = this.pRelatedActivityGuid

    public operator fun component10(): UInt = this.dwTimeStamp

    public operator fun component11(): UInt = this.dwFlags

    public operator fun component12(): UInt = this.cEventItems

    public operator fun component13(): MutPtr<HttpTraceEventItem> = this.pEventItems

    public fun copy(pProviderGuid: ConstPtr<Guid> = this.pProviderGuid, dwArea: UInt = this.dwArea, pAreaGuid: ConstPtr<Guid> = this.pAreaGuid, dwEvent: UInt = this.dwEvent, pszEventName: Pcwstr = this.pszEventName, dwEventVersion: UInt = this.dwEventVersion, dwVerbosity: UInt = this.dwVerbosity, pActivityGuid: ConstPtr<Guid> = this.pActivityGuid, pRelatedActivityGuid: ConstPtr<Guid> = this.pRelatedActivityGuid, dwTimeStamp: UInt = this.dwTimeStamp, dwFlags: UInt = this.dwFlags, cEventItems: UInt = this.cEventItems, pEventItems: MutPtr<HttpTraceEventItem> = this.pEventItems): HttpTraceEvent = HttpTraceEvent(pProviderGuidCtorArg = pProviderGuid, dwArea = dwArea, pAreaGuidCtorArg = pAreaGuid, dwEvent = dwEvent, pszEventNameCtorArg = pszEventName, dwEventVersion = dwEventVersion, dwVerbosity = dwVerbosity, pActivityGuidCtorArg = pActivityGuid, pRelatedActivityGuidCtorArg = pRelatedActivityGuid, dwTimeStamp = dwTimeStamp, dwFlags = dwFlags, cEventItems = cEventItems, pEventItemsCtorArg = pEventItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTraceEvent) return false
        if (this.pProviderGuid != other.pProviderGuid) return false
        if (this.dwArea != other.dwArea) return false
        if (this.pAreaGuid != other.pAreaGuid) return false
        if (this.dwEvent != other.dwEvent) return false
        if (this.pszEventName != other.pszEventName) return false
        if (this.dwEventVersion != other.dwEventVersion) return false
        if (this.dwVerbosity != other.dwVerbosity) return false
        if (this.pActivityGuid != other.pActivityGuid) return false
        if (this.pRelatedActivityGuid != other.pRelatedActivityGuid) return false
        if (this.dwTimeStamp != other.dwTimeStamp) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cEventItems != other.cEventItems) return false
        if (this.pEventItems != other.pEventItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pProviderGuid.hashCode()
        result = 31 * result + this.dwArea.hashCode()
        result = 31 * result + this.pAreaGuid.hashCode()
        result = 31 * result + this.dwEvent.hashCode()
        result = 31 * result + this.pszEventName.hashCode()
        result = 31 * result + this.dwEventVersion.hashCode()
        result = 31 * result + this.dwVerbosity.hashCode()
        result = 31 * result + this.pActivityGuid.hashCode()
        result = 31 * result + this.pRelatedActivityGuid.hashCode()
        result = 31 * result + this.dwTimeStamp.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cEventItems.hashCode()
        result = 31 * result + this.pEventItems.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pProviderGuid: ConstPtr<Guid> = ConstPtr(0L),
            dwArea: UInt = 0u,
            pAreaGuid: ConstPtr<Guid> = ConstPtr(0L),
            dwEvent: UInt = 0u,
            pszEventName: Pcwstr = ConstPtr(0L),
            dwEventVersion: UInt = 0u,
            dwVerbosity: UInt = 0u,
            pActivityGuid: ConstPtr<Guid> = ConstPtr(0L),
            pRelatedActivityGuid: ConstPtr<Guid> = ConstPtr(0L),
            dwTimeStamp: UInt = 0u,
            dwFlags: UInt = 0u,
            cEventItems: UInt = 0u,
            pEventItems: MutPtr<HttpTraceEventItem> = MutPtr(0L),
        ): HttpTraceEvent =
            HttpTraceEvent(
                pProviderGuidCtorArg = pProviderGuid,
                dwArea = dwArea,
                pAreaGuidCtorArg = pAreaGuid,
                dwEvent = dwEvent,
                pszEventNameCtorArg = pszEventName,
                dwEventVersion = dwEventVersion,
                dwVerbosity = dwVerbosity,
                pActivityGuidCtorArg = pActivityGuid,
                pRelatedActivityGuidCtorArg = pRelatedActivityGuid,
                dwTimeStamp = dwTimeStamp,
                dwFlags = dwFlags,
                cEventItems = cEventItems,
                pEventItemsCtorArg = pEventItems,
            )
    }
}

public class HttpTraceEventItem internal constructor(
    pszNameCtorArg: Pcwstr,
    public var dwDataType: HttpTraceType,
    pbDataCtorArg: MutPtr<UByte>,
    public var cbData: UInt,
    pszDataDescriptionCtorArg: Pcwstr,
) {
    public var pszName: Pcwstr = pszNameCtorArg
        internal set

    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public var pszDataDescription: Pcwstr = pszDataDescriptionCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = ConstPtr(0L),
        dwDataType = 0,
        pbDataCtorArg = MutPtr(0L),
        cbData = 0u,
        pszDataDescriptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszName

    public operator fun component2(): HttpTraceType = this.dwDataType

    public operator fun component3(): MutPtr<UByte> = this.pbData

    public operator fun component4(): UInt = this.cbData

    public operator fun component5(): Pcwstr = this.pszDataDescription

    public fun copy(pszName: Pcwstr = this.pszName, dwDataType: HttpTraceType = this.dwDataType, pbData: MutPtr<UByte> = this.pbData, cbData: UInt = this.cbData, pszDataDescription: Pcwstr = this.pszDataDescription): HttpTraceEventItem = HttpTraceEventItem(pszNameCtorArg = pszName, dwDataType = dwDataType, pbDataCtorArg = pbData, cbData = cbData, pszDataDescriptionCtorArg = pszDataDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpTraceEventItem) return false
        if (this.pszName != other.pszName) return false
        if (this.dwDataType != other.dwDataType) return false
        if (this.pbData != other.pbData) return false
        if (this.cbData != other.cbData) return false
        if (this.pszDataDescription != other.pszDataDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.dwDataType.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pszDataDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pcwstr = ConstPtr(0L),
            dwDataType: HttpTraceType = 0,
            pbData: MutPtr<UByte> = MutPtr(0L),
            cbData: UInt = 0u,
            pszDataDescription: Pcwstr = ConstPtr(0L),
        ): HttpTraceEventItem =
            HttpTraceEventItem(
                pszNameCtorArg = pszName,
                dwDataType = dwDataType,
                pbDataCtorArg = pbData,
                cbData = cbData,
                pszDataDescriptionCtorArg = pszDataDescription,
            )
    }
}

public class LoggingParameters internal constructor(
    pszSessionIdCtorArg: Pcwstr,
    pszSiteNameCtorArg: Pcwstr,
    pszUserNameCtorArg: Pcwstr,
    pszHostNameCtorArg: Pcwstr,
    pszRemoteIpAddressCtorArg: Pcwstr,
    public var dwRemoteIpPort: UInt,
    pszLocalIpAddressCtorArg: Pcwstr,
    public var dwLocalIpPort: UInt,
    public var bytesSent: ULong,
    public var bytesReceived: ULong,
    pszCommandCtorArg: Pcwstr,
    pszCommandParametersCtorArg: Pcwstr,
    pszFullPathCtorArg: Pcwstr,
    public var dwElapsedMilliseconds: UInt,
    public var ftpStatus: UInt,
    public var ftpSubStatus: UInt,
    public var hrStatus: Hresult,
    pszInformationCtorArg: Pcwstr,
) {
    public var pszSessionId: Pcwstr = pszSessionIdCtorArg
        internal set

    public var pszSiteName: Pcwstr = pszSiteNameCtorArg
        internal set

    public var pszUserName: Pcwstr = pszUserNameCtorArg
        internal set

    public var pszHostName: Pcwstr = pszHostNameCtorArg
        internal set

    public var pszRemoteIpAddress: Pcwstr = pszRemoteIpAddressCtorArg
        internal set

    public var pszLocalIpAddress: Pcwstr = pszLocalIpAddressCtorArg
        internal set

    public var pszCommand: Pcwstr = pszCommandCtorArg
        internal set

    public var pszCommandParameters: Pcwstr = pszCommandParametersCtorArg
        internal set

    public var pszFullPath: Pcwstr = pszFullPathCtorArg
        internal set

    public var pszInformation: Pcwstr = pszInformationCtorArg
        internal set

    public constructor() : this(
        pszSessionIdCtorArg = ConstPtr(0L),
        pszSiteNameCtorArg = ConstPtr(0L),
        pszUserNameCtorArg = ConstPtr(0L),
        pszHostNameCtorArg = ConstPtr(0L),
        pszRemoteIpAddressCtorArg = ConstPtr(0L),
        dwRemoteIpPort = 0u,
        pszLocalIpAddressCtorArg = ConstPtr(0L),
        dwLocalIpPort = 0u,
        bytesSent = 0uL,
        bytesReceived = 0uL,
        pszCommandCtorArg = ConstPtr(0L),
        pszCommandParametersCtorArg = ConstPtr(0L),
        pszFullPathCtorArg = ConstPtr(0L),
        dwElapsedMilliseconds = 0u,
        ftpStatus = 0u,
        ftpSubStatus = 0u,
        hrStatus = 0,
        pszInformationCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            pszSessionId: Pcwstr = ConstPtr(0L),
            pszSiteName: Pcwstr = ConstPtr(0L),
            pszUserName: Pcwstr = ConstPtr(0L),
            pszHostName: Pcwstr = ConstPtr(0L),
            pszRemoteIpAddress: Pcwstr = ConstPtr(0L),
            dwRemoteIpPort: UInt = 0u,
            pszLocalIpAddress: Pcwstr = ConstPtr(0L),
            dwLocalIpPort: UInt = 0u,
            bytesSent: ULong = 0uL,
            bytesReceived: ULong = 0uL,
            pszCommand: Pcwstr = ConstPtr(0L),
            pszCommandParameters: Pcwstr = ConstPtr(0L),
            pszFullPath: Pcwstr = ConstPtr(0L),
            dwElapsedMilliseconds: UInt = 0u,
            ftpStatus: UInt = 0u,
            ftpSubStatus: UInt = 0u,
            hrStatus: Hresult = 0,
            pszInformation: Pcwstr = ConstPtr(0L),
        ): LoggingParameters =
            LoggingParameters(
                pszSessionIdCtorArg = pszSessionId,
                pszSiteNameCtorArg = pszSiteName,
                pszUserNameCtorArg = pszUserName,
                pszHostNameCtorArg = pszHostName,
                pszRemoteIpAddressCtorArg = pszRemoteIpAddress,
                dwRemoteIpPort = dwRemoteIpPort,
                pszLocalIpAddressCtorArg = pszLocalIpAddress,
                dwLocalIpPort = dwLocalIpPort,
                bytesSent = bytesSent,
                bytesReceived = bytesReceived,
                pszCommandCtorArg = pszCommand,
                pszCommandParametersCtorArg = pszCommandParameters,
                pszFullPathCtorArg = pszFullPath,
                dwElapsedMilliseconds = dwElapsedMilliseconds,
                ftpStatus = ftpStatus,
                ftpSubStatus = ftpSubStatus,
                hrStatus = hrStatus,
                pszInformationCtorArg = pszInformation,
            )
    }
}

public class MdChangeObjectW internal constructor(
    pszMDPathCtorArg: Pwstr,
    public var dwMDChangeType: UInt,
    public var dwMDNumDataIDs: UInt,
    pdwMDDataIDsCtorArg: MutPtr<UInt>,
) {
    public var pszMDPath: Pwstr = pszMDPathCtorArg
        internal set

    public var pdwMDDataIDs: MutPtr<UInt> = pdwMDDataIDsCtorArg
        internal set

    public constructor() : this(
        pszMDPathCtorArg = MutPtr(0L),
        dwMDChangeType = 0u,
        dwMDNumDataIDs = 0u,
        pdwMDDataIDsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszMDPath

    public operator fun component2(): UInt = this.dwMDChangeType

    public operator fun component3(): UInt = this.dwMDNumDataIDs

    public operator fun component4(): MutPtr<UInt> = this.pdwMDDataIDs

    public fun copy(pszMDPath: Pwstr = this.pszMDPath, dwMDChangeType: UInt = this.dwMDChangeType, dwMDNumDataIDs: UInt = this.dwMDNumDataIDs, pdwMDDataIDs: MutPtr<UInt> = this.pdwMDDataIDs): MdChangeObjectW = MdChangeObjectW(pszMDPathCtorArg = pszMDPath, dwMDChangeType = dwMDChangeType, dwMDNumDataIDs = dwMDNumDataIDs, pdwMDDataIDsCtorArg = pdwMDDataIDs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MdChangeObjectW) return false
        if (this.pszMDPath != other.pszMDPath) return false
        if (this.dwMDChangeType != other.dwMDChangeType) return false
        if (this.dwMDNumDataIDs != other.dwMDNumDataIDs) return false
        if (this.pdwMDDataIDs != other.pdwMDDataIDs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszMDPath.hashCode()
        result = 31 * result + this.dwMDChangeType.hashCode()
        result = 31 * result + this.dwMDNumDataIDs.hashCode()
        result = 31 * result + this.pdwMDDataIDs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszMDPath: Pwstr = MutPtr(0L),
            dwMDChangeType: UInt = 0u,
            dwMDNumDataIDs: UInt = 0u,
            pdwMDDataIDs: MutPtr<UInt> = MutPtr(0L),
        ): MdChangeObjectW =
            MdChangeObjectW(
                pszMDPathCtorArg = pszMDPath,
                dwMDChangeType = dwMDChangeType,
                dwMDNumDataIDs = dwMDNumDataIDs,
                pdwMDDataIDsCtorArg = pdwMDDataIDs,
            )
    }
}

public data class MetadataGetallInternalRecord(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var anonymous: MetadataGetallInternalRecord0 = MetadataGetallInternalRecord0(),
    public var dwMDDataTag: UInt = 0u,
)

public class MetadataGetallInternalRecord0 internal constructor(
    public var dwMDDataOffset: Int,
    pbMDDataCtorArg: MutPtr<UByte>,
) {
    public var pbMDData: MutPtr<UByte> = pbMDDataCtorArg
        internal set

    public constructor() : this(
        dwMDDataOffset = 0,
        pbMDDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwMDDataOffset

    public operator fun component2(): MutPtr<UByte> = this.pbMDData

    public fun copy(dwMDDataOffset: Int = this.dwMDDataOffset, pbMDData: MutPtr<UByte> = this.pbMDData): MetadataGetallInternalRecord0 = MetadataGetallInternalRecord0(dwMDDataOffset = dwMDDataOffset, pbMDDataCtorArg = pbMDData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MetadataGetallInternalRecord0) return false
        if (this.dwMDDataOffset != other.dwMDDataOffset) return false
        if (this.pbMDData != other.pbMDData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMDDataOffset.hashCode()
        result = 31 * result + this.pbMDData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMDDataOffset: Int = 0,
            pbMDData: MutPtr<UByte> = MutPtr(0L),
        ): MetadataGetallInternalRecord0 =
            MetadataGetallInternalRecord0(
                dwMDDataOffset = dwMDDataOffset,
                pbMDDataCtorArg = pbMDData,
            )
    }
}

public data class MetadataGetallRecord(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var dwMDDataOffset: UInt = 0u,
    public var dwMDDataTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataGetallRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataGetallRecord> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MetadataGetallRecord =
                    MetadataGetallRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MetadataGetallRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMDIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMDAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMDUserType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMDDataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMDDataLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMDDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMDDataTag)
                }
            }
    }
}

public data class MetadataHandleInfo(
    public var dwMDPermissions: UInt = 0u,
    public var dwMDSystemChangeNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataHandleInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataHandleInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MetadataHandleInfo =
                    MetadataHandleInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MetadataHandleInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMDPermissions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMDSystemChangeNumber)
                }
            }
    }
}

public class MetadataRecord internal constructor(
    public var dwMDIdentifier: UInt,
    public var dwMDAttributes: UInt,
    public var dwMDUserType: UInt,
    public var dwMDDataType: UInt,
    public var dwMDDataLen: UInt,
    pbMDDataCtorArg: MutPtr<UByte>,
    public var dwMDDataTag: UInt,
) {
    public var pbMDData: MutPtr<UByte> = pbMDDataCtorArg
        internal set

    public constructor() : this(
        dwMDIdentifier = 0u,
        dwMDAttributes = 0u,
        dwMDUserType = 0u,
        dwMDDataType = 0u,
        dwMDDataLen = 0u,
        pbMDDataCtorArg = MutPtr(0L),
        dwMDDataTag = 0u,
    )

    public operator fun component1(): UInt = this.dwMDIdentifier

    public operator fun component2(): UInt = this.dwMDAttributes

    public operator fun component3(): UInt = this.dwMDUserType

    public operator fun component4(): UInt = this.dwMDDataType

    public operator fun component5(): UInt = this.dwMDDataLen

    public operator fun component6(): MutPtr<UByte> = this.pbMDData

    public operator fun component7(): UInt = this.dwMDDataTag

    public fun copy(dwMDIdentifier: UInt = this.dwMDIdentifier, dwMDAttributes: UInt = this.dwMDAttributes, dwMDUserType: UInt = this.dwMDUserType, dwMDDataType: UInt = this.dwMDDataType, dwMDDataLen: UInt = this.dwMDDataLen, pbMDData: MutPtr<UByte> = this.pbMDData, dwMDDataTag: UInt = this.dwMDDataTag): MetadataRecord = MetadataRecord(dwMDIdentifier = dwMDIdentifier, dwMDAttributes = dwMDAttributes, dwMDUserType = dwMDUserType, dwMDDataType = dwMDDataType, dwMDDataLen = dwMDDataLen, pbMDDataCtorArg = pbMDData, dwMDDataTag = dwMDDataTag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MetadataRecord) return false
        if (this.dwMDIdentifier != other.dwMDIdentifier) return false
        if (this.dwMDAttributes != other.dwMDAttributes) return false
        if (this.dwMDUserType != other.dwMDUserType) return false
        if (this.dwMDDataType != other.dwMDDataType) return false
        if (this.dwMDDataLen != other.dwMDDataLen) return false
        if (this.pbMDData != other.pbMDData) return false
        if (this.dwMDDataTag != other.dwMDDataTag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMDIdentifier.hashCode()
        result = 31 * result + this.dwMDAttributes.hashCode()
        result = 31 * result + this.dwMDUserType.hashCode()
        result = 31 * result + this.dwMDDataType.hashCode()
        result = 31 * result + this.dwMDDataLen.hashCode()
        result = 31 * result + this.pbMDData.hashCode()
        result = 31 * result + this.dwMDDataTag.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataRecord> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MetadataRecord =
                    MetadataRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MetadataRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMDIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMDAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMDUserType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMDDataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMDDataLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbMDData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMDDataTag)
                }
            }

        public operator fun invoke(
            dwMDIdentifier: UInt = 0u,
            dwMDAttributes: UInt = 0u,
            dwMDUserType: UInt = 0u,
            dwMDDataType: UInt = 0u,
            dwMDDataLen: UInt = 0u,
            pbMDData: MutPtr<UByte> = MutPtr(0L),
            dwMDDataTag: UInt = 0u,
        ): MetadataRecord =
            MetadataRecord(
                dwMDIdentifier = dwMDIdentifier,
                dwMDAttributes = dwMDAttributes,
                dwMDUserType = dwMDUserType,
                dwMDDataType = dwMDDataType,
                dwMDDataLen = dwMDDataLen,
                pbMDDataCtorArg = pbMDData,
                dwMDDataTag = dwMDDataTag,
            )
    }
}

public class PostProcessParameters internal constructor(
    pszSessionIdCtorArg: Pcwstr,
    pszSiteNameCtorArg: Pcwstr,
    pszUserNameCtorArg: Pcwstr,
    pszHostNameCtorArg: Pcwstr,
    pszRemoteIpAddressCtorArg: Pcwstr,
    public var dwRemoteIpPort: UInt,
    pszLocalIpAddressCtorArg: Pcwstr,
    public var dwLocalIpPort: UInt,
    public var bytesSent: ULong,
    public var bytesReceived: ULong,
    pszCommandCtorArg: Pcwstr,
    pszCommandParametersCtorArg: Pcwstr,
    pszFullPathCtorArg: Pcwstr,
    pszPhysicalPathCtorArg: Pcwstr,
    public var ftpStatus: UInt,
    public var ftpSubStatus: UInt,
    public var hrStatus: Hresult,
    public var sessionStartTime: Filetime,
    public var bytesSentPerSession: ULong,
    public var bytesReceivedPerSession: ULong,
) {
    public var pszSessionId: Pcwstr = pszSessionIdCtorArg
        internal set

    public var pszSiteName: Pcwstr = pszSiteNameCtorArg
        internal set

    public var pszUserName: Pcwstr = pszUserNameCtorArg
        internal set

    public var pszHostName: Pcwstr = pszHostNameCtorArg
        internal set

    public var pszRemoteIpAddress: Pcwstr = pszRemoteIpAddressCtorArg
        internal set

    public var pszLocalIpAddress: Pcwstr = pszLocalIpAddressCtorArg
        internal set

    public var pszCommand: Pcwstr = pszCommandCtorArg
        internal set

    public var pszCommandParameters: Pcwstr = pszCommandParametersCtorArg
        internal set

    public var pszFullPath: Pcwstr = pszFullPathCtorArg
        internal set

    public var pszPhysicalPath: Pcwstr = pszPhysicalPathCtorArg
        internal set

    public constructor() : this(
        pszSessionIdCtorArg = ConstPtr(0L),
        pszSiteNameCtorArg = ConstPtr(0L),
        pszUserNameCtorArg = ConstPtr(0L),
        pszHostNameCtorArg = ConstPtr(0L),
        pszRemoteIpAddressCtorArg = ConstPtr(0L),
        dwRemoteIpPort = 0u,
        pszLocalIpAddressCtorArg = ConstPtr(0L),
        dwLocalIpPort = 0u,
        bytesSent = 0uL,
        bytesReceived = 0uL,
        pszCommandCtorArg = ConstPtr(0L),
        pszCommandParametersCtorArg = ConstPtr(0L),
        pszFullPathCtorArg = ConstPtr(0L),
        pszPhysicalPathCtorArg = ConstPtr(0L),
        ftpStatus = 0u,
        ftpSubStatus = 0u,
        hrStatus = 0,
        sessionStartTime = Filetime(),
        bytesSentPerSession = 0uL,
        bytesReceivedPerSession = 0uL,
    )

    public companion object {
        public operator fun invoke(
            pszSessionId: Pcwstr = ConstPtr(0L),
            pszSiteName: Pcwstr = ConstPtr(0L),
            pszUserName: Pcwstr = ConstPtr(0L),
            pszHostName: Pcwstr = ConstPtr(0L),
            pszRemoteIpAddress: Pcwstr = ConstPtr(0L),
            dwRemoteIpPort: UInt = 0u,
            pszLocalIpAddress: Pcwstr = ConstPtr(0L),
            dwLocalIpPort: UInt = 0u,
            bytesSent: ULong = 0uL,
            bytesReceived: ULong = 0uL,
            pszCommand: Pcwstr = ConstPtr(0L),
            pszCommandParameters: Pcwstr = ConstPtr(0L),
            pszFullPath: Pcwstr = ConstPtr(0L),
            pszPhysicalPath: Pcwstr = ConstPtr(0L),
            ftpStatus: UInt = 0u,
            ftpSubStatus: UInt = 0u,
            hrStatus: Hresult = 0,
            sessionStartTime: Filetime = Filetime(),
            bytesSentPerSession: ULong = 0uL,
            bytesReceivedPerSession: ULong = 0uL,
        ): PostProcessParameters =
            PostProcessParameters(
                pszSessionIdCtorArg = pszSessionId,
                pszSiteNameCtorArg = pszSiteName,
                pszUserNameCtorArg = pszUserName,
                pszHostNameCtorArg = pszHostName,
                pszRemoteIpAddressCtorArg = pszRemoteIpAddress,
                dwRemoteIpPort = dwRemoteIpPort,
                pszLocalIpAddressCtorArg = pszLocalIpAddress,
                dwLocalIpPort = dwLocalIpPort,
                bytesSent = bytesSent,
                bytesReceived = bytesReceived,
                pszCommandCtorArg = pszCommand,
                pszCommandParametersCtorArg = pszCommandParameters,
                pszFullPathCtorArg = pszFullPath,
                pszPhysicalPathCtorArg = pszPhysicalPath,
                ftpStatus = ftpStatus,
                ftpSubStatus = ftpSubStatus,
                hrStatus = hrStatus,
                sessionStartTime = sessionStartTime,
                bytesSentPerSession = bytesSentPerSession,
                bytesReceivedPerSession = bytesReceivedPerSession,
            )
    }
}

public class PreProcessParameters internal constructor(
    pszSessionIdCtorArg: Pcwstr,
    pszSiteNameCtorArg: Pcwstr,
    pszUserNameCtorArg: Pcwstr,
    pszHostNameCtorArg: Pcwstr,
    pszRemoteIpAddressCtorArg: Pcwstr,
    public var dwRemoteIpPort: UInt,
    pszLocalIpAddressCtorArg: Pcwstr,
    public var dwLocalIpPort: UInt,
    pszCommandCtorArg: Pcwstr,
    pszCommandParametersCtorArg: Pcwstr,
    public var sessionStartTime: Filetime,
    public var bytesSentPerSession: ULong,
    public var bytesReceivedPerSession: ULong,
) {
    public var pszSessionId: Pcwstr = pszSessionIdCtorArg
        internal set

    public var pszSiteName: Pcwstr = pszSiteNameCtorArg
        internal set

    public var pszUserName: Pcwstr = pszUserNameCtorArg
        internal set

    public var pszHostName: Pcwstr = pszHostNameCtorArg
        internal set

    public var pszRemoteIpAddress: Pcwstr = pszRemoteIpAddressCtorArg
        internal set

    public var pszLocalIpAddress: Pcwstr = pszLocalIpAddressCtorArg
        internal set

    public var pszCommand: Pcwstr = pszCommandCtorArg
        internal set

    public var pszCommandParameters: Pcwstr = pszCommandParametersCtorArg
        internal set

    public constructor() : this(
        pszSessionIdCtorArg = ConstPtr(0L),
        pszSiteNameCtorArg = ConstPtr(0L),
        pszUserNameCtorArg = ConstPtr(0L),
        pszHostNameCtorArg = ConstPtr(0L),
        pszRemoteIpAddressCtorArg = ConstPtr(0L),
        dwRemoteIpPort = 0u,
        pszLocalIpAddressCtorArg = ConstPtr(0L),
        dwLocalIpPort = 0u,
        pszCommandCtorArg = ConstPtr(0L),
        pszCommandParametersCtorArg = ConstPtr(0L),
        sessionStartTime = Filetime(),
        bytesSentPerSession = 0uL,
        bytesReceivedPerSession = 0uL,
    )

    public operator fun component1(): Pcwstr = this.pszSessionId

    public operator fun component2(): Pcwstr = this.pszSiteName

    public operator fun component3(): Pcwstr = this.pszUserName

    public operator fun component4(): Pcwstr = this.pszHostName

    public operator fun component5(): Pcwstr = this.pszRemoteIpAddress

    public operator fun component6(): UInt = this.dwRemoteIpPort

    public operator fun component7(): Pcwstr = this.pszLocalIpAddress

    public operator fun component8(): UInt = this.dwLocalIpPort

    public operator fun component9(): Pcwstr = this.pszCommand

    public operator fun component10(): Pcwstr = this.pszCommandParameters

    public operator fun component11(): Filetime = this.sessionStartTime

    public operator fun component12(): ULong = this.bytesSentPerSession

    public operator fun component13(): ULong = this.bytesReceivedPerSession

    public fun copy(pszSessionId: Pcwstr = this.pszSessionId, pszSiteName: Pcwstr = this.pszSiteName, pszUserName: Pcwstr = this.pszUserName, pszHostName: Pcwstr = this.pszHostName, pszRemoteIpAddress: Pcwstr = this.pszRemoteIpAddress, dwRemoteIpPort: UInt = this.dwRemoteIpPort, pszLocalIpAddress: Pcwstr = this.pszLocalIpAddress, dwLocalIpPort: UInt = this.dwLocalIpPort, pszCommand: Pcwstr = this.pszCommand, pszCommandParameters: Pcwstr = this.pszCommandParameters, sessionStartTime: Filetime = this.sessionStartTime, bytesSentPerSession: ULong = this.bytesSentPerSession, bytesReceivedPerSession: ULong = this.bytesReceivedPerSession): PreProcessParameters = PreProcessParameters(pszSessionIdCtorArg = pszSessionId, pszSiteNameCtorArg = pszSiteName, pszUserNameCtorArg = pszUserName, pszHostNameCtorArg = pszHostName, pszRemoteIpAddressCtorArg = pszRemoteIpAddress, dwRemoteIpPort = dwRemoteIpPort, pszLocalIpAddressCtorArg = pszLocalIpAddress, dwLocalIpPort = dwLocalIpPort, pszCommandCtorArg = pszCommand, pszCommandParametersCtorArg = pszCommandParameters, sessionStartTime = sessionStartTime, bytesSentPerSession = bytesSentPerSession, bytesReceivedPerSession = bytesReceivedPerSession)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PreProcessParameters) return false
        if (this.pszSessionId != other.pszSessionId) return false
        if (this.pszSiteName != other.pszSiteName) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.pszHostName != other.pszHostName) return false
        if (this.pszRemoteIpAddress != other.pszRemoteIpAddress) return false
        if (this.dwRemoteIpPort != other.dwRemoteIpPort) return false
        if (this.pszLocalIpAddress != other.pszLocalIpAddress) return false
        if (this.dwLocalIpPort != other.dwLocalIpPort) return false
        if (this.pszCommand != other.pszCommand) return false
        if (this.pszCommandParameters != other.pszCommandParameters) return false
        if (this.sessionStartTime != other.sessionStartTime) return false
        if (this.bytesSentPerSession != other.bytesSentPerSession) return false
        if (this.bytesReceivedPerSession != other.bytesReceivedPerSession) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszSessionId.hashCode()
        result = 31 * result + this.pszSiteName.hashCode()
        result = 31 * result + this.pszUserName.hashCode()
        result = 31 * result + this.pszHostName.hashCode()
        result = 31 * result + this.pszRemoteIpAddress.hashCode()
        result = 31 * result + this.dwRemoteIpPort.hashCode()
        result = 31 * result + this.pszLocalIpAddress.hashCode()
        result = 31 * result + this.dwLocalIpPort.hashCode()
        result = 31 * result + this.pszCommand.hashCode()
        result = 31 * result + this.pszCommandParameters.hashCode()
        result = 31 * result + this.sessionStartTime.hashCode()
        result = 31 * result + this.bytesSentPerSession.hashCode()
        result = 31 * result + this.bytesReceivedPerSession.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszSessionId: Pcwstr = ConstPtr(0L),
            pszSiteName: Pcwstr = ConstPtr(0L),
            pszUserName: Pcwstr = ConstPtr(0L),
            pszHostName: Pcwstr = ConstPtr(0L),
            pszRemoteIpAddress: Pcwstr = ConstPtr(0L),
            dwRemoteIpPort: UInt = 0u,
            pszLocalIpAddress: Pcwstr = ConstPtr(0L),
            dwLocalIpPort: UInt = 0u,
            pszCommand: Pcwstr = ConstPtr(0L),
            pszCommandParameters: Pcwstr = ConstPtr(0L),
            sessionStartTime: Filetime = Filetime(),
            bytesSentPerSession: ULong = 0uL,
            bytesReceivedPerSession: ULong = 0uL,
        ): PreProcessParameters =
            PreProcessParameters(
                pszSessionIdCtorArg = pszSessionId,
                pszSiteNameCtorArg = pszSiteName,
                pszUserNameCtorArg = pszUserName,
                pszHostNameCtorArg = pszHostName,
                pszRemoteIpAddressCtorArg = pszRemoteIpAddress,
                dwRemoteIpPort = dwRemoteIpPort,
                pszLocalIpAddressCtorArg = pszLocalIpAddress,
                dwLocalIpPort = dwLocalIpPort,
                pszCommandCtorArg = pszCommand,
                pszCommandParametersCtorArg = pszCommandParameters,
                sessionStartTime = sessionStartTime,
                bytesSentPerSession = bytesSentPerSession,
                bytesReceivedPerSession = bytesReceivedPerSession,
            )
    }
}
