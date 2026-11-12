@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpen
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

public data class BpAnimationparams(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var style: BpAnimationstyle = 0,
    public var dwDuration: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpAnimationparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpAnimationparams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BpAnimationparams =
                    BpAnimationparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BpAnimationparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.style)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDuration)
                }
            }
    }
}

public class BpPaintparams internal constructor(
    public var cbSize: UInt,
    public var dwFlags: BpPaintparamsFlags,
    prcExcludeCtorArg: ConstPtr,
    pBlendFunctionCtorArg: ConstPtr,
) {
    public var prcExclude: ConstPtr = prcExcludeCtorArg
        internal set

    public var pBlendFunction: ConstPtr = pBlendFunctionCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        prcExcludeCtorArg = ConstPtr(0L),
        pBlendFunctionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): BpPaintparamsFlags = this.dwFlags

    public operator fun component3(): ConstPtr = this.prcExclude

    public operator fun component4(): ConstPtr = this.pBlendFunction

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: BpPaintparamsFlags = this.dwFlags, prcExclude: ConstPtr = this.prcExclude, pBlendFunction: ConstPtr = this.pBlendFunction): BpPaintparams = BpPaintparams(cbSize = cbSize, dwFlags = dwFlags, prcExcludeCtorArg = prcExclude, pBlendFunctionCtorArg = pBlendFunction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BpPaintparams) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.prcExclude != other.prcExclude) return false
        if (this.pBlendFunction != other.pBlendFunction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.prcExclude.hashCode()
        result = 31 * result + this.pBlendFunction.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpPaintparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpPaintparams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BpPaintparams =
                    BpPaintparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BpPaintparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.prcExclude)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 16L, value.pBlendFunction)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: BpPaintparamsFlags = 0u,
            prcExclude: ConstPtr = ConstPtr(0L),
            pBlendFunction: ConstPtr = ConstPtr(0L),
        ): BpPaintparams =
            BpPaintparams(
                cbSize = cbSize,
                dwFlags = dwFlags,
                prcExcludeCtorArg = prcExclude,
                pBlendFunctionCtorArg = pBlendFunction,
            )
    }
}

public data class ButtonImagelist(
    public var himl: Himagelist = 0L,
    public var margin: Rect = Rect(),
    public var uAlign: ButtonImagelistAlign = 0u,
)

public data class ButtonSplitinfo(
    public var mask: UInt = 0u,
    public var himlGlyph: Himagelist = 0L,
    public var uSplitStyle: UInt = 0u,
    public var size: Size = Size(),
)

public class Ccinfoa internal constructor(
    public var szClass: ByteArray,
    public var flOptions: UInt,
    public var szDesc: ByteArray,
    public var cxDefault: UInt,
    public var cyDefault: UInt,
    public var flStyleDefault: UInt,
    public var flExtStyleDefault: UInt,
    public var flCtrlTypeMask: UInt,
    public var szTextDefault: ByteArray,
    public var cStyleFlags: Int,
    aStyleFlagsCtorArg: MutPtr,
    public var lpfnStyle: Lpfnccstylea,
    public var lpfnSizeToText: Lpfnccsizetotexta,
    public var dwReserved1: UInt,
    public var dwReserved2: UInt,
) {
    public var aStyleFlags: MutPtr = aStyleFlagsCtorArg
        internal set

    public constructor() : this(
        szClass = ByteArray(32),
        flOptions = 0u,
        szDesc = ByteArray(32),
        cxDefault = 0u,
        cyDefault = 0u,
        flStyleDefault = 0u,
        flExtStyleDefault = 0u,
        flCtrlTypeMask = 0u,
        szTextDefault = ByteArray(256),
        cStyleFlags = 0,
        aStyleFlagsCtorArg = MutPtr(0L),
        lpfnStyle = null,
        lpfnSizeToText = null,
        dwReserved1 = 0u,
        dwReserved2 = 0u,
    )

    public operator fun component1(): ByteArray = this.szClass

    public operator fun component2(): UInt = this.flOptions

    public operator fun component3(): ByteArray = this.szDesc

    public operator fun component4(): UInt = this.cxDefault

    public operator fun component5(): UInt = this.cyDefault

    public operator fun component6(): UInt = this.flStyleDefault

    public operator fun component7(): UInt = this.flExtStyleDefault

    public operator fun component8(): UInt = this.flCtrlTypeMask

    public operator fun component9(): ByteArray = this.szTextDefault

    public operator fun component10(): Int = this.cStyleFlags

    public operator fun component11(): MutPtr = this.aStyleFlags

    public operator fun component12(): Lpfnccstylea = this.lpfnStyle

    public operator fun component13(): Lpfnccsizetotexta = this.lpfnSizeToText

    public operator fun component14(): UInt = this.dwReserved1

    public operator fun component15(): UInt = this.dwReserved2

    public fun copy(szClass: ByteArray = this.szClass, flOptions: UInt = this.flOptions, szDesc: ByteArray = this.szDesc, cxDefault: UInt = this.cxDefault, cyDefault: UInt = this.cyDefault, flStyleDefault: UInt = this.flStyleDefault, flExtStyleDefault: UInt = this.flExtStyleDefault, flCtrlTypeMask: UInt = this.flCtrlTypeMask, szTextDefault: ByteArray = this.szTextDefault, cStyleFlags: Int = this.cStyleFlags, aStyleFlags: MutPtr = this.aStyleFlags, lpfnStyle: Lpfnccstylea = this.lpfnStyle, lpfnSizeToText: Lpfnccsizetotexta = this.lpfnSizeToText, dwReserved1: UInt = this.dwReserved1, dwReserved2: UInt = this.dwReserved2): Ccinfoa = Ccinfoa(szClass = szClass, flOptions = flOptions, szDesc = szDesc, cxDefault = cxDefault, cyDefault = cyDefault, flStyleDefault = flStyleDefault, flExtStyleDefault = flExtStyleDefault, flCtrlTypeMask = flCtrlTypeMask, szTextDefault = szTextDefault, cStyleFlags = cStyleFlags, aStyleFlagsCtorArg = aStyleFlags, lpfnStyle = lpfnStyle, lpfnSizeToText = lpfnSizeToText, dwReserved1 = dwReserved1, dwReserved2 = dwReserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccinfoa) return false
        if (!this.szClass.contentEquals(other.szClass)) return false
        if (this.flOptions != other.flOptions) return false
        if (!this.szDesc.contentEquals(other.szDesc)) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cyDefault != other.cyDefault) return false
        if (this.flStyleDefault != other.flStyleDefault) return false
        if (this.flExtStyleDefault != other.flExtStyleDefault) return false
        if (this.flCtrlTypeMask != other.flCtrlTypeMask) return false
        if (!this.szTextDefault.contentEquals(other.szTextDefault)) return false
        if (this.cStyleFlags != other.cStyleFlags) return false
        if (this.aStyleFlags != other.aStyleFlags) return false
        if (this.lpfnStyle != other.lpfnStyle) return false
        if (this.lpfnSizeToText != other.lpfnSizeToText) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.contentHashCode()
        result = 31 * result + this.flOptions.hashCode()
        result = 31 * result + this.szDesc.contentHashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cyDefault.hashCode()
        result = 31 * result + this.flStyleDefault.hashCode()
        result = 31 * result + this.flExtStyleDefault.hashCode()
        result = 31 * result + this.flCtrlTypeMask.hashCode()
        result = 31 * result + this.szTextDefault.contentHashCode()
        result = 31 * result + this.cStyleFlags.hashCode()
        result = 31 * result + this.aStyleFlags.hashCode()
        result = 31 * result + this.lpfnStyle.hashCode()
        result = 31 * result + this.lpfnSizeToText.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szClass: ByteArray = ByteArray(32),
            flOptions: UInt = 0u,
            szDesc: ByteArray = ByteArray(32),
            cxDefault: UInt = 0u,
            cyDefault: UInt = 0u,
            flStyleDefault: UInt = 0u,
            flExtStyleDefault: UInt = 0u,
            flCtrlTypeMask: UInt = 0u,
            szTextDefault: ByteArray = ByteArray(256),
            cStyleFlags: Int = 0,
            aStyleFlags: MutPtr = MutPtr(0L),
            lpfnStyle: Lpfnccstylea = null,
            lpfnSizeToText: Lpfnccsizetotexta = null,
            dwReserved1: UInt = 0u,
            dwReserved2: UInt = 0u,
        ): Ccinfoa =
            Ccinfoa(
                szClass = szClass,
                flOptions = flOptions,
                szDesc = szDesc,
                cxDefault = cxDefault,
                cyDefault = cyDefault,
                flStyleDefault = flStyleDefault,
                flExtStyleDefault = flExtStyleDefault,
                flCtrlTypeMask = flCtrlTypeMask,
                szTextDefault = szTextDefault,
                cStyleFlags = cStyleFlags,
                aStyleFlagsCtorArg = aStyleFlags,
                lpfnStyle = lpfnStyle,
                lpfnSizeToText = lpfnSizeToText,
                dwReserved1 = dwReserved1,
                dwReserved2 = dwReserved2,
            )
    }
}

public class Ccinfow internal constructor(
    public var szClass: UShortArray,
    public var flOptions: UInt,
    public var szDesc: UShortArray,
    public var cxDefault: UInt,
    public var cyDefault: UInt,
    public var flStyleDefault: UInt,
    public var flExtStyleDefault: UInt,
    public var flCtrlTypeMask: UInt,
    public var cStyleFlags: Int,
    aStyleFlagsCtorArg: MutPtr,
    public var szTextDefault: UShortArray,
    public var lpfnStyle: Lpfnccstylew,
    public var lpfnSizeToText: Lpfnccsizetotextw,
    public var dwReserved1: UInt,
    public var dwReserved2: UInt,
) {
    public var aStyleFlags: MutPtr = aStyleFlagsCtorArg
        internal set

    public constructor() : this(
        szClass = UShortArray(32),
        flOptions = 0u,
        szDesc = UShortArray(32),
        cxDefault = 0u,
        cyDefault = 0u,
        flStyleDefault = 0u,
        flExtStyleDefault = 0u,
        flCtrlTypeMask = 0u,
        cStyleFlags = 0,
        aStyleFlagsCtorArg = MutPtr(0L),
        szTextDefault = UShortArray(256),
        lpfnStyle = null,
        lpfnSizeToText = null,
        dwReserved1 = 0u,
        dwReserved2 = 0u,
    )

    public operator fun component1(): UShortArray = this.szClass

    public operator fun component2(): UInt = this.flOptions

    public operator fun component3(): UShortArray = this.szDesc

    public operator fun component4(): UInt = this.cxDefault

    public operator fun component5(): UInt = this.cyDefault

    public operator fun component6(): UInt = this.flStyleDefault

    public operator fun component7(): UInt = this.flExtStyleDefault

    public operator fun component8(): UInt = this.flCtrlTypeMask

    public operator fun component9(): Int = this.cStyleFlags

    public operator fun component10(): MutPtr = this.aStyleFlags

    public operator fun component11(): UShortArray = this.szTextDefault

    public operator fun component12(): Lpfnccstylew = this.lpfnStyle

    public operator fun component13(): Lpfnccsizetotextw = this.lpfnSizeToText

    public operator fun component14(): UInt = this.dwReserved1

    public operator fun component15(): UInt = this.dwReserved2

    public fun copy(szClass: UShortArray = this.szClass, flOptions: UInt = this.flOptions, szDesc: UShortArray = this.szDesc, cxDefault: UInt = this.cxDefault, cyDefault: UInt = this.cyDefault, flStyleDefault: UInt = this.flStyleDefault, flExtStyleDefault: UInt = this.flExtStyleDefault, flCtrlTypeMask: UInt = this.flCtrlTypeMask, cStyleFlags: Int = this.cStyleFlags, aStyleFlags: MutPtr = this.aStyleFlags, szTextDefault: UShortArray = this.szTextDefault, lpfnStyle: Lpfnccstylew = this.lpfnStyle, lpfnSizeToText: Lpfnccsizetotextw = this.lpfnSizeToText, dwReserved1: UInt = this.dwReserved1, dwReserved2: UInt = this.dwReserved2): Ccinfow = Ccinfow(szClass = szClass, flOptions = flOptions, szDesc = szDesc, cxDefault = cxDefault, cyDefault = cyDefault, flStyleDefault = flStyleDefault, flExtStyleDefault = flExtStyleDefault, flCtrlTypeMask = flCtrlTypeMask, cStyleFlags = cStyleFlags, aStyleFlagsCtorArg = aStyleFlags, szTextDefault = szTextDefault, lpfnStyle = lpfnStyle, lpfnSizeToText = lpfnSizeToText, dwReserved1 = dwReserved1, dwReserved2 = dwReserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccinfow) return false
        if (!this.szClass.contentEquals(other.szClass)) return false
        if (this.flOptions != other.flOptions) return false
        if (!this.szDesc.contentEquals(other.szDesc)) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cyDefault != other.cyDefault) return false
        if (this.flStyleDefault != other.flStyleDefault) return false
        if (this.flExtStyleDefault != other.flExtStyleDefault) return false
        if (this.flCtrlTypeMask != other.flCtrlTypeMask) return false
        if (this.cStyleFlags != other.cStyleFlags) return false
        if (this.aStyleFlags != other.aStyleFlags) return false
        if (!this.szTextDefault.contentEquals(other.szTextDefault)) return false
        if (this.lpfnStyle != other.lpfnStyle) return false
        if (this.lpfnSizeToText != other.lpfnSizeToText) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.contentHashCode()
        result = 31 * result + this.flOptions.hashCode()
        result = 31 * result + this.szDesc.contentHashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cyDefault.hashCode()
        result = 31 * result + this.flStyleDefault.hashCode()
        result = 31 * result + this.flExtStyleDefault.hashCode()
        result = 31 * result + this.flCtrlTypeMask.hashCode()
        result = 31 * result + this.cStyleFlags.hashCode()
        result = 31 * result + this.aStyleFlags.hashCode()
        result = 31 * result + this.szTextDefault.contentHashCode()
        result = 31 * result + this.lpfnStyle.hashCode()
        result = 31 * result + this.lpfnSizeToText.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szClass: UShortArray = UShortArray(32),
            flOptions: UInt = 0u,
            szDesc: UShortArray = UShortArray(32),
            cxDefault: UInt = 0u,
            cyDefault: UInt = 0u,
            flStyleDefault: UInt = 0u,
            flExtStyleDefault: UInt = 0u,
            flCtrlTypeMask: UInt = 0u,
            cStyleFlags: Int = 0,
            aStyleFlags: MutPtr = MutPtr(0L),
            szTextDefault: UShortArray = UShortArray(256),
            lpfnStyle: Lpfnccstylew = null,
            lpfnSizeToText: Lpfnccsizetotextw = null,
            dwReserved1: UInt = 0u,
            dwReserved2: UInt = 0u,
        ): Ccinfow =
            Ccinfow(
                szClass = szClass,
                flOptions = flOptions,
                szDesc = szDesc,
                cxDefault = cxDefault,
                cyDefault = cyDefault,
                flStyleDefault = flStyleDefault,
                flExtStyleDefault = flExtStyleDefault,
                flCtrlTypeMask = flCtrlTypeMask,
                cStyleFlags = cStyleFlags,
                aStyleFlagsCtorArg = aStyleFlags,
                szTextDefault = szTextDefault,
                lpfnStyle = lpfnStyle,
                lpfnSizeToText = lpfnSizeToText,
                dwReserved1 = dwReserved1,
                dwReserved2 = dwReserved2,
            )
    }
}

public data class Ccstylea(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: ByteArray = ByteArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstylea) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flExtStyle != other.flExtStyle) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.lgid != other.lgid) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flExtStyle.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.lgid.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccstylea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccstylea> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): Ccstylea =
                    Ccstylea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 266L),
                    )
                override fun writeNative(addr: Long, value: Ccstylea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flExtStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 8L, value.szText.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 264L, value.lgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 266L, value.wReserved1)
                }
            }
    }
}

public class Ccstyleflaga internal constructor(
    public var flStyle: UInt,
    public var flStyleMask: UInt,
    pszStyleCtorArg: Pstr,
) {
    public var pszStyle: Pstr = pszStyleCtorArg
        internal set

    public constructor() : this(
        flStyle = 0u,
        flStyleMask = 0u,
        pszStyleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flStyle

    public operator fun component2(): UInt = this.flStyleMask

    public operator fun component3(): Pstr = this.pszStyle

    public fun copy(flStyle: UInt = this.flStyle, flStyleMask: UInt = this.flStyleMask, pszStyle: Pstr = this.pszStyle): Ccstyleflaga = Ccstyleflaga(flStyle = flStyle, flStyleMask = flStyleMask, pszStyleCtorArg = pszStyle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstyleflaga) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flStyleMask != other.flStyleMask) return false
        if (this.pszStyle != other.pszStyle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flStyleMask.hashCode()
        result = 31 * result + this.pszStyle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flStyle: UInt = 0u,
            flStyleMask: UInt = 0u,
            pszStyle: Pstr = MutPtr(0L),
        ): Ccstyleflaga =
            Ccstyleflaga(
                flStyle = flStyle,
                flStyleMask = flStyleMask,
                pszStyleCtorArg = pszStyle,
            )
    }
}

public class Ccstyleflagw internal constructor(
    public var flStyle: UInt,
    public var flStyleMask: UInt,
    pszStyleCtorArg: Pwstr,
) {
    public var pszStyle: Pwstr = pszStyleCtorArg
        internal set

    public constructor() : this(
        flStyle = 0u,
        flStyleMask = 0u,
        pszStyleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flStyle

    public operator fun component2(): UInt = this.flStyleMask

    public operator fun component3(): Pwstr = this.pszStyle

    public fun copy(flStyle: UInt = this.flStyle, flStyleMask: UInt = this.flStyleMask, pszStyle: Pwstr = this.pszStyle): Ccstyleflagw = Ccstyleflagw(flStyle = flStyle, flStyleMask = flStyleMask, pszStyleCtorArg = pszStyle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstyleflagw) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flStyleMask != other.flStyleMask) return false
        if (this.pszStyle != other.pszStyle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flStyleMask.hashCode()
        result = 31 * result + this.pszStyle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flStyle: UInt = 0u,
            flStyleMask: UInt = 0u,
            pszStyle: Pwstr = MutPtr(0L),
        ): Ccstyleflagw =
            Ccstyleflagw(
                flStyle = flStyle,
                flStyleMask = flStyleMask,
                pszStyleCtorArg = pszStyle,
            )
    }
}

public data class Ccstylew(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: UShortArray = UShortArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstylew) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flExtStyle != other.flExtStyle) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.lgid != other.lgid) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flExtStyle.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.lgid.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccstylew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccstylew> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): Ccstylew =
                    Ccstylew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 522L),
                    )
                override fun writeNative(addr: Long, value: Ccstylew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flExtStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 8L, value.szText.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 520L, value.lgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 522L, value.wReserved1)
                }
            }
    }
}

public data class Colormap(
    public var from: Colorref = 0u,
    public var to: Colorref = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colormap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colormap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Colormap =
                    Colormap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Colormap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.from)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.to)
                }
            }
    }
}

public data class Colorscheme(
    public var dwSize: UInt = 0u,
    public var clrBtnHighlight: Colorref = 0u,
    public var clrBtnShadow: Colorref = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colorscheme> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colorscheme> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Colorscheme =
                    Colorscheme(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Colorscheme) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clrBtnHighlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.clrBtnShadow)
                }
            }
    }
}

public class Comboboxexitema internal constructor(
    public var mask: ComboboxExItemFlags,
    public var iItem: Int,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var iOverlay: Int,
    public var iIndent: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        iItem = 0,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        iOverlay = 0,
        iIndent = 0,
        lParam = 0L,
    )

    public operator fun component1(): ComboboxExItemFlags = this.mask

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Pstr = this.pszText

    public operator fun component4(): Int = this.cchTextMax

    public operator fun component5(): Int = this.iImage

    public operator fun component6(): Int = this.iSelectedImage

    public operator fun component7(): Int = this.iOverlay

    public operator fun component8(): Int = this.iIndent

    public operator fun component9(): Lparam = this.lParam

    public fun copy(mask: ComboboxExItemFlags = this.mask, iItem: Int = this.iItem, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, iOverlay: Int = this.iOverlay, iIndent: Int = this.iIndent, lParam: Lparam = this.lParam): Comboboxexitema = Comboboxexitema(mask = mask, iItem = iItem, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, iOverlay = iOverlay, iIndent = iIndent, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Comboboxexitema) return false
        if (this.mask != other.mask) return false
        if (this.iItem != other.iItem) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.iOverlay != other.iOverlay) return false
        if (this.iIndent != other.iIndent) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.iOverlay.hashCode()
        result = 31 * result + this.iIndent.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: ComboboxExItemFlags = 0u,
            iItem: Int = 0,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            iOverlay: Int = 0,
            iIndent: Int = 0,
            lParam: Lparam = 0L,
        ): Comboboxexitema =
            Comboboxexitema(
                mask = mask,
                iItem = iItem,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                iOverlay = iOverlay,
                iIndent = iIndent,
                lParam = lParam,
            )
    }
}

public class Comboboxexitemw internal constructor(
    public var mask: ComboboxExItemFlags,
    public var iItem: Int,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var iOverlay: Int,
    public var iIndent: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        iItem = 0,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        iOverlay = 0,
        iIndent = 0,
        lParam = 0L,
    )

    public operator fun component1(): ComboboxExItemFlags = this.mask

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Pwstr = this.pszText

    public operator fun component4(): Int = this.cchTextMax

    public operator fun component5(): Int = this.iImage

    public operator fun component6(): Int = this.iSelectedImage

    public operator fun component7(): Int = this.iOverlay

    public operator fun component8(): Int = this.iIndent

    public operator fun component9(): Lparam = this.lParam

    public fun copy(mask: ComboboxExItemFlags = this.mask, iItem: Int = this.iItem, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, iOverlay: Int = this.iOverlay, iIndent: Int = this.iIndent, lParam: Lparam = this.lParam): Comboboxexitemw = Comboboxexitemw(mask = mask, iItem = iItem, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, iOverlay = iOverlay, iIndent = iIndent, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Comboboxexitemw) return false
        if (this.mask != other.mask) return false
        if (this.iItem != other.iItem) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.iOverlay != other.iOverlay) return false
        if (this.iIndent != other.iIndent) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.iOverlay.hashCode()
        result = 31 * result + this.iIndent.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: ComboboxExItemFlags = 0u,
            iItem: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            iOverlay: Int = 0,
            iIndent: Int = 0,
            lParam: Lparam = 0L,
        ): Comboboxexitemw =
            Comboboxexitemw(
                mask = mask,
                iItem = iItem,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                iOverlay = iOverlay,
                iIndent = iIndent,
                lParam = lParam,
            )
    }
}

public class Comboboxinfo internal constructor(
    public var cbSize: UInt,
    public var rcItem: Rect,
    public var rcButton: Rect,
    public var stateButton: ComboboxinfoButtonState,
    hwndComboCtorArg: Hwnd,
    hwndItemCtorArg: Hwnd,
    hwndListCtorArg: Hwnd,
) {
    public var hwndCombo: Hwnd = hwndComboCtorArg
        internal set

    public var hwndItem: Hwnd = hwndItemCtorArg
        internal set

    public var hwndList: Hwnd = hwndListCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        rcItem = Rect(),
        rcButton = Rect(),
        stateButton = 0u,
        hwndComboCtorArg = MutPtr(0L),
        hwndItemCtorArg = MutPtr(0L),
        hwndListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Rect = this.rcItem

    public operator fun component3(): Rect = this.rcButton

    public operator fun component4(): ComboboxinfoButtonState = this.stateButton

    public operator fun component5(): Hwnd = this.hwndCombo

    public operator fun component6(): Hwnd = this.hwndItem

    public operator fun component7(): Hwnd = this.hwndList

    public fun copy(cbSize: UInt = this.cbSize, rcItem: Rect = this.rcItem, rcButton: Rect = this.rcButton, stateButton: ComboboxinfoButtonState = this.stateButton, hwndCombo: Hwnd = this.hwndCombo, hwndItem: Hwnd = this.hwndItem, hwndList: Hwnd = this.hwndList): Comboboxinfo = Comboboxinfo(cbSize = cbSize, rcItem = rcItem, rcButton = rcButton, stateButton = stateButton, hwndComboCtorArg = hwndCombo, hwndItemCtorArg = hwndItem, hwndListCtorArg = hwndList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Comboboxinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcItem != other.rcItem) return false
        if (this.rcButton != other.rcButton) return false
        if (this.stateButton != other.stateButton) return false
        if (this.hwndCombo != other.hwndCombo) return false
        if (this.hwndItem != other.hwndItem) return false
        if (this.hwndList != other.hwndList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcItem.hashCode()
        result = 31 * result + this.rcButton.hashCode()
        result = 31 * result + this.stateButton.hashCode()
        result = 31 * result + this.hwndCombo.hashCode()
        result = 31 * result + this.hwndItem.hashCode()
        result = 31 * result + this.hwndList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            rcItem: Rect = Rect(),
            rcButton: Rect = Rect(),
            stateButton: ComboboxinfoButtonState = 0u,
            hwndCombo: Hwnd = MutPtr(0L),
            hwndItem: Hwnd = MutPtr(0L),
            hwndList: Hwnd = MutPtr(0L),
        ): Comboboxinfo =
            Comboboxinfo(
                cbSize = cbSize,
                rcItem = rcItem,
                rcButton = rcButton,
                stateButton = stateButton,
                hwndComboCtorArg = hwndCombo,
                hwndItemCtorArg = hwndItem,
                hwndListCtorArg = hwndList,
            )
    }
}

public class Compareitemstruct internal constructor(
    public var ctlType: DrawitemstructCtlType,
    public var ctlID: UInt,
    hwndItemCtorArg: Hwnd,
    public var itemID1: UInt,
    public var itemData1: Int,
    public var itemID2: UInt,
    public var itemData2: Int,
    public var dwLocaleId: UInt,
) {
    public var hwndItem: Hwnd = hwndItemCtorArg
        internal set

    public constructor() : this(
        ctlType = 0u,
        ctlID = 0u,
        hwndItemCtorArg = MutPtr(0L),
        itemID1 = 0u,
        itemData1 = 0,
        itemID2 = 0u,
        itemData2 = 0,
        dwLocaleId = 0u,
    )

    public operator fun component1(): DrawitemstructCtlType = this.ctlType

    public operator fun component2(): UInt = this.ctlID

    public operator fun component3(): Hwnd = this.hwndItem

    public operator fun component4(): UInt = this.itemID1

    public operator fun component5(): Int = this.itemData1

    public operator fun component6(): UInt = this.itemID2

    public operator fun component7(): Int = this.itemData2

    public operator fun component8(): UInt = this.dwLocaleId

    public fun copy(ctlType: DrawitemstructCtlType = this.ctlType, ctlID: UInt = this.ctlID, hwndItem: Hwnd = this.hwndItem, itemID1: UInt = this.itemID1, itemData1: Int = this.itemData1, itemID2: UInt = this.itemID2, itemData2: Int = this.itemData2, dwLocaleId: UInt = this.dwLocaleId): Compareitemstruct = Compareitemstruct(ctlType = ctlType, ctlID = ctlID, hwndItemCtorArg = hwndItem, itemID1 = itemID1, itemData1 = itemData1, itemID2 = itemID2, itemData2 = itemData2, dwLocaleId = dwLocaleId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Compareitemstruct) return false
        if (this.ctlType != other.ctlType) return false
        if (this.ctlID != other.ctlID) return false
        if (this.hwndItem != other.hwndItem) return false
        if (this.itemID1 != other.itemID1) return false
        if (this.itemData1 != other.itemData1) return false
        if (this.itemID2 != other.itemID2) return false
        if (this.itemData2 != other.itemData2) return false
        if (this.dwLocaleId != other.dwLocaleId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ctlType.hashCode()
        result = 31 * result + this.ctlID.hashCode()
        result = 31 * result + this.hwndItem.hashCode()
        result = 31 * result + this.itemID1.hashCode()
        result = 31 * result + this.itemData1.hashCode()
        result = 31 * result + this.itemID2.hashCode()
        result = 31 * result + this.itemData2.hashCode()
        result = 31 * result + this.dwLocaleId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ctlType: DrawitemstructCtlType = 0u,
            ctlID: UInt = 0u,
            hwndItem: Hwnd = MutPtr(0L),
            itemID1: UInt = 0u,
            itemData1: Int = 0,
            itemID2: UInt = 0u,
            itemData2: Int = 0,
            dwLocaleId: UInt = 0u,
        ): Compareitemstruct =
            Compareitemstruct(
                ctlType = ctlType,
                ctlID = ctlID,
                hwndItemCtorArg = hwndItem,
                itemID1 = itemID1,
                itemData1 = itemData1,
                itemID2 = itemID2,
                itemData2 = itemData2,
                dwLocaleId = dwLocaleId,
            )
    }
}

public class Datetimepickerinfo internal constructor(
    public var cbSize: UInt,
    public var rcCheck: Rect,
    public var stateCheck: UInt,
    public var rcButton: Rect,
    public var stateButton: UInt,
    hwndEditCtorArg: Hwnd,
    hwndUDCtorArg: Hwnd,
    hwndDropDownCtorArg: Hwnd,
) {
    public var hwndEdit: Hwnd = hwndEditCtorArg
        internal set

    public var hwndUD: Hwnd = hwndUDCtorArg
        internal set

    public var hwndDropDown: Hwnd = hwndDropDownCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        rcCheck = Rect(),
        stateCheck = 0u,
        rcButton = Rect(),
        stateButton = 0u,
        hwndEditCtorArg = MutPtr(0L),
        hwndUDCtorArg = MutPtr(0L),
        hwndDropDownCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Rect = this.rcCheck

    public operator fun component3(): UInt = this.stateCheck

    public operator fun component4(): Rect = this.rcButton

    public operator fun component5(): UInt = this.stateButton

    public operator fun component6(): Hwnd = this.hwndEdit

    public operator fun component7(): Hwnd = this.hwndUD

    public operator fun component8(): Hwnd = this.hwndDropDown

    public fun copy(cbSize: UInt = this.cbSize, rcCheck: Rect = this.rcCheck, stateCheck: UInt = this.stateCheck, rcButton: Rect = this.rcButton, stateButton: UInt = this.stateButton, hwndEdit: Hwnd = this.hwndEdit, hwndUD: Hwnd = this.hwndUD, hwndDropDown: Hwnd = this.hwndDropDown): Datetimepickerinfo = Datetimepickerinfo(cbSize = cbSize, rcCheck = rcCheck, stateCheck = stateCheck, rcButton = rcButton, stateButton = stateButton, hwndEditCtorArg = hwndEdit, hwndUDCtorArg = hwndUD, hwndDropDownCtorArg = hwndDropDown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Datetimepickerinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcCheck != other.rcCheck) return false
        if (this.stateCheck != other.stateCheck) return false
        if (this.rcButton != other.rcButton) return false
        if (this.stateButton != other.stateButton) return false
        if (this.hwndEdit != other.hwndEdit) return false
        if (this.hwndUD != other.hwndUD) return false
        if (this.hwndDropDown != other.hwndDropDown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcCheck.hashCode()
        result = 31 * result + this.stateCheck.hashCode()
        result = 31 * result + this.rcButton.hashCode()
        result = 31 * result + this.stateButton.hashCode()
        result = 31 * result + this.hwndEdit.hashCode()
        result = 31 * result + this.hwndUD.hashCode()
        result = 31 * result + this.hwndDropDown.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            rcCheck: Rect = Rect(),
            stateCheck: UInt = 0u,
            rcButton: Rect = Rect(),
            stateButton: UInt = 0u,
            hwndEdit: Hwnd = MutPtr(0L),
            hwndUD: Hwnd = MutPtr(0L),
            hwndDropDown: Hwnd = MutPtr(0L),
        ): Datetimepickerinfo =
            Datetimepickerinfo(
                cbSize = cbSize,
                rcCheck = rcCheck,
                stateCheck = stateCheck,
                rcButton = rcButton,
                stateButton = stateButton,
                hwndEditCtorArg = hwndEdit,
                hwndUDCtorArg = hwndUD,
                hwndDropDownCtorArg = hwndDropDown,
            )
    }
}

public class Deleteitemstruct internal constructor(
    public var ctlType: DrawitemstructCtlType,
    public var ctlID: UInt,
    public var itemID: UInt,
    hwndItemCtorArg: Hwnd,
    public var itemData: Int,
) {
    public var hwndItem: Hwnd = hwndItemCtorArg
        internal set

    public constructor() : this(
        ctlType = 0u,
        ctlID = 0u,
        itemID = 0u,
        hwndItemCtorArg = MutPtr(0L),
        itemData = 0,
    )

    public operator fun component1(): DrawitemstructCtlType = this.ctlType

    public operator fun component2(): UInt = this.ctlID

    public operator fun component3(): UInt = this.itemID

    public operator fun component4(): Hwnd = this.hwndItem

    public operator fun component5(): Int = this.itemData

    public fun copy(ctlType: DrawitemstructCtlType = this.ctlType, ctlID: UInt = this.ctlID, itemID: UInt = this.itemID, hwndItem: Hwnd = this.hwndItem, itemData: Int = this.itemData): Deleteitemstruct = Deleteitemstruct(ctlType = ctlType, ctlID = ctlID, itemID = itemID, hwndItemCtorArg = hwndItem, itemData = itemData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Deleteitemstruct) return false
        if (this.ctlType != other.ctlType) return false
        if (this.ctlID != other.ctlID) return false
        if (this.itemID != other.itemID) return false
        if (this.hwndItem != other.hwndItem) return false
        if (this.itemData != other.itemData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ctlType.hashCode()
        result = 31 * result + this.ctlID.hashCode()
        result = 31 * result + this.itemID.hashCode()
        result = 31 * result + this.hwndItem.hashCode()
        result = 31 * result + this.itemData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ctlType: DrawitemstructCtlType = 0u,
            ctlID: UInt = 0u,
            itemID: UInt = 0u,
            hwndItem: Hwnd = MutPtr(0L),
            itemData: Int = 0,
        ): Deleteitemstruct =
            Deleteitemstruct(
                ctlType = ctlType,
                ctlID = ctlID,
                itemID = itemID,
                hwndItemCtorArg = hwndItem,
                itemData = itemData,
            )
    }
}

