@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public class Appletidlist internal constructor(
    public var count: Int,
    pIIDListCtorArg: MutPtr,
) {
    public var pIIDList: MutPtr = pIIDListCtorArg
        internal set

    public constructor() : this(
        count = 0,
        pIIDListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.count

    public operator fun component2(): MutPtr = this.pIIDList

    public fun copy(count: Int = this.count, pIIDList: MutPtr = this.pIIDList): Appletidlist = Appletidlist(count = count, pIIDListCtorArg = pIIDList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Appletidlist) return false
        if (this.count != other.count) return false
        if (this.pIIDList != other.pIIDList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.pIIDList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appletidlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appletidlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Appletidlist =
                    Appletidlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Appletidlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pIIDList)
                }
            }

        public operator fun invoke(
            count: Int = 0,
            pIIDList: MutPtr = MutPtr(0L),
        ): Appletidlist =
            Appletidlist(
                count = count,
                pIIDListCtorArg = pIIDList,
            )
    }
}

public class Applycandexparam internal constructor(
    public var dwSize: UInt,
    lpwstrDisplayCtorArg: Pwstr,
    lpwstrReadingCtorArg: Pwstr,
    public var dwReserved: UInt,
) {
    public var lpwstrDisplay: Pwstr = lpwstrDisplayCtorArg
        internal set

    public var lpwstrReading: Pwstr = lpwstrReadingCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpwstrDisplayCtorArg = MutPtr(0L),
        lpwstrReadingCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.lpwstrDisplay

    public operator fun component3(): Pwstr = this.lpwstrReading

    public operator fun component4(): UInt = this.dwReserved

    public fun copy(dwSize: UInt = this.dwSize, lpwstrDisplay: Pwstr = this.lpwstrDisplay, lpwstrReading: Pwstr = this.lpwstrReading, dwReserved: UInt = this.dwReserved): Applycandexparam = Applycandexparam(dwSize = dwSize, lpwstrDisplayCtorArg = lpwstrDisplay, lpwstrReadingCtorArg = lpwstrReading, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Applycandexparam) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpwstrDisplay != other.lpwstrDisplay) return false
        if (this.lpwstrReading != other.lpwstrReading) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpwstrDisplay.hashCode()
        result = 31 * result + this.lpwstrReading.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpwstrDisplay: Pwstr = MutPtr(0L),
            lpwstrReading: Pwstr = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): Applycandexparam =
            Applycandexparam(
                dwSize = dwSize,
                lpwstrDisplayCtorArg = lpwstrDisplay,
                lpwstrReadingCtorArg = lpwstrReading,
                dwReserved = dwReserved,
            )
    }
}

public data class Candidateform(
    public var dwIndex: UInt = 0u,
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: Point = Point(),
    public var rcArea: Rect = Rect(),
)

public data class Candidateinfo(
    public var dwSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwOffset: UIntArray = UIntArray(32),
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Candidateinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCount != other.dwCount) return false
        if (!this.dwOffset.contentEquals(other.dwOffset)) return false
        if (this.dwPrivateSize != other.dwPrivateSize) return false
        if (this.dwPrivateOffset != other.dwPrivateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwOffset.contentHashCode()
        result = 31 * result + this.dwPrivateSize.hashCode()
        result = 31 * result + this.dwPrivateOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Candidateinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Candidateinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Candidateinfo =
                    Candidateinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                    )
                override fun writeNative(addr: Long, value: Candidateinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr + 8L, value.dwOffset.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwPrivateSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwPrivateOffset)
                }
            }
    }
}

public data class Candidatelist(
    public var dwSize: UInt = 0u,
    public var dwStyle: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwSelection: UInt = 0u,
    public var dwPageStart: UInt = 0u,
    public var dwPageSize: UInt = 0u,
    public var dwOffset: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Candidatelist) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.dwCount != other.dwCount) return false
        if (this.dwSelection != other.dwSelection) return false
        if (this.dwPageStart != other.dwPageStart) return false
        if (this.dwPageSize != other.dwPageSize) return false
        if (!this.dwOffset.contentEquals(other.dwOffset)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwSelection.hashCode()
        result = 31 * result + this.dwPageStart.hashCode()
        result = 31 * result + this.dwPageSize.hashCode()
        result = 31 * result + this.dwOffset.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Candidatelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Candidatelist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Candidatelist =
                    Candidatelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Candidatelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSelection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPageStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPageSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 24L, value.dwOffset.toList())
                }
            }
    }
}

public data class Compositionform(
    public var dwStyle: UInt = 0u,
    public var ptCurrentPos: Point = Point(),
    public var rcArea: Rect = Rect(),
)

public class Compositionstring(
    public var dwSize: UInt = 0u,
    public var dwCompReadAttrLen: UInt = 0u,
    public var dwCompReadAttrOffset: UInt = 0u,
    public var dwCompReadClauseLen: UInt = 0u,
    public var dwCompReadClauseOffset: UInt = 0u,
    public var dwCompReadStrLen: UInt = 0u,
    public var dwCompReadStrOffset: UInt = 0u,
    public var dwCompAttrLen: UInt = 0u,
    public var dwCompAttrOffset: UInt = 0u,
    public var dwCompClauseLen: UInt = 0u,
    public var dwCompClauseOffset: UInt = 0u,
    public var dwCompStrLen: UInt = 0u,
    public var dwCompStrOffset: UInt = 0u,
    public var dwCursorPos: UInt = 0u,
    public var dwDeltaStart: UInt = 0u,
    public var dwResultReadClauseLen: UInt = 0u,
    public var dwResultReadClauseOffset: UInt = 0u,
    public var dwResultReadStrLen: UInt = 0u,
    public var dwResultReadStrOffset: UInt = 0u,
    public var dwResultClauseLen: UInt = 0u,
    public var dwResultClauseOffset: UInt = 0u,
    public var dwResultStrLen: UInt = 0u,
    public var dwResultStrOffset: UInt = 0u,
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Compositionstring> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Compositionstring> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 100L
                override fun readNative(addr: Long): Compositionstring =
                    Compositionstring(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: Compositionstring) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCompReadAttrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCompReadAttrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCompReadClauseLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCompReadClauseOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCompReadStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwCompReadStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwCompAttrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwCompAttrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwCompClauseLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwCompClauseOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwCompStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwCompStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwCursorPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwDeltaStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwResultReadClauseLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwResultReadClauseOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwResultReadStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwResultReadStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwResultClauseLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwResultClauseOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwResultStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwResultStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwPrivateSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwPrivateOffset)
                }
            }
    }
}

public data class Guideline(
    public var dwSize: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwPrivateSize: UInt = 0u,
    public var dwPrivateOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Guideline> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Guideline> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Guideline =
                    Guideline(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Guideline) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPrivateSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwPrivateOffset)
                }
            }
    }
}

