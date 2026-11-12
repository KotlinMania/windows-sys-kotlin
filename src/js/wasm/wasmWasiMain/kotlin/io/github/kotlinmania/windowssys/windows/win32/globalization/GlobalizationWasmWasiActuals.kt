@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun adjustCalendarDate(lpcaldatetime: MutPtr<Caldatetime>, calunit: CaldatetimeDateunit, amount: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationAdjustCalendarDate")

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr<Byte>, cchcount1: Int, lpstring2: ConstPtr<Byte>, cchcount2: Int): ComparestringResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationCompareStringA")

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, lparam: Lparam): ComparestringResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationCompareStringEx")

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationCompareStringOrdinal")

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationCompareStringW")

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr<Caldatetime>, lpsystime: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationConvertDefaultLocale")
private external fun wasiWindowssysWindowsWin32GlobalizationConvertDefaultLocale(locale: Int): Int

public actual fun convertDefaultLocale(locale: UInt): UInt =
    wasiWindowssysWindowsWin32GlobalizationConvertDefaultLocale(locale.toInt()).toUInt()

public actual fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr<Systemtime>, calid: UInt, lpcaldatetime: MutPtr<Caldatetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime")

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumCalendarInfoA")

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumCalendarInfoExA")

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumCalendarInfoExEx")

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumCalendarInfoExW")

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumCalendarInfoW")

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumDateFormatsA")

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumDateFormatsExA")

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumDateFormatsExEx")

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumDateFormatsExW")

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumDateFormatsW")

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA")

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW")

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemCodePagesA")

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemCodePagesW")

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemGeoID")

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemGeoNames")

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA")

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW")

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemLocalesA")

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemLocalesEx")

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumSystemLocalesW")

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumTimeFormatsA")

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumTimeFormatsEx")

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumTimeFormatsW")

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumUILanguagesA")

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationEnumUILanguagesW")

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationFindNLSString")

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationFindNLSStringEx")

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationFindStringOrdinal")

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationFoldStringA")

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationFoldStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetACP")
private external fun wasiWindowssysWindowsWin32GlobalizationGetACP(): Int

public actual fun getACP(): UInt =
    wasiWindowssysWindowsWin32GlobalizationGetACP().toUInt()

public actual fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr<Cpinfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCPInfo")

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCPInfoExA")

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCPInfoExW")

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr<Caldatetime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCalendarDateFormatEx")

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCalendarInfoA")

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCalendarInfoEx")

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCalendarInfoW")

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr<Caldatetime>, lpcalmaxdatetime: MutPtr<Caldatetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange")

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Currencyfmta>, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCurrencyFormatA")

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCurrencyFormatEx")

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetCurrencyFormatW")

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDateFormatA")

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDateFormatEx")

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDateFormatW")

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList")

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDurationFormat")

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetDurationFormatEx")

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr<Filemuiinfo>, pcbfilemuiinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetFileMUIInfo")

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr<UInt>, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr<UInt>, pululenumerator: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetFileMUIPath")

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetGeoInfoA")

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetGeoInfoEx")

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetGeoInfoW")

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetLocaleInfoA")

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetLocaleInfoEx")

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetLocaleInfoW")

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr<Nlsversioninfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetNLSVersion")

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr<Nlsversioninfoex>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetNLSVersionEx")

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Numberfmta>, lpnumberstr: Pstr, cchnumber: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetNumberFormatA")

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetNumberFormatEx")

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetNumberFormatW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetOEMCP")
private external fun wasiWindowssysWindowsWin32GlobalizationGetOEMCP(): Int

public actual fun getOEMCP(): UInt =
    wasiWindowssysWindowsWin32GlobalizationGetOEMCP().toUInt()

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages")

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetStringScripts")

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetStringTypeA")

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetStringTypeExA")

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetStringTypeExW")

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetStringTypeW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetSystemDefaultLCID")
private external fun wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultLCID(): Int

public actual fun getSystemDefaultLCID(): UInt =
    wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultLCID().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetSystemDefaultLangID")
private external fun wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultLangID(): Int

public actual fun getSystemDefaultLangID(): UShort =
    wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultLangID().toUShort()

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage")
private external fun wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage(): Int

public actual fun getSystemDefaultUILanguage(): UShort =
    wasiWindowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage().toUShort()

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages")

public actual fun getTextCharset(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetTextCharset")

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr<Fontsignature>, dwflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetTextCharsetInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetThreadLocale")
private external fun wasiWindowssysWindowsWin32GlobalizationGetThreadLocale(): Int

public actual fun getThreadLocale(): UInt =
    wasiWindowssysWindowsWin32GlobalizationGetThreadLocale().toUInt()

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetThreadUILanguage")
private external fun wasiWindowssysWindowsWin32GlobalizationGetThreadUILanguage(): Int

public actual fun getThreadUILanguage(): UShort =
    wasiWindowssysWindowsWin32GlobalizationGetThreadUILanguage().toUShort()

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetTimeFormatA")

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetTimeFormatEx")

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetTimeFormatW")

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr<UInt>, pattributes: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetUILanguageInfo")

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetUserDefaultGeoName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetUserDefaultLCID")
private external fun wasiWindowssysWindowsWin32GlobalizationGetUserDefaultLCID(): Int

public actual fun getUserDefaultLCID(): UInt =
    wasiWindowssysWindowsWin32GlobalizationGetUserDefaultLCID().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetUserDefaultLangID")
private external fun wasiWindowssysWindowsWin32GlobalizationGetUserDefaultLangID(): Int

public actual fun getUserDefaultLangID(): UShort =
    wasiWindowssysWindowsWin32GlobalizationGetUserDefaultLangID().toUShort()

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetUserDefaultLocaleName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetUserDefaultUILanguage")
private external fun wasiWindowssysWindowsWin32GlobalizationGetUserDefaultUILanguage(): Int

public actual fun getUserDefaultUILanguage(): UShort =
    wasiWindowssysWindowsWin32GlobalizationGetUserDefaultUILanguage().toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationGetUserGeoID")
private external fun wasiWindowssysWindowsWin32GlobalizationGetUserGeoID(geoclass: Int): Int

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    wasiWindowssysWindowsWin32GlobalizationGetUserGeoID(geoclass)

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationGetUserPreferredUILanguages")

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIdnToAscii")

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIdnToNameprepUnicode")

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIdnToUnicode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsCalendarLeapYear")
private external fun wasiWindowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid: Int, year: Int, era: Int): Int

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsDBCSLeadByte")
private external fun wasiWindowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar: Int): Int

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsDBCSLeadByteEx")
private external fun wasiWindowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage: Int, testchar: Int): Int

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage.toInt(), testchar.toInt())

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr<Nlsversioninfo>, lpstring: Pcwstr, cchstr: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsNLSDefinedString")

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsNormalizedString")

public actual fun isTextUnicode(lpv: ConstPtr<CVoid>, isize: Int, lpiresult: MutPtr<IsTextUnicodeResult>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsTextUnicode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsValidCodePage")
private external fun wasiWindowssysWindowsWin32GlobalizationIsValidCodePage(codepage: Int): Int

public actual fun isValidCodePage(codepage: UInt): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsValidCodePage(codepage.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsValidLanguageGroup")
private external fun wasiWindowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup: Int, dwflags: Int): Int

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationIsValidLocale")
private external fun wasiWindowssysWindowsWin32GlobalizationIsValidLocale(locale: Int, dwflags: Int): Int

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    wasiWindowssysWindowsWin32GlobalizationIsValidLocale(locale.toInt(), dwflags.toInt())

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsValidLocaleName")

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr<Nlsversioninfoex>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsValidNLSVersion")

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationIsWellFormedTag")

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLCIDToLocaleName")

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLCMapStringA")

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLCMapStringEx")

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLCMapStringW")

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLocaleNameToLCID")

public actual fun mappingDoAction(pbag: MutPtr<MappingPropertyBag>, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMappingDoAction")

public actual fun mappingFreePropertyBag(pbag: ConstPtr<MappingPropertyBag>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMappingFreePropertyBag")

public actual fun mappingFreeServices(pserviceinfo: ConstPtr<MappingServiceInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMappingFreeServices")

public actual fun mappingGetServices(poptions: ConstPtr<MappingEnumOptions>, prgservices: MutPtr<MutPtr<MappingServiceInfo>>, pdwservicescount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMappingGetServices")

public actual fun mappingRecognizeText(pserviceinfo: ConstPtr<MappingServiceInfo>, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr<MappingOptions>, pbag: MutPtr<MappingPropertyBag>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMappingRecognizeText")

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationMultiByteToWideChar")

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationNormalizeString")

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationNotifyUILanguageChange")

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationResolveLocaleName")

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages")

public actual fun scriptApplyDigitSubstitution(psds: ConstPtr<ScriptDigitsubstitute>, psc: MutPtr<ScriptControl>, pss: MutPtr<ScriptState>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution")

public actual fun scriptApplyLogicalWidth(pidx: ConstPtr<Int>, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pabc: MutPtr<Abc>, pijustify: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptApplyLogicalWidth")

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr<ScriptAnalysis>, psla: MutPtr<ScriptLogattr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptBreak")

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pix: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptCPtoX")

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, tmheight: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptCacheGetHeight")

public actual fun scriptFreeCache(psc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptFreeCache")

public actual fun scriptGetCMap(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetCMap")

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr<UShort>, pcalternates: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs")

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetFontFeatureTags")

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetFontLanguageTags")

public actual fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, sfp: MutPtr<ScriptFontproperties>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetFontProperties")

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, cmaxtags: Int, pscripttags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetFontScriptTags")

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, wglyph: UShort, pabc: MutPtr<Abc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth")

public actual fun scriptGetLogicalWidths(psa: ConstPtr<ScriptAnalysis>, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr<Int>, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, pidx: ConstPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetLogicalWidths")

public actual fun scriptGetProperties(ppsp: MutPtr<MutPtr<MutPtr<ScriptProperties>>>, pinumscripts: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptGetProperties")

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptIsComplex")

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pcitems: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptItemize")

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pscripttags: MutPtr<UInt>, pcitems: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptItemizeOpenType")

public actual fun scriptJustify(psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptJustify")

public actual fun scriptLayout(cruns: Int, pblevel: ConstPtr<UByte>, pivisualtological: MutPtr<Int>, pilogicaltovisual: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptLayout")

public actual fun scriptPlace(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwglyphs: ConstPtr<UShort>, cglyphs: Int, psva: ConstPtr<ScriptVisattr>, psa: MutPtr<ScriptAnalysis>, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptPlace")

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr<UShort>, pcharprops: ConstPtr<ScriptCharprop>, cchars: Int, pwglyphs: ConstPtr<UShort>, pglyphprops: ConstPtr<ScriptGlyphprop>, cglyphs: Int, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptPlaceOpenType")

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr<Int>, poutgoffset: MutPtr<Goffset>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptPositionSingleGlyph")

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr<ScriptDigitsubstitute>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution")

public actual fun scriptShape(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr<ScriptAnalysis>, pwoutglyphs: MutPtr<UShort>, pwlogclust: MutPtr<UShort>, psva: MutPtr<ScriptVisattr>, pcglyphs: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptShape")

public actual fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr<UShort>, pcharprops: MutPtr<ScriptCharprop>, pwoutglyphs: MutPtr<UShort>, poutglyphprops: MutPtr<ScriptGlyphprop>, pcglyphs: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptShapeOpenType")

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr<CVoid>, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pidx: ConstPtr<Int>, ptabdef: ConstPtr<ScriptTabdef>, pbinclass: ConstPtr<UByte>, pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringAnalyse")

public actual fun scriptStringCPtoX(ssa: ConstPtr<CVoid>, icp: Int, ftrailing: Bool, px: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringCPtoX")

public actual fun scriptStringFree(pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringFree")

public actual fun scriptStringGetLogicalWidths(ssa: ConstPtr<CVoid>, pidx: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths")

public actual fun scriptStringGetOrder(ssa: ConstPtr<CVoid>, puorder: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringGetOrder")

public actual fun scriptStringOut(ssa: ConstPtr<CVoid>, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr<Rect>, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringOut")

public actual fun scriptStringValidate(ssa: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringValidate")

public actual fun scriptStringXtoCP(ssa: ConstPtr<CVoid>, ix: Int, pich: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringXtoCP")

public actual fun scriptStringPLogAttr(ssa: ConstPtr<CVoid>): MutPtr<ScriptLogattr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringPLogAttr")

public actual fun scriptStringPSize(ssa: ConstPtr<CVoid>): MutPtr<Size> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringPSize")

public actual fun scriptStringPcOutChars(ssa: ConstPtr<CVoid>): MutPtr<Int> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptStringPcOutChars")

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph")

public actual fun scriptTextOut(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr<Rect>, psa: ConstPtr<ScriptAnalysis>, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr<UShort>, cglyphs: Int, piadvance: ConstPtr<Int>, pijustify: ConstPtr<Int>, pgoffset: ConstPtr<Goffset>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptTextOut")

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, picp: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationScriptXtoCP")

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetCalendarInfoA")

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetCalendarInfoW")

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetLocaleInfoA")

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetLocaleInfoW")

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationSetThreadLocale")
private external fun wasiWindowssysWindowsWin32GlobalizationSetThreadLocale(locale: Int): Int

public actual fun setThreadLocale(locale: UInt): Bool =
    wasiWindowssysWindowsWin32GlobalizationSetThreadLocale(locale.toInt())

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages")

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr<UInt>, snapshot: MutPtr<Hsaveduilanguages>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationSetThreadUILanguage")
private external fun wasiWindowssysWindowsWin32GlobalizationSetThreadUILanguage(langid: Int): Int

public actual fun setThreadUILanguage(langid: UShort): UShort =
    wasiWindowssysWindowsWin32GlobalizationSetThreadUILanguage(langid.toInt()).toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationSetUserGeoID")
private external fun wasiWindowssysWindowsWin32GlobalizationSetUserGeoID(geoid: Int): Int

public actual fun setUserGeoID(geoid: Int): Bool =
    wasiWindowssysWindowsWin32GlobalizationSetUserGeoID(geoid)

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationSetUserGeoName")

public actual fun translateCharsetInfo(lpsrc: MutPtr<UInt>, lpcs: MutPtr<Charsetinfo>, dwflags: TranslateCharsetInfoFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationTranslateCharsetInfo")

public actual fun ucnvFromUCallbackEscape(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape")

public actual fun ucnvFromUCallbackSkip(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip")

public actual fun ucnvFromUCallbackStop(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUCallbackStop")

public actual fun ucnvFromUCallbackSubstitute(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute")

public actual fun ucnvToUCallbackEscape(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUCallbackEscape")

public actual fun ucnvToUCallbackSkip(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUCallbackSkip")

public actual fun ucnvToUCallbackStop(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUCallbackStop")

public actual fun ucnvToUCallbackSubstitute(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute")

public actual fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr<Caldatetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek")

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationVerifyScripts")

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr<Bool>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationWideCharToMultiByte")

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcatA")

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcatW")

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcmpA")

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcmpW")

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcmpiA")

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcmpiW")

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcpyA")

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcpyW")

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcpynA")

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrcpynW")

public actual fun lstrlenA(lpstring: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrlenA")

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationLstrlenW")

public actual fun uUcharsToChars(us: ConstPtr<UShort>, cs: Pcstr, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUUcharsToChars")

public actual fun uAustrcpy(dst: Pcstr, src: ConstPtr<UShort>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUAustrcpy")

public actual fun uAustrncpy(dst: Pcstr, src: ConstPtr<UShort>, n: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUAustrncpy")

public actual fun uCatclose(catd: MutPtr<UResourceBundle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCatclose")

public actual fun uCatgets(catd: MutPtr<UResourceBundle>, setNum: Int, msgNum: Int, s: ConstPtr<UShort>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCatgets")

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCatopen")

public actual fun uCharAge(c: Int, versionarray: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCharAge")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUCharDigitValue")
private external fun wasiWindowssysWindowsWin32GlobalizationUCharDigitValue(c: Int): Int

public actual fun uCharDigitValue(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUCharDigitValue(c)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUCharDirection")
private external fun wasiWindowssysWindowsWin32GlobalizationUCharDirection(c: Int): Int

public actual fun uCharDirection(c: Int): UCharDirection =
    wasiWindowssysWindowsWin32GlobalizationUCharDirection(c)

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCharFromName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUCharMirror")
private external fun wasiWindowssysWindowsWin32GlobalizationUCharMirror(c: Int): Int

public actual fun uCharMirror(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUCharMirror(c)

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCharName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUCharType")
private external fun wasiWindowssysWindowsWin32GlobalizationUCharType(c: Int): Int

public actual fun uCharType(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUCharType(c).toByte()

public actual fun uCharsToUchars(cs: Pcstr, us: MutPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCharsToUchars")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUCleanup")
private external fun wasiWindowssysWindowsWin32GlobalizationUCleanup(): Unit

public actual fun uCleanup(): Unit =
    wasiWindowssysWindowsWin32GlobalizationUCleanup()

public actual fun uCountChar32(s: ConstPtr<UShort>, length: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUCountChar32")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUDigit")
private external fun wasiWindowssysWindowsWin32GlobalizationUDigit(ch: Int, radix: Int): Int

public actual fun uDigit(ch: Int, radix: Byte): Int =
    wasiWindowssysWindowsWin32GlobalizationUDigit(ch, radix.toInt())

public actual fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr<UEnumCharNamesFn>, context: MutPtr<CVoid>, namechoice: UCharNameChoice, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUEnumCharNames")

public actual fun uEnumCharTypes(enumrange: MutPtr<UCharEnumTypeRange>, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUEnumCharTypes")

public actual fun uErrorName(code: UErrorCode): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUErrorName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUFoldCase")
private external fun wasiWindowssysWindowsWin32GlobalizationUFoldCase(c: Int, options: Int): Int

public actual fun uFoldCase(c: Int, options: UInt): Int =
    wasiWindowssysWindowsWin32GlobalizationUFoldCase(c, options.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUForDigit")
private external fun wasiWindowssysWindowsWin32GlobalizationUForDigit(digit: Int, radix: Int): Int

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    wasiWindowssysWindowsWin32GlobalizationUForDigit(digit, radix.toInt())

public actual fun uFormatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUFormatMessage")

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUFormatMessageWithError")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetBidiPairedBracket")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c: Int): Int

public actual fun uGetBidiPairedBracket(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c)

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetBinaryPropertySet")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetCombiningClass")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetCombiningClass(c: Int): Int

public actual fun uGetCombiningClass(c: Int): UByte =
    wasiWindowssysWindowsWin32GlobalizationUGetCombiningClass(c).toUByte()

public actual fun uGetDataVersion(dataversionfillin: MutPtr<UByte>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetDataVersion")

public actual fun uGetFcNfkcClosure(c: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetFcNfkcClosure")

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPMap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetIntPropertyMap")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which: Int): Int

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetIntPropertyMinValue")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which: Int): Int

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetIntPropertyValue")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyValue(c: Int, which: Int): Int

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    wasiWindowssysWindowsWin32GlobalizationUGetIntPropertyValue(c, which)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUGetNumericValue")
private external fun wasiWindowssysWindowsWin32GlobalizationUGetNumericValue(c: Int): Double

public actual fun uGetNumericValue(c: Int): Double =
    wasiWindowssysWindowsWin32GlobalizationUGetNumericValue(c)

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetPropertyEnum")

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetPropertyName")

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetPropertyValueEnum")

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetPropertyValueName")

public actual fun uGetUnicodeVersion(versionarray: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetUnicodeVersion")

public actual fun uGetVersion(versionarray: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUGetVersion")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUHasBinaryProperty")
private external fun wasiWindowssysWindowsWin32GlobalizationUHasBinaryProperty(c: Int, which: Int): Int

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    wasiWindowssysWindowsWin32GlobalizationUHasBinaryProperty(c, which).toByte()

public actual fun uInit(status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUInit")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsIdignorable")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsIdignorable(c: Int): Int

public actual fun uIsIdignorable(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsIdignorable(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsIdpart")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsIdpart(c: Int): Int

public actual fun uIsIdpart(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsIdpart(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsIdstart")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsIdstart(c: Int): Int

public actual fun uIsIdstart(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsIdstart(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsIsocontrol")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsIsocontrol(c: Int): Int

public actual fun uIsIsocontrol(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsIsocontrol(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsJavaIdpart")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsJavaIdpart(c: Int): Int

public actual fun uIsJavaIdpart(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsJavaIdpart(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsJavaIdstart")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsJavaIdstart(c: Int): Int

public actual fun uIsJavaIdstart(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsJavaIdstart(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsJavaSpaceChar")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c: Int): Int

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsMirrored")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsMirrored(c: Int): Int

public actual fun uIsMirrored(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsMirrored(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsUalphabetic")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsUalphabetic(c: Int): Int

public actual fun uIsUalphabetic(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsUalphabetic(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsUlowercase")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsUlowercase(c: Int): Int

public actual fun uIsUlowercase(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsUlowercase(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsUuppercase")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsUuppercase(c: Int): Int

public actual fun uIsUuppercase(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsUuppercase(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsUwhiteSpace")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsUwhiteSpace(c: Int): Int

public actual fun uIsUwhiteSpace(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsUwhiteSpace(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsWhitespace")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsWhitespace(c: Int): Int

public actual fun uIsWhitespace(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsWhitespace(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsalnum")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsalnum(c: Int): Int

public actual fun uIsalnum(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsalnum(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsalpha")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsalpha(c: Int): Int

public actual fun uIsalpha(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsalpha(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsbase")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsbase(c: Int): Int

public actual fun uIsbase(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsbase(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsblank")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsblank(c: Int): Int

public actual fun uIsblank(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsblank(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIscntrl")
private external fun wasiWindowssysWindowsWin32GlobalizationUIscntrl(c: Int): Int

public actual fun uIscntrl(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIscntrl(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsdefined")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsdefined(c: Int): Int

public actual fun uIsdefined(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsdefined(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsdigit")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsdigit(c: Int): Int

public actual fun uIsdigit(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsdigit(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsgraph")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsgraph(c: Int): Int

public actual fun uIsgraph(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsgraph(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIslower")
private external fun wasiWindowssysWindowsWin32GlobalizationUIslower(c: Int): Int

public actual fun uIslower(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIslower(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsprint")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsprint(c: Int): Int

public actual fun uIsprint(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsprint(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIspunct")
private external fun wasiWindowssysWindowsWin32GlobalizationUIspunct(c: Int): Int

public actual fun uIspunct(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIspunct(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsspace")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsspace(c: Int): Int

public actual fun uIsspace(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsspace(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIstitle")
private external fun wasiWindowssysWindowsWin32GlobalizationUIstitle(c: Int): Int

public actual fun uIstitle(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIstitle(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsupper")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsupper(c: Int): Int

public actual fun uIsupper(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsupper(c).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUIsxdigit")
private external fun wasiWindowssysWindowsWin32GlobalizationUIsxdigit(c: Int): Int

public actual fun uIsxdigit(c: Int): Byte =
    wasiWindowssysWindowsWin32GlobalizationUIsxdigit(c).toByte()

public actual fun uMemcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, length: Int, options: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemcasecmp")

public actual fun uMemchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemchr")

public actual fun uMemchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemchr32")

public actual fun uMemcmp(buf1: ConstPtr<UShort>, buf2: ConstPtr<UShort>, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemcmp")

public actual fun uMemcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemcmpCodePointOrder")

public actual fun uMemcpy(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemcpy")

public actual fun uMemmove(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemmove")

public actual fun uMemrchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemrchr")

public actual fun uMemrchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemrchr32")

public actual fun uMemset(dest: MutPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUMemset")

public actual fun uParseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUParseMessage")

public actual fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUParseMessageWithError")

public actual fun uSetMemoryFunctions(context: ConstPtr<CVoid>, a: MutPtr<UMemAllocFn>, r: MutPtr<UMemReallocFn>, f: MutPtr<UMemFreeFn>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUSetMemoryFunctions")

public actual fun uShapeArabic(source: ConstPtr<UShort>, sourcelength: Int, dest: MutPtr<UShort>, destsize: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUShapeArabic")

public actual fun uStrCaseCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrCaseCompare")

public actual fun uStrCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, codepointorder: Byte): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrCompare")

public actual fun uStrCompareIter(iter1: MutPtr<UCharIterator>, iter2: MutPtr<UCharIterator>, codepointorder: Byte): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrCompareIter")

public actual fun uStrFindFirst(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFindFirst")

public actual fun uStrFindLast(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFindLast")

public actual fun uStrFoldCase(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFoldCase")

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub")

public actual fun uStrFromUtf32(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromUtf32")

public actual fun uStrFromUtf32WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromUtf32WithSub")

public actual fun uStrFromUtf8(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromUtf8")

public actual fun uStrFromUtf8Lenient(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromUtf8Lenient")

public actual fun uStrFromUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromUtf8WithSub")

public actual fun uStrFromWcs(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcwstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrFromWcs")

public actual fun uStrHasMoreChar32Than(s: ConstPtr<UShort>, length: Int, number: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrHasMoreChar32Than")

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8")

public actual fun uStrToLower(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToLower")

public actual fun uStrToTitle(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, titleiter: MutPtr<UBreakIterator>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToTitle")

public actual fun uStrToUtf32(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToUtf32")

public actual fun uStrToUtf32WithSub(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToUtf32WithSub")

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToUtf8")

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToUtf8WithSub")

public actual fun uStrToUpper(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToUpper")

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrToWcs")

public actual fun uStrcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, options: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcasecmp")

public actual fun uStrcat(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcat")

public actual fun uStrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrchr")

public actual fun uStrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrchr32")

public actual fun uStrcmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcmp")

public actual fun uStrcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcmpCodePointOrder")

public actual fun uStrcpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcpy")

public actual fun uStrcspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrcspn")

public actual fun uStrlen(s: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrlen")

public actual fun uStrncasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int, options: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrncasecmp")

public actual fun uStrncat(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrncat")

public actual fun uStrncmp(ucs1: ConstPtr<UShort>, ucs2: ConstPtr<UShort>, n: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrncmp")

public actual fun uStrncmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrncmpCodePointOrder")

public actual fun uStrncpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrncpy")

public actual fun uStrpbrk(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrpbrk")

public actual fun uStrrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrrchr")

public actual fun uStrrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrrchr32")

public actual fun uStrrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrrstr")

public actual fun uStrspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrspn")

public actual fun uStrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrstr")

public actual fun uStrtokR(src: MutPtr<UShort>, delim: ConstPtr<UShort>, savestate: MutPtr<MutPtr<UShort>>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUStrtokR")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUTolower")
private external fun wasiWindowssysWindowsWin32GlobalizationUTolower(c: Int): Int

public actual fun uTolower(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUTolower(c)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUTotitle")
private external fun wasiWindowssysWindowsWin32GlobalizationUTotitle(c: Int): Int

public actual fun uTotitle(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUTotitle(c)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUToupper")
private external fun wasiWindowssysWindowsWin32GlobalizationUToupper(c: Int): Int

public actual fun uToupper(c: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUToupper(c)

public actual fun uUastrcpy(dst: MutPtr<UShort>, src: Pcstr): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUUastrcpy")

public actual fun uUastrncpy(dst: MutPtr<UShort>, src: Pcstr, n: Int): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUUastrncpy")

public actual fun uUnescape(src: Pcstr, dest: MutPtr<UShort>, destcapacity: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUUnescape")

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr<Int>, length: Int, context: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUUnescapeAt")

public actual fun uVersionFromString(versionarray: MutPtr<UByte>, versionstring: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVersionFromString")

public actual fun uVersionFromUstring(versionarray: MutPtr<UByte>, versionstring: ConstPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVersionFromUstring")

public actual fun uVersionToString(versionarray: ConstPtr<UByte>, versionstring: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVersionToString")

public actual fun uVformatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVformatMessage")

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVformatMessageWithError")

public actual fun uVparseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVparseMessage")

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUVparseMessageWithError")

public actual fun ubidiClose(pbidi: MutPtr<UBiDi>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiClose")

public actual fun ubidiCountParagraphs(pbidi: MutPtr<UBiDi>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiCountParagraphs")

public actual fun ubidiCountRuns(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiCountRuns")

public actual fun ubidiGetBaseDirection(text: ConstPtr<UShort>, length: Int): UBiDiDirection =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetBaseDirection")

public actual fun ubidiGetClassCallback(pbidi: MutPtr<UBiDi>, fn: MutPtr<UBiDiClassCallback>, context: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetClassCallback")

public actual fun ubidiGetCustomizedClass(pbidi: MutPtr<UBiDi>, c: Int): UCharDirection =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetCustomizedClass")

public actual fun ubidiGetDirection(pbidi: ConstPtr<UBiDi>): UBiDiDirection =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetDirection")

public actual fun ubidiGetLength(pbidi: ConstPtr<UBiDi>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLength")

public actual fun ubidiGetLevelAt(pbidi: ConstPtr<UBiDi>, charindex: Int): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLevelAt")

public actual fun ubidiGetLevels(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLevels")

public actual fun ubidiGetLogicalIndex(pbidi: MutPtr<UBiDi>, visualindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLogicalIndex")

public actual fun ubidiGetLogicalMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLogicalMap")

public actual fun ubidiGetLogicalRun(pbidi: ConstPtr<UBiDi>, logicalposition: Int, plogicallimit: MutPtr<Int>, plevel: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetLogicalRun")

public actual fun ubidiGetParaLevel(pbidi: ConstPtr<UBiDi>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetParaLevel")

public actual fun ubidiGetParagraph(pbidi: ConstPtr<UBiDi>, charindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetParagraph")

public actual fun ubidiGetParagraphByIndex(pbidi: ConstPtr<UBiDi>, paraindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex")

public actual fun ubidiGetProcessedLength(pbidi: ConstPtr<UBiDi>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetProcessedLength")

public actual fun ubidiGetReorderingMode(pbidi: MutPtr<UBiDi>): UBiDiReorderingMode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetReorderingMode")

public actual fun ubidiGetReorderingOptions(pbidi: MutPtr<UBiDi>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetReorderingOptions")

public actual fun ubidiGetResultLength(pbidi: ConstPtr<UBiDi>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetResultLength")

public actual fun ubidiGetText(pbidi: ConstPtr<UBiDi>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetText")

public actual fun ubidiGetVisualIndex(pbidi: MutPtr<UBiDi>, logicalindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetVisualIndex")

public actual fun ubidiGetVisualMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetVisualMap")

public actual fun ubidiGetVisualRun(pbidi: MutPtr<UBiDi>, runindex: Int, plogicalstart: MutPtr<Int>, plength: MutPtr<Int>): UBiDiDirection =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiGetVisualRun")

public actual fun ubidiInvertMap(srcmap: ConstPtr<Int>, destmap: MutPtr<Int>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiInvertMap")

public actual fun ubidiIsInverse(pbidi: MutPtr<UBiDi>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiIsInverse")

public actual fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr<UBiDi>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr")

public actual fun ubidiOpen(): MutPtr<UBiDi> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiOpen")

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDi> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiOpenSized")

public actual fun ubidiOrderParagraphsLtr(pbidi: MutPtr<UBiDi>, orderparagraphsltr: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr")

public actual fun ubidiReorderLogical(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiReorderLogical")

public actual fun ubidiReorderVisual(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiReorderVisual")

public actual fun ubidiSetClassCallback(pbidi: MutPtr<UBiDi>, newfn: UBiDiClassCallback, newcontext: ConstPtr<CVoid>, oldfn: MutPtr<UBiDiClassCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetClassCallback")

public actual fun ubidiSetContext(pbidi: MutPtr<UBiDi>, prologue: ConstPtr<UShort>, prolength: Int, epilogue: ConstPtr<UShort>, epilength: Int, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetContext")

public actual fun ubidiSetInverse(pbidi: MutPtr<UBiDi>, isinverse: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetInverse")

public actual fun ubidiSetLine(pparabidi: ConstPtr<UBiDi>, start: Int, limit: Int, plinebidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetLine")

public actual fun ubidiSetPara(pbidi: MutPtr<UBiDi>, text: ConstPtr<UShort>, length: Int, paralevel: UByte, embeddinglevels: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetPara")

public actual fun ubidiSetReorderingMode(pbidi: MutPtr<UBiDi>, reorderingmode: UBiDiReorderingMode): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetReorderingMode")

public actual fun ubidiSetReorderingOptions(pbidi: MutPtr<UBiDi>, reorderingoptions: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiSetReorderingOptions")

public actual fun ubidiWriteReordered(pbidi: MutPtr<UBiDi>, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiWriteReordered")

public actual fun ubidiWriteReverse(src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbidiWriteReverse")

public actual fun ubiditransformClose(pbiditransform: MutPtr<UBiDiTransform>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbiditransformClose")

public actual fun ubiditransformOpen(perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDiTransform> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbiditransformOpen")

public actual fun ubiditransformTransform(pbiditransform: MutPtr<UBiDiTransform>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr<UErrorCode>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbiditransformTransform")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUblockGetCode")
private external fun wasiWindowssysWindowsWin32GlobalizationUblockGetCode(c: Int): Int

public actual fun ublockGetCode(c: Int): UBlockCode =
    wasiWindowssysWindowsWin32GlobalizationUblockGetCode(c)

public actual fun ubrkClose(bi: MutPtr<UBreakIterator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkClose")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUbrkCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUbrkCountAvailable(): Int

public actual fun ubrkCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUbrkCountAvailable()

public actual fun ubrkCurrent(bi: ConstPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkCurrent")

public actual fun ubrkFirst(bi: MutPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkFirst")

public actual fun ubrkFollowing(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkFollowing")

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkGetAvailable")

public actual fun ubrkGetBinaryRules(bi: MutPtr<UBreakIterator>, binaryrules: MutPtr<UByte>, rulescapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkGetBinaryRules")

public actual fun ubrkGetLocaleByType(bi: ConstPtr<UBreakIterator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkGetLocaleByType")

public actual fun ubrkGetRuleStatus(bi: MutPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkGetRuleStatus")

public actual fun ubrkGetRuleStatusVec(bi: MutPtr<UBreakIterator>, fillinvec: MutPtr<Int>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec")

public actual fun ubrkIsBoundary(bi: MutPtr<UBreakIterator>, offset: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkIsBoundary")

public actual fun ubrkLast(bi: MutPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkLast")

public actual fun ubrkNext(bi: MutPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkNext")

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkOpen")

public actual fun ubrkOpenBinaryRules(binaryrules: ConstPtr<UByte>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkOpenBinaryRules")

public actual fun ubrkOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkOpenRules")

public actual fun ubrkPreceding(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkPreceding")

public actual fun ubrkPrevious(bi: MutPtr<UBreakIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkPrevious")

public actual fun ubrkRefreshUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkRefreshUtext")

public actual fun ubrkSafeClone(bi: ConstPtr<UBreakIterator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkSafeClone")

public actual fun ubrkSetText(bi: MutPtr<UBreakIterator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkSetText")

public actual fun ubrkSetUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUbrkSetUtext")

public actual fun ucalAdd(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalAdd")

public actual fun ucalClear(calendar: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalClear")

public actual fun ucalClearField(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalClearField")

public actual fun ucalClone(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalClone")

public actual fun ucalClose(cal: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalClose")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcalCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUcalCountAvailable(): Int

public actual fun ucalCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUcalCountAvailable()

public actual fun ucalEquivalentTo(cal1: ConstPtr<ConstPtr<CVoid>>, cal2: ConstPtr<ConstPtr<CVoid>>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalEquivalentTo")

public actual fun ucalGet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGet")

public actual fun ucalGetAttribute(cal: ConstPtr<ConstPtr<CVoid>>, attr: UCalendarAttribute): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetAttribute")

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetAvailable")

public actual fun ucalGetCanonicalTimeZoneId(id: ConstPtr<UShort>, len: Int, result: MutPtr<UShort>, resultcapacity: Int, issystemid: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId")

public actual fun ucalGetDstsavings(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetDstsavings")

public actual fun ucalGetDayOfWeekType(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): UCalendarWeekdayType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetDayOfWeekType")

public actual fun ucalGetDefaultTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone")

public actual fun ucalGetFieldDifference(cal: MutPtr<MutPtr<CVoid>>, target: Double, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetFieldDifference")

public actual fun ucalGetGregorianChange(cal: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetGregorianChange")

public actual fun ucalGetHostTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetHostTimeZone")

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale")

public actual fun ucalGetLimit(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetLimit")

public actual fun ucalGetLocaleByType(cal: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetLocaleByType")

public actual fun ucalGetMillis(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetMillis")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcalGetNow")
private external fun wasiWindowssysWindowsWin32GlobalizationUcalGetNow(): Double

public actual fun ucalGetNow(): Double =
    wasiWindowssysWindowsWin32GlobalizationUcalGetNow()

public actual fun ucalGetTzdataVersion(status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetTzdataVersion")

public actual fun ucalGetTimeZoneDisplayName(cal: ConstPtr<ConstPtr<CVoid>>, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName")

public actual fun ucalGetTimeZoneId(cal: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetTimeZoneId")

public actual fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr<UShort>, len: Int, region: Pcstr, id: MutPtr<UShort>, idcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId")

public actual fun ucalGetTimeZoneTransitionDate(cal: ConstPtr<ConstPtr<CVoid>>, type: UTimeZoneTransitionType, transition: MutPtr<Double>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate")

public actual fun ucalGetType(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetType")

public actual fun ucalGetWeekendTransition(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetWeekendTransition")

public actual fun ucalGetWindowsTimeZoneId(id: ConstPtr<UShort>, len: Int, winid: MutPtr<UShort>, winidcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId")

public actual fun ucalInDaylightTime(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalInDaylightTime")

public actual fun ucalIsSet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalIsSet")

public actual fun ucalIsWeekend(cal: ConstPtr<ConstPtr<CVoid>>, date: Double, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalIsWeekend")

public actual fun ucalOpen(zoneid: ConstPtr<UShort>, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalOpen")

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones")

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration")

public actual fun ucalOpenTimeZones(ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalOpenTimeZones")

public actual fun ucalRoll(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalRoll")

public actual fun ucalSet(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, value: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSet")

public actual fun ucalSetAttribute(cal: MutPtr<MutPtr<CVoid>>, attr: UCalendarAttribute, newvalue: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetAttribute")

public actual fun ucalSetDate(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetDate")

public actual fun ucalSetDateTime(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetDateTime")

public actual fun ucalSetDefaultTimeZone(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone")

public actual fun ucalSetGregorianChange(cal: MutPtr<MutPtr<CVoid>>, date: Double, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetGregorianChange")

public actual fun ucalSetMillis(cal: MutPtr<MutPtr<CVoid>>, datetime: Double, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetMillis")

public actual fun ucalSetTimeZone(cal: MutPtr<MutPtr<CVoid>>, zoneid: ConstPtr<UShort>, len: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcalSetTimeZone")

public actual fun ucasemapClose(csm: MutPtr<UCaseMap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapClose")

public actual fun ucasemapGetBreakIterator(csm: ConstPtr<UCaseMap>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapGetBreakIterator")

public actual fun ucasemapGetLocale(csm: ConstPtr<UCaseMap>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapGetLocale")

public actual fun ucasemapGetOptions(csm: ConstPtr<UCaseMap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapGetOptions")

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UCaseMap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapOpen")

public actual fun ucasemapSetBreakIterator(csm: MutPtr<UCaseMap>, itertoadopt: MutPtr<UBreakIterator>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapSetBreakIterator")

public actual fun ucasemapSetLocale(csm: MutPtr<UCaseMap>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapSetLocale")

public actual fun ucasemapSetOptions(csm: MutPtr<UCaseMap>, options: UInt, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapSetOptions")

public actual fun ucasemapToTitle(csm: MutPtr<UCaseMap>, dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapToTitle")

public actual fun ucasemapUtf8FoldCase(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase")

public actual fun ucasemapUtf8ToLower(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapUtf8ToLower")

public actual fun ucasemapUtf8ToTitle(csm: MutPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle")

public actual fun ucasemapUtf8ToUpper(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper")

public actual fun ucfposClose(ucfpos: MutPtr<UConstrainedFieldPosition>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposClose")

public actual fun ucfposConstrainCategory(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposConstrainCategory")

public actual fun ucfposConstrainField(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposConstrainField")

public actual fun ucfposGetCategory(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposGetCategory")

public actual fun ucfposGetField(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposGetField")

public actual fun ucfposGetIndexes(ucfpos: ConstPtr<UConstrainedFieldPosition>, pstart: MutPtr<Int>, plimit: MutPtr<Int>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposGetIndexes")

public actual fun ucfposGetInt64IterationContext(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext")

public actual fun ucfposMatchesField(ucfpos: ConstPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposMatchesField")

public actual fun ucfposOpen(ec: MutPtr<UErrorCode>): MutPtr<UConstrainedFieldPosition> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposOpen")

public actual fun ucfposReset(ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposReset")

public actual fun ucfposSetInt64IterationContext(ucfpos: MutPtr<UConstrainedFieldPosition>, context: Long, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext")

public actual fun ucfposSetState(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcfposSetState")

public actual fun ucnvCbFromUwriteBytes(args: MutPtr<UConverterFromUnicodeArgs>, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes")

public actual fun ucnvCbFromUwriteSub(args: MutPtr<UConverterFromUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub")

public actual fun ucnvCbFromUwriteUchars(args: MutPtr<UConverterFromUnicodeArgs>, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsetindex: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars")

public actual fun ucnvCbToUwriteSub(args: MutPtr<UConverterToUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCbToUwriteSub")

public actual fun ucnvCbToUwriteUchars(args: MutPtr<UConverterToUnicodeArgs>, source: ConstPtr<UShort>, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars")

public actual fun ucnvClose(converter: MutPtr<UConverter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvClose")

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCompareNames")

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvConvert")

public actual fun ucnvConvertEx(targetcnv: MutPtr<UConverter>, sourcecnv: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, pivotstart: MutPtr<UShort>, pivotsource: MutPtr<MutPtr<UShort>>, pivottarget: MutPtr<MutPtr<UShort>>, pivotlimit: ConstPtr<UShort>, reset: Byte, flush: Byte, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvConvertEx")

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr<UErrorCode>): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvCountAliases")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcnvCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUcnvCountAvailable(): Int

public actual fun ucnvCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUcnvCountAvailable()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcnvCountStandards")
private external fun wasiWindowssysWindowsWin32GlobalizationUcnvCountStandards(): Int

public actual fun ucnvCountStandards(): UShort =
    wasiWindowssysWindowsWin32GlobalizationUcnvCountStandards().toUShort()

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature")

public actual fun ucnvFixFileSeparator(cnv: ConstPtr<UConverter>, source: MutPtr<UShort>, sourcelen: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFixFileSeparator")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcnvFlushCache")
private external fun wasiWindowssysWindowsWin32GlobalizationUcnvFlushCache(): Int

public actual fun ucnvFlushCache(): Int =
    wasiWindowssysWindowsWin32GlobalizationUcnvFlushCache()

public actual fun ucnvFromAlgorithmic(cnv: MutPtr<UConverter>, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromAlgorithmic")

public actual fun ucnvFromUchars(cnv: MutPtr<UConverter>, dest: Pcstr, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUchars")

public actual fun ucnvFromUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUcountPending")

public actual fun ucnvFromUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvFromUnicode")

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetAlias")

public actual fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr<ConstPtr<Byte>>, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetAliases")

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetAvailableName")

public actual fun ucnvGetCcsid(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetCcsid")

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetCanonicalName")

public actual fun ucnvGetDefaultName(): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetDefaultName")

public actual fun ucnvGetDisplayName(converter: ConstPtr<UConverter>, displaylocale: Pcstr, displayname: MutPtr<UShort>, displaynamecapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetDisplayName")

public actual fun ucnvGetFromUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterFromUCallback>, context: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetFromUcallBack")

public actual fun ucnvGetInvalidChars(converter: ConstPtr<UConverter>, errbytes: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetInvalidChars")

public actual fun ucnvGetInvalidUchars(converter: ConstPtr<UConverter>, erruchars: MutPtr<UShort>, len: MutPtr<Byte>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetInvalidUchars")

public actual fun ucnvGetMaxCharSize(converter: ConstPtr<UConverter>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetMaxCharSize")

public actual fun ucnvGetMinCharSize(converter: ConstPtr<UConverter>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetMinCharSize")

public actual fun ucnvGetName(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetName")

public actual fun ucnvGetNextUchar(converter: MutPtr<UConverter>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetNextUchar")

public actual fun ucnvGetPlatform(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): UConverterPlatform =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetPlatform")

public actual fun ucnvGetStandard(n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetStandard")

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetStandardName")

public actual fun ucnvGetStarters(converter: ConstPtr<UConverter>, starters: MutPtr<Byte>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetStarters")

public actual fun ucnvGetSubstChars(converter: ConstPtr<UConverter>, subchars: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetSubstChars")

public actual fun ucnvGetToUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterToUCallback>, context: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetToUcallBack")

public actual fun ucnvGetType(converter: ConstPtr<UConverter>): UConverterType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetType")

public actual fun ucnvGetUnicodeSet(cnv: ConstPtr<UConverter>, setfillin: MutPtr<USet>, whichset: UConverterUnicodeSet, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvGetUnicodeSet")

public actual fun ucnvIsAmbiguous(cnv: ConstPtr<UConverter>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvIsAmbiguous")

public actual fun ucnvIsFixedWidth(cnv: MutPtr<UConverter>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvIsFixedWidth")

public actual fun ucnvOpen(convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpen")

public actual fun ucnvOpenAllNames(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpenAllNames")

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpenCcsid")

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpenPackage")

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpenStandardNames")

public actual fun ucnvOpenU(name: ConstPtr<UShort>, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvOpenU")

public actual fun ucnvReset(converter: MutPtr<UConverter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvReset")

public actual fun ucnvResetFromUnicode(converter: MutPtr<UConverter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvResetFromUnicode")

public actual fun ucnvResetToUnicode(converter: MutPtr<UConverter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvResetToUnicode")

public actual fun ucnvSafeClone(cnv: ConstPtr<UConverter>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UConverter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSafeClone")

public actual fun ucnvSetDefaultName(name: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetDefaultName")

public actual fun ucnvSetFallback(cnv: MutPtr<UConverter>, usesfallback: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetFallback")

public actual fun ucnvSetFromUcallBack(converter: MutPtr<UConverter>, newaction: UConverterFromUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterFromUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetFromUcallBack")

public actual fun ucnvSetSubstChars(converter: MutPtr<UConverter>, subchars: Pcstr, len: Byte, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetSubstChars")

public actual fun ucnvSetSubstString(cnv: MutPtr<UConverter>, s: ConstPtr<UShort>, length: Int, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetSubstString")

public actual fun ucnvSetToUcallBack(converter: MutPtr<UConverter>, newaction: UConverterToUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterToUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvSetToUcallBack")

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr<UConverter>, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToAlgorithmic")

public actual fun ucnvToUchars(cnv: MutPtr<UConverter>, dest: MutPtr<UShort>, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUchars")

public actual fun ucnvToUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUcountPending")

public actual fun ucnvToUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<UShort>>, targetlimit: ConstPtr<UShort>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvToUnicode")

public actual fun ucnvUsesFallback(cnv: ConstPtr<UConverter>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvUsesFallback")

public actual fun ucnvselClose(sel: MutPtr<UConverterSelector>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselClose")

public actual fun ucnvselOpen(converterlist: ConstPtr<ConstPtr<Byte>>, converterlistsize: Int, excludedcodepoints: ConstPtr<USet>, whichset: UConverterUnicodeSet, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselOpen")

public actual fun ucnvselOpenFromSerialized(buffer: ConstPtr<CVoid>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized")

public actual fun ucnvselSelectForString(sel: ConstPtr<UConverterSelector>, s: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselSelectForString")

public actual fun ucnvselSelectForUtf8(sel: ConstPtr<UConverterSelector>, s: Pcstr, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselSelectForUtf8")

public actual fun ucnvselSerialize(sel: ConstPtr<UConverterSelector>, buffer: MutPtr<CVoid>, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcnvselSerialize")

public actual fun ucolCloneBinary(coll: ConstPtr<UCollator>, buffer: MutPtr<UByte>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolCloneBinary")

public actual fun ucolClose(coll: MutPtr<UCollator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolClose")

public actual fun ucolCloseElements(elems: MutPtr<UCollationElements>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolCloseElements")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcolCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUcolCountAvailable(): Int

public actual fun ucolCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUcolCountAvailable()

public actual fun ucolEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolEqual")

public actual fun ucolGetAttribute(coll: ConstPtr<UCollator>, attr: UColAttribute, status: MutPtr<UErrorCode>): UColAttributeValue =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetAttribute")

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetAvailable")

public actual fun ucolGetBound(source: ConstPtr<UByte>, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr<UByte>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetBound")

public actual fun ucolGetContractionsAndExpansions(coll: ConstPtr<UCollator>, contractions: MutPtr<USet>, expansions: MutPtr<USet>, addprefixes: Byte, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions")

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetDisplayName")

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes")

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent")

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetKeywordValues")

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale")

public actual fun ucolGetKeywords(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetKeywords")

public actual fun ucolGetLocaleByType(coll: ConstPtr<UCollator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetLocaleByType")

public actual fun ucolGetMaxExpansion(elems: ConstPtr<UCollationElements>, order: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetMaxExpansion")

public actual fun ucolGetMaxVariable(coll: ConstPtr<UCollator>): UColReorderCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetMaxVariable")

public actual fun ucolGetOffset(elems: ConstPtr<UCollationElements>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetOffset")

public actual fun ucolGetReorderCodes(coll: ConstPtr<UCollator>, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetReorderCodes")

public actual fun ucolGetRules(coll: ConstPtr<UCollator>, length: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetRules")

public actual fun ucolGetRulesEx(coll: ConstPtr<UCollator>, delta: UColRuleOption, buffer: MutPtr<UShort>, bufferlen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetRulesEx")

public actual fun ucolGetSortKey(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, result: MutPtr<UByte>, resultlength: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetSortKey")

public actual fun ucolGetStrength(coll: ConstPtr<UCollator>): UColAttributeValue =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetStrength")

public actual fun ucolGetTailoredSet(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetTailoredSet")

public actual fun ucolGetUcaversion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetUcaversion")

public actual fun ucolGetVariableTop(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetVariableTop")

public actual fun ucolGetVersion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGetVersion")

public actual fun ucolGreater(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGreater")

public actual fun ucolGreaterOrEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolGreaterOrEqual")

public actual fun ucolKeyHashCode(key: ConstPtr<UByte>, length: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolKeyHashCode")

public actual fun ucolMergeSortkeys(src1: ConstPtr<UByte>, src1length: Int, src2: ConstPtr<UByte>, src2length: Int, dest: MutPtr<UByte>, destcapacity: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolMergeSortkeys")

public actual fun ucolNext(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolNext")

public actual fun ucolNextSortKeyPart(coll: ConstPtr<UCollator>, iter: MutPtr<UCharIterator>, state: MutPtr<UInt>, dest: MutPtr<UByte>, count: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolNextSortKeyPart")

public actual fun ucolOpen(loc: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolOpen")

public actual fun ucolOpenAvailableLocales(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolOpenAvailableLocales")

public actual fun ucolOpenBinary(bin: ConstPtr<UByte>, length: Int, base: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolOpenBinary")

public actual fun ucolOpenElements(coll: ConstPtr<UCollator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UCollationElements> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolOpenElements")

public actual fun ucolOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolOpenRules")

public actual fun ucolPrevious(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolPrevious")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcolPrimaryOrder")
private external fun wasiWindowssysWindowsWin32GlobalizationUcolPrimaryOrder(order: Int): Int

public actual fun ucolPrimaryOrder(order: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUcolPrimaryOrder(order)

public actual fun ucolReset(elems: MutPtr<UCollationElements>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolReset")

public actual fun ucolSafeClone(coll: ConstPtr<UCollator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSafeClone")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcolSecondaryOrder")
private external fun wasiWindowssysWindowsWin32GlobalizationUcolSecondaryOrder(order: Int): Int

public actual fun ucolSecondaryOrder(order: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUcolSecondaryOrder(order)

public actual fun ucolSetAttribute(coll: MutPtr<UCollator>, attr: UColAttribute, value: UColAttributeValue, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetAttribute")

public actual fun ucolSetMaxVariable(coll: MutPtr<UCollator>, group: UColReorderCode, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetMaxVariable")

public actual fun ucolSetOffset(elems: MutPtr<UCollationElements>, offset: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetOffset")

public actual fun ucolSetReorderCodes(coll: MutPtr<UCollator>, reordercodes: ConstPtr<Int>, reordercodeslength: Int, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetReorderCodes")

public actual fun ucolSetStrength(coll: MutPtr<UCollator>, strength: UColAttributeValue): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetStrength")

public actual fun ucolSetText(elems: MutPtr<UCollationElements>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolSetText")

public actual fun ucolStrcoll(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): UCollationResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolStrcoll")

public actual fun ucolStrcollIter(coll: ConstPtr<UCollator>, siter: MutPtr<UCharIterator>, titer: MutPtr<UCharIterator>, status: MutPtr<UErrorCode>): UCollationResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolStrcollIter")

public actual fun ucolStrcollUtf8(coll: ConstPtr<UCollator>, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr<UErrorCode>): UCollationResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcolStrcollUtf8")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUcolTertiaryOrder")
private external fun wasiWindowssysWindowsWin32GlobalizationUcolTertiaryOrder(order: Int): Int

public actual fun ucolTertiaryOrder(order: Int): Int =
    wasiWindowssysWindowsWin32GlobalizationUcolTertiaryOrder(order)

public actual fun ucpmapGet(map: ConstPtr<UCPMap>, c: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcpmapGet")

public actual fun ucpmapGetRange(map: ConstPtr<UCPMap>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcpmapGetRange")

public actual fun ucptrieClose(trie: MutPtr<UCPTrie>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieClose")

public actual fun ucptrieGet(trie: ConstPtr<UCPTrie>, c: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieGet")

public actual fun ucptrieGetRange(trie: ConstPtr<UCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieGetRange")

public actual fun ucptrieGetType(trie: ConstPtr<UCPTrie>): UCPTrieType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieGetType")

public actual fun ucptrieGetValueWidth(trie: ConstPtr<UCPTrie>): UCPTrieValueWidth =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieGetValueWidth")

public actual fun ucptrieInternalSmallIndex(trie: ConstPtr<UCPTrie>, c: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex")

public actual fun ucptrieInternalSmallU8Index(trie: ConstPtr<UCPTrie>, lt1: Int, t2: UByte, t3: UByte): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index")

public actual fun ucptrieInternalU8PrevIndex(trie: ConstPtr<UCPTrie>, c: Int, start: ConstPtr<UByte>, src: ConstPtr<UByte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex")

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieOpenFromBinary")

public actual fun ucptrieToBinary(trie: ConstPtr<UCPTrie>, data: MutPtr<CVoid>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcptrieToBinary")

public actual fun ucsdetClose(ucsd: MutPtr<UCharsetDetector>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetClose")

public actual fun ucsdetDetect(ucsd: MutPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UCharsetMatch> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetDetect")

public actual fun ucsdetDetectAll(ucsd: MutPtr<UCharsetDetector>, matchesfound: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<UCharsetMatch>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetDetectAll")

public actual fun ucsdetEnableInputFilter(ucsd: MutPtr<UCharsetDetector>, filter: Byte): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetEnableInputFilter")

public actual fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets")

public actual fun ucsdetGetConfidence(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetGetConfidence")

public actual fun ucsdetGetLanguage(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetGetLanguage")

public actual fun ucsdetGetName(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetGetName")

public actual fun ucsdetGetUchars(ucsm: ConstPtr<UCharsetMatch>, buf: MutPtr<UShort>, cap: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetGetUchars")

public actual fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr<UCharsetDetector>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled")

public actual fun ucsdetOpen(status: MutPtr<UErrorCode>): MutPtr<UCharsetDetector> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetOpen")

public actual fun ucsdetSetDeclaredEncoding(ucsd: MutPtr<UCharsetDetector>, encoding: Pcstr, length: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding")

public actual fun ucsdetSetText(ucsd: MutPtr<UCharsetDetector>, textin: Pcstr, len: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcsdetSetText")

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrCountCurrencies")

public actual fun ucurrForLocale(locale: Pcstr, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrForLocale")

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrForLocaleAndDate")

public actual fun ucurrGetDefaultFractionDigits(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits")

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage")

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale")

public actual fun ucurrGetName(currency: ConstPtr<UShort>, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr<Byte>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetName")

public actual fun ucurrGetNumericCode(currency: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetNumericCode")

public actual fun ucurrGetPluralName(currency: ConstPtr<UShort>, locale: Pcstr, ischoiceformat: MutPtr<Byte>, pluralcount: Pcstr, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetPluralName")

public actual fun ucurrGetRoundingIncrement(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement")

public actual fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage")

public actual fun ucurrIsAvailable(isocode: ConstPtr<UShort>, from: Double, to: Double, errorcode: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrIsAvailable")

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies")

public actual fun ucurrRegister(isocode: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrRegister")

public actual fun ucurrUnregister(key: MutPtr<CVoid>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUcurrUnregister")

public actual fun udatAdoptNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoadopt: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatAdoptNumberFormat")

public actual fun udatAdoptNumberFormatForFields(fmt: MutPtr<MutPtr<CVoid>>, fields: ConstPtr<UShort>, numberformattoset: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields")

public actual fun udatApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatApplyPattern")

public actual fun udatClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatClone")

public actual fun udatClose(format: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatClose")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUdatCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUdatCountAvailable(): Int

public actual fun udatCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUdatCountAvailable()

public actual fun udatCountSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatCountSymbols")

public actual fun udatFormat(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatFormat")

public actual fun udatFormatCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatFormatCalendar")

public actual fun udatFormatCalendarForFields(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatFormatCalendarForFields")

public actual fun udatFormatForFields(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatFormatForFields")

public actual fun udatGet2DigitYearStart(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGet2DigitYearStart")

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetAvailable")

public actual fun udatGetBooleanAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UDateFormatBooleanAttribute, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetBooleanAttribute")

public actual fun udatGetCalendar(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetCalendar")

public actual fun udatGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetContext")

public actual fun udatGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetLocaleByType")

public actual fun udatGetNumberFormat(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetNumberFormat")

public actual fun udatGetNumberFormatForField(fmt: ConstPtr<ConstPtr<CVoid>>, field: UShort): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetNumberFormatForField")

public actual fun udatGetSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatGetSymbols")

public actual fun udatIsLenient(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatIsLenient")

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr<UShort>, tzidlength: Int, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatOpen")

public actual fun udatParse(format: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatParse")

public actual fun udatParseCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatParseCalendar")

public actual fun udatSet2DigitYearStart(fmt: MutPtr<MutPtr<CVoid>>, d: Double, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSet2DigitYearStart")

public actual fun udatSetBooleanAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetBooleanAttribute")

public actual fun udatSetCalendar(fmt: MutPtr<MutPtr<CVoid>>, calendartoset: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetCalendar")

public actual fun udatSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetContext")

public actual fun udatSetLenient(fmt: MutPtr<MutPtr<CVoid>>, islenient: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetLenient")

public actual fun udatSetNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoset: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetNumberFormat")

public actual fun udatSetSymbols(format: MutPtr<MutPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr<UShort>, valuelength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatSetSymbols")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUdatToCalendarDateField")
private external fun wasiWindowssysWindowsWin32GlobalizationUdatToCalendarDateField(field: Int): Int

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    wasiWindowssysWindowsWin32GlobalizationUdatToCalendarDateField(field)

public actual fun udatToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, localized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatToPattern")

public actual fun udatpgAddPattern(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, override: Byte, conflictingpattern: MutPtr<UShort>, capacity: Int, plength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): UDateTimePatternConflict =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgAddPattern")

public actual fun udatpgClone(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgClone")

public actual fun udatpgClose(dtpg: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgClose")

public actual fun udatpgGetAppendItemFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat")

public actual fun udatpgGetAppendItemName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetAppendItemName")

public actual fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, baseskeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton")

public actual fun udatpgGetBestPattern(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetBestPattern")

public actual fun udatpgGetBestPatternWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions")

public actual fun udatpgGetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat")

public actual fun udatpgGetDecimal(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetDecimal")

public actual fun udatpgGetFieldDisplayName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName")

public actual fun udatpgGetPatternForSkeleton(dtpg: ConstPtr<ConstPtr<CVoid>>, skeleton: ConstPtr<UShort>, skeletonlength: Int, plength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton")

public actual fun udatpgGetSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, skeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgGetSkeleton")

public actual fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgOpen")

public actual fun udatpgOpenBaseSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons")

public actual fun udatpgOpenEmpty(perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgOpenEmpty")

public actual fun udatpgOpenSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgOpenSkeletons")

public actual fun udatpgReplaceFieldTypes(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes")

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions")

public actual fun udatpgSetAppendItemFormat(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat")

public actual fun udatpgSetAppendItemName(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgSetAppendItemName")

public actual fun udatpgSetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, dtformat: ConstPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat")

public actual fun udatpgSetDecimal(dtpg: MutPtr<MutPtr<CVoid>>, decimal: ConstPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdatpgSetDecimal")

public actual fun udtitvfmtClose(formatter: MutPtr<UDateIntervalFormat>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtClose")

public actual fun udtitvfmtCloseResult(uresult: MutPtr<UFormattedDateInterval>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtCloseResult")

public actual fun udtitvfmtFormat(formatter: ConstPtr<UDateIntervalFormat>, fromdate: Double, todate: Double, result: MutPtr<UShort>, resultcapacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtFormat")

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr<UShort>, skeletonlength: Int, tzid: ConstPtr<UShort>, tzidlength: Int, status: MutPtr<UErrorCode>): MutPtr<UDateIntervalFormat> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtOpen")

public actual fun udtitvfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedDateInterval> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtOpenResult")

public actual fun udtitvfmtResultAsValue(uresult: ConstPtr<UFormattedDateInterval>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue")

public actual fun uenumClose(en: MutPtr<UEnumeration>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumClose")

public actual fun uenumCount(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumCount")

public actual fun uenumNext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumNext")

public actual fun uenumOpenCharStringsEnumeration(strings: ConstPtr<ConstPtr<Byte>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration")

public actual fun uenumOpenUcharStringsEnumeration(strings: ConstPtr<ConstPtr<UShort>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration")

public actual fun uenumReset(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumReset")

public actual fun uenumUnext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUenumUnext")

public actual fun ufieldpositerClose(fpositer: MutPtr<UFieldPositionIterator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfieldpositerClose")

public actual fun ufieldpositerNext(fpositer: MutPtr<UFieldPositionIterator>, beginindex: MutPtr<Int>, endindex: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfieldpositerNext")

public actual fun ufieldpositerOpen(status: MutPtr<UErrorCode>): MutPtr<UFieldPositionIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfieldpositerOpen")

public actual fun ufmtClose(fmt: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtClose")

public actual fun ufmtGetArrayItemByIndex(fmt: MutPtr<MutPtr<CVoid>>, n: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex")

public actual fun ufmtGetArrayLength(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetArrayLength")

public actual fun ufmtGetDate(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetDate")

public actual fun ufmtGetDecNumChars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetDecNumChars")

public actual fun ufmtGetDouble(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetDouble")

public actual fun ufmtGetInt64(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetInt64")

public actual fun ufmtGetLong(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetLong")

public actual fun ufmtGetObject(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetObject")

public actual fun ufmtGetType(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): UFormattableType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetType")

public actual fun ufmtGetUchars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtGetUchars")

public actual fun ufmtIsNumeric(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtIsNumeric")

public actual fun ufmtOpen(status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtOpen")

public actual fun ufmtvalGetString(ufmtval: ConstPtr<UFormattedValue>, plength: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtvalGetString")

public actual fun ufmtvalNextPosition(ufmtval: ConstPtr<UFormattedValue>, ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUfmtvalNextPosition")

public actual fun ugenderGetInstance(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UGenderInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUgenderGetInstance")

public actual fun ugenderGetListGender(genderinfo: ConstPtr<UGenderInfo>, genders: ConstPtr<UGender>, size: Int, status: MutPtr<UErrorCode>): UGender =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUgenderGetListGender")

public actual fun uidnaClose(idna: MutPtr<Uidna>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaClose")

public actual fun uidnaLabelToAscii(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaLabelToAscii")

public actual fun uidnaLabelToAsciiUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8")

public actual fun uidnaLabelToUnicode(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaLabelToUnicode")

public actual fun uidnaLabelToUnicodeUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8")

public actual fun uidnaNameToAscii(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaNameToAscii")

public actual fun uidnaNameToAsciiUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8")

public actual fun uidnaNameToUnicode(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaNameToUnicode")

public actual fun uidnaNameToUnicodeUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8")

public actual fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<Uidna> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUidnaOpenUts46")

public actual fun uiterCurrent32(iter: MutPtr<UCharIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterCurrent32")

public actual fun uiterGetState(iter: ConstPtr<UCharIterator>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterGetState")

public actual fun uiterNext32(iter: MutPtr<UCharIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterNext32")

public actual fun uiterPrevious32(iter: MutPtr<UCharIterator>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterPrevious32")

public actual fun uiterSetState(iter: MutPtr<UCharIterator>, state: UInt, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterSetState")

public actual fun uiterSetString(iter: MutPtr<UCharIterator>, s: ConstPtr<UShort>, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterSetString")

public actual fun uiterSetUtf16Be(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterSetUtf16Be")

public actual fun uiterSetUtf8(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUiterSetUtf8")

public actual fun uldnClose(ldn: MutPtr<ULocaleDisplayNames>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnClose")

public actual fun uldnGetContext(ldn: ConstPtr<ULocaleDisplayNames>, type: UDisplayContextType, perrorcode: MutPtr<UErrorCode>): UDisplayContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnGetContext")

public actual fun uldnGetDialectHandling(ldn: ConstPtr<ULocaleDisplayNames>): UDialectHandling =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnGetDialectHandling")

public actual fun uldnGetLocale(ldn: ConstPtr<ULocaleDisplayNames>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnGetLocale")

public actual fun uldnKeyDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnKeyDisplayName")

public actual fun uldnKeyValueDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, value: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnKeyValueDisplayName")

public actual fun uldnLanguageDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, lang: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnLanguageDisplayName")

public actual fun uldnLocaleDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, locale: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnLocaleDisplayName")

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnOpen")

public actual fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr<UDisplayContext>, length: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnOpenForContext")

public actual fun uldnRegionDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, region: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnRegionDisplayName")

public actual fun uldnScriptCodeDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, scriptcode: UScriptCode, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName")

public actual fun uldnScriptDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, script: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnScriptDisplayName")

public actual fun uldnVariantDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, variant: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUldnVariantDisplayName")

public actual fun ulistfmtClose(listfmt: MutPtr<UListFormatter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtClose")

public actual fun ulistfmtCloseResult(uresult: MutPtr<UFormattedList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtCloseResult")

public actual fun ulistfmtFormat(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtFormat")

public actual fun ulistfmtFormatStringsToResult(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, uresult: MutPtr<UFormattedList>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult")

public actual fun ulistfmtOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtOpen")

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtOpenForType")

public actual fun ulistfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedList> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtOpenResult")

public actual fun ulistfmtResultAsValue(uresult: ConstPtr<UFormattedList>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlistfmtResultAsValue")

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, acceptlist: ConstPtr<ConstPtr<Byte>>, acceptlistcount: Int, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocAcceptLanguage")

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, httpacceptlanguage: Pcstr, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp")

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocAddLikelySubtags")

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocCanonicalize")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUlocCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUlocCountAvailable(): Int

public actual fun ulocCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUlocCountAvailable()

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr<Int>, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocForLanguageTag")

public actual fun ulocGetAvailable(n: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetAvailable")

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetBaseName")

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetCharacterOrientation")

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetCountry")

public actual fun ulocGetDefault(): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDefault")

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr<UShort>, countrycapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayCountry")

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayKeyword")

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue")

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr<UShort>, languagecapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayLanguage")

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayName")

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr<UShort>, scriptcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayScript")

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr<UShort>, variantcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetDisplayVariant")

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetIso3Country")

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetIso3Language")

public actual fun ulocGetIsocountries(): MutPtr<MutPtr<Byte>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetIsocountries")

public actual fun ulocGetIsolanguages(): MutPtr<MutPtr<Byte>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetIsolanguages")

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetKeywordValue")

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetLcid")

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetLanguage")

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetLineOrientation")

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetLocaleForLcid")

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetName")

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetParent")

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetScript")

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocGetVariant")

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocIsRightToLeft")

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocMinimizeSubtags")

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocOpenAvailableByType")

public actual fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocOpenKeywords")

public actual fun ulocSetDefault(localeid: Pcstr, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocSetDefault")

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocSetKeywordValue")

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocToLanguageTag")

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocToLegacyKey")

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocToLegacyType")

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey")

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType")

public actual fun ulocdataClose(uld: MutPtr<ULocaleData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataClose")

public actual fun ulocdataGetCldrversion(versionarray: MutPtr<UByte>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetCldrversion")

public actual fun ulocdataGetDelimiter(uld: MutPtr<ULocaleData>, type: ULocaleDataDelimiterType, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetDelimiter")

public actual fun ulocdataGetExemplarSet(uld: MutPtr<ULocaleData>, fillin: MutPtr<USet>, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetExemplarSet")

public actual fun ulocdataGetLocaleDisplayPattern(uld: MutPtr<ULocaleData>, pattern: MutPtr<UShort>, patterncapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern")

public actual fun ulocdataGetLocaleSeparator(uld: MutPtr<ULocaleData>, separator: MutPtr<UShort>, separatorcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator")

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr<UErrorCode>): UMeasurementSystem =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem")

public actual fun ulocdataGetNoSubstitute(uld: MutPtr<ULocaleData>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute")

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr<Int>, width: MutPtr<Int>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataGetPaperSize")

public actual fun ulocdataOpen(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<ULocaleData> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataOpen")

public actual fun ulocdataSetNoSubstitute(uld: MutPtr<ULocaleData>, setting: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute")

public actual fun umsgApplyPattern(fmt: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgApplyPattern")

public actual fun umsgAutoQuoteApostrophe(pattern: ConstPtr<UShort>, patternlength: Int, dest: MutPtr<UShort>, destcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe")

public actual fun umsgClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgClone")

public actual fun umsgClose(format: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgClose")

public actual fun umsgFormat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgFormat")

public actual fun umsgGetLocale(fmt: ConstPtr<ConstPtr<CVoid>>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgGetLocale")

public actual fun umsgOpen(pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgOpen")

public actual fun umsgParse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgParse")

public actual fun umsgSetLocale(fmt: MutPtr<MutPtr<CVoid>>, locale: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgSetLocale")

public actual fun umsgToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgToPattern")

public actual fun umsgVformat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgVformat")

public actual fun umsgVparse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmsgVparse")

public actual fun umutablecptrieBuildImmutable(trie: MutPtr<UMutableCPTrie>, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable")

public actual fun umutablecptrieClone(other: ConstPtr<UMutableCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieClone")

public actual fun umutablecptrieClose(trie: MutPtr<UMutableCPTrie>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieClose")

public actual fun umutablecptrieFromUcpmap(map: ConstPtr<UCPMap>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap")

public actual fun umutablecptrieFromUcptrie(trie: ConstPtr<UCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie")

public actual fun umutablecptrieGet(trie: ConstPtr<UMutableCPTrie>, c: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieGet")

public actual fun umutablecptrieGetRange(trie: ConstPtr<UMutableCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieGetRange")

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieOpen")

public actual fun umutablecptrieSet(trie: MutPtr<UMutableCPTrie>, c: Int, value: UInt, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieSet")

public actual fun umutablecptrieSetRange(trie: MutPtr<UMutableCPTrie>, start: Int, end: Int, value: UInt, perrorcode: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUmutablecptrieSetRange")

public actual fun unorm2Append(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2Append")

public actual fun unorm2Close(norm2: MutPtr<UNormalizer2>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2Close")

public actual fun unorm2ComposePair(norm2: ConstPtr<UNormalizer2>, a: Int, b: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2ComposePair")

public actual fun unorm2GetCombiningClass(norm2: ConstPtr<UNormalizer2>, c: Int): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetCombiningClass")

public actual fun unorm2GetDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetDecomposition")

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetInstance")

public actual fun unorm2GetNfcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetNfcinstance")

public actual fun unorm2GetNfdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetNfdinstance")

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance")

public actual fun unorm2GetNfkcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance")

public actual fun unorm2GetNfkdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance")

public actual fun unorm2GetRawDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition")

public actual fun unorm2HasBoundaryAfter(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter")

public actual fun unorm2HasBoundaryBefore(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore")

public actual fun unorm2IsInert(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2IsInert")

public actual fun unorm2IsNormalized(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2IsNormalized")

public actual fun unorm2Normalize(norm2: ConstPtr<UNormalizer2>, src: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2Normalize")

public actual fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend")

public actual fun unorm2OpenFiltered(norm2: ConstPtr<UNormalizer2>, filterset: ConstPtr<USet>, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2OpenFiltered")

public actual fun unorm2QuickCheck(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): UNormalizationCheckResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2QuickCheck")

public actual fun unorm2SpanQuickCheckYes(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes")

public actual fun unormCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnormCompare")

public actual fun unumApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumApplyPattern")

public actual fun unumClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumClone")

public actual fun unumClose(fmt: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumClose")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUnumCountAvailable")
private external fun wasiWindowssysWindowsWin32GlobalizationUnumCountAvailable(): Int

public actual fun unumCountAvailable(): Int =
    wasiWindowssysWindowsWin32GlobalizationUnumCountAvailable()

public actual fun unumFormat(fmt: ConstPtr<ConstPtr<CVoid>>, number: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormat")

public actual fun unumFormatDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, number: Pcstr, length: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatDecimal")

public actual fun unumFormatDouble(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatDouble")

public actual fun unumFormatDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, currency: MutPtr<UShort>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency")

public actual fun unumFormatDoubleForFields(format: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatDoubleForFields")

public actual fun unumFormatInt64(fmt: ConstPtr<ConstPtr<CVoid>>, number: Long, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatInt64")

public actual fun unumFormatUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, number: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumFormatUformattable")

public actual fun unumGetAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetAttribute")

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetAvailable")

public actual fun unumGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetContext")

public actual fun unumGetDoubleAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetDoubleAttribute")

public actual fun unumGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetLocaleByType")

public actual fun unumGetSymbol(fmt: ConstPtr<ConstPtr<CVoid>>, symbol: UNumberFormatSymbol, buffer: MutPtr<UShort>, size: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetSymbol")

public actual fun unumGetTextAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, tag: UNumberFormatTextAttribute, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumGetTextAttribute")

public actual fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumOpen")

public actual fun unumParse(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParse")

public actual fun unumParseDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, outbuf: Pcstr, outbuflength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParseDecimal")

public actual fun unumParseDouble(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParseDouble")

public actual fun unumParseDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, currency: MutPtr<UShort>, status: MutPtr<UErrorCode>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParseDoubleCurrency")

public actual fun unumParseInt64(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParseInt64")

public actual fun unumParseToUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumParseToUformattable")

public actual fun unumSetAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumSetAttribute")

public actual fun unumSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumSetContext")

public actual fun unumSetDoubleAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Double): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumSetDoubleAttribute")

public actual fun unumSetSymbol(fmt: MutPtr<MutPtr<CVoid>>, symbol: UNumberFormatSymbol, value: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumSetSymbol")

public actual fun unumSetTextAttribute(fmt: MutPtr<MutPtr<CVoid>>, tag: UNumberFormatTextAttribute, newvalue: ConstPtr<UShort>, newvaluelength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumSetTextAttribute")

public actual fun unumToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, ispatternlocalized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumToPattern")

public actual fun unumfClose(uformatter: MutPtr<UNumberFormatter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfClose")

public actual fun unumfCloseResult(uresult: MutPtr<UFormattedNumber>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfCloseResult")

public actual fun unumfFormatDecimal(uformatter: ConstPtr<UNumberFormatter>, value: Pcstr, valuelen: Int, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfFormatDecimal")

public actual fun unumfFormatDouble(uformatter: ConstPtr<UNumberFormatter>, value: Double, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfFormatDouble")

public actual fun unumfFormatInt(uformatter: ConstPtr<UNumberFormatter>, value: Long, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfFormatInt")

public actual fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale")

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, perror: MutPtr<UParseError>, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError")

public actual fun unumfOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedNumber> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfOpenResult")

public actual fun unumfResultAsValue(uresult: ConstPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfResultAsValue")

public actual fun unumfResultGetAllFieldPositions(uresult: ConstPtr<UFormattedNumber>, ufpositer: MutPtr<UFieldPositionIterator>, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions")

public actual fun unumfResultNextFieldPosition(uresult: ConstPtr<UFormattedNumber>, ufpos: MutPtr<UFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition")

public actual fun unumfResultToString(uresult: ConstPtr<UFormattedNumber>, buffer: MutPtr<UShort>, buffercapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumfResultToString")

public actual fun unumsysClose(unumsys: MutPtr<UNumberingSystem>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysClose")

public actual fun unumsysGetDescription(unumsys: ConstPtr<UNumberingSystem>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysGetDescription")

public actual fun unumsysGetName(unumsys: ConstPtr<UNumberingSystem>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysGetName")

public actual fun unumsysGetRadix(unumsys: ConstPtr<UNumberingSystem>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysGetRadix")

public actual fun unumsysIsAlgorithmic(unumsys: ConstPtr<UNumberingSystem>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic")

public actual fun unumsysOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysOpen")

public actual fun unumsysOpenAvailableNames(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames")

public actual fun unumsysOpenByName(name: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUnumsysOpenByName")

public actual fun uplrulesClose(uplrules: MutPtr<UPluralRules>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesClose")

public actual fun uplrulesGetKeywords(uplrules: ConstPtr<UPluralRules>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesGetKeywords")

public actual fun uplrulesOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesOpen")

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesOpenForType")

public actual fun uplrulesSelect(uplrules: ConstPtr<UPluralRules>, number: Double, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesSelect")

public actual fun uplrulesSelectFormatted(uplrules: ConstPtr<UPluralRules>, number: ConstPtr<UFormattedNumber>, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUplrulesSelectFormatted")

public actual fun uregexAppendReplacement(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexAppendReplacement")

public actual fun uregexAppendReplacementUtext(regexp: MutPtr<URegularExpression>, replacementtext: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexAppendReplacementUtext")

public actual fun uregexAppendTail(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexAppendTail")

public actual fun uregexAppendTailUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexAppendTailUtext")

public actual fun uregexClone(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexClone")

public actual fun uregexClose(regexp: MutPtr<URegularExpression>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexClose")

public actual fun uregexEnd(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexEnd")

public actual fun uregexEnd64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexEnd64")

public actual fun uregexFind(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexFind")

public actual fun uregexFind64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexFind64")

public actual fun uregexFindNext(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexFindNext")

public actual fun uregexFlags(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexFlags")

public actual fun uregexGetFindProgressCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexFindProgressCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetFindProgressCallback")

public actual fun uregexGetMatchCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexMatchCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetMatchCallback")

public actual fun uregexGetStackLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetStackLimit")

public actual fun uregexGetText(regexp: MutPtr<URegularExpression>, textlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetText")

public actual fun uregexGetTimeLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetTimeLimit")

public actual fun uregexGetUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGetUtext")

public actual fun uregexGroup(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGroup")

public actual fun uregexGroupCount(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGroupCount")

public actual fun uregexGroupNumberFromCname(regexp: MutPtr<URegularExpression>, groupname: Pcstr, namelength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGroupNumberFromCname")

public actual fun uregexGroupNumberFromName(regexp: MutPtr<URegularExpression>, groupname: ConstPtr<UShort>, namelength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGroupNumberFromName")

public actual fun uregexGroupUtext(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UText>, grouplength: MutPtr<Long>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexGroupUtext")

public actual fun uregexHasAnchoringBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexHasAnchoringBounds")

public actual fun uregexHasTransparentBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexHasTransparentBounds")

public actual fun uregexHitEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexHitEnd")

public actual fun uregexLookingAt(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexLookingAt")

public actual fun uregexLookingAt64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexLookingAt64")

public actual fun uregexMatches(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexMatches")

public actual fun uregexMatches64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexMatches64")

public actual fun uregexOpen(pattern: ConstPtr<UShort>, patternlength: Int, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexOpen")

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexOpenC")

public actual fun uregexOpenUtext(pattern: MutPtr<UText>, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexOpenUtext")

public actual fun uregexPattern(regexp: ConstPtr<URegularExpression>, patlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexPattern")

public actual fun uregexPatternUtext(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexPatternUtext")

public actual fun uregexRefreshUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRefreshUtext")

public actual fun uregexRegionEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRegionEnd")

public actual fun uregexRegionEnd64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRegionEnd64")

public actual fun uregexRegionStart(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRegionStart")

public actual fun uregexRegionStart64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRegionStart64")

public actual fun uregexReplaceAll(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReplaceAll")

public actual fun uregexReplaceAllUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReplaceAllUtext")

public actual fun uregexReplaceFirst(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReplaceFirst")

public actual fun uregexReplaceFirstUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReplaceFirstUtext")

public actual fun uregexRequireEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexRequireEnd")

public actual fun uregexReset(regexp: MutPtr<URegularExpression>, index: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReset")

public actual fun uregexReset64(regexp: MutPtr<URegularExpression>, index: Long, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexReset64")

public actual fun uregexSetFindProgressCallback(regexp: MutPtr<URegularExpression>, callback: URegexFindProgressCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetFindProgressCallback")

public actual fun uregexSetMatchCallback(regexp: MutPtr<URegularExpression>, callback: URegexMatchCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetMatchCallback")

public actual fun uregexSetRegion(regexp: MutPtr<URegularExpression>, regionstart: Int, regionlimit: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetRegion")

public actual fun uregexSetRegion64(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetRegion64")

public actual fun uregexSetRegionAndStart(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetRegionAndStart")

public actual fun uregexSetStackLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetStackLimit")

public actual fun uregexSetText(regexp: MutPtr<URegularExpression>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetText")

public actual fun uregexSetTimeLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetTimeLimit")

public actual fun uregexSetUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSetUtext")

public actual fun uregexSplit(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<UShort>, destcapacity: Int, requiredcapacity: MutPtr<Int>, destfields: MutPtr<MutPtr<UShort>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSplit")

public actual fun uregexSplitUtext(regexp: MutPtr<URegularExpression>, destfields: MutPtr<MutPtr<UText>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexSplitUtext")

public actual fun uregexStart(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexStart")

public actual fun uregexStart64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexStart64")

public actual fun uregexUseAnchoringBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexUseAnchoringBounds")

public actual fun uregexUseTransparentBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregexUseTransparentBounds")

public actual fun uregionAreEqual(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionAreEqual")

public actual fun uregionContains(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionContains")

public actual fun uregionGetAvailable(type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetAvailable")

public actual fun uregionGetContainedRegions(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetContainedRegions")

public actual fun uregionGetContainedRegionsOfType(uregion: ConstPtr<URegion>, type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType")

public actual fun uregionGetContainingRegion(uregion: ConstPtr<URegion>): MutPtr<URegion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetContainingRegion")

public actual fun uregionGetContainingRegionOfType(uregion: ConstPtr<URegion>, type: URegionType): MutPtr<URegion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType")

public actual fun uregionGetNumericCode(uregion: ConstPtr<URegion>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetNumericCode")

public actual fun uregionGetPreferredValues(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetPreferredValues")

public actual fun uregionGetRegionCode(uregion: ConstPtr<URegion>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetRegionCode")

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetRegionFromCode")

public actual fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode")

public actual fun uregionGetType(uregion: ConstPtr<URegion>): URegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUregionGetType")

public actual fun ureldatefmtClose(reldatefmt: MutPtr<URelativeDateTimeFormatter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtClose")

public actual fun ureldatefmtCloseResult(ufrdt: MutPtr<UFormattedRelativeDateTime>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtCloseResult")

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, relativedatestring: ConstPtr<UShort>, relativedatestringlen: Int, timestring: ConstPtr<UShort>, timestringlen: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime")

public actual fun ureldatefmtFormat(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtFormat")

public actual fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric")

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult")

public actual fun ureldatefmtFormatToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtFormatToResult")

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr<MutPtr<CVoid>>, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr<UErrorCode>): MutPtr<URelativeDateTimeFormatter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtOpen")

public actual fun ureldatefmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedRelativeDateTime> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtOpenResult")

public actual fun ureldatefmtResultAsValue(ufrdt: ConstPtr<UFormattedRelativeDateTime>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUreldatefmtResultAsValue")

public actual fun uresClose(resourcebundle: MutPtr<UResourceBundle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresClose")

public actual fun uresGetBinary(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetBinary")

public actual fun uresGetByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexr: Int, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetByIndex")

public actual fun uresGetByKey(resourcebundle: ConstPtr<UResourceBundle>, key: Pcstr, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetByKey")

public actual fun uresGetInt(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetInt")

public actual fun uresGetIntVector(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<Int> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetIntVector")

public actual fun uresGetKey(resourcebundle: ConstPtr<UResourceBundle>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetKey")

public actual fun uresGetLocaleByType(resourcebundle: ConstPtr<UResourceBundle>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetLocaleByType")

public actual fun uresGetNextResource(resourcebundle: MutPtr<UResourceBundle>, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetNextResource")

public actual fun uresGetNextString(resourcebundle: MutPtr<UResourceBundle>, len: MutPtr<Int>, key: ConstPtr<ConstPtr<Byte>>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetNextString")

public actual fun uresGetSize(resourcebundle: ConstPtr<UResourceBundle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetSize")

public actual fun uresGetString(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetString")

public actual fun uresGetStringByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexs: Int, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetStringByIndex")

public actual fun uresGetStringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetStringByKey")

public actual fun uresGetType(resourcebundle: ConstPtr<UResourceBundle>): UResType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetType")

public actual fun uresGetUint(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetUint")

public actual fun uresGetUtf8String(resb: ConstPtr<UResourceBundle>, dest: Pcstr, length: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetUtf8String")

public actual fun uresGetUtf8StringByIndex(resb: ConstPtr<UResourceBundle>, stringindex: Int, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex")

public actual fun uresGetUtf8StringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetUtf8StringByKey")

public actual fun uresGetVersion(resb: ConstPtr<UResourceBundle>, versioninfo: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresGetVersion")

public actual fun uresHasNext(resourcebundle: ConstPtr<UResourceBundle>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresHasNext")

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresOpen")

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresOpenAvailableLocales")

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresOpenDirect")

public actual fun uresOpenU(packagename: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresOpenU")

public actual fun uresResetIterator(resourcebundle: MutPtr<UResourceBundle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUresResetIterator")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters")
private external fun wasiWindowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script: Int): Int

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    wasiWindowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script).toByte()

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr<UScriptCode>, capacity: Int, err: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetCode")

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetName")

public actual fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetSampleString")

public actual fun uscriptGetScript(codepoint: Int, err: MutPtr<UErrorCode>): UScriptCode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetScript")

public actual fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr<UScriptCode>, capacity: Int, errorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetScriptExtensions")

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUscriptGetShortName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUscriptGetUsage")
private external fun wasiWindowssysWindowsWin32GlobalizationUscriptGetUsage(script: Int): Int

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    wasiWindowssysWindowsWin32GlobalizationUscriptGetUsage(script)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUscriptHasScript")
private external fun wasiWindowssysWindowsWin32GlobalizationUscriptHasScript(c: Int, sc: Int): Int

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    wasiWindowssysWindowsWin32GlobalizationUscriptHasScript(c, sc).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUscriptIsCased")
private external fun wasiWindowssysWindowsWin32GlobalizationUscriptIsCased(script: Int): Int

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    wasiWindowssysWindowsWin32GlobalizationUscriptIsCased(script).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUscriptIsRightToLeft")
private external fun wasiWindowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script: Int): Int

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    wasiWindowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script).toByte()

public actual fun usearchClose(searchiter: MutPtr<UStringSearch>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchClose")

public actual fun usearchFirst(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchFirst")

public actual fun usearchFollowing(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchFollowing")

public actual fun usearchGetAttribute(strsrch: ConstPtr<UStringSearch>, attribute: USearchAttribute): USearchAttributeValue =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetAttribute")

public actual fun usearchGetBreakIterator(strsrch: ConstPtr<UStringSearch>): MutPtr<UBreakIterator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetBreakIterator")

public actual fun usearchGetCollator(strsrch: ConstPtr<UStringSearch>): MutPtr<UCollator> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetCollator")

public actual fun usearchGetMatchedLength(strsrch: ConstPtr<UStringSearch>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetMatchedLength")

public actual fun usearchGetMatchedStart(strsrch: ConstPtr<UStringSearch>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetMatchedStart")

public actual fun usearchGetMatchedText(strsrch: ConstPtr<UStringSearch>, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetMatchedText")

public actual fun usearchGetOffset(strsrch: ConstPtr<UStringSearch>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetOffset")

public actual fun usearchGetPattern(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetPattern")

public actual fun usearchGetText(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchGetText")

public actual fun usearchLast(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchLast")

public actual fun usearchNext(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchNext")

public actual fun usearchOpen(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, locale: Pcstr, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchOpen")

public actual fun usearchOpenFromCollator(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, collator: ConstPtr<UCollator>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchOpenFromCollator")

public actual fun usearchPreceding(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchPreceding")

public actual fun usearchPrevious(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchPrevious")

public actual fun usearchReset(strsrch: MutPtr<UStringSearch>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchReset")

public actual fun usearchSetAttribute(strsrch: MutPtr<UStringSearch>, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetAttribute")

public actual fun usearchSetBreakIterator(strsrch: MutPtr<UStringSearch>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetBreakIterator")

public actual fun usearchSetCollator(strsrch: MutPtr<UStringSearch>, collator: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetCollator")

public actual fun usearchSetOffset(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetOffset")

public actual fun usearchSetPattern(strsrch: MutPtr<UStringSearch>, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetPattern")

public actual fun usearchSetText(strsrch: MutPtr<UStringSearch>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsearchSetText")

public actual fun usetAdd(set: MutPtr<USet>, c: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetAdd")

public actual fun usetAddAll(set: MutPtr<USet>, additionalset: ConstPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetAddAll")

public actual fun usetAddAllCodePoints(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetAddAllCodePoints")

public actual fun usetAddRange(set: MutPtr<USet>, start: Int, end: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetAddRange")

public actual fun usetAddString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetAddString")

public actual fun usetApplyIntPropertyValue(set: MutPtr<USet>, prop: UProperty, value: Int, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue")

public actual fun usetApplyPattern(set: MutPtr<USet>, pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetApplyPattern")

public actual fun usetApplyPropertyAlias(set: MutPtr<USet>, prop: ConstPtr<UShort>, proplength: Int, value: ConstPtr<UShort>, valuelength: Int, ec: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetApplyPropertyAlias")

public actual fun usetCharAt(set: ConstPtr<USet>, charindex: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetCharAt")

public actual fun usetClear(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetClear")

public actual fun usetClone(set: ConstPtr<USet>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetClone")

public actual fun usetCloneAsThawed(set: ConstPtr<USet>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetCloneAsThawed")

public actual fun usetClose(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetClose")

public actual fun usetCloseOver(set: MutPtr<USet>, attributes: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetCloseOver")

public actual fun usetCompact(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetCompact")

public actual fun usetComplement(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetComplement")

public actual fun usetComplementAll(set: MutPtr<USet>, complement: ConstPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetComplementAll")

public actual fun usetContains(set: ConstPtr<USet>, c: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContains")

public actual fun usetContainsAll(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsAll")

public actual fun usetContainsAllCodePoints(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsAllCodePoints")

public actual fun usetContainsNone(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsNone")

public actual fun usetContainsRange(set: ConstPtr<USet>, start: Int, end: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsRange")

public actual fun usetContainsSome(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsSome")

public actual fun usetContainsString(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetContainsString")

public actual fun usetEquals(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetEquals")

public actual fun usetFreeze(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetFreeze")

public actual fun usetGetItem(set: ConstPtr<USet>, itemindex: Int, start: MutPtr<Int>, end: MutPtr<Int>, str: MutPtr<UShort>, strcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetGetItem")

public actual fun usetGetItemCount(set: ConstPtr<USet>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetGetItemCount")

public actual fun usetGetSerializedRange(set: ConstPtr<USerializedSet>, rangeindex: Int, pstart: MutPtr<Int>, pend: MutPtr<Int>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetGetSerializedRange")

public actual fun usetGetSerializedRangeCount(set: ConstPtr<USerializedSet>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount")

public actual fun usetGetSerializedSet(fillset: MutPtr<USerializedSet>, src: ConstPtr<UShort>, srclength: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetGetSerializedSet")

public actual fun usetIndexOf(set: ConstPtr<USet>, c: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetIndexOf")

public actual fun usetIsEmpty(set: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetIsEmpty")

public actual fun usetIsFrozen(set: ConstPtr<USet>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetIsFrozen")

public actual fun usetOpen(start: Int, end: Int): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetOpen")

public actual fun usetOpenEmpty(): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetOpenEmpty")

public actual fun usetOpenPattern(pattern: ConstPtr<UShort>, patternlength: Int, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetOpenPattern")

public actual fun usetOpenPatternOptions(pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetOpenPatternOptions")

public actual fun usetRemove(set: MutPtr<USet>, c: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRemove")

public actual fun usetRemoveAll(set: MutPtr<USet>, removeset: ConstPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRemoveAll")

public actual fun usetRemoveAllStrings(set: MutPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRemoveAllStrings")

public actual fun usetRemoveRange(set: MutPtr<USet>, start: Int, end: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRemoveRange")

public actual fun usetRemoveString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRemoveString")

public actual fun usetResemblesPattern(pattern: ConstPtr<UShort>, patternlength: Int, pos: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetResemblesPattern")

public actual fun usetRetain(set: MutPtr<USet>, start: Int, end: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRetain")

public actual fun usetRetainAll(set: MutPtr<USet>, retain: ConstPtr<USet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetRetainAll")

public actual fun usetSerialize(set: ConstPtr<USet>, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSerialize")

public actual fun usetSerializedContains(set: ConstPtr<USerializedSet>, c: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSerializedContains")

public actual fun usetSet(set: MutPtr<USet>, start: Int, end: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSet")

public actual fun usetSetSerializedToOne(fillset: MutPtr<USerializedSet>, c: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSetSerializedToOne")

public actual fun usetSize(set: ConstPtr<USet>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSize")

public actual fun usetSpan(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSpan")

public actual fun usetSpanBack(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSpanBack")

public actual fun usetSpanBackUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSpanBackUtf8")

public actual fun usetSpanUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetSpanUtf8")

public actual fun usetToPattern(set: ConstPtr<USet>, result: MutPtr<UShort>, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsetToPattern")

public actual fun uspoofAreConfusable(sc: ConstPtr<USpoofChecker>, id1: ConstPtr<UShort>, length1: Int, id2: ConstPtr<UShort>, length2: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofAreConfusable")

public actual fun uspoofAreConfusableUtf8(sc: ConstPtr<USpoofChecker>, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8")

public actual fun uspoofCheck(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofCheck")

public actual fun uspoofCheck2(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofCheck2")

public actual fun uspoofCheck2Utf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofCheck2Utf8")

public actual fun uspoofCheckUtf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofCheckUtf8")

public actual fun uspoofClone(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofClone")

public actual fun uspoofClose(sc: MutPtr<USpoofChecker>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofClose")

public actual fun uspoofCloseCheckResult(checkresult: MutPtr<USpoofCheckResult>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofCloseCheckResult")

public actual fun uspoofGetAllowedChars(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetAllowedChars")

public actual fun uspoofGetAllowedLocales(sc: MutPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetAllowedLocales")

public actual fun uspoofGetCheckResultChecks(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks")

public actual fun uspoofGetCheckResultNumerics(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics")

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): URestrictionLevel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel")

public actual fun uspoofGetChecks(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetChecks")

public actual fun uspoofGetInclusionSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetInclusionSet")

public actual fun uspoofGetRecommendedSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetRecommendedSet")

public actual fun uspoofGetRestrictionLevel(sc: ConstPtr<USpoofChecker>): URestrictionLevel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel")

public actual fun uspoofGetSkeleton(sc: ConstPtr<USpoofChecker>, type: UInt, id: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetSkeleton")

public actual fun uspoofGetSkeletonUtf8(sc: ConstPtr<USpoofChecker>, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8")

public actual fun uspoofOpen(status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofOpen")

public actual fun uspoofOpenCheckResult(status: MutPtr<UErrorCode>): MutPtr<USpoofCheckResult> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofOpenCheckResult")

public actual fun uspoofOpenFromSerialized(data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofOpenFromSerialized")

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr<Int>, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofOpenFromSource")

public actual fun uspoofSerialize(sc: MutPtr<USpoofChecker>, data: MutPtr<CVoid>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofSerialize")

public actual fun uspoofSetAllowedChars(sc: MutPtr<USpoofChecker>, chars: ConstPtr<USet>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofSetAllowedChars")

public actual fun uspoofSetAllowedLocales(sc: MutPtr<USpoofChecker>, localeslist: Pcstr, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofSetAllowedLocales")

public actual fun uspoofSetChecks(sc: MutPtr<USpoofChecker>, checks: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofSetChecks")

public actual fun uspoofSetRestrictionLevel(sc: MutPtr<USpoofChecker>, restrictionlevel: URestrictionLevel): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel")

public actual fun usprepClose(profile: MutPtr<UStringPrepProfile>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsprepClose")

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsprepOpen")

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsprepOpenByType")

public actual fun usprepPrepare(prep: ConstPtr<UStringPrepProfile>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destcapacity: Int, options: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUsprepPrepare")

public actual fun utextChar32At(ut: MutPtr<UText>, nativeindex: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextChar32At")

public actual fun utextClone(dest: MutPtr<UText>, src: ConstPtr<UText>, deep: Byte, readonly: Byte, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextClone")

public actual fun utextClose(ut: MutPtr<UText>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextClose")

public actual fun utextCopy(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextCopy")

public actual fun utextCurrent32(ut: MutPtr<UText>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextCurrent32")

public actual fun utextEquals(a: ConstPtr<UText>, b: ConstPtr<UText>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextEquals")

public actual fun utextExtract(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextExtract")

public actual fun utextFreeze(ut: MutPtr<UText>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextFreeze")

public actual fun utextGetNativeIndex(ut: ConstPtr<UText>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextGetNativeIndex")

public actual fun utextGetPreviousNativeIndex(ut: MutPtr<UText>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex")

public actual fun utextHasMetaData(ut: ConstPtr<UText>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextHasMetaData")

public actual fun utextIsLengthExpensive(ut: ConstPtr<UText>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextIsLengthExpensive")

public actual fun utextIsWritable(ut: ConstPtr<UText>): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextIsWritable")

public actual fun utextMoveIndex32(ut: MutPtr<UText>, delta: Int): Byte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextMoveIndex32")

public actual fun utextNativeLength(ut: MutPtr<UText>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextNativeLength")

public actual fun utextNext32(ut: MutPtr<UText>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextNext32")

public actual fun utextNext32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextNext32From")

public actual fun utextOpenUchars(ut: MutPtr<UText>, s: ConstPtr<UShort>, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextOpenUchars")

public actual fun utextOpenUtf8(ut: MutPtr<UText>, s: Pcstr, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextOpenUtf8")

public actual fun utextPrevious32(ut: MutPtr<UText>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextPrevious32")

public actual fun utextPrevious32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextPrevious32From")

public actual fun utextReplace(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr<UShort>, replacementlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextReplace")

public actual fun utextSetNativeIndex(ut: MutPtr<UText>, nativeindex: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextSetNativeIndex")

public actual fun utextSetup(ut: MutPtr<UText>, extraspace: Int, status: MutPtr<UErrorCode>): MutPtr<UText> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtextSetup")

public actual fun utf8AppendCharSafeBody(s: MutPtr<UByte>, i: Int, length: Int, c: Int, piserror: MutPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody")

public actual fun utf8Back1SafeBody(s: ConstPtr<UByte>, start: Int, i: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtf8Back1SafeBody")

public actual fun utf8NextCharSafeBody(s: ConstPtr<UByte>, pi: MutPtr<Int>, length: Int, c: Int, strict: Byte): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtf8NextCharSafeBody")

public actual fun utf8PrevCharSafeBody(s: ConstPtr<UByte>, start: Int, pi: MutPtr<Int>, c: Int, strict: Byte): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody")

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtmscaleFromInt64")

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue")

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtmscaleToInt64")

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtraceFormat")

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtraceFunctionName")

public actual fun utraceGetFunctions(context: ConstPtr<ConstPtr<CVoid>>, e: MutPtr<UTraceEntry>, x: MutPtr<UTraceExit>, d: MutPtr<UTraceData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtraceGetFunctions")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUtraceGetLevel")
private external fun wasiWindowssysWindowsWin32GlobalizationUtraceGetLevel(): Int

public actual fun utraceGetLevel(): Int =
    wasiWindowssysWindowsWin32GlobalizationUtraceGetLevel()

public actual fun utraceSetFunctions(context: ConstPtr<CVoid>, e: UTraceEntry, x: UTraceExit, d: UTraceData): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtraceSetFunctions")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUtraceSetLevel")
private external fun wasiWindowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel: Int): Unit

public actual fun utraceSetLevel(tracelevel: Int): Unit =
    wasiWindowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel)

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtraceVformat")

public actual fun utransClone(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransClone")

public actual fun utransClose(trans: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransClose")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GlobalizationUtransCountAvailableIds")
private external fun wasiWindowssysWindowsWin32GlobalizationUtransCountAvailableIds(): Int

public actual fun utransCountAvailableIds(): Int =
    wasiWindowssysWindowsWin32GlobalizationUtransCountAvailableIds()

public actual fun utransGetSourceSet(trans: ConstPtr<ConstPtr<CVoid>>, ignorefilter: Byte, fillin: MutPtr<USet>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransGetSourceSet")

public actual fun utransGetUnicodeId(trans: ConstPtr<ConstPtr<CVoid>>, resultlength: MutPtr<Int>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransGetUnicodeId")

public actual fun utransOpenIds(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransOpenIds")

public actual fun utransOpenInverse(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransOpenInverse")

public actual fun utransOpenU(id: ConstPtr<UShort>, idlength: Int, dir: UTransDirection, rules: ConstPtr<UShort>, ruleslength: Int, parseerror: MutPtr<UParseError>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransOpenU")

public actual fun utransRegister(adoptedtrans: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransRegister")

public actual fun utransSetFilter(trans: MutPtr<MutPtr<CVoid>>, filterpattern: ConstPtr<UShort>, filterpatternlen: Int, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransSetFilter")

public actual fun utransToRules(trans: ConstPtr<ConstPtr<CVoid>>, escapeunprintable: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransToRules")

public actual fun utransTrans(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransTrans")

public actual fun utransTransIncremental(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransTransIncremental")

public actual fun utransTransIncrementalUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransTransIncrementalUchars")

public actual fun utransTransUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransTransUchars")

public actual fun utransUnregisterId(id: ConstPtr<UShort>, idlength: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GlobalizationUtransUnregisterId")
