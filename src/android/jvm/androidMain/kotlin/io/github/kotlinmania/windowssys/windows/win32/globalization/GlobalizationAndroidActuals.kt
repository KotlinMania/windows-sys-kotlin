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

private object WindowsWin32GlobalizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationAdjustCalendarDate(lpcaldatetime: Long, calunit: Int, amount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationCompareStringA(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationCompareStringEx(lplocalename: Long, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationCompareStringOrdinal(lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationCompareStringW(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationConvertDefaultLocale(locale: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(lpsystime: Long, calid: Int, lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumCalendarInfoA(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumCalendarInfoExA(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(pcalinfoenumprocexex: Long, lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumCalendarInfoExW(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumCalendarInfoW(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumDateFormatsA(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumDateFormatsExA(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumDateFormatsExEx(lpdatefmtenumprocexex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumDateFormatsExW(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumDateFormatsW(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemCodePagesA(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemCodePagesW(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemGeoID(geoclass: Int, parentgeoid: Int, lpgeoenumproc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemGeoNames(geoclass: Int, geoenumproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemLocalesA(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemLocalesEx(lplocaleenumprocex: Long, dwflags: Int, lparam: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumSystemLocalesW(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumTimeFormatsA(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumTimeFormatsEx(lptimefmtenumprocex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumTimeFormatsW(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumUILanguagesA(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationEnumUILanguagesW(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationFindNLSString(locale: Int, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationFindNLSStringEx(lplocalename: Long, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationFindStringOrdinal(dwfindstringordinalflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationFoldStringA(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationFoldStringW(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetACP(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCPInfo(codepage: Int, lpcpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCPInfoExA(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCPInfoExW(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(lpszlocale: Long, dwflags: Int, lpcaldatetime: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCalendarInfoEx(lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(calendar: Int, lpcalmindatetime: Long, lpcalmaxdatetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCurrencyFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCurrencyFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetCurrencyFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDateFormatA(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDateFormatEx(lplocalename: Long, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int, lpcalendar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDateFormatW(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(pszlanguage: Long, pszlanguageslist: Long, wchlistdelimiter: Short, pclosestdistance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDurationFormat(locale: Int, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetDurationFormatEx(lplocalename: Long, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetFileMUIInfo(dwflags: Int, pcwszfilepath: Long, pfilemuiinfo: Long, pcbfilemuiinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetFileMUIPath(dwflags: Int, pcwszfilepath: Long, pwszlanguage: Long, pcchlanguage: Long, pwszfilemuipath: Long, pcchfilemuipath: Long, pululenumerator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetGeoInfoA(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetGeoInfoEx(location: Long, geotype: Int, geodata: Long, geodatacount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetGeoInfoW(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetLocaleInfoEx(lplocalename: Long, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetNLSVersion(function: Int, locale: Int, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetNLSVersionEx(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetNumberFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetNumberFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetNumberFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetOEMCP(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetStringScripts(dwflags: Int, lpstring: Long, cchstring: Int, lpscripts: Long, cchscripts: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetStringTypeA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetStringTypeExA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetStringTypeExW(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetStringTypeW(dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetSystemDefaultLCID(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetSystemDefaultLangID(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetTextCharset(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetTextCharsetInfo(hdc: Long, lpsig: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetThreadLocale(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetThreadUILanguage(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetTimeFormatA(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetTimeFormatEx(lplocalename: Long, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetTimeFormatW(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUILanguageInfo(dwflags: Int, pwmszlanguage: Long, pwszfallbacklanguages: Long, pcchfallbacklanguages: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserDefaultGeoName(geoname: Long, geonamecount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserDefaultLCID(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserDefaultLangID(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserGeoID(geoclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIdnToAscii(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpasciicharstr: Long, cchasciichar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIdnToNameprepUnicode(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpnameprepcharstr: Long, cchnameprepchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIdnToUnicode(dwflags: Int, lpasciicharstr: Long, cchasciichar: Int, lpunicodecharstr: Long, cchunicodechar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid: Int, year: Int, era: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage: Int, testchar: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsNLSDefinedString(function: Int, dwflags: Int, lpversioninformation: Long, lpstring: Long, cchstr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsNormalizedString(normform: Int, lpstring: Long, cwlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsTextUnicode(lpv: Long, isize: Int, lpiresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsValidCodePage(codepage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsValidLocale(locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsValidLocaleName(lplocalename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsValidNLSVersion(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationIsWellFormedTag(psztag: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLCIDToLocaleName(locale: Int, lpname: Long, cchname: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLCMapStringA(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLCMapStringEx(lplocalename: Long, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLCMapStringW(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLocaleNameToLCID(lpname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMappingDoAction(pbag: Long, dwrangeindex: Int, pszactionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMappingFreePropertyBag(pbag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMappingFreeServices(pserviceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMappingRecognizeText(pserviceinfo: Long, psztext: Long, dwlength: Int, dwindex: Int, poptions: Long, pbag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationMultiByteToWideChar(codepage: Int, dwflags: Int, lpmultibytestr: Long, cbmultibyte: Int, lpwidecharstr: Long, cchwidechar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationNormalizeString(normform: Int, lpsrcstring: Long, cwsrclength: Int, lpdststring: Long, cwdstlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationNotifyUILanguageChange(dwflags: Int, pcwstrnewlanguage: Long, pcwstrpreviouslanguage: Long, dwreserved: Int, pdwstatusrtrn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationResolveLocaleName(lpnametoresolve: Long, lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(snapshot: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptBreak(pwcchars: Long, cchars: Int, psa: Long, psla: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptCPtoX(icp: Int, ftrailing: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptCacheGetHeight(hdc: Long, psc: Long, tmheight: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptFreeCache(psc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetCMap(hdc: Long, psc: Long, pwcinchars: Long, cchars: Int, dwflags: Int, pwoutglyphs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, wglyphid: Short, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, cmaxtags: Int, pfeaturetags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, cmaxtags: Int, plangsystags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetFontProperties(hdc: Long, psc: Long, sfp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetFontScriptTags(hdc: Long, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(hdc: Long, psc: Long, wglyph: Short, pabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptGetProperties(ppsp: Long, pinumscripts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptIsComplex(pwcinchars: Long, cinchars: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptItemize(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptItemizeOpenType(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptPlace(hdc: Long, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptPlaceOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(locale: Int, psds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptShape(hdc: Long, psc: Long, pwcchars: Long, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptShapeOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringAnalyse(hdc: Long, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: Int, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringCPtoX(ssa: Long, icp: Int, ftrailing: Int, px: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringFree(pssa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(ssa: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringGetOrder(ssa: Long, puorder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: Int, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringValidate(ssa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringPLogAttr(ssa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringPSize(ssa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptStringPcOutChars(ssa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, lparameter: Int, wglyphid: Short, pwoutglyphid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptTextOut(hdc: Long, psc: Long, x: Int, y: Int, fuoptions: Int, lprc: Long, psa: Long, pwcreserved: Long, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationScriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetThreadLocale(locale: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(flags: Int, languages: Long, numlanguagesset: Long, snapshot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetThreadUILanguage(langid: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetUserGeoID(geoid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationSetUserGeoName(geoname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationTranslateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUCallbackStop(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationVerifyScripts(dwflags: Int, lplocalescripts: Long, cchlocalescripts: Int, lptestscripts: Long, cchtestscripts: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationWideCharToMultiByte(codepage: Int, dwflags: Int, lpwidecharstr: Long, cchwidechar: Int, lpmultibytestr: Long, cbmultibyte: Int, lpdefaultchar: Long, lpuseddefaultchar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcatA(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcatW(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcmpA(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcmpW(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcmpiA(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcmpiW(lpstring1: Long, lpstring2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcpyA(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcpyW(lpstring1: Long, lpstring2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcpynA(lpstring1: Long, lpstring2: Long, imaxlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrcpynW(lpstring1: Long, lpstring2: Long, imaxlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrlenA(lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationLstrlenW(lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUUcharsToChars(us: Long, cs: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUAustrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUAustrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCatclose(catd: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCatgets(catd: Long, setNum: Int, msgNum: Int, s: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCatopen(name: Long, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharAge(c: Int, versionarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharDigitValue(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharDirection(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharFromName(namechoice: Int, name: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharMirror(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharName(code: Int, namechoice: Int, buffer: Long, bufferlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharType(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCharsToUchars(cs: Long, us: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCleanup()

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUCountChar32(s: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUDigit(ch: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUEnumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUEnumCharTypes(enumrange: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUErrorName(code: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUFoldCase(c: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUForDigit(digit: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUFormatMessage(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUFormatMessageWithError(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetBinaryPropertySet(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetCombiningClass(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetDataVersion(dataversionfillin: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetFcNfkcClosure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetIntPropertyMap(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetIntPropertyValue(c: Int, which: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetNumericValue(c: Int): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetPropertyEnum(alias: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetPropertyName(property: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetPropertyValueEnum(property: Int, alias: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetPropertyValueName(property: Int, value: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetUnicodeVersion(versionarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUGetVersion(versionarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUHasBinaryProperty(c: Int, which: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUInit(status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsIdignorable(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsIdpart(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsIdstart(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsIsocontrol(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsJavaIdpart(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsJavaIdstart(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsMirrored(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsUalphabetic(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsUlowercase(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsUuppercase(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsUwhiteSpace(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsWhitespace(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsalnum(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsalpha(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsbase(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsblank(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIscntrl(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsdefined(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsdigit(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsgraph(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIslower(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsprint(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIspunct(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsspace(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIstitle(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsupper(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUIsxdigit(c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemcasecmp(s1: Long, s2: Long, length: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemcmp(buf1: Long, buf2: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemcpy(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemmove(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemrchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemrchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUMemset(dest: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUParseMessage(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUParseMessageWithError(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUSetMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUShapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromUtf32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrFromWcs(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(s: Long, length: Int, number: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToUtf32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToUtf32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrToWcs(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcasecmp(s1: Long, s2: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcat(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrcspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrlen(s: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrncasecmp(s1: Long, s2: Long, n: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrncat(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrncmp(ucs1: Long, ucs2: Long, n: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrpbrk(string: Long, matchset: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrrchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrrchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrrstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUStrtokR(src: Long, delim: Long, savestate: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUTolower(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUTotitle(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUToupper(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUUastrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUUastrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUUnescape(src: Long, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUUnescapeAt(charat: Long, offset: Long, length: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVersionFromString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVersionFromUstring(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVersionToString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVformatMessage(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVformatMessageWithError(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVparseMessage(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUVparseMessageWithError(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiClose(pbidi: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiCountParagraphs(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiCountRuns(pbidi: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetBaseDirection(text: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetClassCallback(pbidi: Long, fn: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(pbidi: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetDirection(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLevelAt(pbidi: Long, charindex: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLevels(pbidi: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetParaLevel(pbidi: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetProcessedLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetReorderingMode(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetResultLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetText(pbidi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiGetVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiInvertMap(srcmap: Long, destmap: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiIsInverse(pbidi: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(pbidi: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiOpen(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(pbidi: Long, orderparagraphsltr: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiReorderLogical(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiReorderVisual(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetClassCallback(pbidi: Long, newfn: Long, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetInverse(pbidi: Long, isinverse: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetPara(pbidi: Long, text: Long, length: Int, paralevel: Byte, embeddinglevels: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetReorderingMode(pbidi: Long, reorderingmode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(pbidi: Long, reorderingoptions: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiWriteReordered(pbidi: Long, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbidiWriteReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbiditransformClose(pbiditransform: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbiditransformOpen(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbiditransformTransform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: Byte, inorder: Int, outparalevel: Byte, outorder: Int, domirroring: Int, shapingoptions: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUblockGetCode(c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkClose(bi: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkCurrent(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkFirst(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkFollowing(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkGetAvailable(index: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkGetBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkGetLocaleByType(bi: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkGetRuleStatus(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkIsBoundary(bi: Long, offset: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkLast(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkNext(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkOpen(type: Int, locale: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkOpenRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkPreceding(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkPrevious(bi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkRefreshUtext(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkSafeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkSetText(bi: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUbrkSetUtext(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalAdd(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalClear(calendar: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalClearField(cal: Long, field: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalClone(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalClose(cal: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalEquivalentTo(cal1: Long, cal2: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGet(cal: Long, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetAttribute(cal: Long, attr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetDstsavings(zoneid: Long, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetFieldDifference(cal: Long, target: Double, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetGregorianChange(cal: Long, perrorcode: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetLimit(cal: Long, field: Int, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetLocaleByType(cal: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetMillis(cal: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetNow(): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetTzdataVersion(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(cal: Long, type: Int, locale: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetTimeZoneId(cal: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(winid: Long, len: Int, region: Long, id: Long, idcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(cal: Long, type: Int, transition: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetType(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetWeekendTransition(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalInDaylightTime(cal: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalIsSet(cal: Long, field: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalIsWeekend(cal: Long, date: Double, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalOpen(zoneid: Long, len: Int, locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(country: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(zonetype: Int, region: Long, rawoffset: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalOpenTimeZones(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalRoll(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSet(cal: Long, field: Int, value: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetAttribute(cal: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetDate(cal: Long, year: Int, month: Int, date: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(zoneid: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetGregorianChange(cal: Long, date: Double, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetMillis(cal: Long, datetime: Double, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcalSetTimeZone(cal: Long, zoneid: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapClose(csm: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(csm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapGetLocale(csm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapGetOptions(csm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapOpen(locale: Long, options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapSetLocale(csm: Long, locale: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapSetOptions(csm: Long, options: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapToTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposClose(ucfpos: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposConstrainCategory(ucfpos: Long, category: Int, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposConstrainField(ucfpos: Long, category: Int, field: Int, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposGetCategory(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposGetField(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposGetIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(ucfpos: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposMatchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposOpen(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposReset(ucfpos: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(ucfpos: Long, context: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcfposSetState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvClose(converter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCompareNames(name1: Long, name2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvConvert(toconvertername: Long, fromconvertername: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvConvertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCountAliases(alias: Long, perrorcode: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvCountStandards(): Short

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(source: Long, sourcelength: Int, signaturelength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFixFileSeparator(cnv: Long, source: Long, sourcelen: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFlushCache(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(cnv: Long, algorithmictype: Int, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUchars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUcountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvFromUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetAlias(alias: Long, n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetAliases(alias: Long, aliases: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetAvailableName(n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetCcsid(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetCanonicalName(alias: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetDefaultName(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetDisplayName(converter: Long, displaylocale: Long, displayname: Long, displaynamecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetInvalidChars(converter: Long, errbytes: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(converter: Long, erruchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetMinCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetName(converter: Long, err: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetNextUchar(converter: Long, source: Long, sourcelimit: Long, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetPlatform(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetStandard(n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetStandardName(name: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetStarters(converter: Long, starters: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetSubstChars(converter: Long, subchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetToUcallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetType(converter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(cnv: Long, setfillin: Long, whichset: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvIsAmbiguous(cnv: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvIsFixedWidth(cnv: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpen(convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpenAllNames(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpenCcsid(codepage: Int, platform: Int, err: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpenPackage(packagename: Long, convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpenStandardNames(convname: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvOpenU(name: Long, err: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvReset(converter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvResetFromUnicode(converter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvResetToUnicode(converter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSafeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetDefaultName(name: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetFallback(cnv: Long, usesfallback: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetSubstChars(converter: Long, subchars: Long, len: Byte, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetSubstString(cnv: Long, s: Long, length: Int, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvSetToUcallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToAlgorithmic(algorithmictype: Int, cnv: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUchars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUcountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvToUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvUsesFallback(cnv: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselClose(sel: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselOpen(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(buffer: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselSelectForString(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcnvselSerialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolCloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolClose(coll: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolCloseElements(elems: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetAttribute(coll: Long, attr: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetBound(source: Long, sourcelength: Int, boundtype: Int, nooflevels: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetDisplayName(objloc: Long, disploc: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(result: Long, resultcapacity: Int, keyword: Long, locale: Long, isavailable: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetKeywordValues(keyword: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetKeywords(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetLocaleByType(coll: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetMaxExpansion(elems: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetMaxVariable(coll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetOffset(elems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetRules(coll: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetRulesEx(coll: Long, delta: Int, buffer: Long, bufferlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetStrength(coll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetTailoredSet(coll: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetUcaversion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetVariableTop(coll: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGetVersion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGreater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolGreaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolKeyHashCode(key: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolMergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolNext(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolNextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolOpen(loc: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolOpenBinary(bin: Long, length: Int, base: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolOpenElements(coll: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolOpenRules(rules: Long, ruleslength: Int, normalizationmode: Int, strength: Int, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolPrevious(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolPrimaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolReset(elems: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSafeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSecondaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetAttribute(coll: Long, attr: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetMaxVariable(coll: Long, group: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetOffset(elems: Long, offset: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetStrength(coll: Long, strength: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolSetText(elems: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolStrcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolStrcollIter(coll: Long, siter: Long, titer: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolStrcollUtf8(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcolTertiaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcpmapGet(map: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcpmapGetRange(map: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieClose(trie: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieGet(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieGetRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieGetType(trie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieGetValueWidth(trie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(trie: Long, lt1: Int, t2: Byte, t3: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(type: Int, valuewidth: Int, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcptrieToBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetClose(ucsd: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetDetect(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetDetectAll(ucsd: Long, matchesfound: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(ucsd: Long, filter: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetGetConfidence(ucsm: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetGetLanguage(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetGetName(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetGetUchars(ucsm: Long, buf: Long, cap: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(ucsd: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetOpen(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(ucsd: Long, encoding: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcsdetSetText(ucsd: Long, textin: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrCountCurrencies(locale: Long, date: Double, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrForLocale(locale: Long, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(locale: Long, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(currency: Long, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(currency: Long, usage: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetName(currency: Long, locale: Long, namestyle: Int, ischoiceformat: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetNumericCode(currency: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetPluralName(currency: Long, locale: Long, ischoiceformat: Long, pluralcount: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(currency: Long, ec: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(currency: Long, usage: Int, ec: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrIsAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(currtype: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrRegister(isocode: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUcurrUnregister(key: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(fmt: Long, numberformattoadopt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatApplyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatClose(format: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatCountSymbols(fmt: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatFormat(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatFormatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatFormatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(fmt: Long, attr: Int, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetCalendar(fmt: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetNumberFormat(fmt: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(fmt: Long, field: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatGetSymbols(fmt: Long, type: Int, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatIsLenient(fmt: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatOpen(timestyle: Int, datestyle: Int, locale: Long, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatParse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatParseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(fmt: Long, d: Double, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(fmt: Long, attr: Int, newvalue: Byte, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetCalendar(fmt: Long, calendartoset: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetLenient(fmt: Long, islenient: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetNumberFormat(fmt: Long, numberformattoset: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatSetSymbols(format: Long, type: Int, symbolindex: Int, value: Long, valuelength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatToCalendarDateField(field: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatToPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgAddPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgClone(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgClose(dtpg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetDecimal(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(dtpg: Long, field: Int, width: Int, fieldname: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgGetSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgOpen(locale: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgOpenEmpty(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(dtpg: Long, dtformat: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdatpgSetDecimal(dtpg: Long, decimal: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtClose(formatter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtFormat(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtOpen(locale: Long, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumClose(en: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumCount(en: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumNext(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumReset(en: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUenumUnext(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfieldpositerClose(fpositer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfieldpositerNext(fpositer: Long, beginindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfieldpositerOpen(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtClose(fmt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(fmt: Long, n: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetArrayLength(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetDate(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetDecNumChars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetDouble(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetInt64(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetLong(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetObject(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetType(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtGetUchars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtIsNumeric(fmt: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtOpen(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtvalGetString(ufmtval: Long, plength: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUfmtvalNextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUgenderGetInstance(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUgenderGetListGender(genderinfo: Long, genders: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaClose(idna: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaLabelToAscii(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaLabelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaNameToAscii(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaNameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUidnaOpenUts46(options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterCurrent32(iter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterGetState(iter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterNext32(iter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterPrevious32(iter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterSetState(iter: Long, state: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterSetString(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterSetUtf16Be(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUiterSetUtf8(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnClose(ldn: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnGetContext(ldn: Long, type: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnGetDialectHandling(ldn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnGetLocale(ldn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnKeyDisplayName(ldn: Long, key: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(ldn: Long, key: Long, value: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnLanguageDisplayName(ldn: Long, lang: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnLocaleDisplayName(ldn: Long, locale: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnOpen(locale: Long, dialecthandling: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnOpenForContext(locale: Long, contexts: Long, length: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnRegionDisplayName(ldn: Long, region: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(ldn: Long, scriptcode: Int, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnScriptDisplayName(ldn: Long, script: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUldnVariantDisplayName(ldn: Long, variant: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtClose(listfmt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtFormat(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtOpenForType(locale: Long, type: Int, width: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlistfmtResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocAcceptLanguage(result: Long, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(result: Long, resultavailable: Int, outresult: Long, httpacceptlanguage: Long, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocAddLikelySubtags(localeid: Long, maximizedlocaleid: Long, maximizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocCanonicalize(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocForLanguageTag(langtag: Long, localeid: Long, localeidcapacity: Int, parsedlength: Long, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetAvailable(n: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetBaseName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetCountry(localeid: Long, country: Long, countrycapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDefault(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayCountry(locale: Long, displaylocale: Long, country: Long, countrycapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(locale: Long, keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(locale: Long, displaylocale: Long, language: Long, languagecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayName(localeid: Long, inlocaleid: Long, result: Long, maxresultsize: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayScript(locale: Long, displaylocale: Long, script: Long, scriptcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetDisplayVariant(locale: Long, displaylocale: Long, variant: Long, variantcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetIso3Country(localeid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetIso3Language(localeid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetIsocountries(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetIsolanguages(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetKeywordValue(localeid: Long, keywordname: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetLcid(localeid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetLanguage(localeid: Long, language: Long, languagecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetLineOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(hostid: Int, locale: Long, localecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetParent(localeid: Long, parent: Long, parentcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetScript(localeid: Long, script: Long, scriptcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocGetVariant(localeid: Long, variant: Long, variantcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocIsRightToLeft(locale: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocMinimizeSubtags(localeid: Long, minimizedlocaleid: Long, minimizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocOpenAvailableByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocOpenKeywords(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocSetDefault(localeid: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocSetKeywordValue(keywordname: Long, keywordvalue: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocToLanguageTag(localeid: Long, langtag: Long, langtagcapacity: Int, strict: Byte, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocToLegacyKey(keyword: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocToLegacyType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(keyword: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataClose(uld: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetCldrversion(versionarray: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetDelimiter(uld: Long, type: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(uld: Long, fillin: Long, options: Int, extype: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(uld: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataGetPaperSize(localeid: Long, height: Long, width: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataOpen(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(uld: Long, setting: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgApplyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgClose(format: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgFormat(fmt: Long, result: Long, resultlength: Int, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgGetLocale(fmt: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgOpen(pattern: Long, patternlength: Int, locale: Long, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgParse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgSetLocale(fmt: Long, locale: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgToPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgVformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmsgVparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(trie: Long, type: Int, valuewidth: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieClone(other: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieClose(trie: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(map: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(trie: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieGet(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieGetRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieOpen(initialvalue: Int, errorvalue: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieSet(trie: Long, c: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUmutablecptrieSetRange(trie: Long, start: Int, end: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2Append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2Close(norm2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2ComposePair(norm2: Long, a: Int, b: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetInstance(packagename: Long, name: Long, mode: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2IsInert(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2IsNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2Normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2OpenFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2QuickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnormCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumApplyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumClose(fmt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumCountAvailable(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormat(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatDecimal(fmt: Long, number: Long, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumFormatUformattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetAttribute(fmt: Long, attr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(fmt: Long, attr: Int): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetSymbol(fmt: Long, symbol: Int, buffer: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumGetTextAttribute(fmt: Long, tag: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumOpen(style: Int, pattern: Long, patternlength: Int, locale: Long, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: Long, outbuflength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumParseToUformattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumSetAttribute(fmt: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumSetContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(fmt: Long, attr: Int, newvalue: Double)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumSetSymbol(fmt: Long, symbol: Int, value: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumSetTextAttribute(fmt: Long, tag: Int, newvalue: Long, newvaluelength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumToPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfClose(uformatter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfFormatDecimal(uformatter: Long, value: Long, valuelen: Int, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfFormatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfFormatInt(uformatter: Long, value: Long, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: Long, perror: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumfResultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysClose(unumsys: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysGetDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysGetName(unumsys: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysGetRadix(unumsys: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(unumsys: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUnumsysOpenByName(name: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesClose(uplrules: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesGetKeywords(uplrules: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesOpenForType(locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesSelect(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUplrulesSelectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexAppendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(regexp: Long, replacementtext: Long, dest: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexAppendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexAppendTailUtext(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexClone(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexClose(regexp: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexEnd(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexEnd64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexFind(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexFind64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexFindNext(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexFlags(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetStackLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetText(regexp: Long, textlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetTimeLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGetUtext(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGroup(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGroupCount(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGroupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexGroupUtext(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexHasTransparentBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexHitEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexLookingAt(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexLookingAt64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexMatches(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexMatches64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexOpen(pattern: Long, patternlength: Int, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexOpenC(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexOpenUtext(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexPattern(regexp: Long, patlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexPatternUtext(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRefreshUtext(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRegionEnd(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRegionEnd64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRegionStart(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRegionStart64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReplaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReplaceAllUtext(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReplaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexRequireEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReset(regexp: Long, index: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexReset64(regexp: Long, index: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetStackLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetText(regexp: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetTimeLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSetUtext(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSplit(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexSplitUtext(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexStart(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexStart64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregexUseTransparentBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionAreEqual(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionContains(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetAvailable(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetContainedRegions(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(uregion: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetContainingRegion(uregion: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(uregion: Long, type: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetNumericCode(uregion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetPreferredValues(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetRegionCode(uregion: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetRegionFromCode(regioncode: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(code: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUregionGetType(uregion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtClose(reldatefmt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtCloseResult(ufrdt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtFormat(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtOpen(locale: Long, nftoadopt: Long, width: Int, capitalizationcontext: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(ufrdt: Long, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresClose(resourcebundle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetBinary(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetByKey(resourcebundle: Long, key: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetInt(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetIntVector(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetKey(resourcebundle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetLocaleByType(resourcebundle: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetNextResource(resourcebundle: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetSize(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetString(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetStringByKey(resb: Long, key: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetType(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetUint(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetUtf8String(resb: Long, dest: Long, length: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(resb: Long, stringindex: Int, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(resb: Long, key: Long, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresGetVersion(resb: Long, versioninfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresHasNext(resourcebundle: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresOpen(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresOpenAvailableLocales(packagename: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresOpenDirect(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresOpenU(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUresResetIterator(resourcebundle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetCode(nameorabbrorlocale: Long, fillin: Long, capacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetSampleString(script: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetScript(codepoint: Int, err: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetShortName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptGetUsage(script: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptHasScript(c: Int, sc: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptIsCased(script: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchClose(searchiter: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchFirst(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchFollowing(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetAttribute(strsrch: Long, attribute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetBreakIterator(strsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetCollator(strsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetMatchedLength(strsrch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetMatchedStart(strsrch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetOffset(strsrch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetPattern(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchGetText(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchLast(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchNext(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchOpen(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchOpenFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchPreceding(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchPrevious(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchReset(strsrch: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetAttribute(strsrch: Long, attribute: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetBreakIterator(strsrch: Long, breakiter: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetCollator(strsrch: Long, collator: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetOffset(strsrch: Long, position: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsearchSetText(strsrch: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetAdd(set: Long, c: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetAddAll(set: Long, additionalset: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetAddAllCodePoints(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetAddRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetAddString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(set: Long, prop: Int, value: Int, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetApplyPattern(set: Long, pattern: Long, patternlength: Int, options: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetCharAt(set: Long, charindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetClear(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetClone(set: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetCloneAsThawed(set: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetClose(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetCloseOver(set: Long, attributes: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetCompact(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetComplement(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetComplementAll(set: Long, complement: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsAll(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsNone(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsRange(set: Long, start: Int, end: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsSome(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetContainsString(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetEquals(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetFreeze(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetGetItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetGetItemCount(set: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetGetSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(set: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetGetSerializedSet(fillset: Long, src: Long, srclength: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetIndexOf(set: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetIsEmpty(set: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetIsFrozen(set: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetOpen(start: Int, end: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetOpenEmpty(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetOpenPattern(pattern: Long, patternlength: Int, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetOpenPatternOptions(pattern: Long, patternlength: Int, options: Int, ec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRemove(set: Long, c: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRemoveAll(set: Long, removeset: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRemoveAllStrings(set: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRemoveRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRemoveString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetResemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRetain(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetRetainAll(set: Long, retain: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSerialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSerializedContains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSet(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSetSerializedToOne(fillset: Long, c: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSize(set: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSpan(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSpanBack(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSpanBackUtf8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetSpanUtf8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsetToPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofAreConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofCheck(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofCheck2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofCheck2Utf8(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofCheckUtf8(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofClone(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofClose(sc: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofCloseCheckResult(checkresult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetAllowedChars(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(checkresult: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetChecks(sc: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetInclusionSet(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(sc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetSkeleton(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofOpen(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofOpenCheckResult(status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofOpenFromSource(confusables: Long, confusableslen: Int, confusableswholescript: Long, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofSerialize(sc: Long, data: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofSetAllowedChars(sc: Long, chars: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(sc: Long, localeslist: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofSetChecks(sc: Long, checks: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(sc: Long, restrictionlevel: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsprepClose(profile: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsprepOpen(path: Long, filename: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsprepOpenByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUsprepPrepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextChar32At(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextClone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextClose(ut: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextCopy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextCurrent32(ut: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextEquals(a: Long, b: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextExtract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextFreeze(ut: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextGetNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextHasMetaData(ut: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextIsLengthExpensive(ut: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextIsWritable(ut: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextMoveIndex32(ut: Long, delta: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextNativeLength(ut: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextNext32(ut: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextNext32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextOpenUchars(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextOpenUtf8(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextPrevious32(ut: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextPrevious32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextReplace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextSetNativeIndex(ut: Long, nativeindex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtextSetup(ut: Long, extraspace: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtf8Back1SafeBody(s: Long, start: Int, i: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtmscaleFromInt64(othertime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(timescale: Int, value: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtmscaleToInt64(universaltime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceFormat(outbuf: Long, capacity: Int, indent: Int, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceFunctionName(fnnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceGetFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceGetLevel(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceSetFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel: Int)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtraceVformat(outbuf: Long, capacity: Int, indent: Int, fmt: Long, args: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransClone(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransClose(trans: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransCountAvailableIds(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransGetSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransGetUnicodeId(trans: Long, resultlength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransOpenIds(perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransOpenInverse(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransOpenU(id: Long, idlength: Int, dir: Int, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransRegister(adoptedtrans: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransSetFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransToRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransTrans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransTransIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransTransUchars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GlobalizationUtransUnregisterId(id: Long, idlength: Int)
}

public actual fun adjustCalendarDate(lpcaldatetime: MutPtr<Caldatetime>, calunit: CaldatetimeDateunit, amount: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationAdjustCalendarDate(lpcaldatetime.rawAddress, calunit, amount)

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: ConstPtr<Byte>, cchcount1: Int, lpstring2: ConstPtr<Byte>, cchcount2: Int): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationCompareStringA(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress, cchcount1, lpstring2.rawAddress, cchcount2)

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, lparam: Lparam): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationCompareStringEx(lplocalename.rawAddress, dwcmpflags.toInt(), lpstring1.rawAddress, cchcount1, lpstring2.rawAddress, cchcount2, lpversioninformation.rawAddress, lpreserved.rawAddress, lparam)

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationCompareStringOrdinal(lpstring1.rawAddress, cchcount1, lpstring2.rawAddress, cchcount2, bignorecase)

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationCompareStringW(locale.toInt(), dwcmpflags.toInt(), lpstring1.rawAddress, cchcount1, lpstring2.rawAddress, cchcount2)

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: ConstPtr<Caldatetime>, lpsystime: MutPtr<Systemtime>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationConvertCalDateTimeToSystemTime(lpcaldatetime.rawAddress, lpsystime.rawAddress)

public actual fun convertDefaultLocale(locale: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationConvertDefaultLocale(locale.toInt()).toUInt()

public actual fun convertSystemTimeToCalDateTime(lpsystime: ConstPtr<Systemtime>, calid: UInt, lpcaldatetime: MutPtr<Caldatetime>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationConvertSystemTimeToCalDateTime(lpsystime.rawAddress, calid.toInt(), lpcaldatetime.rawAddress)

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumCalendarInfoA(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumCalendarInfoExA(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumCalendarInfoExEx(0L, lplocalename.rawAddress, calendar.toInt(), lpreserved.rawAddress, caltype.toInt(), lparam)

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumCalendarInfoExW(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumCalendarInfoW(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumDateFormatsA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumDateFormatsExA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumDateFormatsExEx(0L, lplocalename.rawAddress, dwflags.toInt(), lparam)

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumDateFormatsExW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumDateFormatsW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesA(0L, languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumLanguageGroupLocalesW(0L, languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemCodePagesA(0L, dwflags.toInt())

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemCodePagesW(0L, dwflags.toInt())

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemGeoID(geoclass.toInt(), parentgeoid, 0L)

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemGeoNames(geoclass.toInt(), 0L, data)

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsA(0L, dwflags.toInt(), lparam)

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemLanguageGroupsW(0L, dwflags.toInt(), lparam)

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemLocalesA(0L, dwflags.toInt())

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemLocalesEx(0L, dwflags.toInt(), lparam, lpreserved.rawAddress)

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumSystemLocalesW(0L, dwflags.toInt())

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumTimeFormatsA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumTimeFormatsEx(0L, lplocalename.rawAddress, dwflags.toInt(), lparam)

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumTimeFormatsW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumUILanguagesA(0L, dwflags.toInt(), lparam)

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationEnumUILanguagesW(0L, dwflags.toInt(), lparam)

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationFindNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), lpstringsource.rawAddress, cchsource, lpstringvalue.rawAddress, cchvalue, pcchfound.rawAddress)

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: MutPtr<Int>, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationFindNLSStringEx(lplocalename.rawAddress, dwfindnlsstringflags.toInt(), lpstringsource.rawAddress, cchsource, lpstringvalue.rawAddress, cchvalue, pcchfound.rawAddress, lpversioninformation.rawAddress, lpreserved.rawAddress, sorthandle)

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationFindStringOrdinal(dwfindstringordinalflags.toInt(), lpstringsource.rawAddress, cchsource, lpstringvalue.rawAddress, cchvalue, bignorecase)

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationFoldStringA(dwmapflags.toInt(), lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationFoldStringW(dwmapflags.toInt(), lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun getACP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetACP().toUInt()

public actual fun getCPInfo(codepage: UInt, lpcpinfo: MutPtr<Cpinfo>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCPInfo(codepage.toInt(), lpcpinfo.rawAddress)

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexa>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCPInfoExA(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress)

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: MutPtr<Cpinfoexw>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCPInfoExW(codepage.toInt(), dwflags.toInt(), lpcpinfoex.rawAddress)

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: ConstPtr<Caldatetime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCalendarDateFormatEx(lpszlocale.rawAddress, dwflags.toInt(), lpcaldatetime.rawAddress, lpformat.rawAddress, lpdatestr.rawAddress, cchdate)

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress, cchdata, lpvalue.rawAddress)

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCalendarInfoEx(lplocalename.rawAddress, calendar.toInt(), lpreserved.rawAddress, caltype.toInt(), lpcaldata.rawAddress, cchdata, lpvalue.rawAddress)

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress, cchdata, lpvalue.rawAddress)

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: MutPtr<Caldatetime>, lpcalmaxdatetime: MutPtr<Caldatetime>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCalendarSupportedDateRange(calendar.toInt(), lpcalmindatetime.rawAddress, lpcalmaxdatetime.rawAddress)

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Currencyfmta>, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCurrencyFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpcurrencystr.rawAddress, cchcurrency)

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCurrencyFormatEx(lplocalename.rawAddress, dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpcurrencystr.rawAddress, cchcurrency)

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Currencyfmtw>, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetCurrencyFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpcurrencystr.rawAddress, cchcurrency)

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDateFormatA(locale.toInt(), dwflags.toInt(), lpdate.rawAddress, lpformat.rawAddress, lpdatestr.rawAddress, cchdate)

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDateFormatEx(lplocalename.rawAddress, dwflags.toInt(), lpdate.rawAddress, lpformat.rawAddress, lpdatestr.rawAddress, cchdate, lpcalendar.rawAddress)

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: ConstPtr<Systemtime>, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDateFormatW(locale.toInt(), dwflags.toInt(), lpdate.rawAddress, lpformat.rawAddress, lpdatestr.rawAddress, cchdate)

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: MutPtr<Double>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDistanceOfClosestLanguageInList(pszlanguage.rawAddress, pszlanguageslist.rawAddress, wchlistdelimiter.toShort(), pclosestdistance.rawAddress)

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDurationFormat(locale.toInt(), dwflags.toInt(), lpduration.rawAddress, ullduration.toLong(), lpformat.rawAddress, lpdurationstr.rawAddress, cchduration)

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: ConstPtr<Systemtime>, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetDurationFormatEx(lplocalename.rawAddress, dwflags.toInt(), lpduration.rawAddress, ullduration.toLong(), lpformat.rawAddress, lpdurationstr.rawAddress, cchduration)

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: MutPtr<Filemuiinfo>, pcbfilemuiinfo: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetFileMUIInfo(dwflags.toInt(), pcwszfilepath.rawAddress, pfilemuiinfo.rawAddress, pcbfilemuiinfo.rawAddress)

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: MutPtr<UInt>, pwszfilemuipath: Pwstr, pcchfilemuipath: MutPtr<UInt>, pululenumerator: MutPtr<ULong>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetFileMUIPath(dwflags.toInt(), pcwszfilepath.rawAddress, pwszlanguage.rawAddress, pcchlanguage.rawAddress, pwszfilemuipath.rawAddress, pcchfilemuipath.rawAddress, pululenumerator.rawAddress)

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetGeoInfoA(location, geotype, lpgeodata.rawAddress, cchdata, langid.toShort())

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetGeoInfoEx(location.rawAddress, geotype, geodata.rawAddress, geodatacount)

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetGeoInfoW(location, geotype, lpgeodata.rawAddress, cchdata, langid.toShort())

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress, cchdata)

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetLocaleInfoEx(lplocalename.rawAddress, lctype.toInt(), lplcdata.rawAddress, cchdata)

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress, cchdata)

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: MutPtr<Nlsversioninfo>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetNLSVersion(function.toInt(), locale.toInt(), lpversioninformation.rawAddress)

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: MutPtr<Nlsversioninfoex>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetNLSVersionEx(function.toInt(), lplocalename.rawAddress, lpversioninformation.rawAddress)

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: ConstPtr<Numberfmta>, lpnumberstr: Pstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetNumberFormatA(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpnumberstr.rawAddress, cchnumber)

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetNumberFormatEx(lplocalename.rawAddress, dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpnumberstr.rawAddress, cchnumber)

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: ConstPtr<Numberfmtw>, lpnumberstr: Pwstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetNumberFormatW(locale.toInt(), dwflags.toInt(), lpvalue.rawAddress, lpformat.rawAddress, lpnumberstr.rawAddress, cchnumber)

public actual fun getOEMCP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetOEMCP().toUInt()

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetProcessPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress, pwszlanguagesbuffer.rawAddress, pcchlanguagesbuffer.rawAddress)

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetStringScripts(dwflags.toInt(), lpstring.rawAddress, cchstring, lpscripts.rawAddress, cchscripts)

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetStringTypeA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress, cchsrc, lpchartype.rawAddress)

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetStringTypeExA(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress, cchsrc, lpchartype.rawAddress)

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetStringTypeExW(locale.toInt(), dwinfotype.toInt(), lpsrcstr.rawAddress, cchsrc, lpchartype.rawAddress)

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: MutPtr<UShort>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetStringTypeW(dwinfotype.toInt(), lpsrcstr.rawAddress, cchsrc, lpchartype.rawAddress)

public actual fun getSystemDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetSystemDefaultLCID().toUInt()

public actual fun getSystemDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetSystemDefaultLangID().toUShort()

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetSystemDefaultLocaleName(lplocalename.rawAddress, cchlocalename)

public actual fun getSystemDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetSystemDefaultUILanguage().toUShort()

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetSystemPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress, pwszlanguagesbuffer.rawAddress, pcchlanguagesbuffer.rawAddress)

public actual fun getTextCharset(hdc: Hdc): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetTextCharset(hdc.rawAddress)

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: MutPtr<Fontsignature>, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetTextCharsetInfo(hdc.rawAddress, lpsig.rawAddress, dwflags.toInt())

public actual fun getThreadLocale(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetThreadLocale().toUInt()

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetThreadPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress, pwszlanguagesbuffer.rawAddress, pcchlanguagesbuffer.rawAddress)

public actual fun getThreadUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetThreadUILanguage().toUShort()

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetTimeFormatA(locale.toInt(), dwflags.toInt(), lptime.rawAddress, lpformat.rawAddress, lptimestr.rawAddress, cchtime)

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetTimeFormatEx(lplocalename.rawAddress, dwflags.toInt(), lptime.rawAddress, lpformat.rawAddress, lptimestr.rawAddress, cchtime)

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: ConstPtr<Systemtime>, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetTimeFormatW(locale.toInt(), dwflags.toInt(), lptime.rawAddress, lpformat.rawAddress, lptimestr.rawAddress, cchtime)

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: MutPtr<UInt>, pattributes: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUILanguageInfo(dwflags.toInt(), pwmszlanguage.rawAddress, pwszfallbacklanguages.rawAddress, pcchfallbacklanguages.rawAddress, pattributes.rawAddress)

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserDefaultGeoName(geoname.rawAddress, geonamecount)

public actual fun getUserDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserDefaultLCID().toUInt()

public actual fun getUserDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserDefaultLangID().toUShort()

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserDefaultLocaleName(lplocalename.rawAddress, cchlocalename)

public actual fun getUserDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserDefaultUILanguage().toUShort()

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserGeoID(geoclass)

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: MutPtr<UInt>, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationGetUserPreferredUILanguages(dwflags.toInt(), pulnumlanguages.rawAddress, pwszlanguagesbuffer.rawAddress, pcchlanguagesbuffer.rawAddress)

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIdnToAscii(dwflags.toInt(), lpunicodecharstr.rawAddress, cchunicodechar, lpasciicharstr.rawAddress, cchasciichar)

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIdnToNameprepUnicode(dwflags.toInt(), lpunicodecharstr.rawAddress, cchunicodechar, lpnameprepcharstr.rawAddress, cchnameprepchar)

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIdnToUnicode(dwflags.toInt(), lpasciicharstr.rawAddress, cchasciichar, lpunicodecharstr.rawAddress, cchunicodechar)

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt())

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsDBCSLeadByte(testchar.toByte())

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsDBCSLeadByteEx(codepage.toInt(), testchar.toByte())

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: ConstPtr<Nlsversioninfo>, lpstring: Pcwstr, cchstr: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsNLSDefinedString(function.toInt(), dwflags.toInt(), lpversioninformation.rawAddress, lpstring.rawAddress, cchstr)

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsNormalizedString(normform, lpstring.rawAddress, cwlength)

public actual fun isTextUnicode(lpv: ConstPtr<CVoid>, isize: Int, lpiresult: MutPtr<IsTextUnicodeResult>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsTextUnicode(lpv.rawAddress, isize, lpiresult.rawAddress)

public actual fun isValidCodePage(codepage: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsValidCodePage(codepage.toInt())

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsValidLanguageGroup(languagegroup.toInt(), dwflags.toInt())

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsValidLocale(locale.toInt(), dwflags.toInt())

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsValidLocaleName(lplocalename.rawAddress)

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: ConstPtr<Nlsversioninfoex>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsValidNLSVersion(function.toInt(), lplocalename.rawAddress, lpversioninformation.rawAddress).toUInt()

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationIsWellFormedTag(psztag.rawAddress).toUByte()

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLCIDToLocaleName(locale.toInt(), lpname.rawAddress, cchname, dwflags.toInt())

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLCMapStringA(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: ConstPtr<Nlsversioninfo>, lpreserved: ConstPtr<CVoid>, sorthandle: Lparam): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLCMapStringEx(lplocalename.rawAddress, dwmapflags.toInt(), lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest, lpversioninformation.rawAddress, lpreserved.rawAddress, sorthandle)

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLCMapStringW(locale.toInt(), dwmapflags.toInt(), lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLocaleNameToLCID(lpname.rawAddress, dwflags.toInt()).toUInt()

public actual fun mappingDoAction(pbag: MutPtr<MappingPropertyBag>, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMappingDoAction(pbag.rawAddress, dwrangeindex.toInt(), pszactionid.rawAddress)

public actual fun mappingFreePropertyBag(pbag: ConstPtr<MappingPropertyBag>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMappingFreePropertyBag(pbag.rawAddress)

public actual fun mappingFreeServices(pserviceinfo: ConstPtr<MappingServiceInfo>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMappingFreeServices(pserviceinfo.rawAddress)

public actual fun mappingGetServices(poptions: ConstPtr<MappingEnumOptions>, prgservices: MutPtr<MutPtr<MappingServiceInfo>>, pdwservicescount: MutPtr<UInt>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMappingGetServices(poptions.rawAddress, prgservices.rawAddress, pdwservicescount.rawAddress)

public actual fun mappingRecognizeText(pserviceinfo: ConstPtr<MappingServiceInfo>, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: ConstPtr<MappingOptions>, pbag: MutPtr<MappingPropertyBag>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMappingRecognizeText(pserviceinfo.rawAddress, psztext.rawAddress, dwlength.toInt(), dwindex.toInt(), poptions.rawAddress, pbag.rawAddress)

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationMultiByteToWideChar(codepage.toInt(), dwflags.toInt(), lpmultibytestr.rawAddress, cbmultibyte, lpwidecharstr.rawAddress, cchwidechar)

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationNormalizeString(normform, lpsrcstring.rawAddress, cwsrclength, lpdststring.rawAddress, cwdstlength)

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationNotifyUILanguageChange(dwflags.toInt(), pcwstrnewlanguage.rawAddress, pcwstrpreviouslanguage.rawAddress, dwreserved.toInt(), pdwstatusrtrn.rawAddress)

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationResolveLocaleName(lpnametoresolve.rawAddress, lplocalename.rawAddress, cchlocalename)

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationRestoreThreadPreferredUILanguages(snapshot.rawAddress)
}

public actual fun scriptApplyDigitSubstitution(psds: ConstPtr<ScriptDigitsubstitute>, psc: MutPtr<ScriptControl>, pss: MutPtr<ScriptState>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptApplyDigitSubstitution(psds.rawAddress, psc.rawAddress, pss.rawAddress)

public actual fun scriptApplyLogicalWidth(pidx: ConstPtr<Int>, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pabc: MutPtr<Abc>, pijustify: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptApplyLogicalWidth(pidx.rawAddress, cchars, cglyphs, pwlogclust.rawAddress, psva.rawAddress, piadvance.rawAddress, psa.rawAddress, pabc.rawAddress, pijustify.rawAddress)

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: ConstPtr<ScriptAnalysis>, psla: MutPtr<ScriptLogattr>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptBreak(pwcchars.rawAddress, cchars, psa.rawAddress, psla.rawAddress)

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, pix: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptCPtoX(icp, ftrailing, cchars, cglyphs, pwlogclust.rawAddress, psva.rawAddress, piadvance.rawAddress, psa.rawAddress, pix.rawAddress)

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, tmheight: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptCacheGetHeight(hdc.rawAddress, psc.rawAddress, tmheight.rawAddress)

public actual fun scriptFreeCache(psc: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptFreeCache(psc.rawAddress)

public actual fun scriptGetCMap(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: MutPtr<UShort>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetCMap(hdc.rawAddress, psc.rawAddress, pwcinchars.rawAddress, cchars, dwflags.toInt(), pwoutglyphs.rawAddress)

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: MutPtr<UShort>, pcalternates: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetFontAlternateGlyphs(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toShort(), cmaxalternates, palternateglyphs.rawAddress, pcalternates.rawAddress)

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetFontFeatureTags(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), taglangsys.toInt(), cmaxtags, pfeaturetags.rawAddress, pctags.rawAddress)

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, cmaxtags: Int, plangsystags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetFontLanguageTags(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), cmaxtags, plangsystags.rawAddress, pctags.rawAddress)

public actual fun scriptGetFontProperties(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, sfp: MutPtr<ScriptFontproperties>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetFontProperties(hdc.rawAddress, psc.rawAddress, sfp.rawAddress)

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, cmaxtags: Int, pscripttags: MutPtr<UInt>, pctags: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetFontScriptTags(hdc.rawAddress, psc.rawAddress, psa.rawAddress, cmaxtags, pscripttags.rawAddress, pctags.rawAddress)

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, wglyph: UShort, pabc: MutPtr<Abc>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetGlyphABCWidth(hdc.rawAddress, psc.rawAddress, wglyph.toShort(), pabc.rawAddress)

public actual fun scriptGetLogicalWidths(psa: ConstPtr<ScriptAnalysis>, cchars: Int, cglyphs: Int, piglyphwidth: ConstPtr<Int>, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, pidx: ConstPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetLogicalWidths(psa.rawAddress, cchars, cglyphs, piglyphwidth.rawAddress, pwlogclust.rawAddress, psva.rawAddress, pidx.rawAddress)

public actual fun scriptGetProperties(ppsp: MutPtr<MutPtr<MutPtr<ScriptProperties>>>, pinumscripts: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptGetProperties(ppsp.rawAddress, pinumscripts.rawAddress)

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptIsComplex(pwcinchars.rawAddress, cinchars, dwflags.toInt())

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pcitems: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptItemize(pwcinchars.rawAddress, cinchars, cmaxitems, pscontrol.rawAddress, psstate.rawAddress, pitems.rawAddress, pcitems.rawAddress)

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pitems: MutPtr<ScriptItem>, pscripttags: MutPtr<UInt>, pcitems: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptItemizeOpenType(pwcinchars.rawAddress, cinchars, cmaxitems, pscontrol.rawAddress, psstate.rawAddress, pitems.rawAddress, pscripttags.rawAddress, pcitems.rawAddress)

public actual fun scriptJustify(psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptJustify(psva.rawAddress, piadvance.rawAddress, cglyphs, idx, iminkashida, pijustify.rawAddress)

public actual fun scriptLayout(cruns: Int, pblevel: ConstPtr<UByte>, pivisualtological: MutPtr<Int>, pilogicaltovisual: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptLayout(cruns, pblevel.rawAddress, pivisualtological.rawAddress, pilogicaltovisual.rawAddress)

public actual fun scriptPlace(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwglyphs: ConstPtr<UShort>, cglyphs: Int, psva: ConstPtr<ScriptVisattr>, psa: MutPtr<ScriptAnalysis>, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptPlace(hdc.rawAddress, psc.rawAddress, pwglyphs.rawAddress, cglyphs, psva.rawAddress, psa.rawAddress, piadvance.rawAddress, pgoffset.rawAddress, pabc.rawAddress)

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, pwlogclust: ConstPtr<UShort>, pcharprops: ConstPtr<ScriptCharprop>, cchars: Int, pwglyphs: ConstPtr<UShort>, pglyphprops: ConstPtr<ScriptGlyphprop>, cglyphs: Int, piadvance: MutPtr<Int>, pgoffset: MutPtr<Goffset>, pabc: MutPtr<Abc>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptPlaceOpenType(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress, rprangeproperties.rawAddress, cranges, pwcchars.rawAddress, pwlogclust.rawAddress, pcharprops.rawAddress, cchars, pwglyphs.rawAddress, pglyphprops.rawAddress, cglyphs, piadvance.rawAddress, pgoffset.rawAddress, pabc.rawAddress)

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: MutPtr<Int>, poutgoffset: MutPtr<Goffset>): Hresult =
    0

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: MutPtr<ScriptDigitsubstitute>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptRecordDigitSubstitution(locale.toInt(), psds.rawAddress)

public actual fun scriptShape(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: MutPtr<ScriptAnalysis>, pwoutglyphs: MutPtr<UShort>, pwlogclust: MutPtr<UShort>, psva: MutPtr<ScriptVisattr>, pcglyphs: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptShape(hdc.rawAddress, psc.rawAddress, pwcchars.rawAddress, cchars, cmaxglyphs, psa.rawAddress, pwoutglyphs.rawAddress, pwlogclust.rawAddress, psva.rawAddress, pcglyphs.rawAddress)

public actual fun scriptShapeOpenType(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: MutPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, rcrangechars: ConstPtr<Int>, rprangeproperties: ConstPtr<ConstPtr<TextrangeProperties>>, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: MutPtr<UShort>, pcharprops: MutPtr<ScriptCharprop>, pwoutglyphs: MutPtr<UShort>, poutglyphprops: MutPtr<ScriptGlyphprop>, pcglyphs: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptShapeOpenType(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), taglangsys.toInt(), rcrangechars.rawAddress, rprangeproperties.rawAddress, cranges, pwcchars.rawAddress, cchars, cmaxglyphs, pwlogclust.rawAddress, pcharprops.rawAddress, pwoutglyphs.rawAddress, poutglyphprops.rawAddress, pcglyphs.rawAddress)

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: ConstPtr<CVoid>, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: ConstPtr<ScriptControl>, psstate: ConstPtr<ScriptState>, pidx: ConstPtr<Int>, ptabdef: ConstPtr<ScriptTabdef>, pbinclass: ConstPtr<UByte>, pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringAnalyse(hdc.rawAddress, pstring.rawAddress, cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, pscontrol.rawAddress, psstate.rawAddress, pidx.rawAddress, ptabdef.rawAddress, pbinclass.rawAddress, pssa.rawAddress)

public actual fun scriptStringCPtoX(ssa: ConstPtr<CVoid>, icp: Int, ftrailing: Bool, px: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringCPtoX(ssa.rawAddress, icp, ftrailing, px.rawAddress)

public actual fun scriptStringFree(pssa: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringFree(pssa.rawAddress)

public actual fun scriptStringGetLogicalWidths(ssa: ConstPtr<CVoid>, pidx: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringGetLogicalWidths(ssa.rawAddress, pidx.rawAddress)

public actual fun scriptStringGetOrder(ssa: ConstPtr<CVoid>, puorder: MutPtr<UInt>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringGetOrder(ssa.rawAddress, puorder.rawAddress)

public actual fun scriptStringOut(ssa: ConstPtr<CVoid>, ix: Int, iy: Int, uoptions: EtoOptions, prc: ConstPtr<Rect>, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringOut(ssa.rawAddress, ix, iy, uoptions.toInt(), prc.rawAddress, iminsel, imaxsel, fdisabled)

public actual fun scriptStringValidate(ssa: ConstPtr<CVoid>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringValidate(ssa.rawAddress)

public actual fun scriptStringXtoCP(ssa: ConstPtr<CVoid>, ix: Int, pich: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringXtoCP(ssa.rawAddress, ix, pich.rawAddress, pitrailing.rawAddress)

public actual fun scriptStringPLogAttr(ssa: ConstPtr<CVoid>): MutPtr<ScriptLogattr> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringPLogAttr(ssa.rawAddress))

public actual fun scriptStringPSize(ssa: ConstPtr<CVoid>): MutPtr<Size> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringPSize(ssa.rawAddress))

public actual fun scriptStringPcOutChars(ssa: ConstPtr<CVoid>): MutPtr<Int> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptStringPcOutChars(ssa.rawAddress))

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, psa: ConstPtr<ScriptAnalysis>, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: MutPtr<UShort>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptSubstituteSingleGlyph(hdc.rawAddress, psc.rawAddress, psa.rawAddress, tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toShort(), pwoutglyphid.rawAddress)

public actual fun scriptTextOut(hdc: Hdc, psc: MutPtr<MutPtr<CVoid>>, x: Int, y: Int, fuoptions: UInt, lprc: ConstPtr<Rect>, psa: ConstPtr<ScriptAnalysis>, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: ConstPtr<UShort>, cglyphs: Int, piadvance: ConstPtr<Int>, pijustify: ConstPtr<Int>, pgoffset: ConstPtr<Goffset>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptTextOut(hdc.rawAddress, psc.rawAddress, x, y, fuoptions.toInt(), lprc.rawAddress, psa.rawAddress, pwcreserved.rawAddress, ireserved, pwglyphs.rawAddress, cglyphs, piadvance.rawAddress, pijustify.rawAddress, pgoffset.rawAddress)

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: ConstPtr<UShort>, psva: ConstPtr<ScriptVisattr>, piadvance: ConstPtr<Int>, psa: ConstPtr<ScriptAnalysis>, picp: MutPtr<Int>, pitrailing: MutPtr<Int>): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationScriptXtoCP(ix, cchars, cglyphs, pwlogclust.rawAddress, psva.rawAddress, piadvance.rawAddress, psa.rawAddress, picp.rawAddress, pitrailing.rawAddress)

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress)

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), lpcaldata.rawAddress)

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetLocaleInfoA(locale.toInt(), lctype.toInt(), lplcdata.rawAddress)

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetLocaleInfoW(locale.toInt(), lctype.toInt(), lplcdata.rawAddress)

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetProcessPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress, pulnumlanguages.rawAddress)

public actual fun setThreadLocale(locale: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetThreadLocale(locale.toInt())

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: MutPtr<UInt>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages(dwflags.toInt(), pwszlanguagesbuffer.rawAddress, pulnumlanguages.rawAddress)

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: MutPtr<UInt>, snapshot: MutPtr<Hsaveduilanguages>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetThreadPreferredUILanguages2(flags.toInt(), languages.rawAddress, numlanguagesset.rawAddress, snapshot.rawAddress)

public actual fun setThreadUILanguage(langid: UShort): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetThreadUILanguage(langid.toShort()).toUShort()

public actual fun setUserGeoID(geoid: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetUserGeoID(geoid)

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationSetUserGeoName(geoname.rawAddress)

public actual fun translateCharsetInfo(lpsrc: MutPtr<UInt>, lpcs: MutPtr<Charsetinfo>, dwflags: TranslateCharsetInfoFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationTranslateCharsetInfo(lpsrc.rawAddress, lpcs.rawAddress, dwflags.toInt())

public actual fun ucnvFromUCallbackEscape(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUCallbackEscape(context.rawAddress, fromuargs.rawAddress, codeunits.rawAddress, length, codepoint, reason, err.rawAddress)
}

public actual fun ucnvFromUCallbackSkip(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSkip(context.rawAddress, fromuargs.rawAddress, codeunits.rawAddress, length, codepoint, reason, err.rawAddress)
}

public actual fun ucnvFromUCallbackStop(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUCallbackStop(context.rawAddress, fromuargs.rawAddress, codeunits.rawAddress, length, codepoint, reason, err.rawAddress)
}

public actual fun ucnvFromUCallbackSubstitute(context: ConstPtr<CVoid>, fromuargs: MutPtr<UConverterFromUnicodeArgs>, codeunits: ConstPtr<UShort>, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUCallbackSubstitute(context.rawAddress, fromuargs.rawAddress, codeunits.rawAddress, length, codepoint, reason, err.rawAddress)
}

public actual fun ucnvToUCallbackEscape(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUCallbackEscape(context.rawAddress, touargs.rawAddress, codeunits.rawAddress, length, reason, err.rawAddress)
}

public actual fun ucnvToUCallbackSkip(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUCallbackSkip(context.rawAddress, touargs.rawAddress, codeunits.rawAddress, length, reason, err.rawAddress)
}

public actual fun ucnvToUCallbackStop(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUCallbackStop(context.rawAddress, touargs.rawAddress, codeunits.rawAddress, length, reason, err.rawAddress)
}

public actual fun ucnvToUCallbackSubstitute(context: ConstPtr<CVoid>, touargs: MutPtr<UConverterToUnicodeArgs>, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUCallbackSubstitute(context.rawAddress, touargs.rawAddress, codeunits.rawAddress, length, reason, err.rawAddress)
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: MutPtr<Caldatetime>): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUpdateCalendarDayOfWeek(lpcaldatetime.rawAddress)

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationVerifyScripts(dwflags.toInt(), lplocalescripts.rawAddress, cchlocalescripts, lptestscripts.rawAddress, cchtestscripts)

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: MutPtr<Bool>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationWideCharToMultiByte(codepage.toInt(), dwflags.toInt(), lpwidecharstr.rawAddress, cchwidechar, lpmultibytestr.rawAddress, cbmultibyte, lpdefaultchar.rawAddress, lpuseddefaultchar.rawAddress)

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcatA(lpstring1.rawAddress, lpstring2.rawAddress))

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcatW(lpstring1.rawAddress, lpstring2.rawAddress))

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcmpA(lpstring1.rawAddress, lpstring2.rawAddress)

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcmpW(lpstring1.rawAddress, lpstring2.rawAddress)

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcmpiA(lpstring1.rawAddress, lpstring2.rawAddress)

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcmpiW(lpstring1.rawAddress, lpstring2.rawAddress)

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcpyA(lpstring1.rawAddress, lpstring2.rawAddress))

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcpyW(lpstring1.rawAddress, lpstring2.rawAddress))

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcpynA(lpstring1.rawAddress, lpstring2.rawAddress, imaxlength))

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrcpynW(lpstring1.rawAddress, lpstring2.rawAddress, imaxlength))

public actual fun lstrlenA(lpstring: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrlenA(lpstring.rawAddress)

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationLstrlenW(lpstring.rawAddress)

public actual fun uUcharsToChars(us: ConstPtr<UShort>, cs: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUUcharsToChars(us.rawAddress, cs.rawAddress, length)
}

public actual fun uAustrcpy(dst: Pcstr, src: ConstPtr<UShort>): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUAustrcpy(dst.rawAddress, src.rawAddress))

public actual fun uAustrncpy(dst: Pcstr, src: ConstPtr<UShort>, n: Int): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUAustrncpy(dst.rawAddress, src.rawAddress, n))

public actual fun uCatclose(catd: MutPtr<UResourceBundle>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCatclose(catd.rawAddress)
}

public actual fun uCatgets(catd: MutPtr<UResourceBundle>, setNum: Int, msgNum: Int, s: ConstPtr<UShort>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCatgets(catd.rawAddress, setNum, msgNum, s.rawAddress, len.rawAddress, ec.rawAddress))

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCatopen(name.rawAddress, locale.rawAddress, ec.rawAddress))

public actual fun uCharAge(c: Int, versionarray: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharAge(c, versionarray.rawAddress)
}

public actual fun uCharDigitValue(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharDigitValue(c)

public actual fun uCharDirection(c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharDirection(c)

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharFromName(namechoice, name.rawAddress, perrorcode.rawAddress)

public actual fun uCharMirror(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharMirror(c)

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharName(code, namechoice, buffer.rawAddress, bufferlength, perrorcode.rawAddress)

public actual fun uCharType(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharType(c)

public actual fun uCharsToUchars(cs: Pcstr, us: MutPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCharsToUchars(cs.rawAddress, us.rawAddress, length)
}

public actual fun uCleanup() {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCleanup()
}

public actual fun uCountChar32(s: ConstPtr<UShort>, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUCountChar32(s.rawAddress, length)

public actual fun uDigit(ch: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUDigit(ch, radix)

public actual fun uEnumCharNames(start: Int, limit: Int, fn: MutPtr<UEnumCharNamesFn>, context: MutPtr<CVoid>, namechoice: UCharNameChoice, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUEnumCharNames(start, limit, fn.rawAddress, context.rawAddress, namechoice, perrorcode.rawAddress)
}

public actual fun uEnumCharTypes(enumrange: MutPtr<UCharEnumTypeRange>, context: ConstPtr<CVoid>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUEnumCharTypes(enumrange.rawAddress, context.rawAddress)
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUErrorName(code))

public actual fun uFoldCase(c: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUFoldCase(c, options.toInt())

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUForDigit(digit, radix)

public actual fun uFormatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUFormatMessage(locale.rawAddress, pattern.rawAddress, patternlength, result.rawAddress, resultlength, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUFormatMessageWithError(locale.rawAddress, pattern.rawAddress, patternlength, result.rawAddress, resultlength, parseerror.rawAddress, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uGetBidiPairedBracket(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetBidiPairedBracket(c)

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetBinaryPropertySet(property, perrorcode.rawAddress))

public actual fun uGetCombiningClass(c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetCombiningClass(c).toUByte()

public actual fun uGetDataVersion(dataversionfillin: MutPtr<UByte>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetDataVersion(dataversionfillin.rawAddress, status.rawAddress)
}

public actual fun uGetFcNfkcClosure(c: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetFcNfkcClosure(c, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPMap> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetIntPropertyMap(property, perrorcode.rawAddress))

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetIntPropertyMaxValue(which)

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetIntPropertyMinValue(which)

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetIntPropertyValue(c, which)

public actual fun uGetNumericValue(c: Int): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetNumericValue(c)

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetPropertyEnum(alias.rawAddress)

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetPropertyName(property, namechoice))

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetPropertyValueEnum(property, alias.rawAddress)

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetPropertyValueName(property, value, namechoice))

public actual fun uGetUnicodeVersion(versionarray: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetUnicodeVersion(versionarray.rawAddress)
}

public actual fun uGetVersion(versionarray: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUGetVersion(versionarray.rawAddress)
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUHasBinaryProperty(c, which)

public actual fun uInit(status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUInit(status.rawAddress)
}

public actual fun uIsIdignorable(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsIdignorable(c)

public actual fun uIsIdpart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsIdpart(c)

public actual fun uIsIdstart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsIdstart(c)

public actual fun uIsIsocontrol(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsIsocontrol(c)

public actual fun uIsJavaIdpart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsJavaIdpart(c)

public actual fun uIsJavaIdstart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsJavaIdstart(c)

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsJavaSpaceChar(c)

public actual fun uIsMirrored(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsMirrored(c)

public actual fun uIsUalphabetic(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsUalphabetic(c)

public actual fun uIsUlowercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsUlowercase(c)

public actual fun uIsUuppercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsUuppercase(c)

public actual fun uIsUwhiteSpace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsUwhiteSpace(c)

public actual fun uIsWhitespace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsWhitespace(c)

public actual fun uIsalnum(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsalnum(c)

public actual fun uIsalpha(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsalpha(c)

public actual fun uIsbase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsbase(c)

public actual fun uIsblank(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsblank(c)

public actual fun uIscntrl(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIscntrl(c)

public actual fun uIsdefined(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsdefined(c)

public actual fun uIsdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsdigit(c)

public actual fun uIsgraph(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsgraph(c)

public actual fun uIslower(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIslower(c)

public actual fun uIsprint(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsprint(c)

public actual fun uIspunct(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIspunct(c)

public actual fun uIsspace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsspace(c)

public actual fun uIstitle(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIstitle(c)

public actual fun uIsupper(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsupper(c)

public actual fun uIsxdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUIsxdigit(c)

public actual fun uMemcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, length: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemcasecmp(s1.rawAddress, s2.rawAddress, length, options.toInt())

public actual fun uMemchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemchr(s.rawAddress, c.toShort(), count))

public actual fun uMemchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemchr32(s.rawAddress, c, count))

public actual fun uMemcmp(buf1: ConstPtr<UShort>, buf2: ConstPtr<UShort>, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemcmp(buf1.rawAddress, buf2.rawAddress, count)

public actual fun uMemcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemcmpCodePointOrder(s1.rawAddress, s2.rawAddress, count)

public actual fun uMemcpy(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemcpy(dest.rawAddress, src.rawAddress, count))

public actual fun uMemmove(dest: MutPtr<UShort>, src: ConstPtr<UShort>, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemmove(dest.rawAddress, src.rawAddress, count))

public actual fun uMemrchr(s: ConstPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemrchr(s.rawAddress, c.toShort(), count))

public actual fun uMemrchr32(s: ConstPtr<UShort>, c: Int, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemrchr32(s.rawAddress, c, count))

public actual fun uMemset(dest: MutPtr<UShort>, c: UShort, count: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUMemset(dest.rawAddress, c.toShort(), count))

public actual fun uParseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUParseMessage(locale.rawAddress, pattern.rawAddress, patternlength, source.rawAddress, sourcelength, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUParseMessageWithError(locale.rawAddress, pattern.rawAddress, patternlength, source.rawAddress, sourcelength, parseerror.rawAddress, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uSetMemoryFunctions(context: ConstPtr<CVoid>, a: MutPtr<UMemAllocFn>, r: MutPtr<UMemReallocFn>, f: MutPtr<UMemFreeFn>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUSetMemoryFunctions(context.rawAddress, a.rawAddress, r.rawAddress, f.rawAddress, status.rawAddress)
}

public actual fun uShapeArabic(source: ConstPtr<UShort>, sourcelength: Int, dest: MutPtr<UShort>, destsize: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUShapeArabic(source.rawAddress, sourcelength, dest.rawAddress, destsize, options.toInt(), perrorcode.rawAddress)

public actual fun uStrCaseCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrCaseCompare(s1.rawAddress, length1, s2.rawAddress, length2, options.toInt(), perrorcode.rawAddress)

public actual fun uStrCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrCompare(s1.rawAddress, length1, s2.rawAddress, length2, codepointorder)

public actual fun uStrCompareIter(iter1: MutPtr<UCharIterator>, iter2: MutPtr<UCharIterator>, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrCompareIter(iter1.rawAddress, iter2.rawAddress, codepointorder)

public actual fun uStrFindFirst(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFindFirst(s.rawAddress, length, substring.rawAddress, sublength))

public actual fun uStrFindLast(s: ConstPtr<UShort>, length: Int, substring: ConstPtr<UShort>, sublength: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFindLast(s.rawAddress, length, substring.rawAddress, sublength))

public actual fun uStrFoldCase(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFoldCase(dest.rawAddress, destcapacity, src.rawAddress, srclength, options.toInt(), perrorcode.rawAddress)

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromJavaModifiedUtf8WithSub(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, subchar, pnumsubstitutions.rawAddress, perrorcode.rawAddress))

public actual fun uStrFromUtf32(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromUtf32(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrFromUtf32WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<Int>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromUtf32WithSub(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, subchar, pnumsubstitutions.rawAddress, perrorcode.rawAddress))

public actual fun uStrFromUtf8(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromUtf8(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrFromUtf8Lenient(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromUtf8Lenient(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrFromUtf8WithSub(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromUtf8WithSub(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, subchar, pnumsubstitutions.rawAddress, perrorcode.rawAddress))

public actual fun uStrFromWcs(dest: MutPtr<UShort>, destcapacity: Int, pdestlength: MutPtr<Int>, src: Pcwstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrFromWcs(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrHasMoreChar32Than(s: ConstPtr<UShort>, length: Int, number: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrHasMoreChar32Than(s.rawAddress, length, number)

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToJavaModifiedUtf8(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrToLower(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToLower(dest.rawAddress, destcapacity, src.rawAddress, srclength, locale.rawAddress, perrorcode.rawAddress)

public actual fun uStrToTitle(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, titleiter: MutPtr<UBreakIterator>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToTitle(dest.rawAddress, destcapacity, src.rawAddress, srclength, titleiter.rawAddress, locale.rawAddress, perrorcode.rawAddress)

public actual fun uStrToUtf32(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToUtf32(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrToUtf32WithSub(dest: MutPtr<Int>, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<Int> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToUtf32WithSub(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, subchar, pnumsubstitutions.rawAddress, perrorcode.rawAddress))

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToUtf8(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, subchar: Int, pnumsubstitutions: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToUtf8WithSub(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, subchar, pnumsubstitutions.rawAddress, perrorcode.rawAddress))

public actual fun uStrToUpper(dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, locale: Pcstr, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToUpper(dest.rawAddress, destcapacity, src.rawAddress, srclength, locale.rawAddress, perrorcode.rawAddress)

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: MutPtr<Int>, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Pwstr =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrToWcs(dest.rawAddress, destcapacity, pdestlength.rawAddress, src.rawAddress, srclength, perrorcode.rawAddress))

public actual fun uStrcasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcasecmp(s1.rawAddress, s2.rawAddress, options.toInt())

public actual fun uStrcat(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcat(dst.rawAddress, src.rawAddress))

public actual fun uStrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrchr(s.rawAddress, c.toShort()))

public actual fun uStrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrchr32(s.rawAddress, c))

public actual fun uStrcmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcmp(s1.rawAddress, s2.rawAddress)

public actual fun uStrcmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcmpCodePointOrder(s1.rawAddress, s2.rawAddress)

public actual fun uStrcpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcpy(dst.rawAddress, src.rawAddress))

public actual fun uStrcspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrcspn(string.rawAddress, matchset.rawAddress)

public actual fun uStrlen(s: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrlen(s.rawAddress)

public actual fun uStrncasecmp(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrncasecmp(s1.rawAddress, s2.rawAddress, n, options.toInt())

public actual fun uStrncat(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrncat(dst.rawAddress, src.rawAddress, n))

public actual fun uStrncmp(ucs1: ConstPtr<UShort>, ucs2: ConstPtr<UShort>, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrncmp(ucs1.rawAddress, ucs2.rawAddress, n)

public actual fun uStrncmpCodePointOrder(s1: ConstPtr<UShort>, s2: ConstPtr<UShort>, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrncmpCodePointOrder(s1.rawAddress, s2.rawAddress, n)

public actual fun uStrncpy(dst: MutPtr<UShort>, src: ConstPtr<UShort>, n: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrncpy(dst.rawAddress, src.rawAddress, n))

public actual fun uStrpbrk(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrpbrk(string.rawAddress, matchset.rawAddress))

public actual fun uStrrchr(s: ConstPtr<UShort>, c: UShort): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrrchr(s.rawAddress, c.toShort()))

public actual fun uStrrchr32(s: ConstPtr<UShort>, c: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrrchr32(s.rawAddress, c))

public actual fun uStrrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrrstr(s.rawAddress, substring.rawAddress))

public actual fun uStrspn(string: ConstPtr<UShort>, matchset: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrspn(string.rawAddress, matchset.rawAddress)

public actual fun uStrstr(s: ConstPtr<UShort>, substring: ConstPtr<UShort>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrstr(s.rawAddress, substring.rawAddress))

public actual fun uStrtokR(src: MutPtr<UShort>, delim: ConstPtr<UShort>, savestate: MutPtr<MutPtr<UShort>>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUStrtokR(src.rawAddress, delim.rawAddress, savestate.rawAddress))

public actual fun uTolower(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUTolower(c)

public actual fun uTotitle(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUTotitle(c)

public actual fun uToupper(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUToupper(c)

public actual fun uUastrcpy(dst: MutPtr<UShort>, src: Pcstr): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUUastrcpy(dst.rawAddress, src.rawAddress))

public actual fun uUastrncpy(dst: MutPtr<UShort>, src: Pcstr, n: Int): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUUastrncpy(dst.rawAddress, src.rawAddress, n))

public actual fun uUnescape(src: Pcstr, dest: MutPtr<UShort>, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUUnescape(src.rawAddress, dest.rawAddress, destcapacity)

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: MutPtr<Int>, length: Int, context: MutPtr<CVoid>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUUnescapeAt(0L, offset.rawAddress, length, context.rawAddress)

public actual fun uVersionFromString(versionarray: MutPtr<UByte>, versionstring: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVersionFromString(versionarray.rawAddress, versionstring.rawAddress)
}

public actual fun uVersionFromUstring(versionarray: MutPtr<UByte>, versionstring: ConstPtr<UShort>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVersionFromUstring(versionarray.rawAddress, versionstring.rawAddress)
}

public actual fun uVersionToString(versionarray: ConstPtr<UByte>, versionstring: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVersionToString(versionarray.rawAddress, versionstring.rawAddress)
}

public actual fun uVformatMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVformatMessage(locale.rawAddress, pattern.rawAddress, patternlength, result.rawAddress, resultlength, ap.rawAddress, status.rawAddress)

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, result: MutPtr<UShort>, resultlength: Int, parseerror: MutPtr<UParseError>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVformatMessageWithError(locale.rawAddress, pattern.rawAddress, patternlength, result.rawAddress, resultlength, parseerror.rawAddress, ap.rawAddress, status.rawAddress)

public actual fun uVparseMessage(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVparseMessage(locale.rawAddress, pattern.rawAddress, patternlength, source.rawAddress, sourcelength, ap.rawAddress, status.rawAddress)
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: ConstPtr<UShort>, patternlength: Int, source: ConstPtr<UShort>, sourcelength: Int, ap: MutPtr<Byte>, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUVparseMessageWithError(locale.rawAddress, pattern.rawAddress, patternlength, source.rawAddress, sourcelength, ap.rawAddress, parseerror.rawAddress, status.rawAddress)
}

public actual fun ubidiClose(pbidi: MutPtr<UBiDi>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiClose(pbidi.rawAddress)
}

public actual fun ubidiCountParagraphs(pbidi: MutPtr<UBiDi>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiCountParagraphs(pbidi.rawAddress)

public actual fun ubidiCountRuns(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiCountRuns(pbidi.rawAddress, perrorcode.rawAddress)

public actual fun ubidiGetBaseDirection(text: ConstPtr<UShort>, length: Int): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetBaseDirection(text.rawAddress, length)

public actual fun ubidiGetClassCallback(pbidi: MutPtr<UBiDi>, fn: MutPtr<UBiDiClassCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetClassCallback(pbidi.rawAddress, fn.rawAddress, context.rawAddress)
}

public actual fun ubidiGetCustomizedClass(pbidi: MutPtr<UBiDi>, c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetCustomizedClass(pbidi.rawAddress, c)

public actual fun ubidiGetDirection(pbidi: ConstPtr<UBiDi>): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetDirection(pbidi.rawAddress)

public actual fun ubidiGetLength(pbidi: ConstPtr<UBiDi>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLength(pbidi.rawAddress)

public actual fun ubidiGetLevelAt(pbidi: ConstPtr<UBiDi>, charindex: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLevelAt(pbidi.rawAddress, charindex).toUByte()

public actual fun ubidiGetLevels(pbidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>): MutPtr<UByte> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLevels(pbidi.rawAddress, perrorcode.rawAddress))

public actual fun ubidiGetLogicalIndex(pbidi: MutPtr<UBiDi>, visualindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLogicalIndex(pbidi.rawAddress, visualindex, perrorcode.rawAddress)

public actual fun ubidiGetLogicalMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLogicalMap(pbidi.rawAddress, indexmap.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiGetLogicalRun(pbidi: ConstPtr<UBiDi>, logicalposition: Int, plogicallimit: MutPtr<Int>, plevel: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetLogicalRun(pbidi.rawAddress, logicalposition, plogicallimit.rawAddress, plevel.rawAddress)
}

public actual fun ubidiGetParaLevel(pbidi: ConstPtr<UBiDi>): UByte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetParaLevel(pbidi.rawAddress).toUByte()

public actual fun ubidiGetParagraph(pbidi: ConstPtr<UBiDi>, charindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetParagraph(pbidi.rawAddress, charindex, pparastart.rawAddress, pparalimit.rawAddress, pparalevel.rawAddress, perrorcode.rawAddress)

public actual fun ubidiGetParagraphByIndex(pbidi: ConstPtr<UBiDi>, paraindex: Int, pparastart: MutPtr<Int>, pparalimit: MutPtr<Int>, pparalevel: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetParagraphByIndex(pbidi.rawAddress, paraindex, pparastart.rawAddress, pparalimit.rawAddress, pparalevel.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiGetProcessedLength(pbidi: ConstPtr<UBiDi>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetProcessedLength(pbidi.rawAddress)

public actual fun ubidiGetReorderingMode(pbidi: MutPtr<UBiDi>): UBiDiReorderingMode =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetReorderingMode(pbidi.rawAddress)

public actual fun ubidiGetReorderingOptions(pbidi: MutPtr<UBiDi>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetReorderingOptions(pbidi.rawAddress).toUInt()

public actual fun ubidiGetResultLength(pbidi: ConstPtr<UBiDi>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetResultLength(pbidi.rawAddress)

public actual fun ubidiGetText(pbidi: ConstPtr<UBiDi>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetText(pbidi.rawAddress))

public actual fun ubidiGetVisualIndex(pbidi: MutPtr<UBiDi>, logicalindex: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetVisualIndex(pbidi.rawAddress, logicalindex, perrorcode.rawAddress)

public actual fun ubidiGetVisualMap(pbidi: MutPtr<UBiDi>, indexmap: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetVisualMap(pbidi.rawAddress, indexmap.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiGetVisualRun(pbidi: MutPtr<UBiDi>, runindex: Int, plogicalstart: MutPtr<Int>, plength: MutPtr<Int>): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiGetVisualRun(pbidi.rawAddress, runindex, plogicalstart.rawAddress, plength.rawAddress)

public actual fun ubidiInvertMap(srcmap: ConstPtr<Int>, destmap: MutPtr<Int>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiInvertMap(srcmap.rawAddress, destmap.rawAddress, length)
}

public actual fun ubidiIsInverse(pbidi: MutPtr<UBiDi>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiIsInverse(pbidi.rawAddress)

public actual fun ubidiIsOrderParagraphsLtr(pbidi: MutPtr<UBiDi>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiIsOrderParagraphsLtr(pbidi.rawAddress)

public actual fun ubidiOpen(): MutPtr<UBiDi> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiOpen())

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDi> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiOpenSized(maxlength, maxruncount, perrorcode.rawAddress))

public actual fun ubidiOrderParagraphsLtr(pbidi: MutPtr<UBiDi>, orderparagraphsltr: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiOrderParagraphsLtr(pbidi.rawAddress, orderparagraphsltr)
}

public actual fun ubidiReorderLogical(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiReorderLogical(levels.rawAddress, length, indexmap.rawAddress)
}

public actual fun ubidiReorderVisual(levels: ConstPtr<UByte>, length: Int, indexmap: MutPtr<Int>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiReorderVisual(levels.rawAddress, length, indexmap.rawAddress)
}

public actual fun ubidiSetClassCallback(pbidi: MutPtr<UBiDi>, newfn: UBiDiClassCallback, newcontext: ConstPtr<CVoid>, oldfn: MutPtr<UBiDiClassCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetClassCallback(pbidi.rawAddress, 0L, newcontext.rawAddress, oldfn.rawAddress, oldcontext.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiSetContext(pbidi: MutPtr<UBiDi>, prologue: ConstPtr<UShort>, prolength: Int, epilogue: ConstPtr<UShort>, epilength: Int, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetContext(pbidi.rawAddress, prologue.rawAddress, prolength, epilogue.rawAddress, epilength, perrorcode.rawAddress)
}

public actual fun ubidiSetInverse(pbidi: MutPtr<UBiDi>, isinverse: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetInverse(pbidi.rawAddress, isinverse)
}

public actual fun ubidiSetLine(pparabidi: ConstPtr<UBiDi>, start: Int, limit: Int, plinebidi: MutPtr<UBiDi>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetLine(pparabidi.rawAddress, start, limit, plinebidi.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiSetPara(pbidi: MutPtr<UBiDi>, text: ConstPtr<UShort>, length: Int, paralevel: UByte, embeddinglevels: MutPtr<UByte>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetPara(pbidi.rawAddress, text.rawAddress, length, paralevel.toByte(), embeddinglevels.rawAddress, perrorcode.rawAddress)
}

public actual fun ubidiSetReorderingMode(pbidi: MutPtr<UBiDi>, reorderingmode: UBiDiReorderingMode) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetReorderingMode(pbidi.rawAddress, reorderingmode)
}

public actual fun ubidiSetReorderingOptions(pbidi: MutPtr<UBiDi>, reorderingoptions: UInt) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiSetReorderingOptions(pbidi.rawAddress, reorderingoptions.toInt())
}

public actual fun ubidiWriteReordered(pbidi: MutPtr<UBiDi>, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiWriteReordered(pbidi.rawAddress, dest.rawAddress, destsize, options.toShort(), perrorcode.rawAddress)

public actual fun ubidiWriteReverse(src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, options: UShort, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbidiWriteReverse(src.rawAddress, srclength, dest.rawAddress, destsize, options.toShort(), perrorcode.rawAddress)

public actual fun ubiditransformClose(pbiditransform: MutPtr<UBiDiTransform>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbiditransformClose(pbiditransform.rawAddress)
}

public actual fun ubiditransformOpen(perrorcode: MutPtr<UErrorCode>): MutPtr<UBiDiTransform> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbiditransformOpen(perrorcode.rawAddress))

public actual fun ubiditransformTransform(pbiditransform: MutPtr<UBiDiTransform>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: MutPtr<UErrorCode>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbiditransformTransform(pbiditransform.rawAddress, src.rawAddress, srclength, dest.rawAddress, destsize, inparalevel.toByte(), inorder, outparalevel.toByte(), outorder, domirroring, shapingoptions.toInt(), perrorcode.rawAddress).toUInt()

public actual fun ublockGetCode(c: Int): UBlockCode =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUblockGetCode(c)

public actual fun ubrkClose(bi: MutPtr<UBreakIterator>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkClose(bi.rawAddress)
}

public actual fun ubrkCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkCountAvailable()

public actual fun ubrkCurrent(bi: ConstPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkCurrent(bi.rawAddress)

public actual fun ubrkFirst(bi: MutPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkFirst(bi.rawAddress)

public actual fun ubrkFollowing(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkFollowing(bi.rawAddress, offset)

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkGetAvailable(index))

public actual fun ubrkGetBinaryRules(bi: MutPtr<UBreakIterator>, binaryrules: MutPtr<UByte>, rulescapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkGetBinaryRules(bi.rawAddress, binaryrules.rawAddress, rulescapacity, status.rawAddress)

public actual fun ubrkGetLocaleByType(bi: ConstPtr<UBreakIterator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkGetLocaleByType(bi.rawAddress, type, status.rawAddress))

public actual fun ubrkGetRuleStatus(bi: MutPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkGetRuleStatus(bi.rawAddress)

public actual fun ubrkGetRuleStatusVec(bi: MutPtr<UBreakIterator>, fillinvec: MutPtr<Int>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkGetRuleStatusVec(bi.rawAddress, fillinvec.rawAddress, capacity, status.rawAddress)

public actual fun ubrkIsBoundary(bi: MutPtr<UBreakIterator>, offset: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkIsBoundary(bi.rawAddress, offset)

public actual fun ubrkLast(bi: MutPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkLast(bi.rawAddress)

public actual fun ubrkNext(bi: MutPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkNext(bi.rawAddress)

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkOpen(type, locale.rawAddress, text.rawAddress, textlength, status.rawAddress))

public actual fun ubrkOpenBinaryRules(binaryrules: ConstPtr<UByte>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkOpenBinaryRules(binaryrules.rawAddress, ruleslength, text.rawAddress, textlength, status.rawAddress))

public actual fun ubrkOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, text: ConstPtr<UShort>, textlength: Int, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkOpenRules(rules.rawAddress, ruleslength, text.rawAddress, textlength, parseerr.rawAddress, status.rawAddress))

public actual fun ubrkPreceding(bi: MutPtr<UBreakIterator>, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkPreceding(bi.rawAddress, offset)

public actual fun ubrkPrevious(bi: MutPtr<UBreakIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkPrevious(bi.rawAddress)

public actual fun ubrkRefreshUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkRefreshUtext(bi.rawAddress, text.rawAddress, status.rawAddress)
}

public actual fun ubrkSafeClone(bi: ConstPtr<UBreakIterator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkSafeClone(bi.rawAddress, stackbuffer.rawAddress, pbuffersize.rawAddress, status.rawAddress))

public actual fun ubrkSetText(bi: MutPtr<UBreakIterator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkSetText(bi.rawAddress, text.rawAddress, textlength, status.rawAddress)
}

public actual fun ubrkSetUtext(bi: MutPtr<UBreakIterator>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUbrkSetUtext(bi.rawAddress, text.rawAddress, status.rawAddress)
}

public actual fun ucalAdd(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalAdd(cal.rawAddress, field, amount, status.rawAddress)
}

public actual fun ucalClear(calendar: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalClear(calendar.rawAddress)
}

public actual fun ucalClearField(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalClearField(cal.rawAddress, field)
}

public actual fun ucalClone(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalClone(cal.rawAddress, status.rawAddress))

public actual fun ucalClose(cal: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalClose(cal.rawAddress)
}

public actual fun ucalCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalCountAvailable()

public actual fun ucalEquivalentTo(cal1: ConstPtr<ConstPtr<CVoid>>, cal2: ConstPtr<ConstPtr<CVoid>>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalEquivalentTo(cal1.rawAddress, cal2.rawAddress)

public actual fun ucalGet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGet(cal.rawAddress, field, status.rawAddress)

public actual fun ucalGetAttribute(cal: ConstPtr<ConstPtr<CVoid>>, attr: UCalendarAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetAttribute(cal.rawAddress, attr)

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetAvailable(localeindex))

public actual fun ucalGetCanonicalTimeZoneId(id: ConstPtr<UShort>, len: Int, result: MutPtr<UShort>, resultcapacity: Int, issystemid: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetCanonicalTimeZoneId(id.rawAddress, len, result.rawAddress, resultcapacity, issystemid.rawAddress, status.rawAddress)

public actual fun ucalGetDstsavings(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetDstsavings(zoneid.rawAddress, ec.rawAddress)

public actual fun ucalGetDayOfWeekType(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): UCalendarWeekdayType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetDayOfWeekType(cal.rawAddress, dayofweek, status.rawAddress)

public actual fun ucalGetDefaultTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetDefaultTimeZone(result.rawAddress, resultcapacity, ec.rawAddress)

public actual fun ucalGetFieldDifference(cal: MutPtr<MutPtr<CVoid>>, target: Double, field: UCalendarDateFields, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetFieldDifference(cal.rawAddress, target, field, status.rawAddress)

public actual fun ucalGetGregorianChange(cal: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetGregorianChange(cal.rawAddress, perrorcode.rawAddress)

public actual fun ucalGetHostTimeZone(result: MutPtr<UShort>, resultcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetHostTimeZone(result.rawAddress, resultcapacity, ec.rawAddress)

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetKeywordValuesForLocale(key.rawAddress, locale.rawAddress, commonlyused, status.rawAddress))

public actual fun ucalGetLimit(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields, type: UCalendarLimitType, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetLimit(cal.rawAddress, field, type, status.rawAddress)

public actual fun ucalGetLocaleByType(cal: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetLocaleByType(cal.rawAddress, type, status.rawAddress))

public actual fun ucalGetMillis(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetMillis(cal.rawAddress, status.rawAddress)

public actual fun ucalGetNow(): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetNow()

public actual fun ucalGetTzdataVersion(status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetTzdataVersion(status.rawAddress))

public actual fun ucalGetTimeZoneDisplayName(cal: ConstPtr<ConstPtr<CVoid>>, type: UCalendarDisplayNameType, locale: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetTimeZoneDisplayName(cal.rawAddress, type, locale.rawAddress, result.rawAddress, resultlength, status.rawAddress)

public actual fun ucalGetTimeZoneId(cal: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetTimeZoneId(cal.rawAddress, result.rawAddress, resultlength, status.rawAddress)

public actual fun ucalGetTimeZoneIdforWindowsId(winid: ConstPtr<UShort>, len: Int, region: Pcstr, id: MutPtr<UShort>, idcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetTimeZoneIdforWindowsId(winid.rawAddress, len, region.rawAddress, id.rawAddress, idcapacity, status.rawAddress)

public actual fun ucalGetTimeZoneTransitionDate(cal: ConstPtr<ConstPtr<CVoid>>, type: UTimeZoneTransitionType, transition: MutPtr<Double>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetTimeZoneTransitionDate(cal.rawAddress, type, transition.rawAddress, status.rawAddress)

public actual fun ucalGetType(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetType(cal.rawAddress, status.rawAddress))

public actual fun ucalGetWeekendTransition(cal: ConstPtr<ConstPtr<CVoid>>, dayofweek: UCalendarDaysOfWeek, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetWeekendTransition(cal.rawAddress, dayofweek, status.rawAddress)

public actual fun ucalGetWindowsTimeZoneId(id: ConstPtr<UShort>, len: Int, winid: MutPtr<UShort>, winidcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalGetWindowsTimeZoneId(id.rawAddress, len, winid.rawAddress, winidcapacity, status.rawAddress)

public actual fun ucalInDaylightTime(cal: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalInDaylightTime(cal.rawAddress, status.rawAddress)

public actual fun ucalIsSet(cal: ConstPtr<ConstPtr<CVoid>>, field: UCalendarDateFields): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalIsSet(cal.rawAddress, field)

public actual fun ucalIsWeekend(cal: ConstPtr<ConstPtr<CVoid>>, date: Double, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalIsWeekend(cal.rawAddress, date, status.rawAddress)

public actual fun ucalOpen(zoneid: ConstPtr<UShort>, len: Int, locale: Pcstr, type: UCalendarType, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalOpen(zoneid.rawAddress, len, locale.rawAddress, type, status.rawAddress))

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalOpenCountryTimeZones(country.rawAddress, ec.rawAddress))

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: ConstPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalOpenTimeZoneIdenumeration(zonetype, region.rawAddress, rawoffset.rawAddress, ec.rawAddress))

public actual fun ucalOpenTimeZones(ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalOpenTimeZones(ec.rawAddress))

public actual fun ucalRoll(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, amount: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalRoll(cal.rawAddress, field, amount, status.rawAddress)
}

public actual fun ucalSet(cal: MutPtr<MutPtr<CVoid>>, field: UCalendarDateFields, value: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSet(cal.rawAddress, field, value)
}

public actual fun ucalSetAttribute(cal: MutPtr<MutPtr<CVoid>>, attr: UCalendarAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetAttribute(cal.rawAddress, attr, newvalue)
}

public actual fun ucalSetDate(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetDate(cal.rawAddress, year, month, date, status.rawAddress)
}

public actual fun ucalSetDateTime(cal: MutPtr<MutPtr<CVoid>>, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetDateTime(cal.rawAddress, year, month, date, hour, minute, second, status.rawAddress)
}

public actual fun ucalSetDefaultTimeZone(zoneid: ConstPtr<UShort>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetDefaultTimeZone(zoneid.rawAddress, ec.rawAddress)
}

public actual fun ucalSetGregorianChange(cal: MutPtr<MutPtr<CVoid>>, date: Double, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetGregorianChange(cal.rawAddress, date, perrorcode.rawAddress)
}

public actual fun ucalSetMillis(cal: MutPtr<MutPtr<CVoid>>, datetime: Double, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetMillis(cal.rawAddress, datetime, status.rawAddress)
}

public actual fun ucalSetTimeZone(cal: MutPtr<MutPtr<CVoid>>, zoneid: ConstPtr<UShort>, len: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcalSetTimeZone(cal.rawAddress, zoneid.rawAddress, len, status.rawAddress)
}

public actual fun ucasemapClose(csm: MutPtr<UCaseMap>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapClose(csm.rawAddress)
}

public actual fun ucasemapGetBreakIterator(csm: ConstPtr<UCaseMap>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapGetBreakIterator(csm.rawAddress))

public actual fun ucasemapGetLocale(csm: ConstPtr<UCaseMap>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapGetLocale(csm.rawAddress))

public actual fun ucasemapGetOptions(csm: ConstPtr<UCaseMap>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapGetOptions(csm.rawAddress).toUInt()

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UCaseMap> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapOpen(locale.rawAddress, options.toInt(), perrorcode.rawAddress))

public actual fun ucasemapSetBreakIterator(csm: MutPtr<UCaseMap>, itertoadopt: MutPtr<UBreakIterator>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapSetBreakIterator(csm.rawAddress, itertoadopt.rawAddress, perrorcode.rawAddress)
}

public actual fun ucasemapSetLocale(csm: MutPtr<UCaseMap>, locale: Pcstr, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapSetLocale(csm.rawAddress, locale.rawAddress, perrorcode.rawAddress)
}

public actual fun ucasemapSetOptions(csm: MutPtr<UCaseMap>, options: UInt, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapSetOptions(csm.rawAddress, options.toInt(), perrorcode.rawAddress)
}

public actual fun ucasemapToTitle(csm: MutPtr<UCaseMap>, dest: MutPtr<UShort>, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapToTitle(csm.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucasemapUtf8FoldCase(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapUtf8FoldCase(csm.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucasemapUtf8ToLower(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapUtf8ToLower(csm.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucasemapUtf8ToTitle(csm: MutPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapUtf8ToTitle(csm.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucasemapUtf8ToUpper(csm: ConstPtr<UCaseMap>, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcasemapUtf8ToUpper(csm.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucfposClose(ucfpos: MutPtr<UConstrainedFieldPosition>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposClose(ucfpos.rawAddress)
}

public actual fun ucfposConstrainCategory(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposConstrainCategory(ucfpos.rawAddress, category, ec.rawAddress)
}

public actual fun ucfposConstrainField(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposConstrainField(ucfpos.rawAddress, category, field, ec.rawAddress)
}

public actual fun ucfposGetCategory(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposGetCategory(ucfpos.rawAddress, ec.rawAddress)

public actual fun ucfposGetField(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposGetField(ucfpos.rawAddress, ec.rawAddress)

public actual fun ucfposGetIndexes(ucfpos: ConstPtr<UConstrainedFieldPosition>, pstart: MutPtr<Int>, plimit: MutPtr<Int>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposGetIndexes(ucfpos.rawAddress, pstart.rawAddress, plimit.rawAddress, ec.rawAddress)
}

public actual fun ucfposGetInt64IterationContext(ucfpos: ConstPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposGetInt64IterationContext(ucfpos.rawAddress, ec.rawAddress)

public actual fun ucfposMatchesField(ucfpos: ConstPtr<UConstrainedFieldPosition>, category: Int, field: Int, ec: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposMatchesField(ucfpos.rawAddress, category, field, ec.rawAddress)

public actual fun ucfposOpen(ec: MutPtr<UErrorCode>): MutPtr<UConstrainedFieldPosition> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposOpen(ec.rawAddress))

public actual fun ucfposReset(ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposReset(ucfpos.rawAddress, ec.rawAddress)
}

public actual fun ucfposSetInt64IterationContext(ucfpos: MutPtr<UConstrainedFieldPosition>, context: Long, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposSetInt64IterationContext(ucfpos.rawAddress, context, ec.rawAddress)
}

public actual fun ucfposSetState(ucfpos: MutPtr<UConstrainedFieldPosition>, category: Int, field: Int, start: Int, limit: Int, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcfposSetState(ucfpos.rawAddress, category, field, start, limit, ec.rawAddress)
}

public actual fun ucnvCbFromUwriteBytes(args: MutPtr<UConverterFromUnicodeArgs>, source: Pcstr, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteBytes(args.rawAddress, source.rawAddress, length, offsetindex, err.rawAddress)
}

public actual fun ucnvCbFromUwriteSub(args: MutPtr<UConverterFromUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteSub(args.rawAddress, offsetindex, err.rawAddress)
}

public actual fun ucnvCbFromUwriteUchars(args: MutPtr<UConverterFromUnicodeArgs>, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCbFromUwriteUchars(args.rawAddress, source.rawAddress, sourcelimit.rawAddress, offsetindex, err.rawAddress)
}

public actual fun ucnvCbToUwriteSub(args: MutPtr<UConverterToUnicodeArgs>, offsetindex: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCbToUwriteSub(args.rawAddress, offsetindex, err.rawAddress)
}

public actual fun ucnvCbToUwriteUchars(args: MutPtr<UConverterToUnicodeArgs>, source: ConstPtr<UShort>, length: Int, offsetindex: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCbToUwriteUchars(args.rawAddress, source.rawAddress, length, offsetindex, err.rawAddress)
}

public actual fun ucnvClose(converter: MutPtr<UConverter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvClose(converter.rawAddress)
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCompareNames(name1.rawAddress, name2.rawAddress)

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvConvert(toconvertername.rawAddress, fromconvertername.rawAddress, target.rawAddress, targetcapacity, source.rawAddress, sourcelength, perrorcode.rawAddress)

public actual fun ucnvConvertEx(targetcnv: MutPtr<UConverter>, sourcecnv: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, pivotstart: MutPtr<UShort>, pivotsource: MutPtr<MutPtr<UShort>>, pivottarget: MutPtr<MutPtr<UShort>>, pivotlimit: ConstPtr<UShort>, reset: Byte, flush: Byte, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvConvertEx(targetcnv.rawAddress, sourcecnv.rawAddress, target.rawAddress, targetlimit.rawAddress, source.rawAddress, sourcelimit.rawAddress, pivotstart.rawAddress, pivotsource.rawAddress, pivottarget.rawAddress, pivotlimit.rawAddress, reset, flush, perrorcode.rawAddress)
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: MutPtr<UErrorCode>): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCountAliases(alias.rawAddress, perrorcode.rawAddress).toUShort()

public actual fun ucnvCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCountAvailable()

public actual fun ucnvCountStandards(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvCountStandards().toUShort()

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvDetectUnicodeSignature(source.rawAddress, sourcelength, signaturelength.rawAddress, perrorcode.rawAddress))

public actual fun ucnvFixFileSeparator(cnv: ConstPtr<UConverter>, source: MutPtr<UShort>, sourcelen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFixFileSeparator(cnv.rawAddress, source.rawAddress, sourcelen)
}

public actual fun ucnvFlushCache(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFlushCache()

public actual fun ucnvFromAlgorithmic(cnv: MutPtr<UConverter>, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromAlgorithmic(cnv.rawAddress, algorithmictype, target.rawAddress, targetcapacity, source.rawAddress, sourcelength, perrorcode.rawAddress)

public actual fun ucnvFromUchars(cnv: MutPtr<UConverter>, dest: Pcstr, destcapacity: Int, src: ConstPtr<UShort>, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUchars(cnv.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucnvFromUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUcountPending(cnv.rawAddress, status.rawAddress)

public actual fun ucnvFromUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<Byte>>, targetlimit: Pcstr, source: ConstPtr<ConstPtr<UShort>>, sourcelimit: ConstPtr<UShort>, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvFromUnicode(converter.rawAddress, target.rawAddress, targetlimit.rawAddress, source.rawAddress, sourcelimit.rawAddress, offsets.rawAddress, flush, err.rawAddress)
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetAlias(alias.rawAddress, n.toShort(), perrorcode.rawAddress))

public actual fun ucnvGetAliases(alias: Pcstr, aliases: ConstPtr<ConstPtr<Byte>>, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetAliases(alias.rawAddress, aliases.rawAddress, perrorcode.rawAddress)
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetAvailableName(n))

public actual fun ucnvGetCcsid(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetCcsid(converter.rawAddress, err.rawAddress)

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetCanonicalName(alias.rawAddress, standard.rawAddress, perrorcode.rawAddress))

public actual fun ucnvGetDefaultName(): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetDefaultName())

public actual fun ucnvGetDisplayName(converter: ConstPtr<UConverter>, displaylocale: Pcstr, displayname: MutPtr<UShort>, displaynamecapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetDisplayName(converter.rawAddress, displaylocale.rawAddress, displayname.rawAddress, displaynamecapacity, err.rawAddress)

public actual fun ucnvGetFromUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterFromUCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetFromUcallBack(converter.rawAddress, action.rawAddress, context.rawAddress)
}

public actual fun ucnvGetInvalidChars(converter: ConstPtr<UConverter>, errbytes: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetInvalidChars(converter.rawAddress, errbytes.rawAddress, len.rawAddress, err.rawAddress)
}

public actual fun ucnvGetInvalidUchars(converter: ConstPtr<UConverter>, erruchars: MutPtr<UShort>, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetInvalidUchars(converter.rawAddress, erruchars.rawAddress, len.rawAddress, err.rawAddress)
}

public actual fun ucnvGetMaxCharSize(converter: ConstPtr<UConverter>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetMaxCharSize(converter.rawAddress)

public actual fun ucnvGetMinCharSize(converter: ConstPtr<UConverter>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetMinCharSize(converter.rawAddress)

public actual fun ucnvGetName(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetName(converter.rawAddress, err.rawAddress))

public actual fun ucnvGetNextUchar(converter: MutPtr<UConverter>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetNextUchar(converter.rawAddress, source.rawAddress, sourcelimit.rawAddress, err.rawAddress)

public actual fun ucnvGetPlatform(converter: ConstPtr<UConverter>, err: MutPtr<UErrorCode>): UConverterPlatform =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetPlatform(converter.rawAddress, err.rawAddress)

public actual fun ucnvGetStandard(n: UShort, perrorcode: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetStandard(n.toShort(), perrorcode.rawAddress))

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetStandardName(name.rawAddress, standard.rawAddress, perrorcode.rawAddress))

public actual fun ucnvGetStarters(converter: ConstPtr<UConverter>, starters: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetStarters(converter.rawAddress, starters.rawAddress, err.rawAddress)
}

public actual fun ucnvGetSubstChars(converter: ConstPtr<UConverter>, subchars: Pcstr, len: MutPtr<Byte>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetSubstChars(converter.rawAddress, subchars.rawAddress, len.rawAddress, err.rawAddress)
}

public actual fun ucnvGetToUcallBack(converter: ConstPtr<UConverter>, action: MutPtr<UConverterToUCallback>, context: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetToUcallBack(converter.rawAddress, action.rawAddress, context.rawAddress)
}

public actual fun ucnvGetType(converter: ConstPtr<UConverter>): UConverterType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetType(converter.rawAddress)

public actual fun ucnvGetUnicodeSet(cnv: ConstPtr<UConverter>, setfillin: MutPtr<USet>, whichset: UConverterUnicodeSet, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvGetUnicodeSet(cnv.rawAddress, setfillin.rawAddress, whichset, perrorcode.rawAddress)
}

public actual fun ucnvIsAmbiguous(cnv: ConstPtr<UConverter>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvIsAmbiguous(cnv.rawAddress)

public actual fun ucnvIsFixedWidth(cnv: MutPtr<UConverter>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvIsFixedWidth(cnv.rawAddress, status.rawAddress)

public actual fun ucnvOpen(convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpen(convertername.rawAddress, err.rawAddress))

public actual fun ucnvOpenAllNames(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpenAllNames(perrorcode.rawAddress))

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpenCcsid(codepage, platform, err.rawAddress))

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpenPackage(packagename.rawAddress, convertername.rawAddress, err.rawAddress))

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpenStandardNames(convname.rawAddress, standard.rawAddress, perrorcode.rawAddress))

public actual fun ucnvOpenU(name: ConstPtr<UShort>, err: MutPtr<UErrorCode>): MutPtr<UConverter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvOpenU(name.rawAddress, err.rawAddress))

public actual fun ucnvReset(converter: MutPtr<UConverter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvReset(converter.rawAddress)
}

public actual fun ucnvResetFromUnicode(converter: MutPtr<UConverter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvResetFromUnicode(converter.rawAddress)
}

public actual fun ucnvResetToUnicode(converter: MutPtr<UConverter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvResetToUnicode(converter.rawAddress)
}

public actual fun ucnvSafeClone(cnv: ConstPtr<UConverter>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UConverter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSafeClone(cnv.rawAddress, stackbuffer.rawAddress, pbuffersize.rawAddress, status.rawAddress))

public actual fun ucnvSetDefaultName(name: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetDefaultName(name.rawAddress)
}

public actual fun ucnvSetFallback(cnv: MutPtr<UConverter>, usesfallback: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetFallback(cnv.rawAddress, usesfallback)
}

public actual fun ucnvSetFromUcallBack(converter: MutPtr<UConverter>, newaction: UConverterFromUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterFromUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetFromUcallBack(converter.rawAddress, 0L, newcontext.rawAddress, oldaction.rawAddress, oldcontext.rawAddress, err.rawAddress)
}

public actual fun ucnvSetSubstChars(converter: MutPtr<UConverter>, subchars: Pcstr, len: Byte, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetSubstChars(converter.rawAddress, subchars.rawAddress, len, err.rawAddress)
}

public actual fun ucnvSetSubstString(cnv: MutPtr<UConverter>, s: ConstPtr<UShort>, length: Int, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetSubstString(cnv.rawAddress, s.rawAddress, length, err.rawAddress)
}

public actual fun ucnvSetToUcallBack(converter: MutPtr<UConverter>, newaction: UConverterToUCallback, newcontext: ConstPtr<CVoid>, oldaction: MutPtr<UConverterToUCallback>, oldcontext: ConstPtr<ConstPtr<CVoid>>, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvSetToUcallBack(converter.rawAddress, 0L, newcontext.rawAddress, oldaction.rawAddress, oldcontext.rawAddress, err.rawAddress)
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: MutPtr<UConverter>, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToAlgorithmic(algorithmictype, cnv.rawAddress, target.rawAddress, targetcapacity, source.rawAddress, sourcelength, perrorcode.rawAddress)

public actual fun ucnvToUchars(cnv: MutPtr<UConverter>, dest: MutPtr<UShort>, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUchars(cnv.rawAddress, dest.rawAddress, destcapacity, src.rawAddress, srclength, perrorcode.rawAddress)

public actual fun ucnvToUcountPending(cnv: ConstPtr<UConverter>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUcountPending(cnv.rawAddress, status.rawAddress)

public actual fun ucnvToUnicode(converter: MutPtr<UConverter>, target: MutPtr<MutPtr<UShort>>, targetlimit: ConstPtr<UShort>, source: ConstPtr<ConstPtr<Byte>>, sourcelimit: Pcstr, offsets: MutPtr<Int>, flush: Byte, err: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvToUnicode(converter.rawAddress, target.rawAddress, targetlimit.rawAddress, source.rawAddress, sourcelimit.rawAddress, offsets.rawAddress, flush, err.rawAddress)
}

public actual fun ucnvUsesFallback(cnv: ConstPtr<UConverter>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvUsesFallback(cnv.rawAddress)

public actual fun ucnvselClose(sel: MutPtr<UConverterSelector>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselClose(sel.rawAddress)
}

public actual fun ucnvselOpen(converterlist: ConstPtr<ConstPtr<Byte>>, converterlistsize: Int, excludedcodepoints: ConstPtr<USet>, whichset: UConverterUnicodeSet, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselOpen(converterlist.rawAddress, converterlistsize, excludedcodepoints.rawAddress, whichset, status.rawAddress))

public actual fun ucnvselOpenFromSerialized(buffer: ConstPtr<CVoid>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UConverterSelector> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselOpenFromSerialized(buffer.rawAddress, length, status.rawAddress))

public actual fun ucnvselSelectForString(sel: ConstPtr<UConverterSelector>, s: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselSelectForString(sel.rawAddress, s.rawAddress, length, status.rawAddress))

public actual fun ucnvselSelectForUtf8(sel: ConstPtr<UConverterSelector>, s: Pcstr, length: Int, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselSelectForUtf8(sel.rawAddress, s.rawAddress, length, status.rawAddress))

public actual fun ucnvselSerialize(sel: ConstPtr<UConverterSelector>, buffer: MutPtr<CVoid>, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcnvselSerialize(sel.rawAddress, buffer.rawAddress, buffercapacity, status.rawAddress)

public actual fun ucolCloneBinary(coll: ConstPtr<UCollator>, buffer: MutPtr<UByte>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolCloneBinary(coll.rawAddress, buffer.rawAddress, capacity, status.rawAddress)

public actual fun ucolClose(coll: MutPtr<UCollator>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolClose(coll.rawAddress)
}

public actual fun ucolCloseElements(elems: MutPtr<UCollationElements>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolCloseElements(elems.rawAddress)
}

public actual fun ucolCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolCountAvailable()

public actual fun ucolEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolEqual(coll.rawAddress, source.rawAddress, sourcelength, target.rawAddress, targetlength)

public actual fun ucolGetAttribute(coll: ConstPtr<UCollator>, attr: UColAttribute, status: MutPtr<UErrorCode>): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetAttribute(coll.rawAddress, attr, status.rawAddress)

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetAvailable(localeindex))

public actual fun ucolGetBound(source: ConstPtr<UByte>, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: MutPtr<UByte>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetBound(source.rawAddress, sourcelength, boundtype, nooflevels.toInt(), result.rawAddress, resultlength, status.rawAddress)

public actual fun ucolGetContractionsAndExpansions(coll: ConstPtr<UCollator>, contractions: MutPtr<USet>, expansions: MutPtr<USet>, addprefixes: Byte, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetContractionsAndExpansions(coll.rawAddress, contractions.rawAddress, expansions.rawAddress, addprefixes, status.rawAddress)
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetDisplayName(objloc.rawAddress, disploc.rawAddress, result.rawAddress, resultlength, status.rawAddress)

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetEquivalentReorderCodes(reordercode, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetFunctionalEquivalent(result.rawAddress, resultcapacity, keyword.rawAddress, locale.rawAddress, isavailable.rawAddress, status.rawAddress)

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetKeywordValues(keyword.rawAddress, status.rawAddress))

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetKeywordValuesForLocale(key.rawAddress, locale.rawAddress, commonlyused, status.rawAddress))

public actual fun ucolGetKeywords(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetKeywords(status.rawAddress))

public actual fun ucolGetLocaleByType(coll: ConstPtr<UCollator>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetLocaleByType(coll.rawAddress, type, status.rawAddress))

public actual fun ucolGetMaxExpansion(elems: ConstPtr<UCollationElements>, order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetMaxExpansion(elems.rawAddress, order)

public actual fun ucolGetMaxVariable(coll: ConstPtr<UCollator>): UColReorderCode =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetMaxVariable(coll.rawAddress)

public actual fun ucolGetOffset(elems: ConstPtr<UCollationElements>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetOffset(elems.rawAddress)

public actual fun ucolGetReorderCodes(coll: ConstPtr<UCollator>, dest: MutPtr<Int>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetReorderCodes(coll.rawAddress, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun ucolGetRules(coll: ConstPtr<UCollator>, length: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetRules(coll.rawAddress, length.rawAddress))

public actual fun ucolGetRulesEx(coll: ConstPtr<UCollator>, delta: UColRuleOption, buffer: MutPtr<UShort>, bufferlen: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetRulesEx(coll.rawAddress, delta, buffer.rawAddress, bufferlen)

public actual fun ucolGetSortKey(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, result: MutPtr<UByte>, resultlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetSortKey(coll.rawAddress, source.rawAddress, sourcelength, result.rawAddress, resultlength)

public actual fun ucolGetStrength(coll: ConstPtr<UCollator>): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetStrength(coll.rawAddress)

public actual fun ucolGetTailoredSet(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetTailoredSet(coll.rawAddress, status.rawAddress))

public actual fun ucolGetUcaversion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetUcaversion(coll.rawAddress, info.rawAddress)
}

public actual fun ucolGetVariableTop(coll: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetVariableTop(coll.rawAddress, status.rawAddress).toUInt()

public actual fun ucolGetVersion(coll: ConstPtr<UCollator>, info: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGetVersion(coll.rawAddress, info.rawAddress)
}

public actual fun ucolGreater(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGreater(coll.rawAddress, source.rawAddress, sourcelength, target.rawAddress, targetlength)

public actual fun ucolGreaterOrEqual(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolGreaterOrEqual(coll.rawAddress, source.rawAddress, sourcelength, target.rawAddress, targetlength)

public actual fun ucolKeyHashCode(key: ConstPtr<UByte>, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolKeyHashCode(key.rawAddress, length)

public actual fun ucolMergeSortkeys(src1: ConstPtr<UByte>, src1length: Int, src2: ConstPtr<UByte>, src2length: Int, dest: MutPtr<UByte>, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolMergeSortkeys(src1.rawAddress, src1length, src2.rawAddress, src2length, dest.rawAddress, destcapacity)

public actual fun ucolNext(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolNext(elems.rawAddress, status.rawAddress)

public actual fun ucolNextSortKeyPart(coll: ConstPtr<UCollator>, iter: MutPtr<UCharIterator>, state: MutPtr<UInt>, dest: MutPtr<UByte>, count: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolNextSortKeyPart(coll.rawAddress, iter.rawAddress, state.rawAddress, dest.rawAddress, count, status.rawAddress)

public actual fun ucolOpen(loc: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolOpen(loc.rawAddress, status.rawAddress))

public actual fun ucolOpenAvailableLocales(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolOpenAvailableLocales(status.rawAddress))

public actual fun ucolOpenBinary(bin: ConstPtr<UByte>, length: Int, base: ConstPtr<UCollator>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolOpenBinary(bin.rawAddress, length, base.rawAddress, status.rawAddress))

public actual fun ucolOpenElements(coll: ConstPtr<UCollator>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>): MutPtr<UCollationElements> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolOpenElements(coll.rawAddress, text.rawAddress, textlength, status.rawAddress))

public actual fun ucolOpenRules(rules: ConstPtr<UShort>, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolOpenRules(rules.rawAddress, ruleslength, normalizationmode, strength, parseerror.rawAddress, status.rawAddress))

public actual fun ucolPrevious(elems: MutPtr<UCollationElements>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolPrevious(elems.rawAddress, status.rawAddress)

public actual fun ucolPrimaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolPrimaryOrder(order)

public actual fun ucolReset(elems: MutPtr<UCollationElements>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolReset(elems.rawAddress)
}

public actual fun ucolSafeClone(coll: ConstPtr<UCollator>, stackbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UCollator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSafeClone(coll.rawAddress, stackbuffer.rawAddress, pbuffersize.rawAddress, status.rawAddress))

public actual fun ucolSecondaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSecondaryOrder(order)

public actual fun ucolSetAttribute(coll: MutPtr<UCollator>, attr: UColAttribute, value: UColAttributeValue, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetAttribute(coll.rawAddress, attr, value, status.rawAddress)
}

public actual fun ucolSetMaxVariable(coll: MutPtr<UCollator>, group: UColReorderCode, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetMaxVariable(coll.rawAddress, group, perrorcode.rawAddress)
}

public actual fun ucolSetOffset(elems: MutPtr<UCollationElements>, offset: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetOffset(elems.rawAddress, offset, status.rawAddress)
}

public actual fun ucolSetReorderCodes(coll: MutPtr<UCollator>, reordercodes: ConstPtr<Int>, reordercodeslength: Int, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetReorderCodes(coll.rawAddress, reordercodes.rawAddress, reordercodeslength, perrorcode.rawAddress)
}

public actual fun ucolSetStrength(coll: MutPtr<UCollator>, strength: UColAttributeValue) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetStrength(coll.rawAddress, strength)
}

public actual fun ucolSetText(elems: MutPtr<UCollationElements>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolSetText(elems.rawAddress, text.rawAddress, textlength, status.rawAddress)
}

public actual fun ucolStrcoll(coll: ConstPtr<UCollator>, source: ConstPtr<UShort>, sourcelength: Int, target: ConstPtr<UShort>, targetlength: Int): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolStrcoll(coll.rawAddress, source.rawAddress, sourcelength, target.rawAddress, targetlength)

public actual fun ucolStrcollIter(coll: ConstPtr<UCollator>, siter: MutPtr<UCharIterator>, titer: MutPtr<UCharIterator>, status: MutPtr<UErrorCode>): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolStrcollIter(coll.rawAddress, siter.rawAddress, titer.rawAddress, status.rawAddress)

public actual fun ucolStrcollUtf8(coll: ConstPtr<UCollator>, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: MutPtr<UErrorCode>): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolStrcollUtf8(coll.rawAddress, source.rawAddress, sourcelength, target.rawAddress, targetlength, status.rawAddress)

public actual fun ucolTertiaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcolTertiaryOrder(order)

public actual fun ucpmapGet(map: ConstPtr<UCPMap>, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcpmapGet(map.rawAddress, c).toUInt()

public actual fun ucpmapGetRange(map: ConstPtr<UCPMap>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcpmapGetRange(map.rawAddress, start, option, surrogatevalue.toInt(), filter.rawAddress, context.rawAddress, pvalue.rawAddress)

public actual fun ucptrieClose(trie: MutPtr<UCPTrie>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieClose(trie.rawAddress)
}

public actual fun ucptrieGet(trie: ConstPtr<UCPTrie>, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieGet(trie.rawAddress, c).toUInt()

public actual fun ucptrieGetRange(trie: ConstPtr<UCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieGetRange(trie.rawAddress, start, option, surrogatevalue.toInt(), filter.rawAddress, context.rawAddress, pvalue.rawAddress)

public actual fun ucptrieGetType(trie: ConstPtr<UCPTrie>): UCPTrieType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieGetType(trie.rawAddress)

public actual fun ucptrieGetValueWidth(trie: ConstPtr<UCPTrie>): UCPTrieValueWidth =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieGetValueWidth(trie.rawAddress)

public actual fun ucptrieInternalSmallIndex(trie: ConstPtr<UCPTrie>, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieInternalSmallIndex(trie.rawAddress, c)

public actual fun ucptrieInternalSmallU8Index(trie: ConstPtr<UCPTrie>, lt1: Int, t2: UByte, t3: UByte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieInternalSmallU8Index(trie.rawAddress, lt1, t2.toByte(), t3.toByte())

public actual fun ucptrieInternalU8PrevIndex(trie: ConstPtr<UCPTrie>, c: Int, start: ConstPtr<UByte>, src: ConstPtr<UByte>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieInternalU8PrevIndex(trie.rawAddress, c, start.rawAddress, src.rawAddress)

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieOpenFromBinary(type, valuewidth, data.rawAddress, length, pactuallength.rawAddress, perrorcode.rawAddress))

public actual fun ucptrieToBinary(trie: ConstPtr<UCPTrie>, data: MutPtr<CVoid>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcptrieToBinary(trie.rawAddress, data.rawAddress, capacity, perrorcode.rawAddress)

public actual fun ucsdetClose(ucsd: MutPtr<UCharsetDetector>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetClose(ucsd.rawAddress)
}

public actual fun ucsdetDetect(ucsd: MutPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UCharsetMatch> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetDetect(ucsd.rawAddress, status.rawAddress))

public actual fun ucsdetDetectAll(ucsd: MutPtr<UCharsetDetector>, matchesfound: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<UCharsetMatch>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetDetectAll(ucsd.rawAddress, matchesfound.rawAddress, status.rawAddress))

public actual fun ucsdetEnableInputFilter(ucsd: MutPtr<UCharsetDetector>, filter: Byte): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetEnableInputFilter(ucsd.rawAddress, filter)

public actual fun ucsdetGetAllDetectableCharsets(ucsd: ConstPtr<UCharsetDetector>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetGetAllDetectableCharsets(ucsd.rawAddress, status.rawAddress))

public actual fun ucsdetGetConfidence(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetGetConfidence(ucsm.rawAddress, status.rawAddress)

public actual fun ucsdetGetLanguage(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetGetLanguage(ucsm.rawAddress, status.rawAddress))

public actual fun ucsdetGetName(ucsm: ConstPtr<UCharsetMatch>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetGetName(ucsm.rawAddress, status.rawAddress))

public actual fun ucsdetGetUchars(ucsm: ConstPtr<UCharsetMatch>, buf: MutPtr<UShort>, cap: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetGetUchars(ucsm.rawAddress, buf.rawAddress, cap, status.rawAddress)

public actual fun ucsdetIsInputFilterEnabled(ucsd: ConstPtr<UCharsetDetector>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetIsInputFilterEnabled(ucsd.rawAddress)

public actual fun ucsdetOpen(status: MutPtr<UErrorCode>): MutPtr<UCharsetDetector> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetOpen(status.rawAddress))

public actual fun ucsdetSetDeclaredEncoding(ucsd: MutPtr<UCharsetDetector>, encoding: Pcstr, length: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetSetDeclaredEncoding(ucsd.rawAddress, encoding.rawAddress, length, status.rawAddress)
}

public actual fun ucsdetSetText(ucsd: MutPtr<UCharsetDetector>, textin: Pcstr, len: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcsdetSetText(ucsd.rawAddress, textin.rawAddress, len, status.rawAddress)
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrCountCurrencies(locale.rawAddress, date, ec.rawAddress)

public actual fun ucurrForLocale(locale: Pcstr, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrForLocale(locale.rawAddress, buff.rawAddress, buffcapacity, ec.rawAddress)

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: MutPtr<UShort>, buffcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrForLocaleAndDate(locale.rawAddress, date, index, buff.rawAddress, buffcapacity, ec.rawAddress)

public actual fun ucurrGetDefaultFractionDigits(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigits(currency.rawAddress, ec.rawAddress)

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetDefaultFractionDigitsForUsage(currency.rawAddress, usage, ec.rawAddress)

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetKeywordValuesForLocale(key.rawAddress, locale.rawAddress, commonlyused, status.rawAddress))

public actual fun ucurrGetName(currency: ConstPtr<UShort>, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: MutPtr<Byte>, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetName(currency.rawAddress, locale.rawAddress, namestyle, ischoiceformat.rawAddress, len.rawAddress, ec.rawAddress))

public actual fun ucurrGetNumericCode(currency: ConstPtr<UShort>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetNumericCode(currency.rawAddress)

public actual fun ucurrGetPluralName(currency: ConstPtr<UShort>, locale: Pcstr, ischoiceformat: MutPtr<Byte>, pluralcount: Pcstr, len: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetPluralName(currency.rawAddress, locale.rawAddress, ischoiceformat.rawAddress, pluralcount.rawAddress, len.rawAddress, ec.rawAddress))

public actual fun ucurrGetRoundingIncrement(currency: ConstPtr<UShort>, ec: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrement(currency.rawAddress, ec.rawAddress)

public actual fun ucurrGetRoundingIncrementForUsage(currency: ConstPtr<UShort>, usage: UCurrencyUsage, ec: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrGetRoundingIncrementForUsage(currency.rawAddress, usage, ec.rawAddress)

public actual fun ucurrIsAvailable(isocode: ConstPtr<UShort>, from: Double, to: Double, errorcode: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrIsAvailable(isocode.rawAddress, from, to, errorcode.rawAddress)

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrOpenIsocurrencies(currtype.toInt(), perrorcode.rawAddress))

public actual fun ucurrRegister(isocode: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrRegister(isocode.rawAddress, locale.rawAddress, status.rawAddress))

public actual fun ucurrUnregister(key: MutPtr<CVoid>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUcurrUnregister(key.rawAddress, status.rawAddress)

public actual fun udatAdoptNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoadopt: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormat(fmt.rawAddress, numberformattoadopt.rawAddress)
}

public actual fun udatAdoptNumberFormatForFields(fmt: MutPtr<MutPtr<CVoid>>, fields: ConstPtr<UShort>, numberformattoset: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatAdoptNumberFormatForFields(fmt.rawAddress, fields.rawAddress, numberformattoset.rawAddress, status.rawAddress)
}

public actual fun udatApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatApplyPattern(format.rawAddress, localized, pattern.rawAddress, patternlength)
}

public actual fun udatClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatClone(fmt.rawAddress, status.rawAddress))

public actual fun udatClose(format: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatClose(format.rawAddress)
}

public actual fun udatCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatCountAvailable()

public actual fun udatCountSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatCountSymbols(fmt.rawAddress, type)

public actual fun udatFormat(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatFormat(format.rawAddress, datetoformat, result.rawAddress, resultlength, position.rawAddress, status.rawAddress)

public actual fun udatFormatCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatFormatCalendar(format.rawAddress, calendar.rawAddress, result.rawAddress, capacity, position.rawAddress, status.rawAddress)

public actual fun udatFormatCalendarForFields(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, result: MutPtr<UShort>, capacity: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatFormatCalendarForFields(format.rawAddress, calendar.rawAddress, result.rawAddress, capacity, fpositer.rawAddress, status.rawAddress)

public actual fun udatFormatForFields(format: ConstPtr<ConstPtr<CVoid>>, datetoformat: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatFormatForFields(format.rawAddress, datetoformat, result.rawAddress, resultlength, fpositer.rawAddress, status.rawAddress)

public actual fun udatGet2DigitYearStart(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGet2DigitYearStart(fmt.rawAddress, status.rawAddress)

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetAvailable(localeindex))

public actual fun udatGetBooleanAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UDateFormatBooleanAttribute, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetBooleanAttribute(fmt.rawAddress, attr, status.rawAddress)

public actual fun udatGetCalendar(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetCalendar(fmt.rawAddress))

public actual fun udatGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetContext(fmt.rawAddress, type, status.rawAddress)

public actual fun udatGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetLocaleByType(fmt.rawAddress, type, status.rawAddress))

public actual fun udatGetNumberFormat(fmt: ConstPtr<ConstPtr<CVoid>>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetNumberFormat(fmt.rawAddress))

public actual fun udatGetNumberFormatForField(fmt: ConstPtr<ConstPtr<CVoid>>, field: UShort): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetNumberFormatForField(fmt.rawAddress, field.toShort()))

public actual fun udatGetSymbols(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatGetSymbols(fmt.rawAddress, type, symbolindex, result.rawAddress, resultlength, status.rawAddress)

public actual fun udatIsLenient(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatIsLenient(fmt.rawAddress)

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: ConstPtr<UShort>, tzidlength: Int, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatOpen(timestyle, datestyle, locale.rawAddress, tzid.rawAddress, tzidlength, pattern.rawAddress, patternlength, status.rawAddress))

public actual fun udatParse(format: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatParse(format.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress)

public actual fun udatParseCalendar(format: ConstPtr<ConstPtr<CVoid>>, calendar: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatParseCalendar(format.rawAddress, calendar.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress)
}

public actual fun udatSet2DigitYearStart(fmt: MutPtr<MutPtr<CVoid>>, d: Double, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSet2DigitYearStart(fmt.rawAddress, d, status.rawAddress)
}

public actual fun udatSetBooleanAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetBooleanAttribute(fmt.rawAddress, attr, newvalue, status.rawAddress)
}

public actual fun udatSetCalendar(fmt: MutPtr<MutPtr<CVoid>>, calendartoset: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetCalendar(fmt.rawAddress, calendartoset.rawAddress)
}

public actual fun udatSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetContext(fmt.rawAddress, value, status.rawAddress)
}

public actual fun udatSetLenient(fmt: MutPtr<MutPtr<CVoid>>, islenient: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetLenient(fmt.rawAddress, islenient)
}

public actual fun udatSetNumberFormat(fmt: MutPtr<MutPtr<CVoid>>, numberformattoset: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetNumberFormat(fmt.rawAddress, numberformattoset.rawAddress)
}

public actual fun udatSetSymbols(format: MutPtr<MutPtr<CVoid>>, type: UDateFormatSymbolType, symbolindex: Int, value: MutPtr<UShort>, valuelength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatSetSymbols(format.rawAddress, type, symbolindex, value.rawAddress, valuelength, status.rawAddress)
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatToCalendarDateField(field)

public actual fun udatToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, localized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatToPattern(fmt.rawAddress, localized, result.rawAddress, resultlength, status.rawAddress)

public actual fun udatpgAddPattern(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, override: Byte, conflictingpattern: MutPtr<UShort>, capacity: Int, plength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): UDateTimePatternConflict =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgAddPattern(dtpg.rawAddress, pattern.rawAddress, patternlength, override, conflictingpattern.rawAddress, capacity, plength.rawAddress, perrorcode.rawAddress)

public actual fun udatpgClone(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgClone(dtpg.rawAddress, perrorcode.rawAddress))

public actual fun udatpgClose(dtpg: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgClose(dtpg.rawAddress)
}

public actual fun udatpgGetAppendItemFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemFormat(dtpg.rawAddress, field, plength.rawAddress))

public actual fun udatpgGetAppendItemName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, plength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetAppendItemName(dtpg.rawAddress, field, plength.rawAddress))

public actual fun udatpgGetBaseSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, baseskeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetBaseSkeleton(unuseddtpg.rawAddress, pattern.rawAddress, length, baseskeleton.rawAddress, capacity, perrorcode.rawAddress)

public actual fun udatpgGetBestPattern(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetBestPattern(dtpg.rawAddress, skeleton.rawAddress, length, bestpattern.rawAddress, capacity, perrorcode.rawAddress)

public actual fun udatpgGetBestPatternWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, skeleton: ConstPtr<UShort>, length: Int, options: UDateTimePatternMatchOptions, bestpattern: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetBestPatternWithOptions(dtpg.rawAddress, skeleton.rawAddress, length, options, bestpattern.rawAddress, capacity, perrorcode.rawAddress)

public actual fun udatpgGetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetDateTimeFormat(dtpg.rawAddress, plength.rawAddress))

public actual fun udatpgGetDecimal(dtpg: ConstPtr<ConstPtr<CVoid>>, plength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetDecimal(dtpg.rawAddress, plength.rawAddress))

public actual fun udatpgGetFieldDisplayName(dtpg: ConstPtr<ConstPtr<CVoid>>, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetFieldDisplayName(dtpg.rawAddress, field, width, fieldname.rawAddress, capacity, perrorcode.rawAddress)

public actual fun udatpgGetPatternForSkeleton(dtpg: ConstPtr<ConstPtr<CVoid>>, skeleton: ConstPtr<UShort>, skeletonlength: Int, plength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetPatternForSkeleton(dtpg.rawAddress, skeleton.rawAddress, skeletonlength, plength.rawAddress))

public actual fun udatpgGetSkeleton(unuseddtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, length: Int, skeleton: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgGetSkeleton(unuseddtpg.rawAddress, pattern.rawAddress, length, skeleton.rawAddress, capacity, perrorcode.rawAddress)

public actual fun udatpgOpen(locale: Pcstr, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgOpen(locale.rawAddress, perrorcode.rawAddress))

public actual fun udatpgOpenBaseSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgOpenBaseSkeletons(dtpg.rawAddress, perrorcode.rawAddress))

public actual fun udatpgOpenEmpty(perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgOpenEmpty(perrorcode.rawAddress))

public actual fun udatpgOpenSkeletons(dtpg: ConstPtr<ConstPtr<CVoid>>, perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgOpenSkeletons(dtpg.rawAddress, perrorcode.rawAddress))

public actual fun udatpgReplaceFieldTypes(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypes(dtpg.rawAddress, pattern.rawAddress, patternlength, skeleton.rawAddress, skeletonlength, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, skeleton: ConstPtr<UShort>, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgReplaceFieldTypesWithOptions(dtpg.rawAddress, pattern.rawAddress, patternlength, skeleton.rawAddress, skeletonlength, options, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun udatpgSetAppendItemFormat(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemFormat(dtpg.rawAddress, field, value.rawAddress, length)
}

public actual fun udatpgSetAppendItemName(dtpg: MutPtr<MutPtr<CVoid>>, field: UDateTimePatternField, value: ConstPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgSetAppendItemName(dtpg.rawAddress, field, value.rawAddress, length)
}

public actual fun udatpgSetDateTimeFormat(dtpg: ConstPtr<ConstPtr<CVoid>>, dtformat: ConstPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgSetDateTimeFormat(dtpg.rawAddress, dtformat.rawAddress, length)
}

public actual fun udatpgSetDecimal(dtpg: MutPtr<MutPtr<CVoid>>, decimal: ConstPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdatpgSetDecimal(dtpg.rawAddress, decimal.rawAddress, length)
}

public actual fun udtitvfmtClose(formatter: MutPtr<UDateIntervalFormat>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtClose(formatter.rawAddress)
}

public actual fun udtitvfmtCloseResult(uresult: MutPtr<UFormattedDateInterval>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtCloseResult(uresult.rawAddress)
}

public actual fun udtitvfmtFormat(formatter: ConstPtr<UDateIntervalFormat>, fromdate: Double, todate: Double, result: MutPtr<UShort>, resultcapacity: Int, position: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtFormat(formatter.rawAddress, fromdate, todate, result.rawAddress, resultcapacity, position.rawAddress, status.rawAddress)

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: ConstPtr<UShort>, skeletonlength: Int, tzid: ConstPtr<UShort>, tzidlength: Int, status: MutPtr<UErrorCode>): MutPtr<UDateIntervalFormat> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtOpen(locale.rawAddress, skeleton.rawAddress, skeletonlength, tzid.rawAddress, tzidlength, status.rawAddress))

public actual fun udtitvfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedDateInterval> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtOpenResult(ec.rawAddress))

public actual fun udtitvfmtResultAsValue(uresult: ConstPtr<UFormattedDateInterval>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUdtitvfmtResultAsValue(uresult.rawAddress, ec.rawAddress))

public actual fun uenumClose(en: MutPtr<UEnumeration>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumClose(en.rawAddress)
}

public actual fun uenumCount(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumCount(en.rawAddress, status.rawAddress)

public actual fun uenumNext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumNext(en.rawAddress, resultlength.rawAddress, status.rawAddress))

public actual fun uenumOpenCharStringsEnumeration(strings: ConstPtr<ConstPtr<Byte>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumOpenCharStringsEnumeration(strings.rawAddress, count, ec.rawAddress))

public actual fun uenumOpenUcharStringsEnumeration(strings: ConstPtr<ConstPtr<UShort>>, count: Int, ec: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumOpenUcharStringsEnumeration(strings.rawAddress, count, ec.rawAddress))

public actual fun uenumReset(en: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumReset(en.rawAddress, status.rawAddress)
}

public actual fun uenumUnext(en: MutPtr<UEnumeration>, resultlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUenumUnext(en.rawAddress, resultlength.rawAddress, status.rawAddress))

public actual fun ufieldpositerClose(fpositer: MutPtr<UFieldPositionIterator>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfieldpositerClose(fpositer.rawAddress)
}

public actual fun ufieldpositerNext(fpositer: MutPtr<UFieldPositionIterator>, beginindex: MutPtr<Int>, endindex: MutPtr<Int>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfieldpositerNext(fpositer.rawAddress, beginindex.rawAddress, endindex.rawAddress)

public actual fun ufieldpositerOpen(status: MutPtr<UErrorCode>): MutPtr<UFieldPositionIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfieldpositerOpen(status.rawAddress))

public actual fun ufmtClose(fmt: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtClose(fmt.rawAddress)
}

public actual fun ufmtGetArrayItemByIndex(fmt: MutPtr<MutPtr<CVoid>>, n: Int, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetArrayItemByIndex(fmt.rawAddress, n, status.rawAddress))

public actual fun ufmtGetArrayLength(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetArrayLength(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetDate(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetDate(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetDecNumChars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetDecNumChars(fmt.rawAddress, len.rawAddress, status.rawAddress))

public actual fun ufmtGetDouble(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetDouble(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetInt64(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetInt64(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetLong(fmt: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetLong(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetObject(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetObject(fmt.rawAddress, status.rawAddress))

public actual fun ufmtGetType(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): UFormattableType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetType(fmt.rawAddress, status.rawAddress)

public actual fun ufmtGetUchars(fmt: MutPtr<MutPtr<CVoid>>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtGetUchars(fmt.rawAddress, len.rawAddress, status.rawAddress))

public actual fun ufmtIsNumeric(fmt: ConstPtr<ConstPtr<CVoid>>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtIsNumeric(fmt.rawAddress)

public actual fun ufmtOpen(status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtOpen(status.rawAddress))

public actual fun ufmtvalGetString(ufmtval: ConstPtr<UFormattedValue>, plength: MutPtr<Int>, ec: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtvalGetString(ufmtval.rawAddress, plength.rawAddress, ec.rawAddress))

public actual fun ufmtvalNextPosition(ufmtval: ConstPtr<UFormattedValue>, ucfpos: MutPtr<UConstrainedFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUfmtvalNextPosition(ufmtval.rawAddress, ucfpos.rawAddress, ec.rawAddress)

public actual fun ugenderGetInstance(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UGenderInfo> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUgenderGetInstance(locale.rawAddress, status.rawAddress))

public actual fun ugenderGetListGender(genderinfo: ConstPtr<UGenderInfo>, genders: ConstPtr<UGender>, size: Int, status: MutPtr<UErrorCode>): UGender =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUgenderGetListGender(genderinfo.rawAddress, genders.rawAddress, size, status.rawAddress)

public actual fun uidnaClose(idna: MutPtr<Uidna>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaClose(idna.rawAddress)
}

public actual fun uidnaLabelToAscii(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaLabelToAscii(idna.rawAddress, label.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaLabelToAsciiUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaLabelToAsciiUtf8(idna.rawAddress, label.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaLabelToUnicode(idna: ConstPtr<Uidna>, label: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaLabelToUnicode(idna.rawAddress, label.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaLabelToUnicodeUtf8(idna: ConstPtr<Uidna>, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaLabelToUnicodeUtf8(idna.rawAddress, label.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaNameToAscii(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaNameToAscii(idna.rawAddress, name.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaNameToAsciiUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaNameToAsciiUtf8(idna.rawAddress, name.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaNameToUnicode(idna: ConstPtr<Uidna>, name: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaNameToUnicode(idna.rawAddress, name.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaNameToUnicodeUtf8(idna: ConstPtr<Uidna>, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: MutPtr<UIDNAInfo>, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaNameToUnicodeUtf8(idna.rawAddress, name.rawAddress, length, dest.rawAddress, capacity, pinfo.rawAddress, perrorcode.rawAddress)

public actual fun uidnaOpenUts46(options: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<Uidna> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUidnaOpenUts46(options.toInt(), perrorcode.rawAddress))

public actual fun uiterCurrent32(iter: MutPtr<UCharIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterCurrent32(iter.rawAddress)

public actual fun uiterGetState(iter: ConstPtr<UCharIterator>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterGetState(iter.rawAddress).toUInt()

public actual fun uiterNext32(iter: MutPtr<UCharIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterNext32(iter.rawAddress)

public actual fun uiterPrevious32(iter: MutPtr<UCharIterator>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterPrevious32(iter.rawAddress)

public actual fun uiterSetState(iter: MutPtr<UCharIterator>, state: UInt, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterSetState(iter.rawAddress, state.toInt(), perrorcode.rawAddress)
}

public actual fun uiterSetString(iter: MutPtr<UCharIterator>, s: ConstPtr<UShort>, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterSetString(iter.rawAddress, s.rawAddress, length)
}

public actual fun uiterSetUtf16Be(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterSetUtf16Be(iter.rawAddress, s.rawAddress, length)
}

public actual fun uiterSetUtf8(iter: MutPtr<UCharIterator>, s: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUiterSetUtf8(iter.rawAddress, s.rawAddress, length)
}

public actual fun uldnClose(ldn: MutPtr<ULocaleDisplayNames>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnClose(ldn.rawAddress)
}

public actual fun uldnGetContext(ldn: ConstPtr<ULocaleDisplayNames>, type: UDisplayContextType, perrorcode: MutPtr<UErrorCode>): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnGetContext(ldn.rawAddress, type, perrorcode.rawAddress)

public actual fun uldnGetDialectHandling(ldn: ConstPtr<ULocaleDisplayNames>): UDialectHandling =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnGetDialectHandling(ldn.rawAddress)

public actual fun uldnGetLocale(ldn: ConstPtr<ULocaleDisplayNames>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnGetLocale(ldn.rawAddress))

public actual fun uldnKeyDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnKeyDisplayName(ldn.rawAddress, key.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnKeyValueDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, key: Pcstr, value: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnKeyValueDisplayName(ldn.rawAddress, key.rawAddress, value.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnLanguageDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, lang: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnLanguageDisplayName(ldn.rawAddress, lang.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnLocaleDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, locale: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnLocaleDisplayName(ldn.rawAddress, locale.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnOpen(locale.rawAddress, dialecthandling, perrorcode.rawAddress))

public actual fun uldnOpenForContext(locale: Pcstr, contexts: MutPtr<UDisplayContext>, length: Int, perrorcode: MutPtr<UErrorCode>): MutPtr<ULocaleDisplayNames> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnOpenForContext(locale.rawAddress, contexts.rawAddress, length, perrorcode.rawAddress))

public actual fun uldnRegionDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, region: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnRegionDisplayName(ldn.rawAddress, region.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnScriptCodeDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, scriptcode: UScriptCode, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnScriptCodeDisplayName(ldn.rawAddress, scriptcode, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnScriptDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, script: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnScriptDisplayName(ldn.rawAddress, script.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun uldnVariantDisplayName(ldn: ConstPtr<ULocaleDisplayNames>, variant: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUldnVariantDisplayName(ldn.rawAddress, variant.rawAddress, result.rawAddress, maxresultsize, perrorcode.rawAddress)

public actual fun ulistfmtClose(listfmt: MutPtr<UListFormatter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtClose(listfmt.rawAddress)
}

public actual fun ulistfmtCloseResult(uresult: MutPtr<UFormattedList>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtCloseResult(uresult.rawAddress)
}

public actual fun ulistfmtFormat(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtFormat(listfmt.rawAddress, strings.rawAddress, stringlengths.rawAddress, stringcount, result.rawAddress, resultcapacity, status.rawAddress)

public actual fun ulistfmtFormatStringsToResult(listfmt: ConstPtr<UListFormatter>, strings: ConstPtr<ConstPtr<UShort>>, stringlengths: ConstPtr<Int>, stringcount: Int, uresult: MutPtr<UFormattedList>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtFormatStringsToResult(listfmt.rawAddress, strings.rawAddress, stringlengths.rawAddress, stringcount, uresult.rawAddress, status.rawAddress)
}

public actual fun ulistfmtOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtOpen(locale.rawAddress, status.rawAddress))

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: MutPtr<UErrorCode>): MutPtr<UListFormatter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtOpenForType(locale.rawAddress, type, width, status.rawAddress))

public actual fun ulistfmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedList> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtOpenResult(ec.rawAddress))

public actual fun ulistfmtResultAsValue(uresult: ConstPtr<UFormattedList>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlistfmtResultAsValue(uresult.rawAddress, ec.rawAddress))

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, acceptlist: ConstPtr<ConstPtr<Byte>>, acceptlistcount: Int, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocAcceptLanguage(result.rawAddress, resultavailable, outresult.rawAddress, acceptlist.rawAddress, acceptlistcount, availablelocales.rawAddress, status.rawAddress)

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: MutPtr<UAcceptResult>, httpacceptlanguage: Pcstr, availablelocales: MutPtr<UEnumeration>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocAcceptLanguageFromHttp(result.rawAddress, resultavailable, outresult.rawAddress, httpacceptlanguage.rawAddress, availablelocales.rawAddress, status.rawAddress)

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocAddLikelySubtags(localeid.rawAddress, maximizedlocaleid.rawAddress, maximizedlocaleidcapacity, err.rawAddress)

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocCanonicalize(localeid.rawAddress, name.rawAddress, namecapacity, err.rawAddress)

public actual fun ulocCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocCountAvailable()

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: MutPtr<Int>, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocForLanguageTag(langtag.rawAddress, localeid.rawAddress, localeidcapacity, parsedlength.rawAddress, err.rawAddress)

public actual fun ulocGetAvailable(n: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetAvailable(n))

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetBaseName(localeid.rawAddress, name.rawAddress, namecapacity, err.rawAddress)

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetCharacterOrientation(localeid.rawAddress, status.rawAddress)

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetCountry(localeid.rawAddress, country.rawAddress, countrycapacity, err.rawAddress)

public actual fun ulocGetDefault(): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDefault())

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: MutPtr<UShort>, countrycapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayCountry(locale.rawAddress, displaylocale.rawAddress, country.rawAddress, countrycapacity, status.rawAddress)

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayKeyword(keyword.rawAddress, displaylocale.rawAddress, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayKeywordValue(locale.rawAddress, keyword.rawAddress, displaylocale.rawAddress, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: MutPtr<UShort>, languagecapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayLanguage(locale.rawAddress, displaylocale.rawAddress, language.rawAddress, languagecapacity, status.rawAddress)

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: MutPtr<UShort>, maxresultsize: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayName(localeid.rawAddress, inlocaleid.rawAddress, result.rawAddress, maxresultsize, err.rawAddress)

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: MutPtr<UShort>, scriptcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayScript(locale.rawAddress, displaylocale.rawAddress, script.rawAddress, scriptcapacity, status.rawAddress)

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: MutPtr<UShort>, variantcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetDisplayVariant(locale.rawAddress, displaylocale.rawAddress, variant.rawAddress, variantcapacity, status.rawAddress)

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetIso3Country(localeid.rawAddress))

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetIso3Language(localeid.rawAddress))

public actual fun ulocGetIsocountries(): MutPtr<MutPtr<Byte>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetIsocountries())

public actual fun ulocGetIsolanguages(): MutPtr<MutPtr<Byte>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetIsolanguages())

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetKeywordValue(localeid.rawAddress, keywordname.rawAddress, buffer.rawAddress, buffercapacity, status.rawAddress)

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetLcid(localeid.rawAddress).toUInt()

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetLanguage(localeid.rawAddress, language.rawAddress, languagecapacity, err.rawAddress)

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: MutPtr<UErrorCode>): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetLineOrientation(localeid.rawAddress, status.rawAddress)

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetLocaleForLcid(hostid.toInt(), locale.rawAddress, localecapacity, status.rawAddress)

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetName(localeid.rawAddress, name.rawAddress, namecapacity, err.rawAddress)

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetParent(localeid.rawAddress, parent.rawAddress, parentcapacity, err.rawAddress)

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetScript(localeid.rawAddress, script.rawAddress, scriptcapacity, err.rawAddress)

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocGetVariant(localeid.rawAddress, variant.rawAddress, variantcapacity, err.rawAddress)

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocIsRightToLeft(locale.rawAddress)

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocMinimizeSubtags(localeid.rawAddress, minimizedlocaleid.rawAddress, minimizedlocaleidcapacity, err.rawAddress)

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocOpenAvailableByType(type, status.rawAddress))

public actual fun ulocOpenKeywords(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocOpenKeywords(localeid.rawAddress, status.rawAddress))

public actual fun ulocSetDefault(localeid: Pcstr, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocSetDefault(localeid.rawAddress, status.rawAddress)
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocSetKeywordValue(keywordname.rawAddress, keywordvalue.rawAddress, buffer.rawAddress, buffercapacity, status.rawAddress)

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocToLanguageTag(localeid.rawAddress, langtag.rawAddress, langtagcapacity, strict, err.rawAddress)

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocToLegacyKey(keyword.rawAddress))

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocToLegacyType(keyword.rawAddress, value.rawAddress))

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleKey(keyword.rawAddress))

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocToUnicodeLocaleType(keyword.rawAddress, value.rawAddress))

public actual fun ulocdataClose(uld: MutPtr<ULocaleData>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataClose(uld.rawAddress)
}

public actual fun ulocdataGetCldrversion(versionarray: MutPtr<UByte>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetCldrversion(versionarray.rawAddress, status.rawAddress)
}

public actual fun ulocdataGetDelimiter(uld: MutPtr<ULocaleData>, type: ULocaleDataDelimiterType, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetDelimiter(uld.rawAddress, type, result.rawAddress, resultlength, status.rawAddress)

public actual fun ulocdataGetExemplarSet(uld: MutPtr<ULocaleData>, fillin: MutPtr<USet>, options: UInt, extype: ULocaleDataExemplarSetType, status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetExemplarSet(uld.rawAddress, fillin.rawAddress, options.toInt(), extype, status.rawAddress))

public actual fun ulocdataGetLocaleDisplayPattern(uld: MutPtr<ULocaleData>, pattern: MutPtr<UShort>, patterncapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetLocaleDisplayPattern(uld.rawAddress, pattern.rawAddress, patterncapacity, status.rawAddress)

public actual fun ulocdataGetLocaleSeparator(uld: MutPtr<ULocaleData>, separator: MutPtr<UShort>, separatorcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetLocaleSeparator(uld.rawAddress, separator.rawAddress, separatorcapacity, status.rawAddress)

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: MutPtr<UErrorCode>): UMeasurementSystem =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetMeasurementSystem(localeid.rawAddress, status.rawAddress)

public actual fun ulocdataGetNoSubstitute(uld: MutPtr<ULocaleData>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetNoSubstitute(uld.rawAddress)

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: MutPtr<Int>, width: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataGetPaperSize(localeid.rawAddress, height.rawAddress, width.rawAddress, status.rawAddress)
}

public actual fun ulocdataOpen(localeid: Pcstr, status: MutPtr<UErrorCode>): MutPtr<ULocaleData> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataOpen(localeid.rawAddress, status.rawAddress))

public actual fun ulocdataSetNoSubstitute(uld: MutPtr<ULocaleData>, setting: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUlocdataSetNoSubstitute(uld.rawAddress, setting)
}

public actual fun umsgApplyPattern(fmt: MutPtr<MutPtr<CVoid>>, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgApplyPattern(fmt.rawAddress, pattern.rawAddress, patternlength, parseerror.rawAddress, status.rawAddress)
}

public actual fun umsgAutoQuoteApostrophe(pattern: ConstPtr<UShort>, patternlength: Int, dest: MutPtr<UShort>, destcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgAutoQuoteApostrophe(pattern.rawAddress, patternlength, dest.rawAddress, destcapacity, ec.rawAddress)

public actual fun umsgClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<CVoid> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgClone(fmt.rawAddress, status.rawAddress))

public actual fun umsgClose(format: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgClose(format.rawAddress)
}

public actual fun umsgFormat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgFormat(fmt.rawAddress, result.rawAddress, resultlength, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun umsgGetLocale(fmt: ConstPtr<ConstPtr<CVoid>>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgGetLocale(fmt.rawAddress))

public actual fun umsgOpen(pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgOpen(pattern.rawAddress, patternlength, locale.rawAddress, parseerror.rawAddress, status.rawAddress))

public actual fun umsgParse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, status: MutPtr<UErrorCode>, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgParse(fmt.rawAddress, source.rawAddress, sourcelength, count.rawAddress, status.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun umsgSetLocale(fmt: MutPtr<MutPtr<CVoid>>, locale: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgSetLocale(fmt.rawAddress, locale.rawAddress)
}

public actual fun umsgToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgToPattern(fmt.rawAddress, result.rawAddress, resultlength, status.rawAddress)

public actual fun umsgVformat(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgVformat(fmt.rawAddress, result.rawAddress, resultlength, ap.rawAddress, status.rawAddress)

public actual fun umsgVparse(fmt: ConstPtr<ConstPtr<CVoid>>, source: ConstPtr<UShort>, sourcelength: Int, count: MutPtr<Int>, ap: MutPtr<Byte>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmsgVparse(fmt.rawAddress, source.rawAddress, sourcelength, count.rawAddress, ap.rawAddress, status.rawAddress)
}

public actual fun umutablecptrieBuildImmutable(trie: MutPtr<UMutableCPTrie>, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: MutPtr<UErrorCode>): MutPtr<UCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieBuildImmutable(trie.rawAddress, type, valuewidth, perrorcode.rawAddress))

public actual fun umutablecptrieClone(other: ConstPtr<UMutableCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieClone(other.rawAddress, perrorcode.rawAddress))

public actual fun umutablecptrieClose(trie: MutPtr<UMutableCPTrie>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieClose(trie.rawAddress)
}

public actual fun umutablecptrieFromUcpmap(map: ConstPtr<UCPMap>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcpmap(map.rawAddress, perrorcode.rawAddress))

public actual fun umutablecptrieFromUcptrie(trie: ConstPtr<UCPTrie>, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieFromUcptrie(trie.rawAddress, perrorcode.rawAddress))

public actual fun umutablecptrieGet(trie: ConstPtr<UMutableCPTrie>, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieGet(trie.rawAddress, c).toUInt()

public actual fun umutablecptrieGetRange(trie: ConstPtr<UMutableCPTrie>, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: MutPtr<UCPMapValueFilter>, context: ConstPtr<CVoid>, pvalue: MutPtr<UInt>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieGetRange(trie.rawAddress, start, option, surrogatevalue.toInt(), filter.rawAddress, context.rawAddress, pvalue.rawAddress)

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: MutPtr<UErrorCode>): MutPtr<UMutableCPTrie> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieOpen(initialvalue.toInt(), errorvalue.toInt(), perrorcode.rawAddress))

public actual fun umutablecptrieSet(trie: MutPtr<UMutableCPTrie>, c: Int, value: UInt, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieSet(trie.rawAddress, c, value.toInt(), perrorcode.rawAddress)
}

public actual fun umutablecptrieSetRange(trie: MutPtr<UMutableCPTrie>, start: Int, end: Int, value: UInt, perrorcode: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUmutablecptrieSetRange(trie.rawAddress, start, end, value.toInt(), perrorcode.rawAddress)
}

public actual fun unorm2Append(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2Append(norm2.rawAddress, first.rawAddress, firstlength, firstcapacity, second.rawAddress, secondlength, perrorcode.rawAddress)

public actual fun unorm2Close(norm2: MutPtr<UNormalizer2>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2Close(norm2.rawAddress)
}

public actual fun unorm2ComposePair(norm2: ConstPtr<UNormalizer2>, a: Int, b: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2ComposePair(norm2.rawAddress, a, b)

public actual fun unorm2GetCombiningClass(norm2: ConstPtr<UNormalizer2>, c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetCombiningClass(norm2.rawAddress, c).toUByte()

public actual fun unorm2GetDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetDecomposition(norm2.rawAddress, c, decomposition.rawAddress, capacity, perrorcode.rawAddress)

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetInstance(packagename.rawAddress, name.rawAddress, mode, perrorcode.rawAddress))

public actual fun unorm2GetNfcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetNfcinstance(perrorcode.rawAddress))

public actual fun unorm2GetNfdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetNfdinstance(perrorcode.rawAddress))

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetNfkccasefoldInstance(perrorcode.rawAddress))

public actual fun unorm2GetNfkcinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetNfkcinstance(perrorcode.rawAddress))

public actual fun unorm2GetNfkdinstance(perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetNfkdinstance(perrorcode.rawAddress))

public actual fun unorm2GetRawDecomposition(norm2: ConstPtr<UNormalizer2>, c: Int, decomposition: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2GetRawDecomposition(norm2.rawAddress, c, decomposition.rawAddress, capacity, perrorcode.rawAddress)

public actual fun unorm2HasBoundaryAfter(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryAfter(norm2.rawAddress, c)

public actual fun unorm2HasBoundaryBefore(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2HasBoundaryBefore(norm2.rawAddress, c)

public actual fun unorm2IsInert(norm2: ConstPtr<UNormalizer2>, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2IsInert(norm2.rawAddress, c)

public actual fun unorm2IsNormalized(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2IsNormalized(norm2.rawAddress, s.rawAddress, length, perrorcode.rawAddress)

public actual fun unorm2Normalize(norm2: ConstPtr<UNormalizer2>, src: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2Normalize(norm2.rawAddress, src.rawAddress, length, dest.rawAddress, capacity, perrorcode.rawAddress)

public actual fun unorm2NormalizeSecondAndAppend(norm2: ConstPtr<UNormalizer2>, first: MutPtr<UShort>, firstlength: Int, firstcapacity: Int, second: ConstPtr<UShort>, secondlength: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2NormalizeSecondAndAppend(norm2.rawAddress, first.rawAddress, firstlength, firstcapacity, second.rawAddress, secondlength, perrorcode.rawAddress)

public actual fun unorm2OpenFiltered(norm2: ConstPtr<UNormalizer2>, filterset: ConstPtr<USet>, perrorcode: MutPtr<UErrorCode>): MutPtr<UNormalizer2> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2OpenFiltered(norm2.rawAddress, filterset.rawAddress, perrorcode.rawAddress))

public actual fun unorm2QuickCheck(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): UNormalizationCheckResult =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2QuickCheck(norm2.rawAddress, s.rawAddress, length, perrorcode.rawAddress)

public actual fun unorm2SpanQuickCheckYes(norm2: ConstPtr<UNormalizer2>, s: ConstPtr<UShort>, length: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnorm2SpanQuickCheckYes(norm2.rawAddress, s.rawAddress, length, perrorcode.rawAddress)

public actual fun unormCompare(s1: ConstPtr<UShort>, length1: Int, s2: ConstPtr<UShort>, length2: Int, options: UInt, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnormCompare(s1.rawAddress, length1, s2.rawAddress, length2, options.toInt(), perrorcode.rawAddress)

public actual fun unumApplyPattern(format: MutPtr<MutPtr<CVoid>>, localized: Byte, pattern: ConstPtr<UShort>, patternlength: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumApplyPattern(format.rawAddress, localized, pattern.rawAddress, patternlength, parseerror.rawAddress, status.rawAddress)
}

public actual fun unumClone(fmt: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumClone(fmt.rawAddress, status.rawAddress))

public actual fun unumClose(fmt: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumClose(fmt.rawAddress)
}

public actual fun unumCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumCountAvailable()

public actual fun unumFormat(fmt: ConstPtr<ConstPtr<CVoid>>, number: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormat(fmt.rawAddress, number, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumFormatDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, number: Pcstr, length: Int, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatDecimal(fmt.rawAddress, number.rawAddress, length, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumFormatDouble(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatDouble(fmt.rawAddress, number, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumFormatDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, number: Double, currency: MutPtr<UShort>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatDoubleCurrency(fmt.rawAddress, number, currency.rawAddress, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumFormatDoubleForFields(format: ConstPtr<ConstPtr<CVoid>>, number: Double, result: MutPtr<UShort>, resultlength: Int, fpositer: MutPtr<UFieldPositionIterator>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatDoubleForFields(format.rawAddress, number, result.rawAddress, resultlength, fpositer.rawAddress, status.rawAddress)

public actual fun unumFormatInt64(fmt: ConstPtr<ConstPtr<CVoid>>, number: Long, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatInt64(fmt.rawAddress, number, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumFormatUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, number: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<UShort>, resultlength: Int, pos: MutPtr<UFieldPosition>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumFormatUformattable(fmt.rawAddress, number.rawAddress, result.rawAddress, resultlength, pos.rawAddress, status.rawAddress)

public actual fun unumGetAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetAttribute(fmt.rawAddress, attr)

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetAvailable(localeindex))

public actual fun unumGetContext(fmt: ConstPtr<ConstPtr<CVoid>>, type: UDisplayContextType, status: MutPtr<UErrorCode>): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetContext(fmt.rawAddress, type, status.rawAddress)

public actual fun unumGetDoubleAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, attr: UNumberFormatAttribute): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetDoubleAttribute(fmt.rawAddress, attr)

public actual fun unumGetLocaleByType(fmt: ConstPtr<ConstPtr<CVoid>>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetLocaleByType(fmt.rawAddress, type, status.rawAddress))

public actual fun unumGetSymbol(fmt: ConstPtr<ConstPtr<CVoid>>, symbol: UNumberFormatSymbol, buffer: MutPtr<UShort>, size: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetSymbol(fmt.rawAddress, symbol, buffer.rawAddress, size, status.rawAddress)

public actual fun unumGetTextAttribute(fmt: ConstPtr<ConstPtr<CVoid>>, tag: UNumberFormatTextAttribute, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumGetTextAttribute(fmt.rawAddress, tag, result.rawAddress, resultlength, status.rawAddress)

public actual fun unumOpen(style: UNumberFormatStyle, pattern: ConstPtr<UShort>, patternlength: Int, locale: Pcstr, parseerr: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumOpen(style, pattern.rawAddress, patternlength, locale.rawAddress, parseerr.rawAddress, status.rawAddress))

public actual fun unumParse(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParse(fmt.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress)

public actual fun unumParseDecimal(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, outbuf: Pcstr, outbuflength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParseDecimal(fmt.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, outbuf.rawAddress, outbuflength, status.rawAddress)

public actual fun unumParseDouble(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParseDouble(fmt.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress)

public actual fun unumParseDoubleCurrency(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, currency: MutPtr<UShort>, status: MutPtr<UErrorCode>): Double =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParseDoubleCurrency(fmt.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, currency.rawAddress, status.rawAddress)

public actual fun unumParseInt64(fmt: ConstPtr<ConstPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParseInt64(fmt.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress)

public actual fun unumParseToUformattable(fmt: ConstPtr<ConstPtr<CVoid>>, result: MutPtr<MutPtr<CVoid>>, text: ConstPtr<UShort>, textlength: Int, parsepos: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumParseToUformattable(fmt.rawAddress, result.rawAddress, text.rawAddress, textlength, parsepos.rawAddress, status.rawAddress))

public actual fun unumSetAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumSetAttribute(fmt.rawAddress, attr, newvalue)
}

public actual fun unumSetContext(fmt: MutPtr<MutPtr<CVoid>>, value: UDisplayContext, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumSetContext(fmt.rawAddress, value, status.rawAddress)
}

public actual fun unumSetDoubleAttribute(fmt: MutPtr<MutPtr<CVoid>>, attr: UNumberFormatAttribute, newvalue: Double) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumSetDoubleAttribute(fmt.rawAddress, attr, newvalue)
}

public actual fun unumSetSymbol(fmt: MutPtr<MutPtr<CVoid>>, symbol: UNumberFormatSymbol, value: ConstPtr<UShort>, length: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumSetSymbol(fmt.rawAddress, symbol, value.rawAddress, length, status.rawAddress)
}

public actual fun unumSetTextAttribute(fmt: MutPtr<MutPtr<CVoid>>, tag: UNumberFormatTextAttribute, newvalue: ConstPtr<UShort>, newvaluelength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumSetTextAttribute(fmt.rawAddress, tag, newvalue.rawAddress, newvaluelength, status.rawAddress)
}

public actual fun unumToPattern(fmt: ConstPtr<ConstPtr<CVoid>>, ispatternlocalized: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumToPattern(fmt.rawAddress, ispatternlocalized, result.rawAddress, resultlength, status.rawAddress)

public actual fun unumfClose(uformatter: MutPtr<UNumberFormatter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfClose(uformatter.rawAddress)
}

public actual fun unumfCloseResult(uresult: MutPtr<UFormattedNumber>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfCloseResult(uresult.rawAddress)
}

public actual fun unumfFormatDecimal(uformatter: ConstPtr<UNumberFormatter>, value: Pcstr, valuelen: Int, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfFormatDecimal(uformatter.rawAddress, value.rawAddress, valuelen, uresult.rawAddress, ec.rawAddress)
}

public actual fun unumfFormatDouble(uformatter: ConstPtr<UNumberFormatter>, value: Double, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfFormatDouble(uformatter.rawAddress, value, uresult.rawAddress, ec.rawAddress)
}

public actual fun unumfFormatInt(uformatter: ConstPtr<UNumberFormatter>, value: Long, uresult: MutPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfFormatInt(uformatter.rawAddress, value, uresult.rawAddress, ec.rawAddress)
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocale(skeleton.rawAddress, skeletonlen, locale.rawAddress, ec.rawAddress))

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: ConstPtr<UShort>, skeletonlen: Int, locale: Pcstr, perror: MutPtr<UParseError>, ec: MutPtr<UErrorCode>): MutPtr<UNumberFormatter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfOpenForSkeletonAndLocaleWithError(skeleton.rawAddress, skeletonlen, locale.rawAddress, perror.rawAddress, ec.rawAddress))

public actual fun unumfOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedNumber> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfOpenResult(ec.rawAddress))

public actual fun unumfResultAsValue(uresult: ConstPtr<UFormattedNumber>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfResultAsValue(uresult.rawAddress, ec.rawAddress))

public actual fun unumfResultGetAllFieldPositions(uresult: ConstPtr<UFormattedNumber>, ufpositer: MutPtr<UFieldPositionIterator>, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfResultGetAllFieldPositions(uresult.rawAddress, ufpositer.rawAddress, ec.rawAddress)
}

public actual fun unumfResultNextFieldPosition(uresult: ConstPtr<UFormattedNumber>, ufpos: MutPtr<UFieldPosition>, ec: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfResultNextFieldPosition(uresult.rawAddress, ufpos.rawAddress, ec.rawAddress)

public actual fun unumfResultToString(uresult: ConstPtr<UFormattedNumber>, buffer: MutPtr<UShort>, buffercapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumfResultToString(uresult.rawAddress, buffer.rawAddress, buffercapacity, ec.rawAddress)

public actual fun unumsysClose(unumsys: MutPtr<UNumberingSystem>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysClose(unumsys.rawAddress)
}

public actual fun unumsysGetDescription(unumsys: ConstPtr<UNumberingSystem>, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysGetDescription(unumsys.rawAddress, result.rawAddress, resultlength, status.rawAddress)

public actual fun unumsysGetName(unumsys: ConstPtr<UNumberingSystem>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysGetName(unumsys.rawAddress))

public actual fun unumsysGetRadix(unumsys: ConstPtr<UNumberingSystem>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysGetRadix(unumsys.rawAddress)

public actual fun unumsysIsAlgorithmic(unumsys: ConstPtr<UNumberingSystem>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysIsAlgorithmic(unumsys.rawAddress)

public actual fun unumsysOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysOpen(locale.rawAddress, status.rawAddress))

public actual fun unumsysOpenAvailableNames(status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysOpenAvailableNames(status.rawAddress))

public actual fun unumsysOpenByName(name: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UNumberingSystem> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUnumsysOpenByName(name.rawAddress, status.rawAddress))

public actual fun uplrulesClose(uplrules: MutPtr<UPluralRules>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesClose(uplrules.rawAddress)
}

public actual fun uplrulesGetKeywords(uplrules: ConstPtr<UPluralRules>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesGetKeywords(uplrules.rawAddress, status.rawAddress))

public actual fun uplrulesOpen(locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesOpen(locale.rawAddress, status.rawAddress))

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: MutPtr<UErrorCode>): MutPtr<UPluralRules> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesOpenForType(locale.rawAddress, type, status.rawAddress))

public actual fun uplrulesSelect(uplrules: ConstPtr<UPluralRules>, number: Double, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesSelect(uplrules.rawAddress, number, keyword.rawAddress, capacity, status.rawAddress)

public actual fun uplrulesSelectFormatted(uplrules: ConstPtr<UPluralRules>, number: ConstPtr<UFormattedNumber>, keyword: MutPtr<UShort>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUplrulesSelectFormatted(uplrules.rawAddress, number.rawAddress, keyword.rawAddress, capacity, status.rawAddress)

public actual fun uregexAppendReplacement(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexAppendReplacement(regexp.rawAddress, replacementtext.rawAddress, replacementlength, destbuf.rawAddress, destcapacity.rawAddress, status.rawAddress)

public actual fun uregexAppendReplacementUtext(regexp: MutPtr<URegularExpression>, replacementtext: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexAppendReplacementUtext(regexp.rawAddress, replacementtext.rawAddress, dest.rawAddress, status.rawAddress)
}

public actual fun uregexAppendTail(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<MutPtr<UShort>>, destcapacity: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexAppendTail(regexp.rawAddress, destbuf.rawAddress, destcapacity.rawAddress, status.rawAddress)

public actual fun uregexAppendTailUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexAppendTailUtext(regexp.rawAddress, dest.rawAddress, status.rawAddress))

public actual fun uregexClone(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexClone(regexp.rawAddress, status.rawAddress))

public actual fun uregexClose(regexp: MutPtr<URegularExpression>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexClose(regexp.rawAddress)
}

public actual fun uregexEnd(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexEnd(regexp.rawAddress, groupnum, status.rawAddress)

public actual fun uregexEnd64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexEnd64(regexp.rawAddress, groupnum, status.rawAddress)

public actual fun uregexFind(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexFind(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexFind64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexFind64(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexFindNext(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexFindNext(regexp.rawAddress, status.rawAddress)

public actual fun uregexFlags(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexFlags(regexp.rawAddress, status.rawAddress)

public actual fun uregexGetFindProgressCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexFindProgressCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetFindProgressCallback(regexp.rawAddress, callback.rawAddress, context.rawAddress, status.rawAddress)
}

public actual fun uregexGetMatchCallback(regexp: ConstPtr<URegularExpression>, callback: MutPtr<URegexMatchCallback>, context: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetMatchCallback(regexp.rawAddress, callback.rawAddress, context.rawAddress, status.rawAddress)
}

public actual fun uregexGetStackLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetStackLimit(regexp.rawAddress, status.rawAddress)

public actual fun uregexGetText(regexp: MutPtr<URegularExpression>, textlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetText(regexp.rawAddress, textlength.rawAddress, status.rawAddress))

public actual fun uregexGetTimeLimit(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetTimeLimit(regexp.rawAddress, status.rawAddress)

public actual fun uregexGetUtext(regexp: MutPtr<URegularExpression>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGetUtext(regexp.rawAddress, dest.rawAddress, status.rawAddress))

public actual fun uregexGroup(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGroup(regexp.rawAddress, groupnum, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun uregexGroupCount(regexp: MutPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGroupCount(regexp.rawAddress, status.rawAddress)

public actual fun uregexGroupNumberFromCname(regexp: MutPtr<URegularExpression>, groupname: Pcstr, namelength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGroupNumberFromCname(regexp.rawAddress, groupname.rawAddress, namelength, status.rawAddress)

public actual fun uregexGroupNumberFromName(regexp: MutPtr<URegularExpression>, groupname: ConstPtr<UShort>, namelength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGroupNumberFromName(regexp.rawAddress, groupname.rawAddress, namelength, status.rawAddress)

public actual fun uregexGroupUtext(regexp: MutPtr<URegularExpression>, groupnum: Int, dest: MutPtr<UText>, grouplength: MutPtr<Long>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexGroupUtext(regexp.rawAddress, groupnum, dest.rawAddress, grouplength.rawAddress, status.rawAddress))

public actual fun uregexHasAnchoringBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexHasAnchoringBounds(regexp.rawAddress, status.rawAddress)

public actual fun uregexHasTransparentBounds(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexHasTransparentBounds(regexp.rawAddress, status.rawAddress)

public actual fun uregexHitEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexHitEnd(regexp.rawAddress, status.rawAddress)

public actual fun uregexLookingAt(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexLookingAt(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexLookingAt64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexLookingAt64(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexMatches(regexp: MutPtr<URegularExpression>, startindex: Int, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexMatches(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexMatches64(regexp: MutPtr<URegularExpression>, startindex: Long, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexMatches64(regexp.rawAddress, startindex, status.rawAddress)

public actual fun uregexOpen(pattern: ConstPtr<UShort>, patternlength: Int, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexOpen(pattern.rawAddress, patternlength, flags.toInt(), pe.rawAddress, status.rawAddress))

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexOpenC(pattern.rawAddress, flags.toInt(), pe.rawAddress, status.rawAddress))

public actual fun uregexOpenUtext(pattern: MutPtr<UText>, flags: UInt, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<URegularExpression> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexOpenUtext(pattern.rawAddress, flags.toInt(), pe.rawAddress, status.rawAddress))

public actual fun uregexPattern(regexp: ConstPtr<URegularExpression>, patlength: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexPattern(regexp.rawAddress, patlength.rawAddress, status.rawAddress))

public actual fun uregexPatternUtext(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexPatternUtext(regexp.rawAddress, status.rawAddress))

public actual fun uregexRefreshUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRefreshUtext(regexp.rawAddress, text.rawAddress, status.rawAddress)
}

public actual fun uregexRegionEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRegionEnd(regexp.rawAddress, status.rawAddress)

public actual fun uregexRegionEnd64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRegionEnd64(regexp.rawAddress, status.rawAddress)

public actual fun uregexRegionStart(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRegionStart(regexp.rawAddress, status.rawAddress)

public actual fun uregexRegionStart64(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRegionStart64(regexp.rawAddress, status.rawAddress)

public actual fun uregexReplaceAll(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReplaceAll(regexp.rawAddress, replacementtext.rawAddress, replacementlength, destbuf.rawAddress, destcapacity, status.rawAddress)

public actual fun uregexReplaceAllUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReplaceAllUtext(regexp.rawAddress, replacement.rawAddress, dest.rawAddress, status.rawAddress))

public actual fun uregexReplaceFirst(regexp: MutPtr<URegularExpression>, replacementtext: ConstPtr<UShort>, replacementlength: Int, destbuf: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReplaceFirst(regexp.rawAddress, replacementtext.rawAddress, replacementlength, destbuf.rawAddress, destcapacity, status.rawAddress)

public actual fun uregexReplaceFirstUtext(regexp: MutPtr<URegularExpression>, replacement: MutPtr<UText>, dest: MutPtr<UText>, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReplaceFirstUtext(regexp.rawAddress, replacement.rawAddress, dest.rawAddress, status.rawAddress))

public actual fun uregexRequireEnd(regexp: ConstPtr<URegularExpression>, status: MutPtr<UErrorCode>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexRequireEnd(regexp.rawAddress, status.rawAddress)

public actual fun uregexReset(regexp: MutPtr<URegularExpression>, index: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReset(regexp.rawAddress, index, status.rawAddress)
}

public actual fun uregexReset64(regexp: MutPtr<URegularExpression>, index: Long, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexReset64(regexp.rawAddress, index, status.rawAddress)
}

public actual fun uregexSetFindProgressCallback(regexp: MutPtr<URegularExpression>, callback: URegexFindProgressCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetFindProgressCallback(regexp.rawAddress, 0L, context.rawAddress, status.rawAddress)
}

public actual fun uregexSetMatchCallback(regexp: MutPtr<URegularExpression>, callback: URegexMatchCallback, context: ConstPtr<CVoid>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetMatchCallback(regexp.rawAddress, 0L, context.rawAddress, status.rawAddress)
}

public actual fun uregexSetRegion(regexp: MutPtr<URegularExpression>, regionstart: Int, regionlimit: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetRegion(regexp.rawAddress, regionstart, regionlimit, status.rawAddress)
}

public actual fun uregexSetRegion64(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetRegion64(regexp.rawAddress, regionstart, regionlimit, status.rawAddress)
}

public actual fun uregexSetRegionAndStart(regexp: MutPtr<URegularExpression>, regionstart: Long, regionlimit: Long, startindex: Long, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetRegionAndStart(regexp.rawAddress, regionstart, regionlimit, startindex, status.rawAddress)
}

public actual fun uregexSetStackLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetStackLimit(regexp.rawAddress, limit, status.rawAddress)
}

public actual fun uregexSetText(regexp: MutPtr<URegularExpression>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetText(regexp.rawAddress, text.rawAddress, textlength, status.rawAddress)
}

public actual fun uregexSetTimeLimit(regexp: MutPtr<URegularExpression>, limit: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetTimeLimit(regexp.rawAddress, limit, status.rawAddress)
}

public actual fun uregexSetUtext(regexp: MutPtr<URegularExpression>, text: MutPtr<UText>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSetUtext(regexp.rawAddress, text.rawAddress, status.rawAddress)
}

public actual fun uregexSplit(regexp: MutPtr<URegularExpression>, destbuf: MutPtr<UShort>, destcapacity: Int, requiredcapacity: MutPtr<Int>, destfields: MutPtr<MutPtr<UShort>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSplit(regexp.rawAddress, destbuf.rawAddress, destcapacity, requiredcapacity.rawAddress, destfields.rawAddress, destfieldscapacity, status.rawAddress)

public actual fun uregexSplitUtext(regexp: MutPtr<URegularExpression>, destfields: MutPtr<MutPtr<UText>>, destfieldscapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexSplitUtext(regexp.rawAddress, destfields.rawAddress, destfieldscapacity, status.rawAddress)

public actual fun uregexStart(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexStart(regexp.rawAddress, groupnum, status.rawAddress)

public actual fun uregexStart64(regexp: MutPtr<URegularExpression>, groupnum: Int, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexStart64(regexp.rawAddress, groupnum, status.rawAddress)

public actual fun uregexUseAnchoringBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexUseAnchoringBounds(regexp.rawAddress, b, status.rawAddress)
}

public actual fun uregexUseTransparentBounds(regexp: MutPtr<URegularExpression>, b: Byte, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregexUseTransparentBounds(regexp.rawAddress, b, status.rawAddress)
}

public actual fun uregionAreEqual(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionAreEqual(uregion.rawAddress, otherregion.rawAddress)

public actual fun uregionContains(uregion: ConstPtr<URegion>, otherregion: ConstPtr<URegion>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionContains(uregion.rawAddress, otherregion.rawAddress)

public actual fun uregionGetAvailable(type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetAvailable(type, status.rawAddress))

public actual fun uregionGetContainedRegions(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetContainedRegions(uregion.rawAddress, status.rawAddress))

public actual fun uregionGetContainedRegionsOfType(uregion: ConstPtr<URegion>, type: URegionType, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetContainedRegionsOfType(uregion.rawAddress, type, status.rawAddress))

public actual fun uregionGetContainingRegion(uregion: ConstPtr<URegion>): MutPtr<URegion> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetContainingRegion(uregion.rawAddress))

public actual fun uregionGetContainingRegionOfType(uregion: ConstPtr<URegion>, type: URegionType): MutPtr<URegion> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetContainingRegionOfType(uregion.rawAddress, type))

public actual fun uregionGetNumericCode(uregion: ConstPtr<URegion>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetNumericCode(uregion.rawAddress)

public actual fun uregionGetPreferredValues(uregion: ConstPtr<URegion>, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetPreferredValues(uregion.rawAddress, status.rawAddress))

public actual fun uregionGetRegionCode(uregion: ConstPtr<URegion>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetRegionCode(uregion.rawAddress))

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetRegionFromCode(regioncode.rawAddress, status.rawAddress))

public actual fun uregionGetRegionFromNumericCode(code: Int, status: MutPtr<UErrorCode>): MutPtr<URegion> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetRegionFromNumericCode(code, status.rawAddress))

public actual fun uregionGetType(uregion: ConstPtr<URegion>): URegionType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUregionGetType(uregion.rawAddress)

public actual fun ureldatefmtClose(reldatefmt: MutPtr<URelativeDateTimeFormatter>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtClose(reldatefmt.rawAddress)
}

public actual fun ureldatefmtCloseResult(ufrdt: MutPtr<UFormattedRelativeDateTime>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtCloseResult(ufrdt.rawAddress)
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, relativedatestring: ConstPtr<UShort>, relativedatestringlen: Int, timestring: ConstPtr<UShort>, timestringlen: Int, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtCombineDateAndTime(reldatefmt.rawAddress, relativedatestring.rawAddress, relativedatestringlen, timestring.rawAddress, timestringlen, result.rawAddress, resultcapacity, status.rawAddress)

public actual fun ureldatefmtFormat(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtFormat(reldatefmt.rawAddress, offset, unit, result.rawAddress, resultcapacity, status.rawAddress)

public actual fun ureldatefmtFormatNumeric(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumeric(reldatefmt.rawAddress, offset, unit, result.rawAddress, resultcapacity, status.rawAddress)

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtFormatNumericToResult(reldatefmt.rawAddress, offset, unit, result.rawAddress, status.rawAddress)
}

public actual fun ureldatefmtFormatToResult(reldatefmt: ConstPtr<URelativeDateTimeFormatter>, offset: Double, unit: URelativeDateTimeUnit, result: MutPtr<UFormattedRelativeDateTime>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtFormatToResult(reldatefmt.rawAddress, offset, unit, result.rawAddress, status.rawAddress)
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: MutPtr<MutPtr<CVoid>>, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: MutPtr<UErrorCode>): MutPtr<URelativeDateTimeFormatter> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtOpen(locale.rawAddress, nftoadopt.rawAddress, width, capitalizationcontext, status.rawAddress))

public actual fun ureldatefmtOpenResult(ec: MutPtr<UErrorCode>): MutPtr<UFormattedRelativeDateTime> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtOpenResult(ec.rawAddress))

public actual fun ureldatefmtResultAsValue(ufrdt: ConstPtr<UFormattedRelativeDateTime>, ec: MutPtr<UErrorCode>): MutPtr<UFormattedValue> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUreldatefmtResultAsValue(ufrdt.rawAddress, ec.rawAddress))

public actual fun uresClose(resourcebundle: MutPtr<UResourceBundle>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresClose(resourcebundle.rawAddress)
}

public actual fun uresGetBinary(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UByte> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetBinary(resourcebundle.rawAddress, len.rawAddress, status.rawAddress))

public actual fun uresGetByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexr: Int, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetByIndex(resourcebundle.rawAddress, indexr, fillin.rawAddress, status.rawAddress))

public actual fun uresGetByKey(resourcebundle: ConstPtr<UResourceBundle>, key: Pcstr, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetByKey(resourcebundle.rawAddress, key.rawAddress, fillin.rawAddress, status.rawAddress))

public actual fun uresGetInt(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetInt(resourcebundle.rawAddress, status.rawAddress)

public actual fun uresGetIntVector(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<Int> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetIntVector(resourcebundle.rawAddress, len.rawAddress, status.rawAddress))

public actual fun uresGetKey(resourcebundle: ConstPtr<UResourceBundle>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetKey(resourcebundle.rawAddress))

public actual fun uresGetLocaleByType(resourcebundle: ConstPtr<UResourceBundle>, type: ULocDataLocaleType, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetLocaleByType(resourcebundle.rawAddress, type, status.rawAddress))

public actual fun uresGetNextResource(resourcebundle: MutPtr<UResourceBundle>, fillin: MutPtr<UResourceBundle>, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetNextResource(resourcebundle.rawAddress, fillin.rawAddress, status.rawAddress))

public actual fun uresGetNextString(resourcebundle: MutPtr<UResourceBundle>, len: MutPtr<Int>, key: ConstPtr<ConstPtr<Byte>>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetNextString(resourcebundle.rawAddress, len.rawAddress, key.rawAddress, status.rawAddress))

public actual fun uresGetSize(resourcebundle: ConstPtr<UResourceBundle>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetSize(resourcebundle.rawAddress)

public actual fun uresGetString(resourcebundle: ConstPtr<UResourceBundle>, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetString(resourcebundle.rawAddress, len.rawAddress, status.rawAddress))

public actual fun uresGetStringByIndex(resourcebundle: ConstPtr<UResourceBundle>, indexs: Int, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetStringByIndex(resourcebundle.rawAddress, indexs, len.rawAddress, status.rawAddress))

public actual fun uresGetStringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, len: MutPtr<Int>, status: MutPtr<UErrorCode>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetStringByKey(resb.rawAddress, key.rawAddress, len.rawAddress, status.rawAddress))

public actual fun uresGetType(resourcebundle: ConstPtr<UResourceBundle>): UResType =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetType(resourcebundle.rawAddress)

public actual fun uresGetUint(resourcebundle: ConstPtr<UResourceBundle>, status: MutPtr<UErrorCode>): UInt =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetUint(resourcebundle.rawAddress, status.rawAddress).toUInt()

public actual fun uresGetUtf8String(resb: ConstPtr<UResourceBundle>, dest: Pcstr, length: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetUtf8String(resb.rawAddress, dest.rawAddress, length.rawAddress, forcecopy, status.rawAddress))

public actual fun uresGetUtf8StringByIndex(resb: ConstPtr<UResourceBundle>, stringindex: Int, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetUtf8StringByIndex(resb.rawAddress, stringindex, dest.rawAddress, plength.rawAddress, forcecopy, status.rawAddress))

public actual fun uresGetUtf8StringByKey(resb: ConstPtr<UResourceBundle>, key: Pcstr, dest: Pcstr, plength: MutPtr<Int>, forcecopy: Byte, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetUtf8StringByKey(resb.rawAddress, key.rawAddress, dest.rawAddress, plength.rawAddress, forcecopy, status.rawAddress))

public actual fun uresGetVersion(resb: ConstPtr<UResourceBundle>, versioninfo: MutPtr<UByte>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresGetVersion(resb.rawAddress, versioninfo.rawAddress)
}

public actual fun uresHasNext(resourcebundle: ConstPtr<UResourceBundle>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresHasNext(resourcebundle.rawAddress)

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresOpen(packagename.rawAddress, locale.rawAddress, status.rawAddress))

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresOpenAvailableLocales(packagename.rawAddress, status.rawAddress))

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresOpenDirect(packagename.rawAddress, locale.rawAddress, status.rawAddress))

public actual fun uresOpenU(packagename: ConstPtr<UShort>, locale: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UResourceBundle> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresOpenU(packagename.rawAddress, locale.rawAddress, status.rawAddress))

public actual fun uresResetIterator(resourcebundle: MutPtr<UResourceBundle>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUresResetIterator(resourcebundle.rawAddress)
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptBreaksBetweenLetters(script)

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: MutPtr<UScriptCode>, capacity: Int, err: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetCode(nameorabbrorlocale.rawAddress, fillin.rawAddress, capacity, err.rawAddress)

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetName(scriptcode))

public actual fun uscriptGetSampleString(script: UScriptCode, dest: MutPtr<UShort>, capacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetSampleString(script, dest.rawAddress, capacity, perrorcode.rawAddress)

public actual fun uscriptGetScript(codepoint: Int, err: MutPtr<UErrorCode>): UScriptCode =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetScript(codepoint, err.rawAddress)

public actual fun uscriptGetScriptExtensions(c: Int, scripts: MutPtr<UScriptCode>, capacity: Int, errorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetScriptExtensions(c, scripts.rawAddress, capacity, errorcode.rawAddress)

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetShortName(scriptcode))

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptGetUsage(script)

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptHasScript(c, sc)

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptIsCased(script)

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUscriptIsRightToLeft(script)

public actual fun usearchClose(searchiter: MutPtr<UStringSearch>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchClose(searchiter.rawAddress)
}

public actual fun usearchFirst(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchFirst(strsrch.rawAddress, status.rawAddress)

public actual fun usearchFollowing(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchFollowing(strsrch.rawAddress, position, status.rawAddress)

public actual fun usearchGetAttribute(strsrch: ConstPtr<UStringSearch>, attribute: USearchAttribute): USearchAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetAttribute(strsrch.rawAddress, attribute)

public actual fun usearchGetBreakIterator(strsrch: ConstPtr<UStringSearch>): MutPtr<UBreakIterator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetBreakIterator(strsrch.rawAddress))

public actual fun usearchGetCollator(strsrch: ConstPtr<UStringSearch>): MutPtr<UCollator> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetCollator(strsrch.rawAddress))

public actual fun usearchGetMatchedLength(strsrch: ConstPtr<UStringSearch>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetMatchedLength(strsrch.rawAddress)

public actual fun usearchGetMatchedStart(strsrch: ConstPtr<UStringSearch>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetMatchedStart(strsrch.rawAddress)

public actual fun usearchGetMatchedText(strsrch: ConstPtr<UStringSearch>, result: MutPtr<UShort>, resultcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetMatchedText(strsrch.rawAddress, result.rawAddress, resultcapacity, status.rawAddress)

public actual fun usearchGetOffset(strsrch: ConstPtr<UStringSearch>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetOffset(strsrch.rawAddress)

public actual fun usearchGetPattern(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetPattern(strsrch.rawAddress, length.rawAddress))

public actual fun usearchGetText(strsrch: ConstPtr<UStringSearch>, length: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchGetText(strsrch.rawAddress, length.rawAddress))

public actual fun usearchLast(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchLast(strsrch.rawAddress, status.rawAddress)

public actual fun usearchNext(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchNext(strsrch.rawAddress, status.rawAddress)

public actual fun usearchOpen(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, locale: Pcstr, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchOpen(pattern.rawAddress, patternlength, text.rawAddress, textlength, locale.rawAddress, breakiter.rawAddress, status.rawAddress))

public actual fun usearchOpenFromCollator(pattern: ConstPtr<UShort>, patternlength: Int, text: ConstPtr<UShort>, textlength: Int, collator: ConstPtr<UCollator>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>): MutPtr<UStringSearch> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchOpenFromCollator(pattern.rawAddress, patternlength, text.rawAddress, textlength, collator.rawAddress, breakiter.rawAddress, status.rawAddress))

public actual fun usearchPreceding(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchPreceding(strsrch.rawAddress, position, status.rawAddress)

public actual fun usearchPrevious(strsrch: MutPtr<UStringSearch>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchPrevious(strsrch.rawAddress, status.rawAddress)

public actual fun usearchReset(strsrch: MutPtr<UStringSearch>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchReset(strsrch.rawAddress)
}

public actual fun usearchSetAttribute(strsrch: MutPtr<UStringSearch>, attribute: USearchAttribute, value: USearchAttributeValue, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetAttribute(strsrch.rawAddress, attribute, value, status.rawAddress)
}

public actual fun usearchSetBreakIterator(strsrch: MutPtr<UStringSearch>, breakiter: MutPtr<UBreakIterator>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetBreakIterator(strsrch.rawAddress, breakiter.rawAddress, status.rawAddress)
}

public actual fun usearchSetCollator(strsrch: MutPtr<UStringSearch>, collator: ConstPtr<UCollator>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetCollator(strsrch.rawAddress, collator.rawAddress, status.rawAddress)
}

public actual fun usearchSetOffset(strsrch: MutPtr<UStringSearch>, position: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetOffset(strsrch.rawAddress, position, status.rawAddress)
}

public actual fun usearchSetPattern(strsrch: MutPtr<UStringSearch>, pattern: ConstPtr<UShort>, patternlength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetPattern(strsrch.rawAddress, pattern.rawAddress, patternlength, status.rawAddress)
}

public actual fun usearchSetText(strsrch: MutPtr<UStringSearch>, text: ConstPtr<UShort>, textlength: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsearchSetText(strsrch.rawAddress, text.rawAddress, textlength, status.rawAddress)
}

public actual fun usetAdd(set: MutPtr<USet>, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetAdd(set.rawAddress, c)
}

public actual fun usetAddAll(set: MutPtr<USet>, additionalset: ConstPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetAddAll(set.rawAddress, additionalset.rawAddress)
}

public actual fun usetAddAllCodePoints(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetAddAllCodePoints(set.rawAddress, str.rawAddress, strlen)
}

public actual fun usetAddRange(set: MutPtr<USet>, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetAddRange(set.rawAddress, start, end)
}

public actual fun usetAddString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetAddString(set.rawAddress, str.rawAddress, strlen)
}

public actual fun usetApplyIntPropertyValue(set: MutPtr<USet>, prop: UProperty, value: Int, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetApplyIntPropertyValue(set.rawAddress, prop, value, ec.rawAddress)
}

public actual fun usetApplyPattern(set: MutPtr<USet>, pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetApplyPattern(set.rawAddress, pattern.rawAddress, patternlength, options.toInt(), status.rawAddress)

public actual fun usetApplyPropertyAlias(set: MutPtr<USet>, prop: ConstPtr<UShort>, proplength: Int, value: ConstPtr<UShort>, valuelength: Int, ec: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetApplyPropertyAlias(set.rawAddress, prop.rawAddress, proplength, value.rawAddress, valuelength, ec.rawAddress)
}

public actual fun usetCharAt(set: ConstPtr<USet>, charindex: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetCharAt(set.rawAddress, charindex)

public actual fun usetClear(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetClear(set.rawAddress)
}

public actual fun usetClone(set: ConstPtr<USet>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetClone(set.rawAddress))

public actual fun usetCloneAsThawed(set: ConstPtr<USet>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetCloneAsThawed(set.rawAddress))

public actual fun usetClose(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetClose(set.rawAddress)
}

public actual fun usetCloseOver(set: MutPtr<USet>, attributes: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetCloseOver(set.rawAddress, attributes)
}

public actual fun usetCompact(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetCompact(set.rawAddress)
}

public actual fun usetComplement(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetComplement(set.rawAddress)
}

public actual fun usetComplementAll(set: MutPtr<USet>, complement: ConstPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetComplementAll(set.rawAddress, complement.rawAddress)
}

public actual fun usetContains(set: ConstPtr<USet>, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContains(set.rawAddress, c)

public actual fun usetContainsAll(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsAll(set1.rawAddress, set2.rawAddress)

public actual fun usetContainsAllCodePoints(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsAllCodePoints(set.rawAddress, str.rawAddress, strlen)

public actual fun usetContainsNone(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsNone(set1.rawAddress, set2.rawAddress)

public actual fun usetContainsRange(set: ConstPtr<USet>, start: Int, end: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsRange(set.rawAddress, start, end)

public actual fun usetContainsSome(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsSome(set1.rawAddress, set2.rawAddress)

public actual fun usetContainsString(set: ConstPtr<USet>, str: ConstPtr<UShort>, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetContainsString(set.rawAddress, str.rawAddress, strlen)

public actual fun usetEquals(set1: ConstPtr<USet>, set2: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetEquals(set1.rawAddress, set2.rawAddress)

public actual fun usetFreeze(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetFreeze(set.rawAddress)
}

public actual fun usetGetItem(set: ConstPtr<USet>, itemindex: Int, start: MutPtr<Int>, end: MutPtr<Int>, str: MutPtr<UShort>, strcapacity: Int, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetGetItem(set.rawAddress, itemindex, start.rawAddress, end.rawAddress, str.rawAddress, strcapacity, ec.rawAddress)

public actual fun usetGetItemCount(set: ConstPtr<USet>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetGetItemCount(set.rawAddress)

public actual fun usetGetSerializedRange(set: ConstPtr<USerializedSet>, rangeindex: Int, pstart: MutPtr<Int>, pend: MutPtr<Int>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetGetSerializedRange(set.rawAddress, rangeindex, pstart.rawAddress, pend.rawAddress)

public actual fun usetGetSerializedRangeCount(set: ConstPtr<USerializedSet>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetGetSerializedRangeCount(set.rawAddress)

public actual fun usetGetSerializedSet(fillset: MutPtr<USerializedSet>, src: ConstPtr<UShort>, srclength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetGetSerializedSet(fillset.rawAddress, src.rawAddress, srclength)

public actual fun usetIndexOf(set: ConstPtr<USet>, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetIndexOf(set.rawAddress, c)

public actual fun usetIsEmpty(set: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetIsEmpty(set.rawAddress)

public actual fun usetIsFrozen(set: ConstPtr<USet>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetIsFrozen(set.rawAddress)

public actual fun usetOpen(start: Int, end: Int): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetOpen(start, end))

public actual fun usetOpenEmpty(): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetOpenEmpty())

public actual fun usetOpenPattern(pattern: ConstPtr<UShort>, patternlength: Int, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetOpenPattern(pattern.rawAddress, patternlength, ec.rawAddress))

public actual fun usetOpenPatternOptions(pattern: ConstPtr<UShort>, patternlength: Int, options: UInt, ec: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetOpenPatternOptions(pattern.rawAddress, patternlength, options.toInt(), ec.rawAddress))

public actual fun usetRemove(set: MutPtr<USet>, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRemove(set.rawAddress, c)
}

public actual fun usetRemoveAll(set: MutPtr<USet>, removeset: ConstPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRemoveAll(set.rawAddress, removeset.rawAddress)
}

public actual fun usetRemoveAllStrings(set: MutPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRemoveAllStrings(set.rawAddress)
}

public actual fun usetRemoveRange(set: MutPtr<USet>, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRemoveRange(set.rawAddress, start, end)
}

public actual fun usetRemoveString(set: MutPtr<USet>, str: ConstPtr<UShort>, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRemoveString(set.rawAddress, str.rawAddress, strlen)
}

public actual fun usetResemblesPattern(pattern: ConstPtr<UShort>, patternlength: Int, pos: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetResemblesPattern(pattern.rawAddress, patternlength, pos)

public actual fun usetRetain(set: MutPtr<USet>, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRetain(set.rawAddress, start, end)
}

public actual fun usetRetainAll(set: MutPtr<USet>, retain: ConstPtr<USet>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetRetainAll(set.rawAddress, retain.rawAddress)
}

public actual fun usetSerialize(set: ConstPtr<USet>, dest: MutPtr<UShort>, destcapacity: Int, perrorcode: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSerialize(set.rawAddress, dest.rawAddress, destcapacity, perrorcode.rawAddress)

public actual fun usetSerializedContains(set: ConstPtr<USerializedSet>, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSerializedContains(set.rawAddress, c)

public actual fun usetSet(set: MutPtr<USet>, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSet(set.rawAddress, start, end)
}

public actual fun usetSetSerializedToOne(fillset: MutPtr<USerializedSet>, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSetSerializedToOne(fillset.rawAddress, c)
}

public actual fun usetSize(set: ConstPtr<USet>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSize(set.rawAddress)

public actual fun usetSpan(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSpan(set.rawAddress, s.rawAddress, length, spancondition)

public actual fun usetSpanBack(set: ConstPtr<USet>, s: ConstPtr<UShort>, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSpanBack(set.rawAddress, s.rawAddress, length, spancondition)

public actual fun usetSpanBackUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSpanBackUtf8(set.rawAddress, s.rawAddress, length, spancondition)

public actual fun usetSpanUtf8(set: ConstPtr<USet>, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetSpanUtf8(set.rawAddress, s.rawAddress, length, spancondition)

public actual fun usetToPattern(set: ConstPtr<USet>, result: MutPtr<UShort>, resultcapacity: Int, escapeunprintable: Byte, ec: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsetToPattern(set.rawAddress, result.rawAddress, resultcapacity, escapeunprintable, ec.rawAddress)

public actual fun uspoofAreConfusable(sc: ConstPtr<USpoofChecker>, id1: ConstPtr<UShort>, length1: Int, id2: ConstPtr<UShort>, length2: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofAreConfusable(sc.rawAddress, id1.rawAddress, length1, id2.rawAddress, length2, status.rawAddress)

public actual fun uspoofAreConfusableUtf8(sc: ConstPtr<USpoofChecker>, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofAreConfusableUtf8(sc.rawAddress, id1.rawAddress, length1, id2.rawAddress, length2, status.rawAddress)

public actual fun uspoofCheck(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofCheck(sc.rawAddress, id.rawAddress, length, position.rawAddress, status.rawAddress)

public actual fun uspoofCheck2(sc: ConstPtr<USpoofChecker>, id: ConstPtr<UShort>, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofCheck2(sc.rawAddress, id.rawAddress, length, checkresult.rawAddress, status.rawAddress)

public actual fun uspoofCheck2Utf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, checkresult: MutPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofCheck2Utf8(sc.rawAddress, id.rawAddress, length, checkresult.rawAddress, status.rawAddress)

public actual fun uspoofCheckUtf8(sc: ConstPtr<USpoofChecker>, id: Pcstr, length: Int, position: MutPtr<Int>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofCheckUtf8(sc.rawAddress, id.rawAddress, length, position.rawAddress, status.rawAddress)

public actual fun uspoofClone(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofClone(sc.rawAddress, status.rawAddress))

public actual fun uspoofClose(sc: MutPtr<USpoofChecker>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofClose(sc.rawAddress)
}

public actual fun uspoofCloseCheckResult(checkresult: MutPtr<USpoofCheckResult>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofCloseCheckResult(checkresult.rawAddress)
}

public actual fun uspoofGetAllowedChars(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetAllowedChars(sc.rawAddress, status.rawAddress))

public actual fun uspoofGetAllowedLocales(sc: MutPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetAllowedLocales(sc.rawAddress, status.rawAddress))

public actual fun uspoofGetCheckResultChecks(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetCheckResultChecks(checkresult.rawAddress, status.rawAddress)

public actual fun uspoofGetCheckResultNumerics(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetCheckResultNumerics(checkresult.rawAddress, status.rawAddress))

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: ConstPtr<USpoofCheckResult>, status: MutPtr<UErrorCode>): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetCheckResultRestrictionLevel(checkresult.rawAddress, status.rawAddress)

public actual fun uspoofGetChecks(sc: ConstPtr<USpoofChecker>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetChecks(sc.rawAddress, status.rawAddress)

public actual fun uspoofGetInclusionSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetInclusionSet(status.rawAddress))

public actual fun uspoofGetRecommendedSet(status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetRecommendedSet(status.rawAddress))

public actual fun uspoofGetRestrictionLevel(sc: ConstPtr<USpoofChecker>): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetRestrictionLevel(sc.rawAddress)

public actual fun uspoofGetSkeleton(sc: ConstPtr<USpoofChecker>, type: UInt, id: ConstPtr<UShort>, length: Int, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetSkeleton(sc.rawAddress, type.toInt(), id.rawAddress, length, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun uspoofGetSkeletonUtf8(sc: ConstPtr<USpoofChecker>, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofGetSkeletonUtf8(sc.rawAddress, type.toInt(), id.rawAddress, length, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun uspoofOpen(status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofOpen(status.rawAddress))

public actual fun uspoofOpenCheckResult(status: MutPtr<UErrorCode>): MutPtr<USpoofCheckResult> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofOpenCheckResult(status.rawAddress))

public actual fun uspoofOpenFromSerialized(data: ConstPtr<CVoid>, length: Int, pactuallength: MutPtr<Int>, perrorcode: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofOpenFromSerialized(data.rawAddress, length, pactuallength.rawAddress, perrorcode.rawAddress))

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: MutPtr<Int>, pe: MutPtr<UParseError>, status: MutPtr<UErrorCode>): MutPtr<USpoofChecker> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofOpenFromSource(confusables.rawAddress, confusableslen, confusableswholescript.rawAddress, confusableswholescriptlen, errtype.rawAddress, pe.rawAddress, status.rawAddress))

public actual fun uspoofSerialize(sc: MutPtr<USpoofChecker>, data: MutPtr<CVoid>, capacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofSerialize(sc.rawAddress, data.rawAddress, capacity, status.rawAddress)

public actual fun uspoofSetAllowedChars(sc: MutPtr<USpoofChecker>, chars: ConstPtr<USet>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofSetAllowedChars(sc.rawAddress, chars.rawAddress, status.rawAddress)
}

public actual fun uspoofSetAllowedLocales(sc: MutPtr<USpoofChecker>, localeslist: Pcstr, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofSetAllowedLocales(sc.rawAddress, localeslist.rawAddress, status.rawAddress)
}

public actual fun uspoofSetChecks(sc: MutPtr<USpoofChecker>, checks: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofSetChecks(sc.rawAddress, checks, status.rawAddress)
}

public actual fun uspoofSetRestrictionLevel(sc: MutPtr<USpoofChecker>, restrictionlevel: URestrictionLevel) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUspoofSetRestrictionLevel(sc.rawAddress, restrictionlevel)
}

public actual fun usprepClose(profile: MutPtr<UStringPrepProfile>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsprepClose(profile.rawAddress)
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsprepOpen(path.rawAddress, filename.rawAddress, status.rawAddress))

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: MutPtr<UErrorCode>): MutPtr<UStringPrepProfile> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsprepOpenByType(type, status.rawAddress))

public actual fun usprepPrepare(prep: ConstPtr<UStringPrepProfile>, src: ConstPtr<UShort>, srclength: Int, dest: MutPtr<UShort>, destcapacity: Int, options: Int, parseerror: MutPtr<UParseError>, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUsprepPrepare(prep.rawAddress, src.rawAddress, srclength, dest.rawAddress, destcapacity, options, parseerror.rawAddress, status.rawAddress)

public actual fun utextChar32At(ut: MutPtr<UText>, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextChar32At(ut.rawAddress, nativeindex)

public actual fun utextClone(dest: MutPtr<UText>, src: ConstPtr<UText>, deep: Byte, readonly: Byte, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextClone(dest.rawAddress, src.rawAddress, deep, readonly, status.rawAddress))

public actual fun utextClose(ut: MutPtr<UText>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextClose(ut.rawAddress))

public actual fun utextCopy(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextCopy(ut.rawAddress, nativestart, nativelimit, destindex, move, status.rawAddress)
}

public actual fun utextCurrent32(ut: MutPtr<UText>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextCurrent32(ut.rawAddress)

public actual fun utextEquals(a: ConstPtr<UText>, b: ConstPtr<UText>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextEquals(a.rawAddress, b.rawAddress)

public actual fun utextExtract(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, dest: MutPtr<UShort>, destcapacity: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextExtract(ut.rawAddress, nativestart, nativelimit, dest.rawAddress, destcapacity, status.rawAddress)

public actual fun utextFreeze(ut: MutPtr<UText>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextFreeze(ut.rawAddress)
}

public actual fun utextGetNativeIndex(ut: ConstPtr<UText>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextGetNativeIndex(ut.rawAddress)

public actual fun utextGetPreviousNativeIndex(ut: MutPtr<UText>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextGetPreviousNativeIndex(ut.rawAddress)

public actual fun utextHasMetaData(ut: ConstPtr<UText>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextHasMetaData(ut.rawAddress)

public actual fun utextIsLengthExpensive(ut: ConstPtr<UText>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextIsLengthExpensive(ut.rawAddress)

public actual fun utextIsWritable(ut: ConstPtr<UText>): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextIsWritable(ut.rawAddress)

public actual fun utextMoveIndex32(ut: MutPtr<UText>, delta: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextMoveIndex32(ut.rawAddress, delta)

public actual fun utextNativeLength(ut: MutPtr<UText>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextNativeLength(ut.rawAddress)

public actual fun utextNext32(ut: MutPtr<UText>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextNext32(ut.rawAddress)

public actual fun utextNext32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextNext32From(ut.rawAddress, nativeindex)

public actual fun utextOpenUchars(ut: MutPtr<UText>, s: ConstPtr<UShort>, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextOpenUchars(ut.rawAddress, s.rawAddress, length, status.rawAddress))

public actual fun utextOpenUtf8(ut: MutPtr<UText>, s: Pcstr, length: Long, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextOpenUtf8(ut.rawAddress, s.rawAddress, length, status.rawAddress))

public actual fun utextPrevious32(ut: MutPtr<UText>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextPrevious32(ut.rawAddress)

public actual fun utextPrevious32From(ut: MutPtr<UText>, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextPrevious32From(ut.rawAddress, nativeindex)

public actual fun utextReplace(ut: MutPtr<UText>, nativestart: Long, nativelimit: Long, replacementtext: ConstPtr<UShort>, replacementlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextReplace(ut.rawAddress, nativestart, nativelimit, replacementtext.rawAddress, replacementlength, status.rawAddress)

public actual fun utextSetNativeIndex(ut: MutPtr<UText>, nativeindex: Long) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextSetNativeIndex(ut.rawAddress, nativeindex)
}

public actual fun utextSetup(ut: MutPtr<UText>, extraspace: Int, status: MutPtr<UErrorCode>): MutPtr<UText> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtextSetup(ut.rawAddress, extraspace, status.rawAddress))

public actual fun utf8AppendCharSafeBody(s: MutPtr<UByte>, i: Int, length: Int, c: Int, piserror: MutPtr<Byte>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtf8AppendCharSafeBody(s.rawAddress, i, length, c, piserror.rawAddress)

public actual fun utf8Back1SafeBody(s: ConstPtr<UByte>, start: Int, i: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtf8Back1SafeBody(s.rawAddress, start, i)

public actual fun utf8NextCharSafeBody(s: ConstPtr<UByte>, pi: MutPtr<Int>, length: Int, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtf8NextCharSafeBody(s.rawAddress, pi.rawAddress, length, c, strict)

public actual fun utf8PrevCharSafeBody(s: ConstPtr<UByte>, start: Int, pi: MutPtr<Int>, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtf8PrevCharSafeBody(s.rawAddress, start, pi.rawAddress, c, strict)

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtmscaleFromInt64(othertime, timescale, status.rawAddress)

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtmscaleGetTimeScaleValue(timescale, value, status.rawAddress)

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: MutPtr<UErrorCode>): Long =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtmscaleToInt64(universaltime, timescale, status.rawAddress)

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceFormat(outbuf.rawAddress, capacity, indent, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    ConstPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceFunctionName(fnnumber))

public actual fun utraceGetFunctions(context: ConstPtr<ConstPtr<CVoid>>, e: MutPtr<UTraceEntry>, x: MutPtr<UTraceExit>, d: MutPtr<UTraceData>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceGetFunctions(context.rawAddress, e.rawAddress, x.rawAddress, d.rawAddress)
}

public actual fun utraceGetLevel(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceGetLevel()

public actual fun utraceSetFunctions(context: ConstPtr<CVoid>, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceSetFunctions(context.rawAddress, 0L, 0L, 0L)
}

public actual fun utraceSetLevel(tracelevel: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceSetLevel(tracelevel)
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: MutPtr<Byte>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtraceVformat(outbuf.rawAddress, capacity, indent, fmt.rawAddress, args.rawAddress)

public actual fun utransClone(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransClone(trans.rawAddress, status.rawAddress))

public actual fun utransClose(trans: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransClose(trans.rawAddress)
}

public actual fun utransCountAvailableIds(): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransCountAvailableIds()

public actual fun utransGetSourceSet(trans: ConstPtr<ConstPtr<CVoid>>, ignorefilter: Byte, fillin: MutPtr<USet>, status: MutPtr<UErrorCode>): MutPtr<USet> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransGetSourceSet(trans.rawAddress, ignorefilter, fillin.rawAddress, status.rawAddress))

public actual fun utransGetUnicodeId(trans: ConstPtr<ConstPtr<CVoid>>, resultlength: MutPtr<Int>): MutPtr<UShort> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransGetUnicodeId(trans.rawAddress, resultlength.rawAddress))

public actual fun utransOpenIds(perrorcode: MutPtr<UErrorCode>): MutPtr<UEnumeration> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransOpenIds(perrorcode.rawAddress))

public actual fun utransOpenInverse(trans: ConstPtr<ConstPtr<CVoid>>, status: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransOpenInverse(trans.rawAddress, status.rawAddress))

public actual fun utransOpenU(id: ConstPtr<UShort>, idlength: Int, dir: UTransDirection, rules: ConstPtr<UShort>, ruleslength: Int, parseerror: MutPtr<UParseError>, perrorcode: MutPtr<UErrorCode>): MutPtr<MutPtr<CVoid>> =
    MutPtr(WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransOpenU(id.rawAddress, idlength, dir, rules.rawAddress, ruleslength, parseerror.rawAddress, perrorcode.rawAddress))

public actual fun utransRegister(adoptedtrans: MutPtr<MutPtr<CVoid>>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransRegister(adoptedtrans.rawAddress, status.rawAddress)
}

public actual fun utransSetFilter(trans: MutPtr<MutPtr<CVoid>>, filterpattern: ConstPtr<UShort>, filterpatternlen: Int, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransSetFilter(trans.rawAddress, filterpattern.rawAddress, filterpatternlen, status.rawAddress)
}

public actual fun utransToRules(trans: ConstPtr<ConstPtr<CVoid>>, escapeunprintable: Byte, result: MutPtr<UShort>, resultlength: Int, status: MutPtr<UErrorCode>): Int =
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransToRules(trans.rawAddress, escapeunprintable, result.rawAddress, resultlength, status.rawAddress)

public actual fun utransTrans(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransTrans(trans.rawAddress, rep.rawAddress, repfunc.rawAddress, start, limit.rawAddress, status.rawAddress)
}

public actual fun utransTransIncremental(trans: ConstPtr<ConstPtr<CVoid>>, rep: MutPtr<MutPtr<CVoid>>, repfunc: ConstPtr<UReplaceableCallbacks>, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransTransIncremental(trans.rawAddress, rep.rawAddress, repfunc.rawAddress, pos.rawAddress, status.rawAddress)
}

public actual fun utransTransIncrementalUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, pos: MutPtr<UTransPosition>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransTransIncrementalUchars(trans.rawAddress, text.rawAddress, textlength.rawAddress, textcapacity, pos.rawAddress, status.rawAddress)
}

public actual fun utransTransUchars(trans: ConstPtr<ConstPtr<CVoid>>, text: MutPtr<UShort>, textlength: MutPtr<Int>, textcapacity: Int, start: Int, limit: MutPtr<Int>, status: MutPtr<UErrorCode>) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransTransUchars(trans.rawAddress, text.rawAddress, textlength.rawAddress, textcapacity, start, limit.rawAddress, status.rawAddress)
}

public actual fun utransUnregisterId(id: ConstPtr<UShort>, idlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssysWindowsWin32GlobalizationUtransUnregisterId(id.rawAddress, idlength)
}
