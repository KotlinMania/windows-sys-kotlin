@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.COpaquePointer
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
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public data class Acmdriverdetailsa(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vdwACM: UInt = 0u,
    public var vdwDriver: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cFormatTags: UInt = 0u,
    public var cFilterTags: UInt = 0u,
    public var hicon: Hicon = null,
    public var szShortName: ByteArray = ByteArray(32),
    public var szLongName: ByteArray = ByteArray(128),
    public var szCopyright: ByteArray = ByteArray(80),
    public var szLicensing: ByteArray = ByteArray(128),
    public var szFeatures: ByteArray = ByteArray(512),
) {
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
}

public data class Acmdriverdetailsw(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vdwACM: UInt = 0u,
    public var vdwDriver: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var cFormatTags: UInt = 0u,
    public var cFilterTags: UInt = 0u,
    public var hicon: Hicon = null,
    public var szShortName: UShortArray = UShortArray(32),
    public var szLongName: UShortArray = UShortArray(128),
    public var szCopyright: UShortArray = UShortArray(80),
    public var szLicensing: UShortArray = UShortArray(128),
    public var szFeatures: UShortArray = UShortArray(512),
) {
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
}

public data class Acmdrvformatsuggest(
    public var cbStruct: UInt = 0u,
    public var fdwSuggest: UInt = 0u,
    public var pwfxSrc: Waveformatex? = null,
    public var cbwfxSrc: UInt = 0u,
    public var pwfxDst: Waveformatex? = null,
    public var cbwfxDst: UInt = 0u,
)

public data class Acmdrvopendesca(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pszSectionName: Pcstr = null,
    public var pszAliasName: Pcstr = null,
    public var dnDevNode: UInt = 0u,
)

public data class Acmdrvopendescw(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pszSectionName: Pcwstr = null,
    public var pszAliasName: Pcwstr = null,
    public var dnDevNode: UInt = 0u,
)

public class Acmdrvstreamheader(
    public var cbStruct: UInt = 0u,
    public var fdwStatus: UInt = 0u,
    public var dwUser: Int = 0,
    public var pbSrc: COpaquePointer? = null,
    public var cbSrcLength: UInt = 0u,
    public var cbSrcLengthUsed: UInt = 0u,
    public var dwSrcUser: Int = 0,
    public var pbDst: COpaquePointer? = null,
    public var cbDstLength: UInt = 0u,
    public var cbDstLengthUsed: UInt = 0u,
    public var dwDstUser: Int = 0,
    public var fdwConvert: UInt = 0u,
    public var padshNext: Acmdrvstreamheader? = null,
    public var fdwDriver: UInt = 0u,
    public var dwDriver: Int = 0,
    public var fdwPrepared: UInt = 0u,
    public var dwPrepared: Int = 0,
    public var pbPreparedSrc: COpaquePointer? = null,
    public var cbPreparedSrcLength: UInt = 0u,
    public var pbPreparedDst: COpaquePointer? = null,
    public var cbPreparedDstLength: UInt = 0u,
)

public data class Acmdrvstreaminstance(
    public var cbStruct: UInt = 0u,
    public var pwfxSrc: Waveformatex? = null,
    public var pwfxDst: Waveformatex? = null,
    public var pwfltr: Wavefilter? = null,
    public var dwCallback: Int = 0,
    public var dwInstance: Int = 0,
    public var fdwOpen: UInt = 0u,
    public var fdwDriver: UInt = 0u,
    public var dwDriver: Int = 0,
    public var has: Hacmstream = null,
)

public data class Acmdrvstreamsize(
    public var cbStruct: UInt = 0u,
    public var fdwSize: UInt = 0u,
    public var cbSrcLength: UInt = 0u,
    public var cbDstLength: UInt = 0u,
)

public data class Acmfilterchoosea(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pwfltr: Wavefilter? = null,
    public var cbwfltr: UInt = 0u,
    public var pszTitle: Pcstr = null,
    public var szFilterTag: ByteArray = ByteArray(48),
    public var szFilter: ByteArray = ByteArray(128),
    public var pszName: Pstr = null,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfltrEnum: Wavefilter? = null,
    public var hInstance: Hinstance = null,
    public var pszTemplateName: Pcstr = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Acmfilterchoosehookproca = null,
) {
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
}

public data class Acmfilterchoosew(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pwfltr: Wavefilter? = null,
    public var cbwfltr: UInt = 0u,
    public var pszTitle: Pcwstr = null,
    public var szFilterTag: UShortArray = UShortArray(48),
    public var szFilter: UShortArray = UShortArray(128),
    public var pszName: Pwstr = null,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfltrEnum: Wavefilter? = null,
    public var hInstance: Hinstance = null,
    public var pszTemplateName: Pcwstr = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Acmfilterchoosehookprocw = null,
) {
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
}

public data class Acmfilterdetailsa(
    public var cbStruct: UInt = 0u,
    public var dwFilterIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfltr: Wavefilter? = null,
    public var cbwfltr: UInt = 0u,
    public var szFilter: ByteArray = ByteArray(128),
) {
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
}

