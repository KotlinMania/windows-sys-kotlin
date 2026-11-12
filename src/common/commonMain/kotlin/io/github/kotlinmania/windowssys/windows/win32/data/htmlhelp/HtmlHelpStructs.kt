@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Nmhdr

public data class Columnstatus(
    public var cPropCount: Int = 0,
    public var cPropsLoaded: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Columnstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Columnstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Columnstatus =
                    Columnstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Columnstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cPropCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cPropsLoaded)
                }
            }
    }
}

public data class CProperty(
    public var dwPropID: UInt = 0u,
    public var cbData: UInt = 0u,
    public var dwType: UInt = 0u,
    public var anonymous: Cproperty0 = Cproperty0(),
    public var fPersist: Bool = 0,
)

public class Cproperty0 internal constructor(
    lpszwDataCtorArg: Pwstr,
    lpvDataCtorArg: MutPtr<CVoid>,
    public var dwValue: UInt,
) {
    public var lpszwData: Pwstr = lpszwDataCtorArg
        internal set

    public var lpvData: MutPtr<CVoid> = lpvDataCtorArg
        internal set

    public constructor() : this(
        lpszwDataCtorArg = MutPtr(0L),
        lpvDataCtorArg = MutPtr(0L),
        dwValue = 0u,
    )

    public operator fun component1(): Pwstr = this.lpszwData

    public operator fun component2(): MutPtr<CVoid> = this.lpvData

    public operator fun component3(): UInt = this.dwValue

    public fun copy(lpszwData: Pwstr = this.lpszwData, lpvData: MutPtr<CVoid> = this.lpvData, dwValue: UInt = this.dwValue): Cproperty0 = Cproperty0(lpszwDataCtorArg = lpszwData, lpvDataCtorArg = lpvData, dwValue = dwValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cproperty0) return false
        if (this.lpszwData != other.lpszwData) return false
        if (this.lpvData != other.lpvData) return false
        if (this.dwValue != other.dwValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszwData.hashCode()
        result = 31 * result + this.lpvData.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszwData: Pwstr = MutPtr(0L),
            lpvData: MutPtr<CVoid> = MutPtr(0L),
            dwValue: UInt = 0u,
        ): Cproperty0 =
            Cproperty0(
                lpszwDataCtorArg = lpszwData,
                lpvDataCtorArg = lpvData,
                dwValue = dwValue,
            )
    }
}

public class Hhntrack internal constructor(
    public var hdr: Nmhdr,
    pszCurUrlCtorArg: Pcstr,
    public var idAction: Int,
    phhWinTypeCtorArg: MutPtr<HhWintype>,
) {
    public var pszCurUrl: Pcstr = pszCurUrlCtorArg
        internal set

    public var phhWinType: MutPtr<HhWintype> = phhWinTypeCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszCurUrlCtorArg = ConstPtr(0L),
        idAction = 0,
        phhWinTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pcstr = this.pszCurUrl

    public operator fun component3(): Int = this.idAction

    public operator fun component4(): MutPtr<HhWintype> = this.phhWinType

    public fun copy(hdr: Nmhdr = this.hdr, pszCurUrl: Pcstr = this.pszCurUrl, idAction: Int = this.idAction, phhWinType: MutPtr<HhWintype> = this.phhWinType): Hhntrack = Hhntrack(hdr = hdr, pszCurUrlCtorArg = pszCurUrl, idAction = idAction, phhWinTypeCtorArg = phhWinType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hhntrack) return false
        if (this.hdr != other.hdr) return false
        if (this.pszCurUrl != other.pszCurUrl) return false
        if (this.idAction != other.idAction) return false
        if (this.phhWinType != other.phhWinType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszCurUrl.hashCode()
        result = 31 * result + this.idAction.hashCode()
        result = 31 * result + this.phhWinType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszCurUrl: Pcstr = ConstPtr(0L),
            idAction: Int = 0,
            phhWinType: MutPtr<HhWintype> = MutPtr(0L),
        ): Hhntrack =
            Hhntrack(
                hdr = hdr,
                pszCurUrlCtorArg = pszCurUrl,
                idAction = idAction,
                phhWinTypeCtorArg = phhWinType,
            )
    }
}

