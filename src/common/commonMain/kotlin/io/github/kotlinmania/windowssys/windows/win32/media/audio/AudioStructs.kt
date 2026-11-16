@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public class Acmdriverdetailsa internal constructor(
    public var cbStruct: UInt,
    public var fccType: UInt,
    public var fccComp: UInt,
    public var wMid: UShort,
    public var wPid: UShort,
    public var vdwACM: UInt,
    public var vdwDriver: UInt,
    public var fdwSupport: UInt,
    public var cFormatTags: UInt,
    public var cFilterTags: UInt,
    hiconCtorArg: Hicon,
    public var szShortName: ByteArray,
    public var szLongName: ByteArray,
    public var szCopyright: ByteArray,
    public var szLicensing: ByteArray,
    public var szFeatures: ByteArray,
) {
    public var hicon: Hicon = hiconCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fccType = 0u,
        fccComp = 0u,
        wMid = 0u,
        wPid = 0u,
        vdwACM = 0u,
        vdwDriver = 0u,
        fdwSupport = 0u,
        cFormatTags = 0u,
        cFilterTags = 0u,
        hiconCtorArg = MutPtr(0L),
        szShortName = ByteArray(32),
        szLongName = ByteArray(128),
        szCopyright = ByteArray(80),
        szLicensing = ByteArray(128),
        szFeatures = ByteArray(512),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fccType

    public operator fun component3(): UInt = this.fccComp

    public operator fun component4(): UShort = this.wMid

    public operator fun component5(): UShort = this.wPid

    public operator fun component6(): UInt = this.vdwACM

    public operator fun component7(): UInt = this.vdwDriver

    public operator fun component8(): UInt = this.fdwSupport

    public operator fun component9(): UInt = this.cFormatTags

    public operator fun component10(): UInt = this.cFilterTags

    public operator fun component11(): Hicon = this.hicon

    public operator fun component12(): ByteArray = this.szShortName

    public operator fun component13(): ByteArray = this.szLongName

    public operator fun component14(): ByteArray = this.szCopyright

    public operator fun component15(): ByteArray = this.szLicensing

    public operator fun component16(): ByteArray = this.szFeatures

    public fun copy(cbStruct: UInt = this.cbStruct, fccType: UInt = this.fccType, fccComp: UInt = this.fccComp, wMid: UShort = this.wMid, wPid: UShort = this.wPid, vdwACM: UInt = this.vdwACM, vdwDriver: UInt = this.vdwDriver, fdwSupport: UInt = this.fdwSupport, cFormatTags: UInt = this.cFormatTags, cFilterTags: UInt = this.cFilterTags, hicon: Hicon = this.hicon, szShortName: ByteArray = this.szShortName, szLongName: ByteArray = this.szLongName, szCopyright: ByteArray = this.szCopyright, szLicensing: ByteArray = this.szLicensing, szFeatures: ByteArray = this.szFeatures): Acmdriverdetailsa = Acmdriverdetailsa(cbStruct = cbStruct, fccType = fccType, fccComp = fccComp, wMid = wMid, wPid = wPid, vdwACM = vdwACM, vdwDriver = vdwDriver, fdwSupport = fdwSupport, cFormatTags = cFormatTags, cFilterTags = cFilterTags, hiconCtorArg = hicon, szShortName = szShortName, szLongName = szLongName, szCopyright = szCopyright, szLicensing = szLicensing, szFeatures = szFeatures)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdriverdetailsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fccType != other.fccType) return false
        if (this.fccComp != other.fccComp) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vdwACM != other.vdwACM) return false
        if (this.vdwDriver != other.vdwDriver) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cFormatTags != other.cFormatTags) return false
        if (this.cFilterTags != other.cFilterTags) return false
        if (this.hicon != other.hicon) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szLongName.contentEquals(other.szLongName)) return false
        if (!this.szCopyright.contentEquals(other.szCopyright)) return false
        if (!this.szLicensing.contentEquals(other.szLicensing)) return false
        if (!this.szFeatures.contentEquals(other.szFeatures)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccComp.hashCode()
        result = 31 * result + this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vdwACM.hashCode()
        result = 31 * result + this.vdwDriver.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cFormatTags.hashCode()
        result = 31 * result + this.cFilterTags.hashCode()
        result = 31 * result + this.hicon.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szLongName.contentHashCode()
        result = 31 * result + this.szCopyright.contentHashCode()
        result = 31 * result + this.szLicensing.contentHashCode()
        result = 31 * result + this.szFeatures.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fccType: UInt = 0u,
            fccComp: UInt = 0u,
            wMid: UShort = 0u,
            wPid: UShort = 0u,
            vdwACM: UInt = 0u,
            vdwDriver: UInt = 0u,
            fdwSupport: UInt = 0u,
            cFormatTags: UInt = 0u,
            cFilterTags: UInt = 0u,
            hicon: Hicon = MutPtr(0L),
            szShortName: ByteArray = ByteArray(32),
            szLongName: ByteArray = ByteArray(128),
            szCopyright: ByteArray = ByteArray(80),
            szLicensing: ByteArray = ByteArray(128),
            szFeatures: ByteArray = ByteArray(512),
        ): Acmdriverdetailsa =
            Acmdriverdetailsa(
                cbStruct = cbStruct,
                fccType = fccType,
                fccComp = fccComp,
                wMid = wMid,
                wPid = wPid,
                vdwACM = vdwACM,
                vdwDriver = vdwDriver,
                fdwSupport = fdwSupport,
                cFormatTags = cFormatTags,
                cFilterTags = cFilterTags,
                hiconCtorArg = hicon,
                szShortName = szShortName,
                szLongName = szLongName,
                szCopyright = szCopyright,
                szLicensing = szLicensing,
                szFeatures = szFeatures,
            )
    }
}

public class Acmdriverdetailsw internal constructor(
    public var cbStruct: UInt,
    public var fccType: UInt,
    public var fccComp: UInt,
    public var wMid: UShort,
    public var wPid: UShort,
    public var vdwACM: UInt,
    public var vdwDriver: UInt,
    public var fdwSupport: UInt,
    public var cFormatTags: UInt,
    public var cFilterTags: UInt,
    hiconCtorArg: Hicon,
    public var szShortName: UShortArray,
    public var szLongName: UShortArray,
    public var szCopyright: UShortArray,
    public var szLicensing: UShortArray,
    public var szFeatures: UShortArray,
) {
    public var hicon: Hicon = hiconCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fccType = 0u,
        fccComp = 0u,
        wMid = 0u,
        wPid = 0u,
        vdwACM = 0u,
        vdwDriver = 0u,
        fdwSupport = 0u,
        cFormatTags = 0u,
        cFilterTags = 0u,
        hiconCtorArg = MutPtr(0L),
        szShortName = UShortArray(32),
        szLongName = UShortArray(128),
        szCopyright = UShortArray(80),
        szLicensing = UShortArray(128),
        szFeatures = UShortArray(512),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fccType

    public operator fun component3(): UInt = this.fccComp

    public operator fun component4(): UShort = this.wMid

    public operator fun component5(): UShort = this.wPid

    public operator fun component6(): UInt = this.vdwACM

    public operator fun component7(): UInt = this.vdwDriver

    public operator fun component8(): UInt = this.fdwSupport

    public operator fun component9(): UInt = this.cFormatTags

    public operator fun component10(): UInt = this.cFilterTags

    public operator fun component11(): Hicon = this.hicon

    public operator fun component12(): UShortArray = this.szShortName

    public operator fun component13(): UShortArray = this.szLongName

    public operator fun component14(): UShortArray = this.szCopyright

    public operator fun component15(): UShortArray = this.szLicensing

    public operator fun component16(): UShortArray = this.szFeatures

    public fun copy(cbStruct: UInt = this.cbStruct, fccType: UInt = this.fccType, fccComp: UInt = this.fccComp, wMid: UShort = this.wMid, wPid: UShort = this.wPid, vdwACM: UInt = this.vdwACM, vdwDriver: UInt = this.vdwDriver, fdwSupport: UInt = this.fdwSupport, cFormatTags: UInt = this.cFormatTags, cFilterTags: UInt = this.cFilterTags, hicon: Hicon = this.hicon, szShortName: UShortArray = this.szShortName, szLongName: UShortArray = this.szLongName, szCopyright: UShortArray = this.szCopyright, szLicensing: UShortArray = this.szLicensing, szFeatures: UShortArray = this.szFeatures): Acmdriverdetailsw = Acmdriverdetailsw(cbStruct = cbStruct, fccType = fccType, fccComp = fccComp, wMid = wMid, wPid = wPid, vdwACM = vdwACM, vdwDriver = vdwDriver, fdwSupport = fdwSupport, cFormatTags = cFormatTags, cFilterTags = cFilterTags, hiconCtorArg = hicon, szShortName = szShortName, szLongName = szLongName, szCopyright = szCopyright, szLicensing = szLicensing, szFeatures = szFeatures)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdriverdetailsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fccType != other.fccType) return false
        if (this.fccComp != other.fccComp) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vdwACM != other.vdwACM) return false
        if (this.vdwDriver != other.vdwDriver) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cFormatTags != other.cFormatTags) return false
        if (this.cFilterTags != other.cFilterTags) return false
        if (this.hicon != other.hicon) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szLongName.contentEquals(other.szLongName)) return false
        if (!this.szCopyright.contentEquals(other.szCopyright)) return false
        if (!this.szLicensing.contentEquals(other.szLicensing)) return false
        if (!this.szFeatures.contentEquals(other.szFeatures)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccComp.hashCode()
        result = 31 * result + this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vdwACM.hashCode()
        result = 31 * result + this.vdwDriver.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cFormatTags.hashCode()
        result = 31 * result + this.cFilterTags.hashCode()
        result = 31 * result + this.hicon.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szLongName.contentHashCode()
        result = 31 * result + this.szCopyright.contentHashCode()
        result = 31 * result + this.szLicensing.contentHashCode()
        result = 31 * result + this.szFeatures.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fccType: UInt = 0u,
            fccComp: UInt = 0u,
            wMid: UShort = 0u,
            wPid: UShort = 0u,
            vdwACM: UInt = 0u,
            vdwDriver: UInt = 0u,
            fdwSupport: UInt = 0u,
            cFormatTags: UInt = 0u,
            cFilterTags: UInt = 0u,
            hicon: Hicon = MutPtr(0L),
            szShortName: UShortArray = UShortArray(32),
            szLongName: UShortArray = UShortArray(128),
            szCopyright: UShortArray = UShortArray(80),
            szLicensing: UShortArray = UShortArray(128),
            szFeatures: UShortArray = UShortArray(512),
        ): Acmdriverdetailsw =
            Acmdriverdetailsw(
                cbStruct = cbStruct,
                fccType = fccType,
                fccComp = fccComp,
                wMid = wMid,
                wPid = wPid,
                vdwACM = vdwACM,
                vdwDriver = vdwDriver,
                fdwSupport = fdwSupport,
                cFormatTags = cFormatTags,
                cFilterTags = cFilterTags,
                hiconCtorArg = hicon,
                szShortName = szShortName,
                szLongName = szLongName,
                szCopyright = szCopyright,
                szLicensing = szLicensing,
                szFeatures = szFeatures,
            )
    }
}

public class Acmdrvformatsuggest internal constructor(
    public var cbStruct: UInt,
    public var fdwSuggest: UInt,
    pwfxSrcCtorArg: MutPtr,
    public var cbwfxSrc: UInt,
    pwfxDstCtorArg: MutPtr,
    public var cbwfxDst: UInt,
) {
    public var pwfxSrc: MutPtr = pwfxSrcCtorArg
        internal set

    public var pwfxDst: MutPtr = pwfxDstCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwSuggest = 0u,
        pwfxSrcCtorArg = MutPtr(0L),
        cbwfxSrc = 0u,
        pwfxDstCtorArg = MutPtr(0L),
        cbwfxDst = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwSuggest

    public operator fun component3(): MutPtr = this.pwfxSrc

    public operator fun component4(): UInt = this.cbwfxSrc

    public operator fun component5(): MutPtr = this.pwfxDst

    public operator fun component6(): UInt = this.cbwfxDst

    public fun copy(cbStruct: UInt = this.cbStruct, fdwSuggest: UInt = this.fdwSuggest, pwfxSrc: MutPtr = this.pwfxSrc, cbwfxSrc: UInt = this.cbwfxSrc, pwfxDst: MutPtr = this.pwfxDst, cbwfxDst: UInt = this.cbwfxDst): Acmdrvformatsuggest = Acmdrvformatsuggest(cbStruct = cbStruct, fdwSuggest = fdwSuggest, pwfxSrcCtorArg = pwfxSrc, cbwfxSrc = cbwfxSrc, pwfxDstCtorArg = pwfxDst, cbwfxDst = cbwfxDst)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdrvformatsuggest) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwSuggest != other.fdwSuggest) return false
        if (this.pwfxSrc != other.pwfxSrc) return false
        if (this.cbwfxSrc != other.cbwfxSrc) return false
        if (this.pwfxDst != other.pwfxDst) return false
        if (this.cbwfxDst != other.cbwfxDst) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwSuggest.hashCode()
        result = 31 * result + this.pwfxSrc.hashCode()
        result = 31 * result + this.cbwfxSrc.hashCode()
        result = 31 * result + this.pwfxDst.hashCode()
        result = 31 * result + this.cbwfxDst.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvformatsuggest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvformatsuggest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Acmdrvformatsuggest =
                    Acmdrvformatsuggest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Acmdrvformatsuggest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fdwSuggest)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pwfxSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbwfxSrc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 20L, value.pwfxDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbwfxDst)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwSuggest: UInt = 0u,
            pwfxSrc: MutPtr = MutPtr(0L),
            cbwfxSrc: UInt = 0u,
            pwfxDst: MutPtr = MutPtr(0L),
            cbwfxDst: UInt = 0u,
        ): Acmdrvformatsuggest =
            Acmdrvformatsuggest(
                cbStruct = cbStruct,
                fdwSuggest = fdwSuggest,
                pwfxSrcCtorArg = pwfxSrc,
                cbwfxSrc = cbwfxSrc,
                pwfxDstCtorArg = pwfxDst,
                cbwfxDst = cbwfxDst,
            )
    }
}

public class Acmdrvopendesca internal constructor(
    public var cbStruct: UInt,
    public var fccType: UInt,
    public var fccComp: UInt,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    public var dwError: UInt,
    pszSectionNameCtorArg: Pcstr,
    pszAliasNameCtorArg: Pcstr,
    public var dnDevNode: UInt,
) {
    public var pszSectionName: Pcstr = pszSectionNameCtorArg
        internal set

    public var pszAliasName: Pcstr = pszAliasNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fccType = 0u,
        fccComp = 0u,
        dwVersion = 0u,
        dwFlags = 0u,
        dwError = 0u,
        pszSectionNameCtorArg = ConstPtr(0L),
        pszAliasNameCtorArg = ConstPtr(0L),
        dnDevNode = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fccType

    public operator fun component3(): UInt = this.fccComp

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): UInt = this.dwError

    public operator fun component7(): Pcstr = this.pszSectionName

    public operator fun component8(): Pcstr = this.pszAliasName

    public operator fun component9(): UInt = this.dnDevNode

    public fun copy(cbStruct: UInt = this.cbStruct, fccType: UInt = this.fccType, fccComp: UInt = this.fccComp, dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, dwError: UInt = this.dwError, pszSectionName: Pcstr = this.pszSectionName, pszAliasName: Pcstr = this.pszAliasName, dnDevNode: UInt = this.dnDevNode): Acmdrvopendesca = Acmdrvopendesca(cbStruct = cbStruct, fccType = fccType, fccComp = fccComp, dwVersion = dwVersion, dwFlags = dwFlags, dwError = dwError, pszSectionNameCtorArg = pszSectionName, pszAliasNameCtorArg = pszAliasName, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdrvopendesca) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fccType != other.fccType) return false
        if (this.fccComp != other.fccComp) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwError != other.dwError) return false
        if (this.pszSectionName != other.pszSectionName) return false
        if (this.pszAliasName != other.pszAliasName) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccComp.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pszSectionName.hashCode()
        result = 31 * result + this.pszAliasName.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fccType: UInt = 0u,
            fccComp: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            dwError: UInt = 0u,
            pszSectionName: Pcstr = ConstPtr(0L),
            pszAliasName: Pcstr = ConstPtr(0L),
            dnDevNode: UInt = 0u,
        ): Acmdrvopendesca =
            Acmdrvopendesca(
                cbStruct = cbStruct,
                fccType = fccType,
                fccComp = fccComp,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                dwError = dwError,
                pszSectionNameCtorArg = pszSectionName,
                pszAliasNameCtorArg = pszAliasName,
                dnDevNode = dnDevNode,
            )
    }
}

