@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Abc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EtoOptions
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

private val windowsWin32GlobalizationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun adjustCalendarDate(lpcaldatetime: MutPtr<Caldatetime>, calunit: CaldatetimeDateunit, amount: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationAdjustCalendarDate(lpcaldatetime.rawAddress.toString(), calunit, amount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr<Byte>, cchcount1: Int, lpstring2: ConstPtr<Byte>, cchcount2: Int): ComparestringResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationCompareStringA(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, lparam: Lparam): ComparestringResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationCompareStringEx(lplocalename.rawAddress.toString(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2, lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationCompareStringOrdinal(lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2, bignorecase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationCompareStringW(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress.toString(), cchcount1, lpstring2.rawAddress.toString(), cchcount2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr<Caldatetime>, lpsystime: MutPtr<Systemtime>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(lpcaldatetime.rawAddress.toString(), lpsystime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertDefaultLocale(locale: UInt): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationConvertDefaultLocale(locale.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr<Systemtime>, calid: UInt, lpcaldatetime: MutPtr<Caldatetime>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(lpsystime.rawAddress.toString(), calid.toInt(), lpcaldatetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumCalendarInfoA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumCalendarInfoExA(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(0L.toString(), lplocalename.rawAddress.toString(), calendar.toInt(), lpreserved.rawAddress.toString(), caltype.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumCalendarInfoExW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumCalendarInfoW(0L.toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumDateFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumDateFormatsExA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumDateFormatsExEx(0L.toString(), lplocalename.rawAddress.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumDateFormatsExW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumDateFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(0L.toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemCodePagesA(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemCodePagesW(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemGeoID(geoclass.toInt(), parentgeoid, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemGeoNames(geoclass.toInt(), 0L.toString(), data.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemLocalesA(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemLocalesEx(0L.toString(), dwflags.toInt(), lparam.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumSystemLocalesW(0L.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumTimeFormatsA(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumTimeFormatsEx(0L.toString(), lplocalename.rawAddress.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumTimeFormatsW(0L.toString(), locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumUILanguagesA(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationEnumUILanguagesW(0L.toString(), dwflags.toInt(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationFindNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, pcchfound.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationFindNLSStringEx(lplocalename.rawAddress.toString(), dwfindnlsstringflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, pcchfound.rawAddress.toString(), lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), sorthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationFindStringOrdinal(dwfindstringordinalflags.toInt(), lpstringsource.rawAddress.toString(), cchsource, lpstringvalue.rawAddress.toString(), cchvalue, bignorecase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationFoldStringA(dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationFoldStringW(dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getACP(): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetACP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr<Cpinfo>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCPInfo(codepage.toInt(), lpcpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexa>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCPInfoExA(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexw>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCPInfoExW(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr<Caldatetime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(lpszlocale.rawAddress.toString(), dwflags.toInt(), lpcaldatetime.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCalendarInfoEx(lplocalename.rawAddress.toString(), calendar.toInt(), lpreserved.rawAddress.toString(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString(), cchdata, lpvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr<Caldatetime>, lpcalmaxdatetime: MutPtr<Caldatetime>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(calendar.toInt(), lpcalmindatetime.rawAddress.toString(), lpcalmaxdatetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Currencyfmta>, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCurrencyFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCurrencyFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetCurrencyFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpcurrencystr.rawAddress.toString(), cchcurrency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDateFormatA(locale.toInt(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDateFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate, lpcalendar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDateFormatW(locale.toInt(), dwflags.toInt(), lpdate.rawAddress.toString(), lpformat.rawAddress.toString(), lpdatestr.rawAddress.toString(), cchdate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr<Double>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(pszlanguage.rawAddress.toString(), pszlanguageslist.rawAddress.toString(), wchlistdelimiter.toInt(), pclosestdistance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDurationFormat(locale.toInt(), dwflags.toInt(), lpduration.rawAddress.toString(), ullduration.toString(), lpformat.rawAddress.toString(), lpdurationstr.rawAddress.toString(), cchduration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetDurationFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpduration.rawAddress.toString(), ullduration.toString(), lpformat.rawAddress.toString(), lpdurationstr.rawAddress.toString(), cchduration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr<Filemuiinfo>, pcbfilemuiinfo: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetFileMUIInfo(dwflags.toInt(), pcwszfilepath.rawAddress.toString(), pfilemuiinfo.rawAddress.toString(), pcbfilemuiinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr<UInt>, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr<UInt>, pululenumerator: MutPtr<ULong>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetFileMUIPath(dwflags.toInt(), pcwszfilepath.rawAddress.toString(), pwszlanguage.rawAddress.toString(), pcchlanguage.rawAddress.toString(), pwszfilemuipath.rawAddress.toString(), pcchfilemuipath.rawAddress.toString(), pululenumerator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetGeoInfoA(location, geotype, lpgeodata.rawAddress.toString(), cchdata, langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetGeoInfoEx(location.rawAddress.toString(), geotype, geodata.rawAddress.toString(), geodatacount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetGeoInfoW(location, geotype, lpgeodata.rawAddress.toString(), cchdata, langid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetLocaleInfoEx(lplocalename.rawAddress.toString(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString(), cchdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr<Nlsversioninfo>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetNLSVersion(function.toInt(), locale.toInt(), lpversioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr<Nlsversioninfoex>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetNLSVersionEx(function.toInt(), lplocalename.rawAddress.toString(), lpversioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Numberfmta>, lpnumberstr: Pstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetNumberFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetNumberFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetNumberFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress.toString(), lpformat.rawAddress.toString(), lpnumberstr.rawAddress.toString(), cchnumber) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOEMCP(): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetOEMCP() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetStringScripts(dwflags.toInt(), lpstring.rawAddress.toString(), cchstring, lpscripts.rawAddress.toString(), cchscripts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetStringTypeA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetStringTypeExA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetStringTypeExW(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetStringTypeW(dwinfotype.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpchartype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLCID(): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetSystemDefaultLCID() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLangID(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetSystemDefaultLangID() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(lplocalename.rawAddress.toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDefaultUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharset(hdc: Hdc): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetTextCharset(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr<Fontsignature>, dwflags: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetTextCharsetInfo(hdc.rawAddress.toString(), lpsig.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadLocale(): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetThreadLocale() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetThreadUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetTimeFormatA(locale.toInt(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetTimeFormatEx(lplocalename.rawAddress.toString(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetTimeFormatW(locale.toInt(), dwflags.toInt(), lptime.rawAddress.toString(), lpformat.rawAddress.toString(), lptimestr.rawAddress.toString(), cchtime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr<UInt>, pattributes: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUILanguageInfo(dwflags.toInt(), pwmszlanguage.rawAddress.toString(), pwszfallbacklanguages.rawAddress.toString(), pcchfallbacklanguages.rawAddress.toString(), pattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserDefaultGeoName(geoname.rawAddress.toString(), geonamecount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLCID(): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserDefaultLCID() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLangID(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserDefaultLangID() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(lplocalename.rawAddress.toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserDefaultUILanguage(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserDefaultUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserGeoID(geoclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress.toString(), pwszlanguagesbuffer.rawAddress.toString(), pcchlanguagesbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIdnToAscii(dwflags.toInt(), lpunicodecharstr.rawAddress.toString(), cchunicodechar, lpasciicharstr.rawAddress.toString(), cchasciichar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIdnToNameprepUnicode(dwflags.toInt(), lpunicodecharstr.rawAddress.toString(), cchunicodechar, lpnameprepcharstr.rawAddress.toString(), cchnameprepchar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIdnToUnicode(dwflags.toInt(), lpasciicharstr.rawAddress.toString(), cchasciichar, lpunicodecharstr.rawAddress.toString(), cchunicodechar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage.toInt(), testchar.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr<Nlsversioninfo>, lpstring: Pcwstr, cchstr: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsNLSDefinedString(function.toInt(), dwflags.toInt(), lpversioninformation.rawAddress.toString(), lpstring.rawAddress.toString(), cchstr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsNormalizedString(normform, lpstring.rawAddress.toString(), cwlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTextUnicode(lpv: ConstPtr<CVoid>, isize: Int, lpiresult: MutPtr<IsTextUnicodeResult>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsTextUnicode(lpv.rawAddress.toString(), isize, lpiresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidCodePage(codepage: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsValidCodePage(codepage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsValidLocale(locale.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsValidLocaleName(lplocalename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr<Nlsversioninfoex>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsValidNLSVersion(function.toInt(), lplocalename.rawAddress.toString(), lpversioninformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationIsWellFormedTag(psztag.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLCIDToLocaleName(locale.toInt(), lpname.rawAddress.toString(), cchname, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLCMapStringA(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLCMapStringEx(lplocalename.rawAddress.toString(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest, lpversioninformation.rawAddress.toString(), lpreserved.rawAddress.toString(), sorthandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLCMapStringW(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLocaleNameToLCID(lpname.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingDoAction(pbag: MutPtr<MappingPropertyBag>, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMappingDoAction(pbag.rawAddress.toString(), dwrangeindex.toInt(), pszactionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreePropertyBag(pbag: ConstPtr<MappingPropertyBag>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMappingFreePropertyBag(pbag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingFreeServices(pserviceinfo: ConstPtr<MappingServiceInfo>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMappingFreeServices(pserviceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingGetServices(poptions: ConstPtr<MappingEnumOptions>, prgservices: MutPtr<MutPtr<MappingServiceInfo>>, pdwservicescount: MutPtr<UInt>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMappingGetServices(poptions.rawAddress.toString(), prgservices.rawAddress.toString(), pdwservicescount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mappingRecognizeText(pserviceinfo: ConstPtr<MappingServiceInfo>, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr<MappingOptions>, pbag: MutPtr<MappingPropertyBag>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMappingRecognizeText(pserviceinfo.rawAddress.toString(), psztext.rawAddress.toString(), dwlength.toInt(), dwindex.toInt(), poptions.rawAddress.toString(), pbag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationMultiByteToWideChar(codepage.toInt(), dwflags.toInt(), lpmultibytestr.rawAddress.toString(), cbmultibyte, lpwidecharstr.rawAddress.toString(), cchwidechar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationNormalizeString(normform, lpsrcstring.rawAddress.toString(), cwsrclength, lpdststring.rawAddress.toString(), cwdstlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationNotifyUILanguageChange(dwflags.toInt(), pcwstrnewlanguage.rawAddress.toString(), pcwstrpreviouslanguage.rawAddress.toString(), dwreserved.toInt(), pdwstatusrtrn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationResolveLocaleName(lpnametoresolve.rawAddress.toString(), lplocalename.rawAddress.toString(), cchlocalename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(snapshot.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scriptApplyDigitSubstitution(psds: ConstPtr<ScriptDigitsubstitute>, psc: MutPtr<ScriptControl>, pss: MutPtr<ScriptState>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(psds.rawAddress.toString(), psc.rawAddress.toString(), pss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptApplyLogicalWidth(pidx: ConstPtr<Int>, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pabc: MutPtr<Abc>, pijustify: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(pidx.rawAddress.toString(), cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), pabc.rawAddress.toString(), pijustify.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr<ScriptAnalysis>, psla: MutPtr<ScriptLogattr>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptBreak(pwcchars.rawAddress.toString(), cchars, psa.rawAddress.toString(), psla.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pix: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), pix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, tmheight: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptCacheGetHeight(hdc.rawAddress.toString(), psc.rawAddress.toString(), tmheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptFreeCache(psc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptFreeCache(psc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetCMap(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr<UShort>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetCMap(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwcinchars.rawAddress.toString(), cchars, dwflags.toInt(), pwoutglyphs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr<UShort>, pcalternates: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toInt(), cmaxalternates, palternateglyphs.rawAddress.toString(), pcalternates.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), cmaxtags, pfeaturetags.rawAddress.toString(), pctags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), cmaxtags, plangsystags.rawAddress.toString(), pctags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, sfp: MutPtr<ScriptFontproperties>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetFontProperties(hdc.rawAddress.toString(), psc.rawAddress.toString(), sfp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, cmaxtags: Int, pscripttags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetFontScriptTags(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), cmaxtags, pscripttags.rawAddress.toString(), pctags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, wglyph: UShort, pabc: MutPtr<Abc>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(hdc.rawAddress.toString(), psc.rawAddress.toString(), wglyph.toInt(), pabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetLogicalWidths(psa: ConstPtr<ScriptAnalysis>, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr<Int>, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, pidx: ConstPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetLogicalWidths(psa.rawAddress.toString(), cchars, cglyphs, piglyphwidth.rawAddress.toString(), pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), pidx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptGetProperties(ppsp: MutPtr<MutPtr<MutPtr<ScriptProperties>>>, pinumscripts: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptGetProperties(ppsp.rawAddress.toString(), pinumscripts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptIsComplex(pwcinchars.rawAddress.toString(), cinchars, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pcitems: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptItemize(pwcinchars.rawAddress.toString(), cinchars, cmaxitems, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pitems.rawAddress.toString(), pcitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pscripttags: MutPtr<UInt>, pcitems: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptItemizeOpenType(pwcinchars.rawAddress.toString(), cinchars, cmaxitems, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pitems.rawAddress.toString(), pscripttags.rawAddress.toString(), pcitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptJustify(psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptJustify(psva.rawAddress.toString(), piadvance.rawAddress.toString(), cglyphs, idx, iminkashida, pijustify.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptLayout(cruns: Int, pblevel: ConstPtr<UByte>, pivisualtological: MutPtr<Int>, pilogicaltovisual: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptLayout(cruns, pblevel.rawAddress.toString(), pivisualtological.rawAddress.toString(), pilogicaltovisual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlace(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwglyphs: ConstPtr<UShort>, cglyphs: Int, psva: ConstPtr<ScriptVisattr>, psa: MutPtr<ScriptAnalysis>, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptPlace(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwglyphs.rawAddress.toString(), cglyphs, psva.rawAddress.toString(), psa.rawAddress.toString(), piadvance.rawAddress.toString(), pgoffset.rawAddress.toString(), pabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr<UShort>, pcharprops: ConstPtr<ScriptCharprop>, cchars: Int, pwglyphs: ConstPtr<UShort>, pglyphprops: ConstPtr<ScriptGlyphprop>, cglyphs: Int, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptPlaceOpenType(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress.toString(), rprangeproperties.rawAddress.toString(), cranges, pwcchars.rawAddress.toString(), pwlogclust.rawAddress.toString(), pcharprops.rawAddress.toString(), cchars, pwglyphs.rawAddress.toString(), pglyphprops.rawAddress.toString(), cglyphs, piadvance.rawAddress.toString(), pgoffset.rawAddress.toString(), pabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr<Int>, poutgoffset: MutPtr<Goffset>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr<ScriptDigitsubstitute>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(locale.toInt(), psds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShape(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr<ScriptAnalysis>, pwoutglyphs: MutPtr<UShort>, pwlogclust: MutPtr<UShort>, psva: MutPtr<ScriptVisattr>, pcglyphs: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptShape(hdc.rawAddress.toString(), psc.rawAddress.toString(), pwcchars.rawAddress.toString(), cchars, cmaxglyphs, psa.rawAddress.toString(), pwoutglyphs.rawAddress.toString(), pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), pcglyphs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr<UShort>, pcharprops: MutPtr<ScriptCharprop>, pwoutglyphs: MutPtr<UShort>, poutglyphprops: MutPtr<ScriptGlyphprop>, pcglyphs: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptShapeOpenType(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress.toString(), rprangeproperties.rawAddress.toString(), cranges, pwcchars.rawAddress.toString(), cchars, cmaxglyphs, pwlogclust.rawAddress.toString(), pcharprops.rawAddress.toString(), pwoutglyphs.rawAddress.toString(), poutglyphprops.rawAddress.toString(), pcglyphs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr<CVoid>, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pidx: ConstPtr<Int>, ptabdef: ConstPtr<ScriptTabdef>, pbinclass: ConstPtr<UByte>, pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringAnalyse(hdc.rawAddress.toString(), pstring.rawAddress.toString(), cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, pscontrol.rawAddress.toString(), psstate.rawAddress.toString(), pidx.rawAddress.toString(), ptabdef.rawAddress.toString(), pbinclass.rawAddress.toString(), pssa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringCPtoX(ssa: ConstPtr<CVoid>, icp: Int, ftrailing: Bool, px: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringCPtoX(ssa.rawAddress.toString(), icp, ftrailing, px.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringFree(pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringFree(pssa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetLogicalWidths(ssa: ConstPtr<CVoid>, pidx: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(ssa.rawAddress.toString(), pidx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringGetOrder(ssa: ConstPtr<CVoid>, puorder: MutPtr<UInt>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringGetOrder(ssa.rawAddress.toString(), puorder.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringOut(ssa: ConstPtr<CVoid>, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr<Rect>, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringOut(ssa.rawAddress.toString(), ix, iy, uoptions.toInt(), prc.rawAddress.toString(), iminsel, imaxsel, fdisabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringValidate(ssa: ConstPtr<CVoid>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringValidate(ssa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringXtoCP(ssa: ConstPtr<CVoid>, ix: Int, pich: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringXtoCP(ssa.rawAddress.toString(), ix, pich.rawAddress.toString(), pitrailing.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPLogAttr(ssa: ConstPtr<CVoid>): MutPtr<ScriptLogattr> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringPLogAttr(ssa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPSize(ssa: ConstPtr<CVoid>): MutPtr<Size> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringPSize(ssa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptStringPcOutChars(ssa: ConstPtr<CVoid>): MutPtr<Int> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptStringPcOutChars(ssa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr<UShort>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(hdc.rawAddress.toString(), psc.rawAddress.toString(), psa.rawAddress.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toInt(), pwoutglyphid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptTextOut(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr<Rect>, psa: ConstPtr<ScriptAnalysis>, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr<UShort>, cglyphs: Int, piadvance: ConstPtr<Int>, pijustify: ConstPtr<Int>, pgoffset: ConstPtr<Goffset>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptTextOut(hdc.rawAddress.toString(), psc.rawAddress.toString(), x, y, fuoptions.toInt(), lprc.rawAddress.toString(), psa.rawAddress.toString(), pwcreserved.rawAddress.toString(), ireserved, pwglyphs.rawAddress.toString(), cglyphs, piadvance.rawAddress.toString(), pijustify.rawAddress.toString(), pgoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, picp: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationScriptXtoCP(ix, cchars, cglyphs, pwlogclust.rawAddress.toString(), psva.rawAddress.toString(), piadvance.rawAddress.toString(), psa.rawAddress.toString(), picp.rawAddress.toString(), pitrailing.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress.toString(), pulnumlanguages.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadLocale(locale: UInt): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetThreadLocale(locale.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress.toString(), pulnumlanguages.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr<UInt>, snapshot: MutPtr<Hsaveduilanguages>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(flags.toInt(), languages.rawAddress.toString(), numlanguagesset.rawAddress.toString(), snapshot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadUILanguage(langid: UShort): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetThreadUILanguage(langid.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoID(geoid: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetUserGeoID(geoid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationSetUserGeoName(geoname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateCharsetInfo(lpsrc: MutPtr<UInt>, lpcs: MutPtr<Charsetinfo>, dwflags: TranslateCharsetInfoFlags): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationTranslateCharsetInfo(lpsrc.rawAddress.toString(), lpcs.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUCallbackEscape(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSkip(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackStop(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFromUCallbackSubstitute(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(context.rawAddress.toString(), fromuargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, codepoint, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackEscape(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSkip(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackStop(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUCallbackStop(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToUCallbackSubstitute(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(context.rawAddress.toString(), touargs.rawAddress.toString(), codeunits.rawAddress.toString(), length, reason, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr<Caldatetime>): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(lpcaldatetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationVerifyScripts(dwflags.toInt(), lplocalescripts.rawAddress.toString(), cchlocalescripts, lptestscripts.rawAddress.toString(), cchtestscripts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr<Bool>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationWideCharToMultiByte(codepage.toInt(), dwflags.toInt(), lpwidecharstr.rawAddress.toString(), cchwidechar, lpmultibytestr.rawAddress.toString(), cbmultibyte, lpdefaultchar.rawAddress.toString(), lpuseddefaultchar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcatA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcatW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcmpA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcmpW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcmpiA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcmpiW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcpyA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcpyW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcpynA(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), imaxlength) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrcpynW(lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), imaxlength) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenA(lpstring: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrlenA(lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationLstrlenW(lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUcharsToChars(us: ConstPtr<UShort>, cs: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUUcharsToChars(us.rawAddress.toString(), cs.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uAustrcpy(dst: Pcstr, src: ConstPtr<UShort>): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUAustrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uAustrncpy(dst: Pcstr, src: ConstPtr<UShort>, n: Int): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUAustrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatclose(catd: MutPtr<UResourceBundle>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCatclose(catd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCatgets(catd: MutPtr<UResourceBundle>, setNum: Int, msgNum: Int, s: ConstPtr<UShort>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCatgets(catd.rawAddress.toString(), setNum, msgNum, s.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCatopen(name.rawAddress.toString(), locale.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharAge(c: Int, versionarray: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharAge(c, versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCharDigitValue(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharDigitValue(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharDirection(c: Int): UCharDirection =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharDirection(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharFromName(namechoice, name.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharMirror(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharMirror(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharName(code, namechoice, buffer.rawAddress.toString(), bufferlength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharType(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharType(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uCharsToUchars(cs: Pcstr, us: MutPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCharsToUchars(cs.rawAddress.toString(), us.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCleanup() {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uCountChar32(s: ConstPtr<UShort>, length: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUCountChar32(s.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uDigit(ch: Int, radix: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUDigit(ch, radix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr<UEnumCharNamesFn>, context: MutPtr<CVoid>, namechoice: UCharNameChoice, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUEnumCharNames(start, limit, fn.rawAddress.toString(), context.rawAddress.toString(), namechoice, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uEnumCharTypes(enumrange: MutPtr<UCharEnumTypeRange>, context: ConstPtr<CVoid>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUEnumCharTypes(enumrange.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUErrorName(code) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFoldCase(c: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUFoldCase(c, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUForDigit(digit, radix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUFormatMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUFormatMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, parseerror.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBidiPairedBracket(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetBinaryPropertySet(property, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetCombiningClass(c: Int): UByte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetCombiningClass(c) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetDataVersion(dataversionfillin: MutPtr<UByte>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetDataVersion(dataversionfillin.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetFcNfkcClosure(c: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetFcNfkcClosure(c, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPMap> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetIntPropertyMap(property, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetIntPropertyValue(c, which) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetNumericValue(c: Int): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetNumericValue(c) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetPropertyEnum(alias.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetPropertyName(property, namechoice) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetPropertyValueEnum(property, alias.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetPropertyValueName(property, value, namechoice) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uGetUnicodeVersion(versionarray: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetUnicodeVersion(versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uGetVersion(versionarray: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUGetVersion(versionarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUHasBinaryProperty(c, which) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uInit(status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUInit(status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uIsIdignorable(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsIdignorable(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdpart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsIdpart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIdstart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsIdstart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsIsocontrol(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsIsocontrol(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdpart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsJavaIdpart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaIdstart(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsJavaIdstart(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsMirrored(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsMirrored(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUalphabetic(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsUalphabetic(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUlowercase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsUlowercase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUuppercase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsUuppercase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsUwhiteSpace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsUwhiteSpace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsWhitespace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsWhitespace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalnum(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsalnum(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsalpha(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsalpha(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsbase(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsbase(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsblank(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsblank(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIscntrl(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIscntrl(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdefined(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsdefined(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsdigit(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsdigit(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsgraph(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsgraph(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIslower(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIslower(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsprint(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsprint(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIspunct(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIspunct(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsspace(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsspace(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIstitle(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIstitle(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsupper(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsupper(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uIsxdigit(c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUIsxdigit(c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, length: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), length, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemchr(s.rawAddress.toString(), c.toInt(), count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemchr32(s.rawAddress.toString(), c, count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmp(buf1: ConstPtr<UShort>, buf2: ConstPtr<UShort>, count: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemcmp(buf1.rawAddress.toString(), buf2.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, count: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemcpy(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemmove(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemrchr(s.rawAddress.toString(), c.toInt(), count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemrchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemrchr32(s.rawAddress.toString(), c, count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uMemset(dest: MutPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUMemset(dest.rawAddress.toString(), c.toInt(), count) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uParseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUParseMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUParseMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, parseerror.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uSetMemoryFunctions(context: ConstPtr<CVoid>, a: MutPtr<UMemAllocFn>, r: MutPtr<UMemReallocFn>, f: MutPtr<UMemFreeFn>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUSetMemoryFunctions(context.rawAddress.toString(), a.rawAddress.toString(), r.rawAddress.toString(), f.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uShapeArabic(source: ConstPtr<UShort>, sourcelength: Int, dest: MutPtr<UShort>, destsize: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUShapeArabic(source.rawAddress.toString(), sourcelength, dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCaseCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrCaseCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, codepointorder: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, codepointorder.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrCompareIter(iter1: MutPtr<UCharIterator>, iter2: MutPtr<UCharIterator>, codepointorder: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrCompareIter(iter1.rawAddress.toString(), iter2.rawAddress.toString(), codepointorder.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindFirst(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFindFirst(s.rawAddress.toString(), length, substring.rawAddress.toString(), sublength) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFindLast(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFindLast(s.rawAddress.toString(), length, substring.rawAddress.toString(), sublength) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFoldCase(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFoldCase(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromUtf32(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf32WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8Lenient(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrFromWcs(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcwstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrFromWcs(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrHasMoreChar32Than(s: ConstPtr<UShort>, length: Int, number: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(s.rawAddress.toString(), length, number) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToLower(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToLower(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, locale.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToTitle(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, titleiter: MutPtr<UBreakIterator>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToTitle(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, titleiter.rawAddress.toString(), locale.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToUtf32(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf32WithSub(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToUtf32WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToUtf8(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToUtf8WithSub(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, subchar, pnumsubstitutions.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToUpper(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToUpper(dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, locale.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pwstr =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrToWcs(dest.rawAddress.toString(), destcapacity, pdestlength.rawAddress.toString(), src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcat(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcat(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrchr(s.rawAddress.toString(), c.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrchr32(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrcspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrcspn(string.rawAddress.toString(), matchset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrlen(s: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrlen(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int, options: UInt): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n, options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncat(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrncat(dst.rawAddress.toString(), src.rawAddress.toString(), n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmp(ucs1: ConstPtr<UShort>, ucs2: ConstPtr<UShort>, n: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrncmp(ucs1.rawAddress.toString(), ucs2.rawAddress.toString(), n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(s1.rawAddress.toString(), s2.rawAddress.toString(), n) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrncpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrpbrk(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrpbrk(string.rawAddress.toString(), matchset.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrrchr(s.rawAddress.toString(), c.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrrchr32(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrrstr(s.rawAddress.toString(), substring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrspn(string.rawAddress.toString(), matchset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrstr(s.rawAddress.toString(), substring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uStrtokR(src: MutPtr<UShort>, delim: ConstPtr<UShort>, savestate: MutPtr<MutPtr<UShort>>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUStrtokR(src.rawAddress.toString(), delim.rawAddress.toString(), savestate.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTolower(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uTotitle(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUTotitle(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uToupper(c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrcpy(dst: MutPtr<UShort>, src: Pcstr): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUUastrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUastrncpy(dst: MutPtr<UShort>, src: Pcstr, n: Int): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUUastrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescape(src: Pcstr, dest: MutPtr<UShort>, destcapacity: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUUnescape(src.rawAddress.toString(), dest.rawAddress.toString(), destcapacity) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr<Int>, length: Int, context: MutPtr<CVoid>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUUnescapeAt(0L.toString(), offset.rawAddress.toString(), length, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVersionFromString(versionarray: MutPtr<UByte>, versionstring: Pcstr) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVersionFromString(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionFromUstring(versionarray: MutPtr<UByte>, versionstring: ConstPtr<UShort>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVersionFromUstring(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVersionToString(versionarray: ConstPtr<UByte>, versionstring: Pcstr) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVersionToString(versionarray.rawAddress.toString(), versionstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVformatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVformatMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, ap.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVformatMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, result.rawAddress.toString(), resultlength, parseerror.rawAddress.toString(), ap.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uVparseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVparseMessage(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, ap.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUVparseMessageWithError(locale.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, source.rawAddress.toString(), sourcelength, ap.rawAddress.toString(), parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiClose(pbidi: MutPtr<UBiDi>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiClose(pbidi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiCountParagraphs(pbidi: MutPtr<UBiDi>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiCountParagraphs(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiCountRuns(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiCountRuns(pbidi.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetBaseDirection(text: ConstPtr<UShort>, length: Int): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetBaseDirection(text.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetClassCallback(pbidi: MutPtr<UBiDi>, fn: MutPtr<UBiDiClassCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetClassCallback(pbidi.rawAddress.toString(), fn.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetCustomizedClass(pbidi: MutPtr<UBiDi>, c: Int): UCharDirection =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(pbidi.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetDirection(pbidi: ConstPtr<UBiDi>): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetDirection(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLength(pbidi: ConstPtr<UBiDi>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLength(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevelAt(pbidi: ConstPtr<UBiDi>, charindex: Int): UByte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLevelAt(pbidi.rawAddress.toString(), charindex) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLevels(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): MutPtr<UByte> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLevels(pbidi.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalIndex(pbidi: MutPtr<UBiDi>, visualindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(pbidi.rawAddress.toString(), visualindex, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetLogicalMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLogicalMap(pbidi.rawAddress.toString(), indexmap.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetLogicalRun(pbidi: ConstPtr<UBiDi>, logicalposition: Int, plogicallimit: MutPtr<Int>, plevel: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetLogicalRun(pbidi.rawAddress.toString(), logicalposition, plogicallimit.rawAddress.toString(), plevel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetParaLevel(pbidi: ConstPtr<UBiDi>): UByte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetParaLevel(pbidi.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraph(pbidi: ConstPtr<UBiDi>, charindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetParagraph(pbidi.rawAddress.toString(), charindex, pparastart.rawAddress.toString(), pparalimit.rawAddress.toString(), pparalevel.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetParagraphByIndex(pbidi: ConstPtr<UBiDi>, paraindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(pbidi.rawAddress.toString(), paraindex, pparastart.rawAddress.toString(), pparalimit.rawAddress.toString(), pparalevel.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetProcessedLength(pbidi: ConstPtr<UBiDi>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetProcessedLength(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingMode(pbidi: MutPtr<UBiDi>): UBiDiReorderingMode =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetReorderingMode(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetReorderingOptions(pbidi: MutPtr<UBiDi>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(pbidi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetResultLength(pbidi: ConstPtr<UBiDi>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetResultLength(pbidi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetText(pbidi: ConstPtr<UBiDi>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetText(pbidi.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualIndex(pbidi: MutPtr<UBiDi>, logicalindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetVisualIndex(pbidi.rawAddress.toString(), logicalindex, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiGetVisualMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetVisualMap(pbidi.rawAddress.toString(), indexmap.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiGetVisualRun(pbidi: MutPtr<UBiDi>, runindex: Int, plogicalstart: MutPtr<Int>, plength: MutPtr<Int>): UBiDiDirection =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiGetVisualRun(pbidi.rawAddress.toString(), runindex, plogicalstart.rawAddress.toString(), plength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiInvertMap(srcmap: ConstPtr<Int>, destmap: MutPtr<Int>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiInvertMap(srcmap.rawAddress.toString(), destmap.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiIsInverse(pbidi: MutPtr<UBiDi>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiIsInverse(pbidi.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr<UBiDi>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(pbidi.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpen(): MutPtr<UBiDi> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiOpen() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDi> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiOpenSized(maxlength, maxruncount, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiOrderParagraphsLtr(pbidi: MutPtr<UBiDi>, orderparagraphsltr: Byte) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(pbidi.rawAddress.toString(), orderparagraphsltr.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderLogical(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiReorderLogical(levels.rawAddress.toString(), length, indexmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiReorderVisual(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiReorderVisual(levels.rawAddress.toString(), length, indexmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetClassCallback(pbidi: MutPtr<UBiDi>, newfn: UBiDiClassCallback, newcontext: ConstPtr<CVoid>, oldfn: MutPtr<UBiDiClassCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetClassCallback(pbidi.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldfn.rawAddress.toString(), oldcontext.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetContext(pbidi: MutPtr<UBiDi>, prologue: ConstPtr<UShort>, prolength: Int, epilogue: ConstPtr<UShort>, epilength: Int, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetContext(pbidi.rawAddress.toString(), prologue.rawAddress.toString(), prolength, epilogue.rawAddress.toString(), epilength, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetInverse(pbidi: MutPtr<UBiDi>, isinverse: Byte) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetInverse(pbidi.rawAddress.toString(), isinverse.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetLine(pparabidi: ConstPtr<UBiDi>, start: Int, limit: Int, plinebidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetLine(pparabidi.rawAddress.toString(), start, limit, plinebidi.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetPara(pbidi: MutPtr<UBiDi>, text: ConstPtr<UShort>, length: Int, paralevel: UByte, embeddinglevels: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetPara(pbidi.rawAddress.toString(), text.rawAddress.toString(), length, paralevel.toInt(), embeddinglevels.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingMode(pbidi: MutPtr<UBiDi>, reorderingmode: UBiDiReorderingMode) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetReorderingMode(pbidi.rawAddress.toString(), reorderingmode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiSetReorderingOptions(pbidi: MutPtr<UBiDi>, reorderingoptions: UInt) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(pbidi.rawAddress.toString(), reorderingoptions.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubidiWriteReordered(pbidi: MutPtr<UBiDi>, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiWriteReordered(pbidi.rawAddress.toString(), dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubidiWriteReverse(src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbidiWriteReverse(src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destsize, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformClose(pbiditransform: MutPtr<UBiDiTransform>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbiditransformClose(pbiditransform.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubiditransformOpen(perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDiTransform> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbiditransformOpen(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubiditransformTransform(pbiditransform: MutPtr<UBiDiTransform>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr<UErrorCode>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbiditransformTransform(pbiditransform.rawAddress.toString(), src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destsize, inparalevel.toInt(), inorder, outparalevel.toInt(), outorder, domirroring, shapingoptions.toInt(), perrorcode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ublockGetCode(c: Int): UBlockCode =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUblockGetCode(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkClose(bi: MutPtr<UBreakIterator>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkClose(bi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkCurrent(bi: ConstPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkCurrent(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFirst(bi: MutPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkFirst(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkFollowing(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkFollowing(bi.rawAddress.toString(), offset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkGetAvailable(index) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetBinaryRules(bi: MutPtr<UBreakIterator>, binaryrules: MutPtr<UByte>, rulescapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkGetBinaryRules(bi.rawAddress.toString(), binaryrules.rawAddress.toString(), rulescapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetLocaleByType(bi: ConstPtr<UBreakIterator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkGetLocaleByType(bi.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatus(bi: MutPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkGetRuleStatus(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkGetRuleStatusVec(bi: MutPtr<UBreakIterator>, fillinvec: MutPtr<Int>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(bi.rawAddress.toString(), fillinvec.rawAddress.toString(), capacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkIsBoundary(bi: MutPtr<UBreakIterator>, offset: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkIsBoundary(bi.rawAddress.toString(), offset) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkLast(bi: MutPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkLast(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkNext(bi: MutPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkNext(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkOpen(type, locale.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenBinaryRules(binaryrules: ConstPtr<UByte>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(binaryrules.rawAddress.toString(), ruleslength, text.rawAddress.toString(), textlength, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkOpenRules(rules.rawAddress.toString(), ruleslength, text.rawAddress.toString(), textlength, parseerr.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPreceding(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkPreceding(bi.rawAddress.toString(), offset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkPrevious(bi: MutPtr<UBreakIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkPrevious(bi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkRefreshUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkRefreshUtext(bi.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSafeClone(bi: ConstPtr<UBreakIterator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkSafeClone(bi.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ubrkSetText(bi: MutPtr<UBreakIterator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkSetText(bi.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ubrkSetUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUbrkSetUtext(bi.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalAdd(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalAdd(cal.rawAddress.toString(), field, amount, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClear(calendar: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalClear(calendar.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClearField(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalClearField(cal.rawAddress.toString(), field)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalClone(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalClone(cal.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalClose(cal: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalClose(cal.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalEquivalentTo(cal1: ConstPtr<ConstPtr<CVoid>>, cal2: ConstPtr<ConstPtr<CVoid>>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalEquivalentTo(cal1.rawAddress.toString(), cal2.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGet(cal.rawAddress.toString(), field, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAttribute(cal: ConstPtr<ConstPtr<CVoid>>, attr: UCalendarAttribute): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetAttribute(cal.rawAddress.toString(), attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetAvailable(localeindex) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetCanonicalTimeZoneId(id: ConstPtr<UShort>, len: Int, result: MutPtr<UShort>, resultcapacity: Int, issystemid: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(id.rawAddress.toString(), len, result.rawAddress.toString(), resultcapacity, issystemid.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDstsavings(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetDstsavings(zoneid.rawAddress.toString(), ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDayOfWeekType(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): UCalendarWeekdayType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(cal.rawAddress.toString(), dayofweek, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetDefaultTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(result.rawAddress.toString(), resultcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetFieldDifference(cal: MutPtr<MutPtr<CVoid>>, target: Double, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetFieldDifference(cal.rawAddress.toString(), target, field, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetGregorianChange(cal: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetGregorianChange(cal.rawAddress.toString(), perrorcode.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetHostTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetHostTimeZone(result.rawAddress.toString(), resultcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLimit(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetLimit(cal.rawAddress.toString(), field, type, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetLocaleByType(cal: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetLocaleByType(cal.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetMillis(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetMillis(cal.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetNow(): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetNow() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTzdataVersion(status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetTzdataVersion(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneDisplayName(cal: ConstPtr<ConstPtr<CVoid>>, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(cal.rawAddress.toString(), type, locale.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneId(cal: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetTimeZoneId(cal.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr<UShort>, len: Int, region: Pcstr, id: MutPtr<UShort>, idcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(winid.rawAddress.toString(), len, region.rawAddress.toString(), id.rawAddress.toString(), idcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetTimeZoneTransitionDate(cal: ConstPtr<ConstPtr<CVoid>>, type: UTimeZoneTransitionType, transition: MutPtr<Double>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(cal.rawAddress.toString(), type, transition.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetType(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetType(cal.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWeekendTransition(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetWeekendTransition(cal.rawAddress.toString(), dayofweek, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalGetWindowsTimeZoneId(id: ConstPtr<UShort>, len: Int, winid: MutPtr<UShort>, winidcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(id.rawAddress.toString(), len, winid.rawAddress.toString(), winidcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalInDaylightTime(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalInDaylightTime(cal.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsSet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalIsSet(cal.rawAddress.toString(), field) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalIsWeekend(cal: ConstPtr<ConstPtr<CVoid>>, date: Double, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalIsWeekend(cal.rawAddress.toString(), date, status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpen(zoneid: ConstPtr<UShort>, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalOpen(zoneid.rawAddress.toString(), len, locale.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(country.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(zonetype, region.rawAddress.toString(), rawoffset.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalOpenTimeZones(ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalOpenTimeZones(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucalRoll(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalRoll(cal.rawAddress.toString(), field, amount, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSet(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, value: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSet(cal.rawAddress.toString(), field, value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetAttribute(cal: MutPtr<MutPtr<CVoid>>, attr: UCalendarAttribute, newvalue: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetAttribute(cal.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDate(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetDate(cal.rawAddress.toString(), year, month, date, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDateTime(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetDateTime(cal.rawAddress.toString(), year, month, date, hour, minute, second, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetDefaultTimeZone(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(zoneid.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetGregorianChange(cal: MutPtr<MutPtr<CVoid>>, date: Double, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetGregorianChange(cal.rawAddress.toString(), date, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetMillis(cal: MutPtr<MutPtr<CVoid>>, datetime: Double, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetMillis(cal.rawAddress.toString(), datetime, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucalSetTimeZone(cal: MutPtr<MutPtr<CVoid>>, zoneid: ConstPtr<UShort>, len: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcalSetTimeZone(cal.rawAddress.toString(), zoneid.rawAddress.toString(), len, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapClose(csm: MutPtr<UCaseMap>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapClose(csm.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapGetBreakIterator(csm: ConstPtr<UCaseMap>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(csm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetLocale(csm: ConstPtr<UCaseMap>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapGetLocale(csm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapGetOptions(csm: ConstPtr<UCaseMap>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapGetOptions(csm.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UCaseMap> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapOpen(locale.rawAddress.toString(), options.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapSetBreakIterator(csm: MutPtr<UCaseMap>, itertoadopt: MutPtr<UBreakIterator>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(csm.rawAddress.toString(), itertoadopt.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetLocale(csm: MutPtr<UCaseMap>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapSetLocale(csm.rawAddress.toString(), locale.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapSetOptions(csm: MutPtr<UCaseMap>, options: UInt, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapSetOptions(csm.rawAddress.toString(), options.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucasemapToTitle(csm: MutPtr<UCaseMap>, dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapToTitle(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8FoldCase(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToLower(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToTitle(csm: MutPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucasemapUtf8ToUpper(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(csm.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposClose(ucfpos: MutPtr<UConstrainedFieldPosition>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposClose(ucfpos.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainCategory(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposConstrainCategory(ucfpos.rawAddress.toString(), category, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposConstrainField(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposConstrainField(ucfpos.rawAddress.toString(), category, field, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetCategory(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposGetCategory(ucfpos.rawAddress.toString(), ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetField(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposGetField(ucfpos.rawAddress.toString(), ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposGetIndexes(ucfpos: ConstPtr<UConstrainedFieldPosition>, pstart: MutPtr<Int>, plimit: MutPtr<Int>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposGetIndexes(ucfpos.rawAddress.toString(), pstart.rawAddress.toString(), plimit.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposGetInt64IterationContext(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(ucfpos.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposMatchesField(ucfpos: ConstPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposMatchesField(ucfpos.rawAddress.toString(), category, field, ec.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposOpen(ec: MutPtr<UErrorCode>): MutPtr<UConstrainedFieldPosition> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposOpen(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucfposReset(ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposReset(ucfpos.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetInt64IterationContext(ucfpos: MutPtr<UConstrainedFieldPosition>, context: Long, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(ucfpos.rawAddress.toString(), context.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucfposSetState(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcfposSetState(ucfpos.rawAddress.toString(), category, field, start, limit, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteBytes(args: MutPtr<UConverterFromUnicodeArgs>, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(args.rawAddress.toString(), source.rawAddress.toString(), length, offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteSub(args: MutPtr<UConverterFromUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(args.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbFromUwriteUchars(args: MutPtr<UConverterFromUnicodeArgs>, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(args.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteSub(args: MutPtr<UConverterToUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(args.rawAddress.toString(), offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCbToUwriteUchars(args: MutPtr<UConverterToUnicodeArgs>, source: ConstPtr<UShort>, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(args.rawAddress.toString(), source.rawAddress.toString(), length, offsetindex, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvClose(converter: MutPtr<UConverter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvClose(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCompareNames(name1.rawAddress.toString(), name2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvConvert(toconvertername.rawAddress.toString(), fromconvertername.rawAddress.toString(), target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvConvertEx(targetcnv: MutPtr<UConverter>, sourcecnv: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, pivotstart: MutPtr<UShort>, pivotsource: MutPtr<MutPtr<UShort>>, pivottarget: MutPtr<MutPtr<UShort>>, pivotlimit: ConstPtr<UShort>, reset: Byte, flush: Byte, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvConvertEx(targetcnv.rawAddress.toString(), sourcecnv.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), pivotstart.rawAddress.toString(), pivotsource.rawAddress.toString(), pivottarget.rawAddress.toString(), pivotlimit.rawAddress.toString(), reset.toInt(), flush.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr<UErrorCode>): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCountAliases(alias.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvCountStandards(): UShort =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvCountStandards() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(source.rawAddress.toString(), sourcelength, signaturelength.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFixFileSeparator(cnv: ConstPtr<UConverter>, source: MutPtr<UShort>, sourcelen: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFixFileSeparator(cnv.rawAddress.toString(), source.rawAddress.toString(), sourcelen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvFlushCache(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFlushCache() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromAlgorithmic(cnv: MutPtr<UConverter>, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(cnv.rawAddress.toString(), algorithmictype, target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUchars(cnv: MutPtr<UConverter>, dest: Pcstr, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUchars(cnv.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUcountPending(cnv.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvFromUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvFromUnicode(converter.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsets.rawAddress.toString(), flush.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetAlias(alias.rawAddress.toString(), n.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr<ConstPtr<Byte>>, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetAliases(alias.rawAddress.toString(), aliases.rawAddress.toString(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetAvailableName(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCcsid(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetCcsid(converter.rawAddress.toString(), err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetCanonicalName(alias.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDefaultName(): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetDefaultName() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetDisplayName(converter: ConstPtr<UConverter>, displaylocale: Pcstr, displayname: MutPtr<UShort>, displaynamecapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetDisplayName(converter.rawAddress.toString(), displaylocale.rawAddress.toString(), displayname.rawAddress.toString(), displaynamecapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetFromUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterFromUCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(converter.rawAddress.toString(), action.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidChars(converter: ConstPtr<UConverter>, errbytes: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetInvalidChars(converter.rawAddress.toString(), errbytes.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetInvalidUchars(converter: ConstPtr<UConverter>, erruchars: MutPtr<UShort>, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(converter.rawAddress.toString(), erruchars.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetMaxCharSize(converter: ConstPtr<UConverter>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(converter.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetMinCharSize(converter: ConstPtr<UConverter>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetMinCharSize(converter.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetName(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetName(converter.rawAddress.toString(), err.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetNextUchar(converter: MutPtr<UConverter>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetNextUchar(converter.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetPlatform(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): UConverterPlatform =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetPlatform(converter.rawAddress.toString(), err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandard(n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetStandard(n.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetStandardName(name.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetStarters(converter: ConstPtr<UConverter>, starters: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetStarters(converter.rawAddress.toString(), starters.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetSubstChars(converter: ConstPtr<UConverter>, subchars: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetSubstChars(converter.rawAddress.toString(), subchars.rawAddress.toString(), len.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetToUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterToUCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetToUcallBack(converter.rawAddress.toString(), action.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvGetType(converter: ConstPtr<UConverter>): UConverterType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetType(converter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvGetUnicodeSet(cnv: ConstPtr<UConverter>, setfillin: MutPtr<USet>, whichset: UConverterUnicodeSet, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(cnv.rawAddress.toString(), setfillin.rawAddress.toString(), whichset, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvIsAmbiguous(cnv: ConstPtr<UConverter>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvIsAmbiguous(cnv.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvIsFixedWidth(cnv: MutPtr<UConverter>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvIsFixedWidth(cnv.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpen(convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpen(convertername.rawAddress.toString(), err.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenAllNames(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpenAllNames(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpenCcsid(codepage, platform, err.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpenPackage(packagename.rawAddress.toString(), convertername.rawAddress.toString(), err.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpenStandardNames(convname.rawAddress.toString(), standard.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvOpenU(name: ConstPtr<UShort>, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvOpenU(name.rawAddress.toString(), err.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvReset(converter: MutPtr<UConverter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvReset(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetFromUnicode(converter: MutPtr<UConverter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvResetFromUnicode(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvResetToUnicode(converter: MutPtr<UConverter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvResetToUnicode(converter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSafeClone(cnv: ConstPtr<UConverter>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UConverter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSafeClone(cnv.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvSetDefaultName(name: Pcstr) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetDefaultName(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFallback(cnv: MutPtr<UConverter>, usesfallback: Byte) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetFallback(cnv.rawAddress.toString(), usesfallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetFromUcallBack(converter: MutPtr<UConverter>, newaction: UConverterFromUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterFromUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(converter.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldaction.rawAddress.toString(), oldcontext.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstChars(converter: MutPtr<UConverter>, subchars: Pcstr, len: Byte, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetSubstChars(converter.rawAddress.toString(), subchars.rawAddress.toString(), len.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetSubstString(cnv: MutPtr<UConverter>, s: ConstPtr<UShort>, length: Int, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetSubstString(cnv.rawAddress.toString(), s.rawAddress.toString(), length, err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvSetToUcallBack(converter: MutPtr<UConverter>, newaction: UConverterToUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterToUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvSetToUcallBack(converter.rawAddress.toString(), 0L.toString(), newcontext.rawAddress.toString(), oldaction.rawAddress.toString(), oldcontext.rawAddress.toString(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr<UConverter>, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToAlgorithmic(algorithmictype, cnv.rawAddress.toString(), target.rawAddress.toString(), targetcapacity, source.rawAddress.toString(), sourcelength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUchars(cnv: MutPtr<UConverter>, dest: MutPtr<UShort>, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUchars(cnv.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, src.rawAddress.toString(), srclength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUcountPending(cnv.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvToUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<UShort>>, targetlimit: ConstPtr<UShort>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvToUnicode(converter.rawAddress.toString(), target.rawAddress.toString(), targetlimit.rawAddress.toString(), source.rawAddress.toString(), sourcelimit.rawAddress.toString(), offsets.rawAddress.toString(), flush.toInt(), err.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvUsesFallback(cnv: ConstPtr<UConverter>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvUsesFallback(cnv.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselClose(sel: MutPtr<UConverterSelector>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselClose(sel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucnvselOpen(converterlist: ConstPtr<ConstPtr<Byte>>, converterlistsize: Int, excludedcodepoints: ConstPtr<USet>, whichset: UConverterUnicodeSet, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselOpen(converterlist.rawAddress.toString(), converterlistsize, excludedcodepoints.rawAddress.toString(), whichset, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselOpenFromSerialized(buffer: ConstPtr<CVoid>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(buffer.rawAddress.toString(), length, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForString(sel: ConstPtr<UConverterSelector>, s: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselSelectForString(sel.rawAddress.toString(), s.rawAddress.toString(), length, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSelectForUtf8(sel: ConstPtr<UConverterSelector>, s: Pcstr, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(sel.rawAddress.toString(), s.rawAddress.toString(), length, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucnvselSerialize(sel: ConstPtr<UConverterSelector>, buffer: MutPtr<CVoid>, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcnvselSerialize(sel.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolCloneBinary(coll: ConstPtr<UCollator>, buffer: MutPtr<UByte>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolCloneBinary(coll.rawAddress.toString(), buffer.rawAddress.toString(), capacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolClose(coll: MutPtr<UCollator>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolClose(coll.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCloseElements(elems: MutPtr<UCollationElements>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolCloseElements(elems.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolEqual(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAttribute(coll: ConstPtr<UCollator>, attr: UColAttribute, status: MutPtr<UErrorCode>): UColAttributeValue =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetAttribute(coll.rawAddress.toString(), attr, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetAvailable(localeindex) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetBound(source: ConstPtr<UByte>, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr<UByte>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetBound(source.rawAddress.toString(), sourcelength, boundtype, nooflevels.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetContractionsAndExpansions(coll: ConstPtr<UCollator>, contractions: MutPtr<USet>, expansions: MutPtr<USet>, addprefixes: Byte, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(coll.rawAddress.toString(), contractions.rawAddress.toString(), expansions.rawAddress.toString(), addprefixes.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetDisplayName(objloc.rawAddress.toString(), disploc.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(reordercode, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(result.rawAddress.toString(), resultcapacity, keyword.rawAddress.toString(), locale.rawAddress.toString(), isavailable.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetKeywordValues(keyword.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetKeywords(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetKeywords(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetLocaleByType(coll: ConstPtr<UCollator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetLocaleByType(coll.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxExpansion(elems: ConstPtr<UCollationElements>, order: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetMaxExpansion(elems.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetMaxVariable(coll: ConstPtr<UCollator>): UColReorderCode =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetMaxVariable(coll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetOffset(elems: ConstPtr<UCollationElements>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetOffset(elems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetReorderCodes(coll: ConstPtr<UCollator>, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetReorderCodes(coll.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRules(coll: ConstPtr<UCollator>, length: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetRules(coll.rawAddress.toString(), length.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetRulesEx(coll: ConstPtr<UCollator>, delta: UColRuleOption, buffer: MutPtr<UShort>, bufferlen: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetRulesEx(coll.rawAddress.toString(), delta, buffer.rawAddress.toString(), bufferlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetSortKey(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, result: MutPtr<UByte>, resultlength: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetSortKey(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, result.rawAddress.toString(), resultlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetStrength(coll: ConstPtr<UCollator>): UColAttributeValue =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetStrength(coll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetTailoredSet(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetTailoredSet(coll.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetUcaversion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetUcaversion(coll.rawAddress.toString(), info.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGetVariableTop(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetVariableTop(coll.rawAddress.toString(), status.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGetVersion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGetVersion(coll.rawAddress.toString(), info.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolGreater(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGreater(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolGreaterOrEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolGreaterOrEqual(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolKeyHashCode(key: ConstPtr<UByte>, length: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolKeyHashCode(key.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolMergeSortkeys(src1: ConstPtr<UByte>, src1length: Int, src2: ConstPtr<UByte>, src2length: Int, dest: MutPtr<UByte>, destcapacity: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolMergeSortkeys(src1.rawAddress.toString(), src1length, src2.rawAddress.toString(), src2length, dest.rawAddress.toString(), destcapacity) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNext(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolNext(elems.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolNextSortKeyPart(coll: ConstPtr<UCollator>, iter: MutPtr<UCharIterator>, state: MutPtr<UInt>, dest: MutPtr<UByte>, count: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolNextSortKeyPart(coll.rawAddress.toString(), iter.rawAddress.toString(), state.rawAddress.toString(), dest.rawAddress.toString(), count, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpen(loc: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolOpen(loc.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenAvailableLocales(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenBinary(bin: ConstPtr<UByte>, length: Int, base: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolOpenBinary(bin.rawAddress.toString(), length, base.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenElements(coll: ConstPtr<UCollator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UCollationElements> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolOpenElements(coll.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolOpenRules(rules.rawAddress.toString(), ruleslength, normalizationmode, strength, parseerror.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrevious(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolPrevious(elems.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolPrimaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolPrimaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolReset(elems: MutPtr<UCollationElements>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolReset(elems.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSafeClone(coll: ConstPtr<UCollator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSafeClone(coll.rawAddress.toString(), stackbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSecondaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSecondaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolSetAttribute(coll: MutPtr<UCollator>, attr: UColAttribute, value: UColAttributeValue, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetAttribute(coll.rawAddress.toString(), attr, value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetMaxVariable(coll: MutPtr<UCollator>, group: UColReorderCode, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetMaxVariable(coll.rawAddress.toString(), group, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetOffset(elems: MutPtr<UCollationElements>, offset: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetOffset(elems.rawAddress.toString(), offset, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetReorderCodes(coll: MutPtr<UCollator>, reordercodes: ConstPtr<Int>, reordercodeslength: Int, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetReorderCodes(coll.rawAddress.toString(), reordercodes.rawAddress.toString(), reordercodeslength, perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetStrength(coll: MutPtr<UCollator>, strength: UColAttributeValue) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetStrength(coll.rawAddress.toString(), strength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolSetText(elems: MutPtr<UCollationElements>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolSetText(elems.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucolStrcoll(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): UCollationResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolStrcoll(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollIter(coll: ConstPtr<UCollator>, siter: MutPtr<UCharIterator>, titer: MutPtr<UCharIterator>, status: MutPtr<UErrorCode>): UCollationResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolStrcollIter(coll.rawAddress.toString(), siter.rawAddress.toString(), titer.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolStrcollUtf8(coll: ConstPtr<UCollator>, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr<UErrorCode>): UCollationResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolStrcollUtf8(coll.rawAddress.toString(), source.rawAddress.toString(), sourcelength, target.rawAddress.toString(), targetlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucolTertiaryOrder(order: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcolTertiaryOrder(order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGet(map: ConstPtr<UCPMap>, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcpmapGet(map.rawAddress.toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucpmapGetRange(map: ConstPtr<UCPMap>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcpmapGetRange(map.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieClose(trie: MutPtr<UCPTrie>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieClose(trie.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucptrieGet(trie: ConstPtr<UCPTrie>, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieGet(trie.rawAddress.toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetRange(trie: ConstPtr<UCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieGetRange(trie.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetType(trie: ConstPtr<UCPTrie>): UCPTrieType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieGetType(trie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieGetValueWidth(trie: ConstPtr<UCPTrie>): UCPTrieValueWidth =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieGetValueWidth(trie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallIndex(trie: ConstPtr<UCPTrie>, c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(trie.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalSmallU8Index(trie: ConstPtr<UCPTrie>, lt1: Int, t2: UByte, t3: UByte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(trie.rawAddress.toString(), lt1, t2.toInt(), t3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieInternalU8PrevIndex(trie: ConstPtr<UCPTrie>, c: Int, start: ConstPtr<UByte>, src: ConstPtr<UByte>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(trie.rawAddress.toString(), c, start.rawAddress.toString(), src.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(type, valuewidth, data.rawAddress.toString(), length, pactuallength.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucptrieToBinary(trie: ConstPtr<UCPTrie>, data: MutPtr<CVoid>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcptrieToBinary(trie.rawAddress.toString(), data.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetClose(ucsd: MutPtr<UCharsetDetector>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetClose(ucsd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetDetect(ucsd: MutPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UCharsetMatch> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetDetect(ucsd.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetDetectAll(ucsd: MutPtr<UCharsetDetector>, matchesfound: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<UCharsetMatch>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetDetectAll(ucsd.rawAddress.toString(), matchesfound.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetEnableInputFilter(ucsd: MutPtr<UCharsetDetector>, filter: Byte): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(ucsd.rawAddress.toString(), filter.toInt()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(ucsd.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetConfidence(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetGetConfidence(ucsm.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetLanguage(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetGetLanguage(ucsm.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetName(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetGetName(ucsm.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetGetUchars(ucsm: ConstPtr<UCharsetMatch>, buf: MutPtr<UShort>, cap: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetGetUchars(ucsm.rawAddress.toString(), buf.rawAddress.toString(), cap, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr<UCharsetDetector>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(ucsd.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetOpen(status: MutPtr<UErrorCode>): MutPtr<UCharsetDetector> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetOpen(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucsdetSetDeclaredEncoding(ucsd: MutPtr<UCharsetDetector>, encoding: Pcstr, length: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(ucsd.rawAddress.toString(), encoding.rawAddress.toString(), length, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucsdetSetText(ucsd: MutPtr<UCharsetDetector>, textin: Pcstr, len: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcsdetSetText(ucsd.rawAddress.toString(), textin.rawAddress.toString(), len, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrCountCurrencies(locale.rawAddress.toString(), date, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocale(locale: Pcstr, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrForLocale(locale.rawAddress.toString(), buff.rawAddress.toString(), buffcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(locale.rawAddress.toString(), date, index, buff.rawAddress.toString(), buffcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigits(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(currency.rawAddress.toString(), ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(currency.rawAddress.toString(), usage, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(key.rawAddress.toString(), locale.rawAddress.toString(), commonlyused.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetName(currency: ConstPtr<UShort>, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr<Byte>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetName(currency.rawAddress.toString(), locale.rawAddress.toString(), namestyle, ischoiceformat.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetNumericCode(currency: ConstPtr<UShort>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetNumericCode(currency.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetPluralName(currency: ConstPtr<UShort>, locale: Pcstr, ischoiceformat: MutPtr<Byte>, pluralcount: Pcstr, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetPluralName(currency.rawAddress.toString(), locale.rawAddress.toString(), ischoiceformat.rawAddress.toString(), pluralcount.rawAddress.toString(), len.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrement(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(currency.rawAddress.toString(), ec.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(currency.rawAddress.toString(), usage, ec.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrIsAvailable(isocode: ConstPtr<UShort>, from: Double, to: Double, errorcode: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrIsAvailable(isocode.rawAddress.toString(), from, to, errorcode.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(currtype.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrRegister(isocode: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrRegister(isocode.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ucurrUnregister(key: MutPtr<CVoid>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUcurrUnregister(key.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatAdoptNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoadopt: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(fmt.rawAddress.toString(), numberformattoadopt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatAdoptNumberFormatForFields(fmt: MutPtr<MutPtr<CVoid>>, fields: ConstPtr<UShort>, numberformattoset: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(fmt.rawAddress.toString(), fields.rawAddress.toString(), numberformattoset.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatApplyPattern(format.rawAddress.toString(), localized.toInt(), pattern.rawAddress.toString(), patternlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatClone(fmt.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatClose(format: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatClose(format.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatCountSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatCountSymbols(fmt.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormat(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatFormat(format.rawAddress.toString(), datetoformat, result.rawAddress.toString(), resultlength, position.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatFormatCalendar(format.rawAddress.toString(), calendar.rawAddress.toString(), result.rawAddress.toString(), capacity, position.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatCalendarForFields(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(format.rawAddress.toString(), calendar.rawAddress.toString(), result.rawAddress.toString(), capacity, fpositer.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatFormatForFields(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatFormatForFields(format.rawAddress.toString(), datetoformat, result.rawAddress.toString(), resultlength, fpositer.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGet2DigitYearStart(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(fmt.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetAvailable(localeindex) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetBooleanAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UDateFormatBooleanAttribute, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(fmt.rawAddress.toString(), attr, status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetCalendar(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetCalendar(fmt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetContext(fmt.rawAddress.toString(), type, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetLocaleByType(fmt.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormat(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetNumberFormat(fmt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetNumberFormatForField(fmt: ConstPtr<ConstPtr<CVoid>>, field: UShort): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(fmt.rawAddress.toString(), field.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatGetSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatGetSymbols(fmt.rawAddress.toString(), type, symbolindex, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatIsLenient(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatIsLenient(fmt.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr<UShort>, tzidlength: Int, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatOpen(timestyle, datestyle, locale.rawAddress.toString(), tzid.rawAddress.toString(), tzidlength, pattern.rawAddress.toString(), patternlength, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParse(format: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatParse(format.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatParseCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatParseCalendar(format.rawAddress.toString(), calendar.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSet2DigitYearStart(fmt: MutPtr<MutPtr<CVoid>>, d: Double, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(fmt.rawAddress.toString(), d, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetBooleanAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(fmt.rawAddress.toString(), attr, newvalue.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetCalendar(fmt: MutPtr<MutPtr<CVoid>>, calendartoset: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetCalendar(fmt.rawAddress.toString(), calendartoset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetContext(fmt.rawAddress.toString(), value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetLenient(fmt: MutPtr<MutPtr<CVoid>>, islenient: Byte) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetLenient(fmt.rawAddress.toString(), islenient.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoset: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetNumberFormat(fmt.rawAddress.toString(), numberformattoset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatSetSymbols(format: MutPtr<MutPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr<UShort>, valuelength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatSetSymbols(format.rawAddress.toString(), type, symbolindex, value.rawAddress.toString(), valuelength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatToCalendarDateField(field) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, localized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatToPattern(fmt.rawAddress.toString(), localized.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgAddPattern(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, override: Byte, conflictingpattern: MutPtr<UShort>, capacity: Int, plength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): UDateTimePatternConflict =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgAddPattern(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, override.toInt(), conflictingpattern.rawAddress.toString(), capacity, plength.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClone(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgClone(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgClose(dtpg: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgClose(dtpg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgGetAppendItemFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(dtpg.rawAddress.toString(), field, plength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetAppendItemName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(dtpg.rawAddress.toString(), field, plength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, baseskeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(unuseddtpg.rawAddress.toString(), pattern.rawAddress.toString(), length, baseskeleton.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPattern(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetBestPattern(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), length, bestpattern.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetBestPatternWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), length, options, bestpattern.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(dtpg.rawAddress.toString(), plength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetDecimal(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetDecimal(dtpg.rawAddress.toString(), plength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetFieldDisplayName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(dtpg.rawAddress.toString(), field, width, fieldname.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetPatternForSkeleton(dtpg: ConstPtr<ConstPtr<CVoid>>, skeleton: ConstPtr<UShort>, skeletonlength: Int, plength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(dtpg.rawAddress.toString(), skeleton.rawAddress.toString(), skeletonlength, plength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgGetSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, skeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgGetSkeleton(unuseddtpg.rawAddress.toString(), pattern.rawAddress.toString(), length, skeleton.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgOpen(locale.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenBaseSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenEmpty(perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgOpenEmpty(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgOpenSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(dtpg.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypes(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, skeleton.rawAddress.toString(), skeletonlength, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(dtpg.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, skeleton.rawAddress.toString(), skeletonlength, options, dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udatpgSetAppendItemFormat(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(dtpg.rawAddress.toString(), field, value.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetAppendItemName(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(dtpg.rawAddress.toString(), field, value.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, dtformat: ConstPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(dtpg.rawAddress.toString(), dtformat.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udatpgSetDecimal(dtpg: MutPtr<MutPtr<CVoid>>, decimal: ConstPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdatpgSetDecimal(dtpg.rawAddress.toString(), decimal.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtClose(formatter: MutPtr<UDateIntervalFormat>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtClose(formatter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtCloseResult(uresult: MutPtr<UFormattedDateInterval>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun udtitvfmtFormat(formatter: ConstPtr<UDateIntervalFormat>, fromdate: Double, todate: Double, result: MutPtr<UShort>, resultcapacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtFormat(formatter.rawAddress.toString(), fromdate, todate, result.rawAddress.toString(), resultcapacity, position.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr<UShort>, skeletonlength: Int, tzid: ConstPtr<UShort>, tzidlength: Int, status: MutPtr<UErrorCode>): MutPtr<UDateIntervalFormat> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtOpen(locale.rawAddress.toString(), skeleton.rawAddress.toString(), skeletonlength, tzid.rawAddress.toString(), tzidlength, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedDateInterval> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun udtitvfmtResultAsValue(uresult: ConstPtr<UFormattedDateInterval>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumClose(en: MutPtr<UEnumeration>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumClose(en.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumCount(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumCount(en.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumNext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumNext(en.rawAddress.toString(), resultlength.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenCharStringsEnumeration(strings: ConstPtr<ConstPtr<Byte>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(strings.rawAddress.toString(), count, ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumOpenUcharStringsEnumeration(strings: ConstPtr<ConstPtr<UShort>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(strings.rawAddress.toString(), count, ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uenumReset(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumReset(en.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uenumUnext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUenumUnext(en.rawAddress.toString(), resultlength.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerClose(fpositer: MutPtr<UFieldPositionIterator>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfieldpositerClose(fpositer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufieldpositerNext(fpositer: MutPtr<UFieldPositionIterator>, beginindex: MutPtr<Int>, endindex: MutPtr<Int>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfieldpositerNext(fpositer.rawAddress.toString(), beginindex.rawAddress.toString(), endindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufieldpositerOpen(status: MutPtr<UErrorCode>): MutPtr<UFieldPositionIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfieldpositerOpen(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtClose(fmt: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtClose(fmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ufmtGetArrayItemByIndex(fmt: MutPtr<MutPtr<CVoid>>, n: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(fmt.rawAddress.toString(), n, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetArrayLength(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetArrayLength(fmt.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDate(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetDate(fmt.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDecNumChars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetDecNumChars(fmt.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetDouble(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetDouble(fmt.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetInt64(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetInt64(fmt.rawAddress.toString(), status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetLong(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetLong(fmt.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetObject(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetObject(fmt.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetType(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): UFormattableType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetType(fmt.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtGetUchars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtGetUchars(fmt.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtIsNumeric(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtIsNumeric(fmt.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtOpen(status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtOpen(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalGetString(ufmtval: ConstPtr<UFormattedValue>, plength: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtvalGetString(ufmtval.rawAddress.toString(), plength.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ufmtvalNextPosition(ufmtval: ConstPtr<UFormattedValue>, ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUfmtvalNextPosition(ufmtval.rawAddress.toString(), ucfpos.rawAddress.toString(), ec.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetInstance(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UGenderInfo> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUgenderGetInstance(locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ugenderGetListGender(genderinfo: ConstPtr<UGenderInfo>, genders: ConstPtr<UGender>, size: Int, status: MutPtr<UErrorCode>): UGender =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUgenderGetListGender(genderinfo.rawAddress.toString(), genders.rawAddress.toString(), size, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaClose(idna: MutPtr<Uidna>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaClose(idna.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uidnaLabelToAscii(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaLabelToAscii(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToAsciiUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicode(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaLabelToUnicode(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaLabelToUnicodeUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(idna.rawAddress.toString(), label.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAscii(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaNameToAscii(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToAsciiUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicode(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaNameToUnicode(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaNameToUnicodeUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(idna.rawAddress.toString(), name.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, pinfo.rawAddress.toString(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<Uidna> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUidnaOpenUts46(options.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterCurrent32(iter: MutPtr<UCharIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterCurrent32(iter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterGetState(iter: ConstPtr<UCharIterator>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterGetState(iter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterNext32(iter: MutPtr<UCharIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterNext32(iter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterPrevious32(iter: MutPtr<UCharIterator>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterPrevious32(iter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiterSetState(iter: MutPtr<UCharIterator>, state: UInt, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterSetState(iter.rawAddress.toString(), state.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetString(iter: MutPtr<UCharIterator>, s: ConstPtr<UShort>, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterSetString(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf16Be(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterSetUtf16Be(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiterSetUtf8(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUiterSetUtf8(iter.rawAddress.toString(), s.rawAddress.toString(), length)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnClose(ldn: MutPtr<ULocaleDisplayNames>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnClose(ldn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uldnGetContext(ldn: ConstPtr<ULocaleDisplayNames>, type: UDisplayContextType, perrorcode: MutPtr<UErrorCode>): UDisplayContext =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnGetContext(ldn.rawAddress.toString(), type, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetDialectHandling(ldn: ConstPtr<ULocaleDisplayNames>): UDialectHandling =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnGetDialectHandling(ldn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnGetLocale(ldn: ConstPtr<ULocaleDisplayNames>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnGetLocale(ldn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnKeyDisplayName(ldn.rawAddress.toString(), key.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnKeyValueDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, value: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(ldn.rawAddress.toString(), key.rawAddress.toString(), value.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLanguageDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, lang: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnLanguageDisplayName(ldn.rawAddress.toString(), lang.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnLocaleDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, locale: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnLocaleDisplayName(ldn.rawAddress.toString(), locale.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnOpen(locale.rawAddress.toString(), dialecthandling, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr<UDisplayContext>, length: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnOpenForContext(locale.rawAddress.toString(), contexts.rawAddress.toString(), length, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnRegionDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, region: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnRegionDisplayName(ldn.rawAddress.toString(), region.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptCodeDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, scriptcode: UScriptCode, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(ldn.rawAddress.toString(), scriptcode, result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnScriptDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, script: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnScriptDisplayName(ldn.rawAddress.toString(), script.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uldnVariantDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, variant: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUldnVariantDisplayName(ldn.rawAddress.toString(), variant.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtClose(listfmt: MutPtr<UListFormatter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtClose(listfmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtCloseResult(uresult: MutPtr<UFormattedList>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtFormat(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtFormat(listfmt.rawAddress.toString(), strings.rawAddress.toString(), stringlengths.rawAddress.toString(), stringcount, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtFormatStringsToResult(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, uresult: MutPtr<UFormattedList>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(listfmt.rawAddress.toString(), strings.rawAddress.toString(), stringlengths.rawAddress.toString(), stringcount, uresult.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulistfmtOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtOpen(locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtOpenForType(locale.rawAddress.toString(), type, width, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedList> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtOpenResult(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulistfmtResultAsValue(uresult: ConstPtr<UFormattedList>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlistfmtResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, acceptlist: ConstPtr<ConstPtr<Byte>>, acceptlistcount: Int, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocAcceptLanguage(result.rawAddress.toString(), resultavailable, outresult.rawAddress.toString(), acceptlist.rawAddress.toString(), acceptlistcount, availablelocales.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, httpacceptlanguage: Pcstr, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(result.rawAddress.toString(), resultavailable, outresult.rawAddress.toString(), httpacceptlanguage.rawAddress.toString(), availablelocales.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocAddLikelySubtags(localeid.rawAddress.toString(), maximizedlocaleid.rawAddress.toString(), maximizedlocaleidcapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocCanonicalize(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr<Int>, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocForLanguageTag(langtag.rawAddress.toString(), localeid.rawAddress.toString(), localeidcapacity, parsedlength.rawAddress.toString(), err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetAvailable(n: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetAvailable(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetBaseName(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(localeid.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetCountry(localeid.rawAddress.toString(), country.rawAddress.toString(), countrycapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDefault(): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDefault() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr<UShort>, countrycapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayCountry(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), country.rawAddress.toString(), countrycapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(keyword.rawAddress.toString(), displaylocale.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(locale.rawAddress.toString(), keyword.rawAddress.toString(), displaylocale.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr<UShort>, languagecapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), language.rawAddress.toString(), languagecapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayName(localeid.rawAddress.toString(), inlocaleid.rawAddress.toString(), result.rawAddress.toString(), maxresultsize, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr<UShort>, scriptcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayScript(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), script.rawAddress.toString(), scriptcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr<UShort>, variantcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetDisplayVariant(locale.rawAddress.toString(), displaylocale.rawAddress.toString(), variant.rawAddress.toString(), variantcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetIso3Country(localeid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetIso3Language(localeid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsocountries(): MutPtr<MutPtr<Byte>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetIsocountries() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetIsolanguages(): MutPtr<MutPtr<Byte>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetIsolanguages() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetKeywordValue(localeid.rawAddress.toString(), keywordname.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetLcid(localeid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetLanguage(localeid.rawAddress.toString(), language.rawAddress.toString(), languagecapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetLineOrientation(localeid.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(hostid.toInt(), locale.rawAddress.toString(), localecapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetName(localeid.rawAddress.toString(), name.rawAddress.toString(), namecapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetParent(localeid.rawAddress.toString(), parent.rawAddress.toString(), parentcapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetScript(localeid.rawAddress.toString(), script.rawAddress.toString(), scriptcapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocGetVariant(localeid.rawAddress.toString(), variant.rawAddress.toString(), variantcapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocIsRightToLeft(locale.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocMinimizeSubtags(localeid.rawAddress.toString(), minimizedlocaleid.rawAddress.toString(), minimizedlocaleidcapacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocOpenAvailableByType(type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocOpenKeywords(localeid.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocSetDefault(localeid: Pcstr, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocSetDefault(localeid.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocSetKeywordValue(keywordname.rawAddress.toString(), keywordvalue.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocToLanguageTag(localeid.rawAddress.toString(), langtag.rawAddress.toString(), langtagcapacity, strict.toInt(), err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocToLegacyKey(keyword.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocToLegacyType(keyword.rawAddress.toString(), value.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(keyword.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(keyword.rawAddress.toString(), value.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataClose(uld: MutPtr<ULocaleData>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataClose(uld.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetCldrversion(versionarray: MutPtr<UByte>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetCldrversion(versionarray.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataGetDelimiter(uld: MutPtr<ULocaleData>, type: ULocaleDataDelimiterType, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetDelimiter(uld.rawAddress.toString(), type, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetExemplarSet(uld: MutPtr<ULocaleData>, fillin: MutPtr<USet>, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(uld.rawAddress.toString(), fillin.rawAddress.toString(), options.toInt(), extype, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleDisplayPattern(uld: MutPtr<ULocaleData>, pattern: MutPtr<UShort>, patterncapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(uld.rawAddress.toString(), pattern.rawAddress.toString(), patterncapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetLocaleSeparator(uld: MutPtr<ULocaleData>, separator: MutPtr<UShort>, separatorcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(uld.rawAddress.toString(), separator.rawAddress.toString(), separatorcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr<UErrorCode>): UMeasurementSystem =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(localeid.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetNoSubstitute(uld: MutPtr<ULocaleData>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(uld.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr<Int>, width: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataGetPaperSize(localeid.rawAddress.toString(), height.rawAddress.toString(), width.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ulocdataOpen(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<ULocaleData> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataOpen(localeid.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulocdataSetNoSubstitute(uld: MutPtr<ULocaleData>, setting: Byte) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(uld.rawAddress.toString(), setting.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgApplyPattern(fmt: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgApplyPattern(fmt.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgAutoQuoteApostrophe(pattern: ConstPtr<UShort>, patternlength: Int, dest: MutPtr<UShort>, destcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(pattern.rawAddress.toString(), patternlength, dest.rawAddress.toString(), destcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgClone(fmt.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgClose(format: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgClose(format.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgFormat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgFormat(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgGetLocale(fmt: ConstPtr<ConstPtr<CVoid>>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgGetLocale(fmt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgOpen(pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgOpen(pattern.rawAddress.toString(), patternlength, locale.rawAddress.toString(), parseerror.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgParse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgParse(fmt.rawAddress.toString(), source.rawAddress.toString(), sourcelength, count.rawAddress.toString(), status.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgSetLocale(fmt: MutPtr<MutPtr<CVoid>>, locale: Pcstr) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgSetLocale(fmt.rawAddress.toString(), locale.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umsgToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgToPattern(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVformat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgVformat(fmt.rawAddress.toString(), result.rawAddress.toString(), resultlength, ap.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umsgVparse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmsgVparse(fmt.rawAddress.toString(), source.rawAddress.toString(), sourcelength, count.rawAddress.toString(), ap.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieBuildImmutable(trie: MutPtr<UMutableCPTrie>, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(trie.rawAddress.toString(), type, valuewidth, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClone(other: ConstPtr<UMutableCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieClone(other.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieClose(trie: MutPtr<UMutableCPTrie>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieClose(trie.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieFromUcpmap(map: ConstPtr<UCPMap>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(map.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieFromUcptrie(trie: ConstPtr<UCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(trie.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGet(trie: ConstPtr<UMutableCPTrie>, c: Int): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieGet(trie.rawAddress.toString(), c) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieGetRange(trie: ConstPtr<UMutableCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieGetRange(trie.rawAddress.toString(), start, option, surrogatevalue.toInt(), filter.rawAddress.toString(), context.rawAddress.toString(), pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieOpen(initialvalue.toInt(), errorvalue.toInt(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umutablecptrieSet(trie: MutPtr<UMutableCPTrie>, c: Int, value: UInt, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieSet(trie.rawAddress.toString(), c, value.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun umutablecptrieSetRange(trie: MutPtr<UMutableCPTrie>, start: Int, end: Int, value: UInt, perrorcode: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUmutablecptrieSetRange(trie.rawAddress.toString(), start, end, value.toInt(), perrorcode.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2Append(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2Append(norm2.rawAddress.toString(), first.rawAddress.toString(), firstlength, firstcapacity, second.rawAddress.toString(), secondlength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Close(norm2: MutPtr<UNormalizer2>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2Close(norm2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unorm2ComposePair(norm2: ConstPtr<UNormalizer2>, a: Int, b: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2ComposePair(norm2.rawAddress.toString(), a, b) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetCombiningClass(norm2: ConstPtr<UNormalizer2>, c: Int): UByte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(norm2.rawAddress.toString(), c) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetDecomposition(norm2.rawAddress.toString(), c, decomposition.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetInstance(packagename.rawAddress.toString(), name.rawAddress.toString(), mode, perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetNfkdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2GetRawDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(norm2.rawAddress.toString(), c, decomposition.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryAfter(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(norm2.rawAddress.toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2HasBoundaryBefore(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(norm2.rawAddress.toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsInert(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2IsInert(norm2.rawAddress.toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2IsNormalized(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2IsNormalized(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2Normalize(norm2: ConstPtr<UNormalizer2>, src: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2Normalize(norm2.rawAddress.toString(), src.rawAddress.toString(), length, dest.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(norm2.rawAddress.toString(), first.rawAddress.toString(), firstlength, firstcapacity, second.rawAddress.toString(), secondlength, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2OpenFiltered(norm2: ConstPtr<UNormalizer2>, filterset: ConstPtr<USet>, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2OpenFiltered(norm2.rawAddress.toString(), filterset.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2QuickCheck(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): UNormalizationCheckResult =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2QuickCheck(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unorm2SpanQuickCheckYes(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(norm2.rawAddress.toString(), s.rawAddress.toString(), length, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unormCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnormCompare(s1.rawAddress.toString(), length1, s2.rawAddress.toString(), length2, options.toInt(), perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumApplyPattern(format.rawAddress.toString(), localized.toInt(), pattern.rawAddress.toString(), patternlength, parseerror.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumClone(fmt.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumClose(fmt: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumClose(fmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumCountAvailable(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumCountAvailable() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormat(fmt: ConstPtr<ConstPtr<CVoid>>, number: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormat(fmt.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, number: Pcstr, length: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatDecimal(fmt.rawAddress.toString(), number.rawAddress.toString(), length, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDouble(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatDouble(fmt.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, currency: MutPtr<UShort>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(fmt.rawAddress.toString(), number, currency.rawAddress.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatDoubleForFields(format: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(format.rawAddress.toString(), number, result.rawAddress.toString(), resultlength, fpositer.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatInt64(fmt: ConstPtr<ConstPtr<CVoid>>, number: Long, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatInt64(fmt.rawAddress.toString(), number.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumFormatUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, number: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumFormatUformattable(fmt.rawAddress.toString(), number.rawAddress.toString(), result.rawAddress.toString(), resultlength, pos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetAttribute(fmt.rawAddress.toString(), attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetAvailable(localeindex) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetContext(fmt.rawAddress.toString(), type, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetDoubleAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(fmt.rawAddress.toString(), attr) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetLocaleByType(fmt.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetSymbol(fmt: ConstPtr<ConstPtr<CVoid>>, symbol: UNumberFormatSymbol, buffer: MutPtr<UShort>, size: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetSymbol(fmt.rawAddress.toString(), symbol, buffer.rawAddress.toString(), size, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumGetTextAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, tag: UNumberFormatTextAttribute, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumGetTextAttribute(fmt.rawAddress.toString(), tag, result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumOpen(style, pattern.rawAddress.toString(), patternlength, locale.rawAddress.toString(), parseerr.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParse(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParse(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, outbuf: Pcstr, outbuflength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParseDecimal(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), outbuf.rawAddress.toString(), outbuflength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDouble(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParseDouble(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, currency: MutPtr<UShort>, status: MutPtr<UErrorCode>): Double =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), currency.rawAddress.toString(), status.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseInt64(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParseInt64(fmt.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumParseToUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumParseToUformattable(fmt.rawAddress.toString(), result.rawAddress.toString(), text.rawAddress.toString(), textlength, parsepos.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumSetAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumSetAttribute(fmt.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumSetContext(fmt.rawAddress.toString(), value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetDoubleAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Double) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(fmt.rawAddress.toString(), attr, newvalue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetSymbol(fmt: MutPtr<MutPtr<CVoid>>, symbol: UNumberFormatSymbol, value: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumSetSymbol(fmt.rawAddress.toString(), symbol, value.rawAddress.toString(), length, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumSetTextAttribute(fmt: MutPtr<MutPtr<CVoid>>, tag: UNumberFormatTextAttribute, newvalue: ConstPtr<UShort>, newvaluelength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumSetTextAttribute(fmt.rawAddress.toString(), tag, newvalue.rawAddress.toString(), newvaluelength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, ispatternlocalized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumToPattern(fmt.rawAddress.toString(), ispatternlocalized.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfClose(uformatter: MutPtr<UNumberFormatter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfClose(uformatter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfCloseResult(uresult: MutPtr<UFormattedNumber>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfCloseResult(uresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDecimal(uformatter: ConstPtr<UNumberFormatter>, value: Pcstr, valuelen: Int, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfFormatDecimal(uformatter.rawAddress.toString(), value.rawAddress.toString(), valuelen, uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatDouble(uformatter: ConstPtr<UNumberFormatter>, value: Double, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfFormatDouble(uformatter.rawAddress.toString(), value, uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfFormatInt(uformatter: ConstPtr<UNumberFormatter>, value: Long, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfFormatInt(uformatter.rawAddress.toString(), value.toString(), uresult.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(skeleton.rawAddress.toString(), skeletonlen, locale.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, perror: MutPtr<UParseError>, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(skeleton.rawAddress.toString(), skeletonlen, locale.rawAddress.toString(), perror.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedNumber> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfOpenResult(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultAsValue(uresult: ConstPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfResultAsValue(uresult.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultGetAllFieldPositions(uresult: ConstPtr<UFormattedNumber>, ufpositer: MutPtr<UFieldPositionIterator>, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(uresult.rawAddress.toString(), ufpositer.rawAddress.toString(), ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumfResultNextFieldPosition(uresult: ConstPtr<UFormattedNumber>, ufpos: MutPtr<UFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(uresult.rawAddress.toString(), ufpos.rawAddress.toString(), ec.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumfResultToString(uresult: ConstPtr<UFormattedNumber>, buffer: MutPtr<UShort>, buffercapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumfResultToString(uresult.rawAddress.toString(), buffer.rawAddress.toString(), buffercapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysClose(unumsys: MutPtr<UNumberingSystem>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysClose(unumsys.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unumsysGetDescription(unumsys: ConstPtr<UNumberingSystem>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysGetDescription(unumsys.rawAddress.toString(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetName(unumsys: ConstPtr<UNumberingSystem>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysGetName(unumsys.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysGetRadix(unumsys: ConstPtr<UNumberingSystem>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysGetRadix(unumsys.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysIsAlgorithmic(unumsys: ConstPtr<UNumberingSystem>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(unumsys.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysOpen(locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenAvailableNames(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unumsysOpenByName(name: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUnumsysOpenByName(name.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesClose(uplrules: MutPtr<UPluralRules>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesClose(uplrules.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uplrulesGetKeywords(uplrules: ConstPtr<UPluralRules>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesGetKeywords(uplrules.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesOpen(locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesOpenForType(locale.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelect(uplrules: ConstPtr<UPluralRules>, number: Double, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesSelect(uplrules.rawAddress.toString(), number, keyword.rawAddress.toString(), capacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uplrulesSelectFormatted(uplrules: ConstPtr<UPluralRules>, number: ConstPtr<UFormattedNumber>, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUplrulesSelectFormatted(uplrules.rawAddress.toString(), number.rawAddress.toString(), keyword.rawAddress.toString(), capacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacement(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexAppendReplacement(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendReplacementUtext(regexp: MutPtr<URegularExpression>, replacementtext: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexAppendTail(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexAppendTail(regexp.rawAddress.toString(), destbuf.rawAddress.toString(), destcapacity.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexAppendTailUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexAppendTailUtext(regexp.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClone(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexClone(regexp.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexClose(regexp: MutPtr<URegularExpression>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexClose(regexp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexEnd(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexEnd(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexEnd64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexEnd64(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexFind(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFind64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexFind64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFindNext(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexFindNext(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexFlags(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexFlags(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetFindProgressCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexFindProgressCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(regexp.rawAddress.toString(), callback.rawAddress.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetMatchCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexMatchCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetMatchCallback(regexp.rawAddress.toString(), callback.rawAddress.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexGetStackLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetStackLimit(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetText(regexp: MutPtr<URegularExpression>, textlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetText(regexp.rawAddress.toString(), textlength.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetTimeLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetTimeLimit(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGetUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGetUtext(regexp.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroup(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGroup(regexp.rawAddress.toString(), groupnum, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupCount(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGroupCount(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromCname(regexp: MutPtr<URegularExpression>, groupname: Pcstr, namelength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(regexp.rawAddress.toString(), groupname.rawAddress.toString(), namelength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupNumberFromName(regexp: MutPtr<URegularExpression>, groupname: ConstPtr<UShort>, namelength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGroupNumberFromName(regexp.rawAddress.toString(), groupname.rawAddress.toString(), namelength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexGroupUtext(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UText>, grouplength: MutPtr<Long>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexGroupUtext(regexp.rawAddress.toString(), groupnum, dest.rawAddress.toString(), grouplength.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasAnchoringBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHasTransparentBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexHasTransparentBounds(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexHitEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexHitEnd(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexLookingAt(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexLookingAt64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexLookingAt64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexMatches(regexp.rawAddress.toString(), startindex, status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexMatches64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexMatches64(regexp.rawAddress.toString(), startindex.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpen(pattern: ConstPtr<UShort>, patternlength: Int, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexOpen(pattern.rawAddress.toString(), patternlength, flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexOpenC(pattern.rawAddress.toString(), flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexOpenUtext(pattern: MutPtr<UText>, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexOpenUtext(pattern.rawAddress.toString(), flags.toInt(), pe.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPattern(regexp: ConstPtr<URegularExpression>, patlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexPattern(regexp.rawAddress.toString(), patlength.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexPatternUtext(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexPatternUtext(regexp.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRefreshUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRefreshUtext(regexp.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexRegionEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRegionEnd(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionEnd64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRegionEnd64(regexp.rawAddress.toString(), status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRegionStart(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRegionStart64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRegionStart64(regexp.rawAddress.toString(), status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAll(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReplaceAll(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceAllUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReplaceAllUtext(regexp.rawAddress.toString(), replacement.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirst(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReplaceFirst(regexp.rawAddress.toString(), replacementtext.rawAddress.toString(), replacementlength, destbuf.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReplaceFirstUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(regexp.rawAddress.toString(), replacement.rawAddress.toString(), dest.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexRequireEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexRequireEnd(regexp.rawAddress.toString(), status.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexReset(regexp: MutPtr<URegularExpression>, index: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReset(regexp.rawAddress.toString(), index, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexReset64(regexp: MutPtr<URegularExpression>, index: Long, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexReset64(regexp.rawAddress.toString(), index.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetFindProgressCallback(regexp: MutPtr<URegularExpression>, callback: URegexFindProgressCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(regexp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetMatchCallback(regexp: MutPtr<URegularExpression>, callback: URegexMatchCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetMatchCallback(regexp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion(regexp: MutPtr<URegularExpression>, regionstart: Int, regionlimit: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetRegion(regexp.rawAddress.toString(), regionstart, regionlimit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegion64(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetRegion64(regexp.rawAddress.toString(), regionstart.toString(), regionlimit.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetRegionAndStart(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetRegionAndStart(regexp.rawAddress.toString(), regionstart.toString(), regionlimit.toString(), startindex.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetStackLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetStackLimit(regexp.rawAddress.toString(), limit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetText(regexp: MutPtr<URegularExpression>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetText(regexp.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetTimeLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetTimeLimit(regexp.rawAddress.toString(), limit, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSetUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSetUtext(regexp.rawAddress.toString(), text.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexSplit(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<UShort>, destcapacity: Int, requiredcapacity: MutPtr<Int>, destfields: MutPtr<MutPtr<UShort>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSplit(regexp.rawAddress.toString(), destbuf.rawAddress.toString(), destcapacity, requiredcapacity.rawAddress.toString(), destfields.rawAddress.toString(), destfieldscapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexSplitUtext(regexp: MutPtr<URegularExpression>, destfields: MutPtr<MutPtr<UText>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexSplitUtext(regexp.rawAddress.toString(), destfields.rawAddress.toString(), destfieldscapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexStart(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexStart64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexStart64(regexp.rawAddress.toString(), groupnum, status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregexUseAnchoringBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(regexp.rawAddress.toString(), b.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregexUseTransparentBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregexUseTransparentBounds(regexp.rawAddress.toString(), b.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uregionAreEqual(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionAreEqual(uregion.rawAddress.toString(), otherregion.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionContains(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionContains(uregion.rawAddress.toString(), otherregion.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetAvailable(type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetAvailable(type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegions(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetContainedRegions(uregion.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainedRegionsOfType(uregion: ConstPtr<URegion>, type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(uregion.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegion(uregion: ConstPtr<URegion>): MutPtr<URegion> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetContainingRegion(uregion.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetContainingRegionOfType(uregion: ConstPtr<URegion>, type: URegionType): MutPtr<URegion> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(uregion.rawAddress.toString(), type) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetNumericCode(uregion: ConstPtr<URegion>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetNumericCode(uregion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetPreferredValues(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetPreferredValues(uregion.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionCode(uregion: ConstPtr<URegion>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetRegionCode(uregion.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetRegionFromCode(regioncode.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(code, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uregionGetType(uregion: ConstPtr<URegion>): URegionType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUregionGetType(uregion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtClose(reldatefmt: MutPtr<URelativeDateTimeFormatter>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtClose(reldatefmt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCloseResult(ufrdt: MutPtr<UFormattedRelativeDateTime>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtCloseResult(ufrdt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, relativedatestring: ConstPtr<UShort>, relativedatestringlen: Int, timestring: ConstPtr<UShort>, timestringlen: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(reldatefmt.rawAddress.toString(), relativedatestring.rawAddress.toString(), relativedatestringlen, timestring.rawAddress.toString(), timestringlen, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormat(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtFormat(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtFormatToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(reldatefmt.rawAddress.toString(), offset, unit, result.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr<MutPtr<CVoid>>, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr<UErrorCode>): MutPtr<URelativeDateTimeFormatter> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtOpen(locale.rawAddress.toString(), nftoadopt.rawAddress.toString(), width, capitalizationcontext, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedRelativeDateTime> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtOpenResult(ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ureldatefmtResultAsValue(ufrdt: ConstPtr<UFormattedRelativeDateTime>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(ufrdt.rawAddress.toString(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresClose(resourcebundle: MutPtr<UResourceBundle>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresClose(resourcebundle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresGetBinary(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UByte> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetBinary(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexr: Int, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetByIndex(resourcebundle.rawAddress.toString(), indexr, fillin.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetByKey(resourcebundle: ConstPtr<UResourceBundle>, key: Pcstr, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetByKey(resourcebundle.rawAddress.toString(), key.rawAddress.toString(), fillin.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetInt(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetInt(resourcebundle.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetIntVector(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<Int> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetIntVector(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetKey(resourcebundle: ConstPtr<UResourceBundle>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetKey(resourcebundle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetLocaleByType(resourcebundle: ConstPtr<UResourceBundle>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetLocaleByType(resourcebundle.rawAddress.toString(), type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextResource(resourcebundle: MutPtr<UResourceBundle>, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetNextResource(resourcebundle.rawAddress.toString(), fillin.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetNextString(resourcebundle: MutPtr<UResourceBundle>, len: MutPtr<Int>, key: ConstPtr<ConstPtr<Byte>>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetNextString(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), key.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetSize(resourcebundle: ConstPtr<UResourceBundle>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetSize(resourcebundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetString(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetString(resourcebundle.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexs: Int, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetStringByIndex(resourcebundle.rawAddress.toString(), indexs, len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetStringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetStringByKey(resb.rawAddress.toString(), key.rawAddress.toString(), len.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetType(resourcebundle: ConstPtr<UResourceBundle>): UResType =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetType(resourcebundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUint(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): UInt =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetUint(resourcebundle.rawAddress.toString(), status.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8String(resb: ConstPtr<UResourceBundle>, dest: Pcstr, length: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetUtf8String(resb.rawAddress.toString(), dest.rawAddress.toString(), length.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByIndex(resb: ConstPtr<UResourceBundle>, stringindex: Int, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(resb.rawAddress.toString(), stringindex, dest.rawAddress.toString(), plength.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetUtf8StringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(resb.rawAddress.toString(), key.rawAddress.toString(), dest.rawAddress.toString(), plength.rawAddress.toString(), forcecopy.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresGetVersion(resb: ConstPtr<UResourceBundle>, versioninfo: MutPtr<UByte>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresGetVersion(resb.rawAddress.toString(), versioninfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uresHasNext(resourcebundle: ConstPtr<UResourceBundle>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresHasNext(resourcebundle.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresOpen(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresOpenAvailableLocales(packagename.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresOpenDirect(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresOpenU(packagename: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresOpenU(packagename.rawAddress.toString(), locale.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uresResetIterator(resourcebundle: MutPtr<UResourceBundle>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUresResetIterator(resourcebundle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr<UScriptCode>, capacity: Int, err: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetCode(nameorabbrorlocale.rawAddress.toString(), fillin.rawAddress.toString(), capacity, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetName(scriptcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetSampleString(script, dest.rawAddress.toString(), capacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScript(codepoint: Int, err: MutPtr<UErrorCode>): UScriptCode =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetScript(codepoint, err.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr<UScriptCode>, capacity: Int, errorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(c, scripts.rawAddress.toString(), capacity, errorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetShortName(scriptcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptGetUsage(script) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptHasScript(c, sc) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptIsCased(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchClose(searchiter: MutPtr<UStringSearch>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchClose(searchiter.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchFirst(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchFirst(strsrch.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchFollowing(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchFollowing(strsrch.rawAddress.toString(), position, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetAttribute(strsrch: ConstPtr<UStringSearch>, attribute: USearchAttribute): USearchAttributeValue =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetAttribute(strsrch.rawAddress.toString(), attribute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetBreakIterator(strsrch: ConstPtr<UStringSearch>): MutPtr<UBreakIterator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetBreakIterator(strsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetCollator(strsrch: ConstPtr<UStringSearch>): MutPtr<UCollator> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetCollator(strsrch.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedLength(strsrch: ConstPtr<UStringSearch>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetMatchedLength(strsrch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedStart(strsrch: ConstPtr<UStringSearch>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetMatchedStart(strsrch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetMatchedText(strsrch: ConstPtr<UStringSearch>, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetMatchedText(strsrch.rawAddress.toString(), result.rawAddress.toString(), resultcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetOffset(strsrch: ConstPtr<UStringSearch>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetOffset(strsrch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetPattern(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetPattern(strsrch.rawAddress.toString(), length.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchGetText(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchGetText(strsrch.rawAddress.toString(), length.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchLast(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchLast(strsrch.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchNext(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchNext(strsrch.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpen(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, locale: Pcstr, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchOpen(pattern.rawAddress.toString(), patternlength, text.rawAddress.toString(), textlength, locale.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchOpenFromCollator(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, collator: ConstPtr<UCollator>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchOpenFromCollator(pattern.rawAddress.toString(), patternlength, text.rawAddress.toString(), textlength, collator.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPreceding(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchPreceding(strsrch.rawAddress.toString(), position, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchPrevious(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchPrevious(strsrch.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usearchReset(strsrch: MutPtr<UStringSearch>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchReset(strsrch.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetAttribute(strsrch: MutPtr<UStringSearch>, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetAttribute(strsrch.rawAddress.toString(), attribute, value, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetBreakIterator(strsrch: MutPtr<UStringSearch>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetBreakIterator(strsrch.rawAddress.toString(), breakiter.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetCollator(strsrch: MutPtr<UStringSearch>, collator: ConstPtr<UCollator>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetCollator(strsrch.rawAddress.toString(), collator.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetOffset(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetOffset(strsrch.rawAddress.toString(), position, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetPattern(strsrch: MutPtr<UStringSearch>, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetPattern(strsrch.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usearchSetText(strsrch: MutPtr<UStringSearch>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsearchSetText(strsrch.rawAddress.toString(), text.rawAddress.toString(), textlength, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAdd(set: MutPtr<USet>, c: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetAdd(set.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAll(set: MutPtr<USet>, additionalset: ConstPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetAddAll(set.rawAddress.toString(), additionalset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddAllCodePoints(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetAddAllCodePoints(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddRange(set: MutPtr<USet>, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetAddRange(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetAddString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetAddString(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyIntPropertyValue(set: MutPtr<USet>, prop: UProperty, value: Int, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(set.rawAddress.toString(), prop, value, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetApplyPattern(set: MutPtr<USet>, pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetApplyPattern(set.rawAddress.toString(), pattern.rawAddress.toString(), patternlength, options.toInt(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetApplyPropertyAlias(set: MutPtr<USet>, prop: ConstPtr<UShort>, proplength: Int, value: ConstPtr<UShort>, valuelength: Int, ec: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(set.rawAddress.toString(), prop.rawAddress.toString(), proplength, value.rawAddress.toString(), valuelength, ec.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCharAt(set: ConstPtr<USet>, charindex: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetCharAt(set.rawAddress.toString(), charindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClear(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetClear(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetClone(set: ConstPtr<USet>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetClone(set.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetCloneAsThawed(set: ConstPtr<USet>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetCloneAsThawed(set.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetClose(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetClose(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCloseOver(set: MutPtr<USet>, attributes: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetCloseOver(set.rawAddress.toString(), attributes)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetCompact(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetCompact(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplement(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetComplement(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetComplementAll(set: MutPtr<USet>, complement: ConstPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetComplementAll(set.rawAddress.toString(), complement.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetContains(set: ConstPtr<USet>, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContains(set.rawAddress.toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAll(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsAll(set1.rawAddress.toString(), set2.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsAllCodePoints(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(set.rawAddress.toString(), str.rawAddress.toString(), strlen) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsNone(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsNone(set1.rawAddress.toString(), set2.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsRange(set: ConstPtr<USet>, start: Int, end: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsRange(set.rawAddress.toString(), start, end) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsSome(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsSome(set1.rawAddress.toString(), set2.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetContainsString(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetContainsString(set.rawAddress.toString(), str.rawAddress.toString(), strlen) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetEquals(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetEquals(set1.rawAddress.toString(), set2.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetFreeze(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetFreeze(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetGetItem(set: ConstPtr<USet>, itemindex: Int, start: MutPtr<Int>, end: MutPtr<Int>, str: MutPtr<UShort>, strcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetGetItem(set.rawAddress.toString(), itemindex, start.rawAddress.toString(), end.rawAddress.toString(), str.rawAddress.toString(), strcapacity, ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetItemCount(set: ConstPtr<USet>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetGetItemCount(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRange(set: ConstPtr<USerializedSet>, rangeindex: Int, pstart: MutPtr<Int>, pend: MutPtr<Int>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetGetSerializedRange(set.rawAddress.toString(), rangeindex, pstart.rawAddress.toString(), pend.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedRangeCount(set: ConstPtr<USerializedSet>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetGetSerializedSet(fillset: MutPtr<USerializedSet>, src: ConstPtr<UShort>, srclength: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetGetSerializedSet(fillset.rawAddress.toString(), src.rawAddress.toString(), srclength) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIndexOf(set: ConstPtr<USet>, c: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetIndexOf(set.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsEmpty(set: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetIsEmpty(set.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetIsFrozen(set: ConstPtr<USet>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetIsFrozen(set.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpen(start: Int, end: Int): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetOpen(start, end) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenEmpty(): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetOpenEmpty() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPattern(pattern: ConstPtr<UShort>, patternlength: Int, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetOpenPattern(pattern.rawAddress.toString(), patternlength, ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetOpenPatternOptions(pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetOpenPatternOptions(pattern.rawAddress.toString(), patternlength, options.toInt(), ec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRemove(set: MutPtr<USet>, c: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRemove(set.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAll(set: MutPtr<USet>, removeset: ConstPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRemoveAll(set.rawAddress.toString(), removeset.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveAllStrings(set: MutPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRemoveAllStrings(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveRange(set: MutPtr<USet>, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRemoveRange(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRemoveString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRemoveString(set.rawAddress.toString(), str.rawAddress.toString(), strlen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetResemblesPattern(pattern: ConstPtr<UShort>, patternlength: Int, pos: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetResemblesPattern(pattern.rawAddress.toString(), patternlength, pos) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetRetain(set: MutPtr<USet>, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRetain(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetRetainAll(set: MutPtr<USet>, retain: ConstPtr<USet>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetRetainAll(set.rawAddress.toString(), retain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSerialize(set: ConstPtr<USet>, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSerialize(set.rawAddress.toString(), dest.rawAddress.toString(), destcapacity, perrorcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSerializedContains(set: ConstPtr<USerializedSet>, c: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSerializedContains(set.rawAddress.toString(), c) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSet(set: MutPtr<USet>, start: Int, end: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSet(set.rawAddress.toString(), start, end)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSetSerializedToOne(fillset: MutPtr<USerializedSet>, c: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSetSerializedToOne(fillset.rawAddress.toString(), c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usetSize(set: ConstPtr<USet>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSize(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpan(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSpan(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBack(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSpanBack(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanBackUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSpanBackUtf8(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetSpanUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetSpanUtf8(set.rawAddress.toString(), s.rawAddress.toString(), length, spancondition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usetToPattern(set: ConstPtr<USet>, result: MutPtr<UShort>, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsetToPattern(set.rawAddress.toString(), result.rawAddress.toString(), resultcapacity, escapeunprintable.toInt(), ec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusable(sc: ConstPtr<USpoofChecker>, id1: ConstPtr<UShort>, length1: Int, id2: ConstPtr<UShort>, length2: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofAreConfusable(sc.rawAddress.toString(), id1.rawAddress.toString(), length1, id2.rawAddress.toString(), length2, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofAreConfusableUtf8(sc: ConstPtr<USpoofChecker>, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(sc.rawAddress.toString(), id1.rawAddress.toString(), length1, id2.rawAddress.toString(), length2, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofCheck(sc.rawAddress.toString(), id.rawAddress.toString(), length, position.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofCheck2(sc.rawAddress.toString(), id.rawAddress.toString(), length, checkresult.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheck2Utf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofCheck2Utf8(sc.rawAddress.toString(), id.rawAddress.toString(), length, checkresult.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofCheckUtf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofCheckUtf8(sc.rawAddress.toString(), id.rawAddress.toString(), length, position.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClone(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofClone(sc.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofClose(sc: MutPtr<USpoofChecker>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofClose(sc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofCloseCheckResult(checkresult: MutPtr<USpoofCheckResult>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofCloseCheckResult(checkresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofGetAllowedChars(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetAllowedChars(sc.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetAllowedLocales(sc: MutPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(sc.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultChecks(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(checkresult.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultNumerics(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(checkresult.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): URestrictionLevel =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(checkresult.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetChecks(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetChecks(sc.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetInclusionSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetInclusionSet(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRecommendedSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetRestrictionLevel(sc: ConstPtr<USpoofChecker>): URestrictionLevel =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(sc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeleton(sc: ConstPtr<USpoofChecker>, type: UInt, id: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetSkeleton(sc.rawAddress.toString(), type.toInt(), id.rawAddress.toString(), length, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofGetSkeletonUtf8(sc: ConstPtr<USpoofChecker>, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(sc.rawAddress.toString(), type.toInt(), id.rawAddress.toString(), length, dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpen(status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofOpen(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenCheckResult(status: MutPtr<UErrorCode>): MutPtr<USpoofCheckResult> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofOpenCheckResult(status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSerialized(data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(data.rawAddress.toString(), length, pactuallength.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr<Int>, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofOpenFromSource(confusables.rawAddress.toString(), confusableslen, confusableswholescript.rawAddress.toString(), confusableswholescriptlen, errtype.rawAddress.toString(), pe.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSerialize(sc: MutPtr<USpoofChecker>, data: MutPtr<CVoid>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofSerialize(sc.rawAddress.toString(), data.rawAddress.toString(), capacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uspoofSetAllowedChars(sc: MutPtr<USpoofChecker>, chars: ConstPtr<USet>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofSetAllowedChars(sc.rawAddress.toString(), chars.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetAllowedLocales(sc: MutPtr<USpoofChecker>, localeslist: Pcstr, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(sc.rawAddress.toString(), localeslist.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetChecks(sc: MutPtr<USpoofChecker>, checks: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofSetChecks(sc.rawAddress.toString(), checks, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uspoofSetRestrictionLevel(sc: MutPtr<USpoofChecker>, restrictionlevel: URestrictionLevel) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(sc.rawAddress.toString(), restrictionlevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepClose(profile: MutPtr<UStringPrepProfile>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsprepClose(profile.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsprepOpen(path.rawAddress.toString(), filename.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsprepOpenByType(type, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usprepPrepare(prep: ConstPtr<UStringPrepProfile>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destcapacity: Int, options: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUsprepPrepare(prep.rawAddress.toString(), src.rawAddress.toString(), srclength, dest.rawAddress.toString(), destcapacity, options, parseerror.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextChar32At(ut: MutPtr<UText>, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextChar32At(ut.rawAddress.toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClone(dest: MutPtr<UText>, src: ConstPtr<UText>, deep: Byte, readonly: Byte, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextClone(dest.rawAddress.toString(), src.rawAddress.toString(), deep.toInt(), readonly.toInt(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextClose(ut: MutPtr<UText>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextClose(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextCopy(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextCopy(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), destindex.toString(), move.toInt(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextCurrent32(ut: MutPtr<UText>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextCurrent32(ut.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextEquals(a: ConstPtr<UText>, b: ConstPtr<UText>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextEquals(a.rawAddress.toString(), b.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextExtract(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextExtract(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), dest.rawAddress.toString(), destcapacity, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextFreeze(ut: MutPtr<UText>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextFreeze(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextGetNativeIndex(ut: ConstPtr<UText>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextGetNativeIndex(ut.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextGetPreviousNativeIndex(ut: MutPtr<UText>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(ut.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextHasMetaData(ut: ConstPtr<UText>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextHasMetaData(ut.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsLengthExpensive(ut: ConstPtr<UText>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextIsLengthExpensive(ut.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextIsWritable(ut: ConstPtr<UText>): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextIsWritable(ut.rawAddress.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextMoveIndex32(ut: MutPtr<UText>, delta: Int): Byte =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextMoveIndex32(ut.rawAddress.toString(), delta) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNativeLength(ut: MutPtr<UText>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextNativeLength(ut.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32(ut: MutPtr<UText>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextNext32(ut.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextNext32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextNext32From(ut.rawAddress.toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUchars(ut: MutPtr<UText>, s: ConstPtr<UShort>, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextOpenUchars(ut.rawAddress.toString(), s.rawAddress.toString(), length.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextOpenUtf8(ut: MutPtr<UText>, s: Pcstr, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextOpenUtf8(ut.rawAddress.toString(), s.rawAddress.toString(), length.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32(ut: MutPtr<UText>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextPrevious32(ut.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextPrevious32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextPrevious32From(ut.rawAddress.toString(), nativeindex.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextReplace(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr<UShort>, replacementlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextReplace(ut.rawAddress.toString(), nativestart.toString(), nativelimit.toString(), replacementtext.rawAddress.toString(), replacementlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utextSetNativeIndex(ut: MutPtr<UText>, nativeindex: Long) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextSetNativeIndex(ut.rawAddress.toString(), nativeindex.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utextSetup(ut: MutPtr<UText>, extraspace: Int, status: MutPtr<UErrorCode>): MutPtr<UText> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtextSetup(ut.rawAddress.toString(), extraspace, status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8AppendCharSafeBody(s: MutPtr<UByte>, i: Int, length: Int, c: Int, piserror: MutPtr<Byte>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(s.rawAddress.toString(), i, length, c, piserror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8Back1SafeBody(s: ConstPtr<UByte>, start: Int, i: Int): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtf8Back1SafeBody(s.rawAddress.toString(), start, i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8NextCharSafeBody(s: ConstPtr<UByte>, pi: MutPtr<Int>, length: Int, c: Int, strict: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(s.rawAddress.toString(), pi.rawAddress.toString(), length, c, strict.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utf8PrevCharSafeBody(s: ConstPtr<UByte>, start: Int, pi: MutPtr<Int>, c: Int, strict: Byte): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(s.rawAddress.toString(), start, pi.rawAddress.toString(), c, strict.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtmscaleFromInt64(othertime.toString(), timescale, status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(timescale, value, status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtmscaleToInt64(universaltime.toString(), timescale, status.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceFormat(outbuf.rawAddress.toString(), capacity, indent, fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    if (windowsWin32GlobalizationNapiAddon != null) ConstPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceFunctionName(fnnumber) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceGetFunctions(context: ConstPtr<ConstPtr<CVoid>>, e: MutPtr<UTraceEntry>, x: MutPtr<UTraceExit>, d: MutPtr<UTraceData>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceGetFunctions(context.rawAddress.toString(), e.rawAddress.toString(), x.rawAddress.toString(), d.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceGetLevel(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceGetLevel() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utraceSetFunctions(context: ConstPtr<CVoid>, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceSetFunctions(context.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceSetLevel(tracelevel: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr<Byte>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtraceVformat(outbuf.rawAddress.toString(), capacity, indent, fmt.rawAddress.toString(), args.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClone(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransClone(trans.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransClose(trans: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransClose(trans.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransCountAvailableIds(): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransCountAvailableIds() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetSourceSet(trans: ConstPtr<ConstPtr<CVoid>>, ignorefilter: Byte, fillin: MutPtr<USet>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransGetSourceSet(trans.rawAddress.toString(), ignorefilter.toInt(), fillin.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransGetUnicodeId(trans: ConstPtr<ConstPtr<CVoid>>, resultlength: MutPtr<Int>): MutPtr<UShort> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransGetUnicodeId(trans.rawAddress.toString(), resultlength.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenIds(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransOpenIds(perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenInverse(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransOpenInverse(trans.rawAddress.toString(), status.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransOpenU(id: ConstPtr<UShort>, idlength: Int, dir: UTransDirection, rules: ConstPtr<UShort>, ruleslength: Int, parseerror: MutPtr<UParseError>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    if (windowsWin32GlobalizationNapiAddon != null) MutPtr((windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransOpenU(id.rawAddress.toString(), idlength, dir, rules.rawAddress.toString(), ruleslength, parseerror.rawAddress.toString(), perrorcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransRegister(adoptedtrans: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransRegister(adoptedtrans.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransSetFilter(trans: MutPtr<MutPtr<CVoid>>, filterpattern: ConstPtr<UShort>, filterpatternlen: Int, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransSetFilter(trans.rawAddress.toString(), filterpattern.rawAddress.toString(), filterpatternlen, status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransToRules(trans: ConstPtr<ConstPtr<CVoid>>, escapeunprintable: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    if (windowsWin32GlobalizationNapiAddon != null) (windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransToRules(trans.rawAddress.toString(), escapeunprintable.toInt(), result.rawAddress.toString(), resultlength, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utransTrans(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransTrans(trans.rawAddress.toString(), rep.rawAddress.toString(), repfunc.rawAddress.toString(), start, limit.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncremental(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransTransIncremental(trans.rawAddress.toString(), rep.rawAddress.toString(), repfunc.rawAddress.toString(), pos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransIncrementalUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(trans.rawAddress.toString(), text.rawAddress.toString(), textlength.rawAddress.toString(), textcapacity, pos.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransTransUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransTransUchars(trans.rawAddress.toString(), text.rawAddress.toString(), textlength.rawAddress.toString(), textcapacity, start, limit.rawAddress.toString(), status.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utransUnregisterId(id: ConstPtr<UShort>, idlength: Int) {
    if (windowsWin32GlobalizationNapiAddon != null) {
        windowsWin32GlobalizationNapiAddon.windowssysWindowsWin32GlobalizationUtransUnregisterId(id.rawAddress.toString(), idlength)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
