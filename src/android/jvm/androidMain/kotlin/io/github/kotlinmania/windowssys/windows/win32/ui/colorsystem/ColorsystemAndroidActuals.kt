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

private object WindowsWin32UiColorsystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lparesult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lparesult: Long, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(hcmtransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMGetInfo(dwinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(hprofile: Long, lpbvalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lpaoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(hcmtransform: Long, colorref: Int, lpcolorref: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lpdestbits: Long, bmoutput: Int, dwtranslatedirection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, lpdestbits: Long, bmoutput: Int, dwoutputstride: Int, lpfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_checkBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, paresult: Long, pfncallback: Long, lpcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_checkColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_checkColorsInGamut(hdc: Long, lprgbtriple: Long, dlpbuffer: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_closeColorProfile(hprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_colorCorrectPalette(hdc: Long, hpal: Long, defirst: Int, num: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_colorMatchToTarget(hdc: Long, hdctarget: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createColorSpaceA(lplcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createColorSpaceW(lplcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile(hprofile: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, pprofiledata: Long, indexpreferredcmm: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, indexpreferredcmm: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_deleteColorSpace(hcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_deleteColorTransform(hxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_enumColorProfilesA(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_enumColorProfilesW(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_enumICMProfilesA(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_enumICMProfilesW(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getCMMInfo(hcolortransform: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorDirectoryA(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorDirectoryW(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long, pbreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(hprofile: Long, dwindex: Int, ptag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getColorSpace(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(hprofile: Long, pnelementcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getICMProfileA(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getICMProfileW(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(hprofile: Long, dwintent: Int, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(hprofile: Long, dwintent: Int, pbuffer: Long, pcbps2colorrenderingintent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(hprofile: Long, dwintent: Int, dwcsatype: Int, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_installColorProfileA(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_installColorProfileW(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(hprofile: Long, tag: Int, pbpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_isColorProfileValid(hprofile: Long, pbvalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_openColorProfileA(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_openColorProfileW(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_registerCMMA(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_registerCMMW(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_selectCMM(dwcmmtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(hprofile: Long, newtag: Int, reftag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(hprofile: Long, tagtype: Int, pcbelement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setColorSpace(hdc: Long, hcs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setICMMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setICMProfileA(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setICMProfileW(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setupColorMatchingA(pcms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_setupColorMatchingW(pcms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_translateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, pdestbits: Long, bmoutput: Int, dwoutputstride: Int, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_translateColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_unregisterCMMA(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_unregisterCMMW(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsCheckColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, paresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(hwcsprofile: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(scope: Int, penumrecord: Long, pbuffer: Long, dwsize: Int, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(scope: Int, penumrecord: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState(pbisenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, cbprofilename: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pcbprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(scope: Int, pdwrenderingintent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, puseperuserprofiles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(bisenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(scope: Int, dwrenderingintent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, useperuserprofiles: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, noutputchannels: Int, cdtoutput: Int, cboutput: Int, poutputdata: Long): Int
}

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lparesult: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCheckColors(hcmtransform, (lpainputcolors?.value ?: 0L), ncolors.toInt(), ctinput, (lparesult?.value ?: 0L))

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: COpaquePointer?, lparesult: COpaquePointer?, ncount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(hcmtransform, (lpargbtriple?.value ?: 0L), (lparesult?.value ?: 0L), ncount.toInt())

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: COpaquePointer?, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(hcmtransform, (lpsrcbits?.value ?: 0L), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (lparesult?.value ?: 0L), 0L, ulcallbackdata)

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(hprofile, (pacolorname?.value ?: 0L), (paindex?.value ?: 0L), dwcount.toInt())

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(hprofile, (paindex?.value ?: 0L), (pacolorname?.value ?: 0L), dwcount.toInt())

public actual fun cMCreateDeviceLinkProfile(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt, lpprofiledata: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile((pahprofiles?.value ?: 0L), nprofiles.toInt(), (padwintents?.value ?: 0L), nintents.toInt(), dwflags.toInt(), (lpprofiledata?.value ?: 0L))

public actual fun cMCreateMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform((pahprofiles?.value ?: 0L), nprofiles.toInt(), (padwintents?.value ?: 0L), nintents.toInt(), dwflags.toInt())

public actual fun cMCreateProfile(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateProfile((lpcolorspace?.value ?: 0L), (lpprofiledata?.value ?: 0L))

public actual fun cMCreateProfileW(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateProfileW((lpcolorspace?.value ?: 0L), (lpprofiledata?.value ?: 0L))

public actual fun cMCreateTransform(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateTransform((lpcolorspace?.value ?: 0L), (lpdevcharacter?.value ?: 0L), (lptargetdevcharacter?.value ?: 0L))

public actual fun cMCreateTransformExt(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt((lpcolorspace?.value ?: 0L), (lpdevcharacter?.value ?: 0L), (lptargetdevcharacter?.value ?: 0L), dwflags.toInt())

public actual fun cMCreateTransformExtW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW((lpcolorspace?.value ?: 0L), (lpdevcharacter?.value ?: 0L), (lptargetdevcharacter?.value ?: 0L), dwflags.toInt())

public actual fun cMCreateTransformW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMCreateTransformW((lpcolorspace?.value ?: 0L), (lpdevcharacter?.value ?: 0L), (lptargetdevcharacter?.value ?: 0L))

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(hcmtransform)

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMGetInfo(dwinfo.toInt()).toUInt()

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(hprofile, (pnamedprofileinfo?.value ?: 0L))

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(hprofile, (lpbvalid?.value ?: 0L))

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMTranslateColors(hcmtransform, (lpainputcolors?.value ?: 0L), ncolors.toInt(), ctinput, (lpaoutputcolors?.value ?: 0L), ctoutput)

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(hcmtransform, colorref.toInt(), (lpcolorref?.value ?: 0L), dwflags.toInt())

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(hcmtransform, (lpsrcbits?.value ?: 0L), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (lpdestbits?.value ?: 0L), bmoutput, dwtranslatedirection.toInt())

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(hcmtransform, (lpsrcbits?.value ?: 0L), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), (lpdestbits?.value ?: 0L), bmoutput, dwoutputstride.toInt(), 0L, ulcallbackdata)

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: COpaquePointer?, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_checkBitmapBits(hcolortransform, (psrcbits?.value ?: 0L), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (paresult?.value ?: 0L), 0L, lpcallbackdata)

public actual fun checkColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paresult: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_checkColors(hcolortransform, (painputcolors?.value ?: 0L), ncolors.toInt(), ctinput, (paresult?.value ?: 0L))

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: COpaquePointer?, dlpbuffer: COpaquePointer?, ncount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_checkColorsInGamut((hdc?.value ?: 0L), (lprgbtriple?.value ?: 0L), (dlpbuffer?.value ?: 0L), ncount.toInt())

public actual fun closeColorProfile(hprofile: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_closeColorProfile(hprofile)

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_colorCorrectPalette((hdc?.value ?: 0L), (hpal?.value ?: 0L), defirst.toInt(), num.toInt())

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_colorMatchToTarget((hdc?.value ?: 0L), (hdctarget?.value ?: 0L), action.toInt())

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: COpaquePointer?): Hresult =
    0

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    0

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: COpaquePointer?): Hresult =
    0

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    0

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(hprofile, (pacolorname?.value ?: 0L), (paindex?.value ?: 0L), dwcount.toInt())

public actual fun convertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(hprofile, (paindex?.value ?: 0L), (pacolorname?.value ?: 0L), dwcount.toInt())

public actual fun createColorSpaceA(lplcs: COpaquePointer?): Hcolorspace =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createColorSpaceA((lplcs?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createColorSpaceW(lplcs: COpaquePointer?): Hcolorspace =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createColorSpaceW((lplcs?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createColorTransformA(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createColorTransformA((plogcolorspace?.value ?: 0L), hdestprofile, htargetprofile, dwflags.toInt())

public actual fun createColorTransformW(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createColorTransformW((plogcolorspace?.value ?: 0L), hdestprofile, htargetprofile, dwflags.toInt())

public actual fun createDeviceLinkProfile(hprofile: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, pprofiledata: COpaquePointer?, indexpreferredcmm: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile((hprofile?.value ?: 0L), nprofiles.toInt(), (padwintent?.value ?: 0L), nintents.toInt(), dwflags.toInt(), (pprofiledata?.value ?: 0L), indexpreferredcmm.toInt())

public actual fun createMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform((pahprofiles?.value ?: 0L), nprofiles.toInt(), (padwintent?.value ?: 0L), nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt())

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA((plogcolorspace?.value ?: 0L), (pprofile?.value ?: 0L))

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW((plogcolorspace?.value ?: 0L), (pprofile?.value ?: 0L))

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_deleteColorSpace((hcs?.value ?: 0L))

public actual fun deleteColorTransform(hxform: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_deleteColorTransform(hxform)

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_enumColorProfilesA((pmachinename?.value ?: 0L), (penumrecord?.value ?: 0L), (penumerationbuffer?.value ?: 0L), (pdwsizeofenumerationbuffer?.value ?: 0L), (pnprofiles?.value ?: 0L))

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_enumColorProfilesW((pmachinename?.value ?: 0L), (penumrecord?.value ?: 0L), (penumerationbuffer?.value ?: 0L), (pdwsizeofenumerationbuffer?.value ?: 0L), (pnprofiles?.value ?: 0L))

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_enumICMProfilesA((hdc?.value ?: 0L), 0L, param2)

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_enumICMProfilesW((hdc?.value ?: 0L), 0L, param2)

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getCMMInfo(hcolortransform, param1.toInt()).toUInt()

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorDirectoryA((pmachinename?.value ?: 0L), (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L))

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorDirectoryW((pmachinename?.value ?: 0L), (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L))

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?, pbreference: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), (pcbelement?.value ?: 0L), (pelement?.value ?: 0L), (pbreference?.value ?: 0L))

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(hprofile, dwindex.toInt(), (ptag?.value ?: 0L))

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: COpaquePointer?, pcbprofile: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(hprofile, (pprofile?.value ?: 0L), (pcbprofile?.value ?: 0L))

public actual fun getColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(hprofile, (pheader?.value ?: 0L))

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getColorSpace((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(hprofile, (pnelementcount?.value ?: 0L))

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp((hdc?.value ?: 0L), (lpramp?.value ?: 0L))

public actual fun getICMProfileA(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getICMProfileA((hdc?.value ?: 0L), (pbufsize?.value ?: 0L), (pszfilename?.value ?: 0L))

public actual fun getICMProfileW(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getICMProfileW((hdc?.value ?: 0L), (pbufsize?.value ?: 0L), (pszfilename?.value ?: 0L))

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA((hcolorspace?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toInt())

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW((hcolorspace?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toInt())

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(hprofile, (pnamedprofileinfo?.value ?: 0L))

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: COpaquePointer?, pcbps2colorrenderingdictionary: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(hprofile, dwintent.toInt(), (pps2colorrenderingdictionary?.value ?: 0L), (pcbps2colorrenderingdictionary?.value ?: 0L), (pbbinary?.value ?: 0L))

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: COpaquePointer?, pcbps2colorrenderingintent: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(hprofile, dwintent.toInt(), (pbuffer?.value ?: 0L), (pcbps2colorrenderingintent?.value ?: 0L))

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: COpaquePointer?, pcbps2colorspacearray: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(hprofile, dwintent.toInt(), dwcsatype.toInt(), (pps2colorspacearray?.value ?: 0L), (pcbps2colorspacearray?.value ?: 0L), (pbbinary?.value ?: 0L))

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA((pmachinename?.value ?: 0L), dwscs.toInt(), (pbuffer?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW((pmachinename?.value ?: 0L), dwscs.toInt(), (pbuffer?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_installColorProfileA((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L))

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_installColorProfileW((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L))

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(hprofile, tag.toInt(), (pbpresent?.value ?: 0L))

public actual fun isColorProfileValid(hprofile: Long, pbvalid: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_isColorProfileValid(hprofile, (pbvalid?.value ?: 0L))

public actual fun openColorProfileA(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_openColorProfileA((pprofile?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun openColorProfileW(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_openColorProfileW((pprofile?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_registerCMMA((pmachinename?.value ?: 0L), cmmid.toInt(), (pcmmdll?.value ?: 0L))

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_registerCMMW((pmachinename?.value ?: 0L), cmmid.toInt(), (pcmmdll?.value ?: 0L))

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_selectCMM(dwcmmtype.toInt())

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), (pcbelement?.value ?: 0L), (pelement?.value ?: 0L))

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(hprofile, newtag.toInt(), reftag.toInt())

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(hprofile, tagtype.toInt(), pcbelement.toInt())

public actual fun setColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(hprofile, (pheader?.value ?: 0L))

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setColorSpace((hdc?.value ?: 0L), (hcs?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp((hdc?.value ?: 0L), (lpramp?.value ?: 0L))

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setICMMode((hdc?.value ?: 0L), mode)

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setICMProfileA((hdc?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setICMProfileW((hdc?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA((pmachinename?.value ?: 0L), dwprofileid.toInt(), (pprofilename?.value ?: 0L))

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW((pmachinename?.value ?: 0L), dwprofileid.toInt(), (pprofilename?.value ?: 0L))

public actual fun setupColorMatchingA(pcms: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setupColorMatchingA((pcms?.value ?: 0L))

public actual fun setupColorMatchingW(pcms: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_setupColorMatchingW((pcms?.value ?: 0L))

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_translateBitmapBits(hcolortransform, (psrcbits?.value ?: 0L), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), (pdestbits?.value ?: 0L), bmoutput, dwoutputstride.toInt(), 0L, ulcallbackdata)

public actual fun translateColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_translateColors(hcolortransform, (painputcolors?.value ?: 0L), ncolors.toInt(), ctinput, (paoutputcolors?.value ?: 0L), ctoutput)

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), bdelete)

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW((pmachinename?.value ?: 0L), (pprofilename?.value ?: 0L), bdelete)

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_unregisterCMMA((pmachinename?.value ?: 0L), cmmid.toInt())

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_unregisterCMMW((pmachinename?.value ?: 0L), cmmid.toInt())

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(reserved.toInt(), (lpszcmid?.value ?: 0L), (lpszfilename?.value ?: 0L), command.toInt())

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(reserved.toInt(), (lpszcmid?.value ?: 0L), (lpszfilename?.value ?: 0L), command.toInt())

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(scope, (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, paresult: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsCheckColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), (pinputdata?.value ?: 0L), (paresult?.value ?: 0L))

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(hwcsprofile, dwoptions.toInt())

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(scope, (pprofilename?.value ?: 0L), (pdevicename?.value ?: 0L))

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pbuffer: COpaquePointer?, dwsize: UInt, pnprofiles: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(scope, (penumrecord?.value ?: 0L), (pbuffer?.value ?: 0L), dwsize.toInt(), (pnprofiles?.value ?: 0L))

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pdwsize: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(scope, (penumrecord?.value ?: 0L), (pdwsize?.value ?: 0L))

public actual fun wcsGetCalibrationManagementState(pbisenabled: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState((pbisenabled?.value ?: 0L))

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(scope, (pdevicename?.value ?: 0L), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), (pprofilename?.value ?: 0L))

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(scope, (pdevicename?.value ?: 0L), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), (pcbprofilename?.value ?: 0L))

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(scope, (pdwrenderingintent?.value ?: 0L))

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles((pdevicename?.value ?: 0L), dwdeviceclass.toInt(), (puseperuserprofiles?.value ?: 0L))

public actual fun wcsOpenColorProfileA(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA((pcdmpprofile?.value ?: 0L), (pcampprofile?.value ?: 0L), (pgmmpprofile?.value ?: 0L), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun wcsOpenColorProfileW(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW((pcdmpprofile?.value ?: 0L), (pcampprofile?.value ?: 0L), (pgmmpprofile?.value ?: 0L), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(bisenabled)

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(scope, (pdevicename?.value ?: 0L), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), (pprofilename?.value ?: 0L))

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt())

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles((pdevicename?.value ?: 0L), dwdeviceclass.toInt(), useperuserprofiles)

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: COpaquePointer?): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), (pinputdata?.value ?: 0L), noutputchannels.toInt(), cdtoutput, cboutput.toInt(), (poutputdata?.value ?: 0L))
