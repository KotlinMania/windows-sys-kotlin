@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.system.Variant

public data class TfDaColor(
    public var type: TfDaColortype = 0,
    public var anonymous: TfDaColor0 = TfDaColor0(),
)

public data class TfDaColor0(
    public var nIndex: Int = 0,
    public var cr: Colorref = 0u,
)

public data class TfDisplayattribute(
    public var crText: TfDaColor = TfDaColor(),
    public var crBk: TfDaColor = TfDaColor(),
    public var lsStyle: TfDaLinestyle = 0,
    public var fBoldLine: Bool = 0,
    public var crLine: TfDaColor = TfDaColor(),
    public var bAttr: TfDaAttrInfo = 0,
)

public class TfHaltcond internal constructor(
    pHaltRangeCtorArg: MutPtr<CVoid>,
    public var aHaltPos: TfAnchor,
    public var dwFlags: UInt,
) {
    public var pHaltRange: MutPtr<CVoid> = pHaltRangeCtorArg
        internal set

    public constructor() : this(
        pHaltRangeCtorArg = MutPtr(0L),
        aHaltPos = 0,
        dwFlags = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pHaltRange

    public operator fun component2(): TfAnchor = this.aHaltPos

    public operator fun component3(): UInt = this.dwFlags

    public fun copy(pHaltRange: MutPtr<CVoid> = this.pHaltRange, aHaltPos: TfAnchor = this.aHaltPos, dwFlags: UInt = this.dwFlags): TfHaltcond = TfHaltcond(pHaltRangeCtorArg = pHaltRange, aHaltPos = aHaltPos, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfHaltcond) return false
        if (this.pHaltRange != other.pHaltRange) return false
        if (this.aHaltPos != other.aHaltPos) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pHaltRange.hashCode()
        result = 31 * result + this.aHaltPos.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfHaltcond> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfHaltcond> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TfHaltcond =
                    TfHaltcond(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TfHaltcond) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pHaltRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.aHaltPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                }
            }

        public operator fun invoke(
            pHaltRange: MutPtr<CVoid> = MutPtr(0L),
            aHaltPos: TfAnchor = 0,
            dwFlags: UInt = 0u,
        ): TfHaltcond =
            TfHaltcond(
                pHaltRangeCtorArg = pHaltRange,
                aHaltPos = aHaltPos,
                dwFlags = dwFlags,
            )
    }
}

public class TfInputprocessorprofile internal constructor(
    public var dwProfileType: UInt,
    public var langid: UShort,
    public var clsid: Guid,
    public var guidProfile: Guid,
    public var catid: Guid,
    hklSubstituteCtorArg: Input.KeyboardAndMouse.Hkl,
    public var dwCaps: UInt,
    hklCtorArg: Input.KeyboardAndMouse.Hkl,
    public var dwFlags: UInt,
) {
    public var hklSubstitute: Input.KeyboardAndMouse.Hkl = hklSubstituteCtorArg
        internal set

    public var hkl: Input.KeyboardAndMouse.Hkl = hklCtorArg
        internal set

    public constructor() : this(
        dwProfileType = 0u,
        langid = 0u,
        clsid = Guid(),
        guidProfile = Guid(),
        catid = Guid(),
        hklSubstituteCtorArg = MutPtr(0L),
        dwCaps = 0u,
        hklCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.dwProfileType

    public operator fun component2(): UShort = this.langid

    public operator fun component3(): Guid = this.clsid

    public operator fun component4(): Guid = this.guidProfile

    public operator fun component5(): Guid = this.catid

    public operator fun component6(): Input.KeyboardAndMouse.Hkl = this.hklSubstitute

    public operator fun component7(): UInt = this.dwCaps

    public operator fun component8(): Input.KeyboardAndMouse.Hkl = this.hkl

    public operator fun component9(): UInt = this.dwFlags

    public fun copy(dwProfileType: UInt = this.dwProfileType, langid: UShort = this.langid, clsid: Guid = this.clsid, guidProfile: Guid = this.guidProfile, catid: Guid = this.catid, hklSubstitute: Input.KeyboardAndMouse.Hkl = this.hklSubstitute, dwCaps: UInt = this.dwCaps, hkl: Input.KeyboardAndMouse.Hkl = this.hkl, dwFlags: UInt = this.dwFlags): TfInputprocessorprofile = TfInputprocessorprofile(dwProfileType = dwProfileType, langid = langid, clsid = clsid, guidProfile = guidProfile, catid = catid, hklSubstituteCtorArg = hklSubstitute, dwCaps = dwCaps, hklCtorArg = hkl, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfInputprocessorprofile) return false
        if (this.dwProfileType != other.dwProfileType) return false
        if (this.langid != other.langid) return false
        if (this.clsid != other.clsid) return false
        if (this.guidProfile != other.guidProfile) return false
        if (this.catid != other.catid) return false
        if (this.hklSubstitute != other.hklSubstitute) return false
        if (this.dwCaps != other.dwCaps) return false
        if (this.hkl != other.hkl) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProfileType.hashCode()
        result = 31 * result + this.langid.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.guidProfile.hashCode()
        result = 31 * result + this.catid.hashCode()
        result = 31 * result + this.hklSubstitute.hashCode()
        result = 31 * result + this.dwCaps.hashCode()
        result = 31 * result + this.hkl.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwProfileType: UInt = 0u,
            langid: UShort = 0u,
            clsid: Guid = Guid(),
            guidProfile: Guid = Guid(),
            catid: Guid = Guid(),
            hklSubstitute: Input.KeyboardAndMouse.Hkl = MutPtr(0L),
            dwCaps: UInt = 0u,
            hkl: Input.KeyboardAndMouse.Hkl = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): TfInputprocessorprofile =
            TfInputprocessorprofile(
                dwProfileType = dwProfileType,
                langid = langid,
                clsid = clsid,
                guidProfile = guidProfile,
                catid = catid,
                hklSubstituteCtorArg = hklSubstitute,
                dwCaps = dwCaps,
                hklCtorArg = hkl,
                dwFlags = dwFlags,
            )
    }
}

public data class TfLangbariteminfo(
    public var clsidService: Guid = Guid(),
    public var guidItem: Guid = Guid(),
    public var dwStyle: UInt = 0u,
    public var ulSort: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfLangbariteminfo) return false
        if (this.clsidService != other.clsidService) return false
        if (this.guidItem != other.guidItem) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.ulSort != other.ulSort) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsidService.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.ulSort.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class TfLanguageprofile(
    public var clsid: Guid = Guid(),
    public var langid: UShort = 0u,
    public var catid: Guid = Guid(),
    public var fActive: Bool = 0,
    public var guidProfile: Guid = Guid(),
)

public class TfLbballooninfo internal constructor(
    public var style: TfLBBalloonStyle,
    bstrTextCtorArg: Bstr,
) {
    public var bstrText: Bstr = bstrTextCtorArg
        internal set

    public constructor() : this(
        style = 0,
        bstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): TfLBBalloonStyle = this.style

    public operator fun component2(): Bstr = this.bstrText

    public fun copy(style: TfLBBalloonStyle = this.style, bstrText: Bstr = this.bstrText): TfLbballooninfo = TfLbballooninfo(style = style, bstrTextCtorArg = bstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfLbballooninfo) return false
        if (this.style != other.style) return false
        if (this.bstrText != other.bstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.style.hashCode()
        result = 31 * result + this.bstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            style: TfLBBalloonStyle = 0,
            bstrText: Bstr = ConstPtr(0L),
        ): TfLbballooninfo =
            TfLbballooninfo(
                style = style,
                bstrTextCtorArg = bstrText,
            )
    }
}

