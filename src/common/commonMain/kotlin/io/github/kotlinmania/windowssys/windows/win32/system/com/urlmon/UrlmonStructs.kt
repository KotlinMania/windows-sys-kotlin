@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public class Codebasehold internal constructor(
    public var cbSize: UInt,
    szDistUnitCtorArg: Pwstr,
    szCodeBaseCtorArg: Pwstr,
    public var dwVersionMS: UInt,
    public var dwVersionLS: UInt,
    public var dwStyle: UInt,
) {
    public var szDistUnit: Pwstr = szDistUnitCtorArg
        internal set

    public var szCodeBase: Pwstr = szCodeBaseCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        szDistUnitCtorArg = MutPtr(0L),
        szCodeBaseCtorArg = MutPtr(0L),
        dwVersionMS = 0u,
        dwVersionLS = 0u,
        dwStyle = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.szDistUnit

    public operator fun component3(): Pwstr = this.szCodeBase

    public operator fun component4(): UInt = this.dwVersionMS

    public operator fun component5(): UInt = this.dwVersionLS

    public operator fun component6(): UInt = this.dwStyle

    public fun copy(cbSize: UInt = this.cbSize, szDistUnit: Pwstr = this.szDistUnit, szCodeBase: Pwstr = this.szCodeBase, dwVersionMS: UInt = this.dwVersionMS, dwVersionLS: UInt = this.dwVersionLS, dwStyle: UInt = this.dwStyle): Codebasehold = Codebasehold(cbSize = cbSize, szDistUnitCtorArg = szDistUnit, szCodeBaseCtorArg = szCodeBase, dwVersionMS = dwVersionMS, dwVersionLS = dwVersionLS, dwStyle = dwStyle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Codebasehold) return false
        if (this.cbSize != other.cbSize) return false
        if (this.szDistUnit != other.szDistUnit) return false
        if (this.szCodeBase != other.szCodeBase) return false
        if (this.dwVersionMS != other.dwVersionMS) return false
        if (this.dwVersionLS != other.dwVersionLS) return false
        if (this.dwStyle != other.dwStyle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.szDistUnit.hashCode()
        result = 31 * result + this.szCodeBase.hashCode()
        result = 31 * result + this.dwVersionMS.hashCode()
        result = 31 * result + this.dwVersionLS.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            szDistUnit: Pwstr = MutPtr(0L),
            szCodeBase: Pwstr = MutPtr(0L),
            dwVersionMS: UInt = 0u,
            dwVersionLS: UInt = 0u,
            dwStyle: UInt = 0u,
        ): Codebasehold =
            Codebasehold(
                cbSize = cbSize,
                szDistUnitCtorArg = szDistUnit,
                szCodeBaseCtorArg = szCodeBase,
                dwVersionMS = dwVersionMS,
                dwVersionLS = dwVersionLS,
                dwStyle = dwStyle,
            )
    }
}

public class Confirmsafety internal constructor(
    public var clsid: Guid,
    pUnkCtorArg: MutPtr,
    public var dwFlags: UInt,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        clsid = Guid(),
        pUnkCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Guid = this.clsid

    public operator fun component2(): MutPtr = this.pUnk

    public operator fun component3(): UInt = this.dwFlags

    public fun copy(clsid: Guid = this.clsid, pUnk: MutPtr = this.pUnk, dwFlags: UInt = this.dwFlags): Confirmsafety = Confirmsafety(clsid = clsid, pUnkCtorArg = pUnk, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Confirmsafety) return false
        if (this.clsid != other.clsid) return false
        if (this.pUnk != other.pUnk) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsid.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsid: Guid = Guid(),
            pUnk: MutPtr = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): Confirmsafety =
            Confirmsafety(
                clsid = clsid,
                pUnkCtorArg = pUnk,
                dwFlags = dwFlags,
            )
    }
}

public data class Datainfo(
    public var ulTotalSize: UInt = 0u,
    public var ulavrPacketSize: UInt = 0u,
    public var ulConnectSpeed: UInt = 0u,
    public var ulProcessorSpeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Datainfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Datainfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Datainfo =
                    Datainfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Datainfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulavrPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulConnectSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulProcessorSpeed)
                }
            }
    }
}

