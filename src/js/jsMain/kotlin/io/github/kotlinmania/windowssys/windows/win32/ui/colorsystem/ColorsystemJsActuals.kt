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

private val windowsWin32UiColorsystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCheckColors(hcmtransform.toString(), lpainputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, lparesult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr, lparesult: MutPtr, ncount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(hcmtransform.toString(), lpargbtriple.rawAddress.toString(), lparesult.rawAddress.toString(), ncount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCheckRGBs(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lparesult.rawAddress.toString(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(hprofile.toString(), pacolorname.rawAddress.toString(), paindex.rawAddress.toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(hprofile.toString(), paindex.rawAddress.toString(), pacolorname.rawAddress.toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintents.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), lpprofiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintents.rawAddress.toString(), nintents.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfile(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateProfile(lpcolorspace.rawAddress.toString(), lpprofiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfileW(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateProfileW(lpcolorspace.rawAddress.toString(), lpprofiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransform(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateTransform(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExt(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateTransformExt(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExtW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMCreateTransformW(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMIsProfileValid(hprofile.toString(), lpbvalid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMTranslateColors(hcmtransform.toString(), lpainputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, lpaoutputcolors.rawAddress.toString(), ctoutput) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMTranslateRGB(hcmtransform.toString(), colorref.toInt(), lpcolorref.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMTranslateRGBs(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lpdestbits.rawAddress.toString(), bmoutput, dwtranslatedirection.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), lpdestbits.rawAddress.toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCheckBitmapBits(hcolortransform.toString(), psrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), paresult.rawAddress.toString(), 0L.toString(), lpcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paresult: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCheckColors(hcolortransform.toString(), painputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, paresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr, dlpbuffer: MutPtr, ncount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCheckColorsInGamut(hdc.rawAddress.toString(), lprgbtriple.rawAddress.toString(), dlpbuffer.rawAddress.toString(), ncount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeColorProfile(hprofile: Long): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemColorCorrectPalette(hdc.rawAddress.toString(), hpal.rawAddress.toString(), defirst.toInt(), num.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemColorMatchToTarget(hdc.rawAddress.toString(), hdctarget.rawAddress.toString(), action.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr, profilecount: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(hprofile.toString(), pacolorname.rawAddress.toString(), paindex.rawAddress.toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemConvertIndexToColorName(hprofile.toString(), paindex.rawAddress.toString(), pacolorname.rawAddress.toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceA(lplcs: ConstPtr): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAddon != null) MutPtr((windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateColorSpaceA(lplcs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceW(lplcs: ConstPtr): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAddon != null) MutPtr((windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateColorSpaceW(lplcs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformA(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateColorTransformA(plogcolorspace.rawAddress.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformW(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateColorTransformW(plogcolorspace.rawAddress.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeviceLinkProfile(hprofile: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr, indexpreferredcmm: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(hprofile.rawAddress.toString(), nprofiles.toInt(), padwintent.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), pprofiledata.rawAddress.toString(), indexpreferredcmm.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintent.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(plogcolorspace.rawAddress.toString(), pprofile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(plogcolorspace.rawAddress.toString(), pprofile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemDeleteColorSpace(hcs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorTransform(hxform: Long): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemEnumColorProfilesA(pmachinename.rawAddress.toString(), penumrecord.rawAddress.toString(), penumerationbuffer.rawAddress.toString(), pdwsizeofenumerationbuffer.rawAddress.toString(), pnprofiles.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemEnumColorProfilesW(pmachinename.rawAddress.toString(), penumrecord.rawAddress.toString(), penumerationbuffer.rawAddress.toString(), pdwsizeofenumerationbuffer.rawAddress.toString(), pnprofiles.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemEnumICMProfilesA(hdc.rawAddress.toString(), 0L.toString(), param2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemEnumICMProfilesW(hdc.rawAddress.toString(), 0L.toString(), param2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform.toString(), param1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorDirectoryA(pmachinename.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorDirectoryW(pmachinename.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr, pelement: MutPtr, pbreference: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress.toString(), pelement.rawAddress.toString(), pbreference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(hprofile.toString(), dwindex.toInt(), ptag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr, pcbprofile: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(hprofile.toString(), pprofile.rawAddress.toString(), pcbprofile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileHeader(hprofile: Long, pheader: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorProfileHeader(hprofile.toString(), pheader.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAddon != null) MutPtr((windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetColorSpace(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(hprofile.toString(), pnelementcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(hdc.rawAddress.toString(), lpramp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetICMProfileA(hdc.rawAddress.toString(), pbufsize.rawAddress.toString(), pszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetICMProfileW(hdc.rawAddress.toString(), pbufsize.rawAddress.toString(), pszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(hcolorspace.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(hcolorspace.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr, pcbps2colorrenderingdictionary: MutPtr, pbbinary: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(hprofile.toString(), dwintent.toInt(), pps2colorrenderingdictionary.rawAddress.toString(), pcbps2colorrenderingdictionary.rawAddress.toString(), pbbinary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr, pcbps2colorrenderingintent: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(hprofile.toString(), dwintent.toInt(), pbuffer.rawAddress.toString(), pcbps2colorrenderingintent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr, pcbps2colorspacearray: MutPtr, pbbinary: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(hprofile.toString(), dwintent.toInt(), dwcsatype.toInt(), pps2colorspacearray.rawAddress.toString(), pcbps2colorspacearray.rawAddress.toString(), pbbinary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(pmachinename.rawAddress.toString(), dwscs.toInt(), pbuffer.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(pmachinename.rawAddress.toString(), dwscs.toInt(), pbuffer.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemInstallColorProfileA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemInstallColorProfileW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(hprofile.toString(), tag.toInt(), pbpresent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemIsColorProfileValid(hprofile.toString(), pbvalid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileA(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemOpenColorProfileA(pprofile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileW(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemOpenColorProfileW(pprofile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemRegisterCMMA(pmachinename.rawAddress.toString(), cmmid.toInt(), pcmmdll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemRegisterCMMW(pmachinename.rawAddress.toString(), cmmid.toInt(), pcmmdll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr, pelement: ConstPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress.toString(), pelement.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile.toString(), newtag.toInt(), reftag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile.toString(), tagtype.toInt(), pcbelement.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetColorProfileHeader(hprofile.toString(), pheader.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAddon != null) MutPtr((windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetColorSpace(hdc.rawAddress.toString(), hcs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(hdc.rawAddress.toString(), lpramp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetICMMode(hdc.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetICMProfileA(hdc.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetICMProfileW(hdc.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(pmachinename.rawAddress.toString(), dwprofileid.toInt(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(pmachinename.rawAddress.toString(), dwprofileid.toInt(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingA(pcms: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetupColorMatchingA(pcms.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingW(pcms: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemSetupColorMatchingW(pcms.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemTranslateBitmapBits(hcolortransform.toString(), psrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), pdestbits.rawAddress.toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemTranslateColors(hcolortransform.toString(), painputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, paoutputcolors.rawAddress.toString(), ctoutput) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUninstallColorProfileA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), bdelete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUninstallColorProfileW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), bdelete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUnregisterCMMA(pmachinename.rawAddress.toString(), cmmid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUnregisterCMMW(pmachinename.rawAddress.toString(), cmmid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(reserved.toInt(), lpszcmid.rawAddress.toString(), lpszfilename.rawAddress.toString(), command.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(reserved.toInt(), lpszcmid.rawAddress.toString(), lpszfilename.rawAddress.toString(), command.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(scope, pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, paresult: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsCheckColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress.toString(), paresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile.toString(), dwoptions.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(scope, pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pbuffer: MutPtr, dwsize: UInt, pnprofiles: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(scope, penumrecord.rawAddress.toString(), pbuffer.rawAddress.toString(), dwsize.toInt(), pnprofiles.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pdwsize: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(scope, penumrecord.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetCalibrationManagementState(pbisenabled: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(pbisenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pcbprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(scope, pdwrenderingintent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(pdevicename.rawAddress.toString(), dwdeviceclass.toInt(), puseperuserprofiles.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(pcdmpprofile.rawAddress.toString(), pcampprofile.rawAddress.toString(), pgmmpprofile.rawAddress.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(pcdmpprofile.rawAddress.toString(), pcampprofile.rawAddress.toString(), pgmmpprofile.rawAddress.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pprofilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(pdevicename.rawAddress.toString(), dwdeviceclass.toInt(), useperuserprofiles) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr): Bool =
    if (windowsWin32UiColorsystemNapiAddon != null) (windowsWin32UiColorsystemNapiAddon.windowssysWindowsWin32UiColorsystemWcsTranslateColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress.toString(), noutputchannels.toInt(), cdtoutput, cboutput.toInt(), poutputdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
