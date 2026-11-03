package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: PCSTR): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: PCSTR, param1: UInt): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: PCWSTR, param3: Foundation.LPARAM): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(param0: PCWSTR, param1: UInt): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(param0: PCWSTR): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Foundation.LPARAM): BOOL
}

public fun interface FnCallback6 {
    public operator fun invoke(param0: UInt, param1: UInt, param2: PCSTR, param3: Long): BOOL
}

public fun interface FnCallback7 {
    public operator fun invoke(param0: UInt, param1: UInt, param2: PCWSTR, param3: Long): BOOL
}

public fun interface FnCallback8 {
    public operator fun invoke(param0: Int): BOOL
}

public fun interface FnCallback9 {
    public operator fun invoke(param0: PCWSTR, param1: Foundation.LPARAM): BOOL
}

public fun interface FnCallback10 {
    public operator fun invoke(param0: UInt, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): BOOL
}

public fun interface FnCallback11 {
    public operator fun invoke(param0: UInt, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): BOOL
}

public fun interface FnCallback12 {
    public operator fun invoke(param0: PCSTR, param1: Long): BOOL
}

public fun interface FnCallback13 {
    public operator fun invoke(param0: PCWSTR, param1: Long): BOOL
}

public fun interface FnCallback14 {
    public operator fun invoke(offset: Int, context: Long): UShort
}

public fun interface FnCallback15 {
    public operator fun invoke(context: Long, c: Int): UCharDirection
}

public fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AdjustCalendarDate", longArrayOf(lpcaldatetime, calunit.toLong(), amount.toLong())).toInt()
}

public fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CompareStringA", longArrayOf(locale.toLong(), dwcmpflags.toLong(), lpstring1, cchcount1.toLong(), lpstring2, cchcount2.toLong())).toInt()
}

public fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: Foundation.LPARAM): COMPARESTRING_RESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CompareStringEx", longArrayOf(lplocalename, dwcmpflags.toLong(), lpstring1, cchcount1.toLong(), lpstring2, cchcount2.toLong(), lpversioninformation, lpreserved, Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CompareStringOrdinal", longArrayOf(lpstring1, cchcount1.toLong(), lpstring2, cchcount2.toLong(), bignorecase.toLong())).toInt()
}

public fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CompareStringW", longArrayOf(locale.toLong(), dwcmpflags.toLong(), lpstring1, cchcount1.toLong(), lpstring2, cchcount2.toLong())).toInt()
}

public fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertCalDateTimeToSystemTime", longArrayOf(lpcaldatetime, lpsystime)).toInt()
}

public fun ConvertDefaultLocale(locale: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertDefaultLocale", longArrayOf(locale.toLong())).toUInt()
}

public fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertSystemTimeToCalDateTime", longArrayOf(lpsystime, calid.toLong(), lpcaldatetime)).toInt()
}

public fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumCalendarInfoA", longArrayOf(Win32DynamicFfi.objectSlot(lpcalinfoenumproc), locale.toLong(), calendar.toLong(), caltype.toLong())).toInt()
}

public fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumCalendarInfoExA", longArrayOf(Win32DynamicFfi.objectSlot(lpcalinfoenumprocex), locale.toLong(), calendar.toLong(), caltype.toLong())).toInt()
}

public fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumCalendarInfoExEx", longArrayOf(Win32DynamicFfi.objectSlot(pcalinfoenumprocexex), lplocalename, calendar.toLong(), lpreserved, caltype.toLong(), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumCalendarInfoExW", longArrayOf(Win32DynamicFfi.objectSlot(lpcalinfoenumprocex), locale.toLong(), calendar.toLong(), caltype.toLong())).toInt()
}

public fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumCalendarInfoW", longArrayOf(Win32DynamicFfi.objectSlot(lpcalinfoenumproc), locale.toLong(), calendar.toLong(), caltype.toLong())).toInt()
}

public fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumDateFormatsA", longArrayOf(Win32DynamicFfi.objectSlot(lpdatefmtenumproc), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumDateFormatsExA", longArrayOf(Win32DynamicFfi.objectSlot(lpdatefmtenumprocex), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumDateFormatsExEx", longArrayOf(Win32DynamicFfi.objectSlot(lpdatefmtenumprocexex), lplocalename, dwflags.toLong(), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumDateFormatsExW", longArrayOf(Win32DynamicFfi.objectSlot(lpdatefmtenumprocex), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumDateFormatsW", longArrayOf(Win32DynamicFfi.objectSlot(lpdatefmtenumproc), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumLanguageGroupLocalesA", longArrayOf(Win32DynamicFfi.objectSlot(lplanggrouplocaleenumproc), languagegroup.toLong(), dwflags.toLong(), lparam)).toInt()
}

public fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumLanguageGroupLocalesW", longArrayOf(Win32DynamicFfi.objectSlot(lplanggrouplocaleenumproc), languagegroup.toLong(), dwflags.toLong(), lparam)).toInt()
}

public fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemCodePagesA", longArrayOf(Win32DynamicFfi.objectSlot(lpcodepageenumproc), dwflags.toLong())).toInt()
}

public fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemCodePagesW", longArrayOf(Win32DynamicFfi.objectSlot(lpcodepageenumproc), dwflags.toLong())).toInt()
}

public fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemGeoID", longArrayOf(geoclass.toLong(), parentgeoid.toLong(), Win32DynamicFfi.objectSlot(lpgeoenumproc))).toInt()
}

public fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemGeoNames", longArrayOf(geoclass.toLong(), Win32DynamicFfi.objectSlot(geoenumproc), Win32DynamicFfi.objectSlot(data))).toInt()
}

public fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemLanguageGroupsA", longArrayOf(Win32DynamicFfi.objectSlot(lplanguagegroupenumproc), dwflags.toLong(), lparam)).toInt()
}

public fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemLanguageGroupsW", longArrayOf(Win32DynamicFfi.objectSlot(lplanguagegroupenumproc), dwflags.toLong(), lparam)).toInt()
}

public fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemLocalesA", longArrayOf(Win32DynamicFfi.objectSlot(lplocaleenumproc), dwflags.toLong())).toInt()
}

public fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: Foundation.LPARAM, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemLocalesEx", longArrayOf(Win32DynamicFfi.objectSlot(lplocaleenumprocex), dwflags.toLong(), Win32DynamicFfi.objectSlot(lparam), lpreserved)).toInt()
}

public fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumSystemLocalesW", longArrayOf(Win32DynamicFfi.objectSlot(lplocaleenumproc), dwflags.toLong())).toInt()
}

public fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumTimeFormatsA", longArrayOf(Win32DynamicFfi.objectSlot(lptimefmtenumproc), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumTimeFormatsEx", longArrayOf(Win32DynamicFfi.objectSlot(lptimefmtenumprocex), lplocalename, dwflags.toLong(), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumTimeFormatsW", longArrayOf(Win32DynamicFfi.objectSlot(lptimefmtenumproc), locale.toLong(), dwflags.toLong())).toInt()
}

public fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumUILanguagesA", longArrayOf(Win32DynamicFfi.objectSlot(lpuilanguageenumproc), dwflags.toLong(), lparam)).toInt()
}

public fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnumUILanguagesW", longArrayOf(Win32DynamicFfi.objectSlot(lpuilanguageenumproc), dwflags.toLong(), lparam)).toInt()
}

public fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNLSString", longArrayOf(locale.toLong(), dwfindnlsstringflags.toLong(), lpstringsource, cchsource.toLong(), lpstringvalue, cchvalue.toLong(), pcchfound)).toInt()
}

public fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNLSStringEx", longArrayOf(lplocalename, dwfindnlsstringflags.toLong(), lpstringsource, cchsource.toLong(), lpstringvalue, cchvalue.toLong(), pcchfound, lpversioninformation, lpreserved, Win32DynamicFfi.objectSlot(sorthandle))).toInt()
}

public fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindStringOrdinal", longArrayOf(dwfindstringordinalflags.toLong(), lpstringsource, cchsource.toLong(), lpstringvalue, cchvalue.toLong(), bignorecase.toLong())).toInt()
}

public fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "FoldStringA", longArrayOf(dwmapflags.toLong(), lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "FoldStringW", longArrayOf(dwmapflags.toLong(), lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun GetACP(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetACP", longArrayOf()).toUInt()
}

public fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCPInfo", longArrayOf(codepage.toLong(), lpcpinfo)).toInt()
}

public fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCPInfoExA", longArrayOf(codepage.toLong(), dwflags.toLong(), lpcpinfoex)).toInt()
}

public fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCPInfoExW", longArrayOf(codepage.toLong(), dwflags.toLong(), lpcpinfoex)).toInt()
}

public fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCalendarDateFormatEx", longArrayOf(lpszlocale, dwflags.toLong(), lpcaldatetime, lpformat, lpdatestr, cchdate.toLong())).toInt()
}

public fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCalendarInfoA", longArrayOf(locale.toLong(), calendar.toLong(), caltype.toLong(), lpcaldata, cchdata.toLong(), lpvalue)).toInt()
}

public fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCalendarInfoEx", longArrayOf(lplocalename, calendar.toLong(), lpreserved, caltype.toLong(), lpcaldata, cchdata.toLong(), lpvalue)).toInt()
}

public fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCalendarInfoW", longArrayOf(locale.toLong(), calendar.toLong(), caltype.toLong(), lpcaldata, cchdata.toLong(), lpvalue)).toInt()
}

public fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCalendarSupportedDateRange", longArrayOf(calendar.toLong(), lpcalmindatetime, lpcalmaxdatetime)).toInt()
}

public fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrencyFormatA", longArrayOf(locale.toLong(), dwflags.toLong(), lpvalue, lpformat, lpcurrencystr, cchcurrency.toLong())).toInt()
}

public fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrencyFormatEx", longArrayOf(lplocalename, dwflags.toLong(), lpvalue, lpformat, lpcurrencystr, cchcurrency.toLong())).toInt()
}

public fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrencyFormatW", longArrayOf(locale.toLong(), dwflags.toLong(), lpvalue, lpformat, lpcurrencystr, cchcurrency.toLong())).toInt()
}

public fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDateFormatA", longArrayOf(locale.toLong(), dwflags.toLong(), lpdate, lpformat, lpdatestr, cchdate.toLong())).toInt()
}

public fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDateFormatEx", longArrayOf(lplocalename, dwflags.toLong(), lpdate, lpformat, lpdatestr, cchdate.toLong(), lpcalendar)).toInt()
}

public fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDateFormatW", longArrayOf(locale.toLong(), dwflags.toLong(), lpdate, lpformat, lpdatestr, cchdate.toLong())).toInt()
}

public fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT {
    return Win32DynamicFfi.invoke("bcp47mrm.dll", "GetDistanceOfClosestLanguageInList", longArrayOf(pszlanguage, pszlanguageslist, wchlistdelimiter.toLong(), pclosestdistance)).toInt()
}

public fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDurationFormat", longArrayOf(locale.toLong(), dwflags.toLong(), lpduration, ullduration.toLong(), lpformat, lpdurationstr, cchduration.toLong())).toInt()
}

public fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDurationFormatEx", longArrayOf(lplocalename, dwflags.toLong(), lpduration, ullduration.toLong(), lpformat, lpdurationstr, cchduration.toLong())).toInt()
}

public fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileMUIInfo", longArrayOf(dwflags.toLong(), pcwszfilepath, pfilemuiinfo, pcbfilemuiinfo)).toInt()
}

public fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileMUIPath", longArrayOf(dwflags.toLong(), pcwszfilepath, pwszlanguage, pcchlanguage, pwszfilemuipath, pcchfilemuipath, pululenumerator)).toInt()
}

public fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetGeoInfoA", longArrayOf(location.toLong(), geotype.toLong(), lpgeodata, cchdata.toLong(), langid.toLong())).toInt()
}

public fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetGeoInfoEx", longArrayOf(location, geotype.toLong(), geodata, geodatacount.toLong())).toInt()
}

public fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetGeoInfoW", longArrayOf(location.toLong(), geotype.toLong(), lpgeodata, cchdata.toLong(), langid.toLong())).toInt()
}

public fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLocaleInfoA", longArrayOf(locale.toLong(), lctype.toLong(), lplcdata, cchdata.toLong())).toInt()
}

public fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLocaleInfoEx", longArrayOf(lplocalename, lctype.toLong(), lplcdata, cchdata.toLong())).toInt()
}

public fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLocaleInfoW", longArrayOf(locale.toLong(), lctype.toLong(), lplcdata, cchdata.toLong())).toInt()
}

public fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNLSVersion", longArrayOf(function.toLong(), locale.toLong(), lpversioninformation)).toInt()
}

public fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNLSVersionEx", longArrayOf(function.toLong(), lplocalename, lpversioninformation)).toInt()
}

public fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberFormatA", longArrayOf(locale.toLong(), dwflags.toLong(), lpvalue, lpformat, lpnumberstr, cchnumber.toLong())).toInt()
}

public fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberFormatEx", longArrayOf(lplocalename, dwflags.toLong(), lpvalue, lpformat, lpnumberstr, cchnumber.toLong())).toInt()
}

public fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumberFormatW", longArrayOf(locale.toLong(), dwflags.toLong(), lpvalue, lpformat, lpnumberstr, cchnumber.toLong())).toInt()
}

public fun GetOEMCP(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetOEMCP", longArrayOf()).toUInt()
}

public fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessPreferredUILanguages", longArrayOf(dwflags.toLong(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)).toInt()
}

public fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStringScripts", longArrayOf(dwflags.toLong(), lpstring, cchstring.toLong(), lpscripts, cchscripts.toLong())).toInt()
}

public fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStringTypeA", longArrayOf(locale.toLong(), dwinfotype.toLong(), lpsrcstr, cchsrc.toLong(), lpchartype)).toInt()
}

public fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStringTypeExA", longArrayOf(locale.toLong(), dwinfotype.toLong(), lpsrcstr, cchsrc.toLong(), lpchartype)).toInt()
}

public fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStringTypeExW", longArrayOf(locale.toLong(), dwinfotype.toLong(), lpsrcstr, cchsrc.toLong(), lpchartype)).toInt()
}

public fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStringTypeW", longArrayOf(dwinfotype.toLong(), lpsrcstr, cchsrc.toLong(), lpchartype)).toInt()
}

public fun GetSystemDefaultLCID(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDefaultLCID", longArrayOf()).toUInt()
}

public fun GetSystemDefaultLangID(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDefaultLangID", longArrayOf()).toUShort()
}

public fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDefaultLocaleName", longArrayOf(lplocalename, cchlocalename.toLong())).toInt()
}

public fun GetSystemDefaultUILanguage(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemDefaultUILanguage", longArrayOf()).toUShort()
}

public fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemPreferredUILanguages", longArrayOf(dwflags.toLong(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)).toInt()
}

public fun GetTextCharset(hdc: Graphics.Gdi.HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextCharset", longArrayOf(Win32DynamicFfi.objectSlot(hdc))).toInt()
}

public fun GetTextCharsetInfo(hdc: Graphics.Gdi.HDC, lpsig: Long, dwflags: UInt): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextCharsetInfo", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpsig, dwflags.toLong())).toInt()
}

public fun GetThreadLocale(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadLocale", longArrayOf()).toUInt()
}

public fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadPreferredUILanguages", longArrayOf(dwflags.toLong(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)).toInt()
}

public fun GetThreadUILanguage(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadUILanguage", longArrayOf()).toUShort()
}

public fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTimeFormatA", longArrayOf(locale.toLong(), dwflags.toLong(), lptime, lpformat, lptimestr, cchtime.toLong())).toInt()
}

public fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTimeFormatEx", longArrayOf(lplocalename, dwflags.toLong(), lptime, lpformat, lptimestr, cchtime.toLong())).toInt()
}

public fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTimeFormatW", longArrayOf(locale.toLong(), dwflags.toLong(), lptime, lpformat, lptimestr, cchtime.toLong())).toInt()
}

public fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUILanguageInfo", longArrayOf(dwflags.toLong(), pwmszlanguage, pwszfallbacklanguages, pcchfallbacklanguages, pattributes)).toInt()
}

public fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserDefaultGeoName", longArrayOf(geoname, geonamecount.toLong())).toInt()
}

public fun GetUserDefaultLCID(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserDefaultLCID", longArrayOf()).toUInt()
}

public fun GetUserDefaultLangID(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserDefaultLangID", longArrayOf()).toUShort()
}

public fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserDefaultLocaleName", longArrayOf(lplocalename, cchlocalename.toLong())).toInt()
}

