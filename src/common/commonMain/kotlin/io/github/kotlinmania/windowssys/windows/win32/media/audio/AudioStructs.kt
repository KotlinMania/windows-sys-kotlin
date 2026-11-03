@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ACMDRIVERDETAILSA(
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
    public var hicon: UI.WindowsAndMessaging.HICON = UI.WindowsAndMessaging.HICON(),
    public var szShortName: ByteArray = ByteArray(32),
    public var szLongName: ByteArray = ByteArray(128),
    public var szCopyright: ByteArray = ByteArray(80),
    public var szLicensing: ByteArray = ByteArray(128),
    public var szFeatures: ByteArray = ByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMDRIVERDETAILSA) return false
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

public data class ACMDRIVERDETAILSW(
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
    public var hicon: UI.WindowsAndMessaging.HICON = UI.WindowsAndMessaging.HICON(),
    public var szShortName: UShortArray = UShortArray(32),
    public var szLongName: UShortArray = UShortArray(128),
    public var szCopyright: UShortArray = UShortArray(80),
    public var szLicensing: UShortArray = UShortArray(128),
    public var szFeatures: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMDRIVERDETAILSW) return false
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

public data class ACMDRVFORMATSUGGEST(
    public var cbStruct: UInt = 0u,
    public var fdwSuggest: UInt = 0u,
    public var pwfxSrc: Long = 0L,
    public var cbwfxSrc: UInt = 0u,
    public var pwfxDst: Long = 0L,
    public var cbwfxDst: UInt = 0u,
)

public data class ACMDRVOPENDESCA(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pszSectionName: PCSTR = 0L,
    public var pszAliasName: PCSTR = 0L,
    public var dnDevNode: UInt = 0u,
)

public data class ACMDRVOPENDESCW(
    public var cbStruct: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccComp: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pszSectionName: PCWSTR = 0L,
    public var pszAliasName: PCWSTR = 0L,
    public var dnDevNode: UInt = 0u,
)

public class ACMDRVSTREAMHEADER(
    public var cbStruct: UInt = 0u,
    public var fdwStatus: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var pbSrc: Long = 0L,
    public var cbSrcLength: UInt = 0u,
    public var cbSrcLengthUsed: UInt = 0u,
    public var dwSrcUser: ULong = 0uL,
    public var pbDst: Long = 0L,
    public var cbDstLength: UInt = 0u,
    public var cbDstLengthUsed: UInt = 0u,
    public var dwDstUser: ULong = 0uL,
    public var fdwConvert: UInt = 0u,
    public var padshNext: Long = 0L,
    public var fdwDriver: UInt = 0u,
    public var dwDriver: ULong = 0uL,
    public var fdwPrepared: UInt = 0u,
    public var dwPrepared: ULong = 0uL,
    public var pbPreparedSrc: Long = 0L,
    public var cbPreparedSrcLength: UInt = 0u,
    public var pbPreparedDst: Long = 0L,
    public var cbPreparedDstLength: UInt = 0u,
)

public data class ACMDRVSTREAMINSTANCE(
    public var cbStruct: UInt = 0u,
    public var pwfxSrc: Long = 0L,
    public var pwfxDst: Long = 0L,
    public var pwfltr: Long = 0L,
    public var dwCallback: ULong = 0uL,
    public var dwInstance: ULong = 0uL,
    public var fdwOpen: UInt = 0u,
    public var fdwDriver: UInt = 0u,
    public var dwDriver: ULong = 0uL,
    public var has: HACMSTREAM = 0L,
)

public data class ACMDRVSTREAMSIZE(
    public var cbStruct: UInt = 0u,
    public var fdwSize: UInt = 0u,
    public var cbSrcLength: UInt = 0u,
    public var cbDstLength: UInt = 0u,
)

public data class ACMFILTERCHOOSEA(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pwfltr: Long = 0L,
    public var cbwfltr: UInt = 0u,
    public var pszTitle: PCSTR = 0L,
    public var szFilterTag: ByteArray = ByteArray(48),
    public var szFilter: ByteArray = ByteArray(128),
    public var pszName: PSTR = 0L,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfltrEnum: Long = 0L,
    public var hInstance: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var pszTemplateName: PCSTR = 0L,
    public var lCustData: Foundation.LPARAM = Foundation.LPARAM(),
    public var pfnHook: ACMFILTERCHOOSEHOOKPROCA = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFILTERCHOOSEA) return false
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

