@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

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
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextBindings
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextCipherInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextConnectionInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public class AppCacheDownloadEntry internal constructor(
    pwszUrlCtorArg: Pwstr,
    public var dwEntryType: UInt,
) {
    public var pwszUrl: Pwstr = pwszUrlCtorArg
        internal set

    public constructor() : this(
        pwszUrlCtorArg = MutPtr(0L),
        dwEntryType = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszUrl

    public operator fun component2(): UInt = this.dwEntryType

    public fun copy(pwszUrl: Pwstr = this.pwszUrl, dwEntryType: UInt = this.dwEntryType): AppCacheDownloadEntry = AppCacheDownloadEntry(pwszUrlCtorArg = pwszUrl, dwEntryType = dwEntryType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppCacheDownloadEntry) return false
        if (this.pwszUrl != other.pwszUrl) return false
        if (this.dwEntryType != other.dwEntryType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszUrl.hashCode()
        result = 31 * result + this.dwEntryType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszUrl: Pwstr = MutPtr(0L),
            dwEntryType: UInt = 0u,
        ): AppCacheDownloadEntry =
            AppCacheDownloadEntry(
                pwszUrlCtorArg = pwszUrl,
                dwEntryType = dwEntryType,
            )
    }
}

public class AppCacheDownloadList internal constructor(
    public var dwEntryCount: UInt,
    pEntriesCtorArg: MutPtr<AppCacheDownloadEntry>,
) {
    public var pEntries: MutPtr<AppCacheDownloadEntry> = pEntriesCtorArg
        internal set

    public constructor() : this(
        dwEntryCount = 0u,
        pEntriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwEntryCount

    public operator fun component2(): MutPtr<AppCacheDownloadEntry> = this.pEntries

    public fun copy(dwEntryCount: UInt = this.dwEntryCount, pEntries: MutPtr<AppCacheDownloadEntry> = this.pEntries): AppCacheDownloadList = AppCacheDownloadList(dwEntryCount = dwEntryCount, pEntriesCtorArg = pEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppCacheDownloadList) return false
        if (this.dwEntryCount != other.dwEntryCount) return false
        if (this.pEntries != other.pEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEntryCount.hashCode()
        result = 31 * result + this.pEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppCacheDownloadList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppCacheDownloadList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AppCacheDownloadList =
                    AppCacheDownloadList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AppCacheDownloadEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AppCacheDownloadList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEntryCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AppCacheDownloadEntry>(64)
                    ).writeNative(addr + 8L, value.pEntries)
                }
            }

        public operator fun invoke(
            dwEntryCount: UInt = 0u,
            pEntries: MutPtr<AppCacheDownloadEntry> = MutPtr(0L),
        ): AppCacheDownloadList =
            AppCacheDownloadList(
                dwEntryCount = dwEntryCount,
                pEntriesCtorArg = pEntries,
            )
    }
}

public class AppCacheGroupInfo internal constructor(
    pwszManifestUrlCtorArg: Pwstr,
    public var ftLastAccessTime: Filetime,
    public var ullSize: ULong,
) {
    public var pwszManifestUrl: Pwstr = pwszManifestUrlCtorArg
        internal set

    public constructor() : this(
        pwszManifestUrlCtorArg = MutPtr(0L),
        ftLastAccessTime = Filetime(),
        ullSize = 0uL,
    )

    public operator fun component1(): Pwstr = this.pwszManifestUrl

    public operator fun component2(): Filetime = this.ftLastAccessTime

    public operator fun component3(): ULong = this.ullSize

    public fun copy(pwszManifestUrl: Pwstr = this.pwszManifestUrl, ftLastAccessTime: Filetime = this.ftLastAccessTime, ullSize: ULong = this.ullSize): AppCacheGroupInfo = AppCacheGroupInfo(pwszManifestUrlCtorArg = pwszManifestUrl, ftLastAccessTime = ftLastAccessTime, ullSize = ullSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppCacheGroupInfo) return false
        if (this.pwszManifestUrl != other.pwszManifestUrl) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ullSize != other.ullSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszManifestUrl.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ullSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszManifestUrl: Pwstr = MutPtr(0L),
            ftLastAccessTime: Filetime = Filetime(),
            ullSize: ULong = 0uL,
        ): AppCacheGroupInfo =
            AppCacheGroupInfo(
                pwszManifestUrlCtorArg = pwszManifestUrl,
                ftLastAccessTime = ftLastAccessTime,
                ullSize = ullSize,
            )
    }
}

public class AppCacheGroupList internal constructor(
    public var dwAppCacheGroupCount: UInt,
    pAppCacheGroupsCtorArg: MutPtr<AppCacheGroupInfo>,
) {
    public var pAppCacheGroups: MutPtr<AppCacheGroupInfo> = pAppCacheGroupsCtorArg
        internal set

    public constructor() : this(
        dwAppCacheGroupCount = 0u,
        pAppCacheGroupsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAppCacheGroupCount

    public operator fun component2(): MutPtr<AppCacheGroupInfo> = this.pAppCacheGroups

    public fun copy(dwAppCacheGroupCount: UInt = this.dwAppCacheGroupCount, pAppCacheGroups: MutPtr<AppCacheGroupInfo> = this.pAppCacheGroups): AppCacheGroupList = AppCacheGroupList(dwAppCacheGroupCount = dwAppCacheGroupCount, pAppCacheGroupsCtorArg = pAppCacheGroups)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AppCacheGroupList) return false
        if (this.dwAppCacheGroupCount != other.dwAppCacheGroupCount) return false
        if (this.pAppCacheGroups != other.pAppCacheGroups) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAppCacheGroupCount.hashCode()
        result = 31 * result + this.pAppCacheGroups.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppCacheGroupList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AppCacheGroupList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AppCacheGroupList =
                    AppCacheGroupList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AppCacheGroupInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AppCacheGroupList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAppCacheGroupCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AppCacheGroupInfo>(64)
                    ).writeNative(addr + 8L, value.pAppCacheGroups)
                }
            }

        public operator fun invoke(
            dwAppCacheGroupCount: UInt = 0u,
            pAppCacheGroups: MutPtr<AppCacheGroupInfo> = MutPtr(0L),
        ): AppCacheGroupList =
            AppCacheGroupList(
                dwAppCacheGroupCount = dwAppCacheGroupCount,
                pAppCacheGroupsCtorArg = pAppCacheGroups,
            )
    }
}

public class AutoProxyScriptBuffer internal constructor(
    public var dwStructSize: UInt,
    lpszScriptBufferCtorArg: Pstr,
    public var dwScriptBufferSize: UInt,
) {
    public var lpszScriptBuffer: Pstr = lpszScriptBufferCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpszScriptBufferCtorArg = MutPtr(0L),
        dwScriptBufferSize = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pstr = this.lpszScriptBuffer

    public operator fun component3(): UInt = this.dwScriptBufferSize

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszScriptBuffer: Pstr = this.lpszScriptBuffer, dwScriptBufferSize: UInt = this.dwScriptBufferSize): AutoProxyScriptBuffer = AutoProxyScriptBuffer(dwStructSize = dwStructSize, lpszScriptBufferCtorArg = lpszScriptBuffer, dwScriptBufferSize = dwScriptBufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AutoProxyScriptBuffer) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpszScriptBuffer != other.lpszScriptBuffer) return false
        if (this.dwScriptBufferSize != other.dwScriptBufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpszScriptBuffer.hashCode()
        result = 31 * result + this.dwScriptBufferSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpszScriptBuffer: Pstr = MutPtr(0L),
            dwScriptBufferSize: UInt = 0u,
        ): AutoProxyScriptBuffer =
            AutoProxyScriptBuffer(
                dwStructSize = dwStructSize,
                lpszScriptBufferCtorArg = lpszScriptBuffer,
                dwScriptBufferSize = dwScriptBufferSize,
            )
    }
}

public class AutoProxyHelperFunctions internal constructor(
    lpVtblCtorArg: ConstPtr<AutoProxyHelperVtbl>,
) {
    public var lpVtbl: ConstPtr<AutoProxyHelperVtbl> = lpVtblCtorArg
        internal set

    public constructor() : this(
        lpVtblCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<AutoProxyHelperVtbl> = this.lpVtbl

    public fun copy(lpVtbl: ConstPtr<AutoProxyHelperVtbl> = this.lpVtbl): AutoProxyHelperFunctions = AutoProxyHelperFunctions(lpVtblCtorArg = lpVtbl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AutoProxyHelperFunctions) return false
        if (this.lpVtbl != other.lpVtbl) return false
        return true
    }

    override fun hashCode(): Int = this.lpVtbl.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AutoProxyHelperFunctions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AutoProxyHelperFunctions> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AutoProxyHelperFunctions =
                    AutoProxyHelperFunctions(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<AutoProxyHelperVtbl>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AutoProxyHelperFunctions) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<AutoProxyHelperVtbl>(64)
                    ).writeNative(addr, value.lpVtbl)
                }
            }

        public operator fun invoke(
            lpVtbl: ConstPtr<AutoProxyHelperVtbl> = ConstPtr(0L),
        ): AutoProxyHelperFunctions =
            AutoProxyHelperFunctions(
                lpVtblCtorArg = lpVtbl,
            )
    }
}

public data class AutoProxyHelperVtbl(
    public var isResolvable: Int = 0,
    public var getIPAddress: Int = 0,
    public var resolveHostName: Int = 0,
    public var isInNet: Int = 0,
    public var isResolvableEx: Int = 0,
    public var getIPAddressEx: Int = 0,
    public var resolveHostNameEx: Int = 0,
    public var isInNetEx: Int = 0,
    public var sortIpList: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AutoProxyHelperVtbl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AutoProxyHelperVtbl> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AutoProxyHelperVtbl =
                    AutoProxyHelperVtbl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: AutoProxyHelperVtbl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.isResolvable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getIPAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.resolveHostName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.isInNet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.isResolvableEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.getIPAddressEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.resolveHostNameEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.isInNetEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.sortIpList)
                }
            }
    }
}

public class CookieDlgInfo internal constructor(
    pszServerCtorArg: Pwstr,
    picCtorArg: MutPtr<InternetCookie>,
    public var dwStopWarning: UInt,
    public var cx: Int,
    public var cy: Int,
    pszHeaderCtorArg: Pwstr,
    public var dwOperation: UInt,
) {
    public var pszServer: Pwstr = pszServerCtorArg
        internal set

    public var pic: MutPtr<InternetCookie> = picCtorArg
        internal set

    public var pszHeader: Pwstr = pszHeaderCtorArg
        internal set

    public constructor() : this(
        pszServerCtorArg = MutPtr(0L),
        picCtorArg = MutPtr(0L),
        dwStopWarning = 0u,
        cx = 0,
        cy = 0,
        pszHeaderCtorArg = MutPtr(0L),
        dwOperation = 0u,
    )

    public operator fun component1(): Pwstr = this.pszServer

    public operator fun component2(): MutPtr<InternetCookie> = this.pic

    public operator fun component3(): UInt = this.dwStopWarning

    public operator fun component4(): Int = this.cx

    public operator fun component5(): Int = this.cy

    public operator fun component6(): Pwstr = this.pszHeader

    public operator fun component7(): UInt = this.dwOperation

    public fun copy(pszServer: Pwstr = this.pszServer, pic: MutPtr<InternetCookie> = this.pic, dwStopWarning: UInt = this.dwStopWarning, cx: Int = this.cx, cy: Int = this.cy, pszHeader: Pwstr = this.pszHeader, dwOperation: UInt = this.dwOperation): CookieDlgInfo = CookieDlgInfo(pszServerCtorArg = pszServer, picCtorArg = pic, dwStopWarning = dwStopWarning, cx = cx, cy = cy, pszHeaderCtorArg = pszHeader, dwOperation = dwOperation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CookieDlgInfo) return false
        if (this.pszServer != other.pszServer) return false
        if (this.pic != other.pic) return false
        if (this.dwStopWarning != other.dwStopWarning) return false
        if (this.cx != other.cx) return false
        if (this.cy != other.cy) return false
        if (this.pszHeader != other.pszHeader) return false
        if (this.dwOperation != other.dwOperation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszServer.hashCode()
        result = 31 * result + this.pic.hashCode()
        result = 31 * result + this.dwStopWarning.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.pszHeader.hashCode()
        result = 31 * result + this.dwOperation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszServer: Pwstr = MutPtr(0L),
            pic: MutPtr<InternetCookie> = MutPtr(0L),
            dwStopWarning: UInt = 0u,
            cx: Int = 0,
            cy: Int = 0,
            pszHeader: Pwstr = MutPtr(0L),
            dwOperation: UInt = 0u,
        ): CookieDlgInfo =
            CookieDlgInfo(
                pszServerCtorArg = pszServer,
                picCtorArg = pic,
                dwStopWarning = dwStopWarning,
                cx = cx,
                cy = cy,
                pszHeaderCtorArg = pszHeader,
                dwOperation = dwOperation,
            )
    }
}

public data class CookieDecision(
    public var dwCookieState: UInt = 0u,
    public var fAllowSession: Bool = 0,
)

public class GopherAbstractAttributeType internal constructor(
    shortAbstractCtorArg: MutPtr<Byte>,
    abstractFileCtorArg: MutPtr<Byte>,
) {
    public var shortAbstract: MutPtr<Byte> = shortAbstractCtorArg
        internal set

    public var abstractFile: MutPtr<Byte> = abstractFileCtorArg
        internal set

    public constructor() : this(
        shortAbstractCtorArg = MutPtr(0L),
        abstractFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.shortAbstract

    public operator fun component2(): MutPtr<Byte> = this.abstractFile

    public fun copy(shortAbstract: MutPtr<Byte> = this.shortAbstract, abstractFile: MutPtr<Byte> = this.abstractFile): GopherAbstractAttributeType = GopherAbstractAttributeType(shortAbstractCtorArg = shortAbstract, abstractFileCtorArg = abstractFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherAbstractAttributeType) return false
        if (this.shortAbstract != other.shortAbstract) return false
        if (this.abstractFile != other.abstractFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shortAbstract.hashCode()
        result = 31 * result + this.abstractFile.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAbstractAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAbstractAttributeType> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherAbstractAttributeType =
                    GopherAbstractAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GopherAbstractAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.shortAbstract)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.abstractFile)
                }
            }

        public operator fun invoke(
            shortAbstract: MutPtr<Byte> = MutPtr(0L),
            abstractFile: MutPtr<Byte> = MutPtr(0L),
        ): GopherAbstractAttributeType =
            GopherAbstractAttributeType(
                shortAbstractCtorArg = shortAbstract,
                abstractFileCtorArg = abstractFile,
            )
    }
}

public class GopherAdminAttributeType internal constructor(
    commentCtorArg: MutPtr<Byte>,
    emailAddressCtorArg: MutPtr<Byte>,
) {
    public var comment: MutPtr<Byte> = commentCtorArg
        internal set

    public var emailAddress: MutPtr<Byte> = emailAddressCtorArg
        internal set

    public constructor() : this(
        commentCtorArg = MutPtr(0L),
        emailAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.comment

    public operator fun component2(): MutPtr<Byte> = this.emailAddress

    public fun copy(comment: MutPtr<Byte> = this.comment, emailAddress: MutPtr<Byte> = this.emailAddress): GopherAdminAttributeType = GopherAdminAttributeType(commentCtorArg = comment, emailAddressCtorArg = emailAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherAdminAttributeType) return false
        if (this.comment != other.comment) return false
        if (this.emailAddress != other.emailAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.comment.hashCode()
        result = 31 * result + this.emailAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAdminAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAdminAttributeType> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherAdminAttributeType =
                    GopherAdminAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GopherAdminAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.comment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.emailAddress)
                }
            }

        public operator fun invoke(
            comment: MutPtr<Byte> = MutPtr(0L),
            emailAddress: MutPtr<Byte> = MutPtr(0L),
        ): GopherAdminAttributeType =
            GopherAdminAttributeType(
                commentCtorArg = comment,
                emailAddressCtorArg = emailAddress,
            )
    }
}