public class HhnNotify internal constructor(
    public var hdr: Nmhdr,
    pszUrlCtorArg: Pcstr,
) {
    public var pszUrl: Pcstr = pszUrlCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszUrlCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pcstr = this.pszUrl

    public fun copy(hdr: Nmhdr = this.hdr, pszUrl: Pcstr = this.pszUrl): HhnNotify = HhnNotify(hdr = hdr, pszUrlCtorArg = pszUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhnNotify) return false
        if (this.hdr != other.hdr) return false
        if (this.pszUrl != other.pszUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszUrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszUrl: Pcstr = ConstPtr(0L),
        ): HhnNotify =
            HhnNotify(
                hdr = hdr,
                pszUrlCtorArg = pszUrl,
            )
    }
}

public class HhAklink internal constructor(
    public var cbStruct: Int,
    public var fReserved: Bool,
    pszKeywordsCtorArg: MutPtr<Byte>,
    pszUrlCtorArg: MutPtr<Byte>,
    pszMsgTextCtorArg: MutPtr<Byte>,
    pszMsgTitleCtorArg: MutPtr<Byte>,
    pszWindowCtorArg: MutPtr<Byte>,
    public var fIndexOnFail: Bool,
) {
    public var pszKeywords: MutPtr<Byte> = pszKeywordsCtorArg
        internal set

    public var pszUrl: MutPtr<Byte> = pszUrlCtorArg
        internal set

    public var pszMsgText: MutPtr<Byte> = pszMsgTextCtorArg
        internal set

    public var pszMsgTitle: MutPtr<Byte> = pszMsgTitleCtorArg
        internal set

    public var pszWindow: MutPtr<Byte> = pszWindowCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        fReserved = 0,
        pszKeywordsCtorArg = MutPtr(0L),
        pszUrlCtorArg = MutPtr(0L),
        pszMsgTextCtorArg = MutPtr(0L),
        pszMsgTitleCtorArg = MutPtr(0L),
        pszWindowCtorArg = MutPtr(0L),
        fIndexOnFail = 0,
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Bool = this.fReserved

    public operator fun component3(): MutPtr<Byte> = this.pszKeywords

    public operator fun component4(): MutPtr<Byte> = this.pszUrl

    public operator fun component5(): MutPtr<Byte> = this.pszMsgText

    public operator fun component6(): MutPtr<Byte> = this.pszMsgTitle

    public operator fun component7(): MutPtr<Byte> = this.pszWindow

    public operator fun component8(): Bool = this.fIndexOnFail

    public fun copy(cbStruct: Int = this.cbStruct, fReserved: Bool = this.fReserved, pszKeywords: MutPtr<Byte> = this.pszKeywords, pszUrl: MutPtr<Byte> = this.pszUrl, pszMsgText: MutPtr<Byte> = this.pszMsgText, pszMsgTitle: MutPtr<Byte> = this.pszMsgTitle, pszWindow: MutPtr<Byte> = this.pszWindow, fIndexOnFail: Bool = this.fIndexOnFail): HhAklink = HhAklink(cbStruct = cbStruct, fReserved = fReserved, pszKeywordsCtorArg = pszKeywords, pszUrlCtorArg = pszUrl, pszMsgTextCtorArg = pszMsgText, pszMsgTitleCtorArg = pszMsgTitle, pszWindowCtorArg = pszWindow, fIndexOnFail = fIndexOnFail)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhAklink) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fReserved != other.fReserved) return false
        if (this.pszKeywords != other.pszKeywords) return false
        if (this.pszUrl != other.pszUrl) return false
        if (this.pszMsgText != other.pszMsgText) return false
        if (this.pszMsgTitle != other.pszMsgTitle) return false
        if (this.pszWindow != other.pszWindow) return false
        if (this.fIndexOnFail != other.fIndexOnFail) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fReserved.hashCode()
        result = 31 * result + this.pszKeywords.hashCode()
        result = 31 * result + this.pszUrl.hashCode()
        result = 31 * result + this.pszMsgText.hashCode()
        result = 31 * result + this.pszMsgTitle.hashCode()
        result = 31 * result + this.pszWindow.hashCode()
        result = 31 * result + this.fIndexOnFail.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HhAklink> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HhAklink> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): HhAklink =
                    HhAklink(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: HhAklink) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pszKeywords)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 16L, value.pszUrl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 24L, value.pszMsgText)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 32L, value.pszMsgTitle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 40L, value.pszWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.fIndexOnFail)
                }
            }

        public operator fun invoke(
            cbStruct: Int = 0,
            fReserved: Bool = 0,
            pszKeywords: MutPtr<Byte> = MutPtr(0L),
            pszUrl: MutPtr<Byte> = MutPtr(0L),
            pszMsgText: MutPtr<Byte> = MutPtr(0L),
            pszMsgTitle: MutPtr<Byte> = MutPtr(0L),
            pszWindow: MutPtr<Byte> = MutPtr(0L),
            fIndexOnFail: Bool = 0,
        ): HhAklink =
            HhAklink(
                cbStruct = cbStruct,
                fReserved = fReserved,
                pszKeywordsCtorArg = pszKeywords,
                pszUrlCtorArg = pszUrl,
                pszMsgTextCtorArg = pszMsgText,
                pszMsgTitleCtorArg = pszMsgTitle,
                pszWindowCtorArg = pszWindow,
                fIndexOnFail = fIndexOnFail,
            )
    }
}

