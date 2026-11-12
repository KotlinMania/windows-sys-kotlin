@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService

public data class Convcontext(
    public var cb: UInt = 0u,
    public var wFlags: UInt = 0u,
    public var wCountryID: UInt = 0u,
    public var iCodePage: Int = 0,
    public var dwLangID: UInt = 0u,
    public var dwSecurity: UInt = 0u,
    public var qos: SecurityQualityOfService = SecurityQualityOfService(),
)

public class Convinfo internal constructor(
    public var cb: UInt,
    public var hUser: Int,
    hConvPartnerCtorArg: Hconv,
    hszSvcPartnerCtorArg: Hsz,
    hszServiceReqCtorArg: Hsz,
    hszTopicCtorArg: Hsz,
    hszItemCtorArg: Hsz,
    public var wFmt: UInt,
    public var wType: DdeClientTransactionType,
    public var wStatus: ConvinfoStatus,
    public var wConvst: ConvinfoConversationState,
    public var wLastError: UInt,
    hConvListCtorArg: Hconvlist,
    public var convCtxt: Convcontext,
    hwndCtorArg: Hwnd,
    hwndPartnerCtorArg: Hwnd,
) {
    public var hConvPartner: Hconv = hConvPartnerCtorArg
        internal set

    public var hszSvcPartner: Hsz = hszSvcPartnerCtorArg
        internal set

    public var hszServiceReq: Hsz = hszServiceReqCtorArg
        internal set

    public var hszTopic: Hsz = hszTopicCtorArg
        internal set

    public var hszItem: Hsz = hszItemCtorArg
        internal set

    public var hConvList: Hconvlist = hConvListCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var hwndPartner: Hwnd = hwndPartnerCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        hUser = 0,
        hConvPartnerCtorArg = MutPtr(0L),
        hszSvcPartnerCtorArg = MutPtr(0L),
        hszServiceReqCtorArg = MutPtr(0L),
        hszTopicCtorArg = MutPtr(0L),
        hszItemCtorArg = MutPtr(0L),
        wFmt = 0u,
        wType = 0u,
        wStatus = 0u,
        wConvst = 0u,
        wLastError = 0u,
        hConvListCtorArg = MutPtr(0L),
        convCtxt = Convcontext(),
        hwndCtorArg = MutPtr(0L),
        hwndPartnerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Int = this.hUser

    public operator fun component3(): Hconv = this.hConvPartner

    public operator fun component4(): Hsz = this.hszSvcPartner

    public operator fun component5(): Hsz = this.hszServiceReq

    public operator fun component6(): Hsz = this.hszTopic

    public operator fun component7(): Hsz = this.hszItem

    public operator fun component8(): UInt = this.wFmt

    public operator fun component9(): DdeClientTransactionType = this.wType

    public operator fun component10(): ConvinfoStatus = this.wStatus

    public operator fun component11(): ConvinfoConversationState = this.wConvst

    public operator fun component12(): UInt = this.wLastError

    public operator fun component13(): Hconvlist = this.hConvList

    public operator fun component14(): Convcontext = this.convCtxt

    public operator fun component15(): Hwnd = this.hwnd

    public operator fun component16(): Hwnd = this.hwndPartner

    public fun copy(cb: UInt = this.cb, hUser: Int = this.hUser, hConvPartner: Hconv = this.hConvPartner, hszSvcPartner: Hsz = this.hszSvcPartner, hszServiceReq: Hsz = this.hszServiceReq, hszTopic: Hsz = this.hszTopic, hszItem: Hsz = this.hszItem, wFmt: UInt = this.wFmt, wType: DdeClientTransactionType = this.wType, wStatus: ConvinfoStatus = this.wStatus, wConvst: ConvinfoConversationState = this.wConvst, wLastError: UInt = this.wLastError, hConvList: Hconvlist = this.hConvList, convCtxt: Convcontext = this.convCtxt, hwnd: Hwnd = this.hwnd, hwndPartner: Hwnd = this.hwndPartner): Convinfo = Convinfo(cb = cb, hUser = hUser, hConvPartnerCtorArg = hConvPartner, hszSvcPartnerCtorArg = hszSvcPartner, hszServiceReqCtorArg = hszServiceReq, hszTopicCtorArg = hszTopic, hszItemCtorArg = hszItem, wFmt = wFmt, wType = wType, wStatus = wStatus, wConvst = wConvst, wLastError = wLastError, hConvListCtorArg = hConvList, convCtxt = convCtxt, hwndCtorArg = hwnd, hwndPartnerCtorArg = hwndPartner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Convinfo) return false
        if (this.cb != other.cb) return false
        if (this.hUser != other.hUser) return false
        if (this.hConvPartner != other.hConvPartner) return false
        if (this.hszSvcPartner != other.hszSvcPartner) return false
        if (this.hszServiceReq != other.hszServiceReq) return false
        if (this.hszTopic != other.hszTopic) return false
        if (this.hszItem != other.hszItem) return false
        if (this.wFmt != other.wFmt) return false
        if (this.wType != other.wType) return false
        if (this.wStatus != other.wStatus) return false
        if (this.wConvst != other.wConvst) return false
        if (this.wLastError != other.wLastError) return false
        if (this.hConvList != other.hConvList) return false
        if (this.convCtxt != other.convCtxt) return false
        if (this.hwnd != other.hwnd) return false
        if (this.hwndPartner != other.hwndPartner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.hUser.hashCode()
        result = 31 * result + this.hConvPartner.hashCode()
        result = 31 * result + this.hszSvcPartner.hashCode()
        result = 31 * result + this.hszServiceReq.hashCode()
        result = 31 * result + this.hszTopic.hashCode()
        result = 31 * result + this.hszItem.hashCode()
        result = 31 * result + this.wFmt.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wStatus.hashCode()
        result = 31 * result + this.wConvst.hashCode()
        result = 31 * result + this.wLastError.hashCode()
        result = 31 * result + this.hConvList.hashCode()
        result = 31 * result + this.convCtxt.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.hwndPartner.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            hUser: Int = 0,
            hConvPartner: Hconv = MutPtr(0L),
            hszSvcPartner: Hsz = MutPtr(0L),
            hszServiceReq: Hsz = MutPtr(0L),
            hszTopic: Hsz = MutPtr(0L),
            hszItem: Hsz = MutPtr(0L),
            wFmt: UInt = 0u,
            wType: DdeClientTransactionType = 0u,
            wStatus: ConvinfoStatus = 0u,
            wConvst: ConvinfoConversationState = 0u,
            wLastError: UInt = 0u,
            hConvList: Hconvlist = MutPtr(0L),
            convCtxt: Convcontext = Convcontext(),
            hwnd: Hwnd = MutPtr(0L),
            hwndPartner: Hwnd = MutPtr(0L),
        ): Convinfo =
            Convinfo(
                cb = cb,
                hUser = hUser,
                hConvPartnerCtorArg = hConvPartner,
                hszSvcPartnerCtorArg = hszSvcPartner,
                hszServiceReqCtorArg = hszServiceReq,
                hszTopicCtorArg = hszTopic,
                hszItemCtorArg = hszItem,
                wFmt = wFmt,
                wType = wType,
                wStatus = wStatus,
                wConvst = wConvst,
                wLastError = wLastError,
                hConvListCtorArg = hConvList,
                convCtxt = convCtxt,
                hwndCtorArg = hwnd,
                hwndPartnerCtorArg = hwndPartner,
            )
    }
}

