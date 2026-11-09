@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_AdjustCalendarDate(lpcaldatetime.toCPointer<ByteVar>(), calunit, amount)

public actual fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_CompareStringA(locale, dwcmpflags, lpstring1.toCPointer<ByteVar>(), cchcount1, lpstring2.toCPointer<ByteVar>(), cchcount2)

public actual fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: LPARAM): COMPARESTRING_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_CompareStringEx(lplocalename.toCPointer<ByteVar>(), dwcmpflags, lpstring1.toCPointer<ByteVar>(), cchcount1, lpstring2.toCPointer<ByteVar>(), cchcount2, lpversioninformation.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lparam)

public actual fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_CompareStringOrdinal(lpstring1.toCPointer<ByteVar>(), cchcount1, lpstring2.toCPointer<ByteVar>(), cchcount2, bignorecase)

public actual fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_CompareStringW(locale, dwcmpflags, lpstring1.toCPointer<ByteVar>(), cchcount1, lpstring2.toCPointer<ByteVar>(), cchcount2)

public actual fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ConvertCalDateTimeToSystemTime(lpcaldatetime.toCPointer<ByteVar>(), lpsystime.toCPointer<ByteVar>())

public actual fun ConvertDefaultLocale(locale: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ConvertDefaultLocale(locale)

public actual fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ConvertSystemTimeToCalDateTime(lpsystime.toCPointer<ByteVar>(), calid, lpcaldatetime.toCPointer<ByteVar>())

public actual fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumCalendarInfoA(lpcalinfoenumproc.toLong().toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumCalendarInfoExA(lpcalinfoenumprocex.toLong().toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumCalendarInfoExEx(pcalinfoenumprocexex.toLong().toCPointer<ByteVar>(), lplocalename.toCPointer<ByteVar>(), calendar, lpreserved.toCPointer<ByteVar>(), caltype, lparam)

public actual fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumCalendarInfoExW(lpcalinfoenumprocex.toLong().toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumCalendarInfoW(lpcalinfoenumproc.toLong().toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumDateFormatsA(lpdatefmtenumproc.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumDateFormatsExA(lpdatefmtenumprocex.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumDateFormatsExEx(lpdatefmtenumprocexex.toLong().toCPointer<ByteVar>(), lplocalename.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumDateFormatsExW(lpdatefmtenumprocex.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumDateFormatsW(lpdatefmtenumproc.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc.toLong().toCPointer<ByteVar>(), languagegroup, dwflags, lparam)

public actual fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc.toLong().toCPointer<ByteVar>(), languagegroup, dwflags, lparam)

public actual fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemCodePagesA(lpcodepageenumproc.toLong().toCPointer<ByteVar>(), dwflags)

public actual fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemCodePagesW(lpcodepageenumproc.toLong().toCPointer<ByteVar>(), dwflags)

public actual fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemGeoID(geoclass, parentgeoid, lpgeoenumproc.toLong().toCPointer<ByteVar>())

public actual fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemGeoNames(geoclass, geoenumproc.toLong().toCPointer<ByteVar>(), data)

public actual fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsA(lplanguagegroupenumproc.toLong().toCPointer<ByteVar>(), dwflags, lparam)

public actual fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsW(lplanguagegroupenumproc.toLong().toCPointer<ByteVar>(), dwflags, lparam)

public actual fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemLocalesA(lplocaleenumproc.toLong().toCPointer<ByteVar>(), dwflags)

public actual fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: LPARAM, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemLocalesEx(lplocaleenumprocex.toLong().toCPointer<ByteVar>(), dwflags, lparam, lpreserved.toCPointer<ByteVar>())

public actual fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumSystemLocalesW(lplocaleenumproc.toLong().toCPointer<ByteVar>(), dwflags)

public actual fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumTimeFormatsA(lptimefmtenumproc.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumTimeFormatsEx(lptimefmtenumprocex.toLong().toCPointer<ByteVar>(), lplocalename.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumTimeFormatsW(lptimefmtenumproc.toLong().toCPointer<ByteVar>(), locale, dwflags)

public actual fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumUILanguagesA(lpuilanguageenumproc.toLong().toCPointer<ByteVar>(), dwflags, lparam)

public actual fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_EnumUILanguagesW(lpuilanguageenumproc.toLong().toCPointer<ByteVar>(), dwflags, lparam)

public actual fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_FindNLSString(locale, dwfindnlsstringflags, lpstringsource.toCPointer<ByteVar>(), cchsource, lpstringvalue.toCPointer<ByteVar>(), cchvalue, pcchfound.toCPointer<ByteVar>())

public actual fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_FindNLSStringEx(lplocalename.toCPointer<ByteVar>(), dwfindnlsstringflags, lpstringsource.toCPointer<ByteVar>(), cchsource, lpstringvalue.toCPointer<ByteVar>(), cchvalue, pcchfound.toCPointer<ByteVar>(), lpversioninformation.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), sorthandle)

public actual fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_FindStringOrdinal(dwfindstringordinalflags, lpstringsource.toCPointer<ByteVar>(), cchsource, lpstringvalue.toCPointer<ByteVar>(), cchvalue, bignorecase)

public actual fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_FoldStringA(dwmapflags, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_FoldStringW(dwmapflags, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun GetACP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetACP()

public actual fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCPInfo(codepage, lpcpinfo.toCPointer<ByteVar>())

public actual fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCPInfoExA(codepage, dwflags, lpcpinfoex.toCPointer<ByteVar>())

public actual fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCPInfoExW(codepage, dwflags, lpcpinfoex.toCPointer<ByteVar>())

public actual fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCalendarDateFormatEx(lpszlocale.toCPointer<ByteVar>(), dwflags, lpcaldatetime.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpdatestr.toCPointer<ByteVar>(), cchdate)

public actual fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCalendarInfoA(locale, calendar, caltype, lpcaldata.toCPointer<ByteVar>(), cchdata, lpvalue.toCPointer<ByteVar>())

public actual fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCalendarInfoEx(lplocalename.toCPointer<ByteVar>(), calendar, lpreserved.toCPointer<ByteVar>(), caltype, lpcaldata.toCPointer<ByteVar>(), cchdata, lpvalue.toCPointer<ByteVar>())

public actual fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCalendarInfoW(locale, calendar, caltype, lpcaldata.toCPointer<ByteVar>(), cchdata, lpvalue.toCPointer<ByteVar>())

public actual fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCalendarSupportedDateRange(calendar, lpcalmindatetime.toCPointer<ByteVar>(), lpcalmaxdatetime.toCPointer<ByteVar>())

public actual fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCurrencyFormatA(locale, dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpcurrencystr.toCPointer<ByteVar>(), cchcurrency)

public actual fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCurrencyFormatEx(lplocalename.toCPointer<ByteVar>(), dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpcurrencystr.toCPointer<ByteVar>(), cchcurrency)

public actual fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetCurrencyFormatW(locale, dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpcurrencystr.toCPointer<ByteVar>(), cchcurrency)

public actual fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDateFormatA(locale, dwflags, lpdate.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpdatestr.toCPointer<ByteVar>(), cchdate)

public actual fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDateFormatEx(lplocalename.toCPointer<ByteVar>(), dwflags, lpdate.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpdatestr.toCPointer<ByteVar>(), cchdate, lpcalendar.toCPointer<ByteVar>())

public actual fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDateFormatW(locale, dwflags, lpdate.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpdatestr.toCPointer<ByteVar>(), cchdate)

public actual fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDistanceOfClosestLanguageInList(pszlanguage.toCPointer<ByteVar>(), pszlanguageslist.toCPointer<ByteVar>(), wchlistdelimiter, pclosestdistance.toCPointer<ByteVar>())

public actual fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDurationFormat(locale, dwflags, lpduration.toCPointer<ByteVar>(), ullduration, lpformat.toCPointer<ByteVar>(), lpdurationstr.toCPointer<ByteVar>(), cchduration)

public actual fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetDurationFormatEx(lplocalename.toCPointer<ByteVar>(), dwflags, lpduration.toCPointer<ByteVar>(), ullduration, lpformat.toCPointer<ByteVar>(), lpdurationstr.toCPointer<ByteVar>(), cchduration)

public actual fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetFileMUIInfo(dwflags, pcwszfilepath.toCPointer<ByteVar>(), pfilemuiinfo.toCPointer<ByteVar>(), pcbfilemuiinfo.toCPointer<ByteVar>())

public actual fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetFileMUIPath(dwflags, pcwszfilepath.toCPointer<ByteVar>(), pwszlanguage.toCPointer<ByteVar>(), pcchlanguage.toCPointer<ByteVar>(), pwszfilemuipath.toCPointer<ByteVar>(), pcchfilemuipath.toCPointer<ByteVar>(), pululenumerator.toCPointer<ByteVar>())

public actual fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetGeoInfoA(location, geotype, lpgeodata.toCPointer<ByteVar>(), cchdata, langid)

public actual fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetGeoInfoEx(location.toCPointer<ByteVar>(), geotype, geodata.toCPointer<ByteVar>(), geodatacount)

public actual fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetGeoInfoW(location, geotype, lpgeodata.toCPointer<ByteVar>(), cchdata, langid)

public actual fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetLocaleInfoA(locale, lctype, lplcdata.toCPointer<ByteVar>(), cchdata)

public actual fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetLocaleInfoEx(lplocalename.toCPointer<ByteVar>(), lctype, lplcdata.toCPointer<ByteVar>(), cchdata)

public actual fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetLocaleInfoW(locale, lctype, lplcdata.toCPointer<ByteVar>(), cchdata)

public actual fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetNLSVersion(function, locale, lpversioninformation.toCPointer<ByteVar>())

public actual fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetNLSVersionEx(function, lplocalename.toCPointer<ByteVar>(), lpversioninformation.toCPointer<ByteVar>())

public actual fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetNumberFormatA(locale, dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpnumberstr.toCPointer<ByteVar>(), cchnumber)

public actual fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetNumberFormatEx(lplocalename.toCPointer<ByteVar>(), dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpnumberstr.toCPointer<ByteVar>(), cchnumber)

public actual fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetNumberFormatW(locale, dwflags, lpvalue.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lpnumberstr.toCPointer<ByteVar>(), cchnumber)

public actual fun GetOEMCP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetOEMCP()

public actual fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetProcessPreferredUILanguages(dwflags, pulnumlanguages.toCPointer<ByteVar>(), pwszlanguagesbuffer.toCPointer<ByteVar>(), pcchlanguagesbuffer.toCPointer<ByteVar>())

public actual fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetStringScripts(dwflags, lpstring.toCPointer<ByteVar>(), cchstring, lpscripts.toCPointer<ByteVar>(), cchscripts)

public actual fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetStringTypeA(locale, dwinfotype, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpchartype.toCPointer<ByteVar>())

public actual fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetStringTypeExA(locale, dwinfotype, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpchartype.toCPointer<ByteVar>())

public actual fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetStringTypeExW(locale, dwinfotype, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpchartype.toCPointer<ByteVar>())

public actual fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetStringTypeW(dwinfotype, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpchartype.toCPointer<ByteVar>())

public actual fun GetSystemDefaultLCID(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetSystemDefaultLCID()

public actual fun GetSystemDefaultLangID(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetSystemDefaultLangID()

public actual fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetSystemDefaultLocaleName(lplocalename.toCPointer<ByteVar>(), cchlocalename)

public actual fun GetSystemDefaultUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetSystemDefaultUILanguage()

public actual fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetSystemPreferredUILanguages(dwflags, pulnumlanguages.toCPointer<ByteVar>(), pwszlanguagesbuffer.toCPointer<ByteVar>(), pcchlanguagesbuffer.toCPointer<ByteVar>())

public actual fun GetTextCharset(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetTextCharset(hdc.toCPointer<ByteVar>())

public actual fun GetTextCharsetInfo(hdc: HDC, lpsig: Long, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetTextCharsetInfo(hdc.toCPointer<ByteVar>(), lpsig.toCPointer<ByteVar>(), dwflags)

public actual fun GetThreadLocale(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetThreadLocale()

public actual fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetThreadPreferredUILanguages(dwflags, pulnumlanguages.toCPointer<ByteVar>(), pwszlanguagesbuffer.toCPointer<ByteVar>(), pcchlanguagesbuffer.toCPointer<ByteVar>())

public actual fun GetThreadUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetThreadUILanguage()

public actual fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetTimeFormatA(locale, dwflags, lptime.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lptimestr.toCPointer<ByteVar>(), cchtime)

public actual fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetTimeFormatEx(lplocalename.toCPointer<ByteVar>(), dwflags, lptime.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lptimestr.toCPointer<ByteVar>(), cchtime)

public actual fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetTimeFormatW(locale, dwflags, lptime.toCPointer<ByteVar>(), lpformat.toCPointer<ByteVar>(), lptimestr.toCPointer<ByteVar>(), cchtime)

public actual fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUILanguageInfo(dwflags, pwmszlanguage.toCPointer<ByteVar>(), pwszfallbacklanguages.toCPointer<ByteVar>(), pcchfallbacklanguages.toCPointer<ByteVar>(), pattributes.toCPointer<ByteVar>())

public actual fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserDefaultGeoName(geoname.toCPointer<ByteVar>(), geonamecount)

public actual fun GetUserDefaultLCID(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserDefaultLCID()

public actual fun GetUserDefaultLangID(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserDefaultLangID()

public actual fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserDefaultLocaleName(lplocalename.toCPointer<ByteVar>(), cchlocalename)

public actual fun GetUserDefaultUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserDefaultUILanguage()

public actual fun GetUserGeoID(geoclass: SYSGEOCLASS): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserGeoID(geoclass)

public actual fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_GetUserPreferredUILanguages(dwflags, pulnumlanguages.toCPointer<ByteVar>(), pwszlanguagesbuffer.toCPointer<ByteVar>(), pcchlanguagesbuffer.toCPointer<ByteVar>())

public actual fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IdnToAscii(dwflags, lpunicodecharstr.toCPointer<ByteVar>(), cchunicodechar, lpasciicharstr.toCPointer<ByteVar>(), cchasciichar)

public actual fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IdnToNameprepUnicode(dwflags, lpunicodecharstr.toCPointer<ByteVar>(), cchunicodechar, lpnameprepcharstr.toCPointer<ByteVar>(), cchnameprepchar)

public actual fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IdnToUnicode(dwflags, lpasciicharstr.toCPointer<ByteVar>(), cchasciichar, lpunicodecharstr.toCPointer<ByteVar>(), cchunicodechar)

public actual fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsCalendarLeapYear(calid, year, era)

public actual fun IsDBCSLeadByte(testchar: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsDBCSLeadByte(testchar)

public actual fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsDBCSLeadByteEx(codepage, testchar)

public actual fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsNLSDefinedString(function, dwflags, lpversioninformation.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), cchstr)

public actual fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsNormalizedString(normform, lpstring.toCPointer<ByteVar>(), cwlength)

public actual fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsTextUnicode(lpv.toCPointer<ByteVar>(), isize, lpiresult.toCPointer<ByteVar>())

public actual fun IsValidCodePage(codepage: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsValidCodePage(codepage)

public actual fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsValidLanguageGroup(languagegroup, dwflags)

public actual fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsValidLocale(locale, dwflags)

public actual fun IsValidLocaleName(lplocalename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsValidLocaleName(lplocalename.toCPointer<ByteVar>())

public actual fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsValidNLSVersion(function, lplocalename.toCPointer<ByteVar>(), lpversioninformation.toCPointer<ByteVar>())

public actual fun IsWellFormedTag(psztag: PCWSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_IsWellFormedTag(psztag.toCPointer<ByteVar>())

public actual fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_LCIDToLocaleName(locale, lpname.toCPointer<ByteVar>(), cchname, dwflags)

public actual fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_LCMapStringA(locale, dwmapflags, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_LCMapStringEx(lplocalename.toCPointer<ByteVar>(), dwmapflags, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest, lpversioninformation.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), sorthandle)

public actual fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_LCMapStringW(locale, dwmapflags, lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_LocaleNameToLCID(lpname.toCPointer<ByteVar>(), dwflags)

public actual fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MappingDoAction(pbag.toCPointer<ByteVar>(), dwrangeindex, pszactionid.toCPointer<ByteVar>())

public actual fun MappingFreePropertyBag(pbag: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MappingFreePropertyBag(pbag.toCPointer<ByteVar>())

public actual fun MappingFreeServices(pserviceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MappingFreeServices(pserviceinfo.toCPointer<ByteVar>())

public actual fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MappingGetServices(poptions.toCPointer<ByteVar>(), prgservices.toCPointer<ByteVar>(), pdwservicescount.toCPointer<ByteVar>())

public actual fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MappingRecognizeText(pserviceinfo.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), dwlength, dwindex, poptions.toCPointer<ByteVar>(), pbag.toCPointer<ByteVar>())

public actual fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_MultiByteToWideChar(codepage, dwflags, lpmultibytestr.toCPointer<ByteVar>(), cbmultibyte, lpwidecharstr.toCPointer<ByteVar>(), cchwidechar)

public actual fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_NormalizeString(normform, lpsrcstring.toCPointer<ByteVar>(), cwsrclength, lpdststring.toCPointer<ByteVar>(), cwdstlength)

public actual fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_NotifyUILanguageChange(dwflags, pcwstrnewlanguage.toCPointer<ByteVar>(), pcwstrpreviouslanguage.toCPointer<ByteVar>(), dwreserved, pdwstatusrtrn.toCPointer<ByteVar>())

public actual fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ResolveLocaleName(lpnametoresolve.toCPointer<ByteVar>(), lplocalename.toCPointer<ByteVar>(), cchlocalename)

public actual fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_RestoreThreadPreferredUILanguages(snapshot.toCPointer<ByteVar>())
}

public actual fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptApplyDigitSubstitution(psds.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), pss.toCPointer<ByteVar>())

public actual fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptApplyLogicalWidth(pidx.toCPointer<ByteVar>(), cchars, cglyphs, pwlogclust.toCPointer<ByteVar>(), psva.toCPointer<ByteVar>(), piadvance.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), pabc.toCPointer<ByteVar>(), pijustify.toCPointer<ByteVar>())

public actual fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptBreak(pwcchars.toCPointer<ByteVar>(), cchars, psa.toCPointer<ByteVar>(), psla.toCPointer<ByteVar>())

public actual fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust.toCPointer<ByteVar>(), psva.toCPointer<ByteVar>(), piadvance.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), pix.toCPointer<ByteVar>())

public actual fun ScriptCacheGetHeight(hdc: HDC, psc: Long, tmheight: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptCacheGetHeight(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), tmheight.toCPointer<ByteVar>())

public actual fun ScriptFreeCache(psc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptFreeCache(psc.toCPointer<ByteVar>())

public actual fun ScriptGetCMap(hdc: HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetCMap(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), pwcinchars.toCPointer<ByteVar>(), cchars, dwflags, pwoutglyphs.toCPointer<ByteVar>())

public actual fun ScriptGetFontAlternateGlyphs(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetFontAlternateGlyphs(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, taglangsys, tagfeature, wglyphid, cmaxalternates, palternateglyphs.toCPointer<ByteVar>(), pcalternates.toCPointer<ByteVar>())

public actual fun ScriptGetFontFeatureTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetFontFeatureTags(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, taglangsys, cmaxtags, pfeaturetags.toCPointer<ByteVar>(), pctags.toCPointer<ByteVar>())

public actual fun ScriptGetFontLanguageTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetFontLanguageTags(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, cmaxtags, plangsystags.toCPointer<ByteVar>(), pctags.toCPointer<ByteVar>())

public actual fun ScriptGetFontProperties(hdc: HDC, psc: Long, sfp: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetFontProperties(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), sfp.toCPointer<ByteVar>())

public actual fun ScriptGetFontScriptTags(hdc: HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetFontScriptTags(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), cmaxtags, pscripttags.toCPointer<ByteVar>(), pctags.toCPointer<ByteVar>())

public actual fun ScriptGetGlyphABCWidth(hdc: HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetGlyphABCWidth(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), wglyph, pabc.toCPointer<ByteVar>())

public actual fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetLogicalWidths(psa.toCPointer<ByteVar>(), cchars, cglyphs, piglyphwidth.toCPointer<ByteVar>(), pwlogclust.toCPointer<ByteVar>(), psva.toCPointer<ByteVar>(), pidx.toCPointer<ByteVar>())

public actual fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptGetProperties(ppsp.toCPointer<ByteVar>(), pinumscripts.toCPointer<ByteVar>())

public actual fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptIsComplex(pwcinchars.toCPointer<ByteVar>(), cinchars, dwflags)

public actual fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptItemize(pwcinchars.toCPointer<ByteVar>(), cinchars, cmaxitems, pscontrol.toCPointer<ByteVar>(), psstate.toCPointer<ByteVar>(), pitems.toCPointer<ByteVar>(), pcitems.toCPointer<ByteVar>())

public actual fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptItemizeOpenType(pwcinchars.toCPointer<ByteVar>(), cinchars, cmaxitems, pscontrol.toCPointer<ByteVar>(), psstate.toCPointer<ByteVar>(), pitems.toCPointer<ByteVar>(), pscripttags.toCPointer<ByteVar>(), pcitems.toCPointer<ByteVar>())

public actual fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptJustify(psva.toCPointer<ByteVar>(), piadvance.toCPointer<ByteVar>(), cglyphs, idx, iminkashida, pijustify.toCPointer<ByteVar>())

public actual fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptLayout(cruns, pblevel.toCPointer<ByteVar>(), pivisualtological.toCPointer<ByteVar>(), pilogicaltovisual.toCPointer<ByteVar>())

public actual fun ScriptPlace(hdc: HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptPlace(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), pwglyphs.toCPointer<ByteVar>(), cglyphs, psva.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), piadvance.toCPointer<ByteVar>(), pgoffset.toCPointer<ByteVar>(), pabc.toCPointer<ByteVar>())

public actual fun ScriptPlaceOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptPlaceOpenType(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, taglangsys, rcrangechars.toCPointer<ByteVar>(), rprangeproperties.toCPointer<ByteVar>(), cranges, pwcchars.toCPointer<ByteVar>(), pwlogclust.toCPointer<ByteVar>(), pcharprops.toCPointer<ByteVar>(), cchars, pwglyphs.toCPointer<ByteVar>(), pglyphprops.toCPointer<ByteVar>(), cglyphs, piadvance.toCPointer<ByteVar>(), pgoffset.toCPointer<ByteVar>(), pabc.toCPointer<ByteVar>())

public actual fun ScriptPositionSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT =
    0

public actual fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptRecordDigitSubstitution(locale, psds.toCPointer<ByteVar>())

public actual fun ScriptShape(hdc: HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptShape(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), pwcchars.toCPointer<ByteVar>(), cchars, cmaxglyphs, psa.toCPointer<ByteVar>(), pwoutglyphs.toCPointer<ByteVar>(), pwlogclust.toCPointer<ByteVar>(), psva.toCPointer<ByteVar>(), pcglyphs.toCPointer<ByteVar>())

public actual fun ScriptShapeOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptShapeOpenType(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, taglangsys, rcrangechars.toCPointer<ByteVar>(), rprangeproperties.toCPointer<ByteVar>(), cranges, pwcchars.toCPointer<ByteVar>(), cchars, cmaxglyphs, pwlogclust.toCPointer<ByteVar>(), pcharprops.toCPointer<ByteVar>(), pwoutglyphs.toCPointer<ByteVar>(), poutglyphprops.toCPointer<ByteVar>(), pcglyphs.toCPointer<ByteVar>())

public actual fun ScriptStringAnalyse(hdc: HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringAnalyse(hdc.toCPointer<ByteVar>(), pstring.toCPointer<ByteVar>(), cstring, cglyphs, icharset, dwflags, ireqwidth, pscontrol.toCPointer<ByteVar>(), psstate.toCPointer<ByteVar>(), pidx.toCPointer<ByteVar>(), ptabdef.toCPointer<ByteVar>(), pbinclass.toCPointer<ByteVar>(), pssa.toCPointer<ByteVar>())

public actual fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringCPtoX(ssa.toCPointer<ByteVar>(), icp, ftrailing, px.toCPointer<ByteVar>())

public actual fun ScriptStringFree(pssa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringFree(pssa.toCPointer<ByteVar>())

public actual fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringGetLogicalWidths(ssa.toCPointer<ByteVar>(), pidx.toCPointer<ByteVar>())

public actual fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringGetOrder(ssa.toCPointer<ByteVar>(), puorder.toCPointer<ByteVar>())

public actual fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringOut(ssa.toCPointer<ByteVar>(), ix, iy, uoptions, prc.toCPointer<ByteVar>(), iminsel, imaxsel, fdisabled)

public actual fun ScriptStringValidate(ssa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringValidate(ssa.toCPointer<ByteVar>())

public actual fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptStringXtoCP(ssa.toCPointer<ByteVar>(), ix, pich.toCPointer<ByteVar>(), pitrailing.toCPointer<ByteVar>())

public actual fun ScriptString_pLogAttr(ssa: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptString_pLogAttr(ssa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ScriptString_pSize(ssa: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptString_pSize(ssa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ScriptString_pcOutChars(ssa: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptString_pcOutChars(ssa.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ScriptSubstituteSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptSubstituteSingleGlyph(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), tagscript, taglangsys, tagfeature, lparameter, wglyphid, pwoutglyphid.toCPointer<ByteVar>())

public actual fun ScriptTextOut(hdc: HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptTextOut(hdc.toCPointer<ByteVar>(), psc.toCPointer<ByteVar>(), x, y, fuoptions, lprc.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), pwcreserved.toCPointer<ByteVar>(), ireserved, pwglyphs.toCPointer<ByteVar>(), cglyphs, piadvance.toCPointer<ByteVar>(), pijustify.toCPointer<ByteVar>(), pgoffset.toCPointer<ByteVar>())

public actual fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ScriptXtoCP(ix, cchars, cglyphs, pwlogclust.toCPointer<ByteVar>(), psva.toCPointer<ByteVar>(), piadvance.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>(), picp.toCPointer<ByteVar>(), pitrailing.toCPointer<ByteVar>())

public actual fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetCalendarInfoA(locale, calendar, caltype, lpcaldata.toCPointer<ByteVar>())

public actual fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetCalendarInfoW(locale, calendar, caltype, lpcaldata.toCPointer<ByteVar>())

public actual fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetLocaleInfoA(locale, lctype, lplcdata.toCPointer<ByteVar>())

public actual fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetLocaleInfoW(locale, lctype, lplcdata.toCPointer<ByteVar>())

public actual fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetProcessPreferredUILanguages(dwflags, pwszlanguagesbuffer.toCPointer<ByteVar>(), pulnumlanguages.toCPointer<ByteVar>())

public actual fun SetThreadLocale(locale: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetThreadLocale(locale)

public actual fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages(dwflags, pwszlanguagesbuffer.toCPointer<ByteVar>(), pulnumlanguages.toCPointer<ByteVar>())

public actual fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages2(flags, languages.toCPointer<ByteVar>(), numlanguagesset.toCPointer<ByteVar>(), snapshot.toCPointer<ByteVar>())

public actual fun SetThreadUILanguage(langid: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetThreadUILanguage(langid)

public actual fun SetUserGeoID(geoid: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetUserGeoID(geoid)

public actual fun SetUserGeoName(geoname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_SetUserGeoName(geoname.toCPointer<ByteVar>())

public actual fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_TranslateCharsetInfo(lpsrc.toCPointer<ByteVar>(), lpcs.toCPointer<ByteVar>(), dwflags)

public actual fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_ESCAPE(context.toCPointer<ByteVar>(), fromuargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, codepoint, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SKIP(context.toCPointer<ByteVar>(), fromuargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, codepoint, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_STOP(context.toCPointer<ByteVar>(), fromuargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, codepoint, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SUBSTITUTE(context.toCPointer<ByteVar>(), fromuargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, codepoint, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_ESCAPE(context.toCPointer<ByteVar>(), touargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SKIP(context.toCPointer<ByteVar>(), touargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_STOP(context.toCPointer<ByteVar>(), touargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, reason, err.toCPointer<ByteVar>())
}

public actual fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SUBSTITUTE(context.toCPointer<ByteVar>(), touargs.toCPointer<ByteVar>(), codeunits.toCPointer<ByteVar>(), length, reason, err.toCPointer<ByteVar>())
}

public actual fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_UpdateCalendarDayOfWeek(lpcaldatetime.toCPointer<ByteVar>())

public actual fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_VerifyScripts(dwflags, lplocalescripts.toCPointer<ByteVar>(), cchlocalescripts, lptestscripts.toCPointer<ByteVar>(), cchtestscripts)

public actual fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_WideCharToMultiByte(codepage, dwflags, lpwidecharstr.toCPointer<ByteVar>(), cchwidechar, lpmultibytestr.toCPointer<ByteVar>(), cbmultibyte, lpdefaultchar.toCPointer<ByteVar>(), lpuseddefaultchar.toCPointer<ByteVar>())

public actual fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcatA(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcatW(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpA(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())

public actual fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpW(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())

public actual fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpiA(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())

public actual fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpiW(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())

public actual fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpyA(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpyW(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpynA(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>(), imaxlength)?.toLong() ?: 0L

public actual fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpynW(lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>(), imaxlength)?.toLong() ?: 0L

public actual fun lstrlenA(lpstring: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrlenA(lpstring.toCPointer<ByteVar>())

public actual fun lstrlenW(lpstring: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrlenW(lpstring.toCPointer<ByteVar>())

public actual fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_UCharsToChars(us.toCPointer<ByteVar>(), cs.toCPointer<ByteVar>(), length)
}

public actual fun u_austrcpy(dst: PCSTR, src: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_austrcpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_austrncpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), n)?.toLong() ?: 0L

public actual fun u_catclose(catd: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_catclose(catd.toCPointer<ByteVar>())
}

public actual fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_catgets(catd.toCPointer<ByteVar>(), set_num, msg_num, s.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_catopen(name.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_charAge(c: Int, versionarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charAge(c, versionarray.toCPointer<ByteVar>())
}

public actual fun u_charDigitValue(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charDigitValue(c)

public actual fun u_charDirection(c: Int): UCharDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charDirection(c)

public actual fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charFromName(namechoice, name.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun u_charMirror(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charMirror(c)

public actual fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charName(code, namechoice, buffer.toCPointer<ByteVar>(), bufferlength, perrorcode.toCPointer<ByteVar>())

public actual fun u_charType(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charType(c)

public actual fun u_charsToUChars(cs: PCSTR, us: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_charsToUChars(cs.toCPointer<ByteVar>(), us.toCPointer<ByteVar>(), length)
}

public actual fun u_cleanup() {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_cleanup()
}

public actual fun u_countChar32(s: Long, length: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_countChar32(s.toCPointer<ByteVar>(), length)

public actual fun u_digit(ch: Int, radix: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_digit(ch, radix)

public actual fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_enumCharNames(start, limit, fn.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), namechoice, perrorcode.toCPointer<ByteVar>())
}

public actual fun u_enumCharTypes(enumrange: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_enumCharTypes(enumrange.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun u_errorName(code: UErrorCode): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_errorName(code)?.toLong() ?: 0L

public actual fun u_foldCase(c: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_foldCase(c, options)

public actual fun u_forDigit(digit: Int, radix: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_forDigit(digit, radix)

public actual fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long): Int =
    0

public actual fun u_getBidiPairedBracket(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getBidiPairedBracket(c)

public actual fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getBinaryPropertySet(property, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_getCombiningClass(c: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getCombiningClass(c)

public actual fun u_getDataVersion(dataversionfillin: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getDataVersion(dataversionfillin.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getFC_NFKC_Closure(c, dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getIntPropertyMap(property, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_getIntPropertyMaxValue(which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getIntPropertyMaxValue(which)

public actual fun u_getIntPropertyMinValue(which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getIntPropertyMinValue(which)

public actual fun u_getIntPropertyValue(c: Int, which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getIntPropertyValue(c, which)

public actual fun u_getNumericValue(c: Int): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getNumericValue(c)

public actual fun u_getPropertyEnum(alias: PCSTR): UProperty =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getPropertyEnum(alias.toCPointer<ByteVar>())

public actual fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getPropertyName(property, namechoice)?.toLong() ?: 0L

public actual fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getPropertyValueEnum(property, alias.toCPointer<ByteVar>())

public actual fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getPropertyValueName(property, value, namechoice)?.toLong() ?: 0L

public actual fun u_getUnicodeVersion(versionarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getUnicodeVersion(versionarray.toCPointer<ByteVar>())
}

public actual fun u_getVersion(versionarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_getVersion(versionarray.toCPointer<ByteVar>())
}

public actual fun u_hasBinaryProperty(c: Int, which: UProperty): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_hasBinaryProperty(c, which)

public actual fun u_init(status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_init(status.toCPointer<ByteVar>())
}

public actual fun u_isIDIgnorable(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isIDIgnorable(c)

public actual fun u_isIDPart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isIDPart(c)

public actual fun u_isIDStart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isIDStart(c)

public actual fun u_isISOControl(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isISOControl(c)

public actual fun u_isJavaIDPart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isJavaIDPart(c)

public actual fun u_isJavaIDStart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isJavaIDStart(c)

public actual fun u_isJavaSpaceChar(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isJavaSpaceChar(c)

public actual fun u_isMirrored(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isMirrored(c)

public actual fun u_isUAlphabetic(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isUAlphabetic(c)

public actual fun u_isULowercase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isULowercase(c)

public actual fun u_isUUppercase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isUUppercase(c)

public actual fun u_isUWhiteSpace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isUWhiteSpace(c)

public actual fun u_isWhitespace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isWhitespace(c)

public actual fun u_isalnum(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isalnum(c)

public actual fun u_isalpha(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isalpha(c)

public actual fun u_isbase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isbase(c)

public actual fun u_isblank(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isblank(c)

public actual fun u_iscntrl(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_iscntrl(c)

public actual fun u_isdefined(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isdefined(c)

public actual fun u_isdigit(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isdigit(c)

public actual fun u_isgraph(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isgraph(c)

public actual fun u_islower(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_islower(c)

public actual fun u_isprint(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isprint(c)

public actual fun u_ispunct(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_ispunct(c)

public actual fun u_isspace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isspace(c)

public actual fun u_istitle(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_istitle(c)

public actual fun u_isupper(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isupper(c)

public actual fun u_isxdigit(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_isxdigit(c)

public actual fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memcasecmp(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>(), length, options)

public actual fun u_memchr(s: Long, c: UShort, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memchr(s.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L

public actual fun u_memchr32(s: Long, c: Int, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memchr32(s.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L

public actual fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memcmp(buf1.toCPointer<ByteVar>(), buf2.toCPointer<ByteVar>(), count)

public actual fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memcmpCodePointOrder(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>(), count)

public actual fun u_memcpy(dest: Long, src: Long, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memcpy(dest.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), count)?.toLong() ?: 0L

public actual fun u_memmove(dest: Long, src: Long, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memmove(dest.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), count)?.toLong() ?: 0L

public actual fun u_memrchr(s: Long, c: UShort, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memrchr(s.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L

public actual fun u_memrchr32(s: Long, c: Int, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memrchr32(s.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L

public actual fun u_memset(dest: Long, c: UShort, count: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_memset(dest.toCPointer<ByteVar>(), c, count)?.toLong() ?: 0L

public actual fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long) {
}

public actual fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long) {
}

public actual fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_setMemoryFunctions(context.toCPointer<ByteVar>(), a.toCPointer<ByteVar>(), r.toCPointer<ByteVar>(), f.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_shapeArabic(source.toCPointer<ByteVar>(), sourcelength, dest.toCPointer<ByteVar>(), destsize, options, perrorcode.toCPointer<ByteVar>())

public actual fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strCaseCompare(s1.toCPointer<ByteVar>(), length1, s2.toCPointer<ByteVar>(), length2, options, perrorcode.toCPointer<ByteVar>())

public actual fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strCompare(s1.toCPointer<ByteVar>(), length1, s2.toCPointer<ByteVar>(), length2, codepointorder)

public actual fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strCompareIter(iter1.toCPointer<ByteVar>(), iter2.toCPointer<ByteVar>(), codepointorder)

public actual fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFindFirst(s.toCPointer<ByteVar>(), length, substring.toCPointer<ByteVar>(), sublength)?.toLong() ?: 0L

public actual fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFindLast(s.toCPointer<ByteVar>(), length, substring.toCPointer<ByteVar>(), sublength)?.toLong() ?: 0L

public actual fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFoldCase(dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, options, perrorcode.toCPointer<ByteVar>())

public actual fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromJavaModifiedUTF8WithSub(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromUTF32(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromUTF32WithSub(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromUTF8(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromUTF8Lenient(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromUTF8WithSub(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strFromWCS(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strHasMoreChar32Than(s.toCPointer<ByteVar>(), length, number)

public actual fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToJavaModifiedUTF8(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToLower(dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, locale.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToTitle(dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, titleiter.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToUTF32(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToUTF32WithSub(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToUTF8(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToUTF8WithSub(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToUpper(dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, locale.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strToWCS(dest.toCPointer<ByteVar>(), destcapacity, pdestlength.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcasecmp(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>(), options)

public actual fun u_strcat(dst: Long, src: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcat(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strchr(s: Long, c: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strchr(s.toCPointer<ByteVar>(), c)?.toLong() ?: 0L

public actual fun u_strchr32(s: Long, c: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strchr32(s.toCPointer<ByteVar>(), c)?.toLong() ?: 0L

public actual fun u_strcmp(s1: Long, s2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcmp(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>())

public actual fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcmpCodePointOrder(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>())

public actual fun u_strcpy(dst: Long, src: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strcspn(string: Long, matchset: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strcspn(string.toCPointer<ByteVar>(), matchset.toCPointer<ByteVar>())

public actual fun u_strlen(s: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strlen(s.toCPointer<ByteVar>())

public actual fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strncasecmp(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>(), n, options)

public actual fun u_strncat(dst: Long, src: Long, n: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strncat(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), n)?.toLong() ?: 0L

public actual fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strncmp(ucs1.toCPointer<ByteVar>(), ucs2.toCPointer<ByteVar>(), n)

public actual fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strncmpCodePointOrder(s1.toCPointer<ByteVar>(), s2.toCPointer<ByteVar>(), n)

public actual fun u_strncpy(dst: Long, src: Long, n: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strncpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), n)?.toLong() ?: 0L

public actual fun u_strpbrk(string: Long, matchset: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strpbrk(string.toCPointer<ByteVar>(), matchset.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strrchr(s: Long, c: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strrchr(s.toCPointer<ByteVar>(), c)?.toLong() ?: 0L

public actual fun u_strrchr32(s: Long, c: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strrchr32(s.toCPointer<ByteVar>(), c)?.toLong() ?: 0L

public actual fun u_strrstr(s: Long, substring: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strrstr(s.toCPointer<ByteVar>(), substring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strspn(string: Long, matchset: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strspn(string.toCPointer<ByteVar>(), matchset.toCPointer<ByteVar>())

public actual fun u_strstr(s: Long, substring: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strstr(s.toCPointer<ByteVar>(), substring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_strtok_r(src.toCPointer<ByteVar>(), delim.toCPointer<ByteVar>(), savestate.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_tolower(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_tolower(c)

public actual fun u_totitle(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_totitle(c)

public actual fun u_toupper(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_toupper(c)

public actual fun u_uastrcpy(dst: Long, src: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_uastrcpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_uastrncpy(dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), n)?.toLong() ?: 0L

public actual fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_unescape(src.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity)

public actual fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_unescapeAt(charat.toLong().toCPointer<ByteVar>(), offset.toCPointer<ByteVar>(), length, context.toCPointer<ByteVar>())

public actual fun u_versionFromString(versionarray: Long, versionstring: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_versionFromString(versionarray.toCPointer<ByteVar>(), versionstring.toCPointer<ByteVar>())
}

public actual fun u_versionFromUString(versionarray: Long, versionstring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_versionFromUString(versionarray.toCPointer<ByteVar>(), versionstring.toCPointer<ByteVar>())
}

public actual fun u_versionToString(versionarray: Long, versionstring: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_versionToString(versionarray.toCPointer<ByteVar>(), versionstring.toCPointer<ByteVar>())
}

public actual fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_vformatMessage(locale.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, result.toCPointer<ByteVar>(), resultlength, ap.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_vformatMessageWithError(locale.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, result.toCPointer<ByteVar>(), resultlength, parseerror.toCPointer<ByteVar>(), ap.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_vparseMessage(locale.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, source.toCPointer<ByteVar>(), sourcelength, ap.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_u_vparseMessageWithError(locale.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, source.toCPointer<ByteVar>(), sourcelength, ap.toCPointer<ByteVar>(), parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ubidi_close(pbidi: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_close(pbidi.toCPointer<ByteVar>())
}

public actual fun ubidi_countParagraphs(pbidi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_countParagraphs(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_countRuns(pbidi.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getBaseDirection(text.toCPointer<ByteVar>(), length)

public actual fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getClassCallback(pbidi.toCPointer<ByteVar>(), fn.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getCustomizedClass(pbidi.toCPointer<ByteVar>(), c)

public actual fun ubidi_getDirection(pbidi: Long): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getDirection(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getLength(pbidi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLength(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLevelAt(pbidi.toCPointer<ByteVar>(), charindex)

public actual fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLevels(pbidi.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLogicalIndex(pbidi.toCPointer<ByteVar>(), visualindex, perrorcode.toCPointer<ByteVar>())

public actual fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLogicalMap(pbidi.toCPointer<ByteVar>(), indexmap.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getLogicalRun(pbidi.toCPointer<ByteVar>(), logicalposition, plogicallimit.toCPointer<ByteVar>(), plevel.toCPointer<ByteVar>())
}

public actual fun ubidi_getParaLevel(pbidi: Long): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getParaLevel(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getParagraph(pbidi.toCPointer<ByteVar>(), charindex, pparastart.toCPointer<ByteVar>(), pparalimit.toCPointer<ByteVar>(), pparalevel.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getParagraphByIndex(pbidi.toCPointer<ByteVar>(), paraindex, pparastart.toCPointer<ByteVar>(), pparalimit.toCPointer<ByteVar>(), pparalevel.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_getProcessedLength(pbidi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getProcessedLength(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getReorderingMode(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getReorderingOptions(pbidi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getReorderingOptions(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getResultLength(pbidi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getResultLength(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_getText(pbidi: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getText(pbidi.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getVisualIndex(pbidi.toCPointer<ByteVar>(), logicalindex, perrorcode.toCPointer<ByteVar>())

public actual fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getVisualMap(pbidi.toCPointer<ByteVar>(), indexmap.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_getVisualRun(pbidi.toCPointer<ByteVar>(), runindex, plogicalstart.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>())

public actual fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_invertMap(srcmap.toCPointer<ByteVar>(), destmap.toCPointer<ByteVar>(), length)
}

public actual fun ubidi_isInverse(pbidi: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_isInverse(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_isOrderParagraphsLTR(pbidi.toCPointer<ByteVar>())

public actual fun ubidi_open(): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_open()?.toLong() ?: 0L

public actual fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_openSized(maxlength, maxruncount, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_orderParagraphsLTR(pbidi.toCPointer<ByteVar>(), orderparagraphsltr)
}

public actual fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_reorderLogical(levels.toCPointer<ByteVar>(), length, indexmap.toCPointer<ByteVar>())
}

public actual fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_reorderVisual(levels.toCPointer<ByteVar>(), length, indexmap.toCPointer<ByteVar>())
}

public actual fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setClassCallback(pbidi.toCPointer<ByteVar>(), newfn.toLong().toCPointer<ByteVar>(), newcontext.toCPointer<ByteVar>(), oldfn.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setContext(pbidi.toCPointer<ByteVar>(), prologue.toCPointer<ByteVar>(), prolength, epilogue.toCPointer<ByteVar>(), epilength, perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_setInverse(pbidi: Long, isinverse: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setInverse(pbidi.toCPointer<ByteVar>(), isinverse)
}

public actual fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setLine(pparabidi.toCPointer<ByteVar>(), start, limit, plinebidi.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setPara(pbidi.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), length, paralevel, embeddinglevels.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setReorderingMode(pbidi.toCPointer<ByteVar>(), reorderingmode)
}

public actual fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_setReorderingOptions(pbidi.toCPointer<ByteVar>(), reorderingoptions)
}

public actual fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_writeReordered(pbidi.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destsize, options, perrorcode.toCPointer<ByteVar>())

public actual fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidi_writeReverse(src.toCPointer<ByteVar>(), srclength, dest.toCPointer<ByteVar>(), destsize, options, perrorcode.toCPointer<ByteVar>())

public actual fun ubiditransform_close(pbiditransform: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransform_close(pbiditransform.toCPointer<ByteVar>())
}

public actual fun ubiditransform_open(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransform_open(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransform_transform(pbiditransform.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, dest.toCPointer<ByteVar>(), destsize, inparalevel, inorder, outparalevel, outorder, domirroring, shapingoptions, perrorcode.toCPointer<ByteVar>())

public actual fun ublock_getCode(c: Int): UBlockCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ublock_getCode(c)

public actual fun ubrk_close(bi: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_close(bi.toCPointer<ByteVar>())
}

public actual fun ubrk_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_countAvailable()

public actual fun ubrk_current(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_current(bi.toCPointer<ByteVar>())

public actual fun ubrk_first(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_first(bi.toCPointer<ByteVar>())

public actual fun ubrk_following(bi: Long, offset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_following(bi.toCPointer<ByteVar>(), offset)

public actual fun ubrk_getAvailable(index: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_getAvailable(index)?.toLong() ?: 0L

public actual fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_getBinaryRules(bi.toCPointer<ByteVar>(), binaryrules.toCPointer<ByteVar>(), rulescapacity, status.toCPointer<ByteVar>())

public actual fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_getLocaleByType(bi.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubrk_getRuleStatus(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_getRuleStatus(bi.toCPointer<ByteVar>())

public actual fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_getRuleStatusVec(bi.toCPointer<ByteVar>(), fillinvec.toCPointer<ByteVar>(), capacity, status.toCPointer<ByteVar>())

public actual fun ubrk_isBoundary(bi: Long, offset: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_isBoundary(bi.toCPointer<ByteVar>(), offset)

public actual fun ubrk_last(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_last(bi.toCPointer<ByteVar>())

public actual fun ubrk_next(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_next(bi.toCPointer<ByteVar>())

public actual fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_open(type, locale.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_openBinaryRules(binaryrules.toCPointer<ByteVar>(), ruleslength, text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_openRules(rules.toCPointer<ByteVar>(), ruleslength, text.toCPointer<ByteVar>(), textlength, parseerr.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubrk_preceding(bi: Long, offset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_preceding(bi.toCPointer<ByteVar>(), offset)

public actual fun ubrk_previous(bi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_previous(bi.toCPointer<ByteVar>())

public actual fun ubrk_refreshUText(bi: Long, text: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_refreshUText(bi.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_safeClone(bi.toCPointer<ByteVar>(), stackbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_setText(bi.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())
}

public actual fun ubrk_setUText(bi: Long, text: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrk_setUText(bi.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_add(cal.toCPointer<ByteVar>(), field, amount, status.toCPointer<ByteVar>())
}

public actual fun ucal_clear(calendar: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_clear(calendar.toCPointer<ByteVar>())
}

public actual fun ucal_clearField(cal: Long, field: UCalendarDateFields) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_clearField(cal.toCPointer<ByteVar>(), field)
}

public actual fun ucal_clone(cal: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_clone(cal.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_close(cal: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_close(cal.toCPointer<ByteVar>())
}

public actual fun ucal_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_countAvailable()

public actual fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_equivalentTo(cal1.toCPointer<ByteVar>(), cal2.toCPointer<ByteVar>())

public actual fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_get(cal.toCPointer<ByteVar>(), field, status.toCPointer<ByteVar>())

public actual fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getAttribute(cal.toCPointer<ByteVar>(), attr)

public actual fun ucal_getAvailable(localeindex: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getAvailable(localeindex)?.toLong() ?: 0L

public actual fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getCanonicalTimeZoneID(id.toCPointer<ByteVar>(), len, result.toCPointer<ByteVar>(), resultcapacity, issystemid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getDSTSavings(zoneid.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getDayOfWeekType(cal.toCPointer<ByteVar>(), dayofweek, status.toCPointer<ByteVar>())

public actual fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getDefaultTimeZone(result.toCPointer<ByteVar>(), resultcapacity, ec.toCPointer<ByteVar>())

public actual fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getFieldDifference(cal.toCPointer<ByteVar>(), target, field, status.toCPointer<ByteVar>())

public actual fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getGregorianChange(cal.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getHostTimeZone(result.toCPointer<ByteVar>(), resultcapacity, ec.toCPointer<ByteVar>())

public actual fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getKeywordValuesForLocale(key.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), commonlyused, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getLimit(cal.toCPointer<ByteVar>(), field, type, status.toCPointer<ByteVar>())

public actual fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getLocaleByType(cal.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_getMillis(cal: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getMillis(cal.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucal_getNow(): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getNow()

public actual fun ucal_getTZDataVersion(status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getTZDataVersion(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getTimeZoneDisplayName(cal.toCPointer<ByteVar>(), type, locale.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getTimeZoneID(cal.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getTimeZoneIDForWindowsID(winid.toCPointer<ByteVar>(), len, region.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), idcapacity, status.toCPointer<ByteVar>())

public actual fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getTimeZoneTransitionDate(cal.toCPointer<ByteVar>(), type, transition.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucal_getType(cal: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getType(cal.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getWeekendTransition(cal.toCPointer<ByteVar>(), dayofweek, status.toCPointer<ByteVar>())

public actual fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_getWindowsTimeZoneID(id.toCPointer<ByteVar>(), len, winid.toCPointer<ByteVar>(), winidcapacity, status.toCPointer<ByteVar>())

public actual fun ucal_inDaylightTime(cal: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_inDaylightTime(cal.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_isSet(cal.toCPointer<ByteVar>(), field)

public actual fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_isWeekend(cal.toCPointer<ByteVar>(), date, status.toCPointer<ByteVar>())

public actual fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_open(zoneid.toCPointer<ByteVar>(), len, locale.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_openCountryTimeZones(country.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_openTimeZoneIDEnumeration(zonetype, region.toCPointer<ByteVar>(), rawoffset.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_openTimeZones(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_openTimeZones(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_roll(cal.toCPointer<ByteVar>(), field, amount, status.toCPointer<ByteVar>())
}

public actual fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_set(cal.toCPointer<ByteVar>(), field, value)
}

public actual fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setAttribute(cal.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setDate(cal.toCPointer<ByteVar>(), year, month, date, status.toCPointer<ByteVar>())
}

public actual fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setDateTime(cal.toCPointer<ByteVar>(), year, month, date, hour, minute, second, status.toCPointer<ByteVar>())
}

public actual fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setDefaultTimeZone(zoneid.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setGregorianChange(cal.toCPointer<ByteVar>(), date, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucal_setMillis(cal: Long, datetime: Double, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setMillis(cal.toCPointer<ByteVar>(), datetime, status.toCPointer<ByteVar>())
}

public actual fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucal_setTimeZone(cal.toCPointer<ByteVar>(), zoneid.toCPointer<ByteVar>(), len, status.toCPointer<ByteVar>())
}

public actual fun ucasemap_close(csm: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_close(csm.toCPointer<ByteVar>())
}

public actual fun ucasemap_getBreakIterator(csm: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_getBreakIterator(csm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucasemap_getLocale(csm: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_getLocale(csm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucasemap_getOptions(csm: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_getOptions(csm.toCPointer<ByteVar>())

public actual fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_open(locale.toCPointer<ByteVar>(), options, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_setBreakIterator(csm.toCPointer<ByteVar>(), itertoadopt.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_setLocale(csm.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_setOptions(csm.toCPointer<ByteVar>(), options, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_toTitle(csm.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_utf8FoldCase(csm.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_utf8ToLower(csm.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_utf8ToTitle(csm.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemap_utf8ToUpper(csm.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucfpos_close(ucfpos: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_close(ucfpos.toCPointer<ByteVar>())
}

public actual fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_constrainCategory(ucfpos.toCPointer<ByteVar>(), category, ec.toCPointer<ByteVar>())
}

public actual fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_constrainField(ucfpos.toCPointer<ByteVar>(), category, field, ec.toCPointer<ByteVar>())
}

public actual fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_getCategory(ucfpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucfpos_getField(ucfpos: Long, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_getField(ucfpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_getIndexes(ucfpos.toCPointer<ByteVar>(), pstart.toCPointer<ByteVar>(), plimit.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_getInt64IterationContext(ucfpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_matchesField(ucfpos.toCPointer<ByteVar>(), category, field, ec.toCPointer<ByteVar>())

public actual fun ucfpos_open(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_open(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucfpos_reset(ucfpos: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_reset(ucfpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_setInt64IterationContext(ucfpos.toCPointer<ByteVar>(), context, ec.toCPointer<ByteVar>())
}

public actual fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfpos_setState(ucfpos.toCPointer<ByteVar>(), category, field, start, limit, ec.toCPointer<ByteVar>())
}

public actual fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_cbFromUWriteBytes(args.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), length, offsetindex, err.toCPointer<ByteVar>())
}

public actual fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_cbFromUWriteSub(args.toCPointer<ByteVar>(), offsetindex, err.toCPointer<ByteVar>())
}

public actual fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_cbFromUWriteUChars(args.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelimit.toCPointer<ByteVar>(), offsetindex, err.toCPointer<ByteVar>())
}

public actual fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_cbToUWriteSub(args.toCPointer<ByteVar>(), offsetindex, err.toCPointer<ByteVar>())
}

public actual fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_cbToUWriteUChars(args.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), length, offsetindex, err.toCPointer<ByteVar>())
}

public actual fun ucnv_close(converter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_close(converter.toCPointer<ByteVar>())
}

public actual fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_compareNames(name1.toCPointer<ByteVar>(), name2.toCPointer<ByteVar>())

public actual fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_convert(toconvertername.toCPointer<ByteVar>(), fromconvertername.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), targetcapacity, source.toCPointer<ByteVar>(), sourcelength, perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_convertEx(targetcnv.toCPointer<ByteVar>(), sourcecnv.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), targetlimit.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelimit.toCPointer<ByteVar>(), pivotstart.toCPointer<ByteVar>(), pivotsource.toCPointer<ByteVar>(), pivottarget.toCPointer<ByteVar>(), pivotlimit.toCPointer<ByteVar>(), reset, flush, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_countAliases(alias.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_countAvailable()

public actual fun ucnv_countStandards(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_countStandards()

public actual fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_detectUnicodeSignature(source.toCPointer<ByteVar>(), sourcelength, signaturelength.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_fixFileSeparator(cnv.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelen)
}

public actual fun ucnv_flushCache(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_flushCache()

public actual fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_fromAlgorithmic(cnv.toCPointer<ByteVar>(), algorithmictype, target.toCPointer<ByteVar>(), targetcapacity, source.toCPointer<ByteVar>(), sourcelength, perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_fromUChars(cnv.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_fromUCountPending(cnv: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_fromUCountPending(cnv.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_fromUnicode(converter.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), targetlimit.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelimit.toCPointer<ByteVar>(), offsets.toCPointer<ByteVar>(), flush, err.toCPointer<ByteVar>())
}

public actual fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getAlias(alias.toCPointer<ByteVar>(), n, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getAliases(alias.toCPointer<ByteVar>(), aliases.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())
}

public actual fun ucnv_getAvailableName(n: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getAvailableName(n)?.toLong() ?: 0L

public actual fun ucnv_getCCSID(converter: Long, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getCCSID(converter.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())

public actual fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getCanonicalName(alias.toCPointer<ByteVar>(), standard.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_getDefaultName(): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getDefaultName()?.toLong() ?: 0L

public actual fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getDisplayName(converter.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), displayname.toCPointer<ByteVar>(), displaynamecapacity, err.toCPointer<ByteVar>())

public actual fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getFromUCallBack(converter.toCPointer<ByteVar>(), action.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getInvalidChars(converter.toCPointer<ByteVar>(), errbytes.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getInvalidUChars(converter.toCPointer<ByteVar>(), erruchars.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_getMaxCharSize(converter: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getMaxCharSize(converter.toCPointer<ByteVar>())

public actual fun ucnv_getMinCharSize(converter: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getMinCharSize(converter.toCPointer<ByteVar>())

public actual fun ucnv_getName(converter: Long, err: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getName(converter.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getNextUChar(converter.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelimit.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())

public actual fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getPlatform(converter.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())

public actual fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getStandard(n, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getStandardName(name.toCPointer<ByteVar>(), standard.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_getStarters(converter: Long, starters: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getStarters(converter.toCPointer<ByteVar>(), starters.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getSubstChars(converter.toCPointer<ByteVar>(), subchars.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getToUCallBack(converter.toCPointer<ByteVar>(), action.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun ucnv_getType(converter: Long): UConverterType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getType(converter.toCPointer<ByteVar>())

public actual fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_getUnicodeSet(cnv.toCPointer<ByteVar>(), setfillin.toCPointer<ByteVar>(), whichset, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucnv_isAmbiguous(cnv: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_isAmbiguous(cnv.toCPointer<ByteVar>())

public actual fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_isFixedWidth(cnv.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucnv_open(convertername: PCSTR, err: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_open(convertername.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_openAllNames(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_openAllNames(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_openCCSID(codepage, platform, err.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_openPackage(packagename.toCPointer<ByteVar>(), convertername.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_openStandardNames(convname.toCPointer<ByteVar>(), standard.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_openU(name: Long, err: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_openU(name.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_reset(converter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_reset(converter.toCPointer<ByteVar>())
}

public actual fun ucnv_resetFromUnicode(converter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_resetFromUnicode(converter.toCPointer<ByteVar>())
}

public actual fun ucnv_resetToUnicode(converter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_resetToUnicode(converter.toCPointer<ByteVar>())
}

public actual fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_safeClone(cnv.toCPointer<ByteVar>(), stackbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnv_setDefaultName(name: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setDefaultName(name.toCPointer<ByteVar>())
}

public actual fun ucnv_setFallback(cnv: Long, usesfallback: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setFallback(cnv.toCPointer<ByteVar>(), usesfallback)
}

public actual fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setFromUCallBack(converter.toCPointer<ByteVar>(), newaction.toLong().toCPointer<ByteVar>(), newcontext.toCPointer<ByteVar>(), oldaction.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setSubstChars(converter.toCPointer<ByteVar>(), subchars.toCPointer<ByteVar>(), len, err.toCPointer<ByteVar>())
}

public actual fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setSubstString(cnv.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, err.toCPointer<ByteVar>())
}

public actual fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_setToUCallBack(converter.toCPointer<ByteVar>(), newaction.toLong().toCPointer<ByteVar>(), newcontext.toCPointer<ByteVar>(), oldaction.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())
}

public actual fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_toAlgorithmic(algorithmictype, cnv.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), targetcapacity, source.toCPointer<ByteVar>(), sourcelength, perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_toUChars(cnv.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, src.toCPointer<ByteVar>(), srclength, perrorcode.toCPointer<ByteVar>())

public actual fun ucnv_toUCountPending(cnv: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_toUCountPending(cnv.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_toUnicode(converter.toCPointer<ByteVar>(), target.toCPointer<ByteVar>(), targetlimit.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelimit.toCPointer<ByteVar>(), offsets.toCPointer<ByteVar>(), flush, err.toCPointer<ByteVar>())
}

public actual fun ucnv_usesFallback(cnv: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnv_usesFallback(cnv.toCPointer<ByteVar>())

public actual fun ucnvsel_close(sel: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_close(sel.toCPointer<ByteVar>())
}

public actual fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_open(converterlist.toCPointer<ByteVar>(), converterlistsize, excludedcodepoints.toCPointer<ByteVar>(), whichset, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_openFromSerialized(buffer.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_selectForString(sel.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_selectForUTF8(sel.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvsel_serialize(sel.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffercapacity, status.toCPointer<ByteVar>())

public actual fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_cloneBinary(coll.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), capacity, status.toCPointer<ByteVar>())

public actual fun ucol_close(coll: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_close(coll.toCPointer<ByteVar>())
}

public actual fun ucol_closeElements(elems: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_closeElements(elems.toCPointer<ByteVar>())
}

public actual fun ucol_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_countAvailable()

public actual fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_equal(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, target.toCPointer<ByteVar>(), targetlength)

public actual fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getAttribute(coll.toCPointer<ByteVar>(), attr, status.toCPointer<ByteVar>())

public actual fun ucol_getAvailable(localeindex: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getAvailable(localeindex)?.toLong() ?: 0L

public actual fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getBound(source.toCPointer<ByteVar>(), sourcelength, boundtype, nooflevels, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getContractionsAndExpansions(coll.toCPointer<ByteVar>(), contractions.toCPointer<ByteVar>(), expansions.toCPointer<ByteVar>(), addprefixes, status.toCPointer<ByteVar>())
}

public actual fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getDisplayName(objloc.toCPointer<ByteVar>(), disploc.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getEquivalentReorderCodes(reordercode, dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getFunctionalEquivalent(result.toCPointer<ByteVar>(), resultcapacity, keyword.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), isavailable.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getKeywordValues(keyword.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getKeywordValuesForLocale(key.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), commonlyused, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getKeywords(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getKeywords(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getLocaleByType(coll.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getMaxExpansion(elems: Long, order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getMaxExpansion(elems.toCPointer<ByteVar>(), order)

public actual fun ucol_getMaxVariable(coll: Long): UColReorderCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getMaxVariable(coll.toCPointer<ByteVar>())

public actual fun ucol_getOffset(elems: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getOffset(elems.toCPointer<ByteVar>())

public actual fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getReorderCodes(coll.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun ucol_getRules(coll: Long, length: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getRules(coll.toCPointer<ByteVar>(), length.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getRulesEx(coll.toCPointer<ByteVar>(), delta, buffer.toCPointer<ByteVar>(), bufferlen)

public actual fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getSortKey(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, result.toCPointer<ByteVar>(), resultlength)

public actual fun ucol_getStrength(coll: Long): UColAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getStrength(coll.toCPointer<ByteVar>())

public actual fun ucol_getTailoredSet(coll: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getTailoredSet(coll.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_getUCAVersion(coll: Long, info: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getUCAVersion(coll.toCPointer<ByteVar>(), info.toCPointer<ByteVar>())
}

public actual fun ucol_getVariableTop(coll: Long, status: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getVariableTop(coll.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucol_getVersion(coll: Long, info: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_getVersion(coll.toCPointer<ByteVar>(), info.toCPointer<ByteVar>())
}

public actual fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_greater(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, target.toCPointer<ByteVar>(), targetlength)

public actual fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_greaterOrEqual(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, target.toCPointer<ByteVar>(), targetlength)

public actual fun ucol_keyHashCode(key: Long, length: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_keyHashCode(key.toCPointer<ByteVar>(), length)

public actual fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_mergeSortkeys(src1.toCPointer<ByteVar>(), src1length, src2.toCPointer<ByteVar>(), src2length, dest.toCPointer<ByteVar>(), destcapacity)

public actual fun ucol_next(elems: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_next(elems.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_nextSortKeyPart(coll.toCPointer<ByteVar>(), iter.toCPointer<ByteVar>(), state.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), count, status.toCPointer<ByteVar>())

public actual fun ucol_open(loc: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_open(loc.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_openAvailableLocales(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_openAvailableLocales(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_openBinary(bin.toCPointer<ByteVar>(), length, base.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_openElements(coll.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_openRules(rules.toCPointer<ByteVar>(), ruleslength, normalizationmode, strength, parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_previous(elems: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_previous(elems.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucol_primaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_primaryOrder(order)

public actual fun ucol_reset(elems: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_reset(elems.toCPointer<ByteVar>())
}

public actual fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_safeClone(coll.toCPointer<ByteVar>(), stackbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucol_secondaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_secondaryOrder(order)

public actual fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setAttribute(coll.toCPointer<ByteVar>(), attr, value, status.toCPointer<ByteVar>())
}

public actual fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setMaxVariable(coll.toCPointer<ByteVar>(), group, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucol_setOffset(elems: Long, offset: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setOffset(elems.toCPointer<ByteVar>(), offset, status.toCPointer<ByteVar>())
}

public actual fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setReorderCodes(coll.toCPointer<ByteVar>(), reordercodes.toCPointer<ByteVar>(), reordercodeslength, perrorcode.toCPointer<ByteVar>())
}

public actual fun ucol_setStrength(coll: Long, strength: UColAttributeValue) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setStrength(coll.toCPointer<ByteVar>(), strength)
}

public actual fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_setText(elems.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())
}

public actual fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_strcoll(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, target.toCPointer<ByteVar>(), targetlength)

public actual fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_strcollIter(coll.toCPointer<ByteVar>(), siter.toCPointer<ByteVar>(), titer.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_strcollUTF8(coll.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, target.toCPointer<ByteVar>(), targetlength, status.toCPointer<ByteVar>())

public actual fun ucol_tertiaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucol_tertiaryOrder(order)

public actual fun ucpmap_get(map: Long, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucpmap_get(map.toCPointer<ByteVar>(), c)

public actual fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucpmap_getRange(map.toCPointer<ByteVar>(), start, option, surrogatevalue, filter.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun ucptrie_close(trie: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_close(trie.toCPointer<ByteVar>())
}

public actual fun ucptrie_get(trie: Long, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_get(trie.toCPointer<ByteVar>(), c)

public actual fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_getRange(trie.toCPointer<ByteVar>(), start, option, surrogatevalue, filter.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun ucptrie_getType(trie: Long): UCPTrieType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_getType(trie.toCPointer<ByteVar>())

public actual fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_getValueWidth(trie.toCPointer<ByteVar>())

public actual fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_internalSmallIndex(trie.toCPointer<ByteVar>(), c)

public actual fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_internalSmallU8Index(trie.toCPointer<ByteVar>(), lt1, t2, t3)

public actual fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_internalU8PrevIndex(trie.toCPointer<ByteVar>(), c, start.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())

public actual fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_openFromBinary(type, valuewidth, data.toCPointer<ByteVar>(), length, pactuallength.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrie_toBinary(trie.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun ucsdet_close(ucsd: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_close(ucsd.toCPointer<ByteVar>())
}

public actual fun ucsdet_detect(ucsd: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_detect(ucsd.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_detectAll(ucsd.toCPointer<ByteVar>(), matchesfound.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_enableInputFilter(ucsd.toCPointer<ByteVar>(), filter)

public actual fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_getAllDetectableCharsets(ucsd.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_getConfidence(ucsm: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_getConfidence(ucsm.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_getLanguage(ucsm.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_getName(ucsm: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_getName(ucsm.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_getUChars(ucsm.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), cap, status.toCPointer<ByteVar>())

public actual fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_isInputFilterEnabled(ucsd.toCPointer<ByteVar>())

public actual fun ucsdet_open(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_open(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_setDeclaredEncoding(ucsd.toCPointer<ByteVar>(), encoding.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())
}

public actual fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdet_setText(ucsd.toCPointer<ByteVar>(), textin.toCPointer<ByteVar>(), len, status.toCPointer<ByteVar>())
}

public actual fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_countCurrencies(locale.toCPointer<ByteVar>(), date, ec.toCPointer<ByteVar>())

public actual fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_forLocale(locale.toCPointer<ByteVar>(), buff.toCPointer<ByteVar>(), buffcapacity, ec.toCPointer<ByteVar>())

public actual fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_forLocaleAndDate(locale.toCPointer<ByteVar>(), date, index, buff.toCPointer<ByteVar>(), buffcapacity, ec.toCPointer<ByteVar>())

public actual fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigits(currency.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigitsForUsage(currency.toCPointer<ByteVar>(), usage, ec.toCPointer<ByteVar>())

public actual fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getKeywordValuesForLocale(key.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), commonlyused, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getName(currency.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), namestyle, ischoiceformat.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucurr_getNumericCode(currency: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getNumericCode(currency.toCPointer<ByteVar>())

public actual fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getPluralName(currency.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), ischoiceformat.toCPointer<ByteVar>(), pluralcount.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getRoundingIncrement(currency.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_getRoundingIncrementForUsage(currency.toCPointer<ByteVar>(), usage, ec.toCPointer<ByteVar>())

public actual fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_isAvailable(isocode.toCPointer<ByteVar>(), from, to, errorcode.toCPointer<ByteVar>())

public actual fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_openISOCurrencies(currtype, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_register(isocode.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ucurr_unregister(key: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurr_unregister(key.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_adoptNumberFormat(fmt.toCPointer<ByteVar>(), numberformattoadopt.toCPointer<ByteVar>())
}

public actual fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_adoptNumberFormatForFields(fmt.toCPointer<ByteVar>(), fields.toCPointer<ByteVar>(), numberformattoset.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_applyPattern(format.toCPointer<ByteVar>(), localized, pattern.toCPointer<ByteVar>(), patternlength)
}

public actual fun udat_clone(fmt: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_clone(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udat_close(format: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_close(format.toCPointer<ByteVar>())
}

public actual fun udat_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_countAvailable()

public actual fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_countSymbols(fmt.toCPointer<ByteVar>(), type)

public actual fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_format(format.toCPointer<ByteVar>(), datetoformat, result.toCPointer<ByteVar>(), resultlength, position.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_formatCalendar(format.toCPointer<ByteVar>(), calendar.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), capacity, position.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_formatCalendarForFields(format.toCPointer<ByteVar>(), calendar.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), capacity, fpositer.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_formatForFields(format.toCPointer<ByteVar>(), datetoformat, result.toCPointer<ByteVar>(), resultlength, fpositer.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_get2DigitYearStart(fmt: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_get2DigitYearStart(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_getAvailable(localeindex: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getAvailable(localeindex)?.toLong() ?: 0L

public actual fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getBooleanAttribute(fmt.toCPointer<ByteVar>(), attr, status.toCPointer<ByteVar>())

public actual fun udat_getCalendar(fmt: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getCalendar(fmt.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getContext(fmt.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())

public actual fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getLocaleByType(fmt.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udat_getNumberFormat(fmt: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getNumberFormat(fmt.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getNumberFormatForField(fmt.toCPointer<ByteVar>(), field)?.toLong() ?: 0L

public actual fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_getSymbols(fmt.toCPointer<ByteVar>(), type, symbolindex, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun udat_isLenient(fmt: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_isLenient(fmt.toCPointer<ByteVar>())

public actual fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_open(timestyle, datestyle, locale.toCPointer<ByteVar>(), tzid.toCPointer<ByteVar>(), tzidlength, pattern.toCPointer<ByteVar>(), patternlength, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_parse(format.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_parseCalendar(format.toCPointer<ByteVar>(), calendar.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_set2DigitYearStart(fmt.toCPointer<ByteVar>(), d, status.toCPointer<ByteVar>())
}

public actual fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setBooleanAttribute(fmt.toCPointer<ByteVar>(), attr, newvalue, status.toCPointer<ByteVar>())
}

public actual fun udat_setCalendar(fmt: Long, calendartoset: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setCalendar(fmt.toCPointer<ByteVar>(), calendartoset.toCPointer<ByteVar>())
}

public actual fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setContext(fmt.toCPointer<ByteVar>(), value, status.toCPointer<ByteVar>())
}

public actual fun udat_setLenient(fmt: Long, islenient: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setLenient(fmt.toCPointer<ByteVar>(), islenient)
}

public actual fun udat_setNumberFormat(fmt: Long, numberformattoset: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setNumberFormat(fmt.toCPointer<ByteVar>(), numberformattoset.toCPointer<ByteVar>())
}

public actual fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_setSymbols(format.toCPointer<ByteVar>(), type, symbolindex, value.toCPointer<ByteVar>(), valuelength, status.toCPointer<ByteVar>())
}

public actual fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_toCalendarDateField(field)

public actual fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udat_toPattern(fmt.toCPointer<ByteVar>(), localized, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_addPattern(dtpg.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, override, conflictingpattern.toCPointer<ByteVar>(), capacity, plength.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_clone(dtpg: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_clone(dtpg.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_close(dtpg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_close(dtpg.toCPointer<ByteVar>())
}

public actual fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getAppendItemFormat(dtpg.toCPointer<ByteVar>(), field, plength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getAppendItemName(dtpg.toCPointer<ByteVar>(), field, plength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getBaseSkeleton(unuseddtpg.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), length, baseskeleton.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getBestPattern(dtpg.toCPointer<ByteVar>(), skeleton.toCPointer<ByteVar>(), length, bestpattern.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getBestPatternWithOptions(dtpg.toCPointer<ByteVar>(), skeleton.toCPointer<ByteVar>(), length, options, bestpattern.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getDateTimeFormat(dtpg.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_getDecimal(dtpg: Long, plength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getDecimal(dtpg.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getFieldDisplayName(dtpg.toCPointer<ByteVar>(), field, width, fieldname.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getPatternForSkeleton(dtpg.toCPointer<ByteVar>(), skeleton.toCPointer<ByteVar>(), skeletonlength, plength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_getSkeleton(unuseddtpg.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), length, skeleton.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_open(locale: PCSTR, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_open(locale.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_openBaseSkeletons(dtpg.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_openEmpty(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_openEmpty(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_openSkeletons(dtpg.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_replaceFieldTypes(dtpg.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, skeleton.toCPointer<ByteVar>(), skeletonlength, dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_replaceFieldTypesWithOptions(dtpg.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, skeleton.toCPointer<ByteVar>(), skeletonlength, options, dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_setAppendItemFormat(dtpg.toCPointer<ByteVar>(), field, value.toCPointer<ByteVar>(), length)
}

public actual fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_setAppendItemName(dtpg.toCPointer<ByteVar>(), field, value.toCPointer<ByteVar>(), length)
}

public actual fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_setDateTimeFormat(dtpg.toCPointer<ByteVar>(), dtformat.toCPointer<ByteVar>(), length)
}

public actual fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpg_setDecimal(dtpg.toCPointer<ByteVar>(), decimal.toCPointer<ByteVar>(), length)
}

public actual fun udtitvfmt_close(formatter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_close(formatter.toCPointer<ByteVar>())
}

public actual fun udtitvfmt_closeResult(uresult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_closeResult(uresult.toCPointer<ByteVar>())
}

public actual fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_format(formatter.toCPointer<ByteVar>(), fromdate, todate, result.toCPointer<ByteVar>(), resultcapacity, position.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_open(locale.toCPointer<ByteVar>(), skeleton.toCPointer<ByteVar>(), skeletonlength, tzid.toCPointer<ByteVar>(), tzidlength, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udtitvfmt_openResult(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_openResult(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmt_resultAsValue(uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uenum_close(en: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_close(en.toCPointer<ByteVar>())
}

public actual fun uenum_count(en: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_count(en.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_next(en.toCPointer<ByteVar>(), resultlength.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_openCharStringsEnumeration(strings.toCPointer<ByteVar>(), count, ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_openUCharStringsEnumeration(strings.toCPointer<ByteVar>(), count, ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uenum_reset(en: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_reset(en.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uenum_unext(en: Long, resultlength: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenum_unext(en.toCPointer<ByteVar>(), resultlength.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufieldpositer_close(fpositer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositer_close(fpositer.toCPointer<ByteVar>())
}

public actual fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositer_next(fpositer.toCPointer<ByteVar>(), beginindex.toCPointer<ByteVar>(), endindex.toCPointer<ByteVar>())

public actual fun ufieldpositer_open(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositer_open(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmt_close(fmt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_close(fmt.toCPointer<ByteVar>())
}

public actual fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getArrayItemByIndex(fmt.toCPointer<ByteVar>(), n, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmt_getArrayLength(fmt: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getArrayLength(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getDate(fmt: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getDate(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getDecNumChars(fmt.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmt_getDouble(fmt: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getDouble(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getInt64(fmt: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getInt64(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getLong(fmt: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getLong(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getObject(fmt: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getObject(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmt_getType(fmt: Long, status: Long): UFormattableType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getType(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_getUChars(fmt.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmt_isNumeric(fmt: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_isNumeric(fmt.toCPointer<ByteVar>())

public actual fun ufmt_open(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmt_open(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtval_getString(ufmtval.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtval_nextPosition(ufmtval.toCPointer<ByteVar>(), ucfpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun ugender_getInstance(locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ugender_getInstance(locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ugender_getListGender(genderinfo.toCPointer<ByteVar>(), genders.toCPointer<ByteVar>(), size, status.toCPointer<ByteVar>())

public actual fun uidna_close(idna: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_close(idna.toCPointer<ByteVar>())
}

public actual fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_labelToASCII(idna.toCPointer<ByteVar>(), label.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_labelToASCII_UTF8(idna.toCPointer<ByteVar>(), label.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_labelToUnicode(idna.toCPointer<ByteVar>(), label.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_labelToUnicodeUTF8(idna.toCPointer<ByteVar>(), label.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_nameToASCII(idna.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_nameToASCII_UTF8(idna.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_nameToUnicode(idna.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_nameToUnicodeUTF8(idna.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, pinfo.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())

public actual fun uidna_openUTS46(options: UInt, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidna_openUTS46(options, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uiter_current32(iter: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_current32(iter.toCPointer<ByteVar>())

public actual fun uiter_getState(iter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_getState(iter.toCPointer<ByteVar>())

public actual fun uiter_next32(iter: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_next32(iter.toCPointer<ByteVar>())

public actual fun uiter_previous32(iter: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_previous32(iter.toCPointer<ByteVar>())

public actual fun uiter_setState(iter: Long, state: UInt, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_setState(iter.toCPointer<ByteVar>(), state, perrorcode.toCPointer<ByteVar>())
}

public actual fun uiter_setString(iter: Long, s: Long, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_setString(iter.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length)
}

public actual fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_setUTF16BE(iter.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length)
}

public actual fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiter_setUTF8(iter.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length)
}

public actual fun uldn_close(ldn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_close(ldn.toCPointer<ByteVar>())
}

public actual fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_getContext(ldn.toCPointer<ByteVar>(), type, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_getDialectHandling(ldn: Long): UDialectHandling =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_getDialectHandling(ldn.toCPointer<ByteVar>())

public actual fun uldn_getLocale(ldn: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_getLocale(ldn.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_keyDisplayName(ldn.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_keyValueDisplayName(ldn.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_languageDisplayName(ldn.toCPointer<ByteVar>(), lang.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_localeDisplayName(ldn.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_open(locale.toCPointer<ByteVar>(), dialecthandling, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_openForContext(locale.toCPointer<ByteVar>(), contexts.toCPointer<ByteVar>(), length, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_regionDisplayName(ldn.toCPointer<ByteVar>(), region.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_scriptCodeDisplayName(ldn.toCPointer<ByteVar>(), scriptcode, result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_scriptDisplayName(ldn.toCPointer<ByteVar>(), script.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldn_variantDisplayName(ldn.toCPointer<ByteVar>(), variant.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, perrorcode.toCPointer<ByteVar>())

public actual fun ulistfmt_close(listfmt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_close(listfmt.toCPointer<ByteVar>())
}

public actual fun ulistfmt_closeResult(uresult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_closeResult(uresult.toCPointer<ByteVar>())
}

public actual fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_format(listfmt.toCPointer<ByteVar>(), strings.toCPointer<ByteVar>(), stringlengths.toCPointer<ByteVar>(), stringcount, result.toCPointer<ByteVar>(), resultcapacity, status.toCPointer<ByteVar>())

public actual fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_formatStringsToResult(listfmt.toCPointer<ByteVar>(), strings.toCPointer<ByteVar>(), stringlengths.toCPointer<ByteVar>(), stringcount, uresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ulistfmt_open(locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_open(locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_openForType(locale.toCPointer<ByteVar>(), type, width, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulistfmt_openResult(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_openResult(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmt_resultAsValue(uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_acceptLanguage(result.toCPointer<ByteVar>(), resultavailable, outresult.toCPointer<ByteVar>(), acceptlist.toCPointer<ByteVar>(), acceptlistcount, availablelocales.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_acceptLanguageFromHTTP(result.toCPointer<ByteVar>(), resultavailable, outresult.toCPointer<ByteVar>(), httpacceptlanguage.toCPointer<ByteVar>(), availablelocales.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_addLikelySubtags(localeid.toCPointer<ByteVar>(), maximizedlocaleid.toCPointer<ByteVar>(), maximizedlocaleidcapacity, err.toCPointer<ByteVar>())

public actual fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_canonicalize(localeid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), namecapacity, err.toCPointer<ByteVar>())

public actual fun uloc_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_countAvailable()

public actual fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_forLanguageTag(langtag.toCPointer<ByteVar>(), localeid.toCPointer<ByteVar>(), localeidcapacity, parsedlength.toCPointer<ByteVar>(), err.toCPointer<ByteVar>())

public actual fun uloc_getAvailable(n: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getAvailable(n)?.toLong() ?: 0L

public actual fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getBaseName(localeid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), namecapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getCharacterOrientation(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getCountry(localeid.toCPointer<ByteVar>(), country.toCPointer<ByteVar>(), countrycapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getDefault(): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDefault()?.toLong() ?: 0L

public actual fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayCountry(locale.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), country.toCPointer<ByteVar>(), countrycapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayKeyword(keyword.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayKeywordValue(locale.toCPointer<ByteVar>(), keyword.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayLanguage(locale.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), language.toCPointer<ByteVar>(), languagecapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayName(localeid.toCPointer<ByteVar>(), inlocaleid.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), maxresultsize, err.toCPointer<ByteVar>())

public actual fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayScript(locale.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), script.toCPointer<ByteVar>(), scriptcapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getDisplayVariant(locale.toCPointer<ByteVar>(), displaylocale.toCPointer<ByteVar>(), variant.toCPointer<ByteVar>(), variantcapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getISO3Country(localeid: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getISO3Country(localeid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_getISO3Language(localeid: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getISO3Language(localeid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_getISOCountries(): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getISOCountries()?.toLong() ?: 0L

public actual fun uloc_getISOLanguages(): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getISOLanguages()?.toLong() ?: 0L

public actual fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getKeywordValue(localeid.toCPointer<ByteVar>(), keywordname.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffercapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getLCID(localeid: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getLCID(localeid.toCPointer<ByteVar>())

public actual fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getLanguage(localeid.toCPointer<ByteVar>(), language.toCPointer<ByteVar>(), languagecapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getLineOrientation(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getLocaleForLCID(hostid, locale.toCPointer<ByteVar>(), localecapacity, status.toCPointer<ByteVar>())

public actual fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getName(localeid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), namecapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getParent(localeid.toCPointer<ByteVar>(), parent.toCPointer<ByteVar>(), parentcapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getScript(localeid.toCPointer<ByteVar>(), script.toCPointer<ByteVar>(), scriptcapacity, err.toCPointer<ByteVar>())

public actual fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_getVariant(localeid.toCPointer<ByteVar>(), variant.toCPointer<ByteVar>(), variantcapacity, err.toCPointer<ByteVar>())

public actual fun uloc_isRightToLeft(locale: PCSTR): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_isRightToLeft(locale.toCPointer<ByteVar>())

public actual fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_minimizeSubtags(localeid.toCPointer<ByteVar>(), minimizedlocaleid.toCPointer<ByteVar>(), minimizedlocaleidcapacity, err.toCPointer<ByteVar>())

public actual fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_openAvailableByType(type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_openKeywords(localeid: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_openKeywords(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_setDefault(localeid: PCSTR, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_setDefault(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_setKeywordValue(keywordname.toCPointer<ByteVar>(), keywordvalue.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffercapacity, status.toCPointer<ByteVar>())

public actual fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_toLanguageTag(localeid.toCPointer<ByteVar>(), langtag.toCPointer<ByteVar>(), langtagcapacity, strict, err.toCPointer<ByteVar>())

public actual fun uloc_toLegacyKey(keyword: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_toLegacyKey(keyword.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_toLegacyType(keyword.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleKey(keyword.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleType(keyword.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulocdata_close(uld: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_close(uld.toCPointer<ByteVar>())
}

public actual fun ulocdata_getCLDRVersion(versionarray: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getCLDRVersion(versionarray.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getDelimiter(uld.toCPointer<ByteVar>(), type, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getExemplarSet(uld.toCPointer<ByteVar>(), fillin.toCPointer<ByteVar>(), options, extype, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getLocaleDisplayPattern(uld.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patterncapacity, status.toCPointer<ByteVar>())

public actual fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getLocaleSeparator(uld.toCPointer<ByteVar>(), separator.toCPointer<ByteVar>(), separatorcapacity, status.toCPointer<ByteVar>())

public actual fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getMeasurementSystem(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ulocdata_getNoSubstitute(uld: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getNoSubstitute(uld.toCPointer<ByteVar>())

public actual fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_getPaperSize(localeid.toCPointer<ByteVar>(), height.toCPointer<ByteVar>(), width.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ulocdata_open(localeid: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_open(localeid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ulocdata_setNoSubstitute(uld: Long, setting: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdata_setNoSubstitute(uld.toCPointer<ByteVar>(), setting)
}

public actual fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_applyPattern(fmt.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_autoQuoteApostrophe(pattern.toCPointer<ByteVar>(), patternlength, dest.toCPointer<ByteVar>(), destcapacity, ec.toCPointer<ByteVar>())

public actual fun umsg_clone(fmt: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_clone(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umsg_close(format: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_close(format.toCPointer<ByteVar>())
}

public actual fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun umsg_getLocale(fmt: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_getLocale(fmt.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_open(pattern.toCPointer<ByteVar>(), patternlength, locale.toCPointer<ByteVar>(), parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long) {
}

public actual fun umsg_setLocale(fmt: Long, locale: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_setLocale(fmt.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>())
}

public actual fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_toPattern(fmt.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_vformat(fmt.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, ap.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsg_vparse(fmt.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), sourcelength, count.toCPointer<ByteVar>(), ap.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_buildImmutable(trie.toCPointer<ByteVar>(), type, valuewidth, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umutablecptrie_clone(other: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_clone(other.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umutablecptrie_close(trie: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_close(trie.toCPointer<ByteVar>())
}

public actual fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_fromUCPMap(map.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_fromUCPTrie(trie.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umutablecptrie_get(trie: Long, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_get(trie.toCPointer<ByteVar>(), c)

public actual fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_getRange(trie.toCPointer<ByteVar>(), start, option, surrogatevalue, filter.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_open(initialvalue, errorvalue, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_set(trie.toCPointer<ByteVar>(), c, value, perrorcode.toCPointer<ByteVar>())
}

public actual fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrie_setRange(trie.toCPointer<ByteVar>(), start, end, value, perrorcode.toCPointer<ByteVar>())
}

public actual fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_append(norm2.toCPointer<ByteVar>(), first.toCPointer<ByteVar>(), firstlength, firstcapacity, second.toCPointer<ByteVar>(), secondlength, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_close(norm2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_close(norm2.toCPointer<ByteVar>())
}

public actual fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_composePair(norm2.toCPointer<ByteVar>(), a, b)

public actual fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getCombiningClass(norm2.toCPointer<ByteVar>(), c)

public actual fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getDecomposition(norm2.toCPointer<ByteVar>(), c, decomposition.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getInstance(packagename.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), mode, perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getNFCInstance(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getNFCInstance(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getNFDInstance(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getNFDInstance(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getNFKCCasefoldInstance(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getNFKCInstance(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getNFKCInstance(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getNFKDInstance(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getNFKDInstance(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_getRawDecomposition(norm2.toCPointer<ByteVar>(), c, decomposition.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_hasBoundaryAfter(norm2.toCPointer<ByteVar>(), c)

public actual fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_hasBoundaryBefore(norm2.toCPointer<ByteVar>(), c)

public actual fun unorm2_isInert(norm2: Long, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_isInert(norm2.toCPointer<ByteVar>(), c)

public actual fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_isNormalized(norm2.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_normalize(norm2.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_normalizeSecondAndAppend(norm2.toCPointer<ByteVar>(), first.toCPointer<ByteVar>(), firstlength, firstcapacity, second.toCPointer<ByteVar>(), secondlength, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_openFiltered(norm2.toCPointer<ByteVar>(), filterset.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_quickCheck(norm2.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, perrorcode.toCPointer<ByteVar>())

public actual fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2_spanQuickCheckYes(norm2.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, perrorcode.toCPointer<ByteVar>())

public actual fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm_compare(s1.toCPointer<ByteVar>(), length1, s2.toCPointer<ByteVar>(), length2, options, perrorcode.toCPointer<ByteVar>())

public actual fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_applyPattern(format.toCPointer<ByteVar>(), localized, pattern.toCPointer<ByteVar>(), patternlength, parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun unum_clone(fmt: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_clone(fmt.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unum_close(fmt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_close(fmt.toCPointer<ByteVar>())
}

public actual fun unum_countAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_countAvailable()

public actual fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_format(fmt.toCPointer<ByteVar>(), number, result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatDecimal(fmt.toCPointer<ByteVar>(), number.toCPointer<ByteVar>(), length, result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatDouble(fmt.toCPointer<ByteVar>(), number, result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatDoubleCurrency(fmt.toCPointer<ByteVar>(), number, currency.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatDoubleForFields(format.toCPointer<ByteVar>(), number, result.toCPointer<ByteVar>(), resultlength, fpositer.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatInt64(fmt.toCPointer<ByteVar>(), number, result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_formatUFormattable(fmt.toCPointer<ByteVar>(), number.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getAttribute(fmt.toCPointer<ByteVar>(), attr)

public actual fun unum_getAvailable(localeindex: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getAvailable(localeindex)?.toLong() ?: 0L

public actual fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getContext(fmt.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())

public actual fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getDoubleAttribute(fmt.toCPointer<ByteVar>(), attr)

public actual fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getLocaleByType(fmt.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getSymbol(fmt.toCPointer<ByteVar>(), symbol, buffer.toCPointer<ByteVar>(), size, status.toCPointer<ByteVar>())

public actual fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_getTextAttribute(fmt.toCPointer<ByteVar>(), tag, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_open(style, pattern.toCPointer<ByteVar>(), patternlength, locale.toCPointer<ByteVar>(), parseerr.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parse(fmt.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parseDecimal(fmt.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), outbuf.toCPointer<ByteVar>(), outbuflength, status.toCPointer<ByteVar>())

public actual fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parseDouble(fmt.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parseDoubleCurrency(fmt.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), currency.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parseInt64(fmt.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_parseToUFormattable(fmt.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, parsepos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_setAttribute(fmt.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_setContext(fmt.toCPointer<ByteVar>(), value, status.toCPointer<ByteVar>())
}

public actual fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_setDoubleAttribute(fmt.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_setSymbol(fmt.toCPointer<ByteVar>(), symbol, value.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())
}

public actual fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_setTextAttribute(fmt.toCPointer<ByteVar>(), tag, newvalue.toCPointer<ByteVar>(), newvaluelength, status.toCPointer<ByteVar>())
}

public actual fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unum_toPattern(fmt.toCPointer<ByteVar>(), ispatternlocalized, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun unumf_close(uformatter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_close(uformatter.toCPointer<ByteVar>())
}

public actual fun unumf_closeResult(uresult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_closeResult(uresult.toCPointer<ByteVar>())
}

public actual fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_formatDecimal(uformatter.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuelen, uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_formatDouble(uformatter.toCPointer<ByteVar>(), value, uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_formatInt(uformatter.toCPointer<ByteVar>(), value, uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocale(skeleton.toCPointer<ByteVar>(), skeletonlen, locale.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocaleWithError(skeleton.toCPointer<ByteVar>(), skeletonlen, locale.toCPointer<ByteVar>(), perror.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumf_openResult(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_openResult(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumf_resultAsValue(uresult: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_resultAsValue(uresult.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_resultGetAllFieldPositions(uresult.toCPointer<ByteVar>(), ufpositer.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())
}

public actual fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_resultNextFieldPosition(uresult.toCPointer<ByteVar>(), ufpos.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())

public actual fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumf_resultToString(uresult.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffercapacity, ec.toCPointer<ByteVar>())

public actual fun unumsys_close(unumsys: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_close(unumsys.toCPointer<ByteVar>())
}

public actual fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_getDescription(unumsys.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun unumsys_getName(unumsys: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_getName(unumsys.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumsys_getRadix(unumsys: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_getRadix(unumsys.toCPointer<ByteVar>())

public actual fun unumsys_isAlgorithmic(unumsys: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_isAlgorithmic(unumsys.toCPointer<ByteVar>())

public actual fun unumsys_open(locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_open(locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumsys_openAvailableNames(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_openAvailableNames(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun unumsys_openByName(name: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsys_openByName(name.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uplrules_close(uplrules: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_close(uplrules.toCPointer<ByteVar>())
}

public actual fun uplrules_getKeywords(uplrules: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_getKeywords(uplrules.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uplrules_open(locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_open(locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_openForType(locale.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_select(uplrules.toCPointer<ByteVar>(), number, keyword.toCPointer<ByteVar>(), capacity, status.toCPointer<ByteVar>())

public actual fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrules_selectFormatted(uplrules.toCPointer<ByteVar>(), number.toCPointer<ByteVar>(), keyword.toCPointer<ByteVar>(), capacity, status.toCPointer<ByteVar>())

public actual fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_appendReplacement(regexp.toCPointer<ByteVar>(), replacementtext.toCPointer<ByteVar>(), replacementlength, destbuf.toCPointer<ByteVar>(), destcapacity.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_appendReplacementUText(regexp.toCPointer<ByteVar>(), replacementtext.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_appendTail(regexp.toCPointer<ByteVar>(), destbuf.toCPointer<ByteVar>(), destcapacity.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_appendTailUText(regexp.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_clone(regexp: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_clone(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_close(regexp: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_close(regexp.toCPointer<ByteVar>())
}

public actual fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_end(regexp.toCPointer<ByteVar>(), groupnum, status.toCPointer<ByteVar>())

public actual fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_end64(regexp.toCPointer<ByteVar>(), groupnum, status.toCPointer<ByteVar>())

public actual fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_find(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_find64(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_findNext(regexp: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_findNext(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_flags(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_flags(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getFindProgressCallback(regexp.toCPointer<ByteVar>(), callback.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getMatchCallback(regexp.toCPointer<ByteVar>(), callback.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_getStackLimit(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getStackLimit(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getText(regexp.toCPointer<ByteVar>(), textlength.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_getTimeLimit(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getTimeLimit(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_getUText(regexp.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_group(regexp.toCPointer<ByteVar>(), groupnum, dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uregex_groupCount(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_groupCount(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_groupNumberFromCName(regexp.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), namelength, status.toCPointer<ByteVar>())

public actual fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_groupNumberFromName(regexp.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), namelength, status.toCPointer<ByteVar>())

public actual fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_groupUText(regexp.toCPointer<ByteVar>(), groupnum, dest.toCPointer<ByteVar>(), grouplength.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_hasAnchoringBounds(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_hasTransparentBounds(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_hitEnd(regexp: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_hitEnd(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_lookingAt(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_lookingAt64(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_matches(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_matches64(regexp.toCPointer<ByteVar>(), startindex, status.toCPointer<ByteVar>())

public actual fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_open(pattern.toCPointer<ByteVar>(), patternlength, flags, pe.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_openC(pattern.toCPointer<ByteVar>(), flags, pe.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_openUText(pattern.toCPointer<ByteVar>(), flags, pe.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_pattern(regexp.toCPointer<ByteVar>(), patlength.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_patternUText(regexp: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_patternUText(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_refreshUText(regexp: Long, text: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_refreshUText(regexp.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_regionEnd(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_regionEnd(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_regionEnd64(regexp: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_regionEnd64(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_regionStart(regexp: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_regionStart(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_regionStart64(regexp: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_regionStart64(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_replaceAll(regexp.toCPointer<ByteVar>(), replacementtext.toCPointer<ByteVar>(), replacementlength, destbuf.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_replaceAllUText(regexp.toCPointer<ByteVar>(), replacement.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_replaceFirst(regexp.toCPointer<ByteVar>(), replacementtext.toCPointer<ByteVar>(), replacementlength, destbuf.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_replaceFirstUText(regexp.toCPointer<ByteVar>(), replacement.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregex_requireEnd(regexp: Long, status: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_requireEnd(regexp.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uregex_reset(regexp: Long, index: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_reset(regexp.toCPointer<ByteVar>(), index, status.toCPointer<ByteVar>())
}

public actual fun uregex_reset64(regexp: Long, index: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_reset64(regexp.toCPointer<ByteVar>(), index, status.toCPointer<ByteVar>())
}

public actual fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setFindProgressCallback(regexp.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setMatchCallback(regexp.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setRegion(regexp.toCPointer<ByteVar>(), regionstart, regionlimit, status.toCPointer<ByteVar>())
}

public actual fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setRegion64(regexp.toCPointer<ByteVar>(), regionstart, regionlimit, status.toCPointer<ByteVar>())
}

public actual fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setRegionAndStart(regexp.toCPointer<ByteVar>(), regionstart, regionlimit, startindex, status.toCPointer<ByteVar>())
}

public actual fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setStackLimit(regexp.toCPointer<ByteVar>(), limit, status.toCPointer<ByteVar>())
}

public actual fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setText(regexp.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())
}

public actual fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setTimeLimit(regexp.toCPointer<ByteVar>(), limit, status.toCPointer<ByteVar>())
}

public actual fun uregex_setUText(regexp: Long, text: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_setUText(regexp.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_split(regexp.toCPointer<ByteVar>(), destbuf.toCPointer<ByteVar>(), destcapacity, requiredcapacity.toCPointer<ByteVar>(), destfields.toCPointer<ByteVar>(), destfieldscapacity, status.toCPointer<ByteVar>())

public actual fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_splitUText(regexp.toCPointer<ByteVar>(), destfields.toCPointer<ByteVar>(), destfieldscapacity, status.toCPointer<ByteVar>())

public actual fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_start(regexp.toCPointer<ByteVar>(), groupnum, status.toCPointer<ByteVar>())

public actual fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_start64(regexp.toCPointer<ByteVar>(), groupnum, status.toCPointer<ByteVar>())

public actual fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_useAnchoringBounds(regexp.toCPointer<ByteVar>(), b, status.toCPointer<ByteVar>())
}

public actual fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregex_useTransparentBounds(regexp.toCPointer<ByteVar>(), b, status.toCPointer<ByteVar>())
}

public actual fun uregion_areEqual(uregion: Long, otherregion: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_areEqual(uregion.toCPointer<ByteVar>(), otherregion.toCPointer<ByteVar>())

public actual fun uregion_contains(uregion: Long, otherregion: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_contains(uregion.toCPointer<ByteVar>(), otherregion.toCPointer<ByteVar>())

public actual fun uregion_getAvailable(type: URegionType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getAvailable(type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getContainedRegions(uregion: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getContainedRegions(uregion.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getContainedRegionsOfType(uregion.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getContainingRegion(uregion: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getContainingRegion(uregion.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getContainingRegionOfType(uregion.toCPointer<ByteVar>(), type)?.toLong() ?: 0L

public actual fun uregion_getNumericCode(uregion: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getNumericCode(uregion.toCPointer<ByteVar>())

public actual fun uregion_getPreferredValues(uregion: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getPreferredValues(uregion.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getRegionCode(uregion: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getRegionCode(uregion.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getRegionFromCode(regioncode.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getRegionFromNumericCode(code, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uregion_getType(uregion: Long): URegionType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregion_getType(uregion.toCPointer<ByteVar>())

public actual fun ureldatefmt_close(reldatefmt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_close(reldatefmt.toCPointer<ByteVar>())
}

public actual fun ureldatefmt_closeResult(ufrdt: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_closeResult(ufrdt.toCPointer<ByteVar>())
}

public actual fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_combineDateAndTime(reldatefmt.toCPointer<ByteVar>(), relativedatestring.toCPointer<ByteVar>(), relativedatestringlen, timestring.toCPointer<ByteVar>(), timestringlen, result.toCPointer<ByteVar>(), resultcapacity, status.toCPointer<ByteVar>())

public actual fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_format(reldatefmt.toCPointer<ByteVar>(), offset, unit, result.toCPointer<ByteVar>(), resultcapacity, status.toCPointer<ByteVar>())

public actual fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_formatNumeric(reldatefmt.toCPointer<ByteVar>(), offset, unit, result.toCPointer<ByteVar>(), resultcapacity, status.toCPointer<ByteVar>())

public actual fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_formatNumericToResult(reldatefmt.toCPointer<ByteVar>(), offset, unit, result.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_formatToResult(reldatefmt.toCPointer<ByteVar>(), offset, unit, result.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_open(locale.toCPointer<ByteVar>(), nftoadopt.toCPointer<ByteVar>(), width, capitalizationcontext, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ureldatefmt_openResult(ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_openResult(ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmt_resultAsValue(ufrdt.toCPointer<ByteVar>(), ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_close(resourcebundle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_close(resourcebundle.toCPointer<ByteVar>())
}

public actual fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getBinary(resourcebundle.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getByIndex(resourcebundle.toCPointer<ByteVar>(), indexr, fillin.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getByKey(resourcebundle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), fillin.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getInt(resourcebundle: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getInt(resourcebundle.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getIntVector(resourcebundle.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getKey(resourcebundle: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getKey(resourcebundle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getLocaleByType(resourcebundle.toCPointer<ByteVar>(), type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getNextResource(resourcebundle.toCPointer<ByteVar>(), fillin.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getNextString(resourcebundle.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getSize(resourcebundle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getSize(resourcebundle.toCPointer<ByteVar>())

public actual fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getString(resourcebundle.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getStringByIndex(resourcebundle.toCPointer<ByteVar>(), indexs, len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getStringByKey(resb.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), len.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getType(resourcebundle: Long): UResType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getType(resourcebundle.toCPointer<ByteVar>())

public actual fun ures_getUInt(resourcebundle: Long, status: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getUInt(resourcebundle.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getUTF8String(resb.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), forcecopy, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getUTF8StringByIndex(resb.toCPointer<ByteVar>(), stringindex, dest.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), forcecopy, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getUTF8StringByKey(resb.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), forcecopy, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_getVersion(resb: Long, versioninfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_getVersion(resb.toCPointer<ByteVar>(), versioninfo.toCPointer<ByteVar>())
}

public actual fun ures_hasNext(resourcebundle: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_hasNext(resourcebundle.toCPointer<ByteVar>())

public actual fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_open(packagename.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_openAvailableLocales(packagename.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_openDirect(packagename.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_openU(packagename.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ures_resetIterator(resourcebundle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ures_resetIterator(resourcebundle.toCPointer<ByteVar>())
}

public actual fun uscript_breaksBetweenLetters(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_breaksBetweenLetters(script)

public actual fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getCode(nameorabbrorlocale.toCPointer<ByteVar>(), fillin.toCPointer<ByteVar>(), capacity, err.toCPointer<ByteVar>())

public actual fun uscript_getName(scriptcode: UScriptCode): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getName(scriptcode)?.toLong() ?: 0L

public actual fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getSampleString(script, dest.toCPointer<ByteVar>(), capacity, perrorcode.toCPointer<ByteVar>())

public actual fun uscript_getScript(codepoint: Int, err: Long): UScriptCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getScript(codepoint, err.toCPointer<ByteVar>())

public actual fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getScriptExtensions(c, scripts.toCPointer<ByteVar>(), capacity, errorcode.toCPointer<ByteVar>())

public actual fun uscript_getShortName(scriptcode: UScriptCode): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getShortName(scriptcode)?.toLong() ?: 0L

public actual fun uscript_getUsage(script: UScriptCode): UScriptUsage =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_getUsage(script)

public actual fun uscript_hasScript(c: Int, sc: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_hasScript(c, sc)

public actual fun uscript_isCased(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_isCased(script)

public actual fun uscript_isRightToLeft(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscript_isRightToLeft(script)

public actual fun usearch_close(searchiter: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_close(searchiter.toCPointer<ByteVar>())
}

public actual fun usearch_first(strsrch: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_first(strsrch.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun usearch_following(strsrch: Long, position: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_following(strsrch.toCPointer<ByteVar>(), position, status.toCPointer<ByteVar>())

public actual fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getAttribute(strsrch.toCPointer<ByteVar>(), attribute)

public actual fun usearch_getBreakIterator(strsrch: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getBreakIterator(strsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_getCollator(strsrch: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getCollator(strsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_getMatchedLength(strsrch: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getMatchedLength(strsrch.toCPointer<ByteVar>())

public actual fun usearch_getMatchedStart(strsrch: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getMatchedStart(strsrch.toCPointer<ByteVar>())

public actual fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getMatchedText(strsrch.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultcapacity, status.toCPointer<ByteVar>())

public actual fun usearch_getOffset(strsrch: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getOffset(strsrch.toCPointer<ByteVar>())

public actual fun usearch_getPattern(strsrch: Long, length: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getPattern(strsrch.toCPointer<ByteVar>(), length.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_getText(strsrch: Long, length: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_getText(strsrch.toCPointer<ByteVar>(), length.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_last(strsrch: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_last(strsrch.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun usearch_next(strsrch: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_next(strsrch.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_open(pattern.toCPointer<ByteVar>(), patternlength, text.toCPointer<ByteVar>(), textlength, locale.toCPointer<ByteVar>(), breakiter.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_openFromCollator(pattern.toCPointer<ByteVar>(), patternlength, text.toCPointer<ByteVar>(), textlength, collator.toCPointer<ByteVar>(), breakiter.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_preceding(strsrch.toCPointer<ByteVar>(), position, status.toCPointer<ByteVar>())

public actual fun usearch_previous(strsrch: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_previous(strsrch.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun usearch_reset(strsrch: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_reset(strsrch.toCPointer<ByteVar>())
}

public actual fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setAttribute(strsrch.toCPointer<ByteVar>(), attribute, value, status.toCPointer<ByteVar>())
}

public actual fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setBreakIterator(strsrch.toCPointer<ByteVar>(), breakiter.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun usearch_setCollator(strsrch: Long, collator: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setCollator(strsrch.toCPointer<ByteVar>(), collator.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun usearch_setOffset(strsrch: Long, position: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setOffset(strsrch.toCPointer<ByteVar>(), position, status.toCPointer<ByteVar>())
}

public actual fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setPattern(strsrch.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, status.toCPointer<ByteVar>())
}

public actual fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearch_setText(strsrch.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength, status.toCPointer<ByteVar>())
}

public actual fun uset_add(set: Long, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_add(set.toCPointer<ByteVar>(), c)
}

public actual fun uset_addAll(set: Long, additionalset: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_addAll(set.toCPointer<ByteVar>(), additionalset.toCPointer<ByteVar>())
}

public actual fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_addAllCodePoints(set.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strlen)
}

public actual fun uset_addRange(set: Long, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_addRange(set.toCPointer<ByteVar>(), start, end)
}

public actual fun uset_addString(set: Long, str: Long, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_addString(set.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strlen)
}

public actual fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_applyIntPropertyValue(set.toCPointer<ByteVar>(), prop, value, ec.toCPointer<ByteVar>())
}

public actual fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_applyPattern(set.toCPointer<ByteVar>(), pattern.toCPointer<ByteVar>(), patternlength, options, status.toCPointer<ByteVar>())

public actual fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_applyPropertyAlias(set.toCPointer<ByteVar>(), prop.toCPointer<ByteVar>(), proplength, value.toCPointer<ByteVar>(), valuelength, ec.toCPointer<ByteVar>())
}

public actual fun uset_charAt(set: Long, charindex: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_charAt(set.toCPointer<ByteVar>(), charindex)

public actual fun uset_clear(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_clear(set.toCPointer<ByteVar>())
}

public actual fun uset_clone(set: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_clone(set.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uset_cloneAsThawed(set: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_cloneAsThawed(set.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uset_close(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_close(set.toCPointer<ByteVar>())
}

public actual fun uset_closeOver(set: Long, attributes: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_closeOver(set.toCPointer<ByteVar>(), attributes)
}

public actual fun uset_compact(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_compact(set.toCPointer<ByteVar>())
}

public actual fun uset_complement(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_complement(set.toCPointer<ByteVar>())
}

public actual fun uset_complementAll(set: Long, complement: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_complementAll(set.toCPointer<ByteVar>(), complement.toCPointer<ByteVar>())
}

public actual fun uset_contains(set: Long, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_contains(set.toCPointer<ByteVar>(), c)

public actual fun uset_containsAll(set1: Long, set2: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsAll(set1.toCPointer<ByteVar>(), set2.toCPointer<ByteVar>())

public actual fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsAllCodePoints(set.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strlen)

public actual fun uset_containsNone(set1: Long, set2: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsNone(set1.toCPointer<ByteVar>(), set2.toCPointer<ByteVar>())

public actual fun uset_containsRange(set: Long, start: Int, end: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsRange(set.toCPointer<ByteVar>(), start, end)

public actual fun uset_containsSome(set1: Long, set2: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsSome(set1.toCPointer<ByteVar>(), set2.toCPointer<ByteVar>())

public actual fun uset_containsString(set: Long, str: Long, strlen: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_containsString(set.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strlen)

public actual fun uset_equals(set1: Long, set2: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_equals(set1.toCPointer<ByteVar>(), set2.toCPointer<ByteVar>())

public actual fun uset_freeze(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_freeze(set.toCPointer<ByteVar>())
}

public actual fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_getItem(set.toCPointer<ByteVar>(), itemindex, start.toCPointer<ByteVar>(), end.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strcapacity, ec.toCPointer<ByteVar>())

public actual fun uset_getItemCount(set: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_getItemCount(set.toCPointer<ByteVar>())

public actual fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_getSerializedRange(set.toCPointer<ByteVar>(), rangeindex, pstart.toCPointer<ByteVar>(), pend.toCPointer<ByteVar>())

public actual fun uset_getSerializedRangeCount(set: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_getSerializedRangeCount(set.toCPointer<ByteVar>())

public actual fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_getSerializedSet(fillset.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength)

public actual fun uset_indexOf(set: Long, c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_indexOf(set.toCPointer<ByteVar>(), c)

public actual fun uset_isEmpty(set: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_isEmpty(set.toCPointer<ByteVar>())

public actual fun uset_isFrozen(set: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_isFrozen(set.toCPointer<ByteVar>())

public actual fun uset_open(start: Int, end: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_open(start, end)?.toLong() ?: 0L

public actual fun uset_openEmpty(): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_openEmpty()?.toLong() ?: 0L

public actual fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_openPattern(pattern.toCPointer<ByteVar>(), patternlength, ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_openPatternOptions(pattern.toCPointer<ByteVar>(), patternlength, options, ec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uset_remove(set: Long, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_remove(set.toCPointer<ByteVar>(), c)
}

public actual fun uset_removeAll(set: Long, removeset: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_removeAll(set.toCPointer<ByteVar>(), removeset.toCPointer<ByteVar>())
}

public actual fun uset_removeAllStrings(set: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_removeAllStrings(set.toCPointer<ByteVar>())
}

public actual fun uset_removeRange(set: Long, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_removeRange(set.toCPointer<ByteVar>(), start, end)
}

public actual fun uset_removeString(set: Long, str: Long, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_removeString(set.toCPointer<ByteVar>(), str.toCPointer<ByteVar>(), strlen)
}

public actual fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_resemblesPattern(pattern.toCPointer<ByteVar>(), patternlength, pos)

public actual fun uset_retain(set: Long, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_retain(set.toCPointer<ByteVar>(), start, end)
}

public actual fun uset_retainAll(set: Long, retain: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_retainAll(set.toCPointer<ByteVar>(), retain.toCPointer<ByteVar>())
}

public actual fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_serialize(set.toCPointer<ByteVar>(), dest.toCPointer<ByteVar>(), destcapacity, perrorcode.toCPointer<ByteVar>())

public actual fun uset_serializedContains(set: Long, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_serializedContains(set.toCPointer<ByteVar>(), c)

public actual fun uset_set(set: Long, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_set(set.toCPointer<ByteVar>(), start, end)
}

public actual fun uset_setSerializedToOne(fillset: Long, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_setSerializedToOne(fillset.toCPointer<ByteVar>(), c)
}

public actual fun uset_size(set: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_size(set.toCPointer<ByteVar>())

public actual fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_span(set.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, spancondition)

public actual fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_spanBack(set.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, spancondition)

public actual fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_spanBackUTF8(set.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, spancondition)

public actual fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_spanUTF8(set.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, spancondition)

public actual fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uset_toPattern(set.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), resultcapacity, escapeunprintable, ec.toCPointer<ByteVar>())

public actual fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_areConfusable(sc.toCPointer<ByteVar>(), id1.toCPointer<ByteVar>(), length1, id2.toCPointer<ByteVar>(), length2, status.toCPointer<ByteVar>())

public actual fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_areConfusableUTF8(sc.toCPointer<ByteVar>(), id1.toCPointer<ByteVar>(), length1, id2.toCPointer<ByteVar>(), length2, status.toCPointer<ByteVar>())

public actual fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_check(sc.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), length, position.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_check2(sc.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), length, checkresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_check2UTF8(sc.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), length, checkresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_checkUTF8(sc.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), length, position.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_clone(sc: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_clone(sc.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_close(sc: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_close(sc.toCPointer<ByteVar>())
}

public actual fun uspoof_closeCheckResult(checkresult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_closeCheckResult(checkresult.toCPointer<ByteVar>())
}

public actual fun uspoof_getAllowedChars(sc: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getAllowedChars(sc.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getAllowedLocales(sc.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getCheckResultChecks(checkresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getCheckResultNumerics(checkresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getCheckResultRestrictionLevel(checkresult.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_getChecks(sc: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getChecks(sc.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun uspoof_getInclusionSet(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getInclusionSet(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_getRecommendedSet(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getRecommendedSet(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getRestrictionLevel(sc.toCPointer<ByteVar>())

public actual fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getSkeleton(sc.toCPointer<ByteVar>(), type, id.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_getSkeletonUTF8(sc.toCPointer<ByteVar>(), type, id.toCPointer<ByteVar>(), length, dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun uspoof_open(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_open(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_openCheckResult(status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_openCheckResult(status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_openFromSerialized(data.toCPointer<ByteVar>(), length, pactuallength.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_openFromSource(confusables.toCPointer<ByteVar>(), confusableslen, confusableswholescript.toCPointer<ByteVar>(), confusableswholescriptlen, errtype.toCPointer<ByteVar>(), pe.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_serialize(sc.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), capacity, status.toCPointer<ByteVar>())

public actual fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_setAllowedChars(sc.toCPointer<ByteVar>(), chars.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_setAllowedLocales(sc.toCPointer<ByteVar>(), localeslist.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun uspoof_setChecks(sc: Long, checks: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_setChecks(sc.toCPointer<ByteVar>(), checks, status.toCPointer<ByteVar>())
}

public actual fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoof_setRestrictionLevel(sc.toCPointer<ByteVar>(), restrictionlevel)
}

public actual fun usprep_close(profile: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprep_close(profile.toCPointer<ByteVar>())
}

public actual fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprep_open(path.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprep_openByType(type, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprep_prepare(prep.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), srclength, dest.toCPointer<ByteVar>(), destcapacity, options, parseerror.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun utext_char32At(ut: Long, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_char32At(ut.toCPointer<ByteVar>(), nativeindex)

public actual fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_clone(dest.toCPointer<ByteVar>(), src.toCPointer<ByteVar>(), deep, readonly, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utext_close(ut: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_close(ut.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_copy(ut.toCPointer<ByteVar>(), nativestart, nativelimit, destindex, move, status.toCPointer<ByteVar>())
}

public actual fun utext_current32(ut: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_current32(ut.toCPointer<ByteVar>())

public actual fun utext_equals(a: Long, b: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_equals(a.toCPointer<ByteVar>(), b.toCPointer<ByteVar>())

public actual fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_extract(ut.toCPointer<ByteVar>(), nativestart, nativelimit, dest.toCPointer<ByteVar>(), destcapacity, status.toCPointer<ByteVar>())

public actual fun utext_freeze(ut: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_freeze(ut.toCPointer<ByteVar>())
}

public actual fun utext_getNativeIndex(ut: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_getNativeIndex(ut.toCPointer<ByteVar>())

public actual fun utext_getPreviousNativeIndex(ut: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_getPreviousNativeIndex(ut.toCPointer<ByteVar>())

public actual fun utext_hasMetaData(ut: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_hasMetaData(ut.toCPointer<ByteVar>())

public actual fun utext_isLengthExpensive(ut: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_isLengthExpensive(ut.toCPointer<ByteVar>())

public actual fun utext_isWritable(ut: Long): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_isWritable(ut.toCPointer<ByteVar>())

public actual fun utext_moveIndex32(ut: Long, delta: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_moveIndex32(ut.toCPointer<ByteVar>(), delta)

public actual fun utext_nativeLength(ut: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_nativeLength(ut.toCPointer<ByteVar>())

public actual fun utext_next32(ut: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_next32(ut.toCPointer<ByteVar>())

public actual fun utext_next32From(ut: Long, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_next32From(ut.toCPointer<ByteVar>(), nativeindex)

public actual fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_openUChars(ut.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_openUTF8(ut.toCPointer<ByteVar>(), s.toCPointer<ByteVar>(), length, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utext_previous32(ut: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_previous32(ut.toCPointer<ByteVar>())

public actual fun utext_previous32From(ut: Long, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_previous32From(ut.toCPointer<ByteVar>(), nativeindex)

public actual fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_replace(ut.toCPointer<ByteVar>(), nativestart, nativelimit, replacementtext.toCPointer<ByteVar>(), replacementlength, status.toCPointer<ByteVar>())

public actual fun utext_setNativeIndex(ut: Long, nativeindex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_setNativeIndex(ut.toCPointer<ByteVar>(), nativeindex)
}

public actual fun utext_setup(ut: Long, extraspace: Int, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utext_setup(ut.toCPointer<ByteVar>(), extraspace, status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8_appendCharSafeBody(s.toCPointer<ByteVar>(), i, length, c, piserror.toCPointer<ByteVar>())

public actual fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8_back1SafeBody(s.toCPointer<ByteVar>(), start, i)

public actual fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8_nextCharSafeBody(s.toCPointer<ByteVar>(), pi.toCPointer<ByteVar>(), length, c, strict)

public actual fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8_prevCharSafeBody(s.toCPointer<ByteVar>(), start, pi.toCPointer<ByteVar>(), c, strict)

public actual fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscale_fromInt64(othertime, timescale, status.toCPointer<ByteVar>())

public actual fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscale_getTimeScaleValue(timescale, value, status.toCPointer<ByteVar>())

public actual fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscale_toInt64(universaltime, timescale, status.toCPointer<ByteVar>())

public actual fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR): Int =
    0

public actual fun utrace_functionName(fnnumber: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_functionName(fnnumber)?.toLong() ?: 0L

public actual fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_getFunctions(context.toCPointer<ByteVar>(), e.toCPointer<ByteVar>(), x.toCPointer<ByteVar>(), d.toCPointer<ByteVar>())
}

public actual fun utrace_getLevel(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_getLevel()

public actual fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_setFunctions(context.toCPointer<ByteVar>(), e.toLong().toCPointer<ByteVar>(), x.toLong().toCPointer<ByteVar>(), d.toLong().toCPointer<ByteVar>())
}

public actual fun utrace_setLevel(tracelevel: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_setLevel(tracelevel)
}

public actual fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrace_vformat(outbuf.toCPointer<ByteVar>(), capacity, indent, fmt.toCPointer<ByteVar>(), args.toCPointer<ByteVar>())

public actual fun utrans_clone(trans: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_clone(trans.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_close(trans: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_close(trans.toCPointer<ByteVar>())
}

public actual fun utrans_countAvailableIDs(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_countAvailableIDs()

public actual fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_getSourceSet(trans.toCPointer<ByteVar>(), ignorefilter, fillin.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_getUnicodeID(trans.toCPointer<ByteVar>(), resultlength.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_openIDs(perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_openIDs(perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_openInverse(trans: Long, status: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_openInverse(trans.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_openU(id.toCPointer<ByteVar>(), idlength, dir, rules.toCPointer<ByteVar>(), ruleslength, parseerror.toCPointer<ByteVar>(), perrorcode.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun utrans_register(adoptedtrans: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_register(adoptedtrans.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_setFilter(trans.toCPointer<ByteVar>(), filterpattern.toCPointer<ByteVar>(), filterpatternlen, status.toCPointer<ByteVar>())
}

public actual fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_toRules(trans.toCPointer<ByteVar>(), escapeunprintable, result.toCPointer<ByteVar>(), resultlength, status.toCPointer<ByteVar>())

public actual fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_trans(trans.toCPointer<ByteVar>(), rep.toCPointer<ByteVar>(), repfunc.toCPointer<ByteVar>(), start, limit.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_transIncremental(trans.toCPointer<ByteVar>(), rep.toCPointer<ByteVar>(), repfunc.toCPointer<ByteVar>(), pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_transIncrementalUChars(trans.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength.toCPointer<ByteVar>(), textcapacity, pos.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_transUChars(trans.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), textlength.toCPointer<ByteVar>(), textcapacity, start, limit.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
}

public actual fun utrans_unregisterID(id: Long, idlength: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utrans_unregisterID(id.toCPointer<ByteVar>(), idlength)
}