public class HhEnumCat internal constructor(
    public var cbStruct: Int,
    pszCatNameCtorArg: Pcstr,
    pszCatDescriptionCtorArg: Pcstr,
) {
    public var pszCatName: Pcstr = pszCatNameCtorArg
        internal set

    public var pszCatDescription: Pcstr = pszCatDescriptionCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        pszCatNameCtorArg = ConstPtr(0L),
        pszCatDescriptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Pcstr = this.pszCatName

    public operator fun component3(): Pcstr = this.pszCatDescription

    public fun copy(cbStruct: Int = this.cbStruct, pszCatName: Pcstr = this.pszCatName, pszCatDescription: Pcstr = this.pszCatDescription): HhEnumCat = HhEnumCat(cbStruct = cbStruct, pszCatNameCtorArg = pszCatName, pszCatDescriptionCtorArg = pszCatDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhEnumCat) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszCatName != other.pszCatName) return false
        if (this.pszCatDescription != other.pszCatDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszCatName.hashCode()
        result = 31 * result + this.pszCatDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: Int = 0,
            pszCatName: Pcstr = ConstPtr(0L),
            pszCatDescription: Pcstr = ConstPtr(0L),
        ): HhEnumCat =
            HhEnumCat(
                cbStruct = cbStruct,
                pszCatNameCtorArg = pszCatName,
                pszCatDescriptionCtorArg = pszCatDescription,
            )
    }
}