public class GopherAskAttributeType internal constructor(
    questionTypeCtorArg: MutPtr<Byte>,
    questionTextCtorArg: MutPtr<Byte>,
) {
    public var questionType: MutPtr<Byte> = questionTypeCtorArg
        internal set

    public var questionText: MutPtr<Byte> = questionTextCtorArg
        internal set

    public constructor() : this(
        questionTypeCtorArg = MutPtr(0L),
        questionTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.questionType

    public operator fun component2(): MutPtr<Byte> = this.questionText

    public fun copy(questionType: MutPtr<Byte> = this.questionType, questionText: MutPtr<Byte> = this.questionText): GopherAskAttributeType = GopherAskAttributeType(questionTypeCtorArg = questionType, questionTextCtorArg = questionText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherAskAttributeType) return false
        if (this.questionType != other.questionType) return false
        if (this.questionText != other.questionText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.questionType.hashCode()
        result = 31 * result + this.questionText.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAskAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherAskAttributeType> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherAskAttributeType =
                    GopherAskAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GopherAskAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.questionType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.questionText)
                }
            }

        public operator fun invoke(
            questionType: MutPtr<Byte> = MutPtr(0L),
            questionText: MutPtr<Byte> = MutPtr(0L),
        ): GopherAskAttributeType =
            GopherAskAttributeType(
                questionTypeCtorArg = questionType,
                questionTextCtorArg = questionText,
            )
    }
}

public data class GopherAttributeType(
    public var categoryId: UInt = 0u,
    public var attributeId: UInt = 0u,
    public var attributeType: GopherAttributeType0 = GopherAttributeType0(),
)

public class GopherAttributeType0(
    public var admin: GopherAdminAttributeType = GopherAdminAttributeType(),
    public var modDate: GopherModDateAttributeType = GopherModDateAttributeType(),
    public var ttl: GopherTtlAttributeType = GopherTtlAttributeType(),
    public var score: GopherScoreAttributeType = GopherScoreAttributeType(),
    public var scoreRange: GopherScoreRangeAttributeType = GopherScoreRangeAttributeType(),
    public var site: GopherSiteAttributeType = GopherSiteAttributeType(),
    public var organization: GopherOrganizationAttributeType = GopherOrganizationAttributeType(),
    public var location: GopherLocationAttributeType = GopherLocationAttributeType(),
    public var geographicalLocation: GopherGeographicalLocationAttributeType = GopherGeographicalLocationAttributeType(),
    public var timeZone: GopherTimezoneAttributeType = GopherTimezoneAttributeType(),
    public var provider: GopherProviderAttributeType = GopherProviderAttributeType(),
    public var version: GopherVersionAttributeType = GopherVersionAttributeType(),
    public var abstract: GopherAbstractAttributeType = GopherAbstractAttributeType(),
    public var view: GopherViewAttributeType = GopherViewAttributeType(),
    public var veronica: GopherVeronicaAttributeType = GopherVeronicaAttributeType(),
    public var ask: GopherAskAttributeType = GopherAskAttributeType(),
    public var unknown: GopherUnknownAttributeType = GopherUnknownAttributeType(),
)

public data class GopherFindDataa(
    public var displayString: ByteArray = ByteArray(129),
    public var gopherType: GopherType = 0u,
    public var sizeLow: UInt = 0u,
    public var sizeHigh: UInt = 0u,
    public var lastModificationTime: Filetime = Filetime(),
    public var locator: ByteArray = ByteArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherFindDataa) return false
        if (!this.displayString.contentEquals(other.displayString)) return false
        if (this.gopherType != other.gopherType) return false
        if (this.sizeLow != other.sizeLow) return false
        if (this.sizeHigh != other.sizeHigh) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (!this.locator.contentEquals(other.locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayString.contentHashCode()
        result = 31 * result + this.gopherType.hashCode()
        result = 31 * result + this.sizeLow.hashCode()
        result = 31 * result + this.sizeHigh.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.locator.contentHashCode()
        return result
    }
}

public data class GopherFindDataw(
    public var displayString: UShortArray = UShortArray(129),
    public var gopherType: GopherType = 0u,
    public var sizeLow: UInt = 0u,
    public var sizeHigh: UInt = 0u,
    public var lastModificationTime: Filetime = Filetime(),
    public var locator: UShortArray = UShortArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherFindDataw) return false
        if (!this.displayString.contentEquals(other.displayString)) return false
        if (this.gopherType != other.gopherType) return false
        if (this.sizeLow != other.sizeLow) return false
        if (this.sizeHigh != other.sizeHigh) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (!this.locator.contentEquals(other.locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayString.contentHashCode()
        result = 31 * result + this.gopherType.hashCode()
        result = 31 * result + this.sizeLow.hashCode()
        result = 31 * result + this.sizeHigh.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.locator.contentHashCode()
        return result
    }
}

public data class GopherGeographicalLocationAttributeType(
    public var degreesNorth: Int = 0,
    public var minutesNorth: Int = 0,
    public var secondsNorth: Int = 0,
    public var degreesEast: Int = 0,
    public var minutesEast: Int = 0,
    public var secondsEast: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherGeographicalLocationAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherGeographicalLocationAttributeType> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GopherGeographicalLocationAttributeType =
                    GopherGeographicalLocationAttributeType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: GopherGeographicalLocationAttributeType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.degreesNorth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minutesNorth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.secondsNorth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.degreesEast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.minutesEast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.secondsEast)
                }
            }
    }
}

public class GopherLocationAttributeType internal constructor(
    locationCtorArg: MutPtr<Byte>,
) {
    public var location: MutPtr<Byte> = locationCtorArg
        internal set

    public constructor() : this(
        locationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.location

    public fun copy(location: MutPtr<Byte> = this.location): GopherLocationAttributeType = GopherLocationAttributeType(locationCtorArg = location)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherLocationAttributeType) return false
        if (this.location != other.location) return false
        return true
    }

    override fun hashCode(): Int = this.location.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherLocationAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherLocationAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherLocationAttributeType =
                    GopherLocationAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherLocationAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.location)
                }
            }

        public operator fun invoke(
            location: MutPtr<Byte> = MutPtr(0L),
        ): GopherLocationAttributeType =
            GopherLocationAttributeType(
                locationCtorArg = location,
            )
    }
}

public data class GopherModDateAttributeType(
    public var dateAndTime: Filetime = Filetime(),
)

public class GopherOrganizationAttributeType internal constructor(
    organizationCtorArg: MutPtr<Byte>,
) {
    public var organization: MutPtr<Byte> = organizationCtorArg
        internal set

    public constructor() : this(
        organizationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.organization

    public fun copy(organization: MutPtr<Byte> = this.organization): GopherOrganizationAttributeType = GopherOrganizationAttributeType(organizationCtorArg = organization)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherOrganizationAttributeType) return false
        if (this.organization != other.organization) return false
        return true
    }

    override fun hashCode(): Int = this.organization.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherOrganizationAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherOrganizationAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherOrganizationAttributeType =
                    GopherOrganizationAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherOrganizationAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.organization)
                }
            }

        public operator fun invoke(
            organization: MutPtr<Byte> = MutPtr(0L),
        ): GopherOrganizationAttributeType =
            GopherOrganizationAttributeType(
                organizationCtorArg = organization,
            )
    }
}

public class GopherProviderAttributeType internal constructor(
    providerCtorArg: MutPtr<Byte>,
) {
    public var provider: MutPtr<Byte> = providerCtorArg
        internal set

    public constructor() : this(
        providerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.provider

    public fun copy(provider: MutPtr<Byte> = this.provider): GopherProviderAttributeType = GopherProviderAttributeType(providerCtorArg = provider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherProviderAttributeType) return false
        if (this.provider != other.provider) return false
        return true
    }

    override fun hashCode(): Int = this.provider.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherProviderAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherProviderAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherProviderAttributeType =
                    GopherProviderAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherProviderAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.provider)
                }
            }

        public operator fun invoke(
            provider: MutPtr<Byte> = MutPtr(0L),
        ): GopherProviderAttributeType =
            GopherProviderAttributeType(
                providerCtorArg = provider,
            )
    }
}

public data class GopherScoreAttributeType(
    public var score: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherScoreAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherScoreAttributeType> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GopherScoreAttributeType =
                    GopherScoreAttributeType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherScoreAttributeType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.score)
                }
            }
    }
}

public data class GopherScoreRangeAttributeType(
    public var lowerBound: Int = 0,
    public var upperBound: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherScoreRangeAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherScoreRangeAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GopherScoreRangeAttributeType =
                    GopherScoreRangeAttributeType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GopherScoreRangeAttributeType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lowerBound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.upperBound)
                }
            }
    }
}

public class GopherSiteAttributeType internal constructor(
    siteCtorArg: MutPtr<Byte>,
) {
    public var site: MutPtr<Byte> = siteCtorArg
        internal set

    public constructor() : this(
        siteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.site

    public fun copy(site: MutPtr<Byte> = this.site): GopherSiteAttributeType = GopherSiteAttributeType(siteCtorArg = site)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherSiteAttributeType) return false
        if (this.site != other.site) return false
        return true
    }

    override fun hashCode(): Int = this.site.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherSiteAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherSiteAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherSiteAttributeType =
                    GopherSiteAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherSiteAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.site)
                }
            }

        public operator fun invoke(
            site: MutPtr<Byte> = MutPtr(0L),
        ): GopherSiteAttributeType =
            GopherSiteAttributeType(
                siteCtorArg = site,
            )
    }
}

public data class GopherTimezoneAttributeType(
    public var zone: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherTimezoneAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherTimezoneAttributeType> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GopherTimezoneAttributeType =
                    GopherTimezoneAttributeType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherTimezoneAttributeType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.zone)
                }
            }
    }
}

public data class GopherTtlAttributeType(
    public var ttl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherTtlAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherTtlAttributeType> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GopherTtlAttributeType =
                    GopherTtlAttributeType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherTtlAttributeType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ttl)
                }
            }
    }
}

public class GopherUnknownAttributeType internal constructor(
    textCtorArg: MutPtr<Byte>,
) {
    public var text: MutPtr<Byte> = textCtorArg
        internal set

    public constructor() : this(
        textCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.text

    public fun copy(text: MutPtr<Byte> = this.text): GopherUnknownAttributeType = GopherUnknownAttributeType(textCtorArg = text)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherUnknownAttributeType) return false
        if (this.text != other.text) return false
        return true
    }

    override fun hashCode(): Int = this.text.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherUnknownAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherUnknownAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherUnknownAttributeType =
                    GopherUnknownAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherUnknownAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.text)
                }
            }

        public operator fun invoke(
            text: MutPtr<Byte> = MutPtr(0L),
        ): GopherUnknownAttributeType =
            GopherUnknownAttributeType(
                textCtorArg = text,
            )
    }
}

public data class GopherVeronicaAttributeType(
    public var treeWalk: Bool = 0,
)

public class GopherVersionAttributeType internal constructor(
    versionCtorArg: MutPtr<Byte>,
) {
    public var version: MutPtr<Byte> = versionCtorArg
        internal set

    public constructor() : this(
        versionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.version

    public fun copy(version: MutPtr<Byte> = this.version): GopherVersionAttributeType = GopherVersionAttributeType(versionCtorArg = version)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherVersionAttributeType) return false
        if (this.version != other.version) return false
        return true
    }

    override fun hashCode(): Int = this.version.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherVersionAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherVersionAttributeType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherVersionAttributeType =
                    GopherVersionAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GopherVersionAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.version)
                }
            }

        public operator fun invoke(
            version: MutPtr<Byte> = MutPtr(0L),
        ): GopherVersionAttributeType =
            GopherVersionAttributeType(
                versionCtorArg = version,
            )
    }
}

public class GopherViewAttributeType internal constructor(
    contentTypeCtorArg: MutPtr<Byte>,
    languageCtorArg: MutPtr<Byte>,
    public var size: UInt,
) {
    public var contentType: MutPtr<Byte> = contentTypeCtorArg
        internal set

    public var language: MutPtr<Byte> = languageCtorArg
        internal set

    public constructor() : this(
        contentTypeCtorArg = MutPtr(0L),
        languageCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Byte> = this.contentType

    public operator fun component2(): MutPtr<Byte> = this.language

    public operator fun component3(): UInt = this.size

    public fun copy(contentType: MutPtr<Byte> = this.contentType, language: MutPtr<Byte> = this.language, size: UInt = this.size): GopherViewAttributeType = GopherViewAttributeType(contentTypeCtorArg = contentType, languageCtorArg = language, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherViewAttributeType) return false
        if (this.contentType != other.contentType) return false
        if (this.language != other.language) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contentType.hashCode()
        result = 31 * result + this.language.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherViewAttributeType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GopherViewAttributeType> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GopherViewAttributeType =
                    GopherViewAttributeType(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: GopherViewAttributeType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.contentType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.language)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                }
            }

        public operator fun invoke(
            contentType: MutPtr<Byte> = MutPtr(0L),
            language: MutPtr<Byte> = MutPtr(0L),
            size: UInt = 0u,
        ): GopherViewAttributeType =
            GopherViewAttributeType(
                contentTypeCtorArg = contentType,
                languageCtorArg = language,
                size = size,
            )
    }
}

public data class HttpPushNotificationStatus(
    public var channelStatusValid: Bool = 0,
    public var channelStatus: UInt = 0u,
)

public data class HttpPushTransportSetting(
    public var transportSettingId: Guid = Guid(),
    public var brokerEventId: Guid = Guid(),
)

public data class HttpRequestTimes(
    public var cTimes: UInt = 0u,
    public var rgTimes: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestTimes) return false
        if (this.cTimes != other.cTimes) return false
        if (!this.rgTimes.contentEquals(other.rgTimes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTimes.hashCode()
        result = 31 * result + this.rgTimes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTimes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpRequestTimes> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HttpRequestTimes =
                    HttpRequestTimes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HttpRequestTimes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTimes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 8L, value.rgTimes)
                }
            }
    }
}

public data class HttpWebSocketAsyncResult(
    public var asyncResult: InternetAsyncResult = InternetAsyncResult(),
    public var operation: HttpWebSocketOperation = 0,
    public var bufferType: HttpWebSocketBufferType = 0,
    public var dwBytesTransferred: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpWebSocketAsyncResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HttpWebSocketAsyncResult> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HttpWebSocketAsyncResult =
                    HttpWebSocketAsyncResult(
                        (InternetAsyncResult.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: HttpWebSocketAsyncResult) {
                    (InternetAsyncResult.typeLayout()).writeNative(addr, value.asyncResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.bufferType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBytesTransferred)
                }
            }
    }
}

public data class InternetAsyncResult(
    public var dwResult: Int = 0,
    public var dwError: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetAsyncResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetAsyncResult> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InternetAsyncResult =
                    InternetAsyncResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InternetAsyncResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                }
            }
    }
}

public data class InternetAuthNotifyData(
    public var cbStruct: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var pfnNotify: PfnAuthNotify = null,
    public var dwContext: Int = 0,
)

