@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun adjustCalendarDate(lpcaldatetime: COpaquePointer?, calunit: CaldatetimeDateunit, amount: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_adjustCalendarDate(lpcaldatetime?.value?.toCPointer<ByteVar>(), calunit, amount)

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: COpaquePointer?, cchcount1: Int, lpstring2: COpaquePointer?, cchcount2: Int): ComparestringResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_compareStringA(locale, dwcmpflags, lpstring1?.value?.toCPointer<ByteVar>(), cchcount1, lpstring2?.value?.toCPointer<ByteVar>(), cchcount2)

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, lparam: Lparam): ComparestringResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_compareStringEx(lplocalename?.value?.toCPointer<ByteVar>(), dwcmpflags, lpstring1?.value?.toCPointer<ByteVar>(), cchcount1, lpstring2?.value?.toCPointer<ByteVar>(), cchcount2, lpversioninformation?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lparam)

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_compareStringOrdinal(lpstring1?.value?.toCPointer<ByteVar>(), cchcount1, lpstring2?.value?.toCPointer<ByteVar>(), cchcount2, bignorecase)

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_compareStringW(locale, dwcmpflags, lpstring1?.value?.toCPointer<ByteVar>(), cchcount1, lpstring2?.value?.toCPointer<ByteVar>(), cchcount2)

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: COpaquePointer?, lpsystime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_convertCalDateTimeToSystemTime(lpcaldatetime?.value?.toCPointer<ByteVar>(), lpsystime?.value?.toCPointer<ByteVar>())