public class HhEnumIt internal constructor(
    public var cbStruct: Int,
    public var iType: Int,
    pszCatNameCtorArg: Pcstr,
    pszITNameCtorArg: Pcstr,
    pszITDescriptionCtorArg: Pcstr,
) {
    public var pszCatName: Pcstr = pszCatNameCtorArg
        internal set

    public var pszITName: Pcstr = pszITNameCtorArg
        internal set

    public var pszITDescription: Pcstr = pszITDescriptionCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        iType = 0,
        pszCatNameCtorArg = ConstPtr(0L),
        pszITNameCtorArg = ConstPtr(0L),
        pszITDescriptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Int = this.iType

    public operator fun component3(): Pcstr = this.pszCatName

    public operator fun component4(): Pcstr = this.pszITName

    public operator fun component5(): Pcstr = this.pszITDescription

    public fun copy(cbStruct: Int = this.cbStruct, iType: Int = this.iType, pszCatName: Pcstr = this.pszCatName, pszITName: Pcstr = this.pszITName, pszITDescription: Pcstr = this.pszITDescription): HhEnumIt = HhEnumIt(cbStruct = cbStruct, iType = iType, pszCatNameCtorArg = pszCatName, pszITNameCtorArg = pszITName, pszITDescriptionCtorArg = pszITDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhEnumIt) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.iType != other.iType) return false
        if (this.pszCatName != other.pszCatName) return false
        if (this.pszITName != other.pszITName) return false
        if (this.pszITDescription != other.pszITDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.iType.hashCode()
        result = 31 * result + this.pszCatName.hashCode()
        result = 31 * result + this.pszITName.hashCode()
        result = 31 * result + this.pszITDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: Int = 0,
            iType: Int = 0,
            pszCatName: Pcstr = ConstPtr(0L),
            pszITName: Pcstr = ConstPtr(0L),
            pszITDescription: Pcstr = ConstPtr(0L),
        ): HhEnumIt =
            HhEnumIt(
                cbStruct = cbStruct,
                iType = iType,
                pszCatNameCtorArg = pszCatName,
                pszITNameCtorArg = pszITName,
                pszITDescriptionCtorArg = pszITDescription,
            )
    }
}

public class HhFtsQuery internal constructor(
    public var cbStruct: Int,
    public var fUniCodeStrings: Bool,
    pszSearchQueryCtorArg: MutPtr<Byte>,
    public var iProximity: Int,
    public var fStemmedSearch: Bool,
    public var fTitleOnly: Bool,
    public var fExecute: Bool,
    pszWindowCtorArg: MutPtr<Byte>,
) {
    public var pszSearchQuery: MutPtr<Byte> = pszSearchQueryCtorArg
        internal set

    public var pszWindow: MutPtr<Byte> = pszWindowCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        fUniCodeStrings = 0,
        pszSearchQueryCtorArg = MutPtr(0L),
        iProximity = 0,
        fStemmedSearch = 0,
        fTitleOnly = 0,
        fExecute = 0,
        pszWindowCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Bool = this.fUniCodeStrings

    public operator fun component3(): MutPtr<Byte> = this.pszSearchQuery

    public operator fun component4(): Int = this.iProximity

    public operator fun component5(): Bool = this.fStemmedSearch

    public operator fun component6(): Bool = this.fTitleOnly

    public operator fun component7(): Bool = this.fExecute

    public operator fun component8(): MutPtr<Byte> = this.pszWindow

    public fun copy(cbStruct: Int = this.cbStruct, fUniCodeStrings: Bool = this.fUniCodeStrings, pszSearchQuery: MutPtr<Byte> = this.pszSearchQuery, iProximity: Int = this.iProximity, fStemmedSearch: Bool = this.fStemmedSearch, fTitleOnly: Bool = this.fTitleOnly, fExecute: Bool = this.fExecute, pszWindow: MutPtr<Byte> = this.pszWindow): HhFtsQuery = HhFtsQuery(cbStruct = cbStruct, fUniCodeStrings = fUniCodeStrings, pszSearchQueryCtorArg = pszSearchQuery, iProximity = iProximity, fStemmedSearch = fStemmedSearch, fTitleOnly = fTitleOnly, fExecute = fExecute, pszWindowCtorArg = pszWindow)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhFtsQuery) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fUniCodeStrings != other.fUniCodeStrings) return false
        if (this.pszSearchQuery != other.pszSearchQuery) return false
        if (this.iProximity != other.iProximity) return false
        if (this.fStemmedSearch != other.fStemmedSearch) return false
        if (this.fTitleOnly != other.fTitleOnly) return false
        if (this.fExecute != other.fExecute) return false
        if (this.pszWindow != other.pszWindow) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fUniCodeStrings.hashCode()
        result = 31 * result + this.pszSearchQuery.hashCode()
        result = 31 * result + this.iProximity.hashCode()
        result = 31 * result + this.fStemmedSearch.hashCode()
        result = 31 * result + this.fTitleOnly.hashCode()
        result = 31 * result + this.fExecute.hashCode()
        result = 31 * result + this.pszWindow.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HhFtsQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HhFtsQuery> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): HhFtsQuery =
                    HhFtsQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: HhFtsQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fUniCodeStrings)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pszSearchQuery)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iProximity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.fStemmedSearch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fTitleOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.fExecute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 32L, value.pszWindow)
                }
            }

        public operator fun invoke(
            cbStruct: Int = 0,
            fUniCodeStrings: Bool = 0,
            pszSearchQuery: MutPtr<Byte> = MutPtr(0L),
            iProximity: Int = 0,
            fStemmedSearch: Bool = 0,
            fTitleOnly: Bool = 0,
            fExecute: Bool = 0,
            pszWindow: MutPtr<Byte> = MutPtr(0L),
        ): HhFtsQuery =
            HhFtsQuery(
                cbStruct = cbStruct,
                fUniCodeStrings = fUniCodeStrings,
                pszSearchQueryCtorArg = pszSearchQuery,
                iProximity = iProximity,
                fStemmedSearch = fStemmedSearch,
                fTitleOnly = fTitleOnly,
                fExecute = fExecute,
                pszWindowCtorArg = pszWindow,
            )
    }
}

