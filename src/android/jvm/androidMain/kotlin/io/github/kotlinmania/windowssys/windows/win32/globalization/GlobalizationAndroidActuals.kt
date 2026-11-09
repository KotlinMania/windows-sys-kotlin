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

private object WindowsWin32GlobalizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_globalization_AdjustCalendarDate(lpcaldatetime: Long, calunit: Int, amount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_CompareStringA(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_CompareStringEx(lplocalename: Long, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_CompareStringOrdinal(lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_CompareStringW(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ConvertDefaultLocale(locale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: Int, lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumCalendarInfoA(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumCalendarInfoExA(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumCalendarInfoExEx(pcalinfoenumprocexex: Long, lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumCalendarInfoExW(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumCalendarInfoW(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumDateFormatsA(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumDateFormatsExA(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumDateFormatsExEx(lpdatefmtenumprocexex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumDateFormatsExW(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumDateFormatsW(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemCodePagesA(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemCodePagesW(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemGeoID(geoclass: Int, parentgeoid: Int, lpgeoenumproc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemGeoNames(geoclass: Int, geoenumproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemLanguageGroupsA(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemLanguageGroupsW(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemLocalesA(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemLocalesEx(lplocaleenumprocex: Long, dwflags: Int, lparam: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumSystemLocalesW(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumTimeFormatsA(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumTimeFormatsEx(lptimefmtenumprocex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumTimeFormatsW(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumUILanguagesA(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_EnumUILanguagesW(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_FindNLSString(locale: Int, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_FindNLSStringEx(lplocalename: Long, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_FindStringOrdinal(dwfindstringordinalflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_FoldStringA(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_FoldStringW(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetACP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCPInfo(codepage: Int, lpcpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCPInfoExA(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCPInfoExW(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCalendarDateFormatEx(lpszlocale: Long, dwflags: Int, lpcaldatetime: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCalendarInfoEx(lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCalendarSupportedDateRange(calendar: Int, lpcalmindatetime: Long, lpcalmaxdatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCurrencyFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCurrencyFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetCurrencyFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDateFormatA(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDateFormatEx(lplocalename: Long, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int, lpcalendar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDateFormatW(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDistanceOfClosestLanguageInList(pszlanguage: Long, pszlanguageslist: Long, wchlistdelimiter: Short, pclosestdistance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDurationFormat(locale: Int, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetDurationFormatEx(lplocalename: Long, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetFileMUIInfo(dwflags: Int, pcwszfilepath: Long, pfilemuiinfo: Long, pcbfilemuiinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetFileMUIPath(dwflags: Int, pcwszfilepath: Long, pwszlanguage: Long, pcchlanguage: Long, pwszfilemuipath: Long, pcchfilemuipath: Long, pululenumerator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetGeoInfoA(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetGeoInfoEx(location: Long, geotype: Int, geodata: Long, geodatacount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetGeoInfoW(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetLocaleInfoEx(lplocalename: Long, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetNLSVersion(function: Int, locale: Int, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetNLSVersionEx(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetNumberFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetNumberFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetNumberFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetOEMCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetProcessPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetStringScripts(dwflags: Int, lpstring: Long, cchstring: Int, lpscripts: Long, cchscripts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetStringTypeA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetStringTypeExA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetStringTypeExW(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetStringTypeW(dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetSystemDefaultLCID(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetSystemDefaultLangID(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetSystemDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetSystemDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetSystemPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetTextCharset(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetTextCharsetInfo(hdc: Long, lpsig: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetThreadLocale(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetThreadPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetThreadUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetTimeFormatA(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetTimeFormatEx(lplocalename: Long, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetTimeFormatW(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUILanguageInfo(dwflags: Int, pwmszlanguage: Long, pwszfallbacklanguages: Long, pcchfallbacklanguages: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserDefaultGeoName(geoname: Long, geonamecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserDefaultLCID(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserDefaultLangID(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserGeoID(geoclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_GetUserPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IdnToAscii(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpasciicharstr: Long, cchasciichar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IdnToNameprepUnicode(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpnameprepcharstr: Long, cchnameprepchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IdnToUnicode(dwflags: Int, lpasciicharstr: Long, cchasciichar: Int, lpunicodecharstr: Long, cchunicodechar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsCalendarLeapYear(calid: Int, year: Int, era: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsDBCSLeadByte(testchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsDBCSLeadByteEx(codepage: Int, testchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsNLSDefinedString(function: Int, dwflags: Int, lpversioninformation: Long, lpstring: Long, cchstr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsNormalizedString(normform: Int, lpstring: Long, cwlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsValidCodePage(codepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsValidLanguageGroup(languagegroup: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsValidLocale(locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsValidLocaleName(lplocalename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsValidNLSVersion(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_IsWellFormedTag(psztag: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_LCIDToLocaleName(locale: Int, lpname: Long, cchname: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_LCMapStringA(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_LCMapStringEx(lplocalename: Long, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_LCMapStringW(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_LocaleNameToLCID(lpname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MappingDoAction(pbag: Long, dwrangeindex: Int, pszactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MappingFreePropertyBag(pbag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MappingFreeServices(pserviceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MappingRecognizeText(pserviceinfo: Long, psztext: Long, dwlength: Int, dwindex: Int, poptions: Long, pbag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_MultiByteToWideChar(codepage: Int, dwflags: Int, lpmultibytestr: Long, cbmultibyte: Int, lpwidecharstr: Long, cchwidechar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_NormalizeString(normform: Int, lpsrcstring: Long, cwsrclength: Int, lpdststring: Long, cwdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_NotifyUILanguageChange(dwflags: Int, pcwstrnewlanguage: Long, pcwstrpreviouslanguage: Long, dwreserved: Int, pdwstatusrtrn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ResolveLocaleName(lpnametoresolve: Long, lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_RestoreThreadPreferredUILanguages(snapshot: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptBreak(pwcchars: Long, cchars: Int, psa: Long, psla: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptCPtoX(icp: Int, ftrailing: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptCacheGetHeight(hdc: Long, psc: Long, tmheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptFreeCache(psc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetCMap(hdc: Long, psc: Long, pwcinchars: Long, cchars: Int, dwflags: Int, pwoutglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetFontAlternateGlyphs(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, wglyphid: Short, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetFontFeatureTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, cmaxtags: Int, pfeaturetags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetFontLanguageTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, cmaxtags: Int, plangsystags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetFontProperties(hdc: Long, psc: Long, sfp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetFontScriptTags(hdc: Long, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetGlyphABCWidth(hdc: Long, psc: Long, wglyph: Short, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptGetProperties(ppsp: Long, pinumscripts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptIsComplex(pwcinchars: Long, cinchars: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptItemize(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptItemizeOpenType(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptPlace(hdc: Long, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptPlaceOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptRecordDigitSubstitution(locale: Int, psds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptShape(hdc: Long, psc: Long, pwcchars: Long, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptShapeOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringAnalyse(hdc: Long, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: Int, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: Int, px: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringFree(pssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringGetOrder(ssa: Long, puorder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: Int, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringValidate(ssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptString_pLogAttr(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptString_pSize(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptString_pcOutChars(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptSubstituteSingleGlyph(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, lparameter: Int, wglyphid: Short, pwoutglyphid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptTextOut(hdc: Long, psc: Long, x: Int, y: Int, fuoptions: Int, lprc: Long, psa: Long, pwcreserved: Long, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetProcessPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetThreadLocale(locale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetThreadPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetThreadPreferredUILanguages2(flags: Int, languages: Long, numlanguagesset: Long, snapshot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetThreadUILanguage(langid: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetUserGeoID(geoid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_SetUserGeoName(geoname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_UpdateCalendarDayOfWeek(lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_VerifyScripts(dwflags: Int, lplocalescripts: Long, cchlocalescripts: Int, lptestscripts: Long, cchtestscripts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_WideCharToMultiByte(codepage: Int, dwflags: Int, lpwidecharstr: Long, cchwidechar: Int, lpmultibytestr: Long, cbmultibyte: Int, lpdefaultchar: Long, lpuseddefaultchar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcatA(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcatW(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcmpA(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcmpW(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcmpiA(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcmpiW(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcpyA(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcpyW(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcpynA(lpstring1: Long, lpstring2: Long, imaxlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrcpynW(lpstring1: Long, lpstring2: Long, imaxlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrlenA(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lstrlenW(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_UCharsToChars(us: Long, cs: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_austrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_austrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_catclose(catd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_catopen(name: Long, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charAge(c: Int, versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charDigitValue(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charDirection(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charFromName(namechoice: Int, name: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charMirror(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charName(code: Int, namechoice: Int, buffer: Long, bufferlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charType(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_charsToUChars(cs: Long, us: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_cleanup()

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_countChar32(s: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_digit(ch: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_enumCharTypes(enumrange: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_errorName(code: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_foldCase(c: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_forDigit(digit: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getBidiPairedBracket(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getBinaryPropertySet(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getCombiningClass(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getDataVersion(dataversionfillin: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getIntPropertyMap(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getIntPropertyMaxValue(which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getIntPropertyMinValue(which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getIntPropertyValue(c: Int, which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getNumericValue(c: Int): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getPropertyEnum(alias: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getPropertyName(property: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getPropertyValueEnum(property: Int, alias: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getPropertyValueName(property: Int, value: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getUnicodeVersion(versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_getVersion(versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_hasBinaryProperty(c: Int, which: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_init(status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isIDIgnorable(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isIDPart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isIDStart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isISOControl(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isJavaIDPart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isJavaIDStart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isJavaSpaceChar(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isMirrored(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isUAlphabetic(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isULowercase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isUUppercase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isUWhiteSpace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isWhitespace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isalnum(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isalpha(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isbase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isblank(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_iscntrl(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isdefined(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isdigit(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isgraph(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_islower(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isprint(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_ispunct(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isspace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_istitle(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isupper(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_isxdigit(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memcasecmp(s1: Long, s2: Long, length: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memcmp(buf1: Long, buf2: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memcpy(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memmove(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memrchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memrchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_memset(dest: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToJavaModifiedUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strToWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcasecmp(s1: Long, s2: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcat(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcmpCodePointOrder(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strcspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strlen(s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strncasecmp(s1: Long, s2: Long, n: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strncat(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strpbrk(string: Long, matchset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strrchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strrchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strrstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_strtok_r(src: Long, delim: Long, savestate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_tolower(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_totitle(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_toupper(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_uastrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_uastrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_unescape(src: Long, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_unescapeAt(charat: Long, offset: Long, length: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_versionFromString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_versionFromUString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_versionToString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_vformatMessage(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_vformatMessageWithError(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_vparseMessage(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_u_vparseMessageWithError(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_close(pbidi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_countParagraphs(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_countRuns(pbidi: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getBaseDirection(text: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getCustomizedClass(pbidi: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getDirection(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLevelAt(pbidi: Long, charindex: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLevels(pbidi: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getParaLevel(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getProcessedLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getReorderingMode(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getReorderingOptions(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getResultLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getText(pbidi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_invertMap(srcmap: Long, destmap: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_isInverse(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_isOrderParagraphsLTR(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_open(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setClassCallback(pbidi: Long, newfn: Long, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setInverse(pbidi: Long, isinverse: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: Byte, embeddinglevels: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setReorderingMode(pbidi: Long, reorderingmode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransform_close(pbiditransform: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransform_open(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: Byte, inorder: Int, outparalevel: Byte, outorder: Int, domirroring: Int, shapingoptions: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ublock_getCode(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_close(bi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_current(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_first(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_following(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_getAvailable(index: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_getLocaleByType(bi: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_getRuleStatus(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_isBoundary(bi: Long, offset: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_last(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_next(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_open(type: Int, locale: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_preceding(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_previous(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_refreshUText(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrk_setUText(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_add(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_clear(calendar: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_clearField(cal: Long, field: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_clone(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_close(cal: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_equivalentTo(cal1: Long, cal2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_get(cal: Long, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getAttribute(cal: Long, attr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getDSTSavings(zoneid: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getDayOfWeekType(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getFieldDifference(cal: Long, target: Double, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getGregorianChange(cal: Long, perrorcode: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getLimit(cal: Long, field: Int, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getLocaleByType(cal: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getMillis(cal: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getNow(): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getTZDataVersion(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getTimeZoneDisplayName(cal: Long, type: Int, locale: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: Long, id: Long, idcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getTimeZoneTransitionDate(cal: Long, type: Int, transition: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getType(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getWeekendTransition(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_inDaylightTime(cal: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_isSet(cal: Long, field: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_isWeekend(cal: Long, date: Double, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_open(zoneid: Long, len: Int, locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_openCountryTimeZones(country: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_openTimeZoneIDEnumeration(zonetype: Int, region: Long, rawoffset: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_openTimeZones(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_roll(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_set(cal: Long, field: Int, value: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setAttribute(cal: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setDefaultTimeZone(zoneid: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setMillis(cal: Long, datetime: Double, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_close(csm: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_getBreakIterator(csm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_getLocale(csm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_getOptions(csm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_open(locale: Long, options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_setLocale(csm: Long, locale: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_setOptions(csm: Long, options: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_utf8FoldCase(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_utf8ToLower(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_utf8ToTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemap_utf8ToUpper(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_close(ucfpos: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_getCategory(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_getField(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_open(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_reset(ucfpos: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_cbFromUWriteBytes(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_close(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_compareNames(name1: Long, name2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_convert(toconvertername: Long, fromconvertername: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_countAliases(alias: Long, perrorcode: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_countStandards(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_detectUnicodeSignature(source: Long, sourcelength: Int, signaturelength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_flushCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_fromAlgorithmic(cnv: Long, algorithmictype: Int, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_fromUChars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_fromUCountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_fromUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getAlias(alias: Long, n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getAliases(alias: Long, aliases: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getAvailableName(n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getCCSID(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getCanonicalName(alias: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getDefaultName(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getDisplayName(converter: Long, displaylocale: Long, displayname: Long, displaynamecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getFromUCallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getInvalidChars(converter: Long, errbytes: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getMaxCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getMinCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getName(converter: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getPlatform(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getStandard(n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getStandardName(name: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getStarters(converter: Long, starters: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getSubstChars(converter: Long, subchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getToUCallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getType(converter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_isAmbiguous(cnv: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_isFixedWidth(cnv: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_open(convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_openAllNames(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_openCCSID(codepage: Int, platform: Int, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_openPackage(packagename: Long, convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_openStandardNames(convname: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_openU(name: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_reset(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_resetFromUnicode(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_resetToUnicode(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setDefaultName(name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setFallback(cnv: Long, usesfallback: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setFromUCallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setSubstChars(converter: Long, subchars: Long, len: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_setToUCallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_toAlgorithmic(algorithmictype: Int, cnv: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_toUCountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnv_usesFallback(cnv: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_close(sel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_selectForUTF8(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_close(coll: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_closeElements(elems: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getAttribute(coll: Long, attr: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getBound(source: Long, sourcelength: Int, boundtype: Int, nooflevels: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getDisplayName(objloc: Long, disploc: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getFunctionalEquivalent(result: Long, resultcapacity: Int, keyword: Long, locale: Long, isavailable: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getKeywordValues(keyword: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getKeywords(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getLocaleByType(coll: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getMaxExpansion(elems: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getMaxVariable(coll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getOffset(elems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getRules(coll: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getRulesEx(coll: Long, delta: Int, buffer: Long, bufferlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getStrength(coll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getTailoredSet(coll: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getUCAVersion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getVariableTop(coll: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_getVersion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_keyHashCode(key: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_next(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_open(loc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_openAvailableLocales(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: Int, strength: Int, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_previous(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_primaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_reset(elems: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_secondaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setAttribute(coll: Long, attr: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setMaxVariable(coll: Long, group: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setOffset(elems: Long, offset: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setStrength(coll: Long, strength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_setText(elems: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_strcollUTF8(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucol_tertiaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucpmap_get(map: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucpmap_getRange(map: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_close(trie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_get(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_getRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_getType(trie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_getValueWidth(trie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_internalSmallIndex(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: Byte, t3: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_openFromBinary(type: Int, valuewidth: Int, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_close(ucsd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_detect(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_getConfidence(ucsm: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_getLanguage(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_getName(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_isInputFilterEnabled(ucsd: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_open(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_setDeclaredEncoding(ucsd: Long, encoding: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdet_setText(ucsd: Long, textin: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_countCurrencies(locale: Long, date: Double, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_forLocale(locale: Long, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_forLocaleAndDate(locale: Long, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getName(currency: Long, locale: Long, namestyle: Int, ischoiceformat: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getNumericCode(currency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getPluralName(currency: Long, locale: Long, ischoiceformat: Long, pluralcount: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getRoundingIncrement(currency: Long, ec: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_getRoundingIncrementForUsage(currency: Long, usage: Int, ec: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_openISOCurrencies(currtype: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_register(isocode: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurr_unregister(key: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_clone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_close(format: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_countSymbols(fmt: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_get2DigitYearStart(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getBooleanAttribute(fmt: Long, attr: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getCalendar(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getNumberFormat(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getNumberFormatForField(fmt: Long, field: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_getSymbols(fmt: Long, type: Int, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_isLenient(fmt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_open(timestyle: Int, datestyle: Int, locale: Long, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_set2DigitYearStart(fmt: Long, d: Double, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setBooleanAttribute(fmt: Long, attr: Int, newvalue: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setCalendar(fmt: Long, calendartoset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setLenient(fmt: Long, islenient: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setNumberFormat(fmt: Long, numberformattoset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_setSymbols(format: Long, type: Int, symbolindex: Int, value: Long, valuelength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_toCalendarDateField(field: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_clone(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_close(dtpg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getAppendItemFormat(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getAppendItemName(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getDecimal(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getFieldDisplayName(dtpg: Long, field: Int, width: Int, fieldname: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_open(locale: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_openEmpty(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_setAppendItemFormat(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_setAppendItemName(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_close(formatter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_closeResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_open(locale: Long, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_openResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_close(en: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_count(en: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_next(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_reset(en: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenum_unext(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositer_close(fpositer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositer_open(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_close(fmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getArrayLength(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getDate(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getDouble(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getInt64(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getLong(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getObject(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getType(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_getUChars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_isNumeric(fmt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmt_open(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ugender_getInstance(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_close(idna: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_labelToASCII_UTF8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_labelToUnicodeUTF8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_nameToASCII_UTF8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_nameToUnicodeUTF8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidna_openUTS46(options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_current32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_getState(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_next32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_previous32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_setState(iter: Long, state: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_setString(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_setUTF16BE(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiter_setUTF8(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_close(ldn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_getContext(ldn: Long, type: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_getDialectHandling(ldn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_getLocale(ldn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_keyDisplayName(ldn: Long, key: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_keyValueDisplayName(ldn: Long, key: Long, value: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_languageDisplayName(ldn: Long, lang: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_localeDisplayName(ldn: Long, locale: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_open(locale: Long, dialecthandling: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_openForContext(locale: Long, contexts: Long, length: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_regionDisplayName(ldn: Long, region: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_scriptCodeDisplayName(ldn: Long, scriptcode: Int, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_scriptDisplayName(ldn: Long, script: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldn_variantDisplayName(ldn: Long, variant: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_close(listfmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_closeResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_open(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_openForType(locale: Long, type: Int, width: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_openResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmt_resultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_acceptLanguage(result: Long, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_acceptLanguageFromHTTP(result: Long, resultavailable: Int, outresult: Long, httpacceptlanguage: Long, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_addLikelySubtags(localeid: Long, maximizedlocaleid: Long, maximizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_canonicalize(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_forLanguageTag(langtag: Long, localeid: Long, localeidcapacity: Int, parsedlength: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getAvailable(n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getBaseName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getCharacterOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getCountry(localeid: Long, country: Long, countrycapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDefault(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayCountry(locale: Long, displaylocale: Long, country: Long, countrycapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayKeyword(keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayKeywordValue(locale: Long, keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayLanguage(locale: Long, displaylocale: Long, language: Long, languagecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayName(localeid: Long, inlocaleid: Long, result: Long, maxresultsize: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayScript(locale: Long, displaylocale: Long, script: Long, scriptcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getDisplayVariant(locale: Long, displaylocale: Long, variant: Long, variantcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getISO3Country(localeid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getISO3Language(localeid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getISOCountries(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getISOLanguages(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getKeywordValue(localeid: Long, keywordname: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getLCID(localeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getLanguage(localeid: Long, language: Long, languagecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getLineOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getLocaleForLCID(hostid: Int, locale: Long, localecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getParent(localeid: Long, parent: Long, parentcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getScript(localeid: Long, script: Long, scriptcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_getVariant(localeid: Long, variant: Long, variantcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_isRightToLeft(locale: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_minimizeSubtags(localeid: Long, minimizedlocaleid: Long, minimizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_openAvailableByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_openKeywords(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_setDefault(localeid: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_setKeywordValue(keywordname: Long, keywordvalue: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_toLanguageTag(localeid: Long, langtag: Long, langtagcapacity: Int, strict: Byte, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_toLegacyKey(keyword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_toLegacyType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_toUnicodeLocaleKey(keyword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uloc_toUnicodeLocaleType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_close(uld: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getCLDRVersion(versionarray: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getDelimiter(uld: Long, type: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getExemplarSet(uld: Long, fillin: Long, options: Int, extype: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getMeasurementSystem(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getNoSubstitute(uld: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_getPaperSize(localeid: Long, height: Long, width: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_open(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdata_setNoSubstitute(uld: Long, setting: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_clone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_close(format: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_getLocale(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_open(pattern: Long, patternlength: Int, locale: Long, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_setLocale(fmt: Long, locale: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_buildImmutable(trie: Long, type: Int, valuewidth: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_clone(other: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_close(trie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_get(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_getRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_open(initialvalue: Int, errorvalue: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_set(trie: Long, c: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_close(norm2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_composePair(norm2: Long, a: Int, b: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getCombiningClass(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getInstance(packagename: Long, name: Long, mode: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getNFCInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getNFDInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getNFKCInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getNFKDInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_isInert(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_clone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_close(fmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_countAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatDecimal(fmt: Long, number: Long, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getAttribute(fmt: Long, attr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getDoubleAttribute(fmt: Long, attr: Int): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getSymbol(fmt: Long, symbol: Int, buffer: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_getTextAttribute(fmt: Long, tag: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_open(style: Int, pattern: Long, patternlength: Int, locale: Long, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: Long, outbuflength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_setAttribute(fmt: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_setContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_setDoubleAttribute(fmt: Long, attr: Int, newvalue: Double)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_setSymbol(fmt: Long, symbol: Int, value: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_setTextAttribute(fmt: Long, tag: Int, newvalue: Long, newvaluelength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_close(uformatter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_closeResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_formatDecimal(uformatter: Long, value: Long, valuelen: Int, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: Long, perror: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_openResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_resultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_close(unumsys: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_getName(unumsys: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_getRadix(unumsys: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_isAlgorithmic(unumsys: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_open(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_openAvailableNames(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsys_openByName(name: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_close(uplrules: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_getKeywords(uplrules: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_open(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_openForType(locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_clone(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_close(regexp: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_end(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_end64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_find(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_find64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_findNext(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_flags(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getStackLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getText(regexp: Long, textlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getTimeLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_getUText(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_groupCount(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_groupNumberFromCName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_hasTransparentBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_hitEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_matches(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_open(pattern: Long, patternlength: Int, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_openC(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_openUText(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_pattern(regexp: Long, patlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_patternUText(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_refreshUText(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_regionEnd(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_regionEnd64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_regionStart(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_regionStart64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_requireEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_reset(regexp: Long, index: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_reset64(regexp: Long, index: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setStackLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setTimeLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_setUText(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_start(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_start64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_areEqual(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_contains(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getAvailable(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getContainedRegions(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getContainedRegionsOfType(uregion: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getContainingRegion(uregion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getContainingRegionOfType(uregion: Long, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getNumericCode(uregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getPreferredValues(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getRegionCode(uregion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getRegionFromCode(regioncode: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getRegionFromNumericCode(code: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregion_getType(uregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_close(reldatefmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_closeResult(ufrdt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_format(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_open(locale: Long, nftoadopt: Long, width: Int, capitalizationcontext: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_openResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_close(resourcebundle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getByKey(resourcebundle: Long, key: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getInt(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getKey(resourcebundle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getLocaleByType(resourcebundle: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getSize(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getString(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getStringByKey(resb: Long, key: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getType(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getUInt(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getUTF8String(resb: Long, dest: Long, length: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getUTF8StringByKey(resb: Long, key: Long, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_getVersion(resb: Long, versioninfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_hasNext(resourcebundle: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_open(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_openAvailableLocales(packagename: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_openDirect(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_openU(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ures_resetIterator(resourcebundle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_breaksBetweenLetters(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getCode(nameorabbrorlocale: Long, fillin: Long, capacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getSampleString(script: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getScript(codepoint: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getShortName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_getUsage(script: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_hasScript(c: Int, sc: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_isCased(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscript_isRightToLeft(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_close(searchiter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_first(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_following(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getAttribute(strsrch: Long, attribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getBreakIterator(strsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getCollator(strsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getMatchedLength(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getMatchedStart(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getOffset(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getPattern(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_getText(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_last(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_next(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_preceding(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_previous(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_reset(strsrch: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setAttribute(strsrch: Long, attribute: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setCollator(strsrch: Long, collator: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setOffset(strsrch: Long, position: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_add(set: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_addAll(set: Long, additionalset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_addAllCodePoints(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_addRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_addString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_applyIntPropertyValue(set: Long, prop: Int, value: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_charAt(set: Long, charindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_clear(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_clone(set: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_cloneAsThawed(set: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_close(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_closeOver(set: Long, attributes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_compact(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_complement(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_complementAll(set: Long, complement: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_contains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsAll(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsNone(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsRange(set: Long, start: Int, end: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsSome(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_containsString(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_equals(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_freeze(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_getItemCount(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_getSerializedRangeCount(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_indexOf(set: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_isEmpty(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_isFrozen(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_open(start: Int, end: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_openEmpty(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_openPatternOptions(pattern: Long, patternlength: Int, options: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_remove(set: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_removeAll(set: Long, removeset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_removeAllStrings(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_removeRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_removeString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_retain(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_retainAll(set: Long, retain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_serializedContains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_set(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_setSerializedToOne(fillset: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_size(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_span(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_spanBack(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_spanBackUTF8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_spanUTF8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_areConfusableUTF8(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_check2UTF8(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_checkUTF8(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_clone(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_close(sc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_closeCheckResult(checkresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getAllowedChars(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getAllowedLocales(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getChecks(sc: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getInclusionSet(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getRecommendedSet(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getRestrictionLevel(sc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getSkeleton(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_getSkeletonUTF8(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_open(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_openCheckResult(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_openFromSource(confusables: Long, confusableslen: Int, confusableswholescript: Long, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_setAllowedChars(sc: Long, chars: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_setAllowedLocales(sc: Long, localeslist: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_setChecks(sc: Long, checks: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoof_setRestrictionLevel(sc: Long, restrictionlevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprep_close(profile: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprep_open(path: Long, filename: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprep_openByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_char32At(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_close(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_current32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_equals(a: Long, b: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_freeze(ut: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_getNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_getPreviousNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_hasMetaData(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_isLengthExpensive(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_isWritable(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_moveIndex32(ut: Long, delta: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_nativeLength(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_next32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_next32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_openUTF8(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_previous32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_previous32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_setNativeIndex(ut: Long, nativeindex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utext_setup(ut: Long, extraspace: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8_back1SafeBody(s: Long, start: Int, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscale_fromInt64(othertime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscale_getTimeScaleValue(timescale: Int, value: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscale_toInt64(universaltime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_functionName(fnnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_getFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_getLevel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_setFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_setLevel(tracelevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrace_vformat(outbuf: Long, capacity: Int, indent: Int, fmt: Long, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_clone(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_close(trans: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_countAvailableIDs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_getUnicodeID(trans: Long, resultlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_openIDs(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_openInverse(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_openU(id: Long, idlength: Int, dir: Int, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_register(adoptedtrans: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utrans_unregisterID(id: Long, idlength: Int)
}

public actual fun AdjustCalendarDate(lpcaldatetime: Long, calunit: CALDATETIME_DATEUNIT, amount: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_AdjustCalendarDate(lpcaldatetime, calunit, amount)

public actual fun CompareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): COMPARESTRING_RESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_CompareStringA(locale.toInt(), dwcmpflags.toInt(), lpstring1, cchcount1, lpstring2, cchcount2)

public actual fun CompareStringEx(lplocalename: PCWSTR, dwcmpflags: COMPARE_STRING_FLAGS, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: LPARAM): COMPARESTRING_RESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_CompareStringEx(lplocalename, dwcmpflags.toInt(), lpstring1, cchcount1, lpstring2, cchcount2, lpversioninformation, lpreserved, lparam)

public actual fun CompareStringOrdinal(lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int, bignorecase: BOOL): COMPARESTRING_RESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_CompareStringOrdinal(lpstring1, cchcount1, lpstring2, cchcount2, bignorecase)

public actual fun CompareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: PCWSTR, cchcount1: Int, lpstring2: PCWSTR, cchcount2: Int): COMPARESTRING_RESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_CompareStringW(locale.toInt(), dwcmpflags.toInt(), lpstring1, cchcount1, lpstring2, cchcount2)

public actual fun ConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ConvertCalDateTimeToSystemTime(lpcaldatetime, lpsystime)

public actual fun ConvertDefaultLocale(locale: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ConvertDefaultLocale(locale.toInt()).toUInt()

public actual fun ConvertSystemTimeToCalDateTime(lpsystime: Long, calid: UInt, lpcaldatetime: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ConvertSystemTimeToCalDateTime(lpsystime, calid.toInt(), lpcaldatetime)

public actual fun EnumCalendarInfoA(lpcalinfoenumproc: CALINFO_ENUMPROCA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumCalendarInfoA(lpcalinfoenumproc.toLong(), locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun EnumCalendarInfoExA(lpcalinfoenumprocex: CALINFO_ENUMPROCEXA, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumCalendarInfoExA(lpcalinfoenumprocex.toLong(), locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun EnumCalendarInfoExEx(pcalinfoenumprocexex: CALINFO_ENUMPROCEXEX, lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lparam: LPARAM): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumCalendarInfoExEx(pcalinfoenumprocexex.toLong(), lplocalename, calendar.toInt(), lpreserved, caltype.toInt(), lparam)

public actual fun EnumCalendarInfoExW(lpcalinfoenumprocex: CALINFO_ENUMPROCEXW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumCalendarInfoExW(lpcalinfoenumprocex.toLong(), locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun EnumCalendarInfoW(lpcalinfoenumproc: CALINFO_ENUMPROCW, locale: UInt, calendar: UInt, caltype: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumCalendarInfoW(lpcalinfoenumproc.toLong(), locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun EnumDateFormatsA(lpdatefmtenumproc: DATEFMT_ENUMPROCA, locale: UInt, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumDateFormatsA(lpdatefmtenumproc.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumDateFormatsExA(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXA, locale: UInt, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumDateFormatsExA(lpdatefmtenumprocex.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumDateFormatsExEx(lpdatefmtenumprocexex: DATEFMT_ENUMPROCEXEX, lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lparam: LPARAM): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumDateFormatsExEx(lpdatefmtenumprocexex.toLong(), lplocalename, dwflags.toInt(), lparam)

public actual fun EnumDateFormatsExW(lpdatefmtenumprocex: DATEFMT_ENUMPROCEXW, locale: UInt, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumDateFormatsExW(lpdatefmtenumprocex.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumDateFormatsW(lpdatefmtenumproc: DATEFMT_ENUMPROCW, locale: UInt, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumDateFormatsW(lpdatefmtenumproc.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCA, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesA(lplanggrouplocaleenumproc.toLong(), languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LANGGROUPLOCALE_ENUMPROCW, languagegroup: UInt, dwflags: UInt, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumLanguageGroupLocalesW(lplanggrouplocaleenumproc.toLong(), languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun EnumSystemCodePagesA(lpcodepageenumproc: CODEPAGE_ENUMPROCA, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemCodePagesA(lpcodepageenumproc.toLong(), dwflags.toInt())

public actual fun EnumSystemCodePagesW(lpcodepageenumproc: CODEPAGE_ENUMPROCW, dwflags: ENUM_SYSTEM_CODE_PAGES_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemCodePagesW(lpcodepageenumproc.toLong(), dwflags.toInt())

public actual fun EnumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GEO_ENUMPROC): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemGeoID(geoclass.toInt(), parentgeoid, lpgeoenumproc.toLong())

public actual fun EnumSystemGeoNames(geoclass: UInt, geoenumproc: GEO_ENUMNAMEPROC, data: LPARAM): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemGeoNames(geoclass.toInt(), geoenumproc.toLong(), data)

public actual fun EnumSystemLanguageGroupsA(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCA, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsA(lplanguagegroupenumproc.toLong(), dwflags.toInt(), lparam)

public actual fun EnumSystemLanguageGroupsW(lplanguagegroupenumproc: LANGUAGEGROUP_ENUMPROCW, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemLanguageGroupsW(lplanguagegroupenumproc.toLong(), dwflags.toInt(), lparam)

public actual fun EnumSystemLocalesA(lplocaleenumproc: LOCALE_ENUMPROCA, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemLocalesA(lplocaleenumproc.toLong(), dwflags.toInt())

public actual fun EnumSystemLocalesEx(lplocaleenumprocex: LOCALE_ENUMPROCEX, dwflags: UInt, lparam: LPARAM, lpreserved: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemLocalesEx(lplocaleenumprocex.toLong(), dwflags.toInt(), lparam, lpreserved)

public actual fun EnumSystemLocalesW(lplocaleenumproc: LOCALE_ENUMPROCW, dwflags: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumSystemLocalesW(lplocaleenumproc.toLong(), dwflags.toInt())

public actual fun EnumTimeFormatsA(lptimefmtenumproc: TIMEFMT_ENUMPROCA, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumTimeFormatsA(lptimefmtenumproc.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumTimeFormatsEx(lptimefmtenumprocex: TIMEFMT_ENUMPROCEX, lplocalename: PCWSTR, dwflags: UInt, lparam: LPARAM): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumTimeFormatsEx(lptimefmtenumprocex.toLong(), lplocalename, dwflags.toInt(), lparam)

public actual fun EnumTimeFormatsW(lptimefmtenumproc: TIMEFMT_ENUMPROCW, locale: UInt, dwflags: TIME_FORMAT_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumTimeFormatsW(lptimefmtenumproc.toLong(), locale.toInt(), dwflags.toInt())

public actual fun EnumUILanguagesA(lpuilanguageenumproc: UILANGUAGE_ENUMPROCA, dwflags: UInt, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumUILanguagesA(lpuilanguageenumproc.toLong(), dwflags.toInt(), lparam)

public actual fun EnumUILanguagesW(lpuilanguageenumproc: UILANGUAGE_ENUMPROCW, dwflags: UInt, lparam: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_EnumUILanguagesW(lpuilanguageenumproc.toLong(), dwflags.toInt(), lparam)

public actual fun FindNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_FindNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), lpstringsource, cchsource, lpstringvalue, cchvalue, pcchfound)

public actual fun FindNLSStringEx(lplocalename: PCWSTR, dwfindnlsstringflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_FindNLSStringEx(lplocalename, dwfindnlsstringflags.toInt(), lpstringsource, cchsource, lpstringvalue, cchvalue, pcchfound, lpversioninformation, lpreserved, sorthandle)

public actual fun FindStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: PCWSTR, cchsource: Int, lpstringvalue: PCWSTR, cchvalue: Int, bignorecase: BOOL): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_FindStringOrdinal(dwfindstringordinalflags.toInt(), lpstringsource, cchsource, lpstringvalue, cchvalue, bignorecase)

public actual fun FoldStringA(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_FoldStringA(dwmapflags.toInt(), lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun FoldStringW(dwmapflags: FOLD_STRING_MAP_FLAGS, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_FoldStringW(dwmapflags.toInt(), lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun GetACP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetACP().toUInt()

public actual fun GetCPInfo(codepage: UInt, lpcpinfo: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCPInfo(codepage.toInt(), lpcpinfo)

public actual fun GetCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCPInfoExA(codepage.toInt(), dwflags.toInt(), lpcpinfoex)

public actual fun GetCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCPInfoExW(codepage.toInt(), dwflags.toInt(), lpcpinfoex)

public actual fun GetCalendarDateFormatEx(lpszlocale: PCWSTR, dwflags: UInt, lpcaldatetime: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCalendarDateFormatEx(lpszlocale, dwflags.toInt(), lpcaldatetime, lpformat, lpdatestr, cchdate)

public actual fun GetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PSTR, cchdata: Int, lpvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata, cchdata, lpvalue)

public actual fun GetCalendarInfoEx(lplocalename: PCWSTR, calendar: UInt, lpreserved: PCWSTR, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCalendarInfoEx(lplocalename, calendar.toInt(), lpreserved, caltype.toInt(), lpcaldata, cchdata, lpvalue)

public actual fun GetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PWSTR, cchdata: Int, lpvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata, cchdata, lpvalue)

public actual fun GetCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: Long, lpcalmaxdatetime: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCalendarSupportedDateRange(calendar.toInt(), lpcalmindatetime, lpcalmaxdatetime)

public actual fun GetCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpcurrencystr: PSTR, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCurrencyFormatA(locale.toInt(), dwflags.toInt(), lpvalue, lpformat, lpcurrencystr, cchcurrency)

public actual fun GetCurrencyFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCurrencyFormatEx(lplocalename, dwflags.toInt(), lpvalue, lpformat, lpcurrencystr, cchcurrency)

public actual fun GetCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpcurrencystr: PWSTR, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetCurrencyFormatW(locale.toInt(), dwflags.toInt(), lpvalue, lpformat, lpcurrencystr, cchcurrency)

public actual fun GetDateFormatA(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCSTR, lpdatestr: PSTR, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDateFormatA(locale.toInt(), dwflags.toInt(), lpdate, lpformat, lpdatestr, cchdate)

public actual fun GetDateFormatEx(lplocalename: PCWSTR, dwflags: ENUM_DATE_FORMATS_FLAGS, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int, lpcalendar: PCWSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDateFormatEx(lplocalename, dwflags.toInt(), lpdate, lpformat, lpdatestr, cchdate, lpcalendar)

public actual fun GetDateFormatW(locale: UInt, dwflags: UInt, lpdate: Long, lpformat: PCWSTR, lpdatestr: PWSTR, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDateFormatW(locale.toInt(), dwflags.toInt(), lpdate, lpformat, lpdatestr, cchdate)

public actual fun GetDistanceOfClosestLanguageInList(pszlanguage: PCWSTR, pszlanguageslist: PCWSTR, wchlistdelimiter: UShort, pclosestdistance: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDistanceOfClosestLanguageInList(pszlanguage, pszlanguageslist, wchlistdelimiter.toShort(), pclosestdistance)

public actual fun GetDurationFormat(locale: UInt, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDurationFormat(locale.toInt(), dwflags.toInt(), lpduration, ullduration.toLong(), lpformat, lpdurationstr, cchduration)

public actual fun GetDurationFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpduration: Long, ullduration: ULong, lpformat: PCWSTR, lpdurationstr: PWSTR, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetDurationFormatEx(lplocalename, dwflags.toInt(), lpduration, ullduration.toLong(), lpformat, lpdurationstr, cchduration)

public actual fun GetFileMUIInfo(dwflags: UInt, pcwszfilepath: PCWSTR, pfilemuiinfo: Long, pcbfilemuiinfo: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetFileMUIInfo(dwflags.toInt(), pcwszfilepath, pfilemuiinfo, pcbfilemuiinfo)

public actual fun GetFileMUIPath(dwflags: UInt, pcwszfilepath: PCWSTR, pwszlanguage: PWSTR, pcchlanguage: Long, pwszfilemuipath: PWSTR, pcchfilemuipath: Long, pululenumerator: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetFileMUIPath(dwflags.toInt(), pcwszfilepath, pwszlanguage, pcchlanguage, pwszfilemuipath, pcchfilemuipath, pululenumerator)

public actual fun GetGeoInfoA(location: Int, geotype: SYSGEOTYPE, lpgeodata: PSTR, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetGeoInfoA(location, geotype, lpgeodata, cchdata, langid.toShort())

public actual fun GetGeoInfoEx(location: PCWSTR, geotype: SYSGEOTYPE, geodata: PWSTR, geodatacount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetGeoInfoEx(location, geotype, geodata, geodatacount)

public actual fun GetGeoInfoW(location: Int, geotype: SYSGEOTYPE, lpgeodata: PWSTR, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetGeoInfoW(location, geotype, lpgeodata, cchdata, langid.toShort())

public actual fun GetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PSTR, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata, cchdata)

public actual fun GetLocaleInfoEx(lplocalename: PCWSTR, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetLocaleInfoEx(lplocalename, lctype.toInt(), lplcdata, cchdata)

public actual fun GetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PWSTR, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata, cchdata)

public actual fun GetNLSVersion(function: UInt, locale: UInt, lpversioninformation: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetNLSVersion(function.toInt(), locale.toInt(), lpversioninformation)

public actual fun GetNLSVersionEx(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetNLSVersionEx(function.toInt(), lplocalename, lpversioninformation)

public actual fun GetNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: PCSTR, lpformat: Long, lpnumberstr: PSTR, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetNumberFormatA(locale.toInt(), dwflags.toInt(), lpvalue, lpformat, lpnumberstr, cchnumber)

public actual fun GetNumberFormatEx(lplocalename: PCWSTR, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetNumberFormatEx(lplocalename, dwflags.toInt(), lpvalue, lpformat, lpnumberstr, cchnumber)

public actual fun GetNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: PCWSTR, lpformat: Long, lpnumberstr: PWSTR, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetNumberFormatW(locale.toInt(), dwflags.toInt(), lpvalue, lpformat, lpnumberstr, cchnumber)

public actual fun GetOEMCP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetOEMCP().toUInt()

public actual fun GetProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetProcessPreferredUILanguages(dwflags.toInt(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)

public actual fun GetStringScripts(dwflags: UInt, lpstring: PCWSTR, cchstring: Int, lpscripts: PWSTR, cchscripts: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetStringScripts(dwflags.toInt(), lpstring, cchstring, lpscripts, cchscripts)

public actual fun GetStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetStringTypeA(locale.toInt(), dwinfotype.toInt(), lpsrcstr, cchsrc, lpchartype)

public actual fun GetStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpchartype: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetStringTypeExA(locale.toInt(), dwinfotype.toInt(), lpsrcstr, cchsrc, lpchartype)

public actual fun GetStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetStringTypeExW(locale.toInt(), dwinfotype.toInt(), lpsrcstr, cchsrc, lpchartype)

public actual fun GetStringTypeW(dwinfotype: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpchartype: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetStringTypeW(dwinfotype.toInt(), lpsrcstr, cchsrc, lpchartype)

public actual fun GetSystemDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetSystemDefaultLCID().toUInt()

public actual fun GetSystemDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetSystemDefaultLangID().toUShort()

public actual fun GetSystemDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetSystemDefaultLocaleName(lplocalename, cchlocalename)

public actual fun GetSystemDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetSystemDefaultUILanguage().toUShort()

public actual fun GetSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetSystemPreferredUILanguages(dwflags.toInt(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)

public actual fun GetTextCharset(hdc: HDC): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetTextCharset(hdc)

public actual fun GetTextCharsetInfo(hdc: HDC, lpsig: Long, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetTextCharsetInfo(hdc, lpsig, dwflags.toInt())

public actual fun GetThreadLocale(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetThreadLocale().toUInt()

public actual fun GetThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetThreadPreferredUILanguages(dwflags.toInt(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)

public actual fun GetThreadUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetThreadUILanguage().toUShort()

public actual fun GetTimeFormatA(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCSTR, lptimestr: PSTR, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetTimeFormatA(locale.toInt(), dwflags.toInt(), lptime, lpformat, lptimestr, cchtime)

public actual fun GetTimeFormatEx(lplocalename: PCWSTR, dwflags: TIME_FORMAT_FLAGS, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetTimeFormatEx(lplocalename, dwflags.toInt(), lptime, lpformat, lptimestr, cchtime)

public actual fun GetTimeFormatW(locale: UInt, dwflags: UInt, lptime: Long, lpformat: PCWSTR, lptimestr: PWSTR, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetTimeFormatW(locale.toInt(), dwflags.toInt(), lptime, lpformat, lptimestr, cchtime)

public actual fun GetUILanguageInfo(dwflags: UInt, pwmszlanguage: PCWSTR, pwszfallbacklanguages: PWSTR, pcchfallbacklanguages: Long, pattributes: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUILanguageInfo(dwflags.toInt(), pwmszlanguage, pwszfallbacklanguages, pcchfallbacklanguages, pattributes)

public actual fun GetUserDefaultGeoName(geoname: PWSTR, geonamecount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserDefaultGeoName(geoname, geonamecount)

public actual fun GetUserDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserDefaultLCID().toUInt()

public actual fun GetUserDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserDefaultLangID().toUShort()

public actual fun GetUserDefaultLocaleName(lplocalename: PWSTR, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserDefaultLocaleName(lplocalename, cchlocalename)

public actual fun GetUserDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserDefaultUILanguage().toUShort()

public actual fun GetUserGeoID(geoclass: SYSGEOCLASS): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserGeoID(geoclass)

public actual fun GetUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: Long, pwszlanguagesbuffer: PWSTR, pcchlanguagesbuffer: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_GetUserPreferredUILanguages(dwflags.toInt(), pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer)

public actual fun IdnToAscii(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpasciicharstr: PWSTR, cchasciichar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IdnToAscii(dwflags.toInt(), lpunicodecharstr, cchunicodechar, lpasciicharstr, cchasciichar)

public actual fun IdnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: PCWSTR, cchunicodechar: Int, lpnameprepcharstr: PWSTR, cchnameprepchar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IdnToNameprepUnicode(dwflags.toInt(), lpunicodecharstr, cchunicodechar, lpnameprepcharstr, cchnameprepchar)

public actual fun IdnToUnicode(dwflags: UInt, lpasciicharstr: PCWSTR, cchasciichar: Int, lpunicodecharstr: PWSTR, cchunicodechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IdnToUnicode(dwflags.toInt(), lpasciicharstr, cchasciichar, lpunicodecharstr, cchunicodechar)

public actual fun IsCalendarLeapYear(calid: UInt, year: UInt, era: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt())

public actual fun IsDBCSLeadByte(testchar: UByte): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsDBCSLeadByte(testchar.toByte())

public actual fun IsDBCSLeadByteEx(codepage: UInt, testchar: UByte): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsDBCSLeadByteEx(codepage.toInt(), testchar.toByte())

public actual fun IsNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: Long, lpstring: PCWSTR, cchstr: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsNLSDefinedString(function.toInt(), dwflags.toInt(), lpversioninformation, lpstring, cchstr)

public actual fun IsNormalizedString(normform: NORM_FORM, lpstring: PCWSTR, cwlength: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsNormalizedString(normform, lpstring, cwlength)

public actual fun IsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsTextUnicode(lpv, isize, lpiresult)

public actual fun IsValidCodePage(codepage: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsValidCodePage(codepage.toInt())

public actual fun IsValidLanguageGroup(languagegroup: UInt, dwflags: ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt())

public actual fun IsValidLocale(locale: UInt, dwflags: IS_VALID_LOCALE_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsValidLocale(locale.toInt(), dwflags.toInt())

public actual fun IsValidLocaleName(lplocalename: PCWSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsValidLocaleName(lplocalename)

public actual fun IsValidNLSVersion(function: UInt, lplocalename: PCWSTR, lpversioninformation: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsValidNLSVersion(function.toInt(), lplocalename, lpversioninformation).toUInt()

public actual fun IsWellFormedTag(psztag: PCWSTR): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_IsWellFormedTag(psztag).toUByte()

public actual fun LCIDToLocaleName(locale: UInt, lpname: PWSTR, cchname: Int, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_LCIDToLocaleName(locale.toInt(), lpname, cchname, dwflags.toInt())

public actual fun LCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_LCMapStringA(locale.toInt(), dwmapflags.toInt(), lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun LCMapStringEx(lplocalename: PCWSTR, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: LPARAM): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_LCMapStringEx(lplocalename, dwmapflags.toInt(), lpsrcstr, cchsrc, lpdeststr, cchdest, lpversioninformation, lpreserved, sorthandle)

public actual fun LCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_LCMapStringW(locale.toInt(), dwmapflags.toInt(), lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun LocaleNameToLCID(lpname: PCWSTR, dwflags: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_LocaleNameToLCID(lpname, dwflags.toInt()).toUInt()

public actual fun MappingDoAction(pbag: Long, dwrangeindex: UInt, pszactionid: PCWSTR): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MappingDoAction(pbag, dwrangeindex.toInt(), pszactionid)

public actual fun MappingFreePropertyBag(pbag: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MappingFreePropertyBag(pbag)

public actual fun MappingFreeServices(pserviceinfo: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MappingFreeServices(pserviceinfo)

public actual fun MappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MappingGetServices(poptions, prgservices, pdwservicescount)

public actual fun MappingRecognizeText(pserviceinfo: Long, psztext: PCWSTR, dwlength: UInt, dwindex: UInt, poptions: Long, pbag: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MappingRecognizeText(pserviceinfo, psztext, dwlength.toInt(), dwindex.toInt(), poptions, pbag)

public actual fun MultiByteToWideChar(codepage: UInt, dwflags: MULTI_BYTE_TO_WIDE_CHAR_FLAGS, lpmultibytestr: PCSTR, cbmultibyte: Int, lpwidecharstr: PWSTR, cchwidechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_MultiByteToWideChar(codepage.toInt(), dwflags.toInt(), lpmultibytestr, cbmultibyte, lpwidecharstr, cchwidechar)

public actual fun NormalizeString(normform: NORM_FORM, lpsrcstring: PCWSTR, cwsrclength: Int, lpdststring: PWSTR, cwdstlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_NormalizeString(normform, lpsrcstring, cwsrclength, lpdststring, cwdstlength)

public actual fun NotifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: PCWSTR, pcwstrpreviouslanguage: PCWSTR, dwreserved: UInt, pdwstatusrtrn: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_NotifyUILanguageChange(dwflags.toInt(), pcwstrnewlanguage, pcwstrpreviouslanguage, dwreserved.toInt(), pdwstatusrtrn)

public actual fun ResolveLocaleName(lpnametoresolve: PCWSTR, lplocalename: PWSTR, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ResolveLocaleName(lpnametoresolve, lplocalename, cchlocalename)

public actual fun RestoreThreadPreferredUILanguages(snapshot: HSAVEDUILANGUAGES) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_RestoreThreadPreferredUILanguages(snapshot)
}

public actual fun ScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptApplyDigitSubstitution(psds, psc, pss)

public actual fun ScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptApplyLogicalWidth(pidx, cchars, cglyphs, pwlogclust, psva, piadvance, psa, pabc, pijustify)

public actual fun ScriptBreak(pwcchars: PCWSTR, cchars: Int, psa: Long, psla: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptBreak(pwcchars, cchars, psa, psla)

public actual fun ScriptCPtoX(icp: Int, ftrailing: BOOL, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust, psva, piadvance, psa, pix)

public actual fun ScriptCacheGetHeight(hdc: HDC, psc: Long, tmheight: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptCacheGetHeight(hdc, psc, tmheight)

public actual fun ScriptFreeCache(psc: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptFreeCache(psc)

public actual fun ScriptGetCMap(hdc: HDC, psc: Long, pwcinchars: PCWSTR, cchars: Int, dwflags: UInt, pwoutglyphs: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetCMap(hdc, psc, pwcinchars, cchars, dwflags.toInt(), pwoutglyphs)

public actual fun ScriptGetFontAlternateGlyphs(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetFontAlternateGlyphs(hdc, psc, psa, tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toShort(), cmaxalternates, palternateglyphs, pcalternates)

public actual fun ScriptGetFontFeatureTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: Long, pctags: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetFontFeatureTags(hdc, psc, psa, tagscript.toInt(), taglangsys.toInt(), cmaxtags, pfeaturetags, pctags)

public actual fun ScriptGetFontLanguageTags(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, cmaxtags: Int, plangsystags: Long, pctags: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetFontLanguageTags(hdc, psc, psa, tagscript.toInt(), cmaxtags, plangsystags, pctags)

public actual fun ScriptGetFontProperties(hdc: HDC, psc: Long, sfp: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetFontProperties(hdc, psc, sfp)

public actual fun ScriptGetFontScriptTags(hdc: HDC, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetFontScriptTags(hdc, psc, psa, cmaxtags, pscripttags, pctags)

public actual fun ScriptGetGlyphABCWidth(hdc: HDC, psc: Long, wglyph: UShort, pabc: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetGlyphABCWidth(hdc, psc, wglyph.toShort(), pabc)

public actual fun ScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetLogicalWidths(psa, cchars, cglyphs, piglyphwidth, pwlogclust, psva, pidx)

public actual fun ScriptGetProperties(ppsp: Long, pinumscripts: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptGetProperties(ppsp, pinumscripts)

public actual fun ScriptIsComplex(pwcinchars: PCWSTR, cinchars: Int, dwflags: SCRIPT_IS_COMPLEX_FLAGS): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptIsComplex(pwcinchars, cinchars, dwflags.toInt())

public actual fun ScriptItemize(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptItemize(pwcinchars, cinchars, cmaxitems, pscontrol, psstate, pitems, pcitems)

public actual fun ScriptItemizeOpenType(pwcinchars: PCWSTR, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptItemizeOpenType(pwcinchars, cinchars, cmaxitems, pscontrol, psstate, pitems, pscripttags, pcitems)

public actual fun ScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptJustify(psva, piadvance, cglyphs, idx, iminkashida, pijustify)

public actual fun ScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptLayout(cruns, pblevel, pivisualtological, pilogicaltovisual)

public actual fun ScriptPlace(hdc: HDC, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptPlace(hdc, psc, pwglyphs, cglyphs, psva, psa, piadvance, pgoffset, pabc)

public actual fun ScriptPlaceOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptPlaceOpenType(hdc, psc, psa, tagscript.toInt(), taglangsys.toInt(), rcrangechars, rprangeproperties, cranges, pwcchars, pwlogclust, pcharprops, cchars, pwglyphs, pglyphprops, cglyphs, piadvance, pgoffset, pabc)

public actual fun ScriptPositionSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: GOFFSET, pioutadvance: Long, poutgoffset: Long): HRESULT =
    0

public actual fun ScriptRecordDigitSubstitution(locale: UInt, psds: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptRecordDigitSubstitution(locale.toInt(), psds)

public actual fun ScriptShape(hdc: HDC, psc: Long, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptShape(hdc, psc, pwcchars, cchars, cmaxglyphs, psa, pwoutglyphs, pwlogclust, psva, pcglyphs)

public actual fun ScriptShapeOpenType(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: PCWSTR, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptShapeOpenType(hdc, psc, psa, tagscript.toInt(), taglangsys.toInt(), rcrangechars, rprangeproperties, cranges, pwcchars, cchars, cmaxglyphs, pwlogclust, pcharprops, pwoutglyphs, poutglyphprops, pcglyphs)

public actual fun ScriptStringAnalyse(hdc: HDC, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringAnalyse(hdc, pstring, cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, pscontrol, psstate, pidx, ptabdef, pbinclass, pssa)

public actual fun ScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: BOOL, px: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringCPtoX(ssa, icp, ftrailing, px)

public actual fun ScriptStringFree(pssa: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringFree(pssa)

public actual fun ScriptStringGetLogicalWidths(ssa: Long, pidx: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringGetLogicalWidths(ssa, pidx)

public actual fun ScriptStringGetOrder(ssa: Long, puorder: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringGetOrder(ssa, puorder)

public actual fun ScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: ETO_OPTIONS, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: BOOL): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringOut(ssa, ix, iy, uoptions.toInt(), prc, iminsel, imaxsel, fdisabled)

public actual fun ScriptStringValidate(ssa: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringValidate(ssa)

public actual fun ScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptStringXtoCP(ssa, ix, pich, pitrailing)

public actual fun ScriptString_pLogAttr(ssa: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptString_pLogAttr(ssa)

public actual fun ScriptString_pSize(ssa: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptString_pSize(ssa)

public actual fun ScriptString_pcOutChars(ssa: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptString_pcOutChars(ssa)

public actual fun ScriptSubstituteSingleGlyph(hdc: HDC, psc: Long, psa: Long, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptSubstituteSingleGlyph(hdc, psc, psa, tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toShort(), pwoutglyphid)

public actual fun ScriptTextOut(hdc: HDC, psc: Long, x: Int, y: Int, fuoptions: UInt, lprc: Long, psa: Long, pwcreserved: PCWSTR, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptTextOut(hdc, psc, x, y, fuoptions.toInt(), lprc, psa, pwcreserved, ireserved, pwglyphs, cglyphs, piadvance, pijustify, pgoffset)

public actual fun ScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): HRESULT =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ScriptXtoCP(ix, cchars, cglyphs, pwlogclust, psva, piadvance, psa, picp, pitrailing)

public actual fun SetCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata)

public actual fun SetCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: PCWSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata)

public actual fun SetLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: PCSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata)

public actual fun SetLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: PCWSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata)

public actual fun SetProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetProcessPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer, pulnumlanguages)

public actual fun SetThreadLocale(locale: UInt): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetThreadLocale(locale.toInt())

public actual fun SetThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: PCWSTR, pulnumlanguages: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer, pulnumlanguages)

public actual fun SetThreadPreferredUILanguages2(flags: UInt, languages: PCWSTR, numlanguagesset: Long, snapshot: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetThreadPreferredUILanguages2(flags.toInt(), languages, numlanguagesset, snapshot)

public actual fun SetThreadUILanguage(langid: UShort): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetThreadUILanguage(langid.toShort()).toUShort()

public actual fun SetUserGeoID(geoid: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetUserGeoID(geoid)

public actual fun SetUserGeoName(geoname: PCWSTR): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_SetUserGeoName(geoname)

public actual fun TranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: TRANSLATE_CHARSET_INFO_FLAGS): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_TranslateCharsetInfo(lpsrc, lpcs, dwflags.toInt())

public actual fun UCNV_FROM_U_CALLBACK_ESCAPE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_ESCAPE(context, fromuargs, codeunits, length, codepoint, reason, err)
}

public actual fun UCNV_FROM_U_CALLBACK_SKIP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SKIP(context, fromuargs, codeunits, length, codepoint, reason, err)
}

public actual fun UCNV_FROM_U_CALLBACK_STOP(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_STOP(context, fromuargs, codeunits, length, codepoint, reason, err)
}

public actual fun UCNV_FROM_U_CALLBACK_SUBSTITUTE(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SUBSTITUTE(context, fromuargs, codeunits, length, codepoint, reason, err)
}

public actual fun UCNV_TO_U_CALLBACK_ESCAPE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_ESCAPE(context, touargs, codeunits, length, reason, err)
}

public actual fun UCNV_TO_U_CALLBACK_SKIP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SKIP(context, touargs, codeunits, length, reason, err)
}

public actual fun UCNV_TO_U_CALLBACK_STOP(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_STOP(context, touargs, codeunits, length, reason, err)
}

public actual fun UCNV_TO_U_CALLBACK_SUBSTITUTE(context: Long, touargs: Long, codeunits: PCSTR, length: Int, reason: UConverterCallbackReason, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SUBSTITUTE(context, touargs, codeunits, length, reason, err)
}

public actual fun UpdateCalendarDayOfWeek(lpcaldatetime: Long): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_UpdateCalendarDayOfWeek(lpcaldatetime)

public actual fun VerifyScripts(dwflags: UInt, lplocalescripts: PCWSTR, cchlocalescripts: Int, lptestscripts: PCWSTR, cchtestscripts: Int): BOOL =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_VerifyScripts(dwflags.toInt(), lplocalescripts, cchlocalescripts, lptestscripts, cchtestscripts)

public actual fun WideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: PCWSTR, cchwidechar: Int, lpmultibytestr: PSTR, cbmultibyte: Int, lpdefaultchar: PCSTR, lpuseddefaultchar: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_WideCharToMultiByte(codepage.toInt(), dwflags.toInt(), lpwidecharstr, cchwidechar, lpmultibytestr, cbmultibyte, lpdefaultchar, lpuseddefaultchar)

public actual fun lstrcatA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcatA(lpstring1, lpstring2)

public actual fun lstrcatW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcatW(lpstring1, lpstring2)

public actual fun lstrcmpA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpA(lpstring1, lpstring2)

public actual fun lstrcmpW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpW(lpstring1, lpstring2)

public actual fun lstrcmpiA(lpstring1: PCSTR, lpstring2: PCSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpiA(lpstring1, lpstring2)

public actual fun lstrcmpiW(lpstring1: PCWSTR, lpstring2: PCWSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpiW(lpstring1, lpstring2)

public actual fun lstrcpyA(lpstring1: PSTR, lpstring2: PCSTR): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpyA(lpstring1, lpstring2)

public actual fun lstrcpyW(lpstring1: PWSTR, lpstring2: PCWSTR): PWSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpyW(lpstring1, lpstring2)

public actual fun lstrcpynA(lpstring1: PSTR, lpstring2: PCSTR, imaxlength: Int): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpynA(lpstring1, lpstring2, imaxlength)

public actual fun lstrcpynW(lpstring1: PWSTR, lpstring2: PCWSTR, imaxlength: Int): PWSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpynW(lpstring1, lpstring2, imaxlength)

public actual fun lstrlenA(lpstring: PCSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrlenA(lpstring)

public actual fun lstrlenW(lpstring: PCWSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrlenW(lpstring)

public actual fun u_UCharsToChars(us: Long, cs: PCSTR, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_UCharsToChars(us, cs, length)
}

public actual fun u_austrcpy(dst: PCSTR, src: Long): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_austrcpy(dst, src)

public actual fun u_austrncpy(dst: PCSTR, src: Long, n: Int): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_austrncpy(dst, src, n)

public actual fun u_catclose(catd: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_catclose(catd)
}

public actual fun u_catgets(catd: Long, set_num: Int, msg_num: Int, s: Long, len: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_catgets(catd, set_num, msg_num, s, len, ec)

public actual fun u_catopen(name: PCSTR, locale: PCSTR, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_catopen(name, locale, ec)

public actual fun u_charAge(c: Int, versionarray: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charAge(c, versionarray)
}

public actual fun u_charDigitValue(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charDigitValue(c)

public actual fun u_charDirection(c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charDirection(c)

public actual fun u_charFromName(namechoice: UCharNameChoice, name: PCSTR, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charFromName(namechoice, name, perrorcode)

public actual fun u_charMirror(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charMirror(c)

public actual fun u_charName(code: Int, namechoice: UCharNameChoice, buffer: PCSTR, bufferlength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charName(code, namechoice, buffer, bufferlength, perrorcode)

public actual fun u_charType(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charType(c)

public actual fun u_charsToUChars(cs: PCSTR, us: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_charsToUChars(cs, us, length)
}

public actual fun u_cleanup() {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_cleanup()
}

public actual fun u_countChar32(s: Long, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_countChar32(s, length)

public actual fun u_digit(ch: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_digit(ch, radix)

public actual fun u_enumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: UCharNameChoice, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_enumCharNames(start, limit, fn, context, namechoice, perrorcode)
}

public actual fun u_enumCharTypes(enumrange: Long, context: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_enumCharTypes(enumrange, context)
}

public actual fun u_errorName(code: UErrorCode): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_errorName(code)

public actual fun u_foldCase(c: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_foldCase(c, options.toInt())

public actual fun u_forDigit(digit: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_forDigit(digit, radix)

public actual fun u_formatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun u_formatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long): Int =
    0

public actual fun u_getBidiPairedBracket(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getBidiPairedBracket(c)

public actual fun u_getBinaryPropertySet(property: UProperty, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getBinaryPropertySet(property, perrorcode)

public actual fun u_getCombiningClass(c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getCombiningClass(c).toUByte()

public actual fun u_getDataVersion(dataversionfillin: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getDataVersion(dataversionfillin, status)
}

public actual fun u_getFC_NFKC_Closure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getFC_NFKC_Closure(c, dest, destcapacity, perrorcode)

public actual fun u_getIntPropertyMap(property: UProperty, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getIntPropertyMap(property, perrorcode)

public actual fun u_getIntPropertyMaxValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getIntPropertyMaxValue(which)

public actual fun u_getIntPropertyMinValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getIntPropertyMinValue(which)

public actual fun u_getIntPropertyValue(c: Int, which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getIntPropertyValue(c, which)

public actual fun u_getNumericValue(c: Int): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getNumericValue(c)

public actual fun u_getPropertyEnum(alias: PCSTR): UProperty =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getPropertyEnum(alias)

public actual fun u_getPropertyName(property: UProperty, namechoice: UPropertyNameChoice): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getPropertyName(property, namechoice)

public actual fun u_getPropertyValueEnum(property: UProperty, alias: PCSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getPropertyValueEnum(property, alias)

public actual fun u_getPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getPropertyValueName(property, value, namechoice)

public actual fun u_getUnicodeVersion(versionarray: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getUnicodeVersion(versionarray)
}

public actual fun u_getVersion(versionarray: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_getVersion(versionarray)
}

public actual fun u_hasBinaryProperty(c: Int, which: UProperty): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_hasBinaryProperty(c, which)

public actual fun u_init(status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_init(status)
}

public actual fun u_isIDIgnorable(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isIDIgnorable(c)

public actual fun u_isIDPart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isIDPart(c)

public actual fun u_isIDStart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isIDStart(c)

public actual fun u_isISOControl(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isISOControl(c)

public actual fun u_isJavaIDPart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isJavaIDPart(c)

public actual fun u_isJavaIDStart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isJavaIDStart(c)

public actual fun u_isJavaSpaceChar(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isJavaSpaceChar(c)

public actual fun u_isMirrored(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isMirrored(c)

public actual fun u_isUAlphabetic(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isUAlphabetic(c)

public actual fun u_isULowercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isULowercase(c)

public actual fun u_isUUppercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isUUppercase(c)

public actual fun u_isUWhiteSpace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isUWhiteSpace(c)

public actual fun u_isWhitespace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isWhitespace(c)

public actual fun u_isalnum(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isalnum(c)

public actual fun u_isalpha(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isalpha(c)

public actual fun u_isbase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isbase(c)

public actual fun u_isblank(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isblank(c)

public actual fun u_iscntrl(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_iscntrl(c)

public actual fun u_isdefined(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isdefined(c)

public actual fun u_isdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isdigit(c)

public actual fun u_isgraph(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isgraph(c)

public actual fun u_islower(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_islower(c)

public actual fun u_isprint(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isprint(c)

public actual fun u_ispunct(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_ispunct(c)

public actual fun u_isspace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isspace(c)

public actual fun u_istitle(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_istitle(c)

public actual fun u_isupper(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isupper(c)

public actual fun u_isxdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_isxdigit(c)

public actual fun u_memcasecmp(s1: Long, s2: Long, length: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memcasecmp(s1, s2, length, options.toInt())

public actual fun u_memchr(s: Long, c: UShort, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memchr(s, c.toShort(), count)

public actual fun u_memchr32(s: Long, c: Int, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memchr32(s, c, count)

public actual fun u_memcmp(buf1: Long, buf2: Long, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memcmp(buf1, buf2, count)

public actual fun u_memcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memcmpCodePointOrder(s1, s2, count)

public actual fun u_memcpy(dest: Long, src: Long, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memcpy(dest, src, count)

public actual fun u_memmove(dest: Long, src: Long, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memmove(dest, src, count)

public actual fun u_memrchr(s: Long, c: UShort, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memrchr(s, c.toShort(), count)

public actual fun u_memrchr32(s: Long, c: Int, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memrchr32(s, c, count)

public actual fun u_memset(dest: Long, c: UShort, count: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_memset(dest, c.toShort(), count)

public actual fun u_parseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long) {
}

public actual fun u_parseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long) {
}

public actual fun u_setMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_setMemoryFunctions(context, a, r, f, status)
}

public actual fun u_shapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: UInt, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_shapeArabic(source, sourcelength, dest, destsize, options.toInt(), perrorcode)

public actual fun u_strCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strCaseCompare(s1, length1, s2, length2, options.toInt(), perrorcode)

public actual fun u_strCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strCompare(s1, length1, s2, length2, codepointorder)

public actual fun u_strCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strCompareIter(iter1, iter2, codepointorder)

public actual fun u_strFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFindFirst(s, length, substring, sublength)

public actual fun u_strFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFindLast(s, length, substring, sublength)

public actual fun u_strFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: UInt, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFoldCase(dest, destcapacity, src, srclength, options.toInt(), perrorcode)

public actual fun u_strFromJavaModifiedUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromJavaModifiedUTF8WithSub(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode)

public actual fun u_strFromUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromUTF32(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strFromUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromUTF32WithSub(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode)

public actual fun u_strFromUTF8(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromUTF8(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strFromUTF8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromUTF8Lenient(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strFromUTF8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: PCSTR, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromUTF8WithSub(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode)

public actual fun u_strFromWCS(dest: Long, destcapacity: Int, pdestlength: Long, src: PCWSTR, srclength: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strFromWCS(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strHasMoreChar32Than(s: Long, length: Int, number: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strHasMoreChar32Than(s, length, number)

public actual fun u_strToJavaModifiedUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToJavaModifiedUTF8(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToLower(dest, destcapacity, src, srclength, locale, perrorcode)

public actual fun u_strToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: PCSTR, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToTitle(dest, destcapacity, src, srclength, titleiter, locale, perrorcode)

public actual fun u_strToUTF32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToUTF32(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strToUTF32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToUTF32WithSub(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode)

public actual fun u_strToUTF8(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToUTF8(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strToUTF8WithSub(dest: PCSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): PSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToUTF8WithSub(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode)

public actual fun u_strToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: PCSTR, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToUpper(dest, destcapacity, src, srclength, locale, perrorcode)

public actual fun u_strToWCS(dest: PCWSTR, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): PWSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strToWCS(dest, destcapacity, pdestlength, src, srclength, perrorcode)

public actual fun u_strcasecmp(s1: Long, s2: Long, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcasecmp(s1, s2, options.toInt())

public actual fun u_strcat(dst: Long, src: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcat(dst, src)

public actual fun u_strchr(s: Long, c: UShort): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strchr(s, c.toShort())

public actual fun u_strchr32(s: Long, c: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strchr32(s, c)

public actual fun u_strcmp(s1: Long, s2: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcmp(s1, s2)

public actual fun u_strcmpCodePointOrder(s1: Long, s2: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcmpCodePointOrder(s1, s2)

public actual fun u_strcpy(dst: Long, src: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcpy(dst, src)

public actual fun u_strcspn(string: Long, matchset: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strcspn(string, matchset)

public actual fun u_strlen(s: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strlen(s)

public actual fun u_strncasecmp(s1: Long, s2: Long, n: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strncasecmp(s1, s2, n, options.toInt())

public actual fun u_strncat(dst: Long, src: Long, n: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strncat(dst, src, n)

public actual fun u_strncmp(ucs1: Long, ucs2: Long, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strncmp(ucs1, ucs2, n)

public actual fun u_strncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strncmpCodePointOrder(s1, s2, n)

public actual fun u_strncpy(dst: Long, src: Long, n: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strncpy(dst, src, n)

public actual fun u_strpbrk(string: Long, matchset: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strpbrk(string, matchset)

public actual fun u_strrchr(s: Long, c: UShort): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strrchr(s, c.toShort())

public actual fun u_strrchr32(s: Long, c: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strrchr32(s, c)

public actual fun u_strrstr(s: Long, substring: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strrstr(s, substring)

public actual fun u_strspn(string: Long, matchset: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strspn(string, matchset)

public actual fun u_strstr(s: Long, substring: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strstr(s, substring)

public actual fun u_strtok_r(src: Long, delim: Long, savestate: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_strtok_r(src, delim, savestate)

public actual fun u_tolower(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_tolower(c)

public actual fun u_totitle(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_totitle(c)

public actual fun u_toupper(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_toupper(c)

public actual fun u_uastrcpy(dst: Long, src: PCSTR): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_uastrcpy(dst, src)

public actual fun u_uastrncpy(dst: Long, src: PCSTR, n: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_uastrncpy(dst, src, n)

public actual fun u_unescape(src: PCSTR, dest: Long, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_unescape(src, dest, destcapacity)

public actual fun u_unescapeAt(charat: UNESCAPE_CHAR_AT, offset: Long, length: Int, context: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_unescapeAt(charat.toLong(), offset, length, context)

public actual fun u_versionFromString(versionarray: Long, versionstring: PCSTR) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_versionFromString(versionarray, versionstring)
}

public actual fun u_versionFromUString(versionarray: Long, versionstring: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_versionFromUString(versionarray, versionstring)
}

public actual fun u_versionToString(versionarray: Long, versionstring: PCSTR) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_versionToString(versionarray, versionstring)
}

public actual fun u_vformatMessage(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_vformatMessage(locale, pattern, patternlength, result, resultlength, ap, status)

public actual fun u_vformatMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_vformatMessageWithError(locale, pattern, patternlength, result, resultlength, parseerror, ap, status)

public actual fun u_vparseMessage(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_vparseMessage(locale, pattern, patternlength, source, sourcelength, ap, status)
}

public actual fun u_vparseMessageWithError(locale: PCSTR, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_u_vparseMessageWithError(locale, pattern, patternlength, source, sourcelength, ap, parseerror, status)
}

public actual fun ubidi_close(pbidi: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_close(pbidi)
}

public actual fun ubidi_countParagraphs(pbidi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_countParagraphs(pbidi)

public actual fun ubidi_countRuns(pbidi: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_countRuns(pbidi, perrorcode)

public actual fun ubidi_getBaseDirection(text: Long, length: Int): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getBaseDirection(text, length)

public actual fun ubidi_getClassCallback(pbidi: Long, fn: Long, context: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getClassCallback(pbidi, fn, context)
}

public actual fun ubidi_getCustomizedClass(pbidi: Long, c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getCustomizedClass(pbidi, c)

public actual fun ubidi_getDirection(pbidi: Long): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getDirection(pbidi)

public actual fun ubidi_getLength(pbidi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLength(pbidi)

public actual fun ubidi_getLevelAt(pbidi: Long, charindex: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLevelAt(pbidi, charindex).toUByte()

public actual fun ubidi_getLevels(pbidi: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLevels(pbidi, perrorcode)

public actual fun ubidi_getLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLogicalIndex(pbidi, visualindex, perrorcode)

public actual fun ubidi_getLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLogicalMap(pbidi, indexmap, perrorcode)
}

public actual fun ubidi_getLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getLogicalRun(pbidi, logicalposition, plogicallimit, plevel)
}

public actual fun ubidi_getParaLevel(pbidi: Long): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getParaLevel(pbidi).toUByte()

public actual fun ubidi_getParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getParagraph(pbidi, charindex, pparastart, pparalimit, pparalevel, perrorcode)

public actual fun ubidi_getParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getParagraphByIndex(pbidi, paraindex, pparastart, pparalimit, pparalevel, perrorcode)
}

public actual fun ubidi_getProcessedLength(pbidi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getProcessedLength(pbidi)

public actual fun ubidi_getReorderingMode(pbidi: Long): UBiDiReorderingMode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getReorderingMode(pbidi)

public actual fun ubidi_getReorderingOptions(pbidi: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getReorderingOptions(pbidi).toUInt()

public actual fun ubidi_getResultLength(pbidi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getResultLength(pbidi)

public actual fun ubidi_getText(pbidi: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getText(pbidi)

public actual fun ubidi_getVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getVisualIndex(pbidi, logicalindex, perrorcode)

public actual fun ubidi_getVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getVisualMap(pbidi, indexmap, perrorcode)
}

public actual fun ubidi_getVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_getVisualRun(pbidi, runindex, plogicalstart, plength)

public actual fun ubidi_invertMap(srcmap: Long, destmap: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_invertMap(srcmap, destmap, length)
}

public actual fun ubidi_isInverse(pbidi: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_isInverse(pbidi)

public actual fun ubidi_isOrderParagraphsLTR(pbidi: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_isOrderParagraphsLTR(pbidi)

public actual fun ubidi_open(): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_open()

public actual fun ubidi_openSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_openSized(maxlength, maxruncount, perrorcode)

public actual fun ubidi_orderParagraphsLTR(pbidi: Long, orderparagraphsltr: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_orderParagraphsLTR(pbidi, orderparagraphsltr)
}

public actual fun ubidi_reorderLogical(levels: Long, length: Int, indexmap: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_reorderLogical(levels, length, indexmap)
}

public actual fun ubidi_reorderVisual(levels: Long, length: Int, indexmap: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_reorderVisual(levels, length, indexmap)
}

public actual fun ubidi_setClassCallback(pbidi: Long, newfn: UBiDiClassCallback, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setClassCallback(pbidi, newfn.toLong(), newcontext, oldfn, oldcontext, perrorcode)
}

public actual fun ubidi_setContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setContext(pbidi, prologue, prolength, epilogue, epilength, perrorcode)
}

public actual fun ubidi_setInverse(pbidi: Long, isinverse: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setInverse(pbidi, isinverse)
}

public actual fun ubidi_setLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setLine(pparabidi, start, limit, plinebidi, perrorcode)
}

public actual fun ubidi_setPara(pbidi: Long, text: Long, length: Int, paralevel: UByte, embeddinglevels: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setPara(pbidi, text, length, paralevel.toByte(), embeddinglevels, perrorcode)
}

public actual fun ubidi_setReorderingMode(pbidi: Long, reorderingmode: UBiDiReorderingMode) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setReorderingMode(pbidi, reorderingmode)
}

public actual fun ubidi_setReorderingOptions(pbidi: Long, reorderingoptions: UInt) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_setReorderingOptions(pbidi, reorderingoptions.toInt())
}

public actual fun ubidi_writeReordered(pbidi: Long, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_writeReordered(pbidi, dest, destsize, options.toShort(), perrorcode)

public actual fun ubidi_writeReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: UShort, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidi_writeReverse(src, srclength, dest, destsize, options.toShort(), perrorcode)

public actual fun ubiditransform_close(pbiditransform: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransform_close(pbiditransform)
}

public actual fun ubiditransform_open(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransform_open(perrorcode)

public actual fun ubiditransform_transform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransform_transform(pbiditransform, src, srclength, dest, destsize, inparalevel.toByte(), inorder, outparalevel.toByte(), outorder, domirroring, shapingoptions.toInt(), perrorcode).toUInt()

public actual fun ublock_getCode(c: Int): UBlockCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ublock_getCode(c)

public actual fun ubrk_close(bi: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_close(bi)
}

public actual fun ubrk_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_countAvailable()

public actual fun ubrk_current(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_current(bi)

public actual fun ubrk_first(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_first(bi)

public actual fun ubrk_following(bi: Long, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_following(bi, offset)

public actual fun ubrk_getAvailable(index: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_getAvailable(index)

public actual fun ubrk_getBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_getBinaryRules(bi, binaryrules, rulescapacity, status)

public actual fun ubrk_getLocaleByType(bi: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_getLocaleByType(bi, type, status)

public actual fun ubrk_getRuleStatus(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_getRuleStatus(bi)

public actual fun ubrk_getRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_getRuleStatusVec(bi, fillinvec, capacity, status)

public actual fun ubrk_isBoundary(bi: Long, offset: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_isBoundary(bi, offset)

public actual fun ubrk_last(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_last(bi)

public actual fun ubrk_next(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_next(bi)

public actual fun ubrk_open(type: UBreakIteratorType, locale: PCSTR, text: Long, textlength: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_open(type, locale, text, textlength, status)

public actual fun ubrk_openBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_openBinaryRules(binaryrules, ruleslength, text, textlength, status)

public actual fun ubrk_openRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_openRules(rules, ruleslength, text, textlength, parseerr, status)

public actual fun ubrk_preceding(bi: Long, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_preceding(bi, offset)

public actual fun ubrk_previous(bi: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_previous(bi)

public actual fun ubrk_refreshUText(bi: Long, text: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_refreshUText(bi, text, status)
}

public actual fun ubrk_safeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_safeClone(bi, stackbuffer, pbuffersize, status)

public actual fun ubrk_setText(bi: Long, text: Long, textlength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_setText(bi, text, textlength, status)
}

public actual fun ubrk_setUText(bi: Long, text: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrk_setUText(bi, text, status)
}

public actual fun ucal_add(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_add(cal, field, amount, status)
}

public actual fun ucal_clear(calendar: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_clear(calendar)
}

public actual fun ucal_clearField(cal: Long, field: UCalendarDateFields) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_clearField(cal, field)
}

public actual fun ucal_clone(cal: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_clone(cal, status)

public actual fun ucal_close(cal: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_close(cal)
}

public actual fun ucal_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_countAvailable()

public actual fun ucal_equivalentTo(cal1: Long, cal2: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_equivalentTo(cal1, cal2)

public actual fun ucal_get(cal: Long, field: UCalendarDateFields, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_get(cal, field, status)

public actual fun ucal_getAttribute(cal: Long, attr: UCalendarAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getAttribute(cal, attr)

public actual fun ucal_getAvailable(localeindex: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getAvailable(localeindex)

public actual fun ucal_getCanonicalTimeZoneID(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getCanonicalTimeZoneID(id, len, result, resultcapacity, issystemid, status)

public actual fun ucal_getDSTSavings(zoneid: Long, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getDSTSavings(zoneid, ec)

public actual fun ucal_getDayOfWeekType(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): UCalendarWeekdayType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getDayOfWeekType(cal, dayofweek, status)

public actual fun ucal_getDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getDefaultTimeZone(result, resultcapacity, ec)

public actual fun ucal_getFieldDifference(cal: Long, target: Double, field: UCalendarDateFields, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getFieldDifference(cal, target, field, status)

public actual fun ucal_getGregorianChange(cal: Long, perrorcode: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getGregorianChange(cal, perrorcode)

public actual fun ucal_getHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getHostTimeZone(result, resultcapacity, ec)

public actual fun ucal_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getKeywordValuesForLocale(key, locale, commonlyused, status)

public actual fun ucal_getLimit(cal: Long, field: UCalendarDateFields, type: UCalendarLimitType, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getLimit(cal, field, type, status)

public actual fun ucal_getLocaleByType(cal: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getLocaleByType(cal, type, status)

public actual fun ucal_getMillis(cal: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getMillis(cal, status)

public actual fun ucal_getNow(): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getNow()

public actual fun ucal_getTZDataVersion(status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getTZDataVersion(status)

public actual fun ucal_getTimeZoneDisplayName(cal: Long, type: UCalendarDisplayNameType, locale: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getTimeZoneDisplayName(cal, type, locale, result, resultlength, status)

public actual fun ucal_getTimeZoneID(cal: Long, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getTimeZoneID(cal, result, resultlength, status)

public actual fun ucal_getTimeZoneIDForWindowsID(winid: Long, len: Int, region: PCSTR, id: Long, idcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getTimeZoneIDForWindowsID(winid, len, region, id, idcapacity, status)

public actual fun ucal_getTimeZoneTransitionDate(cal: Long, type: UTimeZoneTransitionType, transition: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getTimeZoneTransitionDate(cal, type, transition, status)

public actual fun ucal_getType(cal: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getType(cal, status)

public actual fun ucal_getWeekendTransition(cal: Long, dayofweek: UCalendarDaysOfWeek, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getWeekendTransition(cal, dayofweek, status)

public actual fun ucal_getWindowsTimeZoneID(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_getWindowsTimeZoneID(id, len, winid, winidcapacity, status)

public actual fun ucal_inDaylightTime(cal: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_inDaylightTime(cal, status)

public actual fun ucal_isSet(cal: Long, field: UCalendarDateFields): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_isSet(cal, field)

public actual fun ucal_isWeekend(cal: Long, date: Double, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_isWeekend(cal, date, status)

public actual fun ucal_open(zoneid: Long, len: Int, locale: PCSTR, type: UCalendarType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_open(zoneid, len, locale, type, status)

public actual fun ucal_openCountryTimeZones(country: PCSTR, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_openCountryTimeZones(country, ec)

public actual fun ucal_openTimeZoneIDEnumeration(zonetype: USystemTimeZoneType, region: PCSTR, rawoffset: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_openTimeZoneIDEnumeration(zonetype, region, rawoffset, ec)

public actual fun ucal_openTimeZones(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_openTimeZones(ec)

public actual fun ucal_roll(cal: Long, field: UCalendarDateFields, amount: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_roll(cal, field, amount, status)
}

public actual fun ucal_set(cal: Long, field: UCalendarDateFields, value: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_set(cal, field, value)
}

public actual fun ucal_setAttribute(cal: Long, attr: UCalendarAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setAttribute(cal, attr, newvalue)
}

public actual fun ucal_setDate(cal: Long, year: Int, month: Int, date: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setDate(cal, year, month, date, status)
}

public actual fun ucal_setDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setDateTime(cal, year, month, date, hour, minute, second, status)
}

public actual fun ucal_setDefaultTimeZone(zoneid: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setDefaultTimeZone(zoneid, ec)
}

public actual fun ucal_setGregorianChange(cal: Long, date: Double, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setGregorianChange(cal, date, perrorcode)
}

public actual fun ucal_setMillis(cal: Long, datetime: Double, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setMillis(cal, datetime, status)
}

public actual fun ucal_setTimeZone(cal: Long, zoneid: Long, len: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucal_setTimeZone(cal, zoneid, len, status)
}

public actual fun ucasemap_close(csm: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_close(csm)
}

public actual fun ucasemap_getBreakIterator(csm: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_getBreakIterator(csm)

public actual fun ucasemap_getLocale(csm: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_getLocale(csm)

public actual fun ucasemap_getOptions(csm: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_getOptions(csm).toUInt()

public actual fun ucasemap_open(locale: PCSTR, options: UInt, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_open(locale, options.toInt(), perrorcode)

public actual fun ucasemap_setBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_setBreakIterator(csm, itertoadopt, perrorcode)
}

public actual fun ucasemap_setLocale(csm: Long, locale: PCSTR, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_setLocale(csm, locale, perrorcode)
}

public actual fun ucasemap_setOptions(csm: Long, options: UInt, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_setOptions(csm, options.toInt(), perrorcode)
}

public actual fun ucasemap_toTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_toTitle(csm, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucasemap_utf8FoldCase(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_utf8FoldCase(csm, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucasemap_utf8ToLower(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_utf8ToLower(csm, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucasemap_utf8ToTitle(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_utf8ToTitle(csm, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucasemap_utf8ToUpper(csm: Long, dest: PCSTR, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemap_utf8ToUpper(csm, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucfpos_close(ucfpos: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_close(ucfpos)
}

public actual fun ucfpos_constrainCategory(ucfpos: Long, category: Int, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_constrainCategory(ucfpos, category, ec)
}

public actual fun ucfpos_constrainField(ucfpos: Long, category: Int, field: Int, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_constrainField(ucfpos, category, field, ec)
}

public actual fun ucfpos_getCategory(ucfpos: Long, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_getCategory(ucfpos, ec)

public actual fun ucfpos_getField(ucfpos: Long, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_getField(ucfpos, ec)

public actual fun ucfpos_getIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_getIndexes(ucfpos, pstart, plimit, ec)
}

public actual fun ucfpos_getInt64IterationContext(ucfpos: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_getInt64IterationContext(ucfpos, ec)

public actual fun ucfpos_matchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_matchesField(ucfpos, category, field, ec)

public actual fun ucfpos_open(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_open(ec)

public actual fun ucfpos_reset(ucfpos: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_reset(ucfpos, ec)
}

public actual fun ucfpos_setInt64IterationContext(ucfpos: Long, context: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_setInt64IterationContext(ucfpos, context, ec)
}

public actual fun ucfpos_setState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfpos_setState(ucfpos, category, field, start, limit, ec)
}

public actual fun ucnv_cbFromUWriteBytes(args: Long, source: PCSTR, length: Int, offsetindex: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_cbFromUWriteBytes(args, source, length, offsetindex, err)
}

public actual fun ucnv_cbFromUWriteSub(args: Long, offsetindex: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_cbFromUWriteSub(args, offsetindex, err)
}

public actual fun ucnv_cbFromUWriteUChars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_cbFromUWriteUChars(args, source, sourcelimit, offsetindex, err)
}

public actual fun ucnv_cbToUWriteSub(args: Long, offsetindex: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_cbToUWriteSub(args, offsetindex, err)
}

public actual fun ucnv_cbToUWriteUChars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_cbToUWriteUChars(args, source, length, offsetindex, err)
}

public actual fun ucnv_close(converter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_close(converter)
}

public actual fun ucnv_compareNames(name1: PCSTR, name2: PCSTR): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_compareNames(name1, name2)

public actual fun ucnv_convert(toconvertername: PCSTR, fromconvertername: PCSTR, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_convert(toconvertername, fromconvertername, target, targetcapacity, source, sourcelength, perrorcode)

public actual fun ucnv_convertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: PCSTR, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_convertEx(targetcnv, sourcecnv, target, targetlimit, source, sourcelimit, pivotstart, pivotsource, pivottarget, pivotlimit, reset, flush, perrorcode)
}

public actual fun ucnv_countAliases(alias: PCSTR, perrorcode: Long): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_countAliases(alias, perrorcode).toUShort()

public actual fun ucnv_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_countAvailable()

public actual fun ucnv_countStandards(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_countStandards().toUShort()

public actual fun ucnv_detectUnicodeSignature(source: PCSTR, sourcelength: Int, signaturelength: Long, perrorcode: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_detectUnicodeSignature(source, sourcelength, signaturelength, perrorcode)

public actual fun ucnv_fixFileSeparator(cnv: Long, source: Long, sourcelen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_fixFileSeparator(cnv, source, sourcelen)
}

public actual fun ucnv_flushCache(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_flushCache()

public actual fun ucnv_fromAlgorithmic(cnv: Long, algorithmictype: UConverterType, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_fromAlgorithmic(cnv, algorithmictype, target, targetcapacity, source, sourcelength, perrorcode)

public actual fun ucnv_fromUChars(cnv: Long, dest: PCSTR, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_fromUChars(cnv, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucnv_fromUCountPending(cnv: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_fromUCountPending(cnv, status)

public actual fun ucnv_fromUnicode(converter: Long, target: Long, targetlimit: PCSTR, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_fromUnicode(converter, target, targetlimit, source, sourcelimit, offsets, flush, err)
}

public actual fun ucnv_getAlias(alias: PCSTR, n: UShort, perrorcode: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getAlias(alias, n.toShort(), perrorcode)

public actual fun ucnv_getAliases(alias: PCSTR, aliases: Long, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getAliases(alias, aliases, perrorcode)
}

public actual fun ucnv_getAvailableName(n: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getAvailableName(n)

public actual fun ucnv_getCCSID(converter: Long, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getCCSID(converter, err)

public actual fun ucnv_getCanonicalName(alias: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getCanonicalName(alias, standard, perrorcode)

public actual fun ucnv_getDefaultName(): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getDefaultName()

public actual fun ucnv_getDisplayName(converter: Long, displaylocale: PCSTR, displayname: Long, displaynamecapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getDisplayName(converter, displaylocale, displayname, displaynamecapacity, err)

public actual fun ucnv_getFromUCallBack(converter: Long, action: Long, context: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getFromUCallBack(converter, action, context)
}

public actual fun ucnv_getInvalidChars(converter: Long, errbytes: PCSTR, len: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getInvalidChars(converter, errbytes, len, err)
}

public actual fun ucnv_getInvalidUChars(converter: Long, erruchars: Long, len: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getInvalidUChars(converter, erruchars, len, err)
}

public actual fun ucnv_getMaxCharSize(converter: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getMaxCharSize(converter)

public actual fun ucnv_getMinCharSize(converter: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getMinCharSize(converter)

public actual fun ucnv_getName(converter: Long, err: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getName(converter, err)

public actual fun ucnv_getNextUChar(converter: Long, source: Long, sourcelimit: PCSTR, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getNextUChar(converter, source, sourcelimit, err)

public actual fun ucnv_getPlatform(converter: Long, err: Long): UConverterPlatform =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getPlatform(converter, err)

public actual fun ucnv_getStandard(n: UShort, perrorcode: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getStandard(n.toShort(), perrorcode)

public actual fun ucnv_getStandardName(name: PCSTR, standard: PCSTR, perrorcode: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getStandardName(name, standard, perrorcode)

public actual fun ucnv_getStarters(converter: Long, starters: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getStarters(converter, starters, err)
}

public actual fun ucnv_getSubstChars(converter: Long, subchars: PCSTR, len: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getSubstChars(converter, subchars, len, err)
}

public actual fun ucnv_getToUCallBack(converter: Long, action: Long, context: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getToUCallBack(converter, action, context)
}

public actual fun ucnv_getType(converter: Long): UConverterType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getType(converter)

public actual fun ucnv_getUnicodeSet(cnv: Long, setfillin: Long, whichset: UConverterUnicodeSet, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_getUnicodeSet(cnv, setfillin, whichset, perrorcode)
}

public actual fun ucnv_isAmbiguous(cnv: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_isAmbiguous(cnv)

public actual fun ucnv_isFixedWidth(cnv: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_isFixedWidth(cnv, status)

public actual fun ucnv_open(convertername: PCSTR, err: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_open(convertername, err)

public actual fun ucnv_openAllNames(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_openAllNames(perrorcode)

public actual fun ucnv_openCCSID(codepage: Int, platform: UConverterPlatform, err: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_openCCSID(codepage, platform, err)

public actual fun ucnv_openPackage(packagename: PCSTR, convertername: PCSTR, err: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_openPackage(packagename, convertername, err)

public actual fun ucnv_openStandardNames(convname: PCSTR, standard: PCSTR, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_openStandardNames(convname, standard, perrorcode)

public actual fun ucnv_openU(name: Long, err: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_openU(name, err)

public actual fun ucnv_reset(converter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_reset(converter)
}

public actual fun ucnv_resetFromUnicode(converter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_resetFromUnicode(converter)
}

public actual fun ucnv_resetToUnicode(converter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_resetToUnicode(converter)
}

public actual fun ucnv_safeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_safeClone(cnv, stackbuffer, pbuffersize, status)

public actual fun ucnv_setDefaultName(name: PCSTR) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setDefaultName(name)
}

public actual fun ucnv_setFallback(cnv: Long, usesfallback: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setFallback(cnv, usesfallback)
}

public actual fun ucnv_setFromUCallBack(converter: Long, newaction: UConverterFromUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setFromUCallBack(converter, newaction.toLong(), newcontext, oldaction, oldcontext, err)
}

public actual fun ucnv_setSubstChars(converter: Long, subchars: PCSTR, len: Byte, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setSubstChars(converter, subchars, len, err)
}

public actual fun ucnv_setSubstString(cnv: Long, s: Long, length: Int, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setSubstString(cnv, s, length, err)
}

public actual fun ucnv_setToUCallBack(converter: Long, newaction: UConverterToUCallback, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_setToUCallBack(converter, newaction.toLong(), newcontext, oldaction, oldcontext, err)
}

public actual fun ucnv_toAlgorithmic(algorithmictype: UConverterType, cnv: Long, target: PCSTR, targetcapacity: Int, source: PCSTR, sourcelength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_toAlgorithmic(algorithmictype, cnv, target, targetcapacity, source, sourcelength, perrorcode)

public actual fun ucnv_toUChars(cnv: Long, dest: Long, destcapacity: Int, src: PCSTR, srclength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_toUChars(cnv, dest, destcapacity, src, srclength, perrorcode)

public actual fun ucnv_toUCountPending(cnv: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_toUCountPending(cnv, status)

public actual fun ucnv_toUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: PCSTR, offsets: Long, flush: Byte, err: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_toUnicode(converter, target, targetlimit, source, sourcelimit, offsets, flush, err)
}

public actual fun ucnv_usesFallback(cnv: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnv_usesFallback(cnv)

public actual fun ucnvsel_close(sel: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_close(sel)
}

public actual fun ucnvsel_open(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: UConverterUnicodeSet, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_open(converterlist, converterlistsize, excludedcodepoints, whichset, status)

public actual fun ucnvsel_openFromSerialized(buffer: Long, length: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_openFromSerialized(buffer, length, status)

public actual fun ucnvsel_selectForString(sel: Long, s: Long, length: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_selectForString(sel, s, length, status)

public actual fun ucnvsel_selectForUTF8(sel: Long, s: PCSTR, length: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_selectForUTF8(sel, s, length, status)

public actual fun ucnvsel_serialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvsel_serialize(sel, buffer, buffercapacity, status)

public actual fun ucol_cloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_cloneBinary(coll, buffer, capacity, status)

public actual fun ucol_close(coll: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_close(coll)
}

public actual fun ucol_closeElements(elems: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_closeElements(elems)
}

public actual fun ucol_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_countAvailable()

public actual fun ucol_equal(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_equal(coll, source, sourcelength, target, targetlength)

public actual fun ucol_getAttribute(coll: Long, attr: UColAttribute, status: Long): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getAttribute(coll, attr, status)

public actual fun ucol_getAvailable(localeindex: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getAvailable(localeindex)

public actual fun ucol_getBound(source: Long, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getBound(source, sourcelength, boundtype, nooflevels.toInt(), result, resultlength, status)

public actual fun ucol_getContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getContractionsAndExpansions(coll, contractions, expansions, addprefixes, status)
}

public actual fun ucol_getDisplayName(objloc: PCSTR, disploc: PCSTR, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getDisplayName(objloc, disploc, result, resultlength, status)

public actual fun ucol_getEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getEquivalentReorderCodes(reordercode, dest, destcapacity, perrorcode)

public actual fun ucol_getFunctionalEquivalent(result: PCSTR, resultcapacity: Int, keyword: PCSTR, locale: PCSTR, isavailable: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getFunctionalEquivalent(result, resultcapacity, keyword, locale, isavailable, status)

public actual fun ucol_getKeywordValues(keyword: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getKeywordValues(keyword, status)

public actual fun ucol_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getKeywordValuesForLocale(key, locale, commonlyused, status)

public actual fun ucol_getKeywords(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getKeywords(status)

public actual fun ucol_getLocaleByType(coll: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getLocaleByType(coll, type, status)

public actual fun ucol_getMaxExpansion(elems: Long, order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getMaxExpansion(elems, order)

public actual fun ucol_getMaxVariable(coll: Long): UColReorderCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getMaxVariable(coll)

public actual fun ucol_getOffset(elems: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getOffset(elems)

public actual fun ucol_getReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getReorderCodes(coll, dest, destcapacity, perrorcode)

public actual fun ucol_getRules(coll: Long, length: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getRules(coll, length)

public actual fun ucol_getRulesEx(coll: Long, delta: UColRuleOption, buffer: Long, bufferlen: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getRulesEx(coll, delta, buffer, bufferlen)

public actual fun ucol_getSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getSortKey(coll, source, sourcelength, result, resultlength)

public actual fun ucol_getStrength(coll: Long): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getStrength(coll)

public actual fun ucol_getTailoredSet(coll: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getTailoredSet(coll, status)

public actual fun ucol_getUCAVersion(coll: Long, info: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getUCAVersion(coll, info)
}

public actual fun ucol_getVariableTop(coll: Long, status: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getVariableTop(coll, status).toUInt()

public actual fun ucol_getVersion(coll: Long, info: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_getVersion(coll, info)
}

public actual fun ucol_greater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_greater(coll, source, sourcelength, target, targetlength)

public actual fun ucol_greaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_greaterOrEqual(coll, source, sourcelength, target, targetlength)

public actual fun ucol_keyHashCode(key: Long, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_keyHashCode(key, length)

public actual fun ucol_mergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_mergeSortkeys(src1, src1length, src2, src2length, dest, destcapacity)

public actual fun ucol_next(elems: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_next(elems, status)

public actual fun ucol_nextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_nextSortKeyPart(coll, iter, state, dest, count, status)

public actual fun ucol_open(loc: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_open(loc, status)

public actual fun ucol_openAvailableLocales(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_openAvailableLocales(status)

public actual fun ucol_openBinary(bin: Long, length: Int, base: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_openBinary(bin, length, base, status)

public actual fun ucol_openElements(coll: Long, text: Long, textlength: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_openElements(coll, text, textlength, status)

public actual fun ucol_openRules(rules: Long, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_openRules(rules, ruleslength, normalizationmode, strength, parseerror, status)

public actual fun ucol_previous(elems: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_previous(elems, status)

public actual fun ucol_primaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_primaryOrder(order)

public actual fun ucol_reset(elems: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_reset(elems)
}

public actual fun ucol_safeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_safeClone(coll, stackbuffer, pbuffersize, status)

public actual fun ucol_secondaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_secondaryOrder(order)

public actual fun ucol_setAttribute(coll: Long, attr: UColAttribute, value: UColAttributeValue, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setAttribute(coll, attr, value, status)
}

public actual fun ucol_setMaxVariable(coll: Long, group: UColReorderCode, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setMaxVariable(coll, group, perrorcode)
}

public actual fun ucol_setOffset(elems: Long, offset: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setOffset(elems, offset, status)
}

public actual fun ucol_setReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setReorderCodes(coll, reordercodes, reordercodeslength, perrorcode)
}

public actual fun ucol_setStrength(coll: Long, strength: UColAttributeValue) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setStrength(coll, strength)
}

public actual fun ucol_setText(elems: Long, text: Long, textlength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_setText(elems, text, textlength, status)
}

public actual fun ucol_strcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_strcoll(coll, source, sourcelength, target, targetlength)

public actual fun ucol_strcollIter(coll: Long, siter: Long, titer: Long, status: Long): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_strcollIter(coll, siter, titer, status)

public actual fun ucol_strcollUTF8(coll: Long, source: PCSTR, sourcelength: Int, target: PCSTR, targetlength: Int, status: Long): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_strcollUTF8(coll, source, sourcelength, target, targetlength, status)

public actual fun ucol_tertiaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucol_tertiaryOrder(order)

public actual fun ucpmap_get(map: Long, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucpmap_get(map, c).toUInt()

public actual fun ucpmap_getRange(map: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucpmap_getRange(map, start, option, surrogatevalue.toInt(), filter, context, pvalue)

public actual fun ucptrie_close(trie: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_close(trie)
}

public actual fun ucptrie_get(trie: Long, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_get(trie, c).toUInt()

public actual fun ucptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_getRange(trie, start, option, surrogatevalue.toInt(), filter, context, pvalue)

public actual fun ucptrie_getType(trie: Long): UCPTrieType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_getType(trie)

public actual fun ucptrie_getValueWidth(trie: Long): UCPTrieValueWidth =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_getValueWidth(trie)

public actual fun ucptrie_internalSmallIndex(trie: Long, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_internalSmallIndex(trie, c)

public actual fun ucptrie_internalSmallU8Index(trie: Long, lt1: Int, t2: UByte, t3: UByte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_internalSmallU8Index(trie, lt1, t2.toByte(), t3.toByte())

public actual fun ucptrie_internalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_internalU8PrevIndex(trie, c, start, src)

public actual fun ucptrie_openFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_openFromBinary(type, valuewidth, data, length, pactuallength, perrorcode)

public actual fun ucptrie_toBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrie_toBinary(trie, data, capacity, perrorcode)

public actual fun ucsdet_close(ucsd: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_close(ucsd)
}

public actual fun ucsdet_detect(ucsd: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_detect(ucsd, status)

public actual fun ucsdet_detectAll(ucsd: Long, matchesfound: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_detectAll(ucsd, matchesfound, status)

public actual fun ucsdet_enableInputFilter(ucsd: Long, filter: Byte): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_enableInputFilter(ucsd, filter)

public actual fun ucsdet_getAllDetectableCharsets(ucsd: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_getAllDetectableCharsets(ucsd, status)

public actual fun ucsdet_getConfidence(ucsm: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_getConfidence(ucsm, status)

public actual fun ucsdet_getLanguage(ucsm: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_getLanguage(ucsm, status)

public actual fun ucsdet_getName(ucsm: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_getName(ucsm, status)

public actual fun ucsdet_getUChars(ucsm: Long, buf: Long, cap: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_getUChars(ucsm, buf, cap, status)

public actual fun ucsdet_isInputFilterEnabled(ucsd: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_isInputFilterEnabled(ucsd)

public actual fun ucsdet_open(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_open(status)

public actual fun ucsdet_setDeclaredEncoding(ucsd: Long, encoding: PCSTR, length: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_setDeclaredEncoding(ucsd, encoding, length, status)
}

public actual fun ucsdet_setText(ucsd: Long, textin: PCSTR, len: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdet_setText(ucsd, textin, len, status)
}

public actual fun ucurr_countCurrencies(locale: PCSTR, date: Double, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_countCurrencies(locale, date, ec)

public actual fun ucurr_forLocale(locale: PCSTR, buff: Long, buffcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_forLocale(locale, buff, buffcapacity, ec)

public actual fun ucurr_forLocaleAndDate(locale: PCSTR, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_forLocaleAndDate(locale, date, index, buff, buffcapacity, ec)

public actual fun ucurr_getDefaultFractionDigits(currency: Long, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigits(currency, ec)

public actual fun ucurr_getDefaultFractionDigitsForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigitsForUsage(currency, usage, ec)

public actual fun ucurr_getKeywordValuesForLocale(key: PCSTR, locale: PCSTR, commonlyused: Byte, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getKeywordValuesForLocale(key, locale, commonlyused, status)

public actual fun ucurr_getName(currency: Long, locale: PCSTR, namestyle: UCurrNameStyle, ischoiceformat: Long, len: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getName(currency, locale, namestyle, ischoiceformat, len, ec)

public actual fun ucurr_getNumericCode(currency: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getNumericCode(currency)

public actual fun ucurr_getPluralName(currency: Long, locale: PCSTR, ischoiceformat: Long, pluralcount: PCSTR, len: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getPluralName(currency, locale, ischoiceformat, pluralcount, len, ec)

public actual fun ucurr_getRoundingIncrement(currency: Long, ec: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getRoundingIncrement(currency, ec)

public actual fun ucurr_getRoundingIncrementForUsage(currency: Long, usage: UCurrencyUsage, ec: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_getRoundingIncrementForUsage(currency, usage, ec)

public actual fun ucurr_isAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_isAvailable(isocode, from, to, errorcode)

public actual fun ucurr_openISOCurrencies(currtype: UInt, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_openISOCurrencies(currtype.toInt(), perrorcode)

public actual fun ucurr_register(isocode: Long, locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_register(isocode, locale, status)

public actual fun ucurr_unregister(key: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurr_unregister(key, status)

public actual fun udat_adoptNumberFormat(fmt: Long, numberformattoadopt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_adoptNumberFormat(fmt, numberformattoadopt)
}

public actual fun udat_adoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_adoptNumberFormatForFields(fmt, fields, numberformattoset, status)
}

public actual fun udat_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_applyPattern(format, localized, pattern, patternlength)
}

public actual fun udat_clone(fmt: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_clone(fmt, status)

public actual fun udat_close(format: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_close(format)
}

public actual fun udat_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_countAvailable()

public actual fun udat_countSymbols(fmt: Long, type: UDateFormatSymbolType): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_countSymbols(fmt, type)

public actual fun udat_format(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_format(format, datetoformat, result, resultlength, position, status)

public actual fun udat_formatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_formatCalendar(format, calendar, result, capacity, position, status)

public actual fun udat_formatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_formatCalendarForFields(format, calendar, result, capacity, fpositer, status)

public actual fun udat_formatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_formatForFields(format, datetoformat, result, resultlength, fpositer, status)

public actual fun udat_get2DigitYearStart(fmt: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_get2DigitYearStart(fmt, status)

public actual fun udat_getAvailable(localeindex: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getAvailable(localeindex)

public actual fun udat_getBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getBooleanAttribute(fmt, attr, status)

public actual fun udat_getCalendar(fmt: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getCalendar(fmt)

public actual fun udat_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getContext(fmt, type, status)

public actual fun udat_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getLocaleByType(fmt, type, status)

public actual fun udat_getNumberFormat(fmt: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getNumberFormat(fmt)

public actual fun udat_getNumberFormatForField(fmt: Long, field: UShort): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getNumberFormatForField(fmt, field.toShort())

public actual fun udat_getSymbols(fmt: Long, type: UDateFormatSymbolType, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_getSymbols(fmt, type, symbolindex, result, resultlength, status)

public actual fun udat_isLenient(fmt: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_isLenient(fmt)

public actual fun udat_open(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: PCSTR, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_open(timestyle, datestyle, locale, tzid, tzidlength, pattern, patternlength, status)

public actual fun udat_parse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_parse(format, text, textlength, parsepos, status)

public actual fun udat_parseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_parseCalendar(format, calendar, text, textlength, parsepos, status)
}

public actual fun udat_set2DigitYearStart(fmt: Long, d: Double, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_set2DigitYearStart(fmt, d, status)
}

public actual fun udat_setBooleanAttribute(fmt: Long, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setBooleanAttribute(fmt, attr, newvalue, status)
}

public actual fun udat_setCalendar(fmt: Long, calendartoset: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setCalendar(fmt, calendartoset)
}

public actual fun udat_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setContext(fmt, value, status)
}

public actual fun udat_setLenient(fmt: Long, islenient: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setLenient(fmt, islenient)
}

public actual fun udat_setNumberFormat(fmt: Long, numberformattoset: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setNumberFormat(fmt, numberformattoset)
}

public actual fun udat_setSymbols(format: Long, type: UDateFormatSymbolType, symbolindex: Int, value: Long, valuelength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_setSymbols(format, type, symbolindex, value, valuelength, status)
}

public actual fun udat_toCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_toCalendarDateField(field)

public actual fun udat_toPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udat_toPattern(fmt, localized, result, resultlength, status)

public actual fun udatpg_addPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): UDateTimePatternConflict =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_addPattern(dtpg, pattern, patternlength, override, conflictingpattern, capacity, plength, perrorcode)

public actual fun udatpg_clone(dtpg: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_clone(dtpg, perrorcode)

public actual fun udatpg_close(dtpg: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_close(dtpg)
}

public actual fun udatpg_getAppendItemFormat(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getAppendItemFormat(dtpg, field, plength)

public actual fun udatpg_getAppendItemName(dtpg: Long, field: UDateTimePatternField, plength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getAppendItemName(dtpg, field, plength)

public actual fun udatpg_getBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getBaseSkeleton(unuseddtpg, pattern, length, baseskeleton, capacity, perrorcode)

public actual fun udatpg_getBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getBestPattern(dtpg, skeleton, length, bestpattern, capacity, perrorcode)

public actual fun udatpg_getBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: UDateTimePatternMatchOptions, bestpattern: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getBestPatternWithOptions(dtpg, skeleton, length, options, bestpattern, capacity, perrorcode)

public actual fun udatpg_getDateTimeFormat(dtpg: Long, plength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getDateTimeFormat(dtpg, plength)

public actual fun udatpg_getDecimal(dtpg: Long, plength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getDecimal(dtpg, plength)

public actual fun udatpg_getFieldDisplayName(dtpg: Long, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getFieldDisplayName(dtpg, field, width, fieldname, capacity, perrorcode)

public actual fun udatpg_getPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getPatternForSkeleton(dtpg, skeleton, skeletonlength, plength)

public actual fun udatpg_getSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_getSkeleton(unuseddtpg, pattern, length, skeleton, capacity, perrorcode)

public actual fun udatpg_open(locale: PCSTR, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_open(locale, perrorcode)

public actual fun udatpg_openBaseSkeletons(dtpg: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_openBaseSkeletons(dtpg, perrorcode)

public actual fun udatpg_openEmpty(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_openEmpty(perrorcode)

public actual fun udatpg_openSkeletons(dtpg: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_openSkeletons(dtpg, perrorcode)

public actual fun udatpg_replaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_replaceFieldTypes(dtpg, pattern, patternlength, skeleton, skeletonlength, dest, destcapacity, perrorcode)

public actual fun udatpg_replaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_replaceFieldTypesWithOptions(dtpg, pattern, patternlength, skeleton, skeletonlength, options, dest, destcapacity, perrorcode)

public actual fun udatpg_setAppendItemFormat(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_setAppendItemFormat(dtpg, field, value, length)
}

public actual fun udatpg_setAppendItemName(dtpg: Long, field: UDateTimePatternField, value: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_setAppendItemName(dtpg, field, value, length)
}

public actual fun udatpg_setDateTimeFormat(dtpg: Long, dtformat: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_setDateTimeFormat(dtpg, dtformat, length)
}

public actual fun udatpg_setDecimal(dtpg: Long, decimal: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpg_setDecimal(dtpg, decimal, length)
}

public actual fun udtitvfmt_close(formatter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_close(formatter)
}

public actual fun udtitvfmt_closeResult(uresult: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_closeResult(uresult)
}

public actual fun udtitvfmt_format(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_format(formatter, fromdate, todate, result, resultcapacity, position, status)

public actual fun udtitvfmt_open(locale: PCSTR, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_open(locale, skeleton, skeletonlength, tzid, tzidlength, status)

public actual fun udtitvfmt_openResult(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_openResult(ec)

public actual fun udtitvfmt_resultAsValue(uresult: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmt_resultAsValue(uresult, ec)

public actual fun uenum_close(en: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_close(en)
}

public actual fun uenum_count(en: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_count(en, status)

public actual fun uenum_next(en: Long, resultlength: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_next(en, resultlength, status)

public actual fun uenum_openCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_openCharStringsEnumeration(strings, count, ec)

public actual fun uenum_openUCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_openUCharStringsEnumeration(strings, count, ec)

public actual fun uenum_reset(en: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_reset(en, status)
}

public actual fun uenum_unext(en: Long, resultlength: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenum_unext(en, resultlength, status)

public actual fun ufieldpositer_close(fpositer: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositer_close(fpositer)
}

public actual fun ufieldpositer_next(fpositer: Long, beginindex: Long, endindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositer_next(fpositer, beginindex, endindex)

public actual fun ufieldpositer_open(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositer_open(status)

public actual fun ufmt_close(fmt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_close(fmt)
}

public actual fun ufmt_getArrayItemByIndex(fmt: Long, n: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getArrayItemByIndex(fmt, n, status)

public actual fun ufmt_getArrayLength(fmt: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getArrayLength(fmt, status)

public actual fun ufmt_getDate(fmt: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getDate(fmt, status)

public actual fun ufmt_getDecNumChars(fmt: Long, len: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getDecNumChars(fmt, len, status)

public actual fun ufmt_getDouble(fmt: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getDouble(fmt, status)

public actual fun ufmt_getInt64(fmt: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getInt64(fmt, status)

public actual fun ufmt_getLong(fmt: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getLong(fmt, status)

public actual fun ufmt_getObject(fmt: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getObject(fmt, status)

public actual fun ufmt_getType(fmt: Long, status: Long): UFormattableType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getType(fmt, status)

public actual fun ufmt_getUChars(fmt: Long, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_getUChars(fmt, len, status)

public actual fun ufmt_isNumeric(fmt: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_isNumeric(fmt)

public actual fun ufmt_open(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmt_open(status)

public actual fun ufmtval_getString(ufmtval: Long, plength: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtval_getString(ufmtval, plength, ec)

public actual fun ufmtval_nextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtval_nextPosition(ufmtval, ucfpos, ec)

public actual fun ugender_getInstance(locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ugender_getInstance(locale, status)

public actual fun ugender_getListGender(genderinfo: Long, genders: Long, size: Int, status: Long): UGender =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ugender_getListGender(genderinfo, genders, size, status)

public actual fun uidna_close(idna: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_close(idna)
}

public actual fun uidna_labelToASCII(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_labelToASCII(idna, label, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_labelToASCII_UTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_labelToASCII_UTF8(idna, label, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_labelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_labelToUnicode(idna, label, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_labelToUnicodeUTF8(idna: Long, label: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_labelToUnicodeUTF8(idna, label, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_nameToASCII(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_nameToASCII(idna, name, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_nameToASCII_UTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_nameToASCII_UTF8(idna, name, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_nameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_nameToUnicode(idna, name, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_nameToUnicodeUTF8(idna: Long, name: PCSTR, length: Int, dest: PCSTR, capacity: Int, pinfo: Long, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_nameToUnicodeUTF8(idna, name, length, dest, capacity, pinfo, perrorcode)

public actual fun uidna_openUTS46(options: UInt, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidna_openUTS46(options.toInt(), perrorcode)

public actual fun uiter_current32(iter: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_current32(iter)

public actual fun uiter_getState(iter: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_getState(iter).toUInt()

public actual fun uiter_next32(iter: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_next32(iter)

public actual fun uiter_previous32(iter: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_previous32(iter)

public actual fun uiter_setState(iter: Long, state: UInt, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_setState(iter, state.toInt(), perrorcode)
}

public actual fun uiter_setString(iter: Long, s: Long, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_setString(iter, s, length)
}

public actual fun uiter_setUTF16BE(iter: Long, s: PCSTR, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_setUTF16BE(iter, s, length)
}

public actual fun uiter_setUTF8(iter: Long, s: PCSTR, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiter_setUTF8(iter, s, length)
}

public actual fun uldn_close(ldn: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_close(ldn)
}

public actual fun uldn_getContext(ldn: Long, type: UDisplayContextType, perrorcode: Long): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_getContext(ldn, type, perrorcode)

public actual fun uldn_getDialectHandling(ldn: Long): UDialectHandling =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_getDialectHandling(ldn)

public actual fun uldn_getLocale(ldn: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_getLocale(ldn)

public actual fun uldn_keyDisplayName(ldn: Long, key: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_keyDisplayName(ldn, key, result, maxresultsize, perrorcode)

public actual fun uldn_keyValueDisplayName(ldn: Long, key: PCSTR, value: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_keyValueDisplayName(ldn, key, value, result, maxresultsize, perrorcode)

public actual fun uldn_languageDisplayName(ldn: Long, lang: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_languageDisplayName(ldn, lang, result, maxresultsize, perrorcode)

public actual fun uldn_localeDisplayName(ldn: Long, locale: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_localeDisplayName(ldn, locale, result, maxresultsize, perrorcode)

public actual fun uldn_open(locale: PCSTR, dialecthandling: UDialectHandling, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_open(locale, dialecthandling, perrorcode)

public actual fun uldn_openForContext(locale: PCSTR, contexts: Long, length: Int, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_openForContext(locale, contexts, length, perrorcode)

public actual fun uldn_regionDisplayName(ldn: Long, region: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_regionDisplayName(ldn, region, result, maxresultsize, perrorcode)

public actual fun uldn_scriptCodeDisplayName(ldn: Long, scriptcode: UScriptCode, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_scriptCodeDisplayName(ldn, scriptcode, result, maxresultsize, perrorcode)

public actual fun uldn_scriptDisplayName(ldn: Long, script: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_scriptDisplayName(ldn, script, result, maxresultsize, perrorcode)

public actual fun uldn_variantDisplayName(ldn: Long, variant: PCSTR, result: Long, maxresultsize: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldn_variantDisplayName(ldn, variant, result, maxresultsize, perrorcode)

public actual fun ulistfmt_close(listfmt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_close(listfmt)
}

public actual fun ulistfmt_closeResult(uresult: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_closeResult(uresult)
}

public actual fun ulistfmt_format(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_format(listfmt, strings, stringlengths, stringcount, result, resultcapacity, status)

public actual fun ulistfmt_formatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_formatStringsToResult(listfmt, strings, stringlengths, stringcount, uresult, status)
}

public actual fun ulistfmt_open(locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_open(locale, status)

public actual fun ulistfmt_openForType(locale: PCSTR, type: UListFormatterType, width: UListFormatterWidth, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_openForType(locale, type, width, status)

public actual fun ulistfmt_openResult(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_openResult(ec)

public actual fun ulistfmt_resultAsValue(uresult: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmt_resultAsValue(uresult, ec)

public actual fun uloc_acceptLanguage(result: PCSTR, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_acceptLanguage(result, resultavailable, outresult, acceptlist, acceptlistcount, availablelocales, status)

public actual fun uloc_acceptLanguageFromHTTP(result: PCSTR, resultavailable: Int, outresult: Long, httpacceptlanguage: PCSTR, availablelocales: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_acceptLanguageFromHTTP(result, resultavailable, outresult, httpacceptlanguage, availablelocales, status)

public actual fun uloc_addLikelySubtags(localeid: PCSTR, maximizedlocaleid: PCSTR, maximizedlocaleidcapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_addLikelySubtags(localeid, maximizedlocaleid, maximizedlocaleidcapacity, err)

public actual fun uloc_canonicalize(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_canonicalize(localeid, name, namecapacity, err)

public actual fun uloc_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_countAvailable()

public actual fun uloc_forLanguageTag(langtag: PCSTR, localeid: PCSTR, localeidcapacity: Int, parsedlength: Long, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_forLanguageTag(langtag, localeid, localeidcapacity, parsedlength, err)

public actual fun uloc_getAvailable(n: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getAvailable(n)

public actual fun uloc_getBaseName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getBaseName(localeid, name, namecapacity, err)

public actual fun uloc_getCharacterOrientation(localeid: PCSTR, status: Long): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getCharacterOrientation(localeid, status)

public actual fun uloc_getCountry(localeid: PCSTR, country: PCSTR, countrycapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getCountry(localeid, country, countrycapacity, err)

public actual fun uloc_getDefault(): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDefault()

public actual fun uloc_getDisplayCountry(locale: PCSTR, displaylocale: PCSTR, country: Long, countrycapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayCountry(locale, displaylocale, country, countrycapacity, status)

public actual fun uloc_getDisplayKeyword(keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayKeyword(keyword, displaylocale, dest, destcapacity, status)

public actual fun uloc_getDisplayKeywordValue(locale: PCSTR, keyword: PCSTR, displaylocale: PCSTR, dest: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayKeywordValue(locale, keyword, displaylocale, dest, destcapacity, status)

public actual fun uloc_getDisplayLanguage(locale: PCSTR, displaylocale: PCSTR, language: Long, languagecapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayLanguage(locale, displaylocale, language, languagecapacity, status)

public actual fun uloc_getDisplayName(localeid: PCSTR, inlocaleid: PCSTR, result: Long, maxresultsize: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayName(localeid, inlocaleid, result, maxresultsize, err)

public actual fun uloc_getDisplayScript(locale: PCSTR, displaylocale: PCSTR, script: Long, scriptcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayScript(locale, displaylocale, script, scriptcapacity, status)

public actual fun uloc_getDisplayVariant(locale: PCSTR, displaylocale: PCSTR, variant: Long, variantcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getDisplayVariant(locale, displaylocale, variant, variantcapacity, status)

public actual fun uloc_getISO3Country(localeid: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getISO3Country(localeid)

public actual fun uloc_getISO3Language(localeid: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getISO3Language(localeid)

public actual fun uloc_getISOCountries(): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getISOCountries()

public actual fun uloc_getISOLanguages(): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getISOLanguages()

public actual fun uloc_getKeywordValue(localeid: PCSTR, keywordname: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getKeywordValue(localeid, keywordname, buffer, buffercapacity, status)

public actual fun uloc_getLCID(localeid: PCSTR): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getLCID(localeid).toUInt()

public actual fun uloc_getLanguage(localeid: PCSTR, language: PCSTR, languagecapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getLanguage(localeid, language, languagecapacity, err)

public actual fun uloc_getLineOrientation(localeid: PCSTR, status: Long): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getLineOrientation(localeid, status)

public actual fun uloc_getLocaleForLCID(hostid: UInt, locale: PCSTR, localecapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getLocaleForLCID(hostid.toInt(), locale, localecapacity, status)

public actual fun uloc_getName(localeid: PCSTR, name: PCSTR, namecapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getName(localeid, name, namecapacity, err)

public actual fun uloc_getParent(localeid: PCSTR, parent: PCSTR, parentcapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getParent(localeid, parent, parentcapacity, err)

public actual fun uloc_getScript(localeid: PCSTR, script: PCSTR, scriptcapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getScript(localeid, script, scriptcapacity, err)

public actual fun uloc_getVariant(localeid: PCSTR, variant: PCSTR, variantcapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_getVariant(localeid, variant, variantcapacity, err)

public actual fun uloc_isRightToLeft(locale: PCSTR): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_isRightToLeft(locale)

public actual fun uloc_minimizeSubtags(localeid: PCSTR, minimizedlocaleid: PCSTR, minimizedlocaleidcapacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_minimizeSubtags(localeid, minimizedlocaleid, minimizedlocaleidcapacity, err)

public actual fun uloc_openAvailableByType(type: ULocAvailableType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_openAvailableByType(type, status)

public actual fun uloc_openKeywords(localeid: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_openKeywords(localeid, status)

public actual fun uloc_setDefault(localeid: PCSTR, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_setDefault(localeid, status)
}

public actual fun uloc_setKeywordValue(keywordname: PCSTR, keywordvalue: PCSTR, buffer: PCSTR, buffercapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_setKeywordValue(keywordname, keywordvalue, buffer, buffercapacity, status)

public actual fun uloc_toLanguageTag(localeid: PCSTR, langtag: PCSTR, langtagcapacity: Int, strict: Byte, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_toLanguageTag(localeid, langtag, langtagcapacity, strict, err)

public actual fun uloc_toLegacyKey(keyword: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_toLegacyKey(keyword)

public actual fun uloc_toLegacyType(keyword: PCSTR, value: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_toLegacyType(keyword, value)

public actual fun uloc_toUnicodeLocaleKey(keyword: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleKey(keyword)

public actual fun uloc_toUnicodeLocaleType(keyword: PCSTR, value: PCSTR): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uloc_toUnicodeLocaleType(keyword, value)

public actual fun ulocdata_close(uld: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_close(uld)
}

public actual fun ulocdata_getCLDRVersion(versionarray: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getCLDRVersion(versionarray, status)
}

public actual fun ulocdata_getDelimiter(uld: Long, type: ULocaleDataDelimiterType, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getDelimiter(uld, type, result, resultlength, status)

public actual fun ulocdata_getExemplarSet(uld: Long, fillin: Long, options: UInt, extype: ULocaleDataExemplarSetType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getExemplarSet(uld, fillin, options.toInt(), extype, status)

public actual fun ulocdata_getLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getLocaleDisplayPattern(uld, pattern, patterncapacity, status)

public actual fun ulocdata_getLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getLocaleSeparator(uld, separator, separatorcapacity, status)

public actual fun ulocdata_getMeasurementSystem(localeid: PCSTR, status: Long): UMeasurementSystem =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getMeasurementSystem(localeid, status)

public actual fun ulocdata_getNoSubstitute(uld: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getNoSubstitute(uld)

public actual fun ulocdata_getPaperSize(localeid: PCSTR, height: Long, width: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_getPaperSize(localeid, height, width, status)
}

public actual fun ulocdata_open(localeid: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_open(localeid, status)

public actual fun ulocdata_setNoSubstitute(uld: Long, setting: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdata_setNoSubstitute(uld, setting)
}

public actual fun umsg_applyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_applyPattern(fmt, pattern, patternlength, parseerror, status)
}

public actual fun umsg_autoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_autoQuoteApostrophe(pattern, patternlength, dest, destcapacity, ec)

public actual fun umsg_clone(fmt: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_clone(fmt, status)

public actual fun umsg_close(format: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_close(format)
}

public actual fun umsg_format(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    0

public actual fun umsg_getLocale(fmt: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_getLocale(fmt)

public actual fun umsg_open(pattern: Long, patternlength: Int, locale: PCSTR, parseerror: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_open(pattern, patternlength, locale, parseerror, status)

public actual fun umsg_parse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long) {
}

public actual fun umsg_setLocale(fmt: Long, locale: PCSTR) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_setLocale(fmt, locale)
}

public actual fun umsg_toPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_toPattern(fmt, result, resultlength, status)

public actual fun umsg_vformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_vformat(fmt, result, resultlength, ap, status)

public actual fun umsg_vparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsg_vparse(fmt, source, sourcelength, count, ap, status)
}

public actual fun umutablecptrie_buildImmutable(trie: Long, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_buildImmutable(trie, type, valuewidth, perrorcode)

public actual fun umutablecptrie_clone(other: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_clone(other, perrorcode)

public actual fun umutablecptrie_close(trie: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_close(trie)
}

public actual fun umutablecptrie_fromUCPMap(map: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_fromUCPMap(map, perrorcode)

public actual fun umutablecptrie_fromUCPTrie(trie: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_fromUCPTrie(trie, perrorcode)

public actual fun umutablecptrie_get(trie: Long, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_get(trie, c).toUInt()

public actual fun umutablecptrie_getRange(trie: Long, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: Long, context: Long, pvalue: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_getRange(trie, start, option, surrogatevalue.toInt(), filter, context, pvalue)

public actual fun umutablecptrie_open(initialvalue: UInt, errorvalue: UInt, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_open(initialvalue.toInt(), errorvalue.toInt(), perrorcode)

public actual fun umutablecptrie_set(trie: Long, c: Int, value: UInt, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_set(trie, c, value.toInt(), perrorcode)
}

public actual fun umutablecptrie_setRange(trie: Long, start: Int, end: Int, value: UInt, perrorcode: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrie_setRange(trie, start, end, value.toInt(), perrorcode)
}

public actual fun unorm2_append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_append(norm2, first, firstlength, firstcapacity, second, secondlength, perrorcode)

public actual fun unorm2_close(norm2: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_close(norm2)
}

public actual fun unorm2_composePair(norm2: Long, a: Int, b: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_composePair(norm2, a, b)

public actual fun unorm2_getCombiningClass(norm2: Long, c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getCombiningClass(norm2, c).toUByte()

public actual fun unorm2_getDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getDecomposition(norm2, c, decomposition, capacity, perrorcode)

public actual fun unorm2_getInstance(packagename: PCSTR, name: PCSTR, mode: UNormalization2Mode, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getInstance(packagename, name, mode, perrorcode)

public actual fun unorm2_getNFCInstance(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getNFCInstance(perrorcode)

public actual fun unorm2_getNFDInstance(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getNFDInstance(perrorcode)

public actual fun unorm2_getNFKCCasefoldInstance(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getNFKCCasefoldInstance(perrorcode)

public actual fun unorm2_getNFKCInstance(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getNFKCInstance(perrorcode)

public actual fun unorm2_getNFKDInstance(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getNFKDInstance(perrorcode)

public actual fun unorm2_getRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_getRawDecomposition(norm2, c, decomposition, capacity, perrorcode)

public actual fun unorm2_hasBoundaryAfter(norm2: Long, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_hasBoundaryAfter(norm2, c)

public actual fun unorm2_hasBoundaryBefore(norm2: Long, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_hasBoundaryBefore(norm2, c)

public actual fun unorm2_isInert(norm2: Long, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_isInert(norm2, c)

public actual fun unorm2_isNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_isNormalized(norm2, s, length, perrorcode)

public actual fun unorm2_normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_normalize(norm2, src, length, dest, capacity, perrorcode)

public actual fun unorm2_normalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_normalizeSecondAndAppend(norm2, first, firstlength, firstcapacity, second, secondlength, perrorcode)

public actual fun unorm2_openFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_openFiltered(norm2, filterset, perrorcode)

public actual fun unorm2_quickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): UNormalizationCheckResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_quickCheck(norm2, s, length, perrorcode)

public actual fun unorm2_spanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2_spanQuickCheckYes(norm2, s, length, perrorcode)

public actual fun unorm_compare(s1: Long, length1: Int, s2: Long, length2: Int, options: UInt, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm_compare(s1, length1, s2, length2, options.toInt(), perrorcode)

public actual fun unum_applyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_applyPattern(format, localized, pattern, patternlength, parseerror, status)
}

public actual fun unum_clone(fmt: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_clone(fmt, status)

public actual fun unum_close(fmt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_close(fmt)
}

public actual fun unum_countAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_countAvailable()

public actual fun unum_format(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_format(fmt, number, result, resultlength, pos, status)

public actual fun unum_formatDecimal(fmt: Long, number: PCSTR, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatDecimal(fmt, number, length, result, resultlength, pos, status)

public actual fun unum_formatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatDouble(fmt, number, result, resultlength, pos, status)

public actual fun unum_formatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatDoubleCurrency(fmt, number, currency, result, resultlength, pos, status)

public actual fun unum_formatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatDoubleForFields(format, number, result, resultlength, fpositer, status)

public actual fun unum_formatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatInt64(fmt, number, result, resultlength, pos, status)

public actual fun unum_formatUFormattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_formatUFormattable(fmt, number, result, resultlength, pos, status)

public actual fun unum_getAttribute(fmt: Long, attr: UNumberFormatAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getAttribute(fmt, attr)

public actual fun unum_getAvailable(localeindex: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getAvailable(localeindex)

public actual fun unum_getContext(fmt: Long, type: UDisplayContextType, status: Long): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getContext(fmt, type, status)

public actual fun unum_getDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getDoubleAttribute(fmt, attr)

public actual fun unum_getLocaleByType(fmt: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getLocaleByType(fmt, type, status)

public actual fun unum_getSymbol(fmt: Long, symbol: UNumberFormatSymbol, buffer: Long, size: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getSymbol(fmt, symbol, buffer, size, status)

public actual fun unum_getTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_getTextAttribute(fmt, tag, result, resultlength, status)

public actual fun unum_open(style: UNumberFormatStyle, pattern: Long, patternlength: Int, locale: PCSTR, parseerr: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_open(style, pattern, patternlength, locale, parseerr, status)

public actual fun unum_parse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parse(fmt, text, textlength, parsepos, status)

public actual fun unum_parseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: PCSTR, outbuflength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parseDecimal(fmt, text, textlength, parsepos, outbuf, outbuflength, status)

public actual fun unum_parseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parseDouble(fmt, text, textlength, parsepos, status)

public actual fun unum_parseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parseDoubleCurrency(fmt, text, textlength, parsepos, currency, status)

public actual fun unum_parseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parseInt64(fmt, text, textlength, parsepos, status)

public actual fun unum_parseToUFormattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_parseToUFormattable(fmt, result, text, textlength, parsepos, status)

public actual fun unum_setAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_setAttribute(fmt, attr, newvalue)
}

public actual fun unum_setContext(fmt: Long, value: UDisplayContext, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_setContext(fmt, value, status)
}

public actual fun unum_setDoubleAttribute(fmt: Long, attr: UNumberFormatAttribute, newvalue: Double) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_setDoubleAttribute(fmt, attr, newvalue)
}

public actual fun unum_setSymbol(fmt: Long, symbol: UNumberFormatSymbol, value: Long, length: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_setSymbol(fmt, symbol, value, length, status)
}

public actual fun unum_setTextAttribute(fmt: Long, tag: UNumberFormatTextAttribute, newvalue: Long, newvaluelength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_setTextAttribute(fmt, tag, newvalue, newvaluelength, status)
}

public actual fun unum_toPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unum_toPattern(fmt, ispatternlocalized, result, resultlength, status)

public actual fun unumf_close(uformatter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_close(uformatter)
}

public actual fun unumf_closeResult(uresult: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_closeResult(uresult)
}

public actual fun unumf_formatDecimal(uformatter: Long, value: PCSTR, valuelen: Int, uresult: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_formatDecimal(uformatter, value, valuelen, uresult, ec)
}

public actual fun unumf_formatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_formatDouble(uformatter, value, uresult, ec)
}

public actual fun unumf_formatInt(uformatter: Long, value: Long, uresult: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_formatInt(uformatter, value, uresult, ec)
}

public actual fun unumf_openForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: PCSTR, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocale(skeleton, skeletonlen, locale, ec)

public actual fun unumf_openForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: PCSTR, perror: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocaleWithError(skeleton, skeletonlen, locale, perror, ec)

public actual fun unumf_openResult(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_openResult(ec)

public actual fun unumf_resultAsValue(uresult: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_resultAsValue(uresult, ec)

public actual fun unumf_resultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_resultGetAllFieldPositions(uresult, ufpositer, ec)
}

public actual fun unumf_resultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_resultNextFieldPosition(uresult, ufpos, ec)

public actual fun unumf_resultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumf_resultToString(uresult, buffer, buffercapacity, ec)

public actual fun unumsys_close(unumsys: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_close(unumsys)
}

public actual fun unumsys_getDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_getDescription(unumsys, result, resultlength, status)

public actual fun unumsys_getName(unumsys: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_getName(unumsys)

public actual fun unumsys_getRadix(unumsys: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_getRadix(unumsys)

public actual fun unumsys_isAlgorithmic(unumsys: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_isAlgorithmic(unumsys)

public actual fun unumsys_open(locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_open(locale, status)

public actual fun unumsys_openAvailableNames(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_openAvailableNames(status)

public actual fun unumsys_openByName(name: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsys_openByName(name, status)

public actual fun uplrules_close(uplrules: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_close(uplrules)
}

public actual fun uplrules_getKeywords(uplrules: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_getKeywords(uplrules, status)

public actual fun uplrules_open(locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_open(locale, status)

public actual fun uplrules_openForType(locale: PCSTR, type: UPluralType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_openForType(locale, type, status)

public actual fun uplrules_select(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_select(uplrules, number, keyword, capacity, status)

public actual fun uplrules_selectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrules_selectFormatted(uplrules, number, keyword, capacity, status)

public actual fun uregex_appendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_appendReplacement(regexp, replacementtext, replacementlength, destbuf, destcapacity, status)

public actual fun uregex_appendReplacementUText(regexp: Long, replacementtext: Long, dest: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_appendReplacementUText(regexp, replacementtext, dest, status)
}

public actual fun uregex_appendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_appendTail(regexp, destbuf, destcapacity, status)

public actual fun uregex_appendTailUText(regexp: Long, dest: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_appendTailUText(regexp, dest, status)

public actual fun uregex_clone(regexp: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_clone(regexp, status)

public actual fun uregex_close(regexp: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_close(regexp)
}

public actual fun uregex_end(regexp: Long, groupnum: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_end(regexp, groupnum, status)

public actual fun uregex_end64(regexp: Long, groupnum: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_end64(regexp, groupnum, status)

public actual fun uregex_find(regexp: Long, startindex: Int, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_find(regexp, startindex, status)

public actual fun uregex_find64(regexp: Long, startindex: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_find64(regexp, startindex, status)

public actual fun uregex_findNext(regexp: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_findNext(regexp, status)

public actual fun uregex_flags(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_flags(regexp, status)

public actual fun uregex_getFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getFindProgressCallback(regexp, callback, context, status)
}

public actual fun uregex_getMatchCallback(regexp: Long, callback: Long, context: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getMatchCallback(regexp, callback, context, status)
}

public actual fun uregex_getStackLimit(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getStackLimit(regexp, status)

public actual fun uregex_getText(regexp: Long, textlength: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getText(regexp, textlength, status)

public actual fun uregex_getTimeLimit(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getTimeLimit(regexp, status)

public actual fun uregex_getUText(regexp: Long, dest: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_getUText(regexp, dest, status)

public actual fun uregex_group(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_group(regexp, groupnum, dest, destcapacity, status)

public actual fun uregex_groupCount(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_groupCount(regexp, status)

public actual fun uregex_groupNumberFromCName(regexp: Long, groupname: PCSTR, namelength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_groupNumberFromCName(regexp, groupname, namelength, status)

public actual fun uregex_groupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_groupNumberFromName(regexp, groupname, namelength, status)

public actual fun uregex_groupUText(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_groupUText(regexp, groupnum, dest, grouplength, status)

public actual fun uregex_hasAnchoringBounds(regexp: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_hasAnchoringBounds(regexp, status)

public actual fun uregex_hasTransparentBounds(regexp: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_hasTransparentBounds(regexp, status)

public actual fun uregex_hitEnd(regexp: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_hitEnd(regexp, status)

public actual fun uregex_lookingAt(regexp: Long, startindex: Int, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_lookingAt(regexp, startindex, status)

public actual fun uregex_lookingAt64(regexp: Long, startindex: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_lookingAt64(regexp, startindex, status)

public actual fun uregex_matches(regexp: Long, startindex: Int, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_matches(regexp, startindex, status)

public actual fun uregex_matches64(regexp: Long, startindex: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_matches64(regexp, startindex, status)

public actual fun uregex_open(pattern: Long, patternlength: Int, flags: UInt, pe: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_open(pattern, patternlength, flags.toInt(), pe, status)

public actual fun uregex_openC(pattern: PCSTR, flags: UInt, pe: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_openC(pattern, flags.toInt(), pe, status)

public actual fun uregex_openUText(pattern: Long, flags: UInt, pe: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_openUText(pattern, flags.toInt(), pe, status)

public actual fun uregex_pattern(regexp: Long, patlength: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_pattern(regexp, patlength, status)

public actual fun uregex_patternUText(regexp: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_patternUText(regexp, status)

public actual fun uregex_refreshUText(regexp: Long, text: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_refreshUText(regexp, text, status)
}

public actual fun uregex_regionEnd(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_regionEnd(regexp, status)

public actual fun uregex_regionEnd64(regexp: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_regionEnd64(regexp, status)

public actual fun uregex_regionStart(regexp: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_regionStart(regexp, status)

public actual fun uregex_regionStart64(regexp: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_regionStart64(regexp, status)

public actual fun uregex_replaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_replaceAll(regexp, replacementtext, replacementlength, destbuf, destcapacity, status)

public actual fun uregex_replaceAllUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_replaceAllUText(regexp, replacement, dest, status)

public actual fun uregex_replaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_replaceFirst(regexp, replacementtext, replacementlength, destbuf, destcapacity, status)

public actual fun uregex_replaceFirstUText(regexp: Long, replacement: Long, dest: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_replaceFirstUText(regexp, replacement, dest, status)

public actual fun uregex_requireEnd(regexp: Long, status: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_requireEnd(regexp, status)

public actual fun uregex_reset(regexp: Long, index: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_reset(regexp, index, status)
}

public actual fun uregex_reset64(regexp: Long, index: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_reset64(regexp, index, status)
}

public actual fun uregex_setFindProgressCallback(regexp: Long, callback: URegexFindProgressCallback, context: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setFindProgressCallback(regexp, callback.toLong(), context, status)
}

public actual fun uregex_setMatchCallback(regexp: Long, callback: URegexMatchCallback, context: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setMatchCallback(regexp, callback.toLong(), context, status)
}

public actual fun uregex_setRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setRegion(regexp, regionstart, regionlimit, status)
}

public actual fun uregex_setRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setRegion64(regexp, regionstart, regionlimit, status)
}

public actual fun uregex_setRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setRegionAndStart(regexp, regionstart, regionlimit, startindex, status)
}

public actual fun uregex_setStackLimit(regexp: Long, limit: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setStackLimit(regexp, limit, status)
}

public actual fun uregex_setText(regexp: Long, text: Long, textlength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setText(regexp, text, textlength, status)
}

public actual fun uregex_setTimeLimit(regexp: Long, limit: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setTimeLimit(regexp, limit, status)
}

public actual fun uregex_setUText(regexp: Long, text: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_setUText(regexp, text, status)
}

public actual fun uregex_split(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_split(regexp, destbuf, destcapacity, requiredcapacity, destfields, destfieldscapacity, status)

public actual fun uregex_splitUText(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_splitUText(regexp, destfields, destfieldscapacity, status)

public actual fun uregex_start(regexp: Long, groupnum: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_start(regexp, groupnum, status)

public actual fun uregex_start64(regexp: Long, groupnum: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_start64(regexp, groupnum, status)

public actual fun uregex_useAnchoringBounds(regexp: Long, b: Byte, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_useAnchoringBounds(regexp, b, status)
}

public actual fun uregex_useTransparentBounds(regexp: Long, b: Byte, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregex_useTransparentBounds(regexp, b, status)
}

public actual fun uregion_areEqual(uregion: Long, otherregion: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_areEqual(uregion, otherregion)

public actual fun uregion_contains(uregion: Long, otherregion: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_contains(uregion, otherregion)

public actual fun uregion_getAvailable(type: URegionType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getAvailable(type, status)

public actual fun uregion_getContainedRegions(uregion: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getContainedRegions(uregion, status)

public actual fun uregion_getContainedRegionsOfType(uregion: Long, type: URegionType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getContainedRegionsOfType(uregion, type, status)

public actual fun uregion_getContainingRegion(uregion: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getContainingRegion(uregion)

public actual fun uregion_getContainingRegionOfType(uregion: Long, type: URegionType): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getContainingRegionOfType(uregion, type)

public actual fun uregion_getNumericCode(uregion: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getNumericCode(uregion)

public actual fun uregion_getPreferredValues(uregion: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getPreferredValues(uregion, status)

public actual fun uregion_getRegionCode(uregion: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getRegionCode(uregion)

public actual fun uregion_getRegionFromCode(regioncode: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getRegionFromCode(regioncode, status)

public actual fun uregion_getRegionFromNumericCode(code: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getRegionFromNumericCode(code, status)

public actual fun uregion_getType(uregion: Long): URegionType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregion_getType(uregion)

public actual fun ureldatefmt_close(reldatefmt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_close(reldatefmt)
}

public actual fun ureldatefmt_closeResult(ufrdt: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_closeResult(ufrdt)
}

public actual fun ureldatefmt_combineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_combineDateAndTime(reldatefmt, relativedatestring, relativedatestringlen, timestring, timestringlen, result, resultcapacity, status)

public actual fun ureldatefmt_format(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_format(reldatefmt, offset, unit, result, resultcapacity, status)

public actual fun ureldatefmt_formatNumeric(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, resultcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_formatNumeric(reldatefmt, offset, unit, result, resultcapacity, status)

public actual fun ureldatefmt_formatNumericToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_formatNumericToResult(reldatefmt, offset, unit, result, status)
}

public actual fun ureldatefmt_formatToResult(reldatefmt: Long, offset: Double, unit: URelativeDateTimeUnit, result: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_formatToResult(reldatefmt, offset, unit, result, status)
}

public actual fun ureldatefmt_open(locale: PCSTR, nftoadopt: Long, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_open(locale, nftoadopt, width, capitalizationcontext, status)

public actual fun ureldatefmt_openResult(ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_openResult(ec)

public actual fun ureldatefmt_resultAsValue(ufrdt: Long, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmt_resultAsValue(ufrdt, ec)

public actual fun ures_close(resourcebundle: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_close(resourcebundle)
}

public actual fun ures_getBinary(resourcebundle: Long, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getBinary(resourcebundle, len, status)

public actual fun ures_getByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getByIndex(resourcebundle, indexr, fillin, status)

public actual fun ures_getByKey(resourcebundle: Long, key: PCSTR, fillin: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getByKey(resourcebundle, key, fillin, status)

public actual fun ures_getInt(resourcebundle: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getInt(resourcebundle, status)

public actual fun ures_getIntVector(resourcebundle: Long, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getIntVector(resourcebundle, len, status)

public actual fun ures_getKey(resourcebundle: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getKey(resourcebundle)

public actual fun ures_getLocaleByType(resourcebundle: Long, type: ULocDataLocaleType, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getLocaleByType(resourcebundle, type, status)

public actual fun ures_getNextResource(resourcebundle: Long, fillin: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getNextResource(resourcebundle, fillin, status)

public actual fun ures_getNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getNextString(resourcebundle, len, key, status)

public actual fun ures_getSize(resourcebundle: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getSize(resourcebundle)

public actual fun ures_getString(resourcebundle: Long, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getString(resourcebundle, len, status)

public actual fun ures_getStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getStringByIndex(resourcebundle, indexs, len, status)

public actual fun ures_getStringByKey(resb: Long, key: PCSTR, len: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getStringByKey(resb, key, len, status)

public actual fun ures_getType(resourcebundle: Long): UResType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getType(resourcebundle)

public actual fun ures_getUInt(resourcebundle: Long, status: Long): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getUInt(resourcebundle, status).toUInt()

public actual fun ures_getUTF8String(resb: Long, dest: PCSTR, length: Long, forcecopy: Byte, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getUTF8String(resb, dest, length, forcecopy, status)

public actual fun ures_getUTF8StringByIndex(resb: Long, stringindex: Int, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getUTF8StringByIndex(resb, stringindex, dest, plength, forcecopy, status)

public actual fun ures_getUTF8StringByKey(resb: Long, key: PCSTR, dest: PCSTR, plength: Long, forcecopy: Byte, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getUTF8StringByKey(resb, key, dest, plength, forcecopy, status)

public actual fun ures_getVersion(resb: Long, versioninfo: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_getVersion(resb, versioninfo)
}

public actual fun ures_hasNext(resourcebundle: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_hasNext(resourcebundle)

public actual fun ures_open(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_open(packagename, locale, status)

public actual fun ures_openAvailableLocales(packagename: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_openAvailableLocales(packagename, status)

public actual fun ures_openDirect(packagename: PCSTR, locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_openDirect(packagename, locale, status)

public actual fun ures_openU(packagename: Long, locale: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_openU(packagename, locale, status)

public actual fun ures_resetIterator(resourcebundle: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ures_resetIterator(resourcebundle)
}

public actual fun uscript_breaksBetweenLetters(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_breaksBetweenLetters(script)

public actual fun uscript_getCode(nameorabbrorlocale: PCSTR, fillin: Long, capacity: Int, err: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getCode(nameorabbrorlocale, fillin, capacity, err)

public actual fun uscript_getName(scriptcode: UScriptCode): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getName(scriptcode)

public actual fun uscript_getSampleString(script: UScriptCode, dest: Long, capacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getSampleString(script, dest, capacity, perrorcode)

public actual fun uscript_getScript(codepoint: Int, err: Long): UScriptCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getScript(codepoint, err)

public actual fun uscript_getScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getScriptExtensions(c, scripts, capacity, errorcode)

public actual fun uscript_getShortName(scriptcode: UScriptCode): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getShortName(scriptcode)

public actual fun uscript_getUsage(script: UScriptCode): UScriptUsage =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_getUsage(script)

public actual fun uscript_hasScript(c: Int, sc: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_hasScript(c, sc)

public actual fun uscript_isCased(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_isCased(script)

public actual fun uscript_isRightToLeft(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscript_isRightToLeft(script)

public actual fun usearch_close(searchiter: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_close(searchiter)
}

public actual fun usearch_first(strsrch: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_first(strsrch, status)

public actual fun usearch_following(strsrch: Long, position: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_following(strsrch, position, status)

public actual fun usearch_getAttribute(strsrch: Long, attribute: USearchAttribute): USearchAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getAttribute(strsrch, attribute)

public actual fun usearch_getBreakIterator(strsrch: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getBreakIterator(strsrch)

public actual fun usearch_getCollator(strsrch: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getCollator(strsrch)

public actual fun usearch_getMatchedLength(strsrch: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getMatchedLength(strsrch)

public actual fun usearch_getMatchedStart(strsrch: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getMatchedStart(strsrch)

public actual fun usearch_getMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getMatchedText(strsrch, result, resultcapacity, status)

public actual fun usearch_getOffset(strsrch: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getOffset(strsrch)

public actual fun usearch_getPattern(strsrch: Long, length: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getPattern(strsrch, length)

public actual fun usearch_getText(strsrch: Long, length: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_getText(strsrch, length)

public actual fun usearch_last(strsrch: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_last(strsrch, status)

public actual fun usearch_next(strsrch: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_next(strsrch, status)

public actual fun usearch_open(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: PCSTR, breakiter: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_open(pattern, patternlength, text, textlength, locale, breakiter, status)

public actual fun usearch_openFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_openFromCollator(pattern, patternlength, text, textlength, collator, breakiter, status)

public actual fun usearch_preceding(strsrch: Long, position: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_preceding(strsrch, position, status)

public actual fun usearch_previous(strsrch: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_previous(strsrch, status)

public actual fun usearch_reset(strsrch: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_reset(strsrch)
}

public actual fun usearch_setAttribute(strsrch: Long, attribute: USearchAttribute, value: USearchAttributeValue, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setAttribute(strsrch, attribute, value, status)
}

public actual fun usearch_setBreakIterator(strsrch: Long, breakiter: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setBreakIterator(strsrch, breakiter, status)
}

public actual fun usearch_setCollator(strsrch: Long, collator: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setCollator(strsrch, collator, status)
}

public actual fun usearch_setOffset(strsrch: Long, position: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setOffset(strsrch, position, status)
}

public actual fun usearch_setPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setPattern(strsrch, pattern, patternlength, status)
}

public actual fun usearch_setText(strsrch: Long, text: Long, textlength: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearch_setText(strsrch, text, textlength, status)
}

public actual fun uset_add(set: Long, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_add(set, c)
}

public actual fun uset_addAll(set: Long, additionalset: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_addAll(set, additionalset)
}

public actual fun uset_addAllCodePoints(set: Long, str: Long, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_addAllCodePoints(set, str, strlen)
}

public actual fun uset_addRange(set: Long, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_addRange(set, start, end)
}

public actual fun uset_addString(set: Long, str: Long, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_addString(set, str, strlen)
}

public actual fun uset_applyIntPropertyValue(set: Long, prop: UProperty, value: Int, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_applyIntPropertyValue(set, prop, value, ec)
}

public actual fun uset_applyPattern(set: Long, pattern: Long, patternlength: Int, options: UInt, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_applyPattern(set, pattern, patternlength, options.toInt(), status)

public actual fun uset_applyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_applyPropertyAlias(set, prop, proplength, value, valuelength, ec)
}

public actual fun uset_charAt(set: Long, charindex: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_charAt(set, charindex)

public actual fun uset_clear(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_clear(set)
}

public actual fun uset_clone(set: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_clone(set)

public actual fun uset_cloneAsThawed(set: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_cloneAsThawed(set)

public actual fun uset_close(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_close(set)
}

public actual fun uset_closeOver(set: Long, attributes: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_closeOver(set, attributes)
}

public actual fun uset_compact(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_compact(set)
}

public actual fun uset_complement(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_complement(set)
}

public actual fun uset_complementAll(set: Long, complement: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_complementAll(set, complement)
}

public actual fun uset_contains(set: Long, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_contains(set, c)

public actual fun uset_containsAll(set1: Long, set2: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsAll(set1, set2)

public actual fun uset_containsAllCodePoints(set: Long, str: Long, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsAllCodePoints(set, str, strlen)

public actual fun uset_containsNone(set1: Long, set2: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsNone(set1, set2)

public actual fun uset_containsRange(set: Long, start: Int, end: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsRange(set, start, end)

public actual fun uset_containsSome(set1: Long, set2: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsSome(set1, set2)

public actual fun uset_containsString(set: Long, str: Long, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_containsString(set, str, strlen)

public actual fun uset_equals(set1: Long, set2: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_equals(set1, set2)

public actual fun uset_freeze(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_freeze(set)
}

public actual fun uset_getItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_getItem(set, itemindex, start, end, str, strcapacity, ec)

public actual fun uset_getItemCount(set: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_getItemCount(set)

public actual fun uset_getSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_getSerializedRange(set, rangeindex, pstart, pend)

public actual fun uset_getSerializedRangeCount(set: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_getSerializedRangeCount(set)

public actual fun uset_getSerializedSet(fillset: Long, src: Long, srclength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_getSerializedSet(fillset, src, srclength)

public actual fun uset_indexOf(set: Long, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_indexOf(set, c)

public actual fun uset_isEmpty(set: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_isEmpty(set)

public actual fun uset_isFrozen(set: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_isFrozen(set)

public actual fun uset_open(start: Int, end: Int): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_open(start, end)

public actual fun uset_openEmpty(): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_openEmpty()

public actual fun uset_openPattern(pattern: Long, patternlength: Int, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_openPattern(pattern, patternlength, ec)

public actual fun uset_openPatternOptions(pattern: Long, patternlength: Int, options: UInt, ec: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_openPatternOptions(pattern, patternlength, options.toInt(), ec)

public actual fun uset_remove(set: Long, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_remove(set, c)
}

public actual fun uset_removeAll(set: Long, removeset: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_removeAll(set, removeset)
}

public actual fun uset_removeAllStrings(set: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_removeAllStrings(set)
}

public actual fun uset_removeRange(set: Long, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_removeRange(set, start, end)
}

public actual fun uset_removeString(set: Long, str: Long, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_removeString(set, str, strlen)
}

public actual fun uset_resemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_resemblesPattern(pattern, patternlength, pos)

public actual fun uset_retain(set: Long, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_retain(set, start, end)
}

public actual fun uset_retainAll(set: Long, retain: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_retainAll(set, retain)
}

public actual fun uset_serialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_serialize(set, dest, destcapacity, perrorcode)

public actual fun uset_serializedContains(set: Long, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_serializedContains(set, c)

public actual fun uset_set(set: Long, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_set(set, start, end)
}

public actual fun uset_setSerializedToOne(fillset: Long, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_setSerializedToOne(fillset, c)
}

public actual fun uset_size(set: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_size(set)

public actual fun uset_span(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_span(set, s, length, spancondition)

public actual fun uset_spanBack(set: Long, s: Long, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_spanBack(set, s, length, spancondition)

public actual fun uset_spanBackUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_spanBackUTF8(set, s, length, spancondition)

public actual fun uset_spanUTF8(set: Long, s: PCSTR, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_spanUTF8(set, s, length, spancondition)

public actual fun uset_toPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uset_toPattern(set, result, resultcapacity, escapeunprintable, ec)

public actual fun uspoof_areConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_areConfusable(sc, id1, length1, id2, length2, status)

public actual fun uspoof_areConfusableUTF8(sc: Long, id1: PCSTR, length1: Int, id2: PCSTR, length2: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_areConfusableUTF8(sc, id1, length1, id2, length2, status)

public actual fun uspoof_check(sc: Long, id: Long, length: Int, position: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_check(sc, id, length, position, status)

public actual fun uspoof_check2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_check2(sc, id, length, checkresult, status)

public actual fun uspoof_check2UTF8(sc: Long, id: PCSTR, length: Int, checkresult: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_check2UTF8(sc, id, length, checkresult, status)

public actual fun uspoof_checkUTF8(sc: Long, id: PCSTR, length: Int, position: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_checkUTF8(sc, id, length, position, status)

public actual fun uspoof_clone(sc: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_clone(sc, status)

public actual fun uspoof_close(sc: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_close(sc)
}

public actual fun uspoof_closeCheckResult(checkresult: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_closeCheckResult(checkresult)
}

public actual fun uspoof_getAllowedChars(sc: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getAllowedChars(sc, status)

public actual fun uspoof_getAllowedLocales(sc: Long, status: Long): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getAllowedLocales(sc, status)

public actual fun uspoof_getCheckResultChecks(checkresult: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getCheckResultChecks(checkresult, status)

public actual fun uspoof_getCheckResultNumerics(checkresult: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getCheckResultNumerics(checkresult, status)

public actual fun uspoof_getCheckResultRestrictionLevel(checkresult: Long, status: Long): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getCheckResultRestrictionLevel(checkresult, status)

public actual fun uspoof_getChecks(sc: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getChecks(sc, status)

public actual fun uspoof_getInclusionSet(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getInclusionSet(status)

public actual fun uspoof_getRecommendedSet(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getRecommendedSet(status)

public actual fun uspoof_getRestrictionLevel(sc: Long): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getRestrictionLevel(sc)

public actual fun uspoof_getSkeleton(sc: Long, type: UInt, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getSkeleton(sc, type.toInt(), id, length, dest, destcapacity, status)

public actual fun uspoof_getSkeletonUTF8(sc: Long, type: UInt, id: PCSTR, length: Int, dest: PCSTR, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_getSkeletonUTF8(sc, type.toInt(), id, length, dest, destcapacity, status)

public actual fun uspoof_open(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_open(status)

public actual fun uspoof_openCheckResult(status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_openCheckResult(status)

public actual fun uspoof_openFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_openFromSerialized(data, length, pactuallength, perrorcode)

public actual fun uspoof_openFromSource(confusables: PCSTR, confusableslen: Int, confusableswholescript: PCSTR, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_openFromSource(confusables, confusableslen, confusableswholescript, confusableswholescriptlen, errtype, pe, status)

public actual fun uspoof_serialize(sc: Long, data: Long, capacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_serialize(sc, data, capacity, status)

public actual fun uspoof_setAllowedChars(sc: Long, chars: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_setAllowedChars(sc, chars, status)
}

public actual fun uspoof_setAllowedLocales(sc: Long, localeslist: PCSTR, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_setAllowedLocales(sc, localeslist, status)
}

public actual fun uspoof_setChecks(sc: Long, checks: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_setChecks(sc, checks, status)
}

public actual fun uspoof_setRestrictionLevel(sc: Long, restrictionlevel: URestrictionLevel) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoof_setRestrictionLevel(sc, restrictionlevel)
}

public actual fun usprep_close(profile: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprep_close(profile)
}

public actual fun usprep_open(path: PCSTR, filename: PCSTR, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprep_open(path, filename, status)

public actual fun usprep_openByType(type: UStringPrepProfileType, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprep_openByType(type, status)

public actual fun usprep_prepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprep_prepare(prep, src, srclength, dest, destcapacity, options, parseerror, status)

public actual fun utext_char32At(ut: Long, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_char32At(ut, nativeindex)

public actual fun utext_clone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_clone(dest, src, deep, readonly, status)

public actual fun utext_close(ut: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_close(ut)

public actual fun utext_copy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_copy(ut, nativestart, nativelimit, destindex, move, status)
}

public actual fun utext_current32(ut: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_current32(ut)

public actual fun utext_equals(a: Long, b: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_equals(a, b)

public actual fun utext_extract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_extract(ut, nativestart, nativelimit, dest, destcapacity, status)

public actual fun utext_freeze(ut: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_freeze(ut)
}

public actual fun utext_getNativeIndex(ut: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_getNativeIndex(ut)

public actual fun utext_getPreviousNativeIndex(ut: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_getPreviousNativeIndex(ut)

public actual fun utext_hasMetaData(ut: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_hasMetaData(ut)

public actual fun utext_isLengthExpensive(ut: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_isLengthExpensive(ut)

public actual fun utext_isWritable(ut: Long): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_isWritable(ut)

public actual fun utext_moveIndex32(ut: Long, delta: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_moveIndex32(ut, delta)

public actual fun utext_nativeLength(ut: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_nativeLength(ut)

public actual fun utext_next32(ut: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_next32(ut)

public actual fun utext_next32From(ut: Long, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_next32From(ut, nativeindex)

public actual fun utext_openUChars(ut: Long, s: Long, length: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_openUChars(ut, s, length, status)

public actual fun utext_openUTF8(ut: Long, s: PCSTR, length: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_openUTF8(ut, s, length, status)

public actual fun utext_previous32(ut: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_previous32(ut)

public actual fun utext_previous32From(ut: Long, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_previous32From(ut, nativeindex)

public actual fun utext_replace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_replace(ut, nativestart, nativelimit, replacementtext, replacementlength, status)

public actual fun utext_setNativeIndex(ut: Long, nativeindex: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_setNativeIndex(ut, nativeindex)
}

public actual fun utext_setup(ut: Long, extraspace: Int, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utext_setup(ut, extraspace, status)

public actual fun utf8_appendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8_appendCharSafeBody(s, i, length, c, piserror)

public actual fun utf8_back1SafeBody(s: Long, start: Int, i: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8_back1SafeBody(s, start, i)

public actual fun utf8_nextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8_nextCharSafeBody(s, pi, length, c, strict)

public actual fun utf8_prevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8_prevCharSafeBody(s, start, pi, c, strict)

public actual fun utmscale_fromInt64(othertime: Long, timescale: UDateTimeScale, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscale_fromInt64(othertime, timescale, status)

public actual fun utmscale_getTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscale_getTimeScaleValue(timescale, value, status)

public actual fun utmscale_toInt64(universaltime: Long, timescale: UDateTimeScale, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscale_toInt64(universaltime, timescale, status)

public actual fun utrace_format(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR): Int =
    0

public actual fun utrace_functionName(fnnumber: Int): PCSTR =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_functionName(fnnumber)

public actual fun utrace_getFunctions(context: Long, e: Long, x: Long, d: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_getFunctions(context, e, x, d)
}

public actual fun utrace_getLevel(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_getLevel()

public actual fun utrace_setFunctions(context: Long, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_setFunctions(context, e.toLong(), x.toLong(), d.toLong())
}

public actual fun utrace_setLevel(tracelevel: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_setLevel(tracelevel)
}

public actual fun utrace_vformat(outbuf: PCSTR, capacity: Int, indent: Int, fmt: PCSTR, args: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrace_vformat(outbuf, capacity, indent, fmt, args)

public actual fun utrans_clone(trans: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_clone(trans, status)

public actual fun utrans_close(trans: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_close(trans)
}

public actual fun utrans_countAvailableIDs(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_countAvailableIDs()

public actual fun utrans_getSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_getSourceSet(trans, ignorefilter, fillin, status)

public actual fun utrans_getUnicodeID(trans: Long, resultlength: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_getUnicodeID(trans, resultlength)

public actual fun utrans_openIDs(perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_openIDs(perrorcode)

public actual fun utrans_openInverse(trans: Long, status: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_openInverse(trans, status)

public actual fun utrans_openU(id: Long, idlength: Int, dir: UTransDirection, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_openU(id, idlength, dir, rules, ruleslength, parseerror, perrorcode)

public actual fun utrans_register(adoptedtrans: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_register(adoptedtrans, status)
}

public actual fun utrans_setFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_setFilter(trans, filterpattern, filterpatternlen, status)
}

public actual fun utrans_toRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_toRules(trans, escapeunprintable, result, resultlength, status)

public actual fun utrans_trans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_trans(trans, rep, repfunc, start, limit, status)
}

public actual fun utrans_transIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_transIncremental(trans, rep, repfunc, pos, status)
}

public actual fun utrans_transIncrementalUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_transIncrementalUChars(trans, text, textlength, textcapacity, pos, status)
}

public actual fun utrans_transUChars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_transUChars(trans, text, textlength, textcapacity, start, limit, status)
}

public actual fun utrans_unregisterID(id: Long, idlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utrans_unregisterID(id, idlength)
}
