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

public expect fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool

public expect fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun cMCheckColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lparesult: COpaquePointer?): Bool

public expect fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: COpaquePointer?, lparesult: COpaquePointer?, ncount: UInt): Bool

public expect fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: COpaquePointer?, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool

public expect fun cMConvertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool

public expect fun cMCreateDeviceLinkProfile(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt, lpprofiledata: COpaquePointer?): Bool

public expect fun cMCreateMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt): Long

public expect fun cMCreateProfile(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool

public expect fun cMCreateProfileW(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool

public expect fun cMCreateTransform(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long

public expect fun cMCreateTransformExt(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long

public expect fun cMCreateTransformExtW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long

public expect fun cMCreateTransformW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long

public expect fun cMDeleteTransform(hcmtransform: Long): Bool

public expect fun cMGetInfo(dwinfo: UInt): UInt

public expect fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool

public expect fun cMIsProfileValid(hprofile: Long, lpbvalid: COpaquePointer?): Bool

public expect fun cMTranslateColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool

public expect fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: COpaquePointer?, dwflags: UInt): Bool

public expect fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool

public expect fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun checkBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: COpaquePointer?, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool

public expect fun checkColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paresult: COpaquePointer?): Bool

public expect fun checkColorsInGamut(hdc: Hdc, lprgbtriple: COpaquePointer?, dlpbuffer: COpaquePointer?, ncount: UInt): Bool

public expect fun closeColorProfile(hprofile: Long): Bool

public expect fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool

public expect fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool

public expect fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult

public expect fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: COpaquePointer?): Hresult

public expect fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult

public expect fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: COpaquePointer?): Hresult

public expect fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult

public expect fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult

public expect fun convertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool

public expect fun convertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool

public expect fun createColorSpaceA(lplcs: COpaquePointer?): Hcolorspace

public expect fun createColorSpaceW(lplcs: COpaquePointer?): Hcolorspace

public expect fun createColorTransformA(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun createColorTransformW(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun createDeviceLinkProfile(hprofile: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, pprofiledata: COpaquePointer?, indexpreferredcmm: UInt): Bool

public expect fun createMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long

public expect fun createProfileFromLogColorSpaceA(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool

public expect fun createProfileFromLogColorSpaceW(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool

public expect fun deleteColorSpace(hcs: Hcolorspace): Bool

public expect fun deleteColorTransform(hxform: Long): Bool

public expect fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool

public expect fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool

public expect fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool

public expect fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int

public expect fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int

public expect fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt

public expect fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: COpaquePointer?): Bool

public expect fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: COpaquePointer?): Bool

public expect fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?, pbreference: COpaquePointer?): Bool

public expect fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: COpaquePointer?): Bool

public expect fun getColorProfileFromHandle(hprofile: Long, pprofile: COpaquePointer?, pcbprofile: COpaquePointer?): Bool

public expect fun getColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool

public expect fun getColorSpace(hdc: Hdc): Hcolorspace

public expect fun getCountColorProfileElements(hprofile: Long, pnelementcount: COpaquePointer?): Bool

public expect fun getDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool

public expect fun getICMProfileA(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pstr): Bool

public expect fun getICMProfileW(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pwstr): Bool

public expect fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool

public expect fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool

public expect fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool

public expect fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: COpaquePointer?, pcbps2colorrenderingdictionary: COpaquePointer?, pbbinary: COpaquePointer?): Bool

public expect fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: COpaquePointer?, pcbps2colorrenderingintent: COpaquePointer?): Bool

public expect fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: COpaquePointer?, pcbps2colorspacearray: COpaquePointer?, pbbinary: COpaquePointer?): Bool

public expect fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: COpaquePointer?): Bool

public expect fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: COpaquePointer?): Bool

public expect fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool

public expect fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool

public expect fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: COpaquePointer?): Bool

public expect fun isColorProfileValid(hprofile: Long, pbvalid: COpaquePointer?): Bool

public expect fun openColorProfileA(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun openColorProfileW(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool

public expect fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool

public expect fun selectCMM(dwcmmtype: UInt): Bool

public expect fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?): Bool

public expect fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool

public expect fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool

public expect fun setColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool

public expect fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace

public expect fun setDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool

public expect fun setICMMode(hdc: Hdc, mode: IcmMode): Int

public expect fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool

public expect fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool

public expect fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool

public expect fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool

public expect fun setupColorMatchingA(pcms: COpaquePointer?): Bool

public expect fun setupColorMatchingW(pcms: COpaquePointer?): Bool

public expect fun translateBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun translateColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool

public expect fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool

public expect fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool

public expect fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool

public expect fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool

public expect fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool

public expect fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool

public expect fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, paresult: COpaquePointer?): Bool

public expect fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long

public expect fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pbuffer: COpaquePointer?, dwsize: UInt, pnprofiles: COpaquePointer?): Bool

public expect fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pdwsize: COpaquePointer?): Bool

public expect fun wcsGetCalibrationManagementState(pbisenabled: COpaquePointer?): Bool

public expect fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool

public expect fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: COpaquePointer?): Bool

public expect fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: COpaquePointer?): Bool

public expect fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: COpaquePointer?): Bool

public expect fun wcsOpenColorProfileA(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun wcsOpenColorProfileW(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool

public expect fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool

public expect fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool

public expect fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool

public expect fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: COpaquePointer?): Bool