public data class ACMFILTERCHOOSEW(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pwfltr: Long = 0L,
    public var cbwfltr: UInt = 0u,
    public var pszTitle: PCWSTR = 0L,
    public var szFilterTag: UShortArray = UShortArray(48),
    public var szFilter: UShortArray = UShortArray(128),
    public var pszName: PWSTR = 0L,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfltrEnum: Long = 0L,
    public var hInstance: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var pszTemplateName: PCWSTR = 0L,
    public var lCustData: Foundation.LPARAM = Foundation.LPARAM(),
    public var pfnHook: ACMFILTERCHOOSEHOOKPROCW = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFILTERCHOOSEW) return false
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

public data class ACMFILTERDETAILSA(
    public var cbStruct: UInt = 0u,
    public var dwFilterIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfltr: Long = 0L,
    public var cbwfltr: UInt = 0u,
    public var szFilter: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFILTERDETAILSA) return false
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

public data class ACMFILTERDETAILSW(
    public var cbStruct: UInt = 0u,
    public var dwFilterIndex: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfltr: Long = 0L,
    public var cbwfltr: UInt = 0u,
    public var szFilter: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFILTERDETAILSW) return false
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

public data class ACMFILTERTAGDETAILSA(
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
        if (other !is ACMFILTERTAGDETAILSA) return false
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

public data class ACMFILTERTAGDETAILSW(
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
        if (other !is ACMFILTERTAGDETAILSW) return false
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

public data class ACMFORMATCHOOSEA(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pwfx: Long = 0L,
    public var cbwfx: UInt = 0u,
    public var pszTitle: PCSTR = 0L,
    public var szFormatTag: ByteArray = ByteArray(48),
    public var szFormat: ByteArray = ByteArray(128),
    public var pszName: PSTR = 0L,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfxEnum: Long = 0L,
    public var hInstance: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var pszTemplateName: PCSTR = 0L,
    public var lCustData: Foundation.LPARAM = Foundation.LPARAM(),
    public var pfnHook: ACMFORMATCHOOSEHOOKPROCA = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFORMATCHOOSEA) return false
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

public data class ACMFORMATCHOOSEW(
    public var cbStruct: UInt = 0u,
    public var fdwStyle: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pwfx: Long = 0L,
    public var cbwfx: UInt = 0u,
    public var pszTitle: PCWSTR = 0L,
    public var szFormatTag: UShortArray = UShortArray(48),
    public var szFormat: UShortArray = UShortArray(128),
    public var pszName: PWSTR = 0L,
    public var cchName: UInt = 0u,
    public var fdwEnum: UInt = 0u,
    public var pwfxEnum: Long = 0L,
    public var hInstance: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var pszTemplateName: PCWSTR = 0L,
    public var lCustData: Foundation.LPARAM = Foundation.LPARAM(),
    public var pfnHook: ACMFORMATCHOOSEHOOKPROCW = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFORMATCHOOSEW) return false
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

public data class ACMFORMATDETAILSA(
    public var cbStruct: UInt = 0u,
    public var dwFormatIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfx: Long = 0L,
    public var cbwfx: UInt = 0u,
    public var szFormat: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMFORMATDETAILSA) return false
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

public data class ACMFORMATTAGDETAILSA(
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
        if (other !is ACMFORMATTAGDETAILSA) return false
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

public data class ACMFORMATTAGDETAILSW(
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
        if (other !is ACMFORMATTAGDETAILSW) return false
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

public data class ACMSTREAMHEADER(
    public var cbStruct: UInt = 0u,
    public var fdwStatus: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var pbSrc: Long = 0L,
    public var cbSrcLength: UInt = 0u,
    public var cbSrcLengthUsed: UInt = 0u,
    public var dwSrcUser: ULong = 0uL,
    public var pbDst: Long = 0L,
    public var cbDstLength: UInt = 0u,
    public var cbDstLengthUsed: UInt = 0u,
    public var dwDstUser: ULong = 0uL,
    public var dwReservedDriver: UIntArray = UIntArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACMSTREAMHEADER) return false
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

public data class AMBISONICS_PARAMS(
    public var u32Size: UInt = 0u,
    public var u32Version: UInt = 0u,
    public var u32Type: AMBISONICS_TYPE = 0,
    public var u32ChannelOrdering: AMBISONICS_CHANNEL_ORDERING = 0,
    public var u32Normalization: AMBISONICS_NORMALIZATION = 0,
    public var u32Order: UInt = 0u,
    public var u32NumChannels: UInt = 0u,
    public var pu32ChannelMap: Long = 0L,
)

public data class AUDIOCLIENT_ACTIVATION_PARAMS(public var ActivationType: AUDIOCLIENT_ACTIVATION_TYPE = 0, public var Anonymous: AUDIOCLIENT_ACTIVATION_PARAMS_0 = AUDIOCLIENT_ACTIVATION_PARAMS_0())

public data class AUDIOCLIENT_ACTIVATION_PARAMS_0(public var ProcessLoopbackParams: AUDIOCLIENT_PROCESS_LOOPBACK_PARAMS = AUDIOCLIENT_PROCESS_LOOPBACK_PARAMS())

public data class AUDIOCLIENT_PROCESS_LOOPBACK_PARAMS(public var TargetProcessId: UInt = 0u, public var ProcessLoopbackMode: PROCESS_LOOPBACK_MODE = 0)

public data class AUDIO_EFFECT(
    public var id: GUID = GUID(),
    public var canSetState: BOOL = 0,
    public var state: AUDIO_EFFECT_STATE = 0,
)

public data class AUDIO_VOLUME_NOTIFICATION_DATA(
    public var guidEventContext: GUID = GUID(),
    public var bMuted: BOOL = 0,
    public var fMasterVolume: Float = 0.0f,
    public var nChannels: UInt = 0u,
    public var afChannelVolumes: FloatArray = FloatArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUDIO_VOLUME_NOTIFICATION_DATA) return false
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

public data class AUXCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUXCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class AUXCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUXCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class AUXCAPSA(
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
        if (other !is AUXCAPSA) return false
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

public data class AUXCAPSW(
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
        if (other !is AUXCAPSW) return false
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

public data class AudioClient3ActivationParams(public var tracingContextId: GUID = GUID())

public data class AudioClientProperties(
    public var cbSize: UInt = 0u,
    public var bIsOffload: BOOL = 0,
    public var eCategory: AUDIO_STREAM_CATEGORY = 0,
    public var Options: AUDCLNT_STREAMOPTIONS = 0,
)

public data class AudioExtensionParams(
    public var AddPageParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var pEndpoint: Long = 0L,
    public var pPnpInterface: Long = 0L,
    public var pPnpDevnode: Long = 0L,
)

public data class ConnectorType(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Unknown_Connector: ConnectorType = ConnectorType(0)

        public val Physical_Internal: ConnectorType = ConnectorType(1)

        public val Physical_External: ConnectorType = ConnectorType(2)

        public val Software_IO: ConnectorType = ConnectorType(3)

        public val Software_Fixed: ConnectorType = ConnectorType(4)

        public val Network: ConnectorType = ConnectorType(5)
    }
}

public data class DIRECTX_AUDIO_ACTIVATION_PARAMS(
    public var cbDirectXAudioActivationParams: UInt = 0u,
    public var guidAudioSession: GUID = GUID(),
    public var dwAudioStreamFlags: UInt = 0u,
)

public data class ECHOWAVEFILTER(
    public var wfltr: WAVEFILTER = WAVEFILTER(),
    public var dwVolume: UInt = 0u,
    public var dwDelay: UInt = 0u,
)

public data class MIDIEVENT(
    public var dwDeltaTime: UInt = 0u,
    public var dwStreamID: UInt = 0u,
    public var dwEvent: UInt = 0u,
    public var dwParms: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIEVENT) return false
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

public data class MIDIHDR(
    public var lpData: PSTR = 0L,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesRecorded: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var lpNext: Long = 0L,
    public var reserved: ULong = 0uL,
    public var dwOffset: UInt = 0u,
    public var dwReserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIHDR) return false
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

public data class MIDIINCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIINCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIDIINCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIINCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.dwSupport.hashCode()
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIDIINCAPSA(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIINCAPSA) return false
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

public data class MIDIINCAPSW(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwSupport: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIINCAPSW) return false
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

public data class MIDIOUTCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIOUTCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIDIOUTCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wTechnology: UShort = 0u,
    public var wVoices: UShort = 0u,
    public var wNotes: UShort = 0u,
    public var wChannelMask: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDIOUTCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.wTechnology != other.wTechnology) return false
        if (this.wVoices != other.wVoices) return false
        if (this.wNotes != other.wNotes) return false
        if (this.wChannelMask != other.wChannelMask) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIDIOUTCAPSA(
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
        if (other !is MIDIOUTCAPSA) return false
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

public data class MIDIOUTCAPSW(
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
        if (other !is MIDIOUTCAPSW) return false
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

public data class MIDIPROPTEMPO(public var cbStruct: UInt = 0u, public var dwTempo: UInt = 0u)

public data class MIDIPROPTIMEDIV(public var cbStruct: UInt = 0u, public var dwTimeDiv: UInt = 0u)

public data class MIDISTRMBUFFVER(
    public var dwVersion: UInt = 0u,
    public var dwMid: UInt = 0u,
    public var dwOEMVersion: UInt = 0u,
)

public data class MIXERCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIXERCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.fdwSupport != other.fdwSupport) return false
        if (this.cDestinations != other.cDestinations) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wMid.hashCode()
        result = 31 * result + this.wPid.hashCode()
        result = 31 * result + this.vDriverVersion.hashCode()
        result = 31 * result + this.szPname.contentHashCode()
        result = 31 * result + this.fdwSupport.hashCode()
        result = 31 * result + this.cDestinations.hashCode()
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class MIXERCAPSA(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCAPSA) return false
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

public data class MIXERCAPSW(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var fdwSupport: UInt = 0u,
    public var cDestinations: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCAPSW) return false
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

public data class MIXERCONTROLA(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
    public var fdwControl: UInt = 0u,
    public var cMultipleItems: UInt = 0u,
    public var szShortName: ByteArray = ByteArray(16),
    public var szName: ByteArray = ByteArray(64),
    public var Bounds: MIXERCONTROLA_0 = MIXERCONTROLA_0(),
    public var Metrics: MIXERCONTROLA_1 = MIXERCONTROLA_1(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwControlID != other.dwControlID) return false
        if (this.dwControlType != other.dwControlType) return false
        if (this.fdwControl != other.fdwControl) return false
        if (this.cMultipleItems != other.cMultipleItems) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.Bounds != other.Bounds) return false
        if (this.Metrics != other.Metrics) return false
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
        result = 31 * result + this.Bounds.hashCode()
        result = 31 * result + this.Metrics.hashCode()
        return result
    }
}

public data class MIXERCONTROLA_0(
    public var Anonymous1: MIXERCONTROLA_0_0 = MIXERCONTROLA_0_0(),
    public var Anonymous2: MIXERCONTROLA_0_1 = MIXERCONTROLA_0_1(),
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLA_0) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class MIXERCONTROLA_0_0(public var lMinimum: Int = 0, public var lMaximum: Int = 0)

public data class MIXERCONTROLA_0_1(public var dwMinimum: UInt = 0u, public var dwMaximum: UInt = 0u)

public data class MIXERCONTROLA_1(
    public var cSteps: UInt = 0u,
    public var cbCustomData: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLA_1) return false
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

public data class MIXERCONTROLDETAILS(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var cChannels: UInt = 0u,
    public var Anonymous: MIXERCONTROLDETAILS_0 = MIXERCONTROLDETAILS_0(),
    public var cbDetails: UInt = 0u,
    public var paDetails: Long = 0L,
)

public data class MIXERCONTROLDETAILS_0(public var hwndOwner: Foundation.HWND = Foundation.HWND(), public var cMultipleItems: UInt = 0u)

public data class MIXERCONTROLDETAILS_BOOLEAN(public var fValue: Int = 0)

public data class MIXERCONTROLDETAILS_LISTTEXTA(
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLDETAILS_LISTTEXTA) return false
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

public data class MIXERCONTROLDETAILS_LISTTEXTW(
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLDETAILS_LISTTEXTW) return false
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

public data class MIXERCONTROLDETAILS_SIGNED(public var lValue: Int = 0)

public data class MIXERCONTROLDETAILS_UNSIGNED(public var dwValue: UInt = 0u)

public data class MIXERCONTROLW(
    public var cbStruct: UInt = 0u,
    public var dwControlID: UInt = 0u,
    public var dwControlType: UInt = 0u,
    public var fdwControl: UInt = 0u,
    public var cMultipleItems: UInt = 0u,
    public var szShortName: UShortArray = UShortArray(16),
    public var szName: UShortArray = UShortArray(64),
    public var Bounds: MIXERCONTROLW_0 = MIXERCONTROLW_0(),
    public var Metrics: MIXERCONTROLW_1 = MIXERCONTROLW_1(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwControlID != other.dwControlID) return false
        if (this.dwControlType != other.dwControlType) return false
        if (this.fdwControl != other.fdwControl) return false
        if (this.cMultipleItems != other.cMultipleItems) return false
        if (!this.szShortName.contentEquals(other.szShortName)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.Bounds != other.Bounds) return false
        if (this.Metrics != other.Metrics) return false
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
        result = 31 * result + this.Bounds.hashCode()
        result = 31 * result + this.Metrics.hashCode()
        return result
    }
}

public data class MIXERCONTROLW_0(
    public var Anonymous1: MIXERCONTROLW_0_0 = MIXERCONTROLW_0_0(),
    public var Anonymous2: MIXERCONTROLW_0_1 = MIXERCONTROLW_0_1(),
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLW_0) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class MIXERCONTROLW_0_0(public var lMinimum: Int = 0, public var lMaximum: Int = 0)

public data class MIXERCONTROLW_0_1(public var dwMinimum: UInt = 0u, public var dwMaximum: UInt = 0u)

public data class MIXERCONTROLW_1(
    public var cSteps: UInt = 0u,
    public var cbCustomData: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERCONTROLW_1) return false
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

public data class MIXERLINEA(
    public var cbStruct: UInt = 0u,
    public var dwDestination: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var fdwLine: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var dwComponentType: MIXERLINE_COMPONENTTYPE = 0u,
    public var cChannels: UInt = 0u,
    public var cConnections: UInt = 0u,
    public var cControls: UInt = 0u,
    public var szShortName: ByteArray = ByteArray(16),
    public var szName: ByteArray = ByteArray(64),
    public var Target: MIXERLINEA_0 = MIXERLINEA_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERLINEA) return false
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
        if (this.Target != other.Target) return false
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
        result = 31 * result + this.Target.hashCode()
        return result
    }
}