public class Acmdrvopendescw internal constructor(
    public var cbStruct: UInt,
    public var fccType: UInt,
    public var fccComp: UInt,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    public var dwError: UInt,
    pszSectionNameCtorArg: Pcwstr,
    pszAliasNameCtorArg: Pcwstr,
    public var dnDevNode: UInt,
) {
    public var pszSectionName: Pcwstr = pszSectionNameCtorArg
        internal set

    public var pszAliasName: Pcwstr = pszAliasNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fccType = 0u,
        fccComp = 0u,
        dwVersion = 0u,
        dwFlags = 0u,
        dwError = 0u,
        pszSectionNameCtorArg = ConstPtr(0L),
        pszAliasNameCtorArg = ConstPtr(0L),
        dnDevNode = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fccType

    public operator fun component3(): UInt = this.fccComp

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): UInt = this.dwError

    public operator fun component7(): Pcwstr = this.pszSectionName

    public operator fun component8(): Pcwstr = this.pszAliasName

    public operator fun component9(): UInt = this.dnDevNode

    public fun copy(cbStruct: UInt = this.cbStruct, fccType: UInt = this.fccType, fccComp: UInt = this.fccComp, dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, dwError: UInt = this.dwError, pszSectionName: Pcwstr = this.pszSectionName, pszAliasName: Pcwstr = this.pszAliasName, dnDevNode: UInt = this.dnDevNode): Acmdrvopendescw = Acmdrvopendescw(cbStruct = cbStruct, fccType = fccType, fccComp = fccComp, dwVersion = dwVersion, dwFlags = dwFlags, dwError = dwError, pszSectionNameCtorArg = pszSectionName, pszAliasNameCtorArg = pszAliasName, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdrvopendescw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fccType != other.fccType) return false
        if (this.fccComp != other.fccComp) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwError != other.dwError) return false
        if (this.pszSectionName != other.pszSectionName) return false
        if (this.pszAliasName != other.pszAliasName) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccComp.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pszSectionName.hashCode()
        result = 31 * result + this.pszAliasName.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fccType: UInt = 0u,
            fccComp: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            dwError: UInt = 0u,
            pszSectionName: Pcwstr = ConstPtr(0L),
            pszAliasName: Pcwstr = ConstPtr(0L),
            dnDevNode: UInt = 0u,
        ): Acmdrvopendescw =
            Acmdrvopendescw(
                cbStruct = cbStruct,
                fccType = fccType,
                fccComp = fccComp,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                dwError = dwError,
                pszSectionNameCtorArg = pszSectionName,
                pszAliasNameCtorArg = pszAliasName,
                dnDevNode = dnDevNode,
            )
    }
}

public class Acmdrvstreamheader internal constructor(
    public var cbStruct: UInt,
    public var fdwStatus: UInt,
    public var dwUser: Int,
    pbSrcCtorArg: MutPtr,
    public var cbSrcLength: UInt,
    public var cbSrcLengthUsed: UInt,
    public var dwSrcUser: Int,
    pbDstCtorArg: MutPtr,
    public var cbDstLength: UInt,
    public var cbDstLengthUsed: UInt,
    public var dwDstUser: Int,
    public var fdwConvert: UInt,
    padshNextCtorArg: MutPtr,
    public var fdwDriver: UInt,
    public var dwDriver: Int,
    public var fdwPrepared: UInt,
    public var dwPrepared: Int,
    pbPreparedSrcCtorArg: MutPtr,
    public var cbPreparedSrcLength: UInt,
    pbPreparedDstCtorArg: MutPtr,
    public var cbPreparedDstLength: UInt,
) {
    public var pbSrc: MutPtr = pbSrcCtorArg
        internal set

    public var pbDst: MutPtr = pbDstCtorArg
        internal set

    public var padshNext: MutPtr = padshNextCtorArg
        internal set

    public var pbPreparedSrc: MutPtr = pbPreparedSrcCtorArg
        internal set

    public var pbPreparedDst: MutPtr = pbPreparedDstCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStatus = 0u,
        dwUser = 0,
        pbSrcCtorArg = MutPtr(0L),
        cbSrcLength = 0u,
        cbSrcLengthUsed = 0u,
        dwSrcUser = 0,
        pbDstCtorArg = MutPtr(0L),
        cbDstLength = 0u,
        cbDstLengthUsed = 0u,
        dwDstUser = 0,
        fdwConvert = 0u,
        padshNextCtorArg = MutPtr(0L),
        fdwDriver = 0u,
        dwDriver = 0,
        fdwPrepared = 0u,
        dwPrepared = 0,
        pbPreparedSrcCtorArg = MutPtr(0L),
        cbPreparedSrcLength = 0u,
        pbPreparedDstCtorArg = MutPtr(0L),
        cbPreparedDstLength = 0u,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreamheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreamheader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): Acmdrvstreamheader =
                    Acmdrvstreamheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: Acmdrvstreamheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fdwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwUser)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pbSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbSrcLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbSrcLengthUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.dwSrcUser)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pbDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbDstLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cbDstLengthUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.dwDstUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.fdwConvert)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 68L, value.padshNext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.fdwDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.dwDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.fdwPrepared)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 92L, value.dwPrepared)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 100L, value.pbPreparedSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.cbPreparedSrcLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 112L, value.pbPreparedDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.cbPreparedDstLength)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStatus: UInt = 0u,
            dwUser: Int = 0,
            pbSrc: MutPtr = MutPtr(0L),
            cbSrcLength: UInt = 0u,
            cbSrcLengthUsed: UInt = 0u,
            dwSrcUser: Int = 0,
            pbDst: MutPtr = MutPtr(0L),
            cbDstLength: UInt = 0u,
            cbDstLengthUsed: UInt = 0u,
            dwDstUser: Int = 0,
            fdwConvert: UInt = 0u,
            padshNext: MutPtr = MutPtr(0L),
            fdwDriver: UInt = 0u,
            dwDriver: Int = 0,
            fdwPrepared: UInt = 0u,
            dwPrepared: Int = 0,
            pbPreparedSrc: MutPtr = MutPtr(0L),
            cbPreparedSrcLength: UInt = 0u,
            pbPreparedDst: MutPtr = MutPtr(0L),
            cbPreparedDstLength: UInt = 0u,
        ): Acmdrvstreamheader =
            Acmdrvstreamheader(
                cbStruct = cbStruct,
                fdwStatus = fdwStatus,
                dwUser = dwUser,
                pbSrcCtorArg = pbSrc,
                cbSrcLength = cbSrcLength,
                cbSrcLengthUsed = cbSrcLengthUsed,
                dwSrcUser = dwSrcUser,
                pbDstCtorArg = pbDst,
                cbDstLength = cbDstLength,
                cbDstLengthUsed = cbDstLengthUsed,
                dwDstUser = dwDstUser,
                fdwConvert = fdwConvert,
                padshNextCtorArg = padshNext,
                fdwDriver = fdwDriver,
                dwDriver = dwDriver,
                fdwPrepared = fdwPrepared,
                dwPrepared = dwPrepared,
                pbPreparedSrcCtorArg = pbPreparedSrc,
                cbPreparedSrcLength = cbPreparedSrcLength,
                pbPreparedDstCtorArg = pbPreparedDst,
                cbPreparedDstLength = cbPreparedDstLength,
            )
    }
}

public class Acmdrvstreaminstance internal constructor(
    public var cbStruct: UInt,
    pwfxSrcCtorArg: MutPtr,
    pwfxDstCtorArg: MutPtr,
    pwfltrCtorArg: MutPtr,
    public var dwCallback: Int,
    public var dwInstance: Int,
    public var fdwOpen: UInt,
    public var fdwDriver: UInt,
    public var dwDriver: Int,
    hasCtorArg: Hacmstream,
) {
    public var pwfxSrc: MutPtr = pwfxSrcCtorArg
        internal set

    public var pwfxDst: MutPtr = pwfxDstCtorArg
        internal set

    public var pwfltr: MutPtr = pwfltrCtorArg
        internal set

    public var has: Hacmstream = hasCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pwfxSrcCtorArg = MutPtr(0L),
        pwfxDstCtorArg = MutPtr(0L),
        pwfltrCtorArg = MutPtr(0L),
        dwCallback = 0,
        dwInstance = 0,
        fdwOpen = 0u,
        fdwDriver = 0u,
        dwDriver = 0,
        hasCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr = this.pwfxSrc

    public operator fun component3(): MutPtr = this.pwfxDst

    public operator fun component4(): MutPtr = this.pwfltr

    public operator fun component5(): Int = this.dwCallback

    public operator fun component6(): Int = this.dwInstance

    public operator fun component7(): UInt = this.fdwOpen

    public operator fun component8(): UInt = this.fdwDriver

    public operator fun component9(): Int = this.dwDriver

    public operator fun component10(): Hacmstream = this.has

    public fun copy(cbStruct: UInt = this.cbStruct, pwfxSrc: MutPtr = this.pwfxSrc, pwfxDst: MutPtr = this.pwfxDst, pwfltr: MutPtr = this.pwfltr, dwCallback: Int = this.dwCallback, dwInstance: Int = this.dwInstance, fdwOpen: UInt = this.fdwOpen, fdwDriver: UInt = this.fdwDriver, dwDriver: Int = this.dwDriver, has: Hacmstream = this.has): Acmdrvstreaminstance = Acmdrvstreaminstance(cbStruct = cbStruct, pwfxSrcCtorArg = pwfxSrc, pwfxDstCtorArg = pwfxDst, pwfltrCtorArg = pwfltr, dwCallback = dwCallback, dwInstance = dwInstance, fdwOpen = fdwOpen, fdwDriver = fdwDriver, dwDriver = dwDriver, hasCtorArg = has)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmdrvstreaminstance) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pwfxSrc != other.pwfxSrc) return false
        if (this.pwfxDst != other.pwfxDst) return false
        if (this.pwfltr != other.pwfltr) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwInstance != other.dwInstance) return false
        if (this.fdwOpen != other.fdwOpen) return false
        if (this.fdwDriver != other.fdwDriver) return false
        if (this.dwDriver != other.dwDriver) return false
        if (this.has != other.has) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pwfxSrc.hashCode()
        result = 31 * result + this.pwfxDst.hashCode()
        result = 31 * result + this.pwfltr.hashCode()
        result = 31 * result + this.dwCallback.hashCode()
        result = 31 * result + this.dwInstance.hashCode()
        result = 31 * result + this.fdwOpen.hashCode()
        result = 31 * result + this.fdwDriver.hashCode()
        result = 31 * result + this.dwDriver.hashCode()
        result = 31 * result + this.has.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreaminstance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreaminstance> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): Acmdrvstreaminstance =
                    Acmdrvstreaminstance(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: Acmdrvstreaminstance) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.pwfxSrc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 12L, value.pwfxDst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 20L, value.pwfltr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 28L, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 36L, value.dwInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.fdwOpen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fdwDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 52L, value.dwDriver)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 60L, value.has)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            pwfxSrc: MutPtr = MutPtr(0L),
            pwfxDst: MutPtr = MutPtr(0L),
            pwfltr: MutPtr = MutPtr(0L),
            dwCallback: Int = 0,
            dwInstance: Int = 0,
            fdwOpen: UInt = 0u,
            fdwDriver: UInt = 0u,
            dwDriver: Int = 0,
            has: Hacmstream = MutPtr(0L),
        ): Acmdrvstreaminstance =
            Acmdrvstreaminstance(
                cbStruct = cbStruct,
                pwfxSrcCtorArg = pwfxSrc,
                pwfxDstCtorArg = pwfxDst,
                pwfltrCtorArg = pwfltr,
                dwCallback = dwCallback,
                dwInstance = dwInstance,
                fdwOpen = fdwOpen,
                fdwDriver = fdwDriver,
                dwDriver = dwDriver,
                hasCtorArg = has,
            )
    }
}

public data class Acmdrvstreamsize(
    public var cbStruct: UInt = 0u,
    public var fdwSize: UInt = 0u,
    public var cbSrcLength: UInt = 0u,
    public var cbDstLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreamsize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmdrvstreamsize> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Acmdrvstreamsize =
                    Acmdrvstreamsize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Acmdrvstreamsize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fdwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbSrcLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbDstLength)
                }
            }
    }
}

public class Acmfilterchoosea internal constructor(
    public var cbStruct: UInt,
    public var fdwStyle: UInt,
    hwndOwnerCtorArg: Hwnd,
    pwfltrCtorArg: MutPtr,
    public var cbwfltr: UInt,
    pszTitleCtorArg: Pcstr,
    public var szFilterTag: ByteArray,
    public var szFilter: ByteArray,
    pszNameCtorArg: Pstr,
    public var cchName: UInt,
    public var fdwEnum: UInt,
    pwfltrEnumCtorArg: MutPtr,
    hInstanceCtorArg: Hinstance,
    pszTemplateNameCtorArg: Pcstr,
    public var lCustData: Lparam,
    public var pfnHook: Acmfilterchoosehookproca,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pwfltr: MutPtr = pwfltrCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pszName: Pstr = pszNameCtorArg
        internal set

    public var pwfltrEnum: MutPtr = pwfltrEnumCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTemplateName: Pcstr = pszTemplateNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStyle = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pwfltrCtorArg = MutPtr(0L),
        cbwfltr = 0u,
        pszTitleCtorArg = ConstPtr(0L),
        szFilterTag = ByteArray(48),
        szFilter = ByteArray(128),
        pszNameCtorArg = MutPtr(0L),
        cchName = 0u,
        fdwEnum = 0u,
        pwfltrEnumCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pszTemplateNameCtorArg = ConstPtr(0L),
        lCustData = 0L,
        pfnHook = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwStyle

    public operator fun component3(): Hwnd = this.hwndOwner

    public operator fun component4(): MutPtr = this.pwfltr

    public operator fun component5(): UInt = this.cbwfltr

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): ByteArray = this.szFilterTag

    public operator fun component8(): ByteArray = this.szFilter

    public operator fun component9(): Pstr = this.pszName

    public operator fun component10(): UInt = this.cchName

    public operator fun component11(): UInt = this.fdwEnum

    public operator fun component12(): MutPtr = this.pwfltrEnum

    public operator fun component13(): Hinstance = this.hInstance

    public operator fun component14(): Pcstr = this.pszTemplateName

    public operator fun component15(): Lparam = this.lCustData

    public operator fun component16(): Acmfilterchoosehookproca = this.pfnHook

    public fun copy(cbStruct: UInt = this.cbStruct, fdwStyle: UInt = this.fdwStyle, hwndOwner: Hwnd = this.hwndOwner, pwfltr: MutPtr = this.pwfltr, cbwfltr: UInt = this.cbwfltr, pszTitle: Pcstr = this.pszTitle, szFilterTag: ByteArray = this.szFilterTag, szFilter: ByteArray = this.szFilter, pszName: Pstr = this.pszName, cchName: UInt = this.cchName, fdwEnum: UInt = this.fdwEnum, pwfltrEnum: MutPtr = this.pwfltrEnum, hInstance: Hinstance = this.hInstance, pszTemplateName: Pcstr = this.pszTemplateName, lCustData: Lparam = this.lCustData, pfnHook: Acmfilterchoosehookproca = this.pfnHook): Acmfilterchoosea = Acmfilterchoosea(cbStruct = cbStruct, fdwStyle = fdwStyle, hwndOwnerCtorArg = hwndOwner, pwfltrCtorArg = pwfltr, cbwfltr = cbwfltr, pszTitleCtorArg = pszTitle, szFilterTag = szFilterTag, szFilter = szFilter, pszNameCtorArg = pszName, cchName = cchName, fdwEnum = fdwEnum, pwfltrEnumCtorArg = pwfltrEnum, hInstanceCtorArg = hInstance, pszTemplateNameCtorArg = pszTemplateName, lCustData = lCustData, pfnHook = pfnHook)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfilterchoosea) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwStyle != other.fdwStyle) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pwfltr != other.pwfltr) return false
        if (this.cbwfltr != other.cbwfltr) return false
        if (this.pszTitle != other.pszTitle) return false
        if (!this.szFilterTag.contentEquals(other.szFilterTag)) return false
        if (!this.szFilter.contentEquals(other.szFilter)) return false
        if (this.pszName != other.pszName) return false
        if (this.cchName != other.cchName) return false
        if (this.fdwEnum != other.fdwEnum) return false
        if (this.pwfltrEnum != other.pwfltrEnum) return false
        if (this.hInstance != other.hInstance) return false
        if (this.pszTemplateName != other.pszTemplateName) return false
        if (this.lCustData != other.lCustData) return false
        if (this.pfnHook != other.pfnHook) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwStyle.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pwfltr.hashCode()
        result = 31 * result + this.cbwfltr.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.szFilterTag.contentHashCode()
        result = 31 * result + this.szFilter.contentHashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.cchName.hashCode()
        result = 31 * result + this.fdwEnum.hashCode()
        result = 31 * result + this.pwfltrEnum.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.pszTemplateName.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.pfnHook.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStyle: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pwfltr: MutPtr = MutPtr(0L),
            cbwfltr: UInt = 0u,
            pszTitle: Pcstr = ConstPtr(0L),
            szFilterTag: ByteArray = ByteArray(48),
            szFilter: ByteArray = ByteArray(128),
            pszName: Pstr = MutPtr(0L),
            cchName: UInt = 0u,
            fdwEnum: UInt = 0u,
            pwfltrEnum: MutPtr = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pszTemplateName: Pcstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Acmfilterchoosehookproca = null,
        ): Acmfilterchoosea =
            Acmfilterchoosea(
                cbStruct = cbStruct,
                fdwStyle = fdwStyle,
                hwndOwnerCtorArg = hwndOwner,
                pwfltrCtorArg = pwfltr,
                cbwfltr = cbwfltr,
                pszTitleCtorArg = pszTitle,
                szFilterTag = szFilterTag,
                szFilter = szFilter,
                pszNameCtorArg = pszName,
                cchName = cchName,
                fdwEnum = fdwEnum,
                pwfltrEnumCtorArg = pwfltrEnum,
                hInstanceCtorArg = hInstance,
                pszTemplateNameCtorArg = pszTemplateName,
                lCustData = lCustData,
                pfnHook = pfnHook,
            )
    }
}

