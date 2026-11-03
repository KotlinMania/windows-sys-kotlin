package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Foundation.LPARAM): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: PCSTR, param1: Foundation.LPARAM): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(param0: PCWSTR, param1: Foundation.LPARAM): Int
}

public fun AssociateColorProfileWithDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "AssociateColorProfileWithDeviceA", longArrayOf(pmachinename, pprofilename, pdevicename)).toInt()
}

public fun AssociateColorProfileWithDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "AssociateColorProfileWithDeviceW", longArrayOf(pmachinename, pprofilename, pdevicename)).toInt()
}

public fun CMCheckColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lparesult: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCheckColors", longArrayOf(hcmtransform, lpainputcolors, ncolors.toLong(), ctinput.toLong(), lparesult)).toInt()
}

public fun CMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: Long, lparesult: Long, ncount: UInt): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCheckColorsInGamut", longArrayOf(hcmtransform, lpargbtriple, lparesult, ncount.toLong())).toInt()
}

public fun CMCheckRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: Long, pfncallback: LPBMCALLBACKFN, ulcallbackdata: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCheckRGBs", longArrayOf(hcmtransform, lpsrcbits, bminput.toLong(), dwwidth.toLong(), dwheight.toLong(), dwstride.toLong(), lparesult, Win32DynamicFfi.objectSlot(pfncallback), Win32DynamicFfi.objectSlot(ulcallbackdata))).toInt()
}

public fun CMConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMConvertColorNameToIndex", longArrayOf(hprofile, pacolorname, paindex, dwcount.toLong())).toInt()
}

public fun CMConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMConvertIndexToColorName", longArrayOf(hprofile, paindex, pacolorname, dwcount.toLong())).toInt()
}

public fun CMCreateDeviceLinkProfile(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt, lpprofiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateDeviceLinkProfile", longArrayOf(pahprofiles, nprofiles.toLong(), padwintents, nintents.toLong(), dwflags.toLong(), lpprofiledata)).toInt()
}

public fun CMCreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintents: Long, nintents: UInt, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateMultiProfileTransform", longArrayOf(pahprofiles, nprofiles.toLong(), padwintents, nintents.toLong(), dwflags.toLong()))
}

public fun CMCreateProfile(lpcolorspace: Long, lpprofiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateProfile", longArrayOf(lpcolorspace, lpprofiledata)).toInt()
}

public fun CMCreateProfileW(lpcolorspace: Long, lpprofiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateProfileW", longArrayOf(lpcolorspace, lpprofiledata)).toInt()
}

public fun CMCreateTransform(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateTransform", longArrayOf(lpcolorspace, lpdevcharacter, lptargetdevcharacter))
}

public fun CMCreateTransformExt(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateTransformExt", longArrayOf(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags.toLong()))
}

public fun CMCreateTransformExtW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateTransformExtW", longArrayOf(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags.toLong()))
}

public fun CMCreateTransformW(lpcolorspace: Long, lpdevcharacter: Long, lptargetdevcharacter: Long): Long {
    return Win32DynamicFfi.invoke("icm32.dll", "CMCreateTransformW", longArrayOf(lpcolorspace, lpdevcharacter, lptargetdevcharacter))
}

public fun CMDeleteTransform(hcmtransform: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMDeleteTransform", longArrayOf(hcmtransform)).toInt()
}

public fun CMGetInfo(dwinfo: UInt): UInt {
    return Win32DynamicFfi.invoke("icm32.dll", "CMGetInfo", longArrayOf(dwinfo.toLong())).toUInt()
}

public fun CMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMGetNamedProfileInfo", longArrayOf(hprofile, pnamedprofileinfo)).toInt()
}

public fun CMIsProfileValid(hprofile: Long, lpbvalid: Long): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMIsProfileValid", longArrayOf(hprofile, lpbvalid)).toInt()
}