public class Copydatastruct internal constructor(
    public var dwData: Int,
    public var cbData: UInt,
    lpDataCtorArg: MutPtr<CVoid>,
) {
    public var lpData: MutPtr<CVoid> = lpDataCtorArg
        internal set

    public constructor() : this(
        dwData = 0,
        cbData = 0u,
        lpDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwData

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): MutPtr<CVoid> = this.lpData

    public fun copy(dwData: Int = this.dwData, cbData: UInt = this.cbData, lpData: MutPtr<CVoid> = this.lpData): Copydatastruct = Copydatastruct(dwData = dwData, cbData = cbData, lpDataCtorArg = lpData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copydatastruct) return false
        if (this.dwData != other.dwData) return false
        if (this.cbData != other.cbData) return false
        if (this.lpData != other.lpData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.lpData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Copydatastruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Copydatastruct> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Copydatastruct =
                    Copydatastruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Copydatastruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.lpData)
                }
            }

        public operator fun invoke(
            dwData: Int = 0,
            cbData: UInt = 0u,
            lpData: MutPtr<CVoid> = MutPtr(0L),
        ): Copydatastruct =
            Copydatastruct(
                dwData = dwData,
                cbData = cbData,
                lpDataCtorArg = lpData,
            )
    }
}

public data class Ddeack(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeack> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeack> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddeack =
                    Ddeack(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ddeack) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ddeadvise(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeadvise> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeadvise> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddeadvise =
                    Ddeadvise(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ddeadvise) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.cfFormat)
                }
            }
    }
}

public data class Ddedata(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddedata) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddedata> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddedata =
                    Ddedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ddedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.cfFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public data class Ddeln(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeln> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeln> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddeln =
                    Ddeln(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ddeln) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.cfFormat)
                }
            }
    }
}

public data class DdemlMsgHookData(
    public var uiLo: Int = 0,
    public var uiHi: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DdemlMsgHookData) return false
        if (this.uiLo != other.uiLo) return false
        if (this.uiHi != other.uiHi) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uiLo.hashCode()
        result = 31 * result + this.uiHi.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdemlMsgHookData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdemlMsgHookData> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DdemlMsgHookData =
                    DdemlMsgHookData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdemlMsgHookData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.uiLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.uiHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 20L, value.data)
                }
            }
    }
}

public data class Ddepoke(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddepoke) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddepoke> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddepoke> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddepoke =
                    Ddepoke(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ddepoke) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.cfFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public data class Ddeup(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddeup) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ddeup> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ddeup =
                    Ddeup(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ddeup) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.cfFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.rgb)
                }
            }
    }
}

public class Hszpair internal constructor(
    hszSvcCtorArg: Hsz,
    hszTopicCtorArg: Hsz,
) {
    public var hszSvc: Hsz = hszSvcCtorArg
        internal set

    public var hszTopic: Hsz = hszTopicCtorArg
        internal set

    public constructor() : this(
        hszSvcCtorArg = MutPtr(0L),
        hszTopicCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hsz = this.hszSvc

    public operator fun component2(): Hsz = this.hszTopic

    public fun copy(hszSvc: Hsz = this.hszSvc, hszTopic: Hsz = this.hszTopic): Hszpair = Hszpair(hszSvcCtorArg = hszSvc, hszTopicCtorArg = hszTopic)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hszpair) return false
        if (this.hszSvc != other.hszSvc) return false
        if (this.hszTopic != other.hszTopic) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hszSvc.hashCode()
        result = 31 * result + this.hszTopic.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hszpair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hszpair> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Hszpair =
                    Hszpair(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Hszpair) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.hszSvc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.hszTopic)
                }
            }

        public operator fun invoke(
            hszSvc: Hsz = MutPtr(0L),
            hszTopic: Hsz = MutPtr(0L),
        ): Hszpair =
            Hszpair(
                hszSvcCtorArg = hszSvc,
                hszTopicCtorArg = hszTopic,
            )
    }
}

public class Metafilepict internal constructor(
    public var mm: Int,
    public var xExt: Int,
    public var yExt: Int,
    hMFCtorArg: Hmetafile,
) {
    public var hMF: Hmetafile = hMFCtorArg
        internal set

    public constructor() : this(
        mm = 0,
        xExt = 0,
        yExt = 0,
        hMFCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.mm

    public operator fun component2(): Int = this.xExt

    public operator fun component3(): Int = this.yExt

    public operator fun component4(): Hmetafile = this.hMF

    public fun copy(mm: Int = this.mm, xExt: Int = this.xExt, yExt: Int = this.yExt, hMF: Hmetafile = this.hMF): Metafilepict = Metafilepict(mm = mm, xExt = xExt, yExt = yExt, hMFCtorArg = hMF)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Metafilepict) return false
        if (this.mm != other.mm) return false
        if (this.xExt != other.xExt) return false
        if (this.yExt != other.yExt) return false
        if (this.hMF != other.hMF) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mm.hashCode()
        result = 31 * result + this.xExt.hashCode()
        result = 31 * result + this.yExt.hashCode()
        result = 31 * result + this.hMF.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mm: Int = 0,
            xExt: Int = 0,
            yExt: Int = 0,
            hMF: Hmetafile = MutPtr(0L),
        ): Metafilepict =
            Metafilepict(
                mm = mm,
                xExt = xExt,
                yExt = yExt,
                hMFCtorArg = hMF,
            )
    }
}

