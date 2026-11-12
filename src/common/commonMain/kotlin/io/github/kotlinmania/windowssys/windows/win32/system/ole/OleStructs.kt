@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hrsrc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.system.com.ByteSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.DwordSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.FlaggedWordBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.HyperSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearraybound
import io.github.kotlinmania.windowssys.windows.win32.system.com.Typedesc
import io.github.kotlinmania.windowssys.windows.win32.system.com.WordSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderaV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderwV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamew
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MenuItemFlags

public data class Arraydesc(
    public var tdescElem: Typedesc = Typedesc(),
    public var cDims: UShort = 0u,
    public var rgbounds: List<Safearraybound> = List(1) { Safearraybound() },
)

public class Cadword internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr<UInt>,
) {
    public var pElems: MutPtr<UInt> = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr<UInt> = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr<UInt> = this.pElems): Cadword = Cadword(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cadword) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadword> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cadword =
                    Cadword(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cadword) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr<UInt> = MutPtr(0L),
        ): Cadword =
            Cadword(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Calpolestr internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr<Pwstr>,
) {
    public var pElems: MutPtr<Pwstr> = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr<Pwstr> = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr<Pwstr> = this.pElems): Calpolestr = Calpolestr(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Calpolestr) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpolestr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpolestr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Calpolestr =
                    Calpolestr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Calpolestr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pwstr>(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr<Pwstr> = MutPtr(0L),
        ): Calpolestr =
            Calpolestr(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cauuid internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr<Guid>,
) {
    public var pElems: MutPtr<Guid> = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr<Guid> = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr<Guid> = this.pElems): Cauuid = Cauuid(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cauuid) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cauuid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cauuid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cauuid =
                    Cauuid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cauuid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr<Guid> = MutPtr(0L),
        ): Cauuid =
            Cauuid(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cleanlocalstorage internal constructor(
    pInterfaceCtorArg: MutPtr<CVoid>,
    pStorageCtorArg: MutPtr<CVoid>,
    public var flags: UInt,
) {
    public var pInterface: MutPtr<CVoid> = pInterfaceCtorArg
        internal set

    public var pStorage: MutPtr<CVoid> = pStorageCtorArg
        internal set

    public constructor() : this(
        pInterfaceCtorArg = MutPtr(0L),
        pStorageCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pInterface

    public operator fun component2(): MutPtr<CVoid> = this.pStorage

    public operator fun component3(): UInt = this.flags

    public fun copy(pInterface: MutPtr<CVoid> = this.pInterface, pStorage: MutPtr<CVoid> = this.pStorage, flags: UInt = this.flags): Cleanlocalstorage = Cleanlocalstorage(pInterfaceCtorArg = pInterface, pStorageCtorArg = pStorage, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cleanlocalstorage) return false
        if (this.pInterface != other.pInterface) return false
        if (this.pStorage != other.pStorage) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pInterface.hashCode()
        result = 31 * result + this.pStorage.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cleanlocalstorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cleanlocalstorage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Cleanlocalstorage =
                    Cleanlocalstorage(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Cleanlocalstorage) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pInterface)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pStorage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }

        public operator fun invoke(
            pInterface: MutPtr<CVoid> = MutPtr(0L),
            pStorage: MutPtr<CVoid> = MutPtr(0L),
            flags: UInt = 0u,
        ): Cleanlocalstorage =
            Cleanlocalstorage(
                pInterfaceCtorArg = pInterface,
                pStorageCtorArg = pStorage,
                flags = flags,
            )
    }
}

public class Controlinfo internal constructor(
    public var cb: UInt,
    hAccelCtorArg: Haccel,
    public var cAccel: UShort,
    public var dwFlags: UInt,
) {
    public var hAccel: Haccel = hAccelCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        hAccelCtorArg = MutPtr(0L),
        cAccel = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Haccel = this.hAccel

    public operator fun component3(): UShort = this.cAccel

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(cb: UInt = this.cb, hAccel: Haccel = this.hAccel, cAccel: UShort = this.cAccel, dwFlags: UInt = this.dwFlags): Controlinfo = Controlinfo(cb = cb, hAccelCtorArg = hAccel, cAccel = cAccel, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Controlinfo) return false
        if (this.cb != other.cb) return false
        if (this.hAccel != other.hAccel) return false
        if (this.cAccel != other.cAccel) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.hAccel.hashCode()
        result = 31 * result + this.cAccel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            hAccel: Haccel = MutPtr(0L),
            cAccel: UShort = 0u,
            dwFlags: UInt = 0u,
        ): Controlinfo =
            Controlinfo(
                cb = cb,
                hAccelCtorArg = hAccel,
                cAccel = cAccel,
                dwFlags = dwFlags,
            )
    }
}

public data class Dvaspectinfo(
    public var cb: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dvaspectinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dvaspectinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dvaspectinfo =
                    Dvaspectinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dvaspectinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class Dvextentinfo(
    public var cb: UInt = 0u,
    public var dwExtentMode: UInt = 0u,
    public var sizelProposed: Size = Size(),
)

public class Fontdesc internal constructor(
    public var cbSizeofstruct: UInt,
    lpstrNameCtorArg: Pwstr,
    public var cySize: CY,
    public var sWeight: Short,
    public var sCharset: Short,
    public var fItalic: Bool,
    public var fUnderline: Bool,
    public var fStrikethrough: Bool,
) {
    public var lpstrName: Pwstr = lpstrNameCtorArg
        internal set

    public constructor() : this(
        cbSizeofstruct = 0u,
        lpstrNameCtorArg = MutPtr(0L),
        cySize = CY(),
        sWeight = 0,
        sCharset = 0,
        fItalic = 0,
        fUnderline = 0,
        fStrikethrough = 0,
    )

    public operator fun component1(): UInt = this.cbSizeofstruct

    public operator fun component2(): Pwstr = this.lpstrName

    public operator fun component3(): CY = this.cySize

    public operator fun component4(): Short = this.sWeight

    public operator fun component5(): Short = this.sCharset

    public operator fun component6(): Bool = this.fItalic

    public operator fun component7(): Bool = this.fUnderline

    public operator fun component8(): Bool = this.fStrikethrough

    public fun copy(cbSizeofstruct: UInt = this.cbSizeofstruct, lpstrName: Pwstr = this.lpstrName, cySize: CY = this.cySize, sWeight: Short = this.sWeight, sCharset: Short = this.sCharset, fItalic: Bool = this.fItalic, fUnderline: Bool = this.fUnderline, fStrikethrough: Bool = this.fStrikethrough): Fontdesc = Fontdesc(cbSizeofstruct = cbSizeofstruct, lpstrNameCtorArg = lpstrName, cySize = cySize, sWeight = sWeight, sCharset = sCharset, fItalic = fItalic, fUnderline = fUnderline, fStrikethrough = fStrikethrough)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fontdesc) return false
        if (this.cbSizeofstruct != other.cbSizeofstruct) return false
        if (this.lpstrName != other.lpstrName) return false
        if (this.cySize != other.cySize) return false
        if (this.sWeight != other.sWeight) return false
        if (this.sCharset != other.sCharset) return false
        if (this.fItalic != other.fItalic) return false
        if (this.fUnderline != other.fUnderline) return false
        if (this.fStrikethrough != other.fStrikethrough) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSizeofstruct.hashCode()
        result = 31 * result + this.lpstrName.hashCode()
        result = 31 * result + this.cySize.hashCode()
        result = 31 * result + this.sWeight.hashCode()
        result = 31 * result + this.sCharset.hashCode()
        result = 31 * result + this.fItalic.hashCode()
        result = 31 * result + this.fUnderline.hashCode()
        result = 31 * result + this.fStrikethrough.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSizeofstruct: UInt = 0u,
            lpstrName: Pwstr = MutPtr(0L),
            cySize: CY = CY(),
            sWeight: Short = 0,
            sCharset: Short = 0,
            fItalic: Bool = 0,
            fUnderline: Bool = 0,
            fStrikethrough: Bool = 0,
        ): Fontdesc =
            Fontdesc(
                cbSizeofstruct = cbSizeofstruct,
                lpstrNameCtorArg = lpstrName,
                cySize = cySize,
                sWeight = sWeight,
                sCharset = sCharset,
                fItalic = fItalic,
                fUnderline = fUnderline,
                fStrikethrough = fStrikethrough,
            )
    }
}

public class Interfacedata internal constructor(
    pmethdataCtorArg: MutPtr<Methoddata>,
    public var cMembers: UInt,
) {
    public var pmethdata: MutPtr<Methoddata> = pmethdataCtorArg
        internal set

    public constructor() : this(
        pmethdataCtorArg = MutPtr(0L),
        cMembers = 0u,
    )

    public operator fun component1(): MutPtr<Methoddata> = this.pmethdata

    public operator fun component2(): UInt = this.cMembers

    public fun copy(pmethdata: MutPtr<Methoddata> = this.pmethdata, cMembers: UInt = this.cMembers): Interfacedata = Interfacedata(pmethdataCtorArg = pmethdata, cMembers = cMembers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Interfacedata) return false
        if (this.pmethdata != other.pmethdata) return false
        if (this.cMembers != other.cMembers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pmethdata.hashCode()
        result = 31 * result + this.cMembers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Interfacedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Interfacedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Interfacedata =
                    Interfacedata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Methoddata>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Interfacedata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Methoddata>(64)
                    ).writeNative(addr, value.pmethdata)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cMembers)
                }
            }

        public operator fun invoke(
            pmethdata: MutPtr<Methoddata> = MutPtr(0L),
            cMembers: UInt = 0u,
        ): Interfacedata =
            Interfacedata(
                pmethdataCtorArg = pmethdata,
                cMembers = cMembers,
            )
    }
}

public data class Licinfo(
    public var cbLicInfo: Int = 0,
    public var fRuntimeKeyAvail: Bool = 0,
    public var fLicVerified: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Licinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Licinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Licinfo =
                    Licinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Licinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbLicInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fRuntimeKeyAvail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fLicVerified)
                }
            }
    }
}

public class Methoddata internal constructor(
    szNameCtorArg: Pwstr,
    ppdataCtorArg: MutPtr<Paramdata>,
    public var dispid: Int,
    public var iMeth: UInt,
    public var cc: Callconv,
    public var cArgs: UInt,
    public var wFlags: UShort,
    public var vtReturn: Variant.Varenum,
) {
    public var szName: Pwstr = szNameCtorArg
        internal set

    public var ppdata: MutPtr<Paramdata> = ppdataCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        ppdataCtorArg = MutPtr(0L),
        dispid = 0,
        iMeth = 0u,
        cc = 0,
        cArgs = 0u,
        wFlags = 0u,
        vtReturn = 0u,
    )

    public operator fun component1(): Pwstr = this.szName

    public operator fun component2(): MutPtr<Paramdata> = this.ppdata

    public operator fun component3(): Int = this.dispid

    public operator fun component4(): UInt = this.iMeth

    public operator fun component5(): Callconv = this.cc

    public operator fun component6(): UInt = this.cArgs

    public operator fun component7(): UShort = this.wFlags

    public operator fun component8(): Variant.Varenum = this.vtReturn

    public fun copy(szName: Pwstr = this.szName, ppdata: MutPtr<Paramdata> = this.ppdata, dispid: Int = this.dispid, iMeth: UInt = this.iMeth, cc: Callconv = this.cc, cArgs: UInt = this.cArgs, wFlags: UShort = this.wFlags, vtReturn: Variant.Varenum = this.vtReturn): Methoddata = Methoddata(szNameCtorArg = szName, ppdataCtorArg = ppdata, dispid = dispid, iMeth = iMeth, cc = cc, cArgs = cArgs, wFlags = wFlags, vtReturn = vtReturn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Methoddata) return false
        if (this.szName != other.szName) return false
        if (this.ppdata != other.ppdata) return false
        if (this.dispid != other.dispid) return false
        if (this.iMeth != other.iMeth) return false
        if (this.cc != other.cc) return false
        if (this.cArgs != other.cArgs) return false
        if (this.wFlags != other.wFlags) return false
        if (this.vtReturn != other.vtReturn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.ppdata.hashCode()
        result = 31 * result + this.dispid.hashCode()
        result = 31 * result + this.iMeth.hashCode()
        result = 31 * result + this.cc.hashCode()
        result = 31 * result + this.cArgs.hashCode()
        result = 31 * result + this.wFlags.hashCode()
        result = 31 * result + this.vtReturn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pwstr = MutPtr(0L),
            ppdata: MutPtr<Paramdata> = MutPtr(0L),
            dispid: Int = 0,
            iMeth: UInt = 0u,
            cc: Callconv = 0,
            cArgs: UInt = 0u,
            wFlags: UShort = 0u,
            vtReturn: Variant.Varenum = 0u,
        ): Methoddata =
            Methoddata(
                szNameCtorArg = szName,
                ppdataCtorArg = ppdata,
                dispid = dispid,
                iMeth = iMeth,
                cc = cc,
                cArgs = cArgs,
                wFlags = wFlags,
                vtReturn = vtReturn,
            )
    }
}

public data class Numparse(
    public var cDig: Int = 0,
    public var dwInFlags: NumparseFlags = 0u,
    public var dwOutFlags: NumparseFlags = 0u,
    public var cchUsed: Int = 0,
    public var nBaseShift: Int = 0,
    public var nPwr10: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Numparse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Numparse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Numparse =
                    Numparse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Numparse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cDig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwInFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOutFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cchUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.nBaseShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.nPwr10)
                }
            }
    }
}

public data class Objectdescriptor(
    public var cbSize: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var dwDrawAspect: UInt = 0u,
    public var sizel: Size = Size(),
    public var pointl: Pointl = Pointl(),
    public var dwStatus: UInt = 0u,
    public var dwFullUserTypeName: UInt = 0u,
    public var dwSrcOfCopy: UInt = 0u,
)