public class HitLoggingInfo internal constructor(
    public var dwStructSize: UInt,
    lpszLoggedUrlNameCtorArg: Pstr,
    public var startTime: Systemtime,
    public var endTime: Systemtime,
    lpszExtendedInfoCtorArg: Pstr,
) {
    public var lpszLoggedUrlName: Pstr = lpszLoggedUrlNameCtorArg
        internal set

    public var lpszExtendedInfo: Pstr = lpszExtendedInfoCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpszLoggedUrlNameCtorArg = MutPtr(0L),
        startTime = Systemtime(),
        endTime = Systemtime(),
        lpszExtendedInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pstr = this.lpszLoggedUrlName

    public operator fun component3(): Systemtime = this.startTime

    public operator fun component4(): Systemtime = this.endTime

    public operator fun component5(): Pstr = this.lpszExtendedInfo

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpszLoggedUrlName: Pstr = this.lpszLoggedUrlName, startTime: Systemtime = this.startTime, endTime: Systemtime = this.endTime, lpszExtendedInfo: Pstr = this.lpszExtendedInfo): HitLoggingInfo = HitLoggingInfo(dwStructSize = dwStructSize, lpszLoggedUrlNameCtorArg = lpszLoggedUrlName, startTime = startTime, endTime = endTime, lpszExtendedInfoCtorArg = lpszExtendedInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HitLoggingInfo) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpszLoggedUrlName != other.lpszLoggedUrlName) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.lpszExtendedInfo != other.lpszExtendedInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpszLoggedUrlName.hashCode()
        result = 31 * result + this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.lpszExtendedInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpszLoggedUrlName: Pstr = MutPtr(0L),
            startTime: Systemtime = Systemtime(),
            endTime: Systemtime = Systemtime(),
            lpszExtendedInfo: Pstr = MutPtr(0L),
        ): HitLoggingInfo =
            HitLoggingInfo(
                dwStructSize = dwStructSize,
                lpszLoggedUrlNameCtorArg = lpszLoggedUrlName,
                startTime = startTime,
                endTime = endTime,
                lpszExtendedInfoCtorArg = lpszExtendedInfo,
            )
    }
}

public class Protocoldata internal constructor(
    public var grfFlags: UInt,
    public var dwState: UInt,
    pDataCtorArg: MutPtr,
    public var cbData: UInt,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        grfFlags = 0u,
        dwState = 0u,
        pDataCtorArg = MutPtr(0L),
        cbData = 0u,
    )

    public operator fun component1(): UInt = this.grfFlags

    public operator fun component2(): UInt = this.dwState

    public operator fun component3(): MutPtr = this.pData

    public operator fun component4(): UInt = this.cbData

    public fun copy(grfFlags: UInt = this.grfFlags, dwState: UInt = this.dwState, pData: MutPtr = this.pData, cbData: UInt = this.cbData): Protocoldata = Protocoldata(grfFlags = grfFlags, dwState = dwState, pDataCtorArg = pData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Protocoldata) return false
        if (this.grfFlags != other.grfFlags) return false
        if (this.dwState != other.dwState) return false
        if (this.pData != other.pData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grfFlags.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protocoldata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protocoldata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Protocoldata =
                    Protocoldata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Protocoldata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grfFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwState)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                }
            }

        public operator fun invoke(
            grfFlags: UInt = 0u,
            dwState: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
        ): Protocoldata =
            Protocoldata(
                grfFlags = grfFlags,
                dwState = dwState,
                pDataCtorArg = pData,
                cbData = cbData,
            )
    }
}