public class InternetBuffersa internal constructor(
    public var dwStructSize: UInt,
    nextCtorArg: MutPtr<InternetBuffersa>,
    lpcszHeaderCtorArg: Pcstr,
    public var dwHeadersLength: UInt,
    public var dwHeadersTotal: UInt,
    lpvBufferCtorArg: MutPtr<CVoid>,
    public var dwBufferLength: UInt,
    public var dwBufferTotal: UInt,
    public var dwOffsetLow: UInt,
    public var dwOffsetHigh: UInt,
) {
    public var next: MutPtr<InternetBuffersa> = nextCtorArg
        internal set

    public var lpcszHeader: Pcstr = lpcszHeaderCtorArg
        internal set

    public var lpvBuffer: MutPtr<CVoid> = lpvBufferCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        nextCtorArg = MutPtr(0L),
        lpcszHeaderCtorArg = ConstPtr(0L),
        dwHeadersLength = 0u,
        dwHeadersTotal = 0u,
        lpvBufferCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
        dwBufferTotal = 0u,
        dwOffsetLow = 0u,
        dwOffsetHigh = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): MutPtr<InternetBuffersa> = this.next

    public operator fun component3(): Pcstr = this.lpcszHeader

    public operator fun component4(): UInt = this.dwHeadersLength

    public operator fun component5(): UInt = this.dwHeadersTotal

    public operator fun component6(): MutPtr<CVoid> = this.lpvBuffer

    public operator fun component7(): UInt = this.dwBufferLength

    public operator fun component8(): UInt = this.dwBufferTotal

    public operator fun component9(): UInt = this.dwOffsetLow

    public operator fun component10(): UInt = this.dwOffsetHigh

    public fun copy(dwStructSize: UInt = this.dwStructSize, next: MutPtr<InternetBuffersa> = this.next, lpcszHeader: Pcstr = this.lpcszHeader, dwHeadersLength: UInt = this.dwHeadersLength, dwHeadersTotal: UInt = this.dwHeadersTotal, lpvBuffer: MutPtr<CVoid> = this.lpvBuffer, dwBufferLength: UInt = this.dwBufferLength, dwBufferTotal: UInt = this.dwBufferTotal, dwOffsetLow: UInt = this.dwOffsetLow, dwOffsetHigh: UInt = this.dwOffsetHigh): InternetBuffersa = InternetBuffersa(dwStructSize = dwStructSize, nextCtorArg = next, lpcszHeaderCtorArg = lpcszHeader, dwHeadersLength = dwHeadersLength, dwHeadersTotal = dwHeadersTotal, lpvBufferCtorArg = lpvBuffer, dwBufferLength = dwBufferLength, dwBufferTotal = dwBufferTotal, dwOffsetLow = dwOffsetLow, dwOffsetHigh = dwOffsetHigh)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetBuffersa) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.next != other.next) return false
        if (this.lpcszHeader != other.lpcszHeader) return false
        if (this.dwHeadersLength != other.dwHeadersLength) return false
        if (this.dwHeadersTotal != other.dwHeadersTotal) return false
        if (this.lpvBuffer != other.lpvBuffer) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBufferTotal != other.dwBufferTotal) return false
        if (this.dwOffsetLow != other.dwOffsetLow) return false
        if (this.dwOffsetHigh != other.dwOffsetHigh) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.lpcszHeader.hashCode()
        result = 31 * result + this.dwHeadersLength.hashCode()
        result = 31 * result + this.dwHeadersTotal.hashCode()
        result = 31 * result + this.lpvBuffer.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBufferTotal.hashCode()
        result = 31 * result + this.dwOffsetLow.hashCode()
        result = 31 * result + this.dwOffsetHigh.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            next: MutPtr<InternetBuffersa> = MutPtr(0L),
            lpcszHeader: Pcstr = ConstPtr(0L),
            dwHeadersLength: UInt = 0u,
            dwHeadersTotal: UInt = 0u,
            lpvBuffer: MutPtr<CVoid> = MutPtr(0L),
            dwBufferLength: UInt = 0u,
            dwBufferTotal: UInt = 0u,
            dwOffsetLow: UInt = 0u,
            dwOffsetHigh: UInt = 0u,
        ): InternetBuffersa =
            InternetBuffersa(
                dwStructSize = dwStructSize,
                nextCtorArg = next,
                lpcszHeaderCtorArg = lpcszHeader,
                dwHeadersLength = dwHeadersLength,
                dwHeadersTotal = dwHeadersTotal,
                lpvBufferCtorArg = lpvBuffer,
                dwBufferLength = dwBufferLength,
                dwBufferTotal = dwBufferTotal,
                dwOffsetLow = dwOffsetLow,
                dwOffsetHigh = dwOffsetHigh,
            )
    }
}

public class InternetBuffersw internal constructor(
    public var dwStructSize: UInt,
    nextCtorArg: MutPtr<InternetBuffersw>,
    lpcszHeaderCtorArg: Pcwstr,
    public var dwHeadersLength: UInt,
    public var dwHeadersTotal: UInt,
    lpvBufferCtorArg: MutPtr<CVoid>,
    public var dwBufferLength: UInt,
    public var dwBufferTotal: UInt,
    public var dwOffsetLow: UInt,
    public var dwOffsetHigh: UInt,
) {
    public var next: MutPtr<InternetBuffersw> = nextCtorArg
        internal set

    public var lpcszHeader: Pcwstr = lpcszHeaderCtorArg
        internal set

    public var lpvBuffer: MutPtr<CVoid> = lpvBufferCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        nextCtorArg = MutPtr(0L),
        lpcszHeaderCtorArg = ConstPtr(0L),
        dwHeadersLength = 0u,
        dwHeadersTotal = 0u,
        lpvBufferCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
        dwBufferTotal = 0u,
        dwOffsetLow = 0u,
        dwOffsetHigh = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): MutPtr<InternetBuffersw> = this.next

    public operator fun component3(): Pcwstr = this.lpcszHeader

    public operator fun component4(): UInt = this.dwHeadersLength

    public operator fun component5(): UInt = this.dwHeadersTotal

    public operator fun component6(): MutPtr<CVoid> = this.lpvBuffer

    public operator fun component7(): UInt = this.dwBufferLength

    public operator fun component8(): UInt = this.dwBufferTotal

    public operator fun component9(): UInt = this.dwOffsetLow

    public operator fun component10(): UInt = this.dwOffsetHigh

    public fun copy(dwStructSize: UInt = this.dwStructSize, next: MutPtr<InternetBuffersw> = this.next, lpcszHeader: Pcwstr = this.lpcszHeader, dwHeadersLength: UInt = this.dwHeadersLength, dwHeadersTotal: UInt = this.dwHeadersTotal, lpvBuffer: MutPtr<CVoid> = this.lpvBuffer, dwBufferLength: UInt = this.dwBufferLength, dwBufferTotal: UInt = this.dwBufferTotal, dwOffsetLow: UInt = this.dwOffsetLow, dwOffsetHigh: UInt = this.dwOffsetHigh): InternetBuffersw = InternetBuffersw(dwStructSize = dwStructSize, nextCtorArg = next, lpcszHeaderCtorArg = lpcszHeader, dwHeadersLength = dwHeadersLength, dwHeadersTotal = dwHeadersTotal, lpvBufferCtorArg = lpvBuffer, dwBufferLength = dwBufferLength, dwBufferTotal = dwBufferTotal, dwOffsetLow = dwOffsetLow, dwOffsetHigh = dwOffsetHigh)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetBuffersw) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.next != other.next) return false
        if (this.lpcszHeader != other.lpcszHeader) return false
        if (this.dwHeadersLength != other.dwHeadersLength) return false
        if (this.dwHeadersTotal != other.dwHeadersTotal) return false
        if (this.lpvBuffer != other.lpvBuffer) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBufferTotal != other.dwBufferTotal) return false
        if (this.dwOffsetLow != other.dwOffsetLow) return false
        if (this.dwOffsetHigh != other.dwOffsetHigh) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.lpcszHeader.hashCode()
        result = 31 * result + this.dwHeadersLength.hashCode()
        result = 31 * result + this.dwHeadersTotal.hashCode()
        result = 31 * result + this.lpvBuffer.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBufferTotal.hashCode()
        result = 31 * result + this.dwOffsetLow.hashCode()
        result = 31 * result + this.dwOffsetHigh.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            next: MutPtr<InternetBuffersw> = MutPtr(0L),
            lpcszHeader: Pcwstr = ConstPtr(0L),
            dwHeadersLength: UInt = 0u,
            dwHeadersTotal: UInt = 0u,
            lpvBuffer: MutPtr<CVoid> = MutPtr(0L),
            dwBufferLength: UInt = 0u,
            dwBufferTotal: UInt = 0u,
            dwOffsetLow: UInt = 0u,
            dwOffsetHigh: UInt = 0u,
        ): InternetBuffersw =
            InternetBuffersw(
                dwStructSize = dwStructSize,
                nextCtorArg = next,
                lpcszHeaderCtorArg = lpcszHeader,
                dwHeadersLength = dwHeadersLength,
                dwHeadersTotal = dwHeadersTotal,
                lpvBufferCtorArg = lpvBuffer,
                dwBufferLength = dwBufferLength,
                dwBufferTotal = dwBufferTotal,
                dwOffsetLow = dwOffsetLow,
                dwOffsetHigh = dwOffsetHigh,
            )
    }
}

public data class InternetCacheConfigInfoa(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: Bool = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var anonymous: InternetCacheConfigInfoa0 = InternetCacheConfigInfoa0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class InternetCacheConfigInfoa0(
    public var anonymous: InternetCacheConfigInfoa00 = InternetCacheConfigInfoa00(),
    public var cachePaths: List<InternetCacheConfigPathEntrya> = List(1) { InternetCacheConfigPathEntrya() },
)

public data class InternetCacheConfigInfoa00(
    public var cachePath: ByteArray = ByteArray(260),
    public var dwCacheSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigInfoa00) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigInfoa00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigInfoa00> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheConfigInfoa00 =
                    InternetCacheConfigInfoa00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheConfigInfoa00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr, value.cachePath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.dwCacheSize)
                }
            }
    }
}

public data class InternetCacheConfigInfow(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: Bool = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var anonymous: InternetCacheConfigInfow0 = InternetCacheConfigInfow0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class InternetCacheConfigInfow0(
    public var anonymous: InternetCacheConfigInfow00 = InternetCacheConfigInfow00(),
    public var cachePaths: List<InternetCacheConfigPathEntryw> = List(1) { InternetCacheConfigPathEntryw() },
)

public data class InternetCacheConfigInfow00(
    public var cachePath: UShortArray = UShortArray(260),
    public var dwCacheSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigInfow00) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigInfow00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigInfow00> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheConfigInfow00 =
                    InternetCacheConfigInfow00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheConfigInfow00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.cachePath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwCacheSize)
                }
            }
    }
}

public data class InternetCacheConfigPathEntrya(
    public var cachePath: ByteArray = ByteArray(260),
    public var dwCacheSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigPathEntrya) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigPathEntrya> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigPathEntrya> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheConfigPathEntrya =
                    InternetCacheConfigPathEntrya(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheConfigPathEntrya) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr, value.cachePath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.dwCacheSize)
                }
            }
    }
}

public data class InternetCacheConfigPathEntryw(
    public var cachePath: UShortArray = UShortArray(260),
    public var dwCacheSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigPathEntryw) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigPathEntryw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheConfigPathEntryw> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheConfigPathEntryw =
                    InternetCacheConfigPathEntryw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheConfigPathEntryw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.cachePath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwCacheSize)
                }
            }
    }
}

public class InternetCacheContainerInfoa internal constructor(
    public var dwCacheVersion: UInt,
    lpszNameCtorArg: Pstr,
    lpszCachePrefixCtorArg: Pstr,
    lpszVolumeLabelCtorArg: Pstr,
    lpszVolumeTitleCtorArg: Pstr,
) {
    public var lpszName: Pstr = lpszNameCtorArg
        internal set

    public var lpszCachePrefix: Pstr = lpszCachePrefixCtorArg
        internal set

    public var lpszVolumeLabel: Pstr = lpszVolumeLabelCtorArg
        internal set

    public var lpszVolumeTitle: Pstr = lpszVolumeTitleCtorArg
        internal set

    public constructor() : this(
        dwCacheVersion = 0u,
        lpszNameCtorArg = MutPtr(0L),
        lpszCachePrefixCtorArg = MutPtr(0L),
        lpszVolumeLabelCtorArg = MutPtr(0L),
        lpszVolumeTitleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCacheVersion

    public operator fun component2(): Pstr = this.lpszName

    public operator fun component3(): Pstr = this.lpszCachePrefix

    public operator fun component4(): Pstr = this.lpszVolumeLabel

    public operator fun component5(): Pstr = this.lpszVolumeTitle

    public fun copy(dwCacheVersion: UInt = this.dwCacheVersion, lpszName: Pstr = this.lpszName, lpszCachePrefix: Pstr = this.lpszCachePrefix, lpszVolumeLabel: Pstr = this.lpszVolumeLabel, lpszVolumeTitle: Pstr = this.lpszVolumeTitle): InternetCacheContainerInfoa = InternetCacheContainerInfoa(dwCacheVersion = dwCacheVersion, lpszNameCtorArg = lpszName, lpszCachePrefixCtorArg = lpszCachePrefix, lpszVolumeLabelCtorArg = lpszVolumeLabel, lpszVolumeTitleCtorArg = lpszVolumeTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheContainerInfoa) return false
        if (this.dwCacheVersion != other.dwCacheVersion) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszCachePrefix != other.lpszCachePrefix) return false
        if (this.lpszVolumeLabel != other.lpszVolumeLabel) return false
        if (this.lpszVolumeTitle != other.lpszVolumeTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCacheVersion.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszCachePrefix.hashCode()
        result = 31 * result + this.lpszVolumeLabel.hashCode()
        result = 31 * result + this.lpszVolumeTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCacheVersion: UInt = 0u,
            lpszName: Pstr = MutPtr(0L),
            lpszCachePrefix: Pstr = MutPtr(0L),
            lpszVolumeLabel: Pstr = MutPtr(0L),
            lpszVolumeTitle: Pstr = MutPtr(0L),
        ): InternetCacheContainerInfoa =
            InternetCacheContainerInfoa(
                dwCacheVersion = dwCacheVersion,
                lpszNameCtorArg = lpszName,
                lpszCachePrefixCtorArg = lpszCachePrefix,
                lpszVolumeLabelCtorArg = lpszVolumeLabel,
                lpszVolumeTitleCtorArg = lpszVolumeTitle,
            )
    }
}

public class InternetCacheContainerInfow internal constructor(
    public var dwCacheVersion: UInt,
    lpszNameCtorArg: Pwstr,
    lpszCachePrefixCtorArg: Pwstr,
    lpszVolumeLabelCtorArg: Pwstr,
    lpszVolumeTitleCtorArg: Pwstr,
) {
    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public var lpszCachePrefix: Pwstr = lpszCachePrefixCtorArg
        internal set

    public var lpszVolumeLabel: Pwstr = lpszVolumeLabelCtorArg
        internal set

    public var lpszVolumeTitle: Pwstr = lpszVolumeTitleCtorArg
        internal set

    public constructor() : this(
        dwCacheVersion = 0u,
        lpszNameCtorArg = MutPtr(0L),
        lpszCachePrefixCtorArg = MutPtr(0L),
        lpszVolumeLabelCtorArg = MutPtr(0L),
        lpszVolumeTitleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCacheVersion

    public operator fun component2(): Pwstr = this.lpszName

    public operator fun component3(): Pwstr = this.lpszCachePrefix

    public operator fun component4(): Pwstr = this.lpszVolumeLabel

    public operator fun component5(): Pwstr = this.lpszVolumeTitle

    public fun copy(dwCacheVersion: UInt = this.dwCacheVersion, lpszName: Pwstr = this.lpszName, lpszCachePrefix: Pwstr = this.lpszCachePrefix, lpszVolumeLabel: Pwstr = this.lpszVolumeLabel, lpszVolumeTitle: Pwstr = this.lpszVolumeTitle): InternetCacheContainerInfow = InternetCacheContainerInfow(dwCacheVersion = dwCacheVersion, lpszNameCtorArg = lpszName, lpszCachePrefixCtorArg = lpszCachePrefix, lpszVolumeLabelCtorArg = lpszVolumeLabel, lpszVolumeTitleCtorArg = lpszVolumeTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheContainerInfow) return false
        if (this.dwCacheVersion != other.dwCacheVersion) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszCachePrefix != other.lpszCachePrefix) return false
        if (this.lpszVolumeLabel != other.lpszVolumeLabel) return false
        if (this.lpszVolumeTitle != other.lpszVolumeTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCacheVersion.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszCachePrefix.hashCode()
        result = 31 * result + this.lpszVolumeLabel.hashCode()
        result = 31 * result + this.lpszVolumeTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCacheVersion: UInt = 0u,
            lpszName: Pwstr = MutPtr(0L),
            lpszCachePrefix: Pwstr = MutPtr(0L),
            lpszVolumeLabel: Pwstr = MutPtr(0L),
            lpszVolumeTitle: Pwstr = MutPtr(0L),
        ): InternetCacheContainerInfow =
            InternetCacheContainerInfow(
                dwCacheVersion = dwCacheVersion,
                lpszNameCtorArg = lpszName,
                lpszCachePrefixCtorArg = lpszCachePrefix,
                lpszVolumeLabelCtorArg = lpszVolumeLabel,
                lpszVolumeTitleCtorArg = lpszVolumeTitle,
            )
    }
}