public data class MIXERLINEA_0(
    public var dwType: UInt = 0u,
    public var dwDeviceID: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERLINEA_0) return false
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

public data class MIXERLINECONTROLSA(
    public var cbStruct: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var Anonymous: MIXERLINECONTROLSA_0 = MIXERLINECONTROLSA_0(),
    public var cControls: UInt = 0u,
    public var cbmxctrl: UInt = 0u,
    public var pamxctrl: Long = 0L,
)

public data class MIXERLINECONTROLSA_0(public var dwControlID: UInt = 0u, public var dwControlType: UInt = 0u)

public data class MIXERLINECONTROLSW(
    public var cbStruct: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var Anonymous: MIXERLINECONTROLSW_0 = MIXERLINECONTROLSW_0(),
    public var cControls: UInt = 0u,
    public var cbmxctrl: UInt = 0u,
    public var pamxctrl: Long = 0L,
)

public data class MIXERLINECONTROLSW_0(public var dwControlID: UInt = 0u, public var dwControlType: UInt = 0u)

public data class MIXERLINEW(
    public var cbStruct: UInt = 0u,
    public var dwDestination: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwLineID: UInt = 0u,
    public var fdwLine: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var dwComponentType: MIXERLINE_COMPONENTTYPE = 0u,
    public var cChannels: UInt = 0u,
    public var cConnections: UInt = 0u,
    public var cControls: UInt = 0u,
    public var szShortName: UShortArray = UShortArray(16),
    public var szName: UShortArray = UShortArray(64),
    public var Target: MIXERLINEW_0 = MIXERLINEW_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERLINEW) return false
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
        if (this.Target != other.Target) return false
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
        result = 31 * result + this.Target.hashCode()
        return result
    }
}