public actual fun convertDefaultLocale(locale: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_convertDefaultLocale(locale)

public actual fun convertSystemTimeToCalDateTime(lpsystime: COpaquePointer?, calid: UInt, lpcaldatetime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_convertSystemTimeToCalDateTime(lpsystime?.value?.toCPointer<ByteVar>(), calid, lpcaldatetime?.value?.toCPointer<ByteVar>())

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumCalendarInfoA(0L.toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumCalendarInfoExA(0L.toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumCalendarInfoExEx(0L.toCPointer<ByteVar>(), lplocalename?.value?.toCPointer<ByteVar>(), calendar, lpreserved?.value?.toCPointer<ByteVar>(), caltype, lparam)

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumCalendarInfoExW(0L.toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumCalendarInfoW(0L.toCPointer<ByteVar>(), locale, calendar, caltype)

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumDateFormatsA(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumDateFormatsExA(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumDateFormatsExEx(0L.toCPointer<ByteVar>(), lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumDateFormatsExW(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumDateFormatsW(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumLanguageGroupLocalesA(0L.toCPointer<ByteVar>(), languagegroup, dwflags, lparam)

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumLanguageGroupLocalesW(0L.toCPointer<ByteVar>(), languagegroup, dwflags, lparam)

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemCodePagesA(0L.toCPointer<ByteVar>(), dwflags)

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemCodePagesW(0L.toCPointer<ByteVar>(), dwflags)

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemGeoID(geoclass, parentgeoid, 0L.toCPointer<ByteVar>())

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemGeoNames(geoclass, 0L.toCPointer<ByteVar>(), data)

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemLanguageGroupsA(0L.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemLanguageGroupsW(0L.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemLocalesA(0L.toCPointer<ByteVar>(), dwflags)

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemLocalesEx(0L.toCPointer<ByteVar>(), dwflags, lparam, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumSystemLocalesW(0L.toCPointer<ByteVar>(), dwflags)

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumTimeFormatsA(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumTimeFormatsEx(0L.toCPointer<ByteVar>(), lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumTimeFormatsW(0L.toCPointer<ByteVar>(), locale, dwflags)

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumUILanguagesA(0L.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_enumUILanguagesW(0L.toCPointer<ByteVar>(), dwflags, lparam)

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_findNLSString(locale, dwfindnlsstringflags, lpstringsource?.value?.toCPointer<ByteVar>(), cchsource, lpstringvalue?.value?.toCPointer<ByteVar>(), cchvalue, pcchfound?.value?.toCPointer<ByteVar>())

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_findNLSStringEx(lplocalename?.value?.toCPointer<ByteVar>(), dwfindnlsstringflags, lpstringsource?.value?.toCPointer<ByteVar>(), cchsource, lpstringvalue?.value?.toCPointer<ByteVar>(), cchvalue, pcchfound?.value?.toCPointer<ByteVar>(), lpversioninformation?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), sorthandle)

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_findStringOrdinal(dwfindstringordinalflags, lpstringsource?.value?.toCPointer<ByteVar>(), cchsource, lpstringvalue?.value?.toCPointer<ByteVar>(), cchvalue, bignorecase)

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_foldStringA(dwmapflags, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_foldStringW(dwmapflags, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun getACP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getACP()

public actual fun getCPInfo(codepage: UInt, lpcpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCPInfo(codepage, lpcpinfo?.value?.toCPointer<ByteVar>())

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCPInfoExA(codepage, dwflags, lpcpinfoex?.value?.toCPointer<ByteVar>())

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCPInfoExW(codepage, dwflags, lpcpinfoex?.value?.toCPointer<ByteVar>())

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCalendarDateFormatEx(lpszlocale?.value?.toCPointer<ByteVar>(), dwflags, lpcaldatetime?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpdatestr?.value?.toCPointer<ByteVar>(), cchdate)

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCalendarInfoA(locale, calendar, caltype, lpcaldata?.value?.toCPointer<ByteVar>(), cchdata, lpvalue?.value?.toCPointer<ByteVar>())

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCalendarInfoEx(lplocalename?.value?.toCPointer<ByteVar>(), calendar, lpreserved?.value?.toCPointer<ByteVar>(), caltype, lpcaldata?.value?.toCPointer<ByteVar>(), cchdata, lpvalue?.value?.toCPointer<ByteVar>())

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCalendarInfoW(locale, calendar, caltype, lpcaldata?.value?.toCPointer<ByteVar>(), cchdata, lpvalue?.value?.toCPointer<ByteVar>())

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: COpaquePointer?, lpcalmaxdatetime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCalendarSupportedDateRange(calendar, lpcalmindatetime?.value?.toCPointer<ByteVar>(), lpcalmaxdatetime?.value?.toCPointer<ByteVar>())

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCurrencyFormatA(locale, dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpcurrencystr?.value?.toCPointer<ByteVar>(), cchcurrency)

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCurrencyFormatEx(lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpcurrencystr?.value?.toCPointer<ByteVar>(), cchcurrency)

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getCurrencyFormatW(locale, dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpcurrencystr?.value?.toCPointer<ByteVar>(), cchcurrency)

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDateFormatA(locale, dwflags, lpdate?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpdatestr?.value?.toCPointer<ByteVar>(), cchdate)

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDateFormatEx(lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lpdate?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpdatestr?.value?.toCPointer<ByteVar>(), cchdate, lpcalendar?.value?.toCPointer<ByteVar>())

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDateFormatW(locale, dwflags, lpdate?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpdatestr?.value?.toCPointer<ByteVar>(), cchdate)

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDistanceOfClosestLanguageInList(pszlanguage?.value?.toCPointer<ByteVar>(), pszlanguageslist?.value?.toCPointer<ByteVar>(), wchlistdelimiter, pclosestdistance?.value?.toCPointer<ByteVar>())

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDurationFormat(locale, dwflags, lpduration?.value?.toCPointer<ByteVar>(), ullduration, lpformat?.value?.toCPointer<ByteVar>(), lpdurationstr?.value?.toCPointer<ByteVar>(), cchduration)

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getDurationFormatEx(lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lpduration?.value?.toCPointer<ByteVar>(), ullduration, lpformat?.value?.toCPointer<ByteVar>(), lpdurationstr?.value?.toCPointer<ByteVar>(), cchduration)

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: COpaquePointer?, pcbfilemuiinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getFileMUIInfo(dwflags, pcwszfilepath?.value?.toCPointer<ByteVar>(), pfilemuiinfo?.value?.toCPointer<ByteVar>(), pcbfilemuiinfo?.value?.toCPointer<ByteVar>())

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: COpaquePointer?, pwszfilemuipath: Pwstr, pcchfilemuipath: COpaquePointer?, pululenumerator: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getFileMUIPath(dwflags, pcwszfilepath?.value?.toCPointer<ByteVar>(), pwszlanguage?.value?.toCPointer<ByteVar>(), pcchlanguage?.value?.toCPointer<ByteVar>(), pwszfilemuipath?.value?.toCPointer<ByteVar>(), pcchfilemuipath?.value?.toCPointer<ByteVar>(), pululenumerator?.value?.toCPointer<ByteVar>())

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getGeoInfoA(location, geotype, lpgeodata?.value?.toCPointer<ByteVar>(), cchdata, langid)

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getGeoInfoEx(location?.value?.toCPointer<ByteVar>(), geotype, geodata?.value?.toCPointer<ByteVar>(), geodatacount)

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getGeoInfoW(location, geotype, lpgeodata?.value?.toCPointer<ByteVar>(), cchdata, langid)

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getLocaleInfoA(locale, lctype, lplcdata?.value?.toCPointer<ByteVar>(), cchdata)

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getLocaleInfoEx(lplocalename?.value?.toCPointer<ByteVar>(), lctype, lplcdata?.value?.toCPointer<ByteVar>(), cchdata)

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getLocaleInfoW(locale, lctype, lplcdata?.value?.toCPointer<ByteVar>(), cchdata)

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getNLSVersion(function, locale, lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getNLSVersionEx(function, lplocalename?.value?.toCPointer<ByteVar>(), lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpnumberstr: Pstr, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getNumberFormatA(locale, dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpnumberstr?.value?.toCPointer<ByteVar>(), cchnumber)

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getNumberFormatEx(lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpnumberstr?.value?.toCPointer<ByteVar>(), cchnumber)

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getNumberFormatW(locale, dwflags, lpvalue?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lpnumberstr?.value?.toCPointer<ByteVar>(), cchnumber)

public actual fun getOEMCP(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getOEMCP()

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getProcessPreferredUILanguages(dwflags, pulnumlanguages?.value?.toCPointer<ByteVar>(), pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pcchlanguagesbuffer?.value?.toCPointer<ByteVar>())

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getStringScripts(dwflags, lpstring?.value?.toCPointer<ByteVar>(), cchstring, lpscripts?.value?.toCPointer<ByteVar>(), cchscripts)

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getStringTypeA(locale, dwinfotype, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpchartype?.value?.toCPointer<ByteVar>())

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getStringTypeExA(locale, dwinfotype, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpchartype?.value?.toCPointer<ByteVar>())

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getStringTypeExW(locale, dwinfotype, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpchartype?.value?.toCPointer<ByteVar>())

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getStringTypeW(dwinfotype, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpchartype?.value?.toCPointer<ByteVar>())

public actual fun getSystemDefaultLCID(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getSystemDefaultLCID()

public actual fun getSystemDefaultLangID(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getSystemDefaultLangID()

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getSystemDefaultLocaleName(lplocalename?.value?.toCPointer<ByteVar>(), cchlocalename)

public actual fun getSystemDefaultUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getSystemDefaultUILanguage()

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getSystemPreferredUILanguages(dwflags, pulnumlanguages?.value?.toCPointer<ByteVar>(), pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pcchlanguagesbuffer?.value?.toCPointer<ByteVar>())

public actual fun getTextCharset(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getTextCharset(hdc?.value?.toCPointer<ByteVar>())

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: COpaquePointer?, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getTextCharsetInfo(hdc?.value?.toCPointer<ByteVar>(), lpsig?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getThreadLocale(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getThreadLocale()

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getThreadPreferredUILanguages(dwflags, pulnumlanguages?.value?.toCPointer<ByteVar>(), pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pcchlanguagesbuffer?.value?.toCPointer<ByteVar>())

public actual fun getThreadUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getThreadUILanguage()

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getTimeFormatA(locale, dwflags, lptime?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lptimestr?.value?.toCPointer<ByteVar>(), cchtime)

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getTimeFormatEx(lplocalename?.value?.toCPointer<ByteVar>(), dwflags, lptime?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lptimestr?.value?.toCPointer<ByteVar>(), cchtime)

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getTimeFormatW(locale, dwflags, lptime?.value?.toCPointer<ByteVar>(), lpformat?.value?.toCPointer<ByteVar>(), lptimestr?.value?.toCPointer<ByteVar>(), cchtime)

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUILanguageInfo(dwflags, pwmszlanguage?.value?.toCPointer<ByteVar>(), pwszfallbacklanguages?.value?.toCPointer<ByteVar>(), pcchfallbacklanguages?.value?.toCPointer<ByteVar>(), pattributes?.value?.toCPointer<ByteVar>())

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserDefaultGeoName(geoname?.value?.toCPointer<ByteVar>(), geonamecount)

public actual fun getUserDefaultLCID(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserDefaultLCID()

public actual fun getUserDefaultLangID(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserDefaultLangID()

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserDefaultLocaleName(lplocalename?.value?.toCPointer<ByteVar>(), cchlocalename)

public actual fun getUserDefaultUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserDefaultUILanguage()

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserGeoID(geoclass)

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_getUserPreferredUILanguages(dwflags, pulnumlanguages?.value?.toCPointer<ByteVar>(), pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pcchlanguagesbuffer?.value?.toCPointer<ByteVar>())

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_idnToAscii(dwflags, lpunicodecharstr?.value?.toCPointer<ByteVar>(), cchunicodechar, lpasciicharstr?.value?.toCPointer<ByteVar>(), cchasciichar)

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_idnToNameprepUnicode(dwflags, lpunicodecharstr?.value?.toCPointer<ByteVar>(), cchunicodechar, lpnameprepcharstr?.value?.toCPointer<ByteVar>(), cchnameprepchar)

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_idnToUnicode(dwflags, lpasciicharstr?.value?.toCPointer<ByteVar>(), cchasciichar, lpunicodecharstr?.value?.toCPointer<ByteVar>(), cchunicodechar)

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isCalendarLeapYear(calid, year, era)

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isDBCSLeadByte(testchar)

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isDBCSLeadByteEx(codepage, testchar)

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: COpaquePointer?, lpstring: Pcwstr, cchstr: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isNLSDefinedString(function, dwflags, lpversioninformation?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), cchstr)

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isNormalizedString(normform, lpstring?.value?.toCPointer<ByteVar>(), cwlength)

public actual fun isTextUnicode(lpv: COpaquePointer?, isize: Int, lpiresult: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isTextUnicode(lpv?.value?.toCPointer<ByteVar>(), isize, lpiresult?.value?.toCPointer<ByteVar>())

public actual fun isValidCodePage(codepage: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isValidCodePage(codepage)

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isValidLanguageGroup(languagegroup, dwflags)

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isValidLocale(locale, dwflags)

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isValidLocaleName(lplocalename?.value?.toCPointer<ByteVar>())

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isValidNLSVersion(function, lplocalename?.value?.toCPointer<ByteVar>(), lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_isWellFormedTag(psztag?.value?.toCPointer<ByteVar>())

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lCIDToLocaleName(locale, lpname?.value?.toCPointer<ByteVar>(), cchname, dwflags)

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lCMapStringA(locale, dwmapflags, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lCMapStringEx(lplocalename?.value?.toCPointer<ByteVar>(), dwmapflags, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest, lpversioninformation?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), sorthandle)

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lCMapStringW(locale, dwmapflags, lpsrcstr?.value?.toCPointer<ByteVar>(), cchsrc, lpdeststr?.value?.toCPointer<ByteVar>(), cchdest)

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_localeNameToLCID(lpname?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun mappingDoAction(pbag: COpaquePointer?, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_mappingDoAction(pbag?.value?.toCPointer<ByteVar>(), dwrangeindex, pszactionid?.value?.toCPointer<ByteVar>())

public actual fun mappingFreePropertyBag(pbag: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_mappingFreePropertyBag(pbag?.value?.toCPointer<ByteVar>())

public actual fun mappingFreeServices(pserviceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_mappingFreeServices(pserviceinfo?.value?.toCPointer<ByteVar>())

public actual fun mappingGetServices(poptions: COpaquePointer?, prgservices: COpaquePointer?, pdwservicescount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_mappingGetServices(poptions?.value?.toCPointer<ByteVar>(), prgservices?.value?.toCPointer<ByteVar>(), pdwservicescount?.value?.toCPointer<ByteVar>())

public actual fun mappingRecognizeText(pserviceinfo: COpaquePointer?, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: COpaquePointer?, pbag: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_mappingRecognizeText(pserviceinfo?.value?.toCPointer<ByteVar>(), psztext?.value?.toCPointer<ByteVar>(), dwlength, dwindex, poptions?.value?.toCPointer<ByteVar>(), pbag?.value?.toCPointer<ByteVar>())

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_multiByteToWideChar(codepage, dwflags, lpmultibytestr?.value?.toCPointer<ByteVar>(), cbmultibyte, lpwidecharstr?.value?.toCPointer<ByteVar>(), cchwidechar)

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_normalizeString(normform, lpsrcstring?.value?.toCPointer<ByteVar>(), cwsrclength, lpdststring?.value?.toCPointer<ByteVar>(), cwdstlength)

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_notifyUILanguageChange(dwflags, pcwstrnewlanguage?.value?.toCPointer<ByteVar>(), pcwstrpreviouslanguage?.value?.toCPointer<ByteVar>(), dwreserved, pdwstatusrtrn?.value?.toCPointer<ByteVar>())

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_resolveLocaleName(lpnametoresolve?.value?.toCPointer<ByteVar>(), lplocalename?.value?.toCPointer<ByteVar>(), cchlocalename)

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_restoreThreadPreferredUILanguages(snapshot?.value?.toCPointer<ByteVar>())
}

public actual fun scriptApplyDigitSubstitution(psds: COpaquePointer?, psc: COpaquePointer?, pss: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptApplyDigitSubstitution(psds?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), pss?.value?.toCPointer<ByteVar>())

public actual fun scriptApplyLogicalWidth(pidx: COpaquePointer?, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pabc: COpaquePointer?, pijustify: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptApplyLogicalWidth(pidx?.value?.toCPointer<ByteVar>(), cchars, cglyphs, pwlogclust?.value?.toCPointer<ByteVar>(), psva?.value?.toCPointer<ByteVar>(), piadvance?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), pabc?.value?.toCPointer<ByteVar>(), pijustify?.value?.toCPointer<ByteVar>())

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: COpaquePointer?, psla: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptBreak(pwcchars?.value?.toCPointer<ByteVar>(), cchars, psa?.value?.toCPointer<ByteVar>(), psla?.value?.toCPointer<ByteVar>())

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pix: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust?.value?.toCPointer<ByteVar>(), psva?.value?.toCPointer<ByteVar>(), piadvance?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), pix?.value?.toCPointer<ByteVar>())

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: COpaquePointer?, tmheight: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptCacheGetHeight(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), tmheight?.value?.toCPointer<ByteVar>())

public actual fun scriptFreeCache(psc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptFreeCache(psc?.value?.toCPointer<ByteVar>())

public actual fun scriptGetCMap(hdc: Hdc, psc: COpaquePointer?, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetCMap(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), pwcinchars?.value?.toCPointer<ByteVar>(), cchars, dwflags, pwoutglyphs?.value?.toCPointer<ByteVar>())

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: COpaquePointer?, pcalternates: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetFontAlternateGlyphs(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, taglangsys, tagfeature, wglyphid, cmaxalternates, palternateglyphs?.value?.toCPointer<ByteVar>(), pcalternates?.value?.toCPointer<ByteVar>())

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetFontFeatureTags(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, taglangsys, cmaxtags, pfeaturetags?.value?.toCPointer<ByteVar>(), pctags?.value?.toCPointer<ByteVar>())

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, cmaxtags: Int, plangsystags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetFontLanguageTags(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, cmaxtags, plangsystags?.value?.toCPointer<ByteVar>(), pctags?.value?.toCPointer<ByteVar>())

public actual fun scriptGetFontProperties(hdc: Hdc, psc: COpaquePointer?, sfp: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetFontProperties(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), sfp?.value?.toCPointer<ByteVar>())

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, cmaxtags: Int, pscripttags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetFontScriptTags(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), cmaxtags, pscripttags?.value?.toCPointer<ByteVar>(), pctags?.value?.toCPointer<ByteVar>())

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: COpaquePointer?, wglyph: UShort, pabc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetGlyphABCWidth(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), wglyph, pabc?.value?.toCPointer<ByteVar>())

public actual fun scriptGetLogicalWidths(psa: COpaquePointer?, cchars: Int, cglyphs: Int, piglyphwidth: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetLogicalWidths(psa?.value?.toCPointer<ByteVar>(), cchars, cglyphs, piglyphwidth?.value?.toCPointer<ByteVar>(), pwlogclust?.value?.toCPointer<ByteVar>(), psva?.value?.toCPointer<ByteVar>(), pidx?.value?.toCPointer<ByteVar>())

public actual fun scriptGetProperties(ppsp: COpaquePointer?, pinumscripts: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptGetProperties(ppsp?.value?.toCPointer<ByteVar>(), pinumscripts?.value?.toCPointer<ByteVar>())

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptIsComplex(pwcinchars?.value?.toCPointer<ByteVar>(), cinchars, dwflags)

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptItemize(pwcinchars?.value?.toCPointer<ByteVar>(), cinchars, cmaxitems, pscontrol?.value?.toCPointer<ByteVar>(), psstate?.value?.toCPointer<ByteVar>(), pitems?.value?.toCPointer<ByteVar>(), pcitems?.value?.toCPointer<ByteVar>())

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pscripttags: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptItemizeOpenType(pwcinchars?.value?.toCPointer<ByteVar>(), cinchars, cmaxitems, pscontrol?.value?.toCPointer<ByteVar>(), psstate?.value?.toCPointer<ByteVar>(), pitems?.value?.toCPointer<ByteVar>(), pscripttags?.value?.toCPointer<ByteVar>(), pcitems?.value?.toCPointer<ByteVar>())

public actual fun scriptJustify(psva: COpaquePointer?, piadvance: COpaquePointer?, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptJustify(psva?.value?.toCPointer<ByteVar>(), piadvance?.value?.toCPointer<ByteVar>(), cglyphs, idx, iminkashida, pijustify?.value?.toCPointer<ByteVar>())

public actual fun scriptLayout(cruns: Int, pblevel: COpaquePointer?, pivisualtological: COpaquePointer?, pilogicaltovisual: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptLayout(cruns, pblevel?.value?.toCPointer<ByteVar>(), pivisualtological?.value?.toCPointer<ByteVar>(), pilogicaltovisual?.value?.toCPointer<ByteVar>())

public actual fun scriptPlace(hdc: Hdc, psc: COpaquePointer?, pwglyphs: COpaquePointer?, cglyphs: Int, psva: COpaquePointer?, psa: COpaquePointer?, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptPlace(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), pwglyphs?.value?.toCPointer<ByteVar>(), cglyphs, psva?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), piadvance?.value?.toCPointer<ByteVar>(), pgoffset?.value?.toCPointer<ByteVar>(), pabc?.value?.toCPointer<ByteVar>())

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, cchars: Int, pwglyphs: COpaquePointer?, pglyphprops: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptPlaceOpenType(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, taglangsys, rcrangechars?.value?.toCPointer<ByteVar>(), rprangeproperties?.value?.toCPointer<ByteVar>(), cranges, pwcchars?.value?.toCPointer<ByteVar>(), pwlogclust?.value?.toCPointer<ByteVar>(), pcharprops?.value?.toCPointer<ByteVar>(), cchars, pwglyphs?.value?.toCPointer<ByteVar>(), pglyphprops?.value?.toCPointer<ByteVar>(), cglyphs, piadvance?.value?.toCPointer<ByteVar>(), pgoffset?.value?.toCPointer<ByteVar>(), pabc?.value?.toCPointer<ByteVar>())

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: COpaquePointer?, poutgoffset: COpaquePointer?): Hresult =
    0

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptRecordDigitSubstitution(locale, psds?.value?.toCPointer<ByteVar>())

public actual fun scriptShape(hdc: Hdc, psc: COpaquePointer?, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: COpaquePointer?, pwoutglyphs: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptShape(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), pwcchars?.value?.toCPointer<ByteVar>(), cchars, cmaxglyphs, psa?.value?.toCPointer<ByteVar>(), pwoutglyphs?.value?.toCPointer<ByteVar>(), pwlogclust?.value?.toCPointer<ByteVar>(), psva?.value?.toCPointer<ByteVar>(), pcglyphs?.value?.toCPointer<ByteVar>())

public actual fun scriptShapeOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, pwoutglyphs: COpaquePointer?, poutglyphprops: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptShapeOpenType(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, taglangsys, rcrangechars?.value?.toCPointer<ByteVar>(), rprangeproperties?.value?.toCPointer<ByteVar>(), cranges, pwcchars?.value?.toCPointer<ByteVar>(), cchars, cmaxglyphs, pwlogclust?.value?.toCPointer<ByteVar>(), pcharprops?.value?.toCPointer<ByteVar>(), pwoutglyphs?.value?.toCPointer<ByteVar>(), poutglyphprops?.value?.toCPointer<ByteVar>(), pcglyphs?.value?.toCPointer<ByteVar>())

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: COpaquePointer?, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pidx: COpaquePointer?, ptabdef: COpaquePointer?, pbinclass: COpaquePointer?, pssa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringAnalyse(hdc?.value?.toCPointer<ByteVar>(), pstring?.value?.toCPointer<ByteVar>(), cstring, cglyphs, icharset, dwflags, ireqwidth, pscontrol?.value?.toCPointer<ByteVar>(), psstate?.value?.toCPointer<ByteVar>(), pidx?.value?.toCPointer<ByteVar>(), ptabdef?.value?.toCPointer<ByteVar>(), pbinclass?.value?.toCPointer<ByteVar>(), pssa?.value?.toCPointer<ByteVar>())

public actual fun scriptStringCPtoX(ssa: COpaquePointer?, icp: Int, ftrailing: Bool, px: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringCPtoX(ssa?.value?.toCPointer<ByteVar>(), icp, ftrailing, px?.value?.toCPointer<ByteVar>())

public actual fun scriptStringFree(pssa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringFree(pssa?.value?.toCPointer<ByteVar>())

public actual fun scriptStringGetLogicalWidths(ssa: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringGetLogicalWidths(ssa?.value?.toCPointer<ByteVar>(), pidx?.value?.toCPointer<ByteVar>())

public actual fun scriptStringGetOrder(ssa: COpaquePointer?, puorder: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringGetOrder(ssa?.value?.toCPointer<ByteVar>(), puorder?.value?.toCPointer<ByteVar>())

public actual fun scriptStringOut(ssa: COpaquePointer?, ix: Int, iy: Int, uoptions: EtoOptions, prc: COpaquePointer?, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringOut(ssa?.value?.toCPointer<ByteVar>(), ix, iy, uoptions, prc?.value?.toCPointer<ByteVar>(), iminsel, imaxsel, fdisabled)

public actual fun scriptStringValidate(ssa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringValidate(ssa?.value?.toCPointer<ByteVar>())

public actual fun scriptStringXtoCP(ssa: COpaquePointer?, ix: Int, pich: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringXtoCP(ssa?.value?.toCPointer<ByteVar>(), ix, pich?.value?.toCPointer<ByteVar>(), pitrailing?.value?.toCPointer<ByteVar>())

public actual fun scriptStringPLogAttr(ssa: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringPLogAttr(ssa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun scriptStringPSize(ssa: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringPSize(ssa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun scriptStringPcOutChars(ssa: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptStringPcOutChars(ssa?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptSubstituteSingleGlyph(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), tagscript, taglangsys, tagfeature, lparameter, wglyphid, pwoutglyphid?.value?.toCPointer<ByteVar>())

public actual fun scriptTextOut(hdc: Hdc, psc: COpaquePointer?, x: Int, y: Int, fuoptions: UInt, lprc: COpaquePointer?, psa: COpaquePointer?, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pijustify: COpaquePointer?, pgoffset: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptTextOut(hdc?.value?.toCPointer<ByteVar>(), psc?.value?.toCPointer<ByteVar>(), x, y, fuoptions, lprc?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), pwcreserved?.value?.toCPointer<ByteVar>(), ireserved, pwglyphs?.value?.toCPointer<ByteVar>(), cglyphs, piadvance?.value?.toCPointer<ByteVar>(), pijustify?.value?.toCPointer<ByteVar>(), pgoffset?.value?.toCPointer<ByteVar>())

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, picp: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_scriptXtoCP(ix, cchars, cglyphs, pwlogclust?.value?.toCPointer<ByteVar>(), psva?.value?.toCPointer<ByteVar>(), piadvance?.value?.toCPointer<ByteVar>(), psa?.value?.toCPointer<ByteVar>(), picp?.value?.toCPointer<ByteVar>(), pitrailing?.value?.toCPointer<ByteVar>())

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setCalendarInfoA(locale, calendar, caltype, lpcaldata?.value?.toCPointer<ByteVar>())

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setCalendarInfoW(locale, calendar, caltype, lpcaldata?.value?.toCPointer<ByteVar>())

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setLocaleInfoA(locale, lctype, lplcdata?.value?.toCPointer<ByteVar>())

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setLocaleInfoW(locale, lctype, lplcdata?.value?.toCPointer<ByteVar>())

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setProcessPreferredUILanguages(dwflags, pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pulnumlanguages?.value?.toCPointer<ByteVar>())

public actual fun setThreadLocale(locale: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setThreadLocale(locale)

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setThreadPreferredUILanguages(dwflags, pwszlanguagesbuffer?.value?.toCPointer<ByteVar>(), pulnumlanguages?.value?.toCPointer<ByteVar>())

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: COpaquePointer?, snapshot: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setThreadPreferredUILanguages2(flags, languages?.value?.toCPointer<ByteVar>(), numlanguagesset?.value?.toCPointer<ByteVar>(), snapshot?.value?.toCPointer<ByteVar>())

public actual fun setThreadUILanguage(langid: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setThreadUILanguage(langid)

public actual fun setUserGeoID(geoid: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setUserGeoID(geoid)

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_setUserGeoName(geoname?.value?.toCPointer<ByteVar>())

public actual fun translateCharsetInfo(lpsrc: COpaquePointer?, lpcs: COpaquePointer?, dwflags: TranslateCharsetInfoFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_translateCharsetInfo(lpsrc?.value?.toCPointer<ByteVar>(), lpcs?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun ucnvFromUCallbackEscape(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUCallbackEscape(context?.value?.toCPointer<ByteVar>(), fromuargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, codepoint, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvFromUCallbackSkip(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUCallbackSkip(context?.value?.toCPointer<ByteVar>(), fromuargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, codepoint, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvFromUCallbackStop(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUCallbackStop(context?.value?.toCPointer<ByteVar>(), fromuargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, codepoint, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvFromUCallbackSubstitute(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUCallbackSubstitute(context?.value?.toCPointer<ByteVar>(), fromuargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, codepoint, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvToUCallbackEscape(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUCallbackEscape(context?.value?.toCPointer<ByteVar>(), touargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvToUCallbackSkip(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUCallbackSkip(context?.value?.toCPointer<ByteVar>(), touargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvToUCallbackStop(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUCallbackStop(context?.value?.toCPointer<ByteVar>(), touargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvToUCallbackSubstitute(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUCallbackSubstitute(context?.value?.toCPointer<ByteVar>(), touargs?.value?.toCPointer<ByteVar>(), codeunits?.value?.toCPointer<ByteVar>(), length, reason, err?.value?.toCPointer<ByteVar>())
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_updateCalendarDayOfWeek(lpcaldatetime?.value?.toCPointer<ByteVar>())

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_verifyScripts(dwflags, lplocalescripts?.value?.toCPointer<ByteVar>(), cchlocalescripts, lptestscripts?.value?.toCPointer<ByteVar>(), cchtestscripts)

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_wideCharToMultiByte(codepage, dwflags, lpwidecharstr?.value?.toCPointer<ByteVar>(), cchwidechar, lpmultibytestr?.value?.toCPointer<ByteVar>(), cbmultibyte, lpdefaultchar?.value?.toCPointer<ByteVar>(), lpuseddefaultchar?.value?.toCPointer<ByteVar>())

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcatA(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcatW(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpA(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpW(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpiA(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcmpiW(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpyA(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpyW(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpynA(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>(), imaxlength)?.let { COpaquePointer(it.toLong()) }

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrcpynW(lpstring1?.value?.toCPointer<ByteVar>(), lpstring2?.value?.toCPointer<ByteVar>(), imaxlength)?.let { COpaquePointer(it.toLong()) }

public actual fun lstrlenA(lpstring: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrlenA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_lstrlenW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun uUcharsToChars(us: COpaquePointer?, cs: Pcstr, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uUcharsToChars(us?.value?.toCPointer<ByteVar>(), cs?.value?.toCPointer<ByteVar>(), length)
}

public actual fun uAustrcpy(dst: Pcstr, src: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uAustrcpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uAustrncpy(dst: Pcstr, src: COpaquePointer?, n: Int): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uAustrncpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun uCatclose(catd: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCatclose(catd?.value?.toCPointer<ByteVar>())
}

public actual fun uCatgets(catd: COpaquePointer?, setNum: Int, msgNum: Int, s: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCatgets(catd?.value?.toCPointer<ByteVar>(), setNum, msgNum, s?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCatopen(name?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uCharAge(c: Int, versionarray: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharAge(c, versionarray?.value?.toCPointer<ByteVar>())
}

public actual fun uCharDigitValue(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharDigitValue(c)

public actual fun uCharDirection(c: Int): UCharDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharDirection(c)

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharFromName(namechoice, name?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uCharMirror(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharMirror(c)

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharName(code, namechoice, buffer?.value?.toCPointer<ByteVar>(), bufferlength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uCharType(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharType(c)

public actual fun uCharsToUchars(cs: Pcstr, us: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCharsToUchars(cs?.value?.toCPointer<ByteVar>(), us?.value?.toCPointer<ByteVar>(), length)
}

public actual fun uCleanup() {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCleanup()
}

public actual fun uCountChar32(s: COpaquePointer?, length: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uCountChar32(s?.value?.toCPointer<ByteVar>(), length)

public actual fun uDigit(ch: Int, radix: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uDigit(ch, radix)

public actual fun uEnumCharNames(start: Int, limit: Int, fn: COpaquePointer?, context: COpaquePointer?, namechoice: UCharNameChoice, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uEnumCharNames(start, limit, fn?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), namechoice, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun uEnumCharTypes(enumrange: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uEnumCharTypes(enumrange?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uErrorName(code)?.let { COpaquePointer(it.toLong()) }

public actual fun uFoldCase(c: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uFoldCase(c, options)

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uForDigit(digit, radix)

public actual fun uFormatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uFormatMessage(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uFormatMessageWithError(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, result?.value?.toCPointer<ByteVar>(), resultlength, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uGetBidiPairedBracket(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetBidiPairedBracket(c)

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetBinaryPropertySet(property, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uGetCombiningClass(c: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetCombiningClass(c)

public actual fun uGetDataVersion(dataversionfillin: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetDataVersion(dataversionfillin?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uGetFcNfkcClosure(c: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetFcNfkcClosure(c, dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetIntPropertyMap(property, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetIntPropertyMaxValue(which)

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetIntPropertyMinValue(which)

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetIntPropertyValue(c, which)

public actual fun uGetNumericValue(c: Int): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetNumericValue(c)

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetPropertyEnum(alias?.value?.toCPointer<ByteVar>())

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetPropertyName(property, namechoice)?.let { COpaquePointer(it.toLong()) }

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetPropertyValueEnum(property, alias?.value?.toCPointer<ByteVar>())

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetPropertyValueName(property, value, namechoice)?.let { COpaquePointer(it.toLong()) }

public actual fun uGetUnicodeVersion(versionarray: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetUnicodeVersion(versionarray?.value?.toCPointer<ByteVar>())
}

public actual fun uGetVersion(versionarray: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uGetVersion(versionarray?.value?.toCPointer<ByteVar>())
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uHasBinaryProperty(c, which)

public actual fun uInit(status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uInit(status?.value?.toCPointer<ByteVar>())
}

public actual fun uIsIdignorable(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsIdignorable(c)

public actual fun uIsIdpart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsIdpart(c)

public actual fun uIsIdstart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsIdstart(c)

public actual fun uIsIsocontrol(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsIsocontrol(c)

public actual fun uIsJavaIdpart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsJavaIdpart(c)

public actual fun uIsJavaIdstart(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsJavaIdstart(c)

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsJavaSpaceChar(c)

public actual fun uIsMirrored(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsMirrored(c)

public actual fun uIsUalphabetic(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsUalphabetic(c)

public actual fun uIsUlowercase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsUlowercase(c)

public actual fun uIsUuppercase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsUuppercase(c)

public actual fun uIsUwhiteSpace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsUwhiteSpace(c)

public actual fun uIsWhitespace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsWhitespace(c)

public actual fun uIsalnum(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsalnum(c)

public actual fun uIsalpha(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsalpha(c)

public actual fun uIsbase(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsbase(c)

public actual fun uIsblank(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsblank(c)

public actual fun uIscntrl(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIscntrl(c)

public actual fun uIsdefined(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsdefined(c)

public actual fun uIsdigit(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsdigit(c)

public actual fun uIsgraph(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsgraph(c)

public actual fun uIslower(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIslower(c)

public actual fun uIsprint(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsprint(c)

public actual fun uIspunct(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIspunct(c)

public actual fun uIsspace(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsspace(c)

public actual fun uIstitle(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIstitle(c)

public actual fun uIsupper(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsupper(c)

public actual fun uIsxdigit(c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uIsxdigit(c)

public actual fun uMemcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, length: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemcasecmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), length, options)

public actual fun uMemchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemchr(s?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemchr32(s?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemcmp(buf1: COpaquePointer?, buf2: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemcmp(buf1?.value?.toCPointer<ByteVar>(), buf2?.value?.toCPointer<ByteVar>(), count)

public actual fun uMemcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, count: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemcmpCodePointOrder(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), count)

public actual fun uMemcpy(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemmove(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemrchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemrchr(s?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemrchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemrchr32(s?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }

public actual fun uMemset(dest: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uMemset(dest?.value?.toCPointer<ByteVar>(), c, count)?.let { COpaquePointer(it.toLong()) }

public actual fun uParseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, status: COpaquePointer?, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uParseMessage(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, source?.value?.toCPointer<ByteVar>(), sourcelength, status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uParseMessageWithError(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, source?.value?.toCPointer<ByteVar>(), sourcelength, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uSetMemoryFunctions(context: COpaquePointer?, a: COpaquePointer?, r: COpaquePointer?, f: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uSetMemoryFunctions(context?.value?.toCPointer<ByteVar>(), a?.value?.toCPointer<ByteVar>(), r?.value?.toCPointer<ByteVar>(), f?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uShapeArabic(source: COpaquePointer?, sourcelength: Int, dest: COpaquePointer?, destsize: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uShapeArabic(source?.value?.toCPointer<ByteVar>(), sourcelength, dest?.value?.toCPointer<ByteVar>(), destsize, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrCaseCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrCaseCompare(s1?.value?.toCPointer<ByteVar>(), length1, s2?.value?.toCPointer<ByteVar>(), length2, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, codepointorder: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrCompare(s1?.value?.toCPointer<ByteVar>(), length1, s2?.value?.toCPointer<ByteVar>(), length2, codepointorder)

public actual fun uStrCompareIter(iter1: COpaquePointer?, iter2: COpaquePointer?, codepointorder: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrCompareIter(iter1?.value?.toCPointer<ByteVar>(), iter2?.value?.toCPointer<ByteVar>(), codepointorder)

public actual fun uStrFindFirst(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFindFirst(s?.value?.toCPointer<ByteVar>(), length, substring?.value?.toCPointer<ByteVar>(), sublength)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFindLast(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFindLast(s?.value?.toCPointer<ByteVar>(), length, substring?.value?.toCPointer<ByteVar>(), sublength)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFoldCase(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFoldCase(dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromJavaModifiedUtf8WithSub(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromUtf32(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromUtf32WithSub(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromUtf8(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromUtf8(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromUtf8Lenient(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromUtf8Lenient(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromUtf8WithSub(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrFromWcs(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcwstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrFromWcs(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrHasMoreChar32Than(s: COpaquePointer?, length: Int, number: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrHasMoreChar32Than(s?.value?.toCPointer<ByteVar>(), length, number)

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToJavaModifiedUtf8(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrToLower(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToLower(dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, locale?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrToTitle(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, titleiter: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToTitle(dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, titleiter?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrToUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToUtf32(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrToUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToUtf32WithSub(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToUtf8(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToUtf8WithSub(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, subchar, pnumsubstitutions?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrToUpper(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToUpper(dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, locale?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrToWcs(dest?.value?.toCPointer<ByteVar>(), destcapacity, pdestlength?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcasecmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), options)

public actual fun uStrcat(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcat(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrchr(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrchr32(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrcmp(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>())

public actual fun uStrcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcmpCodePointOrder(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>())

public actual fun uStrcpy(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrcspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrcspn(string?.value?.toCPointer<ByteVar>(), matchset?.value?.toCPointer<ByteVar>())

public actual fun uStrlen(s: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrlen(s?.value?.toCPointer<ByteVar>())

public actual fun uStrncasecmp(s1: COpaquePointer?, s2: COpaquePointer?, n: Int, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrncasecmp(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), n, options)

public actual fun uStrncat(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrncat(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrncmp(ucs1: COpaquePointer?, ucs2: COpaquePointer?, n: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrncmp(ucs1?.value?.toCPointer<ByteVar>(), ucs2?.value?.toCPointer<ByteVar>(), n)

public actual fun uStrncmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, n: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrncmpCodePointOrder(s1?.value?.toCPointer<ByteVar>(), s2?.value?.toCPointer<ByteVar>(), n)

public actual fun uStrncpy(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrncpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrpbrk(string: COpaquePointer?, matchset: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrpbrk(string?.value?.toCPointer<ByteVar>(), matchset?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrrchr(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrrchr32(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun uStrrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrrstr(s?.value?.toCPointer<ByteVar>(), substring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrspn(string?.value?.toCPointer<ByteVar>(), matchset?.value?.toCPointer<ByteVar>())

public actual fun uStrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrstr(s?.value?.toCPointer<ByteVar>(), substring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uStrtokR(src: COpaquePointer?, delim: COpaquePointer?, savestate: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uStrtokR(src?.value?.toCPointer<ByteVar>(), delim?.value?.toCPointer<ByteVar>(), savestate?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uTolower(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uTolower(c)

public actual fun uTotitle(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uTotitle(c)

public actual fun uToupper(c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uToupper(c)

public actual fun uUastrcpy(dst: COpaquePointer?, src: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uUastrcpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uUastrncpy(dst: COpaquePointer?, src: Pcstr, n: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uUastrncpy(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun uUnescape(src: Pcstr, dest: COpaquePointer?, destcapacity: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uUnescape(src?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity)

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: COpaquePointer?, length: Int, context: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uUnescapeAt(0L.toCPointer<ByteVar>(), offset?.value?.toCPointer<ByteVar>(), length, context?.value?.toCPointer<ByteVar>())

public actual fun uVersionFromString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVersionFromString(versionarray?.value?.toCPointer<ByteVar>(), versionstring?.value?.toCPointer<ByteVar>())
}

public actual fun uVersionFromUstring(versionarray: COpaquePointer?, versionstring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVersionFromUstring(versionarray?.value?.toCPointer<ByteVar>(), versionstring?.value?.toCPointer<ByteVar>())
}

public actual fun uVersionToString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVersionToString(versionarray?.value?.toCPointer<ByteVar>(), versionstring?.value?.toCPointer<ByteVar>())
}

public actual fun uVformatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVformatMessage(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, result?.value?.toCPointer<ByteVar>(), resultlength, ap?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVformatMessageWithError(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, result?.value?.toCPointer<ByteVar>(), resultlength, parseerror?.value?.toCPointer<ByteVar>(), ap?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uVparseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVparseMessage(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, source?.value?.toCPointer<ByteVar>(), sourcelength, ap?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, parseerror: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uVparseMessageWithError(locale?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, source?.value?.toCPointer<ByteVar>(), sourcelength, ap?.value?.toCPointer<ByteVar>(), parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiClose(pbidi: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiClose(pbidi?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiCountParagraphs(pbidi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiCountParagraphs(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiCountRuns(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiCountRuns(pbidi?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetBaseDirection(text: COpaquePointer?, length: Int): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetBaseDirection(text?.value?.toCPointer<ByteVar>(), length)

public actual fun ubidiGetClassCallback(pbidi: COpaquePointer?, fn: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetClassCallback(pbidi?.value?.toCPointer<ByteVar>(), fn?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiGetCustomizedClass(pbidi: COpaquePointer?, c: Int): UCharDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetCustomizedClass(pbidi?.value?.toCPointer<ByteVar>(), c)

public actual fun ubidiGetDirection(pbidi: COpaquePointer?): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetDirection(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetLength(pbidi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLength(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetLevelAt(pbidi: COpaquePointer?, charindex: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLevelAt(pbidi?.value?.toCPointer<ByteVar>(), charindex)

public actual fun ubidiGetLevels(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLevels(pbidi?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubidiGetLogicalIndex(pbidi: COpaquePointer?, visualindex: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLogicalIndex(pbidi?.value?.toCPointer<ByteVar>(), visualindex, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetLogicalMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLogicalMap(pbidi?.value?.toCPointer<ByteVar>(), indexmap?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiGetLogicalRun(pbidi: COpaquePointer?, logicalposition: Int, plogicallimit: COpaquePointer?, plevel: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetLogicalRun(pbidi?.value?.toCPointer<ByteVar>(), logicalposition, plogicallimit?.value?.toCPointer<ByteVar>(), plevel?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiGetParaLevel(pbidi: COpaquePointer?): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetParaLevel(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetParagraph(pbidi: COpaquePointer?, charindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetParagraph(pbidi?.value?.toCPointer<ByteVar>(), charindex, pparastart?.value?.toCPointer<ByteVar>(), pparalimit?.value?.toCPointer<ByteVar>(), pparalevel?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetParagraphByIndex(pbidi: COpaquePointer?, paraindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetParagraphByIndex(pbidi?.value?.toCPointer<ByteVar>(), paraindex, pparastart?.value?.toCPointer<ByteVar>(), pparalimit?.value?.toCPointer<ByteVar>(), pparalevel?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiGetProcessedLength(pbidi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetProcessedLength(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetReorderingMode(pbidi: COpaquePointer?): UBiDiReorderingMode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetReorderingMode(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetReorderingOptions(pbidi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetReorderingOptions(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetResultLength(pbidi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetResultLength(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetText(pbidi: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetText(pbidi?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubidiGetVisualIndex(pbidi: COpaquePointer?, logicalindex: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetVisualIndex(pbidi?.value?.toCPointer<ByteVar>(), logicalindex, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubidiGetVisualMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetVisualMap(pbidi?.value?.toCPointer<ByteVar>(), indexmap?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiGetVisualRun(pbidi: COpaquePointer?, runindex: Int, plogicalstart: COpaquePointer?, plength: COpaquePointer?): UBiDiDirection =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiGetVisualRun(pbidi?.value?.toCPointer<ByteVar>(), runindex, plogicalstart?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>())

public actual fun ubidiInvertMap(srcmap: COpaquePointer?, destmap: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiInvertMap(srcmap?.value?.toCPointer<ByteVar>(), destmap?.value?.toCPointer<ByteVar>(), length)
}

public actual fun ubidiIsInverse(pbidi: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiIsInverse(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiIsOrderParagraphsLtr(pbidi: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiIsOrderParagraphsLtr(pbidi?.value?.toCPointer<ByteVar>())

public actual fun ubidiOpen(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiOpen()?.let { COpaquePointer(it.toLong()) }

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiOpenSized(maxlength, maxruncount, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubidiOrderParagraphsLtr(pbidi: COpaquePointer?, orderparagraphsltr: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiOrderParagraphsLtr(pbidi?.value?.toCPointer<ByteVar>(), orderparagraphsltr)
}

public actual fun ubidiReorderLogical(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiReorderLogical(levels?.value?.toCPointer<ByteVar>(), length, indexmap?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiReorderVisual(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiReorderVisual(levels?.value?.toCPointer<ByteVar>(), length, indexmap?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiSetClassCallback(pbidi: COpaquePointer?, newfn: UBiDiClassCallback, newcontext: COpaquePointer?, oldfn: COpaquePointer?, oldcontext: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetClassCallback(pbidi?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), newcontext?.value?.toCPointer<ByteVar>(), oldfn?.value?.toCPointer<ByteVar>(), oldcontext?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiSetContext(pbidi: COpaquePointer?, prologue: COpaquePointer?, prolength: Int, epilogue: COpaquePointer?, epilength: Int, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetContext(pbidi?.value?.toCPointer<ByteVar>(), prologue?.value?.toCPointer<ByteVar>(), prolength, epilogue?.value?.toCPointer<ByteVar>(), epilength, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiSetInverse(pbidi: COpaquePointer?, isinverse: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetInverse(pbidi?.value?.toCPointer<ByteVar>(), isinverse)
}

public actual fun ubidiSetLine(pparabidi: COpaquePointer?, start: Int, limit: Int, plinebidi: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetLine(pparabidi?.value?.toCPointer<ByteVar>(), start, limit, plinebidi?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiSetPara(pbidi: COpaquePointer?, text: COpaquePointer?, length: Int, paralevel: UByte, embeddinglevels: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetPara(pbidi?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), length, paralevel, embeddinglevels?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ubidiSetReorderingMode(pbidi: COpaquePointer?, reorderingmode: UBiDiReorderingMode) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetReorderingMode(pbidi?.value?.toCPointer<ByteVar>(), reorderingmode)
}

public actual fun ubidiSetReorderingOptions(pbidi: COpaquePointer?, reorderingoptions: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiSetReorderingOptions(pbidi?.value?.toCPointer<ByteVar>(), reorderingoptions)
}

public actual fun ubidiWriteReordered(pbidi: COpaquePointer?, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiWriteReordered(pbidi?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destsize, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubidiWriteReverse(src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubidiWriteReverse(src?.value?.toCPointer<ByteVar>(), srclength, dest?.value?.toCPointer<ByteVar>(), destsize, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ubiditransformClose(pbiditransform: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransformClose(pbiditransform?.value?.toCPointer<ByteVar>())
}

public actual fun ubiditransformOpen(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransformOpen(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubiditransformTransform(pbiditransform: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubiditransformTransform(pbiditransform?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, dest?.value?.toCPointer<ByteVar>(), destsize, inparalevel, inorder, outparalevel, outorder, domirroring, shapingoptions, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ublockGetCode(c: Int): UBlockCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ublockGetCode(c)

public actual fun ubrkClose(bi: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkClose(bi?.value?.toCPointer<ByteVar>())
}

public actual fun ubrkCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkCountAvailable()

public actual fun ubrkCurrent(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkCurrent(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkFirst(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkFirst(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkFollowing(bi: COpaquePointer?, offset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkFollowing(bi?.value?.toCPointer<ByteVar>(), offset)

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkGetAvailable(index)?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkGetBinaryRules(bi: COpaquePointer?, binaryrules: COpaquePointer?, rulescapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkGetBinaryRules(bi?.value?.toCPointer<ByteVar>(), binaryrules?.value?.toCPointer<ByteVar>(), rulescapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ubrkGetLocaleByType(bi: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkGetLocaleByType(bi?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkGetRuleStatus(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkGetRuleStatus(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkGetRuleStatusVec(bi: COpaquePointer?, fillinvec: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkGetRuleStatusVec(bi?.value?.toCPointer<ByteVar>(), fillinvec?.value?.toCPointer<ByteVar>(), capacity, status?.value?.toCPointer<ByteVar>())

public actual fun ubrkIsBoundary(bi: COpaquePointer?, offset: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkIsBoundary(bi?.value?.toCPointer<ByteVar>(), offset)

public actual fun ubrkLast(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkLast(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkNext(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkNext(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkOpen(type, locale?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkOpenBinaryRules(binaryrules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkOpenBinaryRules(binaryrules?.value?.toCPointer<ByteVar>(), ruleslength, text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkOpenRules(rules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkOpenRules(rules?.value?.toCPointer<ByteVar>(), ruleslength, text?.value?.toCPointer<ByteVar>(), textlength, parseerr?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkPreceding(bi: COpaquePointer?, offset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkPreceding(bi?.value?.toCPointer<ByteVar>(), offset)

public actual fun ubrkPrevious(bi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkPrevious(bi?.value?.toCPointer<ByteVar>())

public actual fun ubrkRefreshUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkRefreshUtext(bi?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ubrkSafeClone(bi: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkSafeClone(bi?.value?.toCPointer<ByteVar>(), stackbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ubrkSetText(bi: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkSetText(bi?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())
}

public actual fun ubrkSetUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ubrkSetUtext(bi?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalAdd(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalAdd(cal?.value?.toCPointer<ByteVar>(), field, amount, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalClear(calendar: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalClear(calendar?.value?.toCPointer<ByteVar>())
}

public actual fun ucalClearField(cal: COpaquePointer?, field: UCalendarDateFields) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalClearField(cal?.value?.toCPointer<ByteVar>(), field)
}

public actual fun ucalClone(cal: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalClone(cal?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalClose(cal: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalClose(cal?.value?.toCPointer<ByteVar>())
}

public actual fun ucalCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalCountAvailable()

public actual fun ucalEquivalentTo(cal1: COpaquePointer?, cal2: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalEquivalentTo(cal1?.value?.toCPointer<ByteVar>(), cal2?.value?.toCPointer<ByteVar>())

public actual fun ucalGet(cal: COpaquePointer?, field: UCalendarDateFields, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGet(cal?.value?.toCPointer<ByteVar>(), field, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetAttribute(cal?.value?.toCPointer<ByteVar>(), attr)

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetAvailable(localeindex)?.let { COpaquePointer(it.toLong()) }

public actual fun ucalGetCanonicalTimeZoneId(id: COpaquePointer?, len: Int, result: COpaquePointer?, resultcapacity: Int, issystemid: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetCanonicalTimeZoneId(id?.value?.toCPointer<ByteVar>(), len, result?.value?.toCPointer<ByteVar>(), resultcapacity, issystemid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetDstsavings(zoneid: COpaquePointer?, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetDstsavings(zoneid?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucalGetDayOfWeekType(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): UCalendarWeekdayType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetDayOfWeekType(cal?.value?.toCPointer<ByteVar>(), dayofweek, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetDefaultTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetDefaultTimeZone(result?.value?.toCPointer<ByteVar>(), resultcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun ucalGetFieldDifference(cal: COpaquePointer?, target: Double, field: UCalendarDateFields, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetFieldDifference(cal?.value?.toCPointer<ByteVar>(), target, field, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetGregorianChange(cal: COpaquePointer?, perrorcode: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetGregorianChange(cal?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucalGetHostTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetHostTimeZone(result?.value?.toCPointer<ByteVar>(), resultcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetKeywordValuesForLocale(key?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), commonlyused, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalGetLimit(cal: COpaquePointer?, field: UCalendarDateFields, type: UCalendarLimitType, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetLimit(cal?.value?.toCPointer<ByteVar>(), field, type, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetLocaleByType(cal: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetLocaleByType(cal?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalGetMillis(cal: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetMillis(cal?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetNow(): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetNow()

public actual fun ucalGetTzdataVersion(status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetTzdataVersion(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalGetTimeZoneDisplayName(cal: COpaquePointer?, type: UCalendarDisplayNameType, locale: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetTimeZoneDisplayName(cal?.value?.toCPointer<ByteVar>(), type, locale?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetTimeZoneId(cal: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetTimeZoneId(cal?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetTimeZoneIdforWindowsId(winid: COpaquePointer?, len: Int, region: Pcstr, id: COpaquePointer?, idcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetTimeZoneIdforWindowsId(winid?.value?.toCPointer<ByteVar>(), len, region?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), idcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetTimeZoneTransitionDate(cal: COpaquePointer?, type: UTimeZoneTransitionType, transition: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetTimeZoneTransitionDate(cal?.value?.toCPointer<ByteVar>(), type, transition?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetType(cal: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetType(cal?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalGetWeekendTransition(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetWeekendTransition(cal?.value?.toCPointer<ByteVar>(), dayofweek, status?.value?.toCPointer<ByteVar>())

public actual fun ucalGetWindowsTimeZoneId(id: COpaquePointer?, len: Int, winid: COpaquePointer?, winidcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalGetWindowsTimeZoneId(id?.value?.toCPointer<ByteVar>(), len, winid?.value?.toCPointer<ByteVar>(), winidcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ucalInDaylightTime(cal: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalInDaylightTime(cal?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucalIsSet(cal: COpaquePointer?, field: UCalendarDateFields): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalIsSet(cal?.value?.toCPointer<ByteVar>(), field)

public actual fun ucalIsWeekend(cal: COpaquePointer?, date: Double, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalIsWeekend(cal?.value?.toCPointer<ByteVar>(), date, status?.value?.toCPointer<ByteVar>())

public actual fun ucalOpen(zoneid: COpaquePointer?, len: Int, locale: Pcstr, type: UCalendarType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalOpen(zoneid?.value?.toCPointer<ByteVar>(), len, locale?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalOpenCountryTimeZones(country?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalOpenTimeZoneIdenumeration(zonetype, region?.value?.toCPointer<ByteVar>(), rawoffset?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalOpenTimeZones(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalOpenTimeZones(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucalRoll(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalRoll(cal?.value?.toCPointer<ByteVar>(), field, amount, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSet(cal: COpaquePointer?, field: UCalendarDateFields, value: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSet(cal?.value?.toCPointer<ByteVar>(), field, value)
}

public actual fun ucalSetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute, newvalue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetAttribute(cal?.value?.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun ucalSetDate(cal: COpaquePointer?, year: Int, month: Int, date: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetDate(cal?.value?.toCPointer<ByteVar>(), year, month, date, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSetDateTime(cal: COpaquePointer?, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetDateTime(cal?.value?.toCPointer<ByteVar>(), year, month, date, hour, minute, second, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSetDefaultTimeZone(zoneid: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetDefaultTimeZone(zoneid?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSetGregorianChange(cal: COpaquePointer?, date: Double, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetGregorianChange(cal?.value?.toCPointer<ByteVar>(), date, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSetMillis(cal: COpaquePointer?, datetime: Double, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetMillis(cal?.value?.toCPointer<ByteVar>(), datetime, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucalSetTimeZone(cal: COpaquePointer?, zoneid: COpaquePointer?, len: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucalSetTimeZone(cal?.value?.toCPointer<ByteVar>(), zoneid?.value?.toCPointer<ByteVar>(), len, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucasemapClose(csm: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapClose(csm?.value?.toCPointer<ByteVar>())
}

public actual fun ucasemapGetBreakIterator(csm: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapGetBreakIterator(csm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucasemapGetLocale(csm: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapGetLocale(csm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucasemapGetOptions(csm: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapGetOptions(csm?.value?.toCPointer<ByteVar>())

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapOpen(locale?.value?.toCPointer<ByteVar>(), options, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucasemapSetBreakIterator(csm: COpaquePointer?, itertoadopt: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapSetBreakIterator(csm?.value?.toCPointer<ByteVar>(), itertoadopt?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucasemapSetLocale(csm: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapSetLocale(csm?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucasemapSetOptions(csm: COpaquePointer?, options: UInt, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapSetOptions(csm?.value?.toCPointer<ByteVar>(), options, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucasemapToTitle(csm: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapToTitle(csm?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucasemapUtf8FoldCase(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapUtf8FoldCase(csm?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucasemapUtf8ToLower(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapUtf8ToLower(csm?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucasemapUtf8ToTitle(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapUtf8ToTitle(csm?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucasemapUtf8ToUpper(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucasemapUtf8ToUpper(csm?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucfposClose(ucfpos: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposClose(ucfpos?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposConstrainCategory(ucfpos: COpaquePointer?, category: Int, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposConstrainCategory(ucfpos?.value?.toCPointer<ByteVar>(), category, ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposConstrainField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposConstrainField(ucfpos?.value?.toCPointer<ByteVar>(), category, field, ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposGetCategory(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposGetCategory(ucfpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucfposGetField(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposGetField(ucfpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucfposGetIndexes(ucfpos: COpaquePointer?, pstart: COpaquePointer?, plimit: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposGetIndexes(ucfpos?.value?.toCPointer<ByteVar>(), pstart?.value?.toCPointer<ByteVar>(), plimit?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposGetInt64IterationContext(ucfpos: COpaquePointer?, ec: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposGetInt64IterationContext(ucfpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucfposMatchesField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposMatchesField(ucfpos?.value?.toCPointer<ByteVar>(), category, field, ec?.value?.toCPointer<ByteVar>())

public actual fun ucfposOpen(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposOpen(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucfposReset(ucfpos: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposReset(ucfpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposSetInt64IterationContext(ucfpos: COpaquePointer?, context: Long, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposSetInt64IterationContext(ucfpos?.value?.toCPointer<ByteVar>(), context, ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucfposSetState(ucfpos: COpaquePointer?, category: Int, field: Int, start: Int, limit: Int, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucfposSetState(ucfpos?.value?.toCPointer<ByteVar>(), category, field, start, limit, ec?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCbFromUwriteBytes(args: COpaquePointer?, source: Pcstr, length: Int, offsetindex: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCbFromUwriteBytes(args?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), length, offsetindex, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCbFromUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCbFromUwriteSub(args?.value?.toCPointer<ByteVar>(), offsetindex, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCbFromUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCbFromUwriteUchars(args?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelimit?.value?.toCPointer<ByteVar>(), offsetindex, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCbToUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCbToUwriteSub(args?.value?.toCPointer<ByteVar>(), offsetindex, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCbToUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, length: Int, offsetindex: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCbToUwriteUchars(args?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), length, offsetindex, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvClose(converter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvClose(converter?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCompareNames(name1?.value?.toCPointer<ByteVar>(), name2?.value?.toCPointer<ByteVar>())

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvConvert(toconvertername?.value?.toCPointer<ByteVar>(), fromconvertername?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), targetcapacity, source?.value?.toCPointer<ByteVar>(), sourcelength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvConvertEx(targetcnv: COpaquePointer?, sourcecnv: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: Pcstr, pivotstart: COpaquePointer?, pivotsource: COpaquePointer?, pivottarget: COpaquePointer?, pivotlimit: COpaquePointer?, reset: Byte, flush: Byte, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvConvertEx(targetcnv?.value?.toCPointer<ByteVar>(), sourcecnv?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), targetlimit?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelimit?.value?.toCPointer<ByteVar>(), pivotstart?.value?.toCPointer<ByteVar>(), pivotsource?.value?.toCPointer<ByteVar>(), pivottarget?.value?.toCPointer<ByteVar>(), pivotlimit?.value?.toCPointer<ByteVar>(), reset, flush, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCountAliases(alias?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCountAvailable()

public actual fun ucnvCountStandards(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvCountStandards()

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: COpaquePointer?, perrorcode: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvDetectUnicodeSignature(source?.value?.toCPointer<ByteVar>(), sourcelength, signaturelength?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvFixFileSeparator(cnv: COpaquePointer?, source: COpaquePointer?, sourcelen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFixFileSeparator(cnv?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelen)
}

public actual fun ucnvFlushCache(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFlushCache()

public actual fun ucnvFromAlgorithmic(cnv: COpaquePointer?, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromAlgorithmic(cnv?.value?.toCPointer<ByteVar>(), algorithmictype, target?.value?.toCPointer<ByteVar>(), targetcapacity, source?.value?.toCPointer<ByteVar>(), sourcelength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvFromUchars(cnv: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUchars(cnv?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvFromUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUcountPending(cnv?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucnvFromUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvFromUnicode(converter?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), targetlimit?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelimit?.value?.toCPointer<ByteVar>(), offsets?.value?.toCPointer<ByteVar>(), flush, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetAlias(alias?.value?.toCPointer<ByteVar>(), n, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetAliases(alias: Pcstr, aliases: COpaquePointer?, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetAliases(alias?.value?.toCPointer<ByteVar>(), aliases?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetAvailableName(n)?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetCcsid(converter: COpaquePointer?, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetCcsid(converter?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetCanonicalName(alias?.value?.toCPointer<ByteVar>(), standard?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetDefaultName(): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetDefaultName()?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetDisplayName(converter: COpaquePointer?, displaylocale: Pcstr, displayname: COpaquePointer?, displaynamecapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetDisplayName(converter?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), displayname?.value?.toCPointer<ByteVar>(), displaynamecapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetFromUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetFromUcallBack(converter?.value?.toCPointer<ByteVar>(), action?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetInvalidChars(converter: COpaquePointer?, errbytes: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetInvalidChars(converter?.value?.toCPointer<ByteVar>(), errbytes?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetInvalidUchars(converter: COpaquePointer?, erruchars: COpaquePointer?, len: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetInvalidUchars(converter?.value?.toCPointer<ByteVar>(), erruchars?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetMaxCharSize(converter: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetMaxCharSize(converter?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetMinCharSize(converter: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetMinCharSize(converter?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetName(converter: COpaquePointer?, err: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetName(converter?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetNextUchar(converter: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetNextUchar(converter?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelimit?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetPlatform(converter: COpaquePointer?, err: COpaquePointer?): UConverterPlatform =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetPlatform(converter?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetStandard(n: UShort, perrorcode: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetStandard(n, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetStandardName(name?.value?.toCPointer<ByteVar>(), standard?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvGetStarters(converter: COpaquePointer?, starters: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetStarters(converter?.value?.toCPointer<ByteVar>(), starters?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetSubstChars(converter?.value?.toCPointer<ByteVar>(), subchars?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetToUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetToUcallBack(converter?.value?.toCPointer<ByteVar>(), action?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvGetType(converter: COpaquePointer?): UConverterType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetType(converter?.value?.toCPointer<ByteVar>())

public actual fun ucnvGetUnicodeSet(cnv: COpaquePointer?, setfillin: COpaquePointer?, whichset: UConverterUnicodeSet, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvGetUnicodeSet(cnv?.value?.toCPointer<ByteVar>(), setfillin?.value?.toCPointer<ByteVar>(), whichset, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvIsAmbiguous(cnv: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvIsAmbiguous(cnv?.value?.toCPointer<ByteVar>())

public actual fun ucnvIsFixedWidth(cnv: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvIsFixedWidth(cnv?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucnvOpen(convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpen(convertername?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvOpenAllNames(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpenAllNames(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpenCcsid(codepage, platform, err?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpenPackage(packagename?.value?.toCPointer<ByteVar>(), convertername?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpenStandardNames(convname?.value?.toCPointer<ByteVar>(), standard?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvOpenU(name: COpaquePointer?, err: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvOpenU(name?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvReset(converter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvReset(converter?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvResetFromUnicode(converter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvResetFromUnicode(converter?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvResetToUnicode(converter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvResetToUnicode(converter?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvSafeClone(cnv: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSafeClone(cnv?.value?.toCPointer<ByteVar>(), stackbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvSetDefaultName(name: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetDefaultName(name?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvSetFallback(cnv: COpaquePointer?, usesfallback: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetFallback(cnv?.value?.toCPointer<ByteVar>(), usesfallback)
}

public actual fun ucnvSetFromUcallBack(converter: COpaquePointer?, newaction: UConverterFromUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetFromUcallBack(converter?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), newcontext?.value?.toCPointer<ByteVar>(), oldaction?.value?.toCPointer<ByteVar>(), oldcontext?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvSetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: Byte, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetSubstChars(converter?.value?.toCPointer<ByteVar>(), subchars?.value?.toCPointer<ByteVar>(), len, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvSetSubstString(cnv: COpaquePointer?, s: COpaquePointer?, length: Int, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetSubstString(cnv?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvSetToUcallBack(converter: COpaquePointer?, newaction: UConverterToUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvSetToUcallBack(converter?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), newcontext?.value?.toCPointer<ByteVar>(), oldaction?.value?.toCPointer<ByteVar>(), oldcontext?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: COpaquePointer?, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToAlgorithmic(algorithmictype, cnv?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), targetcapacity, source?.value?.toCPointer<ByteVar>(), sourcelength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvToUchars(cnv: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUchars(cnv?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, src?.value?.toCPointer<ByteVar>(), srclength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucnvToUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUcountPending(cnv?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucnvToUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvToUnicode(converter?.value?.toCPointer<ByteVar>(), target?.value?.toCPointer<ByteVar>(), targetlimit?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelimit?.value?.toCPointer<ByteVar>(), offsets?.value?.toCPointer<ByteVar>(), flush, err?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvUsesFallback(cnv: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvUsesFallback(cnv?.value?.toCPointer<ByteVar>())

public actual fun ucnvselClose(sel: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselClose(sel?.value?.toCPointer<ByteVar>())
}

public actual fun ucnvselOpen(converterlist: COpaquePointer?, converterlistsize: Int, excludedcodepoints: COpaquePointer?, whichset: UConverterUnicodeSet, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselOpen(converterlist?.value?.toCPointer<ByteVar>(), converterlistsize, excludedcodepoints?.value?.toCPointer<ByteVar>(), whichset, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvselOpenFromSerialized(buffer: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselOpenFromSerialized(buffer?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvselSelectForString(sel: COpaquePointer?, s: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselSelectForString(sel?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvselSelectForUtf8(sel: COpaquePointer?, s: Pcstr, length: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselSelectForUtf8(sel?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucnvselSerialize(sel: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucnvselSerialize(sel?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffercapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ucolCloneBinary(coll: COpaquePointer?, buffer: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolCloneBinary(coll?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), capacity, status?.value?.toCPointer<ByteVar>())

public actual fun ucolClose(coll: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolClose(coll?.value?.toCPointer<ByteVar>())
}

public actual fun ucolCloseElements(elems: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolCloseElements(elems?.value?.toCPointer<ByteVar>())
}

public actual fun ucolCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolCountAvailable()

public actual fun ucolEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolEqual(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, target?.value?.toCPointer<ByteVar>(), targetlength)

public actual fun ucolGetAttribute(coll: COpaquePointer?, attr: UColAttribute, status: COpaquePointer?): UColAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetAttribute(coll?.value?.toCPointer<ByteVar>(), attr, status?.value?.toCPointer<ByteVar>())

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetAvailable(localeindex)?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetBound(source: COpaquePointer?, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetBound(source?.value?.toCPointer<ByteVar>(), sourcelength, boundtype, nooflevels, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun ucolGetContractionsAndExpansions(coll: COpaquePointer?, contractions: COpaquePointer?, expansions: COpaquePointer?, addprefixes: Byte, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetContractionsAndExpansions(coll?.value?.toCPointer<ByteVar>(), contractions?.value?.toCPointer<ByteVar>(), expansions?.value?.toCPointer<ByteVar>(), addprefixes, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetDisplayName(objloc?.value?.toCPointer<ByteVar>(), disploc?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetEquivalentReorderCodes(reordercode, dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetFunctionalEquivalent(result?.value?.toCPointer<ByteVar>(), resultcapacity, keyword?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), isavailable?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetKeywordValues(keyword?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetKeywordValuesForLocale(key?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), commonlyused, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetKeywords(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetKeywords(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetLocaleByType(coll: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetLocaleByType(coll?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetMaxExpansion(elems: COpaquePointer?, order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetMaxExpansion(elems?.value?.toCPointer<ByteVar>(), order)

public actual fun ucolGetMaxVariable(coll: COpaquePointer?): UColReorderCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetMaxVariable(coll?.value?.toCPointer<ByteVar>())

public actual fun ucolGetOffset(elems: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetOffset(elems?.value?.toCPointer<ByteVar>())

public actual fun ucolGetReorderCodes(coll: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetReorderCodes(coll?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucolGetRules(coll: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetRules(coll?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetRulesEx(coll: COpaquePointer?, delta: UColRuleOption, buffer: COpaquePointer?, bufferlen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetRulesEx(coll?.value?.toCPointer<ByteVar>(), delta, buffer?.value?.toCPointer<ByteVar>(), bufferlen)

public actual fun ucolGetSortKey(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, result: COpaquePointer?, resultlength: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetSortKey(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, result?.value?.toCPointer<ByteVar>(), resultlength)

public actual fun ucolGetStrength(coll: COpaquePointer?): UColAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetStrength(coll?.value?.toCPointer<ByteVar>())

public actual fun ucolGetTailoredSet(coll: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetTailoredSet(coll?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolGetUcaversion(coll: COpaquePointer?, info: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetUcaversion(coll?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())
}

public actual fun ucolGetVariableTop(coll: COpaquePointer?, status: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetVariableTop(coll?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucolGetVersion(coll: COpaquePointer?, info: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGetVersion(coll?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())
}

public actual fun ucolGreater(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGreater(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, target?.value?.toCPointer<ByteVar>(), targetlength)

public actual fun ucolGreaterOrEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolGreaterOrEqual(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, target?.value?.toCPointer<ByteVar>(), targetlength)

public actual fun ucolKeyHashCode(key: COpaquePointer?, length: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolKeyHashCode(key?.value?.toCPointer<ByteVar>(), length)

public actual fun ucolMergeSortkeys(src1: COpaquePointer?, src1length: Int, src2: COpaquePointer?, src2length: Int, dest: COpaquePointer?, destcapacity: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolMergeSortkeys(src1?.value?.toCPointer<ByteVar>(), src1length, src2?.value?.toCPointer<ByteVar>(), src2length, dest?.value?.toCPointer<ByteVar>(), destcapacity)

public actual fun ucolNext(elems: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolNext(elems?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucolNextSortKeyPart(coll: COpaquePointer?, iter: COpaquePointer?, state: COpaquePointer?, dest: COpaquePointer?, count: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolNextSortKeyPart(coll?.value?.toCPointer<ByteVar>(), iter?.value?.toCPointer<ByteVar>(), state?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), count, status?.value?.toCPointer<ByteVar>())

public actual fun ucolOpen(loc: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolOpen(loc?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolOpenAvailableLocales(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolOpenAvailableLocales(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolOpenBinary(bin: COpaquePointer?, length: Int, base: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolOpenBinary(bin?.value?.toCPointer<ByteVar>(), length, base?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolOpenElements(coll: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolOpenElements(coll?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolOpenRules(rules: COpaquePointer?, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolOpenRules(rules?.value?.toCPointer<ByteVar>(), ruleslength, normalizationmode, strength, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolPrevious(elems: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolPrevious(elems?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucolPrimaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolPrimaryOrder(order)

public actual fun ucolReset(elems: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolReset(elems?.value?.toCPointer<ByteVar>())
}

public actual fun ucolSafeClone(coll: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSafeClone(coll?.value?.toCPointer<ByteVar>(), stackbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucolSecondaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSecondaryOrder(order)

public actual fun ucolSetAttribute(coll: COpaquePointer?, attr: UColAttribute, value: UColAttributeValue, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetAttribute(coll?.value?.toCPointer<ByteVar>(), attr, value, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucolSetMaxVariable(coll: COpaquePointer?, group: UColReorderCode, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetMaxVariable(coll?.value?.toCPointer<ByteVar>(), group, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucolSetOffset(elems: COpaquePointer?, offset: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetOffset(elems?.value?.toCPointer<ByteVar>(), offset, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucolSetReorderCodes(coll: COpaquePointer?, reordercodes: COpaquePointer?, reordercodeslength: Int, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetReorderCodes(coll?.value?.toCPointer<ByteVar>(), reordercodes?.value?.toCPointer<ByteVar>(), reordercodeslength, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun ucolSetStrength(coll: COpaquePointer?, strength: UColAttributeValue) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetStrength(coll?.value?.toCPointer<ByteVar>(), strength)
}

public actual fun ucolSetText(elems: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolSetText(elems?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucolStrcoll(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolStrcoll(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, target?.value?.toCPointer<ByteVar>(), targetlength)

public actual fun ucolStrcollIter(coll: COpaquePointer?, siter: COpaquePointer?, titer: COpaquePointer?, status: COpaquePointer?): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolStrcollIter(coll?.value?.toCPointer<ByteVar>(), siter?.value?.toCPointer<ByteVar>(), titer?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucolStrcollUtf8(coll: COpaquePointer?, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: COpaquePointer?): UCollationResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolStrcollUtf8(coll?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, target?.value?.toCPointer<ByteVar>(), targetlength, status?.value?.toCPointer<ByteVar>())

public actual fun ucolTertiaryOrder(order: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucolTertiaryOrder(order)

public actual fun ucpmapGet(map: COpaquePointer?, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucpmapGet(map?.value?.toCPointer<ByteVar>(), c)

public actual fun ucpmapGetRange(map: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucpmapGetRange(map?.value?.toCPointer<ByteVar>(), start, option, surrogatevalue, filter?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun ucptrieClose(trie: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieClose(trie?.value?.toCPointer<ByteVar>())
}

public actual fun ucptrieGet(trie: COpaquePointer?, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieGet(trie?.value?.toCPointer<ByteVar>(), c)

public actual fun ucptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieGetRange(trie?.value?.toCPointer<ByteVar>(), start, option, surrogatevalue, filter?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun ucptrieGetType(trie: COpaquePointer?): UCPTrieType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieGetType(trie?.value?.toCPointer<ByteVar>())

public actual fun ucptrieGetValueWidth(trie: COpaquePointer?): UCPTrieValueWidth =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieGetValueWidth(trie?.value?.toCPointer<ByteVar>())

public actual fun ucptrieInternalSmallIndex(trie: COpaquePointer?, c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieInternalSmallIndex(trie?.value?.toCPointer<ByteVar>(), c)

public actual fun ucptrieInternalSmallU8Index(trie: COpaquePointer?, lt1: Int, t2: UByte, t3: UByte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieInternalSmallU8Index(trie?.value?.toCPointer<ByteVar>(), lt1, t2, t3)

public actual fun ucptrieInternalU8PrevIndex(trie: COpaquePointer?, c: Int, start: COpaquePointer?, src: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieInternalU8PrevIndex(trie?.value?.toCPointer<ByteVar>(), c, start?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieOpenFromBinary(type, valuewidth, data?.value?.toCPointer<ByteVar>(), length, pactuallength?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucptrieToBinary(trie: COpaquePointer?, data: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucptrieToBinary(trie?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ucsdetClose(ucsd: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetClose(ucsd?.value?.toCPointer<ByteVar>())
}

public actual fun ucsdetDetect(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetDetect(ucsd?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetDetectAll(ucsd: COpaquePointer?, matchesfound: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetDetectAll(ucsd?.value?.toCPointer<ByteVar>(), matchesfound?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetEnableInputFilter(ucsd: COpaquePointer?, filter: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetEnableInputFilter(ucsd?.value?.toCPointer<ByteVar>(), filter)

public actual fun ucsdetGetAllDetectableCharsets(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetGetAllDetectableCharsets(ucsd?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetGetConfidence(ucsm: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetGetConfidence(ucsm?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ucsdetGetLanguage(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetGetLanguage(ucsm?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetGetName(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetGetName(ucsm?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetGetUchars(ucsm: COpaquePointer?, buf: COpaquePointer?, cap: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetGetUchars(ucsm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), cap, status?.value?.toCPointer<ByteVar>())

public actual fun ucsdetIsInputFilterEnabled(ucsd: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetIsInputFilterEnabled(ucsd?.value?.toCPointer<ByteVar>())

public actual fun ucsdetOpen(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetOpen(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucsdetSetDeclaredEncoding(ucsd: COpaquePointer?, encoding: Pcstr, length: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetSetDeclaredEncoding(ucsd?.value?.toCPointer<ByteVar>(), encoding?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucsdetSetText(ucsd: COpaquePointer?, textin: Pcstr, len: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucsdetSetText(ucsd?.value?.toCPointer<ByteVar>(), textin?.value?.toCPointer<ByteVar>(), len, status?.value?.toCPointer<ByteVar>())
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrCountCurrencies(locale?.value?.toCPointer<ByteVar>(), date, ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrForLocale(locale: Pcstr, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrForLocale(locale?.value?.toCPointer<ByteVar>(), buff?.value?.toCPointer<ByteVar>(), buffcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrForLocaleAndDate(locale?.value?.toCPointer<ByteVar>(), date, index, buff?.value?.toCPointer<ByteVar>(), buffcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrGetDefaultFractionDigits(currency: COpaquePointer?, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigits(currency?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigitsForUsage(currency?.value?.toCPointer<ByteVar>(), usage, ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetKeywordValuesForLocale(key?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), commonlyused, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucurrGetName(currency: COpaquePointer?, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetName(currency?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), namestyle, ischoiceformat?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucurrGetNumericCode(currency: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetNumericCode(currency?.value?.toCPointer<ByteVar>())

public actual fun ucurrGetPluralName(currency: COpaquePointer?, locale: Pcstr, ischoiceformat: COpaquePointer?, pluralcount: Pcstr, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetPluralName(currency?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), ischoiceformat?.value?.toCPointer<ByteVar>(), pluralcount?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucurrGetRoundingIncrement(currency: COpaquePointer?, ec: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetRoundingIncrement(currency?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrGetRoundingIncrementForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrGetRoundingIncrementForUsage(currency?.value?.toCPointer<ByteVar>(), usage, ec?.value?.toCPointer<ByteVar>())

public actual fun ucurrIsAvailable(isocode: COpaquePointer?, from: Double, to: Double, errorcode: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrIsAvailable(isocode?.value?.toCPointer<ByteVar>(), from, to, errorcode?.value?.toCPointer<ByteVar>())

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrOpenIsocurrencies(currtype, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucurrRegister(isocode: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrRegister(isocode?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ucurrUnregister(key: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ucurrUnregister(key?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatAdoptNumberFormat(fmt: COpaquePointer?, numberformattoadopt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatAdoptNumberFormat(fmt?.value?.toCPointer<ByteVar>(), numberformattoadopt?.value?.toCPointer<ByteVar>())
}

public actual fun udatAdoptNumberFormatForFields(fmt: COpaquePointer?, fields: COpaquePointer?, numberformattoset: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatAdoptNumberFormatForFields(fmt?.value?.toCPointer<ByteVar>(), fields?.value?.toCPointer<ByteVar>(), numberformattoset?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun udatApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatApplyPattern(format?.value?.toCPointer<ByteVar>(), localized, pattern?.value?.toCPointer<ByteVar>(), patternlength)
}

public actual fun udatClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatClone(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatClose(format: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatClose(format?.value?.toCPointer<ByteVar>())
}

public actual fun udatCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatCountAvailable()

public actual fun udatCountSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatCountSymbols(fmt?.value?.toCPointer<ByteVar>(), type)

public actual fun udatFormat(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatFormat(format?.value?.toCPointer<ByteVar>(), datetoformat, result?.value?.toCPointer<ByteVar>(), resultlength, position?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatFormatCalendar(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatFormatCalendar(format?.value?.toCPointer<ByteVar>(), calendar?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), capacity, position?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatFormatCalendarForFields(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatFormatCalendarForFields(format?.value?.toCPointer<ByteVar>(), calendar?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), capacity, fpositer?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatFormatForFields(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatFormatForFields(format?.value?.toCPointer<ByteVar>(), datetoformat, result?.value?.toCPointer<ByteVar>(), resultlength, fpositer?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatGet2DigitYearStart(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGet2DigitYearStart(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetAvailable(localeindex)?.let { COpaquePointer(it.toLong()) }

public actual fun udatGetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetBooleanAttribute(fmt?.value?.toCPointer<ByteVar>(), attr, status?.value?.toCPointer<ByteVar>())

public actual fun udatGetCalendar(fmt: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetCalendar(fmt?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetContext(fmt?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())

public actual fun udatGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetLocaleByType(fmt?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatGetNumberFormat(fmt: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetNumberFormat(fmt?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatGetNumberFormatForField(fmt: COpaquePointer?, field: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetNumberFormatForField(fmt?.value?.toCPointer<ByteVar>(), field)?.let { COpaquePointer(it.toLong()) }

public actual fun udatGetSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatGetSymbols(fmt?.value?.toCPointer<ByteVar>(), type, symbolindex, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun udatIsLenient(fmt: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatIsLenient(fmt?.value?.toCPointer<ByteVar>())

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: COpaquePointer?, tzidlength: Int, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatOpen(timestyle, datestyle, locale?.value?.toCPointer<ByteVar>(), tzid?.value?.toCPointer<ByteVar>(), tzidlength, pattern?.value?.toCPointer<ByteVar>(), patternlength, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatParse(format: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatParse(format?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udatParseCalendar(format: COpaquePointer?, calendar: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatParseCalendar(format?.value?.toCPointer<ByteVar>(), calendar?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun udatSet2DigitYearStart(fmt: COpaquePointer?, d: Double, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSet2DigitYearStart(fmt?.value?.toCPointer<ByteVar>(), d, status?.value?.toCPointer<ByteVar>())
}

public actual fun udatSetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetBooleanAttribute(fmt?.value?.toCPointer<ByteVar>(), attr, newvalue, status?.value?.toCPointer<ByteVar>())
}

public actual fun udatSetCalendar(fmt: COpaquePointer?, calendartoset: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetCalendar(fmt?.value?.toCPointer<ByteVar>(), calendartoset?.value?.toCPointer<ByteVar>())
}

public actual fun udatSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetContext(fmt?.value?.toCPointer<ByteVar>(), value, status?.value?.toCPointer<ByteVar>())
}

public actual fun udatSetLenient(fmt: COpaquePointer?, islenient: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetLenient(fmt?.value?.toCPointer<ByteVar>(), islenient)
}

public actual fun udatSetNumberFormat(fmt: COpaquePointer?, numberformattoset: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetNumberFormat(fmt?.value?.toCPointer<ByteVar>(), numberformattoset?.value?.toCPointer<ByteVar>())
}

public actual fun udatSetSymbols(format: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, value: COpaquePointer?, valuelength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatSetSymbols(format?.value?.toCPointer<ByteVar>(), type, symbolindex, value?.value?.toCPointer<ByteVar>(), valuelength, status?.value?.toCPointer<ByteVar>())
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatToCalendarDateField(field)

public actual fun udatToPattern(fmt: COpaquePointer?, localized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatToPattern(fmt?.value?.toCPointer<ByteVar>(), localized, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun udatpgAddPattern(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, override: Byte, conflictingpattern: COpaquePointer?, capacity: Int, plength: COpaquePointer?, perrorcode: COpaquePointer?): UDateTimePatternConflict =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgAddPattern(dtpg?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, override, conflictingpattern?.value?.toCPointer<ByteVar>(), capacity, plength?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgClone(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgClone(dtpg?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgClose(dtpg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgClose(dtpg?.value?.toCPointer<ByteVar>())
}

public actual fun udatpgGetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetAppendItemFormat(dtpg?.value?.toCPointer<ByteVar>(), field, plength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgGetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetAppendItemName(dtpg?.value?.toCPointer<ByteVar>(), field, plength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgGetBaseSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, baseskeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetBaseSkeleton(unuseddtpg?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), length, baseskeleton?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgGetBestPattern(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetBestPattern(dtpg?.value?.toCPointer<ByteVar>(), skeleton?.value?.toCPointer<ByteVar>(), length, bestpattern?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgGetBestPatternWithOptions(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, options: UDateTimePatternMatchOptions, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetBestPatternWithOptions(dtpg?.value?.toCPointer<ByteVar>(), skeleton?.value?.toCPointer<ByteVar>(), length, options, bestpattern?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgGetDateTimeFormat(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetDateTimeFormat(dtpg?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgGetDecimal(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetDecimal(dtpg?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgGetFieldDisplayName(dtpg: COpaquePointer?, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetFieldDisplayName(dtpg?.value?.toCPointer<ByteVar>(), field, width, fieldname?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgGetPatternForSkeleton(dtpg: COpaquePointer?, skeleton: COpaquePointer?, skeletonlength: Int, plength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetPatternForSkeleton(dtpg?.value?.toCPointer<ByteVar>(), skeleton?.value?.toCPointer<ByteVar>(), skeletonlength, plength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgGetSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, skeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgGetSkeleton(unuseddtpg?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), length, skeleton?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgOpen(locale: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgOpen(locale?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgOpenBaseSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgOpenBaseSkeletons(dtpg?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgOpenEmpty(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgOpenEmpty(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgOpenSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgOpenSkeletons(dtpg?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udatpgReplaceFieldTypes(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgReplaceFieldTypes(dtpg?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, skeleton?.value?.toCPointer<ByteVar>(), skeletonlength, dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgReplaceFieldTypesWithOptions(dtpg?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, skeleton?.value?.toCPointer<ByteVar>(), skeletonlength, options, dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun udatpgSetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgSetAppendItemFormat(dtpg?.value?.toCPointer<ByteVar>(), field, value?.value?.toCPointer<ByteVar>(), length)
}

public actual fun udatpgSetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgSetAppendItemName(dtpg?.value?.toCPointer<ByteVar>(), field, value?.value?.toCPointer<ByteVar>(), length)
}

public actual fun udatpgSetDateTimeFormat(dtpg: COpaquePointer?, dtformat: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgSetDateTimeFormat(dtpg?.value?.toCPointer<ByteVar>(), dtformat?.value?.toCPointer<ByteVar>(), length)
}

public actual fun udatpgSetDecimal(dtpg: COpaquePointer?, decimal: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udatpgSetDecimal(dtpg?.value?.toCPointer<ByteVar>(), decimal?.value?.toCPointer<ByteVar>(), length)
}

public actual fun udtitvfmtClose(formatter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtClose(formatter?.value?.toCPointer<ByteVar>())
}

public actual fun udtitvfmtCloseResult(uresult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtCloseResult(uresult?.value?.toCPointer<ByteVar>())
}

public actual fun udtitvfmtFormat(formatter: COpaquePointer?, fromdate: Double, todate: Double, result: COpaquePointer?, resultcapacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtFormat(formatter?.value?.toCPointer<ByteVar>(), fromdate, todate, result?.value?.toCPointer<ByteVar>(), resultcapacity, position?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: COpaquePointer?, skeletonlength: Int, tzid: COpaquePointer?, tzidlength: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtOpen(locale?.value?.toCPointer<ByteVar>(), skeleton?.value?.toCPointer<ByteVar>(), skeletonlength, tzid?.value?.toCPointer<ByteVar>(), tzidlength, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udtitvfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtOpenResult(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun udtitvfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_udtitvfmtResultAsValue(uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uenumClose(en: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumClose(en?.value?.toCPointer<ByteVar>())
}

public actual fun uenumCount(en: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumCount(en?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uenumNext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumNext(en?.value?.toCPointer<ByteVar>(), resultlength?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uenumOpenCharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumOpenCharStringsEnumeration(strings?.value?.toCPointer<ByteVar>(), count, ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uenumOpenUcharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumOpenUcharStringsEnumeration(strings?.value?.toCPointer<ByteVar>(), count, ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uenumReset(en: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumReset(en?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uenumUnext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uenumUnext(en?.value?.toCPointer<ByteVar>(), resultlength?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufieldpositerClose(fpositer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositerClose(fpositer?.value?.toCPointer<ByteVar>())
}

public actual fun ufieldpositerNext(fpositer: COpaquePointer?, beginindex: COpaquePointer?, endindex: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositerNext(fpositer?.value?.toCPointer<ByteVar>(), beginindex?.value?.toCPointer<ByteVar>(), endindex?.value?.toCPointer<ByteVar>())

public actual fun ufieldpositerOpen(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufieldpositerOpen(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtClose(fmt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtClose(fmt?.value?.toCPointer<ByteVar>())
}

public actual fun ufmtGetArrayItemByIndex(fmt: COpaquePointer?, n: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetArrayItemByIndex(fmt?.value?.toCPointer<ByteVar>(), n, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtGetArrayLength(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetArrayLength(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetDate(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetDate(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetDecNumChars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetDecNumChars(fmt?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtGetDouble(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetDouble(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetInt64(fmt: COpaquePointer?, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetInt64(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetLong(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetLong(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetObject(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetObject(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtGetType(fmt: COpaquePointer?, status: COpaquePointer?): UFormattableType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetType(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ufmtGetUchars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtGetUchars(fmt?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtIsNumeric(fmt: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtIsNumeric(fmt?.value?.toCPointer<ByteVar>())

public actual fun ufmtOpen(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtOpen(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtvalGetString(ufmtval: COpaquePointer?, plength: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtvalGetString(ufmtval?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ufmtvalNextPosition(ufmtval: COpaquePointer?, ucfpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ufmtvalNextPosition(ufmtval?.value?.toCPointer<ByteVar>(), ucfpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun ugenderGetInstance(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ugenderGetInstance(locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ugenderGetListGender(genderinfo: COpaquePointer?, genders: COpaquePointer?, size: Int, status: COpaquePointer?): UGender =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ugenderGetListGender(genderinfo?.value?.toCPointer<ByteVar>(), genders?.value?.toCPointer<ByteVar>(), size, status?.value?.toCPointer<ByteVar>())

public actual fun uidnaClose(idna: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaClose(idna?.value?.toCPointer<ByteVar>())
}

public actual fun uidnaLabelToAscii(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaLabelToAscii(idna?.value?.toCPointer<ByteVar>(), label?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaLabelToAsciiUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaLabelToAsciiUtf8(idna?.value?.toCPointer<ByteVar>(), label?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaLabelToUnicode(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaLabelToUnicode(idna?.value?.toCPointer<ByteVar>(), label?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaLabelToUnicodeUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaLabelToUnicodeUtf8(idna?.value?.toCPointer<ByteVar>(), label?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaNameToAscii(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaNameToAscii(idna?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaNameToAsciiUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaNameToAsciiUtf8(idna?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaNameToUnicode(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaNameToUnicode(idna?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaNameToUnicodeUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaNameToUnicodeUtf8(idna?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, pinfo?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uidnaOpenUts46(options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uidnaOpenUts46(options, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uiterCurrent32(iter: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterCurrent32(iter?.value?.toCPointer<ByteVar>())

public actual fun uiterGetState(iter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterGetState(iter?.value?.toCPointer<ByteVar>())

public actual fun uiterNext32(iter: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterNext32(iter?.value?.toCPointer<ByteVar>())

public actual fun uiterPrevious32(iter: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterPrevious32(iter?.value?.toCPointer<ByteVar>())

public actual fun uiterSetState(iter: COpaquePointer?, state: UInt, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterSetState(iter?.value?.toCPointer<ByteVar>(), state, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun uiterSetString(iter: COpaquePointer?, s: COpaquePointer?, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterSetString(iter?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length)
}

public actual fun uiterSetUtf16Be(iter: COpaquePointer?, s: Pcstr, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterSetUtf16Be(iter?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length)
}

public actual fun uiterSetUtf8(iter: COpaquePointer?, s: Pcstr, length: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uiterSetUtf8(iter?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length)
}

public actual fun uldnClose(ldn: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnClose(ldn?.value?.toCPointer<ByteVar>())
}

public actual fun uldnGetContext(ldn: COpaquePointer?, type: UDisplayContextType, perrorcode: COpaquePointer?): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnGetContext(ldn?.value?.toCPointer<ByteVar>(), type, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnGetDialectHandling(ldn: COpaquePointer?): UDialectHandling =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnGetDialectHandling(ldn?.value?.toCPointer<ByteVar>())

public actual fun uldnGetLocale(ldn: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnGetLocale(ldn?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uldnKeyDisplayName(ldn: COpaquePointer?, key: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnKeyDisplayName(ldn?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnKeyValueDisplayName(ldn: COpaquePointer?, key: Pcstr, value: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnKeyValueDisplayName(ldn?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnLanguageDisplayName(ldn: COpaquePointer?, lang: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnLanguageDisplayName(ldn?.value?.toCPointer<ByteVar>(), lang?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnLocaleDisplayName(ldn: COpaquePointer?, locale: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnLocaleDisplayName(ldn?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnOpen(locale?.value?.toCPointer<ByteVar>(), dialecthandling, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uldnOpenForContext(locale: Pcstr, contexts: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnOpenForContext(locale?.value?.toCPointer<ByteVar>(), contexts?.value?.toCPointer<ByteVar>(), length, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uldnRegionDisplayName(ldn: COpaquePointer?, region: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnRegionDisplayName(ldn?.value?.toCPointer<ByteVar>(), region?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnScriptCodeDisplayName(ldn: COpaquePointer?, scriptcode: UScriptCode, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnScriptCodeDisplayName(ldn?.value?.toCPointer<ByteVar>(), scriptcode, result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnScriptDisplayName(ldn: COpaquePointer?, script: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnScriptDisplayName(ldn?.value?.toCPointer<ByteVar>(), script?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uldnVariantDisplayName(ldn: COpaquePointer?, variant: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uldnVariantDisplayName(ldn?.value?.toCPointer<ByteVar>(), variant?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun ulistfmtClose(listfmt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtClose(listfmt?.value?.toCPointer<ByteVar>())
}

public actual fun ulistfmtCloseResult(uresult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtCloseResult(uresult?.value?.toCPointer<ByteVar>())
}

public actual fun ulistfmtFormat(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtFormat(listfmt?.value?.toCPointer<ByteVar>(), strings?.value?.toCPointer<ByteVar>(), stringlengths?.value?.toCPointer<ByteVar>(), stringcount, result?.value?.toCPointer<ByteVar>(), resultcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulistfmtFormatStringsToResult(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, uresult: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtFormatStringsToResult(listfmt?.value?.toCPointer<ByteVar>(), strings?.value?.toCPointer<ByteVar>(), stringlengths?.value?.toCPointer<ByteVar>(), stringcount, uresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ulistfmtOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtOpen(locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtOpenForType(locale?.value?.toCPointer<ByteVar>(), type, width, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulistfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtOpenResult(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulistfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulistfmtResultAsValue(uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, acceptlist: COpaquePointer?, acceptlistcount: Int, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocAcceptLanguage(result?.value?.toCPointer<ByteVar>(), resultavailable, outresult?.value?.toCPointer<ByteVar>(), acceptlist?.value?.toCPointer<ByteVar>(), acceptlistcount, availablelocales?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, httpacceptlanguage: Pcstr, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocAcceptLanguageFromHttp(result?.value?.toCPointer<ByteVar>(), resultavailable, outresult?.value?.toCPointer<ByteVar>(), httpacceptlanguage?.value?.toCPointer<ByteVar>(), availablelocales?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocAddLikelySubtags(localeid?.value?.toCPointer<ByteVar>(), maximizedlocaleid?.value?.toCPointer<ByteVar>(), maximizedlocaleidcapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocCanonicalize(localeid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), namecapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocCountAvailable()

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: COpaquePointer?, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocForLanguageTag(langtag?.value?.toCPointer<ByteVar>(), localeid?.value?.toCPointer<ByteVar>(), localeidcapacity, parsedlength?.value?.toCPointer<ByteVar>(), err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetAvailable(n: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetAvailable(n)?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetBaseName(localeid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), namecapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetCharacterOrientation(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetCountry(localeid?.value?.toCPointer<ByteVar>(), country?.value?.toCPointer<ByteVar>(), countrycapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDefault(): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDefault()?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: COpaquePointer?, countrycapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayCountry(locale?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), country?.value?.toCPointer<ByteVar>(), countrycapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayKeyword(keyword?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayKeywordValue(locale?.value?.toCPointer<ByteVar>(), keyword?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: COpaquePointer?, languagecapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayLanguage(locale?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>(), languagecapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: COpaquePointer?, maxresultsize: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayName(localeid?.value?.toCPointer<ByteVar>(), inlocaleid?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), maxresultsize, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: COpaquePointer?, scriptcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayScript(locale?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), script?.value?.toCPointer<ByteVar>(), scriptcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: COpaquePointer?, variantcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetDisplayVariant(locale?.value?.toCPointer<ByteVar>(), displaylocale?.value?.toCPointer<ByteVar>(), variant?.value?.toCPointer<ByteVar>(), variantcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetIso3Country(localeid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetIso3Language(localeid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetIsocountries(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetIsocountries()?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetIsolanguages(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetIsolanguages()?.let { COpaquePointer(it.toLong()) }

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetKeywordValue(localeid?.value?.toCPointer<ByteVar>(), keywordname?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffercapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetLcid(localeid?.value?.toCPointer<ByteVar>())

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetLanguage(localeid?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>(), languagecapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetLineOrientation(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetLocaleForLcid(hostid, locale?.value?.toCPointer<ByteVar>(), localecapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetName(localeid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), namecapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetParent(localeid?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), parentcapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetScript(localeid?.value?.toCPointer<ByteVar>(), script?.value?.toCPointer<ByteVar>(), scriptcapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocGetVariant(localeid?.value?.toCPointer<ByteVar>(), variant?.value?.toCPointer<ByteVar>(), variantcapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocIsRightToLeft(locale?.value?.toCPointer<ByteVar>())

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocMinimizeSubtags(localeid?.value?.toCPointer<ByteVar>(), minimizedlocaleid?.value?.toCPointer<ByteVar>(), minimizedlocaleidcapacity, err?.value?.toCPointer<ByteVar>())

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocOpenAvailableByType(type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocOpenKeywords(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocOpenKeywords(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocSetDefault(localeid: Pcstr, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocSetDefault(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocSetKeywordValue(keywordname?.value?.toCPointer<ByteVar>(), keywordvalue?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffercapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocToLanguageTag(localeid?.value?.toCPointer<ByteVar>(), langtag?.value?.toCPointer<ByteVar>(), langtagcapacity, strict, err?.value?.toCPointer<ByteVar>())

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocToLegacyKey(keyword?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocToLegacyType(keyword?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocToUnicodeLocaleKey(keyword?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocToUnicodeLocaleType(keyword?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocdataClose(uld: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataClose(uld?.value?.toCPointer<ByteVar>())
}

public actual fun ulocdataGetCldrversion(versionarray: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetCldrversion(versionarray?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ulocdataGetDelimiter(uld: COpaquePointer?, type: ULocaleDataDelimiterType, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetDelimiter(uld?.value?.toCPointer<ByteVar>(), type, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun ulocdataGetExemplarSet(uld: COpaquePointer?, fillin: COpaquePointer?, options: UInt, extype: ULocaleDataExemplarSetType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetExemplarSet(uld?.value?.toCPointer<ByteVar>(), fillin?.value?.toCPointer<ByteVar>(), options, extype, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocdataGetLocaleDisplayPattern(uld: COpaquePointer?, pattern: COpaquePointer?, patterncapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetLocaleDisplayPattern(uld?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patterncapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocdataGetLocaleSeparator(uld: COpaquePointer?, separator: COpaquePointer?, separatorcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetLocaleSeparator(uld?.value?.toCPointer<ByteVar>(), separator?.value?.toCPointer<ByteVar>(), separatorcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: COpaquePointer?): UMeasurementSystem =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetMeasurementSystem(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun ulocdataGetNoSubstitute(uld: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetNoSubstitute(uld?.value?.toCPointer<ByteVar>())

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: COpaquePointer?, width: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataGetPaperSize(localeid?.value?.toCPointer<ByteVar>(), height?.value?.toCPointer<ByteVar>(), width?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ulocdataOpen(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataOpen(localeid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ulocdataSetNoSubstitute(uld: COpaquePointer?, setting: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ulocdataSetNoSubstitute(uld?.value?.toCPointer<ByteVar>(), setting)
}

public actual fun umsgApplyPattern(fmt: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgApplyPattern(fmt?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun umsgAutoQuoteApostrophe(pattern: COpaquePointer?, patternlength: Int, dest: COpaquePointer?, destcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgAutoQuoteApostrophe(pattern?.value?.toCPointer<ByteVar>(), patternlength, dest?.value?.toCPointer<ByteVar>(), destcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun umsgClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgClone(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umsgClose(format: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgClose(format?.value?.toCPointer<ByteVar>())
}

public actual fun umsgFormat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgFormat(fmt?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun umsgGetLocale(fmt: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgGetLocale(fmt?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umsgOpen(pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgOpen(pattern?.value?.toCPointer<ByteVar>(), patternlength, locale?.value?.toCPointer<ByteVar>(), parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umsgParse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgParse(fmt?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, count?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun umsgSetLocale(fmt: COpaquePointer?, locale: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgSetLocale(fmt?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>())
}

public actual fun umsgToPattern(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgToPattern(fmt?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun umsgVformat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgVformat(fmt?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, ap?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun umsgVparse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umsgVparse(fmt?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), sourcelength, count?.value?.toCPointer<ByteVar>(), ap?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun umutablecptrieBuildImmutable(trie: COpaquePointer?, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieBuildImmutable(trie?.value?.toCPointer<ByteVar>(), type, valuewidth, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umutablecptrieClone(other: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieClone(other?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umutablecptrieClose(trie: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieClose(trie?.value?.toCPointer<ByteVar>())
}

public actual fun umutablecptrieFromUcpmap(map: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieFromUcpmap(map?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umutablecptrieFromUcptrie(trie: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieFromUcptrie(trie?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umutablecptrieGet(trie: COpaquePointer?, c: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieGet(trie?.value?.toCPointer<ByteVar>(), c)

public actual fun umutablecptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieGetRange(trie?.value?.toCPointer<ByteVar>(), start, option, surrogatevalue, filter?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieOpen(initialvalue, errorvalue, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun umutablecptrieSet(trie: COpaquePointer?, c: Int, value: UInt, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieSet(trie?.value?.toCPointer<ByteVar>(), c, value, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun umutablecptrieSetRange(trie: COpaquePointer?, start: Int, end: Int, value: UInt, perrorcode: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_umutablecptrieSetRange(trie?.value?.toCPointer<ByteVar>(), start, end, value, perrorcode?.value?.toCPointer<ByteVar>())
}

public actual fun unorm2Append(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2Append(norm2?.value?.toCPointer<ByteVar>(), first?.value?.toCPointer<ByteVar>(), firstlength, firstcapacity, second?.value?.toCPointer<ByteVar>(), secondlength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2Close(norm2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2Close(norm2?.value?.toCPointer<ByteVar>())
}

public actual fun unorm2ComposePair(norm2: COpaquePointer?, a: Int, b: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2ComposePair(norm2?.value?.toCPointer<ByteVar>(), a, b)

public actual fun unorm2GetCombiningClass(norm2: COpaquePointer?, c: Int): UByte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetCombiningClass(norm2?.value?.toCPointer<ByteVar>(), c)

public actual fun unorm2GetDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetDecomposition(norm2?.value?.toCPointer<ByteVar>(), c, decomposition?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetInstance(packagename?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), mode, perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetNfcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetNfcinstance(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetNfdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetNfdinstance(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetNfkccasefoldInstance(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetNfkcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetNfkcinstance(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetNfkdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetNfkdinstance(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2GetRawDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2GetRawDecomposition(norm2?.value?.toCPointer<ByteVar>(), c, decomposition?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2HasBoundaryAfter(norm2: COpaquePointer?, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2HasBoundaryAfter(norm2?.value?.toCPointer<ByteVar>(), c)

public actual fun unorm2HasBoundaryBefore(norm2: COpaquePointer?, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2HasBoundaryBefore(norm2?.value?.toCPointer<ByteVar>(), c)

public actual fun unorm2IsInert(norm2: COpaquePointer?, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2IsInert(norm2?.value?.toCPointer<ByteVar>(), c)

public actual fun unorm2IsNormalized(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2IsNormalized(norm2?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2Normalize(norm2: COpaquePointer?, src: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2Normalize(norm2?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2NormalizeSecondAndAppend(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2NormalizeSecondAndAppend(norm2?.value?.toCPointer<ByteVar>(), first?.value?.toCPointer<ByteVar>(), firstlength, firstcapacity, second?.value?.toCPointer<ByteVar>(), secondlength, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2OpenFiltered(norm2: COpaquePointer?, filterset: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2OpenFiltered(norm2?.value?.toCPointer<ByteVar>(), filterset?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unorm2QuickCheck(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): UNormalizationCheckResult =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2QuickCheck(norm2?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unorm2SpanQuickCheckYes(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unorm2SpanQuickCheckYes(norm2?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unormCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unormCompare(s1?.value?.toCPointer<ByteVar>(), length1, s2?.value?.toCPointer<ByteVar>(), length2, options, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun unumApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumApplyPattern(format?.value?.toCPointer<ByteVar>(), localized, pattern?.value?.toCPointer<ByteVar>(), patternlength, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun unumClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumClone(fmt?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumClose(fmt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumClose(fmt?.value?.toCPointer<ByteVar>())
}

public actual fun unumCountAvailable(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumCountAvailable()

public actual fun unumFormat(fmt: COpaquePointer?, number: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormat(fmt?.value?.toCPointer<ByteVar>(), number, result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatDecimal(fmt: COpaquePointer?, number: Pcstr, length: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatDecimal(fmt?.value?.toCPointer<ByteVar>(), number?.value?.toCPointer<ByteVar>(), length, result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatDouble(fmt: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatDouble(fmt?.value?.toCPointer<ByteVar>(), number, result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatDoubleCurrency(fmt: COpaquePointer?, number: Double, currency: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatDoubleCurrency(fmt?.value?.toCPointer<ByteVar>(), number, currency?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatDoubleForFields(format: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatDoubleForFields(format?.value?.toCPointer<ByteVar>(), number, result?.value?.toCPointer<ByteVar>(), resultlength, fpositer?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatInt64(fmt: COpaquePointer?, number: Long, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatInt64(fmt?.value?.toCPointer<ByteVar>(), number, result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumFormatUformattable(fmt: COpaquePointer?, number: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumFormatUformattable(fmt?.value?.toCPointer<ByteVar>(), number?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumGetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetAttribute(fmt?.value?.toCPointer<ByteVar>(), attr)

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetAvailable(localeindex)?.let { COpaquePointer(it.toLong()) }

public actual fun unumGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetContext(fmt?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())

public actual fun unumGetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetDoubleAttribute(fmt?.value?.toCPointer<ByteVar>(), attr)

public actual fun unumGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetLocaleByType(fmt?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumGetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, buffer: COpaquePointer?, size: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetSymbol(fmt?.value?.toCPointer<ByteVar>(), symbol, buffer?.value?.toCPointer<ByteVar>(), size, status?.value?.toCPointer<ByteVar>())

public actual fun unumGetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumGetTextAttribute(fmt?.value?.toCPointer<ByteVar>(), tag, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun unumOpen(style: UNumberFormatStyle, pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumOpen(style, pattern?.value?.toCPointer<ByteVar>(), patternlength, locale?.value?.toCPointer<ByteVar>(), parseerr?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumParse(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParse(fmt?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumParseDecimal(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, outbuf: Pcstr, outbuflength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParseDecimal(fmt?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbuflength, status?.value?.toCPointer<ByteVar>())

public actual fun unumParseDouble(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParseDouble(fmt?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumParseDoubleCurrency(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, currency: COpaquePointer?, status: COpaquePointer?): Double =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParseDoubleCurrency(fmt?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), currency?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumParseInt64(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParseInt64(fmt?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun unumParseToUformattable(fmt: COpaquePointer?, result: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumParseToUformattable(fmt?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, parsepos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumSetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumSetAttribute(fmt?.value?.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun unumSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumSetContext(fmt?.value?.toCPointer<ByteVar>(), value, status?.value?.toCPointer<ByteVar>())
}

public actual fun unumSetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Double) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumSetDoubleAttribute(fmt?.value?.toCPointer<ByteVar>(), attr, newvalue)
}

public actual fun unumSetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, value: COpaquePointer?, length: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumSetSymbol(fmt?.value?.toCPointer<ByteVar>(), symbol, value?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())
}

public actual fun unumSetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, newvalue: COpaquePointer?, newvaluelength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumSetTextAttribute(fmt?.value?.toCPointer<ByteVar>(), tag, newvalue?.value?.toCPointer<ByteVar>(), newvaluelength, status?.value?.toCPointer<ByteVar>())
}

public actual fun unumToPattern(fmt: COpaquePointer?, ispatternlocalized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumToPattern(fmt?.value?.toCPointer<ByteVar>(), ispatternlocalized, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun unumfClose(uformatter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfClose(uformatter?.value?.toCPointer<ByteVar>())
}

public actual fun unumfCloseResult(uresult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfCloseResult(uresult?.value?.toCPointer<ByteVar>())
}

public actual fun unumfFormatDecimal(uformatter: COpaquePointer?, value: Pcstr, valuelen: Int, uresult: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfFormatDecimal(uformatter?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valuelen, uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun unumfFormatDouble(uformatter: COpaquePointer?, value: Double, uresult: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfFormatDouble(uformatter?.value?.toCPointer<ByteVar>(), value, uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun unumfFormatInt(uformatter: COpaquePointer?, value: Long, uresult: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfFormatInt(uformatter?.value?.toCPointer<ByteVar>(), value, uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocale(skeleton?.value?.toCPointer<ByteVar>(), skeletonlen, locale?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, perror: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocaleWithError(skeleton?.value?.toCPointer<ByteVar>(), skeletonlen, locale?.value?.toCPointer<ByteVar>(), perror?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumfOpenResult(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfOpenResult(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumfResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfResultAsValue(uresult?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumfResultGetAllFieldPositions(uresult: COpaquePointer?, ufpositer: COpaquePointer?, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfResultGetAllFieldPositions(uresult?.value?.toCPointer<ByteVar>(), ufpositer?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())
}

public actual fun unumfResultNextFieldPosition(uresult: COpaquePointer?, ufpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfResultNextFieldPosition(uresult?.value?.toCPointer<ByteVar>(), ufpos?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())

public actual fun unumfResultToString(uresult: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumfResultToString(uresult?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffercapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun unumsysClose(unumsys: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysClose(unumsys?.value?.toCPointer<ByteVar>())
}

public actual fun unumsysGetDescription(unumsys: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysGetDescription(unumsys?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun unumsysGetName(unumsys: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysGetName(unumsys?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumsysGetRadix(unumsys: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysGetRadix(unumsys?.value?.toCPointer<ByteVar>())

public actual fun unumsysIsAlgorithmic(unumsys: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysIsAlgorithmic(unumsys?.value?.toCPointer<ByteVar>())

public actual fun unumsysOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysOpen(locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumsysOpenAvailableNames(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysOpenAvailableNames(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unumsysOpenByName(name: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_unumsysOpenByName(name?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uplrulesClose(uplrules: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesClose(uplrules?.value?.toCPointer<ByteVar>())
}

public actual fun uplrulesGetKeywords(uplrules: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesGetKeywords(uplrules?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uplrulesOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesOpen(locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesOpenForType(locale?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uplrulesSelect(uplrules: COpaquePointer?, number: Double, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesSelect(uplrules?.value?.toCPointer<ByteVar>(), number, keyword?.value?.toCPointer<ByteVar>(), capacity, status?.value?.toCPointer<ByteVar>())

public actual fun uplrulesSelectFormatted(uplrules: COpaquePointer?, number: COpaquePointer?, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uplrulesSelectFormatted(uplrules?.value?.toCPointer<ByteVar>(), number?.value?.toCPointer<ByteVar>(), keyword?.value?.toCPointer<ByteVar>(), capacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexAppendReplacement(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexAppendReplacement(regexp?.value?.toCPointer<ByteVar>(), replacementtext?.value?.toCPointer<ByteVar>(), replacementlength, destbuf?.value?.toCPointer<ByteVar>(), destcapacity?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexAppendReplacementUtext(regexp: COpaquePointer?, replacementtext: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexAppendReplacementUtext(regexp?.value?.toCPointer<ByteVar>(), replacementtext?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexAppendTail(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexAppendTail(regexp?.value?.toCPointer<ByteVar>(), destbuf?.value?.toCPointer<ByteVar>(), destcapacity?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexAppendTailUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexAppendTailUtext(regexp?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexClone(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexClone(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexClose(regexp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexClose(regexp?.value?.toCPointer<ByteVar>())
}

public actual fun uregexEnd(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexEnd(regexp?.value?.toCPointer<ByteVar>(), groupnum, status?.value?.toCPointer<ByteVar>())

public actual fun uregexEnd64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexEnd64(regexp?.value?.toCPointer<ByteVar>(), groupnum, status?.value?.toCPointer<ByteVar>())

public actual fun uregexFind(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexFind(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexFind64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexFind64(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexFindNext(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexFindNext(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexFlags(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexFlags(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexGetFindProgressCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetFindProgressCallback(regexp?.value?.toCPointer<ByteVar>(), callback?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexGetMatchCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetMatchCallback(regexp?.value?.toCPointer<ByteVar>(), callback?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexGetStackLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetStackLimit(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexGetText(regexp: COpaquePointer?, textlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetText(regexp?.value?.toCPointer<ByteVar>(), textlength?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexGetTimeLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetTimeLimit(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexGetUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGetUtext(regexp?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexGroup(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGroup(regexp?.value?.toCPointer<ByteVar>(), groupnum, dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexGroupCount(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGroupCount(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexGroupNumberFromCname(regexp: COpaquePointer?, groupname: Pcstr, namelength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGroupNumberFromCname(regexp?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), namelength, status?.value?.toCPointer<ByteVar>())

public actual fun uregexGroupNumberFromName(regexp: COpaquePointer?, groupname: COpaquePointer?, namelength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGroupNumberFromName(regexp?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), namelength, status?.value?.toCPointer<ByteVar>())

public actual fun uregexGroupUtext(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, grouplength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexGroupUtext(regexp?.value?.toCPointer<ByteVar>(), groupnum, dest?.value?.toCPointer<ByteVar>(), grouplength?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexHasAnchoringBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexHasAnchoringBounds(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexHasTransparentBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexHasTransparentBounds(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexHitEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexHitEnd(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexLookingAt(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexLookingAt(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexLookingAt64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexLookingAt64(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexMatches(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexMatches(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexMatches64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexMatches64(regexp?.value?.toCPointer<ByteVar>(), startindex, status?.value?.toCPointer<ByteVar>())

public actual fun uregexOpen(pattern: COpaquePointer?, patternlength: Int, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexOpen(pattern?.value?.toCPointer<ByteVar>(), patternlength, flags, pe?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexOpenC(pattern?.value?.toCPointer<ByteVar>(), flags, pe?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexOpenUtext(pattern: COpaquePointer?, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexOpenUtext(pattern?.value?.toCPointer<ByteVar>(), flags, pe?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexPattern(regexp: COpaquePointer?, patlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexPattern(regexp?.value?.toCPointer<ByteVar>(), patlength?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexPatternUtext(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexPatternUtext(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexRefreshUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRefreshUtext(regexp?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexRegionEnd(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRegionEnd(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexRegionEnd64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRegionEnd64(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexRegionStart(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRegionStart(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexRegionStart64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRegionStart64(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexReplaceAll(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReplaceAll(regexp?.value?.toCPointer<ByteVar>(), replacementtext?.value?.toCPointer<ByteVar>(), replacementlength, destbuf?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexReplaceAllUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReplaceAllUtext(regexp?.value?.toCPointer<ByteVar>(), replacement?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexReplaceFirst(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReplaceFirst(regexp?.value?.toCPointer<ByteVar>(), replacementtext?.value?.toCPointer<ByteVar>(), replacementlength, destbuf?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexReplaceFirstUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReplaceFirstUtext(regexp?.value?.toCPointer<ByteVar>(), replacement?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregexRequireEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexRequireEnd(regexp?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uregexReset(regexp: COpaquePointer?, index: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReset(regexp?.value?.toCPointer<ByteVar>(), index, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexReset64(regexp: COpaquePointer?, index: Long, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexReset64(regexp?.value?.toCPointer<ByteVar>(), index, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetFindProgressCallback(regexp: COpaquePointer?, callback: URegexFindProgressCallback, context: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetFindProgressCallback(regexp?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetMatchCallback(regexp: COpaquePointer?, callback: URegexMatchCallback, context: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetMatchCallback(regexp?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetRegion(regexp: COpaquePointer?, regionstart: Int, regionlimit: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetRegion(regexp?.value?.toCPointer<ByteVar>(), regionstart, regionlimit, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetRegion64(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetRegion64(regexp?.value?.toCPointer<ByteVar>(), regionstart, regionlimit, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetRegionAndStart(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, startindex: Long, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetRegionAndStart(regexp?.value?.toCPointer<ByteVar>(), regionstart, regionlimit, startindex, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetStackLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetStackLimit(regexp?.value?.toCPointer<ByteVar>(), limit, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetText(regexp: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetText(regexp?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetTimeLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetTimeLimit(regexp?.value?.toCPointer<ByteVar>(), limit, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSetUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSetUtext(regexp?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexSplit(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: Int, requiredcapacity: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSplit(regexp?.value?.toCPointer<ByteVar>(), destbuf?.value?.toCPointer<ByteVar>(), destcapacity, requiredcapacity?.value?.toCPointer<ByteVar>(), destfields?.value?.toCPointer<ByteVar>(), destfieldscapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexSplitUtext(regexp: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexSplitUtext(regexp?.value?.toCPointer<ByteVar>(), destfields?.value?.toCPointer<ByteVar>(), destfieldscapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uregexStart(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexStart(regexp?.value?.toCPointer<ByteVar>(), groupnum, status?.value?.toCPointer<ByteVar>())

public actual fun uregexStart64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexStart64(regexp?.value?.toCPointer<ByteVar>(), groupnum, status?.value?.toCPointer<ByteVar>())

public actual fun uregexUseAnchoringBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexUseAnchoringBounds(regexp?.value?.toCPointer<ByteVar>(), b, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregexUseTransparentBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregexUseTransparentBounds(regexp?.value?.toCPointer<ByteVar>(), b, status?.value?.toCPointer<ByteVar>())
}

public actual fun uregionAreEqual(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionAreEqual(uregion?.value?.toCPointer<ByteVar>(), otherregion?.value?.toCPointer<ByteVar>())

public actual fun uregionContains(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionContains(uregion?.value?.toCPointer<ByteVar>(), otherregion?.value?.toCPointer<ByteVar>())

public actual fun uregionGetAvailable(type: URegionType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetAvailable(type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetContainedRegions(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetContainedRegions(uregion?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetContainedRegionsOfType(uregion: COpaquePointer?, type: URegionType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetContainedRegionsOfType(uregion?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetContainingRegion(uregion: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetContainingRegion(uregion?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetContainingRegionOfType(uregion: COpaquePointer?, type: URegionType): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetContainingRegionOfType(uregion?.value?.toCPointer<ByteVar>(), type)?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetNumericCode(uregion: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetNumericCode(uregion?.value?.toCPointer<ByteVar>())

public actual fun uregionGetPreferredValues(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetPreferredValues(uregion?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetRegionCode(uregion: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetRegionCode(uregion?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetRegionFromCode(regioncode?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetRegionFromNumericCode(code: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetRegionFromNumericCode(code, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uregionGetType(uregion: COpaquePointer?): URegionType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uregionGetType(uregion?.value?.toCPointer<ByteVar>())

public actual fun ureldatefmtClose(reldatefmt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtClose(reldatefmt?.value?.toCPointer<ByteVar>())
}

public actual fun ureldatefmtCloseResult(ufrdt: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtCloseResult(ufrdt?.value?.toCPointer<ByteVar>())
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: COpaquePointer?, relativedatestring: COpaquePointer?, relativedatestringlen: Int, timestring: COpaquePointer?, timestringlen: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtCombineDateAndTime(reldatefmt?.value?.toCPointer<ByteVar>(), relativedatestring?.value?.toCPointer<ByteVar>(), relativedatestringlen, timestring?.value?.toCPointer<ByteVar>(), timestringlen, result?.value?.toCPointer<ByteVar>(), resultcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ureldatefmtFormat(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtFormat(reldatefmt?.value?.toCPointer<ByteVar>(), offset, unit, result?.value?.toCPointer<ByteVar>(), resultcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ureldatefmtFormatNumeric(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtFormatNumeric(reldatefmt?.value?.toCPointer<ByteVar>(), offset, unit, result?.value?.toCPointer<ByteVar>(), resultcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtFormatNumericToResult(reldatefmt?.value?.toCPointer<ByteVar>(), offset, unit, result?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ureldatefmtFormatToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtFormatToResult(reldatefmt?.value?.toCPointer<ByteVar>(), offset, unit, result?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: COpaquePointer?, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtOpen(locale?.value?.toCPointer<ByteVar>(), nftoadopt?.value?.toCPointer<ByteVar>(), width, capitalizationcontext, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ureldatefmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtOpenResult(ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ureldatefmtResultAsValue(ufrdt: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_ureldatefmtResultAsValue(ufrdt?.value?.toCPointer<ByteVar>(), ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresClose(resourcebundle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresClose(resourcebundle?.value?.toCPointer<ByteVar>())
}

public actual fun uresGetBinary(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetBinary(resourcebundle?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetByIndex(resourcebundle: COpaquePointer?, indexr: Int, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetByIndex(resourcebundle?.value?.toCPointer<ByteVar>(), indexr, fillin?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetByKey(resourcebundle: COpaquePointer?, key: Pcstr, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetByKey(resourcebundle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), fillin?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetInt(resourcebundle: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetInt(resourcebundle?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uresGetIntVector(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetIntVector(resourcebundle?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetKey(resourcebundle: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetKey(resourcebundle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetLocaleByType(resourcebundle: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetLocaleByType(resourcebundle?.value?.toCPointer<ByteVar>(), type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetNextResource(resourcebundle: COpaquePointer?, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetNextResource(resourcebundle?.value?.toCPointer<ByteVar>(), fillin?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetNextString(resourcebundle: COpaquePointer?, len: COpaquePointer?, key: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetNextString(resourcebundle?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetSize(resourcebundle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetSize(resourcebundle?.value?.toCPointer<ByteVar>())

public actual fun uresGetString(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetString(resourcebundle?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetStringByIndex(resourcebundle: COpaquePointer?, indexs: Int, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetStringByIndex(resourcebundle?.value?.toCPointer<ByteVar>(), indexs, len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetStringByKey(resb: COpaquePointer?, key: Pcstr, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetStringByKey(resb?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetType(resourcebundle: COpaquePointer?): UResType =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetType(resourcebundle?.value?.toCPointer<ByteVar>())

public actual fun uresGetUint(resourcebundle: COpaquePointer?, status: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetUint(resourcebundle?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uresGetUtf8String(resb: COpaquePointer?, dest: Pcstr, length: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetUtf8String(resb?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), forcecopy, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetUtf8StringByIndex(resb: COpaquePointer?, stringindex: Int, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetUtf8StringByIndex(resb?.value?.toCPointer<ByteVar>(), stringindex, dest?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), forcecopy, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetUtf8StringByKey(resb: COpaquePointer?, key: Pcstr, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetUtf8StringByKey(resb?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), forcecopy, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresGetVersion(resb: COpaquePointer?, versioninfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresGetVersion(resb?.value?.toCPointer<ByteVar>(), versioninfo?.value?.toCPointer<ByteVar>())
}

public actual fun uresHasNext(resourcebundle: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresHasNext(resourcebundle?.value?.toCPointer<ByteVar>())

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresOpen(packagename?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresOpenAvailableLocales(packagename?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresOpenDirect(packagename?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresOpenU(packagename: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresOpenU(packagename?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uresResetIterator(resourcebundle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uresResetIterator(resourcebundle?.value?.toCPointer<ByteVar>())
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptBreaksBetweenLetters(script)

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: COpaquePointer?, capacity: Int, err: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetCode(nameorabbrorlocale?.value?.toCPointer<ByteVar>(), fillin?.value?.toCPointer<ByteVar>(), capacity, err?.value?.toCPointer<ByteVar>())

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetName(scriptcode)?.let { COpaquePointer(it.toLong()) }

public actual fun uscriptGetSampleString(script: UScriptCode, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetSampleString(script, dest?.value?.toCPointer<ByteVar>(), capacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun uscriptGetScript(codepoint: Int, err: COpaquePointer?): UScriptCode =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetScript(codepoint, err?.value?.toCPointer<ByteVar>())

public actual fun uscriptGetScriptExtensions(c: Int, scripts: COpaquePointer?, capacity: Int, errorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetScriptExtensions(c, scripts?.value?.toCPointer<ByteVar>(), capacity, errorcode?.value?.toCPointer<ByteVar>())

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetShortName(scriptcode)?.let { COpaquePointer(it.toLong()) }

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptGetUsage(script)

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptHasScript(c, sc)

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptIsCased(script)

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uscriptIsRightToLeft(script)

public actual fun usearchClose(searchiter: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchClose(searchiter?.value?.toCPointer<ByteVar>())
}

public actual fun usearchFirst(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchFirst(strsrch?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun usearchFollowing(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchFollowing(strsrch?.value?.toCPointer<ByteVar>(), position, status?.value?.toCPointer<ByteVar>())

public actual fun usearchGetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute): USearchAttributeValue =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetAttribute(strsrch?.value?.toCPointer<ByteVar>(), attribute)

public actual fun usearchGetBreakIterator(strsrch: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetBreakIterator(strsrch?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchGetCollator(strsrch: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetCollator(strsrch?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchGetMatchedLength(strsrch: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetMatchedLength(strsrch?.value?.toCPointer<ByteVar>())

public actual fun usearchGetMatchedStart(strsrch: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetMatchedStart(strsrch?.value?.toCPointer<ByteVar>())

public actual fun usearchGetMatchedText(strsrch: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetMatchedText(strsrch?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun usearchGetOffset(strsrch: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetOffset(strsrch?.value?.toCPointer<ByteVar>())

public actual fun usearchGetPattern(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetPattern(strsrch?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchGetText(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchGetText(strsrch?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchLast(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchLast(strsrch?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun usearchNext(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchNext(strsrch?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun usearchOpen(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, locale: Pcstr, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchOpen(pattern?.value?.toCPointer<ByteVar>(), patternlength, text?.value?.toCPointer<ByteVar>(), textlength, locale?.value?.toCPointer<ByteVar>(), breakiter?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchOpenFromCollator(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, collator: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchOpenFromCollator(pattern?.value?.toCPointer<ByteVar>(), patternlength, text?.value?.toCPointer<ByteVar>(), textlength, collator?.value?.toCPointer<ByteVar>(), breakiter?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usearchPreceding(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchPreceding(strsrch?.value?.toCPointer<ByteVar>(), position, status?.value?.toCPointer<ByteVar>())

public actual fun usearchPrevious(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchPrevious(strsrch?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun usearchReset(strsrch: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchReset(strsrch?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute, value: USearchAttributeValue, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetAttribute(strsrch?.value?.toCPointer<ByteVar>(), attribute, value, status?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetBreakIterator(strsrch: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetBreakIterator(strsrch?.value?.toCPointer<ByteVar>(), breakiter?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetCollator(strsrch: COpaquePointer?, collator: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetCollator(strsrch?.value?.toCPointer<ByteVar>(), collator?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetOffset(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetOffset(strsrch?.value?.toCPointer<ByteVar>(), position, status?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetPattern(strsrch: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetPattern(strsrch?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, status?.value?.toCPointer<ByteVar>())
}

public actual fun usearchSetText(strsrch: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usearchSetText(strsrch?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength, status?.value?.toCPointer<ByteVar>())
}

public actual fun usetAdd(set: COpaquePointer?, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetAdd(set?.value?.toCPointer<ByteVar>(), c)
}

public actual fun usetAddAll(set: COpaquePointer?, additionalset: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetAddAll(set?.value?.toCPointer<ByteVar>(), additionalset?.value?.toCPointer<ByteVar>())
}

public actual fun usetAddAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetAddAllCodePoints(set?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strlen)
}

public actual fun usetAddRange(set: COpaquePointer?, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetAddRange(set?.value?.toCPointer<ByteVar>(), start, end)
}

public actual fun usetAddString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetAddString(set?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strlen)
}

public actual fun usetApplyIntPropertyValue(set: COpaquePointer?, prop: UProperty, value: Int, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetApplyIntPropertyValue(set?.value?.toCPointer<ByteVar>(), prop, value, ec?.value?.toCPointer<ByteVar>())
}

public actual fun usetApplyPattern(set: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, options: UInt, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetApplyPattern(set?.value?.toCPointer<ByteVar>(), pattern?.value?.toCPointer<ByteVar>(), patternlength, options, status?.value?.toCPointer<ByteVar>())

public actual fun usetApplyPropertyAlias(set: COpaquePointer?, prop: COpaquePointer?, proplength: Int, value: COpaquePointer?, valuelength: Int, ec: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetApplyPropertyAlias(set?.value?.toCPointer<ByteVar>(), prop?.value?.toCPointer<ByteVar>(), proplength, value?.value?.toCPointer<ByteVar>(), valuelength, ec?.value?.toCPointer<ByteVar>())
}

public actual fun usetCharAt(set: COpaquePointer?, charindex: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetCharAt(set?.value?.toCPointer<ByteVar>(), charindex)

public actual fun usetClear(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetClear(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetClone(set: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetClone(set?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usetCloneAsThawed(set: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetCloneAsThawed(set?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usetClose(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetClose(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetCloseOver(set: COpaquePointer?, attributes: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetCloseOver(set?.value?.toCPointer<ByteVar>(), attributes)
}

public actual fun usetCompact(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetCompact(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetComplement(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetComplement(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetComplementAll(set: COpaquePointer?, complement: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetComplementAll(set?.value?.toCPointer<ByteVar>(), complement?.value?.toCPointer<ByteVar>())
}

public actual fun usetContains(set: COpaquePointer?, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContains(set?.value?.toCPointer<ByteVar>(), c)

public actual fun usetContainsAll(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsAll(set1?.value?.toCPointer<ByteVar>(), set2?.value?.toCPointer<ByteVar>())

public actual fun usetContainsAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsAllCodePoints(set?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strlen)

public actual fun usetContainsNone(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsNone(set1?.value?.toCPointer<ByteVar>(), set2?.value?.toCPointer<ByteVar>())

public actual fun usetContainsRange(set: COpaquePointer?, start: Int, end: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsRange(set?.value?.toCPointer<ByteVar>(), start, end)

public actual fun usetContainsSome(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsSome(set1?.value?.toCPointer<ByteVar>(), set2?.value?.toCPointer<ByteVar>())

public actual fun usetContainsString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetContainsString(set?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strlen)

public actual fun usetEquals(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetEquals(set1?.value?.toCPointer<ByteVar>(), set2?.value?.toCPointer<ByteVar>())

public actual fun usetFreeze(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetFreeze(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetGetItem(set: COpaquePointer?, itemindex: Int, start: COpaquePointer?, end: COpaquePointer?, str: COpaquePointer?, strcapacity: Int, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetGetItem(set?.value?.toCPointer<ByteVar>(), itemindex, start?.value?.toCPointer<ByteVar>(), end?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strcapacity, ec?.value?.toCPointer<ByteVar>())

public actual fun usetGetItemCount(set: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetGetItemCount(set?.value?.toCPointer<ByteVar>())

public actual fun usetGetSerializedRange(set: COpaquePointer?, rangeindex: Int, pstart: COpaquePointer?, pend: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetGetSerializedRange(set?.value?.toCPointer<ByteVar>(), rangeindex, pstart?.value?.toCPointer<ByteVar>(), pend?.value?.toCPointer<ByteVar>())

public actual fun usetGetSerializedRangeCount(set: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetGetSerializedRangeCount(set?.value?.toCPointer<ByteVar>())

public actual fun usetGetSerializedSet(fillset: COpaquePointer?, src: COpaquePointer?, srclength: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetGetSerializedSet(fillset?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength)

public actual fun usetIndexOf(set: COpaquePointer?, c: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetIndexOf(set?.value?.toCPointer<ByteVar>(), c)

public actual fun usetIsEmpty(set: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetIsEmpty(set?.value?.toCPointer<ByteVar>())

public actual fun usetIsFrozen(set: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetIsFrozen(set?.value?.toCPointer<ByteVar>())

public actual fun usetOpen(start: Int, end: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetOpen(start, end)?.let { COpaquePointer(it.toLong()) }

public actual fun usetOpenEmpty(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetOpenEmpty()?.let { COpaquePointer(it.toLong()) }

public actual fun usetOpenPattern(pattern: COpaquePointer?, patternlength: Int, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetOpenPattern(pattern?.value?.toCPointer<ByteVar>(), patternlength, ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usetOpenPatternOptions(pattern: COpaquePointer?, patternlength: Int, options: UInt, ec: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetOpenPatternOptions(pattern?.value?.toCPointer<ByteVar>(), patternlength, options, ec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usetRemove(set: COpaquePointer?, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRemove(set?.value?.toCPointer<ByteVar>(), c)
}

public actual fun usetRemoveAll(set: COpaquePointer?, removeset: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRemoveAll(set?.value?.toCPointer<ByteVar>(), removeset?.value?.toCPointer<ByteVar>())
}

public actual fun usetRemoveAllStrings(set: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRemoveAllStrings(set?.value?.toCPointer<ByteVar>())
}

public actual fun usetRemoveRange(set: COpaquePointer?, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRemoveRange(set?.value?.toCPointer<ByteVar>(), start, end)
}

public actual fun usetRemoveString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRemoveString(set?.value?.toCPointer<ByteVar>(), str?.value?.toCPointer<ByteVar>(), strlen)
}

public actual fun usetResemblesPattern(pattern: COpaquePointer?, patternlength: Int, pos: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetResemblesPattern(pattern?.value?.toCPointer<ByteVar>(), patternlength, pos)

public actual fun usetRetain(set: COpaquePointer?, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRetain(set?.value?.toCPointer<ByteVar>(), start, end)
}

public actual fun usetRetainAll(set: COpaquePointer?, retain: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetRetainAll(set?.value?.toCPointer<ByteVar>(), retain?.value?.toCPointer<ByteVar>())
}

public actual fun usetSerialize(set: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSerialize(set?.value?.toCPointer<ByteVar>(), dest?.value?.toCPointer<ByteVar>(), destcapacity, perrorcode?.value?.toCPointer<ByteVar>())

public actual fun usetSerializedContains(set: COpaquePointer?, c: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSerializedContains(set?.value?.toCPointer<ByteVar>(), c)

public actual fun usetSet(set: COpaquePointer?, start: Int, end: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSet(set?.value?.toCPointer<ByteVar>(), start, end)
}

public actual fun usetSetSerializedToOne(fillset: COpaquePointer?, c: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSetSerializedToOne(fillset?.value?.toCPointer<ByteVar>(), c)
}

public actual fun usetSize(set: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSize(set?.value?.toCPointer<ByteVar>())

public actual fun usetSpan(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSpan(set?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, spancondition)

public actual fun usetSpanBack(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSpanBack(set?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, spancondition)

public actual fun usetSpanBackUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSpanBackUtf8(set?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, spancondition)

public actual fun usetSpanUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetSpanUtf8(set?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, spancondition)

public actual fun usetToPattern(set: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, escapeunprintable: Byte, ec: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usetToPattern(set?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>(), resultcapacity, escapeunprintable, ec?.value?.toCPointer<ByteVar>())

public actual fun uspoofAreConfusable(sc: COpaquePointer?, id1: COpaquePointer?, length1: Int, id2: COpaquePointer?, length2: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofAreConfusable(sc?.value?.toCPointer<ByteVar>(), id1?.value?.toCPointer<ByteVar>(), length1, id2?.value?.toCPointer<ByteVar>(), length2, status?.value?.toCPointer<ByteVar>())

public actual fun uspoofAreConfusableUtf8(sc: COpaquePointer?, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofAreConfusableUtf8(sc?.value?.toCPointer<ByteVar>(), id1?.value?.toCPointer<ByteVar>(), length1, id2?.value?.toCPointer<ByteVar>(), length2, status?.value?.toCPointer<ByteVar>())

public actual fun uspoofCheck(sc: COpaquePointer?, id: COpaquePointer?, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofCheck(sc?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), length, position?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofCheck2(sc: COpaquePointer?, id: COpaquePointer?, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofCheck2(sc?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), length, checkresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofCheck2Utf8(sc: COpaquePointer?, id: Pcstr, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofCheck2Utf8(sc?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), length, checkresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofCheckUtf8(sc: COpaquePointer?, id: Pcstr, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofCheckUtf8(sc?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), length, position?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofClone(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofClone(sc?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofClose(sc: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofClose(sc?.value?.toCPointer<ByteVar>())
}

public actual fun uspoofCloseCheckResult(checkresult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofCloseCheckResult(checkresult?.value?.toCPointer<ByteVar>())
}

public actual fun uspoofGetAllowedChars(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetAllowedChars(sc?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofGetAllowedLocales(sc: COpaquePointer?, status: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetAllowedLocales(sc?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofGetCheckResultChecks(checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetCheckResultChecks(checkresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofGetCheckResultNumerics(checkresult: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetCheckResultNumerics(checkresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: COpaquePointer?, status: COpaquePointer?): URestrictionLevel =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetCheckResultRestrictionLevel(checkresult?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofGetChecks(sc: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetChecks(sc?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uspoofGetInclusionSet(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetInclusionSet(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofGetRecommendedSet(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetRecommendedSet(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofGetRestrictionLevel(sc: COpaquePointer?): URestrictionLevel =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetRestrictionLevel(sc?.value?.toCPointer<ByteVar>())

public actual fun uspoofGetSkeleton(sc: COpaquePointer?, type: UInt, id: COpaquePointer?, length: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetSkeleton(sc?.value?.toCPointer<ByteVar>(), type, id?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uspoofGetSkeletonUtf8(sc: COpaquePointer?, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofGetSkeletonUtf8(sc?.value?.toCPointer<ByteVar>(), type, id?.value?.toCPointer<ByteVar>(), length, dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun uspoofOpen(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofOpen(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofOpenCheckResult(status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofOpenCheckResult(status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofOpenFromSerialized(data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofOpenFromSerialized(data?.value?.toCPointer<ByteVar>(), length, pactuallength?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: COpaquePointer?, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofOpenFromSource(confusables?.value?.toCPointer<ByteVar>(), confusableslen, confusableswholescript?.value?.toCPointer<ByteVar>(), confusableswholescriptlen, errtype?.value?.toCPointer<ByteVar>(), pe?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uspoofSerialize(sc: COpaquePointer?, data: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofSerialize(sc?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), capacity, status?.value?.toCPointer<ByteVar>())

public actual fun uspoofSetAllowedChars(sc: COpaquePointer?, chars: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofSetAllowedChars(sc?.value?.toCPointer<ByteVar>(), chars?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uspoofSetAllowedLocales(sc: COpaquePointer?, localeslist: Pcstr, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofSetAllowedLocales(sc?.value?.toCPointer<ByteVar>(), localeslist?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun uspoofSetChecks(sc: COpaquePointer?, checks: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofSetChecks(sc?.value?.toCPointer<ByteVar>(), checks, status?.value?.toCPointer<ByteVar>())
}

public actual fun uspoofSetRestrictionLevel(sc: COpaquePointer?, restrictionlevel: URestrictionLevel) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_uspoofSetRestrictionLevel(sc?.value?.toCPointer<ByteVar>(), restrictionlevel)
}

public actual fun usprepClose(profile: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprepClose(profile?.value?.toCPointer<ByteVar>())
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprepOpen(path?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprepOpenByType(type, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun usprepPrepare(prep: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destcapacity: Int, options: Int, parseerror: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_usprepPrepare(prep?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), srclength, dest?.value?.toCPointer<ByteVar>(), destcapacity, options, parseerror?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun utextChar32At(ut: COpaquePointer?, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextChar32At(ut?.value?.toCPointer<ByteVar>(), nativeindex)

public actual fun utextClone(dest: COpaquePointer?, src: COpaquePointer?, deep: Byte, readonly: Byte, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextClone(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), deep, readonly, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utextClose(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextClose(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utextCopy(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextCopy(ut?.value?.toCPointer<ByteVar>(), nativestart, nativelimit, destindex, move, status?.value?.toCPointer<ByteVar>())
}

public actual fun utextCurrent32(ut: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextCurrent32(ut?.value?.toCPointer<ByteVar>())

public actual fun utextEquals(a: COpaquePointer?, b: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextEquals(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())

public actual fun utextExtract(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextExtract(ut?.value?.toCPointer<ByteVar>(), nativestart, nativelimit, dest?.value?.toCPointer<ByteVar>(), destcapacity, status?.value?.toCPointer<ByteVar>())

public actual fun utextFreeze(ut: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextFreeze(ut?.value?.toCPointer<ByteVar>())
}

public actual fun utextGetNativeIndex(ut: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextGetNativeIndex(ut?.value?.toCPointer<ByteVar>())

public actual fun utextGetPreviousNativeIndex(ut: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextGetPreviousNativeIndex(ut?.value?.toCPointer<ByteVar>())

public actual fun utextHasMetaData(ut: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextHasMetaData(ut?.value?.toCPointer<ByteVar>())

public actual fun utextIsLengthExpensive(ut: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextIsLengthExpensive(ut?.value?.toCPointer<ByteVar>())

public actual fun utextIsWritable(ut: COpaquePointer?): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextIsWritable(ut?.value?.toCPointer<ByteVar>())

public actual fun utextMoveIndex32(ut: COpaquePointer?, delta: Int): Byte =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextMoveIndex32(ut?.value?.toCPointer<ByteVar>(), delta)

public actual fun utextNativeLength(ut: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextNativeLength(ut?.value?.toCPointer<ByteVar>())

public actual fun utextNext32(ut: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextNext32(ut?.value?.toCPointer<ByteVar>())

public actual fun utextNext32From(ut: COpaquePointer?, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextNext32From(ut?.value?.toCPointer<ByteVar>(), nativeindex)

public actual fun utextOpenUchars(ut: COpaquePointer?, s: COpaquePointer?, length: Long, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextOpenUchars(ut?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utextOpenUtf8(ut: COpaquePointer?, s: Pcstr, length: Long, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextOpenUtf8(ut?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>(), length, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utextPrevious32(ut: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextPrevious32(ut?.value?.toCPointer<ByteVar>())

public actual fun utextPrevious32From(ut: COpaquePointer?, nativeindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextPrevious32From(ut?.value?.toCPointer<ByteVar>(), nativeindex)

public actual fun utextReplace(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, replacementtext: COpaquePointer?, replacementlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextReplace(ut?.value?.toCPointer<ByteVar>(), nativestart, nativelimit, replacementtext?.value?.toCPointer<ByteVar>(), replacementlength, status?.value?.toCPointer<ByteVar>())

public actual fun utextSetNativeIndex(ut: COpaquePointer?, nativeindex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextSetNativeIndex(ut?.value?.toCPointer<ByteVar>(), nativeindex)
}

public actual fun utextSetup(ut: COpaquePointer?, extraspace: Int, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utextSetup(ut?.value?.toCPointer<ByteVar>(), extraspace, status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utf8AppendCharSafeBody(s: COpaquePointer?, i: Int, length: Int, c: Int, piserror: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8AppendCharSafeBody(s?.value?.toCPointer<ByteVar>(), i, length, c, piserror?.value?.toCPointer<ByteVar>())

public actual fun utf8Back1SafeBody(s: COpaquePointer?, start: Int, i: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8Back1SafeBody(s?.value?.toCPointer<ByteVar>(), start, i)

public actual fun utf8NextCharSafeBody(s: COpaquePointer?, pi: COpaquePointer?, length: Int, c: Int, strict: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8NextCharSafeBody(s?.value?.toCPointer<ByteVar>(), pi?.value?.toCPointer<ByteVar>(), length, c, strict)

public actual fun utf8PrevCharSafeBody(s: COpaquePointer?, start: Int, pi: COpaquePointer?, c: Int, strict: Byte): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utf8PrevCharSafeBody(s?.value?.toCPointer<ByteVar>(), start, pi?.value?.toCPointer<ByteVar>(), c, strict)

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscaleFromInt64(othertime, timescale, status?.value?.toCPointer<ByteVar>())

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscaleGetTimeScaleValue(timescale, value, status?.value?.toCPointer<ByteVar>())

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utmscaleToInt64(universaltime, timescale, status?.value?.toCPointer<ByteVar>())

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceFormat(outbuf?.value?.toCPointer<ByteVar>(), capacity, indent, fmt?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceFunctionName(fnnumber)?.let { COpaquePointer(it.toLong()) }

public actual fun utraceGetFunctions(context: COpaquePointer?, e: COpaquePointer?, x: COpaquePointer?, d: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceGetFunctions(context?.value?.toCPointer<ByteVar>(), e?.value?.toCPointer<ByteVar>(), x?.value?.toCPointer<ByteVar>(), d?.value?.toCPointer<ByteVar>())
}

public actual fun utraceGetLevel(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceGetLevel()

public actual fun utraceSetFunctions(context: COpaquePointer?, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceSetFunctions(context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun utraceSetLevel(tracelevel: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceSetLevel(tracelevel)
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utraceVformat(outbuf?.value?.toCPointer<ByteVar>(), capacity, indent, fmt?.value?.toCPointer<ByteVar>(), args?.value?.toCPointer<ByteVar>())

public actual fun utransClone(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransClone(trans?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransClose(trans: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransClose(trans?.value?.toCPointer<ByteVar>())
}

public actual fun utransCountAvailableIds(): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransCountAvailableIds()

public actual fun utransGetSourceSet(trans: COpaquePointer?, ignorefilter: Byte, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransGetSourceSet(trans?.value?.toCPointer<ByteVar>(), ignorefilter, fillin?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransGetUnicodeId(trans: COpaquePointer?, resultlength: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransGetUnicodeId(trans?.value?.toCPointer<ByteVar>(), resultlength?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransOpenIds(perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransOpenIds(perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransOpenInverse(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransOpenInverse(trans?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransOpenU(id: COpaquePointer?, idlength: Int, dir: UTransDirection, rules: COpaquePointer?, ruleslength: Int, parseerror: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransOpenU(id?.value?.toCPointer<ByteVar>(), idlength, dir, rules?.value?.toCPointer<ByteVar>(), ruleslength, parseerror?.value?.toCPointer<ByteVar>(), perrorcode?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utransRegister(adoptedtrans: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransRegister(adoptedtrans?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun utransSetFilter(trans: COpaquePointer?, filterpattern: COpaquePointer?, filterpatternlen: Int, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransSetFilter(trans?.value?.toCPointer<ByteVar>(), filterpattern?.value?.toCPointer<ByteVar>(), filterpatternlen, status?.value?.toCPointer<ByteVar>())
}

public actual fun utransToRules(trans: COpaquePointer?, escapeunprintable: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransToRules(trans?.value?.toCPointer<ByteVar>(), escapeunprintable, result?.value?.toCPointer<ByteVar>(), resultlength, status?.value?.toCPointer<ByteVar>())

public actual fun utransTrans(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransTrans(trans?.value?.toCPointer<ByteVar>(), rep?.value?.toCPointer<ByteVar>(), repfunc?.value?.toCPointer<ByteVar>(), start, limit?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun utransTransIncremental(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, pos: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransTransIncremental(trans?.value?.toCPointer<ByteVar>(), rep?.value?.toCPointer<ByteVar>(), repfunc?.value?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun utransTransIncrementalUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, pos: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransTransIncrementalUchars(trans?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength?.value?.toCPointer<ByteVar>(), textcapacity, pos?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun utransTransUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransTransUchars(trans?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), textlength?.value?.toCPointer<ByteVar>(), textcapacity, start, limit?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
}

public actual fun utransUnregisterId(id: COpaquePointer?, idlength: Int) {
    io.github.kotlinmania.windowssys.windows.win32.globalization.cinterop.windowssys_windows_win32_globalization_utransUnregisterId(id?.value?.toCPointer<ByteVar>(), idlength)
}