public class Imeappletcfg internal constructor(
    public var dwConfig: UInt,
    public var wchTitle: UShortArray,
    public var wchTitleFontFace: UShortArray,
    public var dwCharSet: UInt,
    public var iCategory: Int,
    hIconCtorArg: Hicon,
    public var langID: UShort,
    public var dummy: UShort,
    public var lReserved1: Lparam,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        dwConfig = 0u,
        wchTitle = UShortArray(64),
        wchTitleFontFace = UShortArray(32),
        dwCharSet = 0u,
        iCategory = 0,
        hIconCtorArg = MutPtr(0L),
        langID = 0u,
        dummy = 0u,
        lReserved1 = 0L,
    )

    public operator fun component1(): UInt = this.dwConfig

    public operator fun component2(): UShortArray = this.wchTitle

    public operator fun component3(): UShortArray = this.wchTitleFontFace

    public operator fun component4(): UInt = this.dwCharSet

    public operator fun component5(): Int = this.iCategory

    public operator fun component6(): Hicon = this.hIcon

    public operator fun component7(): UShort = this.langID

    public operator fun component8(): UShort = this.dummy

    public operator fun component9(): Lparam = this.lReserved1

    public fun copy(dwConfig: UInt = this.dwConfig, wchTitle: UShortArray = this.wchTitle, wchTitleFontFace: UShortArray = this.wchTitleFontFace, dwCharSet: UInt = this.dwCharSet, iCategory: Int = this.iCategory, hIcon: Hicon = this.hIcon, langID: UShort = this.langID, dummy: UShort = this.dummy, lReserved1: Lparam = this.lReserved1): Imeappletcfg = Imeappletcfg(dwConfig = dwConfig, wchTitle = wchTitle, wchTitleFontFace = wchTitleFontFace, dwCharSet = dwCharSet, iCategory = iCategory, hIconCtorArg = hIcon, langID = langID, dummy = dummy, lReserved1 = lReserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeappletcfg) return false
        if (this.dwConfig != other.dwConfig) return false
        if (!this.wchTitle.contentEquals(other.wchTitle)) return false
        if (!this.wchTitleFontFace.contentEquals(other.wchTitleFontFace)) return false
        if (this.dwCharSet != other.dwCharSet) return false
        if (this.iCategory != other.iCategory) return false
        if (this.hIcon != other.hIcon) return false
        if (this.langID != other.langID) return false
        if (this.dummy != other.dummy) return false
        if (this.lReserved1 != other.lReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwConfig.hashCode()
        result = 31 * result + this.wchTitle.contentHashCode()
        result = 31 * result + this.wchTitleFontFace.contentHashCode()
        result = 31 * result + this.dwCharSet.hashCode()
        result = 31 * result + this.iCategory.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.langID.hashCode()
        result = 31 * result + this.dummy.hashCode()
        result = 31 * result + this.lReserved1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwConfig: UInt = 0u,
            wchTitle: UShortArray = UShortArray(64),
            wchTitleFontFace: UShortArray = UShortArray(32),
            dwCharSet: UInt = 0u,
            iCategory: Int = 0,
            hIcon: Hicon = MutPtr(0L),
            langID: UShort = 0u,
            dummy: UShort = 0u,
            lReserved1: Lparam = 0L,
        ): Imeappletcfg =
            Imeappletcfg(
                dwConfig = dwConfig,
                wchTitle = wchTitle,
                wchTitleFontFace = wchTitleFontFace,
                dwCharSet = dwCharSet,
                iCategory = iCategory,
                hIconCtorArg = hIcon,
                langID = langID,
                dummy = dummy,
                lReserved1 = lReserved1,
            )
    }
}

public class Imeappletui internal constructor(
    hwndCtorArg: Hwnd,
    public var dwStyle: UInt,
    public var width: Int,
    public var height: Int,
    public var minWidth: Int,
    public var minHeight: Int,
    public var maxWidth: Int,
    public var maxHeight: Int,
    public var lReserved1: Lparam,
    public var lReserved2: Lparam,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        dwStyle = 0u,
        width = 0,
        height = 0,
        minWidth = 0,
        minHeight = 0,
        maxWidth = 0,
        maxHeight = 0,
        lReserved1 = 0L,
        lReserved2 = 0L,
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.dwStyle

    public operator fun component3(): Int = this.width

    public operator fun component4(): Int = this.height

    public operator fun component5(): Int = this.minWidth

    public operator fun component6(): Int = this.minHeight

    public operator fun component7(): Int = this.maxWidth

    public operator fun component8(): Int = this.maxHeight

    public operator fun component9(): Lparam = this.lReserved1

    public operator fun component10(): Lparam = this.lReserved2

    public fun copy(hwnd: Hwnd = this.hwnd, dwStyle: UInt = this.dwStyle, width: Int = this.width, height: Int = this.height, minWidth: Int = this.minWidth, minHeight: Int = this.minHeight, maxWidth: Int = this.maxWidth, maxHeight: Int = this.maxHeight, lReserved1: Lparam = this.lReserved1, lReserved2: Lparam = this.lReserved2): Imeappletui = Imeappletui(hwndCtorArg = hwnd, dwStyle = dwStyle, width = width, height = height, minWidth = minWidth, minHeight = minHeight, maxWidth = maxWidth, maxHeight = maxHeight, lReserved1 = lReserved1, lReserved2 = lReserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeappletui) return false
        if (this.hwnd != other.hwnd) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.minWidth != other.minWidth) return false
        if (this.minHeight != other.minHeight) return false
        if (this.maxWidth != other.maxWidth) return false
        if (this.maxHeight != other.maxHeight) return false
        if (this.lReserved1 != other.lReserved1) return false
        if (this.lReserved2 != other.lReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.minWidth.hashCode()
        result = 31 * result + this.minHeight.hashCode()
        result = 31 * result + this.maxWidth.hashCode()
        result = 31 * result + this.maxHeight.hashCode()
        result = 31 * result + this.lReserved1.hashCode()
        result = 31 * result + this.lReserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            dwStyle: UInt = 0u,
            width: Int = 0,
            height: Int = 0,
            minWidth: Int = 0,
            minHeight: Int = 0,
            maxWidth: Int = 0,
            maxHeight: Int = 0,
            lReserved1: Lparam = 0L,
            lReserved2: Lparam = 0L,
        ): Imeappletui =
            Imeappletui(
                hwndCtorArg = hwnd,
                dwStyle = dwStyle,
                width = width,
                height = height,
                minWidth = minWidth,
                minHeight = minHeight,
                maxWidth = maxWidth,
                maxHeight = maxHeight,
                lReserved1 = lReserved1,
                lReserved2 = lReserved2,
            )
    }
}

public data class Imecharinfo(
    public var wch: UShort = 0u,
    public var dwCharInfo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imecharinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imecharinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Imecharinfo =
                    Imecharinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Imecharinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCharInfo)
                }
            }
    }
}

public data class Imecharposition(
    public var dwSize: UInt = 0u,
    public var dwCharPos: UInt = 0u,
    public var pt: Point = Point(),
    public var cLineHeight: UInt = 0u,
    public var rcDocument: Rect = Rect(),
)

public data class Imecompositionstringinfo(
    public var iCompStrLen: Int = 0,
    public var iCaretPos: Int = 0,
    public var iEditStart: Int = 0,
    public var iEditLen: Int = 0,
    public var iTargetStart: Int = 0,
    public var iTargetLen: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imecompositionstringinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imecompositionstringinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Imecompositionstringinfo =
                    Imecompositionstringinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Imecompositionstringinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iCompStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iCaretPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iEditStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iEditLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iTargetStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.iTargetLen)
                }
            }
    }
}

public class Imedlg internal constructor(
    public var cbIMEDLG: Int,
    hwndCtorArg: Hwnd,
    lpwstrWordCtorArg: Pwstr,
    public var nTabId: Int,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpwstrWord: Pwstr = lpwstrWordCtorArg
        internal set

    public constructor() : this(
        cbIMEDLG = 0,
        hwndCtorArg = MutPtr(0L),
        lpwstrWordCtorArg = MutPtr(0L),
        nTabId = 0,
    )

    public operator fun component1(): Int = this.cbIMEDLG

    public operator fun component2(): Hwnd = this.hwnd

    public operator fun component3(): Pwstr = this.lpwstrWord

    public operator fun component4(): Int = this.nTabId

    public fun copy(cbIMEDLG: Int = this.cbIMEDLG, hwnd: Hwnd = this.hwnd, lpwstrWord: Pwstr = this.lpwstrWord, nTabId: Int = this.nTabId): Imedlg = Imedlg(cbIMEDLG = cbIMEDLG, hwndCtorArg = hwnd, lpwstrWordCtorArg = lpwstrWord, nTabId = nTabId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imedlg) return false
        if (this.cbIMEDLG != other.cbIMEDLG) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpwstrWord != other.lpwstrWord) return false
        if (this.nTabId != other.nTabId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbIMEDLG.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpwstrWord.hashCode()
        result = 31 * result + this.nTabId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbIMEDLG: Int = 0,
            hwnd: Hwnd = MutPtr(0L),
            lpwstrWord: Pwstr = MutPtr(0L),
            nTabId: Int = 0,
        ): Imedlg =
            Imedlg(
                cbIMEDLG = cbIMEDLG,
                hwndCtorArg = hwnd,
                lpwstrWordCtorArg = lpwstrWord,
                nTabId = nTabId,
            )
    }
}