public class Ocpfiparams internal constructor(
    public var cbStructSize: UInt,
    hWndOwnerCtorArg: Hwnd,
    public var x: Int,
    public var y: Int,
    lpszCaptionCtorArg: Pcwstr,
    public var cObjects: UInt,
    lplpUnkCtorArg: MutPtr<MutPtr<CVoid>>,
    public var cPages: UInt,
    lpPagesCtorArg: MutPtr<Guid>,
    public var lcid: UInt,
    public var dispidInitialProperty: Int,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var lplpUnk: MutPtr<MutPtr<CVoid>> = lplpUnkCtorArg
        internal set

    public var lpPages: MutPtr<Guid> = lpPagesCtorArg
        internal set

    public constructor() : this(
        cbStructSize = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        x = 0,
        y = 0,
        lpszCaptionCtorArg = ConstPtr(0L),
        cObjects = 0u,
        lplpUnkCtorArg = MutPtr(0L),
        cPages = 0u,
        lpPagesCtorArg = MutPtr(0L),
        lcid = 0u,
        dispidInitialProperty = 0,
    )

    public operator fun component1(): UInt = this.cbStructSize

    public operator fun component2(): Hwnd = this.hWndOwner

    public operator fun component3(): Int = this.x

    public operator fun component4(): Int = this.y

    public operator fun component5(): Pcwstr = this.lpszCaption

    public operator fun component6(): UInt = this.cObjects

    public operator fun component7(): MutPtr<MutPtr<CVoid>> = this.lplpUnk

    public operator fun component8(): UInt = this.cPages

    public operator fun component9(): MutPtr<Guid> = this.lpPages

    public operator fun component10(): UInt = this.lcid

    public operator fun component11(): Int = this.dispidInitialProperty

    public fun copy(cbStructSize: UInt = this.cbStructSize, hWndOwner: Hwnd = this.hWndOwner, x: Int = this.x, y: Int = this.y, lpszCaption: Pcwstr = this.lpszCaption, cObjects: UInt = this.cObjects, lplpUnk: MutPtr<MutPtr<CVoid>> = this.lplpUnk, cPages: UInt = this.cPages, lpPages: MutPtr<Guid> = this.lpPages, lcid: UInt = this.lcid, dispidInitialProperty: Int = this.dispidInitialProperty): Ocpfiparams = Ocpfiparams(cbStructSize = cbStructSize, hWndOwnerCtorArg = hWndOwner, x = x, y = y, lpszCaptionCtorArg = lpszCaption, cObjects = cObjects, lplpUnkCtorArg = lplpUnk, cPages = cPages, lpPagesCtorArg = lpPages, lcid = lcid, dispidInitialProperty = dispidInitialProperty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ocpfiparams) return false
        if (this.cbStructSize != other.cbStructSize) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.cObjects != other.cObjects) return false
        if (this.lplpUnk != other.lplpUnk) return false
        if (this.cPages != other.cPages) return false
        if (this.lpPages != other.lpPages) return false
        if (this.lcid != other.lcid) return false
        if (this.dispidInitialProperty != other.dispidInitialProperty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStructSize.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.cObjects.hashCode()
        result = 31 * result + this.lplpUnk.hashCode()
        result = 31 * result + this.cPages.hashCode()
        result = 31 * result + this.lpPages.hashCode()
        result = 31 * result + this.lcid.hashCode()
        result = 31 * result + this.dispidInitialProperty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStructSize: UInt = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            x: Int = 0,
            y: Int = 0,
            lpszCaption: Pcwstr = ConstPtr(0L),
            cObjects: UInt = 0u,
            lplpUnk: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            cPages: UInt = 0u,
            lpPages: MutPtr<Guid> = MutPtr(0L),
            lcid: UInt = 0u,
            dispidInitialProperty: Int = 0,
        ): Ocpfiparams =
            Ocpfiparams(
                cbStructSize = cbStructSize,
                hWndOwnerCtorArg = hWndOwner,
                x = x,
                y = y,
                lpszCaptionCtorArg = lpszCaption,
                cObjects = cObjects,
                lplpUnkCtorArg = lplpUnk,
                cPages = cPages,
                lpPagesCtorArg = lpPages,
                lcid = lcid,
                dispidInitialProperty = dispidInitialProperty,
            )
    }
}

public data class Olecmd(
    public var cmdID: UInt = 0u,
    public var cmdf: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olecmd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olecmd> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Olecmd =
                    Olecmd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Olecmd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmdID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cmdf)
                }
            }
    }
}

public data class Olecmdtext(
    public var cmdtextf: UInt = 0u,
    public var cwActual: UInt = 0u,
    public var cwBuf: UInt = 0u,
    public var rgwz: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Olecmdtext) return false
        if (this.cmdtextf != other.cmdtextf) return false
        if (this.cwActual != other.cwActual) return false
        if (this.cwBuf != other.cwBuf) return false
        if (!this.rgwz.contentEquals(other.rgwz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmdtextf.hashCode()
        result = 31 * result + this.cwActual.hashCode()
        result = 31 * result + this.cwBuf.hashCode()
        result = 31 * result + this.rgwz.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olecmdtext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olecmdtext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Olecmdtext =
                    Olecmdtext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Olecmdtext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmdtextf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cwActual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cwBuf)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.rgwz.toList())
                }
            }
    }
}

public class Oleinplaceframeinfo internal constructor(
    public var cb: UInt,
    public var fMDIApp: Bool,
    hwndFrameCtorArg: Hwnd,
    haccelCtorArg: Haccel,
    public var cAccelEntries: UInt,
) {
    public var hwndFrame: Hwnd = hwndFrameCtorArg
        internal set

    public var haccel: Haccel = haccelCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        fMDIApp = 0,
        hwndFrameCtorArg = MutPtr(0L),
        haccelCtorArg = MutPtr(0L),
        cAccelEntries = 0u,
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Bool = this.fMDIApp

    public operator fun component3(): Hwnd = this.hwndFrame

    public operator fun component4(): Haccel = this.haccel

    public operator fun component5(): UInt = this.cAccelEntries

    public fun copy(cb: UInt = this.cb, fMDIApp: Bool = this.fMDIApp, hwndFrame: Hwnd = this.hwndFrame, haccel: Haccel = this.haccel, cAccelEntries: UInt = this.cAccelEntries): Oleinplaceframeinfo = Oleinplaceframeinfo(cb = cb, fMDIApp = fMDIApp, hwndFrameCtorArg = hwndFrame, haccelCtorArg = haccel, cAccelEntries = cAccelEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleinplaceframeinfo) return false
        if (this.cb != other.cb) return false
        if (this.fMDIApp != other.fMDIApp) return false
        if (this.hwndFrame != other.hwndFrame) return false
        if (this.haccel != other.haccel) return false
        if (this.cAccelEntries != other.cAccelEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fMDIApp.hashCode()
        result = 31 * result + this.hwndFrame.hashCode()
        result = 31 * result + this.haccel.hashCode()
        result = 31 * result + this.cAccelEntries.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            fMDIApp: Bool = 0,
            hwndFrame: Hwnd = MutPtr(0L),
            haccel: Haccel = MutPtr(0L),
            cAccelEntries: UInt = 0u,
        ): Oleinplaceframeinfo =
            Oleinplaceframeinfo(
                cb = cb,
                fMDIApp = fMDIApp,
                hwndFrameCtorArg = hwndFrame,
                haccelCtorArg = haccel,
                cAccelEntries = cAccelEntries,
            )
    }
}

public data class Olemenugroupwidths(
    public var width: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Olemenugroupwidths) return false
        if (!this.width.contentEquals(other.width)) return false
        return true
    }

    override fun hashCode(): Int = this.width.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olemenugroupwidths> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olemenugroupwidths> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Olemenugroupwidths =
                    Olemenugroupwidths(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                        ).readNative(addr).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Olemenugroupwidths) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                    ).writeNative(addr, value.width.toList())
                }
            }
    }
}

public class Oleuibusya internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: BusyDialogFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    hTaskCtorArg: Htask,
    lphWndDialogCtorArg: MutPtr<Hwnd>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hTask: Htask = hTaskCtorArg
        internal set

    public var lphWndDialog: MutPtr<Hwnd> = lphWndDialogCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        hTaskCtorArg = MutPtr(0L),
        lphWndDialogCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): BusyDialogFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): Htask = this.hTask

    public operator fun component11(): MutPtr<Hwnd> = this.lphWndDialog

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: BusyDialogFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, hTask: Htask = this.hTask, lphWndDialog: MutPtr<Hwnd> = this.lphWndDialog): Oleuibusya = Oleuibusya(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, hTaskCtorArg = hTask, lphWndDialogCtorArg = lphWndDialog)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuibusya) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hTask != other.hTask) return false
        if (this.lphWndDialog != other.lphWndDialog) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.lphWndDialog.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: BusyDialogFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            hTask: Htask = MutPtr(0L),
            lphWndDialog: MutPtr<Hwnd> = MutPtr(0L),
        ): Oleuibusya =
            Oleuibusya(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                hTaskCtorArg = hTask,
                lphWndDialogCtorArg = lphWndDialog,
            )
    }
}

public class Oleuibusyw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: BusyDialogFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    hTaskCtorArg: Htask,
    lphWndDialogCtorArg: MutPtr<Hwnd>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hTask: Htask = hTaskCtorArg
        internal set

    public var lphWndDialog: MutPtr<Hwnd> = lphWndDialogCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        hTaskCtorArg = MutPtr(0L),
        lphWndDialogCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): BusyDialogFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcwstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcwstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): Htask = this.hTask

    public operator fun component11(): MutPtr<Hwnd> = this.lphWndDialog

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: BusyDialogFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcwstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcwstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, hTask: Htask = this.hTask, lphWndDialog: MutPtr<Hwnd> = this.lphWndDialog): Oleuibusyw = Oleuibusyw(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, hTaskCtorArg = hTask, lphWndDialogCtorArg = lphWndDialog)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuibusyw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hTask != other.hTask) return false
        if (this.lphWndDialog != other.lphWndDialog) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.lphWndDialog.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: BusyDialogFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            hTask: Htask = MutPtr(0L),
            lphWndDialog: MutPtr<Hwnd> = MutPtr(0L),
        ): Oleuibusyw =
            Oleuibusyw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                hTaskCtorArg = hTask,
                lphWndDialogCtorArg = lphWndDialog,
            )
    }
}

public class Oleuichangeicona internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ChangeIconFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    hMetaPictCtorArg: Hglobal,
    public var clsid: Guid,
    public var szIconExe: ByteArray,
    public var cchIconExe: Int,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        hMetaPictCtorArg = MutPtr(0L),
        clsid = Guid(),
        szIconExe = ByteArray(260),
        cchIconExe = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ChangeIconFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): Hglobal = this.hMetaPict

    public operator fun component11(): Guid = this.clsid

    public operator fun component12(): ByteArray = this.szIconExe

    public operator fun component13(): Int = this.cchIconExe

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ChangeIconFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, hMetaPict: Hglobal = this.hMetaPict, clsid: Guid = this.clsid, szIconExe: ByteArray = this.szIconExe, cchIconExe: Int = this.cchIconExe): Oleuichangeicona = Oleuichangeicona(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, hMetaPictCtorArg = hMetaPict, clsid = clsid, szIconExe = szIconExe, cchIconExe = cchIconExe)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuichangeicona) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hMetaPict != other.hMetaPict) return false
        if (this.clsid != other.clsid) return false
        if (!this.szIconExe.contentEquals(other.szIconExe)) return false
        if (this.cchIconExe != other.cchIconExe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hMetaPict.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.szIconExe.contentHashCode()
        result = 31 * result + this.cchIconExe.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ChangeIconFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            hMetaPict: Hglobal = MutPtr(0L),
            clsid: Guid = Guid(),
            szIconExe: ByteArray = ByteArray(260),
            cchIconExe: Int = 0,
        ): Oleuichangeicona =
            Oleuichangeicona(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                hMetaPictCtorArg = hMetaPict,
                clsid = clsid,
                szIconExe = szIconExe,
                cchIconExe = cchIconExe,
            )
    }
}

public class Oleuichangeiconw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ChangeIconFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    hMetaPictCtorArg: Hglobal,
    public var clsid: Guid,
    public var szIconExe: UShortArray,
    public var cchIconExe: Int,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        hMetaPictCtorArg = MutPtr(0L),
        clsid = Guid(),
        szIconExe = UShortArray(260),
        cchIconExe = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ChangeIconFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcwstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcwstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): Hglobal = this.hMetaPict

    public operator fun component11(): Guid = this.clsid

    public operator fun component12(): UShortArray = this.szIconExe

    public operator fun component13(): Int = this.cchIconExe

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ChangeIconFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcwstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcwstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, hMetaPict: Hglobal = this.hMetaPict, clsid: Guid = this.clsid, szIconExe: UShortArray = this.szIconExe, cchIconExe: Int = this.cchIconExe): Oleuichangeiconw = Oleuichangeiconw(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, hMetaPictCtorArg = hMetaPict, clsid = clsid, szIconExe = szIconExe, cchIconExe = cchIconExe)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuichangeiconw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hMetaPict != other.hMetaPict) return false
        if (this.clsid != other.clsid) return false
        if (!this.szIconExe.contentEquals(other.szIconExe)) return false
        if (this.cchIconExe != other.cchIconExe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hMetaPict.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.szIconExe.contentHashCode()
        result = 31 * result + this.cchIconExe.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ChangeIconFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            hMetaPict: Hglobal = MutPtr(0L),
            clsid: Guid = Guid(),
            szIconExe: UShortArray = UShortArray(260),
            cchIconExe: Int = 0,
        ): Oleuichangeiconw =
            Oleuichangeiconw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                hMetaPictCtorArg = hMetaPict,
                clsid = clsid,
                szIconExe = szIconExe,
                cchIconExe = cchIconExe,
            )
    }
}

