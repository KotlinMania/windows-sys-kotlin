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

private object WindowsWin32GlobalizationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_globalization_adjustCalendarDate(lpcaldatetime: Long, calunit: Int, amount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_compareStringA(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_compareStringEx(lplocalename: Long, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, lpversioninformation: Long, lpreserved: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_compareStringOrdinal(lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_compareStringW(locale: Int, dwcmpflags: Int, lpstring1: Long, cchcount1: Int, lpstring2: Long, cchcount2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_convertCalDateTimeToSystemTime(lpcaldatetime: Long, lpsystime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_convertDefaultLocale(locale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_convertSystemTimeToCalDateTime(lpsystime: Long, calid: Int, lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumCalendarInfoA(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumCalendarInfoExA(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumCalendarInfoExEx(pcalinfoenumprocexex: Long, lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumCalendarInfoExW(lpcalinfoenumprocex: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumCalendarInfoW(lpcalinfoenumproc: Long, locale: Int, calendar: Int, caltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumDateFormatsA(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumDateFormatsExA(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumDateFormatsExEx(lpdatefmtenumprocexex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumDateFormatsExW(lpdatefmtenumprocex: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumDateFormatsW(lpdatefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: Long, languagegroup: Int, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemCodePagesA(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemCodePagesW(lpcodepageenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemGeoID(geoclass: Int, parentgeoid: Int, lpgeoenumproc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemGeoNames(geoclass: Int, geoenumproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemLanguageGroupsA(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemLanguageGroupsW(lplanguagegroupenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemLocalesA(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemLocalesEx(lplocaleenumprocex: Long, dwflags: Int, lparam: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumSystemLocalesW(lplocaleenumproc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumTimeFormatsA(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumTimeFormatsEx(lptimefmtenumprocex: Long, lplocalename: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumTimeFormatsW(lptimefmtenumproc: Long, locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumUILanguagesA(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_enumUILanguagesW(lpuilanguageenumproc: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_findNLSString(locale: Int, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_findNLSStringEx(lplocalename: Long, dwfindnlsstringflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, pcchfound: Long, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_findStringOrdinal(dwfindstringordinalflags: Int, lpstringsource: Long, cchsource: Int, lpstringvalue: Long, cchvalue: Int, bignorecase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_foldStringA(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_foldStringW(dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getACP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCPInfo(codepage: Int, lpcpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCPInfoExA(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCPInfoExW(codepage: Int, dwflags: Int, lpcpinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCalendarDateFormatEx(lpszlocale: Long, dwflags: Int, lpcaldatetime: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCalendarInfoEx(lplocalename: Long, calendar: Int, lpreserved: Long, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long, cchdata: Int, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCalendarSupportedDateRange(calendar: Int, lpcalmindatetime: Long, lpcalmaxdatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCurrencyFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCurrencyFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getCurrencyFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpcurrencystr: Long, cchcurrency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDateFormatA(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDateFormatEx(lplocalename: Long, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int, lpcalendar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDateFormatW(locale: Int, dwflags: Int, lpdate: Long, lpformat: Long, lpdatestr: Long, cchdate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDistanceOfClosestLanguageInList(pszlanguage: Long, pszlanguageslist: Long, wchlistdelimiter: Short, pclosestdistance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDurationFormat(locale: Int, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getDurationFormatEx(lplocalename: Long, dwflags: Int, lpduration: Long, ullduration: Long, lpformat: Long, lpdurationstr: Long, cchduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getFileMUIInfo(dwflags: Int, pcwszfilepath: Long, pfilemuiinfo: Long, pcbfilemuiinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getFileMUIPath(dwflags: Int, pcwszfilepath: Long, pwszlanguage: Long, pcchlanguage: Long, pwszfilemuipath: Long, pcchfilemuipath: Long, pululenumerator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getGeoInfoA(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getGeoInfoEx(location: Long, geotype: Int, geodata: Long, geodatacount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getGeoInfoW(location: Int, geotype: Int, lpgeodata: Long, cchdata: Int, langid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getLocaleInfoEx(lplocalename: Long, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long, cchdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getNLSVersion(function: Int, locale: Int, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getNLSVersionEx(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getNumberFormatA(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getNumberFormatEx(lplocalename: Long, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getNumberFormatW(locale: Int, dwflags: Int, lpvalue: Long, lpformat: Long, lpnumberstr: Long, cchnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getOEMCP(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getProcessPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getStringScripts(dwflags: Int, lpstring: Long, cchstring: Int, lpscripts: Long, cchscripts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getStringTypeA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getStringTypeExA(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getStringTypeExW(locale: Int, dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getStringTypeW(dwinfotype: Int, lpsrcstr: Long, cchsrc: Int, lpchartype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getSystemDefaultLCID(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getSystemDefaultLangID(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getSystemDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getSystemDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getSystemPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getTextCharset(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getTextCharsetInfo(hdc: Long, lpsig: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getThreadLocale(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getThreadPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getThreadUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getTimeFormatA(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getTimeFormatEx(lplocalename: Long, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getTimeFormatW(locale: Int, dwflags: Int, lptime: Long, lpformat: Long, lptimestr: Long, cchtime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUILanguageInfo(dwflags: Int, pwmszlanguage: Long, pwszfallbacklanguages: Long, pcchfallbacklanguages: Long, pattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserDefaultGeoName(geoname: Long, geonamecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserDefaultLCID(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserDefaultLangID(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserDefaultLocaleName(lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserDefaultUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserGeoID(geoclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_getUserPreferredUILanguages(dwflags: Int, pulnumlanguages: Long, pwszlanguagesbuffer: Long, pcchlanguagesbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_idnToAscii(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpasciicharstr: Long, cchasciichar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_idnToNameprepUnicode(dwflags: Int, lpunicodecharstr: Long, cchunicodechar: Int, lpnameprepcharstr: Long, cchnameprepchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_idnToUnicode(dwflags: Int, lpasciicharstr: Long, cchasciichar: Int, lpunicodecharstr: Long, cchunicodechar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isCalendarLeapYear(calid: Int, year: Int, era: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isDBCSLeadByte(testchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isDBCSLeadByteEx(codepage: Int, testchar: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isNLSDefinedString(function: Int, dwflags: Int, lpversioninformation: Long, lpstring: Long, cchstr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isNormalizedString(normform: Int, lpstring: Long, cwlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isTextUnicode(lpv: Long, isize: Int, lpiresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isValidCodePage(codepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isValidLanguageGroup(languagegroup: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isValidLocale(locale: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isValidLocaleName(lplocalename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isValidNLSVersion(function: Int, lplocalename: Long, lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_isWellFormedTag(psztag: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lCIDToLocaleName(locale: Int, lpname: Long, cchname: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lCMapStringA(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lCMapStringEx(lplocalename: Long, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int, lpversioninformation: Long, lpreserved: Long, sorthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_lCMapStringW(locale: Int, dwmapflags: Int, lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_localeNameToLCID(lpname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_mappingDoAction(pbag: Long, dwrangeindex: Int, pszactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_mappingFreePropertyBag(pbag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_mappingFreeServices(pserviceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_mappingGetServices(poptions: Long, prgservices: Long, pdwservicescount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_mappingRecognizeText(pserviceinfo: Long, psztext: Long, dwlength: Int, dwindex: Int, poptions: Long, pbag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_multiByteToWideChar(codepage: Int, dwflags: Int, lpmultibytestr: Long, cbmultibyte: Int, lpwidecharstr: Long, cchwidechar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_normalizeString(normform: Int, lpsrcstring: Long, cwsrclength: Int, lpdststring: Long, cwdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_notifyUILanguageChange(dwflags: Int, pcwstrnewlanguage: Long, pcwstrpreviouslanguage: Long, dwreserved: Int, pdwstatusrtrn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_resolveLocaleName(lpnametoresolve: Long, lplocalename: Long, cchlocalename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_restoreThreadPreferredUILanguages(snapshot: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptApplyDigitSubstitution(psds: Long, psc: Long, pss: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptApplyLogicalWidth(pidx: Long, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pabc: Long, pijustify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptBreak(pwcchars: Long, cchars: Int, psa: Long, psla: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptCPtoX(icp: Int, ftrailing: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, pix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptCacheGetHeight(hdc: Long, psc: Long, tmheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptFreeCache(psc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetCMap(hdc: Long, psc: Long, pwcinchars: Long, cchars: Int, dwflags: Int, pwoutglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetFontAlternateGlyphs(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, wglyphid: Short, cmaxalternates: Int, palternateglyphs: Long, pcalternates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetFontFeatureTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, cmaxtags: Int, pfeaturetags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetFontLanguageTags(hdc: Long, psc: Long, psa: Long, tagscript: Int, cmaxtags: Int, plangsystags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetFontProperties(hdc: Long, psc: Long, sfp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetFontScriptTags(hdc: Long, psc: Long, psa: Long, cmaxtags: Int, pscripttags: Long, pctags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetGlyphABCWidth(hdc: Long, psc: Long, wglyph: Short, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetLogicalWidths(psa: Long, cchars: Int, cglyphs: Int, piglyphwidth: Long, pwlogclust: Long, psva: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptGetProperties(ppsp: Long, pinumscripts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptIsComplex(pwcinchars: Long, cinchars: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptItemize(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptItemizeOpenType(pwcinchars: Long, cinchars: Int, cmaxitems: Int, pscontrol: Long, psstate: Long, pitems: Long, pscripttags: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptJustify(psva: Long, piadvance: Long, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptLayout(cruns: Int, pblevel: Long, pivisualtological: Long, pilogicaltovisual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptPlace(hdc: Long, psc: Long, pwglyphs: Long, cglyphs: Int, psva: Long, psa: Long, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptPlaceOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, pwlogclust: Long, pcharprops: Long, cchars: Int, pwglyphs: Long, pglyphprops: Long, cglyphs: Int, piadvance: Long, pgoffset: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptRecordDigitSubstitution(locale: Int, psds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptShape(hdc: Long, psc: Long, pwcchars: Long, cchars: Int, cmaxglyphs: Int, psa: Long, pwoutglyphs: Long, pwlogclust: Long, psva: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptShapeOpenType(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, rcrangechars: Long, rprangeproperties: Long, cranges: Int, pwcchars: Long, cchars: Int, cmaxglyphs: Int, pwlogclust: Long, pcharprops: Long, pwoutglyphs: Long, poutglyphprops: Long, pcglyphs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringAnalyse(hdc: Long, pstring: Long, cstring: Int, cglyphs: Int, icharset: Int, dwflags: Int, ireqwidth: Int, pscontrol: Long, psstate: Long, pidx: Long, ptabdef: Long, pbinclass: Long, pssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringCPtoX(ssa: Long, icp: Int, ftrailing: Int, px: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringFree(pssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringGetLogicalWidths(ssa: Long, pidx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringGetOrder(ssa: Long, puorder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringOut(ssa: Long, ix: Int, iy: Int, uoptions: Int, prc: Long, iminsel: Int, imaxsel: Int, fdisabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringValidate(ssa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringXtoCP(ssa: Long, ix: Int, pich: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringPLogAttr(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringPSize(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptStringPcOutChars(ssa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptSubstituteSingleGlyph(hdc: Long, psc: Long, psa: Long, tagscript: Int, taglangsys: Int, tagfeature: Int, lparameter: Int, wglyphid: Short, pwoutglyphid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptTextOut(hdc: Long, psc: Long, x: Int, y: Int, fuoptions: Int, lprc: Long, psa: Long, pwcreserved: Long, ireserved: Int, pwglyphs: Long, cglyphs: Int, piadvance: Long, pijustify: Long, pgoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: Long, psva: Long, piadvance: Long, psa: Long, picp: Long, pitrailing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setCalendarInfoA(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setCalendarInfoW(locale: Int, calendar: Int, caltype: Int, lpcaldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setLocaleInfoA(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setLocaleInfoW(locale: Int, lctype: Int, lplcdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setProcessPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setThreadLocale(locale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setThreadPreferredUILanguages(dwflags: Int, pwszlanguagesbuffer: Long, pulnumlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setThreadPreferredUILanguages2(flags: Int, languages: Long, numlanguagesset: Long, snapshot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setThreadUILanguage(langid: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setUserGeoID(geoid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_setUserGeoName(geoname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_translateCharsetInfo(lpsrc: Long, lpcs: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUCallbackEscape(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUCallbackSkip(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUCallbackStop(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUCallbackSubstitute(context: Long, fromuargs: Long, codeunits: Long, length: Int, codepoint: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUCallbackEscape(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUCallbackSkip(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUCallbackStop(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUCallbackSubstitute(context: Long, touargs: Long, codeunits: Long, length: Int, reason: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_updateCalendarDayOfWeek(lpcaldatetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_verifyScripts(dwflags: Int, lplocalescripts: Long, cchlocalescripts: Int, lptestscripts: Long, cchtestscripts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_wideCharToMultiByte(codepage: Int, dwflags: Int, lpwidecharstr: Long, cchwidechar: Int, lpmultibytestr: Long, cbmultibyte: Int, lpdefaultchar: Long, lpuseddefaultchar: Long): Int

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
    external fun windowssys_windows_win32_globalization_uUcharsToChars(us: Long, cs: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uAustrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uAustrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCatclose(catd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCatgets(catd: Long, setNum: Int, msgNum: Int, s: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCatopen(name: Long, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharAge(c: Int, versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharDigitValue(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharDirection(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharFromName(namechoice: Int, name: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharMirror(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharName(code: Int, namechoice: Int, buffer: Long, bufferlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharType(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCharsToUchars(cs: Long, us: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uCountChar32(s: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uDigit(ch: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uEnumCharNames(start: Int, limit: Int, fn: Long, context: Long, namechoice: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uEnumCharTypes(enumrange: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uErrorName(code: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uFoldCase(c: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uForDigit(digit: Int, radix: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uFormatMessage(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uFormatMessageWithError(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetBidiPairedBracket(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetBinaryPropertySet(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetCombiningClass(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetDataVersion(dataversionfillin: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetFcNfkcClosure(c: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetIntPropertyMap(property: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetIntPropertyMaxValue(which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetIntPropertyMinValue(which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetIntPropertyValue(c: Int, which: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetNumericValue(c: Int): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetPropertyEnum(alias: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetPropertyName(property: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetPropertyValueEnum(property: Int, alias: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetPropertyValueName(property: Int, value: Int, namechoice: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetUnicodeVersion(versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uGetVersion(versionarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uHasBinaryProperty(c: Int, which: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uInit(status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsIdignorable(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsIdpart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsIdstart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsIsocontrol(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsJavaIdpart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsJavaIdstart(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsJavaSpaceChar(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsMirrored(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsUalphabetic(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsUlowercase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsUuppercase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsUwhiteSpace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsWhitespace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsalnum(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsalpha(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsbase(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsblank(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIscntrl(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsdefined(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsdigit(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsgraph(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIslower(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsprint(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIspunct(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsspace(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIstitle(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsupper(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uIsxdigit(c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemcasecmp(s1: Long, s2: Long, length: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemcmp(buf1: Long, buf2: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemcmpCodePointOrder(s1: Long, s2: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemcpy(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemmove(dest: Long, src: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemrchr(s: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemrchr32(s: Long, c: Int, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uMemset(dest: Long, c: Short, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uParseMessage(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uParseMessageWithError(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, parseerror: Long, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uSetMemoryFunctions(context: Long, a: Long, r: Long, f: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uShapeArabic(source: Long, sourcelength: Int, dest: Long, destsize: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrCaseCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrCompare(s1: Long, length1: Int, s2: Long, length2: Int, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrCompareIter(iter1: Long, iter2: Long, codepointorder: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFindFirst(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFindLast(s: Long, length: Int, substring: Long, sublength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFoldCase(dest: Long, destcapacity: Int, src: Long, srclength: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromJavaModifiedUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromUtf32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromUtf32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromUtf8Lenient(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrFromWcs(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrHasMoreChar32Than(s: Long, length: Int, number: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToJavaModifiedUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToLower(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToTitle(dest: Long, destcapacity: Int, src: Long, srclength: Int, titleiter: Long, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToUtf32(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToUtf32WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToUtf8(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToUtf8WithSub(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, subchar: Int, pnumsubstitutions: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToUpper(dest: Long, destcapacity: Int, src: Long, srclength: Int, locale: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrToWcs(dest: Long, destcapacity: Int, pdestlength: Long, src: Long, srclength: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcasecmp(s1: Long, s2: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcat(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcmpCodePointOrder(s1: Long, s2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrcspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrlen(s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrncasecmp(s1: Long, s2: Long, n: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrncat(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrncmp(ucs1: Long, ucs2: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrncmpCodePointOrder(s1: Long, s2: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrpbrk(string: Long, matchset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrrchr(s: Long, c: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrrchr32(s: Long, c: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrrstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrspn(string: Long, matchset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrstr(s: Long, substring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uStrtokR(src: Long, delim: Long, savestate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uTolower(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uTotitle(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uToupper(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uUastrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uUastrncpy(dst: Long, src: Long, n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uUnescape(src: Long, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uUnescapeAt(charat: Long, offset: Long, length: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVersionFromString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVersionFromUstring(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVersionToString(versionarray: Long, versionstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVformatMessage(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVformatMessageWithError(locale: Long, pattern: Long, patternlength: Int, result: Long, resultlength: Int, parseerror: Long, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVparseMessage(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uVparseMessageWithError(locale: Long, pattern: Long, patternlength: Int, source: Long, sourcelength: Int, ap: Long, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiClose(pbidi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiCountParagraphs(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiCountRuns(pbidi: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetBaseDirection(text: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetClassCallback(pbidi: Long, fn: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetCustomizedClass(pbidi: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetDirection(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLevelAt(pbidi: Long, charindex: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLevels(pbidi: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLogicalIndex(pbidi: Long, visualindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLogicalMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetLogicalRun(pbidi: Long, logicalposition: Int, plogicallimit: Long, plevel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetParaLevel(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetParagraph(pbidi: Long, charindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetParagraphByIndex(pbidi: Long, paraindex: Int, pparastart: Long, pparalimit: Long, pparalevel: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetProcessedLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetReorderingMode(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetReorderingOptions(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetResultLength(pbidi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetText(pbidi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetVisualIndex(pbidi: Long, logicalindex: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetVisualMap(pbidi: Long, indexmap: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiGetVisualRun(pbidi: Long, runindex: Int, plogicalstart: Long, plength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiInvertMap(srcmap: Long, destmap: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiIsInverse(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiIsOrderParagraphsLtr(pbidi: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiOpen(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiOrderParagraphsLtr(pbidi: Long, orderparagraphsltr: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiReorderLogical(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiReorderVisual(levels: Long, length: Int, indexmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetClassCallback(pbidi: Long, newfn: Long, newcontext: Long, oldfn: Long, oldcontext: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetContext(pbidi: Long, prologue: Long, prolength: Int, epilogue: Long, epilength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetInverse(pbidi: Long, isinverse: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetLine(pparabidi: Long, start: Int, limit: Int, plinebidi: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetPara(pbidi: Long, text: Long, length: Int, paralevel: Byte, embeddinglevels: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetReorderingMode(pbidi: Long, reorderingmode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiSetReorderingOptions(pbidi: Long, reorderingoptions: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiWriteReordered(pbidi: Long, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubidiWriteReverse(src: Long, srclength: Int, dest: Long, destsize: Int, options: Short, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransformClose(pbiditransform: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransformOpen(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubiditransformTransform(pbiditransform: Long, src: Long, srclength: Int, dest: Long, destsize: Int, inparalevel: Byte, inorder: Int, outparalevel: Byte, outorder: Int, domirroring: Int, shapingoptions: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ublockGetCode(c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkClose(bi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkCurrent(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkFirst(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkFollowing(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkGetAvailable(index: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkGetBinaryRules(bi: Long, binaryrules: Long, rulescapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkGetLocaleByType(bi: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkGetRuleStatus(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkGetRuleStatusVec(bi: Long, fillinvec: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkIsBoundary(bi: Long, offset: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkLast(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkNext(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkOpen(type: Int, locale: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkOpenBinaryRules(binaryrules: Long, ruleslength: Int, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkOpenRules(rules: Long, ruleslength: Int, text: Long, textlength: Int, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkPreceding(bi: Long, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkPrevious(bi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkRefreshUtext(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkSafeClone(bi: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkSetText(bi: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ubrkSetUtext(bi: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalAdd(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalClear(calendar: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalClearField(cal: Long, field: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalClone(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalClose(cal: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalEquivalentTo(cal1: Long, cal2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGet(cal: Long, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetAttribute(cal: Long, attr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetCanonicalTimeZoneId(id: Long, len: Int, result: Long, resultcapacity: Int, issystemid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetDstsavings(zoneid: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetDayOfWeekType(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetDefaultTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetFieldDifference(cal: Long, target: Double, field: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetGregorianChange(cal: Long, perrorcode: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetHostTimeZone(result: Long, resultcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetLimit(cal: Long, field: Int, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetLocaleByType(cal: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetMillis(cal: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetNow(): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetTzdataVersion(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetTimeZoneDisplayName(cal: Long, type: Int, locale: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetTimeZoneId(cal: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetTimeZoneIdforWindowsId(winid: Long, len: Int, region: Long, id: Long, idcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetTimeZoneTransitionDate(cal: Long, type: Int, transition: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetType(cal: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetWeekendTransition(cal: Long, dayofweek: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalGetWindowsTimeZoneId(id: Long, len: Int, winid: Long, winidcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalInDaylightTime(cal: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalIsSet(cal: Long, field: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalIsWeekend(cal: Long, date: Double, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalOpen(zoneid: Long, len: Int, locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalOpenCountryTimeZones(country: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalOpenTimeZoneIdenumeration(zonetype: Int, region: Long, rawoffset: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalOpenTimeZones(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalRoll(cal: Long, field: Int, amount: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSet(cal: Long, field: Int, value: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetAttribute(cal: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetDate(cal: Long, year: Int, month: Int, date: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetDateTime(cal: Long, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetDefaultTimeZone(zoneid: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetGregorianChange(cal: Long, date: Double, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetMillis(cal: Long, datetime: Double, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucalSetTimeZone(cal: Long, zoneid: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapClose(csm: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapGetBreakIterator(csm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapGetLocale(csm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapGetOptions(csm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapOpen(locale: Long, options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapSetBreakIterator(csm: Long, itertoadopt: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapSetLocale(csm: Long, locale: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapSetOptions(csm: Long, options: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapToTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapUtf8FoldCase(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapUtf8ToLower(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapUtf8ToTitle(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucasemapUtf8ToUpper(csm: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposClose(ucfpos: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposConstrainCategory(ucfpos: Long, category: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposConstrainField(ucfpos: Long, category: Int, field: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposGetCategory(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposGetField(ucfpos: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposGetIndexes(ucfpos: Long, pstart: Long, plimit: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposGetInt64IterationContext(ucfpos: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposMatchesField(ucfpos: Long, category: Int, field: Int, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposOpen(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposReset(ucfpos: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposSetInt64IterationContext(ucfpos: Long, context: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucfposSetState(ucfpos: Long, category: Int, field: Int, start: Int, limit: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCbFromUwriteBytes(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCbFromUwriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCbFromUwriteUchars(args: Long, source: Long, sourcelimit: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCbToUwriteSub(args: Long, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCbToUwriteUchars(args: Long, source: Long, length: Int, offsetindex: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvClose(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCompareNames(name1: Long, name2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvConvert(toconvertername: Long, fromconvertername: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvConvertEx(targetcnv: Long, sourcecnv: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, pivotstart: Long, pivotsource: Long, pivottarget: Long, pivotlimit: Long, reset: Byte, flush: Byte, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCountAliases(alias: Long, perrorcode: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvCountStandards(): Short

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvDetectUnicodeSignature(source: Long, sourcelength: Int, signaturelength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFixFileSeparator(cnv: Long, source: Long, sourcelen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFlushCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromAlgorithmic(cnv: Long, algorithmictype: Int, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUchars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUcountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvFromUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetAlias(alias: Long, n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetAliases(alias: Long, aliases: Long, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetAvailableName(n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetCcsid(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetCanonicalName(alias: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetDefaultName(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetDisplayName(converter: Long, displaylocale: Long, displayname: Long, displaynamecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetFromUcallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetInvalidChars(converter: Long, errbytes: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetInvalidUchars(converter: Long, erruchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetMaxCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetMinCharSize(converter: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetName(converter: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetNextUchar(converter: Long, source: Long, sourcelimit: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetPlatform(converter: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetStandard(n: Short, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetStandardName(name: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetStarters(converter: Long, starters: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetSubstChars(converter: Long, subchars: Long, len: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetToUcallBack(converter: Long, action: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetType(converter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvGetUnicodeSet(cnv: Long, setfillin: Long, whichset: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvIsAmbiguous(cnv: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvIsFixedWidth(cnv: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpen(convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpenAllNames(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpenCcsid(codepage: Int, platform: Int, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpenPackage(packagename: Long, convertername: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpenStandardNames(convname: Long, standard: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvOpenU(name: Long, err: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvReset(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvResetFromUnicode(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvResetToUnicode(converter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSafeClone(cnv: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetDefaultName(name: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetFallback(cnv: Long, usesfallback: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetFromUcallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetSubstChars(converter: Long, subchars: Long, len: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetSubstString(cnv: Long, s: Long, length: Int, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvSetToUcallBack(converter: Long, newaction: Long, newcontext: Long, oldaction: Long, oldcontext: Long, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToAlgorithmic(algorithmictype: Int, cnv: Long, target: Long, targetcapacity: Int, source: Long, sourcelength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUchars(cnv: Long, dest: Long, destcapacity: Int, src: Long, srclength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUcountPending(cnv: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvToUnicode(converter: Long, target: Long, targetlimit: Long, source: Long, sourcelimit: Long, offsets: Long, flush: Byte, err: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvUsesFallback(cnv: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselClose(sel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselOpen(converterlist: Long, converterlistsize: Int, excludedcodepoints: Long, whichset: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselOpenFromSerialized(buffer: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselSelectForString(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselSelectForUtf8(sel: Long, s: Long, length: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucnvselSerialize(sel: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolCloneBinary(coll: Long, buffer: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolClose(coll: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolCloseElements(elems: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetAttribute(coll: Long, attr: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetBound(source: Long, sourcelength: Int, boundtype: Int, nooflevels: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetContractionsAndExpansions(coll: Long, contractions: Long, expansions: Long, addprefixes: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetDisplayName(objloc: Long, disploc: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetEquivalentReorderCodes(reordercode: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetFunctionalEquivalent(result: Long, resultcapacity: Int, keyword: Long, locale: Long, isavailable: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetKeywordValues(keyword: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetKeywords(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetLocaleByType(coll: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetMaxExpansion(elems: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetMaxVariable(coll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetOffset(elems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetReorderCodes(coll: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetRules(coll: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetRulesEx(coll: Long, delta: Int, buffer: Long, bufferlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetSortKey(coll: Long, source: Long, sourcelength: Int, result: Long, resultlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetStrength(coll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetTailoredSet(coll: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetUcaversion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetVariableTop(coll: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGetVersion(coll: Long, info: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGreater(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolGreaterOrEqual(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolKeyHashCode(key: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolMergeSortkeys(src1: Long, src1length: Int, src2: Long, src2length: Int, dest: Long, destcapacity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolNext(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolNextSortKeyPart(coll: Long, iter: Long, state: Long, dest: Long, count: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolOpen(loc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolOpenAvailableLocales(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolOpenBinary(bin: Long, length: Int, base: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolOpenElements(coll: Long, text: Long, textlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolOpenRules(rules: Long, ruleslength: Int, normalizationmode: Int, strength: Int, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolPrevious(elems: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolPrimaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolReset(elems: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSafeClone(coll: Long, stackbuffer: Long, pbuffersize: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSecondaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetAttribute(coll: Long, attr: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetMaxVariable(coll: Long, group: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetOffset(elems: Long, offset: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetReorderCodes(coll: Long, reordercodes: Long, reordercodeslength: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetStrength(coll: Long, strength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolSetText(elems: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolStrcoll(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolStrcollIter(coll: Long, siter: Long, titer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolStrcollUtf8(coll: Long, source: Long, sourcelength: Int, target: Long, targetlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucolTertiaryOrder(order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucpmapGet(map: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucpmapGetRange(map: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieClose(trie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieGet(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieGetRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieGetType(trie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieGetValueWidth(trie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieInternalSmallIndex(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieInternalSmallU8Index(trie: Long, lt1: Int, t2: Byte, t3: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieInternalU8PrevIndex(trie: Long, c: Int, start: Long, src: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieOpenFromBinary(type: Int, valuewidth: Int, data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucptrieToBinary(trie: Long, data: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetClose(ucsd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetDetect(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetDetectAll(ucsd: Long, matchesfound: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetEnableInputFilter(ucsd: Long, filter: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetGetAllDetectableCharsets(ucsd: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetGetConfidence(ucsm: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetGetLanguage(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetGetName(ucsm: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetGetUchars(ucsm: Long, buf: Long, cap: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetIsInputFilterEnabled(ucsd: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetOpen(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetSetDeclaredEncoding(ucsd: Long, encoding: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucsdetSetText(ucsd: Long, textin: Long, len: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrCountCurrencies(locale: Long, date: Double, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrForLocale(locale: Long, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrForLocaleAndDate(locale: Long, date: Double, index: Int, buff: Long, buffcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigits(currency: Long, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigitsForUsage(currency: Long, usage: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetKeywordValuesForLocale(key: Long, locale: Long, commonlyused: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetName(currency: Long, locale: Long, namestyle: Int, ischoiceformat: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetNumericCode(currency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetPluralName(currency: Long, locale: Long, ischoiceformat: Long, pluralcount: Long, len: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetRoundingIncrement(currency: Long, ec: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrGetRoundingIncrementForUsage(currency: Long, usage: Int, ec: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrIsAvailable(isocode: Long, from: Double, to: Double, errorcode: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrOpenIsocurrencies(currtype: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrRegister(isocode: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ucurrUnregister(key: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatAdoptNumberFormat(fmt: Long, numberformattoadopt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatAdoptNumberFormatForFields(fmt: Long, fields: Long, numberformattoset: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatApplyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatClose(format: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatCountSymbols(fmt: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatFormat(format: Long, datetoformat: Double, result: Long, resultlength: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatFormatCalendar(format: Long, calendar: Long, result: Long, capacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatFormatCalendarForFields(format: Long, calendar: Long, result: Long, capacity: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatFormatForFields(format: Long, datetoformat: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGet2DigitYearStart(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetBooleanAttribute(fmt: Long, attr: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetCalendar(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetNumberFormat(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetNumberFormatForField(fmt: Long, field: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatGetSymbols(fmt: Long, type: Int, symbolindex: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatIsLenient(fmt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatOpen(timestyle: Int, datestyle: Int, locale: Long, tzid: Long, tzidlength: Int, pattern: Long, patternlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatParse(format: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatParseCalendar(format: Long, calendar: Long, text: Long, textlength: Int, parsepos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSet2DigitYearStart(fmt: Long, d: Double, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetBooleanAttribute(fmt: Long, attr: Int, newvalue: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetCalendar(fmt: Long, calendartoset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetLenient(fmt: Long, islenient: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetNumberFormat(fmt: Long, numberformattoset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatSetSymbols(format: Long, type: Int, symbolindex: Int, value: Long, valuelength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatToCalendarDateField(field: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatToPattern(fmt: Long, localized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgAddPattern(dtpg: Long, pattern: Long, patternlength: Int, override: Byte, conflictingpattern: Long, capacity: Int, plength: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgClone(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgClose(dtpg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetAppendItemFormat(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetAppendItemName(dtpg: Long, field: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetBaseSkeleton(unuseddtpg: Long, pattern: Long, length: Int, baseskeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetBestPattern(dtpg: Long, skeleton: Long, length: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetBestPatternWithOptions(dtpg: Long, skeleton: Long, length: Int, options: Int, bestpattern: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetDateTimeFormat(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetDecimal(dtpg: Long, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetFieldDisplayName(dtpg: Long, field: Int, width: Int, fieldname: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetPatternForSkeleton(dtpg: Long, skeleton: Long, skeletonlength: Int, plength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgGetSkeleton(unuseddtpg: Long, pattern: Long, length: Int, skeleton: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgOpen(locale: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgOpenBaseSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgOpenEmpty(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgOpenSkeletons(dtpg: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgReplaceFieldTypes(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgReplaceFieldTypesWithOptions(dtpg: Long, pattern: Long, patternlength: Int, skeleton: Long, skeletonlength: Int, options: Int, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgSetAppendItemFormat(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgSetAppendItemName(dtpg: Long, field: Int, value: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgSetDateTimeFormat(dtpg: Long, dtformat: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udatpgSetDecimal(dtpg: Long, decimal: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtClose(formatter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtFormat(formatter: Long, fromdate: Double, todate: Double, result: Long, resultcapacity: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtOpen(locale: Long, skeleton: Long, skeletonlength: Int, tzid: Long, tzidlength: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_udtitvfmtResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumClose(en: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumCount(en: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumNext(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumOpenCharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumOpenUcharStringsEnumeration(strings: Long, count: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumReset(en: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uenumUnext(en: Long, resultlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositerClose(fpositer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositerNext(fpositer: Long, beginindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufieldpositerOpen(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtClose(fmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetArrayItemByIndex(fmt: Long, n: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetArrayLength(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetDate(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetDecNumChars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetDouble(fmt: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetInt64(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetLong(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetObject(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetType(fmt: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtGetUchars(fmt: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtIsNumeric(fmt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtOpen(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtvalGetString(ufmtval: Long, plength: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ufmtvalNextPosition(ufmtval: Long, ucfpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ugenderGetInstance(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ugenderGetListGender(genderinfo: Long, genders: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaClose(idna: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaLabelToAscii(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaLabelToAsciiUtf8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaLabelToUnicode(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaLabelToUnicodeUtf8(idna: Long, label: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaNameToAscii(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaNameToAsciiUtf8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaNameToUnicode(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaNameToUnicodeUtf8(idna: Long, name: Long, length: Int, dest: Long, capacity: Int, pinfo: Long, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uidnaOpenUts46(options: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterCurrent32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterGetState(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterNext32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterPrevious32(iter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterSetState(iter: Long, state: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterSetString(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterSetUtf16Be(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uiterSetUtf8(iter: Long, s: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnClose(ldn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnGetContext(ldn: Long, type: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnGetDialectHandling(ldn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnGetLocale(ldn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnKeyDisplayName(ldn: Long, key: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnKeyValueDisplayName(ldn: Long, key: Long, value: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnLanguageDisplayName(ldn: Long, lang: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnLocaleDisplayName(ldn: Long, locale: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnOpen(locale: Long, dialecthandling: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnOpenForContext(locale: Long, contexts: Long, length: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnRegionDisplayName(ldn: Long, region: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnScriptCodeDisplayName(ldn: Long, scriptcode: Int, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnScriptDisplayName(ldn: Long, script: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uldnVariantDisplayName(ldn: Long, variant: Long, result: Long, maxresultsize: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtClose(listfmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtFormat(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtFormatStringsToResult(listfmt: Long, strings: Long, stringlengths: Long, stringcount: Int, uresult: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtOpenForType(locale: Long, type: Int, width: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulistfmtResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocAcceptLanguage(result: Long, resultavailable: Int, outresult: Long, acceptlist: Long, acceptlistcount: Int, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocAcceptLanguageFromHttp(result: Long, resultavailable: Int, outresult: Long, httpacceptlanguage: Long, availablelocales: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocAddLikelySubtags(localeid: Long, maximizedlocaleid: Long, maximizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocCanonicalize(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocForLanguageTag(langtag: Long, localeid: Long, localeidcapacity: Int, parsedlength: Long, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetAvailable(n: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetBaseName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetCharacterOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetCountry(localeid: Long, country: Long, countrycapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDefault(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayCountry(locale: Long, displaylocale: Long, country: Long, countrycapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayKeyword(keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayKeywordValue(locale: Long, keyword: Long, displaylocale: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayLanguage(locale: Long, displaylocale: Long, language: Long, languagecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayName(localeid: Long, inlocaleid: Long, result: Long, maxresultsize: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayScript(locale: Long, displaylocale: Long, script: Long, scriptcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetDisplayVariant(locale: Long, displaylocale: Long, variant: Long, variantcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetIso3Country(localeid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetIso3Language(localeid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetIsocountries(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetIsolanguages(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetKeywordValue(localeid: Long, keywordname: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetLcid(localeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetLanguage(localeid: Long, language: Long, languagecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetLineOrientation(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetLocaleForLcid(hostid: Int, locale: Long, localecapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetName(localeid: Long, name: Long, namecapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetParent(localeid: Long, parent: Long, parentcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetScript(localeid: Long, script: Long, scriptcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocGetVariant(localeid: Long, variant: Long, variantcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocIsRightToLeft(locale: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocMinimizeSubtags(localeid: Long, minimizedlocaleid: Long, minimizedlocaleidcapacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocOpenAvailableByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocOpenKeywords(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocSetDefault(localeid: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocSetKeywordValue(keywordname: Long, keywordvalue: Long, buffer: Long, buffercapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocToLanguageTag(localeid: Long, langtag: Long, langtagcapacity: Int, strict: Byte, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocToLegacyKey(keyword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocToLegacyType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocToUnicodeLocaleKey(keyword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocToUnicodeLocaleType(keyword: Long, value: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataClose(uld: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetCldrversion(versionarray: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetDelimiter(uld: Long, type: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetExemplarSet(uld: Long, fillin: Long, options: Int, extype: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetLocaleDisplayPattern(uld: Long, pattern: Long, patterncapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetLocaleSeparator(uld: Long, separator: Long, separatorcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetMeasurementSystem(localeid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetNoSubstitute(uld: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataGetPaperSize(localeid: Long, height: Long, width: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataOpen(localeid: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ulocdataSetNoSubstitute(uld: Long, setting: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgApplyPattern(fmt: Long, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgAutoQuoteApostrophe(pattern: Long, patternlength: Int, dest: Long, destcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgClose(format: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgFormat(fmt: Long, result: Long, resultlength: Int, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgGetLocale(fmt: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgOpen(pattern: Long, patternlength: Int, locale: Long, parseerror: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgParse(fmt: Long, source: Long, sourcelength: Int, count: Long, status: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgSetLocale(fmt: Long, locale: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgToPattern(fmt: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgVformat(fmt: Long, result: Long, resultlength: Int, ap: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umsgVparse(fmt: Long, source: Long, sourcelength: Int, count: Long, ap: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieBuildImmutable(trie: Long, type: Int, valuewidth: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieClone(other: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieClose(trie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieFromUcpmap(map: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieFromUcptrie(trie: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieGet(trie: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieGetRange(trie: Long, start: Int, option: Int, surrogatevalue: Int, filter: Long, context: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieOpen(initialvalue: Int, errorvalue: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieSet(trie: Long, c: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_umutablecptrieSetRange(trie: Long, start: Int, end: Int, value: Int, perrorcode: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2Append(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2Close(norm2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2ComposePair(norm2: Long, a: Int, b: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetCombiningClass(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetInstance(packagename: Long, name: Long, mode: Int, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetNfcinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetNfdinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetNfkccasefoldInstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetNfkcinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetNfkdinstance(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2GetRawDecomposition(norm2: Long, c: Int, decomposition: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2HasBoundaryAfter(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2HasBoundaryBefore(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2IsInert(norm2: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2IsNormalized(norm2: Long, s: Long, length: Int, perrorcode: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2Normalize(norm2: Long, src: Long, length: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2NormalizeSecondAndAppend(norm2: Long, first: Long, firstlength: Int, firstcapacity: Int, second: Long, secondlength: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2OpenFiltered(norm2: Long, filterset: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2QuickCheck(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unorm2SpanQuickCheckYes(norm2: Long, s: Long, length: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unormCompare(s1: Long, length1: Int, s2: Long, length2: Int, options: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumApplyPattern(format: Long, localized: Byte, pattern: Long, patternlength: Int, parseerror: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumClone(fmt: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumClose(fmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumCountAvailable(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormat(fmt: Long, number: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatDecimal(fmt: Long, number: Long, length: Int, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatDouble(fmt: Long, number: Double, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatDoubleCurrency(fmt: Long, number: Double, currency: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatDoubleForFields(format: Long, number: Double, result: Long, resultlength: Int, fpositer: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatInt64(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumFormatUformattable(fmt: Long, number: Long, result: Long, resultlength: Int, pos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetAttribute(fmt: Long, attr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetAvailable(localeindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetContext(fmt: Long, type: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetDoubleAttribute(fmt: Long, attr: Int): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetLocaleByType(fmt: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetSymbol(fmt: Long, symbol: Int, buffer: Long, size: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumGetTextAttribute(fmt: Long, tag: Int, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumOpen(style: Int, pattern: Long, patternlength: Int, locale: Long, parseerr: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParse(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParseDecimal(fmt: Long, text: Long, textlength: Int, parsepos: Long, outbuf: Long, outbuflength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParseDouble(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParseDoubleCurrency(fmt: Long, text: Long, textlength: Int, parsepos: Long, currency: Long, status: Long): Double

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParseInt64(fmt: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumParseToUformattable(fmt: Long, result: Long, text: Long, textlength: Int, parsepos: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumSetAttribute(fmt: Long, attr: Int, newvalue: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumSetContext(fmt: Long, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumSetDoubleAttribute(fmt: Long, attr: Int, newvalue: Double)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumSetSymbol(fmt: Long, symbol: Int, value: Long, length: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumSetTextAttribute(fmt: Long, tag: Int, newvalue: Long, newvaluelength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumToPattern(fmt: Long, ispatternlocalized: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfClose(uformatter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfCloseResult(uresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfFormatDecimal(uformatter: Long, value: Long, valuelen: Int, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfFormatDouble(uformatter: Long, value: Double, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfFormatInt(uformatter: Long, value: Long, uresult: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocale(skeleton: Long, skeletonlen: Int, locale: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocaleWithError(skeleton: Long, skeletonlen: Int, locale: Long, perror: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfResultAsValue(uresult: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfResultGetAllFieldPositions(uresult: Long, ufpositer: Long, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfResultNextFieldPosition(uresult: Long, ufpos: Long, ec: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumfResultToString(uresult: Long, buffer: Long, buffercapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysClose(unumsys: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysGetDescription(unumsys: Long, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysGetName(unumsys: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysGetRadix(unumsys: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysIsAlgorithmic(unumsys: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysOpenAvailableNames(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_unumsysOpenByName(name: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesClose(uplrules: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesGetKeywords(uplrules: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesOpen(locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesOpenForType(locale: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesSelect(uplrules: Long, number: Double, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uplrulesSelectFormatted(uplrules: Long, number: Long, keyword: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexAppendReplacement(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexAppendReplacementUtext(regexp: Long, replacementtext: Long, dest: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexAppendTail(regexp: Long, destbuf: Long, destcapacity: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexAppendTailUtext(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexClone(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexClose(regexp: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexEnd(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexEnd64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexFind(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexFind64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexFindNext(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexFlags(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetStackLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetText(regexp: Long, textlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetTimeLimit(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGetUtext(regexp: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGroup(regexp: Long, groupnum: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGroupCount(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGroupNumberFromCname(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGroupNumberFromName(regexp: Long, groupname: Long, namelength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexGroupUtext(regexp: Long, groupnum: Int, dest: Long, grouplength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexHasAnchoringBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexHasTransparentBounds(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexHitEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexLookingAt(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexLookingAt64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexMatches(regexp: Long, startindex: Int, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexMatches64(regexp: Long, startindex: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexOpen(pattern: Long, patternlength: Int, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexOpenC(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexOpenUtext(pattern: Long, flags: Int, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexPattern(regexp: Long, patlength: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexPatternUtext(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRefreshUtext(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRegionEnd(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRegionEnd64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRegionStart(regexp: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRegionStart64(regexp: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReplaceAll(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReplaceAllUtext(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReplaceFirst(regexp: Long, replacementtext: Long, replacementlength: Int, destbuf: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReplaceFirstUtext(regexp: Long, replacement: Long, dest: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexRequireEnd(regexp: Long, status: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReset(regexp: Long, index: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexReset64(regexp: Long, index: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetFindProgressCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetMatchCallback(regexp: Long, callback: Long, context: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetRegion(regexp: Long, regionstart: Int, regionlimit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetRegion64(regexp: Long, regionstart: Long, regionlimit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetRegionAndStart(regexp: Long, regionstart: Long, regionlimit: Long, startindex: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetStackLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetText(regexp: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetTimeLimit(regexp: Long, limit: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSetUtext(regexp: Long, text: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSplit(regexp: Long, destbuf: Long, destcapacity: Int, requiredcapacity: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexSplitUtext(regexp: Long, destfields: Long, destfieldscapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexStart(regexp: Long, groupnum: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexStart64(regexp: Long, groupnum: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexUseAnchoringBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregexUseTransparentBounds(regexp: Long, b: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionAreEqual(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionContains(uregion: Long, otherregion: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetAvailable(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetContainedRegions(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetContainedRegionsOfType(uregion: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetContainingRegion(uregion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetContainingRegionOfType(uregion: Long, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetNumericCode(uregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetPreferredValues(uregion: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetRegionCode(uregion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetRegionFromCode(regioncode: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetRegionFromNumericCode(code: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uregionGetType(uregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtClose(reldatefmt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtCloseResult(ufrdt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtCombineDateAndTime(reldatefmt: Long, relativedatestring: Long, relativedatestringlen: Int, timestring: Long, timestringlen: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtFormat(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtFormatNumeric(reldatefmt: Long, offset: Double, unit: Int, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtFormatNumericToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtFormatToResult(reldatefmt: Long, offset: Double, unit: Int, result: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtOpen(locale: Long, nftoadopt: Long, width: Int, capitalizationcontext: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtOpenResult(ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_ureldatefmtResultAsValue(ufrdt: Long, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresClose(resourcebundle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetBinary(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetByIndex(resourcebundle: Long, indexr: Int, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetByKey(resourcebundle: Long, key: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetInt(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetIntVector(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetKey(resourcebundle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetLocaleByType(resourcebundle: Long, type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetNextResource(resourcebundle: Long, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetNextString(resourcebundle: Long, len: Long, key: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetSize(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetString(resourcebundle: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetStringByIndex(resourcebundle: Long, indexs: Int, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetStringByKey(resb: Long, key: Long, len: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetType(resourcebundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetUint(resourcebundle: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetUtf8String(resb: Long, dest: Long, length: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetUtf8StringByIndex(resb: Long, stringindex: Int, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetUtf8StringByKey(resb: Long, key: Long, dest: Long, plength: Long, forcecopy: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresGetVersion(resb: Long, versioninfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresHasNext(resourcebundle: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresOpen(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresOpenAvailableLocales(packagename: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresOpenDirect(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresOpenU(packagename: Long, locale: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uresResetIterator(resourcebundle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptBreaksBetweenLetters(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetCode(nameorabbrorlocale: Long, fillin: Long, capacity: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetSampleString(script: Int, dest: Long, capacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetScript(codepoint: Int, err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetScriptExtensions(c: Int, scripts: Long, capacity: Int, errorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetShortName(scriptcode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptGetUsage(script: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptHasScript(c: Int, sc: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptIsCased(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uscriptIsRightToLeft(script: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchClose(searchiter: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchFirst(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchFollowing(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetAttribute(strsrch: Long, attribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetBreakIterator(strsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetCollator(strsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetMatchedLength(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetMatchedStart(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetMatchedText(strsrch: Long, result: Long, resultcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetOffset(strsrch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetPattern(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchGetText(strsrch: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchLast(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchNext(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchOpen(pattern: Long, patternlength: Int, text: Long, textlength: Int, locale: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchOpenFromCollator(pattern: Long, patternlength: Int, text: Long, textlength: Int, collator: Long, breakiter: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchPreceding(strsrch: Long, position: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchPrevious(strsrch: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchReset(strsrch: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetAttribute(strsrch: Long, attribute: Int, value: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetBreakIterator(strsrch: Long, breakiter: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetCollator(strsrch: Long, collator: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetOffset(strsrch: Long, position: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetPattern(strsrch: Long, pattern: Long, patternlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usearchSetText(strsrch: Long, text: Long, textlength: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetAdd(set: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetAddAll(set: Long, additionalset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetAddAllCodePoints(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetAddRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetAddString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetApplyIntPropertyValue(set: Long, prop: Int, value: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetApplyPattern(set: Long, pattern: Long, patternlength: Int, options: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetApplyPropertyAlias(set: Long, prop: Long, proplength: Int, value: Long, valuelength: Int, ec: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetCharAt(set: Long, charindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetClear(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetClone(set: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetCloneAsThawed(set: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetClose(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetCloseOver(set: Long, attributes: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetCompact(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetComplement(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetComplementAll(set: Long, complement: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsAll(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsAllCodePoints(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsNone(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsRange(set: Long, start: Int, end: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsSome(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetContainsString(set: Long, str: Long, strlen: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetEquals(set1: Long, set2: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetFreeze(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetGetItem(set: Long, itemindex: Int, start: Long, end: Long, str: Long, strcapacity: Int, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetGetItemCount(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetGetSerializedRange(set: Long, rangeindex: Int, pstart: Long, pend: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetGetSerializedRangeCount(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetGetSerializedSet(fillset: Long, src: Long, srclength: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetIndexOf(set: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetIsEmpty(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetIsFrozen(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetOpen(start: Int, end: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetOpenEmpty(): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetOpenPattern(pattern: Long, patternlength: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetOpenPatternOptions(pattern: Long, patternlength: Int, options: Int, ec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRemove(set: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRemoveAll(set: Long, removeset: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRemoveAllStrings(set: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRemoveRange(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRemoveString(set: Long, str: Long, strlen: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetResemblesPattern(pattern: Long, patternlength: Int, pos: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRetain(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetRetainAll(set: Long, retain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSerialize(set: Long, dest: Long, destcapacity: Int, perrorcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSerializedContains(set: Long, c: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSet(set: Long, start: Int, end: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSetSerializedToOne(fillset: Long, c: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSize(set: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSpan(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSpanBack(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSpanBackUtf8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetSpanUtf8(set: Long, s: Long, length: Int, spancondition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usetToPattern(set: Long, result: Long, resultcapacity: Int, escapeunprintable: Byte, ec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofAreConfusable(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofAreConfusableUtf8(sc: Long, id1: Long, length1: Int, id2: Long, length2: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofCheck(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofCheck2(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofCheck2Utf8(sc: Long, id: Long, length: Int, checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofCheckUtf8(sc: Long, id: Long, length: Int, position: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofClone(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofClose(sc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofCloseCheckResult(checkresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetAllowedChars(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetAllowedLocales(sc: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetCheckResultChecks(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetCheckResultNumerics(checkresult: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetCheckResultRestrictionLevel(checkresult: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetChecks(sc: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetInclusionSet(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetRecommendedSet(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetRestrictionLevel(sc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetSkeleton(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofGetSkeletonUtf8(sc: Long, type: Int, id: Long, length: Int, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofOpen(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofOpenCheckResult(status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofOpenFromSerialized(data: Long, length: Int, pactuallength: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofOpenFromSource(confusables: Long, confusableslen: Int, confusableswholescript: Long, confusableswholescriptlen: Int, errtype: Long, pe: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofSerialize(sc: Long, data: Long, capacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofSetAllowedChars(sc: Long, chars: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofSetAllowedLocales(sc: Long, localeslist: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofSetChecks(sc: Long, checks: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_uspoofSetRestrictionLevel(sc: Long, restrictionlevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprepClose(profile: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprepOpen(path: Long, filename: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprepOpenByType(type: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_usprepPrepare(prep: Long, src: Long, srclength: Int, dest: Long, destcapacity: Int, options: Int, parseerror: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextChar32At(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextClone(dest: Long, src: Long, deep: Byte, readonly: Byte, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextClose(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextCopy(ut: Long, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextCurrent32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextEquals(a: Long, b: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextExtract(ut: Long, nativestart: Long, nativelimit: Long, dest: Long, destcapacity: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextFreeze(ut: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextGetNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextGetPreviousNativeIndex(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextHasMetaData(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextIsLengthExpensive(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextIsWritable(ut: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextMoveIndex32(ut: Long, delta: Int): Byte

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextNativeLength(ut: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextNext32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextNext32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextOpenUchars(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextOpenUtf8(ut: Long, s: Long, length: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextPrevious32(ut: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextPrevious32From(ut: Long, nativeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextReplace(ut: Long, nativestart: Long, nativelimit: Long, replacementtext: Long, replacementlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextSetNativeIndex(ut: Long, nativeindex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utextSetup(ut: Long, extraspace: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8AppendCharSafeBody(s: Long, i: Int, length: Int, c: Int, piserror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8Back1SafeBody(s: Long, start: Int, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8NextCharSafeBody(s: Long, pi: Long, length: Int, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utf8PrevCharSafeBody(s: Long, start: Int, pi: Long, c: Int, strict: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscaleFromInt64(othertime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscaleGetTimeScaleValue(timescale: Int, value: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utmscaleToInt64(universaltime: Long, timescale: Int, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceFormat(outbuf: Long, capacity: Int, indent: Int, fmt: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceFunctionName(fnnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceGetFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceGetLevel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceSetFunctions(context: Long, e: Long, x: Long, d: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceSetLevel(tracelevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utraceVformat(outbuf: Long, capacity: Int, indent: Int, fmt: Long, args: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransClone(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransClose(trans: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransCountAvailableIds(): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransGetSourceSet(trans: Long, ignorefilter: Byte, fillin: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransGetUnicodeId(trans: Long, resultlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransOpenIds(perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransOpenInverse(trans: Long, status: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransOpenU(id: Long, idlength: Int, dir: Int, rules: Long, ruleslength: Int, parseerror: Long, perrorcode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransRegister(adoptedtrans: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransSetFilter(trans: Long, filterpattern: Long, filterpatternlen: Int, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransToRules(trans: Long, escapeunprintable: Byte, result: Long, resultlength: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransTrans(trans: Long, rep: Long, repfunc: Long, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransTransIncremental(trans: Long, rep: Long, repfunc: Long, pos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransTransIncrementalUchars(trans: Long, text: Long, textlength: Long, textcapacity: Int, pos: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransTransUchars(trans: Long, text: Long, textlength: Long, textcapacity: Int, start: Int, limit: Long, status: Long)

    @JvmStatic
    external fun windowssys_windows_win32_globalization_utransUnregisterId(id: Long, idlength: Int)
}

public actual fun adjustCalendarDate(lpcaldatetime: COpaquePointer?, calunit: CaldatetimeDateunit, amount: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_adjustCalendarDate((lpcaldatetime?.value ?: 0L), calunit, amount)

public actual fun compareStringA(locale: UInt, dwcmpflags: UInt, lpstring1: COpaquePointer?, cchcount1: Int, lpstring2: COpaquePointer?, cchcount2: Int): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_compareStringA(locale.toInt(), dwcmpflags.toInt(), (lpstring1?.value ?: 0L), cchcount1, (lpstring2?.value ?: 0L), cchcount2)

public actual fun compareStringEx(lplocalename: Pcwstr, dwcmpflags: CompareStringFlags, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, lparam: Lparam): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_compareStringEx((lplocalename?.value ?: 0L), dwcmpflags.toInt(), (lpstring1?.value ?: 0L), cchcount1, (lpstring2?.value ?: 0L), cchcount2, (lpversioninformation?.value ?: 0L), (lpreserved?.value ?: 0L), lparam)

public actual fun compareStringOrdinal(lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int, bignorecase: Bool): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_compareStringOrdinal((lpstring1?.value ?: 0L), cchcount1, (lpstring2?.value ?: 0L), cchcount2, bignorecase)

public actual fun compareStringW(locale: UInt, dwcmpflags: UInt, lpstring1: Pcwstr, cchcount1: Int, lpstring2: Pcwstr, cchcount2: Int): ComparestringResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_compareStringW(locale.toInt(), dwcmpflags.toInt(), (lpstring1?.value ?: 0L), cchcount1, (lpstring2?.value ?: 0L), cchcount2)

public actual fun convertCalDateTimeToSystemTime(lpcaldatetime: COpaquePointer?, lpsystime: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_convertCalDateTimeToSystemTime((lpcaldatetime?.value ?: 0L), (lpsystime?.value ?: 0L))

public actual fun convertDefaultLocale(locale: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_convertDefaultLocale(locale.toInt()).toUInt()

public actual fun convertSystemTimeToCalDateTime(lpsystime: COpaquePointer?, calid: UInt, lpcaldatetime: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_convertSystemTimeToCalDateTime((lpsystime?.value ?: 0L), calid.toInt(), (lpcaldatetime?.value ?: 0L))

public actual fun enumCalendarInfoA(lpcalinfoenumproc: CalinfoEnumproca, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumCalendarInfoA(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoExA(lpcalinfoenumprocex: CalinfoEnumprocexa, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumCalendarInfoExA(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoExEx(pcalinfoenumprocexex: CalinfoEnumprocexex, lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumCalendarInfoExEx(0L, (lplocalename?.value ?: 0L), calendar.toInt(), (lpreserved?.value ?: 0L), caltype.toInt(), lparam)

public actual fun enumCalendarInfoExW(lpcalinfoenumprocex: CalinfoEnumprocexw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumCalendarInfoExW(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumCalendarInfoW(lpcalinfoenumproc: CalinfoEnumprocw, locale: UInt, calendar: UInt, caltype: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumCalendarInfoW(0L, locale.toInt(), calendar.toInt(), caltype.toInt())

public actual fun enumDateFormatsA(lpdatefmtenumproc: DatefmtEnumproca, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumDateFormatsA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsExA(lpdatefmtenumprocex: DatefmtEnumprocexa, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumDateFormatsExA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsExEx(lpdatefmtenumprocexex: DatefmtEnumprocexex, lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumDateFormatsExEx(0L, (lplocalename?.value ?: 0L), dwflags.toInt(), lparam)

public actual fun enumDateFormatsExW(lpdatefmtenumprocex: DatefmtEnumprocexw, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumDateFormatsExW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumDateFormatsW(lpdatefmtenumproc: DatefmtEnumprocw, locale: UInt, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumDateFormatsW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumLanguageGroupLocalesA(lplanggrouplocaleenumproc: LanggrouplocaleEnumproca, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumLanguageGroupLocalesA(0L, languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun enumLanguageGroupLocalesW(lplanggrouplocaleenumproc: LanggrouplocaleEnumprocw, languagegroup: UInt, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumLanguageGroupLocalesW(0L, languagegroup.toInt(), dwflags.toInt(), lparam)

public actual fun enumSystemCodePagesA(lpcodepageenumproc: CodepageEnumproca, dwflags: EnumSystemCodePagesFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemCodePagesA(0L, dwflags.toInt())

public actual fun enumSystemCodePagesW(lpcodepageenumproc: CodepageEnumprocw, dwflags: EnumSystemCodePagesFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemCodePagesW(0L, dwflags.toInt())

public actual fun enumSystemGeoID(geoclass: UInt, parentgeoid: Int, lpgeoenumproc: GeoEnumproc): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemGeoID(geoclass.toInt(), parentgeoid, 0L)

public actual fun enumSystemGeoNames(geoclass: UInt, geoenumproc: GeoEnumnameproc, data: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemGeoNames(geoclass.toInt(), 0L, data)

public actual fun enumSystemLanguageGroupsA(lplanguagegroupenumproc: LanguagegroupEnumproca, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemLanguageGroupsA(0L, dwflags.toInt(), lparam)

public actual fun enumSystemLanguageGroupsW(lplanguagegroupenumproc: LanguagegroupEnumprocw, dwflags: EnumSystemLanguageGroupsFlags, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemLanguageGroupsW(0L, dwflags.toInt(), lparam)

public actual fun enumSystemLocalesA(lplocaleenumproc: LocaleEnumproca, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemLocalesA(0L, dwflags.toInt())

public actual fun enumSystemLocalesEx(lplocaleenumprocex: LocaleEnumprocex, dwflags: UInt, lparam: Lparam, lpreserved: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemLocalesEx(0L, dwflags.toInt(), lparam, (lpreserved?.value ?: 0L))

public actual fun enumSystemLocalesW(lplocaleenumproc: LocaleEnumprocw, dwflags: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumSystemLocalesW(0L, dwflags.toInt())

public actual fun enumTimeFormatsA(lptimefmtenumproc: TimefmtEnumproca, locale: UInt, dwflags: TimeFormatFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumTimeFormatsA(0L, locale.toInt(), dwflags.toInt())

public actual fun enumTimeFormatsEx(lptimefmtenumprocex: TimefmtEnumprocex, lplocalename: Pcwstr, dwflags: UInt, lparam: Lparam): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumTimeFormatsEx(0L, (lplocalename?.value ?: 0L), dwflags.toInt(), lparam)

public actual fun enumTimeFormatsW(lptimefmtenumproc: TimefmtEnumprocw, locale: UInt, dwflags: TimeFormatFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumTimeFormatsW(0L, locale.toInt(), dwflags.toInt())

public actual fun enumUILanguagesA(lpuilanguageenumproc: UilanguageEnumproca, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumUILanguagesA(0L, dwflags.toInt(), lparam)

public actual fun enumUILanguagesW(lpuilanguageenumproc: UilanguageEnumprocw, dwflags: UInt, lparam: Long): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_enumUILanguagesW(0L, dwflags.toInt(), lparam)

public actual fun findNLSString(locale: UInt, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_findNLSString(locale.toInt(), dwfindnlsstringflags.toInt(), (lpstringsource?.value ?: 0L), cchsource, (lpstringvalue?.value ?: 0L), cchvalue, (pcchfound?.value ?: 0L))

public actual fun findNLSStringEx(lplocalename: Pcwstr, dwfindnlsstringflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, pcchfound: COpaquePointer?, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_findNLSStringEx((lplocalename?.value ?: 0L), dwfindnlsstringflags.toInt(), (lpstringsource?.value ?: 0L), cchsource, (lpstringvalue?.value ?: 0L), cchvalue, (pcchfound?.value ?: 0L), (lpversioninformation?.value ?: 0L), (lpreserved?.value ?: 0L), sorthandle)

public actual fun findStringOrdinal(dwfindstringordinalflags: UInt, lpstringsource: Pcwstr, cchsource: Int, lpstringvalue: Pcwstr, cchvalue: Int, bignorecase: Bool): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_findStringOrdinal(dwfindstringordinalflags.toInt(), (lpstringsource?.value ?: 0L), cchsource, (lpstringvalue?.value ?: 0L), cchvalue, bignorecase)

public actual fun foldStringA(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_foldStringA(dwmapflags.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun foldStringW(dwmapflags: FoldStringMapFlags, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_foldStringW(dwmapflags.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun getACP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getACP().toUInt()

public actual fun getCPInfo(codepage: UInt, lpcpinfo: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCPInfo(codepage.toInt(), (lpcpinfo?.value ?: 0L))

public actual fun getCPInfoExA(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCPInfoExA(codepage.toInt(), dwflags.toInt(), (lpcpinfoex?.value ?: 0L))

public actual fun getCPInfoExW(codepage: UInt, dwflags: UInt, lpcpinfoex: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCPInfoExW(codepage.toInt(), dwflags.toInt(), (lpcpinfoex?.value ?: 0L))

public actual fun getCalendarDateFormatEx(lpszlocale: Pcwstr, dwflags: UInt, lpcaldatetime: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCalendarDateFormatEx((lpszlocale?.value ?: 0L), dwflags.toInt(), (lpcaldatetime?.value ?: 0L), (lpformat?.value ?: 0L), (lpdatestr?.value ?: 0L), cchdate)

public actual fun getCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L), cchdata, (lpvalue?.value ?: 0L))

public actual fun getCalendarInfoEx(lplocalename: Pcwstr, calendar: UInt, lpreserved: Pcwstr, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCalendarInfoEx((lplocalename?.value ?: 0L), calendar.toInt(), (lpreserved?.value ?: 0L), caltype.toInt(), (lpcaldata?.value ?: 0L), cchdata, (lpvalue?.value ?: 0L))

public actual fun getCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pwstr, cchdata: Int, lpvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L), cchdata, (lpvalue?.value ?: 0L))

public actual fun getCalendarSupportedDateRange(calendar: UInt, lpcalmindatetime: COpaquePointer?, lpcalmaxdatetime: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCalendarSupportedDateRange(calendar.toInt(), (lpcalmindatetime?.value ?: 0L), (lpcalmaxdatetime?.value ?: 0L))

public actual fun getCurrencyFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpcurrencystr: Pstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCurrencyFormatA(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpcurrencystr?.value ?: 0L), cchcurrency)

public actual fun getCurrencyFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCurrencyFormatEx((lplocalename?.value ?: 0L), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpcurrencystr?.value ?: 0L), cchcurrency)

public actual fun getCurrencyFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpcurrencystr: Pwstr, cchcurrency: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getCurrencyFormatW(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpcurrencystr?.value ?: 0L), cchcurrency)

public actual fun getDateFormatA(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcstr, lpdatestr: Pstr, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDateFormatA(locale.toInt(), dwflags.toInt(), (lpdate?.value ?: 0L), (lpformat?.value ?: 0L), (lpdatestr?.value ?: 0L), cchdate)

public actual fun getDateFormatEx(lplocalename: Pcwstr, dwflags: EnumDateFormatsFlags, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int, lpcalendar: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDateFormatEx((lplocalename?.value ?: 0L), dwflags.toInt(), (lpdate?.value ?: 0L), (lpformat?.value ?: 0L), (lpdatestr?.value ?: 0L), cchdate, (lpcalendar?.value ?: 0L))

public actual fun getDateFormatW(locale: UInt, dwflags: UInt, lpdate: COpaquePointer?, lpformat: Pcwstr, lpdatestr: Pwstr, cchdate: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDateFormatW(locale.toInt(), dwflags.toInt(), (lpdate?.value ?: 0L), (lpformat?.value ?: 0L), (lpdatestr?.value ?: 0L), cchdate)

public actual fun getDistanceOfClosestLanguageInList(pszlanguage: Pcwstr, pszlanguageslist: Pcwstr, wchlistdelimiter: UShort, pclosestdistance: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDistanceOfClosestLanguageInList((pszlanguage?.value ?: 0L), (pszlanguageslist?.value ?: 0L), wchlistdelimiter.toShort(), (pclosestdistance?.value ?: 0L))

public actual fun getDurationFormat(locale: UInt, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDurationFormat(locale.toInt(), dwflags.toInt(), (lpduration?.value ?: 0L), ullduration.toLong(), (lpformat?.value ?: 0L), (lpdurationstr?.value ?: 0L), cchduration)

public actual fun getDurationFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpduration: COpaquePointer?, ullduration: ULong, lpformat: Pcwstr, lpdurationstr: Pwstr, cchduration: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getDurationFormatEx((lplocalename?.value ?: 0L), dwflags.toInt(), (lpduration?.value ?: 0L), ullduration.toLong(), (lpformat?.value ?: 0L), (lpdurationstr?.value ?: 0L), cchduration)

public actual fun getFileMUIInfo(dwflags: UInt, pcwszfilepath: Pcwstr, pfilemuiinfo: COpaquePointer?, pcbfilemuiinfo: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getFileMUIInfo(dwflags.toInt(), (pcwszfilepath?.value ?: 0L), (pfilemuiinfo?.value ?: 0L), (pcbfilemuiinfo?.value ?: 0L))

public actual fun getFileMUIPath(dwflags: UInt, pcwszfilepath: Pcwstr, pwszlanguage: Pwstr, pcchlanguage: COpaquePointer?, pwszfilemuipath: Pwstr, pcchfilemuipath: COpaquePointer?, pululenumerator: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getFileMUIPath(dwflags.toInt(), (pcwszfilepath?.value ?: 0L), (pwszlanguage?.value ?: 0L), (pcchlanguage?.value ?: 0L), (pwszfilemuipath?.value ?: 0L), (pcchfilemuipath?.value ?: 0L), (pululenumerator?.value ?: 0L))

public actual fun getGeoInfoA(location: Int, geotype: Sysgeotype, lpgeodata: Pstr, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getGeoInfoA(location, geotype, (lpgeodata?.value ?: 0L), cchdata, langid.toShort())

public actual fun getGeoInfoEx(location: Pcwstr, geotype: Sysgeotype, geodata: Pwstr, geodatacount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getGeoInfoEx((location?.value ?: 0L), geotype, (geodata?.value ?: 0L), geodatacount)

public actual fun getGeoInfoW(location: Int, geotype: Sysgeotype, lpgeodata: Pwstr, cchdata: Int, langid: UShort): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getGeoInfoW(location, geotype, (lpgeodata?.value ?: 0L), cchdata, langid.toShort())

public actual fun getLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getLocaleInfoA(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L), cchdata)

public actual fun getLocaleInfoEx(lplocalename: Pcwstr, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getLocaleInfoEx((lplocalename?.value ?: 0L), lctype.toInt(), (lplcdata?.value ?: 0L), cchdata)

public actual fun getLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pwstr, cchdata: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getLocaleInfoW(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L), cchdata)

public actual fun getNLSVersion(function: UInt, locale: UInt, lpversioninformation: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getNLSVersion(function.toInt(), locale.toInt(), (lpversioninformation?.value ?: 0L))

public actual fun getNLSVersionEx(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getNLSVersionEx(function.toInt(), (lplocalename?.value ?: 0L), (lpversioninformation?.value ?: 0L))

public actual fun getNumberFormatA(locale: UInt, dwflags: UInt, lpvalue: Pcstr, lpformat: COpaquePointer?, lpnumberstr: Pstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getNumberFormatA(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpnumberstr?.value ?: 0L), cchnumber)

public actual fun getNumberFormatEx(lplocalename: Pcwstr, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getNumberFormatEx((lplocalename?.value ?: 0L), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpnumberstr?.value ?: 0L), cchnumber)

public actual fun getNumberFormatW(locale: UInt, dwflags: UInt, lpvalue: Pcwstr, lpformat: COpaquePointer?, lpnumberstr: Pwstr, cchnumber: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getNumberFormatW(locale.toInt(), dwflags.toInt(), (lpvalue?.value ?: 0L), (lpformat?.value ?: 0L), (lpnumberstr?.value ?: 0L), cchnumber)

public actual fun getOEMCP(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getOEMCP().toUInt()

public actual fun getProcessPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getProcessPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L), (pwszlanguagesbuffer?.value ?: 0L), (pcchlanguagesbuffer?.value ?: 0L))

public actual fun getStringScripts(dwflags: UInt, lpstring: Pcwstr, cchstring: Int, lpscripts: Pwstr, cchscripts: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getStringScripts(dwflags.toInt(), (lpstring?.value ?: 0L), cchstring, (lpscripts?.value ?: 0L), cchscripts)

public actual fun getStringTypeA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getStringTypeA(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpchartype?.value ?: 0L))

public actual fun getStringTypeExA(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getStringTypeExA(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpchartype?.value ?: 0L))

public actual fun getStringTypeExW(locale: UInt, dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getStringTypeExW(locale.toInt(), dwinfotype.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpchartype?.value ?: 0L))

public actual fun getStringTypeW(dwinfotype: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpchartype: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getStringTypeW(dwinfotype.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpchartype?.value ?: 0L))

public actual fun getSystemDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getSystemDefaultLCID().toUInt()

public actual fun getSystemDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getSystemDefaultLangID().toUShort()

public actual fun getSystemDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getSystemDefaultLocaleName((lplocalename?.value ?: 0L), cchlocalename)

public actual fun getSystemDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getSystemDefaultUILanguage().toUShort()

public actual fun getSystemPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getSystemPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L), (pwszlanguagesbuffer?.value ?: 0L), (pcchlanguagesbuffer?.value ?: 0L))

public actual fun getTextCharset(hdc: Hdc): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getTextCharset((hdc?.value ?: 0L))

public actual fun getTextCharsetInfo(hdc: Hdc, lpsig: COpaquePointer?, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getTextCharsetInfo((hdc?.value ?: 0L), (lpsig?.value ?: 0L), dwflags.toInt())

public actual fun getThreadLocale(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getThreadLocale().toUInt()

public actual fun getThreadPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getThreadPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L), (pwszlanguagesbuffer?.value ?: 0L), (pcchlanguagesbuffer?.value ?: 0L))

public actual fun getThreadUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getThreadUILanguage().toUShort()

public actual fun getTimeFormatA(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcstr, lptimestr: Pstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getTimeFormatA(locale.toInt(), dwflags.toInt(), (lptime?.value ?: 0L), (lpformat?.value ?: 0L), (lptimestr?.value ?: 0L), cchtime)

public actual fun getTimeFormatEx(lplocalename: Pcwstr, dwflags: TimeFormatFlags, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getTimeFormatEx((lplocalename?.value ?: 0L), dwflags.toInt(), (lptime?.value ?: 0L), (lpformat?.value ?: 0L), (lptimestr?.value ?: 0L), cchtime)

public actual fun getTimeFormatW(locale: UInt, dwflags: UInt, lptime: COpaquePointer?, lpformat: Pcwstr, lptimestr: Pwstr, cchtime: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getTimeFormatW(locale.toInt(), dwflags.toInt(), (lptime?.value ?: 0L), (lpformat?.value ?: 0L), (lptimestr?.value ?: 0L), cchtime)

public actual fun getUILanguageInfo(dwflags: UInt, pwmszlanguage: Pcwstr, pwszfallbacklanguages: Pwstr, pcchfallbacklanguages: COpaquePointer?, pattributes: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUILanguageInfo(dwflags.toInt(), (pwmszlanguage?.value ?: 0L), (pwszfallbacklanguages?.value ?: 0L), (pcchfallbacklanguages?.value ?: 0L), (pattributes?.value ?: 0L))

public actual fun getUserDefaultGeoName(geoname: Pwstr, geonamecount: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserDefaultGeoName((geoname?.value ?: 0L), geonamecount)

public actual fun getUserDefaultLCID(): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserDefaultLCID().toUInt()

public actual fun getUserDefaultLangID(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserDefaultLangID().toUShort()

public actual fun getUserDefaultLocaleName(lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserDefaultLocaleName((lplocalename?.value ?: 0L), cchlocalename)

public actual fun getUserDefaultUILanguage(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserDefaultUILanguage().toUShort()

public actual fun getUserGeoID(geoclass: Sysgeoclass): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserGeoID(geoclass)

public actual fun getUserPreferredUILanguages(dwflags: UInt, pulnumlanguages: COpaquePointer?, pwszlanguagesbuffer: Pwstr, pcchlanguagesbuffer: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_getUserPreferredUILanguages(dwflags.toInt(), (pulnumlanguages?.value ?: 0L), (pwszlanguagesbuffer?.value ?: 0L), (pcchlanguagesbuffer?.value ?: 0L))

public actual fun idnToAscii(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpasciicharstr: Pwstr, cchasciichar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_idnToAscii(dwflags.toInt(), (lpunicodecharstr?.value ?: 0L), cchunicodechar, (lpasciicharstr?.value ?: 0L), cchasciichar)

public actual fun idnToNameprepUnicode(dwflags: UInt, lpunicodecharstr: Pcwstr, cchunicodechar: Int, lpnameprepcharstr: Pwstr, cchnameprepchar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_idnToNameprepUnicode(dwflags.toInt(), (lpunicodecharstr?.value ?: 0L), cchunicodechar, (lpnameprepcharstr?.value ?: 0L), cchnameprepchar)

public actual fun idnToUnicode(dwflags: UInt, lpasciicharstr: Pcwstr, cchasciichar: Int, lpunicodecharstr: Pwstr, cchunicodechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_idnToUnicode(dwflags.toInt(), (lpasciicharstr?.value ?: 0L), cchasciichar, (lpunicodecharstr?.value ?: 0L), cchunicodechar)

public actual fun isCalendarLeapYear(calid: UInt, year: UInt, era: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isCalendarLeapYear(calid.toInt(), year.toInt(), era.toInt())

public actual fun isDBCSLeadByte(testchar: UByte): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isDBCSLeadByte(testchar.toByte())

public actual fun isDBCSLeadByteEx(codepage: UInt, testchar: UByte): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isDBCSLeadByteEx(codepage.toInt(), testchar.toByte())

public actual fun isNLSDefinedString(function: UInt, dwflags: UInt, lpversioninformation: COpaquePointer?, lpstring: Pcwstr, cchstr: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isNLSDefinedString(function.toInt(), dwflags.toInt(), (lpversioninformation?.value ?: 0L), (lpstring?.value ?: 0L), cchstr)

public actual fun isNormalizedString(normform: NormForm, lpstring: Pcwstr, cwlength: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isNormalizedString(normform, (lpstring?.value ?: 0L), cwlength)

public actual fun isTextUnicode(lpv: COpaquePointer?, isize: Int, lpiresult: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isTextUnicode((lpv?.value ?: 0L), isize, (lpiresult?.value ?: 0L))

public actual fun isValidCodePage(codepage: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isValidCodePage(codepage.toInt())

public actual fun isValidLanguageGroup(languagegroup: UInt, dwflags: EnumSystemLanguageGroupsFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isValidLanguageGroup(languagegroup.toInt(), dwflags.toInt())

public actual fun isValidLocale(locale: UInt, dwflags: IsValidLocaleFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isValidLocale(locale.toInt(), dwflags.toInt())

public actual fun isValidLocaleName(lplocalename: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isValidLocaleName((lplocalename?.value ?: 0L))

public actual fun isValidNLSVersion(function: UInt, lplocalename: Pcwstr, lpversioninformation: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isValidNLSVersion(function.toInt(), (lplocalename?.value ?: 0L), (lpversioninformation?.value ?: 0L)).toUInt()

public actual fun isWellFormedTag(psztag: Pcwstr): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_isWellFormedTag((psztag?.value ?: 0L)).toUByte()

public actual fun lCIDToLocaleName(locale: UInt, lpname: Pwstr, cchname: Int, dwflags: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lCIDToLocaleName(locale.toInt(), (lpname?.value ?: 0L), cchname, dwflags.toInt())

public actual fun lCMapStringA(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lCMapStringA(locale.toInt(), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun lCMapStringEx(lplocalename: Pcwstr, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int, lpversioninformation: COpaquePointer?, lpreserved: COpaquePointer?, sorthandle: Lparam): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lCMapStringEx((lplocalename?.value ?: 0L), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest, (lpversioninformation?.value ?: 0L), (lpreserved?.value ?: 0L), sorthandle)

public actual fun lCMapStringW(locale: UInt, dwmapflags: UInt, lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lCMapStringW(locale.toInt(), dwmapflags.toInt(), (lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun localeNameToLCID(lpname: Pcwstr, dwflags: UInt): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_localeNameToLCID((lpname?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun mappingDoAction(pbag: COpaquePointer?, dwrangeindex: UInt, pszactionid: Pcwstr): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_mappingDoAction((pbag?.value ?: 0L), dwrangeindex.toInt(), (pszactionid?.value ?: 0L))

public actual fun mappingFreePropertyBag(pbag: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_mappingFreePropertyBag((pbag?.value ?: 0L))

public actual fun mappingFreeServices(pserviceinfo: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_mappingFreeServices((pserviceinfo?.value ?: 0L))

public actual fun mappingGetServices(poptions: COpaquePointer?, prgservices: COpaquePointer?, pdwservicescount: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_mappingGetServices((poptions?.value ?: 0L), (prgservices?.value ?: 0L), (pdwservicescount?.value ?: 0L))

public actual fun mappingRecognizeText(pserviceinfo: COpaquePointer?, psztext: Pcwstr, dwlength: UInt, dwindex: UInt, poptions: COpaquePointer?, pbag: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_mappingRecognizeText((pserviceinfo?.value ?: 0L), (psztext?.value ?: 0L), dwlength.toInt(), dwindex.toInt(), (poptions?.value ?: 0L), (pbag?.value ?: 0L))

public actual fun multiByteToWideChar(codepage: UInt, dwflags: MultiByteToWideCharFlags, lpmultibytestr: Pcstr, cbmultibyte: Int, lpwidecharstr: Pwstr, cchwidechar: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_multiByteToWideChar(codepage.toInt(), dwflags.toInt(), (lpmultibytestr?.value ?: 0L), cbmultibyte, (lpwidecharstr?.value ?: 0L), cchwidechar)

public actual fun normalizeString(normform: NormForm, lpsrcstring: Pcwstr, cwsrclength: Int, lpdststring: Pwstr, cwdstlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_normalizeString(normform, (lpsrcstring?.value ?: 0L), cwsrclength, (lpdststring?.value ?: 0L), cwdstlength)

public actual fun notifyUILanguageChange(dwflags: UInt, pcwstrnewlanguage: Pcwstr, pcwstrpreviouslanguage: Pcwstr, dwreserved: UInt, pdwstatusrtrn: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_notifyUILanguageChange(dwflags.toInt(), (pcwstrnewlanguage?.value ?: 0L), (pcwstrpreviouslanguage?.value ?: 0L), dwreserved.toInt(), (pdwstatusrtrn?.value ?: 0L))

public actual fun resolveLocaleName(lpnametoresolve: Pcwstr, lplocalename: Pwstr, cchlocalename: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_resolveLocaleName((lpnametoresolve?.value ?: 0L), (lplocalename?.value ?: 0L), cchlocalename)

public actual fun restoreThreadPreferredUILanguages(snapshot: Hsaveduilanguages) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_restoreThreadPreferredUILanguages((snapshot?.value ?: 0L))
}

public actual fun scriptApplyDigitSubstitution(psds: COpaquePointer?, psc: COpaquePointer?, pss: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptApplyDigitSubstitution((psds?.value ?: 0L), (psc?.value ?: 0L), (pss?.value ?: 0L))

public actual fun scriptApplyLogicalWidth(pidx: COpaquePointer?, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pabc: COpaquePointer?, pijustify: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptApplyLogicalWidth((pidx?.value ?: 0L), cchars, cglyphs, (pwlogclust?.value ?: 0L), (psva?.value ?: 0L), (piadvance?.value ?: 0L), (psa?.value ?: 0L), (pabc?.value ?: 0L), (pijustify?.value ?: 0L))

public actual fun scriptBreak(pwcchars: Pcwstr, cchars: Int, psa: COpaquePointer?, psla: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptBreak((pwcchars?.value ?: 0L), cchars, (psa?.value ?: 0L), (psla?.value ?: 0L))

public actual fun scriptCPtoX(icp: Int, ftrailing: Bool, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, pix: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptCPtoX(icp, ftrailing, cchars, cglyphs, (pwlogclust?.value ?: 0L), (psva?.value ?: 0L), (piadvance?.value ?: 0L), (psa?.value ?: 0L), (pix?.value ?: 0L))

public actual fun scriptCacheGetHeight(hdc: Hdc, psc: COpaquePointer?, tmheight: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptCacheGetHeight((hdc?.value ?: 0L), (psc?.value ?: 0L), (tmheight?.value ?: 0L))

public actual fun scriptFreeCache(psc: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptFreeCache((psc?.value ?: 0L))

public actual fun scriptGetCMap(hdc: Hdc, psc: COpaquePointer?, pwcinchars: Pcwstr, cchars: Int, dwflags: UInt, pwoutglyphs: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetCMap((hdc?.value ?: 0L), (psc?.value ?: 0L), (pwcinchars?.value ?: 0L), cchars, dwflags.toInt(), (pwoutglyphs?.value ?: 0L))

public actual fun scriptGetFontAlternateGlyphs(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, wglyphid: UShort, cmaxalternates: Int, palternateglyphs: COpaquePointer?, pcalternates: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetFontAlternateGlyphs((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), wglyphid.toShort(), cmaxalternates, (palternateglyphs?.value ?: 0L), (pcalternates?.value ?: 0L))

public actual fun scriptGetFontFeatureTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, cmaxtags: Int, pfeaturetags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetFontFeatureTags((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), taglangsys.toInt(), cmaxtags, (pfeaturetags?.value ?: 0L), (pctags?.value ?: 0L))

public actual fun scriptGetFontLanguageTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, cmaxtags: Int, plangsystags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetFontLanguageTags((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), cmaxtags, (plangsystags?.value ?: 0L), (pctags?.value ?: 0L))

public actual fun scriptGetFontProperties(hdc: Hdc, psc: COpaquePointer?, sfp: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetFontProperties((hdc?.value ?: 0L), (psc?.value ?: 0L), (sfp?.value ?: 0L))

public actual fun scriptGetFontScriptTags(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, cmaxtags: Int, pscripttags: COpaquePointer?, pctags: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetFontScriptTags((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), cmaxtags, (pscripttags?.value ?: 0L), (pctags?.value ?: 0L))

public actual fun scriptGetGlyphABCWidth(hdc: Hdc, psc: COpaquePointer?, wglyph: UShort, pabc: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetGlyphABCWidth((hdc?.value ?: 0L), (psc?.value ?: 0L), wglyph.toShort(), (pabc?.value ?: 0L))

public actual fun scriptGetLogicalWidths(psa: COpaquePointer?, cchars: Int, cglyphs: Int, piglyphwidth: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetLogicalWidths((psa?.value ?: 0L), cchars, cglyphs, (piglyphwidth?.value ?: 0L), (pwlogclust?.value ?: 0L), (psva?.value ?: 0L), (pidx?.value ?: 0L))

public actual fun scriptGetProperties(ppsp: COpaquePointer?, pinumscripts: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptGetProperties((ppsp?.value ?: 0L), (pinumscripts?.value ?: 0L))

public actual fun scriptIsComplex(pwcinchars: Pcwstr, cinchars: Int, dwflags: ScriptIsComplexFlags): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptIsComplex((pwcinchars?.value ?: 0L), cinchars, dwflags.toInt())

public actual fun scriptItemize(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptItemize((pwcinchars?.value ?: 0L), cinchars, cmaxitems, (pscontrol?.value ?: 0L), (psstate?.value ?: 0L), (pitems?.value ?: 0L), (pcitems?.value ?: 0L))

public actual fun scriptItemizeOpenType(pwcinchars: Pcwstr, cinchars: Int, cmaxitems: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pitems: COpaquePointer?, pscripttags: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptItemizeOpenType((pwcinchars?.value ?: 0L), cinchars, cmaxitems, (pscontrol?.value ?: 0L), (psstate?.value ?: 0L), (pitems?.value ?: 0L), (pscripttags?.value ?: 0L), (pcitems?.value ?: 0L))

public actual fun scriptJustify(psva: COpaquePointer?, piadvance: COpaquePointer?, cglyphs: Int, idx: Int, iminkashida: Int, pijustify: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptJustify((psva?.value ?: 0L), (piadvance?.value ?: 0L), cglyphs, idx, iminkashida, (pijustify?.value ?: 0L))

public actual fun scriptLayout(cruns: Int, pblevel: COpaquePointer?, pivisualtological: COpaquePointer?, pilogicaltovisual: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptLayout(cruns, (pblevel?.value ?: 0L), (pivisualtological?.value ?: 0L), (pilogicaltovisual?.value ?: 0L))

public actual fun scriptPlace(hdc: Hdc, psc: COpaquePointer?, pwglyphs: COpaquePointer?, cglyphs: Int, psva: COpaquePointer?, psa: COpaquePointer?, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptPlace((hdc?.value ?: 0L), (psc?.value ?: 0L), (pwglyphs?.value ?: 0L), cglyphs, (psva?.value ?: 0L), (psa?.value ?: 0L), (piadvance?.value ?: 0L), (pgoffset?.value ?: 0L), (pabc?.value ?: 0L))

public actual fun scriptPlaceOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, cchars: Int, pwglyphs: COpaquePointer?, pglyphprops: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pgoffset: COpaquePointer?, pabc: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptPlaceOpenType((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), taglangsys.toInt(), (rcrangechars?.value ?: 0L), (rprangeproperties?.value ?: 0L), cranges, (pwcchars?.value ?: 0L), (pwlogclust?.value ?: 0L), (pcharprops?.value ?: 0L), cchars, (pwglyphs?.value ?: 0L), (pglyphprops?.value ?: 0L), cglyphs, (piadvance?.value ?: 0L), (pgoffset?.value ?: 0L), (pabc?.value ?: 0L))

public actual fun scriptPositionSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, iadvance: Int, goffset: Goffset, pioutadvance: COpaquePointer?, poutgoffset: COpaquePointer?): Hresult =
    0

public actual fun scriptRecordDigitSubstitution(locale: UInt, psds: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptRecordDigitSubstitution(locale.toInt(), (psds?.value ?: 0L))

public actual fun scriptShape(hdc: Hdc, psc: COpaquePointer?, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, psa: COpaquePointer?, pwoutglyphs: COpaquePointer?, pwlogclust: COpaquePointer?, psva: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptShape((hdc?.value ?: 0L), (psc?.value ?: 0L), (pwcchars?.value ?: 0L), cchars, cmaxglyphs, (psa?.value ?: 0L), (pwoutglyphs?.value ?: 0L), (pwlogclust?.value ?: 0L), (psva?.value ?: 0L), (pcglyphs?.value ?: 0L))

public actual fun scriptShapeOpenType(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, rcrangechars: COpaquePointer?, rprangeproperties: COpaquePointer?, cranges: Int, pwcchars: Pcwstr, cchars: Int, cmaxglyphs: Int, pwlogclust: COpaquePointer?, pcharprops: COpaquePointer?, pwoutglyphs: COpaquePointer?, poutglyphprops: COpaquePointer?, pcglyphs: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptShapeOpenType((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), taglangsys.toInt(), (rcrangechars?.value ?: 0L), (rprangeproperties?.value ?: 0L), cranges, (pwcchars?.value ?: 0L), cchars, cmaxglyphs, (pwlogclust?.value ?: 0L), (pcharprops?.value ?: 0L), (pwoutglyphs?.value ?: 0L), (poutglyphprops?.value ?: 0L), (pcglyphs?.value ?: 0L))

public actual fun scriptStringAnalyse(hdc: Hdc, pstring: COpaquePointer?, cstring: Int, cglyphs: Int, icharset: Int, dwflags: UInt, ireqwidth: Int, pscontrol: COpaquePointer?, psstate: COpaquePointer?, pidx: COpaquePointer?, ptabdef: COpaquePointer?, pbinclass: COpaquePointer?, pssa: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringAnalyse((hdc?.value ?: 0L), (pstring?.value ?: 0L), cstring, cglyphs, icharset, dwflags.toInt(), ireqwidth, (pscontrol?.value ?: 0L), (psstate?.value ?: 0L), (pidx?.value ?: 0L), (ptabdef?.value ?: 0L), (pbinclass?.value ?: 0L), (pssa?.value ?: 0L))

public actual fun scriptStringCPtoX(ssa: COpaquePointer?, icp: Int, ftrailing: Bool, px: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringCPtoX((ssa?.value ?: 0L), icp, ftrailing, (px?.value ?: 0L))

public actual fun scriptStringFree(pssa: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringFree((pssa?.value ?: 0L))

public actual fun scriptStringGetLogicalWidths(ssa: COpaquePointer?, pidx: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringGetLogicalWidths((ssa?.value ?: 0L), (pidx?.value ?: 0L))

public actual fun scriptStringGetOrder(ssa: COpaquePointer?, puorder: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringGetOrder((ssa?.value ?: 0L), (puorder?.value ?: 0L))

public actual fun scriptStringOut(ssa: COpaquePointer?, ix: Int, iy: Int, uoptions: EtoOptions, prc: COpaquePointer?, iminsel: Int, imaxsel: Int, fdisabled: Bool): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringOut((ssa?.value ?: 0L), ix, iy, uoptions.toInt(), (prc?.value ?: 0L), iminsel, imaxsel, fdisabled)

public actual fun scriptStringValidate(ssa: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringValidate((ssa?.value ?: 0L))

public actual fun scriptStringXtoCP(ssa: COpaquePointer?, ix: Int, pich: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringXtoCP((ssa?.value ?: 0L), ix, (pich?.value ?: 0L), (pitrailing?.value ?: 0L))

public actual fun scriptStringPLogAttr(ssa: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringPLogAttr((ssa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun scriptStringPSize(ssa: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringPSize((ssa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun scriptStringPcOutChars(ssa: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptStringPcOutChars((ssa?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun scriptSubstituteSingleGlyph(hdc: Hdc, psc: COpaquePointer?, psa: COpaquePointer?, tagscript: UInt, taglangsys: UInt, tagfeature: UInt, lparameter: Int, wglyphid: UShort, pwoutglyphid: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptSubstituteSingleGlyph((hdc?.value ?: 0L), (psc?.value ?: 0L), (psa?.value ?: 0L), tagscript.toInt(), taglangsys.toInt(), tagfeature.toInt(), lparameter, wglyphid.toShort(), (pwoutglyphid?.value ?: 0L))

public actual fun scriptTextOut(hdc: Hdc, psc: COpaquePointer?, x: Int, y: Int, fuoptions: UInt, lprc: COpaquePointer?, psa: COpaquePointer?, pwcreserved: Pcwstr, ireserved: Int, pwglyphs: COpaquePointer?, cglyphs: Int, piadvance: COpaquePointer?, pijustify: COpaquePointer?, pgoffset: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptTextOut((hdc?.value ?: 0L), (psc?.value ?: 0L), x, y, fuoptions.toInt(), (lprc?.value ?: 0L), (psa?.value ?: 0L), (pwcreserved?.value ?: 0L), ireserved, (pwglyphs?.value ?: 0L), cglyphs, (piadvance?.value ?: 0L), (pijustify?.value ?: 0L), (pgoffset?.value ?: 0L))

public actual fun scriptXtoCP(ix: Int, cchars: Int, cglyphs: Int, pwlogclust: COpaquePointer?, psva: COpaquePointer?, piadvance: COpaquePointer?, psa: COpaquePointer?, picp: COpaquePointer?, pitrailing: COpaquePointer?): Hresult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_scriptXtoCP(ix, cchars, cglyphs, (pwlogclust?.value ?: 0L), (psva?.value ?: 0L), (piadvance?.value ?: 0L), (psa?.value ?: 0L), (picp?.value ?: 0L), (pitrailing?.value ?: 0L))

public actual fun setCalendarInfoA(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setCalendarInfoA(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L))

public actual fun setCalendarInfoW(locale: UInt, calendar: UInt, caltype: UInt, lpcaldata: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setCalendarInfoW(locale.toInt(), calendar.toInt(), caltype.toInt(), (lpcaldata?.value ?: 0L))

public actual fun setLocaleInfoA(locale: UInt, lctype: UInt, lplcdata: Pcstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setLocaleInfoA(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L))

public actual fun setLocaleInfoW(locale: UInt, lctype: UInt, lplcdata: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setLocaleInfoW(locale.toInt(), lctype.toInt(), (lplcdata?.value ?: 0L))

public actual fun setProcessPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setProcessPreferredUILanguages(dwflags.toInt(), (pwszlanguagesbuffer?.value ?: 0L), (pulnumlanguages?.value ?: 0L))

public actual fun setThreadLocale(locale: UInt): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setThreadLocale(locale.toInt())

public actual fun setThreadPreferredUILanguages(dwflags: UInt, pwszlanguagesbuffer: Pcwstr, pulnumlanguages: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setThreadPreferredUILanguages(dwflags.toInt(), (pwszlanguagesbuffer?.value ?: 0L), (pulnumlanguages?.value ?: 0L))

public actual fun setThreadPreferredUILanguages2(flags: UInt, languages: Pcwstr, numlanguagesset: COpaquePointer?, snapshot: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setThreadPreferredUILanguages2(flags.toInt(), (languages?.value ?: 0L), (numlanguagesset?.value ?: 0L), (snapshot?.value ?: 0L))

public actual fun setThreadUILanguage(langid: UShort): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setThreadUILanguage(langid.toShort()).toUShort()

public actual fun setUserGeoID(geoid: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setUserGeoID(geoid)

public actual fun setUserGeoName(geoname: Pcwstr): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_setUserGeoName((geoname?.value ?: 0L))

public actual fun translateCharsetInfo(lpsrc: COpaquePointer?, lpcs: COpaquePointer?, dwflags: TranslateCharsetInfoFlags): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_translateCharsetInfo((lpsrc?.value ?: 0L), (lpcs?.value ?: 0L), dwflags.toInt())

public actual fun ucnvFromUCallbackEscape(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUCallbackEscape((context?.value ?: 0L), (fromuargs?.value ?: 0L), (codeunits?.value ?: 0L), length, codepoint, reason, (err?.value ?: 0L))
}

public actual fun ucnvFromUCallbackSkip(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUCallbackSkip((context?.value ?: 0L), (fromuargs?.value ?: 0L), (codeunits?.value ?: 0L), length, codepoint, reason, (err?.value ?: 0L))
}

public actual fun ucnvFromUCallbackStop(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUCallbackStop((context?.value ?: 0L), (fromuargs?.value ?: 0L), (codeunits?.value ?: 0L), length, codepoint, reason, (err?.value ?: 0L))
}

public actual fun ucnvFromUCallbackSubstitute(context: COpaquePointer?, fromuargs: COpaquePointer?, codeunits: COpaquePointer?, length: Int, codepoint: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUCallbackSubstitute((context?.value ?: 0L), (fromuargs?.value ?: 0L), (codeunits?.value ?: 0L), length, codepoint, reason, (err?.value ?: 0L))
}

public actual fun ucnvToUCallbackEscape(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUCallbackEscape((context?.value ?: 0L), (touargs?.value ?: 0L), (codeunits?.value ?: 0L), length, reason, (err?.value ?: 0L))
}

public actual fun ucnvToUCallbackSkip(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUCallbackSkip((context?.value ?: 0L), (touargs?.value ?: 0L), (codeunits?.value ?: 0L), length, reason, (err?.value ?: 0L))
}

public actual fun ucnvToUCallbackStop(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUCallbackStop((context?.value ?: 0L), (touargs?.value ?: 0L), (codeunits?.value ?: 0L), length, reason, (err?.value ?: 0L))
}

public actual fun ucnvToUCallbackSubstitute(context: COpaquePointer?, touargs: COpaquePointer?, codeunits: Pcstr, length: Int, reason: UConverterCallbackReason, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUCallbackSubstitute((context?.value ?: 0L), (touargs?.value ?: 0L), (codeunits?.value ?: 0L), length, reason, (err?.value ?: 0L))
}

public actual fun updateCalendarDayOfWeek(lpcaldatetime: COpaquePointer?): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_updateCalendarDayOfWeek((lpcaldatetime?.value ?: 0L))

public actual fun verifyScripts(dwflags: UInt, lplocalescripts: Pcwstr, cchlocalescripts: Int, lptestscripts: Pcwstr, cchtestscripts: Int): Bool =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_verifyScripts(dwflags.toInt(), (lplocalescripts?.value ?: 0L), cchlocalescripts, (lptestscripts?.value ?: 0L), cchtestscripts)

public actual fun wideCharToMultiByte(codepage: UInt, dwflags: UInt, lpwidecharstr: Pcwstr, cchwidechar: Int, lpmultibytestr: Pstr, cbmultibyte: Int, lpdefaultchar: Pcstr, lpuseddefaultchar: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_wideCharToMultiByte(codepage.toInt(), dwflags.toInt(), (lpwidecharstr?.value ?: 0L), cchwidechar, (lpmultibytestr?.value ?: 0L), cbmultibyte, (lpdefaultchar?.value ?: 0L), (lpuseddefaultchar?.value ?: 0L))

public actual fun lstrcatA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcatA((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrcatW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcatW((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrcmpA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpA((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L))

public actual fun lstrcmpW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpW((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L))

public actual fun lstrcmpiA(lpstring1: Pcstr, lpstring2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpiA((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L))

public actual fun lstrcmpiW(lpstring1: Pcwstr, lpstring2: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcmpiW((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L))

public actual fun lstrcpyA(lpstring1: Pstr, lpstring2: Pcstr): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpyA((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrcpyW(lpstring1: Pwstr, lpstring2: Pcwstr): Pwstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpyW((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrcpynA(lpstring1: Pstr, lpstring2: Pcstr, imaxlength: Int): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpynA((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L), imaxlength).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrcpynW(lpstring1: Pwstr, lpstring2: Pcwstr, imaxlength: Int): Pwstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrcpynW((lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L), imaxlength).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstrlenA(lpstring: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrlenA((lpstring?.value ?: 0L))

public actual fun lstrlenW(lpstring: Pcwstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_lstrlenW((lpstring?.value ?: 0L))

public actual fun uUcharsToChars(us: COpaquePointer?, cs: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uUcharsToChars((us?.value ?: 0L), (cs?.value ?: 0L), length)
}

public actual fun uAustrcpy(dst: Pcstr, src: COpaquePointer?): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uAustrcpy((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uAustrncpy(dst: Pcstr, src: COpaquePointer?, n: Int): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uAustrncpy((dst?.value ?: 0L), (src?.value ?: 0L), n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uCatclose(catd: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCatclose((catd?.value ?: 0L))
}

public actual fun uCatgets(catd: COpaquePointer?, setNum: Int, msgNum: Int, s: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCatgets((catd?.value ?: 0L), setNum, msgNum, (s?.value ?: 0L), (len?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uCatopen(name: Pcstr, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCatopen((name?.value ?: 0L), (locale?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uCharAge(c: Int, versionarray: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharAge(c, (versionarray?.value ?: 0L))
}

public actual fun uCharDigitValue(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharDigitValue(c)

public actual fun uCharDirection(c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharDirection(c)

public actual fun uCharFromName(namechoice: UCharNameChoice, name: Pcstr, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharFromName(namechoice, (name?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uCharMirror(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharMirror(c)

public actual fun uCharName(code: Int, namechoice: UCharNameChoice, buffer: Pcstr, bufferlength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharName(code, namechoice, (buffer?.value ?: 0L), bufferlength, (perrorcode?.value ?: 0L))

public actual fun uCharType(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharType(c)

public actual fun uCharsToUchars(cs: Pcstr, us: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCharsToUchars((cs?.value ?: 0L), (us?.value ?: 0L), length)
}

public actual fun uCleanup() {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCleanup()
}

public actual fun uCountChar32(s: COpaquePointer?, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uCountChar32((s?.value ?: 0L), length)

public actual fun uDigit(ch: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uDigit(ch, radix)

public actual fun uEnumCharNames(start: Int, limit: Int, fn: COpaquePointer?, context: COpaquePointer?, namechoice: UCharNameChoice, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uEnumCharNames(start, limit, (fn?.value ?: 0L), (context?.value ?: 0L), namechoice, (perrorcode?.value ?: 0L))
}

public actual fun uEnumCharTypes(enumrange: COpaquePointer?, context: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uEnumCharTypes((enumrange?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun uErrorName(code: UErrorCode): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uErrorName(code).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uFoldCase(c: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uFoldCase(c, options.toInt())

public actual fun uForDigit(digit: Int, radix: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uForDigit(digit, radix)

public actual fun uFormatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uFormatMessage((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (result?.value ?: 0L), resultlength, (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uFormatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uFormatMessageWithError((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (result?.value ?: 0L), resultlength, (parseerror?.value ?: 0L), (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun uGetBidiPairedBracket(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetBidiPairedBracket(c)

public actual fun uGetBinaryPropertySet(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetBinaryPropertySet(property, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uGetCombiningClass(c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetCombiningClass(c).toUByte()

public actual fun uGetDataVersion(dataversionfillin: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetDataVersion((dataversionfillin?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uGetFcNfkcClosure(c: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetFcNfkcClosure(c, (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun uGetIntPropertyMap(property: UProperty, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetIntPropertyMap(property, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uGetIntPropertyMaxValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetIntPropertyMaxValue(which)

public actual fun uGetIntPropertyMinValue(which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetIntPropertyMinValue(which)

public actual fun uGetIntPropertyValue(c: Int, which: UProperty): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetIntPropertyValue(c, which)

public actual fun uGetNumericValue(c: Int): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetNumericValue(c)

public actual fun uGetPropertyEnum(alias: Pcstr): UProperty =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetPropertyEnum((alias?.value ?: 0L))

public actual fun uGetPropertyName(property: UProperty, namechoice: UPropertyNameChoice): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetPropertyName(property, namechoice).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uGetPropertyValueEnum(property: UProperty, alias: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetPropertyValueEnum(property, (alias?.value ?: 0L))

public actual fun uGetPropertyValueName(property: UProperty, value: Int, namechoice: UPropertyNameChoice): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetPropertyValueName(property, value, namechoice).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uGetUnicodeVersion(versionarray: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetUnicodeVersion((versionarray?.value ?: 0L))
}

public actual fun uGetVersion(versionarray: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uGetVersion((versionarray?.value ?: 0L))
}

public actual fun uHasBinaryProperty(c: Int, which: UProperty): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uHasBinaryProperty(c, which)

public actual fun uInit(status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uInit((status?.value ?: 0L))
}

public actual fun uIsIdignorable(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsIdignorable(c)

public actual fun uIsIdpart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsIdpart(c)

public actual fun uIsIdstart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsIdstart(c)

public actual fun uIsIsocontrol(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsIsocontrol(c)

public actual fun uIsJavaIdpart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsJavaIdpart(c)

public actual fun uIsJavaIdstart(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsJavaIdstart(c)

public actual fun uIsJavaSpaceChar(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsJavaSpaceChar(c)

public actual fun uIsMirrored(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsMirrored(c)

public actual fun uIsUalphabetic(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsUalphabetic(c)

public actual fun uIsUlowercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsUlowercase(c)

public actual fun uIsUuppercase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsUuppercase(c)

public actual fun uIsUwhiteSpace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsUwhiteSpace(c)

public actual fun uIsWhitespace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsWhitespace(c)

public actual fun uIsalnum(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsalnum(c)

public actual fun uIsalpha(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsalpha(c)

public actual fun uIsbase(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsbase(c)

public actual fun uIsblank(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsblank(c)

public actual fun uIscntrl(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIscntrl(c)

public actual fun uIsdefined(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsdefined(c)

public actual fun uIsdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsdigit(c)

public actual fun uIsgraph(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsgraph(c)

public actual fun uIslower(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIslower(c)

public actual fun uIsprint(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsprint(c)

public actual fun uIspunct(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIspunct(c)

public actual fun uIsspace(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsspace(c)

public actual fun uIstitle(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIstitle(c)

public actual fun uIsupper(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsupper(c)

public actual fun uIsxdigit(c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uIsxdigit(c)

public actual fun uMemcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, length: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemcasecmp((s1?.value ?: 0L), (s2?.value ?: 0L), length, options.toInt())

public actual fun uMemchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemchr((s?.value ?: 0L), c.toShort(), count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemchr32((s?.value ?: 0L), c, count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemcmp(buf1: COpaquePointer?, buf2: COpaquePointer?, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemcmp((buf1?.value ?: 0L), (buf2?.value ?: 0L), count)

public actual fun uMemcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, count: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemcmpCodePointOrder((s1?.value ?: 0L), (s2?.value ?: 0L), count)

public actual fun uMemcpy(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemcpy((dest?.value ?: 0L), (src?.value ?: 0L), count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemmove(dest: COpaquePointer?, src: COpaquePointer?, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemmove((dest?.value ?: 0L), (src?.value ?: 0L), count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemrchr(s: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemrchr((s?.value ?: 0L), c.toShort(), count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemrchr32(s: COpaquePointer?, c: Int, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemrchr32((s?.value ?: 0L), c, count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uMemset(dest: COpaquePointer?, c: UShort, count: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uMemset((dest?.value ?: 0L), c.toShort(), count).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uParseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, status: COpaquePointer?, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uParseMessage((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (source?.value ?: 0L), sourcelength, (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uParseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, parseerror: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uParseMessageWithError((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (source?.value ?: 0L), sourcelength, (parseerror?.value ?: 0L), (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun uSetMemoryFunctions(context: COpaquePointer?, a: COpaquePointer?, r: COpaquePointer?, f: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uSetMemoryFunctions((context?.value ?: 0L), (a?.value ?: 0L), (r?.value ?: 0L), (f?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uShapeArabic(source: COpaquePointer?, sourcelength: Int, dest: COpaquePointer?, destsize: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uShapeArabic((source?.value ?: 0L), sourcelength, (dest?.value ?: 0L), destsize, options.toInt(), (perrorcode?.value ?: 0L))

public actual fun uStrCaseCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrCaseCompare((s1?.value ?: 0L), length1, (s2?.value ?: 0L), length2, options.toInt(), (perrorcode?.value ?: 0L))

public actual fun uStrCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrCompare((s1?.value ?: 0L), length1, (s2?.value ?: 0L), length2, codepointorder)

public actual fun uStrCompareIter(iter1: COpaquePointer?, iter2: COpaquePointer?, codepointorder: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrCompareIter((iter1?.value ?: 0L), (iter2?.value ?: 0L), codepointorder)

public actual fun uStrFindFirst(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFindFirst((s?.value ?: 0L), length, (substring?.value ?: 0L), sublength).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFindLast(s: COpaquePointer?, length: Int, substring: COpaquePointer?, sublength: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFindLast((s?.value ?: 0L), length, (substring?.value ?: 0L), sublength).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFoldCase(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFoldCase((dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, options.toInt(), (perrorcode?.value ?: 0L))

public actual fun uStrFromJavaModifiedUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromJavaModifiedUtf8WithSub((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, subchar, (pnumsubstitutions?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromUtf32((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromUtf32WithSub((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, subchar, (pnumsubstitutions?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromUtf8(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromUtf8((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromUtf8Lenient(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromUtf8Lenient((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromUtf8WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcstr, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromUtf8WithSub((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, subchar, (pnumsubstitutions?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrFromWcs(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: Pcwstr, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrFromWcs((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrHasMoreChar32Than(s: COpaquePointer?, length: Int, number: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrHasMoreChar32Than((s?.value ?: 0L), length, number)

public actual fun uStrToJavaModifiedUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToJavaModifiedUtf8((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrToLower(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToLower((dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (locale?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uStrToTitle(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, titleiter: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToTitle((dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (titleiter?.value ?: 0L), (locale?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uStrToUtf32(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToUtf32((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrToUtf32WithSub(dest: COpaquePointer?, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToUtf32WithSub((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, subchar, (pnumsubstitutions?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrToUtf8(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToUtf8((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrToUtf8WithSub(dest: Pcstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, subchar: Int, pnumsubstitutions: COpaquePointer?, perrorcode: COpaquePointer?): Pstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToUtf8WithSub((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, subchar, (pnumsubstitutions?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrToUpper(dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, locale: Pcstr, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToUpper((dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (locale?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uStrToWcs(dest: Pcwstr, destcapacity: Int, pdestlength: COpaquePointer?, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Pwstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrToWcs((dest?.value ?: 0L), destcapacity, (pdestlength?.value ?: 0L), (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrcasecmp(s1: COpaquePointer?, s2: COpaquePointer?, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcasecmp((s1?.value ?: 0L), (s2?.value ?: 0L), options.toInt())

public actual fun uStrcat(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcat((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrchr((s?.value ?: 0L), c.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrchr32((s?.value ?: 0L), c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrcmp(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcmp((s1?.value ?: 0L), (s2?.value ?: 0L))

public actual fun uStrcmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcmpCodePointOrder((s1?.value ?: 0L), (s2?.value ?: 0L))

public actual fun uStrcpy(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcpy((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrcspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrcspn((string?.value ?: 0L), (matchset?.value ?: 0L))

public actual fun uStrlen(s: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrlen((s?.value ?: 0L))

public actual fun uStrncasecmp(s1: COpaquePointer?, s2: COpaquePointer?, n: Int, options: UInt): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrncasecmp((s1?.value ?: 0L), (s2?.value ?: 0L), n, options.toInt())

public actual fun uStrncat(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrncat((dst?.value ?: 0L), (src?.value ?: 0L), n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrncmp(ucs1: COpaquePointer?, ucs2: COpaquePointer?, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrncmp((ucs1?.value ?: 0L), (ucs2?.value ?: 0L), n)

public actual fun uStrncmpCodePointOrder(s1: COpaquePointer?, s2: COpaquePointer?, n: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrncmpCodePointOrder((s1?.value ?: 0L), (s2?.value ?: 0L), n)

public actual fun uStrncpy(dst: COpaquePointer?, src: COpaquePointer?, n: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrncpy((dst?.value ?: 0L), (src?.value ?: 0L), n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrpbrk(string: COpaquePointer?, matchset: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrpbrk((string?.value ?: 0L), (matchset?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrrchr(s: COpaquePointer?, c: UShort): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrrchr((s?.value ?: 0L), c.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrrchr32(s: COpaquePointer?, c: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrrchr32((s?.value ?: 0L), c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrrstr((s?.value ?: 0L), (substring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrspn(string: COpaquePointer?, matchset: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrspn((string?.value ?: 0L), (matchset?.value ?: 0L))

public actual fun uStrstr(s: COpaquePointer?, substring: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrstr((s?.value ?: 0L), (substring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uStrtokR(src: COpaquePointer?, delim: COpaquePointer?, savestate: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uStrtokR((src?.value ?: 0L), (delim?.value ?: 0L), (savestate?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uTolower(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uTolower(c)

public actual fun uTotitle(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uTotitle(c)

public actual fun uToupper(c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uToupper(c)

public actual fun uUastrcpy(dst: COpaquePointer?, src: Pcstr): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uUastrcpy((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uUastrncpy(dst: COpaquePointer?, src: Pcstr, n: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uUastrncpy((dst?.value ?: 0L), (src?.value ?: 0L), n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uUnescape(src: Pcstr, dest: COpaquePointer?, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uUnescape((src?.value ?: 0L), (dest?.value ?: 0L), destcapacity)

public actual fun uUnescapeAt(charat: UnescapeCharAt, offset: COpaquePointer?, length: Int, context: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uUnescapeAt(0L, (offset?.value ?: 0L), length, (context?.value ?: 0L))

public actual fun uVersionFromString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVersionFromString((versionarray?.value ?: 0L), (versionstring?.value ?: 0L))
}

public actual fun uVersionFromUstring(versionarray: COpaquePointer?, versionstring: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVersionFromUstring((versionarray?.value ?: 0L), (versionstring?.value ?: 0L))
}

public actual fun uVersionToString(versionarray: COpaquePointer?, versionstring: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVersionToString((versionarray?.value ?: 0L), (versionstring?.value ?: 0L))
}

public actual fun uVformatMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVformatMessage((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (result?.value ?: 0L), resultlength, (ap?.value ?: 0L), (status?.value ?: 0L))

public actual fun uVformatMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, result: COpaquePointer?, resultlength: Int, parseerror: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVformatMessageWithError((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (result?.value ?: 0L), resultlength, (parseerror?.value ?: 0L), (ap?.value ?: 0L), (status?.value ?: 0L))

public actual fun uVparseMessage(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVparseMessage((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (source?.value ?: 0L), sourcelength, (ap?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uVparseMessageWithError(locale: Pcstr, pattern: COpaquePointer?, patternlength: Int, source: COpaquePointer?, sourcelength: Int, ap: COpaquePointer?, parseerror: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uVparseMessageWithError((locale?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (source?.value ?: 0L), sourcelength, (ap?.value ?: 0L), (parseerror?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ubidiClose(pbidi: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiClose((pbidi?.value ?: 0L))
}

public actual fun ubidiCountParagraphs(pbidi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiCountParagraphs((pbidi?.value ?: 0L))

public actual fun ubidiCountRuns(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiCountRuns((pbidi?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun ubidiGetBaseDirection(text: COpaquePointer?, length: Int): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetBaseDirection((text?.value ?: 0L), length)

public actual fun ubidiGetClassCallback(pbidi: COpaquePointer?, fn: COpaquePointer?, context: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetClassCallback((pbidi?.value ?: 0L), (fn?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun ubidiGetCustomizedClass(pbidi: COpaquePointer?, c: Int): UCharDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetCustomizedClass((pbidi?.value ?: 0L), c)

public actual fun ubidiGetDirection(pbidi: COpaquePointer?): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetDirection((pbidi?.value ?: 0L))

public actual fun ubidiGetLength(pbidi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLength((pbidi?.value ?: 0L))

public actual fun ubidiGetLevelAt(pbidi: COpaquePointer?, charindex: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLevelAt((pbidi?.value ?: 0L), charindex).toUByte()

public actual fun ubidiGetLevels(pbidi: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLevels((pbidi?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubidiGetLogicalIndex(pbidi: COpaquePointer?, visualindex: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLogicalIndex((pbidi?.value ?: 0L), visualindex, (perrorcode?.value ?: 0L))

public actual fun ubidiGetLogicalMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLogicalMap((pbidi?.value ?: 0L), (indexmap?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiGetLogicalRun(pbidi: COpaquePointer?, logicalposition: Int, plogicallimit: COpaquePointer?, plevel: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetLogicalRun((pbidi?.value ?: 0L), logicalposition, (plogicallimit?.value ?: 0L), (plevel?.value ?: 0L))
}

public actual fun ubidiGetParaLevel(pbidi: COpaquePointer?): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetParaLevel((pbidi?.value ?: 0L)).toUByte()

public actual fun ubidiGetParagraph(pbidi: COpaquePointer?, charindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetParagraph((pbidi?.value ?: 0L), charindex, (pparastart?.value ?: 0L), (pparalimit?.value ?: 0L), (pparalevel?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun ubidiGetParagraphByIndex(pbidi: COpaquePointer?, paraindex: Int, pparastart: COpaquePointer?, pparalimit: COpaquePointer?, pparalevel: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetParagraphByIndex((pbidi?.value ?: 0L), paraindex, (pparastart?.value ?: 0L), (pparalimit?.value ?: 0L), (pparalevel?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiGetProcessedLength(pbidi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetProcessedLength((pbidi?.value ?: 0L))

public actual fun ubidiGetReorderingMode(pbidi: COpaquePointer?): UBiDiReorderingMode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetReorderingMode((pbidi?.value ?: 0L))

public actual fun ubidiGetReorderingOptions(pbidi: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetReorderingOptions((pbidi?.value ?: 0L)).toUInt()

public actual fun ubidiGetResultLength(pbidi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetResultLength((pbidi?.value ?: 0L))

public actual fun ubidiGetText(pbidi: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetText((pbidi?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubidiGetVisualIndex(pbidi: COpaquePointer?, logicalindex: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetVisualIndex((pbidi?.value ?: 0L), logicalindex, (perrorcode?.value ?: 0L))

public actual fun ubidiGetVisualMap(pbidi: COpaquePointer?, indexmap: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetVisualMap((pbidi?.value ?: 0L), (indexmap?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiGetVisualRun(pbidi: COpaquePointer?, runindex: Int, plogicalstart: COpaquePointer?, plength: COpaquePointer?): UBiDiDirection =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiGetVisualRun((pbidi?.value ?: 0L), runindex, (plogicalstart?.value ?: 0L), (plength?.value ?: 0L))

public actual fun ubidiInvertMap(srcmap: COpaquePointer?, destmap: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiInvertMap((srcmap?.value ?: 0L), (destmap?.value ?: 0L), length)
}

public actual fun ubidiIsInverse(pbidi: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiIsInverse((pbidi?.value ?: 0L))

public actual fun ubidiIsOrderParagraphsLtr(pbidi: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiIsOrderParagraphsLtr((pbidi?.value ?: 0L))

public actual fun ubidiOpen(): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiOpen().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubidiOpenSized(maxlength: Int, maxruncount: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiOpenSized(maxlength, maxruncount, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubidiOrderParagraphsLtr(pbidi: COpaquePointer?, orderparagraphsltr: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiOrderParagraphsLtr((pbidi?.value ?: 0L), orderparagraphsltr)
}

public actual fun ubidiReorderLogical(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiReorderLogical((levels?.value ?: 0L), length, (indexmap?.value ?: 0L))
}

public actual fun ubidiReorderVisual(levels: COpaquePointer?, length: Int, indexmap: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiReorderVisual((levels?.value ?: 0L), length, (indexmap?.value ?: 0L))
}

public actual fun ubidiSetClassCallback(pbidi: COpaquePointer?, newfn: UBiDiClassCallback, newcontext: COpaquePointer?, oldfn: COpaquePointer?, oldcontext: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetClassCallback((pbidi?.value ?: 0L), 0L, (newcontext?.value ?: 0L), (oldfn?.value ?: 0L), (oldcontext?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiSetContext(pbidi: COpaquePointer?, prologue: COpaquePointer?, prolength: Int, epilogue: COpaquePointer?, epilength: Int, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetContext((pbidi?.value ?: 0L), (prologue?.value ?: 0L), prolength, (epilogue?.value ?: 0L), epilength, (perrorcode?.value ?: 0L))
}

public actual fun ubidiSetInverse(pbidi: COpaquePointer?, isinverse: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetInverse((pbidi?.value ?: 0L), isinverse)
}

public actual fun ubidiSetLine(pparabidi: COpaquePointer?, start: Int, limit: Int, plinebidi: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetLine((pparabidi?.value ?: 0L), start, limit, (plinebidi?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiSetPara(pbidi: COpaquePointer?, text: COpaquePointer?, length: Int, paralevel: UByte, embeddinglevels: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetPara((pbidi?.value ?: 0L), (text?.value ?: 0L), length, paralevel.toByte(), (embeddinglevels?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ubidiSetReorderingMode(pbidi: COpaquePointer?, reorderingmode: UBiDiReorderingMode) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetReorderingMode((pbidi?.value ?: 0L), reorderingmode)
}

public actual fun ubidiSetReorderingOptions(pbidi: COpaquePointer?, reorderingoptions: UInt) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiSetReorderingOptions((pbidi?.value ?: 0L), reorderingoptions.toInt())
}

public actual fun ubidiWriteReordered(pbidi: COpaquePointer?, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiWriteReordered((pbidi?.value ?: 0L), (dest?.value ?: 0L), destsize, options.toShort(), (perrorcode?.value ?: 0L))

public actual fun ubidiWriteReverse(src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, options: UShort, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubidiWriteReverse((src?.value ?: 0L), srclength, (dest?.value ?: 0L), destsize, options.toShort(), (perrorcode?.value ?: 0L))

public actual fun ubiditransformClose(pbiditransform: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransformClose((pbiditransform?.value ?: 0L))
}

public actual fun ubiditransformOpen(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransformOpen((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubiditransformTransform(pbiditransform: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destsize: Int, inparalevel: UByte, inorder: UBiDiOrder, outparalevel: UByte, outorder: UBiDiOrder, domirroring: UBiDiMirroring, shapingoptions: UInt, perrorcode: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubiditransformTransform((pbiditransform?.value ?: 0L), (src?.value ?: 0L), srclength, (dest?.value ?: 0L), destsize, inparalevel.toByte(), inorder, outparalevel.toByte(), outorder, domirroring, shapingoptions.toInt(), (perrorcode?.value ?: 0L)).toUInt()

public actual fun ublockGetCode(c: Int): UBlockCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ublockGetCode(c)

public actual fun ubrkClose(bi: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkClose((bi?.value ?: 0L))
}

public actual fun ubrkCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkCountAvailable()

public actual fun ubrkCurrent(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkCurrent((bi?.value ?: 0L))

public actual fun ubrkFirst(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkFirst((bi?.value ?: 0L))

public actual fun ubrkFollowing(bi: COpaquePointer?, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkFollowing((bi?.value ?: 0L), offset)

public actual fun ubrkGetAvailable(index: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkGetAvailable(index).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkGetBinaryRules(bi: COpaquePointer?, binaryrules: COpaquePointer?, rulescapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkGetBinaryRules((bi?.value ?: 0L), (binaryrules?.value ?: 0L), rulescapacity, (status?.value ?: 0L))

public actual fun ubrkGetLocaleByType(bi: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkGetLocaleByType((bi?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkGetRuleStatus(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkGetRuleStatus((bi?.value ?: 0L))

public actual fun ubrkGetRuleStatusVec(bi: COpaquePointer?, fillinvec: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkGetRuleStatusVec((bi?.value ?: 0L), (fillinvec?.value ?: 0L), capacity, (status?.value ?: 0L))

public actual fun ubrkIsBoundary(bi: COpaquePointer?, offset: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkIsBoundary((bi?.value ?: 0L), offset)

public actual fun ubrkLast(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkLast((bi?.value ?: 0L))

public actual fun ubrkNext(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkNext((bi?.value ?: 0L))

public actual fun ubrkOpen(type: UBreakIteratorType, locale: Pcstr, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkOpen(type, (locale?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkOpenBinaryRules(binaryrules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkOpenBinaryRules((binaryrules?.value ?: 0L), ruleslength, (text?.value ?: 0L), textlength, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkOpenRules(rules: COpaquePointer?, ruleslength: Int, text: COpaquePointer?, textlength: Int, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkOpenRules((rules?.value ?: 0L), ruleslength, (text?.value ?: 0L), textlength, (parseerr?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkPreceding(bi: COpaquePointer?, offset: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkPreceding((bi?.value ?: 0L), offset)

public actual fun ubrkPrevious(bi: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkPrevious((bi?.value ?: 0L))

public actual fun ubrkRefreshUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkRefreshUtext((bi?.value ?: 0L), (text?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ubrkSafeClone(bi: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkSafeClone((bi?.value ?: 0L), (stackbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ubrkSetText(bi: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkSetText((bi?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L))
}

public actual fun ubrkSetUtext(bi: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ubrkSetUtext((bi?.value ?: 0L), (text?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ucalAdd(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalAdd((cal?.value ?: 0L), field, amount, (status?.value ?: 0L))
}

public actual fun ucalClear(calendar: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalClear((calendar?.value ?: 0L))
}

public actual fun ucalClearField(cal: COpaquePointer?, field: UCalendarDateFields) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalClearField((cal?.value ?: 0L), field)
}

public actual fun ucalClone(cal: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalClone((cal?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalClose(cal: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalClose((cal?.value ?: 0L))
}

public actual fun ucalCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalCountAvailable()

public actual fun ucalEquivalentTo(cal1: COpaquePointer?, cal2: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalEquivalentTo((cal1?.value ?: 0L), (cal2?.value ?: 0L))

public actual fun ucalGet(cal: COpaquePointer?, field: UCalendarDateFields, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGet((cal?.value ?: 0L), field, (status?.value ?: 0L))

public actual fun ucalGetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetAttribute((cal?.value ?: 0L), attr)

public actual fun ucalGetAvailable(localeindex: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetAvailable(localeindex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalGetCanonicalTimeZoneId(id: COpaquePointer?, len: Int, result: COpaquePointer?, resultcapacity: Int, issystemid: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetCanonicalTimeZoneId((id?.value ?: 0L), len, (result?.value ?: 0L), resultcapacity, (issystemid?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucalGetDstsavings(zoneid: COpaquePointer?, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetDstsavings((zoneid?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucalGetDayOfWeekType(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): UCalendarWeekdayType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetDayOfWeekType((cal?.value ?: 0L), dayofweek, (status?.value ?: 0L))

public actual fun ucalGetDefaultTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetDefaultTimeZone((result?.value ?: 0L), resultcapacity, (ec?.value ?: 0L))

public actual fun ucalGetFieldDifference(cal: COpaquePointer?, target: Double, field: UCalendarDateFields, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetFieldDifference((cal?.value ?: 0L), target, field, (status?.value ?: 0L))

public actual fun ucalGetGregorianChange(cal: COpaquePointer?, perrorcode: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetGregorianChange((cal?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun ucalGetHostTimeZone(result: COpaquePointer?, resultcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetHostTimeZone((result?.value ?: 0L), resultcapacity, (ec?.value ?: 0L))

public actual fun ucalGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetKeywordValuesForLocale((key?.value ?: 0L), (locale?.value ?: 0L), commonlyused, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalGetLimit(cal: COpaquePointer?, field: UCalendarDateFields, type: UCalendarLimitType, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetLimit((cal?.value ?: 0L), field, type, (status?.value ?: 0L))

public actual fun ucalGetLocaleByType(cal: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetLocaleByType((cal?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalGetMillis(cal: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetMillis((cal?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucalGetNow(): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetNow()

public actual fun ucalGetTzdataVersion(status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetTzdataVersion((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalGetTimeZoneDisplayName(cal: COpaquePointer?, type: UCalendarDisplayNameType, locale: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetTimeZoneDisplayName((cal?.value ?: 0L), type, (locale?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun ucalGetTimeZoneId(cal: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetTimeZoneId((cal?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun ucalGetTimeZoneIdforWindowsId(winid: COpaquePointer?, len: Int, region: Pcstr, id: COpaquePointer?, idcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetTimeZoneIdforWindowsId((winid?.value ?: 0L), len, (region?.value ?: 0L), (id?.value ?: 0L), idcapacity, (status?.value ?: 0L))

public actual fun ucalGetTimeZoneTransitionDate(cal: COpaquePointer?, type: UTimeZoneTransitionType, transition: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetTimeZoneTransitionDate((cal?.value ?: 0L), type, (transition?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucalGetType(cal: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetType((cal?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalGetWeekendTransition(cal: COpaquePointer?, dayofweek: UCalendarDaysOfWeek, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetWeekendTransition((cal?.value ?: 0L), dayofweek, (status?.value ?: 0L))

public actual fun ucalGetWindowsTimeZoneId(id: COpaquePointer?, len: Int, winid: COpaquePointer?, winidcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalGetWindowsTimeZoneId((id?.value ?: 0L), len, (winid?.value ?: 0L), winidcapacity, (status?.value ?: 0L))

public actual fun ucalInDaylightTime(cal: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalInDaylightTime((cal?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucalIsSet(cal: COpaquePointer?, field: UCalendarDateFields): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalIsSet((cal?.value ?: 0L), field)

public actual fun ucalIsWeekend(cal: COpaquePointer?, date: Double, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalIsWeekend((cal?.value ?: 0L), date, (status?.value ?: 0L))

public actual fun ucalOpen(zoneid: COpaquePointer?, len: Int, locale: Pcstr, type: UCalendarType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalOpen((zoneid?.value ?: 0L), len, (locale?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalOpenCountryTimeZones(country: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalOpenCountryTimeZones((country?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalOpenTimeZoneIdenumeration(zonetype: USystemTimeZoneType, region: Pcstr, rawoffset: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalOpenTimeZoneIdenumeration(zonetype, (region?.value ?: 0L), (rawoffset?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalOpenTimeZones(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalOpenTimeZones((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucalRoll(cal: COpaquePointer?, field: UCalendarDateFields, amount: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalRoll((cal?.value ?: 0L), field, amount, (status?.value ?: 0L))
}

public actual fun ucalSet(cal: COpaquePointer?, field: UCalendarDateFields, value: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSet((cal?.value ?: 0L), field, value)
}

public actual fun ucalSetAttribute(cal: COpaquePointer?, attr: UCalendarAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetAttribute((cal?.value ?: 0L), attr, newvalue)
}

public actual fun ucalSetDate(cal: COpaquePointer?, year: Int, month: Int, date: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetDate((cal?.value ?: 0L), year, month, date, (status?.value ?: 0L))
}

public actual fun ucalSetDateTime(cal: COpaquePointer?, year: Int, month: Int, date: Int, hour: Int, minute: Int, second: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetDateTime((cal?.value ?: 0L), year, month, date, hour, minute, second, (status?.value ?: 0L))
}

public actual fun ucalSetDefaultTimeZone(zoneid: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetDefaultTimeZone((zoneid?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun ucalSetGregorianChange(cal: COpaquePointer?, date: Double, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetGregorianChange((cal?.value ?: 0L), date, (perrorcode?.value ?: 0L))
}

public actual fun ucalSetMillis(cal: COpaquePointer?, datetime: Double, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetMillis((cal?.value ?: 0L), datetime, (status?.value ?: 0L))
}

public actual fun ucalSetTimeZone(cal: COpaquePointer?, zoneid: COpaquePointer?, len: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucalSetTimeZone((cal?.value ?: 0L), (zoneid?.value ?: 0L), len, (status?.value ?: 0L))
}

public actual fun ucasemapClose(csm: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapClose((csm?.value ?: 0L))
}

public actual fun ucasemapGetBreakIterator(csm: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapGetBreakIterator((csm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucasemapGetLocale(csm: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapGetLocale((csm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucasemapGetOptions(csm: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapGetOptions((csm?.value ?: 0L)).toUInt()

public actual fun ucasemapOpen(locale: Pcstr, options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapOpen((locale?.value ?: 0L), options.toInt(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucasemapSetBreakIterator(csm: COpaquePointer?, itertoadopt: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapSetBreakIterator((csm?.value ?: 0L), (itertoadopt?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ucasemapSetLocale(csm: COpaquePointer?, locale: Pcstr, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapSetLocale((csm?.value ?: 0L), (locale?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ucasemapSetOptions(csm: COpaquePointer?, options: UInt, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapSetOptions((csm?.value ?: 0L), options.toInt(), (perrorcode?.value ?: 0L))
}

public actual fun ucasemapToTitle(csm: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapToTitle((csm?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucasemapUtf8FoldCase(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapUtf8FoldCase((csm?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucasemapUtf8ToLower(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapUtf8ToLower((csm?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucasemapUtf8ToTitle(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapUtf8ToTitle((csm?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucasemapUtf8ToUpper(csm: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucasemapUtf8ToUpper((csm?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucfposClose(ucfpos: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposClose((ucfpos?.value ?: 0L))
}

public actual fun ucfposConstrainCategory(ucfpos: COpaquePointer?, category: Int, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposConstrainCategory((ucfpos?.value ?: 0L), category, (ec?.value ?: 0L))
}

public actual fun ucfposConstrainField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposConstrainField((ucfpos?.value ?: 0L), category, field, (ec?.value ?: 0L))
}

public actual fun ucfposGetCategory(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposGetCategory((ucfpos?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucfposGetField(ucfpos: COpaquePointer?, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposGetField((ucfpos?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucfposGetIndexes(ucfpos: COpaquePointer?, pstart: COpaquePointer?, plimit: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposGetIndexes((ucfpos?.value ?: 0L), (pstart?.value ?: 0L), (plimit?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun ucfposGetInt64IterationContext(ucfpos: COpaquePointer?, ec: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposGetInt64IterationContext((ucfpos?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucfposMatchesField(ucfpos: COpaquePointer?, category: Int, field: Int, ec: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposMatchesField((ucfpos?.value ?: 0L), category, field, (ec?.value ?: 0L))

public actual fun ucfposOpen(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposOpen((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucfposReset(ucfpos: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposReset((ucfpos?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun ucfposSetInt64IterationContext(ucfpos: COpaquePointer?, context: Long, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposSetInt64IterationContext((ucfpos?.value ?: 0L), context, (ec?.value ?: 0L))
}

public actual fun ucfposSetState(ucfpos: COpaquePointer?, category: Int, field: Int, start: Int, limit: Int, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucfposSetState((ucfpos?.value ?: 0L), category, field, start, limit, (ec?.value ?: 0L))
}

public actual fun ucnvCbFromUwriteBytes(args: COpaquePointer?, source: Pcstr, length: Int, offsetindex: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCbFromUwriteBytes((args?.value ?: 0L), (source?.value ?: 0L), length, offsetindex, (err?.value ?: 0L))
}

public actual fun ucnvCbFromUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCbFromUwriteSub((args?.value ?: 0L), offsetindex, (err?.value ?: 0L))
}

public actual fun ucnvCbFromUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCbFromUwriteUchars((args?.value ?: 0L), (source?.value ?: 0L), (sourcelimit?.value ?: 0L), offsetindex, (err?.value ?: 0L))
}

public actual fun ucnvCbToUwriteSub(args: COpaquePointer?, offsetindex: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCbToUwriteSub((args?.value ?: 0L), offsetindex, (err?.value ?: 0L))
}

public actual fun ucnvCbToUwriteUchars(args: COpaquePointer?, source: COpaquePointer?, length: Int, offsetindex: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCbToUwriteUchars((args?.value ?: 0L), (source?.value ?: 0L), length, offsetindex, (err?.value ?: 0L))
}

public actual fun ucnvClose(converter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvClose((converter?.value ?: 0L))
}

public actual fun ucnvCompareNames(name1: Pcstr, name2: Pcstr): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCompareNames((name1?.value ?: 0L), (name2?.value ?: 0L))

public actual fun ucnvConvert(toconvertername: Pcstr, fromconvertername: Pcstr, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvConvert((toconvertername?.value ?: 0L), (fromconvertername?.value ?: 0L), (target?.value ?: 0L), targetcapacity, (source?.value ?: 0L), sourcelength, (perrorcode?.value ?: 0L))

public actual fun ucnvConvertEx(targetcnv: COpaquePointer?, sourcecnv: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: Pcstr, pivotstart: COpaquePointer?, pivotsource: COpaquePointer?, pivottarget: COpaquePointer?, pivotlimit: COpaquePointer?, reset: Byte, flush: Byte, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvConvertEx((targetcnv?.value ?: 0L), (sourcecnv?.value ?: 0L), (target?.value ?: 0L), (targetlimit?.value ?: 0L), (source?.value ?: 0L), (sourcelimit?.value ?: 0L), (pivotstart?.value ?: 0L), (pivotsource?.value ?: 0L), (pivottarget?.value ?: 0L), (pivotlimit?.value ?: 0L), reset, flush, (perrorcode?.value ?: 0L))
}

public actual fun ucnvCountAliases(alias: Pcstr, perrorcode: COpaquePointer?): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCountAliases((alias?.value ?: 0L), (perrorcode?.value ?: 0L)).toUShort()

public actual fun ucnvCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCountAvailable()

public actual fun ucnvCountStandards(): UShort =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvCountStandards().toUShort()

public actual fun ucnvDetectUnicodeSignature(source: Pcstr, sourcelength: Int, signaturelength: COpaquePointer?, perrorcode: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvDetectUnicodeSignature((source?.value ?: 0L), sourcelength, (signaturelength?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvFixFileSeparator(cnv: COpaquePointer?, source: COpaquePointer?, sourcelen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFixFileSeparator((cnv?.value ?: 0L), (source?.value ?: 0L), sourcelen)
}

public actual fun ucnvFlushCache(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFlushCache()

public actual fun ucnvFromAlgorithmic(cnv: COpaquePointer?, algorithmictype: UConverterType, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromAlgorithmic((cnv?.value ?: 0L), algorithmictype, (target?.value ?: 0L), targetcapacity, (source?.value ?: 0L), sourcelength, (perrorcode?.value ?: 0L))

public actual fun ucnvFromUchars(cnv: COpaquePointer?, dest: Pcstr, destcapacity: Int, src: COpaquePointer?, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUchars((cnv?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucnvFromUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUcountPending((cnv?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucnvFromUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: Pcstr, source: COpaquePointer?, sourcelimit: COpaquePointer?, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvFromUnicode((converter?.value ?: 0L), (target?.value ?: 0L), (targetlimit?.value ?: 0L), (source?.value ?: 0L), (sourcelimit?.value ?: 0L), (offsets?.value ?: 0L), flush, (err?.value ?: 0L))
}

public actual fun ucnvGetAlias(alias: Pcstr, n: UShort, perrorcode: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetAlias((alias?.value ?: 0L), n.toShort(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetAliases(alias: Pcstr, aliases: COpaquePointer?, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetAliases((alias?.value ?: 0L), (aliases?.value ?: 0L), (perrorcode?.value ?: 0L))
}

public actual fun ucnvGetAvailableName(n: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetAvailableName(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetCcsid(converter: COpaquePointer?, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetCcsid((converter?.value ?: 0L), (err?.value ?: 0L))

public actual fun ucnvGetCanonicalName(alias: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetCanonicalName((alias?.value ?: 0L), (standard?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetDefaultName(): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetDefaultName().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetDisplayName(converter: COpaquePointer?, displaylocale: Pcstr, displayname: COpaquePointer?, displaynamecapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetDisplayName((converter?.value ?: 0L), (displaylocale?.value ?: 0L), (displayname?.value ?: 0L), displaynamecapacity, (err?.value ?: 0L))

public actual fun ucnvGetFromUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetFromUcallBack((converter?.value ?: 0L), (action?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun ucnvGetInvalidChars(converter: COpaquePointer?, errbytes: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetInvalidChars((converter?.value ?: 0L), (errbytes?.value ?: 0L), (len?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvGetInvalidUchars(converter: COpaquePointer?, erruchars: COpaquePointer?, len: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetInvalidUchars((converter?.value ?: 0L), (erruchars?.value ?: 0L), (len?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvGetMaxCharSize(converter: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetMaxCharSize((converter?.value ?: 0L))

public actual fun ucnvGetMinCharSize(converter: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetMinCharSize((converter?.value ?: 0L))

public actual fun ucnvGetName(converter: COpaquePointer?, err: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetName((converter?.value ?: 0L), (err?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetNextUchar(converter: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetNextUchar((converter?.value ?: 0L), (source?.value ?: 0L), (sourcelimit?.value ?: 0L), (err?.value ?: 0L))

public actual fun ucnvGetPlatform(converter: COpaquePointer?, err: COpaquePointer?): UConverterPlatform =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetPlatform((converter?.value ?: 0L), (err?.value ?: 0L))

public actual fun ucnvGetStandard(n: UShort, perrorcode: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetStandard(n.toShort(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetStandardName(name: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetStandardName((name?.value ?: 0L), (standard?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvGetStarters(converter: COpaquePointer?, starters: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetStarters((converter?.value ?: 0L), (starters?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvGetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetSubstChars((converter?.value ?: 0L), (subchars?.value ?: 0L), (len?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvGetToUcallBack(converter: COpaquePointer?, action: COpaquePointer?, context: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetToUcallBack((converter?.value ?: 0L), (action?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun ucnvGetType(converter: COpaquePointer?): UConverterType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetType((converter?.value ?: 0L))

public actual fun ucnvGetUnicodeSet(cnv: COpaquePointer?, setfillin: COpaquePointer?, whichset: UConverterUnicodeSet, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvGetUnicodeSet((cnv?.value ?: 0L), (setfillin?.value ?: 0L), whichset, (perrorcode?.value ?: 0L))
}

public actual fun ucnvIsAmbiguous(cnv: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvIsAmbiguous((cnv?.value ?: 0L))

public actual fun ucnvIsFixedWidth(cnv: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvIsFixedWidth((cnv?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucnvOpen(convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpen((convertername?.value ?: 0L), (err?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvOpenAllNames(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpenAllNames((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvOpenCcsid(codepage: Int, platform: UConverterPlatform, err: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpenCcsid(codepage, platform, (err?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvOpenPackage(packagename: Pcstr, convertername: Pcstr, err: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpenPackage((packagename?.value ?: 0L), (convertername?.value ?: 0L), (err?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvOpenStandardNames(convname: Pcstr, standard: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpenStandardNames((convname?.value ?: 0L), (standard?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvOpenU(name: COpaquePointer?, err: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvOpenU((name?.value ?: 0L), (err?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvReset(converter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvReset((converter?.value ?: 0L))
}

public actual fun ucnvResetFromUnicode(converter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvResetFromUnicode((converter?.value ?: 0L))
}

public actual fun ucnvResetToUnicode(converter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvResetToUnicode((converter?.value ?: 0L))
}

public actual fun ucnvSafeClone(cnv: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSafeClone((cnv?.value ?: 0L), (stackbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvSetDefaultName(name: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetDefaultName((name?.value ?: 0L))
}

public actual fun ucnvSetFallback(cnv: COpaquePointer?, usesfallback: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetFallback((cnv?.value ?: 0L), usesfallback)
}

public actual fun ucnvSetFromUcallBack(converter: COpaquePointer?, newaction: UConverterFromUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetFromUcallBack((converter?.value ?: 0L), 0L, (newcontext?.value ?: 0L), (oldaction?.value ?: 0L), (oldcontext?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvSetSubstChars(converter: COpaquePointer?, subchars: Pcstr, len: Byte, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetSubstChars((converter?.value ?: 0L), (subchars?.value ?: 0L), len, (err?.value ?: 0L))
}

public actual fun ucnvSetSubstString(cnv: COpaquePointer?, s: COpaquePointer?, length: Int, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetSubstString((cnv?.value ?: 0L), (s?.value ?: 0L), length, (err?.value ?: 0L))
}

public actual fun ucnvSetToUcallBack(converter: COpaquePointer?, newaction: UConverterToUCallback, newcontext: COpaquePointer?, oldaction: COpaquePointer?, oldcontext: COpaquePointer?, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvSetToUcallBack((converter?.value ?: 0L), 0L, (newcontext?.value ?: 0L), (oldaction?.value ?: 0L), (oldcontext?.value ?: 0L), (err?.value ?: 0L))
}

public actual fun ucnvToAlgorithmic(algorithmictype: UConverterType, cnv: COpaquePointer?, target: Pcstr, targetcapacity: Int, source: Pcstr, sourcelength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToAlgorithmic(algorithmictype, (cnv?.value ?: 0L), (target?.value ?: 0L), targetcapacity, (source?.value ?: 0L), sourcelength, (perrorcode?.value ?: 0L))

public actual fun ucnvToUchars(cnv: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, src: Pcstr, srclength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUchars((cnv?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (src?.value ?: 0L), srclength, (perrorcode?.value ?: 0L))

public actual fun ucnvToUcountPending(cnv: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUcountPending((cnv?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucnvToUnicode(converter: COpaquePointer?, target: COpaquePointer?, targetlimit: COpaquePointer?, source: COpaquePointer?, sourcelimit: Pcstr, offsets: COpaquePointer?, flush: Byte, err: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvToUnicode((converter?.value ?: 0L), (target?.value ?: 0L), (targetlimit?.value ?: 0L), (source?.value ?: 0L), (sourcelimit?.value ?: 0L), (offsets?.value ?: 0L), flush, (err?.value ?: 0L))
}

public actual fun ucnvUsesFallback(cnv: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvUsesFallback((cnv?.value ?: 0L))

public actual fun ucnvselClose(sel: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselClose((sel?.value ?: 0L))
}

public actual fun ucnvselOpen(converterlist: COpaquePointer?, converterlistsize: Int, excludedcodepoints: COpaquePointer?, whichset: UConverterUnicodeSet, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselOpen((converterlist?.value ?: 0L), converterlistsize, (excludedcodepoints?.value ?: 0L), whichset, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvselOpenFromSerialized(buffer: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselOpenFromSerialized((buffer?.value ?: 0L), length, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvselSelectForString(sel: COpaquePointer?, s: COpaquePointer?, length: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselSelectForString((sel?.value ?: 0L), (s?.value ?: 0L), length, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvselSelectForUtf8(sel: COpaquePointer?, s: Pcstr, length: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselSelectForUtf8((sel?.value ?: 0L), (s?.value ?: 0L), length, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucnvselSerialize(sel: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucnvselSerialize((sel?.value ?: 0L), (buffer?.value ?: 0L), buffercapacity, (status?.value ?: 0L))

public actual fun ucolCloneBinary(coll: COpaquePointer?, buffer: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolCloneBinary((coll?.value ?: 0L), (buffer?.value ?: 0L), capacity, (status?.value ?: 0L))

public actual fun ucolClose(coll: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolClose((coll?.value ?: 0L))
}

public actual fun ucolCloseElements(elems: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolCloseElements((elems?.value ?: 0L))
}

public actual fun ucolCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolCountAvailable()

public actual fun ucolEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolEqual((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (target?.value ?: 0L), targetlength)

public actual fun ucolGetAttribute(coll: COpaquePointer?, attr: UColAttribute, status: COpaquePointer?): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetAttribute((coll?.value ?: 0L), attr, (status?.value ?: 0L))

public actual fun ucolGetAvailable(localeindex: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetAvailable(localeindex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetBound(source: COpaquePointer?, sourcelength: Int, boundtype: UColBoundMode, nooflevels: UInt, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetBound((source?.value ?: 0L), sourcelength, boundtype, nooflevels.toInt(), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun ucolGetContractionsAndExpansions(coll: COpaquePointer?, contractions: COpaquePointer?, expansions: COpaquePointer?, addprefixes: Byte, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetContractionsAndExpansions((coll?.value ?: 0L), (contractions?.value ?: 0L), (expansions?.value ?: 0L), addprefixes, (status?.value ?: 0L))
}

public actual fun ucolGetDisplayName(objloc: Pcstr, disploc: Pcstr, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetDisplayName((objloc?.value ?: 0L), (disploc?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun ucolGetEquivalentReorderCodes(reordercode: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetEquivalentReorderCodes(reordercode, (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun ucolGetFunctionalEquivalent(result: Pcstr, resultcapacity: Int, keyword: Pcstr, locale: Pcstr, isavailable: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetFunctionalEquivalent((result?.value ?: 0L), resultcapacity, (keyword?.value ?: 0L), (locale?.value ?: 0L), (isavailable?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucolGetKeywordValues(keyword: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetKeywordValues((keyword?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetKeywordValuesForLocale((key?.value ?: 0L), (locale?.value ?: 0L), commonlyused, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetKeywords(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetKeywords((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetLocaleByType(coll: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetLocaleByType((coll?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetMaxExpansion(elems: COpaquePointer?, order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetMaxExpansion((elems?.value ?: 0L), order)

public actual fun ucolGetMaxVariable(coll: COpaquePointer?): UColReorderCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetMaxVariable((coll?.value ?: 0L))

public actual fun ucolGetOffset(elems: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetOffset((elems?.value ?: 0L))

public actual fun ucolGetReorderCodes(coll: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetReorderCodes((coll?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun ucolGetRules(coll: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetRules((coll?.value ?: 0L), (length?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetRulesEx(coll: COpaquePointer?, delta: UColRuleOption, buffer: COpaquePointer?, bufferlen: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetRulesEx((coll?.value ?: 0L), delta, (buffer?.value ?: 0L), bufferlen)

public actual fun ucolGetSortKey(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, result: COpaquePointer?, resultlength: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetSortKey((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (result?.value ?: 0L), resultlength)

public actual fun ucolGetStrength(coll: COpaquePointer?): UColAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetStrength((coll?.value ?: 0L))

public actual fun ucolGetTailoredSet(coll: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetTailoredSet((coll?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolGetUcaversion(coll: COpaquePointer?, info: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetUcaversion((coll?.value ?: 0L), (info?.value ?: 0L))
}

public actual fun ucolGetVariableTop(coll: COpaquePointer?, status: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetVariableTop((coll?.value ?: 0L), (status?.value ?: 0L)).toUInt()

public actual fun ucolGetVersion(coll: COpaquePointer?, info: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGetVersion((coll?.value ?: 0L), (info?.value ?: 0L))
}

public actual fun ucolGreater(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGreater((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (target?.value ?: 0L), targetlength)

public actual fun ucolGreaterOrEqual(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolGreaterOrEqual((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (target?.value ?: 0L), targetlength)

public actual fun ucolKeyHashCode(key: COpaquePointer?, length: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolKeyHashCode((key?.value ?: 0L), length)

public actual fun ucolMergeSortkeys(src1: COpaquePointer?, src1length: Int, src2: COpaquePointer?, src2length: Int, dest: COpaquePointer?, destcapacity: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolMergeSortkeys((src1?.value ?: 0L), src1length, (src2?.value ?: 0L), src2length, (dest?.value ?: 0L), destcapacity)

public actual fun ucolNext(elems: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolNext((elems?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucolNextSortKeyPart(coll: COpaquePointer?, iter: COpaquePointer?, state: COpaquePointer?, dest: COpaquePointer?, count: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolNextSortKeyPart((coll?.value ?: 0L), (iter?.value ?: 0L), (state?.value ?: 0L), (dest?.value ?: 0L), count, (status?.value ?: 0L))

public actual fun ucolOpen(loc: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolOpen((loc?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolOpenAvailableLocales(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolOpenAvailableLocales((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolOpenBinary(bin: COpaquePointer?, length: Int, base: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolOpenBinary((bin?.value ?: 0L), length, (base?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolOpenElements(coll: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolOpenElements((coll?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolOpenRules(rules: COpaquePointer?, ruleslength: Int, normalizationmode: UColAttributeValue, strength: UColAttributeValue, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolOpenRules((rules?.value ?: 0L), ruleslength, normalizationmode, strength, (parseerror?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolPrevious(elems: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolPrevious((elems?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucolPrimaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolPrimaryOrder(order)

public actual fun ucolReset(elems: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolReset((elems?.value ?: 0L))
}

public actual fun ucolSafeClone(coll: COpaquePointer?, stackbuffer: COpaquePointer?, pbuffersize: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSafeClone((coll?.value ?: 0L), (stackbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucolSecondaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSecondaryOrder(order)

public actual fun ucolSetAttribute(coll: COpaquePointer?, attr: UColAttribute, value: UColAttributeValue, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetAttribute((coll?.value ?: 0L), attr, value, (status?.value ?: 0L))
}

public actual fun ucolSetMaxVariable(coll: COpaquePointer?, group: UColReorderCode, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetMaxVariable((coll?.value ?: 0L), group, (perrorcode?.value ?: 0L))
}

public actual fun ucolSetOffset(elems: COpaquePointer?, offset: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetOffset((elems?.value ?: 0L), offset, (status?.value ?: 0L))
}

public actual fun ucolSetReorderCodes(coll: COpaquePointer?, reordercodes: COpaquePointer?, reordercodeslength: Int, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetReorderCodes((coll?.value ?: 0L), (reordercodes?.value ?: 0L), reordercodeslength, (perrorcode?.value ?: 0L))
}

public actual fun ucolSetStrength(coll: COpaquePointer?, strength: UColAttributeValue) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetStrength((coll?.value ?: 0L), strength)
}

public actual fun ucolSetText(elems: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolSetText((elems?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L))
}

public actual fun ucolStrcoll(coll: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, target: COpaquePointer?, targetlength: Int): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolStrcoll((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (target?.value ?: 0L), targetlength)

public actual fun ucolStrcollIter(coll: COpaquePointer?, siter: COpaquePointer?, titer: COpaquePointer?, status: COpaquePointer?): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolStrcollIter((coll?.value ?: 0L), (siter?.value ?: 0L), (titer?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucolStrcollUtf8(coll: COpaquePointer?, source: Pcstr, sourcelength: Int, target: Pcstr, targetlength: Int, status: COpaquePointer?): UCollationResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolStrcollUtf8((coll?.value ?: 0L), (source?.value ?: 0L), sourcelength, (target?.value ?: 0L), targetlength, (status?.value ?: 0L))

public actual fun ucolTertiaryOrder(order: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucolTertiaryOrder(order)

public actual fun ucpmapGet(map: COpaquePointer?, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucpmapGet((map?.value ?: 0L), c).toUInt()

public actual fun ucpmapGetRange(map: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucpmapGetRange((map?.value ?: 0L), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L), (context?.value ?: 0L), (pvalue?.value ?: 0L))

public actual fun ucptrieClose(trie: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieClose((trie?.value ?: 0L))
}

public actual fun ucptrieGet(trie: COpaquePointer?, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieGet((trie?.value ?: 0L), c).toUInt()

public actual fun ucptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieGetRange((trie?.value ?: 0L), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L), (context?.value ?: 0L), (pvalue?.value ?: 0L))

public actual fun ucptrieGetType(trie: COpaquePointer?): UCPTrieType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieGetType((trie?.value ?: 0L))

public actual fun ucptrieGetValueWidth(trie: COpaquePointer?): UCPTrieValueWidth =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieGetValueWidth((trie?.value ?: 0L))

public actual fun ucptrieInternalSmallIndex(trie: COpaquePointer?, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieInternalSmallIndex((trie?.value ?: 0L), c)

public actual fun ucptrieInternalSmallU8Index(trie: COpaquePointer?, lt1: Int, t2: UByte, t3: UByte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieInternalSmallU8Index((trie?.value ?: 0L), lt1, t2.toByte(), t3.toByte())

public actual fun ucptrieInternalU8PrevIndex(trie: COpaquePointer?, c: Int, start: COpaquePointer?, src: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieInternalU8PrevIndex((trie?.value ?: 0L), c, (start?.value ?: 0L), (src?.value ?: 0L))

public actual fun ucptrieOpenFromBinary(type: UCPTrieType, valuewidth: UCPTrieValueWidth, data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieOpenFromBinary(type, valuewidth, (data?.value ?: 0L), length, (pactuallength?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucptrieToBinary(trie: COpaquePointer?, data: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucptrieToBinary((trie?.value ?: 0L), (data?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun ucsdetClose(ucsd: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetClose((ucsd?.value ?: 0L))
}

public actual fun ucsdetDetect(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetDetect((ucsd?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetDetectAll(ucsd: COpaquePointer?, matchesfound: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetDetectAll((ucsd?.value ?: 0L), (matchesfound?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetEnableInputFilter(ucsd: COpaquePointer?, filter: Byte): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetEnableInputFilter((ucsd?.value ?: 0L), filter)

public actual fun ucsdetGetAllDetectableCharsets(ucsd: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetGetAllDetectableCharsets((ucsd?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetGetConfidence(ucsm: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetGetConfidence((ucsm?.value ?: 0L), (status?.value ?: 0L))

public actual fun ucsdetGetLanguage(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetGetLanguage((ucsm?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetGetName(ucsm: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetGetName((ucsm?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetGetUchars(ucsm: COpaquePointer?, buf: COpaquePointer?, cap: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetGetUchars((ucsm?.value ?: 0L), (buf?.value ?: 0L), cap, (status?.value ?: 0L))

public actual fun ucsdetIsInputFilterEnabled(ucsd: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetIsInputFilterEnabled((ucsd?.value ?: 0L))

public actual fun ucsdetOpen(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetOpen((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucsdetSetDeclaredEncoding(ucsd: COpaquePointer?, encoding: Pcstr, length: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetSetDeclaredEncoding((ucsd?.value ?: 0L), (encoding?.value ?: 0L), length, (status?.value ?: 0L))
}

public actual fun ucsdetSetText(ucsd: COpaquePointer?, textin: Pcstr, len: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucsdetSetText((ucsd?.value ?: 0L), (textin?.value ?: 0L), len, (status?.value ?: 0L))
}

public actual fun ucurrCountCurrencies(locale: Pcstr, date: Double, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrCountCurrencies((locale?.value ?: 0L), date, (ec?.value ?: 0L))

public actual fun ucurrForLocale(locale: Pcstr, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrForLocale((locale?.value ?: 0L), (buff?.value ?: 0L), buffcapacity, (ec?.value ?: 0L))

public actual fun ucurrForLocaleAndDate(locale: Pcstr, date: Double, index: Int, buff: COpaquePointer?, buffcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrForLocaleAndDate((locale?.value ?: 0L), date, index, (buff?.value ?: 0L), buffcapacity, (ec?.value ?: 0L))

public actual fun ucurrGetDefaultFractionDigits(currency: COpaquePointer?, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigits((currency?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucurrGetDefaultFractionDigitsForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetDefaultFractionDigitsForUsage((currency?.value ?: 0L), usage, (ec?.value ?: 0L))

public actual fun ucurrGetKeywordValuesForLocale(key: Pcstr, locale: Pcstr, commonlyused: Byte, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetKeywordValuesForLocale((key?.value ?: 0L), (locale?.value ?: 0L), commonlyused, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucurrGetName(currency: COpaquePointer?, locale: Pcstr, namestyle: UCurrNameStyle, ischoiceformat: COpaquePointer?, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetName((currency?.value ?: 0L), (locale?.value ?: 0L), namestyle, (ischoiceformat?.value ?: 0L), (len?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucurrGetNumericCode(currency: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetNumericCode((currency?.value ?: 0L))

public actual fun ucurrGetPluralName(currency: COpaquePointer?, locale: Pcstr, ischoiceformat: COpaquePointer?, pluralcount: Pcstr, len: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetPluralName((currency?.value ?: 0L), (locale?.value ?: 0L), (ischoiceformat?.value ?: 0L), (pluralcount?.value ?: 0L), (len?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucurrGetRoundingIncrement(currency: COpaquePointer?, ec: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetRoundingIncrement((currency?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ucurrGetRoundingIncrementForUsage(currency: COpaquePointer?, usage: UCurrencyUsage, ec: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrGetRoundingIncrementForUsage((currency?.value ?: 0L), usage, (ec?.value ?: 0L))

public actual fun ucurrIsAvailable(isocode: COpaquePointer?, from: Double, to: Double, errorcode: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrIsAvailable((isocode?.value ?: 0L), from, to, (errorcode?.value ?: 0L))

public actual fun ucurrOpenIsocurrencies(currtype: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrOpenIsocurrencies(currtype.toInt(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucurrRegister(isocode: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrRegister((isocode?.value ?: 0L), (locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ucurrUnregister(key: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ucurrUnregister((key?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatAdoptNumberFormat(fmt: COpaquePointer?, numberformattoadopt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatAdoptNumberFormat((fmt?.value ?: 0L), (numberformattoadopt?.value ?: 0L))
}

public actual fun udatAdoptNumberFormatForFields(fmt: COpaquePointer?, fields: COpaquePointer?, numberformattoset: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatAdoptNumberFormatForFields((fmt?.value ?: 0L), (fields?.value ?: 0L), (numberformattoset?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun udatApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatApplyPattern((format?.value ?: 0L), localized, (pattern?.value ?: 0L), patternlength)
}

public actual fun udatClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatClone((fmt?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatClose(format: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatClose((format?.value ?: 0L))
}

public actual fun udatCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatCountAvailable()

public actual fun udatCountSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatCountSymbols((fmt?.value ?: 0L), type)

public actual fun udatFormat(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatFormat((format?.value ?: 0L), datetoformat, (result?.value ?: 0L), resultlength, (position?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatFormatCalendar(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatFormatCalendar((format?.value ?: 0L), (calendar?.value ?: 0L), (result?.value ?: 0L), capacity, (position?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatFormatCalendarForFields(format: COpaquePointer?, calendar: COpaquePointer?, result: COpaquePointer?, capacity: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatFormatCalendarForFields((format?.value ?: 0L), (calendar?.value ?: 0L), (result?.value ?: 0L), capacity, (fpositer?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatFormatForFields(format: COpaquePointer?, datetoformat: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatFormatForFields((format?.value ?: 0L), datetoformat, (result?.value ?: 0L), resultlength, (fpositer?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatGet2DigitYearStart(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGet2DigitYearStart((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatGetAvailable(localeindex: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetAvailable(localeindex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatGetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetBooleanAttribute((fmt?.value ?: 0L), attr, (status?.value ?: 0L))

public actual fun udatGetCalendar(fmt: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetCalendar((fmt?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetContext((fmt?.value ?: 0L), type, (status?.value ?: 0L))

public actual fun udatGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetLocaleByType((fmt?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatGetNumberFormat(fmt: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetNumberFormat((fmt?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatGetNumberFormatForField(fmt: COpaquePointer?, field: UShort): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetNumberFormatForField((fmt?.value ?: 0L), field.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatGetSymbols(fmt: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatGetSymbols((fmt?.value ?: 0L), type, symbolindex, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun udatIsLenient(fmt: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatIsLenient((fmt?.value ?: 0L))

public actual fun udatOpen(timestyle: UDateFormatStyle, datestyle: UDateFormatStyle, locale: Pcstr, tzid: COpaquePointer?, tzidlength: Int, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatOpen(timestyle, datestyle, (locale?.value ?: 0L), (tzid?.value ?: 0L), tzidlength, (pattern?.value ?: 0L), patternlength, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatParse(format: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatParse((format?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L))

public actual fun udatParseCalendar(format: COpaquePointer?, calendar: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatParseCalendar((format?.value ?: 0L), (calendar?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun udatSet2DigitYearStart(fmt: COpaquePointer?, d: Double, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSet2DigitYearStart((fmt?.value ?: 0L), d, (status?.value ?: 0L))
}

public actual fun udatSetBooleanAttribute(fmt: COpaquePointer?, attr: UDateFormatBooleanAttribute, newvalue: Byte, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetBooleanAttribute((fmt?.value ?: 0L), attr, newvalue, (status?.value ?: 0L))
}

public actual fun udatSetCalendar(fmt: COpaquePointer?, calendartoset: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetCalendar((fmt?.value ?: 0L), (calendartoset?.value ?: 0L))
}

public actual fun udatSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetContext((fmt?.value ?: 0L), value, (status?.value ?: 0L))
}

public actual fun udatSetLenient(fmt: COpaquePointer?, islenient: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetLenient((fmt?.value ?: 0L), islenient)
}

public actual fun udatSetNumberFormat(fmt: COpaquePointer?, numberformattoset: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetNumberFormat((fmt?.value ?: 0L), (numberformattoset?.value ?: 0L))
}

public actual fun udatSetSymbols(format: COpaquePointer?, type: UDateFormatSymbolType, symbolindex: Int, value: COpaquePointer?, valuelength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatSetSymbols((format?.value ?: 0L), type, symbolindex, (value?.value ?: 0L), valuelength, (status?.value ?: 0L))
}

public actual fun udatToCalendarDateField(field: UDateFormatField): UCalendarDateFields =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatToCalendarDateField(field)

public actual fun udatToPattern(fmt: COpaquePointer?, localized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatToPattern((fmt?.value ?: 0L), localized, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun udatpgAddPattern(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, override: Byte, conflictingpattern: COpaquePointer?, capacity: Int, plength: COpaquePointer?, perrorcode: COpaquePointer?): UDateTimePatternConflict =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgAddPattern((dtpg?.value ?: 0L), (pattern?.value ?: 0L), patternlength, override, (conflictingpattern?.value ?: 0L), capacity, (plength?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun udatpgClone(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgClone((dtpg?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgClose(dtpg: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgClose((dtpg?.value ?: 0L))
}

public actual fun udatpgGetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetAppendItemFormat((dtpg?.value ?: 0L), field, (plength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgGetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, plength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetAppendItemName((dtpg?.value ?: 0L), field, (plength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgGetBaseSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, baseskeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetBaseSkeleton((unuseddtpg?.value ?: 0L), (pattern?.value ?: 0L), length, (baseskeleton?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun udatpgGetBestPattern(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetBestPattern((dtpg?.value ?: 0L), (skeleton?.value ?: 0L), length, (bestpattern?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun udatpgGetBestPatternWithOptions(dtpg: COpaquePointer?, skeleton: COpaquePointer?, length: Int, options: UDateTimePatternMatchOptions, bestpattern: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetBestPatternWithOptions((dtpg?.value ?: 0L), (skeleton?.value ?: 0L), length, options, (bestpattern?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun udatpgGetDateTimeFormat(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetDateTimeFormat((dtpg?.value ?: 0L), (plength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgGetDecimal(dtpg: COpaquePointer?, plength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetDecimal((dtpg?.value ?: 0L), (plength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgGetFieldDisplayName(dtpg: COpaquePointer?, field: UDateTimePatternField, width: UDateTimePGDisplayWidth, fieldname: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetFieldDisplayName((dtpg?.value ?: 0L), field, width, (fieldname?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun udatpgGetPatternForSkeleton(dtpg: COpaquePointer?, skeleton: COpaquePointer?, skeletonlength: Int, plength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetPatternForSkeleton((dtpg?.value ?: 0L), (skeleton?.value ?: 0L), skeletonlength, (plength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgGetSkeleton(unuseddtpg: COpaquePointer?, pattern: COpaquePointer?, length: Int, skeleton: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgGetSkeleton((unuseddtpg?.value ?: 0L), (pattern?.value ?: 0L), length, (skeleton?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun udatpgOpen(locale: Pcstr, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgOpen((locale?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgOpenBaseSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgOpenBaseSkeletons((dtpg?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgOpenEmpty(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgOpenEmpty((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgOpenSkeletons(dtpg: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgOpenSkeletons((dtpg?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udatpgReplaceFieldTypes(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgReplaceFieldTypes((dtpg?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (skeleton?.value ?: 0L), skeletonlength, (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun udatpgReplaceFieldTypesWithOptions(dtpg: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, skeleton: COpaquePointer?, skeletonlength: Int, options: UDateTimePatternMatchOptions, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgReplaceFieldTypesWithOptions((dtpg?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (skeleton?.value ?: 0L), skeletonlength, options, (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun udatpgSetAppendItemFormat(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgSetAppendItemFormat((dtpg?.value ?: 0L), field, (value?.value ?: 0L), length)
}

public actual fun udatpgSetAppendItemName(dtpg: COpaquePointer?, field: UDateTimePatternField, value: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgSetAppendItemName((dtpg?.value ?: 0L), field, (value?.value ?: 0L), length)
}

public actual fun udatpgSetDateTimeFormat(dtpg: COpaquePointer?, dtformat: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgSetDateTimeFormat((dtpg?.value ?: 0L), (dtformat?.value ?: 0L), length)
}

public actual fun udatpgSetDecimal(dtpg: COpaquePointer?, decimal: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udatpgSetDecimal((dtpg?.value ?: 0L), (decimal?.value ?: 0L), length)
}

public actual fun udtitvfmtClose(formatter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtClose((formatter?.value ?: 0L))
}

public actual fun udtitvfmtCloseResult(uresult: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtCloseResult((uresult?.value ?: 0L))
}

public actual fun udtitvfmtFormat(formatter: COpaquePointer?, fromdate: Double, todate: Double, result: COpaquePointer?, resultcapacity: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtFormat((formatter?.value ?: 0L), fromdate, todate, (result?.value ?: 0L), resultcapacity, (position?.value ?: 0L), (status?.value ?: 0L))

public actual fun udtitvfmtOpen(locale: Pcstr, skeleton: COpaquePointer?, skeletonlength: Int, tzid: COpaquePointer?, tzidlength: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtOpen((locale?.value ?: 0L), (skeleton?.value ?: 0L), skeletonlength, (tzid?.value ?: 0L), tzidlength, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udtitvfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtOpenResult((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun udtitvfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_udtitvfmtResultAsValue((uresult?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uenumClose(en: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumClose((en?.value ?: 0L))
}

public actual fun uenumCount(en: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumCount((en?.value ?: 0L), (status?.value ?: 0L))

public actual fun uenumNext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumNext((en?.value ?: 0L), (resultlength?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uenumOpenCharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumOpenCharStringsEnumeration((strings?.value ?: 0L), count, (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uenumOpenUcharStringsEnumeration(strings: COpaquePointer?, count: Int, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumOpenUcharStringsEnumeration((strings?.value ?: 0L), count, (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uenumReset(en: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumReset((en?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uenumUnext(en: COpaquePointer?, resultlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uenumUnext((en?.value ?: 0L), (resultlength?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufieldpositerClose(fpositer: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositerClose((fpositer?.value ?: 0L))
}

public actual fun ufieldpositerNext(fpositer: COpaquePointer?, beginindex: COpaquePointer?, endindex: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositerNext((fpositer?.value ?: 0L), (beginindex?.value ?: 0L), (endindex?.value ?: 0L))

public actual fun ufieldpositerOpen(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufieldpositerOpen((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtClose(fmt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtClose((fmt?.value ?: 0L))
}

public actual fun ufmtGetArrayItemByIndex(fmt: COpaquePointer?, n: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetArrayItemByIndex((fmt?.value ?: 0L), n, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtGetArrayLength(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetArrayLength((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetDate(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetDate((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetDecNumChars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetDecNumChars((fmt?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtGetDouble(fmt: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetDouble((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetInt64(fmt: COpaquePointer?, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetInt64((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetLong(fmt: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetLong((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetObject(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetObject((fmt?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtGetType(fmt: COpaquePointer?, status: COpaquePointer?): UFormattableType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetType((fmt?.value ?: 0L), (status?.value ?: 0L))

public actual fun ufmtGetUchars(fmt: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtGetUchars((fmt?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtIsNumeric(fmt: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtIsNumeric((fmt?.value ?: 0L))

public actual fun ufmtOpen(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtOpen((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtvalGetString(ufmtval: COpaquePointer?, plength: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtvalGetString((ufmtval?.value ?: 0L), (plength?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ufmtvalNextPosition(ufmtval: COpaquePointer?, ucfpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ufmtvalNextPosition((ufmtval?.value ?: 0L), (ucfpos?.value ?: 0L), (ec?.value ?: 0L))

public actual fun ugenderGetInstance(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ugenderGetInstance((locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ugenderGetListGender(genderinfo: COpaquePointer?, genders: COpaquePointer?, size: Int, status: COpaquePointer?): UGender =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ugenderGetListGender((genderinfo?.value ?: 0L), (genders?.value ?: 0L), size, (status?.value ?: 0L))

public actual fun uidnaClose(idna: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaClose((idna?.value ?: 0L))
}

public actual fun uidnaLabelToAscii(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaLabelToAscii((idna?.value ?: 0L), (label?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaLabelToAsciiUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaLabelToAsciiUtf8((idna?.value ?: 0L), (label?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaLabelToUnicode(idna: COpaquePointer?, label: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaLabelToUnicode((idna?.value ?: 0L), (label?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaLabelToUnicodeUtf8(idna: COpaquePointer?, label: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaLabelToUnicodeUtf8((idna?.value ?: 0L), (label?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaNameToAscii(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaNameToAscii((idna?.value ?: 0L), (name?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaNameToAsciiUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaNameToAsciiUtf8((idna?.value ?: 0L), (name?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaNameToUnicode(idna: COpaquePointer?, name: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaNameToUnicode((idna?.value ?: 0L), (name?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaNameToUnicodeUtf8(idna: COpaquePointer?, name: Pcstr, length: Int, dest: Pcstr, capacity: Int, pinfo: COpaquePointer?, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaNameToUnicodeUtf8((idna?.value ?: 0L), (name?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (pinfo?.value ?: 0L), (perrorcode?.value ?: 0L))

public actual fun uidnaOpenUts46(options: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uidnaOpenUts46(options.toInt(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uiterCurrent32(iter: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterCurrent32((iter?.value ?: 0L))

public actual fun uiterGetState(iter: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterGetState((iter?.value ?: 0L)).toUInt()

public actual fun uiterNext32(iter: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterNext32((iter?.value ?: 0L))

public actual fun uiterPrevious32(iter: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterPrevious32((iter?.value ?: 0L))

public actual fun uiterSetState(iter: COpaquePointer?, state: UInt, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterSetState((iter?.value ?: 0L), state.toInt(), (perrorcode?.value ?: 0L))
}

public actual fun uiterSetString(iter: COpaquePointer?, s: COpaquePointer?, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterSetString((iter?.value ?: 0L), (s?.value ?: 0L), length)
}

public actual fun uiterSetUtf16Be(iter: COpaquePointer?, s: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterSetUtf16Be((iter?.value ?: 0L), (s?.value ?: 0L), length)
}

public actual fun uiterSetUtf8(iter: COpaquePointer?, s: Pcstr, length: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uiterSetUtf8((iter?.value ?: 0L), (s?.value ?: 0L), length)
}

public actual fun uldnClose(ldn: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnClose((ldn?.value ?: 0L))
}

public actual fun uldnGetContext(ldn: COpaquePointer?, type: UDisplayContextType, perrorcode: COpaquePointer?): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnGetContext((ldn?.value ?: 0L), type, (perrorcode?.value ?: 0L))

public actual fun uldnGetDialectHandling(ldn: COpaquePointer?): UDialectHandling =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnGetDialectHandling((ldn?.value ?: 0L))

public actual fun uldnGetLocale(ldn: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnGetLocale((ldn?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uldnKeyDisplayName(ldn: COpaquePointer?, key: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnKeyDisplayName((ldn?.value ?: 0L), (key?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnKeyValueDisplayName(ldn: COpaquePointer?, key: Pcstr, value: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnKeyValueDisplayName((ldn?.value ?: 0L), (key?.value ?: 0L), (value?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnLanguageDisplayName(ldn: COpaquePointer?, lang: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnLanguageDisplayName((ldn?.value ?: 0L), (lang?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnLocaleDisplayName(ldn: COpaquePointer?, locale: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnLocaleDisplayName((ldn?.value ?: 0L), (locale?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnOpen(locale: Pcstr, dialecthandling: UDialectHandling, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnOpen((locale?.value ?: 0L), dialecthandling, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uldnOpenForContext(locale: Pcstr, contexts: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnOpenForContext((locale?.value ?: 0L), (contexts?.value ?: 0L), length, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uldnRegionDisplayName(ldn: COpaquePointer?, region: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnRegionDisplayName((ldn?.value ?: 0L), (region?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnScriptCodeDisplayName(ldn: COpaquePointer?, scriptcode: UScriptCode, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnScriptCodeDisplayName((ldn?.value ?: 0L), scriptcode, (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnScriptDisplayName(ldn: COpaquePointer?, script: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnScriptDisplayName((ldn?.value ?: 0L), (script?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun uldnVariantDisplayName(ldn: COpaquePointer?, variant: Pcstr, result: COpaquePointer?, maxresultsize: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uldnVariantDisplayName((ldn?.value ?: 0L), (variant?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (perrorcode?.value ?: 0L))

public actual fun ulistfmtClose(listfmt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtClose((listfmt?.value ?: 0L))
}

public actual fun ulistfmtCloseResult(uresult: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtCloseResult((uresult?.value ?: 0L))
}

public actual fun ulistfmtFormat(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtFormat((listfmt?.value ?: 0L), (strings?.value ?: 0L), (stringlengths?.value ?: 0L), stringcount, (result?.value ?: 0L), resultcapacity, (status?.value ?: 0L))

public actual fun ulistfmtFormatStringsToResult(listfmt: COpaquePointer?, strings: COpaquePointer?, stringlengths: COpaquePointer?, stringcount: Int, uresult: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtFormatStringsToResult((listfmt?.value ?: 0L), (strings?.value ?: 0L), (stringlengths?.value ?: 0L), stringcount, (uresult?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ulistfmtOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtOpen((locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulistfmtOpenForType(locale: Pcstr, type: UListFormatterType, width: UListFormatterWidth, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtOpenForType((locale?.value ?: 0L), type, width, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulistfmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtOpenResult((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulistfmtResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulistfmtResultAsValue((uresult?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocAcceptLanguage(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, acceptlist: COpaquePointer?, acceptlistcount: Int, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocAcceptLanguage((result?.value ?: 0L), resultavailable, (outresult?.value ?: 0L), (acceptlist?.value ?: 0L), acceptlistcount, (availablelocales?.value ?: 0L), (status?.value ?: 0L))

public actual fun ulocAcceptLanguageFromHttp(result: Pcstr, resultavailable: Int, outresult: COpaquePointer?, httpacceptlanguage: Pcstr, availablelocales: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocAcceptLanguageFromHttp((result?.value ?: 0L), resultavailable, (outresult?.value ?: 0L), (httpacceptlanguage?.value ?: 0L), (availablelocales?.value ?: 0L), (status?.value ?: 0L))

public actual fun ulocAddLikelySubtags(localeid: Pcstr, maximizedlocaleid: Pcstr, maximizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocAddLikelySubtags((localeid?.value ?: 0L), (maximizedlocaleid?.value ?: 0L), maximizedlocaleidcapacity, (err?.value ?: 0L))

public actual fun ulocCanonicalize(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocCanonicalize((localeid?.value ?: 0L), (name?.value ?: 0L), namecapacity, (err?.value ?: 0L))

public actual fun ulocCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocCountAvailable()

public actual fun ulocForLanguageTag(langtag: Pcstr, localeid: Pcstr, localeidcapacity: Int, parsedlength: COpaquePointer?, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocForLanguageTag((langtag?.value ?: 0L), (localeid?.value ?: 0L), localeidcapacity, (parsedlength?.value ?: 0L), (err?.value ?: 0L))

public actual fun ulocGetAvailable(n: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetAvailable(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetBaseName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetBaseName((localeid?.value ?: 0L), (name?.value ?: 0L), namecapacity, (err?.value ?: 0L))

public actual fun ulocGetCharacterOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetCharacterOrientation((localeid?.value ?: 0L), (status?.value ?: 0L))

public actual fun ulocGetCountry(localeid: Pcstr, country: Pcstr, countrycapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetCountry((localeid?.value ?: 0L), (country?.value ?: 0L), countrycapacity, (err?.value ?: 0L))

public actual fun ulocGetDefault(): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDefault().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetDisplayCountry(locale: Pcstr, displaylocale: Pcstr, country: COpaquePointer?, countrycapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayCountry((locale?.value ?: 0L), (displaylocale?.value ?: 0L), (country?.value ?: 0L), countrycapacity, (status?.value ?: 0L))

public actual fun ulocGetDisplayKeyword(keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayKeyword((keyword?.value ?: 0L), (displaylocale?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun ulocGetDisplayKeywordValue(locale: Pcstr, keyword: Pcstr, displaylocale: Pcstr, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayKeywordValue((locale?.value ?: 0L), (keyword?.value ?: 0L), (displaylocale?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun ulocGetDisplayLanguage(locale: Pcstr, displaylocale: Pcstr, language: COpaquePointer?, languagecapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayLanguage((locale?.value ?: 0L), (displaylocale?.value ?: 0L), (language?.value ?: 0L), languagecapacity, (status?.value ?: 0L))

public actual fun ulocGetDisplayName(localeid: Pcstr, inlocaleid: Pcstr, result: COpaquePointer?, maxresultsize: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayName((localeid?.value ?: 0L), (inlocaleid?.value ?: 0L), (result?.value ?: 0L), maxresultsize, (err?.value ?: 0L))

public actual fun ulocGetDisplayScript(locale: Pcstr, displaylocale: Pcstr, script: COpaquePointer?, scriptcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayScript((locale?.value ?: 0L), (displaylocale?.value ?: 0L), (script?.value ?: 0L), scriptcapacity, (status?.value ?: 0L))

public actual fun ulocGetDisplayVariant(locale: Pcstr, displaylocale: Pcstr, variant: COpaquePointer?, variantcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetDisplayVariant((locale?.value ?: 0L), (displaylocale?.value ?: 0L), (variant?.value ?: 0L), variantcapacity, (status?.value ?: 0L))

public actual fun ulocGetIso3Country(localeid: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetIso3Country((localeid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetIso3Language(localeid: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetIso3Language((localeid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetIsocountries(): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetIsocountries().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetIsolanguages(): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetIsolanguages().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocGetKeywordValue(localeid: Pcstr, keywordname: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetKeywordValue((localeid?.value ?: 0L), (keywordname?.value ?: 0L), (buffer?.value ?: 0L), buffercapacity, (status?.value ?: 0L))

public actual fun ulocGetLcid(localeid: Pcstr): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetLcid((localeid?.value ?: 0L)).toUInt()

public actual fun ulocGetLanguage(localeid: Pcstr, language: Pcstr, languagecapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetLanguage((localeid?.value ?: 0L), (language?.value ?: 0L), languagecapacity, (err?.value ?: 0L))

public actual fun ulocGetLineOrientation(localeid: Pcstr, status: COpaquePointer?): ULayoutType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetLineOrientation((localeid?.value ?: 0L), (status?.value ?: 0L))

public actual fun ulocGetLocaleForLcid(hostid: UInt, locale: Pcstr, localecapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetLocaleForLcid(hostid.toInt(), (locale?.value ?: 0L), localecapacity, (status?.value ?: 0L))

public actual fun ulocGetName(localeid: Pcstr, name: Pcstr, namecapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetName((localeid?.value ?: 0L), (name?.value ?: 0L), namecapacity, (err?.value ?: 0L))

public actual fun ulocGetParent(localeid: Pcstr, parent: Pcstr, parentcapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetParent((localeid?.value ?: 0L), (parent?.value ?: 0L), parentcapacity, (err?.value ?: 0L))

public actual fun ulocGetScript(localeid: Pcstr, script: Pcstr, scriptcapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetScript((localeid?.value ?: 0L), (script?.value ?: 0L), scriptcapacity, (err?.value ?: 0L))

public actual fun ulocGetVariant(localeid: Pcstr, variant: Pcstr, variantcapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocGetVariant((localeid?.value ?: 0L), (variant?.value ?: 0L), variantcapacity, (err?.value ?: 0L))

public actual fun ulocIsRightToLeft(locale: Pcstr): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocIsRightToLeft((locale?.value ?: 0L))

public actual fun ulocMinimizeSubtags(localeid: Pcstr, minimizedlocaleid: Pcstr, minimizedlocaleidcapacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocMinimizeSubtags((localeid?.value ?: 0L), (minimizedlocaleid?.value ?: 0L), minimizedlocaleidcapacity, (err?.value ?: 0L))

public actual fun ulocOpenAvailableByType(type: ULocAvailableType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocOpenAvailableByType(type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocOpenKeywords(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocOpenKeywords((localeid?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocSetDefault(localeid: Pcstr, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocSetDefault((localeid?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ulocSetKeywordValue(keywordname: Pcstr, keywordvalue: Pcstr, buffer: Pcstr, buffercapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocSetKeywordValue((keywordname?.value ?: 0L), (keywordvalue?.value ?: 0L), (buffer?.value ?: 0L), buffercapacity, (status?.value ?: 0L))

public actual fun ulocToLanguageTag(localeid: Pcstr, langtag: Pcstr, langtagcapacity: Int, strict: Byte, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocToLanguageTag((localeid?.value ?: 0L), (langtag?.value ?: 0L), langtagcapacity, strict, (err?.value ?: 0L))

public actual fun ulocToLegacyKey(keyword: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocToLegacyKey((keyword?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocToLegacyType(keyword: Pcstr, value: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocToLegacyType((keyword?.value ?: 0L), (value?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocToUnicodeLocaleKey(keyword: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocToUnicodeLocaleKey((keyword?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocToUnicodeLocaleType(keyword: Pcstr, value: Pcstr): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocToUnicodeLocaleType((keyword?.value ?: 0L), (value?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocdataClose(uld: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataClose((uld?.value ?: 0L))
}

public actual fun ulocdataGetCldrversion(versionarray: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetCldrversion((versionarray?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ulocdataGetDelimiter(uld: COpaquePointer?, type: ULocaleDataDelimiterType, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetDelimiter((uld?.value ?: 0L), type, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun ulocdataGetExemplarSet(uld: COpaquePointer?, fillin: COpaquePointer?, options: UInt, extype: ULocaleDataExemplarSetType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetExemplarSet((uld?.value ?: 0L), (fillin?.value ?: 0L), options.toInt(), extype, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocdataGetLocaleDisplayPattern(uld: COpaquePointer?, pattern: COpaquePointer?, patterncapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetLocaleDisplayPattern((uld?.value ?: 0L), (pattern?.value ?: 0L), patterncapacity, (status?.value ?: 0L))

public actual fun ulocdataGetLocaleSeparator(uld: COpaquePointer?, separator: COpaquePointer?, separatorcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetLocaleSeparator((uld?.value ?: 0L), (separator?.value ?: 0L), separatorcapacity, (status?.value ?: 0L))

public actual fun ulocdataGetMeasurementSystem(localeid: Pcstr, status: COpaquePointer?): UMeasurementSystem =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetMeasurementSystem((localeid?.value ?: 0L), (status?.value ?: 0L))

public actual fun ulocdataGetNoSubstitute(uld: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetNoSubstitute((uld?.value ?: 0L))

public actual fun ulocdataGetPaperSize(localeid: Pcstr, height: COpaquePointer?, width: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataGetPaperSize((localeid?.value ?: 0L), (height?.value ?: 0L), (width?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ulocdataOpen(localeid: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataOpen((localeid?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ulocdataSetNoSubstitute(uld: COpaquePointer?, setting: Byte) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ulocdataSetNoSubstitute((uld?.value ?: 0L), setting)
}

public actual fun umsgApplyPattern(fmt: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgApplyPattern((fmt?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (parseerror?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun umsgAutoQuoteApostrophe(pattern: COpaquePointer?, patternlength: Int, dest: COpaquePointer?, destcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgAutoQuoteApostrophe((pattern?.value ?: 0L), patternlength, (dest?.value ?: 0L), destcapacity, (ec?.value ?: 0L))

public actual fun umsgClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgClone((fmt?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umsgClose(format: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgClose((format?.value ?: 0L))
}

public actual fun umsgFormat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgFormat((fmt?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun umsgGetLocale(fmt: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgGetLocale((fmt?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umsgOpen(pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerror: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgOpen((pattern?.value ?: 0L), patternlength, (locale?.value ?: 0L), (parseerror?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umsgParse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, status: COpaquePointer?, vararg variadicArgs: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgParse((fmt?.value ?: 0L), (source?.value ?: 0L), sourcelength, (count?.value ?: 0L), (status?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun umsgSetLocale(fmt: COpaquePointer?, locale: Pcstr) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgSetLocale((fmt?.value ?: 0L), (locale?.value ?: 0L))
}

public actual fun umsgToPattern(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgToPattern((fmt?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun umsgVformat(fmt: COpaquePointer?, result: COpaquePointer?, resultlength: Int, ap: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgVformat((fmt?.value ?: 0L), (result?.value ?: 0L), resultlength, (ap?.value ?: 0L), (status?.value ?: 0L))

public actual fun umsgVparse(fmt: COpaquePointer?, source: COpaquePointer?, sourcelength: Int, count: COpaquePointer?, ap: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umsgVparse((fmt?.value ?: 0L), (source?.value ?: 0L), sourcelength, (count?.value ?: 0L), (ap?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun umutablecptrieBuildImmutable(trie: COpaquePointer?, type: UCPTrieType, valuewidth: UCPTrieValueWidth, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieBuildImmutable((trie?.value ?: 0L), type, valuewidth, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umutablecptrieClone(other: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieClone((other?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umutablecptrieClose(trie: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieClose((trie?.value ?: 0L))
}

public actual fun umutablecptrieFromUcpmap(map: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieFromUcpmap((map?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umutablecptrieFromUcptrie(trie: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieFromUcptrie((trie?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umutablecptrieGet(trie: COpaquePointer?, c: Int): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieGet((trie?.value ?: 0L), c).toUInt()

public actual fun umutablecptrieGetRange(trie: COpaquePointer?, start: Int, option: UCPMapRangeOption, surrogatevalue: UInt, filter: COpaquePointer?, context: COpaquePointer?, pvalue: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieGetRange((trie?.value ?: 0L), start, option, surrogatevalue.toInt(), (filter?.value ?: 0L), (context?.value ?: 0L), (pvalue?.value ?: 0L))

public actual fun umutablecptrieOpen(initialvalue: UInt, errorvalue: UInt, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieOpen(initialvalue.toInt(), errorvalue.toInt(), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun umutablecptrieSet(trie: COpaquePointer?, c: Int, value: UInt, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieSet((trie?.value ?: 0L), c, value.toInt(), (perrorcode?.value ?: 0L))
}

public actual fun umutablecptrieSetRange(trie: COpaquePointer?, start: Int, end: Int, value: UInt, perrorcode: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_umutablecptrieSetRange((trie?.value ?: 0L), start, end, value.toInt(), (perrorcode?.value ?: 0L))
}

public actual fun unorm2Append(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2Append((norm2?.value ?: 0L), (first?.value ?: 0L), firstlength, firstcapacity, (second?.value ?: 0L), secondlength, (perrorcode?.value ?: 0L))

public actual fun unorm2Close(norm2: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2Close((norm2?.value ?: 0L))
}

public actual fun unorm2ComposePair(norm2: COpaquePointer?, a: Int, b: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2ComposePair((norm2?.value ?: 0L), a, b)

public actual fun unorm2GetCombiningClass(norm2: COpaquePointer?, c: Int): UByte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetCombiningClass((norm2?.value ?: 0L), c).toUByte()

public actual fun unorm2GetDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetDecomposition((norm2?.value ?: 0L), c, (decomposition?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun unorm2GetInstance(packagename: Pcstr, name: Pcstr, mode: UNormalization2Mode, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetInstance((packagename?.value ?: 0L), (name?.value ?: 0L), mode, (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetNfcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetNfcinstance((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetNfdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetNfdinstance((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetNfkccasefoldInstance(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetNfkccasefoldInstance((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetNfkcinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetNfkcinstance((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetNfkdinstance(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetNfkdinstance((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2GetRawDecomposition(norm2: COpaquePointer?, c: Int, decomposition: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2GetRawDecomposition((norm2?.value ?: 0L), c, (decomposition?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun unorm2HasBoundaryAfter(norm2: COpaquePointer?, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2HasBoundaryAfter((norm2?.value ?: 0L), c)

public actual fun unorm2HasBoundaryBefore(norm2: COpaquePointer?, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2HasBoundaryBefore((norm2?.value ?: 0L), c)

public actual fun unorm2IsInert(norm2: COpaquePointer?, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2IsInert((norm2?.value ?: 0L), c)

public actual fun unorm2IsNormalized(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2IsNormalized((norm2?.value ?: 0L), (s?.value ?: 0L), length, (perrorcode?.value ?: 0L))

public actual fun unorm2Normalize(norm2: COpaquePointer?, src: COpaquePointer?, length: Int, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2Normalize((norm2?.value ?: 0L), (src?.value ?: 0L), length, (dest?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun unorm2NormalizeSecondAndAppend(norm2: COpaquePointer?, first: COpaquePointer?, firstlength: Int, firstcapacity: Int, second: COpaquePointer?, secondlength: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2NormalizeSecondAndAppend((norm2?.value ?: 0L), (first?.value ?: 0L), firstlength, firstcapacity, (second?.value ?: 0L), secondlength, (perrorcode?.value ?: 0L))

public actual fun unorm2OpenFiltered(norm2: COpaquePointer?, filterset: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2OpenFiltered((norm2?.value ?: 0L), (filterset?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unorm2QuickCheck(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): UNormalizationCheckResult =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2QuickCheck((norm2?.value ?: 0L), (s?.value ?: 0L), length, (perrorcode?.value ?: 0L))

public actual fun unorm2SpanQuickCheckYes(norm2: COpaquePointer?, s: COpaquePointer?, length: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unorm2SpanQuickCheckYes((norm2?.value ?: 0L), (s?.value ?: 0L), length, (perrorcode?.value ?: 0L))

public actual fun unormCompare(s1: COpaquePointer?, length1: Int, s2: COpaquePointer?, length2: Int, options: UInt, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unormCompare((s1?.value ?: 0L), length1, (s2?.value ?: 0L), length2, options.toInt(), (perrorcode?.value ?: 0L))

public actual fun unumApplyPattern(format: COpaquePointer?, localized: Byte, pattern: COpaquePointer?, patternlength: Int, parseerror: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumApplyPattern((format?.value ?: 0L), localized, (pattern?.value ?: 0L), patternlength, (parseerror?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun unumClone(fmt: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumClone((fmt?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumClose(fmt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumClose((fmt?.value ?: 0L))
}

public actual fun unumCountAvailable(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumCountAvailable()

public actual fun unumFormat(fmt: COpaquePointer?, number: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormat((fmt?.value ?: 0L), number, (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatDecimal(fmt: COpaquePointer?, number: Pcstr, length: Int, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatDecimal((fmt?.value ?: 0L), (number?.value ?: 0L), length, (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatDouble(fmt: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatDouble((fmt?.value ?: 0L), number, (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatDoubleCurrency(fmt: COpaquePointer?, number: Double, currency: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatDoubleCurrency((fmt?.value ?: 0L), number, (currency?.value ?: 0L), (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatDoubleForFields(format: COpaquePointer?, number: Double, result: COpaquePointer?, resultlength: Int, fpositer: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatDoubleForFields((format?.value ?: 0L), number, (result?.value ?: 0L), resultlength, (fpositer?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatInt64(fmt: COpaquePointer?, number: Long, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatInt64((fmt?.value ?: 0L), number, (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumFormatUformattable(fmt: COpaquePointer?, number: COpaquePointer?, result: COpaquePointer?, resultlength: Int, pos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumFormatUformattable((fmt?.value ?: 0L), (number?.value ?: 0L), (result?.value ?: 0L), resultlength, (pos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumGetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetAttribute((fmt?.value ?: 0L), attr)

public actual fun unumGetAvailable(localeindex: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetAvailable(localeindex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumGetContext(fmt: COpaquePointer?, type: UDisplayContextType, status: COpaquePointer?): UDisplayContext =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetContext((fmt?.value ?: 0L), type, (status?.value ?: 0L))

public actual fun unumGetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetDoubleAttribute((fmt?.value ?: 0L), attr)

public actual fun unumGetLocaleByType(fmt: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetLocaleByType((fmt?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumGetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, buffer: COpaquePointer?, size: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetSymbol((fmt?.value ?: 0L), symbol, (buffer?.value ?: 0L), size, (status?.value ?: 0L))

public actual fun unumGetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumGetTextAttribute((fmt?.value ?: 0L), tag, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun unumOpen(style: UNumberFormatStyle, pattern: COpaquePointer?, patternlength: Int, locale: Pcstr, parseerr: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumOpen(style, (pattern?.value ?: 0L), patternlength, (locale?.value ?: 0L), (parseerr?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumParse(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParse((fmt?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumParseDecimal(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, outbuf: Pcstr, outbuflength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParseDecimal((fmt?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (outbuf?.value ?: 0L), outbuflength, (status?.value ?: 0L))

public actual fun unumParseDouble(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParseDouble((fmt?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumParseDoubleCurrency(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, currency: COpaquePointer?, status: COpaquePointer?): Double =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParseDoubleCurrency((fmt?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (currency?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumParseInt64(fmt: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParseInt64((fmt?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L))

public actual fun unumParseToUformattable(fmt: COpaquePointer?, result: COpaquePointer?, text: COpaquePointer?, textlength: Int, parsepos: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumParseToUformattable((fmt?.value ?: 0L), (result?.value ?: 0L), (text?.value ?: 0L), textlength, (parsepos?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumSetAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumSetAttribute((fmt?.value ?: 0L), attr, newvalue)
}

public actual fun unumSetContext(fmt: COpaquePointer?, value: UDisplayContext, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumSetContext((fmt?.value ?: 0L), value, (status?.value ?: 0L))
}

public actual fun unumSetDoubleAttribute(fmt: COpaquePointer?, attr: UNumberFormatAttribute, newvalue: Double) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumSetDoubleAttribute((fmt?.value ?: 0L), attr, newvalue)
}

public actual fun unumSetSymbol(fmt: COpaquePointer?, symbol: UNumberFormatSymbol, value: COpaquePointer?, length: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumSetSymbol((fmt?.value ?: 0L), symbol, (value?.value ?: 0L), length, (status?.value ?: 0L))
}

public actual fun unumSetTextAttribute(fmt: COpaquePointer?, tag: UNumberFormatTextAttribute, newvalue: COpaquePointer?, newvaluelength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumSetTextAttribute((fmt?.value ?: 0L), tag, (newvalue?.value ?: 0L), newvaluelength, (status?.value ?: 0L))
}

public actual fun unumToPattern(fmt: COpaquePointer?, ispatternlocalized: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumToPattern((fmt?.value ?: 0L), ispatternlocalized, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun unumfClose(uformatter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfClose((uformatter?.value ?: 0L))
}

public actual fun unumfCloseResult(uresult: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfCloseResult((uresult?.value ?: 0L))
}

public actual fun unumfFormatDecimal(uformatter: COpaquePointer?, value: Pcstr, valuelen: Int, uresult: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfFormatDecimal((uformatter?.value ?: 0L), (value?.value ?: 0L), valuelen, (uresult?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun unumfFormatDouble(uformatter: COpaquePointer?, value: Double, uresult: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfFormatDouble((uformatter?.value ?: 0L), value, (uresult?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun unumfFormatInt(uformatter: COpaquePointer?, value: Long, uresult: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfFormatInt((uformatter?.value ?: 0L), value, (uresult?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun unumfOpenForSkeletonAndLocale(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocale((skeleton?.value ?: 0L), skeletonlen, (locale?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumfOpenForSkeletonAndLocaleWithError(skeleton: COpaquePointer?, skeletonlen: Int, locale: Pcstr, perror: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfOpenForSkeletonAndLocaleWithError((skeleton?.value ?: 0L), skeletonlen, (locale?.value ?: 0L), (perror?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumfOpenResult(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfOpenResult((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumfResultAsValue(uresult: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfResultAsValue((uresult?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumfResultGetAllFieldPositions(uresult: COpaquePointer?, ufpositer: COpaquePointer?, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfResultGetAllFieldPositions((uresult?.value ?: 0L), (ufpositer?.value ?: 0L), (ec?.value ?: 0L))
}

public actual fun unumfResultNextFieldPosition(uresult: COpaquePointer?, ufpos: COpaquePointer?, ec: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfResultNextFieldPosition((uresult?.value ?: 0L), (ufpos?.value ?: 0L), (ec?.value ?: 0L))

public actual fun unumfResultToString(uresult: COpaquePointer?, buffer: COpaquePointer?, buffercapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumfResultToString((uresult?.value ?: 0L), (buffer?.value ?: 0L), buffercapacity, (ec?.value ?: 0L))

public actual fun unumsysClose(unumsys: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysClose((unumsys?.value ?: 0L))
}

public actual fun unumsysGetDescription(unumsys: COpaquePointer?, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysGetDescription((unumsys?.value ?: 0L), (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun unumsysGetName(unumsys: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysGetName((unumsys?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumsysGetRadix(unumsys: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysGetRadix((unumsys?.value ?: 0L))

public actual fun unumsysIsAlgorithmic(unumsys: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysIsAlgorithmic((unumsys?.value ?: 0L))

public actual fun unumsysOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysOpen((locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumsysOpenAvailableNames(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysOpenAvailableNames((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unumsysOpenByName(name: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_unumsysOpenByName((name?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uplrulesClose(uplrules: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesClose((uplrules?.value ?: 0L))
}

public actual fun uplrulesGetKeywords(uplrules: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesGetKeywords((uplrules?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uplrulesOpen(locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesOpen((locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uplrulesOpenForType(locale: Pcstr, type: UPluralType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesOpenForType((locale?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uplrulesSelect(uplrules: COpaquePointer?, number: Double, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesSelect((uplrules?.value ?: 0L), number, (keyword?.value ?: 0L), capacity, (status?.value ?: 0L))

public actual fun uplrulesSelectFormatted(uplrules: COpaquePointer?, number: COpaquePointer?, keyword: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uplrulesSelectFormatted((uplrules?.value ?: 0L), (number?.value ?: 0L), (keyword?.value ?: 0L), capacity, (status?.value ?: 0L))

public actual fun uregexAppendReplacement(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexAppendReplacement((regexp?.value ?: 0L), (replacementtext?.value ?: 0L), replacementlength, (destbuf?.value ?: 0L), (destcapacity?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexAppendReplacementUtext(regexp: COpaquePointer?, replacementtext: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexAppendReplacementUtext((regexp?.value ?: 0L), (replacementtext?.value ?: 0L), (dest?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexAppendTail(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexAppendTail((regexp?.value ?: 0L), (destbuf?.value ?: 0L), (destcapacity?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexAppendTailUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexAppendTailUtext((regexp?.value ?: 0L), (dest?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexClone(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexClone((regexp?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexClose(regexp: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexClose((regexp?.value ?: 0L))
}

public actual fun uregexEnd(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexEnd((regexp?.value ?: 0L), groupnum, (status?.value ?: 0L))

public actual fun uregexEnd64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexEnd64((regexp?.value ?: 0L), groupnum, (status?.value ?: 0L))

public actual fun uregexFind(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexFind((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexFind64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexFind64((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexFindNext(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexFindNext((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexFlags(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexFlags((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexGetFindProgressCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetFindProgressCallback((regexp?.value ?: 0L), (callback?.value ?: 0L), (context?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexGetMatchCallback(regexp: COpaquePointer?, callback: COpaquePointer?, context: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetMatchCallback((regexp?.value ?: 0L), (callback?.value ?: 0L), (context?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexGetStackLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetStackLimit((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexGetText(regexp: COpaquePointer?, textlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetText((regexp?.value ?: 0L), (textlength?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexGetTimeLimit(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetTimeLimit((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexGetUtext(regexp: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGetUtext((regexp?.value ?: 0L), (dest?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexGroup(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGroup((regexp?.value ?: 0L), groupnum, (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun uregexGroupCount(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGroupCount((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexGroupNumberFromCname(regexp: COpaquePointer?, groupname: Pcstr, namelength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGroupNumberFromCname((regexp?.value ?: 0L), (groupname?.value ?: 0L), namelength, (status?.value ?: 0L))

public actual fun uregexGroupNumberFromName(regexp: COpaquePointer?, groupname: COpaquePointer?, namelength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGroupNumberFromName((regexp?.value ?: 0L), (groupname?.value ?: 0L), namelength, (status?.value ?: 0L))

public actual fun uregexGroupUtext(regexp: COpaquePointer?, groupnum: Int, dest: COpaquePointer?, grouplength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexGroupUtext((regexp?.value ?: 0L), groupnum, (dest?.value ?: 0L), (grouplength?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexHasAnchoringBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexHasAnchoringBounds((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexHasTransparentBounds(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexHasTransparentBounds((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexHitEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexHitEnd((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexLookingAt(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexLookingAt((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexLookingAt64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexLookingAt64((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexMatches(regexp: COpaquePointer?, startindex: Int, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexMatches((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexMatches64(regexp: COpaquePointer?, startindex: Long, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexMatches64((regexp?.value ?: 0L), startindex, (status?.value ?: 0L))

public actual fun uregexOpen(pattern: COpaquePointer?, patternlength: Int, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexOpen((pattern?.value ?: 0L), patternlength, flags.toInt(), (pe?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexOpenC(pattern: Pcstr, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexOpenC((pattern?.value ?: 0L), flags.toInt(), (pe?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexOpenUtext(pattern: COpaquePointer?, flags: UInt, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexOpenUtext((pattern?.value ?: 0L), flags.toInt(), (pe?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexPattern(regexp: COpaquePointer?, patlength: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexPattern((regexp?.value ?: 0L), (patlength?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexPatternUtext(regexp: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexPatternUtext((regexp?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexRefreshUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRefreshUtext((regexp?.value ?: 0L), (text?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexRegionEnd(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRegionEnd((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexRegionEnd64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRegionEnd64((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexRegionStart(regexp: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRegionStart((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexRegionStart64(regexp: COpaquePointer?, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRegionStart64((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexReplaceAll(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReplaceAll((regexp?.value ?: 0L), (replacementtext?.value ?: 0L), replacementlength, (destbuf?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun uregexReplaceAllUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReplaceAllUtext((regexp?.value ?: 0L), (replacement?.value ?: 0L), (dest?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexReplaceFirst(regexp: COpaquePointer?, replacementtext: COpaquePointer?, replacementlength: Int, destbuf: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReplaceFirst((regexp?.value ?: 0L), (replacementtext?.value ?: 0L), replacementlength, (destbuf?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun uregexReplaceFirstUtext(regexp: COpaquePointer?, replacement: COpaquePointer?, dest: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReplaceFirstUtext((regexp?.value ?: 0L), (replacement?.value ?: 0L), (dest?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregexRequireEnd(regexp: COpaquePointer?, status: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexRequireEnd((regexp?.value ?: 0L), (status?.value ?: 0L))

public actual fun uregexReset(regexp: COpaquePointer?, index: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReset((regexp?.value ?: 0L), index, (status?.value ?: 0L))
}

public actual fun uregexReset64(regexp: COpaquePointer?, index: Long, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexReset64((regexp?.value ?: 0L), index, (status?.value ?: 0L))
}

public actual fun uregexSetFindProgressCallback(regexp: COpaquePointer?, callback: URegexFindProgressCallback, context: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetFindProgressCallback((regexp?.value ?: 0L), 0L, (context?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexSetMatchCallback(regexp: COpaquePointer?, callback: URegexMatchCallback, context: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetMatchCallback((regexp?.value ?: 0L), 0L, (context?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexSetRegion(regexp: COpaquePointer?, regionstart: Int, regionlimit: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetRegion((regexp?.value ?: 0L), regionstart, regionlimit, (status?.value ?: 0L))
}

public actual fun uregexSetRegion64(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetRegion64((regexp?.value ?: 0L), regionstart, regionlimit, (status?.value ?: 0L))
}

public actual fun uregexSetRegionAndStart(regexp: COpaquePointer?, regionstart: Long, regionlimit: Long, startindex: Long, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetRegionAndStart((regexp?.value ?: 0L), regionstart, regionlimit, startindex, (status?.value ?: 0L))
}

public actual fun uregexSetStackLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetStackLimit((regexp?.value ?: 0L), limit, (status?.value ?: 0L))
}

public actual fun uregexSetText(regexp: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetText((regexp?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L))
}

public actual fun uregexSetTimeLimit(regexp: COpaquePointer?, limit: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetTimeLimit((regexp?.value ?: 0L), limit, (status?.value ?: 0L))
}

public actual fun uregexSetUtext(regexp: COpaquePointer?, text: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSetUtext((regexp?.value ?: 0L), (text?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uregexSplit(regexp: COpaquePointer?, destbuf: COpaquePointer?, destcapacity: Int, requiredcapacity: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSplit((regexp?.value ?: 0L), (destbuf?.value ?: 0L), destcapacity, (requiredcapacity?.value ?: 0L), (destfields?.value ?: 0L), destfieldscapacity, (status?.value ?: 0L))

public actual fun uregexSplitUtext(regexp: COpaquePointer?, destfields: COpaquePointer?, destfieldscapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexSplitUtext((regexp?.value ?: 0L), (destfields?.value ?: 0L), destfieldscapacity, (status?.value ?: 0L))

public actual fun uregexStart(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexStart((regexp?.value ?: 0L), groupnum, (status?.value ?: 0L))

public actual fun uregexStart64(regexp: COpaquePointer?, groupnum: Int, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexStart64((regexp?.value ?: 0L), groupnum, (status?.value ?: 0L))

public actual fun uregexUseAnchoringBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexUseAnchoringBounds((regexp?.value ?: 0L), b, (status?.value ?: 0L))
}

public actual fun uregexUseTransparentBounds(regexp: COpaquePointer?, b: Byte, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregexUseTransparentBounds((regexp?.value ?: 0L), b, (status?.value ?: 0L))
}

public actual fun uregionAreEqual(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionAreEqual((uregion?.value ?: 0L), (otherregion?.value ?: 0L))

public actual fun uregionContains(uregion: COpaquePointer?, otherregion: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionContains((uregion?.value ?: 0L), (otherregion?.value ?: 0L))

public actual fun uregionGetAvailable(type: URegionType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetAvailable(type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetContainedRegions(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetContainedRegions((uregion?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetContainedRegionsOfType(uregion: COpaquePointer?, type: URegionType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetContainedRegionsOfType((uregion?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetContainingRegion(uregion: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetContainingRegion((uregion?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetContainingRegionOfType(uregion: COpaquePointer?, type: URegionType): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetContainingRegionOfType((uregion?.value ?: 0L), type).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetNumericCode(uregion: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetNumericCode((uregion?.value ?: 0L))

public actual fun uregionGetPreferredValues(uregion: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetPreferredValues((uregion?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetRegionCode(uregion: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetRegionCode((uregion?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetRegionFromCode(regioncode: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetRegionFromCode((regioncode?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetRegionFromNumericCode(code: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetRegionFromNumericCode(code, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uregionGetType(uregion: COpaquePointer?): URegionType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uregionGetType((uregion?.value ?: 0L))

public actual fun ureldatefmtClose(reldatefmt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtClose((reldatefmt?.value ?: 0L))
}

public actual fun ureldatefmtCloseResult(ufrdt: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtCloseResult((ufrdt?.value ?: 0L))
}

public actual fun ureldatefmtCombineDateAndTime(reldatefmt: COpaquePointer?, relativedatestring: COpaquePointer?, relativedatestringlen: Int, timestring: COpaquePointer?, timestringlen: Int, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtCombineDateAndTime((reldatefmt?.value ?: 0L), (relativedatestring?.value ?: 0L), relativedatestringlen, (timestring?.value ?: 0L), timestringlen, (result?.value ?: 0L), resultcapacity, (status?.value ?: 0L))

public actual fun ureldatefmtFormat(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtFormat((reldatefmt?.value ?: 0L), offset, unit, (result?.value ?: 0L), resultcapacity, (status?.value ?: 0L))

public actual fun ureldatefmtFormatNumeric(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtFormatNumeric((reldatefmt?.value ?: 0L), offset, unit, (result?.value ?: 0L), resultcapacity, (status?.value ?: 0L))

public actual fun ureldatefmtFormatNumericToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtFormatNumericToResult((reldatefmt?.value ?: 0L), offset, unit, (result?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ureldatefmtFormatToResult(reldatefmt: COpaquePointer?, offset: Double, unit: URelativeDateTimeUnit, result: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtFormatToResult((reldatefmt?.value ?: 0L), offset, unit, (result?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun ureldatefmtOpen(locale: Pcstr, nftoadopt: COpaquePointer?, width: UDateRelativeDateTimeFormatterStyle, capitalizationcontext: UDisplayContext, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtOpen((locale?.value ?: 0L), (nftoadopt?.value ?: 0L), width, capitalizationcontext, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ureldatefmtOpenResult(ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtOpenResult((ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ureldatefmtResultAsValue(ufrdt: COpaquePointer?, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_ureldatefmtResultAsValue((ufrdt?.value ?: 0L), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresClose(resourcebundle: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresClose((resourcebundle?.value ?: 0L))
}

public actual fun uresGetBinary(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetBinary((resourcebundle?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetByIndex(resourcebundle: COpaquePointer?, indexr: Int, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetByIndex((resourcebundle?.value ?: 0L), indexr, (fillin?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetByKey(resourcebundle: COpaquePointer?, key: Pcstr, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetByKey((resourcebundle?.value ?: 0L), (key?.value ?: 0L), (fillin?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetInt(resourcebundle: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetInt((resourcebundle?.value ?: 0L), (status?.value ?: 0L))

public actual fun uresGetIntVector(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetIntVector((resourcebundle?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetKey(resourcebundle: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetKey((resourcebundle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetLocaleByType(resourcebundle: COpaquePointer?, type: ULocDataLocaleType, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetLocaleByType((resourcebundle?.value ?: 0L), type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetNextResource(resourcebundle: COpaquePointer?, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetNextResource((resourcebundle?.value ?: 0L), (fillin?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetNextString(resourcebundle: COpaquePointer?, len: COpaquePointer?, key: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetNextString((resourcebundle?.value ?: 0L), (len?.value ?: 0L), (key?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetSize(resourcebundle: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetSize((resourcebundle?.value ?: 0L))

public actual fun uresGetString(resourcebundle: COpaquePointer?, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetString((resourcebundle?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetStringByIndex(resourcebundle: COpaquePointer?, indexs: Int, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetStringByIndex((resourcebundle?.value ?: 0L), indexs, (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetStringByKey(resb: COpaquePointer?, key: Pcstr, len: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetStringByKey((resb?.value ?: 0L), (key?.value ?: 0L), (len?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetType(resourcebundle: COpaquePointer?): UResType =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetType((resourcebundle?.value ?: 0L))

public actual fun uresGetUint(resourcebundle: COpaquePointer?, status: COpaquePointer?): UInt =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetUint((resourcebundle?.value ?: 0L), (status?.value ?: 0L)).toUInt()

public actual fun uresGetUtf8String(resb: COpaquePointer?, dest: Pcstr, length: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetUtf8String((resb?.value ?: 0L), (dest?.value ?: 0L), (length?.value ?: 0L), forcecopy, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetUtf8StringByIndex(resb: COpaquePointer?, stringindex: Int, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetUtf8StringByIndex((resb?.value ?: 0L), stringindex, (dest?.value ?: 0L), (plength?.value ?: 0L), forcecopy, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetUtf8StringByKey(resb: COpaquePointer?, key: Pcstr, dest: Pcstr, plength: COpaquePointer?, forcecopy: Byte, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetUtf8StringByKey((resb?.value ?: 0L), (key?.value ?: 0L), (dest?.value ?: 0L), (plength?.value ?: 0L), forcecopy, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresGetVersion(resb: COpaquePointer?, versioninfo: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresGetVersion((resb?.value ?: 0L), (versioninfo?.value ?: 0L))
}

public actual fun uresHasNext(resourcebundle: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresHasNext((resourcebundle?.value ?: 0L))

public actual fun uresOpen(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresOpen((packagename?.value ?: 0L), (locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresOpenAvailableLocales(packagename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresOpenAvailableLocales((packagename?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresOpenDirect(packagename: Pcstr, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresOpenDirect((packagename?.value ?: 0L), (locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresOpenU(packagename: COpaquePointer?, locale: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresOpenU((packagename?.value ?: 0L), (locale?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uresResetIterator(resourcebundle: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uresResetIterator((resourcebundle?.value ?: 0L))
}

public actual fun uscriptBreaksBetweenLetters(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptBreaksBetweenLetters(script)

public actual fun uscriptGetCode(nameorabbrorlocale: Pcstr, fillin: COpaquePointer?, capacity: Int, err: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetCode((nameorabbrorlocale?.value ?: 0L), (fillin?.value ?: 0L), capacity, (err?.value ?: 0L))

public actual fun uscriptGetName(scriptcode: UScriptCode): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetName(scriptcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uscriptGetSampleString(script: UScriptCode, dest: COpaquePointer?, capacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetSampleString(script, (dest?.value ?: 0L), capacity, (perrorcode?.value ?: 0L))

public actual fun uscriptGetScript(codepoint: Int, err: COpaquePointer?): UScriptCode =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetScript(codepoint, (err?.value ?: 0L))

public actual fun uscriptGetScriptExtensions(c: Int, scripts: COpaquePointer?, capacity: Int, errorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetScriptExtensions(c, (scripts?.value ?: 0L), capacity, (errorcode?.value ?: 0L))

public actual fun uscriptGetShortName(scriptcode: UScriptCode): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetShortName(scriptcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uscriptGetUsage(script: UScriptCode): UScriptUsage =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptGetUsage(script)

public actual fun uscriptHasScript(c: Int, sc: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptHasScript(c, sc)

public actual fun uscriptIsCased(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptIsCased(script)

public actual fun uscriptIsRightToLeft(script: UScriptCode): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uscriptIsRightToLeft(script)

public actual fun usearchClose(searchiter: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchClose((searchiter?.value ?: 0L))
}

public actual fun usearchFirst(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchFirst((strsrch?.value ?: 0L), (status?.value ?: 0L))

public actual fun usearchFollowing(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchFollowing((strsrch?.value ?: 0L), position, (status?.value ?: 0L))

public actual fun usearchGetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute): USearchAttributeValue =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetAttribute((strsrch?.value ?: 0L), attribute)

public actual fun usearchGetBreakIterator(strsrch: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetBreakIterator((strsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchGetCollator(strsrch: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetCollator((strsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchGetMatchedLength(strsrch: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetMatchedLength((strsrch?.value ?: 0L))

public actual fun usearchGetMatchedStart(strsrch: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetMatchedStart((strsrch?.value ?: 0L))

public actual fun usearchGetMatchedText(strsrch: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetMatchedText((strsrch?.value ?: 0L), (result?.value ?: 0L), resultcapacity, (status?.value ?: 0L))

public actual fun usearchGetOffset(strsrch: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetOffset((strsrch?.value ?: 0L))

public actual fun usearchGetPattern(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetPattern((strsrch?.value ?: 0L), (length?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchGetText(strsrch: COpaquePointer?, length: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchGetText((strsrch?.value ?: 0L), (length?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchLast(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchLast((strsrch?.value ?: 0L), (status?.value ?: 0L))

public actual fun usearchNext(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchNext((strsrch?.value ?: 0L), (status?.value ?: 0L))

public actual fun usearchOpen(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, locale: Pcstr, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchOpen((pattern?.value ?: 0L), patternlength, (text?.value ?: 0L), textlength, (locale?.value ?: 0L), (breakiter?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchOpenFromCollator(pattern: COpaquePointer?, patternlength: Int, text: COpaquePointer?, textlength: Int, collator: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchOpenFromCollator((pattern?.value ?: 0L), patternlength, (text?.value ?: 0L), textlength, (collator?.value ?: 0L), (breakiter?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usearchPreceding(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchPreceding((strsrch?.value ?: 0L), position, (status?.value ?: 0L))

public actual fun usearchPrevious(strsrch: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchPrevious((strsrch?.value ?: 0L), (status?.value ?: 0L))

public actual fun usearchReset(strsrch: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchReset((strsrch?.value ?: 0L))
}

public actual fun usearchSetAttribute(strsrch: COpaquePointer?, attribute: USearchAttribute, value: USearchAttributeValue, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetAttribute((strsrch?.value ?: 0L), attribute, value, (status?.value ?: 0L))
}

public actual fun usearchSetBreakIterator(strsrch: COpaquePointer?, breakiter: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetBreakIterator((strsrch?.value ?: 0L), (breakiter?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun usearchSetCollator(strsrch: COpaquePointer?, collator: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetCollator((strsrch?.value ?: 0L), (collator?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun usearchSetOffset(strsrch: COpaquePointer?, position: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetOffset((strsrch?.value ?: 0L), position, (status?.value ?: 0L))
}

public actual fun usearchSetPattern(strsrch: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetPattern((strsrch?.value ?: 0L), (pattern?.value ?: 0L), patternlength, (status?.value ?: 0L))
}

public actual fun usearchSetText(strsrch: COpaquePointer?, text: COpaquePointer?, textlength: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usearchSetText((strsrch?.value ?: 0L), (text?.value ?: 0L), textlength, (status?.value ?: 0L))
}

public actual fun usetAdd(set: COpaquePointer?, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetAdd((set?.value ?: 0L), c)
}

public actual fun usetAddAll(set: COpaquePointer?, additionalset: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetAddAll((set?.value ?: 0L), (additionalset?.value ?: 0L))
}

public actual fun usetAddAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetAddAllCodePoints((set?.value ?: 0L), (str?.value ?: 0L), strlen)
}

public actual fun usetAddRange(set: COpaquePointer?, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetAddRange((set?.value ?: 0L), start, end)
}

public actual fun usetAddString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetAddString((set?.value ?: 0L), (str?.value ?: 0L), strlen)
}

public actual fun usetApplyIntPropertyValue(set: COpaquePointer?, prop: UProperty, value: Int, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetApplyIntPropertyValue((set?.value ?: 0L), prop, value, (ec?.value ?: 0L))
}

public actual fun usetApplyPattern(set: COpaquePointer?, pattern: COpaquePointer?, patternlength: Int, options: UInt, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetApplyPattern((set?.value ?: 0L), (pattern?.value ?: 0L), patternlength, options.toInt(), (status?.value ?: 0L))

public actual fun usetApplyPropertyAlias(set: COpaquePointer?, prop: COpaquePointer?, proplength: Int, value: COpaquePointer?, valuelength: Int, ec: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetApplyPropertyAlias((set?.value ?: 0L), (prop?.value ?: 0L), proplength, (value?.value ?: 0L), valuelength, (ec?.value ?: 0L))
}

public actual fun usetCharAt(set: COpaquePointer?, charindex: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetCharAt((set?.value ?: 0L), charindex)

public actual fun usetClear(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetClear((set?.value ?: 0L))
}

public actual fun usetClone(set: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetClone((set?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetCloneAsThawed(set: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetCloneAsThawed((set?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetClose(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetClose((set?.value ?: 0L))
}

public actual fun usetCloseOver(set: COpaquePointer?, attributes: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetCloseOver((set?.value ?: 0L), attributes)
}

public actual fun usetCompact(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetCompact((set?.value ?: 0L))
}

public actual fun usetComplement(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetComplement((set?.value ?: 0L))
}

public actual fun usetComplementAll(set: COpaquePointer?, complement: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetComplementAll((set?.value ?: 0L), (complement?.value ?: 0L))
}

public actual fun usetContains(set: COpaquePointer?, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContains((set?.value ?: 0L), c)

public actual fun usetContainsAll(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsAll((set1?.value ?: 0L), (set2?.value ?: 0L))

public actual fun usetContainsAllCodePoints(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsAllCodePoints((set?.value ?: 0L), (str?.value ?: 0L), strlen)

public actual fun usetContainsNone(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsNone((set1?.value ?: 0L), (set2?.value ?: 0L))

public actual fun usetContainsRange(set: COpaquePointer?, start: Int, end: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsRange((set?.value ?: 0L), start, end)

public actual fun usetContainsSome(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsSome((set1?.value ?: 0L), (set2?.value ?: 0L))

public actual fun usetContainsString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetContainsString((set?.value ?: 0L), (str?.value ?: 0L), strlen)

public actual fun usetEquals(set1: COpaquePointer?, set2: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetEquals((set1?.value ?: 0L), (set2?.value ?: 0L))

public actual fun usetFreeze(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetFreeze((set?.value ?: 0L))
}

public actual fun usetGetItem(set: COpaquePointer?, itemindex: Int, start: COpaquePointer?, end: COpaquePointer?, str: COpaquePointer?, strcapacity: Int, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetGetItem((set?.value ?: 0L), itemindex, (start?.value ?: 0L), (end?.value ?: 0L), (str?.value ?: 0L), strcapacity, (ec?.value ?: 0L))

public actual fun usetGetItemCount(set: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetGetItemCount((set?.value ?: 0L))

public actual fun usetGetSerializedRange(set: COpaquePointer?, rangeindex: Int, pstart: COpaquePointer?, pend: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetGetSerializedRange((set?.value ?: 0L), rangeindex, (pstart?.value ?: 0L), (pend?.value ?: 0L))

public actual fun usetGetSerializedRangeCount(set: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetGetSerializedRangeCount((set?.value ?: 0L))

public actual fun usetGetSerializedSet(fillset: COpaquePointer?, src: COpaquePointer?, srclength: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetGetSerializedSet((fillset?.value ?: 0L), (src?.value ?: 0L), srclength)

public actual fun usetIndexOf(set: COpaquePointer?, c: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetIndexOf((set?.value ?: 0L), c)

public actual fun usetIsEmpty(set: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetIsEmpty((set?.value ?: 0L))

public actual fun usetIsFrozen(set: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetIsFrozen((set?.value ?: 0L))

public actual fun usetOpen(start: Int, end: Int): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetOpen(start, end).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetOpenEmpty(): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetOpenEmpty().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetOpenPattern(pattern: COpaquePointer?, patternlength: Int, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetOpenPattern((pattern?.value ?: 0L), patternlength, (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetOpenPatternOptions(pattern: COpaquePointer?, patternlength: Int, options: UInt, ec: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetOpenPatternOptions((pattern?.value ?: 0L), patternlength, options.toInt(), (ec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usetRemove(set: COpaquePointer?, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRemove((set?.value ?: 0L), c)
}

public actual fun usetRemoveAll(set: COpaquePointer?, removeset: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRemoveAll((set?.value ?: 0L), (removeset?.value ?: 0L))
}

public actual fun usetRemoveAllStrings(set: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRemoveAllStrings((set?.value ?: 0L))
}

public actual fun usetRemoveRange(set: COpaquePointer?, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRemoveRange((set?.value ?: 0L), start, end)
}

public actual fun usetRemoveString(set: COpaquePointer?, str: COpaquePointer?, strlen: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRemoveString((set?.value ?: 0L), (str?.value ?: 0L), strlen)
}

public actual fun usetResemblesPattern(pattern: COpaquePointer?, patternlength: Int, pos: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetResemblesPattern((pattern?.value ?: 0L), patternlength, pos)

public actual fun usetRetain(set: COpaquePointer?, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRetain((set?.value ?: 0L), start, end)
}

public actual fun usetRetainAll(set: COpaquePointer?, retain: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetRetainAll((set?.value ?: 0L), (retain?.value ?: 0L))
}

public actual fun usetSerialize(set: COpaquePointer?, dest: COpaquePointer?, destcapacity: Int, perrorcode: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSerialize((set?.value ?: 0L), (dest?.value ?: 0L), destcapacity, (perrorcode?.value ?: 0L))

public actual fun usetSerializedContains(set: COpaquePointer?, c: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSerializedContains((set?.value ?: 0L), c)

public actual fun usetSet(set: COpaquePointer?, start: Int, end: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSet((set?.value ?: 0L), start, end)
}

public actual fun usetSetSerializedToOne(fillset: COpaquePointer?, c: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSetSerializedToOne((fillset?.value ?: 0L), c)
}

public actual fun usetSize(set: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSize((set?.value ?: 0L))

public actual fun usetSpan(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSpan((set?.value ?: 0L), (s?.value ?: 0L), length, spancondition)

public actual fun usetSpanBack(set: COpaquePointer?, s: COpaquePointer?, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSpanBack((set?.value ?: 0L), (s?.value ?: 0L), length, spancondition)

public actual fun usetSpanBackUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSpanBackUtf8((set?.value ?: 0L), (s?.value ?: 0L), length, spancondition)

public actual fun usetSpanUtf8(set: COpaquePointer?, s: Pcstr, length: Int, spancondition: USetSpanCondition): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetSpanUtf8((set?.value ?: 0L), (s?.value ?: 0L), length, spancondition)

public actual fun usetToPattern(set: COpaquePointer?, result: COpaquePointer?, resultcapacity: Int, escapeunprintable: Byte, ec: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usetToPattern((set?.value ?: 0L), (result?.value ?: 0L), resultcapacity, escapeunprintable, (ec?.value ?: 0L))

public actual fun uspoofAreConfusable(sc: COpaquePointer?, id1: COpaquePointer?, length1: Int, id2: COpaquePointer?, length2: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofAreConfusable((sc?.value ?: 0L), (id1?.value ?: 0L), length1, (id2?.value ?: 0L), length2, (status?.value ?: 0L))

public actual fun uspoofAreConfusableUtf8(sc: COpaquePointer?, id1: Pcstr, length1: Int, id2: Pcstr, length2: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofAreConfusableUtf8((sc?.value ?: 0L), (id1?.value ?: 0L), length1, (id2?.value ?: 0L), length2, (status?.value ?: 0L))

public actual fun uspoofCheck(sc: COpaquePointer?, id: COpaquePointer?, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofCheck((sc?.value ?: 0L), (id?.value ?: 0L), length, (position?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofCheck2(sc: COpaquePointer?, id: COpaquePointer?, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofCheck2((sc?.value ?: 0L), (id?.value ?: 0L), length, (checkresult?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofCheck2Utf8(sc: COpaquePointer?, id: Pcstr, length: Int, checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofCheck2Utf8((sc?.value ?: 0L), (id?.value ?: 0L), length, (checkresult?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofCheckUtf8(sc: COpaquePointer?, id: Pcstr, length: Int, position: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofCheckUtf8((sc?.value ?: 0L), (id?.value ?: 0L), length, (position?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofClone(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofClone((sc?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofClose(sc: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofClose((sc?.value ?: 0L))
}

public actual fun uspoofCloseCheckResult(checkresult: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofCloseCheckResult((checkresult?.value ?: 0L))
}

public actual fun uspoofGetAllowedChars(sc: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetAllowedChars((sc?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofGetAllowedLocales(sc: COpaquePointer?, status: COpaquePointer?): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetAllowedLocales((sc?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofGetCheckResultChecks(checkresult: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetCheckResultChecks((checkresult?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofGetCheckResultNumerics(checkresult: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetCheckResultNumerics((checkresult?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofGetCheckResultRestrictionLevel(checkresult: COpaquePointer?, status: COpaquePointer?): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetCheckResultRestrictionLevel((checkresult?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofGetChecks(sc: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetChecks((sc?.value ?: 0L), (status?.value ?: 0L))

public actual fun uspoofGetInclusionSet(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetInclusionSet((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofGetRecommendedSet(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetRecommendedSet((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofGetRestrictionLevel(sc: COpaquePointer?): URestrictionLevel =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetRestrictionLevel((sc?.value ?: 0L))

public actual fun uspoofGetSkeleton(sc: COpaquePointer?, type: UInt, id: COpaquePointer?, length: Int, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetSkeleton((sc?.value ?: 0L), type.toInt(), (id?.value ?: 0L), length, (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun uspoofGetSkeletonUtf8(sc: COpaquePointer?, type: UInt, id: Pcstr, length: Int, dest: Pcstr, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofGetSkeletonUtf8((sc?.value ?: 0L), type.toInt(), (id?.value ?: 0L), length, (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun uspoofOpen(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofOpen((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofOpenCheckResult(status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofOpenCheckResult((status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofOpenFromSerialized(data: COpaquePointer?, length: Int, pactuallength: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofOpenFromSerialized((data?.value ?: 0L), length, (pactuallength?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofOpenFromSource(confusables: Pcstr, confusableslen: Int, confusableswholescript: Pcstr, confusableswholescriptlen: Int, errtype: COpaquePointer?, pe: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofOpenFromSource((confusables?.value ?: 0L), confusableslen, (confusableswholescript?.value ?: 0L), confusableswholescriptlen, (errtype?.value ?: 0L), (pe?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uspoofSerialize(sc: COpaquePointer?, data: COpaquePointer?, capacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofSerialize((sc?.value ?: 0L), (data?.value ?: 0L), capacity, (status?.value ?: 0L))

public actual fun uspoofSetAllowedChars(sc: COpaquePointer?, chars: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofSetAllowedChars((sc?.value ?: 0L), (chars?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uspoofSetAllowedLocales(sc: COpaquePointer?, localeslist: Pcstr, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofSetAllowedLocales((sc?.value ?: 0L), (localeslist?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun uspoofSetChecks(sc: COpaquePointer?, checks: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofSetChecks((sc?.value ?: 0L), checks, (status?.value ?: 0L))
}

public actual fun uspoofSetRestrictionLevel(sc: COpaquePointer?, restrictionlevel: URestrictionLevel) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_uspoofSetRestrictionLevel((sc?.value ?: 0L), restrictionlevel)
}

public actual fun usprepClose(profile: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprepClose((profile?.value ?: 0L))
}

public actual fun usprepOpen(path: Pcstr, filename: Pcstr, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprepOpen((path?.value ?: 0L), (filename?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usprepOpenByType(type: UStringPrepProfileType, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprepOpenByType(type, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun usprepPrepare(prep: COpaquePointer?, src: COpaquePointer?, srclength: Int, dest: COpaquePointer?, destcapacity: Int, options: Int, parseerror: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_usprepPrepare((prep?.value ?: 0L), (src?.value ?: 0L), srclength, (dest?.value ?: 0L), destcapacity, options, (parseerror?.value ?: 0L), (status?.value ?: 0L))

public actual fun utextChar32At(ut: COpaquePointer?, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextChar32At((ut?.value ?: 0L), nativeindex)

public actual fun utextClone(dest: COpaquePointer?, src: COpaquePointer?, deep: Byte, readonly: Byte, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextClone((dest?.value ?: 0L), (src?.value ?: 0L), deep, readonly, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utextClose(ut: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextClose((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utextCopy(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, destindex: Long, move: Byte, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextCopy((ut?.value ?: 0L), nativestart, nativelimit, destindex, move, (status?.value ?: 0L))
}

public actual fun utextCurrent32(ut: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextCurrent32((ut?.value ?: 0L))

public actual fun utextEquals(a: COpaquePointer?, b: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextEquals((a?.value ?: 0L), (b?.value ?: 0L))

public actual fun utextExtract(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, dest: COpaquePointer?, destcapacity: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextExtract((ut?.value ?: 0L), nativestart, nativelimit, (dest?.value ?: 0L), destcapacity, (status?.value ?: 0L))

public actual fun utextFreeze(ut: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextFreeze((ut?.value ?: 0L))
}

public actual fun utextGetNativeIndex(ut: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextGetNativeIndex((ut?.value ?: 0L))

public actual fun utextGetPreviousNativeIndex(ut: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextGetPreviousNativeIndex((ut?.value ?: 0L))

public actual fun utextHasMetaData(ut: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextHasMetaData((ut?.value ?: 0L))

public actual fun utextIsLengthExpensive(ut: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextIsLengthExpensive((ut?.value ?: 0L))

public actual fun utextIsWritable(ut: COpaquePointer?): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextIsWritable((ut?.value ?: 0L))

public actual fun utextMoveIndex32(ut: COpaquePointer?, delta: Int): Byte =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextMoveIndex32((ut?.value ?: 0L), delta)

public actual fun utextNativeLength(ut: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextNativeLength((ut?.value ?: 0L))

public actual fun utextNext32(ut: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextNext32((ut?.value ?: 0L))

public actual fun utextNext32From(ut: COpaquePointer?, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextNext32From((ut?.value ?: 0L), nativeindex)

public actual fun utextOpenUchars(ut: COpaquePointer?, s: COpaquePointer?, length: Long, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextOpenUchars((ut?.value ?: 0L), (s?.value ?: 0L), length, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utextOpenUtf8(ut: COpaquePointer?, s: Pcstr, length: Long, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextOpenUtf8((ut?.value ?: 0L), (s?.value ?: 0L), length, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utextPrevious32(ut: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextPrevious32((ut?.value ?: 0L))

public actual fun utextPrevious32From(ut: COpaquePointer?, nativeindex: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextPrevious32From((ut?.value ?: 0L), nativeindex)

public actual fun utextReplace(ut: COpaquePointer?, nativestart: Long, nativelimit: Long, replacementtext: COpaquePointer?, replacementlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextReplace((ut?.value ?: 0L), nativestart, nativelimit, (replacementtext?.value ?: 0L), replacementlength, (status?.value ?: 0L))

public actual fun utextSetNativeIndex(ut: COpaquePointer?, nativeindex: Long) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextSetNativeIndex((ut?.value ?: 0L), nativeindex)
}

public actual fun utextSetup(ut: COpaquePointer?, extraspace: Int, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utextSetup((ut?.value ?: 0L), extraspace, (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utf8AppendCharSafeBody(s: COpaquePointer?, i: Int, length: Int, c: Int, piserror: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8AppendCharSafeBody((s?.value ?: 0L), i, length, c, (piserror?.value ?: 0L))

public actual fun utf8Back1SafeBody(s: COpaquePointer?, start: Int, i: Int): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8Back1SafeBody((s?.value ?: 0L), start, i)

public actual fun utf8NextCharSafeBody(s: COpaquePointer?, pi: COpaquePointer?, length: Int, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8NextCharSafeBody((s?.value ?: 0L), (pi?.value ?: 0L), length, c, strict)

public actual fun utf8PrevCharSafeBody(s: COpaquePointer?, start: Int, pi: COpaquePointer?, c: Int, strict: Byte): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utf8PrevCharSafeBody((s?.value ?: 0L), start, (pi?.value ?: 0L), c, strict)

public actual fun utmscaleFromInt64(othertime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscaleFromInt64(othertime, timescale, (status?.value ?: 0L))

public actual fun utmscaleGetTimeScaleValue(timescale: UDateTimeScale, value: UTimeScaleValue, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscaleGetTimeScaleValue(timescale, value, (status?.value ?: 0L))

public actual fun utmscaleToInt64(universaltime: Long, timescale: UDateTimeScale, status: COpaquePointer?): Long =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utmscaleToInt64(universaltime, timescale, (status?.value ?: 0L))

public actual fun utraceFormat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceFormat((outbuf?.value ?: 0L), capacity, indent, (fmt?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun utraceFunctionName(fnnumber: Int): Pcstr =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceFunctionName(fnnumber).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utraceGetFunctions(context: COpaquePointer?, e: COpaquePointer?, x: COpaquePointer?, d: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceGetFunctions((context?.value ?: 0L), (e?.value ?: 0L), (x?.value ?: 0L), (d?.value ?: 0L))
}

public actual fun utraceGetLevel(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceGetLevel()

public actual fun utraceSetFunctions(context: COpaquePointer?, e: UTraceEntry, x: UTraceExit, d: UTraceData) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceSetFunctions((context?.value ?: 0L), 0L, 0L, 0L)
}

public actual fun utraceSetLevel(tracelevel: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceSetLevel(tracelevel)
}

public actual fun utraceVformat(outbuf: Pcstr, capacity: Int, indent: Int, fmt: Pcstr, args: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utraceVformat((outbuf?.value ?: 0L), capacity, indent, (fmt?.value ?: 0L), (args?.value ?: 0L))

public actual fun utransClone(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransClone((trans?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransClose(trans: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransClose((trans?.value ?: 0L))
}

public actual fun utransCountAvailableIds(): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransCountAvailableIds()

public actual fun utransGetSourceSet(trans: COpaquePointer?, ignorefilter: Byte, fillin: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransGetSourceSet((trans?.value ?: 0L), ignorefilter, (fillin?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransGetUnicodeId(trans: COpaquePointer?, resultlength: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransGetUnicodeId((trans?.value ?: 0L), (resultlength?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransOpenIds(perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransOpenIds((perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransOpenInverse(trans: COpaquePointer?, status: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransOpenInverse((trans?.value ?: 0L), (status?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransOpenU(id: COpaquePointer?, idlength: Int, dir: UTransDirection, rules: COpaquePointer?, ruleslength: Int, parseerror: COpaquePointer?, perrorcode: COpaquePointer?): COpaquePointer? =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransOpenU((id?.value ?: 0L), idlength, dir, (rules?.value ?: 0L), ruleslength, (parseerror?.value ?: 0L), (perrorcode?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utransRegister(adoptedtrans: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransRegister((adoptedtrans?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun utransSetFilter(trans: COpaquePointer?, filterpattern: COpaquePointer?, filterpatternlen: Int, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransSetFilter((trans?.value ?: 0L), (filterpattern?.value ?: 0L), filterpatternlen, (status?.value ?: 0L))
}

public actual fun utransToRules(trans: COpaquePointer?, escapeunprintable: Byte, result: COpaquePointer?, resultlength: Int, status: COpaquePointer?): Int =
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransToRules((trans?.value ?: 0L), escapeunprintable, (result?.value ?: 0L), resultlength, (status?.value ?: 0L))

public actual fun utransTrans(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransTrans((trans?.value ?: 0L), (rep?.value ?: 0L), (repfunc?.value ?: 0L), start, (limit?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun utransTransIncremental(trans: COpaquePointer?, rep: COpaquePointer?, repfunc: COpaquePointer?, pos: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransTransIncremental((trans?.value ?: 0L), (rep?.value ?: 0L), (repfunc?.value ?: 0L), (pos?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun utransTransIncrementalUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, pos: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransTransIncrementalUchars((trans?.value ?: 0L), (text?.value ?: 0L), (textlength?.value ?: 0L), textcapacity, (pos?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun utransTransUchars(trans: COpaquePointer?, text: COpaquePointer?, textlength: COpaquePointer?, textcapacity: Int, start: Int, limit: COpaquePointer?, status: COpaquePointer?) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransTransUchars((trans?.value ?: 0L), (text?.value ?: 0L), (textlength?.value ?: 0L), textcapacity, start, (limit?.value ?: 0L), (status?.value ?: 0L))
}

public actual fun utransUnregisterId(id: COpaquePointer?, idlength: Int) {
    WindowsWin32GlobalizationJniBridge.windowssys_windows_win32_globalization_utransUnregisterId((id?.value ?: 0L), idlength)
}