public data class Acmfilterdetailsw(
    public var cbStruct: UInt = 0u,
    public var dwFilterIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfltr: Wavefilter? = null,
    public var cbwfltr: UInt = 0u,
    public var szFilter: UShortArray = UShortArray(128),
) {
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
}

public data class Acmformatchoosea(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pwfx: Waveformatex? = null,
    public var cbwfx: UInt = 0u,
    public var pszTitle: Pcstr = null,
    public var szFormatTag: ByteArray = ByteArray(48),
    public var szFormat: ByteArray = ByteArray(128),
    public var pszName: Pstr = null,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfxEnum: Waveformatex? = null,
    public var hInstance: Hinstance = null,
    public var pszTemplateName: Pcstr = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Acmformatchoosehookproca = null,
) {
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
}

public data class Acmformatchoosew(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pwfx: Waveformatex? = null,
    public var cbwfx: UInt = 0u,
    public var pszTitle: Pcwstr = null,
    public var szFormatTag: UShortArray = UShortArray(48),
    public var szFormat: UShortArray = UShortArray(128),
    public var pszName: Pwstr = null,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfxEnum: Waveformatex? = null,
    public var hInstance: Hinstance = null,
    public var pszTemplateName: Pcwstr = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Acmformatchoosehookprocw = null,
) {
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
}

public data class Acmformatdetailsa(
    public var cbStruct: UInt = 0u,
    public var dwFormatIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfx: Waveformatex? = null,
    public var cbwfx: UInt = 0u,
    public var szFormat: ByteArray = ByteArray(128),
) {
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
}

public data class Acmstreamheader(
    public var cbStruct: UInt = 0u,
    public var fdwStatus: UInt = 0u,
    public var dwUser: Int = 0,
    public var pbSrc: COpaquePointer? = null,
    public var cbSrcLength: UInt = 0u,
    public var cbSrcLengthUsed: UInt = 0u,
    public var dwSrcUser: Int = 0,
    public var pbDst: COpaquePointer? = null,
    public var cbDstLength: UInt = 0u,
    public var cbDstLengthUsed: UInt = 0u,
    public var dwDstUser: Int = 0,
    public var dwReservedDriver: UIntArray = UIntArray(15),
) {
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
}

public data class AmbisonicsParams(
    public var u32Size: UInt = 0u,
    public var u32Version: UInt = 0u,
    public var u32Type: AmbisonicsType = 0,
    public var u32ChannelOrdering: AmbisonicsChannelOrdering = 0,
    public var u32Normalization: AmbisonicsNormalization = 0,
    public var u32Order: UInt = 0u,
    public var u32NumChannels: UInt = 0u,
    public var pu32ChannelMap: UInt? = null,
)

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
)

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
}

public data class AudioClient3ActivationParams(
    public var tracingContextId: Guid = Guid(),
)

public data class AudioClientProperties(
    public var cbSize: UInt = 0u,
    public var bIsOffload: Bool = 0,
    public var eCategory: AudioStreamCategory = 0,
    public var options: AudclntStreamoptions = 0,
)

public data class AudioExtensionParams(
    public var addPageParam: Lparam = 0L,
    public var pEndpoint: COpaquePointer? = null,
    public var pPnpInterface: COpaquePointer? = null,
    public var pPnpDevnode: COpaquePointer? = null,
)

public data class ConnectorType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
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
)

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
}

public data class Midihdr(
    public var lpData: Pstr = null,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesRecorded: UInt = 0u,
    public var dwUser: Int = 0,
    public var dwFlags: UInt = 0u,
    public var lpNext: Midihdr? = null,
    public var reserved: Int = 0,
    public var dwOffset: UInt = 0u,
    public var dwReserved: IntArray = IntArray(8),
) {
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
}

public data class Midiproptempo(
    public var cbStruct: UInt = 0u,
    public var dwTempo: UInt = 0u,
)

public data class Midiproptimediv(
    public var cbStruct: UInt = 0u,
    public var dwTimeDiv: UInt = 0u,
)

public data class Midistrmbuffver(
    public var dwVersion: UInt = 0u,
    public var dwMid: UInt = 0u,
    public var dwOEMVersion: UInt = 0u,
)

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
)

public data class Mixercontrola01(
    public var dwMinimum: UInt = 0u,
    public var dwMaximum: UInt = 0u,
)

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

public data class Mixercontroldetails(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var cChannels: UInt = 0u,
    public var anonymous: Mixercontroldetails0 = Mixercontroldetails0(),
    public var cbDetails: UInt = 0u,
    public var paDetails: COpaquePointer? = null,
)

public data class Mixercontroldetails0(
    public var hwndOwner: Hwnd = null,
    public var cMultipleItems: UInt = 0u,
)

public data class MixercontroldetailsBoolean(
    public var fValue: Int = 0,
)

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
}

public data class MixercontroldetailsSigned(
    public var lValue: Int = 0,
)

