@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgbtriple

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA")

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW")

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCheckColors")

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr<Rgbtriple>, lparesult: MutPtr<UByte>, ncount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut")

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr<UByte>, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCheckRGBs")

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr<ConstPtr<Byte>>, paindex: MutPtr<UInt>, dwcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex")

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr<UInt>, pacolorname: MutPtr<MutPtr<Byte>>, dwcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName")

public actual fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintents: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr<MutPtr<UByte>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile")

public actual fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintents: ConstPtr<UInt>, nintents: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform")

public actual fun cMCreateProfile(lpcolorspace: MutPtr<Logcolorspacea>, lpprofiledata: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateProfile")

public actual fun cMCreateProfileW(lpcolorspace: MutPtr<Logcolorspacew>, lpprofiledata: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateProfileW")

public actual fun cMCreateTransform(lpcolorspace: ConstPtr<Logcolorspacea>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateTransform")

public actual fun cMCreateTransformExt(lpcolorspace: ConstPtr<Logcolorspacea>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateTransformExt")

public actual fun cMCreateTransformExtW(lpcolorspace: ConstPtr<Logcolorspacew>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateTransformExtW")

public actual fun cMCreateTransformW(lpcolorspace: ConstPtr<Logcolorspacew>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMCreateTransformW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemCMDeleteTransform")
private external fun wasiWindowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform: Long): Int

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    wasiWindowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemCMGetInfo")
private external fun wasiWindowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo: Int): Int

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    wasiWindowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo.toInt()).toUInt()

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr<NamedProfileInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo")

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMIsProfileValid")

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr<Color>, ctoutput: Colortype): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMTranslateColors")

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMTranslateRGB")

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMTranslateRGBs")

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt")

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr<UByte>, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCheckBitmapBits")

public actual fun checkColors(hcolortransform: Long, painputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, paresult: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCheckColors")

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr<Rgbtriple>, dlpbuffer: MutPtr<CVoid>, ncount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCheckColorsInGamut")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemCloseColorProfile")
private external fun wasiWindowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile: Long): Int

public actual fun closeColorProfile(hprofile: Long): Bool =
    wasiWindowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile)

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorCorrectPalette")

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorMatchToTarget")

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileAddDisplayAssociation")

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileGetDisplayDefault")

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr<MutPtr<Pwstr>>, profilecount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileGetDisplayList")

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr<WcsProfileManagementScope>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileGetDisplayUserScope")

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileRemoveDisplayAssociation")

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemColorProfileSetDisplayDefaultAssociation")

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr<ConstPtr<Byte>>, paindex: MutPtr<UInt>, dwcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemConvertColorNameToIndex")

public actual fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr<UInt>, pacolorname: MutPtr<MutPtr<Byte>>, dwcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemConvertIndexToColorName")

public actual fun createColorSpaceA(lplcs: ConstPtr<Logcolorspacea>): Hcolorspace =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateColorSpaceA")

public actual fun createColorSpaceW(lplcs: ConstPtr<Logcolorspacew>): Hcolorspace =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateColorSpaceW")

public actual fun createColorTransformA(plogcolorspace: ConstPtr<Logcolorspacea>, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateColorTransformA")

public actual fun createColorTransformW(plogcolorspace: ConstPtr<Logcolorspacew>, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateColorTransformW")

public actual fun createDeviceLinkProfile(hprofile: ConstPtr<Long>, nprofiles: UInt, padwintent: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr<MutPtr<UByte>>, indexpreferredcmm: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile")

public actual fun createMultiProfileTransform(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintent: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform")

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr<Logcolorspacea>, pprofile: MutPtr<MutPtr<UByte>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA")

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr<Logcolorspacew>, pprofile: MutPtr<MutPtr<UByte>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW")

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemDeleteColorSpace")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemDeleteColorTransform")
private external fun wasiWindowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform: Long): Int

public actual fun deleteColorTransform(hxform: Long): Bool =
    wasiWindowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform)

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA")

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW")

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr<Enumtypea>, penumerationbuffer: MutPtr<UByte>, pdwsizeofenumerationbuffer: MutPtr<UInt>, pnprofiles: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemEnumColorProfilesA")

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr<Enumtypew>, penumerationbuffer: MutPtr<UByte>, pdwsizeofenumerationbuffer: MutPtr<UInt>, pnprofiles: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemEnumColorProfilesW")

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemEnumICMProfilesA")

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemEnumICMProfilesW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemGetCMMInfo")
private external fun wasiWindowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform: Long, param1: Int): Int

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    wasiWindowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform, param1.toInt()).toUInt()

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorDirectoryA")

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorDirectoryW")

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr<UInt>, pelement: MutPtr<CVoid>, pbreference: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorProfileElement")

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorProfileElementTag")

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr<UByte>, pcbprofile: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle")