public class InternetCacheEntryInfoa internal constructor(
    public var dwStructSize: UInt,
    lpszSourceUrlNameCtorArg: Pstr,
    lpszLocalFileNameCtorArg: Pstr,
    public var cacheEntryType: UInt,
    public var dwUseCount: UInt,
    public var dwHitRate: UInt,
    public var dwSizeLow: UInt,
    public var dwSizeHigh: UInt,
    public var lastModifiedTime: Filetime,
    public var expireTime: Filetime,
    public var lastAccessTime: Filetime,
    public var lastSyncTime: Filetime,
    lpHeaderInfoCtorArg: Pstr,
    public var dwHeaderInfoSize: UInt,
    lpszFileExtensionCtorArg: Pstr,
    public var anonymous: InternetCacheEntryInfoa0,
) {
    public var lpszSourceUrlName: Pstr = lpszSourceUrlNameCtorArg
        internal set

    public var lpszLocalFileName: Pstr = lpszLocalFileNameCtorArg
        internal set

    public var lpHeaderInfo: Pstr = lpHeaderInfoCtorArg
        internal set

    public var lpszFileExtension: Pstr = lpszFileExtensionCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpszSourceUrlNameCtorArg = MutPtr(0L),
        lpszLocalFileNameCtorArg = MutPtr(0L),
        cacheEntryType = 0u,
        dwUseCount = 0u,
        dwHitRate = 0u,
        dwSizeLow = 0u,
        dwSizeHigh = 0u,
        lastModifiedTime = Filetime(),
        expireTime = Filetime(),
        lastAccessTime = Filetime(),
        lastSyncTime = Filetime(),
        lpHeaderInfoCtorArg = MutPtr(0L),
        dwHeaderInfoSize = 0u,
        lpszFileExtensionCtorArg = MutPtr(0L),
        anonymous = InternetCacheEntryInfoa0(),
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pstr = this.lpszSourceUrlName

    public operator fun component3(): Pstr = this.lpszLocalFileName

    public operator fun component4(): UInt = this.cacheEntryType

    public operator fun component5(): UInt = this.dwUseCount

    public operator fun component6(): UInt = this.dwHitRate

    public operator fun component7(): UInt = this.dwSizeLow

    public operator fun component8(): UInt = this.dwSizeHigh

    public operator fun component9(): Filetime = this.lastModifiedTime

    public operator fun component10(): Filetime = this.expireTime

    public operator fun component11(): Filetime = this.lastAccessTime

    public operator fun component12(): Filetime = this.lastSyncTime

    public operator fun component13(): Pstr = this.lpHeaderInfo

    public operator fun component14(): UInt = this.dwHeaderInfoSize

    public operator fun component15(): Pstr = this.lpszFileExtension

    public operator fun component16(): InternetCacheEntryInfoa0 = this.anonymous

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszSourceUrlName: Pstr = this.lpszSourceUrlName, lpszLocalFileName: Pstr = this.lpszLocalFileName, cacheEntryType: UInt = this.cacheEntryType, dwUseCount: UInt = this.dwUseCount, dwHitRate: UInt = this.dwHitRate, dwSizeLow: UInt = this.dwSizeLow, dwSizeHigh: UInt = this.dwSizeHigh, lastModifiedTime: Filetime = this.lastModifiedTime, expireTime: Filetime = this.expireTime, lastAccessTime: Filetime = this.lastAccessTime, lastSyncTime: Filetime = this.lastSyncTime, lpHeaderInfo: Pstr = this.lpHeaderInfo, dwHeaderInfoSize: UInt = this.dwHeaderInfoSize, lpszFileExtension: Pstr = this.lpszFileExtension, anonymous: InternetCacheEntryInfoa0 = this.anonymous): InternetCacheEntryInfoa = InternetCacheEntryInfoa(dwStructSize = dwStructSize, lpszSourceUrlNameCtorArg = lpszSourceUrlName, lpszLocalFileNameCtorArg = lpszLocalFileName, cacheEntryType = cacheEntryType, dwUseCount = dwUseCount, dwHitRate = dwHitRate, dwSizeLow = dwSizeLow, dwSizeHigh = dwSizeHigh, lastModifiedTime = lastModifiedTime, expireTime = expireTime, lastAccessTime = lastAccessTime, lastSyncTime = lastSyncTime, lpHeaderInfoCtorArg = lpHeaderInfo, dwHeaderInfoSize = dwHeaderInfoSize, lpszFileExtensionCtorArg = lpszFileExtension, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheEntryInfoa) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpszSourceUrlName != other.lpszSourceUrlName) return false
        if (this.lpszLocalFileName != other.lpszLocalFileName) return false
        if (this.cacheEntryType != other.cacheEntryType) return false
        if (this.dwUseCount != other.dwUseCount) return false
        if (this.dwHitRate != other.dwHitRate) return false
        if (this.dwSizeLow != other.dwSizeLow) return false
        if (this.dwSizeHigh != other.dwSizeHigh) return false
        if (this.lastModifiedTime != other.lastModifiedTime) return false
        if (this.expireTime != other.expireTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastSyncTime != other.lastSyncTime) return false
        if (this.lpHeaderInfo != other.lpHeaderInfo) return false
        if (this.dwHeaderInfoSize != other.dwHeaderInfoSize) return false
        if (this.lpszFileExtension != other.lpszFileExtension) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpszSourceUrlName.hashCode()
        result = 31 * result + this.lpszLocalFileName.hashCode()
        result = 31 * result + this.cacheEntryType.hashCode()
        result = 31 * result + this.dwUseCount.hashCode()
        result = 31 * result + this.dwHitRate.hashCode()
        result = 31 * result + this.dwSizeLow.hashCode()
        result = 31 * result + this.dwSizeHigh.hashCode()
        result = 31 * result + this.lastModifiedTime.hashCode()
        result = 31 * result + this.expireTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastSyncTime.hashCode()
        result = 31 * result + this.lpHeaderInfo.hashCode()
        result = 31 * result + this.dwHeaderInfoSize.hashCode()
        result = 31 * result + this.lpszFileExtension.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpszSourceUrlName: Pstr = MutPtr(0L),
            lpszLocalFileName: Pstr = MutPtr(0L),
            cacheEntryType: UInt = 0u,
            dwUseCount: UInt = 0u,
            dwHitRate: UInt = 0u,
            dwSizeLow: UInt = 0u,
            dwSizeHigh: UInt = 0u,
            lastModifiedTime: Filetime = Filetime(),
            expireTime: Filetime = Filetime(),
            lastAccessTime: Filetime = Filetime(),
            lastSyncTime: Filetime = Filetime(),
            lpHeaderInfo: Pstr = MutPtr(0L),
            dwHeaderInfoSize: UInt = 0u,
            lpszFileExtension: Pstr = MutPtr(0L),
            anonymous: InternetCacheEntryInfoa0 = InternetCacheEntryInfoa0(),
        ): InternetCacheEntryInfoa =
            InternetCacheEntryInfoa(
                dwStructSize = dwStructSize,
                lpszSourceUrlNameCtorArg = lpszSourceUrlName,
                lpszLocalFileNameCtorArg = lpszLocalFileName,
                cacheEntryType = cacheEntryType,
                dwUseCount = dwUseCount,
                dwHitRate = dwHitRate,
                dwSizeLow = dwSizeLow,
                dwSizeHigh = dwSizeHigh,
                lastModifiedTime = lastModifiedTime,
                expireTime = expireTime,
                lastAccessTime = lastAccessTime,
                lastSyncTime = lastSyncTime,
                lpHeaderInfoCtorArg = lpHeaderInfo,
                dwHeaderInfoSize = dwHeaderInfoSize,
                lpszFileExtensionCtorArg = lpszFileExtension,
                anonymous = anonymous,
            )
    }
}

public data class InternetCacheEntryInfoa0(
    public var dwReserved: UInt = 0u,
    public var dwExemptDelta: UInt = 0u,
)

public class InternetCacheEntryInfow internal constructor(
    public var dwStructSize: UInt,
    lpszSourceUrlNameCtorArg: Pwstr,
    lpszLocalFileNameCtorArg: Pwstr,
    public var cacheEntryType: UInt,
    public var dwUseCount: UInt,
    public var dwHitRate: UInt,
    public var dwSizeLow: UInt,
    public var dwSizeHigh: UInt,
    public var lastModifiedTime: Filetime,
    public var expireTime: Filetime,
    public var lastAccessTime: Filetime,
    public var lastSyncTime: Filetime,
    lpHeaderInfoCtorArg: Pwstr,
    public var dwHeaderInfoSize: UInt,
    lpszFileExtensionCtorArg: Pwstr,
    public var anonymous: InternetCacheEntryInfow0,
) {
    public var lpszSourceUrlName: Pwstr = lpszSourceUrlNameCtorArg
        internal set

    public var lpszLocalFileName: Pwstr = lpszLocalFileNameCtorArg
        internal set

    public var lpHeaderInfo: Pwstr = lpHeaderInfoCtorArg
        internal set

    public var lpszFileExtension: Pwstr = lpszFileExtensionCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpszSourceUrlNameCtorArg = MutPtr(0L),
        lpszLocalFileNameCtorArg = MutPtr(0L),
        cacheEntryType = 0u,
        dwUseCount = 0u,
        dwHitRate = 0u,
        dwSizeLow = 0u,
        dwSizeHigh = 0u,
        lastModifiedTime = Filetime(),
        expireTime = Filetime(),
        lastAccessTime = Filetime(),
        lastSyncTime = Filetime(),
        lpHeaderInfoCtorArg = MutPtr(0L),
        dwHeaderInfoSize = 0u,
        lpszFileExtensionCtorArg = MutPtr(0L),
        anonymous = InternetCacheEntryInfow0(),
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pwstr = this.lpszSourceUrlName

    public operator fun component3(): Pwstr = this.lpszLocalFileName

    public operator fun component4(): UInt = this.cacheEntryType

    public operator fun component5(): UInt = this.dwUseCount

    public operator fun component6(): UInt = this.dwHitRate

    public operator fun component7(): UInt = this.dwSizeLow

    public operator fun component8(): UInt = this.dwSizeHigh

    public operator fun component9(): Filetime = this.lastModifiedTime

    public operator fun component10(): Filetime = this.expireTime

    public operator fun component11(): Filetime = this.lastAccessTime

    public operator fun component12(): Filetime = this.lastSyncTime

    public operator fun component13(): Pwstr = this.lpHeaderInfo

    public operator fun component14(): UInt = this.dwHeaderInfoSize

    public operator fun component15(): Pwstr = this.lpszFileExtension

    public operator fun component16(): InternetCacheEntryInfow0 = this.anonymous

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszSourceUrlName: Pwstr = this.lpszSourceUrlName, lpszLocalFileName: Pwstr = this.lpszLocalFileName, cacheEntryType: UInt = this.cacheEntryType, dwUseCount: UInt = this.dwUseCount, dwHitRate: UInt = this.dwHitRate, dwSizeLow: UInt = this.dwSizeLow, dwSizeHigh: UInt = this.dwSizeHigh, lastModifiedTime: Filetime = this.lastModifiedTime, expireTime: Filetime = this.expireTime, lastAccessTime: Filetime = this.lastAccessTime, lastSyncTime: Filetime = this.lastSyncTime, lpHeaderInfo: Pwstr = this.lpHeaderInfo, dwHeaderInfoSize: UInt = this.dwHeaderInfoSize, lpszFileExtension: Pwstr = this.lpszFileExtension, anonymous: InternetCacheEntryInfow0 = this.anonymous): InternetCacheEntryInfow = InternetCacheEntryInfow(dwStructSize = dwStructSize, lpszSourceUrlNameCtorArg = lpszSourceUrlName, lpszLocalFileNameCtorArg = lpszLocalFileName, cacheEntryType = cacheEntryType, dwUseCount = dwUseCount, dwHitRate = dwHitRate, dwSizeLow = dwSizeLow, dwSizeHigh = dwSizeHigh, lastModifiedTime = lastModifiedTime, expireTime = expireTime, lastAccessTime = lastAccessTime, lastSyncTime = lastSyncTime, lpHeaderInfoCtorArg = lpHeaderInfo, dwHeaderInfoSize = dwHeaderInfoSize, lpszFileExtensionCtorArg = lpszFileExtension, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheEntryInfow) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpszSourceUrlName != other.lpszSourceUrlName) return false
        if (this.lpszLocalFileName != other.lpszLocalFileName) return false
        if (this.cacheEntryType != other.cacheEntryType) return false
        if (this.dwUseCount != other.dwUseCount) return false
        if (this.dwHitRate != other.dwHitRate) return false
        if (this.dwSizeLow != other.dwSizeLow) return false
        if (this.dwSizeHigh != other.dwSizeHigh) return false
        if (this.lastModifiedTime != other.lastModifiedTime) return false
        if (this.expireTime != other.expireTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastSyncTime != other.lastSyncTime) return false
        if (this.lpHeaderInfo != other.lpHeaderInfo) return false
        if (this.dwHeaderInfoSize != other.dwHeaderInfoSize) return false
        if (this.lpszFileExtension != other.lpszFileExtension) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpszSourceUrlName.hashCode()
        result = 31 * result + this.lpszLocalFileName.hashCode()
        result = 31 * result + this.cacheEntryType.hashCode()
        result = 31 * result + this.dwUseCount.hashCode()
        result = 31 * result + this.dwHitRate.hashCode()
        result = 31 * result + this.dwSizeLow.hashCode()
        result = 31 * result + this.dwSizeHigh.hashCode()
        result = 31 * result + this.lastModifiedTime.hashCode()
        result = 31 * result + this.expireTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastSyncTime.hashCode()
        result = 31 * result + this.lpHeaderInfo.hashCode()
        result = 31 * result + this.dwHeaderInfoSize.hashCode()
        result = 31 * result + this.lpszFileExtension.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpszSourceUrlName: Pwstr = MutPtr(0L),
            lpszLocalFileName: Pwstr = MutPtr(0L),
            cacheEntryType: UInt = 0u,
            dwUseCount: UInt = 0u,
            dwHitRate: UInt = 0u,
            dwSizeLow: UInt = 0u,
            dwSizeHigh: UInt = 0u,
            lastModifiedTime: Filetime = Filetime(),
            expireTime: Filetime = Filetime(),
            lastAccessTime: Filetime = Filetime(),
            lastSyncTime: Filetime = Filetime(),
            lpHeaderInfo: Pwstr = MutPtr(0L),
            dwHeaderInfoSize: UInt = 0u,
            lpszFileExtension: Pwstr = MutPtr(0L),
            anonymous: InternetCacheEntryInfow0 = InternetCacheEntryInfow0(),
        ): InternetCacheEntryInfow =
            InternetCacheEntryInfow(
                dwStructSize = dwStructSize,
                lpszSourceUrlNameCtorArg = lpszSourceUrlName,
                lpszLocalFileNameCtorArg = lpszLocalFileName,
                cacheEntryType = cacheEntryType,
                dwUseCount = dwUseCount,
                dwHitRate = dwHitRate,
                dwSizeLow = dwSizeLow,
                dwSizeHigh = dwSizeHigh,
                lastModifiedTime = lastModifiedTime,
                expireTime = expireTime,
                lastAccessTime = lastAccessTime,
                lastSyncTime = lastSyncTime,
                lpHeaderInfoCtorArg = lpHeaderInfo,
                dwHeaderInfoSize = dwHeaderInfoSize,
                lpszFileExtensionCtorArg = lpszFileExtension,
                anonymous = anonymous,
            )
    }
}

public data class InternetCacheEntryInfow0(
    public var dwReserved: UInt = 0u,
    public var dwExemptDelta: UInt = 0u,
)

public data class InternetCacheGroupInfoa(
    public var dwGroupSize: UInt = 0u,
    public var dwGroupFlags: UInt = 0u,
    public var dwGroupType: UInt = 0u,
    public var dwDiskUsage: UInt = 0u,
    public var dwDiskQuota: UInt = 0u,
    public var dwOwnerStorage: UIntArray = UIntArray(4),
    public var szGroupName: ByteArray = ByteArray(120),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheGroupInfoa) return false
        if (this.dwGroupSize != other.dwGroupSize) return false
        if (this.dwGroupFlags != other.dwGroupFlags) return false
        if (this.dwGroupType != other.dwGroupType) return false
        if (this.dwDiskUsage != other.dwDiskUsage) return false
        if (this.dwDiskQuota != other.dwDiskQuota) return false
        if (!this.dwOwnerStorage.contentEquals(other.dwOwnerStorage)) return false
        if (!this.szGroupName.contentEquals(other.szGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupSize.hashCode()
        result = 31 * result + this.dwGroupFlags.hashCode()
        result = 31 * result + this.dwGroupType.hashCode()
        result = 31 * result + this.dwDiskUsage.hashCode()
        result = 31 * result + this.dwDiskQuota.hashCode()
        result = 31 * result + this.dwOwnerStorage.contentHashCode()
        result = 31 * result + this.szGroupName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheGroupInfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheGroupInfoa> {
                override val sizeBytes: Long = 156L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheGroupInfoa =
                    InternetCacheGroupInfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (120).toInt())
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheGroupInfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroupSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwGroupType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDiskUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDiskQuota)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 20L, value.dwOwnerStorage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (120).toInt())
                    ).writeNative(addr + 36L, value.szGroupName)
                }
            }
    }
}