public fun CMTranslateColors(hcmtransform: Long, lpainputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, lpaoutputcolors: Long, ctoutput: COLORTYPE): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMTranslateColors", longArrayOf(hcmtransform, lpainputcolors, ncolors.toLong(), ctinput.toLong(), lpaoutputcolors, ctoutput.toLong())).toInt()
}

public fun CMTranslateRGB(hcmtransform: Long, colorref: Foundation.COLORREF, lpcolorref: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMTranslateRGB", longArrayOf(hcmtransform, Win32DynamicFfi.objectSlot(colorref), lpcolorref, dwflags.toLong())).toInt()
}

public fun CMTranslateRGBs(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwtranslatedirection: UInt): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMTranslateRGBs", longArrayOf(hcmtransform, lpsrcbits, bminput.toLong(), dwwidth.toLong(), dwheight.toLong(), dwstride.toLong(), lpdestbits, bmoutput.toLong(), dwtranslatedirection.toLong())).toInt()
}

public fun CMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, lpfncallback: LPBMCALLBACKFN, ulcallbackdata: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("icm32.dll", "CMTranslateRGBsExt", longArrayOf(hcmtransform, lpsrcbits, bminput.toLong(), dwwidth.toLong(), dwheight.toLong(), dwinputstride.toLong(), lpdestbits, bmoutput.toLong(), dwoutputstride.toLong(), Win32DynamicFfi.objectSlot(lpfncallback), Win32DynamicFfi.objectSlot(ulcallbackdata))).toInt()
}

public fun CheckBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: Long, pfncallback: LPBMCALLBACKFN, lpcallbackdata: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CheckBitmapBits", longArrayOf(hcolortransform, psrcbits, bminput.toLong(), dwwidth.toLong(), dwheight.toLong(), dwstride.toLong(), paresult, Win32DynamicFfi.objectSlot(pfncallback), Win32DynamicFfi.objectSlot(lpcallbackdata))).toInt()
}

public fun CheckColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paresult: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CheckColors", longArrayOf(hcolortransform, painputcolors, ncolors.toLong(), ctinput.toLong(), paresult)).toInt()
}

public fun CheckColorsInGamut(hdc: Graphics.Gdi.HDC, lprgbtriple: Long, dlpbuffer: Long, ncount: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CheckColorsInGamut", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lprgbtriple, dlpbuffer, ncount.toLong())).toInt()
}

public fun CloseColorProfile(hprofile: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CloseColorProfile", longArrayOf(hprofile)).toInt()
}

public fun ColorCorrectPalette(hdc: Graphics.Gdi.HDC, hpal: Graphics.Gdi.HPALETTE, defirst: UInt, num: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ColorCorrectPalette", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(hpal), defirst.toLong(), num.toLong())).toInt()
}

public fun ColorMatchToTarget(hdc: Graphics.Gdi.HDC, hdctarget: Graphics.Gdi.HDC, action: COLOR_MATCH_TO_TARGET_ACTION): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ColorMatchToTarget", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(hdctarget), action.toLong())).toInt()
}

public fun ColorProfileAddDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: Foundation.LUID, sourceid: UInt, setasdefault: BOOL, associateasadvancedcolor: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileAddDisplayAssociation", longArrayOf(scope.toLong(), profilename, Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong(), setasdefault.toLong(), associateasadvancedcolor.toLong())).toInt()
}

public fun ColorProfileGetDisplayDefault(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: Foundation.LUID, sourceid: UInt, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, profilename: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileGetDisplayDefault", longArrayOf(scope.toLong(), Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong(), profiletype.toLong(), profilesubtype.toLong(), profilename)).toInt()
}

public fun ColorProfileGetDisplayList(scope: WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid: Foundation.LUID, sourceid: UInt, profilelist: Long, profilecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileGetDisplayList", longArrayOf(scope.toLong(), Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong(), profilelist, profilecount)).toInt()
}

public fun ColorProfileGetDisplayUserScope(targetadapterid: Foundation.LUID, sourceid: UInt, scope: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileGetDisplayUserScope", longArrayOf(Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong(), scope)).toInt()
}

public fun ColorProfileRemoveDisplayAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, targetadapterid: Foundation.LUID, sourceid: UInt, dissociateadvancedcolor: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileRemoveDisplayAssociation", longArrayOf(scope.toLong(), profilename, Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong(), dissociateadvancedcolor.toLong())).toInt()
}

public fun ColorProfileSetDisplayDefaultAssociation(scope: WCS_PROFILE_MANAGEMENT_SCOPE, profilename: PCWSTR, profiletype: COLORPROFILETYPE, profilesubtype: COLORPROFILESUBTYPE, targetadapterid: Foundation.LUID, sourceid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("mscms.dll", "ColorProfileSetDisplayDefaultAssociation", longArrayOf(scope.toLong(), profilename, profiletype.toLong(), profilesubtype.toLong(), Win32DynamicFfi.objectSlot(targetadapterid), sourceid.toLong())).toInt()
}

public fun ConvertColorNameToIndex(hprofile: Long, pacolorname: Long, paindex: Long, dwcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "ConvertColorNameToIndex", longArrayOf(hprofile, pacolorname, paindex, dwcount.toLong())).toInt()
}

public fun ConvertIndexToColorName(hprofile: Long, paindex: Long, pacolorname: Long, dwcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "ConvertIndexToColorName", longArrayOf(hprofile, paindex, pacolorname, dwcount.toLong())).toInt()
}

public fun CreateColorSpaceA(lplcs: Long): HCOLORSPACE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateColorSpaceA", longArrayOf(lplcs))
}

public fun CreateColorSpaceW(lplcs: Long): HCOLORSPACE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateColorSpaceW", longArrayOf(lplcs))
}

public fun CreateColorTransformA(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateColorTransformA", longArrayOf(plogcolorspace, hdestprofile, htargetprofile, dwflags.toLong()))
}

public fun CreateColorTransformW(plogcolorspace: Long, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateColorTransformW", longArrayOf(plogcolorspace, hdestprofile, htargetprofile, dwflags.toLong()))
}

public fun CreateDeviceLinkProfile(hprofile: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, pprofiledata: Long, indexpreferredcmm: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateDeviceLinkProfile", longArrayOf(hprofile, nprofiles.toLong(), padwintent, nintents.toLong(), dwflags.toLong(), pprofiledata, indexpreferredcmm.toLong())).toInt()
}

public fun CreateMultiProfileTransform(pahprofiles: Long, nprofiles: UInt, padwintent: Long, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateMultiProfileTransform", longArrayOf(pahprofiles, nprofiles.toLong(), padwintent, nintents.toLong(), dwflags.toLong(), indexpreferredcmm.toLong()))
}

public fun CreateProfileFromLogColorSpaceA(plogcolorspace: Long, pprofile: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateProfileFromLogColorSpaceA", longArrayOf(plogcolorspace, pprofile)).toInt()
}

public fun CreateProfileFromLogColorSpaceW(plogcolorspace: Long, pprofile: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "CreateProfileFromLogColorSpaceW", longArrayOf(plogcolorspace, pprofile)).toInt()
}

public fun DeleteColorSpace(hcs: HCOLORSPACE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DeleteColorSpace", longArrayOf(hcs)).toInt()
}

public fun DeleteColorTransform(hxform: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "DeleteColorTransform", longArrayOf(hxform)).toInt()
}

public fun DisassociateColorProfileFromDeviceA(pmachinename: PCSTR, pprofilename: PCSTR, pdevicename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "DisassociateColorProfileFromDeviceA", longArrayOf(pmachinename, pprofilename, pdevicename)).toInt()
}

public fun DisassociateColorProfileFromDeviceW(pmachinename: PCWSTR, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "DisassociateColorProfileFromDeviceW", longArrayOf(pmachinename, pprofilename, pdevicename)).toInt()
}

public fun EnumColorProfilesA(pmachinename: PCSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "EnumColorProfilesA", longArrayOf(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles)).toInt()
}