public data class Imedp(
    public var wrdModifier: Imewrd = Imewrd(),
    public var wrdModifiee: Imewrd = Imewrd(),
    public var relID: Imerel = 0,
)

public data class Imefareastinfo(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imefareastinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (!this.dwData.contentEquals(other.dwData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imefareastinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imefareastinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Imefareastinfo =
                    Imefareastinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Imefareastinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.dwData.toList())
                }
            }
    }
}

public data class Imeinfo(
    public var dwPrivateDataSize: UInt = 0u,
    public var fdwProperty: UInt = 0u,
    public var fdwConversionCaps: UInt = 0u,
    public var fdwSentenceCaps: UInt = 0u,
    public var fdwUICaps: UInt = 0u,
    public var fdwSCSCaps: UInt = 0u,
    public var fdwSelectCaps: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Imeinfo =
                    Imeinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Imeinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPrivateDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fdwProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fdwConversionCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fdwSentenceCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwUICaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fdwSCSCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fdwSelectCaps)
                }
            }
    }
}

public class Imeitem internal constructor(
    public var cbSize: Int,
    public var iType: Int,
    lpItemDataCtorArg: MutPtr,
) {
    public var lpItemData: MutPtr = lpItemDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        iType = 0,
        lpItemDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Int = this.iType

    public operator fun component3(): MutPtr = this.lpItemData

    public fun copy(cbSize: Int = this.cbSize, iType: Int = this.iType, lpItemData: MutPtr = this.lpItemData): Imeitem = Imeitem(cbSize = cbSize, iType = iType, lpItemDataCtorArg = lpItemData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeitem) return false
        if (this.cbSize != other.cbSize) return false
        if (this.iType != other.iType) return false
        if (this.lpItemData != other.lpItemData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.iType.hashCode()
        result = 31 * result + this.lpItemData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeitem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeitem> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Imeitem =
                    Imeitem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Imeitem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpItemData)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            iType: Int = 0,
            lpItemData: MutPtr = MutPtr(0L),
        ): Imeitem =
            Imeitem(
                cbSize = cbSize,
                iType = iType,
                lpItemDataCtorArg = lpItemData,
            )
    }
}

public data class Imeitemcandidate(
    public var uCount: UInt = 0u,
    public var imeItem: List<Imeitem> = List(1) { Imeitem() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeitemcandidate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeitemcandidate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Imeitemcandidate =
                    Imeitemcandidate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Imeitem.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Imeitemcandidate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Imeitem.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.imeItem)
                }
            }
    }
}

public class Imekms internal constructor(
    public var cbSize: Int,
    hIMCCtorArg: Himc,
    public var cKeyList: UInt,
    pKeyListCtorArg: MutPtr,
) {
    public var hIMC: Himc = hIMCCtorArg
        internal set

    public var pKeyList: MutPtr = pKeyListCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        hIMCCtorArg = MutPtr(0L),
        cKeyList = 0u,
        pKeyListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Himc = this.hIMC

    public operator fun component3(): UInt = this.cKeyList

    public operator fun component4(): MutPtr = this.pKeyList

    public fun copy(cbSize: Int = this.cbSize, hIMC: Himc = this.hIMC, cKeyList: UInt = this.cKeyList, pKeyList: MutPtr = this.pKeyList): Imekms = Imekms(cbSize = cbSize, hIMCCtorArg = hIMC, cKeyList = cKeyList, pKeyListCtorArg = pKeyList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekms) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIMC != other.hIMC) return false
        if (this.cKeyList != other.cKeyList) return false
        if (this.pKeyList != other.pKeyList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIMC.hashCode()
        result = 31 * result + this.cKeyList.hashCode()
        result = 31 * result + this.pKeyList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Imekms =
                    Imekms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Imekms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.hIMC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cKeyList)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pKeyList)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            hIMC: Himc = MutPtr(0L),
            cKeyList: UInt = 0u,
            pKeyList: MutPtr = MutPtr(0L),
        ): Imekms =
            Imekms(
                cbSize = cbSize,
                hIMCCtorArg = hIMC,
                cKeyList = cKeyList,
                pKeyListCtorArg = pKeyList,
            )
    }
}

public data class Imekmsfuncdesc(
    public var cbSize: Int = 0,
    public var idLang: UShort = 0u,
    public var dwControl: UInt = 0u,
    public var pwszDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmsfuncdesc) return false
        if (this.cbSize != other.cbSize) return false
        if (this.idLang != other.idLang) return false
        if (this.dwControl != other.dwControl) return false
        if (!this.pwszDescription.contentEquals(other.pwszDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.idLang.hashCode()
        result = 31 * result + this.dwControl.hashCode()
        result = 31 * result + this.pwszDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsfuncdesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsfuncdesc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 266L
                override fun readNative(addr: Long): Imekmsfuncdesc =
                    Imekmsfuncdesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 10L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Imekmsfuncdesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.idLang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.dwControl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 10L, value.pwszDescription.toList())
                }
            }
    }
}

public class Imekmsinit internal constructor(
    public var cbSize: Int,
    hWndCtorArg: Hwnd,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        hWndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Hwnd = this.hWnd

    public fun copy(cbSize: Int = this.cbSize, hWnd: Hwnd = this.hWnd): Imekmsinit = Imekmsinit(cbSize = cbSize, hWndCtorArg = hWnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmsinit) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hWnd != other.hWnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
        ): Imekmsinit =
            Imekmsinit(
                cbSize = cbSize,
                hWndCtorArg = hWnd,
            )
    }
}

public class Imekmsinvk internal constructor(
    public var cbSize: Int,
    hIMCCtorArg: Himc,
    public var dwControl: UInt,
) {
    public var hIMC: Himc = hIMCCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        hIMCCtorArg = MutPtr(0L),
        dwControl = 0u,
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Himc = this.hIMC

    public operator fun component3(): UInt = this.dwControl

    public fun copy(cbSize: Int = this.cbSize, hIMC: Himc = this.hIMC, dwControl: UInt = this.dwControl): Imekmsinvk = Imekmsinvk(cbSize = cbSize, hIMCCtorArg = hIMC, dwControl = dwControl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmsinvk) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIMC != other.hIMC) return false
        if (this.dwControl != other.dwControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIMC.hashCode()
        result = 31 * result + this.dwControl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsinvk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsinvk> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Imekmsinvk =
                    Imekmsinvk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Imekmsinvk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.hIMC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwControl)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            hIMC: Himc = MutPtr(0L),
            dwControl: UInt = 0u,
        ): Imekmsinvk =
            Imekmsinvk(
                cbSize = cbSize,
                hIMCCtorArg = hIMC,
                dwControl = dwControl,
            )
    }
}

public data class Imekmskey(
    public var dwStatus: UInt = 0u,
    public var dwCompStatus: UInt = 0u,
    public var dwVKEY: UInt = 0u,
    public var anonymous1: Imekmskey0 = Imekmskey0(),
    public var anonymous2: Imekmskey1 = Imekmskey1(),
)

public data class Imekmskey0(
    public var dwControl: UInt = 0u,
    public var dwNotUsed: UInt = 0u,
)

public data class Imekmskey1(
    public var pwszDscr: UShortArray = UShortArray(31),
    public var pwszNoUse: UShortArray = UShortArray(31),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmskey1) return false
        if (!this.pwszDscr.contentEquals(other.pwszDscr)) return false
        if (!this.pwszNoUse.contentEquals(other.pwszNoUse)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDscr.contentHashCode()
        result = 31 * result + this.pwszNoUse.contentHashCode()
        return result
    }
}