public data class InternetCacheGroupInfow(
    public var dwGroupSize: UInt = 0u,
    public var dwGroupFlags: UInt = 0u,
    public var dwGroupType: UInt = 0u,
    public var dwDiskUsage: UInt = 0u,
    public var dwDiskQuota: UInt = 0u,
    public var dwOwnerStorage: UIntArray = UIntArray(4),
    public var szGroupName: UShortArray = UShortArray(120),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheGroupInfow) return false
        if (this.dwGroupSize != other.dwGroupSize) return false
        if (this.dwGroupFlags != other.dwGroupFlags) return false
        if (this.dwGroupType != other.dwGroupType) return false
        if (this.dwDiskUsage != other.dwDiskUsage) return false
        if (this.dwDiskQuota != other.dwDiskQuota) return false
        if (!this.dwOwnerStorage.contentEquals(other.dwOwnerStorage)) return false
        if (!this.szGroupName.contentEquals(other.szGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupSize.hashCode()
        result = 31 * result + this.dwGroupFlags.hashCode()
        result = 31 * result + this.dwGroupType.hashCode()
        result = 31 * result + this.dwDiskUsage.hashCode()
        result = 31 * result + this.dwDiskQuota.hashCode()
        result = 31 * result + this.dwOwnerStorage.contentHashCode()
        result = 31 * result + this.szGroupName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheGroupInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetCacheGroupInfow> {
                override val sizeBytes: Long = 276L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetCacheGroupInfow =
                    InternetCacheGroupInfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (120).toInt())
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: InternetCacheGroupInfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroupSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwGroupType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDiskUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDiskQuota)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 20L, value.dwOwnerStorage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (120).toInt())
                    ).writeNative(addr + 36L, value.szGroupName)
                }
            }
    }
}

public data class InternetCacheTimestamps(
    public var ftExpires: Filetime = Filetime(),
    public var ftLastModified: Filetime = Filetime(),
)

public class InternetCallbackCookie internal constructor(
    pcwszNameCtorArg: Pcwstr,
    pcwszValueCtorArg: Pcwstr,
    pcwszDomainCtorArg: Pcwstr,
    pcwszPathCtorArg: Pcwstr,
    public var ftExpires: Filetime,
    public var dwFlags: UInt,
) {
    public var pcwszName: Pcwstr = pcwszNameCtorArg
        internal set

    public var pcwszValue: Pcwstr = pcwszValueCtorArg
        internal set

    public var pcwszDomain: Pcwstr = pcwszDomainCtorArg
        internal set

    public var pcwszPath: Pcwstr = pcwszPathCtorArg
        internal set

    public constructor() : this(
        pcwszNameCtorArg = ConstPtr(0L),
        pcwszValueCtorArg = ConstPtr(0L),
        pcwszDomainCtorArg = ConstPtr(0L),
        pcwszPathCtorArg = ConstPtr(0L),
        ftExpires = Filetime(),
        dwFlags = 0u,
    )

    public operator fun component1(): Pcwstr = this.pcwszName

    public operator fun component2(): Pcwstr = this.pcwszValue

    public operator fun component3(): Pcwstr = this.pcwszDomain

    public operator fun component4(): Pcwstr = this.pcwszPath

    public operator fun component5(): Filetime = this.ftExpires

    public operator fun component6(): UInt = this.dwFlags

    public fun copy(pcwszName: Pcwstr = this.pcwszName, pcwszValue: Pcwstr = this.pcwszValue, pcwszDomain: Pcwstr = this.pcwszDomain, pcwszPath: Pcwstr = this.pcwszPath, ftExpires: Filetime = this.ftExpires, dwFlags: UInt = this.dwFlags): InternetCallbackCookie = InternetCallbackCookie(pcwszNameCtorArg = pcwszName, pcwszValueCtorArg = pcwszValue, pcwszDomainCtorArg = pcwszDomain, pcwszPathCtorArg = pcwszPath, ftExpires = ftExpires, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCallbackCookie) return false
        if (this.pcwszName != other.pcwszName) return false
        if (this.pcwszValue != other.pcwszValue) return false
        if (this.pcwszDomain != other.pcwszDomain) return false
        if (this.pcwszPath != other.pcwszPath) return false
        if (this.ftExpires != other.ftExpires) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcwszName.hashCode()
        result = 31 * result + this.pcwszValue.hashCode()
        result = 31 * result + this.pcwszDomain.hashCode()
        result = 31 * result + this.pcwszPath.hashCode()
        result = 31 * result + this.ftExpires.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pcwszName: Pcwstr = ConstPtr(0L),
            pcwszValue: Pcwstr = ConstPtr(0L),
            pcwszDomain: Pcwstr = ConstPtr(0L),
            pcwszPath: Pcwstr = ConstPtr(0L),
            ftExpires: Filetime = Filetime(),
            dwFlags: UInt = 0u,
        ): InternetCallbackCookie =
            InternetCallbackCookie(
                pcwszNameCtorArg = pcwszName,
                pcwszValueCtorArg = pcwszValue,
                pcwszDomainCtorArg = pcwszDomain,
                pcwszPathCtorArg = pcwszPath,
                ftExpires = ftExpires,
                dwFlags = dwFlags,
            )
    }
}

public class InternetCertificateInfo internal constructor(
    public var ftExpiry: Filetime,
    public var ftStart: Filetime,
    lpszSubjectInfoCtorArg: MutPtr<Byte>,
    lpszIssuerInfoCtorArg: MutPtr<Byte>,
    lpszProtocolNameCtorArg: MutPtr<Byte>,
    lpszSignatureAlgNameCtorArg: MutPtr<Byte>,
    lpszEncryptionAlgNameCtorArg: MutPtr<Byte>,
    public var dwKeySize: UInt,
) {
    public var lpszSubjectInfo: MutPtr<Byte> = lpszSubjectInfoCtorArg
        internal set

    public var lpszIssuerInfo: MutPtr<Byte> = lpszIssuerInfoCtorArg
        internal set

    public var lpszProtocolName: MutPtr<Byte> = lpszProtocolNameCtorArg
        internal set

    public var lpszSignatureAlgName: MutPtr<Byte> = lpszSignatureAlgNameCtorArg
        internal set

    public var lpszEncryptionAlgName: MutPtr<Byte> = lpszEncryptionAlgNameCtorArg
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

    public operator fun component3(): MutPtr<Byte> = this.lpszSubjectInfo

    public operator fun component4(): MutPtr<Byte> = this.lpszIssuerInfo

    public operator fun component5(): MutPtr<Byte> = this.lpszProtocolName

    public operator fun component6(): MutPtr<Byte> = this.lpszSignatureAlgName

    public operator fun component7(): MutPtr<Byte> = this.lpszEncryptionAlgName

    public operator fun component8(): UInt = this.dwKeySize

    public fun copy(ftExpiry: Filetime = this.ftExpiry, ftStart: Filetime = this.ftStart, lpszSubjectInfo: MutPtr<Byte> = this.lpszSubjectInfo, lpszIssuerInfo: MutPtr<Byte> = this.lpszIssuerInfo, lpszProtocolName: MutPtr<Byte> = this.lpszProtocolName, lpszSignatureAlgName: MutPtr<Byte> = this.lpszSignatureAlgName, lpszEncryptionAlgName: MutPtr<Byte> = this.lpszEncryptionAlgName, dwKeySize: UInt = this.dwKeySize): InternetCertificateInfo = InternetCertificateInfo(ftExpiry = ftExpiry, ftStart = ftStart, lpszSubjectInfoCtorArg = lpszSubjectInfo, lpszIssuerInfoCtorArg = lpszIssuerInfo, lpszProtocolNameCtorArg = lpszProtocolName, lpszSignatureAlgNameCtorArg = lpszSignatureAlgName, lpszEncryptionAlgNameCtorArg = lpszEncryptionAlgName, dwKeySize = dwKeySize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCertificateInfo) return false
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
            lpszSubjectInfo: MutPtr<Byte> = MutPtr(0L),
            lpszIssuerInfo: MutPtr<Byte> = MutPtr(0L),
            lpszProtocolName: MutPtr<Byte> = MutPtr(0L),
            lpszSignatureAlgName: MutPtr<Byte> = MutPtr(0L),
            lpszEncryptionAlgName: MutPtr<Byte> = MutPtr(0L),
            dwKeySize: UInt = 0u,
        ): InternetCertificateInfo =
            InternetCertificateInfo(
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

public data class InternetConnectedInfo(
    public var dwConnectedState: InternetState = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetConnectedInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetConnectedInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetConnectedInfo =
                    InternetConnectedInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InternetConnectedInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwConnectedState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public class InternetCookie internal constructor(
    public var cbSize: UInt,
    pszNameCtorArg: Pstr,
    pszDataCtorArg: Pstr,
    pszDomainCtorArg: Pstr,
    pszPathCtorArg: Pstr,
    pftExpiresCtorArg: MutPtr<Filetime>,
    public var dwFlags: UInt,
    pszUrlCtorArg: Pstr,
    pszP3PPolicyCtorArg: Pstr,
) {
    public var pszName: Pstr = pszNameCtorArg
        internal set

    public var pszData: Pstr = pszDataCtorArg
        internal set

    public var pszDomain: Pstr = pszDomainCtorArg
        internal set

    public var pszPath: Pstr = pszPathCtorArg
        internal set

    public var pftExpires: MutPtr<Filetime> = pftExpiresCtorArg
        internal set

    public var pszUrl: Pstr = pszUrlCtorArg
        internal set

    public var pszP3PPolicy: Pstr = pszP3PPolicyCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszNameCtorArg = MutPtr(0L),
        pszDataCtorArg = MutPtr(0L),
        pszDomainCtorArg = MutPtr(0L),
        pszPathCtorArg = MutPtr(0L),
        pftExpiresCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pszUrlCtorArg = MutPtr(0L),
        pszP3PPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pstr = this.pszName

    public operator fun component3(): Pstr = this.pszData

    public operator fun component4(): Pstr = this.pszDomain

    public operator fun component5(): Pstr = this.pszPath

    public operator fun component6(): MutPtr<Filetime> = this.pftExpires

    public operator fun component7(): UInt = this.dwFlags

    public operator fun component8(): Pstr = this.pszUrl

    public operator fun component9(): Pstr = this.pszP3PPolicy

    public fun copy(cbSize: UInt = this.cbSize, pszName: Pstr = this.pszName, pszData: Pstr = this.pszData, pszDomain: Pstr = this.pszDomain, pszPath: Pstr = this.pszPath, pftExpires: MutPtr<Filetime> = this.pftExpires, dwFlags: UInt = this.dwFlags, pszUrl: Pstr = this.pszUrl, pszP3PPolicy: Pstr = this.pszP3PPolicy): InternetCookie = InternetCookie(cbSize = cbSize, pszNameCtorArg = pszName, pszDataCtorArg = pszData, pszDomainCtorArg = pszDomain, pszPathCtorArg = pszPath, pftExpiresCtorArg = pftExpires, dwFlags = dwFlags, pszUrlCtorArg = pszUrl, pszP3PPolicyCtorArg = pszP3PPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCookie) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszName != other.pszName) return false
        if (this.pszData != other.pszData) return false
        if (this.pszDomain != other.pszDomain) return false
        if (this.pszPath != other.pszPath) return false
        if (this.pftExpires != other.pftExpires) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszUrl != other.pszUrl) return false
        if (this.pszP3PPolicy != other.pszP3PPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.pszData.hashCode()
        result = 31 * result + this.pszDomain.hashCode()
        result = 31 * result + this.pszPath.hashCode()
        result = 31 * result + this.pftExpires.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszUrl.hashCode()
        result = 31 * result + this.pszP3PPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszName: Pstr = MutPtr(0L),
            pszData: Pstr = MutPtr(0L),
            pszDomain: Pstr = MutPtr(0L),
            pszPath: Pstr = MutPtr(0L),
            pftExpires: MutPtr<Filetime> = MutPtr(0L),
            dwFlags: UInt = 0u,
            pszUrl: Pstr = MutPtr(0L),
            pszP3PPolicy: Pstr = MutPtr(0L),
        ): InternetCookie =
            InternetCookie(
                cbSize = cbSize,
                pszNameCtorArg = pszName,
                pszDataCtorArg = pszData,
                pszDomainCtorArg = pszDomain,
                pszPathCtorArg = pszPath,
                pftExpiresCtorArg = pftExpires,
                dwFlags = dwFlags,
                pszUrlCtorArg = pszUrl,
                pszP3PPolicyCtorArg = pszP3PPolicy,
            )
    }
}

public class InternetCookie2 internal constructor(
    pwszNameCtorArg: Pwstr,
    pwszValueCtorArg: Pwstr,
    pwszDomainCtorArg: Pwstr,
    pwszPathCtorArg: Pwstr,
    public var dwFlags: UInt,
    public var ftExpires: Filetime,
    public var fExpiresSet: Bool,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pwszValue: Pwstr = pwszValueCtorArg
        internal set

    public var pwszDomain: Pwstr = pwszDomainCtorArg
        internal set

    public var pwszPath: Pwstr = pwszPathCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        pwszValueCtorArg = MutPtr(0L),
        pwszDomainCtorArg = MutPtr(0L),
        pwszPathCtorArg = MutPtr(0L),
        dwFlags = 0u,
        ftExpires = Filetime(),
        fExpiresSet = 0,
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): Pwstr = this.pwszValue

    public operator fun component3(): Pwstr = this.pwszDomain

    public operator fun component4(): Pwstr = this.pwszPath

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): Filetime = this.ftExpires

    public operator fun component7(): Bool = this.fExpiresSet

    public fun copy(pwszName: Pwstr = this.pwszName, pwszValue: Pwstr = this.pwszValue, pwszDomain: Pwstr = this.pwszDomain, pwszPath: Pwstr = this.pwszPath, dwFlags: UInt = this.dwFlags, ftExpires: Filetime = this.ftExpires, fExpiresSet: Bool = this.fExpiresSet): InternetCookie2 = InternetCookie2(pwszNameCtorArg = pwszName, pwszValueCtorArg = pwszValue, pwszDomainCtorArg = pwszDomain, pwszPathCtorArg = pwszPath, dwFlags = dwFlags, ftExpires = ftExpires, fExpiresSet = fExpiresSet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCookie2) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszValue != other.pwszValue) return false
        if (this.pwszDomain != other.pwszDomain) return false
        if (this.pwszPath != other.pwszPath) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ftExpires != other.ftExpires) return false
        if (this.fExpiresSet != other.fExpiresSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.pwszValue.hashCode()
        result = 31 * result + this.pwszDomain.hashCode()
        result = 31 * result + this.pwszPath.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ftExpires.hashCode()
        result = 31 * result + this.fExpiresSet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            pwszValue: Pwstr = MutPtr(0L),
            pwszDomain: Pwstr = MutPtr(0L),
            pwszPath: Pwstr = MutPtr(0L),
            dwFlags: UInt = 0u,
            ftExpires: Filetime = Filetime(),
            fExpiresSet: Bool = 0,
        ): InternetCookie2 =
            InternetCookie2(
                pwszNameCtorArg = pwszName,
                pwszValueCtorArg = pwszValue,
                pwszDomainCtorArg = pwszDomain,
                pwszPathCtorArg = pwszPath,
                dwFlags = dwFlags,
                ftExpires = ftExpires,
                fExpiresSet = fExpiresSet,
            )
    }
}