public fun GetUserDefaultUILanguage(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserDefaultUILanguage", longArrayOf()).toUShort()
}

public fun GetUserGeoID(geoclass: SYSGEOCLASS): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserGeoID", longArrayOf(geoclass.toLong())).toInt()
}

public fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUserPreferredUILanguages", longArrayOf(dwflags.toLong(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)).toInt()
}

public fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int {
    return Win32DynamicFfi.invoke("normaliz.dll", "IdnToAscii", longArrayOf(dwflags.toLong(), lpunicodecharstr, cchunicodechar.toLong(), lpasciicharstr, cchasciichar.toLong())).toInt()
}

public fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "IdnToNameprepUnicode", longArrayOf(dwflags.toLong(), lpunicodecharstr, cchunicodechar.toLong(), lpnameprepcharstr, cchnameprepchar.toLong())).toInt()
}

public fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int {
    return Win32DynamicFfi.invoke("normaliz.dll", "IdnToUnicode", longArrayOf(dwflags.toLong(), lpasciicharstr, cchasciichar.toLong(), lpunicodecharstr, cchunicodechar.toLong())).toInt()
}

public fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsCalendarLeapYear", longArrayOf(calid.toLong(), year.toLong(), era.toLong())).toInt()
}

public fun IsDBCSLeadByte(testchar: UByte): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsDBCSLeadByte", longArrayOf(testchar.toLong())).toInt()
}

public fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsDBCSLeadByteEx", longArrayOf(codepage.toLong(), testchar.toLong())).toInt()
}

public fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsNLSDefinedString", longArrayOf(function.toLong(), dwflags.toLong(), lpversioninformation, lpstring, cchstr.toLong())).toInt()
}

public fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsNormalizedString", longArrayOf(normform.toLong(), lpstring, cwlength.toLong())).toInt()
}

public fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsTextUnicode", longArrayOf(lpv, isize.toLong(), lpiresult)).toInt()
}

public fun IsValidCodePage(codepage: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsValidCodePage", longArrayOf(codepage.toLong())).toInt()
}

public fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsValidLanguageGroup", longArrayOf(languagegroup.toLong(), dwflags.toLong())).toInt()
}

public fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsValidLocale", longArrayOf(locale.toLong(), dwflags.toLong())).toInt()
}

public fun IsValidLocaleName(lplocalename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsValidLocaleName", longArrayOf(lplocalename)).toInt()
}

public fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsValidNLSVersion", longArrayOf(function.toLong(), lplocalename, lpversioninformation)).toUInt()
}

public fun IsWellFormedTag(psztag: PCWSTR): UByte {
    return Win32DynamicFfi.invoke("bcp47mrm.dll", "IsWellFormedTag", longArrayOf(psztag)).toUByte()
}

public fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LCIDToLocaleName", longArrayOf(locale.toLong(), lpname, cchname.toLong(), dwflags.toLong())).toInt()
}

public fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LCMapStringA", longArrayOf(locale.toLong(), dwmapflags.toLong(), lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LCMapStringEx", longArrayOf(lplocalename, dwmapflags.toLong(), lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong(), lpversioninformation, lpreserved, Win32DynamicFfi.objectSlot(sorthandle))).toInt()
}

public fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LCMapStringW", longArrayOf(locale.toLong(), dwmapflags.toLong(), lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocaleNameToLCID", longArrayOf(lpname, dwflags.toLong())).toUInt()
}

public fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("elscore.dll", "MappingDoAction", longArrayOf(pbag, dwrangeindex.toLong(), pszactionid)).toInt()
}

public fun MappingFreePropertyBag(pbag: Long): HRESULT {
    return Win32DynamicFfi.invoke("elscore.dll", "MappingFreePropertyBag", longArrayOf(pbag)).toInt()
}

public fun MappingFreeServices(pserviceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("elscore.dll", "MappingFreeServices", longArrayOf(pserviceinfo)).toInt()
}

public fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT {
    return Win32DynamicFfi.invoke("elscore.dll", "MappingGetServices", longArrayOf(poptions, prgservices, pdwservicescount)).toInt()
}

public fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT {
    return Win32DynamicFfi.invoke("elscore.dll", "MappingRecognizeText", longArrayOf(pserviceinfo, psztext, dwlength.toLong(), dwindex.toLong(), poptions, pbag)).toInt()
}

public fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "MultiByteToWideChar", longArrayOf(codepage.toLong(), dwflags.toLong(), lpmultibytestr, cbmultibyte.toLong(), lpwidecharstr, cchwidechar.toLong())).toInt()
}

public fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "NormalizeString", longArrayOf(normform.toLong(), lpsrcstring, cwsrclength.toLong(), lpdststring, cwdstlength.toLong())).toInt()
}

public fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "NotifyUILanguageChange", longArrayOf(dwflags.toLong(), pcwstrnewlanguage, pcwstrpreviouslanguage, dwreserved.toLong(), pdwstatusrtrn)).toInt()
}

public fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResolveLocaleName", longArrayOf(lpnametoresolve, lplocalename, cchlocalename.toLong())).toInt()
}

public fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES) {
    Win32DynamicFfi.invoke("kernel32.dll", "RestoreThreadPreferredUILanguages", longArrayOf(snapshot))
}

public fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptApplyDigitSubstitution", longArrayOf(psds, psc, pss)).toInt()
}

public fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptApplyLogicalWidth", longArrayOf(pidx, cchars.toLong(), cglyphs.toLong(), pwlogclust, psva, piadvance, psa, pabc, pijustify)).toInt()
}

public fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptBreak", longArrayOf(pwcchars, cchars.toLong(), psa, psla)).toInt()
}

public fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptCPtoX", longArrayOf(icp.toLong(), ftrailing.toLong(), cchars.toLong(), cglyphs.toLong(), pwlogclust, psva, piadvance, psa, pix)).toInt()
}

public fun ScriptCacheGetHeight(hdc: Graphics.Gdi.HDC, psc: Long, tmheight: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptCacheGetHeight", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, tmheight)).toInt()
}

public fun ScriptFreeCache(psc: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptFreeCache", longArrayOf(psc)).toInt()
}

public fun ScriptGetCMap(hdc: Graphics.Gdi.HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetCMap", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, pwcinchars, cchars.toLong(), dwflags.toLong(), pwoutglyphs)).toInt()
}

public fun ScriptGetFontAlternateGlyphs(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetFontAlternateGlyphs", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), tagfeature.toLong(), wglyphid.toLong(), cmaxalternates.toLong(), palternateglyphs, pcalternates)).toInt()
}

public fun ScriptGetFontFeatureTags(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetFontFeatureTags", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), cmaxtags.toLong(), pfeaturetags, pctags)).toInt()
}

public fun ScriptGetFontLanguageTags(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetFontLanguageTags", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), cmaxtags.toLong(), plangsystags, pctags)).toInt()
}

public fun ScriptGetFontProperties(hdc: Graphics.Gdi.HDC, psc: Long, sfp: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetFontProperties", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, sfp)).toInt()
}

public fun ScriptGetFontScriptTags(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetFontScriptTags", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, cmaxtags.toLong(), pscripttags, pctags)).toInt()
}

public fun ScriptGetGlyphABCWidth(hdc: Graphics.Gdi.HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetGlyphABCWidth", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, wglyph.toLong(), pabc)).toInt()
}

public fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetLogicalWidths", longArrayOf(psa, cchars.toLong(), cglyphs.toLong(), piglyphwidth, pwlogclust, psva, pidx)).toInt()
}

public fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptGetProperties", longArrayOf(ppsp, pinumscripts)).toInt()
}

public fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptIsComplex", longArrayOf(pwcinchars, cinchars.toLong(), dwflags.toLong())).toInt()
}

public fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptItemize", longArrayOf(pwcinchars, cinchars.toLong(), cmaxitems.toLong(), pscontrol, psstate, pitems, pcitems)).toInt()
}

public fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptItemizeOpenType", longArrayOf(pwcinchars, cinchars.toLong(), cmaxitems.toLong(), pscontrol, psstate, pitems, pscripttags, pcitems)).toInt()
}

public fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptJustify", longArrayOf(psva, piadvance, cglyphs.toLong(), idx.toLong(), iminkashida.toLong(), pijustify)).toInt()
}

public fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptLayout", longArrayOf(cruns.toLong(), pblevel, pivisualtological, pilogicaltovisual)).toInt()
}