public class Imekmskmp internal constructor(
    public var cbSize: Int,
    hIMCCtorArg: Himc,
    public var idLang: UShort,
    public var wVKStart: UShort,
    public var wVKEnd: UShort,
    public var cKeyList: Int,
    pKeyListCtorArg: MutPtr,
) {
    public var hIMC: Himc = hIMCCtorArg
        internal set

    public var pKeyList: MutPtr = pKeyListCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        hIMCCtorArg = MutPtr(0L),
        idLang = 0u,
        wVKStart = 0u,
        wVKEnd = 0u,
        cKeyList = 0,
        pKeyListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Himc = this.hIMC

    public operator fun component3(): UShort = this.idLang

    public operator fun component4(): UShort = this.wVKStart

    public operator fun component5(): UShort = this.wVKEnd

    public operator fun component6(): Int = this.cKeyList

    public operator fun component7(): MutPtr = this.pKeyList

    public fun copy(cbSize: Int = this.cbSize, hIMC: Himc = this.hIMC, idLang: UShort = this.idLang, wVKStart: UShort = this.wVKStart, wVKEnd: UShort = this.wVKEnd, cKeyList: Int = this.cKeyList, pKeyList: MutPtr = this.pKeyList): Imekmskmp = Imekmskmp(cbSize = cbSize, hIMCCtorArg = hIMC, idLang = idLang, wVKStart = wVKStart, wVKEnd = wVKEnd, cKeyList = cKeyList, pKeyListCtorArg = pKeyList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmskmp) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIMC != other.hIMC) return false
        if (this.idLang != other.idLang) return false
        if (this.wVKStart != other.wVKStart) return false
        if (this.wVKEnd != other.wVKEnd) return false
        if (this.cKeyList != other.cKeyList) return false
        if (this.pKeyList != other.pKeyList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIMC.hashCode()
        result = 31 * result + this.idLang.hashCode()
        result = 31 * result + this.wVKStart.hashCode()
        result = 31 * result + this.wVKEnd.hashCode()
        result = 31 * result + this.cKeyList.hashCode()
        result = 31 * result + this.pKeyList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmskmp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmskmp> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 30L
                override fun readNative(addr: Long): Imekmskmp =
                    Imekmskmp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: Imekmskmp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.hIMC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.idLang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wVKStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.wVKEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 18L, value.cKeyList)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 22L, value.pKeyList)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            hIMC: Himc = MutPtr(0L),
            idLang: UShort = 0u,
            wVKStart: UShort = 0u,
            wVKEnd: UShort = 0u,
            cKeyList: Int = 0,
            pKeyList: MutPtr = MutPtr(0L),
        ): Imekmskmp =
            Imekmskmp(
                cbSize = cbSize,
                hIMCCtorArg = hIMC,
                idLang = idLang,
                wVKStart = wVKStart,
                wVKEnd = wVKEnd,
                cKeyList = cKeyList,
                pKeyListCtorArg = pKeyList,
            )
    }
}

public class Imekmsntfy internal constructor(
    public var cbSize: Int,
    hIMCCtorArg: Himc,
    public var fSelect: Bool,
) {
    public var hIMC: Himc = hIMCCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        hIMCCtorArg = MutPtr(0L),
        fSelect = 0,
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Himc = this.hIMC

    public operator fun component3(): Bool = this.fSelect

    public fun copy(cbSize: Int = this.cbSize, hIMC: Himc = this.hIMC, fSelect: Bool = this.fSelect): Imekmsntfy = Imekmsntfy(cbSize = cbSize, hIMCCtorArg = hIMC, fSelect = fSelect)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imekmsntfy) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIMC != other.hIMC) return false
        if (this.fSelect != other.fSelect) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIMC.hashCode()
        result = 31 * result + this.fSelect.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsntfy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imekmsntfy> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Imekmsntfy =
                    Imekmsntfy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Imekmsntfy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.hIMC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fSelect)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            hIMC: Himc = MutPtr(0L),
            fSelect: Bool = 0,
        ): Imekmsntfy =
            Imekmsntfy(
                cbSize = cbSize,
                hIMCCtorArg = hIMC,
                fSelect = fSelect,
            )
    }
}

public class Imemenuiteminfoa internal constructor(
    public var cbSize: UInt,
    public var fType: UInt,
    public var fState: UInt,
    public var wID: UInt,
    hbmpCheckedCtorArg: Hbitmap,
    hbmpUncheckedCtorArg: Hbitmap,
    public var dwItemData: UInt,
    public var szString: ByteArray,
    hbmpItemCtorArg: Hbitmap,
) {
    public var hbmpChecked: Hbitmap = hbmpCheckedCtorArg
        internal set

    public var hbmpUnchecked: Hbitmap = hbmpUncheckedCtorArg
        internal set

    public var hbmpItem: Hbitmap = hbmpItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fType = 0u,
        fState = 0u,
        wID = 0u,
        hbmpCheckedCtorArg = MutPtr(0L),
        hbmpUncheckedCtorArg = MutPtr(0L),
        dwItemData = 0u,
        szString = ByteArray(80),
        hbmpItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fType

    public operator fun component3(): UInt = this.fState

    public operator fun component4(): UInt = this.wID

    public operator fun component5(): Hbitmap = this.hbmpChecked

    public operator fun component6(): Hbitmap = this.hbmpUnchecked

    public operator fun component7(): UInt = this.dwItemData

    public operator fun component8(): ByteArray = this.szString

    public operator fun component9(): Hbitmap = this.hbmpItem

    public fun copy(cbSize: UInt = this.cbSize, fType: UInt = this.fType, fState: UInt = this.fState, wID: UInt = this.wID, hbmpChecked: Hbitmap = this.hbmpChecked, hbmpUnchecked: Hbitmap = this.hbmpUnchecked, dwItemData: UInt = this.dwItemData, szString: ByteArray = this.szString, hbmpItem: Hbitmap = this.hbmpItem): Imemenuiteminfoa = Imemenuiteminfoa(cbSize = cbSize, fType = fType, fState = fState, wID = wID, hbmpCheckedCtorArg = hbmpChecked, hbmpUncheckedCtorArg = hbmpUnchecked, dwItemData = dwItemData, szString = szString, hbmpItemCtorArg = hbmpItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imemenuiteminfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (!this.szString.contentEquals(other.szString)) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.szString.contentHashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fType: UInt = 0u,
            fState: UInt = 0u,
            wID: UInt = 0u,
            hbmpChecked: Hbitmap = MutPtr(0L),
            hbmpUnchecked: Hbitmap = MutPtr(0L),
            dwItemData: UInt = 0u,
            szString: ByteArray = ByteArray(80),
            hbmpItem: Hbitmap = MutPtr(0L),
        ): Imemenuiteminfoa =
            Imemenuiteminfoa(
                cbSize = cbSize,
                fType = fType,
                fState = fState,
                wID = wID,
                hbmpCheckedCtorArg = hbmpChecked,
                hbmpUncheckedCtorArg = hbmpUnchecked,
                dwItemData = dwItemData,
                szString = szString,
                hbmpItemCtorArg = hbmpItem,
            )
    }
}

