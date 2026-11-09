@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCheckColors(hcmtransform, lpainputcolors.toCPointer<ByteVar>(), ncolors, ctinput, lparesult.toCPointer<ByteVar>())

public actual fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut(hcmtransform, lpargbtriple.toCPointer<ByteVar>(), lparesult.toCPointer<ByteVar>(), ncount)

public actual fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCheckRGBs(hcmtransform, lpsrcbits.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lparesult.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), ulcallbackdata)

public actual fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex(hprofile, pacolorname.toCPointer<ByteVar>(), paindex.toCPointer<ByteVar>(), dwcount)

public actual fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName(hprofile, paindex.toCPointer<ByteVar>(), pacolorname.toCPointer<ByteVar>(), dwcount)

public actual fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile(pahprofiles.toCPointer<ByteVar>(), nprofiles, padwintents.toCPointer<ByteVar>(), nintents, dwflags, lpprofiledata.toCPointer<ByteVar>())

public actual fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform(pahprofiles.toCPointer<ByteVar>(), nprofiles, padwintents.toCPointer<ByteVar>(), nintents, dwflags)

public actual fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateProfile(lpcolorspace.toCPointer<ByteVar>(), lpprofiledata.toCPointer<ByteVar>())

public actual fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateProfileW(lpcolorspace.toCPointer<ByteVar>(), lpprofiledata.toCPointer<ByteVar>())

public actual fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateTransform(lpcolorspace.toCPointer<ByteVar>(), lpdevcharacter.toCPointer<ByteVar>(), lptargetdevcharacter.toCPointer<ByteVar>())

public actual fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt(lpcolorspace.toCPointer<ByteVar>(), lpdevcharacter.toCPointer<ByteVar>(), lptargetdevcharacter.toCPointer<ByteVar>(), dwflags)

public actual fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW(lpcolorspace.toCPointer<ByteVar>(), lpdevcharacter.toCPointer<ByteVar>(), lptargetdevcharacter.toCPointer<ByteVar>(), dwflags)

public actual fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMCreateTransformW(lpcolorspace.toCPointer<ByteVar>(), lpdevcharacter.toCPointer<ByteVar>(), lptargetdevcharacter.toCPointer<ByteVar>())

