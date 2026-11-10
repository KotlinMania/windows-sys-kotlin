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

private val _windowsWin32UiColorsystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lparesult: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCheckColors(hcmtransform.toString(), (lpainputcolors?.value ?: 0L).toString(), ncolors.toInt(), ctinput, (lparesult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: COpaquePointer?, lparesult: COpaquePointer?, ncount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(hcmtransform.toString(), (lpargbtriple?.value ?: 0L).toString(), (lparesult?.value ?: 0L).toString(), ncount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: COpaquePointer?, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(hcmtransform.toString(), (lpsrcbits?.value ?: 0L).toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (lparesult?.value ?: 0L).toString(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(hprofile.toString(), (pacolorname?.value ?: 0L).toString(), (paindex?.value ?: 0L).toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(hprofile.toString(), (paindex?.value ?: 0L).toString(), (pacolorname?.value ?: 0L).toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateDeviceLinkProfile(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt, lpprofiledata: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile((pahprofiles?.value ?: 0L).toString(), nprofiles.toInt(), (padwintents?.value ?: 0L).toString(), nintents.toInt(), dwflags.toInt(), (lpprofiledata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform((pahprofiles?.value ?: 0L).toString(), nprofiles.toInt(), (padwintents?.value ?: 0L).toString(), nintents.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfile(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateProfile((lpcolorspace?.value ?: 0L).toString(), (lpprofiledata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfileW(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateProfileW((lpcolorspace?.value ?: 0L).toString(), (lpprofiledata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransform(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateTransform((lpcolorspace?.value ?: 0L).toString(), (lpdevcharacter?.value ?: 0L).toString(), (lptargetdevcharacter?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExt(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt((lpcolorspace?.value ?: 0L).toString(), (lpdevcharacter?.value ?: 0L).toString(), (lptargetdevcharacter?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExtW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW((lpcolorspace?.value ?: 0L).toString(), (lpdevcharacter?.value ?: 0L).toString(), (lptargetdevcharacter?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMCreateTransformW((lpcolorspace?.value ?: 0L).toString(), (lpdevcharacter?.value ?: 0L).toString(), (lptargetdevcharacter?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(hcmtransform.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMGetInfo(dwinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(hprofile.toString(), (pnamedprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(hprofile.toString(), (lpbvalid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMTranslateColors(hcmtransform.toString(), (lpainputcolors?.value ?: 0L).toString(), ncolors.toInt(), ctinput, (lpaoutputcolors?.value ?: 0L).toString(), ctoutput) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(hcmtransform.toString(), colorref.toInt(), (lpcolorref?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(hcmtransform.toString(), (lpsrcbits?.value ?: 0L).toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (lpdestbits?.value ?: 0L).toString(), bmoutput, dwtranslatedirection.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(hcmtransform.toString(), (lpsrcbits?.value ?: 0L).toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), (lpdestbits?.value ?: 0L).toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: COpaquePointer?, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_checkBitmapBits(hcolortransform.toString(), (psrcbits?.value ?: 0L).toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), (paresult?.value ?: 0L).toString(), 0L.toString(), lpcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paresult: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_checkColors(hcolortransform.toString(), (painputcolors?.value ?: 0L).toString(), ncolors.toInt(), ctinput, (paresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: COpaquePointer?, dlpbuffer: COpaquePointer?, ncount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_checkColorsInGamut((hdc?.value ?: 0L).toString(), (lprgbtriple?.value ?: 0L).toString(), (dlpbuffer?.value ?: 0L).toString(), ncount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeColorProfile(hprofile: Long): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_closeColorProfile(hprofile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_colorCorrectPalette((hdc?.value ?: 0L).toString(), (hpal?.value ?: 0L).toString(), defirst.toInt(), num.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_colorMatchToTarget((hdc?.value ?: 0L).toString(), (hdctarget?.value ?: 0L).toString(), action.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(hprofile.toString(), (pacolorname?.value ?: 0L).toString(), (paindex?.value ?: 0L).toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(hprofile.toString(), (paindex?.value ?: 0L).toString(), (pacolorname?.value ?: 0L).toString(), dwcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceA(lplcs: COpaquePointer?): Hcolorspace =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createColorSpaceA((lplcs?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceW(lplcs: COpaquePointer?): Hcolorspace =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createColorSpaceW((lplcs?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformA(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createColorTransformA((plogcolorspace?.value ?: 0L).toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformW(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createColorTransformW((plogcolorspace?.value ?: 0L).toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeviceLinkProfile(hprofile: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, pprofiledata: COpaquePointer?, indexpreferredcmm: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile((hprofile?.value ?: 0L).toString(), nprofiles.toInt(), (padwintent?.value ?: 0L).toString(), nintents.toInt(), dwflags.toInt(), (pprofiledata?.value ?: 0L).toString(), indexpreferredcmm.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform((pahprofiles?.value ?: 0L).toString(), nprofiles.toInt(), (padwintent?.value ?: 0L).toString(), nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA((plogcolorspace?.value ?: 0L).toString(), (pprofile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW((plogcolorspace?.value ?: 0L).toString(), (pprofile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_deleteColorSpace((hcs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorTransform(hxform: Long): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_deleteColorTransform(hxform.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_enumColorProfilesA((pmachinename?.value ?: 0L).toString(), (penumrecord?.value ?: 0L).toString(), (penumerationbuffer?.value ?: 0L).toString(), (pdwsizeofenumerationbuffer?.value ?: 0L).toString(), (pnprofiles?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_enumColorProfilesW((pmachinename?.value ?: 0L).toString(), (penumrecord?.value ?: 0L).toString(), (penumerationbuffer?.value ?: 0L).toString(), (pdwsizeofenumerationbuffer?.value ?: 0L).toString(), (pnprofiles?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_enumICMProfilesA((hdc?.value ?: 0L).toString(), 0L.toString(), param2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_enumICMProfilesW((hdc?.value ?: 0L).toString(), 0L.toString(), param2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getCMMInfo(hcolortransform.toString(), param1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorDirectoryA((pmachinename?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorDirectoryW((pmachinename?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?, pbreference: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), (pcbelement?.value ?: 0L).toString(), (pelement?.value ?: 0L).toString(), (pbreference?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(hprofile.toString(), dwindex.toInt(), (ptag?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: COpaquePointer?, pcbprofile: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(hprofile.toString(), (pprofile?.value ?: 0L).toString(), (pcbprofile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(hprofile.toString(), (pheader?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getColorSpace((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(hprofile.toString(), (pnelementcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp((hdc?.value ?: 0L).toString(), (lpramp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileA(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getICMProfileA((hdc?.value ?: 0L).toString(), (pbufsize?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileW(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getICMProfileW((hdc?.value ?: 0L).toString(), (pbufsize?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA((hcolorspace?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW((hcolorspace?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(hprofile.toString(), (pnamedprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: COpaquePointer?, pcbps2colorrenderingdictionary: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(hprofile.toString(), dwintent.toInt(), (pps2colorrenderingdictionary?.value ?: 0L).toString(), (pcbps2colorrenderingdictionary?.value ?: 0L).toString(), (pbbinary?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: COpaquePointer?, pcbps2colorrenderingintent: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(hprofile.toString(), dwintent.toInt(), (pbuffer?.value ?: 0L).toString(), (pcbps2colorrenderingintent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: COpaquePointer?, pcbps2colorspacearray: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(hprofile.toString(), dwintent.toInt(), dwcsatype.toInt(), (pps2colorspacearray?.value ?: 0L).toString(), (pcbps2colorspacearray?.value ?: 0L).toString(), (pbbinary?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA((pmachinename?.value ?: 0L).toString(), dwscs.toInt(), (pbuffer?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW((pmachinename?.value ?: 0L).toString(), dwscs.toInt(), (pbuffer?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_installColorProfileA((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_installColorProfileW((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(hprofile.toString(), tag.toInt(), (pbpresent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileValid(hprofile: Long, pbvalid: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_isColorProfileValid(hprofile.toString(), (pbvalid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileA(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_openColorProfileA((pprofile?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileW(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_openColorProfileW((pprofile?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_registerCMMA((pmachinename?.value ?: 0L).toString(), cmmid.toInt(), (pcmmdll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_registerCMMW((pmachinename?.value ?: 0L).toString(), cmmid.toInt(), (pcmmdll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_selectCMM(dwcmmtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), (pcbelement?.value ?: 0L).toString(), (pelement?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(hprofile.toString(), newtag.toInt(), reftag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(hprofile.toString(), tagtype.toInt(), pcbelement.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(hprofile.toString(), (pheader?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setColorSpace((hdc?.value ?: 0L).toString(), (hcs?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp((hdc?.value ?: 0L).toString(), (lpramp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setICMMode((hdc?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setICMProfileA((hdc?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setICMProfileW((hdc?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA((pmachinename?.value ?: 0L).toString(), dwprofileid.toInt(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW((pmachinename?.value ?: 0L).toString(), dwprofileid.toInt(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingA(pcms: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setupColorMatchingA((pcms?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingW(pcms: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_setupColorMatchingW((pcms?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_translateBitmapBits(hcolortransform.toString(), (psrcbits?.value ?: 0L).toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), (pdestbits?.value ?: 0L).toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_translateColors(hcolortransform.toString(), (painputcolors?.value ?: 0L).toString(), ncolors.toInt(), ctinput, (paoutputcolors?.value ?: 0L).toString(), ctoutput) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), bdelete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW((pmachinename?.value ?: 0L).toString(), (pprofilename?.value ?: 0L).toString(), bdelete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_unregisterCMMA((pmachinename?.value ?: 0L).toString(), cmmid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_unregisterCMMW((pmachinename?.value ?: 0L).toString(), cmmid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(reserved.toInt(), (lpszcmid?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), command.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(reserved.toInt(), (lpszcmid?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), command.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(scope, (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, paresult: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsCheckColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), (pinputdata?.value ?: 0L).toString(), (paresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(hwcsprofile.toString(), dwoptions.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(scope, (pprofilename?.value ?: 0L).toString(), (pdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pbuffer: COpaquePointer?, dwsize: UInt, pnprofiles: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(scope, (penumrecord?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), dwsize.toInt(), (pnprofiles?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pdwsize: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(scope, (penumrecord?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetCalibrationManagementState(pbisenabled: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState((pbisenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(scope, (pdevicename?.value ?: 0L).toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(scope, (pdevicename?.value ?: 0L).toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), (pcbprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(scope, (pdwrenderingintent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles((pdevicename?.value ?: 0L).toString(), dwdeviceclass.toInt(), (puseperuserprofiles?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileA(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA((pcdmpprofile?.value ?: 0L).toString(), (pcampprofile?.value ?: 0L).toString(), (pgmmpprofile?.value ?: 0L).toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileW(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW((pcdmpprofile?.value ?: 0L).toString(), (pcampprofile?.value ?: 0L).toString(), (pgmmpprofile?.value ?: 0L).toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(bisenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(scope, (pdevicename?.value ?: 0L).toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), (pprofilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles((pdevicename?.value ?: 0L).toString(), dwdeviceclass.toInt(), useperuserprofiles) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: COpaquePointer?): Bool =
    if (_windowsWin32UiColorsystemNapiAddon != null) (_windowsWin32UiColorsystemNapiAddon.windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), (pinputdata?.value ?: 0L).toString(), noutputchannels.toInt(), cdtoutput, cboutput.toInt(), (poutputdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