public class Imemenuiteminfow internal constructor(
    public var cbSize: UInt,
    public var fType: UInt,
    public var fState: UInt,
    public var wID: UInt,
    hbmpCheckedCtorArg: Hbitmap,
    hbmpUncheckedCtorArg: Hbitmap,
    public var dwItemData: UInt,
    public var szString: UShortArray,
    hbmpItemCtorArg: Hbitmap,
) {
    public var hbmpChecked: Hbitmap = hbmpCheckedCtorArg
        internal set

    public var hbmpUnchecked: Hbitmap = hbmpUncheckedCtorArg
        internal set

    public var hbmpItem: Hbitmap = hbmpItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fType = 0u,
        fState = 0u,
        wID = 0u,
        hbmpCheckedCtorArg = MutPtr(0L),
        hbmpUncheckedCtorArg = MutPtr(0L),
        dwItemData = 0u,
        szString = UShortArray(80),
        hbmpItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fType

    public operator fun component3(): UInt = this.fState

    public operator fun component4(): UInt = this.wID

    public operator fun component5(): Hbitmap = this.hbmpChecked

    public operator fun component6(): Hbitmap = this.hbmpUnchecked

    public operator fun component7(): UInt = this.dwItemData

    public operator fun component8(): UShortArray = this.szString

    public operator fun component9(): Hbitmap = this.hbmpItem

    public fun copy(cbSize: UInt = this.cbSize, fType: UInt = this.fType, fState: UInt = this.fState, wID: UInt = this.wID, hbmpChecked: Hbitmap = this.hbmpChecked, hbmpUnchecked: Hbitmap = this.hbmpUnchecked, dwItemData: UInt = this.dwItemData, szString: UShortArray = this.szString, hbmpItem: Hbitmap = this.hbmpItem): Imemenuiteminfow = Imemenuiteminfow(cbSize = cbSize, fType = fType, fState = fState, wID = wID, hbmpCheckedCtorArg = hbmpChecked, hbmpUncheckedCtorArg = hbmpUnchecked, dwItemData = dwItemData, szString = szString, hbmpItemCtorArg = hbmpItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imemenuiteminfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (!this.szString.contentEquals(other.szString)) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.szString.contentHashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fType: UInt = 0u,
            fState: UInt = 0u,
            wID: UInt = 0u,
            hbmpChecked: Hbitmap = MutPtr(0L),
            hbmpUnchecked: Hbitmap = MutPtr(0L),
            dwItemData: UInt = 0u,
            szString: UShortArray = UShortArray(80),
            hbmpItem: Hbitmap = MutPtr(0L),
        ): Imemenuiteminfow =
            Imemenuiteminfow(
                cbSize = cbSize,
                fType = fType,
                fState = fState,
                wID = wID,
                hbmpCheckedCtorArg = hbmpChecked,
                hbmpUncheckedCtorArg = hbmpUnchecked,
                dwItemData = dwItemData,
                szString = szString,
                hbmpItemCtorArg = hbmpItem,
            )
    }
}

public data class Imeshf(
    public var cbShf: UShort = 0u,
    public var verDic: UShort = 0u,
    public var szTitle: ByteArray = ByteArray(48),
    public var szDescription: ByteArray = ByteArray(256),
    public var szCopyright: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeshf) return false
        if (this.cbShf != other.cbShf) return false
        if (this.verDic != other.verDic) return false
        if (!this.szTitle.contentEquals(other.szTitle)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szCopyright.contentEquals(other.szCopyright)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbShf.hashCode()
        result = 31 * result + this.verDic.hashCode()
        result = 31 * result + this.szTitle.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szCopyright.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeshf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imeshf> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 436L
                override fun readNative(addr: Long): Imeshf =
                    Imeshf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 52L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 308L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Imeshf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbShf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.verDic)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                    ).writeNative(addr + 4L, value.szTitle.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 52L, value.szDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 308L, value.szCopyright.toList())
                }
            }
    }
}

public class Imestringcandidate internal constructor(
    public var uCount: UInt,
    lpwstrCtorArg: List<Pwstr>,
) {
    public var lpwstr: List<Pwstr> = lpwstrCtorArg
        internal set

    public constructor() : this(
        uCount = 0u,
        lpwstrCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.uCount

    public operator fun component2(): List<Pwstr> = this.lpwstr

    public fun copy(uCount: UInt = this.uCount, lpwstr: List<Pwstr> = this.lpwstr): Imestringcandidate = Imestringcandidate(uCount = uCount, lpwstrCtorArg = lpwstr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imestringcandidate) return false
        if (this.uCount != other.uCount) return false
        if (this.lpwstr != other.lpwstr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uCount.hashCode()
        result = 31 * result + this.lpwstr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uCount: UInt = 0u,
            lpwstr: List<Pwstr> = List(1) { MutPtr(0L) },
        ): Imestringcandidate =
            Imestringcandidate(
                uCount = uCount,
                lpwstrCtorArg = lpwstr,
            )
    }
}

public class Imestringcandidateinfo internal constructor(
    public var dwFarEastId: UInt,
    lpFarEastInfoCtorArg: MutPtr,
    public var fInfoMask: UInt,
    public var iSelIndex: Int,
    public var uCount: UInt,
    lpwstrCtorArg: List<Pwstr>,
) {
    public var lpFarEastInfo: MutPtr = lpFarEastInfoCtorArg
        internal set

    public var lpwstr: List<Pwstr> = lpwstrCtorArg
        internal set

    public constructor() : this(
        dwFarEastId = 0u,
        lpFarEastInfoCtorArg = MutPtr(0L),
        fInfoMask = 0u,
        iSelIndex = 0,
        uCount = 0u,
        lpwstrCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.dwFarEastId

    public operator fun component2(): MutPtr = this.lpFarEastInfo

    public operator fun component3(): UInt = this.fInfoMask

    public operator fun component4(): Int = this.iSelIndex

    public operator fun component5(): UInt = this.uCount

    public operator fun component6(): List<Pwstr> = this.lpwstr

    public fun copy(dwFarEastId: UInt = this.dwFarEastId, lpFarEastInfo: MutPtr = this.lpFarEastInfo, fInfoMask: UInt = this.fInfoMask, iSelIndex: Int = this.iSelIndex, uCount: UInt = this.uCount, lpwstr: List<Pwstr> = this.lpwstr): Imestringcandidateinfo = Imestringcandidateinfo(dwFarEastId = dwFarEastId, lpFarEastInfoCtorArg = lpFarEastInfo, fInfoMask = fInfoMask, iSelIndex = iSelIndex, uCount = uCount, lpwstrCtorArg = lpwstr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imestringcandidateinfo) return false
        if (this.dwFarEastId != other.dwFarEastId) return false
        if (this.lpFarEastInfo != other.lpFarEastInfo) return false
        if (this.fInfoMask != other.fInfoMask) return false
        if (this.iSelIndex != other.iSelIndex) return false
        if (this.uCount != other.uCount) return false
        if (this.lpwstr != other.lpwstr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFarEastId.hashCode()
        result = 31 * result + this.lpFarEastInfo.hashCode()
        result = 31 * result + this.fInfoMask.hashCode()
        result = 31 * result + this.iSelIndex.hashCode()
        result = 31 * result + this.uCount.hashCode()
        result = 31 * result + this.lpwstr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFarEastId: UInt = 0u,
            lpFarEastInfo: MutPtr = MutPtr(0L),
            fInfoMask: UInt = 0u,
            iSelIndex: Int = 0,
            uCount: UInt = 0u,
            lpwstr: List<Pwstr> = List(1) { MutPtr(0L) },
        ): Imestringcandidateinfo =
            Imestringcandidateinfo(
                dwFarEastId = dwFarEastId,
                lpFarEastInfoCtorArg = lpFarEastInfo,
                fInfoMask = fInfoMask,
                iSelIndex = iSelIndex,
                uCount = uCount,
                lpwstrCtorArg = lpwstr,
            )
    }
}

public class Imestringinfo internal constructor(
    public var dwFarEastId: UInt,
    lpwstrCtorArg: Pwstr,
) {
    public var lpwstr: Pwstr = lpwstrCtorArg
        internal set

    public constructor() : this(
        dwFarEastId = 0u,
        lpwstrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFarEastId

    public operator fun component2(): Pwstr = this.lpwstr

    public fun copy(dwFarEastId: UInt = this.dwFarEastId, lpwstr: Pwstr = this.lpwstr): Imestringinfo = Imestringinfo(dwFarEastId = dwFarEastId, lpwstrCtorArg = lpwstr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imestringinfo) return false
        if (this.dwFarEastId != other.dwFarEastId) return false
        if (this.lpwstr != other.lpwstr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFarEastId.hashCode()
        result = 31 * result + this.lpwstr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFarEastId: UInt = 0u,
            lpwstr: Pwstr = MutPtr(0L),
        ): Imestringinfo =
            Imestringinfo(
                dwFarEastId = dwFarEastId,
                lpwstrCtorArg = lpwstr,
            )
    }
}

