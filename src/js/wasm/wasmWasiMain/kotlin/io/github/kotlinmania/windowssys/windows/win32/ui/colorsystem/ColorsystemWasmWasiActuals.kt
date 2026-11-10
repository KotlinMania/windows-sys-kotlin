@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lparesult: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: COpaquePointer?, lparesult: COpaquePointer?, ncount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: COpaquePointer?, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateDeviceLinkProfile(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt, lpprofiledata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateProfile(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateProfileW(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateTransform(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateTransformExt(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateTransformExtW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMCreateTransformW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: COpaquePointer?, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paresult: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: COpaquePointer?, dlpbuffer: COpaquePointer?, ncount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeColorProfile(hprofile: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun convertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createColorSpaceA(lplcs: COpaquePointer?): Hcolorspace =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createColorSpaceW(lplcs: COpaquePointer?): Hcolorspace =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createColorTransformA(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createColorTransformW(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDeviceLinkProfile(hprofile: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, pprofiledata: COpaquePointer?, indexpreferredcmm: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteColorTransform(hxform: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?, pbreference: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: COpaquePointer?, pcbprofile: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getICMProfileA(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getICMProfileW(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: COpaquePointer?, pcbps2colorrenderingdictionary: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: COpaquePointer?, pcbps2colorrenderingintent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: COpaquePointer?, pcbps2colorspacearray: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isColorProfileValid(hprofile: Long, pbvalid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openColorProfileA(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openColorProfileW(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupColorMatchingA(pcms: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupColorMatchingW(pcms: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, paresult: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pbuffer: COpaquePointer?, dwsize: UInt, pnprofiles: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pdwsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsGetCalibrationManagementState(pbisenabled: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsOpenColorProfileA(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsOpenColorProfileW(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
