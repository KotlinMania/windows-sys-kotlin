@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lparesult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lparesult: Long, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintents: Long, nintents: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMIsProfileValid(hprofile: Long, lpbvalid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: Int, ctinput: Int, lpaoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMTranslateRGB(hcmtransform: Long, colorref: Int, lpcolorref: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, lpdestbits: Long, bmoutput: Int, dwtranslatedirection: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, lpdestbits: Long, bmoutput: Int, dwoutputstride: Int, lpfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwstride: Int, paresult: Long, pfncallback: Long, lpcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCheckColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCheckColorsInGamut(hdc: Long, lprgbtriple: Long, dlpbuffer: Long, ncount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemColorCorrectPalette(hdc: Long, hpal: Long, defirst: Int, num: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemColorMatchToTarget(hdc: Long, hdctarget: Long, action: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateColorSpaceA(lplcs: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateColorSpaceW(lplcs: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(hprofile: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, pprofiledata: Long, indexpreferredcmm: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(pahprofiles: Long, nprofiles: Int, padwintent: Long, nintents: Int, dwflags: Int, indexpreferredcmm: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemDeleteColorSpace(hcs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(pmachinename: Long, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemEnumColorProfilesA(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemEnumColorProfilesW(pmachinename: Long, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemEnumICMProfilesA(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemEnumICMProfilesW(hdc: Long, proc: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorDirectoryA(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorDirectoryW(pmachinename: Long, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long, pbreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(hprofile: Long, dwindex: Int, ptag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetColorSpace(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(hprofile: Long, pnelementcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetICMProfileA(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetICMProfileW(hdc: Long, pbufsize: Long, pszfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(hcolorspace: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(hprofile: Long, dwintent: Int, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(hprofile: Long, dwintent: Int, pbuffer: Long, pcbps2colorrenderingintent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(hprofile: Long, dwintent: Int, dwcsatype: Int, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(pmachinename: Long, dwscs: Int, pbuffer: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemInstallColorProfileA(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemInstallColorProfileW(pmachinename: Long, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(hprofile: Long, tag: Int, pbpresent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemIsColorProfileValid(hprofile: Long, pbvalid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemOpenColorProfileA(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemOpenColorProfileW(pprofile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemRegisterCMMA(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemRegisterCMMW(pmachinename: Long, cmmid: Int, pcmmdll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetColorProfileElement(hprofile: Long, tag: Int, dwoffset: Int, pcbelement: Long, pelement: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile: Long, newtag: Int, reftag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile: Long, tagtype: Int, pcbelement: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetColorProfileHeader(hprofile: Long, pheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetColorSpace(hdc: Long, hcs: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(hdc: Long, lpramp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetICMMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetICMProfileA(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetICMProfileW(hdc: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(pmachinename: Long, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetupColorMatchingA(pcms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemSetupColorMatchingW(pcms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemTranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: Int, dwwidth: Int, dwheight: Int, dwinputstride: Int, pdestbits: Long, bmoutput: Int, dwoutputstride: Int, pfncallback: Long, ulcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemTranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: Int, ctinput: Int, paoutputcolors: Long, ctoutput: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUninstallColorProfileA(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUninstallColorProfileW(pmachinename: Long, pprofilename: Long, bdelete: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUnregisterCMMA(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUnregisterCMMW(pmachinename: Long, cmmid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(reserved: Int, lpszcmid: Long, lpszfilename: Long, command: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsCheckColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, paresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile: Long, dwoptions: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(scope: Int, pprofilename: Long, pdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(scope: Int, penumrecord: Long, pbuffer: Long, dwsize: Int, pnprofiles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(scope: Int, penumrecord: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(pbisenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, cbprofilename: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pcbprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(scope: Int, pdwrenderingintent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, puseperuserprofiles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: Int, dwsharemode: Int, dwcreationmode: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(scope: Int, pdevicename: Long, cptcolorprofiletype: Int, cpstcolorprofilesubtype: Int, dwprofileid: Int, pprofilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope: Int, dwrenderingintent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(pdevicename: Long, dwdeviceclass: Int, useperuserprofiles: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiColorsystemWcsTranslateColors(hcolortransform: Long, ncolors: Int, ninputchannels: Int, cdtinput: Int, cbinput: Int, pinputdata: Long, noutputchannels: Int, cdtoutput: Int, cboutput: Int, poutputdata: Long): Int
}

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(pmachinename.rawAddress, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(pmachinename.rawAddress, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCheckColors(hcmtransform, lpainputcolors.rawAddress, ncolors.toInt(), ctinput, lparesult.rawAddress)

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr, lparesult: MutPtr, ncount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(hcmtransform, lpargbtriple.rawAddress, lparesult.rawAddress, ncount.toInt())

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCheckRGBs(hcmtransform, lpsrcbits.rawAddress, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lparesult.rawAddress, 0L, ulcallbackdata)

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(hprofile, pacolorname.rawAddress, paindex.rawAddress, dwcount.toInt())

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(hprofile, paindex.rawAddress, pacolorname.rawAddress, dwcount.toInt())

public actual fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(pahprofiles.rawAddress, nprofiles.toInt(), padwintents.rawAddress, nintents.toInt(), dwflags.toInt(), lpprofiledata.rawAddress)

public actual fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(pahprofiles.rawAddress, nprofiles.toInt(), padwintents.rawAddress, nintents.toInt(), dwflags.toInt())

public actual fun cMCreateProfile(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateProfile(lpcolorspace.rawAddress, lpprofiledata.rawAddress)

public actual fun cMCreateProfileW(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateProfileW(lpcolorspace.rawAddress, lpprofiledata.rawAddress)

public actual fun cMCreateTransform(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateTransform(lpcolorspace.rawAddress, lpdevcharacter.rawAddress, lptargetdevcharacter.rawAddress)

public actual fun cMCreateTransformExt(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateTransformExt(lpcolorspace.rawAddress, lpdevcharacter.rawAddress, lptargetdevcharacter.rawAddress, dwflags.toInt())

public actual fun cMCreateTransformExtW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(lpcolorspace.rawAddress, lpdevcharacter.rawAddress, lptargetdevcharacter.rawAddress, dwflags.toInt())

public actual fun cMCreateTransformW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMCreateTransformW(lpcolorspace.rawAddress, lpdevcharacter.rawAddress, lptargetdevcharacter.rawAddress)

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform)

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo.toInt()).toUInt()

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(hprofile, pnamedprofileinfo.rawAddress)

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMIsProfileValid(hprofile, lpbvalid.rawAddress)

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMTranslateColors(hcmtransform, lpainputcolors.rawAddress, ncolors.toInt(), ctinput, lpaoutputcolors.rawAddress, ctoutput)

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr, dwflags: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMTranslateRGB(hcmtransform, colorref.toInt(), lpcolorref.rawAddress, dwflags.toInt())

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMTranslateRGBs(hcmtransform, lpsrcbits.rawAddress, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lpdestbits.rawAddress, bmoutput, dwtranslatedirection.toInt())

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(hcmtransform, lpsrcbits.rawAddress, bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), lpdestbits.rawAddress, bmoutput, dwoutputstride.toInt(), 0L, ulcallbackdata)

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCheckBitmapBits(hcolortransform, psrcbits.rawAddress, bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), paresult.rawAddress, 0L, lpcallbackdata)

public actual fun checkColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paresult: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCheckColors(hcolortransform, painputcolors.rawAddress, ncolors.toInt(), ctinput, paresult.rawAddress)

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr, dlpbuffer: MutPtr, ncount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCheckColorsInGamut(hdc.rawAddress, lprgbtriple.rawAddress, dlpbuffer.rawAddress, ncount.toInt())

public actual fun closeColorProfile(hprofile: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile)

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemColorCorrectPalette(hdc.rawAddress, hpal.rawAddress, defirst.toInt(), num.toInt())

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemColorMatchToTarget(hdc.rawAddress, hdctarget.rawAddress, action.toInt())

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr): Hresult =
    0

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr, profilecount: MutPtr): Hresult =
    0

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr): Hresult =
    0

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    0

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(hprofile, pacolorname.rawAddress, paindex.rawAddress, dwcount.toInt())

public actual fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemConvertIndexToColorName(hprofile, paindex.rawAddress, pacolorname.rawAddress, dwcount.toInt())

public actual fun createColorSpaceA(lplcs: ConstPtr): Hcolorspace =
    MutPtr(WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateColorSpaceA(lplcs.rawAddress))

public actual fun createColorSpaceW(lplcs: ConstPtr): Hcolorspace =
    MutPtr(WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateColorSpaceW(lplcs.rawAddress))

public actual fun createColorTransformA(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateColorTransformA(plogcolorspace.rawAddress, hdestprofile, htargetprofile, dwflags.toInt())

public actual fun createColorTransformW(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateColorTransformW(plogcolorspace.rawAddress, hdestprofile, htargetprofile, dwflags.toInt())

public actual fun createDeviceLinkProfile(hprofile: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr, indexpreferredcmm: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(hprofile.rawAddress, nprofiles.toInt(), padwintent.rawAddress, nintents.toInt(), dwflags.toInt(), pprofiledata.rawAddress, indexpreferredcmm.toInt())

public actual fun createMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(pahprofiles.rawAddress, nprofiles.toInt(), padwintent.rawAddress, nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt())

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(plogcolorspace.rawAddress, pprofile.rawAddress)

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(plogcolorspace.rawAddress, pprofile.rawAddress)

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemDeleteColorSpace(hcs.rawAddress)

public actual fun deleteColorTransform(hxform: Long): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform)

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(pmachinename.rawAddress, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(pmachinename.rawAddress, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemEnumColorProfilesA(pmachinename.rawAddress, penumrecord.rawAddress, penumerationbuffer.rawAddress, pdwsizeofenumerationbuffer.rawAddress, pnprofiles.rawAddress)

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemEnumColorProfilesW(pmachinename.rawAddress, penumrecord.rawAddress, penumerationbuffer.rawAddress, pdwsizeofenumerationbuffer.rawAddress, pnprofiles.rawAddress)

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemEnumICMProfilesA(hdc.rawAddress, 0L, param2)

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemEnumICMProfilesW(hdc.rawAddress, 0L, param2)

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform, param1.toInt()).toUInt()

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorDirectoryA(pmachinename.rawAddress, pbuffer.rawAddress, pdwsize.rawAddress)

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorDirectoryW(pmachinename.rawAddress, pbuffer.rawAddress, pdwsize.rawAddress)

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr, pelement: MutPtr, pbreference: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress, pelement.rawAddress, pbreference.rawAddress)

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(hprofile, dwindex.toInt(), ptag.rawAddress)

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr, pcbprofile: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(hprofile, pprofile.rawAddress, pcbprofile.rawAddress)

public actual fun getColorProfileHeader(hprofile: Long, pheader: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorProfileHeader(hprofile, pheader.rawAddress)

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    MutPtr(WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetColorSpace(hdc.rawAddress))

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(hprofile, pnelementcount.rawAddress)

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(hdc.rawAddress, lpramp.rawAddress)

public actual fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetICMProfileA(hdc.rawAddress, pbufsize.rawAddress, pszfilename.rawAddress)

public actual fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetICMProfileW(hdc.rawAddress, pbufsize.rawAddress, pszfilename.rawAddress)

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(hcolorspace.rawAddress, lpbuffer.rawAddress, nsize.toInt())

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(hcolorspace.rawAddress, lpbuffer.rawAddress, nsize.toInt())

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(hprofile, pnamedprofileinfo.rawAddress)

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr, pcbps2colorrenderingdictionary: MutPtr, pbbinary: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(hprofile, dwintent.toInt(), pps2colorrenderingdictionary.rawAddress, pcbps2colorrenderingdictionary.rawAddress, pbbinary.rawAddress)

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr, pcbps2colorrenderingintent: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(hprofile, dwintent.toInt(), pbuffer.rawAddress, pcbps2colorrenderingintent.rawAddress)

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr, pcbps2colorspacearray: MutPtr, pbbinary: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(hprofile, dwintent.toInt(), dwcsatype.toInt(), pps2colorspacearray.rawAddress, pcbps2colorspacearray.rawAddress, pbbinary.rawAddress)

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(pmachinename.rawAddress, dwscs.toInt(), pbuffer.rawAddress, pcbsize.rawAddress)

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(pmachinename.rawAddress, dwscs.toInt(), pbuffer.rawAddress, pcbsize.rawAddress)

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemInstallColorProfileA(pmachinename.rawAddress, pprofilename.rawAddress)

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemInstallColorProfileW(pmachinename.rawAddress, pprofilename.rawAddress)

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(hprofile, tag.toInt(), pbpresent.rawAddress)

public actual fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemIsColorProfileValid(hprofile, pbvalid.rawAddress)

public actual fun openColorProfileA(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemOpenColorProfileA(pprofile.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun openColorProfileW(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemOpenColorProfileW(pprofile.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt())

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemRegisterCMMA(pmachinename.rawAddress, cmmid.toInt(), pcmmdll.rawAddress)

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemRegisterCMMW(pmachinename.rawAddress, cmmid.toInt(), pcmmdll.rawAddress)

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype.toInt())

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr, pelement: ConstPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetColorProfileElement(hprofile, tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress, pelement.rawAddress)

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile, newtag.toInt(), reftag.toInt())

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile, tagtype.toInt(), pcbelement.toInt())

public actual fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetColorProfileHeader(hprofile, pheader.rawAddress)

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    MutPtr(WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetColorSpace(hdc.rawAddress, hcs.rawAddress))

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(hdc.rawAddress, lpramp.rawAddress)

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetICMMode(hdc.rawAddress, mode)

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetICMProfileA(hdc.rawAddress, lpfilename.rawAddress)

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetICMProfileW(hdc.rawAddress, lpfilename.rawAddress)

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(pmachinename.rawAddress, dwprofileid.toInt(), pprofilename.rawAddress)

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(pmachinename.rawAddress, dwprofileid.toInt(), pprofilename.rawAddress)

public actual fun setupColorMatchingA(pcms: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetupColorMatchingA(pcms.rawAddress)

public actual fun setupColorMatchingW(pcms: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemSetupColorMatchingW(pcms.rawAddress)

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemTranslateBitmapBits(hcolortransform, psrcbits.rawAddress, bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), pdestbits.rawAddress, bmoutput, dwoutputstride.toInt(), 0L, ulcallbackdata)

public actual fun translateColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemTranslateColors(hcolortransform, painputcolors.rawAddress, ncolors.toInt(), ctinput, paoutputcolors.rawAddress, ctoutput)

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUninstallColorProfileA(pmachinename.rawAddress, pprofilename.rawAddress, bdelete)

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUninstallColorProfileW(pmachinename.rawAddress, pprofilename.rawAddress, bdelete)

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUnregisterCMMA(pmachinename.rawAddress, cmmid.toInt())

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUnregisterCMMW(pmachinename.rawAddress, cmmid.toInt())

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(reserved.toInt(), lpszcmid.rawAddress, lpszfilename.rawAddress, command.toInt())

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(reserved.toInt(), lpszcmid.rawAddress, lpszfilename.rawAddress, command.toInt())

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(scope, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, paresult: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsCheckColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress, paresult.rawAddress)

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile, dwoptions.toInt())

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(scope, pprofilename.rawAddress, pdevicename.rawAddress)

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pbuffer: MutPtr, dwsize: UInt, pnprofiles: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(scope, penumrecord.rawAddress, pbuffer.rawAddress, dwsize.toInt(), pnprofiles.rawAddress)

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pdwsize: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(scope, penumrecord.rawAddress, pdwsize.rawAddress)

public actual fun wcsGetCalibrationManagementState(pbisenabled: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(pbisenabled.rawAddress)

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(scope, pdevicename.rawAddress, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), pprofilename.rawAddress)

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(scope, pdevicename.rawAddress, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pcbprofilename.rawAddress)

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(scope, pdwrenderingintent.rawAddress)

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(pdevicename.rawAddress, dwdeviceclass.toInt(), puseperuserprofiles.rawAddress)

public actual fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(pcdmpprofile.rawAddress, pcampprofile.rawAddress, pgmmpprofile.rawAddress, dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(pcdmpprofile.rawAddress, pcampprofile.rawAddress, pgmmpprofile.rawAddress, dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt())

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled)

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(scope, pdevicename.rawAddress, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pprofilename.rawAddress)

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt())

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(pdevicename.rawAddress, dwdeviceclass.toInt(), useperuserprofiles)

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr): Bool =
    WindowsWin32UiColorsystemJniBridge.windowssysWindowsWin32UiColorsystemWcsTranslateColors(hcolortransform, ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress, noutputchannels.toInt(), cdtoutput, cboutput.toInt(), poutputdata.rawAddress)