public class Oleuichangesourcea internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ChangeSourceFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    lpOFNCtorArg: MutPtr<Openfilenamea>,
    public var dwReserved1: UIntArray,
    lpOleUILinkContainerCtorArg: MutPtr<CVoid>,
    public var dwLink: UInt,
    lpszDisplayNameCtorArg: Pstr,
    public var nFileLength: UInt,
    lpszFromCtorArg: Pstr,
    lpszToCtorArg: Pstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpOFN: MutPtr<Openfilenamea> = lpOFNCtorArg
        internal set

    public var lpOleUILinkContainer: MutPtr<CVoid> = lpOleUILinkContainerCtorArg
        internal set

    public var lpszDisplayName: Pstr = lpszDisplayNameCtorArg
        internal set

    public var lpszFrom: Pstr = lpszFromCtorArg
        internal set

    public var lpszTo: Pstr = lpszToCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpOFNCtorArg = MutPtr(0L),
        dwReserved1 = UIntArray(4),
        lpOleUILinkContainerCtorArg = MutPtr(0L),
        dwLink = 0u,
        lpszDisplayNameCtorArg = MutPtr(0L),
        nFileLength = 0u,
        lpszFromCtorArg = MutPtr(0L),
        lpszToCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ChangeSourceFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpOFN: MutPtr<Openfilenamea> = MutPtr(0L),
            dwReserved1: UIntArray = UIntArray(4),
            lpOleUILinkContainer: MutPtr<CVoid> = MutPtr(0L),
            dwLink: UInt = 0u,
            lpszDisplayName: Pstr = MutPtr(0L),
            nFileLength: UInt = 0u,
            lpszFrom: Pstr = MutPtr(0L),
            lpszTo: Pstr = MutPtr(0L),
        ): Oleuichangesourcea =
            Oleuichangesourcea(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpOFNCtorArg = lpOFN,
                dwReserved1 = dwReserved1,
                lpOleUILinkContainerCtorArg = lpOleUILinkContainer,
                dwLink = dwLink,
                lpszDisplayNameCtorArg = lpszDisplayName,
                nFileLength = nFileLength,
                lpszFromCtorArg = lpszFrom,
                lpszToCtorArg = lpszTo,
            )
    }
}

public class Oleuichangesourcew internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ChangeSourceFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    lpOFNCtorArg: MutPtr<Openfilenamew>,
    public var dwReserved1: UIntArray,
    lpOleUILinkContainerCtorArg: MutPtr<CVoid>,
    public var dwLink: UInt,
    lpszDisplayNameCtorArg: Pwstr,
    public var nFileLength: UInt,
    lpszFromCtorArg: Pwstr,
    lpszToCtorArg: Pwstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpOFN: MutPtr<Openfilenamew> = lpOFNCtorArg
        internal set

    public var lpOleUILinkContainer: MutPtr<CVoid> = lpOleUILinkContainerCtorArg
        internal set

    public var lpszDisplayName: Pwstr = lpszDisplayNameCtorArg
        internal set

    public var lpszFrom: Pwstr = lpszFromCtorArg
        internal set

    public var lpszTo: Pwstr = lpszToCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpOFNCtorArg = MutPtr(0L),
        dwReserved1 = UIntArray(4),
        lpOleUILinkContainerCtorArg = MutPtr(0L),
        dwLink = 0u,
        lpszDisplayNameCtorArg = MutPtr(0L),
        nFileLength = 0u,
        lpszFromCtorArg = MutPtr(0L),
        lpszToCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ChangeSourceFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpOFN: MutPtr<Openfilenamew> = MutPtr(0L),
            dwReserved1: UIntArray = UIntArray(4),
            lpOleUILinkContainer: MutPtr<CVoid> = MutPtr(0L),
            dwLink: UInt = 0u,
            lpszDisplayName: Pwstr = MutPtr(0L),
            nFileLength: UInt = 0u,
            lpszFrom: Pwstr = MutPtr(0L),
            lpszTo: Pwstr = MutPtr(0L),
        ): Oleuichangesourcew =
            Oleuichangesourcew(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpOFNCtorArg = lpOFN,
                dwReserved1 = dwReserved1,
                lpOleUILinkContainerCtorArg = lpOleUILinkContainer,
                dwLink = dwLink,
                lpszDisplayNameCtorArg = lpszDisplayName,
                nFileLength = nFileLength,
                lpszFromCtorArg = lpszFrom,
                lpszToCtorArg = lpszTo,
            )
    }
}

public class Oleuiconverta internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UiConvertFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    public var clsid: Guid,
    public var clsidConvertDefault: Guid,
    public var clsidActivateDefault: Guid,
    public var clsidNew: Guid,
    public var dvAspect: UInt,
    public var wFormat: UShort,
    public var fIsLinkedObject: Bool,
    hMetaPictCtorArg: Hglobal,
    lpszUserTypeCtorArg: Pstr,
    public var fObjectsIconChanged: Bool,
    lpszDefLabelCtorArg: Pstr,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public var lpszUserType: Pstr = lpszUserTypeCtorArg
        internal set

    public var lpszDefLabel: Pstr = lpszDefLabelCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        clsid = Guid(),
        clsidConvertDefault = Guid(),
        clsidActivateDefault = Guid(),
        clsidNew = Guid(),
        dvAspect = 0u,
        wFormat = 0u,
        fIsLinkedObject = 0,
        hMetaPictCtorArg = MutPtr(0L),
        lpszUserTypeCtorArg = MutPtr(0L),
        fObjectsIconChanged = 0,
        lpszDefLabelCtorArg = MutPtr(0L),
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UiConvertFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            clsid: Guid = Guid(),
            clsidConvertDefault: Guid = Guid(),
            clsidActivateDefault: Guid = Guid(),
            clsidNew: Guid = Guid(),
            dvAspect: UInt = 0u,
            wFormat: UShort = 0u,
            fIsLinkedObject: Bool = 0,
            hMetaPict: Hglobal = MutPtr(0L),
            lpszUserType: Pstr = MutPtr(0L),
            fObjectsIconChanged: Bool = 0,
            lpszDefLabel: Pstr = MutPtr(0L),
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
        ): Oleuiconverta =
            Oleuiconverta(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                clsid = clsid,
                clsidConvertDefault = clsidConvertDefault,
                clsidActivateDefault = clsidActivateDefault,
                clsidNew = clsidNew,
                dvAspect = dvAspect,
                wFormat = wFormat,
                fIsLinkedObject = fIsLinkedObject,
                hMetaPictCtorArg = hMetaPict,
                lpszUserTypeCtorArg = lpszUserType,
                fObjectsIconChanged = fObjectsIconChanged,
                lpszDefLabelCtorArg = lpszDefLabel,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
            )
    }
}

public class Oleuiconvertw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UiConvertFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    public var clsid: Guid,
    public var clsidConvertDefault: Guid,
    public var clsidActivateDefault: Guid,
    public var clsidNew: Guid,
    public var dvAspect: UInt,
    public var wFormat: UShort,
    public var fIsLinkedObject: Bool,
    hMetaPictCtorArg: Hglobal,
    lpszUserTypeCtorArg: Pwstr,
    public var fObjectsIconChanged: Bool,
    lpszDefLabelCtorArg: Pwstr,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public var lpszUserType: Pwstr = lpszUserTypeCtorArg
        internal set

    public var lpszDefLabel: Pwstr = lpszDefLabelCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        clsid = Guid(),
        clsidConvertDefault = Guid(),
        clsidActivateDefault = Guid(),
        clsidNew = Guid(),
        dvAspect = 0u,
        wFormat = 0u,
        fIsLinkedObject = 0,
        hMetaPictCtorArg = MutPtr(0L),
        lpszUserTypeCtorArg = MutPtr(0L),
        fObjectsIconChanged = 0,
        lpszDefLabelCtorArg = MutPtr(0L),
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UiConvertFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            clsid: Guid = Guid(),
            clsidConvertDefault: Guid = Guid(),
            clsidActivateDefault: Guid = Guid(),
            clsidNew: Guid = Guid(),
            dvAspect: UInt = 0u,
            wFormat: UShort = 0u,
            fIsLinkedObject: Bool = 0,
            hMetaPict: Hglobal = MutPtr(0L),
            lpszUserType: Pwstr = MutPtr(0L),
            fObjectsIconChanged: Bool = 0,
            lpszDefLabel: Pwstr = MutPtr(0L),
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
        ): Oleuiconvertw =
            Oleuiconvertw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                clsid = clsid,
                clsidConvertDefault = clsidConvertDefault,
                clsidActivateDefault = clsidActivateDefault,
                clsidNew = clsidNew,
                dvAspect = dvAspect,
                wFormat = wFormat,
                fIsLinkedObject = fIsLinkedObject,
                hMetaPictCtorArg = hMetaPict,
                lpszUserTypeCtorArg = lpszUserType,
                fObjectsIconChanged = fObjectsIconChanged,
                lpszDefLabelCtorArg = lpszDefLabel,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
            )
    }
}

public class Oleuieditlinksa internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: EditLinksFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    lpOleUILinkContainerCtorArg: MutPtr<CVoid>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpOleUILinkContainer: MutPtr<CVoid> = lpOleUILinkContainerCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpOleUILinkContainerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): EditLinksFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): MutPtr<CVoid> = this.lpOleUILinkContainer

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: EditLinksFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, lpOleUILinkContainer: MutPtr<CVoid> = this.lpOleUILinkContainer): Oleuieditlinksa = Oleuieditlinksa(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, lpOleUILinkContainerCtorArg = lpOleUILinkContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuieditlinksa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.lpOleUILinkContainer != other.lpOleUILinkContainer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.lpOleUILinkContainer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: EditLinksFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpOleUILinkContainer: MutPtr<CVoid> = MutPtr(0L),
        ): Oleuieditlinksa =
            Oleuieditlinksa(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpOleUILinkContainerCtorArg = lpOleUILinkContainer,
            )
    }
}

public class Oleuieditlinksw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: EditLinksFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    lpOleUILinkContainerCtorArg: MutPtr<CVoid>,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpOleUILinkContainer: MutPtr<CVoid> = lpOleUILinkContainerCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpOleUILinkContainerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): EditLinksFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hWndOwner

    public operator fun component4(): Pcwstr = this.lpszCaption

    public operator fun component5(): Lpfnoleuihook = this.lpfnHook

    public operator fun component6(): Lparam = this.lCustData

    public operator fun component7(): Hinstance = this.hInstance

    public operator fun component8(): Pcwstr = this.lpszTemplate

    public operator fun component9(): Hrsrc = this.hResource

    public operator fun component10(): MutPtr<CVoid> = this.lpOleUILinkContainer

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: EditLinksFlags = this.dwFlags, hWndOwner: Hwnd = this.hWndOwner, lpszCaption: Pcwstr = this.lpszCaption, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, hInstance: Hinstance = this.hInstance, lpszTemplate: Pcwstr = this.lpszTemplate, hResource: Hrsrc = this.hResource, lpOleUILinkContainer: MutPtr<CVoid> = this.lpOleUILinkContainer): Oleuieditlinksw = Oleuieditlinksw(cbStruct = cbStruct, dwFlags = dwFlags, hWndOwnerCtorArg = hWndOwner, lpszCaptionCtorArg = lpszCaption, lpfnHook = lpfnHook, lCustData = lCustData, hInstanceCtorArg = hInstance, lpszTemplateCtorArg = lpszTemplate, hResourceCtorArg = hResource, lpOleUILinkContainerCtorArg = lpOleUILinkContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuieditlinksw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.lpOleUILinkContainer != other.lpOleUILinkContainer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.lpOleUILinkContainer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: EditLinksFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpOleUILinkContainer: MutPtr<CVoid> = MutPtr(0L),
        ): Oleuieditlinksw =
            Oleuieditlinksw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpOleUILinkContainerCtorArg = lpOleUILinkContainer,
            )
    }
}

public class Oleuignrlpropsa internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsa>,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsa> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsa> = this.lpOP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsa> = this.lpOP): Oleuignrlpropsa = Oleuignrlpropsa(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuignrlpropsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsa> = MutPtr(0L),
        ): Oleuignrlpropsa =
            Oleuignrlpropsa(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
            )
    }
}

public class Oleuignrlpropsw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsw>,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsw> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsw> = this.lpOP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsw> = this.lpOP): Oleuignrlpropsw = Oleuignrlpropsw(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuignrlpropsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsw> = MutPtr(0L),
        ): Oleuignrlpropsw =
            Oleuignrlpropsw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
            )
    }
}

public class Oleuiinsertobjecta internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: InsertObjectFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    public var clsid: Guid,
    lpszFileCtorArg: Pstr,
    public var cchFile: UInt,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
    public var iid: Guid,
    public var oleRender: UInt,
    lpFormatEtcCtorArg: MutPtr<Formatetc>,
    lpIOleClientSiteCtorArg: MutPtr<CVoid>,
    lpIStorageCtorArg: MutPtr<CVoid>,
    ppvObjCtorArg: MutPtr<MutPtr<CVoid>>,
    public var sc: Int,
    hMetaPictCtorArg: Hglobal,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpszFile: Pstr = lpszFileCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public var lpFormatEtc: MutPtr<Formatetc> = lpFormatEtcCtorArg
        internal set

    public var lpIOleClientSite: MutPtr<CVoid> = lpIOleClientSiteCtorArg
        internal set

    public var lpIStorage: MutPtr<CVoid> = lpIStorageCtorArg
        internal set

    public var ppvObj: MutPtr<MutPtr<CVoid>> = ppvObjCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        clsid = Guid(),
        lpszFileCtorArg = MutPtr(0L),
        cchFile = 0u,
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
        iid = Guid(),
        oleRender = 0u,
        lpFormatEtcCtorArg = MutPtr(0L),
        lpIOleClientSiteCtorArg = MutPtr(0L),
        lpIStorageCtorArg = MutPtr(0L),
        ppvObjCtorArg = MutPtr(0L),
        sc = 0,
        hMetaPictCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: InsertObjectFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            clsid: Guid = Guid(),
            lpszFile: Pstr = MutPtr(0L),
            cchFile: UInt = 0u,
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
            iid: Guid = Guid(),
            oleRender: UInt = 0u,
            lpFormatEtc: MutPtr<Formatetc> = MutPtr(0L),
            lpIOleClientSite: MutPtr<CVoid> = MutPtr(0L),
            lpIStorage: MutPtr<CVoid> = MutPtr(0L),
            ppvObj: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            sc: Int = 0,
            hMetaPict: Hglobal = MutPtr(0L),
        ): Oleuiinsertobjecta =
            Oleuiinsertobjecta(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                clsid = clsid,
                lpszFileCtorArg = lpszFile,
                cchFile = cchFile,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
                iid = iid,
                oleRender = oleRender,
                lpFormatEtcCtorArg = lpFormatEtc,
                lpIOleClientSiteCtorArg = lpIOleClientSite,
                lpIStorageCtorArg = lpIStorage,
                ppvObjCtorArg = ppvObj,
                sc = sc,
                hMetaPictCtorArg = hMetaPict,
            )
    }
}