public class Imewrd internal constructor(
    pwchReadingCtorArg: Pwstr,
    pwchDisplayCtorArg: Pwstr,
    public var anonymous: Imewrd0,
    public var rgulAttrs: UIntArray,
    public var cbComment: Int,
    public var uct: Imeuct,
    pvCommentCtorArg: MutPtr,
) {
    public var pwchReading: Pwstr = pwchReadingCtorArg
        internal set

    public var pwchDisplay: Pwstr = pwchDisplayCtorArg
        internal set

    public var pvComment: MutPtr = pvCommentCtorArg
        internal set

    public constructor() : this(
        pwchReadingCtorArg = MutPtr(0L),
        pwchDisplayCtorArg = MutPtr(0L),
        anonymous = Imewrd0(),
        rgulAttrs = UIntArray(2),
        cbComment = 0,
        uct = 0,
        pvCommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwchReading

    public operator fun component2(): Pwstr = this.pwchDisplay

    public operator fun component3(): Imewrd0 = this.anonymous

    public operator fun component4(): UIntArray = this.rgulAttrs

    public operator fun component5(): Int = this.cbComment

    public operator fun component6(): Imeuct = this.uct

    public operator fun component7(): MutPtr = this.pvComment

    public fun copy(pwchReading: Pwstr = this.pwchReading, pwchDisplay: Pwstr = this.pwchDisplay, anonymous: Imewrd0 = this.anonymous, rgulAttrs: UIntArray = this.rgulAttrs, cbComment: Int = this.cbComment, uct: Imeuct = this.uct, pvComment: MutPtr = this.pvComment): Imewrd = Imewrd(pwchReadingCtorArg = pwchReading, pwchDisplayCtorArg = pwchDisplay, anonymous = anonymous, rgulAttrs = rgulAttrs, cbComment = cbComment, uct = uct, pvCommentCtorArg = pvComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imewrd) return false
        if (this.pwchReading != other.pwchReading) return false
        if (this.pwchDisplay != other.pwchDisplay) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.rgulAttrs.contentEquals(other.rgulAttrs)) return false
        if (this.cbComment != other.cbComment) return false
        if (this.uct != other.uct) return false
        if (this.pvComment != other.pvComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwchReading.hashCode()
        result = 31 * result + this.pwchDisplay.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rgulAttrs.contentHashCode()
        result = 31 * result + this.cbComment.hashCode()
        result = 31 * result + this.uct.hashCode()
        result = 31 * result + this.pvComment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwchReading: Pwstr = MutPtr(0L),
            pwchDisplay: Pwstr = MutPtr(0L),
            anonymous: Imewrd0 = Imewrd0(),
            rgulAttrs: UIntArray = UIntArray(2),
            cbComment: Int = 0,
            uct: Imeuct = 0,
            pvComment: MutPtr = MutPtr(0L),
        ): Imewrd =
            Imewrd(
                pwchReadingCtorArg = pwchReading,
                pwchDisplayCtorArg = pwchDisplay,
                anonymous = anonymous,
                rgulAttrs = rgulAttrs,
                cbComment = cbComment,
                uct = uct,
                pvCommentCtorArg = pvComment,
            )
    }
}

public data class Imewrd0(
    public var ulPos: UInt = 0u,
    public var anonymous: Imewrd00 = Imewrd00(),
)

public data class Imewrd00(
    public var nPos1: UShort = 0u,
    public var nPos2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imewrd00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Imewrd00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Imewrd00 =
                    Imewrd00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Imewrd00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nPos1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nPos2)
                }
            }
    }
}

public class Inputcontext internal constructor(
    hWndCtorArg: Hwnd,
    public var fOpen: Bool,
    public var ptStatusWndPos: Point,
    public var ptSoftKbdPos: Point,
    public var fdwConversion: UInt,
    public var fdwSentence: UInt,
    public var lfFont: Inputcontext0,
    public var cfCompForm: Compositionform,
    public var cfCandForm: List<Candidateform>,
    hCompStrCtorArg: Himcc,
    hCandInfoCtorArg: Himcc,
    hGuideLineCtorArg: Himcc,
    hPrivateCtorArg: Himcc,
    public var dwNumMsgBuf: UInt,
    hMsgBufCtorArg: Himcc,
    public var fdwInit: UInt,
    public var dwReserve: UIntArray,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var hCompStr: Himcc = hCompStrCtorArg
        internal set

    public var hCandInfo: Himcc = hCandInfoCtorArg
        internal set

    public var hGuideLine: Himcc = hGuideLineCtorArg
        internal set

    public var hPrivate: Himcc = hPrivateCtorArg
        internal set

    public var hMsgBuf: Himcc = hMsgBufCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        fOpen = 0,
        ptStatusWndPos = Point(),
        ptSoftKbdPos = Point(),
        fdwConversion = 0u,
        fdwSentence = 0u,
        lfFont = Inputcontext0(),
        cfCompForm = Compositionform(),
        cfCandForm = List(4) { Candidateform() },
        hCompStrCtorArg = MutPtr(0L),
        hCandInfoCtorArg = MutPtr(0L),
        hGuideLineCtorArg = MutPtr(0L),
        hPrivateCtorArg = MutPtr(0L),
        dwNumMsgBuf = 0u,
        hMsgBufCtorArg = MutPtr(0L),
        fdwInit = 0u,
        dwReserve = UIntArray(3),
    )

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            fOpen: Bool = 0,
            ptStatusWndPos: Point = Point(),
            ptSoftKbdPos: Point = Point(),
            fdwConversion: UInt = 0u,
            fdwSentence: UInt = 0u,
            lfFont: Inputcontext0 = Inputcontext0(),
            cfCompForm: Compositionform = Compositionform(),
            cfCandForm: List<Candidateform> = List(4) { Candidateform() },
            hCompStr: Himcc = MutPtr(0L),
            hCandInfo: Himcc = MutPtr(0L),
            hGuideLine: Himcc = MutPtr(0L),
            hPrivate: Himcc = MutPtr(0L),
            dwNumMsgBuf: UInt = 0u,
            hMsgBuf: Himcc = MutPtr(0L),
            fdwInit: UInt = 0u,
            dwReserve: UIntArray = UIntArray(3),
        ): Inputcontext =
            Inputcontext(
                hWndCtorArg = hWnd,
                fOpen = fOpen,
                ptStatusWndPos = ptStatusWndPos,
                ptSoftKbdPos = ptSoftKbdPos,
                fdwConversion = fdwConversion,
                fdwSentence = fdwSentence,
                lfFont = lfFont,
                cfCompForm = cfCompForm,
                cfCandForm = cfCandForm,
                hCompStrCtorArg = hCompStr,
                hCandInfoCtorArg = hCandInfo,
                hGuideLineCtorArg = hGuideLine,
                hPrivateCtorArg = hPrivate,
                dwNumMsgBuf = dwNumMsgBuf,
                hMsgBufCtorArg = hMsgBuf,
                fdwInit = fdwInit,
                dwReserve = dwReserve,
            )
    }
}

public data class Inputcontext0(
    public var a: Logfonta = Logfonta(),
    public var w: Logfontw = Logfontw(),
)

