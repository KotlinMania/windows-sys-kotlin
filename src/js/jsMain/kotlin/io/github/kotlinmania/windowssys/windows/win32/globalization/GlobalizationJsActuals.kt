@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
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

private val _windowsWin32GlobalizationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun adjustCalendarDate(lpcaldatetime: COpaquePointer?, calunit: CaldatetimeDateunit, amount: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_adjustCalendarDate((lpcaldatetime?.value ?: 0L).toString(), calunit, amount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: COpaquePointer?, cchcount1: Int, lpstring2: COpaquePointer?, cchcount2: Int): ComparestringResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_compareStringA(locale.toInt(), dwcmpflags.toInt(), (lpstring1?.value ?: 0L).toString(), cchcount1, (lpstring2?.value ?: 0L).toString(), cchcount2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, lparam: Lparam): ComparestringResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_compareStringEx((lplocalename?.value ?: 0L).toString(), dwcmpflags.toInt(), (lpstring1?.value ?: 0L).toString(), cchcount1, (lpstring2?.value ?: 0L).toString(), cchcount2, (lpversioninformation?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_compareStringOrdinal((lpstring1?.value ?: 0L).toString(), cchcount1, (lpstring2?.value ?: 0L).toString(), cchcount2, bignorecase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_compareStringW(locale.toInt(), dwcmpflags.toInt(), (lpstring1?.value ?: 0L).toString(), cchcount1, (lpstring2?.value ?: 0L).toString(), cchcount2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: COpaquePointer?, lpsystime: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_convertCalDateTimeToSystemTime((lpcaldatetime?.value ?: 0L).toString(), (lpsystime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertDefaultLocale(locale: UInt): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_convertDefaultLocale(locale.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSystemTimeToCalDateTime(lpsystime: COpaquePointer?, calid: UInt, lpcaldatetime: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_convertSystemTimeToCalDateTime((lpsystime?.value ?: 0L).toString(), calid.toInt(), (lpcaldatetime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumCalendarInfoA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumCalendarInfoExA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumCalendarInfoExEx(0L.toString(), (lplocalename?.value ?: 0L).toString(), calendar.toInt(), (lpreserved?.value ?: 0L).toString(), caltype.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumCalendarInfoExW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumCalendarInfoW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumDateFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumDateFormatsExA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumDateFormatsExEx(0L.toString(), (lplocalename?.value ?: 0L).toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumDateFormatsExW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumDateFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumLanguageGroupLocalesA(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumLanguageGroupLocalesW(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemCodePagesA(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemCodePagesW(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemGeoID(geoclass.toInt(), parentgeoid, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemGeoNames(geoclass.toInt(), 0L.toString(), data.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemLanguageGroupsA(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemLanguageGroupsW(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemLocalesA(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemLocalesEx(0L.toString(), dwflags.toInt(), lparam.toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumSystemLocalesW(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumTimeFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumTimeFormatsEx(0L.toString(), (lplocalename?.value ?: 0L).toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumTimeFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumUILanguagesA(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_enumUILanguagesW(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_findNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), (lpstringsource?.value ?: 0L).toString(), cchsource, (lpstringvalue?.value ?: 0L).toString(), cchvalue, (pcchfound?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_findNLSStringEx((lplocalename?.value ?: 0L).toString(), dwfindnlsstringflags.toInt(), (lpstringsource?.value ?: 0L).toString(), cchsource, (lpstringvalue?.value ?: 0L).toString(), cchvalue, (pcchfound?.value ?: 0L).toString(), (lpversioninformation?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), sorthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_findStringOrdinal(dwfindstringordinalflags.toInt(), (lpstringsource?.value ?: 0L).toString(), cchsource, (lpstringvalue?.value ?: 0L).toString(), cchvalue, bignorecase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_foldStringA(dwmapflags.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_foldStringW(dwmapflags.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getACP(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getACP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfo(codepage: UInt, lpcpinfo: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCPInfo(codepage.toInt(), (lpcpinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCPInfoExA(codepage.toInt(), dwflags.toInt(), (lpcpinfoex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCPInfoExW(codepage.toInt(), dwflags.toInt(), (lpcpinfoex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCalendarDateFormatEx((lpszlocale?.value ?: 0L).toString(), dwflags.toInt(), (lpcaldatetime?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpdatestr?.value ?: 0L).toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L).toString(), cchdata, (lpvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCalendarInfoEx((lplocalename?.value ?: 0L).toString(), calendar.toInt(), (lpreserved?.value ?: 0L).toString(), caltype.toInt(), (lpcaldata?.value ?: 0L).toString(), cchdata, (lpvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L).toString(), cchdata, (lpvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: COpaquePointer?, lpcalmaxdatetime: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCalendarSupportedDateRange(calendar.toInt(), (lpcalmindatetime?.value ?: 0L).toString(), (lpcalmaxdatetime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCurrencyFormatA(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpcurrencystr?.value ?: 0L).toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCurrencyFormatEx((lplocalename?.value ?: 0L).toString(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpcurrencystr?.value ?: 0L).toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getCurrencyFormatW(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpcurrencystr?.value ?: 0L).toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDateFormatA(locale.toInt(), dwflags.toInt(), (lpdate?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpdatestr?.value ?: 0L).toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDateFormatEx((lplocalename?.value ?: 0L).toString(), dwflags.toInt(), (lpdate?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpdatestr?.value ?: 0L).toString(), cchdate, (lpcalendar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDateFormatW(locale.toInt(), dwflags.toInt(), (lpdate?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpdatestr?.value ?: 0L).toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDistanceOfClosestLanguageInList((pszlanguage?.value ?: 0L).toString(), (pszlanguageslist?.value ?: 0L).toString(), wchlistdelimiter.toInt(), (pclosestdistance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDurationFormat(locale.toInt(), dwflags.toInt(), (lpduration?.value ?: 0L).toString(), ullduration.toString(), (lpformat?.value ?: 0L).toString(), (lpdurationstr?.value ?: 0L).toString(), cchduration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getDurationFormatEx((lplocalename?.value ?: 0L).toString(), dwflags.toInt(), (lpduration?.value ?: 0L).toString(), ullduration.toString(), (lpformat?.value ?: 0L).toString(), (lpdurationstr?.value ?: 0L).toString(), cchduration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: COpaquePointer?, pcbfilemuiinfo: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getFileMUIInfo(dwflags.toInt(), (pcwszfilepath?.value ?: 0L).toString(), (pfilemuiinfo?.value ?: 0L).toString(), (pcbfilemuiinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: COpaquePointer?, pwszfilemuipath: Pwstr, pcchfilemuipath: COpaquePointer?, pululenumerator: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getFileMUIPath(dwflags.toInt(), (pcwszfilepath?.value ?: 0L).toString(), (pwszlanguage?.value ?: 0L).toString(), (pcchlanguage?.value ?: 0L).toString(), (pwszfilemuipath?.value ?: 0L).toString(), (pcchfilemuipath?.value ?: 0L).toString(), (pululenumerator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getGeoInfoA(location, geotype, (lpgeodata?.value ?: 0L).toString(), cchdata, langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getGeoInfoEx((location?.value ?: 0L).toString(), geotype, (geodata?.value ?: 0L).toString(), geodatacount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getGeoInfoW(location, geotype, (lpgeodata?.value ?: 0L).toString(), cchdata, langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getLocaleInfoA(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L).toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getLocaleInfoEx((lplocalename?.value ?: 0L).toString(), lctype.toInt(), (lplcdata?.value ?: 0L).toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getLocaleInfoW(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L).toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getNLSVersion(function.toInt(), locale.toInt(), (lpversioninformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getNLSVersionEx(function.toInt(), (lplocalename?.value ?: 0L).toString(), (lpversioninformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpnumberstr: Pstr, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getNumberFormatA(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpnumberstr?.value ?: 0L).toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getNumberFormatEx((lplocalename?.value ?: 0L).toString(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpnumberstr?.value ?: 0L).toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getNumberFormatW(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lpnumberstr?.value ?: 0L).toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOEMCP(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getOEMCP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getProcessPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L).toString(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pcchlanguagesbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getStringScripts(dwflags.toInt(), (lpstring?.value ?: 0L).toString(), cchstring, (lpscripts?.value ?: 0L).toString(), cchscripts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getStringTypeA(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpchartype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getStringTypeExA(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpchartype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getStringTypeExW(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpchartype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getStringTypeW(dwinfotype.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpchartype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLCID(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getSystemDefaultLCID() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLangID(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getSystemDefaultLangID() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getSystemDefaultLocaleName((lplocalename?.value ?: 0L).toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getSystemDefaultUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getSystemPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L).toString(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pcchlanguagesbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharset(hdc: Hdc): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getTextCharset((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: COpaquePointer?, dwflags: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getTextCharsetInfo((hdc?.value ?: 0L).toString(), (lpsig?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadLocale(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getThreadLocale() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getThreadPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L).toString(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pcchlanguagesbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getThreadUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getTimeFormatA(locale.toInt(), dwflags.toInt(), (lptime?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lptimestr?.value ?: 0L).toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getTimeFormatEx((lplocalename?.value ?: 0L).toString(), dwflags.toInt(), (lptime?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lptimestr?.value ?: 0L).toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getTimeFormatW(locale.toInt(), dwflags.toInt(), (lptime?.value ?: 0L).toString(), (lpformat?.value ?: 0L).toString(), (lptimestr?.value ?: 0L).toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUILanguageInfo(dwflags.toInt(), (pwmszlanguage?.value ?: 0L).toString(), (pwszfallbacklanguages?.value ?: 0L).toString(), (pcchfallbacklanguages?.value ?: 0L).toString(), (pattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserDefaultGeoName((geoname?.value ?: 0L).toString(), geonamecount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLCID(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserDefaultLCID() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLangID(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserDefaultLangID() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserDefaultLocaleName((lplocalename?.value ?: 0L).toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserDefaultUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserGeoID(geoclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_getUserPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L).toString(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pcchlanguagesbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_idnToAscii(dwflags.toInt(), (lpunicodecharstr?.value ?: 0L).toString(), cchunicodechar, (lpasciicharstr?.value ?: 0L).toString(), cchasciichar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_idnToNameprepUnicode(dwflags.toInt(), (lpunicodecharstr?.value ?: 0L).toString(), cchunicodechar, (lpnameprepcharstr?.value ?: 0L).toString(), cchnameprepchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_idnToUnicode(dwflags.toInt(), (lpasciicharstr?.value ?: 0L).toString(), cchasciichar, (lpunicodecharstr?.value ?: 0L).toString(), cchunicodechar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isDBCSLeadByte(testchar.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isDBCSLeadByteEx(codepage.toInt(), testchar.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: COpaquePointer?, lpstring: Pcwstr, cchstr: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isNLSDefinedString(function.toInt(), dwflags.toInt(), (lpversioninformation?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), cchstr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isNormalizedString(normform, (lpstring?.value ?: 0L).toString(), cwlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTextUnicode(lpv: COpaquePointer?, isize: Int, lpiresult: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isTextUnicode((lpv?.value ?: 0L).toString(), isize, (lpiresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidCodePage(codepage: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isValidCodePage(codepage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isValidLanguageGroup(languagegroup.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isValidLocale(locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isValidLocaleName((lplocalename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isValidNLSVersion(function.toInt(), (lplocalename?.value ?: 0L).toString(), (lpversioninformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_isWellFormedTag((psztag?.value ?: 0L).toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lCIDToLocaleName(locale.toInt(), (lpname?.value ?: 0L).toString(), cchname, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lCMapStringA(locale.toInt(), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lCMapStringEx((lplocalename?.value ?: 0L).toString(), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest, (lpversioninformation?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), sorthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lCMapStringW(locale.toInt(), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_localeNameToLCID((lpname?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingDoAction(pbag: COpaquePointer?, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_mappingDoAction((pbag?.value ?: 0L).toString(), dwrangeindex.toInt(), (pszactionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreePropertyBag(pbag: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_mappingFreePropertyBag((pbag?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreeServices(pserviceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_mappingFreeServices((pserviceinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingGetServices(poptions: COpaquePointer?, prgservices: COpaquePointer?, pdwservicescount: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_mappingGetServices((poptions?.value ?: 0L).toString(), (prgservices?.value ?: 0L).toString(), (pdwservicescount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingRecognizeText(pserviceinfo: COpaquePointer?, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: COpaquePointer?, pbag: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_mappingRecognizeText((pserviceinfo?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), dwlength.toInt(), dwindex.toInt(), (poptions?.value ?: 0L).toString(), (pbag?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_multiByteToWideChar(codepage.toInt(), dwflags.toInt(), (lpmultibytestr?.value ?: 0L).toString(), cbmultibyte, (lpwidecharstr?.value ?: 0L).toString(), cchwidechar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_normalizeString(normform, (lpsrcstring?.value ?: 0L).toString(), cwsrclength, (lpdststring?.value ?: 0L).toString(), cwdstlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_notifyUILanguageChange(dwflags.toInt(), (pcwstrnewlanguage?.value ?: 0L).toString(), (pcwstrpreviouslanguage?.value ?: 0L).toString(), dwreserved.toInt(), (pdwstatusrtrn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_resolveLocaleName((lpnametoresolve?.value ?: 0L).toString(), (lplocalename?.value ?: 0L).toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_restoreThreadPreferredUILanguages((snapshot?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scriptApplyDigitSubstitution(psds: COpaquePointer?, psc: COpaquePointer?, pss: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptApplyDigitSubstitution((psds?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (pss?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptApplyLogicalWidth(pidx: COpaquePointer?, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pabc: COpaquePointer?, pijustify: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptApplyLogicalWidth((pidx?.value ?: 0L).toString(), cchars, cglyphs, (pwlogclust?.value ?: 0L).toString(), (psva?.value ?: 0L).toString(), (piadvance?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), (pabc?.value ?: 0L).toString(), (pijustify?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: COpaquePointer?, psla: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptBreak((pwcchars?.value ?: 0L).toString(), cchars, (psa?.value ?: 0L).toString(), (psla?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pix: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptCPtoX(icp, ftrailing, cchars, cglyphs, (pwlogclust?.value ?: 0L).toString(), (psva?.value ?: 0L).toString(), (piadvance?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), (pix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: COpaquePointer?, tmheight: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptCacheGetHeight((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (tmheight?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptFreeCache(psc: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptFreeCache((psc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetCMap(hdc: Hdc, psc: COpaquePointer?, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetCMap((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (pwcinchars?.value ?: 0L).toString(), cchars, dwflags.toInt(), (pwoutglyphs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: COpaquePointer?, pcalternates: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetFontAlternateGlyphs((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toInt(), cmaxalternates, (palternateglyphs?.value ?: 0L).toString(), (pcalternates?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetFontFeatureTags((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), taglangsys.toInt(), cmaxtags, (pfeaturetags?.value ?: 0L).toString(), (pctags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, cmaxtags: Int, plangsystags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetFontLanguageTags((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), cmaxtags, (plangsystags?.value ?: 0L).toString(), (pctags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontProperties(hdc: Hdc, psc: COpaquePointer?, sfp: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetFontProperties((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (sfp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, cmaxtags: Int, pscripttags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetFontScriptTags((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), cmaxtags, (pscripttags?.value ?: 0L).toString(), (pctags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: COpaquePointer?, wglyph: UShort, pabc: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetGlyphABCWidth((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), wglyph.toInt(), (pabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetLogicalWidths(psa: COpaquePointer?, cchars: Int, cglyphs: Int, piglyphwidth: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetLogicalWidths((psa?.value ?: 0L).toString(), cchars, cglyphs, (piglyphwidth?.value ?: 0L).toString(), (pwlogclust?.value ?: 0L).toString(), (psva?.value ?: 0L).toString(), (pidx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetProperties(ppsp: COpaquePointer?, pinumscripts: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptGetProperties((ppsp?.value ?: 0L).toString(), (pinumscripts?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptIsComplex((pwcinchars?.value ?: 0L).toString(), cinchars, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptItemize((pwcinchars?.value ?: 0L).toString(), cinchars, cmaxitems, (pscontrol?.value ?: 0L).toString(), (psstate?.value ?: 0L).toString(), (pitems?.value ?: 0L).toString(), (pcitems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pscripttags: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptItemizeOpenType((pwcinchars?.value ?: 0L).toString(), cinchars, cmaxitems, (pscontrol?.value ?: 0L).toString(), (psstate?.value ?: 0L).toString(), (pitems?.value ?: 0L).toString(), (pscripttags?.value ?: 0L).toString(), (pcitems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptJustify(psva: COpaquePointer?, piadvance: COpaquePointer?, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptJustify((psva?.value ?: 0L).toString(), (piadvance?.value ?: 0L).toString(), cglyphs, idx, iminkashida, (pijustify?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptLayout(cruns: Int, pblevel: COpaquePointer?, pivisualtological: COpaquePointer?, pilogicaltovisual: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptLayout(cruns, (pblevel?.value ?: 0L).toString(), (pivisualtological?.value ?: 0L).toString(), (pilogicaltovisual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlace(hdc: Hdc, psc: COpaquePointer?, pwglyphs: COpaquePointer?, cglyphs: Int, psva: COpaquePointer?, psa: COpaquePointer?, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptPlace((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (pwglyphs?.value ?: 0L).toString(), cglyphs, (psva?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), (piadvance?.value ?: 0L).toString(), (pgoffset?.value ?: 0L).toString(), (pabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, cchars: Int, pwglyphs: COpaquePointer?, pglyphprops: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptPlaceOpenType((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), taglangsys.toInt(), (rcrangechars?.value ?: 0L).toString(), (rprangeproperties?.value ?: 0L).toString(), cranges, (pwcchars?.value ?: 0L).toString(), (pwlogclust?.value ?: 0L).toString(), (pcharprops?.value ?: 0L).toString(), cchars, (pwglyphs?.value ?: 0L).toString(), (pglyphprops?.value ?: 0L).toString(), cglyphs, (piadvance?.value ?: 0L).toString(), (pgoffset?.value ?: 0L).toString(), (pabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: COpaquePointer?, poutgoffset: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptRecordDigitSubstitution(locale.toInt(), (psds?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShape(hdc: Hdc, psc: COpaquePointer?, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: COpaquePointer?, pwoutglyphs: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptShape((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (pwcchars?.value ?: 0L).toString(), cchars, cmaxglyphs, (psa?.value ?: 0L).toString(), (pwoutglyphs?.value ?: 0L).toString(), (pwlogclust?.value ?: 0L).toString(), (psva?.value ?: 0L).toString(), (pcglyphs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShapeOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, pwoutglyphs: COpaquePointer?, poutglyphprops: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptShapeOpenType((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), taglangsys.toInt(), (rcrangechars?.value ?: 0L).toString(), (rprangeproperties?.value ?: 0L).toString(), cranges, (pwcchars?.value ?: 0L).toString(), cchars, cmaxglyphs, (pwlogclust?.value ?: 0L).toString(), (pcharprops?.value ?: 0L).toString(), (pwoutglyphs?.value ?: 0L).toString(), (poutglyphprops?.value ?: 0L).toString(), (pcglyphs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: COpaquePointer?, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pidx: COpaquePointer?, ptabdef: COpaquePointer?, pbinclass: COpaquePointer?, pssa: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringAnalyse((hdc?.value ?: 0L).toString(), (pstring?.value ?: 0L).toString(), cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, (pscontrol?.value ?: 0L).toString(), (psstate?.value ?: 0L).toString(), (pidx?.value ?: 0L).toString(), (ptabdef?.value ?: 0L).toString(), (pbinclass?.value ?: 0L).toString(), (pssa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringCPtoX(ssa: COpaquePointer?, icp: Int, ftrailing: Bool, px: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringCPtoX((ssa?.value ?: 0L).toString(), icp, ftrailing, (px?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringFree(pssa: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringFree((pssa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetLogicalWidths(ssa: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringGetLogicalWidths((ssa?.value ?: 0L).toString(), (pidx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetOrder(ssa: COpaquePointer?, puorder: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringGetOrder((ssa?.value ?: 0L).toString(), (puorder?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringOut(ssa: COpaquePointer?, ix: Int, iy: Int, uoptions: EtoOptions, prc: COpaquePointer?, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringOut((ssa?.value ?: 0L).toString(), ix, iy, uoptions.toInt(), (prc?.value ?: 0L).toString(), iminsel, imaxsel, fdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringValidate(ssa: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringValidate((ssa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringXtoCP(ssa: COpaquePointer?, ix: Int, pich: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringXtoCP((ssa?.value ?: 0L).toString(), ix, (pich?.value ?: 0L).toString(), (pitrailing?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPLogAttr(ssa: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringPLogAttr((ssa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPSize(ssa: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringPSize((ssa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPcOutChars(ssa: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptStringPcOutChars((ssa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptSubstituteSingleGlyph((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toInt(), (pwoutglyphid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptTextOut(hdc: Hdc, psc: COpaquePointer?, x: Int, y: Int, fuoptions: UInt, lprc: COpaquePointer?, psa: COpaquePointer?, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pijustify: COpaquePointer?, pgoffset: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptTextOut((hdc?.value ?: 0L).toString(), (psc?.value ?: 0L).toString(), x, y, fuoptions.toInt(), (lprc?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), (pwcreserved?.value ?: 0L).toString(), ireserved, (pwglyphs?.value ?: 0L).toString(), cglyphs, (piadvance?.value ?: 0L).toString(), (pijustify?.value ?: 0L).toString(), (pgoffset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, picp: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_scriptXtoCP(ix, cchars, cglyphs, (pwlogclust?.value ?: 0L).toString(), (psva?.value ?: 0L).toString(), (piadvance?.value ?: 0L).toString(), (psa?.value ?: 0L).toString(), (picp?.value ?: 0L).toString(), (pitrailing?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setLocaleInfoA(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setLocaleInfoW(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setProcessPreferredUILanguages(dwflags.toInt(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pulnumlanguages?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadLocale(locale: UInt): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setThreadLocale(locale.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setThreadPreferredUILanguages(dwflags.toInt(), (pwszlanguagesbuffer?.value ?: 0L).toString(), (pulnumlanguages?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: COpaquePointer?, snapshot: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setThreadPreferredUILanguages2(flags.toInt(), (languages?.value ?: 0L).toString(), (numlanguagesset?.value ?: 0L).toString(), (snapshot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadUILanguage(langid: UShort): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setThreadUILanguage(langid.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoID(geoid: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setUserGeoID(geoid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_setUserGeoName((geoname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateCharsetInfo(lpsrc: COpaquePointer?, lpcs: COpaquePointer?, dwflags: TranslateCharsetInfoFlags): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_translateCharsetInfo((lpsrc?.value ?: 0L).toString(), (lpcs?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUCallbackEscape(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUCallbackEscape((context?.value ?: 0L).toString(), (fromuargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, codepoint, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSkip(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUCallbackSkip((context?.value ?: 0L).toString(), (fromuargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, codepoint, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackStop(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUCallbackStop((context?.value ?: 0L).toString(), (fromuargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, codepoint, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSubstitute(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUCallbackSubstitute((context?.value ?: 0L).toString(), (fromuargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, codepoint, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackEscape(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUCallbackEscape((context?.value ?: 0L).toString(), (touargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSkip(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUCallbackSkip((context?.value ?: 0L).toString(), (touargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackStop(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUCallbackStop((context?.value ?: 0L).toString(), (touargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSubstitute(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUCallbackSubstitute((context?.value ?: 0L).toString(), (touargs?.value ?: 0L).toString(), (codeunits?.value ?: 0L).toString(), length, reason, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: COpaquePointer?): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_updateCalendarDayOfWeek((lpcaldatetime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_verifyScripts(dwflags.toInt(), (lplocalescripts?.value ?: 0L).toString(), cchlocalescripts, (lptestscripts?.value ?: 0L).toString(), cchtestscripts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_wideCharToMultiByte(codepage.toInt(), dwflags.toInt(), (lpwidecharstr?.value ?: 0L).toString(), cchwidechar, (lpmultibytestr?.value ?: 0L).toString(), cbmultibyte, (lpdefaultchar?.value ?: 0L).toString(), (lpuseddefaultchar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcatA((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcatW((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpA((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpW((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpiA((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpiW((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpyA((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpyW((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpynA((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString(), imaxlength) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpynW((lpstring1?.value ?: 0L).toString(), (lpstring2?.value ?: 0L).toString(), imaxlength) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenA(lpstring: Pcstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrlenA((lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrlenW((lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUcharsToChars(us: COpaquePointer?, cs: Pcstr, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uUcharsToChars((us?.value ?: 0L).toString(), (cs?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uAustrcpy(dst: Pcstr, src: COpaquePointer?): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uAustrcpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uAustrncpy(dst: Pcstr, src: COpaquePointer?, n: Int): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uAustrncpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatclose(catd: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCatclose((catd?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCatgets(catd: COpaquePointer?, setNum: Int, msgNum: Int, s: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCatgets((catd?.value ?: 0L).toString(), setNum, msgNum, (s?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCatopen((name?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharAge(c: Int, versionarray: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharAge(c, (versionarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCharDigitValue(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharDigitValue(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharDirection(c: Int): UCharDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharDirection(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharFromName(namechoice, (name?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharMirror(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharMirror(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharName(code, namechoice, (buffer?.value ?: 0L).toString(), bufferlength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharType(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharType(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharsToUchars(cs: Pcstr, us: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCharsToUchars((cs?.value ?: 0L).toString(), (us?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCleanup() {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCountChar32(s: COpaquePointer?, length: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uCountChar32((s?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uDigit(ch: Int, radix: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uDigit(ch, radix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uEnumCharNames(start: Int, limit: Int, fn: COpaquePointer?, context: COpaquePointer?, namechoice: UCharNameChoice, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uEnumCharNames(start, limit, (fn?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), namechoice, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uEnumCharTypes(enumrange: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uEnumCharTypes((enumrange?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uErrorName(code) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFoldCase(c: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uFoldCase(c, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uForDigit(digit, radix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uFormatMessage((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uFormatMessageWithError((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (result?.value ?: 0L).toString(), resultlength, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBidiPairedBracket(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetBidiPairedBracket(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetBinaryPropertySet(property, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetCombiningClass(c: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetCombiningClass(c) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetDataVersion(dataversionfillin: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetDataVersion((dataversionfillin?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetFcNfkcClosure(c: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetFcNfkcClosure(c, (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetIntPropertyMap(property, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetIntPropertyMaxValue(which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetIntPropertyMinValue(which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetIntPropertyValue(c, which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetNumericValue(c: Int): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetNumericValue(c) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetPropertyEnum((alias?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetPropertyName(property, namechoice) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetPropertyValueEnum(property, (alias?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetPropertyValueName(property, value, namechoice) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetUnicodeVersion(versionarray: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetUnicodeVersion((versionarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetVersion(versionarray: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uGetVersion((versionarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uHasBinaryProperty(c, which) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uInit(status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uInit((status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uIsIdignorable(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsIdignorable(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdpart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsIdpart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdstart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsIdstart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIsocontrol(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsIsocontrol(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdpart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsJavaIdpart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdstart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsJavaIdstart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsJavaSpaceChar(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsMirrored(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsMirrored(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUalphabetic(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsUalphabetic(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUlowercase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsUlowercase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUuppercase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsUuppercase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUwhiteSpace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsUwhiteSpace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsWhitespace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsWhitespace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalnum(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsalnum(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalpha(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsalpha(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsbase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsbase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsblank(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsblank(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIscntrl(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIscntrl(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdefined(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsdefined(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdigit(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsdigit(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsgraph(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsgraph(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIslower(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIslower(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsprint(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsprint(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIspunct(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIspunct(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsspace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsspace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIstitle(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIstitle(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsupper(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsupper(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsxdigit(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uIsxdigit(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, length: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemcasecmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), length, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemchr((s?.value ?: 0L).toString(), c.toInt(), count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemchr32((s?.value ?: 0L).toString(), c, count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmp(buf1: COpaquePointer?, buf2: COpaquePointer?, count: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemcmp((buf1?.value ?: 0L).toString(), (buf2?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, count: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemcmpCodePointOrder((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcpy(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemmove(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemrchr((s?.value ?: 0L).toString(), c.toInt(), count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemrchr32((s?.value ?: 0L).toString(), c, count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemset(dest: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uMemset((dest?.value ?: 0L).toString(), c.toInt(), count) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uParseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, status: COpaquePointer?, vararg variadicArgs: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uParseMessage((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (source?.value ?: 0L).toString(), sourcelength, (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uParseMessageWithError((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (source?.value ?: 0L).toString(), sourcelength, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uSetMemoryFunctions(context: COpaquePointer?, a: COpaquePointer?, r: COpaquePointer?, f: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uSetMemoryFunctions((context?.value ?: 0L).toString(), (a?.value ?: 0L).toString(), (r?.value ?: 0L).toString(), (f?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uShapeArabic(source: COpaquePointer?, sourcelength: Int, dest: COpaquePointer?, destsize: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uShapeArabic((source?.value ?: 0L).toString(), sourcelength, (dest?.value ?: 0L).toString(), destsize, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCaseCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrCaseCompare((s1?.value ?: 0L).toString(), length1, (s2?.value ?: 0L).toString(), length2, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, codepointorder: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrCompare((s1?.value ?: 0L).toString(), length1, (s2?.value ?: 0L).toString(), length2, codepointorder.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompareIter(iter1: COpaquePointer?, iter2: COpaquePointer?, codepointorder: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrCompareIter((iter1?.value ?: 0L).toString(), (iter2?.value ?: 0L).toString(), codepointorder.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindFirst(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFindFirst((s?.value ?: 0L).toString(), length, (substring?.value ?: 0L).toString(), sublength) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindLast(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFindLast((s?.value ?: 0L).toString(), length, (substring?.value ?: 0L).toString(), sublength) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFoldCase(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFoldCase((dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromJavaModifiedUtf8WithSub((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, subchar, (pnumsubstitutions?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromUtf32((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromUtf32WithSub((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, subchar, (pnumsubstitutions?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromUtf8((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8Lenient(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromUtf8Lenient((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromUtf8WithSub((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, subchar, (pnumsubstitutions?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromWcs(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcwstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrFromWcs((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrHasMoreChar32Than(s: COpaquePointer?, length: Int, number: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrHasMoreChar32Than((s?.value ?: 0L).toString(), length, number) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToJavaModifiedUtf8((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToLower(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToLower((dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (locale?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToTitle(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, titleiter: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToTitle((dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (titleiter?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToUtf32((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToUtf32WithSub((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, subchar, (pnumsubstitutions?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToUtf8((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): Pstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToUtf8WithSub((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, subchar, (pnumsubstitutions?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUpper(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToUpper((dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (locale?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pwstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrToWcs((dest?.value ?: 0L).toString(), destcapacity, (pdestlength?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcasecmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcat(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcat((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrchr((s?.value ?: 0L).toString(), c.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrchr32((s?.value ?: 0L).toString(), c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmp(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcmpCodePointOrder((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcpy(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrcspn((string?.value ?: 0L).toString(), (matchset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrlen(s: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrlen((s?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncasecmp(s1: COpaquePointer?, s2: COpaquePointer?, n: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrncasecmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), n, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncat(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrncat((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmp(ucs1: COpaquePointer?, ucs2: COpaquePointer?, n: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrncmp((ucs1?.value ?: 0L).toString(), (ucs2?.value ?: 0L).toString(), n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, n: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrncmpCodePointOrder((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncpy(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrncpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrpbrk(string: COpaquePointer?, matchset: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrpbrk((string?.value ?: 0L).toString(), (matchset?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrrchr((s?.value ?: 0L).toString(), c.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrrchr32((s?.value ?: 0L).toString(), c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrrstr((s?.value ?: 0L).toString(), (substring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrspn((string?.value ?: 0L).toString(), (matchset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrstr((s?.value ?: 0L).toString(), (substring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrtokR(src: COpaquePointer?, delim: COpaquePointer?, savestate: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uStrtokR((src?.value ?: 0L).toString(), (delim?.value ?: 0L).toString(), (savestate?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTolower(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTotitle(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uTotitle(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uToupper(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrcpy(dst: COpaquePointer?, src: Pcstr): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uUastrcpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrncpy(dst: COpaquePointer?, src: Pcstr, n: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uUastrncpy((dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescape(src: Pcstr, dest: COpaquePointer?, destcapacity: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uUnescape((src?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: COpaquePointer?, length: Int, context: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uUnescapeAt(0L.toString(), (offset?.value ?: 0L).toString(), length, (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVersionFromString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVersionFromString((versionarray?.value ?: 0L).toString(), (versionstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionFromUstring(versionarray: COpaquePointer?, versionstring: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVersionFromUstring((versionarray?.value ?: 0L).toString(), (versionstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionToString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVersionToString((versionarray?.value ?: 0L).toString(), (versionstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVformatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVformatMessage((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (result?.value ?: 0L).toString(), resultlength, (ap?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVformatMessageWithError((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (result?.value ?: 0L).toString(), resultlength, (parseerror?.value ?: 0L).toString(), (ap?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVparseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVparseMessage((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (source?.value ?: 0L).toString(), sourcelength, (ap?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, parseerror: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uVparseMessageWithError((locale?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (source?.value ?: 0L).toString(), sourcelength, (ap?.value ?: 0L).toString(), (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiClose(pbidi: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiClose((pbidi?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiCountParagraphs(pbidi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiCountParagraphs((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiCountRuns(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiCountRuns((pbidi?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetBaseDirection(text: COpaquePointer?, length: Int): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetBaseDirection((text?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetClassCallback(pbidi: COpaquePointer?, fn: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetClassCallback((pbidi?.value ?: 0L).toString(), (fn?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetCustomizedClass(pbidi: COpaquePointer?, c: Int): UCharDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetCustomizedClass((pbidi?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetDirection(pbidi: COpaquePointer?): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetDirection((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLength(pbidi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLength((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevelAt(pbidi: COpaquePointer?, charindex: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLevelAt((pbidi?.value ?: 0L).toString(), charindex) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevels(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLevels((pbidi?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalIndex(pbidi: COpaquePointer?, visualindex: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLogicalIndex((pbidi?.value ?: 0L).toString(), visualindex, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLogicalMap((pbidi?.value ?: 0L).toString(), (indexmap?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetLogicalRun(pbidi: COpaquePointer?, logicalposition: Int, plogicallimit: COpaquePointer?, plevel: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetLogicalRun((pbidi?.value ?: 0L).toString(), logicalposition, (plogicallimit?.value ?: 0L).toString(), (plevel?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetParaLevel(pbidi: COpaquePointer?): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetParaLevel((pbidi?.value ?: 0L).toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraph(pbidi: COpaquePointer?, charindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetParagraph((pbidi?.value ?: 0L).toString(), charindex, (pparastart?.value ?: 0L).toString(), (pparalimit?.value ?: 0L).toString(), (pparalevel?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraphByIndex(pbidi: COpaquePointer?, paraindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetParagraphByIndex((pbidi?.value ?: 0L).toString(), paraindex, (pparastart?.value ?: 0L).toString(), (pparalimit?.value ?: 0L).toString(), (pparalevel?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetProcessedLength(pbidi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetProcessedLength((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingMode(pbidi: COpaquePointer?): UBiDiReorderingMode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetReorderingMode((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingOptions(pbidi: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetReorderingOptions((pbidi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetResultLength(pbidi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetResultLength((pbidi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetText(pbidi: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetText((pbidi?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualIndex(pbidi: COpaquePointer?, logicalindex: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetVisualIndex((pbidi?.value ?: 0L).toString(), logicalindex, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetVisualMap((pbidi?.value ?: 0L).toString(), (indexmap?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetVisualRun(pbidi: COpaquePointer?, runindex: Int, plogicalstart: COpaquePointer?, plength: COpaquePointer?): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiGetVisualRun((pbidi?.value ?: 0L).toString(), runindex, (plogicalstart?.value ?: 0L).toString(), (plength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiInvertMap(srcmap: COpaquePointer?, destmap: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiInvertMap((srcmap?.value ?: 0L).toString(), (destmap?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiIsInverse(pbidi: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiIsInverse((pbidi?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiIsOrderParagraphsLtr(pbidi: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiIsOrderParagraphsLtr((pbidi?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpen(): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiOpen() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiOpenSized(maxlength, maxruncount, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOrderParagraphsLtr(pbidi: COpaquePointer?, orderparagraphsltr: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiOrderParagraphsLtr((pbidi?.value ?: 0L).toString(), orderparagraphsltr.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderLogical(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiReorderLogical((levels?.value ?: 0L).toString(), length, (indexmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderVisual(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiReorderVisual((levels?.value ?: 0L).toString(), length, (indexmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetClassCallback(pbidi: COpaquePointer?, newfn: UBiDiClassCallback, newcontext: COpaquePointer?, oldfn: COpaquePointer?, oldcontext: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetClassCallback((pbidi?.value ?: 0L).toString(), 0L.toString(), (newcontext?.value ?: 0L).toString(), (oldfn?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetContext(pbidi: COpaquePointer?, prologue: COpaquePointer?, prolength: Int, epilogue: COpaquePointer?, epilength: Int, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetContext((pbidi?.value ?: 0L).toString(), (prologue?.value ?: 0L).toString(), prolength, (epilogue?.value ?: 0L).toString(), epilength, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetInverse(pbidi: COpaquePointer?, isinverse: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetInverse((pbidi?.value ?: 0L).toString(), isinverse.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetLine(pparabidi: COpaquePointer?, start: Int, limit: Int, plinebidi: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetLine((pparabidi?.value ?: 0L).toString(), start, limit, (plinebidi?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetPara(pbidi: COpaquePointer?, text: COpaquePointer?, length: Int, paralevel: UByte, embeddinglevels: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetPara((pbidi?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), length, paralevel.toInt(), (embeddinglevels?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingMode(pbidi: COpaquePointer?, reorderingmode: UBiDiReorderingMode) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetReorderingMode((pbidi?.value ?: 0L).toString(), reorderingmode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingOptions(pbidi: COpaquePointer?, reorderingoptions: UInt) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiSetReorderingOptions((pbidi?.value ?: 0L).toString(), reorderingoptions.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiWriteReordered(pbidi: COpaquePointer?, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiWriteReordered((pbidi?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destsize, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiWriteReverse(src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidiWriteReverse((src?.value ?: 0L).toString(), srclength, (dest?.value ?: 0L).toString(), destsize, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformClose(pbiditransform: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransformClose((pbiditransform?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubiditransformOpen(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransformOpen((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformTransform(pbiditransform: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransformTransform((pbiditransform?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (dest?.value ?: 0L).toString(), destsize, inparalevel.toInt(), inorder, outparalevel.toInt(), outorder, domirroring, shapingoptions.toInt(), (perrorcode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ublockGetCode(c: Int): UBlockCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ublockGetCode(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkClose(bi: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkClose((bi?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkCurrent(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkCurrent((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFirst(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkFirst((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFollowing(bi: COpaquePointer?, offset: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkFollowing((bi?.value ?: 0L).toString(), offset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkGetAvailable(index) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetBinaryRules(bi: COpaquePointer?, binaryrules: COpaquePointer?, rulescapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkGetBinaryRules((bi?.value ?: 0L).toString(), (binaryrules?.value ?: 0L).toString(), rulescapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetLocaleByType(bi: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkGetLocaleByType((bi?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatus(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkGetRuleStatus((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatusVec(bi: COpaquePointer?, fillinvec: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkGetRuleStatusVec((bi?.value ?: 0L).toString(), (fillinvec?.value ?: 0L).toString(), capacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkIsBoundary(bi: COpaquePointer?, offset: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkIsBoundary((bi?.value ?: 0L).toString(), offset) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkLast(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkLast((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkNext(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkNext((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkOpen(type, (locale?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenBinaryRules(binaryrules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkOpenBinaryRules((binaryrules?.value ?: 0L).toString(), ruleslength, (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenRules(rules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkOpenRules((rules?.value ?: 0L).toString(), ruleslength, (text?.value ?: 0L).toString(), textlength, (parseerr?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPreceding(bi: COpaquePointer?, offset: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkPreceding((bi?.value ?: 0L).toString(), offset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPrevious(bi: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkPrevious((bi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkRefreshUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkRefreshUtext((bi?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSafeClone(bi: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkSafeClone((bi?.value ?: 0L).toString(), (stackbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkSetText(bi: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkSetText((bi?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSetUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrkSetUtext((bi?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalAdd(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalAdd((cal?.value ?: 0L).toString(), field, amount, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClear(calendar: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalClear((calendar?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClearField(cal: COpaquePointer?, field: UCalendarDateFields) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalClearField((cal?.value ?: 0L).toString(), field)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClone(cal: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalClone((cal?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalClose(cal: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalClose((cal?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalEquivalentTo(cal1: COpaquePointer?, cal2: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalEquivalentTo((cal1?.value ?: 0L).toString(), (cal2?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGet(cal: COpaquePointer?, field: UCalendarDateFields, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGet((cal?.value ?: 0L).toString(), field, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetAttribute((cal?.value ?: 0L).toString(), attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetAvailable(localeindex) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetCanonicalTimeZoneId(id: COpaquePointer?, len: Int, result: COpaquePointer?, resultcapacity: Int, issystemid: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetCanonicalTimeZoneId((id?.value ?: 0L).toString(), len, (result?.value ?: 0L).toString(), resultcapacity, (issystemid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDstsavings(zoneid: COpaquePointer?, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetDstsavings((zoneid?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDayOfWeekType(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): UCalendarWeekdayType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetDayOfWeekType((cal?.value ?: 0L).toString(), dayofweek, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDefaultTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetDefaultTimeZone((result?.value ?: 0L).toString(), resultcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetFieldDifference(cal: COpaquePointer?, target: Double, field: UCalendarDateFields, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetFieldDifference((cal?.value ?: 0L).toString(), target, field, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetGregorianChange(cal: COpaquePointer?, perrorcode: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetGregorianChange((cal?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetHostTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetHostTimeZone((result?.value ?: 0L).toString(), resultcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetKeywordValuesForLocale((key?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), commonlyused.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLimit(cal: COpaquePointer?, field: UCalendarDateFields, type: UCalendarLimitType, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetLimit((cal?.value ?: 0L).toString(), field, type, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLocaleByType(cal: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetLocaleByType((cal?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetMillis(cal: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetMillis((cal?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetNow(): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetNow() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTzdataVersion(status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetTzdataVersion((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneDisplayName(cal: COpaquePointer?, type: UCalendarDisplayNameType, locale: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetTimeZoneDisplayName((cal?.value ?: 0L).toString(), type, (locale?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneId(cal: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetTimeZoneId((cal?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneIdforWindowsId(winid: COpaquePointer?, len: Int, region: Pcstr, id: COpaquePointer?, idcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetTimeZoneIdforWindowsId((winid?.value ?: 0L).toString(), len, (region?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), idcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneTransitionDate(cal: COpaquePointer?, type: UTimeZoneTransitionType, transition: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetTimeZoneTransitionDate((cal?.value ?: 0L).toString(), type, (transition?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetType(cal: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetType((cal?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWeekendTransition(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetWeekendTransition((cal?.value ?: 0L).toString(), dayofweek, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWindowsTimeZoneId(id: COpaquePointer?, len: Int, winid: COpaquePointer?, winidcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalGetWindowsTimeZoneId((id?.value ?: 0L).toString(), len, (winid?.value ?: 0L).toString(), winidcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalInDaylightTime(cal: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalInDaylightTime((cal?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsSet(cal: COpaquePointer?, field: UCalendarDateFields): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalIsSet((cal?.value ?: 0L).toString(), field) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsWeekend(cal: COpaquePointer?, date: Double, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalIsWeekend((cal?.value ?: 0L).toString(), date, (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpen(zoneid: COpaquePointer?, len: Int, locale: Pcstr, type: UCalendarType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalOpen((zoneid?.value ?: 0L).toString(), len, (locale?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalOpenCountryTimeZones((country?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalOpenTimeZoneIdenumeration(zonetype, (region?.value ?: 0L).toString(), (rawoffset?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZones(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalOpenTimeZones((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalRoll(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalRoll((cal?.value ?: 0L).toString(), field, amount, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSet(cal: COpaquePointer?, field: UCalendarDateFields, value: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSet((cal?.value ?: 0L).toString(), field, value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute, newvalue: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetAttribute((cal?.value ?: 0L).toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDate(cal: COpaquePointer?, year: Int, month: Int, date: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetDate((cal?.value ?: 0L).toString(), year, month, date, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDateTime(cal: COpaquePointer?, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetDateTime((cal?.value ?: 0L).toString(), year, month, date, hour, minute, second, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDefaultTimeZone(zoneid: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetDefaultTimeZone((zoneid?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetGregorianChange(cal: COpaquePointer?, date: Double, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetGregorianChange((cal?.value ?: 0L).toString(), date, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetMillis(cal: COpaquePointer?, datetime: Double, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetMillis((cal?.value ?: 0L).toString(), datetime, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetTimeZone(cal: COpaquePointer?, zoneid: COpaquePointer?, len: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucalSetTimeZone((cal?.value ?: 0L).toString(), (zoneid?.value ?: 0L).toString(), len, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapClose(csm: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapClose((csm?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapGetBreakIterator(csm: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapGetBreakIterator((csm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetLocale(csm: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapGetLocale((csm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetOptions(csm: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapGetOptions((csm?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapOpen((locale?.value ?: 0L).toString(), options.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapSetBreakIterator(csm: COpaquePointer?, itertoadopt: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapSetBreakIterator((csm?.value ?: 0L).toString(), (itertoadopt?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetLocale(csm: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapSetLocale((csm?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetOptions(csm: COpaquePointer?, options: UInt, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapSetOptions((csm?.value ?: 0L).toString(), options.toInt(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapToTitle(csm: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapToTitle((csm?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8FoldCase(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapUtf8FoldCase((csm?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToLower(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapUtf8ToLower((csm?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToTitle(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapUtf8ToTitle((csm?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToUpper(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemapUtf8ToUpper((csm?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposClose(ucfpos: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposClose((ucfpos?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainCategory(ucfpos: COpaquePointer?, category: Int, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposConstrainCategory((ucfpos?.value ?: 0L).toString(), category, (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposConstrainField((ucfpos?.value ?: 0L).toString(), category, field, (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetCategory(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposGetCategory((ucfpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetField(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposGetField((ucfpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetIndexes(ucfpos: COpaquePointer?, pstart: COpaquePointer?, plimit: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposGetIndexes((ucfpos?.value ?: 0L).toString(), (pstart?.value ?: 0L).toString(), (plimit?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetInt64IterationContext(ucfpos: COpaquePointer?, ec: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposGetInt64IterationContext((ucfpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposMatchesField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposMatchesField((ucfpos?.value ?: 0L).toString(), category, field, (ec?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposOpen(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposOpen((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposReset(ucfpos: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposReset((ucfpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetInt64IterationContext(ucfpos: COpaquePointer?, context: Long, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposSetInt64IterationContext((ucfpos?.value ?: 0L).toString(), context.toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetState(ucfpos: COpaquePointer?, category: Int, field: Int, start: Int, limit: Int, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfposSetState((ucfpos?.value ?: 0L).toString(), category, field, start, limit, (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteBytes(args: COpaquePointer?, source: Pcstr, length: Int, offsetindex: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCbFromUwriteBytes((args?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), length, offsetindex, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCbFromUwriteSub((args?.value ?: 0L).toString(), offsetindex, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCbFromUwriteUchars((args?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (sourcelimit?.value ?: 0L).toString(), offsetindex, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCbToUwriteSub((args?.value ?: 0L).toString(), offsetindex, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, length: Int, offsetindex: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCbToUwriteUchars((args?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), length, offsetindex, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvClose(converter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvClose((converter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCompareNames((name1?.value ?: 0L).toString(), (name2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvConvert((toconvertername?.value ?: 0L).toString(), (fromconvertername?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), targetcapacity, (source?.value ?: 0L).toString(), sourcelength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvertEx(targetcnv: COpaquePointer?, sourcecnv: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: Pcstr, pivotstart: COpaquePointer?, pivotsource: COpaquePointer?, pivottarget: COpaquePointer?, pivotlimit: COpaquePointer?, reset: Byte, flush: Byte, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvConvertEx((targetcnv?.value ?: 0L).toString(), (sourcecnv?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), (targetlimit?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (sourcelimit?.value ?: 0L).toString(), (pivotstart?.value ?: 0L).toString(), (pivotsource?.value ?: 0L).toString(), (pivottarget?.value ?: 0L).toString(), (pivotlimit?.value ?: 0L).toString(), reset.toInt(), flush.toInt(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: COpaquePointer?): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCountAliases((alias?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountStandards(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvCountStandards() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: COpaquePointer?, perrorcode: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvDetectUnicodeSignature((source?.value ?: 0L).toString(), sourcelength, (signaturelength?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFixFileSeparator(cnv: COpaquePointer?, source: COpaquePointer?, sourcelen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFixFileSeparator((cnv?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFlushCache(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFlushCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromAlgorithmic(cnv: COpaquePointer?, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromAlgorithmic((cnv?.value ?: 0L).toString(), algorithmictype, (target?.value ?: 0L).toString(), targetcapacity, (source?.value ?: 0L).toString(), sourcelength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUchars(cnv: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUchars((cnv?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUcountPending((cnv?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvFromUnicode((converter?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), (targetlimit?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (sourcelimit?.value ?: 0L).toString(), (offsets?.value ?: 0L).toString(), flush.toInt(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetAlias((alias?.value ?: 0L).toString(), n.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetAliases(alias: Pcstr, aliases: COpaquePointer?, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetAliases((alias?.value ?: 0L).toString(), (aliases?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetAvailableName(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCcsid(converter: COpaquePointer?, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetCcsid((converter?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetCanonicalName((alias?.value ?: 0L).toString(), (standard?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDefaultName(): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetDefaultName() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDisplayName(converter: COpaquePointer?, displaylocale: Pcstr, displayname: COpaquePointer?, displaynamecapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetDisplayName((converter?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (displayname?.value ?: 0L).toString(), displaynamecapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetFromUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetFromUcallBack((converter?.value ?: 0L).toString(), (action?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidChars(converter: COpaquePointer?, errbytes: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetInvalidChars((converter?.value ?: 0L).toString(), (errbytes?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidUchars(converter: COpaquePointer?, erruchars: COpaquePointer?, len: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetInvalidUchars((converter?.value ?: 0L).toString(), (erruchars?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetMaxCharSize(converter: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetMaxCharSize((converter?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetMinCharSize(converter: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetMinCharSize((converter?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetName(converter: COpaquePointer?, err: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetName((converter?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetNextUchar(converter: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetNextUchar((converter?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (sourcelimit?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetPlatform(converter: COpaquePointer?, err: COpaquePointer?): UConverterPlatform =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetPlatform((converter?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandard(n: UShort, perrorcode: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetStandard(n.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetStandardName((name?.value ?: 0L).toString(), (standard?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStarters(converter: COpaquePointer?, starters: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetStarters((converter?.value ?: 0L).toString(), (starters?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetSubstChars((converter?.value ?: 0L).toString(), (subchars?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetToUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetToUcallBack((converter?.value ?: 0L).toString(), (action?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetType(converter: COpaquePointer?): UConverterType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetType((converter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetUnicodeSet(cnv: COpaquePointer?, setfillin: COpaquePointer?, whichset: UConverterUnicodeSet, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvGetUnicodeSet((cnv?.value ?: 0L).toString(), (setfillin?.value ?: 0L).toString(), whichset, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvIsAmbiguous(cnv: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvIsAmbiguous((cnv?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvIsFixedWidth(cnv: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvIsFixedWidth((cnv?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpen(convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpen((convertername?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenAllNames(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpenAllNames((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpenCcsid(codepage, platform, (err?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpenPackage((packagename?.value ?: 0L).toString(), (convertername?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpenStandardNames((convname?.value ?: 0L).toString(), (standard?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenU(name: COpaquePointer?, err: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvOpenU((name?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvReset(converter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvReset((converter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetFromUnicode(converter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvResetFromUnicode((converter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetToUnicode(converter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvResetToUnicode((converter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSafeClone(cnv: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSafeClone((cnv?.value ?: 0L).toString(), (stackbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvSetDefaultName(name: Pcstr) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetDefaultName((name?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFallback(cnv: COpaquePointer?, usesfallback: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetFallback((cnv?.value ?: 0L).toString(), usesfallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFromUcallBack(converter: COpaquePointer?, newaction: UConverterFromUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetFromUcallBack((converter?.value ?: 0L).toString(), 0L.toString(), (newcontext?.value ?: 0L).toString(), (oldaction?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: Byte, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetSubstChars((converter?.value ?: 0L).toString(), (subchars?.value ?: 0L).toString(), len.toInt(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstString(cnv: COpaquePointer?, s: COpaquePointer?, length: Int, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetSubstString((cnv?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetToUcallBack(converter: COpaquePointer?, newaction: UConverterToUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvSetToUcallBack((converter?.value ?: 0L).toString(), 0L.toString(), (newcontext?.value ?: 0L).toString(), (oldaction?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: COpaquePointer?, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToAlgorithmic(algorithmictype, (cnv?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), targetcapacity, (source?.value ?: 0L).toString(), sourcelength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUchars(cnv: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUchars((cnv?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (src?.value ?: 0L).toString(), srclength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUcountPending((cnv?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvToUnicode((converter?.value ?: 0L).toString(), (target?.value ?: 0L).toString(), (targetlimit?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (sourcelimit?.value ?: 0L).toString(), (offsets?.value ?: 0L).toString(), flush.toInt(), (err?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvUsesFallback(cnv: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvUsesFallback((cnv?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselClose(sel: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselClose((sel?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvselOpen(converterlist: COpaquePointer?, converterlistsize: Int, excludedcodepoints: COpaquePointer?, whichset: UConverterUnicodeSet, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselOpen((converterlist?.value ?: 0L).toString(), converterlistsize, (excludedcodepoints?.value ?: 0L).toString(), whichset, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselOpenFromSerialized(buffer: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselOpenFromSerialized((buffer?.value ?: 0L).toString(), length, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForString(sel: COpaquePointer?, s: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselSelectForString((sel?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForUtf8(sel: COpaquePointer?, s: Pcstr, length: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselSelectForUtf8((sel?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSerialize(sel: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvselSerialize((sel?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffercapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolCloneBinary(coll: COpaquePointer?, buffer: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolCloneBinary((coll?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), capacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolClose(coll: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolClose((coll?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCloseElements(elems: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolCloseElements((elems?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolEqual((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (target?.value ?: 0L).toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAttribute(coll: COpaquePointer?, attr: UColAttribute, status: COpaquePointer?): UColAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetAttribute((coll?.value ?: 0L).toString(), attr, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetAvailable(localeindex) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetBound(source: COpaquePointer?, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetBound((source?.value ?: 0L).toString(), sourcelength, boundtype, nooflevels.toInt(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetContractionsAndExpansions(coll: COpaquePointer?, contractions: COpaquePointer?, expansions: COpaquePointer?, addprefixes: Byte, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetContractionsAndExpansions((coll?.value ?: 0L).toString(), (contractions?.value ?: 0L).toString(), (expansions?.value ?: 0L).toString(), addprefixes.toInt(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetDisplayName((objloc?.value ?: 0L).toString(), (disploc?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetEquivalentReorderCodes(reordercode, (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetFunctionalEquivalent((result?.value ?: 0L).toString(), resultcapacity, (keyword?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (isavailable?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetKeywordValues((keyword?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetKeywordValuesForLocale((key?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), commonlyused.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywords(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetKeywords((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetLocaleByType(coll: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetLocaleByType((coll?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxExpansion(elems: COpaquePointer?, order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetMaxExpansion((elems?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxVariable(coll: COpaquePointer?): UColReorderCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetMaxVariable((coll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetOffset(elems: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetOffset((elems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetReorderCodes(coll: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetReorderCodes((coll?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRules(coll: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetRules((coll?.value ?: 0L).toString(), (length?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRulesEx(coll: COpaquePointer?, delta: UColRuleOption, buffer: COpaquePointer?, bufferlen: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetRulesEx((coll?.value ?: 0L).toString(), delta, (buffer?.value ?: 0L).toString(), bufferlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetSortKey(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, result: COpaquePointer?, resultlength: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetSortKey((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (result?.value ?: 0L).toString(), resultlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetStrength(coll: COpaquePointer?): UColAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetStrength((coll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetTailoredSet(coll: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetTailoredSet((coll?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetUcaversion(coll: COpaquePointer?, info: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetUcaversion((coll?.value ?: 0L).toString(), (info?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetVariableTop(coll: COpaquePointer?, status: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetVariableTop((coll?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetVersion(coll: COpaquePointer?, info: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGetVersion((coll?.value ?: 0L).toString(), (info?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGreater(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGreater((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (target?.value ?: 0L).toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGreaterOrEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolGreaterOrEqual((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (target?.value ?: 0L).toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolKeyHashCode(key: COpaquePointer?, length: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolKeyHashCode((key?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolMergeSortkeys(src1: COpaquePointer?, src1length: Int, src2: COpaquePointer?, src2length: Int, dest: COpaquePointer?, destcapacity: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolMergeSortkeys((src1?.value ?: 0L).toString(), src1length, (src2?.value ?: 0L).toString(), src2length, (dest?.value ?: 0L).toString(), destcapacity) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNext(elems: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolNext((elems?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNextSortKeyPart(coll: COpaquePointer?, iter: COpaquePointer?, state: COpaquePointer?, dest: COpaquePointer?, count: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolNextSortKeyPart((coll?.value ?: 0L).toString(), (iter?.value ?: 0L).toString(), (state?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), count, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpen(loc: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolOpen((loc?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenAvailableLocales(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolOpenAvailableLocales((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenBinary(bin: COpaquePointer?, length: Int, base: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolOpenBinary((bin?.value ?: 0L).toString(), length, (base?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenElements(coll: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolOpenElements((coll?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenRules(rules: COpaquePointer?, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolOpenRules((rules?.value ?: 0L).toString(), ruleslength, normalizationmode, strength, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrevious(elems: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolPrevious((elems?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrimaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolPrimaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolReset(elems: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolReset((elems?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSafeClone(coll: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSafeClone((coll?.value ?: 0L).toString(), (stackbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSecondaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSecondaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSetAttribute(coll: COpaquePointer?, attr: UColAttribute, value: UColAttributeValue, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetAttribute((coll?.value ?: 0L).toString(), attr, value, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetMaxVariable(coll: COpaquePointer?, group: UColReorderCode, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetMaxVariable((coll?.value ?: 0L).toString(), group, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetOffset(elems: COpaquePointer?, offset: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetOffset((elems?.value ?: 0L).toString(), offset, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetReorderCodes(coll: COpaquePointer?, reordercodes: COpaquePointer?, reordercodeslength: Int, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetReorderCodes((coll?.value ?: 0L).toString(), (reordercodes?.value ?: 0L).toString(), reordercodeslength, (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetStrength(coll: COpaquePointer?, strength: UColAttributeValue) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetStrength((coll?.value ?: 0L).toString(), strength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetText(elems: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolSetText((elems?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolStrcoll(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolStrcoll((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (target?.value ?: 0L).toString(), targetlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollIter(coll: COpaquePointer?, siter: COpaquePointer?, titer: COpaquePointer?, status: COpaquePointer?): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolStrcollIter((coll?.value ?: 0L).toString(), (siter?.value ?: 0L).toString(), (titer?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollUtf8(coll: COpaquePointer?, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: COpaquePointer?): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolStrcollUtf8((coll?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (target?.value ?: 0L).toString(), targetlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolTertiaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucolTertiaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGet(map: COpaquePointer?, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucpmapGet((map?.value ?: 0L).toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGetRange(map: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucpmapGetRange((map?.value ?: 0L).toString(), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieClose(trie: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieClose((trie?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucptrieGet(trie: COpaquePointer?, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieGet((trie?.value ?: 0L).toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieGetRange((trie?.value ?: 0L).toString(), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetType(trie: COpaquePointer?): UCPTrieType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieGetType((trie?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetValueWidth(trie: COpaquePointer?): UCPTrieValueWidth =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieGetValueWidth((trie?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallIndex(trie: COpaquePointer?, c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieInternalSmallIndex((trie?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallU8Index(trie: COpaquePointer?, lt1: Int, t2: UByte, t3: UByte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieInternalSmallU8Index((trie?.value ?: 0L).toString(), lt1, t2.toInt(), t3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalU8PrevIndex(trie: COpaquePointer?, c: Int, start: COpaquePointer?, src: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieInternalU8PrevIndex((trie?.value ?: 0L).toString(), c, (start?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieOpenFromBinary(type, valuewidth, (data?.value ?: 0L).toString(), length, (pactuallength?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieToBinary(trie: COpaquePointer?, data: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrieToBinary((trie?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetClose(ucsd: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetClose((ucsd?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetDetect(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetDetect((ucsd?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetDetectAll(ucsd: COpaquePointer?, matchesfound: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetDetectAll((ucsd?.value ?: 0L).toString(), (matchesfound?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetEnableInputFilter(ucsd: COpaquePointer?, filter: Byte): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetEnableInputFilter((ucsd?.value ?: 0L).toString(), filter.toInt()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetAllDetectableCharsets(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetGetAllDetectableCharsets((ucsd?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetConfidence(ucsm: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetGetConfidence((ucsm?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetLanguage(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetGetLanguage((ucsm?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetName(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetGetName((ucsm?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetUchars(ucsm: COpaquePointer?, buf: COpaquePointer?, cap: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetGetUchars((ucsm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), cap, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetIsInputFilterEnabled(ucsd: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetIsInputFilterEnabled((ucsd?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetOpen(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetOpen((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetSetDeclaredEncoding(ucsd: COpaquePointer?, encoding: Pcstr, length: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetSetDeclaredEncoding((ucsd?.value ?: 0L).toString(), (encoding?.value ?: 0L).toString(), length, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetSetText(ucsd: COpaquePointer?, textin: Pcstr, len: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdetSetText((ucsd?.value ?: 0L).toString(), (textin?.value ?: 0L).toString(), len, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrCountCurrencies((locale?.value ?: 0L).toString(), date, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocale(locale: Pcstr, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrForLocale((locale?.value ?: 0L).toString(), (buff?.value ?: 0L).toString(), buffcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrForLocaleAndDate((locale?.value ?: 0L).toString(), date, index, (buff?.value ?: 0L).toString(), buffcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigits(currency: COpaquePointer?, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigits((currency?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigitsForUsage((currency?.value ?: 0L).toString(), usage, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetKeywordValuesForLocale((key?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), commonlyused.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetName(currency: COpaquePointer?, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetName((currency?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), namestyle, (ischoiceformat?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetNumericCode(currency: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetNumericCode((currency?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetPluralName(currency: COpaquePointer?, locale: Pcstr, ischoiceformat: COpaquePointer?, pluralcount: Pcstr, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetPluralName((currency?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (ischoiceformat?.value ?: 0L).toString(), (pluralcount?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrement(currency: COpaquePointer?, ec: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetRoundingIncrement((currency?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrementForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrGetRoundingIncrementForUsage((currency?.value ?: 0L).toString(), usage, (ec?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrIsAvailable(isocode: COpaquePointer?, from: Double, to: Double, errorcode: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrIsAvailable((isocode?.value ?: 0L).toString(), from, to, (errorcode?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrOpenIsocurrencies(currtype.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrRegister(isocode: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrRegister((isocode?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrUnregister(key: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurrUnregister((key?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatAdoptNumberFormat(fmt: COpaquePointer?, numberformattoadopt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatAdoptNumberFormat((fmt?.value ?: 0L).toString(), (numberformattoadopt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatAdoptNumberFormatForFields(fmt: COpaquePointer?, fields: COpaquePointer?, numberformattoset: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatAdoptNumberFormatForFields((fmt?.value ?: 0L).toString(), (fields?.value ?: 0L).toString(), (numberformattoset?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatApplyPattern((format?.value ?: 0L).toString(), localized.toInt(), (pattern?.value ?: 0L).toString(), patternlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatClone((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatClose(format: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatClose((format?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatCountSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatCountSymbols((fmt?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormat(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatFormat((format?.value ?: 0L).toString(), datetoformat, (result?.value ?: 0L).toString(), resultlength, (position?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendar(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatFormatCalendar((format?.value ?: 0L).toString(), (calendar?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), capacity, (position?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendarForFields(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatFormatCalendarForFields((format?.value ?: 0L).toString(), (calendar?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), capacity, (fpositer?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatForFields(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatFormatForFields((format?.value ?: 0L).toString(), datetoformat, (result?.value ?: 0L).toString(), resultlength, (fpositer?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGet2DigitYearStart(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGet2DigitYearStart((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetAvailable(localeindex) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetBooleanAttribute((fmt?.value ?: 0L).toString(), attr, (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetCalendar(fmt: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetCalendar((fmt?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetContext((fmt?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetLocaleByType((fmt?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormat(fmt: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetNumberFormat((fmt?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormatForField(fmt: COpaquePointer?, field: UShort): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetNumberFormatForField((fmt?.value ?: 0L).toString(), field.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatGetSymbols((fmt?.value ?: 0L).toString(), type, symbolindex, (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatIsLenient(fmt: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatIsLenient((fmt?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: COpaquePointer?, tzidlength: Int, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatOpen(timestyle, datestyle, (locale?.value ?: 0L).toString(), (tzid?.value ?: 0L).toString(), tzidlength, (pattern?.value ?: 0L).toString(), patternlength, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParse(format: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatParse((format?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParseCalendar(format: COpaquePointer?, calendar: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatParseCalendar((format?.value ?: 0L).toString(), (calendar?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSet2DigitYearStart(fmt: COpaquePointer?, d: Double, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSet2DigitYearStart((fmt?.value ?: 0L).toString(), d, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetBooleanAttribute((fmt?.value ?: 0L).toString(), attr, newvalue.toInt(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetCalendar(fmt: COpaquePointer?, calendartoset: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetCalendar((fmt?.value ?: 0L).toString(), (calendartoset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetContext((fmt?.value ?: 0L).toString(), value, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetLenient(fmt: COpaquePointer?, islenient: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetLenient((fmt?.value ?: 0L).toString(), islenient.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetNumberFormat(fmt: COpaquePointer?, numberformattoset: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetNumberFormat((fmt?.value ?: 0L).toString(), (numberformattoset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetSymbols(format: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, value: COpaquePointer?, valuelength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatSetSymbols((format?.value ?: 0L).toString(), type, symbolindex, (value?.value ?: 0L).toString(), valuelength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatToCalendarDateField(field) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatToPattern(fmt: COpaquePointer?, localized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatToPattern((fmt?.value ?: 0L).toString(), localized.toInt(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgAddPattern(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, override: Byte, conflictingpattern: COpaquePointer?, capacity: Int, plength: COpaquePointer?, perrorcode: COpaquePointer?): UDateTimePatternConflict =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgAddPattern((dtpg?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, override.toInt(), (conflictingpattern?.value ?: 0L).toString(), capacity, (plength?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClone(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgClone((dtpg?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClose(dtpg: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgClose((dtpg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgGetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetAppendItemFormat((dtpg?.value ?: 0L).toString(), field, (plength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetAppendItemName((dtpg?.value ?: 0L).toString(), field, (plength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBaseSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, baseskeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetBaseSkeleton((unuseddtpg?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), length, (baseskeleton?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPattern(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetBestPattern((dtpg?.value ?: 0L).toString(), (skeleton?.value ?: 0L).toString(), length, (bestpattern?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPatternWithOptions(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, options: UDateTimePatternMatchOptions, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetBestPatternWithOptions((dtpg?.value ?: 0L).toString(), (skeleton?.value ?: 0L).toString(), length, options, (bestpattern?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDateTimeFormat(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetDateTimeFormat((dtpg?.value ?: 0L).toString(), (plength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDecimal(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetDecimal((dtpg?.value ?: 0L).toString(), (plength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetFieldDisplayName(dtpg: COpaquePointer?, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetFieldDisplayName((dtpg?.value ?: 0L).toString(), field, width, (fieldname?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetPatternForSkeleton(dtpg: COpaquePointer?, skeleton: COpaquePointer?, skeletonlength: Int, plength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetPatternForSkeleton((dtpg?.value ?: 0L).toString(), (skeleton?.value ?: 0L).toString(), skeletonlength, (plength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, skeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgGetSkeleton((unuseddtpg?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), length, (skeleton?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpen(locale: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgOpen((locale?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenBaseSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgOpenBaseSkeletons((dtpg?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenEmpty(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgOpenEmpty((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgOpenSkeletons((dtpg?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypes(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgReplaceFieldTypes((dtpg?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (skeleton?.value ?: 0L).toString(), skeletonlength, (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgReplaceFieldTypesWithOptions((dtpg?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (skeleton?.value ?: 0L).toString(), skeletonlength, options, (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgSetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgSetAppendItemFormat((dtpg?.value ?: 0L).toString(), field, (value?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgSetAppendItemName((dtpg?.value ?: 0L).toString(), field, (value?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDateTimeFormat(dtpg: COpaquePointer?, dtformat: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgSetDateTimeFormat((dtpg?.value ?: 0L).toString(), (dtformat?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDecimal(dtpg: COpaquePointer?, decimal: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpgSetDecimal((dtpg?.value ?: 0L).toString(), (decimal?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtClose(formatter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtClose((formatter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtCloseResult(uresult: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtCloseResult((uresult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtFormat(formatter: COpaquePointer?, fromdate: Double, todate: Double, result: COpaquePointer?, resultcapacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtFormat((formatter?.value ?: 0L).toString(), fromdate, todate, (result?.value ?: 0L).toString(), resultcapacity, (position?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: COpaquePointer?, skeletonlength: Int, tzid: COpaquePointer?, tzidlength: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtOpen((locale?.value ?: 0L).toString(), (skeleton?.value ?: 0L).toString(), skeletonlength, (tzid?.value ?: 0L).toString(), tzidlength, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtOpenResult((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmtResultAsValue((uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumClose(en: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumClose((en?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumCount(en: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumCount((en?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumNext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumNext((en?.value ?: 0L).toString(), (resultlength?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenCharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumOpenCharStringsEnumeration((strings?.value ?: 0L).toString(), count, (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenUcharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumOpenUcharStringsEnumeration((strings?.value ?: 0L).toString(), count, (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumReset(en: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumReset((en?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumUnext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenumUnext((en?.value ?: 0L).toString(), (resultlength?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerClose(fpositer: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositerClose((fpositer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufieldpositerNext(fpositer: COpaquePointer?, beginindex: COpaquePointer?, endindex: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositerNext((fpositer?.value ?: 0L).toString(), (beginindex?.value ?: 0L).toString(), (endindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerOpen(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositerOpen((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtClose(fmt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtClose((fmt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufmtGetArrayItemByIndex(fmt: COpaquePointer?, n: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetArrayItemByIndex((fmt?.value ?: 0L).toString(), n, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetArrayLength(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetArrayLength((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDate(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetDate((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDecNumChars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetDecNumChars((fmt?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDouble(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetDouble((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetInt64(fmt: COpaquePointer?, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetInt64((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetLong(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetLong((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetObject(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetObject((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetType(fmt: COpaquePointer?, status: COpaquePointer?): UFormattableType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetType((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetUchars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtGetUchars((fmt?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtIsNumeric(fmt: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtIsNumeric((fmt?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtOpen(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtOpen((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalGetString(ufmtval: COpaquePointer?, plength: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtvalGetString((ufmtval?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalNextPosition(ufmtval: COpaquePointer?, ucfpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtvalNextPosition((ufmtval?.value ?: 0L).toString(), (ucfpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetInstance(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ugenderGetInstance((locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetListGender(genderinfo: COpaquePointer?, genders: COpaquePointer?, size: Int, status: COpaquePointer?): UGender =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ugenderGetListGender((genderinfo?.value ?: 0L).toString(), (genders?.value ?: 0L).toString(), size, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaClose(idna: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaClose((idna?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uidnaLabelToAscii(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaLabelToAscii((idna?.value ?: 0L).toString(), (label?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToAsciiUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaLabelToAsciiUtf8((idna?.value ?: 0L).toString(), (label?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicode(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaLabelToUnicode((idna?.value ?: 0L).toString(), (label?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicodeUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaLabelToUnicodeUtf8((idna?.value ?: 0L).toString(), (label?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAscii(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaNameToAscii((idna?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAsciiUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaNameToAsciiUtf8((idna?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicode(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaNameToUnicode((idna?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicodeUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaNameToUnicodeUtf8((idna?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (pinfo?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaOpenUts46(options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidnaOpenUts46(options.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterCurrent32(iter: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterCurrent32((iter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterGetState(iter: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterGetState((iter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterNext32(iter: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterNext32((iter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterPrevious32(iter: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterPrevious32((iter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterSetState(iter: COpaquePointer?, state: UInt, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterSetState((iter?.value ?: 0L).toString(), state.toInt(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetString(iter: COpaquePointer?, s: COpaquePointer?, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterSetString((iter?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf16Be(iter: COpaquePointer?, s: Pcstr, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterSetUtf16Be((iter?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf8(iter: COpaquePointer?, s: Pcstr, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiterSetUtf8((iter?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnClose(ldn: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnClose((ldn?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnGetContext(ldn: COpaquePointer?, type: UDisplayContextType, perrorcode: COpaquePointer?): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnGetContext((ldn?.value ?: 0L).toString(), type, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetDialectHandling(ldn: COpaquePointer?): UDialectHandling =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnGetDialectHandling((ldn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetLocale(ldn: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnGetLocale((ldn?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyDisplayName(ldn: COpaquePointer?, key: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnKeyDisplayName((ldn?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyValueDisplayName(ldn: COpaquePointer?, key: Pcstr, value: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnKeyValueDisplayName((ldn?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLanguageDisplayName(ldn: COpaquePointer?, lang: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnLanguageDisplayName((ldn?.value ?: 0L).toString(), (lang?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLocaleDisplayName(ldn: COpaquePointer?, locale: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnLocaleDisplayName((ldn?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnOpen((locale?.value ?: 0L).toString(), dialecthandling, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpenForContext(locale: Pcstr, contexts: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnOpenForContext((locale?.value ?: 0L).toString(), (contexts?.value ?: 0L).toString(), length, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnRegionDisplayName(ldn: COpaquePointer?, region: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnRegionDisplayName((ldn?.value ?: 0L).toString(), (region?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptCodeDisplayName(ldn: COpaquePointer?, scriptcode: UScriptCode, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnScriptCodeDisplayName((ldn?.value ?: 0L).toString(), scriptcode, (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptDisplayName(ldn: COpaquePointer?, script: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnScriptDisplayName((ldn?.value ?: 0L).toString(), (script?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnVariantDisplayName(ldn: COpaquePointer?, variant: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldnVariantDisplayName((ldn?.value ?: 0L).toString(), (variant?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtClose(listfmt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtClose((listfmt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtCloseResult(uresult: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtCloseResult((uresult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtFormat(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtFormat((listfmt?.value ?: 0L).toString(), (strings?.value ?: 0L).toString(), (stringlengths?.value ?: 0L).toString(), stringcount, (result?.value ?: 0L).toString(), resultcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtFormatStringsToResult(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, uresult: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtFormatStringsToResult((listfmt?.value ?: 0L).toString(), (strings?.value ?: 0L).toString(), (stringlengths?.value ?: 0L).toString(), stringcount, (uresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtOpen((locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtOpenForType((locale?.value ?: 0L).toString(), type, width, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtOpenResult((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmtResultAsValue((uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, acceptlist: COpaquePointer?, acceptlistcount: Int, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocAcceptLanguage((result?.value ?: 0L).toString(), resultavailable, (outresult?.value ?: 0L).toString(), (acceptlist?.value ?: 0L).toString(), acceptlistcount, (availablelocales?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, httpacceptlanguage: Pcstr, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocAcceptLanguageFromHttp((result?.value ?: 0L).toString(), resultavailable, (outresult?.value ?: 0L).toString(), (httpacceptlanguage?.value ?: 0L).toString(), (availablelocales?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocAddLikelySubtags((localeid?.value ?: 0L).toString(), (maximizedlocaleid?.value ?: 0L).toString(), maximizedlocaleidcapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocCanonicalize((localeid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), namecapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: COpaquePointer?, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocForLanguageTag((langtag?.value ?: 0L).toString(), (localeid?.value ?: 0L).toString(), localeidcapacity, (parsedlength?.value ?: 0L).toString(), (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetAvailable(n: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetAvailable(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetBaseName((localeid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), namecapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetCharacterOrientation((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetCountry((localeid?.value ?: 0L).toString(), (country?.value ?: 0L).toString(), countrycapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDefault(): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDefault() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: COpaquePointer?, countrycapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayCountry((locale?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (country?.value ?: 0L).toString(), countrycapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayKeyword((keyword?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayKeywordValue((locale?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: COpaquePointer?, languagecapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayLanguage((locale?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (language?.value ?: 0L).toString(), languagecapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: COpaquePointer?, maxresultsize: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayName((localeid?.value ?: 0L).toString(), (inlocaleid?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), maxresultsize, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: COpaquePointer?, scriptcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayScript((locale?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (script?.value ?: 0L).toString(), scriptcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: COpaquePointer?, variantcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetDisplayVariant((locale?.value ?: 0L).toString(), (displaylocale?.value ?: 0L).toString(), (variant?.value ?: 0L).toString(), variantcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetIso3Country((localeid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetIso3Language((localeid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsocountries(): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetIsocountries() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsolanguages(): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetIsolanguages() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetKeywordValue((localeid?.value ?: 0L).toString(), (keywordname?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffercapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetLcid((localeid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetLanguage((localeid?.value ?: 0L).toString(), (language?.value ?: 0L).toString(), languagecapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetLineOrientation((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetLocaleForLcid(hostid.toInt(), (locale?.value ?: 0L).toString(), localecapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetName((localeid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), namecapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetParent((localeid?.value ?: 0L).toString(), (parent?.value ?: 0L).toString(), parentcapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetScript((localeid?.value ?: 0L).toString(), (script?.value ?: 0L).toString(), scriptcapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocGetVariant((localeid?.value ?: 0L).toString(), (variant?.value ?: 0L).toString(), variantcapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocIsRightToLeft((locale?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocMinimizeSubtags((localeid?.value ?: 0L).toString(), (minimizedlocaleid?.value ?: 0L).toString(), minimizedlocaleidcapacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocOpenAvailableByType(type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenKeywords(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocOpenKeywords((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocSetDefault(localeid: Pcstr, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocSetDefault((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocSetKeywordValue((keywordname?.value ?: 0L).toString(), (keywordvalue?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffercapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocToLanguageTag((localeid?.value ?: 0L).toString(), (langtag?.value ?: 0L).toString(), langtagcapacity, strict.toInt(), (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocToLegacyKey((keyword?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocToLegacyType((keyword?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocToUnicodeLocaleKey((keyword?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocToUnicodeLocaleType((keyword?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataClose(uld: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataClose((uld?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetCldrversion(versionarray: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetCldrversion((versionarray?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetDelimiter(uld: COpaquePointer?, type: ULocaleDataDelimiterType, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetDelimiter((uld?.value ?: 0L).toString(), type, (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetExemplarSet(uld: COpaquePointer?, fillin: COpaquePointer?, options: UInt, extype: ULocaleDataExemplarSetType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetExemplarSet((uld?.value ?: 0L).toString(), (fillin?.value ?: 0L).toString(), options.toInt(), extype, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleDisplayPattern(uld: COpaquePointer?, pattern: COpaquePointer?, patterncapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetLocaleDisplayPattern((uld?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patterncapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleSeparator(uld: COpaquePointer?, separator: COpaquePointer?, separatorcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetLocaleSeparator((uld?.value ?: 0L).toString(), (separator?.value ?: 0L).toString(), separatorcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: COpaquePointer?): UMeasurementSystem =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetMeasurementSystem((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetNoSubstitute(uld: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetNoSubstitute((uld?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: COpaquePointer?, width: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataGetPaperSize((localeid?.value ?: 0L).toString(), (height?.value ?: 0L).toString(), (width?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataOpen(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataOpen((localeid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataSetNoSubstitute(uld: COpaquePointer?, setting: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdataSetNoSubstitute((uld?.value ?: 0L).toString(), setting.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgApplyPattern(fmt: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgApplyPattern((fmt?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgAutoQuoteApostrophe(pattern: COpaquePointer?, patternlength: Int, dest: COpaquePointer?, destcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgAutoQuoteApostrophe((pattern?.value ?: 0L).toString(), patternlength, (dest?.value ?: 0L).toString(), destcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgClone((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClose(format: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgClose((format?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgFormat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgFormat((fmt?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgGetLocale(fmt: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgGetLocale((fmt?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgOpen(pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgOpen((pattern?.value ?: 0L).toString(), patternlength, (locale?.value ?: 0L).toString(), (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgParse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgParse((fmt?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (count?.value ?: 0L).toString(), (status?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgSetLocale(fmt: COpaquePointer?, locale: Pcstr) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgSetLocale((fmt?.value ?: 0L).toString(), (locale?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgToPattern(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgToPattern((fmt?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVformat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgVformat((fmt?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (ap?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVparse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsgVparse((fmt?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), sourcelength, (count?.value ?: 0L).toString(), (ap?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieBuildImmutable(trie: COpaquePointer?, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieBuildImmutable((trie?.value ?: 0L).toString(), type, valuewidth, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClone(other: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieClone((other?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClose(trie: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieClose((trie?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieFromUcpmap(map: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieFromUcpmap((map?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieFromUcptrie(trie: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieFromUcptrie((trie?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGet(trie: COpaquePointer?, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieGet((trie?.value ?: 0L).toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieGetRange((trie?.value ?: 0L).toString(), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieOpen(initialvalue.toInt(), errorvalue.toInt(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieSet(trie: COpaquePointer?, c: Int, value: UInt, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieSet((trie?.value ?: 0L).toString(), c, value.toInt(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieSetRange(trie: COpaquePointer?, start: Int, end: Int, value: UInt, perrorcode: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrieSetRange((trie?.value ?: 0L).toString(), start, end, value.toInt(), (perrorcode?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2Append(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2Append((norm2?.value ?: 0L).toString(), (first?.value ?: 0L).toString(), firstlength, firstcapacity, (second?.value ?: 0L).toString(), secondlength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Close(norm2: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2Close((norm2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2ComposePair(norm2: COpaquePointer?, a: Int, b: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2ComposePair((norm2?.value ?: 0L).toString(), a, b) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetCombiningClass(norm2: COpaquePointer?, c: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetCombiningClass((norm2?.value ?: 0L).toString(), c) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetDecomposition((norm2?.value ?: 0L).toString(), c, (decomposition?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetInstance((packagename?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), mode, (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetNfcinstance((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetNfdinstance((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetNfkccasefoldInstance((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetNfkcinstance((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetNfkdinstance((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetRawDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2GetRawDecomposition((norm2?.value ?: 0L).toString(), c, (decomposition?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryAfter(norm2: COpaquePointer?, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2HasBoundaryAfter((norm2?.value ?: 0L).toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryBefore(norm2: COpaquePointer?, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2HasBoundaryBefore((norm2?.value ?: 0L).toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsInert(norm2: COpaquePointer?, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2IsInert((norm2?.value ?: 0L).toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsNormalized(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2IsNormalized((norm2?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (perrorcode?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Normalize(norm2: COpaquePointer?, src: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2Normalize((norm2?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2NormalizeSecondAndAppend(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2NormalizeSecondAndAppend((norm2?.value ?: 0L).toString(), (first?.value ?: 0L).toString(), firstlength, firstcapacity, (second?.value ?: 0L).toString(), secondlength, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2OpenFiltered(norm2: COpaquePointer?, filterset: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2OpenFiltered((norm2?.value ?: 0L).toString(), (filterset?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2QuickCheck(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): UNormalizationCheckResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2QuickCheck((norm2?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2SpanQuickCheckYes(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2SpanQuickCheckYes((norm2?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unormCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unormCompare((s1?.value ?: 0L).toString(), length1, (s2?.value ?: 0L).toString(), length2, options.toInt(), (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumApplyPattern((format?.value ?: 0L).toString(), localized.toInt(), (pattern?.value ?: 0L).toString(), patternlength, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumClone((fmt?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumClose(fmt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumClose((fmt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumCountAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormat(fmt: COpaquePointer?, number: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormat((fmt?.value ?: 0L).toString(), number, (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDecimal(fmt: COpaquePointer?, number: Pcstr, length: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatDecimal((fmt?.value ?: 0L).toString(), (number?.value ?: 0L).toString(), length, (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDouble(fmt: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatDouble((fmt?.value ?: 0L).toString(), number, (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleCurrency(fmt: COpaquePointer?, number: Double, currency: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatDoubleCurrency((fmt?.value ?: 0L).toString(), number, (currency?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleForFields(format: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatDoubleForFields((format?.value ?: 0L).toString(), number, (result?.value ?: 0L).toString(), resultlength, (fpositer?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatInt64(fmt: COpaquePointer?, number: Long, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatInt64((fmt?.value ?: 0L).toString(), number.toString(), (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatUformattable(fmt: COpaquePointer?, number: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumFormatUformattable((fmt?.value ?: 0L).toString(), (number?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetAttribute((fmt?.value ?: 0L).toString(), attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetAvailable(localeindex) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetContext((fmt?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetDoubleAttribute((fmt?.value ?: 0L).toString(), attr) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetLocaleByType((fmt?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, buffer: COpaquePointer?, size: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetSymbol((fmt?.value ?: 0L).toString(), symbol, (buffer?.value ?: 0L).toString(), size, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumGetTextAttribute((fmt?.value ?: 0L).toString(), tag, (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumOpen(style: UNumberFormatStyle, pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumOpen(style, (pattern?.value ?: 0L).toString(), patternlength, (locale?.value ?: 0L).toString(), (parseerr?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParse(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParse((fmt?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDecimal(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, outbuf: Pcstr, outbuflength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParseDecimal((fmt?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), outbuflength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDouble(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParseDouble((fmt?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDoubleCurrency(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, currency: COpaquePointer?, status: COpaquePointer?): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParseDoubleCurrency((fmt?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (currency?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseInt64(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParseInt64((fmt?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseToUformattable(fmt: COpaquePointer?, result: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumParseToUformattable((fmt?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (parsepos?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumSetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumSetAttribute((fmt?.value ?: 0L).toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumSetContext((fmt?.value ?: 0L).toString(), value, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Double) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumSetDoubleAttribute((fmt?.value ?: 0L).toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, value: COpaquePointer?, length: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumSetSymbol((fmt?.value ?: 0L).toString(), symbol, (value?.value ?: 0L).toString(), length, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, newvalue: COpaquePointer?, newvaluelength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumSetTextAttribute((fmt?.value ?: 0L).toString(), tag, (newvalue?.value ?: 0L).toString(), newvaluelength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumToPattern(fmt: COpaquePointer?, ispatternlocalized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumToPattern((fmt?.value ?: 0L).toString(), ispatternlocalized.toInt(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfClose(uformatter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfClose((uformatter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfCloseResult(uresult: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfCloseResult((uresult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDecimal(uformatter: COpaquePointer?, value: Pcstr, valuelen: Int, uresult: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfFormatDecimal((uformatter?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuelen, (uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDouble(uformatter: COpaquePointer?, value: Double, uresult: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfFormatDouble((uformatter?.value ?: 0L).toString(), value, (uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatInt(uformatter: COpaquePointer?, value: Long, uresult: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfFormatInt((uformatter?.value ?: 0L).toString(), value.toString(), (uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocale((skeleton?.value ?: 0L).toString(), skeletonlen, (locale?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, perror: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocaleWithError((skeleton?.value ?: 0L).toString(), skeletonlen, (locale?.value ?: 0L).toString(), (perror?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenResult(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfOpenResult((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfResultAsValue((uresult?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultGetAllFieldPositions(uresult: COpaquePointer?, ufpositer: COpaquePointer?, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfResultGetAllFieldPositions((uresult?.value ?: 0L).toString(), (ufpositer?.value ?: 0L).toString(), (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfResultNextFieldPosition(uresult: COpaquePointer?, ufpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfResultNextFieldPosition((uresult?.value ?: 0L).toString(), (ufpos?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultToString(uresult: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumfResultToString((uresult?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffercapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysClose(unumsys: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysClose((unumsys?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumsysGetDescription(unumsys: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysGetDescription((unumsys?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetName(unumsys: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysGetName((unumsys?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetRadix(unumsys: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysGetRadix((unumsys?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysIsAlgorithmic(unumsys: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysIsAlgorithmic((unumsys?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysOpen((locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenAvailableNames(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysOpenAvailableNames((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenByName(name: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsysOpenByName((name?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesClose(uplrules: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesClose((uplrules?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uplrulesGetKeywords(uplrules: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesGetKeywords((uplrules?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesOpen((locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesOpenForType((locale?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelect(uplrules: COpaquePointer?, number: Double, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesSelect((uplrules?.value ?: 0L).toString(), number, (keyword?.value ?: 0L).toString(), capacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelectFormatted(uplrules: COpaquePointer?, number: COpaquePointer?, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrulesSelectFormatted((uplrules?.value ?: 0L).toString(), (number?.value ?: 0L).toString(), (keyword?.value ?: 0L).toString(), capacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacement(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexAppendReplacement((regexp?.value ?: 0L).toString(), (replacementtext?.value ?: 0L).toString(), replacementlength, (destbuf?.value ?: 0L).toString(), (destcapacity?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacementUtext(regexp: COpaquePointer?, replacementtext: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexAppendReplacementUtext((regexp?.value ?: 0L).toString(), (replacementtext?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexAppendTail(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexAppendTail((regexp?.value ?: 0L).toString(), (destbuf?.value ?: 0L).toString(), (destcapacity?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendTailUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexAppendTailUtext((regexp?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClone(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexClone((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClose(regexp: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexClose((regexp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexEnd(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexEnd((regexp?.value ?: 0L).toString(), groupnum, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexEnd64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexEnd64((regexp?.value ?: 0L).toString(), groupnum, (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexFind((regexp?.value ?: 0L).toString(), startindex, (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexFind64((regexp?.value ?: 0L).toString(), startindex.toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFindNext(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexFindNext((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFlags(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexFlags((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetFindProgressCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetFindProgressCallback((regexp?.value ?: 0L).toString(), (callback?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetMatchCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetMatchCallback((regexp?.value ?: 0L).toString(), (callback?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetStackLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetStackLimit((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetText(regexp: COpaquePointer?, textlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetText((regexp?.value ?: 0L).toString(), (textlength?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetTimeLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetTimeLimit((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGetUtext((regexp?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroup(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGroup((regexp?.value ?: 0L).toString(), groupnum, (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupCount(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGroupCount((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromCname(regexp: COpaquePointer?, groupname: Pcstr, namelength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGroupNumberFromCname((regexp?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), namelength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromName(regexp: COpaquePointer?, groupname: COpaquePointer?, namelength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGroupNumberFromName((regexp?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), namelength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupUtext(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, grouplength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexGroupUtext((regexp?.value ?: 0L).toString(), groupnum, (dest?.value ?: 0L).toString(), (grouplength?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasAnchoringBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexHasAnchoringBounds((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasTransparentBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexHasTransparentBounds((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHitEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexHitEnd((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexLookingAt((regexp?.value ?: 0L).toString(), startindex, (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexLookingAt64((regexp?.value ?: 0L).toString(), startindex.toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexMatches((regexp?.value ?: 0L).toString(), startindex, (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexMatches64((regexp?.value ?: 0L).toString(), startindex.toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpen(pattern: COpaquePointer?, patternlength: Int, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexOpen((pattern?.value ?: 0L).toString(), patternlength, flags.toInt(), (pe?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexOpenC((pattern?.value ?: 0L).toString(), flags.toInt(), (pe?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenUtext(pattern: COpaquePointer?, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexOpenUtext((pattern?.value ?: 0L).toString(), flags.toInt(), (pe?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPattern(regexp: COpaquePointer?, patlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexPattern((regexp?.value ?: 0L).toString(), (patlength?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPatternUtext(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexPatternUtext((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRefreshUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRefreshUtext((regexp?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexRegionEnd(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRegionEnd((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionEnd64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRegionEnd64((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRegionStart((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRegionStart64((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAll(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReplaceAll((regexp?.value ?: 0L).toString(), (replacementtext?.value ?: 0L).toString(), replacementlength, (destbuf?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAllUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReplaceAllUtext((regexp?.value ?: 0L).toString(), (replacement?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirst(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReplaceFirst((regexp?.value ?: 0L).toString(), (replacementtext?.value ?: 0L).toString(), replacementlength, (destbuf?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirstUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReplaceFirstUtext((regexp?.value ?: 0L).toString(), (replacement?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRequireEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexRequireEnd((regexp?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReset(regexp: COpaquePointer?, index: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReset((regexp?.value ?: 0L).toString(), index, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexReset64(regexp: COpaquePointer?, index: Long, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexReset64((regexp?.value ?: 0L).toString(), index.toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetFindProgressCallback(regexp: COpaquePointer?, callback: URegexFindProgressCallback, context: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetFindProgressCallback((regexp?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetMatchCallback(regexp: COpaquePointer?, callback: URegexMatchCallback, context: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetMatchCallback((regexp?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion(regexp: COpaquePointer?, regionstart: Int, regionlimit: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetRegion((regexp?.value ?: 0L).toString(), regionstart, regionlimit, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion64(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetRegion64((regexp?.value ?: 0L).toString(), regionstart.toString(), regionlimit.toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegionAndStart(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, startindex: Long, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetRegionAndStart((regexp?.value ?: 0L).toString(), regionstart.toString(), regionlimit.toString(), startindex.toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetStackLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetStackLimit((regexp?.value ?: 0L).toString(), limit, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetText(regexp: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetText((regexp?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetTimeLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetTimeLimit((regexp?.value ?: 0L).toString(), limit, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSetUtext((regexp?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSplit(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: Int, requiredcapacity: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSplit((regexp?.value ?: 0L).toString(), (destbuf?.value ?: 0L).toString(), destcapacity, (requiredcapacity?.value ?: 0L).toString(), (destfields?.value ?: 0L).toString(), destfieldscapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexSplitUtext(regexp: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexSplitUtext((regexp?.value ?: 0L).toString(), (destfields?.value ?: 0L).toString(), destfieldscapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexStart((regexp?.value ?: 0L).toString(), groupnum, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexStart64((regexp?.value ?: 0L).toString(), groupnum, (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexUseAnchoringBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexUseAnchoringBounds((regexp?.value ?: 0L).toString(), b.toInt(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexUseTransparentBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregexUseTransparentBounds((regexp?.value ?: 0L).toString(), b.toInt(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregionAreEqual(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionAreEqual((uregion?.value ?: 0L).toString(), (otherregion?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionContains(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionContains((uregion?.value ?: 0L).toString(), (otherregion?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetAvailable(type: URegionType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetAvailable(type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegions(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetContainedRegions((uregion?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegionsOfType(uregion: COpaquePointer?, type: URegionType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetContainedRegionsOfType((uregion?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegion(uregion: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetContainingRegion((uregion?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegionOfType(uregion: COpaquePointer?, type: URegionType): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetContainingRegionOfType((uregion?.value ?: 0L).toString(), type) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetNumericCode(uregion: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetNumericCode((uregion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetPreferredValues(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetPreferredValues((uregion?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionCode(uregion: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetRegionCode((uregion?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetRegionFromCode((regioncode?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromNumericCode(code: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetRegionFromNumericCode(code, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetType(uregion: COpaquePointer?): URegionType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregionGetType((uregion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtClose(reldatefmt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtClose((reldatefmt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCloseResult(ufrdt: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtCloseResult((ufrdt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: COpaquePointer?, relativedatestring: COpaquePointer?, relativedatestringlen: Int, timestring: COpaquePointer?, timestringlen: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtCombineDateAndTime((reldatefmt?.value ?: 0L).toString(), (relativedatestring?.value ?: 0L).toString(), relativedatestringlen, (timestring?.value ?: 0L).toString(), timestringlen, (result?.value ?: 0L).toString(), resultcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormat(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtFormat((reldatefmt?.value ?: 0L).toString(), offset, unit, (result?.value ?: 0L).toString(), resultcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumeric(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtFormatNumeric((reldatefmt?.value ?: 0L).toString(), offset, unit, (result?.value ?: 0L).toString(), resultcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtFormatNumericToResult((reldatefmt?.value ?: 0L).toString(), offset, unit, (result?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtFormatToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtFormatToResult((reldatefmt?.value ?: 0L).toString(), offset, unit, (result?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: COpaquePointer?, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtOpen((locale?.value ?: 0L).toString(), (nftoadopt?.value ?: 0L).toString(), width, capitalizationcontext, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtOpenResult((ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtResultAsValue(ufrdt: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmtResultAsValue((ufrdt?.value ?: 0L).toString(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresClose(resourcebundle: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresClose((resourcebundle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresGetBinary(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetBinary((resourcebundle?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByIndex(resourcebundle: COpaquePointer?, indexr: Int, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetByIndex((resourcebundle?.value ?: 0L).toString(), indexr, (fillin?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByKey(resourcebundle: COpaquePointer?, key: Pcstr, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetByKey((resourcebundle?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (fillin?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetInt(resourcebundle: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetInt((resourcebundle?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetIntVector(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetIntVector((resourcebundle?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetKey(resourcebundle: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetKey((resourcebundle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetLocaleByType(resourcebundle: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetLocaleByType((resourcebundle?.value ?: 0L).toString(), type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextResource(resourcebundle: COpaquePointer?, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetNextResource((resourcebundle?.value ?: 0L).toString(), (fillin?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextString(resourcebundle: COpaquePointer?, len: COpaquePointer?, key: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetNextString((resourcebundle?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetSize(resourcebundle: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetSize((resourcebundle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetString(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetString((resourcebundle?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByIndex(resourcebundle: COpaquePointer?, indexs: Int, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetStringByIndex((resourcebundle?.value ?: 0L).toString(), indexs, (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByKey(resb: COpaquePointer?, key: Pcstr, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetStringByKey((resb?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetType(resourcebundle: COpaquePointer?): UResType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetType((resourcebundle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUint(resourcebundle: COpaquePointer?, status: COpaquePointer?): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetUint((resourcebundle?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8String(resb: COpaquePointer?, dest: Pcstr, length: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetUtf8String((resb?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), forcecopy.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByIndex(resb: COpaquePointer?, stringindex: Int, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetUtf8StringByIndex((resb?.value ?: 0L).toString(), stringindex, (dest?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), forcecopy.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByKey(resb: COpaquePointer?, key: Pcstr, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetUtf8StringByKey((resb?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), forcecopy.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetVersion(resb: COpaquePointer?, versioninfo: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresGetVersion((resb?.value ?: 0L).toString(), (versioninfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresHasNext(resourcebundle: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresHasNext((resourcebundle?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresOpen((packagename?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresOpenAvailableLocales((packagename?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresOpenDirect((packagename?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenU(packagename: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresOpenU((packagename?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresResetIterator(resourcebundle: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uresResetIterator((resourcebundle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptBreaksBetweenLetters(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: COpaquePointer?, capacity: Int, err: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetCode((nameorabbrorlocale?.value ?: 0L).toString(), (fillin?.value ?: 0L).toString(), capacity, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetName(scriptcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetSampleString(script: UScriptCode, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetSampleString(script, (dest?.value ?: 0L).toString(), capacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScript(codepoint: Int, err: COpaquePointer?): UScriptCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetScript(codepoint, (err?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScriptExtensions(c: Int, scripts: COpaquePointer?, capacity: Int, errorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetScriptExtensions(c, (scripts?.value ?: 0L).toString(), capacity, (errorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetShortName(scriptcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptGetUsage(script) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptHasScript(c, sc) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptIsCased(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscriptIsRightToLeft(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchClose(searchiter: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchClose((searchiter?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchFirst(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchFirst((strsrch?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchFollowing(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchFollowing((strsrch?.value ?: 0L).toString(), position, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute): USearchAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetAttribute((strsrch?.value ?: 0L).toString(), attribute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetBreakIterator(strsrch: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetBreakIterator((strsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetCollator(strsrch: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetCollator((strsrch?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedLength(strsrch: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetMatchedLength((strsrch?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedStart(strsrch: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetMatchedStart((strsrch?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedText(strsrch: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetMatchedText((strsrch?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetOffset(strsrch: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetOffset((strsrch?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetPattern(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetPattern((strsrch?.value ?: 0L).toString(), (length?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetText(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchGetText((strsrch?.value ?: 0L).toString(), (length?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchLast(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchLast((strsrch?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchNext(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchNext((strsrch?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpen(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, locale: Pcstr, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchOpen((pattern?.value ?: 0L).toString(), patternlength, (text?.value ?: 0L).toString(), textlength, (locale?.value ?: 0L).toString(), (breakiter?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpenFromCollator(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, collator: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchOpenFromCollator((pattern?.value ?: 0L).toString(), patternlength, (text?.value ?: 0L).toString(), textlength, (collator?.value ?: 0L).toString(), (breakiter?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPreceding(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchPreceding((strsrch?.value ?: 0L).toString(), position, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPrevious(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchPrevious((strsrch?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchReset(strsrch: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchReset((strsrch?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute, value: USearchAttributeValue, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetAttribute((strsrch?.value ?: 0L).toString(), attribute, value, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetBreakIterator(strsrch: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetBreakIterator((strsrch?.value ?: 0L).toString(), (breakiter?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetCollator(strsrch: COpaquePointer?, collator: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetCollator((strsrch?.value ?: 0L).toString(), (collator?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetOffset(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetOffset((strsrch?.value ?: 0L).toString(), position, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetPattern(strsrch: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetPattern((strsrch?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetText(strsrch: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearchSetText((strsrch?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), textlength, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAdd(set: COpaquePointer?, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetAdd((set?.value ?: 0L).toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAll(set: COpaquePointer?, additionalset: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetAddAll((set?.value ?: 0L).toString(), (additionalset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetAddAllCodePoints((set?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddRange(set: COpaquePointer?, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetAddRange((set?.value ?: 0L).toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetAddString((set?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyIntPropertyValue(set: COpaquePointer?, prop: UProperty, value: Int, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetApplyIntPropertyValue((set?.value ?: 0L).toString(), prop, value, (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyPattern(set: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, options: UInt, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetApplyPattern((set?.value ?: 0L).toString(), (pattern?.value ?: 0L).toString(), patternlength, options.toInt(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetApplyPropertyAlias(set: COpaquePointer?, prop: COpaquePointer?, proplength: Int, value: COpaquePointer?, valuelength: Int, ec: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetApplyPropertyAlias((set?.value ?: 0L).toString(), (prop?.value ?: 0L).toString(), proplength, (value?.value ?: 0L).toString(), valuelength, (ec?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCharAt(set: COpaquePointer?, charindex: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetCharAt((set?.value ?: 0L).toString(), charindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClear(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetClear((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetClone(set: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetClone((set?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetCloneAsThawed(set: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetCloneAsThawed((set?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClose(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetClose((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCloseOver(set: COpaquePointer?, attributes: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetCloseOver((set?.value ?: 0L).toString(), attributes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCompact(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetCompact((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplement(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetComplement((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplementAll(set: COpaquePointer?, complement: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetComplementAll((set?.value ?: 0L).toString(), (complement?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetContains(set: COpaquePointer?, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContains((set?.value ?: 0L).toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAll(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsAll((set1?.value ?: 0L).toString(), (set2?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsAllCodePoints((set?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strlen) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsNone(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsNone((set1?.value ?: 0L).toString(), (set2?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsRange(set: COpaquePointer?, start: Int, end: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsRange((set?.value ?: 0L).toString(), start, end) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsSome(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsSome((set1?.value ?: 0L).toString(), (set2?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetContainsString((set?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strlen) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetEquals(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetEquals((set1?.value ?: 0L).toString(), (set2?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetFreeze(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetFreeze((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetGetItem(set: COpaquePointer?, itemindex: Int, start: COpaquePointer?, end: COpaquePointer?, str: COpaquePointer?, strcapacity: Int, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetGetItem((set?.value ?: 0L).toString(), itemindex, (start?.value ?: 0L).toString(), (end?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strcapacity, (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetItemCount(set: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetGetItemCount((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRange(set: COpaquePointer?, rangeindex: Int, pstart: COpaquePointer?, pend: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetGetSerializedRange((set?.value ?: 0L).toString(), rangeindex, (pstart?.value ?: 0L).toString(), (pend?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRangeCount(set: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetGetSerializedRangeCount((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedSet(fillset: COpaquePointer?, src: COpaquePointer?, srclength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetGetSerializedSet((fillset?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIndexOf(set: COpaquePointer?, c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetIndexOf((set?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsEmpty(set: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetIsEmpty((set?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsFrozen(set: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetIsFrozen((set?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpen(start: Int, end: Int): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetOpen(start, end) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenEmpty(): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetOpenEmpty() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPattern(pattern: COpaquePointer?, patternlength: Int, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetOpenPattern((pattern?.value ?: 0L).toString(), patternlength, (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPatternOptions(pattern: COpaquePointer?, patternlength: Int, options: UInt, ec: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetOpenPatternOptions((pattern?.value ?: 0L).toString(), patternlength, options.toInt(), (ec?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRemove(set: COpaquePointer?, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRemove((set?.value ?: 0L).toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAll(set: COpaquePointer?, removeset: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRemoveAll((set?.value ?: 0L).toString(), (removeset?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAllStrings(set: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRemoveAllStrings((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveRange(set: COpaquePointer?, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRemoveRange((set?.value ?: 0L).toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRemoveString((set?.value ?: 0L).toString(), (str?.value ?: 0L).toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetResemblesPattern(pattern: COpaquePointer?, patternlength: Int, pos: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetResemblesPattern((pattern?.value ?: 0L).toString(), patternlength, pos) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRetain(set: COpaquePointer?, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRetain((set?.value ?: 0L).toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRetainAll(set: COpaquePointer?, retain: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetRetainAll((set?.value ?: 0L).toString(), (retain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSerialize(set: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSerialize((set?.value ?: 0L).toString(), (dest?.value ?: 0L).toString(), destcapacity, (perrorcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSerializedContains(set: COpaquePointer?, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSerializedContains((set?.value ?: 0L).toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSet(set: COpaquePointer?, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSet((set?.value ?: 0L).toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSetSerializedToOne(fillset: COpaquePointer?, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSetSerializedToOne((fillset?.value ?: 0L).toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSize(set: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSize((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpan(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSpan((set?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBack(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSpanBack((set?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBackUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSpanBackUtf8((set?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetSpanUtf8((set?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetToPattern(set: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, escapeunprintable: Byte, ec: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usetToPattern((set?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), resultcapacity, escapeunprintable.toInt(), (ec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusable(sc: COpaquePointer?, id1: COpaquePointer?, length1: Int, id2: COpaquePointer?, length2: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofAreConfusable((sc?.value ?: 0L).toString(), (id1?.value ?: 0L).toString(), length1, (id2?.value ?: 0L).toString(), length2, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusableUtf8(sc: COpaquePointer?, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofAreConfusableUtf8((sc?.value ?: 0L).toString(), (id1?.value ?: 0L).toString(), length1, (id2?.value ?: 0L).toString(), length2, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck(sc: COpaquePointer?, id: COpaquePointer?, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofCheck((sc?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), length, (position?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2(sc: COpaquePointer?, id: COpaquePointer?, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofCheck2((sc?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), length, (checkresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2Utf8(sc: COpaquePointer?, id: Pcstr, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofCheck2Utf8((sc?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), length, (checkresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheckUtf8(sc: COpaquePointer?, id: Pcstr, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofCheckUtf8((sc?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), length, (position?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClone(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofClone((sc?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClose(sc: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofClose((sc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofCloseCheckResult(checkresult: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofCloseCheckResult((checkresult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofGetAllowedChars(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetAllowedChars((sc?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetAllowedLocales(sc: COpaquePointer?, status: COpaquePointer?): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetAllowedLocales((sc?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultChecks(checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetCheckResultChecks((checkresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultNumerics(checkresult: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetCheckResultNumerics((checkresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: COpaquePointer?, status: COpaquePointer?): URestrictionLevel =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetCheckResultRestrictionLevel((checkresult?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetChecks(sc: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetChecks((sc?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetInclusionSet(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetInclusionSet((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRecommendedSet(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetRecommendedSet((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRestrictionLevel(sc: COpaquePointer?): URestrictionLevel =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetRestrictionLevel((sc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeleton(sc: COpaquePointer?, type: UInt, id: COpaquePointer?, length: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetSkeleton((sc?.value ?: 0L).toString(), type.toInt(), (id?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeletonUtf8(sc: COpaquePointer?, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofGetSkeletonUtf8((sc?.value ?: 0L).toString(), type.toInt(), (id?.value ?: 0L).toString(), length, (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpen(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofOpen((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenCheckResult(status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofOpenCheckResult((status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSerialized(data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofOpenFromSerialized((data?.value ?: 0L).toString(), length, (pactuallength?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: COpaquePointer?, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofOpenFromSource((confusables?.value ?: 0L).toString(), confusableslen, (confusableswholescript?.value ?: 0L).toString(), confusableswholescriptlen, (errtype?.value ?: 0L).toString(), (pe?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSerialize(sc: COpaquePointer?, data: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofSerialize((sc?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), capacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSetAllowedChars(sc: COpaquePointer?, chars: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofSetAllowedChars((sc?.value ?: 0L).toString(), (chars?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetAllowedLocales(sc: COpaquePointer?, localeslist: Pcstr, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofSetAllowedLocales((sc?.value ?: 0L).toString(), (localeslist?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetChecks(sc: COpaquePointer?, checks: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofSetChecks((sc?.value ?: 0L).toString(), checks, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetRestrictionLevel(sc: COpaquePointer?, restrictionlevel: URestrictionLevel) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoofSetRestrictionLevel((sc?.value ?: 0L).toString(), restrictionlevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepClose(profile: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprepClose((profile?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprepOpen((path?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprepOpenByType(type, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepPrepare(prep: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destcapacity: Int, options: Int, parseerror: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprepPrepare((prep?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), srclength, (dest?.value ?: 0L).toString(), destcapacity, options, (parseerror?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextChar32At(ut: COpaquePointer?, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextChar32At((ut?.value ?: 0L).toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClone(dest: COpaquePointer?, src: COpaquePointer?, deep: Byte, readonly: Byte, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextClone((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), deep.toInt(), readonly.toInt(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClose(ut: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextClose((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextCopy(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextCopy((ut?.value ?: 0L).toString(), nativestart.toString(), nativelimit.toString(), destindex.toString(), move.toInt(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextCurrent32(ut: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextCurrent32((ut?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextEquals(a: COpaquePointer?, b: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextEquals((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextExtract(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextExtract((ut?.value ?: 0L).toString(), nativestart.toString(), nativelimit.toString(), (dest?.value ?: 0L).toString(), destcapacity, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextFreeze(ut: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextFreeze((ut?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextGetNativeIndex(ut: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextGetNativeIndex((ut?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextGetPreviousNativeIndex(ut: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextGetPreviousNativeIndex((ut?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextHasMetaData(ut: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextHasMetaData((ut?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsLengthExpensive(ut: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextIsLengthExpensive((ut?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsWritable(ut: COpaquePointer?): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextIsWritable((ut?.value ?: 0L).toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextMoveIndex32(ut: COpaquePointer?, delta: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextMoveIndex32((ut?.value ?: 0L).toString(), delta) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNativeLength(ut: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextNativeLength((ut?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32(ut: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextNext32((ut?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32From(ut: COpaquePointer?, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextNext32From((ut?.value ?: 0L).toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUchars(ut: COpaquePointer?, s: COpaquePointer?, length: Long, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextOpenUchars((ut?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length.toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUtf8(ut: COpaquePointer?, s: Pcstr, length: Long, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextOpenUtf8((ut?.value ?: 0L).toString(), (s?.value ?: 0L).toString(), length.toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32(ut: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextPrevious32((ut?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32From(ut: COpaquePointer?, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextPrevious32From((ut?.value ?: 0L).toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextReplace(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, replacementtext: COpaquePointer?, replacementlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextReplace((ut?.value ?: 0L).toString(), nativestart.toString(), nativelimit.toString(), (replacementtext?.value ?: 0L).toString(), replacementlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextSetNativeIndex(ut: COpaquePointer?, nativeindex: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextSetNativeIndex((ut?.value ?: 0L).toString(), nativeindex.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextSetup(ut: COpaquePointer?, extraspace: Int, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utextSetup((ut?.value ?: 0L).toString(), extraspace, (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8AppendCharSafeBody(s: COpaquePointer?, i: Int, length: Int, c: Int, piserror: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8AppendCharSafeBody((s?.value ?: 0L).toString(), i, length, c, (piserror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8Back1SafeBody(s: COpaquePointer?, start: Int, i: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8Back1SafeBody((s?.value ?: 0L).toString(), start, i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8NextCharSafeBody(s: COpaquePointer?, pi: COpaquePointer?, length: Int, c: Int, strict: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8NextCharSafeBody((s?.value ?: 0L).toString(), (pi?.value ?: 0L).toString(), length, c, strict.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8PrevCharSafeBody(s: COpaquePointer?, start: Int, pi: COpaquePointer?, c: Int, strict: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8PrevCharSafeBody((s?.value ?: 0L).toString(), start, (pi?.value ?: 0L).toString(), c, strict.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscaleFromInt64(othertime.toString(), timescale, (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscaleGetTimeScaleValue(timescale, value, (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscaleToInt64(universaltime.toString(), timescale, (status?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceFormat((outbuf?.value ?: 0L).toString(), capacity, indent, (fmt?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceFunctionName(fnnumber) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceGetFunctions(context: COpaquePointer?, e: COpaquePointer?, x: COpaquePointer?, d: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceGetFunctions((context?.value ?: 0L).toString(), (e?.value ?: 0L).toString(), (x?.value ?: 0L).toString(), (d?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceGetLevel(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceGetLevel() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceSetFunctions(context: COpaquePointer?, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceSetFunctions((context?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceSetLevel(tracelevel: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceSetLevel(tracelevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utraceVformat((outbuf?.value ?: 0L).toString(), capacity, indent, (fmt?.value ?: 0L).toString(), (args?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClone(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransClone((trans?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClose(trans: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransClose((trans?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransCountAvailableIds(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransCountAvailableIds() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetSourceSet(trans: COpaquePointer?, ignorefilter: Byte, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransGetSourceSet((trans?.value ?: 0L).toString(), ignorefilter.toInt(), (fillin?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetUnicodeId(trans: COpaquePointer?, resultlength: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransGetUnicodeId((trans?.value ?: 0L).toString(), (resultlength?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenIds(perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransOpenIds((perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenInverse(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransOpenInverse((trans?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenU(id: COpaquePointer?, idlength: Int, dir: UTransDirection, rules: COpaquePointer?, ruleslength: Int, parseerror: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransOpenU((id?.value ?: 0L).toString(), idlength, dir, (rules?.value ?: 0L).toString(), ruleslength, (parseerror?.value ?: 0L).toString(), (perrorcode?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransRegister(adoptedtrans: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransRegister((adoptedtrans?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransSetFilter(trans: COpaquePointer?, filterpattern: COpaquePointer?, filterpatternlen: Int, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransSetFilter((trans?.value ?: 0L).toString(), (filterpattern?.value ?: 0L).toString(), filterpatternlen, (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransToRules(trans: COpaquePointer?, escapeunprintable: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransToRules((trans?.value ?: 0L).toString(), escapeunprintable.toInt(), (result?.value ?: 0L).toString(), resultlength, (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransTrans(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransTrans((trans?.value ?: 0L).toString(), (rep?.value ?: 0L).toString(), (repfunc?.value ?: 0L).toString(), start, (limit?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncremental(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, pos: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransTransIncremental((trans?.value ?: 0L).toString(), (rep?.value ?: 0L).toString(), (repfunc?.value ?: 0L).toString(), (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncrementalUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, pos: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransTransIncrementalUchars((trans?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (textlength?.value ?: 0L).toString(), textcapacity, (pos?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransTransUchars((trans?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (textlength?.value ?: 0L).toString(), textcapacity, start, (limit?.value ?: 0L).toString(), (status?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransUnregisterId(id: COpaquePointer?, idlength: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utransUnregisterId((id?.value ?: 0L).toString(), idlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