public class Protocolfilterdata internal constructor(
    public var cbSize: UInt,
    pProtocolSinkCtorArg: MutPtr,
    pProtocolCtorArg: MutPtr,
    pUnkCtorArg: MutPtr,
    public var dwFilterFlags: UInt,
) {
    public var pProtocolSink: MutPtr = pProtocolSinkCtorArg
        internal set

    public var pProtocol: MutPtr = pProtocolCtorArg
        internal set

    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pProtocolSinkCtorArg = MutPtr(0L),
        pProtocolCtorArg = MutPtr(0L),
        pUnkCtorArg = MutPtr(0L),
        dwFilterFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pProtocolSink

    public operator fun component3(): MutPtr = this.pProtocol

    public operator fun component4(): MutPtr = this.pUnk

    public operator fun component5(): UInt = this.dwFilterFlags

    public fun copy(cbSize: UInt = this.cbSize, pProtocolSink: MutPtr = this.pProtocolSink, pProtocol: MutPtr = this.pProtocol, pUnk: MutPtr = this.pUnk, dwFilterFlags: UInt = this.dwFilterFlags): Protocolfilterdata = Protocolfilterdata(cbSize = cbSize, pProtocolSinkCtorArg = pProtocolSink, pProtocolCtorArg = pProtocol, pUnkCtorArg = pUnk, dwFilterFlags = dwFilterFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Protocolfilterdata) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pProtocolSink != other.pProtocolSink) return false
        if (this.pProtocol != other.pProtocol) return false
        if (this.pUnk != other.pUnk) return false
        if (this.dwFilterFlags != other.dwFilterFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pProtocolSink.hashCode()
        result = 31 * result + this.pProtocol.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        result = 31 * result + this.dwFilterFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protocolfilterdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protocolfilterdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Protocolfilterdata =
                    Protocolfilterdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Protocolfilterdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pProtocolSink)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pProtocol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pUnk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFilterFlags)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pProtocolSink: MutPtr = MutPtr(0L),
            pProtocol: MutPtr = MutPtr(0L),
            pUnk: MutPtr = MutPtr(0L),
            dwFilterFlags: UInt = 0u,
        ): Protocolfilterdata =
            Protocolfilterdata(
                cbSize = cbSize,
                pProtocolSinkCtorArg = pProtocolSink,
                pProtocolCtorArg = pProtocol,
                pUnkCtorArg = pUnk,
                dwFilterFlags = dwFilterFlags,
            )
    }
}

public class ProtocolArgument internal constructor(
    szMethodCtorArg: Pcwstr,
    szTargetUrlCtorArg: Pcwstr,
) {
    public var szMethod: Pcwstr = szMethodCtorArg
        internal set

    public var szTargetUrl: Pcwstr = szTargetUrlCtorArg
        internal set

    public constructor() : this(
        szMethodCtorArg = ConstPtr(0L),
        szTargetUrlCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.szMethod

    public operator fun component2(): Pcwstr = this.szTargetUrl

    public fun copy(szMethod: Pcwstr = this.szMethod, szTargetUrl: Pcwstr = this.szTargetUrl): ProtocolArgument = ProtocolArgument(szMethodCtorArg = szMethod, szTargetUrlCtorArg = szTargetUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProtocolArgument) return false
        if (this.szMethod != other.szMethod) return false
        if (this.szTargetUrl != other.szTargetUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMethod.hashCode()
        result = 31 * result + this.szTargetUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMethod: Pcwstr = ConstPtr(0L),
            szTargetUrl: Pcwstr = ConstPtr(0L),
        ): ProtocolArgument =
            ProtocolArgument(
                szMethodCtorArg = szMethod,
                szTargetUrlCtorArg = szTargetUrl,
            )
    }
}

public data class RemsecurityAttributes(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: UInt = 0u,
    public var bInheritHandle: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemsecurityAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemsecurityAttributes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RemsecurityAttributes =
                    RemsecurityAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RemsecurityAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lpSecurityDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bInheritHandle)
                }
            }
    }
}