public data class MIXERLINEW_0(
    public var dwType: UInt = 0u,
    public var dwDeviceID: UInt = 0u,
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIXERLINEW_0) return false
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

public data class PCMWAVEFORMAT(public var wf: WAVEFORMAT = WAVEFORMAT(), public var wBitsPerSample: UShort = 0u)

public data class SpatialAudioClientActivationParams(
    public var tracingContextId: GUID = GUID(),
    public var appId: GUID = GUID(),
    public var majorVersion: Int = 0,
    public var minorVersion1: Int = 0,
    public var minorVersion2: Int = 0,
    public var minorVersion3: Int = 0,
)

public data class SpatialAudioHrtfActivationParams(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var NotifyObject: Long = 0L,
    public var DistanceDecay: Long = 0L,
    public var Directivity: Long = 0L,
    public var Environment: Long = 0L,
    public var Orientation: Long = 0L,
)

public data class SpatialAudioHrtfActivationParams2(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var NotifyObject: Long = 0L,
    public var DistanceDecay: Long = 0L,
    public var Directivity: Long = 0L,
    public var Environment: Long = 0L,
    public var Orientation: Long = 0L,
    public var Options: SPATIAL_AUDIO_STREAM_OPTIONS = 0,
)

public data class SpatialAudioHrtfDirectivity(public var Type: SpatialAudioHrtfDirectivityType = 0, public var Scaling: Float = 0.0f)

