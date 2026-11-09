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

public actual fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    0

public actual fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    0

public actual fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL =
    0

public actual fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL =
    0

public actual fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    0

public actual fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL =
    0

public actual fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    0

public actual fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL =
    0

public actual fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long =
    0L

public actual fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    0

public actual fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL =
    0

public actual fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    0L

public actual fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    0L

public actual fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long =
    0L

public actual fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long =
    0L

public actual fun CMDeleteTransform(hcmtransform: Long): BOOL =
    0

public actual fun CMGetInfo(dwinfo: UInt): UInt =
    0u

public actual fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    0

public actual fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL =
    0

public actual fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    0

public actual fun CMTranslateRGB(hcmtransform: Long, colorref: COLORREF, lpcolorref: Long, dwflags: UInt): BOOL =
    0

public actual fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL =
    0

public actual fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    0

public actual fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: LPARAM): BOOL =
    0

public actual fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL =
    0

public actual fun CheckColorsInGamut(hdc: HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL =
    0

public actual fun CloseColorProfile(hprofile: Long): BOOL =
    0

public actual fun ColorCorrectPalette(hdc: HDC, hpal: HPALETTE, defirst: UInt, num: UInt): BOOL =
    0

public actual fun ColorMatchToTarget(hdc: HDC, hdctarget: HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL =
    0

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
    0

public actual fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL =
    0

public actual fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE =
    0L

public actual fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE =
    0L

public actual fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    0L

public actual fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    0L

public actual fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL =
    0

public actual fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    0L

public actual fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL =
    0

public actual fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL =
    0

public actual fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL =
    0

public actual fun DeleteColorTransform(hxform: Long): BOOL =
    0

public actual fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL =
    0

public actual fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    0

public actual fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    0

public actual fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL =
    0

public actual fun EnumICMProfilesA(hdc: HDC, proc: ICMENUMPROCA, param2: LPARAM): Int =
    0

public actual fun EnumICMProfilesW(hdc: HDC, proc: ICMENUMPROCW, param2: LPARAM): Int =
    0

public actual fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    0u

public actual fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL =
    0

public actual fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL =
    0

public actual fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL =
    0

public actual fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL =
    0

public actual fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL =
    0

public actual fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    0

public actual fun GetColorSpace(hdc: HDC): HCOLORSPACE =
    0L

public actual fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL =
    0

public actual fun GetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    0

public actual fun GetICMProfileA(hdc: HDC, pbufsize: Long, pszfilename: PSTR): BOOL =
    0

public actual fun GetICMProfileW(hdc: HDC, pbufsize: Long, pszfilename: PWSTR): BOOL =
    0

public actual fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    0

public actual fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL =
    0

public actual fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL =
    0

public actual fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL =
    0

public actual fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL =
    0

public actual fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL =
    0

public actual fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL =
    0

public actual fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL =
    0

public actual fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL =
    0

public actual fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL =
    0

public actual fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL =
    0

public actual fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL =
    0

public actual fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    0L

public actual fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    0L

public actual fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL =
    0

public actual fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL =
    0

public actual fun SelectCMM(dwcmmtype: UInt): BOOL =
    0

public actual fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL =
    0

public actual fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL =
    0

public actual fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL =
    0

public actual fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL =
    0

public actual fun SetColorSpace(hdc: HDC, hcs: HCOLORSPACE): HCOLORSPACE =
    0L

public actual fun SetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL =
    0

public actual fun SetICMMode(hdc: HDC, mode: ICM_MODE): Int =
    0

public actual fun SetICMProfileA(hdc: HDC, lpfilename: PCSTR): BOOL =
    0

public actual fun SetICMProfileW(hdc: HDC, lpfilename: PCWSTR): BOOL =
    0

public actual fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL =
    0

public actual fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    0

public actual fun SetupColorMatchingA(pcms: Long): BOOL =
    0

public actual fun SetupColorMatchingW(pcms: Long): BOOL =
    0

public actual fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL =
    0

public actual fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL =
    0

public actual fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL =
    0

public actual fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL =
    0

public actual fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL =
    0

public actual fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL =
    0

public actual fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL =
    0

public actual fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL =
    0

public actual fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    0

public actual fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL =
    0

public actual fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    0L

public actual fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL =
    0

public actual fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL =
    0

public actual fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL =
    0

public actual fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL =
    0

public actual fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL =
    0

public actual fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL =
    0

public actual fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL =
    0

public actual fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL =
    0

public actual fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    0L

public actual fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    0L

public actual fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL =
    0

public actual fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL =
    0

public actual fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL =
    0

public actual fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL =
    0

public actual fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL =
    0