public data class HhGlobalProperty(
    public var id: HhGpropid = 0,
    public var variable: Variant.Variant = Variant.Variant(),
)

public class HhPopup internal constructor(
    public var cbStruct: Int,
    hinstCtorArg: Hinstance,
    public var idString: UInt,
    pszTextCtorArg: MutPtr<Byte>,
    public var pt: Point,
    public var clrForeground: Colorref,
    public var clrBackground: Colorref,
    public var rcMargins: Rect,
    pszFontCtorArg: MutPtr<Byte>,
) {
    public var hinst: Hinstance = hinstCtorArg
        internal set

    public var pszText: MutPtr<Byte> = pszTextCtorArg
        internal set

    public var pszFont: MutPtr<Byte> = pszFontCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        hinstCtorArg = MutPtr(0L),
        idString = 0u,
        pszTextCtorArg = MutPtr(0L),
        pt = Point(),
        clrForeground = 0u,
        clrBackground = 0u,
        rcMargins = Rect(),
        pszFontCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Hinstance = this.hinst

    public operator fun component3(): UInt = this.idString

    public operator fun component4(): MutPtr<Byte> = this.pszText

    public operator fun component5(): Point = this.pt

    public operator fun component6(): Colorref = this.clrForeground

    public operator fun component7(): Colorref = this.clrBackground

    public operator fun component8(): Rect = this.rcMargins

    public operator fun component9(): MutPtr<Byte> = this.pszFont

    public fun copy(cbStruct: Int = this.cbStruct, hinst: Hinstance = this.hinst, idString: UInt = this.idString, pszText: MutPtr<Byte> = this.pszText, pt: Point = this.pt, clrForeground: Colorref = this.clrForeground, clrBackground: Colorref = this.clrBackground, rcMargins: Rect = this.rcMargins, pszFont: MutPtr<Byte> = this.pszFont): HhPopup = HhPopup(cbStruct = cbStruct, hinstCtorArg = hinst, idString = idString, pszTextCtorArg = pszText, pt = pt, clrForeground = clrForeground, clrBackground = clrBackground, rcMargins = rcMargins, pszFontCtorArg = pszFont)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhPopup) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.hinst != other.hinst) return false
        if (this.idString != other.idString) return false
        if (this.pszText != other.pszText) return false
        if (this.pt != other.pt) return false
        if (this.clrForeground != other.clrForeground) return false
        if (this.clrBackground != other.clrBackground) return false
        if (this.rcMargins != other.rcMargins) return false
        if (this.pszFont != other.pszFont) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.idString.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.clrForeground.hashCode()
        result = 31 * result + this.clrBackground.hashCode()
        result = 31 * result + this.rcMargins.hashCode()
        result = 31 * result + this.pszFont.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: Int = 0,
            hinst: Hinstance = MutPtr(0L),
            idString: UInt = 0u,
            pszText: MutPtr<Byte> = MutPtr(0L),
            pt: Point = Point(),
            clrForeground: Colorref = 0u,
            clrBackground: Colorref = 0u,
            rcMargins: Rect = Rect(),
            pszFont: MutPtr<Byte> = MutPtr(0L),
        ): HhPopup =
            HhPopup(
                cbStruct = cbStruct,
                hinstCtorArg = hinst,
                idString = idString,
                pszTextCtorArg = pszText,
                pt = pt,
                clrForeground = clrForeground,
                clrBackground = clrBackground,
                rcMargins = rcMargins,
                pszFontCtorArg = pszFont,
            )
    }
}