public class TfLmlattelement internal constructor(
    public var dwFrameStart: UInt,
    public var dwFrameLen: UInt,
    public var dwFlags: UInt,
    public var anonymous: TfLmlattelement0,
    bstrTextCtorArg: Bstr,
) {
    public var bstrText: Bstr = bstrTextCtorArg
        internal set

    public constructor() : this(
        dwFrameStart = 0u,
        dwFrameLen = 0u,
        dwFlags = 0u,
        anonymous = TfLmlattelement0(),
        bstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFrameStart

    public operator fun component2(): UInt = this.dwFrameLen

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): TfLmlattelement0 = this.anonymous

    public operator fun component5(): Bstr = this.bstrText

    public fun copy(dwFrameStart: UInt = this.dwFrameStart, dwFrameLen: UInt = this.dwFrameLen, dwFlags: UInt = this.dwFlags, anonymous: TfLmlattelement0 = this.anonymous, bstrText: Bstr = this.bstrText): TfLmlattelement = TfLmlattelement(dwFrameStart = dwFrameStart, dwFrameLen = dwFrameLen, dwFlags = dwFlags, anonymous = anonymous, bstrTextCtorArg = bstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfLmlattelement) return false
        if (this.dwFrameStart != other.dwFrameStart) return false
        if (this.dwFrameLen != other.dwFrameLen) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.anonymous != other.anonymous) return false
        if (this.bstrText != other.bstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFrameStart.hashCode()
        result = 31 * result + this.dwFrameLen.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.bstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFrameStart: UInt = 0u,
            dwFrameLen: UInt = 0u,
            dwFlags: UInt = 0u,
            anonymous: TfLmlattelement0 = TfLmlattelement0(),
            bstrText: Bstr = ConstPtr(0L),
        ): TfLmlattelement =
            TfLmlattelement(
                dwFrameStart = dwFrameStart,
                dwFrameLen = dwFrameLen,
                dwFlags = dwFlags,
                anonymous = anonymous,
                bstrTextCtorArg = bstrText,
            )
    }
}

public data class TfLmlattelement0(
    public var iCost: Int = 0,
)

public data class TfPersistentPropertyHeaderAcp(
    public var guidType: Guid = Guid(),
    public var ichStart: Int = 0,
    public var cch: Int = 0,
    public var cb: UInt = 0u,
    public var dwPrivate: UInt = 0u,
    public var clsidTIP: Guid = Guid(),
)

public data class TfPreservedkey(
    public var uVKey: UInt = 0u,
    public var uModifiers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfPreservedkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfPreservedkey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TfPreservedkey =
                    TfPreservedkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TfPreservedkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uVKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uModifiers)
                }
            }
    }
}

public data class TfPropertyval(
    public var guidId: Guid = Guid(),
    public var varValue: Variant.Variant = Variant.Variant(),
)

public class TfSelection internal constructor(
    rangeCtorArg: MutPtr<CVoid>,
    public var style: TfSelectionstyle,
) {
    public var range: MutPtr<CVoid> = rangeCtorArg
        internal set

    public constructor() : this(
        rangeCtorArg = MutPtr(0L),
        style = TfSelectionstyle(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.range

    public operator fun component2(): TfSelectionstyle = this.style

    public fun copy(range: MutPtr<CVoid> = this.range, style: TfSelectionstyle = this.style): TfSelection = TfSelection(rangeCtorArg = range, style = style)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TfSelection) return false
        if (this.range != other.range) return false
        if (this.style != other.style) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.range.hashCode()
        result = 31 * result + this.style.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfSelection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfSelection> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TfSelection =
                    TfSelection(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (TfSelectionstyle.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TfSelection) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.range)
                    (TfSelectionstyle.typeLayout()).writeNative(addr + 8L, value.style)
                }
            }

        public operator fun invoke(
            range: MutPtr<CVoid> = MutPtr(0L),
            style: TfSelectionstyle = TfSelectionstyle(),
        ): TfSelection =
            TfSelection(
                rangeCtorArg = range,
                style = style,
            )
    }
}