public class Morrslt internal constructor(
    public var dwSize: UInt,
    pwchOutputCtorArg: Pwstr,
    public var cchOutput: UShort,
    public var anonymous1: Morrslt0,
    public var anonymous2: Morrslt1,
    pchInputPosCtorArg: MutPtr,
    pchOutputIdxWDDCtorArg: MutPtr,
    public var anonymous3: Morrslt2,
    paMonoRubyPosCtorArg: MutPtr,
    pWDDCtorArg: MutPtr,
    public var cWDD: Int,
    pPrivateCtorArg: MutPtr,
    public var bLKBuff: UShortArray,
) {
    public var pwchOutput: Pwstr = pwchOutputCtorArg
        internal set

    public var pchInputPos: MutPtr = pchInputPosCtorArg
        internal set

    public var pchOutputIdxWDD: MutPtr = pchOutputIdxWDDCtorArg
        internal set

    public var paMonoRubyPos: MutPtr = paMonoRubyPosCtorArg
        internal set

    public var pWDD: MutPtr = pWDDCtorArg
        internal set

    public var pPrivate: MutPtr = pPrivateCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwchOutputCtorArg = MutPtr(0L),
        cchOutput = 0u,
        anonymous1 = Morrslt0(),
        anonymous2 = Morrslt1(),
        pchInputPosCtorArg = MutPtr(0L),
        pchOutputIdxWDDCtorArg = MutPtr(0L),
        anonymous3 = Morrslt2(),
        paMonoRubyPosCtorArg = MutPtr(0L),
        pWDDCtorArg = MutPtr(0L),
        cWDD = 0,
        pPrivateCtorArg = MutPtr(0L),
        bLKBuff = UShortArray(1),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwchOutput

    public operator fun component3(): UShort = this.cchOutput

    public operator fun component4(): Morrslt0 = this.anonymous1

    public operator fun component5(): Morrslt1 = this.anonymous2

    public operator fun component6(): MutPtr = this.pchInputPos

    public operator fun component7(): MutPtr = this.pchOutputIdxWDD

    public operator fun component8(): Morrslt2 = this.anonymous3

    public operator fun component9(): MutPtr = this.paMonoRubyPos

    public operator fun component10(): MutPtr = this.pWDD

    public operator fun component11(): Int = this.cWDD

    public operator fun component12(): MutPtr = this.pPrivate

    public operator fun component13(): UShortArray = this.bLKBuff

    public fun copy(dwSize: UInt = this.dwSize, pwchOutput: Pwstr = this.pwchOutput, cchOutput: UShort = this.cchOutput, anonymous1: Morrslt0 = this.anonymous1, anonymous2: Morrslt1 = this.anonymous2, pchInputPos: MutPtr = this.pchInputPos, pchOutputIdxWDD: MutPtr = this.pchOutputIdxWDD, anonymous3: Morrslt2 = this.anonymous3, paMonoRubyPos: MutPtr = this.paMonoRubyPos, pWDD: MutPtr = this.pWDD, cWDD: Int = this.cWDD, pPrivate: MutPtr = this.pPrivate, bLKBuff: UShortArray = this.bLKBuff): Morrslt = Morrslt(dwSize = dwSize, pwchOutputCtorArg = pwchOutput, cchOutput = cchOutput, anonymous1 = anonymous1, anonymous2 = anonymous2, pchInputPosCtorArg = pchInputPos, pchOutputIdxWDDCtorArg = pchOutputIdxWDD, anonymous3 = anonymous3, paMonoRubyPosCtorArg = paMonoRubyPos, pWDDCtorArg = pWDD, cWDD = cWDD, pPrivateCtorArg = pPrivate, bLKBuff = bLKBuff)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Morrslt) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwchOutput != other.pwchOutput) return false
        if (this.cchOutput != other.cchOutput) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pchInputPos != other.pchInputPos) return false
        if (this.pchOutputIdxWDD != other.pchOutputIdxWDD) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.paMonoRubyPos != other.paMonoRubyPos) return false
        if (this.pWDD != other.pWDD) return false
        if (this.cWDD != other.cWDD) return false
        if (this.pPrivate != other.pPrivate) return false
        if (!this.bLKBuff.contentEquals(other.bLKBuff)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwchOutput.hashCode()
        result = 31 * result + this.cchOutput.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pchInputPos.hashCode()
        result = 31 * result + this.pchOutputIdxWDD.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.paMonoRubyPos.hashCode()
        result = 31 * result + this.pWDD.hashCode()
        result = 31 * result + this.cWDD.hashCode()
        result = 31 * result + this.pPrivate.hashCode()
        result = 31 * result + this.bLKBuff.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwchOutput: Pwstr = MutPtr(0L),
            cchOutput: UShort = 0u,
            anonymous1: Morrslt0 = Morrslt0(),
            anonymous2: Morrslt1 = Morrslt1(),
            pchInputPos: MutPtr = MutPtr(0L),
            pchOutputIdxWDD: MutPtr = MutPtr(0L),
            anonymous3: Morrslt2 = Morrslt2(),
            paMonoRubyPos: MutPtr = MutPtr(0L),
            pWDD: MutPtr = MutPtr(0L),
            cWDD: Int = 0,
            pPrivate: MutPtr = MutPtr(0L),
            bLKBuff: UShortArray = UShortArray(1),
        ): Morrslt =
            Morrslt(
                dwSize = dwSize,
                pwchOutputCtorArg = pwchOutput,
                cchOutput = cchOutput,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pchInputPosCtorArg = pchInputPos,
                pchOutputIdxWDDCtorArg = pchOutputIdxWDD,
                anonymous3 = anonymous3,
                paMonoRubyPosCtorArg = paMonoRubyPos,
                pWDDCtorArg = pWDD,
                cWDD = cWDD,
                pPrivateCtorArg = pPrivate,
                bLKBuff = bLKBuff,
            )
    }
}

public class Morrslt0 internal constructor(
    pwchReadCtorArg: Pwstr,
    pwchCompCtorArg: Pwstr,
) {
    public var pwchRead: Pwstr = pwchReadCtorArg
        internal set

    public var pwchComp: Pwstr = pwchCompCtorArg
        internal set

    public constructor() : this(
        pwchReadCtorArg = MutPtr(0L),
        pwchCompCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwchRead

    public operator fun component2(): Pwstr = this.pwchComp

    public fun copy(pwchRead: Pwstr = this.pwchRead, pwchComp: Pwstr = this.pwchComp): Morrslt0 = Morrslt0(pwchReadCtorArg = pwchRead, pwchCompCtorArg = pwchComp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Morrslt0) return false
        if (this.pwchRead != other.pwchRead) return false
        if (this.pwchComp != other.pwchComp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwchRead.hashCode()
        result = 31 * result + this.pwchComp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwchRead: Pwstr = MutPtr(0L),
            pwchComp: Pwstr = MutPtr(0L),
        ): Morrslt0 =
            Morrslt0(
                pwchReadCtorArg = pwchRead,
                pwchCompCtorArg = pwchComp,
            )
    }
}

public data class Morrslt1(
    public var cchRead: UShort = 0u,
    public var cchComp: UShort = 0u,
)

public class Morrslt2 internal constructor(
    pchReadIdxWDDCtorArg: MutPtr,
    pchCompIdxWDDCtorArg: MutPtr,
) {
    public var pchReadIdxWDD: MutPtr = pchReadIdxWDDCtorArg
        internal set

    public var pchCompIdxWDD: MutPtr = pchCompIdxWDDCtorArg
        internal set

    public constructor() : this(
        pchReadIdxWDDCtorArg = MutPtr(0L),
        pchCompIdxWDDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pchReadIdxWDD

    public operator fun component2(): MutPtr = this.pchCompIdxWDD

    public fun copy(pchReadIdxWDD: MutPtr = this.pchReadIdxWDD, pchCompIdxWDD: MutPtr = this.pchCompIdxWDD): Morrslt2 = Morrslt2(pchReadIdxWDDCtorArg = pchReadIdxWDD, pchCompIdxWDDCtorArg = pchCompIdxWDD)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Morrslt2) return false
        if (this.pchReadIdxWDD != other.pchReadIdxWDD) return false
        if (this.pchCompIdxWDD != other.pchCompIdxWDD) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pchReadIdxWDD.hashCode()
        result = 31 * result + this.pchCompIdxWDD.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pchReadIdxWDD: MutPtr = MutPtr(0L),
            pchCompIdxWDD: MutPtr = MutPtr(0L),
        ): Morrslt2 =
            Morrslt2(
                pchReadIdxWDDCtorArg = pchReadIdxWDD,
                pchCompIdxWDDCtorArg = pchCompIdxWDD,
            )
    }
}