public class Oleuiinsertobjectw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: InsertObjectFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    public var clsid: Guid,
    lpszFileCtorArg: Pwstr,
    public var cchFile: UInt,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
    public var iid: Guid,
    public var oleRender: UInt,
    lpFormatEtcCtorArg: MutPtr<Formatetc>,
    lpIOleClientSiteCtorArg: MutPtr<CVoid>,
    lpIStorageCtorArg: MutPtr<CVoid>,
    ppvObjCtorArg: MutPtr<MutPtr<CVoid>>,
    public var sc: Int,
    hMetaPictCtorArg: Hglobal,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpszFile: Pwstr = lpszFileCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public var lpFormatEtc: MutPtr<Formatetc> = lpFormatEtcCtorArg
        internal set

    public var lpIOleClientSite: MutPtr<CVoid> = lpIOleClientSiteCtorArg
        internal set

    public var lpIStorage: MutPtr<CVoid> = lpIStorageCtorArg
        internal set

    public var ppvObj: MutPtr<MutPtr<CVoid>> = ppvObjCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        clsid = Guid(),
        lpszFileCtorArg = MutPtr(0L),
        cchFile = 0u,
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
        iid = Guid(),
        oleRender = 0u,
        lpFormatEtcCtorArg = MutPtr(0L),
        lpIOleClientSiteCtorArg = MutPtr(0L),
        lpIStorageCtorArg = MutPtr(0L),
        ppvObjCtorArg = MutPtr(0L),
        sc = 0,
        hMetaPictCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: InsertObjectFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            clsid: Guid = Guid(),
            lpszFile: Pwstr = MutPtr(0L),
            cchFile: UInt = 0u,
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
            iid: Guid = Guid(),
            oleRender: UInt = 0u,
            lpFormatEtc: MutPtr<Formatetc> = MutPtr(0L),
            lpIOleClientSite: MutPtr<CVoid> = MutPtr(0L),
            lpIStorage: MutPtr<CVoid> = MutPtr(0L),
            ppvObj: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            sc: Int = 0,
            hMetaPict: Hglobal = MutPtr(0L),
        ): Oleuiinsertobjectw =
            Oleuiinsertobjectw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                clsid = clsid,
                lpszFileCtorArg = lpszFile,
                cchFile = cchFile,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
                iid = iid,
                oleRender = oleRender,
                lpFormatEtcCtorArg = lpFormatEtc,
                lpIOleClientSiteCtorArg = lpIOleClientSite,
                lpIStorageCtorArg = lpIStorage,
                ppvObjCtorArg = ppvObj,
                sc = sc,
                hMetaPictCtorArg = hMetaPict,
            )
    }
}

public class Oleuilinkpropsa internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsa>,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsa> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsa> = this.lpOP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsa> = this.lpOP): Oleuilinkpropsa = Oleuilinkpropsa(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuilinkpropsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsa> = MutPtr(0L),
        ): Oleuilinkpropsa =
            Oleuilinkpropsa(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
            )
    }
}

public class Oleuilinkpropsw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: UInt,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsw>,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsw> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsw> = this.lpOP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: UInt = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsw> = this.lpOP): Oleuilinkpropsw = Oleuilinkpropsw(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuilinkpropsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: UInt = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsw> = MutPtr(0L),
        ): Oleuilinkpropsw =
            Oleuilinkpropsw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
            )
    }
}

public class Oleuiobjectpropsa internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ObjectPropertiesFlags,
    lpPSCtorArg: MutPtr<PropsheetheaderaV2>,
    public var dwObject: UInt,
    lpObjInfoCtorArg: MutPtr<CVoid>,
    public var dwLink: UInt,
    lpLinkInfoCtorArg: MutPtr<CVoid>,
    lpGPCtorArg: MutPtr<Oleuignrlpropsa>,
    lpVPCtorArg: MutPtr<Oleuiviewpropsa>,
    lpLPCtorArg: MutPtr<Oleuilinkpropsa>,
) {
    public var lpPS: MutPtr<PropsheetheaderaV2> = lpPSCtorArg
        internal set

    public var lpObjInfo: MutPtr<CVoid> = lpObjInfoCtorArg
        internal set

    public var lpLinkInfo: MutPtr<CVoid> = lpLinkInfoCtorArg
        internal set

    public var lpGP: MutPtr<Oleuignrlpropsa> = lpGPCtorArg
        internal set

    public var lpVP: MutPtr<Oleuiviewpropsa> = lpVPCtorArg
        internal set

    public var lpLP: MutPtr<Oleuilinkpropsa> = lpLPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        lpPSCtorArg = MutPtr(0L),
        dwObject = 0u,
        lpObjInfoCtorArg = MutPtr(0L),
        dwLink = 0u,
        lpLinkInfoCtorArg = MutPtr(0L),
        lpGPCtorArg = MutPtr(0L),
        lpVPCtorArg = MutPtr(0L),
        lpLPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ObjectPropertiesFlags = this.dwFlags

    public operator fun component3(): MutPtr<PropsheetheaderaV2> = this.lpPS

    public operator fun component4(): UInt = this.dwObject

    public operator fun component5(): MutPtr<CVoid> = this.lpObjInfo

    public operator fun component6(): UInt = this.dwLink

    public operator fun component7(): MutPtr<CVoid> = this.lpLinkInfo

    public operator fun component8(): MutPtr<Oleuignrlpropsa> = this.lpGP

    public operator fun component9(): MutPtr<Oleuiviewpropsa> = this.lpVP

    public operator fun component10(): MutPtr<Oleuilinkpropsa> = this.lpLP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ObjectPropertiesFlags = this.dwFlags, lpPS: MutPtr<PropsheetheaderaV2> = this.lpPS, dwObject: UInt = this.dwObject, lpObjInfo: MutPtr<CVoid> = this.lpObjInfo, dwLink: UInt = this.dwLink, lpLinkInfo: MutPtr<CVoid> = this.lpLinkInfo, lpGP: MutPtr<Oleuignrlpropsa> = this.lpGP, lpVP: MutPtr<Oleuiviewpropsa> = this.lpVP, lpLP: MutPtr<Oleuilinkpropsa> = this.lpLP): Oleuiobjectpropsa = Oleuiobjectpropsa(cbStruct = cbStruct, dwFlags = dwFlags, lpPSCtorArg = lpPS, dwObject = dwObject, lpObjInfoCtorArg = lpObjInfo, dwLink = dwLink, lpLinkInfoCtorArg = lpLinkInfo, lpGPCtorArg = lpGP, lpVPCtorArg = lpVP, lpLPCtorArg = lpLP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiobjectpropsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpPS != other.lpPS) return false
        if (this.dwObject != other.dwObject) return false
        if (this.lpObjInfo != other.lpObjInfo) return false
        if (this.dwLink != other.dwLink) return false
        if (this.lpLinkInfo != other.lpLinkInfo) return false
        if (this.lpGP != other.lpGP) return false
        if (this.lpVP != other.lpVP) return false
        if (this.lpLP != other.lpLP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpPS.hashCode()
        result = 31 * result + this.dwObject.hashCode()
        result = 31 * result + this.lpObjInfo.hashCode()
        result = 31 * result + this.dwLink.hashCode()
        result = 31 * result + this.lpLinkInfo.hashCode()
        result = 31 * result + this.lpGP.hashCode()
        result = 31 * result + this.lpVP.hashCode()
        result = 31 * result + this.lpLP.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oleuiobjectpropsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oleuiobjectpropsa> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Oleuiobjectpropsa =
                    Oleuiobjectpropsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PropsheetheaderaV2>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuignrlpropsa>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuiviewpropsa>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuilinkpropsa>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Oleuiobjectpropsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PropsheetheaderaV2>(64)
                    ).writeNative(addr + 8L, value.lpPS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.lpObjInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwLink)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.lpLinkInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuignrlpropsa>(64)
                    ).writeNative(addr + 48L, value.lpGP)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuiviewpropsa>(64)
                    ).writeNative(addr + 56L, value.lpVP)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuilinkpropsa>(64)
                    ).writeNative(addr + 64L, value.lpLP)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ObjectPropertiesFlags = 0u,
            lpPS: MutPtr<PropsheetheaderaV2> = MutPtr(0L),
            dwObject: UInt = 0u,
            lpObjInfo: MutPtr<CVoid> = MutPtr(0L),
            dwLink: UInt = 0u,
            lpLinkInfo: MutPtr<CVoid> = MutPtr(0L),
            lpGP: MutPtr<Oleuignrlpropsa> = MutPtr(0L),
            lpVP: MutPtr<Oleuiviewpropsa> = MutPtr(0L),
            lpLP: MutPtr<Oleuilinkpropsa> = MutPtr(0L),
        ): Oleuiobjectpropsa =
            Oleuiobjectpropsa(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                lpPSCtorArg = lpPS,
                dwObject = dwObject,
                lpObjInfoCtorArg = lpObjInfo,
                dwLink = dwLink,
                lpLinkInfoCtorArg = lpLinkInfo,
                lpGPCtorArg = lpGP,
                lpVPCtorArg = lpVP,
                lpLPCtorArg = lpLP,
            )
    }
}

public class Oleuiobjectpropsw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ObjectPropertiesFlags,
    lpPSCtorArg: MutPtr<PropsheetheaderwV2>,
    public var dwObject: UInt,
    lpObjInfoCtorArg: MutPtr<CVoid>,
    public var dwLink: UInt,
    lpLinkInfoCtorArg: MutPtr<CVoid>,
    lpGPCtorArg: MutPtr<Oleuignrlpropsw>,
    lpVPCtorArg: MutPtr<Oleuiviewpropsw>,
    lpLPCtorArg: MutPtr<Oleuilinkpropsw>,
) {
    public var lpPS: MutPtr<PropsheetheaderwV2> = lpPSCtorArg
        internal set

    public var lpObjInfo: MutPtr<CVoid> = lpObjInfoCtorArg
        internal set

    public var lpLinkInfo: MutPtr<CVoid> = lpLinkInfoCtorArg
        internal set

    public var lpGP: MutPtr<Oleuignrlpropsw> = lpGPCtorArg
        internal set

    public var lpVP: MutPtr<Oleuiviewpropsw> = lpVPCtorArg
        internal set

    public var lpLP: MutPtr<Oleuilinkpropsw> = lpLPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        lpPSCtorArg = MutPtr(0L),
        dwObject = 0u,
        lpObjInfoCtorArg = MutPtr(0L),
        dwLink = 0u,
        lpLinkInfoCtorArg = MutPtr(0L),
        lpGPCtorArg = MutPtr(0L),
        lpVPCtorArg = MutPtr(0L),
        lpLPCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ObjectPropertiesFlags = this.dwFlags

    public operator fun component3(): MutPtr<PropsheetheaderwV2> = this.lpPS

    public operator fun component4(): UInt = this.dwObject

    public operator fun component5(): MutPtr<CVoid> = this.lpObjInfo

    public operator fun component6(): UInt = this.dwLink

    public operator fun component7(): MutPtr<CVoid> = this.lpLinkInfo

    public operator fun component8(): MutPtr<Oleuignrlpropsw> = this.lpGP

    public operator fun component9(): MutPtr<Oleuiviewpropsw> = this.lpVP

    public operator fun component10(): MutPtr<Oleuilinkpropsw> = this.lpLP

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ObjectPropertiesFlags = this.dwFlags, lpPS: MutPtr<PropsheetheaderwV2> = this.lpPS, dwObject: UInt = this.dwObject, lpObjInfo: MutPtr<CVoid> = this.lpObjInfo, dwLink: UInt = this.dwLink, lpLinkInfo: MutPtr<CVoid> = this.lpLinkInfo, lpGP: MutPtr<Oleuignrlpropsw> = this.lpGP, lpVP: MutPtr<Oleuiviewpropsw> = this.lpVP, lpLP: MutPtr<Oleuilinkpropsw> = this.lpLP): Oleuiobjectpropsw = Oleuiobjectpropsw(cbStruct = cbStruct, dwFlags = dwFlags, lpPSCtorArg = lpPS, dwObject = dwObject, lpObjInfoCtorArg = lpObjInfo, dwLink = dwLink, lpLinkInfoCtorArg = lpLinkInfo, lpGPCtorArg = lpGP, lpVPCtorArg = lpVP, lpLPCtorArg = lpLP)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiobjectpropsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpPS != other.lpPS) return false
        if (this.dwObject != other.dwObject) return false
        if (this.lpObjInfo != other.lpObjInfo) return false
        if (this.dwLink != other.dwLink) return false
        if (this.lpLinkInfo != other.lpLinkInfo) return false
        if (this.lpGP != other.lpGP) return false
        if (this.lpVP != other.lpVP) return false
        if (this.lpLP != other.lpLP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpPS.hashCode()
        result = 31 * result + this.dwObject.hashCode()
        result = 31 * result + this.lpObjInfo.hashCode()
        result = 31 * result + this.dwLink.hashCode()
        result = 31 * result + this.lpLinkInfo.hashCode()
        result = 31 * result + this.lpGP.hashCode()
        result = 31 * result + this.lpVP.hashCode()
        result = 31 * result + this.lpLP.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oleuiobjectpropsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oleuiobjectpropsw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Oleuiobjectpropsw =
                    Oleuiobjectpropsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PropsheetheaderwV2>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuignrlpropsw>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuiviewpropsw>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oleuilinkpropsw>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Oleuiobjectpropsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PropsheetheaderwV2>(64)
                    ).writeNative(addr + 8L, value.lpPS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.lpObjInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwLink)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.lpLinkInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuignrlpropsw>(64)
                    ).writeNative(addr + 48L, value.lpGP)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuiviewpropsw>(64)
                    ).writeNative(addr + 56L, value.lpVP)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oleuilinkpropsw>(64)
                    ).writeNative(addr + 64L, value.lpLP)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ObjectPropertiesFlags = 0u,
            lpPS: MutPtr<PropsheetheaderwV2> = MutPtr(0L),
            dwObject: UInt = 0u,
            lpObjInfo: MutPtr<CVoid> = MutPtr(0L),
            dwLink: UInt = 0u,
            lpLinkInfo: MutPtr<CVoid> = MutPtr(0L),
            lpGP: MutPtr<Oleuignrlpropsw> = MutPtr(0L),
            lpVP: MutPtr<Oleuiviewpropsw> = MutPtr(0L),
            lpLP: MutPtr<Oleuilinkpropsw> = MutPtr(0L),
        ): Oleuiobjectpropsw =
            Oleuiobjectpropsw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                lpPSCtorArg = lpPS,
                dwObject = dwObject,
                lpObjInfoCtorArg = lpObjInfo,
                dwLink = dwLink,
                lpLinkInfoCtorArg = lpLinkInfo,
                lpGPCtorArg = lpGP,
                lpVPCtorArg = lpVP,
                lpLPCtorArg = lpLP,
            )
    }
}

public class Oleuipasteentrya internal constructor(
    public var fmtetc: Formatetc,
    lpstrFormatNameCtorArg: Pcstr,
    lpstrResultTextCtorArg: Pcstr,
    public var dwFlags: UInt,
    public var dwScratchSpace: UInt,
) {
    public var lpstrFormatName: Pcstr = lpstrFormatNameCtorArg
        internal set

    public var lpstrResultText: Pcstr = lpstrResultTextCtorArg
        internal set

    public constructor() : this(
        fmtetc = Formatetc(),
        lpstrFormatNameCtorArg = ConstPtr(0L),
        lpstrResultTextCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        dwScratchSpace = 0u,
    )

    public operator fun component1(): Formatetc = this.fmtetc

    public operator fun component2(): Pcstr = this.lpstrFormatName

    public operator fun component3(): Pcstr = this.lpstrResultText

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): UInt = this.dwScratchSpace

    public fun copy(fmtetc: Formatetc = this.fmtetc, lpstrFormatName: Pcstr = this.lpstrFormatName, lpstrResultText: Pcstr = this.lpstrResultText, dwFlags: UInt = this.dwFlags, dwScratchSpace: UInt = this.dwScratchSpace): Oleuipasteentrya = Oleuipasteentrya(fmtetc = fmtetc, lpstrFormatNameCtorArg = lpstrFormatName, lpstrResultTextCtorArg = lpstrResultText, dwFlags = dwFlags, dwScratchSpace = dwScratchSpace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuipasteentrya) return false
        if (this.fmtetc != other.fmtetc) return false
        if (this.lpstrFormatName != other.lpstrFormatName) return false
        if (this.lpstrResultText != other.lpstrResultText) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwScratchSpace != other.dwScratchSpace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fmtetc.hashCode()
        result = 31 * result + this.lpstrFormatName.hashCode()
        result = 31 * result + this.lpstrResultText.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwScratchSpace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fmtetc: Formatetc = Formatetc(),
            lpstrFormatName: Pcstr = ConstPtr(0L),
            lpstrResultText: Pcstr = ConstPtr(0L),
            dwFlags: UInt = 0u,
            dwScratchSpace: UInt = 0u,
        ): Oleuipasteentrya =
            Oleuipasteentrya(
                fmtetc = fmtetc,
                lpstrFormatNameCtorArg = lpstrFormatName,
                lpstrResultTextCtorArg = lpstrResultText,
                dwFlags = dwFlags,
                dwScratchSpace = dwScratchSpace,
            )
    }
}

public class Oleuipasteentryw internal constructor(
    public var fmtetc: Formatetc,
    lpstrFormatNameCtorArg: Pcwstr,
    lpstrResultTextCtorArg: Pcwstr,
    public var dwFlags: UInt,
    public var dwScratchSpace: UInt,
) {
    public var lpstrFormatName: Pcwstr = lpstrFormatNameCtorArg
        internal set

    public var lpstrResultText: Pcwstr = lpstrResultTextCtorArg
        internal set

    public constructor() : this(
        fmtetc = Formatetc(),
        lpstrFormatNameCtorArg = ConstPtr(0L),
        lpstrResultTextCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        dwScratchSpace = 0u,
    )

    public operator fun component1(): Formatetc = this.fmtetc

    public operator fun component2(): Pcwstr = this.lpstrFormatName

    public operator fun component3(): Pcwstr = this.lpstrResultText

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): UInt = this.dwScratchSpace

    public fun copy(fmtetc: Formatetc = this.fmtetc, lpstrFormatName: Pcwstr = this.lpstrFormatName, lpstrResultText: Pcwstr = this.lpstrResultText, dwFlags: UInt = this.dwFlags, dwScratchSpace: UInt = this.dwScratchSpace): Oleuipasteentryw = Oleuipasteentryw(fmtetc = fmtetc, lpstrFormatNameCtorArg = lpstrFormatName, lpstrResultTextCtorArg = lpstrResultText, dwFlags = dwFlags, dwScratchSpace = dwScratchSpace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuipasteentryw) return false
        if (this.fmtetc != other.fmtetc) return false
        if (this.lpstrFormatName != other.lpstrFormatName) return false
        if (this.lpstrResultText != other.lpstrResultText) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwScratchSpace != other.dwScratchSpace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fmtetc.hashCode()
        result = 31 * result + this.lpstrFormatName.hashCode()
        result = 31 * result + this.lpstrResultText.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwScratchSpace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fmtetc: Formatetc = Formatetc(),
            lpstrFormatName: Pcwstr = ConstPtr(0L),
            lpstrResultText: Pcwstr = ConstPtr(0L),
            dwFlags: UInt = 0u,
            dwScratchSpace: UInt = 0u,
        ): Oleuipasteentryw =
            Oleuipasteentryw(
                fmtetc = fmtetc,
                lpstrFormatNameCtorArg = lpstrFormatName,
                lpstrResultTextCtorArg = lpstrResultText,
                dwFlags = dwFlags,
                dwScratchSpace = dwScratchSpace,
            )
    }
}

public class Oleuipastespeciala internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: PasteSpecialFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcstr,
    hResourceCtorArg: Hrsrc,
    lpSrcDataObjCtorArg: MutPtr<CVoid>,
    arrPasteEntriesCtorArg: MutPtr<Oleuipasteentrya>,
    public var cPasteEntries: Int,
    arrLinkTypesCtorArg: MutPtr<UInt>,
    public var cLinkTypes: Int,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
    public var nSelectedIndex: Int,
    public var fLink: Bool,
    hMetaPictCtorArg: Hglobal,
    public var sizel: Size,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpSrcDataObj: MutPtr<CVoid> = lpSrcDataObjCtorArg
        internal set

    public var arrPasteEntries: MutPtr<Oleuipasteentrya> = arrPasteEntriesCtorArg
        internal set

    public var arrLinkTypes: MutPtr<UInt> = arrLinkTypesCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpSrcDataObjCtorArg = MutPtr(0L),
        arrPasteEntriesCtorArg = MutPtr(0L),
        cPasteEntries = 0,
        arrLinkTypesCtorArg = MutPtr(0L),
        cLinkTypes = 0,
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
        nSelectedIndex = 0,
        fLink = 0,
        hMetaPictCtorArg = MutPtr(0L),
        sizel = Size(),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: PasteSpecialFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpSrcDataObj: MutPtr<CVoid> = MutPtr(0L),
            arrPasteEntries: MutPtr<Oleuipasteentrya> = MutPtr(0L),
            cPasteEntries: Int = 0,
            arrLinkTypes: MutPtr<UInt> = MutPtr(0L),
            cLinkTypes: Int = 0,
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
            nSelectedIndex: Int = 0,
            fLink: Bool = 0,
            hMetaPict: Hglobal = MutPtr(0L),
            sizel: Size = Size(),
        ): Oleuipastespeciala =
            Oleuipastespeciala(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpSrcDataObjCtorArg = lpSrcDataObj,
                arrPasteEntriesCtorArg = arrPasteEntries,
                cPasteEntries = cPasteEntries,
                arrLinkTypesCtorArg = arrLinkTypes,
                cLinkTypes = cLinkTypes,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
                nSelectedIndex = nSelectedIndex,
                fLink = fLink,
                hMetaPictCtorArg = hMetaPict,
                sizel = sizel,
            )
    }
}

public class Oleuipastespecialw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: PasteSpecialFlags,
    hWndOwnerCtorArg: Hwnd,
    lpszCaptionCtorArg: Pcwstr,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    hInstanceCtorArg: Hinstance,
    lpszTemplateCtorArg: Pcwstr,
    hResourceCtorArg: Hrsrc,
    lpSrcDataObjCtorArg: MutPtr<CVoid>,
    arrPasteEntriesCtorArg: MutPtr<Oleuipasteentryw>,
    public var cPasteEntries: Int,
    arrLinkTypesCtorArg: MutPtr<UInt>,
    public var cLinkTypes: Int,
    public var cClsidExclude: UInt,
    lpClsidExcludeCtorArg: MutPtr<Guid>,
    public var nSelectedIndex: Int,
    public var fLink: Bool,
    hMetaPictCtorArg: Hglobal,
    public var sizel: Size,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszTemplate: Pcwstr = lpszTemplateCtorArg
        internal set

    public var hResource: Hrsrc = hResourceCtorArg
        internal set

    public var lpSrcDataObj: MutPtr<CVoid> = lpSrcDataObjCtorArg
        internal set

    public var arrPasteEntries: MutPtr<Oleuipasteentryw> = arrPasteEntriesCtorArg
        internal set

    public var arrLinkTypes: MutPtr<UInt> = arrLinkTypesCtorArg
        internal set

    public var lpClsidExclude: MutPtr<Guid> = lpClsidExcludeCtorArg
        internal set

    public var hMetaPict: Hglobal = hMetaPictCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        lpfnHook = null,
        lCustData = 0L,
        hInstanceCtorArg = MutPtr(0L),
        lpszTemplateCtorArg = ConstPtr(0L),
        hResourceCtorArg = MutPtr(0L),
        lpSrcDataObjCtorArg = MutPtr(0L),
        arrPasteEntriesCtorArg = MutPtr(0L),
        cPasteEntries = 0,
        arrLinkTypesCtorArg = MutPtr(0L),
        cLinkTypes = 0,
        cClsidExclude = 0u,
        lpClsidExcludeCtorArg = MutPtr(0L),
        nSelectedIndex = 0,
        fLink = 0,
        hMetaPictCtorArg = MutPtr(0L),
        sizel = Size(),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: PasteSpecialFlags = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            hInstance: Hinstance = MutPtr(0L),
            lpszTemplate: Pcwstr = ConstPtr(0L),
            hResource: Hrsrc = MutPtr(0L),
            lpSrcDataObj: MutPtr<CVoid> = MutPtr(0L),
            arrPasteEntries: MutPtr<Oleuipasteentryw> = MutPtr(0L),
            cPasteEntries: Int = 0,
            arrLinkTypes: MutPtr<UInt> = MutPtr(0L),
            cLinkTypes: Int = 0,
            cClsidExclude: UInt = 0u,
            lpClsidExclude: MutPtr<Guid> = MutPtr(0L),
            nSelectedIndex: Int = 0,
            fLink: Bool = 0,
            hMetaPict: Hglobal = MutPtr(0L),
            sizel: Size = Size(),
        ): Oleuipastespecialw =
            Oleuipastespecialw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                hWndOwnerCtorArg = hWndOwner,
                lpszCaptionCtorArg = lpszCaption,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                hInstanceCtorArg = hInstance,
                lpszTemplateCtorArg = lpszTemplate,
                hResourceCtorArg = hResource,
                lpSrcDataObjCtorArg = lpSrcDataObj,
                arrPasteEntriesCtorArg = arrPasteEntries,
                cPasteEntries = cPasteEntries,
                arrLinkTypesCtorArg = arrLinkTypes,
                cLinkTypes = cLinkTypes,
                cClsidExclude = cClsidExclude,
                lpClsidExcludeCtorArg = lpClsidExclude,
                nSelectedIndex = nSelectedIndex,
                fLink = fLink,
                hMetaPictCtorArg = hMetaPict,
                sizel = sizel,
            )
    }
}

public class Oleuiviewpropsa internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ViewObjectPropertiesFlags,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsa>,
    public var nScaleMin: Int,
    public var nScaleMax: Int,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsa> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
        nScaleMin = 0,
        nScaleMax = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ViewObjectPropertiesFlags = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsa> = this.lpOP

    public operator fun component8(): Int = this.nScaleMin

    public operator fun component9(): Int = this.nScaleMax

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ViewObjectPropertiesFlags = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsa> = this.lpOP, nScaleMin: Int = this.nScaleMin, nScaleMax: Int = this.nScaleMax): Oleuiviewpropsa = Oleuiviewpropsa(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP, nScaleMin = nScaleMin, nScaleMax = nScaleMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiviewpropsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        if (this.nScaleMin != other.nScaleMin) return false
        if (this.nScaleMax != other.nScaleMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        result = 31 * result + this.nScaleMin.hashCode()
        result = 31 * result + this.nScaleMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ViewObjectPropertiesFlags = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsa> = MutPtr(0L),
            nScaleMin: Int = 0,
            nScaleMax: Int = 0,
        ): Oleuiviewpropsa =
            Oleuiviewpropsa(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
                nScaleMin = nScaleMin,
                nScaleMax = nScaleMax,
            )
    }
}

public class Oleuiviewpropsw internal constructor(
    public var cbStruct: UInt,
    public var dwFlags: ViewObjectPropertiesFlags,
    public var dwReserved1: UIntArray,
    public var lpfnHook: Lpfnoleuihook,
    public var lCustData: Lparam,
    public var dwReserved2: UIntArray,
    lpOPCtorArg: MutPtr<Oleuiobjectpropsw>,
    public var nScaleMin: Int,
    public var nScaleMax: Int,
) {
    public var lpOP: MutPtr<Oleuiobjectpropsw> = lpOPCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFlags = 0u,
        dwReserved1 = UIntArray(2),
        lpfnHook = null,
        lCustData = 0L,
        dwReserved2 = UIntArray(3),
        lpOPCtorArg = MutPtr(0L),
        nScaleMin = 0,
        nScaleMax = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ViewObjectPropertiesFlags = this.dwFlags

    public operator fun component3(): UIntArray = this.dwReserved1

    public operator fun component4(): Lpfnoleuihook = this.lpfnHook

    public operator fun component5(): Lparam = this.lCustData

    public operator fun component6(): UIntArray = this.dwReserved2

    public operator fun component7(): MutPtr<Oleuiobjectpropsw> = this.lpOP

    public operator fun component8(): Int = this.nScaleMin

    public operator fun component9(): Int = this.nScaleMax

    public fun copy(cbStruct: UInt = this.cbStruct, dwFlags: ViewObjectPropertiesFlags = this.dwFlags, dwReserved1: UIntArray = this.dwReserved1, lpfnHook: Lpfnoleuihook = this.lpfnHook, lCustData: Lparam = this.lCustData, dwReserved2: UIntArray = this.dwReserved2, lpOP: MutPtr<Oleuiobjectpropsw> = this.lpOP, nScaleMin: Int = this.nScaleMin, nScaleMax: Int = this.nScaleMax): Oleuiviewpropsw = Oleuiviewpropsw(cbStruct = cbStruct, dwFlags = dwFlags, dwReserved1 = dwReserved1, lpfnHook = lpfnHook, lCustData = lCustData, dwReserved2 = dwReserved2, lpOPCtorArg = lpOP, nScaleMin = nScaleMin, nScaleMax = nScaleMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiviewpropsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        if (this.nScaleMin != other.nScaleMin) return false
        if (this.nScaleMax != other.nScaleMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        result = 31 * result + this.nScaleMin.hashCode()
        result = 31 * result + this.nScaleMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFlags: ViewObjectPropertiesFlags = 0u,
            dwReserved1: UIntArray = UIntArray(2),
            lpfnHook: Lpfnoleuihook = null,
            lCustData: Lparam = 0L,
            dwReserved2: UIntArray = UIntArray(3),
            lpOP: MutPtr<Oleuiobjectpropsw> = MutPtr(0L),
            nScaleMin: Int = 0,
            nScaleMax: Int = 0,
        ): Oleuiviewpropsw =
            Oleuiviewpropsw(
                cbStruct = cbStruct,
                dwFlags = dwFlags,
                dwReserved1 = dwReserved1,
                lpfnHook = lpfnHook,
                lCustData = lCustData,
                dwReserved2 = dwReserved2,
                lpOPCtorArg = lpOP,
                nScaleMin = nScaleMin,
                nScaleMax = nScaleMax,
            )
    }
}

