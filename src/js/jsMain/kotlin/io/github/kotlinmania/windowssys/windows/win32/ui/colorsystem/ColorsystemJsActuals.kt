@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE

private val _windowsWin32UiColorsystemNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA(pmachinename.toString(), pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW(pmachinename.toString(), pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCheckColors(hcmtransform.toString(), lpainputcolors.toString(), ncolors.toInt(), ctinput, lparesult.toString()) as Int) else 0

public actual fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut(hcmtransform.toString(), lpargbtriple.toString(), lparesult.toString(), ncount.toInt()) as Int) else 0

public actual fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCheckRGBs(hcmtransform.toString(), lpsrcbits.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lparesult.toString(), pfncallback.toLong().toString(), ulcallbackdata.toString()) as Int) else 0

public actual fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex(hprofile.toString(), pacolorname.toString(), paindex.toString(), dwcount.toInt()) as Int) else 0

public actual fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName(hprofile.toString(), paindex.toString(), pacolorname.toString(), dwcount.toInt()) as Int) else 0

public actual fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile(pahprofiles.toString(), nprofiles.toInt(), padwintents.toString(), nintents.toInt(), dwflags.toInt(), lpprofiledata.toString()) as Int) else 0

public actual fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform(pahprofiles.toString(), nprofiles.toInt(), padwintents.toString(), nintents.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateProfile(lpcolorspace.toString(), lpprofiledata.toString()) as Int) else 0

public actual fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateProfileW(lpcolorspace.toString(), lpprofiledata.toString()) as Int) else 0

public actual fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateTransform(lpcolorspace.toString(), lpdevcharacter.toString(), lptargetdevcharacter.toString()) as String).toLong() else 0L

public actual fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt(lpcolorspace.toString(), lpdevcharacter.toString(), lptargetdevcharacter.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW(lpcolorspace.toString(), lpdevcharacter.toString(), lptargetdevcharacter.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMCreateTransformW(lpcolorspace.toString(), lpdevcharacter.toString(), lptargetdevcharacter.toString()) as String).toLong() else 0L

public actual fun CMDeleteTransform(hcmtransform: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMDeleteTransform(hcmtransform.toString()) as Int) else 0

public actual fun CMGetInfo(dwinfo: UInt): UInt =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMGetInfo(dwinfo.toInt()) as Int).toUInt() else 0u

public actual fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.toString()) as Int) else 0

public actual fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMIsProfileValid(hprofile.toString(), lpbvalid.toString()) as Int) else 0

public actual fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMTranslateColors(hcmtransform.toString(), lpainputcolors.toString(), ncolors.toInt(), ctinput, lpaoutputcolors.toString(), ctoutput) as Int) else 0

public actual fun CMTranslateRGB(hcmtransform: Long, colorref: COLORREF, lpcolorref: Long, dwflags: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMTranslateRGB(hcmtransform.toString(), colorref.toInt(), lpcolorref.toString(), dwflags.toInt()) as Int) else 0

public actual fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs(hcmtransform.toString(), lpsrcbits.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lpdestbits.toString(), bmoutput, dwtranslatedirection.toInt()) as Int) else 0

public actual fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt(hcmtransform.toString(), lpsrcbits.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), lpdestbits.toString(), bmoutput, dwoutputstride.toInt(), lpfncallback.toLong().toString(), ulcallbackdata.toString()) as Int) else 0

public actual fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: LPARAM): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CheckBitmapBits(hcolortransform.toString(), psrcbits.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), paresult.toString(), pfncallback.toLong().toString(), lpcallbackdata.toString()) as Int) else 0

public actual fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CheckColors(hcolortransform.toString(), painputcolors.toString(), ncolors.toInt(), ctinput, paresult.toString()) as Int) else 0

public actual fun CheckColorsInGamut(hdc: HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut(hdc.toString(), lprgbtriple.toString(), dlpbuffer.toString(), ncount.toInt()) as Int) else 0

public actual fun CloseColorProfile(hprofile: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CloseColorProfile(hprofile.toString()) as Int) else 0

public actual fun ColorCorrectPalette(hdc: HDC, hpal: HPALETTE, defirst: UInt, num: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette(hdc.toString(), hpal.toString(), defirst.toInt(), num.toInt()) as Int) else 0

public actual fun ColorMatchToTarget(hdc: HDC, hdctarget: HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget(hdc.toString(), hdctarget.toString(), action.toInt()) as Int) else 0

public actual fun ColorProfileAddDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: LUID, sourceid: UInt, setasdefault: BOOL, associateasadvancedcolor: BOOL): HRESULT =
    0

public actual fun ColorProfileGetDisplayDefault(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: LUID, sourceid: UInt, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, profilename: Long): HRESULT =
    0

public actual fun ColorProfileGetDisplayList(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: LUID, sourceid: UInt, profilelist: Long, profilecount: Long): HRESULT =
    0

public actual fun ColorProfileGetDisplayUserScope(targetadapterid: LUID, sourceid: UInt, scope: Long): HRESULT =
    0

public actual fun ColorProfileRemoveDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: LUID, sourceid: UInt, dissociateadvancedcolor: BOOL): HRESULT =
    0

