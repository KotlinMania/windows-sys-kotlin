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

public expect fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool

public expect fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr): Bool

public expect fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr, lparesult: MutPtr, ncount: UInt): Bool

public expect fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool

public expect fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool

public expect fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr): Bool

public expect fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt): Long

public expect fun cMCreateProfile(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool

public expect fun cMCreateProfileW(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool

public expect fun cMCreateTransform(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long

public expect fun cMCreateTransformExt(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long

public expect fun cMCreateTransformExtW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long

public expect fun cMCreateTransformW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long

public expect fun cMDeleteTransform(hcmtransform: Long): Bool

public expect fun cMGetInfo(dwinfo: UInt): UInt

public expect fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool

public expect fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr): Bool

public expect fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr, ctoutput: Colortype): Bool

public expect fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr, dwflags: UInt): Bool

public expect fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool

public expect fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool

public expect fun checkColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paresult: MutPtr): Bool

public expect fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr, dlpbuffer: MutPtr, ncount: UInt): Bool

public expect fun closeColorProfile(hprofile: Long): Bool

public expect fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool

public expect fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool

public expect fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult

public expect fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr): Hresult

public expect fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr, profilecount: MutPtr): Hresult

public expect fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr): Hresult

public expect fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult

public expect fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult

public expect fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool

public expect fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool

public expect fun createColorSpaceA(lplcs: ConstPtr): Hcolorspace

public expect fun createColorSpaceW(lplcs: ConstPtr): Hcolorspace

public expect fun createColorTransformA(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun createColorTransformW(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long

public expect fun createDeviceLinkProfile(hprofile: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr, indexpreferredcmm: UInt): Bool

public expect fun createMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long

public expect fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool

public expect fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool

public expect fun deleteColorSpace(hcs: Hcolorspace): Bool

public expect fun deleteColorTransform(hxform: Long): Bool

public expect fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool

public expect fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool

public expect fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool

public expect fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int

public expect fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int

public expect fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt

public expect fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr): Bool

public expect fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr): Bool

public expect fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr, pelement: MutPtr, pbreference: MutPtr): Bool

public expect fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr): Bool

public expect fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr, pcbprofile: MutPtr): Bool

public expect fun getColorProfileHeader(hprofile: Long, pheader: MutPtr): Bool

public expect fun getColorSpace(hdc: Hdc): Hcolorspace

public expect fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr): Bool

public expect fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr): Bool

public expect fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pstr): Bool

public expect fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pwstr): Bool

public expect fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool

public expect fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool

public expect fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool

public expect fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr, pcbps2colorrenderingdictionary: MutPtr, pbbinary: MutPtr): Bool

public expect fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr, pcbps2colorrenderingintent: MutPtr): Bool

public expect fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr, pcbps2colorspacearray: MutPtr, pbbinary: MutPtr): Bool

public expect fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr): Bool

public expect fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr): Bool

public expect fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool

public expect fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool

public expect fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr): Bool

public expect fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr): Bool

public expect fun openColorProfileA(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun openColorProfileW(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long

public expect fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool

public expect fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool

public expect fun selectCMM(dwcmmtype: UInt): Bool

public expect fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr, pelement: ConstPtr): Bool

public expect fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool

public expect fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool

public expect fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr): Bool

public expect fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace

public expect fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr): Bool

public expect fun setICMMode(hdc: Hdc, mode: IcmMode): Int

public expect fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool

public expect fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool

public expect fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool

public expect fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool

public expect fun setupColorMatchingA(pcms: MutPtr): Bool

public expect fun setupColorMatchingW(pcms: MutPtr): Bool

public expect fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool

public expect fun translateColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr, ctoutput: Colortype): Bool

public expect fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool

public expect fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool

public expect fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool

public expect fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool

public expect fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool

public expect fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool

public expect fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, paresult: MutPtr): Bool

public expect fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long

public expect fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool

public expect fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pbuffer: MutPtr, dwsize: UInt, pnprofiles: MutPtr): Bool

public expect fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pdwsize: MutPtr): Bool

public expect fun wcsGetCalibrationManagementState(pbisenabled: MutPtr): Bool

public expect fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool

public expect fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr): Bool

public expect fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr): Bool

public expect fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr): Bool

public expect fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long

public expect fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool

public expect fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool

public expect fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool

public expect fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool

public expect fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr): Bool