public class Oleverb internal constructor(
    public var lVerb: Oleiverb,
    lpszVerbNameCtorArg: Pwstr,
    public var fuFlags: MenuItemFlags,
    public var grfAttribs: UInt,
) {
    public var lpszVerbName: Pwstr = lpszVerbNameCtorArg
        internal set

    public constructor() : this(
        lVerb = 0,
        lpszVerbNameCtorArg = MutPtr(0L),
        fuFlags = 0u,
        grfAttribs = 0u,
    )

    public operator fun component1(): Oleiverb = this.lVerb

    public operator fun component2(): Pwstr = this.lpszVerbName

    public operator fun component3(): MenuItemFlags = this.fuFlags

    public operator fun component4(): UInt = this.grfAttribs

    public fun copy(lVerb: Oleiverb = this.lVerb, lpszVerbName: Pwstr = this.lpszVerbName, fuFlags: MenuItemFlags = this.fuFlags, grfAttribs: UInt = this.grfAttribs): Oleverb = Oleverb(lVerb = lVerb, lpszVerbNameCtorArg = lpszVerbName, fuFlags = fuFlags, grfAttribs = grfAttribs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleverb) return false
        if (this.lVerb != other.lVerb) return false
        if (this.lpszVerbName != other.lpszVerbName) return false
        if (this.fuFlags != other.fuFlags) return false
        if (this.grfAttribs != other.grfAttribs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lVerb.hashCode()
        result = 31 * result + this.lpszVerbName.hashCode()
        result = 31 * result + this.fuFlags.hashCode()
        result = 31 * result + this.grfAttribs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lVerb: Oleiverb = 0,
            lpszVerbName: Pwstr = MutPtr(0L),
            fuFlags: MenuItemFlags = 0u,
            grfAttribs: UInt = 0u,
        ): Oleverb =
            Oleverb(
                lVerb = lVerb,
                lpszVerbNameCtorArg = lpszVerbName,
                fuFlags = fuFlags,
                grfAttribs = grfAttribs,
            )
    }
}

public data class Pagerange(
    public var nFromPage: Int = 0,
    public var nToPage: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pagerange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pagerange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pagerange =
                    Pagerange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pagerange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.nFromPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.nToPage)
                }
            }
    }
}

public data class Pageset(
    public var cbStruct: UInt = 0u,
    public var fOddPages: Bool = 0,
    public var fEvenPages: Bool = 0,
    public var cPageRange: UInt = 0u,
    public var rgPages: List<Pagerange> = List(1) { Pagerange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pageset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pageset> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Pageset =
                    Pageset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Pagerange.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Pageset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fOddPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fEvenPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cPageRange)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Pagerange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.rgPages)
                }
            }
    }
}

public class Paramdata internal constructor(
    szNameCtorArg: Pwstr,
    public var vt: Variant.Varenum,
) {
    public var szName: Pwstr = szNameCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        vt = 0u,
    )

    public operator fun component1(): Pwstr = this.szName

    public operator fun component2(): Variant.Varenum = this.vt

    public fun copy(szName: Pwstr = this.szName, vt: Variant.Varenum = this.vt): Paramdata = Paramdata(szNameCtorArg = szName, vt = vt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Paramdata) return false
        if (this.szName != other.szName) return false
        if (this.vt != other.vt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.vt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pwstr = MutPtr(0L),
            vt: Variant.Varenum = 0u,
        ): Paramdata =
            Paramdata(
                szNameCtorArg = szName,
                vt = vt,
            )
    }
}

public class Paramdesc internal constructor(
    pparamdescexCtorArg: MutPtr<Paramdescex>,
    public var wParamFlags: Paramflags,
) {
    public var pparamdescex: MutPtr<Paramdescex> = pparamdescexCtorArg
        internal set

    public constructor() : this(
        pparamdescexCtorArg = MutPtr(0L),
        wParamFlags = 0u,
    )

    public operator fun component1(): MutPtr<Paramdescex> = this.pparamdescex

    public operator fun component2(): Paramflags = this.wParamFlags

    public fun copy(pparamdescex: MutPtr<Paramdescex> = this.pparamdescex, wParamFlags: Paramflags = this.wParamFlags): Paramdesc = Paramdesc(pparamdescexCtorArg = pparamdescex, wParamFlags = wParamFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Paramdesc) return false
        if (this.pparamdescex != other.pparamdescex) return false
        if (this.wParamFlags != other.wParamFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pparamdescex.hashCode()
        result = 31 * result + this.wParamFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Paramdesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Paramdesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Paramdesc =
                    Paramdesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Paramdescex>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Paramdesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Paramdescex>(64)
                    ).writeNative(addr, value.pparamdescex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wParamFlags)
                }
            }

        public operator fun invoke(
            pparamdescex: MutPtr<Paramdescex> = MutPtr(0L),
            wParamFlags: Paramflags = 0u,
        ): Paramdesc =
            Paramdesc(
                pparamdescexCtorArg = pparamdescex,
                wParamFlags = wParamFlags,
            )
    }
}

public data class Paramdescex(
    public var cBytes: UInt = 0u,
    public var varDefaultValue: Variant.Variant = Variant.Variant(),
)

public data class Pictdesc(
    public var cbSizeofstruct: UInt = 0u,
    public var picType: UInt = 0u,
    public var anonymous: Pictdesc0 = Pictdesc0(),
)

public data class Pictdesc0(
    public var bmp: Pictdesc00 = Pictdesc00(),
    public var wmf: Pictdesc01 = Pictdesc01(),
    public var icon: Pictdesc02 = Pictdesc02(),
    public var emf: Pictdesc03 = Pictdesc03(),
)

public class Pictdesc00 internal constructor(
    hbitmapCtorArg: Hbitmap,
    hpalCtorArg: Hpalette,
) {
    public var hbitmap: Hbitmap = hbitmapCtorArg
        internal set

    public var hpal: Hpalette = hpalCtorArg
        internal set

    public constructor() : this(
        hbitmapCtorArg = MutPtr(0L),
        hpalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hbitmap = this.hbitmap

    public operator fun component2(): Hpalette = this.hpal

    public fun copy(hbitmap: Hbitmap = this.hbitmap, hpal: Hpalette = this.hpal): Pictdesc00 = Pictdesc00(hbitmapCtorArg = hbitmap, hpalCtorArg = hpal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pictdesc00) return false
        if (this.hbitmap != other.hbitmap) return false
        if (this.hpal != other.hpal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hbitmap.hashCode()
        result = 31 * result + this.hpal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hbitmap: Hbitmap = MutPtr(0L),
            hpal: Hpalette = MutPtr(0L),
        ): Pictdesc00 =
            Pictdesc00(
                hbitmapCtorArg = hbitmap,
                hpalCtorArg = hpal,
            )
    }
}

public class Pictdesc03 internal constructor(
    hemfCtorArg: Henhmetafile,
) {
    public var hemf: Henhmetafile = hemfCtorArg
        internal set

    public constructor() : this(
        hemfCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Henhmetafile = this.hemf

    public fun copy(hemf: Henhmetafile = this.hemf): Pictdesc03 = Pictdesc03(hemfCtorArg = hemf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pictdesc03) return false
        if (this.hemf != other.hemf) return false
        return true
    }

    override fun hashCode(): Int = this.hemf.hashCode()

    public companion object {
        public operator fun invoke(
            hemf: Henhmetafile = MutPtr(0L),
        ): Pictdesc03 =
            Pictdesc03(
                hemfCtorArg = hemf,
            )
    }
}

public class Pictdesc02 internal constructor(
    hiconCtorArg: Hicon,
) {
    public var hicon: Hicon = hiconCtorArg
        internal set

    public constructor() : this(
        hiconCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hicon = this.hicon

    public fun copy(hicon: Hicon = this.hicon): Pictdesc02 = Pictdesc02(hiconCtorArg = hicon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pictdesc02) return false
        if (this.hicon != other.hicon) return false
        return true
    }

    override fun hashCode(): Int = this.hicon.hashCode()

    public companion object {
        public operator fun invoke(
            hicon: Hicon = MutPtr(0L),
        ): Pictdesc02 =
            Pictdesc02(
                hiconCtorArg = hicon,
            )
    }
}

public class Pictdesc01 internal constructor(
    hmetaCtorArg: Hmetafile,
    public var xExt: Int,
    public var yExt: Int,
) {
    public var hmeta: Hmetafile = hmetaCtorArg
        internal set

    public constructor() : this(
        hmetaCtorArg = MutPtr(0L),
        xExt = 0,
        yExt = 0,
    )

    public operator fun component1(): Hmetafile = this.hmeta

    public operator fun component2(): Int = this.xExt

    public operator fun component3(): Int = this.yExt

    public fun copy(hmeta: Hmetafile = this.hmeta, xExt: Int = this.xExt, yExt: Int = this.yExt): Pictdesc01 = Pictdesc01(hmetaCtorArg = hmeta, xExt = xExt, yExt = yExt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pictdesc01) return false
        if (this.hmeta != other.hmeta) return false
        if (this.xExt != other.xExt) return false
        if (this.yExt != other.yExt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hmeta.hashCode()
        result = 31 * result + this.xExt.hashCode()
        result = 31 * result + this.yExt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hmeta: Hmetafile = MutPtr(0L),
            xExt: Int = 0,
            yExt: Int = 0,
        ): Pictdesc01 =
            Pictdesc01(
                hmetaCtorArg = hmeta,
                xExt = xExt,
                yExt = yExt,
            )
    }
}

public data class Pointf(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointf> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pointf =
                    Pointf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pointf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public class Proppageinfo internal constructor(
    public var cb: UInt,
    pszTitleCtorArg: Pwstr,
    public var size: Size,
    pszDocStringCtorArg: Pwstr,
    pszHelpFileCtorArg: Pwstr,
    public var dwHelpContext: UInt,
) {
    public var pszTitle: Pwstr = pszTitleCtorArg
        internal set

    public var pszDocString: Pwstr = pszDocStringCtorArg
        internal set

    public var pszHelpFile: Pwstr = pszHelpFileCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        pszTitleCtorArg = MutPtr(0L),
        size = Size(),
        pszDocStringCtorArg = MutPtr(0L),
        pszHelpFileCtorArg = MutPtr(0L),
        dwHelpContext = 0u,
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): Pwstr = this.pszTitle

    public operator fun component3(): Size = this.size

    public operator fun component4(): Pwstr = this.pszDocString

    public operator fun component5(): Pwstr = this.pszHelpFile

    public operator fun component6(): UInt = this.dwHelpContext

    public fun copy(cb: UInt = this.cb, pszTitle: Pwstr = this.pszTitle, size: Size = this.size, pszDocString: Pwstr = this.pszDocString, pszHelpFile: Pwstr = this.pszHelpFile, dwHelpContext: UInt = this.dwHelpContext): Proppageinfo = Proppageinfo(cb = cb, pszTitleCtorArg = pszTitle, size = size, pszDocStringCtorArg = pszDocString, pszHelpFileCtorArg = pszHelpFile, dwHelpContext = dwHelpContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Proppageinfo) return false
        if (this.cb != other.cb) return false
        if (this.pszTitle != other.pszTitle) return false
        if (this.size != other.size) return false
        if (this.pszDocString != other.pszDocString) return false
        if (this.pszHelpFile != other.pszHelpFile) return false
        if (this.dwHelpContext != other.dwHelpContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.pszDocString.hashCode()
        result = 31 * result + this.pszHelpFile.hashCode()
        result = 31 * result + this.dwHelpContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: UInt = 0u,
            pszTitle: Pwstr = MutPtr(0L),
            size: Size = Size(),
            pszDocString: Pwstr = MutPtr(0L),
            pszHelpFile: Pwstr = MutPtr(0L),
            dwHelpContext: UInt = 0u,
        ): Proppageinfo =
            Proppageinfo(
                cb = cb,
                pszTitleCtorArg = pszTitle,
                size = size,
                pszDocStringCtorArg = pszDocString,
                pszHelpFileCtorArg = pszHelpFile,
                dwHelpContext = dwHelpContext,
            )
    }
}