public fun EnumColorProfilesW(pmachinename: PCWSTR, penumrecord: Long, penumerationbuffer: Long, pdwsizeofenumerationbuffer: Long, pnprofiles: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "EnumColorProfilesW", longArrayOf(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles)).toInt()
}

public fun EnumICMProfilesA(hdc: Graphics.Gdi.HDC, proc: ICMENUMPROCA, param2: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumICMProfilesA", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(proc), Win32DynamicFfi.objectSlot(param2))).toInt()
}

public fun EnumICMProfilesW(hdc: Graphics.Gdi.HDC, proc: ICMENUMPROCW, param2: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumICMProfilesW", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(proc), Win32DynamicFfi.objectSlot(param2))).toInt()
}

public fun GetCMMInfo(hcolortransform: Long, param1: UInt): UInt {
    return Win32DynamicFfi.invoke("mscms.dll", "GetCMMInfo", longArrayOf(hcolortransform, param1.toLong())).toUInt()
}

public fun GetColorDirectoryA(pmachinename: PCSTR, pbuffer: PSTR, pdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorDirectoryA", longArrayOf(pmachinename, pbuffer, pdwsize)).toInt()
}

public fun GetColorDirectoryW(pmachinename: PCWSTR, pbuffer: PWSTR, pdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorDirectoryW", longArrayOf(pmachinename, pbuffer, pdwsize)).toInt()
}

public fun GetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long, pbreference: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorProfileElement", longArrayOf(hprofile, tag.toLong(), dwoffset.toLong(), pcbelement, pelement, pbreference)).toInt()
}

public fun GetColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorProfileElementTag", longArrayOf(hprofile, dwindex.toLong(), ptag)).toInt()
}

public fun GetColorProfileFromHandle(hprofile: Long, pprofile: Long, pcbprofile: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorProfileFromHandle", longArrayOf(hprofile, pprofile, pcbprofile)).toInt()
}

public fun GetColorProfileHeader(hprofile: Long, pheader: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetColorProfileHeader", longArrayOf(hprofile, pheader)).toInt()
}

public fun GetColorSpace(hdc: Graphics.Gdi.HDC): HCOLORSPACE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetColorSpace", longArrayOf(Win32DynamicFfi.objectSlot(hdc)))
}

public fun GetCountColorProfileElements(hprofile: Long, pnelementcount: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetCountColorProfileElements", longArrayOf(hprofile, pnelementcount)).toInt()
}

public fun GetDeviceGammaRamp(hdc: Graphics.Gdi.HDC, lpramp: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDeviceGammaRamp", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpramp)).toInt()
}

public fun GetICMProfileA(hdc: Graphics.Gdi.HDC, pbufsize: Long, pszfilename: PSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetICMProfileA", longArrayOf(Win32DynamicFfi.objectSlot(hdc), pbufsize, pszfilename)).toInt()
}

public fun GetICMProfileW(hdc: Graphics.Gdi.HDC, pbufsize: Long, pszfilename: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetICMProfileW", longArrayOf(Win32DynamicFfi.objectSlot(hdc), pbufsize, pszfilename)).toInt()
}

public fun GetLogColorSpaceA(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetLogColorSpaceA", longArrayOf(hcolorspace, lpbuffer, nsize.toLong())).toInt()
}

public fun GetLogColorSpaceW(hcolorspace: HCOLORSPACE, lpbuffer: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetLogColorSpaceW", longArrayOf(hcolorspace, lpbuffer, nsize.toLong())).toInt()
}

public fun GetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetNamedProfileInfo", longArrayOf(hprofile, pnamedprofileinfo)).toInt()
}

public fun GetPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: Long, pcbps2colorrenderingdictionary: Long, pbbinary: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetPS2ColorRenderingDictionary", longArrayOf(hprofile, dwintent.toLong(), pps2colorrenderingdictionary, pcbps2colorrenderingdictionary, pbbinary)).toInt()
}