public class InternetCredentials internal constructor(
    lpcwszHostNameCtorArg: Pcwstr,
    public var dwPort: UInt,
    public var dwScheme: UInt,
    lpcwszUrlCtorArg: Pcwstr,
    lpcwszRealmCtorArg: Pcwstr,
    public var fAuthIdentity: Bool,
    public var anonymous: InternetCredentials0,
) {
    public var lpcwszHostName: Pcwstr = lpcwszHostNameCtorArg
        internal set

    public var lpcwszUrl: Pcwstr = lpcwszUrlCtorArg
        internal set

    public var lpcwszRealm: Pcwstr = lpcwszRealmCtorArg
        internal set

    public constructor() : this(
        lpcwszHostNameCtorArg = ConstPtr(0L),
        dwPort = 0u,
        dwScheme = 0u,
        lpcwszUrlCtorArg = ConstPtr(0L),
        lpcwszRealmCtorArg = ConstPtr(0L),
        fAuthIdentity = 0,
        anonymous = InternetCredentials0(),
    )

    public operator fun component1(): Pcwstr = this.lpcwszHostName

    public operator fun component2(): UInt = this.dwPort

    public operator fun component3(): UInt = this.dwScheme

    public operator fun component4(): Pcwstr = this.lpcwszUrl

    public operator fun component5(): Pcwstr = this.lpcwszRealm

    public operator fun component6(): Bool = this.fAuthIdentity

    public operator fun component7(): InternetCredentials0 = this.anonymous

    public fun copy(lpcwszHostName: Pcwstr = this.lpcwszHostName, dwPort: UInt = this.dwPort, dwScheme: UInt = this.dwScheme, lpcwszUrl: Pcwstr = this.lpcwszUrl, lpcwszRealm: Pcwstr = this.lpcwszRealm, fAuthIdentity: Bool = this.fAuthIdentity, anonymous: InternetCredentials0 = this.anonymous): InternetCredentials = InternetCredentials(lpcwszHostNameCtorArg = lpcwszHostName, dwPort = dwPort, dwScheme = dwScheme, lpcwszUrlCtorArg = lpcwszUrl, lpcwszRealmCtorArg = lpcwszRealm, fAuthIdentity = fAuthIdentity, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCredentials) return false
        if (this.lpcwszHostName != other.lpcwszHostName) return false
        if (this.dwPort != other.dwPort) return false
        if (this.dwScheme != other.dwScheme) return false
        if (this.lpcwszUrl != other.lpcwszUrl) return false
        if (this.lpcwszRealm != other.lpcwszRealm) return false
        if (this.fAuthIdentity != other.fAuthIdentity) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcwszHostName.hashCode()
        result = 31 * result + this.dwPort.hashCode()
        result = 31 * result + this.dwScheme.hashCode()
        result = 31 * result + this.lpcwszUrl.hashCode()
        result = 31 * result + this.lpcwszRealm.hashCode()
        result = 31 * result + this.fAuthIdentity.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcwszHostName: Pcwstr = ConstPtr(0L),
            dwPort: UInt = 0u,
            dwScheme: UInt = 0u,
            lpcwszUrl: Pcwstr = ConstPtr(0L),
            lpcwszRealm: Pcwstr = ConstPtr(0L),
            fAuthIdentity: Bool = 0,
            anonymous: InternetCredentials0 = InternetCredentials0(),
        ): InternetCredentials =
            InternetCredentials(
                lpcwszHostNameCtorArg = lpcwszHostName,
                dwPort = dwPort,
                dwScheme = dwScheme,
                lpcwszUrlCtorArg = lpcwszUrl,
                lpcwszRealmCtorArg = lpcwszRealm,
                fAuthIdentity = fAuthIdentity,
                anonymous = anonymous,
            )
    }
}

public class InternetCredentials0 internal constructor(
    public var anonymous: InternetCredentials00,
    pAuthIdentityOpaqueCtorArg: MutPtr<CVoid>,
) {
    public var pAuthIdentityOpaque: MutPtr<CVoid> = pAuthIdentityOpaqueCtorArg
        internal set

    public constructor() : this(
        anonymous = InternetCredentials00(),
        pAuthIdentityOpaqueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): InternetCredentials00 = this.anonymous

    public operator fun component2(): MutPtr<CVoid> = this.pAuthIdentityOpaque

    public fun copy(anonymous: InternetCredentials00 = this.anonymous, pAuthIdentityOpaque: MutPtr<CVoid> = this.pAuthIdentityOpaque): InternetCredentials0 = InternetCredentials0(anonymous = anonymous, pAuthIdentityOpaqueCtorArg = pAuthIdentityOpaque)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCredentials0) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pAuthIdentityOpaque != other.pAuthIdentityOpaque) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pAuthIdentityOpaque.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: InternetCredentials00 = InternetCredentials00(),
            pAuthIdentityOpaque: MutPtr<CVoid> = MutPtr(0L),
        ): InternetCredentials0 =
            InternetCredentials0(
                anonymous = anonymous,
                pAuthIdentityOpaqueCtorArg = pAuthIdentityOpaque,
            )
    }
}

public class InternetCredentials00 internal constructor(
    lpcwszUserNameCtorArg: Pcwstr,
    lpcwszPasswordCtorArg: Pcwstr,
) {
    public var lpcwszUserName: Pcwstr = lpcwszUserNameCtorArg
        internal set

    public var lpcwszPassword: Pcwstr = lpcwszPasswordCtorArg
        internal set

    public constructor() : this(
        lpcwszUserNameCtorArg = ConstPtr(0L),
        lpcwszPasswordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.lpcwszUserName

    public operator fun component2(): Pcwstr = this.lpcwszPassword

    public fun copy(lpcwszUserName: Pcwstr = this.lpcwszUserName, lpcwszPassword: Pcwstr = this.lpcwszPassword): InternetCredentials00 = InternetCredentials00(lpcwszUserNameCtorArg = lpcwszUserName, lpcwszPasswordCtorArg = lpcwszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCredentials00) return false
        if (this.lpcwszUserName != other.lpcwszUserName) return false
        if (this.lpcwszPassword != other.lpcwszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcwszUserName.hashCode()
        result = 31 * result + this.lpcwszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcwszUserName: Pcwstr = ConstPtr(0L),
            lpcwszPassword: Pcwstr = ConstPtr(0L),
        ): InternetCredentials00 =
            InternetCredentials00(
                lpcwszUserNameCtorArg = lpcwszUserName,
                lpcwszPasswordCtorArg = lpcwszPassword,
            )
    }
}

public data class InternetDiagnosticSocketInfo(
    public var socket: Int = 0,
    public var sourcePort: UInt = 0u,
    public var destPort: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetDiagnosticSocketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetDiagnosticSocketInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InternetDiagnosticSocketInfo =
                    InternetDiagnosticSocketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: InternetDiagnosticSocketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.socket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sourcePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.destPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public class InternetDownloadModeHandle internal constructor(
    pcwszFileNameCtorArg: Pcwstr,
    phFileCtorArg: MutPtr<Handle>,
) {
    public var pcwszFileName: Pcwstr = pcwszFileNameCtorArg
        internal set

    public var phFile: MutPtr<Handle> = phFileCtorArg
        internal set

    public constructor() : this(
        pcwszFileNameCtorArg = ConstPtr(0L),
        phFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pcwszFileName

    public operator fun component2(): MutPtr<Handle> = this.phFile

    public fun copy(pcwszFileName: Pcwstr = this.pcwszFileName, phFile: MutPtr<Handle> = this.phFile): InternetDownloadModeHandle = InternetDownloadModeHandle(pcwszFileNameCtorArg = pcwszFileName, phFileCtorArg = phFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetDownloadModeHandle) return false
        if (this.pcwszFileName != other.pcwszFileName) return false
        if (this.phFile != other.phFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcwszFileName.hashCode()
        result = 31 * result + this.phFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pcwszFileName: Pcwstr = ConstPtr(0L),
            phFile: MutPtr<Handle> = MutPtr(0L),
        ): InternetDownloadModeHandle =
            InternetDownloadModeHandle(
                pcwszFileNameCtorArg = pcwszFileName,
                phFileCtorArg = phFile,
            )
    }
}

public class InternetEndBrowserSessionData internal constructor(
    lpBufferCtorArg: MutPtr<CVoid>,
    public var dwBufferLength: UInt,
) {
    public var lpBuffer: MutPtr<CVoid> = lpBufferCtorArg
        internal set

    public constructor() : this(
        lpBufferCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpBuffer

    public operator fun component2(): UInt = this.dwBufferLength

    public fun copy(lpBuffer: MutPtr<CVoid> = this.lpBuffer, dwBufferLength: UInt = this.dwBufferLength): InternetEndBrowserSessionData = InternetEndBrowserSessionData(lpBufferCtorArg = lpBuffer, dwBufferLength = dwBufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetEndBrowserSessionData) return false
        if (this.lpBuffer != other.lpBuffer) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpBuffer.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetEndBrowserSessionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetEndBrowserSessionData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InternetEndBrowserSessionData =
                    InternetEndBrowserSessionData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InternetEndBrowserSessionData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.lpBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwBufferLength)
                }
            }

        public operator fun invoke(
            lpBuffer: MutPtr<CVoid> = MutPtr(0L),
            dwBufferLength: UInt = 0u,
        ): InternetEndBrowserSessionData =
            InternetEndBrowserSessionData(
                lpBufferCtorArg = lpBuffer,
                dwBufferLength = dwBufferLength,
            )
    }
}

public data class InternetPerConnOptiona(
    public var dwOption: InternetPerConn = 0u,
    public var value: InternetPerConnOptiona0 = InternetPerConnOptiona0(),
)

public class InternetPerConnOptiona0 internal constructor(
    public var dwValue: UInt,
    pszValueCtorArg: Pstr,
    public var ftValue: Filetime,
) {
    public var pszValue: Pstr = pszValueCtorArg
        internal set

    public constructor() : this(
        dwValue = 0u,
        pszValueCtorArg = MutPtr(0L),
        ftValue = Filetime(),
    )

    public operator fun component1(): UInt = this.dwValue

    public operator fun component2(): Pstr = this.pszValue

    public operator fun component3(): Filetime = this.ftValue

    public fun copy(dwValue: UInt = this.dwValue, pszValue: Pstr = this.pszValue, ftValue: Filetime = this.ftValue): InternetPerConnOptiona0 = InternetPerConnOptiona0(dwValue = dwValue, pszValueCtorArg = pszValue, ftValue = ftValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetPerConnOptiona0) return false
        if (this.dwValue != other.dwValue) return false
        if (this.pszValue != other.pszValue) return false
        if (this.ftValue != other.ftValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwValue.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        result = 31 * result + this.ftValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwValue: UInt = 0u,
            pszValue: Pstr = MutPtr(0L),
            ftValue: Filetime = Filetime(),
        ): InternetPerConnOptiona0 =
            InternetPerConnOptiona0(
                dwValue = dwValue,
                pszValueCtorArg = pszValue,
                ftValue = ftValue,
            )
    }
}

public data class InternetPerConnOptionw(
    public var dwOption: InternetPerConn = 0u,
    public var value: InternetPerConnOptionw0 = InternetPerConnOptionw0(),
)

public class InternetPerConnOptionw0 internal constructor(
    public var dwValue: UInt,
    pszValueCtorArg: Pwstr,
    public var ftValue: Filetime,
) {
    public var pszValue: Pwstr = pszValueCtorArg
        internal set

    public constructor() : this(
        dwValue = 0u,
        pszValueCtorArg = MutPtr(0L),
        ftValue = Filetime(),
    )

    public operator fun component1(): UInt = this.dwValue

    public operator fun component2(): Pwstr = this.pszValue

    public operator fun component3(): Filetime = this.ftValue

    public fun copy(dwValue: UInt = this.dwValue, pszValue: Pwstr = this.pszValue, ftValue: Filetime = this.ftValue): InternetPerConnOptionw0 = InternetPerConnOptionw0(dwValue = dwValue, pszValueCtorArg = pszValue, ftValue = ftValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetPerConnOptionw0) return false
        if (this.dwValue != other.dwValue) return false
        if (this.pszValue != other.pszValue) return false
        if (this.ftValue != other.ftValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwValue.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        result = 31 * result + this.ftValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwValue: UInt = 0u,
            pszValue: Pwstr = MutPtr(0L),
            ftValue: Filetime = Filetime(),
        ): InternetPerConnOptionw0 =
            InternetPerConnOptionw0(
                dwValue = dwValue,
                pszValueCtorArg = pszValue,
                ftValue = ftValue,
            )
    }
}

public class InternetPerConnOptionLista internal constructor(
    public var dwSize: UInt,
    pszConnectionCtorArg: Pstr,
    public var dwOptionCount: UInt,
    public var dwOptionError: UInt,
    pOptionsCtorArg: MutPtr<InternetPerConnOptiona>,
) {
    public var pszConnection: Pstr = pszConnectionCtorArg
        internal set

    public var pOptions: MutPtr<InternetPerConnOptiona> = pOptionsCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pszConnectionCtorArg = MutPtr(0L),
        dwOptionCount = 0u,
        dwOptionError = 0u,
        pOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pstr = this.pszConnection

    public operator fun component3(): UInt = this.dwOptionCount

    public operator fun component4(): UInt = this.dwOptionError

    public operator fun component5(): MutPtr<InternetPerConnOptiona> = this.pOptions

    public fun copy(dwSize: UInt = this.dwSize, pszConnection: Pstr = this.pszConnection, dwOptionCount: UInt = this.dwOptionCount, dwOptionError: UInt = this.dwOptionError, pOptions: MutPtr<InternetPerConnOptiona> = this.pOptions): InternetPerConnOptionLista = InternetPerConnOptionLista(dwSize = dwSize, pszConnectionCtorArg = pszConnection, dwOptionCount = dwOptionCount, dwOptionError = dwOptionError, pOptionsCtorArg = pOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetPerConnOptionLista) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pszConnection != other.pszConnection) return false
        if (this.dwOptionCount != other.dwOptionCount) return false
        if (this.dwOptionError != other.dwOptionError) return false
        if (this.pOptions != other.pOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pszConnection.hashCode()
        result = 31 * result + this.dwOptionCount.hashCode()
        result = 31 * result + this.dwOptionError.hashCode()
        result = 31 * result + this.pOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pszConnection: Pstr = MutPtr(0L),
            dwOptionCount: UInt = 0u,
            dwOptionError: UInt = 0u,
            pOptions: MutPtr<InternetPerConnOptiona> = MutPtr(0L),
        ): InternetPerConnOptionLista =
            InternetPerConnOptionLista(
                dwSize = dwSize,
                pszConnectionCtorArg = pszConnection,
                dwOptionCount = dwOptionCount,
                dwOptionError = dwOptionError,
                pOptionsCtorArg = pOptions,
            )
    }
}

public class InternetPerConnOptionListw internal constructor(
    public var dwSize: UInt,
    pszConnectionCtorArg: Pwstr,
    public var dwOptionCount: UInt,
    public var dwOptionError: UInt,
    pOptionsCtorArg: MutPtr<InternetPerConnOptionw>,
) {
    public var pszConnection: Pwstr = pszConnectionCtorArg
        internal set

    public var pOptions: MutPtr<InternetPerConnOptionw> = pOptionsCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pszConnectionCtorArg = MutPtr(0L),
        dwOptionCount = 0u,
        dwOptionError = 0u,
        pOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pszConnection

    public operator fun component3(): UInt = this.dwOptionCount

    public operator fun component4(): UInt = this.dwOptionError

    public operator fun component5(): MutPtr<InternetPerConnOptionw> = this.pOptions

    public fun copy(dwSize: UInt = this.dwSize, pszConnection: Pwstr = this.pszConnection, dwOptionCount: UInt = this.dwOptionCount, dwOptionError: UInt = this.dwOptionError, pOptions: MutPtr<InternetPerConnOptionw> = this.pOptions): InternetPerConnOptionListw = InternetPerConnOptionListw(dwSize = dwSize, pszConnectionCtorArg = pszConnection, dwOptionCount = dwOptionCount, dwOptionError = dwOptionError, pOptionsCtorArg = pOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetPerConnOptionListw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pszConnection != other.pszConnection) return false
        if (this.dwOptionCount != other.dwOptionCount) return false
        if (this.dwOptionError != other.dwOptionError) return false
        if (this.pOptions != other.pOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pszConnection.hashCode()
        result = 31 * result + this.dwOptionCount.hashCode()
        result = 31 * result + this.dwOptionError.hashCode()
        result = 31 * result + this.pOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pszConnection: Pwstr = MutPtr(0L),
            dwOptionCount: UInt = 0u,
            dwOptionError: UInt = 0u,
            pOptions: MutPtr<InternetPerConnOptionw> = MutPtr(0L),
        ): InternetPerConnOptionListw =
            InternetPerConnOptionListw(
                dwSize = dwSize,
                pszConnectionCtorArg = pszConnection,
                dwOptionCount = dwOptionCount,
                dwOptionError = dwOptionError,
                pOptionsCtorArg = pOptions,
            )
    }
}

