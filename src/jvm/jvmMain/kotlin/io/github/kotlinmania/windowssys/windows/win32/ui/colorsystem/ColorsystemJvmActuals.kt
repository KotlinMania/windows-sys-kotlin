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

private object WindowsWin32UiColorsystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lparesult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lparesult: Long, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMDeleteTransform(hcmtransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMGetInfo(dwinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMIsProfileValid(hprofile: Long, lpbvalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lpaoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMTranslateRGB(hcmtransform: Long, colorref: Int, lpcolorref: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lpdestbits: Long, bmoutput: Int, dwtranslatedirection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, lpdestbits: Long, bmoutput: Int, dwoutputstride: Int, lpfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, paresult: Long, pfncallback: Long, lpcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut(hdc: Long, lprgbtriple: Long, dlpbuffer: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CloseColorProfile(hprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette(hdc: Long, hpal: Long, defirst: Int, num: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget(hdc: Long, hdctarget: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA(lplcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW(lplcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile(hprofile: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, pprofiledata: Long, indexpreferredcmm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, indexpreferredcmm: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_DeleteColorSpace(hcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_DeleteColorTransform(hxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetCMMInfo(hcolortransform: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long, pbreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag(hprofile: Long, dwindex: Int, ptag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetColorSpace(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetICMProfileA(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetICMProfileW(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: Int, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent(hprofile: Long, dwintent: Int, pbuffer: Long, pcbps2colorrenderingintent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray(hprofile: Long, dwintent: Int, dwcsatype: Int, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_InstallColorProfileA(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_InstallColorProfileW(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent(hprofile: Long, tag: Int, pbpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_IsColorProfileValid(hprofile: Long, pbvalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_OpenColorProfileA(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_OpenColorProfileW(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_RegisterCMMA(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_RegisterCMMW(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SelectCMM(dwcmmtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference(hprofile: Long, newtag: Int, reftag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize(hprofile: Long, tagtype: Int, pcbelement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetColorSpace(hdc: Long, hcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetICMMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetICMProfileA(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetICMProfileW(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA(pcms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW(pcms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, pdestbits: Long, bmoutput: Int, dwoutputstride: Int, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UnregisterCMMA(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UnregisterCMMW(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsCheckColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, paresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile(hwcsprofile: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles(scope: Int, penumrecord: Long, pbuffer: Long, dwsize: Int, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize(scope: Int, penumrecord: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState(pbisenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, cbprofilename: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pcbprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent(scope: Int, pdwrenderingintent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, puseperuserprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState(bisenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent(scope: Int, dwrenderingintent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, useperuserprofiles: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_WcsTranslateColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, noutputchannels: Int, cdtoutput: Int, cboutput: Int, poutputdata: Long): Int
}

public actual fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA(pmachinename, pprofilename, pdevicename)

public actual fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW(pmachinename, pprofilename, pdevicename)

public actual fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCheckColors(hcmtransform, lpainputcolors, ncolors.toInt(), ctinput, lparesult)

public actual fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut(hcmtransform, lpargbtriple, lparesult, ncount.toInt())

public actual fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCheckRGBs(hcmtransform, lpsrcbits, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lparesult, pfncallback.toLong(), ulcallbackdata)

public actual fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex(hprofile, pacolorname, paindex, dwcount.toInt())

public actual fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName(hprofile, paindex, pacolorname, dwcount.toInt())

public actual fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile(pahprofiles, nprofiles.toInt(), padwintents, nintents.toInt(), dwflags.toInt(), lpprofiledata)

public actual fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform(pahprofiles, nprofiles.toInt(), padwintents, nintents.toInt(), dwflags.toInt())

public actual fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateProfile(lpcolorspace, lpprofiledata)

public actual fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateProfileW(lpcolorspace, lpprofiledata)

public actual fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateTransform(lpcolorspace, lpdevcharacter, lptargetdevcharacter)

public actual fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags.toInt())

public actual fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags.toInt())

public actual fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMCreateTransformW(lpcolorspace, lpdevcharacter, lptargetdevcharacter)

public actual fun CMDeleteTransform(hcmtransform: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMDeleteTransform(hcmtransform)

public actual fun CMGetInfo(dwinfo: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMGetInfo(dwinfo.toInt()).toUInt()

public actual fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo(hprofile, pnamedprofileinfo)

public actual fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMIsProfileValid(hprofile, lpbvalid)

public actual fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMTranslateColors(hcmtransform, lpainputcolors, ncolors.toInt(), ctinput, lpaoutputcolors, ctoutput)

public actual fun CMTranslateRGB(hcmtransform: Long, colorref: COLORREF, lpcolorref: Long, dwflags: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMTranslateRGB(hcmtransform, colorref.toInt(), lpcolorref, dwflags.toInt())

public actual fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs(hcmtransform, lpsrcbits, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lpdestbits, bmoutput, dwtranslatedirection.toInt())

public actual fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt(hcmtransform, lpsrcbits, bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), lpdestbits, bmoutput, dwoutputstride.toInt(), lpfncallback.toLong(), ulcallbackdata)

public actual fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: LPARAM): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CheckBitmapBits(hcolortransform, psrcbits, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), paresult, pfncallback.toLong(), lpcallbackdata)

public actual fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CheckColors(hcolortransform, painputcolors, ncolors.toInt(), ctinput, paresult)

public actual fun CheckColorsInGamut(hdc: HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut(hdc, lprgbtriple, dlpbuffer, ncount.toInt())

public actual fun CloseColorProfile(hprofile: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CloseColorProfile(hprofile)

public actual fun ColorCorrectPalette(hdc: HDC, hpal: HPALETTE, defirst: UInt, num: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette(hdc, hpal, defirst.toInt(), num.toInt())

public actual fun ColorMatchToTarget(hdc: HDC, hdctarget: HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget(hdc, hdctarget, action.toInt())

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
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex(hprofile, pacolorname, paindex, dwcount.toInt())

public actual fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName(hprofile, paindex, pacolorname, dwcount.toInt())

public actual fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA(lplcs)

public actual fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW(lplcs)

public actual fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateColorTransformA(plogcolorspace, hdestprofile, htargetprofile, dwflags.toInt())

public actual fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateColorTransformW(plogcolorspace, hdestprofile, htargetprofile, dwflags.toInt())

public actual fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile(hprofile, nprofiles.toInt(), padwintent, nintents.toInt(), dwflags.toInt(), pprofiledata, indexpreferredcmm.toInt())

public actual fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform(pahprofiles, nprofiles.toInt(), padwintent, nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt())

public actual fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA(plogcolorspace, pprofile)

public actual fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW(plogcolorspace, pprofile)

public actual fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_DeleteColorSpace(hcs)

public actual fun DeleteColorTransform(hxform: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_DeleteColorTransform(hxform)

public actual fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA(pmachinename, pprofilename, pdevicename)

public actual fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW(pmachinename, pprofilename, pdevicename)

public actual fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles)

public actual fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles)

public actual fun EnumICMProfilesA(hdc: HDC, proc: ICMENUMPROCA, param2: LPARAM): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA(hdc, proc.toLong(), param2)

public actual fun EnumICMProfilesW(hdc: HDC, proc: ICMENUMPROCW, param2: LPARAM): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW(hdc, proc.toLong(), param2)

public actual fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetCMMInfo(hcolortransform, param1.toInt()).toUInt()

public actual fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA(pmachinename, pbuffer, pdwsize)

public actual fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW(pmachinename, pbuffer, pdwsize)

public actual fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), pcbelement, pelement, pbreference)

public actual fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag(hprofile, dwindex.toInt(), ptag)

public actual fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle(hprofile, pprofile, pcbprofile)

public actual fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader(hprofile, pheader)

public actual fun GetColorSpace(hdc: HDC): HCOLORSPACE =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetColorSpace(hdc)

public actual fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements(hprofile, pnelementcount)

public actual fun GetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp(hdc, lpramp)

public actual fun GetICMProfileA(hdc: HDC, pbufsize: Long, pszfilename: PSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetICMProfileA(hdc, pbufsize, pszfilename)

public actual fun GetICMProfileW(hdc: HDC, pbufsize: Long, pszfilename: PWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetICMProfileW(hdc, pbufsize, pszfilename)

public actual fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA(hcolorspace, lpbuffer, nsize.toInt())

public actual fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW(hcolorspace, lpbuffer, nsize.toInt())

public actual fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo(hprofile, pnamedprofileinfo)

public actual fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary(hprofile, dwintent.toInt(), pps2colorrenderingdictionary, pcbps2colorrenderingdictionary, pbbinary)

public actual fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent(hprofile, dwintent.toInt(), pbuffer, pcbps2colorrenderingintent)

public actual fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray(hprofile, dwintent.toInt(), dwcsatype.toInt(), pps2colorspacearray, pcbps2colorspacearray, pbbinary)

public actual fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA(pmachinename, dwscs.toInt(), pbuffer, pcbsize)

public actual fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW(pmachinename, dwscs.toInt(), pbuffer, pcbsize)

public actual fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_InstallColorProfileA(pmachinename, pprofilename)

public actual fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_InstallColorProfileW(pmachinename, pprofilename)

public actual fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent(hprofile, tag.toInt(), pbpresent)

public actual fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_IsColorProfileValid(hprofile, pbvalid)

public actual fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_OpenColorProfileA(pprofile, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_OpenColorProfileW(pprofile, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_RegisterCMMA(pmachinename, cmmid.toInt(), pcmmdll)

public actual fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_RegisterCMMW(pmachinename, cmmid.toInt(), pcmmdll)

public actual fun SelectCMM(dwcmmtype: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SelectCMM(dwcmmtype.toInt())

public actual fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), pcbelement, pelement)

public actual fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference(hprofile, newtag.toInt(), reftag.toInt())

public actual fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize(hprofile, tagtype.toInt(), pcbelement.toInt())

public actual fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader(hprofile, pheader)

public actual fun SetColorSpace(hdc: HDC, hcs: HCOLORSPACE): HCOLORSPACE =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetColorSpace(hdc, hcs)

public actual fun SetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp(hdc, lpramp)

public actual fun SetICMMode(hdc: HDC, mode: ICM_MODE): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetICMMode(hdc, mode)

public actual fun SetICMProfileA(hdc: HDC, lpfilename: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetICMProfileA(hdc, lpfilename)

public actual fun SetICMProfileW(hdc: HDC, lpfilename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetICMProfileW(hdc, lpfilename)

public actual fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA(pmachinename, dwprofileid.toInt(), pprofilename)

public actual fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW(pmachinename, dwprofileid.toInt(), pprofilename)

public actual fun SetupColorMatchingA(pcms: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA(pcms)

public actual fun SetupColorMatchingW(pcms: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW(pcms)

public actual fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits(hcolortransform, psrcbits, bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), pdestbits, bmoutput, dwoutputstride.toInt(), pfncallback.toLong(), ulcallbackdata)

public actual fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_TranslateColors(hcolortransform, painputcolors, ncolors.toInt(), ctinput, paoutputcolors, ctoutput)

public actual fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA(pmachinename, pprofilename, bdelete)

public actual fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW(pmachinename, pprofilename, bdelete)

public actual fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UnregisterCMMA(pmachinename, cmmid.toInt())

public actual fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UnregisterCMMW(pmachinename, cmmid.toInt())

public actual fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA(reserved.toInt(), lpszcmid, lpszfilename, command.toInt())

public actual fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW(reserved.toInt(), lpszcmid, lpszfilename, command.toInt())

public actual fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice(scope, pprofilename, pdevicename)

public actual fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsCheckColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata, paresult)

public actual fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile(hwcsprofile, dwoptions.toInt())

public actual fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice(scope, pprofilename, pdevicename)

public actual fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles(scope, penumrecord, pbuffer, dwsize.toInt(), pnprofiles)

public actual fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize(scope, penumrecord, pdwsize)

public actual fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState(pbisenabled)

public actual fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), pprofilename)

public actual fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pcbprofilename)

public actual fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent(scope, pdwrenderingintent)

public actual fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles(pdevicename, dwdeviceclass.toInt(), puseperuserprofiles)

public actual fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState(bisenabled)

public actual fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pprofilename)

public actual fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt())

public actual fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles(pdevicename, dwdeviceclass.toInt(), useperuserprofiles)

public actual fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_WcsTranslateColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata, noutputchannels.toInt(), cdtoutput, cboutput.toInt(), poutputdata)