public class Dpastreaminfo internal constructor(
    public var iPos: Int,
    pvItemCtorArg: MutPtr,
) {
    public var pvItem: MutPtr = pvItemCtorArg
        internal set

    public constructor() : this(
        iPos = 0,
        pvItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.iPos

    public operator fun component2(): MutPtr = this.pvItem

    public fun copy(iPos: Int = this.iPos, pvItem: MutPtr = this.pvItem): Dpastreaminfo = Dpastreaminfo(iPos = iPos, pvItemCtorArg = pvItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dpastreaminfo) return false
        if (this.iPos != other.iPos) return false
        if (this.pvItem != other.pvItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iPos.hashCode()
        result = 31 * result + this.pvItem.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dpastreaminfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dpastreaminfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dpastreaminfo =
                    Dpastreaminfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dpastreaminfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iPos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvItem)
                }
            }

        public operator fun invoke(
            iPos: Int = 0,
            pvItem: MutPtr = MutPtr(0L),
        ): Dpastreaminfo =
            Dpastreaminfo(
                iPos = iPos,
                pvItemCtorArg = pvItem,
            )
    }
}

public class Draglistinfo internal constructor(
    public var uNotification: DraglistinfoNotificationFlags,
    hWndCtorArg: Hwnd,
    public var ptCursor: Point,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        uNotification = 0u,
        hWndCtorArg = MutPtr(0L),
        ptCursor = Point(),
    )

    public operator fun component1(): DraglistinfoNotificationFlags = this.uNotification

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): Point = this.ptCursor

    public fun copy(uNotification: DraglistinfoNotificationFlags = this.uNotification, hWnd: Hwnd = this.hWnd, ptCursor: Point = this.ptCursor): Draglistinfo = Draglistinfo(uNotification = uNotification, hWndCtorArg = hWnd, ptCursor = ptCursor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Draglistinfo) return false
        if (this.uNotification != other.uNotification) return false
        if (this.hWnd != other.hWnd) return false
        if (this.ptCursor != other.ptCursor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNotification.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.ptCursor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uNotification: DraglistinfoNotificationFlags = 0u,
            hWnd: Hwnd = MutPtr(0L),
            ptCursor: Point = Point(),
        ): Draglistinfo =
            Draglistinfo(
                uNotification = uNotification,
                hWndCtorArg = hWnd,
                ptCursor = ptCursor,
            )
    }
}

public class Drawitemstruct internal constructor(
    public var ctlType: DrawitemstructCtlType,
    public var ctlID: UInt,
    public var itemID: UInt,
    public var itemAction: OdaFlags,
    public var itemState: OdsFlags,
    hwndItemCtorArg: Hwnd,
    hDCCtorArg: Hdc,
    public var rcItem: Rect,
    public var itemData: Int,
) {
    public var hwndItem: Hwnd = hwndItemCtorArg
        internal set

    public var hDC: Hdc = hDCCtorArg
        internal set

    public constructor() : this(
        ctlType = 0u,
        ctlID = 0u,
        itemID = 0u,
        itemAction = 0u,
        itemState = 0u,
        hwndItemCtorArg = MutPtr(0L),
        hDCCtorArg = MutPtr(0L),
        rcItem = Rect(),
        itemData = 0,
    )

    public operator fun component1(): DrawitemstructCtlType = this.ctlType

    public operator fun component2(): UInt = this.ctlID

    public operator fun component3(): UInt = this.itemID

    public operator fun component4(): OdaFlags = this.itemAction

    public operator fun component5(): OdsFlags = this.itemState

    public operator fun component6(): Hwnd = this.hwndItem

    public operator fun component7(): Hdc = this.hDC

    public operator fun component8(): Rect = this.rcItem

    public operator fun component9(): Int = this.itemData

    public fun copy(ctlType: DrawitemstructCtlType = this.ctlType, ctlID: UInt = this.ctlID, itemID: UInt = this.itemID, itemAction: OdaFlags = this.itemAction, itemState: OdsFlags = this.itemState, hwndItem: Hwnd = this.hwndItem, hDC: Hdc = this.hDC, rcItem: Rect = this.rcItem, itemData: Int = this.itemData): Drawitemstruct = Drawitemstruct(ctlType = ctlType, ctlID = ctlID, itemID = itemID, itemAction = itemAction, itemState = itemState, hwndItemCtorArg = hwndItem, hDCCtorArg = hDC, rcItem = rcItem, itemData = itemData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drawitemstruct) return false
        if (this.ctlType != other.ctlType) return false
        if (this.ctlID != other.ctlID) return false
        if (this.itemID != other.itemID) return false
        if (this.itemAction != other.itemAction) return false
        if (this.itemState != other.itemState) return false
        if (this.hwndItem != other.hwndItem) return false
        if (this.hDC != other.hDC) return false
        if (this.rcItem != other.rcItem) return false
        if (this.itemData != other.itemData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ctlType.hashCode()
        result = 31 * result + this.ctlID.hashCode()
        result = 31 * result + this.itemID.hashCode()
        result = 31 * result + this.itemAction.hashCode()
        result = 31 * result + this.itemState.hashCode()
        result = 31 * result + this.hwndItem.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.rcItem.hashCode()
        result = 31 * result + this.itemData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ctlType: DrawitemstructCtlType = 0u,
            ctlID: UInt = 0u,
            itemID: UInt = 0u,
            itemAction: OdaFlags = 0u,
            itemState: OdsFlags = 0u,
            hwndItem: Hwnd = MutPtr(0L),
            hDC: Hdc = MutPtr(0L),
            rcItem: Rect = Rect(),
            itemData: Int = 0,
        ): Drawitemstruct =
            Drawitemstruct(
                ctlType = ctlType,
                ctlID = ctlID,
                itemID = itemID,
                itemAction = itemAction,
                itemState = itemState,
                hwndItemCtorArg = hwndItem,
                hDCCtorArg = hDC,
                rcItem = rcItem,
                itemData = itemData,
            )
    }
}

public data class Dtbgopts(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var rcClip: Rect = Rect(),
)

public data class Dttopts(
    public var dwSize: UInt = 0u,
    public var dwFlags: DttoptsFlags = 0u,
    public var crText: Colorref = 0u,
    public var crBorder: Colorref = 0u,
    public var crShadow: Colorref = 0u,
    public var iTextShadowType: Int = 0,
    public var ptShadowOffset: Point = Point(),
    public var iBorderSize: Int = 0,
    public var iFontPropId: Int = 0,
    public var iColorPropId: Int = 0,
    public var iStateId: Int = 0,
    public var fApplyOverlay: Bool = 0,
    public var iGlowSize: Int = 0,
    public var pfnDrawTextCallback: DttCallbackProc = null,
    public var lParam: Lparam = 0L,
)

public class Editballoontip internal constructor(
    public var cbStruct: UInt,
    pszTitleCtorArg: Pcwstr,
    pszTextCtorArg: Pcwstr,
    public var ttiIcon: EditballoontipIcon,
) {
    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pszText: Pcwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pszTitleCtorArg = ConstPtr(0L),
        pszTextCtorArg = ConstPtr(0L),
        ttiIcon = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pszTitle

    public operator fun component3(): Pcwstr = this.pszText

    public operator fun component4(): EditballoontipIcon = this.ttiIcon

    public fun copy(cbStruct: UInt = this.cbStruct, pszTitle: Pcwstr = this.pszTitle, pszText: Pcwstr = this.pszText, ttiIcon: EditballoontipIcon = this.ttiIcon): Editballoontip = Editballoontip(cbStruct = cbStruct, pszTitleCtorArg = pszTitle, pszTextCtorArg = pszText, ttiIcon = ttiIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Editballoontip) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pszText != other.pszText) return false
        if (this.ttiIcon != other.ttiIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.ttiIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pszTitle: Pcwstr = ConstPtr(0L),
            pszText: Pcwstr = ConstPtr(0L),
            ttiIcon: EditballoontipIcon = 0,
        ): Editballoontip =
            Editballoontip(
                cbStruct = cbStruct,
                pszTitleCtorArg = pszTitle,
                pszTextCtorArg = pszText,
                ttiIcon = ttiIcon,
            )
    }
}

public data class Hdhittestinfo(
    public var pt: Point = Point(),
    public var flags: HeaderHittestInfoFlags = 0u,
    public var iItem: Int = 0,
)

public class Hditema internal constructor(
    public var mask: HdiMask,
    public var cxy: Int,
    pszTextCtorArg: Pstr,
    hbmCtorArg: Hbitmap,
    public var cchTextMax: Int,
    public var fmt: HeaderControlFormatFlags,
    public var lParam: Lparam,
    public var iImage: Int,
    public var iOrder: Int,
    public var type: HeaderControlFormatType,
    pvFilterCtorArg: MutPtr,
    public var state: HeaderControlFormatState,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public var hbm: Hbitmap = hbmCtorArg
        internal set

    public var pvFilter: MutPtr = pvFilterCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        cxy = 0,
        pszTextCtorArg = MutPtr(0L),
        hbmCtorArg = MutPtr(0L),
        cchTextMax = 0,
        fmt = 0,
        lParam = 0L,
        iImage = 0,
        iOrder = 0,
        type = 0u,
        pvFilterCtorArg = MutPtr(0L),
        state = 0u,
    )

    public operator fun component1(): HdiMask = this.mask

    public operator fun component2(): Int = this.cxy

    public operator fun component3(): Pstr = this.pszText

    public operator fun component4(): Hbitmap = this.hbm

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): HeaderControlFormatFlags = this.fmt

    public operator fun component7(): Lparam = this.lParam

    public operator fun component8(): Int = this.iImage

    public operator fun component9(): Int = this.iOrder

    public operator fun component10(): HeaderControlFormatType = this.type

    public operator fun component11(): MutPtr = this.pvFilter

    public operator fun component12(): HeaderControlFormatState = this.state

    public fun copy(mask: HdiMask = this.mask, cxy: Int = this.cxy, pszText: Pstr = this.pszText, hbm: Hbitmap = this.hbm, cchTextMax: Int = this.cchTextMax, fmt: HeaderControlFormatFlags = this.fmt, lParam: Lparam = this.lParam, iImage: Int = this.iImage, iOrder: Int = this.iOrder, type: HeaderControlFormatType = this.type, pvFilter: MutPtr = this.pvFilter, state: HeaderControlFormatState = this.state): Hditema = Hditema(mask = mask, cxy = cxy, pszTextCtorArg = pszText, hbmCtorArg = hbm, cchTextMax = cchTextMax, fmt = fmt, lParam = lParam, iImage = iImage, iOrder = iOrder, type = type, pvFilterCtorArg = pvFilter, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hditema) return false
        if (this.mask != other.mask) return false
        if (this.cxy != other.cxy) return false
        if (this.pszText != other.pszText) return false
        if (this.hbm != other.hbm) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.fmt != other.fmt) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        if (this.iOrder != other.iOrder) return false
        if (this.type != other.type) return false
        if (this.pvFilter != other.pvFilter) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.cxy.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.hbm.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iOrder.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.pvFilter.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: HdiMask = 0u,
            cxy: Int = 0,
            pszText: Pstr = MutPtr(0L),
            hbm: Hbitmap = MutPtr(0L),
            cchTextMax: Int = 0,
            fmt: HeaderControlFormatFlags = 0,
            lParam: Lparam = 0L,
            iImage: Int = 0,
            iOrder: Int = 0,
            type: HeaderControlFormatType = 0u,
            pvFilter: MutPtr = MutPtr(0L),
            state: HeaderControlFormatState = 0u,
        ): Hditema =
            Hditema(
                mask = mask,
                cxy = cxy,
                pszTextCtorArg = pszText,
                hbmCtorArg = hbm,
                cchTextMax = cchTextMax,
                fmt = fmt,
                lParam = lParam,
                iImage = iImage,
                iOrder = iOrder,
                type = type,
                pvFilterCtorArg = pvFilter,
                state = state,
            )
    }
}

public class Hditemw internal constructor(
    public var mask: HdiMask,
    public var cxy: Int,
    pszTextCtorArg: Pwstr,
    hbmCtorArg: Hbitmap,
    public var cchTextMax: Int,
    public var fmt: HeaderControlFormatFlags,
    public var lParam: Lparam,
    public var iImage: Int,
    public var iOrder: Int,
    public var type: HeaderControlFormatType,
    pvFilterCtorArg: MutPtr,
    public var state: HeaderControlFormatState,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public var hbm: Hbitmap = hbmCtorArg
        internal set

    public var pvFilter: MutPtr = pvFilterCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        cxy = 0,
        pszTextCtorArg = MutPtr(0L),
        hbmCtorArg = MutPtr(0L),
        cchTextMax = 0,
        fmt = 0,
        lParam = 0L,
        iImage = 0,
        iOrder = 0,
        type = 0u,
        pvFilterCtorArg = MutPtr(0L),
        state = 0u,
    )

    public operator fun component1(): HdiMask = this.mask

    public operator fun component2(): Int = this.cxy

    public operator fun component3(): Pwstr = this.pszText

    public operator fun component4(): Hbitmap = this.hbm

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): HeaderControlFormatFlags = this.fmt

    public operator fun component7(): Lparam = this.lParam

    public operator fun component8(): Int = this.iImage

    public operator fun component9(): Int = this.iOrder

    public operator fun component10(): HeaderControlFormatType = this.type

    public operator fun component11(): MutPtr = this.pvFilter

    public operator fun component12(): HeaderControlFormatState = this.state

    public fun copy(mask: HdiMask = this.mask, cxy: Int = this.cxy, pszText: Pwstr = this.pszText, hbm: Hbitmap = this.hbm, cchTextMax: Int = this.cchTextMax, fmt: HeaderControlFormatFlags = this.fmt, lParam: Lparam = this.lParam, iImage: Int = this.iImage, iOrder: Int = this.iOrder, type: HeaderControlFormatType = this.type, pvFilter: MutPtr = this.pvFilter, state: HeaderControlFormatState = this.state): Hditemw = Hditemw(mask = mask, cxy = cxy, pszTextCtorArg = pszText, hbmCtorArg = hbm, cchTextMax = cchTextMax, fmt = fmt, lParam = lParam, iImage = iImage, iOrder = iOrder, type = type, pvFilterCtorArg = pvFilter, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hditemw) return false
        if (this.mask != other.mask) return false
        if (this.cxy != other.cxy) return false
        if (this.pszText != other.pszText) return false
        if (this.hbm != other.hbm) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.fmt != other.fmt) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        if (this.iOrder != other.iOrder) return false
        if (this.type != other.type) return false
        if (this.pvFilter != other.pvFilter) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.cxy.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.hbm.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iOrder.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.pvFilter.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: HdiMask = 0u,
            cxy: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            hbm: Hbitmap = MutPtr(0L),
            cchTextMax: Int = 0,
            fmt: HeaderControlFormatFlags = 0,
            lParam: Lparam = 0L,
            iImage: Int = 0,
            iOrder: Int = 0,
            type: HeaderControlFormatType = 0u,
            pvFilter: MutPtr = MutPtr(0L),
            state: HeaderControlFormatState = 0u,
        ): Hditemw =
            Hditemw(
                mask = mask,
                cxy = cxy,
                pszTextCtorArg = pszText,
                hbmCtorArg = hbm,
                cchTextMax = cchTextMax,
                fmt = fmt,
                lParam = lParam,
                iImage = iImage,
                iOrder = iOrder,
                type = type,
                pvFilterCtorArg = pvFilter,
                state = state,
            )
    }
}

public class Hdlayout internal constructor(
    prcCtorArg: MutPtr,
    pwposCtorArg: MutPtr,
) {
    public var prc: MutPtr = prcCtorArg
        internal set

    public var pwpos: MutPtr = pwposCtorArg
        internal set

    public constructor() : this(
        prcCtorArg = MutPtr(0L),
        pwposCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.prc

    public operator fun component2(): MutPtr = this.pwpos

    public fun copy(prc: MutPtr = this.prc, pwpos: MutPtr = this.pwpos): Hdlayout = Hdlayout(prcCtorArg = prc, pwposCtorArg = pwpos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hdlayout) return false
        if (this.prc != other.prc) return false
        if (this.pwpos != other.pwpos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prc.hashCode()
        result = 31 * result + this.pwpos.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hdlayout> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hdlayout> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Hdlayout =
                    Hdlayout(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Hdlayout) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.prc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pwpos)
                }
            }

        public operator fun invoke(
            prc: MutPtr = MutPtr(0L),
            pwpos: MutPtr = MutPtr(0L),
        ): Hdlayout =
            Hdlayout(
                prcCtorArg = prc,
                pwposCtorArg = pwpos,
            )
    }
}

public class HdTextfiltera internal constructor(
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
    )

    public operator fun component1(): Pstr = this.pszText

    public operator fun component2(): Int = this.cchTextMax

    public fun copy(pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax): HdTextfiltera = HdTextfiltera(pszTextCtorArg = pszText, cchTextMax = cchTextMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HdTextfiltera) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
        ): HdTextfiltera =
            HdTextfiltera(
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
            )
    }
}

public class HdTextfilterw internal constructor(
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
    )

    public operator fun component1(): Pwstr = this.pszText

    public operator fun component2(): Int = this.cchTextMax

    public fun copy(pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax): HdTextfilterw = HdTextfilterw(pszTextCtorArg = pszText, cchTextMax = cchTextMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HdTextfilterw) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
        ): HdTextfilterw =
            HdTextfilterw(
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
            )
    }
}

public class Imageinfo internal constructor(
    hbmImageCtorArg: Hbitmap,
    hbmMaskCtorArg: Hbitmap,
    public var unused1: Int,
    public var unused2: Int,
    public var rcImage: Rect,
) {
    public var hbmImage: Hbitmap = hbmImageCtorArg
        internal set

    public var hbmMask: Hbitmap = hbmMaskCtorArg
        internal set

    public constructor() : this(
        hbmImageCtorArg = MutPtr(0L),
        hbmMaskCtorArg = MutPtr(0L),
        unused1 = 0,
        unused2 = 0,
        rcImage = Rect(),
    )

    public operator fun component1(): Hbitmap = this.hbmImage

    public operator fun component2(): Hbitmap = this.hbmMask

    public operator fun component3(): Int = this.unused1

    public operator fun component4(): Int = this.unused2

    public operator fun component5(): Rect = this.rcImage

    public fun copy(hbmImage: Hbitmap = this.hbmImage, hbmMask: Hbitmap = this.hbmMask, unused1: Int = this.unused1, unused2: Int = this.unused2, rcImage: Rect = this.rcImage): Imageinfo = Imageinfo(hbmImageCtorArg = hbmImage, hbmMaskCtorArg = hbmMask, unused1 = unused1, unused2 = unused2, rcImage = rcImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imageinfo) return false
        if (this.hbmImage != other.hbmImage) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.rcImage != other.rcImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmImage.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.rcImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmImage: Hbitmap = MutPtr(0L),
            hbmMask: Hbitmap = MutPtr(0L),
            unused1: Int = 0,
            unused2: Int = 0,
            rcImage: Rect = Rect(),
        ): Imageinfo =
            Imageinfo(
                hbmImageCtorArg = hbmImage,
                hbmMaskCtorArg = hbmMask,
                unused1 = unused1,
                unused2 = unused2,
                rcImage = rcImage,
            )
    }
}

public class Imagelistdrawparams internal constructor(
    public var cbSize: UInt,
    public var himl: Himagelist,
    public var i: Int,
    hdcDstCtorArg: Hdc,
    public var x: Int,
    public var y: Int,
    public var cx: Int,
    public var cy: Int,
    public var xBitmap: Int,
    public var yBitmap: Int,
    public var rgbBk: Colorref,
    public var rgbFg: Colorref,
    public var fStyle: UInt,
    public var dwRop: UInt,
    public var fState: UInt,
    public var frame: UInt,
    public var crEffect: Colorref,
) {
    public var hdcDst: Hdc = hdcDstCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        himl = 0L,
        i = 0,
        hdcDstCtorArg = MutPtr(0L),
        x = 0,
        y = 0,
        cx = 0,
        cy = 0,
        xBitmap = 0,
        yBitmap = 0,
        rgbBk = 0u,
        rgbFg = 0u,
        fStyle = 0u,
        dwRop = 0u,
        fState = 0u,
        frame = 0u,
        crEffect = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            himl: Himagelist = 0L,
            i: Int = 0,
            hdcDst: Hdc = MutPtr(0L),
            x: Int = 0,
            y: Int = 0,
            cx: Int = 0,
            cy: Int = 0,
            xBitmap: Int = 0,
            yBitmap: Int = 0,
            rgbBk: Colorref = 0u,
            rgbFg: Colorref = 0u,
            fStyle: UInt = 0u,
            dwRop: UInt = 0u,
            fState: UInt = 0u,
            frame: UInt = 0u,
            crEffect: Colorref = 0u,
        ): Imagelistdrawparams =
            Imagelistdrawparams(
                cbSize = cbSize,
                himl = himl,
                i = i,
                hdcDstCtorArg = hdcDst,
                x = x,
                y = y,
                cx = cx,
                cy = cy,
                xBitmap = xBitmap,
                yBitmap = yBitmap,
                rgbBk = rgbBk,
                rgbFg = rgbFg,
                fStyle = fStyle,
                dwRop = dwRop,
                fState = fState,
                frame = frame,
                crEffect = crEffect,
            )
    }
}

public data class Imageliststats(
    public var cbSize: UInt = 0u,
    public var cAlloc: Int = 0,
    public var cUsed: Int = 0,
    public var cStandby: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imageliststats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imageliststats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Imageliststats =
                    Imageliststats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Imageliststats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cAlloc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cStandby)
                }
            }
    }
}

public data class Initcommoncontrolsex(
    public var dwSize: UInt = 0u,
    public var dwICC: InitcommoncontrolsexIcc = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Initcommoncontrolsex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Initcommoncontrolsex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Initcommoncontrolsex =
                    Initcommoncontrolsex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Initcommoncontrolsex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwICC)
                }
            }
    }
}

public data class Intlist(
    public var iValueCount: Int = 0,
    public var iValues: IntArray = IntArray(402),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Intlist) return false
        if (this.iValueCount != other.iValueCount) return false
        if (!this.iValues.contentEquals(other.iValues)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iValueCount.hashCode()
        result = 31 * result + this.iValues.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Intlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Intlist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1612L
                override fun readNative(addr: Long): Intlist =
                    Intlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (402).toInt())
                        ).readNative(addr + 4L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Intlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iValueCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (402).toInt())
                    ).writeNative(addr + 4L, value.iValues.toList())
                }
            }
    }
}

public data class Lhittestinfo(
    public var pt: Point = Point(),
    public var item: Litem = Litem(),
)

public data class Litem(
    public var mask: ListItemFlags = 0u,
    public var iLink: Int = 0,
    public var state: ListItemStateFlags = 0u,
    public var stateMask: ListItemStateFlags = 0u,
    public var szID: UShortArray = UShortArray(48),
    public var szUrl: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Litem) return false
        if (this.mask != other.mask) return false
        if (this.iLink != other.iLink) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (!this.szID.contentEquals(other.szID)) return false
        if (!this.szUrl.contentEquals(other.szUrl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iLink.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.szID.contentHashCode()
        result = 31 * result + this.szUrl.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Litem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Litem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4280L
                override fun readNative(addr: Long): Litem =
                    Litem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2084).toInt())
                        ).readNative(addr + 112L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Litem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.stateMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                    ).writeNative(addr + 16L, value.szID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2084).toInt())
                    ).writeNative(addr + 112L, value.szUrl.toList())
                }
            }
    }
}

public class Lvbkimagea internal constructor(
    public var ulFlags: ListViewBackgroundImageFlags,
    hbmCtorArg: Hbitmap,
    pszImageCtorArg: Pstr,
    public var cchImageMax: UInt,
    public var xOffsetPercent: Int,
    public var yOffsetPercent: Int,
) {
    public var hbm: Hbitmap = hbmCtorArg
        internal set

    public var pszImage: Pstr = pszImageCtorArg
        internal set

    public constructor() : this(
        ulFlags = 0u,
        hbmCtorArg = MutPtr(0L),
        pszImageCtorArg = MutPtr(0L),
        cchImageMax = 0u,
        xOffsetPercent = 0,
        yOffsetPercent = 0,
    )

    public operator fun component1(): ListViewBackgroundImageFlags = this.ulFlags

    public operator fun component2(): Hbitmap = this.hbm

    public operator fun component3(): Pstr = this.pszImage

    public operator fun component4(): UInt = this.cchImageMax

    public operator fun component5(): Int = this.xOffsetPercent

    public operator fun component6(): Int = this.yOffsetPercent

    public fun copy(ulFlags: ListViewBackgroundImageFlags = this.ulFlags, hbm: Hbitmap = this.hbm, pszImage: Pstr = this.pszImage, cchImageMax: UInt = this.cchImageMax, xOffsetPercent: Int = this.xOffsetPercent, yOffsetPercent: Int = this.yOffsetPercent): Lvbkimagea = Lvbkimagea(ulFlags = ulFlags, hbmCtorArg = hbm, pszImageCtorArg = pszImage, cchImageMax = cchImageMax, xOffsetPercent = xOffsetPercent, yOffsetPercent = yOffsetPercent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvbkimagea) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.hbm != other.hbm) return false
        if (this.pszImage != other.pszImage) return false
        if (this.cchImageMax != other.cchImageMax) return false
        if (this.xOffsetPercent != other.xOffsetPercent) return false
        if (this.yOffsetPercent != other.yOffsetPercent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulFlags.hashCode()
        result = 31 * result + this.hbm.hashCode()
        result = 31 * result + this.pszImage.hashCode()
        result = 31 * result + this.cchImageMax.hashCode()
        result = 31 * result + this.xOffsetPercent.hashCode()
        result = 31 * result + this.yOffsetPercent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulFlags: ListViewBackgroundImageFlags = 0u,
            hbm: Hbitmap = MutPtr(0L),
            pszImage: Pstr = MutPtr(0L),
            cchImageMax: UInt = 0u,
            xOffsetPercent: Int = 0,
            yOffsetPercent: Int = 0,
        ): Lvbkimagea =
            Lvbkimagea(
                ulFlags = ulFlags,
                hbmCtorArg = hbm,
                pszImageCtorArg = pszImage,
                cchImageMax = cchImageMax,
                xOffsetPercent = xOffsetPercent,
                yOffsetPercent = yOffsetPercent,
            )
    }
}

public class Lvbkimagew internal constructor(
    public var ulFlags: ListViewBackgroundImageFlags,
    hbmCtorArg: Hbitmap,
    pszImageCtorArg: Pwstr,
    public var cchImageMax: UInt,
    public var xOffsetPercent: Int,
    public var yOffsetPercent: Int,
) {
    public var hbm: Hbitmap = hbmCtorArg
        internal set

    public var pszImage: Pwstr = pszImageCtorArg
        internal set

    public constructor() : this(
        ulFlags = 0u,
        hbmCtorArg = MutPtr(0L),
        pszImageCtorArg = MutPtr(0L),
        cchImageMax = 0u,
        xOffsetPercent = 0,
        yOffsetPercent = 0,
    )

    public operator fun component1(): ListViewBackgroundImageFlags = this.ulFlags

    public operator fun component2(): Hbitmap = this.hbm

    public operator fun component3(): Pwstr = this.pszImage

    public operator fun component4(): UInt = this.cchImageMax

    public operator fun component5(): Int = this.xOffsetPercent

    public operator fun component6(): Int = this.yOffsetPercent

    public fun copy(ulFlags: ListViewBackgroundImageFlags = this.ulFlags, hbm: Hbitmap = this.hbm, pszImage: Pwstr = this.pszImage, cchImageMax: UInt = this.cchImageMax, xOffsetPercent: Int = this.xOffsetPercent, yOffsetPercent: Int = this.yOffsetPercent): Lvbkimagew = Lvbkimagew(ulFlags = ulFlags, hbmCtorArg = hbm, pszImageCtorArg = pszImage, cchImageMax = cchImageMax, xOffsetPercent = xOffsetPercent, yOffsetPercent = yOffsetPercent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvbkimagew) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.hbm != other.hbm) return false
        if (this.pszImage != other.pszImage) return false
        if (this.cchImageMax != other.cchImageMax) return false
        if (this.xOffsetPercent != other.xOffsetPercent) return false
        if (this.yOffsetPercent != other.yOffsetPercent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulFlags.hashCode()
        result = 31 * result + this.hbm.hashCode()
        result = 31 * result + this.pszImage.hashCode()
        result = 31 * result + this.cchImageMax.hashCode()
        result = 31 * result + this.xOffsetPercent.hashCode()
        result = 31 * result + this.yOffsetPercent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulFlags: ListViewBackgroundImageFlags = 0u,
            hbm: Hbitmap = MutPtr(0L),
            pszImage: Pwstr = MutPtr(0L),
            cchImageMax: UInt = 0u,
            xOffsetPercent: Int = 0,
            yOffsetPercent: Int = 0,
        ): Lvbkimagew =
            Lvbkimagew(
                ulFlags = ulFlags,
                hbmCtorArg = hbm,
                pszImageCtorArg = pszImage,
                cchImageMax = cchImageMax,
                xOffsetPercent = xOffsetPercent,
                yOffsetPercent = yOffsetPercent,
            )
    }
}

public class Lvcolumna internal constructor(
    public var mask: LvcolumnwMask,
    public var fmt: LvcolumnwFormat,
    public var cx: Int,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iSubItem: Int,
    public var iImage: Int,
    public var iOrder: Int,
    public var cxMin: Int,
    public var cxDefault: Int,
    public var cxIdeal: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        fmt = 0,
        cx = 0,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iSubItem = 0,
        iImage = 0,
        iOrder = 0,
        cxMin = 0,
        cxDefault = 0,
        cxIdeal = 0,
    )

    public operator fun component1(): LvcolumnwMask = this.mask

    public operator fun component2(): LvcolumnwFormat = this.fmt

    public operator fun component3(): Int = this.cx

    public operator fun component4(): Pstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iSubItem

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iOrder

    public operator fun component9(): Int = this.cxMin

    public operator fun component10(): Int = this.cxDefault

    public operator fun component11(): Int = this.cxIdeal

    public fun copy(mask: LvcolumnwMask = this.mask, fmt: LvcolumnwFormat = this.fmt, cx: Int = this.cx, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iSubItem: Int = this.iSubItem, iImage: Int = this.iImage, iOrder: Int = this.iOrder, cxMin: Int = this.cxMin, cxDefault: Int = this.cxDefault, cxIdeal: Int = this.cxIdeal): Lvcolumna = Lvcolumna(mask = mask, fmt = fmt, cx = cx, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iSubItem = iSubItem, iImage = iImage, iOrder = iOrder, cxMin = cxMin, cxDefault = cxDefault, cxIdeal = cxIdeal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvcolumna) return false
        if (this.mask != other.mask) return false
        if (this.fmt != other.fmt) return false
        if (this.cx != other.cx) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.iImage != other.iImage) return false
        if (this.iOrder != other.iOrder) return false
        if (this.cxMin != other.cxMin) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cxIdeal != other.cxIdeal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iOrder.hashCode()
        result = 31 * result + this.cxMin.hashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cxIdeal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: LvcolumnwMask = 0u,
            fmt: LvcolumnwFormat = 0,
            cx: Int = 0,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iSubItem: Int = 0,
            iImage: Int = 0,
            iOrder: Int = 0,
            cxMin: Int = 0,
            cxDefault: Int = 0,
            cxIdeal: Int = 0,
        ): Lvcolumna =
            Lvcolumna(
                mask = mask,
                fmt = fmt,
                cx = cx,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iSubItem = iSubItem,
                iImage = iImage,
                iOrder = iOrder,
                cxMin = cxMin,
                cxDefault = cxDefault,
                cxIdeal = cxIdeal,
            )
    }
}

public class Lvcolumnw internal constructor(
    public var mask: LvcolumnwMask,
    public var fmt: LvcolumnwFormat,
    public var cx: Int,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iSubItem: Int,
    public var iImage: Int,
    public var iOrder: Int,
    public var cxMin: Int,
    public var cxDefault: Int,
    public var cxIdeal: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        fmt = 0,
        cx = 0,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iSubItem = 0,
        iImage = 0,
        iOrder = 0,
        cxMin = 0,
        cxDefault = 0,
        cxIdeal = 0,
    )

    public operator fun component1(): LvcolumnwMask = this.mask

    public operator fun component2(): LvcolumnwFormat = this.fmt

    public operator fun component3(): Int = this.cx

    public operator fun component4(): Pwstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iSubItem

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iOrder

    public operator fun component9(): Int = this.cxMin

    public operator fun component10(): Int = this.cxDefault

    public operator fun component11(): Int = this.cxIdeal

    public fun copy(mask: LvcolumnwMask = this.mask, fmt: LvcolumnwFormat = this.fmt, cx: Int = this.cx, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iSubItem: Int = this.iSubItem, iImage: Int = this.iImage, iOrder: Int = this.iOrder, cxMin: Int = this.cxMin, cxDefault: Int = this.cxDefault, cxIdeal: Int = this.cxIdeal): Lvcolumnw = Lvcolumnw(mask = mask, fmt = fmt, cx = cx, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iSubItem = iSubItem, iImage = iImage, iOrder = iOrder, cxMin = cxMin, cxDefault = cxDefault, cxIdeal = cxIdeal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvcolumnw) return false
        if (this.mask != other.mask) return false
        if (this.fmt != other.fmt) return false
        if (this.cx != other.cx) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.iImage != other.iImage) return false
        if (this.iOrder != other.iOrder) return false
        if (this.cxMin != other.cxMin) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cxIdeal != other.cxIdeal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iOrder.hashCode()
        result = 31 * result + this.cxMin.hashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cxIdeal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: LvcolumnwMask = 0u,
            fmt: LvcolumnwFormat = 0,
            cx: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iSubItem: Int = 0,
            iImage: Int = 0,
            iOrder: Int = 0,
            cxMin: Int = 0,
            cxDefault: Int = 0,
            cxIdeal: Int = 0,
        ): Lvcolumnw =
            Lvcolumnw(
                mask = mask,
                fmt = fmt,
                cx = cx,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iSubItem = iSubItem,
                iImage = iImage,
                iOrder = iOrder,
                cxMin = cxMin,
                cxDefault = cxDefault,
                cxIdeal = cxIdeal,
            )
    }
}

public class Lvfindinfoa internal constructor(
    public var flags: LvfindinfowFlags,
    pszCtorArg: Pcstr,
    public var lParam: Lparam,
    public var pt: Point,
    public var vkDirection: UInt,
) {
    public var psz: Pcstr = pszCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pszCtorArg = ConstPtr(0L),
        lParam = 0L,
        pt = Point(),
        vkDirection = 0u,
    )

    public operator fun component1(): LvfindinfowFlags = this.flags

    public operator fun component2(): Pcstr = this.psz

    public operator fun component3(): Lparam = this.lParam

    public operator fun component4(): Point = this.pt

    public operator fun component5(): UInt = this.vkDirection

    public fun copy(flags: LvfindinfowFlags = this.flags, psz: Pcstr = this.psz, lParam: Lparam = this.lParam, pt: Point = this.pt, vkDirection: UInt = this.vkDirection): Lvfindinfoa = Lvfindinfoa(flags = flags, pszCtorArg = psz, lParam = lParam, pt = pt, vkDirection = vkDirection)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvfindinfoa) return false
        if (this.flags != other.flags) return false
        if (this.psz != other.psz) return false
        if (this.lParam != other.lParam) return false
        if (this.pt != other.pt) return false
        if (this.vkDirection != other.vkDirection) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.psz.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.vkDirection.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: LvfindinfowFlags = 0u,
            psz: Pcstr = ConstPtr(0L),
            lParam: Lparam = 0L,
            pt: Point = Point(),
            vkDirection: UInt = 0u,
        ): Lvfindinfoa =
            Lvfindinfoa(
                flags = flags,
                pszCtorArg = psz,
                lParam = lParam,
                pt = pt,
                vkDirection = vkDirection,
            )
    }
}

public class Lvfindinfow internal constructor(
    public var flags: LvfindinfowFlags,
    pszCtorArg: Pcwstr,
    public var lParam: Lparam,
    public var pt: Point,
    public var vkDirection: UInt,
) {
    public var psz: Pcwstr = pszCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pszCtorArg = ConstPtr(0L),
        lParam = 0L,
        pt = Point(),
        vkDirection = 0u,
    )

    public operator fun component1(): LvfindinfowFlags = this.flags

    public operator fun component2(): Pcwstr = this.psz

    public operator fun component3(): Lparam = this.lParam

    public operator fun component4(): Point = this.pt

    public operator fun component5(): UInt = this.vkDirection

    public fun copy(flags: LvfindinfowFlags = this.flags, psz: Pcwstr = this.psz, lParam: Lparam = this.lParam, pt: Point = this.pt, vkDirection: UInt = this.vkDirection): Lvfindinfow = Lvfindinfow(flags = flags, pszCtorArg = psz, lParam = lParam, pt = pt, vkDirection = vkDirection)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvfindinfow) return false
        if (this.flags != other.flags) return false
        if (this.psz != other.psz) return false
        if (this.lParam != other.lParam) return false
        if (this.pt != other.pt) return false
        if (this.vkDirection != other.vkDirection) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.psz.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.vkDirection.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: LvfindinfowFlags = 0u,
            psz: Pcwstr = ConstPtr(0L),
            lParam: Lparam = 0L,
            pt: Point = Point(),
            vkDirection: UInt = 0u,
        ): Lvfindinfow =
            Lvfindinfow(
                flags = flags,
                pszCtorArg = psz,
                lParam = lParam,
                pt = pt,
                vkDirection = vkDirection,
            )
    }
}

public class Lvfooterinfo internal constructor(
    public var mask: UInt,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var cItems: UInt,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        cItems = 0u,
    )

    public operator fun component1(): UInt = this.mask

    public operator fun component2(): Pwstr = this.pszText

    public operator fun component3(): Int = this.cchTextMax

    public operator fun component4(): UInt = this.cItems

    public fun copy(mask: UInt = this.mask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, cItems: UInt = this.cItems): Lvfooterinfo = Lvfooterinfo(mask = mask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, cItems = cItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvfooterinfo) return false
        if (this.mask != other.mask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.cItems != other.cItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.cItems.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: UInt = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            cItems: UInt = 0u,
        ): Lvfooterinfo =
            Lvfooterinfo(
                mask = mask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                cItems = cItems,
            )
    }
}

public class Lvfooteritem internal constructor(
    public var mask: LvfooteritemMask,
    public var iItem: Int,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var state: UInt,
    public var stateMask: UInt,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        iItem = 0,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        state = 0u,
        stateMask = 0u,
    )

    public operator fun component1(): LvfooteritemMask = this.mask

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Pwstr = this.pszText

    public operator fun component4(): Int = this.cchTextMax

    public operator fun component5(): UInt = this.state

    public operator fun component6(): UInt = this.stateMask

    public fun copy(mask: LvfooteritemMask = this.mask, iItem: Int = this.iItem, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, state: UInt = this.state, stateMask: UInt = this.stateMask): Lvfooteritem = Lvfooteritem(mask = mask, iItem = iItem, pszTextCtorArg = pszText, cchTextMax = cchTextMax, state = state, stateMask = stateMask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvfooteritem) return false
        if (this.mask != other.mask) return false
        if (this.iItem != other.iItem) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: LvfooteritemMask = 0u,
            iItem: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            state: UInt = 0u,
            stateMask: UInt = 0u,
        ): Lvfooteritem =
            Lvfooteritem(
                mask = mask,
                iItem = iItem,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                state = state,
                stateMask = stateMask,
            )
    }
}

public class Lvgroup internal constructor(
    public var cbSize: UInt,
    public var mask: LvgroupMask,
    pszHeaderCtorArg: Pwstr,
    public var cchHeader: Int,
    pszFooterCtorArg: Pwstr,
    public var cchFooter: Int,
    public var iGroupId: Int,
    public var stateMask: ListViewGroupStateFlags,
    public var state: ListViewGroupStateFlags,
    public var uAlign: ListViewGroupAlignFlags,
    pszSubtitleCtorArg: Pwstr,
    public var cchSubtitle: UInt,
    pszTaskCtorArg: Pwstr,
    public var cchTask: UInt,
    pszDescriptionTopCtorArg: Pwstr,
    public var cchDescriptionTop: UInt,
    pszDescriptionBottomCtorArg: Pwstr,
    public var cchDescriptionBottom: UInt,
    public var iTitleImage: Int,
    public var iExtendedImage: Int,
    public var iFirstItem: Int,
    public var cItems: UInt,
    pszSubsetTitleCtorArg: Pwstr,
    public var cchSubsetTitle: UInt,
) {
    public var pszHeader: Pwstr = pszHeaderCtorArg
        internal set

    public var pszFooter: Pwstr = pszFooterCtorArg
        internal set

    public var pszSubtitle: Pwstr = pszSubtitleCtorArg
        internal set

    public var pszTask: Pwstr = pszTaskCtorArg
        internal set

    public var pszDescriptionTop: Pwstr = pszDescriptionTopCtorArg
        internal set

    public var pszDescriptionBottom: Pwstr = pszDescriptionBottomCtorArg
        internal set

    public var pszSubsetTitle: Pwstr = pszSubsetTitleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        mask = 0u,
        pszHeaderCtorArg = MutPtr(0L),
        cchHeader = 0,
        pszFooterCtorArg = MutPtr(0L),
        cchFooter = 0,
        iGroupId = 0,
        stateMask = 0u,
        state = 0u,
        uAlign = 0u,
        pszSubtitleCtorArg = MutPtr(0L),
        cchSubtitle = 0u,
        pszTaskCtorArg = MutPtr(0L),
        cchTask = 0u,
        pszDescriptionTopCtorArg = MutPtr(0L),
        cchDescriptionTop = 0u,
        pszDescriptionBottomCtorArg = MutPtr(0L),
        cchDescriptionBottom = 0u,
        iTitleImage = 0,
        iExtendedImage = 0,
        iFirstItem = 0,
        cItems = 0u,
        pszSubsetTitleCtorArg = MutPtr(0L),
        cchSubsetTitle = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            mask: LvgroupMask = 0u,
            pszHeader: Pwstr = MutPtr(0L),
            cchHeader: Int = 0,
            pszFooter: Pwstr = MutPtr(0L),
            cchFooter: Int = 0,
            iGroupId: Int = 0,
            stateMask: ListViewGroupStateFlags = 0u,
            state: ListViewGroupStateFlags = 0u,
            uAlign: ListViewGroupAlignFlags = 0u,
            pszSubtitle: Pwstr = MutPtr(0L),
            cchSubtitle: UInt = 0u,
            pszTask: Pwstr = MutPtr(0L),
            cchTask: UInt = 0u,
            pszDescriptionTop: Pwstr = MutPtr(0L),
            cchDescriptionTop: UInt = 0u,
            pszDescriptionBottom: Pwstr = MutPtr(0L),
            cchDescriptionBottom: UInt = 0u,
            iTitleImage: Int = 0,
            iExtendedImage: Int = 0,
            iFirstItem: Int = 0,
            cItems: UInt = 0u,
            pszSubsetTitle: Pwstr = MutPtr(0L),
            cchSubsetTitle: UInt = 0u,
        ): Lvgroup =
            Lvgroup(
                cbSize = cbSize,
                mask = mask,
                pszHeaderCtorArg = pszHeader,
                cchHeader = cchHeader,
                pszFooterCtorArg = pszFooter,
                cchFooter = cchFooter,
                iGroupId = iGroupId,
                stateMask = stateMask,
                state = state,
                uAlign = uAlign,
                pszSubtitleCtorArg = pszSubtitle,
                cchSubtitle = cchSubtitle,
                pszTaskCtorArg = pszTask,
                cchTask = cchTask,
                pszDescriptionTopCtorArg = pszDescriptionTop,
                cchDescriptionTop = cchDescriptionTop,
                pszDescriptionBottomCtorArg = pszDescriptionBottom,
                cchDescriptionBottom = cchDescriptionBottom,
                iTitleImage = iTitleImage,
                iExtendedImage = iExtendedImage,
                iFirstItem = iFirstItem,
                cItems = cItems,
                pszSubsetTitleCtorArg = pszSubsetTitle,
                cchSubsetTitle = cchSubsetTitle,
            )
    }
}

public data class Lvgroupmetrics(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var left: UInt = 0u,
    public var top: UInt = 0u,
    public var right: UInt = 0u,
    public var bottom: UInt = 0u,
    public var crLeft: Colorref = 0u,
    public var crTop: Colorref = 0u,
    public var crRight: Colorref = 0u,
    public var crBottom: Colorref = 0u,
    public var crHeader: Colorref = 0u,
    public var crFooter: Colorref = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvgroupmetrics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvgroupmetrics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Lvgroupmetrics =
                    Lvgroupmetrics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Lvgroupmetrics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.crLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.crTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.crRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.crBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.crHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.crFooter)
                }
            }
    }
}

public data class Lvhittestinfo(
    public var pt: Point = Point(),
    public var flags: LvhittestinfoFlags = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var iGroup: Int = 0,
)

public class Lvinsertgroupsorted internal constructor(
    public var pfnGroupCompare: Pfnlvgroupcompare,
    pvDataCtorArg: MutPtr,
    public var lvGroup: Lvgroup,
) {
    public var pvData: MutPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        pfnGroupCompare = null,
        pvDataCtorArg = MutPtr(0L),
        lvGroup = Lvgroup(),
    )

    public operator fun component1(): Pfnlvgroupcompare = this.pfnGroupCompare

    public operator fun component2(): MutPtr = this.pvData

    public operator fun component3(): Lvgroup = this.lvGroup

    public fun copy(pfnGroupCompare: Pfnlvgroupcompare = this.pfnGroupCompare, pvData: MutPtr = this.pvData, lvGroup: Lvgroup = this.lvGroup): Lvinsertgroupsorted = Lvinsertgroupsorted(pfnGroupCompare = pfnGroupCompare, pvDataCtorArg = pvData, lvGroup = lvGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvinsertgroupsorted) return false
        if (this.pfnGroupCompare != other.pfnGroupCompare) return false
        if (this.pvData != other.pvData) return false
        if (this.lvGroup != other.lvGroup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnGroupCompare.hashCode()
        result = 31 * result + this.pvData.hashCode()
        result = 31 * result + this.lvGroup.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnGroupCompare: Pfnlvgroupcompare = null,
            pvData: MutPtr = MutPtr(0L),
            lvGroup: Lvgroup = Lvgroup(),
        ): Lvinsertgroupsorted =
            Lvinsertgroupsorted(
                pfnGroupCompare = pfnGroupCompare,
                pvDataCtorArg = pvData,
                lvGroup = lvGroup,
            )
    }
}

public data class Lvinsertmark(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iItem: Int = 0,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvinsertmark> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvinsertmark> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Lvinsertmark =
                    Lvinsertmark(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Lvinsertmark) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iItem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved)
                }
            }
    }
}

public class Lvitema internal constructor(
    public var mask: ListViewItemFlags,
    public var iItem: Int,
    public var iSubItem: Int,
    public var state: ListViewItemStateFlags,
    public var stateMask: ListViewItemStateFlags,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
    public var iIndent: Int,
    public var iGroupId: Int,
    public var cColumns: UInt,
    puColumnsCtorArg: MutPtr,
    piColFmtCtorArg: MutPtr,
    public var iGroup: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public var puColumns: MutPtr = puColumnsCtorArg
        internal set

    public var piColFmt: MutPtr = piColFmtCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        iItem = 0,
        iSubItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
        iIndent = 0,
        iGroupId = 0,
        cColumns = 0u,
        puColumnsCtorArg = MutPtr(0L),
        piColFmtCtorArg = MutPtr(0L),
        iGroup = 0,
    )

    public operator fun component1(): ListViewItemFlags = this.mask

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Int = this.iSubItem

    public operator fun component4(): ListViewItemStateFlags = this.state

    public operator fun component5(): ListViewItemStateFlags = this.stateMask

    public operator fun component6(): Pstr = this.pszText

    public operator fun component7(): Int = this.cchTextMax

    public operator fun component8(): Int = this.iImage

    public operator fun component9(): Lparam = this.lParam

    public operator fun component10(): Int = this.iIndent

    public operator fun component11(): Int = this.iGroupId

    public operator fun component12(): UInt = this.cColumns

    public operator fun component13(): MutPtr = this.puColumns

    public operator fun component14(): MutPtr = this.piColFmt

    public operator fun component15(): Int = this.iGroup

    public fun copy(mask: ListViewItemFlags = this.mask, iItem: Int = this.iItem, iSubItem: Int = this.iSubItem, state: ListViewItemStateFlags = this.state, stateMask: ListViewItemStateFlags = this.stateMask, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam, iIndent: Int = this.iIndent, iGroupId: Int = this.iGroupId, cColumns: UInt = this.cColumns, puColumns: MutPtr = this.puColumns, piColFmt: MutPtr = this.piColFmt, iGroup: Int = this.iGroup): Lvitema = Lvitema(mask = mask, iItem = iItem, iSubItem = iSubItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam, iIndent = iIndent, iGroupId = iGroupId, cColumns = cColumns, puColumnsCtorArg = puColumns, piColFmtCtorArg = piColFmt, iGroup = iGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvitema) return false
        if (this.mask != other.mask) return false
        if (this.iItem != other.iItem) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        if (this.iIndent != other.iIndent) return false
        if (this.iGroupId != other.iGroupId) return false
        if (this.cColumns != other.cColumns) return false
        if (this.puColumns != other.puColumns) return false
        if (this.piColFmt != other.piColFmt) return false
        if (this.iGroup != other.iGroup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iIndent.hashCode()
        result = 31 * result + this.iGroupId.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.puColumns.hashCode()
        result = 31 * result + this.piColFmt.hashCode()
        result = 31 * result + this.iGroup.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: ListViewItemFlags = 0u,
            iItem: Int = 0,
            iSubItem: Int = 0,
            state: ListViewItemStateFlags = 0u,
            stateMask: ListViewItemStateFlags = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
            iIndent: Int = 0,
            iGroupId: Int = 0,
            cColumns: UInt = 0u,
            puColumns: MutPtr = MutPtr(0L),
            piColFmt: MutPtr = MutPtr(0L),
            iGroup: Int = 0,
        ): Lvitema =
            Lvitema(
                mask = mask,
                iItem = iItem,
                iSubItem = iSubItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
                iIndent = iIndent,
                iGroupId = iGroupId,
                cColumns = cColumns,
                puColumnsCtorArg = puColumns,
                piColFmtCtorArg = piColFmt,
                iGroup = iGroup,
            )
    }
}

public data class Lvitemindex(
    public var iItem: Int = 0,
    public var iGroup: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvitemindex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvitemindex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Lvitemindex =
                    Lvitemindex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lvitemindex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iItem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iGroup)
                }
            }
    }
}

public class Lvitemw internal constructor(
    public var mask: ListViewItemFlags,
    public var iItem: Int,
    public var iSubItem: Int,
    public var state: ListViewItemStateFlags,
    public var stateMask: ListViewItemStateFlags,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
    public var iIndent: Int,
    public var iGroupId: Int,
    public var cColumns: UInt,
    puColumnsCtorArg: MutPtr,
    piColFmtCtorArg: MutPtr,
    public var iGroup: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public var puColumns: MutPtr = puColumnsCtorArg
        internal set

    public var piColFmt: MutPtr = piColFmtCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        iItem = 0,
        iSubItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
        iIndent = 0,
        iGroupId = 0,
        cColumns = 0u,
        puColumnsCtorArg = MutPtr(0L),
        piColFmtCtorArg = MutPtr(0L),
        iGroup = 0,
    )

    public operator fun component1(): ListViewItemFlags = this.mask

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Int = this.iSubItem

    public operator fun component4(): ListViewItemStateFlags = this.state

    public operator fun component5(): ListViewItemStateFlags = this.stateMask

    public operator fun component6(): Pwstr = this.pszText

    public operator fun component7(): Int = this.cchTextMax

    public operator fun component8(): Int = this.iImage

    public operator fun component9(): Lparam = this.lParam

    public operator fun component10(): Int = this.iIndent

    public operator fun component11(): Int = this.iGroupId

    public operator fun component12(): UInt = this.cColumns

    public operator fun component13(): MutPtr = this.puColumns

    public operator fun component14(): MutPtr = this.piColFmt

    public operator fun component15(): Int = this.iGroup

    public fun copy(mask: ListViewItemFlags = this.mask, iItem: Int = this.iItem, iSubItem: Int = this.iSubItem, state: ListViewItemStateFlags = this.state, stateMask: ListViewItemStateFlags = this.stateMask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam, iIndent: Int = this.iIndent, iGroupId: Int = this.iGroupId, cColumns: UInt = this.cColumns, puColumns: MutPtr = this.puColumns, piColFmt: MutPtr = this.piColFmt, iGroup: Int = this.iGroup): Lvitemw = Lvitemw(mask = mask, iItem = iItem, iSubItem = iSubItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam, iIndent = iIndent, iGroupId = iGroupId, cColumns = cColumns, puColumnsCtorArg = puColumns, piColFmtCtorArg = piColFmt, iGroup = iGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvitemw) return false
        if (this.mask != other.mask) return false
        if (this.iItem != other.iItem) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        if (this.iIndent != other.iIndent) return false
        if (this.iGroupId != other.iGroupId) return false
        if (this.cColumns != other.cColumns) return false
        if (this.puColumns != other.puColumns) return false
        if (this.piColFmt != other.piColFmt) return false
        if (this.iGroup != other.iGroup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iIndent.hashCode()
        result = 31 * result + this.iGroupId.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.puColumns.hashCode()
        result = 31 * result + this.piColFmt.hashCode()
        result = 31 * result + this.iGroup.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: ListViewItemFlags = 0u,
            iItem: Int = 0,
            iSubItem: Int = 0,
            state: ListViewItemStateFlags = 0u,
            stateMask: ListViewItemStateFlags = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
            iIndent: Int = 0,
            iGroupId: Int = 0,
            cColumns: UInt = 0u,
            puColumns: MutPtr = MutPtr(0L),
            piColFmt: MutPtr = MutPtr(0L),
            iGroup: Int = 0,
        ): Lvitemw =
            Lvitemw(
                mask = mask,
                iItem = iItem,
                iSubItem = iSubItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
                iIndent = iIndent,
                iGroupId = iGroupId,
                cColumns = cColumns,
                puColumnsCtorArg = puColumns,
                piColFmtCtorArg = piColFmt,
                iGroup = iGroup,
            )
    }
}

public class Lvsetinfotip internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    pszTextCtorArg: Pwstr,
    public var iItem: Int,
    public var iSubItem: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        pszTextCtorArg = MutPtr(0L),
        iItem = 0,
        iSubItem = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.pszText

    public operator fun component4(): Int = this.iItem

    public operator fun component5(): Int = this.iSubItem

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, pszText: Pwstr = this.pszText, iItem: Int = this.iItem, iSubItem: Int = this.iSubItem): Lvsetinfotip = Lvsetinfotip(cbSize = cbSize, dwFlags = dwFlags, pszTextCtorArg = pszText, iItem = iItem, iSubItem = iSubItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvsetinfotip) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszText != other.pszText) return false
        if (this.iItem != other.iItem) return false
        if (this.iSubItem != other.iSubItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pszText: Pwstr = MutPtr(0L),
            iItem: Int = 0,
            iSubItem: Int = 0,
        ): Lvsetinfotip =
            Lvsetinfotip(
                cbSize = cbSize,
                dwFlags = dwFlags,
                pszTextCtorArg = pszText,
                iItem = iItem,
                iSubItem = iSubItem,
            )
    }
}

public class Lvtileinfo internal constructor(
    public var cbSize: UInt,
    public var iItem: Int,
    public var cColumns: UInt,
    puColumnsCtorArg: MutPtr,
    piColFmtCtorArg: MutPtr,
) {
    public var puColumns: MutPtr = puColumnsCtorArg
        internal set

    public var piColFmt: MutPtr = piColFmtCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        iItem = 0,
        cColumns = 0u,
        puColumnsCtorArg = MutPtr(0L),
        piColFmtCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): UInt = this.cColumns

    public operator fun component4(): MutPtr = this.puColumns

    public operator fun component5(): MutPtr = this.piColFmt

    public fun copy(cbSize: UInt = this.cbSize, iItem: Int = this.iItem, cColumns: UInt = this.cColumns, puColumns: MutPtr = this.puColumns, piColFmt: MutPtr = this.piColFmt): Lvtileinfo = Lvtileinfo(cbSize = cbSize, iItem = iItem, cColumns = cColumns, puColumnsCtorArg = puColumns, piColFmtCtorArg = piColFmt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lvtileinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.iItem != other.iItem) return false
        if (this.cColumns != other.cColumns) return false
        if (this.puColumns != other.puColumns) return false
        if (this.piColFmt != other.piColFmt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.puColumns.hashCode()
        result = 31 * result + this.piColFmt.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvtileinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lvtileinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Lvtileinfo =
                    Lvtileinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Lvtileinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iItem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cColumns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.puColumns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.piColFmt)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            iItem: Int = 0,
            cColumns: UInt = 0u,
            puColumns: MutPtr = MutPtr(0L),
            piColFmt: MutPtr = MutPtr(0L),
        ): Lvtileinfo =
            Lvtileinfo(
                cbSize = cbSize,
                iItem = iItem,
                cColumns = cColumns,
                puColumnsCtorArg = puColumns,
                piColFmtCtorArg = piColFmt,
            )
    }
}

public data class Lvtileviewinfo(
    public var cbSize: UInt = 0u,
    public var dwMask: LvtileviewinfoMask = 0u,
    public var dwFlags: LvtileviewinfoFlags = 0u,
    public var sizeTile: Size = Size(),
    public var cLines: Int = 0,
    public var rcLabelMargin: Rect = Rect(),
)

public data class Margins(
    public var cxLeftWidth: Int = 0,
    public var cxRightWidth: Int = 0,
    public var cyTopHeight: Int = 0,
    public var cyBottomHeight: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Margins> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Margins> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Margins =
                    Margins(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Margins) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cxLeftWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cxRightWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cyTopHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cyBottomHeight)
                }
            }
    }
}

public class Mcgridinfo internal constructor(
    public var cbSize: UInt,
    public var dwPart: McgridinfoPart,
    public var dwFlags: McgridinfoFlags,
    public var iCalendar: Int,
    public var iRow: Int,
    public var iCol: Int,
    public var bSelected: Bool,
    public var stStart: Systemtime,
    public var stEnd: Systemtime,
    public var rc: Rect,
    pszNameCtorArg: Pwstr,
    public var cchName: Int,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwPart = 0u,
        dwFlags = 0u,
        iCalendar = 0,
        iRow = 0,
        iCol = 0,
        bSelected = 0,
        stStart = Systemtime(),
        stEnd = Systemtime(),
        rc = Rect(),
        pszNameCtorArg = MutPtr(0L),
        cchName = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): McgridinfoPart = this.dwPart

    public operator fun component3(): McgridinfoFlags = this.dwFlags

    public operator fun component4(): Int = this.iCalendar

    public operator fun component5(): Int = this.iRow

    public operator fun component6(): Int = this.iCol

    public operator fun component7(): Bool = this.bSelected

    public operator fun component8(): Systemtime = this.stStart

    public operator fun component9(): Systemtime = this.stEnd

    public operator fun component10(): Rect = this.rc

    public operator fun component11(): Pwstr = this.pszName

    public operator fun component12(): Int = this.cchName

    public fun copy(cbSize: UInt = this.cbSize, dwPart: McgridinfoPart = this.dwPart, dwFlags: McgridinfoFlags = this.dwFlags, iCalendar: Int = this.iCalendar, iRow: Int = this.iRow, iCol: Int = this.iCol, bSelected: Bool = this.bSelected, stStart: Systemtime = this.stStart, stEnd: Systemtime = this.stEnd, rc: Rect = this.rc, pszName: Pwstr = this.pszName, cchName: Int = this.cchName): Mcgridinfo = Mcgridinfo(cbSize = cbSize, dwPart = dwPart, dwFlags = dwFlags, iCalendar = iCalendar, iRow = iRow, iCol = iCol, bSelected = bSelected, stStart = stStart, stEnd = stEnd, rc = rc, pszNameCtorArg = pszName, cchName = cchName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mcgridinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwPart != other.dwPart) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.iCalendar != other.iCalendar) return false
        if (this.iRow != other.iRow) return false
        if (this.iCol != other.iCol) return false
        if (this.bSelected != other.bSelected) return false
        if (this.stStart != other.stStart) return false
        if (this.stEnd != other.stEnd) return false
        if (this.rc != other.rc) return false
        if (this.pszName != other.pszName) return false
        if (this.cchName != other.cchName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwPart.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.iCalendar.hashCode()
        result = 31 * result + this.iRow.hashCode()
        result = 31 * result + this.iCol.hashCode()
        result = 31 * result + this.bSelected.hashCode()
        result = 31 * result + this.stStart.hashCode()
        result = 31 * result + this.stEnd.hashCode()
        result = 31 * result + this.rc.hashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.cchName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwPart: McgridinfoPart = 0u,
            dwFlags: McgridinfoFlags = 0u,
            iCalendar: Int = 0,
            iRow: Int = 0,
            iCol: Int = 0,
            bSelected: Bool = 0,
            stStart: Systemtime = Systemtime(),
            stEnd: Systemtime = Systemtime(),
            rc: Rect = Rect(),
            pszName: Pwstr = MutPtr(0L),
            cchName: Int = 0,
        ): Mcgridinfo =
            Mcgridinfo(
                cbSize = cbSize,
                dwPart = dwPart,
                dwFlags = dwFlags,
                iCalendar = iCalendar,
                iRow = iRow,
                iCol = iCol,
                bSelected = bSelected,
                stStart = stStart,
                stEnd = stEnd,
                rc = rc,
                pszNameCtorArg = pszName,
                cchName = cchName,
            )
    }
}

public data class Mchittestinfo(
    public var cbSize: UInt = 0u,
    public var pt: Point = Point(),
    public var uHit: MchittestinfoHitFlags = 0u,
    public var st: Systemtime = Systemtime(),
    public var rc: Rect = Rect(),
    public var iOffset: Int = 0,
    public var iRow: Int = 0,
    public var iCol: Int = 0,
)

public data class Measureitemstruct(
    public var ctlType: DrawitemstructCtlType = 0u,
    public var ctlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var itemWidth: UInt = 0u,
    public var itemHeight: UInt = 0u,
    public var itemData: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Measureitemstruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Measureitemstruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Measureitemstruct =
                    Measureitemstruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Measureitemstruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ctlType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ctlID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.itemID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.itemWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.itemHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.itemData)
                }
            }
    }
}

public data class Nmbcdropdown(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcButton: Rect = Rect(),
)

public data class Nmbchotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmtbhotitemFlags = 0u,
)

public data class Nmcbedragbegina(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItemid: Int = 0,
    public var szText: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbedragbegina) return false
        if (this.hdr != other.hdr) return false
        if (this.iItemid != other.iItemid) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItemid.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }
}

public data class Nmcbedragbeginw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItemid: Int = 0,
    public var szText: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbedragbeginw) return false
        if (this.hdr != other.hdr) return false
        if (this.iItemid != other.iItemid) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItemid.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }
}

public data class Nmcbeendedita(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var iNewSelection: Int = 0,
    public var szText: ByteArray = ByteArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbeendedita) return false
        if (this.hdr != other.hdr) return false
        if (this.fChanged != other.fChanged) return false
        if (this.iNewSelection != other.iNewSelection) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.iWhy != other.iWhy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.fChanged.hashCode()
        result = 31 * result + this.iNewSelection.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.iWhy.hashCode()
        return result
    }
}

public data class Nmcbeendeditw(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var iNewSelection: Int = 0,
    public var szText: UShortArray = UShortArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbeendeditw) return false
        if (this.hdr != other.hdr) return false
        if (this.fChanged != other.fChanged) return false
        if (this.iNewSelection != other.iNewSelection) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.iWhy != other.iWhy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.fChanged.hashCode()
        result = 31 * result + this.iNewSelection.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.iWhy.hashCode()
        return result
    }
}

public data class Nmchar(
    public var hdr: Nmhdr = Nmhdr(),
    public var ch: UInt = 0u,
    public var dwItemPrev: UInt = 0u,
    public var dwItemNext: UInt = 0u,
)

public data class Nmcomboboxexa(
    public var hdr: Nmhdr = Nmhdr(),
    public var ceItem: Comboboxexitema = Comboboxexitema(),
)

public data class Nmcomboboxexw(
    public var hdr: Nmhdr = Nmhdr(),
    public var ceItem: Comboboxexitemw = Comboboxexitemw(),
)

public class Nmcustomdraw internal constructor(
    public var hdr: Nmhdr,
    public var dwDrawStage: NmcustomdrawDrawStage,
    hdcCtorArg: Hdc,
    public var rc: Rect,
    public var dwItemSpec: Int,
    public var uItemState: NmcustomdrawDrawStateFlags,
    public var lItemlParam: Lparam,
) {
    public var hdc: Hdc = hdcCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        dwDrawStage = 0u,
        hdcCtorArg = MutPtr(0L),
        rc = Rect(),
        dwItemSpec = 0,
        uItemState = 0u,
        lItemlParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): NmcustomdrawDrawStage = this.dwDrawStage

    public operator fun component3(): Hdc = this.hdc

    public operator fun component4(): Rect = this.rc

    public operator fun component5(): Int = this.dwItemSpec

    public operator fun component6(): NmcustomdrawDrawStateFlags = this.uItemState

    public operator fun component7(): Lparam = this.lItemlParam

    public fun copy(hdr: Nmhdr = this.hdr, dwDrawStage: NmcustomdrawDrawStage = this.dwDrawStage, hdc: Hdc = this.hdc, rc: Rect = this.rc, dwItemSpec: Int = this.dwItemSpec, uItemState: NmcustomdrawDrawStateFlags = this.uItemState, lItemlParam: Lparam = this.lItemlParam): Nmcustomdraw = Nmcustomdraw(hdr = hdr, dwDrawStage = dwDrawStage, hdcCtorArg = hdc, rc = rc, dwItemSpec = dwItemSpec, uItemState = uItemState, lItemlParam = lItemlParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcustomdraw) return false
        if (this.hdr != other.hdr) return false
        if (this.dwDrawStage != other.dwDrawStage) return false
        if (this.hdc != other.hdc) return false
        if (this.rc != other.rc) return false
        if (this.dwItemSpec != other.dwItemSpec) return false
        if (this.uItemState != other.uItemState) return false
        if (this.lItemlParam != other.lItemlParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwDrawStage.hashCode()
        result = 31 * result + this.hdc.hashCode()
        result = 31 * result + this.rc.hashCode()
        result = 31 * result + this.dwItemSpec.hashCode()
        result = 31 * result + this.uItemState.hashCode()
        result = 31 * result + this.lItemlParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            dwDrawStage: NmcustomdrawDrawStage = 0u,
            hdc: Hdc = MutPtr(0L),
            rc: Rect = Rect(),
            dwItemSpec: Int = 0,
            uItemState: NmcustomdrawDrawStateFlags = 0u,
            lItemlParam: Lparam = 0L,
        ): Nmcustomdraw =
            Nmcustomdraw(
                hdr = hdr,
                dwDrawStage = dwDrawStage,
                hdcCtorArg = hdc,
                rc = rc,
                dwItemSpec = dwItemSpec,
                uItemState = uItemState,
                lItemlParam = lItemlParam,
            )
    }
}

public data class Nmcustomsplitrectinfo(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcClient: Rect = Rect(),
    public var rcButton: Rect = Rect(),
    public var rcSplit: Rect = Rect(),
)

public class Nmcustomtext internal constructor(
    public var hdr: Nmhdr,
    hDCCtorArg: Hdc,
    lpStringCtorArg: Pcwstr,
    public var nCount: Int,
    lpRectCtorArg: MutPtr,
    public var uFormat: UInt,
    public var fLink: Bool,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public var lpString: Pcwstr = lpStringCtorArg
        internal set

    public var lpRect: MutPtr = lpRectCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        hDCCtorArg = MutPtr(0L),
        lpStringCtorArg = ConstPtr(0L),
        nCount = 0,
        lpRectCtorArg = MutPtr(0L),
        uFormat = 0u,
        fLink = 0,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Hdc = this.hDC

    public operator fun component3(): Pcwstr = this.lpString

    public operator fun component4(): Int = this.nCount

    public operator fun component5(): MutPtr = this.lpRect

    public operator fun component6(): UInt = this.uFormat

    public operator fun component7(): Bool = this.fLink

    public fun copy(hdr: Nmhdr = this.hdr, hDC: Hdc = this.hDC, lpString: Pcwstr = this.lpString, nCount: Int = this.nCount, lpRect: MutPtr = this.lpRect, uFormat: UInt = this.uFormat, fLink: Bool = this.fLink): Nmcustomtext = Nmcustomtext(hdr = hdr, hDCCtorArg = hDC, lpStringCtorArg = lpString, nCount = nCount, lpRectCtorArg = lpRect, uFormat = uFormat, fLink = fLink)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcustomtext) return false
        if (this.hdr != other.hdr) return false
        if (this.hDC != other.hDC) return false
        if (this.lpString != other.lpString) return false
        if (this.nCount != other.nCount) return false
        if (this.lpRect != other.lpRect) return false
        if (this.uFormat != other.uFormat) return false
        if (this.fLink != other.fLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.lpString.hashCode()
        result = 31 * result + this.nCount.hashCode()
        result = 31 * result + this.lpRect.hashCode()
        result = 31 * result + this.uFormat.hashCode()
        result = 31 * result + this.fLink.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            hDC: Hdc = MutPtr(0L),
            lpString: Pcwstr = ConstPtr(0L),
            nCount: Int = 0,
            lpRect: MutPtr = MutPtr(0L),
            uFormat: UInt = 0u,
            fLink: Bool = 0,
        ): Nmcustomtext =
            Nmcustomtext(
                hdr = hdr,
                hDCCtorArg = hDC,
                lpStringCtorArg = lpString,
                nCount = nCount,
                lpRectCtorArg = lpRect,
                uFormat = uFormat,
                fLink = fLink,
            )
    }
}

public data class Nmdatetimechange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmdatetimechangeFlags = 0u,
    public var st: Systemtime = Systemtime(),
)

public class Nmdatetimeformata internal constructor(
    public var nmhdr: Nmhdr,
    pszFormatCtorArg: Pcstr,
    public var st: Systemtime,
    pszDisplayCtorArg: Pcstr,
    public var szDisplay: ByteArray,
) {
    public var pszFormat: Pcstr = pszFormatCtorArg
        internal set

    public var pszDisplay: Pcstr = pszDisplayCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszFormatCtorArg = ConstPtr(0L),
        st = Systemtime(),
        pszDisplayCtorArg = ConstPtr(0L),
        szDisplay = ByteArray(64),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcstr = this.pszFormat

    public operator fun component3(): Systemtime = this.st

    public operator fun component4(): Pcstr = this.pszDisplay

    public operator fun component5(): ByteArray = this.szDisplay

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszFormat: Pcstr = this.pszFormat, st: Systemtime = this.st, pszDisplay: Pcstr = this.pszDisplay, szDisplay: ByteArray = this.szDisplay): Nmdatetimeformata = Nmdatetimeformata(nmhdr = nmhdr, pszFormatCtorArg = pszFormat, st = st, pszDisplayCtorArg = pszDisplay, szDisplay = szDisplay)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformata) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        if (this.pszDisplay != other.pszDisplay) return false
        if (!this.szDisplay.contentEquals(other.szDisplay)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.pszDisplay.hashCode()
        result = 31 * result + this.szDisplay.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszFormat: Pcstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
            pszDisplay: Pcstr = ConstPtr(0L),
            szDisplay: ByteArray = ByteArray(64),
        ): Nmdatetimeformata =
            Nmdatetimeformata(
                nmhdr = nmhdr,
                pszFormatCtorArg = pszFormat,
                st = st,
                pszDisplayCtorArg = pszDisplay,
                szDisplay = szDisplay,
            )
    }
}

public class Nmdatetimeformatquerya internal constructor(
    public var nmhdr: Nmhdr,
    pszFormatCtorArg: Pcstr,
    public var szMax: Size,
) {
    public var pszFormat: Pcstr = pszFormatCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszFormatCtorArg = ConstPtr(0L),
        szMax = Size(),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcstr = this.pszFormat

    public operator fun component3(): Size = this.szMax

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszFormat: Pcstr = this.pszFormat, szMax: Size = this.szMax): Nmdatetimeformatquerya = Nmdatetimeformatquerya(nmhdr = nmhdr, pszFormatCtorArg = pszFormat, szMax = szMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformatquerya) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.szMax != other.szMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.szMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszFormat: Pcstr = ConstPtr(0L),
            szMax: Size = Size(),
        ): Nmdatetimeformatquerya =
            Nmdatetimeformatquerya(
                nmhdr = nmhdr,
                pszFormatCtorArg = pszFormat,
                szMax = szMax,
            )
    }
}

public class Nmdatetimeformatqueryw internal constructor(
    public var nmhdr: Nmhdr,
    pszFormatCtorArg: Pcwstr,
    public var szMax: Size,
) {
    public var pszFormat: Pcwstr = pszFormatCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszFormatCtorArg = ConstPtr(0L),
        szMax = Size(),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcwstr = this.pszFormat

    public operator fun component3(): Size = this.szMax

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszFormat: Pcwstr = this.pszFormat, szMax: Size = this.szMax): Nmdatetimeformatqueryw = Nmdatetimeformatqueryw(nmhdr = nmhdr, pszFormatCtorArg = pszFormat, szMax = szMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformatqueryw) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.szMax != other.szMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.szMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszFormat: Pcwstr = ConstPtr(0L),
            szMax: Size = Size(),
        ): Nmdatetimeformatqueryw =
            Nmdatetimeformatqueryw(
                nmhdr = nmhdr,
                pszFormatCtorArg = pszFormat,
                szMax = szMax,
            )
    }
}

public class Nmdatetimeformatw internal constructor(
    public var nmhdr: Nmhdr,
    pszFormatCtorArg: Pcwstr,
    public var st: Systemtime,
    pszDisplayCtorArg: Pcwstr,
    public var szDisplay: UShortArray,
) {
    public var pszFormat: Pcwstr = pszFormatCtorArg
        internal set

    public var pszDisplay: Pcwstr = pszDisplayCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszFormatCtorArg = ConstPtr(0L),
        st = Systemtime(),
        pszDisplayCtorArg = ConstPtr(0L),
        szDisplay = UShortArray(64),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcwstr = this.pszFormat

    public operator fun component3(): Systemtime = this.st

    public operator fun component4(): Pcwstr = this.pszDisplay

    public operator fun component5(): UShortArray = this.szDisplay

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszFormat: Pcwstr = this.pszFormat, st: Systemtime = this.st, pszDisplay: Pcwstr = this.pszDisplay, szDisplay: UShortArray = this.szDisplay): Nmdatetimeformatw = Nmdatetimeformatw(nmhdr = nmhdr, pszFormatCtorArg = pszFormat, st = st, pszDisplayCtorArg = pszDisplay, szDisplay = szDisplay)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformatw) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        if (this.pszDisplay != other.pszDisplay) return false
        if (!this.szDisplay.contentEquals(other.szDisplay)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.pszDisplay.hashCode()
        result = 31 * result + this.szDisplay.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszFormat: Pcwstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
            pszDisplay: Pcwstr = ConstPtr(0L),
            szDisplay: UShortArray = UShortArray(64),
        ): Nmdatetimeformatw =
            Nmdatetimeformatw(
                nmhdr = nmhdr,
                pszFormatCtorArg = pszFormat,
                st = st,
                pszDisplayCtorArg = pszDisplay,
                szDisplay = szDisplay,
            )
    }
}

public class Nmdatetimestringa internal constructor(
    public var nmhdr: Nmhdr,
    pszUserStringCtorArg: Pcstr,
    public var st: Systemtime,
    public var dwFlags: UInt,
) {
    public var pszUserString: Pcstr = pszUserStringCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszUserStringCtorArg = ConstPtr(0L),
        st = Systemtime(),
        dwFlags = 0u,
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcstr = this.pszUserString

    public operator fun component3(): Systemtime = this.st

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszUserString: Pcstr = this.pszUserString, st: Systemtime = this.st, dwFlags: UInt = this.dwFlags): Nmdatetimestringa = Nmdatetimestringa(nmhdr = nmhdr, pszUserStringCtorArg = pszUserString, st = st, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimestringa) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszUserString != other.pszUserString) return false
        if (this.st != other.st) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszUserString.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszUserString: Pcstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
            dwFlags: UInt = 0u,
        ): Nmdatetimestringa =
            Nmdatetimestringa(
                nmhdr = nmhdr,
                pszUserStringCtorArg = pszUserString,
                st = st,
                dwFlags = dwFlags,
            )
    }
}

public class Nmdatetimestringw internal constructor(
    public var nmhdr: Nmhdr,
    pszUserStringCtorArg: Pcwstr,
    public var st: Systemtime,
    public var dwFlags: UInt,
) {
    public var pszUserString: Pcwstr = pszUserStringCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        pszUserStringCtorArg = ConstPtr(0L),
        st = Systemtime(),
        dwFlags = 0u,
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Pcwstr = this.pszUserString

    public operator fun component3(): Systemtime = this.st

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(nmhdr: Nmhdr = this.nmhdr, pszUserString: Pcwstr = this.pszUserString, st: Systemtime = this.st, dwFlags: UInt = this.dwFlags): Nmdatetimestringw = Nmdatetimestringw(nmhdr = nmhdr, pszUserStringCtorArg = pszUserString, st = st, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimestringw) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszUserString != other.pszUserString) return false
        if (this.st != other.st) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszUserString.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            pszUserString: Pcwstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
            dwFlags: UInt = 0u,
        ): Nmdatetimestringw =
            Nmdatetimestringw(
                nmhdr = nmhdr,
                pszUserStringCtorArg = pszUserString,
                st = st,
                dwFlags = dwFlags,
            )
    }
}

public class Nmdatetimewmkeydowna internal constructor(
    public var nmhdr: Nmhdr,
    public var nVirtKey: Int,
    pszFormatCtorArg: Pcstr,
    public var st: Systemtime,
) {
    public var pszFormat: Pcstr = pszFormatCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        nVirtKey = 0,
        pszFormatCtorArg = ConstPtr(0L),
        st = Systemtime(),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Int = this.nVirtKey

    public operator fun component3(): Pcstr = this.pszFormat

    public operator fun component4(): Systemtime = this.st

    public fun copy(nmhdr: Nmhdr = this.nmhdr, nVirtKey: Int = this.nVirtKey, pszFormat: Pcstr = this.pszFormat, st: Systemtime = this.st): Nmdatetimewmkeydowna = Nmdatetimewmkeydowna(nmhdr = nmhdr, nVirtKey = nVirtKey, pszFormatCtorArg = pszFormat, st = st)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimewmkeydowna) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.nVirtKey != other.nVirtKey) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.nVirtKey.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            nVirtKey: Int = 0,
            pszFormat: Pcstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
        ): Nmdatetimewmkeydowna =
            Nmdatetimewmkeydowna(
                nmhdr = nmhdr,
                nVirtKey = nVirtKey,
                pszFormatCtorArg = pszFormat,
                st = st,
            )
    }
}

public class Nmdatetimewmkeydownw internal constructor(
    public var nmhdr: Nmhdr,
    public var nVirtKey: Int,
    pszFormatCtorArg: Pcwstr,
    public var st: Systemtime,
) {
    public var pszFormat: Pcwstr = pszFormatCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        nVirtKey = 0,
        pszFormatCtorArg = ConstPtr(0L),
        st = Systemtime(),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Int = this.nVirtKey

    public operator fun component3(): Pcwstr = this.pszFormat

    public operator fun component4(): Systemtime = this.st

    public fun copy(nmhdr: Nmhdr = this.nmhdr, nVirtKey: Int = this.nVirtKey, pszFormat: Pcwstr = this.pszFormat, st: Systemtime = this.st): Nmdatetimewmkeydownw = Nmdatetimewmkeydownw(nmhdr = nmhdr, nVirtKey = nVirtKey, pszFormatCtorArg = pszFormat, st = st)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimewmkeydownw) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.nVirtKey != other.nVirtKey) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.nVirtKey.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            nVirtKey: Int = 0,
            pszFormat: Pcwstr = ConstPtr(0L),
            st: Systemtime = Systemtime(),
        ): Nmdatetimewmkeydownw =
            Nmdatetimewmkeydownw(
                nmhdr = nmhdr,
                nVirtKey = nVirtKey,
                pszFormatCtorArg = pszFormat,
                st = st,
            )
    }
}

public class Nmdaystate internal constructor(
    public var nmhdr: Nmhdr,
    public var stStart: Systemtime,
    public var cDayState: Int,
    prgDayStateCtorArg: MutPtr,
) {
    public var prgDayState: MutPtr = prgDayStateCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        stStart = Systemtime(),
        cDayState = 0,
        prgDayStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): Systemtime = this.stStart

    public operator fun component3(): Int = this.cDayState

    public operator fun component4(): MutPtr = this.prgDayState

    public fun copy(nmhdr: Nmhdr = this.nmhdr, stStart: Systemtime = this.stStart, cDayState: Int = this.cDayState, prgDayState: MutPtr = this.prgDayState): Nmdaystate = Nmdaystate(nmhdr = nmhdr, stStart = stStart, cDayState = cDayState, prgDayStateCtorArg = prgDayState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdaystate) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.stStart != other.stStart) return false
        if (this.cDayState != other.cDayState) return false
        if (this.prgDayState != other.prgDayState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.stStart.hashCode()
        result = 31 * result + this.cDayState.hashCode()
        result = 31 * result + this.prgDayState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            stStart: Systemtime = Systemtime(),
            cDayState: Int = 0,
            prgDayState: MutPtr = MutPtr(0L),
        ): Nmdaystate =
            Nmdaystate(
                nmhdr = nmhdr,
                stStart = stStart,
                cDayState = cDayState,
                prgDayStateCtorArg = prgDayState,
            )
    }
}

public class Nmhddispinfoa internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var mask: HdiMask,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        mask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): HdiMask = this.mask

    public operator fun component4(): Pstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public operator fun component7(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, mask: HdiMask = this.mask, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam): Nmhddispinfoa = Nmhddispinfoa(hdr = hdr, iItem = iItem, mask = mask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmhddispinfoa) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.mask != other.mask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            mask: HdiMask = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
        ): Nmhddispinfoa =
            Nmhddispinfoa(
                hdr = hdr,
                iItem = iItem,
                mask = mask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
            )
    }
}

public class Nmhddispinfow internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var mask: HdiMask,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        mask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): HdiMask = this.mask

    public operator fun component4(): Pwstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public operator fun component7(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, mask: HdiMask = this.mask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam): Nmhddispinfow = Nmhddispinfow(hdr = hdr, iItem = iItem, mask = mask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmhddispinfow) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.mask != other.mask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            mask: HdiMask = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
        ): Nmhddispinfow =
            Nmhddispinfow(
                hdr = hdr,
                iItem = iItem,
                mask = mask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
            )
    }
}

public data class Nmhdfilterbtnclick(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var rc: Rect = Rect(),
)

public class Nmhdr internal constructor(
    hwndFromCtorArg: Hwnd,
    public var idFrom: Int,
    public var code: UInt,
) {
    public var hwndFrom: Hwnd = hwndFromCtorArg
        internal set

    public constructor() : this(
        hwndFromCtorArg = MutPtr(0L),
        idFrom = 0,
        code = 0u,
    )

    public operator fun component1(): Hwnd = this.hwndFrom

    public operator fun component2(): Int = this.idFrom

    public operator fun component3(): UInt = this.code

    public fun copy(hwndFrom: Hwnd = this.hwndFrom, idFrom: Int = this.idFrom, code: UInt = this.code): Nmhdr = Nmhdr(hwndFromCtorArg = hwndFrom, idFrom = idFrom, code = code)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmhdr) return false
        if (this.hwndFrom != other.hwndFrom) return false
        if (this.idFrom != other.idFrom) return false
        if (this.code != other.code) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndFrom.hashCode()
        result = 31 * result + this.idFrom.hashCode()
        result = 31 * result + this.code.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndFrom: Hwnd = MutPtr(0L),
            idFrom: Int = 0,
            code: UInt = 0u,
        ): Nmhdr =
            Nmhdr(
                hwndFromCtorArg = hwndFrom,
                idFrom = idFrom,
                code = code,
            )
    }
}

public class Nmheadera internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var iButton: HeaderControlNotificationButton,
    pitemCtorArg: MutPtr,
) {
    public var pitem: MutPtr = pitemCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        iButton = 0,
        pitemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): HeaderControlNotificationButton = this.iButton

    public operator fun component4(): MutPtr = this.pitem

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, iButton: HeaderControlNotificationButton = this.iButton, pitem: MutPtr = this.pitem): Nmheadera = Nmheadera(hdr = hdr, iItem = iItem, iButton = iButton, pitemCtorArg = pitem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmheadera) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.iButton != other.iButton) return false
        if (this.pitem != other.pitem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iButton.hashCode()
        result = 31 * result + this.pitem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            iButton: HeaderControlNotificationButton = 0,
            pitem: MutPtr = MutPtr(0L),
        ): Nmheadera =
            Nmheadera(
                hdr = hdr,
                iItem = iItem,
                iButton = iButton,
                pitemCtorArg = pitem,
            )
    }
}

public class Nmheaderw internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var iButton: HeaderControlNotificationButton,
    pitemCtorArg: MutPtr,
) {
    public var pitem: MutPtr = pitemCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        iButton = 0,
        pitemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): HeaderControlNotificationButton = this.iButton

    public operator fun component4(): MutPtr = this.pitem

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, iButton: HeaderControlNotificationButton = this.iButton, pitem: MutPtr = this.pitem): Nmheaderw = Nmheaderw(hdr = hdr, iItem = iItem, iButton = iButton, pitemCtorArg = pitem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmheaderw) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.iButton != other.iButton) return false
        if (this.pitem != other.pitem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iButton.hashCode()
        result = 31 * result + this.pitem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            iButton: HeaderControlNotificationButton = 0,
            pitem: MutPtr = MutPtr(0L),
        ): Nmheaderw =
            Nmheaderw(
                hdr = hdr,
                iItem = iItem,
                iButton = iButton,
                pitemCtorArg = pitem,
            )
    }
}

public data class Nmipaddress(
    public var hdr: Nmhdr = Nmhdr(),
    public var iField: Int = 0,
    public var iValue: Int = 0,
)

public data class Nmitemactivate(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: UInt = 0u,
    public var ptAction: Point = Point(),
    public var lParam: Lparam = 0L,
    public var uKeyFlags: UInt = 0u,
)

public data class Nmkey(
    public var hdr: Nmhdr = Nmhdr(),
    public var nVKey: UInt = 0u,
    public var uFlags: UInt = 0u,
)

public data class Nmlink(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Litem = Litem(),
)

public data class Nmlistview(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: ListViewItemFlags = 0u,
    public var ptAction: Point = Point(),
    public var lParam: Lparam = 0L,
)

public data class Nmlvcachehint(
    public var hdr: Nmhdr = Nmhdr(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
)

public data class Nmlvcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var clrText: Colorref = 0u,
    public var clrTextBk: Colorref = 0u,
    public var iSubItem: Int = 0,
    public var dwItemType: NmlvcustomdrawItemType = 0u,
    public var clrFace: Colorref = 0u,
    public var iIconEffect: Int = 0,
    public var iIconPhase: Int = 0,
    public var iPartId: Int = 0,
    public var iStateId: Int = 0,
    public var rcText: Rect = Rect(),
    public var uAlign: ListViewGroupAlignFlags = 0u,
)

public data class Nmlvdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Lvitema = Lvitema(),
)

public data class Nmlvdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Lvitemw = Lvitemw(),
)

public data class Nmlvemptymarkup(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmlvemptymarkupFlags = 0u,
    public var szMarkup: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmlvemptymarkup) return false
        if (this.hdr != other.hdr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szMarkup.contentEquals(other.szMarkup)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szMarkup.contentHashCode()
        return result
    }
}

public data class Nmlvfinditema(
    public var hdr: Nmhdr = Nmhdr(),
    public var iStart: Int = 0,
    public var lvfi: Lvfindinfoa = Lvfindinfoa(),
)

public data class Nmlvfinditemw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iStart: Int = 0,
    public var lvfi: Lvfindinfow = Lvfindinfow(),
)

public class Nmlvgetinfotipa internal constructor(
    public var hdr: Nmhdr,
    public var dwFlags: NmlvgetinfotipFlags,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iItem: Int,
    public var iSubItem: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        dwFlags = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iItem = 0,
        iSubItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): NmlvgetinfotipFlags = this.dwFlags

    public operator fun component3(): Pstr = this.pszText

    public operator fun component4(): Int = this.cchTextMax

    public operator fun component5(): Int = this.iItem

    public operator fun component6(): Int = this.iSubItem

    public operator fun component7(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, dwFlags: NmlvgetinfotipFlags = this.dwFlags, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iItem: Int = this.iItem, iSubItem: Int = this.iSubItem, lParam: Lparam = this.lParam): Nmlvgetinfotipa = Nmlvgetinfotipa(hdr = hdr, dwFlags = dwFlags, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iItem = iItem, iSubItem = iSubItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmlvgetinfotipa) return false
        if (this.hdr != other.hdr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iItem != other.iItem) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            dwFlags: NmlvgetinfotipFlags = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iItem: Int = 0,
            iSubItem: Int = 0,
            lParam: Lparam = 0L,
        ): Nmlvgetinfotipa =
            Nmlvgetinfotipa(
                hdr = hdr,
                dwFlags = dwFlags,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iItem = iItem,
                iSubItem = iSubItem,
                lParam = lParam,
            )
    }
}

public class Nmlvgetinfotipw internal constructor(
    public var hdr: Nmhdr,
    public var dwFlags: NmlvgetinfotipFlags,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iItem: Int,
    public var iSubItem: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        dwFlags = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iItem = 0,
        iSubItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): NmlvgetinfotipFlags = this.dwFlags

    public operator fun component3(): Pwstr = this.pszText

    public operator fun component4(): Int = this.cchTextMax

    public operator fun component5(): Int = this.iItem

    public operator fun component6(): Int = this.iSubItem

    public operator fun component7(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, dwFlags: NmlvgetinfotipFlags = this.dwFlags, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iItem: Int = this.iItem, iSubItem: Int = this.iSubItem, lParam: Lparam = this.lParam): Nmlvgetinfotipw = Nmlvgetinfotipw(hdr = hdr, dwFlags = dwFlags, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iItem = iItem, iSubItem = iSubItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmlvgetinfotipw) return false
        if (this.hdr != other.hdr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iItem != other.iItem) return false
        if (this.iSubItem != other.iSubItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.iSubItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            dwFlags: NmlvgetinfotipFlags = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iItem: Int = 0,
            iSubItem: Int = 0,
            lParam: Lparam = 0L,
        ): Nmlvgetinfotipw =
            Nmlvgetinfotipw(
                hdr = hdr,
                dwFlags = dwFlags,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iItem = iItem,
                iSubItem = iSubItem,
                lParam = lParam,
            )
    }
}

public data class Nmlvkeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class Nmlvlink(
    public var hdr: Nmhdr = Nmhdr(),
    public var link: Litem = Litem(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
)

public data class Nmlvodstatechange(
    public var hdr: Nmhdr = Nmhdr(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
    public var uNewState: ListViewItemStateFlags = 0u,
    public var uOldState: ListViewItemStateFlags = 0u,
)

public data class Nmlvscroll(
    public var hdr: Nmhdr = Nmhdr(),
    public var dx: Int = 0,
    public var dy: Int = 0,
)

public data class Nmmouse(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwItemSpec: Int = 0,
    public var dwItemData: Int = 0,
    public var pt: Point = Point(),
    public var dwHitInfo: Lparam = 0L,
)

public class Nmobjectnotify internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    piidCtorArg: ConstPtr,
    pObjectCtorArg: MutPtr,
    public var hResult: Hresult,
    public var dwFlags: UInt,
) {
    public var piid: ConstPtr = piidCtorArg
        internal set

    public var pObject: MutPtr = pObjectCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        piidCtorArg = ConstPtr(0L),
        pObjectCtorArg = MutPtr(0L),
        hResult = 0,
        dwFlags = 0u,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): ConstPtr = this.piid

    public operator fun component4(): MutPtr = this.pObject

    public operator fun component5(): Hresult = this.hResult

    public operator fun component6(): UInt = this.dwFlags

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, piid: ConstPtr = this.piid, pObject: MutPtr = this.pObject, hResult: Hresult = this.hResult, dwFlags: UInt = this.dwFlags): Nmobjectnotify = Nmobjectnotify(hdr = hdr, iItem = iItem, piidCtorArg = piid, pObjectCtorArg = pObject, hResult = hResult, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmobjectnotify) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.piid != other.piid) return false
        if (this.pObject != other.pObject) return false
        if (this.hResult != other.hResult) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.piid.hashCode()
        result = 31 * result + this.pObject.hashCode()
        result = 31 * result + this.hResult.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            piid: ConstPtr = ConstPtr(0L),
            pObject: MutPtr = MutPtr(0L),
            hResult: Hresult = 0,
            dwFlags: UInt = 0u,
        ): Nmobjectnotify =
            Nmobjectnotify(
                hdr = hdr,
                iItem = iItem,
                piidCtorArg = piid,
                pObjectCtorArg = pObject,
                hResult = hResult,
                dwFlags = dwFlags,
            )
    }
}

public data class Nmpgcalcsize(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlag: NmpgcalcsizeFlags = 0u,
    public var iWidth: Int = 0,
    public var iHeight: Int = 0,
)

public data class Nmpghotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: UInt = 0u,
)

public data class Nmpgscroll(
    public var hdr: Nmhdr = Nmhdr(),
    public var fwKeys: NmpgscrollKeys = 0u,
    public var rcParent: Rect = Rect(),
    public var iDir: NmpgscrollDir = 0,
    public var iXpos: Int = 0,
    public var iYpos: Int = 0,
    public var iScroll: Int = 0,
)

public data class Nmrbautosize(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var rcTarget: Rect = Rect(),
    public var rcActual: Rect = Rect(),
)

public data class Nmrebar(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwMask: NmrebarMaskFlags = 0u,
    public var uBand: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
)

public data class Nmrebarautobreak(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var uMsg: UInt = 0u,
    public var fStyleCurrent: UInt = 0u,
    public var fAutoBreak: Bool = 0,
)

public data class Nmrebarchevron(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var rc: Rect = Rect(),
    public var lParamNM: Lparam = 0L,
)

public data class Nmrebarchildsize(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var rcChild: Rect = Rect(),
    public var rcBand: Rect = Rect(),
)

public data class Nmrebarsplitter(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcSizing: Rect = Rect(),
)

public data class Nmsearchweb(
    public var hdr: Nmhdr = Nmhdr(),
    public var entrypoint: EcSearchwebEntrypoint = 0,
    public var hasQueryText: Bool = 0,
    public var invokeSucceeded: Bool = 0,
)

public data class Nmselchange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var stSelStart: Systemtime = Systemtime(),
    public var stSelEnd: Systemtime = Systemtime(),
)

public class Nmtbcustomdraw internal constructor(
    public var nmcd: Nmcustomdraw,
    hbrMonoDitherCtorArg: Hbrush,
    hbrLinesCtorArg: Hbrush,
    hpenLinesCtorArg: Hpen,
    public var clrText: Colorref,
    public var clrMark: Colorref,
    public var clrTextHighlight: Colorref,
    public var clrBtnFace: Colorref,
    public var clrBtnHighlight: Colorref,
    public var clrHighlightHotTrack: Colorref,
    public var rcText: Rect,
    public var nStringBkMode: Int,
    public var nHLStringBkMode: Int,
    public var iListGap: Int,
) {
    public var hbrMonoDither: Hbrush = hbrMonoDitherCtorArg
        internal set

    public var hbrLines: Hbrush = hbrLinesCtorArg
        internal set

    public var hpenLines: Hpen = hpenLinesCtorArg
        internal set

    public constructor() : this(
        nmcd = Nmcustomdraw(),
        hbrMonoDitherCtorArg = MutPtr(0L),
        hbrLinesCtorArg = MutPtr(0L),
        hpenLinesCtorArg = MutPtr(0L),
        clrText = 0u,
        clrMark = 0u,
        clrTextHighlight = 0u,
        clrBtnFace = 0u,
        clrBtnHighlight = 0u,
        clrHighlightHotTrack = 0u,
        rcText = Rect(),
        nStringBkMode = 0,
        nHLStringBkMode = 0,
        iListGap = 0,
    )

    public operator fun component1(): Nmcustomdraw = this.nmcd

    public operator fun component2(): Hbrush = this.hbrMonoDither

    public operator fun component3(): Hbrush = this.hbrLines

    public operator fun component4(): Hpen = this.hpenLines

    public operator fun component5(): Colorref = this.clrText

    public operator fun component6(): Colorref = this.clrMark

    public operator fun component7(): Colorref = this.clrTextHighlight

    public operator fun component8(): Colorref = this.clrBtnFace

    public operator fun component9(): Colorref = this.clrBtnHighlight

    public operator fun component10(): Colorref = this.clrHighlightHotTrack

    public operator fun component11(): Rect = this.rcText

    public operator fun component12(): Int = this.nStringBkMode

    public operator fun component13(): Int = this.nHLStringBkMode

    public operator fun component14(): Int = this.iListGap

    public fun copy(nmcd: Nmcustomdraw = this.nmcd, hbrMonoDither: Hbrush = this.hbrMonoDither, hbrLines: Hbrush = this.hbrLines, hpenLines: Hpen = this.hpenLines, clrText: Colorref = this.clrText, clrMark: Colorref = this.clrMark, clrTextHighlight: Colorref = this.clrTextHighlight, clrBtnFace: Colorref = this.clrBtnFace, clrBtnHighlight: Colorref = this.clrBtnHighlight, clrHighlightHotTrack: Colorref = this.clrHighlightHotTrack, rcText: Rect = this.rcText, nStringBkMode: Int = this.nStringBkMode, nHLStringBkMode: Int = this.nHLStringBkMode, iListGap: Int = this.iListGap): Nmtbcustomdraw = Nmtbcustomdraw(nmcd = nmcd, hbrMonoDitherCtorArg = hbrMonoDither, hbrLinesCtorArg = hbrLines, hpenLinesCtorArg = hpenLines, clrText = clrText, clrMark = clrMark, clrTextHighlight = clrTextHighlight, clrBtnFace = clrBtnFace, clrBtnHighlight = clrBtnHighlight, clrHighlightHotTrack = clrHighlightHotTrack, rcText = rcText, nStringBkMode = nStringBkMode, nHLStringBkMode = nHLStringBkMode, iListGap = iListGap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbcustomdraw) return false
        if (this.nmcd != other.nmcd) return false
        if (this.hbrMonoDither != other.hbrMonoDither) return false
        if (this.hbrLines != other.hbrLines) return false
        if (this.hpenLines != other.hpenLines) return false
        if (this.clrText != other.clrText) return false
        if (this.clrMark != other.clrMark) return false
        if (this.clrTextHighlight != other.clrTextHighlight) return false
        if (this.clrBtnFace != other.clrBtnFace) return false
        if (this.clrBtnHighlight != other.clrBtnHighlight) return false
        if (this.clrHighlightHotTrack != other.clrHighlightHotTrack) return false
        if (this.rcText != other.rcText) return false
        if (this.nStringBkMode != other.nStringBkMode) return false
        if (this.nHLStringBkMode != other.nHLStringBkMode) return false
        if (this.iListGap != other.iListGap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmcd.hashCode()
        result = 31 * result + this.hbrMonoDither.hashCode()
        result = 31 * result + this.hbrLines.hashCode()
        result = 31 * result + this.hpenLines.hashCode()
        result = 31 * result + this.clrText.hashCode()
        result = 31 * result + this.clrMark.hashCode()
        result = 31 * result + this.clrTextHighlight.hashCode()
        result = 31 * result + this.clrBtnFace.hashCode()
        result = 31 * result + this.clrBtnHighlight.hashCode()
        result = 31 * result + this.clrHighlightHotTrack.hashCode()
        result = 31 * result + this.rcText.hashCode()
        result = 31 * result + this.nStringBkMode.hashCode()
        result = 31 * result + this.nHLStringBkMode.hashCode()
        result = 31 * result + this.iListGap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmcd: Nmcustomdraw = Nmcustomdraw(),
            hbrMonoDither: Hbrush = MutPtr(0L),
            hbrLines: Hbrush = MutPtr(0L),
            hpenLines: Hpen = MutPtr(0L),
            clrText: Colorref = 0u,
            clrMark: Colorref = 0u,
            clrTextHighlight: Colorref = 0u,
            clrBtnFace: Colorref = 0u,
            clrBtnHighlight: Colorref = 0u,
            clrHighlightHotTrack: Colorref = 0u,
            rcText: Rect = Rect(),
            nStringBkMode: Int = 0,
            nHLStringBkMode: Int = 0,
            iListGap: Int = 0,
        ): Nmtbcustomdraw =
            Nmtbcustomdraw(
                nmcd = nmcd,
                hbrMonoDitherCtorArg = hbrMonoDither,
                hbrLinesCtorArg = hbrLines,
                hpenLinesCtorArg = hpenLines,
                clrText = clrText,
                clrMark = clrMark,
                clrTextHighlight = clrTextHighlight,
                clrBtnFace = clrBtnFace,
                clrBtnHighlight = clrBtnHighlight,
                clrHighlightHotTrack = clrHighlightHotTrack,
                rcText = rcText,
                nStringBkMode = nStringBkMode,
                nHLStringBkMode = nHLStringBkMode,
                iListGap = iListGap,
            )
    }
}

public class Nmtbdispinfoa internal constructor(
    public var hdr: Nmhdr,
    public var dwMask: NmtbdispinfowMask,
    public var idCommand: Int,
    public var lParam: Int,
    public var iImage: Int,
    pszTextCtorArg: Pstr,
    public var cchText: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        dwMask = 0u,
        idCommand = 0,
        lParam = 0,
        iImage = 0,
        pszTextCtorArg = MutPtr(0L),
        cchText = 0,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): NmtbdispinfowMask = this.dwMask

    public operator fun component3(): Int = this.idCommand

    public operator fun component4(): Int = this.lParam

    public operator fun component5(): Int = this.iImage

    public operator fun component6(): Pstr = this.pszText

    public operator fun component7(): Int = this.cchText

    public fun copy(hdr: Nmhdr = this.hdr, dwMask: NmtbdispinfowMask = this.dwMask, idCommand: Int = this.idCommand, lParam: Int = this.lParam, iImage: Int = this.iImage, pszText: Pstr = this.pszText, cchText: Int = this.cchText): Nmtbdispinfoa = Nmtbdispinfoa(hdr = hdr, dwMask = dwMask, idCommand = idCommand, lParam = lParam, iImage = iImage, pszTextCtorArg = pszText, cchText = cchText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbdispinfoa) return false
        if (this.hdr != other.hdr) return false
        if (this.dwMask != other.dwMask) return false
        if (this.idCommand != other.idCommand) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        if (this.pszText != other.pszText) return false
        if (this.cchText != other.cchText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            dwMask: NmtbdispinfowMask = 0u,
            idCommand: Int = 0,
            lParam: Int = 0,
            iImage: Int = 0,
            pszText: Pstr = MutPtr(0L),
            cchText: Int = 0,
        ): Nmtbdispinfoa =
            Nmtbdispinfoa(
                hdr = hdr,
                dwMask = dwMask,
                idCommand = idCommand,
                lParam = lParam,
                iImage = iImage,
                pszTextCtorArg = pszText,
                cchText = cchText,
            )
    }
}

public class Nmtbdispinfow internal constructor(
    public var hdr: Nmhdr,
    public var dwMask: NmtbdispinfowMask,
    public var idCommand: Int,
    public var lParam: Int,
    public var iImage: Int,
    pszTextCtorArg: Pwstr,
    public var cchText: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        dwMask = 0u,
        idCommand = 0,
        lParam = 0,
        iImage = 0,
        pszTextCtorArg = MutPtr(0L),
        cchText = 0,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): NmtbdispinfowMask = this.dwMask

    public operator fun component3(): Int = this.idCommand

    public operator fun component4(): Int = this.lParam

    public operator fun component5(): Int = this.iImage

    public operator fun component6(): Pwstr = this.pszText

    public operator fun component7(): Int = this.cchText

    public fun copy(hdr: Nmhdr = this.hdr, dwMask: NmtbdispinfowMask = this.dwMask, idCommand: Int = this.idCommand, lParam: Int = this.lParam, iImage: Int = this.iImage, pszText: Pwstr = this.pszText, cchText: Int = this.cchText): Nmtbdispinfow = Nmtbdispinfow(hdr = hdr, dwMask = dwMask, idCommand = idCommand, lParam = lParam, iImage = iImage, pszTextCtorArg = pszText, cchText = cchText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbdispinfow) return false
        if (this.hdr != other.hdr) return false
        if (this.dwMask != other.dwMask) return false
        if (this.idCommand != other.idCommand) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        if (this.pszText != other.pszText) return false
        if (this.cchText != other.cchText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            dwMask: NmtbdispinfowMask = 0u,
            idCommand: Int = 0,
            lParam: Int = 0,
            iImage: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            cchText: Int = 0,
        ): Nmtbdispinfow =
            Nmtbdispinfow(
                hdr = hdr,
                dwMask = dwMask,
                idCommand = idCommand,
                lParam = lParam,
                iImage = iImage,
                pszTextCtorArg = pszText,
                cchText = cchText,
            )
    }
}

public class Nmtbgetinfotipa internal constructor(
    public var hdr: Nmhdr,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iItem: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pstr = this.pszText

    public operator fun component3(): Int = this.cchTextMax

    public operator fun component4(): Int = this.iItem

    public operator fun component5(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iItem: Int = this.iItem, lParam: Lparam = this.lParam): Nmtbgetinfotipa = Nmtbgetinfotipa(hdr = hdr, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iItem = iItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbgetinfotipa) return false
        if (this.hdr != other.hdr) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iItem != other.iItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iItem: Int = 0,
            lParam: Lparam = 0L,
        ): Nmtbgetinfotipa =
            Nmtbgetinfotipa(
                hdr = hdr,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iItem = iItem,
                lParam = lParam,
            )
    }
}

public class Nmtbgetinfotipw internal constructor(
    public var hdr: Nmhdr,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iItem: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pwstr = this.pszText

    public operator fun component3(): Int = this.cchTextMax

    public operator fun component4(): Int = this.iItem

    public operator fun component5(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iItem: Int = this.iItem, lParam: Lparam = this.lParam): Nmtbgetinfotipw = Nmtbgetinfotipw(hdr = hdr, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iItem = iItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbgetinfotipw) return false
        if (this.hdr != other.hdr) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iItem != other.iItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iItem: Int = 0,
            lParam: Lparam = 0L,
        ): Nmtbgetinfotipw =
            Nmtbgetinfotipw(
                hdr = hdr,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iItem = iItem,
                lParam = lParam,
            )
    }
}

public data class Nmtbhotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: NmtbhotitemFlags = 0u,
)

public class Nmtbrestore internal constructor(
    public var hdr: Nmhdr,
    pDataCtorArg: MutPtr,
    pCurrentCtorArg: MutPtr,
    public var cbData: UInt,
    public var iItem: Int,
    public var cButtons: Int,
    public var cbBytesPerRecord: Int,
    public var tbButton: Tbbutton,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public var pCurrent: MutPtr = pCurrentCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pDataCtorArg = MutPtr(0L),
        pCurrentCtorArg = MutPtr(0L),
        cbData = 0u,
        iItem = 0,
        cButtons = 0,
        cbBytesPerRecord = 0,
        tbButton = Tbbutton(),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr = this.pData

    public operator fun component3(): MutPtr = this.pCurrent

    public operator fun component4(): UInt = this.cbData

    public operator fun component5(): Int = this.iItem

    public operator fun component6(): Int = this.cButtons

    public operator fun component7(): Int = this.cbBytesPerRecord

    public operator fun component8(): Tbbutton = this.tbButton

    public fun copy(hdr: Nmhdr = this.hdr, pData: MutPtr = this.pData, pCurrent: MutPtr = this.pCurrent, cbData: UInt = this.cbData, iItem: Int = this.iItem, cButtons: Int = this.cButtons, cbBytesPerRecord: Int = this.cbBytesPerRecord, tbButton: Tbbutton = this.tbButton): Nmtbrestore = Nmtbrestore(hdr = hdr, pDataCtorArg = pData, pCurrentCtorArg = pCurrent, cbData = cbData, iItem = iItem, cButtons = cButtons, cbBytesPerRecord = cbBytesPerRecord, tbButton = tbButton)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbrestore) return false
        if (this.hdr != other.hdr) return false
        if (this.pData != other.pData) return false
        if (this.pCurrent != other.pCurrent) return false
        if (this.cbData != other.cbData) return false
        if (this.iItem != other.iItem) return false
        if (this.cButtons != other.cButtons) return false
        if (this.cbBytesPerRecord != other.cbBytesPerRecord) return false
        if (this.tbButton != other.tbButton) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.pCurrent.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.cButtons.hashCode()
        result = 31 * result + this.cbBytesPerRecord.hashCode()
        result = 31 * result + this.tbButton.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pData: MutPtr = MutPtr(0L),
            pCurrent: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
            iItem: Int = 0,
            cButtons: Int = 0,
            cbBytesPerRecord: Int = 0,
            tbButton: Tbbutton = Tbbutton(),
        ): Nmtbrestore =
            Nmtbrestore(
                hdr = hdr,
                pDataCtorArg = pData,
                pCurrentCtorArg = pCurrent,
                cbData = cbData,
                iItem = iItem,
                cButtons = cButtons,
                cbBytesPerRecord = cbBytesPerRecord,
                tbButton = tbButton,
            )
    }
}

public class Nmtbsave internal constructor(
    public var hdr: Nmhdr,
    pDataCtorArg: MutPtr,
    pCurrentCtorArg: MutPtr,
    public var cbData: UInt,
    public var iItem: Int,
    public var cButtons: Int,
    public var tbButton: Tbbutton,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public var pCurrent: MutPtr = pCurrentCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pDataCtorArg = MutPtr(0L),
        pCurrentCtorArg = MutPtr(0L),
        cbData = 0u,
        iItem = 0,
        cButtons = 0,
        tbButton = Tbbutton(),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr = this.pData

    public operator fun component3(): MutPtr = this.pCurrent

    public operator fun component4(): UInt = this.cbData

    public operator fun component5(): Int = this.iItem

    public operator fun component6(): Int = this.cButtons

    public operator fun component7(): Tbbutton = this.tbButton

    public fun copy(hdr: Nmhdr = this.hdr, pData: MutPtr = this.pData, pCurrent: MutPtr = this.pCurrent, cbData: UInt = this.cbData, iItem: Int = this.iItem, cButtons: Int = this.cButtons, tbButton: Tbbutton = this.tbButton): Nmtbsave = Nmtbsave(hdr = hdr, pDataCtorArg = pData, pCurrentCtorArg = pCurrent, cbData = cbData, iItem = iItem, cButtons = cButtons, tbButton = tbButton)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtbsave) return false
        if (this.hdr != other.hdr) return false
        if (this.pData != other.pData) return false
        if (this.pCurrent != other.pCurrent) return false
        if (this.cbData != other.cbData) return false
        if (this.iItem != other.iItem) return false
        if (this.cButtons != other.cButtons) return false
        if (this.tbButton != other.tbButton) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.pCurrent.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.cButtons.hashCode()
        result = 31 * result + this.tbButton.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pData: MutPtr = MutPtr(0L),
            pCurrent: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
            iItem: Int = 0,
            cButtons: Int = 0,
            tbButton: Tbbutton = Tbbutton(),
        ): Nmtbsave =
            Nmtbsave(
                hdr = hdr,
                pDataCtorArg = pData,
                pCurrentCtorArg = pCurrent,
                cbData = cbData,
                iItem = iItem,
                cButtons = cButtons,
                tbButton = tbButton,
            )
    }
}

public data class Nmtckeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public class Nmtoolbara internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var tbButton: Tbbutton,
    public var cchText: Int,
    pszTextCtorArg: Pstr,
    public var rcButton: Rect,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        tbButton = Tbbutton(),
        cchText = 0,
        pszTextCtorArg = MutPtr(0L),
        rcButton = Rect(),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Tbbutton = this.tbButton

    public operator fun component4(): Int = this.cchText

    public operator fun component5(): Pstr = this.pszText

    public operator fun component6(): Rect = this.rcButton

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, tbButton: Tbbutton = this.tbButton, cchText: Int = this.cchText, pszText: Pstr = this.pszText, rcButton: Rect = this.rcButton): Nmtoolbara = Nmtoolbara(hdr = hdr, iItem = iItem, tbButton = tbButton, cchText = cchText, pszTextCtorArg = pszText, rcButton = rcButton)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtoolbara) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.tbButton != other.tbButton) return false
        if (this.cchText != other.cchText) return false
        if (this.pszText != other.pszText) return false
        if (this.rcButton != other.rcButton) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.tbButton.hashCode()
        result = 31 * result + this.cchText.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.rcButton.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            tbButton: Tbbutton = Tbbutton(),
            cchText: Int = 0,
            pszText: Pstr = MutPtr(0L),
            rcButton: Rect = Rect(),
        ): Nmtoolbara =
            Nmtoolbara(
                hdr = hdr,
                iItem = iItem,
                tbButton = tbButton,
                cchText = cchText,
                pszTextCtorArg = pszText,
                rcButton = rcButton,
            )
    }
}

public class Nmtoolbarw internal constructor(
    public var hdr: Nmhdr,
    public var iItem: Int,
    public var tbButton: Tbbutton,
    public var cchText: Int,
    pszTextCtorArg: Pwstr,
    public var rcButton: Rect,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        iItem = 0,
        tbButton = Tbbutton(),
        cchText = 0,
        pszTextCtorArg = MutPtr(0L),
        rcButton = Rect(),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Int = this.iItem

    public operator fun component3(): Tbbutton = this.tbButton

    public operator fun component4(): Int = this.cchText

    public operator fun component5(): Pwstr = this.pszText

    public operator fun component6(): Rect = this.rcButton

    public fun copy(hdr: Nmhdr = this.hdr, iItem: Int = this.iItem, tbButton: Tbbutton = this.tbButton, cchText: Int = this.cchText, pszText: Pwstr = this.pszText, rcButton: Rect = this.rcButton): Nmtoolbarw = Nmtoolbarw(hdr = hdr, iItem = iItem, tbButton = tbButton, cchText = cchText, pszTextCtorArg = pszText, rcButton = rcButton)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtoolbarw) return false
        if (this.hdr != other.hdr) return false
        if (this.iItem != other.iItem) return false
        if (this.tbButton != other.tbButton) return false
        if (this.cchText != other.cchText) return false
        if (this.pszText != other.pszText) return false
        if (this.rcButton != other.rcButton) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItem.hashCode()
        result = 31 * result + this.tbButton.hashCode()
        result = 31 * result + this.cchText.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.rcButton.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            iItem: Int = 0,
            tbButton: Tbbutton = Tbbutton(),
            cchText: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            rcButton: Rect = Rect(),
        ): Nmtoolbarw =
            Nmtoolbarw(
                hdr = hdr,
                iItem = iItem,
                tbButton = tbButton,
                cchText = cchText,
                pszTextCtorArg = pszText,
                rcButton = rcButton,
            )
    }
}

public class Nmtooltipscreated internal constructor(
    public var hdr: Nmhdr,
    hwndToolTipsCtorArg: Hwnd,
) {
    public var hwndToolTips: Hwnd = hwndToolTipsCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        hwndToolTipsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Hwnd = this.hwndToolTips

    public fun copy(hdr: Nmhdr = this.hdr, hwndToolTips: Hwnd = this.hwndToolTips): Nmtooltipscreated = Nmtooltipscreated(hdr = hdr, hwndToolTipsCtorArg = hwndToolTips)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtooltipscreated) return false
        if (this.hdr != other.hdr) return false
        if (this.hwndToolTips != other.hwndToolTips) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.hwndToolTips.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            hwndToolTips: Hwnd = MutPtr(0L),
        ): Nmtooltipscreated =
            Nmtooltipscreated(
                hdr = hdr,
                hwndToolTipsCtorArg = hwndToolTips,
            )
    }
}

public data class Nmtrbthumbposchanging(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwPos: UInt = 0u,
    public var nReason: Int = 0,
)

public data class Nmtreeviewa(
    public var hdr: Nmhdr = Nmhdr(),
    public var action: NmTreeviewAction = 0u,
    public var itemOld: Tvitema = Tvitema(),
    public var itemNew: Tvitema = Tvitema(),
    public var ptDrag: Point = Point(),
)

public data class Nmtreevieww(
    public var hdr: Nmhdr = Nmhdr(),
    public var action: NmTreeviewAction = 0u,
    public var itemOld: Tvitemw = Tvitemw(),
    public var itemNew: Tvitemw = Tvitemw(),
    public var ptDrag: Point = Point(),
)

public data class Nmttcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var uDrawFlags: UInt = 0u,
)

public class Nmttdispinfoa internal constructor(
    public var hdr: Nmhdr,
    lpszTextCtorArg: Pstr,
    public var szText: ByteArray,
    hinstCtorArg: Hinstance,
    public var uFlags: TooltipFlags,
    public var lParam: Lparam,
) {
    public var lpszText: Pstr = lpszTextCtorArg
        internal set

    public var hinst: Hinstance = hinstCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpszTextCtorArg = MutPtr(0L),
        szText = ByteArray(80),
        hinstCtorArg = MutPtr(0L),
        uFlags = 0u,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pstr = this.lpszText

    public operator fun component3(): ByteArray = this.szText

    public operator fun component4(): Hinstance = this.hinst

    public operator fun component5(): TooltipFlags = this.uFlags

    public operator fun component6(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, lpszText: Pstr = this.lpszText, szText: ByteArray = this.szText, hinst: Hinstance = this.hinst, uFlags: TooltipFlags = this.uFlags, lParam: Lparam = this.lParam): Nmttdispinfoa = Nmttdispinfoa(hdr = hdr, lpszTextCtorArg = lpszText, szText = szText, hinstCtorArg = hinst, uFlags = uFlags, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmttdispinfoa) return false
        if (this.hdr != other.hdr) return false
        if (this.lpszText != other.lpszText) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.hinst != other.hinst) return false
        if (this.uFlags != other.uFlags) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpszText: Pstr = MutPtr(0L),
            szText: ByteArray = ByteArray(80),
            hinst: Hinstance = MutPtr(0L),
            uFlags: TooltipFlags = 0u,
            lParam: Lparam = 0L,
        ): Nmttdispinfoa =
            Nmttdispinfoa(
                hdr = hdr,
                lpszTextCtorArg = lpszText,
                szText = szText,
                hinstCtorArg = hinst,
                uFlags = uFlags,
                lParam = lParam,
            )
    }
}

public class Nmttdispinfow internal constructor(
    public var hdr: Nmhdr,
    lpszTextCtorArg: Pwstr,
    public var szText: UShortArray,
    hinstCtorArg: Hinstance,
    public var uFlags: TooltipFlags,
    public var lParam: Lparam,
) {
    public var lpszText: Pwstr = lpszTextCtorArg
        internal set

    public var hinst: Hinstance = hinstCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        lpszTextCtorArg = MutPtr(0L),
        szText = UShortArray(80),
        hinstCtorArg = MutPtr(0L),
        uFlags = 0u,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pwstr = this.lpszText

    public operator fun component3(): UShortArray = this.szText

    public operator fun component4(): Hinstance = this.hinst

    public operator fun component5(): TooltipFlags = this.uFlags

    public operator fun component6(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, lpszText: Pwstr = this.lpszText, szText: UShortArray = this.szText, hinst: Hinstance = this.hinst, uFlags: TooltipFlags = this.uFlags, lParam: Lparam = this.lParam): Nmttdispinfow = Nmttdispinfow(hdr = hdr, lpszTextCtorArg = lpszText, szText = szText, hinstCtorArg = hinst, uFlags = uFlags, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmttdispinfow) return false
        if (this.hdr != other.hdr) return false
        if (this.lpszText != other.lpszText) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.hinst != other.hinst) return false
        if (this.uFlags != other.uFlags) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            lpszText: Pwstr = MutPtr(0L),
            szText: UShortArray = UShortArray(80),
            hinst: Hinstance = MutPtr(0L),
            uFlags: TooltipFlags = 0u,
            lParam: Lparam = 0L,
        ): Nmttdispinfow =
            Nmttdispinfow(
                hdr = hdr,
                lpszTextCtorArg = lpszText,
                szText = szText,
                hinstCtorArg = hinst,
                uFlags = uFlags,
                lParam = lParam,
            )
    }
}

public class Nmtvasyncdraw internal constructor(
    public var hdr: Nmhdr,
    pimldpCtorArg: MutPtr,
    public var hr: Hresult,
    public var hItem: Htreeitem,
    public var lParam: Lparam,
    public var dwRetFlags: UInt,
    public var iRetImageIndex: Int,
) {
    public var pimldp: MutPtr = pimldpCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pimldpCtorArg = MutPtr(0L),
        hr = 0,
        hItem = 0,
        lParam = 0L,
        dwRetFlags = 0u,
        iRetImageIndex = 0,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): MutPtr = this.pimldp

    public operator fun component3(): Hresult = this.hr

    public operator fun component4(): Htreeitem = this.hItem

    public operator fun component5(): Lparam = this.lParam

    public operator fun component6(): UInt = this.dwRetFlags

    public operator fun component7(): Int = this.iRetImageIndex

    public fun copy(hdr: Nmhdr = this.hdr, pimldp: MutPtr = this.pimldp, hr: Hresult = this.hr, hItem: Htreeitem = this.hItem, lParam: Lparam = this.lParam, dwRetFlags: UInt = this.dwRetFlags, iRetImageIndex: Int = this.iRetImageIndex): Nmtvasyncdraw = Nmtvasyncdraw(hdr = hdr, pimldpCtorArg = pimldp, hr = hr, hItem = hItem, lParam = lParam, dwRetFlags = dwRetFlags, iRetImageIndex = iRetImageIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtvasyncdraw) return false
        if (this.hdr != other.hdr) return false
        if (this.pimldp != other.pimldp) return false
        if (this.hr != other.hr) return false
        if (this.hItem != other.hItem) return false
        if (this.lParam != other.lParam) return false
        if (this.dwRetFlags != other.dwRetFlags) return false
        if (this.iRetImageIndex != other.iRetImageIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pimldp.hashCode()
        result = 31 * result + this.hr.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwRetFlags.hashCode()
        result = 31 * result + this.iRetImageIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pimldp: MutPtr = MutPtr(0L),
            hr: Hresult = 0,
            hItem: Htreeitem = 0,
            lParam: Lparam = 0L,
            dwRetFlags: UInt = 0u,
            iRetImageIndex: Int = 0,
        ): Nmtvasyncdraw =
            Nmtvasyncdraw(
                hdr = hdr,
                pimldpCtorArg = pimldp,
                hr = hr,
                hItem = hItem,
                lParam = lParam,
                dwRetFlags = dwRetFlags,
                iRetImageIndex = iRetImageIndex,
            )
    }
}

public data class Nmtvcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var clrText: Colorref = 0u,
    public var clrTextBk: Colorref = 0u,
    public var iLevel: Int = 0,
)

public data class Nmtvdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitema = Tvitema(),
)

public data class Nmtvdispinfoexa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemexa = Tvitemexa(),
)

public data class Nmtvdispinfoexw(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemexw = Tvitemexw(),
)

public data class Nmtvdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemw = Tvitemw(),
)

public class Nmtvgetinfotipa internal constructor(
    public var hdr: Nmhdr,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var hItem: Htreeitem,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        hItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pstr = this.pszText

    public operator fun component3(): Int = this.cchTextMax

    public operator fun component4(): Htreeitem = this.hItem

    public operator fun component5(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, hItem: Htreeitem = this.hItem, lParam: Lparam = this.lParam): Nmtvgetinfotipa = Nmtvgetinfotipa(hdr = hdr, pszTextCtorArg = pszText, cchTextMax = cchTextMax, hItem = hItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtvgetinfotipa) return false
        if (this.hdr != other.hdr) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.hItem != other.hItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            hItem: Htreeitem = 0,
            lParam: Lparam = 0L,
        ): Nmtvgetinfotipa =
            Nmtvgetinfotipa(
                hdr = hdr,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                hItem = hItem,
                lParam = lParam,
            )
    }
}

public class Nmtvgetinfotipw internal constructor(
    public var hdr: Nmhdr,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var hItem: Htreeitem,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        hdr = Nmhdr(),
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        hItem = 0,
        lParam = 0L,
    )

    public operator fun component1(): Nmhdr = this.hdr

    public operator fun component2(): Pwstr = this.pszText

    public operator fun component3(): Int = this.cchTextMax

    public operator fun component4(): Htreeitem = this.hItem

    public operator fun component5(): Lparam = this.lParam

    public fun copy(hdr: Nmhdr = this.hdr, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, hItem: Htreeitem = this.hItem, lParam: Lparam = this.lParam): Nmtvgetinfotipw = Nmtvgetinfotipw(hdr = hdr, pszTextCtorArg = pszText, cchTextMax = cchTextMax, hItem = hItem, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmtvgetinfotipw) return false
        if (this.hdr != other.hdr) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.hItem != other.hItem) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdr: Nmhdr = Nmhdr(),
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            hItem: Htreeitem = 0,
            lParam: Lparam = 0L,
        ): Nmtvgetinfotipw =
            Nmtvgetinfotipw(
                hdr = hdr,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                hItem = hItem,
                lParam = lParam,
            )
    }
}

public data class Nmtvitemchange(
    public var hdr: Nmhdr = Nmhdr(),
    public var uChanged: UInt = 0u,
    public var hItem: Htreeitem = 0,
    public var uStateNew: UInt = 0u,
    public var uStateOld: UInt = 0u,
    public var lParam: Lparam = 0L,
)

public data class Nmtvkeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class Nmtvstateimagechanging(
    public var hdr: Nmhdr = Nmhdr(),
    public var hti: Htreeitem = 0,
    public var iOldStateImageIndex: Int = 0,
    public var iNewStateImageIndex: Int = 0,
)

public data class Nmupdown(
    public var hdr: Nmhdr = Nmhdr(),
    public var iPos: Int = 0,
    public var iDelta: Int = 0,
)

public data class Nmviewchange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var dwOldView: MonthCaldendarMessagesView = 0u,
    public var dwNewView: MonthCaldendarMessagesView = 0u,
)

public data class Pbrange(
    public var iLow: Int = 0,
    public var iHigh: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pbrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pbrange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pbrange =
                    Pbrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pbrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iHigh)
                }
            }
    }
}

public data class PointerDeviceCursorInfo(
    public var cursorId: UInt = 0u,
    public var cursor: PointerDeviceCursorType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerDeviceCursorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerDeviceCursorInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PointerDeviceCursorInfo =
                    PointerDeviceCursorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PointerDeviceCursorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cursorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cursor)
                }
            }
    }
}

public class PointerDeviceInfo internal constructor(
    public var displayOrientation: UInt,
    deviceCtorArg: Handle,
    public var pointerDeviceType: PointerDeviceType,
    monitorCtorArg: Hmonitor,
    public var startingCursorId: UInt,
    public var maxActiveContacts: UShort,
    public var productString: UShortArray,
) {
    public var device: Handle = deviceCtorArg
        internal set

    public var monitor: Hmonitor = monitorCtorArg
        internal set

    public constructor() : this(
        displayOrientation = 0u,
        deviceCtorArg = MutPtr(0L),
        pointerDeviceType = 0,
        monitorCtorArg = MutPtr(0L),
        startingCursorId = 0u,
        maxActiveContacts = 0u,
        productString = UShortArray(520),
    )

    public operator fun component1(): UInt = this.displayOrientation

    public operator fun component2(): Handle = this.device

    public operator fun component3(): PointerDeviceType = this.pointerDeviceType

    public operator fun component4(): Hmonitor = this.monitor

    public operator fun component5(): UInt = this.startingCursorId

    public operator fun component6(): UShort = this.maxActiveContacts

    public operator fun component7(): UShortArray = this.productString

    public fun copy(displayOrientation: UInt = this.displayOrientation, device: Handle = this.device, pointerDeviceType: PointerDeviceType = this.pointerDeviceType, monitor: Hmonitor = this.monitor, startingCursorId: UInt = this.startingCursorId, maxActiveContacts: UShort = this.maxActiveContacts, productString: UShortArray = this.productString): PointerDeviceInfo = PointerDeviceInfo(displayOrientation = displayOrientation, deviceCtorArg = device, pointerDeviceType = pointerDeviceType, monitorCtorArg = monitor, startingCursorId = startingCursorId, maxActiveContacts = maxActiveContacts, productString = productString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PointerDeviceInfo) return false
        if (this.displayOrientation != other.displayOrientation) return false
        if (this.device != other.device) return false
        if (this.pointerDeviceType != other.pointerDeviceType) return false
        if (this.monitor != other.monitor) return false
        if (this.startingCursorId != other.startingCursorId) return false
        if (this.maxActiveContacts != other.maxActiveContacts) return false
        if (!this.productString.contentEquals(other.productString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayOrientation.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.pointerDeviceType.hashCode()
        result = 31 * result + this.monitor.hashCode()
        result = 31 * result + this.startingCursorId.hashCode()
        result = 31 * result + this.maxActiveContacts.hashCode()
        result = 31 * result + this.productString.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            displayOrientation: UInt = 0u,
            device: Handle = MutPtr(0L),
            pointerDeviceType: PointerDeviceType = 0,
            monitor: Hmonitor = MutPtr(0L),
            startingCursorId: UInt = 0u,
            maxActiveContacts: UShort = 0u,
            productString: UShortArray = UShortArray(520),
        ): PointerDeviceInfo =
            PointerDeviceInfo(
                displayOrientation = displayOrientation,
                deviceCtorArg = device,
                pointerDeviceType = pointerDeviceType,
                monitorCtorArg = monitor,
                startingCursorId = startingCursorId,
                maxActiveContacts = maxActiveContacts,
                productString = productString,
            )
    }
}

public data class PointerDeviceProperty(
    public var logicalMin: Int = 0,
    public var logicalMax: Int = 0,
    public var physicalMin: Int = 0,
    public var physicalMax: Int = 0,
    public var unit: UInt = 0u,
    public var unitExponent: UInt = 0u,
    public var usagePageId: UShort = 0u,
    public var usageId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerDeviceProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerDeviceProperty> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): PointerDeviceProperty =
                    PointerDeviceProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: PointerDeviceProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.logicalMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.logicalMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.physicalMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.physicalMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.unit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.unitExponent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.usagePageId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.usageId)
                }
            }
    }
}

public data class PointerTypeInfo(
    public var type: PointerInputType = 0,
    public var anonymous: PointerTypeInfo0 = PointerTypeInfo0(),
)

public data class PointerTypeInfo0(
    public var touchInfo: Input.Pointer.PointerTouchInfo = Input.Pointer.PointerTouchInfo(),
    public var penInfo: Input.Pointer.PointerPenInfo = Input.Pointer.PointerPenInfo(),
)

public class PropsheetheaderaV1 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetheaderaV10,
    pszCaptionCtorArg: Pcstr,
    public var nPages: UInt,
    public var anonymous2: PropsheetheaderaV11,
    public var anonymous3: PropsheetheaderaV12,
    public var pfnCallback: Pfnpropsheetcallback,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszCaption: Pcstr = pszCaptionCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetheaderaV10(),
        pszCaptionCtorArg = ConstPtr(0L),
        nPages = 0u,
        anonymous2 = PropsheetheaderaV11(),
        anonymous3 = PropsheetheaderaV12(),
        pfnCallback = null,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Hinstance = this.hInstance

    public operator fun component5(): PropsheetheaderaV10 = this.anonymous1

    public operator fun component6(): Pcstr = this.pszCaption

    public operator fun component7(): UInt = this.nPages

    public operator fun component8(): PropsheetheaderaV11 = this.anonymous2

    public operator fun component9(): PropsheetheaderaV12 = this.anonymous3

    public operator fun component10(): Pfnpropsheetcallback = this.pfnCallback

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetheaderaV10 = this.anonymous1, pszCaption: Pcstr = this.pszCaption, nPages: UInt = this.nPages, anonymous2: PropsheetheaderaV11 = this.anonymous2, anonymous3: PropsheetheaderaV12 = this.anonymous3, pfnCallback: Pfnpropsheetcallback = this.pfnCallback): PropsheetheaderaV1 = PropsheetheaderaV1(dwSize = dwSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, pszCaptionCtorArg = pszCaption, nPages = nPages, anonymous2 = anonymous2, anonymous3 = anonymous3, pfnCallback = pfnCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.nPages != other.nPages) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.pfnCallback != other.pfnCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.nPages.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetheaderaV10 = PropsheetheaderaV10(),
            pszCaption: Pcstr = ConstPtr(0L),
            nPages: UInt = 0u,
            anonymous2: PropsheetheaderaV11 = PropsheetheaderaV11(),
            anonymous3: PropsheetheaderaV12 = PropsheetheaderaV12(),
            pfnCallback: Pfnpropsheetcallback = null,
        ): PropsheetheaderaV1 =
            PropsheetheaderaV1(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                pszCaptionCtorArg = pszCaption,
                nPages = nPages,
                anonymous2 = anonymous2,
                anonymous3 = anonymous3,
                pfnCallback = pfnCallback,
            )
    }
}

public class PropsheetheaderaV10 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): PropsheetheaderaV10 = PropsheetheaderaV10(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV10) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV10 =
            PropsheetheaderaV10(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetheaderaV11 internal constructor(
    public var nStartPage: UInt,
    pStartPageCtorArg: Pcstr,
) {
    public var pStartPage: Pcstr = pStartPageCtorArg
        internal set

    public constructor() : this(
        nStartPage = 0u,
        pStartPageCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.nStartPage

    public operator fun component2(): Pcstr = this.pStartPage

    public fun copy(nStartPage: UInt = this.nStartPage, pStartPage: Pcstr = this.pStartPage): PropsheetheaderaV11 = PropsheetheaderaV11(nStartPage = nStartPage, pStartPageCtorArg = pStartPage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV11) return false
        if (this.nStartPage != other.nStartPage) return false
        if (this.pStartPage != other.pStartPage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nStartPage.hashCode()
        result = 31 * result + this.pStartPage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nStartPage: UInt = 0u,
            pStartPage: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV11 =
            PropsheetheaderaV11(
                nStartPage = nStartPage,
                pStartPageCtorArg = pStartPage,
            )
    }
}

public class PropsheetheaderaV12 internal constructor(
    ppspCtorArg: MutPtr,
    phpageCtorArg: MutPtr,
) {
    public var ppsp: MutPtr = ppspCtorArg
        internal set

    public var phpage: MutPtr = phpageCtorArg
        internal set

    public constructor() : this(
        ppspCtorArg = MutPtr(0L),
        phpageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.ppsp

    public operator fun component2(): MutPtr = this.phpage

    public fun copy(ppsp: MutPtr = this.ppsp, phpage: MutPtr = this.phpage): PropsheetheaderaV12 = PropsheetheaderaV12(ppspCtorArg = ppsp, phpageCtorArg = phpage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV12) return false
        if (this.ppsp != other.ppsp) return false
        if (this.phpage != other.phpage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ppsp.hashCode()
        result = 31 * result + this.phpage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ppsp: MutPtr = MutPtr(0L),
            phpage: MutPtr = MutPtr(0L),
        ): PropsheetheaderaV12 =
            PropsheetheaderaV12(
                ppspCtorArg = ppsp,
                phpageCtorArg = phpage,
            )
    }
}

public class PropsheetheaderaV2 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetheaderaV20,
    pszCaptionCtorArg: Pcstr,
    public var nPages: UInt,
    public var anonymous2: PropsheetheaderaV21,
    public var anonymous3: PropsheetheaderaV22,
    public var pfnCallback: Pfnpropsheetcallback,
    public var anonymous4: PropsheetheaderaV23,
    hplWatermarkCtorArg: Hpalette,
    public var anonymous5: PropsheetheaderaV24,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszCaption: Pcstr = pszCaptionCtorArg
        internal set

    public var hplWatermark: Hpalette = hplWatermarkCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetheaderaV20(),
        pszCaptionCtorArg = ConstPtr(0L),
        nPages = 0u,
        anonymous2 = PropsheetheaderaV21(),
        anonymous3 = PropsheetheaderaV22(),
        pfnCallback = null,
        anonymous4 = PropsheetheaderaV23(),
        hplWatermarkCtorArg = MutPtr(0L),
        anonymous5 = PropsheetheaderaV24(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Hinstance = this.hInstance

    public operator fun component5(): PropsheetheaderaV20 = this.anonymous1

    public operator fun component6(): Pcstr = this.pszCaption

    public operator fun component7(): UInt = this.nPages

    public operator fun component8(): PropsheetheaderaV21 = this.anonymous2

    public operator fun component9(): PropsheetheaderaV22 = this.anonymous3

    public operator fun component10(): Pfnpropsheetcallback = this.pfnCallback

    public operator fun component11(): PropsheetheaderaV23 = this.anonymous4

    public operator fun component12(): Hpalette = this.hplWatermark

    public operator fun component13(): PropsheetheaderaV24 = this.anonymous5

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetheaderaV20 = this.anonymous1, pszCaption: Pcstr = this.pszCaption, nPages: UInt = this.nPages, anonymous2: PropsheetheaderaV21 = this.anonymous2, anonymous3: PropsheetheaderaV22 = this.anonymous3, pfnCallback: Pfnpropsheetcallback = this.pfnCallback, anonymous4: PropsheetheaderaV23 = this.anonymous4, hplWatermark: Hpalette = this.hplWatermark, anonymous5: PropsheetheaderaV24 = this.anonymous5): PropsheetheaderaV2 = PropsheetheaderaV2(dwSize = dwSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, pszCaptionCtorArg = pszCaption, nPages = nPages, anonymous2 = anonymous2, anonymous3 = anonymous3, pfnCallback = pfnCallback, anonymous4 = anonymous4, hplWatermarkCtorArg = hplWatermark, anonymous5 = anonymous5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.nPages != other.nPages) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.anonymous4 != other.anonymous4) return false
        if (this.hplWatermark != other.hplWatermark) return false
        if (this.anonymous5 != other.anonymous5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.nPages.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.anonymous4.hashCode()
        result = 31 * result + this.hplWatermark.hashCode()
        result = 31 * result + this.anonymous5.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetheaderaV20 = PropsheetheaderaV20(),
            pszCaption: Pcstr = ConstPtr(0L),
            nPages: UInt = 0u,
            anonymous2: PropsheetheaderaV21 = PropsheetheaderaV21(),
            anonymous3: PropsheetheaderaV22 = PropsheetheaderaV22(),
            pfnCallback: Pfnpropsheetcallback = null,
            anonymous4: PropsheetheaderaV23 = PropsheetheaderaV23(),
            hplWatermark: Hpalette = MutPtr(0L),
            anonymous5: PropsheetheaderaV24 = PropsheetheaderaV24(),
        ): PropsheetheaderaV2 =
            PropsheetheaderaV2(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                pszCaptionCtorArg = pszCaption,
                nPages = nPages,
                anonymous2 = anonymous2,
                anonymous3 = anonymous3,
                pfnCallback = pfnCallback,
                anonymous4 = anonymous4,
                hplWatermarkCtorArg = hplWatermark,
                anonymous5 = anonymous5,
            )
    }
}

public class PropsheetheaderaV20 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): PropsheetheaderaV20 = PropsheetheaderaV20(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV20) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV20 =
            PropsheetheaderaV20(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetheaderaV21 internal constructor(
    public var nStartPage: UInt,
    pStartPageCtorArg: Pcstr,
) {
    public var pStartPage: Pcstr = pStartPageCtorArg
        internal set

    public constructor() : this(
        nStartPage = 0u,
        pStartPageCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.nStartPage

    public operator fun component2(): Pcstr = this.pStartPage

    public fun copy(nStartPage: UInt = this.nStartPage, pStartPage: Pcstr = this.pStartPage): PropsheetheaderaV21 = PropsheetheaderaV21(nStartPage = nStartPage, pStartPageCtorArg = pStartPage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV21) return false
        if (this.nStartPage != other.nStartPage) return false
        if (this.pStartPage != other.pStartPage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nStartPage.hashCode()
        result = 31 * result + this.pStartPage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nStartPage: UInt = 0u,
            pStartPage: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV21 =
            PropsheetheaderaV21(
                nStartPage = nStartPage,
                pStartPageCtorArg = pStartPage,
            )
    }
}

public class PropsheetheaderaV22 internal constructor(
    ppspCtorArg: MutPtr,
    phpageCtorArg: MutPtr,
) {
    public var ppsp: MutPtr = ppspCtorArg
        internal set

    public var phpage: MutPtr = phpageCtorArg
        internal set

    public constructor() : this(
        ppspCtorArg = MutPtr(0L),
        phpageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.ppsp

    public operator fun component2(): MutPtr = this.phpage

    public fun copy(ppsp: MutPtr = this.ppsp, phpage: MutPtr = this.phpage): PropsheetheaderaV22 = PropsheetheaderaV22(ppspCtorArg = ppsp, phpageCtorArg = phpage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV22) return false
        if (this.ppsp != other.ppsp) return false
        if (this.phpage != other.phpage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ppsp.hashCode()
        result = 31 * result + this.phpage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ppsp: MutPtr = MutPtr(0L),
            phpage: MutPtr = MutPtr(0L),
        ): PropsheetheaderaV22 =
            PropsheetheaderaV22(
                ppspCtorArg = ppsp,
                phpageCtorArg = phpage,
            )
    }
}

public class PropsheetheaderaV23 internal constructor(
    hbmWatermarkCtorArg: Hbitmap,
    pszbmWatermarkCtorArg: Pcstr,
) {
    public var hbmWatermark: Hbitmap = hbmWatermarkCtorArg
        internal set

    public var pszbmWatermark: Pcstr = pszbmWatermarkCtorArg
        internal set

    public constructor() : this(
        hbmWatermarkCtorArg = MutPtr(0L),
        pszbmWatermarkCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmWatermark

    public operator fun component2(): Pcstr = this.pszbmWatermark

    public fun copy(hbmWatermark: Hbitmap = this.hbmWatermark, pszbmWatermark: Pcstr = this.pszbmWatermark): PropsheetheaderaV23 = PropsheetheaderaV23(hbmWatermarkCtorArg = hbmWatermark, pszbmWatermarkCtorArg = pszbmWatermark)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV23) return false
        if (this.hbmWatermark != other.hbmWatermark) return false
        if (this.pszbmWatermark != other.pszbmWatermark) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmWatermark.hashCode()
        result = 31 * result + this.pszbmWatermark.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmWatermark: Hbitmap = MutPtr(0L),
            pszbmWatermark: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV23 =
            PropsheetheaderaV23(
                hbmWatermarkCtorArg = hbmWatermark,
                pszbmWatermarkCtorArg = pszbmWatermark,
            )
    }
}

public class PropsheetheaderaV24 internal constructor(
    hbmHeaderCtorArg: Hbitmap,
    pszbmHeaderCtorArg: Pcstr,
) {
    public var hbmHeader: Hbitmap = hbmHeaderCtorArg
        internal set

    public var pszbmHeader: Pcstr = pszbmHeaderCtorArg
        internal set

    public constructor() : this(
        hbmHeaderCtorArg = MutPtr(0L),
        pszbmHeaderCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmHeader

    public operator fun component2(): Pcstr = this.pszbmHeader

    public fun copy(hbmHeader: Hbitmap = this.hbmHeader, pszbmHeader: Pcstr = this.pszbmHeader): PropsheetheaderaV24 = PropsheetheaderaV24(hbmHeaderCtorArg = hbmHeader, pszbmHeaderCtorArg = pszbmHeader)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderaV24) return false
        if (this.hbmHeader != other.hbmHeader) return false
        if (this.pszbmHeader != other.pszbmHeader) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmHeader.hashCode()
        result = 31 * result + this.pszbmHeader.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmHeader: Hbitmap = MutPtr(0L),
            pszbmHeader: Pcstr = ConstPtr(0L),
        ): PropsheetheaderaV24 =
            PropsheetheaderaV24(
                hbmHeaderCtorArg = hbmHeader,
                pszbmHeaderCtorArg = pszbmHeader,
            )
    }
}

public class PropsheetheaderwV1 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetheaderwV10,
    pszCaptionCtorArg: Pcwstr,
    public var nPages: UInt,
    public var anonymous2: PropsheetheaderwV11,
    public var anonymous3: PropsheetheaderwV12,
    public var pfnCallback: Pfnpropsheetcallback,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszCaption: Pcwstr = pszCaptionCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetheaderwV10(),
        pszCaptionCtorArg = ConstPtr(0L),
        nPages = 0u,
        anonymous2 = PropsheetheaderwV11(),
        anonymous3 = PropsheetheaderwV12(),
        pfnCallback = null,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Hinstance = this.hInstance

    public operator fun component5(): PropsheetheaderwV10 = this.anonymous1

    public operator fun component6(): Pcwstr = this.pszCaption

    public operator fun component7(): UInt = this.nPages

    public operator fun component8(): PropsheetheaderwV11 = this.anonymous2

    public operator fun component9(): PropsheetheaderwV12 = this.anonymous3

    public operator fun component10(): Pfnpropsheetcallback = this.pfnCallback

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetheaderwV10 = this.anonymous1, pszCaption: Pcwstr = this.pszCaption, nPages: UInt = this.nPages, anonymous2: PropsheetheaderwV11 = this.anonymous2, anonymous3: PropsheetheaderwV12 = this.anonymous3, pfnCallback: Pfnpropsheetcallback = this.pfnCallback): PropsheetheaderwV1 = PropsheetheaderwV1(dwSize = dwSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, pszCaptionCtorArg = pszCaption, nPages = nPages, anonymous2 = anonymous2, anonymous3 = anonymous3, pfnCallback = pfnCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.nPages != other.nPages) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.pfnCallback != other.pfnCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.nPages.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetheaderwV10 = PropsheetheaderwV10(),
            pszCaption: Pcwstr = ConstPtr(0L),
            nPages: UInt = 0u,
            anonymous2: PropsheetheaderwV11 = PropsheetheaderwV11(),
            anonymous3: PropsheetheaderwV12 = PropsheetheaderwV12(),
            pfnCallback: Pfnpropsheetcallback = null,
        ): PropsheetheaderwV1 =
            PropsheetheaderwV1(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                pszCaptionCtorArg = pszCaption,
                nPages = nPages,
                anonymous2 = anonymous2,
                anonymous3 = anonymous3,
                pfnCallback = pfnCallback,
            )
    }
}

public class PropsheetheaderwV10 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): PropsheetheaderwV10 = PropsheetheaderwV10(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV10) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV10 =
            PropsheetheaderwV10(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetheaderwV11 internal constructor(
    public var nStartPage: UInt,
    pStartPageCtorArg: Pcwstr,
) {
    public var pStartPage: Pcwstr = pStartPageCtorArg
        internal set

    public constructor() : this(
        nStartPage = 0u,
        pStartPageCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.nStartPage

    public operator fun component2(): Pcwstr = this.pStartPage

    public fun copy(nStartPage: UInt = this.nStartPage, pStartPage: Pcwstr = this.pStartPage): PropsheetheaderwV11 = PropsheetheaderwV11(nStartPage = nStartPage, pStartPageCtorArg = pStartPage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV11) return false
        if (this.nStartPage != other.nStartPage) return false
        if (this.pStartPage != other.pStartPage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nStartPage.hashCode()
        result = 31 * result + this.pStartPage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nStartPage: UInt = 0u,
            pStartPage: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV11 =
            PropsheetheaderwV11(
                nStartPage = nStartPage,
                pStartPageCtorArg = pStartPage,
            )
    }
}

public class PropsheetheaderwV12 internal constructor(
    ppspCtorArg: MutPtr,
    phpageCtorArg: MutPtr,
) {
    public var ppsp: MutPtr = ppspCtorArg
        internal set

    public var phpage: MutPtr = phpageCtorArg
        internal set

    public constructor() : this(
        ppspCtorArg = MutPtr(0L),
        phpageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.ppsp

    public operator fun component2(): MutPtr = this.phpage

    public fun copy(ppsp: MutPtr = this.ppsp, phpage: MutPtr = this.phpage): PropsheetheaderwV12 = PropsheetheaderwV12(ppspCtorArg = ppsp, phpageCtorArg = phpage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV12) return false
        if (this.ppsp != other.ppsp) return false
        if (this.phpage != other.phpage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ppsp.hashCode()
        result = 31 * result + this.phpage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ppsp: MutPtr = MutPtr(0L),
            phpage: MutPtr = MutPtr(0L),
        ): PropsheetheaderwV12 =
            PropsheetheaderwV12(
                ppspCtorArg = ppsp,
                phpageCtorArg = phpage,
            )
    }
}

public class PropsheetheaderwV2 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetheaderwV20,
    pszCaptionCtorArg: Pcwstr,
    public var nPages: UInt,
    public var anonymous2: PropsheetheaderwV21,
    public var anonymous3: PropsheetheaderwV22,
    public var pfnCallback: Pfnpropsheetcallback,
    public var anonymous4: PropsheetheaderwV23,
    hplWatermarkCtorArg: Hpalette,
    public var anonymous5: PropsheetheaderwV24,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszCaption: Pcwstr = pszCaptionCtorArg
        internal set

    public var hplWatermark: Hpalette = hplWatermarkCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetheaderwV20(),
        pszCaptionCtorArg = ConstPtr(0L),
        nPages = 0u,
        anonymous2 = PropsheetheaderwV21(),
        anonymous3 = PropsheetheaderwV22(),
        pfnCallback = null,
        anonymous4 = PropsheetheaderwV23(),
        hplWatermarkCtorArg = MutPtr(0L),
        anonymous5 = PropsheetheaderwV24(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Hinstance = this.hInstance

    public operator fun component5(): PropsheetheaderwV20 = this.anonymous1

    public operator fun component6(): Pcwstr = this.pszCaption

    public operator fun component7(): UInt = this.nPages

    public operator fun component8(): PropsheetheaderwV21 = this.anonymous2

    public operator fun component9(): PropsheetheaderwV22 = this.anonymous3

    public operator fun component10(): Pfnpropsheetcallback = this.pfnCallback

    public operator fun component11(): PropsheetheaderwV23 = this.anonymous4

    public operator fun component12(): Hpalette = this.hplWatermark

    public operator fun component13(): PropsheetheaderwV24 = this.anonymous5

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetheaderwV20 = this.anonymous1, pszCaption: Pcwstr = this.pszCaption, nPages: UInt = this.nPages, anonymous2: PropsheetheaderwV21 = this.anonymous2, anonymous3: PropsheetheaderwV22 = this.anonymous3, pfnCallback: Pfnpropsheetcallback = this.pfnCallback, anonymous4: PropsheetheaderwV23 = this.anonymous4, hplWatermark: Hpalette = this.hplWatermark, anonymous5: PropsheetheaderwV24 = this.anonymous5): PropsheetheaderwV2 = PropsheetheaderwV2(dwSize = dwSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, pszCaptionCtorArg = pszCaption, nPages = nPages, anonymous2 = anonymous2, anonymous3 = anonymous3, pfnCallback = pfnCallback, anonymous4 = anonymous4, hplWatermarkCtorArg = hplWatermark, anonymous5 = anonymous5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pszCaption != other.pszCaption) return false
        if (this.nPages != other.nPages) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.anonymous4 != other.anonymous4) return false
        if (this.hplWatermark != other.hplWatermark) return false
        if (this.anonymous5 != other.anonymous5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pszCaption.hashCode()
        result = 31 * result + this.nPages.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.anonymous4.hashCode()
        result = 31 * result + this.hplWatermark.hashCode()
        result = 31 * result + this.anonymous5.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetheaderwV20 = PropsheetheaderwV20(),
            pszCaption: Pcwstr = ConstPtr(0L),
            nPages: UInt = 0u,
            anonymous2: PropsheetheaderwV21 = PropsheetheaderwV21(),
            anonymous3: PropsheetheaderwV22 = PropsheetheaderwV22(),
            pfnCallback: Pfnpropsheetcallback = null,
            anonymous4: PropsheetheaderwV23 = PropsheetheaderwV23(),
            hplWatermark: Hpalette = MutPtr(0L),
            anonymous5: PropsheetheaderwV24 = PropsheetheaderwV24(),
        ): PropsheetheaderwV2 =
            PropsheetheaderwV2(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                pszCaptionCtorArg = pszCaption,
                nPages = nPages,
                anonymous2 = anonymous2,
                anonymous3 = anonymous3,
                pfnCallback = pfnCallback,
                anonymous4 = anonymous4,
                hplWatermarkCtorArg = hplWatermark,
                anonymous5 = anonymous5,
            )
    }
}

public class PropsheetheaderwV20 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): PropsheetheaderwV20 = PropsheetheaderwV20(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV20) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV20 =
            PropsheetheaderwV20(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetheaderwV21 internal constructor(
    public var nStartPage: UInt,
    pStartPageCtorArg: Pcwstr,
) {
    public var pStartPage: Pcwstr = pStartPageCtorArg
        internal set

    public constructor() : this(
        nStartPage = 0u,
        pStartPageCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.nStartPage

    public operator fun component2(): Pcwstr = this.pStartPage

    public fun copy(nStartPage: UInt = this.nStartPage, pStartPage: Pcwstr = this.pStartPage): PropsheetheaderwV21 = PropsheetheaderwV21(nStartPage = nStartPage, pStartPageCtorArg = pStartPage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV21) return false
        if (this.nStartPage != other.nStartPage) return false
        if (this.pStartPage != other.pStartPage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nStartPage.hashCode()
        result = 31 * result + this.pStartPage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nStartPage: UInt = 0u,
            pStartPage: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV21 =
            PropsheetheaderwV21(
                nStartPage = nStartPage,
                pStartPageCtorArg = pStartPage,
            )
    }
}

public class PropsheetheaderwV22 internal constructor(
    ppspCtorArg: MutPtr,
    phpageCtorArg: MutPtr,
) {
    public var ppsp: MutPtr = ppspCtorArg
        internal set

    public var phpage: MutPtr = phpageCtorArg
        internal set

    public constructor() : this(
        ppspCtorArg = MutPtr(0L),
        phpageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.ppsp

    public operator fun component2(): MutPtr = this.phpage

    public fun copy(ppsp: MutPtr = this.ppsp, phpage: MutPtr = this.phpage): PropsheetheaderwV22 = PropsheetheaderwV22(ppspCtorArg = ppsp, phpageCtorArg = phpage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV22) return false
        if (this.ppsp != other.ppsp) return false
        if (this.phpage != other.phpage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ppsp.hashCode()
        result = 31 * result + this.phpage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ppsp: MutPtr = MutPtr(0L),
            phpage: MutPtr = MutPtr(0L),
        ): PropsheetheaderwV22 =
            PropsheetheaderwV22(
                ppspCtorArg = ppsp,
                phpageCtorArg = phpage,
            )
    }
}

public class PropsheetheaderwV23 internal constructor(
    hbmWatermarkCtorArg: Hbitmap,
    pszbmWatermarkCtorArg: Pcwstr,
) {
    public var hbmWatermark: Hbitmap = hbmWatermarkCtorArg
        internal set

    public var pszbmWatermark: Pcwstr = pszbmWatermarkCtorArg
        internal set

    public constructor() : this(
        hbmWatermarkCtorArg = MutPtr(0L),
        pszbmWatermarkCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmWatermark

    public operator fun component2(): Pcwstr = this.pszbmWatermark

    public fun copy(hbmWatermark: Hbitmap = this.hbmWatermark, pszbmWatermark: Pcwstr = this.pszbmWatermark): PropsheetheaderwV23 = PropsheetheaderwV23(hbmWatermarkCtorArg = hbmWatermark, pszbmWatermarkCtorArg = pszbmWatermark)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV23) return false
        if (this.hbmWatermark != other.hbmWatermark) return false
        if (this.pszbmWatermark != other.pszbmWatermark) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmWatermark.hashCode()
        result = 31 * result + this.pszbmWatermark.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmWatermark: Hbitmap = MutPtr(0L),
            pszbmWatermark: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV23 =
            PropsheetheaderwV23(
                hbmWatermarkCtorArg = hbmWatermark,
                pszbmWatermarkCtorArg = pszbmWatermark,
            )
    }
}

public class PropsheetheaderwV24 internal constructor(
    hbmHeaderCtorArg: Hbitmap,
    pszbmHeaderCtorArg: Pcwstr,
) {
    public var hbmHeader: Hbitmap = hbmHeaderCtorArg
        internal set

    public var pszbmHeader: Pcwstr = pszbmHeaderCtorArg
        internal set

    public constructor() : this(
        hbmHeaderCtorArg = MutPtr(0L),
        pszbmHeaderCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmHeader

    public operator fun component2(): Pcwstr = this.pszbmHeader

    public fun copy(hbmHeader: Hbitmap = this.hbmHeader, pszbmHeader: Pcwstr = this.pszbmHeader): PropsheetheaderwV24 = PropsheetheaderwV24(hbmHeaderCtorArg = hbmHeader, pszbmHeaderCtorArg = pszbmHeader)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetheaderwV24) return false
        if (this.hbmHeader != other.hbmHeader) return false
        if (this.pszbmHeader != other.pszbmHeader) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmHeader.hashCode()
        result = 31 * result + this.pszbmHeader.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmHeader: Hbitmap = MutPtr(0L),
            pszbmHeader: Pcwstr = ConstPtr(0L),
        ): PropsheetheaderwV24 =
            PropsheetheaderwV24(
                hbmHeaderCtorArg = hbmHeader,
                pszbmHeaderCtorArg = pszbmHeader,
            )
    }
}

public class Propsheetpagea internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: Propsheetpagea0,
    public var anonymous2: Propsheetpagea1,
    pszTitleCtorArg: Pcstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbacka,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcstr,
    pszHeaderSubTitleCtorArg: Pcstr,
    hActCtxCtorArg: Handle,
    public var anonymous3: Propsheetpagea2,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcstr = pszHeaderSubTitleCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = Propsheetpagea0(),
        anonymous2 = Propsheetpagea1(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
        hActCtxCtorArg = MutPtr(0L),
        anonymous3 = Propsheetpagea2(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): Propsheetpagea0 = this.anonymous1

    public operator fun component5(): Propsheetpagea1 = this.anonymous2

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbacka = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcstr = this.pszHeaderTitle

    public operator fun component12(): Pcstr = this.pszHeaderSubTitle

    public operator fun component13(): Handle = this.hActCtx

    public operator fun component14(): Propsheetpagea2 = this.anonymous3

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: Propsheetpagea0 = this.anonymous1, anonymous2: Propsheetpagea1 = this.anonymous2, pszTitle: Pcstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbacka = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcstr = this.pszHeaderSubTitle, hActCtx: Handle = this.hActCtx, anonymous3: Propsheetpagea2 = this.anonymous3): Propsheetpagea = Propsheetpagea(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle, hActCtxCtorArg = hActCtx, anonymous3 = anonymous3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagea) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        if (this.hActCtx != other.hActCtx) return false
        if (this.anonymous3 != other.anonymous3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: Propsheetpagea0 = Propsheetpagea0(),
            anonymous2: Propsheetpagea1 = Propsheetpagea1(),
            pszTitle: Pcstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbacka = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcstr = ConstPtr(0L),
            hActCtx: Handle = MutPtr(0L),
            anonymous3: Propsheetpagea2 = Propsheetpagea2(),
        ): Propsheetpagea =
            Propsheetpagea(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
                hActCtxCtorArg = hActCtx,
                anonymous3 = anonymous3,
            )
    }
}

public class Propsheetpagea0 internal constructor(
    pszTemplateCtorArg: Pcstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcstr = this.pszTemplate, pResource: MutPtr = this.pResource): Propsheetpagea0 = Propsheetpagea0(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagea0) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): Propsheetpagea0 =
            Propsheetpagea0(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class Propsheetpagea1 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): Propsheetpagea1 = Propsheetpagea1(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagea1) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): Propsheetpagea1 =
            Propsheetpagea1(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class Propsheetpagea2 internal constructor(
    hbmHeaderCtorArg: Hbitmap,
    pszbmHeaderCtorArg: Pcstr,
) {
    public var hbmHeader: Hbitmap = hbmHeaderCtorArg
        internal set

    public var pszbmHeader: Pcstr = pszbmHeaderCtorArg
        internal set

    public constructor() : this(
        hbmHeaderCtorArg = MutPtr(0L),
        pszbmHeaderCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmHeader

    public operator fun component2(): Pcstr = this.pszbmHeader

    public fun copy(hbmHeader: Hbitmap = this.hbmHeader, pszbmHeader: Pcstr = this.pszbmHeader): Propsheetpagea2 = Propsheetpagea2(hbmHeaderCtorArg = hbmHeader, pszbmHeaderCtorArg = pszbmHeader)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagea2) return false
        if (this.hbmHeader != other.hbmHeader) return false
        if (this.pszbmHeader != other.pszbmHeader) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmHeader.hashCode()
        result = 31 * result + this.pszbmHeader.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmHeader: Hbitmap = MutPtr(0L),
            pszbmHeader: Pcstr = ConstPtr(0L),
        ): Propsheetpagea2 =
            Propsheetpagea2(
                hbmHeaderCtorArg = hbmHeader,
                pszbmHeaderCtorArg = pszbmHeader,
            )
    }
}

public class PropsheetpageaV1 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpageaV10,
    public var anonymous2: PropsheetpageaV11,
    pszTitleCtorArg: Pcstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbacka,
    pcRefParentCtorArg: MutPtr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpageaV10(),
        anonymous2 = PropsheetpageaV11(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpageaV10 = this.anonymous1

    public operator fun component5(): PropsheetpageaV11 = this.anonymous2

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbacka = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpageaV10 = this.anonymous1, anonymous2: PropsheetpageaV11 = this.anonymous2, pszTitle: Pcstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbacka = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent): PropsheetpageaV1 = PropsheetpageaV1(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpageaV10 = PropsheetpageaV10(),
            anonymous2: PropsheetpageaV11 = PropsheetpageaV11(),
            pszTitle: Pcstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbacka = null,
            pcRefParent: MutPtr = MutPtr(0L),
        ): PropsheetpageaV1 =
            PropsheetpageaV1(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
            )
    }
}

public class PropsheetpageaV10 internal constructor(
    pszTemplateCtorArg: Pcstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpageaV10 = PropsheetpageaV10(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV10) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpageaV10 =
            PropsheetpageaV10(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpageaV11 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): PropsheetpageaV11 = PropsheetpageaV11(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV11) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): PropsheetpageaV11 =
            PropsheetpageaV11(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetpageaV2 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpageaV20,
    public var anonymous2: PropsheetpageaV21,
    pszTitleCtorArg: Pcstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbacka,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcstr,
    pszHeaderSubTitleCtorArg: Pcstr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcstr = pszHeaderSubTitleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpageaV20(),
        anonymous2 = PropsheetpageaV21(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpageaV20 = this.anonymous1

    public operator fun component5(): PropsheetpageaV21 = this.anonymous2

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbacka = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcstr = this.pszHeaderTitle

    public operator fun component12(): Pcstr = this.pszHeaderSubTitle

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpageaV20 = this.anonymous1, anonymous2: PropsheetpageaV21 = this.anonymous2, pszTitle: Pcstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbacka = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcstr = this.pszHeaderSubTitle): PropsheetpageaV2 = PropsheetpageaV2(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpageaV20 = PropsheetpageaV20(),
            anonymous2: PropsheetpageaV21 = PropsheetpageaV21(),
            pszTitle: Pcstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbacka = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcstr = ConstPtr(0L),
        ): PropsheetpageaV2 =
            PropsheetpageaV2(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
            )
    }
}

public class PropsheetpageaV20 internal constructor(
    pszTemplateCtorArg: Pcstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpageaV20 = PropsheetpageaV20(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV20) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpageaV20 =
            PropsheetpageaV20(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpageaV21 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): PropsheetpageaV21 = PropsheetpageaV21(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV21) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): PropsheetpageaV21 =
            PropsheetpageaV21(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetpageaV3 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpageaV30,
    public var anonymous2: PropsheetpageaV31,
    pszTitleCtorArg: Pcstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbacka,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcstr,
    pszHeaderSubTitleCtorArg: Pcstr,
    hActCtxCtorArg: Handle,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcstr = pszHeaderSubTitleCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpageaV30(),
        anonymous2 = PropsheetpageaV31(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
        hActCtxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpageaV30 = this.anonymous1

    public operator fun component5(): PropsheetpageaV31 = this.anonymous2

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbacka = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcstr = this.pszHeaderTitle

    public operator fun component12(): Pcstr = this.pszHeaderSubTitle

    public operator fun component13(): Handle = this.hActCtx

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpageaV30 = this.anonymous1, anonymous2: PropsheetpageaV31 = this.anonymous2, pszTitle: Pcstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbacka = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcstr = this.pszHeaderSubTitle, hActCtx: Handle = this.hActCtx): PropsheetpageaV3 = PropsheetpageaV3(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle, hActCtxCtorArg = hActCtx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        if (this.hActCtx != other.hActCtx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpageaV30 = PropsheetpageaV30(),
            anonymous2: PropsheetpageaV31 = PropsheetpageaV31(),
            pszTitle: Pcstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbacka = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcstr = ConstPtr(0L),
            hActCtx: Handle = MutPtr(0L),
        ): PropsheetpageaV3 =
            PropsheetpageaV3(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
                hActCtxCtorArg = hActCtx,
            )
    }
}

public class PropsheetpageaV30 internal constructor(
    pszTemplateCtorArg: Pcstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpageaV30 = PropsheetpageaV30(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV30) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpageaV30 =
            PropsheetpageaV30(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpageaV31 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcstr = this.pszIcon): PropsheetpageaV31 = PropsheetpageaV31(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpageaV31) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcstr = ConstPtr(0L),
        ): PropsheetpageaV31 =
            PropsheetpageaV31(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class Propsheetpagew internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: Propsheetpagew0,
    public var anonymous2: Propsheetpagew1,
    pszTitleCtorArg: Pcwstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbackw,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcwstr,
    pszHeaderSubTitleCtorArg: Pcwstr,
    hActCtxCtorArg: Handle,
    public var anonymous3: Propsheetpagew2,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcwstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcwstr = pszHeaderSubTitleCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = Propsheetpagew0(),
        anonymous2 = Propsheetpagew1(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
        hActCtxCtorArg = MutPtr(0L),
        anonymous3 = Propsheetpagew2(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): Propsheetpagew0 = this.anonymous1

    public operator fun component5(): Propsheetpagew1 = this.anonymous2

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbackw = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcwstr = this.pszHeaderTitle

    public operator fun component12(): Pcwstr = this.pszHeaderSubTitle

    public operator fun component13(): Handle = this.hActCtx

    public operator fun component14(): Propsheetpagew2 = this.anonymous3

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: Propsheetpagew0 = this.anonymous1, anonymous2: Propsheetpagew1 = this.anonymous2, pszTitle: Pcwstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbackw = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcwstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcwstr = this.pszHeaderSubTitle, hActCtx: Handle = this.hActCtx, anonymous3: Propsheetpagew2 = this.anonymous3): Propsheetpagew = Propsheetpagew(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle, hActCtxCtorArg = hActCtx, anonymous3 = anonymous3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagew) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        if (this.hActCtx != other.hActCtx) return false
        if (this.anonymous3 != other.anonymous3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: Propsheetpagew0 = Propsheetpagew0(),
            anonymous2: Propsheetpagew1 = Propsheetpagew1(),
            pszTitle: Pcwstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbackw = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcwstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcwstr = ConstPtr(0L),
            hActCtx: Handle = MutPtr(0L),
            anonymous3: Propsheetpagew2 = Propsheetpagew2(),
        ): Propsheetpagew =
            Propsheetpagew(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
                hActCtxCtorArg = hActCtx,
                anonymous3 = anonymous3,
            )
    }
}

public class Propsheetpagew0 internal constructor(
    pszTemplateCtorArg: Pcwstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcwstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcwstr = this.pszTemplate, pResource: MutPtr = this.pResource): Propsheetpagew0 = Propsheetpagew0(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagew0) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcwstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): Propsheetpagew0 =
            Propsheetpagew0(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class Propsheetpagew1 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): Propsheetpagew1 = Propsheetpagew1(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagew1) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): Propsheetpagew1 =
            Propsheetpagew1(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class Propsheetpagew2 internal constructor(
    hbmHeaderCtorArg: Hbitmap,
    pszbmHeaderCtorArg: Pcwstr,
) {
    public var hbmHeader: Hbitmap = hbmHeaderCtorArg
        internal set

    public var pszbmHeader: Pcwstr = pszbmHeaderCtorArg
        internal set

    public constructor() : this(
        hbmHeaderCtorArg = MutPtr(0L),
        pszbmHeaderCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbmHeader

    public operator fun component2(): Pcwstr = this.pszbmHeader

    public fun copy(hbmHeader: Hbitmap = this.hbmHeader, pszbmHeader: Pcwstr = this.pszbmHeader): Propsheetpagew2 = Propsheetpagew2(hbmHeaderCtorArg = hbmHeader, pszbmHeaderCtorArg = pszbmHeader)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propsheetpagew2) return false
        if (this.hbmHeader != other.hbmHeader) return false
        if (this.pszbmHeader != other.pszbmHeader) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbmHeader.hashCode()
        result = 31 * result + this.pszbmHeader.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbmHeader: Hbitmap = MutPtr(0L),
            pszbmHeader: Pcwstr = ConstPtr(0L),
        ): Propsheetpagew2 =
            Propsheetpagew2(
                hbmHeaderCtorArg = hbmHeader,
                pszbmHeaderCtorArg = pszbmHeader,
            )
    }
}

public class PropsheetpagewV1 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpagewV10,
    public var anonymous2: PropsheetpagewV11,
    pszTitleCtorArg: Pcwstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbackw,
    pcRefParentCtorArg: MutPtr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpagewV10(),
        anonymous2 = PropsheetpagewV11(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpagewV10 = this.anonymous1

    public operator fun component5(): PropsheetpagewV11 = this.anonymous2

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbackw = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpagewV10 = this.anonymous1, anonymous2: PropsheetpagewV11 = this.anonymous2, pszTitle: Pcwstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbackw = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent): PropsheetpagewV1 = PropsheetpagewV1(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpagewV10 = PropsheetpagewV10(),
            anonymous2: PropsheetpagewV11 = PropsheetpagewV11(),
            pszTitle: Pcwstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbackw = null,
            pcRefParent: MutPtr = MutPtr(0L),
        ): PropsheetpagewV1 =
            PropsheetpagewV1(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
            )
    }
}

public class PropsheetpagewV10 internal constructor(
    pszTemplateCtorArg: Pcwstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcwstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcwstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpagewV10 = PropsheetpagewV10(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV10) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcwstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpagewV10 =
            PropsheetpagewV10(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpagewV11 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): PropsheetpagewV11 = PropsheetpagewV11(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV11) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): PropsheetpagewV11 =
            PropsheetpagewV11(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetpagewV2 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpagewV20,
    public var anonymous2: PropsheetpagewV21,
    pszTitleCtorArg: Pcwstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbackw,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcwstr,
    pszHeaderSubTitleCtorArg: Pcwstr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcwstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcwstr = pszHeaderSubTitleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpagewV20(),
        anonymous2 = PropsheetpagewV21(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpagewV20 = this.anonymous1

    public operator fun component5(): PropsheetpagewV21 = this.anonymous2

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbackw = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcwstr = this.pszHeaderTitle

    public operator fun component12(): Pcwstr = this.pszHeaderSubTitle

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpagewV20 = this.anonymous1, anonymous2: PropsheetpagewV21 = this.anonymous2, pszTitle: Pcwstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbackw = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcwstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcwstr = this.pszHeaderSubTitle): PropsheetpagewV2 = PropsheetpagewV2(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpagewV20 = PropsheetpagewV20(),
            anonymous2: PropsheetpagewV21 = PropsheetpagewV21(),
            pszTitle: Pcwstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbackw = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcwstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcwstr = ConstPtr(0L),
        ): PropsheetpagewV2 =
            PropsheetpagewV2(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
            )
    }
}

public class PropsheetpagewV20 internal constructor(
    pszTemplateCtorArg: Pcwstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcwstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcwstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpagewV20 = PropsheetpagewV20(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV20) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcwstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpagewV20 =
            PropsheetpagewV20(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpagewV21 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): PropsheetpagewV21 = PropsheetpagewV21(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV21) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): PropsheetpagewV21 =
            PropsheetpagewV21(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public class PropsheetpagewV3 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hInstanceCtorArg: Hinstance,
    public var anonymous1: PropsheetpagewV30,
    public var anonymous2: PropsheetpagewV31,
    pszTitleCtorArg: Pcwstr,
    public var pfnDlgProc: Dlgproc,
    public var lParam: Lparam,
    public var pfnCallback: Lpfnpspcallbackw,
    pcRefParentCtorArg: MutPtr,
    pszHeaderTitleCtorArg: Pcwstr,
    pszHeaderSubTitleCtorArg: Pcwstr,
    hActCtxCtorArg: Handle,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pcRefParent: MutPtr = pcRefParentCtorArg
        internal set

    public var pszHeaderTitle: Pcwstr = pszHeaderTitleCtorArg
        internal set

    public var pszHeaderSubTitle: Pcwstr = pszHeaderSubTitleCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hInstanceCtorArg = MutPtr(0L),
        anonymous1 = PropsheetpagewV30(),
        anonymous2 = PropsheetpagewV31(),
        pszTitleCtorArg = ConstPtr(0L),
        pfnDlgProc = null,
        lParam = 0L,
        pfnCallback = null,
        pcRefParentCtorArg = MutPtr(0L),
        pszHeaderTitleCtorArg = ConstPtr(0L),
        pszHeaderSubTitleCtorArg = ConstPtr(0L),
        hActCtxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): PropsheetpagewV30 = this.anonymous1

    public operator fun component5(): PropsheetpagewV31 = this.anonymous2

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): Dlgproc = this.pfnDlgProc

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): Lpfnpspcallbackw = this.pfnCallback

    public operator fun component10(): MutPtr = this.pcRefParent

    public operator fun component11(): Pcwstr = this.pszHeaderTitle

    public operator fun component12(): Pcwstr = this.pszHeaderSubTitle

    public operator fun component13(): Handle = this.hActCtx

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hInstance: Hinstance = this.hInstance, anonymous1: PropsheetpagewV30 = this.anonymous1, anonymous2: PropsheetpagewV31 = this.anonymous2, pszTitle: Pcwstr = this.pszTitle, pfnDlgProc: Dlgproc = this.pfnDlgProc, lParam: Lparam = this.lParam, pfnCallback: Lpfnpspcallbackw = this.pfnCallback, pcRefParent: MutPtr = this.pcRefParent, pszHeaderTitle: Pcwstr = this.pszHeaderTitle, pszHeaderSubTitle: Pcwstr = this.pszHeaderSubTitle, hActCtx: Handle = this.hActCtx): PropsheetpagewV3 = PropsheetpagewV3(dwSize = dwSize, dwFlags = dwFlags, hInstanceCtorArg = hInstance, anonymous1 = anonymous1, anonymous2 = anonymous2, pszTitleCtorArg = pszTitle, pfnDlgProc = pfnDlgProc, lParam = lParam, pfnCallback = pfnCallback, pcRefParentCtorArg = pcRefParent, pszHeaderTitleCtorArg = pszHeaderTitle, pszHeaderSubTitleCtorArg = pszHeaderSubTitle, hActCtxCtorArg = hActCtx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hInstance != other.hInstance) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.pfnDlgProc != other.pfnDlgProc) return false
        if (this.lParam != other.lParam) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.pcRefParent != other.pcRefParent) return false
        if (this.pszHeaderTitle != other.pszHeaderTitle) return false
        if (this.pszHeaderSubTitle != other.pszHeaderSubTitle) return false
        if (this.hActCtx != other.hActCtx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.pfnDlgProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.pcRefParent.hashCode()
        result = 31 * result + this.pszHeaderTitle.hashCode()
        result = 31 * result + this.pszHeaderSubTitle.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hInstance: Hinstance = MutPtr(0L),
            anonymous1: PropsheetpagewV30 = PropsheetpagewV30(),
            anonymous2: PropsheetpagewV31 = PropsheetpagewV31(),
            pszTitle: Pcwstr = ConstPtr(0L),
            pfnDlgProc: Dlgproc = null,
            lParam: Lparam = 0L,
            pfnCallback: Lpfnpspcallbackw = null,
            pcRefParent: MutPtr = MutPtr(0L),
            pszHeaderTitle: Pcwstr = ConstPtr(0L),
            pszHeaderSubTitle: Pcwstr = ConstPtr(0L),
            hActCtx: Handle = MutPtr(0L),
        ): PropsheetpagewV3 =
            PropsheetpagewV3(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hInstanceCtorArg = hInstance,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pszTitleCtorArg = pszTitle,
                pfnDlgProc = pfnDlgProc,
                lParam = lParam,
                pfnCallback = pfnCallback,
                pcRefParentCtorArg = pcRefParent,
                pszHeaderTitleCtorArg = pszHeaderTitle,
                pszHeaderSubTitleCtorArg = pszHeaderSubTitle,
                hActCtxCtorArg = hActCtx,
            )
    }
}

public class PropsheetpagewV30 internal constructor(
    pszTemplateCtorArg: Pcwstr,
    pResourceCtorArg: MutPtr,
) {
    public var pszTemplate: Pcwstr = pszTemplateCtorArg
        internal set

    public var pResource: MutPtr = pResourceCtorArg
        internal set

    public constructor() : this(
        pszTemplateCtorArg = ConstPtr(0L),
        pResourceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszTemplate

    public operator fun component2(): MutPtr = this.pResource

    public fun copy(pszTemplate: Pcwstr = this.pszTemplate, pResource: MutPtr = this.pResource): PropsheetpagewV30 = PropsheetpagewV30(pszTemplateCtorArg = pszTemplate, pResourceCtorArg = pResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV30) return false
        if (this.pszTemplate != other.pszTemplate) return false
        if (this.pResource != other.pResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTemplate.hashCode()
        result = 31 * result + this.pResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTemplate: Pcwstr = ConstPtr(0L),
            pResource: MutPtr = MutPtr(0L),
        ): PropsheetpagewV30 =
            PropsheetpagewV30(
                pszTemplateCtorArg = pszTemplate,
                pResourceCtorArg = pResource,
            )
    }
}

public class PropsheetpagewV31 internal constructor(
    hIconCtorArg: Hicon,
    pszIconCtorArg: Pcwstr,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pszIcon: Pcwstr = pszIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        pszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Pcwstr = this.pszIcon

    public fun copy(hIcon: Hicon = this.hIcon, pszIcon: Pcwstr = this.pszIcon): PropsheetpagewV31 = PropsheetpagewV31(hIconCtorArg = hIcon, pszIconCtorArg = pszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetpagewV31) return false
        if (this.hIcon != other.hIcon) return false
        if (this.pszIcon != other.pszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            pszIcon: Pcwstr = ConstPtr(0L),
        ): PropsheetpagewV31 =
            PropsheetpagewV31(
                hIconCtorArg = hIcon,
                pszIconCtorArg = pszIcon,
            )
    }
}

public data class Pshnotify(
    public var hdr: Nmhdr = Nmhdr(),
    public var lParam: Lparam = 0L,
)

public data class Rbhittestinfo(
    public var pt: Point = Point(),
    public var flags: UInt = 0u,
    public var iBand: Int = 0,
)

public class Rebarbandinfoa internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    public var fStyle: UInt,
    public var clrFore: Colorref,
    public var clrBack: Colorref,
    lpTextCtorArg: Pstr,
    public var cch: UInt,
    public var iImage: Int,
    hwndChildCtorArg: Hwnd,
    public var cxMinChild: UInt,
    public var cyMinChild: UInt,
    public var cx: UInt,
    hbmBackCtorArg: Hbitmap,
    public var wID: UInt,
    public var cyChild: UInt,
    public var cyMaxChild: UInt,
    public var cyIntegral: UInt,
    public var cxIdeal: UInt,
    public var lParam: Lparam,
    public var cxHeader: UInt,
    public var rcChevronLocation: Rect,
    public var uChevronState: UInt,
) {
    public var lpText: Pstr = lpTextCtorArg
        internal set

    public var hwndChild: Hwnd = hwndChildCtorArg
        internal set

    public var hbmBack: Hbitmap = hbmBackCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        fStyle = 0u,
        clrFore = 0u,
        clrBack = 0u,
        lpTextCtorArg = MutPtr(0L),
        cch = 0u,
        iImage = 0,
        hwndChildCtorArg = MutPtr(0L),
        cxMinChild = 0u,
        cyMinChild = 0u,
        cx = 0u,
        hbmBackCtorArg = MutPtr(0L),
        wID = 0u,
        cyChild = 0u,
        cyMaxChild = 0u,
        cyIntegral = 0u,
        cxIdeal = 0u,
        lParam = 0L,
        cxHeader = 0u,
        rcChevronLocation = Rect(),
        uChevronState = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            fStyle: UInt = 0u,
            clrFore: Colorref = 0u,
            clrBack: Colorref = 0u,
            lpText: Pstr = MutPtr(0L),
            cch: UInt = 0u,
            iImage: Int = 0,
            hwndChild: Hwnd = MutPtr(0L),
            cxMinChild: UInt = 0u,
            cyMinChild: UInt = 0u,
            cx: UInt = 0u,
            hbmBack: Hbitmap = MutPtr(0L),
            wID: UInt = 0u,
            cyChild: UInt = 0u,
            cyMaxChild: UInt = 0u,
            cyIntegral: UInt = 0u,
            cxIdeal: UInt = 0u,
            lParam: Lparam = 0L,
            cxHeader: UInt = 0u,
            rcChevronLocation: Rect = Rect(),
            uChevronState: UInt = 0u,
        ): Rebarbandinfoa =
            Rebarbandinfoa(
                cbSize = cbSize,
                fMask = fMask,
                fStyle = fStyle,
                clrFore = clrFore,
                clrBack = clrBack,
                lpTextCtorArg = lpText,
                cch = cch,
                iImage = iImage,
                hwndChildCtorArg = hwndChild,
                cxMinChild = cxMinChild,
                cyMinChild = cyMinChild,
                cx = cx,
                hbmBackCtorArg = hbmBack,
                wID = wID,
                cyChild = cyChild,
                cyMaxChild = cyMaxChild,
                cyIntegral = cyIntegral,
                cxIdeal = cxIdeal,
                lParam = lParam,
                cxHeader = cxHeader,
                rcChevronLocation = rcChevronLocation,
                uChevronState = uChevronState,
            )
    }
}

public class Rebarbandinfow internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    public var fStyle: UInt,
    public var clrFore: Colorref,
    public var clrBack: Colorref,
    lpTextCtorArg: Pwstr,
    public var cch: UInt,
    public var iImage: Int,
    hwndChildCtorArg: Hwnd,
    public var cxMinChild: UInt,
    public var cyMinChild: UInt,
    public var cx: UInt,
    hbmBackCtorArg: Hbitmap,
    public var wID: UInt,
    public var cyChild: UInt,
    public var cyMaxChild: UInt,
    public var cyIntegral: UInt,
    public var cxIdeal: UInt,
    public var lParam: Lparam,
    public var cxHeader: UInt,
    public var rcChevronLocation: Rect,
    public var uChevronState: UInt,
) {
    public var lpText: Pwstr = lpTextCtorArg
        internal set

    public var hwndChild: Hwnd = hwndChildCtorArg
        internal set

    public var hbmBack: Hbitmap = hbmBackCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        fStyle = 0u,
        clrFore = 0u,
        clrBack = 0u,
        lpTextCtorArg = MutPtr(0L),
        cch = 0u,
        iImage = 0,
        hwndChildCtorArg = MutPtr(0L),
        cxMinChild = 0u,
        cyMinChild = 0u,
        cx = 0u,
        hbmBackCtorArg = MutPtr(0L),
        wID = 0u,
        cyChild = 0u,
        cyMaxChild = 0u,
        cyIntegral = 0u,
        cxIdeal = 0u,
        lParam = 0L,
        cxHeader = 0u,
        rcChevronLocation = Rect(),
        uChevronState = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            fStyle: UInt = 0u,
            clrFore: Colorref = 0u,
            clrBack: Colorref = 0u,
            lpText: Pwstr = MutPtr(0L),
            cch: UInt = 0u,
            iImage: Int = 0,
            hwndChild: Hwnd = MutPtr(0L),
            cxMinChild: UInt = 0u,
            cyMinChild: UInt = 0u,
            cx: UInt = 0u,
            hbmBack: Hbitmap = MutPtr(0L),
            wID: UInt = 0u,
            cyChild: UInt = 0u,
            cyMaxChild: UInt = 0u,
            cyIntegral: UInt = 0u,
            cxIdeal: UInt = 0u,
            lParam: Lparam = 0L,
            cxHeader: UInt = 0u,
            rcChevronLocation: Rect = Rect(),
            uChevronState: UInt = 0u,
        ): Rebarbandinfow =
            Rebarbandinfow(
                cbSize = cbSize,
                fMask = fMask,
                fStyle = fStyle,
                clrFore = clrFore,
                clrBack = clrBack,
                lpTextCtorArg = lpText,
                cch = cch,
                iImage = iImage,
                hwndChildCtorArg = hwndChild,
                cxMinChild = cxMinChild,
                cyMinChild = cyMinChild,
                cx = cx,
                hbmBackCtorArg = hbmBack,
                wID = wID,
                cyChild = cyChild,
                cyMaxChild = cyMaxChild,
                cyIntegral = cyIntegral,
                cxIdeal = cxIdeal,
                lParam = lParam,
                cxHeader = cxHeader,
                rcChevronLocation = rcChevronLocation,
                uChevronState = uChevronState,
            )
    }
}

public data class Rebarinfo(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var himl: Himagelist = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rebarinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rebarinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rebarinfo =
                    Rebarinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rebarinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.himl)
                }
            }
    }
}

public class Taskdialogconfig internal constructor(
    public var cbSize: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var dwFlags: TaskdialogFlags,
    public var dwCommonButtons: TaskdialogCommonButtonFlags,
    pszWindowTitleCtorArg: Pcwstr,
    public var anonymous1: Taskdialogconfig0,
    pszMainInstructionCtorArg: Pcwstr,
    pszContentCtorArg: Pcwstr,
    public var cButtons: UInt,
    pButtonsCtorArg: ConstPtr,
    public var nDefaultButton: Int,
    public var cRadioButtons: UInt,
    pRadioButtonsCtorArg: ConstPtr,
    public var nDefaultRadioButton: Int,
    pszVerificationTextCtorArg: Pcwstr,
    pszExpandedInformationCtorArg: Pcwstr,
    pszExpandedControlTextCtorArg: Pcwstr,
    pszCollapsedControlTextCtorArg: Pcwstr,
    public var anonymous2: Taskdialogconfig1,
    pszFooterCtorArg: Pcwstr,
    public var pfCallback: Pftaskdialogcallback,
    public var lpCallbackData: Int,
    public var cxWidth: UInt,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszWindowTitle: Pcwstr = pszWindowTitleCtorArg
        internal set

    public var pszMainInstruction: Pcwstr = pszMainInstructionCtorArg
        internal set

    public var pszContent: Pcwstr = pszContentCtorArg
        internal set

    public var pButtons: ConstPtr = pButtonsCtorArg
        internal set

    public var pRadioButtons: ConstPtr = pRadioButtonsCtorArg
        internal set

    public var pszVerificationText: Pcwstr = pszVerificationTextCtorArg
        internal set

    public var pszExpandedInformation: Pcwstr = pszExpandedInformationCtorArg
        internal set

    public var pszExpandedControlText: Pcwstr = pszExpandedControlTextCtorArg
        internal set

    public var pszCollapsedControlText: Pcwstr = pszCollapsedControlTextCtorArg
        internal set

    public var pszFooter: Pcwstr = pszFooterCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        dwFlags = 0,
        dwCommonButtons = 0,
        pszWindowTitleCtorArg = ConstPtr(0L),
        anonymous1 = Taskdialogconfig0(),
        pszMainInstructionCtorArg = ConstPtr(0L),
        pszContentCtorArg = ConstPtr(0L),
        cButtons = 0u,
        pButtonsCtorArg = ConstPtr(0L),
        nDefaultButton = 0,
        cRadioButtons = 0u,
        pRadioButtonsCtorArg = ConstPtr(0L),
        nDefaultRadioButton = 0,
        pszVerificationTextCtorArg = ConstPtr(0L),
        pszExpandedInformationCtorArg = ConstPtr(0L),
        pszExpandedControlTextCtorArg = ConstPtr(0L),
        pszCollapsedControlTextCtorArg = ConstPtr(0L),
        anonymous2 = Taskdialogconfig1(),
        pszFooterCtorArg = ConstPtr(0L),
        pfCallback = null,
        lpCallbackData = 0,
        cxWidth = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            dwFlags: TaskdialogFlags = 0,
            dwCommonButtons: TaskdialogCommonButtonFlags = 0,
            pszWindowTitle: Pcwstr = ConstPtr(0L),
            anonymous1: Taskdialogconfig0 = Taskdialogconfig0(),
            pszMainInstruction: Pcwstr = ConstPtr(0L),
            pszContent: Pcwstr = ConstPtr(0L),
            cButtons: UInt = 0u,
            pButtons: ConstPtr = ConstPtr(0L),
            nDefaultButton: Int = 0,
            cRadioButtons: UInt = 0u,
            pRadioButtons: ConstPtr = ConstPtr(0L),
            nDefaultRadioButton: Int = 0,
            pszVerificationText: Pcwstr = ConstPtr(0L),
            pszExpandedInformation: Pcwstr = ConstPtr(0L),
            pszExpandedControlText: Pcwstr = ConstPtr(0L),
            pszCollapsedControlText: Pcwstr = ConstPtr(0L),
            anonymous2: Taskdialogconfig1 = Taskdialogconfig1(),
            pszFooter: Pcwstr = ConstPtr(0L),
            pfCallback: Pftaskdialogcallback = null,
            lpCallbackData: Int = 0,
            cxWidth: UInt = 0u,
        ): Taskdialogconfig =
            Taskdialogconfig(
                cbSize = cbSize,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                dwFlags = dwFlags,
                dwCommonButtons = dwCommonButtons,
                pszWindowTitleCtorArg = pszWindowTitle,
                anonymous1 = anonymous1,
                pszMainInstructionCtorArg = pszMainInstruction,
                pszContentCtorArg = pszContent,
                cButtons = cButtons,
                pButtonsCtorArg = pButtons,
                nDefaultButton = nDefaultButton,
                cRadioButtons = cRadioButtons,
                pRadioButtonsCtorArg = pRadioButtons,
                nDefaultRadioButton = nDefaultRadioButton,
                pszVerificationTextCtorArg = pszVerificationText,
                pszExpandedInformationCtorArg = pszExpandedInformation,
                pszExpandedControlTextCtorArg = pszExpandedControlText,
                pszCollapsedControlTextCtorArg = pszCollapsedControlText,
                anonymous2 = anonymous2,
                pszFooterCtorArg = pszFooter,
                pfCallback = pfCallback,
                lpCallbackData = lpCallbackData,
                cxWidth = cxWidth,
            )
    }
}

public class Taskdialogconfig0 internal constructor(
    hMainIconCtorArg: Hicon,
    pszMainIconCtorArg: Pcwstr,
) {
    public var hMainIcon: Hicon = hMainIconCtorArg
        internal set

    public var pszMainIcon: Pcwstr = pszMainIconCtorArg
        internal set

    public constructor() : this(
        hMainIconCtorArg = MutPtr(0L),
        pszMainIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hMainIcon

    public operator fun component2(): Pcwstr = this.pszMainIcon

    public fun copy(hMainIcon: Hicon = this.hMainIcon, pszMainIcon: Pcwstr = this.pszMainIcon): Taskdialogconfig0 = Taskdialogconfig0(hMainIconCtorArg = hMainIcon, pszMainIconCtorArg = pszMainIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Taskdialogconfig0) return false
        if (this.hMainIcon != other.hMainIcon) return false
        if (this.pszMainIcon != other.pszMainIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hMainIcon.hashCode()
        result = 31 * result + this.pszMainIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hMainIcon: Hicon = MutPtr(0L),
            pszMainIcon: Pcwstr = ConstPtr(0L),
        ): Taskdialogconfig0 =
            Taskdialogconfig0(
                hMainIconCtorArg = hMainIcon,
                pszMainIconCtorArg = pszMainIcon,
            )
    }
}

public class Taskdialogconfig1 internal constructor(
    hFooterIconCtorArg: Hicon,
    pszFooterIconCtorArg: Pcwstr,
) {
    public var hFooterIcon: Hicon = hFooterIconCtorArg
        internal set

    public var pszFooterIcon: Pcwstr = pszFooterIconCtorArg
        internal set

    public constructor() : this(
        hFooterIconCtorArg = MutPtr(0L),
        pszFooterIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hicon = this.hFooterIcon

    public operator fun component2(): Pcwstr = this.pszFooterIcon

    public fun copy(hFooterIcon: Hicon = this.hFooterIcon, pszFooterIcon: Pcwstr = this.pszFooterIcon): Taskdialogconfig1 = Taskdialogconfig1(hFooterIconCtorArg = hFooterIcon, pszFooterIconCtorArg = pszFooterIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Taskdialogconfig1) return false
        if (this.hFooterIcon != other.hFooterIcon) return false
        if (this.pszFooterIcon != other.pszFooterIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hFooterIcon.hashCode()
        result = 31 * result + this.pszFooterIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hFooterIcon: Hicon = MutPtr(0L),
            pszFooterIcon: Pcwstr = ConstPtr(0L),
        ): Taskdialogconfig1 =
            Taskdialogconfig1(
                hFooterIconCtorArg = hFooterIcon,
                pszFooterIconCtorArg = pszFooterIcon,
            )
    }
}

public class TaskdialogButton internal constructor(
    public var nButtonID: Int,
    pszButtonTextCtorArg: Pcwstr,
) {
    public var pszButtonText: Pcwstr = pszButtonTextCtorArg
        internal set

    public constructor() : this(
        nButtonID = 0,
        pszButtonTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.nButtonID

    public operator fun component2(): Pcwstr = this.pszButtonText

    public fun copy(nButtonID: Int = this.nButtonID, pszButtonText: Pcwstr = this.pszButtonText): TaskdialogButton = TaskdialogButton(nButtonID = nButtonID, pszButtonTextCtorArg = pszButtonText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TaskdialogButton) return false
        if (this.nButtonID != other.nButtonID) return false
        if (this.pszButtonText != other.pszButtonText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nButtonID.hashCode()
        result = 31 * result + this.pszButtonText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nButtonID: Int = 0,
            pszButtonText: Pcwstr = ConstPtr(0L),
        ): TaskdialogButton =
            TaskdialogButton(
                nButtonID = nButtonID,
                pszButtonTextCtorArg = pszButtonText,
            )
    }
}

public data class TaCubicBezier(
    public var header: TaTimingfunction = TaTimingfunction(),
    public var rX0: Float = 0.0f,
    public var rY0: Float = 0.0f,
    public var rX1: Float = 0.0f,
    public var rY1: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaCubicBezier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaCubicBezier> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): TaCubicBezier =
                    TaCubicBezier(
                        (TaTimingfunction.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TaCubicBezier) {
                    (TaTimingfunction.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.rX0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.rY0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.rX1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.rY1)
                }
            }
    }
}

public data class TaTimingfunction(
    public var eTimingFunctionType: TaTimingfunctionType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTimingfunction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTimingfunction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TaTimingfunction =
                    TaTimingfunction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TaTimingfunction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eTimingFunctionType)
                }
            }
    }
}

public data class TaTransform(
    public var eTransformType: TaTransformType = 0,
    public var dwTimingFunctionId: UInt = 0u,
    public var dwStartTime: UInt = 0u,
    public var dwDurationTime: UInt = 0u,
    public var eFlags: TaTransformFlag = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): TaTransform =
                    TaTransform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TaTransform) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eTransformType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTimingFunctionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDurationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.eFlags)
                }
            }
    }
}

public data class TaTransform2d(
    public var header: TaTransform = TaTransform(),
    public var rX: Float = 0.0f,
    public var rY: Float = 0.0f,
    public var rInitialX: Float = 0.0f,
    public var rInitialY: Float = 0.0f,
    public var rOriginX: Float = 0.0f,
    public var rOriginY: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransform2d> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransform2d> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): TaTransform2d =
                    TaTransform2d(
                        (TaTransform.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: TaTransform2d) {
                    (TaTransform.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.rX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 24L, value.rY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.rInitialX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.rInitialY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 36L, value.rOriginX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 40L, value.rOriginY)
                }
            }
    }
}

public data class TaTransformClip(
    public var header: TaTransform = TaTransform(),
    public var rLeft: Float = 0.0f,
    public var rTop: Float = 0.0f,
    public var rRight: Float = 0.0f,
    public var rBottom: Float = 0.0f,
    public var rInitialLeft: Float = 0.0f,
    public var rInitialTop: Float = 0.0f,
    public var rInitialRight: Float = 0.0f,
    public var rInitialBottom: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransformClip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransformClip> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): TaTransformClip =
                    TaTransformClip(
                        (TaTransform.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: TaTransformClip) {
                    (TaTransform.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.rLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 24L, value.rTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.rRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.rBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 36L, value.rInitialLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 40L, value.rInitialTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 44L, value.rInitialRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.rInitialBottom)
                }
            }
    }
}

public data class TaTransformOpacity(
    public var header: TaTransform = TaTransform(),
    public var rOpacity: Float = 0.0f,
    public var rInitialOpacity: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransformOpacity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaTransformOpacity> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): TaTransformOpacity =
                    TaTransformOpacity(
                        (TaTransform.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TaTransformOpacity) {
                    (TaTransform.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.rOpacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 24L, value.rInitialOpacity)
                }
            }
    }
}

public class Tbaddbitmap internal constructor(
    hInstCtorArg: Hinstance,
    public var nID: Int,
) {
    public var hInst: Hinstance = hInstCtorArg
        internal set

    public constructor() : this(
        hInstCtorArg = MutPtr(0L),
        nID = 0,
    )

    public operator fun component1(): Hinstance = this.hInst

    public operator fun component2(): Int = this.nID

    public fun copy(hInst: Hinstance = this.hInst, nID: Int = this.nID): Tbaddbitmap = Tbaddbitmap(hInstCtorArg = hInst, nID = nID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbaddbitmap) return false
        if (this.hInst != other.hInst) return false
        if (this.nID != other.nID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInst.hashCode()
        result = 31 * result + this.nID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInst: Hinstance = MutPtr(0L),
            nID: Int = 0,
        ): Tbaddbitmap =
            Tbaddbitmap(
                hInstCtorArg = hInst,
                nID = nID,
            )
    }
}

public data class Tbbutton(
    public var iBitmap: Int = 0,
    public var idCommand: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(6),
    public var dwData: Int = 0,
    public var iString: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbbutton) return false
        if (this.iBitmap != other.iBitmap) return false
        if (this.idCommand != other.idCommand) return false
        if (this.fsState != other.fsState) return false
        if (this.fsStyle != other.fsStyle) return false
        if (!this.bReserved.contentEquals(other.bReserved)) return false
        if (this.dwData != other.dwData) return false
        if (this.iString != other.iString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iBitmap.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.fsState.hashCode()
        result = 31 * result + this.fsStyle.hashCode()
        result = 31 * result + this.bReserved.contentHashCode()
        result = 31 * result + this.dwData.hashCode()
        result = 31 * result + this.iString.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbbutton> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbbutton> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Tbbutton =
                    Tbbutton(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Tbbutton) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iBitmap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.idCommand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.fsState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.fsStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.bReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.iString)
                }
            }
    }
}

public class Tbbuttoninfoa internal constructor(
    public var cbSize: UInt,
    public var dwMask: TbbuttoninfowMask,
    public var idCommand: Int,
    public var iImage: Int,
    public var fsState: UByte,
    public var fsStyle: UByte,
    public var cx: UShort,
    public var lParam: Int,
    pszTextCtorArg: Pstr,
    public var cchText: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMask = 0u,
        idCommand = 0,
        iImage = 0,
        fsState = 0u,
        fsStyle = 0u,
        cx = 0u,
        lParam = 0,
        pszTextCtorArg = MutPtr(0L),
        cchText = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): TbbuttoninfowMask = this.dwMask

    public operator fun component3(): Int = this.idCommand

    public operator fun component4(): Int = this.iImage

    public operator fun component5(): UByte = this.fsState

    public operator fun component6(): UByte = this.fsStyle

    public operator fun component7(): UShort = this.cx

    public operator fun component8(): Int = this.lParam

    public operator fun component9(): Pstr = this.pszText

    public operator fun component10(): Int = this.cchText

    public fun copy(cbSize: UInt = this.cbSize, dwMask: TbbuttoninfowMask = this.dwMask, idCommand: Int = this.idCommand, iImage: Int = this.iImage, fsState: UByte = this.fsState, fsStyle: UByte = this.fsStyle, cx: UShort = this.cx, lParam: Int = this.lParam, pszText: Pstr = this.pszText, cchText: Int = this.cchText): Tbbuttoninfoa = Tbbuttoninfoa(cbSize = cbSize, dwMask = dwMask, idCommand = idCommand, iImage = iImage, fsState = fsState, fsStyle = fsStyle, cx = cx, lParam = lParam, pszTextCtorArg = pszText, cchText = cchText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbbuttoninfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.idCommand != other.idCommand) return false
        if (this.iImage != other.iImage) return false
        if (this.fsState != other.fsState) return false
        if (this.fsStyle != other.fsStyle) return false
        if (this.cx != other.cx) return false
        if (this.lParam != other.lParam) return false
        if (this.pszText != other.pszText) return false
        if (this.cchText != other.cchText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.fsState.hashCode()
        result = 31 * result + this.fsStyle.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMask: TbbuttoninfowMask = 0u,
            idCommand: Int = 0,
            iImage: Int = 0,
            fsState: UByte = 0u,
            fsStyle: UByte = 0u,
            cx: UShort = 0u,
            lParam: Int = 0,
            pszText: Pstr = MutPtr(0L),
            cchText: Int = 0,
        ): Tbbuttoninfoa =
            Tbbuttoninfoa(
                cbSize = cbSize,
                dwMask = dwMask,
                idCommand = idCommand,
                iImage = iImage,
                fsState = fsState,
                fsStyle = fsStyle,
                cx = cx,
                lParam = lParam,
                pszTextCtorArg = pszText,
                cchText = cchText,
            )
    }
}

public class Tbbuttoninfow internal constructor(
    public var cbSize: UInt,
    public var dwMask: TbbuttoninfowMask,
    public var idCommand: Int,
    public var iImage: Int,
    public var fsState: UByte,
    public var fsStyle: UByte,
    public var cx: UShort,
    public var lParam: Int,
    pszTextCtorArg: Pwstr,
    public var cchText: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMask = 0u,
        idCommand = 0,
        iImage = 0,
        fsState = 0u,
        fsStyle = 0u,
        cx = 0u,
        lParam = 0,
        pszTextCtorArg = MutPtr(0L),
        cchText = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): TbbuttoninfowMask = this.dwMask

    public operator fun component3(): Int = this.idCommand

    public operator fun component4(): Int = this.iImage

    public operator fun component5(): UByte = this.fsState

    public operator fun component6(): UByte = this.fsStyle

    public operator fun component7(): UShort = this.cx

    public operator fun component8(): Int = this.lParam

    public operator fun component9(): Pwstr = this.pszText

    public operator fun component10(): Int = this.cchText

    public fun copy(cbSize: UInt = this.cbSize, dwMask: TbbuttoninfowMask = this.dwMask, idCommand: Int = this.idCommand, iImage: Int = this.iImage, fsState: UByte = this.fsState, fsStyle: UByte = this.fsStyle, cx: UShort = this.cx, lParam: Int = this.lParam, pszText: Pwstr = this.pszText, cchText: Int = this.cchText): Tbbuttoninfow = Tbbuttoninfow(cbSize = cbSize, dwMask = dwMask, idCommand = idCommand, iImage = iImage, fsState = fsState, fsStyle = fsStyle, cx = cx, lParam = lParam, pszTextCtorArg = pszText, cchText = cchText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbbuttoninfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.idCommand != other.idCommand) return false
        if (this.iImage != other.iImage) return false
        if (this.fsState != other.fsState) return false
        if (this.fsStyle != other.fsStyle) return false
        if (this.cx != other.cx) return false
        if (this.lParam != other.lParam) return false
        if (this.pszText != other.pszText) return false
        if (this.cchText != other.cchText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.fsState.hashCode()
        result = 31 * result + this.fsStyle.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMask: TbbuttoninfowMask = 0u,
            idCommand: Int = 0,
            iImage: Int = 0,
            fsState: UByte = 0u,
            fsStyle: UByte = 0u,
            cx: UShort = 0u,
            lParam: Int = 0,
            pszText: Pwstr = MutPtr(0L),
            cchText: Int = 0,
        ): Tbbuttoninfow =
            Tbbuttoninfow(
                cbSize = cbSize,
                dwMask = dwMask,
                idCommand = idCommand,
                iImage = iImage,
                fsState = fsState,
                fsStyle = fsStyle,
                cx = cx,
                lParam = lParam,
                pszTextCtorArg = pszText,
                cchText = cchText,
            )
    }
}

public data class Tbinsertmark(
    public var iButton: Int = 0,
    public var dwFlags: TbinsertmarkFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbinsertmark> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbinsertmark> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Tbinsertmark =
                    Tbinsertmark(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Tbinsertmark) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iButton)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class Tbmetrics(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var cxPad: Int = 0,
    public var cyPad: Int = 0,
    public var cxBarPad: Int = 0,
    public var cyBarPad: Int = 0,
    public var cxButtonSpacing: Int = 0,
    public var cyButtonSpacing: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbmetrics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbmetrics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Tbmetrics =
                    Tbmetrics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Tbmetrics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cxPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cyPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cxBarPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.cyBarPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.cxButtonSpacing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.cyButtonSpacing)
                }
            }
    }
}