public class Moncbstruct internal constructor(
    public var cb: UInt,
    public var dwTime: UInt,
    hTaskCtorArg: Handle,
    public var dwRet: UInt,
    public var wType: UInt,
    public var wFmt: UInt,
    hConvCtorArg: Hconv,
    hsz1CtorArg: Hsz,
    hsz2CtorArg: Hsz,
    hDataCtorArg: Hddedata,
    public var dwData1: Int,
    public var dwData2: Int,
    public var cc: Convcontext,
    public var cbData: UInt,
    public var data: UIntArray,
) {
    public var hTask: Handle = hTaskCtorArg
        internal set

    public var hConv: Hconv = hConvCtorArg
        internal set

    public var hsz1: Hsz = hsz1CtorArg
        internal set

    public var hsz2: Hsz = hsz2CtorArg
        internal set

    public var hData: Hddedata = hDataCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        dwTime = 0u,
        hTaskCtorArg = MutPtr(0L),
        dwRet = 0u,
        wType = 0u,
        wFmt = 0u,
        hConvCtorArg = MutPtr(0L),
        hsz1CtorArg = MutPtr(0L),
        hsz2CtorArg = MutPtr(0L),
        hDataCtorArg = MutPtr(0L),
        dwData1 = 0,
        dwData2 = 0,
        cc = Convcontext(),
        cbData = 0u,
        data = UIntArray(8),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): UInt = this.dwTime

    public operator fun component3(): Handle = this.hTask

    public operator fun component4(): UInt = this.dwRet

    public operator fun component5(): UInt = this.wType

    public operator fun component6(): UInt = this.wFmt

    public operator fun component7(): Hconv = this.hConv

    public operator fun component8(): Hsz = this.hsz1

    public operator fun component9(): Hsz = this.hsz2

    public operator fun component10(): Hddedata = this.hData

    public operator fun component11(): Int = this.dwData1

    public operator fun component12(): Int = this.dwData2

    public operator fun component13(): Convcontext = this.cc

    public operator fun component14(): UInt = this.cbData

    public operator fun component15(): UIntArray = this.data

    public fun copy(cb: UInt = this.cb, dwTime: UInt = this.dwTime, hTask: Handle = this.hTask, dwRet: UInt = this.dwRet, wType: UInt = this.wType, wFmt: UInt = this.wFmt, hConv: Hconv = this.hConv, hsz1: Hsz = this.hsz1, hsz2: Hsz = this.hsz2, hData: Hddedata = this.hData, dwData1: Int = this.dwData1, dwData2: Int = this.dwData2, cc: Convcontext = this.cc, cbData: UInt = this.cbData, data: UIntArray = this.data): Moncbstruct = Moncbstruct(cb = cb, dwTime = dwTime, hTaskCtorArg = hTask, dwRet = dwRet, wType = wType, wFmt = wFmt, hConvCtorArg = hConv, hsz1CtorArg = hsz1, hsz2CtorArg = hsz2, hDataCtorArg = hData, dwData1 = dwData1, dwData2 = dwData2, cc = cc, cbData = cbData, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moncbstruct) return false
        if (this.cb != other.cb) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        if (this.dwRet != other.dwRet) return false
        if (this.wType != other.wType) return false
        if (this.wFmt != other.wFmt) return false
        if (this.hConv != other.hConv) return false
        if (this.hsz1 != other.hsz1) return false
        if (this.hsz2 != other.hsz2) return false
        if (this.hData != other.hData) return false
        if (this.dwData1 != other.dwData1) return false
        if (this.dwData2 != other.dwData2) return false
        if (this.cc != other.cc) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.dwRet.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wFmt.hashCode()
        result = 31 * result + this.hConv.hashCode()
        result = 31 * result + this.hsz1.hashCode()
        result = 31 * result + this.hsz2.hashCode()
        result = 31 * result + this.hData.hashCode()
        result = 31 * result + this.dwData1.hashCode()
        result = 31 * result + this.dwData2.hashCode()
        result = 31 * result + this.cc.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            dwTime: UInt = 0u,
            hTask: Handle = MutPtr(0L),
            dwRet: UInt = 0u,
            wType: UInt = 0u,
            wFmt: UInt = 0u,
            hConv: Hconv = MutPtr(0L),
            hsz1: Hsz = MutPtr(0L),
            hsz2: Hsz = MutPtr(0L),
            hData: Hddedata = MutPtr(0L),
            dwData1: Int = 0,
            dwData2: Int = 0,
            cc: Convcontext = Convcontext(),
            cbData: UInt = 0u,
            data: UIntArray = UIntArray(8),
        ): Moncbstruct =
            Moncbstruct(
                cb = cb,
                dwTime = dwTime,
                hTaskCtorArg = hTask,
                dwRet = dwRet,
                wType = wType,
                wFmt = wFmt,
                hConvCtorArg = hConv,
                hsz1CtorArg = hsz1,
                hsz2CtorArg = hsz2,
                hDataCtorArg = hData,
                dwData1 = dwData1,
                dwData2 = dwData2,
                cc = cc,
                cbData = cbData,
                data = data,
            )
    }
}