public class HhSetInfotype internal constructor(
    public var cbStruct: Int,
    pszCatNameCtorArg: Pcstr,
    pszInfoTypeNameCtorArg: Pcstr,
) {
    public var pszCatName: Pcstr = pszCatNameCtorArg
        internal set

    public var pszInfoTypeName: Pcstr = pszInfoTypeNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        pszCatNameCtorArg = ConstPtr(0L),
        pszInfoTypeNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.cbStruct

    public operator fun component2(): Pcstr = this.pszCatName

    public operator fun component3(): Pcstr = this.pszInfoTypeName

    public fun copy(cbStruct: Int = this.cbStruct, pszCatName: Pcstr = this.pszCatName, pszInfoTypeName: Pcstr = this.pszInfoTypeName): HhSetInfotype = HhSetInfotype(cbStruct = cbStruct, pszCatNameCtorArg = pszCatName, pszInfoTypeNameCtorArg = pszInfoTypeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HhSetInfotype) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszCatName != other.pszCatName) return false
        if (this.pszInfoTypeName != other.pszInfoTypeName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszCatName.hashCode()
        result = 31 * result + this.pszInfoTypeName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: Int = 0,
            pszCatName: Pcstr = ConstPtr(0L),
            pszInfoTypeName: Pcstr = ConstPtr(0L),
        ): HhSetInfotype =
            HhSetInfotype(
                cbStruct = cbStruct,
                pszCatNameCtorArg = pszCatName,
                pszInfoTypeNameCtorArg = pszInfoTypeName,
            )
    }
}