public fun ScriptPlace(hdc: Graphics.Gdi.HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptPlace", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, pwglyphs, cglyphs.toLong(), psva, psa, piadvance, pgoffset, pabc)).toInt()
}

public fun ScriptPlaceOpenType(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptPlaceOpenType", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), rcrangechars, rprangeproperties, cranges.toLong(), pwcchars, pwlogclust, pcharprops, cchars.toLong(), pwglyphs, pglyphprops, cglyphs.toLong(), piadvance, pgoffset, pabc)).toInt()
}

public fun ScriptPositionSingleGlyph(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptPositionSingleGlyph", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), tagfeature.toLong(), lparameter.toLong(), wglyphid.toLong(), iadvance.toLong(), Win32DynamicFfi.objectSlot(goffset), pioutadvance, poutgoffset)).toInt()
}

public fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptRecordDigitSubstitution", longArrayOf(locale.toLong(), psds)).toInt()
}

public fun ScriptShape(hdc: Graphics.Gdi.HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptShape", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, pwcchars, cchars.toLong(), cmaxglyphs.toLong(), psa, pwoutglyphs, pwlogclust, psva, pcglyphs)).toInt()
}

public fun ScriptShapeOpenType(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptShapeOpenType", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), rcrangechars, rprangeproperties, cranges.toLong(), pwcchars, cchars.toLong(), cmaxglyphs.toLong(), pwlogclust, pcharprops, pwoutglyphs, poutglyphprops, pcglyphs)).toInt()
}

public fun ScriptStringAnalyse(hdc: Graphics.Gdi.HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringAnalyse", longArrayOf(Win32DynamicFfi.objectSlot(hdc), pstring, cstring.toLong(), cglyphs.toLong(), icharset.toLong(), dwflags.toLong(), ireqwidth.toLong(), pscontrol, psstate, pidx, ptabdef, pbinclass, pssa)).toInt()
}

public fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringCPtoX", longArrayOf(ssa, icp.toLong(), ftrailing.toLong(), px)).toInt()
}

public fun ScriptStringFree(pssa: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringFree", longArrayOf(pssa)).toInt()
}

public fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringGetLogicalWidths", longArrayOf(ssa, pidx)).toInt()
}

public fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringGetOrder", longArrayOf(ssa, puorder)).toInt()
}

public fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: Graphics.Gdi.ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringOut", longArrayOf(ssa, ix.toLong(), iy.toLong(), Win32DynamicFfi.objectSlot(uoptions), prc, iminsel.toLong(), imaxsel.toLong(), fdisabled.toLong())).toInt()
}

public fun ScriptStringValidate(ssa: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringValidate", longArrayOf(ssa)).toInt()
}

public fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptStringXtoCP", longArrayOf(ssa, ix.toLong(), pich, pitrailing)).toInt()
}

public fun ScriptString_pLogAttr(ssa: Long): Long {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptString_pLogAttr", longArrayOf(ssa))
}

public fun ScriptString_pSize(ssa: Long): Long {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptString_pSize", longArrayOf(ssa))
}

public fun ScriptString_pcOutChars(ssa: Long): Long {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptString_pcOutChars", longArrayOf(ssa))
}

public fun ScriptSubstituteSingleGlyph(hdc: Graphics.Gdi.HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptSubstituteSingleGlyph", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, psa, tagscript.toLong(), taglangsys.toLong(), tagfeature.toLong(), lparameter.toLong(), wglyphid.toLong(), pwoutglyphid)).toInt()
}

public fun ScriptTextOut(hdc: Graphics.Gdi.HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptTextOut", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psc, x.toLong(), y.toLong(), fuoptions.toLong(), lprc, psa, pwcreserved, ireserved.toLong(), pwglyphs, cglyphs.toLong(), piadvance, pijustify, pgoffset)).toInt()
}

public fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT {
    return Win32DynamicFfi.invoke("usp10.dll", "ScriptXtoCP", longArrayOf(ix.toLong(), cchars.toLong(), cglyphs.toLong(), pwlogclust, psva, piadvance, psa, picp, pitrailing)).toInt()
}

public fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCalendarInfoA", longArrayOf(locale.toLong(), calendar.toLong(), caltype.toLong(), lpcaldata)).toInt()
}

public fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCalendarInfoW", longArrayOf(locale.toLong(), calendar.toLong(), caltype.toLong(), lpcaldata)).toInt()
}

public fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetLocaleInfoA", longArrayOf(locale.toLong(), lctype.toLong(), lplcdata)).toInt()
}

public fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetLocaleInfoW", longArrayOf(locale.toLong(), lctype.toLong(), lplcdata)).toInt()
}

public fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessPreferredUILanguages", longArrayOf(dwflags.toLong(), pwszlanguagesbuffer, pulnumlanguages)).toInt()
}

public fun SetThreadLocale(locale: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadLocale", longArrayOf(locale.toLong())).toInt()
}

public fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPreferredUILanguages", longArrayOf(dwflags.toLong(), pwszlanguagesbuffer, pulnumlanguages)).toInt()
}

public fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPreferredUILanguages2", longArrayOf(flags.toLong(), languages, numlanguagesset, snapshot)).toInt()
}

public fun SetThreadUILanguage(langid: UShort): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadUILanguage", longArrayOf(langid.toLong())).toUShort()
}

public fun SetUserGeoID(geoid: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetUserGeoID", longArrayOf(geoid.toLong())).toInt()
}

public fun SetUserGeoName(geoname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetUserGeoName", longArrayOf(geoname)).toInt()
}

public fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "TranslateCharsetInfo", longArrayOf(lpsrc, lpcs, dwflags.toLong())).toInt()
}

public fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_FROM_U_CALLBACK_ESCAPE", longArrayOf(context, fromuargs, codeunits, length.toLong(), codepoint.toLong(), reason.toLong(), err))
}

public fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_FROM_U_CALLBACK_SKIP", longArrayOf(context, fromuargs, codeunits, length.toLong(), codepoint.toLong(), reason.toLong(), err))
}

public fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_FROM_U_CALLBACK_STOP", longArrayOf(context, fromuargs, codeunits, length.toLong(), codepoint.toLong(), reason.toLong(), err))
}

public fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_FROM_U_CALLBACK_SUBSTITUTE", longArrayOf(context, fromuargs, codeunits, length.toLong(), codepoint.toLong(), reason.toLong(), err))
}

public fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_TO_U_CALLBACK_ESCAPE", longArrayOf(context, touargs, codeunits, length.toLong(), reason.toLong(), err))
}

public fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_TO_U_CALLBACK_SKIP", longArrayOf(context, touargs, codeunits, length.toLong(), reason.toLong(), err))
}

public fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_TO_U_CALLBACK_STOP", longArrayOf(context, touargs, codeunits, length.toLong(), reason.toLong(), err))
}

public fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "UCNV_TO_U_CALLBACK_SUBSTITUTE", longArrayOf(context, touargs, codeunits, length.toLong(), reason.toLong(), err))
}

public fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateCalendarDayOfWeek", longArrayOf(lpcaldatetime)).toInt()
}

public fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerifyScripts", longArrayOf(dwflags.toLong(), lplocalescripts, cchlocalescripts.toLong(), lptestscripts, cchtestscripts.toLong())).toInt()
}

public fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "WideCharToMultiByte", longArrayOf(codepage.toLong(), dwflags.toLong(), lpwidecharstr, cchwidechar.toLong(), lpmultibytestr, cbmultibyte.toLong(), lpdefaultchar, lpuseddefaultchar)).toInt()
}

public fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcatA", longArrayOf(lpstring1, lpstring2))
}

public fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcatW", longArrayOf(lpstring1, lpstring2))
}

public fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcmpA", longArrayOf(lpstring1, lpstring2)).toInt()
}

public fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcmpW", longArrayOf(lpstring1, lpstring2)).toInt()
}

public fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcmpiA", longArrayOf(lpstring1, lpstring2)).toInt()
}

public fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcmpiW", longArrayOf(lpstring1, lpstring2)).toInt()
}

public fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcpyA", longArrayOf(lpstring1, lpstring2))
}

public fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcpyW", longArrayOf(lpstring1, lpstring2))
}

public fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcpynA", longArrayOf(lpstring1, lpstring2, imaxlength.toLong()))
}

public fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrcpynW", longArrayOf(lpstring1, lpstring2, imaxlength.toLong()))
}

public fun lstrlenA(lpstring: PCSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrlenA", longArrayOf(lpstring)).toInt()
}

public fun lstrlenW(lpstring: PCWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "lstrlenW", longArrayOf(lpstring)).toInt()
}

public fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_UCharsToChars", longArrayOf(us, cs, length.toLong()))
}

public fun u_austrcpy(dst: PCSTR, src: Long): PSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_austrcpy", longArrayOf(dst, src))
}

public fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_austrncpy", longArrayOf(dst, src, n.toLong()))
}

public fun u_catclose(catd: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_catclose", longArrayOf(catd))
}

public fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_catgets", longArrayOf(catd, set_num.toLong(), msg_num.toLong(), s, len, ec))
}

public fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_catopen", longArrayOf(name, locale, ec))
}

public fun u_charAge(c: Int, versionarray: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_charAge", longArrayOf(c.toLong(), versionarray))
}

public fun u_charDigitValue(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charDigitValue", longArrayOf(c.toLong())).toInt()
}

public fun u_charDirection(c: Int): UCharDirection {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charDirection", longArrayOf(c.toLong())).toInt()
}

public fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charFromName", longArrayOf(namechoice.toLong(), name, perrorcode)).toInt()
}

public fun u_charMirror(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charMirror", longArrayOf(c.toLong())).toInt()
}

public fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charName", longArrayOf(code.toLong(), namechoice.toLong(), buffer, bufferlength.toLong(), perrorcode)).toInt()
}

public fun u_charType(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_charType", longArrayOf(c.toLong())).toByte()
}

public fun u_charsToUChars(cs: PCSTR, us: Long, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_charsToUChars", longArrayOf(cs, us, length.toLong()))
}

public fun u_cleanup() {
    Win32DynamicFfi.invoke("icuuc.dll", "u_cleanup", longArrayOf())
}

public fun u_countChar32(s: Long, length: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_countChar32", longArrayOf(s, length.toLong())).toInt()
}

public fun u_digit(ch: Int, radix: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_digit", longArrayOf(ch.toLong(), radix.toLong())).toInt()
}

public fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_enumCharNames", longArrayOf(start.toLong(), limit.toLong(), fn, context, namechoice.toLong(), perrorcode))
}

public fun u_enumCharTypes(enumrange: Long, context: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_enumCharTypes", longArrayOf(enumrange, context))
}

public fun u_errorName(code: UErrorCode): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_errorName", longArrayOf(code.toLong()))
}

public fun u_foldCase(c: Int, options: UInt): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_foldCase", longArrayOf(c.toLong(), options.toLong())).toInt()
}

public fun u_forDigit(digit: Int, radix: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_forDigit", longArrayOf(digit.toLong(), radix.toLong())).toInt()
}

public fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "u_formatMessage", longArrayOf(locale, pattern, patternlength.toLong(), result, resultlength.toLong(), status) + variadicArgs).toInt()
}

public fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "u_formatMessageWithError", longArrayOf(locale, pattern, patternlength.toLong(), result, resultlength.toLong(), parseerror, status) + variadicArgs).toInt()
}

public fun u_getBidiPairedBracket(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getBidiPairedBracket", longArrayOf(c.toLong())).toInt()
}

public fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "u_getBinaryPropertySet", longArrayOf(property.toLong(), perrorcode))
}

public fun u_getCombiningClass(c: Int): UByte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getCombiningClass", longArrayOf(c.toLong())).toUByte()
}

public fun u_getDataVersion(dataversionfillin: Long, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_getDataVersion", longArrayOf(dataversionfillin, status))
}

public fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getFC_NFKC_Closure", longArrayOf(c.toLong(), dest, destcapacity.toLong(), perrorcode)).toInt()
}

public fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "u_getIntPropertyMap", longArrayOf(property.toLong(), perrorcode))
}

public fun u_getIntPropertyMaxValue(which: UProperty): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getIntPropertyMaxValue", longArrayOf(which.toLong())).toInt()
}

public fun u_getIntPropertyMinValue(which: UProperty): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getIntPropertyMinValue", longArrayOf(which.toLong())).toInt()
}

public fun u_getIntPropertyValue(c: Int, which: UProperty): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getIntPropertyValue", longArrayOf(c.toLong(), which.toLong())).toInt()
}

public fun u_getNumericValue(c: Int): Double {
    return Win32DynamicFfi.invokeFp("icuuc.dll", "u_getNumericValue", 0, false, longArrayOf(c.toLong()))
}

public fun u_getPropertyEnum(alias: PCSTR): UProperty {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getPropertyEnum", longArrayOf(alias)).toInt()
}

public fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getPropertyName", longArrayOf(property.toLong(), namechoice.toLong()))
}

public fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getPropertyValueEnum", longArrayOf(property.toLong(), alias)).toInt()
}

public fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_getPropertyValueName", longArrayOf(property.toLong(), value.toLong(), namechoice.toLong()))
}

public fun u_getUnicodeVersion(versionarray: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_getUnicodeVersion", longArrayOf(versionarray))
}

public fun u_getVersion(versionarray: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_getVersion", longArrayOf(versionarray))
}

public fun u_hasBinaryProperty(c: Int, which: UProperty): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_hasBinaryProperty", longArrayOf(c.toLong(), which.toLong())).toByte()
}

public fun u_init(status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_init", longArrayOf(status))
}

public fun u_isIDIgnorable(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isIDIgnorable", longArrayOf(c.toLong())).toByte()
}

public fun u_isIDPart(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isIDPart", longArrayOf(c.toLong())).toByte()
}

public fun u_isIDStart(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isIDStart", longArrayOf(c.toLong())).toByte()
}

public fun u_isISOControl(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isISOControl", longArrayOf(c.toLong())).toByte()
}

public fun u_isJavaIDPart(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isJavaIDPart", longArrayOf(c.toLong())).toByte()
}

public fun u_isJavaIDStart(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isJavaIDStart", longArrayOf(c.toLong())).toByte()
}

public fun u_isJavaSpaceChar(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isJavaSpaceChar", longArrayOf(c.toLong())).toByte()
}

public fun u_isMirrored(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isMirrored", longArrayOf(c.toLong())).toByte()
}

public fun u_isUAlphabetic(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isUAlphabetic", longArrayOf(c.toLong())).toByte()
}

public fun u_isULowercase(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isULowercase", longArrayOf(c.toLong())).toByte()
}

public fun u_isUUppercase(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isUUppercase", longArrayOf(c.toLong())).toByte()
}

public fun u_isUWhiteSpace(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isUWhiteSpace", longArrayOf(c.toLong())).toByte()
}

public fun u_isWhitespace(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isWhitespace", longArrayOf(c.toLong())).toByte()
}

public fun u_isalnum(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isalnum", longArrayOf(c.toLong())).toByte()
}

public fun u_isalpha(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isalpha", longArrayOf(c.toLong())).toByte()
}

public fun u_isbase(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isbase", longArrayOf(c.toLong())).toByte()
}

public fun u_isblank(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isblank", longArrayOf(c.toLong())).toByte()
}

public fun u_iscntrl(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_iscntrl", longArrayOf(c.toLong())).toByte()
}

public fun u_isdefined(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isdefined", longArrayOf(c.toLong())).toByte()
}

public fun u_isdigit(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isdigit", longArrayOf(c.toLong())).toByte()
}

public fun u_isgraph(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isgraph", longArrayOf(c.toLong())).toByte()
}

public fun u_islower(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_islower", longArrayOf(c.toLong())).toByte()
}

public fun u_isprint(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isprint", longArrayOf(c.toLong())).toByte()
}

public fun u_ispunct(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_ispunct", longArrayOf(c.toLong())).toByte()
}

public fun u_isspace(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isspace", longArrayOf(c.toLong())).toByte()
}

public fun u_istitle(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_istitle", longArrayOf(c.toLong())).toByte()
}

public fun u_isupper(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isupper", longArrayOf(c.toLong())).toByte()
}

public fun u_isxdigit(c: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_isxdigit", longArrayOf(c.toLong())).toByte()
}

public fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memcasecmp", longArrayOf(s1, s2, length.toLong(), options.toLong())).toInt()
}

public fun u_memchr(s: Long, c: UShort, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memchr", longArrayOf(s, c.toLong(), count.toLong()))
}

