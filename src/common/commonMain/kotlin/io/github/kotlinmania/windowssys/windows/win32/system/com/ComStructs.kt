@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Paramdesc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class Authenticateinfo(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Authenticateinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Authenticateinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Authenticateinfo =
                    Authenticateinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Authenticateinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public class Bindinfo internal constructor(
    public var cbSize: UInt,
    szExtraInfoCtorArg: Pwstr,
    public var stgmedData: Stgmedium,
    public var grfBindInfoF: UInt,
    public var dwBindVerb: UInt,
    szCustomVerbCtorArg: Pwstr,
    public var cbstgmedData: UInt,
    public var dwOptions: UInt,
    public var dwOptionsFlags: UInt,
    public var dwCodePage: UInt,
    public var securityAttributes: SecurityAttributes,
    public var iid: Guid,
    pUnkCtorArg: MutPtr,
    public var dwReserved: UInt,
) {
    public var szExtraInfo: Pwstr = szExtraInfoCtorArg
        internal set

    public var szCustomVerb: Pwstr = szCustomVerbCtorArg
        internal set

    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        szExtraInfoCtorArg = MutPtr(0L),
        stgmedData = Stgmedium(),
        grfBindInfoF = 0u,
        dwBindVerb = 0u,
        szCustomVerbCtorArg = MutPtr(0L),
        cbstgmedData = 0u,
        dwOptions = 0u,
        dwOptionsFlags = 0u,
        dwCodePage = 0u,
        securityAttributes = SecurityAttributes(),
        iid = Guid(),
        pUnkCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.szExtraInfo

    public operator fun component3(): Stgmedium = this.stgmedData

    public operator fun component4(): UInt = this.grfBindInfoF

    public operator fun component5(): UInt = this.dwBindVerb

    public operator fun component6(): Pwstr = this.szCustomVerb

    public operator fun component7(): UInt = this.cbstgmedData

    public operator fun component8(): UInt = this.dwOptions

    public operator fun component9(): UInt = this.dwOptionsFlags

    public operator fun component10(): UInt = this.dwCodePage

    public operator fun component11(): SecurityAttributes = this.securityAttributes

    public operator fun component12(): Guid = this.iid

    public operator fun component13(): MutPtr = this.pUnk

    public operator fun component14(): UInt = this.dwReserved

    public fun copy(cbSize: UInt = this.cbSize, szExtraInfo: Pwstr = this.szExtraInfo, stgmedData: Stgmedium = this.stgmedData, grfBindInfoF: UInt = this.grfBindInfoF, dwBindVerb: UInt = this.dwBindVerb, szCustomVerb: Pwstr = this.szCustomVerb, cbstgmedData: UInt = this.cbstgmedData, dwOptions: UInt = this.dwOptions, dwOptionsFlags: UInt = this.dwOptionsFlags, dwCodePage: UInt = this.dwCodePage, securityAttributes: SecurityAttributes = this.securityAttributes, iid: Guid = this.iid, pUnk: MutPtr = this.pUnk, dwReserved: UInt = this.dwReserved): Bindinfo = Bindinfo(cbSize = cbSize, szExtraInfoCtorArg = szExtraInfo, stgmedData = stgmedData, grfBindInfoF = grfBindInfoF, dwBindVerb = dwBindVerb, szCustomVerbCtorArg = szCustomVerb, cbstgmedData = cbstgmedData, dwOptions = dwOptions, dwOptionsFlags = dwOptionsFlags, dwCodePage = dwCodePage, securityAttributes = securityAttributes, iid = iid, pUnkCtorArg = pUnk, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bindinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.szExtraInfo != other.szExtraInfo) return false
        if (this.stgmedData != other.stgmedData) return false
        if (this.grfBindInfoF != other.grfBindInfoF) return false
        if (this.dwBindVerb != other.dwBindVerb) return false
        if (this.szCustomVerb != other.szCustomVerb) return false
        if (this.cbstgmedData != other.cbstgmedData) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwOptionsFlags != other.dwOptionsFlags) return false
        if (this.dwCodePage != other.dwCodePage) return false
        if (this.securityAttributes != other.securityAttributes) return false
        if (this.iid != other.iid) return false
        if (this.pUnk != other.pUnk) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.szExtraInfo.hashCode()
        result = 31 * result + this.stgmedData.hashCode()
        result = 31 * result + this.grfBindInfoF.hashCode()
        result = 31 * result + this.dwBindVerb.hashCode()
        result = 31 * result + this.szCustomVerb.hashCode()
        result = 31 * result + this.cbstgmedData.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwOptionsFlags.hashCode()
        result = 31 * result + this.dwCodePage.hashCode()
        result = 31 * result + this.securityAttributes.hashCode()
        result = 31 * result + this.iid.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            szExtraInfo: Pwstr = MutPtr(0L),
            stgmedData: Stgmedium = Stgmedium(),
            grfBindInfoF: UInt = 0u,
            dwBindVerb: UInt = 0u,
            szCustomVerb: Pwstr = MutPtr(0L),
            cbstgmedData: UInt = 0u,
            dwOptions: UInt = 0u,
            dwOptionsFlags: UInt = 0u,
            dwCodePage: UInt = 0u,
            securityAttributes: SecurityAttributes = SecurityAttributes(),
            iid: Guid = Guid(),
            pUnk: MutPtr = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): Bindinfo =
            Bindinfo(
                cbSize = cbSize,
                szExtraInfoCtorArg = szExtraInfo,
                stgmedData = stgmedData,
                grfBindInfoF = grfBindInfoF,
                dwBindVerb = dwBindVerb,
                szCustomVerbCtorArg = szCustomVerb,
                cbstgmedData = cbstgmedData,
                dwOptions = dwOptions,
                dwOptionsFlags = dwOptionsFlags,
                dwCodePage = dwCodePage,
                securityAttributes = securityAttributes,
                iid = iid,
                pUnkCtorArg = pUnk,
                dwReserved = dwReserved,
            )
    }
}

public class Bindptr internal constructor(
    lpfuncdescCtorArg: MutPtr,
    lpvardescCtorArg: MutPtr,
    lptcompCtorArg: MutPtr,
) {
    public var lpfuncdesc: MutPtr = lpfuncdescCtorArg
        internal set

    public var lpvardesc: MutPtr = lpvardescCtorArg
        internal set

    public var lptcomp: MutPtr = lptcompCtorArg
        internal set

    public constructor() : this(
        lpfuncdescCtorArg = MutPtr(0L),
        lpvardescCtorArg = MutPtr(0L),
        lptcompCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpfuncdesc

    public operator fun component2(): MutPtr = this.lpvardesc

    public operator fun component3(): MutPtr = this.lptcomp

    public fun copy(lpfuncdesc: MutPtr = this.lpfuncdesc, lpvardesc: MutPtr = this.lpvardesc, lptcomp: MutPtr = this.lptcomp): Bindptr = Bindptr(lpfuncdescCtorArg = lpfuncdesc, lpvardescCtorArg = lpvardesc, lptcompCtorArg = lptcomp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bindptr) return false
        if (this.lpfuncdesc != other.lpfuncdesc) return false
        if (this.lpvardesc != other.lpvardesc) return false
        if (this.lptcomp != other.lptcomp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpfuncdesc.hashCode()
        result = 31 * result + this.lpvardesc.hashCode()
        result = 31 * result + this.lptcomp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpfuncdesc: MutPtr = MutPtr(0L),
            lpvardesc: MutPtr = MutPtr(0L),
            lptcomp: MutPtr = MutPtr(0L),
        ): Bindptr =
            Bindptr(
                lpfuncdescCtorArg = lpfuncdesc,
                lpvardescCtorArg = lpvardesc,
                lptcompCtorArg = lptcomp,
            )
    }
}

public data class BindOpts(
    public var cbStruct: UInt = 0u,
    public var grfFlags: UInt = 0u,
    public var grfMode: UInt = 0u,
    public var dwTickCountDeadline: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BindOpts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BindOpts> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BindOpts =
                    BindOpts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BindOpts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.grfFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.grfMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTickCountDeadline)
                }
            }
    }
}

public class BindOpts2 internal constructor(
    public var base: BindOpts,
    public var dwTrackFlags: UInt,
    public var dwClassContext: UInt,
    public var locale: UInt,
    pServerInfoCtorArg: MutPtr,
) {
    public var pServerInfo: MutPtr = pServerInfoCtorArg
        internal set

    public constructor() : this(
        base = BindOpts(),
        dwTrackFlags = 0u,
        dwClassContext = 0u,
        locale = 0u,
        pServerInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): BindOpts = this.base

    public operator fun component2(): UInt = this.dwTrackFlags

    public operator fun component3(): UInt = this.dwClassContext

    public operator fun component4(): UInt = this.locale

    public operator fun component5(): MutPtr = this.pServerInfo

    public fun copy(base: BindOpts = this.base, dwTrackFlags: UInt = this.dwTrackFlags, dwClassContext: UInt = this.dwClassContext, locale: UInt = this.locale, pServerInfo: MutPtr = this.pServerInfo): BindOpts2 = BindOpts2(base = base, dwTrackFlags = dwTrackFlags, dwClassContext = dwClassContext, locale = locale, pServerInfoCtorArg = pServerInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BindOpts2) return false
        if (this.base != other.base) return false
        if (this.dwTrackFlags != other.dwTrackFlags) return false
        if (this.dwClassContext != other.dwClassContext) return false
        if (this.locale != other.locale) return false
        if (this.pServerInfo != other.pServerInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.dwTrackFlags.hashCode()
        result = 31 * result + this.dwClassContext.hashCode()
        result = 31 * result + this.locale.hashCode()
        result = 31 * result + this.pServerInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BindOpts2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BindOpts2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): BindOpts2 =
                    BindOpts2(
                        (BindOpts.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: BindOpts2) {
                    (BindOpts.typeLayout()).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTrackFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwClassContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.locale)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pServerInfo)
                }
            }

        public operator fun invoke(
            base: BindOpts = BindOpts(),
            dwTrackFlags: UInt = 0u,
            dwClassContext: UInt = 0u,
            locale: UInt = 0u,
            pServerInfo: MutPtr = MutPtr(0L),
        ): BindOpts2 =
            BindOpts2(
                base = base,
                dwTrackFlags = dwTrackFlags,
                dwClassContext = dwClassContext,
                locale = locale,
                pServerInfoCtorArg = pServerInfo,
            )
    }
}

public class BindOpts3 internal constructor(
    public var base: BindOpts2,
    hwndCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        base = BindOpts2(),
        hwndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): BindOpts2 = this.base

    public operator fun component2(): Hwnd = this.hwnd

    public fun copy(base: BindOpts2 = this.base, hwnd: Hwnd = this.hwnd): BindOpts3 = BindOpts3(base = base, hwndCtorArg = hwnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BindOpts3) return false
        if (this.base != other.base) return false
        if (this.hwnd != other.hwnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: BindOpts2 = BindOpts2(),
            hwnd: Hwnd = MutPtr(0L),
        ): BindOpts3 =
            BindOpts3(
                base = base,
                hwndCtorArg = hwnd,
            )
    }
}

public class Blob internal constructor(
    public var cbSize: UInt,
    pBlobDataCtorArg: MutPtr,
) {
    public var pBlobData: MutPtr = pBlobDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pBlobDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pBlobData

    public fun copy(cbSize: UInt = this.cbSize, pBlobData: MutPtr = this.pBlobData): Blob = Blob(cbSize = cbSize, pBlobDataCtorArg = pBlobData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Blob) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pBlobData != other.pBlobData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pBlobData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Blob =
                    Blob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Blob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pBlobData)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pBlobData: MutPtr = MutPtr(0L),
        ): Blob =
            Blob(
                cbSize = cbSize,
                pBlobDataCtorArg = pBlobData,
            )
    }
}

public data class ByteBlob(
    public var clSize: UInt = 0u,
    public var abData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ByteBlob) return false
        if (this.clSize != other.clSize) return false
        if (!this.abData.contentEquals(other.abData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.abData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ByteBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ByteBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ByteBlob =
                    ByteBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ByteBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.abData.toList())
                }
            }
    }
}