public class Postbl internal constructor(
    public var nPos: UShort,
    szNameCtorArg: MutPtr,
) {
    public var szName: MutPtr = szNameCtorArg
        internal set

    public constructor() : this(
        nPos = 0u,
        szNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.nPos

    public operator fun component2(): MutPtr = this.szName

    public fun copy(nPos: UShort = this.nPos, szName: MutPtr = this.szName): Postbl = Postbl(nPos = nPos, szNameCtorArg = szName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Postbl) return false
        if (this.nPos != other.nPos) return false
        if (this.szName != other.szName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nPos.hashCode()
        result = 31 * result + this.szName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Postbl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Postbl> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): Postbl =
                    Postbl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Postbl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nPos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 2L, value.szName)
                }
            }

        public operator fun invoke(
            nPos: UShort = 0u,
            szName: MutPtr = MutPtr(0L),
        ): Postbl =
            Postbl(
                nPos = nPos,
                szNameCtorArg = szName,
            )
    }
}

public data class Reconvertstring(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwStrLen: UInt = 0u,
    public var dwStrOffset: UInt = 0u,
    public var dwCompStrLen: UInt = 0u,
    public var dwCompStrOffset: UInt = 0u,
    public var dwTargetStrLen: UInt = 0u,
    public var dwTargetStrOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reconvertstring> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reconvertstring> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Reconvertstring =
                    Reconvertstring(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Reconvertstring) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCompStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCompStrOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTargetStrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwTargetStrOffset)
                }
            }
    }
}

public class Registerworda internal constructor(
    lpReadingCtorArg: Pstr,
    lpWordCtorArg: Pstr,
) {
    public var lpReading: Pstr = lpReadingCtorArg
        internal set

    public var lpWord: Pstr = lpWordCtorArg
        internal set

    public constructor() : this(
        lpReadingCtorArg = MutPtr(0L),
        lpWordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpReading

    public operator fun component2(): Pstr = this.lpWord

    public fun copy(lpReading: Pstr = this.lpReading, lpWord: Pstr = this.lpWord): Registerworda = Registerworda(lpReadingCtorArg = lpReading, lpWordCtorArg = lpWord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Registerworda) return false
        if (this.lpReading != other.lpReading) return false
        if (this.lpWord != other.lpWord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpReading.hashCode()
        result = 31 * result + this.lpWord.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpReading: Pstr = MutPtr(0L),
            lpWord: Pstr = MutPtr(0L),
        ): Registerworda =
            Registerworda(
                lpReadingCtorArg = lpReading,
                lpWordCtorArg = lpWord,
            )
    }
}

public class Registerwordw internal constructor(
    lpReadingCtorArg: Pwstr,
    lpWordCtorArg: Pwstr,
) {
    public var lpReading: Pwstr = lpReadingCtorArg
        internal set

    public var lpWord: Pwstr = lpWordCtorArg
        internal set

    public constructor() : this(
        lpReadingCtorArg = MutPtr(0L),
        lpWordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpReading

    public operator fun component2(): Pwstr = this.lpWord

    public fun copy(lpReading: Pwstr = this.lpReading, lpWord: Pwstr = this.lpWord): Registerwordw = Registerwordw(lpReadingCtorArg = lpReading, lpWordCtorArg = lpWord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Registerwordw) return false
        if (this.lpReading != other.lpReading) return false
        if (this.lpWord != other.lpWord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpReading.hashCode()
        result = 31 * result + this.lpWord.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpReading: Pwstr = MutPtr(0L),
            lpWord: Pwstr = MutPtr(0L),
        ): Registerwordw =
            Registerwordw(
                lpReadingCtorArg = lpReading,
                lpWordCtorArg = lpWord,
            )
    }
}

public data class Softkbddata(
    public var uCount: UInt = 0u,
    public var wCode: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Softkbddata) return false
        if (this.uCount != other.uCount) return false
        if (!this.wCode.contentEquals(other.wCode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uCount.hashCode()
        result = 31 * result + this.wCode.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Softkbddata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Softkbddata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): Softkbddata =
                    Softkbddata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Softkbddata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 4L, value.wCode.toList())
                }
            }
    }
}

public data class Stylebufa(
    public var dwStyle: UInt = 0u,
    public var szDescription: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stylebufa) return false
        if (this.dwStyle != other.dwStyle) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStyle.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylebufa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylebufa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Stylebufa =
                    Stylebufa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Stylebufa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 4L, value.szDescription.toList())
                }
            }
    }
}

public data class Stylebufw(
    public var dwStyle: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stylebufw) return false
        if (this.dwStyle != other.dwStyle) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStyle.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylebufw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylebufw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): Stylebufw =
                    Stylebufw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Stylebufw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.szDescription.toList())
                }
            }
    }
}

public data class Transmsg(
    public var message: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var lParam: Lparam = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transmsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transmsg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Transmsg =
                    Transmsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Transmsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.message)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.wParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lParam)
                }
            }
    }
}

public data class Transmsglist(
    public var uMsgCount: UInt = 0u,
    public var transMsg: List<Transmsg> = List(1) { Transmsg() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transmsglist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transmsglist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Transmsglist =
                    Transmsglist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Transmsg.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Transmsglist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uMsgCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Transmsg.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.transMsg)
                }
            }
    }
}

public class Wdd internal constructor(
    public var wDispPos: UShort,
    public var anonymous1: Wdd0,
    public var cchDisp: UShort,
    public var anonymous2: Wdd1,
    public var wddNReserve1: UInt,
    public var nPos: UShort,
    public var bitfield: UShort,
    pReservedCtorArg: MutPtr,
) {
    public var pReserved: MutPtr = pReservedCtorArg
        internal set

    public constructor() : this(
        wDispPos = 0u,
        anonymous1 = Wdd0(),
        cchDisp = 0u,
        anonymous2 = Wdd1(),
        wddNReserve1 = 0u,
        nPos = 0u,
        bitfield = 0u,
        pReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.wDispPos

    public operator fun component2(): Wdd0 = this.anonymous1

    public operator fun component3(): UShort = this.cchDisp

    public operator fun component4(): Wdd1 = this.anonymous2

    public operator fun component5(): UInt = this.wddNReserve1

    public operator fun component6(): UShort = this.nPos

    public operator fun component7(): UShort = this.bitfield

    public operator fun component8(): MutPtr = this.pReserved

    public fun copy(wDispPos: UShort = this.wDispPos, anonymous1: Wdd0 = this.anonymous1, cchDisp: UShort = this.cchDisp, anonymous2: Wdd1 = this.anonymous2, wddNReserve1: UInt = this.wddNReserve1, nPos: UShort = this.nPos, bitfield: UShort = this.bitfield, pReserved: MutPtr = this.pReserved): Wdd = Wdd(wDispPos = wDispPos, anonymous1 = anonymous1, cchDisp = cchDisp, anonymous2 = anonymous2, wddNReserve1 = wddNReserve1, nPos = nPos, bitfield = bitfield, pReservedCtorArg = pReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wdd) return false
        if (this.wDispPos != other.wDispPos) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.cchDisp != other.cchDisp) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.wddNReserve1 != other.wddNReserve1) return false
        if (this.nPos != other.nPos) return false
        if (this.bitfield != other.bitfield) return false
        if (this.pReserved != other.pReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDispPos.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.cchDisp.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.wddNReserve1.hashCode()
        result = 31 * result + this.nPos.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wDispPos: UShort = 0u,
            anonymous1: Wdd0 = Wdd0(),
            cchDisp: UShort = 0u,
            anonymous2: Wdd1 = Wdd1(),
            wddNReserve1: UInt = 0u,
            nPos: UShort = 0u,
            bitfield: UShort = 0u,
            pReserved: MutPtr = MutPtr(0L),
        ): Wdd =
            Wdd(
                wDispPos = wDispPos,
                anonymous1 = anonymous1,
                cchDisp = cchDisp,
                anonymous2 = anonymous2,
                wddNReserve1 = wddNReserve1,
                nPos = nPos,
                bitfield = bitfield,
                pReservedCtorArg = pReserved,
            )
    }
}

public data class Wdd0(
    public var wReadPos: UShort = 0u,
    public var wCompPos: UShort = 0u,
)

public data class Wdd1(
    public var cchRead: UShort = 0u,
    public var cchComp: UShort = 0u,
)