public class Monconvstruct internal constructor(
    public var cb: UInt,
    public var fConnect: Bool,
    public var dwTime: UInt,
    hTaskCtorArg: Handle,
    hszSvcCtorArg: Hsz,
    hszTopicCtorArg: Hsz,
    hConvClientCtorArg: Hconv,
    hConvServerCtorArg: Hconv,
) {
    public var hTask: Handle = hTaskCtorArg
        internal set

    public var hszSvc: Hsz = hszSvcCtorArg
        internal set

    public var hszTopic: Hsz = hszTopicCtorArg
        internal set

    public var hConvClient: Hconv = hConvClientCtorArg
        internal set

    public var hConvServer: Hconv = hConvServerCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        fConnect = 0,
        dwTime = 0u,
        hTaskCtorArg = MutPtr(0L),
        hszSvcCtorArg = MutPtr(0L),
        hszTopicCtorArg = MutPtr(0L),
        hConvClientCtorArg = MutPtr(0L),
        hConvServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Bool = this.fConnect

    public operator fun component3(): UInt = this.dwTime

    public operator fun component4(): Handle = this.hTask

    public operator fun component5(): Hsz = this.hszSvc

    public operator fun component6(): Hsz = this.hszTopic

    public operator fun component7(): Hconv = this.hConvClient

    public operator fun component8(): Hconv = this.hConvServer

    public fun copy(cb: UInt = this.cb, fConnect: Bool = this.fConnect, dwTime: UInt = this.dwTime, hTask: Handle = this.hTask, hszSvc: Hsz = this.hszSvc, hszTopic: Hsz = this.hszTopic, hConvClient: Hconv = this.hConvClient, hConvServer: Hconv = this.hConvServer): Monconvstruct = Monconvstruct(cb = cb, fConnect = fConnect, dwTime = dwTime, hTaskCtorArg = hTask, hszSvcCtorArg = hszSvc, hszTopicCtorArg = hszTopic, hConvClientCtorArg = hConvClient, hConvServerCtorArg = hConvServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monconvstruct) return false
        if (this.cb != other.cb) return false
        if (this.fConnect != other.fConnect) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        if (this.hszSvc != other.hszSvc) return false
        if (this.hszTopic != other.hszTopic) return false
        if (this.hConvClient != other.hConvClient) return false
        if (this.hConvServer != other.hConvServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fConnect.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.hszSvc.hashCode()
        result = 31 * result + this.hszTopic.hashCode()
        result = 31 * result + this.hConvClient.hashCode()
        result = 31 * result + this.hConvServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            fConnect: Bool = 0,
            dwTime: UInt = 0u,
            hTask: Handle = MutPtr(0L),
            hszSvc: Hsz = MutPtr(0L),
            hszTopic: Hsz = MutPtr(0L),
            hConvClient: Hconv = MutPtr(0L),
            hConvServer: Hconv = MutPtr(0L),
        ): Monconvstruct =
            Monconvstruct(
                cb = cb,
                fConnect = fConnect,
                dwTime = dwTime,
                hTaskCtorArg = hTask,
                hszSvcCtorArg = hszSvc,
                hszTopicCtorArg = hszTopic,
                hConvClientCtorArg = hConvClient,
                hConvServerCtorArg = hConvServer,
            )
    }
}