public class Tbreplacebitmap internal constructor(
    hInstOldCtorArg: Hinstance,
    public var nIDOld: Int,
    hInstNewCtorArg: Hinstance,
    public var nIDNew: Int,
    public var nButtons: Int,
) {
    public var hInstOld: Hinstance = hInstOldCtorArg
        internal set

    public var hInstNew: Hinstance = hInstNewCtorArg
        internal set

    public constructor() : this(
        hInstOldCtorArg = MutPtr(0L),
        nIDOld = 0,
        hInstNewCtorArg = MutPtr(0L),
        nIDNew = 0,
        nButtons = 0,
    )

    public operator fun component1(): Hinstance = this.hInstOld

    public operator fun component2(): Int = this.nIDOld

    public operator fun component3(): Hinstance = this.hInstNew

    public operator fun component4(): Int = this.nIDNew

    public operator fun component5(): Int = this.nButtons

    public fun copy(hInstOld: Hinstance = this.hInstOld, nIDOld: Int = this.nIDOld, hInstNew: Hinstance = this.hInstNew, nIDNew: Int = this.nIDNew, nButtons: Int = this.nButtons): Tbreplacebitmap = Tbreplacebitmap(hInstOldCtorArg = hInstOld, nIDOld = nIDOld, hInstNewCtorArg = hInstNew, nIDNew = nIDNew, nButtons = nButtons)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbreplacebitmap) return false
        if (this.hInstOld != other.hInstOld) return false
        if (this.nIDOld != other.nIDOld) return false
        if (this.hInstNew != other.hInstNew) return false
        if (this.nIDNew != other.nIDNew) return false
        if (this.nButtons != other.nButtons) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInstOld.hashCode()
        result = 31 * result + this.nIDOld.hashCode()
        result = 31 * result + this.hInstNew.hashCode()
        result = 31 * result + this.nIDNew.hashCode()
        result = 31 * result + this.nButtons.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInstOld: Hinstance = MutPtr(0L),
            nIDOld: Int = 0,
            hInstNew: Hinstance = MutPtr(0L),
            nIDNew: Int = 0,
            nButtons: Int = 0,
        ): Tbreplacebitmap =
            Tbreplacebitmap(
                hInstOldCtorArg = hInstOld,
                nIDOld = nIDOld,
                hInstNewCtorArg = hInstNew,
                nIDNew = nIDNew,
                nButtons = nButtons,
            )
    }
}

public class Tbsaveparamsa internal constructor(
    hkrCtorArg: Hkey,
    pszSubKeyCtorArg: Pcstr,
    pszValueNameCtorArg: Pcstr,
) {
    public var hkr: Hkey = hkrCtorArg
        internal set

    public var pszSubKey: Pcstr = pszSubKeyCtorArg
        internal set

    public var pszValueName: Pcstr = pszValueNameCtorArg
        internal set

    public constructor() : this(
        hkrCtorArg = MutPtr(0L),
        pszSubKeyCtorArg = ConstPtr(0L),
        pszValueNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hkey = this.hkr

    public operator fun component2(): Pcstr = this.pszSubKey

    public operator fun component3(): Pcstr = this.pszValueName

    public fun copy(hkr: Hkey = this.hkr, pszSubKey: Pcstr = this.pszSubKey, pszValueName: Pcstr = this.pszValueName): Tbsaveparamsa = Tbsaveparamsa(hkrCtorArg = hkr, pszSubKeyCtorArg = pszSubKey, pszValueNameCtorArg = pszValueName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbsaveparamsa) return false
        if (this.hkr != other.hkr) return false
        if (this.pszSubKey != other.pszSubKey) return false
        if (this.pszValueName != other.pszValueName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hkr.hashCode()
        result = 31 * result + this.pszSubKey.hashCode()
        result = 31 * result + this.pszValueName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hkr: Hkey = MutPtr(0L),
            pszSubKey: Pcstr = ConstPtr(0L),
            pszValueName: Pcstr = ConstPtr(0L),
        ): Tbsaveparamsa =
            Tbsaveparamsa(
                hkrCtorArg = hkr,
                pszSubKeyCtorArg = pszSubKey,
                pszValueNameCtorArg = pszValueName,
            )
    }
}

public class Tbsaveparamsw internal constructor(
    hkrCtorArg: Hkey,
    pszSubKeyCtorArg: Pcwstr,
    pszValueNameCtorArg: Pcwstr,
) {
    public var hkr: Hkey = hkrCtorArg
        internal set

    public var pszSubKey: Pcwstr = pszSubKeyCtorArg
        internal set

    public var pszValueName: Pcwstr = pszValueNameCtorArg
        internal set

    public constructor() : this(
        hkrCtorArg = MutPtr(0L),
        pszSubKeyCtorArg = ConstPtr(0L),
        pszValueNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hkey = this.hkr

    public operator fun component2(): Pcwstr = this.pszSubKey

    public operator fun component3(): Pcwstr = this.pszValueName

    public fun copy(hkr: Hkey = this.hkr, pszSubKey: Pcwstr = this.pszSubKey, pszValueName: Pcwstr = this.pszValueName): Tbsaveparamsw = Tbsaveparamsw(hkrCtorArg = hkr, pszSubKeyCtorArg = pszSubKey, pszValueNameCtorArg = pszValueName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbsaveparamsw) return false
        if (this.hkr != other.hkr) return false
        if (this.pszSubKey != other.pszSubKey) return false
        if (this.pszValueName != other.pszValueName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hkr.hashCode()
        result = 31 * result + this.pszSubKey.hashCode()
        result = 31 * result + this.pszValueName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hkr: Hkey = MutPtr(0L),
            pszSubKey: Pcwstr = ConstPtr(0L),
            pszValueName: Pcwstr = ConstPtr(0L),
        ): Tbsaveparamsw =
            Tbsaveparamsw(
                hkrCtorArg = hkr,
                pszSubKeyCtorArg = pszSubKey,
                pszValueNameCtorArg = pszValueName,
            )
    }
}

public data class Tchittestinfo(
    public var pt: Point = Point(),
    public var flags: TchittestinfoFlags = 0u,
)

public class Tcitema internal constructor(
    public var mask: TcitemheaderaMask,
    public var dwState: TabControlItemState,
    public var dwStateMask: TabControlItemState,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        dwState = 0u,
        dwStateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
    )

    public operator fun component1(): TcitemheaderaMask = this.mask

    public operator fun component2(): TabControlItemState = this.dwState

    public operator fun component3(): TabControlItemState = this.dwStateMask

    public operator fun component4(): Pstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public operator fun component7(): Lparam = this.lParam

    public fun copy(mask: TcitemheaderaMask = this.mask, dwState: TabControlItemState = this.dwState, dwStateMask: TabControlItemState = this.dwStateMask, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam): Tcitema = Tcitema(mask = mask, dwState = dwState, dwStateMask = dwStateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tcitema) return false
        if (this.mask != other.mask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TcitemheaderaMask = 0u,
            dwState: TabControlItemState = 0u,
            dwStateMask: TabControlItemState = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
        ): Tcitema =
            Tcitema(
                mask = mask,
                dwState = dwState,
                dwStateMask = dwStateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
            )
    }
}

public class Tcitemheadera internal constructor(
    public var mask: TcitemheaderaMask,
    public var lpReserved1: UInt,
    public var lpReserved2: UInt,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        lpReserved1 = 0u,
        lpReserved2 = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
    )

    public operator fun component1(): TcitemheaderaMask = this.mask

    public operator fun component2(): UInt = this.lpReserved1

    public operator fun component3(): UInt = this.lpReserved2

    public operator fun component4(): Pstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public fun copy(mask: TcitemheaderaMask = this.mask, lpReserved1: UInt = this.lpReserved1, lpReserved2: UInt = this.lpReserved2, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage): Tcitemheadera = Tcitemheadera(mask = mask, lpReserved1 = lpReserved1, lpReserved2 = lpReserved2, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tcitemheadera) return false
        if (this.mask != other.mask) return false
        if (this.lpReserved1 != other.lpReserved1) return false
        if (this.lpReserved2 != other.lpReserved2) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.lpReserved1.hashCode()
        result = 31 * result + this.lpReserved2.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TcitemheaderaMask = 0u,
            lpReserved1: UInt = 0u,
            lpReserved2: UInt = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
        ): Tcitemheadera =
            Tcitemheadera(
                mask = mask,
                lpReserved1 = lpReserved1,
                lpReserved2 = lpReserved2,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
            )
    }
}

public class Tcitemheaderw internal constructor(
    public var mask: TcitemheaderaMask,
    public var lpReserved1: UInt,
    public var lpReserved2: UInt,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        lpReserved1 = 0u,
        lpReserved2 = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
    )

    public operator fun component1(): TcitemheaderaMask = this.mask

    public operator fun component2(): UInt = this.lpReserved1

    public operator fun component3(): UInt = this.lpReserved2

    public operator fun component4(): Pwstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public fun copy(mask: TcitemheaderaMask = this.mask, lpReserved1: UInt = this.lpReserved1, lpReserved2: UInt = this.lpReserved2, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage): Tcitemheaderw = Tcitemheaderw(mask = mask, lpReserved1 = lpReserved1, lpReserved2 = lpReserved2, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tcitemheaderw) return false
        if (this.mask != other.mask) return false
        if (this.lpReserved1 != other.lpReserved1) return false
        if (this.lpReserved2 != other.lpReserved2) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.lpReserved1.hashCode()
        result = 31 * result + this.lpReserved2.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TcitemheaderaMask = 0u,
            lpReserved1: UInt = 0u,
            lpReserved2: UInt = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
        ): Tcitemheaderw =
            Tcitemheaderw(
                mask = mask,
                lpReserved1 = lpReserved1,
                lpReserved2 = lpReserved2,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
            )
    }
}

public class Tcitemw internal constructor(
    public var mask: TcitemheaderaMask,
    public var dwState: TabControlItemState,
    public var dwStateMask: TabControlItemState,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        dwState = 0u,
        dwStateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        lParam = 0L,
    )

    public operator fun component1(): TcitemheaderaMask = this.mask

    public operator fun component2(): TabControlItemState = this.dwState

    public operator fun component3(): TabControlItemState = this.dwStateMask

    public operator fun component4(): Pwstr = this.pszText

    public operator fun component5(): Int = this.cchTextMax

    public operator fun component6(): Int = this.iImage

    public operator fun component7(): Lparam = this.lParam

    public fun copy(mask: TcitemheaderaMask = this.mask, dwState: TabControlItemState = this.dwState, dwStateMask: TabControlItemState = this.dwStateMask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, lParam: Lparam = this.lParam): Tcitemw = Tcitemw(mask = mask, dwState = dwState, dwStateMask = dwStateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tcitemw) return false
        if (this.mask != other.mask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TcitemheaderaMask = 0u,
            dwState: TabControlItemState = 0u,
            dwStateMask: TabControlItemState = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            lParam: Lparam = 0L,
        ): Tcitemw =
            Tcitemw(
                mask = mask,
                dwState = dwState,
                dwStateMask = dwStateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                lParam = lParam,
            )
    }
}

public data class TouchHitTestingInput(
    public var pointerId: UInt = 0u,
    public var point: Point = Point(),
    public var boundingBox: Rect = Rect(),
    public var nonOccludedBoundingBox: Rect = Rect(),
    public var orientation: UInt = 0u,
)

public data class TouchHitTestingProximityEvaluation(
    public var score: UShort = 0u,
    public var adjustedPoint: Point = Point(),
)

public class Ttgettitle internal constructor(
    public var dwSize: UInt,
    public var uTitleBitmap: UInt,
    public var cch: UInt,
    pszTitleCtorArg: Pwstr,
) {
    public var pszTitle: Pwstr = pszTitleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        uTitleBitmap = 0u,
        cch = 0u,
        pszTitleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.uTitleBitmap

    public operator fun component3(): UInt = this.cch

    public operator fun component4(): Pwstr = this.pszTitle

    public fun copy(dwSize: UInt = this.dwSize, uTitleBitmap: UInt = this.uTitleBitmap, cch: UInt = this.cch, pszTitle: Pwstr = this.pszTitle): Ttgettitle = Ttgettitle(dwSize = dwSize, uTitleBitmap = uTitleBitmap, cch = cch, pszTitleCtorArg = pszTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ttgettitle) return false
        if (this.dwSize != other.dwSize) return false
        if (this.uTitleBitmap != other.uTitleBitmap) return false
        if (this.cch != other.cch) return false
        if (this.pszTitle != other.pszTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.uTitleBitmap.hashCode()
        result = 31 * result + this.cch.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            uTitleBitmap: UInt = 0u,
            cch: UInt = 0u,
            pszTitle: Pwstr = MutPtr(0L),
        ): Ttgettitle =
            Ttgettitle(
                dwSize = dwSize,
                uTitleBitmap = uTitleBitmap,
                cch = cch,
                pszTitleCtorArg = pszTitle,
            )
    }
}

public class Tthittestinfoa internal constructor(
    hwndCtorArg: Hwnd,
    public var pt: Point,
    public var ti: Tttoolinfoa,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        pt = Point(),
        ti = Tttoolinfoa(),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): Point = this.pt

    public operator fun component3(): Tttoolinfoa = this.ti

    public fun copy(hwnd: Hwnd = this.hwnd, pt: Point = this.pt, ti: Tttoolinfoa = this.ti): Tthittestinfoa = Tthittestinfoa(hwndCtorArg = hwnd, pt = pt, ti = ti)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tthittestinfoa) return false
        if (this.hwnd != other.hwnd) return false
        if (this.pt != other.pt) return false
        if (this.ti != other.ti) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.ti.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            pt: Point = Point(),
            ti: Tttoolinfoa = Tttoolinfoa(),
        ): Tthittestinfoa =
            Tthittestinfoa(
                hwndCtorArg = hwnd,
                pt = pt,
                ti = ti,
            )
    }
}

public class Tthittestinfow internal constructor(
    hwndCtorArg: Hwnd,
    public var pt: Point,
    public var ti: Tttoolinfow,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        pt = Point(),
        ti = Tttoolinfow(),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): Point = this.pt

    public operator fun component3(): Tttoolinfow = this.ti

    public fun copy(hwnd: Hwnd = this.hwnd, pt: Point = this.pt, ti: Tttoolinfow = this.ti): Tthittestinfow = Tthittestinfow(hwndCtorArg = hwnd, pt = pt, ti = ti)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tthittestinfow) return false
        if (this.hwnd != other.hwnd) return false
        if (this.pt != other.pt) return false
        if (this.ti != other.ti) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.ti.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            pt: Point = Point(),
            ti: Tttoolinfow = Tttoolinfow(),
        ): Tthittestinfow =
            Tthittestinfow(
                hwndCtorArg = hwnd,
                pt = pt,
                ti = ti,
            )
    }
}

public class Tttoolinfoa internal constructor(
    public var cbSize: UInt,
    public var uFlags: TooltipFlags,
    hwndCtorArg: Hwnd,
    public var uId: Int,
    public var rect: Rect,
    hinstCtorArg: Hinstance,
    lpszTextCtorArg: Pstr,
    public var lParam: Lparam,
    lpReservedCtorArg: MutPtr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var hinst: Hinstance = hinstCtorArg
        internal set

    public var lpszText: Pstr = lpszTextCtorArg
        internal set

    public var lpReserved: MutPtr = lpReservedCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        uFlags = 0u,
        hwndCtorArg = MutPtr(0L),
        uId = 0,
        rect = Rect(),
        hinstCtorArg = MutPtr(0L),
        lpszTextCtorArg = MutPtr(0L),
        lParam = 0L,
        lpReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): TooltipFlags = this.uFlags

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Int = this.uId

    public operator fun component5(): Rect = this.rect

    public operator fun component6(): Hinstance = this.hinst

    public operator fun component7(): Pstr = this.lpszText

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): MutPtr = this.lpReserved

    public fun copy(cbSize: UInt = this.cbSize, uFlags: TooltipFlags = this.uFlags, hwnd: Hwnd = this.hwnd, uId: Int = this.uId, rect: Rect = this.rect, hinst: Hinstance = this.hinst, lpszText: Pstr = this.lpszText, lParam: Lparam = this.lParam, lpReserved: MutPtr = this.lpReserved): Tttoolinfoa = Tttoolinfoa(cbSize = cbSize, uFlags = uFlags, hwndCtorArg = hwnd, uId = uId, rect = rect, hinstCtorArg = hinst, lpszTextCtorArg = lpszText, lParam = lParam, lpReservedCtorArg = lpReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tttoolinfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.uFlags != other.uFlags) return false
        if (this.hwnd != other.hwnd) return false
        if (this.uId != other.uId) return false
        if (this.rect != other.rect) return false
        if (this.hinst != other.hinst) return false
        if (this.lpszText != other.lpszText) return false
        if (this.lParam != other.lParam) return false
        if (this.lpReserved != other.lpReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.uId.hashCode()
        result = 31 * result + this.rect.hashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.lpReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            uFlags: TooltipFlags = 0u,
            hwnd: Hwnd = MutPtr(0L),
            uId: Int = 0,
            rect: Rect = Rect(),
            hinst: Hinstance = MutPtr(0L),
            lpszText: Pstr = MutPtr(0L),
            lParam: Lparam = 0L,
            lpReserved: MutPtr = MutPtr(0L),
        ): Tttoolinfoa =
            Tttoolinfoa(
                cbSize = cbSize,
                uFlags = uFlags,
                hwndCtorArg = hwnd,
                uId = uId,
                rect = rect,
                hinstCtorArg = hinst,
                lpszTextCtorArg = lpszText,
                lParam = lParam,
                lpReservedCtorArg = lpReserved,
            )
    }
}

public class Tttoolinfow internal constructor(
    public var cbSize: UInt,
    public var uFlags: TooltipFlags,
    hwndCtorArg: Hwnd,
    public var uId: Int,
    public var rect: Rect,
    hinstCtorArg: Hinstance,
    lpszTextCtorArg: Pwstr,
    public var lParam: Lparam,
    lpReservedCtorArg: MutPtr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var hinst: Hinstance = hinstCtorArg
        internal set

    public var lpszText: Pwstr = lpszTextCtorArg
        internal set

    public var lpReserved: MutPtr = lpReservedCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        uFlags = 0u,
        hwndCtorArg = MutPtr(0L),
        uId = 0,
        rect = Rect(),
        hinstCtorArg = MutPtr(0L),
        lpszTextCtorArg = MutPtr(0L),
        lParam = 0L,
        lpReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): TooltipFlags = this.uFlags

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Int = this.uId

    public operator fun component5(): Rect = this.rect

    public operator fun component6(): Hinstance = this.hinst

    public operator fun component7(): Pwstr = this.lpszText

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): MutPtr = this.lpReserved

    public fun copy(cbSize: UInt = this.cbSize, uFlags: TooltipFlags = this.uFlags, hwnd: Hwnd = this.hwnd, uId: Int = this.uId, rect: Rect = this.rect, hinst: Hinstance = this.hinst, lpszText: Pwstr = this.lpszText, lParam: Lparam = this.lParam, lpReserved: MutPtr = this.lpReserved): Tttoolinfow = Tttoolinfow(cbSize = cbSize, uFlags = uFlags, hwndCtorArg = hwnd, uId = uId, rect = rect, hinstCtorArg = hinst, lpszTextCtorArg = lpszText, lParam = lParam, lpReservedCtorArg = lpReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tttoolinfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.uFlags != other.uFlags) return false
        if (this.hwnd != other.hwnd) return false
        if (this.uId != other.uId) return false
        if (this.rect != other.rect) return false
        if (this.hinst != other.hinst) return false
        if (this.lpszText != other.lpszText) return false
        if (this.lParam != other.lParam) return false
        if (this.lpReserved != other.lpReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.uId.hashCode()
        result = 31 * result + this.rect.hashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.lpReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            uFlags: TooltipFlags = 0u,
            hwnd: Hwnd = MutPtr(0L),
            uId: Int = 0,
            rect: Rect = Rect(),
            hinst: Hinstance = MutPtr(0L),
            lpszText: Pwstr = MutPtr(0L),
            lParam: Lparam = 0L,
            lpReserved: MutPtr = MutPtr(0L),
        ): Tttoolinfow =
            Tttoolinfow(
                cbSize = cbSize,
                uFlags = uFlags,
                hwndCtorArg = hwnd,
                uId = uId,
                rect = rect,
                hinstCtorArg = hinst,
                lpszTextCtorArg = lpszText,
                lParam = lParam,
                lpReservedCtorArg = lpReserved,
            )
    }
}

public class Tvgetitempartrectinfo internal constructor(
    public var hti: Htreeitem,
    prcCtorArg: MutPtr,
    public var partID: Tvitempart,
) {
    public var prc: MutPtr = prcCtorArg
        internal set

    public constructor() : this(
        hti = 0,
        prcCtorArg = MutPtr(0L),
        partID = 0,
    )

    public operator fun component1(): Htreeitem = this.hti

    public operator fun component2(): MutPtr = this.prc

    public operator fun component3(): Tvitempart = this.partID

    public fun copy(hti: Htreeitem = this.hti, prc: MutPtr = this.prc, partID: Tvitempart = this.partID): Tvgetitempartrectinfo = Tvgetitempartrectinfo(hti = hti, prcCtorArg = prc, partID = partID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tvgetitempartrectinfo) return false
        if (this.hti != other.hti) return false
        if (this.prc != other.prc) return false
        if (this.partID != other.partID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hti.hashCode()
        result = 31 * result + this.prc.hashCode()
        result = 31 * result + this.partID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tvgetitempartrectinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tvgetitempartrectinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Tvgetitempartrectinfo =
                    Tvgetitempartrectinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Tvgetitempartrectinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.hti)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.prc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.partID)
                }
            }

        public operator fun invoke(
            hti: Htreeitem = 0,
            prc: MutPtr = MutPtr(0L),
            partID: Tvitempart = 0,
        ): Tvgetitempartrectinfo =
            Tvgetitempartrectinfo(
                hti = hti,
                prcCtorArg = prc,
                partID = partID,
            )
    }
}

public data class Tvhittestinfo(
    public var pt: Point = Point(),
    public var flags: TvhittestinfoFlags = 0u,
    public var hItem: Htreeitem = 0,
)

public data class Tvinsertstructa(
    public var hParent: Htreeitem = 0,
    public var hInsertAfter: Htreeitem = 0,
    public var anonymous: Tvinsertstructa0 = Tvinsertstructa0(),
)

public data class Tvinsertstructa0(
    public var itemex: Tvitemexa = Tvitemexa(),
    public var item: Tvitema = Tvitema(),
)

public data class Tvinsertstructw(
    public var hParent: Htreeitem = 0,
    public var hInsertAfter: Htreeitem = 0,
    public var anonymous: Tvinsertstructw0 = Tvinsertstructw0(),
)

public data class Tvinsertstructw0(
    public var itemex: Tvitemexw = Tvitemexw(),
    public var item: Tvitemw = Tvitemw(),
)

public class Tvitema internal constructor(
    public var mask: TvitemMask,
    public var hItem: Htreeitem,
    public var state: TreeViewItemStateFlags,
    public var stateMask: TreeViewItemStateFlags,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var cChildren: TvitemexwChildren,
    public var lParam: Lparam,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        hItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        cChildren = 0,
        lParam = 0L,
    )

    public operator fun component1(): TvitemMask = this.mask

    public operator fun component2(): Htreeitem = this.hItem

    public operator fun component3(): TreeViewItemStateFlags = this.state

    public operator fun component4(): TreeViewItemStateFlags = this.stateMask

    public operator fun component5(): Pstr = this.pszText

    public operator fun component6(): Int = this.cchTextMax

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iSelectedImage

    public operator fun component9(): TvitemexwChildren = this.cChildren

    public operator fun component10(): Lparam = this.lParam

    public fun copy(mask: TvitemMask = this.mask, hItem: Htreeitem = this.hItem, state: TreeViewItemStateFlags = this.state, stateMask: TreeViewItemStateFlags = this.stateMask, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, cChildren: TvitemexwChildren = this.cChildren, lParam: Lparam = this.lParam): Tvitema = Tvitema(mask = mask, hItem = hItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, cChildren = cChildren, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tvitema) return false
        if (this.mask != other.mask) return false
        if (this.hItem != other.hItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.cChildren != other.cChildren) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.cChildren.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TvitemMask = 0u,
            hItem: Htreeitem = 0,
            state: TreeViewItemStateFlags = 0u,
            stateMask: TreeViewItemStateFlags = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            cChildren: TvitemexwChildren = 0,
            lParam: Lparam = 0L,
        ): Tvitema =
            Tvitema(
                mask = mask,
                hItem = hItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                cChildren = cChildren,
                lParam = lParam,
            )
    }
}

public class Tvitemexa internal constructor(
    public var mask: TvitemMask,
    public var hItem: Htreeitem,
    public var state: UInt,
    public var stateMask: UInt,
    pszTextCtorArg: Pstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var cChildren: TvitemexwChildren,
    public var lParam: Lparam,
    public var iIntegral: Int,
    public var uStateEx: UInt,
    hwndCtorArg: Hwnd,
    public var iExpandedImage: Int,
    public var iReserved: Int,
) {
    public var pszText: Pstr = pszTextCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        hItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        cChildren = 0,
        lParam = 0L,
        iIntegral = 0,
        uStateEx = 0u,
        hwndCtorArg = MutPtr(0L),
        iExpandedImage = 0,
        iReserved = 0,
    )

    public operator fun component1(): TvitemMask = this.mask

    public operator fun component2(): Htreeitem = this.hItem

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.stateMask

    public operator fun component5(): Pstr = this.pszText

    public operator fun component6(): Int = this.cchTextMax

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iSelectedImage

    public operator fun component9(): TvitemexwChildren = this.cChildren

    public operator fun component10(): Lparam = this.lParam

    public operator fun component11(): Int = this.iIntegral

    public operator fun component12(): UInt = this.uStateEx

    public operator fun component13(): Hwnd = this.hwnd

    public operator fun component14(): Int = this.iExpandedImage

    public operator fun component15(): Int = this.iReserved

    public fun copy(mask: TvitemMask = this.mask, hItem: Htreeitem = this.hItem, state: UInt = this.state, stateMask: UInt = this.stateMask, pszText: Pstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, cChildren: TvitemexwChildren = this.cChildren, lParam: Lparam = this.lParam, iIntegral: Int = this.iIntegral, uStateEx: UInt = this.uStateEx, hwnd: Hwnd = this.hwnd, iExpandedImage: Int = this.iExpandedImage, iReserved: Int = this.iReserved): Tvitemexa = Tvitemexa(mask = mask, hItem = hItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, cChildren = cChildren, lParam = lParam, iIntegral = iIntegral, uStateEx = uStateEx, hwndCtorArg = hwnd, iExpandedImage = iExpandedImage, iReserved = iReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tvitemexa) return false
        if (this.mask != other.mask) return false
        if (this.hItem != other.hItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.cChildren != other.cChildren) return false
        if (this.lParam != other.lParam) return false
        if (this.iIntegral != other.iIntegral) return false
        if (this.uStateEx != other.uStateEx) return false
        if (this.hwnd != other.hwnd) return false
        if (this.iExpandedImage != other.iExpandedImage) return false
        if (this.iReserved != other.iReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.cChildren.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iIntegral.hashCode()
        result = 31 * result + this.uStateEx.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.iExpandedImage.hashCode()
        result = 31 * result + this.iReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TvitemMask = 0u,
            hItem: Htreeitem = 0,
            state: UInt = 0u,
            stateMask: UInt = 0u,
            pszText: Pstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            cChildren: TvitemexwChildren = 0,
            lParam: Lparam = 0L,
            iIntegral: Int = 0,
            uStateEx: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            iExpandedImage: Int = 0,
            iReserved: Int = 0,
        ): Tvitemexa =
            Tvitemexa(
                mask = mask,
                hItem = hItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                cChildren = cChildren,
                lParam = lParam,
                iIntegral = iIntegral,
                uStateEx = uStateEx,
                hwndCtorArg = hwnd,
                iExpandedImage = iExpandedImage,
                iReserved = iReserved,
            )
    }
}

public class Tvitemexw internal constructor(
    public var mask: TvitemMask,
    public var hItem: Htreeitem,
    public var state: UInt,
    public var stateMask: UInt,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var cChildren: TvitemexwChildren,
    public var lParam: Lparam,
    public var iIntegral: Int,
    public var uStateEx: UInt,
    hwndCtorArg: Hwnd,
    public var iExpandedImage: Int,
    public var iReserved: Int,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        hItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        cChildren = 0,
        lParam = 0L,
        iIntegral = 0,
        uStateEx = 0u,
        hwndCtorArg = MutPtr(0L),
        iExpandedImage = 0,
        iReserved = 0,
    )

    public operator fun component1(): TvitemMask = this.mask

    public operator fun component2(): Htreeitem = this.hItem

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.stateMask

    public operator fun component5(): Pwstr = this.pszText

    public operator fun component6(): Int = this.cchTextMax

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iSelectedImage

    public operator fun component9(): TvitemexwChildren = this.cChildren

    public operator fun component10(): Lparam = this.lParam

    public operator fun component11(): Int = this.iIntegral

    public operator fun component12(): UInt = this.uStateEx

    public operator fun component13(): Hwnd = this.hwnd

    public operator fun component14(): Int = this.iExpandedImage

    public operator fun component15(): Int = this.iReserved

    public fun copy(mask: TvitemMask = this.mask, hItem: Htreeitem = this.hItem, state: UInt = this.state, stateMask: UInt = this.stateMask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, cChildren: TvitemexwChildren = this.cChildren, lParam: Lparam = this.lParam, iIntegral: Int = this.iIntegral, uStateEx: UInt = this.uStateEx, hwnd: Hwnd = this.hwnd, iExpandedImage: Int = this.iExpandedImage, iReserved: Int = this.iReserved): Tvitemexw = Tvitemexw(mask = mask, hItem = hItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, cChildren = cChildren, lParam = lParam, iIntegral = iIntegral, uStateEx = uStateEx, hwndCtorArg = hwnd, iExpandedImage = iExpandedImage, iReserved = iReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tvitemexw) return false
        if (this.mask != other.mask) return false
        if (this.hItem != other.hItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.cChildren != other.cChildren) return false
        if (this.lParam != other.lParam) return false
        if (this.iIntegral != other.iIntegral) return false
        if (this.uStateEx != other.uStateEx) return false
        if (this.hwnd != other.hwnd) return false
        if (this.iExpandedImage != other.iExpandedImage) return false
        if (this.iReserved != other.iReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.cChildren.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iIntegral.hashCode()
        result = 31 * result + this.uStateEx.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.iExpandedImage.hashCode()
        result = 31 * result + this.iReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TvitemMask = 0u,
            hItem: Htreeitem = 0,
            state: UInt = 0u,
            stateMask: UInt = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            cChildren: TvitemexwChildren = 0,
            lParam: Lparam = 0L,
            iIntegral: Int = 0,
            uStateEx: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            iExpandedImage: Int = 0,
            iReserved: Int = 0,
        ): Tvitemexw =
            Tvitemexw(
                mask = mask,
                hItem = hItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                cChildren = cChildren,
                lParam = lParam,
                iIntegral = iIntegral,
                uStateEx = uStateEx,
                hwndCtorArg = hwnd,
                iExpandedImage = iExpandedImage,
                iReserved = iReserved,
            )
    }
}

public class Tvitemw internal constructor(
    public var mask: TvitemMask,
    public var hItem: Htreeitem,
    public var state: TreeViewItemStateFlags,
    public var stateMask: TreeViewItemStateFlags,
    pszTextCtorArg: Pwstr,
    public var cchTextMax: Int,
    public var iImage: Int,
    public var iSelectedImage: Int,
    public var cChildren: TvitemexwChildren,
    public var lParam: Lparam,
) {
    public var pszText: Pwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        mask = 0u,
        hItem = 0,
        state = 0u,
        stateMask = 0u,
        pszTextCtorArg = MutPtr(0L),
        cchTextMax = 0,
        iImage = 0,
        iSelectedImage = 0,
        cChildren = 0,
        lParam = 0L,
    )

    public operator fun component1(): TvitemMask = this.mask

    public operator fun component2(): Htreeitem = this.hItem

    public operator fun component3(): TreeViewItemStateFlags = this.state

    public operator fun component4(): TreeViewItemStateFlags = this.stateMask

    public operator fun component5(): Pwstr = this.pszText

    public operator fun component6(): Int = this.cchTextMax

    public operator fun component7(): Int = this.iImage

    public operator fun component8(): Int = this.iSelectedImage

    public operator fun component9(): TvitemexwChildren = this.cChildren

    public operator fun component10(): Lparam = this.lParam

    public fun copy(mask: TvitemMask = this.mask, hItem: Htreeitem = this.hItem, state: TreeViewItemStateFlags = this.state, stateMask: TreeViewItemStateFlags = this.stateMask, pszText: Pwstr = this.pszText, cchTextMax: Int = this.cchTextMax, iImage: Int = this.iImage, iSelectedImage: Int = this.iSelectedImage, cChildren: TvitemexwChildren = this.cChildren, lParam: Lparam = this.lParam): Tvitemw = Tvitemw(mask = mask, hItem = hItem, state = state, stateMask = stateMask, pszTextCtorArg = pszText, cchTextMax = cchTextMax, iImage = iImage, iSelectedImage = iSelectedImage, cChildren = cChildren, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tvitemw) return false
        if (this.mask != other.mask) return false
        if (this.hItem != other.hItem) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (this.pszText != other.pszText) return false
        if (this.cchTextMax != other.cchTextMax) return false
        if (this.iImage != other.iImage) return false
        if (this.iSelectedImage != other.iSelectedImage) return false
        if (this.cChildren != other.cChildren) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.hItem.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.cchTextMax.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.iSelectedImage.hashCode()
        result = 31 * result + this.cChildren.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mask: TvitemMask = 0u,
            hItem: Htreeitem = 0,
            state: TreeViewItemStateFlags = 0u,
            stateMask: TreeViewItemStateFlags = 0u,
            pszText: Pwstr = MutPtr(0L),
            cchTextMax: Int = 0,
            iImage: Int = 0,
            iSelectedImage: Int = 0,
            cChildren: TvitemexwChildren = 0,
            lParam: Lparam = 0L,
        ): Tvitemw =
            Tvitemw(
                mask = mask,
                hItem = hItem,
                state = state,
                stateMask = stateMask,
                pszTextCtorArg = pszText,
                cchTextMax = cchTextMax,
                iImage = iImage,
                iSelectedImage = iSelectedImage,
                cChildren = cChildren,
                lParam = lParam,
            )
    }
}

public data class Tvsortcb(
    public var hParent: Htreeitem = 0,
    public var lpfnCompare: Pfntvcompare = null,
    public var lParam: Lparam = 0L,
)

public data class Udaccel(
    public var nSec: UInt = 0u,
    public var nInc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Udaccel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Udaccel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Udaccel =
                    Udaccel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Udaccel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nInc)
                }
            }
    }
}