public fun GetPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: Long, pcbps2colorrenderingintent: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetPS2ColorRenderingIntent", longArrayOf(hprofile, dwintent.toLong(), pbuffer, pcbps2colorrenderingintent)).toInt()
}

public fun GetPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: Long, pcbps2colorspacearray: Long, pbbinary: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetPS2ColorSpaceArray", longArrayOf(hprofile, dwintent.toLong(), dwcsatype.toLong(), pps2colorspacearray, pcbps2colorspacearray, pbbinary)).toInt()
}

public fun GetStandardColorSpaceProfileA(pmachinename: PCSTR, dwscs: UInt, pbuffer: PSTR, pcbsize: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetStandardColorSpaceProfileA", longArrayOf(pmachinename, dwscs.toLong(), pbuffer, pcbsize)).toInt()
}

public fun GetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwscs: UInt, pbuffer: PWSTR, pcbsize: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "GetStandardColorSpaceProfileW", longArrayOf(pmachinename, dwscs.toLong(), pbuffer, pcbsize)).toInt()
}

public fun InstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "InstallColorProfileA", longArrayOf(pmachinename, pprofilename)).toInt()
}

public fun InstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "InstallColorProfileW", longArrayOf(pmachinename, pprofilename)).toInt()
}

public fun IsColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "IsColorProfileTagPresent", longArrayOf(hprofile, tag.toLong(), pbpresent)).toInt()
}

public fun IsColorProfileValid(hprofile: Long, pbvalid: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "IsColorProfileValid", longArrayOf(hprofile, pbvalid)).toInt()
}

public fun OpenColorProfileA(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "OpenColorProfileA", longArrayOf(pprofile, dwdesiredaccess.toLong(), dwsharemode.toLong(), dwcreationmode.toLong()))
}

public fun OpenColorProfileW(pprofile: Long, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "OpenColorProfileW", longArrayOf(pprofile, dwdesiredaccess.toLong(), dwsharemode.toLong(), dwcreationmode.toLong()))
}

public fun RegisterCMMA(pmachinename: PCSTR, cmmid: UInt, pcmmdll: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "RegisterCMMA", longArrayOf(pmachinename, cmmid.toLong(), pcmmdll)).toInt()
}

public fun RegisterCMMW(pmachinename: PCWSTR, cmmid: UInt, pcmmdll: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "RegisterCMMW", longArrayOf(pmachinename, cmmid.toLong(), pcmmdll)).toInt()
}

public fun SelectCMM(dwcmmtype: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SelectCMM", longArrayOf(dwcmmtype.toLong())).toInt()
}

public fun SetColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: Long, pelement: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetColorProfileElement", longArrayOf(hprofile, tag.toLong(), dwoffset.toLong(), pcbelement, pelement)).toInt()
}

public fun SetColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetColorProfileElementReference", longArrayOf(hprofile, newtag.toLong(), reftag.toLong())).toInt()
}

public fun SetColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetColorProfileElementSize", longArrayOf(hprofile, tagtype.toLong(), pcbelement.toLong())).toInt()
}

public fun SetColorProfileHeader(hprofile: Long, pheader: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetColorProfileHeader", longArrayOf(hprofile, pheader)).toInt()
}

public fun SetColorSpace(hdc: Graphics.Gdi.HDC, hcs: HCOLORSPACE): HCOLORSPACE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetColorSpace", longArrayOf(Win32DynamicFfi.objectSlot(hdc), hcs))
}

public fun SetDeviceGammaRamp(hdc: Graphics.Gdi.HDC, lpramp: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDeviceGammaRamp", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpramp)).toInt()
}

public fun SetICMMode(hdc: Graphics.Gdi.HDC, mode: ICM_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetICMMode", longArrayOf(Win32DynamicFfi.objectSlot(hdc), mode.toLong())).toInt()
}

public fun SetICMProfileA(hdc: Graphics.Gdi.HDC, lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetICMProfileA", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpfilename)).toInt()
}

public fun SetICMProfileW(hdc: Graphics.Gdi.HDC, lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetICMProfileW", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpfilename)).toInt()
}