public class ByteSizedarr internal constructor(
    public var clSize: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        clSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clSize

    public operator fun component2(): MutPtr = this.pData

    public fun copy(clSize: UInt = this.clSize, pData: MutPtr = this.pData): ByteSizedarr = ByteSizedarr(clSize = clSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ByteSizedarr) return false
        if (this.clSize != other.clSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ByteSizedarr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ByteSizedarr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ByteSizedarr =
                    ByteSizedarr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ByteSizedarr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            clSize: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): ByteSizedarr =
            ByteSizedarr(
                clSize = clSize,
                pDataCtorArg = pData,
            )
    }
}

public data class Categoryinfo(
    public var catid: Guid = Guid(),
    public var lcid: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Categoryinfo) return false
        if (this.catid != other.catid) return false
        if (this.lcid != other.lcid) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.catid.hashCode()
        result = 31 * result + this.lcid.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public class Coauthidentity internal constructor(
    userCtorArg: MutPtr,
    public var userLength: UInt,
    domainCtorArg: MutPtr,
    public var domainLength: UInt,
    passwordCtorArg: MutPtr,
    public var passwordLength: UInt,
    public var flags: UInt,
) {
    public var user: MutPtr = userCtorArg
        internal set

    public var domain: MutPtr = domainCtorArg
        internal set

    public var password: MutPtr = passwordCtorArg
        internal set

    public constructor() : this(
        userCtorArg = MutPtr(0L),
        userLength = 0u,
        domainCtorArg = MutPtr(0L),
        domainLength = 0u,
        passwordCtorArg = MutPtr(0L),
        passwordLength = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr = this.user

    public operator fun component2(): UInt = this.userLength

    public operator fun component3(): MutPtr = this.domain

    public operator fun component4(): UInt = this.domainLength

    public operator fun component5(): MutPtr = this.password

    public operator fun component6(): UInt = this.passwordLength

    public operator fun component7(): UInt = this.flags

    public fun copy(user: MutPtr = this.user, userLength: UInt = this.userLength, domain: MutPtr = this.domain, domainLength: UInt = this.domainLength, password: MutPtr = this.password, passwordLength: UInt = this.passwordLength, flags: UInt = this.flags): Coauthidentity = Coauthidentity(userCtorArg = user, userLength = userLength, domainCtorArg = domain, domainLength = domainLength, passwordCtorArg = password, passwordLength = passwordLength, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coauthidentity) return false
        if (this.user != other.user) return false
        if (this.userLength != other.userLength) return false
        if (this.domain != other.domain) return false
        if (this.domainLength != other.domainLength) return false
        if (this.password != other.password) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.user.hashCode()
        result = 31 * result + this.userLength.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.domainLength.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coauthidentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coauthidentity> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Coauthidentity =
                    Coauthidentity(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Coauthidentity) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.userLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.domainLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.flags)
                }
            }

        public operator fun invoke(
            user: MutPtr = MutPtr(0L),
            userLength: UInt = 0u,
            domain: MutPtr = MutPtr(0L),
            domainLength: UInt = 0u,
            password: MutPtr = MutPtr(0L),
            passwordLength: UInt = 0u,
            flags: UInt = 0u,
        ): Coauthidentity =
            Coauthidentity(
                userCtorArg = user,
                userLength = userLength,
                domainCtorArg = domain,
                domainLength = domainLength,
                passwordCtorArg = password,
                passwordLength = passwordLength,
                flags = flags,
            )
    }
}

public class Coauthinfo internal constructor(
    public var dwAuthnSvc: UInt,
    public var dwAuthzSvc: UInt,
    pwszServerPrincNameCtorArg: Pwstr,
    public var dwAuthnLevel: UInt,
    public var dwImpersonationLevel: UInt,
    pAuthIdentityDataCtorArg: MutPtr,
    public var dwCapabilities: UInt,
) {
    public var pwszServerPrincName: Pwstr = pwszServerPrincNameCtorArg
        internal set

    public var pAuthIdentityData: MutPtr = pAuthIdentityDataCtorArg
        internal set

    public constructor() : this(
        dwAuthnSvc = 0u,
        dwAuthzSvc = 0u,
        pwszServerPrincNameCtorArg = MutPtr(0L),
        dwAuthnLevel = 0u,
        dwImpersonationLevel = 0u,
        pAuthIdentityDataCtorArg = MutPtr(0L),
        dwCapabilities = 0u,
    )

    public operator fun component1(): UInt = this.dwAuthnSvc

    public operator fun component2(): UInt = this.dwAuthzSvc

    public operator fun component3(): Pwstr = this.pwszServerPrincName

    public operator fun component4(): UInt = this.dwAuthnLevel

    public operator fun component5(): UInt = this.dwImpersonationLevel

    public operator fun component6(): MutPtr = this.pAuthIdentityData

    public operator fun component7(): UInt = this.dwCapabilities

    public fun copy(dwAuthnSvc: UInt = this.dwAuthnSvc, dwAuthzSvc: UInt = this.dwAuthzSvc, pwszServerPrincName: Pwstr = this.pwszServerPrincName, dwAuthnLevel: UInt = this.dwAuthnLevel, dwImpersonationLevel: UInt = this.dwImpersonationLevel, pAuthIdentityData: MutPtr = this.pAuthIdentityData, dwCapabilities: UInt = this.dwCapabilities): Coauthinfo = Coauthinfo(dwAuthnSvc = dwAuthnSvc, dwAuthzSvc = dwAuthzSvc, pwszServerPrincNameCtorArg = pwszServerPrincName, dwAuthnLevel = dwAuthnLevel, dwImpersonationLevel = dwImpersonationLevel, pAuthIdentityDataCtorArg = pAuthIdentityData, dwCapabilities = dwCapabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coauthinfo) return false
        if (this.dwAuthnSvc != other.dwAuthnSvc) return false
        if (this.dwAuthzSvc != other.dwAuthzSvc) return false
        if (this.pwszServerPrincName != other.pwszServerPrincName) return false
        if (this.dwAuthnLevel != other.dwAuthnLevel) return false
        if (this.dwImpersonationLevel != other.dwImpersonationLevel) return false
        if (this.pAuthIdentityData != other.pAuthIdentityData) return false
        if (this.dwCapabilities != other.dwCapabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAuthnSvc.hashCode()
        result = 31 * result + this.dwAuthzSvc.hashCode()
        result = 31 * result + this.pwszServerPrincName.hashCode()
        result = 31 * result + this.dwAuthnLevel.hashCode()
        result = 31 * result + this.dwImpersonationLevel.hashCode()
        result = 31 * result + this.pAuthIdentityData.hashCode()
        result = 31 * result + this.dwCapabilities.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAuthnSvc: UInt = 0u,
            dwAuthzSvc: UInt = 0u,
            pwszServerPrincName: Pwstr = MutPtr(0L),
            dwAuthnLevel: UInt = 0u,
            dwImpersonationLevel: UInt = 0u,
            pAuthIdentityData: MutPtr = MutPtr(0L),
            dwCapabilities: UInt = 0u,
        ): Coauthinfo =
            Coauthinfo(
                dwAuthnSvc = dwAuthnSvc,
                dwAuthzSvc = dwAuthzSvc,
                pwszServerPrincNameCtorArg = pwszServerPrincName,
                dwAuthnLevel = dwAuthnLevel,
                dwImpersonationLevel = dwImpersonationLevel,
                pAuthIdentityDataCtorArg = pAuthIdentityData,
                dwCapabilities = dwCapabilities,
            )
    }
}

public class Connectdata internal constructor(
    pUnkCtorArg: MutPtr,
    public var dwCookie: UInt,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        pUnkCtorArg = MutPtr(0L),
        dwCookie = 0u,
    )

    public operator fun component1(): MutPtr = this.pUnk

    public operator fun component2(): UInt = this.dwCookie

    public fun copy(pUnk: MutPtr = this.pUnk, dwCookie: UInt = this.dwCookie): Connectdata = Connectdata(pUnkCtorArg = pUnk, dwCookie = dwCookie)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Connectdata) return false
        if (this.pUnk != other.pUnk) return false
        if (this.dwCookie != other.dwCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pUnk.hashCode()
        result = 31 * result + this.dwCookie.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Connectdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Connectdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Connectdata =
                    Connectdata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Connectdata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pUnk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCookie)
                }
            }

        public operator fun invoke(
            pUnk: MutPtr = MutPtr(0L),
            dwCookie: UInt = 0u,
        ): Connectdata =
            Connectdata(
                pUnkCtorArg = pUnk,
                dwCookie = dwCookie,
            )
    }
}

public class Coserverinfo internal constructor(
    public var dwReserved1: UInt,
    pwszNameCtorArg: Pwstr,
    pAuthInfoCtorArg: MutPtr,
    public var dwReserved2: UInt,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pAuthInfo: MutPtr = pAuthInfoCtorArg
        internal set

    public constructor() : this(
        dwReserved1 = 0u,
        pwszNameCtorArg = MutPtr(0L),
        pAuthInfoCtorArg = MutPtr(0L),
        dwReserved2 = 0u,
    )

    public operator fun component1(): UInt = this.dwReserved1

    public operator fun component2(): Pwstr = this.pwszName

    public operator fun component3(): MutPtr = this.pAuthInfo

    public operator fun component4(): UInt = this.dwReserved2

    public fun copy(dwReserved1: UInt = this.dwReserved1, pwszName: Pwstr = this.pwszName, pAuthInfo: MutPtr = this.pAuthInfo, dwReserved2: UInt = this.dwReserved2): Coserverinfo = Coserverinfo(dwReserved1 = dwReserved1, pwszNameCtorArg = pwszName, pAuthInfoCtorArg = pAuthInfo, dwReserved2 = dwReserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coserverinfo) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pAuthInfo != other.pAuthInfo) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwReserved1.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pAuthInfo.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwReserved1: UInt = 0u,
            pwszName: Pwstr = MutPtr(0L),
            pAuthInfo: MutPtr = MutPtr(0L),
            dwReserved2: UInt = 0u,
        ): Coserverinfo =
            Coserverinfo(
                dwReserved1 = dwReserved1,
                pwszNameCtorArg = pwszName,
                pAuthInfoCtorArg = pAuthInfo,
                dwReserved2 = dwReserved2,
            )
    }
}

public data class Csplatform(
    public var dwPlatformId: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
    public var dwProcessorArch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Csplatform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Csplatform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Csplatform =
                    Csplatform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Csplatform) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPlatformId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersionHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVersionLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwProcessorArch)
                }
            }
    }
}

public class Custdata internal constructor(
    public var cCustData: UInt,
    prgCustDataCtorArg: MutPtr,
) {
    public var prgCustData: MutPtr = prgCustDataCtorArg
        internal set

    public constructor() : this(
        cCustData = 0u,
        prgCustDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCustData

    public operator fun component2(): MutPtr = this.prgCustData

    public fun copy(cCustData: UInt = this.cCustData, prgCustData: MutPtr = this.prgCustData): Custdata = Custdata(cCustData = cCustData, prgCustDataCtorArg = prgCustData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Custdata) return false
        if (this.cCustData != other.cCustData) return false
        if (this.prgCustData != other.prgCustData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCustData.hashCode()
        result = 31 * result + this.prgCustData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Custdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Custdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Custdata =
                    Custdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Custdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCustData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.prgCustData)
                }
            }

        public operator fun invoke(
            cCustData: UInt = 0u,
            prgCustData: MutPtr = MutPtr(0L),
        ): Custdata =
            Custdata(
                cCustData = cCustData,
                prgCustDataCtorArg = prgCustData,
            )
    }
}

public data class Custdataitem(
    public var guid: Guid = Guid(),
    public var varValue: Variant = Variant(),
)

public data class CY(
    public var anonymous: Cy0 = Cy0(),
    public var int64: Long = 0L,
)

public data class Cy0(
    public var lo: UInt = 0u,
    public var hi: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cy0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Cy0 =
                    Cy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Cy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hi)
                }
            }
    }
}