public class Qacontainer internal constructor(
    public var cbSize: UInt,
    pClientSiteCtorArg: MutPtr<CVoid>,
    pAdviseSinkCtorArg: MutPtr<CVoid>,
    pPropertyNotifySinkCtorArg: MutPtr<CVoid>,
    pUnkEventSinkCtorArg: MutPtr<CVoid>,
    public var dwAmbientFlags: UInt,
    public var colorFore: UInt,
    public var colorBack: UInt,
    pFontCtorArg: MutPtr<CVoid>,
    pUndoMgrCtorArg: MutPtr<CVoid>,
    public var dwAppearance: UInt,
    public var lcid: Int,
    hpalCtorArg: Hpalette,
    pBindHostCtorArg: MutPtr<CVoid>,
    pOleControlSiteCtorArg: MutPtr<CVoid>,
    pServiceProviderCtorArg: MutPtr<CVoid>,
) {
    public var pClientSite: MutPtr<CVoid> = pClientSiteCtorArg
        internal set

    public var pAdviseSink: MutPtr<CVoid> = pAdviseSinkCtorArg
        internal set

    public var pPropertyNotifySink: MutPtr<CVoid> = pPropertyNotifySinkCtorArg
        internal set

    public var pUnkEventSink: MutPtr<CVoid> = pUnkEventSinkCtorArg
        internal set

    public var pFont: MutPtr<CVoid> = pFontCtorArg
        internal set

    public var pUndoMgr: MutPtr<CVoid> = pUndoMgrCtorArg
        internal set

    public var hpal: Hpalette = hpalCtorArg
        internal set

    public var pBindHost: MutPtr<CVoid> = pBindHostCtorArg
        internal set

    public var pOleControlSite: MutPtr<CVoid> = pOleControlSiteCtorArg
        internal set

    public var pServiceProvider: MutPtr<CVoid> = pServiceProviderCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pClientSiteCtorArg = MutPtr(0L),
        pAdviseSinkCtorArg = MutPtr(0L),
        pPropertyNotifySinkCtorArg = MutPtr(0L),
        pUnkEventSinkCtorArg = MutPtr(0L),
        dwAmbientFlags = 0u,
        colorFore = 0u,
        colorBack = 0u,
        pFontCtorArg = MutPtr(0L),
        pUndoMgrCtorArg = MutPtr(0L),
        dwAppearance = 0u,
        lcid = 0,
        hpalCtorArg = MutPtr(0L),
        pBindHostCtorArg = MutPtr(0L),
        pOleControlSiteCtorArg = MutPtr(0L),
        pServiceProviderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CVoid> = this.pClientSite

    public operator fun component3(): MutPtr<CVoid> = this.pAdviseSink

    public operator fun component4(): MutPtr<CVoid> = this.pPropertyNotifySink

    public operator fun component5(): MutPtr<CVoid> = this.pUnkEventSink

    public operator fun component6(): UInt = this.dwAmbientFlags

    public operator fun component7(): UInt = this.colorFore

    public operator fun component8(): UInt = this.colorBack

    public operator fun component9(): MutPtr<CVoid> = this.pFont

    public operator fun component10(): MutPtr<CVoid> = this.pUndoMgr

    public operator fun component11(): UInt = this.dwAppearance

    public operator fun component12(): Int = this.lcid

    public operator fun component13(): Hpalette = this.hpal

    public operator fun component14(): MutPtr<CVoid> = this.pBindHost

    public operator fun component15(): MutPtr<CVoid> = this.pOleControlSite

    public operator fun component16(): MutPtr<CVoid> = this.pServiceProvider

    public fun copy(cbSize: UInt = this.cbSize, pClientSite: MutPtr<CVoid> = this.pClientSite, pAdviseSink: MutPtr<CVoid> = this.pAdviseSink, pPropertyNotifySink: MutPtr<CVoid> = this.pPropertyNotifySink, pUnkEventSink: MutPtr<CVoid> = this.pUnkEventSink, dwAmbientFlags: UInt = this.dwAmbientFlags, colorFore: UInt = this.colorFore, colorBack: UInt = this.colorBack, pFont: MutPtr<CVoid> = this.pFont, pUndoMgr: MutPtr<CVoid> = this.pUndoMgr, dwAppearance: UInt = this.dwAppearance, lcid: Int = this.lcid, hpal: Hpalette = this.hpal, pBindHost: MutPtr<CVoid> = this.pBindHost, pOleControlSite: MutPtr<CVoid> = this.pOleControlSite, pServiceProvider: MutPtr<CVoid> = this.pServiceProvider): Qacontainer = Qacontainer(cbSize = cbSize, pClientSiteCtorArg = pClientSite, pAdviseSinkCtorArg = pAdviseSink, pPropertyNotifySinkCtorArg = pPropertyNotifySink, pUnkEventSinkCtorArg = pUnkEventSink, dwAmbientFlags = dwAmbientFlags, colorFore = colorFore, colorBack = colorBack, pFontCtorArg = pFont, pUndoMgrCtorArg = pUndoMgr, dwAppearance = dwAppearance, lcid = lcid, hpalCtorArg = hpal, pBindHostCtorArg = pBindHost, pOleControlSiteCtorArg = pOleControlSite, pServiceProviderCtorArg = pServiceProvider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Qacontainer) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pClientSite != other.pClientSite) return false
        if (this.pAdviseSink != other.pAdviseSink) return false
        if (this.pPropertyNotifySink != other.pPropertyNotifySink) return false
        if (this.pUnkEventSink != other.pUnkEventSink) return false
        if (this.dwAmbientFlags != other.dwAmbientFlags) return false
        if (this.colorFore != other.colorFore) return false
        if (this.colorBack != other.colorBack) return false
        if (this.pFont != other.pFont) return false
        if (this.pUndoMgr != other.pUndoMgr) return false
        if (this.dwAppearance != other.dwAppearance) return false
        if (this.lcid != other.lcid) return false
        if (this.hpal != other.hpal) return false
        if (this.pBindHost != other.pBindHost) return false
        if (this.pOleControlSite != other.pOleControlSite) return false
        if (this.pServiceProvider != other.pServiceProvider) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pClientSite.hashCode()
        result = 31 * result + this.pAdviseSink.hashCode()
        result = 31 * result + this.pPropertyNotifySink.hashCode()
        result = 31 * result + this.pUnkEventSink.hashCode()
        result = 31 * result + this.dwAmbientFlags.hashCode()
        result = 31 * result + this.colorFore.hashCode()
        result = 31 * result + this.colorBack.hashCode()
        result = 31 * result + this.pFont.hashCode()
        result = 31 * result + this.pUndoMgr.hashCode()
        result = 31 * result + this.dwAppearance.hashCode()
        result = 31 * result + this.lcid.hashCode()
        result = 31 * result + this.hpal.hashCode()
        result = 31 * result + this.pBindHost.hashCode()
        result = 31 * result + this.pOleControlSite.hashCode()
        result = 31 * result + this.pServiceProvider.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pClientSite: MutPtr<CVoid> = MutPtr(0L),
            pAdviseSink: MutPtr<CVoid> = MutPtr(0L),
            pPropertyNotifySink: MutPtr<CVoid> = MutPtr(0L),
            pUnkEventSink: MutPtr<CVoid> = MutPtr(0L),
            dwAmbientFlags: UInt = 0u,
            colorFore: UInt = 0u,
            colorBack: UInt = 0u,
            pFont: MutPtr<CVoid> = MutPtr(0L),
            pUndoMgr: MutPtr<CVoid> = MutPtr(0L),
            dwAppearance: UInt = 0u,
            lcid: Int = 0,
            hpal: Hpalette = MutPtr(0L),
            pBindHost: MutPtr<CVoid> = MutPtr(0L),
            pOleControlSite: MutPtr<CVoid> = MutPtr(0L),
            pServiceProvider: MutPtr<CVoid> = MutPtr(0L),
        ): Qacontainer =
            Qacontainer(
                cbSize = cbSize,
                pClientSiteCtorArg = pClientSite,
                pAdviseSinkCtorArg = pAdviseSink,
                pPropertyNotifySinkCtorArg = pPropertyNotifySink,
                pUnkEventSinkCtorArg = pUnkEventSink,
                dwAmbientFlags = dwAmbientFlags,
                colorFore = colorFore,
                colorBack = colorBack,
                pFontCtorArg = pFont,
                pUndoMgrCtorArg = pUndoMgr,
                dwAppearance = dwAppearance,
                lcid = lcid,
                hpalCtorArg = hpal,
                pBindHostCtorArg = pBindHost,
                pOleControlSiteCtorArg = pOleControlSite,
                pServiceProviderCtorArg = pServiceProvider,
            )
    }
}

public data class Qacontrol(
    public var cbSize: UInt = 0u,
    public var dwMiscStatus: UInt = 0u,
    public var dwViewStatus: UInt = 0u,
    public var dwEventCookie: UInt = 0u,
    public var dwPropNotifyCookie: UInt = 0u,
    public var dwPointerActivationPolicy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Qacontrol> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Qacontrol> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Qacontrol =
                    Qacontrol(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Qacontrol) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMiscStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwViewStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwEventCookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPropNotifyCookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPointerActivationPolicy)
                }
            }
    }
}

public data class Safearrayunion(
    public var sfType: UInt = 0u,
    public var u: Safearrayunion0 = Safearrayunion0(),
)

public data class Safearrayunion0(
    public var bstrStr: SafearrBstr = SafearrBstr(),
    public var unknownStr: SafearrUnknown = SafearrUnknown(),
    public var dispatchStr: SafearrDispatch = SafearrDispatch(),
    public var variantStr: SafearrVariant = SafearrVariant(),
    public var recordStr: SafearrBrecord = SafearrBrecord(),
    public var haveIidStr: SafearrHaveiid = SafearrHaveiid(),
    public var byteStr: ByteSizedarr = ByteSizedarr(),
    public var wordStr: WordSizedarr = WordSizedarr(),
    public var longStr: DwordSizedarr = DwordSizedarr(),
    public var hyperStr: HyperSizedarr = HyperSizedarr(),
)

public class SafearrBrecord internal constructor(
    public var size: UInt,
    aRecordCtorArg: MutPtr<MutPtr<WireBrecord>>,
) {
    public var aRecord: MutPtr<MutPtr<WireBrecord>> = aRecordCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        aRecordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<WireBrecord>> = this.aRecord

    public fun copy(size: UInt = this.size, aRecord: MutPtr<MutPtr<WireBrecord>> = this.aRecord): SafearrBrecord = SafearrBrecord(size = size, aRecordCtorArg = aRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrBrecord) return false
        if (this.size != other.size) return false
        if (this.aRecord != other.aRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.aRecord.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrBrecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrBrecord> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SafearrBrecord =
                    SafearrBrecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WireBrecord>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SafearrBrecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WireBrecord>>(64)
                    ).writeNative(addr + 8L, value.aRecord)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            aRecord: MutPtr<MutPtr<WireBrecord>> = MutPtr(0L),
        ): SafearrBrecord =
            SafearrBrecord(
                size = size,
                aRecordCtorArg = aRecord,
            )
    }
}

public class SafearrBstr internal constructor(
    public var size: UInt,
    aBstrCtorArg: MutPtr<MutPtr<FlaggedWordBlob>>,
) {
    public var aBstr: MutPtr<MutPtr<FlaggedWordBlob>> = aBstrCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        aBstrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<FlaggedWordBlob>> = this.aBstr

    public fun copy(size: UInt = this.size, aBstr: MutPtr<MutPtr<FlaggedWordBlob>> = this.aBstr): SafearrBstr = SafearrBstr(size = size, aBstrCtorArg = aBstr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrBstr) return false
        if (this.size != other.size) return false
        if (this.aBstr != other.aBstr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.aBstr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrBstr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrBstr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SafearrBstr =
                    SafearrBstr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<FlaggedWordBlob>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SafearrBstr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<FlaggedWordBlob>>(64)
                    ).writeNative(addr + 8L, value.aBstr)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            aBstr: MutPtr<MutPtr<FlaggedWordBlob>> = MutPtr(0L),
        ): SafearrBstr =
            SafearrBstr(
                size = size,
                aBstrCtorArg = aBstr,
            )
    }
}

public class SafearrDispatch internal constructor(
    public var size: UInt,
    apDispatchCtorArg: MutPtr<MutPtr<CVoid>>,
) {
    public var apDispatch: MutPtr<MutPtr<CVoid>> = apDispatchCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        apDispatchCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.apDispatch

    public fun copy(size: UInt = this.size, apDispatch: MutPtr<MutPtr<CVoid>> = this.apDispatch): SafearrDispatch = SafearrDispatch(size = size, apDispatchCtorArg = apDispatch)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrDispatch) return false
        if (this.size != other.size) return false
        if (this.apDispatch != other.apDispatch) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.apDispatch.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrDispatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrDispatch> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SafearrDispatch =
                    SafearrDispatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SafearrDispatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.apDispatch)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            apDispatch: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
        ): SafearrDispatch =
            SafearrDispatch(
                size = size,
                apDispatchCtorArg = apDispatch,
            )
    }
}

public class SafearrHaveiid internal constructor(
    public var size: UInt,
    apUnknownCtorArg: MutPtr<MutPtr<CVoid>>,
    public var iid: Guid,
) {
    public var apUnknown: MutPtr<MutPtr<CVoid>> = apUnknownCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        apUnknownCtorArg = MutPtr(0L),
        iid = Guid(),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.apUnknown

    public operator fun component3(): Guid = this.iid

    public fun copy(size: UInt = this.size, apUnknown: MutPtr<MutPtr<CVoid>> = this.apUnknown, iid: Guid = this.iid): SafearrHaveiid = SafearrHaveiid(size = size, apUnknownCtorArg = apUnknown, iid = iid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrHaveiid) return false
        if (this.size != other.size) return false
        if (this.apUnknown != other.apUnknown) return false
        if (this.iid != other.iid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.apUnknown.hashCode()
        result = 31 * result + this.iid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            apUnknown: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            iid: Guid = Guid(),
        ): SafearrHaveiid =
            SafearrHaveiid(
                size = size,
                apUnknownCtorArg = apUnknown,
                iid = iid,
            )
    }
}

public class SafearrUnknown internal constructor(
    public var size: UInt,
    apUnknownCtorArg: MutPtr<MutPtr<CVoid>>,
) {
    public var apUnknown: MutPtr<MutPtr<CVoid>> = apUnknownCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        apUnknownCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.apUnknown

    public fun copy(size: UInt = this.size, apUnknown: MutPtr<MutPtr<CVoid>> = this.apUnknown): SafearrUnknown = SafearrUnknown(size = size, apUnknownCtorArg = apUnknown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrUnknown) return false
        if (this.size != other.size) return false
        if (this.apUnknown != other.apUnknown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.apUnknown.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrUnknown> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrUnknown> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SafearrUnknown =
                    SafearrUnknown(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SafearrUnknown) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.apUnknown)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            apUnknown: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
        ): SafearrUnknown =
            SafearrUnknown(
                size = size,
                apUnknownCtorArg = apUnknown,
            )
    }
}