public data class SpatialAudioHrtfDirectivityCardioid(public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(), public var Order: Float = 0.0f)

public data class SpatialAudioHrtfDirectivityCone(
    public var directivity: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
    public var InnerAngle: Float = 0.0f,
    public var OuterAngle: Float = 0.0f,
)

public data class SpatialAudioHrtfDirectivityUnion(
    public var Cone: SpatialAudioHrtfDirectivityCone = SpatialAudioHrtfDirectivityCone(),
    public var Cardiod: SpatialAudioHrtfDirectivityCardioid = SpatialAudioHrtfDirectivityCardioid(),
    public var Omni: SpatialAudioHrtfDirectivity = SpatialAudioHrtfDirectivity(),
)

public data class SpatialAudioHrtfDistanceDecay(
    public var Type: SpatialAudioHrtfDistanceDecayType = 0,
    public var MaxGain: Float = 0.0f,
    public var MinGain: Float = 0.0f,
    public var UnityGainDistance: Float = 0.0f,
    public var CutoffDistance: Float = 0.0f,
)

public data class SpatialAudioMetadataItemsInfo(
    public var FrameCount: UShort = 0u,
    public var ItemCount: UShort = 0u,
    public var MaxItemCount: UShort = 0u,
    public var MaxValueBufferLength: UInt = 0u,
)