public actual fun ColorProfileSetDisplayDefaultAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, targetadapterid: LUID, sourceid: UInt): HRESULT =
    0

public actual fun ConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex(hprofile.toString(), pacolorname.toString(), paindex.toString(), dwcount.toInt()) as Int) else 0

public actual fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName(hprofile.toString(), paindex.toString(), pacolorname.toString(), dwcount.toInt()) as Int) else 0

public actual fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA(lplcs.toString()) as String).toLong() else 0L

public actual fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW(lplcs.toString()) as String).toLong() else 0L

public actual fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateColorTransformA(plogcolorspace.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateColorTransformW(plogcolorspace.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile(hprofile.toString(), nprofiles.toInt(), padwintent.toString(), nintents.toInt(), dwflags.toInt(), pprofiledata.toString(), indexpreferredcmm.toInt()) as Int) else 0

public actual fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform(pahprofiles.toString(), nprofiles.toInt(), padwintent.toString(), nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt()) as String).toLong() else 0L

public actual fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA(plogcolorspace.toString(), pprofile.toString()) as Int) else 0

public actual fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW(plogcolorspace.toString(), pprofile.toString()) as Int) else 0

public actual fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_DeleteColorSpace(hcs.toString()) as Int) else 0

public actual fun DeleteColorTransform(hxform: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_DeleteColorTransform(hxform.toString()) as Int) else 0

public actual fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA(pmachinename.toString(), pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW(pmachinename.toString(), pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA(pmachinename.toString(), penumrecord.toString(), penumerationbuffer.toString(), pdwsizeofenumerationbuffer.toString(), pnprofiles.toString()) as Int) else 0

public actual fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW(pmachinename.toString(), penumrecord.toString(), penumerationbuffer.toString(), pdwsizeofenumerationbuffer.toString(), pnprofiles.toString()) as Int) else 0

public actual fun EnumICMProfilesA(hdc: HDC, proc: ICMENUMPROCA, param2: LPARAM): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA(hdc.toString(), proc.toLong().toString(), param2.toString()) as Int) else 0

public actual fun EnumICMProfilesW(hdc: HDC, proc: ICMENUMPROCW, param2: LPARAM): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW(hdc.toString(), proc.toLong().toString(), param2.toString()) as Int) else 0

public actual fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetCMMInfo(hcolortransform.toString(), param1.toInt()) as Int).toUInt() else 0u

public actual fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA(pmachinename.toString(), pbuffer.toString(), pdwsize.toString()) as Int) else 0

public actual fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW(pmachinename.toString(), pbuffer.toString(), pdwsize.toString()) as Int) else 0

public actual fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.toString(), pelement.toString(), pbreference.toString()) as Int) else 0

public actual fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag(hprofile.toString(), dwindex.toInt(), ptag.toString()) as Int) else 0

public actual fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle(hprofile.toString(), pprofile.toString(), pcbprofile.toString()) as Int) else 0

public actual fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader(hprofile.toString(), pheader.toString()) as Int) else 0

public actual fun GetColorSpace(hdc: HDC): HCOLORSPACE =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetColorSpace(hdc.toString()) as String).toLong() else 0L

public actual fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements(hprofile.toString(), pnelementcount.toString()) as Int) else 0

public actual fun GetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp(hdc.toString(), lpramp.toString()) as Int) else 0

public actual fun GetICMProfileA(hdc: HDC, pbufsize: Long, pszfilename: PSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetICMProfileA(hdc.toString(), pbufsize.toString(), pszfilename.toString()) as Int) else 0

public actual fun GetICMProfileW(hdc: HDC, pbufsize: Long, pszfilename: PWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetICMProfileW(hdc.toString(), pbufsize.toString(), pszfilename.toString()) as Int) else 0

public actual fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA(hcolorspace.toString(), lpbuffer.toString(), nsize.toInt()) as Int) else 0

public actual fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW(hcolorspace.toString(), lpbuffer.toString(), nsize.toInt()) as Int) else 0

public actual fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.toString()) as Int) else 0

public actual fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary(hprofile.toString(), dwintent.toInt(), pps2colorrenderingdictionary.toString(), pcbps2colorrenderingdictionary.toString(), pbbinary.toString()) as Int) else 0

public actual fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent(hprofile.toString(), dwintent.toInt(), pbuffer.toString(), pcbps2colorrenderingintent.toString()) as Int) else 0

public actual fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray(hprofile.toString(), dwintent.toInt(), dwcsatype.toInt(), pps2colorspacearray.toString(), pcbps2colorspacearray.toString(), pbbinary.toString()) as Int) else 0

public actual fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA(pmachinename.toString(), dwscs.toInt(), pbuffer.toString(), pcbsize.toString()) as Int) else 0

public actual fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW(pmachinename.toString(), dwscs.toInt(), pbuffer.toString(), pcbsize.toString()) as Int) else 0

public actual fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_InstallColorProfileA(pmachinename.toString(), pprofilename.toString()) as Int) else 0

public actual fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_InstallColorProfileW(pmachinename.toString(), pprofilename.toString()) as Int) else 0