public fun SetStandardColorSpaceProfileA(pmachinename: PCSTR, dwprofileid: UInt, pprofilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetStandardColorSpaceProfileA", longArrayOf(pmachinename, dwprofileid.toLong(), pprofilename)).toInt()
}

public fun SetStandardColorSpaceProfileW(pmachinename: PCWSTR, dwprofileid: UInt, pprofilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SetStandardColorSpaceProfileW", longArrayOf(pmachinename, dwprofileid.toLong(), pprofilename)).toInt()
}

public fun SetupColorMatchingA(pcms: Long): BOOL {
    return Win32DynamicFfi.invoke("icmui.dll", "SetupColorMatchingA", longArrayOf(pcms)).toInt()
}

public fun SetupColorMatchingW(pcms: Long): BOOL {
    return Win32DynamicFfi.invoke("icmui.dll", "SetupColorMatchingW", longArrayOf(pcms)).toInt()
}

public fun TranslateBitmapBits(hcolortransform: Long, psrcbits: Long, bminput: BMFORMAT, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: Long, bmoutput: BMFORMAT, dwoutputstride: UInt, pfncallback: LPBMCALLBACKFN, ulcallbackdata: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "TranslateBitmapBits", longArrayOf(hcolortransform, psrcbits, bminput.toLong(), dwwidth.toLong(), dwheight.toLong(), dwinputstride.toLong(), pdestbits, bmoutput.toLong(), dwoutputstride.toLong(), Win32DynamicFfi.objectSlot(pfncallback), Win32DynamicFfi.objectSlot(ulcallbackdata))).toInt()
}

public fun TranslateColors(hcolortransform: Long, painputcolors: Long, ncolors: UInt, ctinput: COLORTYPE, paoutputcolors: Long, ctoutput: COLORTYPE): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "TranslateColors", longArrayOf(hcolortransform, painputcolors, ncolors.toLong(), ctinput.toLong(), paoutputcolors, ctoutput.toLong())).toInt()
}

public fun UninstallColorProfileA(pmachinename: PCSTR, pprofilename: PCSTR, bdelete: BOOL): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "UninstallColorProfileA", longArrayOf(pmachinename, pprofilename, bdelete.toLong())).toInt()
}

public fun UninstallColorProfileW(pmachinename: PCWSTR, pprofilename: PCWSTR, bdelete: BOOL): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "UninstallColorProfileW", longArrayOf(pmachinename, pprofilename, bdelete.toLong())).toInt()
}

public fun UnregisterCMMA(pmachinename: PCSTR, cmmid: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "UnregisterCMMA", longArrayOf(pmachinename, cmmid.toLong())).toInt()
}

public fun UnregisterCMMW(pmachinename: PCWSTR, cmmid: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "UnregisterCMMW", longArrayOf(pmachinename, cmmid.toLong())).toInt()
}

public fun UpdateICMRegKeyA(reserved: UInt, lpszcmid: PCSTR, lpszfilename: PCSTR, command: ICM_COMMAND): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "UpdateICMRegKeyA", longArrayOf(reserved.toLong(), lpszcmid, lpszfilename, command.toLong())).toInt()
}

public fun UpdateICMRegKeyW(reserved: UInt, lpszcmid: PCWSTR, lpszfilename: PCWSTR, command: ICM_COMMAND): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "UpdateICMRegKeyW", longArrayOf(reserved.toLong(), lpszcmid, lpszfilename, command.toLong())).toInt()
}

public fun WcsAssociateColorProfileWithDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsAssociateColorProfileWithDevice", longArrayOf(scope.toLong(), pprofilename, pdevicename)).toInt()
}

public fun WcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, paresult: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsCheckColors", longArrayOf(hcolortransform, ncolors.toLong(), ninputchannels.toLong(), cdtinput.toLong(), cbinput.toLong(), pinputdata, paresult)).toInt()
}

public fun WcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsCreateIccProfile", longArrayOf(hwcsprofile, dwoptions.toLong()))
}