public class ComCallData internal constructor(
    public var dwDispid: UInt,
    public var dwReserved: UInt,
    pUserDefinedCtorArg: MutPtr,
) {
    public var pUserDefined: MutPtr = pUserDefinedCtorArg
        internal set

    public constructor() : this(
        dwDispid = 0u,
        dwReserved = 0u,
        pUserDefinedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwDispid

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): MutPtr = this.pUserDefined

    public fun copy(dwDispid: UInt = this.dwDispid, dwReserved: UInt = this.dwReserved, pUserDefined: MutPtr = this.pUserDefined): ComCallData = ComCallData(dwDispid = dwDispid, dwReserved = dwReserved, pUserDefinedCtorArg = pUserDefined)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ComCallData) return false
        if (this.dwDispid != other.dwDispid) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pUserDefined != other.pUserDefined) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDispid.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pUserDefined.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComCallData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComCallData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ComCallData =
                    ComCallData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ComCallData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDispid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pUserDefined)
                }
            }

        public operator fun invoke(
            dwDispid: UInt = 0u,
            dwReserved: UInt = 0u,
            pUserDefined: MutPtr = MutPtr(0L),
        ): ComCallData =
            ComCallData(
                dwDispid = dwDispid,
                dwReserved = dwReserved,
                pUserDefinedCtorArg = pUserDefined,
            )
    }
}

public class ContextProperty internal constructor(
    public var policyId: Guid,
    public var flags: UInt,
    pUnkCtorArg: MutPtr,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        policyId = Guid(),
        flags = 0u,
        pUnkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.policyId

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): MutPtr = this.pUnk

    public fun copy(policyId: Guid = this.policyId, flags: UInt = this.flags, pUnk: MutPtr = this.pUnk): ContextProperty = ContextProperty(policyId = policyId, flags = flags, pUnkCtorArg = pUnk)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContextProperty) return false
        if (this.policyId != other.policyId) return false
        if (this.flags != other.flags) return false
        if (this.pUnk != other.pUnk) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            policyId: Guid = Guid(),
            flags: UInt = 0u,
            pUnk: MutPtr = MutPtr(0L),
        ): ContextProperty =
            ContextProperty(
                policyId = policyId,
                flags = flags,
                pUnkCtorArg = pUnk,
            )
    }
}

public class Dispparams internal constructor(
    rgvargCtorArg: MutPtr,
    rgdispidNamedArgsCtorArg: MutPtr,
    public var cArgs: UInt,
    public var cNamedArgs: UInt,
) {
    public var rgvarg: MutPtr = rgvargCtorArg
        internal set

    public var rgdispidNamedArgs: MutPtr = rgdispidNamedArgsCtorArg
        internal set

    public constructor() : this(
        rgvargCtorArg = MutPtr(0L),
        rgdispidNamedArgsCtorArg = MutPtr(0L),
        cArgs = 0u,
        cNamedArgs = 0u,
    )

    public operator fun component1(): MutPtr = this.rgvarg

    public operator fun component2(): MutPtr = this.rgdispidNamedArgs

    public operator fun component3(): UInt = this.cArgs

    public operator fun component4(): UInt = this.cNamedArgs

    public fun copy(rgvarg: MutPtr = this.rgvarg, rgdispidNamedArgs: MutPtr = this.rgdispidNamedArgs, cArgs: UInt = this.cArgs, cNamedArgs: UInt = this.cNamedArgs): Dispparams = Dispparams(rgvargCtorArg = rgvarg, rgdispidNamedArgsCtorArg = rgdispidNamedArgs, cArgs = cArgs, cNamedArgs = cNamedArgs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dispparams) return false
        if (this.rgvarg != other.rgvarg) return false
        if (this.rgdispidNamedArgs != other.rgdispidNamedArgs) return false
        if (this.cArgs != other.cArgs) return false
        if (this.cNamedArgs != other.cNamedArgs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgvarg.hashCode()
        result = 31 * result + this.rgdispidNamedArgs.hashCode()
        result = 31 * result + this.cArgs.hashCode()
        result = 31 * result + this.cNamedArgs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dispparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dispparams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dispparams =
                    Dispparams(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dispparams) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.rgvarg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgdispidNamedArgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cArgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cNamedArgs)
                }
            }

        public operator fun invoke(
            rgvarg: MutPtr = MutPtr(0L),
            rgdispidNamedArgs: MutPtr = MutPtr(0L),
            cArgs: UInt = 0u,
            cNamedArgs: UInt = 0u,
        ): Dispparams =
            Dispparams(
                rgvargCtorArg = rgvarg,
                rgdispidNamedArgsCtorArg = rgdispidNamedArgs,
                cArgs = cArgs,
                cNamedArgs = cNamedArgs,
            )
    }
}

public data class Dvtargetdevice(
    public var tdSize: UInt = 0u,
    public var tdDriverNameOffset: UShort = 0u,
    public var tdDeviceNameOffset: UShort = 0u,
    public var tdPortNameOffset: UShort = 0u,
    public var tdExtDevmodeOffset: UShort = 0u,
    public var tdData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dvtargetdevice) return false
        if (this.tdSize != other.tdSize) return false
        if (this.tdDriverNameOffset != other.tdDriverNameOffset) return false
        if (this.tdDeviceNameOffset != other.tdDeviceNameOffset) return false
        if (this.tdPortNameOffset != other.tdPortNameOffset) return false
        if (this.tdExtDevmodeOffset != other.tdExtDevmodeOffset) return false
        if (!this.tdData.contentEquals(other.tdData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tdSize.hashCode()
        result = 31 * result + this.tdDriverNameOffset.hashCode()
        result = 31 * result + this.tdDeviceNameOffset.hashCode()
        result = 31 * result + this.tdPortNameOffset.hashCode()
        result = 31 * result + this.tdExtDevmodeOffset.hashCode()
        result = 31 * result + this.tdData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dvtargetdevice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dvtargetdevice> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dvtargetdevice =
                    Dvtargetdevice(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dvtargetdevice) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.tdDriverNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.tdDeviceNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.tdPortNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.tdExtDevmodeOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.tdData.toList())
                }
            }
    }
}

public data class DwordBlob(
    public var clSize: UInt = 0u,
    public var alData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DwordBlob) return false
        if (this.clSize != other.clSize) return false
        if (!this.alData.contentEquals(other.alData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.alData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DwordBlob =
                    DwordBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DwordBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.alData.toList())
                }
            }
    }
}

public class DwordSizedarr internal constructor(
    public var clSize: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        clSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clSize

    public operator fun component2(): MutPtr = this.pData

    public fun copy(clSize: UInt = this.clSize, pData: MutPtr = this.pData): DwordSizedarr = DwordSizedarr(clSize = clSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DwordSizedarr) return false
        if (this.clSize != other.clSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordSizedarr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordSizedarr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DwordSizedarr =
                    DwordSizedarr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DwordSizedarr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            clSize: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): DwordSizedarr =
            DwordSizedarr(
                clSize = clSize,
                pDataCtorArg = pData,
            )
    }
}

public data class Elemdesc(
    public var tdesc: Typedesc = Typedesc(),
    public var anonymous: Elemdesc0 = Elemdesc0(),
)

public data class Elemdesc0(
    public var idldesc: Idldesc = Idldesc(),
    public var paramdesc: Paramdesc = Paramdesc(),
)

public class Excepinfo internal constructor(
    public var wCode: UShort,
    public var wReserved: UShort,
    bstrSourceCtorArg: Bstr,
    bstrDescriptionCtorArg: Bstr,
    bstrHelpFileCtorArg: Bstr,
    public var dwHelpContext: UInt,
    pvReservedCtorArg: MutPtr,
    public var pfnDeferredFillIn: LpexcepfinoDeferredFillin,
    public var scode: Int,
) {
    public var bstrSource: Bstr = bstrSourceCtorArg
        internal set

    public var bstrDescription: Bstr = bstrDescriptionCtorArg
        internal set

    public var bstrHelpFile: Bstr = bstrHelpFileCtorArg
        internal set

    public var pvReserved: MutPtr = pvReservedCtorArg
        internal set

    public constructor() : this(
        wCode = 0u,
        wReserved = 0u,
        bstrSourceCtorArg = ConstPtr(0L),
        bstrDescriptionCtorArg = ConstPtr(0L),
        bstrHelpFileCtorArg = ConstPtr(0L),
        dwHelpContext = 0u,
        pvReservedCtorArg = MutPtr(0L),
        pfnDeferredFillIn = null,
        scode = 0,
    )

    public operator fun component1(): UShort = this.wCode

    public operator fun component2(): UShort = this.wReserved

    public operator fun component3(): Bstr = this.bstrSource

    public operator fun component4(): Bstr = this.bstrDescription

    public operator fun component5(): Bstr = this.bstrHelpFile

    public operator fun component6(): UInt = this.dwHelpContext

    public operator fun component7(): MutPtr = this.pvReserved

    public operator fun component8(): LpexcepfinoDeferredFillin = this.pfnDeferredFillIn

    public operator fun component9(): Int = this.scode

    public fun copy(wCode: UShort = this.wCode, wReserved: UShort = this.wReserved, bstrSource: Bstr = this.bstrSource, bstrDescription: Bstr = this.bstrDescription, bstrHelpFile: Bstr = this.bstrHelpFile, dwHelpContext: UInt = this.dwHelpContext, pvReserved: MutPtr = this.pvReserved, pfnDeferredFillIn: LpexcepfinoDeferredFillin = this.pfnDeferredFillIn, scode: Int = this.scode): Excepinfo = Excepinfo(wCode = wCode, wReserved = wReserved, bstrSourceCtorArg = bstrSource, bstrDescriptionCtorArg = bstrDescription, bstrHelpFileCtorArg = bstrHelpFile, dwHelpContext = dwHelpContext, pvReservedCtorArg = pvReserved, pfnDeferredFillIn = pfnDeferredFillIn, scode = scode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Excepinfo) return false
        if (this.wCode != other.wCode) return false
        if (this.wReserved != other.wReserved) return false
        if (this.bstrSource != other.bstrSource) return false
        if (this.bstrDescription != other.bstrDescription) return false
        if (this.bstrHelpFile != other.bstrHelpFile) return false
        if (this.dwHelpContext != other.dwHelpContext) return false
        if (this.pvReserved != other.pvReserved) return false
        if (this.pfnDeferredFillIn != other.pfnDeferredFillIn) return false
        if (this.scode != other.scode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wCode.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.bstrSource.hashCode()
        result = 31 * result + this.bstrDescription.hashCode()
        result = 31 * result + this.bstrHelpFile.hashCode()
        result = 31 * result + this.dwHelpContext.hashCode()
        result = 31 * result + this.pvReserved.hashCode()
        result = 31 * result + this.pfnDeferredFillIn.hashCode()
        result = 31 * result + this.scode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wCode: UShort = 0u,
            wReserved: UShort = 0u,
            bstrSource: Bstr = ConstPtr(0L),
            bstrDescription: Bstr = ConstPtr(0L),
            bstrHelpFile: Bstr = ConstPtr(0L),
            dwHelpContext: UInt = 0u,
            pvReserved: MutPtr = MutPtr(0L),
            pfnDeferredFillIn: LpexcepfinoDeferredFillin = null,
            scode: Int = 0,
        ): Excepinfo =
            Excepinfo(
                wCode = wCode,
                wReserved = wReserved,
                bstrSourceCtorArg = bstrSource,
                bstrDescriptionCtorArg = bstrDescription,
                bstrHelpFileCtorArg = bstrHelpFile,
                dwHelpContext = dwHelpContext,
                pvReservedCtorArg = pvReserved,
                pfnDeferredFillIn = pfnDeferredFillIn,
                scode = scode,
            )
    }
}

public data class FlaggedByteBlob(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var abData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlaggedByteBlob) return false
        if (this.fFlags != other.fFlags) return false
        if (this.clSize != other.clSize) return false
        if (!this.abData.contentEquals(other.abData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlags.hashCode()
        result = 31 * result + this.clSize.hashCode()
        result = 31 * result + this.abData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlaggedByteBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlaggedByteBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FlaggedByteBlob =
                    FlaggedByteBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FlaggedByteBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.abData.toList())
                }
            }
    }
}

public data class FlaggedWordBlob(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var asData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlaggedWordBlob) return false
        if (this.fFlags != other.fFlags) return false
        if (this.clSize != other.clSize) return false
        if (!this.asData.contentEquals(other.asData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlags.hashCode()
        result = 31 * result + this.clSize.hashCode()
        result = 31 * result + this.asData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlaggedWordBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlaggedWordBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FlaggedWordBlob =
                    FlaggedWordBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FlaggedWordBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.asData.toList())
                }
            }
    }
}

public data class FlagStgmedium(
    public var contextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var stgmed: Stgmedium = Stgmedium(),
)

public class Formatetc internal constructor(
    public var cfFormat: UShort,
    ptdCtorArg: MutPtr,
    public var dwAspect: UInt,
    public var lindex: Int,
    public var tymed: UInt,
) {
    public var ptd: MutPtr = ptdCtorArg
        internal set

    public constructor() : this(
        cfFormat = 0u,
        ptdCtorArg = MutPtr(0L),
        dwAspect = 0u,
        lindex = 0,
        tymed = 0u,
    )

    public operator fun component1(): UShort = this.cfFormat

    public operator fun component2(): MutPtr = this.ptd

    public operator fun component3(): UInt = this.dwAspect

    public operator fun component4(): Int = this.lindex

    public operator fun component5(): UInt = this.tymed

    public fun copy(cfFormat: UShort = this.cfFormat, ptd: MutPtr = this.ptd, dwAspect: UInt = this.dwAspect, lindex: Int = this.lindex, tymed: UInt = this.tymed): Formatetc = Formatetc(cfFormat = cfFormat, ptdCtorArg = ptd, dwAspect = dwAspect, lindex = lindex, tymed = tymed)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Formatetc) return false
        if (this.cfFormat != other.cfFormat) return false
        if (this.ptd != other.ptd) return false
        if (this.dwAspect != other.dwAspect) return false
        if (this.lindex != other.lindex) return false
        if (this.tymed != other.tymed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cfFormat.hashCode()
        result = 31 * result + this.ptd.hashCode()
        result = 31 * result + this.dwAspect.hashCode()
        result = 31 * result + this.lindex.hashCode()
        result = 31 * result + this.tymed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Formatetc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Formatetc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Formatetc =
                    Formatetc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Formatetc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cfFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ptd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAspect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lindex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tymed)
                }
            }

        public operator fun invoke(
            cfFormat: UShort = 0u,
            ptd: MutPtr = MutPtr(0L),
            dwAspect: UInt = 0u,
            lindex: Int = 0,
            tymed: UInt = 0u,
        ): Formatetc =
            Formatetc(
                cfFormat = cfFormat,
                ptdCtorArg = ptd,
                dwAspect = dwAspect,
                lindex = lindex,
                tymed = tymed,
            )
    }
}

public class Funcdesc internal constructor(
    public var memid: Int,
    lprgscodeCtorArg: MutPtr,
    lprgelemdescParamCtorArg: MutPtr,
    public var funckind: Funckind,
    public var invkind: Invokekind,
    public var callconv: Callconv,
    public var cParams: Short,
    public var cParamsOpt: Short,
    public var oVft: Short,
    public var cScodes: Short,
    public var elemdescFunc: Elemdesc,
    public var wFuncFlags: Funcflags,
) {
    public var lprgscode: MutPtr = lprgscodeCtorArg
        internal set

    public var lprgelemdescParam: MutPtr = lprgelemdescParamCtorArg
        internal set

    public constructor() : this(
        memid = 0,
        lprgscodeCtorArg = MutPtr(0L),
        lprgelemdescParamCtorArg = MutPtr(0L),
        funckind = 0,
        invkind = 0,
        callconv = 0,
        cParams = 0,
        cParamsOpt = 0,
        oVft = 0,
        cScodes = 0,
        elemdescFunc = Elemdesc(),
        wFuncFlags = 0u,
    )

    public operator fun component1(): Int = this.memid

    public operator fun component2(): MutPtr = this.lprgscode

    public operator fun component3(): MutPtr = this.lprgelemdescParam

    public operator fun component4(): Funckind = this.funckind

    public operator fun component5(): Invokekind = this.invkind

    public operator fun component6(): Callconv = this.callconv

    public operator fun component7(): Short = this.cParams

    public operator fun component8(): Short = this.cParamsOpt

    public operator fun component9(): Short = this.oVft

    public operator fun component10(): Short = this.cScodes

    public operator fun component11(): Elemdesc = this.elemdescFunc

    public operator fun component12(): Funcflags = this.wFuncFlags

    public fun copy(memid: Int = this.memid, lprgscode: MutPtr = this.lprgscode, lprgelemdescParam: MutPtr = this.lprgelemdescParam, funckind: Funckind = this.funckind, invkind: Invokekind = this.invkind, callconv: Callconv = this.callconv, cParams: Short = this.cParams, cParamsOpt: Short = this.cParamsOpt, oVft: Short = this.oVft, cScodes: Short = this.cScodes, elemdescFunc: Elemdesc = this.elemdescFunc, wFuncFlags: Funcflags = this.wFuncFlags): Funcdesc = Funcdesc(memid = memid, lprgscodeCtorArg = lprgscode, lprgelemdescParamCtorArg = lprgelemdescParam, funckind = funckind, invkind = invkind, callconv = callconv, cParams = cParams, cParamsOpt = cParamsOpt, oVft = oVft, cScodes = cScodes, elemdescFunc = elemdescFunc, wFuncFlags = wFuncFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Funcdesc) return false
        if (this.memid != other.memid) return false
        if (this.lprgscode != other.lprgscode) return false
        if (this.lprgelemdescParam != other.lprgelemdescParam) return false
        if (this.funckind != other.funckind) return false
        if (this.invkind != other.invkind) return false
        if (this.callconv != other.callconv) return false
        if (this.cParams != other.cParams) return false
        if (this.cParamsOpt != other.cParamsOpt) return false
        if (this.oVft != other.oVft) return false
        if (this.cScodes != other.cScodes) return false
        if (this.elemdescFunc != other.elemdescFunc) return false
        if (this.wFuncFlags != other.wFuncFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.memid.hashCode()
        result = 31 * result + this.lprgscode.hashCode()
        result = 31 * result + this.lprgelemdescParam.hashCode()
        result = 31 * result + this.funckind.hashCode()
        result = 31 * result + this.invkind.hashCode()
        result = 31 * result + this.callconv.hashCode()
        result = 31 * result + this.cParams.hashCode()
        result = 31 * result + this.cParamsOpt.hashCode()
        result = 31 * result + this.oVft.hashCode()
        result = 31 * result + this.cScodes.hashCode()
        result = 31 * result + this.elemdescFunc.hashCode()
        result = 31 * result + this.wFuncFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            memid: Int = 0,
            lprgscode: MutPtr = MutPtr(0L),
            lprgelemdescParam: MutPtr = MutPtr(0L),
            funckind: Funckind = 0,
            invkind: Invokekind = 0,
            callconv: Callconv = 0,
            cParams: Short = 0,
            cParamsOpt: Short = 0,
            oVft: Short = 0,
            cScodes: Short = 0,
            elemdescFunc: Elemdesc = Elemdesc(),
            wFuncFlags: Funcflags = 0u,
        ): Funcdesc =
            Funcdesc(
                memid = memid,
                lprgscodeCtorArg = lprgscode,
                lprgelemdescParamCtorArg = lprgelemdescParam,
                funckind = funckind,
                invkind = invkind,
                callconv = callconv,
                cParams = cParams,
                cParamsOpt = cParamsOpt,
                oVft = oVft,
                cScodes = cScodes,
                elemdescFunc = elemdescFunc,
                wFuncFlags = wFuncFlags,
            )
    }
}

public data class GdiObject(
    public var objectType: UInt = 0u,
    public var u: GdiObject0 = GdiObject0(),
)

public class GdiObject0 internal constructor(
    hBitmapCtorArg: MutPtr,
    hPaletteCtorArg: MutPtr,
    hGenericCtorArg: MutPtr,
) {
    public var hBitmap: MutPtr = hBitmapCtorArg
        internal set

    public var hPalette: MutPtr = hPaletteCtorArg
        internal set

    public var hGeneric: MutPtr = hGenericCtorArg
        internal set

    public constructor() : this(
        hBitmapCtorArg = MutPtr(0L),
        hPaletteCtorArg = MutPtr(0L),
        hGenericCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.hBitmap

    public operator fun component2(): MutPtr = this.hPalette

    public operator fun component3(): MutPtr = this.hGeneric

    public fun copy(hBitmap: MutPtr = this.hBitmap, hPalette: MutPtr = this.hPalette, hGeneric: MutPtr = this.hGeneric): GdiObject0 = GdiObject0(hBitmapCtorArg = hBitmap, hPaletteCtorArg = hPalette, hGenericCtorArg = hGeneric)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GdiObject0) return false
        if (this.hBitmap != other.hBitmap) return false
        if (this.hPalette != other.hPalette) return false
        if (this.hGeneric != other.hGeneric) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hBitmap.hashCode()
        result = 31 * result + this.hPalette.hashCode()
        result = 31 * result + this.hGeneric.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hBitmap: MutPtr = MutPtr(0L),
            hPalette: MutPtr = MutPtr(0L),
            hGeneric: MutPtr = MutPtr(0L),
        ): GdiObject0 =
            GdiObject0(
                hBitmapCtorArg = hBitmap,
                hPaletteCtorArg = hPalette,
                hGenericCtorArg = hGeneric,
            )
    }
}

public class HyperSizedarr internal constructor(
    public var clSize: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        clSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clSize

    public operator fun component2(): MutPtr = this.pData

    public fun copy(clSize: UInt = this.clSize, pData: MutPtr = this.pData): HyperSizedarr = HyperSizedarr(clSize = clSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HyperSizedarr) return false
        if (this.clSize != other.clSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HyperSizedarr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HyperSizedarr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HyperSizedarr =
                    HyperSizedarr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HyperSizedarr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            clSize: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): HyperSizedarr =
            HyperSizedarr(
                clSize = clSize,
                pDataCtorArg = pData,
            )
    }
}

public data class Idldesc(
    public var dwReserved: Int = 0,
    public var wIDLFlags: Idlflags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Idldesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Idldesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Idldesc =
                    Idldesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Idldesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wIDLFlags)
                }
            }
    }
}

public class Interfaceinfo internal constructor(
    pUnkCtorArg: MutPtr,
    public var iid: Guid,
    public var wMethod: UShort,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        pUnkCtorArg = MutPtr(0L),
        iid = Guid(),
        wMethod = 0u,
    )

    public operator fun component1(): MutPtr = this.pUnk

    public operator fun component2(): Guid = this.iid

    public operator fun component3(): UShort = this.wMethod

    public fun copy(pUnk: MutPtr = this.pUnk, iid: Guid = this.iid, wMethod: UShort = this.wMethod): Interfaceinfo = Interfaceinfo(pUnkCtorArg = pUnk, iid = iid, wMethod = wMethod)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Interfaceinfo) return false
        if (this.pUnk != other.pUnk) return false
        if (this.iid != other.iid) return false
        if (this.wMethod != other.wMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pUnk.hashCode()
        result = 31 * result + this.iid.hashCode()
        result = 31 * result + this.wMethod.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pUnk: MutPtr = MutPtr(0L),
            iid: Guid = Guid(),
            wMethod: UShort = 0u,
        ): Interfaceinfo =
            Interfaceinfo(
                pUnkCtorArg = pUnk,
                iid = iid,
                wMethod = wMethod,
            )
    }
}