public data class InternetPrefetchStatus(
    public var dwStatus: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetPrefetchStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetPrefetchStatus> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetPrefetchStatus =
                    InternetPrefetchStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InternetPrefetchStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public class InternetProxyInfo internal constructor(
    public var dwAccessType: InternetAccessType,
    lpszProxyCtorArg: MutPtr<Byte>,
    lpszProxyBypassCtorArg: MutPtr<Byte>,
) {
    public var lpszProxy: MutPtr<Byte> = lpszProxyCtorArg
        internal set

    public var lpszProxyBypass: MutPtr<Byte> = lpszProxyBypassCtorArg
        internal set

    public constructor() : this(
        dwAccessType = 0u,
        lpszProxyCtorArg = MutPtr(0L),
        lpszProxyBypassCtorArg = MutPtr(0L),
    )

    public operator fun component1(): InternetAccessType = this.dwAccessType

    public operator fun component2(): MutPtr<Byte> = this.lpszProxy

    public operator fun component3(): MutPtr<Byte> = this.lpszProxyBypass

    public fun copy(dwAccessType: InternetAccessType = this.dwAccessType, lpszProxy: MutPtr<Byte> = this.lpszProxy, lpszProxyBypass: MutPtr<Byte> = this.lpszProxyBypass): InternetProxyInfo = InternetProxyInfo(dwAccessType = dwAccessType, lpszProxyCtorArg = lpszProxy, lpszProxyBypassCtorArg = lpszProxyBypass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetProxyInfo) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetProxyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetProxyInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InternetProxyInfo =
                    InternetProxyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: InternetProxyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAccessType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.lpszProxy)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 16L, value.lpszProxyBypass)
                }
            }

        public operator fun invoke(
            dwAccessType: InternetAccessType = 0u,
            lpszProxy: MutPtr<Byte> = MutPtr(0L),
            lpszProxyBypass: MutPtr<Byte> = MutPtr(0L),
        ): InternetProxyInfo =
            InternetProxyInfo(
                dwAccessType = dwAccessType,
                lpszProxyCtorArg = lpszProxy,
                lpszProxyBypassCtorArg = lpszProxyBypass,
            )
    }
}

public data class InternetSecurityConnectionInfo(
    public var dwSize: UInt = 0u,
    public var fSecure: Bool = 0,
    public var connectionInfo: SecPkgContextConnectionInfo = SecPkgContextConnectionInfo(),
    public var cipherInfo: SecPkgContextCipherInfo = SecPkgContextCipherInfo(),
)

public class InternetSecurityInfo internal constructor(
    public var dwSize: UInt,
    pCertificateCtorArg: ConstPtr<CertContext>,
    pcCertChainCtorArg: MutPtr<CertChainContext>,
    public var connectionInfo: SecPkgContextConnectionInfo,
    public var cipherInfo: SecPkgContextCipherInfo,
    pcUnverifiedCertChainCtorArg: MutPtr<CertChainContext>,
    public var channelBindingToken: SecPkgContextBindings,
) {
    public var pCertificate: ConstPtr<CertContext> = pCertificateCtorArg
        internal set

    public var pcCertChain: MutPtr<CertChainContext> = pcCertChainCtorArg
        internal set

    public var pcUnverifiedCertChain: MutPtr<CertChainContext> = pcUnverifiedCertChainCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pCertificateCtorArg = ConstPtr(0L),
        pcCertChainCtorArg = MutPtr(0L),
        connectionInfo = SecPkgContextConnectionInfo(),
        cipherInfo = SecPkgContextCipherInfo(),
        pcUnverifiedCertChainCtorArg = MutPtr(0L),
        channelBindingToken = SecPkgContextBindings(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): ConstPtr<CertContext> = this.pCertificate

    public operator fun component3(): MutPtr<CertChainContext> = this.pcCertChain

    public operator fun component4(): SecPkgContextConnectionInfo = this.connectionInfo

    public operator fun component5(): SecPkgContextCipherInfo = this.cipherInfo

    public operator fun component6(): MutPtr<CertChainContext> = this.pcUnverifiedCertChain

    public operator fun component7(): SecPkgContextBindings = this.channelBindingToken

    public fun copy(dwSize: UInt = this.dwSize, pCertificate: ConstPtr<CertContext> = this.pCertificate, pcCertChain: MutPtr<CertChainContext> = this.pcCertChain, connectionInfo: SecPkgContextConnectionInfo = this.connectionInfo, cipherInfo: SecPkgContextCipherInfo = this.cipherInfo, pcUnverifiedCertChain: MutPtr<CertChainContext> = this.pcUnverifiedCertChain, channelBindingToken: SecPkgContextBindings = this.channelBindingToken): InternetSecurityInfo = InternetSecurityInfo(dwSize = dwSize, pCertificateCtorArg = pCertificate, pcCertChainCtorArg = pcCertChain, connectionInfo = connectionInfo, cipherInfo = cipherInfo, pcUnverifiedCertChainCtorArg = pcUnverifiedCertChain, channelBindingToken = channelBindingToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetSecurityInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pCertificate != other.pCertificate) return false
        if (this.pcCertChain != other.pcCertChain) return false
        if (this.connectionInfo != other.connectionInfo) return false
        if (this.cipherInfo != other.cipherInfo) return false
        if (this.pcUnverifiedCertChain != other.pcUnverifiedCertChain) return false
        if (this.channelBindingToken != other.channelBindingToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pCertificate.hashCode()
        result = 31 * result + this.pcCertChain.hashCode()
        result = 31 * result + this.connectionInfo.hashCode()
        result = 31 * result + this.cipherInfo.hashCode()
        result = 31 * result + this.pcUnverifiedCertChain.hashCode()
        result = 31 * result + this.channelBindingToken.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pCertificate: ConstPtr<CertContext> = ConstPtr(0L),
            pcCertChain: MutPtr<CertChainContext> = MutPtr(0L),
            connectionInfo: SecPkgContextConnectionInfo = SecPkgContextConnectionInfo(),
            cipherInfo: SecPkgContextCipherInfo = SecPkgContextCipherInfo(),
            pcUnverifiedCertChain: MutPtr<CertChainContext> = MutPtr(0L),
            channelBindingToken: SecPkgContextBindings = SecPkgContextBindings(),
        ): InternetSecurityInfo =
            InternetSecurityInfo(
                dwSize = dwSize,
                pCertificateCtorArg = pCertificate,
                pcCertChainCtorArg = pcCertChain,
                connectionInfo = connectionInfo,
                cipherInfo = cipherInfo,
                pcUnverifiedCertChainCtorArg = pcUnverifiedCertChain,
                channelBindingToken = channelBindingToken,
            )
    }
}

public class InternetServerConnectionState internal constructor(
    lpcwszHostNameCtorArg: Pcwstr,
    public var fProxy: Bool,
    public var dwCounter: UInt,
    public var dwConnectionLimit: UInt,
    public var dwAvailableCreates: UInt,
    public var dwAvailableKeepAlives: UInt,
    public var dwActiveConnections: UInt,
    public var dwWaiters: UInt,
) {
    public var lpcwszHostName: Pcwstr = lpcwszHostNameCtorArg
        internal set

    public constructor() : this(
        lpcwszHostNameCtorArg = ConstPtr(0L),
        fProxy = 0,
        dwCounter = 0u,
        dwConnectionLimit = 0u,
        dwAvailableCreates = 0u,
        dwAvailableKeepAlives = 0u,
        dwActiveConnections = 0u,
        dwWaiters = 0u,
    )

    public operator fun component1(): Pcwstr = this.lpcwszHostName

    public operator fun component2(): Bool = this.fProxy

    public operator fun component3(): UInt = this.dwCounter

    public operator fun component4(): UInt = this.dwConnectionLimit

    public operator fun component5(): UInt = this.dwAvailableCreates

    public operator fun component6(): UInt = this.dwAvailableKeepAlives

    public operator fun component7(): UInt = this.dwActiveConnections

    public operator fun component8(): UInt = this.dwWaiters

    public fun copy(lpcwszHostName: Pcwstr = this.lpcwszHostName, fProxy: Bool = this.fProxy, dwCounter: UInt = this.dwCounter, dwConnectionLimit: UInt = this.dwConnectionLimit, dwAvailableCreates: UInt = this.dwAvailableCreates, dwAvailableKeepAlives: UInt = this.dwAvailableKeepAlives, dwActiveConnections: UInt = this.dwActiveConnections, dwWaiters: UInt = this.dwWaiters): InternetServerConnectionState = InternetServerConnectionState(lpcwszHostNameCtorArg = lpcwszHostName, fProxy = fProxy, dwCounter = dwCounter, dwConnectionLimit = dwConnectionLimit, dwAvailableCreates = dwAvailableCreates, dwAvailableKeepAlives = dwAvailableKeepAlives, dwActiveConnections = dwActiveConnections, dwWaiters = dwWaiters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetServerConnectionState) return false
        if (this.lpcwszHostName != other.lpcwszHostName) return false
        if (this.fProxy != other.fProxy) return false
        if (this.dwCounter != other.dwCounter) return false
        if (this.dwConnectionLimit != other.dwConnectionLimit) return false
        if (this.dwAvailableCreates != other.dwAvailableCreates) return false
        if (this.dwAvailableKeepAlives != other.dwAvailableKeepAlives) return false
        if (this.dwActiveConnections != other.dwActiveConnections) return false
        if (this.dwWaiters != other.dwWaiters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcwszHostName.hashCode()
        result = 31 * result + this.fProxy.hashCode()
        result = 31 * result + this.dwCounter.hashCode()
        result = 31 * result + this.dwConnectionLimit.hashCode()
        result = 31 * result + this.dwAvailableCreates.hashCode()
        result = 31 * result + this.dwAvailableKeepAlives.hashCode()
        result = 31 * result + this.dwActiveConnections.hashCode()
        result = 31 * result + this.dwWaiters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcwszHostName: Pcwstr = ConstPtr(0L),
            fProxy: Bool = 0,
            dwCounter: UInt = 0u,
            dwConnectionLimit: UInt = 0u,
            dwAvailableCreates: UInt = 0u,
            dwAvailableKeepAlives: UInt = 0u,
            dwActiveConnections: UInt = 0u,
            dwWaiters: UInt = 0u,
        ): InternetServerConnectionState =
            InternetServerConnectionState(
                lpcwszHostNameCtorArg = lpcwszHostName,
                fProxy = fProxy,
                dwCounter = dwCounter,
                dwConnectionLimit = dwConnectionLimit,
                dwAvailableCreates = dwAvailableCreates,
                dwAvailableKeepAlives = dwAvailableKeepAlives,
                dwActiveConnections = dwActiveConnections,
                dwWaiters = dwWaiters,
            )
    }
}

public data class InternetVersionInfo(
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InternetVersionInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InternetVersionInfo =
                    InternetVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InternetVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinorVersion)
                }
            }
    }
}

public class IncomingCookieState internal constructor(
    public var cSession: Int,
    public var cPersistent: Int,
    public var cAccepted: Int,
    public var cLeashed: Int,
    public var cDowngraded: Int,
    public var cBlocked: Int,
    pszLocationCtorArg: Pcstr,
) {
    public var pszLocation: Pcstr = pszLocationCtorArg
        internal set

    public constructor() : this(
        cSession = 0,
        cPersistent = 0,
        cAccepted = 0,
        cLeashed = 0,
        cDowngraded = 0,
        cBlocked = 0,
        pszLocationCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.cSession

    public operator fun component2(): Int = this.cPersistent

    public operator fun component3(): Int = this.cAccepted

    public operator fun component4(): Int = this.cLeashed

    public operator fun component5(): Int = this.cDowngraded

    public operator fun component6(): Int = this.cBlocked

    public operator fun component7(): Pcstr = this.pszLocation

    public fun copy(cSession: Int = this.cSession, cPersistent: Int = this.cPersistent, cAccepted: Int = this.cAccepted, cLeashed: Int = this.cLeashed, cDowngraded: Int = this.cDowngraded, cBlocked: Int = this.cBlocked, pszLocation: Pcstr = this.pszLocation): IncomingCookieState = IncomingCookieState(cSession = cSession, cPersistent = cPersistent, cAccepted = cAccepted, cLeashed = cLeashed, cDowngraded = cDowngraded, cBlocked = cBlocked, pszLocationCtorArg = pszLocation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IncomingCookieState) return false
        if (this.cSession != other.cSession) return false
        if (this.cPersistent != other.cPersistent) return false
        if (this.cAccepted != other.cAccepted) return false
        if (this.cLeashed != other.cLeashed) return false
        if (this.cDowngraded != other.cDowngraded) return false
        if (this.cBlocked != other.cBlocked) return false
        if (this.pszLocation != other.pszLocation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSession.hashCode()
        result = 31 * result + this.cPersistent.hashCode()
        result = 31 * result + this.cAccepted.hashCode()
        result = 31 * result + this.cLeashed.hashCode()
        result = 31 * result + this.cDowngraded.hashCode()
        result = 31 * result + this.cBlocked.hashCode()
        result = 31 * result + this.pszLocation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cSession: Int = 0,
            cPersistent: Int = 0,
            cAccepted: Int = 0,
            cLeashed: Int = 0,
            cDowngraded: Int = 0,
            cBlocked: Int = 0,
            pszLocation: Pcstr = ConstPtr(0L),
        ): IncomingCookieState =
            IncomingCookieState(
                cSession = cSession,
                cPersistent = cPersistent,
                cAccepted = cAccepted,
                cLeashed = cLeashed,
                cDowngraded = cDowngraded,
                cBlocked = cBlocked,
                pszLocationCtorArg = pszLocation,
            )
    }
}

public data class InternetCookieHistory(
    public var fAccepted: Bool = 0,
    public var fLeashed: Bool = 0,
    public var fDowngraded: Bool = 0,
    public var fRejected: Bool = 0,
)

public class OutgoingCookieState internal constructor(
    public var cSent: Int,
    public var cSuppressed: Int,
    pszLocationCtorArg: Pcstr,
) {
    public var pszLocation: Pcstr = pszLocationCtorArg
        internal set

    public constructor() : this(
        cSent = 0,
        cSuppressed = 0,
        pszLocationCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.cSent

    public operator fun component2(): Int = this.cSuppressed

    public operator fun component3(): Pcstr = this.pszLocation

    public fun copy(cSent: Int = this.cSent, cSuppressed: Int = this.cSuppressed, pszLocation: Pcstr = this.pszLocation): OutgoingCookieState = OutgoingCookieState(cSent = cSent, cSuppressed = cSuppressed, pszLocationCtorArg = pszLocation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OutgoingCookieState) return false
        if (this.cSent != other.cSent) return false
        if (this.cSuppressed != other.cSuppressed) return false
        if (this.pszLocation != other.pszLocation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSent.hashCode()
        result = 31 * result + this.cSuppressed.hashCode()
        result = 31 * result + this.pszLocation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cSent: Int = 0,
            cSuppressed: Int = 0,
            pszLocation: Pcstr = ConstPtr(0L),
        ): OutgoingCookieState =
            OutgoingCookieState(
                cSent = cSent,
                cSuppressed = cSuppressed,
                pszLocationCtorArg = pszLocation,
            )
    }
}

public class ProofOfPossessionCookieInfo internal constructor(
    nameCtorArg: Pwstr,
    dataCtorArg: Pwstr,
    public var flags: UInt,
    p3pHeaderCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var data: Pwstr = dataCtorArg
        internal set

    public var p3pHeader: Pwstr = p3pHeaderCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        dataCtorArg = MutPtr(0L),
        flags = 0u,
        p3pHeaderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): Pwstr = this.data

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): Pwstr = this.p3pHeader

    public fun copy(name: Pwstr = this.name, data: Pwstr = this.data, flags: UInt = this.flags, p3pHeader: Pwstr = this.p3pHeader): ProofOfPossessionCookieInfo = ProofOfPossessionCookieInfo(nameCtorArg = name, dataCtorArg = data, flags = flags, p3pHeaderCtorArg = p3pHeader)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProofOfPossessionCookieInfo) return false
        if (this.name != other.name) return false
        if (this.data != other.data) return false
        if (this.flags != other.flags) return false
        if (this.p3pHeader != other.p3pHeader) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.p3pHeader.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            data: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            p3pHeader: Pwstr = MutPtr(0L),
        ): ProofOfPossessionCookieInfo =
            ProofOfPossessionCookieInfo(
                nameCtorArg = name,
                dataCtorArg = data,
                flags = flags,
                p3pHeaderCtorArg = p3pHeader,
            )
    }
}