public fun WcsDisassociateColorProfileFromDevice(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename: PCWSTR, pdevicename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsDisassociateColorProfileFromDevice", longArrayOf(scope.toLong(), pprofilename, pdevicename)).toInt()
}

public fun WcsEnumColorProfiles(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pbuffer: Long, dwsize: UInt, pnprofiles: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsEnumColorProfiles", longArrayOf(scope.toLong(), penumrecord, pbuffer, dwsize.toLong(), pnprofiles)).toInt()
}

public fun WcsEnumColorProfilesSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord: Long, pdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsEnumColorProfilesSize", longArrayOf(scope.toLong(), penumrecord, pdwsize)).toInt()
}

public fun WcsGetCalibrationManagementState(pbisenabled: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsGetCalibrationManagementState", longArrayOf(pbisenabled)).toInt()
}

public fun WcsGetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, cbprofilename: UInt, pprofilename: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsGetDefaultColorProfile", longArrayOf(scope.toLong(), pdevicename, cptcolorprofiletype.toLong(), cpstcolorprofilesubtype.toLong(), dwprofileid.toLong(), cbprofilename.toLong(), pprofilename)).toInt()
}

public fun WcsGetDefaultColorProfileSize(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pcbprofilename: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsGetDefaultColorProfileSize", longArrayOf(scope.toLong(), pdevicename, cptcolorprofiletype.toLong(), cpstcolorprofilesubtype.toLong(), dwprofileid.toLong(), pcbprofilename)).toInt()
}

public fun WcsGetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsGetDefaultRenderingIntent", longArrayOf(scope.toLong(), pdwrenderingintent)).toInt()
}

public fun WcsGetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, puseperuserprofiles: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsGetUsePerUserProfiles", longArrayOf(pdevicename, dwdeviceclass.toLong(), puseperuserprofiles)).toInt()
}

public fun WcsOpenColorProfileA(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsOpenColorProfileA", longArrayOf(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess.toLong(), dwsharemode.toLong(), dwcreationmode.toLong(), dwflags.toLong()))
}

public fun WcsOpenColorProfileW(pcdmpprofile: Long, pcampprofile: Long, pgmmpprofile: Long, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsOpenColorProfileW", longArrayOf(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess.toLong(), dwsharemode.toLong(), dwcreationmode.toLong(), dwflags.toLong()))
}

public fun WcsSetCalibrationManagementState(bisenabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsSetCalibrationManagementState", longArrayOf(bisenabled.toLong())).toInt()
}

public fun WcsSetDefaultColorProfile(scope: WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename: PCWSTR, cptcolorprofiletype: COLORPROFILETYPE, cpstcolorprofilesubtype: COLORPROFILESUBTYPE, dwprofileid: UInt, pprofilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsSetDefaultColorProfile", longArrayOf(scope.toLong(), pdevicename, cptcolorprofiletype.toLong(), cpstcolorprofilesubtype.toLong(), dwprofileid.toLong(), pprofilename)).toInt()
}

public fun WcsSetDefaultRenderingIntent(scope: WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsSetDefaultRenderingIntent", longArrayOf(scope.toLong(), dwrenderingintent.toLong())).toInt()
}

public fun WcsSetUsePerUserProfiles(pdevicename: PCWSTR, dwdeviceclass: UInt, useperuserprofiles: BOOL): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsSetUsePerUserProfiles", longArrayOf(pdevicename, dwdeviceclass.toLong(), useperuserprofiles.toLong())).toInt()
}

public fun WcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: COLORDATATYPE, cbinput: UInt, pinputdata: Long, noutputchannels: UInt, cdtoutput: COLORDATATYPE, cboutput: UInt, poutputdata: Long): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "WcsTranslateColors", longArrayOf(hcolortransform, ncolors.toLong(), ninputchannels.toLong(), cdtinput.toLong(), cbinput.toLong(), pinputdata, noutputchannels.toLong(), cdtoutput.toLong(), cboutput.toLong(), poutputdata)).toInt()
}