public class Acmfilterchoosew internal constructor(
    public var cbStruct: UInt,
    public var fdwStyle: UInt,
    hwndOwnerCtorArg: Hwnd,
    pwfltrCtorArg: MutPtr,
    public var cbwfltr: UInt,
    pszTitleCtorArg: Pcwstr,
    public var szFilterTag: UShortArray,
    public var szFilter: UShortArray,
    pszNameCtorArg: Pwstr,
    public var cchName: UInt,
    public var fdwEnum: UInt,
    pwfltrEnumCtorArg: MutPtr,
    hInstanceCtorArg: Hinstance,
    pszTemplateNameCtorArg: Pcwstr,
    public var lCustData: Lparam,
    public var pfnHook: Acmfilterchoosehookprocw,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pwfltr: MutPtr = pwfltrCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pwfltrEnum: MutPtr = pwfltrEnumCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTemplateName: Pcwstr = pszTemplateNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStyle = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pwfltrCtorArg = MutPtr(0L),
        cbwfltr = 0u,
        pszTitleCtorArg = ConstPtr(0L),
        szFilterTag = UShortArray(48),
        szFilter = UShortArray(128),
        pszNameCtorArg = MutPtr(0L),
        cchName = 0u,
        fdwEnum = 0u,
        pwfltrEnumCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pszTemplateNameCtorArg = ConstPtr(0L),
        lCustData = 0L,
        pfnHook = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwStyle

    public operator fun component3(): Hwnd = this.hwndOwner

    public operator fun component4(): MutPtr = this.pwfltr

    public operator fun component5(): UInt = this.cbwfltr

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): UShortArray = this.szFilterTag

    public operator fun component8(): UShortArray = this.szFilter

    public operator fun component9(): Pwstr = this.pszName

    public operator fun component10(): UInt = this.cchName

    public operator fun component11(): UInt = this.fdwEnum

    public operator fun component12(): MutPtr = this.pwfltrEnum

    public operator fun component13(): Hinstance = this.hInstance

    public operator fun component14(): Pcwstr = this.pszTemplateName

    public operator fun component15(): Lparam = this.lCustData

    public operator fun component16(): Acmfilterchoosehookprocw = this.pfnHook

    public fun copy(cbStruct: UInt = this.cbStruct, fdwStyle: UInt = this.fdwStyle, hwndOwner: Hwnd = this.hwndOwner, pwfltr: MutPtr = this.pwfltr, cbwfltr: UInt = this.cbwfltr, pszTitle: Pcwstr = this.pszTitle, szFilterTag: UShortArray = this.szFilterTag, szFilter: UShortArray = this.szFilter, pszName: Pwstr = this.pszName, cchName: UInt = this.cchName, fdwEnum: UInt = this.fdwEnum, pwfltrEnum: MutPtr = this.pwfltrEnum, hInstance: Hinstance = this.hInstance, pszTemplateName: Pcwstr = this.pszTemplateName, lCustData: Lparam = this.lCustData, pfnHook: Acmfilterchoosehookprocw = this.pfnHook): Acmfilterchoosew = Acmfilterchoosew(cbStruct = cbStruct, fdwStyle = fdwStyle, hwndOwnerCtorArg = hwndOwner, pwfltrCtorArg = pwfltr, cbwfltr = cbwfltr, pszTitleCtorArg = pszTitle, szFilterTag = szFilterTag, szFilter = szFilter, pszNameCtorArg = pszName, cchName = cchName, fdwEnum = fdwEnum, pwfltrEnumCtorArg = pwfltrEnum, hInstanceCtorArg = hInstance, pszTemplateNameCtorArg = pszTemplateName, lCustData = lCustData, pfnHook = pfnHook)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfilterchoosew) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwStyle != other.fdwStyle) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pwfltr != other.pwfltr) return false
        if (this.cbwfltr != other.cbwfltr) return false
        if (this.pszTitle != other.pszTitle) return false
        if (!this.szFilterTag.contentEquals(other.szFilterTag)) return false
        if (!this.szFilter.contentEquals(other.szFilter)) return false
        if (this.pszName != other.pszName) return false
        if (this.cchName != other.cchName) return false
        if (this.fdwEnum != other.fdwEnum) return false
        if (this.pwfltrEnum != other.pwfltrEnum) return false
        if (this.hInstance != other.hInstance) return false
        if (this.pszTemplateName != other.pszTemplateName) return false
        if (this.lCustData != other.lCustData) return false
        if (this.pfnHook != other.pfnHook) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwStyle.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pwfltr.hashCode()
        result = 31 * result + this.cbwfltr.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.szFilterTag.contentHashCode()
        result = 31 * result + this.szFilter.contentHashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.cchName.hashCode()
        result = 31 * result + this.fdwEnum.hashCode()
        result = 31 * result + this.pwfltrEnum.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.pszTemplateName.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.pfnHook.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStyle: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pwfltr: MutPtr = MutPtr(0L),
            cbwfltr: UInt = 0u,
            pszTitle: Pcwstr = ConstPtr(0L),
            szFilterTag: UShortArray = UShortArray(48),
            szFilter: UShortArray = UShortArray(128),
            pszName: Pwstr = MutPtr(0L),
            cchName: UInt = 0u,
            fdwEnum: UInt = 0u,
            pwfltrEnum: MutPtr = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pszTemplateName: Pcwstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Acmfilterchoosehookprocw = null,
        ): Acmfilterchoosew =
            Acmfilterchoosew(
                cbStruct = cbStruct,
                fdwStyle = fdwStyle,
                hwndOwnerCtorArg = hwndOwner,
                pwfltrCtorArg = pwfltr,
                cbwfltr = cbwfltr,
                pszTitleCtorArg = pszTitle,
                szFilterTag = szFilterTag,
                szFilter = szFilter,
                pszNameCtorArg = pszName,
                cchName = cchName,
                fdwEnum = fdwEnum,
                pwfltrEnumCtorArg = pwfltrEnum,
                hInstanceCtorArg = hInstance,
                pszTemplateNameCtorArg = pszTemplateName,
                lCustData = lCustData,
                pfnHook = pfnHook,
            )
    }
}

public class Acmfilterdetailsa internal constructor(
    public var cbStruct: UInt,
    public var dwFilterIndex: UInt,
    public var dwFilterTag: UInt,
    public var fdwSupport: UInt,
    pwfltrCtorArg: MutPtr,
    public var cbwfltr: UInt,
    public var szFilter: ByteArray,
) {
    public var pwfltr: MutPtr = pwfltrCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFilterIndex = 0u,
        dwFilterTag = 0u,
        fdwSupport = 0u,
        pwfltrCtorArg = MutPtr(0L),
        cbwfltr = 0u,
        szFilter = ByteArray(128),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFilterIndex

    public operator fun component3(): UInt = this.dwFilterTag

    public operator fun component4(): UInt = this.fdwSupport

    public operator fun component5(): MutPtr = this.pwfltr

    public operator fun component6(): UInt = this.cbwfltr

    public operator fun component7(): ByteArray = this.szFilter

    public fun copy(cbStruct: UInt = this.cbStruct, dwFilterIndex: UInt = this.dwFilterIndex, dwFilterTag: UInt = this.dwFilterTag, fdwSupport: UInt = this.fdwSupport, pwfltr: MutPtr = this.pwfltr, cbwfltr: UInt = this.cbwfltr, szFilter: ByteArray = this.szFilter): Acmfilterdetailsa = Acmfilterdetailsa(cbStruct = cbStruct, dwFilterIndex = dwFilterIndex, dwFilterTag = dwFilterTag, fdwSupport = fdwSupport, pwfltrCtorArg = pwfltr, cbwfltr = cbwfltr, szFilter = szFilter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfilterdetailsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFilterIndex != other.dwFilterIndex) return false
        if (this.dwFilterTag != other.dwFilterTag) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.pwfltr != other.pwfltr) return false
        if (this.cbwfltr != other.cbwfltr) return false
        if (!this.szFilter.contentEquals(other.szFilter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFilterIndex.hashCode()
        result = 31 * result + this.dwFilterTag.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.pwfltr.hashCode()
        result = 31 * result + this.cbwfltr.hashCode()
        result = 31 * result + this.szFilter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfilterdetailsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfilterdetailsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 156L
                override fun readNative(addr: Long): Acmfilterdetailsa =
                    Acmfilterdetailsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Acmfilterdetailsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFilterTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fdwSupport)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pwfltr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbwfltr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 28L, value.szFilter.toList())
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFilterIndex: UInt = 0u,
            dwFilterTag: UInt = 0u,
            fdwSupport: UInt = 0u,
            pwfltr: MutPtr = MutPtr(0L),
            cbwfltr: UInt = 0u,
            szFilter: ByteArray = ByteArray(128),
        ): Acmfilterdetailsa =
            Acmfilterdetailsa(
                cbStruct = cbStruct,
                dwFilterIndex = dwFilterIndex,
                dwFilterTag = dwFilterTag,
                fdwSupport = fdwSupport,
                pwfltrCtorArg = pwfltr,
                cbwfltr = cbwfltr,
                szFilter = szFilter,
            )
    }
}

public class Acmfilterdetailsw internal constructor(
    public var cbStruct: UInt,
    public var dwFilterIndex: UInt,
    public var dwFilterTag: UInt,
    public var fdwSupport: UInt,
    pwfltrCtorArg: MutPtr,
    public var cbwfltr: UInt,
    public var szFilter: UShortArray,
) {
    public var pwfltr: MutPtr = pwfltrCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFilterIndex = 0u,
        dwFilterTag = 0u,
        fdwSupport = 0u,
        pwfltrCtorArg = MutPtr(0L),
        cbwfltr = 0u,
        szFilter = UShortArray(128),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFilterIndex

    public operator fun component3(): UInt = this.dwFilterTag

    public operator fun component4(): UInt = this.fdwSupport

    public operator fun component5(): MutPtr = this.pwfltr

    public operator fun component6(): UInt = this.cbwfltr

    public operator fun component7(): UShortArray = this.szFilter

    public fun copy(cbStruct: UInt = this.cbStruct, dwFilterIndex: UInt = this.dwFilterIndex, dwFilterTag: UInt = this.dwFilterTag, fdwSupport: UInt = this.fdwSupport, pwfltr: MutPtr = this.pwfltr, cbwfltr: UInt = this.cbwfltr, szFilter: UShortArray = this.szFilter): Acmfilterdetailsw = Acmfilterdetailsw(cbStruct = cbStruct, dwFilterIndex = dwFilterIndex, dwFilterTag = dwFilterTag, fdwSupport = fdwSupport, pwfltrCtorArg = pwfltr, cbwfltr = cbwfltr, szFilter = szFilter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfilterdetailsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFilterIndex != other.dwFilterIndex) return false
        if (this.dwFilterTag != other.dwFilterTag) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.pwfltr != other.pwfltr) return false
        if (this.cbwfltr != other.cbwfltr) return false
        if (!this.szFilter.contentEquals(other.szFilter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFilterIndex.hashCode()
        result = 31 * result + this.dwFilterTag.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.pwfltr.hashCode()
        result = 31 * result + this.cbwfltr.hashCode()
        result = 31 * result + this.szFilter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfilterdetailsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfilterdetailsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): Acmfilterdetailsw =
                    Acmfilterdetailsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Acmfilterdetailsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFilterTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fdwSupport)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pwfltr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbwfltr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 28L, value.szFilter.toList())
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFilterIndex: UInt = 0u,
            dwFilterTag: UInt = 0u,
            fdwSupport: UInt = 0u,
            pwfltr: MutPtr = MutPtr(0L),
            cbwfltr: UInt = 0u,
            szFilter: UShortArray = UShortArray(128),
        ): Acmfilterdetailsw =
            Acmfilterdetailsw(
                cbStruct = cbStruct,
                dwFilterIndex = dwFilterIndex,
                dwFilterTag = dwFilterTag,
                fdwSupport = fdwSupport,
                pwfltrCtorArg = pwfltr,
                cbwfltr = cbwfltr,
                szFilter = szFilter,
            )
    }
}

public data class Acmfiltertagdetailsa(
    public var cbStruct: UInt = 0u,
    public var dwFilterTagIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var cbFilterSize: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cStandardFilters: UInt = 0u,
    public var szFilterTag: ByteArray = ByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfiltertagdetailsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFilterTagIndex != other.dwFilterTagIndex) return false
        if (this.dwFilterTag != other.dwFilterTag) return false
        if (this.cbFilterSize != other.cbFilterSize) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cStandardFilters != other.cStandardFilters) return false
        if (!this.szFilterTag.contentEquals(other.szFilterTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFilterTagIndex.hashCode()
        result = 31 * result + this.dwFilterTag.hashCode()
        result = 31 * result + this.cbFilterSize.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cStandardFilters.hashCode()
        result = 31 * result + this.szFilterTag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfiltertagdetailsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfiltertagdetailsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Acmfiltertagdetailsa =
                    Acmfiltertagdetailsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Acmfiltertagdetailsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterTagIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFilterTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFilterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cStandardFilters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                    ).writeNative(addr + 24L, value.szFilterTag.toList())
                }
            }
    }
}

public data class Acmfiltertagdetailsw(
    public var cbStruct: UInt = 0u,
    public var dwFilterTagIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var cbFilterSize: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cStandardFilters: UInt = 0u,
    public var szFilterTag: UShortArray = UShortArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmfiltertagdetailsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFilterTagIndex != other.dwFilterTagIndex) return false
        if (this.dwFilterTag != other.dwFilterTag) return false
        if (this.cbFilterSize != other.cbFilterSize) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cStandardFilters != other.cStandardFilters) return false
        if (!this.szFilterTag.contentEquals(other.szFilterTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFilterTagIndex.hashCode()
        result = 31 * result + this.dwFilterTag.hashCode()
        result = 31 * result + this.cbFilterSize.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cStandardFilters.hashCode()
        result = 31 * result + this.szFilterTag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfiltertagdetailsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmfiltertagdetailsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Acmfiltertagdetailsw =
                    Acmfiltertagdetailsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Acmfiltertagdetailsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterTagIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFilterTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFilterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cStandardFilters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                    ).writeNative(addr + 24L, value.szFilterTag.toList())
                }
            }
    }
}

public class Acmformatchoosea internal constructor(
    public var cbStruct: UInt,
    public var fdwStyle: UInt,
    hwndOwnerCtorArg: Hwnd,
    pwfxCtorArg: MutPtr,
    public var cbwfx: UInt,
    pszTitleCtorArg: Pcstr,
    public var szFormatTag: ByteArray,
    public var szFormat: ByteArray,
    pszNameCtorArg: Pstr,
    public var cchName: UInt,
    public var fdwEnum: UInt,
    pwfxEnumCtorArg: MutPtr,
    hInstanceCtorArg: Hinstance,
    pszTemplateNameCtorArg: Pcstr,
    public var lCustData: Lparam,
    public var pfnHook: Acmformatchoosehookproca,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pwfx: MutPtr = pwfxCtorArg
        internal set

    public var pszTitle: Pcstr = pszTitleCtorArg
        internal set

    public var pszName: Pstr = pszNameCtorArg
        internal set

    public var pwfxEnum: MutPtr = pwfxEnumCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTemplateName: Pcstr = pszTemplateNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStyle = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pwfxCtorArg = MutPtr(0L),
        cbwfx = 0u,
        pszTitleCtorArg = ConstPtr(0L),
        szFormatTag = ByteArray(48),
        szFormat = ByteArray(128),
        pszNameCtorArg = MutPtr(0L),
        cchName = 0u,
        fdwEnum = 0u,
        pwfxEnumCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pszTemplateNameCtorArg = ConstPtr(0L),
        lCustData = 0L,
        pfnHook = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwStyle

    public operator fun component3(): Hwnd = this.hwndOwner

    public operator fun component4(): MutPtr = this.pwfx

    public operator fun component5(): UInt = this.cbwfx

    public operator fun component6(): Pcstr = this.pszTitle

    public operator fun component7(): ByteArray = this.szFormatTag

    public operator fun component8(): ByteArray = this.szFormat

    public operator fun component9(): Pstr = this.pszName

    public operator fun component10(): UInt = this.cchName

    public operator fun component11(): UInt = this.fdwEnum

    public operator fun component12(): MutPtr = this.pwfxEnum

    public operator fun component13(): Hinstance = this.hInstance

    public operator fun component14(): Pcstr = this.pszTemplateName

    public operator fun component15(): Lparam = this.lCustData

    public operator fun component16(): Acmformatchoosehookproca = this.pfnHook

    public fun copy(cbStruct: UInt = this.cbStruct, fdwStyle: UInt = this.fdwStyle, hwndOwner: Hwnd = this.hwndOwner, pwfx: MutPtr = this.pwfx, cbwfx: UInt = this.cbwfx, pszTitle: Pcstr = this.pszTitle, szFormatTag: ByteArray = this.szFormatTag, szFormat: ByteArray = this.szFormat, pszName: Pstr = this.pszName, cchName: UInt = this.cchName, fdwEnum: UInt = this.fdwEnum, pwfxEnum: MutPtr = this.pwfxEnum, hInstance: Hinstance = this.hInstance, pszTemplateName: Pcstr = this.pszTemplateName, lCustData: Lparam = this.lCustData, pfnHook: Acmformatchoosehookproca = this.pfnHook): Acmformatchoosea = Acmformatchoosea(cbStruct = cbStruct, fdwStyle = fdwStyle, hwndOwnerCtorArg = hwndOwner, pwfxCtorArg = pwfx, cbwfx = cbwfx, pszTitleCtorArg = pszTitle, szFormatTag = szFormatTag, szFormat = szFormat, pszNameCtorArg = pszName, cchName = cchName, fdwEnum = fdwEnum, pwfxEnumCtorArg = pwfxEnum, hInstanceCtorArg = hInstance, pszTemplateNameCtorArg = pszTemplateName, lCustData = lCustData, pfnHook = pfnHook)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmformatchoosea) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwStyle != other.fdwStyle) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pwfx != other.pwfx) return false
        if (this.cbwfx != other.cbwfx) return false
        if (this.pszTitle != other.pszTitle) return false
        if (!this.szFormatTag.contentEquals(other.szFormatTag)) return false
        if (!this.szFormat.contentEquals(other.szFormat)) return false
        if (this.pszName != other.pszName) return false
        if (this.cchName != other.cchName) return false
        if (this.fdwEnum != other.fdwEnum) return false
        if (this.pwfxEnum != other.pwfxEnum) return false
        if (this.hInstance != other.hInstance) return false
        if (this.pszTemplateName != other.pszTemplateName) return false
        if (this.lCustData != other.lCustData) return false
        if (this.pfnHook != other.pfnHook) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwStyle.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pwfx.hashCode()
        result = 31 * result + this.cbwfx.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.szFormatTag.contentHashCode()
        result = 31 * result + this.szFormat.contentHashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.cchName.hashCode()
        result = 31 * result + this.fdwEnum.hashCode()
        result = 31 * result + this.pwfxEnum.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.pszTemplateName.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.pfnHook.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStyle: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pwfx: MutPtr = MutPtr(0L),
            cbwfx: UInt = 0u,
            pszTitle: Pcstr = ConstPtr(0L),
            szFormatTag: ByteArray = ByteArray(48),
            szFormat: ByteArray = ByteArray(128),
            pszName: Pstr = MutPtr(0L),
            cchName: UInt = 0u,
            fdwEnum: UInt = 0u,
            pwfxEnum: MutPtr = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pszTemplateName: Pcstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Acmformatchoosehookproca = null,
        ): Acmformatchoosea =
            Acmformatchoosea(
                cbStruct = cbStruct,
                fdwStyle = fdwStyle,
                hwndOwnerCtorArg = hwndOwner,
                pwfxCtorArg = pwfx,
                cbwfx = cbwfx,
                pszTitleCtorArg = pszTitle,
                szFormatTag = szFormatTag,
                szFormat = szFormat,
                pszNameCtorArg = pszName,
                cchName = cchName,
                fdwEnum = fdwEnum,
                pwfxEnumCtorArg = pwfxEnum,
                hInstanceCtorArg = hInstance,
                pszTemplateNameCtorArg = pszTemplateName,
                lCustData = lCustData,
                pfnHook = pfnHook,
            )
    }
}

public class Acmformatchoosew internal constructor(
    public var cbStruct: UInt,
    public var fdwStyle: UInt,
    hwndOwnerCtorArg: Hwnd,
    pwfxCtorArg: MutPtr,
    public var cbwfx: UInt,
    pszTitleCtorArg: Pcwstr,
    public var szFormatTag: UShortArray,
    public var szFormat: UShortArray,
    pszNameCtorArg: Pwstr,
    public var cchName: UInt,
    public var fdwEnum: UInt,
    pwfxEnumCtorArg: MutPtr,
    hInstanceCtorArg: Hinstance,
    pszTemplateNameCtorArg: Pcwstr,
    public var lCustData: Lparam,
    public var pfnHook: Acmformatchoosehookprocw,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pwfx: MutPtr = pwfxCtorArg
        internal set

    public var pszTitle: Pcwstr = pszTitleCtorArg
        internal set

    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pwfxEnum: MutPtr = pwfxEnumCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pszTemplateName: Pcwstr = pszTemplateNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStyle = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pwfxCtorArg = MutPtr(0L),
        cbwfx = 0u,
        pszTitleCtorArg = ConstPtr(0L),
        szFormatTag = UShortArray(48),
        szFormat = UShortArray(128),
        pszNameCtorArg = MutPtr(0L),
        cchName = 0u,
        fdwEnum = 0u,
        pwfxEnumCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pszTemplateNameCtorArg = ConstPtr(0L),
        lCustData = 0L,
        pfnHook = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwStyle

    public operator fun component3(): Hwnd = this.hwndOwner

    public operator fun component4(): MutPtr = this.pwfx

    public operator fun component5(): UInt = this.cbwfx

    public operator fun component6(): Pcwstr = this.pszTitle

    public operator fun component7(): UShortArray = this.szFormatTag

    public operator fun component8(): UShortArray = this.szFormat

    public operator fun component9(): Pwstr = this.pszName

    public operator fun component10(): UInt = this.cchName

    public operator fun component11(): UInt = this.fdwEnum

    public operator fun component12(): MutPtr = this.pwfxEnum

    public operator fun component13(): Hinstance = this.hInstance

    public operator fun component14(): Pcwstr = this.pszTemplateName

    public operator fun component15(): Lparam = this.lCustData

    public operator fun component16(): Acmformatchoosehookprocw = this.pfnHook

    public fun copy(cbStruct: UInt = this.cbStruct, fdwStyle: UInt = this.fdwStyle, hwndOwner: Hwnd = this.hwndOwner, pwfx: MutPtr = this.pwfx, cbwfx: UInt = this.cbwfx, pszTitle: Pcwstr = this.pszTitle, szFormatTag: UShortArray = this.szFormatTag, szFormat: UShortArray = this.szFormat, pszName: Pwstr = this.pszName, cchName: UInt = this.cchName, fdwEnum: UInt = this.fdwEnum, pwfxEnum: MutPtr = this.pwfxEnum, hInstance: Hinstance = this.hInstance, pszTemplateName: Pcwstr = this.pszTemplateName, lCustData: Lparam = this.lCustData, pfnHook: Acmformatchoosehookprocw = this.pfnHook): Acmformatchoosew = Acmformatchoosew(cbStruct = cbStruct, fdwStyle = fdwStyle, hwndOwnerCtorArg = hwndOwner, pwfxCtorArg = pwfx, cbwfx = cbwfx, pszTitleCtorArg = pszTitle, szFormatTag = szFormatTag, szFormat = szFormat, pszNameCtorArg = pszName, cchName = cchName, fdwEnum = fdwEnum, pwfxEnumCtorArg = pwfxEnum, hInstanceCtorArg = hInstance, pszTemplateNameCtorArg = pszTemplateName, lCustData = lCustData, pfnHook = pfnHook)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmformatchoosew) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwStyle != other.fdwStyle) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pwfx != other.pwfx) return false
        if (this.cbwfx != other.cbwfx) return false
        if (this.pszTitle != other.pszTitle) return false
        if (!this.szFormatTag.contentEquals(other.szFormatTag)) return false
        if (!this.szFormat.contentEquals(other.szFormat)) return false
        if (this.pszName != other.pszName) return false
        if (this.cchName != other.cchName) return false
        if (this.fdwEnum != other.fdwEnum) return false
        if (this.pwfxEnum != other.pwfxEnum) return false
        if (this.hInstance != other.hInstance) return false
        if (this.pszTemplateName != other.pszTemplateName) return false
        if (this.lCustData != other.lCustData) return false
        if (this.pfnHook != other.pfnHook) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwStyle.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.pwfx.hashCode()
        result = 31 * result + this.cbwfx.hashCode()
        result = 31 * result + this.pszTitle.hashCode()
        result = 31 * result + this.szFormatTag.contentHashCode()
        result = 31 * result + this.szFormat.contentHashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.cchName.hashCode()
        result = 31 * result + this.fdwEnum.hashCode()
        result = 31 * result + this.pwfxEnum.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.pszTemplateName.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.pfnHook.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStyle: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pwfx: MutPtr = MutPtr(0L),
            cbwfx: UInt = 0u,
            pszTitle: Pcwstr = ConstPtr(0L),
            szFormatTag: UShortArray = UShortArray(48),
            szFormat: UShortArray = UShortArray(128),
            pszName: Pwstr = MutPtr(0L),
            cchName: UInt = 0u,
            fdwEnum: UInt = 0u,
            pwfxEnum: MutPtr = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pszTemplateName: Pcwstr = ConstPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Acmformatchoosehookprocw = null,
        ): Acmformatchoosew =
            Acmformatchoosew(
                cbStruct = cbStruct,
                fdwStyle = fdwStyle,
                hwndOwnerCtorArg = hwndOwner,
                pwfxCtorArg = pwfx,
                cbwfx = cbwfx,
                pszTitleCtorArg = pszTitle,
                szFormatTag = szFormatTag,
                szFormat = szFormat,
                pszNameCtorArg = pszName,
                cchName = cchName,
                fdwEnum = fdwEnum,
                pwfxEnumCtorArg = pwfxEnum,
                hInstanceCtorArg = hInstance,
                pszTemplateNameCtorArg = pszTemplateName,
                lCustData = lCustData,
                pfnHook = pfnHook,
            )
    }
}

public class Acmformatdetailsa internal constructor(
    public var cbStruct: UInt,
    public var dwFormatIndex: UInt,
    public var dwFormatTag: UInt,
    public var fdwSupport: UInt,
    pwfxCtorArg: MutPtr,
    public var cbwfx: UInt,
    public var szFormat: ByteArray,
) {
    public var pwfx: MutPtr = pwfxCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFormatIndex = 0u,
        dwFormatTag = 0u,
        fdwSupport = 0u,
        pwfxCtorArg = MutPtr(0L),
        cbwfx = 0u,
        szFormat = ByteArray(128),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFormatIndex

    public operator fun component3(): UInt = this.dwFormatTag

    public operator fun component4(): UInt = this.fdwSupport

    public operator fun component5(): MutPtr = this.pwfx

    public operator fun component6(): UInt = this.cbwfx

    public operator fun component7(): ByteArray = this.szFormat

    public fun copy(cbStruct: UInt = this.cbStruct, dwFormatIndex: UInt = this.dwFormatIndex, dwFormatTag: UInt = this.dwFormatTag, fdwSupport: UInt = this.fdwSupport, pwfx: MutPtr = this.pwfx, cbwfx: UInt = this.cbwfx, szFormat: ByteArray = this.szFormat): Acmformatdetailsa = Acmformatdetailsa(cbStruct = cbStruct, dwFormatIndex = dwFormatIndex, dwFormatTag = dwFormatTag, fdwSupport = fdwSupport, pwfxCtorArg = pwfx, cbwfx = cbwfx, szFormat = szFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmformatdetailsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFormatIndex != other.dwFormatIndex) return false
        if (this.dwFormatTag != other.dwFormatTag) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.pwfx != other.pwfx) return false
        if (this.cbwfx != other.cbwfx) return false
        if (!this.szFormat.contentEquals(other.szFormat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFormatIndex.hashCode()
        result = 31 * result + this.dwFormatTag.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.pwfx.hashCode()
        result = 31 * result + this.cbwfx.hashCode()
        result = 31 * result + this.szFormat.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformatdetailsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformatdetailsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 156L
                override fun readNative(addr: Long): Acmformatdetailsa =
                    Acmformatdetailsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Acmformatdetailsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFormatIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fdwSupport)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pwfx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbwfx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 28L, value.szFormat.toList())
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFormatIndex: UInt = 0u,
            dwFormatTag: UInt = 0u,
            fdwSupport: UInt = 0u,
            pwfx: MutPtr = MutPtr(0L),
            cbwfx: UInt = 0u,
            szFormat: ByteArray = ByteArray(128),
        ): Acmformatdetailsa =
            Acmformatdetailsa(
                cbStruct = cbStruct,
                dwFormatIndex = dwFormatIndex,
                dwFormatTag = dwFormatTag,
                fdwSupport = fdwSupport,
                pwfxCtorArg = pwfx,
                cbwfx = cbwfx,
                szFormat = szFormat,
            )
    }
}

public data class Acmformattagdetailsa(
    public var cbStruct: UInt = 0u,
    public var dwFormatTagIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var cbFormatSize: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cStandardFormats: UInt = 0u,
    public var szFormatTag: ByteArray = ByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmformattagdetailsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFormatTagIndex != other.dwFormatTagIndex) return false
        if (this.dwFormatTag != other.dwFormatTag) return false
        if (this.cbFormatSize != other.cbFormatSize) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cStandardFormats != other.cStandardFormats) return false
        if (!this.szFormatTag.contentEquals(other.szFormatTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFormatTagIndex.hashCode()
        result = 31 * result + this.dwFormatTag.hashCode()
        result = 31 * result + this.cbFormatSize.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cStandardFormats.hashCode()
        result = 31 * result + this.szFormatTag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformattagdetailsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformattagdetailsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Acmformattagdetailsa =
                    Acmformattagdetailsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Acmformattagdetailsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFormatTagIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFormatSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cStandardFormats)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (48).toInt())
                    ).writeNative(addr + 24L, value.szFormatTag.toList())
                }
            }
    }
}

public data class Acmformattagdetailsw(
    public var cbStruct: UInt = 0u,
    public var dwFormatTagIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var cbFormatSize: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cStandardFormats: UInt = 0u,
    public var szFormatTag: UShortArray = UShortArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmformattagdetailsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFormatTagIndex != other.dwFormatTagIndex) return false
        if (this.dwFormatTag != other.dwFormatTag) return false
        if (this.cbFormatSize != other.cbFormatSize) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cStandardFormats != other.cStandardFormats) return false
        if (!this.szFormatTag.contentEquals(other.szFormatTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFormatTagIndex.hashCode()
        result = 31 * result + this.dwFormatTag.hashCode()
        result = 31 * result + this.cbFormatSize.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cStandardFormats.hashCode()
        result = 31 * result + this.szFormatTag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformattagdetailsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmformattagdetailsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Acmformattagdetailsw =
                    Acmformattagdetailsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Acmformattagdetailsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFormatTagIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFormatSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cStandardFormats)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                    ).writeNative(addr + 24L, value.szFormatTag.toList())
                }
            }
    }
}