public class MultiQi internal constructor(
    pIIDCtorArg: ConstPtr,
    pItfCtorArg: MutPtr,
    public var hr: Hresult,
) {
    public var pIID: ConstPtr = pIIDCtorArg
        internal set

    public var pItf: MutPtr = pItfCtorArg
        internal set

    public constructor() : this(
        pIIDCtorArg = ConstPtr(0L),
        pItfCtorArg = MutPtr(0L),
        hr = 0,
    )

    public operator fun component1(): ConstPtr = this.pIID

    public operator fun component2(): MutPtr = this.pItf

    public operator fun component3(): Hresult = this.hr

    public fun copy(pIID: ConstPtr = this.pIID, pItf: MutPtr = this.pItf, hr: Hresult = this.hr): MultiQi = MultiQi(pIIDCtorArg = pIID, pItfCtorArg = pItf, hr = hr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MultiQi) return false
        if (this.pIID != other.pIID) return false
        if (this.pItf != other.pItf) return false
        if (this.hr != other.hr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pIID.hashCode()
        result = 31 * result + this.pItf.hashCode()
        result = 31 * result + this.hr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MultiQi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MultiQi> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MultiQi =
                    MultiQi(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MultiQi) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.pIID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pItf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hr)
                }
            }

        public operator fun invoke(
            pIID: ConstPtr = ConstPtr(0L),
            pItf: MutPtr = MutPtr(0L),
            hr: Hresult = 0,
        ): MultiQi =
            MultiQi(
                pIIDCtorArg = pIID,
                pItfCtorArg = pItf,
                hr = hr,
            )
    }
}

public data class Querycontext(
    public var dwContext: UInt = 0u,
    public var platform: Csplatform = Csplatform(),
    public var locale: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Querycontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Querycontext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Querycontext =
                    Querycontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Csplatform.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Querycontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwContext)
                    (Csplatform.typeLayout()).writeNative(addr + 4L, value.platform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.locale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwVersionHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwVersionLo)
                }
            }
    }
}

public class Rpcolemessage internal constructor(
    reserved1CtorArg: MutPtr,
    public var dataRepresentation: UInt,
    bufferCtorArg: MutPtr,
    public var cbBuffer: UInt,
    public var iMethod: UInt,
    reserved2CtorArg: List<MutPtr>,
    public var rpcFlags: UInt,
) {
    public var reserved1: MutPtr = reserved1CtorArg
        internal set

    public var buffer: MutPtr = bufferCtorArg
        internal set

    public var reserved2: List<MutPtr> = reserved2CtorArg
        internal set

    public constructor() : this(
        reserved1CtorArg = MutPtr(0L),
        dataRepresentation = 0u,
        bufferCtorArg = MutPtr(0L),
        cbBuffer = 0u,
        iMethod = 0u,
        reserved2CtorArg = List(5) { MutPtr(0L) },
        rpcFlags = 0u,
    )

    public operator fun component1(): MutPtr = this.reserved1

    public operator fun component2(): UInt = this.dataRepresentation

    public operator fun component3(): MutPtr = this.buffer

    public operator fun component4(): UInt = this.cbBuffer

    public operator fun component5(): UInt = this.iMethod

    public operator fun component6(): List<MutPtr> = this.reserved2

    public operator fun component7(): UInt = this.rpcFlags

    public fun copy(reserved1: MutPtr = this.reserved1, dataRepresentation: UInt = this.dataRepresentation, buffer: MutPtr = this.buffer, cbBuffer: UInt = this.cbBuffer, iMethod: UInt = this.iMethod, reserved2: List<MutPtr> = this.reserved2, rpcFlags: UInt = this.rpcFlags): Rpcolemessage = Rpcolemessage(reserved1CtorArg = reserved1, dataRepresentation = dataRepresentation, bufferCtorArg = buffer, cbBuffer = cbBuffer, iMethod = iMethod, reserved2CtorArg = reserved2, rpcFlags = rpcFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rpcolemessage) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.dataRepresentation != other.dataRepresentation) return false
        if (this.buffer != other.buffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (this.iMethod != other.iMethod) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.rpcFlags != other.rpcFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.dataRepresentation.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.cbBuffer.hashCode()
        result = 31 * result + this.iMethod.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.rpcFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rpcolemessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rpcolemessage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Rpcolemessage =
                    Rpcolemessage(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout(64),
                                    (5).toInt(),
                                )
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: Rpcolemessage) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataRepresentation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.iMethod)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout(64),
                                (5).toInt(),
                            )
                    ).writeNative(addr + 32L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.rpcFlags)
                }
            }

        public operator fun invoke(
            reserved1: MutPtr = MutPtr(0L),
            dataRepresentation: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
            cbBuffer: UInt = 0u,
            iMethod: UInt = 0u,
            reserved2: List<MutPtr> = List(5) { MutPtr(0L) },
            rpcFlags: UInt = 0u,
        ): Rpcolemessage =
            Rpcolemessage(
                reserved1CtorArg = reserved1,
                dataRepresentation = dataRepresentation,
                bufferCtorArg = buffer,
                cbBuffer = cbBuffer,
                iMethod = iMethod,
                reserved2CtorArg = reserved2,
                rpcFlags = rpcFlags,
            )
    }
}

public data class RemSTGMEDIUM(
    public var tymed: UInt = 0u,
    public var dwHandleType: UInt = 0u,
    public var pData: UInt = 0u,
    public var pUnkForRelease: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemSTGMEDIUM) return false
        if (this.tymed != other.tymed) return false
        if (this.dwHandleType != other.dwHandleType) return false
        if (this.pData != other.pData) return false
        if (this.pUnkForRelease != other.pUnkForRelease) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tymed.hashCode()
        result = 31 * result + this.dwHandleType.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.pUnkForRelease.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemSTGMEDIUM> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemSTGMEDIUM> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RemSTGMEDIUM =
                    RemSTGMEDIUM(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemSTGMEDIUM) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tymed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHandleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pUnkForRelease)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.data.toList())
                }
            }
    }
}

public class Safearray internal constructor(
    public var cDims: UShort,
    public var fFeatures: AdvancedFeatureFlags,
    public var cbElements: UInt,
    public var cLocks: UInt,
    pvDataCtorArg: MutPtr,
    public var rgsabound: List<Safearraybound>,
) {
    public var pvData: MutPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        cDims = 0u,
        fFeatures = 0u,
        cbElements = 0u,
        cLocks = 0u,
        pvDataCtorArg = MutPtr(0L),
        rgsabound = List(1) { Safearraybound() },
    )

    public operator fun component1(): UShort = this.cDims

    public operator fun component2(): AdvancedFeatureFlags = this.fFeatures

    public operator fun component3(): UInt = this.cbElements

    public operator fun component4(): UInt = this.cLocks

    public operator fun component5(): MutPtr = this.pvData

    public operator fun component6(): List<Safearraybound> = this.rgsabound

    public fun copy(cDims: UShort = this.cDims, fFeatures: AdvancedFeatureFlags = this.fFeatures, cbElements: UInt = this.cbElements, cLocks: UInt = this.cLocks, pvData: MutPtr = this.pvData, rgsabound: List<Safearraybound> = this.rgsabound): Safearray = Safearray(cDims = cDims, fFeatures = fFeatures, cbElements = cbElements, cLocks = cLocks, pvDataCtorArg = pvData, rgsabound = rgsabound)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Safearray) return false
        if (this.cDims != other.cDims) return false
        if (this.fFeatures != other.fFeatures) return false
        if (this.cbElements != other.cbElements) return false
        if (this.cLocks != other.cLocks) return false
        if (this.pvData != other.pvData) return false
        if (this.rgsabound != other.rgsabound) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cDims.hashCode()
        result = 31 * result + this.fFeatures.hashCode()
        result = 31 * result + this.cbElements.hashCode()
        result = 31 * result + this.cLocks.hashCode()
        result = 31 * result + this.pvData.hashCode()
        result = 31 * result + this.rgsabound.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Safearray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Safearray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Safearray =
                    Safearray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Safearraybound.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Safearray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cDims)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.fFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cLocks)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pvData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Safearraybound.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.rgsabound)
                }
            }

        public operator fun invoke(
            cDims: UShort = 0u,
            fFeatures: AdvancedFeatureFlags = 0u,
            cbElements: UInt = 0u,
            cLocks: UInt = 0u,
            pvData: MutPtr = MutPtr(0L),
            rgsabound: List<Safearraybound> = List(1) { Safearraybound() },
        ): Safearray =
            Safearray(
                cDims = cDims,
                fFeatures = fFeatures,
                cbElements = cbElements,
                cLocks = cLocks,
                pvDataCtorArg = pvData,
                rgsabound = rgsabound,
            )
    }
}

public data class Safearraybound(
    public var cElements: UInt = 0u,
    public var lLbound: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Safearraybound> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Safearraybound> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Safearraybound =
                    Safearraybound(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Safearraybound) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lLbound)
                }
            }
    }
}

public class SChannelHookCallInfo internal constructor(
    public var iid: Guid,
    public var cbSize: UInt,
    public var uCausality: Guid,
    public var dwServerPid: UInt,
    public var iMethod: UInt,
    pObjectCtorArg: MutPtr,
) {
    public var pObject: MutPtr = pObjectCtorArg
        internal set

    public constructor() : this(
        iid = Guid(),
        cbSize = 0u,
        uCausality = Guid(),
        dwServerPid = 0u,
        iMethod = 0u,
        pObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.iid

    public operator fun component2(): UInt = this.cbSize

    public operator fun component3(): Guid = this.uCausality

    public operator fun component4(): UInt = this.dwServerPid

    public operator fun component5(): UInt = this.iMethod

    public operator fun component6(): MutPtr = this.pObject

    public fun copy(iid: Guid = this.iid, cbSize: UInt = this.cbSize, uCausality: Guid = this.uCausality, dwServerPid: UInt = this.dwServerPid, iMethod: UInt = this.iMethod, pObject: MutPtr = this.pObject): SChannelHookCallInfo = SChannelHookCallInfo(iid = iid, cbSize = cbSize, uCausality = uCausality, dwServerPid = dwServerPid, iMethod = iMethod, pObjectCtorArg = pObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SChannelHookCallInfo) return false
        if (this.iid != other.iid) return false
        if (this.cbSize != other.cbSize) return false
        if (this.uCausality != other.uCausality) return false
        if (this.dwServerPid != other.dwServerPid) return false
        if (this.iMethod != other.iMethod) return false
        if (this.pObject != other.pObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iid.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.uCausality.hashCode()
        result = 31 * result + this.dwServerPid.hashCode()
        result = 31 * result + this.iMethod.hashCode()
        result = 31 * result + this.pObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iid: Guid = Guid(),
            cbSize: UInt = 0u,
            uCausality: Guid = Guid(),
            dwServerPid: UInt = 0u,
            iMethod: UInt = 0u,
            pObject: MutPtr = MutPtr(0L),
        ): SChannelHookCallInfo =
            SChannelHookCallInfo(
                iid = iid,
                cbSize = cbSize,
                uCausality = uCausality,
                dwServerPid = dwServerPid,
                iMethod = iMethod,
                pObjectCtorArg = pObject,
            )
    }
}

public class SoleAuthenticationInfo internal constructor(
    public var dwAuthnSvc: UInt,
    public var dwAuthzSvc: UInt,
    pAuthInfoCtorArg: MutPtr,
) {
    public var pAuthInfo: MutPtr = pAuthInfoCtorArg
        internal set

    public constructor() : this(
        dwAuthnSvc = 0u,
        dwAuthzSvc = 0u,
        pAuthInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAuthnSvc

    public operator fun component2(): UInt = this.dwAuthzSvc

    public operator fun component3(): MutPtr = this.pAuthInfo

    public fun copy(dwAuthnSvc: UInt = this.dwAuthnSvc, dwAuthzSvc: UInt = this.dwAuthzSvc, pAuthInfo: MutPtr = this.pAuthInfo): SoleAuthenticationInfo = SoleAuthenticationInfo(dwAuthnSvc = dwAuthnSvc, dwAuthzSvc = dwAuthzSvc, pAuthInfoCtorArg = pAuthInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SoleAuthenticationInfo) return false
        if (this.dwAuthnSvc != other.dwAuthnSvc) return false
        if (this.dwAuthzSvc != other.dwAuthzSvc) return false
        if (this.pAuthInfo != other.pAuthInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAuthnSvc.hashCode()
        result = 31 * result + this.dwAuthzSvc.hashCode()
        result = 31 * result + this.pAuthInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoleAuthenticationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoleAuthenticationInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SoleAuthenticationInfo =
                    SoleAuthenticationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SoleAuthenticationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAuthnSvc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAuthzSvc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pAuthInfo)
                }
            }

        public operator fun invoke(
            dwAuthnSvc: UInt = 0u,
            dwAuthzSvc: UInt = 0u,
            pAuthInfo: MutPtr = MutPtr(0L),
        ): SoleAuthenticationInfo =
            SoleAuthenticationInfo(
                dwAuthnSvc = dwAuthnSvc,
                dwAuthzSvc = dwAuthzSvc,
                pAuthInfoCtorArg = pAuthInfo,
            )
    }
}