public class Monerrstruct internal constructor(
    public var cb: UInt,
    public var wLastError: UInt,
    public var dwTime: UInt,
    hTaskCtorArg: Handle,
) {
    public var hTask: Handle = hTaskCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        wLastError = 0u,
        dwTime = 0u,
        hTaskCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): UInt = this.wLastError

    public operator fun component3(): UInt = this.dwTime

    public operator fun component4(): Handle = this.hTask

    public fun copy(cb: UInt = this.cb, wLastError: UInt = this.wLastError, dwTime: UInt = this.dwTime, hTask: Handle = this.hTask): Monerrstruct = Monerrstruct(cb = cb, wLastError = wLastError, dwTime = dwTime, hTaskCtorArg = hTask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monerrstruct) return false
        if (this.cb != other.cb) return false
        if (this.wLastError != other.wLastError) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.wLastError.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            wLastError: UInt = 0u,
            dwTime: UInt = 0u,
            hTask: Handle = MutPtr(0L),
        ): Monerrstruct =
            Monerrstruct(
                cb = cb,
                wLastError = wLastError,
                dwTime = dwTime,
                hTaskCtorArg = hTask,
            )
    }
}

public class Monhszstructa internal constructor(
    public var cb: UInt,
    public var fsAction: Bool,
    public var dwTime: UInt,
    hszCtorArg: Hsz,
    hTaskCtorArg: Handle,
    public var str: ByteArray,
) {
    public var hsz: Hsz = hszCtorArg
        internal set

    public var hTask: Handle = hTaskCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        fsAction = 0,
        dwTime = 0u,
        hszCtorArg = MutPtr(0L),
        hTaskCtorArg = MutPtr(0L),
        str = ByteArray(1),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Bool = this.fsAction

    public operator fun component3(): UInt = this.dwTime

    public operator fun component4(): Hsz = this.hsz

    public operator fun component5(): Handle = this.hTask

    public operator fun component6(): ByteArray = this.str

    public fun copy(cb: UInt = this.cb, fsAction: Bool = this.fsAction, dwTime: UInt = this.dwTime, hsz: Hsz = this.hsz, hTask: Handle = this.hTask, str: ByteArray = this.str): Monhszstructa = Monhszstructa(cb = cb, fsAction = fsAction, dwTime = dwTime, hszCtorArg = hsz, hTaskCtorArg = hTask, str = str)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monhszstructa) return false
        if (this.cb != other.cb) return false
        if (this.fsAction != other.fsAction) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hsz != other.hsz) return false
        if (this.hTask != other.hTask) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fsAction.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hsz.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            fsAction: Bool = 0,
            dwTime: UInt = 0u,
            hsz: Hsz = MutPtr(0L),
            hTask: Handle = MutPtr(0L),
            str: ByteArray = ByteArray(1),
        ): Monhszstructa =
            Monhszstructa(
                cb = cb,
                fsAction = fsAction,
                dwTime = dwTime,
                hszCtorArg = hsz,
                hTaskCtorArg = hTask,
                str = str,
            )
    }
}

public class Monhszstructw internal constructor(
    public var cb: UInt,
    public var fsAction: Bool,
    public var dwTime: UInt,
    hszCtorArg: Hsz,
    hTaskCtorArg: Handle,
    public var str: UShortArray,
) {
    public var hsz: Hsz = hszCtorArg
        internal set

    public var hTask: Handle = hTaskCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        fsAction = 0,
        dwTime = 0u,
        hszCtorArg = MutPtr(0L),
        hTaskCtorArg = MutPtr(0L),
        str = UShortArray(1),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Bool = this.fsAction

    public operator fun component3(): UInt = this.dwTime

    public operator fun component4(): Hsz = this.hsz

    public operator fun component5(): Handle = this.hTask

    public operator fun component6(): UShortArray = this.str

    public fun copy(cb: UInt = this.cb, fsAction: Bool = this.fsAction, dwTime: UInt = this.dwTime, hsz: Hsz = this.hsz, hTask: Handle = this.hTask, str: UShortArray = this.str): Monhszstructw = Monhszstructw(cb = cb, fsAction = fsAction, dwTime = dwTime, hszCtorArg = hsz, hTaskCtorArg = hTask, str = str)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monhszstructw) return false
        if (this.cb != other.cb) return false
        if (this.fsAction != other.fsAction) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hsz != other.hsz) return false
        if (this.hTask != other.hTask) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fsAction.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hsz.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            fsAction: Bool = 0,
            dwTime: UInt = 0u,
            hsz: Hsz = MutPtr(0L),
            hTask: Handle = MutPtr(0L),
            str: UShortArray = UShortArray(1),
        ): Monhszstructw =
            Monhszstructw(
                cb = cb,
                fsAction = fsAction,
                dwTime = dwTime,
                hszCtorArg = hsz,
                hTaskCtorArg = hTask,
                str = str,
            )
    }
}