public class HhWintype internal constructor(
    public var cbStruct: Int,
    public var fUniCodeStrings: Bool,
    pszTypeCtorArg: MutPtr<Byte>,
    public var fsValidMembers: UInt,
    public var fsWinProperties: UInt,
    pszCaptionCtorArg: MutPtr<Byte>,
    public var dwStyles: UInt,
    public var dwExStyles: UInt,
    public var rcWindowPos: Rect,
    public var nShowState: Int,
    hwndHelpCtorArg: Hwnd,
    hwndCallerCtorArg: Hwnd,
    paInfoTypesCtorArg: MutPtr<UInt>,
    hwndToolBarCtorArg: Hwnd,
    hwndNavigationCtorArg: Hwnd,
    hwndHTMLCtorArg: Hwnd,
    public var iNavWidth: Int,
    public var rcHTML: Rect,
    pszTocCtorArg: MutPtr<Byte>,
    pszIndexCtorArg: MutPtr<Byte>,
    pszFileCtorArg: MutPtr<Byte>,
    pszHomeCtorArg: MutPtr<Byte>,
    public var fsToolBarFlags: UInt,
    public var fNotExpanded: Bool,
    public var curNavType: Int,
    public var tabpos: Int,
    public var idNotify: Int,
    public var tabOrder: UByteArray,
    public var cHistory: Int,
    pszJump1CtorArg: MutPtr<Byte>,
    pszJump2CtorArg: MutPtr<Byte>,
    pszUrlJump1CtorArg: MutPtr<Byte>,
    pszUrlJump2CtorArg: MutPtr<Byte>,
    public var rcMinSize: Rect,
    public var cbInfoTypes: Int,
    pszCustomTabsCtorArg: MutPtr<Byte>,
) {
    public var pszType: MutPtr<Byte> = pszTypeCtorArg
        internal set

    public var pszCaption: MutPtr<Byte> = pszCaptionCtorArg
        internal set

    public var hwndHelp: Hwnd = hwndHelpCtorArg
        internal set

    public var hwndCaller: Hwnd = hwndCallerCtorArg
        internal set

    public var paInfoTypes: MutPtr<UInt> = paInfoTypesCtorArg
        internal set

    public var hwndToolBar: Hwnd = hwndToolBarCtorArg
        internal set

    public var hwndNavigation: Hwnd = hwndNavigationCtorArg
        internal set

    public var hwndHTML: Hwnd = hwndHTMLCtorArg
        internal set

    public var pszToc: MutPtr<Byte> = pszTocCtorArg
        internal set

    public var pszIndex: MutPtr<Byte> = pszIndexCtorArg
        internal set

    public var pszFile: MutPtr<Byte> = pszFileCtorArg
        internal set

    public var pszHome: MutPtr<Byte> = pszHomeCtorArg
        internal set

    public var pszJump1: MutPtr<Byte> = pszJump1CtorArg
        internal set

    public var pszJump2: MutPtr<Byte> = pszJump2CtorArg
        internal set

    public var pszUrlJump1: MutPtr<Byte> = pszUrlJump1CtorArg
        internal set

    public var pszUrlJump2: MutPtr<Byte> = pszUrlJump2CtorArg
        internal set

    public var pszCustomTabs: MutPtr<Byte> = pszCustomTabsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0,
        fUniCodeStrings = 0,
        pszTypeCtorArg = MutPtr(0L),
        fsValidMembers = 0u,
        fsWinProperties = 0u,
        pszCaptionCtorArg = MutPtr(0L),
        dwStyles = 0u,
        dwExStyles = 0u,
        rcWindowPos = Rect(),
        nShowState = 0,
        hwndHelpCtorArg = MutPtr(0L),
        hwndCallerCtorArg = MutPtr(0L),
        paInfoTypesCtorArg = MutPtr(0L),
        hwndToolBarCtorArg = MutPtr(0L),
        hwndNavigationCtorArg = MutPtr(0L),
        hwndHTMLCtorArg = MutPtr(0L),
        iNavWidth = 0,
        rcHTML = Rect(),
        pszTocCtorArg = MutPtr(0L),
        pszIndexCtorArg = MutPtr(0L),
        pszFileCtorArg = MutPtr(0L),
        pszHomeCtorArg = MutPtr(0L),
        fsToolBarFlags = 0u,
        fNotExpanded = 0,
        curNavType = 0,
        tabpos = 0,
        idNotify = 0,
        tabOrder = UByteArray(20),
        cHistory = 0,
        pszJump1CtorArg = MutPtr(0L),
        pszJump2CtorArg = MutPtr(0L),
        pszUrlJump1CtorArg = MutPtr(0L),
        pszUrlJump2CtorArg = MutPtr(0L),
        rcMinSize = Rect(),
        cbInfoTypes = 0,
        pszCustomTabsCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: Int = 0,
            fUniCodeStrings: Bool = 0,
            pszType: MutPtr<Byte> = MutPtr(0L),
            fsValidMembers: UInt = 0u,
            fsWinProperties: UInt = 0u,
            pszCaption: MutPtr<Byte> = MutPtr(0L),
            dwStyles: UInt = 0u,
            dwExStyles: UInt = 0u,
            rcWindowPos: Rect = Rect(),
            nShowState: Int = 0,
            hwndHelp: Hwnd = MutPtr(0L),
            hwndCaller: Hwnd = MutPtr(0L),
            paInfoTypes: MutPtr<UInt> = MutPtr(0L),
            hwndToolBar: Hwnd = MutPtr(0L),
            hwndNavigation: Hwnd = MutPtr(0L),
            hwndHTML: Hwnd = MutPtr(0L),
            iNavWidth: Int = 0,
            rcHTML: Rect = Rect(),
            pszToc: MutPtr<Byte> = MutPtr(0L),
            pszIndex: MutPtr<Byte> = MutPtr(0L),
            pszFile: MutPtr<Byte> = MutPtr(0L),
            pszHome: MutPtr<Byte> = MutPtr(0L),
            fsToolBarFlags: UInt = 0u,
            fNotExpanded: Bool = 0,
            curNavType: Int = 0,
            tabpos: Int = 0,
            idNotify: Int = 0,
            tabOrder: UByteArray = UByteArray(20),
            cHistory: Int = 0,
            pszJump1: MutPtr<Byte> = MutPtr(0L),
            pszJump2: MutPtr<Byte> = MutPtr(0L),
            pszUrlJump1: MutPtr<Byte> = MutPtr(0L),
            pszUrlJump2: MutPtr<Byte> = MutPtr(0L),
            rcMinSize: Rect = Rect(),
            cbInfoTypes: Int = 0,
            pszCustomTabs: MutPtr<Byte> = MutPtr(0L),
        ): HhWintype =
            HhWintype(
                cbStruct = cbStruct,
                fUniCodeStrings = fUniCodeStrings,
                pszTypeCtorArg = pszType,
                fsValidMembers = fsValidMembers,
                fsWinProperties = fsWinProperties,
                pszCaptionCtorArg = pszCaption,
                dwStyles = dwStyles,
                dwExStyles = dwExStyles,
                rcWindowPos = rcWindowPos,
                nShowState = nShowState,
                hwndHelpCtorArg = hwndHelp,
                hwndCallerCtorArg = hwndCaller,
                paInfoTypesCtorArg = paInfoTypes,
                hwndToolBarCtorArg = hwndToolBar,
                hwndNavigationCtorArg = hwndNavigation,
                hwndHTMLCtorArg = hwndHTML,
                iNavWidth = iNavWidth,
                rcHTML = rcHTML,
                pszTocCtorArg = pszToc,
                pszIndexCtorArg = pszIndex,
                pszFileCtorArg = pszFile,
                pszHomeCtorArg = pszHome,
                fsToolBarFlags = fsToolBarFlags,
                fNotExpanded = fNotExpanded,
                curNavType = curNavType,
                tabpos = tabpos,
                idNotify = idNotify,
                tabOrder = tabOrder,
                cHistory = cHistory,
                pszJump1CtorArg = pszJump1,
                pszJump2CtorArg = pszJump2,
                pszUrlJump1CtorArg = pszUrlJump1,
                pszUrlJump2CtorArg = pszUrlJump2,
                rcMinSize = rcMinSize,
                cbInfoTypes = cbInfoTypes,
                pszCustomTabsCtorArg = pszCustomTabs,
            )
    }
}

public data class Rowstatus(
    public var lRowFirst: Int = 0,
    public var cRows: Int = 0,
    public var cProperties: Int = 0,
    public var cRowsTotal: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rowstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rowstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rowstatus =
                    Rowstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Rowstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lRowFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cRows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cRowsTotal)
                }
            }
    }
}