public class SoleAuthenticationList internal constructor(
    public var cAuthInfo: UInt,
    aAuthInfoCtorArg: MutPtr,
) {
    public var aAuthInfo: MutPtr = aAuthInfoCtorArg
        internal set

    public constructor() : this(
        cAuthInfo = 0u,
        aAuthInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cAuthInfo

    public operator fun component2(): MutPtr = this.aAuthInfo

    public fun copy(cAuthInfo: UInt = this.cAuthInfo, aAuthInfo: MutPtr = this.aAuthInfo): SoleAuthenticationList = SoleAuthenticationList(cAuthInfo = cAuthInfo, aAuthInfoCtorArg = aAuthInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SoleAuthenticationList) return false
        if (this.cAuthInfo != other.cAuthInfo) return false
        if (this.aAuthInfo != other.aAuthInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAuthInfo.hashCode()
        result = 31 * result + this.aAuthInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoleAuthenticationList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SoleAuthenticationList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SoleAuthenticationList =
                    SoleAuthenticationList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SoleAuthenticationList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAuthInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.aAuthInfo)
                }
            }

        public operator fun invoke(
            cAuthInfo: UInt = 0u,
            aAuthInfo: MutPtr = MutPtr(0L),
        ): SoleAuthenticationList =
            SoleAuthenticationList(
                cAuthInfo = cAuthInfo,
                aAuthInfoCtorArg = aAuthInfo,
            )
    }
}

public class SoleAuthenticationService internal constructor(
    public var dwAuthnSvc: UInt,
    public var dwAuthzSvc: UInt,
    pPrincipalNameCtorArg: Pwstr,
    public var hr: Hresult,
) {
    public var pPrincipalName: Pwstr = pPrincipalNameCtorArg
        internal set

    public constructor() : this(
        dwAuthnSvc = 0u,
        dwAuthzSvc = 0u,
        pPrincipalNameCtorArg = MutPtr(0L),
        hr = 0,
    )

    public operator fun component1(): UInt = this.dwAuthnSvc

    public operator fun component2(): UInt = this.dwAuthzSvc

    public operator fun component3(): Pwstr = this.pPrincipalName

    public operator fun component4(): Hresult = this.hr

    public fun copy(dwAuthnSvc: UInt = this.dwAuthnSvc, dwAuthzSvc: UInt = this.dwAuthzSvc, pPrincipalName: Pwstr = this.pPrincipalName, hr: Hresult = this.hr): SoleAuthenticationService = SoleAuthenticationService(dwAuthnSvc = dwAuthnSvc, dwAuthzSvc = dwAuthzSvc, pPrincipalNameCtorArg = pPrincipalName, hr = hr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SoleAuthenticationService) return false
        if (this.dwAuthnSvc != other.dwAuthnSvc) return false
        if (this.dwAuthzSvc != other.dwAuthzSvc) return false
        if (this.pPrincipalName != other.pPrincipalName) return false
        if (this.hr != other.hr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAuthnSvc.hashCode()
        result = 31 * result + this.dwAuthzSvc.hashCode()
        result = 31 * result + this.pPrincipalName.hashCode()
        result = 31 * result + this.hr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAuthnSvc: UInt = 0u,
            dwAuthzSvc: UInt = 0u,
            pPrincipalName: Pwstr = MutPtr(0L),
            hr: Hresult = 0,
        ): SoleAuthenticationService =
            SoleAuthenticationService(
                dwAuthnSvc = dwAuthnSvc,
                dwAuthzSvc = dwAuthzSvc,
                pPrincipalNameCtorArg = pPrincipalName,
                hr = hr,
            )
    }
}

public class Statdata internal constructor(
    public var formatetc: Formatetc,
    public var advf: UInt,
    pAdvSinkCtorArg: MutPtr,
    public var dwConnection: UInt,
) {
    public var pAdvSink: MutPtr = pAdvSinkCtorArg
        internal set

    public constructor() : this(
        formatetc = Formatetc(),
        advf = 0u,
        pAdvSinkCtorArg = MutPtr(0L),
        dwConnection = 0u,
    )

    public operator fun component1(): Formatetc = this.formatetc

    public operator fun component2(): UInt = this.advf

    public operator fun component3(): MutPtr = this.pAdvSink

    public operator fun component4(): UInt = this.dwConnection

    public fun copy(formatetc: Formatetc = this.formatetc, advf: UInt = this.advf, pAdvSink: MutPtr = this.pAdvSink, dwConnection: UInt = this.dwConnection): Statdata = Statdata(formatetc = formatetc, advf = advf, pAdvSinkCtorArg = pAdvSink, dwConnection = dwConnection)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statdata) return false
        if (this.formatetc != other.formatetc) return false
        if (this.advf != other.advf) return false
        if (this.pAdvSink != other.pAdvSink) return false
        if (this.dwConnection != other.dwConnection) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatetc.hashCode()
        result = 31 * result + this.advf.hashCode()
        result = 31 * result + this.pAdvSink.hashCode()
        result = 31 * result + this.dwConnection.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Statdata =
                    Statdata(
                        (Formatetc.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Statdata) {
                    (Formatetc.typeLayout()).writeNative(addr, value.formatetc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.advf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pAdvSink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwConnection)
                }
            }

        public operator fun invoke(
            formatetc: Formatetc = Formatetc(),
            advf: UInt = 0u,
            pAdvSink: MutPtr = MutPtr(0L),
            dwConnection: UInt = 0u,
        ): Statdata =
            Statdata(
                formatetc = formatetc,
                advf = advf,
                pAdvSinkCtorArg = pAdvSink,
                dwConnection = dwConnection,
            )
    }
}

public class Statstg internal constructor(
    pwcsNameCtorArg: Pwstr,
    public var type: UInt,
    public var cbSize: ULong,
    public var mtime: Filetime,
    public var ctime: Filetime,
    public var atime: Filetime,
    public var grfMode: Stgm,
    public var grfLocksSupported: UInt,
    public var clsid: Guid,
    public var grfStateBits: UInt,
    public var reserved: UInt,
) {
    public var pwcsName: Pwstr = pwcsNameCtorArg
        internal set

    public constructor() : this(
        pwcsNameCtorArg = MutPtr(0L),
        type = 0u,
        cbSize = 0uL,
        mtime = Filetime(),
        ctime = Filetime(),
        atime = Filetime(),
        grfMode = 0u,
        grfLocksSupported = 0u,
        clsid = Guid(),
        grfStateBits = 0u,
        reserved = 0u,
    )

    public operator fun component1(): Pwstr = this.pwcsName

    public operator fun component2(): UInt = this.type

    public operator fun component3(): ULong = this.cbSize

    public operator fun component4(): Filetime = this.mtime

    public operator fun component5(): Filetime = this.ctime

    public operator fun component6(): Filetime = this.atime

    public operator fun component7(): Stgm = this.grfMode

    public operator fun component8(): UInt = this.grfLocksSupported

    public operator fun component9(): Guid = this.clsid

    public operator fun component10(): UInt = this.grfStateBits

    public operator fun component11(): UInt = this.reserved

    public fun copy(pwcsName: Pwstr = this.pwcsName, type: UInt = this.type, cbSize: ULong = this.cbSize, mtime: Filetime = this.mtime, ctime: Filetime = this.ctime, atime: Filetime = this.atime, grfMode: Stgm = this.grfMode, grfLocksSupported: UInt = this.grfLocksSupported, clsid: Guid = this.clsid, grfStateBits: UInt = this.grfStateBits, reserved: UInt = this.reserved): Statstg = Statstg(pwcsNameCtorArg = pwcsName, type = type, cbSize = cbSize, mtime = mtime, ctime = ctime, atime = atime, grfMode = grfMode, grfLocksSupported = grfLocksSupported, clsid = clsid, grfStateBits = grfStateBits, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statstg) return false
        if (this.pwcsName != other.pwcsName) return false
        if (this.type != other.type) return false
        if (this.cbSize != other.cbSize) return false
        if (this.mtime != other.mtime) return false
        if (this.ctime != other.ctime) return false
        if (this.atime != other.atime) return false
        if (this.grfMode != other.grfMode) return false
        if (this.grfLocksSupported != other.grfLocksSupported) return false
        if (this.clsid != other.clsid) return false
        if (this.grfStateBits != other.grfStateBits) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwcsName.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.mtime.hashCode()
        result = 31 * result + this.ctime.hashCode()
        result = 31 * result + this.atime.hashCode()
        result = 31 * result + this.grfMode.hashCode()
        result = 31 * result + this.grfLocksSupported.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.grfStateBits.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwcsName: Pwstr = MutPtr(0L),
            type: UInt = 0u,
            cbSize: ULong = 0uL,
            mtime: Filetime = Filetime(),
            ctime: Filetime = Filetime(),
            atime: Filetime = Filetime(),
            grfMode: Stgm = 0u,
            grfLocksSupported: UInt = 0u,
            clsid: Guid = Guid(),
            grfStateBits: UInt = 0u,
            reserved: UInt = 0u,
        ): Statstg =
            Statstg(
                pwcsNameCtorArg = pwcsName,
                type = type,
                cbSize = cbSize,
                mtime = mtime,
                ctime = ctime,
                atime = atime,
                grfMode = grfMode,
                grfLocksSupported = grfLocksSupported,
                clsid = clsid,
                grfStateBits = grfStateBits,
                reserved = reserved,
            )
    }
}

public class Stgmedium internal constructor(
    public var tymed: UInt,
    public var u: Stgmedium0,
    pUnkForReleaseCtorArg: MutPtr,
) {
    public var pUnkForRelease: MutPtr = pUnkForReleaseCtorArg
        internal set

    public constructor() : this(
        tymed = 0u,
        u = Stgmedium0(),
        pUnkForReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.tymed

    public operator fun component2(): Stgmedium0 = this.u

    public operator fun component3(): MutPtr = this.pUnkForRelease

    public fun copy(tymed: UInt = this.tymed, u: Stgmedium0 = this.u, pUnkForRelease: MutPtr = this.pUnkForRelease): Stgmedium = Stgmedium(tymed = tymed, u = u, pUnkForReleaseCtorArg = pUnkForRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stgmedium) return false
        if (this.tymed != other.tymed) return false
        if (this.u != other.u) return false
        if (this.pUnkForRelease != other.pUnkForRelease) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tymed.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.pUnkForRelease.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tymed: UInt = 0u,
            u: Stgmedium0 = Stgmedium0(),
            pUnkForRelease: MutPtr = MutPtr(0L),
        ): Stgmedium =
            Stgmedium(
                tymed = tymed,
                u = u,
                pUnkForReleaseCtorArg = pUnkForRelease,
            )
    }
}