public class Monlinkstruct internal constructor(
    public var cb: UInt,
    public var dwTime: UInt,
    hTaskCtorArg: Handle,
    public var fEstablished: Bool,
    public var fNoData: Bool,
    hszSvcCtorArg: Hsz,
    hszTopicCtorArg: Hsz,
    hszItemCtorArg: Hsz,
    public var wFmt: UInt,
    public var fServer: Bool,
    hConvServerCtorArg: Hconv,
    hConvClientCtorArg: Hconv,
) {
    public var hTask: Handle = hTaskCtorArg
        internal set

    public var hszSvc: Hsz = hszSvcCtorArg
        internal set

    public var hszTopic: Hsz = hszTopicCtorArg
        internal set

    public var hszItem: Hsz = hszItemCtorArg
        internal set

    public var hConvServer: Hconv = hConvServerCtorArg
        internal set

    public var hConvClient: Hconv = hConvClientCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        dwTime = 0u,
        hTaskCtorArg = MutPtr(0L),
        fEstablished = 0,
        fNoData = 0,
        hszSvcCtorArg = MutPtr(0L),
        hszTopicCtorArg = MutPtr(0L),
        hszItemCtorArg = MutPtr(0L),
        wFmt = 0u,
        fServer = 0,
        hConvServerCtorArg = MutPtr(0L),
        hConvClientCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): UInt = this.dwTime

    public operator fun component3(): Handle = this.hTask

    public operator fun component4(): Bool = this.fEstablished

    public operator fun component5(): Bool = this.fNoData

    public operator fun component6(): Hsz = this.hszSvc

    public operator fun component7(): Hsz = this.hszTopic

    public operator fun component8(): Hsz = this.hszItem

    public operator fun component9(): UInt = this.wFmt

    public operator fun component10(): Bool = this.fServer

    public operator fun component11(): Hconv = this.hConvServer

    public operator fun component12(): Hconv = this.hConvClient

    public fun copy(cb: UInt = this.cb, dwTime: UInt = this.dwTime, hTask: Handle = this.hTask, fEstablished: Bool = this.fEstablished, fNoData: Bool = this.fNoData, hszSvc: Hsz = this.hszSvc, hszTopic: Hsz = this.hszTopic, hszItem: Hsz = this.hszItem, wFmt: UInt = this.wFmt, fServer: Bool = this.fServer, hConvServer: Hconv = this.hConvServer, hConvClient: Hconv = this.hConvClient): Monlinkstruct = Monlinkstruct(cb = cb, dwTime = dwTime, hTaskCtorArg = hTask, fEstablished = fEstablished, fNoData = fNoData, hszSvcCtorArg = hszSvc, hszTopicCtorArg = hszTopic, hszItemCtorArg = hszItem, wFmt = wFmt, fServer = fServer, hConvServerCtorArg = hConvServer, hConvClientCtorArg = hConvClient)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monlinkstruct) return false
        if (this.cb != other.cb) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        if (this.fEstablished != other.fEstablished) return false
        if (this.fNoData != other.fNoData) return false
        if (this.hszSvc != other.hszSvc) return false
        if (this.hszTopic != other.hszTopic) return false
        if (this.hszItem != other.hszItem) return false
        if (this.wFmt != other.wFmt) return false
        if (this.fServer != other.fServer) return false
        if (this.hConvServer != other.hConvServer) return false
        if (this.hConvClient != other.hConvClient) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.fEstablished.hashCode()
        result = 31 * result + this.fNoData.hashCode()
        result = 31 * result + this.hszSvc.hashCode()
        result = 31 * result + this.hszTopic.hashCode()
        result = 31 * result + this.hszItem.hashCode()
        result = 31 * result + this.wFmt.hashCode()
        result = 31 * result + this.fServer.hashCode()
        result = 31 * result + this.hConvServer.hashCode()
        result = 31 * result + this.hConvClient.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            dwTime: UInt = 0u,
            hTask: Handle = MutPtr(0L),
            fEstablished: Bool = 0,
            fNoData: Bool = 0,
            hszSvc: Hsz = MutPtr(0L),
            hszTopic: Hsz = MutPtr(0L),
            hszItem: Hsz = MutPtr(0L),
            wFmt: UInt = 0u,
            fServer: Bool = 0,
            hConvServer: Hconv = MutPtr(0L),
            hConvClient: Hconv = MutPtr(0L),
        ): Monlinkstruct =
            Monlinkstruct(
                cb = cb,
                dwTime = dwTime,
                hTaskCtorArg = hTask,
                fEstablished = fEstablished,
                fNoData = fNoData,
                hszSvcCtorArg = hszSvc,
                hszTopicCtorArg = hszTopic,
                hszItemCtorArg = hszItem,
                wFmt = wFmt,
                fServer = fServer,
                hConvServerCtorArg = hConvServer,
                hConvClientCtorArg = hConvClient,
            )
    }
}