public class RemBINDINFO internal constructor(
    public var cbSize: UInt,
    szExtraInfoCtorArg: Pwstr,
    public var grfBindInfoF: UInt,
    public var dwBindVerb: UInt,
    szCustomVerbCtorArg: Pwstr,
    public var cbstgmedData: UInt,
    public var dwOptions: UInt,
    public var dwOptionsFlags: UInt,
    public var dwCodePage: UInt,
    public var securityAttributes: RemsecurityAttributes,
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
        grfBindInfoF = 0u,
        dwBindVerb = 0u,
        szCustomVerbCtorArg = MutPtr(0L),
        cbstgmedData = 0u,
        dwOptions = 0u,
        dwOptionsFlags = 0u,
        dwCodePage = 0u,
        securityAttributes = RemsecurityAttributes(),
        iid = Guid(),
        pUnkCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.szExtraInfo

    public operator fun component3(): UInt = this.grfBindInfoF

    public operator fun component4(): UInt = this.dwBindVerb

    public operator fun component5(): Pwstr = this.szCustomVerb

    public operator fun component6(): UInt = this.cbstgmedData

    public operator fun component7(): UInt = this.dwOptions

    public operator fun component8(): UInt = this.dwOptionsFlags

    public operator fun component9(): UInt = this.dwCodePage

    public operator fun component10(): RemsecurityAttributes = this.securityAttributes

    public operator fun component11(): Guid = this.iid

    public operator fun component12(): MutPtr = this.pUnk

    public operator fun component13(): UInt = this.dwReserved

    public fun copy(cbSize: UInt = this.cbSize, szExtraInfo: Pwstr = this.szExtraInfo, grfBindInfoF: UInt = this.grfBindInfoF, dwBindVerb: UInt = this.dwBindVerb, szCustomVerb: Pwstr = this.szCustomVerb, cbstgmedData: UInt = this.cbstgmedData, dwOptions: UInt = this.dwOptions, dwOptionsFlags: UInt = this.dwOptionsFlags, dwCodePage: UInt = this.dwCodePage, securityAttributes: RemsecurityAttributes = this.securityAttributes, iid: Guid = this.iid, pUnk: MutPtr = this.pUnk, dwReserved: UInt = this.dwReserved): RemBINDINFO = RemBINDINFO(cbSize = cbSize, szExtraInfoCtorArg = szExtraInfo, grfBindInfoF = grfBindInfoF, dwBindVerb = dwBindVerb, szCustomVerbCtorArg = szCustomVerb, cbstgmedData = cbstgmedData, dwOptions = dwOptions, dwOptionsFlags = dwOptionsFlags, dwCodePage = dwCodePage, securityAttributes = securityAttributes, iid = iid, pUnkCtorArg = pUnk, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemBINDINFO) return false
        if (this.cbSize != other.cbSize) return false
        if (this.szExtraInfo != other.szExtraInfo) return false
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
            grfBindInfoF: UInt = 0u,
            dwBindVerb: UInt = 0u,
            szCustomVerb: Pwstr = MutPtr(0L),
            cbstgmedData: UInt = 0u,
            dwOptions: UInt = 0u,
            dwOptionsFlags: UInt = 0u,
            dwCodePage: UInt = 0u,
            securityAttributes: RemsecurityAttributes = RemsecurityAttributes(),
            iid: Guid = Guid(),
            pUnk: MutPtr = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): RemBINDINFO =
            RemBINDINFO(
                cbSize = cbSize,
                szExtraInfoCtorArg = szExtraInfo,
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

public data class RemFORMATETC(
    public var cfFormat: UInt = 0u,
    public var ptd: UInt = 0u,
    public var dwAspect: UInt = 0u,
    public var lindex: Int = 0,
    public var tymed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemFORMATETC> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemFORMATETC> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): RemFORMATETC =
                    RemFORMATETC(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RemFORMATETC) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cfFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ptd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAspect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lindex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tymed)
                }
            }
    }
}