public data class SpatialAudioObjectRenderStreamActivationParams(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var NotifyObject: Long = 0L,
)

public data class SpatialAudioObjectRenderStreamActivationParams2(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var NotifyObject: Long = 0L,
    public var Options: SPATIAL_AUDIO_STREAM_OPTIONS = 0,
)

public data class SpatialAudioObjectRenderStreamForMetadataActivationParams(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var MetadataFormatId: GUID = GUID(),
    public var MaxMetadataItemCount: UShort = 0u,
    public var MetadataActivationParams: Long = 0L,
    public var NotifyObject: Long = 0L,
)

public data class SpatialAudioObjectRenderStreamForMetadataActivationParams2(
    public var ObjectFormat: Long = 0L,
    public var StaticObjectTypeMask: AudioObjectType = 0,
    public var MinDynamicObjectCount: UInt = 0u,
    public var MaxDynamicObjectCount: UInt = 0u,
    public var Category: AUDIO_STREAM_CATEGORY = 0,
    public var EventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var MetadataFormatId: GUID = GUID(),
    public var MaxMetadataItemCount: UInt = 0u,
    public var MetadataActivationParams: Long = 0L,
    public var NotifyObject: Long = 0L,
    public var Options: SPATIAL_AUDIO_STREAM_OPTIONS = 0,
)