public class SafearrVariant internal constructor(
    public var size: UInt,
    aVariantCtorArg: MutPtr<MutPtr<WireVariant>>,
) {
    public var aVariant: MutPtr<MutPtr<WireVariant>> = aVariantCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        aVariantCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<MutPtr<WireVariant>> = this.aVariant

    public fun copy(size: UInt = this.size, aVariant: MutPtr<MutPtr<WireVariant>> = this.aVariant): SafearrVariant = SafearrVariant(size = size, aVariantCtorArg = aVariant)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SafearrVariant) return false
        if (this.size != other.size) return false
        if (this.aVariant != other.aVariant) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.aVariant.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrVariant> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SafearrVariant> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SafearrVariant =
                    SafearrVariant(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WireVariant>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SafearrVariant) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WireVariant>>(64)
                    ).writeNative(addr + 8L, value.aVariant)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            aVariant: MutPtr<MutPtr<WireVariant>> = MutPtr(0L),
        ): SafearrVariant =
            SafearrVariant(
                size = size,
                aVariantCtorArg = aVariant,
            )
    }
}

public data class Udate(
    public var st: Systemtime = Systemtime(),
    public var wDayOfYear: UShort = 0u,
)

public class WireBrecord internal constructor(
    public var fFlags: UInt,
    public var clSize: UInt,
    pRecInfoCtorArg: MutPtr<CVoid>,
    pRecordCtorArg: MutPtr<UByte>,
) {
    public var pRecInfo: MutPtr<CVoid> = pRecInfoCtorArg
        internal set

    public var pRecord: MutPtr<UByte> = pRecordCtorArg
        internal set

    public constructor() : this(
        fFlags = 0u,
        clSize = 0u,
        pRecInfoCtorArg = MutPtr(0L),
        pRecordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fFlags

    public operator fun component2(): UInt = this.clSize

    public operator fun component3(): MutPtr<CVoid> = this.pRecInfo

    public operator fun component4(): MutPtr<UByte> = this.pRecord

    public fun copy(fFlags: UInt = this.fFlags, clSize: UInt = this.clSize, pRecInfo: MutPtr<CVoid> = this.pRecInfo, pRecord: MutPtr<UByte> = this.pRecord): WireBrecord = WireBrecord(fFlags = fFlags, clSize = clSize, pRecInfoCtorArg = pRecInfo, pRecordCtorArg = pRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WireBrecord) return false
        if (this.fFlags != other.fFlags) return false
        if (this.clSize != other.clSize) return false
        if (this.pRecInfo != other.pRecInfo) return false
        if (this.pRecord != other.pRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlags.hashCode()
        result = 31 * result + this.clSize.hashCode()
        result = 31 * result + this.pRecInfo.hashCode()
        result = 31 * result + this.pRecord.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WireBrecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WireBrecord> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WireBrecord =
                    WireBrecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WireBrecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pRecInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pRecord)
                }
            }

        public operator fun invoke(
            fFlags: UInt = 0u,
            clSize: UInt = 0u,
            pRecInfo: MutPtr<CVoid> = MutPtr(0L),
            pRecord: MutPtr<UByte> = MutPtr(0L),
        ): WireBrecord =
            WireBrecord(
                fFlags = fFlags,
                clSize = clSize,
                pRecInfoCtorArg = pRecInfo,
                pRecordCtorArg = pRecord,
            )
    }
}

public data class WireSafearray(
    public var cDims: UShort = 0u,
    public var fFeatures: UShort = 0u,
    public var cbElements: UInt = 0u,
    public var cLocks: UInt = 0u,
    public var uArrayStructs: Safearrayunion = Safearrayunion(),
    public var rgsabound: List<Safearraybound> = List(1) { Safearraybound() },
)

public data class WireVariant(
    public var clSize: UInt = 0u,
    public var rpcReserved: UInt = 0u,
    public var vt: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: WireVariant0 = WireVariant0(),
)

public class WireVariant0 internal constructor(
    public var llVal: Long,
    public var lVal: Int,
    public var bVal: UByte,
    public var iVal: Short,
    public var fltVal: Float,
    public var dblVal: Double,
    public var boolVal: VariantBool,
    public var scode: Int,
    public var cyVal: CY,
    public var date: Double,
    bstrValCtorArg: MutPtr<FlaggedWordBlob>,
    punkValCtorArg: MutPtr<CVoid>,
    pdispValCtorArg: MutPtr<CVoid>,
    parrayCtorArg: MutPtr<MutPtr<WireSafearray>>,
    brecValCtorArg: MutPtr<WireBrecord>,
    pbValCtorArg: MutPtr<UByte>,
    piValCtorArg: MutPtr<Short>,
    plValCtorArg: MutPtr<Int>,
    pllValCtorArg: MutPtr<Long>,
    pfltValCtorArg: MutPtr<Float>,
    pdblValCtorArg: MutPtr<Double>,
    pboolValCtorArg: MutPtr<VariantBool>,
    pscodeCtorArg: MutPtr<Int>,
    pcyValCtorArg: MutPtr<CY>,
    pdateCtorArg: MutPtr<Double>,
    pbstrValCtorArg: MutPtr<MutPtr<FlaggedWordBlob>>,
    ppunkValCtorArg: MutPtr<MutPtr<CVoid>>,
    ppdispValCtorArg: MutPtr<MutPtr<CVoid>>,
    pparrayCtorArg: MutPtr<MutPtr<MutPtr<WireSafearray>>>,
    pvarValCtorArg: MutPtr<MutPtr<WireVariant>>,
    public var cVal: Byte,
    public var uiVal: UShort,
    public var ulVal: UInt,
    public var ullVal: ULong,
    public var intVal: Int,
    public var uintVal: UInt,
    public var decVal: Decimal,
    pdecValCtorArg: MutPtr<Decimal>,
    pcValCtorArg: Pstr,
    puiValCtorArg: MutPtr<UShort>,
    pulValCtorArg: MutPtr<UInt>,
    pullValCtorArg: MutPtr<ULong>,
    pintValCtorArg: MutPtr<Int>,
    puintValCtorArg: MutPtr<UInt>,
) {
    public var bstrVal: MutPtr<FlaggedWordBlob> = bstrValCtorArg
        internal set

    public var punkVal: MutPtr<CVoid> = punkValCtorArg
        internal set

    public var pdispVal: MutPtr<CVoid> = pdispValCtorArg
        internal set

    public var parray: MutPtr<MutPtr<WireSafearray>> = parrayCtorArg
        internal set

    public var brecVal: MutPtr<WireBrecord> = brecValCtorArg
        internal set

    public var pbVal: MutPtr<UByte> = pbValCtorArg
        internal set

    public var piVal: MutPtr<Short> = piValCtorArg
        internal set

    public var plVal: MutPtr<Int> = plValCtorArg
        internal set

    public var pllVal: MutPtr<Long> = pllValCtorArg
        internal set

    public var pfltVal: MutPtr<Float> = pfltValCtorArg
        internal set

    public var pdblVal: MutPtr<Double> = pdblValCtorArg
        internal set

    public var pboolVal: MutPtr<VariantBool> = pboolValCtorArg
        internal set

    public var pscode: MutPtr<Int> = pscodeCtorArg
        internal set

    public var pcyVal: MutPtr<CY> = pcyValCtorArg
        internal set

    public var pdate: MutPtr<Double> = pdateCtorArg
        internal set

    public var pbstrVal: MutPtr<MutPtr<FlaggedWordBlob>> = pbstrValCtorArg
        internal set

    public var ppunkVal: MutPtr<MutPtr<CVoid>> = ppunkValCtorArg
        internal set

    public var ppdispVal: MutPtr<MutPtr<CVoid>> = ppdispValCtorArg
        internal set

    public var pparray: MutPtr<MutPtr<MutPtr<WireSafearray>>> = pparrayCtorArg
        internal set

    public var pvarVal: MutPtr<MutPtr<WireVariant>> = pvarValCtorArg
        internal set

    public var pdecVal: MutPtr<Decimal> = pdecValCtorArg
        internal set

    public var pcVal: Pstr = pcValCtorArg
        internal set

    public var puiVal: MutPtr<UShort> = puiValCtorArg
        internal set

    public var pulVal: MutPtr<UInt> = pulValCtorArg
        internal set

    public var pullVal: MutPtr<ULong> = pullValCtorArg
        internal set

    public var pintVal: MutPtr<Int> = pintValCtorArg
        internal set

    public var puintVal: MutPtr<UInt> = puintValCtorArg
        internal set

    public constructor() : this(
        llVal = 0L,
        lVal = 0,
        bVal = 0u,
        iVal = 0,
        fltVal = 0.0f,
        dblVal = 0.0,
        boolVal = 0,
        scode = 0,
        cyVal = CY(),
        date = 0.0,
        bstrValCtorArg = MutPtr(0L),
        punkValCtorArg = MutPtr(0L),
        pdispValCtorArg = MutPtr(0L),
        parrayCtorArg = MutPtr(0L),
        brecValCtorArg = MutPtr(0L),
        pbValCtorArg = MutPtr(0L),
        piValCtorArg = MutPtr(0L),
        plValCtorArg = MutPtr(0L),
        pllValCtorArg = MutPtr(0L),
        pfltValCtorArg = MutPtr(0L),
        pdblValCtorArg = MutPtr(0L),
        pboolValCtorArg = MutPtr(0L),
        pscodeCtorArg = MutPtr(0L),
        pcyValCtorArg = MutPtr(0L),
        pdateCtorArg = MutPtr(0L),
        pbstrValCtorArg = MutPtr(0L),
        ppunkValCtorArg = MutPtr(0L),
        ppdispValCtorArg = MutPtr(0L),
        pparrayCtorArg = MutPtr(0L),
        pvarValCtorArg = MutPtr(0L),
        cVal = 0,
        uiVal = 0u,
        ulVal = 0u,
        ullVal = 0uL,
        intVal = 0,
        uintVal = 0u,
        decVal = Decimal(),
        pdecValCtorArg = MutPtr(0L),
        pcValCtorArg = MutPtr(0L),
        puiValCtorArg = MutPtr(0L),
        pulValCtorArg = MutPtr(0L),
        pullValCtorArg = MutPtr(0L),
        pintValCtorArg = MutPtr(0L),
        puintValCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            llVal: Long = 0L,
            lVal: Int = 0,
            bVal: UByte = 0u,
            iVal: Short = 0,
            fltVal: Float = 0.0f,
            dblVal: Double = 0.0,
            boolVal: VariantBool = 0,
            scode: Int = 0,
            cyVal: CY = CY(),
            date: Double = 0.0,
            bstrVal: MutPtr<FlaggedWordBlob> = MutPtr(0L),
            punkVal: MutPtr<CVoid> = MutPtr(0L),
            pdispVal: MutPtr<CVoid> = MutPtr(0L),
            parray: MutPtr<MutPtr<WireSafearray>> = MutPtr(0L),
            brecVal: MutPtr<WireBrecord> = MutPtr(0L),
            pbVal: MutPtr<UByte> = MutPtr(0L),
            piVal: MutPtr<Short> = MutPtr(0L),
            plVal: MutPtr<Int> = MutPtr(0L),
            pllVal: MutPtr<Long> = MutPtr(0L),
            pfltVal: MutPtr<Float> = MutPtr(0L),
            pdblVal: MutPtr<Double> = MutPtr(0L),
            pboolVal: MutPtr<VariantBool> = MutPtr(0L),
            pscode: MutPtr<Int> = MutPtr(0L),
            pcyVal: MutPtr<CY> = MutPtr(0L),
            pdate: MutPtr<Double> = MutPtr(0L),
            pbstrVal: MutPtr<MutPtr<FlaggedWordBlob>> = MutPtr(0L),
            ppunkVal: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            ppdispVal: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            pparray: MutPtr<MutPtr<MutPtr<WireSafearray>>> = MutPtr(0L),
            pvarVal: MutPtr<MutPtr<WireVariant>> = MutPtr(0L),
            cVal: Byte = 0,
            uiVal: UShort = 0u,
            ulVal: UInt = 0u,
            ullVal: ULong = 0uL,
            intVal: Int = 0,
            uintVal: UInt = 0u,
            decVal: Decimal = Decimal(),
            pdecVal: MutPtr<Decimal> = MutPtr(0L),
            pcVal: Pstr = MutPtr(0L),
            puiVal: MutPtr<UShort> = MutPtr(0L),
            pulVal: MutPtr<UInt> = MutPtr(0L),
            pullVal: MutPtr<ULong> = MutPtr(0L),
            pintVal: MutPtr<Int> = MutPtr(0L),
            puintVal: MutPtr<UInt> = MutPtr(0L),
        ): WireVariant0 =
            WireVariant0(
                llVal = llVal,
                lVal = lVal,
                bVal = bVal,
                iVal = iVal,
                fltVal = fltVal,
                dblVal = dblVal,
                boolVal = boolVal,
                scode = scode,
                cyVal = cyVal,
                date = date,
                bstrValCtorArg = bstrVal,
                punkValCtorArg = punkVal,
                pdispValCtorArg = pdispVal,
                parrayCtorArg = parray,
                brecValCtorArg = brecVal,
                pbValCtorArg = pbVal,
                piValCtorArg = piVal,
                plValCtorArg = plVal,
                pllValCtorArg = pllVal,
                pfltValCtorArg = pfltVal,
                pdblValCtorArg = pdblVal,
                pboolValCtorArg = pboolVal,
                pscodeCtorArg = pscode,
                pcyValCtorArg = pcyVal,
                pdateCtorArg = pdate,
                pbstrValCtorArg = pbstrVal,
                ppunkValCtorArg = ppunkVal,
                ppdispValCtorArg = ppdispVal,
                pparrayCtorArg = pparray,
                pvarValCtorArg = pvarVal,
                cVal = cVal,
                uiVal = uiVal,
                ulVal = ulVal,
                ullVal = ullVal,
                intVal = intVal,
                uintVal = uintVal,
                decVal = decVal,
                pdecValCtorArg = pdecVal,
                pcValCtorArg = pcVal,
                puiValCtorArg = puiVal,
                pulValCtorArg = pulVal,
                pullValCtorArg = pullVal,
                pintValCtorArg = pintVal,
                puintValCtorArg = puintVal,
            )
    }
}