public class Softdistinfo internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var dwAdState: UInt,
    szTitleCtorArg: Pwstr,
    szAbstractCtorArg: Pwstr,
    szHREFCtorArg: Pwstr,
    public var dwInstalledVersionMS: UInt,
    public var dwInstalledVersionLS: UInt,
    public var dwUpdateVersionMS: UInt,
    public var dwUpdateVersionLS: UInt,
    public var dwAdvertisedVersionMS: UInt,
    public var dwAdvertisedVersionLS: UInt,
    public var dwReserved: UInt,
) {
    public var szTitle: Pwstr = szTitleCtorArg
        internal set

    public var szAbstract: Pwstr = szAbstractCtorArg
        internal set

    public var szHREF: Pwstr = szHREFCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        dwAdState = 0u,
        szTitleCtorArg = MutPtr(0L),
        szAbstractCtorArg = MutPtr(0L),
        szHREFCtorArg = MutPtr(0L),
        dwInstalledVersionMS = 0u,
        dwInstalledVersionLS = 0u,
        dwUpdateVersionMS = 0u,
        dwUpdateVersionLS = 0u,
        dwAdvertisedVersionMS = 0u,
        dwAdvertisedVersionLS = 0u,
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwAdState

    public operator fun component4(): Pwstr = this.szTitle

    public operator fun component5(): Pwstr = this.szAbstract

    public operator fun component6(): Pwstr = this.szHREF

    public operator fun component7(): UInt = this.dwInstalledVersionMS

    public operator fun component8(): UInt = this.dwInstalledVersionLS

    public operator fun component9(): UInt = this.dwUpdateVersionMS

    public operator fun component10(): UInt = this.dwUpdateVersionLS

    public operator fun component11(): UInt = this.dwAdvertisedVersionMS

    public operator fun component12(): UInt = this.dwAdvertisedVersionLS

    public operator fun component13(): UInt = this.dwReserved

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, dwAdState: UInt = this.dwAdState, szTitle: Pwstr = this.szTitle, szAbstract: Pwstr = this.szAbstract, szHREF: Pwstr = this.szHREF, dwInstalledVersionMS: UInt = this.dwInstalledVersionMS, dwInstalledVersionLS: UInt = this.dwInstalledVersionLS, dwUpdateVersionMS: UInt = this.dwUpdateVersionMS, dwUpdateVersionLS: UInt = this.dwUpdateVersionLS, dwAdvertisedVersionMS: UInt = this.dwAdvertisedVersionMS, dwAdvertisedVersionLS: UInt = this.dwAdvertisedVersionLS, dwReserved: UInt = this.dwReserved): Softdistinfo = Softdistinfo(cbSize = cbSize, dwFlags = dwFlags, dwAdState = dwAdState, szTitleCtorArg = szTitle, szAbstractCtorArg = szAbstract, szHREFCtorArg = szHREF, dwInstalledVersionMS = dwInstalledVersionMS, dwInstalledVersionLS = dwInstalledVersionLS, dwUpdateVersionMS = dwUpdateVersionMS, dwUpdateVersionLS = dwUpdateVersionLS, dwAdvertisedVersionMS = dwAdvertisedVersionMS, dwAdvertisedVersionLS = dwAdvertisedVersionLS, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Softdistinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwAdState != other.dwAdState) return false
        if (this.szTitle != other.szTitle) return false
        if (this.szAbstract != other.szAbstract) return false
        if (this.szHREF != other.szHREF) return false
        if (this.dwInstalledVersionMS != other.dwInstalledVersionMS) return false
        if (this.dwInstalledVersionLS != other.dwInstalledVersionLS) return false
        if (this.dwUpdateVersionMS != other.dwUpdateVersionMS) return false
        if (this.dwUpdateVersionLS != other.dwUpdateVersionLS) return false
        if (this.dwAdvertisedVersionMS != other.dwAdvertisedVersionMS) return false
        if (this.dwAdvertisedVersionLS != other.dwAdvertisedVersionLS) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwAdState.hashCode()
        result = 31 * result + this.szTitle.hashCode()
        result = 31 * result + this.szAbstract.hashCode()
        result = 31 * result + this.szHREF.hashCode()
        result = 31 * result + this.dwInstalledVersionMS.hashCode()
        result = 31 * result + this.dwInstalledVersionLS.hashCode()
        result = 31 * result + this.dwUpdateVersionMS.hashCode()
        result = 31 * result + this.dwUpdateVersionLS.hashCode()
        result = 31 * result + this.dwAdvertisedVersionMS.hashCode()
        result = 31 * result + this.dwAdvertisedVersionLS.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwAdState: UInt = 0u,
            szTitle: Pwstr = MutPtr(0L),
            szAbstract: Pwstr = MutPtr(0L),
            szHREF: Pwstr = MutPtr(0L),
            dwInstalledVersionMS: UInt = 0u,
            dwInstalledVersionLS: UInt = 0u,
            dwUpdateVersionMS: UInt = 0u,
            dwUpdateVersionLS: UInt = 0u,
            dwAdvertisedVersionMS: UInt = 0u,
            dwAdvertisedVersionLS: UInt = 0u,
            dwReserved: UInt = 0u,
        ): Softdistinfo =
            Softdistinfo(
                cbSize = cbSize,
                dwFlags = dwFlags,
                dwAdState = dwAdState,
                szTitleCtorArg = szTitle,
                szAbstractCtorArg = szAbstract,
                szHREFCtorArg = szHREF,
                dwInstalledVersionMS = dwInstalledVersionMS,
                dwInstalledVersionLS = dwInstalledVersionLS,
                dwUpdateVersionMS = dwUpdateVersionMS,
                dwUpdateVersionLS = dwUpdateVersionLS,
                dwAdvertisedVersionMS = dwAdvertisedVersionMS,
                dwAdvertisedVersionLS = dwAdvertisedVersionLS,
                dwReserved = dwReserved,
            )
    }
}

