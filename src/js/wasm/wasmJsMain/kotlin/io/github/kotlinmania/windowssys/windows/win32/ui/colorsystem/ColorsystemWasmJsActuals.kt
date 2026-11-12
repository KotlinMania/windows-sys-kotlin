@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiColorsystemNapiAddon(): Boolean

private val windowsWin32UiColorsystemNapiAvailable: Boolean = initWindowsWin32UiColorsystemNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCheckColors(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCheckColors(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCheckRGBs(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCheckRGBs(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(p0: String, p1: Int, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateProfile(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateProfile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateProfileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateProfileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateTransform(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateTransformExt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformExt(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformExtW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMCreateTransformW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformW(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMDeleteTransform(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMDeleteTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMGetInfo(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMGetInfo(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMIsProfileValid(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMIsProfileValid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMTranslateColors(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMTranslateColors(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMTranslateRGB(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGB(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMTranslateRGBs(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGBs(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCheckBitmapBits(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCheckBitmapBits(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCheckColors(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCheckColors(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCheckColorsInGamut(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCheckColorsInGamut(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCloseColorProfile(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCloseColorProfile(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemColorCorrectPalette(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemColorCorrectPalette(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemColorMatchToTarget(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemColorMatchToTarget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemConvertColorNameToIndex(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemConvertIndexToColorName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemConvertIndexToColorName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateColorSpaceA(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateColorSpaceA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateColorSpaceW(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateColorSpaceW(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateColorTransformA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateColorTransformA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateColorTransformW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateColorTransformW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemDeleteColorSpace(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemDeleteColorSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemDeleteColorTransform(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemDeleteColorTransform(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemEnumColorProfilesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemEnumColorProfilesA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemEnumColorProfilesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemEnumColorProfilesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemEnumICMProfilesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemEnumICMProfilesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemEnumICMProfilesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemEnumICMProfilesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetCMMInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetCMMInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorDirectoryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorDirectoryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorDirectoryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorDirectoryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorProfileElement(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorProfileElement(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorProfileElementTag(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorProfileHeader(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorProfileHeader(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetColorSpace(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetColorSpace(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetCountColorProfileElements(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetICMProfileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetICMProfileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetICMProfileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetICMProfileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetLogColorSpaceA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetLogColorSpaceW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetNamedProfileInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemInstallColorProfileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemInstallColorProfileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemInstallColorProfileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemInstallColorProfileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemIsColorProfileValid(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemIsColorProfileValid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemOpenColorProfileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemOpenColorProfileA(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemOpenColorProfileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemOpenColorProfileW(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemRegisterCMMA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemRegisterCMMA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemRegisterCMMW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemRegisterCMMW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSelectCMM(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSelectCMM(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetColorProfileElement(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElement(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElementReference(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElementSize(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetColorProfileHeader(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetColorProfileHeader(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetColorSpace(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetColorSpace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetICMMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetICMMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetICMProfileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetICMProfileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetICMProfileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetICMProfileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetupColorMatchingA(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetupColorMatchingA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemSetupColorMatchingW(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemSetupColorMatchingW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemTranslateBitmapBits(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32UiColorsystemTranslateBitmapBits(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemTranslateColors(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemTranslateColors(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUninstallColorProfileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUninstallColorProfileA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUninstallColorProfileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUninstallColorProfileW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUnregisterCMMA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUnregisterCMMA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUnregisterCMMW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUnregisterCMMW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsCheckColors(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsCheckColors(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsCreateIccProfile(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(p0)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiColorsystemWcsTranslateColors(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiColorsystemWcsTranslateColors(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: Int, p9: String): Int

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr<UByte>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCheckColors(hcmtransform.toString(), lpainputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, lparesult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr<Rgbtriple>, lparesult: MutPtr<UByte>, ncount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(hcmtransform.toString(), lpargbtriple.rawAddress.toString(), lparesult.rawAddress.toString(), ncount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr<UByte>, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCheckRGBs(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lparesult.rawAddress.toString(), 0L.toString(), ulcallbackdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr<ConstPtr<Byte>>, paindex: MutPtr<UInt>, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(hprofile.toString(), pacolorname.rawAddress.toString(), paindex.rawAddress.toString(), dwcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr<UInt>, pacolorname: MutPtr<MutPtr<Byte>>, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(hprofile.toString(), paindex.rawAddress.toString(), pacolorname.rawAddress.toString(), dwcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintents: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr<MutPtr<UByte>>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintents.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), lpprofiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintents: ConstPtr<UInt>, nintents: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintents.rawAddress.toString(), nintents.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfile(lpcolorspace: MutPtr<Logcolorspacea>, lpprofiledata: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateProfile(lpcolorspace.rawAddress.toString(), lpprofiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateProfileW(lpcolorspace: MutPtr<Logcolorspacew>, lpprofiledata: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateProfileW(lpcolorspace.rawAddress.toString(), lpprofiledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransform(lpcolorspace: ConstPtr<Logcolorspacea>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateTransform(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExt(lpcolorspace: ConstPtr<Logcolorspacea>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformExt(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformExtW(lpcolorspace: ConstPtr<Logcolorspacew>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformExtW(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMCreateTransformW(lpcolorspace: ConstPtr<Logcolorspacew>, lpdevcharacter: ConstPtr<CVoid>, lptargetdevcharacter: ConstPtr<CVoid>): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMCreateTransformW(lpcolorspace.rawAddress.toString(), lpdevcharacter.rawAddress.toString(), lptargetdevcharacter.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr<NamedProfileInfo>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMIsProfileValid(hprofile.toString(), lpbvalid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr<Color>, ctoutput: Colortype): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMTranslateColors(hcmtransform.toString(), lpainputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, lpaoutputcolors.rawAddress.toString(), ctoutput) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGB(hcmtransform.toString(), colorref.toInt(), lpcolorref.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGBs(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), lpdestbits.rawAddress.toString(), bmoutput, dwtranslatedirection.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(hcmtransform.toString(), lpsrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), lpdestbits.rawAddress.toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr<UByte>, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCheckBitmapBits(hcolortransform.toString(), psrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwstride.toInt(), paresult.rawAddress.toString(), 0L.toString(), lpcallbackdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColors(hcolortransform: Long, painputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, paresult: MutPtr<UByte>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCheckColors(hcolortransform.toString(), painputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, paresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr<Rgbtriple>, dlpbuffer: MutPtr<CVoid>, ncount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCheckColorsInGamut(hdc.rawAddress.toString(), lprgbtriple.rawAddress.toString(), dlpbuffer.rawAddress.toString(), ncount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeColorProfile(hprofile: Long): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemColorCorrectPalette(hdc.rawAddress.toString(), hpal.rawAddress.toString(), defirst.toInt(), num.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemColorMatchToTarget(hdc.rawAddress.toString(), hdctarget.rawAddress.toString(), action.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr<MutPtr<Pwstr>>, profilecount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr<WcsProfileManagementScope>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr<ConstPtr<Byte>>, paindex: MutPtr<UInt>, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemConvertColorNameToIndex(hprofile.toString(), pacolorname.rawAddress.toString(), paindex.rawAddress.toString(), dwcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr<UInt>, pacolorname: MutPtr<MutPtr<Byte>>, dwcount: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemConvertIndexToColorName(hprofile.toString(), paindex.rawAddress.toString(), pacolorname.rawAddress.toString(), dwcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceA(lplcs: ConstPtr<Logcolorspacea>): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiColorsystemCreateColorSpaceA(lplcs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorSpaceW(lplcs: ConstPtr<Logcolorspacew>): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiColorsystemCreateColorSpaceW(lplcs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformA(plogcolorspace: ConstPtr<Logcolorspacea>, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateColorTransformA(plogcolorspace.rawAddress.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createColorTransformW(plogcolorspace: ConstPtr<Logcolorspacew>, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateColorTransformW(plogcolorspace.rawAddress.toString(), hdestprofile.toString(), htargetprofile.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeviceLinkProfile(hprofile: ConstPtr<Long>, nprofiles: UInt, padwintent: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr<MutPtr<UByte>>, indexpreferredcmm: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(hprofile.rawAddress.toString(), nprofiles.toInt(), padwintent.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), pprofiledata.rawAddress.toString(), indexpreferredcmm.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMultiProfileTransform(pahprofiles: ConstPtr<Long>, nprofiles: UInt, padwintent: ConstPtr<UInt>, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(pahprofiles.rawAddress.toString(), nprofiles.toInt(), padwintent.rawAddress.toString(), nintents.toInt(), dwflags.toInt(), indexpreferredcmm.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr<Logcolorspacea>, pprofile: MutPtr<MutPtr<UByte>>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(plogcolorspace.rawAddress.toString(), pprofile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr<Logcolorspacew>, pprofile: MutPtr<MutPtr<UByte>>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(plogcolorspace.rawAddress.toString(), pprofile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemDeleteColorSpace(hcs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteColorTransform(hxform: Long): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr<Enumtypea>, penumerationbuffer: MutPtr<UByte>, pdwsizeofenumerationbuffer: MutPtr<UInt>, pnprofiles: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemEnumColorProfilesA(pmachinename.rawAddress.toString(), penumrecord.rawAddress.toString(), penumerationbuffer.rawAddress.toString(), pdwsizeofenumerationbuffer.rawAddress.toString(), pnprofiles.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr<Enumtypew>, penumerationbuffer: MutPtr<UByte>, pdwsizeofenumerationbuffer: MutPtr<UInt>, pnprofiles: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemEnumColorProfilesW(pmachinename.rawAddress.toString(), penumrecord.rawAddress.toString(), penumerationbuffer.rawAddress.toString(), pdwsizeofenumerationbuffer.rawAddress.toString(), pnprofiles.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemEnumICMProfilesA(hdc.rawAddress.toString(), 0L.toString(), param2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemEnumICMProfilesW(hdc.rawAddress.toString(), 0L.toString(), param2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform.toString(), param1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorDirectoryA(pmachinename.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorDirectoryW(pmachinename.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr<UInt>, pelement: MutPtr<CVoid>, pbreference: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress.toString(), pelement.rawAddress.toString(), pbreference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorProfileElementTag(hprofile.toString(), dwindex.toInt(), ptag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr<UByte>, pcbprofile: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(hprofile.toString(), pprofile.rawAddress.toString(), pcbprofile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorProfileHeader(hprofile: Long, pheader: MutPtr<Profileheader>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetColorProfileHeader(hprofile.toString(), pheader.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiColorsystemGetColorSpace(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetCountColorProfileElements(hprofile.toString(), pnelementcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr<CVoid>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(hdc.rawAddress.toString(), lpramp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr<UInt>, pszfilename: Pstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetICMProfileA(hdc.rawAddress.toString(), pbufsize.rawAddress.toString(), pszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr<UInt>, pszfilename: Pwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetICMProfileW(hdc.rawAddress.toString(), pbufsize.rawAddress.toString(), pszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr<Logcolorspacea>, nsize: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetLogColorSpaceA(hcolorspace.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr<Logcolorspacew>, nsize: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetLogColorSpaceW(hcolorspace.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr<NamedProfileInfo>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetNamedProfileInfo(hprofile.toString(), pnamedprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr<UByte>, pcbps2colorrenderingdictionary: MutPtr<UInt>, pbbinary: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(hprofile.toString(), dwintent.toInt(), pps2colorrenderingdictionary.rawAddress.toString(), pcbps2colorrenderingdictionary.rawAddress.toString(), pbbinary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr<UByte>, pcbps2colorrenderingintent: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(hprofile.toString(), dwintent.toInt(), pbuffer.rawAddress.toString(), pcbps2colorrenderingintent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr<UByte>, pcbps2colorspacearray: MutPtr<UInt>, pbbinary: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(hprofile.toString(), dwintent.toInt(), dwcsatype.toInt(), pps2colorspacearray.rawAddress.toString(), pcbps2colorspacearray.rawAddress.toString(), pbbinary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(pmachinename.rawAddress.toString(), dwscs.toInt(), pbuffer.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(pmachinename.rawAddress.toString(), dwscs.toInt(), pbuffer.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemInstallColorProfileA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemInstallColorProfileW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(hprofile.toString(), tag.toInt(), pbpresent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemIsColorProfileValid(hprofile.toString(), pbvalid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileA(pprofile: ConstPtr<Profile>, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemOpenColorProfileA(pprofile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openColorProfileW(pprofile: ConstPtr<Profile>, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemOpenColorProfileW(pprofile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemRegisterCMMA(pmachinename.rawAddress.toString(), cmmid.toInt(), pcmmdll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemRegisterCMMW(pmachinename.rawAddress.toString(), cmmid.toInt(), pcmmdll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr<UInt>, pelement: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElement(hprofile.toString(), tag.toInt(), dwoffset.toInt(), pcbelement.rawAddress.toString(), pelement.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile.toString(), newtag.toInt(), reftag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile.toString(), tagtype.toInt(), pcbelement.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr<Profileheader>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetColorProfileHeader(hprofile.toString(), pheader.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    if (windowsWin32UiColorsystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiColorsystemSetColorSpace(hdc.rawAddress.toString(), hcs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(hdc.rawAddress.toString(), lpramp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetICMMode(hdc.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetICMProfileA(hdc.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetICMProfileW(hdc.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(pmachinename.rawAddress.toString(), dwprofileid.toInt(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(pmachinename.rawAddress.toString(), dwprofileid.toInt(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingA(pcms: MutPtr<Colormatchsetupa>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetupColorMatchingA(pcms.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupColorMatchingW(pcms: MutPtr<Colormatchsetupw>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemSetupColorMatchingW(pcms.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr<CVoid>, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr<CVoid>, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemTranslateBitmapBits(hcolortransform.toString(), psrcbits.rawAddress.toString(), bminput, dwwidth.toInt(), dwheight.toInt(), dwinputstride.toInt(), pdestbits.rawAddress.toString(), bmoutput, dwoutputstride.toInt(), 0L.toString(), ulcallbackdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateColors(hcolortransform: Long, painputcolors: ConstPtr<Color>, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr<Color>, ctoutput: Colortype): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemTranslateColors(hcolortransform.toString(), painputcolors.rawAddress.toString(), ncolors.toInt(), ctinput, paoutputcolors.rawAddress.toString(), ctoutput) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUninstallColorProfileA(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), bdelete) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUninstallColorProfileW(pmachinename.rawAddress.toString(), pprofilename.rawAddress.toString(), bdelete) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUnregisterCMMA(pmachinename.rawAddress.toString(), cmmid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUnregisterCMMW(pmachinename.rawAddress.toString(), cmmid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(reserved.toInt(), lpszcmid.rawAddress.toString(), lpszfilename.rawAddress.toString(), command.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(reserved.toInt(), lpszcmid.rawAddress.toString(), lpszfilename.rawAddress.toString(), command.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(scope, pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr<CVoid>, paresult: MutPtr<UByte>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsCheckColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress.toString(), paresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile.toString(), dwoptions.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(scope, pprofilename.rawAddress.toString(), pdevicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr<Enumtypew>, pbuffer: MutPtr<UByte>, dwsize: UInt, pnprofiles: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(scope, penumrecord.rawAddress.toString(), pbuffer.rawAddress.toString(), dwsize.toInt(), pnprofiles.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr<Enumtypew>, pdwsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(scope, penumrecord.rawAddress.toString(), pdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetCalibrationManagementState(pbisenabled: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(pbisenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), cbprofilename.toInt(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pcbprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr<UInt>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(scope, pdwrenderingintent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr<Bool>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(pdevicename.rawAddress.toString(), dwdeviceclass.toInt(), puseperuserprofiles.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr<Profile>, pcampprofile: ConstPtr<Profile>, pgmmpprofile: ConstPtr<Profile>, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(pcdmpprofile.rawAddress.toString(), pcampprofile.rawAddress.toString(), pgmmpprofile.rawAddress.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr<Profile>, pcampprofile: ConstPtr<Profile>, pgmmpprofile: ConstPtr<Profile>, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(pcdmpprofile.rawAddress.toString(), pcampprofile.rawAddress.toString(), pgmmpprofile.rawAddress.toString(), dwdesireaccess.toInt(), dwsharemode.toInt(), dwcreationmode.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(scope, pdevicename.rawAddress.toString(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid.toInt(), pprofilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope, dwrenderingintent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(pdevicename.rawAddress.toString(), dwdeviceclass.toInt(), useperuserprofiles) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr<CVoid>, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr<CVoid>): Bool =
    if (windowsWin32UiColorsystemNapiAvailable) wasmWindowssysWindowsWin32UiColorsystemWcsTranslateColors(hcolortransform.toString(), ncolors.toInt(), ninputchannels.toInt(), cdtinput, cbinput.toInt(), pinputdata.rawAddress.toString(), noutputchannels.toInt(), cdtoutput, cboutput.toInt(), poutputdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