public class UrlcacheEntryInfo internal constructor(
    pwszSourceUrlNameCtorArg: Pwstr,
    pwszLocalFileNameCtorArg: Pwstr,
    public var dwCacheEntryType: UInt,
    public var dwUseCount: UInt,
    public var dwHitRate: UInt,
    public var dwSizeLow: UInt,
    public var dwSizeHigh: UInt,
    public var ftLastModifiedTime: Filetime,
    public var ftExpireTime: Filetime,
    public var ftLastAccessTime: Filetime,
    public var ftLastSyncTime: Filetime,
    pbHeaderInfoCtorArg: MutPtr<UByte>,
    public var cbHeaderInfoSize: UInt,
    pbExtraDataCtorArg: MutPtr<UByte>,
    public var cbExtraDataSize: UInt,
) {
    public var pwszSourceUrlName: Pwstr = pwszSourceUrlNameCtorArg
        internal set

    public var pwszLocalFileName: Pwstr = pwszLocalFileNameCtorArg
        internal set

    public var pbHeaderInfo: MutPtr<UByte> = pbHeaderInfoCtorArg
        internal set

    public var pbExtraData: MutPtr<UByte> = pbExtraDataCtorArg
        internal set

    public constructor() : this(
        pwszSourceUrlNameCtorArg = MutPtr(0L),
        pwszLocalFileNameCtorArg = MutPtr(0L),
        dwCacheEntryType = 0u,
        dwUseCount = 0u,
        dwHitRate = 0u,
        dwSizeLow = 0u,
        dwSizeHigh = 0u,
        ftLastModifiedTime = Filetime(),
        ftExpireTime = Filetime(),
        ftLastAccessTime = Filetime(),
        ftLastSyncTime = Filetime(),
        pbHeaderInfoCtorArg = MutPtr(0L),
        cbHeaderInfoSize = 0u,
        pbExtraDataCtorArg = MutPtr(0L),
        cbExtraDataSize = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszSourceUrlName

    public operator fun component2(): Pwstr = this.pwszLocalFileName

    public operator fun component3(): UInt = this.dwCacheEntryType

    public operator fun component4(): UInt = this.dwUseCount

    public operator fun component5(): UInt = this.dwHitRate

    public operator fun component6(): UInt = this.dwSizeLow

    public operator fun component7(): UInt = this.dwSizeHigh

    public operator fun component8(): Filetime = this.ftLastModifiedTime

    public operator fun component9(): Filetime = this.ftExpireTime

    public operator fun component10(): Filetime = this.ftLastAccessTime

    public operator fun component11(): Filetime = this.ftLastSyncTime

    public operator fun component12(): MutPtr<UByte> = this.pbHeaderInfo

    public operator fun component13(): UInt = this.cbHeaderInfoSize

    public operator fun component14(): MutPtr<UByte> = this.pbExtraData

    public operator fun component15(): UInt = this.cbExtraDataSize

    public fun copy(pwszSourceUrlName: Pwstr = this.pwszSourceUrlName, pwszLocalFileName: Pwstr = this.pwszLocalFileName, dwCacheEntryType: UInt = this.dwCacheEntryType, dwUseCount: UInt = this.dwUseCount, dwHitRate: UInt = this.dwHitRate, dwSizeLow: UInt = this.dwSizeLow, dwSizeHigh: UInt = this.dwSizeHigh, ftLastModifiedTime: Filetime = this.ftLastModifiedTime, ftExpireTime: Filetime = this.ftExpireTime, ftLastAccessTime: Filetime = this.ftLastAccessTime, ftLastSyncTime: Filetime = this.ftLastSyncTime, pbHeaderInfo: MutPtr<UByte> = this.pbHeaderInfo, cbHeaderInfoSize: UInt = this.cbHeaderInfoSize, pbExtraData: MutPtr<UByte> = this.pbExtraData, cbExtraDataSize: UInt = this.cbExtraDataSize): UrlcacheEntryInfo = UrlcacheEntryInfo(pwszSourceUrlNameCtorArg = pwszSourceUrlName, pwszLocalFileNameCtorArg = pwszLocalFileName, dwCacheEntryType = dwCacheEntryType, dwUseCount = dwUseCount, dwHitRate = dwHitRate, dwSizeLow = dwSizeLow, dwSizeHigh = dwSizeHigh, ftLastModifiedTime = ftLastModifiedTime, ftExpireTime = ftExpireTime, ftLastAccessTime = ftLastAccessTime, ftLastSyncTime = ftLastSyncTime, pbHeaderInfoCtorArg = pbHeaderInfo, cbHeaderInfoSize = cbHeaderInfoSize, pbExtraDataCtorArg = pbExtraData, cbExtraDataSize = cbExtraDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrlcacheEntryInfo) return false
        if (this.pwszSourceUrlName != other.pwszSourceUrlName) return false
        if (this.pwszLocalFileName != other.pwszLocalFileName) return false
        if (this.dwCacheEntryType != other.dwCacheEntryType) return false
        if (this.dwUseCount != other.dwUseCount) return false
        if (this.dwHitRate != other.dwHitRate) return false
        if (this.dwSizeLow != other.dwSizeLow) return false
        if (this.dwSizeHigh != other.dwSizeHigh) return false
        if (this.ftLastModifiedTime != other.ftLastModifiedTime) return false
        if (this.ftExpireTime != other.ftExpireTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastSyncTime != other.ftLastSyncTime) return false
        if (this.pbHeaderInfo != other.pbHeaderInfo) return false
        if (this.cbHeaderInfoSize != other.cbHeaderInfoSize) return false
        if (this.pbExtraData != other.pbExtraData) return false
        if (this.cbExtraDataSize != other.cbExtraDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszSourceUrlName.hashCode()
        result = 31 * result + this.pwszLocalFileName.hashCode()
        result = 31 * result + this.dwCacheEntryType.hashCode()
        result = 31 * result + this.dwUseCount.hashCode()
        result = 31 * result + this.dwHitRate.hashCode()
        result = 31 * result + this.dwSizeLow.hashCode()
        result = 31 * result + this.dwSizeHigh.hashCode()
        result = 31 * result + this.ftLastModifiedTime.hashCode()
        result = 31 * result + this.ftExpireTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastSyncTime.hashCode()
        result = 31 * result + this.pbHeaderInfo.hashCode()
        result = 31 * result + this.cbHeaderInfoSize.hashCode()
        result = 31 * result + this.pbExtraData.hashCode()
        result = 31 * result + this.cbExtraDataSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszSourceUrlName: Pwstr = MutPtr(0L),
            pwszLocalFileName: Pwstr = MutPtr(0L),
            dwCacheEntryType: UInt = 0u,
            dwUseCount: UInt = 0u,
            dwHitRate: UInt = 0u,
            dwSizeLow: UInt = 0u,
            dwSizeHigh: UInt = 0u,
            ftLastModifiedTime: Filetime = Filetime(),
            ftExpireTime: Filetime = Filetime(),
            ftLastAccessTime: Filetime = Filetime(),
            ftLastSyncTime: Filetime = Filetime(),
            pbHeaderInfo: MutPtr<UByte> = MutPtr(0L),
            cbHeaderInfoSize: UInt = 0u,
            pbExtraData: MutPtr<UByte> = MutPtr(0L),
            cbExtraDataSize: UInt = 0u,
        ): UrlcacheEntryInfo =
            UrlcacheEntryInfo(
                pwszSourceUrlNameCtorArg = pwszSourceUrlName,
                pwszLocalFileNameCtorArg = pwszLocalFileName,
                dwCacheEntryType = dwCacheEntryType,
                dwUseCount = dwUseCount,
                dwHitRate = dwHitRate,
                dwSizeLow = dwSizeLow,
                dwSizeHigh = dwSizeHigh,
                ftLastModifiedTime = ftLastModifiedTime,
                ftExpireTime = ftExpireTime,
                ftLastAccessTime = ftLastAccessTime,
                ftLastSyncTime = ftLastSyncTime,
                pbHeaderInfoCtorArg = pbHeaderInfo,
                cbHeaderInfoSize = cbHeaderInfoSize,
                pbExtraDataCtorArg = pbExtraData,
                cbExtraDataSize = cbExtraDataSize,
            )
    }
}

public class UrlComponentsa internal constructor(
    public var dwStructSize: UInt,
    lpszSchemeCtorArg: Pstr,
    public var dwSchemeLength: UInt,
    public var nScheme: InternetScheme,
    lpszHostNameCtorArg: Pstr,
    public var dwHostNameLength: UInt,
    public var nPort: UShort,
    lpszUserNameCtorArg: Pstr,
    public var dwUserNameLength: UInt,
    lpszPasswordCtorArg: Pstr,
    public var dwPasswordLength: UInt,
    lpszUrlPathCtorArg: Pstr,
    public var dwUrlPathLength: UInt,
    lpszExtraInfoCtorArg: Pstr,
    public var dwExtraInfoLength: UInt,
) {
    public var lpszScheme: Pstr = lpszSchemeCtorArg
        internal set

    public var lpszHostName: Pstr = lpszHostNameCtorArg
        internal set

    public var lpszUserName: Pstr = lpszUserNameCtorArg
        internal set

    public var lpszPassword: Pstr = lpszPasswordCtorArg
        internal set

    public var lpszUrlPath: Pstr = lpszUrlPathCtorArg
        internal set

    public var lpszExtraInfo: Pstr = lpszExtraInfoCtorArg
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

    public operator fun component2(): Pstr = this.lpszScheme

    public operator fun component3(): UInt = this.dwSchemeLength

    public operator fun component4(): InternetScheme = this.nScheme

    public operator fun component5(): Pstr = this.lpszHostName

    public operator fun component6(): UInt = this.dwHostNameLength

    public operator fun component7(): UShort = this.nPort

    public operator fun component8(): Pstr = this.lpszUserName

    public operator fun component9(): UInt = this.dwUserNameLength

    public operator fun component10(): Pstr = this.lpszPassword

    public operator fun component11(): UInt = this.dwPasswordLength

    public operator fun component12(): Pstr = this.lpszUrlPath

    public operator fun component13(): UInt = this.dwUrlPathLength

    public operator fun component14(): Pstr = this.lpszExtraInfo

    public operator fun component15(): UInt = this.dwExtraInfoLength

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszScheme: Pstr = this.lpszScheme, dwSchemeLength: UInt = this.dwSchemeLength, nScheme: InternetScheme = this.nScheme, lpszHostName: Pstr = this.lpszHostName, dwHostNameLength: UInt = this.dwHostNameLength, nPort: UShort = this.nPort, lpszUserName: Pstr = this.lpszUserName, dwUserNameLength: UInt = this.dwUserNameLength, lpszPassword: Pstr = this.lpszPassword, dwPasswordLength: UInt = this.dwPasswordLength, lpszUrlPath: Pstr = this.lpszUrlPath, dwUrlPathLength: UInt = this.dwUrlPathLength, lpszExtraInfo: Pstr = this.lpszExtraInfo, dwExtraInfoLength: UInt = this.dwExtraInfoLength): UrlComponentsa = UrlComponentsa(dwStructSize = dwStructSize, lpszSchemeCtorArg = lpszScheme, dwSchemeLength = dwSchemeLength, nScheme = nScheme, lpszHostNameCtorArg = lpszHostName, dwHostNameLength = dwHostNameLength, nPort = nPort, lpszUserNameCtorArg = lpszUserName, dwUserNameLength = dwUserNameLength, lpszPasswordCtorArg = lpszPassword, dwPasswordLength = dwPasswordLength, lpszUrlPathCtorArg = lpszUrlPath, dwUrlPathLength = dwUrlPathLength, lpszExtraInfoCtorArg = lpszExtraInfo, dwExtraInfoLength = dwExtraInfoLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrlComponentsa) return false
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
            lpszScheme: Pstr = MutPtr(0L),
            dwSchemeLength: UInt = 0u,
            nScheme: InternetScheme = 0,
            lpszHostName: Pstr = MutPtr(0L),
            dwHostNameLength: UInt = 0u,
            nPort: UShort = 0u,
            lpszUserName: Pstr = MutPtr(0L),
            dwUserNameLength: UInt = 0u,
            lpszPassword: Pstr = MutPtr(0L),
            dwPasswordLength: UInt = 0u,
            lpszUrlPath: Pstr = MutPtr(0L),
            dwUrlPathLength: UInt = 0u,
            lpszExtraInfo: Pstr = MutPtr(0L),
            dwExtraInfoLength: UInt = 0u,
        ): UrlComponentsa =
            UrlComponentsa(
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

public class UrlComponentsw internal constructor(
    public var dwStructSize: UInt,
    lpszSchemeCtorArg: Pwstr,
    public var dwSchemeLength: UInt,
    public var nScheme: InternetScheme,
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

    public operator fun component4(): InternetScheme = this.nScheme

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

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszScheme: Pwstr = this.lpszScheme, dwSchemeLength: UInt = this.dwSchemeLength, nScheme: InternetScheme = this.nScheme, lpszHostName: Pwstr = this.lpszHostName, dwHostNameLength: UInt = this.dwHostNameLength, nPort: UShort = this.nPort, lpszUserName: Pwstr = this.lpszUserName, dwUserNameLength: UInt = this.dwUserNameLength, lpszPassword: Pwstr = this.lpszPassword, dwPasswordLength: UInt = this.dwPasswordLength, lpszUrlPath: Pwstr = this.lpszUrlPath, dwUrlPathLength: UInt = this.dwUrlPathLength, lpszExtraInfo: Pwstr = this.lpszExtraInfo, dwExtraInfoLength: UInt = this.dwExtraInfoLength): UrlComponentsw = UrlComponentsw(dwStructSize = dwStructSize, lpszSchemeCtorArg = lpszScheme, dwSchemeLength = dwSchemeLength, nScheme = nScheme, lpszHostNameCtorArg = lpszHostName, dwHostNameLength = dwHostNameLength, nPort = nPort, lpszUserNameCtorArg = lpszUserName, dwUserNameLength = dwUserNameLength, lpszPasswordCtorArg = lpszPassword, dwPasswordLength = dwPasswordLength, lpszUrlPathCtorArg = lpszUrlPath, dwUrlPathLength = dwUrlPathLength, lpszExtraInfoCtorArg = lpszExtraInfo, dwExtraInfoLength = dwExtraInfoLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrlComponentsw) return false
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
            nScheme: InternetScheme = 0,
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
        ): UrlComponentsw =
            UrlComponentsw(
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

public class WininetProxyInfo internal constructor(
    public var fProxy: Bool,
    public var fBypass: Bool,
    public var proxyScheme: InternetScheme,
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

    public operator fun component3(): InternetScheme = this.proxyScheme

    public operator fun component4(): Pwstr = this.pwszProxy

    public operator fun component5(): UShort = this.proxyPort

    public fun copy(fProxy: Bool = this.fProxy, fBypass: Bool = this.fBypass, proxyScheme: InternetScheme = this.proxyScheme, pwszProxy: Pwstr = this.pwszProxy, proxyPort: UShort = this.proxyPort): WininetProxyInfo = WininetProxyInfo(fProxy = fProxy, fBypass = fBypass, proxyScheme = proxyScheme, pwszProxyCtorArg = pwszProxy, proxyPort = proxyPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WininetProxyInfo) return false
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
            proxyScheme: InternetScheme = 0,
            pwszProxy: Pwstr = MutPtr(0L),
            proxyPort: UShort = 0u,
        ): WininetProxyInfo =
            WininetProxyInfo(
                fProxy = fProxy,
                fBypass = fBypass,
                proxyScheme = proxyScheme,
                pwszProxyCtorArg = pwszProxy,
                proxyPort = proxyPort,
            )
    }
}

public class WininetProxyInfoList internal constructor(
    public var dwProxyInfoCount: UInt,
    pProxyInfoCtorArg: MutPtr<WininetProxyInfo>,
) {
    public var pProxyInfo: MutPtr<WininetProxyInfo> = pProxyInfoCtorArg
        internal set

    public constructor() : this(
        dwProxyInfoCount = 0u,
        pProxyInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwProxyInfoCount

    public operator fun component2(): MutPtr<WininetProxyInfo> = this.pProxyInfo

    public fun copy(dwProxyInfoCount: UInt = this.dwProxyInfoCount, pProxyInfo: MutPtr<WininetProxyInfo> = this.pProxyInfo): WininetProxyInfoList = WininetProxyInfoList(dwProxyInfoCount = dwProxyInfoCount, pProxyInfoCtorArg = pProxyInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WininetProxyInfoList) return false
        if (this.dwProxyInfoCount != other.dwProxyInfoCount) return false
        if (this.pProxyInfo != other.pProxyInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProxyInfoCount.hashCode()
        result = 31 * result + this.pProxyInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WininetProxyInfoList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WininetProxyInfoList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WininetProxyInfoList =
                    WininetProxyInfoList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WininetProxyInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WininetProxyInfoList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProxyInfoCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WininetProxyInfo>(64)
                    ).writeNative(addr + 8L, value.pProxyInfo)
                }
            }

        public operator fun invoke(
            dwProxyInfoCount: UInt = 0u,
            pProxyInfo: MutPtr<WininetProxyInfo> = MutPtr(0L),
        ): WininetProxyInfoList =
            WininetProxyInfoList(
                dwProxyInfoCount = dwProxyInfoCount,
                pProxyInfoCtorArg = pProxyInfo,
            )
    }
}