public class StartParam internal constructor(
    public var iid: Guid,
    pIBindCtxCtorArg: MutPtr,
    pItfCtorArg: MutPtr,
) {
    public var pIBindCtx: MutPtr = pIBindCtxCtorArg
        internal set

    public var pItf: MutPtr = pItfCtorArg
        internal set

    public constructor() : this(
        iid = Guid(),
        pIBindCtxCtorArg = MutPtr(0L),
        pItfCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.iid

    public operator fun component2(): MutPtr = this.pIBindCtx

    public operator fun component3(): MutPtr = this.pItf

    public fun copy(iid: Guid = this.iid, pIBindCtx: MutPtr = this.pIBindCtx, pItf: MutPtr = this.pItf): StartParam = StartParam(iid = iid, pIBindCtxCtorArg = pIBindCtx, pItfCtorArg = pItf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StartParam) return false
        if (this.iid != other.iid) return false
        if (this.pIBindCtx != other.pIBindCtx) return false
        if (this.pItf != other.pItf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iid.hashCode()
        result = 31 * result + this.pIBindCtx.hashCode()
        result = 31 * result + this.pItf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iid: Guid = Guid(),
            pIBindCtx: MutPtr = MutPtr(0L),
            pItf: MutPtr = MutPtr(0L),
        ): StartParam =
            StartParam(
                iid = iid,
                pIBindCtxCtorArg = pIBindCtx,
                pItfCtorArg = pItf,
            )
    }
}

public data class Zoneattributes(
    public var cbSize: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(260),
    public var szDescription: UShortArray = UShortArray(200),
    public var szIconPath: UShortArray = UShortArray(260),
    public var dwTemplateMinLevel: UInt = 0u,
    public var dwTemplateRecommended: UInt = 0u,
    public var dwTemplateCurrentLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Zoneattributes) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szIconPath.contentEquals(other.szIconPath)) return false
        if (this.dwTemplateMinLevel != other.dwTemplateMinLevel) return false
        if (this.dwTemplateRecommended != other.dwTemplateRecommended) return false
        if (this.dwTemplateCurrentLevel != other.dwTemplateCurrentLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szIconPath.contentHashCode()
        result = 31 * result + this.dwTemplateMinLevel.hashCode()
        result = 31 * result + this.dwTemplateRecommended.hashCode()
        result = 31 * result + this.dwTemplateCurrentLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Zoneattributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Zoneattributes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1460L
                override fun readNative(addr: Long): Zoneattributes =
                    Zoneattributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (200).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 924L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1444L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1448L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1452L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1456L),
                    )
                override fun writeNative(addr: Long, value: Zoneattributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.szDisplayName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (200).toInt())
                    ).writeNative(addr + 524L, value.szDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 924L, value.szIconPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1444L, value.dwTemplateMinLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1448L, value.dwTemplateRecommended)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1452L, value.dwTemplateCurrentLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1456L, value.dwFlags)
                }
            }
    }
}