public class Stgmedium0 internal constructor(
    hBitmapCtorArg: Hbitmap,
    hMetaFilePictCtorArg: MutPtr,
    hEnhMetaFileCtorArg: Henhmetafile,
    hGlobalCtorArg: Hglobal,
    lpszFileNameCtorArg: Pwstr,
    pstmCtorArg: MutPtr,
    pstgCtorArg: MutPtr,
) {
    public var hBitmap: Hbitmap = hBitmapCtorArg
        internal set

    public var hMetaFilePict: MutPtr = hMetaFilePictCtorArg
        internal set

    public var hEnhMetaFile: Henhmetafile = hEnhMetaFileCtorArg
        internal set

    public var hGlobal: Hglobal = hGlobalCtorArg
        internal set

    public var lpszFileName: Pwstr = lpszFileNameCtorArg
        internal set

    public var pstm: MutPtr = pstmCtorArg
        internal set

    public var pstg: MutPtr = pstgCtorArg
        internal set

    public constructor() : this(
        hBitmapCtorArg = MutPtr(0L),
        hMetaFilePictCtorArg = MutPtr(0L),
        hEnhMetaFileCtorArg = MutPtr(0L),
        hGlobalCtorArg = MutPtr(0L),
        lpszFileNameCtorArg = MutPtr(0L),
        pstmCtorArg = MutPtr(0L),
        pstgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hBitmap

    public operator fun component2(): MutPtr = this.hMetaFilePict

    public operator fun component3(): Henhmetafile = this.hEnhMetaFile

    public operator fun component4(): Hglobal = this.hGlobal

    public operator fun component5(): Pwstr = this.lpszFileName

    public operator fun component6(): MutPtr = this.pstm

    public operator fun component7(): MutPtr = this.pstg

    public fun copy(hBitmap: Hbitmap = this.hBitmap, hMetaFilePict: MutPtr = this.hMetaFilePict, hEnhMetaFile: Henhmetafile = this.hEnhMetaFile, hGlobal: Hglobal = this.hGlobal, lpszFileName: Pwstr = this.lpszFileName, pstm: MutPtr = this.pstm, pstg: MutPtr = this.pstg): Stgmedium0 = Stgmedium0(hBitmapCtorArg = hBitmap, hMetaFilePictCtorArg = hMetaFilePict, hEnhMetaFileCtorArg = hEnhMetaFile, hGlobalCtorArg = hGlobal, lpszFileNameCtorArg = lpszFileName, pstmCtorArg = pstm, pstgCtorArg = pstg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stgmedium0) return false
        if (this.hBitmap != other.hBitmap) return false
        if (this.hMetaFilePict != other.hMetaFilePict) return false
        if (this.hEnhMetaFile != other.hEnhMetaFile) return false
        if (this.hGlobal != other.hGlobal) return false
        if (this.lpszFileName != other.lpszFileName) return false
        if (this.pstm != other.pstm) return false
        if (this.pstg != other.pstg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hBitmap.hashCode()
        result = 31 * result + this.hMetaFilePict.hashCode()
        result = 31 * result + this.hEnhMetaFile.hashCode()
        result = 31 * result + this.hGlobal.hashCode()
        result = 31 * result + this.lpszFileName.hashCode()
        result = 31 * result + this.pstm.hashCode()
        result = 31 * result + this.pstg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hBitmap: Hbitmap = MutPtr(0L),
            hMetaFilePict: MutPtr = MutPtr(0L),
            hEnhMetaFile: Henhmetafile = MutPtr(0L),
            hGlobal: Hglobal = MutPtr(0L),
            lpszFileName: Pwstr = MutPtr(0L),
            pstm: MutPtr = MutPtr(0L),
            pstg: MutPtr = MutPtr(0L),
        ): Stgmedium0 =
            Stgmedium0(
                hBitmapCtorArg = hBitmap,
                hMetaFilePictCtorArg = hMetaFilePict,
                hEnhMetaFileCtorArg = hEnhMetaFile,
                hGlobalCtorArg = hGlobal,
                lpszFileNameCtorArg = lpszFileName,
                pstmCtorArg = pstm,
                pstgCtorArg = pstg,
            )
    }
}

public class StorageLayout internal constructor(
    public var layoutType: UInt,
    pwcsElementNameCtorArg: Pwstr,
    public var cOffset: Long,
    public var cBytes: Long,
) {
    public var pwcsElementName: Pwstr = pwcsElementNameCtorArg
        internal set

    public constructor() : this(
        layoutType = 0u,
        pwcsElementNameCtorArg = MutPtr(0L),
        cOffset = 0L,
        cBytes = 0L,
    )

    public operator fun component1(): UInt = this.layoutType

    public operator fun component2(): Pwstr = this.pwcsElementName

    public operator fun component3(): Long = this.cOffset

    public operator fun component4(): Long = this.cBytes

    public fun copy(layoutType: UInt = this.layoutType, pwcsElementName: Pwstr = this.pwcsElementName, cOffset: Long = this.cOffset, cBytes: Long = this.cBytes): StorageLayout = StorageLayout(layoutType = layoutType, pwcsElementNameCtorArg = pwcsElementName, cOffset = cOffset, cBytes = cBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageLayout) return false
        if (this.layoutType != other.layoutType) return false
        if (this.pwcsElementName != other.pwcsElementName) return false
        if (this.cOffset != other.cOffset) return false
        if (this.cBytes != other.cBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layoutType.hashCode()
        result = 31 * result + this.pwcsElementName.hashCode()
        result = 31 * result + this.cOffset.hashCode()
        result = 31 * result + this.cBytes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            layoutType: UInt = 0u,
            pwcsElementName: Pwstr = MutPtr(0L),
            cOffset: Long = 0L,
            cBytes: Long = 0L,
        ): StorageLayout =
            StorageLayout(
                layoutType = layoutType,
                pwcsElementNameCtorArg = pwcsElementName,
                cOffset = cOffset,
                cBytes = cBytes,
            )
    }
}

public data class Tlibattr(
    public var guid: Guid = Guid(),
    public var lcid: UInt = 0u,
    public var syskind: Syskind = 0,
    public var wMajorVerNum: UShort = 0u,
    public var wMinorVerNum: UShort = 0u,
    public var wLibFlags: UShort = 0u,
)

public class Typeattr internal constructor(
    public var guid: Guid,
    public var lcid: UInt,
    public var dwReserved: UInt,
    public var memidConstructor: Int,
    public var memidDestructor: Int,
    lpstrSchemaCtorArg: Pwstr,
    public var cbSizeInstance: UInt,
    public var typekind: Typekind,
    public var cFuncs: UShort,
    public var cVars: UShort,
    public var cImplTypes: UShort,
    public var cbSizeVft: UShort,
    public var cbAlignment: UShort,
    public var wTypeFlags: UShort,
    public var wMajorVerNum: UShort,
    public var wMinorVerNum: UShort,
    public var tdescAlias: Typedesc,
    public var idldescType: Idldesc,
) {
    public var lpstrSchema: Pwstr = lpstrSchemaCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        lcid = 0u,
        dwReserved = 0u,
        memidConstructor = 0,
        memidDestructor = 0,
        lpstrSchemaCtorArg = MutPtr(0L),
        cbSizeInstance = 0u,
        typekind = 0,
        cFuncs = 0u,
        cVars = 0u,
        cImplTypes = 0u,
        cbSizeVft = 0u,
        cbAlignment = 0u,
        wTypeFlags = 0u,
        wMajorVerNum = 0u,
        wMinorVerNum = 0u,
        tdescAlias = Typedesc(),
        idldescType = Idldesc(),
    )

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            lcid: UInt = 0u,
            dwReserved: UInt = 0u,
            memidConstructor: Int = 0,
            memidDestructor: Int = 0,
            lpstrSchema: Pwstr = MutPtr(0L),
            cbSizeInstance: UInt = 0u,
            typekind: Typekind = 0,
            cFuncs: UShort = 0u,
            cVars: UShort = 0u,
            cImplTypes: UShort = 0u,
            cbSizeVft: UShort = 0u,
            cbAlignment: UShort = 0u,
            wTypeFlags: UShort = 0u,
            wMajorVerNum: UShort = 0u,
            wMinorVerNum: UShort = 0u,
            tdescAlias: Typedesc = Typedesc(),
            idldescType: Idldesc = Idldesc(),
        ): Typeattr =
            Typeattr(
                guid = guid,
                lcid = lcid,
                dwReserved = dwReserved,
                memidConstructor = memidConstructor,
                memidDestructor = memidDestructor,
                lpstrSchemaCtorArg = lpstrSchema,
                cbSizeInstance = cbSizeInstance,
                typekind = typekind,
                cFuncs = cFuncs,
                cVars = cVars,
                cImplTypes = cImplTypes,
                cbSizeVft = cbSizeVft,
                cbAlignment = cbAlignment,
                wTypeFlags = wTypeFlags,
                wMajorVerNum = wMajorVerNum,
                wMinorVerNum = wMinorVerNum,
                tdescAlias = tdescAlias,
                idldescType = idldescType,
            )
    }
}

public data class Typedesc(
    public var anonymous: Typedesc0 = Typedesc0(),
    public var vt: Varenum = 0u,
)

public class Typedesc0 internal constructor(
    lptdescCtorArg: MutPtr,
    lpadescCtorArg: MutPtr,
    public var hreftype: UInt,
) {
    public var lptdesc: MutPtr = lptdescCtorArg
        internal set

    public var lpadesc: MutPtr = lpadescCtorArg
        internal set

    public constructor() : this(
        lptdescCtorArg = MutPtr(0L),
        lpadescCtorArg = MutPtr(0L),
        hreftype = 0u,
    )

    public operator fun component1(): MutPtr = this.lptdesc

    public operator fun component2(): MutPtr = this.lpadesc

    public operator fun component3(): UInt = this.hreftype

    public fun copy(lptdesc: MutPtr = this.lptdesc, lpadesc: MutPtr = this.lpadesc, hreftype: UInt = this.hreftype): Typedesc0 = Typedesc0(lptdescCtorArg = lptdesc, lpadescCtorArg = lpadesc, hreftype = hreftype)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Typedesc0) return false
        if (this.lptdesc != other.lptdesc) return false
        if (this.lpadesc != other.lpadesc) return false
        if (this.hreftype != other.hreftype) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lptdesc.hashCode()
        result = 31 * result + this.lpadesc.hashCode()
        result = 31 * result + this.hreftype.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lptdesc: MutPtr = MutPtr(0L),
            lpadesc: MutPtr = MutPtr(0L),
            hreftype: UInt = 0u,
        ): Typedesc0 =
            Typedesc0(
                lptdescCtorArg = lptdesc,
                lpadescCtorArg = lpadesc,
                hreftype = hreftype,
            )
    }
}

public class Vardesc internal constructor(
    public var memid: Int,
    lpstrSchemaCtorArg: Pwstr,
    public var anonymous: Vardesc0,
    public var elemdescVar: Elemdesc,
    public var wVarFlags: Varflags,
    public var varkind: Varkind,
) {
    public var lpstrSchema: Pwstr = lpstrSchemaCtorArg
        internal set

    public constructor() : this(
        memid = 0,
        lpstrSchemaCtorArg = MutPtr(0L),
        anonymous = Vardesc0(),
        elemdescVar = Elemdesc(),
        wVarFlags = 0u,
        varkind = 0,
    )

    public operator fun component1(): Int = this.memid

    public operator fun component2(): Pwstr = this.lpstrSchema

    public operator fun component3(): Vardesc0 = this.anonymous

    public operator fun component4(): Elemdesc = this.elemdescVar

    public operator fun component5(): Varflags = this.wVarFlags

    public operator fun component6(): Varkind = this.varkind

    public fun copy(memid: Int = this.memid, lpstrSchema: Pwstr = this.lpstrSchema, anonymous: Vardesc0 = this.anonymous, elemdescVar: Elemdesc = this.elemdescVar, wVarFlags: Varflags = this.wVarFlags, varkind: Varkind = this.varkind): Vardesc = Vardesc(memid = memid, lpstrSchemaCtorArg = lpstrSchema, anonymous = anonymous, elemdescVar = elemdescVar, wVarFlags = wVarFlags, varkind = varkind)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vardesc) return false
        if (this.memid != other.memid) return false
        if (this.lpstrSchema != other.lpstrSchema) return false
        if (this.anonymous != other.anonymous) return false
        if (this.elemdescVar != other.elemdescVar) return false
        if (this.wVarFlags != other.wVarFlags) return false
        if (this.varkind != other.varkind) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.memid.hashCode()
        result = 31 * result + this.lpstrSchema.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.elemdescVar.hashCode()
        result = 31 * result + this.wVarFlags.hashCode()
        result = 31 * result + this.varkind.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            memid: Int = 0,
            lpstrSchema: Pwstr = MutPtr(0L),
            anonymous: Vardesc0 = Vardesc0(),
            elemdescVar: Elemdesc = Elemdesc(),
            wVarFlags: Varflags = 0u,
            varkind: Varkind = 0,
        ): Vardesc =
            Vardesc(
                memid = memid,
                lpstrSchemaCtorArg = lpstrSchema,
                anonymous = anonymous,
                elemdescVar = elemdescVar,
                wVarFlags = wVarFlags,
                varkind = varkind,
            )
    }
}