public class Acmstreamheader internal constructor(
    public var cbStruct: UInt,
    public var fdwStatus: UInt,
    public var dwUser: Int,
    pbSrcCtorArg: MutPtr,
    public var cbSrcLength: UInt,
    public var cbSrcLengthUsed: UInt,
    public var dwSrcUser: Int,
    pbDstCtorArg: MutPtr,
    public var cbDstLength: UInt,
    public var cbDstLengthUsed: UInt,
    public var dwDstUser: Int,
    public var dwReservedDriver: UIntArray,
) {
    public var pbSrc: MutPtr = pbSrcCtorArg
        internal set

    public var pbDst: MutPtr = pbDstCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        fdwStatus = 0u,
        dwUser = 0,
        pbSrcCtorArg = MutPtr(0L),
        cbSrcLength = 0u,
        cbSrcLengthUsed = 0u,
        dwSrcUser = 0,
        pbDstCtorArg = MutPtr(0L),
        cbDstLength = 0u,
        cbDstLengthUsed = 0u,
        dwDstUser = 0,
        dwReservedDriver = UIntArray(15),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.fdwStatus

    public operator fun component3(): Int = this.dwUser

    public operator fun component4(): MutPtr = this.pbSrc

    public operator fun component5(): UInt = this.cbSrcLength

    public operator fun component6(): UInt = this.cbSrcLengthUsed

    public operator fun component7(): Int = this.dwSrcUser

    public operator fun component8(): MutPtr = this.pbDst

    public operator fun component9(): UInt = this.cbDstLength

    public operator fun component10(): UInt = this.cbDstLengthUsed

    public operator fun component11(): Int = this.dwDstUser

    public operator fun component12(): UIntArray = this.dwReservedDriver

    public fun copy(cbStruct: UInt = this.cbStruct, fdwStatus: UInt = this.fdwStatus, dwUser: Int = this.dwUser, pbSrc: MutPtr = this.pbSrc, cbSrcLength: UInt = this.cbSrcLength, cbSrcLengthUsed: UInt = this.cbSrcLengthUsed, dwSrcUser: Int = this.dwSrcUser, pbDst: MutPtr = this.pbDst, cbDstLength: UInt = this.cbDstLength, cbDstLengthUsed: UInt = this.cbDstLengthUsed, dwDstUser: Int = this.dwDstUser, dwReservedDriver: UIntArray = this.dwReservedDriver): Acmstreamheader = Acmstreamheader(cbStruct = cbStruct, fdwStatus = fdwStatus, dwUser = dwUser, pbSrcCtorArg = pbSrc, cbSrcLength = cbSrcLength, cbSrcLengthUsed = cbSrcLengthUsed, dwSrcUser = dwSrcUser, pbDstCtorArg = pbDst, cbDstLength = cbDstLength, cbDstLengthUsed = cbDstLengthUsed, dwDstUser = dwDstUser, dwReservedDriver = dwReservedDriver)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Acmstreamheader) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.fdwStatus != other.fdwStatus) return false
        if (this.dwUser != other.dwUser) return false
        if (this.pbSrc != other.pbSrc) return false
        if (this.cbSrcLength != other.cbSrcLength) return false
        if (this.cbSrcLengthUsed != other.cbSrcLengthUsed) return false
        if (this.dwSrcUser != other.dwSrcUser) return false
        if (this.pbDst != other.pbDst) return false
        if (this.cbDstLength != other.cbDstLength) return false
        if (this.cbDstLengthUsed != other.cbDstLengthUsed) return false
        if (this.dwDstUser != other.dwDstUser) return false
        if (!this.dwReservedDriver.contentEquals(other.dwReservedDriver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.fdwStatus.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.pbSrc.hashCode()
        result = 31 * result + this.cbSrcLength.hashCode()
        result = 31 * result + this.cbSrcLengthUsed.hashCode()
        result = 31 * result + this.dwSrcUser.hashCode()
        result = 31 * result + this.pbDst.hashCode()
        result = 31 * result + this.cbDstLength.hashCode()
        result = 31 * result + this.cbDstLengthUsed.hashCode()
        result = 31 * result + this.dwDstUser.hashCode()
        result = 31 * result + this.dwReservedDriver.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmstreamheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Acmstreamheader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): Acmstreamheader =
                    Acmstreamheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (15).toInt())
                        ).readNative(addr + 64L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Acmstreamheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fdwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwUser)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pbSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbSrcLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbSrcLengthUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.dwSrcUser)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pbDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbDstLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cbDstLengthUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.dwDstUser)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (15).toInt())
                    ).writeNative(addr + 64L, value.dwReservedDriver.toList())
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            fdwStatus: UInt = 0u,
            dwUser: Int = 0,
            pbSrc: MutPtr = MutPtr(0L),
            cbSrcLength: UInt = 0u,
            cbSrcLengthUsed: UInt = 0u,
            dwSrcUser: Int = 0,
            pbDst: MutPtr = MutPtr(0L),
            cbDstLength: UInt = 0u,
            cbDstLengthUsed: UInt = 0u,
            dwDstUser: Int = 0,
            dwReservedDriver: UIntArray = UIntArray(15),
        ): Acmstreamheader =
            Acmstreamheader(
                cbStruct = cbStruct,
                fdwStatus = fdwStatus,
                dwUser = dwUser,
                pbSrcCtorArg = pbSrc,
                cbSrcLength = cbSrcLength,
                cbSrcLengthUsed = cbSrcLengthUsed,
                dwSrcUser = dwSrcUser,
                pbDstCtorArg = pbDst,
                cbDstLength = cbDstLength,
                cbDstLengthUsed = cbDstLengthUsed,
                dwDstUser = dwDstUser,
                dwReservedDriver = dwReservedDriver,
            )
    }
}

public class AmbisonicsParams internal constructor(
    public var u32Size: UInt,
    public var u32Version: UInt,
    public var u32Type: AmbisonicsType,
    public var u32ChannelOrdering: AmbisonicsChannelOrdering,
    public var u32Normalization: AmbisonicsNormalization,
    public var u32Order: UInt,
    public var u32NumChannels: UInt,
    pu32ChannelMapCtorArg: MutPtr,
) {
    public var pu32ChannelMap: MutPtr = pu32ChannelMapCtorArg
        internal set

    public constructor() : this(
        u32Size = 0u,
        u32Version = 0u,
        u32Type = 0,
        u32ChannelOrdering = 0,
        u32Normalization = 0,
        u32Order = 0u,
        u32NumChannels = 0u,
        pu32ChannelMapCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.u32Size

    public operator fun component2(): UInt = this.u32Version

    public operator fun component3(): AmbisonicsType = this.u32Type

    public operator fun component4(): AmbisonicsChannelOrdering = this.u32ChannelOrdering

    public operator fun component5(): AmbisonicsNormalization = this.u32Normalization

    public operator fun component6(): UInt = this.u32Order

    public operator fun component7(): UInt = this.u32NumChannels

    public operator fun component8(): MutPtr = this.pu32ChannelMap

    public fun copy(u32Size: UInt = this.u32Size, u32Version: UInt = this.u32Version, u32Type: AmbisonicsType = this.u32Type, u32ChannelOrdering: AmbisonicsChannelOrdering = this.u32ChannelOrdering, u32Normalization: AmbisonicsNormalization = this.u32Normalization, u32Order: UInt = this.u32Order, u32NumChannels: UInt = this.u32NumChannels, pu32ChannelMap: MutPtr = this.pu32ChannelMap): AmbisonicsParams = AmbisonicsParams(u32Size = u32Size, u32Version = u32Version, u32Type = u32Type, u32ChannelOrdering = u32ChannelOrdering, u32Normalization = u32Normalization, u32Order = u32Order, u32NumChannels = u32NumChannels, pu32ChannelMapCtorArg = pu32ChannelMap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmbisonicsParams) return false
        if (this.u32Size != other.u32Size) return false
        if (this.u32Version != other.u32Version) return false
        if (this.u32Type != other.u32Type) return false
        if (this.u32ChannelOrdering != other.u32ChannelOrdering) return false
        if (this.u32Normalization != other.u32Normalization) return false
        if (this.u32Order != other.u32Order) return false
        if (this.u32NumChannels != other.u32NumChannels) return false
        if (this.pu32ChannelMap != other.pu32ChannelMap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.u32Size.hashCode()
        result = 31 * result + this.u32Version.hashCode()
        result = 31 * result + this.u32Type.hashCode()
        result = 31 * result + this.u32ChannelOrdering.hashCode()
        result = 31 * result + this.u32Normalization.hashCode()
        result = 31 * result + this.u32Order.hashCode()
        result = 31 * result + this.u32NumChannels.hashCode()
        result = 31 * result + this.pu32ChannelMap.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmbisonicsParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmbisonicsParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): AmbisonicsParams =
                    AmbisonicsParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: AmbisonicsParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.u32Size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.u32Version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.u32Type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.u32ChannelOrdering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.u32Normalization)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.u32Order)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.u32NumChannels)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pu32ChannelMap)
                }
            }

        public operator fun invoke(
            u32Size: UInt = 0u,
            u32Version: UInt = 0u,
            u32Type: AmbisonicsType = 0,
            u32ChannelOrdering: AmbisonicsChannelOrdering = 0,
            u32Normalization: AmbisonicsNormalization = 0,
            u32Order: UInt = 0u,
            u32NumChannels: UInt = 0u,
            pu32ChannelMap: MutPtr = MutPtr(0L),
        ): AmbisonicsParams =
            AmbisonicsParams(
                u32Size = u32Size,
                u32Version = u32Version,
                u32Type = u32Type,
                u32ChannelOrdering = u32ChannelOrdering,
                u32Normalization = u32Normalization,
                u32Order = u32Order,
                u32NumChannels = u32NumChannels,
                pu32ChannelMapCtorArg = pu32ChannelMap,
            )
    }
}

public data class AudioclientActivationParams(
    public var activationType: AudioclientActivationType = 0,
    public var anonymous: AudioclientActivationParams0 = AudioclientActivationParams0(),
)

public data class AudioclientActivationParams0(
    public var processLoopbackParams: AudioclientProcessLoopbackParams = AudioclientProcessLoopbackParams(),
)

public data class AudioclientProcessLoopbackParams(
    public var targetProcessId: UInt = 0u,
    public var processLoopbackMode: ProcessLoopbackMode = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioclientProcessLoopbackParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioclientProcessLoopbackParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): AudioclientProcessLoopbackParams =
                    AudioclientProcessLoopbackParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AudioclientProcessLoopbackParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.targetProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.processLoopbackMode)
                }
            }
    }
}

public data class AudioEffect(
    public var id: Guid = Guid(),
    public var canSetState: Bool = 0,
    public var state: AudioEffectState = 0,
)

public data class AudioVolumeNotificationData(
    public var guidEventContext: Guid = Guid(),
    public var bMuted: Bool = 0,
    public var fMasterVolume: Float = 0.0f,
    public var nChannels: UInt = 0u,
    public var afChannelVolumes: FloatArray = FloatArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioVolumeNotificationData) return false
        if (this.guidEventContext != other.guidEventContext) return false
        if (this.bMuted != other.bMuted) return false
        if (this.fMasterVolume != other.fMasterVolume) return false
        if (this.nChannels != other.nChannels) return false
        if (!this.afChannelVolumes.contentEquals(other.afChannelVolumes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidEventContext.hashCode()
        result = 31 * result + this.bMuted.hashCode()
        result = 31 * result + this.fMasterVolume.hashCode()
        result = 31 * result + this.nChannels.hashCode()
        result = 31 * result + this.afChannelVolumes.contentHashCode()
        return result
    }
}

public data class Auxcaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Auxcaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Auxcaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Auxcaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Auxcapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Auxcapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Auxcapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Auxcapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Auxcapsa =
                    Auxcapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Auxcapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.wTechnology)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.wReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwSupport)
                }
            }
    }
}

public data class Auxcapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Auxcapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Auxcapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Auxcapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Auxcapsw =
                    Auxcapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: Auxcapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 72L, value.wTechnology)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 74L, value.wReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwSupport)
                }
            }
    }
}

public data class AudioClient3ActivationParams(
    public var tracingContextId: Guid = Guid(),
)

public data class AudioClientProperties(
    public var cbSize: UInt = 0u,
    public var bIsOffload: Bool = 0,
    public var eCategory: AudioStreamCategory = 0,
    public var options: AudclntStreamoptions = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioClientProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioClientProperties> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AudioClientProperties =
                    AudioClientProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AudioClientProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bIsOffload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eCategory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.options)
                }
            }
    }
}

public class AudioExtensionParams internal constructor(
    public var addPageParam: Lparam,
    pEndpointCtorArg: MutPtr,
    pPnpInterfaceCtorArg: MutPtr,
    pPnpDevnodeCtorArg: MutPtr,
) {
    public var pEndpoint: MutPtr = pEndpointCtorArg
        internal set

    public var pPnpInterface: MutPtr = pPnpInterfaceCtorArg
        internal set

    public var pPnpDevnode: MutPtr = pPnpDevnodeCtorArg
        internal set

    public constructor() : this(
        addPageParam = 0L,
        pEndpointCtorArg = MutPtr(0L),
        pPnpInterfaceCtorArg = MutPtr(0L),
        pPnpDevnodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Lparam = this.addPageParam

    public operator fun component2(): MutPtr = this.pEndpoint

    public operator fun component3(): MutPtr = this.pPnpInterface

    public operator fun component4(): MutPtr = this.pPnpDevnode

    public fun copy(addPageParam: Lparam = this.addPageParam, pEndpoint: MutPtr = this.pEndpoint, pPnpInterface: MutPtr = this.pPnpInterface, pPnpDevnode: MutPtr = this.pPnpDevnode): AudioExtensionParams = AudioExtensionParams(addPageParam = addPageParam, pEndpointCtorArg = pEndpoint, pPnpInterfaceCtorArg = pPnpInterface, pPnpDevnodeCtorArg = pPnpDevnode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioExtensionParams) return false
        if (this.addPageParam != other.addPageParam) return false
        if (this.pEndpoint != other.pEndpoint) return false
        if (this.pPnpInterface != other.pPnpInterface) return false
        if (this.pPnpDevnode != other.pPnpDevnode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addPageParam.hashCode()
        result = 31 * result + this.pEndpoint.hashCode()
        result = 31 * result + this.pPnpInterface.hashCode()
        result = 31 * result + this.pPnpDevnode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioExtensionParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioExtensionParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): AudioExtensionParams =
                    AudioExtensionParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
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
                    )
                override fun writeNative(addr: Long, value: AudioExtensionParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.addPageParam)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pEndpoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pPnpInterface)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pPnpDevnode)
                }
            }

        public operator fun invoke(
            addPageParam: Lparam = 0L,
            pEndpoint: MutPtr = MutPtr(0L),
            pPnpInterface: MutPtr = MutPtr(0L),
            pPnpDevnode: MutPtr = MutPtr(0L),
        ): AudioExtensionParams =
            AudioExtensionParams(
                addPageParam = addPageParam,
                pEndpointCtorArg = pEndpoint,
                pPnpInterfaceCtorArg = pPnpInterface,
                pPnpDevnodeCtorArg = pPnpDevnode,
            )
    }
}

public data class ConnectorType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectorType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectorType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ConnectorType =
                    ConnectorType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ConnectorType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val UNKNOWN_CONNECTOR: ConnectorType = ConnectorType(0)

        public val PHYSICAL_INTERNAL: ConnectorType = ConnectorType(1)

        public val PHYSICAL_EXTERNAL: ConnectorType = ConnectorType(2)

        public val SOFTWARE_IO: ConnectorType = ConnectorType(3)

        public val SOFTWARE_FIXED: ConnectorType = ConnectorType(4)

        public val NETWORK: ConnectorType = ConnectorType(5)
    }
}

public data class DirectxAudioActivationParams(
    public var cbDirectXAudioActivationParams: UInt = 0u,
    public var guidAudioSession: Guid = Guid(),
    public var dwAudioStreamFlags: UInt = 0u,
)

public data class Echowavefilter(
    public var wfltr: Wavefilter = Wavefilter(),
    public var dwVolume: UInt = 0u,
    public var dwDelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Echowavefilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Echowavefilter> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Echowavefilter =
                    Echowavefilter(
                        (Wavefilter.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Echowavefilter) {
                    (Wavefilter.typeLayout()).writeNative(addr, value.wfltr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwDelay)
                }
            }
    }
}

public data class Midievent(
    public var dwDeltaTime: UInt = 0u,
    public var dwStreamID: UInt = 0u,
    public var dwEvent: UInt = 0u,
    public var dwParms: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midievent) return false
        if (this.dwDeltaTime != other.dwDeltaTime) return false
        if (this.dwStreamID != other.dwStreamID) return false
        if (this.dwEvent != other.dwEvent) return false
        if (!this.dwParms.contentEquals(other.dwParms)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDeltaTime.hashCode()
        result = 31 * result + this.dwStreamID.hashCode()
        result = 31 * result + this.dwEvent.hashCode()
        result = 31 * result + this.dwParms.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midievent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midievent> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Midievent =
                    Midievent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Midievent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDeltaTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStreamID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwEvent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.dwParms.toList())
                }
            }
    }
}