public data class VOLUMEWAVEFILTER(public var wfltr: WAVEFILTER = WAVEFILTER(), public var dwVolume: UInt = 0u)

public data class WAVEFILTER(
    public var cbStruct: UInt = 0u,
    public var dwFilterTag: UInt = 0u,
    public var fdwFilter: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAVEFILTER) return false
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

public data class WAVEFORMAT(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
)

public data class WAVEFORMATEX(
    public var wFormatTag: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
    public var wBitsPerSample: UShort = 0u,
    public var cbSize: UShort = 0u,
)

public data class WAVEFORMATEXTENSIBLE(
    public var Format: WAVEFORMATEX = WAVEFORMATEX(),
    public var Samples: WAVEFORMATEXTENSIBLE_0 = WAVEFORMATEXTENSIBLE_0(),
    public var dwChannelMask: UInt = 0u,
    public var SubFormat: GUID = GUID(),
)

public data class WAVEFORMATEXTENSIBLE_0(
    public var wValidBitsPerSample: UShort = 0u,
    public var wSamplesPerBlock: UShort = 0u,
    public var wReserved: UShort = 0u,
)

public data class WAVEHDR(
    public var lpData: PSTR = 0L,
    public var dwBufferLength: UInt = 0u,
    public var dwBytesRecorded: UInt = 0u,
    public var dwUser: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var dwLoops: UInt = 0u,
    public var lpNext: Long = 0L,
    public var reserved: ULong = 0uL,
)

public data class WAVEINCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAVEINCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class WAVEINCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAVEINCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class WAVEINCAPSA(
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
        if (other !is WAVEINCAPSA) return false
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

public data class WAVEINCAPSW(
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
        if (other !is WAVEINCAPSW) return false
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

public data class WAVEOUTCAPS2A(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAVEOUTCAPS2A) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class WAVEOUTCAPS2W(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var vDriverVersion: UInt = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var dwFormats: UInt = 0u,
    public var wChannels: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var dwSupport: UInt = 0u,
    public var ManufacturerGuid: GUID = GUID(),
    public var ProductGuid: GUID = GUID(),
    public var NameGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAVEOUTCAPS2W) return false
        if (this.wMid != other.wMid) return false
        if (this.wPid != other.wPid) return false
        if (this.vDriverVersion != other.vDriverVersion) return false
        if (!this.szPname.contentEquals(other.szPname)) return false
        if (this.dwFormats != other.dwFormats) return false
        if (this.wChannels != other.wChannels) return false
        if (this.wReserved1 != other.wReserved1) return false
        if (this.dwSupport != other.dwSupport) return false
        if (this.ManufacturerGuid != other.ManufacturerGuid) return false
        if (this.ProductGuid != other.ProductGuid) return false
        if (this.NameGuid != other.NameGuid) return false
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
        result = 31 * result + this.ManufacturerGuid.hashCode()
        result = 31 * result + this.ProductGuid.hashCode()
        result = 31 * result + this.NameGuid.hashCode()
        return result
    }
}

public data class WAVEOUTCAPSA(
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
        if (other !is WAVEOUTCAPSA) return false
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

public data class WAVEOUTCAPSW(
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
        if (other !is WAVEOUTCAPSW) return false
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

public data class tACMFORMATDETAILSW(
    public var cbStruct: UInt = 0u,
    public var dwFormatIndex: UInt = 0u,
    public var dwFormatTag: UInt = 0u,
    public var fdwSupport: UInt = 0u,
    public var pwfx: Long = 0L,
    public var cbwfx: UInt = 0u,
    public var szFormat: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is tACMFORMATDETAILSW) return false
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