public data class TfSelectionstyle(
    public var ase: TfActiveSelEnd = 0,
    public var fInterimChar: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfSelectionstyle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TfSelectionstyle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TfSelectionstyle =
                    TfSelectionstyle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TfSelectionstyle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fInterimChar)
                }
            }
    }
}

public data class TsAttrval(
    public var idAttr: Guid = Guid(),
    public var dwOverlapId: UInt = 0u,
    public var varValue: Variant.Variant = Variant.Variant(),
)

public data class TsRuninfo(
    public var uCount: UInt = 0u,
    public var type: TsRunType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsRuninfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsRuninfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TsRuninfo =
                    TsRuninfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TsRuninfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                }
            }
    }
}

public data class TsSelectionstyle(
    public var ase: TsActiveSelEnd = 0,
    public var fInterimChar: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionstyle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionstyle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TsSelectionstyle =
                    TsSelectionstyle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TsSelectionstyle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fInterimChar)
                }
            }
    }
}

public data class TsSelectionAcp(
    public var acpStart: Int = 0,
    public var acpEnd: Int = 0,
    public var style: TsSelectionstyle = TsSelectionstyle(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionAcp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionAcp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TsSelectionAcp =
                    TsSelectionAcp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (TsSelectionstyle.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TsSelectionAcp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.acpStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.acpEnd)
                    (TsSelectionstyle.typeLayout()).writeNative(addr + 8L, value.style)
                }
            }
    }
}

public class TsSelectionAnchor internal constructor(
    paStartCtorArg: MutPtr<CVoid>,
    paEndCtorArg: MutPtr<CVoid>,
    public var style: TsSelectionstyle,
) {
    public var paStart: MutPtr<CVoid> = paStartCtorArg
        internal set

    public var paEnd: MutPtr<CVoid> = paEndCtorArg
        internal set

    public constructor() : this(
        paStartCtorArg = MutPtr(0L),
        paEndCtorArg = MutPtr(0L),
        style = TsSelectionstyle(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.paStart

    public operator fun component2(): MutPtr<CVoid> = this.paEnd

    public operator fun component3(): TsSelectionstyle = this.style

    public fun copy(paStart: MutPtr<CVoid> = this.paStart, paEnd: MutPtr<CVoid> = this.paEnd, style: TsSelectionstyle = this.style): TsSelectionAnchor = TsSelectionAnchor(paStartCtorArg = paStart, paEndCtorArg = paEnd, style = style)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TsSelectionAnchor) return false
        if (this.paStart != other.paStart) return false
        if (this.paEnd != other.paEnd) return false
        if (this.style != other.style) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.paStart.hashCode()
        result = 31 * result + this.paEnd.hashCode()
        result = 31 * result + this.style.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionAnchor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsSelectionAnchor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): TsSelectionAnchor =
                    TsSelectionAnchor(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (TsSelectionstyle.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TsSelectionAnchor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.paStart)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.paEnd)
                    (TsSelectionstyle.typeLayout()).writeNative(addr + 16L, value.style)
                }
            }

        public operator fun invoke(
            paStart: MutPtr<CVoid> = MutPtr(0L),
            paEnd: MutPtr<CVoid> = MutPtr(0L),
            style: TsSelectionstyle = TsSelectionstyle(),
        ): TsSelectionAnchor =
            TsSelectionAnchor(
                paStartCtorArg = paStart,
                paEndCtorArg = paEnd,
                style = style,
            )
    }
}

public data class TsStatus(
    public var dwDynamicFlags: UInt = 0u,
    public var dwStaticFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TsStatus =
                    TsStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TsStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDynamicFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStaticFlags)
                }
            }
    }
}

public data class TsTextchange(
    public var acpStart: Int = 0,
    public var acpOldEnd: Int = 0,
    public var acpNewEnd: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsTextchange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TsTextchange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TsTextchange =
                    TsTextchange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TsTextchange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.acpStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.acpOldEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.acpNewEnd)
                }
            }
    }
}
