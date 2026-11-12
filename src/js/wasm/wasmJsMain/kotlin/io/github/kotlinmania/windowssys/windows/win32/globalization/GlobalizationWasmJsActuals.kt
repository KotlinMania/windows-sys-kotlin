@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EtoOptions
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GlobalizationNapiAddon(): Boolean

private val windowsWin32GlobalizationNapiAvailable: Boolean = initWindowsWin32GlobalizationNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationAdjustCalendarDate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationAdjustCalendarDate(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationCompareStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationCompareStringA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationCompareStringEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationCompareStringEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationCompareStringOrdinal(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationCompareStringOrdinal(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationCompareStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationCompareStringW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationConvertDefaultLocale(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationConvertDefaultLocale(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumCalendarInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumCalendarInfoExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumCalendarInfoExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumCalendarInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumDateFormatsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumDateFormatsExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumDateFormatsExEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumDateFormatsExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumDateFormatsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemCodePagesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemCodePagesA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemCodePagesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemCodePagesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemGeoID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemGeoID(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemGeoNames(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemGeoNames(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemLocalesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesA(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemLocalesEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumSystemLocalesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumTimeFormatsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumTimeFormatsEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumTimeFormatsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumUILanguagesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumUILanguagesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationEnumUILanguagesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationEnumUILanguagesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationFindNLSString(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationFindNLSString(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationFindNLSStringEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GlobalizationFindNLSStringEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationFindStringOrdinal(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationFindStringOrdinal(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationFoldStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationFoldStringA(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationFoldStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationFoldStringW(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetACP()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetACP(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCPInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCPInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCPInfoExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCPInfoExA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCPInfoExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCPInfoExW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCalendarInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoA(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCalendarInfoEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCalendarInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoW(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCurrencyFormatA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCurrencyFormatEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetCurrencyFormatW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDateFormatA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDateFormatA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDateFormatEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDateFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDateFormatW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDateFormatW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDurationFormat(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDurationFormat(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetDurationFormatEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetDurationFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetFileMUIInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetFileMUIInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetFileMUIPath(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetFileMUIPath(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetGeoInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetGeoInfoA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetGeoInfoEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetGeoInfoEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetGeoInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetGeoInfoW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetLocaleInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoA(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetLocaleInfoEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetLocaleInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoW(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetNLSVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetNLSVersion(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetNLSVersionEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetNLSVersionEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetNumberFormatA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetNumberFormatA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetNumberFormatEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetNumberFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetNumberFormatW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetNumberFormatW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetOEMCP()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetOEMCP(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetStringScripts(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetStringScripts(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetStringTypeA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetStringTypeA(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetStringTypeExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetStringTypeExA(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetStringTypeExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetStringTypeExW(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetStringTypeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetStringTypeW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetSystemDefaultLCID()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLCID(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetSystemDefaultLangID()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLangID(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetTextCharset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetTextCharset(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetTextCharsetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetTextCharsetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetThreadLocale()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetThreadLocale(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetThreadUILanguage()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetThreadUILanguage(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetTimeFormatA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetTimeFormatA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetTimeFormatEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetTimeFormatEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetTimeFormatW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetTimeFormatW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUILanguageInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUILanguageInfo(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserDefaultGeoName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserDefaultGeoName(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserDefaultLCID()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLCID(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserDefaultLangID()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLangID(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserDefaultUILanguage()")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserDefaultUILanguage(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserGeoID(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserGeoID(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIdnToAscii(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationIdnToAscii(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIdnToNameprepUnicode(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationIdnToNameprepUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIdnToUnicode(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationIdnToUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsCalendarLeapYear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsCalendarLeapYear(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsDBCSLeadByte(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsDBCSLeadByte(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsNLSDefinedString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsNLSDefinedString(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsNormalizedString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsNormalizedString(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsTextUnicode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsTextUnicode(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsValidCodePage(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsValidCodePage(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsValidLanguageGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsValidLanguageGroup(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsValidLocale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsValidLocale(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsValidLocaleName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsValidLocaleName(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsValidNLSVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsValidNLSVersion(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationIsWellFormedTag(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationIsWellFormedTag(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLCIDToLocaleName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationLCIDToLocaleName(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLCMapStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationLCMapStringA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLCMapStringEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationLCMapStringEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLCMapStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationLCMapStringW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLocaleNameToLCID(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLocaleNameToLCID(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMappingDoAction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationMappingDoAction(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMappingFreePropertyBag(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationMappingFreePropertyBag(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMappingFreeServices(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationMappingFreeServices(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMappingGetServices(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationMappingGetServices(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMappingRecognizeText(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationMappingRecognizeText(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationMultiByteToWideChar(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationMultiByteToWideChar(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationNormalizeString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationNormalizeString(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationNotifyUILanguageChange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationNotifyUILanguageChange(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationResolveLocaleName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationResolveLocaleName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptBreak(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptBreak(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptCPtoX(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptCPtoX(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptCacheGetHeight(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptCacheGetHeight(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptFreeCache(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptFreeCache(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetCMap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetCMap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetFontProperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetFontProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetFontScriptTags(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetFontScriptTags(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetLogicalWidths(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetLogicalWidths(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptGetProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptGetProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptIsComplex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptIsComplex(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptItemize(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptItemize(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptItemizeOpenType(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptItemizeOpenType(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptJustify(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptJustify(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptLayout(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptLayout(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptPlace(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptPlace(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptPlaceOpenType(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptPlaceOpenType(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: Int, p12: String, p13: String, p14: Int, p15: String, p16: String, p17: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptShape(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptShape(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptShapeOpenType(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptShapeOpenType(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: Int, p11: String, p12: String, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringAnalyse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringAnalyse(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringCPtoX(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringCPtoX(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringFree(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringGetOrder(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringGetOrder(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringOut(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringOut(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringValidate(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringValidate(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringXtoCP(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringXtoCP(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringPLogAttr(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringPLogAttr(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringPSize(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringPSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptStringPcOutChars(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptStringPcOutChars(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptTextOut(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptTextOut(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: Int, p9: String, p10: Int, p11: String, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationScriptXtoCP(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationScriptXtoCP(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetCalendarInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetCalendarInfoA(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetCalendarInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetCalendarInfoW(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetLocaleInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetLocaleInfoA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetLocaleInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetLocaleInfoW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetThreadLocale(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetThreadLocale(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetThreadUILanguage(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetThreadUILanguage(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetUserGeoID(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetUserGeoID(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationSetUserGeoName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationSetUserGeoName(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationTranslateCharsetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationTranslateCharsetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUCallbackStop(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackStop(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationVerifyScripts(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationVerifyScripts(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationWideCharToMultiByte(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationWideCharToMultiByte(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcatA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcatA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcatW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcatW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcmpA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcmpA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcmpW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcmpW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcmpiA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcmpiA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcmpiW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcmpiW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcpyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcpyA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcpyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcpyW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcpynA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcpynA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrcpynW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrcpynW(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrlenA(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrlenA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationLstrlenW(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationLstrlenW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUUcharsToChars(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUUcharsToChars(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUAustrcpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUAustrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUAustrncpy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUAustrncpy(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCatclose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCatclose(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCatgets(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCatgets(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCatopen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCatopen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharAge(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharAge(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharDigitValue(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharDigitValue(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharDirection(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharDirection(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharFromName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharFromName(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharMirror(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharMirror(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharName(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharType(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharType(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCharsToUchars(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCharsToUchars(p0: String, p1: String, p2: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCleanup()")
private external fun wasmWindowssysWindowsWin32GlobalizationUCleanup()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUCountChar32(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUCountChar32(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUDigit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUDigit(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUEnumCharNames(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUEnumCharNames(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUEnumCharTypes(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUEnumCharTypes(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUErrorName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUErrorName(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUFoldCase(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUFoldCase(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUForDigit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUForDigit(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUFormatMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GlobalizationUFormatMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUFormatMessageWithError(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GlobalizationUFormatMessageWithError(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetBidiPairedBracket(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetBidiPairedBracket(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetBinaryPropertySet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetBinaryPropertySet(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetCombiningClass(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetCombiningClass(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetDataVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetDataVersion(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetFcNfkcClosure(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetFcNfkcClosure(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetIntPropertyMap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMap(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetIntPropertyValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyValue(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetNumericValue(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetNumericValue(p0: Int): Double

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetPropertyEnum(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetPropertyEnum(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetPropertyName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetPropertyName(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetPropertyValueEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetPropertyValueEnum(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetPropertyValueName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetPropertyValueName(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetUnicodeVersion(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetUnicodeVersion(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUGetVersion(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUGetVersion(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUHasBinaryProperty(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUHasBinaryProperty(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUInit(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUInit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsIdignorable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsIdignorable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsIdpart(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsIdpart(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsIdstart(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsIdstart(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsIsocontrol(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsIsocontrol(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsJavaIdpart(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsJavaIdpart(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsJavaIdstart(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsJavaIdstart(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsJavaSpaceChar(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsJavaSpaceChar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsMirrored(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsMirrored(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsUalphabetic(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsUalphabetic(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsUlowercase(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsUlowercase(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsUuppercase(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsUuppercase(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsUwhiteSpace(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsUwhiteSpace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsWhitespace(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsWhitespace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsalnum(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsalpha(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsbase(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsbase(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsblank(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIscntrl(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsdefined(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsdefined(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsdigit(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsgraph(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIslower(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsprint(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIspunct(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsspace(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIstitle(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIstitle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsupper(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUIsxdigit(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUIsxdigit(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemcasecmp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemcasecmp(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemchr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemchr(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemchr32(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemchr32(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemcmp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemcmp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemcpy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemcpy(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemmove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemmove(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemrchr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemrchr(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemrchr32(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemrchr32(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUMemset(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUMemset(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUParseMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GlobalizationUParseMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUParseMessageWithError(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GlobalizationUParseMessageWithError(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUSetMemoryFunctions(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUSetMemoryFunctions(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUShapeArabic(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUShapeArabic(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrCaseCompare(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrCaseCompare(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrCompare(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrCompare(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrCompareIter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrCompareIter(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFindFirst(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFindFirst(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFindLast(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFindLast(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFoldCase(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFoldCase(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromUtf32(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromUtf32(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrFromWcs(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrFromWcs(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToLower(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToLower(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToTitle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToTitle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToUtf32(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToUtf32(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToUtf32WithSub(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToUtf32WithSub(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToUtf8(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToUtf8WithSub(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToUtf8WithSub(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToUpper(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToUpper(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrToWcs(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrToWcs(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcasecmp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcasecmp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcat(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrchr(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrchr32(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrchr32(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcmp(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrcspn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrcspn(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrlen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrlen(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrncasecmp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrncasecmp(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrncat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrncat(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrncmp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrncmp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrncpy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrncpy(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrpbrk(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrrchr(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrrchr32(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrrchr32(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrrstr(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrspn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrspn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrstr(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrstr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUStrtokR(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUStrtokR(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUTolower(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUTotitle(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUTotitle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUToupper(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUToupper(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUUastrcpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUUastrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUUastrncpy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUUastrncpy(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUUnescape(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUUnescape(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUUnescapeAt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUUnescapeAt(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVersionFromString(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVersionFromString(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVersionFromUstring(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVersionFromUstring(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVersionToString(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVersionToString(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVformatMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVformatMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVformatMessageWithError(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVformatMessageWithError(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVparseMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVparseMessage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUVparseMessageWithError(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUVparseMessageWithError(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiCountParagraphs(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiCountParagraphs(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiCountRuns(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiCountRuns(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetBaseDirection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetBaseDirection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetClassCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetClassCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetDirection(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetDirection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLength(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLevelAt(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLevelAt(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLevels(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLevels(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLogicalMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalMap(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetLogicalRun(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalRun(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetParaLevel(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetParaLevel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetParagraph(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetParagraph(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetProcessedLength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetProcessedLength(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetReorderingMode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetReorderingMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetResultLength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetResultLength(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetText(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetText(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetVisualIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetVisualMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualMap(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiGetVisualRun(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualRun(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiInvertMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiInvertMap(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiIsInverse(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiIsInverse(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiOpen()")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiOpen(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiOpenSized(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiOpenSized(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiReorderLogical(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiReorderLogical(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiReorderVisual(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiReorderVisual(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetClassCallback(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetClassCallback(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetContext(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetInverse(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetInverse(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetLine(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetLine(p0: String, p1: Int, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetPara(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetPara(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetReorderingMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetReorderingMode(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiWriteReordered(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiWriteReordered(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbidiWriteReverse(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbidiWriteReverse(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbiditransformClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbiditransformClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbiditransformOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbiditransformOpen(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbiditransformTransform(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbiditransformTransform(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int, p11: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUblockGetCode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUblockGetCode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkClose(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkCountAvailable(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkCurrent(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkCurrent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkFirst(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkFirst(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkFollowing(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkFollowing(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkGetBinaryRules(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkGetBinaryRules(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkGetRuleStatus(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkGetRuleStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkIsBoundary(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkIsBoundary(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkLast(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkLast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkNext(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkNext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkOpen(p0: Int, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkOpenRules(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkOpenRules(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkPreceding(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkPreceding(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkPrevious(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkPrevious(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkRefreshUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkRefreshUtext(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkSafeClone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkSafeClone(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkSetText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkSetText(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUbrkSetUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUbrkSetUtext(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalAdd(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalClear(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalClear(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalClearField(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalClearField(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalClose(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalCountAvailable(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalEquivalentTo(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalEquivalentTo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetAttribute(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetDstsavings(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetDstsavings(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetFieldDifference(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetFieldDifference(p0: String, p1: Double, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetGregorianChange(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetGregorianChange(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetHostTimeZone(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetHostTimeZone(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetLimit(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetLimit(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetMillis(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetMillis(p0: String, p1: String): Double

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetNow()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetNow(): Double

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetTzdataVersion(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetTzdataVersion(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetTimeZoneId(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneId(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetType(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetWeekendTransition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetWeekendTransition(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalInDaylightTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalInDaylightTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalIsSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalIsSet(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalIsWeekend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalIsWeekend(p0: String, p1: Double, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalOpen(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalOpenTimeZones(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalOpenTimeZones(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalRoll(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalRoll(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSet(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetAttribute(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetDate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetDate(p0: String, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetDateTime(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetDateTime(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetGregorianChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetGregorianChange(p0: String, p1: Double, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetMillis(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetMillis(p0: String, p1: Double, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcalSetTimeZone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcalSetTimeZone(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapGetLocale(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapGetLocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapGetOptions(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapGetOptions(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapOpen(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapSetLocale(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapSetLocale(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapSetOptions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapSetOptions(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapToTitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapToTitle(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposConstrainCategory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposConstrainCategory(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposConstrainField(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposConstrainField(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposGetCategory(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposGetCategory(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposGetField(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposGetField(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposGetIndexes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposGetIndexes(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposMatchesField(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposMatchesField(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposOpen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposReset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposReset(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcfposSetState(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcfposSetState(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(p0: String, p1: String, p2: Int, p3: Int, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(p0: String, p1: String, p2: String, p3: Int, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(p0: String, p1: String, p2: Int, p3: Int, p4: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCompareNames(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCompareNames(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvConvert(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvConvert(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvConvertEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvConvertEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int, p11: Int, p12: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCountAliases(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCountAliases(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCountAvailable(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvCountStandards()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvCountStandards(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFixFileSeparator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFixFileSeparator(p0: String, p1: String, p2: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFlushCache()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFlushCache(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUchars(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUchars(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUcountPending(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUcountPending(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvFromUnicode(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvFromUnicode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetAlias(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetAlias(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetAliases(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetAliases(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetAvailableName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetAvailableName(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetCcsid(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetCcsid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetCanonicalName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetCanonicalName(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetDefaultName()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetDefaultName(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetInvalidChars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetInvalidChars(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetMinCharSize(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetMinCharSize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetName(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetNextUchar(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetNextUchar(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetPlatform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetPlatform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetStandard(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetStandard(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetStandardName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetStandardName(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetStarters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetStarters(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetSubstChars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetSubstChars(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetToUcallBack(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetToUcallBack(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetType(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetType(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvIsAmbiguous(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvIsAmbiguous(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvIsFixedWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvIsFixedWidth(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpenAllNames(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpenAllNames(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpenCcsid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpenCcsid(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpenPackage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpenPackage(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpenStandardNames(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpenStandardNames(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvOpenU(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvOpenU(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvReset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvReset(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvResetFromUnicode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvResetFromUnicode(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvResetToUnicode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvResetToUnicode(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSafeClone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSafeClone(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetDefaultName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetDefaultName(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetFallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetFallback(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetSubstChars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetSubstChars(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetSubstString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetSubstString(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvSetToUcallBack(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvSetToUcallBack(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToAlgorithmic(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToAlgorithmic(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUchars(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUchars(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUcountPending(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUcountPending(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvToUnicode(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvToUnicode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvUsesFallback(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvUsesFallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselClose(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselOpen(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselSelectForString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselSelectForString(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcnvselSerialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcnvselSerialize(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolCloneBinary(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolCloneBinary(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolCloseElements(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolCloseElements(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolCountAvailable(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolEqual(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolEqual(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetAttribute(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetBound(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetBound(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(p0: String, p1: String, p2: String, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetKeywordValues(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetKeywordValues(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetKeywords(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetKeywords(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetMaxExpansion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetMaxExpansion(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetMaxVariable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetMaxVariable(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetOffset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetOffset(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetReorderCodes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetReorderCodes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetRules(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetRules(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetRulesEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetRulesEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetSortKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetSortKey(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetStrength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetStrength(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetTailoredSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetTailoredSet(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetUcaversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetUcaversion(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetVariableTop(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetVariableTop(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGetVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGetVersion(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGreater(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGreater(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolGreaterOrEqual(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolGreaterOrEqual(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolKeyHashCode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolKeyHashCode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolMergeSortkeys(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolMergeSortkeys(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolNext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolNextSortKeyPart(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolNextSortKeyPart(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolOpen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolOpenBinary(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolOpenBinary(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolOpenElements(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolOpenElements(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolOpenRules(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolOpenRules(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolPrevious(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolPrevious(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolPrimaryOrder(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolPrimaryOrder(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolReset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolReset(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSafeClone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSafeClone(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSecondaryOrder(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSecondaryOrder(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetAttribute(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetMaxVariable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetMaxVariable(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetOffset(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetOffset(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetReorderCodes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetReorderCodes(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetStrength(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetStrength(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolSetText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolSetText(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolStrcoll(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolStrcoll(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolStrcollIter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolStrcollIter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolStrcollUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolStrcollUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcolTertiaryOrder(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcolTertiaryOrder(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcpmapGet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcpmapGet(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcpmapGetRange(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcpmapGetRange(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieGet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieGet(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieGetRange(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieGetRange(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieGetType(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieGetType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieGetValueWidth(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieGetValueWidth(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcptrieToBinary(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcptrieToBinary(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetDetect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetDetect(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetDetectAll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetDetectAll(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetGetConfidence(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetGetConfidence(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetGetLanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetGetLanguage(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetGetName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetGetName(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetGetUchars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetGetUchars(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetOpen(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcsdetSetText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcsdetSetText(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrCountCurrencies(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrCountCurrencies(p0: String, p1: Double, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrForLocale(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrForLocale(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(p0: String, p1: Double, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetName(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetNumericCode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetNumericCode(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetPluralName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetPluralName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(p0: String, p1: Int, p2: String): Double

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrIsAvailable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrIsAvailable(p0: String, p1: Double, p2: Double, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrRegister(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrRegister(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUcurrUnregister(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUcurrUnregister(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatApplyPattern(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatApplyPattern(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatClose(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatCountAvailable(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatCountSymbols(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatCountSymbols(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatFormat(p0: String, p1: Double, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatFormatCalendar(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatFormatCalendar(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatFormatForFields(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatFormatForFields(p0: String, p1: Double, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetCalendar(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetCalendar(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetNumberFormat(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetNumberFormat(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatGetSymbols(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatGetSymbols(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatIsLenient(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatIsLenient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatOpen(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatOpen(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatParse(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatParse(p0: String, p1: String, p2: Int, p3: String, p4: String): Double

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatParseCalendar(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatParseCalendar(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(p0: String, p1: Double, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetCalendar(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetCalendar(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetContext(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetLenient(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetLenient(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetNumberFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetNumberFormat(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatSetSymbols(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatSetSymbols(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatToCalendarDateField(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatToCalendarDateField(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatToPattern(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatToPattern(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgAddPattern(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgAddPattern(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetBestPattern(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetBestPattern(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetDecimal(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetDecimal(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgGetSkeleton(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgGetSkeleton(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgOpen(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgOpenEmpty(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgOpenEmpty(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdatpgSetDecimal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdatpgSetDecimal(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtFormat(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtFormat(p0: String, p1: Double, p2: Double, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtOpen(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtOpen(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumNext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumNext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumReset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumReset(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUenumUnext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUenumUnext(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfieldpositerClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfieldpositerClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfieldpositerNext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfieldpositerNext(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfieldpositerOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfieldpositerOpen(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetArrayLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetArrayLength(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetDate(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetDate(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetDecNumChars(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetDecNumChars(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetDouble(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetInt64(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetLong(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetLong(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetObject(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtGetUchars(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtGetUchars(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtIsNumeric(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtIsNumeric(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtOpen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtvalGetString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtvalGetString(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUfmtvalNextPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUfmtvalNextPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUgenderGetInstance(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUgenderGetInstance(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUgenderGetListGender(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUgenderGetListGender(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaClose(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaLabelToAscii(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaLabelToAscii(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaLabelToUnicode(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaLabelToUnicode(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaNameToAscii(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaNameToAscii(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaNameToUnicode(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaNameToUnicode(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUidnaOpenUts46(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUidnaOpenUts46(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterCurrent32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterCurrent32(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterGetState(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterGetState(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterNext32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterNext32(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterPrevious32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterPrevious32(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterSetState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterSetState(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterSetString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterSetString(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterSetUtf16Be(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterSetUtf16Be(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUiterSetUtf8(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUiterSetUtf8(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnGetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnGetContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnGetDialectHandling(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnGetDialectHandling(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnGetLocale(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnGetLocale(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnKeyDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnKeyDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnLanguageDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnLanguageDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnLocaleDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnLocaleDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnOpen(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnOpenForContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnOpenForContext(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnRegionDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnRegionDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnScriptDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnScriptDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUldnVariantDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUldnVariantDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtCloseResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtCloseResult(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtFormat(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtFormat(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtOpenForType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtOpenForType(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtOpenResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtOpenResult(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlistfmtResultAsValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlistfmtResultAsValue(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocAcceptLanguage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocAcceptLanguage(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocAddLikelySubtags(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocAddLikelySubtags(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocCanonicalize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocCanonicalize(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocCountAvailable(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocForLanguageTag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocForLanguageTag(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetBaseName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetBaseName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetCountry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetCountry(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDefault()")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDefault(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayCountry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayCountry(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayScript(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayScript(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetDisplayVariant(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayVariant(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetIso3Country(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetIso3Country(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetIso3Language(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetIso3Language(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetIsocountries()")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetIsocountries(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetIsolanguages()")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetIsolanguages(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetKeywordValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetKeywordValue(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetLcid(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetLcid(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetLanguage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetLanguage(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetLineOrientation(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetLineOrientation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetParent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetParent(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetScript(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetScript(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocGetVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocGetVariant(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocIsRightToLeft(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocIsRightToLeft(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocMinimizeSubtags(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocMinimizeSubtags(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocOpenAvailableByType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocOpenAvailableByType(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocOpenKeywords(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocOpenKeywords(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocSetDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocSetDefault(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocSetKeywordValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocSetKeywordValue(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocToLanguageTag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocToLanguageTag(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocToLegacyKey(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocToLegacyKey(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocToLegacyType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocToLegacyType(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetCldrversion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetCldrversion(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetDelimiter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetDelimiter(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataGetPaperSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataGetPaperSize(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataOpen(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgApplyPattern(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgApplyPattern(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgClose(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgFormat(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgFormat(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgGetLocale(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgGetLocale(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgOpen(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgParse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgParse(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgSetLocale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgSetLocale(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgToPattern(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgToPattern(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgVformat(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgVformat(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmsgVparse(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmsgVparse(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieGet(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieGet(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieGetRange(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieGetRange(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieOpen(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieSet(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUmutablecptrieSetRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUmutablecptrieSetRange(p0: String, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2Append(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2Append(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2Close(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2Close(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2ComposePair(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2ComposePair(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetDecomposition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetDecomposition(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetInstance(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2IsInert(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2IsInert(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2IsNormalized(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2IsNormalized(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2Normalize(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2Normalize(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2OpenFiltered(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2OpenFiltered(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2QuickCheck(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2QuickCheck(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnormCompare(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnormCompare(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumApplyPattern(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumApplyPattern(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumClose(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumCountAvailable()")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumCountAvailable(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormat(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatDecimal(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatDecimal(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatDouble(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatDouble(p0: String, p1: Double, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(p0: String, p1: Double, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(p0: String, p1: Double, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatInt64(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatInt64(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumFormatUformattable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumFormatUformattable(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetAttribute(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetAvailable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetAvailable(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(p0: String, p1: Int): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetSymbol(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetSymbol(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumGetTextAttribute(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumGetTextAttribute(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumOpen(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumOpen(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParse(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParse(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParseDecimal(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParseDecimal(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParseDouble(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParseDouble(p0: String, p1: String, p2: Int, p3: String, p4: String): Double

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Double

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParseInt64(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParseInt64(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumParseToUformattable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumParseToUformattable(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumSetAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumSetAttribute(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumSetContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumSetContext(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(p0: String, p1: Int, p2: Double)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumSetSymbol(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumSetSymbol(p0: String, p1: Int, p2: String, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumSetTextAttribute(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumSetTextAttribute(p0: String, p1: Int, p2: String, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumToPattern(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumToPattern(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfCloseResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfCloseResult(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfFormatDecimal(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfFormatDecimal(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfFormatDouble(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfFormatDouble(p0: String, p1: Double, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfFormatInt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfFormatInt(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfOpenResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfOpenResult(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfResultAsValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfResultAsValue(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumfResultToString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumfResultToString(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysClose(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysGetDescription(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysGetDescription(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysGetName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysGetName(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysGetRadix(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysGetRadix(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysOpen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUnumsysOpenByName(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUnumsysOpenByName(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesGetKeywords(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesGetKeywords(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesOpenForType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesOpenForType(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesSelect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesSelect(p0: String, p1: Double, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUplrulesSelectFormatted(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUplrulesSelectFormatted(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexAppendReplacement(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexAppendReplacement(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexAppendTail(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexAppendTail(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexAppendTailUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexAppendTailUtext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexEnd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexEnd(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexEnd64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexEnd64(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexFind(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexFind(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexFind64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexFind64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexFindNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexFindNext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexFlags(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetMatchCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetMatchCallback(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetStackLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetStackLimit(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetText(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetText(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetTimeLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetTimeLimit(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGetUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGetUtext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGroup(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGroup(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGroupCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGroupCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGroupNumberFromName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGroupNumberFromName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexGroupUtext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexGroupUtext(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexHasTransparentBounds(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexHasTransparentBounds(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexHitEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexHitEnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexLookingAt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexLookingAt(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexLookingAt64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexLookingAt64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexMatches(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexMatches(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexMatches64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexMatches64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexOpenC(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexOpenC(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexOpenUtext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexOpenUtext(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexPattern(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexPattern(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexPatternUtext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexPatternUtext(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRefreshUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRefreshUtext(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRegionEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRegionEnd(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRegionEnd64(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRegionEnd64(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRegionStart(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRegionStart(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRegionStart64(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRegionStart64(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReplaceAll(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReplaceAll(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReplaceAllUtext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReplaceAllUtext(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReplaceFirst(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReplaceFirst(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexRequireEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexRequireEnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReset(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReset(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexReset64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexReset64(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetMatchCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetMatchCallback(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetRegion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetRegion(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetRegion64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetRegion64(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetRegionAndStart(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetRegionAndStart(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetStackLimit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetStackLimit(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetText(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetTimeLimit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetTimeLimit(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSetUtext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSetUtext(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSplit(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSplit(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexSplitUtext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexSplitUtext(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexStart(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexStart(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexStart64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexStart64(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregexUseTransparentBounds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregexUseTransparentBounds(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionAreEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionAreEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionContains(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionContains(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetAvailable(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetAvailable(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetContainedRegions(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetContainedRegions(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetContainingRegion(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetContainingRegion(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetNumericCode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetNumericCode(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetPreferredValues(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetPreferredValues(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetRegionCode(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetRegionCode(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetRegionFromCode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetRegionFromCode(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUregionGetType(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUregionGetType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtCloseResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtCloseResult(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormat(p0: String, p1: Double, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(p0: String, p1: Double, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(p0: String, p1: Double, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(p0: String, p1: Double, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtOpen(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtOpenResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtOpenResult(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetBinary(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetBinary(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetByIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetByIndex(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetByKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetByKey(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetInt(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetInt(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetIntVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetIntVector(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetKey(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetKey(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetLocaleByType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetLocaleByType(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetNextResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetNextResource(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetNextString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetNextString(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetSize(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetSize(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetString(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetStringByIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetStringByIndex(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetStringByKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetStringByKey(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetType(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetUint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetUint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetUtf8String(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetUtf8String(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresGetVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresGetVersion(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresHasNext(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresHasNext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresOpen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresOpenAvailableLocales(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresOpenAvailableLocales(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresOpenDirect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresOpenDirect(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresOpenU(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresOpenU(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUresResetIterator(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUresResetIterator(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetCode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetCode(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetName(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetSampleString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetSampleString(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetScript(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetScript(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetShortName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetShortName(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptGetUsage(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptGetUsage(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptHasScript(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptHasScript(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptIsCased(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptIsCased(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUscriptIsRightToLeft(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUscriptIsRightToLeft(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchFirst(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchFirst(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchFollowing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchFollowing(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetAttribute(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetBreakIterator(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetBreakIterator(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetCollator(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetCollator(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetMatchedLength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedLength(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetMatchedStart(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedStart(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetMatchedText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedText(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetOffset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetOffset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetPattern(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetPattern(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchGetText(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchGetText(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchLast(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchLast(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchNext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchOpen(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchOpenFromCollator(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchOpenFromCollator(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchPreceding(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchPreceding(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchPrevious(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchPrevious(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchReset(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchReset(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetAttribute(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetBreakIterator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetBreakIterator(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetCollator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetCollator(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetOffset(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetOffset(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetPattern(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetPattern(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsearchSetText(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsearchSetText(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetAdd(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetAdd(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetAddAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetAddAll(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetAddAllCodePoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetAddAllCodePoints(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetAddRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetAddRange(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetAddString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetAddString(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetApplyPattern(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetApplyPattern(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetCharAt(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetCharAt(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetClear(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetClear(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetClone(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetClone(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetCloneAsThawed(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetCloneAsThawed(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetCloseOver(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetCloseOver(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetCompact(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetCompact(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetComplement(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetComplement(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetComplementAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetComplementAll(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContains(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContains(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsAll(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsNone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsNone(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsRange(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsSome(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsSome(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetContainsString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetContainsString(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetEquals(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetEquals(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetFreeze(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetFreeze(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetGetItem(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetGetItem(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetGetItemCount(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetGetItemCount(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetGetSerializedRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetGetSerializedSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetIndexOf(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetIndexOf(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetIsEmpty(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetIsEmpty(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetIsFrozen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetIsFrozen(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetOpen(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetOpenEmpty()")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetOpenEmpty(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetOpenPattern(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetOpenPattern(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetOpenPatternOptions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetOpenPatternOptions(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRemove(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRemove(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRemoveAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRemoveAll(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRemoveAllStrings(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRemoveAllStrings(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRemoveRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRemoveRange(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRemoveString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRemoveString(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetResemblesPattern(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetResemblesPattern(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRetain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRetain(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetRetainAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetRetainAll(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSerialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSerialize(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSerializedContains(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSerializedContains(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSet(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSetSerializedToOne(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSetSerializedToOne(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSize(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSize(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSpan(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSpan(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSpanBack(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSpanBack(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSpanBackUtf8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSpanBackUtf8(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetSpanUtf8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetSpanUtf8(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsetToPattern(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsetToPattern(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofAreConfusable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofAreConfusable(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofCheck(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofCheck(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofCheck2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofCheck2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofCheck2Utf8(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofCheck2Utf8(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofCheckUtf8(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofCheckUtf8(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofCloseCheckResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofCloseCheckResult(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetAllowedChars(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetAllowedChars(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetChecks(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetChecks(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetInclusionSet(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetInclusionSet(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetSkeleton(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetSkeleton(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofOpen(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofOpen(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofOpenCheckResult(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofOpenCheckResult(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofOpenFromSource(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofOpenFromSource(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofSerialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofSerialize(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofSetAllowedChars(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofSetAllowedChars(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofSetChecks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofSetChecks(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsprepClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsprepClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsprepOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsprepOpen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsprepOpenByType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsprepOpenByType(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUsprepPrepare(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GlobalizationUsprepPrepare(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextChar32At(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextChar32At(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextClone(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextClone(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextClose(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextCopy(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextCopy(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextCurrent32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextCurrent32(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextEquals(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextEquals(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextExtract(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextExtract(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextFreeze(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextFreeze(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextGetNativeIndex(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextGetNativeIndex(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextHasMetaData(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextHasMetaData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextIsLengthExpensive(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextIsLengthExpensive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextIsWritable(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextIsWritable(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextMoveIndex32(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextMoveIndex32(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextNativeLength(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextNativeLength(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextNext32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextNext32(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextNext32From(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextNext32From(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextOpenUchars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextOpenUchars(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextOpenUtf8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextOpenUtf8(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextPrevious32(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextPrevious32(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextPrevious32From(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextPrevious32From(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextReplace(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextReplace(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextSetNativeIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextSetNativeIndex(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtextSetup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtextSetup(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtf8Back1SafeBody(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtf8Back1SafeBody(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtmscaleFromInt64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtmscaleFromInt64(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtmscaleToInt64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtmscaleToInt64(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceFormat(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceFormat(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceFunctionName(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceFunctionName(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceGetFunctions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceGetFunctions(p0: String, p1: String, p2: String, p3: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceGetLevel()")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceGetLevel(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceSetFunctions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceSetFunctions(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceSetLevel(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceSetLevel(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtraceVformat(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtraceVformat(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransClose(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransClose(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransCountAvailableIds()")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransCountAvailableIds(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransGetSourceSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransGetSourceSet(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransGetUnicodeId(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransGetUnicodeId(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransOpenIds(p0)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransOpenIds(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransOpenInverse(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransOpenInverse(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransOpenU(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransOpenU(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransRegister(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransRegister(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransSetFilter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransSetFilter(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransToRules(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransToRules(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransTrans(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransTrans(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransTransIncremental(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransTransIncremental(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransTransUchars(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransTransUchars(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GlobalizationUtransUnregisterId(p0, p1)")
private external fun wasmWindowssysWindowsWin32GlobalizationUtransUnregisterId(p0: String, p1: Int)

public actual fun adjustCalendarDate(lpcaldatetime: MutPtr, calunit: CaldatetimeDateunit, amount: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationAdjustCalendarDate(lpcaldatetime.rawAddress.toString(), calunit, amount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr, cchcount1: Int, lpstring2: ConstPtr, cchcount2: Int): ComparestringResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationCompareStringA(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr, lpreserved: ConstPtr, lparam: Lparam): ComparestringResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationCompareStringEx(lplocalename.rawAddress.toString(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2, lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationCompareStringOrdinal(lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2, bignorecase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationCompareStringW(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr, lpsystime: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(lpcaldatetime.rawAddress.toString(), lpsystime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertDefaultLocale(locale: UInt): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationConvertDefaultLocale(locale.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr, calid: UInt, lpcaldatetime: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(lpsystime.rawAddress.toString(), calid.toInt(), lpcaldatetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(0L.toString(), lplocalename.rawAddress.toString(), calendar.toInt(), lpreserved.rawAddress.toString(), caltype.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoExW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumCalendarInfoW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExA(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExEx(0L.toString(), lplocalename.rawAddress.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsExW(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumDateFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemCodePagesA(0L.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemCodePagesW(0L.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemGeoID(geoclass.toInt(), parentgeoid, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemGeoNames(geoclass.toInt(), 0L.toString(), data.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(0L.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(0L.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesA(0L.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesEx(0L.toString(), dwflags.toInt(), lparam.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumSystemLocalesW(0L.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsEx(0L.toString(), lplocalename.rawAddress.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumTimeFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumUILanguagesA(0L.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationEnumUILanguagesW(0L.toString(), dwflags.toInt(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationFindNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, pcchfound.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr, lpversioninformation: ConstPtr, lpreserved: ConstPtr, sorthandle: Lparam): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationFindNLSStringEx(lplocalename.rawAddress.toString(), dwfindnlsstringflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, pcchfound.rawAddress.toString(), lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), sorthandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationFindStringOrdinal(dwfindstringordinalflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, bignorecase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationFoldStringA(dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationFoldStringW(dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getACP(): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetACP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCPInfo(codepage.toInt(), lpcpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCPInfoExA(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCPInfoExW(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(lpszlocale.rawAddress.toString(), dwflags.toInt(), lpcaldatetime.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoEx(lplocalename.rawAddress.toString(), calendar.toInt(), lpreserved.rawAddress.toString(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr, lpcalmaxdatetime: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(calendar.toInt(), lpcalmindatetime.rawAddress.toString(), lpcalmaxdatetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetCurrencyFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDateFormatA(locale.toInt(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDateFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate, lpcalendar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDateFormatW(locale.toInt(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(pszlanguage.rawAddress.toString(), pszlanguageslist.rawAddress.toString(), wchlistdelimiter.toInt(), pclosestdistance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDurationFormat(locale.toInt(), dwflags.toInt(), lpduration.rawAddress.toString(), ullduration.toString(), lpformat.rawAddress.toString(), lpdurationstr.rawAddress.toString(), cchduration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetDurationFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpduration.rawAddress.toString(), ullduration.toString(), lpformat.rawAddress.toString(), lpdurationstr.rawAddress.toString(), cchduration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr, pcbfilemuiinfo: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetFileMUIInfo(dwflags.toInt(), pcwszfilepath.rawAddress.toString(), pfilemuiinfo.rawAddress.toString(), pcbfilemuiinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr, pululenumerator: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetFileMUIPath(dwflags.toInt(), pcwszfilepath.rawAddress.toString(), pwszlanguage.rawAddress.toString(), pcchlanguage.rawAddress.toString(), pwszfilemuipath.rawAddress.toString(), pcchfilemuipath.rawAddress.toString(), pululenumerator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetGeoInfoA(location, geotype, lpgeodata.rawAddress.toString(), cchdata, langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetGeoInfoEx(location.rawAddress.toString(), geotype, geodata.rawAddress.toString(), geodatacount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetGeoInfoW(location, geotype, lpgeodata.rawAddress.toString(), cchdata, langid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoEx(lplocalename.rawAddress.toString(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetNLSVersion(function.toInt(), locale.toInt(), lpversioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetNLSVersionEx(function.toInt(), lplocalename.rawAddress.toString(), lpversioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr, lpnumberstr: Pstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetNumberFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetNumberFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetNumberFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOEMCP(): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetOEMCP().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetStringScripts(dwflags.toInt(), lpstring.rawAddress.toString(), cchstring, lpscripts.rawAddress.toString(), cchscripts) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetStringTypeA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetStringTypeExA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetStringTypeExW(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetStringTypeW(dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLCID(): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLCID().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLangID(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLangID().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(lplocalename.rawAddress.toString(), cchlocalename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharset(hdc: Hdc): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetTextCharset(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr, dwflags: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetTextCharsetInfo(hdc.rawAddress.toString(), lpsig.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadLocale(): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetThreadLocale().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetThreadUILanguage().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetTimeFormatA(locale.toInt(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetTimeFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetTimeFormatW(locale.toInt(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr, pattributes: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUILanguageInfo(dwflags.toInt(), pwmszlanguage.rawAddress.toString(), pwszfallbacklanguages.rawAddress.toString(), pcchfallbacklanguages.rawAddress.toString(), pattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserDefaultGeoName(geoname.rawAddress.toString(), geonamecount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLCID(): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLCID().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLangID(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLangID().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(lplocalename.rawAddress.toString(), cchlocalename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserDefaultUILanguage().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserGeoID(geoclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIdnToAscii(dwflags.toInt(), lpunicodecharstr.rawAddress.toString(), cchunicodechar, lpasciicharstr.rawAddress.toString(), cchasciichar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIdnToNameprepUnicode(dwflags.toInt(), lpunicodecharstr.rawAddress.toString(), cchunicodechar, lpnameprepcharstr.rawAddress.toString(), cchnameprepchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIdnToUnicode(dwflags.toInt(), lpasciicharstr.rawAddress.toString(), cchasciichar, lpunicodecharstr.rawAddress.toString(), cchunicodechar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage.toInt(), testchar.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr, lpstring: Pcwstr, cchstr: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsNLSDefinedString(function.toInt(), dwflags.toInt(), lpversioninformation.rawAddress.toString(), lpstring.rawAddress.toString(), cchstr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsNormalizedString(normform, lpstring.rawAddress.toString(), cwlength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTextUnicode(lpv: ConstPtr, isize: Int, lpiresult: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsTextUnicode(lpv.rawAddress.toString(), isize, lpiresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidCodePage(codepage: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsValidCodePage(codepage.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsValidLocale(locale.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsValidLocaleName(lplocalename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsValidNLSVersion(function.toInt(), lplocalename.rawAddress.toString(), lpversioninformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationIsWellFormedTag(psztag.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLCIDToLocaleName(locale.toInt(), lpname.rawAddress.toString(), cchname, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLCMapStringA(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr, lpreserved: ConstPtr, sorthandle: Lparam): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLCMapStringEx(lplocalename.rawAddress.toString(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest, lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), sorthandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLCMapStringW(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLocaleNameToLCID(lpname.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingDoAction(pbag: MutPtr, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMappingDoAction(pbag.rawAddress.toString(), dwrangeindex.toInt(), pszactionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreePropertyBag(pbag: ConstPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMappingFreePropertyBag(pbag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreeServices(pserviceinfo: ConstPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMappingFreeServices(pserviceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingGetServices(poptions: ConstPtr, prgservices: MutPtr, pdwservicescount: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMappingGetServices(poptions.rawAddress.toString(), prgservices.rawAddress.toString(), pdwservicescount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingRecognizeText(pserviceinfo: ConstPtr, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr, pbag: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMappingRecognizeText(pserviceinfo.rawAddress.toString(), psztext.rawAddress.toString(), dwlength.toInt(), dwindex.toInt(), poptions.rawAddress.toString(), pbag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationMultiByteToWideChar(codepage.toInt(), dwflags.toInt(), lpmultibytestr.rawAddress.toString(), cbmultibyte, lpwidecharstr.rawAddress.toString(), cchwidechar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationNormalizeString(normform, lpsrcstring.rawAddress.toString(), cwsrclength, lpdststring.rawAddress.toString(), cwdstlength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationNotifyUILanguageChange(dwflags.toInt(), pcwstrnewlanguage.rawAddress.toString(), pcwstrpreviouslanguage.rawAddress.toString(), dwreserved.toInt(), pdwstatusrtrn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationResolveLocaleName(lpnametoresolve.rawAddress.toString(), lplocalename.rawAddress.toString(), cchlocalename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(snapshot.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scriptApplyDigitSubstitution(psds: ConstPtr, psc: MutPtr, pss: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(psds.rawAddress.toString(), psc.rawAddress.toString(), pss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptApplyLogicalWidth(pidx: ConstPtr, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, pabc: MutPtr, pijustify: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(pidx.rawAddress.toString(), cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), pabc.rawAddress.toString(), pijustify.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr, psla: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptBreak(pwcchars.rawAddress.toString(), cchars, psa.rawAddress.toString(), psla.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, pix: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), pix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr, tmheight: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptCacheGetHeight(hdc.rawAddress.toString(), psc.rawAddress.toString(), tmheight.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptFreeCache(psc: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptFreeCache(psc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetCMap(hdc: Hdc, psc: MutPtr, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetCMap(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwcinchars.rawAddress.toString(), cchars, dwflags.toInt(), pwoutglyphs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr, pcalternates: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toInt(), cmaxalternates, palternateglyphs.rawAddress.toString(), pcalternates.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr, pctags: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), cmaxtags, pfeaturetags.rawAddress.toString(), pctags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr, pctags: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), cmaxtags, plangsystags.rawAddress.toString(), pctags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr, sfp: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetFontProperties(hdc.rawAddress.toString(), psc.rawAddress.toString(), sfp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr, psa: ConstPtr, cmaxtags: Int, pscripttags: MutPtr, pctags: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetFontScriptTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), cmaxtags, pscripttags.rawAddress.toString(), pctags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr, wglyph: UShort, pabc: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(hdc.rawAddress.toString(), psc.rawAddress.toString(), wglyph.toInt(), pabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetLogicalWidths(psa: ConstPtr, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr, pwlogclust: ConstPtr, psva: ConstPtr, pidx: ConstPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetLogicalWidths(psa.rawAddress.toString(), cchars, cglyphs, piglyphwidth.rawAddress.toString(), pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), pidx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetProperties(ppsp: MutPtr, pinumscripts: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptGetProperties(ppsp.rawAddress.toString(), pinumscripts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptIsComplex(pwcinchars.rawAddress.toString(), cinchars, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr, psstate: ConstPtr, pitems: MutPtr, pcitems: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptItemize(pwcinchars.rawAddress.toString(), cinchars, cmaxitems, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pitems.rawAddress.toString(), pcitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr, psstate: ConstPtr, pitems: MutPtr, pscripttags: MutPtr, pcitems: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptItemizeOpenType(pwcinchars.rawAddress.toString(), cinchars, cmaxitems, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pitems.rawAddress.toString(), pscripttags.rawAddress.toString(), pcitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptJustify(psva: ConstPtr, piadvance: ConstPtr, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptJustify(psva.rawAddress.toString(), piadvance.rawAddress.toString(), cglyphs, idx, iminkashida, pijustify.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptLayout(cruns: Int, pblevel: ConstPtr, pivisualtological: MutPtr, pilogicaltovisual: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptLayout(cruns, pblevel.rawAddress.toString(), pivisualtological.rawAddress.toString(), pilogicaltovisual.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlace(hdc: Hdc, psc: MutPtr, pwglyphs: ConstPtr, cglyphs: Int, psva: ConstPtr, psa: MutPtr, piadvance: MutPtr, pgoffset: MutPtr, pabc: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptPlace(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwglyphs.rawAddress.toString(), cglyphs, psva.rawAddress.toString(), psa.rawAddress.toString(), piadvance.rawAddress.toString(), pgoffset.rawAddress.toString(), pabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr, psa: MutPtr, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr, rprangeproperties: ConstPtr, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr, pcharprops: ConstPtr, cchars: Int, pwglyphs: ConstPtr, pglyphprops: ConstPtr, cglyphs: Int, piadvance: MutPtr, pgoffset: MutPtr, pabc: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptPlaceOpenType(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress.toString(), rprangeproperties.rawAddress.toString(), cranges, pwcchars.rawAddress.toString(), pwlogclust.rawAddress.toString(), pcharprops.rawAddress.toString(), cchars, pwglyphs.rawAddress.toString(), pglyphprops.rawAddress.toString(), cglyphs, piadvance.rawAddress.toString(), pgoffset.rawAddress.toString(), pabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr, poutgoffset: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(locale.toInt(), psds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShape(hdc: Hdc, psc: MutPtr, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr, pwoutglyphs: MutPtr, pwlogclust: MutPtr, psva: MutPtr, pcglyphs: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptShape(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwcchars.rawAddress.toString(), cchars, cmaxglyphs, psa.rawAddress.toString(), pwoutglyphs.rawAddress.toString(), pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), pcglyphs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr, psa: MutPtr, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr, rprangeproperties: ConstPtr, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr, pcharprops: MutPtr, pwoutglyphs: MutPtr, poutglyphprops: MutPtr, pcglyphs: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptShapeOpenType(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress.toString(), rprangeproperties.rawAddress.toString(), cranges, pwcchars.rawAddress.toString(), cchars, cmaxglyphs, pwlogclust.rawAddress.toString(), pcharprops.rawAddress.toString(), pwoutglyphs.rawAddress.toString(), poutglyphprops.rawAddress.toString(), pcglyphs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr, psstate: ConstPtr, pidx: ConstPtr, ptabdef: ConstPtr, pbinclass: ConstPtr, pssa: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringAnalyse(hdc.rawAddress.toString(), pstring.rawAddress.toString(), cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pidx.rawAddress.toString(), ptabdef.rawAddress.toString(), pbinclass.rawAddress.toString(), pssa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringCPtoX(ssa: ConstPtr, icp: Int, ftrailing: Bool, px: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringCPtoX(ssa.rawAddress.toString(), icp, ftrailing, px.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringFree(pssa: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringFree(pssa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetLogicalWidths(ssa: ConstPtr, pidx: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(ssa.rawAddress.toString(), pidx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetOrder(ssa: ConstPtr, puorder: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringGetOrder(ssa.rawAddress.toString(), puorder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringOut(ssa: ConstPtr, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringOut(ssa.rawAddress.toString(), ix, iy, uoptions.toInt(), prc.rawAddress.toString(), iminsel, imaxsel, fdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringValidate(ssa: ConstPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringValidate(ssa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringXtoCP(ssa: ConstPtr, ix: Int, pich: MutPtr, pitrailing: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptStringXtoCP(ssa.rawAddress.toString(), ix, pich.rawAddress.toString(), pitrailing.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPLogAttr(ssa: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationScriptStringPLogAttr(ssa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPSize(ssa: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationScriptStringPSize(ssa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPcOutChars(ssa: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationScriptStringPcOutChars(ssa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr, psa: ConstPtr, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toInt(), pwoutglyphid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptTextOut(hdc: Hdc, psc: MutPtr, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr, psa: ConstPtr, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr, cglyphs: Int, piadvance: ConstPtr, pijustify: ConstPtr, pgoffset: ConstPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptTextOut(hdc.rawAddress.toString(), psc.rawAddress.toString(), x, y, fuoptions.toInt(), lprc.rawAddress.toString(), psa.rawAddress.toString(), pwcreserved.rawAddress.toString(), ireserved, pwglyphs.rawAddress.toString(), cglyphs, piadvance.rawAddress.toString(), pijustify.rawAddress.toString(), pgoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr, psva: ConstPtr, piadvance: ConstPtr, psa: ConstPtr, picp: MutPtr, pitrailing: MutPtr): Hresult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationScriptXtoCP(ix, cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), picp.rawAddress.toString(), pitrailing.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress.toString(), pulnumlanguages.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadLocale(locale: UInt): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetThreadLocale(locale.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress.toString(), pulnumlanguages.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr, snapshot: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(flags.toInt(), languages.rawAddress.toString(), numlanguagesset.rawAddress.toString(), snapshot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadUILanguage(langid: UShort): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetThreadUILanguage(langid.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoID(geoid: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetUserGeoID(geoid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationSetUserGeoName(geoname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateCharsetInfo(lpsrc: MutPtr, lpcs: MutPtr, dwflags: TranslateCharsetInfoFlags): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationTranslateCharsetInfo(lpsrc.rawAddress.toString(), lpcs.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUCallbackEscape(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSkip(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackStop(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSubstitute(context: ConstPtr, fromuargs: MutPtr, codeunits: ConstPtr, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackEscape(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSkip(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackStop(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackStop(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSubstitute(context: ConstPtr, touargs: MutPtr, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(lpcaldatetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationVerifyScripts(dwflags.toInt(), lplocalescripts.rawAddress.toString(), cchlocalescripts, lptestscripts.rawAddress.toString(), cchtestscripts) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationWideCharToMultiByte(codepage.toInt(), dwflags.toInt(), lpwidecharstr.rawAddress.toString(), cchwidechar, lpmultibytestr.rawAddress.toString(), cbmultibyte, lpdefaultchar.rawAddress.toString(), lpuseddefaultchar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcatA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcatW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrcmpA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrcmpW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrcmpiA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrcmpiW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcpyA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcpyW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcpynA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), imaxlength).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationLstrcpynW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), imaxlength).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenA(lpstring: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrlenA(lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationLstrlenW(lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUcharsToChars(us: ConstPtr, cs: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUUcharsToChars(us.rawAddress.toString(), cs.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uAustrcpy(dst: Pcstr, src: ConstPtr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUAustrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uAustrncpy(dst: Pcstr, src: ConstPtr, n: Int): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUAustrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatclose(catd: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUCatclose(catd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCatgets(catd: MutPtr, setNum: Int, msgNum: Int, s: ConstPtr, len: MutPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUCatgets(catd.rawAddress.toString(), setNum, msgNum, s.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUCatopen(name.rawAddress.toString(), locale.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharAge(c: Int, versionarray: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUCharAge(c, versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCharDigitValue(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharDigitValue(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharDirection(c: Int): UCharDirection =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharDirection(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharFromName(namechoice, name.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharMirror(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharMirror(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharName(code, namechoice, buffer.rawAddress.toString(), bufferlength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharType(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCharType(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharsToUchars(cs: Pcstr, us: MutPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUCharsToUchars(cs.rawAddress.toString(), us.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCleanup() {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCountChar32(s: ConstPtr, length: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUCountChar32(s.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uDigit(ch: Int, radix: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUDigit(ch, radix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr, context: MutPtr, namechoice: UCharNameChoice, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUEnumCharNames(start, limit, fn.rawAddress.toString(), context.rawAddress.toString(), namechoice, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uEnumCharTypes(enumrange: MutPtr, context: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUEnumCharTypes(enumrange.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUErrorName(code).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFoldCase(c: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUFoldCase(c, options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUForDigit(digit, radix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, status: MutPtr, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUFormatMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, parseerror: MutPtr, status: MutPtr, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUFormatMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, parseerror.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBidiPairedBracket(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUGetBinaryPropertySet(property, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetCombiningClass(c: Int): UByte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetCombiningClass(c).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetDataVersion(dataversionfillin: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUGetDataVersion(dataversionfillin.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetFcNfkcClosure(c: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetFcNfkcClosure(c, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMap(property, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetIntPropertyValue(c, which) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetNumericValue(c: Int): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetNumericValue(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetPropertyEnum(alias.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUGetPropertyName(property, namechoice).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUGetPropertyValueEnum(property, alias.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUGetPropertyValueName(property, value, namechoice).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetUnicodeVersion(versionarray: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUGetUnicodeVersion(versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetVersion(versionarray: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUGetVersion(versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUHasBinaryProperty(c, which).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uInit(status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUInit(status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uIsIdignorable(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsIdignorable(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdpart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsIdpart(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdstart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsIdstart(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIsocontrol(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsIsocontrol(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdpart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsJavaIdpart(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdstart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsJavaIdstart(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsMirrored(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsMirrored(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUalphabetic(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsUalphabetic(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUlowercase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsUlowercase(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUuppercase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsUuppercase(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUwhiteSpace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsUwhiteSpace(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsWhitespace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsWhitespace(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalnum(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsalnum(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalpha(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsalpha(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsbase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsbase(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsblank(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsblank(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIscntrl(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIscntrl(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdefined(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsdefined(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdigit(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsdigit(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsgraph(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsgraph(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIslower(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIslower(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsprint(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsprint(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIspunct(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIspunct(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsspace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsspace(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIstitle(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIstitle(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsupper(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsupper(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsxdigit(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUIsxdigit(c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcasecmp(s1: ConstPtr, s2: ConstPtr, length: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUMemcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), length, options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr(s: ConstPtr, c: UShort, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemchr(s.rawAddress.toString(), c.toInt(), count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr32(s: ConstPtr, c: Int, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemchr32(s.rawAddress.toString(), c, count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmp(buf1: ConstPtr, buf2: ConstPtr, count: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUMemcmp(buf1.rawAddress.toString(), buf2.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmpCodePointOrder(s1: ConstPtr, s2: ConstPtr, count: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcpy(dest: MutPtr, src: ConstPtr, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemmove(dest: MutPtr, src: ConstPtr, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr(s: ConstPtr, c: UShort, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemrchr(s.rawAddress.toString(), c.toInt(), count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr32(s: ConstPtr, c: Int, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemrchr32(s.rawAddress.toString(), c, count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemset(dest: MutPtr, c: UShort, count: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUMemset(dest.rawAddress.toString(), c.toInt(), count).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uParseMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, status: MutPtr, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUParseMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, parseerror: MutPtr, status: MutPtr, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUParseMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, parseerror.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uSetMemoryFunctions(context: ConstPtr, a: MutPtr, r: MutPtr, f: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUSetMemoryFunctions(context.rawAddress.toString(), a.rawAddress.toString(), r.rawAddress.toString(), f.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uShapeArabic(source: ConstPtr, sourcelength: Int, dest: MutPtr, destsize: Int, options: UInt, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUShapeArabic(source.rawAddress.toString(), sourcelength, dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCaseCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, options: UInt, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrCaseCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, codepointorder: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, codepointorder.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompareIter(iter1: MutPtr, iter2: MutPtr, codepointorder: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrCompareIter(iter1.rawAddress.toString(), iter2.rawAddress.toString(), codepointorder.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindFirst(s: ConstPtr, length: Int, substring: ConstPtr, sublength: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFindFirst(s.rawAddress.toString(), length, substring.rawAddress.toString(), sublength).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindLast(s: ConstPtr, length: Int, substring: ConstPtr, sublength: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFindLast(s.rawAddress.toString(), length, substring.rawAddress.toString(), sublength).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFoldCase(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, options: UInt, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrFoldCase(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromUtf32(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8Lenient(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromWcs(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: Pcwstr, srclength: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrFromWcs(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrHasMoreChar32Than(s: ConstPtr, length: Int, number: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(s.rawAddress.toString(), length, number).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToLower(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, locale: Pcstr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrToLower(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, locale.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToTitle(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, titleiter: MutPtr, locale: Pcstr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrToTitle(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, titleiter.rawAddress.toString(), locale.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToUtf32(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32WithSub(dest: MutPtr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToUtf32WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr, perrorcode: MutPtr): Pstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUpper(dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, locale: Pcstr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrToUpper(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, locale.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Pwstr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrToWcs(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcasecmp(s1: ConstPtr, s2: ConstPtr, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcat(dst: MutPtr, src: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrcat(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr(s: ConstPtr, c: UShort): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrchr(s.rawAddress.toString(), c.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr32(s: ConstPtr, c: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrchr32(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmp(s1: ConstPtr, s2: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrcmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmpCodePointOrder(s1: ConstPtr, s2: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcspn(string: ConstPtr, matchset: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrcspn(string.rawAddress.toString(), matchset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrlen(s: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrlen(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncasecmp(s1: ConstPtr, s2: ConstPtr, n: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n, options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncat(dst: MutPtr, src: ConstPtr, n: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrncat(dst.rawAddress.toString(), src.rawAddress.toString(), n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmp(ucs1: ConstPtr, ucs2: ConstPtr, n: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrncmp(ucs1.rawAddress.toString(), ucs2.rawAddress.toString(), n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmpCodePointOrder(s1: ConstPtr, s2: ConstPtr, n: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString(), n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncpy(dst: MutPtr, src: ConstPtr, n: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrpbrk(string: ConstPtr, matchset: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrpbrk(string.rawAddress.toString(), matchset.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr(s: ConstPtr, c: UShort): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrrchr(s.rawAddress.toString(), c.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr32(s: ConstPtr, c: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrrchr32(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrstr(s: ConstPtr, substring: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrrstr(s.rawAddress.toString(), substring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrspn(string: ConstPtr, matchset: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUStrspn(string.rawAddress.toString(), matchset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrstr(s: ConstPtr, substring: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrstr(s.rawAddress.toString(), substring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrtokR(src: MutPtr, delim: ConstPtr, savestate: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUStrtokR(src.rawAddress.toString(), delim.rawAddress.toString(), savestate.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTolower(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTotitle(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUTotitle(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uToupper(c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrcpy(dst: MutPtr, src: Pcstr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUUastrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrncpy(dst: MutPtr, src: Pcstr, n: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUUastrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescape(src: Pcstr, dest: MutPtr, destcapacity: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUUnescape(src.rawAddress.toString(), dest.rawAddress.toString(), destcapacity) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr, length: Int, context: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUUnescapeAt(0L.toString(), offset.rawAddress.toString(), length, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVersionFromString(versionarray: MutPtr, versionstring: Pcstr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUVersionFromString(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionFromUstring(versionarray: MutPtr, versionstring: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUVersionFromUstring(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionToString(versionarray: ConstPtr, versionstring: Pcstr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUVersionToString(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVformatMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, ap: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUVformatMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, ap.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, result: MutPtr, resultlength: Int, parseerror: MutPtr, ap: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUVformatMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, parseerror.rawAddress.toString(), ap.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVparseMessage(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, ap: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUVparseMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, ap.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr, patternlength: Int, source: ConstPtr, sourcelength: Int, ap: MutPtr, parseerror: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUVparseMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, ap.rawAddress.toString(), parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiClose(pbidi: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiClose(pbidi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiCountParagraphs(pbidi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiCountParagraphs(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiCountRuns(pbidi: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiCountRuns(pbidi.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetBaseDirection(text: ConstPtr, length: Int): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetBaseDirection(text.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetClassCallback(pbidi: MutPtr, fn: MutPtr, context: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiGetClassCallback(pbidi.rawAddress.toString(), fn.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetCustomizedClass(pbidi: MutPtr, c: Int): UCharDirection =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(pbidi.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetDirection(pbidi: ConstPtr): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetDirection(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLength(pbidi: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetLength(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevelAt(pbidi: ConstPtr, charindex: Int): UByte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetLevelAt(pbidi.rawAddress.toString(), charindex).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevels(pbidi: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbidiGetLevels(pbidi.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalIndex(pbidi: MutPtr, visualindex: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(pbidi.rawAddress.toString(), visualindex, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalMap(pbidi: MutPtr, indexmap: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalMap(pbidi.rawAddress.toString(), indexmap.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetLogicalRun(pbidi: ConstPtr, logicalposition: Int, plogicallimit: MutPtr, plevel: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiGetLogicalRun(pbidi.rawAddress.toString(), logicalposition, plogicallimit.rawAddress.toString(), plevel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetParaLevel(pbidi: ConstPtr): UByte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetParaLevel(pbidi.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraph(pbidi: ConstPtr, charindex: Int, pparastart: MutPtr, pparalimit: MutPtr, pparalevel: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetParagraph(pbidi.rawAddress.toString(), charindex, pparastart.rawAddress.toString(), pparalimit.rawAddress.toString(), pparalevel.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraphByIndex(pbidi: ConstPtr, paraindex: Int, pparastart: MutPtr, pparalimit: MutPtr, pparalevel: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(pbidi.rawAddress.toString(), paraindex, pparastart.rawAddress.toString(), pparalimit.rawAddress.toString(), pparalevel.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetProcessedLength(pbidi: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetProcessedLength(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingMode(pbidi: MutPtr): UBiDiReorderingMode =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetReorderingMode(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingOptions(pbidi: MutPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(pbidi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetResultLength(pbidi: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetResultLength(pbidi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetText(pbidi: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbidiGetText(pbidi.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualIndex(pbidi: MutPtr, logicalindex: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualIndex(pbidi.rawAddress.toString(), logicalindex, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualMap(pbidi: MutPtr, indexmap: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualMap(pbidi.rawAddress.toString(), indexmap.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetVisualRun(pbidi: MutPtr, runindex: Int, plogicalstart: MutPtr, plength: MutPtr): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiGetVisualRun(pbidi.rawAddress.toString(), runindex, plogicalstart.rawAddress.toString(), plength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiInvertMap(srcmap: ConstPtr, destmap: MutPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiInvertMap(srcmap.rawAddress.toString(), destmap.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiIsInverse(pbidi: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiIsInverse(pbidi.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(pbidi.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpen(): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbidiOpen().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbidiOpenSized(maxlength, maxruncount, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOrderParagraphsLtr(pbidi: MutPtr, orderparagraphsltr: Byte) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(pbidi.rawAddress.toString(), orderparagraphsltr.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderLogical(levels: ConstPtr, length: Int, indexmap: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiReorderLogical(levels.rawAddress.toString(), length, indexmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderVisual(levels: ConstPtr, length: Int, indexmap: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiReorderVisual(levels.rawAddress.toString(), length, indexmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetClassCallback(pbidi: MutPtr, newfn: UBiDiClassCallback, newcontext: ConstPtr, oldfn: MutPtr, oldcontext: ConstPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetClassCallback(pbidi.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldfn.rawAddress.toString(), oldcontext.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetContext(pbidi: MutPtr, prologue: ConstPtr, prolength: Int, epilogue: ConstPtr, epilength: Int, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetContext(pbidi.rawAddress.toString(), prologue.rawAddress.toString(), prolength, epilogue.rawAddress.toString(), epilength, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetInverse(pbidi: MutPtr, isinverse: Byte) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetInverse(pbidi.rawAddress.toString(), isinverse.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetLine(pparabidi: ConstPtr, start: Int, limit: Int, plinebidi: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetLine(pparabidi.rawAddress.toString(), start, limit, plinebidi.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetPara(pbidi: MutPtr, text: ConstPtr, length: Int, paralevel: UByte, embeddinglevels: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetPara(pbidi.rawAddress.toString(), text.rawAddress.toString(), length, paralevel.toInt(), embeddinglevels.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingMode(pbidi: MutPtr, reorderingmode: UBiDiReorderingMode) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetReorderingMode(pbidi.rawAddress.toString(), reorderingmode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingOptions(pbidi: MutPtr, reorderingoptions: UInt) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(pbidi.rawAddress.toString(), reorderingoptions.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiWriteReordered(pbidi: MutPtr, dest: MutPtr, destsize: Int, options: UShort, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiWriteReordered(pbidi.rawAddress.toString(), dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiWriteReverse(src: ConstPtr, srclength: Int, dest: MutPtr, destsize: Int, options: UShort, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbidiWriteReverse(src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformClose(pbiditransform: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbiditransformClose(pbiditransform.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubiditransformOpen(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbiditransformOpen(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformTransform(pbiditransform: MutPtr, src: ConstPtr, srclength: Int, dest: MutPtr, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbiditransformTransform(pbiditransform.rawAddress.toString(), src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destsize, inparalevel.toInt(), inorder, outparalevel.toInt(), outorder, domirroring, shapingoptions.toInt(), perrorcode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ublockGetCode(c: Int): UBlockCode =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUblockGetCode(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkClose(bi: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbrkClose(bi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkCurrent(bi: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkCurrent(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFirst(bi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkFirst(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFollowing(bi: MutPtr, offset: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkFollowing(bi.rawAddress.toString(), offset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUbrkGetAvailable(index).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetBinaryRules(bi: MutPtr, binaryrules: MutPtr, rulescapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkGetBinaryRules(bi.rawAddress.toString(), binaryrules.rawAddress.toString(), rulescapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetLocaleByType(bi: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUbrkGetLocaleByType(bi.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatus(bi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkGetRuleStatus(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatusVec(bi: MutPtr, fillinvec: MutPtr, capacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(bi.rawAddress.toString(), fillinvec.rawAddress.toString(), capacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkIsBoundary(bi: MutPtr, offset: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkIsBoundary(bi.rawAddress.toString(), offset).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkLast(bi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkLast(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkNext(bi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkNext(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbrkOpen(type, locale.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenBinaryRules(binaryrules: ConstPtr, ruleslength: Int, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(binaryrules.rawAddress.toString(), ruleslength, text.rawAddress.toString(), textlength, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenRules(rules: ConstPtr, ruleslength: Int, text: ConstPtr, textlength: Int, parseerr: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbrkOpenRules(rules.rawAddress.toString(), ruleslength, text.rawAddress.toString(), textlength, parseerr.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPreceding(bi: MutPtr, offset: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkPreceding(bi.rawAddress.toString(), offset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPrevious(bi: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUbrkPrevious(bi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkRefreshUtext(bi: MutPtr, text: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbrkRefreshUtext(bi.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSafeClone(bi: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUbrkSafeClone(bi.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkSetText(bi: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbrkSetText(bi.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSetUtext(bi: MutPtr, text: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUbrkSetUtext(bi.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalAdd(cal: MutPtr, field: UCalendarDateFields, amount: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalAdd(cal.rawAddress.toString(), field, amount, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClear(calendar: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalClear(calendar.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClearField(cal: MutPtr, field: UCalendarDateFields) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalClearField(cal.rawAddress.toString(), field)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClone(cal: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalClone(cal.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalClose(cal: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalClose(cal.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalEquivalentTo(cal1: ConstPtr, cal2: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalEquivalentTo(cal1.rawAddress.toString(), cal2.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGet(cal: ConstPtr, field: UCalendarDateFields, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGet(cal.rawAddress.toString(), field, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAttribute(cal: ConstPtr, attr: UCalendarAttribute): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetAttribute(cal.rawAddress.toString(), attr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcalGetAvailable(localeindex).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetCanonicalTimeZoneId(id: ConstPtr, len: Int, result: MutPtr, resultcapacity: Int, issystemid: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(id.rawAddress.toString(), len, result.rawAddress.toString(), resultcapacity, issystemid.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDstsavings(zoneid: ConstPtr, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetDstsavings(zoneid.rawAddress.toString(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDayOfWeekType(cal: ConstPtr, dayofweek: UCalendarDaysOfWeek, status: MutPtr): UCalendarWeekdayType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(cal.rawAddress.toString(), dayofweek, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDefaultTimeZone(result: MutPtr, resultcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(result.rawAddress.toString(), resultcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetFieldDifference(cal: MutPtr, target: Double, field: UCalendarDateFields, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetFieldDifference(cal.rawAddress.toString(), target, field, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetGregorianChange(cal: ConstPtr, perrorcode: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetGregorianChange(cal.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetHostTimeZone(result: MutPtr, resultcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetHostTimeZone(result.rawAddress.toString(), resultcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLimit(cal: ConstPtr, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetLimit(cal.rawAddress.toString(), field, type, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLocaleByType(cal: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcalGetLocaleByType(cal.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetMillis(cal: ConstPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetMillis(cal.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetNow(): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetNow() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTzdataVersion(status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcalGetTzdataVersion(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneDisplayName(cal: ConstPtr, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(cal.rawAddress.toString(), type, locale.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneId(cal: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneId(cal.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr, len: Int, region: Pcstr, id: MutPtr, idcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(winid.rawAddress.toString(), len, region.rawAddress.toString(), id.rawAddress.toString(), idcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneTransitionDate(cal: ConstPtr, type: UTimeZoneTransitionType, transition: MutPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(cal.rawAddress.toString(), type, transition.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetType(cal: ConstPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcalGetType(cal.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWeekendTransition(cal: ConstPtr, dayofweek: UCalendarDaysOfWeek, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetWeekendTransition(cal.rawAddress.toString(), dayofweek, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWindowsTimeZoneId(id: ConstPtr, len: Int, winid: MutPtr, winidcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(id.rawAddress.toString(), len, winid.rawAddress.toString(), winidcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalInDaylightTime(cal: ConstPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalInDaylightTime(cal.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsSet(cal: ConstPtr, field: UCalendarDateFields): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalIsSet(cal.rawAddress.toString(), field).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsWeekend(cal: ConstPtr, date: Double, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcalIsWeekend(cal.rawAddress.toString(), date, status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpen(zoneid: ConstPtr, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalOpen(zoneid.rawAddress.toString(), len, locale.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(country.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(zonetype, region.rawAddress.toString(), rawoffset.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZones(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcalOpenTimeZones(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalRoll(cal: MutPtr, field: UCalendarDateFields, amount: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalRoll(cal.rawAddress.toString(), field, amount, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSet(cal: MutPtr, field: UCalendarDateFields, value: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSet(cal.rawAddress.toString(), field, value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetAttribute(cal: MutPtr, attr: UCalendarAttribute, newvalue: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetAttribute(cal.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDate(cal: MutPtr, year: Int, month: Int, date: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetDate(cal.rawAddress.toString(), year, month, date, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDateTime(cal: MutPtr, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetDateTime(cal.rawAddress.toString(), year, month, date, hour, minute, second, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDefaultTimeZone(zoneid: ConstPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(zoneid.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetGregorianChange(cal: MutPtr, date: Double, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetGregorianChange(cal.rawAddress.toString(), date, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetMillis(cal: MutPtr, datetime: Double, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetMillis(cal.rawAddress.toString(), datetime, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetTimeZone(cal: MutPtr, zoneid: ConstPtr, len: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcalSetTimeZone(cal.rawAddress.toString(), zoneid.rawAddress.toString(), len, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapClose(csm: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcasemapClose(csm.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapGetBreakIterator(csm: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(csm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetLocale(csm: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcasemapGetLocale(csm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetOptions(csm: ConstPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapGetOptions(csm.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcasemapOpen(locale.rawAddress.toString(), options.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapSetBreakIterator(csm: MutPtr, itertoadopt: MutPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(csm.rawAddress.toString(), itertoadopt.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetLocale(csm: MutPtr, locale: Pcstr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcasemapSetLocale(csm.rawAddress.toString(), locale.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetOptions(csm: MutPtr, options: UInt, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcasemapSetOptions(csm.rawAddress.toString(), options.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapToTitle(csm: MutPtr, dest: MutPtr, destcapacity: Int, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapToTitle(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8FoldCase(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToLower(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToTitle(csm: MutPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToUpper(csm: ConstPtr, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposClose(ucfpos: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposClose(ucfpos.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainCategory(ucfpos: MutPtr, category: Int, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposConstrainCategory(ucfpos.rawAddress.toString(), category, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainField(ucfpos: MutPtr, category: Int, field: Int, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposConstrainField(ucfpos.rawAddress.toString(), category, field, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetCategory(ucfpos: ConstPtr, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcfposGetCategory(ucfpos.rawAddress.toString(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetField(ucfpos: ConstPtr, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcfposGetField(ucfpos.rawAddress.toString(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetIndexes(ucfpos: ConstPtr, pstart: MutPtr, plimit: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposGetIndexes(ucfpos.rawAddress.toString(), pstart.rawAddress.toString(), plimit.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetInt64IterationContext(ucfpos: ConstPtr, ec: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(ucfpos.rawAddress.toString(), ec.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposMatchesField(ucfpos: ConstPtr, category: Int, field: Int, ec: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcfposMatchesField(ucfpos.rawAddress.toString(), category, field, ec.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposOpen(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcfposOpen(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposReset(ucfpos: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposReset(ucfpos.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetInt64IterationContext(ucfpos: MutPtr, context: Long, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(ucfpos.rawAddress.toString(), context.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetState(ucfpos: MutPtr, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcfposSetState(ucfpos.rawAddress.toString(), category, field, start, limit, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteBytes(args: MutPtr, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(args.rawAddress.toString(), source.rawAddress.toString(), length, offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteSub(args: MutPtr, offsetindex: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(args.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteUchars(args: MutPtr, source: ConstPtr, sourcelimit: ConstPtr, offsetindex: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(args.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteSub(args: MutPtr, offsetindex: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(args.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteUchars(args: MutPtr, source: ConstPtr, length: Int, offsetindex: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(args.rawAddress.toString(), source.rawAddress.toString(), length, offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvClose(converter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvClose(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvCompareNames(name1.rawAddress.toString(), name2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvConvert(toconvertername.rawAddress.toString(), fromconvertername.rawAddress.toString(), target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvertEx(targetcnv: MutPtr, sourcecnv: MutPtr, target: MutPtr, targetlimit: Pcstr, source: ConstPtr, sourcelimit: Pcstr, pivotstart: MutPtr, pivotsource: MutPtr, pivottarget: MutPtr, pivotlimit: ConstPtr, reset: Byte, flush: Byte, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvConvertEx(targetcnv.rawAddress.toString(), sourcecnv.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), pivotstart.rawAddress.toString(), pivotsource.rawAddress.toString(), pivottarget.rawAddress.toString(), pivotlimit.rawAddress.toString(), reset.toInt(), flush.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvCountAliases(alias.rawAddress.toString(), perrorcode.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountStandards(): UShort =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvCountStandards().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr, perrorcode: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(source.rawAddress.toString(), sourcelength, signaturelength.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFixFileSeparator(cnv: ConstPtr, source: MutPtr, sourcelen: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFixFileSeparator(cnv.rawAddress.toString(), source.rawAddress.toString(), sourcelen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFlushCache(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvFlushCache() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromAlgorithmic(cnv: MutPtr, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(cnv.rawAddress.toString(), algorithmictype, target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUchars(cnv: MutPtr, dest: Pcstr, destcapacity: Int, src: ConstPtr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvFromUchars(cnv.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUcountPending(cnv: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvFromUcountPending(cnv.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUnicode(converter: MutPtr, target: MutPtr, targetlimit: Pcstr, source: ConstPtr, sourcelimit: ConstPtr, offsets: MutPtr, flush: Byte, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvFromUnicode(converter.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsets.rawAddress.toString(), flush.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetAlias(alias.rawAddress.toString(), n.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetAliases(alias.rawAddress.toString(), aliases.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetAvailableName(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCcsid(converter: ConstPtr, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetCcsid(converter.rawAddress.toString(), err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetCanonicalName(alias.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDefaultName(): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetDefaultName().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDisplayName(converter: ConstPtr, displaylocale: Pcstr, displayname: MutPtr, displaynamecapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetDisplayName(converter.rawAddress.toString(), displaylocale.rawAddress.toString(), displayname.rawAddress.toString(), displaynamecapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetFromUcallBack(converter: ConstPtr, action: MutPtr, context: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(converter.rawAddress.toString(), action.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidChars(converter: ConstPtr, errbytes: Pcstr, len: MutPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetInvalidChars(converter.rawAddress.toString(), errbytes.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidUchars(converter: ConstPtr, erruchars: MutPtr, len: MutPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(converter.rawAddress.toString(), erruchars.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetMaxCharSize(converter: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(converter.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetMinCharSize(converter: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetMinCharSize(converter.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetName(converter: ConstPtr, err: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetName(converter.rawAddress.toString(), err.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetNextUchar(converter: MutPtr, source: ConstPtr, sourcelimit: Pcstr, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetNextUchar(converter.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetPlatform(converter: ConstPtr, err: MutPtr): UConverterPlatform =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetPlatform(converter.rawAddress.toString(), err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandard(n: UShort, perrorcode: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetStandard(n.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcnvGetStandardName(name.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStarters(converter: ConstPtr, starters: MutPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetStarters(converter.rawAddress.toString(), starters.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetSubstChars(converter: ConstPtr, subchars: Pcstr, len: MutPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetSubstChars(converter.rawAddress.toString(), subchars.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetToUcallBack(converter: ConstPtr, action: MutPtr, context: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetToUcallBack(converter.rawAddress.toString(), action.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetType(converter: ConstPtr): UConverterType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvGetType(converter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetUnicodeSet(cnv: ConstPtr, setfillin: MutPtr, whichset: UConverterUnicodeSet, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(cnv.rawAddress.toString(), setfillin.rawAddress.toString(), whichset, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvIsAmbiguous(cnv: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvIsAmbiguous(cnv.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvIsFixedWidth(cnv: MutPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvIsFixedWidth(cnv.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpen(convertername: Pcstr, err: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpen(convertername.rawAddress.toString(), err.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenAllNames(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpenAllNames(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpenCcsid(codepage, platform, err.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpenPackage(packagename.rawAddress.toString(), convertername.rawAddress.toString(), err.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpenStandardNames(convname.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenU(name: ConstPtr, err: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvOpenU(name.rawAddress.toString(), err.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvReset(converter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvReset(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetFromUnicode(converter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvResetFromUnicode(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetToUnicode(converter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvResetToUnicode(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSafeClone(cnv: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvSafeClone(cnv.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvSetDefaultName(name: Pcstr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetDefaultName(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFallback(cnv: MutPtr, usesfallback: Byte) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetFallback(cnv.rawAddress.toString(), usesfallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFromUcallBack(converter: MutPtr, newaction: UConverterFromUCallback, newcontext: ConstPtr, oldaction: MutPtr, oldcontext: ConstPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(converter.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldaction.rawAddress.toString(), oldcontext.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstChars(converter: MutPtr, subchars: Pcstr, len: Byte, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetSubstChars(converter.rawAddress.toString(), subchars.rawAddress.toString(), len.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstString(cnv: MutPtr, s: ConstPtr, length: Int, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetSubstString(cnv.rawAddress.toString(), s.rawAddress.toString(), length, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetToUcallBack(converter: MutPtr, newaction: UConverterToUCallback, newcontext: ConstPtr, oldaction: MutPtr, oldcontext: ConstPtr, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvSetToUcallBack(converter.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldaction.rawAddress.toString(), oldcontext.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvToAlgorithmic(algorithmictype, cnv.rawAddress.toString(), target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUchars(cnv: MutPtr, dest: MutPtr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvToUchars(cnv.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUcountPending(cnv: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvToUcountPending(cnv.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUnicode(converter: MutPtr, target: MutPtr, targetlimit: ConstPtr, source: ConstPtr, sourcelimit: Pcstr, offsets: MutPtr, flush: Byte, err: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvToUnicode(converter.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsets.rawAddress.toString(), flush.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvUsesFallback(cnv: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvUsesFallback(cnv.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselClose(sel: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcnvselClose(sel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvselOpen(converterlist: ConstPtr, converterlistsize: Int, excludedcodepoints: ConstPtr, whichset: UConverterUnicodeSet, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvselOpen(converterlist.rawAddress.toString(), converterlistsize, excludedcodepoints.rawAddress.toString(), whichset, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselOpenFromSerialized(buffer: ConstPtr, length: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(buffer.rawAddress.toString(), length, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForString(sel: ConstPtr, s: ConstPtr, length: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvselSelectForString(sel.rawAddress.toString(), s.rawAddress.toString(), length, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForUtf8(sel: ConstPtr, s: Pcstr, length: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(sel.rawAddress.toString(), s.rawAddress.toString(), length, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSerialize(sel: ConstPtr, buffer: MutPtr, buffercapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcnvselSerialize(sel.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolCloneBinary(coll: ConstPtr, buffer: MutPtr, capacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolCloneBinary(coll.rawAddress.toString(), buffer.rawAddress.toString(), capacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolClose(coll: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolClose(coll.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCloseElements(elems: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolCloseElements(elems.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolEqual(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolEqual(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAttribute(coll: ConstPtr, attr: UColAttribute, status: MutPtr): UColAttributeValue =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetAttribute(coll.rawAddress.toString(), attr, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetAvailable(localeindex).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetBound(source: ConstPtr, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetBound(source.rawAddress.toString(), sourcelength, boundtype, nooflevels.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetContractionsAndExpansions(coll: ConstPtr, contractions: MutPtr, expansions: MutPtr, addprefixes: Byte, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(coll.rawAddress.toString(), contractions.rawAddress.toString(), expansions.rawAddress.toString(), addprefixes.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetDisplayName(objloc.rawAddress.toString(), disploc.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(reordercode, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(result.rawAddress.toString(), resultcapacity, keyword.rawAddress.toString(), locale.rawAddress.toString(), isavailable.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetKeywordValues(keyword.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywords(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetKeywords(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetLocaleByType(coll: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetLocaleByType(coll.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxExpansion(elems: ConstPtr, order: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetMaxExpansion(elems.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxVariable(coll: ConstPtr): UColReorderCode =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetMaxVariable(coll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetOffset(elems: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetOffset(elems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetReorderCodes(coll: ConstPtr, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetReorderCodes(coll.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRules(coll: ConstPtr, length: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetRules(coll.rawAddress.toString(), length.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRulesEx(coll: ConstPtr, delta: UColRuleOption, buffer: MutPtr, bufferlen: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetRulesEx(coll.rawAddress.toString(), delta, buffer.rawAddress.toString(), bufferlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetSortKey(coll: ConstPtr, source: ConstPtr, sourcelength: Int, result: MutPtr, resultlength: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetSortKey(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, result.rawAddress.toString(), resultlength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetStrength(coll: ConstPtr): UColAttributeValue =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetStrength(coll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetTailoredSet(coll: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolGetTailoredSet(coll.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetUcaversion(coll: ConstPtr, info: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolGetUcaversion(coll.rawAddress.toString(), info.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetVariableTop(coll: ConstPtr, status: MutPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGetVariableTop(coll.rawAddress.toString(), status.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetVersion(coll: ConstPtr, info: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolGetVersion(coll.rawAddress.toString(), info.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGreater(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGreater(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGreaterOrEqual(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolGreaterOrEqual(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolKeyHashCode(key: ConstPtr, length: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolKeyHashCode(key.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolMergeSortkeys(src1: ConstPtr, src1length: Int, src2: ConstPtr, src2length: Int, dest: MutPtr, destcapacity: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolMergeSortkeys(src1.rawAddress.toString(), src1length, src2.rawAddress.toString(), src2length, dest.rawAddress.toString(), destcapacity) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNext(elems: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolNext(elems.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNextSortKeyPart(coll: ConstPtr, iter: MutPtr, state: MutPtr, dest: MutPtr, count: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolNextSortKeyPart(coll.rawAddress.toString(), iter.rawAddress.toString(), state.rawAddress.toString(), dest.rawAddress.toString(), count, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpen(loc: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolOpen(loc.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenAvailableLocales(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenBinary(bin: ConstPtr, length: Int, base: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolOpenBinary(bin.rawAddress.toString(), length, base.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenElements(coll: ConstPtr, text: ConstPtr, textlength: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolOpenElements(coll.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenRules(rules: ConstPtr, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolOpenRules(rules.rawAddress.toString(), ruleslength, normalizationmode, strength, parseerror.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrevious(elems: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolPrevious(elems.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrimaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolPrimaryOrder(order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolReset(elems: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolReset(elems.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSafeClone(coll: ConstPtr, stackbuffer: MutPtr, pbuffersize: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcolSafeClone(coll.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSecondaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolSecondaryOrder(order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSetAttribute(coll: MutPtr, attr: UColAttribute, value: UColAttributeValue, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetAttribute(coll.rawAddress.toString(), attr, value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetMaxVariable(coll: MutPtr, group: UColReorderCode, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetMaxVariable(coll.rawAddress.toString(), group, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetOffset(elems: MutPtr, offset: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetOffset(elems.rawAddress.toString(), offset, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetReorderCodes(coll: MutPtr, reordercodes: ConstPtr, reordercodeslength: Int, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetReorderCodes(coll.rawAddress.toString(), reordercodes.rawAddress.toString(), reordercodeslength, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetStrength(coll: MutPtr, strength: UColAttributeValue) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetStrength(coll.rawAddress.toString(), strength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetText(elems: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcolSetText(elems.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolStrcoll(coll: ConstPtr, source: ConstPtr, sourcelength: Int, target: ConstPtr, targetlength: Int): UCollationResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolStrcoll(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollIter(coll: ConstPtr, siter: MutPtr, titer: MutPtr, status: MutPtr): UCollationResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolStrcollIter(coll.rawAddress.toString(), siter.rawAddress.toString(), titer.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollUtf8(coll: ConstPtr, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr): UCollationResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolStrcollUtf8(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolTertiaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcolTertiaryOrder(order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGet(map: ConstPtr, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcpmapGet(map.rawAddress.toString(), c).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGetRange(map: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcpmapGetRange(map.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieClose(trie: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcptrieClose(trie.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucptrieGet(trie: ConstPtr, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieGet(trie.rawAddress.toString(), c).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetRange(trie: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieGetRange(trie.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetType(trie: ConstPtr): UCPTrieType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieGetType(trie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetValueWidth(trie: ConstPtr): UCPTrieValueWidth =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieGetValueWidth(trie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallIndex(trie: ConstPtr, c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(trie.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallU8Index(trie: ConstPtr, lt1: Int, t2: UByte, t3: UByte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(trie.rawAddress.toString(), lt1, t2.toInt(), t3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalU8PrevIndex(trie: ConstPtr, c: Int, start: ConstPtr, src: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(trie.rawAddress.toString(), c, start.rawAddress.toString(), src.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr, length: Int, pactuallength: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(type, valuewidth, data.rawAddress.toString(), length, pactuallength.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieToBinary(trie: ConstPtr, data: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcptrieToBinary(trie.rawAddress.toString(), data.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetClose(ucsd: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcsdetClose(ucsd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetDetect(ucsd: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetDetect(ucsd.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetDetectAll(ucsd: MutPtr, matchesfound: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetDetectAll(ucsd.rawAddress.toString(), matchesfound.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetEnableInputFilter(ucsd: MutPtr, filter: Byte): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(ucsd.rawAddress.toString(), filter.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(ucsd.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetConfidence(ucsm: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcsdetGetConfidence(ucsm.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetLanguage(ucsm: ConstPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetGetLanguage(ucsm.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetName(ucsm: ConstPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetGetName(ucsm.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetUchars(ucsm: ConstPtr, buf: MutPtr, cap: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcsdetGetUchars(ucsm.rawAddress.toString(), buf.rawAddress.toString(), cap, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(ucsd.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetOpen(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcsdetOpen(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetSetDeclaredEncoding(ucsd: MutPtr, encoding: Pcstr, length: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(ucsd.rawAddress.toString(), encoding.rawAddress.toString(), length, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetSetText(ucsd: MutPtr, textin: Pcstr, len: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUcsdetSetText(ucsd.rawAddress.toString(), textin.rawAddress.toString(), len, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrCountCurrencies(locale.rawAddress.toString(), date, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocale(locale: Pcstr, buff: MutPtr, buffcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrForLocale(locale.rawAddress.toString(), buff.rawAddress.toString(), buffcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr, buffcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(locale.rawAddress.toString(), date, index, buff.rawAddress.toString(), buffcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigits(currency: ConstPtr, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(currency.rawAddress.toString(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr, usage: UCurrencyUsage, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(currency.rawAddress.toString(), usage, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetName(currency: ConstPtr, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr, len: MutPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcurrGetName(currency.rawAddress.toString(), locale.rawAddress.toString(), namestyle, ischoiceformat.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetNumericCode(currency: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrGetNumericCode(currency.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetPluralName(currency: ConstPtr, locale: Pcstr, ischoiceformat: MutPtr, pluralcount: Pcstr, len: MutPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcurrGetPluralName(currency.rawAddress.toString(), locale.rawAddress.toString(), ischoiceformat.rawAddress.toString(), pluralcount.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrement(currency: ConstPtr, ec: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(currency.rawAddress.toString(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr, usage: UCurrencyUsage, ec: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(currency.rawAddress.toString(), usage, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrIsAvailable(isocode: ConstPtr, from: Double, to: Double, errorcode: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrIsAvailable(isocode.rawAddress.toString(), from, to, errorcode.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(currtype.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrRegister(isocode: ConstPtr, locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUcurrRegister(isocode.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrUnregister(key: MutPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUcurrUnregister(key.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatAdoptNumberFormat(fmt: MutPtr, numberformattoadopt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(fmt.rawAddress.toString(), numberformattoadopt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatAdoptNumberFormatForFields(fmt: MutPtr, fields: ConstPtr, numberformattoset: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(fmt.rawAddress.toString(), fields.rawAddress.toString(), numberformattoset.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatApplyPattern(format: MutPtr, localized: Byte, pattern: ConstPtr, patternlength: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatApplyPattern(format.rawAddress.toString(), localized.toInt(), pattern.rawAddress.toString(), patternlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatClone(fmt: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatClone(fmt.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatClose(format: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatClose(format.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatCountSymbols(fmt: ConstPtr, type: UDateFormatSymbolType): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatCountSymbols(fmt.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormat(format: ConstPtr, datetoformat: Double, result: MutPtr, resultlength: Int, position: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatFormat(format.rawAddress.toString(), datetoformat, result.rawAddress.toString(), resultlength, position.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendar(format: ConstPtr, calendar: MutPtr, result: MutPtr, capacity: Int, position: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatFormatCalendar(format.rawAddress.toString(), calendar.rawAddress.toString(), result.rawAddress.toString(), capacity, position.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendarForFields(format: ConstPtr, calendar: MutPtr, result: MutPtr, capacity: Int, fpositer: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(format.rawAddress.toString(), calendar.rawAddress.toString(), result.rawAddress.toString(), capacity, fpositer.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatForFields(format: ConstPtr, datetoformat: Double, result: MutPtr, resultlength: Int, fpositer: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatFormatForFields(format.rawAddress.toString(), datetoformat, result.rawAddress.toString(), resultlength, fpositer.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGet2DigitYearStart(fmt: ConstPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUdatGetAvailable(localeindex).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetBooleanAttribute(fmt: ConstPtr, attr: UDateFormatBooleanAttribute, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(fmt.rawAddress.toString(), attr, status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetCalendar(fmt: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatGetCalendar(fmt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetContext(fmt: ConstPtr, type: UDisplayContextType, status: MutPtr): UDisplayContext =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatGetContext(fmt.rawAddress.toString(), type, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetLocaleByType(fmt: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUdatGetLocaleByType(fmt.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormat(fmt: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatGetNumberFormat(fmt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormatForField(fmt: ConstPtr, field: UShort): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(fmt.rawAddress.toString(), field.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetSymbols(fmt: ConstPtr, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatGetSymbols(fmt.rawAddress.toString(), type, symbolindex, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatIsLenient(fmt: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatIsLenient(fmt.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr, tzidlength: Int, pattern: ConstPtr, patternlength: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatOpen(timestyle, datestyle, locale.rawAddress.toString(), tzid.rawAddress.toString(), tzidlength, pattern.rawAddress.toString(), patternlength, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParse(format: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatParse(format.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParseCalendar(format: ConstPtr, calendar: MutPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatParseCalendar(format.rawAddress.toString(), calendar.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSet2DigitYearStart(fmt: MutPtr, d: Double, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(fmt.rawAddress.toString(), d, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetBooleanAttribute(fmt: MutPtr, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(fmt.rawAddress.toString(), attr, newvalue.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetCalendar(fmt: MutPtr, calendartoset: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetCalendar(fmt.rawAddress.toString(), calendartoset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetContext(fmt: MutPtr, value: UDisplayContext, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetContext(fmt.rawAddress.toString(), value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetLenient(fmt: MutPtr, islenient: Byte) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetLenient(fmt.rawAddress.toString(), islenient.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetNumberFormat(fmt: MutPtr, numberformattoset: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetNumberFormat(fmt.rawAddress.toString(), numberformattoset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetSymbols(format: MutPtr, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr, valuelength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatSetSymbols(format.rawAddress.toString(), type, symbolindex, value.rawAddress.toString(), valuelength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatToCalendarDateField(field) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatToPattern(fmt: ConstPtr, localized: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatToPattern(fmt.rawAddress.toString(), localized.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgAddPattern(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, override: Byte, conflictingpattern: MutPtr, capacity: Int, plength: MutPtr, perrorcode: MutPtr): UDateTimePatternConflict =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgAddPattern(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, override.toInt(), conflictingpattern.rawAddress.toString(), capacity, plength.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClone(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgClone(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClose(dtpg: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatpgClose(dtpg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgGetAppendItemFormat(dtpg: ConstPtr, field: UDateTimePatternField, plength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(dtpg.rawAddress.toString(), field, plength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetAppendItemName(dtpg: ConstPtr, field: UDateTimePatternField, plength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(dtpg.rawAddress.toString(), field, plength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr, pattern: ConstPtr, length: Int, baseskeleton: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(unuseddtpg.rawAddress.toString(), pattern.rawAddress.toString(), length, baseskeleton.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPattern(dtpg: MutPtr, skeleton: ConstPtr, length: Int, bestpattern: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgGetBestPattern(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), length, bestpattern.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPatternWithOptions(dtpg: MutPtr, skeleton: ConstPtr, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), length, options, bestpattern.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDateTimeFormat(dtpg: ConstPtr, plength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(dtpg.rawAddress.toString(), plength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDecimal(dtpg: ConstPtr, plength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgGetDecimal(dtpg.rawAddress.toString(), plength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetFieldDisplayName(dtpg: ConstPtr, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(dtpg.rawAddress.toString(), field, width, fieldname.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetPatternForSkeleton(dtpg: ConstPtr, skeleton: ConstPtr, skeletonlength: Int, plength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), skeletonlength, plength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetSkeleton(unuseddtpg: MutPtr, pattern: ConstPtr, length: Int, skeleton: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgGetSkeleton(unuseddtpg.rawAddress.toString(), pattern.rawAddress.toString(), length, skeleton.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgOpen(locale.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenBaseSkeletons(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenEmpty(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgOpenEmpty(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenSkeletons(dtpg: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypes(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, skeleton: ConstPtr, skeletonlength: Int, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, skeleton.rawAddress.toString(), skeletonlength, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr, pattern: ConstPtr, patternlength: Int, skeleton: ConstPtr, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, skeleton.rawAddress.toString(), skeletonlength, options, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgSetAppendItemFormat(dtpg: MutPtr, field: UDateTimePatternField, value: ConstPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(dtpg.rawAddress.toString(), field, value.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetAppendItemName(dtpg: MutPtr, field: UDateTimePatternField, value: ConstPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(dtpg.rawAddress.toString(), field, value.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDateTimeFormat(dtpg: ConstPtr, dtformat: ConstPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(dtpg.rawAddress.toString(), dtformat.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDecimal(dtpg: MutPtr, decimal: ConstPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdatpgSetDecimal(dtpg.rawAddress.toString(), decimal.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtClose(formatter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdtitvfmtClose(formatter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtCloseResult(uresult: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtFormat(formatter: ConstPtr, fromdate: Double, todate: Double, result: MutPtr, resultcapacity: Int, position: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUdtitvfmtFormat(formatter.rawAddress.toString(), fromdate, todate, result.rawAddress.toString(), resultcapacity, position.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr, skeletonlength: Int, tzid: ConstPtr, tzidlength: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdtitvfmtOpen(locale.rawAddress.toString(), skeleton.rawAddress.toString(), skeletonlength, tzid.rawAddress.toString(), tzidlength, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpenResult(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumClose(en: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUenumClose(en.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumCount(en: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUenumCount(en.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumNext(en: MutPtr, resultlength: MutPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUenumNext(en.rawAddress.toString(), resultlength.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenCharStringsEnumeration(strings: ConstPtr, count: Int, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(strings.rawAddress.toString(), count, ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenUcharStringsEnumeration(strings: ConstPtr, count: Int, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(strings.rawAddress.toString(), count, ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumReset(en: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUenumReset(en.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumUnext(en: MutPtr, resultlength: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUenumUnext(en.rawAddress.toString(), resultlength.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerClose(fpositer: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUfieldpositerClose(fpositer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufieldpositerNext(fpositer: MutPtr, beginindex: MutPtr, endindex: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfieldpositerNext(fpositer.rawAddress.toString(), beginindex.rawAddress.toString(), endindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerOpen(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfieldpositerOpen(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtClose(fmt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUfmtClose(fmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufmtGetArrayItemByIndex(fmt: MutPtr, n: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(fmt.rawAddress.toString(), n, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetArrayLength(fmt: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetArrayLength(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDate(fmt: ConstPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetDate(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDecNumChars(fmt: MutPtr, len: MutPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUfmtGetDecNumChars(fmt.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDouble(fmt: MutPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetDouble(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetInt64(fmt: MutPtr, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetInt64(fmt.rawAddress.toString(), status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetLong(fmt: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetLong(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetObject(fmt: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfmtGetObject(fmt.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetType(fmt: ConstPtr, status: MutPtr): UFormattableType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtGetType(fmt.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetUchars(fmt: MutPtr, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfmtGetUchars(fmt.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtIsNumeric(fmt: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtIsNumeric(fmt.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtOpen(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfmtOpen(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalGetString(ufmtval: ConstPtr, plength: MutPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUfmtvalGetString(ufmtval.rawAddress.toString(), plength.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalNextPosition(ufmtval: ConstPtr, ucfpos: MutPtr, ec: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUfmtvalNextPosition(ufmtval.rawAddress.toString(), ucfpos.rawAddress.toString(), ec.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetInstance(locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUgenderGetInstance(locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetListGender(genderinfo: ConstPtr, genders: ConstPtr, size: Int, status: MutPtr): UGender =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUgenderGetListGender(genderinfo.rawAddress.toString(), genders.rawAddress.toString(), size, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaClose(idna: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUidnaClose(idna.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uidnaLabelToAscii(idna: ConstPtr, label: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaLabelToAscii(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToAsciiUtf8(idna: ConstPtr, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicode(idna: ConstPtr, label: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaLabelToUnicode(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicodeUtf8(idna: ConstPtr, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAscii(idna: ConstPtr, name: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaNameToAscii(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAsciiUtf8(idna: ConstPtr, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicode(idna: ConstPtr, name: ConstPtr, length: Int, dest: MutPtr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaNameToUnicode(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicodeUtf8(idna: ConstPtr, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUidnaOpenUts46(options.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterCurrent32(iter: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUiterCurrent32(iter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterGetState(iter: ConstPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUiterGetState(iter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterNext32(iter: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUiterNext32(iter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterPrevious32(iter: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUiterPrevious32(iter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterSetState(iter: MutPtr, state: UInt, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUiterSetState(iter.rawAddress.toString(), state.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetString(iter: MutPtr, s: ConstPtr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUiterSetString(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf16Be(iter: MutPtr, s: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUiterSetUtf16Be(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf8(iter: MutPtr, s: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUiterSetUtf8(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnClose(ldn: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUldnClose(ldn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnGetContext(ldn: ConstPtr, type: UDisplayContextType, perrorcode: MutPtr): UDisplayContext =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnGetContext(ldn.rawAddress.toString(), type, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetDialectHandling(ldn: ConstPtr): UDialectHandling =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnGetDialectHandling(ldn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetLocale(ldn: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUldnGetLocale(ldn.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyDisplayName(ldn: ConstPtr, key: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnKeyDisplayName(ldn.rawAddress.toString(), key.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyValueDisplayName(ldn: ConstPtr, key: Pcstr, value: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(ldn.rawAddress.toString(), key.rawAddress.toString(), value.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLanguageDisplayName(ldn: ConstPtr, lang: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnLanguageDisplayName(ldn.rawAddress.toString(), lang.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLocaleDisplayName(ldn: ConstPtr, locale: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnLocaleDisplayName(ldn.rawAddress.toString(), locale.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUldnOpen(locale.rawAddress.toString(), dialecthandling, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr, length: Int, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUldnOpenForContext(locale.rawAddress.toString(), contexts.rawAddress.toString(), length, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnRegionDisplayName(ldn: ConstPtr, region: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnRegionDisplayName(ldn.rawAddress.toString(), region.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptCodeDisplayName(ldn: ConstPtr, scriptcode: UScriptCode, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(ldn.rawAddress.toString(), scriptcode, result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptDisplayName(ldn: ConstPtr, script: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnScriptDisplayName(ldn.rawAddress.toString(), script.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnVariantDisplayName(ldn: ConstPtr, variant: Pcstr, result: MutPtr, maxresultsize: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUldnVariantDisplayName(ldn.rawAddress.toString(), variant.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtClose(listfmt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlistfmtClose(listfmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtCloseResult(uresult: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlistfmtCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtFormat(listfmt: ConstPtr, strings: ConstPtr, stringlengths: ConstPtr, stringcount: Int, result: MutPtr, resultcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlistfmtFormat(listfmt.rawAddress.toString(), strings.rawAddress.toString(), stringlengths.rawAddress.toString(), stringcount, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtFormatStringsToResult(listfmt: ConstPtr, strings: ConstPtr, stringlengths: ConstPtr, stringcount: Int, uresult: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(listfmt.rawAddress.toString(), strings.rawAddress.toString(), stringlengths.rawAddress.toString(), stringcount, uresult.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtOpen(locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlistfmtOpen(locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlistfmtOpenForType(locale.rawAddress.toString(), type, width, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenResult(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlistfmtOpenResult(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlistfmtResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr, acceptlist: ConstPtr, acceptlistcount: Int, availablelocales: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocAcceptLanguage(result.rawAddress.toString(), resultavailable, outresult.rawAddress.toString(), acceptlist.rawAddress.toString(), acceptlistcount, availablelocales.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr, httpacceptlanguage: Pcstr, availablelocales: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(result.rawAddress.toString(), resultavailable, outresult.rawAddress.toString(), httpacceptlanguage.rawAddress.toString(), availablelocales.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocAddLikelySubtags(localeid.rawAddress.toString(), maximizedlocaleid.rawAddress.toString(), maximizedlocaleidcapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocCanonicalize(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocForLanguageTag(langtag.rawAddress.toString(), localeid.rawAddress.toString(), localeidcapacity, parsedlength.rawAddress.toString(), err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetAvailable(n: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetAvailable(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetBaseName(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr): ULayoutType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(localeid.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetCountry(localeid.rawAddress.toString(), country.rawAddress.toString(), countrycapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDefault(): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetDefault().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr, countrycapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayCountry(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), country.rawAddress.toString(), countrycapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(keyword.rawAddress.toString(), displaylocale.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(locale.rawAddress.toString(), keyword.rawAddress.toString(), displaylocale.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr, languagecapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), language.rawAddress.toString(), languagecapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr, maxresultsize: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayName(localeid.rawAddress.toString(), inlocaleid.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr, scriptcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayScript(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), script.rawAddress.toString(), scriptcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr, variantcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetDisplayVariant(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), variant.rawAddress.toString(), variantcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetIso3Country(localeid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetIso3Language(localeid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsocountries(): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetIsocountries().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsolanguages(): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocGetIsolanguages().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetKeywordValue(localeid.rawAddress.toString(), keywordname.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetLcid(localeid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetLanguage(localeid.rawAddress.toString(), language.rawAddress.toString(), languagecapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr): ULayoutType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetLineOrientation(localeid.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(hostid.toInt(), locale.rawAddress.toString(), localecapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetName(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetParent(localeid.rawAddress.toString(), parent.rawAddress.toString(), parentcapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetScript(localeid.rawAddress.toString(), script.rawAddress.toString(), scriptcapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocGetVariant(localeid.rawAddress.toString(), variant.rawAddress.toString(), variantcapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocIsRightToLeft(locale.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocMinimizeSubtags(localeid.rawAddress.toString(), minimizedlocaleid.rawAddress.toString(), minimizedlocaleidcapacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocOpenAvailableByType(type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocOpenKeywords(localeid.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocSetDefault(localeid: Pcstr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlocSetDefault(localeid.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocSetKeywordValue(keywordname.rawAddress.toString(), keywordvalue.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocToLanguageTag(localeid.rawAddress.toString(), langtag.rawAddress.toString(), langtagcapacity, strict.toInt(), err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocToLegacyKey(keyword.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocToLegacyType(keyword.rawAddress.toString(), value.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(keyword.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(keyword.rawAddress.toString(), value.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataClose(uld: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlocdataClose(uld.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetCldrversion(versionarray: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlocdataGetCldrversion(versionarray.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetDelimiter(uld: MutPtr, type: ULocaleDataDelimiterType, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocdataGetDelimiter(uld.rawAddress.toString(), type, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetExemplarSet(uld: MutPtr, fillin: MutPtr, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(uld.rawAddress.toString(), fillin.rawAddress.toString(), options.toInt(), extype, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleDisplayPattern(uld: MutPtr, pattern: MutPtr, patterncapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(uld.rawAddress.toString(), pattern.rawAddress.toString(), patterncapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleSeparator(uld: MutPtr, separator: MutPtr, separatorcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(uld.rawAddress.toString(), separator.rawAddress.toString(), separatorcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr): UMeasurementSystem =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(localeid.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetNoSubstitute(uld: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(uld.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr, width: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlocdataGetPaperSize(localeid.rawAddress.toString(), height.rawAddress.toString(), width.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataOpen(localeid: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUlocdataOpen(localeid.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataSetNoSubstitute(uld: MutPtr, setting: Byte) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(uld.rawAddress.toString(), setting.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgApplyPattern(fmt: MutPtr, pattern: ConstPtr, patternlength: Int, parseerror: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmsgApplyPattern(fmt.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgAutoQuoteApostrophe(pattern: ConstPtr, patternlength: Int, dest: MutPtr, destcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(pattern.rawAddress.toString(), patternlength, dest.rawAddress.toString(), destcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClone(fmt: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmsgClone(fmt.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClose(format: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmsgClose(format.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgFormat(fmt: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmsgFormat(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgGetLocale(fmt: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUmsgGetLocale(fmt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgOpen(pattern: ConstPtr, patternlength: Int, locale: Pcstr, parseerror: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmsgOpen(pattern.rawAddress.toString(), patternlength, locale.rawAddress.toString(), parseerror.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgParse(fmt: ConstPtr, source: ConstPtr, sourcelength: Int, count: MutPtr, status: MutPtr, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmsgParse(fmt.rawAddress.toString(), source.rawAddress.toString(), sourcelength, count.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgSetLocale(fmt: MutPtr, locale: Pcstr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmsgSetLocale(fmt.rawAddress.toString(), locale.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgToPattern(fmt: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmsgToPattern(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVformat(fmt: ConstPtr, result: MutPtr, resultlength: Int, ap: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmsgVformat(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, ap.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVparse(fmt: ConstPtr, source: ConstPtr, sourcelength: Int, count: MutPtr, ap: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmsgVparse(fmt.rawAddress.toString(), source.rawAddress.toString(), sourcelength, count.rawAddress.toString(), ap.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieBuildImmutable(trie: MutPtr, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(trie.rawAddress.toString(), type, valuewidth, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClone(other: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmutablecptrieClone(other.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClose(trie: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmutablecptrieClose(trie.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieFromUcpmap(map: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(map.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieFromUcptrie(trie: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(trie.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGet(trie: ConstPtr, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmutablecptrieGet(trie.rawAddress.toString(), c).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGetRange(trie: ConstPtr, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr, context: ConstPtr, pvalue: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUmutablecptrieGetRange(trie.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUmutablecptrieOpen(initialvalue.toInt(), errorvalue.toInt(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieSet(trie: MutPtr, c: Int, value: UInt, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmutablecptrieSet(trie.rawAddress.toString(), c, value.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieSetRange(trie: MutPtr, start: Int, end: Int, value: UInt, perrorcode: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUmutablecptrieSetRange(trie.rawAddress.toString(), start, end, value.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2Append(norm2: ConstPtr, first: MutPtr, firstlength: Int, firstcapacity: Int, second: ConstPtr, secondlength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2Append(norm2.rawAddress.toString(), first.rawAddress.toString(), firstlength, firstcapacity, second.rawAddress.toString(), secondlength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Close(norm2: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnorm2Close(norm2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2ComposePair(norm2: ConstPtr, a: Int, b: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2ComposePair(norm2.rawAddress.toString(), a, b) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetCombiningClass(norm2: ConstPtr, c: Int): UByte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(norm2.rawAddress.toString(), c).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetDecomposition(norm2: ConstPtr, c: Int, decomposition: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2GetDecomposition(norm2.rawAddress.toString(), c, decomposition.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetInstance(packagename.rawAddress.toString(), name.rawAddress.toString(), mode, perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfcinstance(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfdinstance(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkcinstance(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkdinstance(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetRawDecomposition(norm2: ConstPtr, c: Int, decomposition: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(norm2.rawAddress.toString(), c, decomposition.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryAfter(norm2: ConstPtr, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(norm2.rawAddress.toString(), c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryBefore(norm2: ConstPtr, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(norm2.rawAddress.toString(), c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsInert(norm2: ConstPtr, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2IsInert(norm2.rawAddress.toString(), c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsNormalized(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2IsNormalized(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Normalize(norm2: ConstPtr, src: ConstPtr, length: Int, dest: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2Normalize(norm2.rawAddress.toString(), src.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr, first: MutPtr, firstlength: Int, firstcapacity: Int, second: ConstPtr, secondlength: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(norm2.rawAddress.toString(), first.rawAddress.toString(), firstlength, firstcapacity, second.rawAddress.toString(), secondlength, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2OpenFiltered(norm2: ConstPtr, filterset: ConstPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnorm2OpenFiltered(norm2.rawAddress.toString(), filterset.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2QuickCheck(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): UNormalizationCheckResult =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2QuickCheck(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2SpanQuickCheckYes(norm2: ConstPtr, s: ConstPtr, length: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unormCompare(s1: ConstPtr, length1: Int, s2: ConstPtr, length2: Int, options: UInt, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnormCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, options.toInt(), perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumApplyPattern(format: MutPtr, localized: Byte, pattern: ConstPtr, patternlength: Int, parseerror: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumApplyPattern(format.rawAddress.toString(), localized.toInt(), pattern.rawAddress.toString(), patternlength, parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumClone(fmt: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumClone(fmt.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumClose(fmt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumClose(fmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumCountAvailable() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormat(fmt: ConstPtr, number: Int, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormat(fmt.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDecimal(fmt: ConstPtr, number: Pcstr, length: Int, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatDecimal(fmt.rawAddress.toString(), number.rawAddress.toString(), length, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDouble(fmt: ConstPtr, number: Double, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatDouble(fmt.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleCurrency(fmt: ConstPtr, number: Double, currency: MutPtr, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(fmt.rawAddress.toString(), number, currency.rawAddress.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleForFields(format: ConstPtr, number: Double, result: MutPtr, resultlength: Int, fpositer: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(format.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, fpositer.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatInt64(fmt: ConstPtr, number: Long, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatInt64(fmt.rawAddress.toString(), number.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatUformattable(fmt: ConstPtr, number: ConstPtr, result: MutPtr, resultlength: Int, pos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumFormatUformattable(fmt.rawAddress.toString(), number.rawAddress.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAttribute(fmt: ConstPtr, attr: UNumberFormatAttribute): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumGetAttribute(fmt.rawAddress.toString(), attr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUnumGetAvailable(localeindex).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetContext(fmt: ConstPtr, type: UDisplayContextType, status: MutPtr): UDisplayContext =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumGetContext(fmt.rawAddress.toString(), type, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetDoubleAttribute(fmt: ConstPtr, attr: UNumberFormatAttribute): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(fmt.rawAddress.toString(), attr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetLocaleByType(fmt: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUnumGetLocaleByType(fmt.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetSymbol(fmt: ConstPtr, symbol: UNumberFormatSymbol, buffer: MutPtr, size: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumGetSymbol(fmt.rawAddress.toString(), symbol, buffer.rawAddress.toString(), size, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetTextAttribute(fmt: ConstPtr, tag: UNumberFormatTextAttribute, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumGetTextAttribute(fmt.rawAddress.toString(), tag, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr, patternlength: Int, locale: Pcstr, parseerr: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumOpen(style, pattern.rawAddress.toString(), patternlength, locale.rawAddress.toString(), parseerr.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParse(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumParse(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDecimal(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, outbuf: Pcstr, outbuflength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumParseDecimal(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), outbuf.rawAddress.toString(), outbuflength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDouble(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumParseDouble(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDoubleCurrency(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, currency: MutPtr, status: MutPtr): Double =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), currency.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseInt64(fmt: ConstPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumParseInt64(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseToUformattable(fmt: ConstPtr, result: MutPtr, text: ConstPtr, textlength: Int, parsepos: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumParseToUformattable(fmt.rawAddress.toString(), result.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumSetAttribute(fmt: MutPtr, attr: UNumberFormatAttribute, newvalue: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumSetAttribute(fmt.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetContext(fmt: MutPtr, value: UDisplayContext, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumSetContext(fmt.rawAddress.toString(), value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetDoubleAttribute(fmt: MutPtr, attr: UNumberFormatAttribute, newvalue: Double) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(fmt.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetSymbol(fmt: MutPtr, symbol: UNumberFormatSymbol, value: ConstPtr, length: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumSetSymbol(fmt.rawAddress.toString(), symbol, value.rawAddress.toString(), length, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetTextAttribute(fmt: MutPtr, tag: UNumberFormatTextAttribute, newvalue: ConstPtr, newvaluelength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumSetTextAttribute(fmt.rawAddress.toString(), tag, newvalue.rawAddress.toString(), newvaluelength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumToPattern(fmt: ConstPtr, ispatternlocalized: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumToPattern(fmt.rawAddress.toString(), ispatternlocalized.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfClose(uformatter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfClose(uformatter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfCloseResult(uresult: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDecimal(uformatter: ConstPtr, value: Pcstr, valuelen: Int, uresult: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfFormatDecimal(uformatter.rawAddress.toString(), value.rawAddress.toString(), valuelen, uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDouble(uformatter: ConstPtr, value: Double, uresult: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfFormatDouble(uformatter.rawAddress.toString(), value, uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatInt(uformatter: ConstPtr, value: Long, uresult: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfFormatInt(uformatter.rawAddress.toString(), value.toString(), uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr, skeletonlen: Int, locale: Pcstr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(skeleton.rawAddress.toString(), skeletonlen, locale.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr, skeletonlen: Int, locale: Pcstr, perror: MutPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(skeleton.rawAddress.toString(), skeletonlen, locale.rawAddress.toString(), perror.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenResult(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumfOpenResult(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultAsValue(uresult: ConstPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumfResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultGetAllFieldPositions(uresult: ConstPtr, ufpositer: MutPtr, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(uresult.rawAddress.toString(), ufpositer.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfResultNextFieldPosition(uresult: ConstPtr, ufpos: MutPtr, ec: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(uresult.rawAddress.toString(), ufpos.rawAddress.toString(), ec.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultToString(uresult: ConstPtr, buffer: MutPtr, buffercapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumfResultToString(uresult.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysClose(unumsys: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUnumsysClose(unumsys.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumsysGetDescription(unumsys: ConstPtr, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumsysGetDescription(unumsys.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetName(unumsys: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUnumsysGetName(unumsys.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetRadix(unumsys: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumsysGetRadix(unumsys.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysIsAlgorithmic(unumsys: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(unumsys.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpen(locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumsysOpen(locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenAvailableNames(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenByName(name: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUnumsysOpenByName(name.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesClose(uplrules: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUplrulesClose(uplrules.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uplrulesGetKeywords(uplrules: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUplrulesGetKeywords(uplrules.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpen(locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUplrulesOpen(locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUplrulesOpenForType(locale.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelect(uplrules: ConstPtr, number: Double, keyword: MutPtr, capacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUplrulesSelect(uplrules.rawAddress.toString(), number, keyword.rawAddress.toString(), capacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelectFormatted(uplrules: ConstPtr, number: ConstPtr, keyword: MutPtr, capacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUplrulesSelectFormatted(uplrules.rawAddress.toString(), number.rawAddress.toString(), keyword.rawAddress.toString(), capacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacement(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexAppendReplacement(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacementUtext(regexp: MutPtr, replacementtext: MutPtr, dest: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexAppendTail(regexp: MutPtr, destbuf: MutPtr, destcapacity: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexAppendTail(regexp.rawAddress.toString(), destbuf.rawAddress.toString(), destcapacity.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendTailUtext(regexp: MutPtr, dest: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexAppendTailUtext(regexp.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClone(regexp: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexClone(regexp.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClose(regexp: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexClose(regexp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexEnd(regexp: MutPtr, groupnum: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexEnd(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexEnd64(regexp: MutPtr, groupnum: Int, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexEnd64(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind(regexp: MutPtr, startindex: Int, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexFind(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexFind64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFindNext(regexp: MutPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexFindNext(regexp.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFlags(regexp: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexFlags(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetFindProgressCallback(regexp: ConstPtr, callback: MutPtr, context: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(regexp.rawAddress.toString(), callback.rawAddress.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetMatchCallback(regexp: ConstPtr, callback: MutPtr, context: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexGetMatchCallback(regexp.rawAddress.toString(), callback.rawAddress.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetStackLimit(regexp: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGetStackLimit(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetText(regexp: MutPtr, textlength: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexGetText(regexp.rawAddress.toString(), textlength.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetTimeLimit(regexp: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGetTimeLimit(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetUtext(regexp: MutPtr, dest: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexGetUtext(regexp.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroup(regexp: MutPtr, groupnum: Int, dest: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGroup(regexp.rawAddress.toString(), groupnum, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupCount(regexp: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGroupCount(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromCname(regexp: MutPtr, groupname: Pcstr, namelength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(regexp.rawAddress.toString(), groupname.rawAddress.toString(), namelength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromName(regexp: MutPtr, groupname: ConstPtr, namelength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexGroupNumberFromName(regexp.rawAddress.toString(), groupname.rawAddress.toString(), namelength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupUtext(regexp: MutPtr, groupnum: Int, dest: MutPtr, grouplength: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexGroupUtext(regexp.rawAddress.toString(), groupnum, dest.rawAddress.toString(), grouplength.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasAnchoringBounds(regexp: ConstPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(regexp.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasTransparentBounds(regexp: ConstPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexHasTransparentBounds(regexp.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHitEnd(regexp: ConstPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexHitEnd(regexp.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt(regexp: MutPtr, startindex: Int, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexLookingAt(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexLookingAt64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches(regexp: MutPtr, startindex: Int, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexMatches(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches64(regexp: MutPtr, startindex: Long, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexMatches64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpen(pattern: ConstPtr, patternlength: Int, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexOpen(pattern.rawAddress.toString(), patternlength, flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexOpenC(pattern.rawAddress.toString(), flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenUtext(pattern: MutPtr, flags: UInt, pe: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexOpenUtext(pattern.rawAddress.toString(), flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPattern(regexp: ConstPtr, patlength: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexPattern(regexp.rawAddress.toString(), patlength.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPatternUtext(regexp: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexPatternUtext(regexp.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRefreshUtext(regexp: MutPtr, text: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexRefreshUtext(regexp.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexRegionEnd(regexp: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexRegionEnd(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionEnd64(regexp: ConstPtr, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexRegionEnd64(regexp.rawAddress.toString(), status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart(regexp: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexRegionStart(regexp.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart64(regexp: ConstPtr, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexRegionStart64(regexp.rawAddress.toString(), status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAll(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexReplaceAll(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAllUtext(regexp: MutPtr, replacement: MutPtr, dest: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexReplaceAllUtext(regexp.rawAddress.toString(), replacement.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirst(regexp: MutPtr, replacementtext: ConstPtr, replacementlength: Int, destbuf: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexReplaceFirst(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirstUtext(regexp: MutPtr, replacement: MutPtr, dest: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(regexp.rawAddress.toString(), replacement.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRequireEnd(regexp: ConstPtr, status: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexRequireEnd(regexp.rawAddress.toString(), status.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReset(regexp: MutPtr, index: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexReset(regexp.rawAddress.toString(), index, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexReset64(regexp: MutPtr, index: Long, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexReset64(regexp.rawAddress.toString(), index.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetFindProgressCallback(regexp: MutPtr, callback: URegexFindProgressCallback, context: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(regexp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetMatchCallback(regexp: MutPtr, callback: URegexMatchCallback, context: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetMatchCallback(regexp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion(regexp: MutPtr, regionstart: Int, regionlimit: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetRegion(regexp.rawAddress.toString(), regionstart, regionlimit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion64(regexp: MutPtr, regionstart: Long, regionlimit: Long, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetRegion64(regexp.rawAddress.toString(), regionstart.toString(), regionlimit.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegionAndStart(regexp: MutPtr, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetRegionAndStart(regexp.rawAddress.toString(), regionstart.toString(), regionlimit.toString(), startindex.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetStackLimit(regexp: MutPtr, limit: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetStackLimit(regexp.rawAddress.toString(), limit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetText(regexp: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetText(regexp.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetTimeLimit(regexp: MutPtr, limit: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetTimeLimit(regexp.rawAddress.toString(), limit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetUtext(regexp: MutPtr, text: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexSetUtext(regexp.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSplit(regexp: MutPtr, destbuf: MutPtr, destcapacity: Int, requiredcapacity: MutPtr, destfields: MutPtr, destfieldscapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexSplit(regexp.rawAddress.toString(), destbuf.rawAddress.toString(), destcapacity, requiredcapacity.rawAddress.toString(), destfields.rawAddress.toString(), destfieldscapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexSplitUtext(regexp: MutPtr, destfields: MutPtr, destfieldscapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexSplitUtext(regexp.rawAddress.toString(), destfields.rawAddress.toString(), destfieldscapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart(regexp: MutPtr, groupnum: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexStart(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart64(regexp: MutPtr, groupnum: Int, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregexStart64(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexUseAnchoringBounds(regexp: MutPtr, b: Byte, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(regexp.rawAddress.toString(), b.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexUseTransparentBounds(regexp: MutPtr, b: Byte, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUregexUseTransparentBounds(regexp.rawAddress.toString(), b.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregionAreEqual(uregion: ConstPtr, otherregion: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregionAreEqual(uregion.rawAddress.toString(), otherregion.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionContains(uregion: ConstPtr, otherregion: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregionContains(uregion.rawAddress.toString(), otherregion.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetAvailable(type: URegionType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetAvailable(type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegions(uregion: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetContainedRegions(uregion.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegionsOfType(uregion: ConstPtr, type: URegionType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(uregion.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegion(uregion: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetContainingRegion(uregion.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegionOfType(uregion: ConstPtr, type: URegionType): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(uregion.rawAddress.toString(), type).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetNumericCode(uregion: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregionGetNumericCode(uregion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetPreferredValues(uregion: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetPreferredValues(uregion.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionCode(uregion: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetRegionCode(uregion.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetRegionFromCode(regioncode.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(code, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetType(uregion: ConstPtr): URegionType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUregionGetType(uregion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtClose(reldatefmt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUreldatefmtClose(reldatefmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCloseResult(ufrdt: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUreldatefmtCloseResult(ufrdt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr, relativedatestring: ConstPtr, relativedatestringlen: Int, timestring: ConstPtr, timestringlen: Int, result: MutPtr, resultcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(reldatefmt.rawAddress.toString(), relativedatestring.rawAddress.toString(), relativedatestringlen, timestring.rawAddress.toString(), timestringlen, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormat(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, resultcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormat(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, resultcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtFormatToResult(reldatefmt: ConstPtr, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUreldatefmtOpen(locale.rawAddress.toString(), nftoadopt.rawAddress.toString(), width, capitalizationcontext, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtOpenResult(ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUreldatefmtOpenResult(ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtResultAsValue(ufrdt: ConstPtr, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(ufrdt.rawAddress.toString(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresClose(resourcebundle: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUresClose(resourcebundle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresGetBinary(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetBinary(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByIndex(resourcebundle: ConstPtr, indexr: Int, fillin: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetByIndex(resourcebundle.rawAddress.toString(), indexr, fillin.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByKey(resourcebundle: ConstPtr, key: Pcstr, fillin: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetByKey(resourcebundle.rawAddress.toString(), key.rawAddress.toString(), fillin.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetInt(resourcebundle: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUresGetInt(resourcebundle.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetIntVector(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetIntVector(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetKey(resourcebundle: ConstPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUresGetKey(resourcebundle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetLocaleByType(resourcebundle: ConstPtr, type: ULocDataLocaleType, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUresGetLocaleByType(resourcebundle.rawAddress.toString(), type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextResource(resourcebundle: MutPtr, fillin: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetNextResource(resourcebundle.rawAddress.toString(), fillin.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextString(resourcebundle: MutPtr, len: MutPtr, key: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetNextString(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), key.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetSize(resourcebundle: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUresGetSize(resourcebundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetString(resourcebundle: ConstPtr, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetString(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByIndex(resourcebundle: ConstPtr, indexs: Int, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetStringByIndex(resourcebundle.rawAddress.toString(), indexs, len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByKey(resb: ConstPtr, key: Pcstr, len: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresGetStringByKey(resb.rawAddress.toString(), key.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetType(resourcebundle: ConstPtr): UResType =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUresGetType(resourcebundle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUint(resourcebundle: ConstPtr, status: MutPtr): UInt =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUresGetUint(resourcebundle.rawAddress.toString(), status.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8String(resb: ConstPtr, dest: Pcstr, length: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUresGetUtf8String(resb.rawAddress.toString(), dest.rawAddress.toString(), length.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByIndex(resb: ConstPtr, stringindex: Int, dest: Pcstr, plength: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(resb.rawAddress.toString(), stringindex, dest.rawAddress.toString(), plength.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByKey(resb: ConstPtr, key: Pcstr, dest: Pcstr, plength: MutPtr, forcecopy: Byte, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(resb.rawAddress.toString(), key.rawAddress.toString(), dest.rawAddress.toString(), plength.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetVersion(resb: ConstPtr, versioninfo: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUresGetVersion(resb.rawAddress.toString(), versioninfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresHasNext(resourcebundle: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUresHasNext(resourcebundle.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresOpen(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresOpenAvailableLocales(packagename.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresOpenDirect(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenU(packagename: ConstPtr, locale: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUresOpenU(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresResetIterator(resourcebundle: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUresResetIterator(resourcebundle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr, capacity: Int, err: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptGetCode(nameorabbrorlocale.rawAddress.toString(), fillin.rawAddress.toString(), capacity, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUscriptGetName(scriptcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr, capacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptGetSampleString(script, dest.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScript(codepoint: Int, err: MutPtr): UScriptCode =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptGetScript(codepoint, err.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr, capacity: Int, errorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(c, scripts.rawAddress.toString(), capacity, errorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUscriptGetShortName(scriptcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptGetUsage(script) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptHasScript(c, sc).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptIsCased(script).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchClose(searchiter: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchClose(searchiter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchFirst(strsrch: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchFirst(strsrch.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchFollowing(strsrch: MutPtr, position: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchFollowing(strsrch.rawAddress.toString(), position, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetAttribute(strsrch: ConstPtr, attribute: USearchAttribute): USearchAttributeValue =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchGetAttribute(strsrch.rawAddress.toString(), attribute) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetBreakIterator(strsrch: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchGetBreakIterator(strsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetCollator(strsrch: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchGetCollator(strsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedLength(strsrch: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedLength(strsrch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedStart(strsrch: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedStart(strsrch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedText(strsrch: ConstPtr, result: MutPtr, resultcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchGetMatchedText(strsrch.rawAddress.toString(), result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetOffset(strsrch: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchGetOffset(strsrch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetPattern(strsrch: ConstPtr, length: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchGetPattern(strsrch.rawAddress.toString(), length.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetText(strsrch: ConstPtr, length: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchGetText(strsrch.rawAddress.toString(), length.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchLast(strsrch: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchLast(strsrch.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchNext(strsrch: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchNext(strsrch.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpen(pattern: ConstPtr, patternlength: Int, text: ConstPtr, textlength: Int, locale: Pcstr, breakiter: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchOpen(pattern.rawAddress.toString(), patternlength, text.rawAddress.toString(), textlength, locale.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpenFromCollator(pattern: ConstPtr, patternlength: Int, text: ConstPtr, textlength: Int, collator: ConstPtr, breakiter: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsearchOpenFromCollator(pattern.rawAddress.toString(), patternlength, text.rawAddress.toString(), textlength, collator.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPreceding(strsrch: MutPtr, position: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchPreceding(strsrch.rawAddress.toString(), position, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPrevious(strsrch: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsearchPrevious(strsrch.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchReset(strsrch: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchReset(strsrch.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetAttribute(strsrch: MutPtr, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetAttribute(strsrch.rawAddress.toString(), attribute, value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetBreakIterator(strsrch: MutPtr, breakiter: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetBreakIterator(strsrch.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetCollator(strsrch: MutPtr, collator: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetCollator(strsrch.rawAddress.toString(), collator.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetOffset(strsrch: MutPtr, position: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetOffset(strsrch.rawAddress.toString(), position, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetPattern(strsrch: MutPtr, pattern: ConstPtr, patternlength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetPattern(strsrch.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetText(strsrch: MutPtr, text: ConstPtr, textlength: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsearchSetText(strsrch.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAdd(set: MutPtr, c: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetAdd(set.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAll(set: MutPtr, additionalset: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetAddAll(set.rawAddress.toString(), additionalset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAllCodePoints(set: MutPtr, str: ConstPtr, strlen: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetAddAllCodePoints(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddRange(set: MutPtr, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetAddRange(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddString(set: MutPtr, str: ConstPtr, strlen: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetAddString(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyIntPropertyValue(set: MutPtr, prop: UProperty, value: Int, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(set.rawAddress.toString(), prop, value, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyPattern(set: MutPtr, pattern: ConstPtr, patternlength: Int, options: UInt, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetApplyPattern(set.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, options.toInt(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetApplyPropertyAlias(set: MutPtr, prop: ConstPtr, proplength: Int, value: ConstPtr, valuelength: Int, ec: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(set.rawAddress.toString(), prop.rawAddress.toString(), proplength, value.rawAddress.toString(), valuelength, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCharAt(set: ConstPtr, charindex: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetCharAt(set.rawAddress.toString(), charindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClear(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetClear(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetClone(set: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetClone(set.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetCloneAsThawed(set: ConstPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetCloneAsThawed(set.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClose(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetClose(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCloseOver(set: MutPtr, attributes: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetCloseOver(set.rawAddress.toString(), attributes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCompact(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetCompact(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplement(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetComplement(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplementAll(set: MutPtr, complement: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetComplementAll(set.rawAddress.toString(), complement.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetContains(set: ConstPtr, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContains(set.rawAddress.toString(), c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAll(set1: ConstPtr, set2: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsAll(set1.rawAddress.toString(), set2.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAllCodePoints(set: ConstPtr, str: ConstPtr, strlen: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(set.rawAddress.toString(), str.rawAddress.toString(), strlen).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsNone(set1: ConstPtr, set2: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsNone(set1.rawAddress.toString(), set2.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsRange(set: ConstPtr, start: Int, end: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsRange(set.rawAddress.toString(), start, end).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsSome(set1: ConstPtr, set2: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsSome(set1.rawAddress.toString(), set2.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsString(set: ConstPtr, str: ConstPtr, strlen: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetContainsString(set.rawAddress.toString(), str.rawAddress.toString(), strlen).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetEquals(set1: ConstPtr, set2: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetEquals(set1.rawAddress.toString(), set2.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetFreeze(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetFreeze(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetGetItem(set: ConstPtr, itemindex: Int, start: MutPtr, end: MutPtr, str: MutPtr, strcapacity: Int, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetGetItem(set.rawAddress.toString(), itemindex, start.rawAddress.toString(), end.rawAddress.toString(), str.rawAddress.toString(), strcapacity, ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetItemCount(set: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetGetItemCount(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRange(set: ConstPtr, rangeindex: Int, pstart: MutPtr, pend: MutPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedRange(set.rawAddress.toString(), rangeindex, pstart.rawAddress.toString(), pend.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRangeCount(set: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedSet(fillset: MutPtr, src: ConstPtr, srclength: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetGetSerializedSet(fillset.rawAddress.toString(), src.rawAddress.toString(), srclength).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIndexOf(set: ConstPtr, c: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetIndexOf(set.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsEmpty(set: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetIsEmpty(set.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsFrozen(set: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetIsFrozen(set.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpen(start: Int, end: Int): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetOpen(start, end).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenEmpty(): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetOpenEmpty().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPattern(pattern: ConstPtr, patternlength: Int, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetOpenPattern(pattern.rawAddress.toString(), patternlength, ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPatternOptions(pattern: ConstPtr, patternlength: Int, options: UInt, ec: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsetOpenPatternOptions(pattern.rawAddress.toString(), patternlength, options.toInt(), ec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRemove(set: MutPtr, c: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRemove(set.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAll(set: MutPtr, removeset: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRemoveAll(set.rawAddress.toString(), removeset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAllStrings(set: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRemoveAllStrings(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveRange(set: MutPtr, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRemoveRange(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveString(set: MutPtr, str: ConstPtr, strlen: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRemoveString(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetResemblesPattern(pattern: ConstPtr, patternlength: Int, pos: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetResemblesPattern(pattern.rawAddress.toString(), patternlength, pos).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRetain(set: MutPtr, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRetain(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRetainAll(set: MutPtr, retain: ConstPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetRetainAll(set.rawAddress.toString(), retain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSerialize(set: ConstPtr, dest: MutPtr, destcapacity: Int, perrorcode: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSerialize(set.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSerializedContains(set: ConstPtr, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSerializedContains(set.rawAddress.toString(), c).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSet(set: MutPtr, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetSet(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSetSerializedToOne(fillset: MutPtr, c: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsetSetSerializedToOne(fillset.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSize(set: ConstPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSize(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpan(set: ConstPtr, s: ConstPtr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSpan(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBack(set: ConstPtr, s: ConstPtr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSpanBack(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBackUtf8(set: ConstPtr, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSpanBackUtf8(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanUtf8(set: ConstPtr, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetSpanUtf8(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetToPattern(set: ConstPtr, result: MutPtr, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsetToPattern(set.rawAddress.toString(), result.rawAddress.toString(), resultcapacity, escapeunprintable.toInt(), ec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusable(sc: ConstPtr, id1: ConstPtr, length1: Int, id2: ConstPtr, length2: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofAreConfusable(sc.rawAddress.toString(), id1.rawAddress.toString(), length1, id2.rawAddress.toString(), length2, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusableUtf8(sc: ConstPtr, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(sc.rawAddress.toString(), id1.rawAddress.toString(), length1, id2.rawAddress.toString(), length2, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck(sc: ConstPtr, id: ConstPtr, length: Int, position: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofCheck(sc.rawAddress.toString(), id.rawAddress.toString(), length, position.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2(sc: ConstPtr, id: ConstPtr, length: Int, checkresult: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofCheck2(sc.rawAddress.toString(), id.rawAddress.toString(), length, checkresult.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2Utf8(sc: ConstPtr, id: Pcstr, length: Int, checkresult: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofCheck2Utf8(sc.rawAddress.toString(), id.rawAddress.toString(), length, checkresult.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheckUtf8(sc: ConstPtr, id: Pcstr, length: Int, position: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofCheckUtf8(sc.rawAddress.toString(), id.rawAddress.toString(), length, position.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClone(sc: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofClone(sc.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClose(sc: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofClose(sc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofCloseCheckResult(checkresult: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofCloseCheckResult(checkresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofGetAllowedChars(sc: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofGetAllowedChars(sc.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetAllowedLocales(sc: MutPtr, status: MutPtr): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(sc.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultChecks(checkresult: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(checkresult.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultNumerics(checkresult: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(checkresult.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr, status: MutPtr): URestrictionLevel =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(checkresult.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetChecks(sc: ConstPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetChecks(sc.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetInclusionSet(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofGetInclusionSet(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRecommendedSet(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRestrictionLevel(sc: ConstPtr): URestrictionLevel =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(sc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeleton(sc: ConstPtr, type: UInt, id: ConstPtr, length: Int, dest: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetSkeleton(sc.rawAddress.toString(), type.toInt(), id.rawAddress.toString(), length, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeletonUtf8(sc: ConstPtr, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(sc.rawAddress.toString(), type.toInt(), id.rawAddress.toString(), length, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpen(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofOpen(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenCheckResult(status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofOpenCheckResult(status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSerialized(data: ConstPtr, length: Int, pactuallength: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(data.rawAddress.toString(), length, pactuallength.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr, pe: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUspoofOpenFromSource(confusables.rawAddress.toString(), confusableslen, confusableswholescript.rawAddress.toString(), confusableswholescriptlen, errtype.rawAddress.toString(), pe.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSerialize(sc: MutPtr, data: MutPtr, capacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUspoofSerialize(sc.rawAddress.toString(), data.rawAddress.toString(), capacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSetAllowedChars(sc: MutPtr, chars: ConstPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofSetAllowedChars(sc.rawAddress.toString(), chars.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetAllowedLocales(sc: MutPtr, localeslist: Pcstr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(sc.rawAddress.toString(), localeslist.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetChecks(sc: MutPtr, checks: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofSetChecks(sc.rawAddress.toString(), checks, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetRestrictionLevel(sc: MutPtr, restrictionlevel: URestrictionLevel) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(sc.rawAddress.toString(), restrictionlevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepClose(profile: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUsprepClose(profile.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsprepOpen(path.rawAddress.toString(), filename.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUsprepOpenByType(type, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepPrepare(prep: ConstPtr, src: ConstPtr, srclength: Int, dest: MutPtr, destcapacity: Int, options: Int, parseerror: MutPtr, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUsprepPrepare(prep.rawAddress.toString(), src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destcapacity, options, parseerror.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextChar32At(ut: MutPtr, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextChar32At(ut.rawAddress.toString(), nativeindex.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClone(dest: MutPtr, src: ConstPtr, deep: Byte, readonly: Byte, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtextClone(dest.rawAddress.toString(), src.rawAddress.toString(), deep.toInt(), readonly.toInt(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClose(ut: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtextClose(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextCopy(ut: MutPtr, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtextCopy(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), destindex.toString(), move.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextCurrent32(ut: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextCurrent32(ut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextEquals(a: ConstPtr, b: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextEquals(a.rawAddress.toString(), b.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextExtract(ut: MutPtr, nativestart: Long, nativelimit: Long, dest: MutPtr, destcapacity: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextExtract(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextFreeze(ut: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtextFreeze(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextGetNativeIndex(ut: ConstPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextGetNativeIndex(ut.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextGetPreviousNativeIndex(ut: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(ut.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextHasMetaData(ut: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextHasMetaData(ut.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsLengthExpensive(ut: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextIsLengthExpensive(ut.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsWritable(ut: ConstPtr): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextIsWritable(ut.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextMoveIndex32(ut: MutPtr, delta: Int): Byte =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextMoveIndex32(ut.rawAddress.toString(), delta).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNativeLength(ut: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextNativeLength(ut.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32(ut: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextNext32(ut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32From(ut: MutPtr, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextNext32From(ut.rawAddress.toString(), nativeindex.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUchars(ut: MutPtr, s: ConstPtr, length: Long, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtextOpenUchars(ut.rawAddress.toString(), s.rawAddress.toString(), length.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUtf8(ut: MutPtr, s: Pcstr, length: Long, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtextOpenUtf8(ut.rawAddress.toString(), s.rawAddress.toString(), length.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32(ut: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextPrevious32(ut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32From(ut: MutPtr, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextPrevious32From(ut.rawAddress.toString(), nativeindex.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextReplace(ut: MutPtr, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr, replacementlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtextReplace(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), replacementtext.rawAddress.toString(), replacementlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextSetNativeIndex(ut: MutPtr, nativeindex: Long) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtextSetNativeIndex(ut.rawAddress.toString(), nativeindex.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextSetup(ut: MutPtr, extraspace: Int, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtextSetup(ut.rawAddress.toString(), extraspace, status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8AppendCharSafeBody(s: MutPtr, i: Int, length: Int, c: Int, piserror: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(s.rawAddress.toString(), i, length, c, piserror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8Back1SafeBody(s: ConstPtr, start: Int, i: Int): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtf8Back1SafeBody(s.rawAddress.toString(), start, i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8NextCharSafeBody(s: ConstPtr, pi: MutPtr, length: Int, c: Int, strict: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(s.rawAddress.toString(), pi.rawAddress.toString(), length, c, strict.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8PrevCharSafeBody(s: ConstPtr, start: Int, pi: MutPtr, c: Int, strict: Byte): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(s.rawAddress.toString(), start, pi.rawAddress.toString(), c, strict.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtmscaleFromInt64(othertime.toString(), timescale, status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(timescale, value, status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr): Long =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtmscaleToInt64(universaltime.toString(), timescale, status.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtraceFormat(outbuf.rawAddress.toString(), capacity, indent, fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GlobalizationUtraceFunctionName(fnnumber).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceGetFunctions(context: ConstPtr, e: MutPtr, x: MutPtr, d: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtraceGetFunctions(context.rawAddress.toString(), e.rawAddress.toString(), x.rawAddress.toString(), d.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceGetLevel(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtraceGetLevel() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceSetFunctions(context: ConstPtr, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtraceSetFunctions(context.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceSetLevel(tracelevel: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtraceVformat(outbuf.rawAddress.toString(), capacity, indent, fmt.rawAddress.toString(), args.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClone(trans: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransClone(trans.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClose(trans: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransClose(trans.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransCountAvailableIds(): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtransCountAvailableIds() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetSourceSet(trans: ConstPtr, ignorefilter: Byte, fillin: MutPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransGetSourceSet(trans.rawAddress.toString(), ignorefilter.toInt(), fillin.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetUnicodeId(trans: ConstPtr, resultlength: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransGetUnicodeId(trans.rawAddress.toString(), resultlength.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenIds(perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransOpenIds(perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenInverse(trans: ConstPtr, status: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransOpenInverse(trans.rawAddress.toString(), status.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenU(id: ConstPtr, idlength: Int, dir: UTransDirection, rules: ConstPtr, ruleslength: Int, parseerror: MutPtr, perrorcode: MutPtr): MutPtr =
    if (windowsWin32GlobalizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GlobalizationUtransOpenU(id.rawAddress.toString(), idlength, dir, rules.rawAddress.toString(), ruleslength, parseerror.rawAddress.toString(), perrorcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransRegister(adoptedtrans: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransRegister(adoptedtrans.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransSetFilter(trans: MutPtr, filterpattern: ConstPtr, filterpatternlen: Int, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransSetFilter(trans.rawAddress.toString(), filterpattern.rawAddress.toString(), filterpatternlen, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransToRules(trans: ConstPtr, escapeunprintable: Byte, result: MutPtr, resultlength: Int, status: MutPtr): Int =
    if (windowsWin32GlobalizationNapiAvailable) wasmWindowssysWindowsWin32GlobalizationUtransToRules(trans.rawAddress.toString(), escapeunprintable.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransTrans(trans: ConstPtr, rep: MutPtr, repfunc: ConstPtr, start: Int, limit: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransTrans(trans.rawAddress.toString(), rep.rawAddress.toString(), repfunc.rawAddress.toString(), start, limit.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncremental(trans: ConstPtr, rep: MutPtr, repfunc: ConstPtr, pos: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransTransIncremental(trans.rawAddress.toString(), rep.rawAddress.toString(), repfunc.rawAddress.toString(), pos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncrementalUchars(trans: ConstPtr, text: MutPtr, textlength: MutPtr, textcapacity: Int, pos: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(trans.rawAddress.toString(), text.rawAddress.toString(), textlength.rawAddress.toString(), textcapacity, pos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransUchars(trans: ConstPtr, text: MutPtr, textlength: MutPtr, textcapacity: Int, start: Int, limit: MutPtr, status: MutPtr) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransTransUchars(trans.rawAddress.toString(), text.rawAddress.toString(), textlength.rawAddress.toString(), textcapacity, start, limit.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransUnregisterId(id: ConstPtr, idlength: Int) {
    if (windowsWin32GlobalizationNapiAvailable) {
        wasmWindowssysWindowsWin32GlobalizationUtransUnregisterId(id.rawAddress.toString(), idlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