public data class MixercontroldetailsUnsigned(
    public var dwValue: UInt = 0u,
)

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
)

public data class Mixercontrolw01(
    public var dwMinimum: UInt = 0u,
    public var dwMaximum: UInt = 0u,
)

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
}

public data class Mixerlinecontrolsa(
    public var cbStruct: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var anonymous: Mixerlinecontrolsa0 = Mixerlinecontrolsa0(),
    public var cControls: UInt = 0u,
    public var cbmxctrl: UInt = 0u,
    public var pamxctrl: Mixercontrola? = null,
)

public data class Mixerlinecontrolsa0(
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
)

public data class Mixerlinecontrolsw(
    public var cbStruct: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var anonymous: Mixerlinecontrolsw0 = Mixerlinecontrolsw0(),
    public var cControls: UInt = 0u,
    public var cbmxctrl: UInt = 0u,
    public var pamxctrl: Mixercontrolw? = null,
)

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
}

public data class Pcmwaveformat(
    public var wf: Waveformat = Waveformat(),
    public var wBitsPerSample: UShort = 0u,
)

public data class SpatialAudioClientActivationParams(
    public var tracingContextId: Guid = Guid(),
    public var appId: Guid = Guid(),
    public var majorVersion: Int = 0,
    public var minorVersion1: Int = 0,
    public var minorVersion2: Int = 0,
    public var minorVersion3: Int = 0,
)

public data class SpatialAudioHrtfActivationParams(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var notifyObject: COpaquePointer? = null,
    public var distanceDecay: SpatialAudioHrtfDistanceDecay? = null,
    public var directivity: SpatialAudioHrtfDirectivityUnion? = null,
    public var environment: Int? = null,
    public var orientation: Float? = null,
)

public data class SpatialAudioHrtfActivationParams2(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var notifyObject: COpaquePointer? = null,
    public var distanceDecay: SpatialAudioHrtfDistanceDecay? = null,
    public var directivity: SpatialAudioHrtfDirectivityUnion? = null,
    public var environment: Int? = null,
    public var orientation: Float? = null,
    public var options: SpatialAudioStreamOptions = 0,
)

public data class SpatialAudioHrtfDirectivity(
    public var type: SpatialAudioHrtfDirectivityType = 0,
    public var scaling: Float = 0.0f,
)

public data class SpatialAudioHrtfDirectivityCardioid(
    public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
    public var order: Float = 0.0f,
)

public data class SpatialAudioHrtfDirectivityCone(
    public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
    public var innerAngle: Float = 0.0f,
    public var outerAngle: Float = 0.0f,
)

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
)

public data class SpatialAudioMetadataItemsInfo(
    public var frameCount: UShort = 0u,
    public var itemCount: UShort = 0u,
    public var maxItemCount: UShort = 0u,
    public var maxValueBufferLength: UInt = 0u,
)

public data class SpatialAudioObjectRenderStreamActivationParams(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var notifyObject: COpaquePointer? = null,
)

public data class SpatialAudioObjectRenderStreamActivationParams2(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var notifyObject: COpaquePointer? = null,
    public var options: SpatialAudioStreamOptions = 0,
)

public data class SpatialAudioObjectRenderStreamForMetadataActivationParams(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var metadataFormatId: Guid = Guid(),
    public var maxMetadataItemCount: UShort = 0u,
    public var metadataActivationParams: Propvariant? = null,
    public var notifyObject: COpaquePointer? = null,
)

public data class SpatialAudioObjectRenderStreamForMetadataActivationParams2(
    public var objectFormat: Waveformatex? = null,
    public var staticObjectTypeMask: AudioObjectType = 0,
    public var minDynamicObjectCount: UInt = 0u,
    public var maxDynamicObjectCount: UInt = 0u,
    public var category: AudioStreamCategory = 0,
    public var eventHandle: Handle = null,
    public var metadataFormatId: Guid = Guid(),
    public var maxMetadataItemCount: UInt = 0u,
    public var metadataActivationParams: Propvariant? = null,
    public var notifyObject: COpaquePointer? = null,
    public var options: SpatialAudioStreamOptions = 0,
)

public data class Volumewavefilter(
    public var wfltr: Wavefilter = Wavefilter(),
    public var dwVolume: UInt = 0u,
)

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
}

public data class Waveformat(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
)

public data class Waveformatex(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
    public var wBitsPerSample: UShort = 0u,
    public var cbSize: UShort = 0u,
)

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

public data class Wavehdr(
    public var lpData: Pstr = null,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesRecorded: UInt = 0u,
    public var dwUser: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwLoops: UInt = 0u,
    public var lpNext: Wavehdr? = null,
    public var reserved: Int = 0,
)

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
}

public data class TAcmformatdetailsw(
    public var cbStruct: UInt = 0u,
    public var dwFormatIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfx: Waveformatex? = null,
    public var cbwfx: UInt = 0u,
    public var szFormat: UShortArray = UShortArray(128),
) {
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
}