public fun u_memchr32(s: Long, c: Int, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memchr32", longArrayOf(s, c.toLong(), count.toLong()))
}

public fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memcmp", longArrayOf(buf1, buf2, count.toLong())).toInt()
}

public fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memcmpCodePointOrder", longArrayOf(s1, s2, count.toLong())).toInt()
}

public fun u_memcpy(dest: Long, src: Long, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memcpy", longArrayOf(dest, src, count.toLong()))
}

public fun u_memmove(dest: Long, src: Long, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memmove", longArrayOf(dest, src, count.toLong()))
}

public fun u_memrchr(s: Long, c: UShort, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memrchr", longArrayOf(s, c.toLong(), count.toLong()))
}

public fun u_memrchr32(s: Long, c: Int, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memrchr32", longArrayOf(s, c.toLong(), count.toLong()))
}

public fun u_memset(dest: Long, c: UShort, count: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_memset", longArrayOf(dest, c.toLong(), count.toLong()))
}

public fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "u_parseMessage", longArrayOf(locale, pattern, patternlength.toLong(), source, sourcelength.toLong(), status) + variadicArgs)
}

public fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "u_parseMessageWithError", longArrayOf(locale, pattern, patternlength.toLong(), source, sourcelength.toLong(), parseerror, status) + variadicArgs)
}

public fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_setMemoryFunctions", longArrayOf(context, a, r, f, status))
}

public fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_shapeArabic", longArrayOf(source, sourcelength.toLong(), dest, destsize.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strCaseCompare", longArrayOf(s1, length1.toLong(), s2, length2.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strCompare", longArrayOf(s1, length1.toLong(), s2, length2.toLong(), codepointorder.toLong())).toInt()
}

public fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strCompareIter", longArrayOf(iter1, iter2, codepointorder.toLong())).toInt()
}

public fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFindFirst", longArrayOf(s, length.toLong(), substring, sublength.toLong()))
}

public fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFindLast", longArrayOf(s, length.toLong(), substring, sublength.toLong()))
}

public fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFoldCase", longArrayOf(dest, destcapacity.toLong(), src, srclength.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromJavaModifiedUTF8WithSub", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), subchar.toLong(), pnumsubstitutions, perrorcode))
}

public fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromUTF32", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromUTF32WithSub", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), subchar.toLong(), pnumsubstitutions, perrorcode))
}

public fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromUTF8", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromUTF8Lenient", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromUTF8WithSub", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), subchar.toLong(), pnumsubstitutions, perrorcode))
}

public fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strFromWCS", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strHasMoreChar32Than", longArrayOf(s, length.toLong(), number.toLong())).toByte()
}

public fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToJavaModifiedUTF8", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToLower", longArrayOf(dest, destcapacity.toLong(), src, srclength.toLong(), locale, perrorcode)).toInt()
}

public fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToTitle", longArrayOf(dest, destcapacity.toLong(), src, srclength.toLong(), titleiter, locale, perrorcode)).toInt()
}

public fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToUTF32", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToUTF32WithSub", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), subchar.toLong(), pnumsubstitutions, perrorcode))
}

public fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToUTF8", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToUTF8WithSub", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), subchar.toLong(), pnumsubstitutions, perrorcode))
}

public fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToUpper", longArrayOf(dest, destcapacity.toLong(), src, srclength.toLong(), locale, perrorcode)).toInt()
}

public fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strToWCS", longArrayOf(dest, destcapacity.toLong(), pdestlength, src, srclength.toLong(), perrorcode))
}

public fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcasecmp", longArrayOf(s1, s2, options.toLong())).toInt()
}

public fun u_strcat(dst: Long, src: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcat", longArrayOf(dst, src))
}

public fun u_strchr(s: Long, c: UShort): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strchr", longArrayOf(s, c.toLong()))
}

public fun u_strchr32(s: Long, c: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strchr32", longArrayOf(s, c.toLong()))
}

public fun u_strcmp(s1: Long, s2: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcmp", longArrayOf(s1, s2)).toInt()
}

public fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcmpCodePointOrder", longArrayOf(s1, s2)).toInt()
}

public fun u_strcpy(dst: Long, src: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcpy", longArrayOf(dst, src))
}

public fun u_strcspn(string: Long, matchset: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strcspn", longArrayOf(string, matchset)).toInt()
}

public fun u_strlen(s: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strlen", longArrayOf(s)).toInt()
}

public fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strncasecmp", longArrayOf(s1, s2, n.toLong(), options.toLong())).toInt()
}

public fun u_strncat(dst: Long, src: Long, n: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strncat", longArrayOf(dst, src, n.toLong()))
}

public fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strncmp", longArrayOf(ucs1, ucs2, n.toLong())).toInt()
}

public fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strncmpCodePointOrder", longArrayOf(s1, s2, n.toLong())).toInt()
}

public fun u_strncpy(dst: Long, src: Long, n: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strncpy", longArrayOf(dst, src, n.toLong()))
}

public fun u_strpbrk(string: Long, matchset: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strpbrk", longArrayOf(string, matchset))
}

public fun u_strrchr(s: Long, c: UShort): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strrchr", longArrayOf(s, c.toLong()))
}

public fun u_strrchr32(s: Long, c: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strrchr32", longArrayOf(s, c.toLong()))
}

public fun u_strrstr(s: Long, substring: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strrstr", longArrayOf(s, substring))
}

public fun u_strspn(string: Long, matchset: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strspn", longArrayOf(string, matchset)).toInt()
}

public fun u_strstr(s: Long, substring: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strstr", longArrayOf(s, substring))
}

public fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_strtok_r", longArrayOf(src, delim, savestate))
}

public fun u_tolower(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_tolower", longArrayOf(c.toLong())).toInt()
}

public fun u_totitle(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_totitle", longArrayOf(c.toLong())).toInt()
}

public fun u_toupper(c: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_toupper", longArrayOf(c.toLong())).toInt()
}

public fun u_uastrcpy(dst: Long, src: PCSTR): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_uastrcpy", longArrayOf(dst, src))
}

public fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_uastrncpy", longArrayOf(dst, src, n.toLong()))
}

public fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_unescape", longArrayOf(src, dest, destcapacity.toLong())).toInt()
}

public fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "u_unescapeAt", longArrayOf(Win32DynamicFfi.objectSlot(charat), offset, length.toLong(), context)).toInt()
}

public fun u_versionFromString(versionarray: Long, versionstring: PCSTR) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_versionFromString", longArrayOf(versionarray, versionstring))
}

public fun u_versionFromUString(versionarray: Long, versionstring: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_versionFromUString", longArrayOf(versionarray, versionstring))
}

public fun u_versionToString(versionarray: Long, versionstring: PCSTR) {
    Win32DynamicFfi.invoke("icuuc.dll", "u_versionToString", longArrayOf(versionarray, versionstring))
}

public fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "u_vformatMessage", longArrayOf(locale, pattern, patternlength.toLong(), result, resultlength.toLong(), ap, status)).toInt()
}

public fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "u_vformatMessageWithError", longArrayOf(locale, pattern, patternlength.toLong(), result, resultlength.toLong(), parseerror, ap, status)).toInt()
}

public fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "u_vparseMessage", longArrayOf(locale, pattern, patternlength.toLong(), source, sourcelength.toLong(), ap, status))
}

public fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "u_vparseMessageWithError", longArrayOf(locale, pattern, patternlength.toLong(), source, sourcelength.toLong(), ap, parseerror, status))
}

public fun ubidi_close(pbidi: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_close", longArrayOf(pbidi))
}

public fun ubidi_countParagraphs(pbidi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_countParagraphs", longArrayOf(pbidi)).toInt()
}

public fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_countRuns", longArrayOf(pbidi, perrorcode)).toInt()
}

public fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getBaseDirection", longArrayOf(text, length.toLong())).toInt()
}

public fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getClassCallback", longArrayOf(pbidi, fn, context))
}

public fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getCustomizedClass", longArrayOf(pbidi, c.toLong())).toInt()
}

public fun ubidi_getDirection(pbidi: Long): UBiDiDirection {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getDirection", longArrayOf(pbidi)).toInt()
}

public fun ubidi_getLength(pbidi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLength", longArrayOf(pbidi)).toInt()
}

public fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLevelAt", longArrayOf(pbidi, charindex.toLong())).toUByte()
}

public fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLevels", longArrayOf(pbidi, perrorcode))
}

public fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLogicalIndex", longArrayOf(pbidi, visualindex.toLong(), perrorcode)).toInt()
}

public fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLogicalMap", longArrayOf(pbidi, indexmap, perrorcode))
}

public fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getLogicalRun", longArrayOf(pbidi, logicalposition.toLong(), plogicallimit, plevel))
}

public fun ubidi_getParaLevel(pbidi: Long): UByte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getParaLevel", longArrayOf(pbidi)).toUByte()
}

public fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getParagraph", longArrayOf(pbidi, charindex.toLong(), pparastart, pparalimit, pparalevel, perrorcode)).toInt()
}

public fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getParagraphByIndex", longArrayOf(pbidi, paraindex.toLong(), pparastart, pparalimit, pparalevel, perrorcode))
}

public fun ubidi_getProcessedLength(pbidi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getProcessedLength", longArrayOf(pbidi)).toInt()
}

public fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getReorderingMode", longArrayOf(pbidi)).toInt()
}

public fun ubidi_getReorderingOptions(pbidi: Long): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getReorderingOptions", longArrayOf(pbidi)).toUInt()
}

public fun ubidi_getResultLength(pbidi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getResultLength", longArrayOf(pbidi)).toInt()
}

public fun ubidi_getText(pbidi: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getText", longArrayOf(pbidi))
}

public fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getVisualIndex", longArrayOf(pbidi, logicalindex.toLong(), perrorcode)).toInt()
}

public fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getVisualMap", longArrayOf(pbidi, indexmap, perrorcode))
}

public fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_getVisualRun", longArrayOf(pbidi, runindex.toLong(), plogicalstart, plength)).toInt()
}

public fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_invertMap", longArrayOf(srcmap, destmap, length.toLong()))
}

public fun ubidi_isInverse(pbidi: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_isInverse", longArrayOf(pbidi)).toByte()
}

public fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_isOrderParagraphsLTR", longArrayOf(pbidi)).toByte()
}

public fun ubidi_open(): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_open", longArrayOf())
}

public fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_openSized", longArrayOf(maxlength.toLong(), maxruncount.toLong(), perrorcode))
}

public fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_orderParagraphsLTR", longArrayOf(pbidi, orderparagraphsltr.toLong()))
}

public fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_reorderLogical", longArrayOf(levels, length.toLong(), indexmap))
}

public fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_reorderVisual", longArrayOf(levels, length.toLong(), indexmap))
}

public fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setClassCallback", longArrayOf(pbidi, Win32DynamicFfi.objectSlot(newfn), newcontext, oldfn, oldcontext, perrorcode))
}

public fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setContext", longArrayOf(pbidi, prologue, prolength.toLong(), epilogue, epilength.toLong(), perrorcode))
}

public fun ubidi_setInverse(pbidi: Long, isinverse: Byte) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setInverse", longArrayOf(pbidi, isinverse.toLong()))
}

public fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setLine", longArrayOf(pparabidi, start.toLong(), limit.toLong(), plinebidi, perrorcode))
}

public fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setPara", longArrayOf(pbidi, text, length.toLong(), paralevel.toLong(), embeddinglevels, perrorcode))
}

public fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setReorderingMode", longArrayOf(pbidi, reorderingmode.toLong()))
}

public fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubidi_setReorderingOptions", longArrayOf(pbidi, reorderingoptions.toLong()))
}

public fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_writeReordered", longArrayOf(pbidi, dest, destsize.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubidi_writeReverse", longArrayOf(src, srclength.toLong(), dest, destsize.toLong(), options.toLong(), perrorcode)).toInt()
}

public fun ubiditransform_close(pbiditransform: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubiditransform_close", longArrayOf(pbiditransform))
}

public fun ubiditransform_open(perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubiditransform_open", longArrayOf(perrorcode))
}

public fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubiditransform_transform", longArrayOf(pbiditransform, src, srclength.toLong(), dest, destsize.toLong(), inparalevel.toLong(), inorder.toLong(), outparalevel.toLong(), outorder.toLong(), domirroring.toLong(), shapingoptions.toLong(), perrorcode)).toUInt()
}

public fun ublock_getCode(c: Int): UBlockCode {
    return Win32DynamicFfi.invoke("icuuc.dll", "ublock_getCode", longArrayOf(c.toLong())).toInt()
}

public fun ubrk_close(bi: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubrk_close", longArrayOf(bi))
}

public fun ubrk_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_countAvailable", longArrayOf()).toInt()
}

public fun ubrk_current(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_current", longArrayOf(bi)).toInt()
}

public fun ubrk_first(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_first", longArrayOf(bi)).toInt()
}

public fun ubrk_following(bi: Long, offset: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_following", longArrayOf(bi, offset.toLong())).toInt()
}

public fun ubrk_getAvailable(index: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_getAvailable", longArrayOf(index.toLong()))
}

public fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_getBinaryRules", longArrayOf(bi, binaryrules, rulescapacity.toLong(), status)).toInt()
}

public fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_getLocaleByType", longArrayOf(bi, type.toLong(), status))
}

public fun ubrk_getRuleStatus(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_getRuleStatus", longArrayOf(bi)).toInt()
}

public fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_getRuleStatusVec", longArrayOf(bi, fillinvec, capacity.toLong(), status)).toInt()
}

public fun ubrk_isBoundary(bi: Long, offset: Int): Byte {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_isBoundary", longArrayOf(bi, offset.toLong())).toByte()
}

public fun ubrk_last(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_last", longArrayOf(bi)).toInt()
}

public fun ubrk_next(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_next", longArrayOf(bi)).toInt()
}

public fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_open", longArrayOf(type.toLong(), locale, text, textlength.toLong(), status))
}

public fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_openBinaryRules", longArrayOf(binaryrules, ruleslength.toLong(), text, textlength.toLong(), status))
}

public fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_openRules", longArrayOf(rules, ruleslength.toLong(), text, textlength.toLong(), parseerr, status))
}

public fun ubrk_preceding(bi: Long, offset: Int): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_preceding", longArrayOf(bi, offset.toLong())).toInt()
}

public fun ubrk_previous(bi: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_previous", longArrayOf(bi)).toInt()
}

public fun ubrk_refreshUText(bi: Long, text: Long, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubrk_refreshUText", longArrayOf(bi, text, status))
}

public fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ubrk_safeClone", longArrayOf(bi, stackbuffer, pbuffersize, status))
}

public fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubrk_setText", longArrayOf(bi, text, textlength.toLong(), status))
}

public fun ubrk_setUText(bi: Long, text: Long, status: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ubrk_setUText", longArrayOf(bi, text, status))
}

public fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_add", longArrayOf(cal, field.toLong(), amount.toLong(), status))
}

public fun ucal_clear(calendar: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_clear", longArrayOf(calendar))
}

public fun ucal_clearField(cal: Long, field: UCalendarDateFields) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_clearField", longArrayOf(cal, field.toLong()))
}

public fun ucal_clone(cal: Long, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_clone", longArrayOf(cal, status))
}

public fun ucal_close(cal: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_close", longArrayOf(cal))
}

public fun ucal_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_countAvailable", longArrayOf()).toInt()
}

public fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_equivalentTo", longArrayOf(cal1, cal2)).toByte()
}

public fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_get", longArrayOf(cal, field.toLong(), status)).toInt()
}

public fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getAttribute", longArrayOf(cal, attr.toLong())).toInt()
}

public fun ucal_getAvailable(localeindex: Int): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getAvailable", longArrayOf(localeindex.toLong()))
}

public fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getCanonicalTimeZoneID", longArrayOf(id, len.toLong(), result, resultcapacity.toLong(), issystemid, status)).toInt()
}

public fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getDSTSavings", longArrayOf(zoneid, ec)).toInt()
}

public fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getDayOfWeekType", longArrayOf(cal, dayofweek.toLong(), status)).toInt()
}

public fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getDefaultTimeZone", longArrayOf(result, resultcapacity.toLong(), ec)).toInt()
}

public fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ucal_getFieldDifference", 8, false, longArrayOf(cal, target.toRawBits(), field.toLong(), status)).toLong().toInt()
}

public fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ucal_getGregorianChange", 0, false, longArrayOf(cal, perrorcode))
}

public fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucal_getHostTimeZone", longArrayOf(result, resultcapacity.toLong(), ec)).toInt()
}

public fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getKeywordValuesForLocale", longArrayOf(key, locale, commonlyused.toLong(), status))
}

public fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getLimit", longArrayOf(cal, field.toLong(), type.toLong(), status)).toInt()
}

public fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getLocaleByType", longArrayOf(cal, type.toLong(), status))
}

public fun ucal_getMillis(cal: Long, status: Long): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ucal_getMillis", 0, false, longArrayOf(cal, status))
}

public fun ucal_getNow(): Double {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ucal_getNow", 0, false, longArrayOf())
}

public fun ucal_getTZDataVersion(status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getTZDataVersion", longArrayOf(status))
}

public fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getTimeZoneDisplayName", longArrayOf(cal, type.toLong(), locale, result, resultlength.toLong(), status)).toInt()
}

public fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getTimeZoneID", longArrayOf(cal, result, resultlength.toLong(), status)).toInt()
}

public fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getTimeZoneIDForWindowsID", longArrayOf(winid, len.toLong(), region, id, idcapacity.toLong(), status)).toInt()
}

public fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getTimeZoneTransitionDate", longArrayOf(cal, type.toLong(), transition, status)).toByte()
}

public fun ucal_getType(cal: Long, status: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getType", longArrayOf(cal, status))
}

public fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getWeekendTransition", longArrayOf(cal, dayofweek.toLong(), status)).toInt()
}

public fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_getWindowsTimeZoneID", longArrayOf(id, len.toLong(), winid, winidcapacity.toLong(), status)).toInt()
}

public fun ucal_inDaylightTime(cal: Long, status: Long): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_inDaylightTime", longArrayOf(cal, status)).toByte()
}

public fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_isSet", longArrayOf(cal, field.toLong())).toByte()
}

public fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte {
    return Win32DynamicFfi.invokeFp("icuin.dll", "ucal_isWeekend", 8, false, longArrayOf(cal, date.toRawBits(), status)).toLong().toByte()
}

public fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_open", longArrayOf(zoneid, len.toLong(), locale, type.toLong(), status))
}

public fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_openCountryTimeZones", longArrayOf(country, ec))
}

public fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_openTimeZoneIDEnumeration", longArrayOf(zonetype.toLong(), region, rawoffset, ec))
}

public fun ucal_openTimeZones(ec: Long): Long {
    return Win32DynamicFfi.invoke("icuin.dll", "ucal_openTimeZones", longArrayOf(ec))
}

public fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_roll", longArrayOf(cal, field.toLong(), amount.toLong(), status))
}

public fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_set", longArrayOf(cal, field.toLong(), value.toLong()))
}

public fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_setAttribute", longArrayOf(cal, attr.toLong(), newvalue.toLong()))
}

public fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_setDate", longArrayOf(cal, year.toLong(), month.toLong(), date.toLong(), status))
}

public fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_setDateTime", longArrayOf(cal, year.toLong(), month.toLong(), date.toLong(), hour.toLong(), minute.toLong(), second.toLong(), status))
}

public fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_setDefaultTimeZone", longArrayOf(zoneid, ec))
}

public fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long) {
    Win32DynamicFfi.invokeFp("icuin.dll", "ucal_setGregorianChange", 8, false, longArrayOf(cal, date.toRawBits(), perrorcode))
}

public fun ucal_setMillis(cal: Long, datetime: Double, status: Long) {
    Win32DynamicFfi.invokeFp("icuin.dll", "ucal_setMillis", 8, false, longArrayOf(cal, datetime.toRawBits(), status))
}

public fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long) {
    Win32DynamicFfi.invoke("icuin.dll", "ucal_setTimeZone", longArrayOf(cal, zoneid, len.toLong(), status))
}

public fun ucasemap_close(csm: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_close", longArrayOf(csm))
}

public fun ucasemap_getBreakIterator(csm: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_getBreakIterator", longArrayOf(csm))
}

public fun ucasemap_getLocale(csm: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_getLocale", longArrayOf(csm))
}

public fun ucasemap_getOptions(csm: Long): UInt {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_getOptions", longArrayOf(csm)).toUInt()
}

public fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_open", longArrayOf(locale, options.toLong(), perrorcode))
}

public fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_setBreakIterator", longArrayOf(csm, itertoadopt, perrorcode))
}

public fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_setLocale", longArrayOf(csm, locale, perrorcode))
}

public fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_setOptions", longArrayOf(csm, options.toLong(), perrorcode))
}

public fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_toTitle", longArrayOf(csm, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_utf8FoldCase", longArrayOf(csm, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_utf8ToLower", longArrayOf(csm, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_utf8ToTitle", longArrayOf(csm, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucasemap_utf8ToUpper", longArrayOf(csm, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}

public fun ucfpos_close(ucfpos: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_close", longArrayOf(ucfpos))
}

public fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_constrainCategory", longArrayOf(ucfpos, category.toLong(), ec))
}

public fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_constrainField", longArrayOf(ucfpos, category.toLong(), field.toLong(), ec))
}

public fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucfpos_getCategory", longArrayOf(ucfpos, ec)).toInt()
}

public fun ucfpos_getField(ucfpos: Long, ec: Long): Int {
    return Win32DynamicFfi.invoke("icu.dll", "ucfpos_getField", longArrayOf(ucfpos, ec)).toInt()
}

public fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_getIndexes", longArrayOf(ucfpos, pstart, plimit, ec))
}

public fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ucfpos_getInt64IterationContext", longArrayOf(ucfpos, ec))
}

public fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte {
    return Win32DynamicFfi.invoke("icu.dll", "ucfpos_matchesField", longArrayOf(ucfpos, category.toLong(), field.toLong(), ec)).toByte()
}

public fun ucfpos_open(ec: Long): Long {
    return Win32DynamicFfi.invoke("icu.dll", "ucfpos_open", longArrayOf(ec))
}

public fun ucfpos_reset(ucfpos: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_reset", longArrayOf(ucfpos, ec))
}

public fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_setInt64IterationContext", longArrayOf(ucfpos, context, ec))
}

public fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long) {
    Win32DynamicFfi.invoke("icu.dll", "ucfpos_setState", longArrayOf(ucfpos, category.toLong(), field.toLong(), start.toLong(), limit.toLong(), ec))
}

public fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_cbFromUWriteBytes", longArrayOf(args, source, length.toLong(), offsetindex.toLong(), err))
}

public fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_cbFromUWriteSub", longArrayOf(args, offsetindex.toLong(), err))
}

public fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_cbFromUWriteUChars", longArrayOf(args, source, sourcelimit, offsetindex.toLong(), err))
}

public fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_cbToUWriteSub", longArrayOf(args, offsetindex.toLong(), err))
}

public fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_cbToUWriteUChars", longArrayOf(args, source, length.toLong(), offsetindex.toLong(), err))
}

public fun ucnv_close(converter: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_close", longArrayOf(converter))
}

public fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_compareNames", longArrayOf(name1, name2)).toInt()
}

public fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_convert", longArrayOf(toconvertername, fromconvertername, target, targetcapacity.toLong(), source, sourcelength.toLong(), perrorcode)).toInt()
}

public fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_convertEx", longArrayOf(targetcnv, sourcecnv, target, targetlimit, source, sourcelimit, pivotstart, pivotsource, pivottarget, pivotlimit, reset.toLong(), flush.toLong(), perrorcode))
}

public fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_countAliases", longArrayOf(alias, perrorcode)).toUShort()
}

public fun ucnv_countAvailable(): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_countAvailable", longArrayOf()).toInt()
}

public fun ucnv_countStandards(): UShort {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_countStandards", longArrayOf()).toUShort()
}

public fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_detectUnicodeSignature", longArrayOf(source, sourcelength.toLong(), signaturelength, perrorcode))
}

public fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int) {
    Win32DynamicFfi.invoke("icuuc.dll", "ucnv_fixFileSeparator", longArrayOf(cnv, source, sourcelen.toLong()))
}

public fun ucnv_flushCache(): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_flushCache", longArrayOf()).toInt()
}

public fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_fromAlgorithmic", longArrayOf(cnv, algorithmictype.toLong(), target, targetcapacity.toLong(), source, sourcelength.toLong(), perrorcode)).toInt()
}

public fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int {
    return Win32DynamicFfi.invoke("icuuc.dll", "ucnv_fromUChars", longArrayOf(cnv, dest, destcapacity.toLong(), src, srclength.toLong(), perrorcode)).toInt()
}