public class Midihdr internal constructor(
    lpDataCtorArg: Pstr,
    public var dwBufferLength: UInt,
    public var dwBytesRecorded: UInt,
    public var dwUser: Int,
    public var dwFlags: UInt,
    lpNextCtorArg: MutPtr,
    public var reserved: Int,
    public var dwOffset: UInt,
    public var dwReserved: IntArray,
) {
    public var lpData: Pstr = lpDataCtorArg
        internal set

    public var lpNext: MutPtr = lpNextCtorArg
        internal set

    public constructor() : this(
        lpDataCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
        dwBytesRecorded = 0u,
        dwUser = 0,
        dwFlags = 0u,
        lpNextCtorArg = MutPtr(0L),
        reserved = 0,
        dwOffset = 0u,
        dwReserved = IntArray(8),
    )

    public operator fun component1(): Pstr = this.lpData

    public operator fun component2(): UInt = this.dwBufferLength

    public operator fun component3(): UInt = this.dwBytesRecorded

    public operator fun component4(): Int = this.dwUser

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): MutPtr = this.lpNext

    public operator fun component7(): Int = this.reserved

    public operator fun component8(): UInt = this.dwOffset

    public operator fun component9(): IntArray = this.dwReserved

    public fun copy(lpData: Pstr = this.lpData, dwBufferLength: UInt = this.dwBufferLength, dwBytesRecorded: UInt = this.dwBytesRecorded, dwUser: Int = this.dwUser, dwFlags: UInt = this.dwFlags, lpNext: MutPtr = this.lpNext, reserved: Int = this.reserved, dwOffset: UInt = this.dwOffset, dwReserved: IntArray = this.dwReserved): Midihdr = Midihdr(lpDataCtorArg = lpData, dwBufferLength = dwBufferLength, dwBytesRecorded = dwBytesRecorded, dwUser = dwUser, dwFlags = dwFlags, lpNextCtorArg = lpNext, reserved = reserved, dwOffset = dwOffset, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midihdr) return false
        if (this.lpData != other.lpData) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBytesRecorded != other.dwBytesRecorded) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpNext != other.lpNext) return false
        if (this.reserved != other.reserved) return false
        if (this.dwOffset != other.dwOffset) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpData.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBytesRecorded.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpNext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dwOffset.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpData: Pstr = MutPtr(0L),
            dwBufferLength: UInt = 0u,
            dwBytesRecorded: UInt = 0u,
            dwUser: Int = 0,
            dwFlags: UInt = 0u,
            lpNext: MutPtr = MutPtr(0L),
            reserved: Int = 0,
            dwOffset: UInt = 0u,
            dwReserved: IntArray = IntArray(8),
        ): Midihdr =
            Midihdr(
                lpDataCtorArg = lpData,
                dwBufferLength = dwBufferLength,
                dwBytesRecorded = dwBytesRecorded,
                dwUser = dwUser,
                dwFlags = dwFlags,
                lpNextCtorArg = lpNext,
                reserved = reserved,
                dwOffset = dwOffset,
                dwReserved = dwReserved,
            )
    }
}

public data class Midiincaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midiincaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Midiincaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midiincaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Midiincapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midiincapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiincapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiincapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Midiincapsa =
                    Midiincapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Midiincapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwSupport)
                }
            }
    }
}

public data class Midiincapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midiincapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiincapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiincapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): Midiincapsw =
                    Midiincapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: Midiincapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwSupport)
                }
            }
    }
}

public data class Midioutcaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midioutcaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wVoices.hashCode()
        result = 31 * result + this.wNotes.hashCode()
        result = 31 * result + this.wChannelMask.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Midioutcaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midioutcaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wVoices.hashCode()
        result = 31 * result + this.wNotes.hashCode()
        result = 31 * result + this.wChannelMask.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Midioutcapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midioutcapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wVoices.hashCode()
        result = 31 * result + this.wNotes.hashCode()
        result = 31 * result + this.wChannelMask.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midioutcapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midioutcapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Midioutcapsa =
                    Midioutcapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Midioutcapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.wTechnology)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.wVoices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.wNotes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.wChannelMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwSupport)
                }
            }
    }
}

public data class Midioutcapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Midioutcapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.wTechnology.hashCode()
        result = 31 * result + this.wVoices.hashCode()
        result = 31 * result + this.wNotes.hashCode()
        result = 31 * result + this.wChannelMask.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midioutcapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midioutcapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): Midioutcapsw =
                    Midioutcapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Midioutcapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 72L, value.wTechnology)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 74L, value.wVoices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 76L, value.wNotes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.wChannelMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwSupport)
                }
            }
    }
}

public data class Midiproptempo(
    public var cbStruct: UInt = 0u,
    public var dwTempo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiproptempo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiproptempo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Midiproptempo =
                    Midiproptempo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Midiproptempo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTempo)
                }
            }
    }
}

public data class Midiproptimediv(
    public var cbStruct: UInt = 0u,
    public var dwTimeDiv: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiproptimediv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiproptimediv> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Midiproptimediv =
                    Midiproptimediv(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Midiproptimediv) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTimeDiv)
                }
            }
    }
}

public data class Midistrmbuffver(
    public var dwVersion: UInt = 0u,
    public var dwMid: UInt = 0u,
    public var dwOEMVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midistrmbuffver> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midistrmbuffver> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Midistrmbuffver =
                    Midistrmbuffver(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Midistrmbuffver) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOEMVersion)
                }
            }
    }
}

public data class Mixercaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Mixercaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Mixercapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Mixercapsa =
                    Mixercapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Mixercapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.cDestinations)
                }
            }
    }
}

public data class Mixercapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Mixercapsw =
                    Mixercapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: Mixercapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.fdwSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.cDestinations)
                }
            }
    }
}

public data class Mixercontrola(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
    public var fdwControl: UInt = 0u,
    public var cMultipleItems: UInt = 0u,
    public var szShortName: ByteArray = ByteArray(16),
    public var szName: ByteArray = ByteArray(64),
    public var bounds: Mixercontrola0 = Mixercontrola0(),
    public var metrics: Mixercontrola1 = Mixercontrola1(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrola) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwControlID != other.dwControlID) return false
        if (this.dwControlType != other.dwControlType) return false
        if (this.fdwControl != other.fdwControl) return false
        if (this.cMultipleItems != other.cMultipleItems) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.bounds != other.bounds) return false
        if (this.metrics != other.metrics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwControlID.hashCode()
        result = 31 * result + this.dwControlType.hashCode()
        result = 31 * result + this.fdwControl.hashCode()
        result = 31 * result + this.cMultipleItems.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.bounds.hashCode()
        result = 31 * result + this.metrics.hashCode()
        return result
    }
}

public data class Mixercontrola0(
    public var anonymous1: Mixercontrola00 = Mixercontrola00(),
    public var anonymous2: Mixercontrola01 = Mixercontrola01(),
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrola0) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Mixercontrola00(
    public var lMinimum: Int = 0,
    public var lMaximum: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrola00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrola00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Mixercontrola00 =
                    Mixercontrola00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Mixercontrola00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lMaximum)
                }
            }
    }
}

public data class Mixercontrola01(
    public var dwMinimum: UInt = 0u,
    public var dwMaximum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrola01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrola01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Mixercontrola01 =
                    Mixercontrola01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Mixercontrola01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMaximum)
                }
            }
    }
}

public data class Mixercontrola1(
    public var cSteps: UInt = 0u,
    public var cbCustomData: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrola1) return false
        if (this.cSteps != other.cSteps) return false
        if (this.cbCustomData != other.cbCustomData) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSteps.hashCode()
        result = 31 * result + this.cbCustomData.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public class Mixercontroldetails internal constructor(
    public var cbStruct: UInt,
    public var dwControlID: UInt,
    public var cChannels: UInt,
    public var anonymous: Mixercontroldetails0,
    public var cbDetails: UInt,
    paDetailsCtorArg: MutPtr,
) {
    public var paDetails: MutPtr = paDetailsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwControlID = 0u,
        cChannels = 0u,
        anonymous = Mixercontroldetails0(),
        cbDetails = 0u,
        paDetailsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwControlID

    public operator fun component3(): UInt = this.cChannels

    public operator fun component4(): Mixercontroldetails0 = this.anonymous

    public operator fun component5(): UInt = this.cbDetails

    public operator fun component6(): MutPtr = this.paDetails

    public fun copy(cbStruct: UInt = this.cbStruct, dwControlID: UInt = this.dwControlID, cChannels: UInt = this.cChannels, anonymous: Mixercontroldetails0 = this.anonymous, cbDetails: UInt = this.cbDetails, paDetails: MutPtr = this.paDetails): Mixercontroldetails = Mixercontroldetails(cbStruct = cbStruct, dwControlID = dwControlID, cChannels = cChannels, anonymous = anonymous, cbDetails = cbDetails, paDetailsCtorArg = paDetails)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontroldetails) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwControlID != other.dwControlID) return false
        if (this.cChannels != other.cChannels) return false
        if (this.anonymous != other.anonymous) return false
        if (this.cbDetails != other.cbDetails) return false
        if (this.paDetails != other.paDetails) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwControlID.hashCode()
        result = 31 * result + this.cChannels.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.cbDetails.hashCode()
        result = 31 * result + this.paDetails.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwControlID: UInt = 0u,
            cChannels: UInt = 0u,
            anonymous: Mixercontroldetails0 = Mixercontroldetails0(),
            cbDetails: UInt = 0u,
            paDetails: MutPtr = MutPtr(0L),
        ): Mixercontroldetails =
            Mixercontroldetails(
                cbStruct = cbStruct,
                dwControlID = dwControlID,
                cChannels = cChannels,
                anonymous = anonymous,
                cbDetails = cbDetails,
                paDetailsCtorArg = paDetails,
            )
    }
}

public class Mixercontroldetails0 internal constructor(
    hwndOwnerCtorArg: Hwnd,
    public var cMultipleItems: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        hwndOwnerCtorArg = MutPtr(0L),
        cMultipleItems = 0u,
    )

    public operator fun component1(): Hwnd = this.hwndOwner

    public operator fun component2(): UInt = this.cMultipleItems

    public fun copy(hwndOwner: Hwnd = this.hwndOwner, cMultipleItems: UInt = this.cMultipleItems): Mixercontroldetails0 = Mixercontroldetails0(hwndOwnerCtorArg = hwndOwner, cMultipleItems = cMultipleItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontroldetails0) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.cMultipleItems != other.cMultipleItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndOwner.hashCode()
        result = 31 * result + this.cMultipleItems.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndOwner: Hwnd = MutPtr(0L),
            cMultipleItems: UInt = 0u,
        ): Mixercontroldetails0 =
            Mixercontroldetails0(
                hwndOwnerCtorArg = hwndOwner,
                cMultipleItems = cMultipleItems,
            )
    }
}

public data class MixercontroldetailsBoolean(
    public var fValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsBoolean> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsBoolean> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MixercontroldetailsBoolean =
                    MixercontroldetailsBoolean(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MixercontroldetailsBoolean) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fValue)
                }
            }
    }
}

public data class MixercontroldetailsListtexta(
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MixercontroldetailsListtexta) return false
        if (this.dwParam1 != other.dwParam1) return false
        if (this.dwParam2 != other.dwParam2) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwParam1.hashCode()
        result = 31 * result + this.dwParam2.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsListtexta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsListtexta> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MixercontroldetailsListtexta =
                    MixercontroldetailsListtexta(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: MixercontroldetailsListtexta) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwParam2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 8L, value.szName.toList())
                }
            }
    }
}

public data class MixercontroldetailsListtextw(
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MixercontroldetailsListtextw) return false
        if (this.dwParam1 != other.dwParam1) return false
        if (this.dwParam2 != other.dwParam2) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwParam1.hashCode()
        result = 31 * result + this.dwParam2.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsListtextw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsListtextw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): MixercontroldetailsListtextw =
                    MixercontroldetailsListtextw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MixercontroldetailsListtextw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwParam2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 8L, value.szName.toList())
                }
            }
    }
}

public data class MixercontroldetailsSigned(
    public var lValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsSigned> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsSigned> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MixercontroldetailsSigned =
                    MixercontroldetailsSigned(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MixercontroldetailsSigned) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lValue)
                }
            }
    }
}

public data class MixercontroldetailsUnsigned(
    public var dwValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsUnsigned> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MixercontroldetailsUnsigned> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MixercontroldetailsUnsigned =
                    MixercontroldetailsUnsigned(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MixercontroldetailsUnsigned) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwValue)
                }
            }
    }
}

public data class Mixercontrolw(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
    public var fdwControl: UInt = 0u,
    public var cMultipleItems: UInt = 0u,
    public var szShortName: UShortArray = UShortArray(16),
    public var szName: UShortArray = UShortArray(64),
    public var bounds: Mixercontrolw0 = Mixercontrolw0(),
    public var metrics: Mixercontrolw1 = Mixercontrolw1(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrolw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwControlID != other.dwControlID) return false
        if (this.dwControlType != other.dwControlType) return false
        if (this.fdwControl != other.fdwControl) return false
        if (this.cMultipleItems != other.cMultipleItems) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.bounds != other.bounds) return false
        if (this.metrics != other.metrics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwControlID.hashCode()
        result = 31 * result + this.dwControlType.hashCode()
        result = 31 * result + this.fdwControl.hashCode()
        result = 31 * result + this.cMultipleItems.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.bounds.hashCode()
        result = 31 * result + this.metrics.hashCode()
        return result
    }
}

public data class Mixercontrolw0(
    public var anonymous1: Mixercontrolw00 = Mixercontrolw00(),
    public var anonymous2: Mixercontrolw01 = Mixercontrolw01(),
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrolw0) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Mixercontrolw00(
    public var lMinimum: Int = 0,
    public var lMaximum: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrolw00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrolw00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Mixercontrolw00 =
                    Mixercontrolw00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Mixercontrolw00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lMaximum)
                }
            }
    }
}

public data class Mixercontrolw01(
    public var dwMinimum: UInt = 0u,
    public var dwMaximum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrolw01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixercontrolw01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Mixercontrolw01 =
                    Mixercontrolw01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Mixercontrolw01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMaximum)
                }
            }
    }
}

public data class Mixercontrolw1(
    public var cSteps: UInt = 0u,
    public var cbCustomData: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixercontrolw1) return false
        if (this.cSteps != other.cSteps) return false
        if (this.cbCustomData != other.cbCustomData) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cSteps.hashCode()
        result = 31 * result + this.cbCustomData.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class Mixerlinea(
    public var cbStruct: UInt = 0u,
    public var dwDestination: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var fdwLine: UInt = 0u,
    public var dwUser: Int = 0,
    public var dwComponentType: MixerlineComponenttype = 0u,
    public var cChannels: UInt = 0u,
    public var cConnections: UInt = 0u,
    public var cControls: UInt = 0u,
    public var szShortName: ByteArray = ByteArray(16),
    public var szName: ByteArray = ByteArray(64),
    public var target: Mixerlinea0 = Mixerlinea0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinea) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwDestination != other.dwDestination) return false
        if (this.dwSource != other.dwSource) return false
        if (this.dwLineID != other.dwLineID) return false
        if (this.fdwLine != other.fdwLine) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwComponentType != other.dwComponentType) return false
        if (this.cChannels != other.cChannels) return false
        if (this.cConnections != other.cConnections) return false
        if (this.cControls != other.cControls) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.target != other.target) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwDestination.hashCode()
        result = 31 * result + this.dwSource.hashCode()
        result = 31 * result + this.dwLineID.hashCode()
        result = 31 * result + this.fdwLine.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwComponentType.hashCode()
        result = 31 * result + this.cChannels.hashCode()
        result = 31 * result + this.cConnections.hashCode()
        result = 31 * result + this.cControls.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.target.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinea> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 172L
                override fun readNative(addr: Long): Mixerlinea =
                    Mixerlinea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 44L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 60L).toByteArray(),
                        (Mixerlinea0.typeLayout()).readNative(addr + 124L),
                    )
                override fun writeNative(addr: Long, value: Mixerlinea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDestination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwLineID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 20L, value.dwUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwComponentType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cControls)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 44L, value.szShortName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 60L, value.szName.toList())
                    (Mixerlinea0.typeLayout()).writeNative(addr + 124L, value.target)
                }
            }
    }
}

public data class Mixerlinea0(
    public var dwType: UInt = 0u,
    public var dwDeviceID: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinea0) return false
        if (this.dwType != other.dwType) return false
        if (this.dwDeviceID != other.dwDeviceID) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwDeviceID.hashCode()
        result = 31 * result + this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinea0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinea0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Mixerlinea0 =
                    Mixerlinea0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 16L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Mixerlinea0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDeviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 16L, value.szPname.toList())
                }
            }
    }
}