public class Vardesc0 internal constructor(
    public var oInst: UInt,
    lpvarValueCtorArg: MutPtr,
) {
    public var lpvarValue: MutPtr = lpvarValueCtorArg
        internal set

    public constructor() : this(
        oInst = 0u,
        lpvarValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.oInst

    public operator fun component2(): MutPtr = this.lpvarValue

    public fun copy(oInst: UInt = this.oInst, lpvarValue: MutPtr = this.lpvarValue): Vardesc0 = Vardesc0(oInst = oInst, lpvarValueCtorArg = lpvarValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vardesc0) return false
        if (this.oInst != other.oInst) return false
        if (this.lpvarValue != other.lpvarValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oInst.hashCode()
        result = 31 * result + this.lpvarValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            oInst: UInt = 0u,
            lpvarValue: MutPtr = MutPtr(0L),
        ): Vardesc0 =
            Vardesc0(
                oInst = oInst,
                lpvarValueCtorArg = lpvarValue,
            )
    }
}

public data class WordBlob(
    public var clSize: UInt = 0u,
    public var asData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WordBlob) return false
        if (this.clSize != other.clSize) return false
        if (!this.asData.contentEquals(other.asData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.asData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WordBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WordBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WordBlob =
                    WordBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WordBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.asData.toList())
                }
            }
    }
}

public class WordSizedarr internal constructor(
    public var clSize: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        clSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clSize

    public operator fun component2(): MutPtr = this.pData

    public fun copy(clSize: UInt = this.clSize, pData: MutPtr = this.pData): WordSizedarr = WordSizedarr(clSize = clSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WordSizedarr) return false
        if (this.clSize != other.clSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WordSizedarr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WordSizedarr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WordSizedarr =
                    WordSizedarr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WordSizedarr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            clSize: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): WordSizedarr =
            WordSizedarr(
                clSize = clSize,
                pDataCtorArg = pData,
            )
    }
}

public data class UClsspec(
    public var tyspec: UInt = 0u,
    public var taggedUnion: UClsspec0 = UClsspec0(),
)

public class UClsspec0 internal constructor(
    public var clsid: Guid,
    pFileExtCtorArg: Pwstr,
    pMimeTypeCtorArg: Pwstr,
    pProgIdCtorArg: Pwstr,
    pFileNameCtorArg: Pwstr,
    public var byName: UClsspec00,
    public var byObjectId: UClsspec01,
) {
    public var pFileExt: Pwstr = pFileExtCtorArg
        internal set

    public var pMimeType: Pwstr = pMimeTypeCtorArg
        internal set

    public var pProgId: Pwstr = pProgIdCtorArg
        internal set

    public var pFileName: Pwstr = pFileNameCtorArg
        internal set

    public constructor() : this(
        clsid = Guid(),
        pFileExtCtorArg = MutPtr(0L),
        pMimeTypeCtorArg = MutPtr(0L),
        pProgIdCtorArg = MutPtr(0L),
        pFileNameCtorArg = MutPtr(0L),
        byName = UClsspec00(),
        byObjectId = UClsspec01(),
    )

    public operator fun component1(): Guid = this.clsid

    public operator fun component2(): Pwstr = this.pFileExt

    public operator fun component3(): Pwstr = this.pMimeType

    public operator fun component4(): Pwstr = this.pProgId

    public operator fun component5(): Pwstr = this.pFileName

    public operator fun component6(): UClsspec00 = this.byName

    public operator fun component7(): UClsspec01 = this.byObjectId

    public fun copy(clsid: Guid = this.clsid, pFileExt: Pwstr = this.pFileExt, pMimeType: Pwstr = this.pMimeType, pProgId: Pwstr = this.pProgId, pFileName: Pwstr = this.pFileName, byName: UClsspec00 = this.byName, byObjectId: UClsspec01 = this.byObjectId): UClsspec0 = UClsspec0(clsid = clsid, pFileExtCtorArg = pFileExt, pMimeTypeCtorArg = pMimeType, pProgIdCtorArg = pProgId, pFileNameCtorArg = pFileName, byName = byName, byObjectId = byObjectId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UClsspec0) return false
        if (this.clsid != other.clsid) return false
        if (this.pFileExt != other.pFileExt) return false
        if (this.pMimeType != other.pMimeType) return false
        if (this.pProgId != other.pProgId) return false
        if (this.pFileName != other.pFileName) return false
        if (this.byName != other.byName) return false
        if (this.byObjectId != other.byObjectId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsid.hashCode()
        result = 31 * result + this.pFileExt.hashCode()
        result = 31 * result + this.pMimeType.hashCode()
        result = 31 * result + this.pProgId.hashCode()
        result = 31 * result + this.pFileName.hashCode()
        result = 31 * result + this.byName.hashCode()
        result = 31 * result + this.byObjectId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsid: Guid = Guid(),
            pFileExt: Pwstr = MutPtr(0L),
            pMimeType: Pwstr = MutPtr(0L),
            pProgId: Pwstr = MutPtr(0L),
            pFileName: Pwstr = MutPtr(0L),
            byName: UClsspec00 = UClsspec00(),
            byObjectId: UClsspec01 = UClsspec01(),
        ): UClsspec0 =
            UClsspec0(
                clsid = clsid,
                pFileExtCtorArg = pFileExt,
                pMimeTypeCtorArg = pMimeType,
                pProgIdCtorArg = pProgId,
                pFileNameCtorArg = pFileName,
                byName = byName,
                byObjectId = byObjectId,
            )
    }
}

public class UClsspec00 internal constructor(
    pPackageNameCtorArg: Pwstr,
    public var policyId: Guid,
) {
    public var pPackageName: Pwstr = pPackageNameCtorArg
        internal set

    public constructor() : this(
        pPackageNameCtorArg = MutPtr(0L),
        policyId = Guid(),
    )

    public operator fun component1(): Pwstr = this.pPackageName

    public operator fun component2(): Guid = this.policyId

    public fun copy(pPackageName: Pwstr = this.pPackageName, policyId: Guid = this.policyId): UClsspec00 = UClsspec00(pPackageNameCtorArg = pPackageName, policyId = policyId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UClsspec00) return false
        if (this.pPackageName != other.pPackageName) return false
        if (this.policyId != other.policyId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPackageName.hashCode()
        result = 31 * result + this.policyId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPackageName: Pwstr = MutPtr(0L),
            policyId: Guid = Guid(),
        ): UClsspec00 =
            UClsspec00(
                pPackageNameCtorArg = pPackageName,
                policyId = policyId,
            )
    }
}

public data class UClsspec01(
    public var objectId: Guid = Guid(),
    public var policyId: Guid = Guid(),
)

public data class UserFlagStgmedium(
    public var contextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var stgmed: UserStgmedium = UserStgmedium(),
)

public class UserStgmedium internal constructor(
    public var u: UserStgmedium0,
    pUnkForReleaseCtorArg: MutPtr,
) {
    public var pUnkForRelease: MutPtr = pUnkForReleaseCtorArg
        internal set

    public constructor() : this(
        u = UserStgmedium0(),
        pUnkForReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UserStgmedium0 = this.u

    public operator fun component2(): MutPtr = this.pUnkForRelease

    public fun copy(u: UserStgmedium0 = this.u, pUnkForRelease: MutPtr = this.pUnkForRelease): UserStgmedium = UserStgmedium(u = u, pUnkForReleaseCtorArg = pUnkForRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserStgmedium) return false
        if (this.u != other.u) return false
        if (this.pUnkForRelease != other.pUnkForRelease) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.u.hashCode()
        result = 31 * result + this.pUnkForRelease.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            u: UserStgmedium0 = UserStgmedium0(),
            pUnkForRelease: MutPtr = MutPtr(0L),
        ): UserStgmedium =
            UserStgmedium(
                u = u,
                pUnkForReleaseCtorArg = pUnkForRelease,
            )
    }
}

public data class UserStgmedium0(
    public var tymed: UInt = 0u,
    public var u: UserStgmedium00 = UserStgmedium00(),
)

public class UserStgmedium00 internal constructor(
    hMetaFilePictCtorArg: MutPtr,
    hHEnhMetaFileCtorArg: MutPtr,
    hGdiHandleCtorArg: MutPtr,
    hGlobalCtorArg: MutPtr,
    lpszFileNameCtorArg: Pwstr,
    pstmCtorArg: MutPtr,
    pstgCtorArg: MutPtr,
) {
    public var hMetaFilePict: MutPtr = hMetaFilePictCtorArg
        internal set

    public var hHEnhMetaFile: MutPtr = hHEnhMetaFileCtorArg
        internal set

    public var hGdiHandle: MutPtr = hGdiHandleCtorArg
        internal set

    public var hGlobal: MutPtr = hGlobalCtorArg
        internal set

    public var lpszFileName: Pwstr = lpszFileNameCtorArg
        internal set

    public var pstm: MutPtr = pstmCtorArg
        internal set

    public var pstg: MutPtr = pstgCtorArg
        internal set

    public constructor() : this(
        hMetaFilePictCtorArg = MutPtr(0L),
        hHEnhMetaFileCtorArg = MutPtr(0L),
        hGdiHandleCtorArg = MutPtr(0L),
        hGlobalCtorArg = MutPtr(0L),
        lpszFileNameCtorArg = MutPtr(0L),
        pstmCtorArg = MutPtr(0L),
        pstgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.hMetaFilePict

    public operator fun component2(): MutPtr = this.hHEnhMetaFile

    public operator fun component3(): MutPtr = this.hGdiHandle

    public operator fun component4(): MutPtr = this.hGlobal

    public operator fun component5(): Pwstr = this.lpszFileName

    public operator fun component6(): MutPtr = this.pstm

    public operator fun component7(): MutPtr = this.pstg

    public fun copy(hMetaFilePict: MutPtr = this.hMetaFilePict, hHEnhMetaFile: MutPtr = this.hHEnhMetaFile, hGdiHandle: MutPtr = this.hGdiHandle, hGlobal: MutPtr = this.hGlobal, lpszFileName: Pwstr = this.lpszFileName, pstm: MutPtr = this.pstm, pstg: MutPtr = this.pstg): UserStgmedium00 = UserStgmedium00(hMetaFilePictCtorArg = hMetaFilePict, hHEnhMetaFileCtorArg = hHEnhMetaFile, hGdiHandleCtorArg = hGdiHandle, hGlobalCtorArg = hGlobal, lpszFileNameCtorArg = lpszFileName, pstmCtorArg = pstm, pstgCtorArg = pstg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserStgmedium00) return false
        if (this.hMetaFilePict != other.hMetaFilePict) return false
        if (this.hHEnhMetaFile != other.hHEnhMetaFile) return false
        if (this.hGdiHandle != other.hGdiHandle) return false
        if (this.hGlobal != other.hGlobal) return false
        if (this.lpszFileName != other.lpszFileName) return false
        if (this.pstm != other.pstm) return false
        if (this.pstg != other.pstg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hMetaFilePict.hashCode()
        result = 31 * result + this.hHEnhMetaFile.hashCode()
        result = 31 * result + this.hGdiHandle.hashCode()
        result = 31 * result + this.hGlobal.hashCode()
        result = 31 * result + this.lpszFileName.hashCode()
        result = 31 * result + this.pstm.hashCode()
        result = 31 * result + this.pstg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hMetaFilePict: MutPtr = MutPtr(0L),
            hHEnhMetaFile: MutPtr = MutPtr(0L),
            hGdiHandle: MutPtr = MutPtr(0L),
            hGlobal: MutPtr = MutPtr(0L),
            lpszFileName: Pwstr = MutPtr(0L),
            pstm: MutPtr = MutPtr(0L),
            pstg: MutPtr = MutPtr(0L),
        ): UserStgmedium00 =
            UserStgmedium00(
                hMetaFilePictCtorArg = hMetaFilePict,
                hHEnhMetaFileCtorArg = hHEnhMetaFile,
                hGdiHandleCtorArg = hGdiHandle,
                hGlobalCtorArg = hGlobal,
                lpszFileNameCtorArg = lpszFileName,
                pstmCtorArg = pstm,
                pstgCtorArg = pstg,
            )
    }
}