public actual fun getColorProfileHeader(hprofile: Long, pheader: MutPtr<Profileheader>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorProfileHeader")

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetColorSpace")

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetCountColorProfileElements")

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp")

public actual fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr<UInt>, pszfilename: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetICMProfileA")

public actual fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr<UInt>, pszfilename: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetICMProfileW")

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr<Logcolorspacea>, nsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetLogColorSpaceA")

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr<Logcolorspacew>, nsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetLogColorSpaceW")

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr<NamedProfileInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetNamedProfileInfo")

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr<UByte>, pcbps2colorrenderingdictionary: MutPtr<UInt>, pbbinary: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary")

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr<UByte>, pcbps2colorrenderingintent: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent")

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr<UByte>, pcbps2colorspacearray: MutPtr<UInt>, pbbinary: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray")

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA")

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW")

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemInstallColorProfileA")

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemInstallColorProfileW")

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent")

public actual fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemIsColorProfileValid")

public actual fun openColorProfileA(pprofile: ConstPtr<Profile>, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemOpenColorProfileA")

public actual fun openColorProfileW(pprofile: ConstPtr<Profile>, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemOpenColorProfileW")

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemRegisterCMMA")

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemRegisterCMMW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemSelectCMM")
private external fun wasiWindowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype: Int): Int

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    wasiWindowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype.toInt())

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr<UInt>, pelement: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetColorProfileElement")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemSetColorProfileElementReference")
private external fun wasiWindowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile: Long, newtag: Int, reftag: Int): Int

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    wasiWindowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile, newtag.toInt(), reftag.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemSetColorProfileElementSize")
private external fun wasiWindowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile: Long, tagtype: Int, pcbelement: Int): Int

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    wasiWindowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile, tagtype.toInt(), pcbelement.toInt())

public actual fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr<Profileheader>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetColorProfileHeader")

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetColorSpace")

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp")

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetICMMode")

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetICMProfileA")

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetICMProfileW")

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA")

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW")

public actual fun setupColorMatchingA(pcms: MutPtr<Colormatchsetupa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetupColorMatchingA")

public actual fun setupColorMatchingW(pcms: MutPtr<Colormatchsetupw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemSetupColorMatchingW")

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemTranslateBitmapBits")

public actual fun translateColors(hcolortransform: Long, painputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr<Color>, ctoutput: Colortype): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemTranslateColors")

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUninstallColorProfileA")

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUninstallColorProfileW")

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUnregisterCMMA")

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUnregisterCMMW")

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA")

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW")

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice")

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr<CVoid>, paresult: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsCheckColors")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemWcsCreateIccProfile")
private external fun wasiWindowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile: Long, dwoptions: Int): Long

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    wasiWindowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile, dwoptions.toInt())

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice")

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr<Enumtypew>, pbuffer: MutPtr<UByte>, dwsize: UInt, pnprofiles: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles")

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr<Enumtypew>, pdwsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize")

public actual fun wcsGetCalibrationManagementState(pbisenabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState")

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile")

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize")

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent")

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles")

public actual fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr<Profile>, pcampprofile: ConstPtr<Profile>, pgmmpprofile: ConstPtr<Profile>, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA")

public actual fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr<Profile>, pcampprofile: ConstPtr<Profile>, pgmmpprofile: ConstPtr<Profile>, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState")
private external fun wasiWindowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled: Int): Int

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    wasiWindowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled)

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent")
private external fun wasiWindowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope: Int, dwrenderingintent: Int): Int

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    wasiWindowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt())

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles")

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr<CVoid>, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiColorsystemWcsTranslateColors")
