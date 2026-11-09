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

public expect fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL

public expect fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL

public expect fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL

public expect fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL

public expect fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL

public expect fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL

public expect fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL

public expect fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL

public expect fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long

public expect fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL

public expect fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL

public expect fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

public expect fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long

public expect fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long

public expect fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long

public expect fun CMDeleteTransform(hcmtransform: Long): BOOL

public expect fun CMGetInfo(dwinfo: UInt): UInt

public expect fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL

public expect fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL

public expect fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL

public expect fun CMTranslateRGB(hcmtransform: Long, colorref: COLORREF, lpcolorref: Long, dwflags: UInt): BOOL

public expect fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL

public expect fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL

public expect fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: LPARAM): BOOL

public expect fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL

public expect fun CheckColorsInGamut(hdc: HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL

public expect fun CloseColorProfile(hprofile: Long): BOOL

public expect fun ColorCorrectPalette(hdc: HDC, hpal: HPALETTE, defirst: UInt, num: UInt): BOOL

public expect fun ColorMatchToTarget(hdc: HDC, hdctarget: HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL

public expect fun ColorProfileAddDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: LUID, sourceid: UInt, setasdefault: BOOL, associateasadvancedcolor: BOOL): HRESULT

public expect fun ColorProfileGetDisplayDefault(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: LUID, sourceid: UInt, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, profilename: Long): HRESULT

public expect fun ColorProfileGetDisplayList(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: LUID, sourceid: UInt, profilelist: Long, profilecount: Long): HRESULT

public expect fun ColorProfileGetDisplayUserScope(targetadapterid: LUID, sourceid: UInt, scope: Long): HRESULT

public expect fun ColorProfileRemoveDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: LUID, sourceid: UInt, dissociateadvancedcolor: BOOL): HRESULT

public expect fun ColorProfileSetDisplayDefaultAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, targetadapterid: LUID, sourceid: UInt): HRESULT

public expect fun ConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL

public expect fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL

public expect fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE

public expect fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE

public expect fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL

public expect fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long

public expect fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL

public expect fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL

public expect fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL

public expect fun DeleteColorTransform(hxform: Long): BOOL

public expect fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL

public expect fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL

public expect fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL

public expect fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL

public expect fun EnumICMProfilesA(hdc: HDC, proc: ICMENUMPROCA, param2: LPARAM): Int

public expect fun EnumICMProfilesW(hdc: HDC, proc: ICMENUMPROCW, param2: LPARAM): Int

public expect fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt

public expect fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL

public expect fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL

public expect fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL

public expect fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL

public expect fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL

public expect fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL

public expect fun GetColorSpace(hdc: HDC): HCOLORSPACE

public expect fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL

public expect fun GetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL

public expect fun GetICMProfileA(hdc: HDC, pbufsize: Long, pszfilename: PSTR): BOOL

public expect fun GetICMProfileW(hdc: HDC, pbufsize: Long, pszfilename: PWSTR): BOOL

public expect fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL

public expect fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL

public expect fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL

public expect fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL

public expect fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL

public expect fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL

public expect fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL

public expect fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL

public expect fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL

public expect fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL

public expect fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL

public expect fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL

public expect fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL

public expect fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL

public expect fun SelectCMM(dwcmmtype: UInt): BOOL

public expect fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL

public expect fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL

public expect fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL

public expect fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL

public expect fun SetColorSpace(hdc: HDC, hcs: HCOLORSPACE): HCOLORSPACE

public expect fun SetDeviceGammaRamp(hdc: HDC, lpramp: Long): BOOL

public expect fun SetICMMode(hdc: HDC, mode: ICM_MODE): Int

public expect fun SetICMProfileA(hdc: HDC, lpfilename: PCSTR): BOOL

public expect fun SetICMProfileW(hdc: HDC, lpfilename: PCWSTR): BOOL

public expect fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL

public expect fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL

public expect fun SetupColorMatchingA(pcms: Long): BOOL

public expect fun SetupColorMatchingW(pcms: Long): BOOL

public expect fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: LPARAM): BOOL

public expect fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL

public expect fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL

public expect fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL

public expect fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL

public expect fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL

public expect fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL

public expect fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL

public expect fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL

public expect fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL

public expect fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long

public expect fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL

public expect fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL

public expect fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL

public expect fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL

public expect fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL

public expect fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL

public expect fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL

public expect fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL

public expect fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL

public expect fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL

public expect fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL

public expect fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL

public expect fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL
