@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.ETO_OPTIONS
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

private val _windowsWin32GlobalizationNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_AdjustCalendarDate(lpcaldatetime.toString(), calunit, amount) as Int) else 0

public actual fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_CompareStringA(locale.toInt(), dwcmpflags.toInt(), lpstring1.toString(), cchcount1, lpstring2.toString(), cchcount2) as Int) else 0

public actual fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: LPARAM): COMPARESTRING_RESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_CompareStringEx(lplocalename.toString(), dwcmpflags.toInt(), lpstring1.toString(), cchcount1, lpstring2.toString(), cchcount2, lpversioninformation.toString(), lpreserved.toString(), lparam.toString()) as Int) else 0

public actual fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_CompareStringOrdinal(lpstring1.toString(), cchcount1, lpstring2.toString(), cchcount2, bignorecase) as Int) else 0

public actual fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_CompareStringW(locale.toInt(), dwcmpflags.toInt(), lpstring1.toString(), cchcount1, lpstring2.toString(), cchcount2) as Int) else 0

public actual fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ConvertCalDateTimeToSystemTime(lpcaldatetime.toString(), lpsystime.toString()) as Int) else 0

public actual fun ConvertDefaultLocale(locale: UInt): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ConvertDefaultLocale(locale.toInt()) as Int).toUInt() else 0u

public actual fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ConvertSystemTimeToCalDateTime(lpsystime.toString(), calid.toInt(), lpcaldatetime.toString()) as Int) else 0

public actual fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumCalendarInfoA(lpcalinfoenumproc.toLong().toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else 0

public actual fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumCalendarInfoExA(lpcalinfoenumprocex.toLong().toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else 0

public actual fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: LPARAM): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumCalendarInfoExEx(pcalinfoenumprocexex.toLong().toString(), lplocalename.toString(), calendar.toInt(), lpreserved.toString(), caltype.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumCalendarInfoExW(lpcalinfoenumprocex.toLong().toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else 0

public actual fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumCalendarInfoW(lpcalinfoenumproc.toLong().toString(), locale.toInt(), calendar.toInt(), caltype.toInt()) as Int) else 0

public actual fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumDateFormatsA(lpdatefmtenumproc.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumDateFormatsExA(lpdatefmtenumprocex.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: LPARAM): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumDateFormatsExEx(lpdatefmtenumprocexex.toLong().toString(), lplocalename.toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumDateFormatsExW(lpdatefmtenumprocex.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumDateFormatsW(lpdatefmtenumproc.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc.toLong().toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc.toLong().toString(), languagegroup.toInt(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemCodePagesA(lpcodepageenumproc.toLong().toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemCodePagesW(lpcodepageenumproc.toLong().toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemGeoID(geoclass.toInt(), parentgeoid, lpgeoenumproc.toLong().toString()) as Int) else 0

public actual fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: LPARAM): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemGeoNames(geoclass.toInt(), geoenumproc.toLong().toString(), data.toString()) as Int) else 0

public actual fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsA(lplanguagegroupenumproc.toLong().toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsW(lplanguagegroupenumproc.toLong().toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemLocalesA(lplocaleenumproc.toLong().toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: LPARAM, lpreserved: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemLocalesEx(lplocaleenumprocex.toLong().toString(), dwflags.toInt(), lparam.toString(), lpreserved.toString()) as Int) else 0

public actual fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumSystemLocalesW(lplocaleenumproc.toLong().toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumTimeFormatsA(lptimefmtenumproc.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: LPARAM): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumTimeFormatsEx(lptimefmtenumprocex.toLong().toString(), lplocalename.toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumTimeFormatsW(lptimefmtenumproc.toLong().toString(), locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumUILanguagesA(lpuilanguageenumproc.toLong().toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_EnumUILanguagesW(lpuilanguageenumproc.toLong().toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_FindNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), lpstringsource.toString(), cchsource, lpstringvalue.toString(), cchvalue, pcchfound.toString()) as Int) else 0

public actual fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_FindNLSStringEx(lplocalename.toString(), dwfindnlsstringflags.toInt(), lpstringsource.toString(), cchsource, lpstringvalue.toString(), cchvalue, pcchfound.toString(), lpversioninformation.toString(), lpreserved.toString(), sorthandle.toString()) as Int) else 0

public actual fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_FindStringOrdinal(dwfindstringordinalflags.toInt(), lpstringsource.toString(), cchsource, lpstringvalue.toString(), cchvalue, bignorecase) as Int) else 0

public actual fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_FoldStringA(dwmapflags.toInt(), lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_FoldStringW(dwmapflags.toInt(), lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun GetACP(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetACP() as Int).toUInt() else 0u

public actual fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCPInfo(codepage.toInt(), lpcpinfo.toString()) as Int) else 0

public actual fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCPInfoExA(codepage.toInt(), dwflags.toInt(), lpcpinfoex.toString()) as Int) else 0

public actual fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCPInfoExW(codepage.toInt(), dwflags.toInt(), lpcpinfoex.toString()) as Int) else 0

public actual fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCalendarDateFormatEx(lpszlocale.toString(), dwflags.toInt(), lpcaldatetime.toString(), lpformat.toString(), lpdatestr.toString(), cchdate) as Int) else 0

public actual fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.toString(), cchdata, lpvalue.toString()) as Int) else 0

public actual fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCalendarInfoEx(lplocalename.toString(), calendar.toInt(), lpreserved.toString(), caltype.toInt(), lpcaldata.toString(), cchdata, lpvalue.toString()) as Int) else 0

public actual fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.toString(), cchdata, lpvalue.toString()) as Int) else 0

public actual fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCalendarSupportedDateRange(calendar.toInt(), lpcalmindatetime.toString(), lpcalmaxdatetime.toString()) as Int) else 0

public actual fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCurrencyFormatA(locale.toInt(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpcurrencystr.toString(), cchcurrency) as Int) else 0

public actual fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCurrencyFormatEx(lplocalename.toString(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpcurrencystr.toString(), cchcurrency) as Int) else 0

public actual fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetCurrencyFormatW(locale.toInt(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpcurrencystr.toString(), cchcurrency) as Int) else 0

public actual fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDateFormatA(locale.toInt(), dwflags.toInt(), lpdate.toString(), lpformat.toString(), lpdatestr.toString(), cchdate) as Int) else 0

public actual fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDateFormatEx(lplocalename.toString(), dwflags.toInt(), lpdate.toString(), lpformat.toString(), lpdatestr.toString(), cchdate, lpcalendar.toString()) as Int) else 0

public actual fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDateFormatW(locale.toInt(), dwflags.toInt(), lpdate.toString(), lpformat.toString(), lpdatestr.toString(), cchdate) as Int) else 0

public actual fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDistanceOfClosestLanguageInList(pszlanguage.toString(), pszlanguageslist.toString(), wchlistdelimiter.toInt(), pclosestdistance.toString()) as Int) else 0

public actual fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDurationFormat(locale.toInt(), dwflags.toInt(), lpduration.toString(), ullduration.toString(), lpformat.toString(), lpdurationstr.toString(), cchduration) as Int) else 0

public actual fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetDurationFormatEx(lplocalename.toString(), dwflags.toInt(), lpduration.toString(), ullduration.toString(), lpformat.toString(), lpdurationstr.toString(), cchduration) as Int) else 0

public actual fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetFileMUIInfo(dwflags.toInt(), pcwszfilepath.toString(), pfilemuiinfo.toString(), pcbfilemuiinfo.toString()) as Int) else 0

public actual fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetFileMUIPath(dwflags.toInt(), pcwszfilepath.toString(), pwszlanguage.toString(), pcchlanguage.toString(), pwszfilemuipath.toString(), pcchfilemuipath.toString(), pululenumerator.toString()) as Int) else 0

public actual fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetGeoInfoA(location, geotype, lpgeodata.toString(), cchdata, langid.toInt()) as Int) else 0

public actual fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetGeoInfoEx(location.toString(), geotype, geodata.toString(), geodatacount) as Int) else 0

public actual fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetGeoInfoW(location, geotype, lpgeodata.toString(), cchdata, langid.toInt()) as Int) else 0

public actual fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.toString(), cchdata) as Int) else 0

public actual fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetLocaleInfoEx(lplocalename.toString(), lctype.toInt(), lplcdata.toString(), cchdata) as Int) else 0

public actual fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.toString(), cchdata) as Int) else 0

public actual fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetNLSVersion(function.toInt(), locale.toInt(), lpversioninformation.toString()) as Int) else 0

public actual fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetNLSVersionEx(function.toInt(), lplocalename.toString(), lpversioninformation.toString()) as Int) else 0

public actual fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetNumberFormatA(locale.toInt(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpnumberstr.toString(), cchnumber) as Int) else 0

public actual fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetNumberFormatEx(lplocalename.toString(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpnumberstr.toString(), cchnumber) as Int) else 0

public actual fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetNumberFormatW(locale.toInt(), dwflags.toInt(), lpvalue.toString(), lpformat.toString(), lpnumberstr.toString(), cchnumber) as Int) else 0

public actual fun GetOEMCP(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetOEMCP() as Int).toUInt() else 0u

public actual fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetProcessPreferredUILanguages(dwflags.toInt(), pulnumlanguages.toString(), pwszlanguagesbuffer.toString(), pcchlanguagesbuffer.toString()) as Int) else 0

public actual fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetStringScripts(dwflags.toInt(), lpstring.toString(), cchstring, lpscripts.toString(), cchscripts) as Int) else 0

public actual fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetStringTypeA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.toString(), cchsrc, lpchartype.toString()) as Int) else 0

public actual fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetStringTypeExA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.toString(), cchsrc, lpchartype.toString()) as Int) else 0

public actual fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetStringTypeExW(locale.toInt(), dwinfotype.toInt(), lpsrcstr.toString(), cchsrc, lpchartype.toString()) as Int) else 0

public actual fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetStringTypeW(dwinfotype.toInt(), lpsrcstr.toString(), cchsrc, lpchartype.toString()) as Int) else 0

public actual fun GetSystemDefaultLCID(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetSystemDefaultLCID() as Int).toUInt() else 0u

public actual fun GetSystemDefaultLangID(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetSystemDefaultLangID() as Int).toUShort() else 0u

public actual fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetSystemDefaultLocaleName(lplocalename.toString(), cchlocalename) as Int) else 0

public actual fun GetSystemDefaultUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetSystemDefaultUILanguage() as Int).toUShort() else 0u

public actual fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetSystemPreferredUILanguages(dwflags.toInt(), pulnumlanguages.toString(), pwszlanguagesbuffer.toString(), pcchlanguagesbuffer.toString()) as Int) else 0

public actual fun GetTextCharset(hdc: HDC): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetTextCharset(hdc.toString()) as Int) else 0

public actual fun GetTextCharsetInfo(hdc: HDC, lpsig: Long, dwflags: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetTextCharsetInfo(hdc.toString(), lpsig.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetThreadLocale(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetThreadLocale() as Int).toUInt() else 0u

public actual fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetThreadPreferredUILanguages(dwflags.toInt(), pulnumlanguages.toString(), pwszlanguagesbuffer.toString(), pcchlanguagesbuffer.toString()) as Int) else 0

public actual fun GetThreadUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetThreadUILanguage() as Int).toUShort() else 0u

public actual fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetTimeFormatA(locale.toInt(), dwflags.toInt(), lptime.toString(), lpformat.toString(), lptimestr.toString(), cchtime) as Int) else 0

public actual fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetTimeFormatEx(lplocalename.toString(), dwflags.toInt(), lptime.toString(), lpformat.toString(), lptimestr.toString(), cchtime) as Int) else 0

public actual fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetTimeFormatW(locale.toInt(), dwflags.toInt(), lptime.toString(), lpformat.toString(), lptimestr.toString(), cchtime) as Int) else 0

public actual fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUILanguageInfo(dwflags.toInt(), pwmszlanguage.toString(), pwszfallbacklanguages.toString(), pcchfallbacklanguages.toString(), pattributes.toString()) as Int) else 0

public actual fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserDefaultGeoName(geoname.toString(), geonamecount) as Int) else 0

public actual fun GetUserDefaultLCID(): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserDefaultLCID() as Int).toUInt() else 0u

public actual fun GetUserDefaultLangID(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserDefaultLangID() as Int).toUShort() else 0u

public actual fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserDefaultLocaleName(lplocalename.toString(), cchlocalename) as Int) else 0

public actual fun GetUserDefaultUILanguage(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserDefaultUILanguage() as Int).toUShort() else 0u

public actual fun GetUserGeoID(geoclass: SYSGEOCLASS): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserGeoID(geoclass) as Int) else 0

public actual fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_GetUserPreferredUILanguages(dwflags.toInt(), pulnumlanguages.toString(), pwszlanguagesbuffer.toString(), pcchlanguagesbuffer.toString()) as Int) else 0

public actual fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IdnToAscii(dwflags.toInt(), lpunicodecharstr.toString(), cchunicodechar, lpasciicharstr.toString(), cchasciichar) as Int) else 0

public actual fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IdnToNameprepUnicode(dwflags.toInt(), lpunicodecharstr.toString(), cchunicodechar, lpnameprepcharstr.toString(), cchnameprepchar) as Int) else 0

public actual fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IdnToUnicode(dwflags.toInt(), lpasciicharstr.toString(), cchasciichar, lpunicodecharstr.toString(), cchunicodechar) as Int) else 0

public actual fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt()) as Int) else 0

public actual fun IsDBCSLeadByte(testchar: UByte): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsDBCSLeadByte(testchar.toInt()) as Int) else 0

public actual fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsDBCSLeadByteEx(codepage.toInt(), testchar.toInt()) as Int) else 0

public actual fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsNLSDefinedString(function.toInt(), dwflags.toInt(), lpversioninformation.toString(), lpstring.toString(), cchstr) as Int) else 0

public actual fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsNormalizedString(normform, lpstring.toString(), cwlength) as Int) else 0

public actual fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsTextUnicode(lpv.toString(), isize, lpiresult.toString()) as Int) else 0

public actual fun IsValidCodePage(codepage: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsValidCodePage(codepage.toInt()) as Int) else 0

public actual fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt()) as Int) else 0

public actual fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsValidLocale(locale.toInt(), dwflags.toInt()) as Int) else 0

public actual fun IsValidLocaleName(lplocalename: PCWSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsValidLocaleName(lplocalename.toString()) as Int) else 0

public actual fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsValidNLSVersion(function.toInt(), lplocalename.toString(), lpversioninformation.toString()) as Int).toUInt() else 0u

public actual fun IsWellFormedTag(psztag: PCWSTR): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_IsWellFormedTag(psztag.toString()) as Int).toUByte() else 0u

public actual fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_LCIDToLocaleName(locale.toInt(), lpname.toString(), cchname, dwflags.toInt()) as Int) else 0

public actual fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_LCMapStringA(locale.toInt(), dwmapflags.toInt(), lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_LCMapStringEx(lplocalename.toString(), dwmapflags.toInt(), lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest, lpversioninformation.toString(), lpreserved.toString(), sorthandle.toString()) as Int) else 0

public actual fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_LCMapStringW(locale.toInt(), dwmapflags.toInt(), lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_LocaleNameToLCID(lpname.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MappingDoAction(pbag.toString(), dwrangeindex.toInt(), pszactionid.toString()) as Int) else 0

public actual fun MappingFreePropertyBag(pbag: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MappingFreePropertyBag(pbag.toString()) as Int) else 0

public actual fun MappingFreeServices(pserviceinfo: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MappingFreeServices(pserviceinfo.toString()) as Int) else 0

public actual fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MappingGetServices(poptions.toString(), prgservices.toString(), pdwservicescount.toString()) as Int) else 0

public actual fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MappingRecognizeText(pserviceinfo.toString(), psztext.toString(), dwlength.toInt(), dwindex.toInt(), poptions.toString(), pbag.toString()) as Int) else 0

public actual fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_MultiByteToWideChar(codepage.toInt(), dwflags.toInt(), lpmultibytestr.toString(), cbmultibyte, lpwidecharstr.toString(), cchwidechar) as Int) else 0

public actual fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_NormalizeString(normform, lpsrcstring.toString(), cwsrclength, lpdststring.toString(), cwdstlength) as Int) else 0

public actual fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_NotifyUILanguageChange(dwflags.toInt(), pcwstrnewlanguage.toString(), pcwstrpreviouslanguage.toString(), dwreserved.toInt(), pdwstatusrtrn.toString()) as Int) else 0

public actual fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ResolveLocaleName(lpnametoresolve.toString(), lplocalename.toString(), cchlocalename) as Int) else 0

public actual fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_RestoreThreadPreferredUILanguages(snapshot.toString())
    }
}

public actual fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptApplyDigitSubstitution(psds.toString(), psc.toString(), pss.toString()) as Int) else 0

public actual fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptApplyLogicalWidth(pidx.toString(), cchars, cglyphs, pwlogclust.toString(), psva.toString(), piadvance.toString(), psa.toString(), pabc.toString(), pijustify.toString()) as Int) else 0

public actual fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptBreak(pwcchars.toString(), cchars, psa.toString(), psla.toString()) as Int) else 0

public actual fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust.toString(), psva.toString(), piadvance.toString(), psa.toString(), pix.toString()) as Int) else 0

public actual fun ScriptCacheGetHeight(hdc: HDC, psc: Long, tmheight: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptCacheGetHeight(hdc.toString(), psc.toString(), tmheight.toString()) as Int) else 0

public actual fun ScriptFreeCache(psc: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptFreeCache(psc.toString()) as Int) else 0

public actual fun ScriptGetCMap(hdc: HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetCMap(hdc.toString(), psc.toString(), pwcinchars.toString(), cchars, dwflags.toInt(), pwoutglyphs.toString()) as Int) else 0

public actual fun ScriptGetFontAlternateGlyphs(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetFontAlternateGlyphs(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toInt(), cmaxalternates, palternateglyphs.toString(), pcalternates.toString()) as Int) else 0

public actual fun ScriptGetFontFeatureTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetFontFeatureTags(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), taglangsys.toInt(), cmaxtags, pfeaturetags.toString(), pctags.toString()) as Int) else 0

public actual fun ScriptGetFontLanguageTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetFontLanguageTags(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), cmaxtags, plangsystags.toString(), pctags.toString()) as Int) else 0

public actual fun ScriptGetFontProperties(hdc: HDC, psc: Long, sfp: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetFontProperties(hdc.toString(), psc.toString(), sfp.toString()) as Int) else 0

public actual fun ScriptGetFontScriptTags(hdc: HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetFontScriptTags(hdc.toString(), psc.toString(), psa.toString(), cmaxtags, pscripttags.toString(), pctags.toString()) as Int) else 0

public actual fun ScriptGetGlyphABCWidth(hdc: HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetGlyphABCWidth(hdc.toString(), psc.toString(), wglyph.toInt(), pabc.toString()) as Int) else 0

public actual fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetLogicalWidths(psa.toString(), cchars, cglyphs, piglyphwidth.toString(), pwlogclust.toString(), psva.toString(), pidx.toString()) as Int) else 0

public actual fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptGetProperties(ppsp.toString(), pinumscripts.toString()) as Int) else 0

public actual fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptIsComplex(pwcinchars.toString(), cinchars, dwflags.toInt()) as Int) else 0

public actual fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptItemize(pwcinchars.toString(), cinchars, cmaxitems, pscontrol.toString(), psstate.toString(), pitems.toString(), pcitems.toString()) as Int) else 0

public actual fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptItemizeOpenType(pwcinchars.toString(), cinchars, cmaxitems, pscontrol.toString(), psstate.toString(), pitems.toString(), pscripttags.toString(), pcitems.toString()) as Int) else 0

public actual fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptJustify(psva.toString(), piadvance.toString(), cglyphs, idx, iminkashida, pijustify.toString()) as Int) else 0

public actual fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptLayout(cruns, pblevel.toString(), pivisualtological.toString(), pilogicaltovisual.toString()) as Int) else 0

public actual fun ScriptPlace(hdc: HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptPlace(hdc.toString(), psc.toString(), pwglyphs.toString(), cglyphs, psva.toString(), psa.toString(), piadvance.toString(), pgoffset.toString(), pabc.toString()) as Int) else 0

public actual fun ScriptPlaceOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptPlaceOpenType(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.toString(), rprangeproperties.toString(), cranges, pwcchars.toString(), pwlogclust.toString(), pcharprops.toString(), cchars, pwglyphs.toString(), pglyphprops.toString(), cglyphs, piadvance.toString(), pgoffset.toString(), pabc.toString()) as Int) else 0

public actual fun ScriptPositionSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT =
    0

public actual fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptRecordDigitSubstitution(locale.toInt(), psds.toString()) as Int) else 0

public actual fun ScriptShape(hdc: HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptShape(hdc.toString(), psc.toString(), pwcchars.toString(), cchars, cmaxglyphs, psa.toString(), pwoutglyphs.toString(), pwlogclust.toString(), psva.toString(), pcglyphs.toString()) as Int) else 0

public actual fun ScriptShapeOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptShapeOpenType(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), taglangsys.toInt(), rcrangechars.toString(), rprangeproperties.toString(), cranges, pwcchars.toString(), cchars, cmaxglyphs, pwlogclust.toString(), pcharprops.toString(), pwoutglyphs.toString(), poutglyphprops.toString(), pcglyphs.toString()) as Int) else 0

public actual fun ScriptStringAnalyse(hdc: HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringAnalyse(hdc.toString(), pstring.toString(), cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, pscontrol.toString(), psstate.toString(), pidx.toString(), ptabdef.toString(), pbinclass.toString(), pssa.toString()) as Int) else 0

public actual fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringCPtoX(ssa.toString(), icp, ftrailing, px.toString()) as Int) else 0

public actual fun ScriptStringFree(pssa: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringFree(pssa.toString()) as Int) else 0

public actual fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringGetLogicalWidths(ssa.toString(), pidx.toString()) as Int) else 0

public actual fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringGetOrder(ssa.toString(), puorder.toString()) as Int) else 0

public actual fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringOut(ssa.toString(), ix, iy, uoptions.toInt(), prc.toString(), iminsel, imaxsel, fdisabled) as Int) else 0

public actual fun ScriptStringValidate(ssa: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringValidate(ssa.toString()) as Int) else 0

public actual fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptStringXtoCP(ssa.toString(), ix, pich.toString(), pitrailing.toString()) as Int) else 0

public actual fun ScriptString_pLogAttr(ssa: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptString_pLogAttr(ssa.toString()) as String).toLong() else 0L

public actual fun ScriptString_pSize(ssa: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptString_pSize(ssa.toString()) as String).toLong() else 0L

public actual fun ScriptString_pcOutChars(ssa: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptString_pcOutChars(ssa.toString()) as String).toLong() else 0L

public actual fun ScriptSubstituteSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptSubstituteSingleGlyph(hdc.toString(), psc.toString(), psa.toString(), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toInt(), pwoutglyphid.toString()) as Int) else 0

public actual fun ScriptTextOut(hdc: HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptTextOut(hdc.toString(), psc.toString(), x, y, fuoptions.toInt(), lprc.toString(), psa.toString(), pwcreserved.toString(), ireserved, pwglyphs.toString(), cglyphs, piadvance.toString(), pijustify.toString(), pgoffset.toString()) as Int) else 0

public actual fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ScriptXtoCP(ix, cchars, cglyphs, pwlogclust.toString(), psva.toString(), piadvance.toString(), psa.toString(), picp.toString(), pitrailing.toString()) as Int) else 0

public actual fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.toString()) as Int) else 0

public actual fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.toString()) as Int) else 0

public actual fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.toString()) as Int) else 0

public actual fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.toString()) as Int) else 0

public actual fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetProcessPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.toString(), pulnumlanguages.toString()) as Int) else 0

public actual fun SetThreadLocale(locale: UInt): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetThreadLocale(locale.toInt()) as Int) else 0

public actual fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.toString(), pulnumlanguages.toString()) as Int) else 0

public actual fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages2(flags.toInt(), languages.toString(), numlanguagesset.toString(), snapshot.toString()) as Int) else 0

public actual fun SetThreadUILanguage(langid: UShort): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetThreadUILanguage(langid.toInt()) as Int).toUShort() else 0u

public actual fun SetUserGeoID(geoid: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetUserGeoID(geoid) as Int) else 0

public actual fun SetUserGeoName(geoname: PCWSTR): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_SetUserGeoName(geoname.toString()) as Int) else 0

public actual fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_TranslateCharsetInfo(lpsrc.toString(), lpcs.toString(), dwflags.toInt()) as Int) else 0

public actual fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_ESCAPE(context.toString(), fromuargs.toString(), codeunits.toString(), length, codepoint, reason, err.toString())
    }
}

public actual fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SKIP(context.toString(), fromuargs.toString(), codeunits.toString(), length, codepoint, reason, err.toString())
    }
}

public actual fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_STOP(context.toString(), fromuargs.toString(), codeunits.toString(), length, codepoint, reason, err.toString())
    }
}

public actual fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SUBSTITUTE(context.toString(), fromuargs.toString(), codeunits.toString(), length, codepoint, reason, err.toString())
    }
}

public actual fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_ESCAPE(context.toString(), touargs.toString(), codeunits.toString(), length, reason, err.toString())
    }
}

public actual fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SKIP(context.toString(), touargs.toString(), codeunits.toString(), length, reason, err.toString())
    }
}

public actual fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_STOP(context.toString(), touargs.toString(), codeunits.toString(), length, reason, err.toString())
    }
}

public actual fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SUBSTITUTE(context.toString(), touargs.toString(), codeunits.toString(), length, reason, err.toString())
    }
}

public actual fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_UpdateCalendarDayOfWeek(lpcaldatetime.toString()) as Int) else 0

public actual fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_VerifyScripts(dwflags.toInt(), lplocalescripts.toString(), cchlocalescripts, lptestscripts.toString(), cchtestscripts) as Int) else 0

public actual fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_WideCharToMultiByte(codepage.toInt(), dwflags.toInt(), lpwidecharstr.toString(), cchwidechar, lpmultibytestr.toString(), cbmultibyte, lpdefaultchar.toString(), lpuseddefaultchar.toString()) as Int) else 0

public actual fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcatA(lpstring1.toString(), lpstring2.toString()) as String).toLong() else 0L

public actual fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcatW(lpstring1.toString(), lpstring2.toString()) as String).toLong() else 0L

public actual fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpA(lpstring1.toString(), lpstring2.toString()) as Int) else 0

public actual fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpW(lpstring1.toString(), lpstring2.toString()) as Int) else 0

public actual fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpiA(lpstring1.toString(), lpstring2.toString()) as Int) else 0

public actual fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcmpiW(lpstring1.toString(), lpstring2.toString()) as Int) else 0

public actual fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpyA(lpstring1.toString(), lpstring2.toString()) as String).toLong() else 0L

public actual fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpyW(lpstring1.toString(), lpstring2.toString()) as String).toLong() else 0L

public actual fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpynA(lpstring1.toString(), lpstring2.toString(), imaxlength) as String).toLong() else 0L

public actual fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrcpynW(lpstring1.toString(), lpstring2.toString(), imaxlength) as String).toLong() else 0L

public actual fun lstrlenA(lpstring: PCSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrlenA(lpstring.toString()) as Int) else 0

public actual fun lstrlenW(lpstring: PCWSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_lstrlenW(lpstring.toString()) as Int) else 0

public actual fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_UCharsToChars(us.toString(), cs.toString(), length)
    }
}

public actual fun u_austrcpy(dst: PCSTR, src: Long): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_austrcpy(dst.toString(), src.toString()) as String).toLong() else 0L

public actual fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_austrncpy(dst.toString(), src.toString(), n) as String).toLong() else 0L

public actual fun u_catclose(catd: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_catclose(catd.toString())
    }
}

public actual fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_catgets(catd.toString(), set_num, msg_num, s.toString(), len.toString(), ec.toString()) as String).toLong() else 0L

public actual fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_catopen(name.toString(), locale.toString(), ec.toString()) as String).toLong() else 0L

public actual fun u_charAge(c: Int, versionarray: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charAge(c, versionarray.toString())
    }
}

public actual fun u_charDigitValue(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charDigitValue(c) as Int) else 0

public actual fun u_charDirection(c: Int): UCharDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charDirection(c) as Int) else 0

public actual fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charFromName(namechoice, name.toString(), perrorcode.toString()) as Int) else 0

public actual fun u_charMirror(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charMirror(c) as Int) else 0

public actual fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charName(code, namechoice, buffer.toString(), bufferlength, perrorcode.toString()) as Int) else 0

public actual fun u_charType(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charType(c) as Int).toByte() else 0

public actual fun u_charsToUChars(cs: PCSTR, us: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_charsToUChars(cs.toString(), us.toString(), length)
    }
}

public actual fun u_cleanup() {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_cleanup()
    }
}

public actual fun u_countChar32(s: Long, length: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_countChar32(s.toString(), length) as Int) else 0

public actual fun u_digit(ch: Int, radix: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_digit(ch, radix.toInt()) as Int) else 0

public actual fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_enumCharNames(start, limit, fn.toString(), context.toString(), namechoice, perrorcode.toString())
    }
}

public actual fun u_enumCharTypes(enumrange: Long, context: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_enumCharTypes(enumrange.toString(), context.toString())
    }
}

public actual fun u_errorName(code: UErrorCode): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_errorName(code) as String).toLong() else 0L

public actual fun u_foldCase(c: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_foldCase(c, options.toInt()) as Int) else 0

public actual fun u_forDigit(digit: Int, radix: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_forDigit(digit, radix.toInt()) as Int) else 0

public actual fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long): Int =
    0

public actual fun u_getBidiPairedBracket(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getBidiPairedBracket(c) as Int) else 0

public actual fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getBinaryPropertySet(property, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_getCombiningClass(c: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getCombiningClass(c) as Int).toUByte() else 0u

public actual fun u_getDataVersion(dataversionfillin: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getDataVersion(dataversionfillin.toString(), status.toString())
    }
}

public actual fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getFC_NFKC_Closure(c, dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getIntPropertyMap(property, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_getIntPropertyMaxValue(which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getIntPropertyMaxValue(which) as Int) else 0

public actual fun u_getIntPropertyMinValue(which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getIntPropertyMinValue(which) as Int) else 0

public actual fun u_getIntPropertyValue(c: Int, which: UProperty): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getIntPropertyValue(c, which) as Int) else 0

public actual fun u_getNumericValue(c: Int): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getNumericValue(c) as Double) else 0.0

public actual fun u_getPropertyEnum(alias: PCSTR): UProperty =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getPropertyEnum(alias.toString()) as Int) else 0

public actual fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getPropertyName(property, namechoice) as String).toLong() else 0L

public actual fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getPropertyValueEnum(property, alias.toString()) as Int) else 0

public actual fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getPropertyValueName(property, value, namechoice) as String).toLong() else 0L

public actual fun u_getUnicodeVersion(versionarray: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getUnicodeVersion(versionarray.toString())
    }
}

public actual fun u_getVersion(versionarray: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_getVersion(versionarray.toString())
    }
}

public actual fun u_hasBinaryProperty(c: Int, which: UProperty): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_hasBinaryProperty(c, which) as Int).toByte() else 0

public actual fun u_init(status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_init(status.toString())
    }
}

public actual fun u_isIDIgnorable(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isIDIgnorable(c) as Int).toByte() else 0

public actual fun u_isIDPart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isIDPart(c) as Int).toByte() else 0

public actual fun u_isIDStart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isIDStart(c) as Int).toByte() else 0

public actual fun u_isISOControl(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isISOControl(c) as Int).toByte() else 0

public actual fun u_isJavaIDPart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isJavaIDPart(c) as Int).toByte() else 0

public actual fun u_isJavaIDStart(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isJavaIDStart(c) as Int).toByte() else 0

public actual fun u_isJavaSpaceChar(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isJavaSpaceChar(c) as Int).toByte() else 0

public actual fun u_isMirrored(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isMirrored(c) as Int).toByte() else 0

public actual fun u_isUAlphabetic(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isUAlphabetic(c) as Int).toByte() else 0

public actual fun u_isULowercase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isULowercase(c) as Int).toByte() else 0

public actual fun u_isUUppercase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isUUppercase(c) as Int).toByte() else 0

public actual fun u_isUWhiteSpace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isUWhiteSpace(c) as Int).toByte() else 0

public actual fun u_isWhitespace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isWhitespace(c) as Int).toByte() else 0

public actual fun u_isalnum(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isalnum(c) as Int).toByte() else 0

public actual fun u_isalpha(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isalpha(c) as Int).toByte() else 0

public actual fun u_isbase(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isbase(c) as Int).toByte() else 0

public actual fun u_isblank(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isblank(c) as Int).toByte() else 0

public actual fun u_iscntrl(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_iscntrl(c) as Int).toByte() else 0

public actual fun u_isdefined(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isdefined(c) as Int).toByte() else 0

public actual fun u_isdigit(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isdigit(c) as Int).toByte() else 0

public actual fun u_isgraph(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isgraph(c) as Int).toByte() else 0

public actual fun u_islower(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_islower(c) as Int).toByte() else 0

public actual fun u_isprint(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isprint(c) as Int).toByte() else 0

public actual fun u_ispunct(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_ispunct(c) as Int).toByte() else 0

public actual fun u_isspace(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isspace(c) as Int).toByte() else 0

public actual fun u_istitle(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_istitle(c) as Int).toByte() else 0

public actual fun u_isupper(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isupper(c) as Int).toByte() else 0

public actual fun u_isxdigit(c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_isxdigit(c) as Int).toByte() else 0

public actual fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memcasecmp(s1.toString(), s2.toString(), length, options.toInt()) as Int) else 0

public actual fun u_memchr(s: Long, c: UShort, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memchr(s.toString(), c.toInt(), count) as String).toLong() else 0L

public actual fun u_memchr32(s: Long, c: Int, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memchr32(s.toString(), c, count) as String).toLong() else 0L

public actual fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memcmp(buf1.toString(), buf2.toString(), count) as Int) else 0

public actual fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memcmpCodePointOrder(s1.toString(), s2.toString(), count) as Int) else 0

public actual fun u_memcpy(dest: Long, src: Long, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memcpy(dest.toString(), src.toString(), count) as String).toLong() else 0L

public actual fun u_memmove(dest: Long, src: Long, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memmove(dest.toString(), src.toString(), count) as String).toLong() else 0L

public actual fun u_memrchr(s: Long, c: UShort, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memrchr(s.toString(), c.toInt(), count) as String).toLong() else 0L

public actual fun u_memrchr32(s: Long, c: Int, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memrchr32(s.toString(), c, count) as String).toLong() else 0L

public actual fun u_memset(dest: Long, c: UShort, count: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_memset(dest.toString(), c.toInt(), count) as String).toLong() else 0L

public actual fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long) {
}

public actual fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long) {
}

public actual fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_setMemoryFunctions(context.toString(), a.toString(), r.toString(), f.toString(), status.toString())
    }
}

public actual fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_shapeArabic(source.toString(), sourcelength, dest.toString(), destsize, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strCaseCompare(s1.toString(), length1, s2.toString(), length2, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strCompare(s1.toString(), length1, s2.toString(), length2, codepointorder.toInt()) as Int) else 0

public actual fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strCompareIter(iter1.toString(), iter2.toString(), codepointorder.toInt()) as Int) else 0

public actual fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFindFirst(s.toString(), length, substring.toString(), sublength) as String).toLong() else 0L

public actual fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFindLast(s.toString(), length, substring.toString(), sublength) as String).toLong() else 0L

public actual fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFoldCase(dest.toString(), destcapacity, src.toString(), srclength, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromJavaModifiedUTF8WithSub(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, subchar, pnumsubstitutions.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromUTF32(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromUTF32WithSub(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, subchar, pnumsubstitutions.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromUTF8(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromUTF8Lenient(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromUTF8WithSub(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, subchar, pnumsubstitutions.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strFromWCS(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strHasMoreChar32Than(s.toString(), length, number) as Int).toByte() else 0

public actual fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToJavaModifiedUTF8(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToLower(dest.toString(), destcapacity, src.toString(), srclength, locale.toString(), perrorcode.toString()) as Int) else 0

public actual fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToTitle(dest.toString(), destcapacity, src.toString(), srclength, titleiter.toString(), locale.toString(), perrorcode.toString()) as Int) else 0

public actual fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToUTF32(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToUTF32WithSub(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, subchar, pnumsubstitutions.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToUTF8(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToUTF8WithSub(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, subchar, pnumsubstitutions.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToUpper(dest.toString(), destcapacity, src.toString(), srclength, locale.toString(), perrorcode.toString()) as Int) else 0

public actual fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strToWCS(dest.toString(), destcapacity, pdestlength.toString(), src.toString(), srclength, perrorcode.toString()) as String).toLong() else 0L

public actual fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcasecmp(s1.toString(), s2.toString(), options.toInt()) as Int) else 0

public actual fun u_strcat(dst: Long, src: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcat(dst.toString(), src.toString()) as String).toLong() else 0L

public actual fun u_strchr(s: Long, c: UShort): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strchr(s.toString(), c.toInt()) as String).toLong() else 0L

public actual fun u_strchr32(s: Long, c: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strchr32(s.toString(), c) as String).toLong() else 0L

public actual fun u_strcmp(s1: Long, s2: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcmp(s1.toString(), s2.toString()) as Int) else 0

public actual fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcmpCodePointOrder(s1.toString(), s2.toString()) as Int) else 0

public actual fun u_strcpy(dst: Long, src: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcpy(dst.toString(), src.toString()) as String).toLong() else 0L

public actual fun u_strcspn(string: Long, matchset: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strcspn(string.toString(), matchset.toString()) as Int) else 0

public actual fun u_strlen(s: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strlen(s.toString()) as Int) else 0

public actual fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strncasecmp(s1.toString(), s2.toString(), n, options.toInt()) as Int) else 0

public actual fun u_strncat(dst: Long, src: Long, n: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strncat(dst.toString(), src.toString(), n) as String).toLong() else 0L

public actual fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strncmp(ucs1.toString(), ucs2.toString(), n) as Int) else 0

public actual fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strncmpCodePointOrder(s1.toString(), s2.toString(), n) as Int) else 0

public actual fun u_strncpy(dst: Long, src: Long, n: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strncpy(dst.toString(), src.toString(), n) as String).toLong() else 0L

public actual fun u_strpbrk(string: Long, matchset: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strpbrk(string.toString(), matchset.toString()) as String).toLong() else 0L

public actual fun u_strrchr(s: Long, c: UShort): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strrchr(s.toString(), c.toInt()) as String).toLong() else 0L

public actual fun u_strrchr32(s: Long, c: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strrchr32(s.toString(), c) as String).toLong() else 0L

public actual fun u_strrstr(s: Long, substring: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strrstr(s.toString(), substring.toString()) as String).toLong() else 0L

public actual fun u_strspn(string: Long, matchset: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strspn(string.toString(), matchset.toString()) as Int) else 0

public actual fun u_strstr(s: Long, substring: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strstr(s.toString(), substring.toString()) as String).toLong() else 0L

public actual fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_strtok_r(src.toString(), delim.toString(), savestate.toString()) as String).toLong() else 0L

public actual fun u_tolower(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_tolower(c) as Int) else 0

public actual fun u_totitle(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_totitle(c) as Int) else 0

public actual fun u_toupper(c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_toupper(c) as Int) else 0

public actual fun u_uastrcpy(dst: Long, src: PCSTR): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_uastrcpy(dst.toString(), src.toString()) as String).toLong() else 0L

public actual fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_uastrncpy(dst.toString(), src.toString(), n) as String).toLong() else 0L

public actual fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_unescape(src.toString(), dest.toString(), destcapacity) as Int) else 0

public actual fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_unescapeAt(charat.toLong().toString(), offset.toString(), length, context.toString()) as Int) else 0

public actual fun u_versionFromString(versionarray: Long, versionstring: PCSTR) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_versionFromString(versionarray.toString(), versionstring.toString())
    }
}

public actual fun u_versionFromUString(versionarray: Long, versionstring: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_versionFromUString(versionarray.toString(), versionstring.toString())
    }
}

public actual fun u_versionToString(versionarray: Long, versionstring: PCSTR) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_versionToString(versionarray.toString(), versionstring.toString())
    }
}

public actual fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_vformatMessage(locale.toString(), pattern.toString(), patternlength, result.toString(), resultlength, ap.toString(), status.toString()) as Int) else 0

public actual fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_vformatMessageWithError(locale.toString(), pattern.toString(), patternlength, result.toString(), resultlength, parseerror.toString(), ap.toString(), status.toString()) as Int) else 0

public actual fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_vparseMessage(locale.toString(), pattern.toString(), patternlength, source.toString(), sourcelength, ap.toString(), status.toString())
    }
}

public actual fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_u_vparseMessageWithError(locale.toString(), pattern.toString(), patternlength, source.toString(), sourcelength, ap.toString(), parseerror.toString(), status.toString())
    }
}

public actual fun ubidi_close(pbidi: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_close(pbidi.toString())
    }
}

public actual fun ubidi_countParagraphs(pbidi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_countParagraphs(pbidi.toString()) as Int) else 0

public actual fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_countRuns(pbidi.toString(), perrorcode.toString()) as Int) else 0

public actual fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getBaseDirection(text.toString(), length) as Int) else 0

public actual fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getClassCallback(pbidi.toString(), fn.toString(), context.toString())
    }
}

public actual fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getCustomizedClass(pbidi.toString(), c) as Int) else 0

public actual fun ubidi_getDirection(pbidi: Long): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getDirection(pbidi.toString()) as Int) else 0

public actual fun ubidi_getLength(pbidi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLength(pbidi.toString()) as Int) else 0

public actual fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLevelAt(pbidi.toString(), charindex) as Int).toUByte() else 0u

public actual fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLevels(pbidi.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLogicalIndex(pbidi.toString(), visualindex, perrorcode.toString()) as Int) else 0

public actual fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLogicalMap(pbidi.toString(), indexmap.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getLogicalRun(pbidi.toString(), logicalposition, plogicallimit.toString(), plevel.toString())
    }
}

public actual fun ubidi_getParaLevel(pbidi: Long): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getParaLevel(pbidi.toString()) as Int).toUByte() else 0u

public actual fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getParagraph(pbidi.toString(), charindex, pparastart.toString(), pparalimit.toString(), pparalevel.toString(), perrorcode.toString()) as Int) else 0

public actual fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getParagraphByIndex(pbidi.toString(), paraindex, pparastart.toString(), pparalimit.toString(), pparalevel.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_getProcessedLength(pbidi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getProcessedLength(pbidi.toString()) as Int) else 0

public actual fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getReorderingMode(pbidi.toString()) as Int) else 0

public actual fun ubidi_getReorderingOptions(pbidi: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getReorderingOptions(pbidi.toString()) as Int).toUInt() else 0u

public actual fun ubidi_getResultLength(pbidi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getResultLength(pbidi.toString()) as Int) else 0

public actual fun ubidi_getText(pbidi: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getText(pbidi.toString()) as String).toLong() else 0L

public actual fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getVisualIndex(pbidi.toString(), logicalindex, perrorcode.toString()) as Int) else 0

public actual fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getVisualMap(pbidi.toString(), indexmap.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_getVisualRun(pbidi.toString(), runindex, plogicalstart.toString(), plength.toString()) as Int) else 0

public actual fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_invertMap(srcmap.toString(), destmap.toString(), length)
    }
}

public actual fun ubidi_isInverse(pbidi: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_isInverse(pbidi.toString()) as Int).toByte() else 0

public actual fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_isOrderParagraphsLTR(pbidi.toString()) as Int).toByte() else 0

public actual fun ubidi_open(): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_open() as String).toLong() else 0L

public actual fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_openSized(maxlength, maxruncount, perrorcode.toString()) as String).toLong() else 0L

public actual fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_orderParagraphsLTR(pbidi.toString(), orderparagraphsltr.toInt())
    }
}

public actual fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_reorderLogical(levels.toString(), length, indexmap.toString())
    }
}

public actual fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_reorderVisual(levels.toString(), length, indexmap.toString())
    }
}

public actual fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setClassCallback(pbidi.toString(), newfn.toLong().toString(), newcontext.toString(), oldfn.toString(), oldcontext.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setContext(pbidi.toString(), prologue.toString(), prolength, epilogue.toString(), epilength, perrorcode.toString())
    }
}

public actual fun ubidi_setInverse(pbidi: Long, isinverse: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setInverse(pbidi.toString(), isinverse.toInt())
    }
}

public actual fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setLine(pparabidi.toString(), start, limit, plinebidi.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setPara(pbidi.toString(), text.toString(), length, paralevel.toInt(), embeddinglevels.toString(), perrorcode.toString())
    }
}

public actual fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setReorderingMode(pbidi.toString(), reorderingmode)
    }
}

public actual fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_setReorderingOptions(pbidi.toString(), reorderingoptions.toInt())
    }
}

public actual fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_writeReordered(pbidi.toString(), dest.toString(), destsize, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubidi_writeReverse(src.toString(), srclength, dest.toString(), destsize, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun ubiditransform_close(pbiditransform: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransform_close(pbiditransform.toString())
    }
}

public actual fun ubiditransform_open(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransform_open(perrorcode.toString()) as String).toLong() else 0L

public actual fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubiditransform_transform(pbiditransform.toString(), src.toString(), srclength, dest.toString(), destsize, inparalevel.toInt(), inorder, outparalevel.toInt(), outorder, domirroring, shapingoptions.toInt(), perrorcode.toString()) as Int).toUInt() else 0u

public actual fun ublock_getCode(c: Int): UBlockCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ublock_getCode(c) as Int) else 0

public actual fun ubrk_close(bi: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_close(bi.toString())
    }
}

public actual fun ubrk_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_countAvailable() as Int) else 0

public actual fun ubrk_current(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_current(bi.toString()) as Int) else 0

public actual fun ubrk_first(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_first(bi.toString()) as Int) else 0

public actual fun ubrk_following(bi: Long, offset: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_following(bi.toString(), offset) as Int) else 0

public actual fun ubrk_getAvailable(index: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_getAvailable(index) as String).toLong() else 0L

public actual fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_getBinaryRules(bi.toString(), binaryrules.toString(), rulescapacity, status.toString()) as Int) else 0

public actual fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_getLocaleByType(bi.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun ubrk_getRuleStatus(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_getRuleStatus(bi.toString()) as Int) else 0

public actual fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_getRuleStatusVec(bi.toString(), fillinvec.toString(), capacity, status.toString()) as Int) else 0

public actual fun ubrk_isBoundary(bi: Long, offset: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_isBoundary(bi.toString(), offset) as Int).toByte() else 0

public actual fun ubrk_last(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_last(bi.toString()) as Int) else 0

public actual fun ubrk_next(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_next(bi.toString()) as Int) else 0

public actual fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_open(type, locale.toString(), text.toString(), textlength, status.toString()) as String).toLong() else 0L

public actual fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_openBinaryRules(binaryrules.toString(), ruleslength, text.toString(), textlength, status.toString()) as String).toLong() else 0L

public actual fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_openRules(rules.toString(), ruleslength, text.toString(), textlength, parseerr.toString(), status.toString()) as String).toLong() else 0L

public actual fun ubrk_preceding(bi: Long, offset: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_preceding(bi.toString(), offset) as Int) else 0

public actual fun ubrk_previous(bi: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_previous(bi.toString()) as Int) else 0

public actual fun ubrk_refreshUText(bi: Long, text: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_refreshUText(bi.toString(), text.toString(), status.toString())
    }
}

public actual fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_safeClone(bi.toString(), stackbuffer.toString(), pbuffersize.toString(), status.toString()) as String).toLong() else 0L

public actual fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_setText(bi.toString(), text.toString(), textlength, status.toString())
    }
}

public actual fun ubrk_setUText(bi: Long, text: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ubrk_setUText(bi.toString(), text.toString(), status.toString())
    }
}

public actual fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_add(cal.toString(), field, amount, status.toString())
    }
}

public actual fun ucal_clear(calendar: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_clear(calendar.toString())
    }
}

public actual fun ucal_clearField(cal: Long, field: UCalendarDateFields) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_clearField(cal.toString(), field)
    }
}

public actual fun ucal_clone(cal: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_clone(cal.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucal_close(cal: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_close(cal.toString())
    }
}

public actual fun ucal_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_countAvailable() as Int) else 0

public actual fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_equivalentTo(cal1.toString(), cal2.toString()) as Int).toByte() else 0

public actual fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_get(cal.toString(), field, status.toString()) as Int) else 0

public actual fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getAttribute(cal.toString(), attr) as Int) else 0

public actual fun ucal_getAvailable(localeindex: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getAvailable(localeindex) as String).toLong() else 0L

public actual fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getCanonicalTimeZoneID(id.toString(), len, result.toString(), resultcapacity, issystemid.toString(), status.toString()) as Int) else 0

public actual fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getDSTSavings(zoneid.toString(), ec.toString()) as Int) else 0

public actual fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getDayOfWeekType(cal.toString(), dayofweek, status.toString()) as Int) else 0

public actual fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getDefaultTimeZone(result.toString(), resultcapacity, ec.toString()) as Int) else 0

public actual fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getFieldDifference(cal.toString(), target, field, status.toString()) as Int) else 0

public actual fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getGregorianChange(cal.toString(), perrorcode.toString()) as Double) else 0.0

public actual fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getHostTimeZone(result.toString(), resultcapacity, ec.toString()) as Int) else 0

public actual fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getKeywordValuesForLocale(key.toString(), locale.toString(), commonlyused.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getLimit(cal.toString(), field, type, status.toString()) as Int) else 0

public actual fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getLocaleByType(cal.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun ucal_getMillis(cal: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getMillis(cal.toString(), status.toString()) as Double) else 0.0

public actual fun ucal_getNow(): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getNow() as Double) else 0.0

public actual fun ucal_getTZDataVersion(status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getTZDataVersion(status.toString()) as String).toLong() else 0L

public actual fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getTimeZoneDisplayName(cal.toString(), type, locale.toString(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getTimeZoneID(cal.toString(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getTimeZoneIDForWindowsID(winid.toString(), len, region.toString(), id.toString(), idcapacity, status.toString()) as Int) else 0

public actual fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getTimeZoneTransitionDate(cal.toString(), type, transition.toString(), status.toString()) as Int).toByte() else 0

public actual fun ucal_getType(cal: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getType(cal.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getWeekendTransition(cal.toString(), dayofweek, status.toString()) as Int) else 0

public actual fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_getWindowsTimeZoneID(id.toString(), len, winid.toString(), winidcapacity, status.toString()) as Int) else 0

public actual fun ucal_inDaylightTime(cal: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_inDaylightTime(cal.toString(), status.toString()) as Int).toByte() else 0

public actual fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_isSet(cal.toString(), field) as Int).toByte() else 0

public actual fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_isWeekend(cal.toString(), date, status.toString()) as Int).toByte() else 0

public actual fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_open(zoneid.toString(), len, locale.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_openCountryTimeZones(country.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_openTimeZoneIDEnumeration(zonetype, region.toString(), rawoffset.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ucal_openTimeZones(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_openTimeZones(ec.toString()) as String).toLong() else 0L

public actual fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_roll(cal.toString(), field, amount, status.toString())
    }
}

public actual fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_set(cal.toString(), field, value)
    }
}

public actual fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setAttribute(cal.toString(), attr, newvalue)
    }
}

public actual fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setDate(cal.toString(), year, month, date, status.toString())
    }
}

public actual fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setDateTime(cal.toString(), year, month, date, hour, minute, second, status.toString())
    }
}

public actual fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setDefaultTimeZone(zoneid.toString(), ec.toString())
    }
}

public actual fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setGregorianChange(cal.toString(), date, perrorcode.toString())
    }
}

public actual fun ucal_setMillis(cal: Long, datetime: Double, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setMillis(cal.toString(), datetime, status.toString())
    }
}

public actual fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucal_setTimeZone(cal.toString(), zoneid.toString(), len, status.toString())
    }
}

public actual fun ucasemap_close(csm: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_close(csm.toString())
    }
}

public actual fun ucasemap_getBreakIterator(csm: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_getBreakIterator(csm.toString()) as String).toLong() else 0L

public actual fun ucasemap_getLocale(csm: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_getLocale(csm.toString()) as String).toLong() else 0L

public actual fun ucasemap_getOptions(csm: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_getOptions(csm.toString()) as Int).toUInt() else 0u

public actual fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_open(locale.toString(), options.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_setBreakIterator(csm.toString(), itertoadopt.toString(), perrorcode.toString())
    }
}

public actual fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_setLocale(csm.toString(), locale.toString(), perrorcode.toString())
    }
}

public actual fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_setOptions(csm.toString(), options.toInt(), perrorcode.toString())
    }
}

public actual fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_toTitle(csm.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_utf8FoldCase(csm.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_utf8ToLower(csm.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_utf8ToTitle(csm.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucasemap_utf8ToUpper(csm.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucfpos_close(ucfpos: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_close(ucfpos.toString())
    }
}

public actual fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_constrainCategory(ucfpos.toString(), category, ec.toString())
    }
}

public actual fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_constrainField(ucfpos.toString(), category, field, ec.toString())
    }
}

public actual fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_getCategory(ucfpos.toString(), ec.toString()) as Int) else 0

public actual fun ucfpos_getField(ucfpos: Long, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_getField(ucfpos.toString(), ec.toString()) as Int) else 0

public actual fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_getIndexes(ucfpos.toString(), pstart.toString(), plimit.toString(), ec.toString())
    }
}

public actual fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_getInt64IterationContext(ucfpos.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_matchesField(ucfpos.toString(), category, field, ec.toString()) as Int).toByte() else 0

public actual fun ucfpos_open(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_open(ec.toString()) as String).toLong() else 0L

public actual fun ucfpos_reset(ucfpos: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_reset(ucfpos.toString(), ec.toString())
    }
}

public actual fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_setInt64IterationContext(ucfpos.toString(), context.toString(), ec.toString())
    }
}

public actual fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucfpos_setState(ucfpos.toString(), category, field, start, limit, ec.toString())
    }
}

public actual fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_cbFromUWriteBytes(args.toString(), source.toString(), length, offsetindex, err.toString())
    }
}

public actual fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_cbFromUWriteSub(args.toString(), offsetindex, err.toString())
    }
}

public actual fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_cbFromUWriteUChars(args.toString(), source.toString(), sourcelimit.toString(), offsetindex, err.toString())
    }
}

public actual fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_cbToUWriteSub(args.toString(), offsetindex, err.toString())
    }
}

public actual fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_cbToUWriteUChars(args.toString(), source.toString(), length, offsetindex, err.toString())
    }
}

public actual fun ucnv_close(converter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_close(converter.toString())
    }
}

public actual fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_compareNames(name1.toString(), name2.toString()) as Int) else 0

public actual fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_convert(toconvertername.toString(), fromconvertername.toString(), target.toString(), targetcapacity, source.toString(), sourcelength, perrorcode.toString()) as Int) else 0

public actual fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_convertEx(targetcnv.toString(), sourcecnv.toString(), target.toString(), targetlimit.toString(), source.toString(), sourcelimit.toString(), pivotstart.toString(), pivotsource.toString(), pivottarget.toString(), pivotlimit.toString(), reset.toInt(), flush.toInt(), perrorcode.toString())
    }
}

public actual fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_countAliases(alias.toString(), perrorcode.toString()) as Int).toUShort() else 0u

public actual fun ucnv_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_countAvailable() as Int) else 0

public actual fun ucnv_countStandards(): UShort =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_countStandards() as Int).toUShort() else 0u

public actual fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_detectUnicodeSignature(source.toString(), sourcelength, signaturelength.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_fixFileSeparator(cnv.toString(), source.toString(), sourcelen)
    }
}

public actual fun ucnv_flushCache(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_flushCache() as Int) else 0

public actual fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_fromAlgorithmic(cnv.toString(), algorithmictype, target.toString(), targetcapacity, source.toString(), sourcelength, perrorcode.toString()) as Int) else 0

public actual fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_fromUChars(cnv.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucnv_fromUCountPending(cnv: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_fromUCountPending(cnv.toString(), status.toString()) as Int) else 0

public actual fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_fromUnicode(converter.toString(), target.toString(), targetlimit.toString(), source.toString(), sourcelimit.toString(), offsets.toString(), flush.toInt(), err.toString())
    }
}

public actual fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getAlias(alias.toString(), n.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getAliases(alias.toString(), aliases.toString(), perrorcode.toString())
    }
}

public actual fun ucnv_getAvailableName(n: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getAvailableName(n) as String).toLong() else 0L

public actual fun ucnv_getCCSID(converter: Long, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getCCSID(converter.toString(), err.toString()) as Int) else 0

public actual fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getCanonicalName(alias.toString(), standard.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_getDefaultName(): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getDefaultName() as String).toLong() else 0L

public actual fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getDisplayName(converter.toString(), displaylocale.toString(), displayname.toString(), displaynamecapacity, err.toString()) as Int) else 0

public actual fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getFromUCallBack(converter.toString(), action.toString(), context.toString())
    }
}

public actual fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getInvalidChars(converter.toString(), errbytes.toString(), len.toString(), err.toString())
    }
}

public actual fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getInvalidUChars(converter.toString(), erruchars.toString(), len.toString(), err.toString())
    }
}

public actual fun ucnv_getMaxCharSize(converter: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getMaxCharSize(converter.toString()) as Int).toByte() else 0

public actual fun ucnv_getMinCharSize(converter: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getMinCharSize(converter.toString()) as Int).toByte() else 0

public actual fun ucnv_getName(converter: Long, err: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getName(converter.toString(), err.toString()) as String).toLong() else 0L

public actual fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getNextUChar(converter.toString(), source.toString(), sourcelimit.toString(), err.toString()) as Int) else 0

public actual fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getPlatform(converter.toString(), err.toString()) as Int) else 0

public actual fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getStandard(n.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getStandardName(name.toString(), standard.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_getStarters(converter: Long, starters: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getStarters(converter.toString(), starters.toString(), err.toString())
    }
}

public actual fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getSubstChars(converter.toString(), subchars.toString(), len.toString(), err.toString())
    }
}

public actual fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getToUCallBack(converter.toString(), action.toString(), context.toString())
    }
}

public actual fun ucnv_getType(converter: Long): UConverterType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getType(converter.toString()) as Int) else 0

public actual fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_getUnicodeSet(cnv.toString(), setfillin.toString(), whichset, perrorcode.toString())
    }
}

public actual fun ucnv_isAmbiguous(cnv: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_isAmbiguous(cnv.toString()) as Int).toByte() else 0

public actual fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_isFixedWidth(cnv.toString(), status.toString()) as Int).toByte() else 0

public actual fun ucnv_open(convertername: PCSTR, err: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_open(convertername.toString(), err.toString()) as String).toLong() else 0L

public actual fun ucnv_openAllNames(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_openAllNames(perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_openCCSID(codepage, platform, err.toString()) as String).toLong() else 0L

public actual fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_openPackage(packagename.toString(), convertername.toString(), err.toString()) as String).toLong() else 0L

public actual fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_openStandardNames(convname.toString(), standard.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucnv_openU(name: Long, err: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_openU(name.toString(), err.toString()) as String).toLong() else 0L

public actual fun ucnv_reset(converter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_reset(converter.toString())
    }
}

public actual fun ucnv_resetFromUnicode(converter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_resetFromUnicode(converter.toString())
    }
}

public actual fun ucnv_resetToUnicode(converter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_resetToUnicode(converter.toString())
    }
}

public actual fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_safeClone(cnv.toString(), stackbuffer.toString(), pbuffersize.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucnv_setDefaultName(name: PCSTR) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setDefaultName(name.toString())
    }
}

public actual fun ucnv_setFallback(cnv: Long, usesfallback: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setFallback(cnv.toString(), usesfallback.toInt())
    }
}

public actual fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setFromUCallBack(converter.toString(), newaction.toLong().toString(), newcontext.toString(), oldaction.toString(), oldcontext.toString(), err.toString())
    }
}

public actual fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setSubstChars(converter.toString(), subchars.toString(), len.toInt(), err.toString())
    }
}

public actual fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setSubstString(cnv.toString(), s.toString(), length, err.toString())
    }
}

public actual fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_setToUCallBack(converter.toString(), newaction.toLong().toString(), newcontext.toString(), oldaction.toString(), oldcontext.toString(), err.toString())
    }
}

public actual fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_toAlgorithmic(algorithmictype, cnv.toString(), target.toString(), targetcapacity, source.toString(), sourcelength, perrorcode.toString()) as Int) else 0

public actual fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_toUChars(cnv.toString(), dest.toString(), destcapacity, src.toString(), srclength, perrorcode.toString()) as Int) else 0

public actual fun ucnv_toUCountPending(cnv: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_toUCountPending(cnv.toString(), status.toString()) as Int) else 0

public actual fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_toUnicode(converter.toString(), target.toString(), targetlimit.toString(), source.toString(), sourcelimit.toString(), offsets.toString(), flush.toInt(), err.toString())
    }
}

public actual fun ucnv_usesFallback(cnv: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnv_usesFallback(cnv.toString()) as Int).toByte() else 0

public actual fun ucnvsel_close(sel: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_close(sel.toString())
    }
}

public actual fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_open(converterlist.toString(), converterlistsize, excludedcodepoints.toString(), whichset, status.toString()) as String).toLong() else 0L

public actual fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_openFromSerialized(buffer.toString(), length, status.toString()) as String).toLong() else 0L

public actual fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_selectForString(sel.toString(), s.toString(), length, status.toString()) as String).toLong() else 0L

public actual fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_selectForUTF8(sel.toString(), s.toString(), length, status.toString()) as String).toLong() else 0L

public actual fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucnvsel_serialize(sel.toString(), buffer.toString(), buffercapacity, status.toString()) as Int) else 0

public actual fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_cloneBinary(coll.toString(), buffer.toString(), capacity, status.toString()) as Int) else 0

public actual fun ucol_close(coll: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_close(coll.toString())
    }
}

public actual fun ucol_closeElements(elems: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_closeElements(elems.toString())
    }
}

public actual fun ucol_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_countAvailable() as Int) else 0

public actual fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_equal(coll.toString(), source.toString(), sourcelength, target.toString(), targetlength) as Int).toByte() else 0

public actual fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getAttribute(coll.toString(), attr, status.toString()) as Int) else 0

public actual fun ucol_getAvailable(localeindex: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getAvailable(localeindex) as String).toLong() else 0L

public actual fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getBound(source.toString(), sourcelength, boundtype, nooflevels.toInt(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getContractionsAndExpansions(coll.toString(), contractions.toString(), expansions.toString(), addprefixes.toInt(), status.toString())
    }
}

public actual fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getDisplayName(objloc.toString(), disploc.toString(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getEquivalentReorderCodes(reordercode, dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getFunctionalEquivalent(result.toString(), resultcapacity, keyword.toString(), locale.toString(), isavailable.toString(), status.toString()) as Int) else 0

public actual fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getKeywordValues(keyword.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getKeywordValuesForLocale(key.toString(), locale.toString(), commonlyused.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ucol_getKeywords(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getKeywords(status.toString()) as String).toLong() else 0L

public actual fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getLocaleByType(coll.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun ucol_getMaxExpansion(elems: Long, order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getMaxExpansion(elems.toString(), order) as Int) else 0

public actual fun ucol_getMaxVariable(coll: Long): UColReorderCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getMaxVariable(coll.toString()) as Int) else 0

public actual fun ucol_getOffset(elems: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getOffset(elems.toString()) as Int) else 0

public actual fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getReorderCodes(coll.toString(), dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun ucol_getRules(coll: Long, length: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getRules(coll.toString(), length.toString()) as String).toLong() else 0L

public actual fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getRulesEx(coll.toString(), delta, buffer.toString(), bufferlen) as Int) else 0

public actual fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getSortKey(coll.toString(), source.toString(), sourcelength, result.toString(), resultlength) as Int) else 0

public actual fun ucol_getStrength(coll: Long): UColAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getStrength(coll.toString()) as Int) else 0

public actual fun ucol_getTailoredSet(coll: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getTailoredSet(coll.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_getUCAVersion(coll: Long, info: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getUCAVersion(coll.toString(), info.toString())
    }
}

public actual fun ucol_getVariableTop(coll: Long, status: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getVariableTop(coll.toString(), status.toString()) as Int).toUInt() else 0u

public actual fun ucol_getVersion(coll: Long, info: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_getVersion(coll.toString(), info.toString())
    }
}

public actual fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_greater(coll.toString(), source.toString(), sourcelength, target.toString(), targetlength) as Int).toByte() else 0

public actual fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_greaterOrEqual(coll.toString(), source.toString(), sourcelength, target.toString(), targetlength) as Int).toByte() else 0

public actual fun ucol_keyHashCode(key: Long, length: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_keyHashCode(key.toString(), length) as Int) else 0

public actual fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_mergeSortkeys(src1.toString(), src1length, src2.toString(), src2length, dest.toString(), destcapacity) as Int) else 0

public actual fun ucol_next(elems: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_next(elems.toString(), status.toString()) as Int) else 0

public actual fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_nextSortKeyPart(coll.toString(), iter.toString(), state.toString(), dest.toString(), count, status.toString()) as Int) else 0

public actual fun ucol_open(loc: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_open(loc.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_openAvailableLocales(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_openAvailableLocales(status.toString()) as String).toLong() else 0L

public actual fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_openBinary(bin.toString(), length, base.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_openElements(coll.toString(), text.toString(), textlength, status.toString()) as String).toLong() else 0L

public actual fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_openRules(rules.toString(), ruleslength, normalizationmode, strength, parseerror.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_previous(elems: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_previous(elems.toString(), status.toString()) as Int) else 0

public actual fun ucol_primaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_primaryOrder(order) as Int) else 0

public actual fun ucol_reset(elems: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_reset(elems.toString())
    }
}

public actual fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_safeClone(coll.toString(), stackbuffer.toString(), pbuffersize.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucol_secondaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_secondaryOrder(order) as Int) else 0

public actual fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setAttribute(coll.toString(), attr, value, status.toString())
    }
}

public actual fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setMaxVariable(coll.toString(), group, perrorcode.toString())
    }
}

public actual fun ucol_setOffset(elems: Long, offset: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setOffset(elems.toString(), offset, status.toString())
    }
}

public actual fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setReorderCodes(coll.toString(), reordercodes.toString(), reordercodeslength, perrorcode.toString())
    }
}

public actual fun ucol_setStrength(coll: Long, strength: UColAttributeValue) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setStrength(coll.toString(), strength)
    }
}

public actual fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_setText(elems.toString(), text.toString(), textlength, status.toString())
    }
}

public actual fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_strcoll(coll.toString(), source.toString(), sourcelength, target.toString(), targetlength) as Int) else 0

public actual fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_strcollIter(coll.toString(), siter.toString(), titer.toString(), status.toString()) as Int) else 0

public actual fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_strcollUTF8(coll.toString(), source.toString(), sourcelength, target.toString(), targetlength, status.toString()) as Int) else 0

public actual fun ucol_tertiaryOrder(order: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucol_tertiaryOrder(order) as Int) else 0

public actual fun ucpmap_get(map: Long, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucpmap_get(map.toString(), c) as Int).toUInt() else 0u

public actual fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucpmap_getRange(map.toString(), start, option, surrogatevalue.toInt(), filter.toString(), context.toString(), pvalue.toString()) as Int) else 0

public actual fun ucptrie_close(trie: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_close(trie.toString())
    }
}

public actual fun ucptrie_get(trie: Long, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_get(trie.toString(), c) as Int).toUInt() else 0u

public actual fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_getRange(trie.toString(), start, option, surrogatevalue.toInt(), filter.toString(), context.toString(), pvalue.toString()) as Int) else 0

public actual fun ucptrie_getType(trie: Long): UCPTrieType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_getType(trie.toString()) as Int) else 0

public actual fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_getValueWidth(trie.toString()) as Int) else 0

public actual fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_internalSmallIndex(trie.toString(), c) as Int) else 0

public actual fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_internalSmallU8Index(trie.toString(), lt1, t2.toInt(), t3.toInt()) as Int) else 0

public actual fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_internalU8PrevIndex(trie.toString(), c, start.toString(), src.toString()) as Int) else 0

public actual fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_openFromBinary(type, valuewidth, data.toString(), length, pactuallength.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucptrie_toBinary(trie.toString(), data.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun ucsdet_close(ucsd: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_close(ucsd.toString())
    }
}

public actual fun ucsdet_detect(ucsd: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_detect(ucsd.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_detectAll(ucsd.toString(), matchesfound.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_enableInputFilter(ucsd.toString(), filter.toInt()) as Int).toByte() else 0

public actual fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_getAllDetectableCharsets(ucsd.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucsdet_getConfidence(ucsm: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_getConfidence(ucsm.toString(), status.toString()) as Int) else 0

public actual fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_getLanguage(ucsm.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucsdet_getName(ucsm: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_getName(ucsm.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_getUChars(ucsm.toString(), buf.toString(), cap, status.toString()) as Int) else 0

public actual fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_isInputFilterEnabled(ucsd.toString()) as Int).toByte() else 0

public actual fun ucsdet_open(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_open(status.toString()) as String).toLong() else 0L

public actual fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_setDeclaredEncoding(ucsd.toString(), encoding.toString(), length, status.toString())
    }
}

public actual fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucsdet_setText(ucsd.toString(), textin.toString(), len, status.toString())
    }
}

public actual fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_countCurrencies(locale.toString(), date, ec.toString()) as Int) else 0

public actual fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_forLocale(locale.toString(), buff.toString(), buffcapacity, ec.toString()) as Int) else 0

public actual fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_forLocaleAndDate(locale.toString(), date, index, buff.toString(), buffcapacity, ec.toString()) as Int) else 0

public actual fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigits(currency.toString(), ec.toString()) as Int) else 0

public actual fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigitsForUsage(currency.toString(), usage, ec.toString()) as Int) else 0

public actual fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getKeywordValuesForLocale(key.toString(), locale.toString(), commonlyused.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getName(currency.toString(), locale.toString(), namestyle, ischoiceformat.toString(), len.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ucurr_getNumericCode(currency: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getNumericCode(currency.toString()) as Int) else 0

public actual fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getPluralName(currency.toString(), locale.toString(), ischoiceformat.toString(), pluralcount.toString(), len.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getRoundingIncrement(currency.toString(), ec.toString()) as Double) else 0.0

public actual fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_getRoundingIncrementForUsage(currency.toString(), usage, ec.toString()) as Double) else 0.0

public actual fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_isAvailable(isocode.toString(), from, to, errorcode.toString()) as Int).toByte() else 0

public actual fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_openISOCurrencies(currtype.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_register(isocode.toString(), locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ucurr_unregister(key: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ucurr_unregister(key.toString(), status.toString()) as Int).toByte() else 0

public actual fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_adoptNumberFormat(fmt.toString(), numberformattoadopt.toString())
    }
}

public actual fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_adoptNumberFormatForFields(fmt.toString(), fields.toString(), numberformattoset.toString(), status.toString())
    }
}

public actual fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_applyPattern(format.toString(), localized.toInt(), pattern.toString(), patternlength)
    }
}

public actual fun udat_clone(fmt: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_clone(fmt.toString(), status.toString()) as String).toLong() else 0L

public actual fun udat_close(format: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_close(format.toString())
    }
}

public actual fun udat_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_countAvailable() as Int) else 0

public actual fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_countSymbols(fmt.toString(), type) as Int) else 0

public actual fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_format(format.toString(), datetoformat, result.toString(), resultlength, position.toString(), status.toString()) as Int) else 0

public actual fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_formatCalendar(format.toString(), calendar.toString(), result.toString(), capacity, position.toString(), status.toString()) as Int) else 0

public actual fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_formatCalendarForFields(format.toString(), calendar.toString(), result.toString(), capacity, fpositer.toString(), status.toString()) as Int) else 0

public actual fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_formatForFields(format.toString(), datetoformat, result.toString(), resultlength, fpositer.toString(), status.toString()) as Int) else 0

public actual fun udat_get2DigitYearStart(fmt: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_get2DigitYearStart(fmt.toString(), status.toString()) as Double) else 0.0

public actual fun udat_getAvailable(localeindex: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getAvailable(localeindex) as String).toLong() else 0L

public actual fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getBooleanAttribute(fmt.toString(), attr, status.toString()) as Int).toByte() else 0

public actual fun udat_getCalendar(fmt: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getCalendar(fmt.toString()) as String).toLong() else 0L

public actual fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getContext(fmt.toString(), type, status.toString()) as Int) else 0

public actual fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getLocaleByType(fmt.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun udat_getNumberFormat(fmt: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getNumberFormat(fmt.toString()) as String).toLong() else 0L

public actual fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getNumberFormatForField(fmt.toString(), field.toInt()) as String).toLong() else 0L

public actual fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_getSymbols(fmt.toString(), type, symbolindex, result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun udat_isLenient(fmt: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_isLenient(fmt.toString()) as Int).toByte() else 0

public actual fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_open(timestyle, datestyle, locale.toString(), tzid.toString(), tzidlength, pattern.toString(), patternlength, status.toString()) as String).toLong() else 0L

public actual fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_parse(format.toString(), text.toString(), textlength, parsepos.toString(), status.toString()) as Double) else 0.0

public actual fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_parseCalendar(format.toString(), calendar.toString(), text.toString(), textlength, parsepos.toString(), status.toString())
    }
}

public actual fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_set2DigitYearStart(fmt.toString(), d, status.toString())
    }
}

public actual fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setBooleanAttribute(fmt.toString(), attr, newvalue.toInt(), status.toString())
    }
}

public actual fun udat_setCalendar(fmt: Long, calendartoset: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setCalendar(fmt.toString(), calendartoset.toString())
    }
}

public actual fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setContext(fmt.toString(), value, status.toString())
    }
}

public actual fun udat_setLenient(fmt: Long, islenient: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setLenient(fmt.toString(), islenient.toInt())
    }
}

public actual fun udat_setNumberFormat(fmt: Long, numberformattoset: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setNumberFormat(fmt.toString(), numberformattoset.toString())
    }
}

public actual fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_setSymbols(format.toString(), type, symbolindex, value.toString(), valuelength, status.toString())
    }
}

public actual fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_toCalendarDateField(field) as Int) else 0

public actual fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udat_toPattern(fmt.toString(), localized.toInt(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_addPattern(dtpg.toString(), pattern.toString(), patternlength, override.toInt(), conflictingpattern.toString(), capacity, plength.toString(), perrorcode.toString()) as Int) else 0

public actual fun udatpg_clone(dtpg: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_clone(dtpg.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun udatpg_close(dtpg: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_close(dtpg.toString())
    }
}

public actual fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getAppendItemFormat(dtpg.toString(), field, plength.toString()) as String).toLong() else 0L

public actual fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getAppendItemName(dtpg.toString(), field, plength.toString()) as String).toLong() else 0L

public actual fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getBaseSkeleton(unuseddtpg.toString(), pattern.toString(), length, baseskeleton.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getBestPattern(dtpg.toString(), skeleton.toString(), length, bestpattern.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getBestPatternWithOptions(dtpg.toString(), skeleton.toString(), length, options, bestpattern.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getDateTimeFormat(dtpg.toString(), plength.toString()) as String).toLong() else 0L

public actual fun udatpg_getDecimal(dtpg: Long, plength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getDecimal(dtpg.toString(), plength.toString()) as String).toLong() else 0L

public actual fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getFieldDisplayName(dtpg.toString(), field, width, fieldname.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getPatternForSkeleton(dtpg.toString(), skeleton.toString(), skeletonlength, plength.toString()) as String).toLong() else 0L

public actual fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_getSkeleton(unuseddtpg.toString(), pattern.toString(), length, skeleton.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_open(locale: PCSTR, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_open(locale.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_openBaseSkeletons(dtpg.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun udatpg_openEmpty(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_openEmpty(perrorcode.toString()) as String).toLong() else 0L

public actual fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_openSkeletons(dtpg.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_replaceFieldTypes(dtpg.toString(), pattern.toString(), patternlength, skeleton.toString(), skeletonlength, dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_replaceFieldTypesWithOptions(dtpg.toString(), pattern.toString(), patternlength, skeleton.toString(), skeletonlength, options, dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_setAppendItemFormat(dtpg.toString(), field, value.toString(), length)
    }
}

public actual fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_setAppendItemName(dtpg.toString(), field, value.toString(), length)
    }
}

public actual fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_setDateTimeFormat(dtpg.toString(), dtformat.toString(), length)
    }
}

public actual fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udatpg_setDecimal(dtpg.toString(), decimal.toString(), length)
    }
}

public actual fun udtitvfmt_close(formatter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_close(formatter.toString())
    }
}

public actual fun udtitvfmt_closeResult(uresult: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_closeResult(uresult.toString())
    }
}

public actual fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_format(formatter.toString(), fromdate, todate, result.toString(), resultcapacity, position.toString(), status.toString()) as Int) else 0

public actual fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_open(locale.toString(), skeleton.toString(), skeletonlength, tzid.toString(), tzidlength, status.toString()) as String).toLong() else 0L

public actual fun udtitvfmt_openResult(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_openResult(ec.toString()) as String).toLong() else 0L

public actual fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_udtitvfmt_resultAsValue(uresult.toString(), ec.toString()) as String).toLong() else 0L

public actual fun uenum_close(en: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_close(en.toString())
    }
}

public actual fun uenum_count(en: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_count(en.toString(), status.toString()) as Int) else 0

public actual fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_next(en.toString(), resultlength.toString(), status.toString()) as String).toLong() else 0L

public actual fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_openCharStringsEnumeration(strings.toString(), count, ec.toString()) as String).toLong() else 0L

public actual fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_openUCharStringsEnumeration(strings.toString(), count, ec.toString()) as String).toLong() else 0L

public actual fun uenum_reset(en: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_reset(en.toString(), status.toString())
    }
}

public actual fun uenum_unext(en: Long, resultlength: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uenum_unext(en.toString(), resultlength.toString(), status.toString()) as String).toLong() else 0L

public actual fun ufieldpositer_close(fpositer: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositer_close(fpositer.toString())
    }
}

public actual fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositer_next(fpositer.toString(), beginindex.toString(), endindex.toString()) as Int) else 0

public actual fun ufieldpositer_open(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufieldpositer_open(status.toString()) as String).toLong() else 0L

public actual fun ufmt_close(fmt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_close(fmt.toString())
    }
}

public actual fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getArrayItemByIndex(fmt.toString(), n, status.toString()) as String).toLong() else 0L

public actual fun ufmt_getArrayLength(fmt: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getArrayLength(fmt.toString(), status.toString()) as Int) else 0

public actual fun ufmt_getDate(fmt: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getDate(fmt.toString(), status.toString()) as Double) else 0.0

public actual fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getDecNumChars(fmt.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ufmt_getDouble(fmt: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getDouble(fmt.toString(), status.toString()) as Double) else 0.0

public actual fun ufmt_getInt64(fmt: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getInt64(fmt.toString(), status.toString()) as String).toLong() else 0L

public actual fun ufmt_getLong(fmt: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getLong(fmt.toString(), status.toString()) as Int) else 0

public actual fun ufmt_getObject(fmt: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getObject(fmt.toString(), status.toString()) as String).toLong() else 0L

public actual fun ufmt_getType(fmt: Long, status: Long): UFormattableType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getType(fmt.toString(), status.toString()) as Int) else 0

public actual fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_getUChars(fmt.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ufmt_isNumeric(fmt: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_isNumeric(fmt.toString()) as Int).toByte() else 0

public actual fun ufmt_open(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmt_open(status.toString()) as String).toLong() else 0L

public actual fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtval_getString(ufmtval.toString(), plength.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ufmtval_nextPosition(ufmtval.toString(), ucfpos.toString(), ec.toString()) as Int).toByte() else 0

public actual fun ugender_getInstance(locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ugender_getInstance(locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ugender_getListGender(genderinfo.toString(), genders.toString(), size, status.toString()) as Int) else 0

public actual fun uidna_close(idna: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_close(idna.toString())
    }
}

public actual fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_labelToASCII(idna.toString(), label.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_labelToASCII_UTF8(idna.toString(), label.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_labelToUnicode(idna.toString(), label.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_labelToUnicodeUTF8(idna.toString(), label.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_nameToASCII(idna.toString(), name.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_nameToASCII_UTF8(idna.toString(), name.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_nameToUnicode(idna.toString(), name.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_nameToUnicodeUTF8(idna.toString(), name.toString(), length, dest.toString(), capacity, pinfo.toString(), perrorcode.toString()) as Int) else 0

public actual fun uidna_openUTS46(options: UInt, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uidna_openUTS46(options.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun uiter_current32(iter: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_current32(iter.toString()) as Int) else 0

public actual fun uiter_getState(iter: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_getState(iter.toString()) as Int).toUInt() else 0u

public actual fun uiter_next32(iter: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_next32(iter.toString()) as Int) else 0

public actual fun uiter_previous32(iter: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_previous32(iter.toString()) as Int) else 0

public actual fun uiter_setState(iter: Long, state: UInt, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_setState(iter.toString(), state.toInt(), perrorcode.toString())
    }
}

public actual fun uiter_setString(iter: Long, s: Long, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_setString(iter.toString(), s.toString(), length)
    }
}

public actual fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_setUTF16BE(iter.toString(), s.toString(), length)
    }
}

public actual fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uiter_setUTF8(iter.toString(), s.toString(), length)
    }
}

public actual fun uldn_close(ldn: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_close(ldn.toString())
    }
}

public actual fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_getContext(ldn.toString(), type, perrorcode.toString()) as Int) else 0

public actual fun uldn_getDialectHandling(ldn: Long): UDialectHandling =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_getDialectHandling(ldn.toString()) as Int) else 0

public actual fun uldn_getLocale(ldn: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_getLocale(ldn.toString()) as String).toLong() else 0L

public actual fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_keyDisplayName(ldn.toString(), key.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_keyValueDisplayName(ldn.toString(), key.toString(), value.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_languageDisplayName(ldn.toString(), lang.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_localeDisplayName(ldn.toString(), locale.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_open(locale.toString(), dialecthandling, perrorcode.toString()) as String).toLong() else 0L

public actual fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_openForContext(locale.toString(), contexts.toString(), length, perrorcode.toString()) as String).toLong() else 0L

public actual fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_regionDisplayName(ldn.toString(), region.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_scriptCodeDisplayName(ldn.toString(), scriptcode, result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_scriptDisplayName(ldn.toString(), script.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uldn_variantDisplayName(ldn.toString(), variant.toString(), result.toString(), maxresultsize, perrorcode.toString()) as Int) else 0

public actual fun ulistfmt_close(listfmt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_close(listfmt.toString())
    }
}

public actual fun ulistfmt_closeResult(uresult: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_closeResult(uresult.toString())
    }
}

public actual fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_format(listfmt.toString(), strings.toString(), stringlengths.toString(), stringcount, result.toString(), resultcapacity, status.toString()) as Int) else 0

public actual fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_formatStringsToResult(listfmt.toString(), strings.toString(), stringlengths.toString(), stringcount, uresult.toString(), status.toString())
    }
}

public actual fun ulistfmt_open(locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_open(locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_openForType(locale.toString(), type, width, status.toString()) as String).toLong() else 0L

public actual fun ulistfmt_openResult(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_openResult(ec.toString()) as String).toLong() else 0L

public actual fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulistfmt_resultAsValue(uresult.toString(), ec.toString()) as String).toLong() else 0L

public actual fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_acceptLanguage(result.toString(), resultavailable, outresult.toString(), acceptlist.toString(), acceptlistcount, availablelocales.toString(), status.toString()) as Int) else 0

public actual fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_acceptLanguageFromHTTP(result.toString(), resultavailable, outresult.toString(), httpacceptlanguage.toString(), availablelocales.toString(), status.toString()) as Int) else 0

public actual fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_addLikelySubtags(localeid.toString(), maximizedlocaleid.toString(), maximizedlocaleidcapacity, err.toString()) as Int) else 0

public actual fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_canonicalize(localeid.toString(), name.toString(), namecapacity, err.toString()) as Int) else 0

public actual fun uloc_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_countAvailable() as Int) else 0

public actual fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_forLanguageTag(langtag.toString(), localeid.toString(), localeidcapacity, parsedlength.toString(), err.toString()) as Int) else 0

public actual fun uloc_getAvailable(n: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getAvailable(n) as String).toLong() else 0L

public actual fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getBaseName(localeid.toString(), name.toString(), namecapacity, err.toString()) as Int) else 0

public actual fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getCharacterOrientation(localeid.toString(), status.toString()) as Int) else 0

public actual fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getCountry(localeid.toString(), country.toString(), countrycapacity, err.toString()) as Int) else 0

public actual fun uloc_getDefault(): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDefault() as String).toLong() else 0L

public actual fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayCountry(locale.toString(), displaylocale.toString(), country.toString(), countrycapacity, status.toString()) as Int) else 0

public actual fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayKeyword(keyword.toString(), displaylocale.toString(), dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayKeywordValue(locale.toString(), keyword.toString(), displaylocale.toString(), dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayLanguage(locale.toString(), displaylocale.toString(), language.toString(), languagecapacity, status.toString()) as Int) else 0

public actual fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayName(localeid.toString(), inlocaleid.toString(), result.toString(), maxresultsize, err.toString()) as Int) else 0

public actual fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayScript(locale.toString(), displaylocale.toString(), script.toString(), scriptcapacity, status.toString()) as Int) else 0

public actual fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getDisplayVariant(locale.toString(), displaylocale.toString(), variant.toString(), variantcapacity, status.toString()) as Int) else 0

public actual fun uloc_getISO3Country(localeid: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getISO3Country(localeid.toString()) as String).toLong() else 0L

public actual fun uloc_getISO3Language(localeid: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getISO3Language(localeid.toString()) as String).toLong() else 0L

public actual fun uloc_getISOCountries(): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getISOCountries() as String).toLong() else 0L

public actual fun uloc_getISOLanguages(): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getISOLanguages() as String).toLong() else 0L

public actual fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getKeywordValue(localeid.toString(), keywordname.toString(), buffer.toString(), buffercapacity, status.toString()) as Int) else 0

public actual fun uloc_getLCID(localeid: PCSTR): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getLCID(localeid.toString()) as Int).toUInt() else 0u

public actual fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getLanguage(localeid.toString(), language.toString(), languagecapacity, err.toString()) as Int) else 0

public actual fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getLineOrientation(localeid.toString(), status.toString()) as Int) else 0

public actual fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getLocaleForLCID(hostid.toInt(), locale.toString(), localecapacity, status.toString()) as Int) else 0

public actual fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getName(localeid.toString(), name.toString(), namecapacity, err.toString()) as Int) else 0

public actual fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getParent(localeid.toString(), parent.toString(), parentcapacity, err.toString()) as Int) else 0

public actual fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getScript(localeid.toString(), script.toString(), scriptcapacity, err.toString()) as Int) else 0

public actual fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_getVariant(localeid.toString(), variant.toString(), variantcapacity, err.toString()) as Int) else 0

public actual fun uloc_isRightToLeft(locale: PCSTR): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_isRightToLeft(locale.toString()) as Int).toByte() else 0

public actual fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_minimizeSubtags(localeid.toString(), minimizedlocaleid.toString(), minimizedlocaleidcapacity, err.toString()) as Int) else 0

public actual fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_openAvailableByType(type, status.toString()) as String).toLong() else 0L

public actual fun uloc_openKeywords(localeid: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_openKeywords(localeid.toString(), status.toString()) as String).toLong() else 0L

public actual fun uloc_setDefault(localeid: PCSTR, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_setDefault(localeid.toString(), status.toString())
    }
}

public actual fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_setKeywordValue(keywordname.toString(), keywordvalue.toString(), buffer.toString(), buffercapacity, status.toString()) as Int) else 0

public actual fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_toLanguageTag(localeid.toString(), langtag.toString(), langtagcapacity, strict.toInt(), err.toString()) as Int) else 0

public actual fun uloc_toLegacyKey(keyword: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_toLegacyKey(keyword.toString()) as String).toLong() else 0L

public actual fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_toLegacyType(keyword.toString(), value.toString()) as String).toLong() else 0L

public actual fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleKey(keyword.toString()) as String).toLong() else 0L

public actual fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleType(keyword.toString(), value.toString()) as String).toLong() else 0L

public actual fun ulocdata_close(uld: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_close(uld.toString())
    }
}

public actual fun ulocdata_getCLDRVersion(versionarray: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getCLDRVersion(versionarray.toString(), status.toString())
    }
}

public actual fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getDelimiter(uld.toString(), type, result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getExemplarSet(uld.toString(), fillin.toString(), options.toInt(), extype, status.toString()) as String).toLong() else 0L

public actual fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getLocaleDisplayPattern(uld.toString(), pattern.toString(), patterncapacity, status.toString()) as Int) else 0

public actual fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getLocaleSeparator(uld.toString(), separator.toString(), separatorcapacity, status.toString()) as Int) else 0

public actual fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getMeasurementSystem(localeid.toString(), status.toString()) as Int) else 0

public actual fun ulocdata_getNoSubstitute(uld: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getNoSubstitute(uld.toString()) as Int).toByte() else 0

public actual fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_getPaperSize(localeid.toString(), height.toString(), width.toString(), status.toString())
    }
}

public actual fun ulocdata_open(localeid: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_open(localeid.toString(), status.toString()) as String).toLong() else 0L

public actual fun ulocdata_setNoSubstitute(uld: Long, setting: Byte) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ulocdata_setNoSubstitute(uld.toString(), setting.toInt())
    }
}

public actual fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_applyPattern(fmt.toString(), pattern.toString(), patternlength, parseerror.toString(), status.toString())
    }
}

public actual fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_autoQuoteApostrophe(pattern.toString(), patternlength, dest.toString(), destcapacity, ec.toString()) as Int) else 0

public actual fun umsg_clone(fmt: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_clone(fmt.toString(), status.toString()) as String).toLong() else 0L

public actual fun umsg_close(format: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_close(format.toString())
    }
}

public actual fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun umsg_getLocale(fmt: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_getLocale(fmt.toString()) as String).toLong() else 0L

public actual fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_open(pattern.toString(), patternlength, locale.toString(), parseerror.toString(), status.toString()) as String).toLong() else 0L

public actual fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long) {
}

public actual fun umsg_setLocale(fmt: Long, locale: PCSTR) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_setLocale(fmt.toString(), locale.toString())
    }
}

public actual fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_toPattern(fmt.toString(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_vformat(fmt.toString(), result.toString(), resultlength, ap.toString(), status.toString()) as Int) else 0

public actual fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umsg_vparse(fmt.toString(), source.toString(), sourcelength, count.toString(), ap.toString(), status.toString())
    }
}

public actual fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_buildImmutable(trie.toString(), type, valuewidth, perrorcode.toString()) as String).toLong() else 0L

public actual fun umutablecptrie_clone(other: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_clone(other.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun umutablecptrie_close(trie: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_close(trie.toString())
    }
}

public actual fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_fromUCPMap(map.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_fromUCPTrie(trie.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun umutablecptrie_get(trie: Long, c: Int): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_get(trie.toString(), c) as Int).toUInt() else 0u

public actual fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_getRange(trie.toString(), start, option, surrogatevalue.toInt(), filter.toString(), context.toString(), pvalue.toString()) as Int) else 0

public actual fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_open(initialvalue.toInt(), errorvalue.toInt(), perrorcode.toString()) as String).toLong() else 0L

public actual fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_set(trie.toString(), c, value.toInt(), perrorcode.toString())
    }
}

public actual fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_umutablecptrie_setRange(trie.toString(), start, end, value.toInt(), perrorcode.toString())
    }
}

public actual fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_append(norm2.toString(), first.toString(), firstlength, firstcapacity, second.toString(), secondlength, perrorcode.toString()) as Int) else 0

public actual fun unorm2_close(norm2: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_close(norm2.toString())
    }
}

public actual fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_composePair(norm2.toString(), a, b) as Int) else 0

public actual fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getCombiningClass(norm2.toString(), c) as Int).toUByte() else 0u

public actual fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getDecomposition(norm2.toString(), c, decomposition.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getInstance(packagename.toString(), name.toString(), mode, perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getNFCInstance(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getNFCInstance(perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getNFDInstance(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getNFDInstance(perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getNFKCCasefoldInstance(perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getNFKCInstance(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getNFKCInstance(perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getNFKDInstance(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getNFKDInstance(perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_getRawDecomposition(norm2.toString(), c, decomposition.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_hasBoundaryAfter(norm2.toString(), c) as Int).toByte() else 0

public actual fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_hasBoundaryBefore(norm2.toString(), c) as Int).toByte() else 0

public actual fun unorm2_isInert(norm2: Long, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_isInert(norm2.toString(), c) as Int).toByte() else 0

public actual fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_isNormalized(norm2.toString(), s.toString(), length, perrorcode.toString()) as Int).toByte() else 0

public actual fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_normalize(norm2.toString(), src.toString(), length, dest.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_normalizeSecondAndAppend(norm2.toString(), first.toString(), firstlength, firstcapacity, second.toString(), secondlength, perrorcode.toString()) as Int) else 0

public actual fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_openFiltered(norm2.toString(), filterset.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_quickCheck(norm2.toString(), s.toString(), length, perrorcode.toString()) as Int) else 0

public actual fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm2_spanQuickCheckYes(norm2.toString(), s.toString(), length, perrorcode.toString()) as Int) else 0

public actual fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unorm_compare(s1.toString(), length1, s2.toString(), length2, options.toInt(), perrorcode.toString()) as Int) else 0

public actual fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_applyPattern(format.toString(), localized.toInt(), pattern.toString(), patternlength, parseerror.toString(), status.toString())
    }
}

public actual fun unum_clone(fmt: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_clone(fmt.toString(), status.toString()) as String).toLong() else 0L

public actual fun unum_close(fmt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_close(fmt.toString())
    }
}

public actual fun unum_countAvailable(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_countAvailable() as Int) else 0

public actual fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_format(fmt.toString(), number, result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatDecimal(fmt.toString(), number.toString(), length, result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatDouble(fmt.toString(), number, result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatDoubleCurrency(fmt.toString(), number, currency.toString(), result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatDoubleForFields(format.toString(), number, result.toString(), resultlength, fpositer.toString(), status.toString()) as Int) else 0

public actual fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatInt64(fmt.toString(), number.toString(), result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_formatUFormattable(fmt.toString(), number.toString(), result.toString(), resultlength, pos.toString(), status.toString()) as Int) else 0

public actual fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getAttribute(fmt.toString(), attr) as Int) else 0

public actual fun unum_getAvailable(localeindex: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getAvailable(localeindex) as String).toLong() else 0L

public actual fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getContext(fmt.toString(), type, status.toString()) as Int) else 0

public actual fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getDoubleAttribute(fmt.toString(), attr) as Double) else 0.0

public actual fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getLocaleByType(fmt.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getSymbol(fmt.toString(), symbol, buffer.toString(), size, status.toString()) as Int) else 0

public actual fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_getTextAttribute(fmt.toString(), tag, result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_open(style, pattern.toString(), patternlength, locale.toString(), parseerr.toString(), status.toString()) as String).toLong() else 0L

public actual fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parse(fmt.toString(), text.toString(), textlength, parsepos.toString(), status.toString()) as Int) else 0

public actual fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parseDecimal(fmt.toString(), text.toString(), textlength, parsepos.toString(), outbuf.toString(), outbuflength, status.toString()) as Int) else 0

public actual fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parseDouble(fmt.toString(), text.toString(), textlength, parsepos.toString(), status.toString()) as Double) else 0.0

public actual fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parseDoubleCurrency(fmt.toString(), text.toString(), textlength, parsepos.toString(), currency.toString(), status.toString()) as Double) else 0.0

public actual fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parseInt64(fmt.toString(), text.toString(), textlength, parsepos.toString(), status.toString()) as String).toLong() else 0L

public actual fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_parseToUFormattable(fmt.toString(), result.toString(), text.toString(), textlength, parsepos.toString(), status.toString()) as String).toLong() else 0L

public actual fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_setAttribute(fmt.toString(), attr, newvalue)
    }
}

public actual fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_setContext(fmt.toString(), value, status.toString())
    }
}

public actual fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_setDoubleAttribute(fmt.toString(), attr, newvalue)
    }
}

public actual fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_setSymbol(fmt.toString(), symbol, value.toString(), length, status.toString())
    }
}

public actual fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_setTextAttribute(fmt.toString(), tag, newvalue.toString(), newvaluelength, status.toString())
    }
}

public actual fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unum_toPattern(fmt.toString(), ispatternlocalized.toInt(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun unumf_close(uformatter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_close(uformatter.toString())
    }
}

public actual fun unumf_closeResult(uresult: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_closeResult(uresult.toString())
    }
}

public actual fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_formatDecimal(uformatter.toString(), value.toString(), valuelen, uresult.toString(), ec.toString())
    }
}

public actual fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_formatDouble(uformatter.toString(), value, uresult.toString(), ec.toString())
    }
}

public actual fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_formatInt(uformatter.toString(), value.toString(), uresult.toString(), ec.toString())
    }
}

public actual fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocale(skeleton.toString(), skeletonlen, locale.toString(), ec.toString()) as String).toLong() else 0L

public actual fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocaleWithError(skeleton.toString(), skeletonlen, locale.toString(), perror.toString(), ec.toString()) as String).toLong() else 0L

public actual fun unumf_openResult(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_openResult(ec.toString()) as String).toLong() else 0L

public actual fun unumf_resultAsValue(uresult: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_resultAsValue(uresult.toString(), ec.toString()) as String).toLong() else 0L

public actual fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_resultGetAllFieldPositions(uresult.toString(), ufpositer.toString(), ec.toString())
    }
}

public actual fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_resultNextFieldPosition(uresult.toString(), ufpos.toString(), ec.toString()) as Int).toByte() else 0

public actual fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumf_resultToString(uresult.toString(), buffer.toString(), buffercapacity, ec.toString()) as Int) else 0

public actual fun unumsys_close(unumsys: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_close(unumsys.toString())
    }
}

public actual fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_getDescription(unumsys.toString(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun unumsys_getName(unumsys: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_getName(unumsys.toString()) as String).toLong() else 0L

public actual fun unumsys_getRadix(unumsys: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_getRadix(unumsys.toString()) as Int) else 0

public actual fun unumsys_isAlgorithmic(unumsys: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_isAlgorithmic(unumsys.toString()) as Int).toByte() else 0

public actual fun unumsys_open(locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_open(locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun unumsys_openAvailableNames(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_openAvailableNames(status.toString()) as String).toLong() else 0L

public actual fun unumsys_openByName(name: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_unumsys_openByName(name.toString(), status.toString()) as String).toLong() else 0L

public actual fun uplrules_close(uplrules: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_close(uplrules.toString())
    }
}

public actual fun uplrules_getKeywords(uplrules: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_getKeywords(uplrules.toString(), status.toString()) as String).toLong() else 0L

public actual fun uplrules_open(locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_open(locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_openForType(locale.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_select(uplrules.toString(), number, keyword.toString(), capacity, status.toString()) as Int) else 0

public actual fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uplrules_selectFormatted(uplrules.toString(), number.toString(), keyword.toString(), capacity, status.toString()) as Int) else 0

public actual fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_appendReplacement(regexp.toString(), replacementtext.toString(), replacementlength, destbuf.toString(), destcapacity.toString(), status.toString()) as Int) else 0

public actual fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_appendReplacementUText(regexp.toString(), replacementtext.toString(), dest.toString(), status.toString())
    }
}

public actual fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_appendTail(regexp.toString(), destbuf.toString(), destcapacity.toString(), status.toString()) as Int) else 0

public actual fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_appendTailUText(regexp.toString(), dest.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_clone(regexp: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_clone(regexp.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_close(regexp: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_close(regexp.toString())
    }
}

public actual fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_end(regexp.toString(), groupnum, status.toString()) as Int) else 0

public actual fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_end64(regexp.toString(), groupnum, status.toString()) as String).toLong() else 0L

public actual fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_find(regexp.toString(), startindex, status.toString()) as Int).toByte() else 0

public actual fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_find64(regexp.toString(), startindex.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_findNext(regexp: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_findNext(regexp.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_flags(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_flags(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getFindProgressCallback(regexp.toString(), callback.toString(), context.toString(), status.toString())
    }
}

public actual fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getMatchCallback(regexp.toString(), callback.toString(), context.toString(), status.toString())
    }
}

public actual fun uregex_getStackLimit(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getStackLimit(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getText(regexp.toString(), textlength.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_getTimeLimit(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getTimeLimit(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_getUText(regexp.toString(), dest.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_group(regexp.toString(), groupnum, dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uregex_groupCount(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_groupCount(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_groupNumberFromCName(regexp.toString(), groupname.toString(), namelength, status.toString()) as Int) else 0

public actual fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_groupNumberFromName(regexp.toString(), groupname.toString(), namelength, status.toString()) as Int) else 0

public actual fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_groupUText(regexp.toString(), groupnum, dest.toString(), grouplength.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_hasAnchoringBounds(regexp.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_hasTransparentBounds(regexp.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_hitEnd(regexp: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_hitEnd(regexp.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_lookingAt(regexp.toString(), startindex, status.toString()) as Int).toByte() else 0

public actual fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_lookingAt64(regexp.toString(), startindex.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_matches(regexp.toString(), startindex, status.toString()) as Int).toByte() else 0

public actual fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_matches64(regexp.toString(), startindex.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_open(pattern.toString(), patternlength, flags.toInt(), pe.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_openC(pattern.toString(), flags.toInt(), pe.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_openUText(pattern.toString(), flags.toInt(), pe.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_pattern(regexp.toString(), patlength.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_patternUText(regexp: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_patternUText(regexp.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_refreshUText(regexp: Long, text: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_refreshUText(regexp.toString(), text.toString(), status.toString())
    }
}

public actual fun uregex_regionEnd(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_regionEnd(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_regionEnd64(regexp: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_regionEnd64(regexp.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_regionStart(regexp: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_regionStart(regexp.toString(), status.toString()) as Int) else 0

public actual fun uregex_regionStart64(regexp: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_regionStart64(regexp.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_replaceAll(regexp.toString(), replacementtext.toString(), replacementlength, destbuf.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_replaceAllUText(regexp.toString(), replacement.toString(), dest.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_replaceFirst(regexp.toString(), replacementtext.toString(), replacementlength, destbuf.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_replaceFirstUText(regexp.toString(), replacement.toString(), dest.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregex_requireEnd(regexp: Long, status: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_requireEnd(regexp.toString(), status.toString()) as Int).toByte() else 0

public actual fun uregex_reset(regexp: Long, index: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_reset(regexp.toString(), index, status.toString())
    }
}

public actual fun uregex_reset64(regexp: Long, index: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_reset64(regexp.toString(), index.toString(), status.toString())
    }
}

public actual fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setFindProgressCallback(regexp.toString(), callback.toLong().toString(), context.toString(), status.toString())
    }
}

public actual fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setMatchCallback(regexp.toString(), callback.toLong().toString(), context.toString(), status.toString())
    }
}

public actual fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setRegion(regexp.toString(), regionstart, regionlimit, status.toString())
    }
}

public actual fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setRegion64(regexp.toString(), regionstart.toString(), regionlimit.toString(), status.toString())
    }
}

public actual fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setRegionAndStart(regexp.toString(), regionstart.toString(), regionlimit.toString(), startindex.toString(), status.toString())
    }
}

public actual fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setStackLimit(regexp.toString(), limit, status.toString())
    }
}

public actual fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setText(regexp.toString(), text.toString(), textlength, status.toString())
    }
}

public actual fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setTimeLimit(regexp.toString(), limit, status.toString())
    }
}

public actual fun uregex_setUText(regexp: Long, text: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_setUText(regexp.toString(), text.toString(), status.toString())
    }
}

public actual fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_split(regexp.toString(), destbuf.toString(), destcapacity, requiredcapacity.toString(), destfields.toString(), destfieldscapacity, status.toString()) as Int) else 0

public actual fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_splitUText(regexp.toString(), destfields.toString(), destfieldscapacity, status.toString()) as Int) else 0

public actual fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_start(regexp.toString(), groupnum, status.toString()) as Int) else 0

public actual fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_start64(regexp.toString(), groupnum, status.toString()) as String).toLong() else 0L

public actual fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_useAnchoringBounds(regexp.toString(), b.toInt(), status.toString())
    }
}

public actual fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregex_useTransparentBounds(regexp.toString(), b.toInt(), status.toString())
    }
}

public actual fun uregion_areEqual(uregion: Long, otherregion: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_areEqual(uregion.toString(), otherregion.toString()) as Int).toByte() else 0

public actual fun uregion_contains(uregion: Long, otherregion: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_contains(uregion.toString(), otherregion.toString()) as Int).toByte() else 0

public actual fun uregion_getAvailable(type: URegionType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getAvailable(type, status.toString()) as String).toLong() else 0L

public actual fun uregion_getContainedRegions(uregion: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getContainedRegions(uregion.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getContainedRegionsOfType(uregion.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun uregion_getContainingRegion(uregion: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getContainingRegion(uregion.toString()) as String).toLong() else 0L

public actual fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getContainingRegionOfType(uregion.toString(), type) as String).toLong() else 0L

public actual fun uregion_getNumericCode(uregion: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getNumericCode(uregion.toString()) as Int) else 0

public actual fun uregion_getPreferredValues(uregion: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getPreferredValues(uregion.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregion_getRegionCode(uregion: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getRegionCode(uregion.toString()) as String).toLong() else 0L

public actual fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getRegionFromCode(regioncode.toString(), status.toString()) as String).toLong() else 0L

public actual fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getRegionFromNumericCode(code, status.toString()) as String).toLong() else 0L

public actual fun uregion_getType(uregion: Long): URegionType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uregion_getType(uregion.toString()) as Int) else 0

public actual fun ureldatefmt_close(reldatefmt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_close(reldatefmt.toString())
    }
}

public actual fun ureldatefmt_closeResult(ufrdt: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_closeResult(ufrdt.toString())
    }
}

public actual fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_combineDateAndTime(reldatefmt.toString(), relativedatestring.toString(), relativedatestringlen, timestring.toString(), timestringlen, result.toString(), resultcapacity, status.toString()) as Int) else 0

public actual fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_format(reldatefmt.toString(), offset, unit, result.toString(), resultcapacity, status.toString()) as Int) else 0

public actual fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_formatNumeric(reldatefmt.toString(), offset, unit, result.toString(), resultcapacity, status.toString()) as Int) else 0

public actual fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_formatNumericToResult(reldatefmt.toString(), offset, unit, result.toString(), status.toString())
    }
}

public actual fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_formatToResult(reldatefmt.toString(), offset, unit, result.toString(), status.toString())
    }
}

public actual fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_open(locale.toString(), nftoadopt.toString(), width, capitalizationcontext, status.toString()) as String).toLong() else 0L

public actual fun ureldatefmt_openResult(ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_openResult(ec.toString()) as String).toLong() else 0L

public actual fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ureldatefmt_resultAsValue(ufrdt.toString(), ec.toString()) as String).toLong() else 0L

public actual fun ures_close(resourcebundle: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_close(resourcebundle.toString())
    }
}

public actual fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getBinary(resourcebundle.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getByIndex(resourcebundle.toString(), indexr, fillin.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getByKey(resourcebundle.toString(), key.toString(), fillin.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getInt(resourcebundle: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getInt(resourcebundle.toString(), status.toString()) as Int) else 0

public actual fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getIntVector(resourcebundle.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getKey(resourcebundle: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getKey(resourcebundle.toString()) as String).toLong() else 0L

public actual fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getLocaleByType(resourcebundle.toString(), type, status.toString()) as String).toLong() else 0L

public actual fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getNextResource(resourcebundle.toString(), fillin.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getNextString(resourcebundle.toString(), len.toString(), key.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getSize(resourcebundle: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getSize(resourcebundle.toString()) as Int) else 0

public actual fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getString(resourcebundle.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getStringByIndex(resourcebundle.toString(), indexs, len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getStringByKey(resb.toString(), key.toString(), len.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_getType(resourcebundle: Long): UResType =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getType(resourcebundle.toString()) as Int) else 0

public actual fun ures_getUInt(resourcebundle: Long, status: Long): UInt =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getUInt(resourcebundle.toString(), status.toString()) as Int).toUInt() else 0u

public actual fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getUTF8String(resb.toString(), dest.toString(), length.toString(), forcecopy.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getUTF8StringByIndex(resb.toString(), stringindex, dest.toString(), plength.toString(), forcecopy.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getUTF8StringByKey(resb.toString(), key.toString(), dest.toString(), plength.toString(), forcecopy.toInt(), status.toString()) as String).toLong() else 0L

public actual fun ures_getVersion(resb: Long, versioninfo: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_getVersion(resb.toString(), versioninfo.toString())
    }
}

public actual fun ures_hasNext(resourcebundle: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_hasNext(resourcebundle.toString()) as Int).toByte() else 0

public actual fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_open(packagename.toString(), locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_openAvailableLocales(packagename.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_openDirect(packagename.toString(), locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_openU(packagename.toString(), locale.toString(), status.toString()) as String).toLong() else 0L

public actual fun ures_resetIterator(resourcebundle: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_ures_resetIterator(resourcebundle.toString())
    }
}

public actual fun uscript_breaksBetweenLetters(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_breaksBetweenLetters(script) as Int).toByte() else 0

public actual fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getCode(nameorabbrorlocale.toString(), fillin.toString(), capacity, err.toString()) as Int) else 0

public actual fun uscript_getName(scriptcode: UScriptCode): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getName(scriptcode) as String).toLong() else 0L

public actual fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getSampleString(script, dest.toString(), capacity, perrorcode.toString()) as Int) else 0

public actual fun uscript_getScript(codepoint: Int, err: Long): UScriptCode =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getScript(codepoint, err.toString()) as Int) else 0

public actual fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getScriptExtensions(c, scripts.toString(), capacity, errorcode.toString()) as Int) else 0

public actual fun uscript_getShortName(scriptcode: UScriptCode): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getShortName(scriptcode) as String).toLong() else 0L

public actual fun uscript_getUsage(script: UScriptCode): UScriptUsage =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_getUsage(script) as Int) else 0

public actual fun uscript_hasScript(c: Int, sc: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_hasScript(c, sc) as Int).toByte() else 0

public actual fun uscript_isCased(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_isCased(script) as Int).toByte() else 0

public actual fun uscript_isRightToLeft(script: UScriptCode): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uscript_isRightToLeft(script) as Int).toByte() else 0

public actual fun usearch_close(searchiter: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_close(searchiter.toString())
    }
}

public actual fun usearch_first(strsrch: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_first(strsrch.toString(), status.toString()) as Int) else 0

public actual fun usearch_following(strsrch: Long, position: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_following(strsrch.toString(), position, status.toString()) as Int) else 0

public actual fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getAttribute(strsrch.toString(), attribute) as Int) else 0

public actual fun usearch_getBreakIterator(strsrch: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getBreakIterator(strsrch.toString()) as String).toLong() else 0L

public actual fun usearch_getCollator(strsrch: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getCollator(strsrch.toString()) as String).toLong() else 0L

public actual fun usearch_getMatchedLength(strsrch: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getMatchedLength(strsrch.toString()) as Int) else 0

public actual fun usearch_getMatchedStart(strsrch: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getMatchedStart(strsrch.toString()) as Int) else 0

public actual fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getMatchedText(strsrch.toString(), result.toString(), resultcapacity, status.toString()) as Int) else 0

public actual fun usearch_getOffset(strsrch: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getOffset(strsrch.toString()) as Int) else 0

public actual fun usearch_getPattern(strsrch: Long, length: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getPattern(strsrch.toString(), length.toString()) as String).toLong() else 0L

public actual fun usearch_getText(strsrch: Long, length: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_getText(strsrch.toString(), length.toString()) as String).toLong() else 0L

public actual fun usearch_last(strsrch: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_last(strsrch.toString(), status.toString()) as Int) else 0

public actual fun usearch_next(strsrch: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_next(strsrch.toString(), status.toString()) as Int) else 0

public actual fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_open(pattern.toString(), patternlength, text.toString(), textlength, locale.toString(), breakiter.toString(), status.toString()) as String).toLong() else 0L

public actual fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_openFromCollator(pattern.toString(), patternlength, text.toString(), textlength, collator.toString(), breakiter.toString(), status.toString()) as String).toLong() else 0L

public actual fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_preceding(strsrch.toString(), position, status.toString()) as Int) else 0

public actual fun usearch_previous(strsrch: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_previous(strsrch.toString(), status.toString()) as Int) else 0

public actual fun usearch_reset(strsrch: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_reset(strsrch.toString())
    }
}

public actual fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setAttribute(strsrch.toString(), attribute, value, status.toString())
    }
}

public actual fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setBreakIterator(strsrch.toString(), breakiter.toString(), status.toString())
    }
}

public actual fun usearch_setCollator(strsrch: Long, collator: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setCollator(strsrch.toString(), collator.toString(), status.toString())
    }
}

public actual fun usearch_setOffset(strsrch: Long, position: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setOffset(strsrch.toString(), position, status.toString())
    }
}

public actual fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setPattern(strsrch.toString(), pattern.toString(), patternlength, status.toString())
    }
}

public actual fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usearch_setText(strsrch.toString(), text.toString(), textlength, status.toString())
    }
}

public actual fun uset_add(set: Long, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_add(set.toString(), c)
    }
}

public actual fun uset_addAll(set: Long, additionalset: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_addAll(set.toString(), additionalset.toString())
    }
}

public actual fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_addAllCodePoints(set.toString(), str.toString(), strlen)
    }
}

public actual fun uset_addRange(set: Long, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_addRange(set.toString(), start, end)
    }
}

public actual fun uset_addString(set: Long, str: Long, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_addString(set.toString(), str.toString(), strlen)
    }
}

public actual fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_applyIntPropertyValue(set.toString(), prop, value, ec.toString())
    }
}

public actual fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_applyPattern(set.toString(), pattern.toString(), patternlength, options.toInt(), status.toString()) as Int) else 0

public actual fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_applyPropertyAlias(set.toString(), prop.toString(), proplength, value.toString(), valuelength, ec.toString())
    }
}

public actual fun uset_charAt(set: Long, charindex: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_charAt(set.toString(), charindex) as Int) else 0

public actual fun uset_clear(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_clear(set.toString())
    }
}

public actual fun uset_clone(set: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_clone(set.toString()) as String).toLong() else 0L

public actual fun uset_cloneAsThawed(set: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_cloneAsThawed(set.toString()) as String).toLong() else 0L

public actual fun uset_close(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_close(set.toString())
    }
}

public actual fun uset_closeOver(set: Long, attributes: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_closeOver(set.toString(), attributes)
    }
}

public actual fun uset_compact(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_compact(set.toString())
    }
}

public actual fun uset_complement(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_complement(set.toString())
    }
}

public actual fun uset_complementAll(set: Long, complement: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_complementAll(set.toString(), complement.toString())
    }
}

public actual fun uset_contains(set: Long, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_contains(set.toString(), c) as Int).toByte() else 0

public actual fun uset_containsAll(set1: Long, set2: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsAll(set1.toString(), set2.toString()) as Int).toByte() else 0

public actual fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsAllCodePoints(set.toString(), str.toString(), strlen) as Int).toByte() else 0

public actual fun uset_containsNone(set1: Long, set2: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsNone(set1.toString(), set2.toString()) as Int).toByte() else 0

public actual fun uset_containsRange(set: Long, start: Int, end: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsRange(set.toString(), start, end) as Int).toByte() else 0

public actual fun uset_containsSome(set1: Long, set2: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsSome(set1.toString(), set2.toString()) as Int).toByte() else 0

public actual fun uset_containsString(set: Long, str: Long, strlen: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_containsString(set.toString(), str.toString(), strlen) as Int).toByte() else 0

public actual fun uset_equals(set1: Long, set2: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_equals(set1.toString(), set2.toString()) as Int).toByte() else 0

public actual fun uset_freeze(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_freeze(set.toString())
    }
}

public actual fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_getItem(set.toString(), itemindex, start.toString(), end.toString(), str.toString(), strcapacity, ec.toString()) as Int) else 0

public actual fun uset_getItemCount(set: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_getItemCount(set.toString()) as Int) else 0

public actual fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_getSerializedRange(set.toString(), rangeindex, pstart.toString(), pend.toString()) as Int).toByte() else 0

public actual fun uset_getSerializedRangeCount(set: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_getSerializedRangeCount(set.toString()) as Int) else 0

public actual fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_getSerializedSet(fillset.toString(), src.toString(), srclength) as Int).toByte() else 0

public actual fun uset_indexOf(set: Long, c: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_indexOf(set.toString(), c) as Int) else 0

public actual fun uset_isEmpty(set: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_isEmpty(set.toString()) as Int).toByte() else 0

public actual fun uset_isFrozen(set: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_isFrozen(set.toString()) as Int).toByte() else 0

public actual fun uset_open(start: Int, end: Int): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_open(start, end) as String).toLong() else 0L

public actual fun uset_openEmpty(): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_openEmpty() as String).toLong() else 0L

public actual fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_openPattern(pattern.toString(), patternlength, ec.toString()) as String).toLong() else 0L

public actual fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_openPatternOptions(pattern.toString(), patternlength, options.toInt(), ec.toString()) as String).toLong() else 0L

public actual fun uset_remove(set: Long, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_remove(set.toString(), c)
    }
}

public actual fun uset_removeAll(set: Long, removeset: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_removeAll(set.toString(), removeset.toString())
    }
}

public actual fun uset_removeAllStrings(set: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_removeAllStrings(set.toString())
    }
}

public actual fun uset_removeRange(set: Long, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_removeRange(set.toString(), start, end)
    }
}

public actual fun uset_removeString(set: Long, str: Long, strlen: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_removeString(set.toString(), str.toString(), strlen)
    }
}

public actual fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_resemblesPattern(pattern.toString(), patternlength, pos) as Int).toByte() else 0

public actual fun uset_retain(set: Long, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_retain(set.toString(), start, end)
    }
}

public actual fun uset_retainAll(set: Long, retain: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_retainAll(set.toString(), retain.toString())
    }
}

public actual fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_serialize(set.toString(), dest.toString(), destcapacity, perrorcode.toString()) as Int) else 0

public actual fun uset_serializedContains(set: Long, c: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_serializedContains(set.toString(), c) as Int).toByte() else 0

public actual fun uset_set(set: Long, start: Int, end: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_set(set.toString(), start, end)
    }
}

public actual fun uset_setSerializedToOne(fillset: Long, c: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_setSerializedToOne(fillset.toString(), c)
    }
}

public actual fun uset_size(set: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_size(set.toString()) as Int) else 0

public actual fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_span(set.toString(), s.toString(), length, spancondition) as Int) else 0

public actual fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_spanBack(set.toString(), s.toString(), length, spancondition) as Int) else 0

public actual fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_spanBackUTF8(set.toString(), s.toString(), length, spancondition) as Int) else 0

public actual fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_spanUTF8(set.toString(), s.toString(), length, spancondition) as Int) else 0

public actual fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uset_toPattern(set.toString(), result.toString(), resultcapacity, escapeunprintable.toInt(), ec.toString()) as Int) else 0

public actual fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_areConfusable(sc.toString(), id1.toString(), length1, id2.toString(), length2, status.toString()) as Int) else 0

public actual fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_areConfusableUTF8(sc.toString(), id1.toString(), length1, id2.toString(), length2, status.toString()) as Int) else 0

public actual fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_check(sc.toString(), id.toString(), length, position.toString(), status.toString()) as Int) else 0

public actual fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_check2(sc.toString(), id.toString(), length, checkresult.toString(), status.toString()) as Int) else 0

public actual fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_check2UTF8(sc.toString(), id.toString(), length, checkresult.toString(), status.toString()) as Int) else 0

public actual fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_checkUTF8(sc.toString(), id.toString(), length, position.toString(), status.toString()) as Int) else 0

public actual fun uspoof_clone(sc: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_clone(sc.toString(), status.toString()) as String).toLong() else 0L

public actual fun uspoof_close(sc: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_close(sc.toString())
    }
}

public actual fun uspoof_closeCheckResult(checkresult: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_closeCheckResult(checkresult.toString())
    }
}

public actual fun uspoof_getAllowedChars(sc: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getAllowedChars(sc.toString(), status.toString()) as String).toLong() else 0L

public actual fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getAllowedLocales(sc.toString(), status.toString()) as String).toLong() else 0L

public actual fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getCheckResultChecks(checkresult.toString(), status.toString()) as Int) else 0

public actual fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getCheckResultNumerics(checkresult.toString(), status.toString()) as String).toLong() else 0L

public actual fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getCheckResultRestrictionLevel(checkresult.toString(), status.toString()) as Int) else 0

public actual fun uspoof_getChecks(sc: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getChecks(sc.toString(), status.toString()) as Int) else 0

public actual fun uspoof_getInclusionSet(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getInclusionSet(status.toString()) as String).toLong() else 0L

public actual fun uspoof_getRecommendedSet(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getRecommendedSet(status.toString()) as String).toLong() else 0L

public actual fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getRestrictionLevel(sc.toString()) as Int) else 0

public actual fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getSkeleton(sc.toString(), type.toInt(), id.toString(), length, dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_getSkeletonUTF8(sc.toString(), type.toInt(), id.toString(), length, dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun uspoof_open(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_open(status.toString()) as String).toLong() else 0L

public actual fun uspoof_openCheckResult(status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_openCheckResult(status.toString()) as String).toLong() else 0L

public actual fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_openFromSerialized(data.toString(), length, pactuallength.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_openFromSource(confusables.toString(), confusableslen, confusableswholescript.toString(), confusableswholescriptlen, errtype.toString(), pe.toString(), status.toString()) as String).toLong() else 0L

public actual fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_serialize(sc.toString(), data.toString(), capacity, status.toString()) as Int) else 0

public actual fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_setAllowedChars(sc.toString(), chars.toString(), status.toString())
    }
}

public actual fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_setAllowedLocales(sc.toString(), localeslist.toString(), status.toString())
    }
}

public actual fun uspoof_setChecks(sc: Long, checks: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_setChecks(sc.toString(), checks, status.toString())
    }
}

public actual fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_uspoof_setRestrictionLevel(sc.toString(), restrictionlevel)
    }
}

public actual fun usprep_close(profile: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprep_close(profile.toString())
    }
}

public actual fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprep_open(path.toString(), filename.toString(), status.toString()) as String).toLong() else 0L

public actual fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprep_openByType(type, status.toString()) as String).toLong() else 0L

public actual fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_usprep_prepare(prep.toString(), src.toString(), srclength, dest.toString(), destcapacity, options, parseerror.toString(), status.toString()) as Int) else 0

public actual fun utext_char32At(ut: Long, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_char32At(ut.toString(), nativeindex.toString()) as Int) else 0

public actual fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_clone(dest.toString(), src.toString(), deep.toInt(), readonly.toInt(), status.toString()) as String).toLong() else 0L

public actual fun utext_close(ut: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_close(ut.toString()) as String).toLong() else 0L

public actual fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_copy(ut.toString(), nativestart.toString(), nativelimit.toString(), destindex.toString(), move.toInt(), status.toString())
    }
}

public actual fun utext_current32(ut: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_current32(ut.toString()) as Int) else 0

public actual fun utext_equals(a: Long, b: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_equals(a.toString(), b.toString()) as Int).toByte() else 0

public actual fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_extract(ut.toString(), nativestart.toString(), nativelimit.toString(), dest.toString(), destcapacity, status.toString()) as Int) else 0

public actual fun utext_freeze(ut: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_freeze(ut.toString())
    }
}

public actual fun utext_getNativeIndex(ut: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_getNativeIndex(ut.toString()) as String).toLong() else 0L

public actual fun utext_getPreviousNativeIndex(ut: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_getPreviousNativeIndex(ut.toString()) as String).toLong() else 0L

public actual fun utext_hasMetaData(ut: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_hasMetaData(ut.toString()) as Int).toByte() else 0

public actual fun utext_isLengthExpensive(ut: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_isLengthExpensive(ut.toString()) as Int).toByte() else 0

public actual fun utext_isWritable(ut: Long): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_isWritable(ut.toString()) as Int).toByte() else 0

public actual fun utext_moveIndex32(ut: Long, delta: Int): Byte =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_moveIndex32(ut.toString(), delta) as Int).toByte() else 0

public actual fun utext_nativeLength(ut: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_nativeLength(ut.toString()) as String).toLong() else 0L

public actual fun utext_next32(ut: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_next32(ut.toString()) as Int) else 0

public actual fun utext_next32From(ut: Long, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_next32From(ut.toString(), nativeindex.toString()) as Int) else 0

public actual fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_openUChars(ut.toString(), s.toString(), length.toString(), status.toString()) as String).toLong() else 0L

public actual fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_openUTF8(ut.toString(), s.toString(), length.toString(), status.toString()) as String).toLong() else 0L

public actual fun utext_previous32(ut: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_previous32(ut.toString()) as Int) else 0

public actual fun utext_previous32From(ut: Long, nativeindex: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_previous32From(ut.toString(), nativeindex.toString()) as Int) else 0

public actual fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_replace(ut.toString(), nativestart.toString(), nativelimit.toString(), replacementtext.toString(), replacementlength, status.toString()) as Int) else 0

public actual fun utext_setNativeIndex(ut: Long, nativeindex: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_setNativeIndex(ut.toString(), nativeindex.toString())
    }
}

public actual fun utext_setup(ut: Long, extraspace: Int, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utext_setup(ut.toString(), extraspace, status.toString()) as String).toLong() else 0L

public actual fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8_appendCharSafeBody(s.toString(), i, length, c, piserror.toString()) as Int) else 0

public actual fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8_back1SafeBody(s.toString(), start, i) as Int) else 0

public actual fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8_nextCharSafeBody(s.toString(), pi.toString(), length, c, strict.toInt()) as Int) else 0

public actual fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utf8_prevCharSafeBody(s.toString(), start, pi.toString(), c, strict.toInt()) as Int) else 0

public actual fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscale_fromInt64(othertime.toString(), timescale, status.toString()) as String).toLong() else 0L

public actual fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscale_getTimeScaleValue(timescale, value, status.toString()) as String).toLong() else 0L

public actual fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utmscale_toInt64(universaltime.toString(), timescale, status.toString()) as String).toLong() else 0L

public actual fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR): Int =
    0

public actual fun utrace_functionName(fnnumber: Int): PCSTR =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_functionName(fnnumber) as String).toLong() else 0L

public actual fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_getFunctions(context.toString(), e.toString(), x.toString(), d.toString())
    }
}

public actual fun utrace_getLevel(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_getLevel() as Int) else 0

public actual fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_setFunctions(context.toString(), e.toLong().toString(), x.toLong().toString(), d.toLong().toString())
    }
}

public actual fun utrace_setLevel(tracelevel: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_setLevel(tracelevel)
    }
}

public actual fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrace_vformat(outbuf.toString(), capacity, indent, fmt.toString(), args.toString()) as Int) else 0

public actual fun utrans_clone(trans: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_clone(trans.toString(), status.toString()) as String).toLong() else 0L

public actual fun utrans_close(trans: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_close(trans.toString())
    }
}

public actual fun utrans_countAvailableIDs(): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_countAvailableIDs() as Int) else 0

public actual fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_getSourceSet(trans.toString(), ignorefilter.toInt(), fillin.toString(), status.toString()) as String).toLong() else 0L

public actual fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_getUnicodeID(trans.toString(), resultlength.toString()) as String).toLong() else 0L

public actual fun utrans_openIDs(perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_openIDs(perrorcode.toString()) as String).toLong() else 0L

public actual fun utrans_openInverse(trans: Long, status: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_openInverse(trans.toString(), status.toString()) as String).toLong() else 0L

public actual fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_openU(id.toString(), idlength, dir, rules.toString(), ruleslength, parseerror.toString(), perrorcode.toString()) as String).toLong() else 0L

public actual fun utrans_register(adoptedtrans: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_register(adoptedtrans.toString(), status.toString())
    }
}

public actual fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_setFilter(trans.toString(), filterpattern.toString(), filterpatternlen, status.toString())
    }
}

public actual fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int =
    if (_windowsWin32GlobalizationNapiAddon != null) (_windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_toRules(trans.toString(), escapeunprintable.toInt(), result.toString(), resultlength, status.toString()) as Int) else 0

public actual fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_trans(trans.toString(), rep.toString(), repfunc.toString(), start, limit.toString(), status.toString())
    }
}

public actual fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_transIncremental(trans.toString(), rep.toString(), repfunc.toString(), pos.toString(), status.toString())
    }
}

public actual fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_transIncrementalUChars(trans.toString(), text.toString(), textlength.toString(), textcapacity, pos.toString(), status.toString())
    }
}

public actual fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_transUChars(trans.toString(), text.toString(), textlength.toString(), textcapacity, start, limit.toString(), status.toString())
    }
}

public actual fun utrans_unregisterID(id: Long, idlength: Int) {
    if (_windowsWin32GlobalizationNapiAddon != null) {
        _windowsWin32GlobalizationNapiAddon.windowssys_windows_win32_globalization_utrans_unregisterID(id.toString(), idlength)
    }
}