public actual fun CMDeleteTransform(hcmtransform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMDeleteTransform(hcmtransform)

public actual fun CMGetInfo(dwinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMGetInfo(dwinfo)

public actual fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo(hprofile, pnamedprofileinfo.toCPointer<ByteVar>())

public actual fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMIsProfileValid(hprofile, lpbvalid.toCPointer<ByteVar>())

public actual fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMTranslateColors(hcmtransform, lpainputcolors.toCPointer<ByteVar>(), ncolors, ctinput, lpaoutputcolors.toCPointer<ByteVar>(), ctoutput)

public actual fun CMTranslateRGB(hcmtransform: Long, colorref: COLORREF, lpcolorref: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMTranslateRGB(hcmtransform, colorref, lpcolorref.toCPointer<ByteVar>(), dwflags)

public actual fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs(hcmtransform, lpsrcbits.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lpdestbits.toCPointer<ByteVar>(), bmoutput, dwtranslatedirection)

public actual fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt(hcmtransform, lpsrcbits.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, lpdestbits.toCPointer<ByteVar>(), bmoutput, dwoutputstride, lpfncallback.toLong().toCPointer<ByteVar>(), ulcallbackdata)

public actual fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CheckBitmapBits(hcolortransform, psrcbits.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, paresult.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), lpcallbackdata)

public actual fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CheckColors(hcolortransform, painputcolors.toCPointer<ByteVar>(), ncolors, ctinput, paresult.toCPointer<ByteVar>())

public actual fun CheckColorsInGamut(hdc: HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut(hdc.toCPointer<ByteVar>(), lprgbtriple.toCPointer<ByteVar>(), dlpbuffer.toCPointer<ByteVar>(), ncount)

public actual fun CloseColorProfile(hprofile: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CloseColorProfile(hprofile)

public actual fun ColorCorrectPalette(hdc: HDC, hpal: HPALETTE, defirst: UInt, num: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette(hdc.toCPointer<ByteVar>(), hpal.toCPointer<ByteVar>(), defirst, num)

public actual fun ColorMatchToTarget(hdc: HDC, hdctarget: HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget(hdc.toCPointer<ByteVar>(), hdctarget.toCPointer<ByteVar>(), action)

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
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex(hprofile, pacolorname.toCPointer<ByteVar>(), paindex.toCPointer<ByteVar>(), dwcount)

public actual fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName(hprofile, paindex.toCPointer<ByteVar>(), pacolorname.toCPointer<ByteVar>(), dwcount)

public actual fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA(lplcs.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW(lplcs.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateColorTransformA(plogcolorspace.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateColorTransformW(plogcolorspace.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile(hprofile.toCPointer<ByteVar>(), nprofiles, padwintent.toCPointer<ByteVar>(), nintents, dwflags, pprofiledata.toCPointer<ByteVar>(), indexpreferredcmm)

public actual fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform(pahprofiles.toCPointer<ByteVar>(), nprofiles, padwintent.toCPointer<ByteVar>(), nintents, dwflags, indexpreferredcmm)

public actual fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA(plogcolorspace.toCPointer<ByteVar>(), pprofile.toCPointer<ByteVar>())

public actual fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW(plogcolorspace.toCPointer<ByteVar>(), pprofile.toCPointer<ByteVar>())

public actual fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_DeleteColorSpace(hcs.toCPointer<ByteVar>())

public actual fun DeleteColorTransform(hxform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_DeleteColorTransform(hxform)

public actual fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA(pmachinename.toCPointer<ByteVar>(), penumrecord.toCPointer<ByteVar>(), penumerationbuffer.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer.toCPointer<ByteVar>(), pnprofiles.toCPointer<ByteVar>())

public actual fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW(pmachinename.toCPointer<ByteVar>(), penumrecord.toCPointer<ByteVar>(), penumerationbuffer.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer.toCPointer<ByteVar>(), pnprofiles.toCPointer<ByteVar>())

public actual fun EnumICMProfilesA(hdc: HDC, proc: ICMENUMPROCA, param2: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA(hdc.toCPointer<ByteVar>(), proc.toLong().toCPointer<ByteVar>(), param2)

public actual fun EnumICMProfilesW(hdc: HDC, proc: ICMENUMPROCW, param2: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW(hdc.toCPointer<ByteVar>(), proc.toLong().toCPointer<ByteVar>(), param2)

public actual fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetCMMInfo(hcolortransform, param1)

public actual fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA(pmachinename.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW(pmachinename.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorProfileElement(hprofile, tag, dwoffset, pcbelement.toCPointer<ByteVar>(), pelement.toCPointer<ByteVar>(), pbreference.toCPointer<ByteVar>())

public actual fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag(hprofile, dwindex, ptag.toCPointer<ByteVar>())

public actual fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle(hprofile, pprofile.toCPointer<ByteVar>(), pcbprofile.toCPointer<ByteVar>())

public actual fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader(hprofile, pheader.toCPointer<ByteVar>())

public actual fun GetColorSpace(hdc: HDC): HCOLORSPACE =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetColorSpace(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements(hprofile, pnelementcount.toCPointer<ByteVar>())

public actual fun GetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp(hdc.toCPointer<ByteVar>(), lpramp.toCPointer<ByteVar>())

public actual fun GetICMProfileA(hdc: HDC, pbufsize: Long, pszfilename: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetICMProfileA(hdc.toCPointer<ByteVar>(), pbufsize.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>())

public actual fun GetICMProfileW(hdc: HDC, pbufsize: Long, pszfilename: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetICMProfileW(hdc.toCPointer<ByteVar>(), pbufsize.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>())

public actual fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA(hcolorspace.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW(hcolorspace.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo(hprofile, pnamedprofileinfo.toCPointer<ByteVar>())

public actual fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary(hprofile, dwintent, pps2colorrenderingdictionary.toCPointer<ByteVar>(), pcbps2colorrenderingdictionary.toCPointer<ByteVar>(), pbbinary.toCPointer<ByteVar>())

public actual fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent(hprofile, dwintent, pbuffer.toCPointer<ByteVar>(), pcbps2colorrenderingintent.toCPointer<ByteVar>())

public actual fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray(hprofile, dwintent, dwcsatype, pps2colorspacearray.toCPointer<ByteVar>(), pcbps2colorspacearray.toCPointer<ByteVar>(), pbbinary.toCPointer<ByteVar>())

public actual fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA(pmachinename.toCPointer<ByteVar>(), dwscs, pbuffer.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW(pmachinename.toCPointer<ByteVar>(), dwscs, pbuffer.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_InstallColorProfileA(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>())

public actual fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_InstallColorProfileW(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>())

public actual fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent(hprofile, tag, pbpresent.toCPointer<ByteVar>())

public actual fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_IsColorProfileValid(hprofile, pbvalid.toCPointer<ByteVar>())

public actual fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_OpenColorProfileA(pprofile.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_OpenColorProfileW(pprofile.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_RegisterCMMA(pmachinename.toCPointer<ByteVar>(), cmmid, pcmmdll.toCPointer<ByteVar>())

public actual fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_RegisterCMMW(pmachinename.toCPointer<ByteVar>(), cmmid, pcmmdll.toCPointer<ByteVar>())

public actual fun SelectCMM(dwcmmtype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SelectCMM(dwcmmtype)

public actual fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetColorProfileElement(hprofile, tag, dwoffset, pcbelement.toCPointer<ByteVar>(), pelement.toCPointer<ByteVar>())

public actual fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference(hprofile, newtag, reftag)

public actual fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize(hprofile, tagtype, pcbelement)

public actual fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader(hprofile, pheader.toCPointer<ByteVar>())

public actual fun SetColorSpace(hdc: HDC, hcs: HCOLORSPACE): HCOLORSPACE =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetColorSpace(hdc.toCPointer<ByteVar>(), hcs.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp(hdc.toCPointer<ByteVar>(), lpramp.toCPointer<ByteVar>())

public actual fun SetICMMode(hdc: HDC, mode: ICM_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetICMMode(hdc.toCPointer<ByteVar>(), mode)

public actual fun SetICMProfileA(hdc: HDC, lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetICMProfileA(hdc.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun SetICMProfileW(hdc: HDC, lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetICMProfileW(hdc.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA(pmachinename.toCPointer<ByteVar>(), dwprofileid, pprofilename.toCPointer<ByteVar>())

public actual fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW(pmachinename.toCPointer<ByteVar>(), dwprofileid, pprofilename.toCPointer<ByteVar>())

public actual fun SetupColorMatchingA(pcms: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA(pcms.toCPointer<ByteVar>())

public actual fun SetupColorMatchingW(pcms: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW(pcms.toCPointer<ByteVar>())

public actual fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits(hcolortransform, psrcbits.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, pdestbits.toCPointer<ByteVar>(), bmoutput, dwoutputstride, pfncallback.toLong().toCPointer<ByteVar>(), ulcallbackdata)

public actual fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_TranslateColors(hcolortransform, painputcolors.toCPointer<ByteVar>(), ncolors, ctinput, paoutputcolors.toCPointer<ByteVar>(), ctoutput)

public actual fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), bdelete)

public actual fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW(pmachinename.toCPointer<ByteVar>(), pprofilename.toCPointer<ByteVar>(), bdelete)

public actual fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UnregisterCMMA(pmachinename.toCPointer<ByteVar>(), cmmid)

public actual fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UnregisterCMMW(pmachinename.toCPointer<ByteVar>(), cmmid)

public actual fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA(reserved, lpszcmid.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), command)

public actual fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW(reserved, lpszcmid.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), command)

public actual fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice(scope, pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsCheckColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata.toCPointer<ByteVar>(), paresult.toCPointer<ByteVar>())

public actual fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile(hwcsprofile, dwoptions)

public actual fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice(scope, pprofilename.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>())

public actual fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles(scope, penumrecord.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), dwsize, pnprofiles.toCPointer<ByteVar>())

public actual fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize(scope, penumrecord.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState(pbisenabled.toCPointer<ByteVar>())

public actual fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile(scope, pdevicename.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, cbprofilename, pprofilename.toCPointer<ByteVar>())

public actual fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize(scope, pdevicename.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pcbprofilename.toCPointer<ByteVar>())

public actual fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent(scope, pdwrenderingintent.toCPointer<ByteVar>())

public actual fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles(pdevicename.toCPointer<ByteVar>(), dwdeviceclass, puseperuserprofiles.toCPointer<ByteVar>())

public actual fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA(pcdmpprofile.toCPointer<ByteVar>(), pcampprofile.toCPointer<ByteVar>(), pgmmpprofile.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW(pcdmpprofile.toCPointer<ByteVar>(), pcampprofile.toCPointer<ByteVar>(), pgmmpprofile.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState(bisenabled)

public actual fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile(scope, pdevicename.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pprofilename.toCPointer<ByteVar>())

public actual fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent(scope, dwrenderingintent)

public actual fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles(pdevicename.toCPointer<ByteVar>(), dwdeviceclass, useperuserprofiles)

public actual fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_WcsTranslateColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata.toCPointer<ByteVar>(), noutputchannels, cdtoutput, cboutput, poutputdata.toCPointer<ByteVar>())