public class Mixerlinecontrolsa internal constructor(
    public var cbStruct: UInt,
    public var dwLineID: UInt,
    public var anonymous: Mixerlinecontrolsa0,
    public var cControls: UInt,
    public var cbmxctrl: UInt,
    pamxctrlCtorArg: MutPtr,
) {
    public var pamxctrl: MutPtr = pamxctrlCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwLineID = 0u,
        anonymous = Mixerlinecontrolsa0(),
        cControls = 0u,
        cbmxctrl = 0u,
        pamxctrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwLineID

    public operator fun component3(): Mixerlinecontrolsa0 = this.anonymous

    public operator fun component4(): UInt = this.cControls

    public operator fun component5(): UInt = this.cbmxctrl

    public operator fun component6(): MutPtr = this.pamxctrl

    public fun copy(cbStruct: UInt = this.cbStruct, dwLineID: UInt = this.dwLineID, anonymous: Mixerlinecontrolsa0 = this.anonymous, cControls: UInt = this.cControls, cbmxctrl: UInt = this.cbmxctrl, pamxctrl: MutPtr = this.pamxctrl): Mixerlinecontrolsa = Mixerlinecontrolsa(cbStruct = cbStruct, dwLineID = dwLineID, anonymous = anonymous, cControls = cControls, cbmxctrl = cbmxctrl, pamxctrlCtorArg = pamxctrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinecontrolsa) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwLineID != other.dwLineID) return false
        if (this.anonymous != other.anonymous) return false
        if (this.cControls != other.cControls) return false
        if (this.cbmxctrl != other.cbmxctrl) return false
        if (this.pamxctrl != other.pamxctrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwLineID.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.cControls.hashCode()
        result = 31 * result + this.cbmxctrl.hashCode()
        result = 31 * result + this.pamxctrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwLineID: UInt = 0u,
            anonymous: Mixerlinecontrolsa0 = Mixerlinecontrolsa0(),
            cControls: UInt = 0u,
            cbmxctrl: UInt = 0u,
            pamxctrl: MutPtr = MutPtr(0L),
        ): Mixerlinecontrolsa =
            Mixerlinecontrolsa(
                cbStruct = cbStruct,
                dwLineID = dwLineID,
                anonymous = anonymous,
                cControls = cControls,
                cbmxctrl = cbmxctrl,
                pamxctrlCtorArg = pamxctrl,
            )
    }
}

public data class Mixerlinecontrolsa0(
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
)

public class Mixerlinecontrolsw internal constructor(
    public var cbStruct: UInt,
    public var dwLineID: UInt,
    public var anonymous: Mixerlinecontrolsw0,
    public var cControls: UInt,
    public var cbmxctrl: UInt,
    pamxctrlCtorArg: MutPtr,
) {
    public var pamxctrl: MutPtr = pamxctrlCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwLineID = 0u,
        anonymous = Mixerlinecontrolsw0(),
        cControls = 0u,
        cbmxctrl = 0u,
        pamxctrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwLineID

    public operator fun component3(): Mixerlinecontrolsw0 = this.anonymous

    public operator fun component4(): UInt = this.cControls

    public operator fun component5(): UInt = this.cbmxctrl

    public operator fun component6(): MutPtr = this.pamxctrl

    public fun copy(cbStruct: UInt = this.cbStruct, dwLineID: UInt = this.dwLineID, anonymous: Mixerlinecontrolsw0 = this.anonymous, cControls: UInt = this.cControls, cbmxctrl: UInt = this.cbmxctrl, pamxctrl: MutPtr = this.pamxctrl): Mixerlinecontrolsw = Mixerlinecontrolsw(cbStruct = cbStruct, dwLineID = dwLineID, anonymous = anonymous, cControls = cControls, cbmxctrl = cbmxctrl, pamxctrlCtorArg = pamxctrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinecontrolsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwLineID != other.dwLineID) return false
        if (this.anonymous != other.anonymous) return false
        if (this.cControls != other.cControls) return false
        if (this.cbmxctrl != other.cbmxctrl) return false
        if (this.pamxctrl != other.pamxctrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwLineID.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.cControls.hashCode()
        result = 31 * result + this.cbmxctrl.hashCode()
        result = 31 * result + this.pamxctrl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwLineID: UInt = 0u,
            anonymous: Mixerlinecontrolsw0 = Mixerlinecontrolsw0(),
            cControls: UInt = 0u,
            cbmxctrl: UInt = 0u,
            pamxctrl: MutPtr = MutPtr(0L),
        ): Mixerlinecontrolsw =
            Mixerlinecontrolsw(
                cbStruct = cbStruct,
                dwLineID = dwLineID,
                anonymous = anonymous,
                cControls = cControls,
                cbmxctrl = cbmxctrl,
                pamxctrlCtorArg = pamxctrl,
            )
    }
}

public data class Mixerlinecontrolsw0(
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
)

public data class Mixerlinew(
    public var cbStruct: UInt = 0u,
    public var dwDestination: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var fdwLine: UInt = 0u,
    public var dwUser: Int = 0,
    public var dwComponentType: MixerlineComponenttype = 0u,
    public var cChannels: UInt = 0u,
    public var cConnections: UInt = 0u,
    public var cControls: UInt = 0u,
    public var szShortName: UShortArray = UShortArray(16),
    public var szName: UShortArray = UShortArray(64),
    public var target: Mixerlinew0 = Mixerlinew0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinew) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwDestination != other.dwDestination) return false
        if (this.dwSource != other.dwSource) return false
        if (this.dwLineID != other.dwLineID) return false
        if (this.fdwLine != other.fdwLine) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwComponentType != other.dwComponentType) return false
        if (this.cChannels != other.cChannels) return false
        if (this.cConnections != other.cConnections) return false
        if (this.cControls != other.cControls) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.target != other.target) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwDestination.hashCode()
        result = 31 * result + this.dwSource.hashCode()
        result = 31 * result + this.dwLineID.hashCode()
        result = 31 * result + this.fdwLine.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwComponentType.hashCode()
        result = 31 * result + this.cChannels.hashCode()
        result = 31 * result + this.cConnections.hashCode()
        result = 31 * result + this.cControls.hashCode()
        result = 31 * result + this.szShortName.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.target.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinew> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): Mixerlinew =
                    Mixerlinew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 44L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 76L).toUShortArray(),
                        (Mixerlinew0.typeLayout()).readNative(addr + 204L),
                    )
                override fun writeNative(addr: Long, value: Mixerlinew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDestination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwLineID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fdwLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 20L, value.dwUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwComponentType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cControls)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 44L, value.szShortName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 76L, value.szName.toList())
                    (Mixerlinew0.typeLayout()).writeNative(addr + 204L, value.target)
                }
            }
    }
}

public data class Mixerlinew0(
    public var dwType: UInt = 0u,
    public var dwDeviceID: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixerlinew0) return false
        if (this.dwType != other.dwType) return false
        if (this.dwDeviceID != other.dwDeviceID) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwDeviceID.hashCode()
        result = 31 * result + this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinew0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mixerlinew0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Mixerlinew0 =
                    Mixerlinew0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Mixerlinew0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDeviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 16L, value.szPname.toList())
                }
            }
    }
}

public data class Pcmwaveformat(
    public var wf: Waveformat = Waveformat(),
    public var wBitsPerSample: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pcmwaveformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pcmwaveformat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Pcmwaveformat =
                    Pcmwaveformat(
                        (Waveformat.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Pcmwaveformat) {
                    (Waveformat.typeLayout()).writeNative(addr, value.wf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wBitsPerSample)
                }
            }
    }
}

public data class SpatialAudioClientActivationParams(
    public var tracingContextId: Guid = Guid(),
    public var appId: Guid = Guid(),
    public var majorVersion: Int = 0,
    public var minorVersion1: Int = 0,
    public var minorVersion2: Int = 0,
    public var minorVersion3: Int = 0,
)

public class SpatialAudioHrtfActivationParams internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    notifyObjectCtorArg: MutPtr,
    distanceDecayCtorArg: MutPtr,
    directivityCtorArg: MutPtr,
    environmentCtorArg: MutPtr,
    orientationCtorArg: MutPtr,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public var distanceDecay: MutPtr = distanceDecayCtorArg
        internal set

    public var directivity: MutPtr = directivityCtorArg
        internal set

    public var environment: MutPtr = environmentCtorArg
        internal set

    public var orientation: MutPtr = orientationCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
        distanceDecayCtorArg = MutPtr(0L),
        directivityCtorArg = MutPtr(0L),
        environmentCtorArg = MutPtr(0L),
        orientationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): MutPtr = this.notifyObject

    public operator fun component8(): MutPtr = this.distanceDecay

    public operator fun component9(): MutPtr = this.directivity

    public operator fun component10(): MutPtr = this.environment

    public operator fun component11(): MutPtr = this.orientation

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, notifyObject: MutPtr = this.notifyObject, distanceDecay: MutPtr = this.distanceDecay, directivity: MutPtr = this.directivity, environment: MutPtr = this.environment, orientation: MutPtr = this.orientation): SpatialAudioHrtfActivationParams = SpatialAudioHrtfActivationParams(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, notifyObjectCtorArg = notifyObject, distanceDecayCtorArg = distanceDecay, directivityCtorArg = directivity, environmentCtorArg = environment, orientationCtorArg = orientation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioHrtfActivationParams) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.notifyObject != other.notifyObject) return false
        if (this.distanceDecay != other.distanceDecay) return false
        if (this.directivity != other.directivity) return false
        if (this.environment != other.environment) return false
        if (this.orientation != other.orientation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        result = 31 * result + this.distanceDecay.hashCode()
        result = 31 * result + this.directivity.hashCode()
        result = 31 * result + this.environment.hashCode()
        result = 31 * result + this.orientation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
            distanceDecay: MutPtr = MutPtr(0L),
            directivity: MutPtr = MutPtr(0L),
            environment: MutPtr = MutPtr(0L),
            orientation: MutPtr = MutPtr(0L),
        ): SpatialAudioHrtfActivationParams =
            SpatialAudioHrtfActivationParams(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                notifyObjectCtorArg = notifyObject,
                distanceDecayCtorArg = distanceDecay,
                directivityCtorArg = directivity,
                environmentCtorArg = environment,
                orientationCtorArg = orientation,
            )
    }
}

public class SpatialAudioHrtfActivationParams2 internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    notifyObjectCtorArg: MutPtr,
    distanceDecayCtorArg: MutPtr,
    directivityCtorArg: MutPtr,
    environmentCtorArg: MutPtr,
    orientationCtorArg: MutPtr,
    public var options: SpatialAudioStreamOptions,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public var distanceDecay: MutPtr = distanceDecayCtorArg
        internal set

    public var directivity: MutPtr = directivityCtorArg
        internal set

    public var environment: MutPtr = environmentCtorArg
        internal set

    public var orientation: MutPtr = orientationCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
        distanceDecayCtorArg = MutPtr(0L),
        directivityCtorArg = MutPtr(0L),
        environmentCtorArg = MutPtr(0L),
        orientationCtorArg = MutPtr(0L),
        options = 0,
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): MutPtr = this.notifyObject

    public operator fun component8(): MutPtr = this.distanceDecay

    public operator fun component9(): MutPtr = this.directivity

    public operator fun component10(): MutPtr = this.environment

    public operator fun component11(): MutPtr = this.orientation

    public operator fun component12(): SpatialAudioStreamOptions = this.options

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, notifyObject: MutPtr = this.notifyObject, distanceDecay: MutPtr = this.distanceDecay, directivity: MutPtr = this.directivity, environment: MutPtr = this.environment, orientation: MutPtr = this.orientation, options: SpatialAudioStreamOptions = this.options): SpatialAudioHrtfActivationParams2 = SpatialAudioHrtfActivationParams2(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, notifyObjectCtorArg = notifyObject, distanceDecayCtorArg = distanceDecay, directivityCtorArg = directivity, environmentCtorArg = environment, orientationCtorArg = orientation, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioHrtfActivationParams2) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.notifyObject != other.notifyObject) return false
        if (this.distanceDecay != other.distanceDecay) return false
        if (this.directivity != other.directivity) return false
        if (this.environment != other.environment) return false
        if (this.orientation != other.orientation) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        result = 31 * result + this.distanceDecay.hashCode()
        result = 31 * result + this.directivity.hashCode()
        result = 31 * result + this.environment.hashCode()
        result = 31 * result + this.orientation.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
            distanceDecay: MutPtr = MutPtr(0L),
            directivity: MutPtr = MutPtr(0L),
            environment: MutPtr = MutPtr(0L),
            orientation: MutPtr = MutPtr(0L),
            options: SpatialAudioStreamOptions = 0,
        ): SpatialAudioHrtfActivationParams2 =
            SpatialAudioHrtfActivationParams2(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                notifyObjectCtorArg = notifyObject,
                distanceDecayCtorArg = distanceDecay,
                directivityCtorArg = directivity,
                environmentCtorArg = environment,
                orientationCtorArg = orientation,
                options = options,
            )
    }
}

public data class SpatialAudioHrtfDirectivity(
    public var type: SpatialAudioHrtfDirectivityType = 0,
    public var scaling: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivity> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SpatialAudioHrtfDirectivity =
                    SpatialAudioHrtfDirectivity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SpatialAudioHrtfDirectivity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.scaling)
                }
            }
    }
}

public data class SpatialAudioHrtfDirectivityCardioid(
    public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
    public var order: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivityCardioid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivityCardioid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SpatialAudioHrtfDirectivityCardioid =
                    SpatialAudioHrtfDirectivityCardioid(
                        (SpatialAudioHrtfDirectivity.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SpatialAudioHrtfDirectivityCardioid) {
                    (SpatialAudioHrtfDirectivity.typeLayout()).writeNative(addr, value.directivity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.order)
                }
            }
    }
}

public data class SpatialAudioHrtfDirectivityCone(
    public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
    public var innerAngle: Float = 0.0f,
    public var outerAngle: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivityCone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDirectivityCone> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SpatialAudioHrtfDirectivityCone =
                    SpatialAudioHrtfDirectivityCone(
                        (SpatialAudioHrtfDirectivity.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SpatialAudioHrtfDirectivityCone) {
                    (SpatialAudioHrtfDirectivity.typeLayout()).writeNative(addr, value.directivity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.innerAngle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.outerAngle)
                }
            }
    }
}

public data class SpatialAudioHrtfDirectivityUnion(
    public var cone: SpatialAudioHrtfDirectivityCone = SpatialAudioHrtfDirectivityCone(),
    public var cardiod: SpatialAudioHrtfDirectivityCardioid = SpatialAudioHrtfDirectivityCardioid(),
    public var omni: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
)

public data class SpatialAudioHrtfDistanceDecay(
    public var type: SpatialAudioHrtfDistanceDecayType = 0,
    public var maxGain: Float = 0.0f,
    public var minGain: Float = 0.0f,
    public var unityGainDistance: Float = 0.0f,
    public var cutoffDistance: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDistanceDecay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioHrtfDistanceDecay> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SpatialAudioHrtfDistanceDecay =
                    SpatialAudioHrtfDistanceDecay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SpatialAudioHrtfDistanceDecay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.maxGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.minGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.unityGainDistance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.cutoffDistance)
                }
            }
    }
}

public data class SpatialAudioMetadataItemsInfo(
    public var frameCount: UShort = 0u,
    public var itemCount: UShort = 0u,
    public var maxItemCount: UShort = 0u,
    public var maxValueBufferLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioMetadataItemsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpatialAudioMetadataItemsInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): SpatialAudioMetadataItemsInfo =
                    SpatialAudioMetadataItemsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SpatialAudioMetadataItemsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.frameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.itemCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.maxItemCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.maxValueBufferLength)
                }
            }
    }
}

public class SpatialAudioObjectRenderStreamActivationParams internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    notifyObjectCtorArg: MutPtr,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): MutPtr = this.notifyObject

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, notifyObject: MutPtr = this.notifyObject): SpatialAudioObjectRenderStreamActivationParams = SpatialAudioObjectRenderStreamActivationParams(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, notifyObjectCtorArg = notifyObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioObjectRenderStreamActivationParams) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.notifyObject != other.notifyObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
        ): SpatialAudioObjectRenderStreamActivationParams =
            SpatialAudioObjectRenderStreamActivationParams(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                notifyObjectCtorArg = notifyObject,
            )
    }
}

public class SpatialAudioObjectRenderStreamActivationParams2 internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    notifyObjectCtorArg: MutPtr,
    public var options: SpatialAudioStreamOptions,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
        options = 0,
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): MutPtr = this.notifyObject

    public operator fun component8(): SpatialAudioStreamOptions = this.options

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, notifyObject: MutPtr = this.notifyObject, options: SpatialAudioStreamOptions = this.options): SpatialAudioObjectRenderStreamActivationParams2 = SpatialAudioObjectRenderStreamActivationParams2(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, notifyObjectCtorArg = notifyObject, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioObjectRenderStreamActivationParams2) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.notifyObject != other.notifyObject) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
            options: SpatialAudioStreamOptions = 0,
        ): SpatialAudioObjectRenderStreamActivationParams2 =
            SpatialAudioObjectRenderStreamActivationParams2(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                notifyObjectCtorArg = notifyObject,
                options = options,
            )
    }
}

public class SpatialAudioObjectRenderStreamForMetadataActivationParams internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    public var metadataFormatId: Guid,
    public var maxMetadataItemCount: UShort,
    metadataActivationParamsCtorArg: ConstPtr,
    notifyObjectCtorArg: MutPtr,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var metadataActivationParams: ConstPtr = metadataActivationParamsCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        metadataFormatId = Guid(),
        maxMetadataItemCount = 0u,
        metadataActivationParamsCtorArg = ConstPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): Guid = this.metadataFormatId

    public operator fun component8(): UShort = this.maxMetadataItemCount

    public operator fun component9(): ConstPtr = this.metadataActivationParams

    public operator fun component10(): MutPtr = this.notifyObject

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, metadataFormatId: Guid = this.metadataFormatId, maxMetadataItemCount: UShort = this.maxMetadataItemCount, metadataActivationParams: ConstPtr = this.metadataActivationParams, notifyObject: MutPtr = this.notifyObject): SpatialAudioObjectRenderStreamForMetadataActivationParams = SpatialAudioObjectRenderStreamForMetadataActivationParams(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, metadataFormatId = metadataFormatId, maxMetadataItemCount = maxMetadataItemCount, metadataActivationParamsCtorArg = metadataActivationParams, notifyObjectCtorArg = notifyObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioObjectRenderStreamForMetadataActivationParams) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.metadataFormatId != other.metadataFormatId) return false
        if (this.maxMetadataItemCount != other.maxMetadataItemCount) return false
        if (this.metadataActivationParams != other.metadataActivationParams) return false
        if (this.notifyObject != other.notifyObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.metadataFormatId.hashCode()
        result = 31 * result + this.maxMetadataItemCount.hashCode()
        result = 31 * result + this.metadataActivationParams.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            metadataFormatId: Guid = Guid(),
            maxMetadataItemCount: UShort = 0u,
            metadataActivationParams: ConstPtr = ConstPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
        ): SpatialAudioObjectRenderStreamForMetadataActivationParams =
            SpatialAudioObjectRenderStreamForMetadataActivationParams(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                metadataFormatId = metadataFormatId,
                maxMetadataItemCount = maxMetadataItemCount,
                metadataActivationParamsCtorArg = metadataActivationParams,
                notifyObjectCtorArg = notifyObject,
            )
    }
}

public class SpatialAudioObjectRenderStreamForMetadataActivationParams2 internal constructor(
    objectFormatCtorArg: ConstPtr,
    public var staticObjectTypeMask: AudioObjectType,
    public var minDynamicObjectCount: UInt,
    public var maxDynamicObjectCount: UInt,
    public var category: AudioStreamCategory,
    eventHandleCtorArg: Handle,
    public var metadataFormatId: Guid,
    public var maxMetadataItemCount: UInt,
    metadataActivationParamsCtorArg: ConstPtr,
    notifyObjectCtorArg: MutPtr,
    public var options: SpatialAudioStreamOptions,
) {
    public var objectFormat: ConstPtr = objectFormatCtorArg
        internal set

    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public var metadataActivationParams: ConstPtr = metadataActivationParamsCtorArg
        internal set

    public var notifyObject: MutPtr = notifyObjectCtorArg
        internal set

    public constructor() : this(
        objectFormatCtorArg = ConstPtr(0L),
        staticObjectTypeMask = 0,
        minDynamicObjectCount = 0u,
        maxDynamicObjectCount = 0u,
        category = 0,
        eventHandleCtorArg = MutPtr(0L),
        metadataFormatId = Guid(),
        maxMetadataItemCount = 0u,
        metadataActivationParamsCtorArg = ConstPtr(0L),
        notifyObjectCtorArg = MutPtr(0L),
        options = 0,
    )

    public operator fun component1(): ConstPtr = this.objectFormat

    public operator fun component2(): AudioObjectType = this.staticObjectTypeMask

    public operator fun component3(): UInt = this.minDynamicObjectCount

    public operator fun component4(): UInt = this.maxDynamicObjectCount

    public operator fun component5(): AudioStreamCategory = this.category

    public operator fun component6(): Handle = this.eventHandle

    public operator fun component7(): Guid = this.metadataFormatId

    public operator fun component8(): UInt = this.maxMetadataItemCount

    public operator fun component9(): ConstPtr = this.metadataActivationParams

    public operator fun component10(): MutPtr = this.notifyObject

    public operator fun component11(): SpatialAudioStreamOptions = this.options

    public fun copy(objectFormat: ConstPtr = this.objectFormat, staticObjectTypeMask: AudioObjectType = this.staticObjectTypeMask, minDynamicObjectCount: UInt = this.minDynamicObjectCount, maxDynamicObjectCount: UInt = this.maxDynamicObjectCount, category: AudioStreamCategory = this.category, eventHandle: Handle = this.eventHandle, metadataFormatId: Guid = this.metadataFormatId, maxMetadataItemCount: UInt = this.maxMetadataItemCount, metadataActivationParams: ConstPtr = this.metadataActivationParams, notifyObject: MutPtr = this.notifyObject, options: SpatialAudioStreamOptions = this.options): SpatialAudioObjectRenderStreamForMetadataActivationParams2 = SpatialAudioObjectRenderStreamForMetadataActivationParams2(objectFormatCtorArg = objectFormat, staticObjectTypeMask = staticObjectTypeMask, minDynamicObjectCount = minDynamicObjectCount, maxDynamicObjectCount = maxDynamicObjectCount, category = category, eventHandleCtorArg = eventHandle, metadataFormatId = metadataFormatId, maxMetadataItemCount = maxMetadataItemCount, metadataActivationParamsCtorArg = metadataActivationParams, notifyObjectCtorArg = notifyObject, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpatialAudioObjectRenderStreamForMetadataActivationParams2) return false
        if (this.objectFormat != other.objectFormat) return false
        if (this.staticObjectTypeMask != other.staticObjectTypeMask) return false
        if (this.minDynamicObjectCount != other.minDynamicObjectCount) return false
        if (this.maxDynamicObjectCount != other.maxDynamicObjectCount) return false
        if (this.category != other.category) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.metadataFormatId != other.metadataFormatId) return false
        if (this.maxMetadataItemCount != other.maxMetadataItemCount) return false
        if (this.metadataActivationParams != other.metadataActivationParams) return false
        if (this.notifyObject != other.notifyObject) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectFormat.hashCode()
        result = 31 * result + this.staticObjectTypeMask.hashCode()
        result = 31 * result + this.minDynamicObjectCount.hashCode()
        result = 31 * result + this.maxDynamicObjectCount.hashCode()
        result = 31 * result + this.category.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.metadataFormatId.hashCode()
        result = 31 * result + this.maxMetadataItemCount.hashCode()
        result = 31 * result + this.metadataActivationParams.hashCode()
        result = 31 * result + this.notifyObject.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectFormat: ConstPtr = ConstPtr(0L),
            staticObjectTypeMask: AudioObjectType = 0,
            minDynamicObjectCount: UInt = 0u,
            maxDynamicObjectCount: UInt = 0u,
            category: AudioStreamCategory = 0,
            eventHandle: Handle = MutPtr(0L),
            metadataFormatId: Guid = Guid(),
            maxMetadataItemCount: UInt = 0u,
            metadataActivationParams: ConstPtr = ConstPtr(0L),
            notifyObject: MutPtr = MutPtr(0L),
            options: SpatialAudioStreamOptions = 0,
        ): SpatialAudioObjectRenderStreamForMetadataActivationParams2 =
            SpatialAudioObjectRenderStreamForMetadataActivationParams2(
                objectFormatCtorArg = objectFormat,
                staticObjectTypeMask = staticObjectTypeMask,
                minDynamicObjectCount = minDynamicObjectCount,
                maxDynamicObjectCount = maxDynamicObjectCount,
                category = category,
                eventHandleCtorArg = eventHandle,
                metadataFormatId = metadataFormatId,
                maxMetadataItemCount = maxMetadataItemCount,
                metadataActivationParamsCtorArg = metadataActivationParams,
                notifyObjectCtorArg = notifyObject,
                options = options,
            )
    }
}

public data class Volumewavefilter(
    public var wfltr: Wavefilter = Wavefilter(),
    public var dwVolume: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Volumewavefilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Volumewavefilter> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Volumewavefilter =
                    Volumewavefilter(
                        (Wavefilter.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Volumewavefilter) {
                    (Wavefilter.typeLayout()).writeNative(addr, value.wfltr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwVolume)
                }
            }
    }
}

public data class Wavefilter(
    public var cbStruct: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwFilter: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wavefilter) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFilterTag != other.dwFilterTag) return false
        if (this.fdwFilter != other.fdwFilter) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFilterTag.hashCode()
        result = 31 * result + this.fdwFilter.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wavefilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wavefilter> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Wavefilter =
                    Wavefilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Wavefilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFilterTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fdwFilter)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr + 12L, value.dwReserved.toList())
                }
            }
    }
}

public data class Waveformat(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveformat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): Waveformat =
                    Waveformat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Waveformat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nSamplesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nAvgBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.nBlockAlign)
                }
            }
    }
}

public data class Waveformatex(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
    public var wBitsPerSample: UShort = 0u,
    public var cbSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveformatex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveformatex> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): Waveformatex =
                    Waveformatex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Waveformatex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nSamplesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nAvgBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.nBlockAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.cbSize)
                }
            }
    }
}

public data class Waveformatextensible(
    public var format: Waveformatex = Waveformatex(),
    public var samples: Waveformatextensible0 = Waveformatextensible0(),
    public var dwChannelMask: UInt = 0u,
    public var subFormat: Guid = Guid(),
)

public data class Waveformatextensible0(
    public var wValidBitsPerSample: UShort = 0u,
    public var wSamplesPerBlock: UShort = 0u,
    public var wReserved: UShort = 0u,
)

public class Wavehdr internal constructor(
    lpDataCtorArg: Pstr,
    public var dwBufferLength: UInt,
    public var dwBytesRecorded: UInt,
    public var dwUser: Int,
    public var dwFlags: UInt,
    public var dwLoops: UInt,
    lpNextCtorArg: MutPtr,
    public var reserved: Int,
) {
    public var lpData: Pstr = lpDataCtorArg
        internal set

    public var lpNext: MutPtr = lpNextCtorArg
        internal set

    public constructor() : this(
        lpDataCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
        dwBytesRecorded = 0u,
        dwUser = 0,
        dwFlags = 0u,
        dwLoops = 0u,
        lpNextCtorArg = MutPtr(0L),
        reserved = 0,
    )

    public operator fun component1(): Pstr = this.lpData

    public operator fun component2(): UInt = this.dwBufferLength

    public operator fun component3(): UInt = this.dwBytesRecorded

    public operator fun component4(): Int = this.dwUser

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): UInt = this.dwLoops

    public operator fun component7(): MutPtr = this.lpNext

    public operator fun component8(): Int = this.reserved

    public fun copy(lpData: Pstr = this.lpData, dwBufferLength: UInt = this.dwBufferLength, dwBytesRecorded: UInt = this.dwBytesRecorded, dwUser: Int = this.dwUser, dwFlags: UInt = this.dwFlags, dwLoops: UInt = this.dwLoops, lpNext: MutPtr = this.lpNext, reserved: Int = this.reserved): Wavehdr = Wavehdr(lpDataCtorArg = lpData, dwBufferLength = dwBufferLength, dwBytesRecorded = dwBytesRecorded, dwUser = dwUser, dwFlags = dwFlags, dwLoops = dwLoops, lpNextCtorArg = lpNext, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wavehdr) return false
        if (this.lpData != other.lpData) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBytesRecorded != other.dwBytesRecorded) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwLoops != other.dwLoops) return false
        if (this.lpNext != other.lpNext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpData.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBytesRecorded.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwLoops.hashCode()
        result = 31 * result + this.lpNext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpData: Pstr = MutPtr(0L),
            dwBufferLength: UInt = 0u,
            dwBytesRecorded: UInt = 0u,
            dwUser: Int = 0,
            dwFlags: UInt = 0u,
            dwLoops: UInt = 0u,
            lpNext: MutPtr = MutPtr(0L),
            reserved: Int = 0,
        ): Wavehdr =
            Wavehdr(
                lpDataCtorArg = lpData,
                dwBufferLength = dwBufferLength,
                dwBytesRecorded = dwBytesRecorded,
                dwUser = dwUser,
                dwFlags = dwFlags,
                dwLoops = dwLoops,
                lpNextCtorArg = lpNext,
                reserved = reserved,
            )
    }
}

public data class Waveincaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveincaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Waveincaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveincaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Waveincapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveincapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveincapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveincapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Waveincapsa =
                    Waveincapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                    )
                override fun writeNative(addr: Long, value: Waveincapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFormats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.wChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.wReserved1)
                }
            }
    }
}

public data class Waveincapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveincapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveincapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveincapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Waveincapsw =
                    Waveincapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                    )
                override fun writeNative(addr: Long, value: Waveincapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFormats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 76L, value.wChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.wReserved1)
                }
            }
    }
}

public data class Waveoutcaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveoutcaps2a) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Waveoutcaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveoutcaps2w) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.manufacturerGuid != other.manufacturerGuid) return false
        if (this.productGuid != other.productGuid) return false
        if (this.nameGuid != other.nameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.manufacturerGuid.hashCode()
        result = 31 * result + this.productGuid.hashCode()
        result = 31 * result + this.nameGuid.hashCode()
        return result
    }
}

public data class Waveoutcapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveoutcapsa) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveoutcapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveoutcapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Waveoutcapsa =
                    Waveoutcapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Waveoutcapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFormats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.wChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.wReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwSupport)
                }
            }
    }
}

public data class Waveoutcapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveoutcapsw) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwFormats.hashCode()
        result = 31 * result + this.wChannels.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        result = 31 * result + this.dwSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveoutcapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Waveoutcapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): Waveoutcapsw =
                    Waveoutcapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Waveoutcapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vDriverVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFormats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 76L, value.wChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.wReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwSupport)
                }
            }
    }
}

public class TAcmformatdetailsw internal constructor(
    public var cbStruct: UInt,
    public var dwFormatIndex: UInt,
    public var dwFormatTag: UInt,
    public var fdwSupport: UInt,
    pwfxCtorArg: MutPtr,
    public var cbwfx: UInt,
    public var szFormat: UShortArray,
) {
    public var pwfx: MutPtr = pwfxCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFormatIndex = 0u,
        dwFormatTag = 0u,
        fdwSupport = 0u,
        pwfxCtorArg = MutPtr(0L),
        cbwfx = 0u,
        szFormat = UShortArray(128),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFormatIndex

    public operator fun component3(): UInt = this.dwFormatTag

    public operator fun component4(): UInt = this.fdwSupport

    public operator fun component5(): MutPtr = this.pwfx

    public operator fun component6(): UInt = this.cbwfx

    public operator fun component7(): UShortArray = this.szFormat

    public fun copy(cbStruct: UInt = this.cbStruct, dwFormatIndex: UInt = this.dwFormatIndex, dwFormatTag: UInt = this.dwFormatTag, fdwSupport: UInt = this.fdwSupport, pwfx: MutPtr = this.pwfx, cbwfx: UInt = this.cbwfx, szFormat: UShortArray = this.szFormat): TAcmformatdetailsw = TAcmformatdetailsw(cbStruct = cbStruct, dwFormatIndex = dwFormatIndex, dwFormatTag = dwFormatTag, fdwSupport = fdwSupport, pwfxCtorArg = pwfx, cbwfx = cbwfx, szFormat = szFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TAcmformatdetailsw) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFormatIndex != other.dwFormatIndex) return false
        if (this.dwFormatTag != other.dwFormatTag) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.pwfx != other.pwfx) return false
        if (this.cbwfx != other.cbwfx) return false
        if (!this.szFormat.contentEquals(other.szFormat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFormatIndex.hashCode()
        result = 31 * result + this.dwFormatTag.hashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.pwfx.hashCode()
        result = 31 * result + this.cbwfx.hashCode()
        result = 31 * result + this.szFormat.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TAcmformatdetailsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TAcmformatdetailsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): TAcmformatdetailsw =
                    TAcmformatdetailsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: TAcmformatdetailsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFormatIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fdwSupport)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pwfx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbwfx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 28L, value.szFormat.toList())
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFormatIndex: UInt = 0u,
            dwFormatTag: UInt = 0u,
            fdwSupport: UInt = 0u,
            pwfx: MutPtr = MutPtr(0L),
            cbwfx: UInt = 0u,
            szFormat: UShortArray = UShortArray(128),
        ): TAcmformatdetailsw =
            TAcmformatdetailsw(
                cbStruct = cbStruct,
                dwFormatIndex = dwFormatIndex,
                dwFormatTag = dwFormatTag,
                fdwSupport = fdwSupport,
                pwfxCtorArg = pwfx,
                cbwfx = cbwfx,
                szFormat = szFormat,
            )
    }
}