public class Monmsgstruct internal constructor(
    public var cb: UInt,
    hwndToCtorArg: Hwnd,
    public var dwTime: UInt,
    hTaskCtorArg: Handle,
    public var wMsg: UInt,
    public var wParam: Wparam,
    public var lParam: Lparam,
    public var dmhd: DdemlMsgHookData,
) {
    public var hwndTo: Hwnd = hwndToCtorArg
        internal set

    public var hTask: Handle = hTaskCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        hwndToCtorArg = MutPtr(0L),
        dwTime = 0u,
        hTaskCtorArg = MutPtr(0L),
        wMsg = 0u,
        wParam = 0uL,
        lParam = 0L,
        dmhd = DdemlMsgHookData(),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Hwnd = this.hwndTo

    public operator fun component3(): UInt = this.dwTime

    public operator fun component4(): Handle = this.hTask

    public operator fun component5(): UInt = this.wMsg

    public operator fun component6(): Wparam = this.wParam

    public operator fun component7(): Lparam = this.lParam

    public operator fun component8(): DdemlMsgHookData = this.dmhd

    public fun copy(cb: UInt = this.cb, hwndTo: Hwnd = this.hwndTo, dwTime: UInt = this.dwTime, hTask: Handle = this.hTask, wMsg: UInt = this.wMsg, wParam: Wparam = this.wParam, lParam: Lparam = this.lParam, dmhd: DdemlMsgHookData = this.dmhd): Monmsgstruct = Monmsgstruct(cb = cb, hwndToCtorArg = hwndTo, dwTime = dwTime, hTaskCtorArg = hTask, wMsg = wMsg, wParam = wParam, lParam = lParam, dmhd = dmhd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monmsgstruct) return false
        if (this.cb != other.cb) return false
        if (this.hwndTo != other.hwndTo) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        if (this.wMsg != other.wMsg) return false
        if (this.wParam != other.wParam) return false
        if (this.lParam != other.lParam) return false
        if (this.dmhd != other.dmhd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.hwndTo.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.wMsg.hashCode()
        result = 31 * result + this.wParam.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dmhd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            hwndTo: Hwnd = MutPtr(0L),
            dwTime: UInt = 0u,
            hTask: Handle = MutPtr(0L),
            wMsg: UInt = 0u,
            wParam: Wparam = 0uL,
            lParam: Lparam = 0L,
            dmhd: DdemlMsgHookData = DdemlMsgHookData(),
        ): Monmsgstruct =
            Monmsgstruct(
                cb = cb,
                hwndToCtorArg = hwndTo,
                dwTime = dwTime,
                hTaskCtorArg = hTask,
                wMsg = wMsg,
                wParam = wParam,
                lParam = lParam,
                dmhd = dmhd,
            )
    }
}