public actual fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent(hprofile.toString(), tag.toInt(), pbpresent.toString()) as Int) else 0

public actual fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_IsColorProfileValid(hprofile.toString(), pbvalid.toString()) as Int) else 0

public actual fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_OpenColorProfileA(pprofile.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else 0L

public actual fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_OpenColorProfileW(pprofile.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else 0L

public actual fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_RegisterCMMA(pmachinename.toString(), cmmid.toInt(), pcmmdll.toString()) as Int) else 0

public actual fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_RegisterCMMW(pmachinename.toString(), cmmid.toInt(), pcmmdll.toString()) as Int) else 0

public actual fun SelectCMM(dwcmmtype: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SelectCMM(dwcmmtype.toInt()) as Int) else 0

public actual fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.toString(), pelement.toString()) as Int) else 0

public actual fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference(hprofile.toString(), newtag.toInt(), reftag.toInt()) as Int) else 0

public actual fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize(hprofile.toString(), tagtype.toInt(), pcbelement.toInt()) as Int) else 0

public actual fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader(hprofile.toString(), pheader.toString()) as Int) else 0

public actual fun SetColorSpace(hdc: HDC, hcs: HCOLORSPACE): HCOLORSPACE =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetColorSpace(hdc.toString(), hcs.toString()) as String).toLong() else 0L

public actual fun SetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp(hdc.toString(), lpramp.toString()) as Int) else 0

public actual fun SetICMMode(hdc: HDC, mode: ICM_MODE): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetICMMode(hdc.toString(), mode) as Int) else 0

public actual fun SetICMProfileA(hdc: HDC, lpfilename: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetICMProfileA(hdc.toString(), lpfilename.toString()) as Int) else 0

public actual fun SetICMProfileW(hdc: HDC, lpfilename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetICMProfileW(hdc.toString(), lpfilename.toString()) as Int) else 0

public actual fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA(pmachinename.toString(), dwprofileid.toInt(), pprofilename.toString()) as Int) else 0

public actual fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW(pmachinename.toString(), dwprofileid.toInt(), pprofilename.toString()) as Int) else 0

public actual fun SetupColorMatchingA(pcms: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA(pcms.toString()) as Int) else 0

public actual fun SetupColorMatchingW(pcms: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW(pcms.toString()) as Int) else 0

public actual fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits(hcolortransform.toString(), psrcbits.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), pdestbits.toString(), bmoutput, dwoutputstride.toInt(), pfncallback.toLong().toString(), ulcallbackdata.toString()) as Int) else 0

public actual fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_TranslateColors(hcolortransform.toString(), painputcolors.toString(), ncolors.toInt(), ctinput, paoutputcolors.toString(), ctoutput) as Int) else 0

public actual fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA(pmachinename.toString(), pprofilename.toString(), bdelete) as Int) else 0

public actual fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW(pmachinename.toString(), pprofilename.toString(), bdelete) as Int) else 0

public actual fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UnregisterCMMA(pmachinename.toString(), cmmid.toInt()) as Int) else 0

public actual fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UnregisterCMMW(pmachinename.toString(), cmmid.toInt()) as Int) else 0

public actual fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA(reserved.toInt(), lpszcmid.toString(), lpszfilename.toString(), command.toInt()) as Int) else 0

public actual fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW(reserved.toInt(), lpszcmid.toString(), lpszfilename.toString(), command.toInt()) as Int) else 0

public actual fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice(scope, pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsCheckColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.toString(), paresult.toString()) as Int) else 0

public actual fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile(hwcsprofile.toString(), dwoptions.toInt()) as String).toLong() else 0L

public actual fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice(scope, pprofilename.toString(), pdevicename.toString()) as Int) else 0

public actual fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles(scope, penumrecord.toString(), pbuffer.toString(), dwsize.toInt(), pnprofiles.toString()) as Int) else 0

public actual fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize(scope, penumrecord.toString(), pdwsize.toString()) as Int) else 0

public actual fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState(pbisenabled.toString()) as Int) else 0

public actual fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile(scope, pdevicename.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), pprofilename.toString()) as Int) else 0

public actual fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize(scope, pdevicename.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pcbprofilename.toString()) as Int) else 0

public actual fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent(scope, pdwrenderingintent.toString()) as Int) else 0

public actual fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles(pdevicename.toString(), dwdeviceclass.toInt(), puseperuserprofiles.toString()) as Int) else 0

public actual fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA(pcdmpprofile.toString(), pcampprofile.toString(), pgmmpprofile.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW(pcdmpprofile.toString(), pcampprofile.toString(), pgmmpprofile.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState(bisenabled) as Int) else 0

public actual fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile(scope, pdevicename.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pprofilename.toString()) as Int) else 0

public actual fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt()) as Int) else 0

public actual fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles(pdevicename.toString(), dwdeviceclass.toInt(), useperuserprofiles) as Int) else 0

public actual fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_WcsTranslateColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.toString(), noutputchannels.toInt(), cdtoutput, cboutput.toInt(), poutputdata.toString()) as Int) else 0
